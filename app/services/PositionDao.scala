package services

import play.modules.reactivemongo.ReactiveMongoPlugin
import play.modules.reactivemongo.json.collection.JSONCollection
import play.modules.reactivemongo.json.BSONFormats._
import play.api.Play.current
import models._
import scala.concurrent.Future
import play.api.libs.concurrent.Execution.Implicits._
import play.api.libs.json.Json
import reactivemongo.api.QueryOpts
import reactivemongo.core.commands.Count
import reactivemongo.bson.BSONObjectID

object PositionDao {

  private def collection = ReactiveMongoPlugin.db.collection[JSONCollection]("positions")

  def save(position: Position): Future[Position] = {
    println(position)
    collection.save(position).map {
      case ok if ok.ok =>
        position
      case error => throw new RuntimeException(error.message)
    }
  }

  def findAll(): Future[Seq[Position]] = {
    collection.find(Json.obj())
      .sort(Json.obj("_id" -> -1))
      .cursor[Position]
      .collect[Seq]()
  }

  def findById(id: BSONObjectID): Future[Option[Position]] = {
    collection.find(Json.obj("_id" -> id))
    .one[Position]
  }


  def findByCreatorId(id: BSONObjectID): Future[Seq[Position]] = {
    collection.find(Json.obj("creator_id" -> id))
      .sort(Json.obj("_id" -> -1))
      .cursor[Position]
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
