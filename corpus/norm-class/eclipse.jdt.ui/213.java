copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal corext java util array list arraylist java util list org eclipse core runtime core exception coreexception org eclipse text edits text edit group texteditgroup org eclipse jdt core dom ast node astnode org eclipse jdt core dom block org eclipse jdt core dom child property descriptor childpropertydescriptor org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom do statement dostatement org eclipse jdt core dom enhanced for statement enhancedforstatement org eclipse jdt core dom for statement forstatement org eclipse jdt core dom if statement ifstatement org eclipse jdt core dom return statement returnstatement org eclipse jdt core dom statement org eclipse jdt core dom throw statement throwstatement org eclipse jdt core dom while statement whilestatement org eclipse jdt core dom rewrite ast rewrite astrewrite org eclipse jdt internal corext dom generic visitor genericvisitor org eclipse jdt internal corext refactoring structure compilation unit rewrite compilationunitrewrite org eclipse jdt cleanup i clean up fix icleanupfix control statements fix controlstatementsfix compilation unit rewrite operations fix compilationunitrewriteoperationsfix control statement finder controlstatementfinder generic visitor genericvisitor list compilation unit rewrite operation compilationunitrewriteoperation f result fresult f find control statements without block ffindcontrolstatementswithoutblock f remove unnecessary blocks fremoveunnecessaryblocks f remove unnecessary blocks only when return or throw fremoveunnecessaryblocksonlywhenreturnorthrow control statement finder controlstatementfinder find control statements without block findcontrolstatementswithoutblock remove unnecessary blocks removeunnecessaryblocks remove unnecessary blocks only when return or throw removeunnecessaryblocksonlywhenreturnorthrow list compilation unit rewrite operation compilationunitrewriteoperation resulting collection resultingcollection f find control statements without block ffindcontrolstatementswithoutblock find control statements without block findcontrolstatementswithoutblock f remove unnecessary blocks fremoveunnecessaryblocks remove unnecessary blocks removeunnecessaryblocks f remove unnecessary blocks only when return or throw fremoveunnecessaryblocksonlywhenreturnorthrow remove unnecessary blocks only when return or throw removeunnecessaryblocksonlywhenreturnorthrow f result fresult resulting collection resultingcollection override visit do statement dostatement node handle node get body getbody do statement dostatement body property visit node override visit for statement forstatement node handle node get body getbody for statement forstatement body property visit node override visit enhanced for statement enhancedforstatement node handle node get body getbody enhanced for statement enhancedforstatement body property visit node override visit if statement ifstatement statement handle statement get then statement getthenstatement if statement ifstatement statement property statement else statement elsestatement statement get else statement getelsestatement else statement elsestatement else statement elsestatement if statement ifstatement handle else statement elsestatement if statement ifstatement statement property visit statement override visit while statement whilestatement node handle node get body getbody while statement whilestatement body property visit node handle statement body child property descriptor childpropertydescriptor body property bodyproperty body get flags getflags ast node astnode recovered statement parent statement body get parent getparent parent get flags getflags ast node astnode recovered f remove unnecessary blocks only when return or throw fremoveunnecessaryblocksonlywhenreturnorthrow body block body get node type getnodetype ast node astnode statement body get node type getnodetype ast node astnode statement body get node type getnodetype ast node astnode statement f result fresult add add block operation addblockoperation body property bodyproperty body parent remove block operation removeblockoperation satisfies clean up precondition satisfiescleanupprecondition parent body property bodyproperty f result fresult add remove block operation removeblockoperation parent body property bodyproperty f find control statements without block ffindcontrolstatementswithoutblock body block f result fresult add add block operation addblockoperation body property bodyproperty body parent f remove unnecessary blocks fremoveunnecessaryblocks remove block operation removeblockoperation satisfies clean up precondition satisfiescleanupprecondition parent body property bodyproperty f result fresult add remove block operation removeblockoperation parent body property bodyproperty if else iterator ifelseiterator if statement ifstatement f cursor fcursor if else iterator ifelseiterator if statement ifstatement item f cursor fcursor find start findstart item if statement ifstatement has next hasnext if statement ifstatement result f cursor fcursor f cursor fcursor get else statement getelsestatement if statement ifstatement f cursor fcursor if statement ifstatement f cursor fcursor get else statement getelsestatement f cursor fcursor result has next hasnext f cursor fcursor if statement ifstatement find start findstart if statement ifstatement item item get location in parent getlocationinparent if statement ifstatement statement property item if statement ifstatement item get parent getparent item add block operation addblockoperation compilation unit rewrite operation compilationunitrewriteoperation child property descriptor childpropertydescriptor f body property fbodyproperty statement f body fbody statement f control statement fcontrolstatement add block operation addblockoperation child property descriptor childpropertydescriptor body property bodyproperty statement body statement control statement controlstatement f body property fbodyproperty body property bodyproperty f body fbody body f control statement fcontrolstatement control statement controlstatement override rewriteast compilation unit rewrite compilationunitrewrite cu rewrite curewrite linked proposal model linkedproposalmodel model core exception coreexception ast rewrite astrewrite rewrite cu rewrite curewrite getastrewrite string label f body property fbodyproperty if statement ifstatement statement property label fix messages fixmessages code style fix codestylefix change if to block changeiftoblock desription f body property fbodyproperty if statement ifstatement statement property label fix messages fixmessages code style fix codestylefix change else to block changeelsetoblock description label fix messages fixmessages code style fix codestylefix change control to block changecontroltoblock description text edit group texteditgroup group create text edit group createtexteditgroup label cu rewrite curewrite ast node astnode move target movetarget rewrite create move target createmovetarget f body fbody block replacing body replacingbody cu rewrite curewrite get root getroot getast new block newblock replacing body replacingbody statements add move target movetarget rewrite f control statement fcontrolstatement f body property fbodyproperty replacing body replacingbody group remove block operation removeblockoperation compilation unit rewrite operation compilationunitrewriteoperation statement f statement fstatement child property descriptor childpropertydescriptor f child fchild remove block operation removeblockoperation statement control statement controlstatement child property descriptor childpropertydescriptor child f statement fstatement control statement controlstatement f child fchild child override rewriteast compilation unit rewrite compilationunitrewrite cu rewrite curewrite linked proposal model linkedproposalmodel model core exception coreexception ast rewrite astrewrite rewrite cu rewrite curewrite getastrewrite block block block f statement fstatement get structural property getstructuralproperty f child fchild statement statement statement block statements statement move target movetarget statement rewrite create move target createmovetarget statement text edit group texteditgroup group create text edit group createtexteditgroup fix messages fixmessages control statements fix controlstatementsfix remove brackets removebrackets proposal description proposaldescription cu rewrite curewrite rewrite f statement fstatement f child fchild move target movetarget group satisfies clean up precondition satisfiescleanupprecondition statement control statement controlstatement child property descriptor childpropertydescriptor child descriptor childdescriptor only return and throws onlyreturnandthrows satisfies precondition satisfiesprecondition control statement controlstatement child descriptor childdescriptor only return and throws onlyreturnandthrows satisfies quick assist precondition satisfiesquickassistprecondition statement control statement controlstatement child property descriptor childpropertydescriptor child descriptor childdescriptor satisfies precondition satisfiesprecondition control statement controlstatement child descriptor childdescriptor block child child descriptor childdescriptor control statement controlstatement removed satisfies precondition satisfiesprecondition statement control statement controlstatement child property descriptor childpropertydescriptor child descriptor childdescriptor only return and throws onlyreturnandthrows clean up check cleanupcheck object child control statement controlstatement get structural property getstructuralproperty child descriptor childdescriptor child block block block block child list statement list block statements list size ast node astnode single statement singlestatement list only return and throws onlyreturnandthrows single statement singlestatement return statement returnstatement single statement singlestatement throw statement throwstatement control statement controlstatement if statement ifstatement if statement ifstatement control statement controlstatement get then statement getthenstatement child remove blocks if statement ifstatement if statement ifstatement if statement ifstatement control statement controlstatement if statement ifstatement get else statement getelsestatement remove has unblocked if hasunblockedif statement single statement singlestatement only return and throws onlyreturnandthrows clean up check cleanupcheck has unblocked if hasunblockedif statement single statement singlestatement only return and throws onlyreturnandthrows clean up check cleanupcheck ast node astnode current child currentchild control statement controlstatement ast node astnode parent current child currentchild get parent getparent statement body parent if statement ifstatement body if statement ifstatement parent get then statement getthenstatement current child currentchild unblocked body current child currentchild if statement ifstatement parent get else statement getelsestatement parent while statement whilestatement body while statement whilestatement parent get body getbody parent do statement dostatement body do statement dostatement parent get body getbody parent for statement forstatement body for statement forstatement parent get body getbody parent enhanced for statement enhancedforstatement body enhanced for statement enhancedforstatement parent get body getbody parents child block body current child currentchild current child currentchild parent parent current child currentchild get parent getparent has unblocked if hasunblockedif statement only return and throws onlyreturnandthrows clean up check cleanupcheck if statement ifstatement child property descriptor childpropertydescriptor child d childd while statement whilestatement child d childd while statement whilestatement body property for statement forstatement child d childd for statement forstatement body property enhanced for statement enhancedforstatement child d childd enhanced for statement enhancedforstatement body property do statement dostatement child d childd do statement dostatement body property statement body statement get structural property getstructuralproperty child d childd body block clean up check cleanupcheck satisfies precondition satisfiesprecondition child d childd only return and throws onlyreturnandthrows clean up check cleanupcheck statement block body statements body control statements fix controlstatementsfix create remove block fix createremoveblockfix compilation unit compilationunit compilation unit compilationunit ast node astnode node node statement statement statement statement node statement block block block block statement block statements size ast node astnode parent block get parent getparent parent statement statement statement parent statement if statement ifstatement list control statements fix controlstatementsfix result array list arraylist list remove block operation removeblockoperation remove all list removealllist array list arraylist if else iterator ifelseiterator iter if else iterator ifelseiterator if statement ifstatement statement if statement ifstatement item iter has next hasnext item iter remove block operation removeblockoperation satisfies quick assist precondition satisfiesquickassistprecondition item if statement ifstatement statement property remove block operation removeblockoperation remove block operation removeblockoperation item if statement ifstatement statement property remove all list removealllist add item statement result add control statements fix controlstatementsfix fix messages fixmessages control statements fix controlstatementsfix remove if block removeifblock proposal description proposaldescription compilation unit compilationunit compilation unit rewrite operation compilationunitrewriteoperation remove block operation removeblockoperation satisfies quick assist precondition satisfiesquickassistprecondition item if statement ifstatement statement property remove block operation removeblockoperation remove block operation removeblockoperation item if statement ifstatement statement property remove all list removealllist add item statement result add control statements fix controlstatementsfix fix messages fixmessages control statements fix controlstatementsfix remove else block removeelseblock proposal description proposaldescription compilation unit compilationunit compilation unit rewrite operation compilationunitrewriteoperation remove all list removealllist size compilation unit rewrite operation compilationunitrewriteoperation all convert allconvert remove all list removealllist to array toarray compilation unit rewrite operation compilationunitrewriteoperation remove all list removealllist size result add control statements fix controlstatementsfix fix messages fixmessages control statements fix controlstatementsfix remove if else block removeifelseblock proposal description proposaldescription compilation unit compilationunit all convert allconvert result to array toarray control statements fix controlstatementsfix result size statement while statement whilestatement remove block operation removeblockoperation satisfies quick assist precondition satisfiesquickassistprecondition statement while statement whilestatement body property remove block operation removeblockoperation remove block operation removeblockoperation statement while statement whilestatement body property control statements fix controlstatementsfix control statements fix controlstatementsfix fix messages fixmessages control statements fix controlstatementsfix remove brackets removebrackets proposal description proposaldescription compilation unit compilationunit compilation unit rewrite operation compilationunitrewriteoperation statement for statement forstatement remove block operation removeblockoperation satisfies quick assist precondition satisfiesquickassistprecondition statement for statement forstatement body property remove block operation removeblockoperation remove block operation removeblockoperation statement for statement forstatement body property control statements fix controlstatementsfix control statements fix controlstatementsfix fix messages fixmessages control statements fix controlstatementsfix remove brackets removebrackets proposal description proposaldescription compilation unit compilationunit compilation unit rewrite operation compilationunitrewriteoperation statement enhanced for statement enhancedforstatement remove block operation removeblockoperation satisfies quick assist precondition satisfiesquickassistprecondition statement enhanced for statement enhancedforstatement body property remove block operation removeblockoperation remove block operation removeblockoperation statement enhanced for statement enhancedforstatement body property control statements fix controlstatementsfix control statements fix controlstatementsfix fix messages fixmessages control statements fix controlstatementsfix remove brackets removebrackets proposal description proposaldescription compilation unit compilationunit compilation unit rewrite operation compilationunitrewriteoperation statement do statement dostatement remove block operation removeblockoperation satisfies quick assist precondition satisfiesquickassistprecondition statement do statement dostatement body property remove block operation removeblockoperation remove block operation removeblockoperation statement do statement dostatement body property control statements fix controlstatementsfix control statements fix controlstatementsfix fix messages fixmessages control statements fix controlstatementsfix remove brackets removebrackets proposal description proposaldescription compilation unit compilationunit compilation unit rewrite operation compilationunitrewriteoperation i clean up fix icleanupfix create clean up createcleanup compilation unit compilationunit compilation unit compilationunit convert single statement to block convertsinglestatementtoblock remove unnecessary block removeunnecessaryblock remove unnecessary block containing return or throw removeunnecessaryblockcontainingreturnorthrow convert single statement to block convertsinglestatementtoblock remove unnecessary block removeunnecessaryblock remove unnecessary block containing return or throw removeunnecessaryblockcontainingreturnorthrow list compilation unit rewrite operation compilationunitrewriteoperation operations array list arraylist control statement finder controlstatementfinder finder control statement finder controlstatementfinder convert single statement to block convertsinglestatementtoblock remove unnecessary block removeunnecessaryblock remove unnecessary block containing return or throw removeunnecessaryblockcontainingreturnorthrow operations compilation unit compilationunit accept finder operations is empty isempty compilation unit rewrite operation compilationunitrewriteoperation ops operations to array toarray compilation unit rewrite operation compilationunitrewriteoperation operations size control statements fix controlstatementsfix fix messages fixmessages control statements fix controlstatementsfix change compilation unit compilationunit ops control statements fix controlstatementsfix string compilation unit compilationunit compilation unit compilationunit compilation unit rewrite operation compilationunitrewriteoperation fix rewrite operations fixrewriteoperations compilation unit compilationunit fix rewrite operations fixrewriteoperations