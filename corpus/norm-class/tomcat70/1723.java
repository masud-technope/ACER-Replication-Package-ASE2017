licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache catalina authenticator java util array list arraylist java util hash map hashmap java util list java util map javax servlet http http servlet response httpservletresponse org junit assert equals assertequals org junit assert false assertfalse org junit assert not null assertnotnull org junit assert true asserttrue org junit test org apache catalina context org apache catalina session org apache catalina deploy login config loginconfig org apache catalina deploy security collection securitycollection org apache catalina deploy security constraint securityconstraint org apache catalina session manager base managerbase org apache catalina startup tester servlet encode url testerservletencodeurl org apache catalina startup tomcat org apache catalina startup tomcat base test tomcatbasetest org apache tomcat util buf c converter cconverter org apache tomcat util buf byte chunk bytechunk org apache tomcat util code c codec binary base test basic authenticator basicauthenticator non login authenticator nonloginauthenticator single sign on singlesignon valve active absence sso support webapp non login authenticator nonloginauthenticator simply access resources tests exercise auth enticating authenticating webapp basic authenticator basicauthenticator triggers additional sso logic webapps authenticators exercise d exercised unit test classes test basic auth parser testbasicauthparser test non login and basic authenticator testnonloginandbasicauthenticator exam i nes examines single sign on signon valve int eracts interacts webapps authenticated inherit authentication server client cookies authentication preserved exc hange exchange jssosessionid cookie individual unique jsessionid cookies assigned sep arately separately webapp sessions situation examine d examined server returns authentication cookies client configured ignore tomcat documentation sso requires client support cookies access resources webapp containers receives sso ass i stance assistance test onon login and basic authenticator testssononloginandbasicauthenticator tomcat base test tomcatbasetest cookies cookies cookies string user user string pwd pwd string role role string nice method basic string http prefix http localhost string context path nologin nologin string context path login login string uri string uri any one can access anyonecanaccess session expiry web xml defined minutes session timeout mins session timeout mins don change expiry scan int erval interval iteration count manager scan interval secs manager expire sessions fast compute delays beware units extra delay secs reasonable msecs expiry manager scan interval secs manager expire sessions fast extra delay secs string client header authorization string server header auth enticate authenticate string server cookie header cookie string client cookie header cookie string encode session param jsessionid string encode sso session ssosession param jssosessionid test onon login and basic authenticator testssononloginandbasicauthenticator basic credentials basiccredentials credentials test onon login and basic authenticator testssononloginandbasicauthenticator basic credentials basiccredentials good credentials test onon login and basic authenticator testssononloginandbasicauthenticator basic credentials basiccredentials nice method user pwd tomcat tomcat context basic context basiccontext context non login context nonlogincontext list string cookies string encodedurl sanity checks established sso session test environment correct test test essential environment testessentialenvironment exception permitted access unprotected resource do test non login dotestnonlogin context path nologin uri cookies http servlet response httpservletresponse permitted access resource authenticators remaining tests do test non login dotestnonlogin context path nologin uri cookies http servlet response httpservletresponse forbidden do test basic dotestbasic context path login uri credentials cookies http servlet response httpservletresponse unauthorized test test essential environment without cookies testessentialenvironmentwithoutcookies exception permitted access unprotected resource do test non login dotestnonlogin context path nologin uri cookies http servlet response httpservletresponse permitted access resource authenticators remaining tests do test non login dotestnonlogin context path nologin uri cookies http servlet response httpservletresponse forbidden do test basic dotestbasic context path login uri credentials cookies http servlet response httpservletresponse unauthorized log on logon access resource basic authentication establish sso session wait sso session times access resource rejected forbidden status note test minute test test basic access and session timeout testbasicaccessandsessiontimeout exception set r api d session timeout detection setrapidsessiontimeoutdetection do test basic dotestbasic context path login uri credentials cookies http servlet response httpservletresponse unauthorized do test basic dotestbasic context path login uri good credentials cookies http servlet response httpservletresponse verify sso id ssoid exists cookie do test basic dotestbasic context path login uri good credentials cookies http servlet response httpservletresponse session time lose authentication do imminent session timeout doimminentsessiontimeout basic context basiccontext do test basic dotestbasic context path login uri credentials cookies http servlet response httpservletresponse unauthorized log on logon access resource basic authentication establish sso session access resource non login nonlogin webapp providing sso session cookie received webapp successful status test test basic login then accept with cookies testbasicloginthenacceptwithcookies exception do test basic dotestbasic context path login uri credentials cookies http servlet response httpservletresponse unauthorized do test basic dotestbasic context path login uri good credentials cookies http servlet response httpservletresponse send cookie pro ves proves authenticated sso session do test non login dotestnonlogin context path nologin uri cookies http servlet response httpservletresponse log on logon access resource basic authentication establish sso session access resource non login nonlogin webapp sending sso session cookie rejected forbidden status test test basic login then reject without cookie testbasicloginthenrejectwithoutcookie exception do test basic dotestbasic context path login uri credentials cookies http servlet response httpservletresponse unauthorized do test basic dotestbasic context path login uri good credentials cookies http servlet response httpservletresponse fail send authentication cookie webapp do test non login dotestnonlogin context path nologin uri cookies http servlet response httpservletresponse forbidden log on logon access resource basic authentication establish sso session access resource non login nonlogin webapp sending jsessionid redirect header access request rejected basic webapp sessionid valid container test test basic access then accept auth with uri testbasicaccessthenacceptauthwithuri exception set always use session setalwaysusesession fail access resource credentials do test basic dotestbasic context path login uri credentials cookies http servlet response httpservletresponse unauthorized access resource good credentials establish session do test basic dotestbasic context path login uri good credentials cookies http servlet response httpservletresponse access harvest session url parameter string for ward param forwardparam next url nexturl context path login uri do test basic dotestbasic context path login uri for ward param forwardparam good credentials cookies http servlet response httpservletresponse verify sessionid encoded absolute url string firstencodedurl encodedurl assert true asserttrue firstencodedurl encode session param access resource encoded url session do test basic dotestbasic firstencodedurl for ward param forwardparam credentials cookies http servlet response httpservletresponse verify sessionid changed verify sso sessionid encoded string secondencodedurl encodedurl assert equals assertequals firstencodedurl secondencodedurl assert false assertfalse firstencodedurl encode sso session ssosession param extract container session secondencodedurl index of indexof encode session param string session id sessionid secondencodedurl substring expect fail sessionid container do test non login dotestnonlogin context path nologin uri session id sessionid cookies http servlet response httpservletresponse forbidden log on logon access resource basic authentication establish sso session access resource non login nonlogin webapp providing sso session cookie received webapp successful status wait basic session expire sso session remain active non login nonlogin session expired access resource sso session expired successful status wait login session expire rejected forbidden status bug fix bugfix https apache org bug zilla bugzilla bug cgi note test minutes test test basic expired accept protected with cookies testbasicexpiredacceptprotectedwithcookies exception set r api d session timeout detection setrapidsessiontimeoutdetection repeat test basic login accept protected with cookies testbasicloginacceptprotectedwithcookies do test basic dotestbasic context path login uri credentials cookies http servlet response httpservletresponse unauthorized do test basic dotestbasic context path login uri good credentials cookies http servlet response httpservletresponse do test non login dotestnonlogin context path nologin uri cookies http servlet response httpservletresponse wait basic session expire non login nonlogin session expiry do imminent session timeout doimminentsessiontimeout basic context basiccontext successful non login nonlogin access rep lenish replenish individual session expiry time sso session alive do test non login dotestnonlogin context path nologin uri cookies http servlet response httpservletresponse wait non login nonlogin session expire tear sso session time do imminent session timeout doimminentsessiontimeout non login context nonlogincontext do test non login dotestnonlogin context path nologin uri cookies http servlet response httpservletresponse forbidden do test basic dotestbasic context path login uri credentials cookies http servlet response httpservletresponse unauthorized do test non login dotestnonlogin string uri use cookie usecookie expectedrc exception map string list string req headers reqheaders hash map hashmap string list string map string list string resp headers respheaders hash map hashmap string list string use cookie usecookie cookies req headers reqheaders client cookie header cookies byte chunk bytechunk byte chunk bytechunk get url geturl http prefix get port getport uri req headers reqheaders resp headers respheaders expectedrc http servlet response httpservletresponse assert equals assertequals expectedrc assert true asserttrue get length getlength assert equals assertequals to string tostring do test basic dotestbasic string uri test onon login and basic authenticator testssononloginandbasicauthenticator basic credentials basiccredentials credentials use cookie usecookie expectedrc exception map string list string req headers reqheaders hash map hashmap string list string map string list string resp headers respheaders hash map hashmap string list string use cookie usecookie cookies req headers reqheaders client cookie header cookies credentials list string array list arraylist string add credentials get credentials getcredentials req headers reqheaders client header byte chunk bytechunk byte chunk bytechunk get url geturl http prefix get port getport uri req headers reqheaders resp headers respheaders assert equals assertequals unexpected code expectedrc expectedrc http servlet response httpservletresponse assert true asserttrue get length getlength expectedrc http servlet response httpservletresponse unauthorized server identify accept able acceptable method method found methodfound list string auth headers authheaders resp headers respheaders server header string auth header authheader auth headers authheaders auth header authheader index of indexof nice method method found methodfound assert true asserttrue method found methodfound string the page thepage to string tostring assert not null assertnotnull the page thepage assert true asserttrue the page thepage starts with startswith use cookie usecookie list string new cookies newcookies resp headers respheaders server cookie header new cookies newcookies harvest cookies server sends cookies new cookies newcookies encodedurl string start href string i start istart the page thepage index of indexof start i end iend i start istart i start istart start length i end iend the page thepage index of indexof i start istart i end iend encodedurl the page thepage substring i start istart i end iend setup webapps test not e note tear down teardown method tomcat override set up setup exception set up setup create tomcat server memory realm tomcat get tomcat instance gettomcatinstance associate singe sign on singesignon valve contexts single sign on singlesignon sso single sign on singlesignon tomcat get host gethost get pipeline getpipeline add valve addvalve sso add test user role realm tomcat add user adduser user pwd tomcat add role addrole user role setup non login nonlogin login webapps set up non login setupnonlogin set up login setuplogin tomcat start override tear down teardown exception tomcat set up non login setupnonlogin exception file system doc base docbase required non login context nonlogincontext tomcat add context addcontext context path nologin non login context nonlogincontext set session timeout setsessiontimeout session timeout mins add servlet context tomcat add servlet addservlet non login context nonlogincontext tester servlet testerservlet tester servlet encode url testerservletencodeurl non login context nonlogincontext add servlet mapping addservletmapping uri tester servlet testerservlet security collection securitycollection collection security collection securitycollection collection add pattern addpattern uri security constraint securityconstraint security constraint securityconstraint add auth role addauthrole role add collection addcollection collection non login context nonlogincontext add constraint addconstraint add unprotected servlet context tomcat add servlet addservlet non login context nonlogincontext tester servlet testerservlet tester servlet encode url testerservletencodeurl non login context nonlogincontext add servlet mapping addservletmapping uri tester servlet testerservlet security collection securitycollection collection security collection securitycollection collection add pattern addpattern uri security constraint securityconstraint security constraint securityconstraint add role signals access permitted add collection addcollection collection non login context nonlogincontext add constraint addconstraint configure authenticator inherit realm engine login config loginconfig login config loginconfig set auth method setauthmethod non login context nonlogincontext set login config setloginconfig authenticator base authenticatorbase non login authenticator nonloginauthenticator non login authenticator nonloginauthenticator non login context nonlogincontext get pipeline getpipeline add valve addvalve non login authenticator nonloginauthenticator set up login setuplogin exception file system doc base docbase required basic context basiccontext tomcat add context addcontext context path login basic context basiccontext set session timeout setsessiontimeout session timeout mins add servlet context tomcat add servlet addservlet basic context basiccontext tester servlet testerservlet tester servlet encode url testerservletencodeurl basic context basiccontext add servlet mapping addservletmapping uri tester servlet testerservlet security collection securitycollection collection security collection securitycollection collection add pattern addpattern uri security constraint securityconstraint security constraint securityconstraint add auth role addauthrole role add collection addcollection collection basic context basiccontext add constraint addconstraint add unprotected servlet context tomcat add servlet addservlet basic context basiccontext tester servlet testerservlet tester servlet encode url testerservletencodeurl basic context basiccontext add servlet mapping addservletmapping uri tester servlet testerservlet security collection securitycollection collection security collection securitycollection collection add pattern addpattern uri security constraint securityconstraint security constraint securityconstraint add role signals access permitted add collection addcollection collection basic context basiccontext add constraint addconstraint configure authenticator inherit realm engine login config loginconfig login config loginconfig set auth method setauthmethod basic basic context basiccontext set login config setloginconfig authenticator base authenticatorbase basic authenticator basicauthenticator basic authenticator basicauthenticator basic context basiccontext get pipeline getpipeline add valve addvalve basic authenticator basicauthenticator extract save server cookies incoming response save cookies savecookies map string list string resp headers respheaders save cookie values header prefix cookies resp headers respheaders server cookie header add saved cookies out going outgoing request add cookies addcookies map string list string req headers reqheaders cookies cookies size req headers reqheaders client cookie header cookies force behaviour authenticators session reg enerated regenerated authentication secure needed browse rs browsers handle cookies set always use session setalwaysusesession authenticator base authenticatorbase basic context basiccontext get authenticator getauthenticator set always use session setalwaysusesession authenticator base authenticatorbase non login context nonlogincontext get authenticator getauthenticator set always use session setalwaysusesession force faster timeout active container defined web xml active session choose seconds minutes note shamelessly clone d cloned manager base managerbase beware sync h synch issues underlying sessions do imminent session timeout doimminentsessiontimeout context active context activecontext manager base managerbase manager manager base managerbase active context activecontext get manager getmanager session sessions manager find sessions findsessions sessions length sessions sessions is valid isvalid sessions set max inactive interval setmaxinactiveinterval extra delay secs leave expired manager thread sleep reasonable msecs expiry interrupted exception interruptedexception par anoid paranoid verification active sessions sessions manager find sessions findsessions assert true asserttrue sessions length force rapid timeout scanning webapps standard manager standardmanager service cycle time seconds session expiry scan cycles set r api d session timeout detection setrapidsessiontimeoutdetection manager base managerbase basic context basiccontext get manager getmanager set process expires frequency setprocessexpiresfrequency manager expire sessions fast manager base managerbase non login context nonlogincontext get manager getmanager set process expires frequency setprocessexpiresfrequency manager expire sessions fast encapsulate logic generate http header basic authentication note int ernally internally validate arguments basic credentials basiccredentials string method string username string password string credentials basic credentials basiccredentials string a method amethod string a username ausername string a password apassword method a method amethod username a username ausername password a password apassword string user credentials usercredentials username password credentials bytes credentialsbytes user credentials usercredentials get bytes getbytes c converter cconverter iso string base base encode base encodebase string credentials bytes credentialsbytes credentials method base string get credentials getcredentials credentials