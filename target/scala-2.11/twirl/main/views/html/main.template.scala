
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang = "en">
	<head>
		<title>"""),_display_(/*5.11*/title),format.raw/*5.16*/("""</title>
		<link rel="stylesheet" media="screen" href=""""),_display_(/*6.48*/routes/*6.54*/.Assets.versioned("stylesheet/main.css")),format.raw/*6.94*/("""">
		<link rel="shortcut icon" type= "image/png" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("images/favicon.png")),format.raw/*7.99*/("""">
		<script src=""""),_display_(/*8.17*/routes/*8.23*/.Assets.versioned("javascripts/hello.js")),format.raw/*8.64*/("""" type="text/javascript"></script>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" />
  		<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</head>

	<body>
  	<!-- start of nav section -->
  	<nav class="navbar navbar-inverse">
  		<!-- nav header/ branding -->
    		<div class="navbar-header">
    		     <a class="navbar-brand" href="/">Lab 2</a>
   	 	</div>
   		<!-- List containing nav links -->
   		<ul class="nav navbar-nav">
      		    <li """),_display_(/*22.18*/if(title == "Home")/*22.37*/{_display_(Seq[Any](format.raw/*22.38*/("""class="active"""")))}),format.raw/*22.53*/("""><a href=""""),_display_(/*22.64*/routes/*22.70*/.HomeController.index()),format.raw/*22.93*/("""">Home</a></li>
      		    <li  """),_display_(/*23.19*/if(title == "About")/*23.39*/{_display_(Seq[Any](format.raw/*23.40*/("""class="active"""")))}),format.raw/*23.55*/("""><a href=""""),_display_(/*23.66*/routes/*23.72*/.HomeController.about()),format.raw/*23.95*/("""">About Us</a></li>
	            <li  """),_display_(/*24.20*/if(title == "Products")/*24.43*/{_display_(Seq[Any](format.raw/*24.44*/("""class="active"""")))}),format.raw/*24.59*/("""><a href=""""),_display_(/*24.70*/routes/*24.76*/.HomeController.products()),format.raw/*24.102*/("""">Products</a></li>
		    <li  """),_display_(/*25.13*/if(title == "Contact Us")/*25.38*/{_display_(Seq[Any](format.raw/*25.39*/("""class="active"""")))}),format.raw/*25.54*/("""><a href=""""),_display_(/*25.65*/routes/*25.71*/.HomeController.contactus()),format.raw/*25.98*/("""">Contact Us</a></li>
    		</ul>
  	</nav>

  	<div class="container-fluid text-center">
		"""),_display_(/*30.4*/content),format.raw/*30.11*/("""			
    	"""),format.raw/*31.6*/("""</div>
	
   	<footer class="container-fluid text-center">
      		<p></p>
    	</footer>
     </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Dec 08 13:32:52 GMT 2016
                  SOURCE: /home/wdd/webapps/lab2.2x1/app/views/main.scala.html
                  HASH: c836b63a82382a18d76d2349cbc4608ef2322467
                  MATRIX: 748->1|873->31|900->32|979->85|1004->90|1086->146|1100->152|1160->192|1242->248|1256->254|1315->293|1360->312|1374->318|1435->359|2003->900|2031->919|2070->920|2116->935|2154->946|2169->952|2213->975|2274->1009|2303->1029|2342->1030|2388->1045|2426->1056|2441->1062|2485->1085|2551->1124|2583->1147|2622->1148|2668->1163|2706->1174|2721->1180|2769->1206|2828->1238|2862->1263|2901->1264|2947->1279|2985->1290|3000->1296|3048->1323|3167->1416|3195->1423|3231->1432
                  LINES: 27->1|32->1|33->2|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|56->25|61->30|61->30|62->31
                  -- GENERATED --
              */
          