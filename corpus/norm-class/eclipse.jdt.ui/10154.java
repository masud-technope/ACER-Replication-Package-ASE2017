copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt tests core java file junit framework test junit framework test case testcase junit framework test suite testsuite org eclipse jdt test plugin testplugin java project helper javaprojecthelper org eclipse jdt test plugin testplugin java test plugin javatestplugin org eclipse core runtime i path ipath org eclipse core runtime path org eclipse core resources i workspace iworkspace org eclipse core resources i workspace description iworkspacedescription org eclipse core resources incremental project builder incrementalprojectbuilder org eclipse jface preference i preference store ipreferencestore org eclipse jdt core i classpath entry iclasspathentry org eclipse jdt core i java project ijavaproject org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt core java core javacore org eclipse jdt preference constants preferenceconstants org eclipse jdt internal util core utility coreutility org eclipse jdt internal wizards class path detector classpathdetector class path detector test classpathdetectortest test case testcase class path detector test classpathdetectortest class path detector test classpathdetectortest i java project ijavaproject fjproject f enable auto build after testing fenableautobuildaftertesting class path detector test classpathdetectortest string test suite set up test setuptest test suite testsuite test set up test setuptest test test project test setup projecttestsetup test override set up setup exception i workspace iworkspace workspace java test plugin javatestplugin get workspace getworkspace assert not null assertnotnull workspace disable auto build i workspace description iworkspacedescription workspace desc workspacedesc workspace get description getdescription workspace desc workspacedesc is auto building isautobuilding f enable auto build after testing fenableautobuildaftertesting core utility coreutility set auto building setautobuilding i preference store ipreferencestore store preference constants preferenceconstants get preference store getpreferencestore store set value setvalue preference constants preferenceconstants srcbin binname bin fjproject override tear down teardown exception fjproject java project helper javaprojecthelper delete fjproject f enable auto build after testing fenableautobuildaftertesting core utility coreutility set auto building setautobuilding has same paths hassamepaths i path ipath i path ipath length length length equals i classpath entry iclasspathentry find entry findentry i classpath entry iclasspathentry entry i classpath entry iclasspathentry entries entries length i classpath entry iclasspathentry curr entries curr get path getpath equals entry get path getpath curr get entry kind getentrykind entry get entry kind getentrykind curr get entry kind getentrykind i classpath entry iclasspathentry cpe source has same paths hassamepaths curr get exclusion patterns getexclusionpatterns entry get exclusion patterns getexclusionpatterns curr curr assert same classpath assertsameclasspath i classpath entry iclasspathentry project entries projectentries i classpath entry iclasspathentry entries exception assert equals assertequals number classpath entries project entries projectentries length entries length project entries projectentries length i classpath entry iclasspathentry curr project entries projectentries assert true asserttrue entry curr get path getpath find entry findentry curr entries clear classpath clearclasspath exception i classpath entry iclasspathentry java core javacore new source entry newsourceentry fjproject get path getpath fjproject set raw classpath setrawclasspath i classpath entry iclasspathentry fjproject get path getpath append bin fjproject set raw classpath setrawclasspath i classpath entry iclasspathentry project output projectoutput test source and library testsourceandlibrary exception fjproject java project helper javaprojecthelper create java project createjavaproject test project testproject bin source folder internal jar file junit src archive junitsrcarchive java test plugin javatestplugin get default getdefault get file in plugin getfileinplugin java project helper javaprojecthelper junit src assert true asserttrue junit src junit src archive junitsrcarchive junit src archive junitsrcarchive exists java project helper javaprojecthelper add source container with import addsourcecontainerwithimport fjproject src junit src archive junitsrcarchive java project helper javaprojecthelper junit src encoding file mylib jar mylibjar java test plugin javatestplugin get default getdefault get file in plugin getfileinplugin java project helper javaprojecthelper mylib assert true asserttrue lib junit src archive junitsrcarchive junit src archive junitsrcarchive exists java project helper javaprojecthelper add library with import addlibrarywithimport fjproject path fromosstring mylib jar mylibjar get path getpath i classpath entry iclasspathentry jre entries jreentries preference constants preferenceconstants getdefaultjrelibrary jre entries jreentries length java project helper javaprojecthelper add to classpath addtoclasspath fjproject jre entries jreentries fjproject get project getproject build incremental project builder incrementalprojectbuilder full build i classpath entry iclasspathentry project entries projectentries fjproject get raw classpath getrawclasspath i path ipath project output projectoutput fjproject get output location getoutputlocation clear classpath clearclasspath class path detector classpathdetector detector class path detector classpathdetector fjproject get project getproject i path ipath output location outputlocation detector get output location getoutputlocation i classpath entry iclasspathentry entries detector get classpath getclasspath assert not null assertnotnull classpath detected entries assert not null assertnotnull output location outputlocation detected output location outputlocation assert same classpath assertsameclasspath project entries projectentries entries assert true asserttrue output folder output location outputlocation equals project output projectoutput test two source folders testtwosourcefolders exception fjproject java project helper javaprojecthelper create java project createjavaproject test project testproject bin source folders file junit src archive junitsrcarchive java test plugin javatestplugin get default getdefault get file in plugin getfileinplugin java project helper javaprojecthelper junit src assert true asserttrue junit src junit src archive junitsrcarchive junit src archive junitsrcarchive exists java project helper javaprojecthelper add source container with import addsourcecontainerwithimport fjproject src junit src archive junitsrcarchive java project helper javaprojecthelper junit src encoding i package fragment root ipackagefragmentroot root java project helper javaprojecthelper add source container addsourcecontainer fjproject src i package fragment ipackagefragment pack root create package fragment createpackagefragment test string buffer stringbuffer buf string buffer stringbuffer buf append test buf append buf append foo buf append get class getclass buf append buf append pack create compilation unit createcompilationunit java buf to string tostring i classpath entry iclasspathentry jre entries jreentries preference constants preferenceconstants getdefaultjrelibrary jre entries jreentries length java project helper javaprojecthelper add to classpath addtoclasspath fjproject jre entries jreentries fjproject get project getproject build incremental project builder incrementalprojectbuilder full build i classpath entry iclasspathentry project entries projectentries fjproject get raw classpath getrawclasspath i path ipath project output projectoutput fjproject get output location getoutputlocation clear classpath clearclasspath class path detector classpathdetector detector class path detector classpathdetector fjproject get project getproject i path ipath output location outputlocation detector get output location getoutputlocation i classpath entry iclasspathentry entries detector get classpath getclasspath assert not null assertnotnull classpath detected entries assert not null assertnotnull output location outputlocation detected output location outputlocation assert same classpath assertsameclasspath project entries projectentries entries assert true asserttrue output folder output location outputlocation equals project output projectoutput test nested sources testnestedsources exception fjproject java project helper javaprojecthelper create java project createjavaproject test project testproject bin nested source folders file junit src archive junitsrcarchive java test plugin javatestplugin get default getdefault get file in plugin getfileinplugin java project helper javaprojecthelper junit src assert true asserttrue junit src junit src archive junitsrcarchive junit src archive junitsrcarchive exists i path ipath exclusion filter exclusionfilter i path ipath path src java project helper javaprojecthelper add source container with import addsourcecontainerwithimport fjproject src junit src archive junitsrcarchive java project helper javaprojecthelper junit src encoding exclusion filter exclusionfilter i package fragment root ipackagefragmentroot root java project helper javaprojecthelper add source container addsourcecontainer fjproject src src i package fragment ipackagefragment pack root create package fragment createpackagefragment test string buffer stringbuffer buf string buffer stringbuffer buf append test buf append buf append foo buf append get class getclass buf append buf append pack create compilation unit createcompilationunit java buf to string tostring i classpath entry iclasspathentry jre entries jreentries preference constants preferenceconstants getdefaultjrelibrary jre entries jreentries length java project helper javaprojecthelper add to classpath addtoclasspath fjproject jre entries jreentries fjproject get project getproject build incremental project builder incrementalprojectbuilder full build i classpath entry iclasspathentry project entries projectentries fjproject get raw classpath getrawclasspath i path ipath project output projectoutput fjproject get output location getoutputlocation clear classpath clearclasspath class path detector classpathdetector detector class path detector classpathdetector fjproject get project getproject i path ipath output location outputlocation detector get output location getoutputlocation i classpath entry iclasspathentry entries detector get classpath getclasspath assert not null assertnotnull classpath detected entries assert not null assertnotnull output location outputlocation detected output location outputlocation assert same classpath assertsameclasspath project entries projectentries entries assert true asserttrue output folder output location outputlocation equals project output projectoutput test source and output on project testsourceandoutputonproject exception fjproject java project helper javaprojecthelper create java project createjavaproject test project testproject source folder internal jar file junit src archive junitsrcarchive java test plugin javatestplugin get default getdefault get file in plugin getfileinplugin java project helper javaprojecthelper junit src assert true asserttrue junit src junit src archive junitsrcarchive junit src archive junitsrcarchive exists java project helper javaprojecthelper add source container with import addsourcecontainerwithimport fjproject junit src archive junitsrcarchive java project helper javaprojecthelper junit src encoding i classpath entry iclasspathentry jre entries jreentries preference constants preferenceconstants getdefaultjrelibrary jre entries jreentries length java project helper javaprojecthelper add to classpath addtoclasspath fjproject jre entries jreentries fjproject get project getproject build incremental project builder incrementalprojectbuilder full build i classpath entry iclasspathentry project entries projectentries fjproject get raw classpath getrawclasspath i path ipath project output projectoutput fjproject get output location getoutputlocation clear classpath clearclasspath class path detector classpathdetector detector class path detector classpathdetector fjproject get project getproject i path ipath output location outputlocation detector get output location getoutputlocation i classpath entry iclasspathentry entries detector get classpath getclasspath assert not null assertnotnull classpath detected entries assert not null assertnotnull output location outputlocation detected output location outputlocation assert same classpath assertsameclasspath project entries projectentries entries assert true asserttrue output folder output location outputlocation equals project output projectoutput test class folder testclassfolder exception fjproject java project helper javaprojecthelper create java project createjavaproject test project testproject bin folder i package fragment root ipackagefragmentroot root java project helper javaprojecthelper add source container addsourcecontainer fjproject src i package fragment ipackagefragment pack root create package fragment createpackagefragment test string buffer stringbuffer buf string buffer stringbuffer buf append test buf append buf append foo buf append get class getclass buf append buf append pack create compilation unit createcompilationunit java buf to string tostring file lib java test plugin javatestplugin get default getdefault get file in plugin getfileinplugin java project helper javaprojecthelper mylib assert true asserttrue lib lib lib exists i package fragment root ipackagefragmentroot cfroot java project helper javaprojecthelper add class folder with import addclassfolderwithimport fjproject lib i classpath entry iclasspathentry jre entries jreentries preference constants preferenceconstants getdefaultjrelibrary jre entries jreentries length java project helper javaprojecthelper add to classpath addtoclasspath fjproject jre entries jreentries fjproject get project getproject build incremental project builder incrementalprojectbuilder full build class folder classfolder detected java project helper javaprojecthelper remove from classpath removefromclasspath fjproject cfroot get path getpath i classpath entry iclasspathentry project entries projectentries fjproject get raw classpath getrawclasspath i path ipath project output projectoutput fjproject get output location getoutputlocation clear classpath clearclasspath class path detector classpathdetector detector class path detector classpathdetector fjproject get project getproject i path ipath output location outputlocation detector get output location getoutputlocation i classpath entry iclasspathentry entries detector get classpath getclasspath assert not null assertnotnull classpath detected entries assert not null assertnotnull output location outputlocation detected output location outputlocation assert same classpath assertsameclasspath project entries projectentries entries assert true asserttrue output folder output location outputlocation equals project output projectoutput