copyright ibm corporation rights reserved program accompanying materials terms common license accompanies distribution http eclipse org legal cpl html contributors ibm corporation initial api implementation org eclipse jdt internal compiler ast org eclipse jdt internal compiler ast visitor astvisitor org eclipse jdt internal compiler impl org eclipse jdt internal compiler codegen org eclipse jdt internal compiler flow org eclipse jdt internal compiler lookup unary expression unaryexpression operator expression operatorexpression expression expression constant optimized boolean constant optimizedbooleanconstant unary expression unaryexpression expression expression expression expression encode bits operatorshift flow info flowinfo analyse code analysecode block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo bits operatormask operatorshift expression analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo as negated condition asnegatedcondition expression analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo constant optimized boolean constant optimizedbooleanconstant optimized boolean constant optimizedbooleanconstant constant optimized boolean constant optimizedbooleanconstant code generation unary operation param current scope currentscope org eclipse jdt internal compiler lookup block scope blockscope param code stream codestream org eclipse jdt internal compiler codegen code stream codestream param value required valuerequired generate code generatecode block scope blockscope current scope currentscope code stream codestream code stream codestream value required valuerequired code stream codestream position label false label falselabel end if label endiflabel constant constant notaconstant inlined value required valuerequired code stream codestream generate constant generateconstant constant implicit conversion implicitconversion code stream codestream record positions from recordpositionsfrom source start sourcestart bits operatormask operatorshift expression implicit conversion implicitconversion runtime type generate code condition expression generate optimized boolean generateoptimizedboolean current scope currentscope code stream codestream false label falselabel label code stream codestream value required valuerequired value required valuerequired code stream codestream iconst false label falselabel has for ward references hasforwardreferences code stream codestream end if label endiflabel label code stream codestream code stream codestream decr stack size decrstacksize false label falselabel place code stream codestream iconst end if label endiflabel place place false label falselabel false label falselabel place twiddle expression implicit conversion implicitconversion runtime expression generate code generatecode current scope currentscope code stream codestream value required valuerequired value required valuerequired code stream codestream iconst code stream codestream ixor expression generate code generatecode current scope currentscope code stream codestream value required valuerequired value required valuerequired code stream codestream ldc code stream codestream lxor num constant notaconstant value required valuerequired expression implicit conversion implicitconversion code stream codestream generate inlined value generateinlinedvalue constant int value intvalue code stream codestream generate inlined value generateinlinedvalue constant float value floatvalue code stream codestream generate inlined value generateinlinedvalue constant long value longvalue code stream codestream generate inlined value generateinlinedvalue constant double value doublevalue expression generate code generatecode current scope currentscope code stream codestream value required valuerequired value required valuerequired expression implicit conversion implicitconversion runtime type code stream codestream ineg code stream codestream fneg code stream codestream lneg code stream codestream dneg expression generate code generatecode current scope currentscope code stream codestream value required valuerequired value required valuerequired code stream codestream generate implicit conversion generateimplicitconversion implicit conversion implicitconversion code stream codestream record positions from recordpositionsfrom source start sourcestart code generation optimized operations generate optimized boolean generateoptimizedboolean block scope blockscope current scope currentscope code stream codestream code stream codestream label true label truelabel label false label falselabel value required valuerequired constant constant notaconstant constant typeid generate optimized boolean generateoptimizedboolean current scope currentscope code stream codestream true label truelabel false label falselabel value required valuerequired bits operatormask operatorshift expression generate optimized boolean generateoptimizedboolean current scope currentscope code stream codestream false label falselabel true label truelabel value required valuerequired generate optimized boolean generateoptimizedboolean current scope currentscope code stream codestream true label truelabel false label falselabel value required valuerequired string buffer stringbuffer print expression no parent hesis printexpressionnoparenthesis indent string buffer stringbuffer output output append operator t o string operatortostring append expression print expression printexpression output type binding typebinding resolve type resolvetype block scope blockscope scope expression is cast expressioniscast check expression is cast expressioniscast expression cast expression castexpression expression bits ignore need for cast check k ignoreneedforcastcheckmask type binding typebinding expression type expressiontype expression resolve type resolvetype scope expression type expressiontype constant notaconstant expression type id expressiontypeid expression type expressiontype expression type id expressiontypeid constant notaconstant scope problem reporter problemreporter invalid operator invalidoperator expression type expressiontype table id tableid bits operatormask operatorshift table id tableid twiddle table id tableid left shift table id tableid cases code left rigth result operator signature operatorsignature operator signatures operatorsignatures table id tableid expression type id expressiontypeid expression type id expressiontypeid expression implicit conversion implicitconversion operator signature operatorsignature bits operator signature operatorsignature result type operator signature operatorsignature resolved type resolvedtype boolean binding booleanbinding resolved type resolvedtype byte binding bytebinding resolved type resolvedtype char binding charbinding resolved type resolvedtype double binding doublebinding resolved type resolvedtype float binding floatbinding resolved type resolvedtype int binding intbinding resolved type resolvedtype long binding longbinding error constant constant notaconstant expression type id expressiontypeid undefined scope problem reporter problemreporter invalid operator invalidoperator expression type expressiontype compute constant valid expression constant constant notaconstant constant constant compute constant operation computeconstantoperation expression constant expression type id expressiontypeid bits operatormask operatorshift constant constant notaconstant bits operatormask operatorshift constant cst expression optimized boolean constant optimizedbooleanconstant cst constant notaconstant optimized boolean constant optimizedbooleanconstant constant from value fromvalue cst boolean value booleanvalue expression is cast expressioniscast check operand cast expression castexpression check need for argument cast checkneedforargumentcast scope table id tableid operator signature operatorsignature expression expression type id expressiontypeid resolved type resolvedtype traverse ast visitor astvisitor visitor block scope blockscope block scope blockscope visitor visit block scope blockscope expression traverse visitor block scope blockscope visitor end visit endvisit block scope blockscope