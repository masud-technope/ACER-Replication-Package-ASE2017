copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation simon scholz simon scholz vogella bug org eclipse pde internal wizards target java lang reflect invocation target exception invocationtargetexception java util java util list org eclipse core runtime org eclipse core runtime preferences i eclipse preferences ieclipsepreferences org eclipse core runtime preferences instance scope instancescope org eclipse debug string variable selection dialog stringvariableselectiondialog org eclipse equinox framework admin frameworkadmin bundle info bundleinfo org eclipse jdt launching java runtime javaruntime org eclipse jdt launching environments i execution environment iexecutionenvironment org eclipse jdt launching environments i execution environments manager iexecutionenvironmentsmanager org eclipse jface dialogs message dialog messagedialog org eclipse jface operation i runnable with progress irunnablewithprogress org eclipse jface viewers org eclipse jface window window org eclipse pde core plugin i plugin model base ipluginmodelbase org eclipse pde core plugin plugin registry pluginregistry org eclipse pde core target org eclipse pde internal core i core constants icoreconstants org eclipse pde internal core pde core pdecore org eclipse pde internal core util vm util vmutil org eclipse pde internal org eclipse pde internal dialogs plugin selection dialog pluginselectiondialog org eclipse pde internal elements default table provider defaulttableprovider org eclipse pde internal shared target org eclipse pde internal util locale util localeutil org eclipse swt swt org eclipse swt events org eclipse swt layout grid data griddata org eclipse swt layout grid layout gridlayout org eclipse swt widgets org eclipse i shared images isharedimages org eclipse platformui org eclipse progress ui job uijob wizard editing content target platform tab layout new target definition wizard newtargetdefinitionwizard edit target definition wizard edittargetdefinitionwizard target definition content page targetdefinitioncontentpage target definition page targetdefinitionpage nls string empty string text f name text fnametext tab item tabitem f location tab flocationtab target locations group targetlocationsgroup f location tree flocationtree target contents group targetcontentsgroup f content tree fcontenttree environment pull downs combo foscombo combo fwscombo combo f arch combo farchcombo combo fnlcombo choices pull tree set treeset string fnlchoices tree set treeset string foschoices tree set treeset string fwschoices tree set treeset string f arch choices farchchoices jre button fdefaultjrebutton button fnamedjrebutton button f exec env button fexecenvbutton combo f name d es combo fnamedjrescombo combo f exec envs combo fexecenvscombo tree set treeset string f exec env choices fexecenvchoices argument controls text f program args fprogramargs text fvmargs implicit dependencies tab table viewer tableviewer f element viewer felementviewer button f add button faddbutton button f remove button fremovebutton button f remove all button fremoveallbutton wrappers progress monitor avoid opening dialog operation blocked blocked message sub task subtask bug progress wizard dialog wizarddialog opens dialog blocked resolution progress monitor resolutionprogressmonitor progress monitor wrapper progressmonitorwrapper resolution progress monitor resolutionprogressmonitor i progress monitor iprogressmonitor monitor monitor override set blocked setblocked i status istatus reason sub task subtask reason get message getmessage override clear blocked clearblocked nls sub task subtask param page name pagename target definition content page targetdefinitioncontentpage i target definition itargetdefinition target nls target content targetcontent target set title settitle pde ui messages pdeuimessages target definition content page targetdefinitioncontentpage set description setdescription pde ui messages pdeuimessages target definition content page targetdefinitioncontentpage set image descriptor setimagedescriptor pde plugin images pdepluginimages desc target wiz override create control createcontrol composite parent composite comp swt factory swtfactory create composite createcomposite parent grid data griddata fill composite name comp namecomp swt factory swtfactory create composite createcomposite comp grid data griddata fill horizontal swt factory swtfactory create label createlabel name comp namecomp pde ui messages pdeuimessages target definition content page targetdefinitioncontentpage f name text fnametext swt factory swtfactory create single text createsingletext name comp namecomp f name text fnametext add modify listener addmodifylistener modify listener modifylistener override modify text modifytext modify event modifyevent string f name text fnametext get text gettext trim length set error message seterrormessage pde ui messages pdeuimessages target definition content page targetdefinitioncontentpage set error message seterrormessage set message setmessage pde ui messages pdeuimessages target definition content page targetdefinitioncontentpage get target definition gettargetdefinition set name setname set page complete setpagecomplete is page complete ispagecomplete tab folder tabfolder tabs tab folder tabfolder comp swt tabs set layout data setlayoutdata grid data griddata grid data griddata fill tabs set font setfont comp get font getfont f location tab flocationtab tab item tabitem tabs swt f location tab flocationtab set text settext pde ui messages pdeuimessages location section locationsection composite plugin tab container plugintabcontainer swt factory swtfactory create composite createcomposite tabs grid data griddata fill swt factory swtfactory create wrap label createwraplabel plugin tab container plugintabcontainer pde ui messages pdeuimessages target definition content page targetdefinitioncontentpage location description locationdescription f location tree flocationtree target locations group targetlocationsgroup create in dialog createindialog plugin tab container plugintabcontainer f location tab flocationtab set control setcontrol plugin tab container plugintabcontainer platformui get workbench getworkbench get help system gethelpsystem set help sethelp plugin tab container plugintabcontainer i help context ids ihelpcontextids edit target wizard locations tab tab item tabitem content tab contenttab tab item tabitem tabs swt content tab contenttab set text settext pde ui messages pdeuimessages target definition content page targetdefinitioncontentpage composite content tab container contenttabcontainer swt factory swtfactory create composite createcomposite tabs grid data griddata fill swt factory swtfactory create wrap label createwraplabel content tab container contenttabcontainer pde ui messages pdeuimessages content section contentsection f content tree fcontenttree target contents group targetcontentsgroup create in dialog createindialog content tab container contenttabcontainer content tab contenttab set control setcontrol content tab container contenttabcontainer platformui get workbench getworkbench get help system gethelpsystem set help sethelp content tab container contenttabcontainer i help context ids ihelpcontextids edit target wizard content tab tab item tabitem env tab envtab tab item tabitem tabs swt env tab envtab set text settext pde ui messages pdeuimessages target definition environment page targetdefinitionenvironmentpage composite env tab container envtabcontainer swt factory swtfactory create composite createcomposite tabs grid data griddata fill create target environment group createtargetenvironmentgroup env tab container envtabcontainer createjregroup env tab container envtabcontainer env tab envtab set control setcontrol env tab container envtabcontainer platformui get workbench getworkbench get help system gethelpsystem set help sethelp env tab container envtabcontainer i help context ids ihelpcontextids edit target wizard environment tab tab item tabitem args tab argstab tab item tabitem tabs swt args tab argstab set text settext pde ui messages pdeuimessages target definition environment page targetdefinitionenvironmentpage args tab argstab set control setcontrol create arguments group createargumentsgroup tabs platformui get workbench getworkbench get help system gethelpsystem set help sethelp args tab argstab get control getcontrol i help context ids ihelpcontextids edit target wizard argument tab tab item tabitem dep tab deptab tab item tabitem tabs swt dep tab deptab set text settext pde ui messages pdeuimessages target definition environment page targetdefinitionenvironmentpage dep tab deptab set control setcontrol create implicit tab contents createimplicittabcontents tabs platformui get workbench getworkbench get help system gethelpsystem set help sethelp dep tab deptab get control getcontrol i help context ids ihelpcontextids edit target wizard implicit tab platformui get workbench getworkbench get help system gethelpsystem set help sethelp comp i help context ids ihelpcontextids edit target wizard initialize listeners initializelisteners target changed targetchanged get target definition gettargetdefinition set control setcontrol comp initialize listeners initializelisteners i target changed listener itargetchangedlistener listener i target changed listener itargetchangedlistener override contents changed contentschanged i target definition itargetdefinition definition object source resolve force resolve forceresolve set cancelled setcancelled force resolve forceresolve resolve definition is resolved isresolved get container getcontainer i runnable with progress irunnablewithprogress override i progress monitor iprogressmonitor monitor invocation target exception invocationtargetexception interrupted exception interruptedexception get target definition gettargetdefinition resolve resolution progress monitor resolutionprogressmonitor monitor monitor is canceled iscanceled interrupted exception interruptedexception invocation target exception invocationtargetexception pde core pdecore log interrupted exception interruptedexception set cancelled setcancelled f content tree fcontenttree source set cancelled setcancelled user can celled cancelled resolve change text can celled cancelled f content tree fcontenttree set cancelled setcancelled f content tree fcontenttree set input setinput definition f location tree flocationtree source f location tree flocationtree set input setinput definition definition is resolved isresolved definition get status getstatus get severity getseverity i status istatus error f location tab flocationtab set image setimage platformui get workbench getworkbench get shared images getsharedimages get image getimage i shared images isharedimages img objs error tsk f location tab flocationtab set image setimage f content tree fcontenttree add target changed listener addtargetchangedlistener listener f location tree flocationtree add target changed listener addtargetchangedlistener listener override target changed targetchanged i target definition itargetdefinition definition target changed targetchanged definition definition isn open running job dialog time finish opening ui job uijob pde ui messages pdeuimessages target definition content page targetdefinitioncontentpage override i status istatus runinuithread i progress monitor iprogressmonitor monitor i target definition itargetdefinition definition get target definition gettargetdefinition definition is resolved isresolved get container getcontainer i runnable with progress irunnablewithprogress override i progress monitor iprogressmonitor monitor invocation target exception invocationtargetexception interrupted exception interruptedexception get target definition gettargetdefinition resolve resolution progress monitor resolutionprogressmonitor monitor monitor is canceled iscanceled interrupted exception interruptedexception invocation target exception invocationtargetexception pde core pdecore log interrupted exception interruptedexception f content tree fcontenttree set cancelled setcancelled status cancel status f content tree fcontenttree set input setinput definition f location tree flocationtree set input setinput definition definition is resolved isresolved definition get status getstatus get severity getseverity i status istatus error f location tab flocationtab set image setimage platformui get workbench getworkbench get shared images getsharedimages get image getimage i shared images isharedimages img objs error tsk f location tab flocationtab set image setimage status status schedule string definition get name getname empty string trim length f name text fnametext set text settext set message setmessage pde ui messages pdeuimessages target definition content page targetdefinitioncontentpage f location tree flocationtree set input setinput definition f content tree fcontenttree set input setinput definition string preset value presetvalue definition getos empty string definition getos foscombo set text settext preset value presetvalue preset value presetvalue definition getws empty string definition getws fwscombo set text settext preset value presetvalue preset value presetvalue definition get arch getarch empty string definition get arch getarch f arch combo farchcombo set text settext preset value presetvalue preset value presetvalue definition getnl empty string locale util localeutil expand locale name expandlocalename definition getnl fnlcombo set text settext preset value presetvalue i path ipath jre path jrepath definition getjrecontainer jre path jrepath jre path jrepath equals java runtime javaruntime newdefaultjrecontainerpath fdefaultjrebutton set selection setselection string java runtime javaruntime get execution environment id getexecutionenvironmentid jre path jrepath f exec env button fexecenvbutton set selection setselection f exec envs combo fexecenvscombo select f exec envs combo fexecenvscombo index of indexof string java runtime javaruntime getvminstallname jre path jrepath fnamedjrebutton set selection setselection f name d es combo fnamedjrescombo select f name d es combo fnamedjrescombo index of indexof f exec envs combo fexecenvscombo get selection index getselectionindex f exec envs combo fexecenvscombo set text settext f exec env choices fexecenvchoices to string tostring f name d es combo fnamedjrescombo get selection index getselectionindex f name d es combo fnamedjrescombo set text settext vm util vmutil get default install name getdefaultvminstallname updatejrewidgets preset value presetvalue definition get program arguments getprogramarguments empty string definition get program arguments getprogramarguments f program args fprogramargs set text settext preset value presetvalue preset value presetvalue definition getvmarguments empty string definition getvmarguments fvmargs set text settext preset value presetvalue f element viewer felementviewer refresh create target environment group createtargetenvironmentgroup composite container group group swt factory swtfactory create group creategroup container pde ui messages pdeuimessages environment block environmentblock target env targetenv grid data griddata fill horizontal initialize choices initializechoices swt factory swtfactory create wrap label createwraplabel group pde ui messages pdeuimessages environment section environmentsection description swt factory swtfactory create label createlabel group pde ui messages pdeuimessages preferences target environment page targetenvironmentpage foscombo swt factory swtfactory create combo createcombo group swt single swt border foschoices to array toarray string foschoices size foscombo add modify listener addmodifylistener modify listener modifylistener override modify text modifytext modify event modifyevent get target definition gettargetdefinition setos get model value getmodelvalue foscombo get text gettext swt factory swtfactory create label createlabel group pde ui messages pdeuimessages preferences target environment page targetenvironmentpage fwscombo swt factory swtfactory create combo createcombo group swt single swt border fwschoices to array toarray string fwschoices size fwscombo add modify listener addmodifylistener modify listener modifylistener override modify text modifytext modify event modifyevent get target definition gettargetdefinition setws get model value getmodelvalue fwscombo get text gettext swt factory swtfactory create label createlabel group pde ui messages pdeuimessages preferences target environment page targetenvironmentpage arch f arch combo farchcombo swt factory swtfactory create combo createcombo group swt single swt border f arch choices farchchoices to array toarray string f arch choices farchchoices size f arch combo farchcombo add modify listener addmodifylistener modify listener modifylistener override modify text modifytext modify event modifyevent get target definition gettargetdefinition set arch setarch get model value getmodelvalue f arch combo farchcombo get text gettext swt factory swtfactory create label createlabel group pde ui messages pdeuimessages preferences target environment page targetenvironmentpage fnlcombo swt factory swtfactory create combo createcombo group swt single swt border fnlchoices to array toarray string fnlchoices size fnlcombo add modify listener addmodifylistener modify listener modifylistener override modify text modifytext modify event modifyevent string fnlcombo get text gettext nls index of indexof nls substring get target definition gettargetdefinition setnl get model value getmodelvalue returns string code code string empty setting target definition param trimmed code code string get model value getmodelvalue string trim length delim its delimits comma separated preference add items param param preference add extra choices addextrachoices string string preference nls string tokenizer stringtokenizer tokenizer string tokenizer stringtokenizer preference tokenizer has more tokens hasmoretokens add tokenizer next token nexttoken trim loads combo choices from t fromt platform pde core preferences initialize choices initializechoices i eclipse preferences ieclipsepreferences node instance scope instancescope instance get node getnode pde core pdecore plugin foschoices tree set treeset string platform knownosvalues length foschoices add string pref node i core constants icoreconstants extra empty string empty string equals pref add extra choices addextrachoices foschoices pref fwschoices tree set treeset string platform knownwsvalues length fwschoices add pref node i core constants icoreconstants extra empty string empty string equals pref add extra choices addextrachoices fwschoices pref f arch choices farchchoices tree set treeset string arch platform knownosarchvalues arch length f arch choices farchchoices add arch pref node i core constants icoreconstants arch extra empty string empty string equals pref add extra choices addextrachoices f arch choices farchchoices pref fnlchoices tree set treeset string locale util localeutil get locales getlocales length fnlchoices add pref node i core constants icoreconstants extra empty string empty string equals pref add extra choices addextrachoices fnlchoices pref createjregroup composite container group group swt factory swtfactory create group creategroup container pde ui messages pdeuimessages environment block environmentblock jre title jretitle grid data griddata fill horizontal initializejrevalues swt factory swtfactory create wrap label createwraplabel group pde ui messages pdeuimessages jre section jresection description fdefaultjrebutton swt factory swtfactory create radio button createradiobutton group pde ui messages pdeuimessages jre section jresection defaultjre fdefaultjrebutton add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent updatejrewidgets get target definition gettargetdefinition setjrecontainer java runtime javaruntime newdefaultjrecontainerpath fnamedjrebutton swt factory swtfactory create radio button createradiobutton group pde ui messages pdeuimessages jre section jresection jre name jrename fnamedjrebutton add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent updatejrewidgets get target definition gettargetdefinition setjrecontainer java runtime javaruntime newjrecontainerpath vm util vmutil getvminstall f name d es combo fnamedjrescombo get text gettext f name d es combo fnamedjrescombo swt factory swtfactory create combo createcombo group swt single swt border swt read vm util vmutil getvminstallnames f name d es combo fnamedjrescombo add modify listener addmodifylistener modify listener modifylistener override modify text modifytext modify event modifyevent get target definition gettargetdefinition setjrecontainer java runtime javaruntime newjrecontainerpath vm util vmutil getvminstall f name d es combo fnamedjrescombo get text gettext f exec env button fexecenvbutton swt factory swtfactory create radio button createradiobutton group pde ui messages pdeuimessages jre section jresection execution env executionenv f exec env button fexecenvbutton add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent updatejrewidgets get target definition gettargetdefinition setjrecontainer java runtime javaruntime newjrecontainerpath vm util vmutil get execution environment getexecutionenvironment f exec envs combo fexecenvscombo get text gettext f exec envs combo fexecenvscombo swt factory swtfactory create combo createcombo group swt single swt border swt read f exec env choices fexecenvchoices to array toarray string f exec env choices fexecenvchoices size f exec envs combo fexecenvscombo add modify listener addmodifylistener modify listener modifylistener override modify text modifytext modify event modifyevent get target definition gettargetdefinition setjrecontainer java runtime javaruntime newjrecontainerpath vm util vmutil get execution environment getexecutionenvironment f exec envs combo fexecenvscombo get text gettext initializes combo execution environments initializejrevalues f exec env choices fexecenvchoices tree set treeset i execution environments manager iexecutionenvironmentsmanager manager java runtime javaruntime get execution environments manager getexecutionenvironmentsmanager i execution environment iexecutionenvironment envs manager get execution environments getexecutionenvironments envs length f exec env choices fexecenvchoices add envs get id getid updatejrewidgets f name d es combo fnamedjrescombo set enabled setenabled fnamedjrebutton get selection getselection f exec envs combo fexecenvscombo set enabled setenabled f exec env button fexecenvbutton get selection getselection control create arguments group createargumentsgroup composite parent composite container swt factory swtfactory create composite createcomposite parent grid data griddata fill swt factory swtfactory create wrap label createwraplabel container pde ui messages pdeuimessages java arguments tab javaargumentstab description group program group programgroup swt factory swtfactory create group creategroup container pde ui messages pdeuimessages java arguments tab javaargumentstab pro gam args group progamargsgroup grid data griddata fill horizontal f program args fprogramargs swt factory swtfactory create text createtext program group programgroup swt multi swt wrap swt border swt scroll grid data griddata fill f program args fprogramargs add modify listener addmodifylistener modify listener modifylistener override modify text modifytext modify event modifyevent get target definition gettargetdefinition set program arguments setprogramarguments f program args fprogramargs get text gettext trim composite program buttons programbuttons swt factory swtfactory create composite createcomposite program group programgroup grid data griddata horizontal align button program vars programvars swt factory swtfactory create push button createpushbutton program buttons programbuttons pde ui messages pdeuimessages java arguments tab javaargumentstab program variables programvariables grid data griddata horizontal align program vars programvars add selection listener addselectionlistener get variables listener getvariableslistener f program args fprogramargs group vm group vmgroup group container swt vm group vmgroup set layout setlayout grid layout gridlayout vm group vmgroup set layout data setlayoutdata grid data griddata grid data griddata fill horizontal vm group vmgroup set text settext pde ui messages pdeuimessages java arguments tab javaargumentstab vm args group vmargsgroup vm group vmgroup set font setfont container get font getfont fvmargs swt factory swtfactory create text createtext vm group vmgroup swt multi swt wrap swt border swt scroll grid data griddata fill fvmargs add modify listener addmodifylistener modify listener modifylistener override modify text modifytext modify event modifyevent get target definition gettargetdefinition setvmarguments fvmargs get text gettext trim composite buttons swt factory swtfactory create composite createcomposite vm group vmgroup grid data griddata horizontal align button vm args vmargs swt factory swtfactory create push button createpushbutton buttons pde ui messages pdeuimessages java arguments tab javaargumentstab addvmargs grid data griddata horizontal align vm args vmargs add selection listener addselectionlistener getvmargslistener fvmargs button vm vars vmvars swt factory swtfactory create push button createpushbutton buttons pde ui messages pdeuimessages java arguments tab javaargumentstab vm variables vmvariables grid data griddata horizontal align vm vars vmvars add selection listener addselectionlistener get variables listener getvariableslistener fvmargs container provide listener add arguments button listener invokes code vm arguments selection dialog vmargumentsselectiondialog code updates selected arguments arguments text box param text control textcontrol code selection listener selectionlistener code add arguments button selection listener selectionlistener getvmargslistener text text control textcontrol selection adapter selectionadapter override widget selected widgetselected selection event selectionevent arguments from container selection dialog argumentsfromcontainerselectiondialog dialog arguments from container selection dialog argumentsfromcontainerselectiondialog get shell getshell get target definition gettargetdefinition dialog open window string args dialog get selected arguments getselectedarguments args args length string buffer stringbuffer result buffer resultbuffer string buffer stringbuffer args length nls result buffer resultbuffer append nls args fvmargs insert result buffer resultbuffer to string tostring provide listener variables button listener invokes code string variable selection dialog stringvariableselectiondialog code updates selected variables arguments text box param text control textcontrol code selection listener selectionlistener code variables button selection listener selectionlistener get variables listener getvariableslistener text text control textcontrol selection adapter selectionadapter override widget selected widgetselected selection event selectionevent string variable selection dialog stringvariableselectiondialog dialog string variable selection dialog stringvariableselectiondialog get shell getshell dialog open string variable dialog get variable expression getvariableexpression variable text control textcontrol insert variable control create implicit tab contents createimplicittabcontents composite parent composite container composite parent swt grid layout gridlayout layout grid layout gridlayout container set layout setlayout layout container set layout data setlayoutdata grid data griddata grid data griddata fill container set font setfont parent get font getfont create imp label createimplabel container create imp table createimptable container create imp buttons createimpbuttons container container create imp label createimplabel composite container label label label container swt label set text settext pde ui messages pdeuimessages target implicit plugins tab targetimplicitpluginstab desc label set font setfont container get font getfont grid data griddata grid data griddata grid data griddata fill horizontal horizontal span horizontalspan label set layout data setlayoutdata create imp table createimptable composite container f element viewer felementviewer table viewer tableviewer container swt multi swt scroll swt border grid data griddata grid data griddata grid data griddata fill height hint heighthint f element viewer felementviewer get control getcontrol set layout data setlayoutdata f element viewer felementviewer get control getcontrol set font setfont container get font getfont f element viewer felementviewer set content provider setcontentprovider default table provider defaulttableprovider override object get elements getelements object input element inputelement i target definition itargetdefinition target get target definition gettargetdefinition target name version descriptor nameversiondescriptor bundles target get implicit dependencies getimplicitdependencies bundles bundles name version descriptor nameversiondescriptor f element viewer felementviewer set label provider setlabelprovider styled bundle label provider styledbundlelabelprovider f element viewer felementviewer set input setinput pde plugin pdeplugin get default getdefault f element viewer felementviewer set comparator setcomparator viewer comparator viewercomparator override compare viewer viewer object object name version descriptor nameversiondescriptor bundle name version descriptor nameversiondescriptor name version descriptor nameversiondescriptor bundle name version descriptor nameversiondescriptor compare viewer bundle get id getid bundle get id getid f element viewer felementviewer add selection changed listener addselectionchangedlistener i selection changed listener iselectionchangedlistener override selection changed selectionchanged selection changed event selectionchangedevent event update imp buttons updateimpbuttons f element viewer felementviewer get table gettable add key listener addkeylistener key adapter keyadapter override key pressed keypressed key event keyevent character swt del state mask statemask handle remove handleremove create imp buttons createimpbuttons composite container composite button container buttoncontainer swt factory swtfactory create composite createcomposite container grid data griddata fill vertical f add button faddbutton swt factory swtfactory create push button createpushbutton button container buttoncontainer pde ui messages pdeuimessages source block sourceblock add f add button faddbutton add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent handle add handleadd f remove button fremovebutton swt factory swtfactory create push button createpushbutton button container buttoncontainer pde ui messages pdeuimessages source block sourceblock remove f remove button fremovebutton add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent handle remove handleremove f remove all button fremoveallbutton swt factory swtfactory create push button createpushbutton button container buttoncontainer pde ui messages pdeuimessages target implicit plugins tab targetimplicitpluginstab remove all removeall f remove all button fremoveallbutton add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent handle remove all handleremoveall update imp buttons updateimpbuttons handle add handleadd collection i plugin model base ipluginmodelbase valid plugin model bundles validpluginmodelbundles valid plugin model bundles validpluginmodelbundles get valid plugin model bundles getvalidpluginmodelbundles core exception coreexception message dialog messagedialog open warning openwarning get shell getshell pde ui messages pdeuimessages plugin selection dialog pluginselectiondialog title get message getmessage valid plugin model bundles validpluginmodelbundles plugin selection dialog pluginselectiondialog plugin selection dialog pluginselectiondialog plugin selection dialog pluginselectiondialog get shell getshell valid plugin model bundles validpluginmodelbundles to array toarray i plugin model base ipluginmodelbase valid plugin model bundles validpluginmodelbundles size plugin selection dialog pluginselectiondialog open window object result plugin selection dialog pluginselectiondialog get result getresult name version descriptor nameversiondescriptor all dependencies alldependencies hash set hashset object result item resultitem result i plugin model base ipluginmodelbase desc i plugin model base ipluginmodelbase result item resultitem all dependencies alldependencies add name version descriptor nameversiondescriptor desc get bundle description getbundledescription get symbolic name getsymbolicname name version descriptor nameversiondescriptor current bundles currentbundles get target definition gettargetdefinition get implicit dependencies getimplicitdependencies current bundles currentbundles all dependencies alldependencies add all addall arrays as list aslist current bundles currentbundles get target definition gettargetdefinition set implicit dependencies setimplicitdependencies all dependencies alldependencies to array toarray name version descriptor nameversiondescriptor all dependencies alldependencies size f element viewer felementviewer refresh update imp buttons updateimpbuttons list bundles implicit dependencies list dependencies collection i plugin model base ipluginmodelbase get valid plugin model bundles getvalidpluginmodelbundles core exception coreexception name version descriptor nameversiondescriptor current get target definition gettargetdefinition get implicit dependencies getimplicitdependencies string current bundles currentbundles hash set hashset current name version descriptor nameversiondescriptor name version descriptor nameversiondescriptor current current bundles currentbundles add name version descriptor nameversiondescriptor get id getid target bundle targetbundle all target bundles alltargetbundles get target definition gettargetdefinition get all bundles getallbundles list i plugin model base ipluginmodelbase target bundles targetbundles array list arraylist all target bundles alltargetbundles all target bundles alltargetbundles length core exception coreexception status i status istatus warning pde plugin pdeplugin get plugin id getpluginid pde ui messages pdeuimessages implicit dependencies section implicitdependenciessection target bundle targetbundle target bundle targetbundle all target bundles alltargetbundles bundle info bundleinfo bundle info bundleinfo target bundle targetbundle get bundle info getbundleinfo avoid duplicate entries current bundles currentbundles add bundle info bundleinfo get symbolic name getsymbolicname i plugin model base ipluginmodelbase plugin model base pluginmodelbase plugin registry pluginregistry find model findmodel bundle info bundleinfo get symbolic name getsymbolicname plugin model base pluginmodelbase target bundles targetbundles add plugin model base pluginmodelbase target bundles targetbundles list bundles implicit dependencies list dependencies bundle info bundleinfo get valid bundles getvalidbundles core exception coreexception name version descriptor nameversiondescriptor current get target definition gettargetdefinition get implicit dependencies getimplicitdependencies string current bundles currentbundles hash set hashset current name version descriptor nameversiondescriptor name version descriptor nameversiondescriptor current current bundles currentbundles add name version descriptor nameversiondescriptor get id getid list bundle info bundleinfo target bundles targetbundles array list arraylist target bundle targetbundle all target bundles alltargetbundles get target definition gettargetdefinition get all bundles getallbundles all target bundles alltargetbundles all target bundles alltargetbundles length core exception coreexception status i status istatus warning pde plugin pdeplugin get plugin id getpluginid pde ui messages pdeuimessages implicit dependencies section implicitdependenciessection target bundle targetbundle target bundle targetbundle all target bundles alltargetbundles bundle info bundleinfo bundle info bundleinfo target bundle targetbundle get bundle info getbundleinfo avoid duplicate entries current bundles currentbundles add bundle info bundleinfo get symbolic name getsymbolicname target bundles targetbundles add bundle info bundleinfo target bundles targetbundles to array toarray bundle info bundleinfo target bundles targetbundles size handle remove handleremove linked list linkedlist name version descriptor nameversiondescriptor bundles linked list linkedlist bundles add all addall arrays as list aslist get target definition gettargetdefinition get implicit dependencies getimplicitdependencies object remove bundles removebundles i structured selection istructuredselection f element viewer felementviewer get selection getselection to array toarray remove bundles removebundles length remove bundles removebundles length remove bundles removebundles name version descriptor nameversiondescriptor bundles remove remove bundles removebundles get target definition gettargetdefinition set implicit dependencies setimplicitdependencies bundles to array toarray name version descriptor nameversiondescriptor bundles size f element viewer felementviewer refresh update imp buttons updateimpbuttons handle remove all handleremoveall get target definition gettargetdefinition set implicit dependencies setimplicitdependencies f element viewer felementviewer refresh update imp buttons updateimpbuttons update imp buttons updateimpbuttons empty f element viewer felementviewer get selection getselection is empty isempty f remove button fremovebutton set enabled setenabled empty has elements haselements f element viewer felementviewer get table gettable get item count getitemcount f remove all button fremoveallbutton set enabled setenabled has elements haselements override is page complete ispagecomplete f name text fnametext get text gettext trim length override set visible setvisible visible set visible setvisible visible visible set focus setfocus set focus setfocus f name text fnametext set focus setfocus f name text fnametext select all selectall