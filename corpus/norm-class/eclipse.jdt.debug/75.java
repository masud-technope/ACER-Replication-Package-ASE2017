copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt debug tests breakpoints java util array list arraylist java util list org eclipse debug core i launch configuration ilaunchconfiguration org eclipse debug core i launch configuration working copy ilaunchconfigurationworkingcopy org eclipse debug core model i breakpoint ibreakpoint org eclipse debug core model i thread ithread org eclipse debug core model i variable ivariable org eclipse debug debuguitools org eclipse debug i debug model presentation idebugmodelpresentation org eclipse jdt debug core i java debug target ijavadebugtarget org eclipse jdt debug core i java method breakpoint ijavamethodbreakpoint org eclipse jdt debug core i java primitive value ijavaprimitivevalue org eclipse jdt debug core i java stack frame ijavastackframe org eclipse jdt debug core i java thread ijavathread org eclipse jdt debug tests abstract debug test abstractdebugtest org eclipse jdt launching i java launch configuration constants ijavalaunchconfigurationconstants tests method breakpoints method breakpoint tests methodbreakpointtests abstract debug test abstractdebugtest constructor param method breakpoint tests methodbreakpointtests string exception test entry and exit breakpoints testentryandexitbreakpoints exception string type name typename drop tests droptests list i java method breakpoint ijavamethodbreakpoint bps array list arraylist i java method breakpoint ijavamethodbreakpoint method entry bps add create method breakpoint createmethodbreakpoint type name typename method method exit bps add create method breakpoint createmethodbreakpoint type name typename method i java thread ijavathread thread thread launch to breakpoint launchtobreakpoint type name typename assert not null assertnotnull breakpoint hit timeout period thread i breakpoint ibreakpoint hit get breakpoint getbreakpoint thread assert not null assertnotnull suspended breakpoint hit assert equals assertequals hit entry breakpoint bps hit breakpoint thread resume thread hit get breakpoint getbreakpoint thread assert not null assertnotnull suspended breakpoint hit assert equals assertequals hit exit breakpoint bps hit terminate and remove terminateandremove thread remove all breakpoints removeallbreakpoints tests main launching preference link i java launch configuration constants ijavalaunchconfigurationconstants attr main exception test stop in main teststopinmain exception string type name typename drop tests droptests i launch configuration ilaunchconfiguration config get launch configuration getlaunchconfiguration type name typename assert not null assertnotnull find launch config config i launch configuration working copy ilaunchconfigurationworkingcopy config copy drop tests droptests main set attribute setattribute i java launch configuration constants ijavalaunchconfigurationconstants attr main config do save dosave i java thread ijavathread thread thread launch and suspend launchandsuspend config assert not null assertnotnull breakpoint hit timeout period thread i breakpoint ibreakpoint hit get breakpoint getbreakpoint thread assert not null assertnotnull suspended breakpoint hit i java stack frame ijavastackframe frame i java stack frame ijavastackframe thread get top stack frame gettopstackframe assert true asserttrue main frame get method name getmethodname equals main frame is static isstatic terminate and remove terminateandremove thread remove all breakpoints removeallbreakpoints tests disabled method entry exit breakpoints exception test disabled entry and exit breakpoints testdisabledentryandexitbreakpoints exception string type name typename drop tests droptests method entry i breakpoint ibreakpoint create method breakpoint createmethodbreakpoint type name typename method set enabled setenabled method exit i breakpoint ibreakpoint create method breakpoint createmethodbreakpoint type name typename method set enabled setenabled i java debug target ijavadebugtarget debug target debugtarget debug target debugtarget launch and terminate launchandterminate type name typename terminate and remove terminateandremove debug target debugtarget remove all breakpoints removeallbreakpoints tests method hit exception test inner class not hit testinnerclassnothit exception string type name pattern typenamepattern list i java method breakpoint ijavamethodbreakpoint bps array list arraylist i java method breakpoint ijavamethodbreakpoint method entry bps add create method breakpoint createmethodbreakpoint type name pattern typenamepattern i java thread ijavathread thread thread launch to breakpoint launchtobreakpoint type name pattern typenamepattern assert not null assertnotnull breakpoint hit timeout period thread i breakpoint ibreakpoint hit get breakpoint getbreakpoint thread assert not null assertnotnull suspended breakpoint hit assert equals assertequals hit entry breakpoint bps hit resume and exit resumeandexit thread terminate and remove terminateandremove thread remove all breakpoints removeallbreakpoints tests method hit exception test inner classes hit testinnerclasseshit exception string type name pattern typenamepattern list i java method breakpoint ijavamethodbreakpoint bps array list arraylist i java method breakpoint ijavamethodbreakpoint method entry bps add create method breakpoint createmethodbreakpoint type name pattern typenamepattern i java thread ijavathread thread thread launch to breakpoint launchtobreakpoint assert not null assertnotnull breakpoint hit timeout period thread i breakpoint ibreakpoint hit get breakpoint getbreakpoint thread assert not null assertnotnull suspended breakpoint hit assert equals assertequals hit entry breakpoint bps hit thread resume thread hit get breakpoint getbreakpoint thread assert not null assertnotnull suspended breakpoint hit assert equals assertequals hit entry breakpoint bps hit thread resume thread hit get breakpoint getbreakpoint thread assert not null assertnotnull suspended breakpoint hit assert equals assertequals hit entry breakpoint bps hit thread resume thread hit get breakpoint getbreakpoint thread assert not null assertnotnull suspended breakpoint hit assert equals assertequals hit entry breakpoint bps hit resume and exit resumeandexit thread terminate and remove terminateandremove thread remove all breakpoints removeallbreakpoints tests hit count method breakpoint suspends reached exception test hit count entry breakpoint testhitcountentrybreakpoint exception string type name typename method loop methodloop i java method breakpoint ijavamethodbreakpoint create method breakpoint createmethodbreakpoint type name typename calculate sum calculatesum set hit count sethitcount i java thread ijavathread thread thread launch to breakpoint launchtobreakpoint type name typename assert not null assertnotnull method entry breakpoint hit timeout period thread i java stack frame ijavastackframe frame i java stack frame ijavastackframe thread get top stack frame gettopstackframe i variable ivariable find variable findvariable frame sum assert not null assertnotnull find variable sum i java primitive value ijavaprimitivevalue i java primitive value ijavaprimitivevalue get value getvalue assert not null assertnotnull variable sum i value ivalue get int value getintvalue assert true asserttrue sum i value ivalue i value ivalue delete terminate and remove terminateandremove thread remove all breakpoints removeallbreakpoints tests method exit breakpoint suspends hit count reached exception test hit count exit breakpoint testhitcountexitbreakpoint exception string type name typename method loop methodloop i java method breakpoint ijavamethodbreakpoint create method breakpoint createmethodbreakpoint type name typename calculate sum calculatesum set hit count sethitcount i java thread ijavathread thread thread launch to breakpoint launchtobreakpoint type name typename assert not null assertnotnull method exit breakpoint hit timeout period thread i java stack frame ijavastackframe frame i java stack frame ijavastackframe thread get top stack frame gettopstackframe i variable ivariable find variable findvariable frame sum assert not null assertnotnull find variable sum i java primitive value ijavaprimitivevalue i java primitive value ijavaprimitivevalue get value getvalue assert not null assertnotnull variable sum i value ivalue get int value getintvalue assert true asserttrue sum i value ivalue i value ivalue delete terminate and remove terminateandremove thread remove all breakpoints removeallbreakpoints tests inclusive thread filter method breakpoint exception test thread filter inclusive testthreadfilterinclusive exception string type name typename method loop methodloop i java method breakpoint ijavamethodbreakpoint method bp methodbp create method breakpoint createmethodbreakpoint type name typename calculate sum calculatesum create line breakpoint createlinebreakpoint type name typename i java thread ijavathread thread thread launch to breakpoint launchtobreakpoint type name typename assert not null assertnotnull breakpoint hit timeout period thread i java stack frame ijavastackframe frame i java stack frame ijavastackframe thread get top stack frame gettopstackframe thread filter main thread method bp methodbp set thread filter setthreadfilter thread thread resume thread assert not null assertnotnull breakpoint hit thread frame i java stack frame ijavastackframe thread get top stack frame gettopstackframe assert equals assertequals cal ucate sum calucatesum calculate sum calculatesum frame get method name getmethodname terminate and remove terminateandremove thread remove all breakpoints removeallbreakpoints tests exclusive thread filter method breakpoint exception test thread filter exclusive testthreadfilterexclusive exception string type name typename method loop methodloop i java method breakpoint ijavamethodbreakpoint method bp methodbp create method breakpoint createmethodbreakpoint type name typename calculate sum calculatesum create line breakpoint createlinebreakpoint type name typename i java thread ijavathread thread thread launch to breakpoint launchtobreakpoint type name typename assert not null assertnotnull breakpoint hit timeout period thread thread get top stack frame gettopstackframe thread filter main thread i thread ithread threads thread get debug target getdebugtarget get threads getthreads threads length i thread ithread thread threads thread equals thread method bp methodbp set thread filter setthreadfilter i java thread ijavathread thread assert not null assertnotnull thread filter method bp methodbp get thread filter getthreadfilter i java debug target ijavadebugtarget thread get debug target getdebugtarget resume and exit resumeandexit thread terminate and remove terminateandremove thread remove all breakpoints removeallbreakpoints test bug tests method breakpoint hit properly exception test entry default package return type testentrydefaultpackagereturntype exception string type name typename def pkg return type defpkgreturntype i java method breakpoint ijavamethodbreakpoint create method breakpoint createmethodbreakpoint type name typename l def pkg return type ldefpkgreturntype i java thread ijavathread thread thread launch to breakpoint launchtobreakpoint type name typename assert not null assertnotnull breakpoint hit timeout period thread i breakpoint ibreakpoint hit get breakpoint getbreakpoint thread assert not null assertnotnull suspended breakpoint hit assert equals assertequals hit entry breakpoint hit terminate and remove terminateandremove thread remove all breakpoints removeallbreakpoints test bug tests debug model presentation returning correct signature specific method breakpoint exception test label without signature testlabelwithoutsignature exception i debug model presentation idebugmodelpresentation model presentation modelpresentation debuguitools new debug model presentation newdebugmodelpresentation string type name typename def pkg return type defpkgreturntype i java method breakpoint ijavamethodbreakpoint create method breakpoint createmethodbreakpoint type name typename string label model presentation modelpresentation get text gettext assert true asserttrue label index of indexof remove all breakpoints removeallbreakpoints model presentation modelpresentation dispose test bug tests debug model presentation handles label specific method breakpoint exception test label without method name testlabelwithoutmethodname exception i debug model presentation idebugmodelpresentation model presentation modelpresentation debuguitools new debug model presentation newdebugmodelpresentation string type name typename def pkg return type defpkgreturntype i java method breakpoint ijavamethodbreakpoint create method breakpoint createmethodbreakpoint type name typename l def pkg return type ldefpkgreturntype string label model presentation modelpresentation get text gettext assert true asserttrue label index of indexof type name typename remove all breakpoints removeallbreakpoints model presentation modelpresentation dispose test bug tests debug model presentation handles signature method specific method breakpoint exception test label without sig or method name testlabelwithoutsigormethodname exception i debug model presentation idebugmodelpresentation model presentation modelpresentation debuguitools new debug model presentation newdebugmodelpresentation string type name typename def pkg return type defpkgreturntype i java method breakpoint ijavamethodbreakpoint create method breakpoint createmethodbreakpoint type name typename string label model presentation modelpresentation get text gettext assert true asserttrue label index of indexof type name typename remove all breakpoints removeallbreakpoints model presentation modelpresentation dispose tests specific method breakpoint skipped exception test skip method breakpoint testskipmethodbreakpoint exception string type name typename drop tests droptests list i java method breakpoint ijavamethodbreakpoint bps array list arraylist i java method breakpoint ijavamethodbreakpoint method entry bps add create method breakpoint createmethodbreakpoint type name typename method method exit bps add create method breakpoint createmethodbreakpoint type name typename method i java thread ijavathread thread thread launch to breakpoint launchtobreakpoint type name typename assert not null assertnotnull breakpoint hit timeout period thread i breakpoint ibreakpoint hit get breakpoint getbreakpoint thread assert not null assertnotnull suspended breakpoint hit assert equals assertequals hit entry breakpoint bps hit get breakpoint manager getbreakpointmanager set enabled setenabled resume and exit resumeandexit thread terminate and remove terminateandremove thread remove all breakpoints removeallbreakpoints get breakpoint manager getbreakpointmanager set enabled setenabled