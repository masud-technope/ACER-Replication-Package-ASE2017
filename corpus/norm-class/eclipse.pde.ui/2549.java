copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation peter friese peter f riese friese gen tleware gentleware bug org eclipse pde internal editor plugin org eclipse core runtime core exception coreexception org eclipse jface viewers structured selection structuredselection org eclipse jface window window org eclipse jface wizard wizard dialog wizarddialog org eclipse osgi util manifest element manifestelement org eclipse pde core plugin org eclipse pde internal core ibundle i bundle ibundle org eclipse pde internal core ibundle i bundle model ibundlemodel org eclipse pde internal pde plugin pdeplugin org eclipse pde internal pde ui messages pdeuimessages org eclipse pde internal dialogs plugin selection dialog pluginselectiondialog org eclipse pde internal editor form entry adapter formentryadapter org eclipse pde internal editor pde form page pdeformpage org eclipse pde internal editor validation control validation utility controlvalidationutility org eclipse pde internal editor validation text validator textvalidator org eclipse pde internal parts combo part combopart org eclipse pde internal parts form entry formentry org eclipse pde internal util swt util swtutil org eclipse pde internal wizards plugin new plugin project wizard newpluginprojectwizard org eclipse swt swt org eclipse swt events selection adapter selectionadapter org eclipse swt events selection event selectionevent org eclipse swt widgets composite org eclipse swt widgets label org eclipse i action bars iactionbars org eclipse forms i form colors iformcolors org eclipse forms events hyperlink event hyperlinkevent org eclipse forms widgets form toolkit formtoolkit org eclipse forms widgets table wrap data tablewrapdata org osgi framework bundle exception bundleexception org osgi framework constants fragment general info section fragmentgeneralinfosection general info section generalinfosection form entry formentry f plugin id entry fpluginidentry form entry formentry f plugin min version entry fpluginminversionentry form entry formentry f plugin max version entry fpluginmaxversionentry combo part combopart f plugin min version bound fpluginminversionbound combo part combopart f plugin max version bound fpluginmaxversionbound combo part combopart f match combo fmatchcombo text validator textvalidator f plugin id validator fpluginidvalidator text validator textvalidator f plugin min version validator fpluginminversionvalidator text validator textvalidator f plugin max version validator fpluginmaxversionvalidator fragment general info section fragmentgeneralinfosection pde form page pdeformpage composite parent parent override string get section description getsectiondescription pde ui messages pdeuimessages manifest editor manifesteditor plugin spec section pluginspecsection f desc fdesc override create specific controls createspecificcontrols composite parent form toolkit formtoolkit toolkit i action bars iactionbars action bars actionbars create plugin id entry createpluginidentry parent toolkit action bars actionbars create plugin version entry createpluginversionentry parent toolkit action bars actionbars is bundle isbundle create match combo creatematchcombo parent toolkit action bars actionbars create singleton createsingleton parent toolkit action bars actionbars pde ui messages pdeuimessages fragment general info section fragmentgeneralinfosection singleton create plugin id entry createpluginidentry composite parent form toolkit formtoolkit toolkit i action bars iactionbars action bars actionbars f plugin id entry fpluginidentry form entry formentry parent toolkit pde ui messages pdeuimessages general info section generalinfosection plugin id pluginid pde ui messages pdeuimessages general info section generalinfosection browse is editable iseditable f plugin id entry fpluginidentry set form entry listener setformentrylistener form entry adapter formentryadapter action bars actionbars override text value changed textvaluechanged form entry formentry entry i fragment ifragment get plugin base getpluginbase set plugin id setpluginid f plugin id entry fpluginidentry get value getvalue core exception coreexception pde plugin pdeplugin log exception logexception override link activated linkactivated hyperlink event hyperlinkevent string plugin f plugin id entry fpluginidentry get value getvalue plugin registry pluginregistry find model findmodel plugin i plugin model ipluginmodel create fragment plugin createfragmentplugin manifest editor manifesteditor open plugin editor openplugineditor f plugin id entry fpluginidentry get value getvalue override browse button selected browsebuttonselected form entry formentry entry handle open dialog handleopendialog create fragment plugin createfragmentplugin new plugin project wizard newpluginprojectwizard wizard nls new plugin project wizard newpluginprojectwizard nls equinox wizard init pde plugin pdeplugin get active workbench window getactiveworkbenchwindow get workbench getworkbench structured selection structuredselection wizard dialog wizarddialog dialog wizard dialog wizarddialog pde plugin pdeplugin get active workbench shell getactiveworkbenchshell wizard dialog create swt util swtutil set dialog size setdialogsize dialog dialog open window string plugin wizard get plugin id getpluginid i fragment ifragment get plugin base getpluginbase set plugin id setpluginid plugin f plugin id entry fpluginidentry set value setvalue plugin core exception coreexception pde plugin pdeplugin log exception logexception f plugin id entry fpluginidentry set editable seteditable is editable iseditable create validator f plugin id validator fpluginidvalidator text validator textvalidator get managed form getmanagedform f plugin id entry fpluginidentry get text gettext get project getproject override validate control validatecontrol validate plugin id validatepluginid validate plugin id validatepluginid validate host plugin control validation utility controlvalidationutility validate fragment host plugin field validatefragmenthostpluginfield f plugin id entry fpluginidentry get text gettext get text gettext f plugin id validator fpluginidvalidator get project getproject handle open dialog handleopendialog plugin selection dialog pluginselectiondialog dialog plugin selection dialog pluginselectiondialog get section getsection get shell getshell dialog create dialog open window i plugin model ipluginmodel model i plugin model ipluginmodel dialog get first result getfirstresult i plugin iplugin plugin model get plugin getplugin i fragment ifragment get plugin base getpluginbase set plugin id setpluginid plugin get id getid f plugin min version entry fpluginminversionentry set value setvalue plugin get version getversion i fragment ifragment get plugin base getpluginbase set plugin version setpluginversion get version getversion core exception coreexception create plugin version entry createpluginversionentry composite client form toolkit formtoolkit toolkit i action bars iactionbars action bars actionbars is bundle isbundle create bundle plugin version entry createbundlepluginversionentry client toolkit action bars actionbars create non bundle plugin version entry createnonbundlepluginversionentry client toolkit action bars actionbars create bundle plugin version entry createbundlepluginversionentry composite client form toolkit formtoolkit toolkit i action bars iactionbars action bars actionbars form entry adapter formentryadapter text listener textlistener form entry adapter formentryadapter action bars actionbars override text value changed textvaluechanged form entry formentry entry i fragment ifragment get plugin base getpluginbase set plugin version setpluginversion get version getversion core exception coreexception pde plugin pdeplugin log exception logexception override text dirty textdirty form entry formentry entry set fields enabled setfieldsenabled text dirty textdirty entry string items string pde ui messages pdeuimessages dependency properties dialog dependencypropertiesdialog combo inclusive comboinclusive pde ui messages pdeuimessages dependency properties dialog dependencypropertiesdialog combo exclusive comboexclusive f plugin min version entry fpluginminversionentry form entry formentry client toolkit pde ui messages pdeuimessages general info section generalinfosection host min version range hostminversionrange f plugin min version entry fpluginminversionentry set form entry listener setformentrylistener text listener textlistener f plugin min version entry fpluginminversionentry set editable seteditable is editable iseditable create validator f plugin min version validator fpluginminversionvalidator text validator textvalidator get managed form getmanagedform f plugin min version entry fpluginminversionentry get text gettext get project getproject override validate control validatecontrol validate plugin min version validatepluginminversion selection adapter selectionadapter combo listener combolistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent event i fragment ifragment get plugin base getpluginbase set plugin version setpluginversion get version getversion core exception coreexception pde plugin pdeplugin log exception logexception f plugin min version bound fpluginminversionbound combo part combopart f plugin min version bound fpluginminversionbound create control createcontrol client toolkit swt read f plugin min version bound fpluginminversionbound get control getcontrol set layout data setlayoutdata table wrap data tablewrapdata table wrap data tablewrapdata fill f plugin min version bound fpluginminversionbound set items setitems items f plugin min version bound fpluginminversionbound get control getcontrol set enabled setenabled is editable iseditable f plugin min version bound fpluginminversionbound add selection listener addselectionlistener combo listener combolistener f plugin max version entry fpluginmaxversionentry form entry formentry client toolkit pde ui messages pdeuimessages general info section generalinfosection host max version range hostmaxversionrange f plugin max version entry fpluginmaxversionentry set form entry listener setformentrylistener text listener textlistener f plugin max version entry fpluginmaxversionentry set editable seteditable is editable iseditable create validator f plugin max version validator fpluginmaxversionvalidator text validator textvalidator get managed form getmanagedform f plugin max version entry fpluginmaxversionentry get text gettext get project getproject override validate control validatecontrol validate plugin max version validatepluginmaxversion f plugin max version bound fpluginmaxversionbound combo part combopart f plugin max version bound fpluginmaxversionbound create control createcontrol client toolkit swt read f plugin max version bound fpluginmaxversionbound get control getcontrol set layout data setlayoutdata table wrap data tablewrapdata table wrap data tablewrapdata fill f plugin max version bound fpluginmaxversionbound set items setitems items f plugin max version bound fpluginmaxversionbound get control getcontrol set enabled setenabled is editable iseditable f plugin max version bound fpluginmaxversionbound add selection listener addselectionlistener combo listener combolistener validate plugin max version validatepluginmaxversion validation required optional field f plugin max version entry fpluginmaxversionentry get text gettext get text gettext length valid version control validation utility controlvalidationutility validate version field validateversionfield f plugin max version entry fpluginmaxversionentry get text gettext get text gettext f plugin max version validator fpluginmaxversionvalidator validate plugin min version validatepluginminversion validation required optional field f plugin min version entry fpluginminversionentry get text gettext get text gettext length valid version control validation utility controlvalidationutility validate version field validateversionfield f plugin min version entry fpluginminversionentry get text gettext get text gettext f plugin min version validator fpluginminversionvalidator create non bundle plugin version entry createnonbundlepluginversionentry composite client form toolkit formtoolkit toolkit i action bars iactionbars action bars actionbars f plugin min version entry fpluginminversionentry form entry formentry client toolkit pde ui messages pdeuimessages general info section generalinfosection plugin version pluginversion f plugin min version entry fpluginminversionentry set form entry listener setformentrylistener form entry adapter formentryadapter action bars actionbars override text value changed textvaluechanged form entry formentry entry i fragment ifragment get plugin base getpluginbase set plugin version setpluginversion entry get value getvalue core exception coreexception pde plugin pdeplugin log exception logexception f plugin min version entry fpluginminversionentry set editable seteditable is editable iseditable create match combo creatematchcombo composite client form toolkit formtoolkit toolkit i action bars iactionbars action bars actionbars label match label matchlabel toolkit create label createlabel client pde ui messages pdeuimessages manifest editor manifesteditor plugin spec section pluginspecsection version match versionmatch match label matchlabel set foreground setforeground toolkit get colors getcolors get color getcolor i form colors iformcolors title table wrap data tablewrapdata table wrap data tablewrapdata val ign valign table wrap data tablewrapdata middle match label matchlabel set layout data setlayoutdata f match combo fmatchcombo combo part combopart f match combo fmatchcombo create control createcontrol client toolkit swt read table wrap data tablewrapdata table wrap data tablewrapdata fill colspan val ign valign table wrap data tablewrapdata middle f match combo fmatchcombo get control getcontrol set layout data setlayoutdata string items nls string pde ui messages pdeuimessages manifest editor manifesteditor match section matchsection equivalent pde ui messages pdeuimessages manifest editor manifesteditor match section matchsection compatible pde ui messages pdeuimessages manifest editor manifesteditor match section matchsection per f ect perfect pde ui messages pdeuimessages manifest editor manifesteditor match section matchsection greater f match combo fmatchcombo set items setitems items f match combo fmatchcombo add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent event match f match combo fmatchcombo get selection index getselectionindex i fragment ifragment get plugin base getpluginbase set rule setrule match core exception coreexception pde plugin pdeplugin log exception logexception f match combo fmatchcombo get control getcontrol set enabled setenabled is editable iseditable override commit on save onsave f plugin id entry fpluginidentry commit f plugin min version entry fpluginminversionentry commit f plugin max version entry fpluginmaxversionentry commit commit on save onsave override cancel edit canceledit f plugin id entry fpluginidentry cancel edit canceledit f plugin min version entry fpluginminversionentry cancel edit canceledit f plugin max version entry fpluginmaxversionentry cancel edit canceledit cancel edit canceledit override refresh i plugin model base ipluginmodelbase model i plugin model base ipluginmodelbase get page getpage get model getmodel i fragment ifragment fragment i fragment ifragment model get plugin base getpluginbase f plugin id entry fpluginidentry set value setvalue fragment get plugin id getpluginid is bundle isbundle refresh version refreshversion f plugin min version entry fpluginminversionentry set value setvalue fragment get plugin version getpluginversion f match combo fmatchcombo f match combo fmatchcombo select fragment get rule getrule refresh string get attribute getattribute string header string attribute i bundle ibundle bundle get bundle getbundle bundle string bundle get header getheader header manifest element manifestelement elements manifest element manifestelement parse header parseheader header elements length elements get attribute getattribute attribute bundle exception bundleexception set fields enabled setfieldsenabled single version singleversion f plugin max version entry fpluginmaxversionentry get text gettext get text gettext trim length enabled f plugin min version entry fpluginminversionentry get text gettext get text gettext trim length f plugin max version entry fpluginmaxversionentry get text gettext set enabled setenabled enabled f plugin max version bound fpluginmaxversionbound get control getcontrol set enabled setenabled single version singleversion enabled is editable iseditable f plugin min version bound fpluginminversionbound get control getcontrol set enabled setenabled single version singleversion is editable iseditable string get version getversion is bundle isbundle f plugin min version entry fpluginminversionentry get value getvalue equals f plugin max version entry fpluginmaxversionentry get value getvalue f plugin max version entry fpluginmaxversionentry get text gettext get enabled getenabled f plugin max version entry fpluginmaxversionentry get value getvalue length f plugin min version entry fpluginminversionentry get value getvalue string version f plugin min version bound fpluginminversionbound get selection index getselectionindex nls version nls version version f plugin min version entry fpluginminversionentry get value getvalue nls f plugin max version entry fpluginmaxversionentry get value getvalue f plugin max version bound fpluginmaxversionbound get selection index getselectionindex nls version nls version version f plugin min version entry fpluginminversionentry get value getvalue refresh version refreshversion string version get attribute getattribute constants fragment host constants bundle version attribute version nls nls set version fields setversionfields set fields enabled setfieldsenabled version version trim nls com ind comind version index of indexof last pos lastpos version length version char at charat version char at charat last pos lastpos com ind comind nls set version fields setversionfields version version version substring last pos lastpos set version fields setversionfields version substring com ind comind version substring com ind comind set fields enabled setfieldsenabled set version fields setversionfields string min version minversion min inclusive mininclusive string max version maxversion max inclusive maxinclusive f plugin min version entry fpluginminversionentry set value setvalue min version minversion f plugin min version bound fpluginminversionbound select min inclusive mininclusive f plugin max version entry fpluginmaxversionentry set value setvalue max version maxversion f plugin max version bound fpluginmaxversionbound select max inclusive maxinclusive bug override add listeners addlisteners is bundle isbundle i bundle model ibundlemodel model get bundle getbundle get model getmodel model model add model changed listener addmodelchangedlistener add listeners addlisteners override remove listeners removelisteners is bundle isbundle i bundle model ibundlemodel model get bundle getbundle get model getmodel model model remove model changed listener removemodelchangedlistener remove listeners removelisteners