copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt tests refactoring junit framework test junit framework test case testcase junit framework test suite testsuite org eclipse jdt internal corext refactoring rename renaming name suggestor renamingnamesuggestor renaming name suggestor tests renamingnamesuggestortests test case testcase test suite test suite testsuite renaming name suggestor tests renamingnamesuggestortests string f prefixes fprefixes string f suffixes fsuffixes renaming name suggestor renamingnamesuggestor f suggestor fsuggestor string f helper fhelper string old field name oldfieldname string old type name oldtypename string new type name newtypename f suggestor fsuggestor suggest new variable name suggestnewvariablename f prefixes fprefixes f suffixes fsuffixes old field name oldfieldname old type name oldtypename new type name newtypename string m helper mhelper string old field name oldfieldname string old type name oldtypename string new type name newtypename f suggestor fsuggestor suggest new method name suggestnewmethodname old field name oldfieldname old type name oldtypename new type name newtypename string orig string changed string old t oldt string new t newt assert equals assertequals changed m helper mhelper orig old t oldt new t newt mhf string orig string old t oldt string new t newt assert equals assertequals m helper mhelper orig old t oldt new t newt string orig string changed string old t oldt string new t newt assert equals assertequals changed f helper fhelper orig old t oldt new t newt f hf fhf string orig string old t oldt string new t newt assert equals assertequals f helper fhelper orig old t oldt new t newt set strategy setstrategy str ategy strategy f suggestor fsuggestor renaming name suggestor renamingnamesuggestor str ategy strategy test only prefix testonlyprefix f prefixes fprefixes string f suffixes fsuffixes string set strategy setstrategy renaming name suggestor renamingnamesuggestor strategy exact prefix assert equals assertequals f some other class fsomeotherclass f helper fhelper f some class fsomeclass some class someclass some other class someotherclass assert equals assertequals q some other class qsomeotherclass f helper fhelper q some class qsomeclass some class someclass some other class someotherclass assert equals assertequals some other class someotherclass f helper fhelper some class someclass some class someclass some other class someotherclass names assert equals assertequals f new java element fnewjavaelement f helper fhelper f java element fjavaelement i java element ijavaelement i new java element inewjavaelement assert equals assertequals new java element newjavaelement f helper fhelper java element javaelement i java element ijavaelement i new java element inewjavaelement unrelated stuff assert null assertnull f helper fhelper f some class fsomeclass unrelated unrelated test prefix and suffix testprefixandsuffix f prefixes fprefixes string f suffixes fsuffixes string suf set strategy setstrategy renaming name suggestor renamingnamesuggestor strategy exact suffix prefix assert equals assertequals f some other suf fsomeothersuf f helper fhelper f some suf fsomesuf some other someother assert equals assertequals some other suf someothersuf f helper fhelper some suf somesuf some other someother assert equals assertequals f some other fsomeother f helper fhelper f some fsome some other someother assert equals assertequals some other someother f helper fhelper some other someother names assert equals assertequals f new java element suf fnewjavaelementsuf f helper fhelper f java element suf fjavaelementsuf i java element ijavaelement i new java element inewjavaelement assert equals assertequals new java element newjavaelement f helper fhelper java element javaelement i java element ijavaelement i new java element inewjavaelement test only suffix testonlysuffix f prefixes fprefixes string f suffixes fsuffixes string suf set strategy setstrategy renaming name suggestor renamingnamesuggestor strategy exact suffix assert equals assertequals some other class suf someotherclasssuf f helper fhelper some class suf someclasssuf some class someclass some other class someotherclass assert equals assertequals some other class someotherclass f helper fhelper some class someclass some class someclass some other class someotherclass names assert equals assertequals new java element suf newjavaelementsuf f helper fhelper java element suf javaelementsuf i java element ijavaelement i new java element inewjavaelement assert equals assertequals new java element newjavaelement f helper fhelper java element javaelement i java element ijavaelement i new java element inewjavaelement test very short names testveryshortnames f prefixes fprefixes string f suffixes fsuffixes string set strategy setstrategy renaming name suggestor renamingnamesuggestor strategy suffix assert equals assertequals f helper fhelper assert equals assertequals f helper fhelper assert equals assertequals f helper fhelper assert equals assertequals f helper fhelper match occurrence mahahaha mbhahaha test embedded matching testembeddedmatching f prefixes fprefixes string f suffixes fsuffixes string set strategy setstrategy renaming name suggestor renamingnamesuggestor strategy embedded get java element getjavaelement get new java element getnewjavaelement java element javaelement new java element newjavaelement java element javaelement new java element newjavaelement java element javaelement new java element newjavaelement create java element createjavaelement create new java element createnewjavaelement java element javaelement new java element newjavaelement get java element getjavaelement get new java element getnewjavaelement i java element ijavaelement i new java element inewjavaelement mhf create java element cache createjavaelementcache java element javaelement new java element newjavaelement match letters digits hunk some class someclass some different class somedifferentclass some class someclass some different class somedifferentclass some class someclass some different class somedifferentclass some class someclass some different class somedifferentclass match type create elements econd element createelementsecondelement create elements econd member createelementsecondmember element member create elements econdelement createelementsecondelement create elements econdmember createelementsecondmember element member f hf fhf create elements econdelementnomore createelementsecondelementnomore element member test camel case matching testcamelcasematching f prefixes fprefixes string f suffixes fsuffixes string set strategy setstrategy renaming name suggestor renamingnamesuggestor strategy suffix camel match get element getelement get member getmember java element javaelement java member javamember get element getelement get member getmember i java element ijavaelement i java member ijavamember get element getelement get member getmember a very long java element averylongjavaelement a very long java member averylongjavamember get java element getjavaelement get java member getjavamember simple java element simplejavaelement simple java member simplejavamember get java element getjavaelement get general element getgeneralelement simple java element simplejavaelement simple general element simplegeneralelement get very long java element getverylongjavaelement get some comp let ely different name getsomecompletelydifferentname ext remely very long java element extremelyverylongjavaelement ext remely some comp let ely different name extremelysomecompletelydifferentname fields element member java element javaelement java member javamember element member i java element ijavaelement i java member ijavamember java element javaelement java member javamember java element javaelement java member javamember cached java element cachedjavaelement cached java member cachedjavamember java element javaelement java member javamember java element javaelement non java member nonjavamember java element javaelement non java member nonjavamember methods get freaky class getfreakyclass get last getlast freaky class freakyclass element member some freaky element somefreakyelement some freaky member somefreakymember createmyastnode create my node createmynode myastnode my node mynode f reaky freaky stuff getastnode getastelement ast node astnode ast element astelement getastnode get tree node gettreenode ast node astnode tree node treenode getastheaven get no brainer getnobrainer ast heaven astheaven no brainer nobrainer java element java element javaelement java element java element javaelement suffixes the element t o use theelementtouse the thing t o use thethingtouse java element javaelement java thing javathing match hunk get java some element getjavasomeelement get java some member getjavasomemember java element javaelement java member javamember mhf get java some getjavasome java element javaelement java member javamember failures mhf get element getelement java element label javaelementlabel java member label javamemberlabel mhf get element label getelementlabel java element javaelement java member javamember f hf fhf my class myclass avoid silly suggestions don renaming f element felement f element felement f hf fhf f element felement some long element somelongelement another different element anotherdifferentelement test upper case camel case matching testuppercasecamelcasematching f prefixes fprefixes string f suffixes fsuffixes string set strategy setstrategy renaming name suggestor renamingnamesuggestor strategy exact complete uppercase camel hunks fast f abstract syntax tree fabstractsyntaxtree ast abstract syntax tree abstractsyntaxtree ast abstract syntax tree abstractsyntaxtree ast abstract syntax tree abstractsyntaxtree complete uppercase camel hunks lower case d lowercased f ast fast f abstract syntax tree fabstractsyntaxtree ast abstract syntax tree abstractsyntaxtree ast abstract syntax tree abstractsyntaxtree ast abstract syntax tree abstractsyntaxtree ast abstract syntax tree abstractsyntaxtree ast abstract syntax tree abstractsyntaxtree fastnode fabstractstnode ast node astnode abstractstnode fastnode fastreenode ast node astnode as tree node astreenode match f ast node fastnode fabstractstnode ast node astnode abstractstnode f ast node fastnode f as tree node fastreenode ast node astnode as tree node astreenode changing uppercase hunks exact embedded mode unclear hunk type corresponds custom lower case d lowercased hunk variable guessing hunk proceed hunk hunk suffix mode set strategy setstrategy renaming name suggestor renamingnamesuggestor strategy embedded f ast fast f abstract syntax tree fabstractsyntaxtree ast abstract syntax tree abstractsyntaxtree ast abstract syntax tree abstractsyntaxtree ast abstract syntax tree abstractsyntaxtree set strategy setstrategy renaming name suggestor renamingnamesuggestor strategy suffix partial uppercase camel hunks fast fmust personalast personalmust down grading downgrading hunks f ast fast f must fmust personalast personalmust fhunkpowered fmonkpowered reallyhunkpowered reallymonkpowered f hunk powered fhunkpowered f monk powered fmonkpowered reallyhunkpowered reallymonkpowered f hunk powered fhunkpowered f monk powered fmonkpowered reallyhunkpowered really monk powered reallymonkpowered f hunk powered fhunkpowered f hunk fhunk powered hunk powered hunkpowered hunk powered powered powered hunkpowered monkpowered adapted middle hunks ast node astnode fast node fastnode ast node astnode fast node fastnode createmyastnode createmysecondnode myastnode mysecondnode create my ast node createmyastnode create my second node createmysecondnode myastnode mysecondnode methods createast create abstract syntax tree createabstractsyntaxtree ast abstract syntax tree abstractsyntaxtree match hunks fastnode fmyastnode ast node astnode myastnode f ast node fastnode f my ast node fmyastnode ast node astnode myastnode f different ast node fdifferentastnode f different my ast node fdifferentmyastnode ast node astnode myastnode f different ast node t o use fdifferentastnodetouse f different my ast node t o use fdifferentmyastnodetouse ast node astnode myastnode prop agating propagating lower case d lowercased front ast node astnode my ast node myastnode ast node astnode myastnode test plural s testplurals f prefixes fprefixes string f suffixes fsuffixes string set strategy setstrategy renaming name suggestor renamingnamesuggestor strategy exact items item handies mobile phones mobilephones h a ndy handy mobile phone mobilephone handy mobile phone mobilephone h a ndy handy mobile phone mobilephone mobile phones mobilephones handies mobile phone mobilephone h a ndy handy mobile phone mobilephone handy mobile phone mobilephone h a ndy handy handies man dies mandies h a ndy handy m a ndy mandy set strategy setstrategy renaming name suggestor renamingnamesuggestor strategy embedded items on loan itemsonloan things on loan thingsonloan item plural item stuff itemstuff thing stuff thingstuff item some hand ies on loan somehandiesonloan some mobile phones on loan somemobilephonesonloan h a ndy handy mobile phone mobilephone some hand ies on loan somehandiesonloan some mandies on loan somemandiesonloan h a ndy handy m a ndy mandy set strategy setstrategy renaming name suggestor renamingnamesuggestor strategy suffix some items on loan someitemsonloan some t hings on loan somethingsonloan ast item astitem noast thing noastthing some hand ies on loan somehandiesonloan some mandies on loan somemandiesonloan h a ndy handy m a ndy mandy some hand ies on loan somehandiesonloan some mobile phones on loan somemobilephonesonloan h a ndy handy mobile phone mobilephone some phones on loan somephonesonloan some hand ies on loan somehandiesonloan mobile phone mobilephone h a ndy handy