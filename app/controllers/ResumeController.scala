package controllers

import play.api.mvc._
import play.api.libs.json.Json
import play.api.libs.concurrent.Execution.Implicits._
import models._
import services.ResumeDao
import reactivemongo.bson.BSONObjectID
import scala.concurrent.Future

object ResumeController extends Controller {

  def getResumes() = Action.async { implicit req =>
    for {
      resumes <- ResumeDao.findAll()
    } yield {
      println(resumes)
      Ok(Json.toJson(resumes))
    }
  }

  def deleteById() = Action.async(parse.json) { implicit req =>
    (req.body \ "id").asOpt[String].map { id => 
      for{
        id <- ResumeDao.deleteById(new BSONObjectID(id.toString))
        } yield {
          println(id)
          Ok("Delete!!!")
        }
    }.getOrElse(Future.successful(BadRequest("invalid json")))
  }

  def getResume() = Action.async(parse.json) { implicit req =>
    (req.body \ "id").asOpt[String].map { id =>
      for {
        resumes <- ResumeDao.findById(new BSONObjectID(id.toString))
      } yield {
        println(resumes)
        Ok(Json.toJson(resumes))
      }
    }.getOrElse(Future.successful(BadRequest("invalid json")))
  }

  case class ResumeForm(name: String, description: String,
    skills: String, experience: String, education: String, salary: String) {
    def toResume: Resume = Resume(BSONObjectID.generate, name, description, 
      skills, experience, education, salary)
  }

  implicit val resumeFormFormat = Json.format[ResumeForm]

  def saveResume = Action.async(parse.json) { req =>
    println(req.body)
    Json.fromJson[ResumeForm](req.body).fold(
      invalid => Future.successful(BadRequest("Bad resume form")),
      form => ResumeDao.save(form.toResume).map(_ => Created)
    )
  }

def resumes = Action(parse.json) { request =>
        (request.body \ "id").asOpt[String].map { id =>
          println(id)
            println(request.body)
            /*val message = "Hello " + "editResume - " + id.toString
            Ok(Json.obj(
              "error_code" -> 0,
              "message" -> message,
              "id" -> id.toString
            ))*/
            Ok("resumes - " + id)
        }.getOrElse {
            BadRequest("Missing parameter [name]")
        }
    }

    def resume = Action(parse.json) { request =>
        (request.body \ "id").asOpt[String].map { id =>
          println(id)
            Ok("Hello " + "resume - " + id)
        }.getOrElse {
            BadRequest("Missing parameter [name]")
        }
    }

    def newResume = Action(parse.json) { implicit request =>
       (request.body \ "id").asOpt[String].map { id =>
          println(id)
            Ok("Hello " + "delete resume - " + id)
        }.getOrElse {
            BadRequest("Missing parameter [name]")
        }
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

def updateResume = Action(parse.json) { request =>
        (request.body \ "id").asOpt[String].map { id =>
          println(id)
            Ok("Hello " + "delete resume - " + id)
        }.getOrElse {
            BadRequest("Missing parameter [name]")
        }
    }

    def deleteResume = Action(parse.json) { request =>
        (request.body \ "id").asOpt[String].map { id =>
          println(id)
            Ok("Hello " + "delete resume - " + id)
        }.getOrElse {
            BadRequest("Missing parameter [name]")
        }
    }


    //profile
    def profile = Action(parse.json) { request =>
        (request.body \ "name").asOpt[String].map { name =>
          println(name)
            Ok("Hello " + "profile - " + name)
        }.getOrElse {
            BadRequest("Missing parameter [name]")
        }
    }   

    def updateProfile = Action(parse.json) { request =>
        (request.body \ "name").asOpt[String].map { name =>
          println(name)
            Ok("Hello " + "updateProfile " + name)
        }.getOrElse {
            BadRequest("Missing parameter [name]")
        }
    }

    def deleteCustomer = Action(parse.json) { request =>
        (request.body \ "name").asOpt[String].map { name =>
          println(name)
            Ok("Hello " + "deleteCustomer" + name)
        }.getOrElse {
            BadRequest("Missing parameter [name]")
        }
    }  


}