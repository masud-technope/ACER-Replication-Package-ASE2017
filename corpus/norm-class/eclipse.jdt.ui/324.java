copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal corext refactoring structure java util array list arraylist java util arrays java util collection java util list org eclipse core runtime org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime sub progress monitor subprogressmonitor org eclipse core resources i resource iresource org eclipse ltk core refactoring refactoring status refactoringstatus org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i method imethod org eclipse jdt core i type itype org eclipse jdt core i type hierarchy itypehierarchy org eclipse jdt core java model exception javamodelexception org eclipse jdt core working copy owner workingcopyowner org eclipse jdt core dom ast node astnode org eclipse jdt core dom abstract type declaration abstracttypedeclaration org eclipse jdt core dom block org eclipse jdt core dom class instance creation classinstancecreation org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom method declaration methoddeclaration org eclipse jdt core dom parameterized type parameterizedtype org eclipse jdt core dom statement org eclipse jdt core dom super constructor invocation superconstructorinvocation org eclipse jdt core dom type org eclipse jdt core search i java search constants ijavasearchconstants org eclipse jdt core search i java search scope ijavasearchscope org eclipse jdt core search search engine searchengine org eclipse jdt core search search match searchmatch org eclipse jdt core search search pattern searchpattern org eclipse jdt internal corext dom ast nodes astnodes org eclipse jdt internal corext refactoring refactoring scope factory refactoringscopefactory org eclipse jdt internal corext refactoring refactoring search engine refactoringsearchengine org eclipse jdt internal corext refactoring search result group searchresultgroup org eclipse jdt internal corext refactoring util java element util javaelementutil org eclipse jdt internal corext refactoring util refactoringastparser org eclipse jdt internal corext util jdt flags jdtflags org eclipse jdt internal corext util search utils searchutils org eclipse jdt internal java editor javaeditor ast provider astprovider find references constructors constructor reference finder constructorreferencefinder i type itype f type ftype i method imethod f constructors fconstructors constructor reference finder constructorreferencefinder i type itype type java model exception javamodelexception f constructors fconstructors java element util javaelementutil get all constructors getallconstructors type f type ftype type constructor reference finder constructorreferencefinder i method imethod constructor f constructors fconstructors i method imethod constructor f type ftype constructor get declaring type getdeclaringtype search result group searchresultgroup get constructor references getconstructorreferences i type itype type i progress monitor iprogressmonitor refactoring status refactoringstatus status java model exception javamodelexception constructor reference finder constructorreferencefinder type get constructor references getconstructorreferences i java search constants ijavasearchconstants references status search result group searchresultgroup get constructor references getconstructorreferences i type itype type working copy owner workingcopyowner owner i progress monitor iprogressmonitor refactoring status refactoringstatus status java model exception javamodelexception constructor reference finder constructorreferencefinder type get constructor references getconstructorreferences owner i java search constants ijavasearchconstants references status search result group searchresultgroup get constructor occurrences getconstructoroccurrences i method imethod constructor i progress monitor iprogressmonitor refactoring status refactoringstatus status java model exception javamodelexception is true istrue constructor is constructor isconstructor constructor reference finder constructorreferencefinder constructor get constructor references getconstructorreferences i java search constants ijavasearchconstants occurrences status search result group searchresultgroup get constructor references getconstructorreferences i progress monitor iprogressmonitor working copy owner workingcopyowner owner limit to limitto refactoring status refactoringstatus status java model exception javamodelexception i java search scope ijavasearchscope scope create search scope createsearchscope search pattern searchpattern pattern refactoring search engine refactoringsearchengine create or pattern createorpattern f constructors fconstructors limit to limitto pattern f constructors fconstructors length search result group searchresultgroup get implicit constructor references getimplicitconstructorreferences owner status remove unreal references removeunrealreferences refactoring search engine refactoringsearchengine search pattern owner scope status xxx method work around workaround jdt core bug search result group searchresultgroup remove unreal references removeunrealreferences search result group searchresultgroup groups list search result group searchresultgroup result array list arraylist groups length groups length search result group searchresultgroup group groups i compilation unit icompilationunit group get compilation unit getcompilationunit compilation unit compilationunit cu node cunode refactoringastparser ast provider astprovider shared ast level parse search match searchmatch all search results allsearchresults group get search results getsearchresults list search match searchmatch real constructor references realconstructorreferences array list arraylist arrays as list aslist all search results allsearchresults all search results allsearchresults length search match searchmatch search result searchresult all search results allsearchresults is real constructor reference node isrealconstructorreferencenode ast node search util astnodesearchutil get ast node getastnode search result searchresult cu node cunode real constructor references realconstructorreferences remove search result searchresult real constructor references realconstructorreferences is empty isempty result add search result group searchresultgroup group get resource getresource real constructor references realconstructorreferences to array toarray search match searchmatch real constructor references realconstructorreferences size result to array toarray search result group searchresultgroup result size xxx method work around workaround jdt core bug is real constructor reference node isrealconstructorreferencenode ast node astnode node string type name typename f constructors fconstructors get declaring type getdeclaringtype get element name getelementname node get parent getparent abstract type declaration abstracttypedeclaration abstract type declaration abstracttypedeclaration node get parent getparent get name property getnameproperty equals node get location in parent getlocationinparent reference node get parent getparent method declaration methoddeclaration method declaration methoddeclaration property equals node get location in parent getlocationinparent method declaration methoddeclaration method declaration methoddeclaration node get parent getparent is constructor isconstructor get name getname get identifier getidentifier equals type name typename reference i java search scope ijavasearchscope create search scope createsearchscope java model exception javamodelexception f constructors fconstructors length refactoring scope factory refactoringscopefactory create f type ftype refactoring scope factory refactoringscopefactory create get most visible constructor getmostvisibleconstructor i method imethod get most visible constructor getmostvisibleconstructor java model exception javamodelexception is true istrue f constructors fconstructors length i method imethod candidate f constructors fconstructors visibility jdt flags jdtflags get visibility code getvisibilitycode f constructors fconstructors f constructors fconstructors length i method imethod constructor f constructors fconstructors jdt flags jdtflags is higher visibility ishighervisibility jdt flags jdtflags get visibility code getvisibilitycode constructor visibility candidate constructor candidate search result group searchresultgroup get implicit constructor references getimplicitconstructorreferences i progress monitor iprogressmonitor working copy owner workingcopyowner owner refactoring status refactoringstatus status java model exception javamodelexception nls begin task begintask list search match searchmatch search matches searchmatches array list arraylist search matches searchmatches add all addall get implicit constructor references from hierarchy getimplicitconstructorreferencesfromhierarchy owner sub progress monitor subprogressmonitor search matches searchmatches add all addall get implicit constructor references in class creations getimplicitconstructorreferencesinclasscreations owner sub progress monitor subprogressmonitor status refactoring search engine refactoringsearchengine group by cu groupbycu search matches searchmatches to array toarray search match searchmatch search matches searchmatches size status list search results searchresults list search match searchmatch get implicit constructor references in class creations getimplicitconstructorreferencesinclasscreations working copy owner workingcopyowner owner i progress monitor iprogressmonitor refactoring status refactoringstatus status java model exception javamodelexception xxx work around workaround jdt core bug search pattern searchpattern pattern search pattern searchpattern create pattern createpattern f type ftype i java search constants ijavasearchconstants references search utils searchutils generics agnostic match rule i java search scope ijavasearchscope scope refactoring scope factory refactoringscopefactory create f type ftype search result group searchresultgroup refactoring search engine refactoringsearchengine search pattern owner scope status list search match searchmatch result array list arraylist length search result group searchresultgroup group i compilation unit icompilationunit group get compilation unit getcompilationunit compilation unit compilationunit cu node cunode refactoringastparser ast provider astprovider shared ast level parse search match searchmatch group get search results getsearchresults length search match searchmatch search result searchresult ast node astnode node ast node search util astnodesearchutil get ast node getastnode search result searchresult cu node cunode is implicit constructor reference node in class creations isimplicitconstructorreferencenodeinclasscreations node result add search result searchresult result is implicit constructor reference node in class creations isimplicitconstructorreferencenodeinclasscreations ast node astnode node node type ast node astnode parent node get parent getparent parent class instance creation classinstancecreation node equals class instance creation classinstancecreation parent get type gettype parent parameterized type parameterizedtype ast node astnode grand parent grandparent parent get parent getparent grand parent grandparent class instance creation classinstancecreation parameterized type parameterizedtype type parameterized type parameterizedtype class instance creation classinstancecreation grand parent grandparent get type gettype node equals type get type gettype list search results searchresults list search match searchmatch get implicit constructor references from hierarchy getimplicitconstructorreferencesfromhierarchy working copy owner workingcopyowner owner i progress monitor iprogressmonitor java model exception javamodelexception i type itype sub types subtypes get non binary subtypes getnonbinarysubtypes owner f type ftype list search match searchmatch result array list arraylist sub types subtypes length sub types subtypes length result add all addall get all super constructor invocations getallsuperconstructorinvocations sub types subtypes result i type itype get non binary subtypes getnonbinarysubtypes working copy owner workingcopyowner owner i type itype type i progress monitor iprogressmonitor monitor java model exception javamodelexception i type hierarchy itypehierarchy hierarchy owner hierarchy type new type hierarchy newtypehierarchy monitor hierarchy type new supertype hierarchy newsupertypehierarchy owner monitor i type itype sub types subtypes hierarchy get all subtypes getallsubtypes type list i type itype result array list arraylist sub types subtypes length sub types subtypes length sub types subtypes is binary isbinary result add sub types subtypes result to array toarray i type itype result size collection search results searchresults collection search match searchmatch get all super constructor invocations getallsuperconstructorinvocations i type itype type java model exception javamodelexception i method imethod constructors java element util javaelementutil get all constructors getallconstructors type compilation unit compilationunit cu node cunode refactoringastparser ast provider astprovider shared ast level parse type get compilation unit getcompilationunit list search match searchmatch result array list arraylist constructors length constructors length ast node astnode super call supercall get super constructor call node getsuperconstructorcallnode constructors cu node cunode super call supercall result add create search result createsearchresult super call supercall constructors result search match searchmatch create search result createsearchresult ast node astnode super call supercall i method imethod constructor start super call supercall get start position getstartposition todo inclusive ast nodes astnodes get inclusive end getinclusiveend super call supercall i resource iresource resource constructor get resource getresource search match searchmatch constructor search match searchmatch accurate start start search engine searchengine get default search participant getdefaultsearchparticipant resource super constructor invocation superconstructorinvocation get super constructor call node getsuperconstructorcallnode i method imethod constructor compilation unit compilationunit cu node cunode java model exception javamodelexception is true istrue constructor is constructor isconstructor method declaration methoddeclaration constructor node constructornode ast node search util astnodesearchutil get method declaration node getmethoddeclarationnode constructor cu node cunode is true istrue constructor node constructornode is constructor isconstructor block body constructor node constructornode get body getbody is not null isnotnull body list statement statements body statements statements is empty isempty statements super constructor invocation superconstructorinvocation super constructor invocation superconstructorinvocation statements