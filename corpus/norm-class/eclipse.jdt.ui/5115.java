copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal corext refactoring structure java util array list arraylist java util list org eclipse core runtime org eclipse jdt core i field ifield org eclipse jdt core i import container iimportcontainer org eclipse jdt core i import declaration iimportdeclaration org eclipse jdt core i initializer iinitializer org eclipse jdt core i java element ijavaelement org eclipse jdt core i member imember org eclipse jdt core i method imethod org eclipse jdt core i package declaration ipackagedeclaration org eclipse jdt core i source range isourcerange org eclipse jdt core i type itype org eclipse jdt core java model exception javamodelexception org eclipse jdt core dom ast node astnode org eclipse jdt core dom abstract type declaration abstracttypedeclaration org eclipse jdt core dom annotation type declaration annotationtypedeclaration org eclipse jdt core dom annotation type member declaration annotationtypememberdeclaration org eclipse jdt core dom block org eclipse jdt core dom body declaration bodydeclaration org eclipse jdt core dom class instance creation classinstancecreation org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom constructor invocation constructorinvocation org eclipse jdt core dom enum constant declaration enumconstantdeclaration org eclipse jdt core dom enum declaration enumdeclaration org eclipse jdt core dom field declaration fielddeclaration org eclipse jdt core dom import declaration importdeclaration org eclipse jdt core dom initializer org eclipse jdt core dom method declaration methoddeclaration org eclipse jdt core dom node finder nodefinder org eclipse jdt core dom package declaration packagedeclaration org eclipse jdt core dom simple name simplename org eclipse jdt core dom super constructor invocation superconstructorinvocation org eclipse jdt core dom type declaration typedeclaration org eclipse jdt core dom variable declaration fragment variabledeclarationfragment org eclipse jdt core search search match searchmatch org eclipse jdt internal corext dom ast nodes astnodes org eclipse jdt internal corext dom selection org eclipse jdt internal corext dom selection analyzer selectionanalyzer org eclipse jdt internal corext util jdt ui helper classes jdtuihelperclasses org eclipse jdt internal corext util jdt flags jdtflags jdt internal helper methods find ast nodes link search match searchmatch link i java element ijavaelement jdt ui helper classes jdtuihelperclasses ast node search util astnodesearchutil ast node search util astnodesearchutil instance ast node astnode get ast nodes getastnodes search match searchmatch search results searchresults compilation unit compilationunit cu node cunode list ast node astnode result array list arraylist search results searchresults length search results searchresults length ast node astnode node get ast node getastnode search results searchresults cu node cunode node result add node result to array toarray ast node astnode result size ast node astnode get ast node getastnode search match searchmatch search result searchresult compilation unit compilationunit cu node cunode ast node astnode selected node selectednode get ast node getastnode cu node cunode search result searchresult get offset getoffset search result searchresult get length getlength selected node selectednode selected node selectednode get parent getparent selected node selectednode ast node astnode get ast node getastnode compilation unit compilationunit cu node cunode start length selection analyzer selectionanalyzer analyzer selection analyzer selectionanalyzer selection create from start length createfromstartlength start length cu node cunode accept analyzer xxx work around workaround jdt core feature ast node astnode node analyzer get first selected node getfirstselectednode node analyzer get last covering node getlastcoveringnode super constructor invocation superconstructorinvocation node analyzer get last covering node getlastcoveringnode get parent getparent node analyzer get last covering node getlastcoveringnode constructor invocation constructorinvocation node analyzer get last covering node getlastcoveringnode get parent getparent node ast node astnode parent node parentnode node get parent getparent parent node parentnode method declaration methoddeclaration method declaration methoddeclaration method declaration methoddeclaration parent node parentnode node simple name simplename is constructor isconstructor get body getbody get body getbody statements size get body getbody statements constructor invocation constructorinvocation get body getbody statements super constructor invocation superconstructorinvocation ast node astnode get body getbody statements get length getlength length ast node astnode get body getbody statements parent node parentnode super constructor invocation superconstructorinvocation parent node parentnode get length getlength length parent node parentnode parent node parentnode constructor invocation constructorinvocation parent node parentnode get length getlength length parent node parentnode node method declaration methoddeclaration get method declaration node getmethoddeclarationnode i method imethod i method imethod compilation unit compilationunit cu node cunode java model exception javamodelexception method declaration methoddeclaration ast nodes astnodes get parent getparent get name node getnamenode i method imethod cu node cunode method declaration methoddeclaration annotation type member declaration annotationtypememberdeclaration get annotation type member declaration node getannotationtypememberdeclarationnode i method imethod i method imethod compilation unit compilationunit cu node cunode java model exception javamodelexception annotation type member declaration annotationtypememberdeclaration ast nodes astnodes get parent getparent get name node getnamenode i method imethod cu node cunode annotation type member declaration annotationtypememberdeclaration body declaration bodydeclaration get method or annotation type member declaration node getmethodorannotationtypememberdeclarationnode i method imethod i method imethod compilation unit compilationunit cu node cunode java model exception javamodelexception jdt flags jdtflags is annotation isannotation i method imethod get declaring type getdeclaringtype get annotation type member declaration node getannotationtypememberdeclarationnode i method imethod cu node cunode get method declaration node getmethoddeclarationnode i method imethod cu node cunode variable declaration fragment variabledeclarationfragment get field declaration fragment node getfielddeclarationfragmentnode i field ifield i field ifield compilation unit compilationunit cu node cunode java model exception javamodelexception ast node astnode node get name node getnamenode i field ifield cu node cunode node variable declaration fragment variabledeclarationfragment variable declaration fragment variabledeclarationfragment node variable declaration fragment variabledeclarationfragment ast nodes astnodes get parent getparent node variable declaration fragment variabledeclarationfragment field declaration fielddeclaration get field declaration node getfielddeclarationnode i field ifield i field ifield compilation unit compilationunit cu node cunode java model exception javamodelexception field declaration fielddeclaration ast nodes astnodes get parent getparent get name node getnamenode i field ifield cu node cunode field declaration fielddeclaration enum constant declaration enumconstantdeclaration get enum constant declaration getenumconstantdeclaration i field ifield i field ifield compilation unit compilationunit cu node cunode java model exception javamodelexception enum constant declaration enumconstantdeclaration ast nodes astnodes get parent getparent get name node getnamenode i field ifield cu node cunode enum constant declaration enumconstantdeclaration body declaration bodydeclaration get field or enum constant declaration getfieldorenumconstantdeclaration i field ifield i field ifield compilation unit compilationunit cu node cunode java model exception javamodelexception jdt flags jdtflags is enum isenum i field ifield get enum constant declaration getenumconstantdeclaration i field ifield cu node cunode get field declaration node getfielddeclarationnode i field ifield cu node cunode enum declaration enumdeclaration get enum declaration node getenumdeclarationnode i type itype i type itype compilation unit compilationunit cu node cunode java model exception javamodelexception enum declaration enumdeclaration ast nodes astnodes get parent getparent get name node getnamenode i type itype cu node cunode enum declaration enumdeclaration annotation type declaration annotationtypedeclaration get annotation type declaration node getannotationtypedeclarationnode i type itype i type itype compilation unit compilationunit cu node cunode java model exception javamodelexception annotation type declaration annotationtypedeclaration ast nodes astnodes get parent getparent get name node getnamenode i type itype cu node cunode annotation type declaration annotationtypedeclaration body declaration bodydeclaration get body declaration node getbodydeclarationnode i member imember i member imember compilation unit compilationunit cu node cunode java model exception javamodelexception body declaration bodydeclaration ast nodes astnodes get parent getparent get name node getnamenode i member imember cu node cunode body declaration bodydeclaration abstract type declaration abstracttypedeclaration get abstract type declaration node getabstracttypedeclarationnode i type itype i type itype compilation unit compilationunit cu node cunode java model exception javamodelexception abstract type declaration abstracttypedeclaration ast nodes astnodes get parent getparent get name node getnamenode i type itype cu node cunode abstract type declaration abstracttypedeclaration type declaration typedeclaration get type declaration node gettypedeclarationnode i type itype i type itype compilation unit compilationunit cu node cunode java model exception javamodelexception type declaration typedeclaration ast nodes astnodes get parent getparent get name node getnamenode i type itype cu node cunode type declaration typedeclaration class instance creation classinstancecreation get class instance creation node getclassinstancecreationnode i type itype i type itype compilation unit compilationunit cu node cunode java model exception javamodelexception class instance creation classinstancecreation ast nodes astnodes get parent getparent get name node getnamenode i type itype cu node cunode class instance creation classinstancecreation list body declaration bodydeclaration get body declaration list getbodydeclarationlist i type itype i type itype compilation unit compilationunit cu node cunode java model exception javamodelexception i type itype is anonymous isanonymous get class instance creation node getclassinstancecreationnode i type itype cu node cunode get anonymous class declaration getanonymousclassdeclaration body declarations bodydeclarations get abstract type declaration node getabstracttypedeclarationnode i type itype cu node cunode body declarations bodydeclarations returns array container represent node fields returns declaration node ast node astnode get declaration nodes getdeclarationnodes i java element ijavaelement element compilation unit compilationunit cu node cunode java model exception javamodelexception element get element type getelementtype i java element ijavaelement field ast node astnode get field or enum constant declaration getfieldorenumconstantdeclaration i field ifield element cu node cunode i java element ijavaelement container get import nodes getimportnodes i import container iimportcontainer element cu node cunode i java element ijavaelement declaration ast node astnode get import declaration node getimportdeclarationnode i import declaration iimportdeclaration element cu node cunode i java element ijavaelement initializer ast node astnode get initializer node getinitializernode i initializer iinitializer element cu node cunode i java element ijavaelement method ast node astnode get method or annotation type member declaration node getmethodorannotationtypememberdeclarationnode i method imethod element cu node cunode i java element ijavaelement declaration ast node astnode get package declaration node getpackagedeclarationnode i package declaration ipackagedeclaration element cu node cunode i java element ijavaelement type ast node astnode get abstract type declaration node getabstracttypedeclarationnode i type itype element cu node cunode is true istrue string value of valueof element get element type getelementtype ast node astnode get name node getnamenode i member imember i member imember compilation unit compilationunit cu node cunode java model exception javamodelexception node finder nodefinder perform cu node cunode i member imember get name range getnamerange package declaration packagedeclaration get package declaration node getpackagedeclarationnode i package declaration ipackagedeclaration reference compilation unit compilationunit cu node cunode java model exception javamodelexception package declaration packagedeclaration find node findnode reference get source range getsourcerange cu node cunode import declaration importdeclaration get import declaration node getimportdeclarationnode i import declaration iimportdeclaration reference compilation unit compilationunit cu node cunode java model exception javamodelexception import declaration importdeclaration find node findnode reference get source range getsourcerange cu node cunode ast node astnode get import nodes getimportnodes i import container iimportcontainer reference compilation unit compilationunit cu node cunode java model exception javamodelexception i java element ijavaelement imps reference get children getchildren ast node astnode result ast node astnode imps length imps length result get import declaration node getimportdeclarationnode i import declaration iimportdeclaration imps cu node cunode result initializer get initializer node getinitializernode i initializer iinitializer initializer compilation unit compilationunit cu node cunode java model exception javamodelexception ast node astnode node find node findnode initializer get source range getsourcerange cu node cunode node initializer initializer node node block node get parent getparent initializer initializer node get parent getparent ast node astnode find node findnode i source range isourcerange range compilation unit compilationunit cu node cunode node finder nodefinder node finder nodefinder node finder nodefinder cu node cunode range get offset getoffset range get length getlength ast node astnode covered node coverednode node finder nodefinder get covered node getcoverednode covered node coverednode covered node coverednode node finder nodefinder get covering node getcoveringnode ast node astnode find nodes findnodes search match searchmatch search results searchresults compilation unit compilationunit cu node cunode list ast node astnode result array list arraylist search results searchresults length search results searchresults length ast node astnode node find node findnode search results searchresults cu node cunode node result add node result to array toarray ast node astnode result size ast node astnode find node findnode search match searchmatch search result searchresult compilation unit compilationunit cu node cunode ast node astnode selected node selectednode node finder nodefinder perform cu node cunode search result searchresult get offset getoffset search result searchresult get length getlength selected node selectednode selected node selectednode get parent getparent selected node selectednode