copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal core java util hash map hashmap java util iterator java util map org eclipse core runtime i safe runnable isaferunnable org eclipse core runtime operation canceled exception operationcanceledexception org eclipse core runtime safe runner saferunner org eclipse jdt core org eclipse jdt core compiler categorized problem categorizedproblem org eclipse jdt core compiler compilation participant compilationparticipant org eclipse jdt core compiler reconcile context reconcilecontext org eclipse jdt core dom ast org eclipse jdt internal compiler ast compilation unit declaration compilationunitdeclaration org eclipse jdt internal core util messages org eclipse jdt internal core util util reconcile working copy signal delta high level sum mmary summmary reconcile pop ulates populates model working copy contents fires fine grained delta flag fine grained describing difference previous content content method removed field changed comp utes computes problems reports i problem requestor iproblemrequestor begin g reporting begingreporting accept problem acceptproblem end reporting endreporting iff working copy consistent buffer force problem detection forceproblemdetection problem requestor active produces dom ast jls jls ast resolved flag not ifies notifies compilation participants reconcile allowing part icipate participate operation report problems suppress warnings suppresswarnings rawtypes reconcile working copy operation reconcileworkingcopyoperation java model operation javamodeloperation perf ast level astlevel resolve bindings resolvebindings hash map hashmap problems reconcile flags reconcileflags working copy owner workingcopyowner working copy owner workingcopyowner org eclipse jdt core dom compilation unit compilationunit ast java element delta builder javaelementdeltabuilder delta builder deltabuilder requestor is active requestorisactive reconcile working copy operation reconcileworkingcopyoperation i java element ijavaelement working copy workingcopy ast level astlevel reconcile flags reconcileflags working copy owner workingcopyowner working copy owner workingcopyowner i java element ijavaelement working copy workingcopy ast level astlevel ast level astlevel reconcile flags reconcileflags reconcile flags reconcileflags working copy owner workingcopyowner working copy owner workingcopyowner exception java model exception javamodelexception setting source original compilation unit fails execute operation executeoperation java model exception javamodelexception check canceled checkcanceled begin task begintask messages element reconciling compilation unit compilationunit working copy workingcopy get working copy getworkingcopy was consistent wasconsistent working copy workingcopy is consistent isconsistent check problem requestor active i problem requestor iproblemrequestor problem requestor problemrequestor working copy workingcopy get per working copy info getperworkingcopyinfo problem requestor problemrequestor problem requestor problemrequestor java model manager javamodelmanager per working copy info perworkingcopyinfo problem requestor problemrequestor get problem requestor getproblemrequestor default requestor is active defaultrequestorisactive problem requestor problemrequestor problem requestor problemrequestor is active isactive i problem requestor iproblemrequestor owner problem requestor ownerproblemrequestor working copy owner workingcopyowner get problem requestor getproblemrequestor working copy workingcopy owner requestor is active ownerrequestorisactive owner problem requestor ownerproblemrequestor owner problem requestor ownerproblemrequestor problem requestor problemrequestor owner problem requestor ownerproblemrequestor is active isactive requestor is active requestorisactive default requestor is active defaultrequestorisactive owner requestor is active ownerrequestorisactive create delta builder remembers current content delta builder deltabuilder java element delta builder javaelementdeltabuilder working copy workingcopy working copy consistent needed compute ast needed make consistent makeconsistent working copy workingcopy https bugs eclipse org bugs bug cgi was consistent wasconsistent reconcile flags reconcileflags i compilation unit icompilationunit force problem detection notify participants notifyparticipants working copy workingcopy recreate ast participant reset ast make consistent makeconsistent working copy workingcopy report problems problems reconcile flags reconcileflags i compilation unit icompilationunit force problem detection was consistent wasconsistent default requestor is active defaultrequestorisactive report problems reportproblems working copy workingcopy problem requestor problemrequestor owner requestor is active ownerrequestorisactive report problems reportproblems working copy workingcopy owner problem requestor ownerproblemrequestor report delta java element delta javaelementdelta delta delta builder deltabuilder delta delta add reconcile delta addreconciledelta working copy workingcopy delta report working copy problems requestor param working copy workingcopy param problem requestor problemrequestor report problems reportproblems compilation unit compilationunit working copy workingcopy i problem requestor iproblemrequestor problem requestor problemrequestor problem requestor problemrequestor begin reporting beginreporting iterator iter aror iteraror problems values iterator iter aror iteraror has next hasnext categorized problem categorizedproblem cat egorized problems categorizedproblems categorized problem categorizedproblem iter aror iteraror cat egorized problems categorizedproblems length cat egorized problems categorizedproblems length length categorized problem categorizedproblem problem cat egorized problems categorizedproblems java model manager javamodelmanager verbose system println nls problem reconciling nls problem get message getmessage progress monitor progressmonitor progress monitor progressmonitor is canceled iscanceled problem requestor problemrequestor accept problem acceptproblem problem problem requestor problemrequestor end reporting endreporting returns working copy operation working compilation unit compilationunit get working copy getworkingcopy compilation unit compilationunit get element t o process getelementtoprocess javadoc org eclipse jdt internal core java model operation javamodeloperation is read only isreadonly is read only isreadonly working copy consistent comp utes computes delta comp utes computes ast needed returns ast org eclipse jdt core dom compilation unit compilationunit make consistent makeconsistent compilation unit compilationunit working copy workingcopy java model exception javamodelexception working copy workingcopy is consistent isconsistent working copy consistent problems problems hash map hashmap resolve bindings resolvebindings requestor is active requestorisactive ast working copy workingcopy make consistent makeconsistent ast level astlevel resolve bindings resolvebindings reconcile flags reconcileflags problems progress monitor progressmonitor delta builder deltabuilder build deltas builddeltas ast delta builder deltabuilder delta delta builder deltabuilder delta changedast ast ast ast recompute ast ast compilation unit declaration compilationunitdeclaration unit java model manager javamodelmanager get java model manager getjavamodelmanager abort on missing source abortonmissingsource compilation unit compilationunit source working copy workingcopy clone caching contents clonecachingcontents find problems needed java project javaproject has java nature hasjavanature working copy workingcopy get java project getjavaproject get project getproject reconcile flags reconcileflags i compilation unit icompilationunit force problem detection resolve bindings resolvebindings requestor is active requestorisactive problems problems hash map hashmap unit compilation unit problem finder compilationunitproblemfinder process source working copy owner workingcopyowner problems ast level astlevel i compilation unit icompilationunit ast creating ast level ast reconcile flags reconcileflags progress monitor progressmonitor progress monitor progressmonitor progress monitor progressmonitor worked create ast needed ast level astlevel i compilation unit icompilationunit ast unit unit working copy consistent problem detection for ced forced java project don create ast api map options working copy workingcopy get java project getjavaproject get options getoptions convert ast ast ast convert compilation unit convertcompilationunit ast level astlevel unit options resolve bindings resolvebindings source reconcile flags reconcileflags progress monitor progressmonitor ast delta builder deltabuilder delta delta builder deltabuilder delta java element delta javaelementdelta working copy workingcopy delta builder deltabuilder delta changedast ast progress monitor progressmonitor progress monitor progressmonitor worked java model exception javamodelexception java project javaproject has java nature hasjavanature working copy workingcopy get java project getjavaproject get project getproject java model manager javamodelmanager get java model manager getjavamodelmanager abort on missing source abortonmissingsource unit unit clean up cleanup ast notify participants notifyparticipants compilation unit compilationunit working copy workingcopy i java project ijavaproject java project javaproject get working copy getworkingcopy get java project getjavaproject compilation participant compilationparticipant participants java model manager javamodelmanager get java model manager getjavamodelmanager compilation participants compilationparticipants get compilation participants getcompilationparticipants java project javaproject participants reconcile context reconcilecontext context reconcile context reconcilecontext working copy workingcopy length participants length length compilation participant compilationparticipant participant participants safe runner saferunner i safe runnable isaferunnable handle exception handleexception throwable exception exception error errors supposed caught error exception exception operation canceled exception operationcanceledexception operation canceled exception operationcanceledexception exception exception unsupported operation exception unsupportedoperationexception disable participant modify buffer working copy reconciled util log exception reconcile participant att empted attempted modify buffer working copy reconciled util log exception exception occurred reconcile participant exception participant reconcile context i java model status ijavamodelstatus verify i java model status ijavamodelstatus status verify status isok status compilation unit compilationunit working copy workingcopy get working copy getworkingcopy working copy workingcopy is working copy isworkingcopy dest royed destroyed java model status javamodelstatus i java model status constants ijavamodelstatusconstants element exist working copy workingcopy status