copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal editor plugin java util array list arraylist java util hash set hashset org eclipse core resources org eclipse core runtime org eclipse jdt core org eclipse jface action org eclipse jface viewers org eclipse jface window window org eclipse pde core org eclipse pde core build org eclipse pde core plugin org eclipse pde internal build i build properties constants ibuildpropertiesconstants org eclipse pde internal core classpath util core classpathutilcore org eclipse pde internal core bundle bundle plugin base bundlepluginbase org eclipse pde internal core plugin plugin library pluginlibrary org eclipse pde internal core project pde project pdeproject org eclipse pde internal org eclipse pde internal editor org eclipse pde internal editor build org eclipse pde internal editor context input context manager inputcontextmanager org eclipse pde internal elements default content provider defaultcontentprovider org eclipse pde internal parts editable table part editabletablepart org eclipse pde internal parts table part tablepart org eclipse pde internal util swt util swtutil org eclipse swt swt org eclipse swt events selection adapter selectionadapter org eclipse swt events selection event selectionevent org eclipse swt layout grid data griddata org eclipse swt widgets org eclipse platformui org eclipse actions action factory actionfactory org eclipse dialogs element tree selection dialog elementtreeselectiondialog org eclipse forms editor i form page iformpage org eclipse forms widgets form toolkit formtoolkit org eclipse forms widgets org eclipse model workbench content provider workbenchcontentprovider org eclipse model workbench label provider workbenchlabelprovider org eclipse views navigator resource comparator resourcecomparator library section librarysection table section tablesection i build properties constants ibuildpropertiesconstants add remove action f rename action frenameaction action f remove action fremoveaction action f new action fnewaction table viewer tableviewer f library table flibrarytable library filter libraryfilter jar file filter jarfilefilter library filter libraryfilter hash set hashset i path ipath override select viewer viewer object parent object element element i folder ifolder is path valid ispathvalid i folder ifolder element get project relative path getprojectrelativepath element i file ifile is file valid isfilevalid i file ifile element get project relative path getprojectrelativepath library selection validator libraryselectionvalidator jar selection validator jarselectionvalidator library selection validator libraryselectionvalidator accepted types acceptedtypes allow multiple selection allowmultipleselection accepted types acceptedtypes allow multiple selection allowmultipleselection override is valid isvalid object element element i folder ifolder is valid isvalid element table content provider tablecontentprovider default content provider defaultcontentprovider i structured content provider istructuredcontentprovider override object get elements getelements object parent get model getmodel get plugin base getpluginbase get libraries getlibraries library section librarysection pde form page pdeformpage composite parent parent description string pde ui messages pdeuimessages new manifest editor newmanifesteditor library section librarysection pde ui messages pdeuimessages new manifest editor newmanifesteditor library section librarysection add pde ui messages pdeuimessages new manifest editor newmanifesteditor library section librarysection remove pde ui messages pdeuimessages manifest editor manifesteditor library section librarysection pde ui messages pdeuimessages manifest editor manifesteditor library section librarysection string get section description getsectiondescription i plugin model base ipluginmodelbase model get model getmodel is bundle isbundle model is fragment model isfragmentmodel pde ui messages pdeuimessages classpath section classpathsection fragment pde ui messages pdeuimessages classpath section classpathsection plugin model is fragment model isfragmentmodel pde ui messages pdeuimessages manifest editor manifesteditor library section librarysection f desc fdesc pde ui messages pdeuimessages manifest editor manifesteditor library section librarysection desc is bundle isbundle get bundle context getbundlecontext bundle input context bundleinputcontext get bundle context getbundlecontext input context manager inputcontextmanager manager get page getpage getpdeeditor get context manager getcontextmanager bundle input context bundleinputcontext manager find context findcontext bundle input context bundleinputcontext context override create client createclient form toolkit formtoolkit toolkit set text settext pde ui messages pdeuimessages manifest editor manifesteditor library section librarysection title set description setdescription get section description getsectiondescription composite container create client container createclientcontainer toolkit editable table part editabletablepart table part tablepart get table part gettablepart table part tablepart set editable seteditable is editable iseditable create viewer part control createviewerpartcontrol container swt multi toolkit f library table flibrarytable table part tablepart get table viewer gettableviewer f library table flibrarytable set content provider setcontentprovider table content provider tablecontentprovider f library table flibrarytable set label provider setlabelprovider pde plugin pdeplugin get default getdefault get label provider getlabelprovider toolkit paint b orders for paintbordersfor container make actions makeactions update buttons updatebuttons set layout setlayout form layout factory formlayoutfactory create clear grid layout createcleargridlayout set layout data setlayoutdata grid data griddata grid data griddata fill set client setclient container i plugin model base ipluginmodelbase model get model getmodel f library table flibrarytable set input setinput model get plugin base getpluginbase model add model changed listener addmodelchangedlistener update buttons updatebuttons table table f library table flibrarytable get table gettable has selection hasselection table get selection getselection length single selection singleselection table get selection getselection length count table get item count getitemcount table get selection index getselectionindex can move up canmoveup single selection singleselection can move down canmovedown single selection singleselection count table part tablepart table part tablepart get table part gettablepart table part tablepart set button enabled setbuttonenabled add is editable iseditable table part tablepart set button enabled setbuttonenabled is editable iseditable table part tablepart set button enabled setbuttonenabled remove is editable iseditable has selection hasselection table part tablepart set button enabled setbuttonenabled is editable iseditable can move up canmoveup table part tablepart set button enabled setbuttonenabled is editable iseditable can move down canmovedown make actions makeactions f new action fnewaction action pde ui messages pdeuimessages manifest editor manifesteditor library section librarysection new library newlibrary override handle new handlenew f new action fnewaction set enabled setenabled is editable iseditable f rename action frenameaction action pde ui messages pdeuimessages editable table part editabletablepart rename action renameaction override get rename action getrenameaction f rename action frenameaction set enabled setenabled is editable iseditable f remove action fremoveaction action pde ui messages pdeuimessages new manifest editor newmanifesteditor library section librarysection remove override handle remove handleremove f remove action fremoveaction set enabled setenabled is editable iseditable override selection changed selectionchanged i structured selection istructuredselection selection get page getpage getpdeeditor set selection setselection selection get page getpage get model getmodel is editable iseditable update buttons updatebuttons override button selected buttonselected handle new handlenew add handle add handleadd remove handle remove handleremove handle up handleup handle down handledown override dispose i plugin model base ipluginmodelbase model get model getmodel model model remove model changed listener removemodelchangedlistener dispose override do global action doglobalaction string action id actionid is editable iseditable action id actionid equals action factory actionfactory delete get id getid handle remove handleremove action id actionid equals action factory actionfactory cut get id getid delete editor transfer selection clipboard handle remove handleremove action id actionid equals action factory actionfactory paste get id getid do paste dopaste override set form input setforminput object object object i plugin library ipluginlibrary f library table flibrarytable set selection setselection structured selection structuredselection object override fill context menu fillcontextmenu i menu manager imenumanager manager manager add f new action fnewaction f library table flibrarytable get selection getselection is empty isempty manager add separator manager add f rename action frenameaction manager add f remove action fremoveaction copy cut paste operations supported plug ins manifest bundle get page getpage getpdeeditor get contributor getcontributor context menu about to show contextmenuabouttoshow manager is bundle isbundle handle remove handleremove object selection i structured selection istructuredselection f library table flibrarytable get selection getselection to array toarray f library table flibrarytable get table gettable get selection index getselectionindex indices f library table flibrarytable get table gettable get selection indices getselectionindices indices length indices indices string remove string selection length selection length selection selection i plugin library ipluginlibrary i plugin library ipluginlibrary i plugin library ipluginlibrary selection i plugin base ipluginbase plugin get plugin base getpluginbase plugin remove core exception coreexception pde plugin pdeplugin log exception logexception remove get name getname update build properties updatebuildproperties remove string remove length update java classpath libs updatejavaclasspathlibs remove string remove length item count itemcount f library table flibrarytable get table gettable get item count getitemcount item count itemcount item count itemcount item count itemcount f library table flibrarytable get table gettable set selection setselection f library table flibrarytable get table gettable set focus setfocus update buttons updatebuttons handle down handledown table table get table part gettablepart get table viewer gettableviewer get table gettable table get selection index getselectionindex table get item count getitemcount swap handle up handleup get table part gettablepart get table viewer gettableviewer get table gettable get selection index getselectionindex swap swap table table get table part gettablepart get table viewer gettableviewer get table gettable i plugin library ipluginlibrary i plugin library ipluginlibrary table get item getitem get data getdata i plugin library ipluginlibrary i plugin library ipluginlibrary table get item getitem get data getdata i plugin model base ipluginmodelbase model get model getmodel i plugin base ipluginbase plugin base pluginbase model get plugin base getpluginbase plugin base pluginbase swap refresh table set selection setselection table set focus setfocus update buttons updatebuttons core exception coreexception pde plugin pdeplugin log exception logexception handle new handlenew i plugin model base ipluginmodelbase model get model getmodel new runtime library dialog newruntimelibrarydialog dialog new runtime library dialog newruntimelibrarydialog get page getpage get site getsite get shell getshell model get plugin base getpluginbase get libraries getlibraries dialog create dialog get shell getshell set text settext pde ui messages pdeuimessages manifest editor manifesteditor library section librarysection new library entry newlibraryentry swt util swtutil set dialog size setdialogsize dialog dialog open window string lib name libname dialog get library name getlibraryname lib name libname lib name libname length i plugin library ipluginlibrary library model get plugin factory getpluginfactory create library createlibrary library set name setname lib name libname library set exported setexported model get plugin base getpluginbase add library check source root entry checksourcerootentry update build properties updatebuildproperties string string library get name getname f library table flibrarytable set selection setselection structured selection structuredselection library f library table flibrarytable get table gettable set focus setfocus core exception coreexception pde plugin pdeplugin log exception logexception check source root entry checksourcerootentry i plugin model base ipluginmodelbase plugin model pluginmodel get model getmodel i plugin library ipluginlibrary libraries plugin model pluginmodel get plugin base getpluginbase get libraries getlibraries libraries length nls libraries get name getname equals i build model ibuildmodel model get build model getbuildmodel model i build entry ibuildentry entires model get build getbuild get build entries getbuildentries entires length entires get name getname equals property source prefix i plugin library ipluginlibrary library plugin model pluginmodel get plugin factory getpluginfactory create library createlibrary nls library set name setname nls plugin model pluginmodel get plugin base getpluginbase add library core exception coreexception i build model ibuildmodel get build model getbuildmodel i form page iformpage get page getpage get editor geteditor find page findpage build input context buildinputcontext context i base model ibasemodel model build source page buildsourcepage model build source page buildsourcepage get input context getinputcontext get model getmodel model model i build model ibuildmodel i build model ibuildmodel model configure source build entry configuresourcebuildentry i build model ibuildmodel bmodel string old path oldpath string new path newpath core exception coreexception i build ibuild build bmodel get build getbuild i build entry ibuildentry entry build get entry getentry property source prefix old path oldpath old path oldpath new path newpath new path newpath entry i project iproject project i model imodel get page getpage get model getmodel get underlying resource getunderlyingresource get project getproject i java project ijavaproject jproject java core javacore create project array list arraylist string tokens array list arraylist i classpath entry iclasspathentry entries jproject get raw classpath getrawclasspath entries length entries get entry kind getentrykind i classpath entry iclasspathentry cpe source tokens add entries get path getpath remove first segments removefirstsegments add trailing separator addtrailingseparator to string tostring tokens size entry bmodel get factory getfactory create entry createentry property source prefix new path newpath tokens size entry add token addtoken tokens build add entry entry set name setname property source prefix new path newpath entry build remove entry java model exception javamodelexception handle add handleadd update classpath updateclasspath element tree selection dialog elementtreeselectiondialog dialog element tree selection dialog elementtreeselectiondialog get page getpage get site getsite get shell getshell workbench label provider workbenchlabelprovider workbench content provider workbenchcontentprovider override control create dialog area createdialogarea composite parent composite comp composite create dialog area createdialogarea parent button button button comp swt check button set text settext pde ui messages pdeuimessages library section librarysection add dialog button adddialogbutton button set selection setselection update classpath updateclasspath button add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent update classpath updateclasspath button get selection getselection apply dialog font applydialogfont button comp accepted classes acceptedclasses i file ifile dialog set validator setvalidator library selection validator libraryselectionvalidator accepted classes acceptedclasses dialog set title settitle pde ui messages pdeuimessages build editor buildeditor classpath section classpathsection jars title jarstitle dialog set message setmessage pde ui messages pdeuimessages classpath section classpathsection jars message jarsmessage i plugin library ipluginlibrary libraries get model getmodel get plugin base getpluginbase get libraries getlibraries i project iproject project i model imodel get page getpage get model getmodel get underlying resource getunderlyingresource get project getproject hash set hashset i path ipath hash set hashset libraries length i path ipath bundle path bundlepath path classpath util core classpathutilcore expand library name expandlibraryname libraries get name getname i path ipath build path buildpath pde project pdeproject get bundle root getbundleroot project get project relative path getprojectrelativepath append bundle path bundlepath add build path buildpath dialog add filter addfilter library filter libraryfilter dialog set input setinput project dialog set comparator setcomparator resource comparator resourcecomparator resource comparator resourcecomparator dialog create platformui get workbench getworkbench get help system gethelpsystem set help sethelp dialog get shell getshell i help context ids ihelpcontextids add library dialog open window object elements dialog get result getresult string bundle paths bundlepaths string elements length string build paths buildpaths string elements length i plugin model base ipluginmodelbase model get model getmodel array list arraylist i plugin library ipluginlibrary list array list arraylist elements length i resource iresource elem i resource iresource elements i container icontainer bundle root bundleroot pde project pdeproject get bundle root getbundleroot project i path ipath root path rootpath bundle root bundleroot get full path getfullpath path relative bundle root i path ipath bundle path bundlepath elem get full path getfullpath make relative to makerelativeto root path rootpath i path ipath build path buildpath elem get project relative path getprojectrelativepath elem i folder ifolder bundle path bundlepath bundle path bundlepath add trailing separator addtrailingseparator build path buildpath build path buildpath add trailing separator addtrailingseparator bundle paths bundlepaths bundle path bundlepath to string tostring build paths buildpaths build path buildpath to string tostring i plugin library ipluginlibrary library model get plugin factory getpluginfactory create library createlibrary library set name setname bundle paths bundlepaths library set exported setexported model get plugin base getpluginbase add library list add library core exception coreexception pde plugin pdeplugin log exception logexception check source root entry checksourcerootentry update build properties updatebuildproperties string bundle paths bundlepaths length bundle paths bundlepaths update classpath updateclasspath update java classpath libs updatejavaclasspathlibs string build paths buildpaths length build paths buildpaths f library table flibrarytable set selection setselection structured selection structuredselection list to array toarray f library table flibrarytable get table gettable set focus setfocus update build properties updatebuildproperties string old paths oldpaths string new paths newpaths modify source entry modifysourceentry i build model ibuildmodel bmodel get build model getbuildmodel bmodel i build ibuild build bmodel get build getbuild i build entry ibuildentry entry build get entry getentry property bin includes entry entry bmodel get factory getfactory create entry createentry property bin includes adding entries old paths oldpaths new paths newpaths length new paths newpaths entry add token addtoken new paths newpaths modify source entry modifysourceentry configure source build entry configuresourcebuildentry bmodel new paths newpaths removing entries new paths newpaths old paths oldpaths length old paths oldpaths entry remove token removetoken old paths oldpaths modify source entry modifysourceentry configure source build entry configuresourcebuildentry bmodel old paths oldpaths entry get tokens gettokens length build remove entry rename entries old paths oldpaths length new paths newpaths old paths oldpaths entry rename token renametoken old paths oldpaths new paths newpaths modify source entry modifysourceentry configure source build entry configuresourcebuildentry bmodel old paths oldpaths new paths newpaths core exception coreexception update java classpath libs updatejavaclasspathlibs string old paths oldpaths string new paths newpaths i project iproject project i model imodel get page getpage get model getmodel get underlying resource getunderlyingresource get project getproject i java project ijavaproject jproject java core javacore create project i classpath entry iclasspathentry entries jproject get raw classpath getrawclasspath array list arraylist i classpath entry iclasspathentry to be added tobeadded array list arraylist entry loop entryloop entries length entries get entry kind getentrykind i classpath entry iclasspathentry cpe library add paths handling deletion renaming i path ipath path entries get path getpath remove first segments removefirstsegments remove trailing separator removetrailingseparator old paths oldpaths length old paths oldpaths path equals path old paths oldpaths remove trailing separator removetrailingseparator entry loop entryloop entries get entry kind getentrykind i classpath entry iclasspathentry cpe container to be added tobeadded add entries entries length add paths new paths newpaths length new paths newpaths i classpath entry iclasspathentry entry java core javacore new library entry newlibraryentry project get full path getfullpath append new paths newpaths to be added tobeadded entry to be added tobeadded add entry to be added tobeadded size entries length i classpath entry iclasspathentry updated to be added tobeadded to array toarray i classpath entry iclasspathentry to be added tobeadded size jproject set raw classpath setrawclasspath updated java model exception javamodelexception override refresh f library table flibrarytable get control getcontrol is disposed isdisposed f library table flibrarytable set selection setselection f library table flibrarytable refresh refresh override model changed modelchanged i model changed event imodelchangedevent event event get change type getchangetype i model changed event imodelchangedevent changed mark stale markstale object change object changeobject event get changed objects getchangedobjects change object changeobject i plugin library ipluginlibrary event get change type getchangetype i model changed event imodelchangedevent insert f library table flibrarytable refresh event get change type getchangetype i model changed event imodelchangedevent remove f library table flibrarytable remove change object changeobject f library table flibrarytable update change object changeobject change object changeobject equals f library table flibrarytable get input getinput mark stale markstale change object changeobject i plugin element ipluginelement i plugin element ipluginelement change object changeobject get parent getparent i plugin library ipluginlibrary f library table flibrarytable update i plugin element ipluginelement change object changeobject get parent getparent override set focus setfocus f library table flibrarytable get table gettable set focus setfocus override do paste dopaste object target object targetobject object source objects sourceobjects model i plugin model base ipluginmodelbase model get model getmodel i plugin base ipluginbase plugin model get plugin base getpluginbase paste source objects source objects sourceobjects length object source object sourceobject source objects sourceobjects source object sourceobject plugin library pluginlibrary plugin library object plugin library pluginlibrary library plugin library pluginlibrary source object sourceobject adjust source object field values accept able acceptable values library reconnect model plugin add library plug plugin add library core exception coreexception pde plugin pdeplugin log exception logexception override can paste canpaste object target object targetobject object source objects sourceobjects hash set hashset path library set libraryset pasted source objects sourceobjects length plugin libraries allowed source objects sourceobjects i plugin library ipluginlibrary assist searching library set libraryset library set libraryset create plugin library set createpluginlibraryset duplicate libraries allowed i plugin library ipluginlibrary library i plugin library ipluginlibrary source objects sourceobjects library set libraryset path classpath util core classpathutilcore expand library name expandlibraryname library get name getname hash set hashset path create plugin library set createpluginlibraryset current libraries add easy searching i plugin library ipluginlibrary libraries get model getmodel get plugin base getpluginbase get libraries getlibraries hash set hashset path library set libraryset hash set hashset libraries length library set libraryset add path classpath util core classpathutilcore expand library name expandlibraryname libraries get name getname library set libraryset override entry modified entrymodified object entry string i plugin model base ipluginmodelbase model get model getmodel i project iproject project model get underlying resource getunderlyingresource get project getproject i plugin library ipluginlibrary library i plugin library ipluginlibrary entry model get plugin base getpluginbase remove library string old value oldvalue library get name getname string new value newvalue library set name setname member exists memberexists project find member findmember update build properties updatebuildproperties old value oldvalue new value newvalue member exists memberexists update java classpath libs updatejavaclasspathlibs old value oldvalue member exists memberexists new value newvalue string model get plugin base getpluginbase add library core exception coreexception pde plugin pdeplugin log exception logexception i plugin model base ipluginmodelbase get model getmodel i plugin model base ipluginmodelbase get page getpage get model getmodel override is drag and drop enabled isdraganddropenabled override can drag move candragmove object source objects sourceobjects validate drag move sanity validatedragmovesanity source objects sourceobjects param source objects sourceobjects validate drag move sanity validatedragmovesanity object source objects sourceobjects validate source source objects sourceobjects objects source objects sourceobjects length multiple selection supported source objects sourceobjects i plugin library ipluginlibrary type override can drop move candropmove object target object targetobject object source objects sourceobjects target location targetlocation sanity check validate drop move sanity validatedropmovesanity target object targetobject source objects sourceobjects multiple selection supported i plugin library ipluginlibrary source plugin library sourcepluginlibrary i plugin library ipluginlibrary source objects sourceobjects i plugin library ipluginlibrary target plugin library targetpluginlibrary i plugin library ipluginlibrary target object targetobject validate model validate drop move model validatedropmovemodel source plugin library sourcepluginlibrary target plugin library targetpluginlibrary bundle plug base bundle plugin base bundlepluginbase bundle plugin base bundlepluginbase bundle plugin base bundlepluginbase get model getmodel get plugin base getpluginbase validate move target location targetlocation viewer drop adapter viewerdropadapter location previous element target i plugin library ipluginlibrary previous library previouslibrary bundle plugin base bundlepluginbase get previous library getpreviouslibrary target plugin library targetpluginlibrary ensure previous element source source plugin library sourcepluginlibrary equals previous library previouslibrary target location targetlocation viewer drop adapter viewerdropadapter location element target i plugin library ipluginlibrary next library nextlibrary bundle plugin base bundlepluginbase get next library getnextlibrary target plugin library targetpluginlibrary ensure element source source plugin library sourcepluginlibrary equals next library nextlibrary target location targetlocation viewer drop adapter viewerdropadapter location supported param target object targetobject param source objects sourceobjects validate drop move sanity validatedropmovesanity object target object targetobject object source objects sourceobjects validate target object target object targetobject i plugin library ipluginlibrary validate source objects validate drag move sanity validatedragmovesanity source objects sourceobjects param source plugin library sourcepluginlibrary param target plugin library targetpluginlibrary validate drop move model validatedropmovemodel i plugin library ipluginlibrary source plugin library sourcepluginlibrary i plugin library ipluginlibrary target plugin library targetpluginlibrary objects model i shared plugin model isharedpluginmodel source model sourcemodel source plugin library sourcepluginlibrary get model getmodel i shared plugin model isharedpluginmodel target model targetmodel target plugin library targetpluginlibrary get model getmodel source model sourcemodel equals target model targetmodel get model getmodel get plugin base getpluginbase bundle plugin base bundlepluginbase override do drop move dodropmove object target object targetobject object source objects sourceobjects target location targetlocation sanity check validate drop move sanity validatedropmovesanity target object targetobject source objects sourceobjects display get default getdefault beep multiple selection supported i plugin library ipluginlibrary source plugin library sourcepluginlibrary i plugin library ipluginlibrary source objects sourceobjects i plugin library ipluginlibrary target plugin library targetpluginlibrary i plugin library ipluginlibrary target object targetobject validate move target location targetlocation viewer drop adapter viewerdropadapter location target location targetlocation viewer drop adapter viewerdropadapter location move do drop move dodropmove source plugin library sourcepluginlibrary target plugin library targetpluginlibrary target location targetlocation target location targetlocation viewer drop adapter viewerdropadapter location supported param source plugin library sourcepluginlibrary param target plugin library targetpluginlibrary param target location targetlocation do drop move dodropmove i plugin library ipluginlibrary source plugin library sourcepluginlibrary i plugin library ipluginlibrary target plugin library targetpluginlibrary target location targetlocation remove original source object remove original source object inserting serialized source object libraries removed objects existing conf ound confound remove operation do drag remove dodragremove bundle plug base i plugin model base ipluginmodelbase model get model getmodel bundle plugin base bundlepluginbase bundle plugin base bundlepluginbase bundle plugin base bundlepluginbase model get plugin base getpluginbase target bundle plugin base bundlepluginbase get index of getindexof target plugin library targetpluginlibrary ensure target determine location target index targetindex target location targetlocation viewer drop adapter viewerdropadapter location target index targetindex ensure plugin library concrete source plugin library sourcepluginlibrary plugin library pluginlibrary adjust source object field values accept able acceptable values plugin library pluginlibrary source plugin library sourcepluginlibrary reconnect model bundle plugin base bundlepluginbase add source sibling target bundle plugin base bundlepluginbase add source plugin library sourcepluginlibrary target index targetindex core exception coreexception do drag remove dodragremove bundle plug base bundle plugin base bundlepluginbase bundle plugin base bundlepluginbase bundle plugin base bundlepluginbase get model getmodel get plugin base getpluginbase retrieve original serialized source objects dragged init ially initially object source objects sourceobjects get drag source objects getdragsourceobjects validate source objects validate drag move sanity validatedragmovesanity source objects sourceobjects remove library i plugin library ipluginlibrary source plugin library sourcepluginlibrary i plugin library ipluginlibrary source objects sourceobjects bundle plugin base bundlepluginbase remove source plugin library sourcepluginlibrary core exception coreexception pde plugin pdeplugin log exception logexception