licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache catalina core java file java io exception ioexception java input stream inputstream java output stream outputstream java net url java util arrays java util list javax naming directory dir context dircontext javax servlet servlet context servletcontext javax servlet servlet exception servletexception javax servlet http http servlet httpservlet javax servlet http http servlet request httpservletrequest javax servlet http http servlet response httpservletresponse org junit assert equals assertequals org junit assert true asserttrue org junit org junit test org apache catalina context org apache catalina lifecycle org apache catalina lifecycle event lifecycleevent org apache catalina lifecycle listener lifecyclelistener org apache catalina deploy web xml webxml org apache catalina startup constants org apache catalina startup context config contextconfig org apache catalina startup tomcat org apache catalina startup tomcat base test tomcatbasetest org apache naming resources proxy dir context proxydircontext org apache tomcat util buf byte chunk bytechunk test standard context resources teststandardcontextresources tomcat base test tomcatbasetest override set up setup exception set up setup tomcat tomcat get tomcat instance gettomcatinstance test fails jre memory leak prevention listener jrememoryleakpreventionlistener listener jvm current subsequent tests jvm fair add test tomcat get server getserver add lifecycle listener addlifecyclelistener jre memory leak prevention listener jrememoryleakpreventionlistener test test resources testresources exception tomcat tomcat get tomcat instance gettomcatinstance file app dir appdir file test webapp fragments app dir relative server context ctx tomcat add webapp addwebapp test app dir appdir get absolute path getabsolutepath tomcat start assert page contains assertpagecontains test resource a resourcea jsp resource a resourcea jsp web application assert page contains assertpagecontains test resource b resourceb jsp resource b resourceb jsp resources jar assert page contains assertpagecontains test folder resource c resourcec jsp resource c resourcec jsp web application assert page contains assertpagecontains test folder resource d resourced jsp resource d resourced jsp resources jar assert page contains assertpagecontains test folder resource e resourcee jsp resource e resourcee jsp web application assert page contains assertpagecontains test resource g resourceg jsp resource g resourceg jsp web inf classes relative ordering resources jar absolute ordering jars list suppress warnings suppresswarnings unchecked list string ordered libs orderedlibs list string ctx get servlet context getservletcontext get attribute getattribute servlet context servletcontext ordered libs ordered libs orderedlibs size log warn test resources testresources ordered libs orderedlibs ordered libs orderedlibs ordered libs orderedlibs index of indexof resources jar ordered libs orderedlibs index of indexof resources jar assert true asserttrue ordered libs orderedlibs to string tostring test test resources web inf classes testresourceswebinfclasses exception tomcat tomcat get tomcat instance gettomcatinstance app dir relative server file app dir appdir file test webapp fragments standard context standardcontext specific attribute standard context standardcontext ctxt standard context standardcontext tomcat add webapp addwebapp test app dir appdir get absolute path getabsolutepath ctxt set add web inf classes resources setaddwebinfclassesresources tomcat start assert page contains assertpagecontains test resource a resourcea jsp resource a resourcea jsp web application assert page contains assertpagecontains test resource b resourceb jsp resource b resourceb jsp resources jar assert page contains assertpagecontains test folder resource c resourcec jsp resource c resourcec jsp web application assert page contains assertpagecontains test folder resource d resourced jsp resource d resourced jsp resources jar assert page contains assertpagecontains test folder resource e resourcee jsp resource e resourcee jsp web application assert page contains assertpagecontains test resource g resourceg jsp resource g resourceg jsp web inf classes test test resources absolute ordering testresourcesabsoluteordering exception tomcat tomcat get tomcat instance gettomcatinstance file app dir appdir file test webapp fragments app dir relative server standard context standardcontext ctx standard context standardcontext tomcat add webapp addwebapp test app dir appdir get absolute path getabsolutepath lifecycle listener lifecyclelistener listener ctx find lifecycle listeners findlifecyclelisteners assert equals assertequals listener length assert true asserttrue listener context config contextconfig context config contextconfig config context config contextconfig override web xml webxml create web xml createwebxml web xml webxml wxml web xml webxml wxml add absolute ordering addabsoluteordering resources wxml add absolute ordering addabsoluteordering resources wxml prevent finds dup error config set default web xml setdefaultwebxml constants no default web xml nodefaultwebxml listener config tomcat add servlet addservlet ctx get resource getresource get resource servlet getresourceservlet ctx add servlet mapping addservletmapping get resource getresource get resource getresource tomcat start assert page contains assertpagecontains test get resource getresource path resource f resourcef jsp resource f resourcef jsp resources jar assert page contains assertpagecontains test get resource getresource path resource b resourceb jsp resource b resourceb jsp resources jar check ordering assert equals assertequals arrays as list aslist resources jar resources jar ctx get servlet context getservletcontext get attribute getattribute servlet context servletcontext ordered libs ctx lifecycle listener lifecyclelistener listener ctx find lifecycle listeners findlifecyclelisteners change ordering reload context config contextconfig config context config contextconfig override web xml webxml create web xml createwebxml web xml webxml wxml web xml webxml wxml add absolute ordering addabsoluteordering resources wxml add absolute ordering addabsoluteordering resources wxml prevent finds dup error config set default web xml setdefaultwebxml constants no default web xml nodefaultwebxml listener config init context won call init config lifecycle event lifecycleevent lifecycle event lifecycleevent ctx lifecycle init event tomcat add servlet addservlet ctx get resource getresource get resource servlet getresourceservlet ctx add servlet mapping addservletmapping get resource getresource get resource getresource ctx start assert page contains assertpagecontains test get resource getresource path resource f resourcef jsp resource f resourcef jsp resources jar assert page contains assertpagecontains test get resource getresource path resource b resourceb jsp resource b resourceb jsp resources jar check ordering assert equals assertequals arrays as list aslist resources jar resources jar ctx get servlet context getservletcontext get attribute getattribute servlet context servletcontext ordered libs test test resources testresources exception tomcat tomcat get tomcat instance gettomcatinstance file app dir appdir file test webapp fragments app dir relative server standard context standardcontext ctx standard context standardcontext tomcat add webapp addwebapp test app dir appdir get absolute path getabsolutepath tomcat add servlet addservlet ctx get resource getresource get resource servlet getresourceservlet ctx add servlet mapping addservletmapping get resource getresource get resource getresource tomcat start assert page contains assertpagecontains test get resource getresource path resource f resourcef jsp resource f resourcef jsp resources jar assert page contains assertpagecontains test get resource getresource path resource a resourcea jsp resource a resourcea jsp web application assert page contains assertpagecontains test get resource getresource path resource b resourceb jsp resource b resourceb jsp resources jar assert page contains assertpagecontains test get resource getresource path folder resource c resourcec jsp resource c resourcec jsp web application assert page contains assertpagecontains test get resource getresource path folder resource d resourced jsp resource d resourced jsp resources jar assert page contains assertpagecontains test get resource getresource path folder resource e resourcee jsp resource e resourcee jsp web application test test resource caching testresourcecaching exception tomcat tomcat get tomcat instance gettomcatinstance file app dir appdir file test webapp fragments app dir relative server standard context standardcontext ctx standard context standardcontext tomcat add webapp addwebapp test app dir appdir get absolute path getabsolutepath ctx set caching allowed setcachingallowed tomcat start dir context dircontext resources ctx get resources getresources assert true asserttrue resources proxy dir context proxydircontext proxy dir context proxydircontext proxy resources proxyresources proxy dir context proxydircontext resources caching disabled assert null assertnull proxy resources proxyresources get cache getcache ctx ctx start caching disabled assert null assertnull proxy resources proxyresources get cache getcache servlet prints requested resource path requested resource passed parameter code path code get resource servlet getresourceservlet http servlet httpservlet serialversionuid override do get doget http servlet request httpservletrequest req http servlet response httpservletresponse resp servlet exception servletexception io exception ioexception resp set content type setcontenttype text plain servlet context servletcontext context get servlet context getservletcontext check resources individually url url context get resource getresource req get parameter getparameter path url resp get writer getwriter println input stream inputstream input url open stream openstream output stream outputstream output resp get output stream getoutputstream buffer len len input read buffer output write buffer len input close output close assert page contains assertpagecontains string page url pageurl string expected body expectedbody io exception ioexception assert page contains assertpagecontains page url pageurl expected body expectedbody assert page contains assertpagecontains string page url pageurl string expected body expectedbody expected status expectedstatus io exception ioexception byte chunk bytechunk res byte chunk bytechunk get url geturl http localhost get port getport page url pageurl res assert equals assertequals expected status expectedstatus expected status expectedstatus string result res to string tostring assert true asserttrue result result index of indexof expected body expectedbody