copyright ibm corporation rights reserved program accompanying materials terms common license accompanies distribution http eclipse org legal cpl html contributors ibm corporation initial api implementation org eclipse jdt internal compiler flow org eclipse jdt internal compiler lookup field binding fieldbinding org eclipse jdt internal compiler lookup local variable binding localvariablebinding record conditional initialization status definite assignment analysis conditional flow info conditionalflowinfo flow info flowinfo flow info flowinfo inits when true initswhentrue flow info flowinfo inits when false initswhenfalse conditional flow info conditionalflowinfo flow info flowinfo inits when true initswhentrue flow info flowinfo inits when false initswhenfalse inits when true initswhentrue inits when true initswhentrue inits when false initswhenfalse inits when false initswhenfalse flow info flowinfo add initializations from addinitializationsfrom flow info flowinfo other inits otherinits inits when true initswhentrue add initializations from addinitializationsfrom other inits otherinits inits when false initswhenfalse add initializations from addinitializationsfrom other inits otherinits flow info flowinfo add potential initializations from addpotentialinitializationsfrom flow info flowinfo other inits otherinits inits when true initswhentrue add potential initializations from addpotentialinitializationsfrom other inits otherinits inits when false initswhenfalse add potential initializations from addpotentialinitializationsfrom other inits otherinits flow info flowinfo as negated condition asnegatedcondition flow info flowinfo extra inits when true initswhentrue inits when true initswhentrue inits when false initswhenfalse inits when false initswhenfalse extra flow info flowinfo copy conditional flow info conditionalflowinfo inits when true initswhentrue copy inits when false initswhenfalse copy flow info flowinfo inits when false initswhenfalse inits when false initswhenfalse flow info flowinfo inits when true initswhentrue inits when true initswhentrue check status definite assignment field is definitely assigned isdefinitelyassigned field binding fieldbinding field inits when true initswhentrue is definitely assigned isdefinitelyassigned field inits when false initswhenfalse is definitely assigned isdefinitelyassigned field check status definite assignment local variable is definitely assigned isdefinitelyassigned local variable binding localvariablebinding local inits when true initswhentrue is definitely assigned isdefinitelyassigned local inits when false initswhenfalse is definitely assigned isdefinitelyassigned local reach mode reachmode unconditional inits unconditionalinits reach mode reachmode is reachable isreachable unconditional inits unconditionalinits is reachable isreachable check status potential assignment field is potentially assigned ispotentiallyassigned field binding fieldbinding field inits when true initswhentrue is potentially assigned ispotentiallyassigned field inits when false initswhenfalse is potentially assigned ispotentiallyassigned field check status potential assignment local variable is potentially assigned ispotentiallyassigned local variable binding localvariablebinding local inits when true initswhentrue is potentially assigned ispotentiallyassigned local inits when false initswhenfalse is potentially assigned ispotentiallyassigned local record field assigned mark as definitely assigned markasdefinitelyassigned field binding fieldbinding field inits when true initswhentrue mark as definitely assigned markasdefinitelyassigned field inits when false initswhenfalse mark as definitely assigned markasdefinitelyassigned field record field assigned mark as definitely assigned markasdefinitelyassigned local variable binding localvariablebinding local inits when true initswhentrue mark as definitely assigned markasdefinitelyassigned local inits when false initswhenfalse mark as definitely assigned markasdefinitelyassigned local clear initialization info field mark as definitely not assigned markasdefinitelynotassigned field binding fieldbinding field inits when true initswhentrue mark as definitely not assigned markasdefinitelynotassigned field inits when false initswhenfalse mark as definitely not assigned markasdefinitelynotassigned field clear initialization info local variable mark as definitely not assigned markasdefinitelynotassigned local variable binding localvariablebinding local inits when true initswhentrue mark as definitely not assigned markasdefinitelynotassigned local inits when false initswhenfalse mark as definitely not assigned markasdefinitelynotassigned local flow info flowinfo set reach mode setreachmode reach mode reachmode inits when true initswhentrue set reach mode setreachmode reach mode reachmode inits when false initswhenfalse set reach mode setreachmode reach mode reachmode converts conditional receiver inc onditional inconditional updated int ersection intersection assigned variables union assigned variables unconditional flow info unconditionalflowinfo merged with mergedwith unconditional flow info unconditionalflowinfo other inits otherinits unconditional inits unconditionalinits merged with mergedwith other inits otherinits string to string tostring nls nls nls flow info flowinfo inits when true initswhentrue to string tostring inits when false initswhenfalse to string tostring unconditional flow info unconditionalflowinfo unconditional inits unconditionalinits inits when true initswhentrue unconditional inits unconditionalinits copy merged with mergedwith inits when false initswhenfalse unconditional inits unconditionalinits