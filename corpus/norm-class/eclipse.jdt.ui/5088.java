copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal corext code manipulation codemanipulation java util array list arraylist java util arrays java util collection java util collections java util hash map hashmap java util hash set hashset java util iterator java util list java util map java util map entry java util org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime null progress monitor nullprogressmonitor org eclipse core runtime operation canceled exception operationcanceledexception org eclipse core runtime sub progress monitor subprogressmonitor org eclipse core runtime jobs i scheduling rule ischedulingrule org eclipse core resources i workspace runnable iworkspacerunnable org eclipse text edits text edit textedit org eclipse jdt core flags org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i java element ijavaelement org eclipse jdt core i java project ijavaproject org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i source range isourcerange org eclipse jdt core java core javacore org eclipse jdt core java model exception javamodelexception org eclipse jdt core source range sourcerange org eclipse jdt core compiler i problem iproblem org eclipse jdt core dom ast node astnode org eclipse jdt core dom abstract type declaration abstracttypedeclaration org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom i binding ibinding org eclipse jdt core dom i type binding itypebinding org eclipse jdt core dom import declaration importdeclaration org eclipse jdt core dom modifier org eclipse jdt core dom simple name simplename org eclipse jdt core dom type org eclipse jdt core dom rewrite import rewrite importrewrite org eclipse jdt core dom rewrite import rewrite importrewrite import rewrite context importrewritecontext org eclipse jdt core search i java search constants ijavasearchconstants org eclipse jdt core search i java search scope ijavasearchscope org eclipse jdt core search search engine searchengine org eclipse jdt core search type name match typenamematch org eclipse jdt internal corext dom ast nodes astnodes org eclipse jdt internal corext dom bindings org eclipse jdt internal corext dom scope analyzer scopeanalyzer org eclipse jdt internal corext util java model util javamodelutil org eclipse jdt internal corext util messages org eclipse jdt internal corext util strings org eclipse jdt internal corext util type name match collector typenamematchcollector org eclipse jdt sharedastprovider org eclipse jdt internal text correction ast res olving astresolving org eclipse jdt internal text correction problem location problemlocation org eclipse jdt internal text correction similar elements requestor similarelementsrequestor org eclipse jdt internal viewsupport basic element labels basicelementlabels organize imports operation organizeimportsoperation i workspace runnable iworkspacerunnable i choose import query ichooseimportquery selects imports list choices param open choices openchoices array type reference selected param ranges choice range type reference returns code code cancel operation selected imports type name match typenamematch choose imports chooseimports type name match typenamematch open choices openchoices i source range isourcerange ranges matches unresolvable declarations link i problem iproblem import not found importnotfound problems unresolved simple names simple single imports simple absence demand imports considers type imports simple names unresolved types imports simple names unresolved members href https bugs eclipse org bug unresolvable import matcher unresolvableimportmatcher unresolvable import matcher unresolvableimportmatcher for compilation unit forcompilationunit compilation unit compilationunit collection import declaration importdeclaration unresolvable imports unresolvableimports determine unresolvable imports determineunresolvableimports map string string type imports by simple name typeimportsbysimplename hash map hashmap map string string static imports by simple name staticimportsbysimplename hash map hashmap import declaration importdeclaration import declaration importdeclaration unresolvable imports unresolvableimports string qualified name qualifiedname import declaration importdeclaration is on demand isondemand nls import declaration importdeclaration get name getname get fully qualified name getfullyqualifiedname import declaration importdeclaration get name getname get fully qualified name getfullyqualifiedname string simple name simplename qualified name qualifiedname substring qualified name qualifiedname last index of lastindexof map string string imports by simple name importsbysimplename import declaration importdeclaration is static isstatic static imports by simple name staticimportsbysimplename type imports by simple name typeimportsbysimplename string imports with simple name importswithsimplename imports by simple name importsbysimplename simple name simplename imports with simple name importswithsimplename imports with simple name importswithsimplename hash set hashset imports by simple name importsbysimplename simple name simplename imports with simple name importswithsimplename imports with simple name importswithsimplename add qualified name qualifiedname unresolvable import matcher unresolvableimportmatcher type imports by simple name typeimportsbysimplename static imports by simple name staticimportsbysimplename collection import declaration importdeclaration determine unresolvable imports determineunresolvableimports compilation unit compilationunit collection import declaration importdeclaration unresolvable imports unresolvableimports array list arraylist imports size i problem iproblem problem get problems getproblems problem getid i problem iproblem import not found importnotfound import declaration importdeclaration problem atic import problematicimport get problem atic import getproblematicimport problem problem atic import problematicimport unresolvable imports unresolvableimports add problem atic import problematicimport unresolvable imports unresolvableimports import declaration importdeclaration get problem atic import getproblematicimport i problem iproblem problem compilation unit compilationunit ast node astnode covering node coveringnode problem location problemlocation problem get covering node getcoveringnode covering node coveringnode ast node astnode import node importnode ast nodes astnodes get parent getparent covering node coveringnode ast node astnode declaration import node importnode import declaration importdeclaration import declaration importdeclaration import node importnode map string string f type imports by simple name ftypeimportsbysimplename map string string f static imports by simple name fstaticimportsbysimplename unresolvable import matcher unresolvableimportmatcher map string string type imports by simple name typeimportsbysimplename map string string static imports by simple name staticimportsbysimplename f type imports by simple name ftypeimportsbysimplename type imports by simple name typeimportsbysimplename f static imports by simple name fstaticimportsbysimplename static imports by simple name staticimportsbysimplename string match imports matchimports is static isstatic string simple name simplename map string string imports by simple name importsbysimplename is static isstatic f static imports by simple name fstaticimportsbysimplename f type imports by simple name ftypeimportsbysimplename string matching single imports matchingsingleimports imports by simple name importsbysimplename simple name simplename matching single imports matchingsingleimports collections unmodifiable set unmodifiableset matching single imports matchingsingleimports nls string matching on demand imports matchingondemandimports imports by simple name importsbysimplename matching on demand imports matchingondemandimports collections unmodifiable set unmodifiableset matching on demand imports matchingondemandimports collections empty set emptyset string match type imports matchtypeimports string simple name simplename match imports matchimports simple name simplename string match static imports matchstaticimports string simple name simplename match imports matchimports simple name simplename type reference processor typereferenceprocessor unresolved type data unresolvedtypedata simple name simplename type kinds typekinds list type name match typenamematch found infos foundinfos unresolved type data unresolvedtypedata simple name simplename type kinds typekinds ast res olving astresolving get possible type kinds getpossibletypekinds found infos foundinfos array list arraylist add info addinfo type name match typenamematch info found infos foundinfos size type name match typenamematch curr found infos foundinfos curr get type container name gettypecontainername equals info get type container name gettypecontainername type found infos foundinfos add info string f old single imports foldsingleimports string f old demand imports folddemandimports string f implicit imports fimplicitimports import rewrite importrewrite f imp structure fimpstructure f do ignore lower case names fdoignorelowercasenames unresolvable import matcher unresolvableimportmatcher f unresolvable import matcher funresolvableimportmatcher i package fragment ipackagefragment f curr package fcurrpackage scope analyzer scopeanalyzer f analyzer fanalyzer f allow default package imports fallowdefaultpackageimports map string unresolved type data unresolvedtypedata f unresolved types funresolvedtypes string f imports added fimportsadded type name match typenamematch f open choices fopenchoices source range sourcerange f source ranges fsourceranges type reference processor typereferenceprocessor string old single imports oldsingleimports string old demand imports olddemandimports compilation unit compilationunit root import rewrite importrewrite imp structure impstructure ignore lower case names ignorelowercasenames unresolvable import matcher unresolvableimportmatcher unresolvable import matcher unresolvableimportmatcher f old single imports foldsingleimports old single imports oldsingleimports f old demand imports folddemandimports old demand imports olddemandimports f imp structure fimpstructure imp structure impstructure f do ignore lower case names fdoignorelowercasenames ignore lower case names ignorelowercasenames f unresolvable import matcher funresolvableimportmatcher unresolvable import matcher unresolvableimportmatcher i compilation unit icompilationunit imp structure impstructure get compilation unit getcompilationunit f implicit imports fimplicitimports hash set hashset nls f implicit imports fimplicitimports add nls f implicit imports fimplicitimports add java lang f implicit imports fimplicitimports add get parent getparent get element name getelementname f analyzer fanalyzer scope analyzer scopeanalyzer root f curr package fcurrpackage i package fragment ipackagefragment get parent getparent f allow default package imports fallowdefaultpackageimports get java project getjavaproject get option getoption java core javacore compiler source equals java core javacore version f imports added fimportsadded hash set hashset f unresolved types funresolvedtypes hash map hashmap needs import needsimport i type binding itypebinding type binding typebinding simple name simplename type binding typebinding is top level istoplevel type binding typebinding is member ismember type binding typebinding is recovered isrecovered imports anonymous local primitive types parameters types modifiers type binding typebinding get modifiers getmodifiers modifier is private isprivate modifiers imports priv ates privates required i type binding itypebinding curr type binding currtypebinding bindings get binding of parent type getbindingofparenttype curr type binding currtypebinding ast nodes astnodes get parent getparent ast node astnode declaration reference info java type modifier is public ispublic modifiers curr type binding currtypebinding get package getpackage get name getname equals type binding typebinding get package getpackage get name getname visible ast node astnode parent get parent getparent parent type parent parent get parent getparent parent abstract type declaration abstracttypedeclaration parent get parent getparent compilation unit compilationunit type binding typebinding is member ismember f analyzer fanalyzer is declared in scope isdeclaredinscope type binding typebinding scope analyzer scopeanalyzer types scope analyzer scopeanalyzer check visibility find type add structure param node add simple name simplename string type name typename get identifier getidentifier f imports added fimportsadded type name typename i binding ibinding binding resolve binding resolvebinding binding binding get kind getkind i binding ibinding type i type binding itypebinding type binding typebinding i type binding itypebinding binding type binding typebinding is array isarray type binding typebinding type binding typebinding get element type getelementtype type binding typebinding type binding typebinding get type declaration gettypedeclaration type binding typebinding is recovered isrecovered needs import needsimport type binding typebinding f imp structure fimpstructure add import addimport type binding typebinding f imports added fimportsadded add type name typename f do ignore lower case names fdoignorelowercasenames type name typename length type name typename char at charat strings is lower case islowercase character is letter isletter f imports added fimportsadded add type name typename f unresolved types funresolvedtypes type name typename unresolved type data unresolvedtypedata process i progress monitor iprogressmonitor monitor java model exception javamodelexception n unresolved nunresolved f unresolved types funresolvedtypes size n unresolved nunresolved all types alltypes n unresolved nunresolved iterator string iter f unresolved types funresolvedtypes key set keyset iterator iter has next hasnext all types alltypes iter to char array tochararray array list arraylist type name match typenamematch types found typesfound array list arraylist i java project ijavaproject project f curr package fcurrpackage get java project getjavaproject i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project type name match collector typenamematchcollector collector type name match collector typenamematchcollector types found typesfound search engine searchengine search all type names searchalltypenames all types alltypes scope collector i java search constants ijavasearchconstants wait ready search monitor or higher orhigher java model util javamodelutil or higher orhigher project types found typesfound size type name match typenamematch curr types found typesfound unresolved type data unresolvedtypedata data f unresolved types funresolvedtypes curr get simple type name getsimpletypename data is visible isvisible curr is of kind isofkind curr data type kinds typekinds or higher orhigher f allow default package imports fallowdefaultpackageimports curr get package name getpackagename length data add info addinfo curr entry string unresolved type data unresolvedtypedata entry f unresolved types funresolvedtypes entry set entryset result search entry get value getvalue found infos foundinfos size string matching unresolvable imports matchingunresolvableimports f unresolvable import matcher funresolvableimportmatcher match type imports matchtypeimports entry get key getkey matching unresolvable imports matchingunresolvableimports is empty isempty matching unresolvable rely provide type string string matching unresolvable imports matchingunresolvableimports f imp structure fimpstructure add import addimport string unresolvable context array list arraylist type name match typenamematch open choices openchoices array list arraylist n unresolved nunresolved array list arraylist source range sourcerange source ranges sourceranges array list arraylist n unresolved nunresolved iterator unresolved type data unresolvedtypedata iter f unresolved types funresolvedtypes values iterator iter has next hasnext unresolved type data unresolvedtypedata data iter type name match typenamematch open choice openchoice process type info processtypeinfo data found infos foundinfos open choice openchoice open choices openchoices add open choice openchoice source ranges sourceranges add source range sourcerange data get start position getstartposition data get length getlength open choices openchoices is empty isempty f open choices fopenchoices open choices openchoices to array toarray type name match typenamematch open choices openchoices size f source ranges fsourceranges source ranges sourceranges to array toarray source range sourcerange source ranges sourceranges size monitor type name match typenamematch process type info processtypeinfo list type name match typenamematch type refs found typerefsfound n found nfound type refs found typerefsfound size n found nfound n found nfound type name match typenamematch type ref typeref type refs found typerefsfound f imp structure fimpstructure add import addimport type ref typeref get fully qualified name getfullyqualifiedname string type to import typetoimport ambiguous imports ambiguousimports multiple imports find entry n found nfound type name match typenamematch type ref typeref type refs found typerefsfound string full name fullname type ref typeref get fully qualified name getfullyqualifiedname string container name containername type ref typeref get type container name gettypecontainername f old single imports foldsingleimports full name fullname single imported f imp structure fimpstructure add import addimport full name fullname f old demand imports folddemandimports container name containername f implicit imports fimplicitimports container name containername type to import typetoimport type to import typetoimport full name fullname demand ambiguous imports ambiguousimports type to import typetoimport ambiguous imports ambiguousimports f imp structure fimpstructure add import addimport type to import typetoimport open choices type refs found typerefsfound to array toarray type name match typenamematch n found nfound is of kind isofkind type name match typenamematch curr type kinds typekinds or higher orhigher flags curr get modifiers getmodifiers flags is annotation isannotation flags or higher orhigher type kinds typekinds similar elements requestor similarelementsrequestor annotations flags is enum isenum flags or higher orhigher type kinds typekinds similar elements requestor similarelementsrequestor enums flags is interface isinterface flags type kinds typekinds similar elements requestor similarelementsrequestor interfaces type kinds typekinds similar elements requestor similarelementsrequestor classes is visible isvisible type name match typenamematch curr flags curr get modifiers getmodifiers flags is private isprivate flags flags is public ispublic flags flags is protected isprotected flags curr get package name getpackagename equals f curr package fcurrpackage get element name getelementname type name match typenamematch get choices getchoices f open choices fopenchoices i source range isourcerange get choices source ranges getchoicessourceranges f source ranges fsourceranges ensure unresolvable imports don reduced demand imports import rewrite context importrewritecontext unresolvable context import rewrite context importrewritecontext override find in context findincontext string qualifier string kind res unknown explicit f do save fdosave f ignore lower case names fignorelowercasenames i choose import query ichooseimportquery f choose import query fchooseimportquery f number of imports added fnumberofimportsadded f number of imports removed fnumberofimportsremoved i problem iproblem f parsing error fparsingerror i compilation unit icompilationunit f compilation unit fcompilationunit compilation unit compilationunit fastroot f allow syntax errors fallowsyntaxerrors organize imports operation organizeimportsoperation i compilation unit icompilationunit compilation unit compilationunit ast root astroot ignore lower case names ignorelowercasenames save allow syntax errors allowsyntaxerrors i choose import query ichooseimportquery choose import query chooseimportquery f compilation unit fcompilationunit fastroot ast root astroot f do save fdosave save f ignore lower case names fignorelowercasenames ignore lower case names ignorelowercasenames f allow syntax errors fallowsyntaxerrors allow syntax errors allowsyntaxerrors f choose import query fchooseimportquery choose import query chooseimportquery f number of imports added fnumberofimportsadded f number of imports removed fnumberofimportsremoved f parsing error fparsingerror runs operation param monitor progress monitor core exception coreexception thrown operation failed operation canceled exception operationcanceledexception runtime error thrown operation can celed canceled override i progress monitor iprogressmonitor monitor core exception coreexception operation canceled exception operationcanceledexception monitor monitor null progress monitor nullprogressmonitor monitor begin task begintask messages format code generation messages codegenerationmessages organize imports operation organizeimportsoperation description basic element labels basicelementlabels get file name getfilename f compilation unit fcompilationunit text edit textedit edit create text edit createtextedit sub progress monitor subprogressmonitor monitor edit java model util javamodelutil apply edit applyedit f compilation unit fcompilationunit edit f do save fdosave sub progress monitor subprogressmonitor monitor monitor text edit textedit create text edit createtextedit i progress monitor iprogressmonitor monitor core exception coreexception operation canceled exception operationcanceledexception monitor monitor null progress monitor nullprogressmonitor f number of imports added fnumberofimportsadded f number of imports removed fnumberofimportsremoved monitor begin task begintask messages format code generation messages codegenerationmessages organize imports operation organizeimportsoperation description basic element labels basicelementlabels get file name getfilename f compilation unit fcompilationunit compilation unit compilationunit ast root astroot fastroot ast root astroot ast root astroot sharedastprovider getast f compilation unit fcompilationunit sharedastprovider wait sub progress monitor subprogressmonitor monitor monitor is canceled iscanceled operation canceled exception operationcanceledexception monitor worked import rewrite importrewrite imports rewrite importsrewrite stub utility stubutility create import rewrite createimportrewrite ast root astroot string old single imports oldsingleimports hash set hashset string old demand imports olddemandimports hash set hashset list simple name simplename type references typereferences array list arraylist list simple name simplename static references staticreferences array list arraylist collect references collectreferences ast root astroot type references typereferences static references staticreferences old single imports oldsingleimports old demand imports olddemandimports monitor worked unresolvable import matcher unresolvableimportmatcher unresolvable import matcher unresolvableimportmatcher unresolvable import matcher unresolvableimportmatcher for compilation unit forcompilationunit ast root astroot type reference processor typereferenceprocessor processor type reference processor typereferenceprocessor old single imports oldsingleimports old demand imports olddemandimports ast root astroot imports rewrite importsrewrite f ignore lower case names fignorelowercasenames unresolvable import matcher unresolvableimportmatcher iterator simple name simplename ref iterator refiterator type references typereferences iterator ref iterator refiterator has next hasnext simple name simplename type ref typeref ref iterator refiterator processor add type ref typeref has open choices hasopenchoices processor process sub progress monitor subprogressmonitor monitor add static imports addstaticimports static references staticreferences imports rewrite importsrewrite unresolvable import matcher unresolvableimportmatcher has open choices hasopenchoices f choose import query fchooseimportquery type name match typenamematch choices processor get choices getchoices i source range isourcerange ranges processor get choices source ranges getchoicessourceranges type name match typenamematch chosen f choose import query fchooseimportquery choose imports chooseimports choices ranges chosen cancel pressed user operation canceled exception operationcanceledexception chosen length type name match typenamematch type info typeinfo chosen type info typeinfo imports rewrite importsrewrite add import addimport type info typeinfo get fully qualified name getfullyqualifiedname skipped user string type name typename choices get simple type name getsimpletypename string matching unresolvable imports matchingunresolvableimports unresolvable import matcher unresolvableimportmatcher match type imports matchtypeimports type name typename matching unresolvable imports matchingunresolvableimports is empty isempty matching unresolvable rely provide type string string matching unresolvable imports matchingunresolvableimports imports rewrite importsrewrite add import addimport string unresolvable context text edit textedit result imports rewrite importsrewrite rewrite imports rewriteimports sub progress monitor subprogressmonitor monitor determine import differences determineimportdifferences imports rewrite importsrewrite old single imports oldsingleimports old demand imports olddemandimports result monitor determine import differences determineimportdifferences import rewrite importrewrite imports structure importsstructure string old single imports oldsingleimports string old demand imports olddemandimports array list arraylist string imports added importsadded array list arraylist imports added importsadded add all addall arrays as list aslist imports structure importsstructure get created imports getcreatedimports imports added importsadded add all addall arrays as list aslist imports structure importsstructure get created static imports getcreatedstaticimports object content old single imports oldsingleimports to array toarray content length string import name importname string content imports added importsadded remove import name importname old single imports oldsingleimports remove import name importname content old demand imports olddemandimports to array toarray content length string import name importname string content nls imports added importsadded remove import name importname old demand imports olddemandimports remove import name importname f number of imports added fnumberofimportsadded imports added importsadded size f number of imports removed fnumberofimportsremoved old single imports oldsingleimports size old demand imports olddemandimports size add static imports addstaticimports collection simple name simplename static references staticreferences import rewrite importrewrite import rewrite importrewrite unresolvable import matcher unresolvableimportmatcher unresolvable import matcher unresolvableimportmatcher simple name simplename static references staticreferences i binding ibinding binding resolve binding resolvebinding binding import rewrite importrewrite add static import addstaticimport binding unresolvable reference member string identifier get identifier getidentifier string unresolvable imports unresolvableimports unresolvable import matcher unresolvableimportmatcher match static imports matchstaticimports identifier string unresolvable import unresolvableimport unresolvable imports unresolvableimports last dot index lastdotindex unresolvable import unresolvableimport last index of lastindexof skip invalid imports last dot index lastdotindex string declaring type name declaringtypename unresolvable import unresolvableimport substring last dot index lastdotindex string simple name simplename unresolvable import unresolvableimport substring last dot index lastdotindex ref ers refers field method unknown is field isfield import rewrite importrewrite add static import addstaticimport declaring type name declaringtypename simple name simplename is field isfield unresolvable context find type references compilation unit collect references collectreferences compilation unit compilationunit ast root astroot list simple name simplename type references typereferences list simple name simplename static references staticreferences string old single imports oldsingleimports string old demand imports olddemandimports f allow syntax errors fallowsyntaxerrors i problem iproblem problems ast root astroot get problems getproblems problems length i problem iproblem curr problems curr is error iserror curr getid i problem iproblem syntax f parsing error fparsingerror problems list import declaration importdeclaration imports ast root astroot imports imports size import declaration importdeclaration curr imports string ast res olving astresolving get full name getfullname curr get name getname curr is on demand isondemand old demand imports olddemandimports add old single imports oldsingleimports add i java project ijavaproject project f compilation unit fcompilationunit get java project getjavaproject import references collector importreferencescollector collect ast root astroot project type references typereferences static references staticreferences executing operation returns code code operation executed range parsing failed returns parse error i problem iproblem get parse error getparseerror f parsing error fparsingerror get number of imports added getnumberofimportsadded f number of imports added fnumberofimportsadded get number of imports removed getnumberofimportsremoved f number of imports removed fnumberofimportsremoved returns scheduling rule operation i scheduling rule ischedulingrule get schedule rule getschedulerule f compilation unit fcompilationunit get resource getresource