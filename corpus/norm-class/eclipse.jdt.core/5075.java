copyright bea systems rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors jgarms bea initial api implementation org eclipse jdt apt core internal util java file java io exception ioexception java string reader stringreader java util iterator java util linked hash map linkedhashmap java util map javax xml parsers document builder documentbuilder javax xml parsers document builder factory documentbuilderfactory javax xml parsers parser configuration exception parserconfigurationexception org eclipse core resources i file ifile org eclipse core resources i project iproject org eclipse core resources i resource iresource org eclipse core runtime core exception coreexception org eclipse core runtime i path ipath org eclipse core runtime i status istatus org eclipse core runtime path org eclipse core runtime status org eclipse jdt apt core internal apt plugin aptplugin org eclipse jdt apt core internal ext jar factory container extjarfactorycontainer org eclipse jdt apt core internal factory plugin manager factorypluginmanager org eclipse jdt apt core internal var jar factory container varjarfactorycontainer org eclipse jdt apt core internal wksp jar factory container wkspjarfactorycontainer org eclipse jdt apt core internal util factory container factorycontainer factory type factorytype org eclipse jdt apt core util i factory path ifactorypath org eclipse jdt core i java project ijavaproject org dom element org dom node org dom node list nodelist org xml sax input source inputsource org xml sax sax exception saxexception utility dealing factory path factory path util factorypathutil nls string factorypath tag factorypath nls string factorypath entry tag factorypath entry factorypathentry nls string kind kind nls string nls string enabled enabled nls string batch mode run in batch mode runinbatchmode nls string factorypath file factorypath spaces indent nls string indent tor prevent construction factory path util factorypathutil test resource factory path file criteria file belongs project located root project named factorypath note workspace wide factorypath file meet criteria param res sort i resource iresource resource project specific factory path file is factory path file isfactorypathfile i resource iresource res res res get type gettype i resource iresource file res get project getproject i path ipath path res get project relative path getprojectrelativepath path segment count segmentcount factorypath file equals path last segment lastsegment loads map factory containers factory path project factorypath file returns map factory container factorycontainer factory path factorypath attributes read factory path file readfactorypathfile i java project ijavaproject jproj core exception coreexception string data project workspace level data jproj file file get file for workspace getfileforworkspace file exists data file system util filesystemutil get contents of file getcontentsoffile file i file ifile ifile get file for project getifileforproject jproj ifile exists data file system util filesystemutil get contents of file getcontentsofifile ifile io exception ioexception core exception coreexception status i status istatus error apt plugin aptplugin plugin messages factory path util factorypathutil status io exception ioexception factory path util factorypathutil decode factory path decodefactorypath data stores map factory containers factorypath file project passed factorypath file deleted save factory path file savefactorypathfile i java project ijavaproject jproj map factory container factorycontainer factory path factorypath attributes containers core exception coreexception i file ifile proj file projfile file wksp file wkspfile jproj proj file projfile get file for project getifileforproject jproj wksp file wkspfile wksp file wkspfile get file for workspace getfileforworkspace proj file projfile containers string data factory path util factorypathutil encode factory path encodefactorypath containers project workspace level data jproj file system util filesystemutil write string to file writestringtofile wksp file wkspfile data file system util filesystemutil write string to file writestringtoifile proj file projfile data restore defaults deleting factorypath file jproj proj file projfile delete wksp file wkspfile delete io exception ioexception core exception coreexception status i status istatus error apt plugin aptplugin plugin messages factory path util factorypathutil status io exception ioexception returns xml string encoding factories param factories string encode factory path encodefactorypath map factory container factorycontainer factory path factorypath attributes factories string builder stringbuilder string builder stringbuilder nls nls append append factorypath tag append map entry factory container factorycontainer factory path factorypath attributes entry factories entry set entryset factory container factorycontainer container entry get key getkey factory path factorypath attributes attr entry get value getvalue append indent nls append nls append factorypath entry tag append nls nls append kind append append container get type gettype append nls nls append append append container get id getid append nls nls append enabled append append attr is enabled isenabled append nls nls append batch mode append append attr run in batch mode runinbatchmode append nls nls append append factorypath tag append to string tostring create factory container based external jar file workspace param jar java file representing jar file factory container factorycontainer new ext jar factory container newextjarfactorycontainer file jar ext jar factory container extjarfactorycontainer jar create factory container based jar file workspace param jar eclipse i path ipath representing jar file path relative workspace root factory container factorycontainer new wksp jar factory container newwkspjarfactorycontainer i path ipath jar wksp jar factory container wkspjarfactorycontainer jar create factory container based external jar file classpath variable path relative variable param jar eclipse i path ipath representing jar file segment path assumed variable factory container factorycontainer new var jar factory container newvarjarfactorycontainer i path ipath jar var jar factory container varjarfactorycontainer jar map factory container factorycontainer factory path factorypath attributes decode factory path decodefactorypath string xml factory path xmlfactorypath core exception coreexception map factory container factorycontainer factory path factorypath attributes result linked hash map linkedhashmap string reader stringreader reader string reader stringreader xml factory path xmlfactorypath element fp element fpelement document builder documentbuilder parser document builder factory documentbuilderfactory new instance newinstance new document builder newdocumentbuilder fp element fpelement parser parse input source inputsource reader get document element getdocumentelement io exception ioexception core exception coreexception status i status istatus error apt plugin aptplugin plugin messages factory path util factorypathutil status io exception ioexception sax exception saxexception core exception coreexception status i status istatus error apt plugin aptplugin plugin messages factory path util factorypathutil status could not parse couldnotparse parser configuration exception parserconfigurationexception core exception coreexception status i status istatus error apt plugin aptplugin plugin messages factory path util factorypathutil status parser config error parserconfigerror reader close fp element fpelement get node name getnodename equals ignore case equalsignorecase factorypath tag nls io exception ioexception io exception ioexception incorrect file format file factorypath tag core exception coreexception status i status istatus error apt plugin aptplugin plugin messages factory path util factorypathutil status io exception ioexception node list nodelist nodes fp element fpelement get elements by tag name getelementsbytagname factorypath entry tag nodes get length getlength node node nodes item node get node type getnodetype node element node element element element node string kind string kindstring element get attribute getattribute kind deprecated container type jar extjar nls jar equals kind string kindstring nls kind string kindstring nls extjar string id string idstring element get attribute getattribute string enabled string enabledstring element get attribute getattribute enabled string run in apt mode string runinaptmodestring element get attribute getattribute batch mode factory type factorytype kind factory type factorytype value of valueof kind string kindstring factory container factorycontainer container kind wkspjar container new wksp jar factory container newwkspjarfactorycontainer path id string idstring extjar container new ext jar factory container newextjarfactorycontainer file id string idstring var jar varjar container new var jar factory container newvarjarfactorycontainer path id string idstring plugin container factory plugin manager factorypluginmanager get plugin factory container getpluginfactorycontainer id string idstring nls nls illegal state exception illegalstateexception unrecognized kind kind original string kind string kindstring container factory path factorypath attributes factory path factorypath attributes parse boolean parseboolean enabled string enabledstring parse boolean parseboolean run in apt mode string runinaptmodestring result container result file designator workspace level factory path settings file typically workspace metadata plugins org eclipse jdt apt core factorypath java file file get file for workspace getfileforworkspace apt plugin aptplugin get plugin getplugin get state location getstatelocation append factorypath file to file tofile eclipse i file ifile project level factory path settings file typically project factorypath param jproj eclipse i file ifile i file ifile get file for project getifileforproject i java project ijavaproject jproj i project iproject proj jproj get project getproject proj get file getfile factorypath file factory path file exist project workspace param jproj check workspace level settings settings file exists does factory path file exist doesfactorypathfileexist i java project ijavaproject jproj jproj file wksp file wkspfile get file for workspace getfileforworkspace wksp file wkspfile exists i file ifile proj file projfile get file for project getifileforproject jproj proj file projfile exists calculates active factory path project depends stored factorypath file plugins load time eclipse instance returns containers project including disabled param jproj java project question workspace ordered map key container container enabled map factory container factorycontainer factory path factorypath attributes calculate path calculatepath i java project ijavaproject jproj map factory container factorycontainer factory path factorypath attributes map found per proj file foundperprojfile jproj map factory path util factorypathutil read factory path file readfactorypathfile jproj found per proj file foundperprojfile map core exception coreexception apt plugin aptplugin log factory containers project jproj workspace project data map map factory path util factorypathutil read factory path file readfactorypathfile core exception coreexception apt plugin aptplugin log factory containers project jproj project workspace data defaults map map linked hash map linkedhashmap disable new plugins disablenewplugins jproj found per proj file foundperprojfile update plugin containers updateplugincontainers map disable new plugins disablenewplugins map removes missing plugin containers adds plugin containers map originally created order original list main tained maintained entries list alphabetic order list contents plugin factory map loaded plugins order close input param path factory path raw map form modified param disable new plugins disablenewplugins newly discovered plugins disabled enabled disabled setting extension declaration update plugin containers updateplugincontainers map factory container factorycontainer factory path factorypath attributes path disable new plugins disablenewplugins alphabetically ordered list plugins startup map factory container factorycontainer factory path factorypath attributes plugin containers plugincontainers factory plugin manager factorypluginmanager get all plugin factory containers getallpluginfactorycontainers remove path plugins find startup iterator factory container factorycontainer path key set keyset iterator has next hasnext factory container factorycontainer get type gettype factory container factorycontainer factory type factorytype plugin plugin containers plugincontainers contains key containskey remove discovered config saved map entry factory container factorycontainer factory path factorypath attributes entry plugin containers plugincontainers entry set entryset path contains key containskey entry get key getkey factory path factorypath attributes new attr newattr factory path factorypath attributes old attr oldattr entry get value getvalue disable new plugins disablenewplugins new attr newattr factory path factorypath attributes old attr oldattr run in batch mode runinbatchmode new attr newattr old attr oldattr path entry get key getkey new attr newattr factory path values jproj current workspace factory path workspace prefs project jproj list plugin factories factory i factory path ifactorypath get default factory path getdefaultfactorypath i java project ijavaproject jproj factory path factorypath factory path factorypath jproj set containers setcontainers calculate path calculatepath set containers setcontainers factory plugin manager factorypluginmanager get all plugin factory containers getallpluginfactorycontainers factory path factorypath get factory path getfactorypath i java project ijavaproject jproj map factory container factorycontainer factory path factorypath attributes map calculate path calculatepath jproj factory path factorypath factory path factorypath set containers setcontainers map set factory path setfactorypath i java project ijavaproject jproj factory path factorypath path core exception coreexception map factory container factorycontainer factory path factorypath attributes map path path get all containers getallcontainers save factory path file savefactorypathfile jproj map