copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt org eclipse core runtime i adaptable iadaptable org eclipse core runtime i path ipath org eclipse core resources i container icontainer org eclipse core resources i file ifile org eclipse core resources i project iproject org eclipse core resources i resource iresource org eclipse core resources i storage istorage org eclipse jface viewers content viewer contentviewer org eclipse jface viewers i base label provider ibaselabelprovider org eclipse jface viewers i label provider ilabelprovider org eclipse jface viewers viewer org eclipse jface viewers viewer comparator viewercomparator org eclipse model i workbench adapter iworkbenchadapter org eclipse jdt core flags org eclipse jdt core i field ifield org eclipse jdt core i initializer iinitializer org eclipse jdt core i jar entry resource ijarentryresource org eclipse jdt core i java element ijavaelement org eclipse jdt core i java project ijavaproject org eclipse jdt core i member imember org eclipse jdt core i method imethod org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt core i type itype org eclipse jdt core java model exception javamodelexception org eclipse jdt core signature org eclipse jdt internal corext util java model util javamodelutil org eclipse jdt internal corext util jdt flags jdtflags org eclipse jdt internal java plugin javaplugin org eclipse jdt internal package view packageview package fragment root container packagefragmentrootcontainer org eclipse jdt internal preferences members order preference cache membersorderpreferencecache viewer comparator java elements ordered element category element fragment roots sorted ordered classpath instantiated intended subclassed noextend intended subclassed clients java element comparator javaelementcomparator viewer comparator viewercomparator projects package fragmentroots packagefragmentroots package fragment packagefragment compilation units compilationunits class files classfiles resource folders resourcefolders resources decl container declaration includes categories ordered outline sort order page outlinesortorderpage types initializers methods fields members offset membersoffset java elements javaelements members order preference cache membersorderpreferencecache f member order cache fmemberordercache constructor java element comparator javaelementcomparator delay initialization collator f member order cache fmemberordercache java plugin javaplugin get default getdefault get member order preference cache getmemberorderpreferencecache override category object element element i java element ijavaelement i java element ijavaelement i java element ijavaelement element get element type getelementtype i java element ijavaelement method i method imethod method i method imethod method is constructor isconstructor get member category getmembercategory members order preference cache membersorderpreferencecache constructors flags method get flags getflags flags is static isstatic flags get member category getmembercategory members order preference cache membersorderpreferencecache methods get member category getmembercategory members order preference cache membersorderpreferencecache method i java element ijavaelement field flags i field ifield get flags getflags flags is enum isenum flags get member category getmembercategory members order preference cache membersorderpreferencecache enum constants flags is static isstatic flags get member category getmembercategory members order preference cache membersorderpreferencecache fields get member category getmembercategory members order preference cache membersorderpreferencecache fields i java element ijavaelement initializer flags i initializer iinitializer get flags getflags flags is static isstatic flags get member category getmembercategory members order preference cache membersorderpreferencecache init get member category getmembercategory members order preference cache membersorderpreferencecache init i java element ijavaelement type get member category getmembercategory members order preference cache membersorderpreferencecache type i java element ijavaelement declaration decl i java element ijavaelement container container i java element ijavaelement declaration declaration i java element ijavaelement fragment package fragment packagefragment i java element ijavaelement fragment root package fragmentroots packagefragmentroots i java element ijavaelement java project projects i java element ijavaelement file class files classfiles i java element ijavaelement compilation unit compilation units compilationunits java model exception javamodelexception is does not exist isdoesnotexist java plugin javaplugin log java elements javaelements element i file ifile resources element i project iproject projects element i container icontainer resource folders resourcefolders element i jar entry resource ijarentryresource i jar entry resource ijarentryresource element is file isfile resources resource folders resourcefolders element package fragment root container packagefragmentrootcontainer package fragmentroots packagefragmentroots get member category getmembercategory kind offset f member order cache fmemberordercache get category index getcategoryindex kind offset members offset membersoffset override compare viewer viewer object object cat category cat category needs classpath comp arision needsclasspathcomparision cat cat i package fragment root ipackagefragmentroot root get package fragment root getpackagefragmentroot i package fragment root ipackagefragmentroot root get package fragment root getpackagefragmentroot root root root check avoid expensive path access root get path getpath equals root get path getpath get class path index getclasspathindex root get class path index getclasspathindex root cat cat cat cat cat projects cat resources cat resource folders resourcefolders cat string get non java element label getnonjavaelementlabel viewer string get non java element label getnonjavaelementlabel viewer get comparator getcomparator compare compare i member imember f member order cache fmemberordercache is sort by visibility issortbyvisibility flags jdt flags jdtflags get visibility code getvisibilitycode i member imember flags jdt flags jdtflags get visibility code getvisibilitycode i member imember vis f member order cache fmemberordercache get visibility index getvisibilityindex flags f member order cache fmemberordercache get visibility index getvisibilityindex flags vis vis java model exception javamodelexception ignore string get element name getelementname string get element name getelementname handle anonymous types i type itype length length get comparator getcomparator compare i type itype get superclass name getsuperclassname i type itype get superclass name getsuperclassname java model exception javamodelexception length cmp get comparator getcomparator compare cmp cmp i method imethod string params i method imethod get parameter types getparametertypes string params i method imethod get parameter types getparametertypes len math min params length params length len cmp get comparator getcomparator compare signature to string tostring params signature to string tostring params cmp cmp params length params length i package fragment root ipackagefragmentroot get package fragment root getpackagefragmentroot object element element package fragment root container packagefragmentrootcontainer fragment root container package fragment root container packagefragmentrootcontainer package fragment root container packagefragmentrootcontainer element object roots get package fragment roots getpackagefragmentroots roots length i package fragment root ipackagefragmentroot roots res olvable resolvable java model util javamodelutil get package fragment root getpackagefragmentroot i java element ijavaelement element string get non java element label getnonjavaelementlabel viewer viewer object element workbench adapter java resources viewers label provider element i resource iresource i resource iresource element get name getname element i storage istorage i storage istorage element get name getname element i adaptable iadaptable i workbench adapter iworkbenchadapter adapter i adaptable iadaptable element get adapter getadapter i workbench adapter iworkbenchadapter adapter adapter get label getlabel element viewer content viewer contentviewer i base label provider ibaselabelprovider prov content viewer contentviewer viewer get label provider getlabelprovider prov i label provider ilabelprovider i label provider ilabelprovider prov get text gettext element get class path index getclasspathindex i package fragment root ipackagefragmentroot root i path ipath root path rootpath root get path getpath i package fragment root ipackagefragmentroot roots root get java project getjavaproject get package fragment roots getpackagefragmentroots roots length roots get path getpath equals root path rootpath java model exception javamodelexception integer max needs classpath comp arision needsclasspathcomparision object cat object cat cat package fragmentroots packagefragmentroots cat package fragmentroots packagefragmentroots cat package fragment packagefragment i package fragment ipackagefragment get parent getparent get resource getresource i project iproject cat package fragmentroots packagefragmentroots cat package fragmentroots packagefragmentroots cat package fragment packagefragment i package fragment ipackagefragment get parent getparent get resource getresource i project iproject i java project ijavaproject get java project getjavaproject equals get java project getjavaproject i java project ijavaproject get java project getjavaproject object element element i java element ijavaelement i java element ijavaelement element get java project getjavaproject element package fragment root container packagefragmentrootcontainer package fragment root container packagefragmentrootcontainer element get java project getjavaproject string get element name getelementname object element element i java element ijavaelement i java element ijavaelement element get element name getelementname element package fragment root container packagefragmentrootcontainer package fragment root container packagefragmentrootcontainer element get label getlabel element to string tostring