copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal preferences org eclipse swt swt org eclipse swt events dispose listener disposelistener org eclipse swt events selection adapter selectionadapter org eclipse swt events selection event selectionevent org eclipse swt graphics point org eclipse swt layout grid data griddata org eclipse swt layout grid layout gridlayout org eclipse swt widgets button org eclipse swt widgets composite org eclipse swt widgets control org eclipse swt widgets label org eclipse swt widgets link org eclipse core runtime org eclipse jface dialogs dialog org eclipse jface layout pixel converter pixelconverter org eclipse jface preference i preference store ipreferencestore org eclipse jface util i property change listener ipropertychangelistener org eclipse jface util property change event propertychangeevent org eclipse dialogs preferences util preferencesutil org eclipse jdt core java core javacore org eclipse jdt core formatter default code formatter constants defaultcodeformatterconstants org eclipse jdt internal corext util code formatter util codeformatterutil org eclipse jdt internal corext util messages org eclipse jdt preference constants preferenceconstants org eclipse jdt internal java plugin javaplugin config ures configures java editor typing preferences smart typing configuration block smarttypingconfigurationblock abstract configuration block abstractconfigurationblock smart typing configuration block smarttypingconfigurationblock overlay preference store overlaypreferencestore store store store add keys addkeys create overlay store keys createoverlaystorekeys overlay preference store overlaypreferencestore overlay key overlaykey create overlay store keys createoverlaystorekeys overlay preference store overlaypreferencestore overlay key overlaykey overlay preference store overlaypreferencestore overlay key overlaykey overlay preference store overlaypreferencestore preference constants preferenceconstants editor smart paste overlay preference store overlaypreferencestore overlay key overlaykey overlay preference store overlaypreferencestore preference constants preferenceconstants editor imports paste overlay preference store overlaypreferencestore overlay key overlaykey overlay preference store overlaypreferencestore preference constants preferenceconstants editor close strings overlay preference store overlaypreferencestore overlay key overlaykey overlay preference store overlaypreferencestore preference constants preferenceconstants editor close brackets overlay preference store overlaypreferencestore overlay key overlaykey overlay preference store overlaypreferencestore preference constants preferenceconstants editor close braces overlay preference store overlaypreferencestore overlay key overlaykey overlay preference store overlaypreferencestore preference constants preferenceconstants editor close java docs javadocs overlay preference store overlaypreferencestore overlay key overlaykey overlay preference store overlaypreferencestore preference constants preferenceconstants editor wrap strings overlay preference store overlaypreferencestore overlay key overlaykey overlay preference store overlaypreferencestore preference constants preferenceconstants editor escape strings overlay preference store overlaypreferencestore overlay key overlaykey overlay preference store overlaypreferencestore preference constants preferenceconstants editor add javadoc tags overlay preference store overlaypreferencestore overlay key overlaykey overlay preference store overlaypreferencestore preference constants preferenceconstants editor smart semicolon overlay preference store overlaypreferencestore overlay key overlaykey overlay preference store overlaypreferencestore preference constants preferenceconstants editor smart tab overlay preference store overlaypreferencestore overlay key overlaykey overlay preference store overlaypreferencestore preference constants preferenceconstants editor smart opening brace overlay preference store overlaypreferencestore overlay key overlaykey overlay preference store overlaypreferencestore preference constants preferenceconstants editor smart indent new line newline creates mark occurrences preferences param parent parent composite control preference override control create control createcontrol composite parent scrolled page content scrolledpagecontent scrolled scrolled page content scrolledpagecontent parent swt scroll swt scroll scrolled set expand horizontal setexpandhorizontal scrolled set expand vertical setexpandvertical composite control composite scrolled swt grid layout gridlayout layout grid layout gridlayout layout margin width marginwidth layout margin height marginheight control set layout setlayout layout add smart insert mode message addsmartinsertmodemessage control composite composite composite create sub section createsubsection control preferences messages preferencesmessages smart typing configuration block smarttypingconfigurationblock auto close autoclose title add auto closing section addautoclosingsection composite composite create sub section createsubsection control preferences messages preferencesmessages smart typing configuration block smarttypingconfigurationblock auto move automove title add auto position section addautopositionsection composite composite create sub section createsubsection control preferences messages preferencesmessages smart typing configuration block smarttypingconfigurationblock indentation title add indentation section addindentationsection composite composite create sub section createsubsection control preferences messages preferencesmessages smart typing configuration block smarttypingconfigurationblock pasting title add paste section addpastesection composite composite create sub section createsubsection control preferences messages preferencesmessages smart typing configuration block smarttypingconfigurationblock strings title add strings section addstringssection composite scrolled set content setcontent control point size control compute size computesize swt swt scrolled set min size setminsize size size scrolled adds smart insert mode not e note preference param parent parent composite add smart insert mode message addsmartinsertmodemessage composite parent label label label parent swt lead swt wrap label set text settext preferences messages preferencesmessages java editor preference page javaeditorpreferencepage smart insert mode smartinsertmode message pixel converter pixelconverter pixel converter pixelconverter pixel converter pixelconverter parent label filler label fillerlabel label parent swt left grid data griddata grid data griddata grid data griddata grid data griddata horizontal align fill grid data griddata horizontal span horizontalspan grid data griddata height hint heighthint pixel converter pixelconverter convert height in chars to pixels convertheightincharstopixels filler label fillerlabel set layout data setlayoutdata grid data griddata add strings section addstringssection composite composite grid layout gridlayout layout grid layout gridlayout composite set layout setlayout layout string label label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage wrap strings wrapstrings add check box addcheckbox composite label preference constants preferenceconstants editor wrap strings label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage escape strings escapestrings add check box addcheckbox composite label preference constants preferenceconstants editor escape strings add paste section addpastesection composite composite grid layout gridlayout layout grid layout gridlayout composite set layout setlayout layout string label label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage smart paste smartpaste add check box addcheckbox composite label preference constants preferenceconstants editor smart paste label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage imports on paste importsonpaste add check box addcheckbox composite label preference constants preferenceconstants editor imports paste adds indentation preference param parent parent composite add indentation section addindentationsection composite parent grid layout gridlayout layout grid layout gridlayout parent set layout setlayout layout add check box addcheckbox parent preferences messages preferencesmessages java editor preference page javaeditorpreferencepage smart auto indent after new line smartautoindentafternewline preference constants preferenceconstants editor smart indent new line newline add check box addcheckbox parent preferences messages preferencesmessages java editor preference page javaeditorpreferencepage typing smart tab smarttab preference constants preferenceconstants editor smart tab create message createmessage parent add auto position section addautopositionsection composite composite grid layout gridlayout layout grid layout gridlayout composite set layout setlayout layout string label label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage typing smart semicolon smartsemicolon add check box addcheckbox composite label preference constants preferenceconstants editor smart semicolon label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage typing smart opening brace smartopeningbrace add check box addcheckbox composite label preference constants preferenceconstants editor smart opening brace add auto closing section addautoclosingsection composite composite grid layout gridlayout layout grid layout gridlayout layout num columns numcolumns composite set layout setlayout layout string label button master slave label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage close strings closestrings add check box addcheckbox composite label preference constants preferenceconstants editor close strings label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage close brackets closebrackets add check box addcheckbox composite label preference constants preferenceconstants editor close brackets label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage close braces closebraces add check box addcheckbox composite label preference constants preferenceconstants editor close braces label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage close java docs closejavadocs master add check box addcheckbox composite label preference constants preferenceconstants editor close java docs javadocs label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage add java doc tags addjavadoctags slave add check box addcheckbox composite label preference constants preferenceconstants editor add javadoc tags create dependency createdependency master slave create message createmessage composite composite todo create link argument formatter preference open current profile automatically string link tooltip linktooltip preferences messages preferencesmessages smart typing configuration block smarttypingconfigurationblock tabs message tooltip string text string indent mode indentmode java plugin javaplugin get default getdefault get combined preference store getcombinedpreferencestore get string getstring default code formatter constants defaultcodeformatterconstants formatter tab java core javacore tab equals indent mode indentmode text messages format preferences messages preferencesmessages smart typing configuration block smarttypingconfigurationblock tabs message tab text string integer to string tostring get tab display size gettabdisplaysize text messages format preferences messages preferencesmessages smart typing configuration block smarttypingconfigurationblock tabs message text string integer to string tostring get tab display size gettabdisplaysize integer to string tostring get indent size getindentsize get indent mode getindentmode link link link composite swt link set text settext text link set tool tip text settooltiptext link tooltip linktooltip grid data griddata grid data griddata swt fill swt don wide r wider init ially initially width hint widthhint link set layout data setlayoutdata link add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent nls preferences util preferencesutil create preference dialog on createpreferencedialogon nls link get shell getshell nls org eclipse jdt preferences code formatter preference page codeformatterpreferencepage nls nls i preference store ipreferencestore combined store combinedstore java plugin javaplugin get default getdefault get combined preference store getcombinedpreferencestore i property change listener ipropertychangelistener property change listener propertychangelistener i property change listener ipropertychangelistener f has run fhasrun override property change propertychange property change event propertychangeevent event f has run fhasrun composite is disposed isdisposed string property event get property getproperty default code formatter constants defaultcodeformatterconstants formatter tab equals property default code formatter constants defaultcodeformatterconstants formatter tab size equals property f has run fhasrun link dispose create message createmessage composite dialog apply dialog font applydialogfont composite composite redraw composite layout combined store combinedstore add property change listener addpropertychangelistener property change listener propertychangelistener link add dispose listener adddisposelistener dispose listener disposelistener override widget disposed widgetdisposed org eclipse swt events dispose event disposeevent combined store combinedstore remove property change listener removepropertychangelistener property change listener propertychangelistener string get indent mode getindentmode string indent mode indentmode java plugin javaplugin get default getdefault get combined preference store getcombinedpreferencestore get string getstring default code formatter constants defaultcodeformatterconstants formatter tab java core javacore space equals indent mode indentmode preferences messages preferencesmessages smart typing configuration block smarttypingconfigurationblock tabs message spaces java core javacore tab equals indent mode indentmode preferences messages preferencesmessages smart typing configuration block smarttypingconfigurationblock tabs message tabs default code formatter constants defaultcodeformatterconstants mixed equals indent mode indentmode preferences messages preferencesmessages smart typing configuration block smarttypingconfigurationblock tabs message tabs and spaces tabsandspaces nls is true istrue illegal indent mode happen get indent size getindentsize code formatter util codeformatterutil get indent width getindentwidth get tab display size gettabdisplaysize code formatter util codeformatterutil get tab width gettabwidth