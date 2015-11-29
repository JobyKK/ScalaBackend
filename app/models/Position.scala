package models

import play.api.libs.json._
import reactivemongo.bson.BSONObjectID
import play.modules.reactivemongo.json.BSONFormats._


case class Position(
  _id: BSONObjectID,
  creator_id: BSONObjectID,
  name: String,
  description: String,
  requirements: String,
  location: String,
  resumes: List[String])

object Position {
  implicit val resumeFormat = Json.format[Position]

}
