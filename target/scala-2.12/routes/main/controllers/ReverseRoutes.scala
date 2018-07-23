// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/tonny_jho/Documents/playframework/rest/conf/routes
// @DATE:Sun Jul 22 17:36:58 CDT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def jsonCatch(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "json/catch")
    }
  
    // @LINE:8
    def plainText(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "plaintext")
    }
  
    // @LINE:10
    def jsonObject(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "json/invoice")
    }
  
    // @LINE:9
    def jsonMap(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "json/map")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
