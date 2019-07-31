copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse core runtime jobs org eclipse core internal jobs internal job internaljob org eclipse core internal jobs job manager jobmanager org eclipse core runtime jobs units runnable work scheduled job manager job completed scheduled jobs reusable jobs constructed jobs start code code job scheduled moves code waiting code job starts running moves code running code execution finishes can celation cancelation code code job code sleeping code user calls job sleep waiting job job scheduled delay jobs code waiting code sleep sleeping jobs woken time job wake up wakeup job code waiting code jobs assigned priority hint job scheduled guarantee jobs priority jobs priority javadoc priority constants provide detail priority jobs start code code priority i job manager ijobmanager job internal job internaljob i adaptable iadaptable job status asynchronous job completion job i progress monitor iprogressmonitor job i status istatus nls i status istatus async finish status i status istatus job manager jobmanager jobs job priorities job priority constant int eractive interactive jobs int eractive interactive jobs generally priority jobs int eractive interactive jobs fast running cpu usage avoid blocking int eractive interactive jobs running get priority getpriority set priority setpriority i progress monitor iprogressmonitor int eractive interactive job priority constant background jobs background jobs jobs typically complete longer cases jobs priority jobs int eractive interactive jobs get priority getpriority set priority setpriority i progress monitor iprogressmonitor job priority constant running background jobs get priority getpriority set priority setpriority i progress monitor iprogressmonitor job priority constant build jobs build jobs generally background jobs complete get priority getpriority set priority setpriority i progress monitor iprogressmonitor build job priority constant decoration jobs decoration jobs lowest priority decoration jobs generally compute extra user int erested interested generally waiting get priority getpriority set priority setpriority i progress monitor iprogressmonitor decorate job code indicating job sleeping waiting running job manager doesn job get state getstate job code indicating job sleeping i progress monitor iprogressmonitor get state getstate sleeping job code indicating job waiting get state getstate waiting job code indicating job running get state getstate running returns job manager job manager org eclipse core jobs i job manager ijobmanager get job manager getjobmanager manager creates job job human readable displayed users unique code code param job job string registers job listener job identical listener registered param listener listener add job change listener addjobchangelistener i job change listener ijobchangelistener listener add job change listener addjobchangelistener listener returns job belongs family job families represented objects int erpreted interpreted job manager job choose belong number families clients override method implementation returns code code overriding implementations code code families recognize param family job family identifier code code job belongs family code code belongs to belongsto object family s tops stops job job waiting removed queue job sleeping discarded chance resume sleeping cleared job executing asked guarantee code code job running resp ond respond can celation cancelation code code cases cancel cancel hook method indicating job running link cancel called time subclasses override method perform additional work can celation cancelation request implementation can celing canceling implementation jobs complete execution asynchronously finished calling method method called job executing asynchronously method called scope job code code method jobs completion returning status code code method jobs status code async finish code method call code code completion param result status object indicating result job execution async finish i progress monitor iprogressmonitor i status istatus result result returns human readable job code code job string get name getname get name getname returns priority job priority hint job scheduled priority job int eractive interactive build decorate get priority getpriority get priority getpriority returns property job identified key code code job property param key property property code code job property set property setproperty qualified name qualifiedname object object get property getproperty qualified name qualifiedname key get property getproperty key returns result job result job code code job finished running i status istatus get result getresult get result getresult returns scheduling rule job returns code code job scheduling rule scheduling rule job code code i scheduling rule ischedulingrule set rule setrule i scheduling rule ischedulingrule i scheduling rule ischedulingrule get rule getrule get rule getrule returns job result code job running code job running code job waiting code job waiting code job sleeping code job sleeping code job code cases note job inherently cases clients rely result method valid time result get state getstate returns running job completed time get state getstate method returns clients infer invoking method job returned job get state getstate get state getstate returns thread job running thread job running code code job running thread unknown thread get thread getthread get thread getthread returns job blocking higher priority system job starting conflicting scheduling rule returns code code job running blocking higher priority system job code code job blocking higher priority system job code code get rule getrule is system issystem is blocking isblocking is blocking isblocking returns job system job system jobs typically revealed users presentation jobs presentation system jobs jobs explicitly jobs treated system jobs code code code code job system job code code set system setsystem is system issystem is system issystem returns job init iated initiated user jobs presented differently code code code code job user init iated initiated job code code set user setuser is user isuser is user isuser waits job finished method block calling thread job finished executing thread int errupted interrupted job scheduled method returns job joined scope method method called job res chedules reschedules method join execution join time job exits link running job enters link method called job manager suspended job joined running job waiting sleeping method returns note deadlock ris k risk join calling thread owns lock object monitor joined thread waiting deadlock occur exception interrupted exception interruptedexception thread int errupted interrupted waiting i lock ilock i job manager ijobmanager suspend join interrupted exception interruptedexception join removes job listener job identical listener registered param listener listener removed remove job change listener removejobchangelistener i job change listener ijobchangelistener listener remove job change listener removejobchangelistener listener executes job returns result execution monitor report progress resp ond respond can cellation cancellation progress monitor can celed canceled job finish execution earliest convenience result status severity link i status istatus cancel singleton cancel status link status cancel status purpose monitor valid duration invocation method method called clients clients call code schedule code turn method called jobs option ally optionally finish execution asynchronously thread returning result status link async finish jobs finish asynchronously execution thread calling code set thread setthread code finished calling method code code param monitor monitor reporting progress resp onding responding can celation cancelation monitor code code status result code code async finish i status istatus i status istatus i progress monitor iprogressmonitor monitor schedules job job queue waiting jobs arrives queue convenience method fully equivalent code schedule code schedule schedule schedule schedules job delay job link sleeping delay elapsed job queue link waiting jobs job arrives queue opportunity jobs equal priority code delay code conflicting scheduling rules guaranteed order scheduled guarantees relative execution order jobs unrelated code code scheduling rules priorities job running res cheduled rescheduled delay finishes method called multiple times job running job res cheduled rescheduled delay scheduling job waiting sleeping param delay time delay milliseconds job i scheduling rule ischedulingrule schedule delay schedule delay job job running waiting sleeping job time job scheduled job human readable displayed users unique code code param job set name setname string set name setname sets priority job affect execution running job affect job scheduled waiting param priority job priority int eractive interactive build decorate set priority setpriority priority set priority setpriority priority associates job progress group progress feedback job execution displayed jobs group monitor monitor created method i job manager ijobmanager create progress group createprogressgroup code ticks code units work progress group job scheduled group single invocation job method association job group lost i job manager ijobmanager create progress group createprogressgroup param group progress group job param ticks number work ticks all ocated allocated parent monitor link i progress monitor iprogressmonitor unknown set progress group setprogressgroup i progress monitor iprogressmonitor group ticks set progress group setprogressgroup group ticks sets property job identified key supplied code code property removed resource properties intended caching mechanism isv plug ins key object associations stored job instance key associations main tained maintained memory times discarded automatically qualifier property unique identifier declaring plug code plugin code param key qualified property param property code code property removed get property getproperty qualified name qualifiedname set property setproperty qualified name qualifiedname key object set property setproperty key sets scheduling rule scheduling job method called job scheduled param rule scheduling rule code code job scheduling rule get rule getrule set rule setrule i scheduling rule ischedulingrule rule set rule setrule rule sets job system job system jobs typically revealed users presentation jobs presentation system jobs jobs explicitly jobs treated system jobs method called job scheduled param code code job system job code code is system issystem set system setsystem set system setsystem sets job init iated initiated user jobs presented differently method called job scheduled param code code job user init iated initiated job code code is user isuser set user setuser set user setuser sets thread job running code code job running thread unknown jobs link async finish code job thread running prevent dead locks deadlocks param thread thread job running async finish i progress monitor iprogressmonitor set thread setthread thread thread set thread setthread thread returns job code code returned job discarded job manager running method called prior calling job method minute pre condition checking job method attempt schedule change job clients override method implementation returns code code code code job code code should run shouldrun returns job scheduled code code returned job discarded job manager queue method called prior adding job waiting job queue minute pre condition checking job scheduled clients override method implementation returns code code code code job manager schedule job code code should schedule shouldschedule requests job suspended job waiting removed queue move link sleeping job remain asleep res umed resumed can celed canceled job waiting method sleeping jobs res umed resumed code wake up wakeup code code code job running sleep code code cases wake up wakeup sleep sleep puts job link waiting eligible execution job sleeping request convenience method fully equivalent code wake up wakeup code sleep wake up wakeup wake up wakeup puts job link waiting delay equivalent can celing canceling sleeping job res cheduling rescheduling delay job sleeping request param delay number milliseconds delay sleep wake up wakeup delay wake up wakeup delay