copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal debug actions java lang reflect invocation target exception invocationtargetexception java util array list arraylist java util list java util regex matcher java util regex pattern org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime sub monitor submonitor org eclipse jdt core i java element ijavaelement org eclipse jdt core i method imethod org eclipse jdt core i source range isourcerange org eclipse jdt core i type itype org eclipse jdt core java model exception javamodelexception org eclipse jdt core search i java search constants ijavasearchconstants org eclipse jdt core search i java search scope ijavasearchscope org eclipse jdt core search search engine searchengine org eclipse jdt core search search match searchmatch org eclipse jdt core search search participant searchparticipant org eclipse jdt core search search pattern searchpattern org eclipse jdt core search search requestor searchrequestor org eclipse jdt core search type name match typenamematch org eclipse jdt core search type name match requestor typenamematchrequestor org eclipse jdt internal debug i jdi preferences constants ijdipreferencesconstants org eclipse jdt internal debug jdidebuguiplugin org eclipse jdt internal debug console java stack trace console javastacktraceconsole org eclipse jdt internal debug console java stack trace console factory javastacktraceconsolefactory org eclipse jdt java element label provider javaelementlabelprovider org eclipse jdt javaui org eclipse jface action i action iaction org eclipse jface dialogs dialog settings dialogsettings org eclipse jface dialogs i dialog constants idialogconstants org eclipse jface dialogs i dialog settings idialogsettings org eclipse jface dialogs i input validator iinputvalidator org eclipse jface dialogs input dialog inputdialog org eclipse jface operation i runnable with progress irunnablewithprogress org eclipse jface preference i preference store ipreferencestore org eclipse jface text bad location exception badlocationexception org eclipse jface text i document idocument org eclipse jface viewers i selection iselection org eclipse swt dnd clipboard org eclipse swt dnd text transfer texttransfer org eclipse swt widgets display org eclipse i editor part ieditorpart org eclipse i workbench page iworkbenchpage org eclipse i workbench window iworkbenchwindow org eclipse i workbench window action delegate iworkbenchwindowactiondelegate org eclipse part init exception partinitexception org eclipse platformui org eclipse console console plugin consoleplugin org eclipse console i console iconsole org eclipse console i console manager iconsolemanager org eclipse dialogs element list selection dialog elementlistselectiondialog org eclipse texteditor i document provider idocumentprovider org eclipse texteditor i text editor itexteditor action delegate open clipboard action open from clipboard action openfromclipboardaction i workbench window action delegate iworkbenchwindowactiondelegate pattern match simple code open from clipboard action openfromclipboardaction code nls string simple pattern java java identifier start javajavaidentifierstart java java identifier part javajavaidentifierpart pattern match qualified code org eclipse jdt internal debug actions open from clipboard action openfromclipboardaction code match simple code open from clipboard action openfromclipboardaction code string qualified pattern nls simple pattern nls simple pattern pattern match qualified code org eclipse jdt internal debug actions open from clipboard action openfromclipboardaction code string strict qualified pattern nls simple pattern nls simple pattern pattern match whitespace characters nls string pattern match java file code open from clipboard action openfromclipboardaction java code nls string java file pattern simple pattern java pattern match java file number code open from clipboard action openfromclipboardaction java code nls nls string java file pattern java file pattern pattern match qualified number code org eclipse jdt internal debug actions open from clipboard action openfromclipboardaction code nls nls string type pattern qualified pattern pattern match stack trace code java code nls nls string stack trace parenthesized pattern java file pattern pattern match stack trace code org eclipse core runtime is legal islegal java code nls string stack trace pattern stack trace parenthesized pattern pattern match stack trace code org eclipse core runtime is legal islegal java code nls nls string stack trace qualified pattern strict qualified pattern stack trace parenthesized pattern pattern match method code org eclipse jdt internal debug actions open from clipboard action openfromclipboardaction i action iaction code code worker code nls string method pattern qualified pattern pattern match stack element code java lang string value of valueof code nls string stack pattern method pattern pattern match member field method type code open from clipboard action openfromclipboardaction code code worker code string member pattern nls qualified pattern simple pattern pattern match method code open from clipboard action openfromclipboardaction i action iaction code code worker code string method javadoc reference pattern nls qualified pattern simple pattern nls constants pattern matched invalid qualified java file java file type stack trace method stack member method javadoc reference string task action messages actionmessages open from clipboard action openfromclipboardaction opening from clipboard openingfromclipboard org eclipse i action delegate iactiondelegate org eclipse jface action i action iaction override i action iaction action clipboard clipboard clipboard display get default getdefault text transfer texttransfer text transfer texttransfer text transfer texttransfer get instance getinstance string input text inputtext string clipboard get contents getcontents text transfer texttransfer input text inputtext input text inputtext length nls open input edit dialog openinputeditdialog nls nls string trimmed text trimmedtext input text inputtext replace all replaceall list object matches array list arraylist object get java element matches getjavaelementmatches trimmed text trimmedtext matches interrupted exception interruptedexception matches clear matches size is single line input issinglelineinput input text inputtext handle matches handlematches matches trimmed text trimmedtext handle multiple line input handlemultiplelineinput input text inputtext java stack trace console javastacktraceconsole get java stack trace console getjavastacktraceconsole i console manager iconsolemanager console manager consolemanager console plugin consoleplugin get default getdefault get console manager getconsolemanager i console iconsole consoles console manager consolemanager get consoles getconsoles consoles length consoles java stack trace console javastacktraceconsole java stack trace console javastacktraceconsole consoles handle multiple line input handlemultiplelineinput string input text inputtext multiple lines simply paste console open i console manager iconsolemanager console manager consolemanager console plugin consoleplugin get default getdefault get console manager getconsolemanager java stack trace console javastacktraceconsole console get java stack trace console getjavastacktraceconsole console console get document getdocument input text inputtext console manager consolemanager show console view showconsoleview console java stack trace console factory javastacktraceconsolefactory java stack trace console factory javastacktraceconsolefactory java stack trace console factory javastacktraceconsolefactory java stack trace console factory javastacktraceconsolefactory open console openconsole input text inputtext console get java stack trace console getjavastacktraceconsole i preference store ipreferencestore preference store preferencestore jdidebuguiplugin get default getdefault get preference store getpreferencestore preference store preferencestore get boolean getboolean i jdi preferences constants ijdipreferencesconstants pref auto format jstconsole console format is single line input issinglelineinput string input text inputtext nls string line delimiter linedelimiter system get property getproperty separator string input text inputtext trim index of indexof line delimiter linedelimiter get matching pattern getmatchingpattern string matches java file pattern java file matches java file pattern java file matches type pattern type matches stack trace pattern stack trace matches method pattern method matches stack pattern stack matches member pattern member matches method javadoc reference pattern method javadoc reference matches qualified pattern qualified invalid handle single line input handlesinglelineinput string input text inputtext list object matches array list arraylist object get java element matches getjavaelementmatches input text inputtext matches handle matches handlematches matches input text inputtext interrupted exception interruptedexception parse input text search java elements param input text inputtext number param matches matched java elements number interrupted exception interruptedexception canceled user get java element matches getjavaelementmatches string input text inputtext list object matches interrupted exception interruptedexception string input text inputtext trim get matching pattern getmatchingpattern java file index of indexof string type name typename substring nls type name typename substring type name typename index of indexof java string line number linenumber substring length line number linenumber line number linenumber trim integer value of valueof line number linenumber int value intvalue get type matches gettypematches type name typename matches java file nls string type name typename substring index of indexof java get type matches gettypematches type name typename matches type index of indexof string type name typename substring type name typename type name typename trim string line number linenumber substring length line number linenumber line number linenumber trim integer value of valueof line number linenumber int value intvalue get type matches gettypematches type name typename matches stack trace last index of lastindexof last index of lastindexof string type line typeline substring trim type line typeline index of indexof string line number linenumber type line typeline substring type line typeline length trim integer value of valueof line number linenumber int value intvalue pattern pattern pattern compile stack trace qualified pattern matcher matcher pattern matcher matcher find string qualified name qualifiedname matcher group qualified name qualifiedname last index of lastindexof qualified name qualifiedname qualified name qualifiedname substring get type matches gettypematches qualified name qualifiedname matches string type name typename type line typeline substring type name typename nls type line typeline substring nls nls type name typename index of indexof java get type matches gettypematches type name typename matches method get method matches getmethodmatches matches stack index of indexof string method substring index of indexof string line number linenumber substring trim integer value of valueof line number linenumber int value intvalue get method matches getmethodmatches method matches member get member matches getmembermatches replace matches method javadoc reference get method matches getmethodmatches replace matches qualified get name matches getnamematches matches perform java search type java elements param type name typename type param matches matched java elements interrupted exception interruptedexception canceled user get type matches gettypematches string type name typename list object matches interrupted exception interruptedexception execute runnable executerunnable i runnable with progress irunnablewithprogress override i progress monitor iprogressmonitor monitor invocation target exception invocationtargetexception interrupted exception interruptedexception do type search dotypesearch type name typename matches monitor perform java search methods constructors java elements param method pattern param matches matched java elements interrupted exception interruptedexception canceled user get method matches getmethodmatches string list object matches interrupted exception interruptedexception execute runnable executerunnable i runnable with progress irunnablewithprogress override i progress monitor iprogressmonitor monitor invocation target exception invocationtargetexception interrupted exception interruptedexception do member search domembersearch matches monitor perform java search fields methods constructors java elements param member pattern param matches matched java elements interrupted exception interruptedexception canceled user get member matches getmembermatches string list object matches interrupted exception interruptedexception execute runnable executerunnable i runnable with progress irunnablewithprogress override i progress monitor iprogressmonitor monitor invocation target exception invocationtargetexception interrupted exception interruptedexception do member search domembersearch matches monitor perform java search types fields methods java elements param qualified pattern param matches matched java elements interrupted exception interruptedexception canceled user get name matches getnamematches string list object matches interrupted exception interruptedexception execute runnable executerunnable i runnable with progress irunnablewithprogress override i progress monitor iprogressmonitor monitor invocation target exception invocationtargetexception interrupted exception interruptedexception sub monitor submonitor progress sub monitor submonitor convert monitor progress begin task begintask task do type search dotypesearch matches progress new child newchild do member search domembersearch matches progress new child newchild execute runnable executerunnable i runnable with progress irunnablewithprogress runnable with progress runnablewithprogress interrupted exception interruptedexception platformui get workbench getworkbench get progress service getprogressservice busy cursor while busycursorwhile runnable with progress runnablewithprogress invocation target exception invocationtargetexception jdidebuguiplugin log handles matches param matches matched java elements param number param input text inputtext input text interrupted exception interruptedexception canceled user handle matches handlematches list object matches string input text inputtext matches size flags java element label provider javaelementlabelprovider java element label provider javaelementlabelprovider qualified java element label provider javaelementlabelprovider root i workbench window iworkbenchwindow window jdidebuguiplugin get active workbench window getactiveworkbenchwindow element list selection dialog elementlistselectiondialog dialog element list selection dialog elementlistselectiondialog window get shell getshell java element label provider javaelementlabelprovider flags org eclipse dialogs selection dialog selectiondialog get dialog bounds settings getdialogboundssettings override i dialog settings idialogsettings get dialog bounds settings getdialogboundssettings i dialog settings idialogsettings settings jdidebuguiplugin get default getdefault get dialog settings getdialogsettings dialog settings dialogsettings get or create section getorcreatesection settings open from clipboard action openfromclipboardaction dialog bounds dialogbounds dialog set title settitle action messages actionmessages open from clipboard action openfromclipboardaction open from clipboard openfromclipboard dialog set message setmessage action messages actionmessages open from clipboard action openfromclipboardaction select or enter the element to open selectorentertheelementtoopen dialog set elements setelements matches to array toarray dialog set multiple selection setmultipleselection result dialog open result i dialog constants idialogconstants object elements dialog get result getresult elements elements length open java elements openjavaelements elements matches size open java elements openjavaelements matches to array toarray matches size open input edit dialog openinputeditdialog input text inputtext opens java element java editor navigates number param elements java elements param number open java elements openjavaelements object elements elements length object elements i java element ijavaelement i java element ijavaelement element i java element ijavaelement i editor part ieditorpart editor part editorpart javaui open i n editor openineditor element goto line gotoline editor part editorpart element part init exception partinitexception jdidebuguiplugin log java model exception javamodelexception jdidebuguiplugin log jumps editor number lies java element param editor part editorpart editor param jump param element java element java model exception javamodelexception fetching java element source range fails goto line gotoline i editor part ieditorpart editor part editorpart i java element ijavaelement element java model exception javamodelexception i text editor itexteditor editor i text editor itexteditor editor part editorpart i document provider idocumentprovider provider editor get document provider getdocumentprovider i document idocument document provider get document getdocument editor get editor input geteditorinput element i method imethod i source range isourcerange source range sourcerange i method imethod element get source range getsourcerange start source range sourcerange get offset getoffset start source range sourcerange get length getlength start document get line of offset getlineofoffset start document get line of offset getlineofoffset start start document get line offset getlineoffset editor select and reveal selectandreveal start i workbench page iworkbenchpage editor get site getsite get page getpage activate editor bad location exception badlocationexception opens text input dialog user refine input text param input text inputtext input text open input edit dialog openinputeditdialog string input text inputtext i workbench window iworkbenchwindow window jdidebuguiplugin get active workbench window getactiveworkbenchwindow i input validator iinputvalidator validator i input validator iinputvalidator override string is valid isvalid string new text newtext nls new text newtext length nls nls input dialog inputdialog dialog input dialog inputdialog window get shell getshell action messages actionmessages open from clipboard action openfromclipboardaction open from clipboard openfromclipboard action messages actionmessages open from clipboard action openfromclipboardaction element to open elementtoopen input text inputtext validator result dialog open result i dialog constants idialogconstants input text inputtext dialog get value getvalue handle single line input handlesinglelineinput input text inputtext search pattern searchpattern create search pattern createsearchpattern string search for searchfor search pattern searchpattern create pattern createpattern search for searchfor i java search constants ijavasearchconstants declarations get search flags getsearchflags get search flags getsearchflags search pattern searchpattern exact match search pattern searchpattern sensitive search pattern searchpattern erasure match search requestor searchrequestor create search requestor createsearchrequestor list object matches search requestor searchrequestor override accept search match acceptsearchmatch search match searchmatch match match get acc uracy getaccuracy search match searchmatch accurate matches add match get element getelement search participant searchparticipant create search participant createsearchparticipant search participant searchparticipant search engine searchengine get default search participant getdefaultsearchparticipant perform java search type java elements todo faster performance search engine searchengine search all type names searchalltypenames java search usual search engine searchengine search api logic moved jdt core param type name typename type param matches matched java elements param monitor progress monitor do type search dotypesearch string type name typename list object matches i progress monitor iprogressmonitor monitor i java search scope ijavasearchscope scope search engine searchengine create workspace scope createworkspacescope search engine searchengine search engine searchengine search engine searchengine string package name packagename type name typename last index of lastindexof package name packagename type name typename substring type name typename type name typename substring search engine searchengine search all type names searchalltypenames package name packagename package name packagename to char array tochararray package name packagename search pattern searchpattern exact match get search flags getsearchflags type name typename to char array tochararray get search flags getsearchflags i java search constants ijavasearchconstants type scope type name match requestor typenamematchrequestor override accept type name match accepttypenamematch type name match typenamematch match matches add match get type gettype i java search constants ijavasearchconstants wait ready search monitor core exception coreexception jdidebuguiplugin log perform java search fields methods constructors java elements todo faster performance type search engine searchengine search all type names searchalltypenames narrow scope java search logic moved jdt core param member name membername member param matches matched java elements param search for methods searchformethods code code method search performed param search for constructors searchforconstructors code code constructor search performed param search for fields searchforfields code code field search performed param monitor progress monitor param work remaining work do member search domembersearch string member name membername list object matches search for methods searchformethods search for constructors searchforconstructors search for fields searchforfields i progress monitor iprogressmonitor monitor work no of searches noofsearches no of searches noofsearches search for methods searchformethods no of searches noofsearches no of searches noofsearches no of searches noofsearches search for constructors searchforconstructors no of searches noofsearches no of searches noofsearches no of searches noofsearches search for fields searchforfields no of searches noofsearches no of searches noofsearches no of searches noofsearches sub monitor submonitor progress sub monitor submonitor convert monitor progress begin task begintask task work i java search scope ijavasearchscope scope search requestor searchrequestor requestor create search requestor createsearchrequestor matches search engine searchengine search engine searchengine search engine searchengine string type name typename member name membername last index of lastindexof type name typename member name membername substring member name membername member name membername substring list object type matches typematches array list arraylist object no of searches noofsearches do type search dotypesearch type name typename type matches typematches progress new child newchild work no of searches noofsearches i type itype types i type itype type matches typematches size type matches typematches size types i type itype type matches typematches scope search engine searchengine create java search scope createjavasearchscope types scope search engine searchengine create workspace scope createworkspacescope work per search workpersearch work no of searches noofsearches search for methods searchformethods do member search domembersearch search engine searchengine member name membername i java search constants ijavasearchconstants method scope requestor progress new child newchild work per search workpersearch search for constructors searchforconstructors do member search domembersearch search engine searchengine member name membername i java search constants ijavasearchconstants constructor scope requestor progress new child newchild work per search workpersearch search for fields searchforfields do member search domembersearch search engine searchengine member name membername i java search constants ijavasearchconstants field scope requestor progress new child newchild work per search workpersearch core exception coreexception jdidebuguiplugin log do member search domembersearch search engine searchengine search engine searchengine string member name membername search for searchfor i java search scope ijavasearchscope scope search requestor searchrequestor requestor sub monitor submonitor progress monitor progressmonitor core exception coreexception search pattern searchpattern pattern create search pattern createsearchpattern member name membername search for searchfor pattern search engine searchengine search pattern create search participant createsearchparticipant scope requestor progress monitor progressmonitor org eclipse i action delegate iactiondelegate selection changed selectionchanged org eclipse jface action i action iaction org eclipse jface viewers i selection iselection override selection changed selectionchanged i action iaction action i selection iselection selection org eclipse i workbench window action delegate iworkbenchwindowactiondelegate dispose override dispose org eclipse i workbench window action delegate iworkbenchwindowactiondelegate init org eclipse i workbench window iworkbenchwindow override init i workbench window iworkbenchwindow window