licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache catalina core java io exception ioexception javax servlet request dispatcher requestdispatcher javax servlet servlet exception servletexception javax servlet http http servlet response httpservletresponse org apache catalina container org apache catalina wrapper org apache catalina comet comet event cometevent org apache catalina connector request org apache catalina connector response org apache catalina valves valve base valvebase org apache tomcat util buf message bytes messagebytes valve basic behavior code standard context standardcontext code container implementation usage constraint implementation processing http requests author craig mc clanahan mcclanahan standard context valve standardcontextvalve valve base valvebase standard context valve standardcontextvalve descriptive implementation string info org apache catalina core standard context valve standardcontextvalve descriptive valve implementation override string get info getinfo info standard context standardcontext needed org apache catalina contained set container setcontainer org apache catalina container override set container setcontainer container container set container setcontainer container select child wrapper process request based request uri matching wrapper http error param request request processed param response response produced exception io exception ioexception input output error occurred exception servlet exception servletexception servlet error occurred override invoke request request response response io exception ioexception servlet exception servletexception disallow direct access resources web inf meta inf message bytes messagebytes request path b requestpathmb request get request path b getrequestpathmb request path b requestpathmb starts with ignore case startswithignorecase meta inf request path b requestpathmb equals ignore case equalsignorecase meta inf request path b requestpathmb starts with ignore case startswithignorecase web inf request path b requestpathmb equals ignore case equalsignorecase web inf response send error senderror http servlet response httpservletresponse select wrapper request wrapper wrapper request get wrapper getwrapper wrapper wrapper is unavailable isunavailable response send error senderror http servlet response httpservletresponse acknowledge request response send ack now ledgement sendacknowledgement io exception ioexception ioe container get logger getlogger error get string getstring standard context valve standardcontextvalve ack now ledge exception acknowledgeexception ioe request set attribute setattribute request dispatcher requestdispatcher error exception ioe response send error senderror http servlet response httpservletresponse internal server error request is async supported isasyncsupported request set async supported setasyncsupported wrapper get pipeline getpipeline is async supported isasyncsupported wrapper get pipeline getpipeline get first getfirst invoke request response select child wrapper process request based request uri matching wrapper http error param request request processed param response response produced param event exception io exception ioexception input output error occurred exception servlet exception servletexception servlet error occurred override event request request response response comet event cometevent event io exception ioexception servlet exception servletexception select wrapper request wrapper wrapper request get wrapper getwrapper wrapper get pipeline getpipeline get first getfirst event request response event