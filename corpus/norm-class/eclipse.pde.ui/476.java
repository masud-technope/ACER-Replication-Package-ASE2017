copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal editor cheatsheet simple details org eclipse jface field assist fieldassist control decoration controldecoration org eclipse jface field assist fieldassist field decoration registry fielddecorationregistry org eclipse jface text document event documentevent org eclipse jface text i document idocument org eclipse jface text i document listener idocumentlistener org eclipse jface viewers i selection iselection org eclipse pde internal core cheatsheet simple isimplecsitem org eclipse pde internal editor cheatsheet cs abstract details csabstractdetails org eclipse pde internal editor cheatsheet i cs master icsmaster org eclipse pde internal editor cheatsheet simple simplecsinputcontext org eclipse pde internal editor form entry adapter formentryadapter org eclipse pde internal editor form layout factory formlayoutfactory org eclipse pde internal parts form entry formentry org eclipse pde internal parts pde source viewer pdesourceviewer org eclipse swt swt org eclipse swt dnd clipboard org eclipse swt events selection adapter selectionadapter org eclipse swt events selection event selectionevent org eclipse swt graphics color org eclipse swt layout grid data griddata org eclipse swt widgets button org eclipse swt widgets composite org eclipse swt widgets label org eclipse forms i form colors iformcolors org eclipse forms i form part iformpart org eclipse forms i managed form imanagedform org eclipse forms widgets expandable composite expandablecomposite org eclipse forms widgets simplecsitemdetails simplecsitemdetails cs abstract details csabstractdetails isimplecsitem f item fitem form entry formentry f title ftitle button f skip fskip pde source viewer pdesourceviewer f content viewer fcontentviewer f main section fmainsection simplecshelpdetails f help section fhelpsection simplecscommanddetails f command section fcommandsection control decoration controldecoration f skip info decoration fskipinfodecoration f block events fblockevents param simplecsitemdetails i cs master icsmaster simplecsinputcontext context f item fitem f title ftitle f skip fskip f skip info decoration fskipinfodecoration f content viewer fcontentviewer f main section fmainsection f block events fblockevents f help section fhelpsection simplecshelpdetails f command section fcommandsection simplecscommanddetails javadoc org eclipse forms abstract form part abstractformpart initialize org eclipse forms i managed form imanagedform initialize i managed form imanagedform form initialize form explicitly called detail sections main parent registered initialize managed form f help section fhelpsection initialize form initialized managed form command f command section fcommandsection initialize form javadoc org eclipse pde internal editor cheatsheet simple simplecsabstractdetails create details createdetails org eclipse swt widgets composite create details createdetails composite parent color for eground foreground get toolkit gettoolkit get colors getcolors get color getcolor i form colors iformcolors title grid data griddata data create main f main section fmainsection get toolkit gettoolkit create section createsection parent description expandable composite expandablecomposite title bar f main section fmainsection client vertical spacing clientverticalspacing form layout factory formlayoutfactory header vertical spacing f main section fmainsection set text settext simple details messages simpledetailsmessages simplecsitemdetails main section text mainsectiontext f main section fmainsection set description setdescription simple details messages simpledetailsmessages simplecsitemdetails main section desc mainsectiondesc f main section fmainsection set layout setlayout form layout factory formlayoutfactory create clear grid layout createcleargridlayout data grid data griddata grid data griddata fill horizontal f main section fmainsection set layout data setlayoutdata data align master details headers misalignment caused toolbar icons get page getpage align section headers alignsectionheaders get master section getmastersection get section getsection f main section fmainsection create container main composite main section client mainsectionclient get toolkit gettoolkit create composite createcomposite f main section fmainsection main section client mainsectionclient set layout setlayout form layout factory formlayoutfactory create section client grid layout createsectionclientgridlayout attribute title f title ftitle form entry formentry main section client mainsectionclient get toolkit gettoolkit simple details messages simpledetailsmessages simplecsitemdetails attr title attrtitle swt description content element createuifieldcontent main section client mainsectionclient attribute skip f skip fskip get toolkit gettoolkit create button createbutton main section client mainsectionclient simple details messages simpledetailsmessages simplecsitemdetails attr skip attrskip swt check data grid data griddata grid data griddata fill horizontal data horizontal span horizontalspan f skip fskip set layout data setlayoutdata data f skip fskip set foreground setforeground for eground foreground create skip info decoration createskipinfodecoration bind widgets get toolkit gettoolkit paint b orders for paintbordersfor main section client mainsectionclient f main section fmainsection set client setclient main section client mainsectionclient mark details part markdetailspart f main section fmainsection f command section fcommandsection create details createdetails parent f help section fhelpsection create details createdetails parent javadoc org eclipse pde internal editor pde details pdedetails do global action doglobalaction java lang string do global action doglobalaction string action id actionid f content viewer fcontentviewer do global action doglobalaction action id actionid param parent createuifieldcontent composite parent grid data griddata data create label color for eground foreground get toolkit gettoolkit get colors getcolors get color getcolor i form colors iformcolors title label label get toolkit gettoolkit create label createlabel parent simple details messages simpledetailsmessages simplecsitemdetails label swt wrap label set foreground setforeground for eground foreground style grid data griddata vertical align grid data griddata horizontal align data grid data griddata style label set layout data setlayoutdata data create source viewer f content viewer fcontentviewer pde source viewer pdesourceviewer get page getpage f content viewer fcontentviewer createui parent needed align vertically form entry field space field decoration grid data griddata f content viewer fcontentviewer get viewer getviewer get text widget gettextwidget get layout data getlayoutdata horizontal indent horizontalindent form layout factory formlayoutfactory control horizontal indent create skip info decoration createskipinfodecoration skip info decoration bits swt top swt left f skip info decoration fskipinfodecoration control decoration controldecoration f skip fskip bits f skip info decoration fskipinfodecoration set margin width setmarginwidth f skip info decoration fskipinfodecoration set description text setdescriptiontext simple details messages simpledetailsmessages simplecsitemdetails disabled update skip info decoration updateskipinfodecoration f skip info decoration fskipinfodecoration set image setimage field decoration registry fielddecorationregistry get default getdefault get field decoration getfielddecoration field decoration registry fielddecorationregistry dec get image getimage javadoc org eclipse pde internal editor cheatsheet simple simplecsabstractdetails hook listeners hooklisteners hook listeners hooklisteners description content element create listeners content viewer createuilistenerscontentviewer attribute title f title ftitle set form entry listener setformentrylistener form entry adapter formentryadapter text value changed textvaluechanged form entry formentry entry ensure data object defined f item fitem f item fitem set title settitle f title ftitle get value getvalue attribute skip f skip fskip add selection listener addselectionlistener selection adapter selectionadapter widget selected widgetselected selection event selectionevent ensure data object defined f item fitem f item fitem set skip setskip f skip fskip get selection getselection get master section getmastersection update buttons updatebuttons f help section fhelpsection hook listeners hooklisteners f command section fcommandsection hook listeners hooklisteners create listeners content viewer createuilistenerscontentviewer f content viewer fcontentviewer createuilisteners create document listener f content viewer fcontentviewer get document getdocument add document listener adddocumentlistener i document listener idocumentlistener document about to be changed documentabouttobechanged document event documentevent event document changed documentchanged document event documentevent event check handle event f block events fblockevents ensure data object defined f item fitem text event i document idocument document event get document getdocument document text event string text document trim f item fitem get description getdescription f item fitem get description getdescription set content setcontent text javadoc org eclipse pde internal editor cheatsheet simple simplecsabstractdetails update fields updatefields update fields updatefields editable is editable element iseditableelement ensure data object defined f item fitem attribute title f title ftitle set value setvalue f item fitem get title gettitle f title ftitle set editable seteditable editable attribute skip f skip fskip set selection setselection f item fitem get skip getskip update skip enablement updateskipenablement todo simplecs revist parameters check simply string types todo simplecs reevaluate write methods writing empty string f help section fhelpsection update fields updatefields f command section fcommandsection update fields updatefields f item fitem get description getdescription description content element f block events fblockevents string content f item fitem get description getdescription get content getcontent f content viewer fcontentviewer get document getdocument content content f block events fblockevents f content viewer fcontentviewer get viewer getviewer set editable seteditable editable javadoc org eclipse forms abstract form part abstractformpart dispose dispose disposed source viewer f content viewer fcontentviewer f content viewer fcontentviewer unset menu unsetmenu f content viewer fcontentviewer dispose javadoc org eclipse pde internal editor pde details pdedetails can paste canpaste org eclipse swt dnd clipboard can paste canpaste clipboard clipboard f content viewer fcontentviewer can paste canpaste update skip enablement updateskipenablement ensure data object defined f item fitem editable is editable element iseditableelement control subitem skip f item fitem has sub items hassubitems editable update skip info decoration updateskipinfodecoration update skip info decoration updateskipinfodecoration f skip fskip set enabled setenabled editable param update skip info decoration updateskipinfodecoration f skip info decoration fskipinfodecoration f skip info decoration fskipinfodecoration hide f skip info decoration fskipinfodecoration set show hover setshowhover javadoc org eclipse forms abstract form part abstractformpart commit commit on save onsave commit on save onsave required form entries f title ftitle commit call details form entries javadoc org eclipse pde internal editor cheatsheet cs abstract details csabstractdetails selection changed selectionchanged org eclipse forms i form part iformpart org eclipse jface viewers i selection iselection selection changed selectionchanged i form part iformpart i selection iselection selection selected object object object get first selected object getfirstselectedobject selection ensure type object object isimplecsitem data set data setdata isimplecsitem object update data update fields updatefields param object set data setdata isimplecsitem object data f item fitem object data commands f command section fcommandsection set data setdata object data f help section fhelpsection set data setdata object