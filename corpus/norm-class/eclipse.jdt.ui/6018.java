copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt tests core java util hashtable junit framework test junit framework test suite testsuite org eclipse jdt test plugin testplugin java project helper javaprojecthelper org eclipse jdt test plugin testplugin test options testoptions org eclipse core runtime org eclipse text edits text edit textedit org eclipse jface text bad location exception badlocationexception org eclipse jface text bad position category exception badpositioncategoryexception org eclipse jface text default position updater defaultpositionupdater org eclipse jface text document org eclipse jface text position org eclipse jdt core i java project ijavaproject org eclipse jdt core java core javacore org eclipse jdt core dom ast org eclipse jdt core dom catch clause catchclause org eclipse jdt core dom javadoc org eclipse jdt core dom package declaration packagedeclaration org eclipse jdt core dom string literal stringliteral org eclipse jdt core dom variable declaration fragment variabledeclarationfragment org eclipse jdt core formatter code formatter codeformatter org eclipse jdt core formatter default code formatter constants defaultcodeformatterconstants org eclipse jdt internal corext util code formatter util codeformatterutil org eclipse jdt internal java plugin javaplugin org eclipse jdt internal java editor javaeditor ast provider astprovider code formatter util test codeformatterutiltest core tests coretests code formatter util test codeformatterutiltest code formatter util test codeformatterutiltest i java project ijavaproject fjproject code formatter util test codeformatterutiltest string test suite set up test setuptest test suite testsuite test set up test setuptest test test project test setup projecttestsetup test override set up setup exception fjproject java project helper javaprojecthelper create java project createjavaproject test project testproject bin java project helper javaprojecthelper add required project addrequiredproject fjproject project test setup projecttestsetup get project getproject hashtable string string options test options testoptions get default options getdefaultoptions options default code formatter constants defaultcodeformatterconstants formatter tab java core javacore space options default code formatter constants defaultcodeformatterconstants formatter tab size options default code formatter constants defaultcodeformatterconstants formatter split java core javacore set options setoptions options override tear down teardown exception java project helper javaprojecthelper delete fjproject string evaluate formatter edit evaluateformatteredit string string text edit textedit edit position positions document doc create document createdocument string positions edit apply doc positions positions length is true istrue positions is deleted isdeleted position deleted doc bad location exception badlocationexception java plugin javaplugin log is true istrue formatter created edits wrong positions get message getmessage document create document createdocument string string position positions illegal argument exception illegalargumentexception document doc document string positions string nls pos category nls my category mycategory doc add position category addpositioncategory pos category doc add position updater addpositionupdater default position updater defaultpositionupdater pos category override not deleted notdeleted f offset foffset f position fposition offset f position fposition offset f position fposition length f offset foffset f length flength deleted positions remove f position fposition offset f offset foffset f length flength positions length doc add position addposition pos category positions bad location exception badlocationexception illegal argument exception illegalargumentexception position string offset positions offset length positions length string size string length bad position category exception badpositioncategoryexception cannot happen cannothappen doc testcu exception string buffer stringbuffer buf string buffer stringbuffer buf append test buf append buf append foo buf append runnable runnable buf append buf append string contents buf to string tostring string formatted code formatter util codeformatterutil format code formatter codeformatter compilation unit contents fjproject buf string buffer stringbuffer buf append test buf append buf append foo buf append runnable runnable buf append buf append buf append string expected buf to string tostring assert equal string assertequalstring formatted expected testcuindented exception string buffer stringbuffer buf string buffer stringbuffer buf append test buf append buf append foo buf append runnable runnable buf append buf append string contents buf to string tostring string formatted code formatter util codeformatterutil format code formatter codeformatter compilation unit contents fjproject buf string buffer stringbuffer buf append test buf append buf append foo buf append runnable runnable buf append buf append buf append string expected buf to string tostring assert equal string assertequalstring formatted expected testcunewapi exception string buffer stringbuffer buf string buffer stringbuffer buf append test buf append buf append foo buf append runnable runnable buf append buf append string contents buf to string tostring text edit textedit edit code formatter util codeformatterutil format code formatter codeformatter compilation unit contents document doc document contents edit apply doc string formatted doc buf string buffer stringbuffer buf append test buf append buf append foo buf append runnable runnable buf append buf append buf append string expected buf to string tostring assert equal string assertequalstring formatted expected testcunewapi exception string buffer stringbuffer buf string buffer stringbuffer buf append test buf append buf append buf append comment buf append buf append foo buf append runnable runnable buf append buf append string contents buf to string tostring text edit textedit edit code formatter util codeformatterutil format code formatter codeformatter compilation unit contents document doc document contents edit apply doc string formatted doc buf string buffer stringbuffer buf append test buf append buf append buf append comment buf append buf append foo buf append runnable runnable buf append buf append buf append string expected buf to string tostring assert equal string assertequalstring formatted expected testcuwithpos exception string buffer stringbuffer buf string buffer stringbuffer buf append test buf append buf append foo buf append runnable runnable buf append buf append string contents buf to string tostring string word start contents index of indexof word position pos position start word length text edit textedit edit code formatter util codeformatterutil format code formatter codeformatter compilation unit contents assert not null assertnotnull edit string formatted evaluate formatter edit evaluateformatteredit contents edit position pos buf string buffer stringbuffer buf append test buf append buf append foo buf append runnable runnable buf append buf append buf append string expected buf to string tostring assert equal string assertequalstring formatted expected string curr formatted substring pos offset pos offset pos length assert equal string assertequalstring curr word test package testpackage exception string buffer stringbuffer buf string buffer stringbuffer buf append test string contents buf to string tostring ast ast ast newast ast provider astprovider shared ast level package declaration packagedeclaration decl ast new package declaration newpackagedeclaration text edit textedit edit code formatter util codeformatterutil format decl contents assert not null assertnotnull edit document document document contents edit apply document buf string buffer stringbuffer buf append test assert equal string assertequalstring document buf to string tostring test package with pos testpackagewithpos exception string buffer stringbuffer buf string buffer stringbuffer buf append test string contents buf to string tostring ast ast ast newast ast provider astprovider shared ast level package declaration packagedeclaration node ast new package declaration newpackagedeclaration string word start contents index of indexof word string word start contents index of indexof word position pos position start word length position pos position start word length text edit textedit edit code formatter util codeformatterutil format node contents assert not null assertnotnull edit string formatted evaluate formatter edit evaluateformatteredit contents edit position pos pos buf string buffer stringbuffer buf append test string expected buf to string tostring assert equal string assertequalstring formatted expected string curr formatted substring pos offset pos offset pos length assert equal string assertequalstring curr word string curr formatted substring pos offset pos offset pos length assert equal string assertequalstring curr word test var decl state menet with pos testvardeclstatemenetwithpos exception string buffer stringbuffer buf string buffer stringbuffer buf append nnew offset string contents buf to string tostring ast ast ast newast ast provider astprovider shared ast level variable declaration fragment variabledeclarationfragment node ast new variable declaration fragment newvariabledeclarationfragment string word start contents index of indexof word string word offset start contents index of indexof word position pos position start word length position pos position start word length text edit textedit edit code formatter util codeformatterutil format node contents assert not null assertnotnull edit string formatted evaluate formatter edit evaluateformatteredit contents edit position pos pos buf string buffer stringbuffer buf append offset string expected buf to string tostring assert equal string assertequalstring formatted expected string curr formatted substring pos offset pos offset pos length assert equal string assertequalstring curr word string curr formatted substring pos offset pos offset pos length assert equal string assertequalstring curr word test javadoc testjavadoc exception string buffer stringbuffer buf string buffer stringbuffer buf append bar buf append foo buf append string contents buf to string tostring ast ast ast newast ast provider astprovider shared ast level javadoc node ast new javadoc newjavadoc string word bar start contents index of indexof word string word foo start contents index of indexof word position pos position start word length position pos position start word length text edit textedit edit code formatter util codeformatterutil format node contents assert not null assertnotnull edit string formatted evaluate formatter edit evaluateformatteredit contents edit position pos pos buf string buffer stringbuffer buf append bar buf append foo buf append string expected buf to string tostring assert equal string assertequalstring formatted expected string curr formatted substring pos offset pos offset pos length assert equal string assertequalstring curr word string curr formatted substring pos offset pos offset pos length assert equal string assertequalstring curr word test javadoc testjavadoc exception string buffer stringbuffer buf string buffer stringbuffer buf append bar buf append foo buf append string contents buf to string tostring ast ast ast newast ast provider astprovider shared ast level javadoc node ast new javadoc newjavadoc string word bar start contents index of indexof word string word foo start contents index of indexof word position pos position start word length position pos position start word length text edit textedit edit code formatter util codeformatterutil format node contents assert not null assertnotnull edit string formatted evaluate formatter edit evaluateformatteredit contents edit position pos pos buf string buffer stringbuffer buf append bar buf append foo buf append string expected buf to string tostring assert equal string assertequalstring formatted expected string curr formatted substring pos offset pos offset pos length assert equal string assertequalstring curr word string curr formatted substring pos offset pos offset pos length assert equal string assertequalstring curr word test javadoc testjavadoc exception string buffer stringbuffer buf string buffer stringbuffer buf append bar buf append foo buf append string contents buf to string tostring ast ast ast newast ast provider astprovider shared ast level javadoc node ast new javadoc newjavadoc string word bar start contents index of indexof word string word foo start contents index of indexof word position pos position start word length position pos position start word length text edit textedit edit code formatter util codeformatterutil format node contents assert not null assertnotnull edit string formatted evaluate formatter edit evaluateformatteredit contents edit position pos pos buf string buffer stringbuffer buf append bar buf append foo buf append string expected buf to string tostring assert equal string assertequalstring formatted expected string curr formatted substring pos offset pos offset pos length assert equal string assertequalstring curr word string curr formatted substring pos offset pos offset pos length assert equal string assertequalstring curr word test catch clause testcatchclause exception string buffer stringbuffer buf string buffer stringbuffer buf append buf append exception buf append string contents buf to string tostring ast ast ast newast ast provider astprovider shared ast level catch clause catchclause node ast new catch clause newcatchclause string word start contents index of indexof word string word exception start contents index of indexof word position pos position start word length position pos position start word length text edit textedit edit code formatter util codeformatterutil format node contents assert not null assertnotnull edit string formatted evaluate formatter edit evaluateformatteredit contents edit position pos pos buf string buffer stringbuffer buf append exception buf append string expected buf to string tostring assert equal string assertequalstring formatted expected string curr formatted substring pos offset pos offset pos length assert equal string assertequalstring curr word string curr formatted substring pos offset pos offset pos length assert equal string assertequalstring curr word test catch string literal testcatchstringliteral exception string buffer stringbuffer buf string buffer stringbuffer buf append string contents buf to string tostring ast ast ast newast ast provider astprovider shared ast level string literal stringliteral node ast new string literal newstringliteral text edit textedit edit code formatter util codeformatterutil format node contents assert not null assertnotnull edit document document document contents edit apply document buf string buffer stringbuffer buf append string expected buf to string tostring assert equal string assertequalstring document expected test format sub string testformatsubstring exception string buffer stringbuffer buf string buffer stringbuffer buf append test buf append buf append java util vector buf append buf append buf append foo buf append runnable runnable runnable buf append runnable to string tostring buf append buf append string contents buf to string tostring string format string formatstring runnable runnable runnable format start formatstart contents index of indexof format string formatstring format length formatlength format string formatstring length string word start contents index of indexof word string word start contents index of indexof word string word to string tostring start contents index of indexof word position pos position start word length position pos position start word length position pos position start word length text edit textedit edit code formatter util codeformatterutil format code formatter codeformatter compilation unit contents format start formatstart format length formatlength assert not null assertnotnull edit string formatted evaluate formatter edit evaluateformatteredit contents edit position pos pos pos buf string buffer stringbuffer buf append test buf append buf append java util vector buf append buf append buf append foo buf append runnable runnable runnable buf append buf append runnable to string tostring buf append buf append string expected buf to string tostring assert equal string assertequalstring formatted expected string curr formatted substring pos offset pos get offset getoffset pos get length getlength assert equal string assertequalstring curr word string curr formatted substring pos offset pos get offset getoffset pos get length getlength assert equal string assertequalstring curr word string curr formatted substring pos offset pos get offset getoffset pos get length getlength assert equal string assertequalstring curr word