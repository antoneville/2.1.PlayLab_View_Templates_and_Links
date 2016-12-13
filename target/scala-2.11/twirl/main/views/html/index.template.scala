
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/main("Home")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""

    """),format.raw/*5.5*/("""<div class="row">
      <div class="col-sm-2">
        <div class="well">
          <h4>	Menu </h4>
        </div>
      </div>
      <div class = "col-sm-10">
	<div class= "well">
	   <h4>"""),_display_(/*13.10*/message),format.raw/*13.17*/(""" """),format.raw/*13.18*/("""- """),_display_(/*13.21*/name),format.raw/*13.25*/("""</h4>
 	</div>
      </div>
	   <img class="well" src=""""),_display_(/*16.29*/routes/*16.35*/.Assets.versioned("images/homepageimage.jpg")),format.raw/*16.80*/("""">	
   </div>
""")))}),format.raw/*18.2*/("""
"""))
      }
    }
  }

  def render(message:String,name:String): play.twirl.api.HtmlFormat.Appendable = apply(message,name)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,name) => apply(message,name)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Dec 08 13:34:41 GMT 2016
                  SOURCE: /home/wdd/webapps/lab2.2x1/app/views/index.scala.html
                  HASH: 24fb257f131e968569c81331168a3e29f531d675
                  MATRIX: 752->1|878->32|906->35|926->47|965->49|997->55|1214->245|1242->252|1271->253|1301->256|1326->260|1409->316|1424->322|1490->367|1535->382
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|44->13|44->13|44->13|44->13|44->13|47->16|47->16|47->16|49->18
                  -- GENERATED --
              */
          