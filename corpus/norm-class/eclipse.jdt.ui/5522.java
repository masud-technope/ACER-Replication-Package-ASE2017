copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation chris west faux eclipse goes where goeswhere clean modifier int roduce introduce compile errors https bugs eclipse org bugs bug cgi org eclipse jdt internal corext java util array list arraylist java util hash map hashmap java util hash set hashset java util iterator java util list java util org eclipse core runtime core exception coreexception org eclipse text edits text edit group texteditgroup org eclipse jdt core dom ast node astnode org eclipse jdt core dom ast visitor astvisitor org eclipse jdt core dom assignment org eclipse jdt core dom block org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom constructor invocation constructorinvocation org eclipse jdt core dom expression org eclipse jdt core dom expression statement expressionstatement org eclipse jdt core dom field declaration fielddeclaration org eclipse jdt core dom i binding ibinding org eclipse jdt core dom i method binding imethodbinding org eclipse jdt core dom i type binding itypebinding org eclipse jdt core dom i variable binding ivariablebinding org eclipse jdt core dom method declaration methoddeclaration org eclipse jdt core dom modifier org eclipse jdt core dom return statement returnstatement org eclipse jdt core dom simple name simplename org eclipse jdt core dom single variable declaration singlevariabledeclaration org eclipse jdt core dom statement org eclipse jdt core dom type declaration typedeclaration org eclipse jdt core dom variable declaration expression variabledeclarationexpression org eclipse jdt core dom variable declaration fragment variabledeclarationfragment org eclipse jdt core dom variable declaration statement variabledeclarationstatement org eclipse jdt core dom rewrite ast rewrite astrewrite org eclipse jdt internal corext dom ast nodes astnodes org eclipse jdt internal corext dom generic visitor genericvisitor org eclipse jdt internal corext dom variable declaration rewrite variabledeclarationrewrite org eclipse jdt internal corext refactoring structure compilation unit rewrite compilationunitrewrite org eclipse jdt cleanup i clean up fix icleanupfix org eclipse jdt internal text correction ast res olving astresolving variable declaration fix variabledeclarationfix compilation unit rewrite operations fix compilationunitrewriteoperationsfix written names finder writtennamesfinder generic visitor genericvisitor hash map hashmap i binding ibinding list simple name simplename f result fresult written names finder writtennamesfinder hash map hashmap i binding ibinding list simple name simplename result f result fresult result override visit simple name simplename node node get parent getparent variable declaration fragment variabledeclarationfragment visit node node get parent getparent single variable declaration singlevariabledeclaration visit node i binding ibinding binding node resolve binding resolvebinding binding i variable binding ivariablebinding visit node binding i variable binding ivariablebinding binding get variable declaration getvariabledeclaration ast res olving astresolving is write access iswriteaccess node list simple name simplename list f result fresult contains key containskey binding list f result fresult binding list array list arraylist list add node f result fresult binding list visit node return finder returnfinder ast visitor astvisitor found one foundone override visit return statement returnstatement node found one foundone visit node variable declaration finder variabledeclarationfinder generic visitor genericvisitor list modifier change operation modifierchangeoperation f result fresult hash map hashmap i binding ibinding list simple name simplename f written variables fwrittenvariables f add final fields faddfinalfields f add final parameters faddfinalparameters f add final locals faddfinallocals variable declaration finder variabledeclarationfinder add final fields addfinalfields add final parameters addfinalparameters add final locals addfinallocals list modifier change operation modifierchangeoperation result hash map hashmap i binding ibinding list simple name simplename written names writtennames f add final fields faddfinalfields add final fields addfinalfields f add final parameters faddfinalparameters add final parameters addfinalparameters f add final locals faddfinallocals add final locals addfinallocals f result fresult result f written variables fwrittenvariables written names writtennames override visit field declaration fielddeclaration node f add final fields faddfinalfields handle fragments handlefragments node fragments node list variable declaration fragment variabledeclarationfragment fragments node fragments iterator variable declaration fragment variabledeclarationfragment iterator fragments iterator iterator has next hasnext variable declaration fragment variabledeclarationfragment fragment iterator expression initializer fragment get initializer getinitializer initializer initializer accept override visit variable declaration statement variabledeclarationstatement node f add final locals faddfinallocals handle fragments handlefragments node fragments node list variable declaration fragment variabledeclarationfragment fragments node fragments iterator variable declaration fragment variabledeclarationfragment iterator fragments iterator iterator has next hasnext variable declaration fragment variabledeclarationfragment fragment iterator expression initializer fragment get initializer getinitializer initializer initializer accept override visit variable declaration expression variabledeclarationexpression node f add final locals faddfinallocals node fragments size simple name simplename variable declaration fragment variabledeclarationfragment node fragments get name getname i binding ibinding binding resolve binding resolvebinding binding f written variables fwrittenvariables contains key containskey binding modifier change operation modifierchangeoperation create add final operation createaddfinaloperation node f result fresult add handle fragments handlefragments list variable declaration fragment variabledeclarationfragment list ast node astnode declaration list variable declaration fragment variabledeclarationfragment to change tochange array list arraylist iterator variable declaration fragment variabledeclarationfragment iter list iterator iter has next hasnext variable declaration fragment variabledeclarationfragment fragment iter simple name simplename fragment get name getname i binding ibinding resolve binding resolvebinding resolve binding resolvebinding can add final canaddfinal resolve binding resolvebinding declaration i variable binding ivariablebinding var binding varbinding i variable binding ivariablebinding resolve binding resolvebinding var binding varbinding is field isfield field can be final fieldcanbefinal fragment var binding varbinding to change tochange add fragment f written variables fwrittenvariables contains key containskey resolve binding resolvebinding to change tochange add fragment to change tochange size modifier change operation modifierchangeoperation modifier change operation modifierchangeoperation declaration to change tochange modifier modifier f result fresult add field can be final fieldcanbefinal variable declaration fragment variabledeclarationfragment fragment i variable binding ivariablebinding binding modifier is static isstatic field declaration fielddeclaration fragment get parent getparent get modifiers getmodifiers f written variables fwrittenvariables contains key containskey binding variable written variable initialized fragment get initializer getinitializer variable initialized written fragment get initializer getinitializer i type binding itypebinding declaring class declaringclass binding get declaring class getdeclaringclass declaring class declaringclass list simple name simplename writes f written variables fwrittenvariables binding is written in type constructors iswrittenintypeconstructors writes declaring class declaringclass hash set hashset i method binding imethodbinding writing constructor bindings writingconstructorbindings hash set hashset array list arraylist method declaration methoddeclaration writing constructors writingconstructors array list arraylist writes size simple name simplename writes method declaration methoddeclaration constructor get writing constructor getwritingconstructor variable written constructor writing constructors writingconstructors constructor can return canreturn constructor writing constructors writingconstructors add constructor i method binding imethodbinding constructor binding constructorbinding constructor resolve binding resolvebinding constructor binding constructorbinding writing constructor bindings writingconstructorbindings add constructor binding constructorbinding writing constructors writingconstructors size method declaration methoddeclaration constructor writing constructors writingconstructors writing constructor calls writing constructor calls writing constructor callswritingconstructor constructor writing constructor bindings writingconstructorbindings method declaration methoddeclaration constructor writing constructors writingconstructors type declaration typedeclaration type decl typedecl type declaration typedeclaration ast nodes astnodes get parent getparent constructor type declaration typedeclaration type decl typedecl method declaration methoddeclaration methods type decl typedecl get methods getmethods methods length methods is constructor isconstructor i method binding imethodbinding method binding methodbinding methods resolve binding resolvebinding method binding methodbinding writing constructor bindings writingconstructorbindings method binding methodbinding writing constructor call writing constructor calls writing constructor callswritingconstructor methods writing constructor bindings writingconstructorbindings can return canreturn method declaration methoddeclaration constructor return finder returnfinder ret finder retfinder return finder returnfinder constructor accept ret finder retfinder ret finder retfinder found one foundone calls writing constructor callswritingconstructor method declaration methoddeclaration method declaration methoddeclaration hash set hashset i method binding imethodbinding writing constructor bindings writingconstructorbindings hash set hashset method declaration methoddeclaration visited method declarations visitedmethoddeclarations hash set hashset visited method declarations visitedmethoddeclarations add method declaration methoddeclaration calls writing constructor callswritingconstructor method declaration methoddeclaration writing constructor bindings writingconstructorbindings visited method declarations visitedmethoddeclarations calls writing constructor callswritingconstructor method declaration methoddeclaration method declaration methoddeclaration hash set hashset i method binding imethodbinding writing constructor bindings writingconstructorbindings method declaration methoddeclaration visited method declarations visitedmethoddeclarations block body method declaration methoddeclaration get body getbody body list statement statements body statements statements size statement statement statements statement constructor invocation constructorinvocation constructor invocation constructorinvocation invocation constructor invocation constructorinvocation statement i method binding imethodbinding constructor binding constructorbinding invocation resolve constructor binding resolveconstructorbinding constructor binding constructorbinding writing constructor bindings writingconstructorbindings constructor binding constructorbinding ast node astnode declaration ast nodes astnodes find declaration finddeclaration constructor binding constructorbinding method declaration methoddeclaration get parent getparent declaration method declaration methoddeclaration visited method declarations visitedmethoddeclarations declaration visited method declarations visitedmethoddeclarations add method declaration methoddeclaration calls writing constructor callswritingconstructor method declaration methoddeclaration declaration writing constructor bindings writingconstructorbindings visited method declarations visitedmethoddeclarations is written in type constructors iswrittenintypeconstructors list simple name simplename writes i type binding itypebinding declaring class declaringclass writes size simple name simplename writes method declaration methoddeclaration method declaration methoddeclaration get writing constructor getwritingconstructor method declaration methoddeclaration method declaration methoddeclaration is constructor isconstructor i method binding imethodbinding constructor method declaration methoddeclaration resolve binding resolvebinding constructor i type binding itypebinding declaring class declaringclass constructor get declaring class getdeclaringclass declaring class declaringclass equals declaring class declaringclass method declaration methoddeclaration get writing constructor getwritingconstructor simple name simplename assignment assignement assignment ast nodes astnodes get parent getparent assignment assignement ast node astnode expression assignement get parent getparent expression expression statement expressionstatement ast node astnode block expression get parent getparent block block ast node astnode method declaration methoddeclaration block get parent getparent method declaration methoddeclaration method declaration methoddeclaration method declaration methoddeclaration method declaration methoddeclaration override visit variable declaration fragment variabledeclarationfragment node simple name simplename node get name getname i binding ibinding binding resolve binding resolvebinding binding f written variables fwrittenvariables contains key containskey binding modifier change operation modifierchangeoperation create add final operation createaddfinaloperation node f result fresult add override visit single variable declaration singlevariabledeclaration node simple name simplename node get name getname i binding ibinding binding resolve binding resolvebinding binding i variable binding ivariablebinding i variable binding ivariablebinding var binding varbinding i variable binding ivariablebinding binding f written variables fwrittenvariables contains key containskey var binding varbinding f add final parameters faddfinalparameters f add final locals faddfinallocals modifier change operation modifierchangeoperation create add final operation createaddfinaloperation node f result fresult add f add final parameters faddfinalparameters var binding varbinding is parameter isparameter modifier change operation modifierchangeoperation create add final operation createaddfinaloperation node f result fresult add f add final locals faddfinallocals var binding varbinding is parameter isparameter modifier change operation modifierchangeoperation create add final operation createaddfinaloperation node f result fresult add modifier change operation modifierchangeoperation compilation unit rewrite operation compilationunitrewriteoperation ast node astnode f declaration fdeclaration list variable declaration fragment variabledeclarationfragment f to change ftochange f included modifiers fincludedmodifiers f excluded modifiers fexcludedmodifiers modifier change operation modifierchangeoperation ast node astnode declaration list variable declaration fragment variabledeclarationfragment to change tochange included modifiers includedmodifiers excluded modifiers excludedmodifiers f declaration fdeclaration declaration f to change ftochange to change tochange f included modifiers fincludedmodifiers included modifiers includedmodifiers f excluded modifiers fexcludedmodifiers excluded modifiers excludedmodifiers override rewriteast compilation unit rewrite compilationunitrewrite cu rewrite curewrite linked proposal model linkedproposalmodel model core exception coreexception ast rewrite astrewrite rewrite cu rewrite curewrite getastrewrite text edit group texteditgroup group create text edit group createtexteditgroup fix messages fixmessages variable declaration fix variabledeclarationfix change modifier of unknown to final changemodifierofunknowntofinal description cu rewrite curewrite f declaration fdeclaration variable declaration statement variabledeclarationstatement variable declaration fragment variabledeclarationfragment to change tochange f to change ftochange to array toarray variable declaration fragment variabledeclarationfragment f to change ftochange size variable declaration rewrite variabledeclarationrewrite rewrite modifiers rewritemodifiers variable declaration statement variabledeclarationstatement f declaration fdeclaration to change tochange f included modifiers fincludedmodifiers f excluded modifiers fexcludedmodifiers rewrite group f declaration fdeclaration field declaration fielddeclaration variable declaration fragment variabledeclarationfragment to change tochange f to change ftochange to array toarray variable declaration fragment variabledeclarationfragment f to change ftochange size variable declaration rewrite variabledeclarationrewrite rewrite modifiers rewritemodifiers field declaration fielddeclaration f declaration fdeclaration to change tochange f included modifiers fincludedmodifiers f excluded modifiers fexcludedmodifiers rewrite group f declaration fdeclaration single variable declaration singlevariabledeclaration variable declaration rewrite variabledeclarationrewrite rewrite modifiers rewritemodifiers single variable declaration singlevariabledeclaration f declaration fdeclaration f included modifiers fincludedmodifiers f excluded modifiers fexcludedmodifiers rewrite group f declaration fdeclaration variable declaration expression variabledeclarationexpression variable declaration rewrite variabledeclarationrewrite rewrite modifiers rewritemodifiers variable declaration expression variabledeclarationexpression f declaration fdeclaration f included modifiers fincludedmodifiers f excluded modifiers fexcludedmodifiers rewrite group variable declaration fix variabledeclarationfix create change modifier to final fix createchangemodifiertofinalfix compilation unit compilationunit compilation unit compilationunit ast node astnode selected nodes selectednodes hash map hashmap i binding ibinding list simple name simplename written names writtennames hash map hashmap written names finder writtennamesfinder finder written names finder writtennamesfinder written names writtennames compilation unit compilationunit accept finder list modifier change operation modifierchangeoperation ops array list arraylist variable declaration finder variabledeclarationfinder visitor variable declaration finder variabledeclarationfinder ops written names writtennames selected nodes selectednodes length selected nodes selectednodes accept visitor selected nodes selectednodes length ast node astnode selected node selectednode selected nodes selectednodes selected node selectednode accept visitor ops size compilation unit rewrite operation compilationunitrewriteoperation result ops to array toarray compilation unit rewrite operation compilationunitrewriteoperation ops size string label result length label fix messages fixmessages variable declaration fix variabledeclarationfix change modifier of unknown to final changemodifierofunknowntofinal description label fix messages fixmessages variable declaration fix variabledeclarationfix change mid ifiers to final wher possible changemidifierstofinalwherpossible description variable declaration fix variabledeclarationfix label compilation unit compilationunit result i clean up fix icleanupfix create clean up createcleanup compilation unit compilationunit compilation unit compilationunit add final fields addfinalfields add final parameters addfinalparameters add final locals addfinallocals add final fields addfinalfields add final parameters addfinalparameters add final locals addfinallocals hash map hashmap i binding ibinding list simple name simplename written names writtennames hash map hashmap written names finder writtennamesfinder finder written names finder writtennamesfinder written names writtennames compilation unit compilationunit accept finder list modifier change operation modifierchangeoperation operations array list arraylist variable declaration finder variabledeclarationfinder visitor variable declaration finder variabledeclarationfinder add final fields addfinalfields add final parameters addfinalparameters add final locals addfinallocals operations written names writtennames compilation unit compilationunit accept visitor operations is empty isempty variable declaration fix variabledeclarationfix fix messages fixmessages variable declaration fix variabledeclarationfix add change compilation unit compilationunit operations to array toarray compilation unit rewrite operation compilationunitrewriteoperation operations size modifier change operation modifierchangeoperation create add final operation createaddfinaloperation simple name simplename ast node astnode decl decl i binding ibinding binding resolve binding resolvebinding can add final canaddfinal binding decl decl single variable declaration singlevariabledeclaration modifier change operation modifierchangeoperation decl array list arraylist variable declaration fragment variabledeclarationfragment modifier modifier decl variable declaration expression variabledeclarationexpression modifier change operation modifierchangeoperation decl array list arraylist variable declaration fragment variabledeclarationfragment modifier modifier decl variable declaration fragment variabledeclarationfragment variable declaration fragment variabledeclarationfragment frag variable declaration fragment variabledeclarationfragment decl decl decl get parent getparent decl field declaration fielddeclaration decl variable declaration statement variabledeclarationstatement list variable declaration fragment variabledeclarationfragment list array list arraylist list add frag modifier change operation modifierchangeoperation decl list modifier modifier decl variable declaration expression variabledeclarationexpression modifier change operation modifierchangeoperation decl array list arraylist variable declaration fragment variabledeclarationfragment modifier modifier can add final canaddfinal i binding ibinding binding ast node astnode decl node declnode binding i variable binding ivariablebinding i variable binding ivariablebinding var binding varbinding i variable binding ivariablebinding binding modifiers var binding varbinding get modifiers getmodifiers modifier is final isfinal modifiers modifier is volatile isvolatile modifiers modifier is transient istransient modifiers ast node astnode parent ast nodes astnodes get parent getparent decl node declnode variable declaration expression variabledeclarationexpression parent variable declaration expression variabledeclarationexpression parent fragments size var binding varbinding is field isfield modifier is private isprivate modifiers var binding varbinding is parameter isparameter ast node astnode var decl vardecl decl node declnode get parent getparent var decl vardecl method declaration methoddeclaration method declaration methoddeclaration declaration method declaration methoddeclaration var decl vardecl declaration get body getbody variable declaration fix variabledeclarationfix string compilation unit compilationunit compilation unit compilationunit compilation unit rewrite operation compilationunitrewriteoperation fix rewrite operations fixrewriteoperations compilation unit compilationunit fix rewrite operations fixrewriteoperations