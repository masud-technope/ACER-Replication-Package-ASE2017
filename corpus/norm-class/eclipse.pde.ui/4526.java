copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal wizards plugin java lang reflect invocation target exception invocationtargetexception org eclipse core resources i project iproject org eclipse core runtime org eclipse jface dialogs i dialog settings idialogsettings org eclipse jface operation i runnable with progress irunnablewithprogress org eclipse jface wizard i wizard page iwizardpage org eclipse pde internal core pde core pdecore org eclipse pde internal org eclipse pde internal elements element list elementlist org eclipse pde internal wizards org eclipse pde i plugin content wizard iplugincontentwizard org eclipse swt graphics image org eclipse i working set iworkingset org eclipse wizards new resource newresource basic new project resource wizard basicnewprojectresourcewizard new plugin project wizard newpluginprojectwizard new wizard newwizard i executable extension iexecutableextension nls string plugin point plugin content plugincontent nls string tag wizard wizard nls string def project project nls string def template template i configuration element iconfigurationelement f config fconfig plugin field data pluginfielddata f plugin data fplugindata i project provider iprojectprovider f project provider fprojectprovider new project creation page newprojectcreationpage f main page fmainpage plugin content page plugincontentpage f content page fcontentpage template list selection page templatelistselectionpage f wizard list page fwizardlistpage new plugin project wizard newpluginprojectwizard set default page image descriptor setdefaultpageimagedescriptor pde plugin images pdepluginimages desc new pprj newpprj wiz set dialog settings setdialogsettings pde plugin pdeplugin get default getdefault get dialog settings getdialogsettings set window title setwindowtitle pde ui messages pdeuimessages new project wizard newprojectwizard title set needs progress monitor setneedsprogressmonitor f plugin data fplugindata plugin field data pluginfielddata new plugin project wizard newpluginprojectwizard string osgi framework osgiframework f plugin data fplugindata setosgiframework osgi framework osgiframework override add pages addpages nls f main page fmainpage new project creation page newprojectcreationpage main f plugin data fplugindata get selection getselection f main page fmainpage set title settitle pde ui messages pdeuimessages new project wizard newprojectwizard main page mainpage title f main page fmainpage set description setdescription pde ui messages pdeuimessages new project wizard newprojectwizard main page mainpage desc string pname get default value getdefaultvalue def project pname f main page fmainpage set initial project name setinitialprojectname pname add page addpage f main page fmainpage f project provider fprojectprovider i project provider iprojectprovider override string get project name getprojectname f main page fmainpage get project name getprojectname override i project iproject get project getproject f main page fmainpage get project handle getprojecthandle override i path ipath get location path getlocationpath f main page fmainpage get location path getlocationpath nls f content page fcontentpage plugin content page plugincontentpage f project provider fprojectprovider f main page fmainpage f plugin data fplugindata f wizard list page fwizardlistpage template list selection page templatelistselectionpage get available codegen wizards getavailablecodegenwizards f content page fcontentpage pde ui messages pdeuimessages wizard list selection page wizardlistselectionpage templates string tid get default value getdefaultvalue def template tid f wizard list page fwizardlistpage set initial template id setinitialtemplateid tid add page addpage f content page fcontentpage add page addpage f wizard list page fwizardlistpage override can finish canfinish i wizard page iwizardpage get container getcontainer get current page getcurrentpage can finish canfinish f main page fmainpage override perform finish performfinish f main page fmainpage update data updatedata f content page fcontentpage update data updatedata i dialog settings idialogsettings settings get dialog settings getdialogsettings settings f main page fmainpage save settings savesettings settings f content page fcontentpage save settings savesettings settings basic new project resource wizard basicnewprojectresourcewizard update perspective updateperspective f config fconfig pde models initialized initialize option cancel pde core pdecore get default getdefault are models initialized aremodelsinitialized get container getcontainer i runnable with progress irunnablewithprogress override i progress monitor iprogressmonitor monitor invocation target exception invocationtargetexception interrupted exception interruptedexception target reloaded method clears existing models don exist inits progress monitor pde core pdecore get default getdefault get model manager getmodelmanager target reloaded targetreloaded monitor monitor is canceled iscanceled interrupted exception interruptedexception interrupted exception interruptedexception i plugin content wizard iplugincontentwizard content wizard contentwizard f wizard list page fwizardlistpage get selected wizard getselectedwizard get container getcontainer new project creation operation newprojectcreationoperation f plugin data fplugindata f project provider fprojectprovider content wizard contentwizard i working set iworkingset working sets workingsets f main page fmainpage get selected working sets getselectedworkingsets working sets workingsets length get workbench getworkbench get working set manager getworkingsetmanager add to working sets addtoworkingsets f project provider fprojectprovider get project getproject working sets workingsets invocation target exception invocationtargetexception pde plugin pdeplugin log exception logexception interrupted exception interruptedexception override set initialization data setinitializationdata i configuration element iconfigurationelement config string property name propertyname object data core exception coreexception f config fconfig config wizard element wizardelement create wizard element createwizardelement i configuration element iconfigurationelement config string config get attribute getattribute wizard element wizardelement att string config get attribute getattribute wizard element wizardelement att string class name classname config get attribute getattribute wizard element wizardelement att class name classname wizard element wizardelement element wizard element wizardelement config string image name imagename config get attribute getattribute wizard element wizardelement att icon image name imagename string pluginid config get name space identifier getnamespaceidentifier image image pde plugin pdeplugin get default getdefault get label provider getlabelprovider get image from plugin getimagefromplugin pluginid image name imagename element set image setimage image element element list elementlist get available codegen wizards getavailablecodegenwizards nls element list elementlist wizards element list elementlist codegen wizards codegenwizards i extension registry iextensionregistry registry platform get extension registry getextensionregistry i extension point iextensionpoint point registry get extension point getextensionpoint pde plugin pdeplugin get plugin id getpluginid plugin point point wizards i extension iextension extensions point get extensions getextensions extensions length i configuration element iconfigurationelement elements extensions get configuration elements getconfigurationelements elements length elements get name getname equals tag wizard wizard element wizardelement element create wizard element createwizardelement elements element wizards add element wizards string get plugin id getpluginid f plugin data fplugindata get id getid string get plugin version getpluginversion f plugin data fplugindata get version getversion