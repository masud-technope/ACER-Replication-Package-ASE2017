copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal editor feature org eclipse core runtime core exception coreexception org eclipse jface viewers i selection iselection org eclipse jface viewers i structured selection istructuredselection org eclipse pde core i model changed event imodelchangedevent org eclipse pde internal core ifeature i feature child ifeaturechild org eclipse pde internal core ifeature i feature model ifeaturemodel org eclipse pde internal pde plugin pdeplugin org eclipse pde internal pde ui messages pdeuimessages org eclipse pde internal editor org eclipse pde internal parts form entry formentry org eclipse swt swt org eclipse swt events selection adapter selectionadapter org eclipse swt events selection event selectionevent org eclipse swt layout grid data griddata org eclipse swt widgets org eclipse forms org eclipse forms widgets included features details section includedfeaturesdetailssection pde section pdesection i part selection listener ipartselectionlistener i feature child ifeaturechild f input finput form entry formentry f name text fnametext form entry formentry f version text fversiontext button f optional button foptionalbutton button f search root button fsearchrootbutton button f search self button fsearchselfbutton button f search both button fsearchbothbutton f block notification fblocknotification included features details section includedfeaturesdetailssection pde form page pdeformpage composite parent parent pde ui messages pdeuimessages site editor siteeditor included features details section includedfeaturesdetailssection title pde ui messages pdeuimessages site editor siteeditor included features details section includedfeaturesdetailssection desc swt included features details section includedfeaturesdetailssection pde form page pdeformpage composite parent string title string desc toggle style togglestyle parent description toggle style togglestyle get section getsection set text settext title get section getsection set description setdescription desc create client createclient get section getsection get managed form getmanagedform get toolkit gettoolkit override cancel edit canceledit f name text fnametext cancel edit canceledit f version text fversiontext cancel edit canceledit cancel edit canceledit override commit on save onsave f name text fnametext commit f version text fversiontext commit commit on save onsave override create client createclient form toolkit formtoolkit toolkit set layout setlayout form layout factory formlayoutfactory create clear grid layout createcleargridlayout grid data griddata data grid data griddata grid data griddata fill horizontal grid data griddata vertical align set layout data setlayoutdata data composite container toolkit create composite createcomposite container set layout setlayout form layout factory formlayoutfactory create section client table wrap layout createsectionclienttablewraplayout f name text fnametext form entry formentry container toolkit pde ui messages pdeuimessages site editor siteeditor included features details section includedfeaturesdetailssection feature label featurelabel f name text fnametext set form entry listener setformentrylistener form entry adapter formentryadapter override text value changed textvaluechanged form entry formentry text f input finput f input finput set name setname text get value getvalue core exception coreexception pde plugin pdeplugin log exception logexception f name text fnametext set editable seteditable is editable iseditable f version text fversiontext form entry formentry container toolkit pde ui messages pdeuimessages feature editor featureeditor spec section specsection version f version text fversiontext set form entry listener setformentrylistener form entry adapter formentryadapter override text value changed textvaluechanged form entry formentry text f input finput f input finput set version setversion text get value getvalue core exception coreexception pde plugin pdeplugin log exception logexception f version text fversiontext set editable seteditable is editable iseditable f optional button foptionalbutton toolkit create button createbutton container pde ui messages pdeuimessages site editor siteeditor included features details section includedfeaturesdetailssection optional swt check table wrap data tablewrapdata table wrap data tablewrapdata table wrap data tablewrapdata fill colspan f optional button foptionalbutton set layout data setlayoutdata f optional button foptionalbutton add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent f block notification fblocknotification f input finput set optional setoptional f optional button foptionalbutton get selection getselection core exception coreexception label f search location desc label fsearchlocationdesclabel toolkit create label createlabel container pde ui messages pdeuimessages site editor siteeditor included features details section includedfeaturesdetailssection search location searchlocation swt wrap table wrap data tablewrapdata table wrap data tablewrapdata fill colspan f search location desc label fsearchlocationdesclabel set layout data setlayoutdata f search root button fsearchrootbutton toolkit create button createbutton container pde ui messages pdeuimessages site editor siteeditor included features details section includedfeaturesdetailssection root swt radio f search root button fsearchrootbutton set selection setselection table wrap data tablewrapdata table wrap data tablewrapdata fill colspan indent f search root button fsearchrootbutton set layout data setlayoutdata f search root button fsearchrootbutton add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent f block notification fblocknotification f search root button fsearchrootbutton get selection getselection f input finput set search location setsearchlocation i feature child ifeaturechild root core exception coreexception f search self button fsearchselfbutton toolkit create button createbutton container pde ui messages pdeuimessages site editor siteeditor included features details section includedfeaturesdetailssection swt radio f search self button fsearchselfbutton set selection setselection table wrap data tablewrapdata table wrap data tablewrapdata fill colspan indent f search self button fsearchselfbutton set layout data setlayoutdata f search self button fsearchselfbutton add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent f block notification fblocknotification f search self button fsearchselfbutton get selection getselection f input finput set search location setsearchlocation i feature child ifeaturechild core exception coreexception f search both button fsearchbothbutton toolkit create button createbutton container pde ui messages pdeuimessages site editor siteeditor included features details section includedfeaturesdetailssection swt radio f search both button fsearchbothbutton set selection setselection table wrap data tablewrapdata table wrap data tablewrapdata fill colspan indent f search both button fsearchbothbutton set layout data setlayoutdata f search both button fsearchbothbutton add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent f block notification fblocknotification f search both button fsearchbothbutton get selection getselection f input finput set search location setsearchlocation i feature child ifeaturechild core exception coreexception toolkit paint b orders for paintbordersfor container set client setclient container override dispose i feature model ifeaturemodel model i feature model ifeaturemodel get page getpage get model getmodel model model remove model changed listener removemodelchangedlistener dispose override initialize i managed form imanagedform form i feature model ifeaturemodel model i feature model ifeaturemodel get page getpage get model getmodel model model add model changed listener addmodelchangedlistener initialize form override model changed modelchanged i model changed event imodelchangedevent mark stale markstale override refresh update refresh override selection changed selectionchanged i form part iformpart i selection iselection selection selection i structured selection istructuredselection selection is empty isempty object i structured selection istructuredselection selection get first element getfirstelement i feature child ifeaturechild f input finput i feature child ifeaturechild f input finput f input finput update override set focus setfocus f name text fnametext f name text fnametext get text gettext set focus setfocus update f block notification fblocknotification f input finput f name text fnametext set value setvalue f input finput get name getname f version text fversiontext set value setvalue f input finput get version getversion f optional button foptionalbutton set selection setselection f input finput is optional isoptional search location searchlocation f input finput get search location getsearchlocation f search root button fsearchrootbutton set selection setselection search location searchlocation i feature child ifeaturechild root f search self button fsearchselfbutton set selection setselection search location searchlocation i feature child ifeaturechild f search both button fsearchbothbutton set selection setselection search location searchlocation i feature child ifeaturechild f name text fnametext set value setvalue f version text fversiontext set value setvalue f optional button foptionalbutton set selection setselection f search root button fsearchrootbutton set selection setselection f search self button fsearchselfbutton set selection setselection f search both button fsearchbothbutton set selection setselection editable f input finput is editable iseditable f name text fnametext set editable seteditable editable f version text fversiontext set editable seteditable editable f optional button foptionalbutton set enabled setenabled editable f search root button fsearchrootbutton set enabled setenabled editable f search self button fsearchselfbutton set enabled setenabled editable f search both button fsearchbothbutton set enabled setenabled editable f block notification fblocknotification override is editable iseditable get page getpage getpdeeditor get aggregate model getaggregatemodel is editable iseditable