copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal editor feature java util locale org eclipse core runtime core exception coreexception org eclipse core runtime platform org eclipse jface window window org eclipse pde core i model changed event imodelchangedevent org eclipse pde internal core ifeature org eclipse pde internal pde plugin pdeplugin org eclipse pde internal pde ui messages pdeuimessages org eclipse pde internal editor org eclipse pde internal parts form entry formentry org eclipse swt swt org eclipse swt custom busy indicator busyindicator org eclipse swt dnd org eclipse swt layout grid data griddata org eclipse swt widgets composite org eclipse forms i managed form imanagedform org eclipse forms widgets portability section portabilitysection pde section pdesection choice get arch choices getarchchoices get known choices getknownchoices platform knownosarchvalues choice get known choices getknownchoices string values choice choices choice values length choices length choices choice values values choices choice getnlchoices locale locales locale get available locales getavailablelocales choice choices choice locales length locales length locale locale locales nls choices choice locale to string tostring locale to string tostring locale get display name getdisplayname choices choice getoschoices get known choices getknownchoices platform knownosvalues choice getwschoices get known choices getknownchoices platform knownwsvalues form entry formentry f arch text farchtext form entry formentry f nl text fnltext form entry formentry f os text fostext form entry formentry f ws text fwstext portability section portabilitysection feature form page featureformpage composite parent parent pde ui messages pdeuimessages feature editor featureeditor portability section portabilitysection title pde ui messages pdeuimessages feature editor featureeditor portability section portabilitysection desc swt portability section portabilitysection pde form page pdeformpage composite parent string title string desc toggle style togglestyle parent description toggle style togglestyle get section getsection set text settext title get section getsection set description setdescription desc create client createclient get section getsection get managed form getmanagedform get toolkit gettoolkit apply value applyvalue string property string core exception coreexception i feature model ifeaturemodel model i feature model ifeaturemodel get page getpage get model getmodel i feature ifeature feature model get feature getfeature property equals i environment ienvironment feature setnl property equals i environment ienvironment feature setos property equals i environment ienvironment feature setws property equals i environment ienvironment arch feature set arch setarch override cancel edit canceledit f os text fostext cancel edit canceledit f ws text fwstext cancel edit canceledit f nl text fnltext cancel edit canceledit f arch text farchtext cancel edit canceledit cancel edit canceledit override can paste canpaste clipboard clipboard transfer data transferdata types clipboard get available types getavailabletypes transfer transfers transfer text transfer texttransfer get instance getinstance rtf transfer rtftransfer get instance getinstance types length transfers length transfers is supported type issupportedtype types override commit on save onsave f os text fostext commit f ws text fwstext commit f nl text fnltext commit f arch text farchtext commit commit on save onsave override create client createclient form toolkit formtoolkit toolkit set layout setlayout form layout factory formlayoutfactory create clear table wrap layout createcleartablewraplayout table wrap data tablewrapdata twd table wrap data tablewrapdata twd grab horizontal grabhorizontal set layout data setlayoutdata twd composite container toolkit create composite createcomposite container set layout setlayout form layout factory formlayoutfactory create section client grid layout createsectionclientgridlayout container set layout data setlayoutdata grid data griddata grid data griddata fill horizontal string edit label editlabel pde ui messages pdeuimessages feature editor featureeditor portability section portabilitysection edit f os text fostext form entry formentry container toolkit pde ui messages pdeuimessages feature editor featureeditor portability section portabilitysection edit label editlabel f os text fostext set form entry listener setformentrylistener form entry adapter formentryadapter override browse button selected browsebuttonselected form entry formentry entry busy indicator busyindicator show while showwhile f os text fostext get text gettext get display getdisplay runnable override choice choices getoschoices open portability choice dialog openportabilitychoicedialog i environment ienvironment f os text fostext choices override text value changed textvaluechanged form entry formentry text apply value applyvalue i environment ienvironment text get value getvalue core exception coreexception pde plugin pdeplugin log exception logexception limit text width limittextwidth f os text fostext f os text fostext set editable seteditable is editable iseditable f ws text fwstext form entry formentry container toolkit pde ui messages pdeuimessages feature editor featureeditor portability section portabilitysection edit label editlabel f ws text fwstext set form entry listener setformentrylistener form entry adapter formentryadapter override browse button selected browsebuttonselected form entry formentry entry busy indicator busyindicator show while showwhile f ws text fwstext get text gettext get display getdisplay runnable override choice choices getwschoices open portability choice dialog openportabilitychoicedialog i environment ienvironment f ws text fwstext choices override text value changed textvaluechanged form entry formentry text apply value applyvalue i environment ienvironment text get value getvalue core exception coreexception pde plugin pdeplugin log exception logexception limit text width limittextwidth f ws text fwstext f ws text fwstext set editable seteditable is editable iseditable f nl text fnltext form entry formentry container toolkit pde ui messages pdeuimessages feature editor featureeditor portability section portabilitysection edit label editlabel f nl text fnltext set form entry listener setformentrylistener form entry adapter formentryadapter override browse button selected browsebuttonselected form entry formentry entry busy indicator busyindicator show while showwhile f nl text fnltext get text gettext get display getdisplay runnable override choice choices getnlchoices open portability choice dialog openportabilitychoicedialog i environment ienvironment f nl text fnltext choices override text value changed textvaluechanged form entry formentry text apply value applyvalue i environment ienvironment text get value getvalue core exception coreexception pde plugin pdeplugin log exception logexception limit text width limittextwidth f nl text fnltext f nl text fnltext set editable seteditable is editable iseditable f arch text farchtext form entry formentry container toolkit pde ui messages pdeuimessages feature editor featureeditor portability section portabilitysection arch edit label editlabel f arch text farchtext set form entry listener setformentrylistener form entry adapter formentryadapter override browse button selected browsebuttonselected form entry formentry entry busy indicator busyindicator show while showwhile f arch text farchtext get text gettext get display getdisplay runnable override choice choices get arch choices getarchchoices open portability choice dialog openportabilitychoicedialog i environment ienvironment arch f arch text farchtext choices override text value changed textvaluechanged form entry formentry text apply value applyvalue i environment ienvironment arch text get value getvalue core exception coreexception pde plugin pdeplugin log exception logexception limit text width limittextwidth f arch text farchtext f arch text farchtext set editable seteditable is editable iseditable toolkit paint b orders for paintbordersfor container set client setclient container override dispose i feature model ifeaturemodel model i feature model ifeaturemodel get page getpage get model getmodel model model remove model changed listener removemodelchangedlistener dispose override initialize i managed form imanagedform form i feature model ifeaturemodel model i feature model ifeaturemodel get page getpage get model getmodel model model add model changed listener addmodelchangedlistener initialize form limit text width limittextwidth form entry formentry entry grid data griddata grid data griddata entry get text gettext get layout data getlayoutdata width hint widthhint override model changed modelchanged i model changed event imodelchangedevent mark stale markstale open portability choice dialog openportabilitychoicedialog string property form entry formentry text choice choices string text get value getvalue portability choices dialog portabilitychoicesdialog dialog portability choices dialog portabilitychoicesdialog pde plugin pdeplugin get active workbench shell getactiveworkbenchshell choices dialog create dialog get shell getshell set text settext pde ui messages pdeuimessages feature editor featureeditor portability choices dialog portabilitychoicesdialog title result dialog open result window dialog get value getvalue text set value setvalue apply value applyvalue property core exception coreexception pde plugin pdeplugin log exception logexception override refresh set value setvalue i environment ienvironment set value setvalue i environment ienvironment set value setvalue i environment ienvironment arch set value setvalue i environment ienvironment refresh override set focus setfocus f os text fostext f os text fostext get text gettext set focus setfocus set value setvalue string property i feature model ifeaturemodel model i feature model ifeaturemodel get page getpage get model getmodel i feature ifeature feature model get feature getfeature property equals i environment ienvironment f nl text fnltext set value setvalue feature getnl property equals i environment ienvironment f os text fostext set value setvalue feature getos property equals i environment ienvironment f ws text fwstext set value setvalue feature getws property equals i environment ienvironment arch f arch text farchtext set value setvalue feature get arch getarch