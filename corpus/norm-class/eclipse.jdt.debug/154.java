copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt debug core org eclipse debug core debug exception debugexception org eclipse jdt core dom message event error notification java breakpoints listeners register code jdi debug model jdidebugmodel code clients register breakpoint listeners code org eclipse jdt debug breakpoint listeners breakpointlisteners code extension point listener contributed receive not ifications notifications java breakpoints receive not ifications notifications specific breakpoints program matically programmatically registering extension breakpoint clients intended implement jdi debug model jdidebugmodel i java breakpoint ijavabreakpoint i java breakpoint listener ijavabreakpointlistener code response breakpoint hit notification indicating vote suspend thread suspend code response breakpoint hit notification indicating vote suspend resume thread dont suspend code response installing notification indicating vote install breakpoint install code response installing notification indicating vote install breakpoint dont install code indicating listener considered vote suspend thread install breakpoint dont care notification breakpoint target message breakpoint debut target pre notification param target java debug target param breakpoint java breakpoint adding breakpoint addingbreakpoint i java debug target ijavadebugtarget target i java breakpoint ijavabreakpoint breakpoint notification breakpoint installed target type listener vote determine breakpoint installed type target listener votes code install code breakpoint installed votes install breakpoint code dont install code vote cancel installation listeners vote code dont care code breakpoint installed param target java debug target param breakpoint java breakpoint param type type breakpoint installed code code breakpoint installed specific type code i java class type ijavaclasstype code code i java interface type ijavainterfacetype code code i java array type ijavaarraytype code breakpoint installed type target listener doesn care code install code code dont install code code dont care code installing breakpoint installingbreakpoint i java debug target ijavadebugtarget target i java breakpoint ijavabreakpoint breakpoint i java type ijavatype type notification breakpoint installed target param target java debug target param breakpoint java breakpoint breakpoint installed breakpointinstalled i java debug target ijavadebugtarget target i java breakpoint ijavabreakpoint breakpoint notification breakpoint hit thread listener vote determine thread suspended response breakpoint listener votes code suspend code thread suspend votes suspend thread code dont suspend code vote avoid suspension resume listeners vote code dont care code thread suspend thread breakpoint encountered suspended listeners query thread perform eval uations evaluations subsequent breakpoints thread voting completed param thread java thread param breakpoint java breakpoint thread suspend listener doesn care code suspend code code dont suspend code code dont care code breakpoint hit breakpointhit i java thread ijavathread thread i java breakpoint ijavabreakpoint breakpoint notification breakpoint removed target param target java debug target param breakpoint java breakpoint breakpoint removed breakpointremoved i java debug target ijavadebugtarget target i java breakpoint ijavabreakpoint breakpoint notification breakpoint runtime errors conditional expression param breakpoint breakpoint param exception debug exception occurred eval uating evaluating breakpoint condition breakpoint has runtime exception breakpointhasruntimeexception i java line breakpoint ijavalinebreakpoint breakpoint debug exception debugexception exception notification breakpoint compilation errors conditional expression param breakpoint breakpoint param errors compilation errors breakpoint condition breakpoint has compilation errors breakpointhascompilationerrors i java line breakpoint ijavalinebreakpoint breakpoint message errors