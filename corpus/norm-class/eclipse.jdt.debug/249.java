copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation samrat dhillon sam rat samrat dhillon gmail bug debug variable scope org eclipse jdt internal debug core model java util array list arraylist java util collections java util comparator java util iterator java util list org eclipse core runtime i adaptable iadaptable org eclipse core runtime i status istatus org eclipse core runtime status org eclipse debug core debug event debugevent org eclipse debug core debug exception debugexception org eclipse debug core model i register group iregistergroup org eclipse debug core model i stack frame istackframe org eclipse debug core model i step istep org eclipse debug core model i suspend resume isuspendresume org eclipse debug core model i terminate iterminate org eclipse debug core model i thread ithread org eclipse debug core model i variable ivariable org eclipse jdi internal value impl valueimpl org eclipse jdi internal virtual machine impl virtualmachineimpl org eclipse jdt core signature org eclipse jdt debug core i java class type ijavaclasstype org eclipse jdt debug core i java modifiers ijavamodifiers org eclipse jdt debug core i java object ijavaobject org eclipse jdt debug core i java reference type ijavareferencetype org eclipse jdt debug core i java stack frame ijavastackframe org eclipse jdt debug core i java thread ijavathread org eclipse jdt debug core i java value ijavavalue org eclipse jdt debug core i java variable ijavavariable org eclipse jdt internal debug core jdi debug plugin jdidebugplugin ibm icu text message format messageformat sun jdi absent information exception absentinformationexception sun jdi class not loaded exception classnotloadedexception sun jdi class type classtype sun jdi field sun jdi incompatible thread state exception incompatiblethreadstateexception sun jdi invalid type exception invalidtypeexception sun jdi local variable localvariable sun jdi location sun jdi method sun jdi native method exception nativemethodexception sun jdi object reference objectreference sun jdi reference type referencetype sun jdi stack frame stackframe sun jdi type sun jdi virtual machine virtualmachine jdi stack frame jdistackframe jdi debug element jdidebugelement i java stack frame ijavastackframe frame depth call stack bottom stack frame invalid frame f depth fdepth underlying jdi stack frame stack frame stackframe f stack frame fstackframe thread jdi thread jdithread f thread fthread visible variables list i java variable ijavavariable f variables fvariables underlying object stack frame cached lazily access object reference objectreference f this object fthisobject type object received method call stack frame cached lazily access string f receiving type name freceivingtypename variables ref res hing refreshing f refresh variables frefreshvariables stack frame marked synch code code stack frame dynamically calculating synch f is out of synch fisoutofsynch local variable f locals available flocalsavailable location stack frame location f location flocation creates stack frame thread param thread parent jdi thread param frame underlying frame param depth depth stack bottom jdi stack frame jdistackframe jdi thread jdithread thread stack frame stackframe frame depth jdi debug target jdidebugtarget thread get debug target getdebugtarget set thread setthread thread bind frame depth binds frame underlying frame target returns frame representing frame frame bound underlying frame ref ers refers depth stack method param frame underlying frame code code param depth depth call stack frame invalid param frame refer frame code code jdi stack frame jdistackframe bind stack frame stackframe frame depth f thread fthread f depth fdepth initialization f stack frame fstackframe frame f depth fdepth depth f location flocation frame location depth mark invalid f depth fdepth f stack frame fstackframe f depth fdepth depth location location frame location method method location method method equals f location flocation method method declaring type declaringtype default stratum defaultstratum equals nls java equals get source name getsourcename location get source name getsourcename f location flocation todo receiving type f stack frame fstackframe frame f location flocation location clear cached data clearcacheddata debug exception debugexception invalid ate invalidate frame bind frame jdi stack frame jdistackframe f thread fthread frame depth i stack frame istackframe get thread getthread override i thread ithread get thread getthread f thread fthread i suspend resume isuspendresume can resume canresume override can resume canresume get thread getthread can resume canresume i suspend resume isuspendresume can suspend cansuspend override can suspend cansuspend get thread getthread can suspend cansuspend i step istep can step into canstepinto override can step into canstepinto exists is top stack frame istopstackframe is obsolete isobsolete get thread getthread can step into canstepinto debug exception debugexception log error logerror i step istep can step over canstepover override can step over canstepover exists is obsolete isobsolete get thread getthread can step over canstepover i step istep can step return canstepreturn override can step return canstepreturn exists is obsolete isobsolete get thread getthread can step return canstepreturn list i java stack frame ijavastackframe frames jdi thread jdithread get thread getthread compute stack frames computestackframes frames frames is empty isempty bottom frame bottomframe equals frames frames size above obsolete frame aboveobsoleteframe bottom frame bottomframe frames index of indexof frames size jdi stack frame jdistackframe frames is obsolete isobsolete above obsolete frame aboveobsoleteframe bottom frame bottomframe above obsolete frame aboveobsoleteframe debug exception debugexception log error logerror returns underlying method stack frame retrieving method method get underlying method getunderlyingmethod f thread fthread f location flocation method i stack frame istackframe get variables getvariables override i variable ivariable get variables getvariables debug exception debugexception list i java variable ijavavariable list get variables getvariables list to array toarray i variable ivariable list size list i java variable ijavavariable get variables getvariables debug exception debugexception f thread fthread f variables fvariables message is native isnative request failed requestfailed jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe variable unavailable methods method method get underlying method getunderlyingmethod f variables fvariables array list arraylist i java variable ijavavariable code d coded method is static isstatic add statics list field all fields allfields reference type referencetype declaring type declaringtype method declaring type declaringtype all fields allfields declaring type declaringtype all fields allfields runtime exception runtimeexception target request failed targetrequestfailed message format messageformat format jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe exception retrieving fields to string tostring collections empty list all fields allfields iterator field fields all fields allfields iterator fields has next hasnext field field fields field is static isstatic f variables fvariables add jdi field variable jdifieldvariable jdi debug target jdidebugtarget get debug target getdebugtarget field declaring type declaringtype collections sort f variables fvariables comparator i java variable ijavavariable override compare i java variable ijavavariable i java variable ijavavariable jdi field variable jdifieldvariable jdi field variable jdifieldvariable jdi field variable jdifieldvariable jdi field variable jdifieldvariable get name getname compare to ignore case comparetoignorecase get name getname debug exception debugexception log error logerror add object reference objectreference get underlying this object getunderlyingthisobject f variables fvariables add jdi this variable jdithisvariable jdi debug target jdidebugtarget get debug target getdebugtarget add locals iterator local variable localvariable variables get underlying visible variables getunderlyingvisiblevariables iterator variables has next hasnext local variable localvariable variables f variables fvariables add jdi local variable jdilocalvariable f refresh variables frefreshvariables update variables updatevariables f refresh variables frefreshvariables f variables fvariables i stack frame istackframe get name getname override string get name getname debug exception debugexception get method name getmethodname i java stack frame ijavastackframe get argument type names getargumenttypenames override list string get argument type names getargumenttypenames debug exception debugexception method underlying method underlyingmethod get underlying method getunderlyingmethod string generic signature genericsignature underlying method underlyingmethod generic signature genericsignature generic signature genericsignature signature underlying method underlyingmethod argument type names argumenttypenames signature string parameter types parametertypes signature get parameter types getparametertypes generic signature genericsignature list string argument type names argumenttypenames array list arraylist string string parameter type parametertype parameter types parametertypes argument type names argumenttypenames add signature to string tostring parameter type parametertype replace argument type names argumenttypenames runtime exception runtimeexception target request failed targetrequestfailed message format messageformat format jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe exception retrieving argument type names to string tostring i stack frame istackframe get line number getlinenumber override get line number getlinenumber debug exception debugexception f thread fthread f location flocation line number linenumber runtime exception runtimeexception get thread getthread is suspended issuspended target request failed targetrequestfailed message format messageformat format jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe exception retrieving number to string tostring i step istep is step ping isstepping override is step ping isstepping get thread getthread is step ping isstepping i suspend resume isuspendresume is suspended issuspended override is suspended issuspended get thread getthread is suspended issuspended i suspend resume isuspendresume resume override resume debug exception debugexception get thread getthread resume i step istep step into stepinto override step into stepinto debug exception debugexception can step into canstepinto get thread getthread step into stepinto i step istep step over stepover override step over stepover debug exception debugexception can step over canstepover is top stack frame istopstackframe get thread getthread step over stepover jdi thread jdithread get thread getthread step to frame steptoframe i step istep step return stepreturn override step return stepreturn debug exception debugexception can step return canstepreturn is top stack frame istopstackframe get thread getthread step return stepreturn list i java stack frame ijavastackframe frames jdi thread jdithread get thread getthread compute stack frames computestackframes frames index of indexof frames size i stack frame istackframe next frame nextframe frames jdi thread jdithread get thread getthread step to frame steptoframe next frame nextframe i suspend resume isuspendresume suspend override suspend debug exception debugexception get thread getthread suspend increment ally incrementally updates stack frames variables jdi debug element jdidebugelement target request failed targetrequestfailed string runtime exception runtimeexception update variables updatevariables debug exception debugexception f variables fvariables method method get underlying method getunderlyingmethod method is static isstatic update object reference objectreference this object thisobject this object thisobject get underlying this object getunderlyingthisobject jdi this variable jdithisvariable old this object oldthisobject f variables fvariables is empty isempty f variables fvariables jdi this variable jdithisvariable old this object oldthisobject jdi this variable jdithisvariable f variables fvariables this object thisobject old this object oldthisobject removal f variables fvariables remove old this object oldthisobject this object thisobject creation old this object oldthisobject jdi this variable jdithisvariable jdi debug target jdidebugtarget get debug target getdebugtarget this object thisobject f variables fvariables add old this object oldthisobject old this object oldthisobject receiver old this object oldthisobject retrieve value retrievevalue equals this object thisobject f variables fvariables remove f variables fvariables add jdi this variable jdithisvariable jdi debug target jdidebugtarget get debug target getdebugtarget this object thisobject list local variable localvariable locals locals get underlying stack frame getunderlyingstackframe visible variables visiblevariables absent information exception absentinformationexception locals collections empty list native method exception nativemethodexception locals collections empty list runtime exception runtimeexception target request failed targetrequestfailed message format messageformat format jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe exception retrieving visible variables to string tostring local index localindex f variables fvariables size object f variables fvariables jdi local variable jdilocalvariable jdi local variable jdilocalvariable local jdi local variable jdilocalvariable f variables fvariables local index localindex locals index of indexof local get local getlocal local index localindex update variable underling jdi local variable localvariable local set local setlocal locals local index localindex locals remove local index localindex remove variable f variables fvariables remove field variable frame add locals iterator local variable localvariable new ones newones locals iterator new ones newones has next hasnext jdi local variable jdilocalvariable local jdi local variable jdilocalvariable new ones newones f variables fvariables add local org eclipse debug core model i drop to frame idroptoframe can drop to frame candroptoframe override can drop to frame candroptoframe supports drop to frame supportsdroptoframe i java stack frame ijavastackframe supports drop to frame supportsdroptoframe override supports drop to frame supportsdroptoframe jdi thread jdithread thread jdi thread jdithread get thread getthread jdi debug target jdidebugtarget target jdi debug target jdidebugtarget thread get debug target getdebugtarget target is available isavailable thread is suspended issuspended thread is terminated isterminated thread is invoking method isinvokingmethod support jdk support jdksupport target can pop frames canpopframes virtual machine virtualmachine getvm support thread get underlying thread getunderlyingthread org eclipse jdi hcr thread reference threadreference org eclipse jdi hcr virtual machine virtualmachine can do return candoreturn unsupported operation exception unsupportedoperationexception uoe support jdk support jdksupport support ensure frame frames frame unable pop stack frames list i java stack frame ijavastackframe frames thread compute stack frames computestackframes jdk support jdksupport stack frame frames size frames frames size jdi stack frame jdistackframe frame frames size frame jdi stack frame jdistackframe frames frame is native isnative frame equals jdk support jdksupport frame frame frames size jdi stack frame jdistackframe frames is native isnative debug exception debugexception get status getstatus get exception getexception incompatible thread state exception incompatiblethreadstateexception get status getstatus get code getcode i java thread ijavathread err thread suspended log error logerror unsupported operation exception unsupportedoperationexception runtime exception runtimeexception internal error internalerror i java stack frame ijavastackframe drop to frame droptoframe override drop to frame droptoframe debug exception debugexception supports drop to frame supportsdroptoframe jdi thread jdithread get thread getthread drop to frame droptoframe not supported notsupported jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe drop frame supported pop frame popframe debug exception debugexception supports drop to frame supportsdroptoframe jdi thread jdithread get thread getthread pop frame popframe not supported notsupported jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe pop frame supported i java stack frame ijavastackframe find variable findvariable string override i java variable ijavavariable find variable findvariable string var name varname debug exception debugexception is native isnative i variable ivariable variables get variables getvariables list i java variable ijavavariable possible matches possiblematches array list arraylist i java variable ijavavariable i java variable ijavavariable this variable thisvariable i variable ivariable variable variables i java variable ijavavariable i java variable ijavavariable variable get name getname equals var name varname possible matches possiblematches add jdi this variable jdithisvariable save check instance variables this variable thisvariable i java variable ijavavariable variable possible matches possiblematches local variable preference field variable variable jdi local variable jdilocalvariable variable possible matches possiblematches size possible matches possiblematches this variable thisvariable i variable ivariable this children thischildren this variable thisvariable get value getvalue get variables getvariables i variable ivariable element this children thischildren i java variable ijavavariable i java variable ijavavariable element get name getname equals var name varname retrieves visible variables stack frame handling exceptions returns empty list variables jdi debug element jdidebugelement target request failed targetrequestfailed string runtime exception runtimeexception list local variable localvariable get underlying visible variables getunderlyingvisiblevariables debug exception debugexception f thread fthread list local variable localvariable variables collections empty list variables get underlying stack frame getunderlyingstackframe visible variables visiblevariables absent information exception absentinformationexception set locals available setlocalsavailable native method exception nativemethodexception set locals available setlocalsavailable runtime exception runtimeexception target request failed targetrequestfailed message format messageformat format jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe exception retrieving visible variables to string tostring variables retrieves underlying stack frame returns code code stack frames jdi debug element jdidebugelement target request failed targetrequestfailed string runtime exception runtimeexception object reference objectreference get underlying this object getunderlyingthisobject debug exception debugexception f thread fthread f stack frame fstackframe f this object fthisobject is static isstatic f this object fthisobject get underlying stack frame getunderlyingstackframe this object thisobject runtime exception runtimeexception target request failed targetrequestfailed message format messageformat format jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe exception retrieving to string tostring f this object fthisobject i adaptable iadaptable get adapter getadapter suppress warnings suppresswarnings unchecked override get adapter getadapter adapter adapter i java stack frame ijavastackframe adapter i java modifiers ijavamodifiers get adapter getadapter adapter i java stack frame ijavastackframe get signature getsignature override string get signature getsignature debug exception debugexception get underlying method getunderlyingmethod signature runtime exception runtimeexception target request failed targetrequestfailed message format messageformat format jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe exception retrieving method signature to string tostring i java stack frame ijavastackframe get declaring type name getdeclaringtypename override string get declaring type name getdeclaringtypename debug exception debugexception f thread fthread is obsolete isobsolete jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe unknown declaring type jdi reference type jdireferencetype get generic name getgenericname get underlying method getunderlyingmethod declaring type declaringtype runtime exception runtimeexception get thread getthread is suspended issuspended target request failed targetrequestfailed message format messageformat format jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe exception retrieving declaring type to string tostring jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe unknown declaring type i java stack frame ijavastackframe get receiving type name getreceivingtypename override string get receiving type name getreceivingtypename debug exception debugexception f stack frame fstackframe f receiving type name freceivingtypename is obsolete isobsolete f receiving type name freceivingtypename jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe unknown receiving type object reference objectreference this object thisobject get underlying this object getunderlyingthisobject this object thisobject f receiving type name freceivingtypename get declaring type name getdeclaringtypename f receiving type name freceivingtypename jdi reference type jdireferencetype get generic name getgenericname this object thisobject reference type referencetype runtime exception runtimeexception get thread getthread is suspended issuspended target request failed targetrequestfailed message format messageformat format jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe exception retrieving receiving type to string tostring jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe unknown receiving type f receiving type name freceivingtypename i java stack frame ijavastackframe get method name getmethodname override string get method name getmethodname debug exception debugexception get underlying method getunderlyingmethod runtime exception runtimeexception get thread getthread is suspended issuspended target request failed targetrequestfailed message format messageformat format jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe exception retrieving method to string tostring jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe unknown method i java stack frame ijavastackframe is native isnative override is native isnative debug exception debugexception get underlying method getunderlyingmethod is native isnative i java stack frame ijavastackframe is constructor isconstructor override is constructor isconstructor debug exception debugexception get underlying method getunderlyingmethod is constructor isconstructor i java stack frame ijavastackframe is static initializer isstaticinitializer override is static initializer isstaticinitializer debug exception debugexception get underlying method getunderlyingmethod is static initializer isstaticinitializer i java modifiers ijavamodifiers is final isfinal override is final isfinal debug exception debugexception get underlying method getunderlyingmethod is final isfinal i java stack frame ijavastackframe is synchronized issynchronized override is synchronized issynchronized debug exception debugexception get underlying method getunderlyingmethod is synchronized issynchronized i java modifiers ijavamodifiers is synthetic issynthetic override is synthetic issynthetic debug exception debugexception get underlying method getunderlyingmethod is synthetic issynthetic i java modifiers ijavamodifiers is public ispublic override is public ispublic debug exception debugexception get underlying method getunderlyingmethod is public ispublic i java modifiers ijavamodifiers is private isprivate override is private isprivate debug exception debugexception get underlying method getunderlyingmethod is private isprivate i java modifiers ijavamodifiers is protected isprotected override is protected isprotected debug exception debugexception get underlying method getunderlyingmethod is protected isprotected i java modifiers ijavamodifiers is package private ispackageprivate override is package private ispackageprivate debug exception debugexception get underlying method getunderlyingmethod is package private ispackageprivate i java modifiers ijavamodifiers is static isstatic override is static isstatic debug exception debugexception get underlying method getunderlyingmethod is static isstatic i java stack frame ijavastackframe get source name getsourcename override string get source name getsourcename debug exception debugexception f thread fthread get source name getsourcename f location flocation returns source stratum location code code missing attribute string get source name getsourcename location location debug exception debugexception location source name sourcename absent information exception absentinformationexception native method exception nativemethodexception runtime exception runtimeexception target request failed targetrequestfailed message format messageformat format jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe exception retrieving source to string tostring equals object object equals is top stack frame istopstackframe debug exception debugexception i stack frame istackframe tos get thread getthread get top stack frame gettopstackframe tos tos equals sets stack frame synch note passing code code method marks stack frame synch per manently permanently static ally statically set out of synch setoutofsynch out of synch outofsynch f is out of synch fisoutofsynch out of synch outofsynch i java stack frame ijavastackframe is out of synch isoutofsynch override is out of synch isoutofsynch debug exception debugexception f is out of synch fisoutofsynch change suspends get thread getthread is suspended issuspended jdi debug target jdidebugtarget target jdi debug target jdidebugtarget get debug target getdebugtarget target hashcroccurred target is out of synch isoutofsynch get underlying method getunderlyingmethod declaring type declaringtype i java stack frame ijavastackframe is obsolete isobsolete override is obsolete isobsolete jdi debug plugin jdidebugplugin is jdi version greater than or equal isjdiversiongreaterthanorequal jdi debug target jdidebugtarget get debug target getdebugtarget hashcroccurred obsolete change suspends f thread fthread get thread getthread is suspended issuspended get underlying method getunderlyingmethod is obsolete isobsolete exists f thread fthread f depth fdepth i terminate iterminate can terminate canterminate override can terminate canterminate exists get thread getthread can terminate canterminate get debug target getdebugtarget can terminate canterminate i terminate iterminate is terminated isterminated override is terminated isterminated get thread getthread is terminated isterminated i terminate iterminate terminate override terminate debug exception debugexception get thread getthread can terminate canterminate get thread getthread terminate get debug target getdebugtarget terminate returns stack frame underlying jdi frame exception debug exception debugexception stack frame underlying frame int erim interim frame thread res umed resumed suspended stack frame stackframe get underlying stack frame getunderlyingstackframe debug exception debugexception f thread fthread f stack frame fstackframe f depth fdepth debug exception debugexception status i status istatus error jdi debug plugin jdidebugplugin get unique identifier getuniqueidentifier i java stack frame ijavastackframe err invalid stack frame jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe f thread fthread is suspended issuspended stack frames bug f thread fthread compute stack frames computestackframes f depth fdepth depth invalid frame debug exception debugexception status i status istatus error jdi debug plugin jdidebugplugin get unique identifier getuniqueidentifier i java stack frame ijavastackframe err invalid stack frame jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe debug exception debugexception status i status istatus error jdi debug plugin jdidebugplugin get unique identifier getuniqueidentifier i java thread ijavathread err thread suspended jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe f stack frame fstackframe sets underlying jdi stack frame stackframe called thread increment ally incrementally updating step completed param frame underlying stack frame set underlying stack frame setunderlyingstackframe stack frame stackframe frame f thread fthread f stack frame fstackframe frame frame f refresh variables frefreshvariables set thread setthread jdi thread jdithread thread f thread fthread thread set variables setvariables list i java variable ijavavariable variables f variables fvariables variables i java stack frame ijavastackframe get local variables getlocalvariables override i java variable ijavavariable get local variables getlocalvariables debug exception debugexception list local variable localvariable list get underlying visible variables getunderlyingvisiblevariables i java variable ijavavariable locals i java variable ijavavariable list size list size locals jdi local variable jdilocalvariable list locals i java stack frame ijavastackframe get this getthis override i java object ijavaobject get this getthis debug exception debugexception i java object ijavaobject receiver is static isstatic is native isnative object reference objectreference this object thisobject get underlying this object getunderlyingthisobject this object thisobject receiver i java object ijavaobject jdi value jdivalue create value createvalue jdi debug target jdidebugtarget get debug target getdebugtarget this object thisobject receiver java stack frames support registers i stack frame istackframe get register groups getregistergroups override i register group iregistergroup get register groups getregistergroups i register group iregistergroup i java stack frame ijavastackframe get declaring type getdeclaringtype override i java class type ijavaclasstype get declaring type getdeclaringtype debug exception debugexception method method get underlying method getunderlyingmethod type type method declaring type declaringtype type class type classtype i java class type ijavaclasstype jdi type jditype create type createtype jdi debug target jdidebugtarget get debug target getdebugtarget type target request failed targetrequestfailed jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe runtime exception runtimeexception target request failed targetrequestfailed message format messageformat format jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe exception ret reiving retreiving declaring type to string tostring javadoc org eclipse jdt debug core i java stack frame ijavastackframe get reference type getreferencetype override i java reference type ijavareferencetype get reference type getreferencetype debug exception debugexception method method get underlying method getunderlyingmethod type type method declaring type declaringtype i java reference type ijavareferencetype jdi type jditype create type createtype jdi debug target jdidebugtarget get debug target getdebugtarget type runtime exception runtimeexception target request failed targetrequestfailed message format messageformat format jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe exception ret reiving retreiving declaring type to string tostring expression level stepping supported i stack frame istackframe get char end getcharend override get char end getcharend expression level stepping supported i stack frame istackframe get char start getcharstart override get char start getcharstart clears cached data stack frame underlying stack frame changed cached data valid clear cached data clearcacheddata f this object fthisobject f receiving type name freceivingtypename i java stack frame ijavastackframe were locals available werelocalsavailable override were locals available werelocalsavailable f locals available flocalsavailable sets locals setting current change event fired client update param local variable stack frame set locals available setlocalsavailable f locals available flocalsavailable f locals available flocalsavailable fire change event firechangeevent debug event debugevent i stack frame istackframe has register groups hasregistergroups override has register groups hasregistergroups i stack frame istackframe has variables hasvariables override has variables hasvariables debug exception debugexception get variables getvariables size org eclipse debug core model i filtered step ifilteredstep can step with filters canstepwithfilters override can step with filters canstepwithfilters can step into canstepinto string filters get java debug target getjavadebugtarget get step filters getstepfilters filters filters length org eclipse debug core model i filtered step ifilteredstep step with filters stepwithfilters override step with filters stepwithfilters debug exception debugexception i java thread ijavathread get thread getthread step with filters stepwithfilters org eclipse jdt debug core i java stack frame ijavastackframe get source path getsourcepath java lang string override string get source path getsourcepath string stratum debug exception debugexception f thread fthread f location flocation source path sourcepath stratum absent information exception absentinformationexception runtime exception runtimeexception target request failed targetrequestfailed message format messageformat format jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe exception retrieving source path to string tostring org eclipse jdt debug core i java stack frame ijavastackframe get source path getsourcepath override string get source path getsourcepath debug exception debugexception f thread fthread f location flocation source path sourcepath absent information exception absentinformationexception runtime exception runtimeexception target request failed targetrequestfailed message format messageformat format jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe exception retrieving source path to string tostring org eclipse jdt debug core i java stack frame ijavastackframe get line number getlinenumber java lang string override get line number getlinenumber string stratum debug exception debugexception f thread fthread f location flocation line number linenumber stratum runtime exception runtimeexception get thread getthread is suspended issuspended target request failed targetrequestfailed message format messageformat format jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe exception retrieving number to string tostring org eclipse jdt debug core i java stack frame ijavastackframe get source name getsourcename java lang string override string get source name getsourcename string stratum debug exception debugexception f thread fthread f location flocation source name sourcename stratum absent information exception absentinformationexception native method exception nativemethodexception runtime exception runtimeexception target request failed targetrequestfailed message format messageformat format jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe exception retrieving source to string tostring javadoc org eclipse jdt debug core i java stack frame ijavastackframe is varargs isvarargs override is var args isvarargs debug exception debugexception get underlying method getunderlyingmethod is var args isvarargs javadoc org eclipse jdt debug core i java stack frame ijavastackframe can force return canforcereturn override can force return canforcereturn get java debug target getjavadebugtarget supports force return supportsforcereturn is suspended issuspended is native isnative is top stack frame istopstackframe list i java stack frame ijavastackframe frames f thread fthread compute stack frames computestackframes frames index of indexof jdi stack frame jdistackframe prev jdi stack frame jdistackframe frames prev can drop to frame candroptoframe debug exception debugexception javadoc org eclipse jdt debug core i java stack frame ijavastackframe force return forcereturn org eclipse jdt debug core i java value ijavavalue override force return forcereturn i java value ijavavalue debug exception debugexception is top stack frame istopstackframe f thread fthread force return forcereturn check assignment compatible method method get underlying method getunderlyingmethod value impl valueimpl check value checkvalue jdi value jdivalue get underlying value getunderlyingvalue method return type returntype virtual machine impl virtualmachineimpl method virtual machine virtualmachine invalid type exception invalidtypeexception target request failed targetrequestfailed jdi debug model messages jdidebugmodelmessages jdi stack frame jdistackframe class not loaded exception classnotloadedexception target request failed targetrequestfailed jdi debug model messages jdidebugmodelmessages jdi thread jdithread list i java stack frame ijavastackframe frames f thread fthread compute stack frames computestackframes frames index of indexof jdi stack frame jdistackframe prev jdi stack frame jdistackframe frames f thread fthread pop frame popframe prev f thread fthread force return forcereturn