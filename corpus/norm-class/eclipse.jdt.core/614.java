copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal core jdom java util enumeration org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i java element ijavaelement org eclipse jdt core i type itype org eclipse jdt core compiler char operation charoperation org eclipse jdt core compiler invalid input exception invalidinputexception org eclipse jdt core jdom org eclipse jdt internal compiler parser scanner org eclipse jdt internal compiler parser terminal tokens terminaltokens org eclipse jdt internal core util char array buffer chararraybuffer org eclipse jdt internal core util messages dom type domtype implementation idom type idomtype idom type idomtype dom node domnode deprecated jdom obsolete add ition addition powerful fine grained dom ast api org eclipse jdt core dom suppress warnings suppresswarnings rawtypes dom type domtype dom member dommember idom type idomtype keyword altered doc uments documents contents code code string f type keyword ftypekeyword original inclusive source range keyword document f type range ftyperange superclass declaration altered document contents code code code code type represents string f superclass fsuperclass original inclusive source range superclass document superclass document f superclass range fsuperclassrange original inclusive souce range keyword document including surrounding whitespace keyword document f extends range fextendsrange original inclusive souce range keyword document including surrounding whitespace keyword document f implements range fimplementsrange comma delimited list interfaces type altered document contents code code code code type implement extend interfaces f interfaces finterfaces original inclusive source range list interfaces type including surrouding whitespace document interfaces array f interfaces range finterfacesrange original source range character type superclass list including character type member f open body range fopenbodyrange original source range whitespace character preceding close brace type body including character node nodes range ends position character document f close body range fclosebodyrange list interfaces type code code type extend implement interfaces string f super interfaces fsuperinterfaces char operation charoperation strings for mal formal type parameters string f type parameters ftypeparameters char operation charoperation strings type enum f is enum fisenum type annot atation annotatation type f is annotation fisannotation constructs empty type node dom type domtype constructs empty type node creates detailed type document fragment range document param document document node original contents param source range sourcerange element array int egers integers describing entire inclusive source range node document contents start include character position contents include character position array node contents exist document param identifier portion node code code node param name range namerange element array int egers integers describing entire inclusive source range node document including array qualifiers follow node param comment range commentrange element array describing comments precede member declaration matches start node source range sourcerange whitespace character comment comments array param flags int eger integer representing modifiers member int eger integer analyzed org eclipse jdt core flags param modifier range modifierrange element array describing location modifiers member source range int eger integer character modifier member int eger integer whitespace character preceeding member declaration modifiers node source code visibility array param type range typerange element array describing location keyword type declaration character positions param superclass range superclassrange element array describing location superclass type declaration character positions superclass document param extends range extendsrange element array describing location keyword type declaration including surrounding whitespace keyword document param implements list implementslist array names interfaces type code code type implement extend interfaces param implements range implementsrange element array describing location comment delimited list interfaces type including surrounding whitespace list document param implements keyword range implementskeywordrange element array describing location keyword including surrounding whitespace keyword document param open body range openbodyrange element array describing location open brace type body whitespace type declaration preceeding member type param close body range closebodyrange element array describing source range whitespace character preceeding close brace type body close brace param is class isclass type dom type domtype document source range sourcerange string name range namerange comment range commentrange flags modifier range modifierrange type range typerange superclass range superclassrange extends range extendsrange string implements list implementslist implements range implementsrange implements keyword range implementskeywordrange open body range openbodyrange close body range closebodyrange is class isclass document source range sourcerange name range namerange comment range commentrange flags modifier range modifierrange f type range ftyperange type range typerange set mask setmask mask type is class isclass f extends range fextendsrange extends range extendsrange f implements range fimplementsrange implements keyword range implementskeywordrange f superclass range fsuperclassrange superclass range superclassrange f interfaces range finterfacesrange implements range implementsrange f close body range fclosebodyrange close body range closebodyrange set mask setmask mask type superclass superclass range superclassrange set mask setmask mask type interfaces implements list implementslist f super interfaces fsuperinterfaces implements list implementslist f open body range fopenbodyrange open body range openbodyrange f close body range fclosebodyrange close body range closebodyrange set mask setmask mask detailed source indexes creates simple type document fragment range document param document document node original contents param source range sourcerange element array int egers integers describing entire inclusive source range node document contents start include character position contents include character position array node contents exist document param identifier portion node code code node param name range namerange element array int egers integers describing entire inclusive source range node document including array qualifiers follow node param flags int eger integer representing modifiers member int eger integer analyzed org eclipse jdt core flags param implements list implementslist array names interfaces type code code type implement extend interfaces param is class isclass type dom type domtype document source range sourcerange string name range namerange flags string implements list implementslist is class isclass document source range sourcerange name range namerange flags implements list implementslist source range sourcerange source range sourcerange is class isclass set mask setmask mask detailed source indexes idom type idomtype add super interface addsuperinterface string add super interface addsuperinterface string illegal argument exception illegalargumentexception illegal argument exception illegalargumentexception messages dom add null interface addnullinterface f super interfaces fsuperinterfaces f super interfaces fsuperinterfaces string f super interfaces fsuperinterfaces f super interfaces fsuperinterfaces append string appendstring f super interfaces fsuperinterfaces set super interfaces setsuperinterfaces f super interfaces fsuperinterfaces dom member dommember append member body contents appendmemberbodycontents char array buffer chararraybuffer append member body contents appendmemberbodycontents char array buffer chararraybuffer buffer buffer append f document fdocument f open body range fopenbodyrange f open body range fopenbodyrange f open body range fopenbodyrange append contents of children appendcontentsofchildren buffer buffer append f document fdocument f close body range fclosebodyrange f close body range fclosebodyrange f close body range fclosebodyrange buffer append f document fdocument f close body range fclosebodyrange f source range fsourcerange f close body range fclosebodyrange dom member dommember append member declaration contents appendmemberdeclarationcontents char array buffer chararraybuffer append member declaration contents appendmemberdeclarationcontents char array buffer chararraybuffer buffer f type keyword ftypekeyword buffer append f type keyword ftypekeyword buffer append f document fdocument f type range ftyperange f name range fnamerange f type range ftyperange buffer append f document fdocument f type range ftyperange f type range ftyperange f type range ftyperange buffer append get name getname is class isclass has interfaces hasinterfaces get mask getmask mask type superclass f extends range fextendsrange nls buffer append nls buffer append f document fdocument f extends range fextendsrange f extends range fextendsrange f extends range fextendsrange f superclass fsuperclass buffer append f superclass fsuperclass buffer append f document fdocument f superclass range fsuperclassrange f superclass range fsuperclassrange f superclass range fsuperclassrange get mask getmask mask type interfaces has interfaces hasinterfaces f implements range fimplementsrange nls buffer append nls buffer append f document fdocument f implements range fimplementsrange f implements range fimplementsrange f implements range fimplementsrange f interfaces finterfaces buffer append f interfaces finterfaces buffer append f document fdocument f interfaces range finterfacesrange f interfaces range finterfacesrange f interfaces range finterfacesrange has interfaces hasinterfaces f implements range fimplementsrange buffer append buffer append f document fdocument f interfaces range finterfacesrange f open body range fopenbodyrange f interfaces range finterfacesrange f superclass range fsuperclassrange buffer append f implements range fimplementsrange buffer append f document fdocument f superclass range fsuperclassrange f implements range fimplementsrange f superclass range fsuperclassrange buffer append f document fdocument f interfaces range finterfacesrange f open body range fopenbodyrange f interfaces range finterfacesrange buffer append f document fdocument f superclass range fsuperclassrange f open body range fopenbodyrange f superclass range fsuperclassrange get mask getmask mask type interfaces f extends range fextendsrange nls buffer append nls buffer append f document fdocument f extends range fextendsrange f extends range fextendsrange f extends range fextendsrange f interfaces finterfaces buffer append f interfaces finterfaces buffer append buffer append f document fdocument f interfaces range finterfacesrange f interfaces range finterfacesrange f interfaces range finterfacesrange f implements range fimplementsrange buffer append buffer append f document fdocument f name range fnamerange f open body range fopenbodyrange f name range fnamerange dom member dommember append simple contents appendsimplecontents char array buffer chararraybuffer append simple contents appendsimplecontents char array buffer chararraybuffer buffer append eveything buffer append f document fdocument f source range fsourcerange f name range fnamerange f source range fsourcerange append buffer append f name fname append child buffer append f document fdocument f name range fnamerange f open body range fopenbodyrange f name range fnamerange append children append contents of children appendcontentsofchildren buffer append child buffer append f document fdocument f close body range fclosebodyrange f source range fsourcerange f close body range fclosebodyrange idom node idomnode can have children canhavechildren can have children canhavechildren returns position closing brace body type method returns valid type normalized nor malization normalization get close body position getclosebodyposition f close body range fclosebodyrange dom node domnode get detailed node getdetailednode dom node domnode get detailed node getdetailednode dom node domnode get factory getfactory create type createtype get contents getcontents dom node domnode get insertion position getinsertionposition get insertion position getinsertionposition gelsdq itpjui winnt jdom i type itype create method createmethod insert nicely types f insertion position finsertionposition idom node idomnode get java element getjavaelement i java element ijavaelement get java element getjavaelement i java element ijavaelement parent illegal argument exception illegalargumentexception parent get element type getelementtype i java element ijavaelement compilation unit i compilation unit icompilationunit parent get type gettype get name getname i java element ijavaelement type i type itype parent get type gettype get name getname note creating local anonymous type supported illegal argument exception illegalargumentexception messages element illegal parent illegalparent dom member dommember get member declaration start position getmemberdeclarationstartposition get member declaration start position getmemberdeclarationstartposition f type range ftyperange idom node idomnode get node type getnodetype get node type getnodetype idom node idomnode type answers open body range position get open body end getopenbodyend f open body range fopenbodyrange idom type idomtype get superclass getsuperclass string get superclass getsuperclass become detailed becomedetailed get mask getmask mask type superclass f superclass fsuperclass f superclass fsuperclass string f document fdocument f superclass range fsuperclassrange f superclass range fsuperclassrange f superclass range fsuperclassrange idom type idomtype get super interfaces getsuperinterfaces string get super interfaces getsuperinterfaces f super interfaces fsuperinterfaces idom node idomnode is allow able child isallowablechild idom node idomnode node node type node get node type getnodetype type idom node idomnode type type idom node idomnode field type idom node idomnode method type idom node idomnode initializer idom type idomtype is class isclass is class isclass get mask getmask mask type dom node domnode dom node domnode newdomnode dom type domtype normal izes normalizes code dom node domnode code source positions include whitespace preceeding node node starts whitespace node node start normalize i line start finder ilinestartfinder finder perform open close body ranges open body end openbodyend open body start openbodystart close body start closebodystart close body end closebodyend dom node domnode dom node domnode get first child getfirstchild dom node domnode last node lastnode open body scanner scanner scanner scanner set source setsource f document fdocument scanner reset to resetto f name range fnamerange f document fdocument length current token currenttoken scanner get next token getnexttoken current token currenttoken terminal tokens terminaltokens tokennamelbrace current token currenttoken terminal tokens terminaltokens tokennameeof current token currenttoken scanner get next token getnexttoken current token currenttoken terminal tokens terminaltokens tokennamelbrace open body end openbodyend scanner current position currentposition open body start openbodystart scanner start position startposition open body end openbodyend f document fdocument length open body start openbodystart f document fdocument length invalid input exception invalidinputexception open body end openbodyend f document fdocument length open body start openbodystart f document fdocument length line start linestart finder get line start getlinestart get start position getstartposition line start linestart open body end openbodyend open body end openbodyend line start linestart open body end openbodyend get start position getstartposition last node lastnode dom node domnode get next node getnextnode last node lastnode last node lastnode last node lastnode get next node getnextnode last node lastnode dom node domnode last node lastnode get next node getnextnode scanner set source setsource f document fdocument scanner reset to resetto last node lastnode get end position getendposition f document fdocument length current token currenttoken scanner get next token getnexttoken current token currenttoken terminal tokens terminaltokens tokennamerbrace current token currenttoken terminal tokens terminaltokens tokennameeof current token currenttoken scanner get next token getnexttoken current token currenttoken terminal tokens terminaltokens tokennamerbrace close body start closebodystart scanner start position startposition close body end closebodyend scanner current position currentposition close body start closebodystart f document fdocument length close body end closebodyend f document fdocument length invalid input exception invalidinputexception close body start closebodystart f document fdocument length close body end closebodyend f document fdocument length scanner reset to resetto open body end openbodyend f document fdocument length current token currenttoken scanner get next token getnexttoken current token currenttoken terminal tokens terminaltokens tokennamerbrace current token currenttoken terminal tokens terminaltokens tokennameeof current token currenttoken scanner get next token getnexttoken current token currenttoken terminal tokens terminaltokens tokennamerbrace close body start closebodystart scanner start position startposition close body end closebodyend scanner current position currentposition close body start closebodystart f document fdocument length close body end closebodyend f document fdocument length invalid input exception invalidinputexception close body start closebodystart f document fdocument length close body end closebodyend f document fdocument length open body end openbodyend close body end closebodyend set open body range end setopenbodyrangeend open body end openbodyend set open body range start setopenbodyrangestart open body start openbodystart set close body range start setclosebodyrangestart close body start closebodystart set close body range end setclosebodyrangeend close body end closebodyend f insertion position finsertionposition finder get line start getlinestart close body start closebodystart last node lastnode f insertion position finsertionposition last node lastnode get end position getendposition f insertion position finsertionposition get close body position getclosebodyposition f insertion position finsertionposition open body end openbodyend f insertion position finsertionposition get close body position getclosebodyposition normalize finder normal izes normalizes code dom node domnode code position normalize end position normalizeendposition i line start finder ilinestartfinder finder dom node domnode node position includes characters enclosing node dom node domnode parent dom node domnode get parent getparent parent parent dom compilation unit domcompilationunit set source range end setsourcerangeend f document fdocument length parent type set source range end setsourcerangeend dom type domtype parent get close body position getclosebodyposition node position start node normalize start position normalizestartposition get end position getendposition finder set source range end setsourcerangeend get start position getstartposition offsets source indexes node amount offset offset offset offset offset range offsetrange f close body range fclosebodyrange offset offset range offsetrange f extends range fextendsrange offset offset range offsetrange f implements range fimplementsrange offset offset range offsetrange f interfaces range finterfacesrange offset offset range offsetrange f open body range fopenbodyrange offset offset range offsetrange f superclass range fsuperclassrange offset offset range offsetrange f type range ftyperange offset idom type idomtype set class setclass set class setclass become detailed becomedetailed fragment set mask setmask mask type nls f type keyword ftypekeyword nls f type keyword ftypekeyword set superclass setsuperclass sets close body range set close body range end setclosebodyrangeend f close body range fclosebodyrange sets start close body range set close body range start setclosebodyrangestart start f close body range fclosebodyrange start sets node type constructors marked frag mented fragmented names constructors reflect type idom node idomnode set name setname string set name setname string illegal argument exception illegalargumentexception illegal argument exception illegalargumentexception messages element null name nullname set name setname enumeration children get children getchildren children has more elements hasmoreelements idom node idomnode child idom node idomnode children next element nextelement child get node type getnodetype idom node idomnode method idom method idommethod child is constructor isconstructor dom node domnode child fragment sets open body range set open body range end setopenbodyrangeend f open body range fopenbodyrange sets start open body range set open body range start setopenbodyrangestart start f open body range fopenbodyrange start idom type idomtype set superclass setsuperclass string set superclass setsuperclass string superclass name superclassname become detailed becomedetailed fragment f superclass fsuperclass superclass name superclassname set mask setmask mask type superclass superclass name superclassname idom type idomtype set super interfaces setsuperinterfaces string set super interfaces setsuperinterfaces string names become detailed becomedetailed names illegal argument exception illegalargumentexception messages dom null interfaces nullinterfaces fragment f super interfaces fsuperinterfaces names names length f interfaces finterfaces f super interfaces fsuperinterfaces char operation charoperation strings set mask setmask mask type interfaces set mask setmask mask type interfaces char array buffer chararraybuffer buffer char array buffer chararraybuffer names length nls buffer append nls buffer append names f interfaces finterfaces buffer get contents getcontents sets type keyword set type keyword settypekeyword string keyword f type keyword ftypekeyword keyword dom node domnode share contents sharecontents dom node domnode share contents sharecontents dom node domnode node share contents sharecontents node dom type domtype type dom type domtype node f close body range fclosebodyrange range copy rangecopy type f close body range fclosebodyrange f extends range fextendsrange type f extends range fextendsrange f implements range fimplementsrange range copy rangecopy type f implements range fimplementsrange f interfaces finterfaces type f interfaces finterfaces f interfaces range finterfacesrange range copy rangecopy type f interfaces range finterfacesrange f open body range fopenbodyrange range copy rangecopy type f open body range fopenbodyrange f superclass fsuperclass type f superclass fsuperclass f superclass range fsuperclassrange range copy rangecopy type f superclass range fsuperclassrange f super interfaces fsuperinterfaces type f super interfaces fsuperinterfaces f type keyword ftypekeyword type f type keyword ftypekeyword f type range ftyperange range copy rangecopy type f type range ftyperange idom node idomnode to string tostring string to string tostring nls type get name getname idom type idomtype get type parameters gettypeparameters string get type parameters gettypeparameters f type parameters ftypeparameters idom type idomtype is enum isenum is enum isenum f is enum fisenum idom type idomtype is annotation isannotation is annotation isannotation f is annotation fisannotation idom type idomtype set enum setenum set enum setenum f is enum fisenum f is enum fisenum enums classes superclass set class setclass set superclass setsuperclass idom type idomtype set annotation setannotation set annotation setannotation f is annotation fisannotation f is annotation fisannotation annotation types superclass super interfaces superinterfaces set class setclass set superclass setsuperclass set super interfaces setsuperinterfaces char operation charoperation strings idom type idomtype set type parameters settypeparameters java lang string set type parameters settypeparameters string type parameters typeparameters f type parameters ftypeparameters type parameters typeparameters