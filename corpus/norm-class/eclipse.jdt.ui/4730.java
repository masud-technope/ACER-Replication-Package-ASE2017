copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal java editor javaeditor org eclipse jface text i document idocument org eclipse jface text text selection textselection org eclipse jdt core i java element ijavaelement org eclipse jdt core i type root ityperoot org eclipse jdt core java model exception javamodelexception org eclipse jdt core dom ast node astnode org eclipse jdt core dom abstract type declaration abstracttypedeclaration org eclipse jdt core dom annotation org eclipse jdt core dom annotation type member declaration annotationtypememberdeclaration org eclipse jdt core dom body declaration bodydeclaration org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom single variable declaration singlevariabledeclaration org eclipse jdt core dom variable declaration fragment variabledeclarationfragment org eclipse jdt internal corext dom selection org eclipse jdt internal corext dom selection analyzer selectionanalyzer org eclipse jdt sharedastprovider org eclipse jdt internal actions selection converter selectionconverter special text selection access resolved enclosing element java text selection javatextselection text selection textselection i type root ityperoot f element felement i java element ijavaelement f resolved elements fresolvedelements f enclosing element requested fenclosingelementrequested i java element ijavaelement f enclosing element fenclosingelement fpartialastrequested compilation unit compilationunit fpartialast f nodes requested fnodesrequested ast node astnode f selected nodes fselectednodes ast node astnode f covering node fcoveringnode f in method body requested finmethodbodyrequested f in method body finmethodbody f in class initializer requested finclassinitializerrequested f in class initializer finclassinitializer f in variable initializer requested finvariableinitializerrequested f in variable initializer finvariableinitializer selection node checked type code annotation code f in annotation requested finannotationrequested selection node type code annotation code f in annotation finannotation creates text selection offset length param element root element param document document param offset offset selection param length length selection java text selection javatextselection i type root ityperoot element i document idocument document offset length document offset length f element felement element resolves code i java element ijavaelement code current offset returns empty array string offset doesn resolve code i java element ijavaelement code resolved java elements current offset java model exception javamodelexception passed underlying code resolve api i java element ijavaelement resolve element at offset resolveelementatoffset java model exception javamodelexception f resolved elements fresolvedelements f resolved elements fresolvedelements start system current time millis currenttimemillis f resolved elements fresolvedelements selection converter selectionconverter code resolve coderesolve f element felement system println time resolving element system current time millis currenttimemillis start f resolved elements fresolvedelements i java element ijavaelement resolve enclosing element resolveenclosingelement java model exception javamodelexception f enclosing element requested fenclosingelementrequested f enclosing element fenclosingelement f enclosing element requested fenclosingelementrequested f enclosing element fenclosingelement selection converter selectionconverter resolve enclosing element resolveenclosingelement f element felement f enclosing element fenclosingelement compilation unit compilationunit resolve partial ast at offset resolvepartialastatoffset fpartialastrequested fpartialast fpartialastrequested start system current time millis currenttimemillis fpartialast sharedastprovider getast f element felement sharedastprovider wait system println time req uesting requesting partial ast system current time millis currenttimemillis start fpartialast ast node astnode resolve selected nodes resolveselectednodes f nodes requested fnodesrequested f selected nodes fselectednodes f nodes requested fnodesrequested compilation unit compilationunit root resolve partial ast at offset resolvepartialastatoffset root selection selection create from start length createfromstartlength get offset getoffset get length getlength selection analyzer selectionanalyzer analyzer selection analyzer selectionanalyzer root accept analyzer f selected nodes fselectednodes analyzer get selected nodes getselectednodes f covering node fcoveringnode analyzer get last covering node getlastcoveringnode f selected nodes fselectednodes ast node astnode resolve covering node resolvecoveringnode f nodes requested fnodesrequested f covering node fcoveringnode resolve selected nodes resolveselectednodes f covering node fcoveringnode resolve in method body resolveinmethodbody f in method body requested finmethodbodyrequested f in method body finmethodbody f in method body requested finmethodbodyrequested resolve selected nodes resolveselectednodes ast node astnode node get start node getstartnode node f in method body finmethodbody node node type nodetype node get node type getnodetype node type nodetype ast node astnode block node get parent getparent body declaration bodydeclaration f in method body finmethodbody node get parent getparent get node type getnodetype ast node astnode method declaration node type nodetype ast node astnode anonymous declaration f in method body finmethodbody node node get parent getparent f in method body finmethodbody resolve in class initializer resolveinclassinitializer f in class initializer requested finclassinitializerrequested f in class initializer finclassinitializer f in class initializer requested finclassinitializerrequested resolve selected nodes resolveselectednodes ast node astnode node get start node getstartnode node f in class initializer finclassinitializer node node type nodetype node get node type getnodetype node abstract type declaration abstracttypedeclaration f in class initializer finclassinitializer node type nodetype ast node astnode anonymous declaration f in class initializer finclassinitializer node type nodetype ast node astnode initializer f in class initializer finclassinitializer node node get parent getparent f in class initializer finclassinitializer resolve in variable initializer resolveinvariableinitializer f in variable initializer requested finvariableinitializerrequested f in variable initializer finvariableinitializer f in variable initializer requested finvariableinitializerrequested resolve selected nodes resolveselectednodes ast node astnode node get start node getstartnode ast node astnode node node type nodetype node get node type getnodetype node abstract type declaration abstracttypedeclaration f in variable initializer finvariableinitializer node type nodetype ast node astnode anonymous declaration f in variable initializer finvariableinitializer node type nodetype ast node astnode variable declaration fragment variable declaration fragment variabledeclarationfragment node get initializer getinitializer f in variable initializer finvariableinitializer node type nodetype ast node astnode single variable declaration single variable declaration singlevariabledeclaration node get initializer getinitializer f in variable initializer finvariableinitializer node type nodetype ast node astnode annotation type member declaration annotation type member declaration annotationtypememberdeclaration node get default getdefault f in variable initializer finvariableinitializer node node node get parent getparent f in variable initializer finvariableinitializer resolves selected nodes returns code code node ancestors type code annotation code code code code code node ancestors type code annotation code code code resolve in annotation resolveinannotation f in annotation requested finannotationrequested f in annotation finannotation f in annotation requested finannotationrequested resolve selected nodes resolveselectednodes ast node astnode node get start node getstartnode node node annotation f in annotation finannotation node node get parent getparent f in annotation finannotation ast node astnode get start node getstartnode f selected nodes fselectednodes f selected nodes fselectednodes length f selected nodes fselectednodes f covering node fcoveringnode