copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt tests refactoring junit framework test junit framework test suite testsuite org eclipse ltk core refactoring refactoring status refactoringstatus org eclipse ltk core refactoring participants move arguments movearguments org eclipse ltk core refactoring participants move refactoring moverefactoring org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i field ifield org eclipse jdt core i java project ijavaproject org eclipse jdt core i member imember org eclipse jdt core i method imethod org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i type itype org eclipse jdt core java model exception javamodelexception org eclipse jdt internal corext refactoring refactoring availability tester refactoringavailabilitytester org eclipse jdt internal corext refactoring structure move static members processor movestaticmembersprocessor org eclipse jdt internal corext refactoring tag ging tagging i delegate updating idelegateupdating org eclipse jdt tests refactoring infra debug utils debugutils org eclipse jdt internal preferences java preferences settings javapreferencessettings move members tests movememberstests refactoring test refactoringtest move members tests movememberstests clazz move members tests movememberstests string refactoring path move members movemembers move members tests movememberstests string test suite refactoring test setup refactoringtestsetup test suite testsuite clazz test set up test setuptest test some test sometest refactoring test setup refactoringtestsetup some test sometest override string get refactoring path getrefactoringpath refactoring path move refactoring moverefactoring create refactoring createrefactoring i member imember members i type itype destination java model exception javamodelexception create refactoring createrefactoring members destination get fully qualified name getfullyqualifiedname move refactoring moverefactoring create refactoring createrefactoring i member imember members string destination java model exception javamodelexception i java project ijavaproject project members members length project members get java project getjavaproject move static members processor movestaticmembersprocessor processor refactoring availability tester refactoringavailabilitytester is move static members available ismovestaticmembersavailable members move static members processor movestaticmembersprocessor members java preferences settings javapreferencessettings get code generation settings getcodegenerationsettings project processor processor set destination type fully qualified name setdestinationtypefullyqualifiedname destination move refactoring moverefactoring processor override set up setup exception f is verbose fisverbose debug utils debugutils dump get name getname set up setup f is pre delta test fispredeltatest field method type package helper fieldmethodtypepackagehelper passing string field names fieldnames string method names methodnames string signatures string type names typenames i package fragment ipackagefragment pack for a packfora i package fragment ipackagefragment pack for b packforb add delegate adddelegate exception participant testing participanttesting reset i compilation unit icompilationunit cu a cua create ufrom test file createcufromtestfile pack for a packfora i compilation unit icompilationunit cu b cub create ufrom test file createcufromtestfile pack for b packforb i type itype type a typea get type gettype cu a cua i type itype type b typeb get type gettype cu b cub i field ifield fields get fields getfields type a typea field names fieldnames i method imethod methods get methods getmethods type a typea method names methodnames signatures i type itype types get member types getmembertypes type a typea type names typenames i type itype destination type destinationtype type b typeb i member imember members merge methods fields types string handles participant testing participanttesting create handles createhandles members move arguments movearguments args move arguments movearguments handles length args length args move arguments movearguments destination type destinationtype move refactoring moverefactoring create refactoring createrefactoring members destination type destinationtype i delegate updating idelegateupdating del up delup get processor getprocessor get adapter getadapter i delegate updating idelegateupdating del up delup set delegate updating setdelegateupdating add delegate adddelegate refactoring status refactoringstatus result perform refactoring with status performrefactoringwithstatus assert true asserttrue precondition supposed pass result get severity getseverity refactoring status refactoringstatus warning participant testing participanttesting test move testmove handles args string expected string actual expected get file contents getfilecontents get output test file name getoutputtestfilename actual cu a cua get source getsource assert equal lines assertequallines incorrect modification expected actual expected get file contents getfilecontents get output test file name getoutputtestfilename actual cu b cub get source getsource assert equal lines assertequallines incorrect modification expected actual tear down teardown deletes resources perform dummy search performdummysearch move members field method type helper fieldmethodtypeabhelper passing string field names fieldnames string method names methodnames string signatures string type names typenames exception i package fragment ipackagefragment package for b packageforb get root getroot create package fragment createpackagefragment field method type package helper fieldmethodtypepackagehelper passing field names fieldnames method names methodnames signatures type names typenames get package p getpackagep package for b packageforb tear down teardown deletes resources perform dummy search performdummysearch field method type helper fieldmethodtypehelper passing string field names fieldnames string method names methodnames string signatures string type names typenames add delegates adddelegates exception i package fragment ipackagefragment pack for a packfora get package p getpackagep i package fragment ipackagefragment pack for b packforb get package p getpackagep field method type package helper fieldmethodtypepackagehelper passing field names fieldnames method names methodnames signatures type names typenames pack for a packfora pack for b packforb add delegates adddelegates field helper fieldhelper passing string field names fieldnames exception field method type helper fieldmethodtypehelper passing field names fieldnames string string string field helper delegate fieldhelperdelegate passing string field names fieldnames exception field method type helper fieldmethodtypehelper passing field names fieldnames string string string method helper methodhelper passing string method names methodnames string signatures exception field method type helper fieldmethodtypehelper passing string method names methodnames signatures string method helper delegate methodhelperdelegate passing string method names methodnames string signatures exception field method type helper fieldmethodtypehelper passing string method names methodnames signatures string type helper typehelper passing string type names typenames exception field method type helper fieldmethodtypehelper passing string string string type names typenames field method type package helper fieldmethodtypepackagehelper failing string field names fieldnames string method names methodnames string signatures string type names typenames error level errorlevel string destination type name destinationtypename i package fragment ipackagefragment pack for a packfora i package fragment ipackagefragment pack for b packforb exception i compilation unit icompilationunit cu a cua create ufrom test file createcufromtestfile pack for a packfora create ufrom test file createcufromtestfile pack for b packforb i type itype type a typea get type gettype cu a cua i field ifield fields get fields getfields type a typea field names fieldnames i method imethod methods get methods getmethods type a typea method names methodnames signatures i type itype types get member types getmembertypes type a typea type names typenames move refactoring moverefactoring create refactoring createrefactoring merge methods fields types destination type name destinationtypename assert equals assertequals error level errorlevel refactoring status refactoringstatus fatal refactoring status refactoringstatus result perform refactoring performrefactoring f is verbose fisverbose debug utils debugutils dump status result assert not null assertnotnull precondition supposed fail result assert equals assertequals precondition supposed fail error level errorlevel result get severity getseverity field method type helper fieldmethodtypehelper failing string field names fieldnames string method names methodnames string signatures string type names typenames error level errorlevel string destination type name destinationtypename exception i package fragment ipackagefragment pack for a packfora get package p getpackagep i package fragment ipackagefragment pack for b packforb get package p getpackagep field method type package helper fieldmethodtypepackagehelper failing field names fieldnames method names methodnames signatures type names typenames error level errorlevel destination type name destinationtypename pack for a packfora pack for b packforb test exception method helper methodhelper passing string string string test exception method helper methodhelper passing string string string test exception method helper methodhelper passing string string string test exception method helper methodhelper passing string string string test exception method helper methodhelper passing string string string test exception field helper fieldhelper passing string test exception field helper fieldhelper passing string test exception field helper fieldhelper passing string test exception print test disabled message printtestdisabledmessage i package fragment ipackagefragment package for b packageforb get root getroot create package fragment createpackagefragment field method type package helper fieldmethodtypepackagehelper passing string string string string get package p getpackagep package for b packageforb test exception method helper methodhelper passing string string string test exception method helper methodhelper passing string string string test exception method helper methodhelper passing string string string test exception method helper methodhelper passing string string string test exception method helper methodhelper passing string string string test exception method helper methodhelper passing string string string test exception method helper methodhelper passing string string string test exception method helper methodhelper passing string string string test exception method helper methodhelper passing string string string test exception method helper methodhelper passing string string string test exception method helper methodhelper passing string string string test exception method helper methodhelper passing string string string test exception print test disabled message printtestdisabledmessage handling visibility issues induced moving member field helper fieldhelper passing string test exception field helper fieldhelper passing string test exception field helper fieldhelper passing string fred test exception field helper fieldhelper passing string fred test exception print test disabled message printtestdisabledmessage test field helper fieldhelper passing string fred test exception i package fragment ipackagefragment package for b packageforb get root getroot create package fragment createpackagefragment field method type package helper fieldmethodtypepackagehelper passing string string string string string get package p getpackagep package for b packageforb test exception i package fragment ipackagefragment package for b packageforb get root getroot create package fragment createpackagefragment field method type package helper fieldmethodtypepackagehelper passing string string string string string get package p getpackagep package for b packageforb test exception method helper methodhelper passing string string string string test bug test test bug exception method helper methodhelper passing string string string test bug test test bug exception field helper fieldhelper passing string test bug test test bug exception field helper fieldhelper passing string odd test bug test test bug exception print test disabled message printtestdisabledmessage test method helper methodhelper passing string string string test bug test test bug exception field helper fieldhelper passing string test bug test test bug exception field helper fieldhelper passing string test bug test test bug exception field helper fieldhelper passing string move types test exception type helper typehelper passing string test exception print test disabled message printtestdisabledmessage qualified access source type helper typehelper passing string test exception field method type helper fieldmethodtypeabhelper passing string string string string test exception print test disabled message printtestdisabledmessage complex imports work field method type fieldmethodtype cu s helper cushelper passing string string string string test exception field method type helper fieldmethodtypehelper passing string string string string string test exception method helper methodhelper passing string string string visibility issues moved member test exception test fail testfail tests move method references method method helper methodhelper passing string string string test exception test fail testfail tests move method references field method helper methodhelper passing string string string test exception test fail testfail tests move field references field field helper fieldhelper passing string test exception test fail testfail tests move field references method field helper fieldhelper passing string test exception test fail testfail tests move method referenced field method helper methodhelper passing string string string test exception test fail testfail tests move field referenced field field helper fieldhelper passing string test exception move unused method calls method i package fragment ipackagefragment package for b packageforb get root getroot create package fragment createpackagefragment field method type package helper fieldmethodtypepackagehelper passing string string bar string string string get package p getpackagep package for b packageforb visibility issues moved member test exception move field i package fragment ipackagefragment package for b packageforb get root getroot create package fragment createpackagefragment field method type package helper fieldmethodtypepackagehelper passing string some var somevar string string string string get package p getpackagep package for b packageforb test exception move method subtype method helper methodhelper passing string foo string string test exception move field assure field visibility inc reased increased type helper typehelper passing string test exception assure moved unused field visibility field helper fieldhelper passing string test exception assure moved unusued visibility type helper typehelper passing string test exception moved method changed visibility method helper methodhelper passing string string string test exception moved method changed visibility type helper typehelper passing string visibility members moved type test exception move members type helper typehelper passing string test exception move unused members type helper typehelper passing string visibility members test exception move type references field enclosing type field sibling type helper typehelper passing string test exception move type references field enclosing type enclosing type type helper typehelper passing string some inner someinner test exception move get ter getter field field changed bug i package fragment ipackagefragment package for b packageforb get root getroot create package fragment createpackagefragment field method type package helper fieldmethodtypepackagehelper passing string string getname string string string get package p getpackagep package for b packageforb test exception move method references field get ter getter set ter setter field changed bug i package fragment ipackagefragment package for b packageforb get root getroot create package fragment createpackagefragment field method type package helper fieldmethodtypepackagehelper passing string string foo string string string get package p getpackagep package for b packageforb parameterized type references test exception move type references field enclosing type field sibling type helper typehelper passing string some inner someinner test fail testfail exception field method type helper fieldmethodtypehelper failing string string string string string refactoring status refactoringstatus fatal test fail testfail exception field method type helper fieldmethodtypehelper failing string string string string string refactoring status refactoringstatus error test fail testfail exception field method type helper fieldmethodtypehelper failing string string string string string refactoring status refactoringstatus error test fail testfail exception field method type helper fieldmethodtypehelper failing string string string string string refactoring status refactoringstatus error test fail testfail exception field method type helper fieldmethodtypehelper failing string string string string string refactoring status refactoringstatus warning test fail testfail exception field method type helper fieldmethodtypehelper failing string string string string string refactoring status refactoringstatus warning test fail testfail exception field method type helper fieldmethodtypehelper failing string string string string refactoring status refactoringstatus error test fail testfail exception field method type helper fieldmethodtypehelper failing string string string string refactoring status refactoringstatus error test fail testfail exception field method type helper fieldmethodtypehelper failing string string string string refactoring status refactoringstatus error test fail testfail exception field method type helper fieldmethodtypehelper failing string string string string string refactoring status refactoringstatus warning test fail testfail exception i package fragment ipackagefragment package for b packageforb get root getroot create package fragment createpackagefragment field method type package helper fieldmethodtypepackagehelper failing string string string string refactoring status refactoringstatus error get package p getpackagep package for b packageforb test fail testfail exception field method type helper fieldmethodtypehelper failing string string string string string refactoring status refactoringstatus fatal java lang object test fail testfail exception field method type helper fieldmethodtypehelper failing string string string string string refactoring status refactoringstatus fatal dont exist dontexist test fail testfail exception field method type helper fieldmethodtypehelper failing string string string string string refactoring status refactoringstatus error test fail testfail exception test test fail testfail exception field method type helper fieldmethodtypehelper failing string string string string string refactoring status refactoringstatus fatal test fail testfail exception free slot test fail testfail exception free slot test fail testfail exception field method type helper fieldmethodtypehelper failing string string string string string refactoring status refactoringstatus fatal delegate creation test delegate testdelegate exception simple delegate method method helper delegate methodhelperdelegate passing string foo string string test delegate testdelegate exception increase visibility method helper delegate methodhelperdelegate passing string foo string string test delegate testdelegate exception ensure imports removed correctly method helper delegate methodhelperdelegate passing string foo string string test delegate testdelegate exception add moving i package fragment ipackagefragment package for b packageforb get root getroot create package fragment createpackagefragment field method type package helper fieldmethodtypepackagehelper passing string string foo string string string get package p getpackagep package for b packageforb test delegate testdelegate exception simple delegate field field helper delegate fieldhelperdelegate passing string foo test delegate testdelegate exception increase visibility field helper delegate fieldhelperdelegate passing string foo test delegate testdelegate exception remove imports correctly field helper delegate fieldhelperdelegate passing string foo test delegate testdelegate exception add moving i package fragment ipackagefragment package for b packageforb get root getroot create package fragment createpackagefragment field method type package helper fieldmethodtypepackagehelper passing string foo string string string string get package p getpackagep package for b packageforb