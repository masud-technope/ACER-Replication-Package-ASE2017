copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt tests package view packageview java file junit framework test junit framework test case testcase junit framework test suite testsuite org eclipse jdt test plugin testplugin java project helper javaprojecthelper org eclipse jdt test plugin testplugin java test plugin javatestplugin org eclipse core runtime path org eclipse core resources i file ifile org eclipse core resources i resource iresource org eclipse core resources i workspace iworkspace org eclipse core resources i workspace description iworkspacedescription org eclipse core resources resources plugin resourcesplugin org eclipse jface viewers i tree content provider itreecontentprovider org eclipse i view part iviewpart org eclipse i workbench iworkbench org eclipse i workbench page iworkbenchpage org eclipse platformui org eclipse jdt core element changed event elementchangedevent org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i element changed listener ielementchangedlistener org eclipse jdt core i java element ijavaelement org eclipse jdt core i java element delta ijavaelementdelta org eclipse jdt core i java project ijavaproject org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt internal util core utility coreutility tests package explorer content provider packageexplorercontentprovider content provider tests contentprovidertests test case testcase test suite test suite testsuite suite test suite testsuite content provider tests contentprovidertests get name getname j unit junit suite add test suite addtestsuite content provider tests contentprovidertests j unit junit suite i java project ijavaproject fjproject i java project ijavaproject fjproject i package fragment root ipackagefragmentroot f root froot i package fragment ipackagefragment f pack fpack i package fragment ipackagefragment f pack fpack i package fragment ipackagefragment f pack fpack i package fragment ipackagefragment f pack fpack i workspace iworkspace f workspace fworkspace i workbench iworkbench f workbench fworkbench mock plugin view mockpluginview f my part fmypart i tree content provider itreecontentprovider f provider fprovider i package fragment root ipackagefragmentroot f archive fragment root farchivefragmentroot i package fragment ipackagefragment f pack junit fpackjunit i package fragment ipackagefragment f pack junit samples fpackjunitsamples i package fragment ipackagefragment f pack junit samples money fpackjunitsamplesmoney i package fragment ipackagefragment f pack fpack i package fragment ipackagefragment f pack junit ext entions fpackjunitextentions i package fragment ipackagefragment f pack junit framework fpackjunitframework i package fragment ipackagefragment f pack junit runner fpackjunitrunner i package fragment ipackagefragment f pack junit text ui fpackjunittextui i package fragment ipackagefragment f pack junit ui fpackjunitui i package fragment ipackagefragment f pack junit tests fpackjunittests i compilation unit icompilationunit fcuimoney i compilation unit icompilationunit fcumoney i compilation unit icompilationunit fcumoneybag i compilation unit icompilationunit fcumoneytest i compilation unit icompilationunit fcu i compilation unit icompilationunit fcu i compilation unit icompilationunit fcu i file ifile f file ffile i file ifile f file ffile i workbench page iworkbenchpage i package fragment root ipackagefragmentroot jdk f enable auto build after testing fenableautobuildaftertesting content provider tests contentprovidertests string test get children getchildren test get children project with source folders testgetchildrenprojectwithsourcefolders exception object expected children expectedchildren object f root froot f file ffile f file ffile jdk object children f provider fprovider get children getchildren fjproject nls assert true asserttrue wrong children project folding compare arrays comparearrays children expected children expectedchildren test get children t mid level fragment testgetchildrentmidlevelfragment exception object expected children expectedchildren object f pack fpack f pack fpack object children f provider fprovider get children getchildren f pack fpack nls assert true asserttrue wrong children package fragment packagefragment folding compare arrays comparearrays children expected children expectedchildren test get children bottom level fragment testgetchildrenbottomlevelfragment exception object expected children expectedchildren object object children f provider fprovider get children getchildren f pack fpack nls assert true asserttrue wrong children package fragment packagefragment folding compare arrays comparearrays children expected children expectedchildren test get children bottom level fragment with u testgetchildrenbottomlevelfragmentwithcu exception object expected children expectedchildren object fcu object children f provider fprovider get children getchildren f pack fpack nls assert true asserttrue wrong children package fragment packagefragment folding compare arrays comparearrays children expected children expectedchildren test get children bottom level fragment in archive testgetchildrenbottomlevelfragmentinarchive exception object expected children expectedchildren object fcuimoney fcumoney fcumoneybag fcumoneytest object children f provider fprovider get children getchildren f pack junit samples money fpackjunitsamplesmoney nls assert true asserttrue wrong children bottom package fragment packagefragment package fragment root packagefragmentroot archive folding compare arrays comparearrays children expected children expectedchildren test get children source testgetchildrensource exception nls object expected children expectedchildren object f pack fpack f pack fpack f pack fpack f root froot get package fragment getpackagefragment object children f provider fprovider get children getchildren f root froot nls assert true asserttrue wrong children package fragment root packagefragmentroot folding compare arrays comparearrays children expected children expectedchildren test get children archive testgetchildrenarchive nls object expected children expectedchildren object f pack junit fpackjunit f archive fragment root farchivefragmentroot get package fragment getpackagefragment object children f provider fprovider get children getchildren f archive fragment root farchivefragmentroot nls assert true asserttrue wrong child package fragment root packagefragmentroot archive folding compare arrays comparearrays children expected children expectedchildren parent tests test get parent archive testgetparentarchive exception object parent f provider fprovider get parent getparent f archive fragment root farchivefragmentroot nls assert true asserttrue wrong parent package fragment root packagefragmentroot archive folding parent fjproject test get parent top level fragment in archive testgetparenttoplevelfragmentinarchive exception object expected parent expectedparent f pack junit fpackjunit object parent f provider fprovider get parent getparent f pack junit samples fpackjunitsamples nls assert true asserttrue wrong parent top level package fragment packagefragment archive folding expected parent expectedparent equals parent test get parent top level fragment testgetparenttoplevelfragment exception object expected parent expectedparent f root froot object parent f provider fprovider get parent getparent f pack fpack nls assert true asserttrue wrong parent top level package fragment packagefragment folding expected parent expectedparent equals parent test get parent folded bottom fragment testgetparentfoldedbottomfragment exception object expected parent expectedparent f root froot object parent f provider fprovider get parent getparent f pack fpack nls assert true asserttrue wrong parent top level package fragment packagefragment folding expected parent expectedparent equals parent test get parent mid level fragment testgetparentmidlevelfragment exception object expected parent expectedparent f pack fpack object parent f provider fprovider get parent getparent f pack fpack nls assert true asserttrue wrong parent top level package fragment packagefragment folding expected parent expectedparent equals parent test delete bottom level fragment folding testdeletebottomlevelfragmentfolding exception send delta indicating fragment deleted i element changed listener ielementchangedlistener listener i element changed listener ielementchangedlistener f provider fprovider i java element delta ijavaelementdelta delta test delta testdelta create delta createdelta f pack fpack i java element delta ijavaelementdelta removed listener element changed elementchanged element changed event elementchangedevent delta element changed event elementchangedevent post change force events dispaly f my part fmypart get tree viewer gettreeviewer get control getcontrol get display getdisplay read and dispatch readanddispatch nls assert true asserttrue refresh happened f my part fmypart has refresh happened hasrefreshhappened nls assert true asserttrue correct refresh f my part fmypart was object ref res hed wasobjectrefreshed f root froot nls assert true asserttrue single refresh f my part fmypart get ref res hed object getrefreshedobject size test add bottom level fragment folding testaddbottomlevelfragmentfolding exception nls i package fragment ipackagefragment test f root froot create package fragment createpackagefragment test send delta indicating fragment deleted i element changed listener ielementchangedlistener listener i element changed listener ielementchangedlistener f provider fprovider i java element delta ijavaelementdelta delta test delta testdelta create delta createdelta test i java element delta ijavaelementdelta listener element changed elementchanged element changed event elementchangedevent delta element changed event elementchangedevent post change force events dispaly f my part fmypart get tree viewer gettreeviewer get control getcontrol get display getdisplay read and dispatch readanddispatch nls assert true asserttrue add happened f my part fmypart has add happened hasaddhappened nls assert true asserttrue refresh happened f my part fmypart has refresh happened hasrefreshhappened nls assert true asserttrue correct refresh f my part fmypart was object ref res hed wasobjectrefreshed f root froot nls assert true asserttrue single refresh f my part fmypart get ref res hed object getrefreshedobject size test changed top level package fragment folding testchangedtoplevelpackagefragmentfolding exception send delta indicating fragment deleted i element changed listener ielementchangedlistener listener i element changed listener ielementchangedlistener f provider fprovider i java element delta ijavaelementdelta delta test delta testdelta create delta createdelta f pack fpack i java element delta ijavaelementdelta changed listener element changed elementchanged element changed event elementchangedevent delta element changed event elementchangedevent post change force events dispaly f my part fmypart get tree viewer gettreeviewer get control getcontrol get display getdisplay read and dispatch readanddispatch nls assert equals assertequals ref res hs refreshs f my part fmypart get ref res hed object getrefreshedobject size test change bottom level package fragment folding testchangebottomlevelpackagefragmentfolding exception send delta indicating fragment deleted i element changed listener ielementchangedlistener listener i element changed listener ielementchangedlistener f provider fprovider i java element delta ijavaelementdelta delta test delta testdelta create delta createdelta f pack fpack i java element delta ijavaelementdelta changed listener element changed elementchanged element changed event elementchangedevent delta element changed event elementchangedevent post change force events dispaly f my part fmypart get tree viewer gettreeviewer get control getcontrol get display getdisplay read and dispatch readanddispatch nls assert equals assertequals ref res hs refreshs f my part fmypart get ref res hed object getrefreshedobject size test remove us from package fragment testremovecusfrompackagefragment exception send delta indicating fragment deleted i element changed listener ielementchangedlistener listener i element changed listener ielementchangedlistener f provider fprovider i java element delta ijavaelementdelta delta test delta testdelta createcudelta i compilation unit icompilationunit fcu fcu f pack fpack i java element delta ijavaelementdelta removed listener element changed elementchanged element changed event elementchangedevent delta element changed event elementchangedevent post change force events display f my part fmypart get tree viewer gettreeviewer get control getcontrol get display getdisplay read and dispatch readanddispatch removing refresh nls assert equals assertequals refresh f my part fmypart get ref res hed object getrefreshedobject size test remove from package fragment testremovecufrompackagefragment exception send delta indicating fragment deleted i element changed listener ielementchangedlistener listener i element changed listener ielementchangedlistener f provider fprovider i java element delta ijavaelementdelta delta test delta testdelta createcudelta i compilation unit icompilationunit fcu f pack fpack i java element delta ijavaelementdelta removed listener element changed elementchanged element changed event elementchangedevent delta element changed event elementchangedevent post change force events display f my part fmypart get tree viewer gettreeviewer get control getcontrol get display getdisplay read and dispatch readanddispatch nls assert true asserttrue remove happened f my part fmypart has remove happened hasremovehappened nls assert true asserttrue correct refresh f my part fmypart get removed objects getremovedobjects fcu nls assert equals assertequals ref res hes refreshes f my part fmypart get ref res hed object getrefreshedobject size test case testcase set up setup override set up setup exception set up setup f workspace fworkspace resources plugin resourcesplugin get workspace getworkspace assert not null assertnotnull f workspace fworkspace i workspace description iworkspacedescription workspace desc workspacedesc f workspace fworkspace get description getdescription f enable auto build after testing fenableautobuildaftertesting workspace desc workspacedesc is auto building isautobuilding f enable auto build after testing fenableautobuildaftertesting core utility coreutility set auto building setautobuilding nls nls fjproject java project helper javaprojecthelper create java project createjavaproject test project testproject bin nls nls fjproject java project helper javaprojecthelper create java project createjavaproject test project testproject bin nls assert not null assertnotnull project fjproject nls assert not null assertnotnull project fjproject object resource fjproject get non java resources getnonjavaresources resource length object object resource object i file ifile i file ifile file i file ifile object classpath equals nls file get name getname f file ffile file project equals nls file get name getname f file ffile file assert not null assertnotnull f file ffile assert not null assertnotnull f file ffile project external jar zip file nls jdk java project helper javaprojecthelper addvariablertjar fjproject jre lib test nls assert true asserttrue jdk jdk file junit src archive junitsrcarchive java test plugin javatestplugin get default getdefault get file in plugin getfileinplugin java project helper javaprojecthelper junit src nls assert true asserttrue junit src junit src archive junitsrcarchive junit src archive junitsrcarchive exists nls f archive fragment root farchivefragmentroot java project helper javaprojecthelper add source container with import addsourcecontainerwithimport fjproject src junit src archive junitsrcarchive java project helper javaprojecthelper junit src encoding nls f pack junit fpackjunit f archive fragment root farchivefragmentroot get package fragment getpackagefragment junit nls f pack junit samples fpackjunitsamples f archive fragment root farchivefragmentroot get package fragment getpackagefragment junit samples nls f pack junit samples money fpackjunitsamplesmoney f archive fragment root farchivefragmentroot get package fragment getpackagefragment junit samples money nls f pack junit ext entions fpackjunitextentions f archive fragment root farchivefragmentroot get package fragment getpackagefragment junit extensions nls f pack junit framework fpackjunitframework f archive fragment root farchivefragmentroot get package fragment getpackagefragment junit framework nls f pack junit runner fpackjunitrunner f archive fragment root farchivefragmentroot get package fragment getpackagefragment junit runner nls f pack junit tests fpackjunittests f archive fragment root farchivefragmentroot get package fragment getpackagefragment junit tests nls f pack junit text ui fpackjunittextui f archive fragment root farchivefragmentroot get package fragment getpackagefragment junit text ui textui nls f pack junit ui fpackjunitui f archive fragment root farchivefragmentroot get package fragment getpackagefragment junit nls assert not null assertnotnull creating f pack junit fpackjunit f pack junit fpackjunit nls assert not null assertnotnull creating f pack junit samples fpackjunitsamples f pack junit samples fpackjunitsamples nls assert not null assertnotnull creating f pack junit samples money fpackjunitsamplesmoney f pack junit samples money fpackjunitsamplesmoney nls assert not null assertnotnull f pack junit ext entions fpackjunitextentions nls assert not null assertnotnull f pack junit framework fpackjunitframework nls assert not null assertnotnull f pack junit runner fpackjunitrunner nls assert not null assertnotnull f pack junit tests fpackjunittests nls assert not null assertnotnull f pack junit text ui fpackjunittextui nls assert not null assertnotnull f pack junit ui fpackjunitui nls fcuimoney f pack junit samples money fpackjunitsamplesmoney get compilation unit getcompilationunit i money imoney java nls fcumoney f pack junit samples money fpackjunitsamplesmoney get compilation unit getcompilationunit money java nls fcumoneybag f pack junit samples money fpackjunitsamplesmoney get compilation unit getcompilationunit money bag moneybag java nls fcumoneytest f pack junit samples money fpackjunitsamplesmoney get compilation unit getcompilationunit money test moneytest java file mylib jar mylibjar java test plugin javatestplugin get default getdefault get file in plugin getfileinplugin java project helper javaprojecthelper mylib nls assert true asserttrue lib mylib jar mylibjar mylib jar mylibjar exists java project helper javaprojecthelper add library with import addlibrarywithimport fjproject path fromosstring mylib jar mylibjar get path getpath project file system structure source folder nls java project helper javaprojecthelper add variable entry addvariableentry fjproject path jre lib test nls f root froot java project helper javaprojecthelper add source container addsourcecontainer fjproject src nls f pack fpack f root froot create package fragment createpackagefragment pack nls f pack fpack f root froot create package fragment createpackagefragment pack nls f pack fpack f root froot create package fragment createpackagefragment pack nls f pack fpack f root froot create package fragment createpackagefragment pack pack nls f root froot create package fragment createpackagefragment pack pack nls f pack fpack f root froot create package fragment createpackagefragment pack pack pack nls nls fcu f pack fpack create compilation unit createcompilationunit object java nls nls fcu f pack fpack create compilation unit createcompilationunit object java nls nls fcu f pack fpack create compilation unit createcompilationunit jen java mock view set up mock view setupmockview set up mock view setupmockview exception f workspace fworkspace resources plugin resourcesplugin get workspace getworkspace assert not null assertnotnull f workspace fworkspace f workbench fworkbench platformui get workbench getworkbench assert not null assertnotnull f workbench fworkbench f workbench fworkbench get active workbench window getactiveworkbenchwindow get active page getactivepage assert not null assertnotnull testing created i view part iviewpart my part mypart mock plugin view mockpluginview assert not null assertnotnull my part mypart nls my part mypart show view showview org eclipse jdt tests package view packageview mock plugin view mockpluginview my part mypart mock plugin view mockpluginview f my part fmypart mock plugin view mockpluginview my part mypart turn folding f my part fmypart set folding setfolding f my part fmypart set flat layout setflatlayout call property change event f my part fmypart clear f provider fprovider i tree content provider itreecontentprovider f my part fmypart get tree viewer gettreeviewer get content provider getcontentprovider nls assert true asserttrue unable view assert not null assertnotnull f provider fprovider test case testcase tear down teardown override tear down teardown exception f archive fragment root farchivefragmentroot close java project helper javaprojecthelper delete fjproject java project helper javaprojecthelper delete fjproject hide view hideview f my part fmypart f enable auto build after testing fenableautobuildaftertesting core utility coreutility set auto building setautobuilding tear down teardown method compare arrays comparearrays arrays i package fragments ipackagefragments compare fail param children param expected children expectedchildren compare arrays comparearrays object children object expected children expectedchildren children length expected children expectedchildren length children length object child children child i java element ijavaelement i java element ijavaelement i java element ijavaelement child expected children expectedchildren child i resource iresource i resource iresource res i resource iresource child res expected children expectedchildren method param res param expected children expectedchildren i resource iresource res object expected children expectedchildren expected children expectedchildren length object object expected children expectedchildren object i resource iresource i resource iresource exp res expres i resource iresource object exp res expres equals res method param fragment param expected children expectedchildren i java element ijavaelement fragment object expected children expectedchildren expected children expectedchildren length object object expected children expectedchildren object i java element ijavaelement i java element ijavaelement exp frag expfrag i java element ijavaelement object exp frag expfrag equals fragment