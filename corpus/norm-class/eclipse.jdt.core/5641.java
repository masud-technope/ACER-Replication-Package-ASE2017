copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal core search matching org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime sub monitor submonitor org eclipse jdt core org eclipse jdt core compiler char operation charoperation org eclipse jdt core search org eclipse jdt internal compiler ast visitor astvisitor org eclipse jdt internal compiler compilation result compilationresult org eclipse jdt internal compiler ast org eclipse jdt internal compiler ast initializer org eclipse jdt internal compiler env access rule set accessruleset org eclipse jdt internal compiler lookup org eclipse jdt internal compiler problem abort compilation abortcompilation org eclipse jdt internal core org eclipse jdt internal core search org eclipse jdt internal core search indexing i index constants iindexconstants org eclipse jdt internal core search indexing index manager indexmanager org eclipse jdt internal core util ast node finder astnodefinder org eclipse jdt internal core util util collects type names declaring type returns declaring type declaring type returns declaring type pattern doesn require exact match super type names collector supertypenamescollector ast visitor visits type declarations member type declarations collecting type names type declaration visitor typedeclarationvisitor ast visitor astvisitor visit type declaration typedeclaration type declaration typedeclaration block scope blockscope scope reference binding referencebinding binding type declaration typedeclaration binding super type names collector supertypenamescollector matches binding collect super type names collectsupertypenames binding binding compound name compoundname visit type declaration typedeclaration type declaration typedeclaration compilation unit scope compilationunitscope scope reference binding referencebinding binding type declaration typedeclaration binding super type names collector supertypenamescollector matches binding collect super type names collectsupertypenames binding binding compound name compoundname visit type declaration typedeclaration member type declaration membertypedeclaration class scope classscope scope reference binding referencebinding binding member type declaration membertypedeclaration binding super type names collector supertypenamescollector matches binding collect super type names collectsupertypenames binding binding compound name compoundname visit field declaration fielddeclaration field declaration fielddeclaration method scope methodscope scope don visit field declarations visit initializer initializer method scope methodscope scope don visit initializers visit constructor declaration constructordeclaration constructor declaration constructordeclaration class scope classscope scope don visit constructor declarations visit method declaration methoddeclaration method declaration methoddeclaration class scope classscope scope don visit method declarations search pattern searchpattern pattern type simple name typesimplename type qualification typequalification match locator matchlocator locator i type itype type i progress monitor iprogressmonitor progress monitor progressmonitor result result index resultindex focus same package super type name samepackagesupertypename same package index samepackageindex super type names collector supertypenamescollector search pattern searchpattern pattern type simple name typesimplename type qualification typequalification match locator matchlocator locator i type itype type i progress monitor iprogressmonitor progress monitor progressmonitor pattern pattern type simple name typesimplename type simple name typesimplename type qualification typequalification type qualification typequalification locator locator type type progress monitor progressmonitor progress monitor progressmonitor add if same package addifsamepackage compound name compoundname path compound name compoundname length path length result length resultlength same package super type name samepackagesupertypename length result length resultlength char operation charoperation equals same package super type name samepackagesupertypename compound name compoundname length compound name compoundname length length char operation charoperation equals compound name compoundname path result length resultlength same package index samepackageindex system arraycopy same package super type name samepackagesupertypename same package super type name samepackagesupertypename result length resultlength result length resultlength same package super type name samepackagesupertypename same package index samepackageindex compound name compoundname add to result addtoresult compound name compoundname result length resultlength result length result length resultlength char operation charoperation equals result compound name compoundname result length resultlength result index resultindex system arraycopy result result result length resultlength result length resultlength result result index resultindex compound name compoundname parse compilation unit build type bindings compilation unit declaration compilationunitdeclaration build bindings buildbindings i compilation unit icompilationunit compilation unit compilationunit is top level or member istoplevelormember java model exception javamodelexception source unit org eclipse jdt internal compiler env i compilation unit icompilationunit source unit sourceunit org eclipse jdt internal compiler env i compilation unit icompilationunit compilation unit compilationunit compilation result compilationresult compilation result compilationresult compilation result compilationresult source unit sourceunit compilation unit declaration compilationunitdeclaration unit is top level or member istoplevelormember locator basic parser basicparser diet parse dietparse source unit sourceunit compilation result compilationresult locator basic parser basicparser parse source unit sourceunit compilation result compilationresult unit locator lookup environment lookupenvironment build type bindings buildtypebindings unit access restriction locator lookup environment lookupenvironment complete type bindings completetypebindings unit is top level or member istoplevelormember is top level or member istoplevelormember unit scope fault fields methods unit scope fault in types faultintypes unit resolve unit collect java model exception javamodelexception type collect paths cus hierarchy type result result index resultindex java project javaproject java project javaproject java project javaproject type get java project getjavaproject locator initialize java project javaproject type is binary isbinary binary type binding binarytypebinding binding locator cache binary type cachebinarytype type binding collect super type names collectsupertypenames binding i compilation unit icompilationunit unit type get compilation unit getcompilationunit source type sourcetype source type sourcetype source type sourcetype type is top level or member istoplevelormember source type sourcetype get outer most local context getoutermostlocalcontext compilation unit declaration compilationunitdeclaration parsed unit parsedunit build bindings buildbindings unit is top level or member istoplevelormember parsed unit parsedunit type declaration typedeclaration type decl typedecl ast node finder astnodefinder parsed unit parsedunit find type findtype type type decl typedecl type decl typedecl binding collect super type names collectsupertypenames type decl typedecl binding abort compilation abortcompilation result length result index resultindex system arraycopy result result result index resultindex result index resultindex result collect paths cus declare type matches declaring qualification declaringqualification declaring simple name declaringsimplename string paths get paths of declaring type getpathsofdeclaringtype paths create bindings source types binary types collect type names type declaration match declaring type sort projects util sort paths java project javaproject previous project previousproject result same package super type name samepackagesupertypename result index resultindex length paths length length openable openable locator handle factory handlefactory create openable createopenable paths locator scope classpath openable i java project ijavaproject project openable get java project getjavaproject project equals previous project previousproject previous project previousproject java project javaproject project locator initialize previous project previousproject openable i compilation unit icompilationunit i compilation unit icompilationunit unit i compilation unit icompilationunit openable compilation unit declaration compilationunitdeclaration parsed unit parsedunit build bindings buildbindings top level member types visible focus type unit parsed unit parsedunit parsed unit parsedunit traverse type declaration visitor typedeclarationvisitor parsed unit parsedunit scope openable i class file iclassfile i class file iclassfile class file classfile i class file iclassfile openable binary type binding binarytypebinding binding locator cache binary type cachebinarytype class file classfile get type gettype matches binding collect super type names collectsupertypenames binding binding compound name compoundname abort compilation abortcompilation java model exception javamodelexception result length result index resultindex system arraycopy result result result index resultindex result index resultindex result collects names super types supertypes type collect super type names collectsupertypenames reference binding referencebinding binding path reference binding referencebinding superclass binding superclass path superclass same package samepackage add if same package addifsamepackage superclass compound name compoundname path same package samepackage path superclass add to result addtoresult superclass compound name compoundname collect super type names collectsupertypenames superclass path reference binding referencebinding interfaces binding super interfaces superinterfaces interfaces interfaces length reference binding referencebinding interface binding interfacebinding interfaces add to result addtoresult interface binding interfacebinding compound name compoundname collect super type names collectsupertypenames interface binding interfacebinding path string get paths of declaring type getpathsofdeclaringtype type qualification typequalification type simple name typesimplename path collector pathcollector path collector pathcollector path collector pathcollector i java search scope ijavasearchscope scope search engine searchengine create workspace scope createworkspacescope index manager indexmanager index manager indexmanager java model manager javamodelmanager get index manager getindexmanager search pattern searchpattern search pattern searchpattern type declaration pattern typedeclarationpattern qualification simple type simple name typesimplename type qualification typequalification find member types type simple name typesimplename i index constants iindexconstants type suffix pattern get match rule getmatchrule index query requestor indexqueryrequestor search requestor searchrequestor index query requestor indexqueryrequestor accept index match acceptindexmatch string document path documentpath search pattern searchpattern index record indexrecord search participant searchparticipant participant access rule set accessruleset access type declaration pattern typedeclarationpattern record type declaration pattern typedeclarationpattern index record indexrecord filter local anonymous classes record enclosing type names enclosingtypenames i index constants iindexconstants path collector pathcollector accept index match acceptindexmatch document path documentpath index record indexrecord participant access sub monitor submonitor sub monitor submonitor sub monitor submonitor convert progress monitor progressmonitor index manager indexmanager perform concurrent job performconcurrentjob pattern search job patternsearchjob search pattern searchpattern java search participant javasearchparticipant scope search requestor searchrequestor i java search constants ijavasearchconstants wait ready search sub monitor submonitor split path collector pathcollector get paths getpaths get same package super type names getsamepackagesupertypenames same package super type name samepackagesupertypename matches compound name compoundname length compound name compoundname length length simple name simplename compound name compoundname length length type simple name typesimplename pattern matches name matchesname simple name simplename type simple name typesimplename frequent simple equals segment compound name compoundname qualification system arraycopy compound name compoundname qualification pattern matches name matchesname type qualification typequalification char operation charoperation concat with concatwith qualification char operation charoperation ends with endswith simple name simplename type simple name typesimplename member type transform system arraycopy compound name compoundname compound name compoundname length dollar char operation charoperation index of indexof simple name simplename dollar compound name compoundname char operation charoperation subarray simple name simplename dollar compound name compoundname length char operation charoperation subarray simple name simplename dollar simple name simplename length matches compound name compoundname matches reference binding referencebinding binding binding binding compound name compoundname matches binding compound name compoundname