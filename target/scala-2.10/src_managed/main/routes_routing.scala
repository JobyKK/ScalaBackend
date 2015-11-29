// @SOURCE:/home/joby/Prog/Scala/ScalaBackend2/conf/routes
// @HASH:fd032b2217285798f5a3e0830cee2869ac05a2ba
// @DATE:Sun Nov 29 12:13:30 EET 2015


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
        

// @LINE:11
private[this] lazy val controllers_EmployeeController_getResumes5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employee/getResumes"))))
        

// @LINE:14
private[this] lazy val controllers_EmployerController_getEmployers6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employer/getAll"))))
        

// @LINE:15
private[this] lazy val controllers_EmployerController_getById7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employer/getById"))))
        

// @LINE:16
private[this] lazy val controllers_EmployerController_deleteById8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employer/deleteById"))))
        

// @LINE:17
private[this] lazy val controllers_EmployerController_saveEmployer9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employer/newEmployer"))))
        

// @LINE:18
private[this] lazy val controllers_EmployerController_updateEmployer10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employer/updateEmployer"))))
        

// @LINE:19
private[this] lazy val controllers_EmployerController_getPositions11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employer/getPositions"))))
        

// @LINE:22
private[this] lazy val controllers_ResumeController_saveResume12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resume/newResume"))))
        

// @LINE:23
private[this] lazy val controllers_ResumeController_updateResume13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resume/updateResume"))))
        

// @LINE:24
private[this] lazy val controllers_ResumeController_getResume14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resume/getResume"))))
        

// @LINE:25
private[this] lazy val controllers_ResumeController_deleteById15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resume/deleteById"))))
        

// @LINE:28
private[this] lazy val controllers_PositionController_savePosition16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("position/newPosition"))))
        

// @LINE:29
private[this] lazy val controllers_PositionController_updatePosition17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("position/updatePosition"))))
        

// @LINE:30
private[this] lazy val controllers_PositionController_getPosition18 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("position/getPosition"))))
        

// @LINE:31
private[this] lazy val controllers_PositionController_getPositions19 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("position/getAll"))))
        

// @LINE:32
private[this] lazy val controllers_PositionController_deleteById20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("position/deleteById"))))
        
