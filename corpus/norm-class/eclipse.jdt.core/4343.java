copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt core tests model java net malformedurlexception java net url java util hash map hashmap junit framework test org eclipse core resources i file ifile org eclipse core resources i workspace runnable iworkspacerunnable org eclipse core resources incremental project builder incrementalprojectbuilder org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime path org eclipse jdt core org eclipse jdt core search org eclipse jdt core tests model abstract java search tests abstractjavasearchtests java search result collector javasearchresultcollector org eclipse jdt core tests model abstract java search tests abstractjavasearchtests type name match collector typenamematchcollector org eclipse jdt internal core java model manager javamodelmanager org eclipse jdt internal core index location indexlocation org eclipse jdt internal core search indexing index manager indexmanager tests java search engine accross multiple projects suppress warnings suppresswarnings rawtypes java search scope tests javasearchscopetests modifying resource tests modifyingresourcetests i java search constants ijavasearchconstants java search scope tests javasearchscopetests string test suite build model test suite buildmodeltestsuite java search scope tests javasearchscopetests tests belong skipped tests names string test method occurences testmethodoccurences tests numbers tests range tear down teardown exception clean up cleanup caches java model manager javamodelmanager manager java model manager javamodelmanager get java model manager getjavamodelmanager manager containers hash map hashmap manager variables hash map hashmap tear down teardown ensures java search scope sources correct test sources testsources core exception coreexception i java project ijavaproject project create java project createjavaproject i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i java search scope ijavasearchscope sources assert scope equals assertscopeequals java search scope javasearchscope scope delete project deleteproject ensures java search scope application libraries correct external jar test application lib rairies external jar testapplicationlibrairiesexternaljar core exception coreexception i java project ijavaproject project create java project createjavaproject i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i java search scope ijavasearchscope application libraries assert scope equals assertscopeequals java search scope javasearchscope getexternaljclpath toosstring scope delete project deleteproject ensures java search scope application libraries correct internal jar folder cases test application lib rairies jar and class folder testapplicationlibrairiesjarandclassfolder core exception coreexception i java project ijavaproject project create java project createjavaproject string src string internal jar class folder classfolder bin create file createfile internal jar create folder createfolder class folder classfolder i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i java search scope ijavasearchscope application libraries assert scope equals assertscopeequals java search scope javasearchscope class folder classfolder internal jar scope delete project deleteproject test application lib rairies non existing jar and class folder testapplicationlibrairiesnonexistingjarandclassfolder core exception coreexception i java project ijavaproject project create java project createjavaproject string src string internal jar class folder classfolder bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i java search scope ijavasearchscope application libraries assert scope equals assertscopeequals java search scope javasearchscope class folder classfolder internal jar scope delete project deleteproject ensures java search scope application libraries correct classpath variable test application lib rairies classpath variable testapplicationlibrairiesclasspathvariable core exception coreexception variables initializer variablesinitializer set initializer setinitializer classpath initializer tests classpathinitializertests default variable initializer defaultvariableinitializer string test lib lib jar i java project ijavaproject project create java project createjavaproject string string test lib create file createfile lib jar i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i java search scope ijavasearchscope application libraries assert scope equals assertscopeequals java search scope javasearchscope lib jar scope delete project deleteproject variables initializer variablesinitializer reset test application lib rairies non existing classpath variable testapplicationlibrairiesnonexistingclasspathvariable core exception coreexception variables initializer variablesinitializer set initializer setinitializer classpath initializer tests classpathinitializertests default variable initializer defaultvariableinitializer string test lib lib jar i java project ijavaproject project create java project createjavaproject string string test lib i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i java search scope ijavasearchscope application libraries assert scope equals assertscopeequals java search scope javasearchscope lib jar scope delete project deleteproject variables initializer variablesinitializer reset ensures java search scope application libraries correct classpath container test application lib rairies classpath container testapplicationlibrairiesclasspathcontainer core exception coreexception container initializer containerinitializer set initializer setinitializer default container initializer defaultcontainerinitializer string lib jar i java project ijavaproject project create java project createjavaproject string string org eclipse jdt core tests model test container i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i java search scope ijavasearchscope application libraries assert scope equals assertscopeequals java search scope javasearchscope lib jar scope delete project deleteproject ensures java search scope system libraries correct classpath container test system libraries testsystemlibraries core exception coreexception default container initializer defaultcontainerinitializer int ializer intializer default container initializer defaultcontainerinitializer string lib jar default container defaultcontainer new container newcontainer lib paths libpaths default container defaultcontainer lib paths libpaths get kind getkind i classpath container iclasspathcontainer system container initializer containerinitializer set initializer setinitializer int ializer intializer i java project ijavaproject project create java project createjavaproject string string org eclipse jdt core tests model test container i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i java search scope ijavasearchscope system libraries assert scope equals assertscopeequals java search scope javasearchscope lib jar scope delete project deleteproject ensures java search scope sources reference d referenced projects correct direct reference test sources or direct reference d projects testsourcesordirectreferencedprojects core exception coreexception create java project createjavaproject i java project ijavaproject project create java project createjavaproject string src string string bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i java search scope ijavasearchscope sources i java search scope ijavasearchscope reference d referenced projects assert scope equals assertscopeequals java search scope javasearchscope src scope delete project deleteproject delete project deleteproject ensures java search scope sources reference d referenced projects correct reference container test sources or container reference d projects testsourcesorcontainerreferencedprojects core exception coreexception create java project createjavaproject container initializer containerinitializer set initializer setinitializer default container initializer defaultcontainerinitializer string i java project ijavaproject project create java project createjavaproject string src string org eclipse jdt core tests model test container bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i java search scope ijavasearchscope sources i java search scope ijavasearchscope reference d referenced projects assert scope equals assertscopeequals java search scope javasearchscope src scope delete project deleteproject delete project deleteproject ensures java project enclosed scope project proj src resource path resourcepath test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose scope encloses delete project deleteproject ensures java project enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose scope encloses project delete project deleteproject ensures root enclosed scope project proj src resource path traling slash test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose scope encloses delete project deleteproject ensures root enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i package fragment root ipackagefragmentroot root project get package fragment root getpackagefragmentroot project get project getproject assert true asserttrue scope enclose root scope encloses root delete project deleteproject ensures enclosed scope project proj src resource path test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose scope encloses delete project deleteproject ensures enclosed scope project proj src resource path trailing slash test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose scope encloses delete project deleteproject ensures enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i package fragment ipackagefragment pkg get package getpackage assert true asserttrue scope enclose scope encloses pkg delete project deleteproject ensures enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i package fragment ipackagefragment pkg get package getpackage assert true asserttrue scope enclose scope encloses pkg delete project deleteproject ensures compilation unit enclosed scope project proj src resource path test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose java scope encloses java delete project deleteproject ensures compilation unit enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i compilation unit icompilationunit get compilation unit getcompilationunit java assert true asserttrue scope enclose compilation unit java scope encloses delete project deleteproject ensures compilation unit enclosed scope project proj src resource path test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose java scope encloses java delete project deleteproject ensures compilation unit enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i compilation unit icompilationunit get compilation unit getcompilationunit java assert true asserttrue scope enclose compilation unit java scope encloses delete project deleteproject ensures source type enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i compilation unit icompilationunit get compilation unit getcompilationunit java i type itype type get type gettype assert true asserttrue scope enclose type scope encloses type delete project deleteproject ensures java project enclosed scope project proj src resource path resourcepath test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert false assertfalse scope enclose scope encloses delete project deleteproject ensures java project enclosed scope project proj src resource path resourcepath test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert false assertfalse scope enclose scope encloses delete project deleteproject ensures java project enclosed scope project proj src resource path resourcepath test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert false assertfalse scope enclose scope encloses delete project deleteproject ensures java project enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert false assertfalse scope enclose scope encloses project delete project deleteproject ensures root enclosed scope project proj src resource path test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose src scope encloses src delete project deleteproject ensures root enclosed scope project proj src resource path traling slash test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose src scope encloses src delete project deleteproject ensures root enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i package fragment root ipackagefragmentroot root project get package fragment root getpackagefragmentroot project get project getproject get folder getfolder src assert true asserttrue scope enclose root src scope encloses root delete project deleteproject ensures enclosed scope project proj src resource path test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose src scope encloses src delete project deleteproject ensures enclosed scope project proj src resource path trailing slash test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose src scope encloses src delete project deleteproject ensures enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i package fragment ipackagefragment pkg get package getpackage src assert true asserttrue scope enclose scope encloses pkg delete project deleteproject ensures enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i package fragment ipackagefragment pkg get package getpackage src assert true asserttrue scope enclose scope encloses pkg delete project deleteproject ensures compilation unit enclosed scope project proj src resource path test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose src java scope encloses src java delete project deleteproject ensures compilation unit enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i compilation unit icompilationunit get compilation unit getcompilationunit src java assert true asserttrue scope enclose compilation unit java scope encloses delete project deleteproject ensures compilation unit enclosed scope project proj src resource path test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose src java scope encloses src java delete project deleteproject ensures compilation unit enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i compilation unit icompilationunit get compilation unit getcompilationunit src java assert true asserttrue scope enclose compilation unit java scope encloses delete project deleteproject ensures source type enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i compilation unit icompilationunit get compilation unit getcompilationunit src java i type itype type get type gettype assert true asserttrue scope enclose type scope encloses type delete project deleteproject ensures java project enclosed scope project proj src resource path resourcepath test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert false assertfalse scope enclose scope encloses delete project deleteproject ensures java project enclosed scope project proj src resource path resourcepath test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert false assertfalse scope enclose scope encloses delete project deleteproject ensures java project enclosed scope project proj src resource path resourcepath test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert false assertfalse scope enclose scope encloses delete project deleteproject ensures java project enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert false assertfalse scope enclose scope encloses project delete project deleteproject ensures root enclosed scope project proj src resource path test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose src scope encloses src delete project deleteproject ensures root enclosed scope project proj src resource path traling slash test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose src scope encloses src delete project deleteproject ensures root enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i package fragment root ipackagefragmentroot root project get package fragment root getpackagefragmentroot project get project getproject get folder getfolder src assert true asserttrue scope enclose root src scope encloses root delete project deleteproject ensures enclosed scope project proj src resource path test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose src scope encloses src delete project deleteproject ensures enclosed scope project proj src resource path trailing slash test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose src scope encloses src delete project deleteproject ensures enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i package fragment ipackagefragment pkg get package getpackage src assert true asserttrue scope enclose scope encloses pkg delete project deleteproject ensures enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i package fragment ipackagefragment pkg get package getpackage src assert true asserttrue scope enclose scope encloses pkg delete project deleteproject ensures compilation unit enclosed scope project proj src resource path test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose src java scope encloses src java delete project deleteproject ensures compilation unit enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i compilation unit icompilationunit get compilation unit getcompilationunit src java assert true asserttrue scope enclose compilation unit java scope encloses delete project deleteproject ensures compilation unit enclosed scope project proj src resource path test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project assert true asserttrue scope enclose src java scope encloses src java delete project deleteproject ensures compilation unit enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i compilation unit icompilationunit get compilation unit getcompilationunit src java assert true asserttrue scope enclose compilation unit java scope encloses delete project deleteproject ensures source type enclosed scope project proj src java element test scope encloses testscopeencloses core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project i compilation unit icompilationunit get compilation unit getcompilationunit src java i type itype type get type gettype assert true asserttrue scope enclose type scope encloses type delete project deleteproject bug search j unit junit test runner folder runs tests directory https bugs eclipse org bugs bug cgi test bug testbug core exception coreexception i java project ijavaproject project create java project createjavaproject string src test test bin create file createfile src test java test foo create file createfile test test java test foo create file createfile test test java test foo i package fragment root ipackagefragmentroot root project get package fragment root getpackagefragmentroot get folder getfolder test i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement root java search result collector javasearchresultcollector result collector resultcollector java search result collector javasearchresultcollector result collector resultcollector show project showproject search foo method declarations scope result collector resultcollector assert search results assertsearchresults test test java test foo foo result collector resultcollector delete project deleteproject bug search doesn work imported plugin https bugs eclipse org bugs bug cgi test bug testbug core exception coreexception i java project ijavaproject project create java project createjavaproject string src test test string jcl lib bin create file createfile src test java i test itest create file createfile test test java test i test itest test create file createfile test test java test i test itest test i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project java search result collector javasearchresultcollector result collector resultcollector java search result collector javasearchresultcollector result collector resultcollector show project showproject search i test itest type references scope result collector resultcollector assert search results assertsearchresults test test java test test i test itest test test java test test i test itest result collector resultcollector delete project deleteproject bug search sel ecting selecting main type ignores https bugs eclipse org bugs bug cgi test bug testbug core exception coreexception i java project ijavaproject project create java project createjavaproject create file createfile test java test main string args i package fragment ipackagefragment fragments project get package fragments getpackagefragments i package fragment ipackagefragment default fragment defaultfragment fragments length i package fragment ipackagefragment fragment fragments fragment get element name getelementname length default fragment defaultfragment fragment assert not null assertnotnull fragment project default fragment defaultfragment i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement default fragment defaultfragment java search result collector javasearchresultcollector result collector resultcollector java search result collector javasearchresultcollector result collector resultcollector show project showproject search main string method declarations scope result collector resultcollector assert search results assertsearchresults test java test main string main result collector resultcollector delete project deleteproject bug search doesn work imported plugin https bugs eclipse org bugs bug cgi warning bug disabled bad regression bug search references java element correction engine correctionengine https bugs eclipse org bugs bug cgi test bug testbug core exception coreexception i java project ijavaproject project create java project createjavaproject string src bin create file createfile src test java test create file createfile src java test test i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project java search result collector javasearchresultcollector result collector resultcollector java search result collector javasearchresultcollector result collector resultcollector show project showproject search test type references scope result collector resultcollector assert search results assertsearchresults src java test test result collector resultcollector delete project deleteproject bug search open type npe items filtering test ensure npe longer happen output location folder project build path https bugs eclipse org bugs bug cgi test bug testbug core exception coreexception create project files i java project ijavaproject project create java project createjavaproject string src string bin bin create file createfile src test java test create file createfile src java test test wait until indexes ready waituntilindexesready build create files project get project getproject build incremental project builder incrementalprojectbuilder full build wait for auto build waitforautobuild remove source file peek file bin searching type names delete file deletefile src test java output location library project index manager indexmanager index manager indexmanager java model manager javamodelmanager get index manager getindexmanager index manager indexmanager index library indexlibrary path bin project get project getproject wait until indexes ready waituntilindexesready search types i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement project type name match collector typenamematchcollector collector type name match collector typenamematchcollector search engine searchengine search all type names searchalltypenames search pattern searchpattern exact match test to char array tochararray search pattern searchpattern prefix match i java search constants ijavasearchconstants type scope collector i java search constants ijavasearchconstants wait ready search verify assert search results assertsearchresults test open test bin collector delete project deleteproject bug search organize imports hangs test ensure java search scope javasearchscope creation time note test assert ion assertion creates projects huge dependency tree create scope bug test finish https bugs eclipse org bugs bug cgi test bug testbug core exception coreexception max i java project ijavaproject projects i java project ijavaproject max java core javacore i workspace runnable iworkspacerunnable i progress monitor iprogressmonitor monitor core exception coreexception max string project name projectname string dependents string max exported projects exportedprojects max max idx idx idx idx dependents idx export projects exported projects exportedprojects idx export projects projects create java project createjavaproject project name projectname string src string jcl lib dependents exported projects exportedprojects bin search engine searchengine create java search scope createjavasearchscope projects max assert not null assertnotnull unexpected project projects delete project deleteproject projects https bugs eclipse org bugs bug cgi test bug testbug core exception coreexception create java project createjavaproject string src string bin create folder createfolder folder i file ifile new file newfile create file createfile folder test index testindex url newurl new file newfile getlocationuri tourl index location indexlocation index loc indexloc index location indexlocation create index location createindexlocation newurl assert true asserttrue malformed location index loc indexloc get index file getindexfile exists malformedurlexception fail malformed location delete project deleteproject