package controllers

import play.api.mvc._
import play.api.libs.json._
import play.api.libs.concurrent.Execution.Implicits._
import models._
import services.ResumeDao
import reactivemongo.bson.BSONObjectID
import scala.concurrent.Future

object ResumeController extends Controller {
  //TODO try this
  /*
    implicit val locationWrites: Writes[Location] = (
    (JsPath \ "lat").write[Double] and
    (JsPath \ "long").write[Double]
    )(unlift(Location.unapply))
  */
  implicit val resumeWrites = new Writes[Resume] {
    def writes(r: Resume): JsValue = {
      Json.obj(
        "id" -> r._id.stringify,
        "creator_id" -> r.creator_id.stringify,
        "name" -> r.name,
        "description" -> r.description,
        "skills" -> r.skills,
        "experience" -> r.experience,
        "education" -> r.education,
        "salary" -> r.salary
      )
    }
  }

  case class NewResumeForm(creator_id: String, name: String, description: String,
    skills: String, experience: String, education: String, salary: String) {
    def toResume: Resume = Resume(BSONObjectID.generate, new BSONObjectID(creator_id), name, description, 
      skills, experience, education, salary)
  }

  case class EditResumeForm(id: String, creator_id: String, name: String, description: String,
    skills: String, experience: String, education: String, salary: String) {
    def toResume: Resume = Resume(new BSONObjectID(id),  new BSONObjectID(creator_id), name, description, 
      skills, experience, education, salary)
  }

  implicit val newResumeFormFormat = Json.format[NewResumeForm]
  implicit val editResumeFormFormat = Json.format[EditResumeForm]

  def getResumes() = Action.async { implicit req =>
    for {
      resumes <- ResumeDao.findAll()
    } yield {
      println(resumes)
      Ok(Json.obj("resumes" -> Json.toJson(resumes), "error_code" -> 0))
    }
  }

  def deleteById() = Action.async(parse.json) { implicit req =>
    (req.body \ "id").asOpt[String].map { id => 
      for{
        id <- ResumeDao.deleteById(new BSONObjectID(id.toString))
        } yield {
          println(id)
          Ok(Json.obj("error_code" -> 0))
        }
    }.getOrElse(Future.successful(BadRequest(Json.obj("error_code" -> 8))))
  }

  def getResume() = Action.async(parse.json) { implicit req =>
    (req.body \ "id").asOpt[String].map { id =>
      for {
        resume <- ResumeDao.findById(new BSONObjectID(id.toString))
      } yield {
        println(resume)
        Ok(Json.obj("resume" -> Json.toJson(resume), "error_code" -> 0))
      }
    }.getOrElse(Future.successful(BadRequest(Json.obj("error_code" -> 8))))
  }

  def saveResume = Action.async(parse.json) { req =>
    println(req.body)
    Json.fromJson[NewResumeForm](req.body).fold(
      invalid => Future.successful(BadRequest(Json.obj("error_code" -> 8))),
      form => ResumeDao.save(form.toResume).map(_ => Ok(Json.obj("error_code" -> 0)))
    )
  }

  def updateResume = Action.async(parse.json) { req =>
    println("updateResume!!!")
    println(req.body)
    Json.fromJson[EditResumeForm](req.body).fold(
      invalid => Future.successful(BadRequest(Json.obj("error_code" -> 8))),
      form => ResumeDao.save(form.toResume).map(_ => Ok(Json.obj("error_code" -> 0)))
    )
  }

/*
        println("newResume!!!!")
        println(request.body)
        //println(request.body)
        /*val resumeOpt = request.body.validate(resumeReads).asOpt
        // if no error, then insert the article into the 'articles' collection
        println(resumeOpt)
        val resume = resumeOpt.get
        println(resume)

        val resumeJson = Json.toJson(resume)
        println(resumeJson)
        val resumeCopy = resume.copy(
            id = resume.id.orElse(Some(UUID.randomUUID().toString))
          )
        println(resumeCopy)*/
        collection.insert(Json.obj("lol" -> "asdasd")).map(_ => Ok)*/
    /*def updateResume = Action.async(parse.json) {implicit request =>

        val id = (request.body \ "id").asOpt[String]

          println(request.body)
          val message = "Hello " + "editResume - " + id.toString
          

          val query = Json.obj()

          val cursor = collection.find(query).cursor[JsObject]
          val futureList: Future[List[JsObject]] = cursor.collect[List]()

          futureList.map { list =>
              list.foreach { doc =>
                println(s"found document: ${doc}")
              }
              Ok(Json.obj(
                "error_code" -> 0,
                "message" -> message,
                "id" -> id.toString,
                "resumes" -> list
              ))
            }          
    }   */

}