copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation mateusz wenus mateusz wenus gmail override method generate declaration order code generation https bugs eclipse org bugs bug cgi stephan herrmann contribution bug override method generating method override create redundant annotations org eclipse jdt internal corext code manipulation codemanipulation java util array list arraylist java util arrays java util list org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime null progress monitor nullprogressmonitor org eclipse core runtime sub progress monitor subprogressmonitor org eclipse core runtime jobs i scheduling rule ischedulingrule org eclipse core resources i workspace runnable iworkspacerunnable org eclipse core resources resources plugin resourcesplugin org eclipse text edits multi text edit multitextedit org eclipse text edits text edit textedit org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core dom ast org eclipse jdt core dom ast node astnode org eclipse jdt core dom abstract type declaration abstracttypedeclaration org eclipse jdt core dom anonymous class declaration anonymousclassdeclaration org eclipse jdt core dom child list property descriptor childlistpropertydescriptor org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom i method binding imethodbinding org eclipse jdt core dom i type binding itypebinding org eclipse jdt core dom method declaration methoddeclaration org eclipse jdt core dom rewrite ast rewrite astrewrite org eclipse jdt core dom rewrite import rewrite importrewrite org eclipse jdt core dom rewrite import rewrite importrewrite import rewrite context importrewritecontext org eclipse jdt core dom rewrite list rewrite listrewrite org eclipse jdt internal corext util java model util javamodelutil org eclipse jdt internal corext util methods source position comparator methodssourcepositioncomparator org eclipse jdt internal preferences java preferences settings javapreferencessettings workspace runnable add unimplemented methods add unimplemented methods operation addunimplementedmethodsoperation i workspace runnable iworkspacerunnable edit applied f apply fapply qualified names generated imports string f created imports fcreatedimports method binding method generated list string f created methods fcreatedmethods array list arraylist edits applied f imports fimports insertion point code code f insert pos finsertpos method bindings implement i method binding imethodbinding f methods to implement fmethodstoimplement compilation unit content saved f save fsave comments created f do create comments fdocreatecomments type declaration add methods i type binding itypebinding f type ftype compilation unit ast node compilation unit compilationunit fastroot creates add unimplemented methods operation param ast root astroot compilation unit ast node param type type add methods param methods to implement methodstoimplement method bindings implement code code implement unimplemented methods param insert pos insertpos insertion point code code param imports code code edits applied code code param apply code code edit applied code code param save code code changed compilation unit saved code code add unimplemented methods operation addunimplementedmethodsoperation compilation unit compilationunit ast root astroot i type binding itypebinding type i method binding imethodbinding methods to implement methodstoimplement insert pos insertpos imports apply save ast root astroot ast root astroot get java element getjavaelement i compilation unit icompilationunit nls illegal argument exception illegalargumentexception ast created i compilation unit icompilationunit type nls illegal argument exception illegalargumentexception type ast node astnode node ast root astroot find declaring node finddeclaringnode type node anonymous class declaration anonymousclassdeclaration node abstract type declaration abstracttypedeclaration nls illegal argument exception illegalargumentexception type map type declaration ast f type ftype type f insert pos finsertpos insert pos insertpos fastroot ast root astroot f methods to implement fmethodstoimplement methods to implement methodstoimplement f save fsave save f apply fapply apply f imports fimports imports f do create comments fdocreatecomments stub utility stubutility do add comments doaddcomments ast root astroot get java element getjavaelement get java project getjavaproject set create comments setcreatecomments create comments createcomments f do create comments fdocreatecomments create comments createcomments returns qualified names generated imports generated imports string get created imports getcreatedimports f created imports fcreatedimports f created imports fcreatedimports string returns method binding method generated method binding string get created methods getcreatedmethods string string f created methods fcreatedmethods size f created methods fcreatedmethods to array toarray returns scheduling rule operation scheduling rule i scheduling rule ischedulingrule get scheduling rule getschedulingrule resources plugin resourcesplugin get workspace getworkspace get root getroot org eclipse core resources i workspace runnable iworkspacerunnable org eclipse core runtime i progress monitor iprogressmonitor override i progress monitor iprogressmonitor monitor core exception coreexception monitor monitor null progress monitor nullprogressmonitor nls monitor begin task begintask monitor set task name settaskname code generation messages codegenerationmessages add unimplemented methods operation addunimplementedmethodsoperation description f created methods fcreatedmethods clear i compilation unit icompilationunit i compilation unit icompilationunit fastroot get java element getjavaelement ast ast fastroot getast ast rewrite astrewrite ast rewrite astrewrite ast rewrite astrewrite create ast import rewrite importrewrite import rewrite importrewrite stub utility stubutility create import rewrite createimportrewrite fastroot i type binding itypebinding curr type binding currtypebinding f type ftype list rewrite listrewrite member rewriter memberrewriter ast node astnode node fastroot find declaring node finddeclaringnode curr type binding currtypebinding node anonymous class declaration anonymousclassdeclaration member rewriter memberrewriter ast rewrite astrewrite get list rewrite getlistrewrite node anonymous class declaration anonymousclassdeclaration body declarations property node abstract type declaration abstracttypedeclaration child list property descriptor childlistpropertydescriptor property abstract type declaration abstracttypedeclaration node get body declarations property getbodydeclarationsproperty member rewriter memberrewriter ast rewrite astrewrite get list rewrite getlistrewrite node property illegal argument exception illegalargumentexception checked constructor code generation settings codegenerationsettings settings java preferences settings javapreferencessettings get code generation settings getcodegenerationsettings get java project getjavaproject settings create comments createcomments f do create comments fdocreatecomments ast node astnode insertion get node to insert before getnodetoinsertbefore member rewriter memberrewriter i method binding imethodbinding methods to implement methodstoimplement f methods to implement fmethodstoimplement methods to implement methodstoimplement methods to implement methodstoimplement stub utility stubutility get unimplemented methods getunimplementedmethods curr type binding currtypebinding arrays sort methods to implement methodstoimplement methods source position comparator methodssourcepositioncomparator f type ftype import rewrite context importrewritecontext context insertion position insertionposition f insert pos finsertpos insertion position insertionposition fastroot types size abstract type declaration abstracttypedeclaration first type decl firsttypedecl abstract type declaration abstracttypedeclaration fastroot types insertion position insertionposition first type decl firsttypedecl get start position getstartposition insertion position insertionposition context context sensitive import rewrite context contextsensitiveimportrewritecontext fastroot insertion position insertionposition import rewrite importrewrite methods to implement methodstoimplement length i method binding imethodbinding curr methods to implement methodstoimplement method declaration methoddeclaration stub stub utility stubutility create implementation stub createimplementationstub ast rewrite astrewrite import rewrite importrewrite context curr curr type binding currtypebinding settings curr type binding currtypebinding is interface isinterface curr type binding currtypebinding stub f created methods fcreatedmethods add curr get key getkey insertion member rewriter memberrewriter insert before insertbefore stub insertion member rewriter memberrewriter insert last insertlast stub multi text edit multitextedit edit multi text edit multitextedit text edit textedit import edits importedits import rewrite importrewrite rewrite imports rewriteimports sub progress monitor subprogressmonitor monitor f created imports fcreatedimports import rewrite importrewrite get created imports getcreatedimports f imports fimports edit add child addchild import edits importedits edit add child addchild ast rewrite astrewrite rewriteast f apply fapply java model util javamodelutil apply edit applyedit edit f save fsave sub progress monitor subprogressmonitor monitor monitor ast node astnode get node to insert before getnodetoinsertbefore list rewrite listrewrite rewriter f insert pos finsertpos list members rewriter get original list getoriginallist members size ast node astnode curr ast node astnode members curr get start position getstartposition f insert pos finsertpos curr