copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal debug core breakpoints java util array list arraylist java util list java util map java util stack org eclipse core resources i file ifile org eclipse core resources i marker imarker org eclipse core resources i resource iresource org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core runtime null progress monitor nullprogressmonitor org eclipse core runtime status org eclipse debug core model i breakpoint ibreakpoint org eclipse debug core model i breakpoint import participant ibreakpointimportparticipant org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core java core javacore org eclipse jdt core signature org eclipse jdt core dom ast org eclipse jdt core dom ast node astnode org eclipse jdt core dom ast parser astparser org eclipse jdt core dom ast visitor astvisitor org eclipse jdt core dom abstract type declaration abstracttypedeclaration org eclipse jdt core dom array type arraytype org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom enum declaration enumdeclaration org eclipse jdt core dom field declaration fielddeclaration org eclipse jdt core dom i type binding itypebinding org eclipse jdt core dom method declaration methoddeclaration org eclipse jdt core dom package declaration packagedeclaration org eclipse jdt core dom parameterized type parameterizedtype org eclipse jdt core dom simple name simplename org eclipse jdt core dom single variable declaration singlevariabledeclaration org eclipse jdt core dom type org eclipse jdt core dom type declaration typedeclaration org eclipse jdt core dom variable declaration fragment variabledeclarationfragment org eclipse jdt debug core i java watchpoint ijavawatchpoint implementation covering platform java breakpoints java breakpoint import participant javabreakpointimportparticipant i breakpoint import participant ibreakpointimportparticipant breakpoint verifier breakpointverifier ast visitor astvisitor type method field string f type name ftypename string f name fname string f signature fsignature i breakpoint ibreakpoint f breakpoint fbreakpoint compilation unit compilationunit f unit funit stack string f type name stack ftypenamestack constructor param breakpoint param unit breakpoint verifier breakpointverifier i breakpoint ibreakpoint breakpoint compilation unit compilationunit unit f type name ftypename get breakpoint type name getbreakpointtypename breakpoint f name fname get member name getmembername breakpoint f signature fsignature get member signature getmembersignature breakpoint f breakpoint fbreakpoint breakpoint f unit funit unit f type name stack ftypenamestack stack string returns link java breakpoint javabreakpoint type attribute breakpoint code code param breakpoint type attribute string get breakpoint type name getbreakpointtypename i breakpoint ibreakpoint breakpoint breakpoint get marker getmarker get attribute getattribute java breakpoint javabreakpoint type returns member breakpoint attributes link java watchpoint javawatchpoint field breakpoint watchpoint link java method breakpoint javamethodbreakpoint method breakpoint method method entry breakpoint code code member param breakpoint member code code string get member name getmembername i breakpoint ibreakpoint breakpoint breakpoint i java watchpoint ijavawatchpoint breakpoint get marker getmarker get attribute getattribute java watchpoint javawatchpoint field breakpoint get marker getmarker get attribute getattribute java method breakpoint javamethodbreakpoint method returns signature member defined link java method breakpoint javamethodbreakpoint method signature attribute code code param breakpoint signature member code code string get member signature getmembersignature i breakpoint ibreakpoint breakpoint breakpoint get marker getmarker get attribute getattribute java method breakpoint javamethodbreakpoint method signature returns fully qualified enclosing type node param node fully qualified enclosing type string get type name gettypename ast node astnode node get type name gettypename node string buffer stringbuffer constructs qualified enclosing parent type param node node parent param buffer buffer write fully qualified parent string get type name gettypename ast node astnode node string buffer stringbuffer buffer node get node type getnodetype ast node astnode compilation unit compilation unit compilationunit unit compilation unit compilationunit node package declaration packagedeclaration package declaration packagedeclaration unit get package getpackage package declaration packagedeclaration buffer insert buffer insert package declaration packagedeclaration get name getname get fully qualified name getfullyqualifiedname string value of valueof buffer node abstract type declaration abstracttypedeclaration abstract type declaration abstracttypedeclaration type declaration typedeclaration abstract type declaration abstracttypedeclaration node i type binding itypebinding binding type declaration typedeclaration resolve binding resolvebinding binding binding get binary name getbinaryname type declaration typedeclaration is package member type declaration ispackagemembertypedeclaration buffer insert type declaration typedeclaration get name getname get identifier getidentifier buffer insert type declaration typedeclaration get name getname get fully qualified name getfullyqualifiedname buffer insert get type name gettypename node get parent getparent buffer org eclipse jdt core dom ast visitor astvisitor visit org eclipse jdt core dom type declaration typedeclaration override visit type declaration typedeclaration node do type visit dotypevisit node org eclipse jdt core dom ast visitor astvisitor end visit endvisit org eclipse jdt core dom type declaration typedeclaration override end visit endvisit type declaration typedeclaration node do end type visit doendtypevisit org eclipse jdt core dom ast visitor astvisitor visit org eclipse jdt core dom enum declaration enumdeclaration override visit enum declaration enumdeclaration node do type visit dotypevisit node org eclipse jdt core dom ast visitor astvisitor end visit endvisit org eclipse jdt core dom enum declaration enumdeclaration override end visit endvisit enum declaration enumdeclaration node do end type visit doendtypevisit cleans type visit ended do end type visit doendtypevisit f type name stack ftypenamestack is empty isempty f type name stack ftypenamestack pop visits type node children visited param node child nodes visited do type visit dotypevisit abstract type declaration abstracttypedeclaration node simple name simplename node get name getname string typename get type name gettypename node f type name stack ftypenamestack push typename f type name ftypename starts with startswith typename exam ining examining wrong type process types f breakpoint fbreakpoint java class prepare breakpoint javaclasspreparebreakpoint typename equals f type name ftypename char start charstart get start position getstartposition i marker imarker marker f breakpoint fbreakpoint get marker getmarker marker set attribute setattribute i marker imarker start char start charstart marker set attribute setattribute i marker imarker char start charstart get length getlength core exception coreexception node visit children f type name ftypename index of indexof org eclipse jdt core dom ast visitor astvisitor visit org eclipse jdt core dom field declaration fielddeclaration override visit field declaration fielddeclaration node f type name ftypename equals f type name stack ftypenamestack peek list variable declaration fragment variabledeclarationfragment fragments node fragments simple name simplename i marker imarker marker f breakpoint fbreakpoint get marker getmarker current start currentstart marker get attribute getattribute i marker imarker start variable declaration fragment variabledeclarationfragment fragment fragments fragment get name getname get fully qualified name getfullyqualifiedname equals f name fname field update char start charstart char end charend char start charstart get start position getstartposition current start currentstart char start charstart marker set attribute setattribute i marker imarker start char start charstart marker set attribute setattribute i marker imarker char start charstart get length getlength core exception coreexception org eclipse jdt core dom ast visitor astvisitor visit org eclipse jdt core dom method declaration methoddeclaration override visit method declaration methoddeclaration node simple name simplename node get name getname string typename f type name stack ftypenamestack peek f type name ftypename equals typename f type name ftypename starts with startswith typename get fully qualified name getfullyqualifiedname equals f name fname string sig get method signature from node getmethodsignaturefromnode node sig nls nls sig sig replace all replaceall sig equals f signature fsignature i marker imarker marker f breakpoint fbreakpoint get marker getmarker current start currentstart marker get attribute getattribute i marker imarker start char start charstart get start position getstartposition current start currentstart char start charstart marker set attribute setattribute i marker imarker start char start charstart marker set attribute setattribute i marker imarker char start charstart get length getlength core exception coreexception local type f breakpoint fbreakpoint java class prepare breakpoint javaclasspreparebreakpoint creates method signature link method declaration methoddeclaration param node signature method node code code string get method signature from node getmethodsignaturefromnode method declaration methoddeclaration node is not null isnotnull node list single variable declaration singlevariabledeclaration params node parameters list string rparams get parameters type names getparameterstypenames params rparams size params size node is constructor isconstructor type return type returntype node get return type getreturntype return type returntype string rtype get type signature gettypesignature return type returntype rtype signature create method signature createmethodsignature rparams to array toarray string rparams size rtype string buffer stringbuffer buffer string buffer stringbuffer nls buffer append nls init collect synthetic param collectsyntheticparam node rparams buffer append signature create method signature createmethodsignature rparams to array toarray string rparams size signature sig buffer to string tostring returns listing signatures parameters passed param raw params rawparams listing signatures parameters list string get parameters type names getparameterstypenames list single variable declaration singlevariabledeclaration raw params rawparams list string rparams array list arraylist string raw params rawparams size string pname single variable declaration singlevariabledeclaration param raw params rawparams pname get type signature gettypesignature param get type gettype pname rparams add pname rparams processes signature link type param type type process signature type code code derived string get type signature gettypesignature type type i type binding itypebinding binding type resolve binding resolvebinding binding type get node type getnodetype ast node astnode primitive type ast node astnode qualified type ast node astnode simple type signature create type signature createtypesignature binding get qualified name getqualifiedname ast node astnode array type array type arraytype array type arraytype type signature create array signature createarraysignature get type signature gettypesignature get element type getelementtype get dimensions getdimensions ast node astnode parameterized type base type get type signature gettypesignature parameterized type parameterizedtype type get type gettype collects synthetic parameter fully qualified enclosing context constructor type param method constructor declaration param rparams listing parameters add collect synthetic param collectsyntheticparam method declaration methoddeclaration method list string rparams is not null isnotnull method is in top level type isintopleveltype method ast node astnode parent method get parent getparent string buffer stringbuffer string buffer stringbuffer parent parent parent get parent getparent parent abstract type declaration abstracttypedeclaration abstract type declaration abstracttypedeclaration type abstract type declaration abstracttypedeclaration parent insert type get name getname get fully qualified name getfullyqualifiedname type is member type declaration ismembertypedeclaration insert parent compilation unit compilationunit compilation unit compilationunit cunit compilation unit compilationunit parent package declaration packagedeclaration pde c pdec cunit get package getpackage pde c pdec insert insert cunit get package getpackage get name getname get fully qualified name getfullyqualifiedname nls insert append length rparams add to string tostring determines link method declaration methoddeclaration top level type param method is in top level type isintopleveltype method declaration methoddeclaration method type declaration typedeclaration type type declaration typedeclaration method get parent getparent type type is package member type declaration ispackagemembertypedeclaration javadoc org eclipse debug core model i breakpoint import participant ibreakpointimportparticipant matches java util map org eclipse debug core model i breakpoint ibreakpoint override matches map string object attributes i breakpoint ibreakpoint breakpoint core exception coreexception attributes breakpoint nls string type string attributes type type breakpoint get marker getmarker get type gettype equals type breakpoint java class prepare breakpoint javaclasspreparebreakpoint matches class breakpoint matchesclassbreakpoint attributes java class prepare breakpoint javaclasspreparebreakpoint breakpoint breakpoint java exception breakpoint javaexceptionbreakpoint matches exception breakpoint matchesexceptionbreakpoint attributes java exception breakpoint javaexceptionbreakpoint breakpoint breakpoint java method breakpoint javamethodbreakpoint matches method breakpoint matchesmethodbreakpoint attributes java method breakpoint javamethodbreakpoint breakpoint breakpoint java method entry breakpoint javamethodentrybreakpoint matches method entry breakpoint matchesmethodentrybreakpoint attributes java method entry breakpoint javamethodentrybreakpoint breakpoint breakpoint java watchpoint javawatchpoint matches watchpoint matcheswatchpoint attributes java watchpoint javawatchpoint breakpoint breakpoint java stratum line breakpoint javastratumlinebreakpoint matches stratum line breakpoint matchesstratumlinebreakpoint attributes java stratum line breakpoint javastratumlinebreakpoint breakpoint breakpoint java pattern breakpoint javapatternbreakpoint matches pattern breakpoint matchespatternbreakpoint attributes java pattern breakpoint javapatternbreakpoint breakpoint breakpoint java target pattern breakpoint javatargetpatternbreakpoint matches target pattern breakpoint matchestargetpatternbreakpoint attributes java target pattern breakpoint javatargetpatternbreakpoint breakpoint breakpoint java line breakpoint javalinebreakpoint matches line breakpoint matcheslinebreakpoint attributes java line breakpoint javalinebreakpoint breakpoint javadoc org eclipse debug core model i breakpoint import participant ibreakpointimportparticipant verify org eclipse debug core model i breakpoint ibreakpoint override verify i breakpoint ibreakpoint breakpoint core exception coreexception i resource iresource resource breakpoint get marker getmarker get resource getresource compilation unit compilationunit unit resource resource get type gettype i resource iresource file i compilation unit icompilationunit cunit java core javacore create compilation unit from createcompilationunitfrom i file ifile resource cunit ast parser astparser parser ast parser astparser new parser newparser ast jls parser set source setsource cunit parser set resolve bindings setresolvebindings unit compilation unit compilationunit parser createast null progress monitor nullprogressmonitor unit breakpoint java class prepare breakpoint javaclasspreparebreakpoint breakpoint java watchpoint javawatchpoint breakpoint java method entry breakpoint javamethodentrybreakpoint breakpoint java method breakpoint javamethodbreakpoint unit accept breakpoint verifier breakpointverifier breakpoint unit breakpoint java line breakpoint javalinebreakpoint java line breakpoint javalinebreakpoint java line breakpoint javalinebreakpoint breakpoint breakpoint valid breakpoint location locator validbreakpointlocationlocator place current line currentline get line number getlinenumber valid breakpoint location locator validbreakpointlocationlocator locator valid breakpoint location locator validbreakpointlocationlocator unit current line currentline unit accept locator new line newline locator get line location getlinelocation locator get location type getlocationtype valid breakpoint location locator validbreakpointlocationlocator location current line currentline new line newline get marker getmarker set attribute setattribute java breakpoint javabreakpoint type locator get fully qualified type name getfullyqualifiedtypename get marker getmarker set attribute setattribute i marker imarker number new line newline length get char end getcharend get char start getcharstart pos unit get position getposition new line newline get marker getmarker set attribute setattribute i marker imarker start pos get marker getmarker set attribute setattribute i marker imarker pos length rid core exception coreexception status cancel status comp ares compares attributes code code safe param attr attribute param attr attribute attributes equal attributes code code considered equal attributes equal attributesequal object attr object attr attr attr attr equals attr returns map attributes matches breakpoint param attributes param breakpoint attributes match breakpoints attributes core exception coreexception matches line breakpoint matcheslinebreakpoint map string object attributes java line breakpoint javalinebreakpoint breakpoint core exception coreexception integer integer attributes i marker imarker number breakpoint get line number getlinenumber int value intvalue attributes equal attributesequal breakpoint get type name gettypename attributes java breakpoint javabreakpoint type returns map attributes matches prepare breakpoint param attributes param breakpoint attributes match breakpoints attributes core exception coreexception matches class breakpoint matchesclassbreakpoint map string object attributes java class prepare breakpoint javaclasspreparebreakpoint breakpoint core exception coreexception integer type integer attributes java class prepare breakpoint javaclasspreparebreakpoint member type attributes equal attributesequal breakpoint get type name gettypename attributes java breakpoint javabreakpoint type breakpoint get member type getmembertype type type int value intvalue returns map attributes matches exception breakpoint param attributes param breakpoint attributes match breakpoints attributes core exception coreexception matches exception breakpoint matchesexceptionbreakpoint map string object attributes java exception breakpoint javaexceptionbreakpoint breakpoint core exception coreexception attributes equal attributesequal breakpoint get type name gettypename attributes java breakpoint javabreakpoint type returns map attributes matches method breakpoint param attributes param breakpoint attributes match breakpoints attributes core exception coreexception matches method breakpoint matchesmethodbreakpoint map string object attributes java method breakpoint javamethodbreakpoint breakpoint core exception coreexception attributes equal attributesequal breakpoint get type name gettypename attributes java breakpoint javabreakpoint type attributes equal attributesequal breakpoint get method name getmethodname attributes java method breakpoint javamethodbreakpoint method attributes equal attributesequal breakpoint get method signature getmethodsignature attributes java method breakpoint javamethodbreakpoint method signature returns map attributes matches method entry breakpoint param attributes param breakpoint attributes match breakpoints attributes core exception coreexception matches method entry breakpoint matchesmethodentrybreakpoint map string object attributes java method entry breakpoint javamethodentrybreakpoint breakpoint core exception coreexception attributes equal attributesequal breakpoint get type name gettypename attributes java breakpoint javabreakpoint type attributes equal attributesequal breakpoint get method name getmethodname attributes java method breakpoint javamethodbreakpoint method attributes equal attributesequal breakpoint get method signature getmethodsignature attributes java method breakpoint javamethodbreakpoint method signature returns map attributes matches watchpoint param attributes param breakpoint attributes match watchpoints attributes core exception coreexception matches watchpoint matcheswatchpoint map string object attributes java watchpoint javawatchpoint watchpoint core exception coreexception watchpoint get field name getfieldname equals attributes java watchpoint javawatchpoint field attributes equal attributesequal watchpoint get type name gettypename attributes java breakpoint javabreakpoint type returns map attributes matches stratum breakpoint param attributes param breakpoint attributes match breakpoints attributes core exception coreexception matches stratum line breakpoint matchesstratumlinebreakpoint map string object attributes java stratum line breakpoint javastratumlinebreakpoint breakpoint core exception coreexception integer integer attributes i marker imarker number breakpoint get line number getlinenumber int value intvalue attributes equal attributesequal breakpoint get source name getsourcename attributes java line breakpoint javalinebreakpoint source attributes equal attributesequal breakpoint get stratum getstratum attributes java stratum line breakpoint javastratumlinebreakpoint stratum attributes equal attributesequal breakpoint get source path getsourcepath attributes java stratum line breakpoint javastratumlinebreakpoint source path returns map attributes matches pattern breakpoint param attributes param breakpoint attributes match breakpoints attributes core exception coreexception matches pattern breakpoint matchespatternbreakpoint map string object attributes java pattern breakpoint javapatternbreakpoint breakpoint core exception coreexception integer integer attributes i marker imarker number breakpoint get line number getlinenumber int value intvalue attributes equal attributesequal breakpoint get source name getsourcename attributes java line breakpoint javalinebreakpoint source tdod comparing pattern res trictive restrictive breakpoint get pattern getpattern equals attributes java pattern breakpoint javapatternbreakpoint pattern returns map attributes matches target pattern breakpoint param attributes param breakpoint attributes match breakpoints attributes core exception coreexception matches target pattern breakpoint matchestargetpatternbreakpoint map string object attributes java target pattern breakpoint javatargetpatternbreakpoint breakpoint core exception coreexception integer integer attributes i marker imarker number breakpoint get line number getlinenumber int value intvalue attributes equal attributesequal breakpoint get type name gettypename attributes java breakpoint javabreakpoint type attributes equal attributesequal breakpoint get source name getsourcename attributes java line breakpoint javalinebreakpoint source