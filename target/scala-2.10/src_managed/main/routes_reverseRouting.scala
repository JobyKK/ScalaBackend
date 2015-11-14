// @SOURCE:/home/joby/Prog/Scala/play-mongo-knockout/conf/routes
// @HASH:3ddf8b041f5a9c397f00f28c31c0c68296e452d5
// @DATE:Fri Nov 13 00:37:02 EET 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:6
// @LINE:5
package controllers {

// @LINE:14
class ReverseAssets {
    

// @LINE:14
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:13
// @LINE:12
class ReverseWebJarAssets {
    

// @LINE:13
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "webjars/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                

// @LINE:12
def requirejs(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "lib/require.js")
}
                                                
    
}
                          

// @LINE:18
// @LINE:15
// @LINE:6
// @LINE:5
class ReverseMainController {
    

// @LINE:15
def router(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "routes.js")
}
                                                

// @LINE:18
// @LINE:5
def index(path:String): Call = {
   (path: @unchecked) match {
// @LINE:5
case (path) if path == "" => Call("GET", _prefix)
                                                        
// @LINE:18
case (path) if true => Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("path", path))
                                                        
   }
}
                                                

// @LINE:6
def events(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "events")
}
                                                
    
}
                          

// @LINE:9
// @LINE:8
class ReverseMessageController {
    

// @LINE:9
def saveMessage(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "message")
}
                                                

// @LINE:8
def getMessages(page:Int = 0, perPage:Int = 10): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "message" + queryString(List(if(page == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("page", page)), if(perPage == 10) None else Some(implicitly[QueryStringBindable[Int]].unbind("perPage", perPage)))))
}
                                                
    
}
                          

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseResumeController {
    

// @LINE:29
def resumes(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/resumes")
}
                                                

// @LINE:24
def getResume(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "getResume")
}
                                                

// @LINE:37
def deleteCustomer(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/deleteCustomer")
}
                                                

// @LINE:22
def getResumes(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "resumes")
}
                                                

// @LINE:35
def profile(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/profile")
}
                                                

// @LINE:30
def resume(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/resume")
}
                                                

// @LINE:23
def saveResume(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/newResume")
}
                                                

// @LINE:33
def deleteResume(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/deleteResume")
}
                                                

// @LINE:36
def updateProfile(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/updateProfile")
}
                                                

// @LINE:32
def updateResume(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employee/updateResume")
}
                                                

// @LINE:26
def deleteById(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "deleteByIdResume")
}
                                                
    
}
                          
}
                  


// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:6
// @LINE:5
package controllers.javascript {

// @LINE:14
class ReverseAssets {
    

// @LINE:14
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:13
// @LINE:12
class ReverseWebJarAssets {
    

// @LINE:13
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

// @LINE:12
def requirejs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.WebJarAssets.requirejs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lib/require.js"})
      }
   """
)
                        
    
}
              

// @LINE:18
// @LINE:15
// @LINE:6
// @LINE:5
class ReverseMainController {
    

// @LINE:15
def router : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MainController.router",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "routes.js"})
      }
   """
)
                        

// @LINE:18
// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MainController.index",
   """
      function(path) {
      if (path == """ + implicitly[JavascriptLitteral[String]].to("") + """) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("path", path)})
      }
      }
   """
)
                        

// @LINE:6
def events : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MainController.events",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "events"})
      }
   """
)
                        
    
}
              

// @LINE:9
// @LINE:8
class ReverseMessageController {
    

// @LINE:9
def saveMessage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MessageController.saveMessage",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
      }
   """
)
                        

// @LINE:8
def getMessages : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MessageController.getMessages",
   """
      function(page,perPage) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message" + _qS([(page == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("page", page)), (perPage == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("perPage", perPage))])})
      }
   """
)
                        
    
}
              

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseResumeController {
    

// @LINE:29
def resumes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.resumes",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/resumes"})
      }
   """
)
                        

// @LINE:24
def getResume : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.getResume",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getResume"})
      }
   """
)
                        

// @LINE:37
def deleteCustomer : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.deleteCustomer",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/deleteCustomer"})
      }
   """
)
                        

// @LINE:22
def getResumes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.getResumes",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resumes"})
      }
   """
)
                        

// @LINE:35
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.profile",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/profile"})
      }
   """
)
                        

// @LINE:30
def resume : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.resume",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/resume"})
      }
   """
)
                        

// @LINE:23
def saveResume : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.saveResume",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/newResume"})
      }
   """
)
                        

// @LINE:33
def deleteResume : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.deleteResume",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/deleteResume"})
      }
   """
)
                        

