copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation stephan herrmann stephan berlin contributions bug increment decrement operators mark local variables read bug compiler annotations fields bug compiler syntactic analysis field references bug compiler internal compiler error java lang illegal argument exception illegalargumentexception info bug compiler inference infrastructure evolve meet jls jsr spec bug npe code stream codestream invoke jesper moller contributions bug method declared wrong robert roth robert roth gmail contributions bug npe field reference fieldreference optimized boolean constant optimizedbooleanconstant org eclipse jdt internal compiler ast org eclipse jdt core compiler char operation charoperation org eclipse jdt internal compiler ast visitor astvisitor org eclipse jdt internal compiler class fmt classfmt class file constants classfileconstants org eclipse jdt internal compiler codegen code stream codestream org eclipse jdt internal compiler codegen opcodes org eclipse jdt internal compiler flow flow context flowcontext org eclipse jdt internal compiler flow flow info flowinfo org eclipse jdt internal compiler impl constant org eclipse jdt internal compiler lookup binding org eclipse jdt internal compiler lookup block scope blockscope org eclipse jdt internal compiler lookup field binding fieldbinding org eclipse jdt internal compiler lookup inference context inferencecontext org eclipse jdt internal compiler lookup invocation site invocationsite org eclipse jdt internal compiler lookup local variable binding localvariablebinding org eclipse jdt internal compiler lookup method binding methodbinding org eclipse jdt internal compiler lookup method scope methodscope org eclipse jdt internal compiler lookup missing type binding missingtypebinding org eclipse jdt internal compiler lookup problem field binding problemfieldbinding org eclipse jdt internal compiler lookup problem reasons problemreasons org eclipse jdt internal compiler lookup problem reference binding problemreferencebinding org eclipse jdt internal compiler lookup reference binding referencebinding org eclipse jdt internal compiler lookup scope org eclipse jdt internal compiler lookup source type binding sourcetypebinding org eclipse jdt internal compiler lookup tag bits tagbits org eclipse jdt internal compiler lookup type binding typebinding org eclipse jdt internal compiler lookup type ids typeids org eclipse jdt internal compiler lookup variable binding variablebinding field reference fieldreference reference invocation site invocationsite read write expression receiver token exact binding lookup field binding fieldbinding binding read accessor write accessor method binding methodbinding synthetic accessors syntheticaccessors start name source position namesourceposition type binding typebinding actual receiver type actualreceivertype type binding typebinding generic cast genericcast field reference fieldreference source pos token source name source position namesourceposition pos position field access source start sourcestart pos source end sourceend pos ffffffffl bits binding field flow info flowinfo analyse assignment analyseassignment block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo assignment assignment is compound iscompound compound assignment extra work check variable initialized blank is compound iscompound binding is blank final isblankfinal receiver is this isthis current scope currentscope need blank final field initialization check needblankfinalfieldinitializationcheck binding flow info flowinfo field inits fieldinits flow context flowcontext get inits for final blank initialization check getinitsforfinalblankinitializationcheck binding declaring class declaringclass original flow info flowinfo field inits fieldinits is definitely assigned isdefinitelyassigned binding current scope currentscope problem reporter problemreporter uninitialized blank final field uninitializedblankfinalfield binding improve error msg telling compound assignment blank field manage synthetic access if necessary managesyntheticaccessifnecessary current scope currentscope flow info flowinfo read access flow info flowinfo receiver analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo binding is static isstatic unconditional inits unconditionalinits assignment expression flow info flowinfo assignment expression analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo unconditional inits unconditionalinits manage synthetic access if necessary managesyntheticaccessifnecessary current scope currentscope flow info flowinfo check assigning field binding is final isfinal context assigned binding is blank final isblankfinal is compound iscompound receiver is this isthis receiver qualified this reference qualifiedthisreference for bidden forbidden receiver bits ast node astnode parenthesizedmask current scope currentscope allow blank final field assignment allowblankfinalfieldassignment binding flow info flowinfo is potentially assigned ispotentiallyassigned binding current scope currentscope problem reporter problemreporter duplicate initialization of blank final field duplicateinitializationofblankfinalfield binding flow context flowcontext record setting final recordsettingfinal binding flow info flowinfo flow info flowinfo mark as definitely assigned markasdefinitelyassigned binding assigning field initializer constructor wrong reference current scope currentscope problem reporter problemreporter cannot assign to final field cannotassigntofinalfield binding binding is non null isnonnull binding type is type variable istypevariable context assigned is compound iscompound receiver is this isthis receiver qualified this reference qualifiedthisreference inherited fields tracked type binding typebinding equals equals equalsequals receiver resolved type resolvedtype binding declaring class declaringclass for bidden forbidden receiver bits ast node astnode parenthesizedmask flow info flowinfo mark as definitely assigned markasdefinitelyassigned binding flow info flowinfo flow info flowinfo analyse code analysecode block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo flow info flowinfo analyse code analysecode block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo value required valuerequired non static nonstatic binding is static isstatic receiver analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo non static nonstatic non static nonstatic receiver checknpe current scope currentscope flow context flowcontext flow info flowinfo value required valuerequired current scope currentscope compiler options compileroptions compliance level compliancelevel class file constants classfileconstants jdk manage synthetic access if necessary managesyntheticaccessifnecessary current scope currentscope flow info flowinfo read access current scope currentscope compiler options compileroptions compliance level compliancelevel class file constants classfileconstants jdk field binding fieldbinding field binding fieldbinding binding receiver is this isthis field binding fieldbinding is blank final isblankfinal current scope currentscope need blank final field initialization check needblankfinalfieldinitializationcheck field binding fieldbinding flow info flowinfo field inits fieldinits flow context flowcontext get inits for final blank initialization check getinitsforfinalblankinitializationcheck field binding fieldbinding declaring class declaringclass original flow info flowinfo field inits fieldinits is definitely assigned isdefinitelyassigned field binding fieldbinding current scope currentscope problem reporter problemreporter uninitialized blank final field uninitializedblankfinalfield field binding fieldbinding flow info flowinfo checknpe block scope blockscope scope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo ttl for field check ttlforfieldcheck flow context flowcontext is null checked field access isnullcheckedfieldaccess check nullable field dereference checknullablefielddereference scope binding name source position namesourceposition flow context flowcontext ttl for field check ttlforfieldcheck org eclipse jdt internal compiler ast expression compute conversion computeconversion org eclipse jdt internal compiler lookup scope org eclipse jdt internal compiler lookup type binding typebinding org eclipse jdt internal compiler lookup type binding typebinding compute conversion computeconversion scope scope type binding typebinding runtime time type runtimetimetype type binding typebinding compile time type compiletimetype runtime time type runtimetimetype compile time type compiletimetype fact type expectation fully str ict strict binding binding is valid binding isvalidbinding field binding fieldbinding original binding originalbinding binding original type binding typebinding original type originaltype original binding originalbinding type extra needed field type type variable original type originaltype leaf component type leafcomponenttype is type variable istypevariable type binding typebinding target type targettype compile time type compiletimetype is base type isbasetype runtime time type runtimetimetype is base type isbasetype unboxing check cast checkcast conversion compile time type compiletimetype runtime time type runtimetimetype generic cast genericcast original binding originalbinding type generic cast genericcast target type targettype generic cast genericcast reference binding referencebinding reference binding referencebinding reference cast referencecast reference binding referencebinding generic cast genericcast reference cast referencecast can be seen by canbeseenby scope scope problem reporter problemreporter invalid type invalidtype problem reference binding problemreferencebinding char operation charoperation split on spliton reference cast referencecast short readable name shortreadablename reference cast referencecast problem reasons problemreasons not visible notvisible compute conversion computeconversion scope runtime time type runtimetimetype compile time type compiletimetype field binding fieldbinding field binding fieldbinding binding generate assignment generateassignment block scope blockscope current scope currentscope code stream codestream code stream codestream assignment assignment value required valuerequired code stream codestream position field binding fieldbinding codegen binding codegenbinding binding original receiver generate code generatecode current scope currentscope code stream codestream codegen binding codegenbinding is static isstatic code stream codestream record positions from recordpositionsfrom source start sourcestart assignment expression generate code generatecode current scope currentscope code stream codestream field store fieldstore current scope currentscope code stream codestream codegen binding codegenbinding synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors field reference fieldreference write actual receiver type actualreceivertype receiver is implicit this isimplicitthis value required valuerequired value required valuerequired code stream codestream generate implicit conversion generateimplicitconversion assignment implicit conversion implicitconversion dupped field reference code generation param current scope currentscope org eclipse jdt internal compiler lookup block scope blockscope param code stream codestream org eclipse jdt internal compiler codegen code stream codestream param value required valuerequired generate code generatecode block scope blockscope current scope currentscope code stream codestream code stream codestream value required valuerequired code stream codestream position constant constant notaconstant value required valuerequired code stream codestream generate constant generateconstant constant implicit conversion implicitconversion code stream codestream record positions from recordpositionsfrom source start sourcestart field binding fieldbinding codegen binding codegenbinding binding original is static isstatic codegen binding codegenbinding is static isstatic is this receiver isthisreceiver receiver this reference thisreference constant field constant fieldconstant codegen binding codegenbinding constant field constant fieldconstant constant notaconstant is this receiver isthisreceiver receiver generate code generatecode current scope currentscope code stream codestream is static isstatic is static isstatic code stream codestream invoke object get class invokeobjectgetclass code stream codestream pop value required valuerequired code stream codestream generate constant generateconstant field constant fieldconstant implicit conversion implicitconversion code stream codestream record positions from recordpositionsfrom source start sourcestart value required valuerequired is this receiver isthisreceiver current scope currentscope compiler options compileroptions compliance level compliancelevel class file constants classfileconstants jdk implicit conversion implicitconversion type ids typeids unboxing generic cast genericcast receiver generate code generatecode current scope currentscope code stream codestream is static isstatic bits need receiver generic cast needreceivergenericcast code stream codestream check cast checkcast actual receiver type actualreceivertype code stream codestream position array length codegen binding codegenbinding declaring class declaringclass code stream codestream array length arraylength value required valuerequired code stream codestream generate implicit conversion generateimplicitconversion implicit conversion implicitconversion occur value required valuerequired compliance code stream codestream pop synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors field reference fieldreference read type binding typebinding constant pool declaring class constantpooldeclaringclass code stream codestream get constant pool declaring class getconstantpooldeclaringclass current scope currentscope codegen binding codegenbinding actual receiver type actualreceivertype receiver is implicit this isimplicitthis is static isstatic code stream codestream field access fieldaccess opcodes opc get static getstatic codegen binding codegenbinding constant pool declaring class constantpooldeclaringclass code stream codestream field access fieldaccess opcodes opc get field getfield codegen binding codegenbinding constant pool declaring class constantpooldeclaringclass code stream codestream invoke opcodes opc invokestatic synthetic accessors syntheticaccessors field reference fieldreference read declaring class declaringclass required occur required generic cast genericcast code stream codestream check cast checkcast generic cast genericcast value required valuerequired code stream codestream generate implicit conversion generateimplicitconversion implicit conversion implicitconversion is unboxing isunboxing implicit conversion implicitconversion type ids typeids unboxing conversion generated unboxing is unboxing isunboxing code stream codestream generate implicit conversion generateimplicitconversion implicit conversion implicitconversion is unboxing isunboxing post conversion type postconversiontype current scope currentscope codegen binding codegenbinding type code stream codestream pop code stream codestream pop is this receiver isthisreceiver is static isstatic value required valuerequired side effects clinit invocation field belongs type binding typebinding not equals notequals binding original declaring class declaringclass actual receiver type actualreceivertype erasure method binding methodbinding accessor synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors field reference fieldreference read accessor type binding typebinding constant pool declaring class constantpooldeclaringclass code stream codestream get constant pool declaring class getconstantpooldeclaringclass current scope currentscope codegen binding codegenbinding actual receiver type actualreceivertype receiver is implicit this isimplicitthis code stream codestream field access fieldaccess opcodes opc get static getstatic codegen binding codegenbinding constant pool declaring class constantpooldeclaringclass code stream codestream invoke opcodes opc invokestatic declaring class declaringclass accessor codegen binding codegenbinding type code stream codestream pop code stream codestream pop receiver generate code generatecode current scope currentscope code stream codestream is static isstatic is static isstatic perform check code stream codestream invoke object get class invokeobjectgetclass code stream codestream pop code stream codestream record positions from recordpositionsfrom source end sourceend generate compound assignment generatecompoundassignment block scope blockscope current scope currentscope code stream codestream code stream codestream expression expression assignment implicit conversion assignmentimplicitconversion value required valuerequired is static isstatic check compound assignment usage field report only use lessly read private field reportonlyuselesslyreadprivatefield current scope currentscope binding value required valuerequired field binding fieldbinding codegen binding codegenbinding binding original receiver generate code generatecode current scope currentscope code stream codestream is static isstatic codegen binding codegenbinding is static isstatic is static isstatic synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors field reference fieldreference read type binding typebinding constant pool declaring class constantpooldeclaringclass code stream codestream get constant pool declaring class getconstantpooldeclaringclass current scope currentscope codegen binding codegenbinding actual receiver type actualreceivertype receiver is implicit this isimplicitthis code stream codestream field access fieldaccess opcodes opc get static getstatic codegen binding codegenbinding constant pool declaring class constantpooldeclaringclass code stream codestream invoke opcodes opc invokestatic synthetic accessors syntheticaccessors field reference fieldreference read declaring class declaringclass code stream codestream dup synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors field reference fieldreference read type binding typebinding constant pool declaring class constantpooldeclaringclass code stream codestream get constant pool declaring class getconstantpooldeclaringclass current scope currentscope codegen binding codegenbinding actual receiver type actualreceivertype receiver is implicit this isimplicitthis code stream codestream field access fieldaccess opcodes opc get field getfield codegen binding codegenbinding constant pool declaring class constantpooldeclaringclass code stream codestream invoke opcodes opc invokestatic synthetic accessors syntheticaccessors field reference fieldreference read declaring class declaringclass operation type d operationtypeid operation type d operationtypeid implicit conversion implicitconversion type ids typeids implicit conversion mask java lang string javalangstring java lang object javalangobject undefined code stream codestream generate string concatenation append generatestringconcatenationappend current scope currentscope expression generic cast genericcast code stream codestream check cast checkcast generic cast genericcast promote array reference suitable operation type code stream codestream generate implicit conversion generateimplicitconversion implicit conversion implicitconversion generate increment promoted operation prefix operation expression int literal intliteral code stream codestream generate constant generateconstant expression constant implicit conversion implicitconversion expression generate code generatecode current scope currentscope code stream codestream perform operation code stream codestream send operator sendoperator operation type d operationtypeid array reference type code stream codestream generate implicit conversion generateimplicitconversion assignment implicit conversion assignmentimplicitconversion field store fieldstore current scope currentscope code stream codestream codegen binding codegenbinding synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors field reference fieldreference write actual receiver type actualreceivertype receiver is implicit this isimplicitthis value required valuerequired dupped generate post increment generatepostincrement block scope blockscope current scope currentscope code stream codestream code stream codestream compound assignment compoundassignment post increment postincrement value required valuerequired is static isstatic check post increment postincrement usage field report only use lessly read private field reportonlyuselesslyreadprivatefield current scope currentscope binding value required valuerequired field binding fieldbinding codegen binding codegenbinding binding original receiver generate code generatecode current scope currentscope code stream codestream is static isstatic codegen binding codegenbinding is static isstatic is static isstatic synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors field reference fieldreference read type binding typebinding constant pool declaring class constantpooldeclaringclass code stream codestream get constant pool declaring class getconstantpooldeclaringclass current scope currentscope codegen binding codegenbinding actual receiver type actualreceivertype receiver is implicit this isimplicitthis code stream codestream field access fieldaccess opcodes opc get static getstatic codegen binding codegenbinding constant pool declaring class constantpooldeclaringclass code stream codestream invoke opcodes opc invokestatic synthetic accessors syntheticaccessors field reference fieldreference read declaring class declaringclass code stream codestream dup synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors field reference fieldreference read type binding typebinding constant pool declaring class constantpooldeclaringclass code stream codestream get constant pool declaring class getconstantpooldeclaringclass current scope currentscope codegen binding codegenbinding actual receiver type actualreceivertype receiver is implicit this isimplicitthis code stream codestream field access fieldaccess opcodes opc get field getfield codegen binding codegenbinding constant pool declaring class constantpooldeclaringclass code stream codestream invoke opcodes opc invokestatic synthetic accessors syntheticaccessors field reference fieldreference read declaring class declaringclass type binding typebinding operand type operandtype generic cast genericcast code stream codestream check cast checkcast generic cast genericcast operand type operandtype generic cast genericcast operand type operandtype codegen binding codegenbinding type value required valuerequired is static isstatic operand type operandtype type ids typeids type ids typeids code stream codestream dup code stream codestream dup stack owner field field owner field operand type operandtype type ids typeids type ids typeids code stream codestream dup code stream codestream dup code stream codestream generate implicit conversion generateimplicitconversion implicit conversion implicitconversion code stream codestream generate constant generateconstant post increment postincrement expression constant implicit conversion implicitconversion code stream codestream send operator sendoperator post increment postincrement implicit conversion implicitconversion type ids typeids compile type mask code stream codestream generate implicit conversion generateimplicitconversion post increment postincrement pre assign implicit conversion preassignimplicitconversion field store fieldstore current scope currentscope code stream codestream codegen binding codegenbinding synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors field reference fieldreference write actual receiver type actualreceivertype receiver is implicit this isimplicitthis org eclipse jdt internal compiler lookup invocation site invocationsite generic type arguments generictypearguments type binding typebinding generic type arguments generictypearguments inference context inferencecontext fresh inference context freshinferencecontext scope scope is equivalent isequivalent reference reference field references relative receiver is this isthis receiver qualified this reference qualifiedthisreference current simple other token othertoken matching reference reference single name reference singlenamereference other token othertoken single name reference singlenamereference reference token reference field reference fieldreference field reference fieldreference field reference fieldreference reference receiver is this isthis receiver qualified this reference qualifiedthisreference other token othertoken token other token othertoken char operation charoperation equals token other token othertoken search deeper this tokens thistokens get this field tokens getthisfieldtokens this tokens thistokens other tokens othertokens reference field reference fieldreference other tokens othertokens field reference fieldreference reference get this field tokens getthisfieldtokens reference qualified name reference qualifiednamereference qualified name reference qualifiednamereference reference binding local variable binding localvariablebinding initial variable mismatch local field other tokens othertokens qualified name reference qualifiednamereference reference tokens char operation charoperation equals this tokens thistokens other tokens othertokens get this field tokens getthisfieldtokens nesting count nestingcount result receiver is this isthis receiver qualified this reference qualifiedthisreference reference start building token array result nesting count nestingcount fill front tail tra veling traveling result token receiver field reference fieldreference result field reference fieldreference receiver get this field tokens getthisfieldtokens nesting count nestingcount result front tail outer most outermost result result length nesting count nestingcount token result is super access issuperaccess receiver is super issuper override is qualified super isqualifiedsuper receiver is qualified super isqualifiedsuper is type access istypeaccess receiver receiver is type reference istypereference field binding fieldbinding last field binding lastfieldbinding binding emulate access fields impl icitly implicitly accessed manage synthetic access if necessary managesyntheticaccessifnecessary block scope blockscope current scope currentscope flow info flowinfo flow info flowinfo is read access isreadaccess flow info flowinfo tag bits tagbits flow info flowinfo unreachable dead field parameterized type original field codegen time field binding fieldbinding codegen binding codegenbinding binding original binding is private isprivate type binding typebinding not equals notequals current scope currentscope enclosing source type enclosingsourcetype codegen binding codegenbinding declaring class declaringclass binding constant current scope currentscope constant notaconstant synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors method binding methodbinding synthetic accessors syntheticaccessors is read access isreadaccess field reference fieldreference read field reference fieldreference write source type binding sourcetypebinding codegen binding codegenbinding declaring class declaringclass add synthetic method addsyntheticmethod codegen binding codegenbinding is read access isreadaccess remote type current scope currentscope problem reporter problemreporter need to emulate field access needtoemulatefieldaccess codegen binding codegenbinding is read access isreadaccess qualified receiver qualified super reference qualifiedsuperreference qualified emulation source type binding sourcetypebinding destination type destinationtype source type binding sourcetypebinding qualified super reference qualifiedsuperreference receiver current compatible type currentcompatibletype synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors method binding methodbinding synthetic accessors syntheticaccessors is read access isreadaccess field reference fieldreference read field reference fieldreference write destination type destinationtype add synthetic method addsyntheticmethod codegen binding codegenbinding is read access isreadaccess is super access issuperaccess current scope currentscope problem reporter problemreporter need to emulate field access needtoemulatefieldaccess codegen binding codegenbinding is read access isreadaccess binding is protected isprotected source type binding sourcetypebinding enclosing source type enclosingsourcetype bits ast node astnode depthmask binding declaring class declaringclass get package getpackage enclosing source type enclosingsourcetype current scope currentscope enclosing source type enclosingsourcetype get package getpackage source type binding sourcetypebinding current compatible type currentcompatibletype source type binding sourcetypebinding enclosing source type enclosingsourcetype enclosing type at enclosingtypeat bits ast node astnode depthmask ast node astnode depthshift synthetic accessors syntheticaccessors synthetic accessors syntheticaccessors method binding methodbinding synthetic accessors syntheticaccessors is read access isreadaccess field reference fieldreference read field reference fieldreference write current compatible type currentcompatibletype add synthetic method addsyntheticmethod codegen binding codegenbinding is read access isreadaccess is super access issuperaccess current scope currentscope problem reporter problemreporter need to emulate field access needtoemulatefieldaccess codegen binding codegenbinding is read access isreadaccess constant optimized boolean constant optimizedbooleanconstant resolved type resolvedtype constant notaconstant resolved type resolvedtype java lang boolean javalangboolean constant constant notaconstant constant binding constant constant notaconstant org eclipse jdt internal compiler ast expression post conversion type postconversiontype scope type binding typebinding post conversion type postconversiontype scope scope type binding typebinding converted type convertedtype resolved type resolvedtype generic cast genericcast converted type convertedtype generic cast genericcast runtime type runtimetype implicit conversion implicitconversion type ids typeids implicit conversion mask runtime type runtimetype converted type convertedtype type binding typebinding converted type convertedtype type binding typebinding converted type convertedtype type binding typebinding converted type convertedtype type binding typebinding converted type convertedtype type binding typebinding converted type convertedtype type binding typebinding converted type convertedtype type binding typebinding converted type convertedtype type binding typebinding implicit conversion implicitconversion type ids typeids boxing converted type convertedtype scope environment compute boxing type computeboxingtype converted type convertedtype converted type convertedtype string buffer stringbuffer print expression printexpression indent string buffer stringbuffer output receiver print expression printexpression output append append token type binding typebinding resolve type resolvetype block scope blockscope scope answer signature type field constants prop age d propaged field initialized compile time constant ignore receiver affect constant pool reference receiver cast receivercast receiver cast expression castexpression check receiver bits ast node astnode disable unnecessary cast check disableunnecessarycastcheck receiver cast receivercast actual receiver type actualreceivertype receiver resolve type resolvetype scope actual receiver type actualreceivertype constant constant notaconstant receiver cast receivercast change declaring receiver type identity not ified notified type binding typebinding equals equals equalsequals cast expression castexpression receiver expression resolved type resolvedtype actual receiver type actualreceivertype scope problem reporter problemreporter unnecessary cast unnecessarycast cast expression castexpression receiver receiver type receivertype is array type isarraytype token length handled scope api field binding fieldbinding field binding fieldbinding binding scope get field getfield actual receiver type actualreceivertype token field binding fieldbinding is valid binding isvalidbinding constant constant notaconstant receiver resolved type resolvedtype problem reference binding problemreferencebinding problem sig naled signaled receiver report secondary problem https bugs eclipse org bugs bug cgi avoid secondary errors missing type anonymous classes reference binding referencebinding declaring class declaringclass field binding fieldbinding declaring class declaringclass avoid secondary avoidsecondary declaring class declaringclass declaring class declaringclass is anonymous type isanonymoustype declaring class declaringclass superclass missing type binding missingtypebinding avoid secondary avoidsecondary scope problem reporter problemreporter invalid field invalidfield actual receiver type actualreceivertype field binding fieldbinding problem field binding problemfieldbinding problem field binding problemfieldbinding problem field binding problemfieldbinding problem field binding problemfieldbinding field binding fieldbinding field binding fieldbinding closest match closestmatch problem field binding problemfieldbinding closest match closestmatch problem field binding problemfieldbinding problem id problemid problem reasons problemreasons inherited name hides enclosing name inheritednamehidesenclosingname problem reasons problemreasons not visible notvisible problem reasons problemreasons non static reference in constructor invocation nonstaticreferenceinconstructorinvocation problem reasons problemreasons non static reference in static context nonstaticreferenceinstaticcontext closest match closestmatch field binding fieldbinding closest match closestmatch field binding fieldbinding is valid binding isvalidbinding handle indirect inheritance variable secondary bound receiver receive implicit conversion type binding typebinding old receiver type oldreceivertype actual receiver type actualreceivertype actual receiver type actualreceivertype actual receiver type actualreceivertype get erasure compatible type geterasurecompatibletype field binding fieldbinding declaring class declaringclass receiver compute conversion computeconversion scope actual receiver type actualreceivertype actual receiver type actualreceivertype record explicit codegen receiver handle type binding typebinding not equals notequals actual receiver type actualreceivertype old receiver type oldreceivertype type binding typebinding not equals notequals receiver post conversion type postconversiontype scope actual receiver type actualreceivertype bits need receiver generic cast needreceivergenericcast is field use deprecated isfieldusedeprecated field binding fieldbinding scope bits scope problem reporter problemreporter deprecated field deprecatedfield field binding fieldbinding is implicit this rcv isimplicitthisrcv receiver is implicit this isimplicitthis constant is implicit this rcv isimplicitthisrcv field binding fieldbinding constant scope constant notaconstant field binding fieldbinding is static isstatic field accessed receiver legal unoptimal optional warning is implicit this rcv isimplicitthisrcv receiver name reference namereference name reference namereference receiver bits binding type scope problem reporter problemreporter non static access to static field nonstaticaccesstostaticfield field binding fieldbinding reference binding referencebinding declaring class declaringclass binding declaring class declaringclass is implicit this rcv isimplicitthisrcv type binding typebinding not equals notequals declaring class declaringclass actual receiver type actualreceivertype declaring class declaringclass can be seen by canbeseenby scope scope problem reporter problemreporter indirect access to static field indirectaccesstostaticfield field binding fieldbinding check accessing enum field initializer declaring class declaringclass is enum isenum method scope methodscope method scope methodscope scope method scope methodscope source type binding sourcetypebinding source type sourcetype scope enclosing source type enclosingsourcetype constant constant notaconstant method scope methodscope is static isstatic enum constant body type binding typebinding equals equals equalsequals source type sourcetype declaring class declaringclass type binding typebinding equals equals equalsequals source type sourcetype superclass declaring class declaringclass method scope methodscope is inside initializer or constructor isinsideinitializerorconstructor scope problem reporter problemreporter enum static field used during initialization enumstaticfieldusedduringinitialization binding type binding typebinding field type fieldtype field binding fieldbinding type field type fieldtype bits ast node astnode is str ictly assigned isstrictlyassigned perform capture conversion read access field type fieldtype field type fieldtype capture scope source start sourcestart source end sourceend resolved type resolvedtype field type fieldtype field type fieldtype tag bits tagbits tag bits tagbits has missing type hasmissingtype scope problem reporter problemreporter invalid type invalidtype field type fieldtype field type fieldtype set actual receiver type setactualreceivertype reference binding referencebinding receiver type receivertype actual receiver type actualreceivertype receiver type receivertype set depth setdepth depth flush previous depth bits ast node astnode depthmask depth encoded bits bits depth xff ast node astnode depthshift set field index setfieldindex traverse ast visitor astvisitor visitor block scope blockscope scope visitor visit scope receiver traverse visitor scope visitor end visit endvisit scope variable binding variablebinding null annotated variable binding nullannotatedvariablebinding support type annotations supporttypeannotations binding support type annotations supporttypeannotations binding tag bits tagbits tag bits tagbits annotationnullmask binding