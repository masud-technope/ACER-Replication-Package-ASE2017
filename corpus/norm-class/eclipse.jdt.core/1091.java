copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal core java input stream inputstream java util array list arraylist java util hash map hashmap org eclipse core resources org eclipse core runtime org eclipse core runtime jobs i scheduling rule ischedulingrule org eclipse jdt core org eclipse jdt internal core util messages org eclipse jface text bad location exception badlocationexception org eclipse jface text i document idocument org eclipse text edits text edit textedit defines behavior common java model operations suppress warnings suppresswarnings rawtypes unchecked java model operation javamodeloperation i workspace runnable iworkspacerunnable i progress monitor iprogressmonitor i post action ipostaction returns action java model operation javamodeloperation post action postaction string getid action java model exception javamodelexception constants controlling insertion mode action java model operation javamodeloperation post action postaction insert append remove existing add removeall append insert existing existing tracing post actions enabled post action verbose list i post actions ipostactions i post action ipostaction actions actions start actionsstart actions end actionsend hash map hashmap attributes operations hash map hashmap attributes nls string modified resource attr has modified resource hasmodifiedresource string java model manager javamodelmanager string elements operation operates code code operation operate specific elements i java element ijavaelement elements to process elementstoprocess parent elements operation operates code code operation operate specific parent elements i java element ijavaelement parent elements parentelements empty collection code i java element ijavaelement code common empty result elements created operation executed i java element ijavaelement elements i java element ijavaelement elements created operation empty operation creates elements i java element ijavaelement result elements resultelements elements progress monitor passed operation sub monitor submonitor progress monitor progressmonitor sub monitor submonitor convert flag indicating operation nested is nested isnested conflict resolution policy force fail conflict force thread stack java model operations per thread object perthreadobject array list arraylist thread local threadlocal operation stacks thread local threadlocal java model operation javamodeloperation constructor subclasses common constructor java model operations java model operation javamodeloperation i java element ijavaelement elements elements to process elementstoprocess elements common constructor java model operations java model operation javamodeloperation i java element ijavaelement elements to process elementstoprocess i java element ijavaelement parent elements parentelements elements to process elementstoprocess elements to process elementstoprocess parent elements parentelements parent elements parentelements common constructor java model operations java model operation javamodeloperation i java element ijavaelement elements to process elementstoprocess i java element ijavaelement parent elements parentelements force elements to process elementstoprocess elements to process elementstoprocess parent elements parentelements parent elements parentelements force force common constructor java model operations java model operation javamodeloperation i java element ijavaelement elements force elements to process elementstoprocess elements force force common constructor java model operations java model operation javamodeloperation i java element ijavaelement element elements to process elementstoprocess i java element ijavaelement element registers action list actions add action addaction i post action ipostaction action length actions length length actions end actionsend system arraycopy actions actions i post action ipostaction length length actions actions end actionsend action registers delta java model manager add delta adddelta i java element delta ijavaelementdelta delta java model manager javamodelmanager get java model manager getjavamodelmanager get delta processor getdeltaprocessor register java model delta registerjavamodeldelta delta registers reconcile delta java model manager add reconcile delta addreconciledelta i compilation unit icompilationunit working copy workingcopy i java element delta ijavaelementdelta delta hash map hashmap reconcile deltas reconciledeltas java model manager javamodelmanager get java model manager getjavamodelmanager get delta processor getdeltaprocessor reconcile deltas reconciledeltas java element delta javaelementdelta previous delta previousdelta java element delta javaelementdelta reconcile deltas reconciledeltas working copy workingcopy previous delta previousdelta i java element delta ijavaelementdelta children delta get affected children getaffectedchildren length children length length java element delta javaelementdelta child java element delta javaelementdelta children previous delta previousdelta insert delta tree insertdeltatree child get element getelement child result reconcile operation delta get flags getflags i java element delta ijavaelementdelta ast previous delta previousdelta changedast delta get compilation unit t getcompilationunitast reconcile deltas reconciledeltas working copy workingcopy delta deregister reconcile delta working copy remove reconcile delta removereconciledelta i compilation unit icompilationunit working copy workingcopy java model manager javamodelmanager get java model manager getjavamodelmanager get delta processor getdeltaprocessor reconcile deltas reconciledeltas remove working copy workingcopy apply text edit applytextedit i compilation unit icompilationunit text edit textedit edits java model exception javamodelexception edits apply get document getdocument bad location exception badlocationexception java model exception javamodelexception i java model status constants ijavamodelstatusconstants invalid contents i progress monitor iprogressmonitor begin task begintask string total work totalwork progress monitor progressmonitor progress monitor progressmonitor begin task begintask total work totalwork returns operation modify fragment roots can modify roots canmodifyroots checks progress monitor operation can celed canceled operation reg ularly regularly call method operation user cancel exception operation canceled exception operationcanceledexception can celling cancelling operation requested i progress monitor iprogressmonitor is canceled iscanceled check canceled checkcanceled is canceled iscanceled operation canceled exception operationcanceledexception messages operation can celled cancelled common code verify elements operation processing java model operation javamodeloperation verify i java model status ijavamodelstatus common verify commonverify elements to process elementstoprocess elements to process elementstoprocess length java model status javamodelstatus i java model status constants ijavamodelstatusconstants elements process elements to process elementstoprocess length elements to process elementstoprocess java model status javamodelstatus i java model status constants ijavamodelstatusconstants elements process java model status javamodelstatus verified convenience method copy resources copy resources copyresources i resource iresource resources i path ipath container java model exception javamodelexception i progress monitor iprogressmonitor sub progress monitor subprogressmonitor get sub progress monitor getsubprogressmonitor resources length i workspace root iworkspaceroot root resources plugin resourcesplugin get workspace getworkspace get root getroot length resources length length i resource iresource resource resources i path ipath destination container append resource get name getname root find member findmember destination resource copy destination sub progress monitor subprogressmonitor set attribute setattribute modified resource attr core exception coreexception java model exception javamodelexception convenience method create file create file createfile i container icontainer folder string input stream inputstream contents force flag forceflag java model exception javamodelexception i file ifile file folder get file getfile path file create contents force flag forceflag i resource iresource force i resource iresource history i resource iresource history get sub progress monitor getsubprogressmonitor set attribute setattribute modified resource attr core exception coreexception java model exception javamodelexception convenience method create folder create folder createfolder i container icontainer parent folder parentfolder string force flag forceflag java model exception javamodelexception i folder ifolder folder parent folder parentfolder get folder getfolder path create file locally vcm tru folder create force flag forceflag i resource iresource force i resource iresource history i resource iresource history local get sub progress monitor getsubprogressmonitor set attribute setattribute modified resource attr core exception coreexception java model exception javamodelexception convenience method delete empty fragment delete empty package fragment deleteemptypackagefragment i package fragment ipackagefragment fragment force flag forceflag i resource iresource root resource rootresource java model exception javamodelexception i container icontainer resource i container icontainer java element javaelement fragment resource resource delete force flag forceflag i resource iresource force i resource iresource history i resource iresource history get sub progress monitor getsubprogressmonitor set attribute setattribute modified resource attr resource i folder ifolder deleting delete parent empty deleting folder doesn resources deleting fragment root resource resource get parent getparent resource equals root resource rootresource resource members length resource delete force flag forceflag i resource iresource force i resource iresource history i resource iresource history get sub progress monitor getsubprogressmonitor set attribute setattribute modified resource attr core exception coreexception java model exception javamodelexception convenience method delete resource delete resource deleteresource i resource iresource resource flags java model exception javamodelexception resource delete flags get sub progress monitor getsubprogressmonitor set attribute setattribute modified resource attr core exception coreexception java model exception javamodelexception convenience method delete resources delete resources deleteresources i resource iresource resources force flag forceflag java model exception javamodelexception resources resources length i progress monitor iprogressmonitor sub progress monitor subprogressmonitor get sub progress monitor getsubprogressmonitor resources length i workspace iworkspace workspace resources get workspace getworkspace workspace delete resources force flag forceflag i resource iresource force i resource iresource history i resource iresource history sub progress monitor subprogressmonitor set attribute setattribute modified resource attr core exception coreexception java model exception javamodelexception i progress monitor iprogressmonitor progress monitor progressmonitor progress monitor progressmonitor returns path equals paths equals one of equalsoneof i path ipath path i path ipath other paths otherpaths length other paths otherpaths length length path equals other paths otherpaths convenience method operation operation execute nested operation executenestedoperation java model operation javamodeloperation operation sub work amount subworkamount java model exception javamodelexception i java model status ijavamodelstatus status operation verify status isok java model exception javamodelexception status i progress monitor iprogressmonitor sub progress monitor subprogressmonitor get sub progress monitor getsubprogressmonitor sub work amount subworkamount ikc operation set nested setnested operation sub progress monitor subprogressmonitor core exception coreexception java model exception javamodelexception java model exception javamodelexception get status getstatus get code getcode i resource status iresourcestatus operation failed throwable get status getstatus get exception getexception java model exception javamodelexception java model exception javamodelexception java model exception javamodelexception performs operation specific behavior subclasses override execute operation executeoperation java model exception javamodelexception returns attribute registered key top level operation returns attribute object get attribute getattribute object key array list arraylist stack get current operation stack getcurrentoperationstack stack size java model operation javamodeloperation top level op toplevelop java model operation javamodeloperation stack top level op toplevelop attributes top level op toplevelop attributes key returns compilation unit element contained element compilation unit code code i compilation unit icompilationunit get compilation unit for getcompilationunitfor i java element ijavaelement element java element javaelement element get compilation unit getcompilationunit returns stack operations running current thread returns empty stack operations running thread array list arraylist get current operation stack getcurrentoperationstack array list arraylist stack array list arraylist operation stacks stack stack array list arraylist operation stacks stack stack returns existing document document adapter documentadapter i document idocument get document getdocument i compilation unit icompilationunit java model exception javamodelexception i buffer ibuffer buffer get buffer getbuffer buffer i document idocument i document idocument buffer document adapter documentadapter buffer returns element operation applies code code applicable i java element ijavaelement get element to process getelementtoprocess elements to process elementstoprocess elements to process elementstoprocess length elements to process elementstoprocess returns java model operation operating i java model ijavamodel get java model getjavamodel java model manager javamodelmanager get java model manager getjavamodelmanager get java model getjavamodel i path ipath get nested folders getnestedfolders i package fragment root ipackagefragmentroot root java model exception javamodelexception i path ipath root path rootpath root get path getpath i classpath entry iclasspathentry classpath root get java project getjavaproject get raw classpath getrawclasspath length classpath length i path ipath result i path ipath length length i path ipath path classpath get path getpath root path rootpath is prefix of isprefixof path root path rootpath equals path result path length system arraycopy result result i path ipath result returns parent element operation applies code code applicable i java element ijavaelement get parent element getparentelement parent elements parentelements parent elements parentelements length parent elements parentelements returns parent elements operation applies code code applicable i java element ijavaelement get parent elements getparentelements parent elements parentelements returns elements created operation i java element ijavaelement get result elements getresultelements result elements resultelements returns scheduling rule operation resource locked operation running subclasses override i scheduling rule ischedulingrule get scheduling rule getschedulingrule resources plugin resourcesplugin get workspace getworkspace get root getroot creates returns sub progress subprogress monitor i progress monitor iprogressmonitor get sub progress monitor getsubprogressmonitor work amount workamount progress monitor progressmonitor split work amount workamount returns operation performed resource modifications returns operation executed has modified resource hasmodifiedresource is read only isreadonly get attribute getattribute modified resource attr internal worked internalworked work progress monitor progressmonitor progress monitor progressmonitor internal worked internalworked work i progress monitor iprogressmonitor is canceled iscanceled progress monitor progressmonitor progress monitor progressmonitor is canceled iscanceled returns code code operation performs resource modifications code code subclasses override is read only isreadonly returns operation operation current thread is top level operation istopleveloperation array list arraylist stack stack get current operation stack getcurrentoperationstack size stack returns registered action starting position returns first action with d firstactionwithid string start start actions end actionsend actions getid equals convenience method move resources move resources moveresources i resource iresource resources i path ipath container java model exception javamodelexception sub monitor submonitor sub progress monitor subprogressmonitor progress monitor progressmonitor new child newchild resources length i workspace root iworkspaceroot root resources plugin resourcesplugin get workspace getworkspace get root getroot length resources length length i resource iresource resource resources i path ipath destination container append resource get name getname root find member findmember destination resource move destination sub progress monitor subprogressmonitor split set attribute setattribute modified resource attr core exception coreexception java model exception javamodelexception creates returns code i java element delta ijavaelementdelta code java model java element delta javaelementdelta new java element delta newjavaelementdelta java element delta javaelementdelta get java model getjavamodel removes pushed operation stack running operations returns poped operation stack empty java model operation javamodeloperation pop operation popoperation array list arraylist stack get current operation stack getcurrentoperationstack size stack size size top level operation size release reference http bugs eclipse org bugs bug cgi operation stacks java model operation javamodeloperation stack remove size registers action java model operation finished insertion mode controls action discard existing actions queue d queued removeall append action action existing action queue d queued existing actions append post action postaction i post action ipostaction action insertion mode insertionmode post action verbose nls nls system print thread current thread currentthread java model operation javamodeloperation post action postaction i post action ipostaction pos ting posting action action getid insertion mode insertionmode removeall append system println removeall append existing system println existing append nls system println nls append java model operation javamodeloperation top level op toplevelop java model operation javamodeloperation get current operation stack getcurrentoperationstack i post action ipostaction post actions postactions top level op toplevelop actions post actions postactions top level op toplevelop actions post actions postactions i post action ipostaction post actions postactions action top level op toplevelop actions end actionsend string action getid insertion mode insertionmode removeall append actions start actionsstart top level op toplevelop first action with d firstactionwithid remove action system arraycopy post actions postactions post actions postactions top level op toplevelop actions end actionsend post actions postactions top level op toplevelop actions end actionsend top level op toplevelop add action addaction action existing top level op toplevelop first action with d firstactionwithid top level op toplevelop add action addaction action append top level op toplevelop add action addaction action returns path prefix paths prefixes one of prefixesoneof i path ipath path i path ipath other paths otherpaths length other paths otherpaths length length path is prefix of isprefixof other paths otherpaths pushes operation stack operations running thread push operation pushoperation java model operation javamodeloperation operation get current operation stack getcurrentoperationstack add operation removes actions queue post actions action queue remove all post action removeallpostaction string actionid post action verbose nls nls system println thread current thread currentthread java model operation javamodeloperation remove all post action removeallpostaction string removing actions actionid java model operation javamodeloperation top level op toplevelop java model operation javamodeloperation get current operation stack getcurrentoperationstack i post action ipostaction post actions postactions top level op toplevelop actions post actions postactions actions start actionsstart top level op toplevelop first action with d firstactionwithid actionid remove action system arraycopy post actions postactions post actions postactions top level op toplevelop actions end actionsend post actions postactions top level op toplevelop actions end actionsend runs operation registers deltas created i workspace runnable iworkspacerunnable exception core exception coreexception operation fails i progress monitor iprogressmonitor monitor core exception coreexception sub monitor submonitor old monitor oldmonitor progress monitor progressmonitor java model manager javamodelmanager manager java model manager javamodelmanager get java model manager getjavamodelmanager delta processor deltaprocessor delta processor deltaprocessor manager get delta processor getdeltaprocessor previous delta count previousdeltacount delta processor deltaprocessor java model deltas javamodeldeltas size progress monitor progressmonitor sub monitor submonitor convert monitor push operation pushoperation can modify roots canmodifyroots comp utes computes root infos executing operation noop area dy aready initialized java model manager javamodelmanager get delta state getdeltastate initialize roots initializeroots init i after load initiafterload execute operation executeoperation is top level operation istopleveloperation run post actions runpostactions reacquire delta processor reset execute operation executeoperation delta processor deltaprocessor manager get delta processor getdeltaprocessor update java model javamodel deltas recorded operation previous delta count previousdeltacount size delta processor deltaprocessor java model deltas javamodeldeltas size size delta processor deltaprocessor update java model updatejavamodel i java element delta ijavaelementdelta delta processor deltaprocessor java model deltas javamodeldeltas https bugs eclipse org bugs bug cgi length result elements resultelements length length i java element ijavaelement element result elements resultelements openable openable openable element get openable getopenable working copy remain child parent move openable compilation unit compilationunit compilation unit compilationunit openable is working copy isworkingcopy java element javaelement openable get parent getparent close element get element type getelementtype i java element ijavaelement fragment root i java element ijavaelement fragment delta processor deltaprocessor project caches to reset projectcachestoreset add element get java project getjavaproject delta processor deltaprocessor reset project caches resetprojectcaches operation modified resource is top level operation istopleveloperation delta processor deltaprocessor java model deltas javamodeldeltas size previous delta count previousdeltacount delta processor deltaprocessor reconcile deltas reconciledeltas is empty isempty has modified resource hasmodifiedresource delta processor deltaprocessor fire delta processor deltaprocessor change event deltas fired processing resource delta pop operation popoperation monitor monitor progress monitor progressmonitor old monitor oldmonitor main entry point java model operations runs java model operation i workspace runnable iworkspacerunnable read run operation runoperation i progress monitor iprogressmonitor monitor java model exception javamodelexception i java model status ijavamodelstatus status verify status isok java model exception javamodelexception status is read only isreadonly monitor i workspace iworkspace ensure resource batched note tree locked core exception coreexception operation modifying tree read core exception coreexception thrown resources plugin resourcesplugin get workspace getworkspace get scheduling rule getschedulingrule i workspace iworkspace avoid update monitor core exception coreexception java model exception javamodelexception java model exception javamodelexception get status getstatus get code getcode i resource status iresourcestatus operation failed throwable get status getstatus get exception getexception java model exception javamodelexception java model exception javamodelexception java model exception javamodelexception run post actions runpostactions java model exception javamodelexception actions start actionsstart actions end actionsend i post action ipostaction post action postaction actions actions start actionsstart post action verbose nls nls system println thread current thread currentthread java model operation javamodeloperation run post actions runpostactions running action post action postaction getid post action postaction registers attribute key top level operation set attribute setattribute object key object attribute array list arraylist operation stack operationstack get current operation stack getcurrentoperationstack operation stack operationstack size java model operation javamodeloperation top level op toplevelop java model operation javamodeloperation operation stack operationstack top level op toplevelop attributes top level op toplevelop attributes hash map hashmap top level op toplevelop attributes key attribute i progress monitor iprogressmonitor set canceled setcanceled progress monitor progressmonitor progress monitor progressmonitor set canceled setcanceled sets operation nested create element in operation createelementincuoperation check canceled checkcanceled set nested setnested nested is nested isnested nested i progress monitor iprogressmonitor set task name settaskname string progress monitor progressmonitor progress monitor progressmonitor set task name settaskname i progress monitor iprogressmonitor sub task subtask string progress monitor progressmonitor progress monitor progressmonitor sub task subtask returns status indicating reason operation fail operations verified subclasses override conditions verify operation executes i java model status ijavamodelstatus i java model status ijavamodelstatus verify common verify commonverify i progress monitor iprogressmonitor worked work progress monitor progressmonitor progress monitor progressmonitor worked work check canceled checkcanceled