copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse debug jdi tests java util list sun jdi request event request manager eventrequestmanager sun jdi request monitor contended enter request monitorcontendedenterrequest sun jdi request monitor contended entered request monitorcontendedenteredrequest sun jdi request monitor wait request monitorwaitrequest sun jdi request monitor waited request monitorwaitedrequest test cases implementation providing argument debug ging debugging java contended monitor tests contendedmonitortests abstractjditest event request manager eventrequestmanager erm setup test info locally override local set up localsetup erm fvm event request manager eventrequestmanager test monitor events info test can request monitor events testcanrequestmonitorevents or greater orgreater assert true asserttrue ability request monitor events info fvm can request monitor events canrequestmonitorevents assert true asserttrue ability request monitor events info fvm can request monitor events canrequestmonitorevents test monitor contended enter requests event request manager test applicable vm s vms test monitor contended enter requests testmonitorcontendedenterrequests fvm can request monitor events canrequestmonitorevents monitor contended enter request monitorcontendedenterrequest req erm create monitor contended enter request createmonitorcontendedenterrequest req enable list list erm monitor contended enter requests monitorcontendedenterrequests assert not null assertnotnull list list assert true asserttrue list size list size assert true asserttrue req enabled monitor contended enter request monitorcontendedenterrequest list is enabled isenabled test monitor contended entered requests event request manager test applicable vm s vms test monitor contended entered requests testmonitorcontendedenteredrequests fvm can request monitor events canrequestmonitorevents monitor contended entered request monitorcontendedenteredrequest req erm create monitor contended entered request createmonitorcontendedenteredrequest req enable list list erm monitor contended entered requests monitorcontendedenteredrequests assert not null assertnotnull list list assert true asserttrue list size list size assert true asserttrue req enabled monitor contended entered request monitorcontendedenteredrequest list is enabled isenabled test monitor wait requests event request manager test applicable vm s vms test monitor wait request testmonitorwaitrequest fvm can request monitor events canrequestmonitorevents monitor wait request monitorwaitrequest req erm create monitor wait request createmonitorwaitrequest req enable list list erm monitor wait requests monitorwaitrequests assert not null assertnotnull list list assert true asserttrue list size list size assert true asserttrue req enabled monitor wait request monitorwaitrequest list is enabled isenabled test monitor waited requests event request manager test applicable vm s vms test monitor waited request testmonitorwaitedrequest fvm can request monitor events canrequestmonitorevents monitor waited request monitorwaitedrequest req erm create monitor waited request createmonitorwaitedrequest req enable list list erm monitor waited requests monitorwaitedrequests assert not null assertnotnull list list assert true asserttrue list size list size assert true asserttrue req enabled monitor waited request monitorwaitedrequest list is enabled isenabled