copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse debug jdi tests sun jdi incompatible thread state exception incompatiblethreadstateexception sun jdi location sun jdi reference type referencetype sun jdi stack frame stackframe sun jdi thread reference threadreference sun jdi event class prepare event classprepareevent sun jdi event class unload event classunloadevent sun jdi event event sun jdi event step event stepevent sun jdi request class prepare request classpreparerequest sun jdi request class unload request classunloadrequest sun jdi request event request eventrequest sun jdi request step request steprequest tests hot code replacement jdi extension hot code replacement test hotcodereplacementtest abstractjditest creates test hot code replacement test hotcodereplacementtest drop top frame droptopframe thread reference threadreference thread org eclipse jdi hcr thread reference threadreference hcr thread hcrthread stack size stack size stacksize stack size stacksize thread frames size incompatible thread state exception incompatiblethreadstateexception assert true asserttrue drop top frame droptopframe create install step request step request steprequest request fvm event request manager eventrequestmanager create step request createsteprequest thread step request steprequest step min step request steprequest step request set suspend policy setsuspendpolicy event request eventrequest suspend event thread request enable prepare receive event event waiter eventwaiter waiter event waiter eventwaiter request f event reader feventreader add event listener addeventlistener waiter finally blocks skipped finallyblocksskipped hcr thread hcrthread do return doreturn assert true asserttrue drop top frame droptopframe finally blocks skipped finallyblocksskipped wait event wait max event event wait for event waitforevent waiter assert true asserttrue drop top frame droptopframe event f event reader feventreader remove event listener removeeventlistener waiter fvm event request manager eventrequestmanager delete event request deleteeventrequest request check thread dropped top frame assert true asserttrue drop top frame droptopframe thread is suspended issuspended new stack size newstacksize new stack size newstacksize thread frames size incompatible thread state exception incompatiblethreadstateexception assert true asserttrue drop top frame droptopframe assert equals assertequals drop top frame droptopframe stack size stacksize new stack size newstacksize init fields test override local set up localsetup wait until ready waituntilready tests output standard output param args main string args hot code replacement test hotcodereplacementtest run suite runsuite args test junit framework test case testcase get name getname override string get name getname hot code replacement extension jdi org eclipse jdi hcr tests reenter on exit reenteronexit thread reference threadreference thread top frame location location location stack frame stackframe frame thread frames location frame location incompatible thread state exception incompatiblethreadstateexception assert true asserttrue reenter on exit reenteronexit create install reenter step request org eclipse jdi hcr event request manager eventrequestmanager event request manager eventrequestmanager org eclipse jdi hcr event request manager eventrequestmanager fvm event request manager eventrequestmanager org eclipse jdi hcr reenter step request reentersteprequest request event request manager eventrequestmanager create reenter step request createreentersteprequest thread request set suspend policy setsuspendpolicy event request eventrequest suspend event thread request enable prepare receive step event event waiter eventwaiter waiter event waiter eventwaiter request f event reader feventreader add event listener addeventlistener waiter resume thread do return doreturn frame reentered org eclipse jdi hcr thread reference threadreference thread do return doreturn wait step event wait max step event stepevent event step event stepevent wait for event waitforevent waiter assert true asserttrue reenter on exit reenteronexit event f event reader feventreader remove event listener removeeventlistener waiter fvm event request manager eventrequestmanager delete event request deleteeventrequest request check top frame location expected location new location newlocation stack frame stackframe frame thread frames new location newlocation frame location incompatible thread state exception incompatiblethreadstateexception assert true asserttrue reenter on exit reenteronexit assert true asserttrue reenter on exit reenteronexit new location newlocation equals location assert true asserttrue reenter on exit reenteronexit new location newlocation code index codeindex location code index codeindex reload classes reloadclasses reference type referencetype old type oldtype get main class getmainclass create install unload prepare event requests class unload request classunloadrequest unload request unloadrequest fvm event request manager eventrequestmanager create class unload request createclassunloadrequest unload request unloadrequest set suspend policy setsuspendpolicy event request eventrequest suspend unload request unloadrequest enable class prepare request classpreparerequest load request loadrequest fvm event request manager eventrequestmanager create class prepare request createclasspreparerequest load request loadrequest set suspend policy setsuspendpolicy event request eventrequest suspend event thread load request loadrequest enable prepare receive unload event event waiter eventwaiter unload event waiter unloadeventwaiter event waiter eventwaiter unload request unloadrequest f event reader feventreader add event listener addeventlistener unload event waiter unloadeventwaiter prepare receive prepare event event waiter eventwaiter load event waiter loadeventwaiter event waiter eventwaiter load request loadrequest f event reader feventreader add event listener addeventlistener load event waiter loadeventwaiter reload classes org eclipse jdi hcr virtual machine virtualmachine org eclipse jdi hcr virtual machine virtualmachine fvm result classes have changed classeshavechanged string org eclipse debug jdi tests program main class mainclass assert equals assertequals reload classes reloadclasses org eclipse jdi hcr virtual machine virtualmachine reload success result wait unload event class unload event classunloadevent unload event unloadevent class unload event classunloadevent wait for event waitforevent unload event waiter unloadeventwaiter wait max assert true asserttrue reload classes reloadclasses unload event unloadevent f event reader feventreader remove event listener removeeventlistener unload event waiter unloadeventwaiter fvm event request manager eventrequestmanager delete event request deleteeventrequest unload request unloadrequest assert equals assertequals reload classes reloadclasses org eclipse debug jdi tests program main class mainclass unload event unloadevent class name classname wait prepare event class prepare event classprepareevent load event loadevent class prepare event classprepareevent wait for event waitforevent load event waiter loadeventwaiter wait max assert true asserttrue reload classes reloadclasses load event loadevent f event reader feventreader remove event listener removeeventlistener load event waiter loadeventwaiter fvm event request manager eventrequestmanager delete event request deleteeventrequest load request loadrequest reference type referencetype new type newtype load event loadevent reference type referencetype assert equals assertequals reload classes reloadclasses org eclipse debug jdi tests program main class mainclass new type newtype assert true asserttrue reload classes reloadclasses old type oldtype equals new type newtype thread suspend hot code replacement capabilities drop top frame reload classes request reeenter exit resume thread step event file version classes testjdiusecase suspended thread thread reference threadreference thread get thread getthread assert true asserttrue thread is suspended issuspended assert equals assertequals thread suspend count suspendcount org eclipse jdi hcr thread reference threadreference hcr thread hcrthread org eclipse jdi hcr thread reference threadreference thread org eclipse jdi hcr virtual machine virtualmachine org eclipse jdi hcr virtual machine virtualmachine fvm drop top frame can do return candoreturn drop top frame droptopframe thread hcr thread hcrthread unsupported operation exception unsupportedoperationexception reload classes can reload classes canreloadclasses reload classes reloadclasses reenter exit can reenter on exit canreenteronexit reenter on exit reenteronexit thread test leaves override local tear down localteardown wait until ready waituntilready