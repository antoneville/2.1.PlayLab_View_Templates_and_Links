
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
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

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("About")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""

    """),format.raw/*5.5*/("""<div class="row">
      <div class="col-sm-12">
        <div class="well">
          <h4>"""),_display_(/*8.16*/message),format.raw/*8.23*/("""</h4>
        </div>
      </div>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Thu Dec 08 13:37:34 GMT 2016
                  SOURCE: /home/wdd/webapps/lab2.2x1/app/views/about.scala.html
                  HASH: 042366010ebdc52d1dadef9c33baed02ce8e8136
                  MATRIX: 745->1|857->18|885->21|906->34|945->36|977->42|1093->132|1120->139|1185->174
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|39->8|39->8|42->11
                  -- GENERATED --
              */
          