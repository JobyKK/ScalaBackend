package models

import play.api.libs.json.Json
import reactivemongo.bson.BSONObjectID
import play.modules.reactivemongo.json.BSONFormats._

import play.modules.reactivemongo.json._, ImplicitBSONHandlers._
import reactivemongo.bson._
import play.modules.reactivemongo.json.BSONFormats._

case class Employee(
  _id: BSONObjectID,
  name: String,
  category: String,
  status: String,
  email: String,
  phone: String)

object Employee {
  implicit val employeeFormat = Json.format[Employee]
}