// @LINE:36
def updateProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.updateProfile",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/updateProfile"})
      }
   """
)
                        

// @LINE:32
def updateResume : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.updateResume",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employee/updateResume"})
      }
   """
)
                        

// @LINE:26
def deleteById : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ResumeController.deleteById",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteByIdResume"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:18
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:6
// @LINE:5
package controllers.ref {


// @LINE:14
class ReverseAssets {
    

// @LINE:14
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:13
// @LINE:12
class ReverseWebJarAssets {
    

// @LINE:13
def at(file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.at(file), HandlerDef(this, "controllers.WebJarAssets", "at", Seq(classOf[String]), "GET", """""", _prefix + """webjars/$file<.+>""")
)
                      

// @LINE:12
def requirejs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.WebJarAssets.requirejs(), HandlerDef(this, "controllers.WebJarAssets", "requirejs", Seq(), "GET", """ Webjars, requirejs, routes and other assets""", _prefix + """lib/require.js""")
)
                      
    
}
                          

// @LINE:18
// @LINE:15
// @LINE:6
// @LINE:5
class ReverseMainController {
    

// @LINE:15
def router(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MainController.router(), HandlerDef(this, "controllers.MainController", "router", Seq(), "GET", """""", _prefix + """routes.js""")
)
                      

// @LINE:5
def index(path:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MainController.index(path), HandlerDef(this, "controllers.MainController", "index", Seq(classOf[String]), "GET", """""", _prefix + """""")
)
                      

// @LINE:6
def events(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MainController.events(), HandlerDef(this, "controllers.MainController", "events", Seq(), "GET", """""", _prefix + """events""")
)
                      
    
}
                          

// @LINE:9
// @LINE:8
class ReverseMessageController {
    

// @LINE:9
def saveMessage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MessageController.saveMessage(), HandlerDef(this, "controllers.MessageController", "saveMessage", Seq(), "POST", """""", _prefix + """message""")
)
                      

// @LINE:8
def getMessages(page:Int, perPage:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MessageController.getMessages(page, perPage), HandlerDef(this, "controllers.MessageController", "getMessages", Seq(classOf[Int], classOf[Int]), "GET", """""", _prefix + """message""")
)
                      
    
}
                          

// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:33
// @LINE:32
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseResumeController {
    

// @LINE:29
def resumes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.resumes(), HandlerDef(this, "controllers.ResumeController", "resumes", Seq(), "POST", """""", _prefix + """employee/resumes""")
)
                      

// @LINE:24
def getResume(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.getResume(), HandlerDef(this, "controllers.ResumeController", "getResume", Seq(), "POST", """""", _prefix + """getResume""")
)
                      

// @LINE:37
def deleteCustomer(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.deleteCustomer(), HandlerDef(this, "controllers.ResumeController", "deleteCustomer", Seq(), "POST", """""", _prefix + """employee/deleteCustomer""")
)
                      

// @LINE:22
def getResumes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.getResumes(), HandlerDef(this, "controllers.ResumeController", "getResumes", Seq(), "POST", """Employee""", _prefix + """resumes""")
)
                      

// @LINE:35
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.profile(), HandlerDef(this, "controllers.ResumeController", "profile", Seq(), "POST", """""", _prefix + """employee/profile""")
)
                      

// @LINE:30
def resume(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.resume(), HandlerDef(this, "controllers.ResumeController", "resume", Seq(), "POST", """""", _prefix + """employee/resume""")
)
                      

// @LINE:23
def saveResume(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.saveResume(), HandlerDef(this, "controllers.ResumeController", "saveResume", Seq(), "POST", """""", _prefix + """employee/newResume""")
)
                      

// @LINE:33
def deleteResume(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.deleteResume(), HandlerDef(this, "controllers.ResumeController", "deleteResume", Seq(), "POST", """""", _prefix + """employee/deleteResume""")
)
                      

// @LINE:36
def updateProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.updateProfile(), HandlerDef(this, "controllers.ResumeController", "updateProfile", Seq(), "POST", """""", _prefix + """employee/updateProfile""")
)
                      

// @LINE:32
def updateResume(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.updateResume(), HandlerDef(this, "controllers.ResumeController", "updateResume", Seq(), "POST", """POST   /employee/newResume      	controllers.ResumeController.newResume""", _prefix + """employee/updateResume""")
)
                      

// @LINE:26
def deleteById(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ResumeController.deleteById(), HandlerDef(this, "controllers.ResumeController", "deleteById", Seq(), "POST", """""", _prefix + """deleteByIdResume""")
)
                      
    
}
                          
}
        
    