copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt jeview views java util array list arraylist java util collections java util comparator java util map java util map entry java util concurrent callable org eclipse core resources i resource iresource org eclipse jdt core i annot atable iannotatable org eclipse jdt core i annotation iannotation org eclipse jdt core i class file iclassfile org eclipse jdt core i classpath entry iclasspathentry org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i jar entry resource ijarentryresource org eclipse jdt core i java element ijavaelement org eclipse jdt core i java model ijavamodel org eclipse jdt core i java project ijavaproject org eclipse jdt core i local variable ilocalvariable org eclipse jdt core i member imember org eclipse jdt core i member value pair imembervaluepair org eclipse jdt core i method imethod org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt core i parent iparent org eclipse jdt core i type itype org eclipse jdt core i type parameter itypeparameter org eclipse jdt core i type root ityperoot org eclipse jdt core java model exception javamodelexception org eclipse jdt java element labels javaelementlabels java element javaelement je attribute jeattribute label options java element labels javaelementlabels app type signature java element labels javaelementlabels parameter types java element labels javaelementlabels app returntype java element labels javaelementlabels fully qualified java element labels javaelementlabels type parameters java element labels javaelementlabels resolved je attribute jeattribute f parent fparent string f name fname i java element ijavaelement f java element fjavaelement java element javaelement je attribute jeattribute parent string i java element ijavaelement element f parent fparent parent f name fname f java element fjavaelement element java element javaelement je attribute jeattribute parent i java element ijavaelement element parent element override je attribute jeattribute get parent getparent f parent fparent i java element ijavaelement get java element getjavaelement f java element fjavaelement override equals object obj obj obj obj get class getclass equals get class getclass java element javaelement java element javaelement obj f parent fparent f parent fparent f parent fparent equals f parent fparent f name fname f name fname f name fname equals f name fname f java element fjavaelement f java element fjavaelement f java element fjavaelement equals f java element fjavaelement override hash code hashcode f parent fparent f parent fparent hash code hashcode f name fname f name fname hash code hashcode f java element fjavaelement f java element fjavaelement hash code hashcode override object get wrapped object getwrappedobject f java element fjavaelement override string get label getlabel string buffer stringbuffer string buffer stringbuffer f name fname append f name fname append f java element fjavaelement append java element string class name classname f java element fjavaelement get class getclass get name getname append class name classname substring class name classname last index of lastindexof append append java element labels javaelementlabels get element label getelementlabel f java element fjavaelement label options f java element fjavaelement exists append exist to string tostring override je attribute jeattribute get children getchildren f java element fjavaelement empty array list arraylist je attribute jeattribute result array list arraylist f java element fjavaelement i parent iparent add parent children addparentchildren result i parent iparent f java element fjavaelement add java element children addjavaelementchildren result f java element fjavaelement f java element fjavaelement i java model ijavamodel add java model children addjavamodelchildren result i java model ijavamodel f java element fjavaelement f java element fjavaelement i java project ijavaproject add java project children addjavaprojectchildren result i java project ijavaproject f java element fjavaelement f java element fjavaelement i package fragment root ipackagefragmentroot add package fragment root children addpackagefragmentrootchildren result i package fragment root ipackagefragmentroot f java element fjavaelement f java element fjavaelement i package fragment ipackagefragment add package fragment children addpackagefragmentchildren result i package fragment ipackagefragment f java element fjavaelement f java element fjavaelement i type root ityperoot add type root children addtyperootchildren result i type root ityperoot f java element fjavaelement f java element fjavaelement i class file iclassfile add class file children addclassfilechildren result i class file iclassfile f java element fjavaelement f java element fjavaelement i compilation unit icompilationunit add compilation unit children addcompilationunitchildren result i compilation unit icompilationunit f java element fjavaelement f java element fjavaelement i type itype add type children addtypechildren result i type itype f java element fjavaelement f java element fjavaelement i method imethod add method children addmethodchildren result i method imethod f java element fjavaelement f java element fjavaelement i member imember add member children addmemberchildren result i member imember f java element fjavaelement f java element fjavaelement i type parameter itypeparameter add type parameter children addtypeparameterchildren result i type parameter itypeparameter f java element fjavaelement f java element fjavaelement i local variable ilocalvariable add local variable children addlocalvariablechildren result i local variable ilocalvariable f java element fjavaelement f java element fjavaelement i annotation iannotation add annotation children addannotationchildren result i annotation iannotation f java element fjavaelement f java element fjavaelement i annot atable iannotatable add annot atable children addannotatablechildren result i annot atable iannotatable f java element fjavaelement result to array toarray je attribute jeattribute result size add parent children addparentchildren array list arraylist je attribute jeattribute result i parent iparent parent result add java element children property javaelementchildrenproperty children override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements parent get children getchildren add java element children addjavaelementchildren array list arraylist je attribute jeattribute result i java element ijavaelement java element javaelement result add java element javaelement parent java element javaelement get parent getparent result add java element javaelement primary element java element javaelement get primary element getprimaryelement result add java element javaelement java model java element javaelement get java model getjavamodel result add java element javaelement java project java element javaelement get java project getjavaproject result add je resource jeresource create resource java element javaelement get resource getresource result add je resource jeresource compute resource callable i resource iresource override i resource iresource call java model exception javamodelexception java element javaelement get corresponding resource getcorrespondingresource result add je resource jeresource compute underlying resource callable i resource iresource override i resource iresource call java model exception javamodelexception java element javaelement get underlying resource getunderlyingresource add java model children addjavamodelchildren array list arraylist je attribute jeattribute result i java model ijavamodel java model javamodel result add java element children property javaelementchildrenproperty java projects override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements java model javamodel get java projects getjavaprojects result add java element children property javaelementchildrenproperty java resources override je attribute jeattribute compute children computechildren java model exception javamodelexception create resources createresources java model javamodel get non java resources getnonjavaresources add java project children addjavaprojectchildren array list arraylist je attribute jeattribute result i java project ijavaproject project result add java element children property javaelementchildrenproperty fragment roots override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements project get all package fragment roots getallpackagefragmentroots result add java element children property javaelementchildrenproperty fragment roots override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements project get package fragment roots getpackagefragmentroots result add java element children property javaelementchildrenproperty fragments override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements project get package fragments getpackagefragments result add java element children property javaelementchildrenproperty java resources override je attribute jeattribute compute children computechildren java model exception javamodelexception create resources createresources project get non java resources getnonjavaresources result add je resource jeresource create project project get project getproject result add java element children property javaelementchildrenproperty required project names override je attribute jeattribute compute children computechildren java model exception javamodelexception create strings createstrings project get required project names getrequiredprojectnames result add java element children property javaelementchildrenproperty options override je attribute jeattribute compute children computechildren create options createoptions project get options getoptions result add java element children property javaelementchildrenproperty options override je attribute jeattribute compute children computechildren create options createoptions project get options getoptions result add java element children property javaelementchildrenproperty raw classpath override je attribute jeattribute compute children computechildren java model exception javamodelexception createcpentries project get raw classpath getrawclasspath result add java element children property javaelementchildrenproperty reference d referenced classpath entries override je attribute jeattribute compute children computechildren java model exception javamodelexception createcpentries project get referenced classpath entries getreferencedclasspathentries result add java element children property javaelementchildrenproperty resolved classpath override je attribute jeattribute compute children computechildren java model exception javamodelexception createcpentries project get resolved classpath getresolvedclasspath add package fragment root children addpackagefragmentrootchildren array list arraylist je attribute jeattribute result i package fragment root ipackagefragmentroot package fragment root packagefragmentroot result add java element children property javaelementchildrenproperty java resources override je attribute jeattribute compute children computechildren java model exception javamodelexception create resources createresources package fragment root packagefragmentroot get non java resources getnonjavaresources result add je classpath entry jeclasspathentry compute raw classpath entry callable i classpath entry iclasspathentry override i classpath entry iclasspathentry call java model exception javamodelexception package fragment root packagefragmentroot get raw classpath entry getrawclasspathentry result add je classpath entry jeclasspathentry compute resolved classpath entry callable i classpath entry iclasspathentry override i classpath entry iclasspathentry call java model exception javamodelexception package fragment root packagefragmentroot get resolved classpath entry getresolvedclasspathentry add package fragment children addpackagefragmentchildren array list arraylist je attribute jeattribute result i package fragment ipackagefragment package fragment packagefragment result add java element children property javaelementchildrenproperty compilation units override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements package fragment packagefragment get compilation units getcompilationunits result add java element children property javaelementchildrenproperty files override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements package fragment packagefragment get class files getclassfiles result add java element children property javaelementchildrenproperty java resources override je attribute jeattribute compute children computechildren java model exception javamodelexception create resources createresources package fragment packagefragment get non java resources getnonjavaresources add type root children addtyperootchildren array list arraylist je attribute jeattribute result i type root ityperoot type root typeroot result add java element javaelement compute find primary type callable i java element ijavaelement override i java element ijavaelement call type root typeroot find primary type findprimarytype add class file children addclassfilechildren array list arraylist je attribute jeattribute result i class file iclassfile class file classfile result add java element javaelement compute type callable i java element ijavaelement override i java element ijavaelement call java model exception javamodelexception class file classfile get type gettype add compilation unit children addcompilationunitchildren array list arraylist je attribute jeattribute result i compilation unit icompilationunit compilation unit compilationunit todo working copy owner workingcopyowner result add java element javaelement primary compilation unit compilationunit get primary getprimary result add java element children property javaelementchildrenproperty types override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements compilation unit compilationunit get types gettypes result add java element children property javaelementchildrenproperty types override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements compilation unit compilationunit get all types getalltypes result add java element javaelement container compilation unit compilationunit get import container getimportcontainer result add java element children property javaelementchildrenproperty imports override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements compilation unit compilationunit get imports getimports result add java element children property javaelementchildrenproperty declarations override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements compilation unit compilationunit get package declarations getpackagedeclarations add member children addmemberchildren array list arraylist je attribute jeattribute result i member imember member result add java element javaelement file member get class file getclassfile result add java element javaelement compilation unit member get compilation unit getcompilationunit result add java element javaelement type root member get type root gettyperoot result add java element javaelement declaring type member get declaring type getdeclaringtype result add java element children property javaelementchildrenproperty cat egories categories override je attribute jeattribute compute children computechildren java model exception javamodelexception create strings createstrings member get categories getcategories add annotation children addannotationchildren array list arraylist je attribute jeattribute result i annotation iannotation annotation result add java element children property javaelementchildrenproperty member pairs override je attribute jeattribute compute children computechildren java model exception javamodelexception i member value pair imembervaluepair member value pairs membervaluepairs annotation get member value pairs getmembervaluepairs create member value pairs createmembervaluepairs member value pairs membervaluepairs add annot atable children addannotatablechildren array list arraylist je attribute jeattribute result i annot atable iannotatable annot atable annotatable result add java element children property javaelementchildrenproperty annotations override je attribute jeattribute compute children computechildren java model exception javamodelexception i annotation iannotation annotations annot atable annotatable get annotations getannotations create java elements createjavaelements annotations add type children addtypechildren array list arraylist je attribute jeattribute result i type itype type result add java element property javaelementproperty resolved type is resolved isresolved result add java element property javaelementproperty key type get key getkey result add java element javaelement fragment type get package fragment getpackagefragment result add java element children property javaelementchildrenproperty type parameters override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements type get type parameters gettypeparameters result add java element children property javaelementchildrenproperty type parameter signatures override je attribute jeattribute compute children computechildren java model exception javamodelexception create strings createstrings type get type parameter signatures gettypeparametersignatures result add java element property javaelementproperty superclass override object compute value computevalue exception type get superclass name getsuperclassname result add java element property javaelementproperty superclass type signature override object compute value computevalue exception type get superclass type signature getsuperclasstypesignature result add java element children property javaelementchildrenproperty names override je attribute jeattribute compute children computechildren java model exception javamodelexception create strings createstrings type get super interface names getsuperinterfacenames result add java element children property javaelementchildrenproperty type signatures override je attribute jeattribute compute children computechildren java model exception javamodelexception create strings createstrings type get super interface type signatures getsuperinterfacetypesignatures result add java element children property javaelementchildrenproperty fields override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements type get fields getfields result add java element children property javaelementchildrenproperty init ializers initializers override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements type get initializers getinitializers result add java element children property javaelementchildrenproperty methods override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements type get methods getmethods result add java element children property javaelementchildrenproperty types override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements type get types gettypes add method children addmethodchildren array list arraylist je attribute jeattribute result i method imethod method result add java element children property javaelementchildrenproperty exception types override je attribute jeattribute compute children computechildren java model exception javamodelexception create strings createstrings method get exception types getexceptiontypes result add java element children property javaelementchildrenproperty parameters override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements method get parameters getparameters result add java element children property javaelementchildrenproperty parameter names override je attribute jeattribute compute children computechildren java model exception javamodelexception create strings createstrings method get parameter names getparameternames result add java element children property javaelementchildrenproperty parameter types override je attribute jeattribute compute children computechildren java model exception javamodelexception create strings createstrings method get parameter types getparametertypes result add java element children property javaelementchildrenproperty type parameters override je attribute jeattribute compute children computechildren java model exception javamodelexception create java elements createjavaelements method get type parameters gettypeparameters result add java element children property javaelementchildrenproperty type parameter signatures override deprecated je attribute jeattribute compute children computechildren java model exception javamodelexception create strings createstrings method get type parameter signatures gettypeparametersignatures result add je member value pair jemembervaluepair method get default value getdefaultvalue java model exception javamodelexception result add error add type parameter children addtypeparameterchildren array list arraylist je attribute jeattribute result i type parameter itypeparameter type parameter typeparameter result add java element javaelement type root type parameter typeparameter get type root gettyperoot result add java element javaelement declaring member type parameter typeparameter get declaring member getdeclaringmember result add java element children property javaelementchildrenproperty bounds override je attribute jeattribute compute children computechildren java model exception javamodelexception create strings createstrings type parameter typeparameter get bounds getbounds result add java element children property javaelementchildrenproperty bounds signatures override je attribute jeattribute compute children computechildren java model exception javamodelexception create strings createstrings type parameter typeparameter get bounds signatures getboundssignatures add local variable children addlocalvariablechildren array list arraylist je attribute jeattribute result i local variable ilocalvariable local variable localvariable result add java element javaelement type root local variable localvariable get type root gettyperoot result add java element javaelement declaring member local variable localvariable get declaring member getdeclaringmember java element javaelement create java elements createjavaelements je attribute jeattribute parent object java elements javaelements java element javaelement je children jechildren java element javaelement java elements javaelements length java elements javaelements length je children jechildren java element javaelement parent i java element ijavaelement java elements javaelements je children jechildren java element javaelement create java elements createjavaelements je attribute jeattribute parent i java element ijavaelement java elements javaelements java element javaelement je children jechildren java element javaelement java elements javaelements length java elements javaelements length je children jechildren java element javaelement parent java elements javaelements je children jechildren je attribute jeattribute create resources createresources je attribute jeattribute parent object resources je attribute jeattribute resource children resourcechildren je attribute jeattribute resources length resources length object resource resources resource i resource iresource resource children resourcechildren je resource jeresource parent i resource iresource resource resource i jar entry resource ijarentryresource resource children resourcechildren je jar entry resource jejarentryresource parent i jar entry resource ijarentryresource resource resource children resourcechildren java element property javaelementproperty parent resource resource children resourcechildren je attribute jeattribute create member value pairs createmembervaluepairs je attribute jeattribute parent i member value pair imembervaluepair mv pairs mvpairs je attribute jeattribute mv pair children mvpairchildren je attribute jeattribute mv pairs mvpairs length mv pairs mvpairs length i member value pair imembervaluepair mv pair mvpair mv pairs mvpairs mv pair children mvpairchildren je member value pair jemembervaluepair parent mv pair mvpair mv pair children mvpairchildren je attribute jeattribute createcpentries je attribute jeattribute parent i classpath entry iclasspathentry entries je attribute jeattribute entry children entrychildren je attribute jeattribute entries length entries length i classpath entry iclasspathentry entry entries entry children entrychildren je classpath entry jeclasspathentry parent entry entry children entrychildren je attribute jeattribute create options createoptions je attribute jeattribute parent map string string options array list arraylist entry string string entries array list arraylist options entry set entryset collections sort entries comparator entry string string override compare entry string string entry string string get key getkey compare to compareto get key getkey je attribute jeattribute children je attribute jeattribute entries size entries size entry string string entry entries children java element property javaelementproperty parent entry get key getkey entry get value getvalue children je attribute jeattribute create strings createstrings je attribute jeattribute parent string strings je attribute jeattribute children je attribute jeattribute strings length strings length children java element property javaelementproperty parent strings children je attribute jeattribute compute je attribute jeattribute parent string callable i java element ijavaelement compute r computer i java element ijavaelement java element javaelement compute r computer call create parent java element javaelement exception error parent je attribute jeattribute create je attribute jeattribute parent string i java element ijavaelement java element javaelement java element javaelement parent java element javaelement parent java element javaelement