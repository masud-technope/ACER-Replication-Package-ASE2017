copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse debug jdi tests java util array list arraylist sun jdi boolean value booleanvalue sun jdi string reference stringreference sun jdi event access watchpoint event accesswatchpointevent sun jdi event modification watchpoint event modificationwatchpointevent sun jdi event watchpoint event watchpointevent sun jdi request event request eventrequest sun jdi request event request manager eventrequestmanager tests jdi sun jdi event watchpoint event watchpointevent watchpoint event test watchpointeventtest abstractjditest watchpoint event watchpointevent f access watchpoint event faccesswatchpointevent f static access watchpoint event fstaticaccesswatchpointevent f modification watchpoint event fmodificationwatchpointevent creates test watchpoint event test watchpointeventtest init fields test override local set up localsetup trigger access watchpoint event f access watchpoint event faccesswatchpointevent access watchpoint event accesswatchpointevent trigger and wait triggerandwait get access watchpoint request getaccesswatchpointrequest access watchpoint event accesswatchpointevent assert true asserttrue access watchpoint event f access watchpoint event faccesswatchpointevent trigger access watchpoint event f static access watchpoint event fstaticaccesswatchpointevent access watchpoint event accesswatchpointevent trigger and wait triggerandwait get static access watchpoint request getstaticaccesswatchpointrequest static access watchpoint event staticaccesswatchpointevent assert true asserttrue access watchpoint event f static access watchpoint event fstaticaccesswatchpointevent trigger modification watchpoint event f modification watchpoint event fmodificationwatchpointevent modification watchpoint event modificationwatchpointevent trigger and wait triggerandwait get modification watchpoint request getmodificationwatchpointrequest modification watchpoint event modificationwatchpointevent int err upt interrupt test value current valuecurrent assert true asserttrue modification watchpoint event f modification watchpoint event fmodificationwatchpointevent test leaves override local tear down localteardown ensure modification f bool fbool field completed fvm resume wait until ready waituntilready delete event requests created test event request manager eventrequestmanager request manager requestmanager fvm event request manager eventrequestmanager request manager requestmanager delete event requests deleteeventrequests array list arraylist event request eventrequest request manager requestmanager access watchpoint requests accesswatchpointrequests request manager requestmanager delete event requests deleteeventrequests array list arraylist event request eventrequest request manager requestmanager modification watchpoint requests modificationwatchpointrequests f bool fbool field original reset field resetfield tests output standard output param args main java lang string args watchpoint event test watchpointeventtest run suite runsuite args test junit framework test case testcase get name getname override string get name getname sun jdi event watchpoint event watchpointevent test jdi field testjdifield assert equals assertequals get field getfield f bool fbool f access watchpoint event faccesswatchpointevent field assert equals assertequals get field getfield f string fstring f static access watchpoint event fstaticaccesswatchpointevent field assert equals assertequals get field getfield f bool fbool f modification watchpoint event fmodificationwatchpointevent field test jdi object testjdiobject assert equals assertequals get object reference getobjectreference f access watchpoint event faccesswatchpointevent object assert true asserttrue f static access watchpoint event fstaticaccesswatchpointevent object assert equals assertequals get object reference getobjectreference f modification watchpoint event fmodificationwatchpointevent object test jdi value current valuecurrent testjdivaluecurrent assert true asserttrue boolean value booleanvalue f access watchpoint event faccesswatchpointevent value current valuecurrent assert equals assertequals string reference stringreference f static access watchpoint event fstaticaccesswatchpointevent value current valuecurrent assert true asserttrue boolean value booleanvalue f modification watchpoint event fmodificationwatchpointevent value current valuecurrent