copyright code corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors code corporation initial api implementation chris aniszczyk can iszczyk caniszczyk gmail rafael oliveira nobrega rafael oliveira gmail bug org eclipse pde internal editor contentassist java util arrays java util collection java util comparator org eclipse core resources i project iproject org eclipse core runtime core exception coreexception org eclipse core runtime null progress monitor nullprogressmonitor org eclipse jdt core completion proposal completionproposal org eclipse jdt core completion requestor completionrequestor org eclipse jdt core flags org eclipse jdt core i buffer ibuffer org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i java element ijavaelement org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt core java core javacore org eclipse jdt core java model exception javamodelexception org eclipse jdt core search i java search constants ijavasearchconstants org eclipse jdt core search i java search scope ijavasearchscope org eclipse jdt core search search engine searchengine org eclipse jdt core search search pattern searchpattern org eclipse jdt core search type name requestor typenamerequestor org eclipse jdt i shared images isharedimages org eclipse jdt javaui org eclipse jface text i text viewer itextviewer org eclipse jface text contentassist i completion proposal icompletionproposal org eclipse jface text contentassist i content assist processor icontentassistprocessor org eclipse jface text contentassist i context information icontextinformation org eclipse jface text contentassist i context information validator icontextinformationvalidator org eclipse pde internal core util pde java helper pdejavahelper org eclipse swt graphics image type package completion processor typepackagecompletionprocessor i content assist processor icontentassistprocessor string f error message ferrormessage search engine searchengine f search engine fsearchengine comparator i completion proposal icompletionproposal f comparator fcomparator proposal generator proposalgenerator i completion proposal icompletionproposal generate class completion generateclasscompletion string p name pname string c name cname is class isclass i completion proposal icompletionproposal generate package completion generatepackagecompletion string p name pname type package completion processor typepackagecompletionprocessor f search engine fsearchengine search engine searchengine override i completion proposal icompletionproposal compute completion proposals computecompletionproposals i text viewer itextviewer viewer offset override i context information icontextinformation compute context information computecontextinformation i text viewer itextviewer viewer offset override get completion proposal auto activation char acters getcompletionproposalautoactivationcharacters override get context information auto activation char acters getcontextinformationautoactivationcharacters override i context information validator icontextinformationvalidator get context information validator getcontextinformationvalidator override string get error message geterrormessage f error message ferrormessage generate type package proposals generatetypepackageproposals string current content currentcontent i project iproject project collection type completion proposal typecompletionproposal start offset startoffset type scope typescope generate type package proposals generatetypepackageproposals current content currentcontent project start offset startoffset type scope typescope generate type package proposals generatetypepackageproposals string current content currentcontent i project iproject project collection type completion proposal typecompletionproposal start offset startoffset type scope typescope replace entire contents replaceentirecontents current content currentcontent remove leading spaces removeleadingspaces current content currentcontent current content currentcontent length length replace entire contents replaceentirecontents current content currentcontent length generate proposals generateproposals current content currentcontent project start offset startoffset length type scope typescope generate proposals generateproposals string current content currentcontent i project iproject project collection type completion proposal typecompletionproposal start offset startoffset length type scope typescope type package completion requestor typepackagecompletionrequestor completion requestor completionrequestor type package completion requestor typepackagecompletionrequestor set ignored setignored completion proposal completionproposal set ignored setignored completion proposal completionproposal type override accept completion proposal completionproposal proposal i shared images isharedimages images javaui get shared images getsharedimages proposal get kind getkind completion proposal completionproposal string pkg name pkgname string proposal get completion getcompletion add proposal to collection addproposaltocollection start offset startoffset length pkg name pkgname pkg name pkgname images get image getimage i shared images isharedimages img objs is interface isinterface flags is interface isinterface proposal get flags getflags string completion string proposal get completion getcompletion is interface isinterface type scope typescope i java search constants ijavasearchconstants is interface isinterface type scope typescope i java search constants ijavasearchconstants nls completion equals nls dummy don dummy showing option period completion last index of lastindexof string c name cname p name pname period c name cname completion c name cname completion substring period p name pname completion substring period image image is interface isinterface images get image getimage i shared images isharedimages img objs images get image getimage i shared images isharedimages img objs add proposal to collection addproposaltocollection start offset startoffset length c name cname nls p name pname completion image i compilation unit icompilationunit unit get working copy getworkingcopy project unit generate type proposals generatetypeproposals current content currentcontent project start offset startoffset length i buffer ibuffer buf f buff unit get buffer getbuffer nls buf f buff set contents setcontents dummy current content currentcontent completion requestor completionrequestor req type package completion requestor typepackagecompletionrequestor unit code complete codecomplete current content currentcontent length req unit discard working copy discardworkingcopy java model exception javamodelexception i compilation unit icompilationunit get working copy getworkingcopy i project iproject project java model exception javamodelexception i package fragment root ipackagefragmentroot roots java core javacore create project get package fragment roots getpackagefragmentroots roots length i package fragment ipackagefragment frag roots length roots get kind getkind i package fragment root ipackagefragmentroot source project equals roots get corresponding resource getcorrespondingresource roots is archive isarchive roots is external isexternal i java element ijavaelement elems roots get children getchildren elems length elems length elems i package fragment ipackagefragment frag i package fragment ipackagefragment elems frag nls frag get compilation unit getcompilationunit dummy java get working copy getworkingcopy nls null progress monitor nullprogressmonitor generate type proposals generatetypeproposals string current content currentcontent i project iproject project collection type completion proposal typecompletionproposal start offset startoffset length type scope typescope dynamic ally dynamically adjust search scope depending current project i java search scope ijavasearchscope scope pde java helper pdejavahelper get search scope getsearchscope project package name packagename type name typename current content currentcontent last index of lastindexof qualification perform search type type name typename current content currentcontent to char array tochararray current content currentcontent length qualification character dot perform search types pattern types nls type name typename to char array tochararray trailing dot package name packagename current content currentcontent substring to char array tochararray qualification dot type fragment type qualification type name typename current content currentcontent substring to char array tochararray trailing dot package name packagename current content currentcontent substring to char array tochararray type name requestor typenamerequestor req type name requestor typenamerequestor override accept type accepttype modifiers package name packagename simple type name simpletypename enclosing type names enclosingtypenames string path accept search jdt search engine searchengine string c name cname string simple type name simpletypename string p name pname string package name packagename string label nls c name cname nls p name pname string content nls p name pname nls c name cname i shared images isharedimages images javaui get shared images getsharedimages image image flags is interface isinterface modifiers images get image getimage i shared images isharedimages img objs images get image getimage i shared images isharedimages img objs add proposal to collection addproposaltocollection start offset startoffset length label content image note search method performance bad compared search all type names searchalltypenames method f search engine fsearchengine search all type names searchalltypenames package name packagename search pattern searchpattern exact match type name typename search pattern searchpattern prefix match type scope typescope scope req i java search constants ijavasearchconstants wait ready search core exception coreexception f error message ferrormessage get message getmessage sort comp let ions sortcompletions i completion proposal icompletionproposal proposals arrays sort proposals get comparator getcomparator comparator i completion proposal icompletionproposal get comparator getcomparator f comparator fcomparator f comparator fcomparator comparator i completion proposal icompletionproposal override compare i completion proposal icompletionproposal arg i completion proposal icompletionproposal arg i completion proposal icompletionproposal arg i completion proposal icompletionproposal arg get sort key getsortkey compare to ignore case comparetoignorecase get sort key getsortkey string get sort key getsortkey i completion proposal icompletionproposal get display string getdisplaystring f comparator fcomparator string remove leading spaces removeleadingspaces string value array valuearray to char array tochararray value array valuearray length character is whitespace iswhitespace value array valuearray nls value array valuearray length string value array valuearray value array valuearray length param param start offset startoffset param length param label param content param image add proposal to collection addproposaltocollection collection type completion proposal typecompletionproposal start offset startoffset length string label string content image image type completion proposal typecompletionproposal proposal type completion proposal typecompletionproposal content image label start offset startoffset length add proposal