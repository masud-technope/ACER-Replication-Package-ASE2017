copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal corext refactoring rename java util arrays java util hash set hashset java util iterator java util org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime sub progress monitor subprogressmonitor org eclipse ltk core refactoring group category set groupcategoryset org eclipse ltk core refactoring refactoring status refactoringstatus org eclipse ltk core refactoring refactoring status context refactoringstatuscontext org eclipse ltk core refactoring participants check conditions context checkconditionscontext org eclipse jdt core i method imethod org eclipse jdt core i type itype org eclipse jdt core i type hierarchy itypehierarchy org eclipse jdt core java model exception javamodelexception org eclipse jdt core signature org eclipse jdt internal corext refactoring checks org eclipse jdt internal corext refactoring java refactoring arguments javarefactoringarguments org eclipse jdt internal corext refactoring refactoring availability tester refactoringavailabilitytester org eclipse jdt internal corext refactoring refactoring core messages refactoringcoremessages org eclipse jdt internal corext refactoring base java status context javastatuscontext org eclipse jdt internal corext refactoring util text change manager textchangemanager org eclipse jdt internal corext util jdt flags jdtflags org eclipse jdt internal corext util messages org eclipse jdt internal viewsupport basic element labels basicelementlabels rename virtual method processor renamevirtualmethodprocessor rename method processor renamemethodprocessor i method imethod f original method foriginalmethod f activation checked factivationchecked i type hierarchy itypehierarchy f cached hierarchy fcachedhierarchy creates rename method processor param method method rename virtual method processor renamevirtualmethodprocessor i method imethod method method f original method foriginalmethod get method getmethod creates rename method processor arguments param method method param arguments arguments param status status rename virtual method processor renamevirtualmethodprocessor i method imethod method java refactoring arguments javarefactoringarguments arguments refactoring status refactoringstatus status method refactoring status refactoringstatus initialize status initializestatus initialize arguments status merge initialize status initializestatus f original method foriginalmethod get method getmethod javadoc constructor called rename type processor renametypeprocessor initializes method processor resolved top level ripple methods rename virtual method processor renamevirtualmethodprocessor i method imethod top level toplevel i method imethod ripples text change manager textchangemanager change manager changemanager i type hierarchy itypehierarchy hierarchy group category set groupcategoryset category set categoryset top level toplevel change manager changemanager category set categoryset f original method foriginalmethod get method getmethod top level f activation checked factivationchecked f cached hierarchy fcachedhierarchy hierarchy set methods to rename setmethodstorename ripples i method imethod get original method getoriginalmethod f original method foriginalmethod i type hierarchy itypehierarchy get cached hierarchy getcachedhierarchy i type itype declaring i progress monitor iprogressmonitor monitor java model exception javamodelexception f cached hierarchy fcachedhierarchy declaring equals f cached hierarchy fcachedhierarchy get type gettype f cached hierarchy fcachedhierarchy f cached hierarchy fcachedhierarchy declaring new type hierarchy newtypehierarchy sub progress monitor subprogressmonitor monitor f cached hierarchy fcachedhierarchy override is applicable isapplicable core exception coreexception refactoring availability tester refactoringavailabilitytester is rename virtual method available isrenamevirtualmethodavailable get method getmethod preconditions override refactoring status refactoringstatus check initial conditions checkinitialconditions i progress monitor iprogressmonitor monitor core exception coreexception refactoring status refactoringstatus result check initial conditions checkinitialconditions monitor result has fatal error hasfatalerror result nls monitor begin task begintask f activation checked factivationchecked code change method changed i method imethod method get method getmethod f original method foriginalmethod method i type hierarchy itypehierarchy hierarchy i type itype declaring type declaringtype method get declaring type getdeclaringtype declaring type declaringtype is interface isinterface hierarchy get cached hierarchy getcachedhierarchy declaring type declaringtype sub progress monitor subprogressmonitor monitor i method imethod top most topmost get method getmethod method checks methodchecks is virtual isvirtual top most topmost top most topmost method checks methodchecks get top most method gettopmostmethod get method getmethod hierarchy monitor top most topmost initialize top most topmost f activation checked factivationchecked monitor result override refactoring status refactoringstatus do check final conditions docheckfinalconditions i progress monitor iprogressmonitor check conditions context checkconditionscontext check context checkcontext core exception coreexception nls begin task begintask refactoring status refactoringstatus result refactoring status refactoringstatus result merge do check final conditions docheckfinalconditions sub progress monitor subprogressmonitor check context checkcontext result has fatal error hasfatalerror result i method imethod method get method getmethod i type itype declaring method get declaring type getdeclaringtype i type hierarchy itypehierarchy hierarchy get cached hierarchy getcachedhierarchy declaring sub progress monitor subprogressmonitor string get new element name getnewelementname declaring is interface isinterface is special case isspecialcase result add error adderror refactoring core messages refactoringcoremessages rename method in interface refactoring renamemethodininterfacerefactoring special worked i method imethod related methods relatedmethods related type decl ares method name relatedtypedeclaresmethodname sub progress monitor subprogressmonitor method related methods relatedmethods length i method imethod related method relatedmethod related methods relatedmethods refactoring status context refactoringstatuscontext context java status context javastatuscontext create related method relatedmethod result add error adderror refactoring core messages refactoringcoremessages rename method in interface refactoring renamemethodininterfacerefactoring defined context classes declare overriding native method classesdeclareoverridingnativemethod hierarchy get all subtypes getallsubtypes declaring result add error adderror messages format refactoring core messages refactoringcoremessages rename virtual method refactoring renamevirtualmethodrefactoring req uieres requieres renaming string basic element labels basicelementlabels get java element name getjavaelementname method get element name getelementname unsatisfied link error unsatisfiedlinkerror i method imethod hierarchy methods hierarchymethods hierarchy decl ares method name hierarchydeclaresmethodname sub progress monitor subprogressmonitor hierarchy method hierarchy methods hierarchymethods length i method imethod hierarchy method hierarchymethod hierarchy methods hierarchymethods refactoring status context refactoringstatuscontext context java status context javastatuscontext create hierarchy method hierarchymethod checks compare param types compareparamtypes method get parameter types getparametertypes hierarchy method hierarchymethod get parameter types getparametertypes result add error adderror messages format refactoring core messages refactoringcoremessages rename virtual method refactoring renamevirtualmethodrefactoring hierarchy declares basic element labels basicelementlabels get java element name getjavaelementname context result add warning addwarning messages format refactoring core messages refactoringcoremessages rename virtual method refactoring renamevirtualmethodrefactoring hierarchy declares basic element labels basicelementlabels get java element name getjavaelementname context f cached hierarchy fcachedhierarchy result checks i method imethod related type decl ares method name relatedtypedeclaresmethodname i progress monitor iprogressmonitor i method imethod method string new name newname core exception coreexception i method imethod result hash set hashset i type itype types get related types getrelatedtypes nls begin task begintask types size iterator i type itype iter types iterator iter has next hasnext i method imethod checks find method findmethod method iter i type itype declaring get declaring type getdeclaringtype result add all addall arrays as list aslist hierarchy decl ares method name hierarchydeclaresmethodname sub progress monitor subprogressmonitor declaring new type hierarchy newtypehierarchy sub progress monitor subprogressmonitor new name newname result to array toarray i method imethod result size is special case isspecialcase core exception coreexception string no params noparams string string special names specialnames string nls nls nls nls nls to string tostring nls nls nls nls nls to string tostring nls nls nls nls nls to string tostring nls nls nls nls nls to string tostring nls nls nls nls nls equals nls nls nls nls nls equals nls nls nls nls nls get class getclass nls nls nls nls nls get class getclass nls nls nls nls nls hash code hashcode nls nls nls nls nls notify notify all notifyall wait wait nls nls nls nls wait string special param types specialparamtypes string no params noparams no params noparams no params noparams no params noparams nls nls q object qobject nls nls qjava lang object nls nls no params noparams nls nls no params noparams no params noparams no params noparams no params noparams signature sig signature sig signature sig no params noparams string special return types specialreturntypes string nls nls nls nls q string qstring nls nls nls nls q string qstring nls nls nls nls qjava lang string nls nls nls nls qjava lang string nls nls signature sig nls nls signature sig nls nls q class qclass nls nls qjava lang signature sig signature sig signature sig signature sig signature sig signature sig is true istrue special names specialnames length special param types specialparamtypes length special param types specialparamtypes length special return types specialreturntypes length special names specialnames length special names specialnames equals get new element name getnewelementname checks compare param types compareparamtypes get method getmethod get parameter types getparametertypes special param types specialparamtypes special return types specialreturntypes equals get method getmethod get return type getreturntype i type itype get related types getrelatedtypes i method imethod methods get methods to rename getmethodstorename i type itype result hash set hashset methods size iterator i method imethod iter methods iterator iter has next hasnext result add iter get declaring type getdeclaringtype result checks classes declare overriding native method classesdeclareoverridingnativemethod i type itype classes core exception coreexception classes length i method imethod methods classes get methods getmethods methods length methods equals get method getmethod jdt flags jdtflags is native isnative methods checks find similar method findsimilarmethod get method getmethod i method imethod methods override string get delegate updating title getdelegateupdatingtitle plural plural refactoring core messages refactoringcoremessages delegate method creator delegatemethodcreator original renamed plural refactoring core messages refactoringcoremessages delegate method creator delegatemethodcreator original renamed singular