copyright rapicorp corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors rapicorp corporation initial api implementation org eclipse pde internal editor product java byte array input stream bytearrayinputstream java input stream inputstream org eclipse core resources org eclipse core runtime core exception coreexception org eclipse core runtime path org eclipse jface action i status line manager istatuslinemanager org eclipse jface dialogs message dialog messagedialog org eclipse jface window window org eclipse jface wizard wizard dialog wizarddialog org eclipse osgi util nls org eclipse osgi util text processor textprocessor org eclipse pde core i model changed event imodelchangedevent org eclipse pde core build i build entry ibuildentry org eclipse pde core plugin org eclipse pde internal core build workspace build model workspacebuildmodel org eclipse pde internal core iproduct org eclipse pde internal core project pde project pdeproject org eclipse pde internal core util pde text helper pdetexthelper org eclipse pde internal pde plugin pdeplugin org eclipse pde internal pde ui messages pdeuimessages org eclipse pde internal editor org eclipse pde internal wizards resizable wizard dialog resizablewizarddialog org eclipse pde internal wizards tools convert preferences wizard convertpreferenceswizard org eclipse swt dnd clipboard org eclipse swt widgets org eclipse forms events hyperlink event hyperlinkevent org eclipse forms events i hyperlink listener ihyperlinklistener org eclipse forms widgets preferences section preferencessection pde section pdesection nls string prefs customization file plugin customization ini nls string extension prefs customization preference customization preferencecustomization nls string extension product org eclipse core runtime products nls string element product product form text formtext config text configtext preferences section preferencessection pde form page pdeformpage composite parent parent description create client createclient get section getsection get editor geteditor get toolkit gettoolkit override create client createclient form toolkit formtoolkit toolkit set layout setlayout form layout factory formlayoutfactory create clear table wrap layout createcleartablewraplayout table wrap data tablewrapdata data table wrap data tablewrapdata table wrap data tablewrapdata fill grab set layout data setlayoutdata data set text settext pde ui messages pdeuimessages preferences section preferencessection title set description setdescription pde ui messages pdeuimessages preferences section preferencessection description composite client toolkit create composite createcomposite client set layout setlayout form layout factory formlayoutfactory create section client table wrap layout createsectionclienttablewraplayout client set layout data setlayoutdata table wrap data tablewrapdata table wrap data tablewrapdata fill grab config text configtext toolkit create form text createformtext client string config get wizard config text getwizardconfigtext config text configtext set text settext config data table wrap data tablewrapdata table wrap data tablewrapdata fill grab config text configtext set layout data setlayoutdata data config text configtext add hyperlink listener addhyperlinklistener i hyperlink listener ihyperlinklistener override link entered linkentered hyperlink event hyperlinkevent i status line manager istatuslinemanager mng get page getpage get editor geteditor get editor site geteditorsite get action bars getactionbars get status line manager getstatuslinemanager mng set message setmessage get label getlabel override link exited linkexited hyperlink event hyperlinkevent i status line manager istatuslinemanager mng get page getpage get editor geteditor get editor site geteditorsite get action bars getactionbars get status line manager getstatuslinemanager mng set message setmessage override link activated linkactivated hyperlink event hyperlinkevent string href string get href gethref nls href equals command generate handle generate handlegenerate nls href equals navigate overview get page getpage get editor geteditor set active page setactivepage overview page overviewpage toolkit paint b orders for paintbordersfor client set client setclient client register not ified notified model get model getmodel add model changed listener addmodelchangedlistener string get wizard config text getwizardconfigtext i preferences info ipreferencesinfo info get preferences info getpreferencesinfo string bindings string nls nls bindings info get source file path getsourcefilepath pde ui messages pdeuimessages preferences section preferencessection epf text processor textprocessor process info get source file path getsourcefilepath nls nls bindings info get preference customization path getpreferencecustomizationpath pde ui messages pdeuimessages preferences section preferencessection customize text processor textprocessor process info get preference customization path getpreferencecustomizationpath get overwrite getoverwrite nls bind pde ui messages pdeuimessages preferences section preferencessection generate overwrite bindings nls bind pde ui messages pdeuimessages preferences section preferencessection generate merge bindings handle generate handlegenerate string preference customization path preferencecustomizationpath string get product getproduct get defining plugin id getdefiningpluginid i plugin model base ipluginmodelbase model plugin registry pluginregistry find model findmodel model model get underlying resource getunderlyingresource nls message dialog messagedialog open error openerror get section getsection get shell getshell nls bind pde ui messages pdeuimessages preferences section preferencessection error no defining plugin title errornodefiningplugintitle pde ui messages pdeuimessages preferences section preferencessection error no defining plugin errornodefiningplugin plugin customization ini defined product model i project iproject project model get underlying resource getunderlyingresource get project getproject i preferences info ipreferencesinfo info get preferences info getpreferencesinfo info preference customization path preferencecustomizationpath info get preference customization path getpreferencecustomizationpath preference customization path preferencecustomizationpath preference customization path preferencecustomizationpath length product defined plugin extension point i plugin extension ipluginextension product extension productextension find product extension findproductextension model product extension productextension find product element i plugin element ipluginelement product element productelement find product element findproductelement product extension productextension product element productelement find preference customization property i plugin element ipluginelement property element propertyelement find pref cus t property element findprefcustpropertyelement product element productelement property element propertyelement i plugin attribute ipluginattribute value attribute valueattribute nls property element propertyelement get attribute getattribute nls preference customization path preferencecustomizationpath value attribute valueattribute get value getvalue preference customization path preferencecustomizationpath preference customization path preferencecustomizationpath length don file path defined extension point defining plugin i resource iresource resource project find member findmember prefs customization file existing resource resource i file ifile existing preference customization path preferencecustomizationpath i file ifile resource get full path getfullpath to string tostring create create plugin customization ini empty file project root i file ifile custom file customfile project get file getfile prefs customization file preference customization path preferencecustomizationpath custom file customfile get full path getfullpath to string tostring nls bytes nls get bytes getbytes input stream inputstream source byte array input stream bytearrayinputstream bytes custom file customfile create source i resource iresource resource path ensure time exists path referenced products extension sub sequently subsequently deleted i file ifile customization file customizationfile project get workspace getworkspace get root getroot get file getfile path preference customization path preferencecustomizationpath customization file customizationfile exists nls bytes nls get bytes getbytes input stream inputstream source byte array input stream bytearrayinputstream bytes customization file customizationfile create source i resource iresource ensure paths existing build properties i file ifile build props buildprops pde project pdeproject get build properties getbuildproperties project build props buildprops exists workspace build model workspacebuildmodel wkspc workspace build model workspacebuildmodel build props buildprops wkspc load wkspc is loaded isloaded i build entry ibuildentry entry nls wkspc get build getbuild get entry getentry nls bin includes entry entry nls wkspc get factory getfactory create entry createentry nls bin includes wkspc get build getbuild add entry entry preference customization path preferencecustomizationpath entry add token addtoken preference customization path preferencecustomizationpath wkspc save core exception coreexception pde plugin pdeplugin log exception logexception nls bind pde ui messages pdeuimessages preferences section preferencessection error reading errorreading preference customization path preferencecustomizationpath convert preferences wizard convertpreferenceswizard wizard convert preferences wizard convertpreferenceswizard preference customization path preferencecustomizationpath get preferences info getpreferencesinfo get source file path getsourcefilepath get overwrite getoverwrite wizard dialog wizarddialog resizable wizard dialog resizablewizarddialog pde plugin pdeplugin get active workbench shell getactiveworkbenchshell wizard create open window info get preferences info getpreferencesinfo preference customization path preferencecustomizationpath info get preference customization path getpreferencecustomizationpath info set preference customization path setpreferencecustomizationpath wizard get plugin customization file path getplugincustomizationfilepath info set source file path setsourcefilepath wizard get preferences file path getpreferencesfilepath info set overwrite setoverwrite to string tostring wizard get overwrite getoverwrite config text configtext set text settext get wizard config text getwizardconfigtext get section getsection get parent getparent layout get overwrite getoverwrite overwrite get preferences info getpreferencesinfo get overwrite getoverwrite overwrite parse boolean parseboolean get preferences info getpreferencesinfo get overwrite getoverwrite overwrite i plugin element ipluginelement find pref cus t property element findprefcustpropertyelement i plugin element ipluginelement product element productelement ensure produce element children product element productelement get child count getchildcount product element children i plugin object ipluginobject objects product element productelement get children getchildren process children objects length ensure element objects i plugin element ipluginelement property elements legitimate children product elements nls objects get name getname equals property i plugin element ipluginelement element i plugin element ipluginelement objects nls i plugin attribute ipluginattribute name attribute nameattribute element get attribute getattribute ensure preference customization property name attribute nameattribute pde text helper pdetexthelper is defined isdefined name attribute nameattribute get value getvalue name attribute nameattribute get value getvalue equals extension prefs customization element i plugin element ipluginelement find product element findproductelement i plugin extension ipluginextension extension product extension allowed child extension get child count getchildcount child i plugin object ipluginobject plugin object pluginobject extension get children getchildren ensure child element plugin object pluginobject i plugin element ipluginelement ensure child product element plugin object pluginobject get name getname equals element product i plugin element ipluginelement plugin object pluginobject i plugin extension ipluginextension find product extension findproductextension i plugin model base ipluginmodelbase model extensions i plugin extension ipluginextension extensions model get plugin base getpluginbase get extensions getextensions product extensions length extension point string point extensions get point getpoint ensure product extension point equals extension product ensure exact product fully qualified product string model get plugin base getpluginbase get id getid extensions get id getid equals get product getproduct get id getid extensions i preferences info ipreferencesinfo get preferences info getpreferencesinfo i preferences info ipreferencesinfo info get product getproduct get preferences info getpreferencesinfo info info get model getmodel get factory getfactory create preferences info createpreferencesinfo get product getproduct set preferences info setpreferencesinfo info info i product iproduct get product getproduct get model getmodel get product getproduct i product model iproductmodel get model getmodel i product model iproductmodel get page getpage getpdeeditor get aggregate model getaggregatemodel override can paste canpaste clipboard clipboard display get section getsection get display getdisplay control get focus control getfocuscontrol text override model changed modelchanged i model changed event imodelchangedevent call handling changed event get change type getchangetype i model changed event imodelchangedevent changed handle model event world changed handlemodeleventworldchanged param event handle model event world changed handlemodeleventworldchanged i model changed event imodelchangedevent event refresh override dispose i product model iproductmodel model get model getmodel model model remove model changed listener removemodelchangedlistener dispose