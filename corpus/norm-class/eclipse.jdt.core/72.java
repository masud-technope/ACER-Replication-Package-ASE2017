copyright ibm corporation rights reserved program accompanying materials terms common license accompanies distribution http eclipse org legal cpl html contributors ibm corporation initial api implementation org eclipse jdt internal compiler lookup org eclipse jdt core compiler char operation charoperation org eclipse jdt internal compiler ast constructor declaration constructordeclaration org eclipse jdt internal compiler class fmt classfmt class file constants classfileconstants org eclipse jdt internal compiler env i binary field ibinaryfield org eclipse jdt internal compiler env i binary method ibinarymethod org eclipse jdt internal compiler env i binary nested type ibinarynestedtype org eclipse jdt internal compiler env i binary type ibinarytype org eclipse jdt internal compiler problem abort compilation abortcompilation binary type binding binarytypebinding reference binding referencebinding fields guaranteed initialized accessed accessor method reference binding referencebinding superclass reference binding referencebinding enclosing type enclosingtype reference binding referencebinding super interfaces superinterfaces field binding fieldbinding fields method binding methodbinding methods reference binding referencebinding member types membertypes type variable binding typevariablebinding type variables typevariables link pri nciple principle structure lookup environment lookupenvironment environment reference binding referencebinding resolve type resolvetype reference binding referencebinding type lookup environment lookupenvironment environment convert generic to raw type convertgenerictorawtype type unresolved reference binding unresolvedreferencebinding unresolved reference binding unresolvedreferencebinding type resolve environment convert generic to raw type convertgenerictorawtype type is parameterized type isparameterizedtype parameterized type binding parameterizedtypebinding type resolve type is wildcard iswildcard wildcard binding wildcardbinding type resolve raw reference convert generic to raw type convertgenerictorawtype type is generic type isgenerictype environment create raw type createrawtype type type type binding typebinding resolve type resolvetype type binding typebinding type lookup environment lookupenvironment environment parameterized type binding parameterizedtypebinding parameterized type parameterizedtype rank type unresolved reference binding unresolvedreferencebinding unresolved reference binding unresolvedreferencebinding type resolve environment parameterized type parameterizedtype type is parameterized type isparameterizedtype parameterized type binding parameterizedtypebinding type resolve type is wildcard iswildcard wildcard binding wildcardbinding type resolve type is array type isarraytype resolve type resolvetype array binding arraybinding type leaf component type leafcomponenttype environment parameterized type parameterizedtype rank raw reference parameterized type parameterizedtype type is generic type isgenerictype environment create raw type createrawtype reference binding referencebinding type type resolve hierarchy types steps resolving unresolved types unresolvedtypes reference binding referencebinding resolve unresolved type resolveunresolvedtype reference binding referencebinding type lookup environment lookupenvironment environment convert generic to raw type convertgenerictorawtype type unresolved reference binding unresolvedreferencebinding unresolved reference binding unresolvedreferencebinding type resolve environment convert generic to raw type convertgenerictorawtype type is parameterized type isparameterizedtype parameterized type resolve unresolved type resolveunresolvedtype parameterized type binding parameterizedtypebinding type type environment type is wildcard iswildcard resolve type resolvetype wildcard binding wildcardbinding type generic type generictype environment type binary type binding binarytypebinding package binding packagebinding package binding packagebinding i binary type ibinarytype binary type binarytype lookup environment lookupenvironment environment compound name compoundname char operation charoperation split on spliton binary type binarytype get name getname compute id computeid tag bits tagbits is binary binding isbinarybinding environment environment f package fpackage package binding packagebinding file name filename binary type binarytype get file name getfilename type variables typevariables no type variables notypevariables source possible source name possiblesourcename compound name compoundname compound name compoundname length start char operation charoperation last index of lastindexof possible source name possiblesourcename start source name sourcename possible source name possiblesourcename source name sourcename possible source name possiblesourcename length start system arraycopy possible source name possiblesourcename start source name sourcename source name sourcename length modifiers binary type binarytype get modifiers getmodifiers binary type binarytype is interface isinterface modifiers acc interface accinterface binary type binarytype is anonymous isanonymous tag bits tagbits anonymous type mask anonymoustypemask binary type binarytype is local islocal tag bits tagbits local type mask localtypemask binary type binarytype is member ismember tag bits tagbits member type mask membertypemask field binding fieldbinding available fields availablefields field binding fieldbinding available fields availablefields field binding fieldbinding fields length count fields length available fields availablefields count resolve type for resolvetypefor fields count abort compilation abortcompilation system arraycopy available fields availablefields available fields availablefields field binding fieldbinding count count available fields availablefields method binding methodbinding available methods availablemethods modifiers acc unresolved accunresolved methods method binding methodbinding available methods availablemethods method binding methodbinding methods length count methods length available methods availablemethods count resolve types for resolvetypesfor methods count abort compilation abortcompilation system arraycopy available methods availablemethods available methods availablemethods method binding methodbinding count count available methods availablemethods cache parts from cachepartsfrom i binary type ibinarytype binary type binarytype need fields and methods needfieldsandmethods initialization interfaces early aborting compilation error occurs bin aries binaries passed point type hierarchy resolver bug super interfaces superinterfaces no super interfaces nosuperinterfaces enclosing type access type variables enclosing type name enclosingtypename binary type binarytype get enclosing type name getenclosingtypename enclosing type name enclosingtypename attempt find enclosing type exists cache resolve requested pretend parameterized avoid raw enclosing type enclosingtype environment get type from constant pool name gettypefromconstantpoolname enclosing type name enclosingtypename member type top level local type tag bits tagbits member type mask membertypemask tag bits tagbits has unresolved enclosing type hasunresolvedenclosingtype enclosing type enclosingtype is strictfp isstrictfp modifiers acc strictfp accstrictfp enclosing type enclosingtype is deprecated isdeprecated modifiers acc deprecated impl icitly accdeprecatedimplicitly check generic signatures checkgenericsignatures environment options source level sourcelevel class file constants classfileconstants jdk type signature typesignature check generic signatures checkgenericsignatures binary type binarytype get generic signature getgenericsignature type signature typesignature superclass name superclassname binary type binarytype get superclass name getsuperclassname superclass name superclassname attempt find superclass exists cache resolve requested superclass environment get type from constant pool name gettypefromconstantpoolname superclass name superclassname tag bits tagbits has unresolved superclass hasunresolvedsuperclass super interfaces superinterfaces no super interfaces nosuperinterfaces interface names interfacenames binary type binarytype get interface names getinterfacenames interface names interfacenames size interface names interfacenames length size super interfaces superinterfaces reference binding referencebinding size size attempt find super interface superinterface exists cache resolve requested super interfaces superinterfaces environment get type from constant pool name gettypefromconstantpoolname interface names interfacenames tag bits tagbits has unresolved super interfaces hasunresolvedsuperinterfaces class signature classsignature parameter part parameterpart optional type signature typesignature signature signature wrapper signaturewrapper wrapper signature wrapper signaturewrapper type signature typesignature wrapper signature wrapper start parameter part parameterpart parameter signature parametersignature skip wrapper start rank type variable binding typevariablebinding variable create type variable createtypevariable wrapper rank variable f package fpackage f package fpackage system arraycopy type variables typevariables type variables typevariables type variable binding typevariablebinding rank rank type variables typevariables rank variable initialize type variable initializetypevariable variable type variables typevariables wrapper wrapper signature wrapper start skip wrapper start tag bits tagbits has unresolved type variables hasunresolvedtypevariables modifiers acc generic signature accgenericsignature attempt find superclass exists cache resolve requested superclass reference binding referencebinding environment get type from type signature gettypefromtypesignature wrapper no type variables notypevariables tag bits tagbits has unresolved superclass hasunresolvedsuperclass super interfaces superinterfaces no super interfaces nosuperinterfaces wrapper at end atend attempt find super interface superinterface exists cache resolve requested java util array list arraylist types java util array list arraylist types add environment get type from type signature gettypefromtypesignature wrapper no type variables notypevariables wrapper at end atend super interfaces superinterfaces reference binding referencebinding types size types to array toarray super interfaces superinterfaces tag bits tagbits has unresolved super interfaces hasunresolvedsuperinterfaces member types membertypes no member types nomembertypes i binary nested type ibinarynestedtype member type structures membertypestructures binary type binarytype get member types getmembertypes member type structures membertypestructures size member type structures membertypestructures length size member types membertypes reference binding referencebinding size size attempt find member type exists cache resolve requested member types membertypes environment get type from constant pool name gettypefromconstantpoolname member type structures membertypestructures get name getname tag bits tagbits has unresolved member types hasunresolvedmembertypes need fields and methods needfieldsandmethods create fields createfields binary type binarytype get fields getfields check generic signatures checkgenericsignatures create methods createmethods binary type binarytype get methods getmethods check generic signatures checkgenericsignatures protect incorrect need fields and methods needfieldsandmethods flag fields no fields nofields methods no methods nomethods create fields createfields i binary field ibinaryfield i fields ifields check generic signatures checkgenericsignatures fields no fields nofields i fields ifields size i fields ifields length size fields field binding fieldbinding size size i binary field ibinaryfield field i fields ifields field signature fieldsignature check generic signatures checkgenericsignatures field get generic signature getgenericsignature type binding typebinding type field signature fieldsignature environment get type from signature gettypefromsignature field get type name gettypename environment get type from type signature gettypefromtypesignature signature wrapper signaturewrapper field signature fieldsignature no type variables notypevariables fields field binding fieldbinding field get name getname type field get modifiers getmodifiers acc unresolved accunresolved field get constant getconstant method binding methodbinding create method createmethod i binary method ibinarymethod method check generic signatures checkgenericsignatures method modifiers methodmodifiers method get modifiers getmodifiers acc unresolved accunresolved reference binding referencebinding exceptions no exceptions noexceptions type binding typebinding parameters no parameters noparameters type variable binding typevariablebinding type vars typevars no type variables notypevariables type binding typebinding return type returntype method signature methodsignature check generic signatures checkgenericsignatures method get generic signature getgenericsignature generics method signature methodsignature form ljava jang string method descriptor methoddescriptor method get method descriptor getmethoddescriptor num of params numofparams next char nextchar character skip next char nextchar method descriptor methoddescriptor next char nextchar num of params numofparams next char nextchar next char nextchar method descriptor methoddescriptor empty ignore synthetic argument member types start index startindex method is constructor isconstructor is member type ismembertype is static isstatic size num of params numofparams start index startindex size parameters type binding typebinding size character skip num of params numofparams next char nextchar method descriptor methoddescriptor empty next char nextchar next char nextchar method descriptor methoddescriptor empty skip synthetic arg start index startindex parameters start index startindex environment get type from signature gettypefromsignature method descriptor methoddescriptor exception types exceptiontypes method get exception type names getexceptiontypenames exception types exceptiontypes size exception types exceptiontypes length size exceptions reference binding referencebinding size size exceptions environment get type from constant pool name gettypefromconstantpoolname exception types exceptiontypes method is constructor isconstructor pointing return type returntype environment get type from signature gettypefromsignature method descriptor methoddescriptor method type signature methodtypesignature parameter part parameterpart optional type signatures typesignatures type signature typesignature type signature typesignature optional signature wrapper signaturewrapper wrapper signature wrapper signaturewrapper method signature methodsignature wrapper signature wrapper start ljava lang annotation annotation ljava lang parameter part parameterpart parameter signature parametersignature skip wrapper start rank type variable binding typevariablebinding variable create type variable createtypevariable wrapper rank system arraycopy type vars typevars type vars typevars type variable binding typevariablebinding rank rank type vars typevars rank variable initialize type variable initializetypevariable variable type vars typevars wrapper wrapper signature wrapper start skip wrapper start wrapper signature wrapper start skip wrapper start wrapper signature wrapper start skip wrapper start java util array list arraylist types java util array list arraylist start index startindex method is constructor isconstructor is member type ismembertype is static isstatic start index startindex skip synthetic argument environment get type from type signature gettypefromtypesignature wrapper type vars typevars wrapper signature wrapper start types add environment get type from type signature gettypefromtypesignature wrapper type vars typevars skip wrapper start parameters type binding typebinding types size types to array toarray parameters method is constructor isconstructor return type returntype environment get type from type signature gettypefromtypesignature wrapper type vars typevars wrapper at end atend wrapper signature wrapper start attempt find super interface superinterface exists cache resolve requested java util array list arraylist types java util array list arraylist skip wrapper start types add environment get type from type signature gettypefromtypesignature wrapper type vars typevars wrapper at end atend wrapper signature wrapper start exceptions reference binding referencebinding types size types to array toarray exceptions exceptions exception types exceptiontypes method get exception type names getexceptiontypenames exception types exceptiontypes size exception types exceptiontypes length size exceptions reference binding referencebinding size size exceptions environment get type from constant pool name gettypefromconstantpoolname exception types exceptiontypes method binding methodbinding result method is constructor isconstructor method binding methodbinding method modifiers methodmodifiers parameters exceptions method binding methodbinding method modifiers methodmodifiers method get selector getselector return type returntype parameters exceptions result type variables typevariables type vars typevars result create method bindings binary type filtering clinit synthetics create methods createmethods i binary method ibinarymethod i methods imethods check generic signatures checkgenericsignatures total initial total initialtotal i clinit iclinit to skip toskip i methods imethods total initial total initialtotal i methods imethods length total i binary method ibinarymethod method i methods imethods method get modifiers getmodifiers acc synthetic accsynthetic discard synthetics methods to skip toskip to skip toskip i methods imethods length to skip toskip total i clinit iclinit method name methodname method get selector getselector method name methodname length method name methodname discard clinit i clinit iclinit total total methods no methods nomethods methods method binding methodbinding total total initial total initialtotal initial total initialtotal methods create method createmethod i methods imethods check generic signatures checkgenericsignatures initial total initialtotal i clinit iclinit to skip toskip to skip toskip methods create method createmethod i methods imethods check generic signatures checkgenericsignatures methods modifiers acc unresolved accunresolved type variable binding typevariablebinding create type variable createtypevariable signature wrapper signaturewrapper wrapper rank parameter signature parametersignature identifier type signature typesignature identifier type signature typesignature optional interface bound interfacebound interface bound interfacebound type signature typesignature colon char operation charoperation index of indexof wrapper signature wrapper start variable name variablename char operation charoperation subarray wrapper signature wrapper start colon type variable binding typevariablebinding variable type variable binding typevariablebinding variable name variablename rank variable answer receiver enclosing type receiver top level type note enclosing type enclosingtype binary type resolved needed reference binding referencebinding enclosing type enclosingtype tag bits tagbits has unresolved enclosing type hasunresolvedenclosingtype enclosing type enclosingtype raw conversion enclosing type enclosingtype resolve unresolved type resolveunresolvedtype enclosing type enclosingtype environment tag bits tagbits has unresolved enclosing type hasunresolvedenclosingtype finish resolving type enclosing type enclosingtype resolve type resolvetype enclosing type enclosingtype environment enclosing type enclosingtype note type field binary type resolved needed field binding fieldbinding fields fields length resolve type for resolvetypefor fields fields note type arg exception types method binary type resolved needed method binding methodbinding get exact constructor getexactconstructor type binding typebinding argument types argumenttypes arg count argcount argument types argumenttypes length next method nextmethod methods length method binding methodbinding method methods method selector constructor declaration constructordeclaration constant pool name constantpoolname method parameters length arg count argcount resolve types for resolvetypesfor method type binding typebinding to match tomatch method parameters arg count argcount to match tomatch argument types argumenttypes next method nextmethod method note type arg exception types method binary type resolved needed searches hierarchy potential exact match method binding methodbinding get exact method getexactmethod selector type binding typebinding argument types argumenttypes compilation unit scope compilationunitscope ref scope refscope ref scope refscope ref scope refscope record type reference recordtypereference arg count argcount argument types argumenttypes length selector length selectorlength selector length found not hing foundnothing next method nextmethod methods length method binding methodbinding method methods method selector length selector length selectorlength char operation charoperation equals method selector selector type look ups lookups method exists found not hing foundnothing method parameters length arg count argcount resolve types for resolvetypesfor method type binding typebinding to match tomatch method parameters arg count argcount to match tomatch argument types argumenttypes next method nextmethod method found not hing foundnothing is interface isinterface super interfaces superinterfaces length super interfaces superinterfaces get exact method getexactmethod selector argument types argumenttypes ref scope refscope superclass superclass get exact method getexactmethod selector argument types argumenttypes ref scope refscope note type field binary type resolved needed field binding fieldbinding get field getfield field name fieldname need resolve needresolve field length fieldlength field name fieldname length fields length fields length field length fieldlength char operation charoperation equals field name fieldname need resolve needresolve resolve type for resolvetypefor fields fields rewrite get member type getmembertype avoid resolving eagerly member types requested reference binding referencebinding get member type getmembertype type name typename member types membertypes length reference binding referencebinding member type membertype member types membertypes member type membertype unresolved reference binding unresolvedreferencebinding source qualified enclosing type member type membertype source name sourcename enclosing prefix length prefixlength compound name compoundname compound name compoundname length length enclosing type name typename length prefix length prefixlength type name typename length check trailing portion char operation charoperation fragment equals fragmentequals type name typename prefix length prefixlength raw conversion member types membertypes resolve type resolvetype member type membertype environment char operation charoperation equals type name typename member type membertype source name sourcename member type membertype note type arg exception types method binary type resolved needed method binding methodbinding get methods getmethods selector count last index lastindex selector length selectorlength selector length length methods length length method binding methodbinding method methods method selector length selector length selectorlength char operation charoperation equals method selector selector resolve types for resolvetypesfor method count last index lastindex count method binding methodbinding methods last index lastindex count method binding methodbinding result method binding methodbinding count count last index lastindex method binding methodbinding method methods method selector length selector length selectorlength char operation charoperation equals method selector selector result count method result no methods nomethods has member types hasmembertypes member types membertypes length note member types binary types resolved needed type variable binding typevariablebinding get type variable gettypevariable variable name variablename type variable binding typevariablebinding variable get type variable gettypevariable variable name variablename resolve types for resolvetypesfor variable variable initialize type variable initializetypevariable type variable binding typevariablebinding variable type variable binding typevariablebinding existing variables existingvariables signature wrapper signaturewrapper wrapper parameter signature parametersignature identifier type signature typesignature identifier type signature typesignature optional interface bound interfacebound interface bound interfacebound type signature typesignature colon char operation charoperation index of indexof wrapper signature wrapper start skip wrapper start colon reference binding referencebinding type first bound firstbound wrapper signature wrapper start type environment get type gettype java lang object type reference binding referencebinding environment get type from type signature gettypefromtypesignature wrapper existing variables existingvariables first bound firstbound type variable visible bounds variable modifiers acc unresolved accunresolved variable superclass type reference binding referencebinding bounds wrapper signature wrapper start java util array list arraylist types java util array list arraylist skip wrapper start types add environment get type from type signature gettypefromtypesignature wrapper existing variables existingvariables wrapper signature wrapper start bounds reference binding referencebinding types size types to array toarray bounds variable super interfaces superinterfaces bounds no super interfaces nosuperinterfaces bounds first bound firstbound first bound firstbound variable super interfaces superinterfaces length variable super interfaces superinterfaces variable modifiers acc interface accinterface variable first bound firstbound first bound firstbound returns type identical types compared raw type is equivalent to isequivalentto type binding typebinding other type othertype other type othertype other type othertype wildcard other type othertype is wildcard iswildcard wildcard binding wildcardbinding other type othertype bound check boundcheck type variables typevariables no type variables notypevariables other type othertype is raw type israwtype other type othertype erasure is generic type isgenerictype type variables typevariables no type variables notypevariables note member types binary types resolved needed reference binding referencebinding member types membertypes tag bits tagbits has unresolved member types hasunresolvedmembertypes member types membertypes member types membertypes length raw conversion member types membertypes resolve unresolved type resolveunresolvedtype member types membertypes environment tag bits tagbits has unresolved member types hasunresolvedmembertypes member types membertypes length raw conversion member types membertypes resolve type resolvetype member types membertypes environment member types membertypes note type arg exception types method binary type resolved needed method binding methodbinding methods modifiers acc unresolved accunresolved methods methods length resolve types for resolvetypesfor methods modifiers acc unresolved accunresolved methods field binding fieldbinding resolve type for resolvetypefor field binding fieldbinding field field modifiers acc unresolved accunresolved field field type resolve type resolvetype field type environment field modifiers acc unresolved accunresolved field method binding methodbinding resolve types for resolvetypesfor method binding methodbinding method method modifiers acc unresolved accunresolved method method is constructor isconstructor method return type returntype resolve type resolvetype method return type returntype environment method parameters length method parameters resolve type resolvetype method parameters environment method thrown exceptions thrownexceptions length method thrown exceptions thrownexceptions resolve type resolvetype method thrown exceptions thrownexceptions environment method type variables typevariables length resolve types for resolvetypesfor method type variables typevariables method modifiers acc unresolved accunresolved method type variable binding typevariablebinding resolve types for resolvetypesfor type variable binding typevariablebinding variable variable modifiers acc unresolved accunresolved variable variable superclass variable superclass resolve unresolved type resolveunresolvedtype variable superclass environment variable first bound firstbound variable first bound firstbound resolve unresolved type resolveunresolvedtype variable first bound firstbound environment reference binding referencebinding interfaces variable super interfaces superinterfaces interfaces length interfaces resolve unresolved type resolveunresolvedtype interfaces environment variable modifiers acc unresolved accunresolved finish resolving types variable superclass variable superclass resolve type resolvetype variable superclass environment variable first bound firstbound variable first bound firstbound resolve type resolvetype variable first bound firstbound environment interfaces length interfaces resolve type resolvetype interfaces environment variable answer receiver superclass receiver object note superclass binary type resolved needed reference binding referencebinding superclass tag bits tagbits has unresolved superclass hasunresolvedsuperclass superclass superclass resolve unresolved type resolveunresolvedtype superclass environment tag bits tagbits has unresolved superclass hasunresolvedsuperclass finish resolving type superclass resolve type resolvetype superclass environment superclass note super interfaces superinterfaces binary types resolved needed reference binding referencebinding super interfaces superinterfaces tag bits tagbits has unresolved super interfaces hasunresolvedsuperinterfaces super interfaces superinterfaces super interfaces superinterfaces length super interfaces superinterfaces resolve unresolved type resolveunresolvedtype super interfaces superinterfaces environment tag bits tagbits has unresolved super interfaces hasunresolvedsuperinterfaces super interfaces superinterfaces length super interfaces superinterfaces resolve type resolvetype super interfaces superinterfaces environment super interfaces superinterfaces type variable binding typevariablebinding type variables typevariables tag bits tagbits has unresolved type variables hasunresolvedtypevariables type variables typevariables type variables typevariables length resolve types for resolvetypesfor type variables typevariables tag bits tagbits has unresolved type variables hasunresolvedtypevariables type variables typevariables string to string tostring nls string nls is deprecated isdeprecated deprecated nls is public ispublic nls is protected isprotected nls is private isprivate nls is abstract isabstract is class isclass nls is static isstatic is nested type isnestedtype nls is final isfinal nls nls is interface isinterface nls compound name compoundname char operation charoperation to string tostring compound name compoundname unnamed type nls text ends textends nls superclass superclass debug name debugname type super interfaces superinterfaces super interfaces superinterfaces no super interfaces nosuperinterfaces nls timplements length super interfaces superinterfaces length length nls nls super interfaces superinterfaces nls super interfaces superinterfaces debug name debugname nls type nls superinterfaces enclosing type enclosingtype nls tenclosing type enclosing type enclosingtype debug name debugname fields fields no fields nofields nls fields length fields length length nls nls fields fields to string tostring nnull field nls fields methods methods no methods nomethods nls methods length methods length length nls nls methods methods to string tostring nnull method nls methods member types membertypes member types membertypes no member types nomembertypes nls members length member types membertypes length length nls nls member types membertypes member types membertypes to string tostring nnull type nls member types nls method binding methodbinding un resolved methods unresolvedmethods method verifier methodverifier doesn resolve types methods