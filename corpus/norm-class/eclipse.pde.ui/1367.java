copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal core project java i o exception ioexception java net uri java util org eclipse core resources org eclipse core runtime org eclipse core runtime preferences i eclipse preferences ieclipsepreferences org eclipse jdt core org eclipse osgi service resolver version range versionrange org eclipse osgi util manifest element manifestelement org eclipse pde core build i build ibuild org eclipse pde core build i build entry ibuildentry org eclipse pde core plugin org eclipse pde core project org eclipse pde internal core org eclipse pde internal core build workspace build model workspacebuildmodel org osgi framework bundle project description meta data required define bundle plug project clients instantiate bundle project description bundleprojectdescription i bundle project description ibundleprojectdescription i project iproject f project fproject i path ipath f root froot string f symbolic name fsymbolicname string f bundle name fbundlename string f bundle vendor fbundlevendor i host description ihostdescription f host fhost uri f uri furi version f version fversion f singleton fsingleton i path ipath f localization flocalization i path ipath f default ouput folder fdefaultouputfolder string fees string f natures fnatures i bundle classpath entry ibundleclasspathentry f bundle classpath fbundleclasspath string f activator factivator string f target version ftargetversion f is equinox fisequinox f is extension registry fisextensionregistry string f activation policy factivationpolicy i required bundle description irequiredbundledescription f required bundles frequiredbundles i package import description ipackageimportdescription f imports fimports i package export description ipackageexportdescription f exports fexports i path ipath f bin includes fbinincludes i bundle project service ibundleprojectservice f service fservice string f launch short cuts flaunchshortcuts string f export wizard fexportwizard map string string f headers fheaders hash map hashmap string string map f read headers freadheaders constructs bundle description project param project project exist core exception coreexception bundle project description bundleprojectdescription i project iproject project core exception coreexception f project fproject project project exists project is open isopen initialize project returns bundle project service bundle project service i bundle project service ibundleprojectservice get bundle project service getbundleprojectservice f service fservice f service fservice i bundle project service ibundleprojectservice pde core pdecore get default getdefault acquire service acquireservice i bundle project service ibundleprojectservice get name getname f service fservice returns build model project code code param project project build model code code i build ibuild get build model getbuildmodel i project iproject project i file ifile build file buildfile pde project pdeproject get build properties getbuildproperties project build file buildfile exists workspace build model workspacebuildmodel build model buildmodel workspace build model workspacebuildmodel build file buildfile build model buildmodel load build model buildmodel get build getbuild returns header map manifest element manifestelement code code param headers map manifest element manifestelement param key header header code code string get header value getheadervalue map headers string key core exception coreexception manifest element manifestelement elements parse header parseheader headers key elements elements length elements get value getvalue parses header param headers param key elements code code core exception coreexception manifest element manifestelement parse header parseheader map headers string key core exception coreexception string string headers key trim length manifest element manifestelement parse header parseheader key bundle exception bundleexception core exception coreexception status i status istatus error pde core pdecore plugin get message getmessage empty header manifest element manifestelement initialize settings project param project project exception core exception coreexception unable initialize initialize i project iproject project core exception coreexception i container icontainer root pde project pdeproject get bundle root getbundleroot project root project set bundle root setbundleroot root get project relative path getprojectrelativepath i eclipse preferences ieclipsepreferences node project scope projectscope project get node getnode pde core pdecore plugin node set extension registry setextensionregistry node get boolean getboolean i core constants icoreconstants extensions property set equinox setequinox node get boolean getboolean i core constants icoreconstants equinox property export wizard launch short cuts shortcuts set export wizard id setexportwizardid pde project pdeproject get export wizard getexportwizard project set launch short cuts setlaunchshortcuts pde project pdeproject get launch short cuts getlaunchshortcuts project location natures setlocationuri project get description getdescription getlocationuri set nature ids setnatureids project get description getdescription get nature ids getnatureids i file ifile manifest pde project pdeproject get manifest getmanifest project manifest exists map headers headers manifest element manifestelement parse bundle manifest parsebundlemanifest manifest get contents getcontents f read headers freadheaders headers i o exception ioexception core exception coreexception status i status istatus error pde core pdecore plugin get message getmessage bundle exception bundleexception core exception coreexception status i status istatus error pde core pdecore plugin get message getmessage set activator setactivator get header value getheadervalue headers constants bundle activator set bundle name setbundlename get header value getheadervalue headers constants bundle set bundle vendor setbundlevendor get header value getheadervalue headers constants bundle vendor string version get header value getheadervalue headers constants bundle version version set bundle version setbundleversion version version i java project ijavaproject java core javacore create project exists set default output folder setdefaultoutputfolder get output location getoutputlocation remove first segments removefirstsegments manifest element manifestelement elements parse header parseheader headers constants fragment host elements elements length set host sethost get bundle project service getbundleprojectservice new host newhost elements get value getvalue get range getrange elements get attribute getattribute constants bundle version attribute string get header value getheadervalue headers constants bundle localization set localization setlocalization path elements parse header parseheader headers constants bundle requiredexecutionenvironment elements elements length string string elements length elements length elements get value getvalue set execution environments setexecutionenvironments i build ibuild build get build model getbuildmodel project elements parse header parseheader headers constants bundle classpath i bundle classpath entry ibundleclasspathentry classpath elements elements length list i bundle classpath entry ibundleclasspathentry collect array list arraylist i bundle classpath entry ibundleclasspathentry elements length string lib name libname elements get value getvalue i bundle classpath entry ibundleclasspathentry entries get classpath entries getclasspathentries project build lib name libname entries entries length collect add entries classpath collect to array toarray i bundle classpath entry ibundleclasspathentry collect size elements bundle classpath classpath get classpath entries getclasspathentries nls project nls build nls set bundle classpath setbundleclasspath classpath elements parse header parseheader headers constants bundle symbolicname elements elements length set symbolic name setsymbolicname elements get value getvalue string directive elements get directive getdirective constants singleton directive directive directive elements get attribute getattribute constants singleton directive set singleton setsingleton nls equals directive elements parse header parseheader headers constants elements elements length i package import description ipackageimportdescription imports i package import description ipackageimportdescription elements length elements length optional constants resolution optional equals elements get directive getdirective constants resolution directive equals elements get attribute getattribute nls i core constants icoreconstants optional attribute string elements get attribute getattribute i core constants icoreconstants specification version elements get attribute getattribute constants version attribute imports get bundle project service getbundleprojectservice new package import newpackageimport elements get value getvalue get range getrange optional set package imports setpackageimports imports empty header main tained maintained set header setheader nls constants nls elements parse header parseheader headers constants export elements elements length i package export description ipackageexportdescription exports i package export description ipackageexportdescription elements length elements length manifest element manifestelement exp elements string exp get attribute getattribute i core constants icoreconstants specification version exp get attribute getattribute constants version attribute string directive exp get directive getdirective i core constants icoreconstants friends directive internal nls equals exp get directive getdirective i core constants icoreconstants internal directive nls directive string friends directive friends manifest element manifestelement get array from list getarrayfromlist directive exports get bundle project service getbundleprojectservice new package export newpackageexport exp get value getvalue get version getversion internal friends set package exports setpackageexports exports elements parse header parseheader headers constants require bundle elements elements length i required bundle description irequiredbundledescription req i required bundle description irequiredbundledescription elements length elements length manifest element manifestelement elements reexport constants visibility reexport equals get directive getdirective constants visibility directive equals get attribute getattribute nls i core constants icoreconstants reprovide attribute optional constants resolution optional equals get directive getdirective constants resolution directive equals get attribute getattribute nls i core constants icoreconstants optional attribute req get bundle project service getbundleprojectservice new required bundle newrequiredbundle get value getvalue get range getrange get attribute getattribute constants bundle version attribute optional reexport set required bundles setrequiredbundles req string lazy get header value getheadervalue headers i core constants icoreconstants eclipse autostart lazy lazy get header value getheadervalue headers i core constants icoreconstants eclipse lazystart lazy set activation policy setactivationpolicy get header value getheadervalue headers constants bundle activationpolicy nls equals lazy set activation policy setactivationpolicy constants activation lazy string latest target platform helper targetplatformhelper get target version string gettargetversionstring i plugin model base ipluginmodelbase model plugin registry pluginregistry find model findmodel project model i plugin base ipluginbase base model get plugin base getpluginbase string target platform helper targetplatformhelper get target version for schema version gettargetversionforschemaversion base get schema version getschemaversion equals latest set target version settargetversion build i build entry ibuildentry entry build get entry getentry i build entry ibuildentry bin includes entry string tokens entry get tokens gettokens tokens tokens length list string strings array list arraylist string tokens length strings add tokens remove entries nls strings remove nls meta inf string names project modify operation projectmodifyoperation get library names getlibrarynames names names length strings remove names library folder account trailing slash bug i path ipath path path names path get file extension getfileextension nls strings remove names left overs strings is empty isempty i path ipath paths i path ipath strings size strings size paths path strings set bin includes setbinincludes paths returns bundle classpath specifications library code code param project project param build build properties object code code param library name libraryname library classpath bundle classpath specifications library code code exception core exception coreexception unable access java project source entries i bundle classpath entry ibundleclasspathentry get classpath entries getclasspathentries i project iproject project i build ibuild build string library name libraryname core exception coreexception build i build entry ibuildentry entry build get entry getentry i build entry ibuildentry jar prefix library name libraryname entry entry build get entry getentry i build entry ibuildentry output prefix library name libraryname entry source file folder i bundle classpath entry ibundleclasspathentry get bundle project service getbundleprojectservice new bundle classpath entry newbundleclasspathentry path library name libraryname base entries file folders get classpath entries getclasspathentries project entry base entries source folders get classpath entries getclasspathentries project entry creates returns bundle cla spath claspath specifications source library build entry param project param entry param binary binary folder code code source folder code code bundle classpath specifications code code malformed entry core exception coreexception unable access java build path i bundle classpath entry ibundleclasspathentry get classpath entries getclasspathentries i project iproject project i build entry ibuildentry entry binary core exception coreexception string tokens entry get tokens gettokens i path ipath lib binary lib path entry get name getname substring i build entry ibuildentry output prefix length lib path entry get name getname substring i build entry ibuildentry jar prefix length tokens tokens length i bundle classpath entry ibundleclasspathentry bces i bundle classpath entry ibundleclasspathentry tokens length tokens length i path ipath path path tokens i bundle classpath entry ibundleclasspathentry spec binary spec get bundle project service getbundleprojectservice new bundle classpath entry newbundleclasspathentry path lib i java project ijavaproject java core javacore create project i path ipath output exists i classpath entry iclasspathentry raw classpath rawclasspath get raw classpath getrawclasspath raw classpath rawclasspath length i classpath entry iclasspathentry cpe raw classpath rawclasspath cpe get entry kind getentrykind i classpath entry iclasspathentry cpe source cpe get path getpath remove first segments removefirstsegments equals path output cpe get output location getoutputlocation output output output remove first segments removefirstsegments spec get bundle project service getbundleprojectservice new bundle classpath entry newbundleclasspathentry path output lib bces spec bces create version range string code code param version version range string code code version range code code version range versionrange get range getrange string version version version range versionrange version creates returns version string code code param version version string code code version code code version get version getversion string version version version version override apply i progress monitor iprogressmonitor monitor core exception coreexception project modify operation projectmodifyoperation operation project modify operation projectmodifyoperation operation execute monitor f service fservice override set symbolic name setsymbolicname string f symbolic name fsymbolicname override string get symbolic name getsymbolicname f symbolic name fsymbolicname override setlocationuri uri location f uri furi location override uri getlocationuri f uri furi override set bundle name setbundlename string f bundle name fbundlename override string get bundle name getbundlename f bundle name fbundlename override set bundle vendor setbundlevendor string f bundle vendor fbundlevendor override string get bundle vendor getbundlevendor f bundle vendor fbundlevendor override set bundle version setbundleversion version version f version fversion version override version get bundle version getbundleversion f version fversion override set singleton setsingleton singleton f singleton fsingleton singleton override is singleton issingleton f singleton fsingleton override set localization setlocalization i path ipath path f localization flocalization path override i path ipath get localization getlocalization f localization flocalization override string get nature ids getnatureids f natures fnatures string string copy string f natures fnatures length system arraycopy f natures fnatures copy f natures fnatures length copy override set nature ids setnatureids string natures string copy natures copy string natures length system arraycopy natures copy natures length f natures fnatures copy override has nature hasnature string nature id natureid f natures fnatures f natures fnatures length f natures fnatures equals nature id natureid override set host sethost i host description ihostdescription host f host fhost host override i host description ihostdescription get host gethost f host fhost override set default output folder setdefaultoutputfolder i path ipath output f default ouput folder fdefaultouputfolder output override i path ipath get default output folder getdefaultoutputfolder f default ouput folder fdefaultouputfolder override set execution environments setexecutionenvironments string environments fees environments override string get execution environments getexecutionenvironments fees override i bundle classpath entry ibundleclasspathentry get bundle classpath getbundleclasspath f bundle classpath fbundleclasspath override set activator setactivator string class name classname f activator factivator class name classname override string get activator getactivator f activator factivator override set target version settargetversion string version f target version ftargetversion version override string get target version gettargetversion f target version ftargetversion override set equinox setequinox equinox f is equinox fisequinox equinox override is equinox isequinox f is equinox fisequinox override set required bundles setrequiredbundles i required bundle description irequiredbundledescription bundles f required bundles frequiredbundles bundles override i required bundle description irequiredbundledescription get required bundles getrequiredbundles f required bundles frequiredbundles override set package imports setpackageimports i package import description ipackageimportdescription imports f imports fimports imports override i package import description ipackageimportdescription get package imports getpackageimports f imports fimports override set package exports setpackageexports i package export description ipackageexportdescription exports f exports fexports exports override i package export description ipackageexportdescription get package exports getpackageexports f exports fexports override i project iproject get project getproject f project fproject override deprecated set bundle class ath setbundleclassath i bundle classpath entry ibundleclasspathentry entries set bundle classpath setbundleclasspath entries override set bundle classpath setbundleclasspath i bundle classpath entry ibundleclasspathentry entries f bundle classpath fbundleclasspath entries override set bin includes setbinincludes i path ipath paths f bin includes fbinincludes paths override i path ipath get bin includes getbinincludes f bin includes fbinincludes override set bundle root setbundleroot i path ipath path f root froot path override i path ipath get bundle root getbundleroot f root froot override is extension registry isextensionregistry f is extension registry fisextensionregistry override set extension registry setextensionregistry support extensions supportextensions f is extension registry fisextensionregistry support extensions supportextensions override string get launch short cuts getlaunchshortcuts f launch short cuts flaunchshortcuts override set launch short cuts setlaunchshortcuts string ids f launch short cuts flaunchshortcuts ids override string get export wizard id getexportwizardid f export wizard fexportwizard override set export wizard id setexportwizardid string f export wizard fexportwizard override set activation policy setactivationpolicy string policy constants activation lazy equals policy f activation policy factivationpolicy policy f activation policy factivationpolicy override string get activation policy getactivationpolicy f activation policy factivationpolicy override set header setheader string header string f headers fheaders header override string get header getheader string header check f headers fheaders contains key containskey header f headers fheaders header f read headers freadheaders f read headers freadheaders contains key containskey header string string f read headers freadheaders header nls returns extra headers map header names header values map header names header values empty map string string get extra headers getextraheaders f headers fheaders