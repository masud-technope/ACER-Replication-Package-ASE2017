copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt text java java util array list arraylist java util hash set hashset java util list java util org eclipse swt graphics image org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core runtime i status istatus org eclipse core runtime status org eclipse jface resource image descriptor imagedescriptor org eclipse jface viewers styled string styledstring org eclipse jface text contentassist i context information icontextinformation org eclipse jdt core completion context completioncontext org eclipse jdt core completion proposal completionproposal org eclipse jdt core completion requestor completionrequestor org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i java element ijavaelement org eclipse jdt core i java project ijavaproject org eclipse jdt core i type itype org eclipse jdt core java model exception javamodelexception org eclipse jdt core signature org eclipse jdt core compiler i problem iproblem org eclipse jdt core formatter code formatter codeformatter org eclipse jdt internal corext util code formatter util codeformatterutil org eclipse jdt internal corext util collections util collectionsutil org eclipse jdt internal corext util type filter typefilter org eclipse jdt internal java plugin javaplugin org eclipse jdt internal text java annotation att tribute proposal info annotationatttributeproposalinfo org eclipse jdt internal text java anonymous type completion proposal anonymoustypecompletionproposal org eclipse jdt internal text java anonymous type proposal info anonymoustypeproposalinfo org eclipse jdt internal text java field proposal info fieldproposalinfo org eclipse jdt internal text java getter setter completion proposal gettersettercompletionproposal org eclipse jdt internal text java java completion proposal javacompletionproposal org eclipse jdt internal text java java field with casted receiver completion proposal javafieldwithcastedreceivercompletionproposal org eclipse jdt internal text java java method completion proposal javamethodcompletionproposal org eclipse jdt internal text java lazy java completion proposal lazyjavacompletionproposal org eclipse jdt internal text java lazy java type completion proposal lazyjavatypecompletionproposal org eclipse jdt internal text java lazy package completion proposal lazypackagecompletionproposal org eclipse jdt internal text java method declaration completion proposal methoddeclarationcompletionproposal org eclipse jdt internal text java method proposal info methodproposalinfo org eclipse jdt internal text java override completion proposal overridecompletionproposal org eclipse jdt internal text java proposal context information proposalcontextinformation org eclipse jdt internal text java relevance computer relevancecomputer org eclipse jdt internal text javadoc javadoc inline tag completion proposal javadocinlinetagcompletionproposal org eclipse jdt internal text javadoc javadoc link type completion proposal javadoclinktypecompletionproposal org eclipse jdt internal viewsupport image descriptor registry imagedescriptorregistry java implementation code completion requestor completionrequestor code produces link i java completion proposal ijavacompletionproposal proposal descriptors received code completion requestor completionrequestor code lifecycle code completion proposal collector completionproposalcollector code instance simple pre i compilation unit icompilationunit unit offset completion proposal collector completionproposalcollector collector completion proposal collector completionproposalcollector unit unit code complete codecomplete offset collector i java completion proposal ijavacompletionproposal proposals collector get java completion proposals getjavacompletionproposals string error message errormessage collector get error message geterrormessage display process proposals pre note code completion operation collector store received proposals require consider able considerable amount memory collector reference completion operation clients instantiate subclass completion proposal collector completionproposalcollector completion requestor completionrequestor triggers method proposals parameters modify method triggers triggers method proposals modify method arguments triggers triggers types modify type triggers triggers variables modify trigger completion proposal label provider completionproposallabelprovider f label provider flabelprovider completion proposal label provider completionproposallabelprovider image descriptor registry imagedescriptorregistry f registry fregistry java plugin javaplugin get image descriptor registry getimagedescriptorregistry list i java completion proposal ijavacompletionproposal f java proposals fjavaproposals array list arraylist list i java completion proposal ijavacompletionproposal f key words fkeywords array list arraylist string f suggested method names fsuggestedmethodnames hash set hashset i compilation unit icompilationunit f compilation unit fcompilationunit i java project ijavaproject f java project fjavaproject f user replacement length fuserreplacementlength completion context completioncontext f context fcontext i problem iproblem f last problem flastproblem performance ins trumentation instrumentation f start time fstarttime fuitime invocation context code code java content assist invocation context javacontentassistinvocationcontext f invocation context finvocationcontext creates instance ready collect proposals passed code i compilation unit icompilationunit code contained link i java project ijavaproject javadoc link org eclipse jface text contentassist i completion proposal icompletionproposal get additional proposal info getadditionalproposalinfo additional info created proposals param compilation unit result collector operate completion proposal collector completionproposalcollector i compilation unit icompilationunit get java project getjavaproject creates instance ready collect proposals note proposals anonymous types method declarations created constructor compilation unit created link completion proposal collector completionproposalcollector completion proposal collector completionproposalcollector i compilation unit icompilationunit proposals passed java project code code javadoc link org eclipse jface text contentassist i completion proposal icompletionproposal get additional proposal info getadditionalproposalinfo additional info created method type proposals param project project result collector operate code code completion proposal collector completionproposalcollector i java project ijavaproject project project completion proposal collector completionproposalcollector i java project ijavaproject project i compilation unit icompilationunit ignore all ignoreall ignore all ignoreall f java project fjavaproject project f compilation unit fcompilationunit f user replacement length fuserreplacementlength ignore all ignoreall set require extended context setrequireextendedcontext creates instance ready collect proposals passed code i compilation unit icompilationunit code contained link i java project ijavaproject javadoc link org eclipse jface text contentassist i completion proposal icompletionproposal get additional proposal info getadditionalproposalinfo additional info created proposals param compilation unit result collector operate param ignore all ignoreall code code ignore kinds completion proposals completion proposal collector completionproposalcollector i compilation unit icompilationunit ignore all ignoreall get java project getjavaproject ignore all ignoreall override set ignored setignored completion proposal kind completionproposalkind ignore set ignored setignored completion proposal kind completionproposalkind ignore completion proposal kind completionproposalkind completion proposal completionproposal method declaration ignore set require extended context setrequireextendedcontext sets invocation context subclasses extend param context invocation context get invocation context getinvocationcontext set invocation context setinvocationcontext java content assist invocation context javacontentassistinvocationcontext context is not null isnotnull context f invocation context finvocationcontext context context set collector setcollector returns invocation context link set invocation context setinvocationcontext java content assist invocation context javacontentassistinvocationcontext created invocation context invocationcontext invocation context java content assist invocation context javacontentassistinvocationcontext get invocation context getinvocationcontext f invocation context finvocationcontext i compilation unit icompilationunit get compilation unit getcompilationunit set invocation context setinvocationcontext java content assist invocation context javacontentassistinvocationcontext set invocation context setinvocationcontext java content assist invocation context javacontentassistinvocationcontext f java project fjavaproject f invocation context finvocationcontext inherit doc inheritdoc subclasses replace replacing link plain linkplain create java completion proposal createjavacompletionproposal completion proposal completionproposal create java completion proposal createjavacompletionproposal override accept completion proposal completionproposal proposal start java plugin javaplugin debug result collector system current time millis currenttimemillis is filtered isfiltered proposal proposal get kind getkind completion proposal completionproposal potential method declaration accept potential method declaration acceptpotentialmethoddeclaration proposal i java completion proposal ijavacompletionproposal java proposal javaproposal create java completion proposal createjavacompletionproposal proposal java proposal javaproposal f java proposals fjavaproposals add java proposal javaproposal proposal get kind getkind completion proposal completionproposal keyword f key words fkeywords add java proposal javaproposal illegal argument exception illegalargumentexception java plugin javaplugin log status i status istatus error java plugin javaplugin get plugin id getpluginid i status istatus exception processing proposal string value of valueof proposal get completion getcompletion java plugin javaplugin debug result collector fuitime system current time millis currenttimemillis start inherit doc inheritdoc subclasses extend get context getcontext override accept context acceptcontext completion context completioncontext context f context fcontext context f label provider flabelprovider set context setcontext context inherit doc inheritdoc subclasses extend call implementation override begin reporting beginreporting java plugin javaplugin debug result collector f start time fstarttime system current time millis currenttimemillis fuitime f last problem flastproblem f java proposals fjavaproposals clear f key words fkeywords clear f suggested method names fsuggestedmethodnames clear inherit doc inheritdoc subclasses extend call implementation override completion failure completionfailure i problem iproblem problem f last problem flastproblem problem inherit doc inheritdoc subclasses extend call implementation override end reporting endreporting java plugin javaplugin debug result collector total system current time millis currenttimemillis f start time fstarttime nls system err println core collector core total fuitime nls system err println core collector fuitime returns error message error occurred code completion empty string subclasses replace extend error message empty string string get error message geterrormessage f last problem flastproblem f last problem flastproblem get message getmessage nls returns unsorted list received proposals unsorted list received proposals i java completion proposal ijavacompletionproposal get java completion proposals getjavacompletionproposals collections util collectionsutil to array toarray f java proposals fjavaproposals i java completion proposal ijavacompletionproposal returns unsorted list received keyword proposals unsorted list received keyword proposals i java completion proposal ijavacompletionproposal get keyword completion proposals getkeywordcompletionproposals collections util collectionsutil to array toarray f key words fkeywords i java completion proposal ijavacompletionproposal replacement length overrides length returned content assist infrastructure setting code assist called empty selection param length replacement length relative code assist offset equal greater set replacement length setreplacementlength length is legal islegal length f user replacement length fuserreplacementlength length computes relevance code completion proposal completionproposal code subclasses replace param proposal proposal compute relevance relevance code proposal code compute relevance computerelevance completion proposal completionproposal proposal relevance computer relevancecomputer compute relevance computerelevance proposal creates java completion proposal core proposal involve computing display label setting context method called proposal displayed user hundreds impl ementations implementations defer work labels computed lazily leverage virtual table usage needed app lying applying proposal computed impl ementations implementations code code proposal included list presented user subclasses extend replace method param proposal core completion proposal create proposal created java completion proposal code code proposal displayed i java completion proposal ijavacompletionproposal create java completion proposal createjavacompletionproposal completion proposal completionproposal proposal proposal get kind getkind completion proposal completionproposal keyword create keyword proposal createkeywordproposal proposal completion proposal completionproposal create package proposal createpackageproposal proposal completion proposal completionproposal type create type proposal createtypeproposal proposal completion proposal completionproposal javadoc type create javadoc link type proposal createjavadoclinktypeproposal proposal completion proposal completionproposal field completion proposal completionproposal javadoc field completion proposal completionproposal javadoc create field proposal createfieldproposal proposal completion proposal completionproposal field casted receiver create field with casted receiver proposal createfieldwithcastedreceiverproposal proposal completion proposal completionproposal method completion proposal completionproposal constructor invocation completion proposal completionproposal method casted receiver completion proposal completionproposal method reference completion proposal completionproposal javadoc method create method reference proposal createmethodreferenceproposal proposal completion proposal completionproposal method declaration create method declaration proposal createmethoddeclarationproposal proposal completion proposal completionproposal anonymous constructor invocation create anonymous type proposal createanonymoustypeproposal proposal get invocation context getinvocationcontext completion proposal completionproposal anonymous declaration create anonymous type proposal createanonymoustypeproposal proposal completion proposal completionproposal label create label proposal createlabelproposal proposal completion proposal completionproposal local variable completion proposal completionproposal variable declaration create local variable proposal createlocalvariableproposal proposal completion proposal completionproposal annotation attribute create annotation attribute reference proposal createannotationattributereferenceproposal proposal completion proposal completionproposal javadoc block tag completion proposal completionproposal javadoc param create javadoc simple proposal createjavadocsimpleproposal proposal completion proposal completionproposal javadoc inline tag create javadoc inline tag proposal createjavadocinlinetagproposal proposal completion proposal completionproposal potential method declaration creates context method reference proposal passed proposal kind link completion proposal completionproposal method param method proposal methodproposal method proposal create context context code method proposal methodproposal code i context information icontextinformation create method context information createmethodcontextinformation completion proposal completionproposal method proposal methodproposal is true istrue method proposal methodproposal get kind getkind completion proposal completionproposal method proposal context information proposalcontextinformation method proposal methodproposal returns compilation unit receiver operates code code code i java project ijavaproject code constructor create receiver compilation unit receiver operates code code i compilation unit icompilationunit get compilation unit getcompilationunit f compilation unit fcompilationunit returns code completion context completioncontext code completion operation code completion context completioncontext code completion operation completion requestor completionrequestor accept context acceptcontext completion context completioncontext completion context completioncontext get context getcontext f context fcontext returns cached image descriptor param descriptor image descriptor image code code image code descriptor code image get image getimage image descriptor imagedescriptor descriptor descriptor f registry fregistry descriptor returns proposal label provider receiver proposal label provider receiver completion proposal label provider completionproposallabelprovider get label provider getlabelprovider f label provider flabelprovider returns replacement length completion proposal replacement length difference values code proposal get replace end getreplaceend code code proposal get replace start getreplacestart code behavior overridden calling link set replacement length setreplacementlength param proposal completion proposal replacement length replacement length code proposal code get length getlength completion proposal completionproposal proposal start proposal get replace start getreplacestart proposal get replace end getreplaceend length f user replacement length fuserreplacementlength length start length f user replacement length fuserreplacementlength extend length start behind completion behindcompletion proposal get completion location getcompletionlocation start behind completion behindcompletion length behind completion behindcompletion start length returns code code code proposal code filtered proposed user code code valid subclasses method implementation filters proposals link plain linkplain completion requestor completionrequestor set ignored setignored set ignored setignored types preferences param proposal proposal filter code code filter code proposal code code code pass is filtered isfiltered completion proposal completionproposal proposal is ignored isignored proposal get kind getkind declaring type declaringtype get declaring type getdeclaringtype proposal declaring type declaringtype type filter typefilter is filtered isfiltered declaring type declaringtype returns type signature declaring type code completion proposal completionproposal code code code proposals declaring type code code proposals kinds method declaration method reference method annotation attribute potential method declaration anonymous declaration field returns type type param proposal completion proposal declaring type type signature declaring type code code signature to char array tochararray get declaring type getdeclaringtype completion proposal completionproposal proposal proposal get kind getkind completion proposal completionproposal method declaration completion proposal completionproposal method reference completion proposal completionproposal javadoc method completion proposal completionproposal method completion proposal completionproposal constructor invocation completion proposal completionproposal anonymous constructor invocation completion proposal completionproposal method casted receiver completion proposal completionproposal annotation attribute completion proposal completionproposal potential method declaration completion proposal completionproposal anonymous declaration completion proposal completionproposal field completion proposal completionproposal field casted receiver completion proposal completionproposal javadoc field completion proposal completionproposal javadoc declaration proposal get declaration signature getdeclarationsignature literals don declaring type object declaration nls java lang object to char array tochararray signature to char array tochararray declaration completion proposal completionproposal proposal get declaration signature getdeclarationsignature completion proposal completionproposal javadoc type completion proposal completionproposal type signature to char array tochararray proposal get signature getsignature completion proposal completionproposal local variable completion proposal completionproposal variable declaration completion proposal completionproposal keyword completion proposal completionproposal label completion proposal completionproposal javadoc block tag completion proposal completionproposal javadoc inline tag completion proposal completionproposal javadoc param is true istrue accept potential method declaration acceptpotentialmethoddeclaration completion proposal completionproposal proposal i java element ijavaelement enclosing element enclosingelement get context getcontext is extended isextended enclosing element enclosingelement get context getcontext get enclosing element getenclosingelement f compilation unit fcompilationunit compatibility reconciled moment missing bug enclosing element enclosingelement f compilation unit fcompilationunit get element at getelementat proposal get completion location getcompletionlocation enclosing element enclosingelement i type itype type i type itype enclosing element enclosingelement get ancestor getancestor i java element ijavaelement type type string prefix string value of valueof proposal get name getname completion start completionstart proposal get replace start getreplacestart completion end completionend proposal get replace end getreplaceend relevance compute relevance computerelevance proposal getter setter completion proposal gettersettercompletionproposal evaluate proposals evaluateproposals type prefix completion start completionstart completion end completionend completion start completionstart relevance f suggested method names fsuggestedmethodnames f java proposals fjavaproposals method declaration completion proposal methoddeclarationcompletionproposal evaluate proposals evaluateproposals type prefix completion start completionstart completion end completionend completion start completionstart relevance f suggested method names fsuggestedmethodnames f java proposals fjavaproposals core exception coreexception java plugin javaplugin log i java completion proposal ijavacompletionproposal create annotation attribute reference proposal createannotationattributereferenceproposal completion proposal completionproposal proposal styled string styledstring display string displaystring f label provider flabelprovider create label with type and declaration createlabelwithtypeanddeclaration proposal image descriptor imagedescriptor descriptor f label provider flabelprovider create method image descriptor createmethodimagedescriptor proposal string completion string value of valueof proposal get completion getcompletion java completion proposal javacompletionproposal java proposal javaproposal java completion proposal javacompletionproposal completion proposal get replace start getreplacestart get length getlength proposal get image getimage descriptor display string displaystring compute relevance computerelevance proposal f java project fjavaproject java proposal javaproposal set proposal info setproposalinfo annotation att tribute proposal info annotationatttributeproposalinfo f java project fjavaproject proposal java proposal javaproposal i java completion proposal ijavacompletionproposal create anonymous type proposal createanonymoustypeproposal completion proposal completionproposal proposal java content assist invocation context javacontentassistinvocationcontext invocation context invocationcontext f compilation unit fcompilationunit f java project fjavaproject declaration key declarationkey proposal get declaration key getdeclarationkey declaration key declarationkey i java element ijavaelement element f java project fjavaproject find element findelement string declaration key declarationkey element i type itype i type itype type i type itype element string completion string value of valueof proposal get completion getcompletion start proposal get replace start getreplacestart length get length getlength proposal relevance compute relevance computerelevance proposal styled string styledstring label f label provider flabelprovider create anonymous type label createanonymoustypelabel proposal java completion proposal javacompletionproposal java proposal javaproposal anonymous type completion proposal anonymoustypecompletionproposal f java project fjavaproject f compilation unit fcompilationunit invocation context invocationcontext start length completion label string value of valueof proposal get declaration signature getdeclarationsignature type relevance java proposal javaproposal set proposal info setproposalinfo anonymous type proposal info anonymoustypeproposalinfo f java project fjavaproject proposal java proposal javaproposal java model exception javamodelexception i java completion proposal ijavacompletionproposal create field proposal createfieldproposal completion proposal completionproposal proposal string completion string value of valueof proposal get completion getcompletion start proposal get replace start getreplacestart length get length getlength proposal styled string styledstring label f label provider flabelprovider create styled label createstyledlabel proposal image image get image getimage f label provider flabelprovider create field image descriptor createfieldimagedescriptor proposal relevance compute relevance computerelevance proposal java completion proposal javacompletionproposal java proposal javaproposal java completion proposal javacompletionproposal completion start length image label relevance get context getcontext is in javadoc isinjavadoc get invocation context getinvocationcontext f java project fjavaproject java proposal javaproposal set proposal info setproposalinfo field proposal info fieldproposalinfo f java project fjavaproject proposal java proposal javaproposal set trigger char acters settriggercharacters trigger java proposal javaproposal creates java completion proposal jdt core link completion proposal completionproposal field casted receiver proposal param proposal jdt core proposal java completion proposal i java completion proposal ijavacompletionproposal create field with casted receiver proposal createfieldwithcastedreceiverproposal completion proposal completionproposal proposal string completion string value of valueof proposal get completion getcompletion nls completion code formatter util codeformatterutil format code formatter codeformatter expression completion f java project fjavaproject start proposal get replace start getreplacestart length get length getlength proposal styled string styledstring label f label provider flabelprovider create styled label createstyledlabel proposal image image get image getimage f label provider flabelprovider create field image descriptor createfieldimagedescriptor proposal relevance compute relevance computerelevance proposal java completion proposal javacompletionproposal java proposal javaproposal java field with casted receiver completion proposal javafieldwithcastedreceivercompletionproposal completion start length image label relevance get context getcontext is in javadoc isinjavadoc get invocation context getinvocationcontext proposal f java project fjavaproject java proposal javaproposal set proposal info setproposalinfo field proposal info fieldproposalinfo f java project fjavaproject proposal java proposal javaproposal set trigger char acters settriggercharacters trigger java proposal javaproposal i java completion proposal ijavacompletionproposal create javadoc simple proposal createjavadocsimpleproposal completion proposal completionproposal javadoc proposal javadocproposal todo javadoc proposals string completion string value of valueof proposal get completion getcompletion start proposal get replace start getreplacestart length get length getlength proposal string label f label provider flabelprovider create simple label createsimplelabel proposal image image get image getimage f label provider flabelprovider create image descriptor createimagedescriptor proposal relevance compute relevance computerelevance proposal java completion proposal javacompletionproposal java proposal javaproposal java completion proposal javacompletionproposal completion start length image label relevance f java project fjavaproject java proposal javaproposal set proposal info setproposalinfo field proposal info fieldproposalinfo f java project fjavaproject proposal java proposal javaproposal set trigger char acters settriggercharacters trigger java proposal javaproposal lazy java completion proposal lazyjavacompletionproposal proposal lazy java completion proposal lazyjavacompletionproposal javadoc proposal javadocproposal get invocation context getinvocationcontext adapt length adaptlength proposal javadoc proposal javadocproposal proposal i java completion proposal ijavacompletionproposal create javadoc inline tag proposal createjavadocinlinetagproposal completion proposal completionproposal javadoc proposal javadocproposal lazy java completion proposal lazyjavacompletionproposal proposal javadoc inline tag completion proposal javadocinlinetagcompletionproposal javadoc proposal javadocproposal get invocation context getinvocationcontext adapt length adaptlength proposal javadoc proposal javadocproposal proposal i java completion proposal ijavacompletionproposal create keyword proposal createkeywordproposal completion proposal completionproposal proposal string completion string value of valueof proposal get completion getcompletion start proposal get replace start getreplacestart length get length getlength proposal styled string styledstring label f label provider flabelprovider create simple label createsimplelabel proposal relevance compute relevance computerelevance proposal java completion proposal javacompletionproposal completion start length label relevance i java completion proposal ijavacompletionproposal create label proposal createlabelproposal completion proposal completionproposal proposal string completion string value of valueof proposal get completion getcompletion start proposal get replace start getreplacestart length get length getlength proposal styled string styledstring label f label provider flabelprovider create simple label createsimplelabel proposal relevance compute relevance computerelevance proposal java completion proposal javacompletionproposal completion start length label relevance i java completion proposal ijavacompletionproposal create local variable proposal createlocalvariableproposal completion proposal completionproposal proposal string completion string value of valueof proposal get completion getcompletion start proposal get replace start getreplacestart length get length getlength proposal image image get image getimage f label provider flabelprovider create local image descriptor createlocalimagedescriptor proposal styled string styledstring label f label provider flabelprovider create simple label with type createsimplelabelwithtype proposal relevance compute relevance computerelevance proposal java completion proposal javacompletionproposal java proposal javaproposal java completion proposal javacompletionproposal completion start length image label relevance java proposal javaproposal set trigger char acters settriggercharacters trigger java proposal javaproposal i java completion proposal ijavacompletionproposal create method declaration proposal createmethoddeclarationproposal completion proposal completionproposal proposal f compilation unit fcompilationunit f java project fjavaproject string string value of valueof proposal get name getname string param types paramtypes signature get parameter types getparametertypes string value of valueof proposal get signature getsignature param types paramtypes length param types paramtypes signature to string tostring param types paramtypes start proposal get replace start getreplacestart length get length getlength proposal styled string styledstring label f label provider flabelprovider create override method proposal label createoverridemethodproposallabel proposal java completion proposal javacompletionproposal java proposal javaproposal override completion proposal overridecompletionproposal f java project fjavaproject f compilation unit fcompilationunit param types paramtypes start length label string value of valueof proposal get completion getcompletion java proposal javaproposal set image setimage get image getimage f label provider flabelprovider create method image descriptor createmethodimagedescriptor proposal java proposal javaproposal set proposal info setproposalinfo method proposal info methodproposalinfo f java project fjavaproject proposal java proposal javaproposal set relevance setrelevance compute relevance computerelevance proposal f suggested method names fsuggestedmethodnames add string java proposal javaproposal i java completion proposal ijavacompletionproposal create method reference proposal createmethodreferenceproposal completion proposal completionproposal method proposal methodproposal lazy java completion proposal lazyjavacompletionproposal proposal java method completion proposal javamethodcompletionproposal method proposal methodproposal get invocation context getinvocationcontext adapt length adaptlength proposal method proposal methodproposal proposal adapt length adaptlength lazy java completion proposal lazyjavacompletionproposal proposal completion proposal completionproposal core proposal coreproposal f user replacement length fuserreplacementlength proposal set replacement length setreplacementlength get length getlength core proposal coreproposal i java completion proposal ijavacompletionproposal create package proposal createpackageproposal completion proposal completionproposal proposal lazy package completion proposal lazypackagecompletionproposal proposal get invocation context getinvocationcontext i java completion proposal ijavacompletionproposal create type proposal createtypeproposal completion proposal completionproposal type proposal typeproposal lazy java completion proposal lazyjavacompletionproposal proposal lazy java type completion proposal lazyjavatypecompletionproposal type proposal typeproposal get invocation context getinvocationcontext adapt length adaptlength proposal type proposal typeproposal proposal i java completion proposal ijavacompletionproposal create javadoc link type proposal createjavadoclinktypeproposal completion proposal completionproposal type proposal typeproposal lazy java completion proposal lazyjavacompletionproposal proposal javadoc link type completion proposal javadoclinktypecompletionproposal type proposal typeproposal get invocation context getinvocationcontext adapt length adaptlength proposal type proposal typeproposal proposal