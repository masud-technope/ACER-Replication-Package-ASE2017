copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation t erry terry parker tparker google enable java model caches recover errors https bugs eclipse org org eclipse jdt core tests model java io exception ioexception java nio file file systems filesystems java nio file files java nio file standard copy option standardcopyoption java nio file attribute file time filetime java util arrays org eclipse core resources i workspace runnable iworkspacerunnable org eclipse core runtime core exception coreexception org eclipse core runtime i path ipath org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime path org eclipse jdt core org eclipse jdt core tests util util org eclipse jdt internal core classpath entry classpathentry org eclipse jdt internal core default working copy owner defaultworkingcopyowner org eclipse jdt internal core java model manager javamodelmanager org eclipse jdt internal core java project javaproject org eclipse jdt internal core name lookup namelookup junit framework test test ensure modifications java projects correctly reported i java ellement deltas ijavaellementdeltas name lookup tests namelookuptests modifying resource tests modifyingresourcetests name lookup tests namelookuptests string tests belong skipped org eclipse jdt internal core search matching match locator matchlocator print buffer tests prefix test array testarray tests names string test find binary type with dollar name testfindbinarytypewithdollarname tests numbers tests range test suite build model test suite buildmodeltestsuite name lookup tests namelookuptests name lookup namelookup get name lookup getnamelookup java project javaproject project java model exception javamodelexception project new name lookup newnamelookup working copy owner workingcopyowner test add package fragment root and package frame nt testaddpackagefragmentrootandpackageframent core exception coreexception i java project ijavaproject create java project createjavaproject string src bin i java project ijavaproject create java project createjavaproject string i classpath entry iclasspathentry classpath i classpath entry iclasspathentry java core javacore new project entry newprojectentry path set raw classpath setrawclasspath classpath i package fragment ipackagefragment res get name lookup getnamelookup java project javaproject find package fragments findpackagefragments assert true asserttrue fragment res i classpath entry iclasspathentry classpath i classpath entry iclasspathentry java core javacore new source entry newsourceentry path src java core javacore new source entry newsourceentry path src set raw classpath setrawclasspath classpath create folder createfolder src res get name lookup getnamelookup java project javaproject find package fragments findpackagefragments assert true asserttrue fragment res res length res get element name getelementname equals delete project deleteproject delete project deleteproject test add package fragment testaddpackagefragment core exception coreexception create java project createjavaproject string src bin i java project ijavaproject create java project createjavaproject string i classpath entry iclasspathentry classpath i classpath entry iclasspathentry java core javacore new project entry newprojectentry path set raw classpath setrawclasspath classpath i package fragment ipackagefragment res get name lookup getnamelookup java project javaproject find package fragments findpackagefragments assert true asserttrue fragment res create folder createfolder src res get name lookup getnamelookup java project javaproject find package fragments findpackagefragments assert true asserttrue fragment res res length res get element name getelementname equals delete project deleteproject delete project deleteproject resolve add pkg resolve pkg accessible regression test bug unexpected problem reconcile test add package fragment testaddpackagefragment core exception coreexception java project javaproject project java project javaproject create java project createjavaproject string src bin create folder createfolder src i package fragment ipackagefragment pkgs get name lookup getnamelookup project find package fragments findpackagefragments assert elements equal assertelementsequal didn find src pkgs create folder createfolder src pkgs get name lookup getnamelookup project find package fragments findpackagefragments assert elements equal assertelementsequal didn find src pkgs delete project deleteproject ensures name lookup namelookup created working copies duplicate types regression test bug find package fragment findpackagefragment won test duplicate types in working copies testduplicatetypesinworkingcopies core exception coreexception i compilation unit icompilationunit working copies workingcopies i compilation unit icompilationunit working copies workingcopies i compilation unit icompilationunit java project javaproject project java project javaproject create java project createjavaproject working copies workingcopies get working copy getworkingcopy java working copies workingcopies get working copy getworkingcopy java working copies workingcopies get working copy getworkingcopy java name lookup namelookup name lookup namelookup project new name lookup newnamelookup working copies workingcopies todo jerome see k types seektypes i type itype type name lookup namelookup find type findtype name lookup namelookup accept assert types equal asserttypesequal unepexted types i type itype type discard working copies discardworkingcopies working copies workingcopies delete project deleteproject find fragment root path regression test bug find package fragment findpackagefragment won test find default package fragment in non default root testfinddefaultpackagefragmentinnondefaultroot core exception coreexception java project javaproject project java project javaproject create java project createjavaproject string src bin i package fragment ipackagefragment pkg get name lookup getnamelookup project find package fragment findpackagefragment path src assert elements equal assertelementsequal didn find src i java element ijavaelement pkg delete project deleteproject creates fragment finds dependent project batch operation regression test bug java project javaproject reset caches resetcaches reset dependent projects test name lookup find package fragment after creation testnamelookupfindpackagefragmentaftercreation core exception coreexception i java project ijavaproject create java project createjavaproject java project javaproject java project javaproject create java project createjavaproject string string string populate name lookup namelookup get name lookup getnamelookup i workspace runnable iworkspacerunnable runnable i workspace runnable iworkspacerunnable i progress monitor iprogressmonitor monitor core exception coreexception get package fragment root getpackagefragmentroot get project getproject create package fragment createpackagefragment don force pkg monitor i package fragment ipackagefragment pkgs get name lookup getnamelookup find package fragments findpackagefragments exact match pkg assert elements equal assertelementsequal unexpected fragments pkg project root pkgs java core javacore runnable progress delete project deleteproject delete project deleteproject ensure finding fragment working copy opened returns element regression test bug open selection prop oses proposes entry test find package fragment with working copy testfindpackagefragmentwithworkingcopy core exception coreexception working copies workingcopies i compilation unit icompilationunit java project javaproject project java project javaproject create java project createjavaproject create folder createfolder working copies workingcopies get working copy getworkingcopy java name lookup namelookup name lookup namelookup project new name lookup newnamelookup working copies workingcopies i java element ijavaelement pkgs name lookup namelookup find package fragments findpackagefragments partial match assert elements equal assertelementsequal unexpected packages project root pkgs delete project deleteproject ensure fragment path length equals external jar path length regression test bug name lookup namelookup find package fragment findpackagefragment returns incorrect fragments test find package fragment testfindpackagefragment core exception coreexception java project javaproject project java project javaproject create java project createjavaproject string string jcl lib bin name lookup namelookup name lookup namelookup get name lookup getnamelookup project i path ipath path to search pathtosearch path getexternaljclpathstring i package fragment ipackagefragment pkg name lookup namelookup find package fragment findpackagefragment path to search pathtosearch assert element equals assertelementequals unexpected pkg delete project deleteproject ensure member type dollar number regression test bug stack overflow requesting java ast selection test find binary type with dollar name testfindbinarytypewithdollarname core exception coreexception io exception ioexception i java project ijavaproject project create java project createjavaproject add library addlibrary project lib jar libs rc libsrc zip string java i type itype type get name lookup getnamelookup java project javaproject project find type findtype name lookup namelookup accept assert types equal asserttypesequal unexpected type i type itype type delete project deleteproject ensure type simple member type regression test bug error type hierarchy test find binary type with same name as member testfindbinarytypewithsamenameasmember core exception coreexception io exception ioexception i java project ijavaproject project create java project createjavaproject string string lib string bin create folder createfolder lib create file createfile lib create file createfile lib i type itype type get name lookup getnamelookup java project javaproject project find type findtype name lookup namelookup accept assert types equal asserttypesequal unexpected type i type itype type delete project deleteproject ensures type working copy opened unrelated project regression test bug model code assist favorites honour build path project context test find type with unrelated working copy testfindtypewithunrelatedworkingcopy exception i compilation unit icompilationunit working copy workingcopy create java project createjavaproject create folder createfolder create file createfile java working copy workingcopy get compilation unit getcompilationunit java working copy workingcopy become working copy becomeworkingcopy i java project ijavaproject create java project createjavaproject name lookup namelookup name lookup namelookup java project javaproject new name lookup newnamelookup default working copy owner defaultworkingcopyowner primary i type itype type name lookup namelookup find type findtype name lookup namelookup accept assert null assertnull find type working copy workingcopy working copy workingcopy discard working copy discardworkingcopy delete project deleteproject delete project deleteproject test bug tests library jar init ially initially invalid transitions valid visible lookup jar stay invalid archive cache classpath change generated project java project element info javaprojectelementinfo cache rest arting restarting eclipse closing reopening project test transition from invalid to valid jar testtransitionfrominvalidtovalidjar core exception coreexception io exception ioexception diff icu lt difficult test int ermittent intermittent errors simulate creating jars equal size invalid format classpath invalid jar swap valid jar reset timestamp original file string good jar goodjar get external path getexternalpath good jar goodjar jar string transitioning jar transitioningjar get external path getexternalpath transitioning jar transitioningjar jar java nio file path good jar path goodjarpath file systems filesystems get default getdefault get path getpath good jar goodjar java nio file path transitioning jar path transitioningjarpath file systems filesystems get default getdefault get path getpath transitioning jar transitioningjar i path ipath transitioningipath path fromosstring transitioning jar transitioningjar util create jar createjar string test i resource iresource java nls test i resource iresource nls string meta inf manifest manifest version good jar goodjar java core javacore version invalid contents invalidcontents good jar path goodjarpath to file tofile length arrays fill invalid contents invalidcontents util create file createfile transitioning jar transitioningjar string copy value of copyvalueof invalid contents invalidcontents project invalid jar classpath validation delta processing complete java project javaproject proj java project javaproject create java project createjavaproject string string transitioning jar transitioningjar bin java model manager javamodelmanager get java model manager getjavamodelmanager get java model getjavamodel refresh external archives refreshexternalarchives wait for auto build waitforautobuild assert true asserttrue invalid archive cache report jar invalid java model manager javamodelmanager get java model manager getjavamodelmanager is invalid archive isinvalidarchive transitioningipath i type itype type get name lookup getnamelookup proj find type findtype test i resource iresource name lookup namelookup accept classes assert equals assertequals lookup fail jar invalid type sub stitute substitute good jar main taining maintaining timestamp file time filetime file time filetime files get last modified time getlastmodifiedtime transitioning jar path transitioningjarpath files move good jar path goodjarpath transitioning jar path transitioningjarpath standard copy option standardcopyoption replace existing files set last modified time setlastmodifiedtime transitioning jar path transitioningjarpath file time filetime timestamp has n hasn changed external archive refresh isn update caches look ups lookups work java model manager javamodelmanager get java model manager getjavamodelmanager get java model getjavamodel refresh external archives refreshexternalarchives assert true asserttrue external archive refresh sees invalid archive cache unchanged java model manager javamodelmanager get java model manager getjavamodelmanager is invalid archive isinvalidarchive transitioningipath type get name lookup getnamelookup proj find type findtype test i resource iresource name lookup namelookup accept classes assert equals assertequals external archive refresh sees project cache unchanged type valid ating validating jar validate classpath entry validateclasspathentry for ces forces eviction invalid archive cache waiting time based eviction allowing test i classpath entry iclasspathentry transitioning entry transitioningentry java core javacore new library entry newlibraryentry transitioningipath classpath entry classpathentry validate classpath entry validateclasspathentry proj transitioning entry transitioningentry assert false assertfalse invalid archive cache longer report jar invalid java model manager javamodelmanager get java model manager getjavamodelmanager is invalid archive isinvalidarchive transitioningipath type get name lookup getnamelookup proj find type findtype test i resource iresource name lookup namelookup accept classes assert false assertfalse lookup find types valid jar type files delete if exists deleteifexists good jar path goodjarpath files delete if exists deleteifexists transitioning jar path transitioningjarpath delete project deleteproject