copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt tests quickfix java byte array input stream bytearrayinputstream java byte array output stream bytearrayoutputstream java input stream inputstream java unsupported encoding exception unsupportedencodingexception java util arrays java util collections java util hashtable java util list org eclipse jdt test plugin testplugin java project helper javaprojecthelper org eclipse jdt test plugin testplugin test options testoptions org eclipse core runtime core exception coreexception org eclipse core runtime i path ipath org eclipse core runtime path org eclipse core runtime preferences org eclipse core resources i file ifile org eclipse core resources i folder ifolder org eclipse jface text i text operation target itextoperationtarget org eclipse jface text contentassist i completion proposal icompletionproposal org eclipse jface text source i source viewer isourceviewer org eclipse i editor part ieditorpart org eclipse i workbench page iworkbenchpage org eclipse ide ide org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i java project ijavaproject org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt core i type itype org eclipse jdt core java core javacore org eclipse jdt core formatter default code formatter constants defaultcodeformatterconstants org eclipse jdt internal corext util strings org eclipse jdt tests core project test setup projecttestsetup org eclipse jdt internal java plugin javaplugin org eclipse jdt internal properties file editor propertiesfileeditor properties assist context propertiesassistcontext org eclipse jdt internal properties file editor propertiesfileeditor properties file editor propertiesfileeditor org eclipse jdt internal properties file editor propertiesfileeditor properties file editor messages propertiesfileeditormessages org eclipse jdt internal properties file editor propertiesfileeditor properties quick assist processor propertiesquickassistprocessor junit framework test junit framework test case testcase junit framework test suite testsuite properties file quick assist test propertiesfilequickassisttest test case testcase properties file quick assist test propertiesfilequickassisttest properties file quick assist test propertiesfilequickassisttest i java project ijavaproject fjproject i package fragment root ipackagefragmentroot f source folder fsourcefolder string remove key properties file editor messages propertiesfileeditormessages properties correction processor propertiescorrectionprocessor remove property label string remove properties file editor messages propertiesfileeditormessages properties correction processor propertiescorrectionprocessor remove properties label properties file quick assist test propertiesfilequickassisttest string test suite set up test setuptest test suite testsuite test set up test setuptest test test project test setup projecttestsetup test override set up setup exception hashtable string string options test options testoptions get default options getdefaultoptions options default code formatter constants defaultcodeformatterconstants formatter tab java core javacore space options default code formatter constants defaultcodeformatterconstants formatter tab size java core javacore set options setoptions options set preferences setpreferences fjproject project test setup projecttestsetup get project getproject f source folder fsourcefolder java project helper javaprojecthelper add source container addsourcecontainer fjproject src i path ipath osgi jar osgijar path test resources testresources org eclipse osgi stub jar java project helper javaprojecthelper add library addlibrary fjproject java project helper javaprojecthelper find rt jar findrtjar osgi jar osgijar deprecated set preferences setpreferences preferences core prefs coreprefs java plugin javaplugin get java core plugin preferences getjavacorepluginpreferences core prefs coreprefs set value setvalue java core javacore codeassist field prefixes core prefs coreprefs set value setvalue java core javacore codeassist field prefixes core prefs coreprefs set value setvalue java core javacore codeassist field suffixes core prefs coreprefs set value setvalue java core javacore codeassist field suffixes override tear down teardown exception java project helper javaprojecthelper clear fjproject project test setup projecttestsetup get default classpath getdefaultclasspath i file ifile create property file createpropertyfile i package fragment ipackagefragment pack string string content unsupported encoding exception unsupportedencodingexception core exception coreexception byte array input stream bytearrayinputstream byte array input stream bytearrayinputstream content get bytes getbytes i file ifile file i folder ifolder pack get resource getresource get file getfile file create file check content of cu checkcontentofcu string message i compilation unit icompilationunit string content exception assert equal lines assertequallines message content get buffer getbuffer get contents getcontents check content of file checkcontentoffile string message i file ifile file string content exception input stream inputstream file get contents getcontents assert equal lines assertequallines message content copy to string copytostring close string copy to string copytostring input stream inputstream exception byte array output stream bytearrayoutputstream byte array output stream bytearrayoutputstream read read read write read read read close to string tostring assert equal lines assertequallines string message string expected string actual string expected lines expectedlines strings convert into lines convertintolines expected string actual lines actuallines strings convert into lines convertintolines actual string expected expected lines expectedlines strings concatenate expected lines expectedlines string actual actual lines actuallines strings concatenate actual lines actuallines assert equals assertequals message expected actual list i completion proposal icompletionproposal collect assists collectassists properties assist context propertiesassistcontext context exception i completion proposal icompletionproposal assists properties quick assist processor propertiesquickassistprocessor collect assists collectassists context assists collections empty list assists length assert true asserttrue marked assist properties quick assist processor propertiesquickassistprocessor has assists hasassists context arrays as list aslist assists i editor part ieditorpart open editor openeditor i file ifile file exception i workbench page iworkbenchpage java plugin javaplugin get active page getactivepage exception ide open editor openeditor file properties assist context propertiesassistcontext create assist context createassistcontext i file ifile file offset length exception i editor part ieditorpart editor part editorpart open editor openeditor file i source viewer isourceviewer source viewer sourceviewer i source viewer isourceviewer editor part editorpart get adapter getadapter i text operation target itextoperationtarget i type itype accessor type accessortype properties file editor propertiesfileeditor editor part editorpart get accessor type getaccessortype properties assist context propertiesassistcontext source viewer sourceviewer offset length file source viewer sourceviewer get document getdocument accessor type accessortype test create field in accessor testcreatefieldinaccessor exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test accessor string buffer stringbuffer buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append i compilation unit icompilationunit pack create compilation unit createcompilationunit accessor java buf to string tostring property file buf string buffer stringbuffer buf append test buf append test i file ifile file create property file createpropertyfile pack accessor properties buf to string tostring offset buf to string tostring index of indexof est properties assist context propertiesassistcontext context create assist context createassistcontext file offset list i completion proposal icompletionproposal proposals collect assists collectassists context quick fix test quickfixtest assert number of proposals assertnumberofproposals proposals quick fix test quickfixtest assert correct labels assertcorrectlabels proposals i completion proposal icompletionproposal proposal proposals proposal apply context get document getdocument accessor buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append string test buf append check content of cu checkcontentofcu nls file buf to string tostring test create field in accessor testcreatefieldinaccessor exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test accessor string buffer stringbuffer buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append i compilation unit icompilationunit pack create compilation unit createcompilationunit accessor java buf to string tostring property file buf string buffer stringbuffer buf append test buf append test i file ifile file create property file createpropertyfile pack accessor properties buf to string tostring offset buf to string tostring index of indexof test offset buf to string tostring index of indexof properties assist context propertiesassistcontext context create assist context createassistcontext file offset offset offset list i completion proposal icompletionproposal proposals collect assists collectassists context quick fix test quickfixtest assert number of proposals assertnumberofproposals proposals quick fix test quickfixtest assert correct labels assertcorrectlabels proposals i completion proposal icompletionproposal proposal proposals proposal apply context get document getdocument accessor buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append string test buf append string test buf append check content of cu checkcontentofcu nls file buf to string tostring test create field in accessor testcreatefieldinaccessor exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test accessor string buffer stringbuffer buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append string test buf append string test buf append string test buf append i compilation unit icompilationunit pack create compilation unit createcompilationunit accessor java buf to string tostring property file buf string buffer stringbuffer buf append test buf append test buf append test buf append test buf append test i file ifile file create property file createpropertyfile pack accessor properties buf to string tostring offset buf to string tostring index of indexof test properties assist context propertiesassistcontext context create assist context createassistcontext file offset list i completion proposal icompletionproposal proposals collect assists collectassists context quick fix test quickfixtest assert number of proposals assertnumberofproposals proposals quick fix test quickfixtest assert correct labels assertcorrectlabels proposals i completion proposal icompletionproposal proposal proposals proposal apply context get document getdocument accessor buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append string test buf append string test buf append string test buf append string test buf append check content of cu checkcontentofcu nls file buf to string tostring test create field in accessor testcreatefieldinaccessor exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test accessor string buffer stringbuffer buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append string test buf append string test buf append string test buf append string test buf append i compilation unit icompilationunit pack create compilation unit createcompilationunit accessor java buf to string tostring property file buf string buffer stringbuffer buf append test buf append test buf append test buf append test buf append test buf append test i file ifile file create property file createpropertyfile pack accessor properties buf to string tostring offset buf to string tostring index of indexof test offset buf to string tostring index of indexof properties assist context propertiesassistcontext context create assist context createassistcontext file offset offset offset list i completion proposal icompletionproposal proposals collect assists collectassists context quick fix test quickfixtest assert number of proposals assertnumberofproposals proposals quick fix test quickfixtest assert correct labels assertcorrectlabels proposals i completion proposal icompletionproposal proposal proposals proposal apply context get document getdocument accessor buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append string test buf append string test buf append string test buf append string test buf append string test buf append string test buf append check content of cu checkcontentofcu nls file buf to string tostring test create field in accessor testcreatefieldinaccessor exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test accessor string buffer stringbuffer buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append string test buf append string test buf append string test buf append string test buf append i compilation unit icompilationunit pack create compilation unit createcompilationunit accessor java buf to string tostring property file buf string buffer stringbuffer buf append test buf append test buf append test buf append test buf append test buf append test i file ifile file create property file createpropertyfile pack accessor properties buf to string tostring offset buf to string tostring index of indexof test offset buf to string tostring index of indexof properties assist context propertiesassistcontext context create assist context createassistcontext file offset offset offset list i completion proposal icompletionproposal proposals collect assists collectassists context quick fix test quickfixtest assert number of proposals assertnumberofproposals proposals quick fix test quickfixtest assert correct labels assertcorrectlabels proposals i completion proposal icompletionproposal proposal proposals proposal apply context get document getdocument accessor buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append string test buf append string test buf append string test buf append string test buf append string test buf append string test buf append check content of cu checkcontentofcu nls file buf to string tostring test create field in accessor testcreatefieldinaccessor exception https bugs eclipse org bugs bug cgi i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test accessor string buffer stringbuffer buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append random name randomname nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle random name randomname buf append buf append random name randomname buf append buf append i compilation unit icompilationunit pack create compilation unit createcompilationunit random name randomname java buf to string tostring property file buf string buffer stringbuffer buf append test buf append test i file ifile file create property file createpropertyfile pack accessor properties buf to string tostring offset buf to string tostring index of indexof est properties assist context propertiesassistcontext context create assist context createassistcontext file offset list i completion proposal icompletionproposal proposals collect assists collectassists context quick fix test quickfixtest assert number of proposals assertnumberofproposals proposals quick fix test quickfixtest assert correct labels assertcorrectlabels proposals i completion proposal icompletionproposal proposal proposals proposal apply context get document getdocument accessor buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append random name randomname nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle random name randomname buf append buf append random name randomname buf append buf append string test buf append check content of cu checkcontentofcu nls file buf to string tostring test remove property testremoveproperty exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test accessor string buffer stringbuffer buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append pack create compilation unit createcompilationunit accessor java buf to string tostring property file buf string buffer stringbuffer buf append test buf append test i file ifile file create property file createpropertyfile pack accessor properties buf to string tostring offset buf to string tostring index of indexof est properties assist context propertiesassistcontext context create assist context createassistcontext file offset list i completion proposal icompletionproposal proposals collect assists collectassists context quick fix test quickfixtest assert number of proposals assertnumberofproposals proposals quick fix test quickfixtest assert correct labels assertcorrectlabels proposals i completion proposal icompletionproposal proposal quick fix test quickfixtest find proposal by name findproposalbyname remove key proposals proposal apply context get document getdocument property file buf string buffer stringbuffer buf append test check content of file checkcontentoffile property file file buf to string tostring test remove property testremoveproperty exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test accessor string buffer stringbuffer buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append pack create compilation unit createcompilationunit accessor java buf to string tostring property file buf string buffer stringbuffer buf append test buf append test i file ifile file create property file createpropertyfile pack accessor properties buf to string tostring offset buf to string tostring index of indexof test offset buf to string tostring index of indexof properties assist context propertiesassistcontext context create assist context createassistcontext file offset offset offset list i completion proposal icompletionproposal proposals collect assists collectassists context quick fix test quickfixtest assert number of proposals assertnumberofproposals proposals quick fix test quickfixtest assert correct labels assertcorrectlabels proposals i completion proposal icompletionproposal proposal quick fix test quickfixtest find proposal by name findproposalbyname remove proposals proposal apply context get document getdocument property file buf string buffer stringbuffer check content of file checkcontentoffile property file file buf to string tostring test remove property testremoveproperty exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test accessor string buffer stringbuffer buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append string test buf append string test buf append i compilation unit icompilationunit pack create compilation unit createcompilationunit accessor java buf to string tostring property file buf string buffer stringbuffer buf append test buf append test i file ifile file create property file createpropertyfile pack accessor properties buf to string tostring offset buf to string tostring index of indexof est properties assist context propertiesassistcontext context create assist context createassistcontext file offset list i completion proposal icompletionproposal proposals collect assists collectassists context quick fix test quickfixtest assert number of proposals assertnumberofproposals proposals quick fix test quickfixtest assert correct labels assertcorrectlabels proposals i completion proposal icompletionproposal proposal quick fix test quickfixtest find proposal by name findproposalbyname remove key proposals proposal apply context get document getdocument accessor buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append string test buf append check content of cu checkcontentofcu nls file buf to string tostring property file buf string buffer stringbuffer buf append test check content of file checkcontentoffile property file file buf to string tostring test remove property testremoveproperty exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test accessor string buffer stringbuffer buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append string test buf append string test buf append string test buf append string test buf append string test buf append string test buf append i compilation unit icompilationunit pack create compilation unit createcompilationunit accessor java buf to string tostring property file buf string buffer stringbuffer buf append test buf append test buf append test buf append test buf append test buf append test i file ifile file create property file createpropertyfile pack accessor properties buf to string tostring offset buf to string tostring index of indexof test offset buf to string tostring index of indexof properties assist context propertiesassistcontext context create assist context createassistcontext file offset offset offset list i completion proposal icompletionproposal proposals collect assists collectassists context quick fix test quickfixtest assert number of proposals assertnumberofproposals proposals quick fix test quickfixtest assert correct labels assertcorrectlabels proposals i completion proposal icompletionproposal proposal quick fix test quickfixtest find proposal by name findproposalbyname remove proposals proposal apply context get document getdocument accessor buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append string test buf append string test buf append string test buf append string test buf append check content of cu checkcontentofcu nls file buf to string tostring property file buf string buffer stringbuffer buf append test buf append test buf append test buf append test check content of file checkcontentoffile property file file buf to string tostring test no proposals testnoproposals exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test accessor string buffer stringbuffer buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append string test buf append string test buf append pack create compilation unit createcompilationunit accessor java buf to string tostring property file buf string buffer stringbuffer buf append test buf append test buf append buf append buf append test buf append test buf append test buf append i file ifile file create property file createpropertyfile pack accessor properties buf to string tostring offset buf to string tostring index of indexof test properties assist context propertiesassistcontext context create assist context createassistcontext file offset list i completion proposal icompletionproposal proposals collect assists collectassists context quick fix test quickfixtest assert number of proposals assertnumberofproposals proposals test no proposals testnoproposals exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test accessor string buffer stringbuffer buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append string test buf append string test buf append pack create compilation unit createcompilationunit accessor java buf to string tostring property file buf string buffer stringbuffer buf append test buf append test buf append buf append buf append test buf append test buf append test buf append i file ifile file create property file createpropertyfile pack accessor properties buf to string tostring offset buf to string tostring index of indexof properties assist context propertiesassistcontext context create assist context createassistcontext file offset list i completion proposal icompletionproposal proposals collect assists collectassists context quick fix test quickfixtest assert number of proposals assertnumberofproposals proposals test no proposals testnoproposals exception i package fragment ipackagefragment pack f source folder fsourcefolder create package fragment createpackagefragment test accessor string buffer stringbuffer buf string buffer stringbuffer buf append test buf append org eclipse osgi util nls buf append accessor nls buf append string bundle test accessor nls buf append buf append nls initialize messages initializemessages bundle accessor buf append buf append accessor buf append buf append string test buf append string test buf append pack create compilation unit createcompilationunit accessor java buf to string tostring property file buf string buffer stringbuffer buf append test buf append test buf append buf append buf append test buf append test buf append test buf append i file ifile file create property file createpropertyfile pack accessor properties buf to string tostring offset buf to string tostring index of indexof properties assist context propertiesassistcontext context create assist context createassistcontext file offset list i completion proposal icompletionproposal proposals collect assists collectassists context quick fix test quickfixtest assert number of proposals assertnumberofproposals proposals