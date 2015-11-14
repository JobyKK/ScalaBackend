
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main("Welcome to Play Framework")/*1.35*/ {_display_(Seq[Any](format.raw/*1.37*/("""

    <div class="modal fade" id="addMessageModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h3>Add a message</h3>
                </div>
                <div class="modal-body">
                    <form role="form">
                        <div class="form-group">
                            <label for="messageField">Message</label>
                            <input type="text" class="form-control" id="messageField" placeholder="Enter message"
                                data-bind="value: messageField"/>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-link" data-dismiss="modal">Close</button>
                    <button class="btn btn-primary" data-bind="click: saveMessage">Add message</button>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4">
            <h2>Messages</h2>
            <p>Welcome to the Play MongoDB and knockout.js template.</p>
            <p>This template shows how you can create a reactive Play application with a rich front end and scalable backend.</p>
            <p>Try adding a message: <a data-toggle="modal" href="#addMessageModal" class="btn btn-primary">Add message</a></p>
            <p>In the backend, <a href="http://mongodb.org">MongoDB</a> is being used to store messages entered in the front end.  <a href="http://reactivemongo.org">Reactive Mongo</a> is being used to talk to MongoDB, using reactive IO.  MongoDB is also being used to publish events, using a tailable cursor on a capped collection.  This ensures that a Play application stays stateless, which allows it to easily scale out to react to load, and gracefully handle faults.</p>
            <p>In the front end, <a href="http://knockoutjs.com/">knockout.js</a> is being used to provide a reactive user interface.  <a href="http://getbootstrap.com/">Bootstrap</a> is being used for styling, and <a href="http://jquery.org">jQuery</a> is being used to make AJAX calls, in combination with the Play Javascript router.</p>
            <p>To receive real time updates of new messages, server sent events are being used, subscribing to the MongoDB tailable cursor on the backend.</p>
        </div>
        <div class="col-md-8">
            <ul class="pager">
                <li class="previous" data-bind="css: """),format.raw/*39.54*/("""{"""),format.raw/*39.55*/(""" disabled: prevMessagesUrl() == null """),format.raw/*39.92*/("""}"""),format.raw/*39.93*/("""">
                    <a href="#" data-bind="click: prevMessages">Previous</a>
                </li>
                <li class="next" data-bind="css: """),format.raw/*42.50*/("""{"""),format.raw/*42.51*/(""" disabled: nextMessagesUrl() == null """),format.raw/*42.88*/("""}"""),format.raw/*42.89*/("""">
                    <a href="#" data-bind="click: nextMessages">Next</a>
                </li>
            </ul>

            <ul class="list-unstyled messages" data-bind="foreach: messages">
                <li data-bind="text: $data.message"></li>
            </ul>

        </div>
    </div>


""")))})),format.raw/*55.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 12 00:22:10 EET 2015
                    SOURCE: /home/joby/Prog/Scala/play-mongo-knockout/app/views/index.scala.html
                    HASH: a0012391c1ec6aaacada953ca1c04ef935346026
                    MATRIX: 646->1|687->34|726->36|3462->2744|3491->2745|3556->2782|3585->2783|3764->2934|3793->2935|3858->2972|3887->2973|4219->3274
                    LINES: 22->1|22->1|22->1|60->39|60->39|60->39|60->39|63->42|63->42|63->42|63->42|76->55
                    -- GENERATED --
                */
            