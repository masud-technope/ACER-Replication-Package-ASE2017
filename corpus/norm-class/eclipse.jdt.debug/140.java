copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal debug core org eclipse core resources i save context isavecontext org eclipse core resources i save participant isaveparticipant org eclipse core resources resources plugin resourcesplugin org eclipse core runtime core exception coreexception org eclipse core runtime i safe runnable isaferunnable org eclipse core runtime i status istatus org eclipse core runtime listener list listenerlist org eclipse core runtime platform org eclipse core runtime plugin org eclipse core runtime safe runner saferunner org eclipse core runtime status org eclipse core runtime preferences i eclipse preferences ieclipsepreferences org eclipse core runtime preferences i eclipse preferences ieclipsepreferences preference change event preferencechangeevent org eclipse core runtime preferences instance scope instancescope org eclipse debug core debug exception debugexception org eclipse debug core debug plugin debugplugin org eclipse debug core i launch manager ilaunchmanager org eclipse debug core model i debug target idebugtarget org eclipse jdi bootstrap org eclipse jdt core i java project ijavaproject org eclipse jdt core dom message org eclipse jdt debug core i java breakpoint ijavabreakpoint org eclipse jdt debug core i java breakpoint listener ijavabreakpointlistener org eclipse jdt debug core i java debug target ijavadebugtarget org eclipse jdt debug core i java hot code replace listener ijavahotcodereplacelistener org eclipse jdt debug core i java line breakpoint ijavalinebreakpoint org eclipse jdt debug core i java thread ijavathread org eclipse jdt debug core i java type ijavatype org eclipse jdt debug core jdi debug model jdidebugmodel org eclipse jdt debug eval i ast evaluation engine iastevaluationengine org eclipse jdt internal debug core breakpoints breakpoint listener manager breakpointlistenermanager org eclipse jdt internal debug core hcr java hot code replace manager javahotcodereplacemanager org eclipse jdt internal debug core model jdi debug target jdidebugtarget org eclipse jdt internal debug core model jdi thread jdithread org osgi framework bundle context bundlecontext org osgi service prefs backing store exception backingstoreexception sun jdi virtual machine manager virtualmachinemanager plug jdi debug model plug jdi debug plugin jdidebugplugin plugin i eclipse preferences ieclipsepreferences i preference change listener ipreferencechangelistener int eger integer preference controlling suspend thread string pref breakpoint suspend policy jdi debug plugin jdidebugplugin get unique identifier getuniqueidentifier nls breakpoint suspend policy int eger integer preference controlling suspend option watchpoints string pref watchpoint suspend policy jdi debug plugin jdidebugplugin get unique identifier getuniqueidentifier nls watchpoint suspend policy preference controlling references displayed variables variables expressions view string pref references view jdi debug plugin jdidebugplugin get unique identifier getuniqueidentifier nls references view integer preference determining maximum number references returned user displaying reference string pref references max count jdi debug plugin jdidebugplugin get unique identifier getuniqueidentifier nls references max count integer preference determining maximum number instances returned user displaying instance string pref instances max count jdi debug plugin jdidebugplugin get unique identifier getuniqueidentifier nls instances max count extension point java logical str uctures structures nls string extension point java log ical logical structures java logical structures javalogicalstructures extension point java breakpoint action delegates nls string extension point java breakpoint list eners listeners breakpoint listeners breakpointlisteners status code indicating unexpected error error status code indicating unexpected internal error internal errors displayed user dialogs status text internal error messages translated internal error jdi debug plugin jdidebugplugin f g plugin fgplugin breakpoint listener list listener list listenerlist f breakpoint listeners fbreakpointlisteners breakpoint notification types adding installed removed compilation errors runtime exception plug trace mode extra messages log ged logged trace mode f trace ftrace detected spec ulated speculated jdi version fjdiversion status code debug model retrieve thread eval uations evaluations status handler status handler contributed java debug debug model suspended thread info evaluation thread status retrieve thread i status istatus status evaluation thread status i status istatus info get unique identifier getuniqueidentifier info evaluation thread thread context evaluation nls status code debug model retrieve frame eval uations evaluations status handler status handler contributed java debug debug model suspended thread info evaluation stack frame status retrieve stack frame i status istatus status evaluation frame status i status istatus info get unique identifier getuniqueidentifier info evaluation stack frame thread context evaluation nls manages breakpoint listener extensions breakpoint listener manager breakpointlistenermanager f java breakpoint manager fjavabreakpointmanager returns debug plug trace mode debug plug trace mode is trace mode istracemode f trace ftrace logs message trace mode param message string log log trace message logtracemessage string message get default getdefault is trace mode istracemode i status istatus status i status istatus warning jdi debug plugin jdidebugplugin get unique identifier getuniqueidentifier internal error message get default getdefault get log getlog log singleton instance jdi debug model plug singleton instance jdi debug plugin jdidebugplugin jdi debug plugin jdidebugplugin get default getdefault f g plugin fgplugin convenience method returns unique identifier plug code org eclipse jdt debug code unique jdt debug core plug string get unique identifier getuniqueidentifier nls org eclipse jdt debug returns detected version jdi support intended distinguish clients support jdi methods hot code replace array version numbers major minor getjdiversion fjdiversion fjdiversion virtual machine manager virtualmachinemanager mgr bootstrap virtual machine manager virtualmachinemanager fjdiversion mgr major interface version majorinterfaceversion fjdiversion mgr minor interface version minorinterfaceversion fjdiversion returns jdi version greater equal version major minor param version array version number identifiers compare is jdi version greater than or equal isjdiversiongreaterthanorequal version running version runningversion getjdiversion running version runningversion version running version runningversion version running version runningversion version jdi debug plugin jdidebugplugin f g plugin fgplugin override start bundle context bundlecontext context exception start context jdi debug options jdidebugoptions context resources plugin resourcesplugin get workspace getworkspace add save participant addsaveparticipant get unique identifier getuniqueidentifier i save participant isaveparticipant override done saving donesaving i save context isavecontext override prepare to save preparetosave i save context isavecontext core exception coreexception override rollback i save context isavecontext override saving i save context isavecontext core exception coreexception i eclipse preferences ieclipsepreferences node instance scope instancescope instance get node getnode get unique identifier getuniqueidentifier node node flush backing store exception backingstoreexception bse log bse java hot code replace manager javahotcodereplacemanager get default getdefault startup f breakpoint listeners fbreakpointlisteners listener list listenerlist f java breakpoint manager fjavabreakpointmanager breakpoint listener manager breakpointlistenermanager i eclipse preferences ieclipsepreferences node instance scope instancescope instance get node getnode get unique identifier getuniqueidentifier node node add preference change listener addpreferencechangelistener adds hot code replace listener collection listeners not ified notified hot code replace manager plug param listener listener add add hot code replace listener addhotcodereplacelistener i java hot code replace listener ijavahotcodereplacelistener listener java hot code replace manager javahotcodereplacemanager get default getdefault add hot code replace listener addhotcodereplacelistener listener removes hot code replace listener collection listeners not ified notified hot code replace manager plug param listener listener remove remove hot code replace listener removehotcodereplacelistener i java hot code replace listener ijavahotcodereplacelistener listener java hot code replace manager javahotcodereplacemanager get default getdefault remove hot code replace listener removehotcodereplacelistener listener shutdown hcr manager java debug targets org osgi framework bundle activator bundleactivator org osgi framework bundle context bundlecontext org eclipse core runtime plugin shutdown override bundle context bundlecontext context exception i eclipse preferences ieclipsepreferences node instance scope instancescope instance get node getnode get unique identifier getuniqueidentifier node node remove preference change listener removepreferencechangelistener java hot code replace manager javahotcodereplacemanager get default getdefault shutdown i launch manager ilaunchmanager launch manager launchmanager debug plugin debugplugin get default getdefault get launch manager getlaunchmanager i debug target idebugtarget targets launch manager launchmanager get debug targets getdebugtargets i debug target idebugtarget target targets target jdi debug target jdidebugtarget jdi debug target jdidebugtarget target shutdown f breakpoint listeners fbreakpointlisteners resources plugin resourcesplugin get workspace getworkspace remove save participant removesaveparticipant get unique identifier getuniqueidentifier f g plugin fgplugin context javadoc org eclipse core runtime preferences i eclipse preferences ieclipsepreferences i preference change listener ipreferencechangelistener preference change preferencechange org eclipse core runtime preferences i eclipse preferences ieclipsepreferences preference change event preferencechangeevent override preference change preferencechange preference change event preferencechangeevent event event get key getkey equals jdi debug model jdidebugmodel pref request timeout platform get preferences service getpreferencesservice get int getint jdi debug plugin jdidebugplugin get unique identifier getuniqueidentifier jdi debug model jdidebugmodel pref request timeout jdi debug model jdidebugmodel def request timeout i debug target idebugtarget targets debug plugin debugplugin get default getdefault get launch manager getlaunchmanager get debug targets getdebugtargets i debug target idebugtarget target targets target i java debug target ijavadebugtarget i java debug target ijavadebugtarget target set request timeout setrequesttimeout logs link throwable plug log param link throwable log log throwable throwable top core exception coreexception core exception coreexception core exception coreexception i status istatus status get status getstatus status get exception getexception top status get exception getexception message int entionally intentionally intern ationalized internationalized exception resource bundle log status i status istatus error get unique identifier getuniqueidentifier internal error internal error log ged logged jdi debug nls top logs status plug log param status status log log i status istatus status get default getdefault get log getlog log status param breakpoint breakpoint problems param errors error notify i java breakpoint listener ijavabreakpointlistener breakpoint has runtime exception breakpointhasruntimeexception i java line breakpoint ijavalinebreakpoint debug exception debugexception fire breakpoint has compilation errors firebreakpointhascompilationerrors i java line breakpoint ijavalinebreakpoint breakpoint message errors get breakpoint not ifier getbreakpointnotifier notify breakpoint compilation errors errors param breakpoint breakpoint problems param exception exception notify i java breakpoint listener ijavabreakpointlistener breakpoint has compilation errors breakpointhascompilationerrors i java line breakpoint ijavalinebreakpoint message fire breakpoint has runtime exception firebreakpointhasruntimeexception i java line breakpoint ijavalinebreakpoint breakpoint debug exception debugexception exception get breakpoint not ifier getbreakpointnotifier notify breakpoint runtime exception exception adds breakpoint listener jdi debug model param listener breakpoint listener add java breakpoint listener addjavabreakpointlistener i java breakpoint listener ijavabreakpointlistener listener f breakpoint listeners fbreakpointlisteners add listener removes breakpoint listener jdi debug model param listener breakpoint listener remove java breakpoint listener removejavabreakpointlistener i java breakpoint listener ijavabreakpointlistener listener f breakpoint listeners fbreakpointlisteners remove listener not ifies notifies listeners breakpoint param target java debug target param breakpoint java breakpoint fire breakpoint adding firebreakpointadding i java debug target ijavadebugtarget target i java breakpoint ijavabreakpoint breakpoint get breakpoint not ifier getbreakpointnotifier notify target breakpoint adding not ifies notifies listeners breakpoint installed param target java debug target param breakpoint java breakpoint fire breakpoint installed firebreakpointinstalled i java debug target ijavadebugtarget target i java breakpoint ijavabreakpoint breakpoint get breakpoint not ifier getbreakpointnotifier notify target breakpoint installed not ifies notifies listeners breakpoint removed param target java debug target param breakpoint java breakpoint fire breakpoint removed firebreakpointremoved i java debug target ijavadebugtarget target i java breakpoint ijavabreakpoint breakpoint get breakpoint not ifier getbreakpointnotifier notify target breakpoint removed not ifies notifies listeners breakpoint hit returns thread suspend param thread current thread context param breakpoint java breakpoint thread suspend fire breakpoint hit firebreakpointhit i java thread ijavathread thread i java breakpoint ijavabreakpoint breakpoint get hit not ifier gethitnotifier notify hit notifyhit thread breakpoint not ifies notifies listeners breakpoint installed type returns breakpoint installed param target java debug target param breakpoint java breakpoint param type type breakpoint installed breakpoint installed fire installing fireinstalling i java debug target ijavadebugtarget target i java breakpoint ijavabreakpoint breakpoint i java type ijavatype type get installing not ifier getinstallingnotifier notify installing notifyinstalling target breakpoint type breakpoint not ifier breakpointnotifier get breakpoint not ifier getbreakpointnotifier breakpoint not ifier breakpointnotifier abstract not ifier abstractnotifier i safe runnable isaferunnable i java breakpoint ijavabreakpoint f breakpoint fbreakpoint i java breakpoint listener ijavabreakpointlistener f listener flistener iter ates iterates listeners calling not ifier notifier safe runnable param breakpoint breakpoint notify notify listeners notifylisteners i java breakpoint ijavabreakpoint breakpoint f breakpoint fbreakpoint breakpoint string ids ids breakpoint get breakpoint listeners getbreakpointlisteners core exception coreexception jdi debug plugin jdidebugplugin log breakpoint specific listener extensions ids ids length string ids f listener flistener f java breakpoint manager fjavabreakpointmanager get breakpoint listener getbreakpointlistener f listener flistener safe runner saferunner global listener extensions i java breakpoint listener ijavabreakpointlistener global f java breakpoint manager fjavabreakpointmanager get global listeners getgloballisteners global length i java breakpoint listener ijavabreakpointlistener element global f listener flistener element safe runner saferunner program matic programmatic global listeners object listeners f breakpoint listeners fbreakpointlisteners get listeners getlisteners object listener listeners f listener flistener i java breakpoint listener ijavabreakpointlistener listener safe runner saferunner f breakpoint fbreakpoint f listener flistener returns breakpoint notification proc eeding proceeding code code notification breakpoint code code i java breakpoint ijavabreakpoint get breakpoint getbreakpoint f breakpoint fbreakpoint returns listener notification proc eeding proceeding code code notification loop breakpoint listener code code i java breakpoint listener ijavabreakpointlistener get listener getlistener f listener flistener breakpoint not ifier breakpointnotifier abstract not ifier abstractnotifier i java debug target ijavadebugtarget f target ftarget f kind fkind message f errors ferrors debug exception debugexception f exception fexception org eclipse core runtime i safe runnable isaferunnable handle exception handleexception java lang throwable override handle exception handleexception throwable exception org eclipse core runtime i safe runnable isaferunnable override exception f kind fkind adding get listener getlistener adding breakpoint addingbreakpoint f target ftarget get breakpoint getbreakpoint installed get listener getlistener breakpoint installed breakpointinstalled f target ftarget get breakpoint getbreakpoint removed get listener getlistener breakpoint removed breakpointremoved f target ftarget get breakpoint getbreakpoint compilation errors get listener getlistener breakpoint has compilation errors breakpointhascompilationerrors i java line breakpoint ijavalinebreakpoint get breakpoint getbreakpoint f errors ferrors runtime exception get listener getlistener breakpoint has runtime exception breakpointhasruntimeexception i java line breakpoint ijavalinebreakpoint get breakpoint getbreakpoint f exception fexception not ifies notifies listeners add ition addition install remove param target debug target param breakpoint breakpoint param kind removed installed param errors errors code code param exception exception code code notify i java debug target ijavadebugtarget target i java breakpoint ijavabreakpoint breakpoint kind message errors debug exception debugexception exception f target ftarget target f kind fkind kind f errors ferrors errors f exception fexception exception notify listeners notifylisteners breakpoint f target ftarget f errors ferrors f exception fexception installing not ifier installingnotifier get installing not ifier getinstallingnotifier installing not ifier installingnotifier installing not ifier installingnotifier abstract not ifier abstractnotifier i java debug target ijavadebugtarget f target ftarget i java type ijavatype f type ftype f install finstall override handle exception handleexception throwable exception override exception f install finstall f install finstall get listener getlistener installing breakpoint installingbreakpoint f target ftarget get breakpoint getbreakpoint f type ftype dispose f target ftarget f type ftype not ifies notifies listeners breakpoint installed type returns breakpoint installed param target java debug target param breakpoint java breakpoint param type type breakpoint installed breakpoint installed notify installing notifyinstalling i java debug target ijavadebugtarget target i java breakpoint ijavabreakpoint breakpoint i java type ijavatype type f target ftarget target f type ftype type f install finstall i java breakpoint listener ijavabreakpointlistener dont care notify listeners notifylisteners breakpoint dispose install f install finstall i java breakpoint listener ijavabreakpointlistener install f install finstall i java breakpoint listener ijavabreakpointlistener dont install hit not ifier hitnotifier get hit not ifier gethitnotifier hit not ifier hitnotifier hit not ifier hitnotifier abstract not ifier abstractnotifier i java thread ijavathread f thread fthread f suspend fsuspend override handle exception handleexception throwable exception override exception f thread fthread jdi thread jdithread jdi thread jdithread f thread fthread has client requested suspend hasclientrequestedsuspend abort notification breakpoint listeners client suspend request received f suspend fsuspend f suspend fsuspend i java breakpoint listener ijavabreakpointlistener suspend f suspend fsuspend f suspend fsuspend get listener getlistener breakpoint hit breakpointhit f thread fthread get breakpoint getbreakpoint not ifies notifies listeners breakpoint hit returns thread suspend param thread thread breakpoint hit param breakpoint java breakpoint thread suspend notify hit notifyhit i java thread ijavathread thread i java breakpoint ijavabreakpoint breakpoint f thread fthread thread f suspend fsuspend i java breakpoint listener ijavabreakpointlistener dont care notify listeners notifylisteners breakpoint f thread fthread don suspend f suspend fsuspend i java breakpoint listener ijavabreakpointlistener suspend f suspend fsuspend i java breakpoint listener ijavabreakpointlistener dont suspend returns evaluation engine project debug target code code target i java debug target ijavadebugtarget jdi debug target jdidebugtarget implementation param project java project param target debug target evaluation engine code code i ast evaluation engine iastevaluationengine get evaluation engine getevaluationengine i java project ijavaproject project i java debug target ijavadebugtarget target adapter wrapper i java debug target ijavadebugtarget java target javatarget target get adapter getadapter i java debug target ijavadebugtarget java target javatarget jdi debug target jdidebugtarget jdi debug target jdidebugtarget java target javatarget get evaluation engine getevaluationengine project