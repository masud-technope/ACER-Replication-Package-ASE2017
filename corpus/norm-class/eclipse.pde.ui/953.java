copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal editor java java util array list arraylist org eclipse core file system filesystem efs org eclipse core file system filesystem i file store ifilestore org eclipse core resources org eclipse core runtime org eclipse jface action org eclipse jface dialogs i dialog settings idialogsettings org eclipse jface text i document idocument org eclipse jface text i text selection itextselection org eclipse jface text source i annotation model iannotationmodel org eclipse jface viewers org eclipse pde core i base model ibasemodel org eclipse pde core i writable iwritable org eclipse pde internal core i workspace model iworkspacemodel org eclipse pde internal core plugin i writable delimiter iwritabledelimiter org eclipse pde internal core util xml component registry xmlcomponentregistry org eclipse pde internal org eclipse pde internal editor context org eclipse pde internal editor plugin missing resource page missingresourcepage org eclipse pde internal editor plugin overview page overviewpage org eclipse pde internal util pde model utility pdemodelutility org eclipse search text i search editor access isearcheditoraccess org eclipse search text match org eclipse swt custom c tab folder ctabfolder org eclipse swt dnd org eclipse swt widgets display org eclipse swt widgets menu org eclipse org eclipse actions action factory actionfactory org eclipse forms i managed form imanagedform org eclipse forms editor form editor formeditor org eclipse forms editor i form page iformpage org eclipse forms widgets form toolkit formtoolkit org eclipse ide org eclipse multi page editor part multipageeditorpart org eclipse multi page editor site multipageeditorsite org eclipse views content outline contentoutline i content outline page icontentoutlinepage simple multi form editor eclipse for ms forms support plug configured create instance form colors shared multiple editor instances pde form editor pdeformeditor form editor formeditor i input context listener iinputcontextlistener i goto marker igotomarker i search editor access isearcheditoraccess updates outline page outlinepage selection pde form editor change listener pdeformeditorchangelistener i selection changed listener iselectionchangedlistener installs selection changed listener selection provider selection provider post selection provider post selection changed events preferred choice normal selection changed events requested param selection provider selectionprovider install i selection provider iselectionprovider selection provider selectionprovider selection provider selectionprovider selection provider selectionprovider i post selection provider ipostselectionprovider i post selection provider ipostselectionprovider provider i post selection provider ipostselectionprovider selection provider selectionprovider provider add post selection changed listener addpostselectionchangedlistener selection provider selectionprovider add selection changed listener addselectionchangedlistener org eclipse jface viewers i selection changed listener iselectionchangedlistener selection changed selectionchanged org eclipse jface viewers selection changed event selectionchangedevent override selection changed selectionchanged selection changed event selectionchangedevent event nls pde plugin pdeplugin get default getdefault get preference store getpreferencestore get boolean getboolean toggle link with editor action togglelinkwitheditoraction is checked ischecked get form outline getformoutline get form outline getformoutline set selection setselection event get selection getselection removes selection changed listener selection provider param selection providers tyle selectionproviderstyle uninstall i selection provider iselectionprovider selection provider selectionprovider selection provider selectionprovider selection provider selectionprovider i post selection provider ipostselectionprovider i post selection provider ipostselectionprovider provider i post selection provider ipostselectionprovider selection provider selectionprovider provider remove post selection changed listener removepostselectionchangedlistener selection provider selectionprovider remove selection changed listener removeselectionchangedlistener nls string dialog editor key pde form editor editor selection changed listener pde form editor change listener pdeformeditorchangelistener f editor selection changed listener feditorselectionchangedlistener clipboard clipboard menu f context menu fcontextmenu input context manager inputcontextmanager f input context manager finputcontextmanager i sort able content outline page isortablecontentoutlinepage f form outline fformoutline pde multi page content outline pdemultipagecontentoutline f content outline fcontentoutline string f last active page id flastactivepageid f last dirty state flastdirtystate f error ferror pde multi page editor site pdemultipageeditorsite multi page editor site multipageeditorsite pde multi page editor site pdemultipageeditorsite multi page editor part multipageeditorpart multi page editor multipageeditor i editor part ieditorpart editor multi page editor multipageeditor editor override i editor action bar contributor ieditoractionbarcontributor get action bar contributor getactionbarcontributor pde form editor pdeformeditor editor pde form editor pdeformeditor get multi page editor getmultipageeditor pde form editor contributor pdeformeditorcontributor contributor editor get contributor getcontributor contributor get source contributor getsourcecontributor override i workbench part iworkbenchpart get part getpart get multi page editor getmultipageeditor pde form editor pdeformeditor pde plugin pdeplugin get default getdefault get label provider getlabelprovider connect xml component registry xmlcomponentregistry instance connect f input context manager finputcontextmanager create input context manager createinputcontextmanager override nested site creation properly pass source editor contributor asked override i editor site ieditorsite create site createsite i editor part ieditorpart editor pde multi page editor site pdemultipageeditorsite editor i project iproject get common project getcommonproject f input context manager finputcontextmanager get common project getcommonproject i base model ibasemodel get aggregate model getaggregatemodel f input context manager finputcontextmanager f input context manager finputcontextmanager get aggregate model getaggregatemodel input context manager inputcontextmanager create input context manager createinputcontextmanager tests editor context test check add param context id contextid code code context code code has input context hasinputcontext string context id contextid f input context manager finputcontextmanager has context hascontext context id contextid input context manager inputcontextmanager get context manager getcontextmanager f input context manager finputcontextmanager create input contexts createinputcontexts input context manager inputcontextmanager context manager contextmanager i editor input ieditorinput input get editor input geteditorinput input i file editor input ifileeditorinput resource find project create resource contexts createresourcecontexts context manager contextmanager i file editor input ifileeditorinput input input i storage editor input istorageeditorinput create storage contexts createstoragecontexts context manager contextmanager i storage editor input istorageeditorinput input input i uri editor input iurieditorinput i uri editor input iurieditorinput uri editor input urieditorinput i uri editor input iurieditorinput input i file store ifilestore store efs get store getstore uri editor input urieditorinput geturi efs scheme file equals store get file system getfilesystem get scheme getscheme file store editor input filestoreeditorinput sinput file store editor input filestoreeditorinput store create system file contexts createsystemfilecontexts context manager contextmanager sinput core exception coreexception create resource contexts createresourcecontexts input context manager inputcontextmanager contexts i file editor input ifileeditorinput input create system file contexts createsystemfilecontexts input context manager inputcontextmanager contexts file store editor input filestoreeditorinput input create storage contexts createstoragecontexts input context manager inputcontextmanager contexts i storage editor input istorageeditorinput input override form toolkit formtoolkit create toolkit createtoolkit display display create toolkit shares colors editors form toolkit formtoolkit pde plugin pdeplugin get default getdefault get form colors getformcolors display subclassed don for get forget call override create pages createpages clipboard clipboard get container getcontainer get display getdisplay menu manager menumanager manager menu manager menumanager i menu listener imenulistener listener i menu listener imenulistener override menu about to show menuabouttoshow i menu manager imenumanager manager context menu about to show contextmenuabouttoshow manager manager set remove all when shown setremoveallwhenshown manager add menu listener addmenulistener listener f context menu fcontextmenu manager create context menu createcontextmenu get container getcontainer get container getcontainer set menu setmenu f context menu fcontextmenu create input contexts createinputcontexts f input context manager finputcontextmanager create pages createpages f input context manager finputcontextmanager add input context listener addinputcontextlistener string page to show pagetoshow compute initial page id computeinitialpageid page to show pagetoshow set active page setactivepage page to show pagetoshow update title updatetitle get page count getpagecount get container getcontainer c tab folder ctabfolder c tab folder ctabfolder get container getcontainer set tab height settabheight pde model utility pdemodelutility connect override page change pagechange new page index newpageindex page change pagechange new page index newpageindex i form page iformpage get active page instance getactivepageinstance update content outline updatecontentoutline f last active page id flastactivepageid get id getid override set focus setfocus set focus setfocus i form page iformpage get active page instance getactivepageinstance set active setactive handles switches focus events pde form page pdeformpage pde form page pdeformpage update form selection updateformselection clipboard get clipboard getclipboard clipboard context menu about to show contextmenuabouttoshow i menu manager imenumanager manager pde form editor contributor pdeformeditorcontributor contributor get contributor getcontributor i form page iformpage get active page instance getactivepageinstance pde form page pdeformpage pde form page pdeformpage context menu about to show contextmenuabouttoshow manager contributor contributor context menu about to show contextmenuabouttoshow manager pde form editor contributor pdeformeditorcontributor get contributor getcontributor pde form editor contributor pdeformeditorcontributor get editor site geteditorsite get action bar contributor getactionbarcontributor string compute initial page id computeinitialpageid string first page id firstpageid string stored first page id storedfirstpageid load default page loaddefaultpage stored first page id storedfirstpageid first page id firstpageid stored first page id storedfirstpageid stored source model valid string invalid context id invalidcontextid get first invalid context id getfirstinvalidcontextid invalid context id invalidcontextid invalid context id invalidcontextid first page id firstpageid string get first invalid context id getfirstinvalidcontextid input context inputcontext invalid contexts invalidcontexts f input context manager finputcontextmanager get invalid contexts getinvalidcontexts invalid contexts invalidcontexts length primary context invalid invalid contexts invalidcontexts length invalid contexts invalidcontexts is primary isprimary invalid contexts invalidcontexts get id getid invalid contexts invalidcontexts get id getid override string get title gettitle f input context manager finputcontextmanager get title gettitle input context inputcontext context f input context manager finputcontextmanager get primary context getprimarycontext context get title gettitle context get input getinput get name getname update title updatetitle fire property change firepropertychange i workbench part iworkbenchpart prop title string get title property gettitleproperty nls override do save dosave i progress monitor iprogressmonitor monitor commit pages commitpages f input context manager finputcontextmanager save monitor editor dirty state changed editordirtystatechanged do revert dorevert i form page iformpage form page formpage get active page instance getactivepageinstance values model form page formpage form page formpage pde form page pdeformpage form page formpage get managed form getmanagedform commit editor source revert reverting source f ires fires events form values updated reverted do revert source pages dorevertsourcepages causing update values reverted reverted do revert form page dorevertformpage fire dirty event reverted editor dirty state changed editordirtystatechanged do revert form page dorevertformpage reverted i base model ibasemodel model get aggregate model getaggregatemodel model i workspace model iworkspacemodel i workspace model iworkspacemodel workspace model workspacemodel i workspace model iworkspacemodel model workspace model workspacemodel reload reverted reverted do revert source pages dorevertsourcepages reverted i form page iformpage get pages getpages length pde source page pdesourcepage pde source page pdesourcepage source page sourcepage pde source page pdesourcepage flush pending editor operations document revert operation executes revert operation aborted current document changed form field modified source updated source operation performed source active cases source page sourcepage get input context getinputcontext flush editor input flusheditorinput revert source contents save file source page sourcepage do revert to saved doreverttosaved reverted reverted do revert dorevert i editor input ieditorinput input i form page iformpage current page currentpage get active page instance getactivepageinstance current page currentpage current page currentpage pde form page pdeformpage pde form page pdeformpage current page currentpage cancel edit canceledit input context inputcontext context f input context manager finputcontextmanager get context getcontext input i form page iformpage find page findpage context get id getid pde source page pdesourcepage pde source page pdesourcepage spage pde source page pdesourcepage spage do revert to saved doreverttosaved editor dirty state changed editordirtystatechanged flush edits flushedits i form page iformpage get pages getpages i managed form imanagedform m form mform get active page getactivepage get managed form getmanagedform m form mform m form mform commit length pde source page pdesourcepage pde source page pdesourcepage source page sourcepage pde source page pdesourcepage source page sourcepage get input context getinputcontext flush editor input flusheditorinput string get context for save as getcontextidforsaveas method perform save operations override do save as dosaveas context save operation performed string contextid get context for save as getcontextidforsaveas perform operation get context manager getcontextmanager save as saveas get progress monitor getprogressmonitor contextid editor input i editor input ieditorinput input get context manager getcontextmanager find context findcontext contextid get input getinput store editor input set input with notify setinputwithnotify input update title editor editor input set part name setpartname input get name getname fire property change fire property change firepropertychange prop dirty interrupted exception interruptedexception exception string title pde ui messages pdeuimessages pde form editor pdeformeditor error title problem save as errortitleproblemsaveas string message pde ui messages pdeuimessages pde form editor pdeformeditor error message save not completed errormessagesavenotcompleted get message getmessage message message get message getmessage pde plugin pdeplugin log exception logexception title message override is save as allowed issaveasallowed store default page storedefaultpage i editor input ieditorinput input get editor input geteditorinput string page id pageid f last active page id flastactivepageid page id pageid input i file editor input ifileeditorinput triggered opening file workspace explorer view set property editor page key setpropertyeditorpagekey i file editor input ifileeditorinput input page id pageid input i storage editor input istorageeditorinput triggered opening file workspace plug view set dialog editor page key setdialogeditorpagekey page id pageid param pageid set dialog editor page key setdialogeditorpagekey string pageid global setting files belonging editor type editor key storage editor input underlying file unique key dialog settings file grow control level granularity i dialog settings idialogsettings get settings section getsettingssection get editor d geteditorid pageid string get dialog editor page key getdialogeditorpagekey global setting files belonging editor type editor key storage editor input underlying file unique key dialog settings file grow control level granularity i dialog settings idialogsettings get settings section getsettingssection get editor d geteditorid string get editor d geteditorid set property editor page key setpropertyeditorpagekey i file editor input ifileeditorinput input string page id pageid file persist editor key property per sists persists editor closed i file ifile file input get file getfile editor persistent property file file set persistent property setpersistentproperty i pde ui constants ipdeuiconstants property editor key page id pageid core exception coreexception string load default page loaddefaultpage i editor input ieditorinput input get editor input geteditorinput input i file editor input ifileeditorinput explorer view get property editor page key getpropertyeditorpagekey i file editor input ifileeditorinput input input i storage editor input istorageeditorinput plug view get dialog editor page key getdialogeditorpagekey string get property editor page key getpropertyeditorpagekey i file editor input ifileeditorinput input file persist editor key property per sists persists editor closed i file ifile file input get file getfile persistent editor key file file get persistent property getpersistentproperty i pde ui constants ipdeuiconstants property editor key core exception coreexception override dispose store default page storedefaultpage f editor selection changed listener feditorselectionchangedlistener f editor selection changed listener feditorselectionchangedlistener uninstall get site getsite get selection provider getselectionprovider f editor selection changed listener feditorselectionchangedlistener set selection setselection structured selection structuredselection pde plugin pdeplugin get default getdefault get label provider getlabelprovider disconnect xml component registry xmlcomponentregistry instance disconnect pde model utility pdemodelutility disconnect clipboard clipboard dispose clipboard dispose f input context manager finputcontextmanager dispose f input context manager finputcontextmanager override is dirty isdirty f last dirty state flastdirtystate compute dirty state computedirtystate f last dirty state flastdirtystate compute dirty state computedirtystate i form page iformpage get active page instance getactivepageinstance is dirty isdirty f input context manager finputcontextmanager f input context manager finputcontextmanager is dirty isdirty is dirty isdirty get last dirty state getlastdirtystate f last dirty state flastdirtystate fire save needed firesaveneeded string context id contextid notify context id contextid input context inputcontext context f input context manager finputcontextmanager find context findcontext context id contextid context fire save needed firesaveneeded context get input getinput notify fire save needed firesaveneeded i editor input ieditorinput input notify notify editor dirty state changed editordirtystatechanged is dirty isdirty validate edit validateedit input override editor dirty state changed editordirtystatechanged editor dirty state changed editordirtystatechanged pde form editor contributor pdeformeditorcontributor contributor get contributor getcontributor contributor contributor update actions updateactions validate edit validateedit i editor input ieditorinput input input context inputcontext context f input context manager finputcontextmanager get context getcontext input context validate edit validateedit get site getsite get shell getshell get display getdisplay async exec asyncexec runnable override do revert dorevert context get input getinput context set valid ated setvalidated i dialog settings idialogsettings get settings section getsettingssection store global settings persist editor closed dialog settings cheating dialog settings i dialog settings idialogsettings root pde plugin pdeplugin get default getdefault get dialog settings getdialogsettings dialog reserved pde form editors i dialog settings idialogsettings root get section getsection dialog editor key defined define root add new section addnewsection dialog editor key override goto marker gotomarker i marker imarker marker i resource iresource resource marker get resource getresource input context inputcontext context f input context manager finputcontextmanager find context findcontext resource context i form page iformpage get active page instance getactivepageinstance context get id getid equals get id getid set active page setactivepage context get id getid ide goto marker gotomarker marker open to source page opentosourcepage object object offset length input context inputcontext context object input context inputcontext context input context inputcontext object context get input context getinputcontext object context pde source page pdesourcepage pde source page pdesourcepage set active page setactivepage context get id getid select and reveal selectandreveal offset length set selection setselection i selection iselection selection get site getsite get selection provider getselectionprovider set selection setselection selection get contributor getcontributor update select able actions updateselectableactions selection i selection iselection get selection getselection get site getsite get selection provider getselectionprovider get selection getselection override suppress warnings suppresswarnings unchecked get adapter getadapter key key equals i content outline page icontentoutlinepage get content outline getcontentoutline key equals i goto marker igotomarker key equals i search editor access isearcheditoraccess get adapter getadapter key menu get context menu getcontextmenu f context menu fcontextmenu pde multi page content outline pdemultipagecontentoutline get content outline getcontentoutline f content outline fcontentoutline f content outline fcontentoutline is disposed isdisposed f content outline fcontentoutline pde multi page content outline pdemultipagecontentoutline update content outline updatecontentoutline get active page instance getactivepageinstance f content outline fcontentoutline out line outline i sort able content outline page isortablecontentoutlinepage get form outline getformoutline f form outline fformoutline f form outline fformoutline create content outline createcontentoutline f form outline fformoutline f editor selection changed listener feditorselectionchangedlistener pde form editor change listener pdeformeditorchangelistener f editor selection changed listener feditorselectionchangedlistener install get site getsite get selection provider getselectionprovider f form outline fformoutline i sort able content outline page isortablecontentoutlinepage create content outline createcontentoutline update content outline updatecontentoutline i form page iformpage f content outline fcontentoutline i sort able content outline page isortablecontentoutlinepage out line outline pde source page pdesourcepage out line outline pde source page pdesourcepage get content outline getcontentoutline out line outline get form outline getformoutline out line outline out line outline form outline page formoutlinepage form outline page formoutlinepage out line outline refresh f content outline fcontentoutline set page active setpageactive out line outline override i form page iformpage set active page setactivepage string page id pageid i form page iformpage set active page setactivepage page id pageid update content outline updatecontentoutline i form page iformpage get pages getpages array list arraylist object form pages formpages array list arraylist size object i form page iformpage form pages formpages add form pages formpages to array toarray i form page iformpage form pages formpages size perform global action performglobalaction string preserve selection i selection iselection selection get selection getselection handled pde form page pdeformpage get active page instance getactivepageinstance perform global action performglobalaction handled i form page iformpage get active page instance getactivepageinstance pde form page pdeformpage equals action factory actionfactory undo get id getid f input context manager finputcontextmanager undo equals action factory actionfactory redo get id getid f input context manager finputcontextmanager redo equals action factory actionfactory cut get id getid equals action factory actionfactory copy get id getid copy to clipboard copytoclipboard selection copy to clipboard copytoclipboard i selection iselection selection object objects string text version textversion selection i structured selection istructuredselection i structured selection istructuredselection ssel i structured selection istructuredselection selection ssel size objects ssel to array toarray string writer stringwriter writer string writer stringwriter print writer printwriter pwriter print writer printwriter writer object obj class objclass objects length object obj objects obj class objclass obj class objclass obj get class getclass obj class objclass equals obj get class getclass obj i writable iwritable objects format text representation obj i writable delimiter iwritabledelimiter i writable delimiter iwritabledelimiter obj write delim eter writedelimeter pwriter nls i writable iwritable obj write nls nls pwriter obj string delimiter new line newline pwriter println string obj pwriter flush text version textversion writer to string tostring pwriter close writer close i o exception ioexception selection i text selection itextselection text version textversion i text selection itextselection selection get text gettext text version textversion text version textversion length objects clipboard contents object transfer objects object text version textversion transfer text transfer texttransfer get instance getinstance text version textversion text version textversion length object objects transfer model data transfer modeldatatransfer get instance getinstance object objects text version textversion transfer model data transfer modeldatatransfer get instance getinstance text transfer texttransfer get instance getinstance clipboard set contents setcontents can paste from clipboard canpastefromclipboard i form page iformpage get active page instance getactivepageinstance pde form page pdeformpage pde form page pdeformpage can paste canpaste get clipboard getclipboard can copy cancopy i selection iselection selection selection selection i structured selection istructuredselection selection is empty isempty selection i text selection itextselection i text selection itextselection text selection textselection i text selection itextselection selection text selection textselection get length getlength can cut cancut i selection iselection selection can copy cancopy selection update undo updateundo i action iaction undo action undoaction i action iaction redo action redoaction i model undo manager imodelundomanager undo manager undomanager f input context manager finputcontextmanager get undo manager getundomanager undo manager undomanager undo manager undomanager set actions setactions undo action undoaction redo action redoaction triggered toggling link editor button out line outline view synchronize outline page synchronizeoutlinepage current i form page iformpage get active page instance getactivepageinstance pde source page pdesourcepage synchronize current source pde source page pdesourcepage synchronize outline page synchronizeoutlinepage todo link editor functionality form get form outline getformoutline get form outline getformoutline set selection setselection get selection getselection override i document idocument get document getdocument match match input context inputcontext context get input context getinputcontext match get element getelement context context get document provider getdocumentprovider get document getdocument context get input getinput override i annotation model iannotationmodel get annotation model getannotationmodel match match input context inputcontext context get input context getinputcontext match get element getelement context context get document provider getdocumentprovider get annotation model getannotationmodel context get input getinput input context inputcontext get input context getinputcontext object object override add pages addpages f error ferror get aggregate model getaggregatemodel f error ferror add page addpage missing resource page missingresourcepage part init exception partinitexception pde plugin pdeplugin log exception logexception add editor pages addeditorpages add editor pages addeditorpages override context added contextadded input context inputcontext context f error ferror remove page removepage add pages addpages f error ferror set active page setactivepage overview page overviewpage editor context added editorcontextadded context editor context added editorcontextadded input context inputcontext context i progress monitor iprogressmonitor get progress monitor getprogressmonitor i progress monitor iprogressmonitor monitor i status line manager istatuslinemanager manager get status line manager getstatuslinemanager manager monitor manager get progress monitor getprogressmonitor monitor monitor null progress monitor nullprogressmonitor monitor i status line manager istatuslinemanager get status line manager getstatuslinemanager get editor site geteditorsite get action bars getactionbars get status line manager getstatuslinemanager contribute to toolbar contributetotoolbar i tool bar manager itoolbarmanager manager