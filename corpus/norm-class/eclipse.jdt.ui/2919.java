copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal corext refactoring rename java util string tokenizer stringtokenizer org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime operation canceled exception operationcanceledexception org eclipse core resources i file ifile org eclipse text edits multi text edit multitextedit org eclipse text edits replace edit replaceedit org eclipse text edits text edit textedit org eclipse text edits text edit group texteditgroup org eclipse ltk core refactoring change org eclipse ltk core refactoring group category set groupcategoryset org eclipse ltk core refactoring refactoring change descriptor refactoringchangedescriptor org eclipse ltk core refactoring refactoring descriptor refactoringdescriptor org eclipse ltk core refactoring refactoring status refactoringstatus org eclipse ltk core refactoring participants check conditions context checkconditionscontext org eclipse ltk core refactoring participants rename arguments renamearguments org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i java element ijavaelement org eclipse jdt core i java project ijavaproject org eclipse jdt core i local variable ilocalvariable org eclipse jdt core i source range isourcerange org eclipse jdt core java model exception javamodelexception org eclipse jdt core dom ast node astnode org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom initializer org eclipse jdt core dom lambda expression lambdaexpression org eclipse jdt core dom method declaration methoddeclaration org eclipse jdt core dom node finder nodefinder org eclipse jdt core dom variable declaration variabledeclaration org eclipse jdt core refactoring compilation unit change compilationunitchange org eclipse jdt core refactoring i java refactorings ijavarefactorings org eclipse jdt core refactoring descriptors rename java element descriptor renamejavaelementdescriptor org eclipse jdt internal core refactoring descriptors refactoring signature descriptor factory refactoringsignaturedescriptorfactory org eclipse jdt internal corext refactoring checks org eclipse jdt internal corext refactoring jdt refactoring descriptor comment jdtrefactoringdescriptorcomment org eclipse jdt internal corext refactoring java refactoring arguments javarefactoringarguments org eclipse jdt internal corext refactoring java refactoring descriptor util javarefactoringdescriptorutil org eclipse jdt internal corext refactoring refactoring availability tester refactoringavailabilitytester org eclipse jdt internal corext refactoring refactoring core messages refactoringcoremessages org eclipse jdt internal corext refactoring text change compatibility textchangecompatibility org eclipse jdt internal corext refactoring participants java processors javaprocessors org eclipse jdt internal corext refactoring rename rename analyze util renameanalyzeutil local analyze package localanalyzepackage org eclipse jdt internal corext refactoring tag ging tagging i reference updating ireferenceupdating org eclipse jdt internal corext refactoring util refactoringastparser org eclipse jdt internal corext refactoring util resource util resourceutil org eclipse jdt internal corext refactoring util text change manager textchangemanager org eclipse jdt internal corext util java model util javamodelutil org eclipse jdt internal corext util messages org eclipse jdt java element labels javaelementlabels org eclipse jdt refactoring refactoring save helper refactoringsavehelper org eclipse jdt internal java plugin javaplugin org eclipse jdt internal viewsupport basic element labels basicelementlabels rename local variable processor renamelocalvariableprocessor java rename processor javarenameprocessor i reference updating ireferenceupdating i local variable ilocalvariable f local variable flocalvariable i compilation unit icompilationunit f cu fcu fields modified construction f update references fupdatereferences string f current name fcurrentname string f new name fnewname compilation unit compilationunit f compilation unit node fcompilationunitnode variable declaration variabledeclaration f temp declaration node ftempdeclarationnode compilation unit change compilationunitchange f change fchange f is composite fiscomposite group category set groupcategoryset f category set fcategoryset text change manager textchangemanager f change manager fchangemanager rename analyze util renameanalyzeutil local analyze package localanalyzepackage f local analyze package flocalanalyzepackage nls string identifier org eclipse jdt rename local variable processor renamelocalvariableprocessor creates rename local variable processor param local variable localvariable local variable code code invoked scripting rename local variable processor renamelocalvariableprocessor i local variable ilocalvariable local variable localvariable f local variable flocalvariable local variable localvariable f update references fupdatereferences local variable localvariable f cu fcu i compilation unit icompilationunit local variable localvariable get ancestor getancestor i java element ijavaelement compilation unit nls f new name fnewname f is composite fiscomposite rename local variable processor renamelocalvariableprocessor java refactoring arguments javarefactoringarguments arguments refactoring status refactoringstatus status refactoring status refactoringstatus initialize status initializestatus initialize arguments status merge initialize status initializestatus creates rename local variable processor constructor code rename type processor renametypeprocessor code param local variable localvariable local variable param manager change manager param node compilation unit node param category set categoryset group category rename local variable processor renamelocalvariableprocessor i local variable ilocalvariable local variable localvariable text change manager textchangemanager manager compilation unit compilationunit node group category set groupcategoryset category set categoryset local variable localvariable f change manager fchangemanager manager f category set fcategoryset category set categoryset f compilation unit node fcompilationunitnode node f is composite fiscomposite org eclipse jdt internal corext refactoring rename java rename processor javarenameprocessor get affected project natures getaffectedprojectnatures override string get affected project natures getaffectedprojectnatures core exception coreexception java processors javaprocessors compute affected natures computeaffectednatures f local variable flocalvariable org eclipse ltk core refactoring participants refactoring processor refactoringprocessor get elements getelements override object get elements getelements object f local variable flocalvariable org eclipse ltk core refactoring participants refactoring processor refactoringprocessor get identifier getidentifier override string get identifier getidentifier identifier org eclipse ltk core refactoring participants refactoring processor refactoringprocessor get processor name getprocessorname override string get processor name getprocessorname refactoring core messages refactoringcoremessages rename temp refactoring renametemprefactoring rename org eclipse ltk core refactoring participants refactoring processor refactoringprocessor is applicable isapplicable override is applicable isapplicable core exception coreexception refactoring availability tester refactoringavailabilitytester is rename available isrenameavailable f local variable flocalvariable org eclipse jdt internal corext refactoring rename java rename processor javarenameprocessor get update references getupdatereferences override get update references getupdatereferences f update references fupdatereferences org eclipse jdt internal corext refactoring tag ging tagging i reference updating ireferenceupdating set update references setupdatereferences override set update references setupdatereferences update references updatereferences f update references fupdatereferences update references updatereferences org eclipse jdt internal corext refactoring tag ging tagging i name updating inameupdating get current element name getcurrentelementname override string get current element name getcurrentelementname f current name fcurrentname org eclipse jdt internal corext refactoring tag ging tagging i name updating inameupdating get new element name getnewelementname override string get new element name getnewelementname f new name fnewname org eclipse jdt internal corext refactoring tag ging tagging i name updating inameupdating set new element name setnewelementname java lang string override set new element name setnewelementname string new name newname is not null isnotnull new name newname f new name fnewname new name newname org eclipse jdt internal corext refactoring tag ging tagging i name updating inameupdating get new element getnewelement override object get new element getnewelement create i local variable ilocalvariable override refactoring status refactoringstatus check initial conditions checkinitialconditions i progress monitor iprogressmonitor core exception coreexception initast f temp declaration node ftempdeclarationnode f temp declaration node ftempdeclarationnode resolve binding resolvebinding refactoring status refactoringstatus create fatal error status createfatalerrorstatus refactoring core messages refactoringcoremessages rename temp refactoring renametemprefactoring select local checks is declared in isdeclaredin f temp declaration node ftempdeclarationnode method declaration methoddeclaration checks is declared in isdeclaredin f temp declaration node ftempdeclarationnode initializer checks is declared in isdeclaredin f temp declaration node ftempdeclarationnode lambda expression lambdaexpression java model util javamodelutil or higher orhigher f cu fcu get java project getjavaproject refactoring status refactoringstatus create fatal error status createfatalerrorstatus refactoring core messages refactoringcoremessages rename temp refactoring renametemprefactoring methods initializers lambda refactoring status refactoringstatus create fatal error status createfatalerrorstatus refactoring core messages refactoringcoremessages rename temp refactoring renametemprefactoring methods initializers init names initnames refactoring status refactoringstatus initast f is composite fiscomposite f compilation unit node fcompilationunitnode refactoringastparser parsewithastprovider f cu fcu i source range isourcerange source range sourcerange f local variable flocalvariable get name range getnamerange ast node astnode node finder nodefinder perform f compilation unit node fcompilationunitnode source range sourcerange get parent getparent variable declaration variabledeclaration f temp declaration node ftempdeclarationnode variable declaration variabledeclaration get parent getparent init names initnames f current name fcurrentname f temp declaration node ftempdeclarationnode get name getname get identifier getidentifier override rename modifications renamemodifications compute rename modifications computerenamemodifications core exception coreexception rename modifications renamemodifications result rename modifications renamemodifications result rename f local variable flocalvariable rename arguments renamearguments get new element name getnewelementname get update references getupdatereferences result override i file ifile get changed files getchangedfiles core exception coreexception i file ifile resource util resourceutil get file getfile f cu fcu override get save mode getsavemode refactoring save helper refactoringsavehelper save override refactoring status refactoringstatus do check final conditions docheckfinalconditions i progress monitor iprogressmonitor check conditions context checkconditionscontext context core exception coreexception operation canceled exception operationcanceledexception nls begin task begintask refactoring status refactoringstatus result check new element name checknewelementname f new name fnewname result has fatal error hasfatalerror result create edits createedits f is composite fiscomposite local analyze package localanalyzepackage local analyze packages localanalyzepackages rename analyze util renameanalyzeutil local analyze package localanalyzepackage f local analyze package flocalanalyzepackage result merge rename analyze util renameanalyzeutil analyze local renames analyzelocalrenames local analyze packages localanalyzepackages f change fchange f compilation unit node fcompilationunitnode result f is composite fiscomposite life cycle processor f change fchange f compilation unit node fcompilationunitnode f temp declaration node ftempdeclarationnode org eclipse jdt internal corext refactoring tag ging tagging i name updating inameupdating check new element name checknewelementname java lang string override refactoring status refactoringstatus check new element name checknewelementname string new name newname java model exception javamodelexception refactoring status refactoringstatus result checks check field name checkfieldname new name newname f cu fcu checks starts with lower case startswithlowercase new name newname f is composite fiscomposite string name of parent nameofparent java element labels javaelementlabels get element label getelementlabel f local variable flocalvariable get parent getparent java element labels javaelementlabels string name of type nameoftype java element labels javaelementlabels get element label getelementlabel f local variable flocalvariable get ancestor getancestor i java element ijavaelement type java element labels javaelementlabels result add warning addwarning messages format refactoring core messages refactoringcoremessages rename temp refactoring renametemprefactoring lowercase string basic element labels basicelementlabels get java element name getjavaelementname new name newname name of parent nameofparent name of type nameoftype result add warning addwarning refactoring core messages refactoringcoremessages rename temp refactoring renametemprefactoring lowercase result create edits createedits text edit textedit declaration edit declarationedit create rename edit createrenameedit f temp declaration node ftempdeclarationnode get name getname get start position getstartposition text edit textedit all rename edits allrenameedits get all rename edits getallrenameedits declaration edit declarationedit text edit textedit all unparented rename edits allunparentedrenameedits text edit textedit all rename edits allrenameedits length text edit textedit unparented declaration edit unparenteddeclarationedit f change fchange compilation unit change compilationunitchange refactoring core messages refactoringcoremessages rename temp refactoring renametemprefactoring rename f cu fcu multi text edit multitextedit root edit rootedit multi text edit multitextedit f change fchange set edit setedit root edit rootedit f change fchange set keep preview edits setkeeppreviewedits all rename edits allrenameedits length f is composite fiscomposite add copy text edit text edit parent problem reporting code clean text change compatibility textchangecompatibility add text edit addtextedit f change manager fchangemanager f cu fcu refactoring core messages refactoringcoremessages rename temp refactoring renametemprefactoring change name changename all rename edits allrenameedits copy f category set fcategoryset add separate copy problem reporting all unparented rename edits allunparentedrenameedits all rename edits allrenameedits copy all rename edits allrenameedits equals declaration edit declarationedit unparented declaration edit unparenteddeclarationedit all unparented rename edits allunparentedrenameedits root edit rootedit add child addchild all rename edits allrenameedits f change fchange add text edit group addtexteditgroup text edit group texteditgroup refactoring core messages refactoringcoremessages rename temp refactoring renametemprefactoring change name changename all rename edits allrenameedits store analysis f is composite fiscomposite f local analyze package flocalanalyzepackage rename analyze util renameanalyzeutil local analyze package localanalyzepackage unparented declaration edit unparenteddeclarationedit all unparented rename edits allunparentedrenameedits f local analyze package flocalanalyzepackage rename analyze util renameanalyzeutil local analyze package localanalyzepackage declaration edit declarationedit all rename edits allrenameedits text edit textedit get all rename edits getallrenameedits text edit textedit declaration edit declarationedit f update references fupdatereferences text edit textedit declaration edit declarationedit temp occurrence analyzer tempoccurrenceanalyzer f temp analyzer ftempanalyzer temp occurrence analyzer tempoccurrenceanalyzer f temp declaration node ftempdeclarationnode f temp analyzer ftempanalyzer perform reference offsets referenceoffsets f temp analyzer ftempanalyzer get reference and javadoc offsets getreferenceandjavadocoffsets text edit textedit all rename edits allrenameedits text edit textedit reference offsets referenceoffsets length reference offsets referenceoffsets length all rename edits allrenameedits create rename edit createrenameedit reference offsets referenceoffsets all rename edits allrenameedits reference offsets referenceoffsets length declaration edit declarationedit all rename edits allrenameedits text edit textedit create rename edit createrenameedit offset replace edit replaceedit offset f current name fcurrentname length f new name fnewname override change create change createchange i progress monitor iprogressmonitor monitor core exception coreexception monitor begin task begintask refactoring core messages refactoringcoremessages rename type processor renametypeprocessor creating rename java element descriptor renamejavaelementdescriptor descriptor create refactoring descriptor createrefactoringdescriptor f change fchange set descriptor setdescriptor refactoring change descriptor refactoringchangedescriptor descriptor f change fchange monitor rename java element descriptor renamejavaelementdescriptor create refactoring descriptor createrefactoringdescriptor string project i java project ijavaproject java project javaproject f cu fcu get java project getjavaproject java project javaproject project java project javaproject get element name getelementname string header messages format refactoring core messages refactoringcoremessages rename local variable processor renamelocalvariableprocessor descriptor description string basic element labels basicelementlabels get java element name getjavaelementname f current name fcurrentname java element labels javaelementlabels get element label getelementlabel f local variable flocalvariable get parent getparent java element labels javaelementlabels fully qualified basic element labels basicelementlabels get java element name getjavaelementname f new name fnewname string description messages format refactoring core messages refactoringcoremessages rename local variable processor renamelocalvariableprocessor descriptor description basic element labels basicelementlabels get java element name getjavaelementname f current name fcurrentname string comment jdt refactoring descriptor comment jdtrefactoringdescriptorcomment project header as string asstring rename java element descriptor renamejavaelementdescriptor descriptor refactoring signature descriptor factory refactoringsignaturedescriptorfactory create rename java element descriptor createrenamejavaelementdescriptor i java refactorings ijavarefactorings rename local variable descriptor set project setproject project descriptor set description setdescription description descriptor set comment setcomment comment descriptor set flags setflags refactoring descriptor refactoringdescriptor descriptor set java element setjavaelement f local variable flocalvariable descriptor set new name setnewname get new element name getnewelementname descriptor set update references setupdatereferences f update references fupdatereferences descriptor refactoring status refactoringstatus initialize java refactoring arguments javarefactoringarguments extended string handle extended get attribute getattribute java refactoring descriptor util javarefactoringdescriptorutil attribute input handle i java element ijavaelement element java refactoring descriptor util javarefactoringdescriptorutil handle t o element handletoelement extended get project getproject handle element element exists element get element type getelementtype i java element ijavaelement compilation unit f cu fcu i compilation unit icompilationunit element element get element type getelementtype i java element ijavaelement local variable f local variable flocalvariable i local variable ilocalvariable element f cu fcu i compilation unit icompilationunit f local variable flocalvariable get ancestor getancestor i java element ijavaelement compilation unit f cu fcu java refactoring descriptor util javarefactoringdescriptorutil create input fatal status createinputfatalstatus element get processor name getprocessorname i java refactorings ijavarefactorings rename local variable java refactoring descriptor util javarefactoringdescriptorutil create input fatal status createinputfatalstatus element get processor name getprocessorname i java refactorings ijavarefactorings rename local variable java refactoring descriptor util javarefactoringdescriptorutil create input fatal status createinputfatalstatus element get processor name getprocessorname i java refactorings ijavarefactorings rename local variable refactoring status refactoringstatus create fatal error status createfatalerrorstatus messages format refactoring core messages refactoringcoremessages initializable refactoring initializablerefactoring argument exist java refactoring descriptor util javarefactoringdescriptorutil attribute input string extended get attribute getattribute java refactoring descriptor util javarefactoringdescriptorutil attribute nls equals set new element name setnewelementname refactoring status refactoringstatus create fatal error status createfatalerrorstatus messages format refactoring core messages refactoringcoremessages initializable refactoring initializablerefactoring argument exist java refactoring descriptor util javarefactoringdescriptorutil attribute f cu fcu f local variable flocalvariable string selection extended get attribute getattribute java refactoring descriptor util javarefactoringdescriptorutil attribute selection selection offset length string tokenizer stringtokenizer tokenizer string tokenizer stringtokenizer selection tokenizer has more tokens hasmoretokens offset integer value of valueof tokenizer next token nexttoken int value intvalue tokenizer has more tokens hasmoretokens length integer value of valueof tokenizer next token nexttoken int value intvalue offset length i java element ijavaelement elements f cu fcu code select codeselect offset length elements elements length i java element ijavaelement element elements element i local variable ilocalvariable f local variable flocalvariable i local variable ilocalvariable element f local variable flocalvariable java refactoring descriptor util javarefactoringdescriptorutil create input fatal status createinputfatalstatus get processor name getprocessorname i java refactorings ijavarefactorings rename local variable java model exception javamodelexception exception java plugin javaplugin log exception refactoring status refactoringstatus create fatal error status createfatalerrorstatus messages format refactoring core messages refactoringcoremessages initializable refactoring initializablerefactoring illegal argument object selection java refactoring descriptor util javarefactoringdescriptorutil attribute selection refactoring status refactoringstatus create fatal error status createfatalerrorstatus messages format refactoring core messages refactoringcoremessages initializable refactoring initializablerefactoring argument exist java refactoring descriptor util javarefactoringdescriptorutil attribute selection string references extended get attribute getattribute java refactoring descriptor util javarefactoringdescriptorutil attribute references references f update references fupdatereferences value of valueof references boolean value booleanvalue refactoring status refactoringstatus create fatal error status createfatalerrorstatus messages format refactoring core messages refactoringcoremessages initializable refactoring initializablerefactoring argument exist java refactoring descriptor util javarefactoringdescriptorutil attribute references refactoring status refactoringstatus rename analyze util renameanalyzeutil local analyze package localanalyzepackage get local analyze package getlocalanalyzepackage f local analyze package flocalanalyzepackage