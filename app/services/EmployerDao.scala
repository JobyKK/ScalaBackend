package services

import play.modules.reactivemongo.ReactiveMongoPlugin
import play.modules.reactivemongo.json.collection.JSONCollection
import play.modules.reactivemongo.json.BSONFormats._
import play.api.Play.current
import models._
import models.Employer._
import scala.concurrent.Future
import play.api.libs.concurrent.Execution.Implicits._
import play.api.libs.json.Json
import reactivemongo.api.QueryOpts
import reactivemongo.core.commands.Count
import reactivemongo.bson.BSONObjectID

object EmployerDao {

  private def collection = ReactiveMongoPlugin.db.collection[JSONCollection]("employers")

  def save(employer: Employer): Future[Employer] = {
    println(employer)
    collection.save(employer).map {
      case ok if ok.ok =>
        employer
      case error => throw new RuntimeException(error.message)
    }
  }

  def findAll(): Future[Seq[Employer]] = {
    collection.find(Json.obj())
      .sort(Json.obj("_id" -> -1))
      .cursor[Employer]
      .collect[Seq]()
  }

  def findById(id: BSONObjectID): Future[Option[Employer]] = {
    collection.find(Json.obj("_id" -> id))
    .one[Employer]
  }

  def findByEmail(email: String): Future[Option[Employer]] = {
    collection.find(Json.obj("email" -> email))
    .one[Employer]
  }

  def deleteById(id: BSONObjectID): Future[BSONObjectID] = {
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
