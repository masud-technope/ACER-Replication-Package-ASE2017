copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal compiler parser internal field structure parsing recovery java util hash set hashset java util org eclipse jdt internal compiler ast abstract method declaration abstractmethoddeclaration org eclipse jdt internal compiler ast ast node astnode org eclipse jdt internal compiler ast block org eclipse jdt internal compiler ast compilation unit declaration compilationunitdeclaration org eclipse jdt internal compiler ast field declaration fielddeclaration org eclipse jdt internal compiler ast import reference importreference org eclipse jdt internal compiler ast initializer org eclipse jdt internal compiler ast type declaration typedeclaration recovered unit recoveredunit recovered element recoveredelement compilation unit declaration compilationunitdeclaration unit declaration unitdeclaration recovered import recoveredimport imports import count importcount recovered type recoveredtype types type count typecount pending modifiers pendingmodifiers pending modifers source start pendingmodiferssourcestart recovered annotation recoveredannotation pending annotations pendingannotations pending annotation count pendingannotationcount recovered unit recoveredunit compilation unit declaration compilationunitdeclaration unit declaration unitdeclaration bracket balance bracketbalance parser parser bracket balance bracketbalance parser unit declaration unitdeclaration unit declaration unitdeclaration recovered element recoveredelement add annotation name addannotationname identifier ptr identifierptr identifier length ptr identifierlengthptr annotation start annotationstart bracket balance value bracketbalancevalue pending annotations pendingannotations pending annotations pendingannotations recovered annotation recoveredannotation pending annotation count pendingannotationcount pending annotation count pendingannotationcount pending annotations pendingannotations length system arraycopy pending annotations pendingannotations pending annotations pendingannotations recovered annotation recoveredannotation pending annotation count pendingannotationcount pending annotation count pendingannotationcount recovered annotation recoveredannotation element recovered annotation recoveredannotation identifier ptr identifierptr identifier length ptr identifierlengthptr annotation start annotationstart bracket balance value bracketbalancevalue pending annotations pendingannotations pending annotation count pendingannotationcount element element add modifier addmodifier flag modifiers source start modifierssourcestart pending modifiers pendingmodifiers flag pending modifers source start pendingmodiferssourcestart pending modifers source start pendingmodiferssourcestart modifiers source start modifierssourcestart record method declaration attached type recovered element recoveredelement add abstract method declaration abstractmethoddeclaration method declaration methoddeclaration bracket balance value bracketbalancevalue attach type type count typecount recovered type recoveredtype type types type count typecount start type body end bodyend type type declaration typedeclaration body end bodyend reset position type body end bodyend reset position type type declaration typedeclaration declaration source end declarationsourceend type type declaration typedeclaration body end bodyend kind type declaration typedeclaration kind type type declaration typedeclaration modifiers start start kind type declaration typedeclaration decl kind type declaration typedeclaration annotation type decl type considered initializer block block block block source start sourcestart block source end sourceend initializer initializer initializer block initializer body start bodystart initializer body end bodyend initializer declaration source start declarationsourcestart initializer declaration source end declarationsourceend initializer source start sourcestart initializer source end sourceend type add initializer bracket balance value bracketbalancevalue reset pending modifiers resetpendingmodifiers type add method declaration methoddeclaration bracket balance value bracketbalancevalue ignore record field declaration attached type recovered element recoveredelement add field declaration fielddeclaration field declaration fielddeclaration bracket balance value bracketbalancevalue attach type type count typecount recovered type recoveredtype type types type count typecount reset position type body end bodyend reset position type type declaration typedeclaration declaration source end declarationsourceend type type declaration typedeclaration body end bodyend reset pending modifiers resetpendingmodifiers type add field declaration fielddeclaration bracket balance value bracketbalancevalue ignore recovered element recoveredelement add import reference importreference import reference importreference bracket balance value bracketbalancevalue reset pending modifiers resetpendingmodifiers imports imports recovered import recoveredimport import count importcount import count importcount imports length system arraycopy imports imports recovered import recoveredimport import count importcount import count importcount recovered import recoveredimport element recovered import recoveredimport import reference importreference bracket balance value bracketbalancevalue imports import count importcount element finished current import reference importreference declaration source end declarationsourceend element recovered element recoveredelement add type declaration typedeclaration type declaration typedeclaration bracket balance value bracketbalancevalue type declaration typedeclaration bits ast node astnode is anonymous type isanonymoustype type count typecount add type recovered type recoveredtype last type lasttype types type count typecount reopen type last type lasttype body end bodyend reopen type last type lasttype type declaration typedeclaration body end bodyend reopen type last type lasttype type declaration typedeclaration declaration source end declarationsourceend expect closing brace last type lasttype bracket balance bracketbalance reset pending modifiers resetpendingmodifiers last type lasttype add type declaration typedeclaration bracket balance value bracketbalancevalue types types recovered type recoveredtype type count typecount type count typecount types length system arraycopy types types recovered type recoveredtype type count typecount type count typecount recovered type recoveredtype element recovered type recoveredtype type declaration typedeclaration bracket balance value bracketbalancevalue types type count typecount element pending annotation count pendingannotationcount element attach pending annotations pendingannotations pending annotation count pendingannotationcount pending modifiers pendingmodifiers pending modifers source start pendingmodiferssourcestart reset pending modifiers resetpendingmodifiers type finished type current type declaration typedeclaration declaration source end declarationsourceend element answer parsed structure ast node astnode parse tree parsetree unit declaration unitdeclaration reset pending modifiers resetpendingmodifiers pending annotations pendingannotations pending annotation count pendingannotationcount pending modifiers pendingmodifiers pending modifers source start pendingmodiferssourcestart answer source parse node source end sourceend unit declaration unitdeclaration source end sourceend string to string tostring tab string buffer stringbuffer result string buffer stringbuffer tab string tabstring tab nls result append recovered unit unit declaration unitdeclaration print tab result result append tab string tabstring tab nls result append imports import count importcount nls result append result append imports to string tostring tab types type count typecount nls result append result append types to string tostring tab result to string tostring compilation unit declaration compilationunitdeclaration updated compilation unit declaration updatedcompilationunitdeclaration update imports import count importcount import reference importreference import ref ences importrefences import reference importreference import count importcount import count importcount import ref ences importrefences imports updated import reference updatedimportreference unit declaration unitdeclaration imports import ref ences importrefences update types type count typecount existing count existingcount unit declaration unitdeclaration types unit declaration unitdeclaration types length type declaration typedeclaration type declarations typedeclarations type declaration typedeclaration existing count existingcount type count typecount existing count existingcount system arraycopy unit declaration unitdeclaration types type declarations typedeclarations existing count existingcount update declaration source end declarationsourceend type types type count typecount type declaration typedeclaration declaration source end declarationsourceend types type count typecount type declaration typedeclaration declaration source end declarationsourceend unit declaration unitdeclaration source end sourceend types type count typecount type declaration typedeclaration body end bodyend unit declaration unitdeclaration source end sourceend type declaration typedeclaration known types knowntypes hash set hashset actual count actualcount existing count existingcount type count typecount type declaration typedeclaration type decl typedecl types updated type declaration updatedtypedeclaration known types knowntypes filter local types type decl typedecl type decl typedecl bits ast node astnode is local type islocaltype type declarations typedeclarations actual count actualcount type decl typedecl actual count actualcount type count typecount system arraycopy type declarations typedeclarations type declarations typedeclarations type declaration typedeclaration existing count existingcount actual count actualcount existing count existingcount actual count actualcount unit declaration unitdeclaration types type declarations typedeclarations unit declaration unitdeclaration update parse tree updateparsetree updated compilation unit declaration updatedcompilationunitdeclaration update source end sourceend parse node update source end if necessary updatesourceendifnecessary body start bodystart body end bodyend unit declaration unitdeclaration source end sourceend unit declaration unitdeclaration source end sourceend body end bodyend