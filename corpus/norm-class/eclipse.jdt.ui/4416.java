copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt java util array list arraylist java util list org eclipse core runtime core exception coreexception org eclipse core resources i file ifile org eclipse core resources i folder ifolder org eclipse core resources i resource iresource org eclipse jface viewers i tree content provider itreecontentprovider org eclipse jface viewers viewer org eclipse jdt core i class file iclassfile org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i jar entry resource ijarentryresource org eclipse jdt core i java element ijavaelement org eclipse jdt core i java element delta ijavaelementdelta org eclipse jdt core i java model ijavamodel org eclipse jdt core i java project ijavaproject org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt core i parent iparent org eclipse jdt core i source reference isourcereference org eclipse jdt core java core javacore org eclipse jdt core java model exception javamodelexception base content provider java elements access java element hierarchy list ening listening java model updating presentation java model change required clients subclass listen java model update methods j face jface viewers presentation java element hierarchy surfaced content provider pre java model code i java model ijavamodel code java project code i java project ijavaproject code fragment root code i package fragment root ipackagefragmentroot code fragment code i package fragment ipackagefragment code compilation unit code i compilation unit icompilationunit code binary file code i class file iclassfile code pre note entire java project declared fragment root fragment root element appears java project fragments automatically filtered standard java element content provider standardjavaelementcontentprovider i tree content provider itreecontentprovider i working copy provider iworkingcopyprovider object children object f provide members fprovidemembers f provide working copy fprovideworkingcopy creates content provider content provider provide members compilation units files standard java element content provider standardjavaelementcontentprovider param provide members providemembers code code members compilation units param provide working copy provideworkingcopy code code working copies deprecated link standard java element content provider standardjavaelementcontentprovider compilation unit children working copies java model support original mode deprecated standard java element content provider standardjavaelementcontentprovider provide members providemembers provide working copy provideworkingcopy provide members providemembers creates code standard java element content provider standardjavaelementcontentprovider code param provide members providemembers code code members compilation units files standard java element content provider standardjavaelementcontentprovider provide members providemembers f provide members fprovidemembers provide members providemembers f provide working copy fprovideworkingcopy provide members providemembers returns members compilation units file children code code content provider members code code returned get provide members getprovidemembers f provide members fprovidemembers sets content provider supposed members compilation unit file children param code code members code code compilation units files leaves content provider set provide members setprovidemembers f provide members fprovidemembers returns code code working copies deprecated compilation unit children working copies java model support original mode deprecated get provide working copy getprovideworkingcopy f provide working copy fprovideworkingcopy param specifies working copies deprecated compilation unit children working copy java model off ers offers unified support original mode deprecated set provide working copy setprovideworkingcopy f provide working copy fprovideworkingcopy override provides working copies providesworkingcopies get provide working copy getprovideworkingcopy override object get elements getelements object parent get children getchildren parent override input changed inputchanged viewer viewer object old input oldinput object new input newinput override dispose override object get children getchildren object element exists element children element i java model ijavamodel get java projects getjavaprojects i java model ijavamodel element element i java project ijavaproject get package fragment roots getpackagefragmentroots i java project ijavaproject element element i package fragment root ipackagefragmentroot get package fragment root content getpackagefragmentrootcontent i package fragment root ipackagefragmentroot element element i package fragment ipackagefragment get package content getpackagecontent i package fragment ipackagefragment element element i folder ifolder get folder content getfoldercontent i folder ifolder element element i jar entry resource ijarentryresource i jar entry resource ijarentryresource element get children getchildren get provide members getprovidemembers element i source reference isourcereference element i parent iparent i parent iparent element get children getchildren core exception coreexception children children override has children haschildren object element get provide members getprovidemembers assume cu s cus files empty element i compilation unit icompilationunit element i class file iclassfile don drill compilation unit file element i compilation unit icompilationunit element i class file iclassfile element i file ifile element i java project ijavaproject i java project ijavaproject i java project ijavaproject element get project getproject is open isopen element i parent iparent java children fetch children i parent iparent element has children haschildren java model exception javamodelexception object children get children getchildren element children children length override object get parent getparent object element exists element internal get parent internalgetparent element evaluates children link i package fragment root ipackagefragmentroot clients override method param root root evaluate children children root exception java model exception javamodelexception fragment root exist exception occurs accessing resource object get package fragment root content getpackagefragmentrootcontent i package fragment root ipackagefragmentroot root java model exception javamodelexception i java element ijavaelement fragments root get children getchildren is project package fragment root isprojectpackagefragmentroot root fragments object non java resources nonjavaresources root get non java resources getnonjavaresources non java resources nonjavaresources fragments concatenate fragments non java resources nonjavaresources evaluates children link i java project ijavaproject clients override method param project java project evaluate children children project typically fragment roots elements exception java model exception javamodelexception java project exist exception occurs accessing resource object get package fragment roots getpackagefragmentroots i java project ijavaproject project java model exception javamodelexception project get project getproject is open isopen children i package fragment root ipackagefragmentroot roots project get package fragment roots getpackagefragmentroots list object list array list arraylist roots length replace fragments roots length i package fragment root ipackagefragmentroot root roots is project package fragment root isprojectpackagefragmentroot root object fragments get package fragment root content getpackagefragmentrootcontent root fragments length list add fragments list add root object resources project get non java resources getnonjavaresources resources length list add resources list to array toarray evaluates java projects link i java model ijavamodel clients override method param java model projects java model exception javamodelexception thrown accessing model failed object get java projects getjavaprojects i java model ijavamodel java model exception javamodelexception get java projects getjavaprojects evaluates children link i package fragment ipackagefragment clients override method param fragment fragment evaluate children children fragment exception java model exception javamodelexception fragment exist exception occurs accessing resource object get package content getpackagecontent i package fragment ipackagefragment fragment java model exception javamodelexception fragment get kind getkind i package fragment root ipackagefragmentroot source concatenate fragment get compilation units getcompilationunits fragment get non java resources getnonjavaresources concatenate fragment get class files getclassfiles fragment get non java resources getnonjavaresources evaluates children link i folder ifolder clients override method param folder folder evaluate children children folder exception core exception coreexception folder exist object get folder content getfoldercontent i folder ifolder folder core exception coreexception i resource iresource members folder members i java project ijavaproject java project javaproject java core javacore create folder get project getproject java project javaproject java project javaproject exists members is folder on classpath isfolderonclasspath java project javaproject is on classpath isonclasspath folder list i resource iresource non java resources nonjavaresources array list arraylist classpath member java resource folder members length i resource iresource member members java resources is folder on classpath isfolderonclasspath java project javaproject find package fragment root findpackagefragmentroot member get full path getfullpath non java resources nonjavaresources add member java project javaproject is on classpath isonclasspath member non java resources nonjavaresources add member i java element ijavaelement element java core javacore create member java project javaproject element i package fragment root ipackagefragmentroot java project javaproject equals element get java project getjavaproject i package fragment root ipackagefragmentroot element get kind getkind i package fragment root ipackagefragmentroot source don skip libs folders classpath project non java resources nonjavaresources add member non java resources nonjavaresources to array toarray tests java element delta path change param delta java element delta returns code code delta path change is class path change isclasspathchange i java element delta ijavaelementdelta delta test flags fragment roots delta get element getelement get element type getelementtype i java element ijavaelement fragment root flags delta get flags getflags delta get kind getkind i java element delta ijavaelementdelta changed flags i java element delta ijavaelementdelta classpath flags i java element delta ijavaelementdelta removed classpath flags i java element delta ijavaelementdelta reorder note method internal clients call method param root fragment root returns element representing root noreference method intended referenced clients object skip project package fragment root skipprojectpackagefragmentroot i package fragment root ipackagefragmentroot root is project package fragment root isprojectpackagefragmentroot root root get parent getparent root tests element empty fragment param element element test returns code code fragment empty java model exception javamodelexception thrown accessing element failed is package fragment empty ispackagefragmentempty i java element ijavaelement element java model exception javamodelexception element i package fragment ipackagefragment i package fragment ipackagefragment fragment i package fragment ipackagefragment element fragment exists fragment has children haschildren fragment get non java resources getnonjavaresources length fragment has sub packages hassubpackages tests fragment root located project param root fragment root returns code code fragment root located project is project package fragment root isprojectpackagefragmentroot i package fragment root ipackagefragmentroot root i java project ijavaproject java project javaproject root get java project getjavaproject java project javaproject java project javaproject get path getpath equals root get path getpath note method internal clients call method param element element test returns code code element exists noreference method intended referenced clients exists object element element element i resource iresource i resource iresource element exists element i java element ijavaelement i java element ijavaelement element exists note method internal clients call method param element element parent element noreference method intended referenced clients object internal get parent internalgetparent object element map resources fragment element i resource iresource i resource iresource parent i resource iresource element get parent getparent i java element ijavaelement j parent jparent java core javacore create parent http bugs eclipse org bugs bug cgi j parent jparent j parent jparent exists j parent jparent parent element i java element ijavaelement i java element ijavaelement parent i java element ijavaelement element get parent getparent skip fragment root parent element i package fragment ipackagefragment skip project package fragment root skipprojectpackagefragmentroot i package fragment root ipackagefragmentroot parent parent element i jar entry resource ijarentryresource i jar entry resource ijarentryresource element get parent getparent utility method concatenate arrays param array param array concat enated concatenated array object concatenate object object len length len length len len object res object len len system arraycopy res len system arraycopy res len len res