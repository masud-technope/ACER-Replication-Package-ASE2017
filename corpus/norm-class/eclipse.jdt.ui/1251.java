copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse ltk internal refactoring java lang reflect invocation target exception invocationtargetexception org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime operation canceled exception operationcanceledexception org eclipse core runtime jobs i scheduling rule ischedulingrule org eclipse core runtime jobs job org eclipse core resources i workspace iworkspace org eclipse core resources i workspace runnable iworkspacerunnable org eclipse core resources resources plugin resourcesplugin org eclipse jface operation i runnable with progress irunnablewithprogress org eclipse jface operation i thread listener ithreadlistener code i runnable with progress irunnablewithprogress code adapts code i workspace runnable iworkspacerunnable code executed code i runnable context irunnablecontext code code operation canceled exception operationcanceledexception code thrown adapted runnable caught thrown code interrupted exception interruptedexception code workbench runnable adapter workbenchrunnableadapter i runnable with progress irunnablewithprogress i thread listener ithreadlistener i workspace runnable iworkspacerunnable f workspace runnable fworkspacerunnable i scheduling rule ischedulingrule f rule frule f transfer ftransfer runs workspace runnable lock code code lock param runnable workspace runnable param rule scheduling rule workbench runnable adapter workbenchrunnableadapter i workspace runnable iworkspacerunnable runnable i scheduling rule ischedulingrule rule runnable rule runs workspace runnable lock code code lock param runnable workspace runnable param rule scheduling rule param transfer code code rule transfered model context thread code code workbench runnable adapter workbenchrunnableadapter i workspace runnable iworkspacerunnable runnable i scheduling rule ischedulingrule rule transfer is not null isnotnull runnable is not null isnotnull rule f workspace runnable fworkspacerunnable runnable f rule frule rule f transfer ftransfer transfer i scheduling rule ischedulingrule get scheduling rule getschedulingrule f rule frule override thread change threadchange thread thread f transfer ftransfer job get job manager getjobmanager transfer rule transferrule f rule frule thread i runnable with progress irunnablewithprogress i progress monitor iprogressmonitor override i progress monitor iprogressmonitor monitor invocation target exception invocationtargetexception interrupted exception interruptedexception resources plugin resourcesplugin get workspace getworkspace f workspace runnable fworkspacerunnable f rule frule i workspace iworkspace avoid update monitor operation canceled exception operationcanceledexception interrupted exception interruptedexception get message getmessage core exception coreexception invocation target exception invocationtargetexception