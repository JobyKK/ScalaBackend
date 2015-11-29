// @SOURCE:/home/joby/Prog/Scala/ScalaBackend2/conf/routes
// @HASH:fd032b2217285798f5a3e0830cee2869ac05a2ba
// @DATE:Sun Nov 29 12:13:30 EET 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReversePositionController {
    

// @LINE:30
def getPosition(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "position/getPosition")
}
                                                

// @LINE:31
def getPositions(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "position/getAll")
}
                                                

// @LINE:28
def savePosition(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "position/newPosition")
}
                                                

// @LINE:29
def updatePosition(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "position/updatePosition")
}
                                                

// @LINE:32
def deleteById(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "position/deleteById")
}
                                                
    
}
                          

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseResumeController {
    

// @LINE:25
def deleteById(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "resume/deleteById")
}
                                                

// @LINE:23
def updateResume(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "resume/updateResume")
}
                                                

// @LINE:22
def saveResume(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "resume/newResume")
}
                                                

// @LINE:24
def getResume(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "resume/getResume")
}
                                                
    
}
                          

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseEmployeeController {
    

// @LINE:11
def getResumes(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/getResumes")
}
                                                

// @LINE:6
def getEmployees(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/getAll")
}
                                                

// @LINE:7
def getById(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/getById")
}
                                                

// @LINE:9
def saveEmployee(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/newEmployee")
}
                                                

// @LINE:10
def updateEmployee(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/updateEmployee")
}
                                                

// @LINE:8
def deleteById(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/deleteById")
}
                                                
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseEmployerController {
    

// @LINE:17
def saveEmployer(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employer/newEmployer")
}
                                                

// @LINE:18
def updateEmployer(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employer/updateEmployer")
}
                                                

// @LINE:19
def getPositions(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employer/getPositions")
}
                                                

// @LINE:15
def getById(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employer/getById")
}
                                                

// @LINE:14
def getEmployers(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employer/getAll")
}
                                                

// @LINE:16
def deleteById(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employer/deleteById")
}
                                                
    
}
                          
}
                  


// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReversePositionController {
    

// @LINE:30
def getPosition : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PositionController.getPosition",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "position/getPosition"})
      }
   """
)
                        

// @LINE:31
def getPositions : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PositionController.getPositions",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "position/getAll"})
      }
   """
)
                        

// @LINE:28
def savePosition : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PositionController.savePosition",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "position/newPosition"})
      }
   """
)
                        

// @LINE:29
def updatePosition : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PositionController.updatePosition",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "position/updatePosition"})
      }
   """
)
                        

// @LINE:32
def deleteById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PositionController.deleteById",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "position/deleteById"})
      }
   """
)
                        
    
}
              

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseResumeController {
    

// @LINE:25
def deleteById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.deleteById",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resume/deleteById"})
      }
   """
)
                        

// @LINE:23
def updateResume : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.updateResume",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resume/updateResume"})
      }
   """
)
                        

// @LINE:22
def saveResume : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.saveResume",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resume/newResume"})
      }
   """
)
                        

// @LINE:24
def getResume : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.getResume",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resume/getResume"})
      }
   """
)
                        
    
}
              

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseEmployeeController {
    

// @LINE:11
def getResumes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployeeController.getResumes",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/getResumes"})
      }
   """
)
                        

// @LINE:6
def getEmployees : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployeeController.getEmployees",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/getAll"})
      }
   """
)
                        

// @LINE:7
def getById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployeeController.getById",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/getById"})
      }
   """
)
                        

// @LINE:9
def saveEmployee : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployeeController.saveEmployee",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/newEmployee"})
      }
   """
)
                        

// @LINE:10
def updateEmployee : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployeeController.updateEmployee",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/updateEmployee"})
      }
   """
)
                        

// @LINE:8
def deleteById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployeeController.deleteById",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/deleteById"})
      }
   """
)
                        
    
}
              

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseEmployerController {
    

// @LINE:17
def saveEmployer : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployerController.saveEmployer",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employer/newEmployer"})
      }
   """
)
                        

// @LINE:18
def updateEmployer : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployerController.updateEmployer",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employer/updateEmployer"})
      }
   """
)
                        

// @LINE:19
def getPositions : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployerController.getPositions",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employer/getPositions"})
      }
   """
)
                        

// @LINE:15
def getById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployerController.getById",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employer/getById"})
      }
   """
)
                        

// @LINE:14
def getEmployers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployerController.getEmployers",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employer/getAll"})
      }
   """
)
                        

