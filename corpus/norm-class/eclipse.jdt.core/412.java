copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt core org eclipse core resources i resource iresource org eclipse core runtime i adaptable iadaptable org eclipse core runtime i path ipath org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime jobs i scheduling rule ischedulingrule common protocol elements java model java model elements exposed clients handles actual underlying element java model hand number handles element handles refer element guaranteed equal identical methods annotated handle require underlying elements exist methods require underlying elements exist code java model exception javamodelexception code underlying element missing code java model exception javamodelexception is does not exist isdoesnotexist code recognize common special noimplement intended implemented clients i java element ijavaelement i adaptable iadaptable constant representing java model workspace level object java element type safely link i java model ijavamodel java model constant representing java project java element type safely link i java project ijavaproject java project constant representing fragment root java element type safely link i package fragment root ipackagefragmentroot fragment root constant representing fragment java element type safely link i package fragment ipackagefragment fragment constant representing java compilation unit java element type safely link i compilation unit icompilationunit compilation unit constant representing file java element type safely link i class file iclassfile file constant representing type java element type safely link i type itype type constant representing field java element type safely link i field ifield field constant representing method constructor java element type safely link i method imethod method constant representing stand instance initializer java element type safely link i initializer iinitializer initializer constant representing declaration compilation unit java element type safely link i package declaration ipackagedeclaration declaration constant representing declarations compilation unit java element type safely link i import container iimportcontainer container constant representing declaration compilation unit java element type safely link i import declaration iimportdeclaration declaration constant representing local variable declaration java element type safely link i local variable ilocalvariable local variable constant representing type parameter declaration java element type safely link i type parameter itypeparameter type parameter constant representing annotation java element type safely link i annotation iannotation annotation returns java element exists model java elements handle objects backed actual element java elements backed actual element exist method returns code code java elements working copies element exists parent exists includes element children navigate d navigated existing java element root java model chain existing java elements hand working copies exist dest royed destroyed code i working copy iworkingcopy destroy code regular java elements working copy children parent element exist code code element exists java model code code element exist exists returns java element ancestor element type returns code code element handle method param ancestor type ancestortype type java element ancestor element type code code element i java element ijavaelement get ancestor getancestor ancestor type ancestortype returns javadoc html source element attached javadoc code code binary elements source elements code code encoding read javadoc defined content type file defined project encoding java element project encoding retrieved platform encoding javadoc doesn exist element code code returned html extracted attached javadoc transformation validation param monitor progress monitor code code exception java model exception javamodelexception element exist retrieving attached javadoc fails time d timed invalid url format javadoc doesn match expected standards anchors extracted javadoc attached javadoc code code i classpath attribute iclasspathattribute javadoc location attribute string get attached javadoc getattachedjavadoc i progress monitor iprogressmonitor monitor java model exception javamodelexception returns resource corresponds element code code resource corresponds element resource code i compilation unit icompilationunit code underlying code i file ifile code resource code i package fragment ipackagefragment code contained archive underlying code i folder ifolder code code i package fragment ipackagefragment code contained archive resource resources code i methods imethods code code i fields ifields code resource code code exception java model exception javamodelexception element exist exception occurs accessing resource i resource iresource get corresponding resource getcorrespondingresource java model exception javamodelexception returns element handle method element string get element name getelementname returns element kind encoded int eger integer handle method kind element constants declared code i java element ijavaelement code i java element ijavaelement get element type getelementtype returns string representation element handle format string identifier stable workspace sessions recreate handle code java core javacore create string code method string handle identifier java core javacore create java lang string string get handle identifier gethandleidentifier returns java model handle method java model i java model ijavamodel get java model getjavamodel returns java project element contained code code element contained java project instance code i java model ijavamodel code contained java project handle method java project code code element contained java project i java project ijavaproject get java project getjavaproject returns openable parent element openable element returned returns code code element doesn openable parent handle method openable parent code code element doesn openable parent i openable iopenable get openable getopenable returns element element code code element parent handle method parent element code code element parent i java element ijavaelement get parent getparent returns path inner most innermost resource enclosing element element included external library path returned full absolute path underlying resource relative workbench element included external library path returned absolute path archive folder file system handle method path inner most innermost resource enclosing element i path ipath get path getpath returns primary element compilation unit primary compilation unit working copy element created element descendant primary compilation unit descendant working copy binary member returned element exist primary element working copy element created element i java element ijavaelement get primary element getprimaryelement returns inner most innermost resource enclosing element element included archive archive external underlying resource archive element included external library code code returned handle method inner most innermost resource enclosing element code code element included external archive i resource iresource get resource getresource returns scheduling rule java element handle method scheduling rule java element i scheduling rule ischedulingrule get scheduling rule getschedulingrule returns smallest underlying resource element code code element contained resource underlying resource code code exception java model exception javamodelexception element exist exception occurs accessing underlying resource i resource iresource get underlying resource getunderlyingresource java model exception javamodelexception returns java element read element read structure modified java model note i resource iresource is read only isreadonly jar files read java model doesn add remove elements file underlying i file ifile writable handle method code code element read is read only isreadonly returns structure element compilation unit syntax errors code code returned structure element unknown nav igations navigations reason able reasonable defaults code get children getchildren code compilation unit syntax errors collection children parsed note imply consistency underlying resource buffer contents code code structure element exception java model exception javamodelexception element exist exception occurs accessing resource todo philippe predicate should n shouldn exception is structure known isstructureknown java model exception javamodelexception