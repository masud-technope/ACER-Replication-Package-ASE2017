copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation mirko raner mirko raner expose j unit model junitmodel export test run session exporttestrunsession api https bugs eclipse org org eclipse jdt junit java file java output stream outputstream java lang reflect invocation target exception invocationtargetexception java util hash set hashset java util javax xml transform transformer exception transformerexception org eclipse jdt junit model i test run session itestrunsession org eclipse core runtime core exception coreexception org eclipse core runtime i path ipath org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime i status istatus org eclipse core runtime operation canceled exception operationcanceledexception org eclipse core runtime path org eclipse core runtime status org eclipse jdt core i classpath container iclasspathcontainer org eclipse jdt core i java element ijavaelement org eclipse jdt core i type itype org eclipse jdt internal junit j unit core plugin junitcoreplugin org eclipse jdt internal junit launcher j unit junit test finder testfinder org eclipse jdt internal junit model j unit model junitmodel org eclipse jdt internal junit model model messages modelmessages org eclipse jdt internal junit model test run session testrunsession accessing j unit junit support functionality methods intended subclassed instantiated clients noextend intended subclassed clients noinstantiate intended instantiated clients j unit core junitcore j unit junit link plain linkplain i classpath container iclasspathcontainer classpath container general format classpath entries container unspecified junit container path junit container path nls string junit container org eclipse jdt junit junit container path j unit junit link plain linkplain i classpath container iclasspathcontainer classpath container nls i path ipath junit container path path junit container append path j unit junit link plain linkplain i classpath container iclasspathcontainer classpath container nls i path ipath junit container path path junit container append adds listener test runs param listener listener deprecated replaced link add test run listener addtestrunlistener test run listener testrunlistener deprecated add test run listener addtestrunlistener i test run listener itestrunlistener listener j unit core plugin junitcoreplugin get default getdefault add test run listener addtestrunlistener listener removes listener test runs param listener listener removed deprecated replaced link remove test run listener removetestrunlistener test run listener testrunlistener deprecated remove test run listener removetestrunlistener i test run listener itestrunlistener listener j unit core plugin junitcoreplugin get default getdefault remove test run listener removetestrunlistener listener adds listener test runs strong note strong plug loaded test starts contribute code org eclipse jdt junit test run listeners testrunlisteners code extension point param listener listener add test run listener addtestrunlistener test run listener testrunlistener listener j unit core plugin junitcoreplugin get default getdefault get new test run listeners getnewtestrunlisteners add listener removes listener test runs param listener listener removed remove test run listener removetestrunlistener test run listener testrunlistener listener j unit core plugin junitcoreplugin get default getdefault get new test run listeners getnewtestrunlisteners remove listener finds types j unit junit tests container param container container param monitor progress monitor report progress request can celation cancelation code code test types container core exception coreexception problem occurs accessing code container code children operation canceled exception operationcanceledexception operation can celed canceled i type itype find test types findtesttypes i java element ijavaelement container i progress monitor iprogressmonitor monitor core exception coreexception operation canceled exception operationcanceledexception i type itype result hash set hashset j unit junit test finder testfinder finder j unit junit test finder testfinder finder find tests in container findtestsincontainer container result monitor result to array toarray i type itype result size exports test session xml report file param test run session testrunsession test session param file destination core exception coreexception error occurred export test run session exporttestrunsession i test run session itestrunsession test run session testrunsession file file core exception coreexception j unit model junitmodel export test run session exporttestrunsession test run session testrunsession test run session testrunsession file exports test session output stream param test run session testrunsession test session param output output stream core exception coreexception error occurred export test run session exporttestrunsession i test run session itestrunsession test run session testrunsession output stream outputstream output core exception coreexception j unit model junitmodel export test run session exporttestrunsession test run session testrunsession test run session testrunsession output transformer exception transformerexception exception string pluginid j unit core plugin junitcoreplugin get plugin id getpluginid string message model messages modelmessages j unit model junitmodel export core exception coreexception status i status istatus error pluginid message exception imports test session file param file file test session transcript imported test session core exception coreexception failed i test run session itestrunsession import test run session importtestrunsession file file core exception coreexception j unit model junitmodel import test run session importtestrunsession file imports test session url param url url test session transcript param monitor progress monitor can cellation cancellation imported test session code code can celled cancelled core exception coreexception failed i test run session itestrunsession import test run session importtestrunsession string url i progress monitor iprogressmonitor monitor core exception coreexception j unit model junitmodel import test run session importtestrunsession url monitor invocation target exception invocationtargetexception exception string pluginid j unit core plugin junitcoreplugin get plugin id getpluginid string message model messages modelmessages j unit model junitmodel throwable throwable exception get cause getcause exception get cause getcause exception core exception coreexception status i status istatus error pluginid message throwable interrupted exception interruptedexception int errupt interrupt