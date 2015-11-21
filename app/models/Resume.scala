package models

import play.api.libs.json.Json
import reactivemongo.bson.BSONObjectID
import play.modules.reactivemongo.json.BSONFormats._

case class Resume(
  _id: BSONObjectID,
  creator_id: BSONObjectID,
  name: String,
  description: String,
  skills: String,
  experience: String,
  education: String,
  salary: String)

object Resume {
  implicit val resumeFormat = Json.format[Resume]
}