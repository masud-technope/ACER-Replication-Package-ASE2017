copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation stephan herrmann stephan berlin contributions bug warning unboxing single name reference singlenamereference npe bug report variable assignment bug compiler minimal hook annotation support bug warning missing resources bug compiler annotations checking bug filter practically unimportant resource leak warnings bug compiler resource restore resource leak warnings bug compiler distinguish warnings based flow analysis annotations bug compiler resource incorrect potential resource leak bug compiler resource incorrect resource leak warning creating stream conditional bug bound doesn resolve bounds properly wildcards param etrisation parametrisation bug compiler syntactic analysis field references bug compiler diagnostic bug compiler detect semantically invalid type annotations bug compiler apply annotation types analysis bug compiler npe org eclipse jdt internal compiler ast conditional expression conditionalexpression generate code generatecode conditional expression conditionalexpression java bug str icter stricter checking type variables bug compiler loop improve analysis loops jesper moller contributions bug method declared wrong andy clement go pivotal gopivotal aclement gopivotal contributions bug compiler loose ends code generation bug compiler type annotations multiple problems org eclipse jdt internal compiler ast org eclipse jdt internal compiler ast expression context expressioncontext assignment context java util list org eclipse jdt internal compiler ast visitor astvisitor org eclipse jdt internal compiler impl org eclipse jdt internal compiler ast type reference typereference annotation collector annotationcollector org eclipse jdt internal compiler class fmt classfmt class file constants classfileconstants org eclipse jdt internal compiler codegen org eclipse jdt internal compiler flow org eclipse jdt internal compiler lookup org eclipse jdt internal compiler parser recovery scanner recoveryscanner suppress warnings suppresswarnings rawtypes local declaration localdeclaration abstract variable declaration abstractvariabledeclaration local variable binding localvariablebinding binding local declaration localdeclaration source start sourcestart source end sourceend source start sourcestart source start sourcestart source end sourceend source end sourceend declaration end declarationend source end sourceend flow info flowinfo analyse code analysecode block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo record variable initialization flow info flowinfo tag bits tagbits flow info flowinfo unreachable dead reached bits ast node astnode is local declaration reachable islocaldeclarationreachable initialization flow info flowinfo initialization checknpebyunboxing current scope currentscope flow context flowcontext flow info flowinfo flow info flowinfo pre init info preinitinfo should analyse resource shouldanalyseresource binding flow info flowinfo reach mode reachmode flow info flowinfo reachable current scope currentscope compiler options compileroptions analyse resource leaks analyseresourceleaks faked tracking variable fakedtrackingvariable is any closeable isanycloseable initialization resolved type resolvedtype should analyse resource shouldanalyseresource pre init info preinitinfo flow info flowinfo unconditional copy unconditionalcopy analysis resource leaks additional context analyzing rhs faked tracking variable fakedtrackingvariable pre connect tracker across assignment preconnecttrackeracrossassignment binding initialization flow info flowinfo flow info flowinfo initialization analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo unconditional inits unconditionalinits should analyse resource shouldanalyseresource faked tracking variable fakedtrackingvariable handle resource assignment handleresourceassignment current scope currentscope pre init info preinitinfo flow info flowinfo flow context flowcontext initialization binding faked tracking variable fakedtrackingvariable clean up after assignment cleanupafterassignment current scope currentscope binding local initialization null status nullstatus initialization null status nullstatus flow info flowinfo flow context flowcontext local variable debug attributes flow info flowinfo is definitely assigned isdefinitelyassigned binding bits first assignment to local firstassignmenttolocal bits first assignment to local firstassignmenttolocal flow info flowinfo mark as definitely assigned markasdefinitelyassigned binding current scope currentscope compiler options compileroptions is annotation based null analysis enabled isannotationbasednullanalysisenabled null status nullstatus null annotation matching nullannotationmatching check assignment checkassignment current scope currentscope flow context flowcontext binding flow info flowinfo null status nullstatus initialization initialization resolved type resolvedtype binding type tag bits tagbits tag bits tagbits is base type isbasetype flow info flowinfo mark null status marknullstatus binding null status nullstatus info rm inform enclosing block locals won block flow info flowinfo check modifiers checkmodifiers potential valid modifier modifiers extra compiler modifiers extracompilermodifiers acc just flag accjustflag class file constants classfileconstants acc final accfinal acc modifier problem accmodifierproblem visibility problem acc alternate modifier problem accalternatemodifierproblem duplicate modifier acc modifier problem accmodifierproblem acc alternate modifier problem accalternatemodifierproblem visibility problem modifiers modifiers extra compiler modifiers extracompilermodifiers acc alternate modifier problem accalternatemodifierproblem extra compiler modifiers extracompilermodifiers acc modifier problem accmodifierproblem code generation local declaration nbsp normal assignment local variable unused variable handling generate code generatecode block scope blockscope current scope currentscope code stream codestream code stream codestream reachable variable visible all ocated allocated binding resolved position resolvedposition code stream codestream add visible local variable addvisiblelocalvariable binding bits is reachable isreachable code stream codestream position initialize generate init generateinit initialization generate init generateinit for get forget initial izing initializing unused locals constant inlined binding resolved position resolvedposition initialization constant constant notaconstant generate init generateinit binding unused generate discard initialization generate code generatecode current scope currentscope code stream codestream generate init generateinit initialization generate code generatecode current scope currentscope code stream codestream extra store array local binding type is array type isarraytype array loc arrayloc type initialization cast expression castexpression cast expression castexpression initialization inner most casted expression innermostcastedexpression resolved type resolvedtype type binding typebinding code stream codestream check cast checkcast binding type code stream codestream store binding bits ast node astnode first assignment to local firstassignmenttolocal variable initialized code initial izing initializing binding record initialization start c recordinitializationstartpc code stream codestream position code stream codestream record positions from recordpositionsfrom source start sourcestart org eclipse jdt internal compiler ast abstract variable declaration abstractvariabledeclaration get kind getkind get kind getkind local variable local variables get all annotation contexts getallannotationcontexts target type targettype local variable binding localvariablebinding local variable localvariable list all annotation contexts allannotationcontexts annotation collector annotationcollector collector annotation collector annotationcollector target type targettype local variable localvariable all annotation contexts allannotationcontexts traverse without initializer traversewithoutinitializer collector block scope blockscope arguments get all annotation contexts getallannotationcontexts target type targettype parameter index parameterindex list all annotation contexts allannotationcontexts annotation collector annotationcollector collector annotation collector annotationcollector target type targettype parameter index parameterindex all annotation contexts allannotationcontexts traverse collector block scope blockscope is argument isargument is receiver isreceiver resolve block scope blockscope scope create binding add scope type binding typebinding variable type variabletype type resolve type resolvetype scope check bounds bits type bits ast node astnode has type annotations hastypeannotations check modifiers checkmodifiers variable type variabletype variable type variabletype type binding typebinding scope problem reporter problemreporter variable type cannot be void variabletypecannotbevoid variable type variabletype is array type isarraytype array binding arraybinding variable type variabletype leaf component type leafcomponenttype type binding typebinding scope problem reporter problemreporter variable type cannot be void array variabletypecannotbevoidarray binding existing variable existingvariable scope get binding getbinding binding variable resolve hidden field existing variable existingvariable existing variable existingvariable is valid binding isvalidbinding local exists localexists existing variable existingvariable local variable binding localvariablebinding local exists localexists bits ast node astnode shadows outer local shadowsouterlocal scope is lambda sub scope islambdasubscope hidden variable depth hiddenvariabledepth scope problem reporter problemreporter lambda red eclares local lambdaredeclareslocal local exists localexists hidden variable depth hiddenvariabledepth scope problem reporter problemreporter redefine local redefinelocal scope problem reporter problemreporter local variable hiding localvariablehiding existing variable existingvariable modifiers class file constants classfileconstants acc final accfinal initialization modifiers extra compiler modifiers extracompilermodifiers acc blank final accblankfinal binding local variable binding localvariablebinding variable type variabletype modifiers is argument isargument scope add local variable addlocalvariable binding binding set constant setconstant constant notaconstant variable type variabletype initialization report errors initialization resolve type resolvetype scope store constant locals initialization initialization array initializer arrayinitializer type binding typebinding initialization type initializationtype initialization resolve type expecting resolvetypeexpecting scope variable type variabletype initialization type initializationtype array initializer arrayinitializer initialization binding array binding arraybinding initialization type initializationtype initialization compute conversion computeconversion scope variable type variabletype initialization type initializationtype initialization set expression context setexpressioncontext assignment context initialization set expected type setexpectedtype variable type variabletype type binding typebinding initialization type initializationtype initialization resolve type resolvetype scope initialization type initializationtype call compute conversion computeconversion type mismatch error typemismatcherror type binding typebinding not equals notequals variable type variabletype initialization type initializationtype scope compilation unit scope compilationunitscope record type conversion recordtypeconversion variable type variabletype initialization type initializationtype initialization is constant value of type assignable to type isconstantvalueoftypeassignabletotype initialization type initializationtype variable type variabletype initialization type initializationtype is compatible with iscompatiblewith variable type variabletype scope initialization compute conversion computeconversion scope variable type variabletype initialization type initializationtype initialization type initializationtype needs unchecked conversion needsuncheckedconversion variable type variabletype scope problem reporter problemreporter unsafe type conversion unsafetypeconversion initialization initialization type initializationtype variable type variabletype initialization cast expression castexpression initialization bits ast node astnode unnecessary cast unnecessarycast cast expression castexpression check need for assigned cast checkneedforassignedcast scope variable type variabletype cast expression castexpression initialization is boxing compatible isboxingcompatible initialization type initializationtype variable type variabletype initialization scope initialization compute conversion computeconversion scope variable type variabletype initialization type initializationtype initialization cast expression castexpression initialization bits ast node astnode unnecessary cast unnecessarycast cast expression castexpression check need for assigned cast checkneedforassignedcast scope variable type variabletype cast expression castexpression initialization variable type variabletype tag bits tagbits tag bits tagbits has missing type hasmissingtype problem sig naled signaled type report secondary problem scope problem reporter problemreporter type mismatch error typemismatcherror initialization type initializationtype variable type variabletype initialization check assignment binding expression get direct binding getdirectbinding initialization scope problem reporter problemreporter assignment has no effect assignmenthasnoeffect change constant binding optimization constant prop agation propagation constant actual type variable type binding set constant setconstant binding is final isfinal initialization constant cast to castto variable type variabletype initialization constant typeid constant notaconstant resolve annotation constant pos itioned positioned resolve annotations resolveannotations scope annotations binding annotation is type use compatible istypeusecompatible type scope annotations scope validate null annotation validatenullannotation binding tag bits tagbits type annotations binding tag bits tagbits tag bits tagbits annotationnullmask traverse ast visitor astvisitor visitor block scope blockscope scope visitor visit scope annotations annotations length annotationslength annotations length annotations length annotationslength annotations traverse visitor scope type traverse visitor scope initialization initialization traverse visitor scope visitor end visit endvisit scope traverse without initializer traversewithoutinitializer ast visitor astvisitor visitor block scope blockscope scope visitor visit scope annotations annotations length annotationslength annotations length annotations length annotationslength annotations traverse visitor scope type traverse visitor scope visitor end visit endvisit scope recovered lonely identifier identifier cluster is recovered from lone identifier isrecoveredfromloneidentifier recovery scanner recoveryscanner fake identifier type single type reference singletypereference type qualified type reference qualifiedtypereference type array qualified type reference arrayqualifiedtypereference initialization type is base type reference isbasetypereference