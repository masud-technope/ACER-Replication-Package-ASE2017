copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal java editor javaeditor java util array list arraylist java util hash map hashmap java util map ibm icu text bidi org eclipse swt swt org eclipse swt custom bidi segment event bidisegmentevent org eclipse swt custom bidi segment listener bidisegmentlistener org eclipse swt custom style range stylerange org eclipse swt custom styled text styledtext org eclipse swt graphics color org eclipse swt graphics point org eclipse swt graphics rgb org eclipse swt widgets composite org eclipse swt widgets control org eclipse swt widgets display org eclipse core runtime org eclipse jface preference i preference store ipreferencestore org eclipse jface preference preference converter preferenceconverter org eclipse jface util i property change listener ipropertychangelistener org eclipse jface util property change event propertychangeevent org eclipse jface text bad location exception badlocationexception org eclipse jface text i document idocument org eclipse jface text i region iregion org eclipse jface text i text presentation listener itextpresentationlistener org eclipse jface text i type d region itypedregion org eclipse jface text region org eclipse jface text text utilities textutilities org eclipse jface text formatter formatting context properties formattingcontextproperties org eclipse jface text formatter i formatting context iformattingcontext org eclipse jface text i information presenter iinformationpresenter org eclipse jface text reconciler i reconciler ireconciler org eclipse jface text source i overview ruler ioverviewruler org eclipse jface text source i vertical ruler iverticalruler org eclipse jface text source source viewer configuration sourceviewerconfiguration org eclipse jface text source project ion projection project ion viewer projectionviewer org eclipse texteditor abstract decorated text editor preference constants abstractdecoratedtexteditorpreferenceconstants org eclipse texteditor abstract text editor abstracttexteditor org eclipse jdt core java core javacore org eclipse jdt javaui org eclipse jdt text i java color constants ijavacolorconstants org eclipse jdt text i java partitions ijavapartitions org eclipse jdt text java source viewer configuration javasourceviewerconfiguration org eclipse jdt internal text smart backspace manager smartbackspacemanager org eclipse jdt internal text java java formatting context javaformattingcontext java source viewer javasourceviewer project ion viewer projectionviewer i property change listener ipropertychangelistener text operation code req uesting requesting out line outline current input outline text operation code req uesting requesting out line outline element current position open structure text operation code req uesting requesting hierarchy current input hierarchy operation code annotate file action annotate file i information presenter iinformationpresenter f outline presenter foutlinepresenter i information presenter iinformationpresenter f structure presenter fstructurepresenter i information presenter iinformationpresenter f hierarchy presenter fhierarchypresenter viewer for eground foreground color color f foreground color fforegroundcolor viewer background color color f background color fbackgroundcolor viewer selection for eground foreground color color f selection foreground color fselectionforegroundcolor viewer selection background color color f selection background color fselectionbackgroundcolor preference store i preference store ipreferencestore f preference store fpreferencestore source viewer configured f is configured fisconfigured back space backspace manager viewer smart backspace manager smartbackspacemanager f backspace manager fbackspacemanager delay setting visual document project ion projection computed performance optimization prepare delayed project ion preparedelayedprojection f is set visible document delayed fissetvisibledocumentdelayed bidi delim tiers delimtiers nls string bidi delimiters punct java source viewer javasourceviewer composite parent i vertical ruler iverticalruler vertical ruler verticalruler i overview ruler ioverviewruler overview ruler overviewruler show annotations overview showannotationsoverview styles i preference store ipreferencestore store parent vertical ruler verticalruler overview ruler overviewruler show annotations overview showannotationsoverview styles set preference store setpreferencestore store org eclipse jface text source source viewer sourceviewer create formatting context createformattingcontext override i formatting context iformattingcontext create formatting context createformattingcontext instance preferences subclasses replace project dependent versions compilation unit editor compilationuniteditor adapted source viewer adaptedsourceviewer i formatting context iformattingcontext context java formatting context javaformattingcontext map string string map hash map hashmap java core javacore get options getoptions context set property setproperty formatting context properties formattingcontextproperties context pref erences preferences map context i text operation target itextoperationtarget do operation dooperation override do operation dooperation operation get text widget gettextwidget operation outline f outline presenter foutlinepresenter f outline presenter foutlinepresenter show information showinformation open structure f structure presenter fstructurepresenter f structure presenter fstructurepresenter show information showinformation hierarchy f hierarchy presenter fhierarchypresenter f hierarchy presenter fhierarchypresenter show information showinformation do operation dooperation operation i text operation target itextoperationtarget can do operation candooperation override can do operation candooperation operation operation outline f outline presenter foutlinepresenter operation open structure f structure presenter fstructurepresenter operation hierarchy f hierarchy presenter fhierarchypresenter can do operation candooperation operation i source viewer isourceviewer configure source viewer configuration sourceviewerconfiguration override configure source viewer configuration sourceviewerconfiguration configuration prevent access colors dispose d disposed unconfigure https bugs eclipse org bugs bug cgi https bugs eclipse org bugs bug cgi styled text styledtext text widget textwidget get text widget gettextwidget text widget textwidget text widget textwidget is disposed isdisposed color for eground color foregroundcolor text widget textwidget get foreground getforeground for eground color foregroundcolor for eground color foregroundcolor is disposed isdisposed text widget textwidget set foreground setforeground color background color backgroundcolor text widget textwidget get background getbackground background color backgroundcolor background color backgroundcolor is disposed isdisposed text widget textwidget set background setbackground configure configuration configuration java source viewer configuration javasourceviewerconfiguration java source viewer configuration javasourceviewerconfiguration javasvcconfiguration java source viewer configuration javasourceviewerconfiguration configuration f outline presenter foutlinepresenter javasvcconfiguration get outline presenter getoutlinepresenter f outline presenter foutlinepresenter f outline presenter foutlinepresenter install f structure presenter fstructurepresenter javasvcconfiguration get outline presenter getoutlinepresenter f structure presenter fstructurepresenter f structure presenter fstructurepresenter install f hierarchy presenter fhierarchypresenter javasvcconfiguration get hierarchy presenter gethierarchypresenter f hierarchy presenter fhierarchypresenter f hierarchy presenter fhierarchypresenter install f preference store fpreferencestore f preference store fpreferencestore add property change listener addpropertychangelistener initialize viewer colors initializeviewercolors f is configured fisconfigured initialize viewer colors initializeviewercolors f preference store fpreferencestore styled text styledtext styled text styledtext get text widget gettextwidget for eground foreground color color color f preference store fpreferencestore get boolean getboolean abstract text editor abstracttexteditor preference color foreground system create color createcolor f preference store fpreferencestore abstract text editor abstracttexteditor preference color foreground styled text styledtext get display getdisplay styled text styledtext set foreground setforeground color f foreground color fforegroundcolor f foreground color fforegroundcolor dispose f foreground color fforegroundcolor color background color color f preference store fpreferencestore get boolean getboolean abstract text editor abstracttexteditor preference color background system create color createcolor f preference store fpreferencestore abstract text editor abstracttexteditor preference color background styled text styledtext get display getdisplay styled text styledtext set background setbackground color f background color fbackgroundcolor f background color fbackgroundcolor dispose f background color fbackgroundcolor color selection for eground foreground color color f preference store fpreferencestore get boolean getboolean abstract decorated text editor preference constants abstractdecoratedtexteditorpreferenceconstants editor selection foreground color create color createcolor f preference store fpreferencestore abstract decorated text editor preference constants abstractdecoratedtexteditorpreferenceconstants editor selection foreground color styled text styledtext get display getdisplay styled text styledtext set selection foreground setselectionforeground color f selection foreground color fselectionforegroundcolor f selection foreground color fselectionforegroundcolor dispose f selection foreground color fselectionforegroundcolor color selection background color color f preference store fpreferencestore get boolean getboolean abstract decorated text editor preference constants abstractdecoratedtexteditorpreferenceconstants editor selection background color create color createcolor f preference store fpreferencestore abstract decorated text editor preference constants abstractdecoratedtexteditorpreferenceconstants editor selection background color styled text styledtext get display getdisplay styled text styledtext set selection background setselectionbackground color f selection background color fselectionbackgroundcolor f selection background color fselectionbackgroundcolor dispose f selection background color fselectionbackgroundcolor color creates color stored preference store returns code code param store store read param key key lookup preference store param display display create color created color specification preference store color create color createcolor i preference store ipreferencestore store string key display display rgb rgb store key store is default isdefault key rgb preference converter preferenceconverter get default color getdefaultcolor store key rgb preference converter preferenceconverter get color getcolor store key rgb color display rgb sets viewer background color control background color background color vis ibly visibly distinct java source text color param control control background color adapt background color adaptbackgroundcolor control control work around workaround dark editor background color https bugs eclipse org color default color defaultcolor control get background getbackground default b g b defaultbghsb default color defaultcolor getrgb gethsb color java default color javadefaultcolor javaui get color manager getcolormanager get color getcolor i java color constants ijavacolorconstants java rgb javadefaultrgb java default color javadefaultcolor java default color javadefaultcolor getrgb rgb javadefaulthsb javadefaultrgb gethsb math abs default b g b defaultbghsb javadefaulthsb get text widget gettextwidget set background setbackground default color defaultcolor f background color fbackgroundcolor f background color fbackgroundcolor dispose f background color fbackgroundcolor org eclipse jface text source i source viewer extension isourceviewerextension unconfigure override unconfigure f outline presenter foutlinepresenter f outline presenter foutlinepresenter uninstall f outline presenter foutlinepresenter f structure presenter fstructurepresenter f structure presenter fstructurepresenter uninstall f structure presenter fstructurepresenter f hierarchy presenter fhierarchypresenter f hierarchy presenter fhierarchypresenter uninstall f hierarchy presenter fhierarchypresenter f foreground color fforegroundcolor f foreground color fforegroundcolor dispose f foreground color fforegroundcolor f background color fbackgroundcolor f background color fbackgroundcolor dispose f background color fbackgroundcolor f preference store fpreferencestore f preference store fpreferencestore remove property change listener removepropertychangelistener unconfigure f is configured fisconfigured org eclipse jface text source source viewer sourceviewer remember selection rememberselection override point remember selection rememberselection remember selection rememberselection org eclipse jface text source source viewer sourceviewer restore selection restoreselection override restore selection restoreselection restore selection restoreselection org eclipse jface util i property change listener ipropertychangelistener property change propertychange org eclipse jface util property change event propertychangeevent override property change propertychange property change event propertychangeevent event string property event get property getproperty abstract text editor abstracttexteditor preference color foreground equals property abstract text editor abstracttexteditor preference color foreground system equals property abstract text editor abstracttexteditor preference color background equals property abstract text editor abstracttexteditor preference color background system equals property abstract decorated text editor preference constants abstractdecoratedtexteditorpreferenceconstants editor selection foreground color equals property abstract decorated text editor preference constants abstractdecoratedtexteditorpreferenceconstants editor selection foreground color equals property abstract decorated text editor preference constants abstractdecoratedtexteditorpreferenceconstants editor selection background color equals property abstract decorated text editor preference constants abstractdecoratedtexteditorpreferenceconstants editor selection background color equals property initialize viewer colors initializeviewercolors sets preference store viewer param store preference store set preference store setpreferencestore i preference store ipreferencestore store f is configured fisconfigured f preference store fpreferencestore f preference store fpreferencestore remove property change listener removepropertychangelistener f preference store fpreferencestore store f is configured fisconfigured f preference store fpreferencestore f preference store fpreferencestore add property change listener addpropertychangelistener initialize viewer colors initializeviewercolors org eclipse jface text source source viewer sourceviewer create control createcontrol org eclipse swt widgets composite override create control createcontrol composite parent styles left styles swt left styles swt left styles swt left base level baselevel styles swt left bidi dir ection direction left bidi dir ection direction left create control createcontrol parent styles f backspace manager fbackspacemanager smart backspace manager smartbackspacemanager f backspace manager fbackspacemanager install styled text styledtext text get text widget gettextwidget text add bidi segment listener addbidisegmentlistener bidi segment listener bidisegmentlistener override line get segments linegetsegments bidi segment event bidisegmentevent event red raws redraws event segments get bidi line segments getbidilinesegments get document getdocument base level baselevel widget offset widgetoffset model offset modeloffset event line offset lineoffset event line text linetext bad location exception badlocationexception returns back space backspace manager viewer back space backspace manager viewer code code smart backspace manager smartbackspacemanager get backspace manager getbackspacemanager f backspace manager fbackspacemanager org eclipse jface text source source viewer sourceviewer handle dispose handledispose override handle dispose handledispose f backspace manager fbackspacemanager f backspace manager fbackspacemanager uninstall f backspace manager fbackspacemanager handle dispose handledispose prepends text presentation listener viewer list text presentation listeners listener registered viewer call moves listener list param listener text presentation listener prepend text presentation listener prependtextpresentationlistener i text presentation listener itextpresentationlistener listener is not null isnotnull listener f text presentation listeners ftextpresentationlisteners f text presentation listeners ftextpresentationlisteners array list arraylist f text presentation listeners ftextpresentationlisteners remove listener f text presentation listeners ftextpresentationlisteners add listener sets reconciler param reconciler reconciler set reconciler setreconciler i reconciler ireconciler reconciler f reconciler freconciler reconciler returns reconciler reconciler code code i reconciler ireconciler get reconciler getreconciler f reconciler freconciler returns segmentation document bidi rendering param document document param base level baselevel base level param line start linestart offset param line text linetext text retrieve bidi segments bidi segmentation bad location exception badlocationexception line offset lineoffset valid document get bidi line segments getbidilinesegments i document idocument document base level baselevel line start linestart string line text linetext bad location exception badlocationexception line text linetext document line length linelength line text linetext length line length linelength icu compute embedding levels consume levels reduce bidi impact creating sel ective selective segments preceding character runs level mismatching base level xxx alternatively apply text layout textlayout pros full synchronization underlying styled text styledtext bidi implementation cons performance penalty unavailability methods is left to right islefttoright get levels getlevels bidi bidi bidi line text linetext base level baselevel bidi is left to right islefttoright b ail bail bidi text i region iregion document get line information of offset getlineinformationofoffset line start linestart i type d region itypedregion line partitioning linepartitioning text utilities textutilities compute partitioning computepartitioning document i java partitions ijavapartitions java partitioning line start linestart get length getlength line partitioning linepartitioning line partitioning linepartitioning length segment index segmentindex segments line length linelength levels bidi get levels getlevels n partitions npartitions line partitioning linepartitioning length partition index partitionindex partition index partitionindex n partitions npartitions partition index partitionindex i type d region itypedregion partition line partitioning linepartitioning partition index partitionindex line offset lineoffset partition get offset getoffset line start linestart line offset lineoffset is mismatching level ismismatchinglevel levels line offset lineoffset base level baselevel is mismatching level ismismatchinglevel levels line offset lineoffset base level baselevel bidi segment partition start levels character current offset preceding character mismatch base paragraph level partition covered start partition delimiter partition segments segment index segmentindex line offset lineoffset i document idocument content type equals partition get type gettype partition end partitionend math min line length linelength line offset lineoffset partition get length getlength line offset lineoffset partition end partitionend is mismatching level ismismatchinglevel levels line offset lineoffset base level baselevel string value of valueof line text linetext char at charat line offset lineoffset matches bidi delimiters content types segment delim iting delimiting character mismatching embedding level segments segment index segmentindex line offset lineoffset segment index segmentindex segments segments segment index segmentindex line length linelength segments segment index segmentindex line length linelength segment index segmentindex segments length segments new segments newsegments segment index segmentindex system arraycopy segments new segments newsegments segment index segmentindex new segments newsegments checks embedding level consistent base level param level character embedding level check param base level baselevel base level direction text code code character level odd base level character level base level odd code code is mismatching level ismismatchinglevel level base level baselevel level base level baselevel delays setting visual document project ion projection computed method called document viewer performance optimization reduce computation text presentation triggered code set visible document setvisibledocument i document idocument code set visible document setvisibledocument i document idocument prepare delayed project ion preparedelayedprojection assert ion assertion fails don commented hurts users bug opening editor maximum allowed reached result exception editor opened is true istrue f is set visible document delayed fissetvisibledocumentdelayed f is set visible document delayed fissetvisibledocumentdelayed inherit doc inheritdoc performance optimization reduce computation text presentation triggered link set visible document setvisibledocument i document idocument prepare delayed project ion preparedelayedprojection override set visible document setvisibledocument i document idocument document f is set visible document delayed fissetvisibledocumentdelayed f is set visible document delayed fissetvisibledocumentdelayed i document idocument previous get visible document getvisibledocument visible document f olded folded enable project ion enableprojection i document idocument current get visible document getvisibledocument visible document replaced usual current current previous set visible document setvisibledocument document inherit doc inheritdoc performance optimization place clients expects range untouched reuse range override style range stylerange model style range modelstylerange widget style range widgetstylerange style range stylerange range i region iregion region model range modelrange widget range widgetrange region range start range length region don clone style range simply reuse range start region get offset getoffset range length region get length getlength range