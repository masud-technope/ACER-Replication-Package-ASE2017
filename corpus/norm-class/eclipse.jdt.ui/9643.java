copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation benjamin muskalla quick create method context box https bugs eclipse org bugs bug cgi org eclipse jdt internal text correction proposals java util list org eclipse swt graphics image org eclipse core runtime core exception coreexception org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i java project ijavaproject org eclipse jdt core naming conventions namingconventions org eclipse jdt core dom ast org eclipse jdt core dom ast node astnode org eclipse jdt core dom anonymous class declaration anonymousclassdeclaration org eclipse jdt core dom body declaration bodydeclaration org eclipse jdt core dom class instance creation classinstancecreation org eclipse jdt core dom expression org eclipse jdt core dom expression statement expressionstatement org eclipse jdt core dom i binding ibinding org eclipse jdt core dom i extended modifier iextendedmodifier org eclipse jdt core dom i method binding imethodbinding org eclipse jdt core dom i type binding itypebinding org eclipse jdt core dom method declaration methoddeclaration org eclipse jdt core dom method invocation methodinvocation org eclipse jdt core dom modifier org eclipse jdt core dom org eclipse jdt core dom parameterized type parameterizedtype org eclipse jdt core dom primitive type primitivetype org eclipse jdt core dom simple name simplename org eclipse jdt core dom single variable declaration singlevariabledeclaration org eclipse jdt core dom super method invocation supermethodinvocation org eclipse jdt core dom type org eclipse jdt core dom type declaration typedeclaration org eclipse jdt core dom type parameter typeparameter org eclipse jdt core dom rewrite ast rewrite astrewrite org eclipse jdt core dom rewrite import rewrite importrewrite import rewrite context importrewritecontext org eclipse jdt internal corext code manipulation codemanipulation context sensitive import rewrite context contextsensitiveimportrewritecontext org eclipse jdt internal corext code manipulation codemanipulation stub utility stubutility org eclipse jdt internal corext dom ast nodes astnodes org eclipse jdt internal corext dom bindings org eclipse jdt internal corext util java model util javamodelutil org eclipse jdt internal corext util jdt flags jdtflags org eclipse jdt internal text correction ast res olving astresolving org eclipse jdt internal text correction modifier correction sub processor modifiercorrectionsubprocessor new method correction proposal newmethodcorrectionproposal abstract method correction proposal abstractmethodcorrectionproposal nls string key nls string key type type list expression f arguments farguments invocation node invocationnode method invocation methodinvocation constructor invocation constructorinvocation super constructor invocation superconstructorinvocation class instance creation classinstancecreation super method invocation supermethodinvocation new method correction proposal newmethodcorrectionproposal string label i compilation unit icompilationunit targetcu ast node astnode invocation node invocationnode list expression arguments i type binding itypebinding binding relevance image image label targetcu invocation node invocationnode binding relevance image f arguments farguments arguments evaluate modifiers evaluatemodifiers ast node astnode target type decl targettypedecl get sender binding getsenderbinding is annotation isannotation is target interface istargetinterface get sender binding getsenderbinding is interface isinterface is target interface istargetinterface java model util javamodelutil or higher orhigher get compilation unit getcompilationunit get java project getjavaproject methods allowed java get interface method modifiers getinterfacemethodmodifiers target type decl targettypedecl ast node astnode invocation node invocationnode get invocation node getinvocationnode invocation node invocationnode method invocation methodinvocation modifiers expression expression method invocation methodinvocation invocation node invocationnode get expression getexpression expression expression expression resolve binding resolvebinding get kind getkind i binding ibinding type modifiers modifier ast res olving astresolving is in static context isinstaticcontext invocation node invocationnode modifiers modifier ast node astnode node ast res olving astresolving find parent type findparenttype invocation node invocationnode is parent interface isparentinterface node type declaration typedeclaration type declaration typedeclaration node is interface isinterface is target interface istargetinterface is parent interface isparentinterface expression target type decl targettypedecl equals node modifiers modifier is target interface istargetinterface modifiers get interface method modifiers getinterfacemethodmodifiers target type decl targettypedecl modifiers modifier modifiers modifier modifiers get interface method modifiers getinterfacemethodmodifiers target type decl targettypedecl modifier modifiers get interface method modifiers getinterfacemethodmodifiers target type decl targettypedecl target type decl targettypedecl equals node modifiers modifier node anonymous class declaration anonymousclassdeclaration ast nodes astnodes is parent isparent node target type decl targettypedecl modifiers modifier ast res olving astresolving is in static context isinstaticcontext node expression modifiers modifier modifiers modifier modifiers modifier get interface method modifiers getinterfacemethodmodifiers ast node astnode target type decl targettypedecl create abstract method createabstractmethod annotation members copy modifiers existing member target type decl targettypedecl type declaration typedeclaration type declaration typedeclaration type type declaration typedeclaration target type decl targettypedecl method declaration methoddeclaration method decls methoddecls type get methods getmethods method decls methoddecls length create abstract method createabstractmethod method declaration methoddeclaration method declaration methoddeclaration method decls methoddecls i method binding imethodbinding method binding methodbinding method declaration methoddeclaration resolve binding resolvebinding method binding methodbinding jdt flags jdtflags is abstract isabstract method binding methodbinding method declaration methoddeclaration get modifiers getmodifiers method decls methoddecls get modifiers getmodifiers modifier list body declaration bodydeclaration body decls bodydecls type body declarations bodydeclarations body decls bodydecls size body decls bodydecls get modifiers getmodifiers modifier override add new modifiers addnewmodifiers ast rewrite astrewrite rewrite ast node astnode target type decl targettypedecl list i extended modifier iextendedmodifier modifiers modifiers add all addall rewrite getast new modifiers newmodifiers evaluate modifiers evaluatemodifiers target type decl targettypedecl modifier correction sub processor modifiercorrectionsubprocessor install linked visibility proposals installlinkedvisibilityproposals get linked proposal model getlinkedproposalmodel rewrite modifiers get sender binding getsenderbinding is interface isinterface override is constructor isconstructor ast node astnode node get invocation node getinvocationnode node get node type getnodetype ast node astnode method invocation node get node type getnodetype ast node astnode method invocation override simple name simplename get new name getnewname ast rewrite astrewrite rewrite ast node astnode invocation node invocationnode get invocation node getinvocationnode string invocation node invocationnode method invocation methodinvocation method invocation methodinvocation invocation node invocationnode get name getname get identifier getidentifier invocation node invocationnode super method invocation supermethodinvocation super method invocation supermethodinvocation invocation node invocationnode get name getname get identifier getidentifier get sender binding getsenderbinding get name getname ast ast rewrite getast simple name simplename new name node newnamenode ast new simple name newsimplename add linked position addlinkedposition rewrite track new name node newnamenode key ast node astnode invocation name invocationname get invocation name node getinvocationnamenode invocation name invocationname invocation name invocationname getast ast add linked position addlinkedposition rewrite track invocation name invocationname key new name node newnamenode ast node astnode get invocation name node getinvocationnamenode ast node astnode node get invocation node getinvocationnode node method invocation methodinvocation method invocation methodinvocation node get name getname node super method invocation supermethodinvocation super method invocation supermethodinvocation node get name getname node class instance creation classinstancecreation type type class instance creation classinstancecreation node get type gettype type parameterized type parameterizedtype type parameterized type parameterizedtype type get type gettype type override type get new method type getnewmethodtype ast rewrite astrewrite rewrite core exception coreexception ast node astnode node get invocation node getinvocationnode ast ast rewrite getast type new type node newtypenode i type binding itypebinding other proposals otherproposals import rewrite context importrewritecontext import rewrite context importrewritecontext context sensitive import rewrite context contextsensitiveimportrewritecontext node get import rewrite getimportrewrite node get parent getparent method invocation methodinvocation method invocation methodinvocation parent method invocation methodinvocation node get parent getparent parent get expression getexpression node i type binding itypebinding bindings ast res olving astresolving get qualifier guess getqualifierguess node get root getroot parent get name getname get identifier getidentifier parent arguments get sender binding getsenderbinding bindings length new type node newtypenode get import rewrite getimportrewrite add import addimport bindings ast import rewrite context importrewritecontext other proposals otherproposals bindings new type node newtypenode i type binding itypebinding binding ast res olving astresolving guess binding for reference guessbindingforreference node binding binding is wildcard type iswildcardtype binding ast res olving astresolving normalize wildcard type normalizewildcardtype binding ast binding new type node newtypenode get import rewrite getimportrewrite add import addimport binding ast import rewrite context importrewritecontext ast node astnode parent node get parent getparent parent expression statement expressionstatement new type node newtypenode ast new primitive type newprimitivetype primitive type primitivetype new type node newtypenode ast res olving astresolving guess type for reference guesstypeforreference ast node new type node newtypenode new type node newtypenode ast new simple type newsimpletype nls ast new simple name newsimplename nls object add linked position addlinkedposition rewrite track new type node newtypenode key type other proposals otherproposals other proposals otherproposals length add linked position proposal addlinkedpositionproposal key type other proposals otherproposals new type node newtypenode override add new parameters addnewparameters ast rewrite astrewrite rewrite list string taken names takennames list single variable declaration singlevariabledeclaration params core exception coreexception ast ast rewrite getast list expression arguments f arguments farguments import rewrite context importrewritecontext context context sensitive import rewrite context contextsensitiveimportrewritecontext ast res olving astresolving find parent body declaration findparentbodydeclaration get invocation node getinvocationnode get import rewrite getimportrewrite arguments size expression elem arguments single variable declaration singlevariabledeclaration param ast new single variable declaration newsinglevariabledeclaration argument type nls string arg type key argtypekey arg type type type evaluate parameter type evaluateparametertype ast elem arg type key argtypekey context param set type settype type argument nls string arg name key argnamekey arg string evaluate parameter name evaluateparametername taken names takennames elem type arg name key argnamekey param set name setname ast new simple name newsimplename params add param add linked position addlinkedposition rewrite track param get type gettype arg type key argtypekey add linked position addlinkedposition rewrite track param get name getname arg name key argnamekey type evaluate parameter type evaluateparametertype ast ast expression elem string key import rewrite context importrewritecontext context i type binding itypebinding binding bindings normalize type binding normalizetypebinding elem resolve type binding resolvetypebinding binding binding is wildcard type iswildcardtype binding ast res olving astresolving normalize wildcard type normalizewildcardtype binding ast binding i type binding itypebinding type proposals typeproposals ast res olving astresolving get relaxing types getrelaxingtypes ast binding type proposals typeproposals length add linked position proposal addlinkedpositionproposal key type proposals typeproposals get import rewrite getimportrewrite add import addimport binding ast context nls ast new simple type newsimpletype ast new simple name newsimplename object string evaluate parameter name evaluateparametername list string taken names takennames expression arg node argnode type type string key i java project ijavaproject project get compilation unit getcompilationunit get java project getjavaproject string names stub utility stubutility get variable name suggestions getvariablenamesuggestions naming conventions namingconventions parameter project type arg node argnode taken names takennames names length add linked position proposal addlinkedpositionproposal key names string favourite names taken names takennames add favourite favourite override add new exceptions addnewexceptions ast rewrite astrewrite rewrite list type exceptions core exception coreexception override add new type parameters addnewtypeparameters ast rewrite astrewrite rewrite list string taken names takennames list type parameter typeparameter params core exception coreexception