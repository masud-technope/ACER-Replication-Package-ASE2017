copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation dmitry stalnov dst alnov dstalnov f usionone fusionone contributed bug inline method doesn handle implicit https bugs eclipse org bugs bug cgi inline call field initializer https bugs eclipse org bugs bug cgi inline call field initializer detect reference https bugs eclipse org bugs bug cgi org eclipse jdt internal corext refactoring code java util array list arraylist java util collection java util iterator java util list org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core file buf fers filebuffers i text file buffer itextfilebuffer org eclipse text edits malformed tree exception malformedtreeexception org eclipse text edits multi text edit multitextedit org eclipse text edits range marker rangemarker org eclipse text edits text edit textedit org eclipse text edits text edit processor texteditprocessor org eclipse text edits undo edit undoedit org eclipse jface text bad location exception badlocationexception org eclipse jface text document org eclipse jface text i document idocument org eclipse jface text i region iregion org eclipse jface text region org eclipse jface text text utilities textutilities org eclipse ltk core refactoring refactoring status refactoringstatus org eclipse jdt core i type root ityperoot org eclipse jdt core java model exception javamodelexception org eclipse jdt core dom ast org eclipse jdt core dom ast node astnode org eclipse jdt core dom ast visitor astvisitor org eclipse jdt core dom block org eclipse jdt core dom cast expression castexpression org eclipse jdt core dom child property descriptor childpropertydescriptor org eclipse jdt core dom class instance creation classinstancecreation org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom conditional expression conditionalexpression org eclipse jdt core dom do statement dostatement org eclipse jdt core dom enhanced for statement enhancedforstatement org eclipse jdt core dom expression org eclipse jdt core dom field access fieldaccess org eclipse jdt core dom for statement forstatement org eclipse jdt core dom i binding ibinding org eclipse jdt core dom i method binding imethodbinding org eclipse jdt core dom i type binding itypebinding org eclipse jdt core dom i variable binding ivariablebinding org eclipse jdt core dom if statement ifstatement org eclipse jdt core dom labeled statement labeledstatement org eclipse jdt core dom method declaration methoddeclaration org eclipse jdt core dom method invocation methodinvocation org eclipse jdt core dom modifier org eclipse jdt core dom org eclipse jdt core dom parenthesized expression parenthesizedexpression org eclipse jdt core dom return statement returnstatement org eclipse jdt core dom simple name simplename org eclipse jdt core dom single variable declaration singlevariabledeclaration org eclipse jdt core dom statement org eclipse jdt core dom structural property descriptor structuralpropertydescriptor org eclipse jdt core dom this expression thisexpression org eclipse jdt core dom while statement whilestatement org eclipse jdt core dom rewrite ast rewrite astrewrite org eclipse jdt core dom rewrite import rewrite importrewrite org eclipse jdt core dom rewrite import rewrite importrewrite import rewrite context importrewritecontext org eclipse jdt internal corext code manipulation codemanipulation context sensitive import rewrite context contextsensitiveimportrewritecontext org eclipse jdt internal corext dom ast nodes astnodes org eclipse jdt internal corext dom bindings org eclipse jdt internal corext dom code scope builder codescopebuilder org eclipse jdt internal corext dom necessary parentheses checker necessaryparentheseschecker org eclipse jdt internal corext refactoring code source analyzer sourceanalyzer name data namedata org eclipse jdt internal corext refactoring util refactoring file buffers refactoringfilebuffers org eclipse jdt internal corext util code formatter util codeformatterutil org eclipse jdt internal corext util strings org eclipse jdt internal java plugin javaplugin source provider sourceprovider encapsulates piece code source logic inline call contexts callcontexts source provider sourceprovider i type root ityperoot f type root ftyperoot i document idocument f document fdocument method declaration methoddeclaration f declaration fdeclaration source analyzer sourceanalyzer f analyzer fanalyzer f must eval returned expression fmustevalreturnedexpression f return value needs local variable freturnvalueneedslocalvariable list expression f return expressions freturnexpressions i document idocument f source fsource expression mode statement mode statement mode f marker mode fmarkermode return analyzer returnanalyzer ast visitor astvisitor override visit return statement returnstatement node expression expression node get expression getexpression ast nodes astnodes is literal isliteral expression expression f must eval returned expression fmustevalreturnedexpression invocations is invocation isinvocation expression expression class instance creation classinstancecreation f return value needs local variable freturnvalueneedslocalvariable f return expressions freturnexpressions add expression source provider sourceprovider i type root ityperoot type root typeroot method declaration methoddeclaration declaration f type root ftyperoot type root typeroot f declaration fdeclaration declaration list single variable declaration singlevariabledeclaration parameters f declaration fdeclaration parameters iterator single variable declaration singlevariabledeclaration iter parameters iterator iter has next hasnext single variable declaration singlevariabledeclaration element iter parameter data parameterdata data parameter data parameterdata element element set property setproperty parameter data parameterdata property data f analyzer fanalyzer source analyzer sourceanalyzer f type root ftyperoot f declaration fdeclaration f return value needs local variable freturnvalueneedslocalvariable f return expressions freturnexpressions array list arraylist todo unit source match contents source document declaration node param type root typeroot type root param source document content type root param declaration method declaration node source provider sourceprovider i type root ityperoot type root typeroot i document idocument source method declaration methoddeclaration declaration type root typeroot declaration f source fsource source refactoring status refactoringstatus check activation checkactivation java model exception javamodelexception f analyzer fanalyzer check activation checkactivation initialize java model exception javamodelexception f document fdocument f source fsource document f type root ftyperoot get buffer getbuffer get contents getcontents f source fsource f analyzer fanalyzer initialize has return value hasreturnvalue ast node astnode get last statement getlaststatement return analyzer returnanalyzer analyzer return analyzer returnanalyzer accept analyzer is execution flow interrupted isexecutionflowinterrupted f analyzer fanalyzer is execution flow interrupted isexecutionflowinterrupted variable reference finder variablereferencefinder ast visitor astvisitor f result fresult i variable binding ivariablebinding f binding fbinding variable reference finder variablereferencefinder i variable binding ivariablebinding binding f binding fbinding binding get result getresult f result fresult override visit simple name simplename node f result fresult f result fresult bindings equals f binding fbinding node resolve binding resolvebinding checks variable referenced method declaration param binding binding variable check code code variable referenced method code code is variable reference d isvariablereferenced i variable binding ivariablebinding binding variable reference finder variablereferencefinder finder variable reference finder variablereferencefinder binding f declaration fdeclaration accept finder finder get result getresult has return value hasreturnvalue i method binding imethodbinding binding f declaration fdeclaration resolve binding resolvebinding nls binding get return type getreturntype f declaration fdeclaration getast resolve well known type resolvewellknowntype returns declaration var arg vararg body array access var arg vararg has array access hasarrayaccess f analyzer fanalyzer has array access hasarrayaccess has super method invocation hassupermethodinvocation f analyzer fanalyzer has super method invocation hassupermethodinvocation must evaluate returned expression mustevaluatereturnedexpression f must eval returned expression fmustevalreturnedexpression return value needs local variable returnvalueneedslocalvariable f return value needs local variable freturnvalueneedslocalvariable get number of statements getnumberofstatements f declaration fdeclaration get body getbody statements size is simple function issimplefunction list statement statements f declaration fdeclaration get body getbody statements statements size statements return statement returnstatement is last statement return islaststatementreturn list statement statements f declaration fdeclaration get body getbody statements statements size statements statements size return statement returnstatement is dan glig if isdangligif list statement statements f declaration fdeclaration get body getbody statements statements size ast node astnode statements if statement ifstatement if statement ifstatement get else statement getelsestatement child property descriptor childpropertydescriptor child d childd while statement whilestatement child d childd while statement whilestatement body property for statement forstatement child d childd for statement forstatement body property enhanced for statement enhancedforstatement child d childd enhanced for statement enhancedforstatement body property do statement dostatement child d childd do statement dostatement body property labeled statement labeledstatement child d childd labeled statement labeledstatement body property statement body statement get structural property getstructuralproperty child d childd body block body method declaration methoddeclaration get declaration getdeclaration f declaration fdeclaration string get method name getmethodname f declaration fdeclaration get name getname get identifier getidentifier i type binding itypebinding get return type getreturntype f declaration fdeclaration resolve binding resolvebinding get return type getreturntype list expression get return expressions getreturnexpressions f return expressions freturnexpressions return type matches return expressions returntypematchesreturnexpressions i type binding itypebinding return type returntype get return type getreturntype iterator expression iter f return expressions freturnexpressions iterator iter has next hasnext expression expression iter bindings equals return type returntype expression resolve type binding resolvetypebinding parameter data parameterdata get parameter data getparameterdata single variable declaration singlevariabledeclaration decl single variable declaration singlevariabledeclaration f declaration fdeclaration parameters parameter data parameterdata decl get property getproperty parameter data parameterdata property i type root ityperoot get type root gettyperoot f type root ftyperoot needs returned expression parent hesis needsreturnedexpressionparenthesis ast node astnode parent structural property descriptor structuralpropertydescriptor location in parent locationinparent ast node astnode get last statement getlaststatement return statement returnstatement necessary parentheses checker necessaryparentheseschecker needs parentheses needsparentheses return statement returnstatement get expression getexpression parent location in parent locationinparent returns conditional expression returnsconditionalexpression ast node astnode get last statement getlaststatement return statement returnstatement return statement returnstatement get expression getexpression conditional expression conditionalexpression get receivers to be updated getreceiverstobeupdated f analyzer fanalyzer get implicit receivers getimplicitreceivers size is varargs isvarargs f declaration fdeclaration is varargs isvarargs get var arg index getvarargindex f declaration fdeclaration parameters size text edit textedit get delete edit getdeleteedit ast rewrite astrewrite rewriter ast rewrite astrewrite create f declaration fdeclaration getast rewriter remove f declaration fdeclaration rewriter rewriteast f document fdocument f type root ftyperoot get java project getjavaproject get options getoptions string get code blocks getcodeblocks call context callcontext context import rewrite importrewrite import rewrite importrewrite core exception coreexception ast rewrite astrewrite rewriter ast rewrite astrewrite create f declaration fdeclaration getast replace parameter with expression replaceparameterwithexpression rewriter context import rewrite importrewrite update implicit receivers updateimplicitreceivers rewriter context make names unique makenamesunique rewriter context scope update type references updatetypereferences rewriter context update static references updatestaticreferences rewriter context update type variables updatetypevariables rewriter context update method type variable updatemethodtypevariable rewriter context list i region iregion ranges has return value hasreturnvalue context call mode callmode ast node astnode statement ranges get statement ranges getstatementranges ranges get expression ranges getexpressionranges ast node astnode get last statement getlaststatement get node type getnodetype ast node astnode statement ranges get return statement ranges getreturnstatementranges ranges get statement ranges getstatementranges text edit textedit dummy rewriter rewriteast f document fdocument f type root ftyperoot get java project getjavaproject get options getoptions size ranges size range marker rangemarker markers range marker rangemarker size markers length i region iregion range ranges markers range marker rangemarker range get offset getoffset range get length getlength split size split integer max i region iregion region ranges split region get offset getoffset region get length getlength text edit textedit edits dummy remove children removechildren edits length text edit textedit edit edits pos edit get offset getoffset split markers pos add child addchild edit multi text edit multitextedit root multi text edit multitextedit f document fdocument get length getlength root add children addchildren markers text edit processor texteditprocessor processor text edit processor texteditprocessor f document fdocument root text edit textedit create undo text edit textedit update regions undo edit undoedit undo processor perform edits performedits string result get blocks getblocks markers faster undo coping buffer processor text edit processor texteditprocessor f document fdocument undo text edit textedit update regions processor perform edits performedits result malformed tree exception malformedtreeexception exception java plugin javaplugin log exception bad location exception badlocationexception exception java plugin javaplugin log exception string expression create parenthesized expression createparenthesizedexpression expression new expression newexpression ast ast parenthesized expression parenthesizedexpression parenthesized ast new parenthesized expression newparenthesizedexpression parenthesized set expression setexpression new expression newexpression parenthesized replace parameter with expression replaceparameterwithexpression ast rewrite astrewrite rewriter call context callcontext context import rewrite importrewrite import rewrite importrewrite core exception coreexception expression arguments context arguments i text file buffer itextfilebuffer buffer refactoring file buffers refactoringfilebuffers acquire context compilation unit compilationunit arguments length expression expression arguments string expression string expressionstring expression simple name simplename expression string expressionstring simple name simplename expression get identifier getidentifier expression string expressionstring buffer get document getdocument expression get start position getstartposition expression get length getlength bad location exception badlocationexception exception java plugin javaplugin log exception parameter data parameterdata parameter get parameter data getparameterdata list simple name simplename references parameter references iterator simple name simplename iter references iterator iter has next hasnext ast node astnode element iter expression new expression newexpression expression rewriter create string placeholder createstringplaceholder expression string expressionstring expression get node type getnodetype ast ast rewriter getast i type binding itypebinding explicit cast explicitcast ast nodes astnodes get explicit cast getexplicitcast expression expression element explicit cast explicitcast cast expression castexpression ast new cast expression newcastexpression necessary parentheses checker necessaryparentheseschecker needs parentheses needsparentheses expression cast expression castexpression expression property new expression newexpression create parenthesized expression createparenthesizedexpression new expression newexpression ast set expression setexpression new expression newexpression import rewrite context importrewritecontext import rewrite context importrewritecontext context sensitive import rewrite context contextsensitiveimportrewritecontext expression import rewrite importrewrite set type settype import rewrite importrewrite add import addimport explicit cast explicitcast ast import rewrite context importrewritecontext expression new expression newexpression necessary parentheses checker necessaryparentheseschecker needs parentheses needsparentheses expression element get parent getparent element get location in parent getlocationinparent new expression newexpression create parenthesized expression createparenthesizedexpression new expression newexpression ast rewriter replace element new expression newexpression refactoring file buffers refactoringfilebuffers release context compilation unit compilationunit make names unique makenamesunique ast rewrite astrewrite rewriter code scope builder codescopebuilder scope scope collection name data namedata used callee names usedcalleenames f analyzer fanalyzer get used names getusednames iterator name data namedata iter used callee names usedcalleenames iterator iter has next hasnext source analyzer sourceanalyzer name data namedata iter scope is in use isinuse get name getname string new name newname scope create name createname get name getname list simple name simplename references references iterator simple name simplename references iterator has next hasnext simple name simplename element ast node astnode new node newnode rewriter create string placeholder createstringplaceholder new name newname ast node astnode simple rewriter replace element new node newnode update implicit receivers updateimplicitreceivers ast rewrite astrewrite rewriter call context callcontext context context receiver list expression implicit receivers implicitreceivers f analyzer fanalyzer get implicit receivers getimplicitreceivers iterator expression iter implicit receivers implicitreceivers iterator iter has next hasnext ast node astnode node iter import rewrite context importrewritecontext import rewrite context importrewritecontext context sensitive import rewrite context contextsensitiveimportrewritecontext node context importer node method invocation methodinvocation method invocation methodinvocation inv method invocation methodinvocation node rewriter inv method invocation methodinvocation expression property create receiver createreceiver rewriter context i method binding imethodbinding inv get name getname resolve binding resolvebinding import rewrite context importrewritecontext node class instance creation classinstancecreation class instance creation classinstancecreation inst class instance creation classinstancecreation node rewriter inst class instance creation classinstancecreation expression property create receiver createreceiver rewriter context inst resolve constructor binding resolveconstructorbinding import rewrite context importrewritecontext node this expression thisexpression rewriter replace node rewriter create string placeholder createstringplaceholder context receiver ast node astnode method invocation node field access fieldaccess field access fieldaccess access field access fieldaccess node rewriter access field access fieldaccess expression property create receiver createreceiver rewriter context access resolve field binding resolvefieldbinding import rewrite context importrewritecontext node simple name simplename simple name simplename node resolve binding resolvebinding i variable binding ivariablebinding i variable binding ivariablebinding i variable binding ivariablebinding simple name simplename node resolve binding resolvebinding is field isfield expression receiver create receiver createreceiver rewriter context import rewrite context importrewritecontext receiver field access fieldaccess access node getast new field access newfieldaccess ast node astnode target rewriter create move target createmovetarget node access set name setname simple name simplename target access set expression setexpression receiver rewriter replace node access update type references updatetypereferences ast rewrite astrewrite rewriter call context callcontext context import rewrite importrewrite importer context importer iterator simple name simplename iter f analyzer fanalyzer get types to import gettypestoimport iterator iter has next hasnext element iter i type binding itypebinding binding ast nodes astnodes get type binding gettypebinding element binding binding is local islocal vector integer vector integer binding is parameterized type isparameterizedtype binding binding get type declaration gettypedeclaration string importer add import addimport binding ast nodes astnodes as string asstring element equals rewriter replace element rewriter create string placeholder createstringplaceholder ast node astnode simple update static references updatestaticreferences ast rewrite astrewrite rewriter call context callcontext context import rewrite importrewrite importer context importer iterator simple name simplename iter f analyzer fanalyzer get statics to import getstaticstoimport iterator iter has next hasnext element iter i binding ibinding binding element resolve binding resolvebinding binding string importer add static import addstaticimport binding ast nodes astnodes as string asstring element equals rewriter replace element rewriter create string placeholder createstringplaceholder ast node astnode simple expression create receiver createreceiver ast rewrite astrewrite rewriter call context callcontext context i method binding imethodbinding method import rewrite context importrewritecontext import rewrite context importrewritecontext string receiver get receiver getreceiver context method get modifiers getmodifiers import rewrite context importrewritecontext receiver expression rewriter create string placeholder createstringplaceholder receiver ast node astnode method invocation expression create receiver createreceiver ast rewrite astrewrite rewriter call context callcontext context i variable binding ivariablebinding field import rewrite context importrewritecontext import rewrite context importrewritecontext string receiver get receiver getreceiver context field get modifiers getmodifiers import rewrite context importrewritecontext receiver expression rewriter create string placeholder createstringplaceholder receiver ast node astnode simple string get receiver getreceiver call context callcontext context modifiers import rewrite context importrewritecontext import rewrite context importrewritecontext string receiver context receiver i type binding itypebinding invocation type invocationtype ast nodes astnodes get enclosing type getenclosingtype context invocation i type binding itypebinding source type sourcetype f declaration fdeclaration resolve binding resolvebinding get declaring class getdeclaringclass context receiver is static receiverisstatic modifier is static isstatic modifiers nls equals receiver invocation type invocationtype bindings equals invocation type invocationtype source type sourcetype receiver receiver context importer add import addimport source type sourcetype import rewrite context importrewritecontext receiver update type variables updatetypevariables ast rewrite astrewrite rewriter call context callcontext context i type binding itypebinding type context get receiver type getreceivertype type rewrite references rewritereferences rewriter type get type arguments gettypearguments f analyzer fanalyzer get type parameter references gettypeparameterreferences update method type variable updatemethodtypevariable ast rewrite astrewrite rewriter call context callcontext context i method binding imethodbinding method invocations resolve binding resolvebinding context invocation method rewrite references rewritereferences rewriter method get type arguments gettypearguments f analyzer fanalyzer get method type parameter references getmethodtypeparameterreferences rewrite references rewritereferences ast rewrite astrewrite rewriter i type binding itypebinding type arguments typearguments list name data namedata type parameter references typeparameterreferences type arguments typearguments length is true istrue type arguments typearguments length type parameter references typeparameterreferences size type arguments typearguments length source analyzer sourceanalyzer name data namedata ref data refdata type parameter references typeparameterreferences list simple name simplename references ref data refdata references string new name newname type arguments typearguments get name getname iterator simple name simplename iter references iterator iter has next hasnext simple name simplename iter rewriter replace rewriter create string placeholder createstringplaceholder new name newname ast node astnode simple ast node astnode get last statement getlaststatement list statement statements f declaration fdeclaration get body getbody statements statements is empty isempty statements statements size list i region iregion get return statement ranges getreturnstatementranges f marker mode fmarkermode statement mode list i region iregion result array list arraylist list statement statements f declaration fdeclaration get body getbody statements size statements size size result result add create range createrange statements size result list i region iregion get statement ranges getstatementranges f marker mode fmarkermode statement mode list i region iregion result array list arraylist list statement statements f declaration fdeclaration get body getbody statements size statements size size result result add create range createrange statements size result list i region iregion get expression ranges getexpressionranges f marker mode fmarkermode expression mode list i region iregion result array list arraylist list statement statements f declaration fdeclaration get body getbody statements return statement returnstatement size statements size ast node astnode node size result node statements node get node type getnodetype ast node astnode statement return statement returnstatement node result add create range createrange node node node statements size node get node type getnodetype ast node astnode statement result add create range createrange statements size return statement returnstatement node result add create range createrange statements size expression exp get expression getexpression result add create range createrange exp exp result i region iregion create range createrange list statement statements ast node astnode statements ast node astnode statements create range createrange i region iregion create range createrange ast node astnode ast node astnode ast node astnode root get root getroot root compilation unit compilationunit compilation unit compilationunit unit compilation unit compilationunit root start unit get extended start position getextendedstartposition length unit get extended start position getextendedstartposition start unit get extended length getextendedlength i region iregion range region start length range start get start position getstartposition length get start position getstartposition start get length getlength i region iregion range region start length range string get blocks getblocks range marker rangemarker markers bad location exception badlocationexception string result string markers length markers length range marker rangemarker marker markers string content f document fdocument marker get offset getoffset marker get length getlength string lines strings convert into lines convertintolines content strings trim indentation trimindentation lines f type root ftyperoot get java project getjavaproject f marker mode fmarkermode statement mode lines length is single control statement without block issinglecontrolstatementwithoutblock lines code formatter util codeformatterutil create indent string createindentstring f type root ftyperoot get java project getjavaproject lines result strings concatenate lines text utilities textutilities get default line delimiter getdefaultlinedelimiter f document fdocument result is single control statement without block issinglecontrolstatementwithoutblock list statement statements f declaration fdeclaration get body getbody statements size statements size size statement statement statements size node type nodetype statement get node type getnodetype node type nodetype ast node astnode statement if statement ifstatement if statement ifstatement if statement ifstatement statement if statement ifstatement get then statement getthenstatement block if statement ifstatement get else statement getelsestatement block node type nodetype ast node astnode statement for statement forstatement statement get body getbody block node type nodetype ast node astnode statement while statement whilestatement statement get body getbody block