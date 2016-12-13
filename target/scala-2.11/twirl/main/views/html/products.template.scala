
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Products")/*2.18*/ {_display_(Seq[Any](format.raw/*2.20*/("""
    """),format.raw/*3.5*/("""<div class="row">
      <div class="col-sm-12">
        <div class="well">
          <h4>Products</h4>
        </div>
      </div>
""")))}),format.raw/*9.2*/("""

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Thu Dec 08 13:38:19 GMT 2016
                  SOURCE: /home/wdd/webapps/lab2.2x1/app/views/products.scala.html
                  HASH: 0c2f4cc409b6bc27c9b9c198379ec24885b28997
                  MATRIX: 833->2|857->18|896->20|927->25|1088->157
                  LINES: 32->2|32->2|32->2|33->3|39->9
                  -- GENERATED --
              */
          