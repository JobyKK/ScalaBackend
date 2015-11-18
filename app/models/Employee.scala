package models

import play.api.libs.json.Json
import reactivemongo.bson.BSONObjectID
import play.modules.reactivemongo.json.BSONFormats._

case class Employee(
  _id: BSONObjectID,
  name: String,
  category: String,
  status: String,
  email: String,
  phone: String,
  resumes: List[BSONObjectID])

object Employee {
  implicit val employeeFormat = Json.format[Employee]
}