copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde tests target java java net uri java net url java util javax xml parsers document builder documentbuilder javax xml parsers document builder factory documentbuilderfactory junit framework test junit framework test suite testsuite org eclipse core file system filesystem uri util uriutil org eclipse core runtime org eclipse equinox metadata i installable unit iinstallableunit org eclipse equinox query i query result iqueryresult org eclipse equinox query query util queryutil org eclipse equinox repository metadata i metadata repository imetadatarepository org eclipse equinox repository metadata i metadata repository manager imetadatarepositorymanager org eclipse pde core plugin i plugin model base ipluginmodelbase org eclipse pde core target org eclipse pde internal core pde core pdecore org eclipse pde internal core target org eclipse pde tests pde tests plugin pdetestsplugin org dom document org dom element org xml sax input source inputsource org xml sax helpers default handler defaulthandler tests bundle container i u bundle container tests iubundlecontainertests abstract target test abstracttargettest test suite test suite testsuite i u bundle container tests iubundlecontainertests returns metadata repository location param uri location metadata repository location exception i metadata repository imetadatarepository get repository getrepository uri uri exception i metadata repository manager imetadatarepositorymanager manager target utils targetutils get repo manager getrepomanager assert not null assertnotnull missing metadata repository manager manager i metadata repository imetadatarepository repo manager load repository loadrepository uri repo returns uri test plug relative path param relative path relativepath test plug relative path uri exception uri geturi string relative path relativepath exception url url pde tests plugin pdetestsplugin get bundle context getbundlecontext get bundle getbundle get entry getentry relative path relativepath path path path file file locator filelocator tofileurl url get file getfile get absolute path getabsolutepath uri util uriutil touri path returns install able installable unit repository identifier param unit identifier param repository repository install able installable unit i installable unit iinstallableunit get unit getunit string i metadata repository imetadatarepository repository i query result iqueryresult result repository query query util queryutil createiuquery i installable unit iinstallableunit units i installable unit iinstallableunit result to array toarray i installable unit iinstallableunit units length units assert true asserttrue find test resolve using profile testresolveusingprofile exception string features string feature feature group string features string feature feature group string expected bundles expectedbundles string bundle bundle bundle bundle bundle bundle string expected bundles expectedbundles string bundle bundle bundle create target references high level root i u bundle container iubundlecontainer container create container createcontainer features i target definition itargetdefinition target get target service gettargetservice new target newtarget target set target locations settargetlocations i target location itargetlocation container list infos get all bundle infos getallbundleinfos target names collect all symbolic names collectallsymbolicnames infos assert equals assertequals expected bundles expectedbundles length infos size string expected bundle expectedbundle expected bundles expectedbundles assert true asserttrue missing expected bundle expectedbundle names expected bundle expectedbundle modify target level root extra higher level stuff removed container create container createcontainer features target set target locations settargetlocations i target location itargetlocation container infos get all bundle infos getallbundleinfos target names collect all symbolic names collectallsymbolicnames infos assert equals assertequals expected bundles expectedbundles length infos size string element expected bundles expectedbundles assert true asserttrue missing element names element list profiles target utils targetutils clean orphaned target definition profiles cleanorphanedtargetdefinitionprofiles assert equals assertequals profiles size string string profiles assert true asserttrue unexpected profile ends with endswith target get handle gethandle get memento getmemento clean profiles test failed prevent cascading failures target utils targetutils clean orphaned target definition profiles cleanorphanedtargetdefinitionprofiles tests bundles resolved feature required feature exception test resolve required features testresolverequiredfeatures exception string bundles string bundle bundle bundle bundle bundle bundle do resolution test doresolutiontest string feature feature group bundles tests bundles resolved single feature exception test resolve single feature testresolvesinglefeature exception string bundles string bundle bundle bundle do resolution test doresolutiontest string feature feature group bundles tests bundles resolved bundle required bundles exception test resolve required bundles testresolverequiredbundles exception string bundles string bundle bundle bundle bundle do resolution test doresolutiontest string bundle bundles tests bundle resolved required bundles exception test resolve single bundle testresolvesinglebundle exception string bundles string bundle do resolution test doresolutiontest string bundle bundles tests contents equal exception test content equal non null testcontentequalnonnull exception i u bundle container iubundlecontainer create container createcontainer string bundle bundle i u bundle container iubundlecontainer create container createcontainer string bundle bundle assert true asserttrue contents equivalent equals tests contents equal exception test content not equal non null testcontentnotequalnonnull exception i u bundle container iubundlecontainer create container createcontainer string bundle bundle i u bundle container iubundlecontainer create container createcontainer string bundle bundle assert false assertfalse contents equivalent equals tests contents equal exception test content equal null testcontentequalnull exception i target platform service itargetplatformservice service get target service gettargetservice i u bundle container iubundlecontainer i u bundle container iubundlecontainer service newiulocation string bundle bundle string i u bundle container iubundlecontainer i u bundle container iubundlecontainer service newiulocation string bundle bundle string assert true asserttrue contents equivalent equals tests contents equal exception test content not equal null testcontentnotequalnull exception i target platform service itargetplatformservice service get target service gettargetservice i u bundle container iubundlecontainer i u bundle container iubundlecontainer service newiulocation string bundle bundle string i u bundle container iubundlecontainer i u bundle container iubundlecontainer service newiulocation string bundle bundle string assert false assertfalse contents equivalent equals creates bundle container res olves resolves contents ensures bundles param unit ids unitids identifiers add container param bundle ids bundleids symbolic names bundles resolution exception do resolution test doresolutiontest string unit ids unitids string bundle ids bundleids exception i u bundle container iubundlecontainer container create container createcontainer unit ids unitids i target definition itargetdefinition target get target service gettargetservice new target newtarget target set target locations settargetlocations i target location itargetlocation container list infos get all bundle infos getallbundleinfos target names collect all symbolic names collectallsymbolicnames infos assert equals assertequals bundle ids bundleids length infos size string bundle id bundleid bundle ids bundleids assert true asserttrue missing bundle id bundleid names bundle id bundleid list profiles target utils targetutils clean orphaned target definition profiles cleanorphanedtargetdefinitionprofiles assert equals assertequals profiles size string string profiles assert true asserttrue unexpected profile ends with endswith target get handle gethandle get memento getmemento clean profiles test failed prevent cascading failures target utils targetutils clean orphaned target definition profiles cleanorphanedtargetdefinitionprofiles creates bundle container per sists persists rest ores restores param unit ids unitids identifiers add container param bundle ids bundleids ids resolved bundles expected exception do per sistance test dopersistancetest string unit ids unitids string bundle ids bundleids exception i u bundle container iubundlecontainer container create container createcontainer unit ids unitids i target definition itargetdefinition target get target service gettargetservice new target newtarget target set target locations settargetlocations i target location itargetlocation container byte array output stream bytearrayoutputstream output stream outputstream byte array output stream bytearrayoutputstream target definition persistence helper targetdefinitionpersistencehelper persistxml target output stream outputstream i target definition itargetdefinition definition b definitionb get target service gettargetservice new target newtarget byte array input stream bytearrayinputstream input stream inputstream byte array input stream bytearrayinputstream output stream outputstream to byte array tobytearray target definition persistence helper targetdefinitionpersistencehelper initfromxml definition b definitionb input stream inputstream assert true asserttrue target content equal target definition targetdefinition target is content equal iscontentequal definition b definitionb resolve restored target ensure bundles correct list infos get all bundle infos getallbundleinfos definition b definitionb names collect all symbolic names collectallsymbolicnames infos assert equals assertequals bundle ids bundleids length infos size string bundle id bundleid bundle ids bundleids assert true asserttrue missing bundle id bundleid names bundle id bundleid list profiles target utils targetutils clean orphaned target definition profiles cleanorphanedtargetdefinitionprofiles assert equals assertequals profiles size string string profiles assert true asserttrue unexpected profile ends with endswith definition b definitionb get handle gethandle get memento getmemento tests external model manager restore external bundles bundle pool properly bug exception test external model manager preferences testexternalmodelmanagerpreferences exception active target feature bundles string unit ids unitids string feature feature group i u bundle container iubundlecontainer container create container createcontainer unit ids unitids i target definition itargetdefinition target b targetb get target service gettargetservice new target newtarget target b targetb set target locations settargetlocations i target location itargetlocation container get target service gettargetservice save target definition savetargetdefinition target b targetb set target platform settargetplatform target b targetb active target feature bundles unit ids unitids string feature feature group container create container createcontainer unit ids unitids i target definition itargetdefinition target a targeta get target service gettargetservice new target newtarget target a targeta set target locations settargetlocations i target location itargetlocation container get target service gettargetservice save target definition savetargetdefinition target a targeta set target platform settargetplatform target a targeta ensure external model manager bundles target i plugin model base ipluginmodelbase external bundles externalbundles pde core pdecore get default getdefault get model manager getmodelmanager get external model manager getexternalmodelmanager get all models getallmodels assert equals assertequals wrong number external bundles external bundles externalbundles length expected bundles expected hash set hashset expected add bundle expected add bundle expected add bundle i plugin model base ipluginmodelbase external bundle externalbundle external bundles externalbundles assert true asserttrue unexpected bundle restored list external bundle externalbundle get install location getinstalllocation expected remove external bundle externalbundle get bundle description getbundledescription get name getname assert true asserttrue expected is empty isempty reset target platform resettargetplatform creates bundle container i us ius test repository param unit ids unitids identifiers add container bundle container exception i u bundle container iubundlecontainer create container createcontainer string unit ids unitids exception uri uri geturi tests sites site i installable unit iinstallableunit units get units getunits unit ids unitids uri create container createcontainer units uri uri i u bundle container iubundlecontainer include required i installable unit iinstallableunit get units getunits string unit ids unitids uri uri exception i metadata repository imetadatarepository repository get repository getrepository uri i installable unit iinstallableunit units i installable unit iinstallableunit unit ids unitids length unit ids unitids length units get unit getunit unit ids unitids repository units creates returns bundle container repositories param units param repositories locations repositories param flags location flags bundle container exception i u bundle container iubundlecontainer create container createcontainer i installable unit iinstallableunit units uri repositories flags exception i u bundle container iubundlecontainer get target service gettargetservice newiulocation units repositories flags tests target definition containers serialized xml deserialized loss data exception test per sist definition testpersistiudefinition exception string bundles string bundle bundle bundle do per sistance test dopersistancetest string feature feature group bundles tests target definition containers serialized xml deserialized loss data exception test per sist multiple definition testpersistmultipleiudefinition exception string bundles string bundle bundle bundle bundle bundle bundle do per sistance test dopersistancetest string bundle bundle bundles increment ally incrementally adding i us ius target exception test add us testaddius exception i u bundle container iubundlecontainer create container createcontainer string feature feature group i target definition itargetdefinition target get target service gettargetservice new target newtarget target set target locations settargetlocations i u bundle container iubundlecontainer i status istatus resolve target resolve assert true asserttrue resolve isok get target service gettargetservice save target definition savetargetdefinition target i target handle itargethandle handle target get handle gethandle unresolved copy target target handle get target definition gettargetdefinition i u bundle container iubundlecontainer create container createcontainer string feature feature group target set target locations settargetlocations i u bundle container iubundlecontainer list infos get all bundle infos getallbundleinfos target names collect all symbolic names collectallsymbolicnames infos string bundle ids bundleids string bundle bundle bundle bundle bundle bundle assert equals assertequals bundle ids bundleids length infos size string bundle id bundleid bundle ids bundleids assert true asserttrue missing bundle id bundleid names bundle id bundleid get target service gettargetservice delete target deletetarget target get handle gethandle list profiles target utils targetutils clean orphaned target definition profiles cleanorphanedtargetdefinitionprofiles assert equals assertequals profiles size increment ally incrementally removing i us ius target exception test remove us testremoveius exception i u bundle container iubundlecontainer create container createcontainer string feature feature group i target definition itargetdefinition target get target service gettargetservice new target newtarget target set target locations settargetlocations i u bundle container iubundlecontainer i status istatus resolve target resolve assert true asserttrue resolve isok get target service gettargetservice save target definition savetargetdefinition target i target handle itargethandle handle target get handle gethandle unresolved copy target target handle get target definition gettargetdefinition i u bundle container iubundlecontainer create container createcontainer string feature feature group target set target locations settargetlocations i u bundle container iubundlecontainer list infos get all bundle infos getallbundleinfos target names collect all symbolic names collectallsymbolicnames infos string bundle ids bundleids string bundle bundle bundle assert equals assertequals bundle ids bundleids length infos size string bundle id bundleid bundle ids bundleids assert true asserttrue missing bundle id bundleid names bundle id bundleid get target service gettargetservice delete target deletetarget target get handle gethandle list profiles target utils targetutils clean orphaned target definition profiles cleanorphanedtargetdefinitionprofiles assert equals assertequals profiles size tests over lapping overlapping containers exception test over lapping containers testoverlappingiucontainers exception i u bundle container iubundlecontainer create container createcontainer string feature feature group i u bundle container iubundlecontainer create container createcontainer string feature feature group i target definition itargetdefinition target get target service gettargetservice new target newtarget target set target locations settargetlocations i u bundle container iubundlecontainer i status istatus resolve target resolve assert true asserttrue resolve isok list infos get bundle infos getbundleinfos names collect all symbolic names collectallsymbolicnames infos string bundle ids bundleids string bundle bundle bundle assert equals assertequals bundle ids bundleids length infos size string bundle id bundleid bundle ids bundleids assert true asserttrue missing bundle id bundleid names bundle id bundleid infos get bundle infos getbundleinfos names collect all symbolic names collectallsymbolicnames infos bundle ids bundleids string bundle bundle bundle bundle bundle bundle assert equals assertequals bundle ids bundleids length infos size string bundle id bundleid bundle ids bundleids assert true asserttrue missing bundle id bundleid names bundle id bundleid list profiles target utils targetutils clean orphaned target definition profiles cleanorphanedtargetdefinitionprofiles assert equals assertequals profiles size test serialization testserialization exception uri uri geturi tests sites site string unit ids unitids string feature feature group i installable unit iinstallableunit units get units getunits unit ids unitids uri i u bundle container iubundlecontainer location create container createcontainer units uri uri i u bundle container iubundlecontainer include environments string xml location serialize assert include all platform assertincludeallplatform xml assert include mode assertincludemode xml slicer assert include source assertincludesource xml deserialization test deserializationtest location test serialization testserialization exception i u bundle container iubundlecontainer location create container createcontainer string bundle bundle string xml location serialize assert include all platform assertincludeallplatform xml assert include mode assertincludemode xml planner assert include source assertincludesource xml deserialization test deserializationtest location test serialization testserialization exception uri uri geturi tests sites site string unit ids unitids string feature feature group i installable unit iinstallableunit units get units getunits unit ids unitids uri i u bundle container iubundlecontainer location create container createcontainer units uri uri i u bundle container iubundlecontainer include environments i u bundle container iubundlecontainer include source string xml location serialize assert include all platform assertincludeallplatform xml assert include mode assertincludemode xml slicer assert include source assertincludesource xml deserialization test deserializationtest location deserialization test deserializationtest i u bundle container iubundlecontainer location exception i target definition itargetdefinition get target service gettargetservice new target newtarget set target locations settargetlocations i target location itargetlocation location byte array output stream bytearrayoutputstream byte array output stream bytearrayoutputstream target definition persistence helper targetdefinitionpersistencehelper persistxml string xml string to byte array tobytearray document builder documentbuilder parser document builder factory documentbuilderfactory new instance newinstance new document builder newdocumentbuilder parser set error handler seterrorhandler default handler defaulthandler document doc parser parse input source inputsource byte array input stream bytearrayinputstream xml get bytes getbytes utf i target definition itargetdefinition definition get target service gettargetservice new target newtarget element root doc get document element getdocumentelement target persistence targetpersistence helper init from doc initfromdoc definition root i target location itargetlocation locations definition get target locations gettargetlocations assert equals assertequals locations length assert true asserttrue locations i u bundle container iubundlecontainer assert true asserttrue i u bundle container iubundlecontainer locations equals location assert include all platform assertincludeallplatform string xml expected value expectedvalue assert token asserttoken xml include all platforms includeallplatforms string value of valueof expected value expectedvalue assert include source assertincludesource string xml expected value expectedvalue assert token asserttoken xml include source includesource string value of valueof expected value expectedvalue assert include mode assertincludemode string xml string expected value expectedvalue assert token asserttoken xml include mode includemode expected value expectedvalue assert token asserttoken string xml string token string expected value expectedvalue start xml index of indexof token token length string actual value actualvalue xml substring start start string value of valueof expected value expectedvalue length assert equals assertequals string value of valueof expected value expectedvalue actual value actualvalue