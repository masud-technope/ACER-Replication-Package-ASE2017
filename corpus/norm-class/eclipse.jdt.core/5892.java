copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation stephan herrmann contribution bug warning missing resources bug non null nonnull annotation considered enhanced loops bug compiler distinguish warnings based flow analysis annotations bug compiler compiler misidentifies variable bug compiler inconsistent warnings iteration variables bug leverage type annotation for each foreach statement bug compiler apply annotation types analysis bug compiler loop improve analysis loops bug compiler resource incorrect potential resource leak warning loop close jesper moller contribution bug eclipse java compiler creates invalid byte code bytecode java lang verify error verifyerror org eclipse jdt internal compiler ast org eclipse jdt internal compiler ast visitor astvisitor org eclipse jdt internal compiler class fmt classfmt class file constants classfileconstants org eclipse jdt internal compiler codegen branch label branchlabel org eclipse jdt internal compiler codegen code stream codestream org eclipse jdt internal compiler flow flow context flowcontext org eclipse jdt internal compiler flow flow info flowinfo org eclipse jdt internal compiler flow looping flow context loopingflowcontext org eclipse jdt internal compiler flow unconditional flow info unconditionalflowinfo org eclipse jdt internal compiler impl constant org eclipse jdt internal compiler lookup array binding arraybinding org eclipse jdt internal compiler lookup binding org eclipse jdt internal compiler lookup block scope blockscope org eclipse jdt internal compiler lookup capture binding capturebinding org eclipse jdt internal compiler lookup local variable binding localvariablebinding org eclipse jdt internal compiler lookup parameterized type binding parameterizedtypebinding org eclipse jdt internal compiler lookup reference binding referencebinding org eclipse jdt internal compiler lookup tag bits tagbits org eclipse jdt internal compiler lookup type binding typebinding org eclipse jdt internal compiler lookup type ids typeids for each statement foreachstatement statement local declaration localdeclaration element variable elementvariable element variable implicit widening elementvariableimplicitwidening expression collection statement action kind for each foreach kind kinds iter ating iterating behavior array raw iterable iterable type binding typebinding iterator receiver type iteratorreceivertype type binding typebinding collection element type collectionelementtype loop labels branch label branchlabel break label breaklabel branch label branchlabel continue label continuelabel block scope blockscope scope secret variables codegen local variable binding localvariablebinding index variable indexvariable store collection expression local variable binding localvariablebinding collection variable collectionvariable local variable binding localvariablebinding max variable maxvariable secret variable names nls secret iterator variable name secretiteratorvariablename iterator to char array tochararray nls secret index variable name secretindexvariablename to char array tochararray nls secret collection variable name secretcollectionvariablename collection to char array tochararray nls secret max variable name secretmaxvariablename max to char array tochararray post collection init state index postcollectioninitstateindex merged init state index mergedinitstateindex for each statement foreachstatement local declaration localdeclaration element variable elementvariable start element variable elementvariable element variable elementvariable source start sourcestart start kind flow info flowinfo analyse code analysecode block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo initialize labels break label breaklabel branch label branchlabel continue label continuelabel branch label branchlabel initial comp laint level initialcomplaintlevel flow info flowinfo reach mode reachmode flow info flowinfo unreachable statement complained fake reachable statement complained process element variable collection collection checknpe current scope currentscope flow context flowcontext flow info flowinfo flow info flowinfo element variable elementvariable analyse code analysecode scope flow context flowcontext flow info flowinfo flow info flowinfo cond info condinfo collection analyse code analysecode scope flow context flowcontext flow info flowinfo copy local variable binding localvariablebinding element var binding elementvarbinding element variable elementvariable binding element variable assigned iter ating iterating cond info condinfo mark as definitely assigned markasdefinitelyassigned element var binding elementvarbinding post collection init state index postcollectioninitstateindex current scope currentscope method scope methodscope record initialization states recordinitializationstates cond info condinfo process action looping flow context loopingflowcontext looping context loopingcontext looping flow context loopingflowcontext flow context flowcontext flow info flowinfo break label breaklabel continue label continuelabel scope unconditional flow info unconditionalflowinfo action info actioninfo cond info condinfo null info less unconditional copy nullinfolessunconditionalcopy action info actioninfo mark as definitely unknown markasdefinitelyunknown element var binding elementvarbinding current scope currentscope compiler options compileroptions is annotation based null analysis enabled isannotationbasednullanalysisenabled element null status elementnullstatus null annotation matching nullannotationmatching null status from expression type nullstatusfromexpressiontype collection element type collectionelementtype null status nullstatus flow info flowinfo element null annotation matching nullannotationmatching check assignment checkassignment flow info flowinfo element current scope currentscope flow info flowinfo element flow context flowcontext flow info flowinfo element element var binding elementvarbinding flow info flowinfo element element null status elementnullstatus collection collection element type collectionelementtype element var binding elementvarbinding type tag bits tagbits tag bits tagbits is base type isbasetype action info actioninfo mark null status marknullstatus element var binding elementvarbinding null status nullstatus flow info flowinfo exit branch exitbranch action action is empty block isemptyblock current scope currentscope compiler options compileroptions compliance level compliancelevel class file constants classfileconstants jdk action complain if unreachable complainifunreachable action info actioninfo scope initial comp laint level initialcomplaintlevel statement complained unreachable action info actioninfo action analyse code analysecode scope looping context loopingcontext action info actioninfo unconditional copy unconditionalcopy code generation optimized loop exit branch exitbranch flow info flowinfo unconditional copy unconditionalcopy add initializations from addinitializationsfrom cond info condinfo inits when false initswhenfalse todo max ime maxime test optimize action unreachable action info actioninfo tag bits tagbits looping context loopingcontext inits on continue initsoncontinue tag bits tagbits flow info flowinfo unreachable dead continue label continuelabel action info actioninfo action info actioninfo merged with mergedwith looping context loopingcontext inits on continue initsoncontinue looping context loopingcontext complain on deferred final checks complainondeferredfinalchecks scope action info actioninfo exit branch exitbranch add potential initializations from addpotentialinitializationsfrom action info actioninfo exit branch exitbranch cond info condinfo inits when false initswhenfalse variable iter ate iterate collection element variable has empty action hasemptyaction action action is empty block isemptyblock action bits is useful empty statement isusefulemptystatement kind array has empty action hasemptyaction element var binding elementvarbinding resolved position resolvedposition collection variable collectionvariable use flag useflag local variable binding localvariablebinding continue label continuelabel index variable indexvariable use flag useflag local variable binding localvariablebinding max variable maxvariable use flag useflag local variable binding localvariablebinding raw iterable iterable index variable indexvariable use flag useflag local variable binding localvariablebinding loop looping context loopingcontext complain on deferred null checks complainondeferrednullchecks current scope currentscope action info actioninfo https bugs eclipse org bugs bug cgi looping context loopingcontext has escaping exceptions hasescapingexceptions flow info flowinfo loopback flow info loopbackflowinfo flow info flowinfo copy bottom continue label continuelabel loopback loopback action loopback flow info loopbackflowinfo loopback flow info loopbackflowinfo merged with mergedwith loopback flow info loopbackflowinfo unconditional copy unconditionalcopy add null info from addnullinfofrom action info actioninfo unconditional inits unconditionalinits looping context loopingcontext simulate throw after loop back simulatethrowafterloopback loopback flow info loopbackflowinfo flow info flowinfo merged info mergedinfo flow info flowinfo merged optimized branches mergedoptimizedbranches looping context loopingcontext inits on break initsonbreak tag bits tagbits flow info flowinfo unreachable looping context loopingcontext inits on break initsonbreak recover upstream info flow info flowinfo add initializations from addinitializationsfrom recover upstream info looping context loopingcontext inits on break initsonbreak exit branch exitbranch unreachable merged info mergedinfo reset assignment info resetassignmentinfo element variable elementvariable binding merged init state index mergedinitstateindex current scope currentscope method scope methodscope record initialization states recordinitializationstates merged info mergedinfo merged info mergedinfo statement code generation param current scope currentscope org eclipse jdt internal compiler lookup block scope blockscope param code stream codestream org eclipse jdt internal compiler codegen code stream codestream generate code generatecode block scope blockscope current scope currentscope code stream codestream code stream codestream bits is reachable isreachable code stream codestream position has empty action hasemptyaction action action is empty block isemptyblock action bits is useful empty statement isusefulemptystatement has empty action hasemptyaction element variable elementvariable binding resolved position resolvedposition kind array collection generate code generatecode scope code stream codestream code stream codestream exit user scope exituserscope scope merged init state index mergedinitstateindex code stream codestream remove not definitely assigned variables removenotdefinitelyassignedvariables current scope currentscope merged init state index mergedinitstateindex code stream codestream add definitely assigned variables adddefinitelyassignedvariables current scope currentscope merged init state index mergedinitstateindex code stream codestream record positions from recordpositionsfrom source start sourcestart generate initial izations initializations kind array collection generate code generatecode scope code stream codestream code stream codestream store collection variable collectionvariable code stream codestream add variable addvariable collection variable collectionvariable continue label continuelabel length collection variable collectionvariable collection length code stream codestream array length arraylength code stream codestream store max variable maxvariable code stream codestream add variable addvariable max variable maxvariable code stream codestream iconst code stream codestream store index variable indexvariable code stream codestream add variable addvariable index variable indexvariable leave collection variable collectionvariable execution stack consumed swap ping swapping condition raw iterable iterable collection generate code generatecode scope code stream codestream declaring class declaringclass iterator code stream codestream invoke iterable iterator invokeiterableiterator iterator receiver type iteratorreceivertype code stream codestream store index variable indexvariable code stream codestream add variable addvariable index variable indexvariable label management branch label branchlabel action label actionlabel branch label branchlabel code stream codestream action label actionlabel tag bits tagbits branch label branchlabel branch label branchlabel condition label conditionlabel branch label branchlabel code stream codestream condition label conditionlabel tag bits tagbits branch label branchlabel break label breaklabel initialize code stream codestream continue label continuelabel generate condition swapped opt imizing optimizing condition label conditionlabel place conditionpc code stream codestream position kind array inline array length arraylength call collection variable collectionvariable execution stack code stream codestream array length arraylength code stream codestream ifeq break label breaklabel raw iterable iterable code stream codestream load index variable indexvariable code stream codestream invoke java util iterator has next invokejavautiliteratorhasnext code stream codestream ifeq break label breaklabel code stream codestream record positions from recordpositionsfrom conditionpc element variable elementvariable source start sourcestart continue label continuelabel initialize code stream codestream continue label continuelabel tag bits tagbits branch label branchlabel jump action block actionblock code stream codestream condition label conditionlabel generate loop action action label actionlabel place generate loop action kind array element variable elementvariable binding resolved position resolvedposition code stream codestream load collection variable collectionvariable continue label continuelabel simply hardcode offset code stream codestream iconst code stream codestream load index variable indexvariable code stream codestream array at arrayat collection element type collectionelementtype element variable implicit widening elementvariableimplicitwidening code stream codestream generate implicit conversion generateimplicitconversion element variable implicit widening elementvariableimplicitwidening code stream codestream store element variable elementvariable binding code stream codestream add visible local variable addvisiblelocalvariable element variable elementvariable binding post collection init state index postcollectioninitstateindex code stream codestream add definitely assigned variables adddefinitelyassignedvariables current scope currentscope post collection init state index postcollectioninitstateindex raw iterable iterable code stream codestream load index variable indexvariable code stream codestream invoke java util iterator next invokejavautiliteratornext element variable elementvariable binding type java lang object javalangobject element variable implicit widening elementvariableimplicitwidening code stream codestream check cast checkcast collection element type collectionelementtype code stream codestream generate implicit conversion generateimplicitconversion element variable implicit widening elementvariableimplicitwidening code stream codestream check cast checkcast element variable elementvariable binding type element variable elementvariable binding resolved position resolvedposition element variable elementvariable binding type type ids typeids type ids typeids code stream codestream pop code stream codestream pop code stream codestream store element variable elementvariable binding code stream codestream add visible local variable addvisiblelocalvariable element variable elementvariable binding post collection init state index postcollectioninitstateindex code stream codestream add definitely assigned variables adddefinitelyassignedvariables current scope currentscope post collection init state index postcollectioninitstateindex has empty action hasemptyaction action generate code generatecode scope code stream codestream code stream codestream remove variable removevariable element variable elementvariable binding post collection init state index postcollectioninitstateindex code stream codestream remove not definitely assigned variables removenotdefinitelyassignedvariables current scope currentscope post collection init state index postcollectioninitstateindex continuation point continue label continuelabel continue label continuelabel place continuationpc code stream codestream position generate increments iteration kind array has empty action hasemptyaction element variable elementvariable binding resolved position resolvedposition code stream codestream iinc index variable indexvariable resolved position resolvedposition generate condition condition label conditionlabel place code stream codestream load index variable indexvariable code stream codestream load max variable maxvariable code stream codestream icmplt action label actionlabel raw iterable iterable generate condition condition label conditionlabel place code stream codestream load index variable indexvariable code stream codestream invoke java util iterator has next invokejavautiliteratorhasnext code stream codestream ifne action label actionlabel code stream codestream record positions from recordpositionsfrom continuationpc element variable elementvariable source start sourcestart kind array code stream codestream remove variable removevariable index variable indexvariable code stream codestream remove variable removevariable max variable maxvariable code stream codestream remove variable removevariable collection variable collectionvariable raw iterable iterable generate condition code stream codestream remove variable removevariable index variable indexvariable code stream codestream exit user scope exituserscope scope merged init state index mergedinitstateindex code stream codestream remove not definitely assigned variables removenotdefinitelyassignedvariables current scope currentscope merged init state index mergedinitstateindex code stream codestream add definitely assigned variables adddefinitelyassignedvariables current scope currentscope merged init state index mergedinitstateindex break label breaklabel place code stream codestream record positions from recordpositionsfrom source start sourcestart string buffer stringbuffer print statement printstatement indent string buffer stringbuffer output nls print indent printindent indent output append element variable elementvariable print as expression printasexpression output nls output append collection nls collection print output append output append block action output append output append action print statement printstatement indent output output resolve block scope blockscope upper scope upperscope scope hold init declarations scope block scope blockscope upper scope upperscope collection expression item variable itemvariable element variable elementvariable resolve scope type binding typebinding element type elementtype element variable elementvariable type resolved type resolvedtype type binding typebinding collection type collectiontype collection collection resolve type resolvetype upper scope upperscope type binding typebinding expected collection type expectedcollectiontype element type elementtype collection type collectiontype is target jsr istargetjsr scope compiler options compileroptions targetjdk class file constants classfileconstants jdk collection type collectiontype is capture iscapture type binding typebinding upper bound upperbound capture binding capturebinding collection type collectiontype first bound firstbound upper bound upperbound upper bound upperbound is array type isarraytype part ially partially anti cipating anticipating https bugs open jdk openjdk java net browse jdk collection type collectiontype upper bound upperbound collection type collectiontype is array type isarraytype kind array collection element type collectionelementtype array binding arraybinding collection type collectiontype elements type elementstype collection element type collectionelementtype is compatible with iscompatiblewith element type elementtype scope is boxing compatible with isboxingcompatiblewith collection element type collectionelementtype element type elementtype scope problem reporter problemreporter not compatible types error in for each notcompatibletypeserrorinforeach collection collection element type collectionelementtype element type elementtype https bugs eclipse org bugs bug cgi collection element type collectionelementtype needs unchecked conversion needsuncheckedconversion element type elementtype scope problem reporter problemreporter unsafe element type conversion unsafeelementtypeconversion collection collection element type collectionelementtype element type elementtype conversion compile time type d compiletimetypeid collection element type collectionelementtype element type elementtype is base type isbasetype collection compute conversion computeconversion scope collection type collectiontype collection type collectiontype collection element type collectionelementtype is base type isbasetype compile time type d compiletimetypeid scope environment compute boxing type computeboxingtype collection element type collectionelementtype element variable implicit widening elementvariableimplicitwidening unboxing element type elementtype is base type isbasetype element variable implicit widening elementvariableimplicitwidening element type elementtype compile time type d compiletimetypeid scope problem reporter problemreporter autoboxing collection collection element type collectionelementtype element type elementtype element variable implicit widening elementvariableimplicitwidening element type elementtype compile time type d compiletimetypeid collection element type collectionelementtype is base type isbasetype collection compute conversion computeconversion scope collection type collectiontype collection type collectiontype boxedid scope environment compute boxing type computeboxingtype collection element type collectionelementtype primitive type implicit conversion element variable implicit widening elementvariableimplicitwidening boxing compile time type d compiletimetypeid compile time type d compiletimetypeid compile time type d compiletimetypeid boxedid scope problem reporter problemreporter autoboxing collection collection element type collectionelementtype element type elementtype expected collection type expectedcollectiontype upper scope upperscope create array type createarraytype element type elementtype collection compute conversion computeconversion scope expected collection type expectedcollectiontype collection type collectiontype collection type collectiontype reference binding referencebinding reference binding referencebinding iterable type iterabletype reference binding referencebinding collection type collectiontype find super type originating from findsupertypeoriginatingfrom java lang iterable javalangiterable iterable iterable type iterabletype is target jsr istargetjsr iterable type iterabletype reference binding referencebinding collection type collectiontype find super type originating from findsupertypeoriginatingfrom java util collection javautilcollection iterable check iterable checkiterable iterable type iterabletype check iterable checkiterable iterator receiver type iteratorreceivertype collection type collectiontype erasure is target jsr istargetjsr reference binding referencebinding iterator receiver type iteratorreceivertype find super type originating from findsupertypeoriginatingfrom java util collection javautilcollection handle indirect inheritance variable secondary bound iterator receiver type iteratorreceivertype iterable type iterabletype collection compute conversion computeconversion scope iterable type iterabletype collection type collectiontype collection compute conversion computeconversion scope collection type collectiontype collection type collectiontype reference binding referencebinding iterator receiver type iteratorreceivertype find super type originating from findsupertypeoriginatingfrom java lang iterable javalangiterable handle indirect inheritance variable secondary bound iterator receiver type iteratorreceivertype iterable type iterabletype collection compute conversion computeconversion scope iterable type iterabletype collection type collectiontype collection compute conversion computeconversion scope collection type collectiontype collection type collectiontype type binding typebinding arguments iterable type iterabletype kind object iterable binding raw type kind raw iterable collection element type collectionelementtype scope get java lang object getjavalangobject collection element type collectionelementtype is compatible with iscompatiblewith element type elementtype scope is boxing compatible with isboxingcompatiblewith collection element type collectionelementtype element type elementtype scope problem reporter problemreporter not compatible types error in for each notcompatibletypeserrorinforeach collection collection element type collectionelementtype element type elementtype conversion needed reference types check iterable checkiterable iterable iterable binding type arguments iterable type iterabletype type variables typevariables iterable binding parameterized type arguments parameterized type binding parameterizedtypebinding iterable type iterabletype arguments check iterable checkiterable construction arguments length check iterable checkiterable kind iterable collection element type collectionelementtype arguments collection element type collectionelementtype is compatible with iscompatiblewith element type elementtype scope is boxing compatible with isboxingcompatiblewith collection element type collectionelementtype element type elementtype scope problem reporter problemreporter not compatible types error in for each notcompatibletypeserrorinforeach collection collection element type collectionelementtype element type elementtype https bugs eclipse org bugs bug cgi collection element type collectionelementtype needs unchecked conversion needsuncheckedconversion element type elementtype scope problem reporter problemreporter unsafe element type conversion unsafeelementtypeconversion collection collection element type collectionelementtype element type elementtype compile time type d compiletimetypeid collection element type collectionelementtype conversion needed reference types element type elementtype is base type isbasetype collection element type collectionelementtype is base type isbasetype compile time type d compiletimetypeid scope environment compute boxing type computeboxingtype collection element type collectionelementtype element variable implicit widening elementvariableimplicitwidening unboxing element type elementtype is base type isbasetype element variable implicit widening elementvariableimplicitwidening element type elementtype compile time type d compiletimetypeid element variable implicit widening elementvariableimplicitwidening element type elementtype compile time type d compiletimetypeid collection element type collectionelementtype is base type isbasetype primitive type implicit conversion element variable implicit widening elementvariableimplicitwidening boxing compile time type d compiletimetypeid compile time type d compiletimetypeid kind array all ocate allocate secret variable type index variable indexvariable local variable binding localvariablebinding secret index variable name secretindexvariablename type binding typebinding class file constants classfileconstants acc default accdefault scope add local variable addlocalvariable index variable indexvariable index variable indexvariable set constant setconstant inlinable constant notaconstant all ocate allocate max secret variable max variable maxvariable local variable binding localvariablebinding secret max variable name secretmaxvariablename type binding typebinding class file constants classfileconstants acc default accdefault scope add local variable addlocalvariable max variable maxvariable max variable maxvariable set constant setconstant inlinable constant notaconstant add array secret variable collection type expected collection type expectedcollectiontype collection variable collectionvariable local variable binding localvariablebinding secret collection variable name secretcollectionvariablename collection type collectiontype class file constants classfileconstants acc default accdefault collection variable collectionvariable local variable binding localvariablebinding secret collection variable name secretcollectionvariablename expected collection type expectedcollectiontype class file constants classfileconstants acc default accdefault scope add local variable addlocalvariable collection variable collectionvariable collection variable collectionvariable set constant setconstant inlinable constant notaconstant raw iterable iterable all ocate allocate secret variable type iterator index variable indexvariable local variable binding localvariablebinding secret iterator variable name secretiteratorvariablename scope get java util iterator getjavautiliterator class file constants classfileconstants acc default accdefault scope add local variable addlocalvariable index variable indexvariable index variable indexvariable set constant setconstant inlinable constant notaconstant is target jsr istargetjsr scope problem reporter problemreporter invalid type for collection target invalidtypeforcollectiontarget collection scope problem reporter problemreporter invalid type for collection invalidtypeforcollection collection action action resolve scope traverse ast visitor astvisitor visitor block scope blockscope block scope blockscope visitor visit block scope blockscope element variable elementvariable traverse visitor scope collection collection traverse visitor scope action action traverse visitor scope visitor end visit endvisit block scope blockscope override does not complete normally doesnotcompletenormally entered