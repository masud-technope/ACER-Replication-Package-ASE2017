copyright ibm corporation rights reserved program accompanying materials terms common license accompanies distribution http eclipse org legal cpl html contributors ibm corporation initial api implementation org eclipse jdt internal compiler flow java util array list arraylist org eclipse jdt internal compiler ast abstract method declaration abstractmethoddeclaration org eclipse jdt internal compiler ast ast node astnode org eclipse jdt internal compiler ast try statement trystatement org eclipse jdt internal compiler codegen object cache objectcache org eclipse jdt internal compiler lookup block scope blockscope org eclipse jdt internal compiler lookup compiler modifiers compilermodifiers org eclipse jdt internal compiler lookup method scope methodscope org eclipse jdt internal compiler lookup reference binding referencebinding org eclipse jdt internal compiler lookup scope org eclipse jdt internal compiler lookup type binding typebinding ref lects reflects context code analysis keeping track enclosing statements exception handlers exception handling flow context exceptionhandlingflowcontext flow context flowcontext reference binding referencebinding handled exceptions handledexceptions bits bit cache size bitcachesize is reached isreached is needed isneeded unconditional flow info unconditionalflowinfo inits on exceptions initsonexceptions object cache objectcache indexes object cache objectcache is method context ismethodcontext unconditional flow info unconditionalflowinfo inits on return initsonreturn dealing anonymous constructor thrown exceptions array list arraylist extended exceptions extendedexceptions exception handling flow context exceptionhandlingflowcontext flow context flowcontext parent ast node astnode associated node associatednode reference binding referencebinding handled exceptions handledexceptions block scope blockscope scope unconditional flow info unconditionalflowinfo flow info flowinfo parent associated node associatednode is method context ismethodcontext scope scope method scope methodscope handled exceptions handledexceptions handled exceptions handledexceptions count handled exceptions handledexceptions length cache size cachesize count bit cache size bitcachesize reached is reached isreached cache size cachesize needed is needed isneeded cache size cachesize inits on exceptions initsonexceptions unconditional flow info unconditionalflowinfo count count key type indexes handled exceptions handledexceptions is unchecked isunchecked scope compare unchecked exception compareuncheckedexception handled exceptions handledexceptions not related notrelated cache index cacheindex bit cache size bitcachesize bit mask bitmask bit cache size bitcachesize is unchecked isunchecked is reached isreached cache index cacheindex bit mask bitmask inits on exceptions initsonexceptions flow info flowinfo copy unconditional inits unconditionalinits inits on exceptions initsonexceptions flow info flowinfo dead system arraycopy is reached isreached is needed isneeded cache size cachesize inits on return initsonreturn flow info flowinfo dead complain if unused exception handlers complainifunusedexceptionhandlers abstract method declaration abstractmethoddeclaration method method scope methodscope scope method scope option ally optionally skip overriding methods method binding modifiers compiler modifiers compilermodifiers acc overriding accoverriding compiler modifiers compilermodifiers acc impl ementing accimplementing scope environment options report unused declared thrown exception when overriding reportunuseddeclaredthrownexceptionwhenoverriding report errors unreachable exception handlers count handled exceptions handledexceptions length count indexes handled exceptions handledexceptions cache index cacheindex bit cache size bitcachesize bit mask bitmask bit cache size bitcachesize is reached isreached cache index cacheindex bit mask bitmask scope problem reporter problemreporter unused declared thrown exception unuseddeclaredthrownexception handled exceptions handledexceptions method method thrown exceptions thrownexceptions complain if unused exception handlers complainifunusedexceptionhandlers block scope blockscope scope try statement trystatement try statement trystatement report errors unreachable exception handlers count handled exceptions handledexceptions length count indexes handled exceptions handledexceptions cache index cacheindex bit cache size bitcachesize bit mask bitmask bit cache size bitcachesize is reached isreached cache index cacheindex bit mask bitmask scope problem reporter problemreporter unreachable catch block unreachablecatchblock handled exceptions handledexceptions try statement trystatement catch arguments catcharguments type is needed isneeded cache index cacheindex bit mask bitmask scope problem reporter problemreporter hidden catch block hiddencatchblock handled exceptions handledexceptions try statement trystatement catch arguments catcharguments type string individual to string individualtostring nls string buffer stringbuffer buffer string buffer stringbuffer exception flow context length handled exceptions handledexceptions length length cache index cacheindex bit cache size bitcachesize bit mask bitmask bit cache size bitcachesize buffer append append handled exceptions handledexceptions readable name readablename is reached isreached cache index cacheindex bit mask bitmask is needed isneeded cache index cacheindex bit mask bitmask nls buffer append nls masked nls buffer append nls reached nls buffer append nls reached buffer append append inits on exceptions initsonexceptions to string tostring append nls buffer append inits on return initsonreturn append inits on return initsonreturn to string tostring append buffer to string tostring unconditional flow info unconditionalflowinfo inits on exception initsonexception reference binding referencebinding exception type exceptiontype indexes exception type exceptiontype flow info flowinfo dead inits on exceptions initsonexceptions unconditional flow info unconditionalflowinfo inits on return initsonreturn inits on return initsonreturn record handling exception recordhandlingexception reference binding referencebinding exception type exceptiontype unconditional flow info unconditionalflowinfo flow info flowinfo type binding typebinding raised exception raisedexception ast node astnode invocation site invocationsite was already definitely caught wasalreadydefinitelycaught indexes exception type exceptiontype flagged reached unchecked exception handler cache index cacheindex bit cache size bitcachesize bit mask bitmask bit cache size bitcachesize was already definitely caught wasalreadydefinitelycaught is needed isneeded cache index cacheindex bit mask bitmask is reached isreached cache index cacheindex bit mask bitmask inits on exceptions initsonexceptions inits on exceptions initsonexceptions flow info flowinfo dead flow info flowinfo copy unconditional inits unconditionalinits inits on exceptions initsonexceptions merged with mergedwith flow info flowinfo copy unconditional inits unconditionalinits record return from recordreturnfrom flow info flowinfo flow info flowinfo flow info flowinfo is reachable isreachable inits on return initsonreturn flow info flowinfo dead inits on return initsonreturn flow info flowinfo copy unconditional inits unconditionalinits inits on return initsonreturn inits on return initsonreturn merged with mergedwith flow info flowinfo copy unconditional inits unconditionalinits compute merged list unhandled exception types keeping add synthetic thrown exceptions anonymous type constructors jls merge unhandled exception mergeunhandledexception type binding typebinding new exception newexception extended exceptions extendedexceptions extended exceptions extendedexceptions array list arraylist handled exceptions handledexceptions length extended exceptions extendedexceptions add handled exceptions handledexceptions is redundant isredundant extended exceptions extendedexceptions size scope compare types comparetypes new exception newexception type binding typebinding extended exceptions extendedexceptions more generic moregeneric extended exceptions extendedexceptions remove equal or more specific equalormorespecific is redundant isredundant not related notrelated is redundant isredundant extended exceptions extendedexceptions add new exception newexception