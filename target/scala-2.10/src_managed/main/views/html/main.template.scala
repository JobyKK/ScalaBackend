
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>
<html>
<head>
    <title>"""),_display_(Seq[Any](/*6.13*/title)),format.raw/*6.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel='stylesheet' media="screen" href='"""),_display_(Seq[Any](/*8.50*/routes/*8.56*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.css")))),format.raw/*8.114*/("""'>
    <link rel='stylesheet' media="screen" href='"""),_display_(Seq[Any](/*9.50*/routes/*9.56*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap-theme.css")))),format.raw/*9.120*/("""'>
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.50*/routes/*10.56*/.Assets.at("stylesheets/main.css"))),format.raw/*10.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.55*/routes/*11.61*/.Assets.at("images/favicon.png"))),format.raw/*11.93*/("""">
    <script data-main=""""),_display_(Seq[Any](/*12.25*/routes/*12.31*/.Assets.at("javascripts/app.js"))),format.raw/*12.63*/("""" type='text/javascript' src='"""),_display_(Seq[Any](/*12.94*/routes/*12.100*/.WebJarAssets.requirejs)),format.raw/*12.123*/("""'></script>
</head>
<body>
    <nav class="navbar navbar-inverse" role="navigation">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span>
            </button>
            <a class="navbar-brand" href="#">"""),_display_(Seq[Any](/*20.47*/title)),format.raw/*20.52*/("""</a>
        </div>

        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Messages</a></li>
            </ul>
        </div>
    </nav>
    <div class="container">
        """),_display_(Seq[Any](/*30.10*/content)),format.raw/*30.17*/("""
    </div>
</body>
</html>"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 12 00:22:10 EET 2015
                    SOURCE: /home/joby/Prog/Scala/play-mongo-knockout/app/views/main.scala.html
                    HASH: 13a8193866f49b8891310a0a908773db6bc2ad4d
                    MATRIX: 560->1|684->31|763->75|789->80|957->213|971->219|1051->277|1138->329|1152->335|1238->399|1326->451|1341->457|1397->491|1490->548|1505->554|1559->586|1622->613|1637->619|1691->651|1758->682|1774->688|1820->711|2223->1078|2250->1083|2560->1357|2589->1364
                    LINES: 19->1|22->1|27->6|27->6|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|33->12|33->12|33->12|41->20|41->20|51->30|51->30
                    -- GENERATED --
                */
            