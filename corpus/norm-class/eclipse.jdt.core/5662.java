copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation stephan herrmann contribution bug compiler model incomplete support info java search able environment searchableenvironment org eclipse jdt internal core org eclipse core runtime i path ipath org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime operation canceled exception operationcanceledexception org eclipse jdt core org eclipse jdt core compiler char operation charoperation org eclipse jdt core search org eclipse jdt internal code assist codeassist i search requestor isearchrequestor org eclipse jdt internal compiler env access restriction accessrestriction org eclipse jdt internal compiler env i binary type ibinarytype org eclipse jdt internal compiler env i compilation unit icompilationunit org eclipse jdt internal compiler env i name environment inameenvironment org eclipse jdt internal compiler env i source type isourcetype org eclipse jdt internal compiler env name environment answer nameenvironmentanswer org eclipse jdt internal compiler lookup type constants typeconstants org eclipse jdt internal core search basic search engine basicsearchengine org eclipse jdt internal core search i restricted access constructor requestor irestrictedaccessconstructorrequestor org eclipse jdt internal core search i restricted access type requestor irestrictedaccesstyperequestor org eclipse jdt internal core search indexing index manager indexmanager org eclipse jdt internal core search processing i job ijob org eclipse jdt internal core util util code search able builder environment searchablebuilderenvironment code code assist java model search tool search able environment searchableenvironment i name environment inameenvironment i java search constants ijavasearchconstants name lookup namelookup name lookup namelookup i compilation unit icompilationunit unit to skip unittoskip org eclipse jdt core i compilation unit icompilationunit working copies workingcopies working copy owner workingcopyowner owner java project javaproject project i java search scope ijavasearchscope search scope searchscope check access restrictions checkaccessrestrictions creates search able environment searchableenvironment project search able environment searchableenvironment java project javaproject project org eclipse jdt core i compilation unit icompilationunit working copies workingcopies java model exception javamodelexception project project check access restrictions checkaccessrestrictions java core javacore ignore equals project get option getoption java core javacore compiler forbidden reference java core javacore ignore equals project get option getoption java core javacore compiler discouraged reference working copies workingcopies working copies workingcopies name lookup namelookup project new name lookup newnamelookup working copies workingcopies creates search able environment searchableenvironment project search able environment searchableenvironment java project javaproject project working copy owner workingcopyowner owner java model exception javamodelexception project owner java model manager javamodelmanager get java model manager getjavamodelmanager get working copies getworkingcopies owner add primary wc s wcs owner owner convert search filter to model filter convertsearchfiltertomodelfilter search filter searchfilter search filter searchfilter i java search constants ijavasearchconstants name lookup namelookup accept classes i java search constants ijavasearchconstants name lookup namelookup accept interfaces i java search constants ijavasearchconstants enum name lookup namelookup accept enums i java search constants ijavasearchconstants annotation type name lookup namelookup accept annotations i java search constants ijavasearchconstants enum name lookup namelookup accept classes name lookup namelookup accept enums i java search constants ijavasearchconstants name lookup namelookup accept classes name lookup namelookup accept interfaces name lookup namelookup accept returns type exists code code name environment answer nameenvironmentanswer find string type name typename string package name packagename package name packagename package name packagename i package fragment ipackagefragment owner string source owner find source findsource type name typename package name packagename source i compilation unit icompilationunit basic compilation unit basiccompilationunit source to char array tochararray char operation charoperation split on spliton package name packagename to char array tochararray type name typename util default java extension defaultjavaextension name environment answer nameenvironmentanswer name lookup namelookup answer answer name lookup namelookup find type findtype type name typename package name packagename exact match name lookup namelookup accept check access restrictions checkaccessrestrictions answer construct env answer binary type binarytype answer type binary type binarytype name environment answer nameenvironmentanswer i binary type ibinarytype binary type binarytype answer type get element info getelementinfo answer restriction java model exception javamodelexception npe source type sourcetype retrieve requested type source type element info sourcetypeelementinfo source type sourcetype source type element info sourcetypeelementinfo source type sourcetype answer type get element info getelementinfo i source type isourcetype top level type topleveltype source type sourcetype top level type topleveltype get enclosing type getenclosingtype top level type topleveltype top level type topleveltype get enclosing type getenclosingtype find siblings types declared unit resolution i type itype types source type sourcetype get handle gethandle get compilation unit getcompilationunit get types gettypes i source type isourcetype source types sourcetypes i source type isourcetype types length collection ensure requested type source types sourcetypes source type sourcetype length types length length i source type isourcetype other type othertype i source type isourcetype java element javaelement types get element info getelementinfo check bounds https bugs eclipse org bugs bug cgi other type othertype equals top level type topleveltype length source types sourcetypes other type othertype name environment answer nameenvironmentanswer source types sourcetypes answer restriction get external annotation path getexternalannotationpath answer entry java model exception javamodelexception jme jme is does not exist isdoesnotexist string value of valueof type constants typeconstants info equals type name typename name environment answer nameenvironmentanswer i compilation unit icompilationunit answer type get parent getparent answer restriction string get external annotation path getexternalannotationpath i classpath entry iclasspathentry entry entry i path ipath path classpath entry classpathentry get external annotation path getexternalannotationpath entry project get project getproject path path toosstring find packages start prefix valid prefix qualified separated per iods periods java util packages passed i search requestor isearchrequestor accept package acceptpackage package name packagename find packages findpackages prefix i search requestor isearchrequestor requestor name lookup namelookup see k package fragments seekpackagefragments string prefix search able environment requestor searchableenvironmentrequestor requestor find top level types defined current environment simple matches types passed methods additional types i search requestor isearchrequestor accept type accepttype package name packagename type name typename i search requestor isearchrequestor accept class acceptclass package name packagename type name typename modifiers i search requestor isearchrequestor accept interface acceptinterface package name packagename type name typename modifiers method find member types member types relative enclosing type find exact types findexacttypes find members findmembers search for searchfor i search requestor isearchrequestor storage string exclude path excludepath unit to skip unittoskip unit to skip unittoskip i java element ijavaelement revert model investigation find exact types findexacttypes string storage convert search filter to model filter convertsearchfiltertomodelfilter search for searchfor exclude path excludepath i java element ijavaelement unit to skip unittoskip get path getpath to string tostring exclude path excludepath i progress monitor iprogressmonitor progress monitor progressmonitor i progress monitor iprogressmonitor is canceled iscanceled begin task begintask string total work totalwork method method internal worked internalworked work method is canceled iscanceled is canceled iscanceled set canceled setcanceled is canceled iscanceled set task name settaskname string method sub task subtask string method worked work method i restricted access type requestor irestrictedaccesstyperequestor type requestor typerequestor i restricted access type requestor irestrictedaccesstyperequestor accept type accepttype modifiers package name packagename simple type name simpletypename enclosing type names enclosingtypenames string path access restriction accessrestriction access exclude path excludepath exclude path excludepath equals path find members findmembers enclosing type names enclosingtypenames enclosing type names enclosingtypenames length accept top level types storage accept type accepttype package name packagename simple type name simpletypename enclosing type names enclosingtypenames modifiers access basic search engine basicsearchengine working copies workingcopies search all type names searchalltypenames search pattern searchpattern exact match search pattern searchpattern exact match search for searchfor get search scope getsearchscope type requestor typerequestor cancel ready search progress monitor progressmonitor operation canceled exception operationcanceledexception find exact types findexacttypes string storage convert search filter to model filter convertsearchfiltertomodelfilter search for searchfor java model exception javamodelexception find exact types findexacttypes string storage convert search filter to model filter convertsearchfiltertomodelfilter search for searchfor returns types simple matches code code find exact types findexacttypes string i search requestor isearchrequestor storage type search able environment requestor searchableenvironmentrequestor requestor search able environment requestor searchableenvironmentrequestor storage unit to skip unittoskip project name lookup namelookup name lookup namelookup see k types seektypes type requestor org eclipse jdt internal compiler env i name environment inameenvironment find type findtype name environment answer nameenvironmentanswer find type findtype compound type name compoundtypename compound type name compoundtypename length compound type name compoundtypename length length length find string compound type name compoundtypename length m lengthm length package name packagename length m lengthm system arraycopy compound type name compoundtypename package name packagename length m lengthm find string compound type name compoundtypename length m lengthm char operation charoperation to string tostring package name packagename org eclipse jdt internal compiler env i name environment inameenvironment find type findtype name environment answer nameenvironmentanswer find type findtype package name packagename find string package name packagename package name packagename length char operation charoperation to string tostring package name packagename find top level types defined current environment starts prefix prefix qualified separated per iods periods simple java util types passed methods additional types i search requestor isearchrequestor accept type accepttype package name packagename type name typename i search requestor isearchrequestor accept class acceptclass package name packagename type name typename modifiers i search requestor isearchrequestor accept interface acceptinterface package name packagename type name typename modifiers method find member types member types relative enclosing type find types findtypes prefix find members findmembers camel case match camelcasematch search for searchfor i search requestor isearchrequestor storage find types findtypes prefix find members findmembers camel case match camelcasematch search for searchfor storage completion engine completionengine progress monitor cancel completion operations find top level types defined current environment starts prefix prefix qualified separated per iods periods simple java util types passed methods additional types i search requestor isearchrequestor accept type accepttype package name packagename type name typename i search requestor isearchrequestor accept class acceptclass package name packagename type name typename modifiers i search requestor isearchrequestor accept interface acceptinterface package name packagename type name typename modifiers method find member types member types relative enclosing type find types findtypes prefix find members findmembers camel case match camelcasematch search for searchfor i search requestor isearchrequestor storage i progress monitor iprogressmonitor monitor find types findtypes string prefix storage name lookup namelookup accept classes name lookup namelookup accept interfaces string exclude path excludepath unit to skip unittoskip unit to skip unittoskip i java element ijavaelement revert model investigation find types findtypes string prefix storage convert search filter to model filter convertsearchfiltertomodelfilter search for searchfor exclude path excludepath i java element ijavaelement unit to skip unittoskip get path getpath to string tostring exclude path excludepath last dot index lastdotindex char operation charoperation last index of lastindexof prefix qualification simple name simplename last dot index lastdotindex qualification camel case match camelcasematch simple name simplename prefix simple name simplename char operation charoperation to lower case tolowercase prefix qualification char operation charoperation subarray prefix last dot index lastdotindex camel case match camelcasematch simple name simplename char operation charoperation subarray prefix last dot index lastdotindex prefix length simple name simplename char operation charoperation to lower case tolowercase char operation charoperation subarray prefix last dot index lastdotindex prefix length i progress monitor iprogressmonitor progress monitor progressmonitor i progress monitor iprogressmonitor is canceled iscanceled begin task begintask string total work totalwork method method internal worked internalworked work method is canceled iscanceled is canceled iscanceled set canceled setcanceled is canceled iscanceled set task name settaskname string method sub task subtask string method worked work method i restricted access type requestor irestrictedaccesstyperequestor type requestor typerequestor i restricted access type requestor irestrictedaccesstyperequestor accept type accepttype modifiers package name packagename simple type name simpletypename enclosing type names enclosingtypenames string path access restriction accessrestriction access exclude path excludepath exclude path excludepath equals path find members findmembers enclosing type names enclosingtypenames enclosing type names enclosingtypenames length accept top level types storage accept type accepttype package name packagename simple type name simpletypename enclosing type names enclosingtypenames modifiers access match rule matchrule search pattern searchpattern prefix match camel case match camelcasematch match rule matchrule search pattern searchpattern camelcase match monitor index manager indexmanager index manager indexmanager java model manager javamodelmanager get index manager getindexmanager index manager indexmanager awaiting jobs count awaitingjobscount indexes perform search avoid rebuilt basic search engine basicsearchengine working copies workingcopies search all type names searchalltypenames qualification search pattern searchpattern exact match simple name simplename sensitive match rule matchrule search for searchfor get search scope getsearchscope type requestor typerequestor force search progress monitor progressmonitor indexes ready indexing chance finish small jobs sleeping thread sleep interrupted exception interruptedexception monitor is canceled iscanceled operation canceled exception operationcanceledexception index manager indexmanager awaiting jobs count awaitingjobscount indexes ready perform search avoid rebuilt basic search engine basicsearchengine working copies workingcopies search all type names searchalltypenames qualification search pattern searchpattern exact match simple name simplename sensitive match rule matchrule search for searchfor get search scope getsearchscope type requestor typerequestor force search progress monitor progressmonitor indexes ready types model search request find types findtypes string prefix storage convert search filter to model filter convertsearchfiltertomodelfilter search for searchfor basic search engine basicsearchengine working copies workingcopies search all type names searchalltypenames qualification search pattern searchpattern exact match simple name simplename sensitive match rule matchrule search for searchfor get search scope getsearchscope type requestor typerequestor cancel ready search progress monitor progressmonitor operation canceled exception operationcanceledexception find types findtypes string prefix storage convert search filter to model filter convertsearchfiltertomodelfilter search for searchfor java model exception javamodelexception find types findtypes string prefix storage convert search filter to model filter convertsearchfiltertomodelfilter search for searchfor completion engine completionengine progress monitor cancel completion operations find constructor declarations defined current environment starts prefix prefix qualified separated per iods periods simple java util constructors passed methods i search requestor isearchrequestor accept constructor acceptconstructor find constructor declarations findconstructordeclarations prefix camel case match camelcasematch i search requestor isearchrequestor storage i progress monitor iprogressmonitor monitor string exclude path excludepath unit to skip unittoskip unit to skip unittoskip i java element ijavaelement exclude path excludepath i java element ijavaelement unit to skip unittoskip get path getpath to string tostring exclude path excludepath last dot index lastdotindex char operation charoperation last index of lastindexof prefix qualification simple name simplename last dot index lastdotindex qualification camel case match camelcasematch simple name simplename prefix simple name simplename char operation charoperation to lower case tolowercase prefix qualification char operation charoperation subarray prefix last dot index lastdotindex camel case match camelcasematch simple name simplename char operation charoperation subarray prefix last dot index lastdotindex prefix length simple name simplename char operation charoperation to lower case tolowercase char operation charoperation subarray prefix last dot index lastdotindex prefix length i progress monitor iprogressmonitor progress monitor progressmonitor i progress monitor iprogressmonitor is canceled iscanceled begin task begintask string total work totalwork method method internal worked internalworked work method is canceled iscanceled is canceled iscanceled set canceled setcanceled is canceled iscanceled set task name settaskname string method sub task subtask string method worked work method i restricted access constructor requestor irestrictedaccessconstructorrequestor constructor requestor constructorrequestor i restricted access constructor requestor irestrictedaccessconstructorrequestor accept constructor acceptconstructor modifiers simple type name simpletypename parameter count parametercount signature parameter types parametertypes parameter names parameternames type modifiers typemodifiers package name packagename extra flags extraflags string path access restriction accessrestriction access exclude path excludepath exclude path excludepath equals path storage accept constructor acceptconstructor modifiers simple type name simpletypename parameter count parametercount signature parameter types parametertypes parameter names parameternames type modifiers typemodifiers package name packagename extra flags extraflags path access match rule matchrule search pattern searchpattern prefix match camel case match camelcasematch match rule matchrule search pattern searchpattern camelcase match monitor index manager indexmanager index manager indexmanager java model manager javamodelmanager get index manager getindexmanager wait indexing cancel index manager indexmanager perform concurrent job performconcurrentjob i job ijob override belongs to belongsto string job family jobfamily override cancel job can celled cancelled progress override ensure ready to run ensurereadytorun ready override execute i progress monitor iprogressmonitor progress progress progress is canceled iscanceled override string get job family getjobfamily nls i job ijob wait until ready waituntilready monitor basic search engine basicsearchengine working copies workingcopies search all constructor declarations searchallconstructordeclarations qualification simple name simplename match rule matchrule get search scope getsearchscope constructor requestor constructorrequestor force search progress monitor progressmonitor basic search engine basicsearchengine working copies workingcopies search all constructor declarations searchallconstructordeclarations qualification simple name simplename match rule matchrule get search scope getsearchscope constructor requestor constructorrequestor cancel ready search progress monitor progressmonitor operation canceled exception operationcanceledexception java model exception javamodelexception returns types starts qualified code prefix code code prefix code unqualified types simple matches code prefix code returned find types findtypes string prefix i search requestor isearchrequestor storage type todo david add camel support search able environment requestor searchableenvironmentrequestor requestor search able environment requestor searchableenvironmentrequestor storage unit to skip unittoskip project name lookup namelookup prefix last index of lastindexof name lookup namelookup see k types seektypes prefix type requestor string package name packagename prefix substring java element requestor javaelementrequestor element requestor elementrequestor java element requestor javaelementrequestor name lookup namelookup see k package fragments seekpackagefragments package name packagename element requestor elementrequestor i package fragment ipackagefragment fragments element requestor elementrequestor get package fragments getpackagefragments fragments string class name classname prefix substring length fragments length length fragments name lookup namelookup see k types seektypes class name classname fragments type requestor i java search scope ijavasearchscope get search scope getsearchscope search scope searchscope create search scope visible entry project classpath check access restrictions checkaccessrestrictions search scope searchscope basic search engine basicsearchengine create java search scope createjavasearchscope i java element ijavaelement project search scope searchscope basic search engine basicsearchengine create java search scope createjavasearchscope name lookup namelookup package fragment roots packagefragmentroots search scope searchscope org eclipse jdt internal compiler env i name environment inameenvironment is package ispackage is package ispackage parent package name parentpackagename sub package name subpackagename string pkg name pkgname parent package name parentpackagename pkg name pkgname string string sub package name subpackagename length parent package name parentpackagename length pkg name pkgname string length length pkg name pkgname string parent package name parentpackagename pkg name pkgname length string sub package name subpackagename owner owner is package ispackage pkg name pkgname name lookup namelookup is package ispackage pkg name pkgname returns print able printable string array string to string char tostringchar nls string nls returns print able printable string array string to string char char tostringcharchar names string buffer stringbuffer result string buffer stringbuffer names length result append to string char tostringchar names result to string tostring cleanup