def documentation = List(("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/getAll""","""controllers.EmployeeController.getEmployees"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/getById""","""controllers.EmployeeController.getById"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/deleteById""","""controllers.EmployeeController.deleteById"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/newEmployee""","""controllers.EmployeeController.saveEmployee"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/updateEmployee""","""controllers.EmployeeController.updateEmployee"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employee/getResumes""","""controllers.EmployeeController.getResumes"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employer/getAll""","""controllers.EmployerController.getEmployers"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employer/getById""","""controllers.EmployerController.getById"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employer/deleteById""","""controllers.EmployerController.deleteById"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employer/newEmployer""","""controllers.EmployerController.saveEmployer"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employer/updateEmployer""","""controllers.EmployerController.updateEmployer"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employer/getPositions""","""controllers.EmployerController.getPositions"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resume/newResume""","""controllers.ResumeController.saveResume"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resume/updateResume""","""controllers.ResumeController.updateResume"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resume/getResume""","""controllers.ResumeController.getResume"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resume/deleteById""","""controllers.ResumeController.deleteById"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """position/newPosition""","""controllers.PositionController.savePosition"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """position/updatePosition""","""controllers.PositionController.updatePosition"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """position/getPosition""","""controllers.PositionController.getPosition"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """position/getAll""","""controllers.PositionController.getPositions"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """position/deleteById""","""controllers.PositionController.deleteById""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:11
case controllers_EmployeeController_getResumes5(params) => {
   call { 
        invokeHandler(controllers.EmployeeController.getResumes, HandlerDef(this, "controllers.EmployeeController", "getResumes", Nil,"POST", """""", Routes.prefix + """employee/getResumes"""))
   }
}
        

// @LINE:14
case controllers_EmployerController_getEmployers6(params) => {
   call { 
        invokeHandler(controllers.EmployerController.getEmployers, HandlerDef(this, "controllers.EmployerController", "getEmployers", Nil,"POST", """Employee""", Routes.prefix + """employer/getAll"""))
   }
}
        

// @LINE:15
case controllers_EmployerController_getById7(params) => {
   call { 
        invokeHandler(controllers.EmployerController.getById, HandlerDef(this, "controllers.EmployerController", "getById", Nil,"POST", """""", Routes.prefix + """employer/getById"""))
   }
}
        

// @LINE:16
case controllers_EmployerController_deleteById8(params) => {
   call { 
        invokeHandler(controllers.EmployerController.deleteById, HandlerDef(this, "controllers.EmployerController", "deleteById", Nil,"POST", """""", Routes.prefix + """employer/deleteById"""))
   }
}
        

// @LINE:17
case controllers_EmployerController_saveEmployer9(params) => {
   call { 
        invokeHandler(controllers.EmployerController.saveEmployer, HandlerDef(this, "controllers.EmployerController", "saveEmployer", Nil,"POST", """""", Routes.prefix + """employer/newEmployer"""))
   }
}
        

// @LINE:18
case controllers_EmployerController_updateEmployer10(params) => {
   call { 
        invokeHandler(controllers.EmployerController.updateEmployer, HandlerDef(this, "controllers.EmployerController", "updateEmployer", Nil,"POST", """""", Routes.prefix + """employer/updateEmployer"""))
   }
}
        

// @LINE:19
case controllers_EmployerController_getPositions11(params) => {
   call { 
        invokeHandler(controllers.EmployerController.getPositions, HandlerDef(this, "controllers.EmployerController", "getPositions", Nil,"POST", """""", Routes.prefix + """employer/getPositions"""))
   }
}
        

// @LINE:22
case controllers_ResumeController_saveResume12(params) => {
   call { 
        invokeHandler(controllers.ResumeController.saveResume, HandlerDef(this, "controllers.ResumeController", "saveResume", Nil,"POST", """Resume""", Routes.prefix + """resume/newResume"""))
   }
}
        

// @LINE:23
case controllers_ResumeController_updateResume13(params) => {
   call { 
        invokeHandler(controllers.ResumeController.updateResume, HandlerDef(this, "controllers.ResumeController", "updateResume", Nil,"POST", """""", Routes.prefix + """resume/updateResume"""))
   }
}
        

// @LINE:24
case controllers_ResumeController_getResume14(params) => {
   call { 
        invokeHandler(controllers.ResumeController.getResume, HandlerDef(this, "controllers.ResumeController", "getResume", Nil,"POST", """""", Routes.prefix + """resume/getResume"""))
   }
}
        

// @LINE:25
case controllers_ResumeController_deleteById15(params) => {
   call { 
        invokeHandler(controllers.ResumeController.deleteById, HandlerDef(this, "controllers.ResumeController", "deleteById", Nil,"POST", """""", Routes.prefix + """resume/deleteById"""))
   }
}
        

// @LINE:28
case controllers_PositionController_savePosition16(params) => {
   call { 
        invokeHandler(controllers.PositionController.savePosition, HandlerDef(this, "controllers.PositionController", "savePosition", Nil,"POST", """Position""", Routes.prefix + """position/newPosition"""))
   }
}
        

// @LINE:29
case controllers_PositionController_updatePosition17(params) => {
   call { 
        invokeHandler(controllers.PositionController.updatePosition, HandlerDef(this, "controllers.PositionController", "updatePosition", Nil,"POST", """""", Routes.prefix + """position/updatePosition"""))
   }
}
        

// @LINE:30
case controllers_PositionController_getPosition18(params) => {
   call { 
        invokeHandler(controllers.PositionController.getPosition, HandlerDef(this, "controllers.PositionController", "getPosition", Nil,"POST", """""", Routes.prefix + """position/getPosition"""))
   }
}
        

// @LINE:31
case controllers_PositionController_getPositions19(params) => {
   call { 
        invokeHandler(controllers.PositionController.getPositions, HandlerDef(this, "controllers.PositionController", "getPositions", Nil,"POST", """""", Routes.prefix + """position/getAll"""))
   }
}
        

// @LINE:32
case controllers_PositionController_deleteById20(params) => {
   call { 
        invokeHandler(controllers.PositionController.deleteById, HandlerDef(this, "controllers.PositionController", "deleteById", Nil,"POST", """""", Routes.prefix + """position/deleteById"""))
   }
}
        
}

}
     