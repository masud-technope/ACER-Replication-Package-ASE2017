copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal corext dom fragments java util array list arraylist java util collections java util iterator java util list org eclipse core runtime org eclipse text edits text edit group texteditgroup org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i source range isourcerange org eclipse jdt core java model exception javamodelexception org eclipse jdt core source range sourcerange org eclipse jdt core dom ast node astnode org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom expression org eclipse jdt core dom infix expression infixexpression org eclipse jdt core dom org eclipse jdt core dom parenthesized expression parenthesizedexpression org eclipse jdt core dom rewrite ast rewrite astrewrite org eclipse jdt internal corext source range factory sourcerangefactory org eclipse jdt internal corext dom generic visitor genericvisitor org eclipse jdt internal corext dom jdtastmatcher associative infix expression fragment associativeinfixexpressionfragment ast fragment astfragment i expression fragment iexpressionfragment list expression f operands foperands infix expression infixexpression f group root fgrouproot i expression fragment iexpressionfragment create sub part fragment by source range createsubpartfragmentbysourcerange infix expression infixexpression node i source range isourcerange range i compilation unit icompilationunit java model exception javamodelexception is not null isnotnull node is not null isnotnull range is true istrue util covers range node is true istrue util covers source range factory sourcerangefactory create node range is associative infix isassociativeinfix node infix expression infixexpression group root grouproot find group root findgrouproot node is true istrue is group root isagrouproot group root grouproot list expression group members groupmembers associative infix expression fragment associativeinfixexpressionfragment find group members in order for findgroupmembersinorderfor group root grouproot list expression sub group subgroup find sub group for source range findsubgroupforsourcerange group members groupmembers range sub group subgroup is empty isempty range includes extra non whitespace rangeincludesextranonwhitespace range sub group subgroup associative infix expression fragment associativeinfixexpressionfragment group root grouproot sub group subgroup i expression fragment iexpressionfragment create fragment for full subtree createfragmentforfullsubtree infix expression infixexpression node is not null isnotnull node is associative infix isassociativeinfix node infix expression infixexpression group root grouproot find group root findgrouproot node is true istrue is group root isagrouproot group root grouproot list expression group members groupmembers associative infix expression fragment associativeinfixexpressionfragment find group members in order for findgroupmembersinorderfor node associative infix expression fragment associativeinfixexpressionfragment group root grouproot group members groupmembers infix expression infixexpression find group root findgrouproot infix expression infixexpression node is true istrue is associative infix isassociativeinfix node is group root isagrouproot node ast node astnode parent node get parent getparent is not null isnotnull parent is true istrue is associative infix isassociativeinfix parent is true istrue infix expression infixexpression parent get operator getoperator node get operator getoperator node infix expression infixexpression parent node list expression find sub group for source range findsubgroupforsourcerange list expression group i source range isourcerange range is true istrue group is empty isempty list expression sub group subgroup array list arraylist entered exited range get offset getoffset group get start position getstartposition entered group size expression member group expression next member nextmember group entered sub group subgroup add member range ends between rangeendsbetween range member next member nextmember exited range starts between rangestartsbetween range member next member nextmember entered expression last group member lastgroupmember group group size util get end exclusive getendexclusive range util get end exclusive getendexclusive source range factory sourcerangefactory create last group member lastgroupmember sub group subgroup add last group member lastgroupmember exited exited array list arraylist sub group subgroup range starts between rangestartsbetween i source range isourcerange range ast node astnode ast node astnode pos range get offset getoffset get start position getstartposition get length getlength pos pos get start position getstartposition range ends between rangeendsbetween i source range isourcerange range ast node astnode ast node astnode pos util get end exclusive getendexclusive range get start position getstartposition get length getlength pos pos get start position getstartposition range includes extra non whitespace rangeincludesextranonwhitespace i source range isourcerange range list expression operands i compilation unit icompilationunit java model exception javamodelexception util range includes non whitespace out side range rangeincludesnonwhitespaceoutsiderange range get range of operands getrangeofoperands operands get buffer getbuffer i source range isourcerange get range of operands getrangeofoperands list expression operands expression operands expression operands operands size source range sourcerange get start position getstartposition get start position getstartposition get length getlength get start position getstartposition override iast fragment iastfragment get matching fragments with node getmatchingfragmentswithnode ast node astnode node iast fragment iastfragment fragment for node fragmentfornode ast fragment factory astfragmentfactory create fragment for full subtree createfragmentforfullsubtree node fragment for node fragmentfornode associative infix expression fragment associativeinfixexpressionfragment associative infix expression fragment associativeinfixexpressionfragment kin associative infix expression fragment associativeinfixexpressionfragment fragment for node fragmentfornode kin get sub fragments with my node matching getsubfragmentswithmynodematching iast fragment iastfragment returns matching sub sequences subsequences code to match tomatch code code source code param source source matching sub sequences subsequences param to match tomatch sequence match returns list lists code expression code list list expression get matching contiguous node sub sequences getmatchingcontiguousnodesubsequences list expression source list expression to match tomatch naive implementation list list expression sub sequences subsequences array list arraylist source size matches at matchesat source to match tomatch sub sequences subsequences add source sub list sublist to match tomatch size to match tomatch size sub sequences subsequences matches at matchesat list expression subject list expression to match tomatch to match tomatch size subject size to match tomatch size jdtastmatcher do nodes match donodesmatch subject to match tomatch is group root isagrouproot ast node astnode node is not null isnotnull node is associative infix isassociativeinfix node is parent infix with same operator isparentinfixwithsameoperator infix expression infixexpression node is associative infix isassociativeinfix ast node astnode node node infix expression infixexpression is operator associative isoperatorassociative infix expression infixexpression node get operator getoperator is parent infix with same operator isparentinfixwithsameoperator infix expression infixexpression node node get parent getparent infix expression infixexpression infix expression infixexpression node get parent getparent get operator getoperator node get operator getoperator is operator associative isoperatorassociative infix expression infixexpression infix expression infixexpression infix expression infixexpression times infix expression infixexpression xor infix expression infixexpression infix expression infixexpression infix expression infixexpression conditional infix expression infixexpression conditional associative infix expression fragment associativeinfixexpressionfragment infix expression infixexpression group root grouproot list expression operands is true istrue is group root isagrouproot group root grouproot is true istrue operands size f group root fgrouproot group root grouproot f operands foperands collections unmodifiable list unmodifiablelist operands override matches iast fragment iastfragment get class getclass equals get class getclass associative infix expression fragment associativeinfixexpressionfragment other of kind otherofkind associative infix expression fragment associativeinfixexpressionfragment get operator getoperator other of kind otherofkind get operator getoperator do operands match dooperandsmatch other of kind otherofkind do operands match dooperandsmatch associative infix expression fragment associativeinfixexpressionfragment get operands getoperands size get operands getoperands size iterator expression my operands myoperands get operands getoperands iterator iterator expression others operands othersoperands get operands getoperands iterator my operands myoperands has next hasnext others operands othersoperands has next hasnext expression my operand myoperand my operands myoperands expression others operand othersoperand others operands othersoperands jdtastmatcher do nodes match donodesmatch my operand myoperand others operand othersoperand override iast fragment iastfragment get sub fragments matching getsubfragmentsmatching iast fragment iastfragment to match tomatch union get sub fragments with my node matching getsubfragmentswithmynodematching to match tomatch get sub fragments with another node matching getsubfragmentswithanothernodematching to match tomatch iast fragment iastfragment get sub fragments with my node matching getsubfragmentswithmynodematching iast fragment iastfragment to match tomatch to match tomatch get class getclass get class getclass iast fragment iastfragment associative infix expression fragment associativeinfixexpressionfragment kin to match kintomatch associative infix expression fragment associativeinfixexpressionfragment to match tomatch kin to match kintomatch get operator getoperator get operator getoperator iast fragment iastfragment list list expression matching sub sequences matchingsubsequences get matching contiguous node sub sequences getmatchingcontiguousnodesubsequences get operands getoperands kin to match kintomatch get operands getoperands iast fragment iastfragment matches iast fragment iastfragment matching sub sequences matchingsubsequences size matching sub sequences matchingsubsequences size iast fragment iastfragment match associative infix expression fragment associativeinfixexpressionfragment f group root fgrouproot matching sub sequences matchingsubsequences is true istrue match matches to match tomatch to match tomatch matches match matches match matches iast fragment iastfragment get sub fragments with another node matching getsubfragmentswithanothernodematching iast fragment iastfragment to match tomatch iast fragment iastfragment result iast fragment iastfragment iterator expression iter get operands getoperands iterator iter has next hasnext ast node astnode operand iter result union result ast matching fragment finder astmatchingfragmentfinder find matching fragments findmatchingfragments operand ast fragment astfragment to match tomatch result iast fragment iastfragment union iast fragment iastfragment iast fragment iastfragment iast fragment iastfragment union iast fragment iastfragment length length system arraycopy union length system arraycopy union length length union todo real union array list arraylist union array list arraylist length union add length union union add iast fragment iastfragment union to array toarray iast fragment iastfragment union size note fragment represent expression node returns expression override expression get associated expression getassociatedexpression f group root fgrouproot note fragment represent node sort subtree returns node override ast node astnode get associated node getassociatednode f group root fgrouproot infix expression infixexpression get group root getgrouproot f group root fgrouproot override get length getlength get end position exclusive getendpositionexclusive get start position getstartposition get end position exclusive getendpositionexclusive list expression operands get operands getoperands ast node astnode last node lastnode operands operands size last node lastnode get start position getstartposition last node lastnode get length getlength override get start position getstartposition get operands getoperands get start position getstartposition list expression get operands getoperands f operands foperands infix expression infixexpression get operator getoperator f group root fgrouproot get operator getoperator override expression create copy target createcopytarget ast rewrite astrewrite rewrite remove surrounding parent hesis removesurroundingparenthesis java model exception javamodelexception list expression all operands alloperands find group members in order for findgroupmembersinorderfor f group root fgrouproot all operands alloperands size f operands foperands size expression rewrite create copy target createcopytarget f group root fgrouproot compilation unit compilationunit root compilation unit compilationunit f group root fgrouproot get root getroot i compilation unit icompilationunit i compilation unit icompilationunit root get java element getjavaelement string source get buffer getbuffer get text gettext get start position getstartposition get length getlength expression rewrite create string placeholder createstringplaceholder source ast node astnode infix expression todo copy bigger chunks original selection extended operands extendedoperands list nested infix expressions infixexpressions infix expression infixexpression result rewrite getast new infix expression newinfixexpression result set operator setoperator get operator getoperator expression expression f operands foperands expression expression f operands foperands result set left operand setleftoperand expression rewrite create copy target createcopytarget result set right operand setrightoperand expression rewrite create copy target createcopytarget f operands foperands size expression expression f operands foperands result extended operands extendedoperands add rewrite create copy target createcopytarget result override replace ast rewrite astrewrite rewrite ast node astnode replacement text edit group texteditgroup text edit group texteditgroup ast node astnode group node groupnode get group root getgrouproot list expression all operands alloperands find group members in order for findgroupmembersinorderfor get group root getgrouproot all operands alloperands size f operands foperands size replacement group node groupnode get parent getparent parenthesized expression parenthesizedexpression replace including parenthesized expression rewrite replace group node groupnode get parent getparent replacement text edit group texteditgroup rewrite replace group node groupnode replacement text edit group texteditgroup rewrite replace f operands foperands replacement text edit group texteditgroup all operands alloperands index of indexof f operands foperands f operands foperands size rewrite remove all operands alloperands text edit group texteditgroup array list arraylist expression find group members in order for findgroupmembersinorderfor infix expression infixexpression group root grouproot group member finder groupmemberfinder group root grouproot f members in order fmembersinorder group member finder groupmemberfinder generic visitor genericvisitor array list arraylist expression f members in order fmembersinorder array list arraylist infix expression infixexpression f group root fgrouproot group member finder groupmemberfinder infix expression infixexpression group root grouproot is true istrue is associative infix isassociativeinfix group root grouproot f group root fgrouproot group root grouproot f group root fgrouproot accept override visit node visitnode ast node astnode node node infix expression infixexpression infix expression infixexpression node get operator getoperator f group root fgrouproot get operator getoperator f members in order fmembersinorder add expression node override hash code hashcode f group root fgrouproot hash code hashcode override equals object obj obj obj get class getclass obj get class getclass associative infix expression fragment associativeinfixexpressionfragment associative infix expression fragment associativeinfixexpressionfragment obj f group root fgrouproot equals f group root fgrouproot f operands foperands equals f operands foperands