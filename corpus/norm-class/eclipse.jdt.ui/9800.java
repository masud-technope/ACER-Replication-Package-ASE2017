copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt text java org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core dom ast node astnode org eclipse jdt core dom compilation unit compilationunit context quick quick assist processors note intended implemented noimplement intended implemented clients noextend intended extended clients i invocation context iinvocationcontext current compilation unit i compilation unit icompilationunit get compilation unit getcompilationunit offset current selection get selection offset getselectionoffset length current selection get selection length getselectionlength returns ast compilation unit partial ast focused selection offset link org eclipse jdt core dom ast parser astparser set focal position setfocalposition returned ast shared modified client check ast api level ast handle org eclipse jdt core dom ast api level apilevel root ast current compilation unit compilation unit compilationunit getastroot ast nodes range equal selection returns inner most innermost nodes returns node preorder traversal ast complete node range covered selection covered node code code selection empty cover entire node ast node astnode get covered node getcoverednode returns inner most innermost node fully selection node length selection node covers selection returned node covering node preorder traversal ast impl ies implies length selection adjacent sibling nodes node returned covering node ast node astnode get covering node getcoveringnode