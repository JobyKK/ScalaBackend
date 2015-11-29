package models

import play.api.libs.json.Json
import reactivemongo.bson.BSONObjectID
import play.modules.reactivemongo.json.BSONFormats._

import play.modules.reactivemongo.json._, ImplicitBSONHandlers._
import reactivemongo.bson._
import play.modules.reactivemongo.json.BSONFormats._

case class Employer(
  _id: BSONObjectID,
  name: String,
  category: String,
  email: String,
  phone: String,
  website: String)

object Employer {
  implicit val employeeFormat = Json.format[Employer]
}