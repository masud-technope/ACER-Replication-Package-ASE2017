copyright ibm corporation rights reserved program accompanying materials terms common license accompanies distribution http eclipse org legal cpl html contributors ibm corporation initial api implementation org eclipse jdt internal compiler ast java util array list arraylist org eclipse jdt core compiler char operation charoperation org eclipse jdt internal compiler ast visitor astvisitor org eclipse jdt internal compiler impl org eclipse jdt internal compiler codegen org eclipse jdt internal compiler flow org eclipse jdt internal compiler lookup org eclipse jdt internal compiler problem org eclipse jdt internal compiler util util expression statement is constant value rep res entable isconstantvaluerepresentable constant constant constant type d constanttypeid target type d targettypeid constant type d constanttypeid constant typeid target type d targettypeid constant type d constanttypeid target type d targettypeid constant type d constanttypeid constant double value doublevalue constant char value charvalue constant float value floatvalue constant char value charvalue constant int value intvalue constant char value charvalue constant short value shortvalue constant char value charvalue constant byte value bytevalue constant char value charvalue constant long value longvalue constant char value charvalue constant type d constanttypeid constant char value charvalue constant float value floatvalue constant double value doublevalue constant float value floatvalue constant int value intvalue constant float value floatvalue constant short value shortvalue constant float value floatvalue constant byte value bytevalue constant float value floatvalue constant long value longvalue constant float value floatvalue constant type d constanttypeid constant char value charvalue constant double value doublevalue constant float value floatvalue constant double value doublevalue constant int value intvalue constant double value doublevalue constant short value shortvalue constant double value doublevalue constant byte value bytevalue constant double value doublevalue constant long value longvalue constant double value doublevalue constant type d constanttypeid constant char value charvalue constant byte value bytevalue constant double value doublevalue constant byte value bytevalue constant float value floatvalue constant byte value bytevalue constant int value intvalue constant byte value bytevalue constant short value shortvalue constant byte value bytevalue constant long value longvalue constant byte value bytevalue constant type d constanttypeid constant char value charvalue constant short value shortvalue constant double value doublevalue constant short value shortvalue constant float value floatvalue constant short value shortvalue constant int value intvalue constant short value shortvalue constant byte value bytevalue constant short value shortvalue constant long value longvalue constant short value shortvalue constant type d constanttypeid constant char value charvalue constant int value intvalue constant double value doublevalue constant int value intvalue constant float value floatvalue constant int value intvalue constant short value shortvalue constant int value intvalue constant byte value bytevalue constant int value intvalue constant long value longvalue constant int value intvalue constant type d constanttypeid constant char value charvalue constant long value longvalue constant double value doublevalue constant long value longvalue constant float value floatvalue constant long value longvalue constant int value intvalue constant long value longvalue constant short value shortvalue constant long value longvalue constant byte value bytevalue constant long value longvalue constant constant expression java semantic point view statements order avoid creation wrappers expression order tune expression expression subclass statement message is valid java statement isvalidjavastatement implicit conversion implicitconversion type binding typebinding resolved type resolvedtype expression flow info flowinfo analyse code analysecode block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo flow info flowinfo flow info flowinfo analyse code analysecode block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo value required valuerequired analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo returns legal check cast types compatibility checkcasttypescompatibility block scope blockscope scope type binding typebinding cast type casttype type binding typebinding expression type expressiontype expression expression cast type casttype expression type expressiontype cast type casttype is base type isbasetype expression type expressiontype is base type isbasetype expression type expressiontype cast type casttype expression constant constant expression constant tag as unnecessary cast tagasunnecessarycast scope cast type casttype expression type expressiontype is compatible with iscompatiblewith cast type casttype base type binding basetypebinding is narrowing isnarrowing cast type casttype expression type expressiontype expression expression implicit conversion implicitconversion cast type casttype expression type expressiontype expression constant constant notaconstant constant expression constant cast to castto expression implicit conversion implicitconversion tag as unnecessary cast tagasunnecessarycast scope cast type casttype report illegal cast reportillegalcast scope cast type casttype expression type expressiontype base type expression type expressiontype null binding nullbinding tag as unnecessary cast tagasunnecessarycast scope cast type casttype compatible expression type expressiontype is base type isbasetype report illegal cast reportillegalcast scope cast type casttype expression type expressiontype expression type expressiontype is array type isarraytype cast type casttype expression type expressiontype tag as unnecessary cast tagasunnecessarycast scope cast type casttype identity conversion cast type casttype is array type isarraytype cast type casttype is array isarray expression type expressiontype is array isarray type binding typebinding expr element type exprelementtype array binding arraybinding expression type expressiontype elements type elementstype expr element type exprelementtype is base type isbasetype recursion array binding arraybinding cast type casttype elements type elementstype expr element type exprelementtype tag as need check cast tagasneedcheckcast report illegal cast reportillegalcast scope cast type casttype expression type expressiontype recursively elements check cast types compatibility checkcasttypescompatibility scope array binding arraybinding cast type casttype elements type elementstype expr element type exprelementtype expression cast type casttype is class isclass cast type casttype is class isclass expression type expressiontype is array isarray cast type casttype object tag as unnecessary cast tagasunnecessarycast scope cast type casttype cast type casttype is interface isinterface expression type expressiontype is array isarray cast type casttype java lang cloneable javalangcloneable cast type casttype java io serializable javaioserializable tag as need check cast tagasneedcheckcast report illegal cast reportillegalcast scope cast type casttype expression type expressiontype expression type expressiontype is class isclass cast type casttype is array type isarraytype cast type casttype is array isarray expression type expressiontype is class isclass potential runtime error expression type expressiontype object tag as need check cast tagasneedcheckcast cast type casttype is class isclass expression type expressiontype is class isclass cast type casttype is class isclass reference binding referencebinding match reference binding referencebinding expression type expressiontype find super type erasing to findsupertypeerasingto reference binding referencebinding cast type casttype erasure match string cst constant expression cast type casttype string constant expression constant check unsafe cast checkunsafecast scope cast type casttype expression type expressiontype match match reference binding referencebinding cast type casttype find super type erasing to findsupertypeerasingto reference binding referencebinding expression type expressiontype erasure match tag as need check cast tagasneedcheckcast check unsafe cast checkunsafecast scope cast type casttype expression type expressiontype match cast type casttype is interface isinterface expression type expressiontype is class isclass reference binding referencebinding match reference binding referencebinding expression type expressiontype find super type erasing to findsupertypeerasingto reference binding referencebinding cast type casttype erasure match check unsafe cast checkunsafecast scope cast type casttype expression type expressiontype match subclass implement check compile time reference binding referencebinding expression type expressiontype is final isfinal tag as need check cast tagasneedcheckcast match reference binding referencebinding cast type casttype find super type erasing to findsupertypeerasingto reference binding referencebinding expression type expressiontype erasure match check unsafe cast checkunsafecast scope cast type casttype expression type expressiontype match subclass expression type expressiontype compile time check valid report illegal cast reportillegalcast scope cast type casttype expression type expressiontype expression type expressiontype is interface isinterface cast type casttype is array type isarraytype cast type casttype is array isarray expression type expressiontype is interface isinterface expression type expressiontype java lang cloneable javalangcloneable potential runtime error expression type expressiontype java io serializable javaioserializable tag as need check cast tagasneedcheckcast report illegal cast reportillegalcast scope cast type casttype expression type expressiontype cast type casttype is class isclass expression type expressiontype is interface isinterface cast type casttype is class isclass runtime error cast type casttype object tag as unnecessary cast tagasunnecessarycast scope cast type casttype reference binding referencebinding cast type casttype is final isfinal subclass cast type casttype compile time check valid reference binding referencebinding match reference binding referencebinding cast type casttype find super type erasing to findsupertypeerasingto reference binding referencebinding expression type expressiontype erasure match potential runtime error report illegal cast reportillegalcast scope cast type casttype expression type expressiontype cast type casttype is interface isinterface expression type expressiontype is interface isinterface reference binding referencebinding match reference binding referencebinding expression type expressiontype find super type erasing to findsupertypeerasingto reference binding referencebinding cast type casttype erasure match check unsafe cast checkunsafecast scope cast type casttype expression type expressiontype match match reference binding referencebinding cast type casttype find super type erasing to findsupertypeerasingto reference binding referencebinding expression type expressiontype erasure match tag as need check cast tagasneedcheckcast check unsafe cast checkunsafecast scope cast type casttype expression type expressiontype match method binding methodbinding cast type methods casttypemethods get all inherited methods getallinheritedmethods reference binding referencebinding cast type casttype method binding methodbinding expression type methods expressiontypemethods get all inherited methods getallinheritedmethods reference binding referencebinding expression type expressiontype expr methods length exprmethodslength expression type methods expressiontypemethods length cast methods length castmethodslength cast type methods casttypemethods length cast methods length castmethodslength expr methods length exprmethodslength cast type methods casttypemethods return type returntype expression type methods expressiontypemethods return type returntype char operation charoperation equals cast type methods casttypemethods selector expression type methods expressiontypemethods selector cast type methods casttypemethods are parameters equal areparametersequal expression type methods expressiontypemethods report illegal cast reportillegalcast scope cast type casttype expression type expressiontype tag as need check cast tagasneedcheckcast method binding methodbinding get all inherited methods getallinheritedmethods reference binding referencebinding binding array list arraylist collector array list arraylist get all inherited methods getallinheritedmethods binding collector method binding methodbinding collector to array toarray method binding methodbinding collector size get all inherited methods getallinheritedmethods reference binding referencebinding binding array list arraylist collector binding is interface isinterface method binding methodbinding method bindings methodbindings binding methods max method bindings methodbindings length max collector add method bindings methodbindings reference binding referencebinding super interfaces superinterfaces binding super interfaces superinterfaces max super interfaces superinterfaces length max get all inherited methods getallinheritedmethods super interfaces superinterfaces collector check unsafe cast checkunsafecast scope scope type binding typebinding cast type casttype type binding typebinding expression type expressiontype type binding typebinding match is narrowing isnarrowing match cast type casttype is narrowing isnarrowing tag as unnecessary cast tagasunnecessarycast scope cast type casttype cast type casttype is bound parameterized type isboundparameterizedtype cast type casttype is generic type isgenerictype match is provably distinct from isprovablydistinctfrom is narrowing isnarrowing expression type expressiontype cast type casttype report illegal cast reportillegalcast scope cast type casttype expression type expressiontype is narrowing isnarrowing tag as unnecessary cast tagasunnecessarycast scope cast type casttype base types widening explicitly compiler byte code bytecode check unsafe type operations compute conversion computeconversion scope scope type binding typebinding runtime time type runtimetimetype type binding typebinding compile time type compiletimetype runtime time type runtimetimetype compile time type compiletimetype ind ependantly independantly implicit conversion implicitconversion runtime time type runtimetimetype implicit conversion implicitconversion compile time type compiletimetype string implicit conversion implicitconversion result result code gen implicit conversion implicitconversion runtime time type runtimetimetype compile time type compiletimetype regular object expression statements plain expressions generate normal expressions required param current scope currentscope org eclipse jdt internal compiler lookup block scope blockscope param code stream codestream org eclipse jdt internal compiler codegen code stream codestream generate code generatecode block scope blockscope current scope currentscope code stream codestream code stream codestream bits isreachablemask generate code generatecode current scope currentscope code stream codestream expression responsible generating implicit conversion param current scope currentscope org eclipse jdt internal compiler lookup block scope blockscope param code stream codestream org eclipse jdt internal compiler codegen code stream codestream param value required valuerequired generate code generatecode block scope blockscope current scope currentscope code stream codestream code stream codestream value required valuerequired constant notaconstant generate constant expression code stream codestream position code stream codestream generate constant generateconstant constant implicit conversion implicitconversion code stream codestream record positions from recordpositionsfrom source start sourcestart nls should not implement shouldnotimplement util bind ast missing code missingcode generation param current scope currentscope param code stream codestream param true label truelabel param false label falselabel param value required valuerequired generate optimized boolean generateoptimizedboolean block scope blockscope current scope currentscope code stream codestream code stream codestream label true label truelabel label false label falselabel value required valuerequired constant constant notaconstant constant typeid code stream codestream position constant boolean value booleanvalue constant value required valuerequired false label falselabel implicit falling true label truelabel code stream codestream true label truelabel value required valuerequired false label falselabel implicit falling true label truelabel code stream codestream false label falselabel code stream codestream record positions from recordpositionsfrom source start sourcestart generate code generatecode current scope currentscope code stream codestream value required valuerequired branching position code stream codestream position value required valuerequired false label falselabel true label truelabel implicit falling code stream codestream ifne true label truelabel true label truelabel implicit falling code stream codestream ifeq false label falselabel implicit fall occur reposition endpc code stream codestream update last recorded end c updatelastrecordedendpc position optimized java code generation string concat enations concatenations involve string buffer stringbuffer creation path string buffer stringbuffer creation operands appended current optimization generate optimized string concatenation generateoptimizedstringconcatenation block scope blockscope block scope blockscope code stream codestream code stream codestream typeid typeid string constant notaconstant constant string value stringvalue length optimize str generate code generatecode block scope blockscope code stream codestream code stream codestream invoke string concatenation append for type invokestringconcatenationappendfortype typeid optimized java code generation string concat enations concatenations involve string buffer stringbuffer creation path string buffer stringbuffer creation operands appended current generate optimized string concatenation creation generateoptimizedstringconcatenationcreation block scope blockscope block scope blockscope code stream codestream code stream codestream typeid optimization int egers integers strings typeid object runtime value of valueof object returns append object value of valueof object append object returns append value of valueof object handled append string code stream codestream new string contatenation newstringcontatenation code stream codestream dup code stream codestream invoke string concatenation default constructor invokestringconcatenationdefaultconstructor generate code generatecode block scope blockscope code stream codestream code stream codestream invoke string concatenation append for type invokestringconcatenationappendfortype object code stream codestream new string contatenation newstringcontatenation code stream codestream dup typeid string typeid constant notaconstant string string value stringvalue constant string value stringvalue optimize str string value stringvalue length code stream codestream invoke string concatenation default constructor invokestringconcatenationdefaultconstructor code stream codestream ldc string value stringvalue generate code generatecode block scope blockscope code stream codestream code stream codestream invoke string value of invokestringvalueof object generate code generatecode block scope blockscope code stream codestream code stream codestream invoke string value of invokestringvalueof typeid code stream codestream invoke string concatenation string constructor invokestringconcatenationstringconstructor is comp act able operation iscompactableoperation conversion auto matically automatically javavm based machine pushing stack automatically create stack request work sig ned signed numbers is constant value of type assignable to type isconstantvalueoftypeassignabletotype type binding typebinding constant type constanttype type binding typebinding target type targettype constant constant notaconstant constant type constanttype target type targettype constant type constanttype is base type isbasetype target type targettype is base type isbasetype free assignment conversion int egral integral constant type constanttype int binding intbinding base type binding basetypebinding is widening iswidening constant type constanttype base type binding basetypebinding is narrowing isnarrowing target type targettype current explicit conversion order compare current is constant value rep res entable isconstantvaluerepresentable constant constant type constanttype target type targettype is type reference istypereference constant usable byte code bytecode pattern opt imizations optimizations inlined str ictly strictly equivalent definition constant expressions side effects required occur constant type constant optimized boolean constant optimizedbooleanconstant constant string buffer stringbuffer print indent string buffer stringbuffer output print indent printindent indent output print expression printexpression indent output string buffer stringbuffer print expression printexpression indent string buffer stringbuffer output string buffer stringbuffer print statement printstatement indent string buffer stringbuffer output nls print indent output append report illegal cast reportillegalcast scope scope type binding typebinding cast type casttype type binding typebinding expression type expressiontype resolve block scope blockscope scope drops returning expression type type resolve type resolvetype scope type binding typebinding resolve type resolvetype block scope blockscope scope type binding typebinding resolve type resolvetype class scope classscope class scope classscope subclasses implement required type binding typebinding resolve type expecting resolvetypeexpecting block scope blockscope scope type binding typebinding expected type expectedtype needed method invocation set expected type setexpectedtype expected type expectedtype type binding typebinding expression type expressiontype resolve type resolvetype scope expression type expressiontype expression type expressiontype expected type expectedtype expression type expressiontype expression type expressiontype is compatible with iscompatiblewith expected type expectedtype scope problem reporter problemreporter type mismatch error typemismatcherror expression type expressiontype expected type expectedtype expression type expressiontype record type expectation expression type checked typechecked string foo foo tag ged tagged expected type string trigger proper inference method invocations set expected type setexpectedtype type binding typebinding expected type expectedtype tag as unnecessary cast tagasunnecessarycast scope scope type binding typebinding cast type casttype tag as need check cast tagasneedcheckcast expression to type reference totypereference traverse ast visitor astvisitor visitor block scope blockscope scope traverse ast visitor astvisitor visitor class scope classscope scope traverse ast visitor astvisitor visitor compilation unit scope compilationunitscope scope