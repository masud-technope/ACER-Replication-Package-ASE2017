copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal core java java util zip zip entry zipentry java util zip zip file zipfile javax xml parsers sax parser factory saxparserfactory org eclipse core runtime org eclipse core runtime spi org eclipse osgi service resolver bundle description bundledescription org eclipse osgi service resolver host specification hostspecification org eclipse pde core plugin org osgi util tracker service tracker servicetracker pde registry strategy pderegistrystrategy registry strategy registrystrategy tracker xml parser service service tracker servicetracker xml tracker xmltracker object f key fkey model listener modellistener f model listener fmodellistener extension listener extensionlistener f extension listener fextensionlistener pde extension registry pdeextensionregistry fpderegistry registry listener registrylistener i extension registry iextensionregistry f registry fregistry remove models removemodels i plugin model base ipluginmodelbase bases only inactive onlyinactive bases length reset model resetmodel bases only inactive onlyinactive bases is enabled isenabled remove bundle removebundle f registry fregistry bases set registry setregistry i extension registry iextensionregistry registry f registry fregistry registry model listener modellistener registry listener registrylistener i plugin model listener ipluginmodellistener override models changed modelschanged plugin model delta pluginmodeldelta delta f registry fregistry create registry createregistry ignore removed models model entries modelentries empty model entry modelentry entries delta get changed entries getchangedentries entries length workspace models registered external models search extension points find workspace version i plugin model base ipluginmodelbase workspace models workspacemodels entries get workspace models getworkspacemodels workspace models workspacemodels length remove models removemodels entries get external models getexternalmodels entries has workspace models hasworkspacemodels remove models removemodels workspace models workspacemodels add bundles addbundles f registry fregistry entries get workspace models getworkspacemodels external models registered times add bundles addbundles f registry fregistry entries get external models getexternalmodels entries delta get added entries getaddedentries model entry modelentry removed entries removedentries delta get removed entries getremovedentries removed entries removedentries length entries length f registry fregistry i dynamic extension registry idynamicextensionregistry removed entries removedentries length removed entries removedentries get id getid i dynamic extension registry idynamicextensionregistry registry i dynamic extension registry idynamicextensionregistry f registry fregistry i contributor icontributor contributors registry get all contributors getallcontributors contributors length removed entries removedentries get id getid equals contributors get name getname registry remove contributor removecontributor contributors f key fkey entries length add bundles addbundles f registry fregistry entries get active models getactivemodels extension listener extensionlistener registry listener registrylistener i extension delta listener iextensiondeltalistener override extensions changed extensionschanged i extension delta event iextensiondeltaevent event f registry fregistry create registry createregistry i plugin model base ipluginmodelbase bases event get removed models getremovedmodels remove models removemodels bases remove models removemodels event get changed models getchangedmodels add bundles addbundles f registry fregistry event get changed models getchangedmodels add bundles addbundles f registry fregistry event get added models getaddedmodels remove workspace model bundle symbolic name symbolicname refresh external models removing adding bases length model entry modelentry entry plugin registry pluginregistry find entry findentry bases get plugin base getpluginbase get id getid entry entry get workspace models getworkspacemodels length i plugin model base ipluginmodelbase external models externalmodels entry get external models getexternalmodels remove models removemodels external models externalmodels add bundles addbundles f registry fregistry external models externalmodels pde registry strategy pderegistrystrategy file storage dirs storagedirs cache read only cachereadonly object key pde extension registry pdeextensionregistry registry storage dirs storagedirs cache read only cachereadonly init f key fkey key fpderegistry registry init connect listeners connectlisteners override log i status istatus status dev elopment development time create markers registry problems log bug connect listeners connectlisteners listen model register bundles unregister removed bundles plugin model manager pluginmodelmanager manager pde core pdecore get default getdefault get model manager getmodelmanager manager add plugin model listener addpluginmodellistener f model listener fmodellistener model listener modellistener manager add extension delta listener addextensiondeltalistener f extension listener fextensionlistener extension listener extensionlistener set listener registry setlistenerregistry i extension registry iextensionregistry registry f model listener fmodellistener f model listener fmodellistener set registry setregistry registry f extension listener fextensionlistener f extension listener fextensionlistener set registry setregistry registry override on start onstart i extension registry iextensionregistry registry loaded from cache loadedfromcache on start onstart registry loaded from cache loadedfromcache set listener registry setlistenerregistry registry loaded from cache loadedfromcache process bundles processbundles registry override on stop onstop i extension registry iextensionregistry registry on stop onstop registry set listener registry setlistenerregistry override sax parser factory saxparserfactory getxmlparser xml tracker xmltracker xml tracker xmltracker service tracker servicetracker object object pde core pdecore get default getdefault get bundle context getbundlecontext sax parser factory saxparserfactory get name getname xml tracker xmltracker open sax parser factory saxparserfactory xml tracker xmltracker get service getservice process bundles processbundles i extension registry iextensionregistry registry add bundles addbundles registry fpderegistry get models getmodels add bundles addbundles i extension registry iextensionregistry registry i plugin model base ipluginmodelbase bases bases length add bundle addbundle registry bases add bundle addbundle i extension registry iextensionregistry registry i plugin model base ipluginmodelbase base i contributor icontributor contributor create contributor createcontributor base contributor i dynamic extension registry idynamicextensionregistry registry has contributor hascontributor contributor file input get file getfile base input input stream inputstream zip file zipfile jfile file base get install location getinstalllocation is directory isdirectory directory bundle access extensions file file input stream fileinputstream input archive d archived bundle extract file jfile zip file zipfile input zip file zipfile open read string file name filename base is fragment model isfragmentmodel i core constants icoreconstants fragment filename descriptor i core constants icoreconstants plugin filename descriptor zip entry zipentry entry jfile get entry getentry file name filename entry jfile get input stream getinputstream entry registry add contribution addcontribution buffered input stream bufferedinputstream contributor input get path getpath f key fkey io exception ioexception jfile jfile close io exception ioexception remove bundle removebundle i extension registry iextensionregistry registry i plugin model base ipluginmodelbase base registry i dynamic extension registry idynamicextensionregistry i contributor icontributor contributor create contributor createcontributor base contributor i dynamic extension registry idynamicextensionregistry registry has contributor hascontributor contributor i dynamic extension registry idynamicextensionregistry registry remove contributor removecontributor create contributor createcontributor base f key fkey rel easing releasing cached i plugin model base ipluginmodelbase reset model resetmodel i plugin model base ipluginmodelbase model i plugin base ipluginbase base model get plugin base getpluginbase base bundle plugin base bundlepluginbase i extensions iextensions ext bundle plugin base bundlepluginbase base get extensions root getextensionsroot ext ext abstract extensions abstractextensions abstract extensions abstractextensions ext reset base abstract extensions abstractextensions abstract extensions abstractextensions base reset extensions resetextensions file get file getfile i plugin model base ipluginmodelbase base string loc base get install location getinstalllocation loc file file file loc file exists file is file isfile file string file name filename base is fragment model isfragmentmodel i core constants icoreconstants fragment filename descriptor i core constants icoreconstants plugin filename descriptor file input file inputfile file file file name filename input file inputfile exists input file inputfile i contributor icontributor create contributor createcontributor i plugin model base ipluginmodelbase base bundle description bundledescription desc base base get bundle description getbundledescription i plugin model base ipluginmodelbase bundle description bundledescription won valid desc string desc get symbolic name getsymbolicname string to string tostring desc get bundle id getbundleid string host name hostname string host id hostid host specification hostspecification host desc get host gethost model singleton fragment host singleton host host get bundle getbundle host get bundle getbundle is singleton issingleton host desc is singleton issingleton host bundle description bundledescription hosts host get hosts gethosts hosts length bundle description bundledescription host desc hostdesc hosts host name hostname host desc hostdesc get symbolic name getsymbolicname host id hostid to string tostring host desc hostdesc get bundle id getbundleid registry contributor registrycontributor host id hostid host name hostname dispose plugin model manager pluginmodelmanager manager pde core pdecore get default getdefault get model manager getmodelmanager manager remove plugin model listener removepluginmodellistener f model listener fmodellistener manager remove extension delta listener removeextensiondeltalistener f extension listener fextensionlistener xml tracker xmltracker xml tracker xmltracker close xml tracker xmltracker create registry createregistry fpderegistry get registry getregistry timestamp cal culations calculations pde state pdestate compute timestamp computetimestamp url urls timestamp override get contributions timestamp getcontributionstimestamp i plugin model base ipluginmodelbase bases fpderegistry get models getmodels time stamp timestamp bases length string loc bases get install location getinstalllocation loc file location file loc location exists location is file isfile time stamp timestamp location last modified lastmodified file manifest file location i core constants icoreconstants bundle filename descriptor manifest exists time stamp timestamp manifest last modified lastmodified manifest file location i core constants icoreconstants plugin filename descriptor manifest exists time stamp timestamp manifest last modified lastmodified manifest file location i core constants icoreconstants fragment filename descriptor manifest exists time stamp timestamp manifest last modified lastmodified time stamp timestamp location get absolute path getabsolutepath hash code hashcode time stamp timestamp