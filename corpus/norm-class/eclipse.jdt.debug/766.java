copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt debug tests source lookup sourcelookup org eclipse core internal resources resource exception resourceexception org eclipse core resources i file ifile org eclipse core runtime i path ipath org eclipse core runtime path org eclipse debug core i launch ilaunch org eclipse debug core i launch configuration ilaunchconfiguration org eclipse debug core model i source locator isourcelocator org eclipse debug core model i stack frame istackframe org eclipse debug core model i value ivalue org eclipse debug core source lookup sourcelookup i source container isourcecontainer org eclipse jdt core i java project ijavaproject org eclipse jdt debug core i java stack frame ijavastackframe org eclipse jdt debug core i java thread ijavathread org eclipse jdt debug test plugin testplugin java project helper javaprojecthelper org eclipse jdt debug tests abstract debug test abstractdebugtest org eclipse jdt internal core class file classfile org eclipse jdt internal launching java source lookup util javasourcelookuputil org eclipse jdt launching i runtime classpath entry iruntimeclasspathentry org eclipse jdt launching java runtime javaruntime org eclipse jdt launching source lookup sourcelookup containers package fragment root source container packagefragmentrootsourcecontainer tests finding showing source jar files projects jar source lookup tests jarsourcelookuptests abstract debug test abstractdebugtest string jar run jar runjar i java project ijavaproject fg jar project fgjarproject string ref pj name refpjname jar ref project jarrefproject string f jar project fjarproject jar project jarproject constructor jar source lookup tests jarsourcelookuptests jar source lookup tests jarsourcelookuptests disposes source containers test ensures containers holding open jar references lead link resource exception resourceexception delete setup tests param containers dispose containers disposecontainers i source container isourcecontainer containers containers containers length containers dispose javadoc org eclipse jdt debug tests abstract debug test abstractdebugtest get project context getprojectcontext override i java project ijavaproject get project context getprojectcontext fg jar project fgjarproject javadoc org eclipse jdt debug tests abstract debug test abstractdebugtest set up setup override set up setup exception i path ipath test rpath testrpath path test resources testresources create project clone createprojectclone f jar project fjarproject test rpath testrpath append f jar project fjarproject to string tostring fg jar project fgjarproject create java project clone createjavaprojectclone ref pj name refpjname test rpath testrpath append ref pj name refpjname to string tostring java project helper javaprojecthelper javadoc junit framework test case testcase tear down teardown override tear down teardown exception remove all breakpoints removeallbreakpoints tear down teardown ensures translation source containers yields correct containers https bugs eclipse org bugs bug cgi exception test translate containers testtranslatecontainers exception create launch configuration createlaunchconfiguration fg jar project fgjarproject launchconfigurations jar i launch configuration ilaunchconfiguration config get launch configuration getlaunchconfiguration fg jar project fgjarproject launchconfigurations jar i runtime classpath entry iruntimeclasspathentry entries java runtime javaruntime compute unresolved source lookup path computeunresolvedsourcelookuppath config i runtime classpath entry iruntimeclasspathentry resolved java runtime javaruntime resolve source lookup path resolvesourcelookuppath entries config i source container isourcecontainer containers java source lookup util javasourcelookuputil translate resolved assert true asserttrue computed containers containers length number containers unknown jre s jres project container jar assert true asserttrue containers returned containers length containers length sample jar equals containers get name getname containers package fragment root source container packagefragmentrootsourcecontainer package fragment root source container packagefragmentrootsourcecontainer container package fragment root source container packagefragmentrootsourcecontainer containers jar project jarproject lib sample jar equals container get package fragment root getpackagefragmentroot get path getpath to string tostring fail find source container package fragment root source container packagefragmentrootsourcecontainer jar project jarproject lib sample jar dispose containers disposecontainers containers tests file source lookup jar project https bugs eclipse org bugs bug cgi exception test inspect class file from jar testinspectclassfilefromjar exception create launch configuration createlaunchconfiguration fg jar project fgjarproject launchconfigurations jar create line breakpoint createlinebreakpoint jar i launch configuration ilaunchconfiguration config get launch configuration getlaunchconfiguration fg jar project fgjarproject launchconfigurations jar i java thread ijavathread thread thread launch to breakpoint launchtobreakpoint config i stack frame istackframe frame thread get top stack frame gettopstackframe assert true asserttrue frame i java stack frame ijavastackframe frame i java stack frame ijavastackframe step into stepinto i java stack frame ijavastackframe frame assert not null assertnotnull stack frame thread frame i value ivalue do eval doeval thread assert not null assertnotnull evaluation result assert equals assertequals type ins pected inspected jar class jarclass jar class jarclass get reference type name getreferencetypename terminate and remove terminateandremove thread tests file source lookup jar project https bugs eclipse org bugs bug cgi exception test show class file from jar testshowclassfilefromjar exception create launch configuration createlaunchconfiguration fg jar project fgjarproject launchconfigurations jar create line breakpoint createlinebreakpoint jar i launch configuration ilaunchconfiguration config get launch configuration getlaunchconfiguration fg jar project fgjarproject launchconfigurations jar i java thread ijavathread thread thread launch to breakpoint launchtobreakpoint config i stack frame istackframe frame thread get top stack frame gettopstackframe assert not null assertnotnull top stack frame frame assert true asserttrue frame i java stack frame ijavastackframe frame i java stack frame ijavastackframe object source lookup source lookupsource frame assert not null assertnotnull source main run jar runjar source assert true asserttrue source i file ifile source i file ifile assert equals assertequals file named run jar runjar java i file ifile source get name getname run jar runjar java step into stepinto i java stack frame ijavastackframe frame frame thread get top stack frame gettopstackframe assert not null assertnotnull top stack frame frame source lookup source lookupsource frame assert not null assertnotnull source jar jar class jarclass source assert true asserttrue source class file classfile source class file classfile assert equals assertequals file named jar class jarclass class file classfile source get element name getelementname jar class jarclass terminate and remove terminateandremove thread source frame backing link i source locator isourcelocator link i launch ilaunch param frame frame source source object code code object lookup source lookupsource i stack frame istackframe frame i source locator isourcelocator locator frame get launch getlaunch get source locator getsourcelocator assert not null assertnotnull java source locator locator locator get source element getsourceelement frame