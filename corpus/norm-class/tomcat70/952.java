licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache coyote ajp java file java io exception ioexception java print writer printwriter java util hash map hashmap java util locale java util map javax servlet servlet context servletcontext javax servlet servlet exception servletexception javax servlet http http servlet httpservlet javax servlet http http servlet request httpservletrequest javax servlet http http servlet response httpservletresponse org junit org junit test org apache catalina context org apache catalina startup tomcat org apache catalina startup tomcat base test tomcatbasetest test abstract ajp processor testabstractajpprocessor tomcat base test tomcatbasetest override string get protocol getprotocol tests setup http convert protocol values ajp protocol string protocol system get property getproperty tomcat test protocol bio protocol protocol org apache coyote ajp ajp protocol ajpprotocol protocol nio protocol org apache coyote ajp ajp nio protocol ajpnioprotocol protocol apr protocol org apache coyote ajp ajp apr protocol ajpaprprotocol protocol org apache coyote ajp ajp protocol ajpprotocol protocol do snoop test dosnooptest request descriptor requestdescriptor desc exception ajp packet size ajppacketsize map string string request info requestinfo desc get request info getrequestinfo map string string context init parameters contextinitparameters desc get context init parameters getcontextinitparameters map string string context attributes contextattributes desc get context attributes getcontextattributes map string string headers desc get headers getheaders map string string attributes desc get attributes getattributes map string string params desc get params getparams tomcat tomcat get tomcat instance gettomcatinstance tomcat get connector getconnector set property setproperty packet size packetsize integer to string tostring ajp packet size ajppacketsize file system doc base docbase required context ctx tomcat add context addcontext tomcat add servlet addservlet ctx snoop snoop servlet snoopservlet ctx add servlet mapping addservletmapping snoop simple ajp client simpleajpclient ajp client ajpclient simple ajp client simpleajpclient ajp packet size ajppacketsize request info requestinfo request query string params size illegal argument exception illegalargumentexception request setting request query string explicit params allowed string body size bodysize map string string saved request info savedrequestinfo hash map hashmap string string string request info requestinfo key set keyset request info requestinfo equals request method ajp client ajpclient set method setmethod equals request protocol ajp client ajpclient set protocol setprotocol equals request uri ajp client ajpclient set uri seturi equals request remote host request get remote host getremotehost request get remote addr getremoteaddr enable look ups enablelookups tomcat get connector getconnector set enable look ups setenablelookups ajp client ajpclient set remote host setremotehost equals request remote addr ajp client ajpclient set remote addr setremoteaddr equals request server ajp client ajpclient set server name setservername equals request server port ajp client ajpclient set server port setserverport integer parse int parseint equals request secure ajp client ajpclient set ssl setssl parse boolean parseboolean equals request local addr saved request info savedrequestinfo equals request remote port saved request info savedrequestinfo equals request remote user equals request route equals request secret equals request type equals request query string saved request info savedrequestinfo equals request content length headers content length equals request body size saved request info savedrequestinfo body size bodysize integer parse int parseint equals request content type headers content type implemented easily implement request local request local port request scheme request url request context path request servlet path request path info request path translated request user principal request character encoding request locale session requested session requested cookie session requested url session requested valid illegal argument exception illegalargumentexception request setting supported servlet context servletcontext ctx get servlet context getservletcontext string context init parameters contextinitparameters key set keyset set init parameter setinitparameter context init parameters contextinitparameters string context attributes contextattributes key set keyset set attribute setattribute context attributes contextattributes basic request properties call tester ajp message testerajpmessage forward message forwardmessage ajp client ajpclient create for ward message createforwardmessage string saved request info savedrequestinfo key set keyset saved request info savedrequestinfo equals request local addr forward message forwardmessage add attribute addattribute ajp local addr equals request remote port forward message forwardmessage add attribute addattribute ajp remote port equals request remote user request get remote user getremoteuser trust ajp info tomcat authentication tomcatauthentication tomcat get connector getconnector set property setproperty tomcat authentication tomcatauthentication forward message forwardmessage add attribute addattribute equals request type request get auth type getauthtype trust ajp info tomcat authentication tomcatauthentication tomcat get connector getconnector set property setproperty tomcat authentication tomcatauthentication forward message forwardmessage add attribute addattribute equals request query string forward message forwardmessage add attribute addattribute equals request route forward message forwardmessage add attribute addattribute equals request secret forward message forwardmessage add attribute addattribute equals request body size illegal argument exception illegalargumentexception request setting supported params size string builder stringbuilder query string builder stringbuilder sep string params key set keyset sep query append sep query append query append query append params forward message forwardmessage add attribute addattribute query to string tostring string headers key set keyset headers to upper case touppercase locale english equals accept forward message forwardmessage add header addheader equals accept charset forward message forwardmessage add header addheader equals accept encoding forward message forwardmessage add header addheader equals accept language forward message forwardmessage add header addheader equals auth orization authorization forward message forwardmessage add header addheader equals connection forward message forwardmessage add header addheader equals content type forward message forwardmessage add header addheader equals content length forward message forwardmessage add header addheader equals cookie forward message forwardmessage add header addheader equals cookie forward message forwardmessage add header addheader equals host forward message forwardmessage add header addheader equals pragma forward message forwardmessage add header addheader equals ref erer referer forward message forwardmessage add header addheader equals user agent forward message forwardmessage add header addheader forward message forwardmessage add header addheader string attributes key set keyset attributes forward message forwardmessage add attribute addattribute complete message forward message forwardmessage tomcat start ajp client ajpclient set port setport get port getport ajp client ajpclient connect tester ajp message testerajpmessage response headers responseheaders body size bodysize response headers responseheaders ajp client ajpclient send message sendmessage forward message forwardmessage tester ajp message testerajpmessage body message bodymessage ajp client ajpclient create body message createbodymessage body size bodysize response headers responseheaders ajp client ajpclient send message sendmessage forward message forwardmessage body message bodymessage expect request data emty trigger stream servlet validate get body validategetbody response headers responseheaders body message bodymessage ajp client ajpclient create body message createbodymessage response headers responseheaders ajp client ajpclient send message sendmessage body message bodymessage expect pack ets packets headers body validate response headers validateresponseheaders response headers responseheaders string body extract response body extractresponsebody ajp client ajpclient read message readmessage request descriptor requestdescriptor result snoop result snoopresult parse body ajp attributes result coyote request attributes listed request get attribute names getattributenames snoop servlet snoopservlet delete attributes result comparison desc get attributes getattributes clear result compare desc validate response end validateresponseend ajp client ajpclient read message readmessage test test server name testservername exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put request info putrequestinfo request server myserver desc put request info putrequestinfo request uri test server name testservername do snoop test dosnooptest desc test test server port testserverport exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put request info putrequestinfo request server port desc put request info putrequestinfo request uri test server port testserverport do snoop test dosnooptest desc test test local addr testlocaladdr exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put request info putrequestinfo request local addr desc put request info putrequestinfo request uri test local addr testlocaladdr do snoop test dosnooptest desc test test remote host testremotehost exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put request info putrequestinfo request remote host myclient desc put request info putrequestinfo request uri test remote host testremotehost do snoop test dosnooptest desc test test remote addr testremoteaddr exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put request info putrequestinfo request remote addr desc put request info putrequestinfo request uri test remote addr testremoteaddr do snoop test dosnooptest desc test test remote port testremoteport exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put request info putrequestinfo request remote port desc put request info putrequestinfo request uri test remote port testremoteport do snoop test dosnooptest desc test test method testmethod exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put request info putrequestinfo request method lock desc put request info putrequestinfo request uri test method testmethod do snoop test dosnooptest desc test test uri testuri exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put request info putrequestinfo request uri do snoop test dosnooptest desc test test protocol testprotocol exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put request info putrequestinfo request protocol http desc put request info putrequestinfo request uri test protocol testprotocol do snoop test dosnooptest desc test test secure testsecure exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put request info putrequestinfo request secure desc put request info putrequestinfo request uri test secure testsecure do snoop test dosnooptest desc test test query string testquerystring exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put request info putrequestinfo request query string desc put request info putrequestinfo request uri test query string testquerystring do snoop test dosnooptest desc test test remote user testremoteuser exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put request info putrequestinfo request remote user myuser desc put request info putrequestinfo request uri test remote user testremoteuser do snoop test dosnooptest desc test test auth type testauthtype exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put request info putrequestinfo request type my auth myauth desc put request info putrequestinfo request uri test auth type testauthtype do snoop test dosnooptest desc test test one header testoneheader exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put header putheader myheader myheader desc put request info putrequestinfo request uri test one header testoneheader do snoop test dosnooptest desc test test one attribute testoneattribute exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put attribute putattribute myattribute myattribute desc put request info putrequestinfo request uri test one attribute testoneattribute do snoop test dosnooptest desc test test multi testmulti exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put request info putrequestinfo request server myserver desc put request info putrequestinfo request server port desc put request info putrequestinfo request local addr desc put request info putrequestinfo request remote host myclient desc put request info putrequestinfo request remote addr desc put request info putrequestinfo request remote port desc put request info putrequestinfo request method lock desc put request info putrequestinfo request uri desc put request info putrequestinfo request protocol http desc put request info putrequestinfo request secure desc put request info putrequestinfo request query string desc put request info putrequestinfo request remote user myuser desc put request info putrequestinfo request type my auth myauth desc put header putheader myheader myheader desc put header putheader myheader myheader desc put attribute putattribute myattribute myattribute desc put attribute putattribute myattribute myattribute do snoop test dosnooptest desc test test small body testsmallbody exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put request info putrequestinfo request method desc put request info putrequestinfo request content length desc put request info putrequestinfo request body size desc put request info putrequestinfo request uri test small body testsmallbody do snoop test dosnooptest desc test test l arg e body testlargebody exception request descriptor requestdescriptor desc request descriptor requestdescriptor desc put request info putrequestinfo request method desc put request info putrequestinfo request content length desc put request info putrequestinfo request body size desc put request info putrequestinfo request uri test l arg e body testlargebody do snoop test dosnooptest desc test test secret testsecret exception tomcat tomcat get tomcat instance gettomcatinstance tomcat get connector getconnector set property setproperty required secret requiredsecret right secret rightsecret tomcat start file system doc base docbase required context ctx tomcat add context addcontext tomcat add servlet addservlet ctx hello world helloworld hello world servlet helloworldservlet ctx add servlet mapping addservletmapping hello world helloworld simple ajp client simpleajpclient ajp client ajpclient simple ajp client simpleajpclient ajp client ajpclient set port setport get port getport ajp client ajpclient connect validate cpong validatecpong ajp client ajpclient cping tester ajp message testerajpmessage forward message forwardmessage ajp client ajpclient create for ward message createforwardmessage forward message forwardmessage tester ajp message testerajpmessage response headers responseheaders ajp client ajpclient send message sendmessage forward message forwardmessage expect pack ets packets headers body validate response headers validateresponseheaders response headers responseheaders for bidden forbidden tester ajp message testerajpmessage response body responsebody ajp client ajpclient read message readmessage validate response body validateresponsebody response body responsebody hello world servlet helloworldservlet response text validate response end validateresponseend ajp client ajpclient read message readmessage ajp client ajpclient connect validate cpong validatecpong ajp client ajpclient cping forward message forwardmessage ajp client ajpclient create for ward message createforwardmessage forward message forwardmessage add attribute addattribute wrongsecret forward message forwardmessage response headers responseheaders ajp client ajpclient send message sendmessage forward message forwardmessage expect pack ets packets headers body validate response headers validateresponseheaders response headers responseheaders for bidden forbidden response body responsebody ajp client ajpclient read message readmessage validate response body validateresponsebody response body responsebody hello world servlet helloworldservlet response text validate response end validateresponseend ajp client ajpclient read message readmessage ajp client ajpclient connect validate cpong validatecpong ajp client ajpclient cping forward message forwardmessage ajp client ajpclient create for ward message createforwardmessage forward message forwardmessage add attribute addattribute right secret rightsecret forward message forwardmessage response headers responseheaders ajp client ajpclient send message sendmessage forward message forwardmessage expect pack ets packets headers body validate response headers validateresponseheaders response headers responseheaders tester ajp message testerajpmessage response body responsebody ajp client ajpclient read message readmessage validate response body validateresponsebody response body responsebody hello world servlet helloworldservlet response text validate response end validateresponseend ajp client ajpclient read message readmessage ajp client ajpclient disconnect test test keep alive testkeepalive exception tomcat tomcat get tomcat instance gettomcatinstance tomcat get connector getconnector set property setproperty connection timeout connectiontimeout tomcat start file system doc base docbase required context ctx tomcat add context addcontext tomcat add servlet addservlet ctx hello world helloworld hello world servlet helloworldservlet ctx add servlet mapping addservletmapping hello world helloworld simple ajp client simpleajpclient ajp client ajpclient simple ajp client simpleajpclient ajp client ajpclient set port setport get port getport ajp client ajpclient connect validate cpong validatecpong ajp client ajpclient cping tester ajp message testerajpmessage forward message forwardmessage ajp client ajpclient create for ward message createforwardmessage forward message forwardmessage add header addheader dummy header ignore complete message extra headers required forward message forwardmessage requests tester ajp message testerajpmessage response headers responseheaders ajp client ajpclient send message sendmessage forward message forwardmessage expect pack ets packets headers body validate response headers validateresponseheaders response headers responseheaders tester ajp message testerajpmessage response body responsebody ajp client ajpclient read message readmessage validate response body validateresponsebody response body responsebody hello world servlet helloworldservlet response text validate response end validateresponseend ajp client ajpclient read message readmessage connections plenty time time thread sleep check connection open validate cpong validatecpong ajp client ajpclient cping ajp client ajpclient disconnect test test post testpost exception do test post dotestpost http servlet response httpservletresponse test test post multiple content length testpostmultiplecontentlength exception multiple content len gths lengths do test post dotestpost http servlet response httpservletresponse bad request bad request do test post dotestpost multiplecl expected status expectedstatus string expected message expectedmessage exception tomcat tomcat get tomcat instance gettomcatinstance normal tomcat root context file root file test webapp tomcat add webapp addwebapp root get absolute path getabsolutepath tomcat start simple ajp client simpleajpclient ajp client ajpclient simple ajp client simpleajpclient ajp client ajpclient set port setport get port getport ajp client ajpclient connect validate cpong validatecpong ajp client ajpclient cping ajp client ajpclient set uri seturi echo params jsp ajp client ajpclient set method setmethod post tester ajp message testerajpmessage forward message forwardmessage ajp client ajpclient create for ward message createforwardmessage forward message forwardmessage add header addheader multiplecl forward message forwardmessage add header addheader forward message forwardmessage add header addheader application form url encoded urlencoded forward message forwardmessage tester ajp message testerajpmessage body message bodymessage ajp client ajpclient create body message createbodymessage test data get bytes getbytes tester ajp message testerajpmessage response headers responseheaders ajp client ajpclient send message sendmessage forward message forwardmessage body message bodymessage validate response headers validateresponseheaders response headers responseheaders expected status expectedstatus expected message expectedmessage expected status expectedstatus http servlet response httpservletresponse expect messages headers body valid request tester ajp message testerajpmessage response body responsebody ajp client ajpclient read message readmessage validate response body validateresponsebody response body responsebody test data validate response end validateresponseend ajp client ajpclient read message readmessage check connection open validate cpong validatecpong ajp client ajpclient cping expect messages headers invalid request validate response end validateresponseend ajp client ajpclient read message readmessage ajp client ajpclient disconnect bug test test with body withbody exception tomcat tomcat get tomcat instance gettomcatinstance file system doc base docbase required context ctx tomcat add context addcontext tomcat add servlet addservlet ctx bug tester with body servlet withbodyservlet ctx add servlet mapping addservletmapping bug tomcat start simple ajp client simpleajpclient ajp client ajpclient simple ajp client simpleajpclient ajp client ajpclient set port setport get port getport ajp client ajpclient connect validate cpong validatecpong ajp client ajpclient cping tester ajp message testerajpmessage forward message forwardmessage ajp client ajpclient create for ward message createforwardmessage forward message forwardmessage tester ajp message testerajpmessage response headers responseheaders ajp client ajpclient send message sendmessage forward message forwardmessage expect messages headers validate response headers validateresponseheaders response headers responseheaders modified validate response end validateresponseend ajp client ajpclient read message readmessage check connection open validate cpong validatecpong ajp client ajpclient cping ajp client ajpclient disconnect test test l arg e response testlargeresponse exception ajp packet size ajppacketsize tomcat tomcat get tomcat instance gettomcatinstance tomcat get connector getconnector set property setproperty packet size packetsize integer to string tostring ajp packet size ajppacketsize file system doc base docbase required context ctx tomcat add context addcontext fixed response size servlet fixedresponsesizeservlet servlet fixed response size servlet fixedresponsesizeservlet tomcat add servlet addservlet ctx fixed response size servlet fixedresponsesizeservlet servlet ctx add servlet mapping addservletmapping fixed response size servlet fixedresponsesizeservlet tomcat start simple ajp client simpleajpclient ajp client ajpclient simple ajp client simpleajpclient ajp packet size ajppacketsize ajp client ajpclient set port setport get port getport ajp client ajpclient connect validate cpong validatecpong ajp client ajpclient cping ajp client ajpclient set uri seturi tester ajp message testerajpmessage forward message forwardmessage ajp client ajpclient create for ward message createforwardmessage forward message forwardmessage tester ajp message testerajpmessage response headers responseheaders ajp client ajpclient send message sendmessage forward message forwardmessage expect messages headers body valid request validate response headers validateresponseheaders response headers responseheaders tester ajp message testerajpmessage response body responsebody ajp client ajpclient read message readmessage assert true asserttrue response body responsebody len validate response end validateresponseend ajp client ajpclient read message readmessage check connection open validate cpong validatecpong ajp client ajpclient cping ajp client ajpclient disconnect process response header packet checks status data validate response headers validateresponseheaders tester ajp message testerajpmessage message expected status expectedstatus string expected message expectedmessage exception bytes assert equals assertequals message buf assert equals assertequals message buf start position read length message process header processheader check length assert true asserttrue message len header message assert equals assertequals message read byte readbyte check status assert equals assertequals expected status expectedstatus message read int readint check reason phrase assert equals assertequals expected message expectedmessage message read string readstring number headers header count headercount message read int readint header count headercount read header message read header name readheadername read header message read string readstring validate get body validategetbody tester ajp message testerajpmessage message bytes assert equals assertequals message buf assert equals assertequals message buf body chunk message assert equals assertequals message read byte readbyte extract content response message string extract response body extractresponsebody tester ajp message testerajpmessage message exception assert equals assertequals message buf assert equals assertequals message buf start position read length message process header processheader body chunk message assert equals assertequals message read byte readbyte len message read int readint assert true asserttrue len message read string readstring len valid ates validates response message valid expected content validate response body validateresponsebody tester ajp message testerajpmessage message string expected body expectedbody exception string body extract response body extractresponsebody message assert true asserttrue body expected body expectedbody validate response end validateresponseend tester ajp message testerajpmessage message expected reuse expectedreuse assert equals assertequals message buf assert equals assertequals message buf message process header processheader body message assert equals assertequals message read byte readbyte check length assert equals assertequals message get len getlen reuse message read byte readbyte reuse assert equals assertequals value of valueof expected reuse expectedreuse value of valueof reuse validate cpong validatecpong tester ajp message testerajpmessage message exception bytes assert equals assertequals message buf assert equals assertequals message buf cpong message length effectively checks bytes assert equals assertequals message get len getlen data assert equals assertequals message buf tester with body servlet withbodyservlet http servlet httpservlet serialversionuid override do get doget http servlet request httpservletrequest req http servlet response httpservletresponse resp servlet exception servletexception io exception ioexception resp set status setstatus resp get writer getwriter print body permitted response fixed response size servlet fixedresponsesizeservlet http servlet httpservlet serialversionuid response size responsesize buffer size buffersize fixed response size servlet fixedresponsesizeservlet response size responsesize buffer size buffersize response size responsesize response size responsesize buffer size buffersize buffer size buffersize override do get doget http servlet request httpservletrequest req http servlet response httpservletresponse resp servlet exception servletexception io exception ioexception resp set buffer size setbuffersize buffer size buffersize resp set content type setcontenttype text plain resp set character encoding setcharacterencoding utf resp set content length setcontentlength response size responsesize print writer printwriter resp get writer getwriter response size responsesize append