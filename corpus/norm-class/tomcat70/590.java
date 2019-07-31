licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache tomcat util net java io exception ioexception java net bind exception bindexception java net server socket serversocket java net socket java net socket exception socketexception java security access controller accesscontroller java security privileged action privilegedaction java util iterator java util concurrent concurrent linked queue concurrentlinkedqueue java util concurrent rejected execution exception rejectedexecutionexception org apache juli logging log org apache juli logging log factory logfactory org apache tomcat util exception utils exceptionutils org apache tomcat util net abstract endpoint abstractendpoint handler socket state socketstate org apache tomcat util security privileged set tccl privilegedsettccl handle incoming tcp connections implement simple server model listener thread accepts socket creates worker thread incoming connection advanced end points endpoints reuse threads queues author james duncan david son davidson author jason hunter author james todd author costin manolache author gal shachor author yoav shapira author remy maucherat ji o endpoint jioendpoint abstract endpoint abstractendpoint socket constants log log log factory logfactory get log getlog ji o endpoint jioendpoint fields server socket server socket serversocket server socket serversocket ji o endpoint jioendpoint max connections maxconnections user connector reach bind set max connections setmaxconnections reduce executor timeout bio threads alive terminate executor int err upts interrupts set executor termination timeout millis setexecutorterminationtimeoutmillis properties handling accepted sockets handler handler set handler sethandler handler handler handler handler handler get handler gethandler handler server socket factory server socket factory serversocketfactory server socket factory serversocketfactory set server socket factory setserversocketfactory server socket factory serversocketfactory factory server socket factory serversocketfactory factory server socket factory serversocketfactory get server socket factory getserversocketfactory server socket factory serversocketfactory port override get local port getlocalport server socket serversocket server socket serversocket get local port getlocalport optional feature support override get use sendfile getusesendfile supported override get use comet getusecomet supported override get use comet timeout getusecomettimeout supported override get defer accept getdeferaccept supported override get use polling getusepolling supported bar e bare bones socket processing thread data stored thread with attributes threadwithattributes extra folders alt ernately alternately thread local fields handler abstract endpoint abstractendpoint handler socket state socketstate process socket wrapper socketwrapper socket socket socket status socketstatus status ssl implementation sslimplementation get ssl implementation getsslimplementation async timeout thread async timeout asynctimeout runnable background thread checks async requests fires timeout act ivity activity override loop receive shutdown command running thread sleep interrupted exception interruptedexception system current time millis currenttimemillis iterator socket wrapper socketwrapper socket sockets waiting requests waitingrequests iterator sockets has next hasnext socket wrapper socketwrapper socket socket sockets access socket get last access getlastaccess socket get timeout gettimeout access socket get timeout gettimeout prevent multiple time outs timeouts socket set timeout settimeout process socket async processsocketasync socket socket status socketstatus timeout loop endpoint paused paused running thread sleep interrupted exception interruptedexception background thread list ens listens incoming tcp connections hands processor acceptor abstract endpoint abstractendpoint acceptor override error delay errordelay loop receive shutdown command running loop endpoint paused paused running acceptor state acceptorstate paused thread sleep interrupted exception interruptedexception running acceptor state acceptorstate running reached max connections wait count up or await connection countuporawaitconnection socket socket accept incoming connection server socket socket server socket factory serversocketfactory accept socket acceptsocket server socket serversocket io exception ioexception ioe count down connection countdownconnection error delay errordelay handle exception with delay handleexceptionwithdelay error delay errordelay ioe successful accept reset error delay error delay errordelay configure socket running paused set socket options setsocketoptions socket hand socket processor process socket processsocket socket count down connection countdownconnection close socket close socket closesocket socket count down connection countdownconnection close socket close socket closesocket socket io exception ioexception running log error get string getstring endpoint accept fail null pointer exception nullpointerexception npe running log error get string getstring endpoint accept fail npe throwable exception utils exceptionutils handle throwable handlethrowable log error get string getstring endpoint accept fail acceptor state acceptorstate ended close socket closesocket socket socket socket close io exception ioexception equivalent worker simply external executor thread pool socket processor socketprocessor runnable socket wrapper socketwrapper socket socket socket status socketstatus status socket processor socketprocessor socket wrapper socketwrapper socket socket socket null pointer exception nullpointerexception socket socket socket processor socketprocessor socket wrapper socketwrapper socket socket socket status socketstatus status socket status status override launch socket socket state socketstate socket state socketstate open ssl handshake server socket factory serversocketfactory handshake socket get socket getsocket throwable exception utils exceptionutils handle throwable handlethrowable log is debug enabled isdebugenabled log debug get string getstring endpoint err handshake socket state socketstate closed socket state socketstate closed status handler process socket socket status socketstatus open read handler process socket status socket state socketstate closed close socket log is trace enabled istraceenabled log trace closing socket socket count down connection countdownconnection socket get socket getsocket close io exception ioexception socket state socketstate open socket state socketstate upgrading socket state socketstate upgrading tomcat socket state socketstate upgraded socket set kept alive setkeptalive socket access launch socket state socketstate socket access waiting requests waitingrequests add socket launch get executor getexecutor execute socket processor socketprocessor socket socket status socketstatus open read rejected execution exception rejectedexecutionexception log warn socket rep rocessing reprocessing request rejected socket handler process socket socket status socketstatus disconnect count down connection countdownconnection null pointer exception nullpointerexception npe running log error get string getstring endpoint launch fail npe socket finish request methods override bind exception initialize thread count defaults accept or acceptor accept or thread count acceptorthreadcount accept or thread count acceptorthreadcount initialize max connections maxconnections get max connections getmaxconnections user has n hasn set max connections setmaxconnections get max threads executor getmaxthreadsexecutor server socket factory serversocketfactory issslenabled server socket factory serversocketfactory handler get ssl implementation getsslimplementation get server socket factory getserversocketfactory server socket factory serversocketfactory default server socket factory defaultserversocketfactory server socket serversocket get address getaddress server socket serversocket server socket factory serversocketfactory create socket createsocket get port getport get backlog getbacklog server socket serversocket server socket factory serversocketfactory create socket createsocket get port getport get backlog getbacklog get address getaddress bind exception bindexception orig string msg get address getaddress msg orig get message getmessage get port getport msg orig get message getmessage get address getaddress to string tostring get port getport bind exception bindexception bind exception bindexception msg init cause initcause orig override start internal startinternal exception running running paused create worker collection get executor getexecutor create executor createexecutor initialize connection latch initializeconnectionlatch start acceptor threads startacceptorthreads start async timeout thread thread timeout thread timeoutthread thread async timeout asynctimeout get name getname async timeout asynctimeout timeout thread timeoutthread set priority setpriority thread priority threadpriority timeout thread timeoutthread set daemon setdaemon timeout thread timeoutthread start override stop internal stopinternal release connection latch releaseconnectionlatch paused pause running running unlock accept unlockaccept shutdown executor shutdownexecutor deallocate apr memory pools close server socket override unbind exception running server socket serversocket server socket serversocket server socket serversocket close exception log error get string getstring endpoint err close server socket serversocket handler recycle override abstract endpoint abstractendpoint acceptor create acceptor createacceptor acceptor configure socket set socket options setsocketoptions socket socket socket options timeout linger socket properties socketproperties set properties setproperties socket socket exception socketexception log is debug enabled isdebugenabled log debug get string getstring endpoint err unexpected throwable exception utils exceptionutils handle throwable handlethrowable log error get string getstring endpoint err unexpected process connection client wraps socket alive attributes tracked passes socket executor processing param socket socket client code code socket passed executor code code wrong endpoint shutting returning code code indication close socket process socket processsocket socket socket process request socket socket wrapper socketwrapper socket wrapper socket wrapper socketwrapper socket socket wrapper set keep alive left setkeepaliveleft get max keep alive requests getmaxkeepaliverequests wrapper set secure setsecure issslenabled shutdown executor avoid npe running get executor getexecutor execute socket processor socketprocessor wrapper rejected execution exception rejectedexecutionexception log warn socket processing request rejected socket throwable exception utils exceptionutils handle throwable handlethrowable log error get string getstring endpoint process fail process existing async connection processing required passes wrapped socket executor processing param socket socket client param status open timeout comet requests supported bio jio connector override process socket async processsocketasync socket wrapper socketwrapper socket socket socket status socketstatus status socket waiting requests waitingrequests remove socket socket processor socketprocessor proc socket processor socketprocessor socket status class loader classloader loader thread current thread currentthread get context class loader getcontextclassloader threads created webapp class loader classloader constants security enabled privileged action privilegedaction privileged set tccl privilegedsettccl get class getclass get class loader getclassloader access controller accesscontroller do privileged doprivileged thread current thread currentthread set context class loader setcontextclassloader get class getclass get class loader getclassloader shutdown executor avoid npe running get executor getexecutor execute proc todo got ta gotta rejected execution exception rejectedexecutionexception properly handle constants security enabled privileged action privilegedaction privileged set tccl privilegedsettccl loader access controller accesscontroller do privileged doprivileged thread current thread currentthread set context class loader setcontextclassloader loader throwable exception utils exceptionutils handle throwable handlethrowable log error get string getstring endpoint process fail concurrent linked queue concurrentlinkedqueue socket wrapper socketwrapper socket waiting requests waitingrequests concurrent linked queue concurrentlinkedqueue socket wrapper socketwrapper socket override remove waiting request removewaitingrequest socket wrapper socketwrapper socket socket wrapper socketwrapper waiting requests waitingrequests remove socket wrapper socketwrapper override log get log getlog log