licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache sling api javax annotation nonnull javax servlet http http servlet request httpservletrequest javax servlet http http servlet response httpservletresponse a qute aqute bnd annotation provider type providertype code authenticator code defines service applications enforce requests authenticated link login http servlet request httpservletrequest http servlet response httpservletresponse enforced authentication link logout http servlet request httpservletrequest http servlet response httpservletresponse service looked functionality enable applications log users simple login script esp implemented pre sling get service getservice org apache sling commons authenticator login request response no authentication handler noauthenticationhandler exception authenticator service missing authentication handler authenticationhandler error handling pre implementing logout script esp equally simple pre request auth type authtype log ged logged logout sling get service getservice org apache sling commons authenticator logout request response handle authenticator service logout pre intended implemented applications init iate initiate authentication process form request processing servlet script sling api bundle provider type providertype authenticator service registered string service authenticator get name getname request attribute application link login http servlet request httpservletrequest http servlet response httpservletresponse method resource access authenticated request attribute empty string link login http servlet request httpservletrequest http servlet response httpservletresponse method request path info code http servlet request httpservletrequest get path info getpathinfo code method find resource authenticate access request attribute frontend servlets scripts call link login http servlet request httpservletrequest http servlet response httpservletresponse behalf users string login resource resource login request user current request identify resource access authenticated code link login resource resource code request attribute considered request attribute request path info code http servlet request httpservletrequest get path info getpathinfo code method called uncommitted response implementation reset response start authentication process clean response response committed code illegal state exception illegalstateexception code thrown method finished request processing terminated response considered committed finished link no authentication handler exception noauthenticationhandlerexception exception thrown response client param request object representing client request param response object representing response client no authentication handler exception noauthenticationhandlerexception service find authenticate request user illegal state exception illegalstateexception response committed login nonnull http servlet request httpservletrequest request nonnull http servlet response httpservletresponse response logs current request authenticated method called uncommitted response implementation reset response restart authentication process clean response response committed code illegal state exception illegalstateexception code thrown method finished request processing terminated response considered committed finished param request object representing client request param response object representing response client illegal state exception illegalstateexception response committed logout nonnull http servlet request httpservletrequest request nonnull http servlet response httpservletresponse response