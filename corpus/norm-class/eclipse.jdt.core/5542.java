copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt core tests model java io exception ioexception java util vector junit framework test org eclipse core resources i project iproject org eclipse core resources i resource iresource org eclipse core resources i workspace runnable iworkspacerunnable org eclipse core runtime org eclipse jdt core org eclipse jdt internal core util util org eclipse team core repository provider repositoryprovider suppress warnings suppresswarnings rawtypes unchecked working copy tests workingcopytests modifying resource tests modifyingresourcetests i compilation unit icompilationunit i compilation unit icompilationunit copy test working copy owner testworkingcopyowner working copy owner workingcopyowner i buffer ibuffer create buffer createbuffer i compilation unit icompilationunit working copy workingcopy test buffer testbuffer working copy workingcopy working copy tests workingcopytests string test suite build model test suite buildmodeltestsuite working copy tests workingcopytests set u p setup exception set u p setup create java project createjavaproject string src string getexternaljclpathstring lib bin create folder createfolder src create file createfile src java java file inner inner innerinner inner field innerfield inner method innermethod string field field file path separator pathseparator field field foo get compilation unit getcompilationunit src java copy get working copy getworkingcopy core exception coreexception print stack trace printstacktrace runtime exception runtimeexception get message getmessage tear down teardown exception copy copy discard working copy discardworkingcopy delete project deleteproject tear down teardown ensures can celling cancelling consistent operation doesn leave working copy closed regression test bug incorrect fine grain delta method copy rename test cancel make consistent testcancelmakeconsistent java model exception javamodelexception string new contents newcontents bar copy get buffer getbuffer set contents setcontents new contents newcontents null progress monitor nullprogressmonitor monitor null progress monitor nullprogressmonitor monitor set canceled setcanceled copy make consistent makeconsistent monitor operation canceled exception operationcanceledexception assert true asserttrue working copy opened copy is open isopen test change content testchangecontent core exception coreexception string new contents newcontents bar copy get buffer getbuffer set contents setcontents new contents newcontents copy reconcile i compilation unit icompilationunit ast assert source equals assertsourceequals unexpected working copy contents new contents newcontents copy get buffer getbuffer get contents getcontents copy commit working copy commitworkingcopy assert source equals assertsourceequals unexpected original contents new contents newcontents get buffer getbuffer get contents getcontents ensures commit contents working copy read test change content of read only u testchangecontentofreadonlycu core exception coreexception util is read only supported isreadonlysupported test file system support read attribute i resource iresource resource get underlying resource getunderlyingresource read only flag readonlyflag util is read only isreadonly resource did comp lain didcomplain util set read only setreadonly resource copy get buffer getbuffer set contents setcontents invalid copy commit working copy commitworkingcopy java model exception javamodelexception did comp lain didcomplain util set read only setreadonly resource read only flag readonlyflag assert true asserttrue comp lained complained modifying read unit did comp lain didcomplain assert true asserttrue read only readonly buffer modified get buffer getbuffer get contents getcontents equals invalid ensures commit contents working copy read pessimistic repository provider test change content of read only u testchangecontentofreadonlycu core exception coreexception util is read only supported isreadonlysupported test file system support read attribute string new contents newcontents bar i resource iresource resource get underlying resource getunderlyingresource i project iproject project resource get project getproject read only flag readonlyflag util is read only isreadonly resource repository provider repositoryprovider map project test pessimistic provider testpessimisticprovider nature test pessimistic provider testpessimisticprovider mark writable on save markwritableonsave util set read only setreadonly resource copy get buffer getbuffer set contents setcontents new contents newcontents copy commit working copy commitworkingcopy assert source equals assertsourceequals unexpected original contents new contents newcontents get buffer getbuffer get contents getcontents test pessimistic provider testpessimisticprovider mark writable on save markwritableonsave repository provider repositoryprovider unmap project util set read only setreadonly resource read only flag readonlyflag ensures source contents working copy altered source original compilation unit test contents testcontents core exception coreexception string original source originalsource get source getsource i type itype type get type gettype assert deletion assertdeletion type assert source equals assertsourceequals source code copy original original source originalsource copy get source getsource test creating working copy file customized buffer https bugs eclipse org test longer valid test on class file testonclassfile java model exception javamodelexception io exception ioexception ensure external jcl copied setupexternaljcl jcl min jclmin attach source attachsource get package fragment root getpackagefragmentroot getexternaljclpathstring getexternaljclsourcepath toosstring src i class file iclassfile class file classfile get class file getclassfile getexternaljclpathstring java lang object working copy owner workingcopyowner owner test working copy owner testworkingcopyowner i compilation unit icompilationunit customized copy customizedcopy class file classfile get working copy getworkingcopy owner i buffer ibuffer buffer customized copy customizedcopy get buffer getbuffer assert true asserttrue unexpected buffer buffer test buffer testbuffer assert true asserttrue buffer initialized source buffer get char acters getcharacters length customized copy customizedcopy discard working copy discardworkingcopy create compilation unit place holder working copy tests test creation testcreation assert true asserttrue failed create java compilation unit exists assert true asserttrue failed create working copy java copy copy exists test creating working copy customized buffer test custom ized buffer testcustomizedbuffer java model exception javamodelexception working copy owner workingcopyowner owner test working copy owner testworkingcopyowner i compilation unit icompilationunit customized copy customizedcopy get working copy getworkingcopy owner assert true asserttrue unexpected buffer customized copy customizedcopy get buffer getbuffer test buffer testbuffer customized copy customizedcopy discard working copy discardworkingcopy test closing reopening working copy customized buffer test custom ized buffer testcustomizedbuffer java model exception javamodelexception working copy owner workingcopyowner owner test working copy owner testworkingcopyowner i compilation unit icompilationunit customized copy customizedcopy get working copy getworkingcopy owner customized copy customizedcopy close customized copy customizedcopy open assert true asserttrue unexpected buffer customized copy customizedcopy get buffer getbuffer test buffer testbuffer customized copy customizedcopy discard working copy discardworkingcopy test deleting fields java core javacore operation reports correct delta regression test bug incorrect delta deleting fields test delete testdelete fields core exception coreexception start deltas startdeltas java core javacore i workspace runnable iworkspacerunnable i progress monitor iprogressmonitor monitor core exception coreexception i type itype type working copy tests workingcopytests copy get type gettype i field ifield field type get field getfield field i field ifield field type get field getfield field field delete monitor field delete monitor assert working copy deltas assertworkingcopydeltas unexpected delta children fine grained field field stop deltas stopdeltas tests general functionality working copy ensures copy original compilation unit equal ensures correct retrieval original element closing compilation unit close copy ensures working copies unique ensures commit ting committing working copies test general testgeneral java model exception javamodelexception core exception coreexception assert true asserttrue copy actual equal copy equals i type itype copy type copytype copy get type gettype assert equals assertequals primary same l samel get primary getprimary assert equals assertequals working copy copy yield original copy copy copy get working copy getworkingcopy assert deletion assertdeletion copy type copytype closing close copy i openable iopenable get parent getparent close assert true asserttrue copy open copy is open isopen verify original assert true asserttrue actual type get type gettype exists get another getanother working copy i compilation unit icompilationunit copy get working copy getworkingcopy assert true asserttrue working copies unique copy equals copy delete method working copy i method imethod method copy get type gettype get method getmethod foo assert deletion assertdeletion method i method imethod original method originalmethod get type gettype get method getmethod foo assert true asserttrue method original original method originalmethod exists commit copy copy commit working copy commitworkingcopy assert true asserttrue copy unsaved copy has unsaved changes hasunsavedchanges original method assert true asserttrue method longer original commit original method originalmethod exists commit copy fail copy commit working copy commitworkingcopy assert true asserttrue commit failed java model exception javamodelexception jme force update copy commit working copy commitworkingcopy java model exception javamodelexception jme assert true asserttrue commit work type assert true asserttrue original type longer get type gettype exists copy close copy open java model exception javamodelexception assert true asserttrue open working copy time discard working copy copy discard working copy discardworkingcopy copy open java model exception javamodelexception assert true asserttrue open working copy copy discard working copy discardworkingcopy ensures primary element binary element test get primary binary element testgetprimarybinaryelement core exception coreexception evaluate scr apbook scrapbook org eclipse jdt core tests model modifying resource tests modifyingresourcetests generate class file generateclassfile bytes create file createfile lib bytes i class file iclassfile get class file getclassfile lib i java element ijavaelement primary get primary element getprimaryelement assert equals assertequals primary element primary ensures primary retrieved test get primary u testgetprimarycu i java element ijavaelement primary copy get primary element getprimaryelement assert true asserttrue element primary i compilation unit icompilationunit i compilation unit icompilationunit primary is working copy isworkingcopy assert true asserttrue element exist primary exists ensures primary field retrieved test get primary field testgetprimaryfield i type itype type copy get type gettype i java element ijavaelement primary type get field getfield field get primary element getprimaryelement assert true asserttrue element field primary i field ifield i compilation unit icompilationunit primary get parent getparent get parent getparent is working copy isworkingcopy assert true asserttrue element exist primary exists ensures primary declaration retrieved test get primary import declaration testgetprimaryimportdeclaration i import declaration iimportdeclaration imprt copy get import getimport java file i java element ijavaelement primary imprt get primary element getprimaryelement assert true asserttrue element exist primary exists ensures primary container retrieved test get primary import container testgetprimaryimportcontainer i import container iimportcontainer container copy get import container getimportcontainer i java element ijavaelement primary container get primary element getprimaryelement assert true asserttrue element primary assert true asserttrue element exist primary exists ensures primary initializer retrieved test get primary initializer testgetprimaryinitializer i type itype type copy get type gettype i java element ijavaelement primary type get initializer getinitializer get primary element getprimaryelement assert true asserttrue element exist primary exists test get primary inner field testgetprimaryinnerfield i type itype inner type innertype copy get type gettype get type gettype i java element ijavaelement primary inner type innertype get field getfield inner field innerfield get primary element getprimaryelement assert true asserttrue element field primary i field ifield assert true asserttrue element exist primary exists test get primary inner method testgetprimaryinnermethod java model exception javamodelexception i type itype inner type innertype copy get type gettype get type gettype i java element ijavaelement primary inner type innertype get methods getmethods get primary element getprimaryelement assert true asserttrue element method primary i method imethod assert true asserttrue element exist primary exists test get primary inner type testgetprimaryinnertype i type itype inner inner type innerinnertype copy get type gettype get type gettype get type gettype inner inner innerinner i java element ijavaelement primary inner inner type innerinnertype get primary element getprimaryelement assert true asserttrue element method primary i type itype assert true asserttrue element exist primary exists vector hierarchy vector i java element ijavaelement parent primary get parent getparent parent get element type getelementtype i java element ijavaelement compilation unit hierarchy add element addelement parent parent parent get parent getparent hierarchy add element addelement parent assert true asserttrue compilation unit working copy i compilation unit icompilationunit hierarchy last element lastelement is working copy isworkingcopy ensures primary method retrieved test get primary method testgetprimarymethod java model exception javamodelexception i type itype type copy get type gettype i java element ijavaelement primary type get methods getmethods get primary element getprimaryelement assert true asserttrue element method primary i method imethod assert true asserttrue element exist primary exists ensures renaming method working copy alter source primary compilation unit test rename method testrenamemethod java model exception javamodelexception i type itype type copy get type gettype i method imethod method type get methods getmethods i java element ijavaelement primary method get primary element getprimaryelement method rename bar assert equals assertequals invalid working copy method bar type get methods getmethods get element name getelementname assert equals assertequals invalid primary method foo primary get element name getelementname ensures primary declaration retrieved test get primary package declaration testgetprimarypackagedeclaration i package declaration ipackagedeclaration pkg copy get package declaration getpackagedeclaration i java element ijavaelement primary pkg get primary element getprimaryelement assert true asserttrue element exist primary exists ensures primary type retrieved test get primary type testgetprimarytype i type itype type copy get type gettype i java element ijavaelement primary type get primary element getprimaryelement assert true asserttrue element exist primary exists ensures type moved working copy regression test bug i type itype move clobbers editing buffer destination element test move type to another working copy testmovetypetoanotherworkingcopy core exception coreexception create file createfile src java i compilation unit icompilationunit get compilation unit getcompilationunit src java i compilation unit icompilationunit copy get working copy getworkingcopy i type itype class a classa copy get type gettype i type itype class b classb copy get type gettype class a classa move class b classb assert true asserttrue exist class a classa exists assert true asserttrue exist class b classb get type gettype exists assert true asserttrue buffer copy get buffer getbuffer assert source equals assertsourceequals invalid content java file copy get buffer getbuffer get contents getcontents assert true asserttrue buffer copy get buffer getbuffer assert source equals assertsourceequals invalid content inner inner innerinner inner field innerfield inner method innermethod string field field file path separator pathseparator field field foo copy get buffer getbuffer get contents getcontents copy discard working copy discardworkingcopy test creating shared working copy test shared testshared java model exception javamodelexception working copy owner workingcopyowner owner working copy owner workingcopyowner i compilation unit icompilationunit shared get working copy getworkingcopy owner assert true asserttrue find shared working copy find working copy findworkingcopy owner shared shared discard working copy discardworkingcopy assert true asserttrue find owner find working copy findworkingcopy owner test call creating shared working copy test shared testshared java model exception javamodelexception working copy owner workingcopyowner owner working copy owner workingcopyowner i compilation unit icompilationunit shared get working copy getworkingcopy owner i compilation unit icompilationunit shared get working copy getworkingcopy owner assert true asserttrue working copy identical shared shared shared discard working copy discardworkingcopy assert true asserttrue find shared working copy find working copy findworkingcopy owner shared shared discard working copy discardworkingcopy assert true asserttrue find owner find working copy findworkingcopy owner tests multiple commits working copy test multiple commit testmultiplecommit add method working copy i type itype copy get type gettype create method createmethod another method anothermethod java model exception javamodelexception jme assert true asserttrue creation failed commit copy copy commit working copy commitworkingcopy java model exception javamodelexception assert true asserttrue commit failed method assert true asserttrue method exist commit get type gettype get method getmethod another method anothermethod string exists add method create method createmethod another another method anotheranothermethod java model exception javamodelexception assert true asserttrue creation failed commit method copy commit working copy commitworkingcopy java model exception javamodelexception assert true asserttrue commit failed method assert true asserttrue method exist commit get type gettype get method getmethod another another method anotheranothermethod string exists creates working copy existing compilation unit regression test bug dcr create working copy ignoring existing files test non existing u testnonexistingcu java model exception javamodelexception i compilation unit icompilationunit non existing u nonexistingcu get compilation unit getcompilationunit src non existing nonexisting java i compilation unit icompilationunit working copy workingcopy get buffer getbuffer working copy workingcopy non existing u nonexistingcu get working copy getworkingcopy assert source equals assertsourceequals buffer empty i openable iopenable working copy workingcopy get buffer getbuffer get contents getcontents exists assert true asserttrue working copy exists i java element ijavaelement working copy workingcopy exists get corresponding resource getcorrespondingresource assert equals assertequals resource i java element ijavaelement working copy workingcopy get corresponding resource getcorrespondingresource get primary element getprimaryelement assert equals assertequals unexpected org inal orginal element non existing u nonexistingcu working copy workingcopy get primary element getprimaryelement get path getpath assert equals assertequals unexpected path path src non existing nonexisting java i java element ijavaelement working copy workingcopy get path getpath get resource getresource assert equals assertequals unexpected resource non existing u nonexistingcu get resource getresource i java element ijavaelement working copy workingcopy get resource getresource is consistent isconsistent assert true asserttrue working copy consistent i openable iopenable working copy workingcopy is consistent isconsistent restore exception working copy workingcopy restore java model exception javamodelexception exception assert true asserttrue restore primary element exception make consistent makeconsistent i openable iopenable working copy workingcopy get buffer getbuffer set contents setcontents assert true asserttrue working copy consistent i openable iopenable working copy workingcopy is consistent isconsistent i openable iopenable working copy workingcopy make consistent makeconsistent assert true asserttrue working copy consistent i openable iopenable working copy workingcopy is consistent isconsistent save i openable iopenable working copy workingcopy get buffer getbuffer set contents setcontents i openable iopenable working copy workingcopy save assert true asserttrue working copy consistent save i openable iopenable working copy workingcopy is consistent isconsistent assert true asserttrue primary exist non existing u nonexistingcu exists commit working copy commitworkingcopy working copy workingcopy commit working copy commitworkingcopy assert true asserttrue primary exist non existing u nonexistingcu exists has resource changed hasresourcechanged assert true asserttrue working copy resource mark changed working copy workingcopy has resource changed hasresourcechanged working copy workingcopy working copy workingcopy discard working copy discardworkingcopy non existing u nonexistingcu exists non existing u nonexistingcu delete tests general functionality operations working working copies ensures copy renamed ensures copy moved location primary ensures copy copied location primary test operations testoperations java model exception javamodelexception rename working copy copy rename some name somename java java model exception javamodelexception jme assert true asserttrue incorrect status code attempting rename working copy jme get status getstatus get code getcode i java model status constants ijavamodelstatusconstants invalid element types assert true asserttrue renaming working copy fail move location primary copy move get parent getparent some name somename java java model exception javamodelexception jme assert true asserttrue incorrect status code attempting move working copy jme get status getstatus get code getcode i java model status constants ijavamodelstatusconstants invalid element types assert true asserttrue moving working copy fail copy working copy i package fragment ipackagefragment pkg get package fragment getpackagefragment src copy copy pkg some name somename java assert creation assertcreation copy