package services

import play.modules.reactivemongo.ReactiveMongoPlugin
import play.modules.reactivemongo.json.collection.JSONCollection
import play.modules.reactivemongo.json.BSONFormats._
import play.api.Play.current
import models._
import models.Employee._
import scala.concurrent.Future
import play.api.libs.concurrent.Execution.Implicits._
import play.api.libs.json.Json
import reactivemongo.api.QueryOpts
import reactivemongo.core.commands.Count
import reactivemongo.bson.BSONObjectID

object EmployeeDao {

  private def collection = ReactiveMongoPlugin.db.collection[JSONCollection]("employees")

  def save(employee: Employee): Future[Employee] = {
    println(employee)
    collection.save(employee).map {
      case ok if ok.ok =>
        employee
      case error => throw new RuntimeException(error.message)
    }
  }

  def findAll(): Future[Seq[Employee]] = {
    collection.find(Json.obj())
      .sort(Json.obj("_id" -> -1))
      .cursor[Employee]
      .collect[Seq]()
  }

  def findById(id: BSONObjectID): Future[Option[Employee]] = {
    collection.find(Json.obj("_id" -> id))
    .one[Employee]
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
