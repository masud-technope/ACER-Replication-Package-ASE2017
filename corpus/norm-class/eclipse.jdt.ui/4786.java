copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt test plugin testplugin util java util logging level java util logging logger org junit org eclipse swt widgets display runs event loop display link condition code code events occurred supplied timeout running event loop link display sleep called caveat time outs timeouts calling thread enter code display sleep code timeout elapses waiter time code sleep code called sleeping thread wake n waken display helper displayhelper controls timeout debug ging debugging disable timeout creates instance display helper displayhelper link condition code code timeout elapses call link display sleep event loop code timeout code event loop driven condition checked code timeout code event loop driven code display sleep code invoked param display display event loop param timeout timeout milliseconds code code condition code code code code timeout elapsed wait for condition waitforcondition display display timeout condition holds succeed condition timeout driving event loop condition hold succeed spawning thread drive event queue driveeventqueue display condition timeout negative fail timeout repeatedly sleep condition timeout elapses display waiter displaywaiter waiter display waiter displaywaiter display display waiter displaywaiter timeout timeout state timeoutstate waiter start timeout condition display sleep drive event queue driveeventqueue display condition condition condition timeout state timeoutstate has time d out hastimedout waiter condition call link display sleep event loop timeout elapsed code timeout code code timeout code event loop driven code display sleep code invoked param display display event loop param millis timeout milliseconds sleep display display millis display helper displayhelper override condition wait for condition waitforcondition display millis condition met order link wait for condition waitforcondition display timeout elapses code code condition met code code event loop driven condition runs event loop display param display display code display read and dispatch readanddispatch code returned code code drive event queue driveeventqueue display display events display read and dispatch readanddispatch events events link condition code code timeout elapses call link display sleep event loop code timeout code event loop driven condition checked code timeout code event loop driven code display sleep code invoked condition rec hecked rechecked code int erval interval code milliseconds events read queue param display display event loop param timeout timeout milliseconds param int erval interval int erval interval check condition milliseconds code code condition code code code code timeout elapsed wait for condition waitforcondition display display timeout int erval interval condition holds succeed condition timeout driving event loop condition hold succeed spawning thread drive event queue driveeventqueue display condition timeout negative fail timeout repeatedly sleep condition timeout elapses display waiter displaywaiter waiter display waiter displaywaiter display current time millis currenttimemillis system current time millis currenttimemillis final timeout finaltimeout timeout current time millis currenttimemillis final timeout finaltimeout current time millis currenttimemillis final timeout finaltimeout max condition waiter restart int erval interval display sleep drive event queue driveeventqueue display condition condition condition disable timeout final timeout finaltimeout system current time millis currenttimemillis waiter condition thread wait timeout wake display wait thread res tarted restarted stopped timed display waiter displaywaiter timeout display waiter thread timeout f timeout state ftimeoutstate returns code code timeout reached code code code code timeout reached code code has time d out hastimedout f mutex fmutex f timeout state ftimeoutstate set time d out settimedout timed out timedout f timeout state ftimeoutstate timed out timedout timeout initial state initialstate f timeout state ftimeoutstate initial state initialstate configuration display f display fdisplay object f mutex fmutex object f keep running on timeout fkeeprunningontimeout transitions stopped running running stopped running idle idle running idle stopped running stopped idle current f state fstate time milliseconds timeout occur f next timeout fnexttimeout thread thread f current thread fcurrentthread timeout current thread timeout f current timeout state fcurrenttimeoutstate creates instance display timeout param display display event loop display waiter displaywaiter display display display creates instance display timeout param display display event loop param keep running keeprunning code code thread running timing display waiter displaywaiter display display keep running keeprunning assert not null assertnotnull display f display fdisplay display f state fstate stopped f keep running on timeout fkeeprunningontimeout keep running keeprunning starts timeout thread running thread running param delay delay milliseconds timeout queried timed status timeout start delay assert true asserttrue delay f mutex fmutex f state fstate stopped start thread startthread set next timeout setnexttimeout delay idle unhold set next timeout setnexttimeout delay f current timeout state fcurrenttimeoutstate sets timeout current time code delay code param delay delay timeout occurs milliseconds set next timeout setnexttimeout delay current time millis currenttimemillis system current time millis currenttimemillis current time millis currenttimemillis delay current time millis currenttimemillis f next timeout fnexttimeout f next timeout fnexttimeout max starts thread running res ets resets timeout param delay delay milliseconds timeout queried timed status timeout restart delay assert true asserttrue delay f mutex fmutex f state fstate stopped start thread startthread idle unhold set next timeout setnexttimeout delay f current timeout state fcurrenttimeoutstate s to ps stops thread running thread started calling link start link restart f mutex fmutex try transition trytransition running idle stopped f mutex fmutex notify all notifyall puts reaper thread hold res tarted restarted calling link start link restart hold f mutex fmutex thread try transition trytransition running idle f mutex fmutex notify all notifyall transition code running code clear timed flag assume current code idle code unhold checked transition checkedtransition idle running f current timeout state fcurrenttimeoutstate timeout f mutex fmutex notify all notifyall start thread assume current code stopped code start thread startthread checked transition checkedtransition stopped running f current timeout state fcurrenttimeoutstate timeout f current thread fcurrentthread thread exception thrown thread not ices notices stopped thread started thread changed exception threadchangedexception exception serialversionuid java lang runnable override interrupted exception interruptedexception logger global log level fine thread changed exception threadchangedexception logger global log level fine f mutex fmutex f mutex fmutex notify all notifyall runs thread interrupted exception interruptedexception thread int errupted interrupted thread changed exception threadchangedexception thread changed interrupted exception interruptedexception thread changed exception threadchangedexception f mutex fmutex check thread checkthread wait potential change try hold tryhold assert states assertstates stopped running is state isstate running wait potential change wait for timeout waitfortimeout is state isstate running change timed out timedout assert states assertstates stopped idle wait potential change try hold tryhold assert states assertstates stopped running assert states assertstates stopped check current thread thread exception thread changed exception threadchangedexception current thread changed check thread checkthread thread changed exception threadchangedexception f current thread fcurrentthread thread changed exception threadchangedexception waits timeout occurs interrupted exception interruptedexception thread int errupted interrupted thread changed exception threadchangedexception thread changed wait for timeout waitfortimeout interrupted exception interruptedexception thread changed exception threadchangedexception delta is state isstate running delta f next timeout fnexttimeout system current time millis currenttimemillis wait order avoid timing display sleep delta math max delta logger global f inest finest sleeping delta f mutex fmutex wait delta check thread checkthread sets timed flag wakes display transitions code idle code running mode code stopped code timed out timedout logger global finer timed f current timeout state fcurrenttimeoutstate set time d out settimedout wake call f display fdisplay wake f keep running on timeout fkeeprunningontimeout checked transition checkedtransition running idle checked transition checkedtransition running stopped waits code idle code returns code running code calling method code stopped code code running code method returns interrupted exception interruptedexception thread int errupted interrupted thread changed exception threadchangedexception thread changed hold try hold tryhold interrupted exception interruptedexception thread changed exception threadchangedexception is state isstate idle f mutex fmutex wait check thread checkthread assert states assertstates stopped running f current thread fcurrentthread start transitions code next state nextstate code current code possible states possiblestates code returns code code transition happened code code param possible states possiblestates trigger transition param next state nextstate transition code code transition happened code code try transition trytransition possible states possiblestates next state nextstate is state isstate possible states possiblestates logger global finer f state fstate next state nextstate possible states possiblestates f state fstate next state nextstate logger global f inest finest no transition notransition f state fstate next state nextstate possible states possiblestates checks code possible states possiblestates code assert ion assertion met transitions code next state nextstate code param possible states possiblestates allowed param next state nextstate transition checked transition checkedtransition possible states possiblestates next state nextstate assert states assertstates possible states possiblestates logger global finer f state fstate next state nextstate f state fstate next state nextstate consistency checking param allowed junit framework assertion failed error assertionfailederror current code code assert states assertstates assert true asserttrue illegal is state isstate answers code code current code code param code code current code code is state isstate f state fstate f state fstate pretty print param string representation string string buffer stringbuffer buf string buffer stringbuffer comma running running buf append running comma stopped stopped comma buf append buf append stopped comma idle idle comma buf append buf append idle buf to string tostring