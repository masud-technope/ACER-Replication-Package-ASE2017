copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal core exports java util map java util org eclipse core resources i project iproject org eclipse core runtime i path ipath java util org eclipse core resources org eclipse core runtime org eclipse debug core i launch ilaunch org eclipse debug core i launch configuration ilaunchconfiguration org eclipse debug core model launch configuration delegate launchconfigurationdelegate org eclipse jdt core org eclipse pde core build i build entry ibuildentry org eclipse pde core build i build model ibuildmodel org eclipse pde core plugin i plugin model base ipluginmodelbase org eclipse pde internal build i build properties constants ibuildpropertiesconstants org eclipse pde internal core pde core pdecore org eclipse pde internal core build workspace build model workspacebuildmodel org eclipse pde internal core build ers builders pde marker factory pdemarkerfactory org eclipse pde internal core ifeature i feature model ifeaturemodel org eclipse pde internal core ifeature i feature plugin ifeatureplugin org eclipse pde internal core project pde project pdeproject helper export operation classes making easier export workspace compiled files pde build compile access methods debug determine projects built operation checking errors feature export operation featureexportoperation plugin export operation pluginexportoperation workspace export helper workspaceexporthelper launch configuration delegate launchconfigurationdelegate i project iproject f workspace projects fworkspaceprojects override launch i launch configuration ilaunchconfiguration configuration string mode i launch ilaunch launch i progress monitor iprogressmonitor monitor core exception coreexception intended launched builds workspace projects exported required plug ins exported items incremental builder param exported items exporteditems plugins features exported param monitor progress monitor code code progress reporting desired core exception coreexception build before export buildbeforeexport object exported items exporteditems i progress monitor iprogressmonitor monitor core exception coreexception i project iproject projects get exported workspace projects getexportedworkspaceprojects exported items exporteditems projects length projects build incremental project builder incrementalprojectbuilder incremental build monitor checks workspace projects exported required plug ins exported items build errors project reported error marker severity error java model pde type param exported items exporteditems plugins features exported i projects iprojects errors core exception coreexception i project iproject check for errors checkforerrors object exported items exporteditems core exception coreexception i project iproject projects get exported workspace projects getexportedworkspaceprojects exported items exporteditems i project iproject projects with errors projectswitherrors hash set hashset i project iproject projects length projects length i marker imarker markers projects find markers findmarkers i marker imarker problem i resource iresource depth infinite markers length markers length integer severity integer markers get attribute getattribute i marker imarker severity severity severity int value intvalue i marker imarker severity error markers get type gettype equals i java model marker ijavamodelmarker java model problem marker markers get type gettype equals pde marker factory pdemarkerfactory marker projects with errors projectswitherrors add projects projects with errors projectswitherrors returns map associating libraries output locations workspace comp iles compiles build properties classpath map form string symbolic lib output map lib output map form string lib i path ipath output folders param exported items exporteditems plugins features exported map library output folders plugin workspace map string map string i path ipath get workspace output folders getworkspaceoutputfolders object exported items exporteditems core exception coreexception i project iproject projects get exported workspace projects getexportedworkspaceprojects exported items exporteditems map string map string i path ipath result hash map hashmap string map string i path ipath projects length projects length i file ifile build file buildfile pde project pdeproject get build properties getbuildproperties projects build file buildfile exists i build model ibuildmodel build model buildmodel workspace build model workspacebuildmodel build file buildfile build model buildmodel load i java project ijavaproject java project javaproject java core javacore create projects java project javaproject exists map string i path ipath model output modeloutput get plugin output folders getpluginoutputfolders build model buildmodel java project javaproject model output modeloutput is empty isempty i plugin model base ipluginmodelbase model pde core pdecore get default getdefault get model manager getmodelmanager find model findmodel projects model result model get bundle description getbundledescription get symbolic name getsymbolicname model output modeloutput result map string i path ipath get plugin output folders getpluginoutputfolders i build model ibuildmodel build model buildmodel i java project ijavaproject java project javaproject java model exception javamodelexception map string i path ipath output entries outputentries hash map hashmap string i path ipath i build entry ibuildentry build entries buildentries build model buildmodel get build getbuild get build entries getbuildentries build entries buildentries length string build entries buildentries get name getname starts with startswith i build properties constants ibuildpropertiesconstants property source prefix i path ipath output paths outputpaths hash set hashset i path ipath string source folders sourcefolders build entries buildentries get tokens gettokens source folders sourcefolders length i classpath entry iclasspathentry classpath entries classpathentries java project javaproject get raw classpath getrawclasspath classpath entries classpathentries length classpath entries classpathentries get entry kind getentrykind i classpath entry iclasspathentry cpe source entries include project segment i path ipath source path sourcepath classpath entries classpathentries get path getpath remove first segments removefirstsegments source path sourcepath equals path source folders sourcefolders i path ipath output path outputpath classpath entries classpathentries get output location getoutputlocation output path outputpath output path outputpath java project javaproject get output location getoutputlocation entries include project segment output paths outputpaths add output path outputpath remove first segments removefirstsegments output paths outputpaths is empty isempty output entries outputentries substring i build properties constants ibuildpropertiesconstants property source prefix length output paths outputpaths output entries outputentries i project iproject get exported workspace projects getexportedworkspaceprojects object exported items exporteditems core exception coreexception f workspace projects fworkspaceprojects todo won work nested features i project iproject projects hash set hashset i project iproject exported items exporteditems length exported items exporteditems i plugin model base ipluginmodelbase i path ipath install location installlocation path i plugin model base ipluginmodelbase exported items exporteditems get install location getinstalllocation i project iproject project pde core pdecore get workspace getworkspace get root getroot get project getproject install location installlocation last segment lastsegment project exists projects add project exported items exporteditems i feature model ifeaturemodel i feature model ifeaturemodel feature i feature model ifeaturemodel exported items exporteditems i feature plugin ifeatureplugin plugins feature get feature getfeature get plugins getplugins plugins length i plugin model base ipluginmodelbase plugin pde core pdecore get default getdefault get model manager getmodelmanager find model findmodel plugins get id getid plugin i path ipath install location installlocation path plugin get install location getinstalllocation i project iproject project pde core pdecore get workspace getworkspace get root getroot get project getproject install location installlocation last segment lastsegment project exists projects add project f workspace projects fworkspaceprojects compute referenced build order computereferencedbuildorder projects to array toarray i project iproject projects size f workspace projects fworkspaceprojects