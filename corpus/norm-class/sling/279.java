licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache sling distribution agent impl java util hash set hashset java util map java util org apache felix scr annotations activate org apache felix scr annotations component org apache felix scr annotations configuration policy configurationpolicy org apache felix scr annotations deactivate org apache felix scr annotations property org apache felix scr annotations property option propertyoption org apache felix scr annotations reference org apache felix scr annotations reference cardinality referencecardinality org apache felix scr annotations reference policy referencepolicy org apache jackrabbit vault packaging packaging org apache sling api resource resource resolver factory resourceresolverfactory org apache sling commons osgi properties util propertiesutil org apache sling distribution distribution request type distributionrequesttype org apache sling distribution component impl distribution component constants distributioncomponentconstants org apache sling distribution component impl settings utils settingsutils org apache sling distribution event impl distribution event factory distributioneventfactory org apache sling distribution log impl default distribution log defaultdistributionlog org apache sling distribution packaging distribution package exporter distributionpackageexporter org apache sling distribution packaging distribution package importer distributionpackageimporter org apache sling distribution packaging impl exporter remote distribution package exporter remotedistributionpackageexporter org apache sling distribution packaging impl importer local distribution package importer localdistributionpackageimporter org apache sling distribution queue distribution queue provider distributionqueueprovider org apache sling distribution queue impl distribution queue dispatching strategy distributionqueuedispatchingstrategy org apache sling distribution queue impl single queue dispatching strategy singlequeuedispatchingstrategy org apache sling distribution queue impl job handling jobhandling job handling distribution queue provider jobhandlingdistributionqueueprovider org apache sling distribution serialization distribution package builder distributionpackagebuilder org apache sling distribution transport distribution transport secret provider distributiontransportsecretprovider org apache sling distribution transport impl transport endpoint strategy type transportendpointstrategytype org apache sling distribution trigger distribution trigger distributiontrigger org apache sling event jobs job manager jobmanager org apache sling jcr api sling repository slingrepository org apache sling settings sling settings service slingsettingsservice org osgi framework bundle context bundlecontext org slf logger org slf logger factory loggerfactory osg i osgi service factory link org apache sling distribution agent distribution agent distributionagent references existing osg i osgi services component metatype label apache sling distribution agent reverse agents factory description osg i osgi configuration factory reverse age nts agents configuration factory configurationfactory spec version specversion policy configuration policy configurationpolicy require reference triggers reference interface referenceinterface distribution trigger distributiontrigger policy reference policy referencepolicy dynamic cardinality reference cardinality referencecardinality optional multiple bind bind distribution trigger binddistributiontrigger unbind unbind distribution trigger unbinddistributiontrigger reverse distribution agent factory reversedistributionagentfactory abstract distribution agent factory abstractdistributionagentfactory logger log logger factory loggerfactory get logger getlogger get class getclass property label description agent string distribution component constants distributioncomponentconstants property label title description display friendly title agent string title title property label details description display friendly details agent string details details property bool value boolvalue label enabled description start distribution agent string enabled enabled property label service description service access repository string service service name servicename property options property option propertyoption debug debug property option propertyoption info info property option propertyoption warn warn property option propertyoption error error info label log level description log level recorded log accessible http string log level abstract distribution agent factory abstractdistributionagentfactory log level property bool value boolvalue label queue processing enabled description distribution agent process packages queues string queue processing enabled queue processing enabled end points endpoints property property cardinality label importer end points endpoints description list end points endpoints packages received exported string exporter end points endpoints package exporter packageexporter end points endpoints items poll property property int value intvalue label pull items description number subsequent pull requests string pull items pull items property request authorization strategy requestauthorizationstrategy target label request authorization strategy description target reference distribution request authorization strategy distributionrequestauthorizationstrategy auth orize authorize access distribution process target bind services settings utils settingsutils component reference request authorization strategy requestauthorizationstrategy distribution request authorization strategy distributionrequestauthorizationstrategy request authorization strategy requestauthorizationstrategy property transport secret provider transportsecretprovider target label transport secret provider description target reference distribution transport secret provider distributiontransportsecretprovider credentials accessing remote end points endpoints target bind services settings utils settingsutils component reference transport secret provider transportsecretprovider distribution transport secret provider distributiontransportsecretprovider transport secret provider transportsecretprovider property package builder packagebuilder target label builder description target reference distribution package builder distributionpackagebuilder create distribution packages target bind services settings utils settingsutils component reference package builder packagebuilder distribution package builder distributionpackagebuilder package builder packagebuilder property trigger target label triggers description target reference distribution trigger distributiontrigger trigger distribution target bind services string triggers target triggers target reference packaging packaging reference distribution event factory distributioneventfactory distribution event factory distributioneventfactory reference sling settings service slingsettingsservice settings service settingsservice reference job manager jobmanager job manager jobmanager reference resource resolver factory resourceresolverfactory resource resolver factory resourceresolverfactory reference sling repository slingrepository sling repository slingrepository activate activate bundle context bundlecontext context map string object config activate context config bind distribution trigger binddistributiontrigger distribution trigger distributiontrigger distribution trigger distributiontrigger map string object config bind distribution trigger binddistributiontrigger distribution trigger distributiontrigger config unbind distribution trigger unbinddistributiontrigger distribution trigger distributiontrigger distribution trigger distributiontrigger map string object config unbind distribution trigger unbinddistributiontrigger distribution trigger distributiontrigger config deactivate deactivate bundle context bundlecontext context deactivate context override simple distribution agent simpledistributionagent create agent createagent string agent name agentname bundle context bundlecontext context map string object config default distribution log defaultdistributionlog distribution log distributionlog string service name servicename properties util propertiesutil to string tostring config service queue processing enabled queueprocessingenabled properties util propertiesutil to boolean toboolean config queue processing enabled string exporter end points exporterendpoints properties util propertiesutil to string array tostringarray config exporter end points endpoints string exporter end points exporterendpoints settings utils settingsutils remove empty entries removeemptyentries exporter end points exporterendpoints pull items pullitems properties util propertiesutil to integer tointeger config pull items integer max distribution package exporter distributionpackageexporter package exporter packageexporter remote distribution package exporter remotedistributionpackageexporter distribution log distributionlog package builder packagebuilder transport secret provider transportsecretprovider exporter end points exporterendpoints transport endpoint strategy type transportendpointstrategytype pull items pullitems distribution package importer distributionpackageimporter package importer packageimporter local distribution package importer localdistributionpackageimporter package builder packagebuilder distribution queue provider distributionqueueprovider queue provider queueprovider job handling distribution queue provider jobhandlingdistributionqueueprovider agent name agentname job manager jobmanager context distribution queue dispatching strategy distributionqueuedispatchingstrategy export queue strategy exportqueuestrategy single queue dispatching strategy singlequeuedispatchingstrategy distribution queue dispatching strategy distributionqueuedispatchingstrategy import queue strategy importqueuestrategy distribution request type distributionrequesttype allowed requests allowedrequests distribution request type distributionrequesttype distribution request type distributionrequesttype pull string processing queues processingqueues hash set hashset string processing queues processingqueues add all addall export queue strategy exportqueuestrategy get queue names getqueuenames simple distribution agent simpledistributionagent agent name agentname queue processing enabled queueprocessingenabled processing queues processingqueues service name servicename package importer packageimporter package exporter packageexporter request authorization strategy requestauthorizationstrategy queue provider queueprovider export queue strategy exportqueuestrategy import queue strategy importqueuestrategy distribution event factory distributioneventfactory resource resolver factory resourceresolverfactory sling repository slingrepository distribution log distributionlog allowed requests allowedrequests