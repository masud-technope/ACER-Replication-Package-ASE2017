copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal corext refactoring java util array list arraylist java util collection java util hash set hashset java util iterator java util list java util org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core runtime i path ipath org eclipse core resources i project iproject org eclipse jdt core i classpath entry iclasspathentry org eclipse jdt core i java element ijavaelement org eclipse jdt core i java project ijavaproject org eclipse jdt core i member imember org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt core java core javacore org eclipse jdt core java model exception javamodelexception org eclipse jdt core search i java search scope ijavasearchscope org eclipse jdt core search search engine searchengine org eclipse jdt internal corext util jdt flags jdtflags refactoring scope factory refactoringscopefactory adds code projects code i java project ijavaproject objects projects indirectly referencing focus param projects i java projects ijavaprojects add referencing projects addreferencingprojects i java project ijavaproject focus i java project ijavaproject projects java model exception javamodelexception i project iproject referencing projects referencingprojects focus get project getproject get referencing projects getreferencingprojects referencing projects referencingprojects length i java project ijavaproject candidate java core javacore create referencing projects referencingprojects candidate projects candidate candidate exists cycle i classpath entry iclasspathentry entry get referencing class path entry getreferencingclasspathentry candidate focus entry projects add candidate entry is exported isexported add referencing projects addreferencingprojects candidate projects add related referencing addrelatedreferencing i java project ijavaproject focus i java project ijavaproject projects core exception coreexception i project iproject referencing projects referencingprojects focus get project getproject get referencing projects getreferencingprojects referencing projects referencingprojects length i java project ijavaproject candidate java core javacore create referencing projects referencingprojects candidate projects candidate candidate exists cycle i classpath entry iclasspathentry entry get referencing class path entry getreferencingclasspathentry candidate focus entry projects add candidate entry is exported isexported add related referencing addrelatedreferencing candidate projects add related referenced addrelatedreferenced candidate projects add related referenced addrelatedreferenced i java project ijavaproject focus i java project ijavaproject projects core exception coreexception i project iproject referenced projects referencedprojects focus get project getproject get referenced projects getreferencedprojects referenced projects referencedprojects length i java project ijavaproject candidate java core javacore create referenced projects referencedprojects candidate projects candidate candidate exists cycle i classpath entry iclasspathentry entry get referencing class path entry getreferencingclasspathentry focus candidate entry projects add candidate entry is exported isexported add related referenced addrelatedreferenced candidate projects add related referencing addrelatedreferencing candidate projects creates search scope compilation units referencing code java element javaelement code visibility element references source param java element javaelement java element search scope java model exception javamodelexception error occurs i java search scope ijavasearchscope create i java element ijavaelement java element javaelement java model exception javamodelexception refactoring scope factory refactoringscopefactory create java element javaelement creates search scope compilation units referencing code java element javaelement code references source param java element javaelement java element param consider visibility considervisibility visibility java element javaelement iff code code search scope java model exception javamodelexception error occurs i java search scope ijavasearchscope create i java element ijavaelement java element javaelement consider visibility considervisibility java model exception javamodelexception refactoring scope factory refactoringscopefactory create java element javaelement consider visibility considervisibility creates search scope compilation units referencing code java element javaelement code param java element javaelement java element param consider visibility considervisibility visibility java element javaelement iff code code param source references only sourcereferencesonly references source references binary search scope java model exception javamodelexception error occurs i java search scope ijavasearchscope create i java element ijavaelement java element javaelement consider visibility considervisibility source references only sourcereferencesonly java model exception javamodelexception consider visibility considervisibility java element javaelement i member imember i member imember member i member imember java element javaelement jdt flags jdtflags is private isprivate member member get compilation unit getcompilationunit search engine searchengine create java search scope createjavasearchscope i java element ijavaelement member get compilation unit getcompilationunit search engine searchengine create java search scope createjavasearchscope i java element ijavaelement member removed code opt imizations optimizations visible members problem fragment source folder project treat visible members members i java project ijavaproject java project javaproject java element javaelement get java project getjavaproject search engine searchengine create java search scope createjavasearchscope get all scope elements getallscopeelements java project javaproject source references only sourcereferencesonly creates search scope comp rising comprising code members code param members members search scope java model exception javamodelexception error occurs i java search scope ijavasearchscope create i member imember members java model exception javamodelexception create members creates search scope comp rising comprising code members code param members members param source references only sourcereferencesonly references source references binary search scope java model exception javamodelexception error occurs i java search scope ijavasearchscope create i member imember members source references only sourcereferencesonly java model exception javamodelexception is true istrue members members length i member imember candidate members visibility get visibility getvisibility candidate members length get visibility getvisibility members visibility visibility candidate members create candidate source references only sourcereferencesonly creates search scope projects referenced code java elements javaelements code param java elements javaelements java elements search scope i java search scope ijavasearchscope create referenced scope createreferencedscope i java element ijavaelement java elements javaelements i java project ijavaproject projects hash set hashset java elements javaelements length projects add java elements javaelements get java project getjavaproject i java project ijavaproject prj projects to array toarray i java project ijavaproject projects size search engine searchengine create java search scope createjavasearchscope prj creates search scope projects referenced code java elements javaelements code param java elements javaelements java elements param include mask includemask include mask search scope i java search scope ijavasearchscope create referenced scope createreferencedscope i java element ijavaelement java elements javaelements include mask includemask i java project ijavaproject projects hash set hashset java elements javaelements length projects add java elements javaelements get java project getjavaproject i java project ijavaproject prj projects to array toarray i java project ijavaproject projects size search engine searchengine create java search scope createjavasearchscope prj include mask includemask creates search scope projects reference referenced project param project project param include mask includemask include mask search scope core exception coreexception referenced project determined i java search scope ijavasearchscope create related projects scope createrelatedprojectsscope i java project ijavaproject project include mask includemask core exception coreexception i java project ijavaproject projects get related projects getrelatedprojects project search engine searchengine create java search scope createjavasearchscope projects include mask includemask param projects collection i java project ijavaproject array i package fragment root ipackagefragmentroot element package fragment root packagefragmentroot lies project code projects code i package fragment root ipackagefragmentroot get all scope elements getallscopeelements i java project ijavaproject project only source roots onlysourceroots java model exception javamodelexception collection i java project ijavaproject referencing projects referencingprojects get referencing projects getreferencingprojects project list i package fragment root ipackagefragmentroot result array list arraylist iterator i java project ijavaproject referencing projects referencingprojects iterator has next hasnext i java project ijavaproject java project javaproject i package fragment root ipackagefragmentroot roots java project javaproject get package fragment roots getpackagefragmentroots add fragment roots archives roots length i package fragment root ipackagefragmentroot root roots only source roots onlysourceroots root get kind getkind i package fragment root ipackagefragmentroot source result add root result to array toarray i package fragment root ipackagefragmentroot result size finds classpath entry classpathentry project classpath entry references project entry exists referenced project exported exported entry returned i classpath entry iclasspathentry get referencing class path entry getreferencingclasspathentry i java project ijavaproject referencing project referencingproject i java project ijavaproject referenced project referencedproject java model exception javamodelexception i classpath entry iclasspathentry result i path ipath path referenced project referencedproject get project getproject get full path getfullpath i classpath entry iclasspathentry classpath referencing project referencingproject get resolved classpath getresolvedclasspath classpath length i classpath entry iclasspathentry entry classpath entry get entry kind getentrykind i classpath entry iclasspathentry cpe project path equals entry get path getpath entry is exported isexported entry candidate entry exported result entry result i java project ijavaproject get related projects getrelatedprojects i java project ijavaproject focus core exception coreexception i java project ijavaproject projects hash set hashset add related referencing addrelatedreferencing focus projects add related referenced addrelatedreferenced focus projects projects add focus projects to array toarray i java project ijavaproject projects size collection i java project ijavaproject get referencing projects getreferencingprojects i java project ijavaproject focus java model exception javamodelexception i java project ijavaproject projects hash set hashset add referencing projects addreferencingprojects focus projects projects add focus projects get visibility getvisibility i member imember member java model exception javamodelexception jdt flags jdtflags is private isprivate member jdt flags jdtflags is package visible ispackagevisible member jdt flags jdtflags is protected isprotected member refactoring scope factory refactoringscopefactory instances