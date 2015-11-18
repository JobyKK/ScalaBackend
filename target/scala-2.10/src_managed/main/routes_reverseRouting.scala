// @SOURCE:/home/joby/Prog/Scala/ScalaBackend2/conf/routes
// @HASH:cd20929d5faeea57d42686359737ff3364965d76
// @DATE:Wed Nov 18 09:45:07 EET 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseResumeController {
    

// @LINE:16
def getResume(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "getResume")
}
                                                

// @LINE:13
def getResumes(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "resumes")
}
                                                

// @LINE:14
def saveResume(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/newResume")
}
                                                

// @LINE:15
def updateResume(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/updateResume")
}
                                                

// @LINE:17
def deleteById(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "deleteByIdResume")
}
                                                
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseEmployeeController {
    

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
                          
}
                  


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseResumeController {
    

// @LINE:16
def getResume : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.getResume",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getResume"})
      }
   """
)
                        

// @LINE:13
def getResumes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.getResumes",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resumes"})
      }
   """
)
                        

// @LINE:14
def saveResume : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.saveResume",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/newResume"})
      }
   """
)
                        

// @LINE:15
def updateResume : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.updateResume",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/updateResume"})
      }
   """
)
                        

// @LINE:17
def deleteById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.deleteById",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteByIdResume"})
      }
   """
)
                        
    
}
              

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseEmployeeController {
    

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
              
}
        


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseResumeController {
    

// @LINE:16
def getResume(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.getResume(), HandlerDef(this, "controllers.ResumeController", "getResume", Seq(), "POST", """""", _prefix + """getResume""")
)
                      

// @LINE:13
def getResumes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.getResumes(), HandlerDef(this, "controllers.ResumeController", "getResumes", Seq(), "POST", """Resume""", _prefix + """resumes""")
)
                      

// @LINE:14
def saveResume(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.saveResume(), HandlerDef(this, "controllers.ResumeController", "saveResume", Seq(), "POST", """""", _prefix + """employee/newResume""")
)
                      

// @LINE:15
def updateResume(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.updateResume(), HandlerDef(this, "controllers.ResumeController", "updateResume", Seq(), "POST", """""", _prefix + """employee/updateResume""")
)
                      

// @LINE:17
def deleteById(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.deleteById(), HandlerDef(this, "controllers.ResumeController", "deleteById", Seq(), "POST", """""", _prefix + """deleteByIdResume""")
)
                      
    
}
                          

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseEmployeeController {
    

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
                          
}
        
    