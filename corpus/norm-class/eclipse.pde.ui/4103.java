copyright eclipse source eclipsesource rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors eclipse source eclipsesource initial api implementation ibm corporation ongoing enhancements org eclipse pde internal editor category java util org eclipse core runtime core exception coreexception org eclipse jface action action org eclipse jface action i menu manager imenumanager org eclipse jface viewers org eclipse jface window window org eclipse osgi util nls org eclipse pde core i model changed event imodelchangedevent org eclipse pde core i writable iwritable org eclipse pde core plugin org eclipse pde internal core org eclipse pde internal core ifeature org eclipse pde internal core isite org eclipse pde internal pde plugin pdeplugin org eclipse pde internal pde ui messages pdeuimessages org eclipse pde internal dialogs feature selection dialog featureselectiondialog org eclipse pde internal dialogs plugin selection dialog pluginselectiondialog org eclipse pde internal editor org eclipse pde internal editor feature feature editor featureeditor org eclipse pde internal editor plugin manifest editor manifesteditor org eclipse pde internal elements default content provider defaultcontentprovider org eclipse pde internal parts tree part treepart org eclipse swt swt org eclipse swt custom busy indicator busyindicator org eclipse swt dnd org eclipse swt graphics point org eclipse swt graphics rectangle org eclipse swt widgets org eclipse actions action factory actionfactory org eclipse forms widgets form toolkit formtoolkit org eclipse forms widgets org osgi framework version category section categorysection tree section treesection i feature model listener ifeaturemodellistener button add category button add feature button add bundle f counter fcounter i site model isitemodel f model fmodel tree part treepart f category tree part fcategorytreepart tree viewer treeviewer f category viewer fcategoryviewer label provider labelprovider f site label provider fsitelabelprovider category content provider categorycontentprovider default content provider defaultcontentprovider i tree content provider itreecontentprovider override object get elements getelements object input element inputelement model i site isite input element inputelement array list arraylist i writable iwritable result array list arraylist i site category definition isitecategorydefinition cat defs catdefs f model fmodel get site getsite get category definitions getcategorydefinitions cat defs catdefs length result add cat defs catdefs i site feature isitefeature features f model fmodel get site getsite get features getfeatures features length features get categories getcategories length result add site feature adapter sitefeatureadapter features i site bundle isitebundle bundles f model fmodel get site getsite get bundles getbundles bundles length bundles get categories getcategories length result add site bundle adapter sitebundleadapter bundles result to array toarray override object get children getchildren object parent parent i site category definition isitecategorydefinition i site category definition isitecategorydefinition cat def catdef i site category definition isitecategorydefinition parent i site feature isitefeature features f model fmodel get site getsite get features getfeatures hash set hashset i writable iwritable result hash set hashset features length i site category isitecategory cats features get categories getcategories cats length cats get definition getdefinition cats get definition getdefinition equals cat def catdef result add site feature adapter sitefeatureadapter cats get name getname features i site bundle isitebundle bundles f model fmodel get site getsite get bundles getbundles bundles length i site category isitecategory cats bundles get categories getcategories cats length cats get definition getdefinition cats get definition getdefinition equals cat def catdef result add site bundle adapter sitebundleadapter cats get name getname bundles result to array toarray object override object get parent getparent object element override has children haschildren object element element i site category definition isitecategorydefinition i site category definition isitecategorydefinition cat def catdef i site category definition isitecategorydefinition element i site feature isitefeature features f model fmodel get site getsite get features getfeatures features length i site category isitecategory cats features get categories getcategories cats length cats get definition getdefinition cats get definition getdefinition equals cat def catdef i site bundle isitebundle bundles f model fmodel get site getsite get bundles getbundles bundles length i site category isitecategory cats bundles get categories getcategories cats length cats get definition getdefinition cats get definition getdefinition equals cat def catdef category section categorysection pde form page pdeformpage form page formpage composite parent form page formpage parent description string pde ui messages pdeuimessages category definition category section categorydefinitioncategorysection pde ui messages pdeuimessages category section categorysection add pde ui messages pdeuimessages category section categorysection add bundle addbundle get section getsection set text settext pde ui messages pdeuimessages category definition category section categorydefinitioncategorysection title get section getsection set description setdescription pde ui messages pdeuimessages category definition category section categorydefinitioncategorysection desc override create client createclient form toolkit formtoolkit toolkit f model fmodel i site model isitemodel get page getpage get model getmodel f model fmodel add model changed listener addmodelchangedlistener composite container create client container createclientcontainer toolkit create viewer part control createviewerpartcontrol container swt multi toolkit f category tree part fcategorytreepart get tree part gettreepart f category viewer fcategoryviewer f category tree part fcategorytreepart get tree viewer gettreeviewer f category viewer fcategoryviewer set content provider setcontentprovider category content provider categorycontentprovider f site label provider fsitelabelprovider category label provider categorylabelprovider f category viewer fcategoryviewer set label provider setlabelprovider f site label provider fsitelabelprovider f category viewer fcategoryviewer set input setinput f model fmodel get site getsite ops dnd drop copy dnd drop move dnd drop transfer transfers transfer model data transfer modeldatatransfer get instance getinstance is editable iseditable f category viewer fcategoryviewer add drop support adddropsupport ops transfers viewer drop adapter viewerdropadapter f category viewer fcategoryviewer override drag enter dragenter drop target event droptargetevent event object target determine target determinetarget event target event detail dnd drop copy event detail dnd drop move drag enter dragenter event override drag operation changed dragoperationchanged drop target event droptargetevent event object target determine target determinetarget event target event detail dnd drop copy event detail dnd drop move drag operation changed dragoperationchanged event override drag over dragover drop target event droptargetevent event object target determine target determinetarget event target event detail dnd drop copy event detail dnd drop move drag over dragover event returns position event coordinates relative target position determined item based threshold param event event code location code constants defined override determine location determinelocation drop target event droptargetevent event event item item location item item item event item point coordinates point event event coordinates get viewer getviewer get control getcontrol to control tocontrol coordinates item rectangle bounds get bounds getbounds item bounds location location override perform drop performdrop object data data object object target get current target getcurrenttarget get current operation getcurrentoperation object objects object data objects length objects site feature adapter sitefeatureadapter dnd drop copy target copy feature copyfeature site feature adapter sitefeatureadapter objects target move feature movefeature site feature adapter sitefeatureadapter objects target objects length objects site bundle adapter sitebundleadapter dnd drop copy target copy bundle copybundle site bundle adapter sitebundleadapter objects target move bundle movebundle site bundle adapter sitebundleadapter objects target override validate drop validatedrop object target operation transfer data transferdata transfer type transfertype target i site category definition isitecategorydefinition target f category viewer fcategoryviewer add drag support adddragsupport dnd drop move dnd drop copy transfers drag source listener dragsourcelistener override drag start dragstart drag source event dragsourceevent event i structured selection istructuredselection ssel i structured selection istructuredselection f category viewer fcategoryviewer get selection getselection ssel ssel is empty isempty ssel get first element getfirstelement site feature adapter sitefeatureadapter ssel get first element getfirstelement site bundle adapter sitebundleadapter event doit override drag set data dragsetdata drag source event dragsourceevent event i structured selection istructuredselection ssel i structured selection istructuredselection f category viewer fcategoryviewer get selection getselection event data ssel to array toarray override drag finished dragfinished drag source event dragsourceevent event f category tree part fcategorytreepart set button enabled setbuttonenabled button add category is editable iseditable f category tree part fcategorytreepart set button enabled setbuttonenabled button add feature is editable iseditable f category tree part fcategorytreepart set button enabled setbuttonenabled button add bundle is editable iseditable f category viewer fcategoryviewer expand all expandall toolkit paint b orders for paintbordersfor container set client setclient container initialize category exists categoryexists string i site category definition isitecategorydefinition defs f model fmodel get site getsite get category definitions getcategorydefinitions defs length i site category definition isitecategorydefinition def defs string dname def get name getname dname dname equals copy feature copyfeature site feature adapter sitefeatureadapter adapter object target i site feature isitefeature feature find real feature findrealfeature adapter feature adapter category move feature movefeature adapter target target target i site category definition isitecategorydefinition add category addcategory feature i site category definition isitecategorydefinition target get name getname copy bundle copybundle site bundle adapter sitebundleadapter adapter object target i site bundle isitebundle bundle find real bundle findrealbundle adapter bundle target target i site category definition isitecategorydefinition add category addcategory bundle i site category definition isitecategorydefinition target get name getname add category addcategory i site feature isitefeature a feature afeature string cat name catname a feature afeature i site category isitecategory cats a feature afeature get categories getcategories cats length cats get name getname equals cat name catname i site category isitecategory cat f model fmodel get factory getfactory create category createcategory a feature afeature cat set name setname cat name catname expand category expandcategory cat name catname a feature afeature add categories addcategories i site category isitecategory cat core exception coreexception add category addcategory i site bundle isitebundle a bundle abundle string cat name catname a bundle abundle i site category isitecategory cats a bundle abundle get categories getcategories cats length cats get name getname equals cat name catname i site category isitecategory cat f model fmodel get factory getfactory create category createcategory a bundle abundle cat set name setname cat name catname expand category expandcategory cat name catname a bundle abundle add categories addcategories i site category isitecategory cat core exception coreexception move feature movefeature site feature adapter sitefeatureadapter adapter object target i site feature isitefeature feature find real feature findrealfeature adapter feature adapter category remove category removecategory feature adapter category target target i site category definition isitecategorydefinition add category addcategory feature i site category definition isitecategorydefinition target get name getname move bundle movebundle site bundle adapter sitebundleadapter adapter object target i site bundle isitebundle bundle find real bundle findrealbundle adapter bundle adapter category remove category removecategory bundle adapter category target target i site category definition isitecategorydefinition add category addcategory bundle i site category definition isitecategorydefinition target get name getname override button selected buttonselected button add category handle add category definition handleaddcategorydefinition button add feature handle new feature handlenewfeature button add bundle handle new bundle handlenewbundle override handle double click handledoubleclick i structured selection istructuredselection ssel handle double click handledoubleclick ssel object selected ssel get first element getfirstelement selected site feature adapter sitefeatureadapter i feature ifeature feature find feature findfeature site feature adapter sitefeatureadapter selected feature feature editor featureeditor open feature editor openfeatureeditor feature selected site bundle adapter sitebundleadapter manifest editor manifesteditor open plugin editor openplugineditor site bundle adapter sitebundleadapter selected bundle get id getid override selection changed selectionchanged i structured selection istructuredselection selection get page getpage getpdeeditor set selection setselection selection handle add category definition handleaddcategorydefinition string nls bind pde ui messages pdeuimessages category section categorysection new category name newcategoryname integer to string tostring f counter fcounter category exists categoryexists nls bind pde ui messages pdeuimessages category section categorysection new category name newcategoryname integer to string tostring f counter fcounter string label nls bind pde ui messages pdeuimessages category section categorysection new category label newcategorylabel integer to string tostring f counter fcounter i site category definition isitecategorydefinition category def categorydef f model fmodel get factory getfactory create category definition createcategorydefinition category def categorydef set name setname category def categorydef set label setlabel label f model fmodel get site getsite add category definitions addcategorydefinitions i site category definition isitecategorydefinition category def categorydef core exception coreexception pde plugin pdeplugin log exception logexception f category viewer fcategoryviewer set selection setselection structured selection structuredselection category def categorydef handle remove handleremove i structured selection istructuredselection ssel i structured selection istructuredselection f category viewer fcategoryviewer get selection getselection iterator iterator ssel iterator success removed categories removedcategories hash set hashset iterator has next hasnext object object iterator object object i site category definition isitecategorydefinition handle remove category definition handleremovecategorydefinition i site category definition isitecategorydefinition object success object site feature adapter sitefeatureadapter remove feature category removed site feature adapter sitefeatureadapter site feature adapter sitefeatureadapter object removed categories removedcategories category handle remove site feature adapter handleremovesitefeatureadapter success object site bundle adapter sitebundleadapter remove bundle category removed site bundle adapter sitebundleadapter site bundle adapter sitebundleadapter object removed categories removedcategories category handle remove site bundle adapter handleremovesitebundleadapter success success handle remove category definition handleremovecategorydefinition i site category definition isitecategorydefinition cat def catdef object children category content provider categorycontentprovider f category viewer fcategoryviewer get content provider getcontentprovider get children getchildren cat def catdef children length children site feature adapter sitefeatureadapter site feature adapter sitefeatureadapter adapter site feature adapter sitefeatureadapter children i site category isitecategory cats adapter feature get categories getcategories cats length adapter category equals cats get name getname adapter feature remove categories removecategories i site category isitecategory cats adapter feature get categories getcategories length f model fmodel get site getsite remove features removefeatures i site feature isitefeature adapter feature children site bundle adapter sitebundleadapter site bundle adapter sitebundleadapter adapter site bundle adapter sitebundleadapter children i site category isitecategory cats adapter bundle get categories getcategories cats length adapter category equals cats get name getname adapter bundle remove categories removecategories i site category isitecategory cats adapter bundle get categories getcategories length f model fmodel get site getsite remove bundles removebundles i site bundle isitebundle adapter bundle f model fmodel get site getsite remove category definitions removecategorydefinitions i site category definition isitecategorydefinition cat def catdef core exception coreexception handle remove site feature adapter handleremovesitefeatureadapter site feature adapter sitefeatureadapter adapter i site feature isitefeature feature adapter feature adapter category f model fmodel get site getsite remove features removefeatures i site feature isitefeature feature remove category removecategory feature adapter category feature get categories getcategories length f model fmodel get site getsite remove features removefeatures i site feature isitefeature feature core exception coreexception handle remove site bundle adapter handleremovesitebundleadapter site bundle adapter sitebundleadapter adapter i site bundle isitebundle bundle adapter bundle adapter category f model fmodel get site getsite remove bundles removebundles i site bundle isitebundle bundle remove category removecategory bundle adapter category bundle get categories getcategories length f model fmodel get site getsite remove bundles removebundles i site bundle isitebundle bundle core exception coreexception remove category removecategory i site feature isitefeature a feature afeature string cat name catname a feature afeature i site category isitecategory cats a feature afeature get categories getcategories cats length cat name catname equals cats get name getname a feature afeature remove categories removecategories i site category isitecategory cats core exception coreexception remove category removecategory i site bundle isitebundle a bundle abundle string cat name catname a bundle abundle i site category isitecategory cats a bundle abundle get categories getcategories cats length cat name catname equals cats get name getname a bundle abundle remove categories removecategories i site category isitecategory cats core exception coreexception i site feature isitefeature find real feature findrealfeature site feature adapter sitefeatureadapter adapter i site feature isitefeature feature copy featurecopy adapter feature i site feature isitefeature features f model fmodel get site getsite get features getfeatures features length features get id getid equals feature copy featurecopy get id getid features get version getversion equals feature copy featurecopy get version getversion features i site bundle isitebundle find real bundle findrealbundle site bundle adapter sitebundleadapter adapter i site bundle isitebundle feature copy featurecopy adapter bundle i site bundle isitebundle bundles f model fmodel get site getsite get bundles getbundles bundles length bundles get id getid equals feature copy featurecopy get id getid bundles get version getversion equals feature copy featurecopy get version getversion bundles override dispose dispose feature model manager featuremodelmanager mng pde core pdecore get default getdefault get feature model manager getfeaturemodelmanager mng remove feature model listener removefeaturemodellistener f model fmodel remove model changed listener removemodelchangedlistener f site label provider fsitelabelprovider f site label provider fsitelabelprovider dispose override fill context menu fillcontextmenu i menu manager imenumanager manager action remove action removeaction action pde ui messages pdeuimessages category section categorysection remove override do global action doglobalaction action factory actionfactory delete get id getid remove action removeaction set enabled setenabled is editable iseditable manager add remove action removeaction get page getpage getpdeeditor get contributor getcontributor context menu about to show contextmenuabouttoshow manager override do global action doglobalaction string action id actionid action id actionid equals action factory actionfactory cut get id getid handle remove handleremove action id actionid equals action factory actionfactory paste get id getid do paste dopaste action id actionid equals action factory actionfactory delete get id getid handle remove handleremove action id actionid equals action factory actionfactory select get id getid f category viewer fcategoryviewer get tree gettree select all selectall refresh override refresh f category viewer fcategoryviewer refresh refresh override model changed modelchanged i model changed event imodelchangedevent mark stale markstale initialize refresh feature model manager featuremodelmanager mng pde core pdecore get default getdefault get feature model manager getfeaturemodelmanager mng add feature model listener addfeaturemodellistener override do paste dopaste object target object objects objects length objects site feature adapter sitefeatureadapter copy feature copyfeature site feature adapter sitefeatureadapter objects target objects site bundle adapter sitebundleadapter copy bundle copybundle site bundle adapter sitebundleadapter objects target objects i site category definition isitecategorydefinition f model fmodel get site getsite add category definitions addcategorydefinitions i site category definition isitecategorydefinition i site category definition isitecategorydefinition objects core exception coreexception override can paste canpaste object target object objects target target i site category definition isitecategorydefinition objects length objects site feature adapter sitefeatureadapter objects site bundle adapter sitebundleadapter objects i site category definition isitecategorydefinition string i site category definition isitecategorydefinition objects get name getname i site category definition isitecategorydefinition defs f model fmodel get site getsite get category definitions getcategorydefinitions defs length i site category definition isitecategorydefinition def defs string dname def get name getname dname dname equals finds feature version site feature feature feature qualifier exists returned param site feature sitefeature i feature ifeature i feature ifeature find feature findfeature i site feature isitefeature site feature sitefeature i feature model ifeaturemodel model pde core pdecore get default getdefault get feature model manager getfeaturemodelmanager find feature model relaxed findfeaturemodelrelaxed site feature sitefeature get id getid site feature sitefeature get version getversion model model get feature getfeature handle new feature handlenewfeature control control f category viewer fcategoryviewer get control getcontrol busy indicator busyindicator show while showwhile control get display getdisplay runnable override i feature model ifeaturemodel all models allmodels pde core pdecore get default getdefault get feature model manager getfeaturemodelmanager get models getmodels array list arraylist i feature model ifeaturemodel new models newmodels array list arraylist all models allmodels length can add canadd all models allmodels new models newmodels add all models allmodels i feature model ifeaturemodel candidate models candidatemodels new models newmodels to array toarray i feature model ifeaturemodel new models newmodels size feature selection dialog featureselectiondialog dialog feature selection dialog featureselectiondialog f category viewer fcategoryviewer get tree gettree get shell getshell candidate models candidatemodels dialog open window object models dialog get result getresult do add doadd models core exception coreexception pde plugin pdeplugin log handle new bundle handlenewbundle control control f category viewer fcategoryviewer get control getcontrol busy indicator busyindicator show while showwhile control get display getdisplay runnable override i plugin model base ipluginmodelbase all models allmodels plugin registry pluginregistry get all models getallmodels array list arraylist i plugin model base ipluginmodelbase new models newmodels array list arraylist all models allmodels length can add canadd all models allmodels new models newmodels add all models allmodels i plugin model base ipluginmodelbase candidate models candidatemodels new models newmodels to array toarray i plugin model base ipluginmodelbase new models newmodels size plugin selection dialog pluginselectiondialog dialog plugin selection dialog pluginselectiondialog f category viewer fcategoryviewer get tree gettree get shell getshell candidate models candidatemodels dialog open window object models dialog get result getresult do add bundles doaddbundles models core exception coreexception pde plugin pdeplugin log can add canadd i feature model ifeaturemodel candidate i site feature isitefeature features f model fmodel get site getsite get features getfeatures i feature ifeature cfeature candidate get feature getfeature features length i site feature isitefeature bfeature features bfeature get id getid bfeature get id getid equals cfeature get id getid bfeature get version getversion bfeature get version getversion equals cfeature get version getversion can add canadd i plugin model base ipluginmodelbase candidate i site bundle isitebundle current bundles currentbundles f model fmodel get site getsite get bundles getbundles i plugin base ipluginbase candidate bundle candidatebundle candidate get plugin base getpluginbase current bundles currentbundles length i site bundle isitebundle current bundle currentbundle current bundles currentbundles current bundle currentbundle get id getid equals candidate bundle candidatebundle get id getid current bundle currentbundle get version getversion equals candidate bundle candidatebundle get version getversion i site feature isitefeature create site feature createsitefeature i site model isitemodel model i feature model ifeaturemodel feature model featuremodel core exception coreexception i feature ifeature feature feature model featuremodel get feature getfeature i site feature isitefeature sfeature model get factory getfactory create feature createfeature sfeature set id setid feature get id getid sfeature set version setversion feature get version getversion sfeature seturl model get build model getbuildmodel get site build getsitebuild get feature location getfeaturelocation feature get id getid feature get version getversion jar nls nls nls nls nls nls sfeature seturl features feature get id getid format version formatversion feature get version getversion jar sfeature setos feature getos sfeature setws feature getws sfeature set arch setarch feature get arch getarch sfeature setnl feature getnl sfeature set is patch setispatch is feature patch isfeaturepatch feature sfeature i site bundle isitebundle create site bundle createsitebundle i site model isitemodel model i plugin model base ipluginmodelbase candidate core exception coreexception i site bundle isitebundle new bundle newbundle model get factory getfactory create bundle createbundle new bundle newbundle set id setid candidate get plugin base getpluginbase get id getid new bundle newbundle set version setversion candidate get plugin base getpluginbase get version getversion new bundle newbundle string format version formatversion string version version version version to string tostring illegal argument exception illegalargumentexception version is feature patch isfeaturepatch i feature ifeature feature i feature import ifeatureimport imports feature get imports getimports imports length imports is patch ispatch i site model isitemodel get model getmodel f model fmodel param candidates array i feature model ifeaturemodel param monitor core exception coreexception do add doadd object candidates core exception coreexception category add features string category name categoryname i selection iselection selection f category viewer fcategoryviewer get selection getselection selection is empty isempty selection i structured selection istructuredselection object element i structured selection istructuredselection selection get first element getfirstelement element i site category definition isitecategorydefinition category name categoryname i site category definition isitecategorydefinition element get name getname element site feature adapter sitefeatureadapter category name categoryname site feature adapter sitefeatureadapter element category element site bundle adapter sitebundleadapter category name categoryname site bundle adapter sitebundleadapter element category i site feature isitefeature i site feature isitefeature candidates length candidates length i feature model ifeaturemodel candidate i feature model ifeaturemodel candidates i site feature isitefeature child create site feature createsitefeature f model fmodel candidate category name categoryname add category addcategory child category name categoryname child update model f model fmodel get site getsite add features addfeatures select feature length category name categoryname expand category expandcategory category name categoryname f category viewer fcategoryviewer set selection setselection structured selection structuredselection site feature adapter sitefeatureadapter category name categoryname length param candidates array i plugin model base ipluginmodelbase param monitor core exception coreexception do add bundles doaddbundles object candidates core exception coreexception category add features string category name categoryname i selection iselection selection f category viewer fcategoryviewer get selection getselection selection is empty isempty selection i structured selection istructuredselection object element i structured selection istructuredselection selection get first element getfirstelement element i site category definition isitecategorydefinition category name categoryname i site category definition isitecategorydefinition element get name getname element site feature adapter sitefeatureadapter category name categoryname site feature adapter sitefeatureadapter element category element site bundle adapter sitebundleadapter category name categoryname site bundle adapter sitebundleadapter element category i site bundle isitebundle i site bundle isitebundle candidates length candidates length i plugin model base ipluginmodelbase candidate i plugin model base ipluginmodelbase candidates i site bundle isitebundle child create site bundle createsitebundle f model fmodel candidate category name categoryname add category addcategory child category name categoryname child update model f model fmodel get site getsite add bundles addbundles select feature length category name categoryname expand category expandcategory category name categoryname f category viewer fcategoryviewer set selection setselection structured selection structuredselection site bundle adapter sitebundleadapter category name categoryname length fire selection fireselection f category viewer fcategoryviewer set selection setselection f category viewer fcategoryviewer get selection getselection override set form input setforminput object input input i site category definition isitecategorydefinition f category viewer fcategoryviewer set selection setselection structured selection structuredselection input input site feature adapter sitefeatureadapter expand category tree find feature string category site feature adapter sitefeatureadapter input category category expand category expandcategory category f category viewer fcategoryviewer set selection setselection structured selection structuredselection input set form input setforminput input expand category expandcategory string category category i site category definition isitecategorydefinition cat defs catdefs f model fmodel get site getsite get category definitions getcategorydefinitions cat defs catdefs length category equals cat defs catdefs get name getname f category viewer fcategoryviewer expand to level expandtolevel cat defs catdefs override models changed modelschanged i feature model delta ifeaturemodeldelta delta mark stale markstale