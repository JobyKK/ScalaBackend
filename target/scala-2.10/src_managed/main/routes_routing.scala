// @SOURCE:/home/joby/Prog/Scala/play-mongo-knockout/conf/routes
// @HASH:3ddf8b041f5a9c397f00f28c31c0c68296e452d5
// @DATE:Fri Nov 13 00:37:02 EET 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:5
private[this] lazy val controllers_MainController_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:6
private[this] lazy val controllers_MainController_events1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("events"))))
        

// @LINE:8
private[this] lazy val controllers_MessageController_getMessages2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("message"))))
        

// @LINE:9
private[this] lazy val controllers_MessageController_saveMessage3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("message"))))
        

// @LINE:12
private[this] lazy val controllers_WebJarAssets_requirejs4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("lib/require.js"))))
        

// @LINE:13
private[this] lazy val controllers_WebJarAssets_at5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
        

// @LINE:14
private[this] lazy val controllers_Assets_at6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:15
private[this] lazy val controllers_MainController_router7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("routes.js"))))
        

// @LINE:18
private[this] lazy val controllers_MainController_index8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("path", """.+""",false))))
        

// @LINE:22
private[this] lazy val controllers_ResumeController_getResumes9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resumes"))))
        

// @LINE:23
private[this] lazy val controllers_ResumeController_saveResume10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/newResume"))))
        

// @LINE:24
private[this] lazy val controllers_ResumeController_getResume11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getResume"))))
        

// @LINE:26
private[this] lazy val controllers_ResumeController_deleteById12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteByIdResume"))))
        

// @LINE:29
private[this] lazy val controllers_ResumeController_resumes13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/resumes"))))
        

// @LINE:30
private[this] lazy val controllers_ResumeController_resume14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/resume"))))
        

// @LINE:32
private[this] lazy val controllers_ResumeController_updateResume15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/updateResume"))))
        

// @LINE:33
private[this] lazy val controllers_ResumeController_deleteResume16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/deleteResume"))))
        

// @LINE:35
private[this] lazy val controllers_ResumeController_profile17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/profile"))))
        

// @LINE:36
private[this] lazy val controllers_ResumeController_updateProfile18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/updateProfile"))))
        

// @LINE:37
private[this] lazy val controllers_ResumeController_deleteCustomer19 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/deleteCustomer"))))
        
