copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal debug core breakpoints java util hash map hashmap java util map org eclipse core resources i resource iresource org eclipse core resources i workspace runnable iworkspacerunnable org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime i status istatus org eclipse core runtime platform org eclipse core runtime status org eclipse debug core debug exception debugexception org eclipse debug core debug plugin debugplugin org eclipse debug core model i breakpoint ibreakpoint org eclipse debug core model i debug target idebugtarget org eclipse jdt debug core i java line breakpoint ijavalinebreakpoint org eclipse jdt debug core i java watchpoint ijavawatchpoint org eclipse jdt debug core jdi debug model jdidebugmodel org eclipse jdt internal debug core jdi debug plugin jdidebugplugin org eclipse jdt internal debug core model jdi debug target jdidebugtarget sun jdi field sun jdi object reference objectreference sun jdi reference type referencetype sun jdi thread reference threadreference sun jdi vm disconnected exception vmdisconnectedexception sun jdi event access watchpoint event accesswatchpointevent sun jdi event event sun jdi event event set eventset sun jdi event modification watchpoint event modificationwatchpointevent sun jdi request access watchpoint request accesswatchpointrequest sun jdi request event request eventrequest sun jdi request event request manager eventrequestmanager sun jdi request modification watchpoint request modificationwatchpointrequest sun jdi request watchpoint request watchpointrequest java watchpoint javawatchpoint java line breakpoint javalinebreakpoint i java watchpoint ijavawatchpoint nls string java watchpoint org eclipse jdt debug java watchpoint marker javawatchpointmarker watchpoint attribute storing access code org eclipse jdt debug core access code attribute stored code code indicating watchpoint access watchpoint nls string access org eclipse jdt debug core access watchpoint attribute storing modification code org eclipse jdt debug core modification code attribute stored code code indicating watchpoint modification watchpoint nls string modification org eclipse jdt debug core modification watchpoint attribute storing auto disabled code org eclipse jdt debug core auto disabled code attribute stored code code indicating watchpoint auto disabled opposed disabled explicitly user nls string auto disabled org eclipse jdt debug core auto disabled breakpoint attribute storing field breakpoint code org eclipse jdt debug core field name fieldname code attribute code string code nls string field org eclipse jdt debug core field name fieldname flag indicating breakpoint suspended execution field access integer access event integer flag indicating breakpoint suspended execution field modification integer modification event integer maps debug target suspended breakpoint reason breakpoint suspended reasons include field access code access event code field modification code modification event code hash map hashmap jdi debug target jdidebugtarget integer f last event types flasteventtypes hash map hashmap jdi debug target jdidebugtarget integer java watchpoint javawatchpoint jdi debug model jdidebugmodel create watchpoint createwatchpoint i resource iresource string string map java watchpoint javawatchpoint i resource iresource resource string type name typename string field name fieldname line number linenumber char start charstart char end charend hit count hitcount add map string object attributes debug exception debugexception i workspace runnable iworkspacerunnable i workspace runnable iworkspacerunnable override i progress monitor iprogressmonitor monitor core exception coreexception set marker setmarker resource create marker createmarker java watchpoint add attributes add line breakpoint attributes addlinebreakpointattributes attributes get model identifier getmodelidentifier line number linenumber char start charstart char end charend add type name and hit count addtypenameandhitcount attributes type name typename hit count hitcount attributes suspend policy integer get default suspend policy getdefaultsuspendpolicy configure field handle add field name addfieldname attributes field name fieldname configure access modification flags defaults add default access and modification adddefaultaccessandmodification attributes attributes ensure marker ensuremarker set attributes setattributes attributes register add get marker rule getmarkerrule resource java breakpoint javabreakpoint create request createrequest jdi debug target jdidebugtarget reference type referencetype creates installs access modification watchpoint request reference type config uri ng configuring requests watchpoint requests enabled based watchpoint access watchpoint modification watchpoint requests registered target override create request createrequest jdi debug target jdidebugtarget target reference type referencetype type core exception coreexception should skip breakpoint shouldskipbreakpoint field field field type field by name fieldbyname get field name getfieldname field error access watchpoint request accesswatchpointrequest access request accessrequest modification watchpoint request modificationwatchpointrequest modification request modificationrequest target supports access watch points supportsaccesswatchpoints access request accessrequest create access watchpoint createaccesswatchpoint target field register request registerrequest access request accessrequest target not supported notsupported jdi debug breakpoint messages jdidebugbreakpointmessages java watchpoint javawatchpoint access watchpoints target supports modification watch points supportsmodificationwatchpoints modification request modificationrequest create modification watchpoint createmodificationwatchpoint target field modification request modificationrequest register request registerrequest modification request modificationrequest target not supported notsupported jdi debug breakpoint messages jdidebugbreakpointmessages java watchpoint javawatchpoint modification watchpoints java breakpoint javabreakpoint set request thread filter setrequestthreadfilter event request eventrequest override set request thread filter setrequestthreadfilter event request eventrequest request thread reference threadreference thread watchpoint request watchpointrequest request add thread filter addthreadfilter thread access modification watchpoints supported exception param message message access modification watchpoints supported not supported notsupported string message debug exception debugexception debug exception debugexception status i status istatus error debug plugin debugplugin get unique identifier getuniqueidentifier debug exception debugexception supported message create access watchpoint breakpoint field access watchpoint request accesswatchpointrequest create access watchpoint createaccesswatchpoint jdi debug target jdidebugtarget target field field core exception coreexception access watchpoint request accesswatchpointrequest create watchpoint createwatchpoint target field create modification watchpoint breakpoint field modification watchpoint request modificationwatchpointrequest create modification watchpoint createmodificationwatchpoint jdi debug target jdidebugtarget target field field core exception coreexception modification watchpoint request modificationwatchpointrequest create watchpoint createwatchpoint target field create watchpoint breakpoint field param target target request installed param field field request param access code code access watchpoint created code code modification watchpoint created watchpoint request watchpointrequest access watchpoint request accesswatchpointrequest access code code modification watchpoint request modificationwatchpointrequest access code code watchpoint request watchpointrequest create watchpoint createwatchpoint jdi debug target jdidebugtarget target field field access core exception coreexception watchpoint request watchpointrequest request event request manager eventrequestmanager manager target get event request manager geteventrequestmanager manager target request failed requestfailed jdi debug breakpoint messages jdidebugbreakpointmessages java watchpoint javawatchpoint unable create breakpoint request disconnected access request manager create access watchpoint request createaccesswatchpointrequest field request manager create modification watchpoint request createmodificationwatchpointrequest field configure request configurerequest request target vm disconnected exception vmdisconnectedexception target is available isavailable target internal error internalerror runtime exception runtimeexception target internal error internalerror request java breakpoint javabreakpoint recreate request recreaterequest event request eventrequest jdi debug target jdidebugtarget event request eventrequest recreate request recreaterequest event request eventrequest request jdi debug target jdidebugtarget target core exception coreexception field field watchpoint request watchpointrequest request field request access watchpoint request accesswatchpointrequest request create access watchpoint createaccesswatchpoint target field request modification watchpoint request modificationwatchpointrequest request create modification watchpoint createmodificationwatchpoint target field vm disconnected exception vmdisconnectedexception target is available isavailable request target internal error internalerror request runtime exception runtimeexception target internal error internalerror request i breakpoint ibreakpoint set enabled setenabled watchpoint watching access modification values isn enabled access modification disabled ambiguous override set enabled setenabled enabled core exception coreexception enabled is access isaccess is modification ismodification set default access and modification setdefaultaccessandmodification set enabled setenabled enabled org eclipse debug core model i watchpoint iwatchpoint is access isaccess override is access isaccess core exception coreexception ensure marker ensuremarker get attribute getattribute access sets breakpoint suspend execution field accessed watchpoint disabled watchpoint automatically enabled access modification watchpoint automatically disabled param access suspend field access exception core exception coreexception unable property breakpoint underlying marker org eclipse debug core model i watchpoint iwatchpoint set access setaccess override set access setaccess access core exception coreexception access is access isaccess set attribute setattribute access access access is enabled isenabled set enabled setenabled access is modification ismodification set enabled setenabled recreate org eclipse debug core model i watchpoint iwatchpoint is modification ismodification override is modification ismodification core exception coreexception ensure marker ensuremarker get attribute getattribute modification sets breakpoint suspend execution field modified watchpoint disabled watchpoint automatically enabled access modification watchpoint automatically disabled param modification suspend field modification exception core exception coreexception unable property breakpoint underlying marker org eclipse debug core model i watchpoint iwatchpoint set modification setmodification override set modification setmodification modification core exception coreexception modification is modification ismodification set attribute setattribute modification modification modification is enabled isenabled set enabled setenabled modification is access isaccess set enabled setenabled recreate sets access modification attributes watchpoint values access code code modification code code set default access and modification setdefaultaccessandmodification core exception coreexception def get default access and modification values getdefaultaccessandmodificationvalues object values object def length def length values def string attributes string access modification set attributes setattributes attributes values returns access modification suspend option watchpoint based user preference settings array values pos sibilities possibilities code code access modification enabled code code access enabled modification disabled code code access disabled modification enabled returned array code code array values representing access modification settings get default access and modification values getdefaultaccessandmodificationvalues platform get preferences service getpreferencesservice get int getint jdi debug plugin jdidebugplugin get unique identifier getuniqueidentifier jdi debug plugin jdidebugplugin pref watchpoint suspend policy adds access modification attributes watchpoint map access modification auto disabled add default access and modification adddefaultaccessandmodification map string object attributes values get default access and modification values getdefaultaccessandmodificationvalues attributes access values attributes modification values attributes auto disabled adds field attribute map add field name addfieldname map string object attributes string field name fieldname attributes field field name fieldname i java watchpoint ijavawatchpoint get field name getfieldname override string get field name getfieldname core exception coreexception ensure marker ensuremarker get attribute getattribute field store type event handle superclass correctly generating thread text asked assumes thread text requested event passed breakpoint java breakpoint javabreakpoint handle event handleevent event jdi debug target jdidebugtarget override handle event handleevent event event jdi debug target jdidebugtarget target suspend vote suspendvote event set eventset event set eventset event access watchpoint event accesswatchpointevent f last event types flasteventtypes target access event event modification watchpoint event modificationwatchpointevent f last event types flasteventtypes target modification event handle event handleevent event target suspend vote suspendvote event set eventset java breakpoint javabreakpoint update enabled state updateenabledstate event request eventrequest jdi debug target jdidebugtarget override update enabled state updateenabledstate event request eventrequest request jdi debug target jdidebugtarget target core exception coreexception enabled is enabled isenabled request access watchpoint request accesswatchpointrequest is access isaccess enabled request is enabled isenabled internal update enabled state internalupdateenabledstate request enabled target request is enabled isenabled internal update enabled state internalupdateenabledstate request target request modification watchpoint request modificationwatchpointrequest is modification ismodification enabled request is enabled isenabled internal update enabled state internalupdateenabledstate request enabled target request is enabled isenabled internal update enabled state internalupdateenabledstate request target i java watchpoint ijavawatchpoint is access suspend isaccesssuspend i debug target idebugtarget override is access suspend isaccesssuspend i debug target idebugtarget target integer last event type lasteventtype f last event types flasteventtypes target last event type lasteventtype last event type lasteventtype equals access event i java line breakpoint ijavalinebreakpoint supports condition supportscondition override supports condition supportscondition org eclipse jdt internal debug core breakpoints java breakpoint javabreakpoint remove from target removefromtarget jdi debug target jdidebugtarget override remove from target removefromtarget jdi debug target jdidebugtarget target core exception coreexception f last event types flasteventtypes remove target remove from target removefromtarget target org eclipse jdt internal debug core breakpoints java breakpoint javabreakpoint add instance filter addinstancefilter event request eventrequest object reference objectreference override add instance filter addinstancefilter event request eventrequest request object reference objectreference object request watchpoint request watchpointrequest watchpoint request watchpointrequest request add instance filter addinstancefilter object javadoc org eclipse debug core model i watchpoint iwatchpoint supports access supportsaccess override supports access supportsaccess javadoc org eclipse debug core model i watchpoint iwatchpoint supports modification supportsmodification override supports modification supportsmodification javadoc org eclipse jdt internal debug core breakpoints java breakpoint javabreakpoint install able reference type installablereferencetype sun jdi reference type referencetype org eclipse jdt internal debug core model jdi debug target jdidebugtarget override install able reference type installablereferencetype reference type referencetype type jdi debug target jdidebugtarget target core exception coreexception string install able type installabletype get type name gettypename string queried type queriedtype type install able type installabletype queried type queriedtype install able type installabletype equals queried type queriedtype query install listeners queryinstalllisteners target type