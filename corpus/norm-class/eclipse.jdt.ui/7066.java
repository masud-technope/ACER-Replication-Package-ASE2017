copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors jesper kamstrup linnet eclipse kamstrup linnet initial api implementation report callers callees view org eclipse jdt tests core java util array list arraylist java util collection junit framework test junit framework test case testcase junit framework test suite testsuite org eclipse core runtime null progress monitor nullprogressmonitor org eclipse jdt core i initializer iinitializer org eclipse jdt core i member imember org eclipse jdt core i method imethod org eclipse jdt core i type itype org eclipse jdt internal corext callhierarchy call hierarchy callhierarchy org eclipse jdt internal corext callhierarchy method wrapper methodwrapper org eclipse jdt tests callhierarchy call hierarchy test helper callhierarchytesthelper call hierarchy test callhierarchytest test case testcase string empty string call hierarchy test callhierarchytest call hierarchy test callhierarchytest call hierarchy test helper callhierarchytesthelper helper call hierarchy test callhierarchytest string test suite test suite testsuite override set up setup exception helper call hierarchy test helper callhierarchytesthelper helper set up setup override tear down teardown exception helper tear down teardown helper method wrapper methodwrapper get single caller root getsinglecallerroot i method imethod method method wrapper methodwrapper method wrappers methodwrappers call hierarchy callhierarchy get default getdefault get caller roots getcallerroots i member imember method assert equals assertequals method wrappers methodwrappers length method wrappers methodwrappers method wrapper methodwrapper get single callee root getsinglecalleeroot i method imethod method method wrapper methodwrapper method wrappers methodwrappers call hierarchy callhierarchy get default getdefault get callee roots getcalleeroots i member imember method assert equals assertequals method wrappers methodwrappers length method wrappers methodwrappers test callers testcallers exception helper create simple classes createsimpleclasses i method imethod method helper get method getmethod i method imethod second level method secondlevelmethod helper get method getmethod collection i member imember expected methods expectedmethods array list arraylist expected methods expectedmethods add helper get method getmethod expected methods expectedmethods add second level method secondlevelmethod method wrapper methodwrapper wrapper get single caller root getsinglecallerroot method method wrapper methodwrapper uncached calls uncachedcalls wrapper get calls getcalls null progress monitor nullprogressmonitor helper assert calls assertcalls expected methods expectedmethods uncached calls uncachedcalls method wrapper methodwrapper cached calls cachedcalls wrapper get calls getcalls null progress monitor nullprogressmonitor helper assert calls assertcalls expected methods expectedmethods cached calls cachedcalls method wrapper methodwrapper wrapper helper find method wrapper findmethodwrapper second level method secondlevelmethod cached calls cachedcalls collection i member imember expected second level methods expectedsecondlevelmethods array list arraylist expected second level methods expectedsecondlevelmethods add helper get method getmethod helper assert calls assertcalls expected second level methods expectedsecondlevelmethods wrapper get calls getcalls null progress monitor nullprogressmonitor test callers no results testcallersnoresults exception helper create simple classes createsimpleclasses i method imethod method helper get method getmethod collection i member imember expected methods expectedmethods array list arraylist method wrapper methodwrapper wrapper get single caller root getsinglecallerroot method method wrapper methodwrapper uncached calls uncachedcalls wrapper get calls getcalls null progress monitor nullprogressmonitor helper assert calls assertcalls expected methods expectedmethods uncached calls uncachedcalls method wrapper methodwrapper cached calls cachedcalls wrapper get calls getcalls null progress monitor nullprogressmonitor helper assert calls assertcalls expected methods expectedmethods cached calls cachedcalls test callees testcallees exception helper create simple classes createsimpleclasses i method imethod method helper get method getmethod i method imethod second level method secondlevelmethod helper get method getmethod collection i member imember expected methods expectedmethods array list arraylist expected methods expectedmethods add second level method secondlevelmethod method wrapper methodwrapper wrapper get single callee root getsinglecalleeroot method method wrapper methodwrapper uncached calls uncachedcalls wrapper get calls getcalls null progress monitor nullprogressmonitor helper assert calls assertcalls expected methods expectedmethods uncached calls uncachedcalls method wrapper methodwrapper cached calls cachedcalls wrapper get calls getcalls null progress monitor nullprogressmonitor helper assert calls assertcalls expected methods expectedmethods cached calls cachedcalls method wrapper methodwrapper wrapper helper find method wrapper findmethodwrapper second level method secondlevelmethod cached calls cachedcalls collection i member imember expected methods to expectedmethodsto array list arraylist expected methods to expectedmethodsto add helper get method getmethod expected methods to expectedmethodsto add helper get method getmethod helper assert calls assertcalls expected methods to expectedmethodsto wrapper get calls getcalls null progress monitor nullprogressmonitor test callees no results testcalleesnoresults exception helper create simple classes createsimpleclasses i method imethod method helper get method getmethod collection i member imember expected methods expectedmethods array list arraylist method wrapper methodwrapper wrapper get single callee root getsinglecalleeroot method method wrapper methodwrapper uncached calls uncachedcalls wrapper get calls getcalls null progress monitor nullprogressmonitor helper assert calls assertcalls expected methods expectedmethods uncached calls uncachedcalls method wrapper methodwrapper cached calls cachedcalls wrapper get calls getcalls null progress monitor nullprogressmonitor helper assert calls assertcalls expected methods expectedmethods cached calls cachedcalls test recursive callers testrecursivecallers exception helper create simple classes createsimpleclasses i method imethod method helper get recursive method getrecursivemethod i method imethod method helper get recursive method getrecursivemethod collection i member imember expected methods to expectedmethodsto array list arraylist expected methods to expectedmethodsto add method collection i member imember expected methods to expectedmethodsto array list arraylist expected methods to expectedmethodsto add method method wrapper methodwrapper wrapper get single caller root getsinglecallerroot method method wrapper methodwrapper calls to callsto wrapper get calls getcalls null progress monitor nullprogressmonitor assert recursive assertrecursive calls to callsto method wrapper methodwrapper wrapper helper find method wrapper findmethodwrapper method calls to callsto assert false assertfalse marked recursive wrapper is recursive isrecursive method wrapper methodwrapper calls to callsto wrapper get calls getcalls null progress monitor nullprogressmonitor helper assert calls assertcalls expected methods to expectedmethodsto calls to callsto assert recursive assertrecursive calls to callsto method wrapper methodwrapper method wrapper helper find method wrapper findmethodwrapper method calls to callsto calls to callsto method wrapper get calls getcalls null progress monitor nullprogressmonitor helper assert calls assertcalls expected methods to expectedmethodsto calls to callsto assert recursive assertrecursive calls to callsto test recursive callees testrecursivecallees exception helper create simple classes createsimpleclasses i method imethod method helper get recursive method getrecursivemethod i method imethod method helper get recursive method getrecursivemethod collection i member imember expected methods from expectedmethodsfrom array list arraylist expected methods from expectedmethodsfrom add method collection i member imember expected methods from expectedmethodsfrom array list arraylist expected methods from expectedmethodsfrom add method method wrapper methodwrapper wrapper get single callee root getsinglecalleeroot method method wrapper methodwrapper calls from callsfrom wrapper get calls getcalls null progress monitor nullprogressmonitor helper assert calls assertcalls expected methods from expectedmethodsfrom calls from callsfrom method wrapper methodwrapper wrapper helper find method wrapper findmethodwrapper method calls from callsfrom assert recursive assertrecursive calls from callsfrom method wrapper methodwrapper calls from callsfrom wrapper get calls getcalls null progress monitor nullprogressmonitor helper assert calls assertcalls expected methods from expectedmethodsfrom calls from callsfrom assert recursive assertrecursive calls from callsfrom method wrapper methodwrapper method wrapper helper find method wrapper findmethodwrapper method calls from callsfrom calls from callsfrom method wrapper get calls getcalls null progress monitor nullprogressmonitor helper assert calls assertcalls expected methods from expectedmethodsfrom calls from callsfrom assert recursive assertrecursive calls from callsfrom tests calls origin exception test inner class callers testinnerclasscallers exception helper create inner class createinnerclass i method imethod some method somemethod helper get type gettype get method getmethod outer method outermethod empty i method imethod inner method innermethod helper get type gettype get type gettype get method getmethod inner method innermethod empty i method imethod inner method innermethod helper get type gettype get type gettype get method getmethod inner method innermethod empty collection i member imember expected callers expectedcallers array list arraylist expected callers expectedcallers add inner method innermethod method wrapper methodwrapper wrapper get single caller root getsinglecallerroot some method somemethod method wrapper methodwrapper callers wrapper get calls getcalls null progress monitor nullprogressmonitor assert recursive assertrecursive callers helper assert calls assertcalls expected callers expectedcallers callers collection i member imember expected callers second level expectedcallerssecondlevel array list arraylist expected callers second level expectedcallerssecondlevel add inner method innermethod method wrapper methodwrapper inner method innermethod wrapper helper find method wrapper findmethodwrapper inner method innermethod callers helper assert calls assertcalls expected callers second level expectedcallerssecondlevel inner method innermethod wrapper get calls getcalls null progress monitor nullprogressmonitor tests callees enter exception test inner class callees entering testinnerclasscalleesentering exception helper create inner class createinnerclass i method imethod some method somemethod helper get type gettype get method getmethod outer method outermethod empty i method imethod inner method innermethod helper get type gettype get type gettype get method getmethod inner method innermethod empty i method imethod inner method innermethod helper get type gettype get type gettype get method getmethod inner method innermethod empty collection i member imember expected callers expectedcallers array list arraylist expected callers expectedcallers add inner method innermethod method wrapper methodwrapper wrapper get single callee root getsinglecalleeroot some method somemethod method wrapper methodwrapper callers wrapper get calls getcalls null progress monitor nullprogressmonitor assert recursive assertrecursive callers helper assert calls assertcalls expected callers expectedcallers callers collection i member imember expected callers second level expectedcallerssecondlevel array list arraylist expected callers second level expectedcallerssecondlevel add inner method innermethod method wrapper methodwrapper inner method innermethod wrapper helper find method wrapper findmethodwrapper inner method innermethod callers helper assert calls assertcalls expected callers second level expectedcallerssecondlevel inner method innermethod wrapper get calls getcalls null progress monitor nullprogressmonitor tests callees exits exception test inner class callees exiting testinnerclasscalleesexiting exception helper create inner class createinnerclass i method imethod some method somemethod helper get type gettype get method getmethod outer method outermethod empty i method imethod inner method innermethod helper get type gettype get type gettype get method getmethod inner method innermethod empty i method imethod inner method innermethod helper get type gettype get type gettype get method getmethod inner method innermethod empty collection i member imember expected callers expectedcallers array list arraylist expected callers expectedcallers add inner method innermethod method wrapper methodwrapper wrapper get single callee root getsinglecalleeroot inner method innermethod method wrapper methodwrapper callers wrapper get calls getcalls null progress monitor nullprogressmonitor assert recursive assertrecursive callers helper assert calls assertcalls expected callers expectedcallers callers collection i member imember expected callers second level expectedcallerssecondlevel array list arraylist expected callers second level expectedcallerssecondlevel add some method somemethod method wrapper methodwrapper inner method innermethod wrapper helper find method wrapper findmethodwrapper inner method innermethod callers helper assert calls assertcalls expected callers second level expectedcallerssecondlevel inner method innermethod wrapper get calls getcalls null progress monitor nullprogressmonitor tests calls origin exception test anonymous inner class callers testanonymousinnerclasscallers exception helper create anonymous inner class createanonymousinnerclass i method imethod some method somemethod helper get type gettype get method getmethod some method somemethod empty i method imethod result helper get type gettype get field getfield anon class anonclass get type gettype get method getmethod another method anothermethod empty collection i member imember expected callers expectedcallers array list arraylist expected callers expectedcallers add result method wrapper methodwrapper wrapper get single caller root getsinglecallerroot some method somemethod method wrapper methodwrapper callers wrapper get calls getcalls null progress monitor nullprogressmonitor assert recursive assertrecursive callers helper assert calls assertcalls expected callers expectedcallers callers tests calls origin exception test anonymous inner class on interface callees testanonymousinnerclassoninterfacecallees exception regression test bug call hierarchy searching callees anonymous classes fails helper create anonymous inner class createanonymousinnerclass i method imethod method helper get type gettype get method getmethod anonymous on interface anonymousoninterface empty method wrapper methodwrapper wrapper get single callee root getsinglecalleeroot method method wrapper methodwrapper callers wrapper get calls getcalls null progress monitor nullprogressmonitor assert recursive assertrecursive callers assert equals assertequals wrong number callees callers length i member imember member callers get member getmember assert true asserttrue wrong member type expected i type itype member i type itype assert equals assertequals wrong member int f intf member get element name getelementname tests calls origin exception test anonymous inner class inside method callees testanonymousinnerclassinsidemethodcallees exception regression test bug call hierarchy call hierarchy doesn callees method anonymous type helper create anonymous inner class inside method createanonymousinnerclassinsidemethod i method imethod method m methodm helper get type gettype get method getmethod empty method wrapper methodwrapper wrapper get single callee root getsinglecalleeroot method m methodm method wrapper methodwrapper callers wrapper get calls getcalls null progress monitor nullprogressmonitor assert recursive assertrecursive callers assert equals assertequals wrong number callees callers length i method imethod method run methodrun method m methodm get type gettype get method getmethod empty wrapper get single callee root getsinglecalleeroot method run methodrun callers wrapper get calls getcalls null progress monitor nullprogressmonitor assert recursive assertrecursive callers assert equals assertequals wrong number callees callers length assert equals assertequals wrong callee method println callers get member getmember get element name getelementname assert equals assertequals wrong callee type java print stream printstream callers get member getmember get declaring type getdeclaringtype get fully qualified name getfullyqualifiedname tests calls origin exception test anonymous inner class on class callees testanonymousinnerclassonclasscallees exception regression test bug call hierarchy searching callees anonymous classes fails helper create anonymous inner class createanonymousinnerclass i method imethod method helper get type gettype get method getmethod anonymous on class anonymousonclass empty method wrapper methodwrapper wrapper get single callee root getsinglecalleeroot method method wrapper methodwrapper callers wrapper get calls getcalls null progress monitor nullprogressmonitor assert recursive assertrecursive callers assert equals assertequals wrong number callees callers length i member imember member callers get member getmember assert true asserttrue wrong member type expected i type itype member i type itype assert equals assertequals wrong member clazz member get element name getelementname tests calls origin initializer block exception test initializer callers testinitializercallers exception helper create static initializer class createstaticinitializerclass i method imethod some method somemethod helper get type gettype get method getmethod some method somemethod empty i initializer iinitializer initializer helper get type gettype get initializer getinitializer collection i member imember expected callers expectedcallers array list arraylist expected callers expectedcallers add initializer method wrapper methodwrapper wrapper get single caller root getsinglecallerroot some method somemethod method wrapper methodwrapper callers wrapper get calls getcalls null progress monitor nullprogressmonitor assert recursive assertrecursive callers helper assert calls assertcalls expected callers expectedcallers callers test implicit constructor callers testimplicitconstructorcallers exception helper create simple classes createsimpleclasses i method imethod constructor a constructora helper get type gettype get method getmethod empty collection i member imember expected callers expectedcallers array list arraylist expected callers expectedcallers add helper get type gettype method wrapper methodwrapper wrapper get single caller root getsinglecallerroot constructor a constructora method wrapper methodwrapper callers wrapper get calls getcalls null progress monitor nullprogressmonitor assert recursive assertrecursive callers helper assert calls assertcalls expected callers expectedcallers callers test implicit constructor callees testimplicitconstructorcallees exception helper create implicit constructor classes createimplicitconstructorclasses i method imethod constructor b constructorb helper get type gettype get methods getmethods collection i member imember expected callers expectedcallers array list arraylist expected callers expectedcallers add helper get type gettype method wrapper methodwrapper wrapper get single callee root getsinglecalleeroot constructor b constructorb method wrapper methodwrapper callers wrapper get calls getcalls null progress monitor nullprogressmonitor assert recursive assertrecursive callers helper assert calls assertcalls expected callers expectedcallers callers test line number callers testlinenumbercallers exception helper create simple classes createsimpleclasses method wrapper methodwrapper wrapper get single caller root getsinglecallerroot helper get method getmethod method wrapper methodwrapper calls wrapper get calls getcalls null progress monitor nullprogressmonitor method wrapper methodwrapper method wrapper helper find method wrapper findmethodwrapper helper get method getmethod calls assert equals assertequals wrong number method wrapper get method call getmethodcall get first call location getfirstcalllocation get line number getlinenumber wrapper get single caller root getsinglecallerroot helper get recursive method getrecursivemethod calls wrapper get calls getcalls null progress monitor nullprogressmonitor method wrapper methodwrapper recursive method recursivemethod wrapper helper find method wrapper findmethodwrapper helper get recursive method getrecursivemethod calls assert equals assertequals wrong number recursive method recursivemethod wrapper get method call getmethodcall get first call location getfirstcalllocation get line number getlinenumber test line number callees testlinenumbercallees exception helper create simple classes createsimpleclasses method wrapper methodwrapper wrapper get single callee root getsinglecalleeroot helper get method getmethod method wrapper methodwrapper calls wrapper get calls getcalls null progress monitor nullprogressmonitor method wrapper methodwrapper method wrapper helper find method wrapper findmethodwrapper helper get method getmethod calls assert equals assertequals wrong number method wrapper get method call getmethodcall get first call location getfirstcalllocation get line number getlinenumber wrapper get single callee root getsinglecalleeroot helper get recursive method getrecursivemethod calls wrapper get calls getcalls null progress monitor nullprogressmonitor method wrapper methodwrapper recursive method recursivemethod wrapper helper find method wrapper findmethodwrapper helper get recursive method getrecursivemethod calls assert equals assertequals wrong number recursive method recursivemethod wrapper get method call getmethodcall get first call location getfirstcalllocation get line number getlinenumber assert recursive assertrecursive method wrapper methodwrapper call results callresults should be recursive shouldberecursive call results callresults length assert equals assertequals wrong recursive call results callresults get name getname should be recursive shouldberecursive call results callresults is recursive isrecursive