licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache catalina filters java io exception ioexception java print writer printwriter java net httpurlconnection java net url java util array list arraylist java util arrays java util collections java util enumeration java util hash map hashmap java util list java util map javax servlet filter chain filterchain javax servlet servlet exception servletexception javax servlet servlet request servletrequest javax servlet servlet response servletresponse javax servlet http http servlet httpservlet javax servlet http http servlet request httpservletrequest javax servlet http http servlet response httpservletresponse org junit assert equals assertequals org junit assert false assertfalse org junit assert null assertnull org junit org junit test org apache catalina access log accesslog org apache catalina context org apache catalina lifecycle exception lifecycleexception org apache catalina connector connector org apache catalina connector request org apache catalina deploy filter def filterdef org apache catalina deploy filter map filtermap org apache catalina startup tomcat org apache catalina startup tomcat base test tomcatbasetest org apache tomcat unit test unittest tester context testercontext org apache tomcat unit test unittest tester response testerresponse test remote ip filter testremoteipfilter tomcat base test tomcatbasetest mock link filter chain filterchain handle passed link servlet request servletrequest link servlet response servletresponse mock filter chain mockfilterchain filter chain filterchain http servlet request httpservletrequest request http servlet response httpservletresponse response override do filter dofilter servlet request servletrequest request servlet response servletresponse response io exception ioexception servlet exception servletexception request http servlet request httpservletrequest request response http servlet response httpservletresponse response http servlet request httpservletrequest get request getrequest request http servlet response httpservletresponse get response getresponse response mock http servlet mockhttpservlet http servlet httpservlet serialversionuid http servlet request httpservletrequest request http servlet request httpservletrequest get request getrequest request override service http servlet request httpservletrequest request http servlet response httpservletresponse response servlet exception servletexception io exception ioexception request request print writer printwriter writer response get writer getwriter writer println request remote addr remoteaddr request get remote addr getremoteaddr writer println request remote host remotehost request get remote host getremotehost writer println request secure request is secure issecure writer println request scheme request get scheme getscheme writer println request server port serverport request get server port getserverport writer println enumeration string headers request get header names getheadernames headers has more elements hasmoreelements string headers next element nextelement to string tostring writer println request header collections list request get headers getheaders enhanced link request ease testing mock http servlet request mockhttpservletrequest request mock http servlet request mockhttpservletrequest set coyote request setcoyoterequest org apache coyote request set connector setconnector connector set header setheader string string get coyote request getcoyoterequest get mime headers getmimeheaders set value setvalue set string setstring add header addheader string string get coyote request getcoyoterequest get mime headers getmimeheaders add value addvalue set string setstring set scheme setscheme string scheme get coyote request getcoyoterequest scheme set string setstring scheme override set attribute setattribute string object get coyote request getcoyoterequest get attributes getattributes override object get attribute getattribute string get coyote request getcoyoterequest get attributes getattributes override string get server name getservername localhost override context get context getcontext lazt init get context getcontext set context setcontext tester context testercontext get context getcontext string temp dir system get property getproperty java tmp dir tmpdir test test comma delimited list to string array testcommadelimitedlisttostringarray list string elements arrays as list aslist element element element string actual remote ip filter remoteipfilter list to comma delimited string listtocommadelimitedstring elements assert equals assertequals element element element actual test test comma delimited list to string array empty list testcommadelimitedlisttostringarrayemptylist list string elements array list arraylist string string actual remote ip filter remoteipfilter list to comma delimited string listtocommadelimitedstring elements assert equals assertequals actual test test comma delimited list to string array null list testcommadelimitedlisttostringarraynulllist string actual remote ip filter remoteipfilter list to comma delimited string listtocommadelimitedstring assert equals assertequals actual test test header names case ins ensitivity testheadernamescaseinsensitivity remote ip filter remoteipfilter x forwarded request xforwardedrequest request remote ip filter remoteipfilter x forwarded request xforwardedrequest mock http servlet request mockhttpservletrequest request set header setheader myheader request set header setheader myheader upper request set header setheader my header myheader camel assert equals assertequals request headers size assert equals assertequals camel request get header getheader myheader test test incoming request is secure d but protocol header says it is not with custom values testincomingrequestissecuredbutprotocolheadersaysitisnotwithcustomvalues exception prepare filter def filterdef filter def filterdef filter def filterdef filter def filterdef add init parameter addinitparameter protocol header protocolheader forwarded proto filter def filterdef add init parameter addinitparameter remote ip header remoteipheader forwarded filter def filterdef add init parameter addinitparameter http server port httpserverport mock http servlet request mockhttpservletrequest request mock http servlet request mockhttpservletrequest request set remote addr setremoteaddr request set secure setsecure request set scheme setscheme https request set header setheader forwarded request set header setheader forwarded proto http test http servlet request httpservletrequest actual request actualrequest test remote ip filter testremoteipfilter filter def filterdef request get request getrequest verify actual secure actualsecure actual request actualrequest is secure issecure assert false assertfalse request unsecured header forwarded proto http actual secure actualsecure string actual scheme actualscheme actual request actualrequest get scheme getscheme assert equals assertequals scheme http header forwarded proto http http actual scheme actualscheme actual server port actualserverport actual request actualrequest get server port getserverport assert equals assertequals wrong http server port actual server port actualserverport string actual remote addr actualremoteaddr actual request actualrequest get remote addr getremoteaddr assert equals assertequals remote addr remoteaddr actual remote addr actualremoteaddr string actual remote host actualremotehost actual request actualrequest get remote host getremotehost assert equals assertequals remote host remotehost actual remote host actualremotehost test test incoming request is secure d but protocol header says it is not with default values testincomingrequestissecuredbutprotocolheadersaysitisnotwithdefaultvalues exception prepare filter def filterdef filter def filterdef filter def filterdef filter def filterdef add init parameter addinitparameter protocol header protocolheader forwarded proto mock http servlet request mockhttpservletrequest request mock http servlet request mockhttpservletrequest request set remote addr setremoteaddr request set secure setsecure request set scheme setscheme https request set header setheader forwarded request set header setheader forwarded proto http test http servlet request httpservletrequest actual request actualrequest test remote ip filter testremoteipfilter filter def filterdef request get request getrequest verify actual secure actualsecure actual request actualrequest is secure issecure assert false assertfalse request unsecured header forwarded proto http actual secure actualsecure string actual scheme actualscheme actual request actualrequest get scheme getscheme assert equals assertequals scheme http header forwarded proto http http actual scheme actualscheme string actual remote addr actualremoteaddr actual request actualrequest get remote addr getremoteaddr assert equals assertequals remote addr remoteaddr actual remote addr actualremoteaddr string actual remote host actualremotehost actual request actualrequest get remote host getremotehost assert equals assertequals remote host remotehost actual remote host actualremotehost test test invoke allowed remote addr with null remote ip header testinvokeallowedremoteaddrwithnullremoteipheader exception prepare filter def filterdef filter def filterdef filter def filterdef filter def filterdef add init parameter addinitparameter internal proxies internalproxies filter def filterdef add init parameter addinitparameter trusted proxies trustedproxies proxy proxy proxy filter def filterdef add init parameter addinitparameter remote ip header remoteipheader forwarded filter def filterdef add init parameter addinitparameter proxies header proxiesheader forwarded mock http servlet request mockhttpservletrequest request mock http servlet request mockhttpservletrequest request set remote addr setremoteaddr request set remote host setremotehost remote host original test http servlet request httpservletrequest actual request actualrequest test remote ip filter testremoteipfilter filter def filterdef request get request getrequest verify string actual forwarded for actualxforwardedfor request get header getheader forwarded assert null assertnull forwarded actual forwarded for actualxforwardedfor string actual forwarded by actualxforwardedby request get header getheader forwarded assert null assertnull forwarded actual forwarded by actualxforwardedby string actual remote addr actualremoteaddr actual request actualrequest get remote addr getremoteaddr assert equals assertequals remote addr remoteaddr actual remote addr actualremoteaddr string actual remote host actualremotehost actual request actualrequest get remote host getremotehost assert equals assertequals remote host remotehost remote host original actual remote host actualremotehost test test invoke all proxies are internal testinvokeallproxiesareinternal exception prepare filter def filterdef filter def filterdef filter def filterdef filter def filterdef add init parameter addinitparameter internal proxies internalproxies filter def filterdef add init parameter addinitparameter trusted proxies trustedproxies proxy proxy proxy filter def filterdef add init parameter addinitparameter remote ip header remoteipheader forwarded filter def filterdef add init parameter addinitparameter proxies header proxiesheader forwarded mock http servlet request mockhttpservletrequest request mock http servlet request mockhttpservletrequest request set remote addr setremoteaddr request set remote host setremotehost remote host original request add header addheader forwarded test http servlet request httpservletrequest actual request actualrequest test remote ip filter testremoteipfilter filter def filterdef request get request getrequest verify string actual forwarded for actualxforwardedfor actual request actualrequest get header getheader forwarded assert null assertnull proxies internal forwarded actual forwarded for actualxforwardedfor string actual forwarded by actualxforwardedby actual request actualrequest get header getheader forwarded assert null assertnull proxies internal forwarded actual forwarded by actualxforwardedby string actual remote addr actualremoteaddr actual request actualrequest get remote addr getremoteaddr assert equals assertequals remote addr remoteaddr actual remote addr actualremoteaddr string actual remote host actualremotehost actual request actualrequest get remote host getremotehost assert equals assertequals remote host remotehost actual remote host actualremotehost test test invoke all proxies are trusted testinvokeallproxiesaretrusted exception prepare remote ip filter remoteipfilter remote ip filter remoteipfilter remote ip filter remoteipfilter filter def filterdef filter def filterdef filter def filterdef filter def filterdef add init parameter addinitparameter internal proxies internalproxies filter def filterdef add init parameter addinitparameter trusted proxies trustedproxies proxy proxy proxy filter def filterdef add init parameter addinitparameter remote ip header remoteipheader forwarded filter def filterdef add init parameter addinitparameter proxies header proxiesheader forwarded filter def filterdef set filter setfilter remote ip filter remoteipfilter mock http servlet request mockhttpservletrequest request mock http servlet request mockhttpservletrequest request set remote addr setremoteaddr request set remote host setremotehost remote host original request set header setheader forwarded proxy proxy test http servlet request httpservletrequest actual request actualrequest test remote ip filter testremoteipfilter filter def filterdef request get request getrequest verify string actual forwarded for actualxforwardedfor actual request actualrequest get header getheader forwarded assert null assertnull proxies trusted forwarded actual forwarded for actualxforwardedfor string actual forwarded by actualxforwardedby actual request actualrequest get header getheader forwarded assert equals assertequals proxies trusted forwarded proxy proxy actual forwarded by actualxforwardedby string actual remote addr actualremoteaddr actual request actualrequest get remote addr getremoteaddr assert equals assertequals remote addr remoteaddr actual remote addr actualremoteaddr string actual remote host actualremotehost actual request actualrequest get remote host getremotehost assert equals assertequals remote host remotehost actual remote host actualremotehost test test invoke all proxies are trusted and remote addr match regexp testinvokeallproxiesaretrustedandremoteaddrmatchregexp exception prepare filter def filterdef filter def filterdef filter def filterdef filter def filterdef add init parameter addinitparameter internal proxies internalproxies internal proxy filter def filterdef add init parameter addinitparameter trusted proxies trustedproxies proxy proxy proxy filter def filterdef add init parameter addinitparameter remote ip header remoteipheader forwarded filter def filterdef add init parameter addinitparameter proxies header proxiesheader forwarded mock http servlet request mockhttpservletrequest request mock http servlet request mockhttpservletrequest request set remote addr setremoteaddr request set remote host setremotehost remote host original request add header addheader forwarded request add header addheader forwarded proxy request add header addheader forwarded proxy test http servlet request httpservletrequest actual request actualrequest test remote ip filter testremoteipfilter filter def filterdef request get request getrequest verify string actual forwarded for actualxforwardedfor actual request actualrequest get header getheader forwarded assert null assertnull proxies trusted forwarded actual forwarded for actualxforwardedfor string actual forwarded by actualxforwardedby actual request actualrequest get header getheader forwarded assert equals assertequals proxies trusted forwarded proxy proxy actual forwarded by actualxforwardedby string actual remote addr actualremoteaddr actual request actualrequest get remote addr getremoteaddr assert equals assertequals remote addr remoteaddr actual remote addr actualremoteaddr string actual remote host actualremotehost actual request actualrequest get remote host getremotehost assert equals assertequals remote host remotehost actual remote host actualremotehost test test invoke all proxies are trusted or internal testinvokeallproxiesaretrustedorinternal exception prepare filter def filterdef filter def filterdef filter def filterdef filter def filterdef add init parameter addinitparameter internal proxies internalproxies filter def filterdef add init parameter addinitparameter trusted proxies trustedproxies proxy proxy proxy filter def filterdef add init parameter addinitparameter remote ip header remoteipheader forwarded filter def filterdef add init parameter addinitparameter proxies header proxiesheader forwarded mock http servlet request mockhttpservletrequest request mock http servlet request mockhttpservletrequest request set remote addr setremoteaddr request set remote host setremotehost remote host original request set header setheader forwarded proxy proxy test http servlet request httpservletrequest actual request actualrequest test remote ip filter testremoteipfilter filter def filterdef request get request getrequest verify string actual forwarded for actualxforwardedfor actual request actualrequest get header getheader forwarded assert null assertnull proxies trusted forwarded actual forwarded for actualxforwardedfor string actual forwarded by actualxforwardedby actual request actualrequest get header getheader forwarded assert equals assertequals proxies trusted forwarded proxy proxy actual forwarded by actualxforwardedby string actual remote addr actualremoteaddr actual request actualrequest get remote addr getremoteaddr assert equals assertequals remote addr remoteaddr actual remote addr actualremoteaddr string actual remote host actualremotehost actual request actualrequest get remote host getremotehost assert equals assertequals remote host remotehost actual remote host actualremotehost test test invoke not allowed remote addr testinvokenotallowedremoteaddr exception prepare filter def filterdef filter def filterdef filter def filterdef filter def filterdef add init parameter addinitparameter internal proxies internalproxies filter def filterdef add init parameter addinitparameter trusted proxies trustedproxies proxy proxy proxy filter def filterdef add init parameter addinitparameter remote ip header remoteipheader forwarded filter def filterdef add init parameter addinitparameter proxies header proxiesheader forwarded mock http servlet request mockhttpservletrequest request mock http servlet request mockhttpservletrequest request set remote addr setremoteaddr allowed internal proxy request set remote host setremotehost allowed internal proxy host request set header setheader forwarded proxy proxy test http servlet request httpservletrequest actual request actualrequest test remote ip filter testremoteipfilter filter def filterdef request get request getrequest verify string actual forwarded for actualxforwardedfor actual request actualrequest get header getheader forwarded assert equals assertequals forwarded unchanged proxy proxy actual forwarded for actualxforwardedfor string actual forwarded by actualxforwardedby actual request actualrequest get header getheader forwarded assert null assertnull forwarded actual forwarded by actualxforwardedby string actual remote addr actualremoteaddr actual request actualrequest get remote addr getremoteaddr assert equals assertequals remote addr remoteaddr allowed internal proxy actual remote addr actualremoteaddr string actual remote host actualremotehost actual request actualrequest get remote host getremotehost assert equals assertequals remote host remotehost allowed internal proxy host actual remote host actualremotehost test test invoke untrusted proxy in the chain testinvokeuntrustedproxyinthechain exception prepare filter def filterdef filter def filterdef filter def filterdef filter def filterdef add init parameter addinitparameter internal proxies internalproxies filter def filterdef add init parameter addinitparameter trusted proxies trustedproxies proxy proxy proxy filter def filterdef add init parameter addinitparameter remote ip header remoteipheader forwarded filter def filterdef add init parameter addinitparameter proxies header proxiesheader forwarded mock http servlet request mockhttpservletrequest request mock http servlet request mockhttpservletrequest request set remote addr setremoteaddr request set remote host setremotehost remote host original request set header setheader forwarded proxy untrusted proxy proxy test http servlet request httpservletrequest actual request actualrequest test remote ip filter testremoteipfilter filter def filterdef request get request getrequest verify string actual forwarded for actualxforwardedfor actual request actualrequest get header getheader forwarded assert equals assertequals host untrusted proxy forwarded proxy actual forwarded for actualxforwardedfor string actual forwarded by actualxforwardedby actual request actualrequest get header getheader forwarded assert equals assertequals host untrusted proxy forwarded proxy actual forwarded by actualxforwardedby string actual remote addr actualremoteaddr actual request actualrequest get remote addr getremoteaddr assert equals assertequals remote addr remoteaddr untrusted proxy actual remote addr actualremoteaddr string actual remote host actualremotehost actual request actualrequest get remote host getremotehost assert equals assertequals remote host remotehost untrusted proxy actual remote host actualremotehost test test list to comma delimited string testlisttocommadelimitedstring string actual remote ip filter remoteipfilter comma delimited list to string array commadelimitedlisttostringarray element element element string expected string element element element assert equals assertequals expected length actual length actual length assert equals assertequals expected actual test test list to comma delimited string mixed space chars testlisttocommadelimitedstringmixedspacechars string actual remote ip filter remoteipfilter comma delimited list to string array commadelimitedlisttostringarray element element element string expected string element element element assert equals assertequals expected length actual length actual length assert equals assertequals expected actual mock filter chain mockfilterchain test remote ip filter testremoteipfilter filter def filterdef filter def filterdef request request lifecycle exception lifecycleexception io exception ioexception servlet exception servletexception tomcat tomcat get tomcat instance gettomcatinstance context root tomcat add context addcontext temp dir remote ip filter remoteipfilter remote ip filter remoteipfilter remote ip filter remoteipfilter filter def filterdef set filter class setfilterclass remote ip filter remoteipfilter get name getname filter def filterdef set filter setfilter remote ip filter remoteipfilter filter def filterdef set filter name setfiltername remote ip filter remoteipfilter get name getname root add filter def addfilterdef filter def filterdef filter map filtermap filter map filtermap filter map filtermap filter map filtermap set filter name setfiltername remote ip filter remoteipfilter get name getname filter map filtermap addurlpattern root add filter map addfiltermap filter map filtermap get tomcat instance gettomcatinstance start mock filter chain mockfilterchain filter chain filterchain mock filter chain mockfilterchain test tester response testerresponse response tester response testerresponse response set request setrequest request remote ip filter remoteipfilter do filter dofilter request response filter chain filterchain filter chain filterchain test test request attributes for access log testrequestattributesforaccesslog exception prepare filter def filterdef filter def filterdef filter def filterdef filter def filterdef add init parameter addinitparameter protocol header protocolheader forwarded proto filter def filterdef add init parameter addinitparameter remote ip header remoteipheader forwarded filter def filterdef add init parameter addinitparameter http server port httpserverport mock http servlet request mockhttpservletrequest request mock http servlet request mockhttpservletrequest request set remote addr setremoteaddr request set header setheader forwarded request set header setheader forwarded proto http test http servlet request httpservletrequest actual request actualrequest test remote ip filter testremoteipfilter filter def filterdef request get request getrequest verify assert equals assertequals org apache catalina access log accesslog server port serverport integer value of valueof actual request actualrequest get attribute getattribute access log accesslog server port attribute assert equals assertequals org apache catalina access log accesslog remote addr remoteaddr actual request actualrequest get attribute getattribute access log accesslog remote addr attribute assert equals assertequals org apache catalina access log accesslog remote host remotehost actual request actualrequest get attribute getattribute access log accesslog remote host attribute test link remote ip filter remoteipfilter tomcat standalone server test test with tomcat server testwithtomcatserver exception configuration enable forwarded proto map string string remote ip filter parameter remoteipfilterparameter hash map hashmap string string remote ip filter parameter remoteipfilterparameter protocol header protocolheader forwarded proto set up setup tomcat tomcat get tomcat instance gettomcatinstance context root tomcat add context addcontext temp dir filter def filterdef filter def filterdef filter def filterdef filter def filterdef get parameter map getparametermap put all putall remote ip filter parameter remoteipfilterparameter filter def filterdef set filter class setfilterclass remote ip filter remoteipfilter get name getname filter def filterdef set filter name setfiltername remote ip filter remoteipfilter get name getname root add filter def addfilterdef filter def filterdef filter map filtermap filter map filtermap filter map filtermap filter map filtermap set filter name setfiltername remote ip filter remoteipfilter get name getname filter map filtermap addurlpattern root add filter map addfiltermap filter map filtermap mock http servlet mockhttpservlet mock servlet mockservlet mock http servlet mockhttpservlet tomcat add servlet addservlet root mock servlet mockservlet get class getclass get name getname mock servlet mockservlet root add servlet mapping addservletmapping test mock servlet mockservlet get class getclass get name getname get tomcat instance gettomcatinstance start test httpurlconnection httpurlconnection httpurlconnection url http localhost tomcat get connector getconnector get local port getlocalport test open connection openconnection string expected remote addr expectedremoteaddr remote add r addr httpurlconnection add request property addrequestproperty forwarded expected remote addr expectedremoteaddr httpurlconnection add request property addrequestproperty forwarded proto https validate assert equals assertequals httpurlconnection http httpurlconnection get response code getresponsecode http servlet request httpservletrequest request mock servlet mockservlet get request getrequest assert not null assertnotnull request validate fowarded assert equals assertequals expected remote addr expectedremoteaddr request get remote addr getremoteaddr assert equals assertequals expected remote addr expectedremoteaddr request get remote host getremotehost validate for war ded forwarded proto assert true asserttrue request is secure issecure assert equals assertequals https request get scheme getscheme assert equals assertequals request get server port getserverport