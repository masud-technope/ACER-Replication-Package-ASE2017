copyright ibm corporation rights reserved program accompanying materials terms common license accompanies distribution http eclipse org legal cpl html contributors ibm corporation initial api implementation org eclipse jdt internal compiler ast org eclipse jdt internal compiler ast visitor astvisitor org eclipse jdt internal compiler codegen org eclipse jdt internal compiler flow org eclipse jdt internal compiler lookup explicit constructor call explicitconstructorcall statement invocation site invocationsite expression arguments expression qualification exact binding lookup method binding methodbinding binding actual binding code generation synthetic accessor method binding methodbinding codegen binding codegenbinding synthetic accessor emulation method binding methodbinding synthetic accessor syntheticaccessor access mode accessmode type reference typereference type arguments typearguments type binding typebinding generic type arguments generictypearguments implicit super implicitsuper variable binding variablebinding implicit arguments implicitarguments discard enclosing instance discardenclosinginstance todo remove dom parser domparser activated type arguments source start typeargumentssourcestart explicit constructor call explicitconstructorcall access mode accessmode access mode accessmode access mode accessmode flow info flowinfo analyse code analysecode block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo method scope methodscope current scope currentscope is constructor call isconstructorcall process enclosing instance qualification flow info flowinfo qualification analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo unconditional inits unconditionalinits process arguments arguments max arguments length max flow info flowinfo arguments analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo unconditional inits unconditionalinits reference binding referencebinding thrown exceptions thrownexceptions thrown exceptions thrownexceptions binding thrown exceptions thrownexceptions no exceptions noexceptions check exceptions flow context flowcontext check exception handlers checkexceptionhandlers thrown exceptions thrownexceptions access mode accessmode implicit super implicitsuper ast node astnode current scope currentscope method scope methodscope reference context referencecontext ast node astnode flow info flowinfo current scope currentscope manage enclosing instance access if necessary manageenclosinginstanceaccessifnecessary current scope currentscope flow info flowinfo manage synthetic access if necessary managesyntheticaccessifnecessary current scope currentscope flow info flowinfo flow info flowinfo method scope methodscope current scope currentscope is constructor call isconstructorcall constructor call code generation param current scope currentscope org eclipse jdt internal compiler lookup block scope blockscope param code stream codestream org eclipse jdt internal compiler codegen code stream codestream generate code generatecode block scope blockscope current scope currentscope code stream codestream code stream codestream bits isreachablemask method scope methodscope current scope currentscope is constructor call isconstructorcall code stream codestream position code stream codestream aload handling inner class innerclass constructor invocation reference binding referencebinding target type targettype codegen binding codegenbinding declaring class declaringclass handling inner class innerclass instance allocation enclosing instance arguments target type targettype is nested type isnestedtype code stream codestream generate synthetic enclosing instance values generatesyntheticenclosinginstancevalues current scope currentscope target type targettype discard enclosing instance discardenclosinginstance qualification regular code gen arguments max arguments length max arguments generate code generatecode current scope currentscope code stream codestream handling inner class innerclass instance allocation local arguments target type targettype is nested type isnestedtype code stream codestream generate synthetic outer argument values generatesyntheticouterargumentvalues current scope currentscope target type targettype synthetic accessor syntheticaccessor synthetic accessor extra arguments appended signature values max synthetic accessor syntheticaccessor parameters length codegen binding codegenbinding parameters length max code stream codestream aconst code stream codestream invokespecial synthetic accessor syntheticaccessor code stream codestream invokespecial codegen binding codegenbinding code stream codestream record positions from recordpositionsfrom source start sourcestart method scope methodscope current scope currentscope is constructor call isconstructorcall org eclipse jdt internal compiler lookup invocation site invocationsite generic type arguments generictypearguments type binding typebinding generic type arguments generictypearguments generic type arguments generictypearguments is implicit super isimplicitsuper access mode accessmode implicit super implicitsuper is super access issuperaccess access mode accessmode is type access istypeaccess emulation consists recording dependency link performing level prop agation propagation dependency mechanism dealing source target types time reach exact manage enclosing instance access if necessary manageenclosinginstanceaccessifnecessary block scope blockscope current scope currentscope flow info flowinfo flow info flowinfo reference binding referencebinding super type supertype flow info flowinfo is reachable isreachable perform emulation work local type super type supertype binding declaring class declaringclass is nested type isnestedtype current scope currentscope enclosing source type enclosingsourcetype is local type islocaltype super type supertype is local type islocaltype local type binding localtypebinding super type supertype add inner emulation dependent addinneremulationdependent current scope currentscope qualification locally propagate desired shape current scope currentscope propagate inner emulation propagateinneremulation super type supertype qualification manage synthetic access if necessary managesyntheticaccessifnecessary block scope blockscope current scope currentscope flow info flowinfo flow info flowinfo flow info flowinfo is reachable isreachable constructor parameterized type original constructor codegen time codegen binding codegenbinding binding original perform emulation work local type binding is private isprivate access mode accessmode current scope currentscope environment options is private constructor access changing visibility isprivateconstructoraccesschangingvisibility codegen binding codegenbinding tag for clearing private modifier tagforclearingprivatemodifier constructor dumped emulation required synthetic accessor syntheticaccessor source type binding sourcetypebinding codegen binding codegenbinding declaring class declaringclass add synthetic method addsyntheticmethod codegen binding codegenbinding is super access issuperaccess current scope currentscope problem reporter problemreporter need to emulate method access needtoemulatemethodaccess codegen binding codegenbinding string buffer stringbuffer print statement printstatement indent string buffer stringbuffer output print indent printindent indent output qualification qualification print expression printexpression output append type arguments typearguments nls output append max type arguments typearguments length max type arguments typearguments print output nls output append nls type arguments typearguments max print output output append access mode accessmode nls output append nls output append arguments arguments length nls output append nls arguments print expression printexpression output nls output append resolve block scope blockscope scope type constructor test get constructor getconstructor mark fact constructor call unmark returns method scope methodscope method scope methodscope scope method scope methodscope abstract method declaration abstractmethoddeclaration method declaration methoddeclaration method scope methodscope reference method referencemethod method declaration methoddeclaration method declaration methoddeclaration is constructor isconstructor constructor declaration constructordeclaration method declaration methoddeclaration constructor call constructorcall scope problem reporter problemreporter invalid explicit constructor call invalidexplicitconstructorcall method scope methodscope is constructor call isconstructorcall reference binding referencebinding receiver type receivertype scope enclosing source type enclosingsourcetype access mode accessmode receiver type receivertype receiver type receivertype superclass receiver type receivertype qualification type enclosing type enclosingtype qualification access mode accessmode scope problem reporter problemreporter unnecessary enclosing instance specification unnecessaryenclosinginstancespecification qualification receiver type receivertype reference binding referencebinding enclosing type enclosingtype receiver type receivertype enclosing type enclosingtype enclosing type enclosingtype scope problem reporter problemreporter unnecessary enclosing instance specification unnecessaryenclosinginstancespecification qualification receiver type receivertype discard enclosing instance discardenclosinginstance type binding typebinding q tb qtb qualification resolve type expecting resolvetypeexpecting scope enclosing type enclosingtype qualification compute conversion computeconversion scope q tb qtb q tb qtb resolve type arguments constructor call type arguments typearguments length type arguments typearguments length type checks typechecks arguments arg has error arghaserror generic type arguments generictypearguments type binding typebinding length length generic type arguments generictypearguments type arguments typearguments resolve type resolvetype scope arg has error arghaserror arg has error arghaserror arguments buff ering buffering method lookup type binding typebinding argument types argumenttypes no parameters noparameters args contain cast argscontaincast arguments type checks typechecks arguments arg has error arghaserror length arguments length argument types argumenttypes type binding typebinding length length expression argument arguments argument cast expression castexpression check argument bits ignore need for cast check k ignoreneedforcastcheckmask args contain cast argscontaincast argument types argumenttypes argument resolve type resolvetype scope arg has error arghaserror arg has error arghaserror binding scope get constructor getconstructor receiver type receivertype argument types argumenttypes is valid binding isvalidbinding is method use deprecated ismethodusedeprecated binding scope scope problem reporter problemreporter deprecated method deprecatedmethod binding arguments check invocation arguments checkinvocationarguments scope receiver type receivertype binding arguments argument types argumenttypes args contain cast argscontaincast binding is private isprivate binding original modifiers acc private used accprivateused binding declaring class declaringclass binding declaring class declaringclass receiver type receivertype scope problem reporter problemreporter invalid constructor invalidconstructor binding method scope methodscope is constructor call isconstructorcall set actual receiver type setactualreceivertype reference binding referencebinding receiver type receivertype set depth setdepth depth ignore set field index setfieldindex depth ignore traverse ast visitor astvisitor visitor block scope blockscope scope visitor visit scope qualification qualification traverse visitor scope type arguments typearguments type arguments length typeargumentslength type arguments typearguments length type arguments length typeargumentslength type arguments typearguments traverse visitor scope arguments argument length argumentlength arguments length argument length argumentlength arguments traverse visitor scope visitor end visit endvisit scope