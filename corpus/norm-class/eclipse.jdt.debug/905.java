copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal debug core java util array list arraylist java util hash map hashmap java util iterator java util list java util map org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime i status istatus org eclipse core runtime status org eclipse core runtime jobs job org eclipse debug core debug event debugevent org eclipse debug core debug exception debugexception org eclipse debug core debug plugin debugplugin org eclipse jdt debug core i java line breakpoint ijavalinebreakpoint org eclipse jdt internal debug core model jdi debug target jdidebugtarget sun jdi vm disconnected exception vmdisconnectedexception sun jdi virtual machine virtualmachine sun jdi event event sun jdi event event iterator eventiterator sun jdi event event queue eventqueue sun jdi event event set eventset sun jdi event vm death event vmdeathevent sun jdi event vm disconnect event vmdisconnectevent sun jdi event vm start event vmstartevent sun jdi request event request eventrequest event dispatcher eventdispatcher runnable debug target event dispatcher belongs jdi debug target jdidebugtarget f target ftarget dispatcher shutdown f shutdown fshutdown table event listeners table mapping code event request eventrequest code code ijdi event listener ijdieventlistener code hash map hashmap event request eventrequest ijdi event listener ijdieventlistener f event handlers feventhandlers queue debug model events fire created processing events target keyed event sets processed independently map event set eventset list debug event debugevent f set to queue fsettoqueue hash map hashmap event set eventset list debug event debugevent constructs event dispatcher list ening listening events originating debug target underlying param target target event dispatcher belongs event dispatcher eventdispatcher jdi debug target jdidebugtarget target f event handlers feventhandlers hash map hashmap event request eventrequest ijdi event listener ijdieventlistener f target ftarget target f shutdown fshutdown dispatch event param event set eventset events dispatch dispatch event set eventset event set eventset is shutdown isshutdown jdi debug options jdidebugoptions debug jdi events event iterator eventiterator event iter eventiter event set eventset event iterator eventiterator nls string buffer stringbuffer buf string buffer stringbuffer jdi event event iter eventiter has next hasnext buf append event iter eventiter event iter eventiter has next hasnext nls buf append nls buf append jdi debug options jdidebugoptions trace buf to string tostring event iterator eventiterator iter event set eventset event iterator eventiterator ijdi event listener ijdieventlistener listeners ijdi event listener ijdieventlistener event set eventset size vote resume list event deferred events deferredevents iter has next hasnext is shutdown isshutdown event event iter next event nextevent event dispatch events registered listeners ijdi event listener ijdieventlistener listener f event handlers feventhandlers event request listeners listener listener listener i java line breakpoint ijavalinebreakpoint listeners vote i java line breakpoint ijavalinebreakpoint listener is condition enabled isconditionenabled deferred events deferredevents deferred events deferredevents array list arraylist event deferred events deferredevents add event core exception coreexception exception jdi debug plugin jdidebugplugin log exception vote resume listener handle event handleevent event f target ftarget resume event set eventset resume dispatch start events event vm death event vmdeathevent f target ftarget handlevmdeath vm death event vmdeathevent event list ening listening events shutdown event vm disconnect event vmdisconnectevent f target ftarget handlevmdisconnect vm disconnect event vmdisconnectevent event list ening listening events shutdown event vm start event vmstartevent f target ftarget handlevmstart vm start event vmstartevent event handled process deferred conditional breakpoint events deferred events deferredevents iterator event deferred iter deferrediter deferred events deferredevents iterator deferred iter deferrediter has next hasnext is shutdown isshutdown event event deferred iter deferrediter event dispatch events registered listeners ijdi event listener ijdieventlistener listener f event handlers feventhandlers event request listener vote resume listener handle event handleevent event f target ftarget resume event set eventset resume notify handlers result iter event set eventset event iterator eventiterator iter has next hasnext event event iter next event nextevent notify registered listener ijdi event listener ijdieventlistener listener listeners listener listener event set complete eventsetcomplete event f target ftarget resume event set eventset fire queue d queued debug events fire events fireevents event set eventset vote resume event set eventset resume vm disconnected exception vmdisconnectedexception runtime exception runtimeexception f target ftarget target request failed targetrequestfailed jdi debug messages jdidebugmessages event dispatcher eventdispatcher debug exception debugexception jdi debug plugin jdidebugplugin log continuously reads events coming event queue event dispatcher shutdown debug target starts thread method startup shutdown override virtual machine virtualmachine f target ftarget getvm event queue eventqueue event queue eventqueue event set eventset event set eventset is shutdown isshutdown event event set eventset remove vm disconnected exception vmdisconnectedexception is shutdown isshutdown event set eventset event set eventset event set eventset job job job jdi event dispatch override i status istatus i progress monitor iprogressmonitor monitor dispatch status status override belongs to belongsto object family family clazz family event iterator eventiterator iterator event iterator eventiterator iterator has next hasnext event event iterator next event nextevent clazz is instance isinstance event job set system setsystem job schedule interrupted exception interruptedexception shutdown event dispatcher event dispatcher reading dispatching events event queue thread runnable exit shutdown f shutdown fshutdown returns event dispatcher shutdown event dispatcher shutdown is shutdown isshutdown f shutdown fshutdown registers listener event request event received underlying event request listener not ified notified param listener listener register param request event request events listener int erested interested addjdieventlistener ijdi event listener ijdieventlistener listener event request eventrequest request f event handlers feventhandlers request listener registers listener event request listener longer not ified notified events request listeners responsible deleting event request required param listener listener register param request event request register removejdieventlistener ijdi event listener ijdieventlistener listener event request eventrequest request f event handlers feventhandlers remove request adds event queue debug events fire dispatching events event param event event queue param event event queue debug event debugevent event event set eventset f set to queue fsettoqueue list debug event debugevent list f set to queue fsettoqueue list list array list arraylist debug event debugevent f set to queue fsettoqueue list list add event fires debug events event queue event clears queue param fire events fire events fireevents event set eventset debug plugin debugplugin plugin debug plugin debugplugin get default getdefault check process shutting plugin list debug event debugevent list f set to queue fsettoqueue list f set to queue fsettoqueue remove list debug event debugevent events list to array toarray debug event debugevent list size plugin fire debug event set firedebugeventset events