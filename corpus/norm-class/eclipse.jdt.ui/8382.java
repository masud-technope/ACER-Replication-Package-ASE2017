copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt tests core source junit framework test junit framework test suite testsuite org eclipse jdt test plugin testplugin java project helper javaprojecthelper org eclipse core runtime core exception coreexception org eclipse core runtime null progress monitor nullprogressmonitor org eclipse jface preference i preference store ipreferencestore org eclipse jdt core flags org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i field ifield org eclipse jdt core i java element ijavaelement org eclipse jdt core i member imember org eclipse jdt core i method imethod org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i type itype org eclipse jdt core java model exception javamodelexception org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom modifier org eclipse jdt internal corext code manipulation codemanipulation add getter setter operation addgettersetteroperation org eclipse jdt internal corext code manipulation codemanipulation i request query irequestquery org eclipse jdt internal corext refactoring util refactoringastparser org eclipse jdt internal corext util java model util javamodelutil org eclipse jdt preference constants preferenceconstants org eclipse jdt tests core project test setup projecttestsetup org eclipse jdt internal java plugin javaplugin org eclipse jdt internal java editor javaeditor ast provider astprovider tests generation get ters getters set ters setters org eclipse jdt internal corext code manipulation codemanipulation add getter setter operation addgettersetteroperation generate get ters set ters test generategetterssetterstest source test case sourcetestcase generate get ters set ters test generategetterssetterstest generate get ters set ters test generategetterssetterstest test suite set up test setuptest test suite testsuite test set up test setuptest test test project test setup projecttestsetup test i field ifield nofields i field ifield generate get ters set ters test generategetterssetterstest string i type itype create new type createnewtype string fqname java model exception javamodelexception string pkg fqname substring fqname last index of lastindexof string type name typename fqname substring fqname last index of lastindexof i package fragment ipackagefragment fragment f root froot create package fragment createpackagefragment pkg i compilation unit icompilationunit unit fragment get compilation unit getcompilationunit type name typename java unit create type createtype type name typename create get ter getter set ter setter operation skip set ters setters fields overwrite existing methods param type type param get ters getters fields create get ters getters param set ters setters fields create set ters setters param get ters and set ters gettersandsetters fields create get ters getters set ters setters param sort enable sort param visibility visibility methods param sibling element insert core exception coreexception run operation runoperation i type itype type i field ifield get ters getters i field ifield set ters setters i field ifield get ters and set ters gettersandsetters sort visibility i java element ijavaelement sibling core exception coreexception i request query irequestquery all yes allyes i request query irequestquery override do query doquery i member imember member i request query irequestquery refactoringastparser parser refactoringastparser ast provider astprovider shared ast level compilation unit compilationunit unit parser parse type get compilation unit getcompilationunit add getter setter operation addgettersetteroperation add getter setter operation addgettersetteroperation type get ters getters set ters setters get ters and set ters gettersandsetters unit all yes allyes sibling f settings fsettings set sort setsort sort set visibility setvisibility visibility null progress monitor nullprogressmonitor java model util javamodelutil reconcile type get compilation unit getcompilationunit run operation runoperation i field ifield get ters getters i field ifield set ters setters i field ifield get ters and set ters gettersandsetters core exception coreexception run operation runoperation f class a fclassa get ters getters set ters setters get ters and set ters gettersandsetters modifier run operation runoperation i type itype type i field ifield get ters getters i field ifield set ters setters i field ifield get ters and set ters gettersandsetters core exception coreexception run operation runoperation type get ters getters set ters setters get ters and set ters gettersandsetters modifier run operation runoperation i field ifield get ters getters i field ifield set ters setters i field ifield get ters and set ters gettersandsetters sort core exception coreexception run operation runoperation f class a fclassa get ters getters set ters setters get ters and set ters gettersandsetters sort modifier actual tests tests normal get ter getter set ter setter generation field exception test exception i field ifield field f class a fclassa create field createfield string field null progress monitor nullprogressmonitor run operation runoperation nofields nofields i field ifield field string expected string field returns field string get field getfield field param field field set field setfield string field field field compare source comparesource expected f class a fclassa get source getsource tests normal get ter getter set ter setter generation field exception test done with smart is testdonewithsmartis exception i field ifield field f class a fclassa create field createfield null progress monitor nullprogressmonitor run operation runoperation nofields nofields i field ifield field string expected returns is done isdone param set done setdone compare source comparesource expected f class a fclassa get source getsource tests normal get ter getter set ter setter generation field exception test is done with smart is testisdonewithsmartis exception i field ifield field f class a fclassa create field createfield is done isdone null progress monitor nullprogressmonitor run operation runoperation nofields nofields i field ifield field string expected is done isdone returns is done isdone is done isdone is done isdone param is done isdone is done isdone set done setdone is done isdone is done isdone is done isdone compare source comparesource expected f class a fclassa get source getsource tests normal get ter getter set ter setter generation field exception test done without smart is testdonewithoutsmartis exception i preference store ipreferencestore store java plugin javaplugin get default getdefault get preference store getpreferencestore store set value setvalue preference constants preferenceconstants codegen getters i field ifield field f class a fclassa create field createfield null progress monitor nullprogressmonitor run operation runoperation nofields nofields i field ifield field string expected returns get done getdone param set done setdone compare source comparesource expected f class a fclassa get source getsource store set value setvalue preference constants preferenceconstants codegen getters tests normal get ter getter set ter setter generation field exception test is done without smart is testisdonewithoutsmartis exception i preference store ipreferencestore store java plugin javaplugin get default getdefault get preference store getpreferencestore store set value setvalue preference constants preferenceconstants codegen getters i field ifield field f class a fclassa create field createfield is done isdone null progress monitor nullprogressmonitor run operation runoperation nofields nofields i field ifield field string expected is done isdone returns is done isdone get is done getisdone is done isdone param is done isdone is done isdone set is done setisdone is done isdone is done isdone is done isdone compare source comparesource expected f class a fclassa get source getsource store set value setvalue preference constants preferenceconstants codegen getters set ter setter fields skipped user parameter exception test exception i field ifield field f class a fclassa create field createfield string field null progress monitor nullprogressmonitor run operation runoperation nofields nofields i field ifield field string expected string field returns field string get field getfield field param field field set field setfield string field field field compare source comparesource expected f class a fclassa get source getsource tests full qualified field declaration type full qualified set ter setter parameter exception test exception create new type createnewtype i field ifield field f class a fclassa create field createfield field null progress monitor nullprogressmonitor run operation runoperation nofields nofields i field ifield field string expected field returns field get field getfield field param field field set field setfield field field field compare source comparesource expected f class a fclassa get source getsource test parameterized types field declarations exception test exception i compilation unit icompilationunit f package p fpackagep create compilation unit createcompilationunit java java util hash map hashmap java util map map string string hash map hashmap string string i type itype class b classb get type gettype i field ifield field class b classb get field getfield run operation runoperation class b classb nofields nofields i field ifield field string expected map string string hash map hashmap string string returns map string string get a geta param set a seta map string string compare source comparesource expected class b classb get source getsource tests enum type d typed fields exception test exception i type itype the enum theenum f class a fclassa create type createtype enum enum i field ifield field f class a fclassa create field createfield enum some enum someenum the enum theenum run operation runoperation nofields nofields i field ifield field string expected enum some enum someenum enum enum returns some enum someenum enum get some enum getsomeenum some enum someenum param some enum someenum some enum someenum set some enum setsomeenum enum some enum someenum some enum someenum some enum someenum compare source comparesource expected f class a fclassa get source getsource test generation field exception test exception create new type createnewtype i compilation unit icompilationunit f package p fpackagep create compilation unit createcompilationunit java string string string i type itype class b classb get type gettype i field ifield field class b classb get field getfield i field ifield field class b classb get field getfield i field ifield field class b classb get field getfield i field ifield field class b classb get field getfield run operation runoperation class b classb nofields nofields i field ifield field field field field string expected string string string returns string get a geta param set a seta string returns string get b getb param set b setb string returns get c getc param set c setc returns string get d getd param set d setd string compare source comparesource expected class b classb get source getsource fields time sorted exception test exception i field ifield field f class a fclassa create field createfield string null progress monitor nullprogressmonitor i field ifield field f class a fclassa create field createfield string null progress monitor nullprogressmonitor i field ifield field f class a fclassa create field createfield string null progress monitor nullprogressmonitor note sorted mode fields sep arately separately run operation runoperation i field ifield field field field i field ifield field field field nofields string expected string string string returns string get a geta returns string get b getb returns string get d getd param set a seta string param set b setb string param set d setd string compare source comparesource expected f class a fclassa get source getsource test get ter getter set ter setter generation anonymous type exception test exception i compilation unit icompilationunit f package p fpackagep create compilation unit createcompilationunit java some anon someanon inner field innerfield position constructor anonymous type i type itype anon i type itype get element at getelementat i field ifield field anon get field getfield inner field innerfield run operation runoperation anon nofields nofields i field ifield field modifier string expected some anon someanon inner field innerfield returns inner field innerfield get inner field getinnerfield inner field innerfield param inner field innerfield inner field innerfield set inner field setinnerfield inner field innerfield inner field innerfield inner field innerfield compare source comparesource expected get type gettype get source getsource tests modifiers generated get ters getters exception test exception i field ifield field f class a fclassa create field createfield object null progress monitor nullprogressmonitor run operation runoperation f class a fclassa i field ifield field nofields nofields modifier modifier string expected object returns object get o geto compare source comparesource expected f class a fclassa get source getsource verify existing get ters getters overwritten set ters setters created exception test exception i compilation unit icompilationunit f package p fpackagep create compilation unit createcompilationunit java object returns object get o geto i type itype class b classb get type gettype i field ifield field class b classb get field getfield run operation runoperation class b classb nofields nofields i field ifield field modifier field string expected param set o seto object object returns object get o geto compare source comparesource expected class b classb get source getsource test creation combined field declarations creating pair access ors accessors variable set ter setter exception test exception i compilation unit icompilationunit f package p fpackagep create compilation unit createcompilationunit java i type itype class b classb get type gettype i field ifield field class b classb get field getfield i field ifield field class b classb get field getfield run operation runoperation class b classb nofields i field ifield field i field ifield field modifier string expected returns get d getd param set d setd param set e sete compare source comparesource expected class b classb get source getsource tests insertion members method exception test exception i compilation unit icompilationunit f package p fpackagep create compilation unit createcompilationunit java returns get a geta param set a seta returns get b getb param set b setb i type itype class b classb get type gettype i field ifield field class b classb get field getfield i method imethod get b getb class b classb get method getmethod get b getb string insert get b getb run operation runoperation class b classb nofields nofields i field ifield field modifier get b getb string expected returns get a geta param set a seta returns get c getc param set c setc returns get b getb param set b setb compare source comparesource expected class b classb get source getsource test insert setter at location testinsertsetteratlocation exception string buffer stringbuffer buf string buffer stringbuffer buf append buf append returns buf append buf append runnable get x getx buf append buf append string expected getter expectedgetter buf to string tostring assert insert at assertinsertat expected getter expectedgetter test insert getter at location testinsertgetteratlocation exception string buffer stringbuffer buf string buffer stringbuffer buf append buf append param buf append buf append set x setx runnable buf append buf append string expected setter expectedsetter buf to string tostring assert insert at assertinsertat expected setter expectedsetter test insert getter at location testinsertgetteratlocation exception string buffer stringbuffer buf string buffer stringbuffer buf append buf append param buf append buf append set x setx runnable buf append buf append string expected setter expectedsetter buf to string tostring assert insert at assertinsertat expected setter expectedsetter assert insert at assertinsertat string expected method expectedmethod is getter isgetter core exception coreexception string buffer stringbuffer buf string buffer stringbuffer buf append buf append buf append buf append runnable buf append buf append buf append buf append buf append foo buf append buf append initializer buf append buf append buf append initializer buf append buf append buf append buf append buf append buf append string original content originalcontent buf to string tostring num members insert delegate member num members i compilation unit icompilationunit unit unit f package p fpackagep create compilation unit createcompilationunit java original content originalcontent i type itype type unit find primary type findprimarytype i java element ijavaelement children type get children getchildren i field ifield field i field ifield children assert equals assertequals num members children length i java element ijavaelement insert before insertbefore num members children i field ifield get ters getters is getter isgetter i field ifield field i field ifield i field ifield set ters setters is getter isgetter i field ifield field i field ifield run operation runoperation type get ters getters set ters setters i field ifield flags acc public accpublic insert before insertbefore i java element ijavaelement new children newchildren type get children getchildren assert equals assertequals num members new children newchildren length element expected string source i member imember new children newchildren get source getsource assert equals assertequals insert insert before insertbefore expected method expectedmethod source unit java project helper javaprojecthelper delete unit assert insert at assertinsertat string expected method expectedmethod is getter isgetter core exception coreexception string buffer stringbuffer buf string buffer stringbuffer buf append buf append buf append buf append runnable buf append buf append buf append buf append javadoc buf append buf append buf append buf append buf append buf append foo buf append buf append buf append initializer buf append buf append buf append buf append initializer buf append buf append buf append buf append buf append buf append buf append string original content originalcontent buf to string tostring num members insert delegate member num members i compilation unit icompilationunit unit unit f package p fpackagep create compilation unit createcompilationunit java original content originalcontent i type itype type unit find primary type findprimarytype i java element ijavaelement children type get children getchildren i field ifield field i field ifield children assert equals assertequals num members children length i java element ijavaelement insert before insertbefore num members children i field ifield get ters getters is getter isgetter i field ifield field i field ifield i field ifield set ters setters is getter isgetter i field ifield field i field ifield run operation runoperation type get ters getters set ters setters i field ifield flags acc public accpublic insert before insertbefore i java element ijavaelement new children newchildren type get children getchildren assert equals assertequals num members new children newchildren length element expected string source i member imember new children newchildren get source getsource assert equals assertequals insert insert before insertbefore expected method expectedmethod source unit java project helper javaprojecthelper delete unit