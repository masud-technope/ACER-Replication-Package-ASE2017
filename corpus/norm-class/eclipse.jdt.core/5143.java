copyright bea systems rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors wharley initial api implementation org eclipse jdt apt tests java file junit framework test junit framework test suite testsuite org eclipse core resources i marker imarker org eclipse core resources i project iproject org eclipse core runtime i path ipath org eclipse core runtime path org eclipse jdt apt core internal apt plugin aptplugin org eclipse jdt apt core util apt config aptconfig org eclipse jdt apt core util i factory path ifactorypath org eclipse jdt apt tests external annotations class loader classloader color annotation processor colorannotationprocessor org eclipse jdt apt tests external annotations class loader classloader color test code example colortestcodeexample org eclipse jdt apt tests external annotations loader test loadertest loader test annotation processor loadertestannotationprocessor org eclipse jdt apt tests external annotations loader test loadertest loader test code example loadertestcodeexample org eclipse jdt core i java project ijavaproject org eclipse jdt core java core javacore factory loader tests factoryloadertests apt test base apttestbase external annotation jar file ext jar extjar external annotation jar classpath relative path i path ipath ext var jar extvarjar initialized set up setup cleared tear down teardown i path ipath project path projectpath nls string tempjardir cpvar factory loader test factoryloadertest temp factory loader tests factoryloadertests string test suite test suite testsuite factory loader tests factoryloadertests set up setup exception set up setup project path projectpath env get project getproject get project name getprojectname get full path getfullpath ext jar extjar test util testutil create and add external annotation jar createandaddexternalannotationjar env get java project getjavaproject project path projectpath create classpath variable jar file refer file canonical jar canonicaljar ext jar extjar get canonical file getcanonicalfile i path ipath jar dir jardir path canonical jar canonicaljar get parent getparent string ext jar name extjarname canonical jar canonicaljar get name getname i path ipath var path varpath path tempjardir cpvar ext var jar extvarjar var path varpath append ext jar name extjarname java core javacore set classpath variable setclasspathvariable tempjardir cpvar jar dir jardir i path ipath src root srcroot get source path getsourcepath string code loader test code example loadertestcodeexample code env add class addclass src root srcroot loader test code example loadertestcodeexample code loader test code example loadertestcodeexample code code code color test code example colortestcodeexample code env add class addclass src root srcroot color test code example colortestcodeexample code color test code example colortestcodeexample code code test external jar loader testexternaljarloader exception loader test annotation processor loadertestannotationprocessor clear loaded clearloaded i project iproject project env get project getproject get project name getprojectname full build fullbuild project get full path getfullpath expecting no problems expectingnoproblems assert false assertfalse loader test annotation processor loadertestannotationprocessor is loaded isloaded i java project ijavaproject jproj env get java project getjavaproject get project name getprojectname i factory path ifactorypath ifp apt config aptconfig get factory path getfactorypath jproj add ext jar extjar factory list external jar rebuild ifp add external jar addexternaljar ext jar extjar apt config aptconfig set factory path setfactorypath jproj ifp rebuild verify processor loaded loader test annotation processor loadertestannotationprocessor clear loaded clearloaded full build fullbuild project get full path getfullpath expecting no problems expectingnoproblems assert true asserttrue loader test annotation processor loadertestannotationprocessor is loaded isloaded verify color annotation processor colorannotationprocessor assert true asserttrue color annotation processor colorannotationprocessor was successful wassuccessful restore original ifp remove external jar removeexternaljar ext jar extjar apt config aptconfig set factory path setfactorypath jproj ifp rebuild verify processor loaded loader test annotation processor loadertestannotationprocessor clear loaded clearloaded full build fullbuild project get full path getfullpath expecting no problems expectingnoproblems assert false assertfalse loader test annotation processor loadertestannotationprocessor is loaded isloaded add ext jar extjar factory list path relative jar rebuild ifp add var jar addvarjar ext var jar extvarjar apt config aptconfig set factory path setfactorypath jproj ifp rebuild verify processor loaded loader test annotation processor loadertestannotationprocessor clear loaded clearloaded full build fullbuild project get full path getfullpath expecting no problems expectingnoproblems assert true asserttrue loader test annotation processor loadertestannotationprocessor is loaded isloaded restore original ifp remove var jar removevarjar ext var jar extvarjar apt config aptconfig set factory path setfactorypath jproj ifp rebuild verify processor loaded loader test annotation processor loadertestannotationprocessor clear loaded clearloaded full build fullbuild project get full path getfullpath expecting no problems expectingnoproblems assert false assertfalse loader test annotation processor loadertestannotationprocessor is loaded isloaded test factory path jar file test none xistent entry testnonexistententry exception loader test annotation processor loadertestannotationprocessor clear loaded clearloaded i project iproject project env get project getproject get project name getprojectname full build fullbuild project get full path getfullpath expecting no problems expectingnoproblems assert false assertfalse loader test annotation processor loadertestannotationprocessor is loaded isloaded i java project ijavaproject jproj env get java project getjavaproject get project name getprojectname i factory path ifactorypath ifp apt config aptconfig get factory path getfactorypath jproj add bogus entry factory list rebuild assumed exist file bogus jar bogusjar file bogus jar bogusjar jar ifp add external jar addexternaljar bogus jar bogusjar verify problem marker apt config aptconfig set factory path setfactorypath jproj ifp full build fullbuild project get full path getfullpath i marker imarker markers getallaptmarkers project path projectpath assert equals assertequals markers length assert equals assertequals apt plugin aptplugin apt loader problem marker markers get type gettype string message markers get attribute getattribute i marker imarker message assert true asserttrue message bogus jar bogusjar jar remove bogus entry add ext jar extjar factory list external jar rebuild ifp remove external jar removeexternaljar bogus jar bogusjar ifp add external jar addexternaljar ext jar extjar apt config aptconfig set factory path setfactorypath jproj ifp rebuild verify processor loaded problems removed loader test annotation processor loadertestannotationprocessor clear loaded clearloaded full build fullbuild project get full path getfullpath expecting no problems expectingnoproblems assert true asserttrue loader test annotation processor loadertestannotationprocessor is loaded isloaded verify color annotation processor colorannotationprocessor assert true asserttrue color annotation processor colorannotationprocessor was successful wassuccessful restore original apt config aptconfig set factory path setfactorypath jproj ifp javadoc org eclipse jdt core tests builder tests tear down teardown override tear down teardown exception java core javacore remove classpath variable removeclasspathvariable tempjardir cpvar ext jar extjar ext var jar extvarjar project path projectpath tear down teardown