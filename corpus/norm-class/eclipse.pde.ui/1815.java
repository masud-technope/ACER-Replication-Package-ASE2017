copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal editor build java util org eclipse core resources org eclipse core runtime org eclipse jdt core org eclipse jface action org eclipse jface dialogs i input validator iinputvalidator org eclipse jface viewers org eclipse jface window window org eclipse pde core org eclipse pde core build org eclipse pde core plugin i plugin model base ipluginmodelbase org eclipse pde internal build i build properties constants ibuildpropertiesconstants org eclipse pde internal org eclipse pde internal dialogs folder selection dialog folderselectiondialog org eclipse pde internal editor org eclipse pde internal editor context input context inputcontext org eclipse pde internal elements default content provider defaultcontentprovider org eclipse pde internal parts structured viewer part structuredviewerpart org eclipse pde internal parts table part tablepart org eclipse pde internal wizards rename dialog renamedialog org eclipse swt swt org eclipse swt custom busy indicator busyindicator org eclipse swt graphics image org eclipse swt layout grid data griddata org eclipse swt widgets org eclipse i shared images isharedimages org eclipse platformui org eclipse actions action factory actionfactory org eclipse dialogs i selection status validator iselectionstatusvalidator org eclipse forms widgets form toolkit formtoolkit org eclipse forms widgets org eclipse model workbench content provider workbenchcontentprovider org eclipse model workbench label provider workbenchlabelprovider runtime info section runtimeinfosection pde section pdesection i build properties constants ibuildpropertiesconstants undex table viewer tableviewer f library viewer flibraryviewer table viewer tableviewer f folder viewer ffolderviewer structured viewer part structuredviewerpart f library part flibrarypart structured viewer part structuredviewerpart f folder part ffolderpart f enabled fenabled part adapter partadapter table part tablepart part adapter partadapter string button labels buttonlabels button labels buttonlabels override selection changed selectionchanged i structured selection istructuredselection selection get page getpage getpdeeditor set selection setselection selection object item selection get first element getfirstelement item i build entry ibuildentry update i build entry ibuildentry item selection is empty isempty update update direct ional buttons updatedirectionalbuttons override handle double click handledoubleclick i structured selection istructuredselection selection object element selection get first element getfirstelement get library selection getlibraryselection element do rename dorename element string handle rename folder handlerenamefolder string element override button selected buttonselected button button get viewer getviewer f library part flibrarypart get viewer getviewer handle new handlenew move undex update jars compile order updatejarscompileorder move update jars compile order updatejarscompileorder get viewer getviewer f folder part ffolderpart get viewer getviewer handle new folder handlenewfolder button get shell getshell set default button setdefaultbutton library content provider librarycontentprovider default content provider defaultcontentprovider i structured content provider istructuredcontentprovider override object get elements getelements object parent parent i build model ibuildmodel i build ibuild build i build model ibuildmodel parent get build getbuild i build entry ibuildentry jar order entry jarorderentry build get entry getentry property jar order i build entry ibuildentry libraries build util buildutil get build libraries getbuildlibraries build get build entries getbuildentries jar order entry jarorderentry libraries vector i build entry ibuildentry lib list liblist vector string tokens jar order entry jarorderentry get tokens gettokens tokens length i build entry ibuildentry entry build get entry getentry i build entry ibuildentry jar prefix tokens entry lib list liblist add entry libraries length lib list liblist libraries lib list liblist add libraries lib list liblist to array toarray object library label provider librarylabelprovider label provider labelprovider i table label provider itablelabelprovider override string get column text getcolumntext object obj string i build entry ibuildentry obj get name getname starts with startswith i build entry ibuildentry jar prefix substring i build entry ibuildentry jar prefix length override image get column image getcolumnimage object obj pde label provider pdelabelprovider provider pde plugin pdeplugin get default getdefault get label provider getlabelprovider provider pde plugin images pdepluginimages desc java lib obj jars new content provider jarsnewcontentprovider workbench content provider workbenchcontentprovider override has children haschildren object element object children get children getchildren element children length children i folder ifolder folder content provider foldercontentprovider default content provider defaultcontentprovider i structured content provider istructuredcontentprovider override object get elements getelements object parent parent i build entry ibuildentry i build entry ibuildentry parent get tokens gettokens object folder label provider folderlabelprovider label provider labelprovider i table label provider itablelabelprovider override string get column text getcolumntext object obj obj to string tostring override image get column image getcolumnimage object obj i shared images isharedimages shared images sharedimages platformui get workbench getworkbench get shared images getsharedimages shared images sharedimages get image getimage i shared images isharedimages img obj folder runtime info section runtimeinfosection pde form page pdeformpage composite parent parent description get section getsection set text settext pde ui messages pdeuimessages build editor buildeditor runtime info section runtimeinfosection title get section getsection set description setdescription pde ui messages pdeuimessages build editor buildeditor runtime info section runtimeinfosection desc get build model getbuildmodel add model changed listener addmodelchangedlistener create client createclient get section getsection get managed form getmanagedform get toolkit gettoolkit i build model ibuildmodel get build model getbuildmodel input context inputcontext context get page getpage getpdeeditor get context manager getcontextmanager find context findcontext build input context buildinputcontext context context i build model ibuildmodel context get model getmodel handle lib in bin build handlelibinbinbuild is selected isselected string lib name libname i build model ibuildmodel model get build model getbuildmodel i build entry ibuildentry bin incl binincl model get build getbuild get entry getentry property bin includes i project iproject project model get underlying resource getunderlyingresource get project getproject i path ipath lib path libpath nls lib name libname equals lib path libpath lib path libpath project get file getfile lib name libname get project relative path getprojectrelativepath bin incl binincl is selected isselected bin incl binincl bin incl binincl model get factory getfactory create entry createentry property bin includes model get build getbuild add bin incl binincl lib path libpath nls is selected isselected lib path libpath segment count segmentcount bin incl binincl jar add all jars to bin includes addalljarstobinincludes bin incl binincl project model is selected isselected lib path libpath segment count segmentcount i path ipath parent lib path libpath remove last segments removelastsegments string parent path parentpath parent to string tostring i path ipath separator bin incl binincl parent path parentpath project exists parent bin incl binincl remove token removetoken parent path parentpath parent segment count segmentcount parent parent remove last segments removelastsegments parent path parentpath parent to string tostring i path ipath separator bin incl binincl parent path parentpath project exists parent bin incl binincl remove token removetoken parent path parentpath is selected isselected bin incl binincl lib name libname bin incl binincl add token addtoken lib name libname is selected isselected bin incl binincl lib name libname bin incl binincl remove token removetoken lib name libname core exception coreexception pde plugin pdeplugin log exception logexception add all jars to bin includes addalljarstobinincludes i build entry ibuildentry bin incl binincl i project iproject project i build model ibuildmodel model i resource iresource members project members members length members i folder ifolder nls members get file extension getfileextension equals nls jar bin incl binincl add token addtoken members get name getname i build entry ibuildentry libraries build util buildutil get build libraries getbuildlibraries model get build getbuild get build entries getbuildentries libraries length libraries length string library name libraryname libraries get name getname substring i path ipath path project get file getfile library name libraryname get project relative path getprojectrelativepath path segment count segmentcount bin incl binincl library name libraryname bin incl binincl add token addtoken library name libraryname nls bin incl binincl remove token removetoken jar core exception coreexception pde plugin pdeplugin log exception logexception set output entry tokens setoutputentrytokens string output folders outputfolders i build entry ibuildentry output entry outputentry iterator string iter output folders outputfolders iterator iter has next hasnext string output folder outputfolder iter to string tostring nls output folder outputfolder ends with endswith nls i path ipath separator output folder outputfolder output folder outputfolder concat nls nls i path ipath separator output entry outputentry output folder outputfolder to string tostring output entry outputentry add token addtoken output folder outputfolder to string tostring core exception coreexception pde plugin pdeplugin log exception logexception i package fragment root ipackagefragmentroot compute source folders computesourcefolders array list arraylist i package fragment root ipackagefragmentroot folders array list arraylist i build model ibuildmodel build model buildmodel get build model getbuildmodel i project iproject project build model buildmodel get underlying resource getunderlyingresource get project getproject project has nature hasnature java core javacore nature i java project ijavaproject j project jproject java core javacore create project i package fragment root ipackagefragmentroot roots j project jproject get package fragment roots getpackagefragmentroots roots length roots get kind getkind i package fragment root ipackagefragmentroot source folders add roots java model exception javamodelexception pde plugin pdeplugin log exception logexception core exception coreexception pde plugin pdeplugin log exception logexception folders to array toarray i package fragment root ipackagefragmentroot folders size override create client createclient form toolkit formtoolkit toolkit composite container toolkit create composite createcomposite container set layout setlayout form layout factory formlayoutfactory create section client grid layout createsectionclientgridlayout create left section createleftsection container toolkit create right section createrightsection container toolkit toolkit paint b orders for paintbordersfor container set layout setlayout form layout factory formlayoutfactory create clear grid layout createcleargridlayout grid data griddata data grid data griddata grid data griddata fill horizontal data horizontal span horizontalspan set layout data setlayoutdata data set client setclient container create left section createleftsection composite parent form toolkit formtoolkit toolkit composite container create container createcontainer parent toolkit f library part flibrarypart part adapter partadapter string pde ui messages pdeuimessages build editor buildeditor runtime info section runtimeinfosection add library addlibrary pde ui messages pdeuimessages manifest editor manifesteditor library section librarysection pde ui messages pdeuimessages manifest editor manifesteditor library section librarysection f library part flibrarypart create control createcontrol container swt full selection toolkit f library viewer flibraryviewer table viewer tableviewer f library part flibrarypart get viewer getviewer f library viewer flibraryviewer set content provider setcontentprovider library content provider librarycontentprovider f library viewer flibraryviewer set label provider setlabelprovider library label provider librarylabelprovider f library part flibrarypart set button enabled setbuttonenabled undex f library part flibrarypart set button enabled setbuttonenabled f library viewer flibraryviewer set input setinput get build model getbuildmodel toolkit paint b orders for paintbordersfor container nls menu manager menumanager menu mgr menumgr menu manager menumanager popup menu popupmenu menu mgr menumgr set remove all when shown setremoveallwhenshown menu mgr menumgr add menu listener addmenulistener i menu listener imenulistener override menu about to show menuabouttoshow i menu manager imenumanager manager fill library context menu filllibrarycontextmenu manager f library viewer flibraryviewer get control getcontrol set menu setmenu menu mgr menumgr create context menu createcontextmenu f library viewer flibraryviewer get control getcontrol create right section createrightsection composite parent form toolkit formtoolkit toolkit composite container create container createcontainer parent toolkit f folder part ffolderpart part adapter partadapter string pde ui messages pdeuimessages build editor buildeditor runtime info section runtimeinfosection add folder addfolder override selection changed selectionchanged i structured selection istructuredselection selection folder selection f folder part ffolderpart create control createcontrol container swt full selection toolkit f folder viewer ffolderviewer table viewer tableviewer f folder part ffolderpart get viewer getviewer f folder viewer ffolderviewer set content provider setcontentprovider folder content provider foldercontentprovider f folder viewer ffolderviewer set label provider setlabelprovider folder label provider folderlabelprovider toolkit paint b orders for paintbordersfor container nls menu manager menumanager menu mgr menumgr menu manager menumanager popup menu popupmenu menu mgr menumgr set remove all when shown setremoveallwhenshown menu mgr menumgr add menu listener addmenulistener i menu listener imenulistener override menu about to show menuabouttoshow i menu manager imenumanager manager fill folder viewer context menu fillfolderviewercontextmenu manager f folder viewer ffolderviewer get control getcontrol set menu setmenu menu mgr menumgr create context menu createcontextmenu f folder viewer ffolderviewer get control getcontrol composite create container createcontainer composite parent form toolkit formtoolkit toolkit composite container toolkit create composite createcomposite parent container set layout setlayout form layout factory formlayoutfactory create section client grid layout createsectionclientgridlayout grid data griddata grid data griddata grid data griddata fill width hint widthhint container set layout data setlayoutdata container fill folder viewer context menu fillfolderviewercontextmenu i menu manager imenumanager manager i selection iselection selection f folder viewer ffolderviewer get selection getselection i selection iselection lib selection libselection f library viewer flibraryviewer get selection getselection lib selection libselection lib selection libselection is empty isempty action new action newaction action pde ui messages pdeuimessages build editor buildeditor runtime info section runtimeinfosection popup folder popupfolder override handle new folder handlenewfolder new action newaction set enabled setenabled f enabled fenabled manager add new action newaction manager add separator action replace action pde ui messages pdeuimessages runtime info section runtimeinfosection replace override handle rename folder handlerenamefolder i structured selection istructuredselection selection get first element getfirstelement to string tostring replace set enabled setenabled selection is empty isempty f enabled fenabled manager add replace action delete action deleteaction action pde ui messages pdeuimessages actions delete label override handle delete folder handledeletefolder delete action deleteaction set enabled setenabled selection is empty isempty f enabled fenabled manager add delete action deleteaction def ect defect get page getpage getpdeeditor get contributor getcontributor context menu about to show contextmenuabouttoshow manager fill library context menu filllibrarycontextmenu i menu manager imenumanager manager i selection iselection selection f library viewer flibraryviewer get selection getselection action new action newaction action pde ui messages pdeuimessages build editor buildeditor runtime info section runtimeinfosection popup add popupadd override handle new handlenew new action newaction set enabled setenabled f enabled fenabled manager add new action newaction manager add separator i action iaction rename action renameaction action pde ui messages pdeuimessages editable table part editabletablepart rename action renameaction override do rename dorename rename action renameaction set enabled setenabled selection is empty isempty f enabled fenabled manager add rename action renameaction action delete action deleteaction action pde ui messages pdeuimessages actions delete label override handle delete handledelete delete action deleteaction set enabled setenabled selection is empty isempty f enabled fenabled manager add delete action deleteaction get page getpage getpdeeditor get contributor getcontributor context menu about to show contextmenuabouttoshow manager entry modified entrymodified i build entry ibuildentry old entry oldentry string new value newvalue i build entry ibuildentry entry old entry oldentry i build model ibuildmodel build model buildmodel get build model getbuildmodel i build ibuild build build model buildmodel get build getbuild string old name oldname entry get name getname substring new value newvalue equals entry get name getname new value newvalue starts with startswith i build entry ibuildentry jar prefix new value newvalue i build entry ibuildentry jar prefix new value newvalue nls new value newvalue ends with endswith jar nls new value newvalue ends with endswith nls new value newvalue equals nls i build entry ibuildentry jar prefix nls nls new value newvalue nls string new name newname new value newvalue substring jars compile order i build entry ibuildentry temp entry tempentry build get entry getentry property jar order temp entry tempentry temp entry tempentry old name oldname temp entry tempentry rename token renametoken old name oldname new name newname output source folder jar temp entry tempentry build get entry getentry property output prefix old name oldname temp entry tempentry temp entry tempentry set name setname property output prefix new name newname bin includes temp entry tempentry build get entry getentry property bin includes temp entry tempentry temp entry tempentry old name oldname temp entry tempentry rename token renametoken old name oldname new name newname bin excludes temp entry tempentry build get entry getentry property bin excludes temp entry tempentry temp entry tempentry old name oldname temp entry tempentry rename token renametoken old name oldname new name newname rename entry set name setname new value newvalue core exception coreexception pde plugin pdeplugin log exception logexception enable section enablesection enable f enabled fenabled enable f library part flibrarypart set button enabled setbuttonenabled enable update direct ional buttons updatedirectionalbuttons f folder part ffolderpart set button enabled setbuttonenabled enable f library viewer flibraryviewer get selection getselection is empty isempty override do global action doglobalaction string action id actionid action id actionid equals action factory actionfactory delete get id getid f enabled fenabled f library viewer flibraryviewer get control getcontrol is focus control isfocuscontrol handle delete handledelete f enabled fenabled handle delete folder handledeletefolder do rename dorename i structured selection istructuredselection selection i structured selection istructuredselection f library viewer flibraryviewer get selection getselection selection size i build entry ibuildentry entry i build entry ibuildentry selection get first element getfirstelement string old name oldname entry get name getname substring rename dialog renamedialog dialog rename dialog renamedialog f library viewer flibraryviewer get control getcontrol get shell getshell get library names getlibrarynames old name oldname dialog set input validator setinputvalidator i input validator iinputvalidator override string is valid isvalid string new text newtext new text newtext index of indexof pde ui messages pdeuimessages add library dialog addlibrarydialog nospaces dialog create dialog set title settitle pde ui messages pdeuimessages runtime info section runtimeinfosection rename dialog get shell getshell set size setsize dialog open window entry modified entrymodified entry dialog get new name getnewname override dispose i build model ibuildmodel build model buildmodel get build model getbuildmodel build model buildmodel build model buildmodel remove model changed listener removemodelchangedlistener dispose refresh output keys refreshoutputkeys is java project isjavaproject i build entry ibuildentry build entry buildentry get library selection getlibraryselection build entry buildentry string output folders outputfolders hash set hashset string jar folders jarfolders build entry buildentry get tokens gettokens i package fragment root ipackagefragmentroot source folders sourcefolders compute source folders computesourcefolders jar folders jarfolders length i package fragment root ipackagefragmentroot source folder sourcefolder get source folder getsourcefolder jar folders jarfolders source folders sourcefolders source folder sourcefolder i classpath entry iclasspathentry entry source folder sourcefolder get raw classpath entry getrawclasspathentry i path ipath output path outputpath entry get output location getoutputlocation output path outputpath nls output folders outputfolders add nls bin output path outputpath output path outputpath remove first segments removefirstsegments output folders outputfolders add output path outputpath to string tostring java model exception javamodelexception pde plugin pdeplugin log exception logexception output folders outputfolders size string lib name libname build entry buildentry get name getname substring i build model ibuildmodel build model buildmodel get build model getbuildmodel i build ibuild build build model buildmodel get build getbuild string output name outputname property output prefix lib name libname i build entry ibuildentry output entry outputentry build get entry getentry output name outputname output entry outputentry output entry outputentry build model buildmodel get factory getfactory create entry createentry output name outputname build add output entry outputentry core exception coreexception pde plugin pdeplugin log exception logexception set output entry tokens setoutputentrytokens output folders outputfolders output entry outputentry is java project isjavaproject i build model ibuildmodel build model buildmodel get build model getbuildmodel i project iproject project build model buildmodel get underlying resource getunderlyingresource get project getproject project has nature hasnature java core javacore nature core exception coreexception is read only isreadonly i build model ibuildmodel model get build model getbuildmodel model i editable ieditable i editable ieditable model is editable iseditable update i build entry ibuildentry variable f folder viewer ffolderviewer get input getinput variable f folder viewer ffolderviewer get table gettable get selection index getselectionindex f folder viewer ffolderviewer set input setinput variable count f folder viewer ffolderviewer get table gettable get item count getitemcount count count f folder viewer ffolderviewer get table gettable select f folder part ffolderpart set button enabled setbuttonenabled is read only isreadonly f enabled fenabled variable update direct ional buttons updatedirectionalbuttons table table f library viewer flibraryviewer get table gettable has selection hasselection table get selection getselection length f library part flibrarypart set button enabled setbuttonenabled undex f enabled fenabled has selection hasselection table get selection index getselectionindex f library part flibrarypart set button enabled setbuttonenabled f enabled fenabled has selection hasselection table get selection index getselectionindex table get item count getitemcount string get library names getlibrarynames string lib names libnames string f library viewer flibraryviewer get table gettable get item count getitemcount lib names libnames length lib names libnames f library viewer flibraryviewer get table gettable get item getitem get text gettext lib names libnames handle new handlenew string lib names libnames get library names getlibrarynames i base model ibasemodel pmodel get page getpage get model getmodel i plugin model base ipluginmodelbase plugin model base pluginmodelbase pmodel i plugin model base ipluginmodelbase i plugin model base ipluginmodelbase pmodel busy indicator busyindicator show while showwhile f library viewer flibraryviewer get table gettable get display getdisplay runnable override i build model ibuildmodel build model buildmodel get build model getbuildmodel i build ibuild build build model buildmodel get build getbuild add library dialog addlibrarydialog dialog add library dialog addlibrarydialog get section getsection get shell getshell lib names libnames plugin model base pluginmodelbase dialog create dialog get shell getshell set text settext pde ui messages pdeuimessages runtime info section runtimeinfosection add entry addentry dialog open window string dialog get new name getnewname nls ends with endswith jar nls equals nls ends with endswith nls string key name keyname key name keyname starts with startswith i build entry ibuildentry jar prefix key name keyname i build entry ibuildentry jar prefix starts with startswith i build entry ibuildentry jar prefix substring nls ends with endswith handle lib in bin build handlelibinbinbuild add library jars compile order i build entry ibuildentry jar order entry jarorderentry build get entry getentry property jar order num lib numlib f library viewer flibraryviewer get table gettable get item count getitemcount jar order entry jarorderentry jar order entry jarorderentry get build model getbuildmodel get factory getfactory create entry createentry property jar order add runtime libraries compile order num lib numlib string lib i build entry ibuildentry f library viewer flibraryviewer get element at getelementat get name getname substring jar order entry jarorderentry add token addtoken lib jar order entry jarorderentry add token addtoken build add jar order entry jarorderentry jar order entry jarorderentry get tokens gettokens length num lib numlib remove add runtime libraries compile order string tokens jar order entry jarorderentry get tokens gettokens tokens length jar order entry jarorderentry remove token removetoken tokens num lib numlib string lib i build entry ibuildentry f library viewer flibraryviewer get element at getelementat get name getname substring jar order entry jarorderentry add token addtoken lib jar order entry jarorderentry add token addtoken jar order entry jarorderentry add token addtoken jars compile order add ition addition i build entry ibuildentry library build model buildmodel get factory getfactory create entry createentry key name keyname build add library core exception coreexception pde plugin pdeplugin log exception logexception i package fragment root ipackagefragmentroot get source folder getsourcefolder string folder name foldername i package fragment root ipackagefragmentroot source folders sourcefolders source folders sourcefolders length source folders sourcefolders get path getpath remove first segments removefirstsegments equals path folder name foldername source folders sourcefolders handle delete handledelete f library viewer flibraryviewer get table gettable get selection index getselectionindex string lib name libname f library viewer flibraryviewer get table gettable get item getitem get text gettext i build ibuild build get build model getbuildmodel get build getbuild jars compile order i build entry ibuildentry entry build get entry getentry property jar order num lib numlib f library viewer flibraryviewer get table gettable get item count getitemcount entry entry get build model getbuildmodel get factory getfactory create entry createentry property jar order add runtime libraries compile order num lib numlib string lib i build entry ibuildentry f library viewer flibraryviewer get element at getelementat get name getname substring entry add token addtoken lib build add entry entry get tokens gettokens length num lib numlib remove add runtime libraries compile order string tokens entry get tokens gettokens tokens length entry remove token removetoken tokens num lib numlib object element f library viewer flibraryviewer get element at getelementat element string lib i build entry ibuildentry element get name getname substring entry add token addtoken lib entry remove token removetoken lib name libname output source folder jar entry build get entry getentry property output prefix lib name libname entry build remove entry bin includes entry build get entry getentry property bin includes entry entry lib name libname entry remove token removetoken lib name libname bin excludes entry build get entry getentry property bin excludes entry entry lib name libname entry remove token removetoken lib name libname string entry name entryname i build entry ibuildentry jar prefix lib name libname entry build get entry getentry entry name entryname entry build remove entry core exception coreexception pde plugin pdeplugin log exception logexception handle delete folder handledeletefolder object object i structured selection istructuredselection f folder viewer ffolderviewer get selection getselection get first element getfirstelement object i build entry ibuildentry entry get library selection getlibraryselection entry entry remove token removetoken string object core exception coreexception pde plugin pdeplugin log exception logexception i folder ifolder open select folder dialog openselectfolderdialog i build entry ibuildentry entry string title string message i file ifile file i file ifile get build model getbuildmodel get underlying resource getunderlyingresource i project iproject project file get project getproject folder selection dialog folderselectiondialog dialog folder selection dialog folderselectiondialog pde plugin pdeplugin get active workbench shell getactiveworkbenchshell workbench label provider workbenchlabelprovider jars new content provider jarsnewcontentprovider dialog set input setinput project get workspace getworkspace dialog add filter addfilter viewer filter viewerfilter override select viewer viewer object parent element parentelement object element element i project iproject i project iproject element equals project element i folder ifolder dialog set allow multiple setallowmultiple dialog set title settitle title dialog set message setmessage message dialog set validator setvalidator i selection status validator iselectionstatusvalidator override i status istatus validate object selection string pde plugin pdeplugin get plugin id getpluginid selection selection length selection i folder ifolder nls status nls i status istatus error nls nls i status istatus error nls nls string folder path folderpath i folder ifolder selection get project relative path getprojectrelativepath add trailing separator addtrailingseparator to string tostring entry entry folder path folderpath status i status istatus error i status istatus error pde ui messages pdeuimessages build editor buildeditor runtime info section runtimeinfosection duplicate folder duplicatefolder nls status nls i status istatus nls nls i status istatus nls nls dialog open window i folder ifolder dialog get first result getfirstresult handle new folder handlenewfolder i build entry ibuildentry entry get library selection getlibraryselection i folder ifolder folder open select folder dialog openselectfolderdialog entry pde ui messages pdeuimessages manifest editor manifesteditor jars section jarssection dialog title dialogtitle pde ui messages pdeuimessages manifest editor manifesteditor jars section jarssection dialog message dialogmessage folder string folder path folderpath folder get project relative path getprojectrelativepath add trailing separator addtrailingseparator to string tostring entry add token addtoken folder path folderpath refresh output keys refreshoutputkeys core exception coreexception pde plugin pdeplugin log exception logexception handle rename folder handlerenamefolder string old name oldname i build entry ibuildentry entry get library selection getlibraryselection i folder ifolder folder open select folder dialog openselectfolderdialog entry pde ui messages pdeuimessages runtime info section runtimeinfosection replaced ialog replacedialog pde ui messages pdeuimessages manifest editor manifesteditor jars section jarssection dialog message dialogmessage folder string new folder newfolder folder get project relative path getprojectrelativepath add trailing separator addtrailingseparator to string tostring entry rename token renametoken old name oldname new folder newfolder refresh output keys refreshoutputkeys core exception coreexception pde plugin pdeplugin log exception logexception update jars compile order updatejarscompileorder direction f library viewer flibraryviewer get table gettable get selection index getselectionindex string library i build entry ibuildentry f library viewer flibraryviewer get element at getelementat get name getname substring string library i build entry ibuildentry f library viewer flibraryviewer get element at getelementat direction get name getname substring i build model ibuildmodel model get build model getbuildmodel i build ibuild build model get build getbuild i build entry ibuildentry jar order entry jarorderentry build get entry getentry property jar order jar order entry jarorderentry jar order entry jarorderentry model get factory getfactory create entry createentry property jar order build add jar order entry jarorderentry string tokens jar order entry jarorderentry get tokens gettokens tokens length jar order entry jarorderentry remove token removetoken tokens num lib numlib f library viewer flibraryviewer get table gettable get item count getitemcount string names string num lib numlib num lib numlib string i build entry ibuildentry f library viewer flibraryviewer get element at getelementat get name getname substring equals library library equals library library names num lib numlib jar order entry jarorderentry add token addtoken names core exception coreexception pde plugin pdeplugin log exception logexception override model changed modelchanged i model changed event imodelchangedevent event event get change type getchangetype i model changed event imodelchangedevent changed mark stale markstale object change object changeobject event get changed objects getchangedobjects string key name keyname event get changed property getchangedproperty check model change applies change object changeobject i build entry ibuildentry i build entry ibuildentry entry i build entry ibuildentry change object changeobject string entry name entryname entry get name getname entry name entryname starts with startswith i build entry ibuildentry jar prefix entry name entryname equals property jar order entry name entryname equals property bin includes entry name entryname equals property bin includes type event get change type getchangetype account key entry get name getname starts with startswith property source prefix i structured selection istructuredselection new sel newsel type i model changed event imodelchangedevent insert f library viewer flibraryviewer add entry new sel newsel structured selection structuredselection entry type i model changed event imodelchangedevent remove f library viewer flibraryviewer get table gettable get selection index getselectionindex f library viewer flibraryviewer remove entry table table f library viewer flibraryviewer get table gettable item count itemcount table get item count getitemcount item count itemcount item count itemcount item count itemcount new sel newsel structured selection structuredselection table get item getitem get data getdata key name keyname key name keyname starts with startswith i build entry ibuildentry jar prefix modification source lib name libname jar event get old value getoldvalue event get new value getnewvalue renaming token f library viewer flibraryviewer update entry new sel newsel structured selection structuredselection entry f library viewer flibraryviewer set selection setselection new sel newsel key name keyname key name keyname equals property jar order account change jars compile order event get new value getnewvalue event get old value getoldvalue removing token jars compile order event get old value getoldvalue event get new value getnewvalue renaming token jars compile order f library viewer flibraryviewer refresh update direct ional buttons updatedirectionalbuttons i build entry ibuildentry get library selection getlibraryselection i structured selection istructuredselection selection i structured selection istructuredselection f library viewer flibraryviewer get selection getselection i build entry ibuildentry selection get first element getfirstelement