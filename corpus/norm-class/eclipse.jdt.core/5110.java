copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation stephan herrmann contributions bug compiler annotations checking bug edit orial editorial cleanup bug bug bug compiler investigate alternative str ategy strategy int ernally internally encoding nullness defaults org eclipse jdt internal compiler lookup org eclipse jdt core compiler char operation charoperation org eclipse jdt internal compiler util hashtable of package hashtableofpackage org eclipse jdt internal compiler util hashtable of type hashtableoftype package binding packagebinding binding type constants typeconstants values tag bits tagbits tag bits tagbits compound name compoundname package binding packagebinding parent lookup environment lookupenvironment environment hashtable of type hashtableoftype known types knowntypes hashtable of package hashtableofpackage known packages knownpackages code representing defined non null by default nonnullbydefault binding unspecified non null nonnull default nullness defaultnullness package binding packagebinding creating problem package binding packagebinding top level package name toplevelpackagename lookup environment lookupenvironment environment top level package name toplevelpackagename environment create package binding packagebinding compound name compoundname package binding packagebinding parent lookup environment lookupenvironment environment compound name compoundname compound name compoundname parent parent environment environment initialized counts large known types knowntypes counts typically known packages knownpackages hashtable of package hashtableofpackage compound name compoundname char operation charoperation check if null annotation package checkifnullannotationpackage package binding packagebinding lookup environment lookupenvironment environment char operation charoperation environment add not found package addnotfoundpackage simple name simplename known packages knownpackages simple name simplename lookup environment lookupenvironment the not found package thenotfoundpackage add not found type addnotfoundtype simple name simplename known types knowntypes known types knowntypes hashtable of type hashtableoftype known types knowntypes simple name simplename lookup environment lookupenvironment the not found type thenotfoundtype add package addpackage package binding packagebinding element element tag bits tagbits tag bits tagbits has missing type hasmissingtype clear missing tag bit clearmissingtagbit known packages knownpackages element compound name compoundname element compound name compoundname length element add type addtype reference binding referencebinding element element tag bits tagbits tag bits tagbits has missing type hasmissingtype clear missing tag bit clearmissingtagbit known types knowntypes known types knowntypes hashtable of type hashtableoftype element compound name compoundname element compound name compoundname length reference binding referencebinding prior type priortype known types knowntypes get put getput element prior type priortype prior type priortype is unresolved type isunresolvedtype element is unresolved type isunresolvedtype unresolved reference binding unresolvedreferencebinding prior type priortype set resolved type setresolvedtype element environment environment global options globaloptions is annotation based null analysis enabled isannotationbasednullanalysisenabled unresolved types don modifiers element is annotation type isannotationtype element unresolved reference binding unresolvedreferencebinding check if null annotation type checkifnullannotationtype element clear missing tag bit clearmissingtagbit package binding packagebinding current current tag bits tagbits tag bits tagbits has missing type hasmissingtype current current parent slash separated org eclipse jdt core org eclipse jdt core compute unique key computeuniquekey is leaf isleaf char operation charoperation concat with concatwith compound name compoundname package binding packagebinding find package findpackage environment is package ispackage compound name compoundname sub pkg compound name subpkgcompoundname char operation charoperation array concat arrayconcat compound name compoundname package binding packagebinding sub package binding subpackagebinding package binding packagebinding sub pkg compound name subpkgcompoundname environment add package addpackage sub package binding subpackagebinding sub package binding subpackagebinding answer sub package subpackage named oracle cache answer resolved note type package binding packagebinding get package getpackage package binding packagebinding binding get package getpackage binding binding lookup environment lookupenvironment the not found package thenotfoundpackage binding binding find package findpackage binding remember problem binding cache look ups lookups add not found package addnotfoundpackage answer sub package subpackage named exists cache answer the not found package thenotfoundpackage resolved time looked answer note send ers senders convert the not found package thenotfoundpackage real problem returned package binding packagebinding get package getpackage known packages knownpackages answer type named oracle type cache answer not visible notvisible problem type type visible invocation package invocationpackage answer resolved note source types scopes reference binding referencebinding get type gettype reference binding referencebinding reference binding referencebinding get type gettype reference binding referencebinding reference binding referencebinding environment ask for type askfortype remember problem type binding cache look ups lookups add not found type addnotfoundtype reference binding referencebinding lookup environment lookupenvironment the not found type thenotfoundtype reference binding referencebinding reference binding referencebinding binary type binding binarytypebinding resolve type resolvetype reference binding referencebinding environment reference binding referencebinding is nested type isnestedtype problem reference binding problemreferencebinding reference binding referencebinding problem reasons problemreasons internal name provided internalnameprovided reference binding referencebinding answer type named exists cache answer the not found type thenotfoundtype resolved time looked answer note send ers senders convert the not found type thenotfoundtype real problem reference type returned reference binding referencebinding get type gettype known types knowntypes known types knowntypes answer type named oracle cache answer resolved collisions exist type answer type treat exist problem reported type defined note visibility checks performed source types scopes binding get type or package gettypeorpackage reference binding referencebinding reference binding referencebinding get type gettype reference binding referencebinding reference binding referencebinding lookup environment lookupenvironment the not found type thenotfoundtype reference binding referencebinding reference binding referencebinding binary type binding binarytypebinding resolve type resolvetype reference binding referencebinding environment raw conversion reference binding referencebinding is nested type isnestedtype problem reference binding problemreferencebinding reference binding referencebinding problem reasons problemreasons internal name provided internalnameprovided reference binding referencebinding tag bits tagbits tag bits tagbits has missing type hasmissingtype reference binding referencebinding reference binding referencebinding missing type missingtype package binding packagebinding package binding packagebinding get package getpackage package binding packagebinding package binding packagebinding lookup environment lookupenvironment the not found package thenotfoundpackage package binding packagebinding looked package binding packagebinding package binding packagebinding find package findpackage package binding packagebinding reference binding referencebinding reference binding referencebinding lookup environment lookupenvironment the not found type thenotfoundtype cached missing type check conflict reference binding referencebinding add not found package addnotfoundpackage looked reference binding referencebinding search secondary types triggered requires parse classes reference binding referencebinding environment ask for type askfortype reference binding referencebinding is nested type isnestedtype problem reference binding problemreferencebinding reference binding referencebinding problem reasons problemreasons internal name provided internalnameprovided reference binding referencebinding add problem binding collect ions collections reported error time add not found type addnotfoundtype is viewed as deprecated isviewedasdeprecated tag bits tagbits tag bits tagbits deprecated annotation resolved deprecatedannotationresolved tag bits tagbits tag bits tagbits deprecated annotation resolved deprecatedannotationresolved compound name compoundname char operation charoperation reference binding referencebinding package info packageinfo get type gettype type constants typeconstants info package info packageinfo package info packageinfo initialize deprecated annotation tag bits initializedeprecatedannotationtagbits tag bits tagbits package info packageinfo tag bits tagbits tag bits tagbits all standard annotations mask allstandardannotationsmask tag bits tagbits tag bits tagbits annotation deprecated annotationdeprecated api answer receiver binding type binding bindingid kind binding problem id problemid tag bits tagbits tag bits tagbits has missing type hasmissingtype problem reasons problemreasons not found notfound problem reasons problemreasons no error noerror check if null annotation package checkifnullannotationpackage lookup environment lookupenvironment env environment env global options globaloptions is annotation based null analysis enabled isannotationbasednullanalysisenabled is package of qualified type name ispackageofqualifiedtypename compound name compoundname env get nullable annotation name getnullableannotationname env null able annotation package nullableannotationpackage is package of qualified type name ispackageofqualifiedtypename compound name compoundname env get non null annotation name getnonnullannotationname env nonnull annotation package nonnullannotationpackage is package of qualified type name ispackageofqualifiedtypename compound name compoundname env get non null by default annotation name getnonnullbydefaultannotationname env nonnull by default annotation package nonnullbydefaultannotationpackage is package of qualified type name ispackageofqualifiedtypename package name packagename type name typename length type name typename length package name packagename length type name typename length length char operation charoperation equals package name packagename type name typename check if null annotation type checkifnullannotationtype reference binding referencebinding type mark type type bit typebit environment null able annotation package nullableannotationpackage char operation charoperation equals type compound name compoundname environment get nullable annotation name getnullableannotationname type type bits typebits type ids typeids bit nullable annotation bitnullableannotation unresolved check resolved type type unresolved reference binding unresolvedreferencebinding don check environment null able annotation package nullableannotationpackage environment nonnull annotation package nonnullannotationpackage char operation charoperation equals type compound name compoundname environment get non null annotation name getnonnullannotationname type type bits typebits type ids typeids bit non null annotation bitnonnullannotation unresolved check resolved type type unresolved reference binding unresolvedreferencebinding don check environment nonnull annotation package nonnullannotationpackage environment nonnull by default annotation package nonnullbydefaultannotationpackage char operation charoperation equals type compound name compoundname environment get non null by default annotation name getnonnullbydefaultannotationname type type bits typebits type ids typeids bit non null by default annotation bitnonnullbydefaultannotation unresolved check resolved type type unresolved reference binding unresolvedreferencebinding don check environment nonnull by default annotation package nonnullbydefaultannotationpackage type type bits typebits environment get null annotation bit getnullannotationbit type compound name compoundname readable name readablename java lang char operation charoperation concat with concatwith compound name compoundname string to string tostring string str compound name compoundname char operation charoperation nls str nls nls str compound name compoundname char operation charoperation to string tostring compound name compoundname unnamed tag bits tagbits tag bits tagbits has missing type hasmissingtype nls str missing str