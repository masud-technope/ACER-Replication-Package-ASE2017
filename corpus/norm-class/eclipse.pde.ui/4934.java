copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal editor build org eclipse core resources org eclipse core runtime org eclipse jface action org eclipse jface viewers org eclipse jface window window org eclipse pde core i model changed event imodelchangedevent org eclipse pde core build org eclipse pde core plugin i plugin model base ipluginmodelbase org eclipse pde core plugin plugin registry pluginregistry org eclipse pde internal build i build properties constants ibuildpropertiesconstants org eclipse pde internal core natures pde org eclipse pde internal pde plugin pdeplugin org eclipse pde internal pde ui messages pdeuimessages org eclipse pde internal editor org eclipse pde internal editor context input context inputcontext org eclipse pde internal elements default content provider defaultcontentprovider org eclipse pde internal parts editable table part editabletablepart org eclipse swt swt org eclipse swt graphics image org eclipse swt layout grid data griddata org eclipse swt widgets composite org eclipse swt widgets table org eclipse i shared images isharedimages org eclipse platformui org eclipse actions action factory actionfactory org eclipse dialogs element tree selection dialog elementtreeselectiondialog org eclipse dialogs i selection status validator iselectionstatusvalidator org eclipse forms widgets org eclipse model workbench content provider workbenchcontentprovider org eclipse model workbench label provider workbenchlabelprovider org eclipse views navigator resource comparator resourcecomparator build classpath section buildclasspathsection table section tablesection table viewer tableviewer f table viewer ftableviewer f enabled fenabled implementation code i selection validator iselectionvalidator code validate type element empty select ions selections accepted element selection validator elementselectionvalidator i selection status validator iselectionstatusvalidator f accepted types facceptedtypes f allow multiple selection fallowmultipleselection param accepted types acceptedtypes types accepted validator param allow multiple selection allowmultipleselection code code validator multiple selection element selection validator elementselectionvalidator accepted types acceptedtypes allow multiple selection allowmultipleselection is not null isnotnull accepted types acceptedtypes f accepted types facceptedtypes accepted types acceptedtypes f allow multiple selection fallowmultipleselection allow multiple selection allowmultipleselection org eclipse dialogs i selection validator iselectionvalidator is valid isvalid java lang object override i status istatus validate object elements is valid isvalid elements nls status nls i status istatus nls pde plugin pdeplugin get plugin id getpluginid nls i status istatus nls nls status nls i status istatus error nls pde plugin pdeplugin get plugin id getpluginid nls i status istatus error nls is of accepted type isofacceptedtype object f accepted types facceptedtypes length f accepted types facceptedtypes is instance isinstance is valid isvalid object selection selection length f allow multiple selection fallowmultipleselection selection length selection length object selection is of accepted type isofacceptedtype table content provider tablecontentprovider default content provider defaultcontentprovider i structured content provider istructuredcontentprovider override object get elements getelements object parent parent i build model ibuildmodel i build ibuild build i build model ibuildmodel parent get build getbuild i build entry ibuildentry entry build get entry getentry i build properties constants ibuildpropertiesconstants property jar extra classpath entry entry get tokens gettokens object table label provider tablelabelprovider label provider labelprovider i table label provider itablelabelprovider override string get column text getcolumntext object obj obj to string tostring override image get column image getcolumnimage object obj i shared images isharedimages shared images sharedimages platformui get workbench getworkbench get shared images getsharedimages shared images sharedimages get image getimage i shared images isharedimages img obj file build classpath section buildclasspathsection pde form page pdeformpage composite parent parent description expandable composite expandablecomposite twistie string pde ui messages pdeuimessages build editor buildeditor classpath section classpathsection add pde ui messages pdeuimessages build editor buildeditor classpath section classpathsection remove get section getsection set text settext pde ui messages pdeuimessages build editor buildeditor classpath section classpathsection title get section getsection set description setdescription pde ui messages pdeuimessages build editor buildeditor classpath section classpathsection desc initialize i build model ibuildmodel get build model getbuildmodel input context inputcontext context get page getpage getpdeeditor get context manager getcontextmanager find context findcontext build input context buildinputcontext context context i build model ibuildmodel context get model getmodel initialize get build model getbuildmodel add model changed listener addmodelchangedlistener i build entry ibuildentry entry get build model getbuildmodel get build getbuild get entry getentry i build properties constants ibuildpropertiesconstants property jar extra classpath get section getsection set expanded setexpanded entry entry get tokens gettokens length override create client createclient form toolkit formtoolkit toolkit composite container create client container createclientcontainer toolkit create viewer part control createviewerpartcontrol container swt full selection toolkit editable table part editabletablepart table part tablepart get table part gettablepart table part tablepart set editable seteditable f table viewer ftableviewer table part tablepart get table viewer gettableviewer f table viewer ftableviewer set content provider setcontentprovider table content provider tablecontentprovider f table viewer ftableviewer set label provider setlabelprovider table label provider tablelabelprovider f table viewer ftableviewer set input setinput get build model getbuildmodel toolkit paint b orders for paintbordersfor container enable section enablesection set layout setlayout form layout factory formlayoutfactory create clear grid layout createcleargridlayout grid data griddata data grid data griddata grid data griddata fill horizontal set layout data setlayoutdata data data horizontal span horizontalspan set client setclient container override fill context menu fillcontextmenu i menu manager imenumanager manager i selection iselection selection f table viewer ftableviewer get selection getselection add action action action action pde ui messages pdeuimessages build editor buildeditor classpath section classpathsection add override handle new handlenew action set enabled setenabled f enabled fenabled manager add action manager add separator add delete action action action pde ui messages pdeuimessages build editor buildeditor classpath section classpathsection remove override handle delete handledelete action set enabled setenabled selection is empty isempty f enabled fenabled manager add action get page getpage getpdeeditor get contributor getcontributor context menu about to show contextmenuabouttoshow manager override dispose i build model ibuildmodel model get build model getbuildmodel model model remove model changed listener removemodelchangedlistener dispose override refresh f table viewer ftableviewer refresh override do global action doglobalaction string action id actionid action id actionid equals action factory actionfactory delete get id getid f enabled fenabled handle delete handledelete enable section enablesection enable f enabled fenabled enable editable table part editabletablepart table part tablepart get table part gettablepart table part tablepart set button enabled setbuttonenabled enable f table viewer ftableviewer get selection getselection is empty isempty table part tablepart set button enabled setbuttonenabled enable override selection changed selectionchanged i structured selection istructuredselection selection get page getpage getpdeeditor set selection setselection selection get table part gettablepart set button enabled setbuttonenabled selection selection size f enabled fenabled handle delete handledelete object selection i structured selection istructuredselection f table viewer ftableviewer get selection getselection get first element getfirstelement selection selection string i build ibuild build get build model getbuildmodel get build getbuild i build entry ibuildentry entry build get entry getentry i build properties constants ibuildpropertiesconstants property jar extra classpath entry entry remove token removetoken selection to string tostring string tokens entry get tokens gettokens tokens length build remove entry core exception coreexception pde plugin pdeplugin log exception logexception initialize dialog settings initializedialogsettings element tree selection dialog elementtreeselectiondialog dialog accepted classes acceptedclasses i file ifile dialog set validator setvalidator element selection validator elementselectionvalidator accepted classes acceptedclasses dialog set title settitle pde ui messages pdeuimessages build editor buildeditor classpath section classpathsection jars title jarstitle dialog set message setmessage pde ui messages pdeuimessages build editor buildeditor classpath section classpathsection jars desc jarsdesc dialog add filter addfilter jar file filter jarfilefilter dialog add filter addfilter viewer filter viewerfilter override select viewer viewer object parent element parentelement object element element i project iproject i project iproject element has nature hasnature pde plugin nature core exception coreexception element i resource iresource i build model ibuildmodel model get build model getbuildmodel i build entry ibuildentry entry model get build getbuild get entry getentry i build properties constants ibuildpropertiesconstants property jar extra classpath entry entry get relative path token name getrelativepathtokenname i resource iresource element dialog set input setinput pde plugin pdeplugin get workspace getworkspace get root getroot dialog set comparator setcomparator resource comparator resourcecomparator resource comparator resourcecomparator dialog set initial selection setinitialselection get build model getbuildmodel get underlying resource getunderlyingresource get project getproject handle new handlenew element tree selection dialog elementtreeselectiondialog dialog element tree selection dialog elementtreeselectiondialog get section getsection get shell getshell workbench label provider workbenchlabelprovider workbench content provider workbenchcontentprovider initialize dialog settings initializedialogsettings dialog dialog open window object elements dialog get result getresult elements length i resource iresource elem i resource iresource elements string token name tokenname get relative path token name getrelativepathtokenname elem token name tokenname add classpath token addclasspathtoken token name tokenname add classpath token addclasspathtoken string token name tokenname i build model ibuildmodel model get build model getbuildmodel i build entry ibuildentry entry model get build getbuild get entry getentry i build properties constants ibuildpropertiesconstants property jar extra classpath entry entry model get factory getfactory create entry createentry i build properties constants ibuildpropertiesconstants property jar extra classpath model get build getbuild add entry entry token name tokenname entry add token addtoken token name tokenname core exception coreexception pde plugin pdeplugin log exception logexception string get relative path token name getrelativepathtokenname i resource iresource elem i project iproject this project thisproject get build model getbuildmodel get underlying resource getunderlyingresource get project getproject i project iproject elem project elemproject elem get project getproject string project relative projectrelative elem get project relative path getprojectrelativepath to string tostring this project thisproject elem project elemproject project relative projectrelative i plugin model base ipluginmodelbase model plugin registry pluginregistry find model findmodel elem project elemproject model nls platform plugin model get plugin base getpluginbase get id getid project relative projectrelative override button selected buttonselected handle new handlenew handle delete handledelete override model changed modelchanged i model changed event imodelchangedevent event event get change type getchangetype i model changed event imodelchangedevent changed mark stale markstale event get change type getchangetype i model changed event imodelchangedevent change object change object changeobject event get changed objects getchangedobjects change object changeobject i build entry ibuildentry i build entry ibuildentry change object changeobject get name getname equals i build entry ibuildentry jars extra classpath table table f table viewer ftableviewer get table gettable table get selection index getselectionindex f table viewer ftableviewer refresh count table get item count getitemcount count event get old value getoldvalue count count f table viewer ftableviewer set selection setselection f table viewer ftableviewer set selection setselection structured selection structuredselection table get item getitem get data getdata table set focus setfocus