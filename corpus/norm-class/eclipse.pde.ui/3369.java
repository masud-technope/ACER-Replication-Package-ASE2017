copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation alexander kurtakov akurtako redhat bug fabian miehe bug simon scholz simon scholz vogella bug org eclipse pde internal editor feature java util array list arraylist java util iterator org eclipse core runtime core exception coreexception org eclipse jface action org eclipse jface viewers org eclipse jface window window org eclipse pde core i model imodel org eclipse pde core i model changed event imodelchangedevent org eclipse pde core plugin org eclipse pde internal core org eclipse pde internal core feature feature plugin featureplugin org eclipse pde internal core ifeature org eclipse pde internal core util core utility coreutility org eclipse pde internal pde plugin pdeplugin org eclipse pde internal pde ui messages pdeuimessages org eclipse pde internal dialogs plugin selection dialog pluginselectiondialog org eclipse pde internal editor org eclipse pde internal editor actions sort action sortaction org eclipse pde internal elements default content provider defaultcontentprovider org eclipse pde internal parts table part tablepart org eclipse pde internal wizards list util listutil org eclipse swt swt org eclipse swt custom busy indicator busyindicator org eclipse swt dnd clipboard org eclipse swt graphics cursor org eclipse swt layout grid data griddata org eclipse swt widgets org eclipse actions action factory actionfactory org eclipse forms widgets form toolkit formtoolkit org eclipse forms widgets plugin section pluginsection table section tablesection i plugin model listener ipluginmodellistener remove sync open reference action openreferenceaction f open action fopenaction table viewer tableviewer f plugin viewer fpluginviewer action f new action fnewaction action f delete action fdeleteaction sort action sortaction f sort action fsortaction plugin content provider plugincontentprovider default content provider defaultcontentprovider i structured content provider istructuredcontentprovider override object get elements getelements object parent parent i feature ifeature i feature ifeature parent get plugins getplugins object plugin section pluginsection pde form page pdeformpage composite parent parent description string pde ui messages pdeuimessages feature editor featureeditor plugin section pluginsection pde ui messages pdeuimessages feature editor featureeditor plugin section pluginsection remove pde ui messages pdeuimessages feature editor featureeditor spec section specsection synchronize get section getsection set text settext pde ui messages pdeuimessages feature editor featureeditor plugin section pluginsection plugin title plugintitle get section getsection set description setdescription pde ui messages pdeuimessages feature editor featureeditor plugin section pluginsection plugin desc plugindesc get table part gettablepart set editable seteditable override commit on save onsave commit on save onsave override create client createclient form toolkit formtoolkit toolkit set layout setlayout form layout factory formlayoutfactory create clear grid layout createcleargridlayout grid data griddata data grid data griddata grid data griddata fill set layout data setlayoutdata data composite container create client container createclientcontainer toolkit create viewer part control createviewerpartcontrol container swt multi toolkit table part tablepart table part tablepart get table part gettablepart f plugin viewer fpluginviewer table part tablepart get table viewer gettableviewer f plugin viewer fpluginviewer set content provider setcontentprovider plugin content provider plugincontentprovider f plugin viewer fpluginviewer set label provider setlabelprovider pde plugin pdeplugin get default getdefault get label provider getlabelprovider f plugin viewer fpluginviewer set comparator setcomparator list util listutil comparator toolkit paint b orders for paintbordersfor container make actions makeactions set client setclient container initialize create section toolbar createsectiontoolbar toolkit param param toolkit create section toolbar createsectiontoolbar form toolkit formtoolkit toolkit tool bar manager toolbarmanager tool bar manager toolbarmanager tool bar manager toolbarmanager swt flat tool bar toolbar toolbar tool bar manager toolbarmanager create control createcontrol cursor hand cursor handcursor display get current getcurrent get system cursor getsystemcursor swt cursor hand toolbar set cursor setcursor hand cursor handcursor add sort action tool bar f sort action fsortaction sort action sortaction get structured viewer part getstructuredviewerpart get viewer getviewer pde ui messages pdeuimessages feature editor featureeditor plugin section pluginsection sort alpha sortalpha list util listutil comparator tool bar manager toolbarmanager add f sort action fsortaction tool bar manager toolbarmanager update set text client settextclient toolbar override handle double click handledoubleclick i structured selection istructuredselection selection f open action fopenaction override button selected buttonselected handle new handlenew remove handle delete handledelete sync handle synchronize handlesynchronize override dispose pde core pdecore get default getdefault get model manager getmodelmanager remove plugin model listener removepluginmodellistener dispose override set form input setforminput object object object i feature plugin ifeatureplugin f plugin viewer fpluginviewer set selection setselection structured selection structuredselection object override fill context menu fillcontextmenu i menu manager imenumanager manager manager add f open action fopenaction add manager add separator manager add f new action fnewaction manager add f delete action fdeleteaction add delete get page getpage getpdeeditor get contributor getcontributor context menu about to show contextmenuabouttoshow manager handle new handlenew busy indicator busyindicator show while showwhile f plugin viewer fpluginviewer get table gettable get display getdisplay runnable override i plugin model base ipluginmodelbase all models allmodels plugin registry pluginregistry get active models getactivemodels array list arraylist i plugin model base ipluginmodelbase new models newmodels array list arraylist all models allmodels length can add canadd all models allmodels new models newmodels add all models allmodels i plugin model base ipluginmodelbase candidate models candidatemodels new models newmodels to array toarray i plugin model base ipluginmodelbase new models newmodels size plugin selection dialog pluginselectiondialog dialog plugin selection dialog pluginselectiondialog f plugin viewer fpluginviewer get table gettable get shell getshell candidate models candidatemodels dialog open window object models dialog get result getresult do add doadd models core exception coreexception pde plugin pdeplugin log do add doadd object candidates core exception coreexception i feature model ifeaturemodel model i feature model ifeaturemodel get page getpage get model getmodel i feature ifeature feature model get feature getfeature i feature plugin ifeatureplugin i feature plugin ifeatureplugin candidates length candidates length i plugin model base ipluginmodelbase candidate i plugin model base ipluginmodelbase candidates feature plugin featureplugin fplugin feature plugin featureplugin model get factory getfactory create plugin createplugin fplugin load from loadfrom candidate get plugin base getpluginbase fplugin set version setversion i core constants icoreconstants version fplugin set unpack setunpack core utility coreutility guess unpack guessunpack candidate get bundle description getbundledescription fplugin feature add plugins addplugins can add canadd i plugin model base ipluginmodelbase candidate i plugin base ipluginbase plugin candidate get plugin base getpluginbase i feature model ifeaturemodel model i feature model ifeaturemodel get page getpage get model getmodel i feature plugin ifeatureplugin f plugins fplugins model get feature getfeature get plugins getplugins f plugins fplugins length f plugins fplugins get id getid equals plugin get id getid handle select all handleselectall i structured content provider istructuredcontentprovider provider i structured content provider istructuredcontentprovider f plugin viewer fpluginviewer get content provider getcontentprovider object elements provider get elements getelements f plugin viewer fpluginviewer get input getinput structured selection structuredselection ssel structured selection structuredselection elements f plugin viewer fpluginviewer set selection setselection ssel handle delete handledelete i structured selection istructuredselection ssel i structured selection istructuredselection f plugin viewer fpluginviewer get selection getselection ssel is empty isempty i feature model ifeaturemodel model i feature model ifeaturemodel get page getpage get model getmodel model is editable iseditable i feature ifeature feature model get feature getfeature i feature plugin ifeatureplugin removed i feature plugin ifeatureplugin ssel size iterator iter ssel iterator iter has next hasnext i feature plugin ifeatureplugin iobj i feature plugin ifeatureplugin iter removed iobj feature remove plugins removeplugins removed core exception coreexception pde plugin pdeplugin log exception logexception handle synchronize handlesynchronize feature editor contributor featureeditorcontributor contributor feature editor contributor featureeditorcontributor get page getpage getpdeeditor get contributor getcontributor busy indicator busyindicator show while showwhile f plugin viewer fpluginviewer get control getcontrol get display getdisplay runnable override contributor get synchronize action getsynchronizeaction override do global action doglobalaction string action id actionid action id actionid equals action factory actionfactory delete get id getid busy indicator busyindicator show while showwhile f plugin viewer fpluginviewer get table gettable get display getdisplay runnable override handle delete handledelete action id actionid equals action factory actionfactory cut get id getid delete editor transfer selection clipboard handle delete handledelete action id actionid equals action factory actionfactory paste get id getid do paste dopaste action id actionid equals action factory actionfactory select get id getid busy indicator busyindicator show while showwhile f plugin viewer fpluginviewer get table gettable get display getdisplay runnable override handle select all handleselectall override selection changed selectionchanged i structured selection istructuredselection selection get page getpage getpdeeditor set selection setselection selection update buttons updatebuttons update buttons updatebuttons table part tablepart table part tablepart get table part gettablepart table table table part tablepart get table viewer gettableviewer get table gettable table item tableitem table selection tableselection table get selection getselection has selection hasselection table selection tableselection length delete table part tablepart set button enabled setbuttonenabled remove is editable iseditable has selection hasselection initialize i feature model ifeaturemodel model i feature model ifeaturemodel get page getpage get model getmodel refresh get table part gettablepart set button enabled setbuttonenabled model is editable iseditable get table part gettablepart set button enabled setbuttonenabled model is editable iseditable model add model changed listener addmodelchangedlistener pde core pdecore get default getdefault get model manager getmodelmanager add plugin model listener addpluginmodellistener override model changed modelchanged i model changed event imodelchangedevent get change type getchangetype i model changed event imodelchangedevent changed mark stale markstale object obj get changed objects getchangedobjects obj i feature plugin ifeatureplugin get change type getchangetype i model changed event imodelchangedevent change f plugin viewer fpluginviewer update obj get change type getchangetype i model changed event imodelchangedevent insert f plugin viewer fpluginviewer add get changed objects getchangedobjects get changed objects getchangedobjects length f plugin viewer fpluginviewer set selection setselection structured selection structuredselection get changed objects getchangedobjects get change type getchangetype i model changed event imodelchangedevent remove f plugin viewer fpluginviewer remove get changed objects getchangedobjects make actions makeactions i model imodel model i model imodel get page getpage get model getmodel f new action fnewaction action override handle new handlenew f new action fnewaction set text settext pde ui messages pdeuimessages menus label f new action fnewaction set enabled setenabled model is editable iseditable f delete action fdeleteaction action override busy indicator busyindicator show while showwhile f plugin viewer fpluginviewer get table gettable get display getdisplay runnable override handle delete handledelete f delete action fdeleteaction set text settext pde ui messages pdeuimessages actions delete label f delete action fdeleteaction set enabled setenabled model is editable iseditable f open action fopenaction open reference action openreferenceaction f plugin viewer fpluginviewer override models changed modelschanged plugin model delta pluginmodeldelta delta get section getsection get display getdisplay async exec asyncexec runnable override get section getsection is disposed isdisposed model entry modelentry delta get added entries getaddedentries model entry modelentry removed delta get removed entries getremovedentries model entry modelentry changed delta get changed entries getchangedentries has plugin models haspluginmodels has plugin models haspluginmodels removed has plugin models haspluginmodels changed mark stale markstale has plugin models haspluginmodels model entry modelentry entries entries override set focus setfocus f plugin viewer fpluginviewer f plugin viewer fpluginviewer get table gettable set focus setfocus override refresh i feature model ifeaturemodel model i feature model ifeaturemodel get page getpage get model getmodel i feature ifeature feature model get feature getfeature f plugin viewer fpluginviewer set input setinput feature update buttons updatebuttons refresh org eclipse pde internal editor structured viewer section structuredviewersection can paste canpaste clipboard override can paste canpaste clipboard clipboard object objects object clipboard get contents getcontents model data transfer modeldatatransfer get instance getinstance objects objects length can paste canpaste objects org eclipse pde internal editor structured viewer section structuredviewersection can paste canpaste object object override can paste canpaste object target object objects objects length objects feature plugin featureplugin org eclipse pde internal editor structured viewer section structuredviewersection do paste dopaste override do paste dopaste clipboard clipboard get page getpage getpdeeditor get clipboard getclipboard object objects object clipboard get contents getcontents model data transfer modeldatatransfer get instance getinstance objects can paste canpaste objects do paste dopaste objects org eclipse pde internal editor structured viewer section structuredviewersection do paste dopaste object object override do paste dopaste object target object objects i feature model ifeaturemodel model i feature model ifeaturemodel get page getpage get model getmodel model is editable iseditable i feature ifeature feature model get feature getfeature feature plugin featureplugin f plugins fplugins feature plugin featureplugin objects length objects length feature plugin featureplugin f plugin fplugin feature plugin featureplugin objects f plugin fplugin set model setmodel model f plugin fplugin set parent setparent feature f plugins fplugins f plugin fplugin feature add plugins addplugins f plugins fplugins core exception coreexception pde plugin pdeplugin log exception logexception fire selection fireselection i selection iselection sel f plugin viewer fpluginviewer get selection getselection sel is empty isempty f plugin viewer fpluginviewer set selection setselection f plugin viewer fpluginviewer get selection getselection f plugin viewer fpluginviewer get element at getelementat f plugin viewer fpluginviewer set selection setselection structured selection structuredselection f plugin viewer fpluginviewer get element at getelementat override create count createcount