copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal compare org eclipse compare org eclipse compare structure merge viewer structuremergeviewer org eclipse core resources resources plugin resourcesplugin org eclipse core runtime org eclipse jface resource org eclipse jface text i document idocument org eclipse pde core plugin org eclipse pde internal core i core constants icoreconstants org eclipse pde internal core text i document element node idocumentelementnode org eclipse pde internal core text plugin org eclipse pde internal org eclipse swt graphics image plugin structure creator pluginstructurecreator structure creator structurecreator root library extension point extension plugin node pluginnode document range node documentrangenode i type d element itypedelement image image plugin node pluginnode document range node documentrangenode parent type string image image i document idocument doc start length parent type doc start length image image parent parent add child addchild plugin node pluginnode override string get name getname get id getid override string get type gettype nls plugin override image get image getimage image plugin structure creator pluginstructurecreator override i structure comparator istructurecomparator create structure comparator createstructurecomparator object input i document idocument document i shared document adapter ishareddocumentadapter adapter i progress monitor iprogressmonitor monitor core exception coreexception is editable iseditable input i editable content ieditablecontent is editable iseditable i editable content ieditablecontent input is editable iseditable is editable iseditable create label provider provide text elements pde label provider pdelabelprovider label provider labelprovider pde label provider pdelabelprovider create resource manager manage images label provider image disposed resource manager ensure image disposed resource managers reference resource manager resourcemanager resources local resource manager localresourcemanager j face resources jfaceresources get resources getresources document range node documentrangenode root node rootnode structure root node structurerootnode document input adapter override is editable iseditable is editable iseditable override dispose dispose label provider local resource manager label provider labelprovider dispose resources dispose dispose parse plugin parseplugin input root node rootnode document label provider labelprovider resources monitor core exception coreexception adapter adapter disconnect input root node rootnode override string get contents getcontents object node ignore whitespace ignorewhitespace node i stream content accessor istreamcontentaccessor i stream content accessor istreamcontentaccessor sca i stream content accessor istreamcontentaccessor node manifest structure creator manifeststructurecreator read string readstring sca core exception coreexception override string get name getname pde ui messages pdeuimessages plugin structure creator pluginstructurecreator parse plugin parseplugin object input document range node documentrangenode root node rootnode i document idocument document pde label provider pdelabelprovider label provider labelprovider resource manager resourcemanager resources i progress monitor iprogressmonitor monitor core exception coreexception is fragment isfragment is fragment isfragment input plugin model base pluginmodelbase model create model createmodel input document is fragment isfragment model is loaded isloaded model get status getstatus get severity getseverity i status istatus error core exception coreexception model get status getstatus nls nls string is fragment isfragment fragment plugin image descriptor imagedescriptor icon is fragment isfragment pde plugin images pdepluginimages desc fragment obj pde plugin images pdepluginimages desc plugin obj plugin node pluginnode parent plugin node pluginnode root node rootnode root resources create image createimage icon document document get length getlength create children createchildren parent model label provider labelprovider resources model dispose is fragment isfragment object input input i type d element itypedelement i type d element itypedelement input get name getname equals i core constants icoreconstants fragment filename descriptor plugin model base pluginmodelbase create model createmodel object input i document idocument document is fragment isfragment core exception coreexception plugin model base pluginmodelbase model is fragment isfragment model fragment model fragmentmodel document is reconciling isreconciling model plugin model pluginmodel document is reconciling isreconciling model set charset setcharset get charset getcharset input model load model string get charset getcharset object input core exception coreexception input i encoded stream content accessor iencodedstreamcontentaccessor i encoded stream content accessor iencodedstreamcontentaccessor input get charset getcharset resources plugin resourcesplugin get encoding getencoding create children createchildren document range node documentrangenode root node rootnode plugin model base pluginmodelbase model pde label provider pdelabelprovider label provider labelprovider resource manager resourcemanager resources create libraries createlibraries root node rootnode model label provider labelprovider resources create imports createimports root node rootnode model label provider labelprovider label provider labelprovider resources create extension points createextensionpoints root node rootnode model label provider labelprovider resources create extensions createextensions root node rootnode model label provider labelprovider resources create libraries createlibraries document range node documentrangenode parent plugin model base pluginmodelbase model pde label provider pdelabelprovider label provider labelprovider resource manager resourcemanager resources i plugin library ipluginlibrary libraries model get plugin base getpluginbase get libraries getlibraries type library libraries length i plugin library ipluginlibrary plugin library pluginlibrary libraries create node createnode parent type plugin library pluginlibrary label provider labelprovider resources create imports createimports document range node documentrangenode parent plugin model base pluginmodelbase model pde label provider pdelabelprovider label provider labelprovider pde label provider pdelabelprovider label provider labelprovider resource manager resourcemanager resources i plugin import ipluginimport imports model get plugin base getpluginbase get imports getimports type imports length i plugin import ipluginimport plugin import pluginimport imports create node createnode parent type plugin import pluginimport label provider labelprovider resources create extension points createextensionpoints document range node documentrangenode parent plugin model base pluginmodelbase model pde label provider pdelabelprovider label provider labelprovider resource manager resourcemanager resources i plugin extension point ipluginextensionpoint extension points extensionpoints model get plugin base getpluginbase get extension points getextensionpoints type extension point extension points extensionpoints length i plugin extension point ipluginextensionpoint extension point extensionpoint extension points extensionpoints create node createnode parent type extension point extensionpoint label provider labelprovider resources create extensions createextensions document range node documentrangenode parent plugin model base pluginmodelbase model pde label provider pdelabelprovider label provider labelprovider resource manager resourcemanager resources i plugin extension ipluginextension extensions model get plugin base getpluginbase get extensions getextensions type extension extensions length i plugin extension ipluginextension extension extensions create node createnode parent type extension label provider labelprovider resources create node createnode document range node documentrangenode parent type object element pde label provider pdelabelprovider label provider labelprovider resource manager resourcemanager resources element i document element node idocumentelementnode i document element node idocumentelementnode node i document element node idocumentelementnode element image descriptor imagedescriptor image descriptor imagedescriptor get image descriptor getimagedescriptor element image image image descriptor imagedescriptor image resources create image createimage image descriptor imagedescriptor plugin node pluginnode parent type label provider labelprovider get text gettext element image parent get document getdocument node get offset getoffset node get length getlength image descriptor imagedescriptor get image descriptor getimagedescriptor object element element i plugin import ipluginimport pde plugin images pdepluginimages desc req plugin obj element i plugin library ipluginlibrary pde plugin images pdepluginimages desc java lib obj element i plugin extension ipluginextension pde plugin images pdepluginimages desc extension obj element i plugin extension point ipluginextensionpoint pde plugin images pdepluginimages desc ext point obj