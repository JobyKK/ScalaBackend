// @SOURCE:/home/joby/Prog/Scala/ScalaBackend2/conf/routes
// @HASH:cd20929d5faeea57d42686359737ff3364965d76
// @DATE:Wed Nov 18 09:45:07 EET 2015


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


// @LINE:6
private[this] lazy val controllers_EmployeeController_getEmployees0 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/getAll"))))
        

// @LINE:7
private[this] lazy val controllers_EmployeeController_getById1 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/getById"))))
        

// @LINE:8
private[this] lazy val controllers_EmployeeController_deleteById2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/deleteById"))))
        

// @LINE:9
private[this] lazy val controllers_EmployeeController_saveEmployee3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/newEmployee"))))
        

// @LINE:10
private[this] lazy val controllers_EmployeeController_updateEmployee4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/updateEmployee"))))
        

// @LINE:13
private[this] lazy val controllers_ResumeController_getResumes5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resumes"))))
        

// @LINE:14
private[this] lazy val controllers_ResumeController_saveResume6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/newResume"))))
        

// @LINE:15
private[this] lazy val controllers_ResumeController_updateResume7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/updateResume"))))
        

// @LINE:16
private[this] lazy val controllers_ResumeController_getResume8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getResume"))))
        

// @LINE:17
private[this] lazy val controllers_ResumeController_deleteById9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteByIdResume"))))
        
def documentation = List(("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/getAll""","""controllers.EmployeeController.getEmployees"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/getById""","""controllers.EmployeeController.getById"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/deleteById""","""controllers.EmployeeController.deleteById"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/newEmployee""","""controllers.EmployeeController.saveEmployee"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/updateEmployee""","""controllers.EmployeeController.updateEmployee"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resumes""","""controllers.ResumeController.getResumes"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/newResume""","""controllers.ResumeController.saveResume"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/updateResume""","""controllers.ResumeController.updateResume"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getResume""","""controllers.ResumeController.getResume"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteByIdResume""","""controllers.ResumeController.deleteById""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_EmployeeController_getEmployees0(params) => {
   call { 
        invokeHandler(controllers.EmployeeController.getEmployees, HandlerDef(this, "controllers.EmployeeController", "getEmployees", Nil,"POST", """Employee""", Routes.prefix + """employee/getAll"""))
   }
}
        

// @LINE:7
case controllers_EmployeeController_getById1(params) => {
   call { 
        invokeHandler(controllers.EmployeeController.getById, HandlerDef(this, "controllers.EmployeeController", "getById", Nil,"POST", """""", Routes.prefix + """employee/getById"""))
   }
}
        

// @LINE:8
case controllers_EmployeeController_deleteById2(params) => {
   call { 
        invokeHandler(controllers.EmployeeController.deleteById, HandlerDef(this, "controllers.EmployeeController", "deleteById", Nil,"POST", """""", Routes.prefix + """employee/deleteById"""))
   }
}
        

// @LINE:9
case controllers_EmployeeController_saveEmployee3(params) => {
   call { 
        invokeHandler(controllers.EmployeeController.saveEmployee, HandlerDef(this, "controllers.EmployeeController", "saveEmployee", Nil,"POST", """""", Routes.prefix + """employee/newEmployee"""))
   }
}
        

// @LINE:10
case controllers_EmployeeController_updateEmployee4(params) => {
   call { 
        invokeHandler(controllers.EmployeeController.updateEmployee, HandlerDef(this, "controllers.EmployeeController", "updateEmployee", Nil,"POST", """""", Routes.prefix + """employee/updateEmployee"""))
   }
}
        

// @LINE:13
case controllers_ResumeController_getResumes5(params) => {
   call { 
        invokeHandler(controllers.ResumeController.getResumes, HandlerDef(this, "controllers.ResumeController", "getResumes", Nil,"POST", """Resume""", Routes.prefix + """resumes"""))
   }
}
        

// @LINE:14
case controllers_ResumeController_saveResume6(params) => {
   call { 
        invokeHandler(controllers.ResumeController.saveResume, HandlerDef(this, "controllers.ResumeController", "saveResume", Nil,"POST", """""", Routes.prefix + """employee/newResume"""))
   }
}
        

// @LINE:15
case controllers_ResumeController_updateResume7(params) => {
   call { 
        invokeHandler(controllers.ResumeController.updateResume, HandlerDef(this, "controllers.ResumeController", "updateResume", Nil,"POST", """""", Routes.prefix + """employee/updateResume"""))
   }
}
        

// @LINE:16
case controllers_ResumeController_getResume8(params) => {
   call { 
        invokeHandler(controllers.ResumeController.getResume, HandlerDef(this, "controllers.ResumeController", "getResume", Nil,"POST", """""", Routes.prefix + """getResume"""))
   }
}
        

// @LINE:17
case controllers_ResumeController_deleteById9(params) => {
   call { 
        invokeHandler(controllers.ResumeController.deleteById, HandlerDef(this, "controllers.ResumeController", "deleteById", Nil,"POST", """""", Routes.prefix + """deleteByIdResume"""))
   }
}
        
}

}
     