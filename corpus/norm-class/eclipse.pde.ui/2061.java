copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation eclipse source eclipsesource corporation ongoing enhancements org eclipse pde internal launcher java file java util org eclipse core resources i resource iresource org eclipse core runtime org eclipse debug core org eclipse debug debuguitools org eclipse debug i debug model presentation idebugmodelpresentation org eclipse jdt launching i java launch configuration constants ijavalaunchconfigurationconstants org eclipse jface action action org eclipse jface window window org eclipse pde core plugin org eclipse pde internal core org eclipse pde internal core ifeature org eclipse pde internal core iproduct org eclipse pde internal core iproduct i product iproduct org eclipse pde internal core util core utility coreutility org eclipse pde internal launching ipde constants ipdeconstants org eclipse pde internal launching launcher bundle launcher helper bundlelauncherhelper org eclipse pde internal launching launcher launch arguments helper launchargumentshelper org eclipse pde internal pde plugin pdeplugin org eclipse pde internal pde ui messages pdeuimessages org eclipse pde launching ipde launcher constants ipdelauncherconstants org eclipse pde launching pde source path provider pdesourcepathprovider org eclipse pde launcher eclipse launch shortcut eclipselaunchshortcut org eclipse dialogs element list selection dialog elementlistselectiondialog launch action launchaction action i product iproduct f product fproduct string f mode fmode string f path fpath map string i plugin configuration ipluginconfiguration f plugin configurations fpluginconfigurations launch action launchaction i product iproduct product string path string mode f product fproduct product f mode fmode mode f path fpath path initialize configurations lazily todo f plugin configurations fpluginconfigurations hash map hashmap i plugin configuration ipluginconfiguration configurations f product fproduct get plugin configurations getpluginconfigurations configurations length i plugin configuration ipluginconfiguration config configurations f plugin configurations fpluginconfigurations config get id getid config override i launch configuration ilaunchconfiguration config find launch configuration findlaunchconfiguration config debuguitools launch config f mode fmode core exception coreexception i launch configuration ilaunchconfiguration find launch configuration findlaunchconfiguration core exception coreexception i launch configuration ilaunchconfiguration configs get launch configurations getlaunchconfigurations configs length create configuration createconfiguration i launch configuration ilaunchconfiguration config configs length config configs prompt user choose config config choose configuration chooseconfiguration configs config config refresh configuration refreshconfiguration config get working copy getworkingcopy config i launch configuration ilaunchconfiguration refresh configuration refreshconfiguration i launch configuration working copy ilaunchconfigurationworkingcopy core exception coreexception set attribute setattribute ipde launcher constants ipdelauncherconstants product f product fproduct get product id getproductid set attribute setattribute ipde launcher constants ipdelauncherconstants application f product fproduct get application getapplication string platform getos string arch platform getosarch set attribute setattribute i java launch configuration constants ijavalaunchconfigurationconstants attr arguments getvmarguments arch set attribute setattribute i java launch configuration constants ijavalaunchconfigurationconstants attr program arguments get program arguments getprogramarguments arch set attribute setattribute i java launch configuration constants ijavalaunchconfigurationconstants attr jre container path getjrecontainer string buffer stringbuffer wsplugins string buffer stringbuffer string buffer stringbuffer exp lugins explugins string buffer stringbuffer i plugin model base ipluginmodelbase models get models getmodels models length i plugin model base ipluginmodelbase model models model get underlying resource getunderlyingresource append bundle appendbundle exp lugins explugins model append bundle appendbundle wsplugins model set attribute setattribute ipde launcher constants ipdelauncherconstants selected workspace plugins wsplugins to string tostring set attribute setattribute ipde launcher constants ipdelauncherconstants selected target plugins exp lugins explugins to string tostring string config ini configini get template config ini gettemplateconfigini set attribute setattribute ipde launcher constants ipdelauncherconstants config generate config ini configini config ini configini set attribute setattribute ipde launcher constants ipdelauncherconstants config template location config ini configini do save dosave append bundle appendbundle string buffer stringbuffer buffer i plugin model base ipluginmodelbase model i plugin configuration ipluginconfiguration configuration f plugin configurations fpluginconfigurations model get plugin base getpluginbase get id getid nls string nls string autostart configuration integer to string tostring configuration get start level getstartlevel ensure don start level nls nls equals autostart to string tostring configuration is auto start isautostart string entry bundle launcher helper bundlelauncherhelper write bundle entry writebundleentry model autostart buffer append entry buffer append string get program arguments getprogramarguments string string arch string buffer stringbuffer buffer string buffer stringbuffer launch arguments helper launchargumentshelper get initial program arguments getinitialprogramarguments i arguments info iargumentsinfo info f product fproduct get launcher arguments getlauncherarguments nls string user args userargs info core utility coreutility normalize info get complete program arguments getcompleteprogramarguments arch concat args concatargs buffer user args userargs string getvmarguments string string arch string buffer stringbuffer buffer string buffer stringbuffer launch arguments helper launchargumentshelper getinitialvmarguments i arguments info iargumentsinfo info f product fproduct get launcher arguments getlauncherarguments nls string user args userargs info core utility coreutility normalize info getcompletevmarguments arch concat args concatargs buffer user args userargs string concat args concatargs string buffer stringbuffer initial args initialargs string user args userargs list string initial args list initialargslist arrays as list aslist debug plugin debugplugin split arguments splitarguments initial args initialargs to string tostring user args userargs user args userargs length list string user args list userargslist arrays as list aslist debug plugin debugplugin split arguments splitarguments user args userargs previous has sub argument previoushassubargument iterator string iterator user args list userargslist iterator iterator has next hasnext object user arg userarg iterator has sub argument hassubargument user arg userarg to string tostring equals i environment ienvironment user arg userarg to string tostring equals i environment ienvironment has sub argument hassubargument has sub argument hassubargument user arg userarg to string tostring equals i environment ienvironment arch user arg userarg to string tostring equals i environment ienvironment initial args list initialargslist user arg userarg has sub argument hassubargument previous has sub argument previoushassubargument initial args initialargs append initial args initialargs append user arg userarg previous has sub argument previoushassubargument has sub argument hassubargument initial args initialargs to string tostring string getjrecontainer string ijre info ijreinfo info f product fproduct getjreinfo info i path ipath jre path jrepath info getjrecontainerpath jre path jrepath jre path jrepath to portable string toportablestring i plugin model base ipluginmodelbase get models getmodels i plugin model base ipluginmodelbase launch plugins launchplugins hash set hashset f product fproduct use features usefeatures i feature model ifeaturemodel features get unique features getuniquefeatures features length add feature plugins addfeatureplugins features get feature getfeature launch plugins launchplugins i product plugin iproductplugin plugins f product fproduct get plugins getplugins plugins length string plugins get id getid i plugin model base ipluginmodelbase model plugin registry pluginregistry find model findmodel model target platform helper targetplatformhelper matches current environment matchescurrentenvironment model launch plugins launchplugins add model launch plugins launchplugins to array toarray i plugin model base ipluginmodelbase launch plugins launchplugins size i feature model ifeaturemodel get unique features getuniquefeatures array list arraylist i feature model ifeaturemodel list array list arraylist i product feature iproductfeature features f product fproduct get features getfeatures features length string features get id getid string version features get version getversion add feature and children addfeatureandchildren version list list to array toarray i feature model ifeaturemodel list size add feature and children addfeatureandchildren string string version list i feature model ifeaturemodel list feature model manager featuremodelmanager manager pde core pdecore get default getdefault get feature model manager getfeaturemodelmanager i feature model ifeaturemodel model manager find feature model findfeaturemodel version model list model list add model i feature child ifeaturechild children model get feature getfeature get included features getincludedfeatures children length add feature and children addfeatureandchildren children get id getid children get version getversion list add feature plugins addfeatureplugins i feature ifeature feature i plugin model base ipluginmodelbase launch plugins launchplugins i feature plugin ifeatureplugin plugins feature get plugins getplugins plugins length string plugins get id getid string version plugins get version getversion version i plugin model base ipluginmodelbase model plugin registry pluginregistry find model findmodel version i match rules imatchrules equivalent model model plugin registry pluginregistry find model findmodel model launch plugins launchplugins model target platform helper targetplatformhelper matches current environment matchescurrentenvironment model launch plugins launchplugins add model string get template config ini gettemplateconfigini string i configuration file info iconfigurationfileinfo info f product fproduct get configuration file info getconfigurationfileinfo info string path info get path getpath find path normal path path info get path getpath path string expanded path expandedpath get expanded path getexpandedpath path expanded path expandedpath file file file expanded path expandedpath file exists file is file isfile file get absolute path getabsolutepath string get expanded path getexpandedpath string path path path length i resource iresource resource pde plugin pdeplugin get workspace getworkspace get root getroot find member findmember path path resource i path ipath full path fullpath resource get location getlocation full path fullpath full path fullpath toosstring i launch configuration ilaunchconfiguration choose configuration chooseconfiguration i launch configuration ilaunchconfiguration configs i debug model presentation idebugmodelpresentation label provider labelprovider debuguitools new debug model presentation newdebugmodelpresentation element list selection dialog elementlistselectiondialog dialog element list selection dialog elementlistselectiondialog pde plugin pdeplugin get active workbench shell getactiveworkbenchshell label provider labelprovider dialog set elements setelements configs dialog set title settitle pde ui messages pdeuimessages runtime workbench shortcut runtimeworkbenchshortcut title f mode fmode equals i launch manager ilaunchmanager debug mode dialog set message setmessage pde ui messages pdeuimessages runtime workbench shortcut runtimeworkbenchshortcut select debug dialog set message setmessage pde ui messages pdeuimessages runtime workbench shortcut runtimeworkbenchshortcut select dialog set multiple selection setmultipleselection result dialog open label provider labelprovider dispose result window i launch configuration ilaunchconfiguration dialog get first result getfirstresult i launch configuration ilaunchconfiguration create configuration createconfiguration core exception coreexception i launch configuration type ilaunchconfigurationtype config type configtype get workbench launch config type getworkbenchlaunchconfigtype string computed name computedname get computed name getcomputedname path f path fpath last segment lastsegment i launch configuration working copy ilaunchconfigurationworkingcopy config type configtype new instance newinstance computed name computedname set attribute setattribute ipde launcher constants ipdelauncherconstants location launch arguments helper launchargumentshelper get default workspace location getdefaultworkspacelocation computed name computedname set attribute setattribute ipde launcher constants ipdelauncherconstants use features usefeatures set attribute setattribute ipde launcher constants ipdelauncherconstants set attribute setattribute ipde launcher constants ipdelauncherconstants doc lear doclear set attribute setattribute ipde constants ipdeconstants doc learlog doclearlog set attribute setattribute ipde constants ipdeconstants append args explicitly set attribute setattribute ipde launcher constants ipdelauncherconstants askclear set attribute setattribute ipde launcher constants ipdelauncherconstants product set attribute setattribute ipde launcher constants ipdelauncherconstants automatic add set attribute setattribute ipde launcher constants ipdelauncherconstants product file f path fpath set attribute setattribute i java launch configuration constants ijavalaunchconfigurationconstants attr source path provider pde source path provider pdesourcepathprovider refresh configuration refreshconfiguration string get computed name getcomputedname string prefix i launch manager ilaunchmanager debug plugin debugplugin get default getdefault get launch manager getlaunchmanager generate launch configuration name generatelaunchconfigurationname prefix i launch configuration ilaunchconfiguration get launch configurations getlaunchconfigurations core exception coreexception array list arraylist i launch configuration ilaunchconfiguration result array list arraylist i launch manager ilaunchmanager manager debug plugin debugplugin get default getdefault get launch manager getlaunchmanager i launch configuration type ilaunchconfigurationtype type manager get launch configuration type getlaunchconfigurationtype eclipse launch shortcut eclipselaunchshortcut configuration type i launch configuration ilaunchconfiguration configs manager get launch configurations getlaunchconfigurations type configs length debuguitools is private isprivate configs string path nls configs get attribute getattribute nls ipde launcher constants ipdelauncherconstants product file nls path f path fpath equals path path result add configs result to array toarray i launch configuration ilaunchconfiguration result size i launch configuration type ilaunchconfigurationtype get workbench launch config type getworkbenchlaunchconfigtype i launch manager ilaunchmanager debug plugin debugplugin get default getdefault get launch manager getlaunchmanager get launch configuration type getlaunchconfigurationtype eclipse launch shortcut eclipselaunchshortcut configuration type