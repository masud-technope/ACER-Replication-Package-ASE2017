copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal preferences formatter java util array list arraylist java util hash map hashmap java util list java util map java util observable java util observer org eclipse swt swt org eclipse swt custom sash form sashform org eclipse swt custom scrolled composite scrolledcomposite org eclipse swt events control event controlevent org eclipse swt events control listener controllistener org eclipse swt events focus adapter focusadapter org eclipse swt events focus event focusevent org eclipse swt events focus listener focuslistener org eclipse swt events modify event modifyevent org eclipse swt events modify listener modifylistener org eclipse swt events selection adapter selectionadapter org eclipse swt events selection event selectionevent org eclipse swt graphics point org eclipse swt graphics rectangle org eclipse swt layout grid data griddata org eclipse swt layout grid layout gridlayout org eclipse swt widgets button org eclipse swt widgets combo org eclipse swt widgets composite org eclipse swt widgets control org eclipse swt widgets group org eclipse swt widgets label org eclipse swt widgets layout org eclipse swt widgets text org eclipse core runtime i status istatus org eclipse core runtime status org eclipse jface dialogs i dialog constants idialogconstants org eclipse jface dialogs i dialog settings idialogsettings org eclipse jface dialogs i input validator iinputvalidator org eclipse jface layout pixel converter pixelconverter org eclipse jdt internal corext util messages org eclipse jdt javaui org eclipse jdt internal java plugin javaplugin org eclipse jdt internal util swt util swtutil modify dialog tab page modifydialogtabpage i modify dialog tab page imodifydialogtabpage listener preference classes res pective respective factory methods updates preview change observer f updater fupdater observer override update observable object arg do update preview doupdatepreview notify values modified notifyvaluesmodified base preference classes preference wrapper swt widgets handles input values key change written map listeners not ified notified preference observable map string string f preferences fpreferences f enabled fenabled string f key fkey create preference param preferences map written param key key managed preference map string string preferences string key f preferences fpreferences preferences f enabled fenabled f key fkey key map preference map string string get preferences getpreferences f preferences fpreferences enabled swt widgets preference param enabled set enabled setenabled enabled f enabled fenabled enabled update widget updatewidget enabled swt widgets preference get enabled getenabled f enabled fenabled key store param key set key setkey string key key f key fkey equals key f key fkey key update widget updatewidget key store string get key getkey f key fkey returns main control preference manage focus code code preference doesn control focus main control control get control getcontrol implemented subclasses update swt widgets object changed enabled key update widget updatewidget wrapper check box checkbox label button preference buttonpreference preference string f values fvalues button f checkbox fcheckbox create checkbox preference checkboxpreference param composite composite swt widgets param num columns numcolumns number columns composite grid layout gridlayout param preferences map store values param key key store values param values array elements indicating values store unchecked checked param text label text preference param style swt style flag button button preference buttonpreference composite composite num columns numcolumns map string string preferences string key string values string text style preferences key values text illegal argument exception illegalargumentexception formatter messages formattermessages modify dialog tab page modifydialogtabpage error msg values text unassigned f values fvalues values f checkbox fcheckbox button composite style f checkbox fcheckbox set text settext text f checkbox fcheckbox set layout data setlayoutdata create grid data creategriddata num columns numcolumns grid data griddata fill horizontal swt f checkbox fcheckbox set font setfont composite get font getfont update widget updatewidget f checkbox fcheckbox add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent check box checked checkboxchecked button widget get selection getselection check box checked checkboxchecked get preferences getpreferences get key getkey f values fvalues f values fvalues set changed setchanged notify observers notifyobservers override update widget updatewidget get key getkey f checkbox fcheckbox set enabled setenabled get enabled getenabled f checkbox fcheckbox set selection setselection get checked getchecked f checkbox fcheckbox set selection setselection f checkbox fcheckbox set enabled setenabled get checked getchecked f values fvalues equals get preferences getpreferences get key getkey set checked setchecked checked get preferences getpreferences get key getkey checked f values fvalues f values fvalues update widget updatewidget check box checked checkboxchecked checked override control get control getcontrol f checkbox fcheckbox checkbox preference checkboxpreference button preference buttonpreference checkbox preference checkboxpreference composite composite num columns numcolumns map string string preferences string key string values string text composite num columns numcolumns preferences key values text swt check radio preference radiopreference button preference buttonpreference radio preference radiopreference composite composite num columns numcolumns map string string preferences string key string values string text composite num columns numcolumns preferences key values text swt radio wrapper combo box combo preference combopreference preference string f items fitems string f values fvalues combo f combo fcombo create combo preference combopreference param composite composite swt widgets param num columns numcolumns number columns composite grid layout gridlayout param preferences map store values param key key store values param values array elements indicating values store selection param text label text preference param items array elements indicating text written combo box combo preference combopreference composite composite num columns numcolumns map string string preferences string key string values string text string items preferences key values items text illegal argument exception illegalargumentexception formatter messages formattermessages modify dialog tab page modifydialogtabpage error msg values items text unassigned f values fvalues values f items fitems items create label createlabel num columns numcolumns composite text f combo fcombo combo composite swt single swt read f combo fcombo set font setfont composite get font getfont swt util swtutil set default visible item count setdefaultvisibleitemcount f combo fcombo f combo fcombo set items setitems items max items length items length max max items length f combo fcombo set layout data setlayoutdata create grid data creategriddata grid data griddata horizontal align fill f combo fcombo compute size computesize swt swt update widget updatewidget f combo fcombo add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent combo selected comboselected combo widget get selection index getselectionindex combo selected comboselected get preferences getpreferences get key getkey f values fvalues set changed setchanged notify observers notifyobservers f values fvalues override update widget updatewidget get key getkey f combo fcombo set enabled setenabled get enabled getenabled f combo fcombo set text settext get selected item getselecteditem nls f combo fcombo set text settext nls f combo fcombo set enabled setenabled string get selected item getselecteditem string selected get preferences getpreferences get key getkey f values fvalues length f values fvalues equals selected f items fitems nls has value hasvalue string equals get preferences getpreferences get key getkey override control get control getcontrol f combo fcombo wrapper text f ied textfied requests int eger integer input range number preference numberpreference preference f min value fminvalue f max value fmaxvalue label f number label fnumberlabel text f number text fnumbertext f selected fselected f old selected foldselected create number preference numberpreference param composite composite swt widgets param num columns numcolumns number columns composite grid layout gridlayout param preferences map store values param key key store values param min value minvalue minimum valid input param max value maxvalue maximum valid input param text label text preference code number preference numberpreference composite composite num columns numcolumns map string string preferences string key min value minvalue max value maxvalue string text preferences key f number label fnumberlabel text create label createlabel num columns numcolumns composite text grid data griddata fill horizontal f number text fnumbertext text composite swt single swt border swt f number text fnumbertext set font setfont composite get font getfont length integer to string tostring max value maxvalue length f number text fnumbertext set layout data setlayoutdata create grid data creategriddata grid data griddata horizontal align f pixel converter fpixelconverter convert width in chars to pixels convertwidthincharstopixels length f min value fminvalue min value minvalue f max value fmaxvalue max value maxvalue update widget updatewidget f number text fnumbertext add focus listener addfocuslistener focus listener focuslistener override focus gained focusgained focus event focusevent number preference numberpreference focus gained focusgained override focus lost focuslost focus event focusevent number preference numberpreference focus lost focuslost f number text fnumbertext add modify listener addmodifylistener modify listener modifylistener override modify text modifytext modify event modifyevent field modified fieldmodified i status istatus create error status createerrorstatus status i status istatus error java plugin javaplugin get plugin id getpluginid messages format formatter messages formattermessages modify dialog tab page modifydialogtabpage number preference numberpreference error invalid string integer to string tostring f min value fminvalue integer to string tostring f max value fmaxvalue focus gained focusgained f old selected foldselected f selected fselected f number text fnumbertext set selection setselection f number text fnumbertext get char count getcharcount focus lost focuslost update status updatestatus string input f number text fnumbertext get text gettext valid input validinput input f selected fselected f old selected foldselected f selected fselected integer parse int parseint input f selected fselected f old selected foldselected save selected saveselected f number text fnumbertext set text settext integer to string tostring f selected fselected field modified fieldmodified string trim input triminput f number text fnumbertext get text gettext trim valid valid input validinput trim input triminput update status updatestatus valid create error status createerrorstatus valid number integer parse int parseint trim input triminput f selected fselected number f selected fselected number save selected saveselected valid input validinput string trim input triminput number number integer parse int parseint trim input triminput number format exception numberformatexception number f min value fminvalue number f max value fmaxvalue save selected saveselected get preferences getpreferences get key getkey integer to string tostring f selected fselected set changed setchanged notify observers notifyobservers override update widget updatewidget has key haskey get key getkey f number label fnumberlabel f number label fnumberlabel set enabled setenabled has key haskey get enabled getenabled f number text fnumbertext set enabled setenabled has key haskey get enabled getenabled has key haskey string get preferences getpreferences get key getkey f selected fselected integer parse int parseint number format exception numberformatexception string message messages format formatter messages formattermessages modify dialog tab page modifydialogtabpage number preference numberpreference error invalid key get key getkey java plugin javaplugin log status i status istatus error java plugin javaplugin get plugin id getpluginid i status istatus message f number text fnumbertext set text settext nls f number text fnumbertext set text settext override control get control getcontrol f number text fnumbertext wrapper text field requests string input string preference stringpreference preference valid ates validates input implementation declares code code values valid validator is valid isvalid string input input label f label flabel text f text ftext i input validator iinputvalidator f input validator finputvalidator string f selected fselected string f old selected foldselected creates code string preference stringpreference code param composite composite swt widgets param num columns numcolumns number columns composite link grid layout gridlayout param preferences map store values param key key store values param text label text preference param input validator inputvalidator input validator code code string preference stringpreference composite composite num columns numcolumns map string string preferences string key string text i input validator iinputvalidator input validator inputvalidator preferences key f input validator finputvalidator input validator inputvalidator f label flabel label composite swt f label flabel set font setfont composite get font getfont f label flabel set text settext text f label flabel set layout data setlayoutdata create grid data creategriddata num columns numcolumns grid data griddata horizontal align swt f text ftext text composite swt single swt border f text ftext set font setfont composite get font getfont length f text ftext set layout data setlayoutdata create grid data creategriddata grid data griddata horizontal align f pixel converter fpixelconverter convert width in chars to pixels convertwidthincharstopixels length update widget updatewidget f text ftext add focus listener addfocuslistener focus listener focuslistener override focus gained focusgained focus event focusevent string preference stringpreference focus gained focusgained override focus lost focuslost focus event focusevent string preference stringpreference focus lost focuslost f text ftext add modify listener addmodifylistener modify listener modifylistener override modify text modifytext modify event modifyevent field modified fieldmodified i status istatus create error status createerrorstatus string error text errortext status i status istatus error java plugin javaplugin get plugin id getpluginid error text errortext focus gained focusgained f old selected foldselected f selected fselected f text ftext set selection setselection f text ftext get char count getcharcount focus lost focuslost update status updatestatus string input f text ftext get text gettext f input validator finputvalidator f input validator finputvalidator is valid isvalid input f selected fselected f old selected foldselected f selected fselected input f selected fselected f old selected foldselected save selected saveselected f text ftext set text settext f selected fselected field modified fieldmodified string text f text ftext get text gettext string error text errortext f input validator finputvalidator f input validator finputvalidator is valid isvalid text error text errortext update status updatestatus f selected fselected text f selected fselected text save selected saveselected update status updatestatus create error status createerrorstatus error text errortext save selected saveselected get preferences getpreferences get key getkey f selected fselected set changed setchanged notify observers notifyobservers override update widget updatewidget has key haskey get key getkey f label flabel set enabled setenabled has key haskey get enabled getenabled f text ftext set enabled setenabled has key haskey get enabled getenabled has key haskey f selected fselected get preferences getpreferences get key getkey f text ftext set text settext f selected fselected nls f text ftext set text settext nls override control get control getcontrol f text ftext preserve establish focus multiple modify sessions modify dialog tab page modifydialogtabpage instance add relevant controls creation sequence established mapping controls indexes restore focus session saved dialog settings common preference tab active tab stores focus default focus manager defaultfocusmanager focus adapter focusadapter nls string pref focus javaui plugin formatter modify dialog tab focus i dialog settings idialogsettings f dialog settings fdialogsettings map control integer f item map fitemmap list control f item list fitemlist f index findex default focus manager defaultfocusmanager f dialog settings fdialogsettings java plugin javaplugin get default getdefault get dialog settings getdialogsettings f item map fitemmap hash map hashmap f item list fitemlist array list arraylist f index findex override focus gained focusgained focus event focusevent f dialog settings fdialogsettings pref focus f item map fitemmap widget int value intvalue add control control control add focus listener addfocuslistener f item list fitemlist add f index findex control f item map fitemmap control integer f index findex add preference preference control control preference get control getcontrol control add control is used isused f index findex restore focus restorefocus f dialog settings fdialogsettings get int getint pref focus range f item list fitemlist size f item list fitemlist set focus setfocus number format exception numberformatexception reset focus resetfocus f dialog settings fdialogsettings pref focus layout settings scroll bars scrollbars settings layouted resize page layout pagelayout layout scrolled composite scrolledcomposite f container fcontainer f minimal width fminimalwidth f minimal hight fminimalhight page layout pagelayout scrolled composite scrolledcomposite container minimal width minimalwidth minimal hight minimalhight f container fcontainer container f minimal width fminimalwidth minimal width minimalwidth f minimal hight fminimalhight minimal hight minimalhight override point compute size computesize composite composite w hint whint h hint hhint force w hint whint swt h hint hhint swt point w hint whint h hint hhint f minimal width fminimalwidth f minimal hight fminimalhight control children composite get children getchildren children length point size children compute size computesize swt swt force math max size math max size rectangle area f container fcontainer get client area getclientarea area width f container fcontainer set expand horizontal setexpandhorizontal f container fcontainer set expand horizontal setexpandhorizontal area height f container fcontainer set expand vertical setexpandvertical f container fcontainer set expand vertical setexpandvertical w hint whint swt w hint whint h hint hhint swt h hint hhint point override layout composite composite force rectangle rect composite get client area getclientarea control children composite get children getchildren children length children set size setsize rect width rect height focus manager widget widgets focus list ens listens focus gained focusgained events stores current focus holder dialog res tarted restarted code restore focus restorefocus code sets focus control standard preference object managed focus manager created res pective respective factory methods swt widgets subclasses created default focus manager defaultfocusmanager f default focus manager fdefaultfocusmanager pixel converter layout cal culations calculations pixel converter pixelconverter f pixel converter fpixelconverter map current settings stored map string string f working values fworkingvalues modify dialog display status messages i modify dialog tab page imodifydialogtabpage i modification listener imodificationlistener f modify listener fmodifylistener create code modify dialog tab page modifydialogtabpage code modify dialog tab page modifydialogtabpage i modify dialog tab page imodifydialogtabpage i modification listener imodificationlistener modify listener modifylistener map string string working values workingvalues f working values fworkingvalues working values workingvalues f modify listener fmodifylistener modify listener modifylistener f default focus manager fdefaultfocusmanager default focus manager defaultfocusmanager modify dialog tab page modifydialogtabpage f default focus manager fdefaultfocusmanager default focus manager defaultfocusmanager override set working values setworkingvalues map string string working values workingvalues f working values fworkingvalues working values workingvalues override set modify listener setmodifylistener i modify dialog tab page imodifydialogtabpage i modification listener imodificationlistener modify listener modifylistener f modify listener fmodifylistener modify listener modifylistener create contents tab subclasses implement code do create preferences docreatepreferences code code do create preview docreatepreview code overridden param parent parent composite created content control override composite create contents createcontents composite parent num columns numcolumns f pixel converter fpixelconverter f pixel converter fpixelconverter pixel converter pixelconverter parent sash form sashform sash form sashform sash form sashform parent swt horizontal sash form sashform set font setfont parent get font getfont composite scroll container scrollcontainer composite sash form sashform swt grid data griddata grid data griddata grid data griddata swt fill swt fill scroll container scrollcontainer set layout data setlayoutdata grid data griddata grid layout gridlayout layout grid layout gridlayout layout margin height marginheight layout margin width marginwidth layout horizontal spacing horizontalspacing layout vertical spacing verticalspacing scroll container scrollcontainer set layout setlayout layout scrolled composite scrolledcomposite scroll scrolled composite scrolledcomposite scroll container scrollcontainer swt scroll swt scroll scroll set layout data setlayoutdata grid data griddata swt fill swt fill scroll set expand horizontal setexpandhorizontal scroll set expand vertical setexpandvertical composite settings container settingscontainer composite scroll swt settings container settingscontainer set font setfont sash form sashform get font getfont scroll set content setcontent settings container settingscontainer settings container settingscontainer set layout setlayout page layout pagelayout scroll settings container settingscontainer set layout data setlayoutdata grid data griddata swt fill swt fill composite settings pane settingspane composite settings container settingscontainer swt settings pane settingspane set layout data setlayoutdata grid data griddata swt fill swt fill layout grid layout gridlayout num columns numcolumns layout vertical spacing verticalspacing f pixel converter fpixelconverter convert vertical us to pixels convertverticaldlustopixels i dialog constants idialogconstants vertical spacing layout horizontal spacing horizontalspacing f pixel converter fpixelconverter convert horizontal us to pixels converthorizontaldlustopixels i dialog constants idialogconstants horizontal spacing layout margin height marginheight f pixel converter fpixelconverter convert vertical us to pixels convertverticaldlustopixels i dialog constants idialogconstants vertical margin layout margin width marginwidth f pixel converter fpixelconverter convert horizontal us to pixels converthorizontaldlustopixels i dialog constants idialogconstants horizontal margin settings pane settingspane set layout setlayout layout do create preferences docreatepreferences settings pane settingspane num columns numcolumns settings container settingscontainer set size setsize settings container settingscontainer compute size computesize swt swt scroll add control listener addcontrollistener control listener controllistener override control moved controlmoved control event controlevent override control res ized controlresized control event controlevent settings container settingscontainer set size setsize settings container settingscontainer compute size computesize swt swt label sash handle sashhandle label scroll container scrollcontainer swt separator swt vertical grid data griddata grid data griddata swt swt fill sash handle sashhandle set layout data setlayoutdata grid data griddata composite preview pane previewpane composite sash form sashform swt preview pane previewpane set layout setlayout create grid layout creategridlayout num columns numcolumns preview pane previewpane set font setfont sash form sashform get font getfont do create preview pane docreatepreviewpane preview pane previewpane num columns numcolumns initialize page initializepage sash form sashform set weights setweights sash form sashform method called controls all ocated allocated including preview preview text create listeners initialize page initializepage create left side modify dialog meant implemented subclasses param composite composite create param num columns numcolumns number columns do create preferences docreatepreferences composite composite num columns numcolumns create side modify dialog preview displayed subclasses override method order customize hand side dialog param composite composite create param num columns numcolumns number columns created composite composite do create preview pane docreatepreviewpane composite composite num columns numcolumns create label createlabel num columns numcolumns composite formatter messages formattermessages modify dialog tab page modifydialogtabpage preview label text java preview javapreview preview do create java preview docreatejavapreview composite f default focus manager fdefaultfocusmanager add preview get control getcontrol grid data griddata create grid data creategriddata num columns numcolumns grid data griddata fill width hint widthhint height hint heighthint preview get control getcontrol set layout data setlayoutdata composite implemented subclasses method instance java preview javapreview choice compilation unit preview compilationunitpreview valid compilation unit snippet preview snippetpreview form ats formats independent code snippets displays window param parent parent composite created preview java preview javapreview do create java preview docreatejavapreview composite parent override make visible makevisible f default focus manager fdefaultfocusmanager reset focus resetfocus do update preview doupdatepreview update preview implemented subclasses do update preview doupdatepreview notify values modified notifyvaluesmodified f modify listener fmodifylistener values modified valuesmodified override set initial focus setinitialfocus f default focus manager fdefaultfocusmanager is used isused f default focus manager fdefaultfocusmanager restore focus restorefocus status field dialog tab report inconsistent input button disabled kind i status istatus error param status status describing current error update status updatestatus i status istatus status f modify listener fmodifylistener update status updatestatus status factory methods gui construction easier create grid layout gridlayout margin spacing settings number columns grid layout gridlayout create grid layout creategridlayout num columns numcolumns margins grid layout gridlayout layout grid layout gridlayout num columns numcolumns layout vertical spacing verticalspacing f pixel converter fpixelconverter convert vertical us to pixels convertverticaldlustopixels i dialog constants idialogconstants vertical spacing layout horizontal spacing horizontalspacing f pixel converter fpixelconverter convert horizontal us to pixels converthorizontaldlustopixels i dialog constants idialogconstants horizontal spacing margins layout margin height marginheight f pixel converter fpixelconverter convert vertical us to pixels convertverticaldlustopixels i dialog constants idialogconstants vertical margin layout margin width marginwidth f pixel converter fpixelconverter convert horizontal us to pixels converthorizontaldlustopixels i dialog constants idialogconstants horizontal margin layout margin height marginheight layout margin width marginwidth layout convenience method create grid data griddata grid data griddata create grid data creategriddata num columns numcolumns style width hint widthhint grid data griddata grid data griddata style horizontal span horizontalspan num columns numcolumns width hint widthhint width hint widthhint convenience method create label label create label createlabel num columns numcolumns composite parent string text create label createlabel num columns numcolumns parent text grid data griddata fill horizontal convenience method create label label create label createlabel num columns numcolumns composite parent string text grid data style griddatastyle label label label parent swt wrap label set font setfont parent get font getfont label set text settext text pixel converter pixelconverter pixel converter pixelconverter pixel converter pixelconverter parent label set layout data setlayoutdata create grid data creategriddata num columns numcolumns grid data style griddatastyle pixel converter pixelconverter convert horizontal us to pixels converthorizontaldlustopixels label convenience method create group group create group creategroup num columns numcolumns composite parent string text group group group parent swt group set font setfont parent get font getfont group set layout data setlayoutdata create grid data creategriddata num columns numcolumns grid data griddata fill horizontal swt grid layout gridlayout layout grid layout gridlayout num columns numcolumns layout vertical spacing verticalspacing f pixel converter fpixelconverter convert vertical us to pixels convertverticaldlustopixels i dialog constants idialogconstants vertical spacing layout horizontal spacing horizontalspacing f pixel converter fpixelconverter convert horizontal us to pixels converthorizontaldlustopixels i dialog constants idialogconstants horizontal spacing layout margin height marginheight f pixel converter fpixelconverter convert vertical us to pixels convertverticaldlustopixels i dialog constants idialogconstants vertical spacing layout margin height marginheight f pixel converter fpixelconverter convert vertical us to pixels convertverticaldlustopixels i dialog constants idialogconstants vertical margin layout margin width marginwidth f pixel converter fpixelconverter convert horizontal us to pixels converthorizontaldlustopixels i dialog constants idialogconstants horizontal margin create grid layout creategridlayout num columns numcolumns group set layout setlayout layout group set text settext text group convenience method create number preference numberpreference widget registered potential focus holder update r updater number preference numberpreference create number pref createnumberpref composite composite num columns numcolumns string string key min value minvalue max value maxvalue number preference numberpreference pref number preference numberpreference composite num columns numcolumns f working values fworkingvalues key min value minvalue max value maxvalue f default focus manager fdefaultfocusmanager add pref pref add observer addobserver f updater fupdater pref convenience method create string preference stringpreference widget registered potential focus holder update r updater string preference stringpreference create string pref createstringpref composite composite num columns numcolumns string string key i input validator iinputvalidator input validator inputvalidator string preference stringpreference pref string preference stringpreference composite num columns numcolumns f working values fworkingvalues key input validator inputvalidator f default focus manager fdefaultfocusmanager add pref pref add observer addobserver f updater fupdater pref convenience method create combo preference combopreference widget registered potential focus holder update r updater combo preference combopreference create combo pref createcombopref composite composite num columns numcolumns string string key string values string items combo preference combopreference pref combo preference combopreference composite num columns numcolumns f working values fworkingvalues key values items f default focus manager fdefaultfocusmanager add pref pref add observer addobserver f updater fupdater pref convenience method create checkbox preference checkboxpreference widget registered potential focus holder update r updater checkbox preference checkboxpreference create checkbox pref createcheckboxpref composite composite num columns numcolumns string string key string values checkbox preference checkboxpreference pref checkbox preference checkboxpreference composite num columns numcolumns f working values fworkingvalues key values f default focus manager fdefaultfocusmanager add pref pref add observer addobserver f updater fupdater pref radio preference radiopreference create radio pref createradiopref composite composite num columns numcolumns string string key string values radio preference radiopreference pref radio preference radiopreference composite num columns numcolumns f working values fworkingvalues key values f default focus manager fdefaultfocusmanager add pref pref add observer addobserver f updater fupdater pref create nice javadoc comment string string create preview header createpreviewheader string title nls nls title