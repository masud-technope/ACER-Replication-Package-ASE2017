copyright ibm corporation rights reserved program accompanying materials terms common license accompanies distribution http eclipse org legal cpl html contributors ibm corporation initial api implementation org eclipse jdt internal compiler ast org eclipse jdt internal compiler ast visitor astvisitor org eclipse jdt internal compiler impl org eclipse jdt internal compiler codegen org eclipse jdt internal compiler flow org eclipse jdt internal compiler lookup array reference arrayreference reference expression receiver expression position array reference arrayreference expression rec expression pos receiver rec position pos source start sourcestart rec source start sourcestart flow info flowinfo analyse assignment analyseassignment block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo assignment assignment compound assignment compoundassignment assignment expression analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo unconditional inits unconditionalinits assignment expression analyse code analysecode current scope currentscope flow context flowcontext analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo unconditional inits unconditionalinits unconditional inits unconditionalinits flow info flowinfo analyse code analysecode block scope blockscope current scope currentscope flow context flowcontext flow context flowcontext flow info flowinfo flow info flowinfo position analyse code analysecode current scope currentscope flow context flowcontext receiver analyse code analysecode current scope currentscope flow context flowcontext flow info flowinfo generate assignment generateassignment block scope blockscope current scope currentscope code stream codestream code stream codestream assignment assignment value required valuerequired receiver generate code generatecode current scope currentscope code stream codestream type receiver cast expression castexpression cast expression castexpression receiver inner most casted expression innermostcastedexpression resolved type resolvedtype null binding nullbinding code stream codestream check cast checkcast receiver resolved type resolvedtype position generate code generatecode current scope currentscope code stream codestream assignment expression generate code generatecode current scope currentscope code stream codestream code stream codestream array at put arrayatput resolved type resolvedtype value required valuerequired value required valuerequired code stream codestream generate implicit conversion generateimplicitconversion assignment implicit conversion implicitconversion code generation array reference generate code generatecode block scope blockscope current scope currentscope code stream codestream code stream codestream value required valuerequired code stream codestream position receiver generate code generatecode current scope currentscope code stream codestream type receiver cast expression castexpression cast expression castexpression receiver inner most casted expression innermostcastedexpression resolved type resolvedtype null binding nullbinding code stream codestream check cast checkcast receiver resolved type resolvedtype position generate code generatecode current scope currentscope code stream codestream code stream codestream array at arrayat resolved type resolvedtype gen erating generating code potential runtime type checking value required valuerequired code stream codestream generate implicit conversion generateimplicitconversion implicit conversion implicitconversion resolved type resolvedtype long binding longbinding resolved type resolvedtype double binding doublebinding code stream codestream pop code stream codestream pop code stream codestream record positions from recordpositionsfrom source start sourcestart generate compound assignment generatecompoundassignment block scope blockscope current scope currentscope code stream codestream code stream codestream expression expression assignment implicit conversion assignmentimplicitconversion value required valuerequired receiver generate code generatecode current scope currentscope code stream codestream type receiver cast expression castexpression cast expression castexpression receiver inner most casted expression innermostcastedexpression resolved type resolvedtype null binding nullbinding code stream codestream check cast checkcast receiver resolved type resolvedtype position generate code generatecode current scope currentscope code stream codestream code stream codestream dup code stream codestream array at arrayat resolved type resolvedtype operation type d operationtypeid operation type d operationtypeid implicit conversion implicitconversion string code stream codestream generate string concatenation append generatestringconcatenationappend current scope currentscope expression promote array reference suitable operation type code stream codestream generate implicit conversion generateimplicitconversion implicit conversion implicitconversion generate increment promoted operation prefix operation expression int literal intliteral code stream codestream generate constant generateconstant expression constant implicit conversion implicitconversion expression generate code generatecode current scope currentscope code stream codestream perform operation code stream codestream send operator sendoperator operation type d operationtypeid array reference type code stream codestream generate implicit conversion generateimplicitconversion assignment implicit conversion assignmentimplicitconversion code stream codestream array at put arrayatput resolved type resolvedtype value required valuerequired generate post increment generatepostincrement block scope blockscope current scope currentscope code stream codestream code stream codestream compound assignment compoundassignment post increment postincrement value required valuerequired receiver generate code generatecode current scope currentscope code stream codestream type receiver cast expression castexpression cast expression castexpression receiver inner most casted expression innermostcastedexpression resolved type resolvedtype null binding nullbinding code stream codestream check cast checkcast receiver resolved type resolvedtype position generate code generatecode current scope currentscope code stream codestream code stream codestream dup code stream codestream array at arrayat resolved type resolvedtype value required valuerequired resolved type resolvedtype long binding longbinding resolved type resolvedtype double binding doublebinding code stream codestream dup code stream codestream dup code stream codestream generate constant generateconstant post increment postincrement expression constant implicit conversion implicitconversion code stream codestream send operator sendoperator post increment postincrement resolved type resolvedtype code stream codestream generate implicit conversion generateimplicitconversion post increment postincrement assignment implicit conversion assignmentimplicitconversion code stream codestream array at put arrayatput resolved type resolvedtype string buffer stringbuffer print expression printexpression indent string buffer stringbuffer output receiver print expression printexpression output append position print expression printexpression output append type binding typebinding resolve type resolvetype block scope blockscope scope constant constant notaconstant check type receiver cast expression castexpression cast expression castexpression receiver inner most casted expression innermostcastedexpression null literal nullliteral check receiver bits ignore need for cast check k ignoreneedforcastcheckmask type binding typebinding array type arraytype receiver resolve type resolvetype scope array type arraytype receiver compute conversion computeconversion scope array type arraytype array type arraytype array type arraytype is array type isarraytype resolved type resolvedtype array binding arraybinding array type arraytype elements type elementstype scope problem reporter problemreporter reference must be array type at referencemustbearraytypeat array type arraytype type binding typebinding position type positiontype position resolve type expecting resolvetypeexpecting scope int binding intbinding position type positiontype position compute conversion computeconversion scope int binding intbinding position type positiontype resolved type resolvedtype traverse ast visitor astvisitor visitor block scope blockscope scope visitor visit scope receiver traverse visitor scope position traverse visitor scope visitor end visit endvisit scope