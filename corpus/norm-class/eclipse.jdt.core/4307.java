copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation stephan herrmann contributions bug warning unboxing single name reference singlenamereference npe bug warning missing resources bug compiler detect problems nested code local loop bug compiler annotations checking bug compiler inconsistent error reporting bug edit orial editorial cleanup bug bug bug filter practically unimportant resource leak warnings bug compiler resource avoid remaining pos itives positives compiling eclipse sdk bug compiler resource restore resource leak warnings bug compiler distinguish warnings based flow analysis annotations bug compiler compiler misidentifies variable bug compiler resource incorrect potential resource leak bug compiler resource incorrect resource leak warning creating stream conditional bug compiler syntactic analysis field references bug compiler diagnostic bug analysis support lambda methods bug compiler apply annotation types analysis bug follow type annotations bug bug compiler subclass type parameter substitution confuses checking bug safety comp romise compromise array creation bug compiler npe org eclipse jdt internal compiler ast conditional expression conditionalexpression generate code generatecode conditional expression conditionalexpression java bug str icter stricter checking type variables bug compiler java compiler recognize declaration style annotations bug compiler type correctly inferred lambda expression bug compiler loop improve analysis loops bug nonnull argument correctly inferred loop jesper moller contributions bug compiler implement semantic analysis lambda expressions reference expression org eclipse jdt internal compiler ast org eclipse jdt internal compiler ast expression context expressioncontext assignment context org eclipse jdt internal compiler ast visitor astvisitor org eclipse jdt internal compiler codegen org eclipse jdt internal compiler flow org eclipse jdt internal compiler impl constant org eclipse jdt internal compiler lookup return statement returnstatement statement expression expression sub routine statement subroutinestatement subroutines local variable binding localvariablebinding save value variable savevaluevariable init state index initstateindex implicit return implicitreturn return statement returnstatement expression expression source start sourcestart source end sourceend expression source start sourcestart source end sourceend return statement returnstatement expression expression source start sourcestart source end sourceend implicit return implicitreturn source start sourcestart source start sourcestart source end sourceend source end sourceend expression expression implicit return implicitreturn implicit return implicitreturn flow info flowinfo analyse code analysecode block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo expression functional expression functionalexpression expression resolved type resolvedtype expression resolved type resolvedtype is valid binding isvalidbinding don desc end descend proper target types lambda shape analysis per tinent pertinent fact const itutes constitutes abrupt exit gathered handled flow context flowcontext record abrupt exit recordabruptexit flow info flowinfo dead method scope methodscope method scope methodscope current scope currentscope method scope methodscope expression flow info flowinfo expression analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo expression checknpebyunboxing current scope currentscope flow context flowcontext flow info flowinfo flow info flowinfo reach mode reachmode flow info flowinfo reachable current scope currentscope compiler options compileroptions is annotation based null analysis enabled isannotationbasednullanalysisenabled check against null annotation checkagainstnullannotation current scope currentscope flow context flowcontext flow info flowinfo current scope currentscope compiler options compileroptions analyse resource leaks analyseresourceleaks faked tracking variable fakedtrackingvariable tracking variable trackingvariable faked tracking variable fakedtrackingvariable get close tracking variable getclosetrackingvariable expression flow info flowinfo flow context flowcontext tracking variable trackingvariable method scope methodscope tracking variable trackingvariable method scope methodscope tracking variable trackingvariable mark closed in nested method markclosedinnestedmethod returning method passes resp onsibility responsibility caller flow info flowinfo faked tracking variable fakedtrackingvariable mark passed to out side markpassedtooutside current scope currentscope expression flow info flowinfo flow context flowcontext init state index initstateindex method scope methodscope record initialization states recordinitializationstates flow info flowinfo compute sequence running blocks flow context flowcontext traversed context traversedcontext flow context flowcontext sub count subcount save value needed savevalueneeded has value to save hasvaluetosave need value store needvaluestore no auto close ables noautocloseables sub routine statement subroutinestatement traversed context traversedcontext sub routine subroutine subroutines subroutines sub routine statement subroutinestatement sub count subcount subroutines length grow system arraycopy grow subroutines grow grow subroutines sub routine statement subroutinestatement sub count subcount grow grow sub count subcount subroutines sub count subcount is sub routine escaping issubroutineescaping save value needed savevalueneeded bits ast node astnode is any sub routine escaping isanysubroutineescaping try statement trystatement try statement trystatement resources length no auto close ables noautocloseables traversed context traversedcontext record return from recordreturnfrom flow info flowinfo unconditional inits unconditionalinits traversed context traversedcontext inside sub routine flow context insidesubroutineflowcontext ast node astnode node traversed context traversedcontext associated node associatednode node synchronized statement synchronizedstatement bits ast node astnode is synchronized issynchronized node try statement trystatement try statement trystatement try statement trystatement try statement trystatement node collect inits flow info flowinfo add initializations from addinitializationsfrom try statement trystatement sub routine inits subroutineinits has value to save hasvaluetosave closest sub routine subroutine secret variable save value variable savevaluevariable prepare save value location preparesavevaluelocation try statement trystatement save value needed savevalueneeded init state index initstateindex method scope methodscope record initialization states recordinitializationstates flow info flowinfo traversed context traversedcontext initialization flow context initializationflowcontext current scope currentscope problem reporter problemreporter cannot return in initializer cannotreturnininitializer flow info flowinfo dead traversed context traversedcontext traversed context traversedcontext get local parent getlocalparent resize subroutines subroutines sub count subcount subroutines length system arraycopy subroutines subroutines sub routine statement subroutinestatement sub count subcount sub count subcount secret local variable not e note occur real method save value needed savevalueneeded save value variable savevaluevariable save value variable savevaluevariable use flag useflag local variable binding localvariablebinding save value variable savevaluevariable bits ast node astnode is synchronized issynchronized expression type binding typebinding equals equals equalsequals expression resolved type resolvedtype type binding typebinding abruptly presence auto close ables autocloseables https bugs eclipse org bugs bug cgi no auto close ables noautocloseables expression bits ast node astnode is returned value isreturnedvalue current scope currentscope check unclosed close ables checkunclosedcloseables flow info flowinfo flow context flowcontext current scope currentscope conditional structure resp ect respect block condition ally conditionally entered flow context flowcontext record abrupt exit recordabruptexit flow context flowcontext expire null checked field info expirenullcheckedfieldinfo flow info flowinfo dead override does not complete normally doesnotcompletenormally check against null annotation checkagainstnullannotation block scope blockscope scope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo null status nullstatus expression null status nullstatus flow info flowinfo flow context flowcontext tag bits tagbits method binding methodbinding method binding methodbinding use type annotations usetypeannotations scope environment uses null type annotations usesnulltypeannotations method binding methodbinding scope method scope methodscope reference method binding referencemethodbinding tag bits tagbits use type annotations usetypeannotations method binding methodbinding return type returntype tag bits tagbits method binding methodbinding tag bits tagbits null pointer exception nullpointerexception npe use type annotations usetypeannotations check against null type annotation checkagainstnulltypeannotation scope method binding methodbinding return type returntype expression flow context flowcontext flow info flowinfo null status nullstatus flow info flowinfo pro ve prove check declared ness enclosing method tag bits tagbits tag bits tagbits annotation non null annotationnonnull flow context flowcontext record nullity mismatch recordnullitymismatch scope expression expression resolved type resolvedtype method binding methodbinding return type returntype flow info flowinfo null status nullstatus retrun statement code generation generate finally invocation sequence finallyinvocationsequence param current scope currentscope org eclipse jdt internal compiler lookup block scope blockscope param code stream codestream org eclipse jdt internal compiler codegen code stream codestream generate code generatecode block scope blockscope current scope currentscope code stream codestream code stream codestream bits ast node astnode is reachable isreachable code stream codestream position already generated expression alreadygeneratedexpression generate expression need value store needvaluestore already generated expression alreadygeneratedexpression needed returning sub routine subroutine expression generate code generatecode current scope currentscope code stream codestream need value needvalue generate store save value if necessary generatestoresavevalueifnecessary code stream codestream generation code responsible invoking blocks sequence subroutines object reusablejsrtarget expression object type binding typebinding expression reusablejsrtarget max subroutines length max sub routine statement subroutinestatement subroutines did escape didescape generate sub routine invocation generatesubroutineinvocation current scope currentscope code stream codestream reusablejsrtarget init state index initstateindex save value variable savevaluevariable did escape didescape code stream codestream record positions from recordpositionsfrom source start sourcestart sub routine statement subroutinestatement reenter all exception handlers reenterallexceptionhandlers subroutines code stream codestream save value variable savevaluevariable code stream codestream load save value variable savevaluevariable expression already generated expression alreadygeneratedexpression expression generate code generatecode current scope currentscope code stream codestream hook code snippet generate store save value if necessary generatestoresavevalueifnecessary code stream codestream output suitable byte code bytecode wrap descriptor doits generate return byte code generatereturnbytecode code stream codestream save value variable savevaluevariable code stream codestream remove variable removevariable save value variable savevaluevariable init state index initstateindex code stream codestream remove not definitely assigned variables removenotdefinitelyassignedvariables current scope currentscope init state index initstateindex code stream codestream add definitely assigned variables adddefinitelyassignedvariables current scope currentscope init state index initstateindex code stream codestream record positions from recordpositionsfrom source start sourcestart sub routine statement subroutinestatement reenter all exception handlers reenterallexceptionhandlers subroutines code stream codestream dump suitable byte code bytecode statement generate return byte code generatereturnbytecode code stream codestream code stream codestream code stream codestream generate return byte code generatereturnbytecode expression generate store save value if necessary generatestoresavevalueifnecessary code stream codestream code stream codestream save value variable savevaluevariable code stream codestream store save value variable savevaluevariable variable visible local stored code stream codestream add variable addvariable save value variable savevaluevariable need value store needvaluestore expression expression constant constant notaconstant expression implicit conversion implicitconversion type ids typeids boxing expression null literal nullliteral need value needvalue save value variable savevaluevariable bits ast node astnode is synchronized issynchronized bits ast node astnode is any sub routine escaping isanysubroutineescaping prepare save value location preparesavevaluelocation try statement trystatement target try statement targettrystatement save value variable savevaluevariable target try statement targettrystatement secret return value secretreturnvalue string buffer stringbuffer print statement printstatement tab string buffer stringbuffer output nls print indent printindent tab output append expression expression print expression printexpression output output append resolve block scope blockscope scope method scope methodscope method scope methodscope scope method scope methodscope method binding methodbinding method binding methodbinding lambda expression lambdaexpression lambda method scope methodscope reference context referencecontext lambda expression lambdaexpression lambda expression lambdaexpression method scope methodscope reference context referencecontext type binding typebinding method type methodtype lambda lambda expected result type expectedresulttype method scope methodscope reference context referencecontext abstract method declaration abstractmethoddeclaration method binding methodbinding abstract method declaration abstractmethoddeclaration method scope methodscope reference context referencecontext binding method binding methodbinding return type returntype type binding typebinding type binding typebinding expression type expressiontype expression expression set expression context setexpressioncontext assignment context expression set expected type setexpectedtype method type methodtype lambda lambda arguments type elided argumentstypeelided expression cast expression castexpression expression bits ast node astnode disable unnecessary cast check disableunnecessarycastcheck method type methodtype type binding typebinding expression exceptions exist lambda expressions expression lambda lambda returns expression returnsexpression type binding typebinding expression type expressiontype expression resolve type resolvetype scope lambda lambda returns expression returnsexpression expression expression type expressiontype implicit return implicitreturn expression type expressiontype type binding typebinding expression statement expression statementexpression expression type expressiontype scope problem reporter problemreporter attempt to return non void expression attempttoreturnnonvoidexpression expression type expressiontype expression lambda lambda returns expression returnsexpression method type methodtype method type methodtype scope problem reporter problemreporter should return shouldreturn method type methodtype expression type expressiontype expression resolve type resolvetype scope lambda lambda returns expression returnsexpression expression expression type expressiontype expression type expressiontype expression type expressiontype type binding typebinding scope problem reporter problemreporter attempt to return void value attempttoreturnvoidvalue method type methodtype call compute conversion computeconversion type mismatch error typemismatcherror type binding typebinding not equals notequals method type methodtype expression type expressiontype scope compilation unit scope compilationunitscope record type conversion recordtypeconversion method type methodtype expression type expressiontype expression is constant value of type assignable to type isconstantvalueoftypeassignabletotype expression type expressiontype method type methodtype expression type expressiontype is compatible with iscompatiblewith method type methodtype scope expression compute conversion computeconversion scope method type methodtype expression type expressiontype expression type expressiontype needs unchecked conversion needsuncheckedconversion method type methodtype scope problem reporter problemreporter unsafe type conversion unsafetypeconversion expression expression type expressiontype method type methodtype expression cast expression castexpression expression bits ast node astnode unnecessary cast unnecessarycast ast node astnode disable unnecessary cast check disableunnecessarycastcheck cast expression castexpression check need for assigned cast checkneedforassignedcast scope method type methodtype cast expression castexpression expression lambda lambda arguments type elided argumentstypeelided expression bits ast node astnode unnecessary cast unnecessarycast type binding typebinding equals equals equalsequals cast expression castexpression expression expression resolved type resolvedtype method type methodtype scope problem reporter problemreporter unnecessary cast unnecessarycast cast expression castexpression expression is boxing compatible isboxingcompatible expression type expressiontype method type methodtype expression scope expression compute conversion computeconversion scope method type methodtype expression type expressiontype expression cast expression castexpression expression bits ast node astnode unnecessary cast unnecessarycast ast node astnode disable unnecessary cast check disableunnecessarycastcheck cast expression castexpression check need for assigned cast checkneedforassignedcast scope method type methodtype cast expression castexpression expression method type methodtype tag bits tagbits tag bits tagbits has missing type hasmissingtype complain type missing avoid secondary error scope problem reporter problemreporter type mismatch error typemismatcherror expression type expressiontype method type methodtype expression traverse ast visitor astvisitor visitor block scope blockscope scope visitor visit scope expression expression traverse visitor scope visitor end visit endvisit scope