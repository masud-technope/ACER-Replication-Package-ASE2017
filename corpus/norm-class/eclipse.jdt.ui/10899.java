copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt text tests junit framework test junit framework test case testcase junit framework test suite testsuite org eclipse jdt test plugin testplugin java project helper javaprojecthelper org eclipse jdt text tests performance editor test helper editortesthelper org eclipse core runtime core exception coreexception org eclipse core runtime i path ipath org eclipse core runtime null progress monitor nullprogressmonitor org eclipse core runtime path org eclipse core resources i file ifile org eclipse core resources resources plugin resourcesplugin org eclipse jface text i document idocument org eclipse jface text i text viewer extension itextviewerextension org eclipse jface text i undo manager iundomanager org eclipse part init exception partinitexception org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i java element ijavaelement org eclipse jdt core i java model ijavamodel org eclipse jdt core i java project ijavaproject org eclipse jdt core i method imethod org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core java core javacore org eclipse jdt core java model exception javamodelexception org eclipse jdt internal corext util java model util javamodelutil org eclipse jdt internal java plugin javaplugin org eclipse jdt internal java editor javaeditor java editor javaeditor tests java model operations undo ne undone group details https bugs eclipse org bugs bug cgi java model op comp und undo test javamodelopcompundundotest test case testcase string src src string sep string bug java string contents bugs bug foo bar test suite test suite testsuite suite test suite testsuite java model op comp und undo test javamodelopcompundundotest suite java editor javaeditor f editor feditor i document idocument f document fdocument i java project ijavaproject f project fproject i compilation unit icompilationunit f compilation unit fcompilationunit i undo manager iundomanager f undo manager fundomanager set up project setupproject string source level sourcelevel core exception coreexception java model exception javamodelexception f project fproject java project helper javaprojecthelper create java project createjavaproject get name getname bin f project fproject set option setoption java core javacore compiler source source level sourcelevel java project helper javaprojecthelper add source container addsourcecontainer f project fproject src i package fragment ipackagefragment fragment f project fproject find package fragment findpackagefragment path sep get name getname sep src f compilation unit fcompilationunit fragment create compilation unit createcompilationunit contents null progress monitor nullprogressmonitor override set up setup exception set up project setupproject java core javacore version set up editor setupeditor set up editor setupeditor f editor feditor open java editor openjavaeditor path sep get name getname sep src sep assert not null assertnotnull f editor feditor f undo manager fundomanager i text viewer extension itextviewerextension f editor feditor get viewer getviewer get undo manager getundomanager assert not null assertnotnull f undo manager fundomanager f document fdocument f editor feditor get document provider getdocumentprovider get document getdocument f editor feditor get editor input geteditorinput assert not null assertnotnull f document fdocument assert equals assertequals contents f document fdocument java editor javaeditor open java editor openjavaeditor i path ipath path i file ifile file resources plugin resourcesplugin get workspace getworkspace get root getroot get file getfile path assert true asserttrue file file exists java editor javaeditor editor test helper editortesthelper open in editor openineditor file part init exception partinitexception fail override tear down teardown exception editor test helper editortesthelper close editor closeeditor f editor feditor f editor feditor f project fproject java project helper javaprojecthelper delete f project fproject f project fproject test exception assert equals assertequals contents f document fdocument f undo manager fundomanager begin compound change begincompoundchange i method imethod foo java model util javamodelutil find method findmethod foo string f compilation unit fcompilationunit find primary type findprimarytype i method imethod bar java model util javamodelutil find method findmethod bar string f compilation unit fcompilationunit find primary type findprimarytype i java model ijavamodel model java core javacore create java plugin javaplugin get workspace getworkspace get root getroot model delete i java element ijavaelement foo bar f undo manager fundomanager end compound change endcompoundchange assert false assertfalse contents equals f document fdocument f undo manager fundomanager undo assert equals assertequals contents f document fdocument test exception set up project setupproject java core javacore version set up editor setupeditor assert equals assertequals contents f document fdocument f undo manager fundomanager begin compound change begincompoundchange i method imethod foo java model util javamodelutil find method findmethod foo string f compilation unit fcompilationunit find primary type findprimarytype i method imethod bar java model util javamodelutil find method findmethod bar string f compilation unit fcompilationunit find primary type findprimarytype i java model ijavamodel model java core javacore create java plugin javaplugin get workspace getworkspace get root getroot model delete i java element ijavaelement foo model delete i java element ijavaelement bar f undo manager fundomanager end compound change endcompoundchange assert false assertfalse contents equals f document fdocument f undo manager fundomanager undo assert equals assertequals contents f document fdocument