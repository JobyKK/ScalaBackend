package controllers

import play.api.mvc._
import play.api.libs.json._
import play.api.libs.concurrent.Execution.Implicits._
import models._
import services.EmployerDao
import services.PositionDao
import reactivemongo.bson.BSONObjectID
import scala.concurrent.Future

import play.modules.reactivemongo.json._, ImplicitBSONHandlers._
import reactivemongo.bson._


object EmployerController extends Controller {

  implicit val positionWrites = new Writes[Position] {
    def writes(p: Position): JsValue = {
      Json.obj(
        "id" -> p._id.stringify,
        "creator_id" -> p.creator_id.stringify,
        "name" -> p.name,
        "description" -> p.description,
        "requirements" -> p.requirements,
        "location" -> p.location,
        "resumes" -> p.resumes
      )
    }
  }

  implicit val employerWrites = new Writes[Employer] {
    def writes(e: Employer): JsValue = {
      Json.obj(
        "id" -> e._id.stringify,
        "name" -> e.name,
        "category" -> e.category,
        "email" -> e.email,
        "phone" -> e.phone,
        "website" -> e.website
      )
    }
  }

  case class NewEmployerForm(
    name: String,
    category: String,
    email: String,
    phone: String, 
    website: String) {
    def toEmployer: Employer = Employer(BSONObjectID.generate, name, category, email, phone, website)
  }

  case class EditEmployerForm(
    id: String,
    name: String,
    category: String,
    email: String,
    phone: String,
    website: String) {
    def toEmployer: Employer = Employer(new BSONObjectID(id), name, category, email, phone, website)
  }

  implicit val newEmployerFormFormat = Json.format[NewEmployerForm]
  implicit val editEmployerFormFormat = Json.format[EditEmployerForm]

  def getEmployers() = Action.async { implicit req =>
    for {
      employers <- EmployerDao.findAll()
    } yield {
      println(employers)
      Ok(Json.obj("employers" -> Json.toJson(employers), "error_code" -> 0))
    }
  }

  def deleteById() = Action.async(parse.json) { implicit req =>
    (req.body \ "id").asOpt[String].map { id => 
      for{
        id <- EmployerDao.deleteById(new BSONObjectID(id.toString))
        } yield {
          println(id)
          Ok(Json.obj("error_code" -> 0))
        }
    }.getOrElse(Future.successful(BadRequest(Json.obj("error_code" -> 8))))
  }

  def getById() = Action.async(parse.json) { implicit req =>
    (req.body \ "id").asOpt[String].map { id =>
      println("getById " + id)
      for {
        employer <- EmployerDao.findById(new BSONObjectID(id.toString))
      } yield {
        println(employer)
        Ok(Json.obj("profile" -> Json.toJson(employer), "error_code" -> 0))
      }
    }.getOrElse(Future.successful(BadRequest(Json.obj("error_code" -> 8))))
  }

  def getByEmail() = Action.async(parse.json) { implicit req =>
    (req.body \ "email").asOpt[String].map { email =>
      for {
        employer <- EmployerDao.findByEmail(email)
      } yield {
        println(employer)
        Ok(Json.obj("profile" -> Json.toJson(employer), "error_code" -> 0))
      }
    }.getOrElse(Future.successful(BadRequest(Json.obj("error_code" -> 8))))
  }


  def saveEmployer = Action.async(parse.json) { req =>
    println(req.body)
    Json.fromJson[NewEmployerForm](req.body).fold(
      invalid => Future.successful(BadRequest(Json.obj("error_code" -> 8))),
      form => EmployerDao.save(form.toEmployer).map(employer => 
        Ok(Json.obj("error_code" -> 0, "id" -> employer._id.stringify)))
    )
  }

  def updateEmployer = Action.async(parse.json) { req =>
    println(req.body)
    Json.fromJson[EditEmployerForm](req.body).fold(
      invalid => Future.successful(BadRequest(Json.obj("error_code" -> 8))),
      form => EmployerDao.save(form.toEmployer).map(_ => Ok(Json.obj("error_code" -> 0)))
    )
  }

  def getPositions() = Action.async(parse.json) { implicit req =>
    (req.body \ "id").asOpt[String].map { id => 
      for{
        positionList <- PositionDao.findByCreatorId(new BSONObjectID(id.toString))
      } yield {
        println(positionList)
        Ok(Json.obj("positions" -> Json.toJson(positionList),
          "error_code" -> 0))
      }
    }.getOrElse(Future.successful(BadRequest("invalid json")))
  }

}