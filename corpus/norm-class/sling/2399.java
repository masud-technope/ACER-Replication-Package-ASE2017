licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache sling scripting sightly impl compiler util expression org apache sling scripting sightly impl compiler expression node visitor nodevisitor org apache sling scripting sightly impl compiler expression node array literal arrayliteral org apache sling scripting sightly impl compiler expression node binary operation binaryoperation org apache sling scripting sightly impl compiler expression node boolean constant booleanconstant org apache sling scripting sightly impl compiler expression node identifier org apache sling scripting sightly impl compiler expression node map literal mapliteral org apache sling scripting sightly impl compiler expression node null literal nullliteral org apache sling scripting sightly impl compiler expression node numeric constant numericconstant org apache sling scripting sightly impl compiler expression node property access propertyaccess org apache sling scripting sightly impl compiler expression node runtime call runtimecall org apache sling scripting sightly impl compiler expression node string constant stringconstant org apache sling scripting sightly impl compiler expression node ternary operator ternaryoperator org apache sling scripting sightly impl compiler expression node unary operation unaryoperation expression visitor node performs specific side effects depending expression node type side effect visitor sideeffectvisitor node visitor nodevisitor object visit property access propertyaccess property access propertyaccess visit identifier identifier visit string constant stringconstant text visit binary operation binaryoperation binary operation binaryoperation visit boolean constant booleanconstant boolean constant booleanconstant visit numeric constant numericconstant num eric constant numericconstant visit unary operation unaryoperation unary operation unaryoperation visit ternary operator ternaryoperator ternary operator ternaryoperator visit runtime call runtimecall runtime call runtimecall visit map literal mapliteral map literal mapliteral visit array literal arrayliteral array literal arrayliteral visit null literal nullliteral null literal nullliteral override object evaluate property access propertyaccess property access propertyaccess visit property access propertyaccess override object evaluate identifier identifier visit identifier override object evaluate string constant stringconstant text visit text override object evaluate binary operation binaryoperation binary operation binaryoperation visit binary operation binaryoperation override object evaluate boolean constant booleanconstant boolean constant booleanconstant visit boolean constant booleanconstant override object evaluate numeric constant numericconstant num eric constant numericconstant visit num eric constant numericconstant override object evaluate unary operation unaryoperation unary operation unaryoperation visit unary operation unaryoperation override object evaluate ternary operator ternaryoperator ternary operator ternaryoperator visit ternary operator ternaryoperator override object evaluate runtime call runtimecall runtime call runtimecall visit runtime call runtimecall override object evaluate map literal mapliteral map literal mapliteral visit map literal mapliteral override object evaluate array literal arrayliteral array literal arrayliteral visit array literal arrayliteral override object evaluate null literal nullliteral null literal nullliteral visit null literal nullliteral