// @LINE:16
def deleteById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.EmployerController.deleteById",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employer/deleteById"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReversePositionController {
    

// @LINE:30
def getPosition(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PositionController.getPosition(), HandlerDef(this, "controllers.PositionController", "getPosition", Seq(), "POST", """""", _prefix + """position/getPosition""")
)
                      

// @LINE:31
def getPositions(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PositionController.getPositions(), HandlerDef(this, "controllers.PositionController", "getPositions", Seq(), "POST", """""", _prefix + """position/getAll""")
)
                      

// @LINE:28
def savePosition(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PositionController.savePosition(), HandlerDef(this, "controllers.PositionController", "savePosition", Seq(), "POST", """Position""", _prefix + """position/newPosition""")
)
                      

// @LINE:29
def updatePosition(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PositionController.updatePosition(), HandlerDef(this, "controllers.PositionController", "updatePosition", Seq(), "POST", """""", _prefix + """position/updatePosition""")
)
                      

// @LINE:32
def deleteById(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PositionController.deleteById(), HandlerDef(this, "controllers.PositionController", "deleteById", Seq(), "POST", """""", _prefix + """position/deleteById""")
)
                      
    
}
                          

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseResumeController {
    

// @LINE:25
def deleteById(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.deleteById(), HandlerDef(this, "controllers.ResumeController", "deleteById", Seq(), "POST", """""", _prefix + """resume/deleteById""")
)
                      

// @LINE:23
def updateResume(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.updateResume(), HandlerDef(this, "controllers.ResumeController", "updateResume", Seq(), "POST", """""", _prefix + """resume/updateResume""")
)
                      

// @LINE:22
def saveResume(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.saveResume(), HandlerDef(this, "controllers.ResumeController", "saveResume", Seq(), "POST", """Resume""", _prefix + """resume/newResume""")
)
                      

// @LINE:24
def getResume(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.getResume(), HandlerDef(this, "controllers.ResumeController", "getResume", Seq(), "POST", """""", _prefix + """resume/getResume""")
)
                      
    
}
                          

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseEmployeeController {
    

// @LINE:11
def getResumes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployeeController.getResumes(), HandlerDef(this, "controllers.EmployeeController", "getResumes", Seq(), "POST", """""", _prefix + """employee/getResumes""")
)
                      

// @LINE:6
def getEmployees(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployeeController.getEmployees(), HandlerDef(this, "controllers.EmployeeController", "getEmployees", Seq(), "POST", """Employee""", _prefix + """employee/getAll""")
)
                      

// @LINE:7
def getById(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployeeController.getById(), HandlerDef(this, "controllers.EmployeeController", "getById", Seq(), "POST", """""", _prefix + """employee/getById""")
)
                      

// @LINE:9
def saveEmployee(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployeeController.saveEmployee(), HandlerDef(this, "controllers.EmployeeController", "saveEmployee", Seq(), "POST", """""", _prefix + """employee/newEmployee""")
)
                      

// @LINE:10
def updateEmployee(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployeeController.updateEmployee(), HandlerDef(this, "controllers.EmployeeController", "updateEmployee", Seq(), "POST", """""", _prefix + """employee/updateEmployee""")
)
                      

// @LINE:8
def deleteById(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployeeController.deleteById(), HandlerDef(this, "controllers.EmployeeController", "deleteById", Seq(), "POST", """""", _prefix + """employee/deleteById""")
)
                      
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
class ReverseEmployerController {
    

// @LINE:17
def saveEmployer(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployerController.saveEmployer(), HandlerDef(this, "controllers.EmployerController", "saveEmployer", Seq(), "POST", """""", _prefix + """employer/newEmployer""")
)
                      

// @LINE:18
def updateEmployer(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployerController.updateEmployer(), HandlerDef(this, "controllers.EmployerController", "updateEmployer", Seq(), "POST", """""", _prefix + """employer/updateEmployer""")
)
                      

// @LINE:19
def getPositions(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployerController.getPositions(), HandlerDef(this, "controllers.EmployerController", "getPositions", Seq(), "POST", """""", _prefix + """employer/getPositions""")
)
                      

// @LINE:15
def getById(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployerController.getById(), HandlerDef(this, "controllers.EmployerController", "getById", Seq(), "POST", """""", _prefix + """employer/getById""")
)
                      

// @LINE:14
def getEmployers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployerController.getEmployers(), HandlerDef(this, "controllers.EmployerController", "getEmployers", Seq(), "POST", """Employee""", _prefix + """employer/getAll""")
)
                      

// @LINE:16
def deleteById(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.EmployerController.deleteById(), HandlerDef(this, "controllers.EmployerController", "deleteById", Seq(), "POST", """""", _prefix + """employer/deleteById""")
)
                      
    
}
                          
}
        
    