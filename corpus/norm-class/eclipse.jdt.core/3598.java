copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation stephan herrmann contribution bug compiler inference infrastructure evolve meet jls jsr spec org eclipse jdt internal eval org eclipse jdt internal compiler ast expression org eclipse jdt internal compiler ast return statement returnstatement org eclipse jdt internal compiler ast try statement trystatement org eclipse jdt internal compiler codegen code stream codestream org eclipse jdt internal compiler codegen opcodes org eclipse jdt internal compiler flow flow context flowcontext org eclipse jdt internal compiler flow flow info flowinfo org eclipse jdt internal compiler impl constant org eclipse jdt internal compiler lookup block scope blockscope org eclipse jdt internal compiler lookup inference context inferencecontext org eclipse jdt internal compiler lookup invocation site invocationsite org eclipse jdt internal compiler lookup method binding methodbinding org eclipse jdt internal compiler lookup reference binding referencebinding org eclipse jdt internal compiler lookup scope org eclipse jdt internal compiler lookup type binding typebinding statement code snippet code gen macro result code snippet returning code snippet return statement codesnippetreturnstatement return statement returnstatement invocation site invocationsite evaluation constants evaluationconstants method binding methodbinding set result method setresultmethod code snippet return statement codesnippetreturnstatement expression expr expr flow info flowinfo analyse code analysecode block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo flow info flowinfo info analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo remove optimization order prevent inlining byte code bytecode itpjcore eval verify error verifyerror scr apbook scrapbook expression bits is returned value isreturnedvalue info dump suitable byte code bytecode statement generate return byte code generatereturnbytecode code stream codestream code stream codestream output byte code bytecode code stream codestream generate store save value if necessary generatestoresavevalueifnecessary code stream codestream code stream codestream push receiver code stream codestream aload push parameters set result setresult object expression type expressiontype void binding voidbinding code snippet expression system println expression expression resolved type resolvedtype type binding typebinding push code stream codestream aconst code stream codestream generate class literal access for type generateclassliteralaccessfortype type binding typebinding swap expression value type d valuetypeid expression resolved type resolvedtype value type d valuetypeid value type d valuetypeid code stream codestream dup code stream codestream pop code stream codestream swap generate wrapper needed expression resolved type resolvedtype is base type isbasetype expression resolved type resolvedtype type binding typebinding code stream codestream generate boxing conversion generateboxingconversion expression resolved type resolvedtype generate expression type code stream codestream generate class literal access for type generateclassliteralaccessfortype expression resolved type resolvedtype generate invoke virtual set result setresult object code stream codestream invoke opcodes opc invokevirtual set result method setresultmethod org eclipse jdt internal compiler lookup invocation site invocationsite generic type arguments generictypearguments type binding typebinding generic type arguments generictypearguments inference context inferencecontext fresh inference context freshinferencecontext scope scope is super access issuperaccess is type access istypeaccess need value needvalue prepare save value location preparesavevaluelocation try statement trystatement target try statement targettrystatement storage snippets resolve block scope blockscope scope expression expression resolve type resolvetype scope type binding typebinding java lang class javalangclass scope get java lang class getjavalangclass java lang class javalangclass is valid binding isvalidbinding nls scope problem reporter problemreporter code snippet missing class codesnippetmissingclass nls java lang nls source start sourcestart nls source end sourceend type binding typebinding java lang object javalangobject scope get java lang object getjavalangobject java lang object javalangobject is valid binding isvalidbinding nls scope problem reporter problemreporter code snippet missing class codesnippetmissingclass nls java lang object nls source start sourcestart nls source end sourceend type binding typebinding argument types argumenttypes type binding typebinding java lang object javalangobject java lang class javalangclass set result method setresultmethod scope get implicit method getimplicitmethod set result setresult selector argument types argumenttypes set result method setresultmethod is valid binding isvalidbinding scope problem reporter problemreporter code snippet missing method codesnippetmissingmethod root full string set result setresult selector string set result setresult arguments source start sourcestart source end sourceend constant implicit conversion left uninitialized expression constant constant notaconstant fake implicit conversion type expression implicit conversion implicitconversion expression constant typeid set actual receiver type setactualreceivertype reference binding referencebinding receiver type receivertype set depth setdepth depth set field index setfieldindex depth