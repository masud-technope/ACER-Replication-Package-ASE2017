copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt core jdom java util enumeration org eclipse jdt core i java element ijavaelement nodes represent structural fragments java source file document fragments implementation dom document object model jdom java dom root node node parent siblings represents root document fragment complete java document represented compilation unit node code idom compilation unit idomcompilationunit code comp rised comprised df s dfs document compilation unit created empty program matically programmatically filled created source code string code idom factory idomfactory code creation kinds nodes source code strings manipulations performed ref lected reflected contents children fragments represented linked list nodes children inserted parent node automatically linked previous nodes contents node retrieved time retrieve source code representing fragments compilation unit type method contents node root node manipulations df s dfs distinct clone creates stand copy dependent clone d cloned remove orphans host removed dependent previous host generate contents hanging fragment previous host retained memory add insert splices parented clone d cloned removed created stand existing newly inserted dependent host types dom api s apis type names source code dom not ion notion type signatures raw text type names code object code code java file code code code deprecated jdom obsolete add ition addition powerful fine grained dom ast api org eclipse jdt core dom noimplement intended implemented clients suppress warnings suppresswarnings rawtypes idom node idomnode cloneable node type constant indicating compilation unit nodes type safely code idom compilation unit idomcompilationunit code get node type getnodetype compilation unit node type constant indicating declaration nodes type safely code idom package idompackage code get node type getnodetype node type constant indicating declaration nodes type safely code idom import idomimport code get node type getnodetype node type constant indicating type declaration nodes type safely code idom type idomtype code get node type getnodetype type node type constant indicating field declaration nodes type safely code idom field idomfield code get node type getnodetype field node type constant indicating method constructor declaration nodes type safely code idom method idommethod code get node type getnodetype method node type constant indicating initializer declaration nodes type safely code idom initializer idominitializer code get node type getnodetype initializer adds parented node document fragment child node param child child node exception dom exception domexception conditions hold node allowed children child allow able allowable type child parent child ancestor node exception illegal argument exception illegalargumentexception child code code insert sibling insertsibling idom node idomnode remove add child addchild idom node idomnode child dom exception domexception illegal argument exception illegalargumentexception returns node allowed children code code node children can have children canhavechildren returns stand copy document fragment represented node dependent document node copy type code idom node idomnode code add child addchild idom node idomnode insert sibling insertsibling idom node idomnode remove object clone returns current contents document fragment character array note complete source source file compilation unit node contents contents code code node contents get char acters getcharacters returns named child node param child node code code child exists idom node idomnode get child getchild string returns enumeration children node returns empty enumeration node children including nodes children children order declared source code enumeration children enumeration get children getchildren returns current contents document fragment note complete source source file compilation unit node contents contents code code node contents string get contents getcontents returns child node children order exist source code child code code node children get children getchildren idom node idomnode get first child getfirstchild returns handle java element document fragment based parent java element param parent parent java element exception illegal argument exception illegalargumentexception parent element valid parent type node handle java element document fragment based parent java element i java element ijavaelement get java element getjavaelement i java element ijavaelement parent illegal argument exception illegalargumentexception returns node details subtypes code code string get name getname returns sibling node node node code code node idom node idomnode get next node getnextnode returns type node node type constants defined code idom node idomnode code get node type getnodetype returns parent node parent node code code node parent idom node idomnode get parent getparent returns sibling node preceding node previous node code code preceding node idom node idomnode get previous node getpreviousnode inserts parented node sibling node node param sibling sibling node exception dom exception domexception conditions hold node document fragment root sibling correct type sibling parent sibling ancestor node exception illegal argument exception illegalargumentexception sibling code code add child addchild idom node idomnode clone remove insert sibling insertsibling idom node idomnode sibling dom exception domexception illegal argument exception illegalargumentexception returns node allow able allowable child node param node potential child node code code node allow able allowable child is allow able child isallowablechild idom node idomnode node returns node signature equivalent node signature nodes siblings declarations collide represent declaration param node node code code nodes equivalent signatures is signature equal issignatureequal idom node idomnode node sep arates separates node parent siblings main taining maintaining ties node underlying document fragment document fragment removed host document dependent host document inserted document removing root node add child addchild idom node idomnode clone insert sibling insertsibling idom node idomnode remove sets node format depends node type details subtypes param code code clear set name setname string