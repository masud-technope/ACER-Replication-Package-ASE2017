copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors robert fuhrer rfuhrer watson ibm ibm corporation initial api implementation org eclipse jdt internal corext refactoring type constraints typeconstraints types ets typesets java util iterator org eclipse jdt internal corext refactoring type constraints typeconstraints types t type ttype org eclipse jdt internal corext refactoring type constraints typeconstraints t types ttypes type set intersection typesetintersection type set typeset type set typeset flhs type set typeset frhs type set intersection typesetintersection type set typeset lhs type set typeset rhs lhs get type set environment gettypesetenvironment flhs lhs frhs rhs returns lhs type set typeset getlhs flhs returns rhs type set typeset getrhs frhs override is universe isuniverse flhs is universe isuniverse frhs is universe isuniverse override type set typeset make clone makeclone type set intersection typesetintersection flhs make clone makeclone frhs make clone makeclone override is empty isempty flhs is empty isempty frhs is empty isempty flhs is universe isuniverse frhs is universe isuniverse quick check jumping expensive stuff flhs get java lang object getjavalangobject frhs get java lang object getjavalangobject override t type ttype flhs frhs override contains all containsall type set typeset flhs contains all containsall frhs contains all containsall override type set typeset sub types subtypes is universe isuniverse get java lang object getjavalangobject get type set environment gettypesetenvironment get universe type set getuniversetypeset xsect xsect flhs sub types set subtypesset flhs sub types of singleton subtypesofsingleton frhs sub types set subtypesset frhs sub types of singleton subtypesofsingleton get type set environment gettypesetenvironment create sub types set createsubtypesset override type set typeset super types supertypes xsect xsect flhs super types set supertypesset flhs super types of singleton supertypesofsingleton frhs super types set supertypesset frhs super types of singleton supertypesofsingleton get type set environment gettypesetenvironment create super types set createsupertypesset override type set typeset upper bound upperbound flhs get java lang object getjavalangobject frhs get java lang object getjavalangobject singleton type set singletontypeset get type set environment gettypesetenvironment get java lang object getjavalangobject get type set environment gettypesetenvironment f enum cache fenumcache f enum cache fenumcache upper bound upperbound enum erated type set enumeratedtypeset lhs set lhsset flhs enumerate enum erated type set enumeratedtypeset rhs set rhsset frhs enumerate type set typeset xsect lhs set lhsset int ersected with intersectedwith rhs set rhsset xsect upper bound upperbound override type set typeset lower bound lowerbound flhs has unique lower bound hasuniquelowerbound frhs has unique lower bound hasuniquelowerbound t type ttype lhs bound lhsbound flhs unique lower bound uniquelowerbound t type ttype rhs bound rhsbound frhs unique lower bound uniquelowerbound lhs bound lhsbound equals rhs bound rhsbound singleton type set singletontypeset lhs bound lhsbound get type set environment gettypesetenvironment t types ttypes can assign to canassignto lhs bound lhsbound rhs bound rhsbound singleton type set singletontypeset rhs bound rhsbound get type set environment gettypesetenvironment t types ttypes can assign to canassignto rhs bound rhsbound lhs bound lhsbound singleton type set singletontypeset lhs bound lhsbound get type set environment gettypesetenvironment f enum cache fenumcache f enum cache fenumcache lower bound lowerbound enum erated type set enumeratedtypeset lhs set lhsset flhs enumerate enum erated type set enumeratedtypeset rhs set rhsset frhs enumerate type set typeset xsect lhs set lhsset int ersected with intersectedwith rhs set rhsset xsect lower bound lowerbound override type set typeset special cases int ersected with specialcasesintersectedwith type set typeset xsect xsect xsect equals flhs xsect xsect xsect equals frhs type set intersection typesetintersection type set intersection typesetintersection type set intersection typesetintersection xsect xsect xsect xsect xsect flhs equals flhs type set intersection typesetintersection frhs xsect xsect xsect xsect xsect flhs equals frhs type set intersection typesetintersection flhs xsect xsect xsect xsect xsect frhs equals flhs type set intersection typesetintersection frhs xsect xsect xsect xsect xsect frhs equals frhs type set intersection typesetintersection flhs override is singleton issingleton f enum cache fenumcache f enum cache fenumcache is singleton issingleton count iterator t type ttype lhs iter lhsiter flhs iterator lhs iter lhsiter has next hasnext t type ttype lhs iter lhsiter frhs count count count override t type ttype any member anymember f enum cache fenumcache f enum cache fenumcache any member anymember iterator t type ttype lhs iter lhsiter flhs iterator lhs iter lhsiter has next hasnext t type ttype lhs iter lhsiter frhs override iterator t type ttype iterator enumerate iterator iterator iterator flhsiter flhs iterator t type ttype f next fnext remove illegal state exception illegalstateexception unimplemented advance flhsiter has next hasnext t type ttype t type ttype flhsiter frhs f next fnext has next hasnext f next fnext advance f next fnext object f next fnext advance f next fnext no such element exception nosuchelementexception elements type set intersection typesetintersection t type ttype result f next fnext f next fnext result override equals object type set intersection typesetintersection type set intersection typesetintersection type set intersection typesetintersection flhs equals flhs frhs equals frhs override hash code hashcode flhs hash code hashcode frhs hash code hashcode override string to string tostring nls nls nls nls fid int ersect intersect flhs frhs override has unique lower bound hasuniquelowerbound override has unique upper bound hasuniqueupperbound override t type ttype unique lower bound uniquelowerbound override t type ttype unique upper bound uniqueupperbound enum erated type set enumeratedtypeset f enum cache fenumcache override enum erated type set enumeratedtypeset enumerate f enum cache fenumcache enum erated type set enumeratedtypeset lhs set lhsset flhs enumerate enum erated type set enumeratedtypeset rhs set rhsset frhs enumerate f enum cache fenumcache lhs set lhsset int ersected with intersectedwith rhs set rhsset enumerate f enum cache fenumcache