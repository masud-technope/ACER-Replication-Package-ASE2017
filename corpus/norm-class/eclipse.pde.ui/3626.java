copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal editor schema org eclipse jface action i menu manager imenumanager org eclipse jface resource j face resources jfaceresources org eclipse jface text org eclipse jface text source source viewer sourceviewer org eclipse jface viewers org eclipse pde core i model changed event imodelchangedevent org eclipse pde internal core ischema org eclipse pde internal core schema schema org eclipse pde internal core schema schema object schemaobject org eclipse pde internal pde plugin pdeplugin org eclipse pde internal pde ui messages pdeuimessages org eclipse pde internal editor org eclipse pde internal editor context xml document setup part icpant xmldocumentsetupparticpant org eclipse pde internal editor text i color manager icolormanager org eclipse pde internal editor text xml configuration xmlconfiguration org eclipse swt swt org eclipse swt custom org eclipse swt dnd clipboard org eclipse swt events org eclipse swt graphics color org eclipse swt layout grid data griddata org eclipse swt widgets composite org eclipse swt widgets control org eclipse actions action factory actionfactory org eclipse forms i form colors iformcolors org eclipse forms widgets form toolkit formtoolkit org eclipse forms widgets doc section docsection pde section pdesection i document idocument f document fdocument xml configuration xmlconfiguration f source configuration fsourceconfiguration source viewer sourceviewer f source viewer fsourceviewer c tab folder ctabfolder f tab folder ftabfolder i schema ischema f schema fschema object f element felement f ignore change fignorechange doc section docsection pde form page pdeformpage composite parent i color manager icolormanager color manager colormanager parent description get section getsection set text settext pde ui messages pdeuimessages doc section docsection text get section getsection set description setdescription pde ui messages pdeuimessages schema editor schemaeditor doc section docsection desc f source configuration fsourceconfiguration xml configuration xmlconfiguration color manager colormanager f document fdocument document xml document setup part icpant xmldocumentsetupparticpant setup f document fdocument f schema fschema i schema ischema get page getpage get model getmodel create client createclient get section getsection get managed form getmanagedform get toolkit gettoolkit override commit on save onsave handle apply handleapply commit on save onsave override create client createclient form toolkit formtoolkit toolkit composite container toolkit create composite createcomposite container set layout setlayout form layout factory formlayoutfactory create section client grid layout createsectionclientgridlayout grid data griddata data grid data griddata grid data griddata fill data horizontal span horizontalspan set layout data setlayoutdata data f tab folder ftabfolder c tab folder ctabfolder container swt flat swt top toolkit adapt f tab folder ftabfolder grid data griddata grid data griddata grid data griddata horizontal align fill height hint heighthint f tab folder ftabfolder set layout data setlayoutdata toolkit get colors getcolors initialize section tool bar colors initializesectiontoolbarcolors color selected color selectedcolor toolkit get colors getcolors get color getcolor i form colors iformcolors f tab folder ftabfolder set selection background setselectionbackground color selected color selectedcolor toolkit get colors getcolors get background getbackground f tab folder ftabfolder add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent update tab selection updatetabselection styles swt multi swt wrap swt scroll swt scroll f source viewer fsourceviewer source viewer sourceviewer container styles f source viewer fsourceviewer configure f source configuration fsourceconfiguration f source viewer fsourceviewer set document setdocument f document fdocument f source viewer fsourceviewer add selection changed listener addselectionchangedlistener i selection changed listener iselectionchangedlistener override selection changed selectionchanged selection changed event selectionchangedevent event update selection updateselection event get selection getselection styled text styledtext styled text styledtext f source viewer fsourceviewer get text widget gettextwidget styled text styledtext set font setfont j face resources jfaceresources get text font gettextfont styled text styledtext set menu setmenu get page getpage getpdeeditor get context menu getcontextmenu styled text styledtext set data setdata form toolkit formtoolkit key draw border form toolkit formtoolkit text border styled text styledtext add focus listener addfocuslistener focus adapter focusadapter override focus gained focusgained focus event focusevent get page getpage getpdeeditor get contributor getcontributor update select able actions updateselectableactions nls swt get platform getplatform equals motif toolkit paint b orders for paintbordersfor container control children container get children getchildren control control children children length grid data griddata grid data griddata fill width hint widthhint height hint heighthint control set layout data setlayoutdata create tabs createtabs set client setclient container initialize f tab folder ftabfolder get item count getitemcount f tab folder ftabfolder set selection setselection update tab selection updatetabselection override do global action doglobalaction string action id actionid action id actionid equals action factory actionfactory cut get id getid f source viewer fsourceviewer do operation dooperation i text operation target itextoperationtarget cut action id actionid equals action factory actionfactory copy get id getid f source viewer fsourceviewer do operation dooperation i text operation target itextoperationtarget copy action id actionid equals action factory actionfactory paste get id getid f source viewer fsourceviewer do operation dooperation i text operation target itextoperationtarget paste action id actionid equals action factory actionfactory select get id getid f source viewer fsourceviewer do operation dooperation i text operation target itextoperationtarget select action id actionid equals action factory actionfactory delete get id getid f source viewer fsourceviewer do operation dooperation i text operation target itextoperationtarget delete action id actionid equals action factory actionfactory undo get id getid f source viewer fsourceviewer do operation dooperation i text operation target itextoperationtarget undo action id actionid equals action factory actionfactory redo get id getid f source viewer fsourceviewer do operation dooperation i text operation target itextoperationtarget redo fill context menu fillcontextmenu i menu manager imenumanager manager get page getpage getpdeeditor get contributor getcontributor context menu about to show contextmenuabouttoshow manager override set form input setforminput object input input i schema ischema input i document section idocumentsection i document section idocumentsection sections f schema fschema get document sections getdocumentsections sections length i document section idocumentsection sections equals input f tab folder ftabfolder set selection setselection update editor input updateeditorinput input string get topic name gettopicname object object object i schema ischema pde ui messages pdeuimessages schema editor schemaeditor topic overview object i document section idocumentsection i document section idocumentsection i document section idocumentsection object string section id sectionid get section id getsectionid section id sectionid equals i document section idocumentsection examples pde ui messages pdeuimessages schema editor schemaeditor topic examples section id sectionid equals i document section idocumentsection pde ui messages pdeuimessages schema editor schemaeditor topic section id sectionid equals i document section idocumentsection implementation pde ui messages pdeuimessages schema editor schemaeditor topic implementation section id sectionid equals ignore case equalsignorecase i document section idocumentsection api info pde ui messages pdeuimessages schema editor schemaeditor topic api section id sectionid equals i document section idocumentsection copyright pde ui messages pdeuimessages schema editor schemaeditor topic copyright nls handle apply handleapply f element felement f element felement i schema ischema schema f element felement set description setdescription f document fdocument schema object schemaobject f element felement set description setdescription f document fdocument update tab image updatetabimage f tab folder ftabfolder get selection getselection initialize f source viewer fsourceviewer set editable seteditable f schema fschema is editable iseditable f document fdocument add document listener adddocumentlistener i document listener idocumentlistener override document changed documentchanged document event documentevent f ignore change fignorechange f schema fschema is editable iseditable mark dirty markdirty override document about to be changed documentabouttobechanged document event documentevent update editor input updateeditorinput f schema fschema f schema fschema add model changed listener addmodelchangedlistener override dispose dispose source configuration f source configuration fsourceconfiguration f source configuration fsourceconfiguration dispose f schema fschema remove model changed listener removemodelchangedlistener dispose create tabs createtabs i document section idocumentsection sections f schema fschema get document sections getdocumentsections add tab addtab f schema fschema sections length i document section idocumentsection sections add tab addtab add tab addtab i schema object ischemaobject string label get topic name gettopicname c tab item ctabitem item c tab item ctabitem f tab folder ftabfolder swt item set text settext label item set data setdata update tab image updatetabimage item update tab image updatetabimage c tab item ctabitem item item i schema object ischemaobject i schema object ischemaobject item get data getdata item set image setimage pde plugin pdeplugin get default getdefault get label provider getlabelprovider get image getimage update tab selection updatetabselection f tab folder ftabfolder get selection index getselectionindex f schema fschema is editable iseditable is dirty isdirty handle apply handleapply update editor input updateeditorinput f schema fschema i document section idocumentsection sections f schema fschema get document sections getdocumentsections update editor input updateeditorinput sections override set focus setfocus f source viewer fsourceviewer get text widget gettextwidget set focus setfocus update selection updateselection f source viewer fsourceviewer get selection getselection update selection updateselection i selection iselection selection get page getpage getpdeeditor set selection setselection selection update editor input updateeditorinput object input f ignore change fignorechange nls string text input i schema object ischemaobject text i schema object ischemaobject input get description getdescription nls f document fdocument text text f element felement input f ignore change fignorechange override model changed modelchanged i model changed event imodelchangedevent get change type getchangetype i model changed event imodelchangedevent changed mark stale markstale override refresh i document section idocumentsection sections f schema fschema get document sections getdocumentsections f tab folder ftabfolder get selection index getselectionindex update editor input updateeditorinput f schema fschema update editor input updateeditorinput sections refresh override can paste canpaste clipboard clipboard f source viewer fsourceviewer can do operation candooperation i text operation target itextoperationtarget paste