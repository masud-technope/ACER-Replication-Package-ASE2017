copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt core tests model org eclipse core resources i file ifile org eclipse core resources i folder ifolder org eclipse core resources i workspace runnable iworkspacerunnable org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime path org eclipse jdt core org eclipse jdt core search i java search constants ijavasearchconstants org eclipse jdt core search i java search scope ijavasearchscope org eclipse jdt core search search engine searchengine junit framework test exclusion patterns tests exclusionpatternstests modifying resource tests modifyingresourcetests i java project ijavaproject project exclusion patterns tests exclusionpatternstests string set classpath setclasspath string source folders and exclusion patterns sourcefoldersandexclusionpatterns java model exception javamodelexception project set raw classpath setrawclasspath create classpath createclasspath source folders and exclusion patterns sourcefoldersandexclusionpatterns inclusion set up setup exception set up setup project create java project createjavaproject string src bin start deltas startdeltas tests belong skipped tests names string test create excluded package testcreateexcludedpackage tests numbers tests range test suite build model test suite buildmodeltestsuite exclusion patterns tests exclusionpatternstests tear down teardown exception stop deltas stopdeltas delete project deleteproject tear down teardown ensure adding exclusion compilation unit disappear children java resources test add exclusion on compilation unit testaddexclusiononcompilationunit core exception coreexception create folder createfolder src create file createfile src java clear deltas cleardeltas set classpath setclasspath string src java assert deltas assertdeltas unexpected deltas children content raw classpath changed resolved classpath changed src classpath removed classpath resource delta resourcedelta classpath i package fragment ipackagefragment pkg get package getpackage src assert sorted elements equal assertsortedelementsequal unexpected children pkg get children getchildren assert resource names equal assertresourcenamesequal unexpected java resources java pkg get non java resources getnonjavaresources ensure adding exclusion folder project prj src java resources regression test bug excluded folder project returned java model test add exclusion on folder under project testaddexclusiononfolderunderproject core exception coreexception i java project ijavaproject java project javaproject create java project createjavaproject string create folder createfolder doc clear deltas cleardeltas java project javaproject set raw classpath setrawclasspath create classpath createclasspath string doc inclusion exclusion assert deltas assertdeltas unexpected deltas children content raw classpath changed resolved classpath changed project root classpath removed classpath resource delta resourcedelta classpath i package fragment root ipackagefragmentroot root get package fragment root getpackagefragmentroot assert sorted elements equal assertsortedelementsequal unexpected children project root root get children getchildren assert resource names equal assertresourcenamesequal unexpected java resources project classpath project doc java project javaproject get non java resources getnonjavaresources delete project deleteproject ensure adding exclusion disappear children fragment root java resources test add exclusion on package testaddexclusiononpackage core exception coreexception create folder createfolder src clear deltas cleardeltas set classpath setclasspath string src assert deltas assertdeltas unexpected deltas children content raw classpath changed resolved classpath changed src classpath removed classpath resource delta resourcedelta classpath i package fragment root ipackagefragmentroot root get package fragment root getpackagefragmentroot src assert sorted elements equal assertsortedelementsequal unexpected children src root get children getchildren assert resource names equal assertresourcenamesequal unexpected java resources root get non java resources getnonjavaresources ensure adding exclusion primary working copy disappear children java resources test add exclusion on primary working copy testaddexclusiononprimaryworkingcopy core exception coreexception create folder createfolder src create file createfile src java i compilation unit icompilationunit working copy workingcopy working copy workingcopy get compilation unit getcompilationunit src java working copy workingcopy become working copy becomeworkingcopy clear deltas cleardeltas set classpath setclasspath string src java assert deltas assertdeltas unexpected deltas children content raw classpath changed resolved classpath changed src classpath removed classpath resource delta resourcedelta classpath i package fragment ipackagefragment pkg get package getpackage src assert sorted elements equal assertsortedelementsequal unexpected children pkg get children getchildren assert resource names equal assertresourcenamesequal unexpected java resources java pkg get non java resources getnonjavaresources working copy workingcopy working copy workingcopy discard working copy discardworkingcopy ensure adding file folder excluded reports correct delta regression test bug wrong delta adding filtered folder test add to excluded folder testaddtoexcludedfolder core exception coreexception create folder createfolder src icons exclude folder contents set classpath setclasspath string src icons clear deltas cleardeltas create file createfile src icons txt assert deltas assertdeltas unexpected deltas children src content resource delta resourcedelta src icons clear deltas cleardeltas delete file deletefile src icons txt assert deltas assertdeltas unexpected deltas children src content resource delta resourcedelta src icons ensure creating excluded compilation unit doesn child java resource test create excluded compilation unit testcreateexcludedcompilationunit core exception coreexception set classpath setclasspath string src java create folder createfolder src i package fragment ipackagefragment pkg get package getpackage src clear deltas cleardeltas pkg create compilation unit createcompilationunit java assert deltas assertdeltas unexpected deltas children src children content resource delta resourcedelta src java assert sorted elements equal assertsortedelementsequal unexpected children pkg get children getchildren assert resource names equal assertresourcenamesequal unexpected java resources java pkg get non java resources getnonjavaresources ensure crearing excluded doesn child fragment root java resource test create excluded package testcreateexcludedpackage core exception coreexception set classpath setclasspath string src i package fragment root ipackagefragmentroot root get package fragment root getpackagefragmentroot src clear deltas cleardeltas root create package fragment createpackagefragment assert deltas assertdeltas unexpected deltas children src content resource delta resourcedelta src assert sorted elements equal assertsortedelementsequal unexpected children src root get children getchildren assert resource names equal assertresourcenamesequal unexpected java resources root get non java resources getnonjavaresources ensure crearing excluded doesn child fragment root java resource regression test bug model excluded java model test create excluded package testcreateexcludedpackage core exception coreexception set classpath setclasspath string src org org eclipse clear deltas cleardeltas create folder createfolder src org eclipse mypack assert deltas assertdeltas unexpected deltas children src content resource delta resourcedelta src org i package fragment root ipackagefragmentroot root get package fragment root getpackagefragmentroot src assert sorted elements equal assertsortedelementsequal unexpected children src org eclipse mypack src root get children getchildren assert resource names equal assertresourcenamesequal unexpected java resources org root get non java resources getnonjavaresources ensure creating folder represents excluded included correct delta java elements java resources regression test java element delta refresh excluded test create excluded and included packages testcreateexcludedandincludedpackages core exception coreexception set classpath setclasspath string src i package fragment root ipackagefragmentroot root get package fragment root getpackagefragmentroot src clear deltas cleardeltas create folder createfolder src assert deltas assertdeltas unexpected deltas children src children assert sorted elements equal assertsortedelementsequal unexpected children src src root get children getchildren assert resource names equal assertresourcenamesequal unexpected java resources root get package fragment getpackagefragment get non java resources getnonjavaresources ensure creating file corresponds excluded compilation unit doesn child java resource test create resource excluded compilation unit testcreateresourceexcludedcompilationunit core exception coreexception set classpath setclasspath string src java create folder createfolder src clear deltas cleardeltas create file createfile src java assert deltas assertdeltas unexpected deltas children src children content resource delta resourcedelta src java i package fragment ipackagefragment pkg get package getpackage src assert sorted elements equal assertsortedelementsequal unexpected children pkg get children getchildren assert resource names equal assertresourcenamesequal unexpected java resources java pkg get non java resources getnonjavaresources ensure creating folder corresponds excluded doesn child fragment root java resource test create resource excluded package testcreateresourceexcludedpackage core exception coreexception set classpath setclasspath string src clear deltas cleardeltas create folder createfolder src assert deltas assertdeltas unexpected deltas children src content resource delta resourcedelta src i package fragment root ipackagefragmentroot root get package fragment root getpackagefragmentroot src assert sorted elements equal assertsortedelementsequal unexpected children src root get children getchildren assert resource names equal assertresourcenamesequal unexpected java resources root get non java resources getnonjavaresources ensures excluded classpath project test is on classpath testisonclasspath core exception coreexception set classpath setclasspath string src create folder createfolder src i file ifile file create file createfile src java assert true asserttrue resource classpath project is on classpath isonclasspath file i compilation unit icompilationunit get compilation unit getcompilationunit src java assert true asserttrue classpath project is on classpath isonclasspath ensures excluded classpath project test is on classpath testisonclasspath core exception coreexception set classpath setclasspath string src java create folder createfolder src i file ifile file create file createfile src java assert true asserttrue resource classpath project is on classpath isonclasspath file i compilation unit icompilationunit get compilation unit getcompilationunit src java assert true asserttrue classpath project is on classpath isonclasspath ensures java resource excluded classpath project test is on classpath testisonclasspath core exception coreexception set classpath setclasspath string src create folder createfolder src i file ifile file create file createfile src read me readme txt assert true asserttrue resource classpath project is on classpath isonclasspath file ensures java resource excluded classpath project test is on classpath testisonclasspath core exception coreexception set classpath setclasspath string src create folder createfolder src i file ifile file create file createfile src read me readme txt assert true asserttrue resource classpath project is on classpath isonclasspath file ensures excluded nested source folder doesn java resource folder regression test bug ubiquitous resource java model javamodel test nested source folder testnestedsourcefolder core exception coreexception set classpath setclasspath string src src src src create folder createfolder src src i package fragment root ipackagefragmentroot root get package fragment root getpackagefragmentroot src assert resource names equal assertresourcenamesequal unexpected java resources src root get non java resources getnonjavaresources ensures adding java file nested source folder reports delta nested source folder test nested source folder testnestedsourcefolder core exception coreexception set classpath setclasspath string src src src src create folder createfolder src src clear deltas cleardeltas create file createfile src src java assert deltas assertdeltas unexpected deltas children src src children children java ensures adding txt file nested source folder reports resource delta nested source folder test nested source folder testnestedsourcefolder core exception coreexception set classpath setclasspath string src src src src create folder createfolder src src clear deltas cleardeltas create file createfile src src read me readme txt assert deltas assertdeltas unexpected deltas children src src content resource delta resourcedelta src src read me readme txt ensures adding folder nested source folder reports delta nested source folder test nested source folder testnestedsourcefolder core exception coreexception set classpath setclasspath string src src src src create folder createfolder src src clear deltas cleardeltas create folder createfolder src src assert deltas assertdeltas unexpected deltas children src src children ensures adding folder source folder reports delta source folder nested test nested source folder testnestedsourcefolder core exception coreexception set classpath setclasspath string src src src src create folder createfolder src src clear deltas cleardeltas create folder createfolder src assert deltas assertdeltas unexpected deltas children src children ensures moving source folder nested source folder reports move delta test nested source folder testnestedsourcefolder core exception coreexception set classpath setclasspath string src src src src create folder createfolder src src create folder createfolder src clear deltas cleardeltas move folder movefolder src src src assert deltas assertdeltas unexpected deltas children src children moved src src src src children moved src ensure renaming excluded compilation unit excluded longer appears child removed java resources test rename excluded compilation unit testrenameexcludedcompilationunit core exception coreexception set classpath setclasspath string src java create folder createfolder src i file ifile file create file createfile src java clear deltas cleardeltas file move path src java assert deltas assertdeltas unexpected deltas children src children children content java resource delta resourcedelta src java i package fragment ipackagefragment pkg get package getpackage src assert sorted elements equal assertsortedelementsequal unexpected children java src pkg get children getchildren assert resource names equal assertresourcenamesequal unexpected java resources pkg get non java resources getnonjavaresources ensure renaming excluded excluded longer appears child fragment root removed java resources test rename excluded package testrenameexcludedpackage core exception coreexception set classpath setclasspath string src i package fragment root ipackagefragmentroot root get package fragment root getpackagefragmentroot src i package fragment ipackagefragment pkg root create package fragment createpackagefragment clear deltas cleardeltas pkg get resource getresource move path src assert deltas assertdeltas unexpected deltas children src children content resource delta resourcedelta src assert sorted elements equal assertsortedelementsequal unexpected children src src root get children getchildren assert resource names equal assertresourcenamesequal unexpected java resources root get non java resources getnonjavaresources ensure renaming file corresponds excluded compilation unit excluded longer appears child removed java resources test rename resource excluded compilation unit testrenameresourceexcludedcompilationunit core exception coreexception set classpath setclasspath string src java create folder createfolder src i file ifile file create file createfile src java clear deltas cleardeltas file move path src java assert deltas assertdeltas unexpected deltas children src children children content java resource delta resourcedelta src java i package fragment ipackagefragment pkg get package getpackage src assert sorted elements equal assertsortedelementsequal unexpected children java src pkg get children getchildren assert resource names equal assertresourcenamesequal unexpected java resources pkg get non java resources getnonjavaresources ensure search doesn find matches excluded compilation unit test search with excluded compilation unit testsearchwithexcludedcompilationunit core exception coreexception set classpath setclasspath string src java create folder createfolder src create file createfile src java java search tests javasearchtests java search result collector javasearchresultcollector result collector resultcollector java search tests javasearchtests java search result collector javasearchresultcollector search i java search constants ijavasearchconstants type i java search constants ijavasearchconstants declarations search engine searchengine create java search scope createjavasearchscope i java project ijavaproject get java project getjavaproject result collector resultcollector assert equals assertequals unexpected matches result collector resultcollector to string tostring ensure search find matches compilation unit excluded longer test search with excluded compilation unit testsearchwithexcludedcompilationunit core exception coreexception set classpath setclasspath string src java create folder createfolder src create file createfile src java set classpath setclasspath string src java search tests javasearchtests java search result collector javasearchresultcollector result collector resultcollector java search tests javasearchtests java search result collector javasearchresultcollector search i java search constants ijavasearchconstants type i java search constants ijavasearchconstants declarations search engine searchengine create java search scope createjavasearchscope i java project ijavaproject get java project getjavaproject result collector resultcollector assert equals assertequals unexpected matches src java result collector resultcollector to string tostring ensure removing folder represents excluded included correct delta java elements java resources regression test java element delta refresh excluded test remove excluded and included packages testremoveexcludedandincludedpackages core exception coreexception set classpath setclasspath string src i package fragment root ipackagefragmentroot root get package fragment root getpackagefragmentroot src create folder createfolder src clear deltas cleardeltas delete folder deletefolder src assert deltas assertdeltas unexpected deltas children src children assert sorted elements equal assertsortedelementsequal unexpected children src root get children getchildren assert resource names equal assertresourcenamesequal unexpected java resources root get non java resources getnonjavaresources ensure renaming folder corresponds excluded excluded longer appears child fragment root removed java resources test rename resource excluded package testrenameresourceexcludedpackage core exception coreexception set classpath setclasspath string src i folder ifolder folder create folder createfolder src clear deltas cleardeltas folder move path src assert deltas assertdeltas unexpected deltas children src children content resource delta resourcedelta src i package fragment root ipackagefragmentroot root get package fragment root getpackagefragmentroot src assert sorted elements equal assertsortedelementsequal unexpected children src src root get children getchildren assert resource names equal assertresourcenamesequal unexpected java resources root get non java resources getnonjavaresources ensure potential match output folder indexed regression test bug multiple output folders fooling java model test search potential match in output testsearchpotentialmatchinoutput core exception coreexception java core javacore i workspace runnable iworkspacerunnable i progress monitor iprogressmonitor monitor core exception coreexception i java project ijavaproject java project javaproject create java project createjavaproject string bin java project javaproject set raw classpath setrawclasspath create classpath createclasspath string src src inclusion exclusion create file createfile bin java java search tests javasearchtests java search result collector javasearchresultcollector result collector resultcollector java search tests javasearchtests java search result collector javasearchresultcollector i java search scope ijavasearchscope scope search engine searchengine create java search scope createjavasearchscope i java element ijavaelement get java project getjavaproject search i java search constants ijavasearchconstants type i java search constants ijavasearchconstants declarations scope result collector resultcollector assert equals assertequals result collector resultcollector to string tostring delete project deleteproject ensure removing exclusion compilation unit appears child removed java resources test remove exclusion on compilation unit testremoveexclusiononcompilationunit core exception coreexception set classpath setclasspath string src java create folder createfolder src create file createfile src java clear deltas cleardeltas set classpath setclasspath string src assert deltas assertdeltas unexpected deltas children content raw classpath changed resolved classpath changed src classpath removed classpath resource delta resourcedelta classpath i package fragment ipackagefragment pkg get package getpackage src assert sorted elements equal assertsortedelementsequal unexpected children java src pkg get children getchildren assert resource names equal assertresourcenamesequal unexpected java resources pkg get non java resources getnonjavaresources ensure removing exclusion appears child fragment root removed java resources test remove exclusion on package testremoveexclusiononpackage core exception coreexception set classpath setclasspath string src create folder createfolder src clear deltas cleardeltas set classpath setclasspath string src assert deltas assertdeltas unexpected deltas children content raw classpath changed resolved classpath changed src classpath removed classpath resource delta resourcedelta classpath i package fragment root ipackagefragmentroot root get package fragment root getpackagefragmentroot src assert sorted elements equal assertsortedelementsequal unexpected children src src root get children getchildren assert resource names equal assertresourcenamesequal unexpected java resources root get non java resources getnonjavaresources