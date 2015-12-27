package controllers

import play.api.mvc._
import play.api.libs.json._
import play.api.libs.concurrent.Execution.Implicits._
import models._
import services.PositionDao
import reactivemongo.bson.BSONObjectID
import scala.concurrent.Future

object PositionController extends Controller {
  //TODO try this
  /*
    implicit val locationWrites: Writes[Location] = (
    (JsPath \ "lat").write[Double] and
    (JsPath \ "long").write[Double]
    )(unlift(Location.unapply))
  */
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

  case class NewPositionForm(
    creator_id: String,
    name: String,
    description: String,
    requirements: String,
    location: String) {
    def toPosition: Position = Position(BSONObjectID.generate, new BSONObjectID(creator_id), name, description,
      requirements, location, Nil)
  }

  case class EditPositionForm(
    id: String,
    creator_id: String,
    name: String,
    description: String,
    requirements: String,
    location: String,
    resumes: List[String]) {
    def toPosition: Position = Position(new BSONObjectID(id), new BSONObjectID(creator_id), name, description,
      requirements, location, resumes)
  }

  implicit val newPositionFormFormat = Json.format[NewPositionForm]
  implicit val editPositionFormFormat = Json.format[EditPositionForm]

  def getPositions() = Action.async { implicit req =>
    for {
      positions <- PositionDao.findAll()
    } yield {
      Ok(Json.obj("positions" -> Json.toJson(positions), "error_code" -> 0))
    }
  }

  def deleteById() = Action.async(parse.json) { implicit req =>
    (req.body \ "id").asOpt[String].map { id =>
      for{
        id <- PositionDao.deleteById(new BSONObjectID(id.toString))
        } yield {
          println(id)
          Ok(Json.obj("error_code" -> 0))
        }
    }.getOrElse(Future.successful(BadRequest(Json.obj("error_code" -> 8))))
  }

  def getPosition() = Action.async(parse.json) { implicit req =>
    (req.body \ "id").asOpt[String].map { id =>
      for {
        position <- PositionDao.findById(new BSONObjectID(id.toString))
      } yield {
        Ok(Json.obj("position" -> Json.toJson(position), "error_code" -> 0))
      }
    }.getOrElse(Future.successful(BadRequest(Json.obj("error_code" -> 8))))
  }

  def seachPositions() = Action.async(parse.json) { implicit req =>
    (req.body \ "query").asOpt[String].map { query =>
      for{
        positionList <- PositionDao.seachAll(query)
      } yield {
        println(positionList)
        Ok(Json.obj("positions" -> Json.toJson(positionList),
          "error_code" -> 0))
      }
    }.getOrElse(Future.successful(BadRequest("invalid json")))
  }

  def savePosition = Action.async(parse.json) { req =>
    println(req.body)
    Json.fromJson[NewPositionForm](req.body).fold(
      invalid => Future.successful(BadRequest(Json.obj("error_code" -> 8))),
      form => PositionDao.save(form.toPosition).map(_ => Ok(Json.obj("error_code" -> 0)))
    )
  }

  def updatePosition = Action.async(parse.json) { req =>
    println("updatePosition!!!")
    println(req.body)
    Json.fromJson[EditPositionForm](req.body).fold(
      invalid => Future.successful(BadRequest(Json.obj("error_code" -> 0))),
      form => PositionDao.save(form.toPosition).map(_ => Ok(Json.obj("error_code" -> 0)))
    )
  }
}
