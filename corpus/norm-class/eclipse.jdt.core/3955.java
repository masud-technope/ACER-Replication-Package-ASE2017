copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal core org eclipse jdt core binding key bindingkey org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i field ifield org eclipse jdt core i java element ijavaelement org eclipse jdt core i member imember org eclipse jdt core i method imethod org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i type itype org eclipse jdt core i type parameter itypeparameter org eclipse jdt core java model exception javamodelexception org eclipse jdt core signature org eclipse jdt core working copy owner workingcopyowner org eclipse jdt core compiler categorized problem categorizedproblem org eclipse jdt core compiler char operation charoperation org eclipse jdt internal code assist codeassist i selection requestor iselectionrequestor org eclipse jdt internal code assist codeassist selection engine selectionengine name d member namedmember member element empty code string code element string name d member namedmember java element javaelement parent string parent append type parameters appendtypeparameters string buffer stringbuffer buffer java model exception javamodelexception i type parameter itypeparameter type parameters typeparameters get type parameters gettypeparameters length type parameters typeparameters length length buffer append length i type parameter itypeparameter type parameter typeparameter type parameters typeparameters buffer append type parameter typeparameter get element name getelementname string bounds type parameter typeparameter get bounds getbounds bounds length boundslength bounds length bounds length boundslength nls buffer append nls bounds length boundslength buffer append bounds bounds length boundslength nls buffer append length nls buffer append nls buffer append string get element name getelementname string get key getkey i field ifield field force open forceopen java model exception javamodelexception string buffer stringbuffer key string buffer stringbuffer declaring string declaring key declaringkey get key getkey i type itype field get parent getparent force open forceopen key append declaring key declaringkey field key append key append field get element name getelementname key to string tostring string get key getkey i method imethod method force open forceopen java model exception javamodelexception string buffer stringbuffer key string buffer stringbuffer declaring string declaring key declaringkey get key getkey i type itype method get parent getparent force open forceopen key append declaring key declaringkey selector key append string selector method get element name getelementname key append selector type parameters force open forceopen i type parameter itypeparameter type parameters typeparameters method get type parameters gettypeparameters length type parameters typeparameters length length key append length i type parameter itypeparameter type parameter typeparameter type parameters typeparameters string bounds type parameter typeparameter get bounds getbounds bounds length boundslength bounds length bound signatures boundsignatures bounds length boundslength bounds length boundslength bound signatures boundsignatures signature create char array type signature createchararraytypesignature bounds to char array tochararray method is binary isbinary char operation charoperation replace bound signatures boundsignatures sig signature create type parameter signature createtypeparametersignature type parameter typeparameter get element name getelementname to char array tochararray bound signatures boundsignatures key append sig key append parameters key append string parameters method get parameter types getparametertypes length parameters length length key append parameters replace key append type force open forceopen key append method get return type getreturntype replace key append key to string tostring string get key getkey i type itype type force open forceopen java model exception javamodelexception string buffer stringbuffer key string buffer stringbuffer key append string package name packagename type get package fragment getpackagefragment get element name getelementname key append package name packagename replace package name packagename length key append string type qualified name typequalifiedname type get type qualified name gettypequalifiedname i compilation unit icompilationunit i compilation unit icompilationunit type get ancestor getancestor i java element ijavaelement compilation unit string cu name cuname get element name getelementname string main type name maintypename cu name cuname substring cu name cuname last index of lastindexof type qualified name typequalifiedname index of indexof type qualified name typequalifiedname length string top level type name topleveltypename type qualified name typequalifiedname substring main type name maintypename equals top level type name topleveltypename key append main type name maintypename key append key append type qualified name typequalifiedname key append key to string tostring string get fully qualified parameterized name getfullyqualifiedparameterizedname string fully qualified name fullyqualifiedname string unique key uniquekey java model exception javamodelexception string type arguments typearguments binding key bindingkey unique key uniquekey get type arguments gettypearguments length type arguments typearguments length length fully qualified name fullyqualifiedname string buffer stringbuffer buffer string buffer stringbuffer buffer append fully qualified name fullyqualifiedname buffer append length string type argument typeargument type arguments typearguments buffer append signature to string tostring type argument typeargument length buffer append buffer append buffer to string tostring i package fragment ipackagefragment get package fragment getpackagefragment string get fully qualified name getfullyqualifiedname enclosing type separator enclosingtypeseparator show parameters showparameters java model exception javamodelexception string package name packagename get package fragment getpackagefragment get element name getelementname package name packagename equals i package fragment ipackagefragment get type qualified name gettypequalifiedname enclosing type separator enclosingtypeseparator show parameters showparameters package name packagename get type qualified name gettypequalifiedname enclosing type separator enclosingtypeseparator show parameters showparameters string get type qualified name gettypequalifiedname enclosing type separator enclosingtypeseparator show parameters showparameters java model exception javamodelexception name d member namedmember declaring type declaringtype parent get element type getelementtype i java element ijavaelement compilation unit show parameters showparameters string buffer stringbuffer buffer string buffer stringbuffer append type parameters appendtypeparameters buffer buffer to string tostring i java element ijavaelement file string class file name classfilename parent get element name getelementname string type name typename class file name classfilename index of indexof top level file type file type name typename anonymous local file type name typename class file name classfilename substring class file name classfilename last index of lastindexof remove replace enclosing type separator enclosingtypeseparator show parameters showparameters string buffer stringbuffer buffer string buffer stringbuffer type name typename append type parameters appendtypeparameters buffer buffer to string tostring type name typename i java element ijavaelement type declaring type declaringtype name d member namedmember parent i java element ijavaelement field i java element ijavaelement initializer i java element ijavaelement method declaring type declaringtype name d member namedmember i member imember parent get declaring type getdeclaringtype string buffer stringbuffer buffer string buffer stringbuffer declaring type declaringtype get type qualified name gettypequalifiedname enclosing type separator enclosingtypeseparator show parameters showparameters buffer append enclosing type separator enclosingtypeseparator string simple name simplename length get occurrence count signature getoccurrencecountsignature buffer append simple name simplename show parameters showparameters append type parameters appendtypeparameters buffer buffer to string tostring returns string representation occurrence count element occurrence count unique number representation identify element occurrence count element form string string get occurrence count signature getoccurrencecountsignature integer to string tostring occurrence count occurrencecount i type parameter itypeparameter get type parameters gettypeparameters java model exception javamodelexception i type itype resolve type resolvetype string string resolve type resolvetype string type name typename java model exception javamodelexception resolve type resolvetype type name typename default working copy owner defaultworkingcopyowner primary i type itype resolve type resolvetype string working copy owner workingcopyowner string resolve type resolvetype string type name typename working copy owner workingcopyowner owner java model exception javamodelexception java project javaproject project java project javaproject get java project getjavaproject search able environment searchableenvironment environment project new search able name environment newsearchablenameenvironment owner type resolve requestor typeresolverequestor i selection requestor iselectionrequestor string answers accept type accepttype package name packagename t name tname modifiers is declaration isdeclaration unique key uniquekey start string answer string string package name packagename string t name tname answers answers string answer grow length answers length system arraycopy answers answers string length length answers length answer accept error accepterror categorized problem categorizedproblem error ignore accept field acceptfield declaring type package name declaringtypepackagename declaring type name declaringtypename field name fieldname is declaration isdeclaration unique key uniquekey start ignore accept method acceptmethod declaring type package name declaringtypepackagename declaring type name declaringtypename string enclosing declaring type signature enclosingdeclaringtypesignature selector parameter package names parameterpackagenames parameter type names parametertypenames string parameter signatures parametersignatures type parameter names typeparameternames type parameter bound names typeparameterboundnames is constructor isconstructor is declaration isdeclaration unique key uniquekey start ignore accept package acceptpackage package name packagename ignore accept type parameter accepttypeparameter declaring type package name declaringtypepackagename declaring type name declaringtypename type parameter name typeparametername is declaration isdeclaration start ignore accept method type parameter acceptmethodtypeparameter declaring type package name declaringtypepackagename declaring type name declaringtypename selector selector start selectorstart sel cetor end selcetorend type parameter name typeparametername is declaration isdeclaration start ignore type resolve requestor typeresolverequestor requestor type resolve requestor typeresolverequestor selection engine selectionengine engine selection engine selectionengine environment requestor project get options getoptions owner engine select type selecttype type name typename to char array tochararray i type itype name lookup namelookup verbose nls nls system println thread current thread currentthread time spent name loop kup nameloopkup see k types in source package seektypesinsourcepackage environment name lookup namelookup time spent in see k types in source package timespentinseektypesinsourcepackage nls nls system println thread current thread currentthread time spent name loop kup nameloopkup see k types in binary package seektypesinbinarypackage environment name lookup namelookup time spent in see k types in binary package timespentinseektypesinbinarypackage requestor answers