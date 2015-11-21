package services

import play.modules.reactivemongo.ReactiveMongoPlugin
import play.modules.reactivemongo.json.collection.JSONCollection
import play.modules.reactivemongo.json.BSONFormats._
import play.api.Play.current
import models._
import models.Resume._
import scala.concurrent.Future
import play.api.libs.concurrent.Execution.Implicits._
import play.api.libs.json.Json
import reactivemongo.api.QueryOpts
import reactivemongo.core.commands.Count
import reactivemongo.bson.BSONObjectID

object ResumeDao {

  private def collection = ReactiveMongoPlugin.db.collection[JSONCollection]("resumes")

  def save(resume: Resume): Future[Resume] = {
    println(resume)
    collection.save(resume).map {
      case ok if ok.ok =>
        resume
      case error => throw new RuntimeException(error.message)
    }
  }

  def findAll(): Future[Seq[Resume]] = {
    collection.find(Json.obj())
      .sort(Json.obj("_id" -> -1))
      .cursor[Resume]
      .collect[Seq]()
  }

  def findById(id: BSONObjectID): Future[Option[Resume]] = {
    collection.find(Json.obj("_id" -> id))
    .one[Resume]
  }


  def findByCreatorId(id: BSONObjectID): Future[Seq[Resume]] = {
    collection.find(Json.obj("creator_id" -> id))
      .sort(Json.obj("_id" -> -1))
      .cursor[Resume]
      .collect[Seq]()
  }

  def deleteById(id: BSONObjectID):  Future[BSONObjectID] = {
    collection.remove(Json.obj("_id" -> id)).map {
      case ok if ok.ok =>
        id
      case error => throw new RuntimeException(error.message)
    }
  }

  def count: Future[Int] = {
    ReactiveMongoPlugin.db.command(Count(collection.name))
  }

}
