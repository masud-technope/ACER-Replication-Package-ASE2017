copyright ibm corporation rights reserved program accompanying materials terms common license accompanies distribution http eclipse org legal cpl html contributors ibm corporation initial api implementation org eclipse jdt internal compiler ast org eclipse jdt internal compiler class fmt classfmt class file constants classfileconstants org eclipse jdt internal compiler codegen org eclipse jdt internal compiler flow org eclipse jdt internal compiler impl constant org eclipse jdt internal compiler lookup org eclipse jdt internal compiler ast visitor astvisitor assert statement assertstatement statement expression assert expression assertexpression exception argument exceptionargument local variable attribute pre assert init state index preassertinitstateindex field binding fieldbinding assert ion synthetic field binding assertionsyntheticfieldbinding assert statement assertstatement expression exception argument exceptionargument expression assert expression assertexpression start position startposition assert expression assertexpression assert expression assertexpression exception argument exceptionargument exception argument exceptionargument source start sourcestart start position startposition source end sourceend exception argument exceptionargument source end sourceend assert statement assertstatement expression assert expression assertexpression start position startposition assert expression assertexpression assert expression assertexpression source start sourcestart start position startposition source end sourceend assert expression assertexpression source end sourceend flow info flowinfo analyse code analysecode block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo pre assert init state index preassertinitstateindex current scope currentscope method scope methodscope record initialization states recordinitializationstates flow info flowinfo constant cst assert expression assertexpression optimized boolean constant optimizedbooleanconstant is optimized true assertion isoptimizedtrueassertion cst notaconstant cst boolean value booleanvalue is optimized false assertion isoptimizedfalseassertion cst notaconstant cst boolean value booleanvalue flow info flowinfo assert info assertinfo flow info flowinfo copy is optimized true assertion isoptimizedtrueassertion assert info assertinfo set reach mode setreachmode flow info flowinfo unreachable assert info assertinfo assert expression assertexpression analyse code analysecode current scope currentscope flow context flowcontext assert info assertinfo unconditional inits unconditionalinits exception argument exceptionargument eval uated evaluated escaping account flow info flowinfo exception info exceptioninfo exception argument exceptionargument analyse code analysecode current scope currentscope flow context flowcontext assert info assertinfo copy is optimized true assertion isoptimizedtrueassertion flow context flowcontext check exception handlers checkexceptionhandlers current scope currentscope get java lang assertion error getjavalangassertionerror exception info exceptioninfo current scope currentscope is optimized true assertion isoptimizedtrueassertion add support clinit manage synthetic access if necessary managesyntheticaccessifnecessary current scope currentscope flow info flowinfo is optimized false assertion isoptimizedfalseassertion assert ions assertions enabled code unreachable flow info flowinfo flow info flowinfo merged with mergedwith assert info assertinfo unconditional inits unconditionalinits generate code generatecode block scope blockscope current scope currentscope code stream codestream code stream codestream bits isreachablemask code stream codestream position assert ion synthetic field binding assertionsyntheticfieldbinding label assert ion activation label assertionactivationlabel label code stream codestream code stream codestream get static getstatic assert ion synthetic field binding assertionsyntheticfieldbinding code stream codestream ifne assert ion activation label assertionactivationlabel label false label falselabel label code stream codestream assert expression assertexpression generate optimized boolean generateoptimizedboolean current scope currentscope code stream codestream false label falselabel label code stream codestream code stream codestream new java lang assertion error newjavalangassertionerror code stream codestream dup exception argument exceptionargument exception argument exceptionargument generate code generatecode current scope currentscope code stream codestream code stream codestream invoke java lang assertion error constructor invokejavalangassertionerrorconstructor exception argument exceptionargument implicit conversion implicitconversion code stream codestream invoke java lang assertion error default constructor invokejavalangassertionerrordefaultconstructor code stream codestream athrow false label falselabel place assert ion activation label assertionactivationlabel place loose local variable initial izations initializations local variable attributes pre assert init state index preassertinitstateindex code stream codestream remove not definitely assigned variables removenotdefinitelyassignedvariables current scope currentscope pre assert init state index preassertinitstateindex code stream codestream record positions from recordpositionsfrom source start sourcestart resolve block scope blockscope scope assert expression assertexpression resolve type expecting resolvetypeexpecting scope boolean binding booleanbinding exception argument exceptionargument type binding typebinding exception argument type exceptionargumenttype exception argument exceptionargument resolve type resolvetype scope exception argument type exceptionargumenttype exception argument type exceptionargumenttype scope problem reporter problemreporter illegal void expression illegalvoidexpression exception argument exceptionargument object string exception argument exceptionargument implicit conversion implicitconversion traverse ast visitor astvisitor visitor block scope blockscope scope visitor visit scope assert expression assertexpression traverse visitor scope exception argument exceptionargument exception argument exceptionargument traverse visitor scope visitor end visit endvisit scope manage synthetic access if necessary managesyntheticaccessifnecessary block scope blockscope current scope currentscope flow info flowinfo flow info flowinfo flow info flowinfo is reachable isreachable assert ion assertion flag assert ions disabled assertionsdisabled source clas member outer most outermost member bug source type binding sourcetypebinding outer most class outermostclass current scope currentscope enclosing source type enclosingsourcetype outer most class outermostclass is local type islocaltype reference binding referencebinding enclosing outer most class outermostclass enclosing type enclosingtype enclosing enclosing is interface isinterface outer most class outermostclass source type binding sourcetypebinding enclosing assert ion synthetic field binding assertionsyntheticfieldbinding outer most class outermostclass add synthetic field addsyntheticfield current scope currentscope find clinit enable assert ion assertion support type declaration typedeclaration type declaration typedeclaration outer most class outermostclass scope reference type referencetype abstract method declaration abstractmethoddeclaration methods type declaration typedeclaration methods max methods length max abstract method declaration abstractmethoddeclaration method methods method is clinit isclinit clinit method set assertion support setassertionsupport assert ion synthetic field binding assertionsyntheticfieldbinding current scope currentscope environment options source level sourcelevel class file constants classfileconstants jdk string buffer stringbuffer print statement printstatement tab string buffer stringbuffer output print indent printindent tab output nls output append assert expression assertexpression print expression printexpression output exception argument exceptionargument nls output append exception argument exceptionargument print expression printexpression output output append