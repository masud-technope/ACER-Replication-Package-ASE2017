licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache coyote http java byte array input stream bytearrayinputstream java i o exception ioexception java interruptedioexception java security cert certificate factory certificatefactory java security cert certificate java util org apache coyote action code actioncode org apache coyote error state errorstate org apache coyote request info requestinfo org apache coyote http filters buffered input filter bufferedinputfilter org apache juli logging log org apache juli logging log factory logfactory org apache tomcat jni address org apache tomcat jni ssl org apache tomcat jni ssl socket sslsocket org apache tomcat jni sockaddr org apache tomcat jni socket org apache tomcat util exception utils exceptionutils org apache tomcat util net abstract endpoint abstractendpoint handler socket state socketstate org apache tomcat util net apr endpoint aprendpoint org apache tomcat util net ssl support sslsupport org apache tomcat util net socket status socketstatus org apache tomcat util net socket wrapper socketwrapper processes http requests author remy maucherat http apr processor aprprocessor abstract http abstracthttp processor log log log factory logfactory get log getlog http apr processor aprprocessor override log get log getlog log http apr processor aprprocessor header buffer size headerbuffersize apr endpoint aprendpoint endpoint max trailer size maxtrailersize string allowed trailer headers allowedtrailerheaders max extension size maxextensionsize max swallow size maxswallowsize endpoint input buffer inputbuffer internal apr input buffer internalaprinputbuffer request header buffer size headerbuffersize request set input buffer setinputbuffer input buffer inputbuffer output buffer outputbuffer internal apr output buffer internalaproutputbuffer response header buffer size headerbuffersize response set output buffer setoutputbuffer output buffer outputbuffer initialize filters initializefilters max trailer size maxtrailersize allowed trailer headers allowedtrailerheaders max extension size maxextensionsize max swallow size maxswallowsize instance variables input internal apr input buffer internalaprinputbuffer input buffer inputbuffer output internal apr output buffer internalaproutputbuffer output buffer outputbuffer sendfile data apr endpoint aprendpoint sendfile data sendfiledata sendfile data sendfiledata client certificate presented form instances link java security cert certificate converted property controls jsse provider perform conversion ajp connectors http apr connector link org apache catalina valves ssl valve sslvalve provider string client cert provider clientcertprovider string get client cert provider getclientcertprovider client cert provider clientcertprovider set client cert provider setclientcertprovider string client cert provider clientcertprovider methods process pipeline d pipelined http requests input output str eams streams i o exception ioexception error operation override socket state socketstate event socket status socketstatus status i o exception ioexception request info requestinfo request get request processor getrequestprocessor set s tag e setstage org apache coyote constants stage service get adapter getadapter event request response status set error state seterrorstate error state errorstate close interruptedioexception set error state seterrorstate error state errorstate close throwable exception utils exceptionutils handle throwable handlethrowable response set status setstatus set error state seterrorstate error state errorstate close get adapter getadapter log request response log error get string getstring http processor request process set s tag e setstage org apache coyote constants stage ended get error state geterrorstate is error iserror status socket status socketstatus socket state socketstate closed comet input buffer inputbuffer next request nextrequest output buffer outputbuffer next request nextrequest socket state socketstate open socket state socketstate override disable keep alive disablekeepalive override set request line read timeout setrequestlinereadtimeout i o exception ioexception time outs timeouts poller handled poller concerned socket time outs timeouts apr simulate d simulated blocking request data presented normal socket timeout entering processing loop time data read alive timeout required subsequent executions processing loop request data data read socket request data presented normal socket timeout socket created correct timeout sendfile change timeout restore processor change timeout uploads restore override handle inc omplete request line read handleincompleterequestlineread data keep alive keepalive processor recycle d recycled method open socket opensocket override set socket timeout setsockettimeout timeout socket timeout set timeoutset socket wrapper socketwrapper get socket getsocket long value longvalue timeout override set comet time outs setcomettimeouts socket wrapper socketwrapper socket wrapper socketwrapper apr override break keep alive loop breakkeepaliveloop socket wrapper socketwrapper socket wrapper socketwrapper open socket opensocket keep alive keepalive sendfile needed add socket sendfile sendfile data sendfiledata get error state geterrorstate is error iserror sendfile data sendfiledata socket socket wrapper socketwrapper get socket getsocket long value longvalue sendfile data sendfiledata keep alive keepalive keep alive keepalive apr endpoint aprendpoint endpoint get sendfile getsendfile add sendfile data sendfiledata didn send data sendfile sendfile data sendfiledata socket close connection late status code log is debug enabled isdebugenabled log debug get string getstring http processor sendfile error set error state seterrorstate error state errorstate close sendfile poller add socket main poller sendfile processing complete sendfile i n progress sendfileinprogress override reset time outs resettimeouts noop apr override recycle internal recycleinternal socket wrapper socketwrapper sendfile data sendfiledata override set ssl support setsslsupport ssl support sslsupport ssl support sslsupport noop apr action hook actionhook methods send action connector param action code actioncode type action param param action parameter override cases handled action suppress warnings suppresswarnings incomplete action internal actioninternal action code actioncode action code actioncode object param socket ref socketref socket wrapper socketwrapper get socket getsocket long value longvalue action code actioncode req host addr attribute remote host add ress address remote addr remoteaddr socket ref socketref address socket apr remote socket ref socketref remote addr remoteaddr address get ip getip exception log warn get string getstring http processor socket info request remote addr remoteaddr set string setstring remote addr remoteaddr req local attribute local host local name localname socket ref socketref address socket apr local socket ref socketref local name localname address get name info getnameinfo exception log warn get string getstring http processor socket info request local name localname set string setstring local name localname req host attribute remote host remote host remotehost socket ref socketref address socket apr remote socket ref socketref remote host remotehost address get name info getnameinfo remote host remotehost remote host remotehost address get ip getip exception log warn get string getstring http processor socket info request remote host remotehost set string setstring remote host remotehost req local addr attribute local host add ress address local addr localaddr socket ref socketref address socket apr local socket ref socketref local addr localaddr address get ip getip exception log warn get string getstring http processor socket info request local addr localaddr set string setstring local addr localaddr req remote port remoteport attribute remote port remote port remoteport socket ref socketref address socket apr remote socket ref socketref sockaddr add r addr address get info getinfo remote port remoteport add r addr port exception log warn get string getstring http processor socket info request set remote port setremoteport remote port remoteport req local port localport attribute local port local port localport socket ref socketref address socket apr local socket ref socketref sockaddr add r addr address get info getinfo local port localport add r addr port exception log warn get string getstring http processor socket info request set local port setlocalport local port localport req ssl attribute endpoint issslenabled socket ref socketref cipher suite object ssl o sslo ssl socket sslsocket get info s getinfos socket ref socketref ssl ssl info cipher ssl o sslo request set attribute setattribute ssl support sslsupport cipher suite key ssl o sslo client certificate certificate chain cert length certlength error cert length certlength ssl socket sslsocket get info i getinfoi socket ref socketref ssl ssl info client cert chain client cert clientcert ssl socket sslsocket get info b getinfob socket ref socketref ssl ssl info client cert certificate certs client cert clientcert cert length certlength certs certificate cert length certlength certificate factory certificatefactory client cert provider clientcertprovider certificate factory certificatefactory get instance getinstance certificate factory certificatefactory get instance getinstance client cert provider clientcertprovider certs certificate generate certificate generatecertificate byte array input stream bytearrayinputstream client cert clientcert cert length certlength data ssl socket sslsocket get info b getinfob socket ref socketref ssl ssl info client cert chain certs certificate generate certificate generatecertificate byte array input stream bytearrayinputstream data certs request set attribute setattribute ssl support sslsupport certificate key certs user key size ssl o sslo integer value o f valueof ssl socket sslsocket get info i getinfoi socket ref socketref ssl ssl info cipher use key size usekeysize request set attribute setattribute ssl support sslsupport key size key ssl o sslo ssl session ssl o sslo ssl socket sslsocket get info s getinfos socket ref socketref ssl ssl info session ssl o sslo request set attribute setattribute ssl support sslsupport session key ssl o sslo ssl o sslo ssl socket sslsocket get info s getinfos socket ref socketref ssl ssl info protocol ssl o sslo request set attribute setattribute ssl support sslsupport protocol version key ssl o sslo todo provide hook enable ssl session invalid ated invalidated apr endpoint aprendpoint session mgr req attr exception log warn get string getstring http processor socket ssl req ssl certificate endpoint issslenabled socket ref socketref consume buffer request body int erfere interfere client handshake messages input filter inputfilter input filters inputfilters input buffer inputbuffer get filters getfilters buffered input filter bufferedinputfilter input filters inputfilters constants buffered filter set limit setlimit max save post size maxsavepostsize input buffer inputbuffer add active filter addactivefilter input filters inputfilters constants buffered filter configure connection require certificate ssl socket sslsocket set verify setverify socket ref socketref ssl ssl cverify require apr endpoint aprendpoint endpoint getsslverifydepth renegotiate certificates ssl socket sslsocket renegotiate socket ref socketref don certs renegotiation worked client certificate certificate chain cert length certlength error cert length certlength ssl socket sslsocket get info i getinfoi socket ref socketref ssl ssl info client cert chain client cert clientcert ssl socket sslsocket get info b getinfob socket ref socketref ssl ssl info client cert certificate certs client cert clientcert cert length certlength certs certificate cert length certlength certificate factory certificatefactory certificate factory certificatefactory get instance getinstance certs certificate generate certificate generatecertificate byte array input stream bytearrayinputstream client cert clientcert cert length certlength data ssl socket sslsocket get info b getinfob socket ref socketref ssl ssl info client cert chain certs certificate generate certificate generatecertificate byte array input stream bytearrayinputstream data certs request set attribute setattribute ssl support sslsupport certificate key certs exception log warn get string getstring http processor socket ssl request set available setavailable input buffer inputbuffer comet comet comet comet comet close apr endpoint aprendpoint endpoint process socket async processsocketasync socket wrapper socketwrapper socket status socketstatus open read comet set timeout settimeout async complete async state machine asyncstatemachine async complete asynccomplete apr endpoint aprendpoint endpoint process socket async processsocketasync socket wrapper socketwrapper socket status socketstatus open read async set timeout settimeout param timeout param long value longvalue socket wrapper socketwrapper set timeout settimeout timeout async dispatch async state machine asyncstatemachine async dispatch asyncdispatch apr endpoint aprendpoint endpoint process socket async processsocketasync socket wrapper socketwrapper socket status socketstatus open read methods override prepare request internal preparerequestinternal sendfile data sendfiledata override prepare sendfile preparesendfile output filter outputfilter output filters outputfilters string file name filename string request get attribute getattribute org apache coyote constants sendfile filename attr file name filename entity body output buffer outputbuffer add active filter addactivefilter output filters outputfilters constants filter content delim itation contentdelimitation sendfile data sendfiledata apr endpoint aprendpoint sendfile data sendfiledata sendfile data sendfiledata file name filename file name filename sendfile data sendfiledata start request get attribute getattribute org apache coyote constants sendfile file start attr long value longvalue sendfile data sendfiledata request get attribute getattribute org apache coyote constants sendfile file attr long value longvalue override abstract input buffer abstractinputbuffer get input buffer getinputbuffer input buffer inputbuffer override abstract output buffer abstractoutputbuffer get output buffer getoutputbuffer output buffer outputbuffer