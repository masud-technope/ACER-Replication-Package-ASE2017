licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache catalina filters java i o exception ioexception java text simple date format simpledateformat java util java util enumeration javax servlet filter javax servlet filter chain filterchain javax servlet filter config filterconfig javax servlet servlet exception servletexception javax servlet servlet request servletrequest javax servlet servlet response servletresponse javax servlet http cookie javax servlet http http servlet request httpservletrequest javax servlet http http servlet response httpservletresponse org apache juli logging log org apache juli logging log factory logfactory implementation filter logs int eresting interesting contents request processing response processing debug ging debugging problems headers cookies filter recommended code org apache catalina filter request dumper filter requestdumperfilter code logger dir ected directed dedicated file code org apache juli verbatim form mater verbatimformmater code author craig mc clanahan mcclanahan request dumper filter requestdumperfilter filter string http req msg http request string http res msg http response thread local threadlocal timestamp timestamp thread local threadlocal timestamp override timestamp initial value initialvalue timestamp logger log log log factory logfactory get log getlog request dumper filter requestdumperfilter log int eresting interesting request parameters invoke filter sequence log int eresting interesting response parameters param request servlet request processed param response servlet response created param chain filter chain processed exception i o exception ioexception input output error occurs exception servlet exception servletexception servlet error occurs override do filter dofilter servlet request servletrequest request servlet response servletresponse response filter chain filterchain chain i o exception ioexception servlet exception servletexception http servlet request httpservletrequest h request hrequest http servlet response httpservletresponse h response hresponse request http servlet request httpservletrequest h request hrequest http servlet request httpservletrequest request response http servlet response httpservletresponse h response hresponse http servlet response httpservletresponse response log pre service do log dolog start time get timestamp gettimestamp h request hrequest do log dolog requesturi http req msg do log dolog auth type authtype http req msg do log dolog requesturi h request hrequest getrequesturi do log dolog auth type authtype h request hrequest get auth type getauthtype do log dolog character encoding characterencoding request get character encoding getcharacterencoding do log dolog content length contentlength integer to string tostring request get content length getcontentlength do log dolog content type contenttype request get content type getcontenttype h request hrequest do log dolog context path contextpath http req msg do log dolog cookie http req msg do log dolog header http req msg do log dolog context path contextpath h request hrequest get context path getcontextpath cookie cookies h request hrequest get cookies getcookies cookies cookies length do log dolog cookie cookies get name getname cookies get value getvalue enumeration string hnames h request hrequest get header names getheadernames hnames has more elements hasmoreelements string hname hnames next element nextelement enumeration string hvalues h request hrequest get headers getheaders hname hvalues has more elements hasmoreelements string h value hvalue hvalues next element nextelement do log dolog header hname h value hvalue do log dolog locale request get locale getlocale to string tostring h request hrequest do log dolog method http req msg do log dolog method h request hrequest get method getmethod enumeration string pnames request get parameter names getparameternames pnames has more elements hasmoreelements string pname pnames next element nextelement string pvalues request get parameter values getparametervalues pname string builder stringbuilder result string builder stringbuilder pname result append pvalues length result append result append pvalues do log dolog parameter result to string tostring h request hrequest do log dolog path info pathinfo http req msg do log dolog path info pathinfo h request hrequest get path info getpathinfo do log dolog protocol request get protocol getprotocol h request hrequest do log dolog query string querystring http req msg do log dolog query string querystring h request hrequest get query string getquerystring do log dolog remote addr remoteaddr request get remote addr getremoteaddr do log dolog remote host remotehost request get remote host getremotehost h request hrequest do log dolog remote user remoteuser http req msg do log dolog requested session id requestedsessionid http req msg do log dolog remote user remoteuser h request hrequest get remote user getremoteuser do log dolog requested session id requestedsessionid h request hrequest get requested session id getrequestedsessionid do log dolog scheme request get scheme getscheme do log dolog server name servername request get server name getservername do log dolog server port serverport integer to string tostring request get server port getserverport h request hrequest do log dolog servlet path servletpath http req msg do log dolog servlet path servletpath h request hrequest get servlet path getservletpath do log dolog is secure issecure value of valueof request is secure issecure to string tostring do log dolog perform request chain do filter dofilter request response log post service do log dolog h request hrequest do log dolog auth type authtype http req msg do log dolog auth type authtype h request hrequest get auth type getauthtype do log dolog content type contenttype response get content type getcontenttype h response hresponse do log dolog header http res msg iterable string rhnames h response hresponse get header names getheadernames string rhname rhnames iterable string rhvalues h response hresponse get headers getheaders rhname string rhvalue rhvalues do log dolog header rhname rhvalue h request hrequest do log dolog remote user remoteuser http req msg do log dolog remote user remoteuser h request hrequest get remote user getremoteuser h response hresponse do log dolog remote user remoteuser http res msg do log dolog status integer to string tostring h response hresponse get status getstatus do log dolog time get timestamp gettimestamp do log dolog do log dolog string attribute string string builder stringbuilder string builder stringbuilder append thread current thread currentthread get name getname append append attribute append append log info to string tostring string get timestamp gettimestamp timestamp timestamp current time currenttime system current time millis currenttimemillis get time gettime current time currenttime set time settime current time currenttime current time currenttime update date string datestring override init filter config filterconfig filter config filterconfig servlet exception servletexception noop override destroy noop timestamp simple date format simpledateformat format simple date format simpledateformat mmm yyyy string date string datestring format format update date string datestring format format