licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache catalina session java io exception ioexception javax servlet servlet exception servletexception org apache catalina container org apache catalina context org apache catalina engine org apache catalina host org apache catalina lifecycle exception lifecycleexception org apache catalina manager org apache catalina session org apache catalina connector request org apache catalina connector response org apache catalina catalina cluster catalinacluster org apache catalina cluster manager clustermanager org apache catalina cluster valve clustervalve org apache catalina session manager base managerbase org apache catalina session persistent manager persistentmanager org apache catalina valves valve base valvebase org apache tomcat util res string manager stringmanager valve handle tomcat jvm route jvmroute take over takeover mod module node failure node crashes subsequent requests cluster nodes inc urs incurs drop performance valve enabled backup node sees request intended failed node rewrite cookie jsessionid route backup cluster node answered request response delivered client subsequent client requests backup node change session id sessionid cluster nodes session stickiness work backup node tra ffic traffic failed node res tarted restarted valve function correctly nodes cluster receive session id sessionid change not ifications notifications generates cluster listener clusterlistener configured nodes cluster link org apache catalina session jvm route session binder listener jvmroutesessionidbinderlistener jvm route session binder listener jvmroutesessionidbinderlistener tomcat jvm route session binder listener jvmroutesessionidbinderlistener jvm route session binder lifecycle listener jvmroutesessionidbinderlifecyclelistener earlier versions tomcat add valve host definition conf server xml direct cluster valve pre cluster valve class name classname quot org apache catalina session jvm route binder valve jvmroutebindervalve quot cluster pre host element pre host valve class name classname quot org apache catalina session jvm route binder valve jvmroutebindervalve quot host pre trick enable mod turnover mode jmx drop node backup nodes enable jvm route binder valve jvmroutebindervalve back ups backups disable worker mod drop node restart enable mod worker disable jvm route binder val ves jvmroutebindervalves requested sessions migrated author peter rossbach jvm route binder valve jvmroutebindervalve valve base valvebase cluster valve clustervalve variables org apache juli logging log log org apache juli logging log factory logfactory get log getlog jvm route binder valve jvmroutebindervalve descriptive implementation string info org apache catalina session jvm route binder valve jvmroutebindervalve constructor jvm route binder valve jvmroutebindervalve instance variables cluster catalina cluster catalinacluster cluster string manager string manager stringmanager string manager stringmanager get manager getmanager constants enabled component enabled number session tomcat inst anz instanz hosted number of sessions numberofsessions string session id attribute sessionidattribute org apache catalina session jvm route orignal session d jvmrouteorignalsessionid logic descriptive implementation override string get info getinfo info session attribute failed node request returns session id attribute sessionidattribute string get session id attribute getsessionidattribute session id attribute sessionidattribute failed request session attribute param session id attribute sessionidattribute session id attribute sessionidattribute set session id attribute setsessionidattribute string session id attribute sessionidattribute session id attribute sessionidattribute session id attribute sessionidattribute returns number migrated sessions get number of sessions getnumberofsessions number of sessions numberofsessions returns enabled get enabled getenabled enabled param enabled enabled set enabled setenabled enabled enabled enabled detect jvm route jvmroute change cluster backup node param request tomcat request processed param response tomcat response processed exception io exception ioexception input output error occurred exception servlet exception servletexception servlet error occurred override invoke request request response response io exception ioexception servlet exception servletexception get enabled getenabled request get context getcontext request get context getcontext get distributable getdistributable request is async dispatching isasyncdispatching valve cluster access manager cluster handle turnover host level manager manager request get context getcontext get manager getmanager manager manager cluster manager clustermanager get cluster getcluster get cluster getcluster get manager getmanager cluster manager clustermanager manager get name getname manager persistent manager persistentmanager handle possible turnover handlepossibleturnover request pass request valve pipeline get next getnext invoke request response handle session turn jvm route binder valve jvmroutebindervalve handle jvm route handlejvmroute request string string param request current request handle possible turnover handlepossibleturnover request request string sessionid request get requested session id getrequestedsessionid sessionid system current time millis currenttimemillis string jvm route jvmroute get local jvm route getlocaljvmroute request jvm route jvmroute log is debug enabled isdebugenabled log debug get string getstring jvm route jvmroute missing jvm route attribute missingjvmrouteattribute handle jvm route handlejvmroute request sessionid jvm route jvmroute log is debug enabled isdebugenabled system current time millis currenttimemillis time log debug get string getstring jvm route jvmroute turnover info turnoverinfo value of valueof time jvm route jvmroute engine param request current request jvm route jvmroute manager base managerbase string get local jvm route getlocaljvmroute request request manager manager get manager getmanager request manager manager base managerbase manager base managerbase manager get jvm route getjvmroute cluster manager clustermanager param request current request manager manager get manager getmanager request request manager manager request get context getcontext get manager getmanager log is debug enabled isdebugenabled manager log debug get string getstring jvm route jvmroute found manager foundmanager manager request get context getcontext get name getname log debug get string getstring jvm route jvmroute not found manager notfoundmanager request get context getcontext get name getname manager returns cluster override catalina cluster catalinacluster get cluster getcluster cluster param cluster cluster override set cluster setcluster catalina cluster catalinacluster cluster cluster cluster handle jvm route jvmroute stickiness tomcat instance failed correction cookie send client jvm route jvmroute sessionid change propagate cluster nodes param request current request param session id sessionid request sessionid cookie param local jvm route localjvmroute local jvm route jvmroute handle jvm route handlejvmroute request request string session id sessionid string local jvm route localjvmroute requested jvm route jvmroute string request jvm route requestjvmroute session id sessionid index of indexof request jvm route requestjvmroute session id sessionid substring session id sessionid length request jvm route requestjvmroute request jvm route requestjvmroute equals local jvm route localjvmroute log is debug enabled isdebugenabled log debug get string getstring jvm route jvmroute fail over failover request jvm route requestjvmroute local jvm route localjvmroute session id sessionid session catalina session catalinasession catalina session catalinasession get manager getmanager request find session findsession session id sessionid io exception ioexception string session id sessionid substring string new session d newsessionid local jvm route localjvmroute turnover session info rm inform cluster nodes catalina session catalinasession change session d changesessionid request session id sessionid new session d newsessionid catalina session catalinasession number of sessions numberofsessions catalina session catalinasession get manager getmanager request find session findsession new session d newsessionid io exception ioexception catalina session catalinasession session rewrite request rewrite change request session d changerequestsessionid request session id sessionid new session d newsessionid log is debug enabled isdebugenabled log debug get string getstring jvm route jvmroute cannot find session cannotfindsession session id sessionid change session send cluster nodes param request current request param session id sessionid original session param new session d newsessionid session node migration param catalina session catalinasession current session original session change session d changesessionid request request string session id sessionid string new session d newsessionid session catalina session catalinasession fire lifecycle event firelifecycleevent session migration catalina session catalinasession catalina session catalinasession set id setid new session d newsessionid set id setid trigger reset delta request resetdeltarequest catalina session catalinasession delta session deltasession delta session deltasession catalina session catalinasession reset delta request resetdeltarequest change request session d changerequestsessionid request session id sessionid new session d newsessionid sending change cluster nodes clusternodes send session cluster backup sendsessionidclusterbackup request session id sessionid new session d newsessionid fire lifecycle event firelifecycleevent session migration catalina session catalinasession log is debug enabled isdebugenabled log debug get string getstring jvm route jvmroute change session changesession session id sessionid new session d newsessionid change request session param request current request param session id sessionid original session param new session d newsessionid session node migration change request session d changerequestsessionid request request string session id sessionid string new session d newsessionid request change session id changesessionid new session d newsessionid change session id attribute sessionidattribute equals session id attribute sessionidattribute log is debug enabled isdebugenabled log debug get string getstring jvm route jvmroute orig nalsessionid orignalsessionid session id attribute sessionidattribute session id sessionid request set attribute setattribute session id attribute sessionidattribute session id sessionid send changed session id sessionid cluster nodes clusternodes jvm route session binder listener jvmroutesessionidbinderlistener message received messagereceived org apache catalina cluster message clustermessage param session id sessionid current failed session id sessionid param new session d newsessionid session bind cluster node send session cluster backup sendsessionidclusterbackup request request string session id sessionid string new session d newsessionid catalina cluster catalinacluster get cluster getcluster get manager getmanager request backup manager backupmanager sessionidmessage msg sessionidmessage msg set orignal session d setorignalsessionid session id sessionid msg set backup session d setbackupsessionid new session d newsessionid context context request get context getcontext msg set context name setcontextname context get name getname msg set host sethost context get parent getparent get name getname send msg start component implement requirements link org apache catalina util lifecycle base lifecyclebase start internal startinternal exception lifecycle exception lifecycleexception component detects fatal error prevents component override start internal startinternal lifecycle exception lifecycleexception cluster container host container hostcontainer get container getcontainer setup context xml context xml host container hostcontainer host log is warn enabled iswarnenabled log warn get string getstring jvm route jvmroute configure warn host container hostcontainer host container hostcontainer get parent getparent host container hostcontainer host host host container hostcontainer get cluster getcluster cluster catalina cluster catalinacluster host host container hostcontainer get cluster getcluster container engine host container hostcontainer get parent getparent engine engine engine engine get cluster getcluster cluster catalina cluster catalinacluster engine engine get cluster getcluster log is info enabled isinfoenabled log info get string getstring jvm route jvmroute valve started cluster log info get string getstring jvm route jvmroute no cluster nocluster start internal startinternal component implement requirements link org apache catalina util lifecycle base lifecyclebase stop internal stopinternal exception lifecycle exception lifecycleexception component detects fatal error prevents component override stop internal stopinternal lifecycle exception lifecycleexception stop internal stopinternal cluster number of sessions numberofsessions log is info enabled isinfoenabled log info get string getstring jvm route jvmroute valve stopped