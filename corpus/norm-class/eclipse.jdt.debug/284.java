copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt debug launch configurations launchconfigurations java lang reflect invocation target exception invocationtargetexception org eclipse core resources i project iproject org eclipse core resources i resource iresource org eclipse core resources i workspace iworkspace org eclipse core resources resources plugin resourcesplugin org eclipse core runtime core exception coreexception org eclipse core runtime i status istatus org eclipse debug core i launch configuration ilaunchconfiguration org eclipse debug core i launch configuration working copy ilaunchconfigurationworkingcopy org eclipse debug internal swt factory swtfactory org eclipse jdt core i java element ijavaelement org eclipse jdt core i java model ijavamodel org eclipse jdt core i java project ijavaproject org eclipse jdt core i type itype org eclipse jdt core java core javacore org eclipse jdt core java model exception javamodelexception org eclipse jdt core search i java search scope ijavasearchscope org eclipse jdt core search search engine searchengine org eclipse jdt debug i java debug constants ijavadebuguiconstants org eclipse jdt internal debug i java debug help context ids ijavadebughelpcontextids org eclipse jdt internal debug jdidebuguiplugin org eclipse jdt internal debug launcher debug type selection dialog debugtypeselectiondialog org eclipse jdt internal debug launcher launcher messages launchermessages org eclipse jdt internal debug launcher main method search engine mainmethodsearchengine org eclipse jdt internal debug launcher shared java main tab sharedjavamaintab org eclipse jdt launching i java launch configuration constants ijavalaunchconfigurationconstants org eclipse jdt i shared images isharedimages org eclipse jdt javaui org eclipse jface window window org eclipse osgi util nls org eclipse swt graphics image org eclipse swt layout grid data griddata org eclipse swt layout grid layout gridlayout org eclipse swt widgets button org eclipse swt widgets composite org eclipse platformui java main tab javamaintab shared java main tab sharedjavamaintab launch configuration attribute indicating external jars runtime classpath searched main type code code nls string attr include external jars i java debug constants ijavadebuguiconstants plugin include external jars launch configuration attribute indicating types inheriting main method considered searching main type code code nls string attr inherited main i java debug constants ijavadebuguiconstants plugin inherited main widgets button f search external jars check button fsearchexternaljarscheckbutton button f consider inherited main button fconsiderinheritedmainbutton button f stop in main check button fstopinmaincheckbutton javadoc org eclipse debug i launch configuration tab ilaunchconfigurationtab create control createcontrol org eclipse swt widgets composite override create control createcontrol composite parent composite comp swt factory swtfactory create composite createcomposite parent parent get font getfont grid data griddata fill grid layout gridlayout comp get layout getlayout vertical spacing verticalspacing create project editor createprojecteditor comp create vertical space r createverticalspacer comp create main type editor createmaintypeeditor comp launcher messages launchermessages java main tab javamaintab main cla set control setcontrol comp platformui get workbench getworkbench get help system gethelpsystem set help sethelp get control getcontrol i java debug help context ids ijavadebughelpcontextids launch configuration dialog main tab org eclipse jdt internal debug launcher shared java main tab sharedjavamaintab create main type extensions createmaintypeextensions org eclipse swt widgets composite override create main type extensions createmaintypeextensions composite parent f search external jars check button fsearchexternaljarscheckbutton swt factory swtfactory create check button createcheckbutton parent launcher messages launchermessages java main tab javamaintab jars f search external jars check button fsearchexternaljarscheckbutton add selection listener addselectionlistener get default listener getdefaultlistener f consider inherited main button fconsiderinheritedmainbutton swt factory swtfactory create check button createcheckbutton parent launcher messages launchermessages java main tab javamaintab f consider inherited main button fconsiderinheritedmainbutton add selection listener addselectionlistener get default listener getdefaultlistener f stop in main check button fstopinmaincheckbutton swt factory swtfactory create check button createcheckbutton parent launcher messages launchermessages java main tab javamaintab main f stop in main check button fstopinmaincheckbutton add selection listener addselectionlistener get default listener getdefaultlistener javadoc org eclipse debug abstract launch configuration tab abstractlaunchconfigurationtab get image getimage override image get image getimage javaui get shared images getsharedimages get image getimage i shared images isharedimages img objs javadoc org eclipse debug i launch configuration tab ilaunchconfigurationtab get name getname override string get name getname launcher messages launchermessages java main tab javamaintab main org eclipse debug abstract launch configuration tab abstractlaunchconfigurationtab get id getid override string get id getid nls org eclipse jdt debug java main tab javamaintab dialog lists main types override handle search button selected handlesearchbuttonselected i java project ijavaproject project get java project getjavaproject i java element ijavaelement elements project project exists i java model ijavamodel model java core javacore create resources plugin resourcesplugin get workspace getworkspace get root getroot model elements model get java projects getjavaprojects java model exception javamodelexception jdidebuguiplugin log elements i java element ijavaelement project elements elements i java element ijavaelement constraints i java search scope ijavasearchscope sources constraints i java search scope ijavasearchscope application libraries f search external jars check button fsearchexternaljarscheckbutton get selection getselection constraints i java search scope ijavasearchscope system libraries i java search scope ijavasearchscope search scope searchscope search engine searchengine create java search scope createjavasearchscope elements constraints main method search engine mainmethodsearchengine engine main method search engine mainmethodsearchengine i type itype types types engine search main methods searchmainmethods get launch configuration dialog getlaunchconfigurationdialog search scope searchscope f consider inherited main button fconsiderinheritedmainbutton get selection getselection invocation target exception invocationtargetexception set error message seterrormessage get message getmessage interrupted exception interruptedexception set error message seterrormessage get message getmessage debug type selection dialog debugtypeselectiondialog mmsd debug type selection dialog debugtypeselectiondialog get shell getshell types launcher messages launchermessages java main tab javamaintab choose main type mmsd open window cancel object mmsd get result getresult i type itype type i type itype type f main text fmaintext set text settext type get fully qualified name getfullyqualifiedname f proj text fprojtext set text settext type get java project getjavaproject get element name getelementname javadoc org eclipse jdt internal debug launcher abstract java main tab abstractjavamaintab initialize from initializefrom org eclipse debug core i launch configuration ilaunchconfiguration override initialize from initializefrom i launch configuration ilaunchconfiguration config initialize from initializefrom config update main type from config updatemaintypefromconfig config update stop in main from config updatestopinmainfromconfig config update inherited mains from config updateinheritedmainsfromconfig config update external jars updateexternaljars config javadoc org eclipse debug abstract launch configuration tab abstractlaunchconfigurationtab is valid isvalid org eclipse debug core i launch configuration ilaunchconfiguration override is valid isvalid i launch configuration ilaunchconfiguration config set error message seterrormessage set message setmessage string f proj text fprojtext get text gettext trim length i workspace iworkspace workspace resources plugin resourcesplugin get workspace getworkspace i status istatus status workspace validate name validatename i resource iresource project status isok i project iproject project resources plugin resourcesplugin get workspace getworkspace get root getroot get project getproject project exists set error message seterrormessage nls bind launcher messages launchermessages java main tab javamaintab string project is open isopen set error message seterrormessage nls bind launcher messages launchermessages java main tab javamaintab string set error message seterrormessage nls bind launcher messages launchermessages java main tab javamaintab string status get message getmessage f main text fmaintext get text gettext trim length set error message seterrormessage launcher messages launchermessages java main tab javamaintab main type javadoc org eclipse debug i launch configuration tab ilaunchconfigurationtab perform apply performapply org eclipse debug core i launch configuration working copy ilaunchconfigurationworkingcopy override perform apply performapply i launch configuration working copy ilaunchconfigurationworkingcopy config config set attribute setattribute i java launch configuration constants ijavalaunchconfigurationconstants attr project f proj text fprojtext get text gettext trim config set attribute setattribute i java launch configuration constants ijavalaunchconfigurationconstants attr main type f main text fmaintext get text gettext trim map resources mapresources config attribute compatibility f stop in main check button fstopinmaincheckbutton get selection getselection config set attribute setattribute i java launch configuration constants ijavalaunchconfigurationconstants attr main config set attribute setattribute i java launch configuration constants ijavalaunchconfigurationconstants attr main string attribute compatibility f search external jars check button fsearchexternaljarscheckbutton get selection getselection config set attribute setattribute attr include external jars config set attribute setattribute attr include external jars string attribute compatibility f consider inherited main button fconsiderinheritedmainbutton get selection getselection config set attribute setattribute attr inherited main config set attribute setattribute attr inherited main string javadoc org eclipse debug i launch configuration tab ilaunchconfigurationtab set defaults setdefaults org eclipse debug core i launch configuration working copy ilaunchconfigurationworkingcopy override set defaults setdefaults i launch configuration working copy ilaunchconfigurationworkingcopy config i java element ijavaelement java element javaelement get context getcontext java element javaelement initialize java project initializejavaproject java element javaelement config config set attribute setattribute i java launch configuration constants ijavalaunchconfigurationconstants attr project empty string initialize main type and name initializemaintypeandname java element javaelement config updates external jars attribute launch config param config config load update external jars updateexternaljars i launch configuration ilaunchconfiguration config search search config get attribute getattribute attr include external jars core exception coreexception jdidebuguiplugin log f search external jars check button fsearchexternaljarscheckbutton set selection setselection search update inherited mains attribute launch config param config config load update inherited mains from config updateinheritedmainsfromconfig i launch configuration ilaunchconfiguration config inherit inherit config get attribute getattribute attr inherited main core exception coreexception jdidebuguiplugin log f consider inherited main button fconsiderinheritedmainbutton set selection setselection inherit updates main attribute launch config param config config load main attribute update stop in main from config updatestopinmainfromconfig i launch configuration ilaunchconfiguration config config get attribute getattribute i java launch configuration constants ijavalaunchconfigurationconstants attr main core exception coreexception jdidebuguiplugin log f stop in main check button fstopinmaincheckbutton set selection setselection