copyright ibm corporation rights reserved program accompanying materials terms common license accompanies distribution http eclipse org legal cpl html contributors ibm corporation initial api implementation org eclipse jdt internal compiler lookup org eclipse jdt internal compiler ast org eclipse jdt internal compiler ast abstract method declaration abstractmethoddeclaration org eclipse jdt internal compiler ast constructor declaration constructordeclaration org eclipse jdt internal compiler ast qualified name reference qualifiednamereference org eclipse jdt internal compiler ast single name reference singlenamereference org eclipse jdt internal compiler ast type declaration typedeclaration org eclipse jdt internal compiler class fmt classfmt class file constants classfileconstants org eclipse jdt internal compiler codegen code stream codestream org eclipse jdt internal compiler flow flow info flowinfo org eclipse jdt internal compiler flow unconditional flow info unconditionalflowinfo org eclipse jdt internal compiler impl compiler options compileroptions org eclipse jdt internal compiler impl reference context referencecontext org eclipse jdt internal compiler problem problem reporter problemreporter block scope methods constructors clinits representing outer most outermost blocks cope blockscope note scope enclose field initializers sub scopes subscopes method scope methodscope block scope blockscope reference context referencecontext reference context referencecontext method modifier initializer is static isstatic fields resolution is constructor call isconstructorcall field initialized field binding fieldbinding initialized field initializedfield field declared last visible field d lastvisiblefieldid not e note initialized field initializedfield last visible field d lastvisiblefieldid processing instance field initializers flow analysis setting flow analysis analysis index analysisindex is prop agating inner class emulation ispropagatinginnerclassemulation local variables table attributes last index lastindex definite inits definiteinits extra definite inits extradefiniteinits emulation synthetic argument binding syntheticargumentbinding extra synthetic arguments extrasyntheticarguments method scope methodscope class scope classscope parent reference context referencecontext context is static isstatic method scope parent locals local variable binding localvariablebinding reference context referencecontext context is static isstatic is static isstatic start index startindex spec check and set modifiers for constructor checkandsetmodifiersforconstructor method binding methodbinding method binding methodbinding modifiers method binding methodbinding modifiers modifiers acc alternate modifier problem accalternatemodifierproblem problem reporter problemreporter duplicate modifier for method duplicatemodifierformethod method binding methodbinding declaring class declaringclass abstract method declaration abstractmethoddeclaration reference context referencecontext constructor declaration constructordeclaration reference context referencecontext is default constructor isdefaultconstructor method binding methodbinding declaring class declaringclass is public ispublic modifiers acc public accpublic method binding methodbinding declaring class declaringclass is protected isprotected modifiers acc protected accprotected point tests bits reserved real modifiers realmodifiers modifiers acc just flag accjustflag check abnormal modifiers unexpected modifiers unexpectedmodifiers acc public accpublic acc private accprivate acc protected accprotected acc strictfp accstrictfp real modifiers realmodifiers unexpected modifiers unexpectedmodifiers problem reporter problemreporter illegal modifier for method illegalmodifierformethod method binding methodbinding declaring class declaringclass abstract method declaration abstractmethoddeclaration reference context referencecontext abstract method declaration abstractmethoddeclaration reference context referencecontext modifiers acc strictfp accstrictfp check parse node explicitly problem reporter problemreporter illegal modifier for method illegalmodifierformethod method binding methodbinding declaring class declaringclass abstract method declaration abstractmethoddeclaration reference context referencecontext check incompatible modifiers visibility bits is olate isolate visibility bits accessor bits accessorbits real modifiers realmodifiers acc public accpublic acc protected accprotected acc private accprivate accessor bits accessorbits accessor bits accessorbits problem reporter problemreporter illegal visibility modifier combination for method illegalvisibilitymodifiercombinationformethod method binding methodbinding declaring class declaringclass abstract method declaration abstractmethoddeclaration reference context referencecontext res trictive restrictive accessor bits accessorbits acc public accpublic accessor bits accessorbits acc protected accprotected modifiers acc protected accprotected accessor bits accessorbits acc private accprivate modifiers acc private accprivate accessor bits accessorbits acc protected accprotected accessor bits accessorbits acc private accprivate modifiers acc private accprivate receiver declaring nested type receiver problems type emulation method binding methodbinding declaring class declaringclass is private isprivate modifiers acc private accprivate modifiers acc private accprivate method binding methodbinding modifiers modifiers spec check and set modifiers for method checkandsetmodifiersformethod method binding methodbinding method binding methodbinding modifiers method binding methodbinding modifiers modifiers acc alternate modifier problem accalternatemodifierproblem problem reporter problemreporter duplicate modifier for method duplicatemodifierformethod method binding methodbinding declaring class declaringclass abstract method declaration abstractmethoddeclaration reference context referencecontext point tests bits reserved real modifiers realmodifiers modifiers acc just flag accjustflag requested modifiers method method binding methodbinding declaring class declaringclass is interface isinterface real modifiers realmodifiers acc public accpublic acc abstract accabstract problem reporter problemreporter illegal modifier for interface method illegalmodifierforinterfacemethod method binding methodbinding declaring class declaringclass abstract method declaration abstractmethoddeclaration reference context referencecontext check abnormal modifiers unexpected modifiers unexpectedmodifiers acc public accpublic acc private accprivate acc protected accprotected acc abstract accabstract acc static accstatic acc final accfinal acc synchronized accsynchronized acc native accnative acc strictfp accstrictfp real modifiers realmodifiers unexpected modifiers unexpectedmodifiers problem reporter problemreporter illegal modifier for method illegalmodifierformethod method binding methodbinding declaring class declaringclass abstract method declaration abstractmethoddeclaration reference context referencecontext check incompatible modifiers visibility bits is olate isolate visibility bits accessor bits accessorbits real modifiers realmodifiers acc public accpublic acc protected accprotected acc private accprivate accessor bits accessorbits accessor bits accessorbits problem reporter problemreporter illegal visibility modifier combination for method illegalvisibilitymodifiercombinationformethod method binding methodbinding declaring class declaringclass abstract method declaration abstractmethoddeclaration reference context referencecontext res trictive restrictive accessor bits accessorbits acc public accpublic accessor bits accessorbits acc protected accprotected modifiers acc protected accprotected accessor bits accessorbits acc private accprivate modifiers acc private accprivate accessor bits accessorbits acc protected accprotected accessor bits accessorbits acc private accprivate modifiers acc private accprivate check modifiers incompatible modifier modifiers acc abstract accabstract incompatible with abstract incompatiblewithabstract acc private accprivate acc static accstatic acc final accfinal acc synchronized accsynchronized acc native accnative acc strictfp accstrictfp modifiers incompatible with abstract incompatiblewithabstract problem reporter problemreporter illegal abstract modifier combination for method illegalabstractmodifiercombinationformethod method binding methodbinding declaring class declaringclass abstract method declaration abstractmethoddeclaration reference context referencecontext method binding methodbinding declaring class declaringclass is abstract isabstract problem reporter problemreporter abstract method in abstract class abstractmethodinabstractclass source type binding sourcetypebinding method binding methodbinding declaring class declaringclass abstract method declaration abstractmethoddeclaration reference context referencecontext methods tag ged tagged modifiers acc native accnative modifiers acc strictfp accstrictfp problem reporter problemreporter native methods cannot be strictfp nativemethodscannotbestrictfp method binding methodbinding declaring class declaringclass abstract method declaration abstractmethoddeclaration reference context referencecontext members author ized authorized member top level type real modifiers realmodifiers acc static accstatic method binding methodbinding declaring class declaringclass is nested type isnestedtype method binding methodbinding declaring class declaringclass is static isstatic problem reporter problemreporter unexpected static modifier for method unexpectedstaticmodifierformethod method binding methodbinding declaring class declaringclass abstract method declaration abstractmethoddeclaration reference context referencecontext method binding methodbinding modifiers modifiers compute variable positions scopes initial position offset ignoring unused local variables deal arguments locals sub scopes subscopes processed block scope blockscope method compute local variable positions computelocalvariablepositions init offset initoffset code stream codestream code stream codestream is reporting unused argument isreportingunusedargument reference context referencecontext abstract method declaration abstractmethoddeclaration abstract method declaration abstractmethoddeclaration method decl methoddecl abstract method declaration abstractmethoddeclaration reference context referencecontext method binding methodbinding method method decl methoddecl binding compiler options compileroptions options compilation unit scope compilationunitscope environment options method is abstract isabstract method is impl ementing isimplementing options report unused parameter when impl ementing abstract reportunusedparameterwhenimplementingabstract method is overriding isoverriding method is impl ementing isimplementing options report unused parameter when overriding concrete reportunusedparameterwhenoverridingconcrete method is main ismain is reporting unused argument isreportingunusedargument offset init offset initoffset max offset maxoffset init offset initoffset manage arguments ilocal max locals maxlocals local index localindex ilocal max locals maxlocals local variable binding localvariablebinding local locals ilocal arguments local local is argument isargument report fake variable is reporting unused argument isreportingunusedargument local use flag useflag local variable binding localvariablebinding unused declaration reachable local declaration bits ast node astnode is local declaration reachable k islocaldeclarationreachablemask problem reporter problemreporter unused argument unusedargument local declaration record user defined argument attribute generation code stream codestream record local assign variable position local resolved position resolvedposition offset local type long binding longbinding local type double binding doublebinding offset offset check arguments local variables arguments offset xff problem reporter problemreporter no more available space for argument nomoreavailablespaceforargument local local declaration ilocal sneak extra argument local variables extra synthetic arguments extrasyntheticarguments iarg max arguments maxarguments extra synthetic arguments extrasyntheticarguments length iarg max arguments maxarguments iarg synthetic argument binding syntheticargumentbinding argument extra synthetic arguments extrasyntheticarguments iarg argument resolved position resolvedposition offset argument type long binding longbinding argument type double binding doublebinding offset offset arguments offset xff problem reporter problemreporter no more available space for argument nomoreavailablespaceforargument argument ast node astnode reference context referencecontext compute local variable positions computelocalvariablepositions ilocal offset code stream codestream error management errors prevent method created correct method binding element caused problem incorrect thrown exception method binding methodbinding create method createmethod abstract method declaration abstractmethoddeclaration method ensure error reporting reference context referencecontext method method scope source type binding sourcetypebinding declaring class declaringclass reference type referencetype binding modifiers method modifiers acc unresolved accunresolved method is constructor isconstructor method is default constructor isdefaultconstructor modifiers acc is default constructor accisdefaultconstructor method binding method binding methodbinding modifiers declaring class declaringclass check and set modifiers for constructor checkandsetmodifiersforconstructor method binding declaring class declaringclass is interface isinterface modifiers acc public accpublic acc abstract accabstract method binding method binding methodbinding modifiers method selector declaring class declaringclass check and set modifiers for method checkandsetmodifiersformethod method binding is static isstatic method binding is static isstatic type parameter typeparameter type parameters typeparameters method type parameters typeparameters construct type variables source type parameters typeparameters environment options source level sourcelevel class file constants classfileconstants jdk method binding type variables typevariables no type variables notypevariables method binding type variables typevariables create type variables createtypevariables type parameters typeparameters method binding method binding modifiers acc generic signature accgenericsignature method binding overridden detect error explicit constructor call my x myx my x myx calls field accesses errors field binding fieldbinding find field findfield type binding typebinding receiver type receivertype field name fieldname invocation site invocationsite invocation site invocationsite need resolve needresolve field binding fieldbinding field find field findfield receiver type receivertype field name fieldname invocation site invocationsite need resolve needresolve field field is valid binding isvalidbinding answer error field field field is static isstatic fields accessible field is constructor call isconstructorcall receiver type receivertype enclosing source type enclosingsourcetype field invocation site invocationsite single name reference singlenamereference problem field binding problemfieldbinding closest match field field declaring class declaringclass field name fieldname non static reference in constructor invocation nonstaticreferenceinconstructorinvocation invocation site invocationsite qualified name reference qualifiednamereference field binding qualified name reference qualifiednamereference qualified name reference qualifiednamereference invocation site invocationsite binding field field binding fieldbinding tokens problem field binding problemfieldbinding closest match field field declaring class declaringclass field name fieldname non static reference in constructor invocation nonstaticreferenceinconstructorinvocation field is inside constructor isinsideconstructor reference context referencecontext constructor declaration constructordeclaration is inside initializer isinsideinitializer reference context referencecontext type declaration typedeclaration is inside initializer or constructor isinsideinitializerorconstructor reference context referencecontext type declaration typedeclaration reference context referencecontext constructor declaration constructordeclaration answer problem reporter raising problems note side updates current reference context unit type method problem handler decides abort problem reporter problemreporter problem reporter problemreporter method scope methodscope outer method scope outermethodscope outer method scope outermethodscope outer most method scope outermostmethodscope problem reporter problemreporter problem reporter problemreporter reference compilation unit referencecompilationunit problem reporter problemreporter problem reporter problemreporter reference context referencecontext reference context referencecontext problem reporter problemreporter outer method scope outermethodscope problem reporter problemreporter record initialization states recordinitializationstates flow info flowinfo flow info flowinfo flow info flowinfo is reachable isreachable unconditional flow info unconditionalflowinfo unconditional flow info unconditionalflowinfo flow info flowinfo unconditional inits unconditionalinits extra inits extrainits unconditional flow info unconditionalflowinfo extra definite inits extradefiniteinits inits unconditional flow info unconditionalflowinfo definite inits definiteinits check next entry checknextentry last index lastindex definite inits definiteinits inits other inits otherinits extra definite inits extradefiniteinits extra inits extrainits other inits otherinits extra inits extrainits length other inits otherinits length max max extra inits extrainits length max extra inits extrainits other inits otherinits check next entry checknextentry extra inits extrainits other inits otherinits add entry definite inits definiteinits length last index lastindex resize system arraycopy definite inits definiteinits definite inits definiteinits last index lastindex last index lastindex system arraycopy extra definite inits extradefiniteinits extra definite inits extradefiniteinits last index lastindex last index lastindex definite inits definiteinits last index lastindex inits extra inits extrainits extra definite inits extradefiniteinits last index lastindex extra inits extrainits length system arraycopy extra inits extrainits extra definite inits extradefiniteinits last index lastindex extra inits extrainits length last index lastindex answer reference method scope initialization scoope abstract method declaration abstractmethoddeclaration reference method referencemethod reference context referencecontext abstract method declaration abstractmethoddeclaration abstract method declaration abstractmethoddeclaration reference context referencecontext answer reference type scope nearest enclosing type scope type declaration typedeclaration reference type referencetype class scope classscope parent reference context referencecontext string basic to string basictostring tab nls string new line newline tab nls new line newline nls string new line newline method scope nls new line newline nls new line newline locals local index localindex nls new line newline locals to string tostring nls new line newline start index startindex start index startindex nls new line newline is constructor call isconstructorcall is constructor call isconstructorcall nls new line newline initialized field initializedfield initialized field initializedfield nls new line newline last visible field d lastvisiblefieldid last visible field d lastvisiblefieldid nls new line newline reference context referencecontext reference context referencecontext