copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal text java java util collection java util org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core runtime i status istatus org eclipse jface resource image descriptor imagedescriptor org eclipse jface viewers styled string styledstring org eclipse jface text bad location exception badlocationexception org eclipse jface text i document idocument org eclipse jface text i region iregion org eclipse jface text text utilities textutilities org eclipse jface text contentassist i completion proposal extension icompletionproposalextension org eclipse jdt core i method imethod org eclipse jdt core i type itype org eclipse jdt core signature org eclipse jdt core dom rewrite import rewrite importrewrite org eclipse jdt core formatter code formatter codeformatter org eclipse jdt internal corext code manipulation codemanipulation code generation settings codegenerationsettings org eclipse jdt internal corext util code formatter util codeformatterutil org eclipse jdt internal corext util java conventions util javaconventionsutil org eclipse jdt internal corext util strings org eclipse jdt code generation codegeneration org eclipse jdt java element image descriptor javaelementimagedescriptor org eclipse jdt text java i java completion proposal ijavacompletionproposal org eclipse jdt internal java plugin javaplugin org eclipse jdt internal java plugin images javapluginimages org eclipse jdt internal preferences java preferences settings javapreferencessettings org eclipse jdt internal viewsupport java element image provider javaelementimageprovider method declaration proposal method declaration completion proposal methoddeclarationcompletionproposal java type completion proposal javatypecompletionproposal i completion proposal extension icompletionproposalextension evaluate proposals evaluateproposals i type itype type string prefix offset length relevance string suggested methods suggestedmethods collection i java completion proposal ijavacompletionproposal result core exception coreexception i method imethod methods type get methods getmethods type is interface isinterface string constructor name constructorname type get element name getelementname constructor name constructorname length constructor name constructorname starts with startswith prefix has method hasmethod methods constructor name constructorname suggested methods suggestedmethods add constructor name constructorname result add method declaration completion proposal methoddeclarationcompletionproposal type constructor name constructorname offset length relevance nls prefix length main equals prefix has method hasmethod methods prefix suggested methods suggestedmethods add prefix java conventions util javaconventionsutil validate method name validatemethodname prefix type matches i status istatus error result add method declaration completion proposal methoddeclarationcompletionproposal type prefix signature sig offset length relevance has method hasmethod i method imethod methods string methods length i method imethod curr methods curr get element name getelementname equals curr get parameter types getparametertypes length i type itype f type ftype string f return type sig freturntypesig string f method name fmethodname method declaration completion proposal methoddeclarationcompletionproposal i type itype type string method name methodname string return type sig returntypesig start length relevance nls type get compilation unit getcompilationunit start length get display name getdisplayname method name methodname return type sig returntypesig relevance is not null isnotnull type is not null isnotnull method name methodname f type ftype type f method name fmethodname method name methodname f return type sig freturntypesig return type sig returntypesig return type sig returntypesig set proposal info setproposalinfo proposal info proposalinfo type image descriptor imagedescriptor desc java element image descriptor javaelementimagedescriptor java plugin images javapluginimages desc misc java element image descriptor javaelementimagedescriptor constructor java element image provider javaelementimageprovider small size set image setimage java plugin javaplugin get image descriptor registry getimagedescriptorregistry desc set image setimage java plugin images javapluginimages java plugin images javapluginimages img misc styled string styledstring get display name getdisplayname string method name methodname string return type sig returntypesig styled string styledstring buf styled string styledstring buf append method name methodname buf append buf append return type sig returntypesig nls buf append buf append signature to string tostring return type sig returntypesig nls buf append styled string styledstring qualifier styler buf append java text messages javatextmessages method completion proposal methodcompletionproposal method label styled string styledstring qualifier styler nls buf append styled string styledstring qualifier styler buf append java text messages javatextmessages method completion proposal methodcompletionproposal constructor label styled string styledstring qualifier styler buf override update replacement string updatereplacementstring i document idocument document trigger offset import rewrite importrewrite imp rewrite imprewrite core exception coreexception bad location exception badlocationexception code generation settings codegenerationsettings settings java preferences settings javapreferencessettings get code generation settings getcodegenerationsettings f type ftype get java project getjavaproject add comments addcomments settings create comments createcomments string empty string string line delim linedelim text utilities textutilities get default line delimiter getdefaultlinedelimiter document string decl type name decltypename f type ftype get type qualified name gettypequalifiedname is interface isinterface f type ftype is interface isinterface string buffer stringbuffer buf string buffer stringbuffer add comments addcomments string comment code generation codegeneration get method comment getmethodcomment f type ftype get compilation unit getcompilationunit decl type name decltypename f method name fmethodname empty empty f return type sig freturntypesig empty line delim linedelim comment buf append comment buf append line delim linedelim f return type sig freturntypesig is interface isinterface nls buf append nls f type ftype is enum isenum nls buf append nls nls buf append nls f return type sig freturntypesig buf append signature to string tostring f return type sig freturntypesig buf append buf append f method name fmethodname is interface isinterface nls buf append buf append line delim linedelim nls buf append buf append line delim linedelim nls string body code generation codegeneration get method body content getmethodbodycontent f type ftype get compilation unit getcompilationunit decl type name decltypename f method name fmethodname f return type sig freturntypesig line delim linedelim body buf append body buf append line delim linedelim nls buf append buf append line delim linedelim string stub buf to string tostring code formatter i region iregion region document get line information of offset getlineinformationofoffset get replacement offset getreplacementoffset line start linestart region get offset getoffset indent strings compute indent units computeindentunits document line start linestart get replacement offset getreplacementoffset line start linestart settings tab width tabwidth settings indent width indentwidth string replacement code formatter util codeformatterutil format code formatter codeformatter body declarations stub indent line delim linedelim f type ftype get java project getjavaproject replacement ends with endswith line delim linedelim replacement replacement substring replacement length line delim linedelim length set replacement string setreplacementstring strings trim leading tabs and spaces trimleadingtabsandspaces replacement override char sequence charsequence get prefix completion text getprefixcompletiontext i document idocument document completion offset completionoffset don method stub proposals complete increment ally incrementally string org eclipse jface text contentassist i completion proposal extension icompletionproposalextension is auto insert able isautoinsertable override is auto insert able isautoinsertable