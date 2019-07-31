copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt core tests model java io exception ioexception org eclipse core resources org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime operation canceled exception operationcanceledexception org eclipse jdt core org eclipse jdt core tests util util org eclipse jdt core util i class file reader iclassfilereader junit framework test tests i source manipulation isourcemanipulation delete delete tests deletetests modifying resource tests modifyingresourcetests delete tests deletetests string set up setup exception set up setup ensure indexing int erfer interfer deletion wait until indexes ready waituntilindexesready set up suite setupsuite exception set up suite setupsuite create java project createjavaproject test suite build model test suite buildmodeltestsuite delete tests deletetests tests belong skipped tests names string test delete field testdeletefield tests numbers tests range tear down suite teardownsuite exception delete project deleteproject tear down suite teardownsuite ensures declarations deleted container reported removed test delete all imports testdeleteallimports core exception coreexception create file createfile java java util i compilation unit icompilationunit get compilation unit getcompilationunit java i import declaration iimportdeclaration children get imports getimports start deltas startdeltas assert deletion assertdeletion children assert deltas assertdeltas unexpected delta children project root children children java children fine grained primary resource container stop deltas stopdeltas delete file deletefile java ensures binary method deleted test delete binary method testdeletebinarymethod core exception coreexception create java project createjavaproject string string lib evaluate scr apbook scrapbook org eclipse jdt core tests model modifying resource tests modifyingresourcetests generate class file generateclassfile foo bytes create file createfile lib bytes i class file iclassfile get class file getclassfile lib i method imethod method get type gettype get method getmethod foo string method delete java model exception javamodelexception assert true asserttrue read get status getstatus get code getcode i java model status constants ijavamodelstatusconstants read assert true asserttrue delete binary method delete project deleteproject ensures binary type deleted test delete binary type testdeletebinarytype core exception coreexception create java project createjavaproject string string lib evaluate scr apbook scrapbook org eclipse jdt core tests model modifying resource tests modifyingresourcetests generate class file generateclassfile bytes create file createfile lib bytes i class file iclassfile get class file getclassfile lib i type itype binary type binarytype get type gettype get java model getjavamodel delete i java element ijavaelement binary type binarytype java model exception javamodelexception assert true asserttrue read get status getstatus get code getcode i java model status constants ijavamodelstatusconstants read assert true asserttrue delete file delete project deleteproject delete test delete compilation unit testdeletecompilationunit core exception coreexception create file createfile java i compilation unit icompilationunit get compilation unit getcompilationunit java start deltas startdeltas delete assert true asserttrue delete exists assert deltas assertdeltas unexpected delta children project root children children java stop deltas stopdeltas delete file deletefile java ensure deleted nested root disappears existence test delete compilation unit testdeletecompilationunit core exception coreexception i file ifile file create file createfile java i compilation unit icompilationunit get compilation unit getcompilationunit java start deltas startdeltas util delete file assert true asserttrue delete exists assert deltas assertdeltas unexpected delta children project root children children java stop deltas stopdeltas delete file deletefile java deleting i workspace runnable iworkspacerunnable exist regression test bug i compilation unit icompilationunit delete fails test delete compilation unit testdeletecompilationunit core exception coreexception create file createfile java i compilation unit icompilationunit get compilation unit getcompilationunit java force opened open start deltas startdeltas resources plugin resourcesplugin get workspace getworkspace i workspace runnable iworkspacerunnable i progress monitor iprogressmonitor monitor core exception coreexception delete assert true asserttrue delete exists assert true asserttrue delete exists assert deltas assertdeltas unexpected delta children project root children children java stop deltas stopdeltas delete file deletefile java delete test delete compilation unit testdeletecompilationunit core exception coreexception create folder createfolder i file ifile file create file createfile java i compilation unit icompilationunit get compilation unit getcompilationunit java start deltas startdeltas delete assert true asserttrue exist exists assert true asserttrue file exist file exists assert deltas assertdeltas unexpected delta children project root children children java stop deltas stopdeltas delete folder deletefolder ensures primary type file deleted regression test compilation unit contents retrieved file deleted test delete compilation unit testdeletecompilationunit core exception coreexception i package fragment ipackagefragment pkg get package getpackage pkg create compilation unit createcompilationunit java force opening get compilation unit getcompilationunit java open i file ifile file get file getfile java file delete i compilation unit icompilationunit java core javacore create compilation unit from createcompilationunitfrom file i type itype type find primary type findprimarytype assert null assertnull find primary type type delete file deletefile java ensures constructor deleted verify correct change deltas generated test delete constructor testdeleteconstructor core exception coreexception create file createfile java string i compilation unit icompilationunit get compilation unit getcompilationunit java i method imethod constructor get type gettype get method getmethod string q string qstring start deltas startdeltas assert deletion assertdeletion constructor assert true asserttrue delete constructor constructor exists assert deltas assertdeltas unexpected delta children project root children children java children fine grained primary resource children fine grained string stop deltas stopdeltas delete file deletefile java ensure deleting empty fragment test delete empty package fragment testdeleteemptypackagefragment core exception coreexception create folder createfolder i package fragment ipackagefragment pkg get package getpackage i folder ifolder folder get folder getfolder start deltas startdeltas pkg delete assert true asserttrue folder exist folder exists assert true asserttrue fragment exist pkg exists assert deltas assertdeltas unexpected delta stop deltas stopdeltas delete folder deletefolder ensures field deleted test delete field testdeletefield core exception coreexception test delete field testdeletefield create file createfile java field i compilation unit icompilationunit get compilation unit getcompilationunit java i field ifield field get type gettype get field getfield field start deltas startdeltas assert deletion assertdeletion field assert deltas assertdeltas unexpected delta children project root children children java children fine grained primary resource children fine grained field stop deltas stopdeltas delete file deletefile java ensures deletion can celed canceled test delete field testdeletefield core exception coreexception test delete field with cancel testdeletefieldwithcancel create file createfile java field i compilation unit icompilationunit get compilation unit getcompilationunit java i field ifield field get type gettype get field getfield field is canceled iscanceled test progress monitor testprogressmonitor monitor test progress monitor testprogressmonitor get instance getinstance monitor set cancelled counter setcancelledcounter get java model getjavamodel delete i java element ijavaelement field monitor operation canceled exception operationcanceledexception is canceled iscanceled assert true asserttrue operation thrown operation can celed canceled exception is canceled iscanceled delete file deletefile java ensures field deleted scheduling rule include resource regression test bug i source manipulation isourcemanipulation delete workspace root workspaceroot scheduling rule test delete field testdeletefield core exception coreexception i file ifile file create file createfile java field i compilation unit icompilationunit get compilation unit getcompilationunit java i field ifield field get type gettype get field getfield field start deltas startdeltas get workspace getworkspace i workspace runnable iworkspacerunnable i progress monitor iprogressmonitor monitor core exception coreexception assert deletion assertdeletion field file i workspace iworkspace avoid update assert deltas assertdeltas unexpected delta children project root children children java children fine grained primary resource children fine grained field stop deltas stopdeltas delete file deletefile java ensures field initializer deleted regression test bug i field ifield delete deleting variable test delete field testdeletefield core exception coreexception create file createfile java string sample test i compilation unit icompilationunit get compilation unit getcompilationunit java i field ifield field get type gettype get field getfield field delete assert source equals assertsourceequals unexpected source get source getsource delete file deletefile java delete enum test delete field testdeletefield core exception coreexception create java project createjavaproject string string jcl lib create file createfile java enum i compilation unit icompilationunit get compilation unit getcompilationunit java i field ifield field get type gettype get field getfield field delete assert source equals assertsourceequals unexpected source enum get source getsource delete project deleteproject ensures declaration deleted test delete import declaration testdeleteimportdeclaration core exception coreexception create file createfile java java util i compilation unit icompilationunit get compilation unit getcompilationunit java i import declaration iimportdeclaration imp get import getimport start deltas startdeltas assert deletion assertdeletion imp assert deltas assertdeltas unexpected delta children project root children children java children fine grained primary resource container children fine grained stop deltas stopdeltas delete file deletefile java ensures method deleted test delete method testdeletemethod core exception coreexception create file createfile java foo i compilation unit icompilationunit get compilation unit getcompilationunit java i method imethod method get type gettype get method getmethod foo string start deltas startdeltas assert deletion assertdeletion method assert deltas assertdeltas unexpected delta children project root children children java children fine grained primary resource children fine grained foo stop deltas stopdeltas delete file deletefile java ensures multiple member java elements contained compilation units deleted verifies correct changed deltas generated test delete multiple members from various us testdeletemultiplemembersfromvariouscus core exception coreexception create folder createfolder create file createfile java java util vector java util enumeration main string args system println bar java lang string test test minor testminor bar test create file createfile java foo main string args system println elements deleted java java util vector main bar type bar constructor test bar type java foo main i compilation unit icompilationunit cu x cux get compilation unit getcompilationunit java i type itype type x typex cu x cux get type gettype i type itype type bar typebar type x typex get type gettype bar i java element ijavaelement to be deleted tobedeleted i java element ijavaelement to be deleted tobedeleted cu x cux get import getimport java util vector to be deleted tobedeleted type x typex get method getmethod main string q string qstring to be deleted tobedeleted type bar typebar to be deleted tobedeleted type bar typebar get method getmethod bar string to be deleted tobedeleted type bar typebar get method getmethod test string to be deleted tobedeleted type bar typebar i compilation unit icompilationunit cu y cuy get compilation unit getcompilationunit java i type itype type y typey cu y cuy get type gettype to be deleted tobedeleted type y typey get field getfield foo to be deleted tobedeleted type y typey get method getmethod main string q string qstring start deltas startdeltas assert deletion assertdeletion to be deleted tobedeleted assert deltas assertdeltas unexpected delta children project root children children java children fine grained primary resource container children fine grained java util vector children fine grained bar main string children java children fine grained primary resource children fine grained foo main string stop deltas stopdeltas delete folder deletefolder ensures declaration deleted compilation unit test delete package declaration testdeletepackagedeclaration core exception coreexception create folder createfolder create file createfile java i compilation unit icompilationunit get compilation unit getcompilationunit java i package declaration ipackagedeclaration package declaration packagedeclaration get package declaration getpackagedeclaration start deltas startdeltas assert deletion assertdeletion package declaration packagedeclaration assert deltas assertdeltas unexpected delta children project root children children java children fine grained primary resource stop deltas stopdeltas delete folder deletefolder test delete package fragment testdeletepackagefragment core exception coreexception create folder createfolder create file createfile java i package fragment ipackagefragment pkg get package getpackage i folder ifolder folder get folder getfolder start deltas startdeltas pkg delete assert true asserttrue folder exist folder exists assert true asserttrue fragment exist pkg exists assert deltas assertdeltas unexpected delta children project root children stop deltas stopdeltas delete folder deletefolder ensures deleting doesn remove source folder regression test bug delete removing removes source folder test delete package fragment testdeletepackagefragment core exception coreexception create java project createjavaproject string src bin i file ifile file create file createfile src java i package fragment ipackagefragment pkg get package getpackage src i folder ifolder folder get folder getfolder src i compilation unit icompilationunit get compilation unit getcompilationunit src java start deltas startdeltas pkg delete assert true asserttrue folder exist folder exists assert true asserttrue fragment exist pkg exists assert true asserttrue file longer exist file exists assert true asserttrue compilation unit longer exist exists assert deltas assertdeltas unexpected delta children src children children java stop deltas stopdeltas delete project deleteproject ensures deleting prj src removes compilation units successful regression test bug deleting source folder test delete package fragment testdeletepackagefragment core exception coreexception create java project createjavaproject i file ifile file create file createfile java i package fragment ipackagefragment pkg get package getpackage i project iproject project get project getproject i compilation unit icompilationunit get compilation unit getcompilationunit java start deltas startdeltas pkg delete assert true asserttrue project exist project exists assert true asserttrue fragment exist pkg exists assert true asserttrue file longer exist file exists assert true asserttrue compilation unit longer exist exists assert deltas assertdeltas unexpected delta children project root children children java stop deltas stopdeltas delete project deleteproject ensures deleting file successful regression test bug unable discard empty files test delete package fragment testdeletepackagefragment core exception coreexception create java project createjavaproject i folder ifolder folder create folder createfolder i file ifile file create file createfile i package fragment ipackagefragment pkg get package getpackage start deltas startdeltas pkg delete assert true asserttrue folder longer exist folder exists assert true asserttrue fragment longer exist pkg exists assert true asserttrue file longer exist file exists assert deltas assertdeltas unexpected delta children project root children stop deltas stopdeltas delete project deleteproject ensures deleting project jar tool factory toolfactory create default class file reader createdefaultclassfilereader works regression test bug error deleting project jar file referenced project test delete project after using jar testdeleteprojectafterusingjar core exception coreexception io exception ioexception i java project ijavaproject java project javaproject create java project createjavaproject add library addlibrary java project javaproject lib jar libs rc libsrc zip string java java core javacore version i class file iclassfile class file classfile get class file getclassfile lib jar tool factory toolfactory create default class file reader createdefaultclassfilereader class file classfile i class file reader iclassfilereader util delete java project javaproject get project getproject get project getproject exists system delete project deleteproject ensures field deleted syntax errors test delete syntax error field testdeletesyntaxerrorfield core exception coreexception create file createfile java missing semi colon field i compilation unit icompilationunit get compilation unit getcompilationunit java i field ifield field get type gettype get field getfield field start deltas startdeltas assert deletion assertdeletion field assert deltas assertdeltas unexpected delta children project root children children java children fine grained primary resource children fine grained field stop deltas stopdeltas delete file deletefile java ensures method deleted syntax errors test delete syntax error in method testdeletesyntaxerrorinmethod core exception coreexception create file createfile java foo string system println i compilation unit icompilationunit get compilation unit getcompilationunit java i method imethod method get type gettype get method getmethod foo string start deltas startdeltas assert deletion assertdeletion method assert deltas assertdeltas unexpected delta children project root children children java children fine grained primary resource children fine grained foo stop deltas stopdeltas delete file deletefile java ensures method deleted syntax errors test delete syntax error in method testdeletesyntaxerrorinmethod core exception coreexception create file createfile java foo i compilation unit icompilationunit get compilation unit getcompilationunit java i method imethod method get type gettype get method getmethod foo string start deltas startdeltas assert deletion assertdeletion method assert deltas assertdeltas unexpected delta children project root children children java children fine grained primary resource children fine grained foo stop deltas stopdeltas delete file deletefile java ensures method deleted syntax errors test delete syntax error in method testdeletesyntaxerrorinmethod core exception coreexception create file createfile java foo i compilation unit icompilationunit get compilation unit getcompilationunit java i method imethod method get type gettype get method getmethod foo string start deltas startdeltas assert deletion assertdeletion method assert deltas assertdeltas unexpected delta children project root children children java children fine grained primary resource children fine grained foo stop deltas stopdeltas delete file deletefile java ensures type deleted syntax errors test delete syntax error type testdeletesyntaxerrortype core exception coreexception create file createfile java method i compilation unit icompilationunit get compilation unit getcompilationunit java i type itype type get type gettype start deltas startdeltas assert deletion assertdeletion type assert deltas assertdeltas unexpected delta children project root children children java children fine grained primary resource stop deltas stopdeltas delete file deletefile java ensures type deleted compilation unit test delete type testdeletetype core exception coreexception create file createfile java i compilation unit icompilationunit get compilation unit getcompilationunit java i type itype type get type gettype start deltas startdeltas assert deletion assertdeletion type assert deltas assertdeltas unexpected delta children project root children children java children fine grained primary resource stop deltas stopdeltas delete file deletefile java delete type nested root folder project folder test delete type testdeletetype core exception coreexception create java project createjavaproject string src bin create file createfile src java i compilation unit icompilationunit get compilation unit getcompilationunit src java i type itype type get type gettype start deltas startdeltas assert deletion assertdeletion type assert deltas assertdeltas unexpected delta children src children children java children fine grained primary resource stop deltas stopdeltas delete project deleteproject ensure correct exception thrown invalid input code delete operation deleteoperation code test delete with invalid input testdeletewithinvalidinput core exception coreexception i type itype type create file createfile java i compilation unit icompilationunit get compilation unit getcompilationunit java type get type gettype get java model getjavamodel delete java model exception javamodelexception assert true asserttrue elements process supplied get status getstatus get code getcode i java model status constants ijavamodelstatusconstants elements process get java model getjavamodel delete i java element ijavaelement type java model exception javamodelexception assert true asserttrue elements process array supplied get status getstatus get code getcode i java model status constants ijavamodelstatusconstants elements process delete file deletefile java