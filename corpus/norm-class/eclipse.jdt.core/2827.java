copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal compiler ast org eclipse jdt core compiler char operation charoperation org eclipse jdt internal compiler ast visitor astvisitor org eclipse jdt internal compiler codegen code stream codestream org eclipse jdt internal compiler impl constant org eclipse jdt internal compiler impl int constant intconstant org eclipse jdt internal compiler lookup block scope blockscope org eclipse jdt internal compiler lookup type binding typebinding org eclipse jdt internal compiler parser scanner helper scannerhelper int literal intliteral number literal numberliteral nls hexa min to char array tochararray nls hexa xff ffffff xffffffff to char array tochararray nls octal min to char array tochararray nls octal to char array tochararray nls decimal min to char array tochararray nls decimal max to char array tochararray under scores underscores reduced form reducedform int literal intliteral int literal intliteral int constant intconstant from value fromvalue int literal intliteral build int literal buildintliteral token remove prefix int reduced token intreducedtoken remove prefix zeros and underscores removeprefixzerosandunderscores token int reduced token intreducedtoken length char operation charoperation equals int reduced token intreducedtoken hexa min int literal min value intliteralminvalue token int reduced token intreducedtoken token int reduced token intreducedtoken char operation charoperation equals int reduced token intreducedtoken octal min int literal min value intliteralminvalue token int reduced token intreducedtoken token int reduced token intreducedtoken int literal intliteral token int reduced token intreducedtoken token int reduced token intreducedtoken int literal intliteral token reduced form reducedform start token start reduced form reducedform reduced form reducedform int literal intliteral token reduced form reducedform start constant constant token start reduced form reducedform reduced form reducedform constant constant compute constant computeconstant token reduced form reducedform reduced form reducedform source token length tokenlength token length radix token token length tokenlength constant int constant intconstant from value fromvalue token token radix token token radix radix radix token length tokenlength constant stays compute value computevalue token token length tokenlength radix token length tokenlength char operation charoperation equals token hexa constant int constant intconstant from value fromvalue compute value computevalue token token length tokenlength radix token length tokenlength decimal max length token length tokenlength decimal max length char operation charoperation compare to compareto token decimal max constant stays compute value computevalue token token length tokenlength radix token length tokenlength token length tokenlength token constant stays char operation charoperation equals token octal constant int constant intconstant from value fromvalue compute value computevalue token token length tokenlength radix compute value computevalue token token length tokenlength radix digit value digitvalue computed value computedvalue token length tokenlength digit value digitvalue scanner helper scannerhelper digit token radix constant stays computed value computedvalue computed value computedvalue radix digit value digitvalue constant int constant intconstant from value fromvalue computed value computedvalue int literal intliteral convert to min value converttominvalue bits ast node astnode parenthesizedmask ast node astnode parenthesizedshift token reduced form reducedform reduced form reducedform source token length char operation charoperation equals token decimal min int literal min value intliteralminvalue source reduced form reducedform source start sourcestart source end sourceend code generation literal param current scope currentscope org eclipse jdt internal compiler lookup block scope blockscope param code stream codestream org eclipse jdt internal compiler codegen code stream codestream param value required valuerequired generate code generatecode block scope blockscope current scope currentscope code stream codestream code stream codestream value required valuerequired code stream codestream position value required valuerequired code stream codestream generate constant generateconstant constant implicit conversion implicitconversion code stream codestream record positions from recordpositionsfrom source start sourcestart type binding typebinding literal type literaltype block scope blockscope scope type binding typebinding traverse ast visitor astvisitor visitor block scope blockscope scope visitor visit scope visitor end visit endvisit scope