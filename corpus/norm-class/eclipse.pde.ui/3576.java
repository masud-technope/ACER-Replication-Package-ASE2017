copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal templates ide java file org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse jface wizard wizard org eclipse jface wizard wizard page wizardpage org eclipse pde core plugin i plugin base ipluginbase org eclipse pde core plugin i plugin element ipluginelement org eclipse pde core plugin i plugin extension ipluginextension org eclipse pde core plugin i plugin model factory ipluginmodelfactory org eclipse pde core plugin i plugin reference ipluginreference org eclipse pde internal templates i help context ids ihelpcontextids org eclipse pde internal templates pde template messages pdetemplatemessages org eclipse pde internal templates pde template section pdetemplatesection org eclipse pde templates boolean option booleanoption org eclipse pde templates template option templateoption help template helptemplate pde template section pdetemplatesection nls string key toc label toc label toclabel nls string key primary is primary isprimary nls string key gen test generate test generatetest nls string key started get ting started gettingstarted nls string key concepts concepts nls string key tasks tasks nls string key reference reference nls string key samples samples template option templateoption toc label option toclabeloption boolean option booleanoption primary option primaryoption boolean option booleanoption gen test option gentestoption boolean option booleanoption get ting started option gettingstartedoption boolean option booleanoption concepts option conceptsoption boolean option booleanoption tasks option tasksoption boolean option booleanoption reference option referenceoption boolean option booleanoption samples option samplesoption help template helptemplate set page count setpagecount create options createoptions alter option states alteroptionstates override add pages addpages wizard wizard wizard page wizardpage create page createpage i help context ids ihelpcontextids template set title settitle pde template messages pdetemplatemessages help template helptemplate title set description setdescription pde template messages pdetemplatemessages help template helptemplate desc wizard add page addpage mark pages added markpagesadded alter option states alteroptionstates gen test option gentestoption set enabled setenabled primary option primaryoption is selected isselected get ting started option gettingstartedoption set enabled setenabled primary option primaryoption is selected isselected concepts option conceptsoption set enabled setenabled primary option primaryoption is selected isselected tasks option tasksoption set enabled setenabled primary option primaryoption is selected isselected reference option referenceoption set enabled setenabled primary option primaryoption is selected isselected samples option samplesoption set enabled setenabled primary option primaryoption is selected isselected create options createoptions toc label option toclabeloption add option addoption key toc label pde template messages pdetemplatemessages help template helptemplate toc label toclabel pde template messages pdetemplatemessages help template helptemplate sample text sampletext primary option primaryoption boolean option booleanoption add option addoption key primary pde template messages pdetemplatemessages help template helptemplate is primary isprimary gen test option gentestoption boolean option booleanoption add option addoption key gen test pde template messages pdetemplatemessages help template helptemplate generate test generatetest get ting started option gettingstartedoption boolean option booleanoption add option addoption key started pde template messages pdetemplatemessages help template helptemplate get ting started gettingstarted concepts option conceptsoption boolean option booleanoption add option addoption key concepts pde template messages pdetemplatemessages help template helptemplate concepts tasks option tasksoption boolean option booleanoption add option addoption key tasks pde template messages pdetemplatemessages help template helptemplate tasks reference option referenceoption boolean option booleanoption add option addoption key reference pde template messages pdetemplatemessages help template helptemplate reference samples option samplesoption boolean option booleanoption add option addoption key samples pde template messages pdetemplatemessages help template helptemplate samples option template section optiontemplatesection get section id getsectionid override string get section id getsectionid nls override is ok to create folder isoktocreatefolder file source folder sourcefolder is ok isok string folder name foldername source folder sourcefolder get name getname nls folder name foldername equals concepts is ok isok concepts option conceptsoption is enabled isenabled concepts option conceptsoption is selected isselected nls folder name foldername equals getting started gettingstarted is ok isok get ting started option gettingstartedoption is enabled isenabled get ting started option gettingstartedoption is selected isselected nls folder name foldername equals reference is ok isok reference option referenceoption is enabled isenabled reference option referenceoption is selected isselected nls folder name foldername equals samples is ok isok samples option samplesoption is enabled isenabled samples option samplesoption is selected isselected nls folder name foldername equals tasks is ok isok tasks option tasksoption is enabled isenabled tasks option tasksoption is selected isselected is ok isok abstract template section abstracttemplatesection is ok to create file isoktocreatefile file override is ok to create file isoktocreatefile file source file sourcefile is ok isok string file name filename source file sourcefile get name getname nls file name filename equals test toc testtoc xml is ok isok gen test option gentestoption is enabled isenabled gen test option gentestoption is selected isselected nls file name filename equals toc concepts tocconcepts xml is ok isok concepts option conceptsoption is enabled isenabled concepts option conceptsoption is selected isselected nls file name filename equals toc getting started tocgettingstarted xml is ok isok get ting started option gettingstartedoption is enabled isenabled get ting started option gettingstartedoption is selected isselected nls file name filename equals toc reference tocreference xml is ok isok reference option referenceoption is enabled isenabled reference option referenceoption is selected isselected nls file name filename equals toc samples tocsamples xml is ok isok samples option samplesoption is enabled isenabled samples option samplesoption is selected isselected nls file name filename equals toc tasks toctasks xml is ok isok tasks option tasksoption is enabled isenabled tasks option tasksoption is selected isselected nls nls file name filename equals main topic maintopic html file name filename equals sub topic subtopic html nls source file sourcefile get parent file getparentfile get name getname equals html is ok isok primary option primaryoption is selected isselected primary option primaryoption is selected isselected get ting started option gettingstartedoption is selected isselected concepts option conceptsoption is selected isselected tasks option tasksoption is selected isselected reference option referenceoption is selected isselected samples option samplesoption is selected isselected is ok isok base option template section baseoptiontemplatesection validate options validateoptions template option templateoption override validate options validateoptions template option templateoption changed changed toc label option toclabeloption changed is empty isempty flag missing required option flagmissingrequiredoption changed reset page state resetpagestate changed primary option primaryoption alter option states alteroptionstates abstract template section abstracttemplatesection update model updatemodel i progress monitor iprogressmonitor override update model updatemodel i progress monitor iprogressmonitor monitor core exception coreexception i plugin base ipluginbase plugin model get plugin base getpluginbase i plugin extension ipluginextension extension create extension createextension get used extension point getusedextensionpoint i plugin model factory ipluginmodelfactory factory model get plugin factory getpluginfactory i plugin element ipluginelement toc element tocelement factory create element createelement extension nls toc element tocelement set name setname toc nls nls toc element tocelement set attribute setattribute file toc xml primary option primaryoption is selected isselected nls nls toc element tocelement set attribute setattribute primary extension add toc element tocelement gen test option gentestoption is selected isselected gen test option gentestoption is enabled isenabled i plugin element ipluginelement test toc element testtocelement factory create element createelement extension nls test toc element testtocelement set name setname toc nls nls test toc element testtocelement set attribute setattribute file test toc testtoc xml nls nls test toc element testtocelement set attribute setattribute primary extension add test toc element testtocelement nls add non primary topic addnonprimarytopic concepts option conceptsoption toc concepts tocconcepts xml extension nls add non primary topic addnonprimarytopic get ting started option gettingstartedoption toc getting started tocgettingstarted xml extension nls add non primary topic addnonprimarytopic reference option referenceoption toc reference tocreference xml extension nls add non primary topic addnonprimarytopic samples option samplesoption toc samples tocsamples xml extension nls add non primary topic addnonprimarytopic tasks option tasksoption toc tasks toctasks xml extension extension is in the model isinthemodel plugin add extension add non primary topic addnonprimarytopic boolean option booleanoption option string file i plugin extension ipluginextension extension core exception coreexception option is enabled isenabled option is selected isselected i plugin element ipluginelement toc element tocelement extension get plugin model getpluginmodel get plugin factory getpluginfactory create element createelement extension nls toc element tocelement set name setname toc nls toc element tocelement set attribute setattribute file file extension add toc element tocelement i template section itemplatesection get used extension point getusedextensionpoint override string get used extension point getusedextensionpoint nls org eclipse toc override i plugin reference ipluginreference get dependencies getdependencies string schema version schemaversion i plugin reference ipluginreference override string get new files getnewfiles nls nls string html xml