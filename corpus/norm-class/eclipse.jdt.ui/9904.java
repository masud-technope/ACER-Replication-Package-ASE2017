copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal search java util array list arraylist java util iterator java util list org eclipse jdt core dom ast node astnode org eclipse jdt core dom ast visitor astvisitor org eclipse jdt core dom anonymous class declaration anonymousclassdeclaration org eclipse jdt core dom block org eclipse jdt core dom cast expression castexpression org eclipse jdt core dom catch clause catchclause org eclipse jdt core dom class instance creation classinstancecreation org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom constructor invocation constructorinvocation org eclipse jdt core dom i method binding imethodbinding org eclipse jdt core dom i type binding itypebinding org eclipse jdt core dom javadoc org eclipse jdt core dom lambda expression lambdaexpression org eclipse jdt core dom method declaration methoddeclaration org eclipse jdt core dom method invocation methodinvocation org eclipse jdt core dom org eclipse jdt core dom node finder nodefinder org eclipse jdt core dom simple name simplename org eclipse jdt core dom single variable declaration singlevariabledeclaration org eclipse jdt core dom super constructor invocation superconstructorinvocation org eclipse jdt core dom super method invocation supermethodinvocation org eclipse jdt core dom tag element tagelement org eclipse jdt core dom throw statement throwstatement org eclipse jdt core dom try statement trystatement org eclipse jdt core dom type org eclipse jdt core dom type declaration statement typedeclarationstatement org eclipse jdt core dom union type uniontype org eclipse jdt core dom variable declaration expression variabledeclarationexpression org eclipse jdt core dom variable declaration fragment variabledeclarationfragment org eclipse jdt internal corext dom ast nodes astnodes org eclipse jdt internal corext dom bindings org eclipse jdt internal corext util messages org eclipse jdt internal text correction ast res olving astresolving org eclipse jdt internal viewsupport basic element labels basicelementlabels exception occurrences finder exceptionoccurrencesfinder ast visitor astvisitor i occurrences finder ioccurrencesfinder nls string exception occurrences finder exceptionoccurrencesfinder nls string exception is exception isexception compilation unit compilationunit fastroot ast node astnode f selected node fselectednode i type binding itypebinding f exception fexception ast node astnode f start fstart try statement trystatement f try statement ftrystatement list occurrence location occurrencelocation f result fresult string f description fdescription list i type binding itypebinding f caught exceptions fcaughtexceptions exception occurrences finder exceptionoccurrencesfinder f result fresult array list arraylist override string initialize compilation unit compilationunit root offset length initialize root node finder nodefinder perform root offset length override string initialize compilation unit compilationunit root ast node astnode node fastroot root node search messages searchmessages exception occurrences finder exceptionoccurrencesfinder exception node node ast nodes astnodes get top most name gettopmostname node node get location in parent getlocationinparent tag element tagelement fragments property method declaration methoddeclaration method ast res olving astresolving find parent method declaration findparentmethoddeclaration node method search messages searchmessages exception occurrences finder exceptionoccurrencesfinder exception javadoc tag tag element tagelement tag element tagelement tag element tagelement node get parent getparent string tag name tagname tag element tagelement get tag name gettagname node node tag element tagelement fragments tag element tagelement tag exception equals tag name tagname tag element tagelement tag equals tag name tagname f selected node fselectednode node f exception fexception node resolve type binding resolvetypebinding f start fstart method type type ast nodes astnodes get top most type gettopmosttype node type search messages searchmessages exception occurrences finder exceptionoccurrencesfinder exception method list type get location in parent getlocationinparent method declaration methoddeclaration thrown exception types property method declaration methoddeclaration method ast res olving astresolving find parent method declaration findparentmethoddeclaration node method search messages searchmessages exception occurrences finder exceptionoccurrencesfinder exception f selected node fselectednode type f exception fexception type resolve binding resolvebinding f start fstart method clause type top type toptype type type get location in parent getlocationinparent union type uniontype types property top type toptype type type get parent getparent top type toptype get location in parent getlocationinparent single variable declaration singlevariabledeclaration type property top type toptype get parent getparent get location in parent getlocationinparent catch clause catchclause exception property f selected node fselectednode type f exception fexception type resolve binding resolvebinding f try statement ftrystatement try statement trystatement top type toptype get parent getparent get parent getparent get parent getparent f start fstart f try statement ftrystatement get body getbody f exception fexception f start fstart search messages searchmessages exception occurrences finder exceptionoccurrencesfinder exception f description fdescription messages format search messages searchmessages exception occurrences finder exceptionoccurrencesfinder occurrence description basic element labels basicelementlabels get java element name getjavaelementname f exception fexception get name getname perform search performsearch f caught exceptions fcaughtexceptions array list arraylist f start fstart accept f try statement ftrystatement handle resource declarations handleresourcedeclarations f try statement ftrystatement f selected node fselectednode f result fresult add occurrence location occurrencelocation f selected node fselectednode get start position getstartposition f selected node fselectednode get length getlength exception declaration f description fdescription handle resource declarations handleresourcedeclarations try statement trystatement try statement trystatement list variable declaration expression variabledeclarationexpression resources try statement trystatement resources iterator variable declaration expression variabledeclarationexpression iterator resources iterator iterator has next hasnext iterator accept check exception thrown result resource close exit marked exitmarked variable declaration expression variabledeclarationexpression variable resources type type variable get type gettype nls i method binding imethodbinding method binding methodbinding bindings find method in hierarchy findmethodinhierarchy type resolve binding resolvebinding close i type binding itypebinding method binding methodbinding i type binding itypebinding exception types exceptiontypes method binding methodbinding get exception types getexceptiontypes exception types exceptiontypes length close caught exception matches exception types exceptiontypes mark resource variable declaration fragment variabledeclarationfragment fragment list variable declaration fragment variabledeclarationfragment variable fragments simple name simplename fragment get name getname f result fresult add occurrence location occurrencelocation get start position getstartposition get length getlength f description fdescription exit marked exitmarked mark exit position exit marked exitmarked block body try statement trystatement get body getbody closing bracket block offset body get start position getstartposition body get length getlength f result fresult add occurrence location occurrencelocation offset messages format search messages searchmessages exception occurrences finder exceptionoccurrencesfinder occurrence implicit close description basic element labels basicelementlabels get java element name getjavaelementname f exception fexception get name getname override occurrence location occurrencelocation get occurrences getoccurrences perform search performsearch f result fresult is empty isempty f result fresult to array toarray occurrence location occurrencelocation f result fresult size override get search kind getsearchkind exception occurrence override compilation unit compilationunit getastroot fastroot override string get job label getjoblabel search messages searchmessages exception occurrences finder exceptionoccurrencesfinder search for searchfor override string get element name getelementname f selected node fselectednode ast nodes astnodes as string asstring f selected node fselectednode override string get unformatted plural label getunformattedplurallabel search messages searchmessages exception occurrences finder exceptionoccurrencesfinder label plural override string get unformatted singular label getunformattedsingularlabel search messages searchmessages exception occurrences finder exceptionoccurrencesfinder label singular override visit anonymous class declaration anonymousclassdeclaration node override visit cast expression castexpression node nls java lang class cast exception classcastexception equals f exception fexception get qualified name getqualifiedname type type node get type gettype f result fresult add occurrence location occurrencelocation type get start position getstartposition type get length getlength f description fdescription visit node override visit class instance creation classinstancecreation node matches node resolve constructor binding resolveconstructorbinding type type node get type gettype f result fresult add occurrence location occurrencelocation type get start position getstartposition type get length getlength f description fdescription visit node override visit constructor invocation constructorinvocation node matches node resolve constructor binding resolveconstructorbinding mark f result fresult add occurrence location occurrencelocation node get start position getstartposition f description fdescription visit node override visit lambda expression lambdaexpression node override visit method declaration methoddeclaration node javadoc javadoc node get javadoc getjavadoc javadoc list tag element tagelement tags javadoc tags tag element tagelement tag tags string tag name tagname tag get tag name gettagname tag element tagelement tag exception equals tag name tagname tag element tagelement tag equals tag name tagname ast node astnode ast node astnode tag fragments f selected node fselectednode bindings equals f exception fexception resolve binding resolvebinding f result fresult add occurrence location occurrencelocation get start position getstartposition get length getlength f description fdescription list type thrown exception types thrownexceptiontypes node thrown exception types thrownexceptiontypes iterator type iter thrown exception types thrownexceptiontypes iterator iter has next hasnext type type iter type f selected node fselectednode bindings equals f exception fexception type resolve binding resolvebinding f result fresult add occurrence location occurrencelocation type get start position getstartposition type get length getlength f description fdescription block body node get body getbody body node get body getbody accept override visit method invocation methodinvocation node matches node resolve method binding resolvemethodbinding simple name simplename node get name getname f result fresult add occurrence location occurrencelocation get start position getstartposition get length getlength f description fdescription visit node override visit super constructor invocation superconstructorinvocation node matches node resolve constructor binding resolveconstructorbinding mark f result fresult add occurrence location occurrencelocation node get start position getstartposition f description fdescription visit node override visit super method invocation supermethodinvocation node matches node resolve method binding resolvemethodbinding simple name simplename node get name getname f result fresult add occurrence location occurrencelocation get start position getstartposition get length getlength f description fdescription visit node override visit throw statement throwstatement node matches node get expression getexpression resolve type binding resolvetypebinding mark f result fresult add occurrence location occurrencelocation node get start position getstartposition f description fdescription visit node override visit try statement trystatement node current size currentsize f caught exceptions fcaughtexceptions size list catch clause catchclause catch clauses catchclauses node catch clauses catchclauses iterator catch clause catchclause iter catch clauses catchclauses iterator iter has next hasnext type type iter get exception getexception get type gettype type union type uniontype list type types union type uniontype type types iterator type iterator types iterator iterator has next hasnext add caught exception addcaughtexception iterator add caught exception addcaughtexception type node get body getbody accept handle resource declarations handleresourcedeclarations node to remove toremove f caught exceptions fcaughtexceptions size current size currentsize to remove toremove f caught exceptions fcaughtexceptions remove current size currentsize visit iterator catch clause catchclause iter catch clauses catchclauses iterator iter has next hasnext iter accept node get finally getfinally node get finally getfinally accept visited body add caught exception addcaughtexception type type i type binding itypebinding type binding typebinding type resolve binding resolvebinding type binding typebinding f caught exceptions fcaughtexceptions add type binding typebinding override visit type declaration statement typedeclarationstatement node don div e dive local type declarations matches i method binding imethodbinding binding binding i type binding itypebinding exceptions binding get exception types getexceptiontypes exceptions length i type binding itypebinding exception exceptions matches exception matches i type binding itypebinding exception exception is caught iscaught exception exception bindings equals f exception fexception exception exception exception get superclass getsuperclass is caught iscaught i type binding itypebinding binding iterator i type binding itypebinding iter f caught exceptions fcaughtexceptions iterator iter has next hasnext i type binding itypebinding catch exception catchexception iter cat ches catches catch exception catchexception binding cat ches catches i type binding itypebinding catch type binding catchtypebinding i type binding itypebinding throw type binding throwtypebinding throw type binding throwtypebinding throw type binding throwtypebinding catch type binding catchtypebinding throw type binding throwtypebinding throw type binding throwtypebinding get superclass getsuperclass i occurrences finder ioccurrencesfinder get new instance getnewinstance exception occurrences finder exceptionoccurrencesfinder override string getid