copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal launching java io exception ioexception java util map org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime i status istatus org eclipse core runtime status org eclipse core runtime jobs i job change event ijobchangeevent org eclipse core runtime jobs job org eclipse core runtime jobs job change adapter jobchangeadapter org eclipse debug core debug event debugevent org eclipse debug core debug exception debugexception org eclipse debug core debug plugin debugplugin org eclipse debug core i launch ilaunch org eclipse debug core i launch configuration ilaunchconfiguration org eclipse debug core model i debug target idebugtarget org eclipse debug core model i process iprocess org eclipse debug core model i streams proxy istreamsproxy org eclipse jdi timeout exception timeoutexception org eclipse jdt debug core jdi debug model jdidebugmodel org eclipse jdt launching i java launch configuration constants ijavalaunchconfigurationconstants org eclipse osgi util nls sun jdi vm disconnected exception vmdisconnectedexception sun jdi virtual machine virtualmachine sun jdi connect connector sun jdi connect illegal connector arguments exception illegalconnectorargumentsexception sun jdi connect list ening connector listeningconnector sun jdi connect transport timeout exception transporttimeoutexception process represents list ening listening connector waiting remotely connect user status connection terminate successful connection occurs debug target launch process removed socket listen connector socketlistenconnector socket listen connector process socketlistenconnectorprocess i process iprocess process terminated f terminated fterminated launch process belongs i launch ilaunch f launch flaunch port connector listen string f port fport system job wait incoming connections wait for connection job waitforconnectionjob f wait for connection job fwaitforconnectionjob creates process label process port connector list ening listening param launch launch process belongs param port port connector wait socket listen connector process socketlistenconnectorprocess i launch ilaunch launch string port f launch flaunch launch f port fport port starts job accept remotely connecting connector start list ening startlistening method called connector arguments calling method port argument map port process constructor param connector connector accept incoming connections param arguments map arguments connector core exception coreexception problem occurs accept connection socket listen connector socketlistenconnector wait for connection waitforconnection list ening connector listeningconnector connector map string connector argument arguments core exception coreexception is terminated isterminated core exception coreexception get status getstatus launching messages launchingmessages socket listen connector process socketlistenconnectorprocess i java launch configuration constants ijavalaunchconfigurationconstants err remote connection failed f wait for connection job fwaitforconnectionjob wait for connection job waitforconnectionjob connector arguments f wait for connection job fwaitforconnectionjob set priority setpriority job f wait for connection job fwaitforconnectionjob add job change listener addjobchangelistener job change adapter jobchangeadapter override running i job change event ijobchangeevent event fire ready to accept event firereadytoacceptevent override i job change event ijobchangeevent event event get result getresult equals status cancel status terminate debug exception debugexception f wait for connection job fwaitforconnectionjob schedule returns error status passed parameters param message status message param exception level exception error code code param code error code link i status istatus i status istatus get status getstatus string message throwable exception code status i status istatus error launching plugin launchingplugin get unique identifier getuniqueidentifier code message exception javadoc org eclipse debug core model i process iprocess get exit value getexitvalue override get exit value getexitvalue debug exception debugexception javadoc org eclipse debug core model i process iprocess get label getlabel override string get label getlabel nls bind launching messages launchingmessages socket listen connector process socketlistenconnectorprocess string f port fport javadoc org eclipse debug core model i process iprocess get launch getlaunch override i launch ilaunch get launch getlaunch f launch flaunch javadoc org eclipse debug core model i terminate iterminate can terminate canterminate override can terminate canterminate f terminated fterminated javadoc org eclipse debug core model i terminate iterminate is terminated isterminated override is terminated isterminated f terminated fterminated javadoc org eclipse debug core model i terminate iterminate terminate override terminate debug exception debugexception f terminated fterminated f terminated fterminated f wait for connection job fwaitforconnectionjob f wait for connection job fwaitforconnectionjob cancel f wait for connection job fwaitforconnectionjob stop list ening stoplistening f wait for connection job fwaitforconnectionjob fire terminate event fireterminateevent fires terminate event fire terminate event fireterminateevent debug plugin debugplugin manager debug plugin debugplugin get default getdefault manager manager fire debug event set firedebugeventset debug event debugevent debug event debugevent debug event debugevent terminate fires custom model specific event connector ready accept incoming connections remote fire ready to accept event firereadytoacceptevent debug plugin debugplugin manager debug plugin debugplugin get default getdefault manager manager fire debug event set firedebugeventset debug event debugevent debug event debugevent debug event debugevent model specific i java launch configuration constants ijavalaunchconfigurationconstants detail config ready accept remote connection javadoc org eclipse debug core model i process iprocess get streams proxy getstreamsproxy override i streams proxy istreamsproxy get streams proxy getstreamsproxy javadoc org eclipse debug core model i process iprocess get attribute getattribute java lang string override string get attribute getattribute string key javadoc org eclipse debug core model i process iprocess set attribute setattribute java lang string java lang string override set attribute setattribute string key string javadoc org eclipse core runtime i adaptable iadaptable get adapter getadapter java lang override get adapter getadapter adapter job waits incoming connections remote connection accepted debug target created process created job removed wait for connection job waitforconnectionjob job i process iprocess f wait process fwaitprocess list ening connector listeningconnector f connector fconnector map string connector argument f arguments farguments flag job waiting incoming connections can celled cancelled io exceptions ioexceptions allowing threads close socket generating error f list ening stopped flisteningstopped wait for connection job waitforconnectionjob i process iprocess wait process waitprocess list ening connector listeningconnector connector map string connector argument arguments get label getlabel f wait process fwaitprocess wait process waitprocess f connector fconnector connector f arguments farguments arguments override i status istatus i progress monitor iprogressmonitor monitor code sets timeout off icially officially supported sun spec polling job can cellation cancellation implementation support timeout job can celled cancelled launch terminated connector argument timeout nls f arguments farguments nls timeout timeout nls timeout set value setvalue nls virtual machine virtualmachine monitor is canceled iscanceled f connector fconnector accept f arguments farguments transport timeout exception transporttimeoutexception monitor is canceled iscanceled f connector fconnector stop list ening stoplistening f arguments farguments status cancel status i launch configuration ilaunchconfiguration configuration f launch flaunch get launch configuration getlaunchconfiguration allow terminate allowterminate configuration allow terminate allowterminate configuration get attribute getattribute i java launch configuration constants ijavalaunchconfigurationconstants attr terminate core exception coreexception launching plugin launchingplugin log connector argument port arg portarg nls f arguments farguments nls port string vm label vmlabel constructvmlabel port arg portarg f launch flaunch get launch configuration getlaunchconfiguration i debug target idebugtarget debug target debugtarget jdi debug model jdidebugmodel new debug target newdebugtarget f launch flaunch vm label vmlabel allow terminate allowterminate f launch flaunch add debug target adddebugtarget debug target debugtarget f launch flaunch remove process removeprocess f wait process fwaitprocess status status io exception ioexception f list ening stopped flisteningstopped status cancel status get status getstatus launching messages launchingmessages socket listen connector process socketlistenconnectorprocess i java launch configuration constants ijavalaunchconfigurationconstants err remote connection failed illegal connector arguments exception illegalconnectorargumentsexception get status getstatus launching messages launchingmessages socket listen connector process socketlistenconnectorprocess i java launch configuration constants ijavalaunchconfigurationconstants err remote connection failed close socket stop list ening stoplistening javadoc org eclipse core runtime jobs job can celing canceling override can celing canceling stop list ening stoplistening tells list ening listening connector list ening listening ensures socket closed port released sets flag io exception ioexception thrown connector accept method stop list ening stoplistening f list ening stopped flisteningstopped f list ening stopped flisteningstopped f connector fconnector stop list ening stoplistening f arguments farguments io exception ioexception get status getstatus launching messages launchingmessages socket listen connector process socketlistenconnectorprocess i java launch configuration constants ijavalaunchconfigurationconstants err remote connection failed illegal connector arguments exception illegalconnectorargumentsexception get status getstatus launching messages launchingmessages socket listen connector process socketlistenconnectorprocess i java launch configuration constants ijavalaunchconfigurationconstants err remote connection failed helper method constructs human readable label remote param param port port param configuration configuration label string constructvmlabel virtual machine virtualmachine string port i launch configuration ilaunchconfiguration configuration string timeout exception timeoutexception vm disconnected exception vmdisconnectedexception configuration nls configuration get name getname string buffer stringbuffer buffer string buffer stringbuffer buffer append buffer append port buffer append buffer to string tostring