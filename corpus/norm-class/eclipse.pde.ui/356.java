copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation manumitting technologies bug wrong error messages opening target definition org eclipse pde internal core target java java util javax xml parsers parser configuration exception parserconfigurationexception javax xml transform transformer exception transformerexception org eclipse core runtime org eclipse core variables i string variable manager istringvariablemanager org eclipse core variables variables plugin variablesplugin org eclipse debug core debug plugin debugplugin org eclipse equinox framework admin frameworkadmin bundle info bundleinfo org eclipse equinox metadata version org eclipse osgi util nls org eclipse pde core plugin target platform targetplatform org eclipse pde core target org eclipse pde internal core external feature model manager externalfeaturemodelmanager org eclipse pde internal core pde core pdecore org xml sax sax exception saxexception target definition implementation target definition targetdefinition i target definition itargetdefinition description string f name fname included optional filtering name version descriptor nameversiondescriptor f included fincluded arguments string f program args fprogramargs string fvmargs environment settings i path ipath fjrecontainer string f arch farch string fos string fws string fnl bundle containers i target location itargetlocation f containers fcontainers handle i target handle itargethandle f handle fhandle status generated target resolved code code i status istatus f resolution status fresolutionstatus implicit dependencies name version descriptor nameversiondescriptor f implicit fimplicit internal settings mode content displayed user fuimode mode plugin mode plugin mode feature cache features location maps string path location array i feature models ifeaturemodels i feature model ifeaturemodel map string target feature targetfeature f features in location ffeaturesinlocation hash map hashmap string target feature targetfeature internal cache features target managed features features plug ins don belong feature target feature targetfeature f features ffeatures target bundle targetbundle f other bundles fotherbundles f sequence number fsequencenumber constructs target definition based handle target definition targetdefinition i target handle itargethandle handle f handle fhandle handle override string get arch getarch f arch farch override i target location itargetlocation get target locations gettargetlocations f containers fcontainers override string getnl fnl override string get name getname f name fname override string getos fos override string get program arguments getprogramarguments f program args fprogramargs override string getvmarguments fvmargs override string getws fws override set arch setarch string arch increment sequence number incrementsequencenumber f arch farch arch override setnl string increment sequence number incrementsequencenumber fnl override set name setname string f name fname override setos string increment sequence number incrementsequencenumber fos override set program arguments setprogramarguments string args args args length args f program args fprogramargs args override setvmarguments string args args args length args fvmargs args override setws string increment sequence number incrementsequencenumber fws override set target locations settargetlocations i target location itargetlocation locations increment sequence number incrementsequencenumber clear feature model cache based bundle container locations f features ffeatures f other bundles fotherbundles locations locations length locations f containers fcontainers locations locations f included fincluded locations length locations abstract bundle container abstractbundlecontainer abstract bundle container abstractbundlecontainer locations associate with target associatewithtarget clears models cached container location param location location clear cache code code clear cached models flush caches flushcaches string location clear feature model cache based bundle container locations f features ffeatures f other bundles fotherbundles location f features in location ffeaturesinlocation clear f features in location ffeaturesinlocation remove location f containers fcontainers f included fincluded override i status istatus resolve i progress monitor iprogressmonitor monitor i target location itargetlocation containers get target locations gettargetlocations num containers num containers length f resolution status fresolutionstatus sub monitor submonitor sub monitor submonitor sub monitor submonitor convert monitor messages target definition targetdefinition num multi status multistatus status multi status multistatus pde core pdecore plugin messages target definition targetdefinition target utils targetutils hash set hashset target utils targetutils containers track synchronize rs synchronizers processed containers length sub monitor submonitor is canceled iscanceled status cancel status sub monitor submonitor sub task subtask messages target definition targetdefinition target utils targetutils synchronizer containers get adapter getadapter target utils targetutils synchronizer synchronizer add synchronizer synchronizer synchronize sub monitor submonitor split core exception coreexception status add get status getstatus status isok f resolution status fresolutionstatus status sub monitor submonitor is canceled iscanceled status cancel status containers length sub monitor submonitor is canceled iscanceled status cancel status sub monitor submonitor sub task subtask messages target definition targetdefinition i status istatus containers resolve sub monitor submonitor split isok status add status isok f resolution status fresolutionstatus status status sub monitor submonitor is canceled iscanceled status cancel status f resolution status fresolutionstatus status sub monitor submonitor monitor monitor override is resolved isresolved i target location itargetlocation containers get target locations gettargetlocations containers containers length i target location itargetlocation container containers container is resolved isresolved override i status istatus get status getstatus f resolution status fresolutionstatus f resolution status fresolutionstatus isok f resolution status fresolutionstatus is resolved isresolved i target location itargetlocation containers get target locations gettargetlocations containers check containers resolution problems multi status multistatus result multi status multistatus pde core pdecore plugin messages target definition targetdefinition containers length i target location itargetlocation container containers i status istatus container status containerstatus container get status getstatus container status containerstatus container status containerstatus isok result add container status containerstatus check included bundles problems build status bundle list target bundle targetbundle bundles get bundles getbundles bundles length bundles get status getstatus isok result add bundles get status getstatus result isok status problem multi status children status status result status status override set included setincluded name version descriptor nameversiondescriptor included f included fincluded included override name version descriptor nameversiondescriptor get included getincluded f included fincluded override target bundle targetbundle get bundles getbundles get bundles getbundles override target bundle targetbundle get all bundles getallbundles get bundles getbundles gathers returns included bundles target code code resolved param all bundles allbundles bundles included optional bundles code code target bundle targetbundle get bundles getbundles all bundles allbundles is resolved isresolved i target location itargetlocation containers get target locations gettargetlocations containers list target bundle targetbundle array list arraylist target bundle targetbundle containers length i target location itargetlocation container containers target bundle targetbundle bundles container get bundles getbundles bundles bundles length target bundle targetbundle bundles add target bundle targetbundle all resolved bundles allresolvedbundles to array toarray target bundle targetbundle size all bundles allbundles all resolved bundles allresolvedbundles filter bundles filterbundles all resolved bundles allresolvedbundles get included getincluded target bundle targetbundle target bundle targetbundle filter bundles filterbundles target bundle targetbundle bundles name version descriptor nameversiondescriptor filter filter filtering bundles filter length target bundle targetbundle features don errors missing bundles caused missing specific fragments contains features containsfeatures included features missing add errors resolved bundles missing bundles list name version descriptor nameversiondescriptor missing features missingfeatures array list arraylist name version descriptor nameversiondescriptor list name version descriptor nameversiondescriptor included array list arraylist name version descriptor nameversiondescriptor feature filters list included bundles bundle filters add list filter length filter get type gettype name version descriptor nameversiondescriptor type plugin included add filter filter get type gettype name version descriptor nameversiondescriptor type feature contains features containsfeatures target feature targetfeature features get all features getallfeatures target feature targetfeature best match bestmatch features length target feature targetfeature feature features feature get id getid equals filter get id getid filter get version getversion find exact feature match filter get version getversion equals feature get version getversion exact match best match bestmatch feature best match bestmatch version highest version version version parse version parseversion feature get version getversion version version parse version parseversion best match bestmatch get version getversion compare to compareto best match bestmatch feature best match bestmatch find version match match best match bestmatch feature add required plugins feature list includes best match bestmatch name version descriptor nameversiondescriptor plugins best match bestmatch get plugins getplugins plugins length included add plugins missing features missingfeatures add filter matching bundles org anizing organizing feature create invalid target bundles missing bundle includes list target bundle targetbundle result get matching bundles getmatchingbundles bundles included to array toarray name version descriptor nameversiondescriptor included size contains features containsfeatures add missing features resolved bundles error statuses contains features containsfeatures missing features missingfeatures is empty isempty iterator name version descriptor nameversiondescriptor iterator missing features missingfeatures iterator iterator has next hasnext name version descriptor nameversiondescriptor missing iterator bundle info bundleinfo info bundle info bundleinfo missing get id getid missing get version getversion bundle info bundleinfo level string message nls bind messages target definition targetdefinition required feature could not be found requiredfeaturecouldnotbefound missing get id getid status status status i status istatus error pde core pdecore plugin target bundle targetbundle status feature exist message result add invalid target bundle invalidtargetbundle info status result to array toarray target bundle targetbundle result size returns bundles collection match symbolic names version criteria version newest version selected handle missing bundles handlemissingbundles code code returned list link invalid target bundle invalidtargetbundle included filters matching bundle collection invalid bundles statuses describing could n couldn matched param collection bundles resolve match criteria param included bundles include code code restrictions param handle missing bundles handlemissingbundles create link invalid target bundle invalidtargetbundle missing includes list i resolved bundle iresolvedbundle bundles match container restrictions list target bundle targetbundle get matching bundles getmatchingbundles target bundle targetbundle collection name version descriptor nameversiondescriptor included handle missing bundles handlemissingbundles included array list arraylist target bundle targetbundle result array list arraylist target bundle targetbundle result add all addall arrays as list aslist collection result map bundles names versions map string list target bundle targetbundle bundle map bundlemap hash map hashmap string list target bundle targetbundle collection length collection length target bundle targetbundle resolved collection list target bundle targetbundle list bundle map bundlemap resolved get bundle info getbundleinfo get symbolic name getsymbolicname list list array list arraylist target bundle targetbundle bundle map bundlemap resolved get bundle info getbundleinfo get symbolic name getsymbolicname list list add resolved list target bundle targetbundle resolved array list arraylist target bundle targetbundle included length bundle info bundleinfo info bundle info bundleinfo included get id getid included get version getversion bundle info bundleinfo level target bundle targetbundle bundle resolve bundle resolvebundle bundle map bundlemap info handle missing bundles handlemissingbundles bundle resolved add bundle resolved resolves bundle info map map symbolic names values lists link target bundle targetbundle match names handle missing bundles handlemissingbundles code code link invalid target bundle invalidtargetbundle created returned info match map entry returned bundle status details missing handle missing bundles handlemissingbundles code code code code returned param bundle map bundlemap bundles resolve param info version match param handle missing bundles handlemissingbundles link invalid target bundle invalidtargetbundle info match map entry code code resolved bundle code code target bundle targetbundle resolve bundle resolvebundle map string list target bundle targetbundle bundle map bundlemap bundle info bundleinfo info handle missing bundles handlemissingbundles list target bundle targetbundle list bundle map bundlemap info get symbolic name getsymbolicname list string version info get version getversion version version equals bundle info bundleinfo empty version select newest list size sort list collections sort list comparator object override compare object object bundle info bundleinfo target bundle targetbundle get bundle info getbundleinfo bundle info bundleinfo target bundle targetbundle get bundle info getbundleinfo version version create get version getversion version version create get version getversion compare to compareto illegal argument exception illegalargumentexception pde core pdecore log get version getversion compare to compareto get version getversion select target bundle targetbundle list list size iterator iterator list iterator iterator has next hasnext target bundle targetbundle bundle target bundle targetbundle iterator bundle get bundle info getbundleinfo get version getversion equals version bundle version exist handle missing bundles handlemissingbundles sev i status istatus error string message nls bind messages abstract bundle container abstractbundlecontainer object info get version getversion info get symbolic name getsymbolicname i status istatus status status sev pde core pdecore plugin target bundle targetbundle status version exist message invalid target bundle invalidtargetbundle info status exist handle missing bundles handlemissingbundles sev i status istatus error string message nls bind messages abstract bundle container abstractbundlecontainer info get symbolic name getsymbolicname i status istatus status status sev pde core pdecore plugin target bundle targetbundle status plugin exist message invalid target bundle invalidtargetbundle info status override i target handle itargethandle get handle gethandle f handle fhandle build contents stream param stream input stream core exception coreexception error occurs set contents setcontents input stream inputstream stream core exception coreexception f arch farch f containers fcontainers f implicit fimplicit fjrecontainer f included fincluded f name fname fnl fos f program args fprogramargs fvmargs fws f sequence number fsequencenumber target definition persistence helper targetdefinitionpersistencehelper initfromxml stream parser configuration exception parserconfigurationexception abort messages target definition targetdefinition sax exception saxexception abort messages target definition targetdefinition io exception ioexception abort messages target definition targetdefinition per sists persists contents stream param stream output stream core exception coreexception error occurs write output stream outputstream stream core exception coreexception target definition persistence helper targetdefinitionpersistencehelper persistxml stream io exception ioexception abort messages target definition targetdefinition parser configuration exception parserconfigurationexception abort messages target definition targetdefinition transformer exception transformerexception abort messages target definition targetdefinition sax exception saxexception abort messages target definition targetdefinition core exception message underlying exception code code param message message param underlying exception code code core exception coreexception abort string message exception core exception coreexception core exception coreexception status i status istatus error pde core pdecore plugin message override name version descriptor nameversiondescriptor get implicit dependencies getimplicitdependencies f implicit fimplicit override set implicit dependencies setimplicitdependencies name version descriptor nameversiondescriptor bundles bundles bundles length bundles f implicit fimplicit bundles override i path ipath getjrecontainer fjrecontainer override setjrecontainer i path ipath container path containerpath fjrecontainer container path containerpath returns content definition equal content definition param definition content definition equal content definition is content equal iscontentequal i target definition itargetdefinition definition is null or equal isnullorequal get name getname definition get name getname is null or equal isnullorequal get arch getarch definition get arch getarch is null or equal isnullorequal getnl definition getnl is null or equal isnullorequal getos definition getos is null or equal isnullorequal getws definition getws is null or equal isnullorequal get program arguments getprogramarguments definition get program arguments getprogramarguments is null or equal isnullorequal getvmarguments definition getvmarguments is null or equal isnullorequal getjrecontainer definition getjrecontainer check includes optional is null or equal isnullorequal get included getincluded definition get included getincluded check containers i target location itargetlocation get target locations gettargetlocations i target location itargetlocation definition get target locations gettargetlocations are containers equal arecontainersequal check implicit dependencies is null or equal isnullorequal get implicit dependencies getimplicitdependencies definition get implicit dependencies getimplicitdependencies returns content definition equivalent content definition excluding description param definition content definition equivalent content definition is content equivalent iscontentequivalent i target definition itargetdefinition definition is null or equal isnullorequal get arch getarch definition get arch getarch is null or equal isnullorequal getnl definition getnl is null or equal isnullorequal getos definition getos is null or equal isnullorequal getws definition getws is args null or equal isargsnullorequal get program arguments getprogramarguments definition get program arguments getprogramarguments is args null or equal isargsnullorequal getvmarguments definition getvmarguments is null or equal isnullorequal getjrecontainer definition getjrecontainer check includes optional is null or equal isnullorequal get included getincluded definition get included getincluded check containers i target location itargetlocation get target locations gettargetlocations i target location itargetlocation definition get target locations gettargetlocations are containers equal arecontainersequal check implicit dependencies is null or equal isnullorequal get implicit dependencies getimplicitdependencies definition get implicit dependencies getimplicitdependencies is null or equal isnullorequal object object equals returns arrays equal contents code code param objects param objects arrays equal contents code code is null or equal isnullorequal object objects object objects objects objects objects objects length objects length objects length objects equals objects is args null or equal isargsnullorequal string args string args args args args string debug plugin debugplugin parse arguments parsearguments args string debug plugin debugplugin parse arguments parsearguments args length length length equals are containers equal arecontainersequal i target location itargetlocation i target location itargetlocation length length length equals override string to string tostring string buffer stringbuffer buf string buffer stringbuffer nls buf append f name fname f name fname f containers fcontainers nls buf append t no tno containers f containers fcontainers length nls buf append append nls f containers fcontainers to string tostring nls nls nls nls buf append n env nenv append fos append append fws append append f arch farch append append fnl nls buf append njre append fjrecontainer nls nls buf append n args nargs append f program args fprogramargs append append fvmargs nls nls buf append n implicit nimplicit append f implicit fimplicit integer to string tostring f implicit fimplicit length nls buf append n handle nhandle append f handle fhandle to string tostring buf to string tostring returns feature models exist location location path locationpath code code target platform location location path locationpath string container string variables resolved target definition cache feature models faster retrieval todo clear cache param location path locationpath string path directory features container string variables code code list feature models location empty param monitor progress monitor core exception coreexception problem subst ituting substituting string variable target feature targetfeature resolve features resolvefeatures string location path locationpath i progress monitor iprogressmonitor monitor core exception coreexception string path location path locationpath path path target platform targetplatform get default location getdefaultlocation i string variable manager istringvariablemanager manager variables plugin variablesplugin get default getdefault get string variable manager getstringvariablemanager path manager perform string substitution performstringsubstitution path target feature targetfeature models f features in location ffeaturesinlocation models f features in location ffeaturesinlocation path models models i feature model ifeaturemodel models to array toarray i feature model ifeaturemodel models size models external feature model manager externalfeaturemodelmanager create features createfeatures path array list arraylist object monitor f features in location ffeaturesinlocation path models models override target feature targetfeature get all features getallfeatures is resolved isresolved f features ffeatures f features ffeatures i target location itargetlocation containers get target locations gettargetlocations collect features containers remove duplicates map name version descriptor nameversiondescriptor target feature targetfeature result hash map hashmap name version descriptor nameversiondescriptor target feature targetfeature containers containers length containers length target feature targetfeature current features currentfeatures containers get features getfeatures current features currentfeatures current features currentfeatures length current features currentfeatures length target feature targetfeature feature current features currentfeatures feature get id getid don features ids bug name version descriptor nameversiondescriptor key name version descriptor nameversiondescriptor feature get id getid feature get version getversion result key feature f features ffeatures result values to array toarray target feature targetfeature result size f features ffeatures returns i resolved bundle iresolvedbundle target features cached copy get all features getallfeatures resolved bundles target don belong features empty target bundle targetbundle get other bundles getotherbundles is resolved isresolved f other bundles fotherbundles f other bundles fotherbundles target bundle targetbundle all bundles allbundles get all bundles getallbundles map string target bundle targetbundle remaining hash map hashmap string target bundle targetbundle all bundles allbundles length remaining all bundles allbundles get bundle info getbundleinfo get symbolic name getsymbolicname all bundles allbundles target feature targetfeature features get all features getallfeatures features length name version descriptor nameversiondescriptor plugins features get plugins getplugins plugins length remaining remove plugins get id getid collection target bundle targetbundle values remaining values f other bundles fotherbundles values to array toarray target bundle targetbundle values size f other bundles fotherbundles convenience method link target feature targetfeature included target included plug ins link target bundle targetbundle features returns bundles error statuses code code target resolved get all features getallfeatures get other bundles getotherbundles link target feature targetfeature link target bundle targetbundle code code object get features and bundles getfeaturesandbundles is resolved isresolved target feature targetfeature all features allfeatures get all features getallfeatures target bundle targetbundle all extra bundles allextrabundles get other bundles getotherbundles name version descriptor nameversiondescriptor included get included getincluded included object result hash set hashset object result add all addall arrays as list aslist all features allfeatures result add all addall arrays as list aslist all extra bundles allextrabundles result object result hash set hashset object included length included get type gettype name version descriptor nameversiondescriptor type plugin all extra bundles allextrabundles length all extra bundles allextrabundles get bundle info getbundleinfo get symbolic name getsymbolicname equals included get id getid result add all extra bundles allextrabundles included get type gettype name version descriptor nameversiondescriptor type feature all features allfeatures length all features allfeatures get id getid equals included get id getid result add all features allfeatures result current style link mode feature link mode plugin getuimode fuimode param mode style link mode feature link mode plugin setuimode mode fuimode mode returns current sequence number target sequence numbers change target features bundles resolved current sequence number get sequence number getsequencenumber f sequence number fsequencenumber inc reases increases current sequence number target definition targetdefinition get sequence number getsequencenumber current sequence number inc reased increased increment sequence number incrementsequencenumber f sequence number fsequencenumber convenience method sequence number specific loading target persisted file param sequence number set sequence number setsequencenumber f sequence number fsequencenumber