copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal wizards extension java org eclipse core resources org eclipse core runtime org eclipse jface dialogs dialog org eclipse jface operation i runnable with progress irunnablewithprogress org eclipse jface viewers viewer org eclipse jface viewers viewer filter viewerfilter org eclipse jface window window org eclipse jface wizard wizard page wizardpage org eclipse osgi util nls org eclipse pde core plugin i plugin model base ipluginmodelbase org eclipse pde core plugin plugin registry pluginregistry org eclipse pde internal core abstract model abstractmodel org eclipse pde internal core pde core pdecore org eclipse pde internal core ischema i document section idocumentsection org eclipse pde internal core ischema i schema attribute ischemaattribute org eclipse pde internal core schema org eclipse pde internal core util core utility coreutility org eclipse pde internal core util id util idutil org eclipse pde internal org eclipse pde internal dialogs plugin selection dialog pluginselectiondialog org eclipse pde internal util swt util swtutil org eclipse swt swt org eclipse swt events org eclipse swt layout grid data griddata org eclipse swt layout grid layout gridlayout org eclipse swt widgets org eclipse org eclipse actions workspace modify operation workspacemodifyoperation org eclipse dialogs element tree selection dialog elementtreeselectiondialog org eclipse ide ide org eclipse model workbench content provider workbenchcontentprovider org eclipse model workbench label provider workbenchlabelprovider org eclipse file editor input fileeditorinput org eclipse views navigator resource comparator resourcecomparator base extension point main page baseextensionpointmainpage wizard page wizardpage nls string settings plugin base extension point baseextensionpoint settings plugin id pluginid nls string schema dir schema i container icontainer f container fcontainer text f id text fidtext text f plugin id text fpluginidtext text f name text fnametext text f schema text fschematext text f schema location text fschemalocationtext button f open schema button fopenschemabutton button f shared schema button fsharedschemabutton button f plugin browse button fpluginbrowsebutton button f find location button ffindlocationbutton base extension point main page baseextensionpointmainpage i container icontainer container nls new extension point newextensionpoint f container fcontainer container override create control createcontrol composite parent composite container composite parent swt grid layout gridlayout layout grid layout gridlayout layout num columns numcolumns layout vertical spacing verticalspacing layout make columns equal width makecolumnsequalwidth container set layout setlayout layout label label grid data griddata is plugin id needed ispluginidneeded label label container swt label set text settext pde ui messages pdeuimessages base extension point baseextensionpoint plugin id pluginid f plugin id text fpluginidtext text container swt single swt border grid data griddata grid data griddata fill horizontal horizontal span horizontalspan width hint widthhint f plugin id text fpluginidtext set layout data setlayoutdata f plugin id text fpluginidtext add modify listener addmodifylistener modify listener modifylistener override modify text modifytext modify event modifyevent validate page validatepage f plugin browse button fpluginbrowsebutton button container swt push grid data griddata grid data griddata horizontal align horizontal span horizontalspan width hint widthhint f plugin browse button fpluginbrowsebutton set layout data setlayoutdata f plugin browse button fpluginbrowsebutton set text settext pde ui messages pdeuimessages base extension point main page baseextensionpointmainpage plugin browse pluginbrowse f plugin browse button fpluginbrowsebutton set tool tip text settooltiptext pde ui messages pdeuimessages base extension point main page baseextensionpointmainpage plugin id pluginid tooltip f plugin browse button fpluginbrowsebutton add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent handle plugin browse handlepluginbrowse swt util swtutil set button dimension hint setbuttondimensionhint f plugin browse button fpluginbrowsebutton label label container swt label set text settext pde ui messages pdeuimessages base extension point baseextensionpoint f id text fidtext text container swt single swt border grid data griddata grid data griddata fill horizontal horizontal span horizontalspan f id text fidtext set layout data setlayoutdata f id text fidtext add modify listener addmodifylistener modify listener modifylistener override modify text modifytext modify event modifyevent setting text trigger validation impl icitly implicitly validate nls nls nls f schema text fschematext set text settext get schema location getschemalocation get schema location getschemalocation length f id text fidtext get text gettext exsd label label container swt label set text settext pde ui messages pdeuimessages base extension point baseextensionpoint f name text fnametext text container swt single swt border grid data griddata grid data griddata fill horizontal horizontal span horizontalspan f name text fnametext set layout data setlayoutdata f name text fnametext add modify listener addmodifylistener modify listener modifylistener override modify text modifytext modify event modifyevent validate page validatepage is plugin id needed ispluginidneeded is plugin id final ispluginidfinal label label container swt label set text settext pde ui messages pdeuimessages base extension point baseextensionpoint schema location schemalocation f schema location text fschemalocationtext text container swt single swt border grid data griddata grid data griddata fill horizontal width hint widthhint grab excess horizontal space grabexcesshorizontalspace f schema location text fschemalocationtext set layout data setlayoutdata f schema location text fschemalocationtext add modify listener addmodifylistener modify listener modifylistener override modify text modifytext modify event modifyevent validate page validatepage f find location button ffindlocationbutton button container swt push grid data griddata grid data griddata horizontal align width hint widthhint f find location button ffindlocationbutton set layout data setlayoutdata f find location button ffindlocationbutton set text settext pde ui messages pdeuimessages base extension point main page baseextensionpointmainpage find browse findbrowse f find location button ffindlocationbutton set tool tip text settooltiptext pde ui messages pdeuimessages base extension point main page baseextensionpointmainpage schema location schemalocation tooltip f find location button ffindlocationbutton add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent handle schema location handleschemalocation swt util swtutil set button dimension hint setbuttondimensionhint f find location button ffindlocationbutton label label container swt label set text settext pde ui messages pdeuimessages base extension point baseextensionpoint schema f schema text fschematext text container swt single swt border grid data griddata grid data griddata fill horizontal horizontal span horizontalspan f schema text fschematext set layout data setlayoutdata f schema text fschematext add modify listener addmodifylistener modify listener modifylistener override modify text modifytext modify event modifyevent validate page validatepage is shared schema switch needed issharedschemaswitchneeded f shared schema button fsharedschemabutton button container swt check f shared schema button fsharedschemabutton set text settext pde ui messages pdeuimessages base extension point baseextensionpoint shared grid data griddata grid data griddata fill horizontal horizontal span horizontalspan f shared schema button fsharedschemabutton set layout data setlayoutdata f open schema button fopenschemabutton button container swt check f open schema button fopenschemabutton set text settext pde ui messages pdeuimessages base extension point baseextensionpoint edit f open schema button fopenschemabutton set selection setselection grid data griddata grid data griddata fill horizontal horizontal span horizontalspan f open schema button fopenschemabutton set layout data setlayoutdata is plugin id needed ispluginidneeded f plugin id text fpluginidtext set focus setfocus f id text fidtext set focus setfocus set control setcontrol container initialize values initializevalues validate page validatepage start error message convert regular message string error get error message geterrormessage error set message setmessage error set error message seterrormessage dialog apply dialog font applydialogfont container platformui get workbench getworkbench get help system gethelpsystem set help sethelp container i help context ids ihelpcontextids schema input stream inputstream create schema stream createschemastream string plugin id pluginid string point id pointid string shared i file ifile schema file schemafile length point id pointid editable schema editableschema schema editable schema editableschema plugin id pluginid point id pointid schema set description setdescription pde ui messages pdeuimessages base extension point baseextensionpoint sections overview document section documentsection document section documentsection schema i document section idocumentsection pde ui messages pdeuimessages base extension point main page baseextensionpointmainpage set description setdescription pde ui messages pdeuimessages base extension point baseextensionpoint sections schema add document section adddocumentsection schema element schemaelement element shared nls element schema root element schemarootelement schema extension schema complex type schemacomplextype complex type complextype schema complex type schemacomplextype schema element set type settype complex type complextype nls schema attribute schemaattribute attribute schema attribute schemaattribute element point nls attribute set type settype schema simple type schemasimpletype schema string attribute set use setuse i schema attribute ischemaattribute required complex type complextype add attribute addattribute attribute nls attribute schema attribute schemaattribute element nls attribute set type settype schema simple type schemasimpletype schema string complex type complextype add attribute addattribute attribute nls attribute schema attribute schemaattribute element nls attribute set type settype schema simple type schemasimpletype schema string attribute set translatable property settranslatableproperty complex type complextype add attribute addattribute attribute schema add element addelement element nls document section documentsection schema i document section idocumentsection examples examples set description setdescription pde ui messages pdeuimessages base extension point baseextensionpoint sections usage schema add document section adddocumentsection nls document section documentsection schema i document section idocumentsection api info api set description setdescription pde ui messages pdeuimessages base extension point baseextensionpoint sections api schema add document section adddocumentsection nls document section documentsection schema i document section idocumentsection implementation supplied implementation set description setdescription pde ui messages pdeuimessages base extension point baseextensionpoint sections supplied schema add document section adddocumentsection nls document section documentsection schema i document section idocumentsection copyright copyright set description setdescription pde ui messages pdeuimessages base extension point baseextensionpoint sections copyright schema add document section adddocumentsection string writer stringwriter swriter string writer stringwriter print writer printwriter writer print writer printwriter swriter schema save writer swriter close i o exception ioexception pde plugin pdeplugin log exception logexception string content swriter to string tostring content abstract model abstractmodel fix line delimiter fixlinedelimiter content schema file schemafile nls byte array input stream bytearrayinputstream content get bytes getbytes utf unsupported encoding exception unsupportedencodingexception byte array input stream bytearrayinputstream i file ifile generate schema file generateschemafile string plugin id pluginid string string shared string schema i progress monitor iprogressmonitor monitor core exception coreexception i file ifile schema file schemafile i workspace iworkspace workspace f container fcontainer get workspace getworkspace i path ipath schema path schemapath path schema remove last segments removelastsegments i path ipath new schema path newschemapath f container fcontainer get project relative path getprojectrelativepath append schema path schemapath monitor sub task subtask pde ui messages pdeuimessages base extension point baseextensionpoint generating new schema path newschemapath is empty isempty i folder ifolder folder f container fcontainer get project getproject get folder getfolder new schema path newschemapath core utility coreutility create folder createfolder folder i path ipath file path filepath f container fcontainer get full path getfullpath append schema schema file schemafile workspace get root getroot get file getfile file path filepath input stream inputstream source create schema stream createschemastream plugin id pluginid shared schema file schemafile schema file schemafile exists create time schema file schemafile create source monitor schema file schemafile set contents setcontents source monitor ide set default editor setdefaulteditor schema file schemafile i pde ui constants ipdeuiconstants schema editor schema file schemafile i runnable with progress irunnablewithprogress get operation getoperation open file openfile f open schema button fopenschemabutton get selection getselection string f id text fidtext get text gettext string f name text fnametext get text gettext string schema f schema text fschematext get text gettext shared f shared schema button fsharedschemabutton f shared schema button fsharedschemabutton get selection getselection i runnable with progress irunnablewithprogress operation workspace modify operation workspacemodifyoperation override execute i progress monitor iprogressmonitor monitor display get default getdefault sync exec syncexec runnable override string schema name schemaname schema nls schema ends with endswith exsd nls schema name schemaname schema exsd i file ifile file f container fcontainer get file getfile path schema overwrite schema exists file exists file generate schema file generateschemafile get plugin id getpluginid shared schema name schemaname monitor core exception coreexception pde plugin pdeplugin log exception logexception file open file openfile f schema text fschematext set text settext file get project relative path getprojectrelativepath to string tostring open schema file openschemafile file monitor operation string get schema location getschemalocation f schema text fschematext string schema f schema text fschematext get text gettext schema length f schema location text fschemalocationtext schema dir equals path f schema location text fschemalocationtext get text gettext last segment lastsegment nls schema dir nls loc schema last index of lastindexof loc schema substring loc nls string get plugin id getpluginid f plugin id text fpluginidtext f plugin id text fpluginidtext get text gettext nls is plugin id needed ispluginidneeded is plugin id final ispluginidfinal is shared schema switch needed issharedschemaswitchneeded open schema file openschemafile i file ifile file i workbench window iworkbenchwindow pde plugin pdeplugin get active workbench window getactiveworkbenchwindow display get shell getshell get display getdisplay async exec asyncexec runnable override string editor id editorid i pde ui constants ipdeuiconstants schema editor get active page getactivepage open editor openeditor file editor input fileeditorinput file editor id editorid part init exception partinitexception pde plugin pdeplugin log exception logexception validate page validatepage clear opening message set message setmessage string message validate field contents validatefieldcontents set error message seterrormessage message set page complete setpagecomplete message string validate field contents validatefieldcontents initialize values initializevalues string validate extension point d validateextensionpointid verify length string f id text fidtext get text gettext length pde ui messages pdeuimessages base extension point main page baseextensionpointmainpage missing extension point d missingextensionpointid greater plug ins verify valid composite valid namespace plug ins verify valid simple string pluginid get plugin id getpluginid i plugin model base ipluginmodelbase model plugin registry pluginregistry find model findmodel pluginid verify plugin model nls bind pde ui messages pdeuimessages base extension point main page baseextensionpointmainpage error msg plugin not found errormsgpluginnotfound pluginid string schema version schemaversion model get plugin base getpluginbase get schema version getschemaversion schema version schemaversion parse float parsefloat schema version schemaversion id util idutil is valid composite d isvalidcompositeid pde ui messages pdeuimessages base extension point main page baseextensionpointmainpage invalid composite d invalidcompositeid id util idutil is valid simple d isvalidsimpleid pde ui messages pdeuimessages base extension point main page baseextensionpointmainpage invalid simple d invalidsimpleid string validate extension point name validateextensionpointname verify length f name text fnametext get text gettext length pde ui messages pdeuimessages base extension point main page baseextensionpointmainpage missing extension point name missingextensionpointname string validate extension point schema validateextensionpointschema verify length f schema text fschematext get text gettext length pde ui messages pdeuimessages base extension point main page baseextensionpointmainpage missing extension point schema missingextensionpointschema handle plugin browse handlepluginbrowse plugin selection dialog pluginselectiondialog dialog plugin selection dialog pluginselectiondialog get shell getshell plugin registry pluginregistry get workspace models getworkspacemodels dialog create dialog open window i plugin model base ipluginmodelbase workspace model base workspacemodelbase i plugin model base ipluginmodelbase dialog get first result getfirstresult f plugin id text fpluginidtext set text settext workspace model base workspacemodelbase get plugin base getpluginbase get id getid handle schema location handleschemalocation element tree selection dialog elementtreeselectiondialog dialog element tree selection dialog elementtreeselectiondialog get shell getshell workbench label provider workbenchlabelprovider workbench content provider workbenchcontentprovider dialog set title settitle pde ui messages pdeuimessages base extension point main page baseextensionpointmainpage schema location schemalocation title dialog set message setmessage pde ui messages pdeuimessages base extension point main page baseextensionpointmainpage schema location schemalocation desc dialog set double click selects setdoubleclickselects dialog set allow multiple setallowmultiple dialog add filter addfilter viewer filter viewerfilter override select viewer viewer object parent element parentelement object element element i file ifile dialog set input setinput pde plugin pdeplugin get workspace getworkspace get root getroot dialog set comparator setcomparator resource comparator resourcecomparator resource comparator resourcecomparator dialog set initial selection setinitialselection f container fcontainer dialog create platformui get workbench getworkbench get help system gethelpsystem set help sethelp dialog get shell getshell i help context ids ihelpcontextids container selection dialog open window object elements dialog get result getresult elements length i resource iresource elem i resource iresource elements string new path newpath get workspace relative path getworkspacerelativepath elem get location getlocation to string tostring nls f schema location text fschemalocationtext set text settext nls new path newpath string get workspace relative path getworkspacerelativepath string path string workspace path workspacepath pde core pdecore get workspace getworkspace get root getroot get location getlocation to string tostring path starts with startswith workspace path workspacepath nls path path replace first replacefirst workspace path workspacepath path string get invalid id message getinvalididmessage validation making blank