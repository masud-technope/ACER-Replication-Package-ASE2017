copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt tests core java util hashtable java util list org eclipse jdt test plugin testplugin java project helper javaprojecthelper org eclipse jdt test plugin testplugin test options testoptions org eclipse jface preference i preference store ipreferencestore org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i java project ijavaproject org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt core java core javacore org eclipse jdt core dom ast node astnode org eclipse jdt core dom ast parser astparser org eclipse jdt core dom abstract type declaration abstracttypedeclaration org eclipse jdt core dom assignment org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom expression org eclipse jdt core dom expression statement expressionstatement org eclipse jdt core dom i variable binding ivariablebinding org eclipse jdt core dom method declaration methoddeclaration org eclipse jdt core dom node finder nodefinder org eclipse jdt core dom simple name simplename org eclipse jdt core dom single variable declaration singlevariabledeclaration org eclipse jdt core dom type org eclipse jdt core dom type declaration typedeclaration org eclipse jdt core formatter default code formatter constants defaultcodeformatterconstants org eclipse jdt internal corext dom ast nodes astnodes org eclipse jdt preference constants preferenceconstants org eclipse jdt internal java plugin javaplugin org eclipse jdt internal java editor javaeditor ast provider astprovider junit framework test junit framework test suite testsuite partialasttest core tests coretests partialasttest partialasttest i java project ijavaproject fjproject i package fragment root ipackagefragmentroot f source folder fsourcefolder partialasttest string test suite set up test setuptest test suite testsuite test set up test setuptest test test project test setup projecttestsetup test override set up setup exception hashtable string string options test options testoptions get default options getdefaultoptions options default code formatter constants defaultcodeformatterconstants formatter tab java core javacore space options default code formatter constants defaultcodeformatterconstants formatter tab size java core javacore set options setoptions options i preference store ipreferencestore store java plugin javaplugin get default getdefault get preference store getpreferencestore store set value setvalue preference constants preferenceconstants codegen add comments fjproject project test setup projecttestsetup get project getproject f source folder fsourcefolder java project helper javaprojecthelper add source container addsourcecontainer fjproject src override tear down teardown exception java project helper javaprojecthelper clear fjproject project test setup projecttestsetup get default classpath getdefaultclasspath test partial u testpartialcu exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test string buffer stringbuffer buf string buffer stringbuffer buf append test buf append java util vector buf append buf append f field ffield buf append f field ffield buf append foo buf append f field ffield f field ffield buf append buf append foo buf append buf append buf append string existing buf to string tostring i compilation unit icompilationunit pack create compilation unit createcompilationunit java existing string statement f field ffield f field ffield offset existing index of indexof statement compilation unit compilationunit ast root astroot get partial compilation unit getpartialcompilationunit offset string string ast nodes astnodes as for matted string asformattedstring ast root astroot string value of valueof buf string buffer stringbuffer buf append test buf append java util vector buf append buf append f field ffield buf append f field ffield buf append foo buf append f field ffield f field ffield buf append buf append foo buf append buf append string expected buf to string tostring assert equal string assertequalstring string expected offset expected index of indexof statement ast node astnode node node finder nodefinder perform ast root astroot offset statement length assignment assignment assignment expression statement expressionstatement node get expression getexpression expression assignment get left hand side getlefthandside expression assignment get right hand side getrighthandside assert not null assertnotnull resolve type binding resolvetypebinding assert not null assertnotnull resolve type binding resolvetypebinding assert true asserttrue simple name simplename resolve binding resolvebinding i variable binding ivariablebinding assert true asserttrue simple name simplename resolve binding resolvebinding i variable binding ivariablebinding assert all bindings assertallbindings ast root astroot assert all bindings assertallbindings compilation unit compilationunit ast root astroot list abstract type declaration abstracttypedeclaration list ast root astroot types list size type declaration typedeclaration decl type declaration typedeclaration list assert true asserttrue decl resolve binding resolvebinding decl is interface isinterface decl get superclass type getsuperclasstype assert true asserttrue decl get superclass type getsuperclasstype resolve binding resolvebinding list type interfaces decl super interface types superinterfacetypes interfaces size assert true asserttrue interfaces resolve binding resolvebinding method declaration methoddeclaration declarations decl get methods getmethods declarations length method declaration methoddeclaration meth declarations assert true asserttrue meth resolve binding resolvebinding list single variable declaration singlevariabledeclaration params meth parameters params size single variable declaration singlevariabledeclaration arg params assert true asserttrue arg resolve binding resolvebinding meth is constructor isconstructor assert true asserttrue meth get return type getreturntype resolve binding resolvebinding test partial u testpartialcu exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test string buffer stringbuffer buf string buffer stringbuffer buf append test buf append java util vector buf append buf append e inner einner buf append buf append buf append buf append buf append f field ffield buf append f field ffield buf append foo buf append f field ffield f field ffield buf append f field ffield buf append f field ffield buf append buf append e inner einner e inner einner buf append buf append foo buf append local buf append local buf append buf append buf append buf append local local local buf append buf append buf append string existing buf to string tostring i compilation unit icompilationunit pack create compilation unit createcompilationunit java existing offset existing index of indexof f field ffield f field ffield compilation unit compilationunit ast root astroot get partial compilation unit getpartialcompilationunit offset string string ast nodes astnodes as for matted string asformattedstring ast root astroot string value of valueof buf string buffer stringbuffer buf append test buf append java util vector buf append buf append e inner einner buf append buf append buf append buf append f field ffield buf append f field ffield buf append foo buf append f field ffield f field ffield buf append f field ffield buf append f field ffield buf append buf append e inner einner e inner einner buf append buf append foo buf append buf append string expected buf to string tostring assert equal string assertequalstring string expected assert all bindings assertallbindings ast root astroot test partial u testpartialcu exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test string buffer stringbuffer buf string buffer stringbuffer buf append test buf append java util vector buf append java serializable buf append buf append e inner einner serializable buf append buf append buf append buf append buf append f field ffield buf append f field ffield buf append foo buf append f field ffield f field ffield buf append f field ffield buf append f field ffield buf append buf append e inner einner e inner einner buf append buf append foo buf append local buf append local buf append buf append buf append buf append local local local buf append buf append buf append string existing buf to string tostring i compilation unit icompilationunit pack create compilation unit createcompilationunit java existing offset existing index of indexof compilation unit compilationunit ast root astroot get partial compilation unit getpartialcompilationunit offset string string ast nodes astnodes as for matted string asformattedstring ast root astroot string value of valueof buf string buffer stringbuffer buf append test buf append java util vector buf append java serializable buf append buf append e inner einner serializable buf append buf append buf append buf append f field ffield buf append f field ffield buf append foo buf append buf append foo buf append local buf append local buf append buf append buf append buf append local local local buf append buf append buf append string expected buf to string tostring assert equal string assertequalstring string expected assert all bindings assertallbindings ast root astroot test partial u testpartialcu exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test string buffer stringbuffer buf string buffer stringbuffer buf append test buf append java util vector buf append java io exception ioexception buf append java text parse exception parseexception buf append buf append e inner einner buf append buf append buf append buf append buf append f field ffield buf append f field ffield buf append foo io exception ioexception parse exception parseexception buf append f field ffield f field ffield buf append f field ffield buf append f field ffield buf append buf append e inner einner e inner einner buf append buf append foo buf append local buf append local buf append buf append buf append buf append local local local buf append buf append buf append string existing buf to string tostring i compilation unit icompilationunit pack create compilation unit createcompilationunit java existing offset existing index of indexof compilation unit compilationunit ast root astroot get partial compilation unit getpartialcompilationunit offset string string ast nodes astnodes as for matted string asformattedstring ast root astroot string value of valueof buf string buffer stringbuffer buf append test buf append java util vector buf append java io exception ioexception buf append java text parse exception parseexception buf append buf append e inner einner buf append buf append buf append buf append buf append f field ffield buf append f field ffield buf append foo io exception ioexception parse exception parseexception buf append buf append foo buf append buf append string expected buf to string tostring assert equal string assertequalstring string expected assert all bindings assertallbindings ast root astroot test partial position not in method testpartialcupositionnotinmethod exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test string buffer stringbuffer buf string buffer stringbuffer buf append test buf append java util vector buf append java io exception ioexception buf append java text parse exception parseexception buf append buf append e inner einner buf append buf append buf append buf append buf append f field ffield buf append f field ffield buf append foo io exception ioexception parse exception parseexception buf append f field ffield f field ffield buf append f field ffield buf append f field ffield buf append buf append e inner einner e inner einner buf append buf append foo buf append local buf append local buf append buf append buf append buf append local local local buf append buf append buf append string existing buf to string tostring i compilation unit icompilationunit pack create compilation unit createcompilationunit java existing offset existing index of indexof f field ffield compilation unit compilationunit ast root astroot get partial compilation unit getpartialcompilationunit offset string string ast nodes astnodes as for matted string asformattedstring ast root astroot string value of valueof buf string buffer stringbuffer buf append test buf append java util vector buf append java io exception ioexception buf append java text parse exception parseexception buf append buf append e inner einner buf append buf append buf append buf append f field ffield buf append f field ffield buf append foo io exception ioexception parse exception parseexception buf append buf append foo buf append buf append string expected buf to string tostring assert equal string assertequalstring string expected assert all bindings assertallbindings ast root astroot test partial position not in method testpartialcupositionnotinmethod exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test string buffer stringbuffer buf string buffer stringbuffer buf append test buf append java util vector buf append java io exception ioexception buf append java text parse exception parseexception buf append buf append e inner einner buf append buf append system println buf append buf append buf append f field ffield buf append f field ffield buf append foo io exception ioexception parse exception parseexception buf append f field ffield f field ffield buf append f field ffield buf append f field ffield buf append buf append e inner einner e inner einner buf append buf append foo buf append local buf append f field ffield buf append local buf append buf append buf append buf append local local local buf append buf append buf append string existing buf to string tostring i compilation unit icompilationunit pack create compilation unit createcompilationunit java existing offset existing index of indexof f field ffield compilation unit compilationunit ast root astroot get partial compilation unit getpartialcompilationunit offset string string ast nodes astnodes as for matted string asformattedstring ast root astroot string value of valueof buf string buffer stringbuffer buf append test buf append java util vector buf append java io exception ioexception buf append java text parse exception parseexception buf append buf append e inner einner buf append buf append buf append buf append f field ffield buf append f field ffield buf append foo io exception ioexception parse exception parseexception buf append buf append foo buf append local buf append f field ffield buf append local buf append buf append buf append buf append local local local buf append buf append buf append string expected buf to string tostring assert equal string assertequalstring string expected assert all bindings assertallbindings ast root astroot compilation unit compilationunit get partial compilation unit getpartialcompilationunit i compilation unit icompilationunit offset ast parser astparser ast parser astparser new parser newparser ast provider astprovider shared ast level set source setsource set focal position setfocalposition offset set resolve bindings setresolvebindings compilation unit compilationunit createast partial visitor partialvisitor ast visitor astvisitor f offset foffset partial visitor partialvisitor offset f offset foffset offset visit block node ast node astnode parent node get parent getparent parent method declaration methoddeclaration parent initializer start node get start position getstartposition start node get length getlength start f offset foffset f offset foffset node statements clear