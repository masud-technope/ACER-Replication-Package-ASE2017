copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt tests package view packageview java file junit framework test junit framework test case testcase junit framework test suite testsuite org eclipse jdt test plugin testplugin java project helper javaprojecthelper org eclipse jdt test plugin testplugin java test plugin javatestplugin org eclipse core runtime path org eclipse core resources i file ifile org eclipse core resources i resource iresource org eclipse core resources i workspace iworkspace org eclipse core resources i workspace description iworkspacedescription org eclipse core resources resources plugin resourcesplugin org eclipse jface viewers i tree content provider itreecontentprovider org eclipse i view part iviewpart org eclipse i workbench iworkbench org eclipse i workbench page iworkbenchpage org eclipse platformui org eclipse jdt core i class file iclassfile org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i java element ijavaelement org eclipse jdt core i java project ijavaproject org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt internal util core utility coreutility tests package explorer content provider packageexplorercontentprovider content provider tests contentprovidertests test case testcase test suite test suite testsuite suite test suite testsuite content provider tests contentprovidertests get name getname j unit junit suite add test suite addtestsuite content provider tests contentprovidertests j unit junit suite i package fragment root ipackagefragmentroot f root froot i package fragment ipackagefragment f pack fpack i package fragment ipackagefragment f pack fpack i package fragment ipackagefragment f pack fpack i package fragment ipackagefragment f pack fpack i workspace iworkspace f workspace fworkspace i workbench iworkbench f workbench fworkbench mock plugin view mockpluginview f my part fmypart i tree content provider itreecontentprovider f provider fprovider i package fragment root ipackagefragmentroot jdk i package fragment ipackagefragment f pack fpack i java project ijavaproject fjproject i package fragment ipackagefragment f pack fpack i package fragment root ipackagefragmentroot f internal root finternalroot i package fragment ipackagefragment i package fragment ipackagefragment i package fragment ipackagefragment i package fragment ipackagefragment i package fragment ipackagefragment i file ifile f file ffile i file ifile f file ffile i compilation unit icompilationunit fcu i compilation unit icompilationunit fcu i class file iclassfile f class file fyclassfile i workbench page iworkbenchpage f enable auto build after testing fenableautobuildaftertesting content provider tests contentprovidertests string test get children project testgetchildrenproject exception nls object expected children expectedchildren object f pack fpack f pack fpack f pack fpack f root froot get package fragment getpackagefragment f file ffile f file ffile f internal root finternalroot jdk object children f provider fprovider get children getchildren fjproject nls assert true asserttrue wrong children project compare arrays comparearrays children expected children expectedchildren test get children t mid level fragment testgetchildrentmidlevelfragment exception object expected children expectedchildren object f pack fpack f pack fpack object children f provider fprovider get children getchildren f pack fpack nls assert true asserttrue wrong children package fragment packagefragment compare arrays comparearrays children expected children expectedchildren test get children bottom level fragment testgetchildrenbottomlevelfragment exception object expected children expectedchildren object object children f provider fprovider get children getchildren f pack fpack nls assert true asserttrue wrong children package fragment packagefragment compare arrays comparearrays children expected children expectedchildren test get children bottom level fragment with u testgetchildrenbottomlevelfragmentwithcu exception object expected children expectedchildren object fcu object children f provider fprovider get children getchildren f pack fpack nls assert true asserttrue wrong children package fragment packagefragment compare arrays comparearrays children expected children expectedchildren test get children bottom level fragment file testgetchildrenbottomlevelfragmentfile exception object expected children expectedchildren object object children f provider fprovider get children getchildren f pack fpack nls assert true asserttrue wrong children package fragment packagefragment file compare arrays comparearrays children expected children expectedchildren test get children bottom level fragment testgetchildrenbottomlevelfragment exception object expected children expectedchildren object fcu object children f provider fprovider get children getchildren f pack fpack nls assert true asserttrue wrong children package fragment packagefragment compare arrays comparearrays children expected children expectedchildren test get children mid level fragment in internal archive testgetchildrenmidlevelfragmentininternalarchive exception object expected children expectedchildren object object children f provider fprovider get children getchildren nls assert true asserttrue wrong children bottom package fragment packagefragment package fragment root packagefragmentroot internal archive compare arrays comparearrays children expected children expectedchildren test get children bottom level fragment in internal archive testgetchildrenbottomlevelfragmentininternalarchive exception object expected children expectedchildren object f class file fyclassfile object children f provider fprovider get children getchildren nls assert true asserttrue wrong children bottom package fragment packagefragment package fragment root packagefragmentroot internal archive compare arrays comparearrays children expected children expectedchildren get children internal archive getchildreninternalarchive exception nls object expected children expectedchildren object f internal root finternalroot get package fragment getpackagefragment object children f provider fprovider get children getchildren f internal root finternalroot nls assert true asserttrue wrong child package fragment root packagefragmentroot internal archive compare arrays comparearrays children expected children expectedchildren parent tests test get parent archive testgetparentarchive exception object parent f provider fprovider get parent getparent f internal root finternalroot nls assert true asserttrue wrong parent package fragment root packagefragmentroot archive parent fjproject test get parent mid level fragment in archive testgetparentmidlevelfragmentinarchive exception object expected parent expectedparent object parent f provider fprovider get parent getparent nls assert true asserttrue wrong parent top level package fragment packagefragment archive expected parent expectedparent equals parent test get parent top level fragment in archive testgetparenttoplevelfragmentinarchive exception object expected parent expectedparent f internal root finternalroot object parent f provider fprovider get parent getparent nls assert true asserttrue wrong parent top level package fragment packagefragment archive expected parent expectedparent equals parent test get parent top level fragment testgetparenttoplevelfragment exception object expected parent expectedparent fjproject object parent f provider fprovider get parent getparent f pack fpack nls assert true asserttrue wrong parent top level package fragment packagefragment expected parent expectedparent equals parent test get parent mid level fragment testgetparentmidlevelfragment exception object expected parent expectedparent f pack fpack object parent f provider fprovider get parent getparent f pack fpack nls assert true asserttrue wrong parent top level package fragment packagefragment expected parent expectedparent equals parent methods test case testcase set up setup override set up setup exception set up setup f workspace fworkspace resources plugin resourcesplugin get workspace getworkspace assert not null assertnotnull f workspace fworkspace i workspace description iworkspacedescription workspace desc workspacedesc f workspace fworkspace get description getdescription f enable auto build after testing fenableautobuildaftertesting workspace desc workspacedesc is auto building isautobuilding f enable auto build after testing fenableautobuildaftertesting core utility coreutility set auto building setautobuilding create project nls nls fjproject java project helper javaprojecthelper create java project createjavaproject test project testproject bin nls assert not null assertnotnull project fjproject object resource fjproject get non java resources getnonjavaresources resource length object object resource object i file ifile i file ifile file i file ifile object nls classpath equals nls file get name getname f file ffile file nls project equals nls file get name getname f file ffile file assert not null assertnotnull f file ffile assert not null assertnotnull f file ffile add jar nls jdk java project helper javaprojecthelper addvariablertjar fjproject jre lib test nls assert true asserttrue jdk jdk create package fragment root packagefragmentroot represents project source folder nls f root froot java project helper javaprojecthelper add source container addsourcecontainer fjproject nls assert not null assertnotnull f root froot project file system structure project source folder add internal jar nls file my internal lib jar myinternallibjar java test plugin javatestplugin get default getdefault get file in plugin getfileinplugin path test resources testresources my internal lib myinternallib jar nls assert true asserttrue lib my internal lib jar myinternallibjar my internal lib jar myinternallibjar exists f internal root finternalroot java project helper javaprojecthelper add library with import addlibrarywithimport fjproject path fromosstring my internal lib jar myinternallibjar get path getpath create internal package fragments packagefragments nls f internal root finternalroot get package fragment getpackagefragment nls f internal root finternalroot get package fragment getpackagefragment nls f internal root finternalroot get package fragment getpackagefragment nls f internal root finternalroot get package fragment getpackagefragment nls f internal root finternalroot get package fragment getpackagefragment nls f internal root finternalroot get package fragment getpackagefragment nls f class file fyclassfile get class file getclassfile create package fragments packagefragments nls f pack fpack f root froot create package fragment createpackagefragment pack nls f pack fpack f root froot create package fragment createpackagefragment pack nls f pack fpack f root froot create package fragment createpackagefragment pack nls f pack fpack f root froot create package fragment createpackagefragment pack pack nls f pack fpack f root froot create package fragment createpackagefragment pack pack nls f pack fpack f root froot create package fragment createpackagefragment pack pack pack nls nls fcu f pack fpack create compilation unit createcompilationunit object java nls nls fcu f pack fpack create compilation unit createcompilationunit object java mock view set up mock view setupmockview set up mock view setupmockview exception f workspace fworkspace resources plugin resourcesplugin get workspace getworkspace assert not null assertnotnull f workspace fworkspace f workbench fworkbench platformui get workbench getworkbench assert not null assertnotnull f workbench fworkbench f workbench fworkbench get active workbench window getactiveworkbenchwindow get active page getactivepage assert not null assertnotnull testing created i view part iviewpart my part mypart mock plugin view mockpluginview assert not null assertnotnull my part mypart nls my part mypart show view showview org eclipse jdt tests package view packageview mock plugin view mockpluginview my part mypart mock plugin view mockpluginview f my part fmypart mock plugin view mockpluginview my part mypart f my part fmypart set folding setfolding f my part fmypart set flat layout setflatlayout call property change event f my part fmypart clear f provider fprovider i tree content provider itreecontentprovider f my part fmypart get tree viewer gettreeviewer get content provider getcontentprovider nls assert true asserttrue unable view assert not null assertnotnull f provider fprovider test case testcase tear down teardown override tear down teardown exception f internal root finternalroot close java project helper javaprojecthelper delete fjproject hide view hideview f my part fmypart f enable auto build after testing fenableautobuildaftertesting core utility coreutility set auto building setautobuilding tear down teardown method compare arrays comparearrays arrays i package fragments ipackagefragments compare fail param children param expected children expectedchildren compare arrays comparearrays object children object expected children expectedchildren children length expected children expectedchildren length children length object child children child i java element ijavaelement i java element ijavaelement i java element ijavaelement child expected children expectedchildren child i resource iresource i resource iresource res i resource iresource child res expected children expectedchildren method param res param expected children expectedchildren i resource iresource res object expected children expectedchildren expected children expectedchildren length object object expected children expectedchildren object i resource iresource i resource iresource exp res expres i resource iresource object exp res expres equals res method param fragment param expected children expectedchildren i java element ijavaelement fragment object expected children expectedchildren expected children expectedchildren length object object expected children expectedchildren object i java element ijavaelement i java element ijavaelement exp frag expfrag i java element ijavaelement object exp frag expfrag equals fragment