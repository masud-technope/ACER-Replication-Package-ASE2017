copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal refactoring java lang reflect invocation target exception invocationtargetexception org eclipse swt custom busy indicator busyindicator org eclipse swt widgets display org eclipse swt widgets shell org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime operation canceled exception operationcanceledexception org eclipse core runtime sub progress monitor subprogressmonitor org eclipse core runtime jobs i job manager ijobmanager org eclipse core runtime jobs i scheduling rule ischedulingrule org eclipse core runtime jobs job org eclipse core resources i workspace runnable iworkspacerunnable org eclipse core resources resources plugin resourcesplugin org eclipse jface dialogs dialog org eclipse jface dialogs i dialog constants idialogconstants org eclipse jface dialogs message dialog messagedialog org eclipse jface operation i runnable context irunnablecontext org eclipse ltk core refactoring change org eclipse ltk core refactoring perform change operation performchangeoperation org eclipse ltk core refactoring refactoring org eclipse ltk core refactoring refactoring core refactoringcore org eclipse ltk core refactoring refactoring status refactoringstatus org eclipse ltk refactoring refactoringui org eclipse jdt internal corext util messages org eclipse jdt refactoring refactoring save helper refactoringsavehelper org eclipse jdt internal actions workbench runnable adapter workbenchrunnableadapter helper execute refactoring takes care pushing undo change undo stack folding editor edits editor undo object refactoring execution helper refactoringexecutionhelper refactoring f refactoring frefactoring shell f parent fparent i runnable context irunnablecontext f exec context fexeccontext f stop severity fstopseverity f save mode fsavemode operation i workspace runnable iworkspacerunnable change f change fchange perform change operation performchangeoperation f perform change operation fperformchangeoperation f for ked fforked f for k change execution fforkchangeexecution operation for ked forked for k change execution forkchangeexecution f for ked fforked for ked forked f for k change execution fforkchangeexecution for k change execution forkchangeexecution override i progress monitor iprogressmonitor core exception coreexception nls begin task begintask nls nls f for ked fforked f for k change execution fforkchangeexecution nls sub task subtask nls refactoring status refactoringstatus status f refactoring frefactoring check all conditions checkallconditions sub progress monitor subprogressmonitor sub progress monitor subprogressmonitor prepend main label subtask status get severity getseverity f stop severity fstopseverity canceled f for ked fforked f parent fparent get display getdisplay sync exec syncexec runnable override canceled show status dialog showstatusdialog status canceled show status dialog showstatusdialog status canceled operation canceled exception operationcanceledexception f change fchange f refactoring frefactoring create change createchange sub progress monitor subprogressmonitor sub progress monitor subprogressmonitor prepend main label subtask f change fchange initialize validation data initializevalidationdata sub progress monitor subprogressmonitor sub progress monitor subprogressmonitor prepend main label subtask refactoringui create aware change operation createuiawarechangeoperation f change fchange f perform change operation fperformchangeoperation perform change operation performchangeoperation f change fchange f perform change operation fperformchangeoperation set undo manager setundomanager refactoring core refactoringcore get undo manager getundomanager f refactoring frefactoring get name getname f refactoring frefactoring i scheduled refactoring ischeduledrefactoring f perform change operation fperformchangeoperation set scheduling rule setschedulingrule i scheduled refactoring ischeduledrefactoring f refactoring frefactoring get scheduling rule getschedulingrule f for ked fforked f for k change execution fforkchangeexecution f perform change operation fperformchangeoperation sub progress monitor subprogressmonitor sub progress monitor subprogressmonitor prepend main label subtask param status status code code iff operation cancelled show status dialog showstatusdialog refactoring status refactoringstatus status dialog dialog refactoringui create refactoring status dialog createrefactoringstatusdialog status f parent fparent f refactoring frefactoring get name getname dialog open i dialog constants idialogconstants cancel creates refactoring execution helper param refactoring refactoring param stop severity stopseverity refactoring status constant link refactoring status refactoringstatus param save mode savemode save mode link refactoring save helper refactoringsavehelper param parent parent shell param context runnable context refactoring execution helper refactoringexecutionhelper refactoring refactoring stop severity stopseverity save mode savemode shell parent i runnable context irunnablecontext context is not null isnotnull refactoring is not null isnotnull parent is not null isnotnull context f refactoring frefactoring refactoring f stop severity fstopseverity stop severity stopseverity f parent fparent parent f exec context fexeccontext context f save mode fsavemode save mode savemode called thread param for k fork operation for ked forked param can celable cancelable operation can celable cancelable interrupted exception interruptedexception thrown operation cancelled invocation target exception invocationtargetexception thrown operation failed execute perform for k fork can celable cancelable interrupted exception interruptedexception invocation target exception invocationtargetexception perform for k fork can celable cancelable called thread strong link perform strong param for k fork operation for ked forked param for k change execution forkchangeexecution change executed thread work param can celable cancelable operation can celable cancelable interrupted exception interruptedexception thrown operation cancelled invocation target exception invocationtargetexception thrown operation failed execute perform for k fork for k change execution forkchangeexecution can celable cancelable interrupted exception interruptedexception invocation target exception invocationtargetexception is true istrue display get current getcurrent i job manager ijobmanager manager job get job manager getjobmanager i scheduling rule ischedulingrule rule f refactoring frefactoring i scheduled refactoring ischeduledrefactoring rule i scheduled refactoring ischeduledrefactoring f refactoring frefactoring get scheduling rule getschedulingrule rule resources plugin resourcesplugin get workspace getworkspace get root getroot runnable runnable override manager begin rule beginrule rule busy indicator busyindicator show while showwhile f parent fparent get display getdisplay operation canceled exception operationcanceledexception interrupted exception interruptedexception get message getmessage refactoring save helper refactoringsavehelper save helper savehelper refactoring save helper refactoringsavehelper f save mode fsavemode save helper savehelper save editors saveeditors f parent fparent interrupted exception interruptedexception operation operation for k fork for k change execution forkchangeexecution f refactoring frefactoring set validation context setvalidationcontext f parent fparent f exec context fexeccontext for k fork can celable cancelable workbench runnable adapter workbenchrunnableadapter rule for k fork for k change execution forkchangeexecution f perform change operation fperformchangeoperation f exec context fexeccontext workbench runnable adapter workbenchrunnableadapter f perform change operation fperformchangeoperation rule f perform change operation fperformchangeoperation refactoring status refactoringstatus validation status validationstatus f perform change operation fperformchangeoperation get validation status getvalidationstatus validation status validationstatus validation status validationstatus has fatal error hasfatalerror message dialog messagedialog open error openerror f parent fparent f refactoring frefactoring get name getname messages format refactoring messages refactoringmessages refactoring execution helper refactoringexecutionhelper execute validation status validationstatus get message matching severity getmessagematchingseverity refactoring status refactoringstatus fatal interrupted exception interruptedexception invocation target exception invocationtargetexception perform change operation performchangeoperation pco f perform change operation fperformchangeoperation pco pco change execution failed changeexecutionfailed change exception handler changeexceptionhandler handler change exception handler changeexceptionhandler f parent fparent f refactoring frefactoring throwable get target exception gettargetexception runtime exception runtimeexception handler handle pco get change getchange runtime exception runtimeexception core exception coreexception handler handle pco get change getchange core exception coreexception operation canceled exception operationcanceledexception interrupted exception interruptedexception get message getmessage save helper savehelper trigger incremental build triggerincrementalbuild manager end rule endrule rule f refactoring frefactoring set validation context setvalidationcontext