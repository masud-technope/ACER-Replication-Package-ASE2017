copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal core build ers builders java string reader stringreader java util array list arraylist java util hash map hashmap java util stack javax xml parsers document builder factory documentbuilderfactory javax xml parsers parser configuration exception parserconfigurationexception org eclipse core file buf fers filebuffers file buffers filebuffers org eclipse core file buf fers filebuffers i text file buffer manager itextfilebuffermanager org eclipse core file buf fers filebuffers location kind locationkind org eclipse core resources i file ifile org eclipse core resources i marker imarker org eclipse core resources i project iproject org eclipse core resources i resource iresource org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse jface text bad location exception badlocationexception org eclipse jface text find replace document adapter findreplacedocumentadapter org eclipse jface text i document idocument org eclipse jface text i region iregion org eclipse jface text position org eclipse pde internal core build ers builders compiler flags compilerflags org dom element org dom text org xml sax attributes org xml sax input source inputsource org xml sax locator org xml sax sax exception saxexception org xml sax sax parse exception saxparseexception org xml sax helpers default handler defaulthandler xml error reporter xmlerrorreporter default handler defaulthandler att prefix att prefix child sep element data elementdata offset f error node ferrornode element data elementdata offset offset offset i file ifile f file ffile i project iproject f project fproject f error count ferrorcount ds marker factory dsmarkerfactory f marker factory fmarkerfactory org dom document fxmldocument i document idocument f text document ftextdocument stack element f element stack felementstack element f root element frootelement locator f locator flocator f highest offset fhighestoffset hash map hashmap element element data elementdata f offset table foffsettable find replace document adapter findreplacedocumentadapter f find replace adapter ffindreplaceadapter xml error reporter xmlerrorreporter i file ifile file i text file buffer manager itextfilebuffermanager manager file buffers filebuffers get text file buffer manager gettextfilebuffermanager f file ffile file f project fproject file get project getproject manager connect file get full path getfullpath location kind locationkind normalize f text document ftextdocument manager get text file buffer gettextfilebuffer file get full path getfullpath location kind locationkind normalize get document getdocument manager disconnect file get full path getfullpath location kind locationkind normalize f find replace adapter ffindreplaceadapter find replace document adapter findreplacedocumentadapter f text document ftextdocument f offset table foffsettable hash map hashmap f element stack felementstack stack remove file markers removefilemarkers core exception coreexception i file ifile get file getfile f file ffile i marker imarker add marker addmarker string message line number linenumber severity fix id fixid string category i marker imarker marker get marker factory getmarkerfactory create marker createmarker f file ffile fix id fixid category marker set attribute setattribute i marker imarker message message marker set attribute setattribute i marker imarker severity severity line number linenumber line number linenumber marker set attribute setattribute i marker imarker number line number linenumber severity i marker imarker severity error f error count ferrorcount marker core exception coreexception ds marker factory dsmarkerfactory get marker factory getmarkerfactory f marker factory fmarkerfactory f marker factory fmarkerfactory ds marker factory dsmarkerfactory f marker factory fmarkerfactory add marker addmarker sax parse exception saxparseexception severity add marker addmarker get message getmessage get line number getlinenumber severity ds marker factory dsmarkerfactory resolution ds marker factory dsmarkerfactory cat override error sax parse exception saxparseexception exception sax exception saxexception add marker addmarker exception i marker imarker severity error generate error element hierarchy generateerrorelementhierarchy override fatal error fatalerror sax parse exception saxparseexception exception sax exception saxexception add marker addmarker exception i marker imarker severity error generate error element hierarchy generateerrorelementhierarchy get error count geterrorcount f error count ferrorcount remove file markers removefilemarkers f file ffile delete markers deletemarkers i marker imarker problem i resource iresource depth f file ffile delete markers deletemarkers ds marker factory dsmarkerfactory marker i resource iresource depth core exception coreexception i marker imarker report string message severity fix id fixid string category severity compiler flags compilerflags error add marker addmarker message i marker imarker severity error fix id fixid category severity compiler flags compilerflags warning add marker addmarker message i marker imarker severity warning fix id fixid category i marker imarker report string message severity string category report message severity ds marker factory dsmarkerfactory resolution category override warning sax parse exception saxparseexception exception sax exception saxexception add marker addmarker exception i marker imarker severity warning override start document startdocument sax exception saxexception document builder factory documentbuilderfactory factory document builder factory documentbuilderfactory new instance newinstance todo dom level impl fxmldocument factory new document builder newdocumentbuilder new document newdocument parser configuration exception parserconfigurationexception override end document enddocument sax exception saxexception fxmldocument append child appendchild f root element frootelement override start element startelement string uri string local name localname string q name qname attributes attributes sax exception saxexception element element fxmldocument create element createelement q name qname attributes get length getlength element set attribute setattribute attributes getqname attributes get value getvalue f root element frootelement f root element frootelement element f element stack felementstack peek append child appendchild element f element stack felementstack push element f text document ftextdocument f offset table foffsettable element element data elementdata get start offset getstartoffset q name qname bad location exception badlocationexception override end element endelement string uri string local name localname string q name qname sax exception saxexception f element stack felementstack pop generate error element hierarchy generateerrorelementhierarchy f element stack felementstack is empty isempty element data elementdata data f offset table foffsettable f element stack felementstack pop data data f error node ferrornode override characters characters start length sax exception saxexception string buffer stringbuffer buf f buff string buffer stringbuffer length buf f buff append characters start text text fxmldocument create text node createtextnode buf f buff to string tostring f root element frootelement fxmldocument append child appendchild text f element stack felementstack peek append child appendchild text override set document locator setdocumentlocator locator locator f locator flocator locator get start offset getstartoffset string element name elementname bad location exception badlocationexception f locator flocator get line number getlinenumber col f locator flocator get column number getcolumnnumber col col f text document ftextdocument get line length getlinelength string text f text document ftextdocument f highest offset fhighestoffset f text document ftextdocument get line offset getlineoffset f highest offset fhighestoffset array list arraylist position comment positions commentpositions array list arraylist idx idx text length nls idx text index of indexof idx idx nls text index of indexof idx comment positions commentpositions add position idx idx idx idx idx text length idx nls idx text index of indexof element name elementname idx idx valid comment positions commentpositions size position pos comment positions commentpositions pos includes idx valid valid idx f highest offset fhighestoffset idx f highest offset fhighestoffset get attribute offset getattributeoffset string string offset bad location exception badlocationexception nls i region iregion name region nameregion f find replace adapter ffindreplaceadapter find offset get writable string getwritablestring name region nameregion name region nameregion get offset getoffset string get writable string getwritablestring string source string buffer stringbuffer buf string buffer stringbuffer source length source char at charat nls buf append nls amp nls buf append nls nls buf append nls nls buf append nls apos nls buf append nls quot buf append buf to string tostring string get text content gettextcontent element element element data elementdata data f offset table foffsettable element nls nls i region iregion name region nameregion f find replace adapter ffindreplaceadapter find data offset element get node name getnodename offset data offset element get node name getnodename length name region nameregion f text document ftextdocument offset name region nameregion get offset getoffset offset trim bad location exception badlocationexception get line getline element element element data elementdata data f offset table foffsettable element data f text document ftextdocument get line of offset getlineofoffset data offset exception get line getline element element string att name attname element data elementdata data f offset table foffsettable element offset get attribute offset getattributeoffset att name attname element get attribute getattribute att name attname data offset offset f text document ftextdocument get line of offset getlineofoffset offset bad location exception badlocationexception get line getline element validate content validatecontent i progress monitor iprogressmonitor monitor element get document root getdocumentroot f root element frootelement f root element frootelement normalize f root element frootelement override input source inputsource resolve entity resolveentity string public id publicid string system id systemid sax exception saxexception nls f text document ftextdocument index of indexof doctype nls input source inputsource string reader stringreader