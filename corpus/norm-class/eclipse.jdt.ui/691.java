copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal java editor javaeditor java util array list arraylist java util hash set hashset java util iterator java util list java util org eclipse swt widgets display org eclipse core file system filesystem i file store ifilestore org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core runtime i path ipath org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime i status istatus org eclipse core runtime null progress monitor nullprogressmonitor org eclipse core runtime status org eclipse core resources i file ifile org eclipse core resources i resource iresource org eclipse core resources resource attributes resourceattributes org eclipse core file buf fers filebuffers file buffers filebuffers org eclipse core file buf fers filebuffers i text file buffer itextfilebuffer org eclipse core file buf fers filebuffers i text file buffer manager itextfilebuffermanager org eclipse core file buf fers filebuffers location kind locationkind org eclipse text edits text edit textedit org eclipse text edits undo edit undoedit org eclipse jface text bad location exception badlocationexception org eclipse jface text default line tracker defaultlinetracker org eclipse jface text document org eclipse jface text document event documentevent org eclipse jface text i document idocument org eclipse jface text i document listener idocumentlistener org eclipse jface text is ynchronizable isynchronizable org eclipse jface text rewrite session edit processor rewritesessioneditprocessor org eclipse jdt core buffer changed event bufferchangedevent org eclipse jdt core i buffer ibuffer org eclipse jdt core i buffer changed listener ibufferchangedlistener org eclipse jdt core i openable iopenable org eclipse jdt core java model exception javamodelexception org eclipse jdt core i buffer ibuffer i text edit capability itexteditcapability org eclipse jdt javaui org eclipse jdt internal java plugin javaplugin adapts code i document idocument code code i buffer ibuffer code algorithm text widget determine buffer delimiter text inserted buffer converted delimiter code code test purposes document adapter documentadapter i buffer ibuffer i document listener idocumentlistener i text edit capability itexteditcapability internal implementation i buffer ibuffer null buffer nullbuffer i buffer ibuffer override add buffer changed listener addbufferchangedlistener i buffer changed listener ibufferchangedlistener listener override append text override append string text override close override get char getchar position override get char acters getcharacters override string get contents getcontents override get length getlength override i openable iopenable get owner getowner override string get text gettext offset length override i resource iresource get underlying resource getunderlyingresource override has unsaved changes hasunsavedchanges override is closed isclosed override is read only isreadonly override remove buffer changed listener removebufferchangedlistener i buffer changed listener ibufferchangedlistener listener override replace position length text override replace position length string text override save i progress monitor iprogressmonitor progress force java model exception javamodelexception override set contents setcontents contents override set contents setcontents string contents implementing code i buffer ibuffer code i buffer ibuffer null buffer nullbuffer runnable thread param runnable runnable runnable runnable display current display currentdisplay display get current getcurrent current display currentdisplay runnable display get default getdefault sync exec syncexec runnable executes document content call thread document set command documentsetcommand runnable string f contents fcontents override is closed isclosed f document fdocument f contents fcontents string contents f contents fcontents contents document adapter documentadapter executes document replace call thread document replace command documentreplacecommand runnable f offset foffset f length flength string f text ftext override is closed isclosed f document fdocument replace f offset foffset f length flength f text ftext bad location exception badlocationexception replace offset length string text f offset foffset offset f length flength length f text ftext text document adapter documentadapter executes document replace call thread apply text edit command applytexteditcommand runnable text edit textedit f edit fedit undo edit undoedit f undo edit fundoedit override is closed isclosed f undo edit fundoedit rewrite session edit processor rewritesessioneditprocessor f document fdocument f edit fedit text edit textedit update regions text edit textedit create undo perform edits performedits bad location exception badlocationexception undo edit undoedit apply text edit applytextedit text edit textedit edit f edit fedit edit f undo edit fundoedit document adapter documentadapter f undo edit fundoedit debug delimiters i openable iopenable f owner fowner i file ifile f file ffile i text file buffer itextfilebuffer f text file buffer ftextfilebuffer i document idocument f document fdocument f is closed fisclosed document set command documentsetcommand f set cmd fsetcmd document set command documentsetcommand document replace command documentreplacecommand f replace cmd freplacecmd document replace command documentreplacecommand apply text edit command applytexteditcommand f text edit cmd ftexteditcmd apply text edit command applytexteditcommand string f legal line delimiters flegallinedelimiters list i buffer changed listener ibufferchangedlistener f buffer listeners fbufferlisteners array list arraylist i path ipath f path fpath location kind locationkind f location kind flocationkind i file store ifilestore f file store ffilestore constructs document adapter param owner owner buffer param path path file backs buffer document adapter documentadapter i openable iopenable owner i path ipath path is legal islegal path f owner fowner owner f path fpath path f location kind flocationkind location kind locationkind normalize initialize constructs document adapter param owner owner buffer param file store filestore file store file backs buffer param path path file backs buffer document adapter documentadapter i openable iopenable owner i file store ifilestore file store filestore i path ipath path is legal islegal file store filestore is legal islegal path f owner fowner owner f file store ffilestore file store filestore f path fpath path f location kind flocationkind location kind locationkind normalize initialize constructs document adapter param owner owner buffer param file code i file ifile code backs buffer document adapter documentadapter i openable iopenable owner i file ifile file f owner fowner owner f file ffile file f path fpath f file ffile get full path getfullpath f location kind flocationkind location kind locationkind ifile initialize initialize i text file buffer manager itextfilebuffermanager manager file buffers filebuffers get text file buffer manager gettextfilebuffermanager f file store ffilestore manager connect file store connectfilestore f file store ffilestore null progress monitor nullprogressmonitor f text file buffer ftextfilebuffer manager get file store text file buffer getfilestoretextfilebuffer f file store ffilestore manager connect f path fpath f location kind flocationkind null progress monitor nullprogressmonitor f text file buffer ftextfilebuffer manager get text file buffer gettextfilebuffer f path fpath f location kind flocationkind f document fdocument f text file buffer ftextfilebuffer get document getdocument core exception coreexception f document fdocument manager create empty document createemptydocument f path fpath f location kind flocationkind f document fdocument is ynchronizable isynchronizable is ynchronizable isynchronizable f document fdocument set lock object setlockobject object f document fdocument add document listener adddocumentlistener f is closed fisclosed returns adapted document adapted document i document idocument get document getdocument f document fdocument i buffer ibuffer add buffer changed listener addbufferchangedlistener i buffer changed listener ibufferchangedlistener override add buffer changed listener addbufferchangedlistener i buffer changed listener ibufferchangedlistener listener is not null isnotnull listener f buffer listeners fbufferlisteners listener f buffer listeners fbufferlisteners add listener i buffer ibuffer remove buffer changed listener removebufferchangedlistener i buffer changed listener ibufferchangedlistener override remove buffer changed listener removebufferchangedlistener i buffer changed listener ibufferchangedlistener listener is not null isnotnull listener f buffer listeners fbufferlisteners remove listener i buffer ibuffer append override append text append string text i buffer ibuffer append string override append string text debug delimiters validate line delimiters validatelinedelimiters text f replace cmd freplacecmd replace f document fdocument get length getlength text i buffer ibuffer close override close is closed isclosed i document idocument f document fdocument f document fdocument document f is closed fisclosed remove document listener removedocumentlistener f text file buffer ftextfilebuffer i text file buffer manager itextfilebuffermanager manager file buffers filebuffers get text file buffer manager gettextfilebuffermanager f file store ffilestore manager disconnect file store disconnectfilestore f file store ffilestore null progress monitor nullprogressmonitor manager disconnect f path fpath f location kind flocationkind null progress monitor nullprogressmonitor core exception coreexception f text file buffer ftextfilebuffer fire buffer changed firebufferchanged buffer changed event bufferchangedevent f buffer listeners fbufferlisteners clear i buffer ibuffer get char getchar override get char getchar position f document fdocument get char getchar position bad location exception badlocationexception array index out of bounds exception arrayindexoutofboundsexception i buffer ibuffer get char acters getcharacters override get char acters getcharacters string content get contents getcontents content content to char array tochararray i buffer ibuffer get contents getcontents override string get contents getcontents f document fdocument i buffer ibuffer get length getlength override get length getlength f document fdocument get length getlength i buffer ibuffer get owner getowner override i openable iopenable get owner getowner f owner fowner i buffer ibuffer get text gettext override string get text gettext offset length f document fdocument offset length bad location exception badlocationexception array index out of bounds exception arrayindexoutofboundsexception i buffer ibuffer get underlying resource getunderlyingresource override i resource iresource get underlying resource getunderlyingresource f file ffile i buffer ibuffer has unsaved changes hasunsavedchanges override has unsaved changes hasunsavedchanges f text file buffer ftextfilebuffer f text file buffer ftextfilebuffer is dirty isdirty i buffer ibuffer is closed isclosed override is closed isclosed f is closed fisclosed i buffer ibuffer is read only isreadonly override is read only isreadonly f text file buffer ftextfilebuffer f text file buffer ftextfilebuffer is commit able iscommitable i resource iresource resource get underlying resource getunderlyingresource resource resource attributes resourceattributes attributes resource get resource attributes getresourceattributes attributes attributes is read only isreadonly i buffer ibuffer replace override replace position length text replace position length string text i buffer ibuffer replace string override replace position length string text debug delimiters validate line delimiters validatelinedelimiters text f replace cmd freplacecmd replace position length text i buffer ibuffer save i progress monitor iprogressmonitor override save i progress monitor iprogressmonitor progress force java model exception javamodelexception f text file buffer ftextfilebuffer f text file buffer ftextfilebuffer commit progress force core exception coreexception java model exception javamodelexception i buffer ibuffer set contents setcontents override set contents setcontents contents set contents setcontents string contents i buffer ibuffer set contents setcontents string override set contents setcontents string contents old length oldlength f document fdocument get length getlength contents old length oldlength nls f set cmd fsetcmd nls debug delimiters validate line delimiters validatelinedelimiters contents contents equals f document fdocument f set cmd fsetcmd contents validate line delimiters validatelinedelimiters string contents f legal line delimiters flegallinedelimiters collect delimiters document hash set hashset string existing delimiters existingdelimiters hash set hashset f document fdocument get number of lines getnumberoflines string curr f document fdocument get line delimiter getlinedelimiter curr existing delimiters existingdelimiters add curr bad location exception badlocationexception java plugin javaplugin log existing delimiters existingdelimiters is empty isempty insertion delimiter test f legal line delimiters flegallinedelimiters existing delimiters existingdelimiters default line tracker defaultlinetracker tracker default line tracker defaultlinetracker tracker contents lines tracker get number of lines getnumberoflines lines lines string curr tracker get line delimiter getlinedelimiter curr f legal line delimiters flegallinedelimiters curr string buffer stringbuffer buf string buffer stringbuffer warning java editor javaeditor document adapter documentadapter delimiter code curr length buf append buf append curr char at charat i status istatus status status i status istatus warning javaui plugin i status istatus buf to string tostring throwable java plugin javaplugin log status bad location exception badlocationexception java plugin javaplugin log i document listener idocumentlistener document about to be changed documentabouttobechanged document event documentevent override document about to be changed documentabouttobechanged document event documentevent event i document listener idocumentlistener document changed documentchanged document event documentevent override document changed documentchanged document event documentevent event fire buffer changed firebufferchanged buffer changed event bufferchangedevent event get offset getoffset event get length getlength event get text gettext fire buffer changed firebufferchanged buffer changed event bufferchangedevent event f buffer listeners fbufferlisteners f buffer listeners fbufferlisteners size iterator i buffer changed listener ibufferchangedlistener array list arraylist f buffer listeners fbufferlisteners iterator has next hasnext buffer changed bufferchanged event inherit doc inheritdoc strong note strong implementation applies edits rewrite session override undo edit undoedit apply text edit applytextedit text edit textedit edit i progress monitor iprogressmonitor monitor java model exception javamodelexception f text edit cmd ftexteditcmd apply text edit applytextedit edit