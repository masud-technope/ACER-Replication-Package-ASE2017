licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license javax servlet jsp java io exception ioexception javax servlet request dispatcher requestdispatcher javax servlet servlet javax servlet servlet config servletconfig javax servlet servlet context servletcontext javax servlet servlet exception servletexception javax servlet servlet request servletrequest javax servlet servlet response servletresponse javax servlet http http session httpsession javax servlet jsp tagext body content bodycontent page context pagecontext jsp context jspcontext sole constructor invocation subclass constructors typically implicit page context pagecontext noop scope named reference remains page context pagecontext current servlet service invocation scope request scope named reference remains servlet request servletrequest servlet current request completed request scope session scope valid part icipates participates session named reference remains http session httpsession servlet http session httpsession invalid ated invalidated session scope application scope named reference remains servlet context servletcontext rec laimed reclaimed application scope store servlet page context pagecontext name tables nametables string javax servlet jsp jsp page jsppage store page context pagecontext table string page context pagecontext javax servlet jsp jsp page context jsppagecontext store servlet request servletrequest page context pagecontext table string request javax servlet jsp jsp request jsprequest store servlet response servletresponse page context pagecontext table string response javax servlet jsp jsp response jspresponse store servlet config servletconfig page context pagecontext table string config javax servlet jsp jsp config jspconfig store http session httpsession page context pagecontext table string session javax servlet jsp jsp session jspsession store current jsp writer jspwriter page context pagecontext table string javax servlet jsp jsp out jspout store servlet context servletcontext page context pagecontext table string application javax servlet jsp jsp application jspapplication store uncaught exception servlet request servletrequest attribute list page context pagecontext table string exception javax servlet jsp jsp exception jspexception initialize method called initialize uninitialized page context pagecontext jsp implementation service incoming request response jsp service jspservice method method typically called jsp factory jspfactory get page context getpagecontext order initialize method required create initial jsp writer jspwriter associate scope newly created object method tag library auth ors authors param servlet servlet page context pagecontext param request pending request servlet param response pending response servlet param errorpageurl error page errorpage attribute directive param needs session needssession session attribute directive param buffer size buffersize buffer attribute directive param auto flush autoflush auto flush autoflush attribute directive io exception ioexception creation jsp writer jspwriter illegal state exception illegalstateexception correctly initialized illegal argument exception illegalargumentexception parameters invalid initialize servlet servlet servlet request servletrequest request servlet response servletresponse response string errorpageurl needs session needssession buffer size buffersize auto flush autoflush io exception ioexception illegal state exception illegalstateexception illegal argument exception illegalargumentexception method reset internal page context pagecontext rel easing releasing internal references preparing page context pagecontext potential reuse invocation initialize method typically called jsp factory jspfactory release page context releasepagecontext subclasses env elope envelope method method tag library auth ors authors release current session object http session httpsession http session httpsession page context pagecontext http session httpsession get session getsession current object servlet environment instance javax servlet servlet implementation instance page context pagecontext object get page getpage current request object servlet request servletrequest servlet request servletrequest page context pagecontext servlet request servletrequest get request getrequest current response object servlet response servletresponse servlet response servletresponse page context pagecontext servlet response servletresponse get response getresponse current exception object exception exception passed error page errorpage exception get exception getexception servlet config servletconfig instance servlet config servletconfig page context pagecontext servlet config servletconfig get servlet config getservletconfig servlet context servletcontext instance servlet context servletcontext page context pagecontext servlet context servletcontext get servlet context getservletcontext method direct current servlet request servletrequest servlet response servletresponse active component application relative url path relativeurlpath url calculated relative docroot code servlet context servletcontext code jsp path url calculated relative url request mapped calling jsp valid call method code thread code executing code jsp service jspservice code method jsp method called illegal calling code thread code attempt modify code servlet response servletresponse code object attempt result undefined behavior typically call ers callers code jsp service jspservice code calling method param relative url path relativeurlpath specifies relative url path target resource illegal state exception illegalstateexception code servlet response servletresponse code performed servlet exception servletexception for warded forwarded servlet exception servletexception io exception ioexception error occurred for warding forwarding string relative url path relativeurlpath servlet exception servletexception io exception ioexception resource processed current servlet request servletrequest servlet response servletresponse processed calling thread output target resources processing request written servlet response servletresponse output stream current jsp writer jspwriter jsp flushed side call prior processing include relative url path relativeurlpath url calculated relative docroot code servlet context servletcontext code jsp path url calculated relative url request mapped calling jsp valid call method code thread code executing code jsp service jspservice code method jsp param relative url path relativeurlpath specifies relative url path target resource included servlet exception servletexception for warded forwarded servlet exception servletexception io exception ioexception error occurred for warding forwarding include string relative url path relativeurlpath servlet exception servletexception io exception ioexception resource processed current servlet request servletrequest servlet response servletresponse processed calling thread output target resources processing request written current jsp writer jspwriter returned call get out getout flush current jsp writer jspwriter jsp flushed side call prior processing include jsp writer jspwriter flushed relative url path relativeurlpath url calculated relative docroot code servlet context servletcontext code jsp path url calculated relative url request mapped calling jsp valid call method code thread code executing code jsp service jspservice code method jsp param relative url path relativeurlpath specifies relative url path target resource included param flush jsp writer jspwriter flushed include servlet exception servletexception for warded forwarded servlet exception servletexception io exception ioexception error occurred for warding forwarding include string relative url path relativeurlpath flush servlet exception servletexception io exception ioexception method intended process unhandled level exception for warding forwarding exception error jsp for warding forwarding response committed implementation dependent mechanism invoke error including error error defined exception ret hrown rethrown standard servlet error handling takes jsp implementation typically clean local prior invoking illegal generate output client modify servlet response servletresponse invoking call method compatibility reasons newly generated code page context pagecontext handle page exception handlepageexception throwable param exception handled servlet exception servletexception error occurs invoking error io exception ioexception error occurred invoking error null pointer exception nullpointerexception exception handle page exception handlepageexception throwable handle page exception handlepageexception exception servlet exception servletexception io exception ioexception method intended process unhandled level exception for warding forwarding exception error jsp for warding forwarding response committed implementation dependent mechanism invoke error including error error defined exception ret hrown rethrown standard servlet error handling takes method intended process unhandled level exception redirecting exception error jsp perform implementation dependent action jsp implementation typically clean local prior invoking illegal generate output client modify servlet response servletresponse invoking call param throwable handled servlet exception servletexception error occurs invoking error io exception ioexception error occurred invoking error null pointer exception nullpointerexception exception handle page exception handlepageexception exception handle page exception handlepageexception throwable servlet exception servletexception io exception ioexception body content bodycontent object save current jsp writer jspwriter update attribute scope attribute namespace page context pagecontext body content bodycontent body content bodycontent push body pushbody xxx implement convenient access error error data errordata instance error request attributes servlet specification error is error page iserrorpage attribute directive meaning less meaningless error data errordata get error data geterrordata status integer status code integer get request getrequest get attribute getattribute request dispatcher requestdispatcher error status code avoid npe attribute status code status status code int value intvalue error data errordata throwable get request getrequest get attribute getattribute request dispatcher requestdispatcher error exception status string get request getrequest get attribute getattribute request dispatcher requestdispatcher error request uri string get request getrequest get attribute getattribute request dispatcher requestdispatcher error servlet