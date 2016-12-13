
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/lab2.2x1/conf/routes
// @DATE:Thu Dec 08 11:50:56 GMT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