def documentation = List(("""GET""", prefix,"""controllers.MainController.index(path:String = "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """events""","""controllers.MainController.events"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """message""","""controllers.MessageController.getMessages(page:Int ?= 0, perPage:Int ?= 10)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """message""","""controllers.MessageController.saveMessage"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """lib/require.js""","""controllers.WebJarAssets.requirejs"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """routes.js""","""controllers.MainController.router"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$path<.+>""","""controllers.MainController.index(path:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resumes""","""controllers.ResumeController.getResumes"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/newResume""","""controllers.ResumeController.saveResume"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getResume""","""controllers.ResumeController.getResume"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteByIdResume""","""controllers.ResumeController.deleteById"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/resumes""","""controllers.ResumeController.resumes"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/resume""","""controllers.ResumeController.resume"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/updateResume""","""controllers.ResumeController.updateResume"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/deleteResume""","""controllers.ResumeController.deleteResume"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/profile""","""controllers.ResumeController.profile"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/updateProfile""","""controllers.ResumeController.updateProfile"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/deleteCustomer""","""controllers.ResumeController.deleteCustomer""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:5
case controllers_MainController_index0(params) => {
   call(Param[String]("path", Right(""))) { (path) =>
        invokeHandler(controllers.MainController.index(path), HandlerDef(this, "controllers.MainController", "index", Seq(classOf[String]),"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:6
case controllers_MainController_events1(params) => {
   call { 
        invokeHandler(controllers.MainController.events, HandlerDef(this, "controllers.MainController", "events", Nil,"GET", """""", Routes.prefix + """events"""))
   }
}
        

// @LINE:8
case controllers_MessageController_getMessages2(params) => {
   call(params.fromQuery[Int]("page", Some(0)), params.fromQuery[Int]("perPage", Some(10))) { (page, perPage) =>
        invokeHandler(controllers.MessageController.getMessages(page, perPage), HandlerDef(this, "controllers.MessageController", "getMessages", Seq(classOf[Int], classOf[Int]),"GET", """""", Routes.prefix + """message"""))
   }
}
        

// @LINE:9
case controllers_MessageController_saveMessage3(params) => {
   call { 
        invokeHandler(controllers.MessageController.saveMessage, HandlerDef(this, "controllers.MessageController", "saveMessage", Nil,"POST", """""", Routes.prefix + """message"""))
   }
}
        

// @LINE:12
case controllers_WebJarAssets_requirejs4(params) => {
   call { 
        invokeHandler(controllers.WebJarAssets.requirejs, HandlerDef(this, "controllers.WebJarAssets", "requirejs", Nil,"GET", """ Webjars, requirejs, routes and other assets""", Routes.prefix + """lib/require.js"""))
   }
}
        

// @LINE:13
case controllers_WebJarAssets_at5(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        invokeHandler(controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
   }
}
        

// @LINE:14
case controllers_Assets_at6(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:15
case controllers_MainController_router7(params) => {
   call { 
        invokeHandler(controllers.MainController.router, HandlerDef(this, "controllers.MainController", "router", Nil,"GET", """""", Routes.prefix + """routes.js"""))
   }
}
        

// @LINE:18
case controllers_MainController_index8(params) => {
   call(params.fromPath[String]("path", None)) { (path) =>
        invokeHandler(controllers.MainController.index(path), HandlerDef(this, "controllers.MainController", "index", Seq(classOf[String]),"GET", """ Every other page""", Routes.prefix + """$path<.+>"""))
   }
}
        

// @LINE:22
case controllers_ResumeController_getResumes9(params) => {
   call { 
        invokeHandler(controllers.ResumeController.getResumes, HandlerDef(this, "controllers.ResumeController", "getResumes", Nil,"POST", """Employee""", Routes.prefix + """resumes"""))
   }
}
        

// @LINE:23
case controllers_ResumeController_saveResume10(params) => {
   call { 
        invokeHandler(controllers.ResumeController.saveResume, HandlerDef(this, "controllers.ResumeController", "saveResume", Nil,"POST", """""", Routes.prefix + """employee/newResume"""))
   }
}
        

// @LINE:24
case controllers_ResumeController_getResume11(params) => {
   call { 
        invokeHandler(controllers.ResumeController.getResume, HandlerDef(this, "controllers.ResumeController", "getResume", Nil,"POST", """""", Routes.prefix + """getResume"""))
   }
}
        

// @LINE:26
case controllers_ResumeController_deleteById12(params) => {
   call { 
        invokeHandler(controllers.ResumeController.deleteById, HandlerDef(this, "controllers.ResumeController", "deleteById", Nil,"POST", """""", Routes.prefix + """deleteByIdResume"""))
   }
}
        

// @LINE:29
case controllers_ResumeController_resumes13(params) => {
   call { 
        invokeHandler(controllers.ResumeController.resumes, HandlerDef(this, "controllers.ResumeController", "resumes", Nil,"POST", """""", Routes.prefix + """employee/resumes"""))
   }
}
        

// @LINE:30
case controllers_ResumeController_resume14(params) => {
   call { 
        invokeHandler(controllers.ResumeController.resume, HandlerDef(this, "controllers.ResumeController", "resume", Nil,"POST", """""", Routes.prefix + """employee/resume"""))
   }
}
        

// @LINE:32
case controllers_ResumeController_updateResume15(params) => {
   call { 
        invokeHandler(controllers.ResumeController.updateResume, HandlerDef(this, "controllers.ResumeController", "updateResume", Nil,"POST", """POST   /employee/newResume      	controllers.ResumeController.newResume""", Routes.prefix + """employee/updateResume"""))
   }
}
        

// @LINE:33
case controllers_ResumeController_deleteResume16(params) => {
   call { 
        invokeHandler(controllers.ResumeController.deleteResume, HandlerDef(this, "controllers.ResumeController", "deleteResume", Nil,"POST", """""", Routes.prefix + """employee/deleteResume"""))
   }
}
        

// @LINE:35
case controllers_ResumeController_profile17(params) => {
   call { 
        invokeHandler(controllers.ResumeController.profile, HandlerDef(this, "controllers.ResumeController", "profile", Nil,"POST", """""", Routes.prefix + """employee/profile"""))
   }
}
        

// @LINE:36
case controllers_ResumeController_updateProfile18(params) => {
   call { 
        invokeHandler(controllers.ResumeController.updateProfile, HandlerDef(this, "controllers.ResumeController", "updateProfile", Nil,"POST", """""", Routes.prefix + """employee/updateProfile"""))
   }
}
        

// @LINE:37
case controllers_ResumeController_deleteCustomer19(params) => {
   call { 
        invokeHandler(controllers.ResumeController.deleteCustomer, HandlerDef(this, "controllers.ResumeController", "deleteCustomer", Nil,"POST", """""", Routes.prefix + """employee/deleteCustomer"""))
   }
}
        
}

}
     