copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal launching launcher java java net url java util org eclipse core resources i project iproject org eclipse core resources i resource iresource org eclipse core runtime org eclipse core variables i string variable manager istringvariablemanager org eclipse core variables variables plugin variablesplugin org eclipse debug core i launch configuration ilaunchconfiguration org eclipse debug core i launch configuration working copy ilaunchconfigurationworkingcopy org eclipse jdt core org eclipse jdt launching execution arguments executionarguments org eclipse jdt launching i java launch configuration constants ijavalaunchconfigurationconstants org eclipse pde core plugin org eclipse pde core target i target platform service itargetplatformservice org eclipse pde internal build ipde build constants ipdebuildconstants org eclipse pde internal core org eclipse pde internal launching i launching preference constants ilaunchingpreferenceconstants org eclipse pde internal launching pde launching plugin pdelaunchingplugin org eclipse pde launching ipde launcher constants ipdelauncherconstants org osgi framework bundle launch arguments helper launchargumentshelper returns location workspace launching empty string user code data code argument workspace replace variables method called variable substitution prompt user param configuration launch configuration workspace workspace location path string empty workspace core exception coreexception problem configuration string get workspace location getworkspacelocation i launch configuration ilaunchconfiguration configuration core exception coreexception check data string user args userargs get user program argument array getuserprogramargumentarray configuration user args userargs length nls nls user args userargs equals data user args userargs length user args userargs equals nls string location configuration get attribute getattribute ipde launcher constants ipdelauncherconstants location string location compatibility nls location configuration get attribute getattribute ipde launcher constants ipdelauncherconstants location string location i launch configuration working copy ilaunchconfigurationworkingcopy configuration is working copy isworkingcopy i launch configuration working copy ilaunchconfigurationworkingcopy configuration configuration get working copy getworkingcopy nls set attribute setattribute nls ipde launcher constants ipdelauncherconstants location nls string set attribute setattribute ipde launcher constants ipdelauncherconstants location location do save dosave get sub stituted string getsubstitutedstring location string get user program argument array getuserprogramargumentarray i launch configuration ilaunchconfiguration configuration core exception coreexception string args get user program arguments getuserprogramarguments configuration nls execution arguments executionarguments args get program arguments array getprogramargumentsarray string get user program arguments getuserprogramarguments i launch configuration ilaunchconfiguration configuration core exception coreexception string args configuration get attribute getattribute i java launch configuration constants ijavalaunchconfigurationconstants attr program arguments string args compatibility nls args configuration get attribute getattribute pro gargs progargs string args i launch configuration working copy ilaunchconfigurationworkingcopy configuration is working copy isworkingcopy i launch configuration working copy ilaunchconfigurationworkingcopy configuration configuration get working copy getworkingcopy nls set attribute setattribute nls pro gargs progargs nls string set attribute setattribute i java launch configuration constants ijavalaunchconfigurationconstants attr program arguments args do save dosave nls args get sub stituted string getsubstitutedstring args string getuservmarguments i launch configuration ilaunchconfiguration configuration core exception coreexception string args configuration get attribute getattribute i java launch configuration constants ijavalaunchconfigurationconstants attr arguments string args compatibility nls args configuration get attribute getattribute vmargs string args i launch configuration working copy ilaunchconfigurationworkingcopy configuration is working copy isworkingcopy i launch configuration working copy ilaunchconfigurationworkingcopy configuration configuration get working copy getworkingcopy nls set attribute setattribute nls vmargs nls string set attribute setattribute i java launch configuration constants ijavalaunchconfigurationconstants attr arguments args do save dosave nls args get sub stituted string getsubstitutedstring args fetches arguments current target platform arguments current target platform empty string string getinitialvmarguments i target platform service itargetplatformservice service i target platform service itargetplatformservice pde core pdecore get default getdefault acquire service acquireservice i target platform service itargetplatformservice get name getname service string result service get workspace target definition getworkspacetargetdefinition getvmarguments result nls result nls result nls result core exception coreexception pde core pdecore log nls string get initial program arguments getinitialprogramarguments nls string buffer stringbuffer buffer string buffer stringbuffer target target arch target arch target console log consolelog i target platform service itargetplatformservice service i target platform service itargetplatformservice pde core pdecore get default getdefault acquire service acquireservice i target platform service itargetplatformservice get name getname service string result service get workspace target definition getworkspacetargetdefinition get program arguments getprogramarguments result buffer append append result core exception coreexception pde core pdecore log buffer to string tostring file get working directory getworkingdirectory i launch configuration ilaunchconfiguration configuration core exception coreexception string working nls working configuration get attribute getattribute i java launch configuration constants ijavalaunchconfigurationconstants attr working directory file get canonical path getcanonicalpath io exception ioexception working workspace loc file dir file get sub stituted string getsubstitutedstring working dir exists dir mkdirs dir map string object get specific attributes map getvmspecificattributesmap i launch configuration ilaunchconfiguration config core exception coreexception map string object map hash map hashmap string object string java command javacommand config get attribute getattribute i java launch configuration constants ijavalaunchconfigurationconstants attr java command string map i java launch configuration constants ijavalaunchconfigurationconstants attr java command java command javacommand nls target platform targetplatform getos equals macosx nls model entry modelentry entry plugin registry pluginregistry find entry findentry org eclipse jdt debug entry i plugin model base ipluginmodelbase models entry get external models getexternalmodels models length file file file models get install location getinstalllocation file is file isfile file nls file nls file nls jdi jar file exists map i java launch configuration constants ijavalaunchconfigurationconstants attr bootpath prepend string file get absolute path getabsolutepath map string get tracing file argument gettracingfileargument i launch configuration ilaunchconfiguration config string options file name optionsfilename tracing options manager tracingoptionsmanager mng pde core pdecore get default getdefault get tracing options manager gettracingoptionsmanager map string string options config get attribute getattribute ipde launcher constants ipdelauncherconstants tracing options map string string string selected config get attribute getattribute ipde launcher constants ipdelauncherconstants tracing checked string selected mng save options file name optionsfilename options selected equals ipde launcher constants ipdelauncherconstants tracing hash set hashset string result hash set hashset string string tokenizer stringtokenizer tokenizer nls string tokenizer stringtokenizer nls selected nls tokenizer has more tokens hasmoretokens result add tokenizer next token nexttoken mng save options file name optionsfilename options result core exception coreexception options file name optionsfilename string construct classpath constructclasspath i launch configuration ilaunchconfiguration configuration core exception coreexception target version targetversion target platform helper targetplatformhelper get target version gettargetversion string jar path jarpath target version targetversion get equinox startup path getequinoxstartuppath ipde build constants ipdebuildconstants bundle equinox launcher get startup jar path getstartupjarpath jar path jarpath target version targetversion nls jar path jarpath get equinox startup path getequinoxstartuppath org eclipse core launcher jar path jarpath array list arraylist string entries array list arraylist string entries add jar path jarpath nls string bootstrap configuration get attribute getattribute ipde launcher constants ipdelauncherconstants bootstrap entries nls string tokenizer stringtokenizer tok string tokenizer stringtokenizer get sub stituted string getsubstitutedstring bootstrap tok has more tokens hasmoretokens entries add tok next token nexttoken trim entries to array toarray string entries size returns path equinox launcher jar launcher workspace package name packagename determine expected output location param package name packagename launcher typically link ipde build constants ipdebuildconstants bundle equinox launcher path equinox launcher jar code code core exception coreexception string get equinox startup path getequinoxstartuppath string package name packagename core exception coreexception pde launcher workspace target i plugin model base ipluginmodelbase model plugin registry pluginregistry find model findmodel ipde build constants ipdebuildconstants bundle equinox launcher model i resource iresource resource model get underlying resource getunderlyingresource resource target string install location installlocation model get install location getinstalllocation install location installlocation file bundle file bundlefile file install location installlocation bundle file bundlefile is directory isdirectory launcher bundle jar red jarred bundle root install location installlocation unjarred bundle search built jar root folder file files bundle file bundlefile list files listfiles file name filter filenamefilter override accept file dir string index of indexof ipde build constants ipdebuildconstants bundle equinox launcher files length files is file isfile files get path getpath source bundle git git eclipse org git root gitroot equinox equinox framework git file bin folder binfolder nls file nls bundle file bundlefile nls bin bin folder binfolder is directory isdirectory bin folder binfolder get path getpath workspace i project iproject project resource get project getproject project has nature hasnature java core javacore nature i java project ijavaproject j project jproject java core javacore create project i classpath entry iclasspathentry entries j project jproject get raw classpath getrawclasspath entries length kind entries get entry kind getentrykind kind i classpath entry iclasspathentry cpe source kind i classpath entry iclasspathentry cpe library i package fragment root ipackagefragmentroot roots j project jproject find package fragment roots findpackagefragmentroots entries roots length roots get package fragment getpackagefragment package name packagename exists source folder find output folder kind i classpath entry iclasspathentry cpe source i path ipath path entries get output location getoutputlocation path path j project jproject get output location getoutputlocation path path remove first segments removefirstsegments project get location getlocation append path toosstring library jar location jar i resource iresource jar roots get resource getresource jar jar get location getlocation toosstring pde model launcher bundle installed bundle bundle platform get bundle getbundle ipde build constants ipdebuildconstants bundle equinox launcher bundle url url nls file locator filelocator resolve nls bundle get entry getentry url file locator filelocator tofileurl url string path url get file getfile nls path starts with startswith nls file path path substring path file path get absolute path getabsolutepath nls path ends with endswith nls path path substring path length path io exception ioexception string get startup jar path getstartupjarpath core exception coreexception nls i plugin model base ipluginmodelbase model plugin registry pluginregistry find model findmodel org eclipse platform model model get underlying resource getunderlyingresource i project iproject project model get underlying resource getunderlyingresource get project getproject project has nature hasnature java core javacore nature i java project ijavaproject j project jproject java core javacore create project i package fragment root ipackagefragmentroot roots j project jproject get package fragment roots getpackagefragmentroots roots length roots get kind getkind i package fragment root ipackagefragmentroot source nls roots get package fragment getpackagefragment org eclipse core launcher exists i path ipath path j project jproject get output location getoutputlocation remove first segments removefirstsegments project get location getlocation append path toosstring nls project get file getfile startup jar exists nls project get file getfile startup jar get location getlocation toosstring nls file startup jar startupjar path target platform targetplatform get location getlocation append startup jar to file tofile running eclipse startup jar startupjar exists nls startup jar startupjar path target platform targetplatform get default location getdefaultlocation append startup jar to file tofile startup jar startupjar exists startup jar startupjar get absolute path getabsolutepath string get sub stituted string getsubstitutedstring string text core exception coreexception text nls i string variable manager istringvariablemanager mgr variables plugin variablesplugin get default getdefault get string variable manager getstringvariablemanager mgr perform string substitution performstringsubstitution text string get default workspace location getdefaultworkspacelocation string unique name uniquename get default workspace location getdefaultworkspacelocation unique name uniquename string get default workspace location getdefaultworkspacelocation string unique name uniquename isjunit pde preferences manager pdepreferencesmanager launching store launchingstore pde launching plugin pdelaunchingplugin get default getdefault get preference manager getpreferencemanager string location launching store launchingstore get string getstring isjunit i launching preference constants ilaunchingpreferenceconstants prop junit workspace location i launching preference constants ilaunchingpreferenceconstants prop runtime workspace location launching store launchingstore get boolean getboolean isjunit i launching preference constants ilaunchingpreferenceconstants prop junit workspace location container i launching preference constants ilaunchingpreferenceconstants prop runtime workspace location container nls nls location unique name uniquename replace all replaceall location get default unit workspace is container getdefaultjunitworkspaceiscontainer pde preferences manager pdepreferencesmanager launching store launchingstore pde launching plugin pdelaunchingplugin get default getdefault get preference manager getpreferencemanager launching store launchingstore get boolean getboolean i launching preference constants ilaunchingpreferenceconstants prop junit workspace location container string get default unit configuration location getdefaultjunitconfigurationlocation nls workspace loc metadata plugins org eclipse pde core pde junit