copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde api tools internal provisional java text message format messageformat java util linked list linkedlist org eclipse core runtime core exception coreexception org eclipse core runtime i status istatus org eclipse core runtime status org eclipse pde api tools internal builder type scope typescope org eclipse pde api tools internal descriptors component descriptor impl componentdescriptorimpl org eclipse pde api tools internal descriptors package descriptor impl packagedescriptorimpl org eclipse pde api tools internal model composite api type container compositeapitypecontainer org eclipse pde api tools internal provisional descriptors i component descriptor icomponentdescriptor org eclipse pde api tools internal provisional descriptors i field descriptor ifielddescriptor org eclipse pde api tools internal provisional descriptors i member descriptor imemberdescriptor org eclipse pde api tools internal provisional descriptors i method descriptor imethoddescriptor org eclipse pde api tools internal provisional descriptors i package descriptor ipackagedescriptor org eclipse pde api tools internal provisional descriptors i reference type descriptor ireferencetypedescriptor org eclipse pde api tools internal provisional model i api component iapicomponent org eclipse pde api tools internal provisional model i api method iapimethod org eclipse pde api tools internal provisional model i api type iapitype org eclipse pde api tools internal provisional model i api type container iapitypecontainer org eclipse pde api tools internal provisional model i api type root iapityperoot org eclipse pde api tools internal provisional problems i api problem iapiproblem org eclipse pde api tools internal search i reference descriptor ireferencedescriptor org eclipse pde api tools internal search reference descriptor referencedescriptor org eclipse pde api tools internal util signatures factory create api model objects factory returns component descriptor link i api component iapicomponent undefined version component exists resolution lookup kind descriptor param component id componentid component descriptor i component descriptor icomponentdescriptor component descriptor componentdescriptor string component id componentid component descriptor impl componentdescriptorimpl component id componentid returns component descriptor link i api component iapicomponent version component exists resolution lookup kind descriptor param component id componentid param version version descriptor code code component descriptor i component descriptor icomponentdescriptor component descriptor componentdescriptor string component id componentid string version component descriptor impl componentdescriptorimpl component id componentid version returns descriptor empty string names dot qualified param package name packagename link i package descriptor ipackagedescriptor i package descriptor ipackagedescriptor package descriptor packagedescriptor string package name packagename package descriptor impl packagedescriptorimpl package name packagename utility method create type descriptor type fully qualified names dot qualified type names qualified param fully qualified name fullyqualifiedname link i type descriptor itypedescriptor type i reference type descriptor ireferencetypedescriptor type descriptor typedescriptor string fully qualified name fullyqualifiedname string package name packagename signatures get package name getpackagename fully qualified name fullyqualifiedname string type name typename signatures get type name gettypename fully qualified name fullyqualifiedname package descriptor packagedescriptor package name packagename get type gettype type name typename utility method create type descriptor method contained type param typename enclosing type method param method param signature the signaturethe signature method link i method descriptor imethoddescriptor method i method descriptor imethoddescriptor method descriptor methoddescriptor string typename string string signature i reference type descriptor ireferencetypedescriptor type type descriptor typedescriptor typename type get method getmethod signature utility method create type descriptor field contained type param typename enclosing type field param field link i field descriptor ifielddescriptor field i field descriptor ifielddescriptor field descriptor fielddescriptor string typename string i reference type descriptor ireferencetypedescriptor type type descriptor typedescriptor typename type get field getfield creates link i reference descriptor ireferencedescriptor object param origincomponent component reference param originmember member reference param number reference unknown param target component targetcomponent component reference param target member targetmember member reference param kind kind reference link org eclipse pde api tools internal provisional builder i reference ireference complete list kinds param flags flags reference link org eclipse pde api tools internal provisional builder i reference ireference complete list flags param visibility visibility reference link visibility modifiers visibilitymodifiers complete list visibilities param messages listing link i api problem iapiproblem messages reference descriptor link i reference descriptor ireferencedescriptor i reference descriptor ireferencedescriptor reference descriptor referencedescriptor i component descriptor icomponentdescriptor origincomponent i member descriptor imemberdescriptor originmember i component descriptor icomponentdescriptor target component targetcomponent i member descriptor imemberdescriptor target member targetmember kind flags visibility string messages reference descriptor referencedescriptor origincomponent originmember target component targetcomponent target member targetmember kind flags visibility messages returns scope elements components param components api components search scope core exception coreexception baseline components disposed i api type container iapitypecontainer new scope newscope i api component iapicomponent components core exception coreexception linked list linkedlist i api type container iapitypecontainer comp list complist linked list linkedlist components length comp list complist add components composite api type container compositeapitypecontainer scope composite api type container compositeapitypecontainer components get baseline getbaseline comp list complist scope returns scope types component param component api component param types reference types search scope i api type container iapitypecontainer new type scope newtypescope i api component iapicomponent component i reference type descriptor ireferencetypedescriptor types type scope typescope component types returns method descriptor resolved signature method descriptor unresolved signature param descriptor method resolve resolved method descriptor method descriptor unable resolve exception core exception coreexception unable resolve method file container purpose i method descriptor imethoddescriptor resolve method resolvemethod i api type container iapitypecontainer container i method descriptor imethoddescriptor descriptor core exception coreexception container i reference type descriptor ireferencetypedescriptor type descriptor get enclosing type getenclosingtype i api type root iapityperoot class file classfile container find type root findtyperoot type get qualified name getqualifiedname class file classfile i api type iapitype structure class file classfile get structure getstructure structure i api method iapimethod methods structure get methods getmethods methods length i api method iapimethod method methods descriptor get name getname equals method get name getname string signature method get signature getsignature string descriptor signature descriptorsignature descriptor get signature getsignature replace signatures matches signatures matchessignatures descriptor signature descriptorsignature signature replace descriptor get enclosing type getenclosingtype get method getmethod method get name getname signature string generic signature genericsignature method get generic signature getgenericsignature generic signature genericsignature signatures matches signatures matchessignatures descriptor signature descriptorsignature generic signature genericsignature replace descriptor get enclosing type getenclosingtype get method getmethod method get name getname signature nls core exception coreexception status i status istatus error api plugin apiplugin plugin message format messageformat format unable resolve method signature descriptor to string tostring descriptor