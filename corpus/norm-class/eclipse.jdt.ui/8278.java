copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation lars vogel lars vogel gmail templates content assist ctrl space starting letter templates https bugs eclipse org lukas hanke hanke yatta templates content assist content assist loop member variables https bugs eclipse org nicolaj hoess nicohoess gmail internal methods accessible postfix code completion plug https bugs eclipse org org eclipse jdt internal corext template java java lang reflect invocation target exception invocationtargetexception java util array list arraylist java util arrays java util comparator java util hash map hashmap java util hash set hashset java util iterator java util map java util org eclipse swt widgets shell org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime i status istatus org eclipse core runtime null progress monitor nullprogressmonitor org eclipse core runtime status org eclipse jface dialogs message dialog messagedialog org eclipse jface preference i preference store ipreferencestore org eclipse jface text bad location exception badlocationexception org eclipse jface text bad position category exception badpositioncategoryexception org eclipse jface text default position updater defaultpositionupdater org eclipse jface text document org eclipse jface text i document idocument org eclipse jface text i position updater ipositionupdater org eclipse jface text i region iregion org eclipse jface text position org eclipse jface text text utilities textutilities org eclipse jface text templates template org eclipse jface text templates template buffer templatebuffer org eclipse jface text templates template context type templatecontexttype org eclipse jface text templates template exception templateexception org eclipse jface text templates template translator templatetranslator org eclipse jface text templates template variable templatevariable org eclipse jface text templates template variable type templatevariabletype org eclipse jdt core flags org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i field ifield org eclipse jdt core i java element ijavaelement org eclipse jdt core i java project ijavaproject org eclipse jdt core i method imethod org eclipse jdt core i type itype org eclipse jdt core java core javacore org eclipse jdt core java model exception javamodelexception org eclipse jdt core naming conventions namingconventions org eclipse jdt core signature org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom simple name simplename org eclipse jdt core dom rewrite import rewrite importrewrite org eclipse jdt core dom rewrite import rewrite importrewrite import rewrite context importrewritecontext org eclipse jdt core search i java search constants ijavasearchconstants org eclipse jdt core search i java search scope ijavasearchscope org eclipse jdt core search search engine searchengine org eclipse jdt core search search pattern searchpattern org eclipse jdt core search type name match typenamematch org eclipse jdt internal corext code manipulation codemanipulation context sensitive import rewrite context contextsensitiveimportrewritecontext org eclipse jdt internal corext code manipulation codemanipulation stub utility stubutility org eclipse jdt internal corext template java compilation unit completion compilationunitcompletion variable org eclipse jdt internal corext util java model util javamodelutil org eclipse jdt internal corext util strings org eclipse jdt internal corext util type name match collector typenamematchcollector org eclipse jdt javaui org eclipse jdt preference constants preferenceconstants org eclipse jdt sharedastprovider org eclipse jdt internal java plugin javaplugin org eclipse jdt internal text correction ast res olving astresolving org eclipse jdt internal text correction similar elements requestor similarelementsrequestor org eclipse jdt internal text template contentassist multi variable multivariable org eclipse jdt internal text template contentassist multi variable guess multivariableguess org eclipse jdt internal util exception handler exceptionhandler context java source java context javacontext compilation unit context compilationunitcontext code completion req uester requester guessing local variable names compilation unit completion compilationunitcompletion f completion fcompletion list local names string f used names fusednames hash set hashset map string multi variable multivariable f variables fvariables hash map hashmap import rewrite importrewrite f import rewrite fimportrewrite string f compatible context type ids fcompatiblecontexttypeids creates java template context param type context type param document document param completion offset completionoffset completion offset document param completion length completionlength completion length param compilation unit compilationunit compilation unit code code java context javacontext template context type templatecontexttype type i document idocument document completion offset completionoffset completion length completionlength i compilation unit icompilationunit compilation unit compilationunit type document completion offset completionoffset completion length completionlength compilation unit compilationunit creates java template context param type context type param document document param completion position completionposition position defining completion offset length param compilation unit compilationunit compilation unit code code java context javacontext template context type templatecontexttype type i document idocument document position completion position completionposition i compilation unit icompilationunit compilation unit compilationunit type document completion position completionposition compilation unit compilationunit adds context type compatible context process templates context type param context type id contexttypeid context type accept add compatible context type addcompatiblecontexttype string context type id contexttypeid f compatible context type ids fcompatiblecontexttypeids f compatible context type ids fcompatiblecontexttypeids hash set hashset f compatible context type ids fcompatiblecontexttypeids add context type id contexttypeid returns indentation level position code completion indentation level position code completion get indentation getindentation start get start getstart i document idocument document get document getdocument i region iregion region document get line information of offset getlineinformationofoffset start string line content linecontent document region get offset getoffset region get length getlength i java project ijavaproject project get java project getjavaproject strings compute indent units computeindentunits line content linecontent project bad location exception badlocationexception template context templatecontext evaluate template template override template buffer templatebuffer evaluate template template bad location exception badlocationexception template exception templateexception clear can evaluate canevaluate template template exception templateexception java template messages javatemplatemessages context error evaluate template translator templatetranslator translator template translator templatetranslator override template variable templatevariable create variable createvariable template variable type templatevariabletype type string offsets template variable resolver templatevariableresolver resolver get context type getcontexttype get resolver getresolver type get name getname resolver create variable createvariable multi variable multivariable variable java variable javavariable type offsets f variables fvariables variable variable template buffer templatebuffer buffer translator translate template get context type getcontexttype resolve buffer rewrite imports rewriteimports i preference store ipreferencestore prefs java plugin javaplugin get default getdefault get preference store getpreferencestore use code formatter usecodeformatter prefs get boolean getboolean preference constants preferenceconstants templates code formatter codeformatter i java project ijavaproject project get java project getjavaproject java formatter javaformatter formatter java formatter javaformatter text utilities textutilities get default line delimiter getdefaultlinedelimiter get document getdocument get indentation getindentation use code formatter usecodeformatter project formatter format buffer clear buffer clear f used names fusednames clear f import rewrite fimportrewrite template context templatecontext can evaluate canevaluate template templates override can evaluate canevaluate template template has compatible context type hascompatiblecontexttype template f force evaluation fforceevaluation string key get key getkey to lower case tolowercase key length is after dot isafterdot string template name templatename template get name getname to lower case tolowercase java core javacore enabled equals java core javacore get option getoption java core javacore codeassist substring match template name templatename key template name templatename starts with startswith key is after dot isafterdot i document idocument document get document getdocument offset get completion offset getcompletionoffset document offset char at charat bad location exception badlocationexception has compatible context type hascompatiblecontexttype template template string key get key getkey template matches key get context type getcontexttype get id getid f compatible context type ids fcompatiblecontexttypeids iterator string iter f compatible context type ids fcompatiblecontexttypeids iterator iter has next hasnext template matches key iter document template context documenttemplatecontext get completion position getcompletionposition override get start getstart f is managed fismanaged get completion length getcompletionlength get start getstart i document idocument document get document getdocument start get completion offset getcompletionoffset get completion offset getcompletionoffset get completion length getcompletionlength start character is unicode identifier part isunicodeidentifierpart document get char getchar start start start character is whitespace iswhitespace document get char getchar start start start start get completion offset getcompletionoffset start bad location exception badlocationexception get start getstart org eclipse jdt internal corext template document template context documenttemplatecontext get end getend override get end getend f is managed fismanaged get completion length getcompletionlength get end getend i document idocument document get document getdocument start get completion offset getcompletionoffset get completion offset getcompletionoffset get completion length getcompletionlength start character is whitespace iswhitespace document get char getchar bad location exception badlocationexception get end getend org eclipse jdt internal corext template document template context documenttemplatecontext get key getkey override string get key getkey get completion length getcompletionlength get key getkey i document idocument document get document getdocument start get start getstart get completion offset getcompletionoffset start document start start nls bad location exception badlocationexception get key getkey returns character start position completion character start position completion get character before start getcharacterbeforestart start get start getstart start get document getdocument get char getchar start bad location exception badlocationexception handle exception handleexception shell shell exception string title java template messages javatemplatemessages java context javacontext error title core exception coreexception exception handler exceptionhandler handle core exception coreexception shell title invocation target exception invocationtargetexception exception handler exceptionhandler handle invocation target exception invocationtargetexception shell title java plugin javaplugin log string message get message getmessage message message java template messages javatemplatemessages java context javacontext unexpected error message message dialog messagedialog open error openerror shell title message compilation unit completion compilationunitcompletion get completion getcompletion i compilation unit icompilationunit compilation unit compilationunit get compilation unit getcompilationunit f completion fcompletion f completion fcompletion compilation unit completion compilationunitcompletion compilation unit compilationunit compilation unit compilationunit compilation unit compilationunit code complete codecomplete get start getstart f completion fcompletion java model exception javamodelexception f completion fcompletion returns names arrays current link compilation unit compilationunit scope names local arrays current link compilation unit compilationunit scope variable get arrays getarrays variable arrays get completion getcompletion find arrays in current scope findarraysincurrentscope arrange arrays arrays sorts variables param variables variables sort arrange variable variables arrays sort variables comparator variable override compare variable variable rank rank rank variable f used names fusednames get name getname returns names local variables matching code type code param type type variables names local variables matching code type code variable get local variables getlocalvariables string type variable local variables localvariables get completion getcompletion find local variables findlocalvariables type arrange local variables localvariables local variables localvariables returns names fields matching code type code param type type fields names fields matching code type code variable get fields getfields string type variable fields get completion getcompletion find field variables findfieldvariables type arrange fields fields returns names iter ables iterables arrays current link compilation unit compilationunit scope names iter ables iterables arrays current link compilation unit compilationunit scope variable get iter ables getiterables variable iter ables iterables get completion getcompletion find iter ables in current scope finditerablesincurrentscope arrange iter ables iterables iter ables iterables mark as used markasused string f used names fusednames add string suggest variable names suggestvariablenames string type illegal argument exception illegalargumentexception string excludes compute excludes computeexcludes todo erasure arrays string result suggest variable name suggestvariablename type excludes result string compute excludes computeexcludes string excludes get completion getcompletion get local variable names getlocalvariablenames f used names fusednames is empty isempty string all excludes allexcludes string f used names fusednames size excludes length system arraycopy excludes all excludes allexcludes excludes length system arraycopy f used names fusednames to array toarray all excludes allexcludes f used names fusednames size excludes all excludes allexcludes excludes string suggest variable name suggestvariablename string type string excludes illegal argument exception illegalargumentexception dim nls type ends with endswith dim type type substring type length i java project ijavaproject project get java project getjavaproject project stub utility stubutility get variable name suggestions getvariablenamesuggestions naming conventions namingconventions local project type dim arrays as list aslist excludes fallback lack proper context roll lower casing lowercasing string signature get simple name getsimplename type to lower case tolowercase adds type type code type code returns string reference type param type fully qualified type returns type type binding assigned returned type unqualified fully qualified conflict prev ented prevented string add import addimport string type is read only isreadonly type i compilation unit icompilationunit get compilation unit getcompilationunit type qualified type index of indexof qualified i java search scope ijavasearchscope search scope searchscope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement get java project getjavaproject simple name simplename name node namenode type name match typenamematch matches find all types findalltypes type search scope searchscope name node namenode add single match matches length type type matches get fully qualified name getfullyqualifiedname compilation unit compilationunit root getastroot f import rewrite fimportrewrite root f import rewrite fimportrewrite stub utility stubutility create import rewrite createimportrewrite f import rewrite fimportrewrite stub utility stubutility create import rewrite createimportrewrite root import rewrite context importrewritecontext context root context context context sensitive import rewrite context contextsensitiveimportrewritecontext root get completion offset getcompletionoffset f import rewrite fimportrewrite f import rewrite fimportrewrite add import addimport type context java model exception javamodelexception handle exception handleexception type adds member code qualified member name qualifiedmembername code member field method members type param qualified member name qualifiedmembername fully qualified member qualified type suffix returns simple member successful qualified string add static import addstaticimport string qualified member name qualifiedmembername is read only isreadonly qualified member name qualifiedmembername i compilation unit icompilationunit get compilation unit getcompilationunit qualified member name qualifiedmembername member offset memberoffset qualified member name qualifiedmembername last index of lastindexof member offset memberoffset qualified member name qualifiedmembername string type name typename qualified member name qualifiedmembername substring member offset memberoffset string member name membername qualified member name qualifiedmembername substring member offset memberoffset qualified member name qualifiedmembername length is field isfield nls equals member name membername is field isfield i java project ijavaproject java project javaproject get java project getjavaproject i type itype type java project javaproject find type findtype type name typename type qualified member name qualifiedmembername i field ifield field type get field getfield member name membername field exists is field isfield has method hasmethod type member name membername is field isfield qualified member name qualifiedmembername compilation unit compilationunit root getastroot f import rewrite fimportrewrite root f import rewrite fimportrewrite stub utility stubutility create import rewrite createimportrewrite f import rewrite fimportrewrite stub utility stubutility create import rewrite createimportrewrite root import rewrite context importrewritecontext context root context context context sensitive import rewrite context contextsensitiveimportrewritecontext root get completion offset getcompletionoffset f import rewrite fimportrewrite f import rewrite fimportrewrite add static import addstaticimport type name typename member name membername is field isfield context java model exception javamodelexception handle exception handleexception type name typename code type code method code code param type type inspect param method search method java model exception javamodelexception methods retrieved has method hasmethod i type itype type string java model exception javamodelexception i method imethod methods type get methods getmethods methods length equals methods get element name getelementname rewrite imports rewriteimports f import rewrite fimportrewrite is read only isreadonly i compilation unit icompilationunit get compilation unit getcompilationunit position position position get completion offset getcompletionoffset i document idocument document get document getdocument nls string category template position importer system current time millis currenttimemillis i position updater ipositionupdater update r updater default position updater defaultpositionupdater category document add position category addpositioncategory category document add position updater addpositionupdater update r updater document add position addposition position java model util javamodelutil apply edit applyedit f import rewrite fimportrewrite rewrite imports rewriteimports set completion offset setcompletionoffset position get offset getoffset core exception coreexception handle exception handleexception document remove position removeposition position document remove position updater removepositionupdater update r updater document remove position category removepositioncategory category bad location exception badlocationexception handle exception handleexception bad position category exception badpositioncategoryexception handle exception handleexception compilation unit compilationunit getastroot i compilation unit icompilationunit compilation unit compilationunit sharedastprovider getast compilation unit compilationunit sharedastprovider wait null progress monitor nullprogressmonitor finds type simple add imports operation addimportsoperation type name match typenamematch find all types findalltypes string simple type name simpletypename i java search scope ijavasearchscope search scope searchscope simple name simplename name node namenode i progress monitor iprogressmonitor monitor i compilation unit icompilationunit java model exception javamodelexception or higher orhigher java model util javamodelutil or higher orhigher get java project getjavaproject type kinds typekinds similar elements requestor similarelementsrequestor types name node namenode type kinds typekinds ast res olving astresolving get possible type kinds getpossibletypekinds name node namenode or higher orhigher array list arraylist type name match typenamematch type infos typeinfos array list arraylist type name match collector typenamematchcollector requestor type name match collector typenamematchcollector type infos typeinfos search engine searchengine search all type names searchalltypenames simple type name simpletypename to char array tochararray search pattern searchpattern exact match search pattern searchpattern sensitive get search for constant getsearchforconstant type kinds typekinds search scope searchscope requestor i java search constants ijavasearchconstants force search monitor array list arraylist type name match typenamematch type refs found typerefsfound array list arraylist type infos typeinfos size len type infos typeinfos size len type name match typenamematch curr type infos typeinfos imports curr get package name getpackagename length is of kind isofkind curr type kinds typekinds or higher orhigher is visible isvisible curr type refs found typerefsfound add curr type refs found typerefsfound to array toarray type name match typenamematch type refs found typerefsfound size get search for constant getsearchforconstant type kinds typekinds classes similar elements requestor similarelementsrequestor classes interfaces similar elements requestor similarelementsrequestor interfaces enums similar elements requestor similarelementsrequestor enums annotations similar elements requestor similarelementsrequestor annotations type kinds typekinds classes interfaces enums annotations classes i java search constants ijavasearchconstants interfaces i java search constants ijavasearchconstants enums i java search constants ijavasearchconstants enum annotations i java search constants ijavasearchconstants annotation type classes interfaces i java search constants ijavasearchconstants classes enums i java search constants ijavasearchconstants enum i java search constants ijavasearchconstants type is of kind isofkind type name match typenamematch curr type kinds typekinds or higher orhigher flags curr get modifiers getmodifiers flags is annotation isannotation flags or higher orhigher type kinds typekinds similar elements requestor similarelementsrequestor annotations flags is enum isenum flags or higher orhigher type kinds typekinds similar elements requestor similarelementsrequestor enums flags is interface isinterface flags type kinds typekinds similar elements requestor similarelementsrequestor interfaces type kinds typekinds similar elements requestor similarelementsrequestor classes is visible isvisible type name match typenamematch curr i compilation unit icompilationunit flags curr get modifiers getmodifiers flags is private isprivate flags flags is public ispublic flags flags is protected isprotected flags curr get package name getpackagename equals get parent getparent get element name getelementname eval uates evaluates java template context compilation unit param template template eval uated evaluated param compilation unit compilationunit compilation unit evaluate template param position position compilation unit evaluate template eval uated evaluated template core exception coreexception template unknown context type bad location exception badlocationexception position invalid compilation unit template exception templateexception evaluation fails string evaluate template evaluatetemplate template template i compilation unit icompilationunit compilation unit compilationunit position core exception coreexception bad location exception badlocationexception template exception templateexception template context type templatecontexttype context type contexttype java plugin javaplugin get default getdefault get template context registry gettemplatecontextregistry get context type getcontexttype template get context type id getcontexttypeid context type contexttype compilation unit context type compilationunitcontexttype core exception coreexception status i status istatus error javaui plugin i status istatus error java template messages javatemplatemessages java context javacontext error message i document idocument document document compilation unit compilationunit compilation unit compilationunit exists document compilation unit compilationunit get source getsource compilation unit context compilationunitcontext context compilation unit context type compilationunitcontexttype context type contexttype create context createcontext document position compilation unit compilationunit context set force evaluation setforceevaluation template buffer templatebuffer buffer context evaluate template buffer buffer get string getstring template variable templatevariable get template variable gettemplatevariable string template variable templatevariable variable f variables fvariables variable variable is resolved isresolved get context type getcontexttype resolve variable variable adds multi variable guess dependency param master master variable code slave code updated code master code param slave dependent variable add dependency adddependency multi variable multivariable master multi variable multivariable slave multi variable guess multivariableguess guess get multi variable guess getmultivariableguess guess guess multi variable guess multivariableguess set multi variable guess setmultivariableguess guess guess add dependency adddependency master slave