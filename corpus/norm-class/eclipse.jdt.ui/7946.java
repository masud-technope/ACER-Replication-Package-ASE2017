copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt ast view astview views java util array list arraylist org eclipse jdt ast view astview ast view plugin astviewplugin org eclipse swt graphics image org eclipse jdt core i java element ijavaelement org eclipse jdt core dom ast org eclipse jdt core dom character literal characterliteral org eclipse jdt core dom i annotation binding iannotationbinding org eclipse jdt core dom i binding ibinding org eclipse jdt core dom i member value pair binding imembervaluepairbinding org eclipse jdt core dom i method binding imethodbinding org eclipse jdt core dom i package binding ipackagebinding org eclipse jdt core dom i type binding itypebinding org eclipse jdt core dom i variable binding ivariablebinding org eclipse jdt core dom modifier org eclipse jdt core dom primitive type primitivetype org eclipse jdt core dom string literal stringliteral binding ast attribute astattribute i binding ibinding f binding fbinding string f label flabel object f parent fparent f is relevant fisrelevant binding object parent string label i binding ibinding binding is relevant isrelevant f parent fparent parent f binding fbinding binding f label flabel label f is relevant fisrelevant is relevant isrelevant override object get parent getparent f parent fparent i binding ibinding get binding getbinding f binding fbinding has binding properties hasbindingproperties f binding fbinding is relevant isrelevant f is relevant fisrelevant is type istype type kinds typekinds kind type kinds typekinds kind override object get children getchildren f binding fbinding f binding fbinding get key getkey runtime exception runtimeexception ast view plugin astviewplugin log exception thrown i binding ibinding get key getkey f binding fbinding object error broken binding brokenbinding f binding fbinding f binding fbinding array list arraylist ast attribute astattribute res array list arraylist nls res add binding property bindingproperty f binding fbinding get name getname nls res add binding property bindingproperty key f binding fbinding get key getkey nls res add binding property bindingproperty recovered f binding fbinding is recovered isrecovered f binding fbinding get kind getkind i binding ibinding variable i variable binding ivariablebinding variable binding variablebinding i variable binding ivariablebinding f binding fbinding res add nls binding property bindingproperty nls nls field nls variable binding variablebinding is field isfield nls res add nls binding property bindingproperty nls nls enum constant nls variable binding variablebinding is enum constant isenumconstant nls res add nls binding property bindingproperty nls nls parameter nls variable binding variablebinding is parameter isparameter nls res add nls binding property bindingproperty nls nls variable nls variable binding variablebinding get variable id getvariableid nls res add nls binding property bindingproperty nls nls modifiers nls get modifiers string getmodifiersstring f binding fbinding get modifiers getmodifiers nls res add nls binding nls nls type nls variable binding variablebinding get type gettype nls res add nls binding nls nls declaring nls variable binding variablebinding get declaring class getdeclaringclass nls res add nls binding nls nls declaring method nls variable binding variablebinding get declaring method getdeclaringmethod nls res add nls binding nls nls variable declaration nls variable binding variablebinding get variable declaration getvariabledeclaration nls res add nls binding property bindingproperty nls nls synthetic nls f binding fbinding is synthetic issynthetic nls res add nls binding property bindingproperty nls nls deprecated nls f binding fbinding is deprecated isdeprecated nls nls nls res add binding property bindingproperty constant variable binding variablebinding get constant value getconstantvalue res add nls binding property bindingproperty nls nls effectively nls variable binding variablebinding is effectively final iseffectivelyfinal nls i binding ibinding i package binding ipackagebinding package binding packagebinding i package binding ipackagebinding f binding fbinding res add nls binding property bindingproperty nls nls unnamed nls package binding packagebinding is unnamed isunnamed nls res add nls binding property bindingproperty nls nls synthetic nls f binding fbinding is synthetic issynthetic nls res add nls binding property bindingproperty nls nls deprecated nls f binding fbinding is deprecated isdeprecated nls i binding ibinding type i type binding itypebinding type binding typebinding i type binding itypebinding f binding fbinding res add nls binding property bindingproperty nls nls qualified nls type binding typebinding get qualified name getqualifiedname nls type kind typekind get type kind gettypekind type binding typebinding is ref type isreftype is type istype type kind typekind type is non primitive isnonprimitive is type istype type kind typekind primitive type string buffer stringbuffer kinds nls string buffer stringbuffer nls kind type binding typebinding is array isarray nls kinds append nls is array isarray type binding typebinding is capture iscapture nls kinds append nls is capture iscapture type binding typebinding is null type isnulltype nls kinds append nls is null type isnulltype type binding typebinding is primitive isprimitive nls kinds append nls is primitive isprimitive type binding typebinding is type variable istypevariable kinds append is type variable istypevariable type binding typebinding is wildcard type iswildcardtype kinds append is wildcard type iswildcardtype types type binding typebinding is annotation isannotation nls kinds append nls is annotation isannotation type binding typebinding is class isclass nls kinds append nls is class isclass type binding typebinding is interface isinterface nls kinds append nls is interface isinterface type binding typebinding is enum isenum nls kinds append nls is enum isenum res add nls binding property bindingproperty nls nls kinds nls string buffer stringbuffer generics nls string buffer stringbuffer nls generics type binding typebinding is raw type israwtype nls generics append nls is raw type israwtype type binding typebinding is generic type isgenerictype nls generics append nls is generic type isgenerictype type binding typebinding is parameterized type isparameterizedtype generics append is parameterized type isparameterizedtype is type istype type kind typekind param etrized parametrized generics append parameterized res add nls binding property bindingproperty nls nls generics nls is ref type isreftype res add binding element type type binding typebinding get element type getelementtype is type istype nls type kind typekind nls array type res add binding component type type binding typebinding get component type getcomponenttype is type istype nls type kind typekind nls array type res add binding property bindingproperty dimensions type binding typebinding get dimensions getdimensions is type istype nls type kind typekind nls array type string create array type label createarraytypelabel create array type i type binding itypebinding array type arraytype type binding typebinding create array type createarraytype res add binding create array type label createarraytypelabel array type arraytype runtime exception runtimeexception string msg get class getclass get name getname get local ized message getlocalizedmessage is relevant isrelevant type binding typebinding get name getname equals primitive type primitivetype to string tostring type binding typebinding is recovered isrecovered is relevant isrelevant res add error create array type label createarraytypelabel msg res add binding property bindingproperty create array type label createarraytypelabel msg string buffer stringbuffer origin nls string buffer stringbuffer nls origin type binding typebinding is top level istoplevel nls origin append nls is top level istoplevel type binding typebinding is nested isnested nls origin append nls is nested isnested type binding typebinding is local islocal nls origin append nls is local islocal type binding typebinding is member ismember nls origin append nls is member ismember type binding typebinding is anonymous isanonymous nls origin append nls is anonymous isanonymous res add binding property bindingproperty origin is ref type isreftype res add binding property bindingproperty source type binding typebinding is from source isfromsource is type istype type kind typekind nls type variable type nls capture type res add nls binding nls nls nls type binding typebinding get package getpackage nls is ref type isreftype res add binding declaring type binding typebinding get declaring class getdeclaringclass is type istype type kind typekind nls type variable type nls capture type res add binding declaring method type binding typebinding get declaring method getdeclaringmethod is type istype type kind typekind nls type variable type nls capture type res add binding declaring member type binding typebinding get declaring member getdeclaringmember nls type binding typebinding is local islocal res add nls binding property bindingproperty nls nls modifiers nls get modifiers string getmodifiersstring f binding fbinding get modifiers getmodifiers nls is ref type isreftype res add nls binding property bindingproperty nls nls binary nls type binding typebinding get binary name getbinaryname nls string is type declaration istypedeclaration type binding typebinding type binding typebinding get type declaration gettypedeclaration res add nls binding nls nls type declaration is type declaration istypedeclaration nls type binding typebinding get type declaration gettypedeclaration nls string is erasure iserasure type binding typebinding type binding typebinding get erasure geterasure res add nls binding nls nls erasure is erasure iserasure nls type binding typebinding get erasure geterasure nls is non primitive isnonprimitive res add binding property bindingproperty type parameters type binding typebinding get type parameters gettypeparameters is type istype nls type kind typekind nls res add binding property bindingproperty type arguments type binding typebinding get type arguments gettypearguments is type istype nls type kind typekind nls param etrized parametrized res add binding property bindingproperty type bounds type binding typebinding get type bounds gettypebounds is type istype type kind typekind nls variable type wildcard type nls capture type res add binding bound type binding typebinding get bound getbound is type istype nls type kind typekind nls wildcard type res add binding property bindingproperty upper bound upperbound type binding typebinding is upper bound isupperbound is type istype nls type kind typekind nls wildcard type res add binding type wildcard type type binding typebinding get generic type of wildcard type getgenerictypeofwildcardtype is type istype nls type kind typekind nls wildcard type res add binding property bindingproperty rank type binding typebinding get rank getrank is type istype nls type kind typekind nls wildcard type res add binding wildcard type binding typebinding get wildcard getwildcard is type istype nls type kind typekind nls capture type res add nls binding nls nls superclass nls type binding typebinding get superclass getsuperclass nls is ref type isreftype res add nls binding property bindingproperty nls nls interfaces nls type binding typebinding get interfaces getinterfaces nls is ref type isreftype res add nls binding property bindingproperty nls nls declared types nls type binding typebinding get declared types getdeclaredtypes nls is ref type isreftype res add nls binding property bindingproperty nls nls declared fields nls type binding typebinding get declared fields getdeclaredfields nls is ref type isreftype res add nls binding property bindingproperty nls nls declared methods nls type binding typebinding get declared methods getdeclaredmethods nls is ref type isreftype res add binding functional method type binding typebinding get functional interface method getfunctionalinterfacemethod nls type binding typebinding is interface isinterface res add nls binding property bindingproperty nls nls synthetic nls f binding fbinding is synthetic issynthetic nls is non primitive isnonprimitive res add nls binding property bindingproperty nls nls deprecated nls f binding fbinding is deprecated isdeprecated nls is ref type isreftype res add nls binding property bindingproperty nls nls type annotations nls type binding typebinding get type annotations gettypeannotations nls i binding ibinding method i method binding imethodbinding method binding methodbinding i method binding imethodbinding f binding fbinding res add nls binding property bindingproperty nls nls constructor nls method binding methodbinding is constructor isconstructor nls res add nls binding property bindingproperty nls nls constructor nls method binding methodbinding is default constructor isdefaultconstructor nls res add nls binding nls nls declaring nls method binding methodbinding get declaring class getdeclaringclass nls res add binding declaring member method binding methodbinding get declaring member getdeclaringmember nls method binding methodbinding get declaring member getdeclaringmember nls res add nls binding nls nls type nls method binding methodbinding get return type getreturntype nls res add nls binding property bindingproperty nls nls modifiers nls get modifiers string getmodifiersstring f binding fbinding get modifiers getmodifiers nls res add nls binding property bindingproperty nls nls parameter types nls method binding methodbinding get parameter types getparametertypes nls res add nls binding property bindingproperty nls nls varargs nls method binding methodbinding is varargs isvarargs nls res add nls binding property bindingproperty nls nls exception types nls method binding methodbinding get exception types getexceptiontypes nls string buffer stringbuffer generics m genericsm nls string buffer stringbuffer nls generics method binding methodbinding is raw method israwmethod nls generics m genericsm append nls is raw method israwmethod method binding methodbinding is generic method isgenericmethod generics m genericsm append is generic method isgenericmethod method binding methodbinding is parameterized method isparameterizedmethod generics m genericsm append is parameterized method isparameterizedmethod res add binding property bindingproperty generics m genericsm string is method declaration ismethoddeclaration method binding methodbinding method binding methodbinding get method declaration getmethoddeclaration res add nls binding nls nls method declaration is method declaration ismethoddeclaration nls method binding methodbinding get method declaration getmethoddeclaration nls res add nls binding property bindingproperty nls nls type parameters nls method binding methodbinding get type parameters gettypeparameters nls res add nls binding property bindingproperty nls nls type arguments nls method binding methodbinding get type arguments gettypearguments nls res add nls binding property bindingproperty nls nls synthetic nls f binding fbinding is synthetic issynthetic nls res add nls binding property bindingproperty nls nls deprecated nls f binding fbinding is deprecated isdeprecated nls res add nls binding property bindingproperty nls nls annotation member nls method binding methodbinding is annotation member isannotationmember nls res add binding create value attribute createvalueattribute method binding methodbinding get default value getdefaultvalue parameter count parametercount method binding methodbinding get parameter types getparametertypes length binding property bindingproperty parameters annotations parametersannotations binding property bindingproperty parameter count parametercount parameter count parametercount parameters annotations parametersannotations binding property bindingproperty parameter string value of valueof method binding methodbinding get parameter annotations getparameterannotations res add binding property bindingproperty parameter annotations parameters annotations parametersannotations i binding ibinding annotation i annotation binding iannotationbinding annotation binding annotationbinding i annotation binding iannotationbinding f binding fbinding res add binding annotation type annotation binding annotationbinding get annotation type getannotationtype res add binding property bindingproperty declared member pairs annotation binding annotationbinding get declared member value pairs getdeclaredmembervaluepairs res add binding property bindingproperty member pairs annotation binding annotationbinding get all member value pairs getallmembervaluepairs i binding ibinding member pair i member value pair binding imembervaluepairbinding member value pair binding membervaluepairbinding i member value pair binding imembervaluepairbinding f binding fbinding res add binding method binding member value pair binding membervaluepairbinding get method binding getmethodbinding res add binding property bindingproperty member value pair binding membervaluepairbinding is default isdefault res add binding create value attribute createvalueattribute member value pair binding membervaluepairbinding get value getvalue i annotation binding iannotationbinding annotations f binding fbinding get annotations getannotations nls res add nls binding property bindingproperty annotations annotations runtime exception runtimeexception string label error i binding ibinding get annotations getannotations f binding fbinding get key getkey res add error label ast view plugin astviewplugin log exception thrown i binding ibinding get annotations getannotations f binding fbinding get key getkey i java element ijavaelement java element javaelement f binding fbinding get java element getjavaelement res add java element javaelement java element javaelement runtime exception runtimeexception string label java element get class getclass get name getname f binding fbinding get key getkey res add error label ast view plugin astviewplugin log exception thrown i binding ibinding get java element getjavaelement f binding fbinding get key getkey res to array toarray empty array type type variable type wildcard type capture type primitive type type param etrized parametrized get type kind gettypekind i type binding itypebinding type binding typebinding type binding typebinding is array isarray array type type binding typebinding is capture iscapture capture type type binding typebinding is null type isnulltype type type binding typebinding is primitive isprimitive primitive type type binding typebinding is type variable istypevariable variable type type binding typebinding is wildcard type iswildcardtype wildcard type type binding typebinding is generic type isgenerictype type type binding typebinding is parameterized type isparameterizedtype type binding typebinding is raw type israwtype type param etrized parametrized type override string get label getlabel string buffer stringbuffer buf string buffer stringbuffer f label flabel nls buf append f binding fbinding f binding fbinding get kind getkind i binding ibinding variable i variable binding ivariablebinding variable binding variablebinding i variable binding ivariablebinding f binding fbinding variable binding variablebinding is field isfield buf append variable binding variablebinding get name getname variable binding variablebinding get declaring class getdeclaringclass nls buf append nls array type buf append variable binding variablebinding get declaring class getdeclaringclass get name getname buf append buf append variable binding variablebinding get name getname i binding ibinding i package binding ipackagebinding package binding packagebinding i package binding ipackagebinding f binding fbinding buf append package binding packagebinding get name getname i binding ibinding type i type binding itypebinding type binding typebinding i type binding itypebinding f binding fbinding append annotated qualified name appendannotatedqualifiedname buf type binding typebinding i binding ibinding method i method binding imethodbinding method binding methodbinding i method binding imethodbinding f binding fbinding buf append method binding methodbinding get declaring class getdeclaringclass get name getname buf append buf append method binding methodbinding get name getname buf append i type binding itypebinding parameters method binding methodbinding get parameter types getparametertypes parameters length nls buf append i type binding itypebinding parameter parameters buf append parameter get name getname buf append i binding ibinding annotation i binding ibinding member pair buf append f binding fbinding to string tostring nls buf append buf to string tostring append annotated qualified name appendannotatedqualifiedname string buffer stringbuffer buf i type binding itypebinding type binding typebinding xxx hack debug ging debugging tool string debug string debugstring type binding typebinding to string tostring debug string debugstring index of indexof type binding typebinding get type annotations gettypeannotations length line r liner outer most outermost type type annotations buf append debug string debugstring buf append type binding typebinding get qualified name getqualifiedname override image get image getimage override string to string tostring get label getlabel java lang object equals java lang object override equals object obj obj obj obj get class getclass equals get class getclass binding binding obj f parent fparent f parent fparent f parent fparent equals f parent fparent f binding fbinding f binding fbinding f binding fbinding equals f binding fbinding f label flabel f label flabel f label flabel equals f label flabel java lang object hash code hashcode override hash code hashcode result f parent fparent f parent fparent hash code hashcode result f binding fbinding f binding fbinding get key getkey f binding fbinding get key getkey hash code hashcode result f label flabel f label flabel hash code hashcode result string get binding label getbindinglabel i binding ibinding binding string label binding nls label binding binding get kind getkind i binding ibinding variable label variable binding i binding ibinding type nls label nls type binding i binding ibinding method label method binding i binding ibinding label binding i binding ibinding annotation label annotation binding i binding ibinding member pair label member pair binding label unknown binding label creates link ast attribute astattribute link i member value pair binding imembervaluepairbinding get value getvalue link i method binding imethodbinding get default value getdefaultvalue param parent parent node param attribute param attribute ast attribute astattribute ast attribute astattribute create value attribute createvalueattribute ast attribute astattribute parent string object ast attribute astattribute res i binding ibinding i binding ibinding binding i binding ibinding res binding parent get binding label getbindinglabel binding binding string res general attribute generalattribute parent get escaped string literal getescapedstringliteral string object res general attribute generalattribute parent object ast attribute astattribute res ast attribute astattribute res general attribute generalattribute parent res string get escaped string literal getescapedstringliteral string string value stringvalue string literal stringliteral string literal stringliteral ast newast ast view astview jls latest new string literal newstringliteral string literal stringliteral set literal value setliteralvalue string value stringvalue string literal stringliteral get escaped value getescapedvalue string get escaped char literal getescapedcharliteral char value charvalue character literal characterliteral char literal charliteral ast newast ast view astview jls latest new character literal newcharacterliteral char literal charliteral set char value setcharvalue char value charvalue char literal charliteral get escaped value getescapedvalue string buffer stringbuffer get modifiers string getmodifiersstring flags is method ismethod string buffer stringbuffer string buffer stringbuffer append append integer to hex string tohexstring flags append prolog len prologlen length flags append flag appendflag flags modifier append flag appendflag flags modifier append flag appendflag flags modifier append flag appendflag flags modifier append flag appendflag flags modifier is method ismethod append flag appendflag flags modifier append flag appendflag flags modifier append flag appendflag flags modifier append flag appendflag flags modifier append flag appendflag flags modifier append flag appendflag flags modifier append flag appendflag flags modifier append unknown append integer to hex string tohexstring append len length len prolog len prologlen set length setlength len append append flag appendflag string buffer stringbuffer flags flag string flags flag append flag