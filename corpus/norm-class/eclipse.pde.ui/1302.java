copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal core project org eclipse jdt core i classpath entry iclasspathentry java util java util map entry org eclipse core resources org eclipse core runtime org eclipse core runtime preferences i eclipse preferences ieclipsepreferences org eclipse jdt core org eclipse jdt launching java runtime javaruntime org eclipse osgi service resolver version range versionrange org eclipse pde core build org eclipse pde core plugin org eclipse pde core project org eclipse pde internal core org eclipse pde internal core build workspace build model workspacebuildmodel org eclipse pde internal core bundle org eclipse pde internal core ibundle org eclipse pde internal core plugin workspace plugin model base workspacepluginmodelbase org eclipse pde internal core text bundle org eclipse pde internal core util core utility coreutility org osgi framework constants org osgi framework version org osgi service prefs backing store exception backingstoreexception operation create modify pde project based bundle project description project modify operation projectmodifyoperation workspace plugin model base workspacepluginmodelbase f model fmodel i path ipath exclude creates mod ifies modifies project based description param monitor progress monitor code code param description project description core exception coreexception project creation fails execute i progress monitor iprogressmonitor monitor i bundle project description ibundleprojectdescription description core exception coreexception retrieve current description project detect diff erences differences i project iproject project description get project getproject i bundle project service ibundleprojectservice service i bundle project service ibundleprojectservice pde core pdecore get default getdefault acquire service acquireservice i bundle project service ibundleprojectservice get name getname i bundle project description ibundleprojectdescription service get description getdescription project consider root considerroot project exists string task name taskname jp existed jpexisted project exists task name taskname messages project modify operation projectmodifyoperation jp existed jpexisted has nature hasnature java core javacore nature task name taskname messages project modify operation projectmodifyoperation bundle projects java plug natures description get nature ids getnatureids length description set nature ids setnatureids string i bundle project description ibundleprojectdescription plugin nature java core javacore nature become bundle becomebundle has nature hasnature i bundle project description ibundleprojectdescription plugin nature description has nature hasnature i bundle project description ibundleprojectdescription plugin nature values migrating java project bundle project jp existed jpexisted become bundle becomebundle description get execution environments getexecutionenvironments java project unspecified description bundle nature i java project ijavaproject java core javacore create project exists i classpath entry iclasspathentry classpath get raw classpath getrawclasspath classpath length i classpath entry iclasspathentry entry classpath entry get entry kind getentrykind i classpath entry iclasspathentry cpe container string java runtime javaruntime get execution environment id getexecutionenvironmentid entry get path getpath description set execution environments setexecutionenvironments string values bundle become bundle becomebundle values unspecified description get bundle version getbundleversion nls description set bundle version setbundleversion nls version qualifier sub monitor submonitor sub monitor submonitor convert monitor task name taskname create open project create project createproject description bundle root projects consider root considerroot i folder ifolder folder i path ipath root description get bundle root getbundleroot root root is empty isempty folder project get folder getfolder root core utility coreutility create folder createfolder folder pde project pdeproject set bundle root setbundleroot project folder worked configure natures configurenatures description worked project has nature hasnature java core javacore nature configure java project configurejavaproject description jp existed jpexisted worked configure manifest configuremanifest description worked configure build properties file configurebuildpropertiesfile description worked project settings equinox extension registry auto mated automated dependency policy manifest editor launch short cuts shortcuts export wizard i eclipse preferences ieclipsepreferences pref project scope projectscope project get node getnode pde core pdecore plugin pref guess auto mated automated dependency management equinox extensions required bundle description is equinox isequinox description is extension registry isextensionregistry required bundle pref remove i core constants icoreconstants resolve require bundle pref put boolean putboolean i core constants icoreconstants resolve require bundle description is extension registry isextensionregistry support extensions pref remove i core constants icoreconstants extensions property pref put boolean putboolean i core constants icoreconstants extensions property description is equinox isequinox equinox pref remove i core constants icoreconstants equinox property pref put boolean putboolean i core constants icoreconstants equinox property string shorts description get launch short cuts getlaunchshortcuts shorts shorts length defaults pref remove i core constants icoreconstants manifest launch short cuts shortcuts string buffer stringbuffer string buffer stringbuffer shorts length append append shorts pref i core constants icoreconstants manifest launch short cuts shortcuts to string tostring description get export wizard id getexportwizardid pref remove i core constants icoreconstants manifest export wizard pref i core constants icoreconstants manifest export wizard description get export wizard id getexportwizardid pref flush backing store exception backingstoreexception core exception coreexception status i status istatus error pde core pdecore plugin messages project modify operation projectmodifyoperation f model fmodel is dirty isdirty f model fmodel save worked monitor monitor returns model created operation model workspace plugin model base workspacepluginmodelbase get model getmodel f model fmodel config ures configures build path output location java project java project existed operation build path entries bundle path required don change exiting build path param description desired project description param operation param existed java project existed operation configure java project configurejavaproject i bundle project description ibundleprojectdescription description i bundle project description ibundleprojectdescription existed core exception coreexception i project iproject project description get project getproject i java project ijavaproject java project javaproject java core javacore create project create source folders required i bundle classpath entry ibundleclasspathentry bces description get bundle classpath getbundleclasspath bces bces length bces length i path ipath folder bces get source path getsourcepath folder core utility coreutility create folder createfolder project get folder getfolder folder output folder description get default output folder getdefaultoutputfolder i path ipath path project get full path getfullpath append description get default output folder getdefaultoutputfolder java project javaproject set output location setoutputlocation path merge path project existed i bundle classpath entry ibundleclasspathentry prev get bundle classpath getbundleclasspath is equal isequal bces prev existed add entries i classpath entry iclasspathentry entries get source folder entries getsourcefolderentries java project javaproject description i classpath entry iclasspathentry raw classpath rawclasspath java project javaproject get raw classpath getrawclasspath list i classpath entry iclasspathentry add array list arraylist i classpath entry iclasspathentry entries length i classpath entry iclasspathentry entry entries raw classpath rawclasspath length i classpath entry iclasspathentry existing entry existingentry raw classpath rawclasspath existing entry existingentry get entry kind getentrykind entry get entry kind getentrykind existing entry existingentry get path getpath equals entry get path getpath add add entry check required plug ins container add required addrequired description has nature hasnature i bundle project description ibundleprojectdescription plugin nature add required addrequired raw classpath rawclasspath length i classpath entry iclasspathentry cpe raw classpath rawclasspath cpe get entry kind getentrykind i classpath entry iclasspathentry cpe container pde core pdecore required plugins container path equals cpe get path getpath add required addrequired add required addrequired add add classpath computer classpathcomputer create container entry createcontainerentry add is empty isempty list i classpath entry iclasspathentry array list arraylist i classpath entry iclasspathentry raw classpath rawclasspath length add raw classpath rawclasspath add all addall add java project javaproject set raw classpath setrawclasspath to array toarray i classpath entry iclasspathentry size i classpath entry iclasspathentry entries get class path entries getclasspathentries java project javaproject description java project javaproject set raw classpath setrawclasspath entries returns arrays equal param array object array code code param array object array code code arrays equal is equal isequal object array object array array array length array array length array array length array length array length array length array equals array returns objects equal code code param param equal code code is equal isequal object object equals returns path entries create project param project java project param description project description path entries core exception coreexception path creation fails i classpath entry iclasspathentry get class path entries getclasspathentries i java project ijavaproject project i bundle project description ibundleprojectdescription description core exception coreexception i classpath entry iclasspathentry internal class path entries internalclasspathentries get source folder entries getsourcefolderentries project description i classpath entry iclasspathentry entries i classpath entry iclasspathentry internal class path entries internalclasspathentries length system arraycopy internal class path entries internalclasspathentries entries internal class path entries internalclasspathentries length string ids description get execution environments getexecutionenvironments string execution environment executionenvironment ids ids length execution environment executionenvironment ids classpath computer classpathcomputer set compliance options setcomplianceoptions project execution environment executionenvironment entries classpath computer classpathcomputer createjreentry execution environment executionenvironment entries classpath computer classpathcomputer create container entry createcontainerentry entries returns source folder path entries param project java project param description project description source folder path entries empty exception core exception coreexception source folder path entry creation fails i classpath entry iclasspathentry get source folder entries getsourcefolderentries i java project ijavaproject project i bundle project description ibundleprojectdescription description core exception coreexception i bundle classpath entry ibundleclasspathentry folders description get bundle classpath getbundleclasspath folders folders length i classpath entry iclasspathentry list i classpath entry iclasspathentry entries array list arraylist i classpath entry iclasspathentry folders length i bundle classpath entry ibundleclasspathentry folder folders folder get source path getsourcepath source file folder library i path ipath bin folder get binary path getbinarypath bin nested library bin folder get library getlibrary bin i path ipath output project get project getproject get full path getfullpath append bin entries add java core javacore new library entry newlibraryentry output source folder i path ipath path project get project getproject get full path getfullpath append folder get source path getsourcepath i path ipath output folder get binary path getbinarypath output output project get project getproject get full path getfullpath append output entries add java core javacore new source entry newsourceentry path exclude output entries to array toarray i classpath entry iclasspathentry entries size create open project param description project description exception core exception coreexception failure create project createproject i bundle project description ibundleprojectdescription description core exception coreexception i project iproject project description get project getproject project exists i project description iprojectdescription project get workspace getworkspace new project description newprojectdescription project get name getname setlocationuri description getlocationuri project create project is open isopen project open config ures configures project natures param description description project modify exception core exception coreexception wrong configure natures configurenatures i bundle project description ibundleprojectdescription description core exception coreexception i project iproject project description get project getproject i project description iprojectdescription project description projectdescription project get description getdescription string curr project description projectdescription get nature ids getnatureids string hash set hashset string curr length add curr string nature ids natureids description get nature ids getnatureids string hash set hashset string nature ids natureids length add nature ids natureids equals project description projectdescription set nature ids setnatureids nature ids natureids project set description setdescription project description projectdescription config ures configures manifest description param description project description param description operation began core exception coreexception configure manifest configuremanifest i bundle project description ibundleprojectdescription description i bundle project description ibundleprojectdescription core exception coreexception i project iproject project description get project getproject i file ifile manifest pde project pdeproject get manifest getmanifest project description get host gethost f model fmodel workspace bundle plugin model workspacebundlepluginmodel manifest pde project pdeproject get plugin xml getpluginxml project f model fmodel workspace bundle fragment model workspacebundlefragmentmodel manifest pde project pdeproject get fragment xml getfragmentxml project i plugin base ipluginbase plugin base pluginbase f model fmodel get plugin base getpluginbase target version string target version targetversion get target version gettargetversion description get target version gettargetversion is equal isequal target version targetversion get target version gettargetversion get target version gettargetversion string schema version schemaversion target platform helper targetplatformhelper get schema version for target version getschemaversionfortargetversion target version targetversion plugin base pluginbase set schema version setschemaversion schema version schemaversion symbolic is equal isequal description get symbolic name getsymbolicname get symbolic name getsymbolicname plugin base pluginbase set id setid description get symbolic name getsymbolicname bundle version is equal isequal description get bundle version getbundleversion get bundle version getbundleversion plugin base pluginbase set version setversion description get bundle version getbundleversion to string tostring bundle string bundle name bundlename description get bundle name getbundlename bundle name bundlename projects bundle bundle name bundlename description get symbolic name getsymbolicname is equal isequal bundle name bundlename get bundle name getbundlename plugin base pluginbase set name setname bundle name bundlename bundle vendor is equal isequal description get bundle vendor getbundlevendor get bundle vendor getbundlevendor plugin base pluginbase set provider name setprovidername description get bundle vendor getbundlevendor manifest version f model fmodel i bundle plugin model base ibundlepluginmodelbase i bundle plugin model base ibundlepluginmodelbase bmodel i bundle plugin model base ibundlepluginmodelbase f model fmodel target version persisted model dirty project wizard determine templates i bundle plugin base ibundlepluginbase bmodel get plugin base getpluginbase set target version settargetversion target version targetversion string ver bmodel get bundle model getbundlemodel get bundle getbundle get header getheader constants bundle manifest version manifestversion nls is equal isequal ver nls bmodel get bundle model getbundlemodel get bundle getbundle set header setheader nls constants bundle manifest version manifestversion nls plugin base pluginbase i fragment ifragment host specification i fragment ifragment fragment i fragment ifragment plugin base pluginbase i host description ihostdescription host description get host gethost is equal isequal host get host gethost fragment set plugin id setpluginid host get name getname host get version range getversionrange fragment set plugin version setpluginversion host get version range getversionrange to string tostring explicitly appears fragment set plugin version setpluginversion bundle activator string activator description get activator getactivator is equal isequal activator get activator getactivator i plugin iplugin plugin base pluginbase set class name setclassname activator bundle classpath configure bundle classpath configurebundleclasspath description required bundles i required bundle description irequiredbundledescription dependencies description get required bundles getrequiredbundles is equal isequal dependencies get required bundles getrequiredbundles remove existing imports add i plugin import ipluginimport imports plugin base pluginbase get imports getimports imports imports length imports length plugin base pluginbase remove imports dependencies dependencies length i required bundle description irequiredbundledescription req dependencies version range versionrange range req get version range getversionrange i plugin import ipluginimport iimport f model fmodel get plugin factory getpluginfactory create import createimport iimport set id setid req get name getname range iimport set version setversion range to string tostring iimport set match setmatch i match rules imatchrules compatible iimport set reexported setreexported req is exported isexported iimport set optional setoptional req is optional isoptional plugin base pluginbase add iimport add bundle specific fields applicable plugin base pluginbase bundle plugin base bundlepluginbase i bundle ibundle bundle bundle plugin base bundlepluginbase plugin base pluginbase get bundle getbundle bundle model factory bundlemodelfactory factory bundle model factory bundlemodelfactory bundle get model getmodel remove host specification longer fragment get host gethost description get host gethost bundle set header setheader constants fragment host singleton description is singleton issingleton is singleton issingleton description is singleton issingleton i manifest header imanifestheader header factory create header createheader constants bundle symbolicname description get symbolic name getsymbolicname header bundle symbolic name header bundlesymbolicnameheader bundle symbolic name header bundlesymbolicnameheader header set singleton setsingleton description is singleton issingleton bundle set header setheader constants bundle symbolicname header get value getvalue required ee s ees string ees description get execution environments getexecutionenvironments is equal isequal ees get execution environments getexecutionenvironments ees bundle set header setheader remove constants bundle requiredexecutionenvironment string buffer stringbuffer buffer string buffer stringbuffer ees length string ees buffer length comma space nls buffer append buffer append bundle set header setheader constants bundle requiredexecutionenvironment buffer to string tostring imports i package import description ipackageimportdescription packages description get package imports getpackageimports is equal isequal packages get package imports getpackageimports packages bundle set header setheader remove constants import package header importpackageheader header import package header importpackageheader nls factory create header createheader nls constants nls packages length i package import description ipackageimportdescription pkg packages import package object importpackageobject header add package addpackage pkg get name getname version range versionrange range pkg get version range getversionrange range set version setversion range to string tostring set optional setoptional pkg is optional isoptional header update bundle set header setheader constants header get value getvalue exports i package export description ipackageexportdescription exports description get package exports getpackageexports is equal isequal exports get package exports getpackageexports exports bundle set header setheader remove constants export export package header exportpackageheader header export package header exportpackageheader nls factory create header createheader nls constants export nls exports length i package export description ipackageexportdescription pkg exports export package object exportpackageobject epo header add package addpackage pkg get name getname version version pkg get version getversion version epo set version setversion version to string tostring string friends pkg get friends getfriends friends friends length epo add friend addfriend package friend packagefriend epo friends epo set internal setinternal pkg is api isapi header update bundle set header setheader constants export header get value getvalue activation policy remove activation removeactivation is equal isequal description get activation policy getactivationpolicy get activation policy getactivationpolicy constants activation lazy equals description get activation policy getactivationpolicy description is equinox isequinox target version targetversion equals i bundle project description ibundleprojectdescription version bundle set header setheader nls i core constants icoreconstants eclipse autostart version parse double parsedouble target version targetversion version osg i osgi header bundle set header setheader constants bundle activationpolicy constants activation lazy bundle set header setheader nls i core constants icoreconstants eclipse lazystart osg i osgi header bundle set header setheader constants bundle activationpolicy constants activation lazy remove activation policy headers remove activation removeactivation description get host gethost get host gethost remove activation policy fragment remove activation removeactivation remove activation removeactivation bundle set header setheader i core constants icoreconstants eclipse autostart bundle set header setheader constants bundle activationpolicy bundle set header setheader i core constants icoreconstants eclipse lazystart localization i path ipath localization description get localization getlocalization is equal isequal localization get localization getlocalization localization bundle set header setheader constants bundle localization bundle set header setheader constants bundle localization localization to string tostring bundle model dirty ensure prop agates propagates root model i bundle model ibundlemodel bundle model bundlemodel bundle get model getmodel bundle model bundlemodel workspace bundle model workspacebundlemodel workspace bundle model workspacebundlemodel wbm workspace bundle model workspacebundlemodel bundle model bundlemodel wbm is dirty isdirty f model fmodel set dirty setdirty apply headers bundle project description bundleprojectdescription bpd bundle project description bundleprojectdescription description map extra headers extraheaders bpd get extra headers getextraheaders iterator iterator extra headers extraheaders entry set entryset iterator iterator has next hasnext entry entry entry iterator string string entry get key getkey string string entry get value getvalue translate empty header single space ensure inclusion empty headers trim length nls is equal isequal bundle get header getheader bundle set header setheader returns target version latest version code code param target version targetversion version code code target version string get target version gettargetversion string target version targetversion target version targetversion i core constants icoreconstants target version latest target version targetversion returns names libraries bundle classpath header code code param description project description library names order code code string get library names getlibrarynames i bundle project description ibundleprojectdescription description collect unique entries i bundle classpath entry ibundleclasspathentry libs description get bundle classpath getbundleclasspath libs libs length string names linked hash set linkedhashset string libs length i path ipath lib libs get library getlibrary nls string nls lib name libname lib lib name libname lib to string tostring names add lib name libname names to array toarray string names size sets bundle path entries manifest entry bundle classpath header param description project description param original project core exception coreexception configure bundle classpath configurebundleclasspath i bundle project description ibundleprojectdescription description i bundle project description ibundleprojectdescription core exception coreexception i bundle classpath entry ibundleclasspathentry description get bundle classpath getbundleclasspath is equal isequal get bundle classpath getbundleclasspath remove libraries start i plugin base ipluginbase plugin base pluginbase f model fmodel get plugin base getpluginbase i plugin library ipluginlibrary libraries plugin base pluginbase get libraries getlibraries libraries libraries length libraries length plugin base pluginbase remove libraries string names get library names getlibrarynames description names nls names length equals names library names length i plugin library ipluginlibrary library f model fmodel get plugin factory getpluginfactory create library createlibrary library set name setname names library set exported setexported plugin base pluginbase add library configure build properties file configurebuildpropertiesfile i bundle project description ibundleprojectdescription description i bundle project description ibundleprojectdescription core exception coreexception i project iproject project description get project getproject i file ifile file pde project pdeproject get build properties getbuildproperties project workspace build model workspacebuildmodel model workspace build model workspacebuildmodel file i build model factory ibuildmodelfactory factory model get factory getfactory bin includes i build entry ibuildentry bin entry binentry model get build getbuild get entry getentry i build entry ibuildentry bin includes bin entry binentry bin entry binentry factory create entry createentry i build entry ibuildentry bin includes model get build getbuild add bin entry binentry modified fill bin includes fillbinincludes project bin entry binentry description modified create source output build entries createsourceoutputbuildentries model factory description modified modified model save config ures configures bin includes entry based included libraries explicit entries add param project param bin entry binentry param description param entry modified core exception coreexception fill bin includes fillbinincludes i project iproject project i build entry ibuildentry bin entry binentry i bundle project description ibundleprojectdescription description i bundle project description ibundleprojectdescription core exception coreexception modified nls bin entry binentry meta inf modified nls bin entry binentry add token addtoken meta inf add bundle path entries string names get library names getlibrarynames description string prev names prevnames get library names getlibrarynames is equal isequal names prev names prevnames remove libraries prev names prevnames prev names prevnames length bin entry binentry prev names prevnames modified bin entry binentry remove token removetoken prev names prevnames add libraries names names length bin entry binentry names modified folders trailing slash bug string names i path ipath path path names string extension path get file extension getfileextension extension nls ends with endswith nls bin entry binentry add token addtoken extra files build properties i path ipath paths description get bin includes getbinincludes i path ipath prev paths prevpaths get bin includes getbinincludes is equal isequal paths prev paths prevpaths remove paths prev paths prevpaths prev paths prevpaths length string token prev paths prevpaths to string tostring bin entry binentry token bin entry binentry remove token removetoken token modified add paths paths paths length string paths to string tostring bin entry binentry bin entry binentry add token addtoken modified modified create source output build entries createsourceoutputbuildentries workspace build model workspacebuildmodel model i build model factory ibuildmodelfactory factory i bundle project description ibundleprojectdescription description i bundle project description ibundleprojectdescription core exception coreexception modified i bundle classpath entry ibundleclasspathentry folders description get bundle classpath getbundleclasspath i bundle classpath entry ibundleclasspathentry prev get bundle classpath getbundleclasspath is equal isequal folders prev modified remove string old names oldnames get library names getlibrarynames i build ibuild build model get build getbuild old names oldnames old names oldnames length remove build entry removebuildentry build i build entry ibuildentry jar prefix old names oldnames remove build entry removebuildentry build i build entry ibuildentry output prefix old names oldnames configure folders folders length folders length string library name libraryname i path ipath lib path libpath folders get library getlibrary lib path libpath nls library name libraryname library name libraryname folders get library getlibrary to string tostring source library i path ipath src folder srcfolder folders get source path getsourcepath src folder srcfolder i build entry ibuildentry entry get build entry getbuildentry build factory i build entry ibuildentry jar prefix library name libraryname src folder srcfolder is empty isempty entry add token addtoken src folder srcfolder add trailing separator addtrailingseparator to string tostring nls entry add token addtoken output library i path ipath out folder outfolder folders get binary path getbinarypath src folder srcfolder out folder outfolder output folder i java project ijavaproject project java core javacore create description get project getproject out folder outfolder project get output location getoutputlocation remove first segments removefirstsegments out folder outfolder i build entry ibuildentry entry get build entry getbuildentry build factory i build entry ibuildentry output prefix library name libraryname string token out folder outfolder is empty isempty token out folder outfolder add trailing separator addtrailingseparator to string tostring nls token entry token entry add token addtoken token modified build entry creating adding param build build param factory factory create entries param key entry create build entry exception core exception coreexception unable add build entry i build entry ibuildentry get build entry getbuildentry i build ibuild build i build model factory ibuildmodelfactory factory string key core exception coreexception i build entry ibuildentry entry build get entry getentry key entry entry factory create entry createentry key build add entry entry remove build entry model param build param key core exception coreexception remove build entry removebuildentry i build ibuild build string key core exception coreexception i build entry ibuildentry entry build get entry getentry key entry build remove entry