licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache catalina core java io exception ioexception java lang reflect invocation target exception invocationtargetexception java lang reflect method java net malformedurlexception java net url java net url connection urlconnection java sql driver manager drivermanager java util string tokenizer stringtokenizer javax image io imageio imageio javax xml parsers document builder documentbuilder javax xml parsers document builder factory documentbuilderfactory javax xml parsers parser configuration exception parserconfigurationexception org apache catalina lifecycle org apache catalina lifecycle event lifecycleevent org apache catalina lifecycle listener lifecyclelistener org apache juli logging log org apache juli logging log factory logfactory org apache tomcat util exception utils exceptionutils org apache tomcat util comp at compat jre vendor jrevendor org apache tomcat util res string manager stringmanager org dom document org dom dom implementation s domimplementationls provide work around workaround places java runtime environment memory leak lock files memory leaks occur jre code context loader load singleton memory leak web application loader context loader time work init ialise initialise single tons singletons tomcat common loader context loader locked files occur resource jar accessed disabling jar url connection caching work around workaround disable caching jre memory leak prevention listener jrememoryleakpreventionlistener lifecycle listener lifecyclelistener log log log factory logfactory get log getlog jre memory leak prevention listener jrememoryleakpreventionlistener string manager stringmanager string manager stringmanager get manager getmanager constants java is java isjava or later orlater for name forname java util objects is java isjava or later orlater class not found exception classnotfoundexception is java isjava or later orlater java is java isjava or later orlater protect memory leak caused call code sun awt app context appcontext get app context getappcontext code triggered web application defaults code code java earlier link java beans int rospector introspector flush caches flushcaches defaults code code java link java beans int rospector introspector flush caches flushcaches longer app context appcontext onwards onwards calling method requires graph ical graphical environment starts awt thread app context protection appcontextprotection java is app context protection isappcontextprotection app context protection appcontextprotection set app context protection setappcontextprotection app context protection appcontextprotection app context protection appcontextprotection app context protection appcontextprotection protect memory leak caused call code java awt toolkit get default toolkit getdefaulttoolkit code triggered web application defaults code code thread launched awt thread protection awtthreadprotection isawtthreadprotection awt thread protection awtthreadprotection setawtthreadprotection awt thread protection awtthreadprotection awt thread protection awtthreadprotection awt thread protection awtthreadprotection protect memory leak caused code sun java disposer code loaded web application defaults code code thread launched java d disposer protection ddisposerprotection is java isjava d disposer protection ddisposerprotection java d disposer protection ddisposerprotection set java setjava d disposer protection ddisposerprotection java d disposer protection ddisposerprotection java d disposer protection ddisposerprotection java d disposer protection ddisposerprotection protect memory leak caused call code sun misc request latency requestlatency code triggered web application call start daemon thread thread context loader configured web application loader defaults code code gc daemon protection gcdaemonprotection is gc daemon protection isgcdaemonprotection gc daemon protection gcdaemonprotection set gc daemon protection setgcdaemonprotection gc daemon protection gcdaemonprotection gc daemon protection gcdaemonprotection gc daemon protection gcdaemonprotection protect memory leak caused call code javax security policy code triggered web application call populate variable reference context loader defaults code code security policy protection securitypolicyprotection is security policy protection issecuritypolicyprotection security policy protection securitypolicyprotection set security policy protection setsecuritypolicyprotection security policy protection securitypolicyprotection security policy protection securitypolicyprotection security policy protection securitypolicyprotection protects memory leak caused call code javax security login configuration code triggered web application call populate variable reference context loader defaults code code security login configuration protection securityloginconfigurationprotection is security login configuration protection issecurityloginconfigurationprotection security login configuration protection securityloginconfigurationprotection set security login configuration protection setsecurityloginconfigurationprotection security login configuration protection securityloginconfigurationprotection security login configuration protection securityloginconfigurationprotection security login configuration protection securityloginconfigurationprotection protect memory leak initialization java cryptography arch itecture architecture triggered initial izing initializing message digest messagedigest web application deployment occasionally start token poller thread thread context loader equal web application loader initialize jca early defaults code code token poller protection tokenpollerprotection is token poller protection istokenpollerprotection token poller protection tokenpollerprotection set token poller protection settokenpollerprotection token poller protection tokenpollerprotection token poller protection tokenpollerprotection token poller protection tokenpollerprotection protect resources read jar files side jar file locked note disables caching link url connection urlconnection type defaults code code url cache protection urlcacheprotection is url cache protection isurlcacheprotection url cache protection urlcacheprotection set url cache protection seturlcacheprotection url cache protection urlcacheprotection url cache protection urlcacheprotection url cache protection urlcacheprotection xml parsing pin web application loader memory multiple root nasty profile rs profilers identify roots leak you r kit yourkit ensure hprof format memory snapshots trace leaks xml parsing protection xmlparsingprotection is xml parsing protection isxmlparsingprotection xml parsing protection xmlparsingprotection set xml parsing protection setxmlparsingprotection xml parsing protection xmlparsingprotection xml parsing protection xmlparsingprotection xml parsing protection xmlparsingprotection code sun jndi ldap ldap pool manager ldappoolmanager code spawns thread initialized system property code sun jndi ldap connect pool timeout code greater thread inherits context loader current thread web application loader leak web app code ldap pool manager ldappoolmanager code ldap pool protection ldappoolprotection is ldap pool protection isldappoolprotection ldap pool protection ldappoolprotection set ldap pool protection setldappoolprotection ldap pool protection ldappoolprotection ldap pool protection ldappoolprotection ldap pool protection ldappoolprotection access link driver manager drivermanager trigger loading link java sql driver current loader web application level memory leak protection care cases triggering loading side effects driver manager protection drivermanagerprotection is driver manager protection isdrivermanagerprotection driver manager protection drivermanagerprotection set driver manager protection setdrivermanagerprotection driver manager protection drivermanagerprotection driver manager protection drivermanagerprotection driver manager protection drivermanagerprotection list comma separated fully qualified names load initialize startup listener pre load classes prov oke provoke class loader classloader leaks loaded request processing string classes to initialize classestoinitialize string get classes to initialize getclassestoinitialize classes to initialize classestoinitialize set classes to initialize setclassestoinitialize string classes to initialize classestoinitialize classes to initialize classestoinitialize classes to initialize classestoinitialize override lifecycle event lifecycleevent lifecycle event lifecycleevent event init ialise initialise classes tomcat starts lifecycle init event equals event get type gettype class loader classloader loader thread current thread currentthread get context class loader getcontextclassloader system class loader classloader victim class loader classloader pinning thread current thread currentthread set context class loader setcontextclassloader class loader classloader get system class loader getsystemclassloader call loads drivers current loader driver manager protection drivermanagerprotection driver manager drivermanager get drivers getdrivers issue app context protection appcontextprotection imageio get cache directory getcachedirectory thread awt thread protection awtthreadprotection java awt toolkit get default toolkit getdefaulttoolkit https apache org bug zilla bugzilla bug cgi java d disposer protection ddisposerprotection for name forname sun java disposer class not found exception classnotfoundexception cnfe components calling sun misc request latency requestlatency creates daemon thread setting tccl libraries components trigger memory leaks event ual eventual calls request latency requestlatency javax management remote rmi rmi connector server rmiconnectorserver start note max special thread terminate gc daemon protection gcdaemonprotection clazz for name forname sun misc method method clazz get declared method getdeclaredmethod request latency requestlatency method invoke value o f valueof max class not found exception classnotfoundexception jre vendor jrevendor oracle jvm log error get string getstring jre leak listener jreleaklistener gc daemon fail gcdaemonfail log debug get string getstring jre leak listener jreleaklistener gc daemon fail gcdaemonfail security exception securityexception log error get string getstring jre leak listener jreleaklistener gc daemon fail gcdaemonfail no such method exception nosuchmethodexception log error get string getstring jre leak listener jreleaklistener gc daemon fail gcdaemonfail illegal argument exception illegalargumentexception log error get string getstring jre leak listener jreleaklistener gc daemon fail gcdaemonfail illegal access exception illegalaccessexception log error get string getstring jre leak listener jreleaklistener gc daemon fail gcdaemonfail invocation target exception invocationtargetexception exception utils exceptionutils handle throwable handlethrowable get cause getcause log error get string getstring jre leak listener jreleaklistener gc daemon fail gcdaemonfail calling get policy getpolicy ret ains retains reference context loader security policy protection securitypolicyprotection policy get policy getpolicy policy class policyclass for name forname javax security policy method method policy class policyclass get method getmethod get policy getpolicy method invoke class not found exception classnotfoundexception security exception securityexception no such method exception nosuchmethodexception log warn get string getstring jre leak listener jreleaklistener auth policy fail authpolicyfail illegal argument exception illegalargumentexception log warn get string getstring jre leak listener jreleaklistener auth policy fail authpolicyfail illegal access exception illegalaccessexception log warn get string getstring jre leak listener jreleaklistener auth policy fail authpolicyfail invocation target exception invocationtargetexception exception utils exceptionutils handle throwable handlethrowable get cause getcause log warn get string getstring jre leak listener jreleaklistener auth policy fail authpolicyfail initial izing initializing javax security login configuration ret ains retains reference context loader security login configuration protection securityloginconfigurationprotection for name forname javax security login configuration class loader classloader get system class loader getsystemclassloader class not found exception classnotfoundexception creating message digest messagedigest web application startup initial izes initializes java cryptography arch itecture architecture conditions starts token poller thread tccl equal web application loader initialize jca token poller protection tokenpollerprotection java security security get providers getproviders url caching policy cache url cache protection urlcacheprotection doesn matter jar doesn exist url for med formed url url url jar file dummy jar url connection urlconnection u conn uconn url open connection openconnection u conn uconn set default use caches setdefaultusecaches malformedurlexception log error get string getstring jre leak listener jreleaklistener jar url conn cache fail jarurlconncachefail io exception ioexception log error get string getstring jre leak listener jreleaklistener jar url conn cache fail jarurlconncachefail leaks xml parsing xml parsing protection xmlparsingprotection issues xml parsing document builder factory documentbuilderfactory new instance newinstance new document builder newdocumentbuilder http bugs sun bug database bugdatabase view bug bug issue fixed java onwards document builder factory documentbuilderfactory factory document builder factory documentbuilderfactory new instance newinstance document builder documentbuilder document builder documentbuilder factory new document builder newdocumentbuilder links rel ate relate cached exception instances retain link tccl back trace backtrace field note you r kit yourkit field hprof format memory snapshots https apache org bug zilla bugzilla bug cgi issues current versions java sun org apache xml internal serialize dom serializer impl domserializerimpl document document document builder documentbuilder new document newdocument document create element createelement dummy dom implementation s domimplementationls implementation dom implementation s domimplementationls document get implementation getimplementation implementation createlsserializer write to string writetostring document sun org apache xerces internal dom dom normal izer domnormalizer document normalize parser configuration exception parserconfigurationexception log error get string getstring jre leak listener jreleaklistener xml parse fail xmlparsefail ldap pool protection ldappoolprotection for name forname sun jndi ldap ldap pool manager ldappoolmanager class not found exception classnotfoundexception jre vendor jrevendor oracle jvm log error get string getstring jre leak listener jreleaklistener ldap pool manager fail ldappoolmanagerfail log debug get string getstring jre leak listener jreleaklistener ldap pool manager fail ldappoolmanagerfail classes to initialize classestoinitialize string tokenizer stringtokenizer str tok strtok string tokenizer stringtokenizer classes to initialize classestoinitialize str tok strtok has more tokens hasmoretokens string class name to load classnametoload str tok strtok next token nexttoken for name forname class name to load classnametoload class not found exception classnotfoundexception log error get string getstring jre leak listener jreleaklistener class to initialize fail classtoinitializefail class name to load classnametoload thread current thread currentthread set context class loader setcontextclassloader loader