copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation jesper steen moller enhancement filter get ters getters set ters setters org eclipse jdt internal debug java util array list arraylist java util hash set hashset java util list java util java util string tokenizer stringtokenizer org eclipse core resources i marker imarker org eclipse core resources i marker delta imarkerdelta org eclipse core resources i resource iresource org eclipse core resources i workspace runnable iworkspacerunnable org eclipse core resources resources plugin resourcesplugin org eclipse core runtime core exception coreexception org eclipse core runtime i adaptable iadaptable org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime i status istatus org eclipse core runtime multi status multistatus org eclipse core runtime status org eclipse core runtime jobs job org eclipse debug core debug event debugevent org eclipse debug core debug exception debugexception org eclipse debug core debug plugin debugplugin org eclipse debug core i breakpoints listener ibreakpointslistener org eclipse debug core i debug event set listener idebugeventsetlistener org eclipse debug core i launch ilaunch org eclipse debug core i launch configuration ilaunchconfiguration org eclipse debug core i launch listener ilaunchlistener org eclipse debug core model i breakpoint ibreakpoint org eclipse debug core model i debug target idebugtarget org eclipse debug debuguitools org eclipse debug source lookup sourcelookup i source lookup result isourcelookupresult org eclipse jdt core dom message org eclipse jdt debug core i java breakpoint ijavabreakpoint org eclipse jdt debug core i java breakpoint listener ijavabreakpointlistener org eclipse jdt debug core i java debug target ijavadebugtarget org eclipse jdt debug core i java exception breakpoint ijavaexceptionbreakpoint org eclipse jdt debug core i java line breakpoint ijavalinebreakpoint org eclipse jdt debug core i java method breakpoint ijavamethodbreakpoint org eclipse jdt debug core i java method entry breakpoint ijavamethodentrybreakpoint org eclipse jdt debug core i java stack frame ijavastackframe org eclipse jdt debug core i java thread ijavathread org eclipse jdt debug core i java type ijavatype org eclipse jdt debug core i java watchpoint ijavawatchpoint org eclipse jdt debug core jdi debug model jdidebugmodel org eclipse jdt debug i java debug constants ijavadebuguiconstants org eclipse jdt internal debug core breakpoints java exception breakpoint javaexceptionbreakpoint org eclipse jdt internal debug core log icalstructures logicalstructures i java structures listener ijavastructureslistener org eclipse jdt internal debug core log icalstructures logicalstructures java logical structures javalogicalstructures org eclipse jdt internal debug actions java breakpoint properties action javabreakpointpropertiesaction org eclipse jdt internal debug breakpoints suspend on compilation error listener suspendoncompilationerrorlistener org eclipse jdt internal debug breakpoints suspend on uncaught exception listener suspendonuncaughtexceptionlistener org eclipse jdt internal debug snippet editor snippeteditor scrapbook launcher scrapbooklauncher org eclipse jface preference i preference store ipreferencestore org eclipse jface util i property change listener ipropertychangelistener org eclipse jface util property change event propertychangeevent org eclipse jface viewers i label provider ilabelprovider org eclipse jface viewers structured selection structuredselection org eclipse jface window window org eclipse osgi util nls org eclipse swt widgets display org eclipse swt widgets shell sun jdi invocation exception invocationexception sun jdi object reference objectreference manages options java debug ger debugger suspend compilation errors suspend uncaught exceptions step filters sets system property java debug ger debugger active launches running debug targets java debug action visibility java debug options manager javadebugoptionsmanager i debug event set listener idebugeventsetlistener i property change listener ipropertychangelistener i java breakpoint listener ijavabreakpointlistener i launch listener ilaunchlistener i breakpoints listener ibreakpointslistener i java structures listener ijavastructureslistener singleton options manager java debug options manager javadebugoptionsmanager fg options manager fgoptionsmanager breakpoint suspend uncaught exceptions i java exception breakpoint ijavaexceptionbreakpoint f suspend on exception breakpoint fsuspendonexceptionbreakpoint breakpoint suspend compilation errors i java exception breakpoint ijavaexceptionbreakpoint f suspend on error breakpoint fsuspendonerrorbreakpoint label provider i label provider ilabelprovider f label provider flabelprovider debuguitools new debug model presentation newdebugmodelpresentation constants indicating breakpoint removed changed removed changed local cache active step filters string f active step filters factivestepfilters preferences affect variable display options string fg display options fgdisplayoptions fg display options fgdisplayoptions hash set hashset string fg display options fgdisplayoptions add ijdi preferences constants ijdipreferencesconstants pref fg display options fgdisplayoptions add ijdi preferences constants ijdipreferencesconstants pref hex fg display options fgdisplayoptions add ijdi preferences constants ijdipreferencesconstants pref unsigned manager activated f activated factivated init job initjob job init job initjob debuguimessages java debug options manager javadebugoptionsmanager override i status istatus i progress monitor iprogressmonitor monitor nls multi status multistatus status multi status multistatus jdidebuguiplugin get unique identifier getuniqueidentifier i java debug constants ijavadebuguiconstants internal error java debug options failed initialize compilation error breakpoint i java exception breakpoint ijavaexceptionbreakpoint nls jdi debug model jdidebugmodel create exception breakpoint createexceptionbreakpoint nls resources plugin resourcesplugin get workspace getworkspace get root getroot nls java lang error nls nls nls nls nls set per sisted setpersisted add breakpoint listener addbreakpointlistener suspend on compilation error listener suspendoncompilationerrorlistener compilation error list ener listener set suspend on compilation errors breakpoint setsuspendoncompilationerrorsbreakpoint core exception coreexception status add get status getstatus uncaught exception breakpoint i java exception breakpoint ijavaexceptionbreakpoint nls jdi debug model jdidebugmodel create exception breakpoint createexceptionbreakpoint nls resources plugin resourcesplugin get workspace getworkspace get root getroot nls java lang throwable nls nls nls nls nls java exception breakpoint javaexceptionbreakpoint set suspend on subclasses setsuspendonsubclasses set per sisted setpersisted add breakpoint listener addbreakpointlistener suspend on uncaught exception listener suspendonuncaughtexceptionlistener uncaught exception list ener listener set suspend on uncaught exception breakpoint setsuspendonuncaughtexceptionbreakpoint core exception coreexception status add get status getstatus status get children getchildren length status status status instantiated java debug options manager javadebugoptionsmanager get default getdefault java debug options manager javadebugoptionsmanager options manager java debug options manager javadebugoptionsmanager get default getdefault fg options manager fgoptionsmanager fg options manager fgoptionsmanager java debug options manager javadebugoptionsmanager fg options manager fgoptionsmanager called startup java debug plug startup lazy initialization occur launch debug plugin debugplugin debug plugin debugplugin debug plugin debugplugin get default getdefault debug plugin debugplugin get launch manager getlaunchmanager add launch listener addlaunchlistener debug plugin debugplugin get breakpoint manager getbreakpointmanager add breakpoint listener addbreakpointlistener evaluation context manager evaluationcontextmanager startup called shutdown java debug plug shutdown debug plugin debugplugin debug plugin debugplugin debug plugin debugplugin get default getdefault debug plugin debugplugin remove debug event listener removedebugeventlistener debug plugin debugplugin get launch manager getlaunchmanager remove launch listener removelaunchlistener debug plugin debugplugin get breakpoint manager getbreakpointmanager remove breakpoint listener removebreakpointlistener jdidebuguiplugin get default getdefault is shutting down isshuttingdown avert res toring restoring preference store shutdown jdidebuguiplugin get default getdefault get preference store getpreferencestore remove property change listener removepropertychangelistener jdi debug model jdidebugmodel remove java breakpoint listener removejavabreakpointlistener java logical structures javalogicalstructures remove structures listener removestructureslistener nls system get properties getproperties remove jdidebuguiplugin get unique identifier getuniqueidentifier debug ger active debuggeractive initializes compilation error handling suspending uncaught exceptions initialize problem handling initializeproblemhandling init job initjob job init job initjob job set system setsystem job schedule not ifies notifies java debug targets breakpoint add ition addition removal param breakpoint breakpoint param kind removed changed notify targets notifytargets i breakpoint ibreakpoint breakpoint kind i debug target idebugtarget targets debug plugin debugplugin get default getdefault get launch manager getlaunchmanager get debug targets getdebugtargets targets length targets i java debug target ijavadebugtarget i java debug target ijavadebugtarget target i java debug target ijavadebugtarget targets notify target notifytarget target breakpoint kind not ifies notifies debug target filter specific ations specifications param target java debug target notify target of filters notifytargetoffilters i java debug target ijavadebugtarget target i preference store ipreferencestore store jdidebuguiplugin get default getdefault get preference store getpreferencestore target set filter constructors setfilterconstructors store get boolean getboolean ijdi preferences constants ijdipreferencesconstants pref filter constructors target set filter static initializers setfilterstaticinitializers store get boolean getboolean ijdi preferences constants ijdipreferencesconstants pref filter initializers target set filter synthetics setfiltersynthetics store get boolean getboolean ijdi preferences constants ijdipreferencesconstants pref filter synthetics target set filter get ters setfiltergetters store get boolean getboolean ijdi preferences constants ijdipreferencesconstants pref filter get ters getters target set filter set ters setfiltersetters store get boolean getboolean ijdi preferences constants ijdipreferencesconstants pref filter set ters setters target set step thru filters setstepthrufilters store get boolean getboolean ijdi preferences constants ijdipreferencesconstants pref step filters target set step filters setstepfilters get active step filters getactivestepfilters not ifies notifies targets current filter specific ations specifications notify targets of filters notifytargetsoffilters i debug target idebugtarget targets debug plugin debugplugin get default getdefault get launch manager getlaunchmanager get debug targets getdebugtargets targets length targets i java debug target ijavadebugtarget i java debug target ijavadebugtarget target i java debug target ijavadebugtarget targets notify target of filters notifytargetoffilters target not ifies notifies target breakpoint add ition addition removal param target java debug target param breakpoint breakpoint param kind removed changed notify target notifytarget i java debug target ijavadebugtarget target i breakpoint ibreakpoint breakpoint kind kind target breakpoint added breakpointadded breakpoint removed target breakpoint removed breakpointremoved breakpoint changed target breakpoint changed breakpointchanged breakpoint i property change listener ipropertychangelistener property change propertychange property change event propertychangeevent override property change propertychange property change event propertychangeevent event string property event get property getproperty property equals ijdi preferences constants ijdipreferencesconstants pref suspend compilation errors i breakpoint ibreakpoint breakpoint get suspend on compilation error breakpoint getsuspendoncompilationerrorbreakpoint breakpoint kind removed is suspend on compilation errors issuspendoncompilationerrors kind notify targets notifytargets breakpoint kind property equals ijdi preferences constants ijdipreferencesconstants pref suspend uncaught exceptions i breakpoint ibreakpoint breakpoint get suspend on uncaught exception breakpoint getsuspendonuncaughtexceptionbreakpoint breakpoint kind removed is suspend on uncaught exceptions issuspendonuncaughtexceptions kind notify targets notifytargets breakpoint kind fg display options fgdisplayoptions property variable view settings changed variableviewsettingschanged is use filter property isusefilterproperty property notify targets of filters notifytargetsoffilters is filter list property isfilterlistproperty property update active filters updateactivefilters returns property property step filters is use filter property isusefilterproperty string property property equals ijdi preferences constants ijdipreferencesconstants pref filter constructors property equals ijdi preferences constants ijdipreferencesconstants pref filter initializers property equals ijdi preferences constants ijdipreferencesconstants pref filter get ters getters property equals ijdi preferences constants ijdipreferencesconstants pref filter set ters setters property equals ijdi preferences constants ijdipreferencesconstants pref filter synthetics property equals ijdi preferences constants ijdipreferencesconstants pref step filters returns property property list active inactive step filters is filter list property isfilterlistproperty string property property equals ijdi preferences constants ijdipreferencesconstants pref active filters list property equals ijdi preferences constants ijdipreferencesconstants pref inactive filters list enable disable breakpoint notify targets change param breakpoint breakpoint param enabled enabeld set enabled setenabled i breakpoint ibreakpoint breakpoint enabled breakpoint set enabled setenabled enabled notify targets notifytargets breakpoint changed core exception coreexception jdidebuguiplugin log returns suspend compilation errors enabled suspend compilation errors enabled is suspend on compilation errors issuspendoncompilationerrors jdidebuguiplugin get default getdefault get preference store getpreferencestore get boolean getboolean ijdi preferences constants ijdipreferencesconstants pref suspend compilation errors returns suspend uncaught exception enabled suspend uncaught exception enabled is suspend on uncaught exceptions issuspendonuncaughtexceptions jdidebuguiplugin get default getdefault get preference store getpreferencestore get boolean getboolean ijdi preferences constants ijdipreferencesconstants pref suspend uncaught exceptions sets breakpoint suspend uncaught exceptions param breakpoint exception breakpoint set suspend on uncaught exception breakpoint setsuspendonuncaughtexceptionbreakpoint i java exception breakpoint ijavaexceptionbreakpoint breakpoint f suspend on exception breakpoint fsuspendonexceptionbreakpoint breakpoint returns breakpoint suspend uncaught exceptions exception breakpoint i java exception breakpoint ijavaexceptionbreakpoint get suspend on uncaught exception breakpoint getsuspendonuncaughtexceptionbreakpoint f suspend on exception breakpoint fsuspendonexceptionbreakpoint sets breakpoint suspend compilation errors param breakpoint exception breakpoint set suspend on compilation errors breakpoint setsuspendoncompilationerrorsbreakpoint i java exception breakpoint ijavaexceptionbreakpoint breakpoint f suspend on error breakpoint fsuspendonerrorbreakpoint breakpoint returns breakpoint suspend compilation errors exception breakpoint i java exception breakpoint ijavaexceptionbreakpoint get suspend on compilation error breakpoint getsuspendoncompilationerrorbreakpoint f suspend on error breakpoint fsuspendonerrorbreakpoint parses comma separated string array strings list string parse list parselist string list string liststring list string list array list arraylist string nls string tokenizer stringtokenizer tokenizer string tokenizer stringtokenizer list string liststring tokenizer has more tokens hasmoretokens string token tokenizer next token nexttoken list add token list to array toarray string list size serial izes serializes array strings comma separated string param list array strings single string comp osed composed list string serialize list serializelist string list list nls string buffer stringbuffer buffer string buffer stringbuffer list length buffer append buffer append list buffer to string tostring returns current list active step filters current list active step filters string get active step filters getactivestepfilters f active step filters factivestepfilters f active step filters factivestepfilters parse list parselist jdidebuguiplugin get default getdefault get preference store getpreferencestore get string getstring ijdi preferences constants ijdipreferencesconstants pref active filters list active filters cached register hear jdidebuguiplugin get default getdefault get preference store getpreferencestore add property change listener addpropertychangelistener f active step filters factivestepfilters updates local copy active step filters not ifies notifies targets update active filters updateactivefilters f active step filters factivestepfilters parse list parselist jdidebuguiplugin get default getdefault get preference store getpreferencestore get string getstring ijdi preferences constants ijdipreferencesconstants pref active filters list notify targets of filters notifytargetsoffilters java debug target created install options target java debug ger debugger active java debug targets terminated java debug ger debugger longer active i debug event set listener idebugeventsetlistener handle debug events handledebugevents debug event debugevent override handle debug events handledebugevents debug event debugevent events events length debug event debugevent event events event get kind getkind debug event debugevent create object source event get source getsource source i java debug target ijavadebugtarget i java debug target ijavadebugtarget java target javatarget i java debug target ijavadebugtarget source compilation breakpoints is suspend on compilation errors issuspendoncompilationerrors notify target notifytarget java target javatarget get suspend on compilation error breakpoint getsuspendoncompilationerrorbreakpoint uncaught exception breakpoint is suspend on uncaught exceptions issuspendonuncaughtexceptions i launch configuration ilaunchconfiguration launch configuration launchconfiguration java target javatarget get launch getlaunch get launch configuration getlaunchconfiguration is snippet editor issnippeteditor is snippet editor issnippeteditor launch configuration launchconfiguration get attribute getattribute scrapbook launcher scrapbooklauncher scrapbook launch string core exception coreexception is snippet editor issnippeteditor notify target notifytarget java target javatarget get suspend on uncaught exception breakpoint getsuspendonuncaughtexceptionbreakpoint step filters notify target of filters notifytargetoffilters java target javatarget i java breakpoint listener ijavabreakpointlistener adding breakpoint addingbreakpoint i java debug target ijavadebugtarget i java breakpoint ijavabreakpoint override adding breakpoint addingbreakpoint i java debug target ijavadebugtarget target i java breakpoint ijavabreakpoint breakpoint i java breakpoint listener ijavabreakpointlistener installing breakpoint installingbreakpoint i java debug target ijavadebugtarget i java breakpoint ijavabreakpoint i java type ijavatype override installing breakpoint installingbreakpoint i java debug target ijavadebugtarget target i java breakpoint ijavabreakpoint breakpoint i java type ijavatype type dont care i java breakpoint listener ijavabreakpointlistener breakpoint hit breakpointhit i java thread ijavathread i java breakpoint ijavabreakpoint override breakpoint hit breakpointhit i java thread ijavathread thread i java breakpoint ijavabreakpoint breakpoint dont care i java breakpoint listener ijavabreakpointlistener breakpoint installed breakpointinstalled i java debug target ijavadebugtarget i java breakpoint ijavabreakpoint override breakpoint installed breakpointinstalled i java debug target ijavadebugtarget target i java breakpoint ijavabreakpoint breakpoint i java breakpoint listener ijavabreakpointlistener breakpoint removed breakpointremoved i java debug target ijavadebugtarget i java breakpoint ijavabreakpoint override breakpoint removed breakpointremoved i java debug target ijavadebugtarget target i java breakpoint ijavabreakpoint breakpoint returns problem marker current location stack frame code code param frame stack frame marker representing compilation problem code code debug exception debugexception exception occurrs ret rieveing retrieveing problem i marker imarker get problem getproblem i java stack frame ijavastackframe frame i launch ilaunch launch frame get launch getlaunch launch i source lookup result isourcelookupresult result debuguitools lookup source lookupsource frame object source element sourceelement result get source element getsourceelement source element sourceelement i resource iresource i resource iresource resource i resource iresource source element sourceelement i marker imarker markers resource find markers findmarkers org eclipse jdt core problem nls i resource iresource depth infinite frame get line number getlinenumber markers length i marker imarker marker markers marker get attribute getattribute i marker imarker number marker get attribute getattribute i marker imarker severity i marker imarker severity error marker core exception coreexception javadoc org eclipse jdt debug core i java breakpoint listener ijavabreakpointlistener breakpoint has runtime exception breakpointhasruntimeexception org eclipse jdt debug core i java line breakpoint ijavalinebreakpoint org eclipse debug core debug exception debugexception override breakpoint has runtime exception breakpointhasruntimeexception i java line breakpoint ijavalinebreakpoint breakpoint debug exception debugexception exception i status istatus status throwable wrapped exception wrappedexception exception get status getstatus get exception getexception wrapped exception wrappedexception invocation exception invocationexception invocation exception invocationexception invocation exception invocationexception wrapped exception wrappedexception object reference objectreference exception status status i status istatus error jdidebuguiplugin get unique identifier getuniqueidentifier i status istatus error reference type referencetype status exception get status getstatus open condition error dialog openconditionerrordialog breakpoint debuguimessages java debug options manager javadebugoptionsmanager conditional breakpoint encountered runtime exception status javadoc org eclipse jdt debug core i java breakpoint listener ijavabreakpointlistener breakpoint has compilation errors breakpointhascompilationerrors org eclipse jdt debug core i java line breakpoint ijavalinebreakpoint org eclipse jdt core dom message override breakpoint has compilation errors breakpointhascompilationerrors i java line breakpoint ijavalinebreakpoint breakpoint message errors string buffer stringbuffer message string buffer stringbuffer message error num errors numerrors errors length num errors numerrors error errors message append error get message getmessage nls message append i status istatus status status i status istatus error jdidebuguiplugin get unique identifier getuniqueidentifier i status istatus error message to string tostring open condition error dialog openconditionerrordialog breakpoint debuguimessages java debug options manager javadebugoptionsmanager conditional breakpoint compilation error status open condition error dialog openconditionerrordialog i java line breakpoint ijavalinebreakpoint breakpoint string error message errormessage i status istatus status display display jdidebuguiplugin get standard display getstandarddisplay display is disposed isdisposed string message nls bind error message errormessage string f label provider flabelprovider get text gettext breakpoint display async exec asyncexec runnable override display is disposed isdisposed shell shell jdidebuguiplugin get active workbench shell getactiveworkbenchshell conditional breakpoint error dialog conditionalbreakpointerrordialog dialog conditional breakpoint error dialog conditionalbreakpointerrordialog shell message status result dialog open result window java breakpoint properties action javabreakpointpropertiesaction action java breakpoint properties action javabreakpointpropertiesaction action selection changed selectionchanged structured selection structuredselection breakpoint action activates debug options manager active manager listener not ifications notifications updates running debug targets based not ifications notifications debug options manager activated running debug target activate f activated factivated f activated factivated initialize problem handling initializeproblemhandling notify targets of filters notifytargetsoffilters debug plugin debugplugin get default getdefault add debug event listener adddebugeventlistener jdi debug model jdidebugmodel add java breakpoint listener addjavabreakpointlistener java logical structures javalogicalstructures add structures listener addstructureslistener startup problem handling launch i launch listener ilaunchlistener launch added launchadded i launch ilaunch override launch added launchadded i launch ilaunch launch launch changed launchchanged launch i launch listener ilaunchlistener launch changed launchchanged i launch ilaunch override launch changed launchchanged i launch ilaunch launch activate debug plugin debugplugin get default getdefault get launch manager getlaunchmanager remove launch listener removelaunchlistener i launch listener ilaunchlistener launch removed launchremoved i launch ilaunch override launch removed launchremoved i launch ilaunch launch adds message attributes java breakpoints org eclipse debug core i breakpoints listener ibreakpointslistener breakpoints added breakpointsadded org eclipse debug core model i breakpoint ibreakpoint override breakpoints added breakpointsadded i breakpoint ibreakpoint breakpoints breakpoint message update list i breakpoint ibreakpoint update array list arraylist i breakpoint ibreakpoint breakpoints length i breakpoint ibreakpoint breakpoint breakpoints breakpoint i java breakpoint ijavabreakpoint breakpoint get marker getmarker get attribute getattribute i marker imarker message update add breakpoint core exception coreexception jdidebuguiplugin log update is empty isempty update breakpoint messages updatebreakpointmessages update to array toarray i breakpoint ibreakpoint update size updates message attributes java breakpoints org eclipse debug core i breakpoints listener ibreakpointslistener breakpoints added breakpointsadded org eclipse debug core model i breakpoint ibreakpoint update breakpoint messages updatebreakpointmessages i breakpoint ibreakpoint breakpoints i workspace runnable iworkspacerunnable runnable i workspace runnable iworkspacerunnable override i progress monitor iprogressmonitor monitor core exception coreexception breakpoints length i breakpoint ibreakpoint breakpoint breakpoints breakpoint i java breakpoint ijavabreakpoint string info f label provider flabelprovider get text gettext breakpoint string type debuguimessages java debug options manager javadebugoptionsmanager breakpoint breakpoint i java method breakpoint ijavamethodbreakpoint breakpoint i java method entry breakpoint ijavamethodentrybreakpoint type debuguimessages java debug options manager javadebugoptionsmanager method breakpoint breakpoint i java watchpoint ijavawatchpoint type debuguimessages java debug options manager javadebugoptionsmanager watchpoint breakpoint i java line breakpoint ijavalinebreakpoint type debuguimessages java debug options manager javadebugoptionsmanager breakpoint breakpoint get marker getmarker set attribute setattribute i marker imarker message type info resources plugin resourcesplugin get workspace getworkspace runnable core exception coreexception jdidebuguiplugin log updates message attributes java breakpoints org eclipse debug core i breakpoints listener ibreakpointslistener breakpoints changed breakpointschanged org eclipse debug core model i breakpoint ibreakpoint org eclipse core resources i marker delta imarkerdelta override breakpoints changed breakpointschanged i breakpoint ibreakpoint breakpoints i marker delta imarkerdelta deltas update breakpoint messages updatebreakpointmessages breakpoints javadoc org eclipse debug core i breakpoints listener ibreakpointslistener breakpoints removed breakpointsremoved org eclipse debug core model i breakpoint ibreakpoint org eclipse core resources i marker delta imarkerdelta override breakpoints removed breakpointsremoved i breakpoint ibreakpoint breakpoints i marker delta imarkerdelta deltas javadoc org eclipse jdt internal debug core log icalstructures logicalstructures i java structures listener ijavastructureslistener logical structures changed logicalstructureschanged override logical structures changed logicalstructureschanged variable view settings changed variableviewsettingschanged ref res hes refreshes variables view firing change event stack frame active debug context variable view settings changed variableviewsettingschanged java stack frame selected debug view fire change event variables view update structure i adaptable iadaptable selected debuguitools get debug context getdebugcontext selected i java stack frame ijavastackframe frame selected get adapter getadapter i java stack frame ijavastackframe frame debug plugin debugplugin get default getdefault fire debug event set firedebugeventset debug event debugevent debug event debugevent frame debug event debugevent change