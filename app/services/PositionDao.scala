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
import reactivemongo.bson._
import reactivemongo.core.commands.RawCommand

object PositionDao {

  implicit object positionReader extends BSONDocumentReader[Position] {
    def read(doc: BSONDocument): Position = {
      Position(
        doc.getAs[BSONObjectID]("_id").get,
        doc.getAs[BSONObjectID]("creator_id").get,
        doc.getAs[String]("name").get,
        doc.getAs[String]("description").get,
        doc.getAs[String]("requirements").get,
        doc.getAs[String]("location").get,
        doc.getAs[List[String]]("resumes").get)
    }
  }

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

  def seachAll(query: String): Future[Seq[Position]] = {
    val commandDoc = BSONDocument("text" -> "positions", "search" -> query)
    // println(BSONDocument.pretty(commandDoc))
    val futureResult = ReactiveMongoPlugin.db.command(RawCommand(commandDoc))

    futureResult.map { result =>
      result.getAs[BSONArray]("results").map{values =>
        println(BSONArray.pretty(values))
        values.values.toSeq.flatMap{case value =>
          value match {
            case v: BSONDocument => v.getAs[Position]("obj")
            case _ => None
          }
        }
      }.getOrElse(Seq.empty[Position])
    }
  }
  // // collection.find(Json.obj())
  // //   .sort(Json.obj("_id" -> -1))
  // //   .cursor[Position]
  // //   .collect[Seq]()

  def count: Future[Int] = {
    ReactiveMongoPlugin.db.command(Count(collection.name))
  }

}
