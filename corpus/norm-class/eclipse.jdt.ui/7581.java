copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt tests refactoring nls java file java util properties junit framework test junit framework test case testcase junit framework test suite testsuite org eclipse jdt test plugin testplugin java project helper javaprojecthelper org eclipse jdt test plugin testplugin java test plugin javatestplugin org eclipse core runtime core exception coreexception org eclipse core runtime i path ipath org eclipse core runtime path org eclipse core resources i file ifile org eclipse core resources i resource iresource org eclipse core resources resources plugin resourcesplugin org eclipse core file buf fers filebuffers file buffers filebuffers org eclipse core file buf fers filebuffers i text file buffer itextfilebuffer org eclipse core file buf fers filebuffers i text file buffer manager itextfilebuffermanager org eclipse core file buf fers filebuffers location kind locationkind org eclipse jface text i region iregion org eclipse jface text region org eclipse jdt core i class file iclassfile org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i java project ijavaproject org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt core java model exception javamodelexception org eclipse jdt core dom ast node astnode org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom i type binding itypebinding org eclipse jdt core dom node finder nodefinder org eclipse jdt core dom type declaration typedeclaration org eclipse jdt internal corext refactoring nls accessor class reference accessorclassreference org eclipse jdt internal corext refactoring nls nls hint helper nlshinthelper org eclipse jdt sharedastprovider org eclipse jdt tests core project test setup projecttestsetup tests nls hint helper nlshinthelper nls hint helper test nlshinthelpertest test case testcase i java project ijavaproject fjproject i package fragment root ipackagefragmentroot f library flibrary test suite project test setup projecttestsetup test suite testsuite nls hint helper test nlshinthelpertest override set up setup exception fjproject project test setup projecttestsetup get project getproject file lib java test plugin javatestplugin get default getdefault get file in plugin getfileinplugin java project helper javaprojecthelper nls lib assert true asserttrue lib exist lib lib exists add library project f library flibrary java project helper javaprojecthelper add library addlibrary fjproject path fromosstring lib get path getpath test find in r testfindinjar assert not null assertnotnull nls hint helper nlshinthelper get resource bundle getresourcebundle f library flibrary pkg messages properties java model exception javamodelexception fail i package fragment ipackagefragment pkg f library flibrary get package fragment getpackagefragment pkg i class file iclassfile class file classfile pkg get class file getclassfile client i region iregion region region compilation unit compilationunit ast sharedastprovider getast class file classfile sharedastprovider wait accessor class reference accessorclassreference accessor nls hint helper nlshinthelper get accessor class reference getaccessorclassreference ast region assert not null assertnotnull accessor properties properties nls hint helper nlshinthelper get properties getproperties fjproject accessor assert not null assertnotnull properties assert equals assertequals properties test assert not null assertnotnull nls hint helper nlshinthelper get resource bundle getresourcebundle fjproject accessor java model exception javamodelexception fail test do not find in r testdonotfindinjar assert null assertnull nls hint helper nlshinthelper get resource bundle getresourcebundle fjproject pkg messages properties java model exception javamodelexception fail test find in dirty buffer testfindindirtybuffer i text file buffer manager itextfilebuffermanager manager file buffers filebuffers get text file buffer manager gettextfilebuffermanager assert not null assertnotnull manager i path ipath non existent path nonexistentpath fjproject get project getproject get full path getfullpath append system current time millis currenttimemillis manager connect non existent path nonexistentpath location kind locationkind normalize core exception coreexception fail i text file buffer itextfilebuffer buffer manager get text file buffer gettextfilebuffer non existent path nonexistentpath location kind locationkind normalize buffer get document getdocument new key newkey new value newvalue i file ifile non existent file nonexistentfile resources plugin resourcesplugin get workspace getworkspace get root getroot get file getfile non existent path nonexistentpath properties properties nls hint helper nlshinthelper get properties getproperties non existent file nonexistentfile string new value newvalue properties get property getproperty new key newkey assert equals assertequals new value newvalue new value newvalue manager disconnect non existent path nonexistentpath location kind locationkind normalize core exception coreexception test do not find dirty buffer testdonotfinddirtybuffer i text file buffer manager itextfilebuffermanager manager file buffers filebuffers get text file buffer manager gettextfilebuffermanager assert not null assertnotnull manager i path ipath non existent path nonexistentpath fjproject get project getproject get full path getfullpath append system current time millis currenttimemillis manager connect non existent path nonexistentpath location kind locationkind normalize core exception coreexception fail i text file buffer itextfilebuffer buffer manager get text file buffer gettextfilebuffer non existent path nonexistentpath location kind locationkind normalize buffer get document getdocument new key newkey new value newvalue i file ifile non existent file nonexistentfile resources plugin resourcesplugin get workspace getworkspace get root getroot get file getfile non existent path nonexistentpath properties properties nls hint helper nlshinthelper get properties getproperties non existent file nonexistentfile string new value newvalue properties get property getproperty non existing value nonexistingvalue assert equals assertequals new value newvalue manager disconnect non existent path nonexistentpath location kind locationkind normalize core exception coreexception test find in file testfindinfile i text file buffer manager itextfilebuffermanager manager file buffers filebuffers get text file buffer manager gettextfilebuffermanager assert not null assertnotnull manager string file name filename system current time millis currenttimemillis i path ipath non existent path nonexistentpath fjproject get project getproject get full path getfullpath append file name filename i path ipath non existent location nonexistentlocation fjproject get project getproject get location getlocation append file name filename manager connect non existent location nonexistentlocation location kind locationkind normalize core exception coreexception fail i text file buffer itextfilebuffer buffer manager get text file buffer gettextfilebuffer non existent location nonexistentlocation location kind locationkind normalize buffer get document getdocument new key newkey new value newvalue buffer commit fjproject get project getproject refresh local refreshlocal i resource iresource depth i file ifile existent file existentfile resources plugin resourcesplugin get workspace getworkspace get root getroot get file getfile non existent path nonexistentpath assert equals assertequals existent file existentfile exists properties properties nls hint helper nlshinthelper get properties getproperties existent file existentfile string new value newvalue properties get property getproperty new key newkey assert equals assertequals new value newvalue new value newvalue core exception coreexception fail manager disconnect non existent path nonexistentpath location kind locationkind normalize core exception coreexception test do not find in file testdonotfindinfile i text file buffer manager itextfilebuffermanager manager file buffers filebuffers get text file buffer manager gettextfilebuffermanager assert not null assertnotnull manager string file name filename system current time millis currenttimemillis i path ipath non existent path nonexistentpath fjproject get project getproject get full path getfullpath append file name filename i path ipath non existent location nonexistentlocation fjproject get project getproject get location getlocation append file name filename manager connect non existent location nonexistentlocation location kind locationkind normalize core exception coreexception fail i text file buffer itextfilebuffer buffer manager get text file buffer gettextfilebuffer non existent location nonexistentlocation location kind locationkind normalize buffer get document getdocument new key newkey new value newvalue buffer commit fjproject get project getproject refresh local refreshlocal i resource iresource depth i file ifile existent file existentfile resources plugin resourcesplugin get workspace getworkspace get root getroot get file getfile non existent path nonexistentpath assert equals assertequals existent file existentfile exists properties properties nls hint helper nlshinthelper get properties getproperties existent file existentfile string new value newvalue properties get property getproperty non existing value nonexistingvalue assert equals assertequals new value newvalue core exception coreexception fail manager disconnect non existent path nonexistentpath location kind locationkind normalize core exception coreexception test find resource bundle name testfindresourcebundlename exception string source test test messages testmessages string bundle test test string get string getstring string assert equals assertequals test test get resource bundle name getresourcebundlename source test messages testmessages test test find resource bundle name testfindresourcebundlename exception string source test test messages testmessages string bundle bundle test test string get string getstring string assert equals assertequals test test get resource bundle name getresourcebundlename source test messages testmessages test test find resource bundle name testfindresourcebundlename exception string source test test messages testmessages string bundle test messages testmessages get name getname string get string getstring string assert equals assertequals test test messages testmessages get resource bundle name getresourcebundlename source test messages testmessages test test find resource bundle name testfindresourcebundlename exception string source test test messages testmessages string bundle bundle test messages testmessages get name getname string get string getstring string assert equals assertequals test test messages testmessages get resource bundle name getresourcebundlename source test messages testmessages test test find resource bundle name testfindresourcebundlename exception string source test java util resource bundle resourcebundle test messages testmessages resource bundle resourcebundle resource bundle resourcebundle get bundle getbundle test messages testmessages get name getname string get string getstring string assert equals assertequals test test messages testmessages get resource bundle name getresourcebundlename source test messages testmessages test test find resource bundle name testfindresourcebundlename exception string source test java util resource bundle resourcebundle test messages testmessages resource bundle resourcebundle resource bundle resourcebundle get bundle getbundle test messages testmessages get name getname string get string getstring string assert equals assertequals test test messages testmessages get resource bundle name getresourcebundlename source test messages testmessages test test find resource bundle name testfindresourcebundlename exception string source test java util resource bundle resourcebundle test messages testmessages resource bundle resourcebundle resource bundle resourcebundle get bundle getbundle test test string get string getstring string assert equals assertequals test test get resource bundle name getresourcebundlename source test messages testmessages test test find resource bundle name testfindresourcebundlename exception string source test java util resource bundle resourcebundle test messages testmessages resource bundle resourcebundle resource bundle resourcebundle get bundle getbundle test test string get string getstring string assert equals assertequals test test get resource bundle name getresourcebundlename source test messages testmessages test test find resource bundle name testfindresourcebundlename exception string source test java util resource bundle resourcebundle test messages testmessages string resource bundle test messages testmessages get name getname resource bundle resourcebundle resource bundle resourcebundle get bundle getbundle resource bundle string get string getstring string assert equals assertequals test test messages testmessages get resource bundle name getresourcebundlename source test messages testmessages test test find resource bundle name testfindresourcebundlename exception string source test java util resource bundle resourcebundle test messages testmessages string resource bundle test messages testmessages get name getname resource bundle resourcebundle resource bundle resourcebundle get bundle getbundle resource bundle string get string getstring string assert equals assertequals test test messages testmessages get resource bundle name getresourcebundlename source test messages testmessages test test find resource bundle name testfindresourcebundlename exception string source test java util resource bundle resourcebundle test messages testmessages string resource bundle test messages testmessages get name getname resource bundle resourcebundle f g resource bundle fgresourcebundle resource bundle resourcebundle get bundle getbundle resource bundle string get string getstring string assert equals assertequals test test messages testmessages get resource bundle name getresourcebundlename source test messages testmessages test string get resource bundle name getresourcebundlename string source string class name classname string package name packagename exception create i package fragment root ipackagefragmentroot source folder sourcefolder java project helper javaprojecthelper add source container addsourcecontainer fjproject src i package fragment ipackagefragment pack source folder sourcefolder create package fragment createpackagefragment package name packagename i compilation unit icompilationunit pack create compilation unit createcompilationunit class name classname java source type binding compilation unit compilationunit ast sharedastprovider getast sharedastprovider wait ast node astnode node node finder nodefinder perform ast get type gettype class name classname get source range getsourcerange i type binding itypebinding type binding typebinding type declaration typedeclaration node resolve binding resolvebinding nls hint helper nlshinthelper get resource bundle name getresourcebundlename type binding typebinding override tear down teardown exception java project helper javaprojecthelper clear fjproject project test setup projecttestsetup get default classpath getdefaultclasspath