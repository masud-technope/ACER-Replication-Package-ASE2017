licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache sling core spi java io exception ioexception java util map javax servlet http http servlet request httpservletrequest javax servlet http http servlet response httpservletresponse org apache sling core auth util authutil code abstract authentication handler abstractauthenticationhandler code code authentication handler authenticationhandler code link default authentication feedback handler defaultauthenticationfeedbackhandler providing helper methods authentication handlers deprecated bundle link authentication handler authenticationhandler implementations extend link default authentication feedback handler defaultauthenticationfeedbackhandler utility methods link auth util authutil deprecated abstract authentication handler abstractauthenticationhandler default authentication feedback handler defaultauthenticationfeedbackhandler authentication handler authenticationhandler returns named request attribute parameter string request attribute empty string returned empty request parameter parameter returned code default value defaultvalue code returned param request request attribute request parameter param attribute parameter param default value defaultvalue empty string attribute empty parameter exists request attribute parameter code default value defaultvalue code defined deprecated bundle link auth util authutil get attribute or parameter getattributeorparameter http servlet request httpservletrequest string string deprecated string get attribute or parameter getattributeorparameter http servlet request httpservletrequest request string string default value defaultvalue auth util authutil get attribute or parameter getattributeorparameter request default value defaultvalue returns resource target redirect successful authentication method returns empty string code default login resource defaultloginresource code parameter code resource code request attribute checked empty string returned code resource code request parameter checked returned empty string param request request providing attribute parameter param default login resource defaultloginresource login resource empty redirect ion redirection target code default login resource defaultloginresource code deprecated bundle link auth util authutil get login resource getloginresource http servlet request httpservletrequest string deprecated string get login resource getloginresource http servlet request httpservletrequest request string default login resource defaultloginresource auth util authutil get login resource getloginresource request default login resource defaultloginresource ensures returns link authenticator login resource request attribute empty string attribute method sets link authenticator login resource request parameter empty string parameter code default value defaultvalue code empty string attribute param request request check resource attribute param default value defaultvalue attribute request parameter parameter code code empty string returns resource request attribute bundle version deprecated bundle link auth util authutil set login resource attribute setloginresourceattribute http servlet request httpservletrequest string deprecated string set login resource attribute setloginresourceattribute http servlet request httpservletrequest request string default value defaultvalue auth util authutil set login resource attribute setloginresourceattribute request default value defaultvalue redirects target path app ending appending parameters parameter map method functionality target path prefixed request context path ensure proper redirect ion redirection web application code target code path parameter prefixed context path code params code map code code link authenticator login resource resource entry entry generated request uri optional query string code request code parameters code params code map single link authenticator login resource resource parameter target path redirect parameter encoded code java net url encoder urlencoder code utf encoding safe requests param request request object current request uri request query string code params code map link authenticator login resource resource parameter param response response send redirect client param target target path redirect client parameter prefixed request context path method parameter valid target request link is redirect valid isredirectvalid http servlet request httpservletrequest string method target modified root request context param params map parameters target path code code io exception ioexception error occurs sending redirect request illegal state exception illegalstateexception response committed partial url converted valid url internal error internalerror utf character encoding supported platform caught real problem encoding required specification missing bundle version bundle version target validated link auth util authutil is redirect valid isredirectvalid http servlet request httpservletrequest string method deprecated bundle link auth util authutil send redirect sendredirect http servlet request httpservletrequest http servlet response httpservletresponse string map deprecated send redirect sendredirect http servlet request httpservletrequest request http servlet response httpservletresponse response string target map string string params io exception ioexception auth util authutil send redirect sendredirect request response request get context path getcontextpath target params method calls link auth util authutil is redirect valid isredirectvalid http servlet request httpservletrequest string deprecated method int roduced introduced bundle release replaced link auth util authutil is redirect valid isredirectvalid http servlet request httpservletrequest string method deprecated is redirect valid isredirectvalid http servlet request httpservletrequest request string target auth util authutil is redirect valid isredirectvalid request target returns code code client asks validation sub mitted submitted username password credentials implementation returns code code request parameter link par validate code code ins ensitve insensitve request parameter code code method returns code code param request request provide parameter check code code link par validate parameter code code bundle version deprecated bundle link auth util authutil is validate request isvalidaterequest http servlet request httpservletrequest deprecated is validate request isvalidaterequest http servlet request httpservletrequest request auth util authutil is validate request isvalidaterequest request s ends sends response credential validation request param response response object bundle version deprecated bundle link auth util authutil send valid sendvalid http servlet response httpservletresponse deprecated send valid sendvalid http servlet response httpservletresponse response auth util authutil send valid sendvalid response s ends sends forbidden response option ally optionally sta ting stating reason response code link reason header link reason header link authentication handler authenticationhandler failure reason request attribute param request request object param response response object bundle version deprecated bundle link auth util authutil send invalid sendinvalid http servlet request httpservletrequest http servlet response httpservletresponse deprecated send invalid sendinvalid http servlet request httpservletrequest request http servlet response httpservletresponse response auth util authutil send invalid sendinvalid request response