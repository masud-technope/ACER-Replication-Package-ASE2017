copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation sergey prigogin eclipse sprigogin gmail refactoring provide implement ref actorings refactorings depend resources explicitly released https bugs eclipse org org eclipse jdt internal refactoring binary java net uri java util array list arraylist java util arrays java util collection java util hash set hashset java util list java util map java util jar jar file jarfile org eclipse core file system filesystem efs org eclipse core file system filesystem i file store ifilestore org eclipse core file system filesystem uri util uriutil org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core runtime i adaptable iadaptable org eclipse core runtime i path ipath org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime sub progress monitor subprogressmonitor org eclipse core resources i folder ifolder org eclipse core resources i resource iresource org eclipse core resources i workspace root iworkspaceroot org eclipse core resources i workspace runnable iworkspacerunnable org eclipse core resources resources plugin resourcesplugin org eclipse ltk core refactoring change org eclipse ltk core refactoring refactoring org eclipse ltk core refactoring refactoring context refactoringcontext org eclipse ltk core refactoring refactoring contribution refactoringcontribution org eclipse ltk core refactoring refactoring core refactoringcore org eclipse ltk core refactoring refactoring descriptor refactoringdescriptor org eclipse ltk core refactoring refactoring descriptor proxy refactoringdescriptorproxy org eclipse ltk core refactoring refactoring status refactoringstatus org eclipse ltk core refactoring refactoring status context refactoringstatuscontext org eclipse ltk core refactoring refactoring status entry refactoringstatusentry org eclipse ltk core refactoring history refactoring history refactoringhistory org eclipse ltk refactoring history refactoring history wizard refactoringhistorywizard org eclipse jdt core i classpath entry iclasspathentry org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i java element ijavaelement org eclipse jdt core i java model ijavamodel org eclipse jdt core i java project ijavaproject org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt core java core javacore org eclipse jdt core java model exception javamodelexception org eclipse jdt core refactoring descriptors java refactoring descriptor javarefactoringdescriptor org eclipse jdt internal corext refactoring java refactoring descriptor util javarefactoringdescriptorutil org eclipse jdt internal corext refactoring refactoring core messages refactoringcoremessages org eclipse jdt internal corext refactoring base java status context javastatuscontext org eclipse jdt internal corext refactoring binary source creation operation sourcecreationoperation org eclipse jdt internal corext refactoring binary stub creation operation stubcreationoperation org eclipse jdt internal corext util java model util javamodelutil org eclipse jdt internal corext util messages org eclipse jdt java element labels javaelementlabels org eclipse jdt internal java plugin javaplugin org eclipse jdt internal jar import jarimport jar import messages jarimportmessages org eclipse jdt internal util core utility coreutility partial implementation refactoring history wizard creates stubs binary fragment root refactoring binary refactoring history wizard binaryrefactoringhistorywizard refactoring history wizard refactoringhistorywizard meta inf fragment string meta inf fragment jar file jarfile manifest substring jar file jarfile manifest index of indexof temporary linked source folder nls string source folder src temporary stubs folder nls string stub folder stubs updates classpath exclusion patterns path param entries classpath entries param path path add exclusion patterns addexclusionpatterns list i classpath entry iclasspathentry entries i path ipath path entries size i classpath entry iclasspathentry entry entries entry get entry kind getentrykind i classpath entry iclasspathentry cpe source entry get path getpath is prefix of isprefixof path i path ipath patterns entry get exclusion patterns getexclusionpatterns java model util javamodelutil is excluded path isexcludedpath path patterns i path ipath filters i path ipath patterns length system arraycopy patterns filters patterns length filters patterns length path remove first segments removefirstsegments entry get path getpath segment count segmentcount add trailing separator addtrailingseparator entries java core javacore new source entry newsourceentry entry get path getpath filters entry get output location getoutputlocation checks archive referenced fragment root shared multiple java projects workspace param root fragment root param monitor progress monitor status operation refactoring status refactoringstatus check package fragment roots checkpackagefragmentroots i package fragment root ipackagefragmentroot root i progress monitor iprogressmonitor monitor refactoring status refactoringstatus status refactoring status refactoringstatus monitor begin task begintask jar import messages jarimportmessages jar import wizard jarimportwizard prepare i workspace root iworkspaceroot workspace resources plugin resourcesplugin get workspace getworkspace get root getroot workspace i java model ijavamodel model java core javacore create workspace model uri uri getlocationuri root get raw classpath entry getrawclasspathentry uri i java project ijavaproject projects model get java projects getjavaprojects i progress monitor iprogressmonitor sub monitor submonitor sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label sub monitor submonitor begin task begintask jar import messages jarimportmessages jar import wizard jarimportwizard prepare projects length projects length i package fragment root ipackagefragmentroot roots projects get package fragment roots getpackagefragmentroots i progress monitor iprogressmonitor sub sub monitor subsubmonitor sub progress monitor subprogressmonitor sub monitor submonitor sub progress monitor subprogressmonitor suppress subtask label sub sub monitor subsubmonitor begin task begintask jar import messages jarimportmessages jar import wizard jarimportwizard prepare roots length offset offset roots length offset i package fragment root ipackagefragmentroot current roots offset current equals root current get kind getkind i package fragment root ipackagefragmentroot binary i classpath entry iclasspathentry entry current get raw classpath entry getrawclasspathentry entry get entry kind getentrykind i classpath entry iclasspathentry cpe library uri location getlocationuri entry uri equals location status add fatal error addfatalerror messages format jar import messages jarimportmessages jar import wizard jarimportwizard error shared jar string java element labels javaelementlabels get element label getelementlabel current get java project getjavaproject java element labels javaelementlabels sub sub monitor subsubmonitor worked sub sub monitor subsubmonitor sub monitor submonitor core exception coreexception exception status add error adderror exception get local ized message getlocalizedmessage monitor status config ures configures classpath project refactoring param project java project param root fragment root ref actor refactor param folder temporary source folder param monitor progress monitor illegal state exception illegalstateexception plugin location exist core exception coreexception error occurs config uri ng configuring path configure classpath configureclasspath i java project ijavaproject project i package fragment root ipackagefragmentroot root i folder ifolder folder i progress monitor iprogressmonitor monitor illegal state exception illegalstateexception core exception coreexception monitor begin task begintask jar import messages jarimportmessages jar import wizard jarimportwizard prepare i classpath entry iclasspathentry entry root get raw classpath entry getrawclasspathentry i classpath entry iclasspathentry entries project get raw classpath getrawclasspath list i classpath entry iclasspathentry list array list arraylist list add all addall arrays as list aslist entries i file store ifilestore store efs get local file system getlocalfilesystem get store getstore java plugin javaplugin get default getdefault get state location getstatelocation append stub folder append project get element name getelementname store fetch info fetchinfo efs sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label exists store delete efs sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label store mkdir efs sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label folder create link createlink store touri i resource iresource sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label add exclusion patterns addexclusionpatterns list folder get full path getfullpath entries length entries equals entry list add java core javacore new source entry newsourceentry folder get full path getfullpath project set raw classpath setrawclasspath list to array toarray i classpath entry iclasspathentry list size sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label monitor returns location uri classpath entry param entry classpath entry location uri uri getlocationuri i classpath entry iclasspathentry entry i path ipath path entry get entry kind getentrykind i classpath entry iclasspathentry cpe variable path java core javacore get resolved variable path getresolvedvariablepath entry get path getpath path entry get path getpath i workspace root iworkspaceroot root resources plugin resourcesplugin get workspace getworkspace get root getroot uri location root exists path location root get file getfile path get raw location i getrawlocationuri location uri util uriutil touri path location auto build enabled f auto build fautobuild wizard can celled cancelled f cancelled fcancelled java project code code i java project ijavaproject f java project fjavaproject packages processed element type i package fragment ipackagefragment collection i java element ijavaelement f processed fragments fprocessedfragments hash set hashset temporary source folder code code i folder ifolder f source folder fsourcefolder creates stub refactoring history wizard param overview code code overview ref actorings refactorings code code param wizard param title wizard title param description wizard description binary refactoring history wizard binaryrefactoringhistorywizard overview string string title string description overview title description creates stub refactoring history wizard param wizard param title wizard title param description wizard description binary refactoring history wizard binaryrefactoringhistorywizard string string title string description title description override refactoring status refactoringstatus about to perform history abouttoperformhistory i progress monitor iprogressmonitor monitor refactoring status refactoringstatus status refactoring status refactoringstatus f java project fjavaproject f source folder fsourcefolder f processed fragments fprocessedfragments clear monitor begin task begintask jar import messages jarimportmessages jar import wizard jarimportwizard prepare status merge about to perform history abouttoperformhistory sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label status has fatal error hasfatalerror i package fragment root ipackagefragmentroot root get package fragment root getpackagefragmentroot root status merge check package fragment roots checkpackagefragmentroots root sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label status has fatal error hasfatalerror status merge check source attachment refactorings checksourceattachmentrefactorings sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label status has fatal error hasfatalerror i java project ijavaproject project root get java project getjavaproject project i folder ifolder folder project get project getproject get folder getfolder source folder string value of valueof system current time millis currenttimemillis f auto build fautobuild core utility coreutility set auto building setautobuilding refactoring history refactoringhistory history get refactoring history getrefactoringhistory history history is empty isempty configure classpath configureclasspath project root folder sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label core exception coreexception exception status merge refactoring status refactoringstatus create fatal error status createfatalerrorstatus exception get local ized message getlocalizedmessage project set raw classpath setrawclasspath project read raw classpath readrawclasspath sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label core exception coreexception throwable java plugin javaplugin log throwable status has fatal error hasfatalerror f java project fjavaproject project f source folder fsourcefolder folder monitor status override refactoring status refactoringstatus about to perform refactoring abouttoperformrefactoring refactoring refactoring refactoring descriptor refactoringdescriptor descriptor i progress monitor iprogressmonitor monitor refactoring status refactoringstatus status refactoring status refactoringstatus monitor status wizard source attachment fragment root code code source attachment code code can use source attachment canusesourceattachment i package fragment root ipackagefragmentroot root get package fragment root getpackagefragmentroot root root get source attachment path getsourceattachmentpath java model exception javamodelexception exception java plugin javaplugin log exception checks ref actorings refactorings executed source attachment exists param monitor progress monitor status describing out come outcome check refactoring status refactoringstatus check source attachment refactorings checksourceattachmentrefactorings i progress monitor iprogressmonitor monitor refactoring status refactoringstatus status refactoring status refactoringstatus can use source attachment canusesourceattachment refactoring descriptor proxy refactoringdescriptorproxy proxies get refactoring history getrefactoringhistory get descriptors getdescriptors monitor begin task begintask jar import messages jarimportmessages jar import wizard jarimportwizard prepare proxies length proxies length refactoring descriptor refactoringdescriptor descriptor proxies request descriptor requestdescriptor sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label descriptor flags descriptor get flags getflags flags java refactoring descriptor javarefactoringdescriptor jar source attachment status merge refactoring status refactoringstatus create fatal error status createfatalerrorstatus messages format jar import messages jarimportmessages binary refactoring history wizard binaryrefactoringhistorywizard error missing source attachment descriptor get description getdescription monitor begin task begintask jar import messages jarimportmessages jar import wizard jarimportwizard prepare monitor status creates source code refactoring param monitor progress monitor status refactoring status refactoringstatus create necessary source code createnecessarysourcecode i progress monitor iprogressmonitor monitor refactoring status refactoringstatus status refactoring status refactoringstatus monitor begin task begintask jar import messages jarimportmessages jar import wizard jarimportwizard prepare i package fragment root ipackagefragmentroot root get package fragment root getpackagefragmentroot root f source folder fsourcefolder f java project fjavaproject sub progress monitor subprogressmonitor sub monitor submonitor sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label i java element ijavaelement elements root get children getchildren list i package fragment ipackagefragment list array list arraylist elements length sub monitor submonitor begin task begintask jar import messages jarimportmessages jar import wizard jarimportwizard prepare elements length elements length i java element ijavaelement element elements f processed fragments fprocessedfragments element element get element name getelementname equals meta inf fragment list add i package fragment ipackagefragment element sub monitor submonitor worked sub monitor submonitor list is empty isempty f processed fragments fprocessedfragments add all addall list uri uri f source folder fsourcefolder get raw location i getrawlocationuri uri i package fragment root ipackagefragmentroot source folder sourcefolder f java project fjavaproject get package fragment root getpackagefragmentroot f source folder fsourcefolder i workspace runnable iworkspacerunnable runnable can use source attachment canusesourceattachment runnable source creation operation sourcecreationoperation uri list i package fragment ipackagefragment f fragment ffragment override create compilation unit createcompilationunit i file store ifilestore store string string content i progress monitor iprogressmonitor core exception coreexception f fragment ffragment create compilation unit createcompilationunit content override create package fragment createpackagefragment i file store ifilestore store string i progress monitor iprogressmonitor core exception coreexception f fragment ffragment source folder sourcefolder create package fragment createpackagefragment runnable stub creation operation stubcreationoperation uri list i package fragment ipackagefragment f fragment ffragment override create compilation unit createcompilationunit i file store ifilestore store string string content i progress monitor iprogressmonitor core exception coreexception f fragment ffragment create compilation unit createcompilationunit content override create package fragment createpackagefragment i file store ifilestore store string i progress monitor iprogressmonitor core exception coreexception f fragment ffragment source folder sourcefolder create package fragment createpackagefragment runnable sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label f source folder fsourcefolder refresh local refreshlocal i resource iresource depth infinite sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label core exception coreexception exception status add fatal error addfatalerror exception get local ized message getlocalizedmessage monitor status override refactoring context refactoringcontext create refactoring context createrefactoringcontext refactoring descriptor refactoringdescriptor descriptor refactoring status refactoringstatus status i progress monitor iprogressmonitor monitor core exception coreexception is not null isnotnull descriptor create necessary source code createnecessarysourcecode monitor descriptor java refactoring descriptor javarefactoringdescriptor java refactoring descriptor javarefactoringdescriptor java descriptor javadescriptor java refactoring descriptor javarefactoringdescriptor descriptor refactoring contribution refactoringcontribution contribution refactoring core refactoringcore get refactoring contribution getrefactoringcontribution java descriptor javadescriptor getid map string string map contribution retrieve argument map retrieveargumentmap descriptor f java project fjavaproject status merge refactoring status refactoringstatus create fatal error status createfatalerrorstatus refactoring core messages refactoringcoremessages initializable refactoring initializablerefactoring inacceptable arguments string f java project fjavaproject get element name getelementname string handle map java refactoring descriptor util javarefactoringdescriptorutil attribute input handle handle length map java refactoring descriptor util javarefactoringdescriptorutil attribute input get transformed handle gettransformedhandle handle count string attribute java refactoring descriptor util javarefactoringdescriptorutil attribute element count handle map attribute handle length map attribute get transformed handle gettransformedhandle handle count attribute java refactoring descriptor util javarefactoringdescriptorutil attribute element count create adapted descriptor descriptor contribution create descriptor createdescriptor descriptor getid descriptor get description getdescription descriptor get comment getcomment map descriptor get flags getflags illegal argument exception illegalargumentexception status merge refactoring status refactoringstatus create fatal error status createfatalerrorstatus refactoring core messages refactoringcoremessages initializable refactoring initializablerefactoring inacceptable arguments descriptor create refactoring context createrefactoringcontext status deconfigures classpath refactoring performed param entries classpath entries reset project param monitor progress monitor code code classpath changed code code core exception coreexception error occurs deconfiguring classpath deconfigure classpath deconfigureclasspath i classpath entry iclasspathentry entries i progress monitor iprogressmonitor monitor core exception coreexception deconfigures classpath project refactoring param monitor progress monitor core exception coreexception error occurs deconfiguring classpath deconfigure classpath deconfigureclasspath i progress monitor iprogressmonitor monitor core exception coreexception monitor begin task begintask jar import messages jarimportmessages jar import wizard jarimportwizard cleanup f java project fjavaproject i classpath entry iclasspathentry entries f java project fjavaproject read raw classpath readrawclasspath changed deconfigure classpath deconfigureclasspath entries sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label refactoring history refactoringhistory history get refactoring history getrefactoringhistory valid history history is empty isempty valid refactoring core refactoringcore get undo manager getundomanager flush valid changed f java project fjavaproject set raw classpath setrawclasspath entries changed sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label f source folder fsourcefolder i file store ifilestore store efs get store getstore f source folder fsourcefolder get raw location i getrawlocationuri store fetch info fetchinfo efs sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label exists store delete efs sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label f source folder fsourcefolder delete sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label f source folder fsourcefolder clear history clearhistory sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label f source folder fsourcefolder f java project fjavaproject f java project fjavaproject get resource getresource refresh local refreshlocal i resource iresource depth infinite sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label core exception coreexception exception java plugin javaplugin log exception f java project fjavaproject monitor returns fragment root stub fragment root stub code code i package fragment root ipackagefragmentroot get package fragment root getpackagefragmentroot returns refactoring history perform refactoring history perform empty history refactoring history refactoringhistory get refactoring history getrefactoringhistory returns transformed handle input handle param project project code code workspace param handle handle transform transformed handle original needed transformed string get transformed handle gettransformedhandle string project string handle f source folder fsourcefolder i java element ijavaelement target java core javacore create f source folder fsourcefolder target i package fragment root ipackagefragmentroot i package fragment root ipackagefragmentroot extended i package fragment root ipackagefragmentroot target string source identifier sourceidentifier i java element ijavaelement element java refactoring descriptor util javarefactoringdescriptorutil handle to element handletoelement project handle element i package fragment root ipackagefragmentroot root i package fragment root ipackagefragmentroot element get ancestor getancestor i java element ijavaelement fragment root root source identifier sourceidentifier root get handle identifier gethandleidentifier i java project ijavaproject java project javaproject element get java project getjavaproject java project javaproject source identifier sourceidentifier java project javaproject get handle identifier gethandleidentifier source identifier sourceidentifier i java element ijavaelement result java core javacore create extended get handle identifier gethandleidentifier element get handle identifier gethandleidentifier substring source identifier sourceidentifier length result java refactoring descriptor util javarefactoringdescriptorutil element to handle elementtohandle project result handle override refactoring status refactoringstatus history performed historyperformed i progress monitor iprogressmonitor monitor monitor begin task begintask jar import messages jarimportmessages jar import wizard jarimportwizard cleanup refactoring status refactoringstatus status history performed historyperformed sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label status has fatal error hasfatalerror deconfigure classpath deconfigureclasspath sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label core exception coreexception exception status add error adderror exception get local ized message getlocalizedmessage core utility coreutility set auto building setautobuilding f auto build fautobuild core exception coreexception exception java plugin javaplugin log exception status monitor override perform cancel performcancel f cancelled fcancelled perform cancel performcancel override refactoring status refactoringstatus refactoring performed refactoringperformed refactoring refactoring i progress monitor iprogressmonitor monitor nls monitor begin task begintask refactoring status refactoringstatus status refactoring performed refactoringperformed refactoring sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label status has fatal error hasfatalerror f source folder fsourcefolder f source folder fsourcefolder refresh local refreshlocal i resource iresource depth infinite sub progress monitor subprogressmonitor monitor sub progress monitor subprogressmonitor suppress subtask label core exception coreexception exception java plugin javaplugin log exception status monitor override select preview change selectpreviewchange change change f source folder fsourcefolder i path ipath source f source folder fsourcefolder get full path getfullpath object element change get modified element getmodifiedelement element i adaptable iadaptable i adaptable iadaptable adaptable i adaptable iadaptable element i resource iresource resource adaptable get adapter getadapter i resource iresource resource source is prefix of isprefixof resource get full path getfullpath select preview change selectpreviewchange change override select status entry selectstatusentry refactoring status entry refactoringstatusentry entry f source folder fsourcefolder i path ipath source f source folder fsourcefolder get full path getfullpath refactoring status context refactoringstatuscontext context entry get context getcontext context java status context javastatuscontext java status context javastatuscontext extended java status context javastatuscontext context i compilation unit icompilationunit unit extended get compilation unit getcompilationunit unit i resource iresource resource unit get resource getresource resource source is prefix of isprefixof resource get full path getfullpath select status entry selectstatusentry entry