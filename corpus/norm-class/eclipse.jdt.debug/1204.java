copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal debug actions org eclipse core runtime core exception coreexception org eclipse debug core debug event debugevent org eclipse debug core debug exception debugexception org eclipse debug core debug plugin debugplugin org eclipse debug core i debug event filter idebugeventfilter org eclipse jdt core i method imethod org eclipse jdt core java model exception javamodelexception org eclipse jdt core signature org eclipse jdt debug core i java debug target ijavadebugtarget org eclipse jdt debug core i java stack frame ijavastackframe org eclipse jdt debug core i java thread ijavathread org eclipse jdt internal debug jdidebuguiplugin org eclipse jface dialogs message dialog messagedialog org eclipse osgi util nls handles stepping selected method specific thread step into selection handler stepintoselectionhandler i debug event filter idebugeventfilter method step i method imethod f method fmethod resolved signature method step string f resolved signature fresolvedsignature thread step i java thread ijavathread f thread fthread initial stack frame string f original name foriginalname string f original signature foriginalsignature string f original type name foriginaltypename f original stack depth foriginalstackdepth step f first step ffirststep step filters step f step filter enabled state fstepfilterenabledstate expected event kind f expected kind fexpectedkind expected event detail f expected detail fexpecteddetail constructs step handler step method thread starting stack frame step into selection handler stepintoselectionhandler i java thread ijavathread thread i java stack frame ijavastackframe frame i method imethod method f method fmethod method f thread fthread thread f original name foriginalname frame get name getname f original signature foriginalsignature frame get signature getsignature f original type name foriginaltypename frame get declaring type name getdeclaringtypename method is binary isbinary f resolved signature fresolvedsignature method get signature getsignature f resolved signature fresolvedsignature toggle breakpoint adapter togglebreakpointadapter resolve method signature resolvemethodsignature method core exception coreexception jdidebuguiplugin log returns target thread step target thread step i java thread ijavathread get thread getthread f thread fthread i java debug target ijavadebugtarget get debug target getdebugtarget i java debug target ijavadebugtarget get thread getthread get debug target getdebugtarget returns method step method step i method imethod get method getmethod f method fmethod returns resolved signature method step resolved signature method step string get signature getsignature f resolved signature fresolvedsignature org eclipse debug core i debug event filter idebugeventfilter filter debug events filterdebugevents org eclipse debug core debug event debugevent override debug event debugevent filter debug events filterdebugevents debug event debugevent events expect event thread find event debug event debugevent event thread events threadevents events length debug event debugevent events is expected event isexpectedevent event thread events threadevents get source getsource get thread getthread thread events threadevents event process event events create filtered event debug event debugevent filtered debug event debugevent events length filtered length events length filtered events event thread abort filtering event thread events threadevents cleanup filtered expected event process event get kind getkind debug event debugevent resume expect step set expected event setexpectedevent debug event debugevent suspend debug event debugevent step f first step ffirststep f first step ffirststep include resume event events secondary step filter event filtered debug event debugevent suspend compare location desired location i java stack frame ijavastackframe frame i java stack frame ijavastackframe get thread getthread get top stack frame gettopstackframe stack depth stackdepth frame get thread getthread get stack frames getstackframes length string frame is constructor isconstructor frame get declaring type name getdeclaringtypename last index of lastindexof substring frame get name getname equals get method getmethod get element name getelementname frame get signature getsignature equals get signature getsignature hit cleanup events step runnable stack depth stackdepth f original stack depth foriginalstackdepth frame is synthetic issynthetic step synthetic methods runnable override set expected event setexpectedevent debug event debugevent resume debug event debugevent step frame step into stepinto debug exception debugexception jdidebuguiplugin log cleanup debug plugin debugplugin get default getdefault fire debug event set firedebugeventset debug event debugevent debug event debugevent get debug target getdebugtarget debug event debugevent change runnable override set expected event setexpectedevent debug event debugevent resume debug event debugevent step frame step return stepreturn debug exception debugexception jdidebuguiplugin log cleanup debug plugin debugplugin get default getdefault fire debug event set firedebugeventset debug event debugevent debug event debugevent get debug target getdebugtarget debug event debugevent change stack depth stackdepth f original stack depth foriginalstackdepth original stack frame abort frame get signature getsignature equals f original signature foriginalsignature frame get name getname equals f original name foriginalname frame get declaring type name getdeclaringtypename equals f original type name foriginaltypename missed events runnable override set expected event setexpectedevent debug event debugevent resume debug event debugevent step frame step into stepinto debug exception debugexception jdidebuguiplugin log cleanup debug plugin debugplugin get default getdefault fire debug event set firedebugeventset debug event debugevent debug event debugevent get debug target getdebugtarget debug event debugevent change returned original frame hit desired method missed events debug plugin debugplugin get default getdefault async exec asyncexec filter events filtered core exception coreexception jdidebuguiplugin log cleanup events execution reach events called stepping returned original frame entering desired method missed cleanup runnable runnable override string method name methodname method name methodname signature to string tostring get method getmethod get signature getsignature get method getmethod get element name getelementname get method getmethod get parameter names getparameternames java model exception javamodelexception method name methodname get method getmethod get element name getelementname message dialog messagedialog jdidebuguiplugin get active workbench shell getactiveworkbenchshell action messages actionmessages step into selection handler stepintoselectionhandler nls bind action messages actionmessages step into selection handler stepintoselectionhandler execution enter current method returned string method name methodname message dialog messagedialog string action messages actionmessages step into selection handler stepintoselectionhandler open jdidebuguiplugin get standard display getstandarddisplay async exec asyncexec performs step step add event filter turn step filters debug plugin debugplugin get default getdefault add debug event filter adddebugeventfilter f step filter enabled state fstepfilterenabledstate get debug target getdebugtarget is step filters enabled isstepfiltersenabled get debug target getdebugtarget set step filters enabled setstepfiltersenabled f original stack depth foriginalstackdepth get thread getthread get stack frames getstackframes length set expected event setexpectedevent debug event debugevent resume debug event debugevent step get thread getthread step into stepinto debug exception debugexception jdidebuguiplugin log cleanup debug plugin debugplugin get default getdefault fire debug event set firedebugeventset debug event debugevent debug event debugevent get debug target getdebugtarget debug event debugevent change cleans step complete aborted cleanup debug plugin debugplugin get default getdefault remove debug event filter removedebugeventfilter restore step filter get debug target getdebugtarget set step filters enabled setstepfiltersenabled f step filter enabled state fstepfilterenabledstate sets expected debug event kind detail waiting param kind event kind param detail event detail set expected event setexpectedevent kind detail f expected kind fexpectedkind kind f expected detail fexpecteddetail detail returns event expected param event fire event event expected is expected event isexpectedevent debug event debugevent event event get source getsource equals get thread getthread event get kind getkind f expected kind fexpectedkind event get detail getdetail f expected detail fexpecteddetail