copyright ibm corporation rights reserved program accompanying materials terms common license accompanies distribution http eclipse org legal cpl html contributors ibm corporation initial api implementation org eclipse jdt internal compiler ast org eclipse jdt internal compiler ast visitor astvisitor org eclipse jdt internal compiler impl org eclipse jdt internal compiler class fmt classfmt class file constants classfileconstants org eclipse jdt internal compiler codegen org eclipse jdt internal compiler flow org eclipse jdt internal compiler lookup conditional expression conditionalexpression operator expression operatorexpression expression condition value if true valueiftrue value if false valueiffalse constant optimized boolean constant optimizedbooleanconstant constant optimized if true constant optimizediftrueconstant constant optimized if false constant optimizediffalseconstant local variables table attributes true init state index trueinitstateindex false init state index falseinitstateindex merged init state index mergedinitstateindex conditional expression conditionalexpression expression condition expression value if true valueiftrue expression value if false valueiffalse condition condition value if true valueiftrue value if true valueiftrue value if false valueiffalse value if false valueiffalse source start sourcestart condition source start sourcestart source end sourceend value if false valueiffalse source end sourceend flow info flowinfo analyse code analysecode block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo constant cst condition optimized boolean constant optimizedbooleanconstant is condition optimized true isconditionoptimizedtrue cst notaconstant cst boolean value booleanvalue is condition optimized false isconditionoptimizedfalse cst notaconstant cst boolean value booleanvalue mode flow info flowinfo reach mode reachmode flow info flowinfo condition analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo cst notaconstant process flow info flowinfo true flow info trueflowinfo flow info flowinfo inits when true initswhentrue copy is condition optimized false isconditionoptimizedfalse true flow info trueflowinfo set reach mode setreachmode flow info flowinfo unreachable true init state index trueinitstateindex current scope currentscope method scope methodscope record initialization states recordinitializationstates true flow info trueflowinfo true flow info trueflowinfo value if true valueiftrue analyse code analysecode current scope currentscope flow context flowcontext true flow info trueflowinfo process flow info flowinfo false flow info falseflowinfo flow info flowinfo inits when false initswhenfalse copy is condition optimized true isconditionoptimizedtrue false flow info falseflowinfo set reach mode setreachmode flow info flowinfo unreachable false init state index falseinitstateindex current scope currentscope method scope methodscope record initialization states recordinitializationstates false flow info falseflowinfo false flow info falseflowinfo value if false valueiffalse analyse code analysecode current scope currentscope flow context flowcontext false flow info falseflowinfo merge initial izations initializations flow info flowinfo merged info mergedinfo is condition optimized true isconditionoptimizedtrue merged info mergedinfo true flow info trueflowinfo add potential initializations from addpotentialinitializationsfrom false flow info falseflowinfo is condition optimized false isconditionoptimizedfalse merged info mergedinfo false flow info falseflowinfo add potential initializations from addpotentialinitializationsfrom true flow info trueflowinfo cst optimized if true constant optimizediftrueconstant is value if true optimized true isvalueiftrueoptimizedtrue cst cst notaconstant cst boolean value booleanvalue is value if true optimized false isvalueiftrueoptimizedfalse cst cst notaconstant cst boolean value booleanvalue cst optimized if false constant optimizediffalseconstant is value if false optimized true isvalueiffalseoptimizedtrue cst cst notaconstant cst boolean value booleanvalue is value if false optimized false isvalueiffalseoptimizedfalse cst cst notaconstant cst boolean value booleanvalue unconditional flow info unconditionalflowinfo true info when true trueinfowhentrue true flow info trueflowinfo inits when true initswhentrue copy unconditional inits unconditionalinits is value if true optimized false isvalueiftrueoptimizedfalse true info when true trueinfowhentrue set reach mode setreachmode flow info flowinfo unreachable unconditional flow info unconditionalflowinfo false info when true falseinfowhentrue false flow info falseflowinfo inits when true initswhentrue copy unconditional inits unconditionalinits is value if false optimized false isvalueiffalseoptimizedfalse false info when true falseinfowhentrue set reach mode setreachmode flow info flowinfo unreachable unconditional flow info unconditionalflowinfo true info when false trueinfowhenfalse true flow info trueflowinfo inits when false initswhenfalse copy unconditional inits unconditionalinits is value if true optimized true isvalueiftrueoptimizedtrue true info when false trueinfowhenfalse set reach mode setreachmode flow info flowinfo unreachable unconditional flow info unconditionalflowinfo false info when false falseinfowhenfalse false flow info falseflowinfo inits when false initswhenfalse copy unconditional inits unconditionalinits is value if false optimized true isvalueiffalseoptimizedtrue false info when false falseinfowhenfalse set reach mode setreachmode flow info flowinfo unreachable merged info mergedinfo flow info flowinfo conditional true info when true trueinfowhentrue merged with mergedwith false info when true falseinfowhentrue true info when false trueinfowhenfalse merged with mergedwith false info when false falseinfowhenfalse merged init state index mergedinitstateindex current scope currentscope method scope methodscope record initialization states recordinitializationstates merged info mergedinfo merged info mergedinfo set reach mode setreachmode mode merged info mergedinfo code generation conditional param current scope currentscope org eclipse jdt internal compiler lookup block scope blockscope param code stream codestream org eclipse jdt internal compiler codegen code stream codestream param value required valuerequired generate code generatecode block scope blockscope current scope currentscope code stream codestream code stream codestream value required valuerequired code stream codestream position label end if label endiflabel false label falselabel constant notaconstant value required valuerequired code stream codestream generate constant generateconstant constant implicit conversion implicitconversion code stream codestream record positions from recordpositionsfrom source start sourcestart constant cst condition constant constant cond cst condcst condition optimized boolean constant optimizedbooleanconstant need true part needtruepart cst notaconstant cst boolean value booleanvalue cond cst condcst notaconstant cond cst condcst boolean value booleanvalue need false part needfalsepart cst notaconstant cst boolean value booleanvalue cond cst condcst notaconstant cond cst condcst boolean value booleanvalue end if label endiflabel label code stream codestream generate code condition need condition value needconditionvalue cst notaconstant cond cst condcst notaconstant condition generate optimized boolean generateoptimizedboolean current scope currentscope code stream codestream false label falselabel label code stream codestream need condition value needconditionvalue true init state index trueinitstateindex code stream codestream remove not definitely assigned variables removenotdefinitelyassignedvariables current scope currentscope true init state index trueinitstateindex code stream codestream add definitely assigned variables adddefinitelyassignedvariables current scope currentscope true init state index trueinitstateindex code generation need true part needtruepart value if true valueiftrue generate code generatecode current scope currentscope code stream codestream value required valuerequired need false part needfalsepart jump position code stream codestream position code stream codestream end if label endiflabel code stream codestream update last recorded end c updatelastrecordedendpc position tune code stream codestream stack size value required valuerequired code stream codestream decr stack size decrstacksize resolved type resolvedtype long binding longbinding resolved type resolvedtype double binding doublebinding need false part needfalsepart false label falselabel place false init state index falseinitstateindex code stream codestream remove not definitely assigned variables removenotdefinitelyassignedvariables current scope currentscope false init state index falseinitstateindex code stream codestream add definitely assigned variables adddefinitelyassignedvariables current scope currentscope false init state index falseinitstateindex value if false valueiffalse generate code generatecode current scope currentscope code stream codestream value required valuerequired statement end if label endiflabel place loose local variable initial izations initializations local variable attributes merged init state index mergedinitstateindex code stream codestream remove not definitely assigned variables removenotdefinitelyassignedvariables current scope currentscope merged init state index mergedinitstateindex implicit conversion value required valuerequired code stream codestream generate implicit conversion generateimplicitconversion implicit conversion implicitconversion code stream codestream record positions from recordpositionsfrom source start sourcestart optimized code generation conditional generate optimized boolean generateoptimizedboolean block scope blockscope current scope currentscope code stream codestream code stream codestream label true label truelabel label false label falselabel value required valuerequired constant constant constant notaconstant constant typeid values value if true valueiftrue implicit conversion implicitconversion generate optimized boolean generateoptimizedboolean current scope currentscope code stream codestream true label truelabel false label falselabel value required valuerequired constant cst condition constant constant cond cst condcst condition optimized boolean constant optimizedbooleanconstant need true part needtruepart cst notaconstant cst boolean value booleanvalue cond cst condcst notaconstant cond cst condcst boolean value booleanvalue need false part needfalsepart cst notaconstant cst boolean value booleanvalue cond cst condcst notaconstant cond cst condcst boolean value booleanvalue label internal false label internalfalselabel end if label endiflabel label code stream codestream generate code condition need condition value needconditionvalue cst notaconstant cond cst condcst notaconstant condition generate optimized boolean generateoptimizedboolean current scope currentscope code stream codestream internal false label internalfalselabel label code stream codestream need condition value needconditionvalue true init state index trueinitstateindex code stream codestream remove not definitely assigned variables removenotdefinitelyassignedvariables current scope currentscope true init state index trueinitstateindex code stream codestream add definitely assigned variables adddefinitelyassignedvariables current scope currentscope true init state index trueinitstateindex code generation need true part needtruepart value if true valueiftrue generate optimized boolean generateoptimizedboolean current scope currentscope code stream codestream true label truelabel false label falselabel value required valuerequired need false part needfalsepart jump position code stream codestream position code stream codestream end if label endiflabel code stream codestream update last recorded end c updatelastrecordedendpc position decrement code stream codestream stack size value if true valueiftrue consumed branch byte code bytecode need false part needfalsepart internal false label internalfalselabel place false init state index falseinitstateindex code stream codestream remove not definitely assigned variables removenotdefinitelyassignedvariables current scope currentscope false init state index falseinitstateindex code stream codestream add definitely assigned variables adddefinitelyassignedvariables current scope currentscope false init state index falseinitstateindex value if false valueiffalse generate optimized boolean generateoptimizedboolean current scope currentscope code stream codestream true label truelabel false label falselabel value required valuerequired statement end if label endiflabel place loose local variable initial izations initializations local variable attributes merged init state index mergedinitstateindex code stream codestream remove not definitely assigned variables removenotdefinitelyassignedvariables current scope currentscope merged init state index mergedinitstateindex implicit conversion values code stream codestream update last recorded end c updatelastrecordedendpc code stream codestream position constant optimized boolean constant optimizedbooleanconstant optimized boolean constant optimizedbooleanconstant constant optimized boolean constant optimizedbooleanconstant string buffer stringbuffer print expression no parent hesis printexpressionnoparenthesis indent string buffer stringbuffer output nls condition print expression printexpression indent output append nls value if true valueiftrue print expression printexpression output append value if false valueiffalse print expression printexpression output type binding typebinding resolve type resolvetype block scope blockscope scope specs constant notaconstant type binding typebinding condition type conditiontype condition resolve type expecting resolvetypeexpecting scope boolean binding booleanbinding check value if true valueiftrue cast expression castexpression value if true valueiftrue bits ignore need for cast check k ignoreneedforcastcheckmask type binding typebinding value if true type valueiftruetype value if true valueiftrue resolve type resolvetype scope check value if false valueiffalse cast expression castexpression value if false valueiffalse bits ignore need for cast check k ignoreneedforcastcheckmask type binding typebinding value if false type valueiffalsetype value if false valueiffalse resolve type resolvetype scope condition type conditiontype value if true type valueiftruetype value if false type valueiffalsetype propagate constant value if true valueiftrue valueiffalse expression constant cond constant condconstant true constant trueconstant false constant falseconstant cond constant condconstant condition constant notaconstant true constant trueconstant value if true valueiftrue constant notaconstant false constant falseconstant value if false valueiffalse constant notaconstant terms constant expression propagate constant valueiftrue value if false valueiffalse teh receiver constant constant cond constant condconstant boolean value booleanvalue true constant trueconstant false constant falseconstant harmed implicit conversion value if true type valueiftruetype value if false type valueiffalsetype value if true valueiftrue compute conversion computeconversion scope value if true type valueiftruetype value if true type valueiftruetype value if false valueiffalse implicit conversion implicitconversion value if true valueiftrue implicit conversion implicitconversion value if true type valueiftruetype boolean binding booleanbinding optimized if true constant optimizediftrueconstant value if true valueiftrue optimized boolean constant optimizedbooleanconstant optimized if false constant optimizediffalseconstant value if false valueiffalse optimized boolean constant optimizedbooleanconstant optimized if true constant optimizediftrueconstant notaconstant optimized if false constant optimizediffalseconstant notaconstant optimized if true constant optimizediftrueconstant boolean value booleanvalue optimized if false constant optimizediffalseconstant boolean value booleanvalue optimized boolean constant optimizedbooleanconstant optimized if true constant optimizediftrueconstant propagate optimized constant cond constant condconstant condition optimized boolean constant optimizedbooleanconstant notaconstant optimized boolean constant optimizedbooleanconstant cond constant condconstant boolean value booleanvalue optimized if true constant optimizediftrueconstant optimized if false constant optimizediffalseconstant resolved type resolvedtype value if true type valueiftruetype numeric types value if true type valueiftruetype is numeric type isnumerictype value if false type valueiffalsetype is numeric type isnumerictype value if true type valueiftruetype byte binding bytebinding value if false type valueiffalsetype short binding shortbinding value if true type valueiftruetype short binding shortbinding value if false type valueiffalsetype byte binding bytebinding value if true valueiftrue compute conversion computeconversion scope short binding shortbinding value if true type valueiftruetype value if false valueiffalse compute conversion computeconversion scope short binding shortbinding value if false type valueiffalsetype resolved type resolvedtype short binding shortbinding constant rec iprocally reciprocally value if true type valueiftruetype byte binding bytebinding value if true type valueiftruetype short binding shortbinding value if true type valueiftruetype char binding charbinding value if false type valueiffalsetype int binding intbinding value if false valueiffalse is constant value of type assignable to type isconstantvalueoftypeassignabletotype value if false type valueiffalsetype value if true type valueiftruetype value if true valueiftrue compute conversion computeconversion scope value if true type valueiftruetype value if true type valueiftruetype value if false valueiffalse compute conversion computeconversion scope value if true type valueiftruetype value if false type valueiffalsetype resolved type resolvedtype value if true type valueiftruetype value if false type valueiffalsetype byte binding bytebinding value if false type valueiffalsetype short binding shortbinding value if false type valueiffalsetype char binding charbinding value if true type valueiftruetype int binding intbinding value if true valueiftrue is constant value of type assignable to type isconstantvalueoftypeassignabletotype value if true type valueiftruetype value if false type valueiffalsetype value if true valueiftrue compute conversion computeconversion scope value if false type valueiffalsetype value if true type valueiftruetype value if false valueiffalse compute conversion computeconversion scope value if false type valueiffalsetype value if false type valueiffalsetype resolved type resolvedtype value if false type valueiffalsetype base type binding basetypebinding is narrowing isnarrowing value if true type valueiftruetype base type binding basetypebinding is narrowing isnarrowing value if false type valueiffalsetype value if true valueiftrue compute conversion computeconversion scope int binding intbinding value if true type valueiftruetype value if false valueiffalse compute conversion computeconversion scope int binding intbinding value if false type valueiffalsetype resolved type resolvedtype int binding intbinding base type binding basetypebinding is narrowing isnarrowing value if true type valueiftruetype base type binding basetypebinding is narrowing isnarrowing value if false type valueiffalsetype value if true valueiftrue compute conversion computeconversion scope long binding longbinding value if true type valueiftruetype value if false valueiffalse compute conversion computeconversion scope long binding longbinding value if false type valueiffalsetype resolved type resolvedtype long binding longbinding base type binding basetypebinding is narrowing isnarrowing value if true type valueiftruetype base type binding basetypebinding is narrowing isnarrowing value if false type valueiffalsetype value if true valueiftrue compute conversion computeconversion scope float binding floatbinding value if true type valueiftruetype value if false valueiffalse compute conversion computeconversion scope float binding floatbinding value if false type valueiffalsetype resolved type resolvedtype float binding floatbinding value if true valueiftrue compute conversion computeconversion scope double binding doublebinding value if true type valueiftruetype value if false valueiffalse compute conversion computeconversion scope double binding doublebinding value if false type valueiffalsetype resolved type resolvedtype double binding doublebinding type references tested value if true type valueiftruetype is base type isbasetype value if true type valueiftruetype null binding nullbinding value if false type valueiffalsetype is base type isbasetype value if false type valueiffalsetype null binding nullbinding scope problem reporter problemreporter conditional arguments incompatible types conditionalargumentsincompatibletypes value if true type valueiftruetype value if false type valueiffalsetype value if false type valueiffalsetype is compatible with iscompatiblewith value if true type valueiftruetype value if true valueiftrue compute conversion computeconversion scope value if true type valueiftruetype value if true type valueiftruetype value if false valueiffalse compute conversion computeconversion scope value if true type valueiftruetype value if false type valueiffalsetype resolved type resolvedtype value if true type valueiftruetype value if true type valueiftruetype is compatible with iscompatiblewith value if false type valueiffalsetype value if true valueiftrue compute conversion computeconversion scope value if false type valueiffalsetype value if true type valueiftruetype value if false valueiffalse compute conversion computeconversion scope value if false type valueiffalsetype value if false type valueiffalsetype resolved type resolvedtype value if false type valueiffalsetype add ition addition common type scope environment options source level sourcelevel class file constants classfileconstants jdk type binding typebinding common type commontype scope lower upper bound lowerupperbound type binding typebinding value if true type valueiftruetype value if false type valueiffalsetype type binding typebinding common type commontype scope most specific common type mostspecificcommontype type binding typebinding value if true type valueiftruetype value if false type valueiffalsetype common type commontype resolved type resolvedtype common type commontype scope problem reporter problemreporter conditional arguments incompatible types conditionalargumentsincompatibletypes value if true type valueiftruetype value if false type valueiffalsetype traverse ast visitor astvisitor visitor block scope blockscope scope visitor visit scope condition traverse visitor scope value if true valueiftrue traverse visitor scope value if false valueiffalse traverse visitor scope visitor end visit endvisit scope