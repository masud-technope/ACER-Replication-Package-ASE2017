copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal corext dom java util array list arraylist java util iterator java util list org eclipse text edits text edit group texteditgroup org eclipse jdt core dom ast org eclipse jdt core dom ast node astnode org eclipse jdt core dom annotation org eclipse jdt core dom annotation type declaration annotationtypedeclaration org eclipse jdt core dom annotation type member declaration annotationtypememberdeclaration org eclipse jdt core dom enum constant declaration enumconstantdeclaration org eclipse jdt core dom enum declaration enumdeclaration org eclipse jdt core dom field declaration fielddeclaration org eclipse jdt core dom i extended modifier iextendedmodifier org eclipse jdt core dom method declaration methoddeclaration org eclipse jdt core dom modifier org eclipse jdt core dom single variable declaration singlevariabledeclaration org eclipse jdt core dom type declaration typedeclaration org eclipse jdt core dom variable declaration expression variabledeclarationexpression org eclipse jdt core dom variable declaration statement variabledeclarationstatement org eclipse jdt core dom rewrite ast rewrite astrewrite org eclipse jdt core dom rewrite i tracked node position itrackednodeposition org eclipse jdt core dom rewrite list rewrite listrewrite org eclipse jdt internal corext linked proposal position group linkedproposalpositiongroup org eclipse jdt internal corext linked proposal position group linkedproposalpositiongroup position information positioninformation org eclipse jdt internal corext util jdt ui helper classes jdtuihelperclasses rewrite helper modifier lists jdt ui helper classes jdtuihelperclasses modifier rewrite modifierrewrite visibility modifiers modifier modifier modifier list rewrite listrewrite f modifier rewrite fmodifierrewrite ast f ast fast modifier rewrite modifierrewrite create ast rewrite astrewrite rewrite ast node astnode decl node declnode modifier rewrite modifierrewrite rewrite decl node declnode modifier rewrite modifierrewrite ast rewrite astrewrite rewrite ast node astnode decl node declnode f modifier rewrite fmodifierrewrite evaluate list rewrite evaluatelistrewrite rewrite decl node declnode f ast fast decl node declnode getast list rewrite listrewrite evaluate list rewrite evaluatelistrewrite ast rewrite astrewrite rewrite ast node astnode decl node declnode decl node declnode get node type getnodetype ast node astnode method declaration rewrite get list rewrite getlistrewrite decl node declnode method declaration methoddeclaration modifiers property ast node astnode field declaration rewrite get list rewrite getlistrewrite decl node declnode field declaration fielddeclaration modifiers property ast node astnode variable declaration expression rewrite get list rewrite getlistrewrite decl node declnode variable declaration expression variabledeclarationexpression modifiers property ast node astnode variable declaration statement rewrite get list rewrite getlistrewrite decl node declnode variable declaration statement variabledeclarationstatement modifiers property ast node astnode single variable declaration rewrite get list rewrite getlistrewrite decl node declnode single variable declaration singlevariabledeclaration modifiers property ast node astnode type declaration rewrite get list rewrite getlistrewrite decl node declnode type declaration typedeclaration modifiers property ast node astnode enum declaration rewrite get list rewrite getlistrewrite decl node declnode enum declaration enumdeclaration modifiers property ast node astnode annotation type declaration rewrite get list rewrite getlistrewrite decl node declnode annotation type declaration annotationtypedeclaration modifiers property ast node astnode enum constant declaration rewrite get list rewrite getlistrewrite decl node declnode enum constant declaration enumconstantdeclaration modifiers property ast node astnode annotation type member declaration rewrite get list rewrite getlistrewrite decl node declnode annotation type member declaration annotationtypememberdeclaration modifiers property nls illegal argument exception illegalargumentexception nls node modifiers decl node declnode get class getclass get name getname list rewrite listrewrite get modifier rewrite getmodifierrewrite f modifier rewrite fmodifierrewrite sets modifiers removes flags leaves annotations place param modifiers modifiers param edit group editgroup edit group collect text edits code code ungrouped tracked position changed modifiers position information positioninformation set modifiers setmodifiers modifiers text edit group texteditgroup edit group editgroup internal set modifiers internalsetmodifiers modifiers edit group editgroup sets included modifiers removes excluded modifiers touch flags leaves annotations place param included modifiers param excluded modifiers remove param edit group editgroup edit group collect text edits code code ungrouped tracked position changed modifiers position information positioninformation set modifiers setmodifiers included excluded text edit group texteditgroup edit group editgroup internal set modifiers internalsetmodifiers included included excluded edit group editgroup sets included visibility modifiers removes existing visibility modifiers touch flags leaves annotations place param visibility flags visibilityflags visibility modifiers param edit group editgroup edit group collect text edits code code ungrouped tracked position changed modifiers code code iff code edit group editgroup code position information positioninformation set visibility setvisibility visibility flags visibilityflags text edit group texteditgroup edit group editgroup internal set modifiers internalsetmodifiers visibility flags visibilityflags visibility modifiers edit group editgroup copy all modifiers copyallmodifiers ast node astnode other decl otherdecl text edit group texteditgroup edit group editgroup copy all modifiers copyallmodifiers other decl otherdecl edit group editgroup copy all modifiers copyallmodifiers ast node astnode other decl otherdecl text edit group texteditgroup edit group editgroup copy individually copyindividually list rewrite listrewrite modifier list modifierlist evaluate list rewrite evaluatelistrewrite f modifier rewrite fmodifierrewrite getastrewrite other decl otherdecl list i extended modifier iextendedmodifier original list originallist modifier list modifierlist get original list getoriginallist original list originallist is empty isempty copy individually copyindividually iterator i extended modifier iextendedmodifier iterator original list originallist iterator iterator has next hasnext ast node astnode modifier ast node astnode iterator ast node astnode copy f modifier rewrite fmodifierrewrite getastrewrite create copy target createcopytarget modifier paranoia check left copy f modifier rewrite fmodifierrewrite insert last insertlast copy edit group editgroup ast node astnode copy modifier list modifierlist create copy target createcopytarget ast node astnode original list originallist ast node astnode original list originallist original list originallist size paranoia check left copy f modifier rewrite fmodifierrewrite insert last insertlast copy edit group editgroup copy all annotations copyallannotations ast node astnode other decl otherdecl text edit group texteditgroup edit group editgroup list rewrite listrewrite modifier list modifierlist evaluate list rewrite evaluatelistrewrite f modifier rewrite fmodifierrewrite getastrewrite other decl otherdecl list i extended modifier iextendedmodifier original list originallist modifier list modifierlist get original list getoriginallist iterator i extended modifier iextendedmodifier iterator original list originallist iterator iterator has next hasnext i extended modifier iextendedmodifier modifier iterator modifier is annotation isannotation f modifier rewrite fmodifierrewrite insert last insertlast f modifier rewrite fmodifierrewrite getastrewrite create copy target createcopytarget annotation modifier edit group editgroup sets modifiers removes modifiers match considered flags consideredflags mask touch flags leaves annotations place param modifiers modifiers param considered flags consideredflags mask modifiers param edit group editgroup edit group collect text edits code code ungrouped tracked position changed modifiers position information positioninformation internal set modifiers internalsetmodifiers modifiers considered flags consideredflags text edit group texteditgroup edit group editgroup new modifiers newmodifiers modifiers considered flags consideredflags i tracked node position itrackednodeposition tracked fallback trackedfallback list i tracked node position itrackednodeposition tracked nodes trackednodes array list arraylist remove modifiers list i extended modifier iextendedmodifier original list originallist f modifier rewrite fmodifierrewrite get original list getoriginallist original list originallist size ast node astnode curr ast node astnode original list originallist curr modifier flag modifier curr get keyword getkeyword to flag value toflagvalue considered flags consideredflags flag new modifiers newmodifiers flag f modifier rewrite fmodifierrewrite remove curr edit group editgroup tracked fallback trackedfallback tracked fallback trackedfallback f modifier rewrite fmodifierrewrite getastrewrite track curr new modifiers newmodifiers flag find annotation i extended modifier iextendedmodifier last annotation lastannotation list i extended modifier iextendedmodifier extended list extendedlist f modifier rewrite fmodifierrewrite get rewritten list getrewrittenlist extended list extendedlist size i extended modifier iextendedmodifier curr extended list extendedlist curr is annotation isannotation last annotation lastannotation curr add modifiers list modifier new nodes newnodes ast node factory astnodefactory new modifiers newmodifiers f ast fast new modifiers newmodifiers new nodes newnodes size modifier curr new nodes newnodes curr get keyword getkeyword to flag value toflagvalue visibility modifiers last annotation lastannotation f modifier rewrite fmodifierrewrite insert after insertafter curr ast node astnode last annotation lastannotation edit group editgroup f modifier rewrite fmodifierrewrite insert first insertfirst curr edit group editgroup f modifier rewrite fmodifierrewrite insert last insertlast curr edit group editgroup tracked nodes trackednodes add f modifier rewrite fmodifierrewrite getastrewrite track curr tracked nodes trackednodes is empty isempty tracked fallback trackedfallback tricks tracked fallback trackedfallback f modifier rewrite fmodifierrewrite getastrewrite track f modifier rewrite fmodifierrewrite get parent getparent linked proposal position group linkedproposalpositiongroup start position information startpositioninformation tracked fallback trackedfallback linked proposal position group linkedproposalpositiongroup tracked nodes position trackednodesposition tracked nodes trackednodes