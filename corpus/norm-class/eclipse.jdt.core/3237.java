copyright ibm corporation rights reserved program accompanying materials terms common license accompanies distribution http eclipse org legal cpl html contributors ibm corporation initial api implementation org eclipse jdt internal compiler ast org eclipse jdt internal compiler ast visitor astvisitor org eclipse jdt internal compiler impl org eclipse jdt internal compiler class fmt classfmt class file constants classfileconstants org eclipse jdt internal compiler codegen org eclipse jdt internal compiler flow org eclipse jdt internal compiler lookup field reference fieldreference reference invocation site invocationsite expression receiver token exact binding lookup field binding fieldbinding binding actual binding code generation synthetic accessor field binding fieldbinding codegen binding codegenbinding read accessor write accessor method binding methodbinding synthetic accessors syntheticaccessors read write start name source position namesourceposition type binding typebinding receiver type receivertype type binding typebinding generic cast genericcast field reference fieldreference source pos token source name source position namesourceposition pos position field access source start sourcestart pos source end sourceend pos ffffffffl bits binding ids bindingids field flow info flowinfo analyse assignment analyseassignment block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo assignment assignment is compound iscompound compound assignment extra work check variable initialized blank is compound iscompound binding is blank final isblankfinal receiver is this isthis current scope currentscope allow blank final field assignment allowblankfinalfieldassignment binding flow info flowinfo is definitely assigned isdefinitelyassigned binding current scope currentscope problem reporter problemreporter uninitialized blank final field uninitializedblankfinalfield binding improve error msg telling compound assignment blank field manage synthetic access if necessary managesyntheticaccessifnecessary current scope currentscope flow info flowinfo read access flow info flowinfo receiver analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo binding is static isstatic unconditional inits unconditionalinits assignment expression flow info flowinfo assignment expression analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo unconditional inits unconditionalinits manage synthetic access if necessary managesyntheticaccessifnecessary current scope currentscope flow info flowinfo write access check assigning field binding is final isfinal context assigned binding is blank final isblankfinal is compound iscompound receiver is this isthis receiver qualified this reference qualifiedthisreference for bidden forbidden receiver bits parenthesizedmask current scope currentscope allow blank final field assignment allowblankfinalfieldassignment binding flow info flowinfo is potentially assigned ispotentiallyassigned binding current scope currentscope problem reporter problemreporter duplicate initialization of blank final field duplicateinitializationofblankfinalfield binding flow context flowcontext record setting final recordsettingfinal binding flow info flowinfo flow info flowinfo mark as definitely assigned markasdefinitelyassigned binding assigning field initializer constructor wrong reference current scope currentscope problem reporter problemreporter cannot assign to final field cannotassigntofinalfield binding flow info flowinfo flow info flowinfo analyse code analysecode block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo flow info flowinfo analyse code analysecode block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo value required valuerequired receiver analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo binding is static isstatic value required valuerequired manage synthetic access if necessary managesyntheticaccessifnecessary current scope currentscope flow info flowinfo read access flow info flowinfo org eclipse jdt internal compiler ast expression compute conversion computeconversion org eclipse jdt internal compiler lookup scope org eclipse jdt internal compiler lookup type binding typebinding org eclipse jdt internal compiler lookup type binding typebinding compute conversion computeconversion scope scope type binding typebinding runtime time type runtimetimetype type binding typebinding compile time type compiletimetype runtime time type runtimetimetype compile time type compiletimetype fact type expectation fully str ict strict binding binding is valid binding isvalidbinding field binding fieldbinding original binding originalbinding binding original original binding originalbinding binding extra needed method type type variable original binding originalbinding type tag bits tagbits tag bits tagbits has type variable hastypevariable runtime time type runtimetimetype object generic cast genericcast original binding originalbinding type generic cast genericcast runtime time type runtimetimetype compute conversion computeconversion scope runtime time type runtimetimetype compile time type compiletimetype field binding fieldbinding field binding fieldbinding binding generate assignment generateassignment block scope blockscope current scope currentscope code stream codestream code stream codestream assignment assignment value required valuerequired receiver generate code generatecode current scope currentscope code stream codestream codegen binding codegenbinding is static isstatic assignment expression generate code generatecode current scope currentscope code stream codestream field store fieldstore code stream codestream codegen binding codegenbinding synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors write value required valuerequired value required valuerequired code stream codestream generate implicit conversion generateimplicitconversion assignment implicit conversion implicitconversion dupped field reference code generation param current scope currentscope org eclipse jdt internal compiler lookup block scope blockscope param code stream codestream org eclipse jdt internal compiler codegen code stream codestream param value required valuerequired generate code generatecode block scope blockscope current scope currentscope code stream codestream code stream codestream value required valuerequired code stream codestream position constant notaconstant value required valuerequired code stream codestream generate constant generateconstant constant implicit conversion implicitconversion is static isstatic codegen binding codegenbinding is static isstatic receiver generate code generatecode current scope currentscope code stream codestream is static isstatic value required valuerequired codegen binding codegenbinding is constant value isconstantvalue array length codegen binding codegenbinding declaring class declaringclass array length code stream codestream array length arraylength synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors read is static isstatic code stream codestream get static getstatic codegen binding codegenbinding code stream codestream get field getfield codegen binding codegenbinding code stream codestream invokestatic synthetic accessors syntheticaccessors read code stream codestream generate implicit conversion generateimplicitconversion implicit conversion implicitconversion generic cast genericcast code stream codestream check cast checkcast generic cast genericcast is static isstatic perform check code stream codestream invoke object get class invokeobjectgetclass code stream codestream pop code stream codestream generate constant generateconstant codegen binding codegenbinding constant implicit conversion implicitconversion is static isstatic perform check code stream codestream invoke object get class invokeobjectgetclass code stream codestream pop code stream codestream record positions from recordpositionsfrom source start sourcestart generate compound assignment generatecompoundassignment block scope blockscope current scope currentscope code stream codestream code stream codestream expression expression assignment implicit conversion assignmentimplicitconversion value required valuerequired is static isstatic receiver generate code generatecode current scope currentscope code stream codestream is static isstatic codegen binding codegenbinding is static isstatic is static isstatic synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors read code stream codestream get static getstatic codegen binding codegenbinding code stream codestream invokestatic synthetic accessors syntheticaccessors read code stream codestream dup synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors read code stream codestream get field getfield codegen binding codegenbinding code stream codestream invokestatic synthetic accessors syntheticaccessors read operation type d operationtypeid operation type d operationtypeid implicit conversion implicitconversion string previous get field getfield object string buffer methods code stream codestream generate string concatenation append generatestringconcatenationappend current scope currentscope expression promote array reference suitable operation type code stream codestream generate implicit conversion generateimplicitconversion implicit conversion implicitconversion generate increment promoted operation prefix operation expression int literal intliteral code stream codestream generate constant generateconstant expression constant implicit conversion implicitconversion expression generate code generatecode current scope currentscope code stream codestream perform operation code stream codestream send operator sendoperator operation type d operationtypeid array reference type code stream codestream generate implicit conversion generateimplicitconversion assignment implicit conversion assignmentimplicitconversion field store fieldstore code stream codestream codegen binding codegenbinding synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors write value required valuerequired dupped generate post increment generatepostincrement block scope blockscope current scope currentscope code stream codestream code stream codestream compound assignment compoundassignment post increment postincrement value required valuerequired is static isstatic receiver generate code generatecode current scope currentscope code stream codestream is static isstatic codegen binding codegenbinding is static isstatic is static isstatic synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors read code stream codestream get static getstatic codegen binding codegenbinding code stream codestream invokestatic synthetic accessors syntheticaccessors read code stream codestream dup synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors read code stream codestream get field getfield codegen binding codegenbinding code stream codestream invokestatic synthetic accessors syntheticaccessors read value required valuerequired is static isstatic codegen binding codegenbinding type long binding longbinding codegen binding codegenbinding type double binding doublebinding code stream codestream dup code stream codestream dup stack owner field field owner field codegen binding codegenbinding type long binding longbinding codegen binding codegenbinding type double binding doublebinding code stream codestream dup code stream codestream dup code stream codestream generate constant generateconstant post increment postincrement expression constant implicit conversion implicitconversion code stream codestream send operator sendoperator post increment postincrement codegen binding codegenbinding type code stream codestream generate implicit conversion generateimplicitconversion post increment postincrement assignment implicit conversion assignmentimplicitconversion field store fieldstore code stream codestream codegen binding codegenbinding synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors write org eclipse jdt internal compiler lookup invocation site invocationsite generic type arguments generictypearguments type binding typebinding generic type arguments generictypearguments constant get constant for getconstantfor field binding fieldbinding binding reference reference is implicit isimplicit scope reference scope referencescope special treatment lang age langage built field declaring binding declaring class declaringclass field length constant computation notaconstant binding is final isfinal binding set constant setconstant notaconstant notaconstant constant field constant fieldconstant binding constant field constant fieldconstant is implicit isimplicit reference qualified name reference qualifiednamereference binding qualified name reference qualifiednamereference reference binding field constant fieldconstant notaconstant field type checked field coming compiled compilation units process field binary type bin bin g binarytypebinbing field binding fieldbinding original field originalfield binding original source type binding sourcetypebinding source type sourcetype source type binding sourcetypebinding original field originalfield declaring class declaringclass type declaration typedeclaration type decl typedecl source type sourcetype scope reference context referencecontext field declaration fielddeclaration field decl fielddecl type decl typedecl declaration of declarationof original field originalfield field decl fielddecl resolve side binding original field originalfield is static isstatic type decl typedecl static initializer scope staticinitializerscope type decl typedecl initializer scope initializerscope is implicit isimplicit reference qualified name reference qualifiednamereference binding qualified name reference qualifiednamereference reference binding binding constant notaconstant is super access issuperaccess receiver is super issuper is type access istypeaccess receiver receiver is type reference istypereference emulate access fields impl icitly implicitly accessed manage synthetic access if necessary managesyntheticaccessifnecessary block scope blockscope current scope currentscope flow info flowinfo flow info flowinfo is read access isreadaccess flow info flowinfo is reachable isreachable field parameterized type original field codegen time codegen binding codegenbinding binding original binding is private isprivate current scope currentscope enclosing source type enclosingsourcetype codegen binding codegenbinding declaring class declaringclass binding is constant value isconstantvalue synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors method binding methodbinding synthetic accessors syntheticaccessors is read access isreadaccess read write source type binding sourcetypebinding codegen binding codegenbinding declaring class declaringclass add synthetic method addsyntheticmethod codegen binding codegenbinding is read access isreadaccess current scope currentscope problem reporter problemreporter need to emulate field access needtoemulatefieldaccess codegen binding codegenbinding is read access isreadaccess qualified receiver qualified super reference qualifiedsuperreference qualified emulation source type binding sourcetypebinding destination type destinationtype source type binding sourcetypebinding qualified super reference qualifiedsuperreference receiver current compatible type currentcompatibletype synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors method binding methodbinding synthetic accessors syntheticaccessors is read access isreadaccess read write destination type destinationtype add synthetic method addsyntheticmethod codegen binding codegenbinding is read access isreadaccess current scope currentscope problem reporter problemreporter need to emulate field access needtoemulatefieldaccess codegen binding codegenbinding is read access isreadaccess binding is protected isprotected source type binding sourcetypebinding enclosing source type enclosingsourcetype bits depthmask binding declaring class declaringclass get package getpackage enclosing source type enclosingsourcetype current scope currentscope enclosing source type enclosingsourcetype get package getpackage source type binding sourcetypebinding current compatible type currentcompatibletype source type binding sourcetypebinding enclosing source type enclosingsourcetype enclosing type at enclosingtypeat bits depthmask depthshift synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors method binding methodbinding synthetic accessors syntheticaccessors is read access isreadaccess read write current compatible type currentcompatibletype add synthetic method addsyntheticmethod codegen binding codegenbinding is read access isreadaccess current scope currentscope problem reporter problemreporter need to emulate field access needtoemulatefieldaccess codegen binding codegenbinding is read access isreadaccess note target field declaring touched receiver type binding declaring class declaringclass receiver type receivertype receiver type receivertype is array type isarraytype array length binding declaring class declaringclass binding is constant value isconstantvalue current scope currentscope environment options targetjdk class file constants classfileconstants jdk binding declaring class declaringclass object change object fields codegen binding codegenbinding declaring class declaringclass can be seen by canbeseenby current scope currentscope codegen binding codegenbinding current scope currentscope enclosing source type enclosingsourcetype get updated field binding getupdatedfieldbinding codegen binding codegenbinding reference binding referencebinding receiver type receivertype erasure string buffer stringbuffer print expression printexpression indent string buffer stringbuffer output receiver print expression printexpression output append append token type binding typebinding resolve type resolvetype block scope blockscope scope answer signature type field constants prop age d propaged field initialized compile time constant ignore receiver affect constant pool reference receiver cast receivercast receiver cast expression castexpression check receiver bits ignore need for cast check k ignoreneedforcastcheckmask receiver cast receivercast receiver type receivertype receiver resolve type resolvetype scope receiver type receivertype constant notaconstant receiver cast receivercast change declaring receiver type identity not ified notified cast expression castexpression receiver expression resolved type resolvedtype receiver type receivertype scope problem reporter problemreporter unnecessary cast unnecessarycast cast expression castexpression receiver receiver type receivertype is array type isarraytype token length handled scope api codegen binding codegenbinding binding scope get field getfield receiver type receivertype token binding is valid binding isvalidbinding constant notaconstant scope problem reporter problemreporter invalid field invalidfield receiver type receivertype receiver compute conversion computeconversion scope receiver type receivertype receiver type receivertype is field use deprecated isfieldusedeprecated binding scope bits is str ictly assigned k isstrictlyassignedmask scope problem reporter problemreporter deprecated field deprecatedfield binding is implicit this rcv isimplicitthisrcv receiver is implicit this isimplicitthis constant field reference fieldreference get constant for getconstantfor binding is implicit this rcv isimplicitthisrcv scope is implicit this rcv isimplicitthisrcv constant notaconstant binding is static isstatic field accessed receiver legal unoptimal optional warning is implicit this rcv isimplicitthisrcv receiver name reference namereference name reference namereference receiver bits binding ids bindingids type scope problem reporter problemreporter non static access to static field nonstaticaccesstostaticfield binding is implicit this rcv isimplicitthisrcv binding declaring class declaringclass receiver type receivertype scope problem reporter problemreporter indirect access to static field indirectaccesstostaticfield binding resolved type resolvedtype binding type set actual receiver type setactualreceivertype reference binding referencebinding receiver type receivertype set depth setdepth depth flush previous depth bits depthmask depth encoded bits bits depth xff depthshift set field index setfieldindex traverse ast visitor astvisitor visitor block scope blockscope scope visitor visit scope receiver traverse visitor scope visitor end visit endvisit scope