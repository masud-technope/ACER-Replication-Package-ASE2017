copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal refactoring nls search java buffered input stream bufferedinputstream java byte array input stream bytearrayinputstream java io exception ioexception java input stream inputstream java util enumeration java util hash set hashset java util iterator java util org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime i status istatus org eclipse core resources i file ifile org eclipse core file buf fers filebuffers file buffers filebuffers org eclipse core file buf fers filebuffers i text file buffer itextfilebuffer org eclipse core file buf fers filebuffers i text file buffer manager itextfilebuffermanager org eclipse core file buf fers filebuffers location kind locationkind org eclipse jface text position org eclipse search text match org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i field ifield org eclipse jdt core i java element ijavaelement org eclipse jdt core i java project ijavaproject org eclipse jdt core i source reference isourcereference org eclipse jdt core i type itype org eclipse jdt core java core javacore org eclipse jdt core signature org eclipse jdt core tool factory toolfactory org eclipse jdt core compiler i scanner iscanner org eclipse jdt core compiler i terminal symbols iterminalsymbols org eclipse jdt core compiler invalid input exception invalidinputexception org eclipse jdt core search search match searchmatch org eclipse jdt core search search requestor searchrequestor org eclipse jdt internal corext refactoring nls property file document model propertyfiledocumentmodel org eclipse jdt internal corext util java model util javamodelutil org eclipse jdt internal java plugin javaplugin org eclipse jdt internal javauistatus org eclipse jdt internal util string matcher stringmatcher nls search result requestor nlssearchresultrequestor search requestor searchrequestor matches f result fresult element group key i java element ijavaelement file entry fileentry nls string matcher stringmatcher f g get class name matcher fggetclassnamematcher string matcher stringmatcher get name getname object key find key findkey position i java element ijavaelement string key string nls search result nlssearchresult f result fresult i file ifile f properties file fpropertiesfile properties f properties fproperties hash set hashset string f used property names fusedpropertynames nls search result requestor nlssearchresultrequestor i file ifile properties file propertiesfile nls search result nlssearchresult result f properties file fpropertiesfile properties file propertiesfile f result fresult result org eclipse jdt core search search requestor searchrequestor begin reporting beginreporting override begin reporting beginreporting load properties loadproperties f used property names fusedpropertynames hash set hashset f properties fproperties size org eclipse jdt core search search requestor searchrequestor accept search match acceptsearchmatch org eclipse jdt core search search match searchmatch override accept search match acceptsearchmatch search match searchmatch match core exception coreexception match get acc uracy getaccuracy search match searchmatch inaccurate offset match get offset getoffset length match get length getlength offset length match get element getelement i java element ijavaelement i java element ijavaelement java element javaelement i java element ijavaelement match get element getelement ignore matches declarations java element javaelement get element type getelementtype i java element ijavaelement declaration java element javaelement get element type getelementtype i java element ijavaelement file matches statements files java element javaelement get element type getelementtype i java element ijavaelement type classes extending accessor work around workaround bug heuristic ignore matches resource bundle field java element javaelement get element type getelementtype i java element ijavaelement field i field ifield field i field ifield java element javaelement string source field get source getsource source f g get class name matcher fggetclassnamematcher match source java element javaelement i source reference isourcereference string source i source reference isourcereference java element javaelement get source getsource source nls source index of indexof nls initialize messages initializemessages nls reference nls wrapper check key position mutable key position mutablekeyposition position offset length todo argument string adds match type string key find key findkey mutable key position mutablekeyposition java element javaelement key is key defined iskeydefined key i compilation unit icompilationunit all compilation units allcompilationunits java model util javamodelutil get all compilation units getallcompilationunits i java element ijavaelement java element javaelement object element java element javaelement all compilation units allcompilationunits all compilation units allcompilationunits length element all compilation units allcompilationunits f result fresult add match addmatch match element mutable key position mutablekeyposition get offset getoffset mutable key position mutablekeyposition get length getlength report unused property names reportunusedpropertynames i progress monitor iprogressmonitor don end reporting endreporting running operation nls begin task begintask f properties fproperties size has unused hasunused set task name settaskname nls search messages nlssearchmessages nls search result requestor nlssearchresultrequestor searching file entry fileentry group element groupelement file entry fileentry f properties file fpropertiesfile nls search messages nlssearchmessages nls search result collector nlssearchresultcollector unused keys unusedkeys enumeration enumeration f properties fproperties property names propertynames enumeration has more elements hasmoreelements string property name propertyname string enumeration next element nextelement f used property names fusedpropertynames property name propertyname add match addmatch group element groupelement property name propertyname has unused hasunused worked has unused hasunused f result fresult add file entry group addfileentrygroup group element groupelement add match addmatch file entry fileentry group element groupelement string property name propertyname todo bug read properties file reader properties load input stream inputstream remember start position original version int erpreting interpreting escape characters property current work around workaround escape key searching properties file fail key escaped manner property file document model propertyfiledocumentmodel unwind escape chars unwindescapechars produces string escaped property name escapedpropertyname property file document model propertyfiledocumentmodel escape property name propertyname start find property name start position findpropertynamestartposition escaped property name escapedpropertyname length report start start length length escaped property name escapedpropertyname length f result fresult add match addmatch match group element groupelement start length checks key defined property file adds list properties param key key code code key defined code code is key defined iskeydefined string key key key f used property names fusedpropertynames add key f properties fproperties get property getproperty key has property key haspropertykey string key f properties fproperties contains key containskey key is used property key isusedpropertykey string key f used property names fusedpropertynames key finds key defined match assumption key argument string literal quoted string constant string defined param key position result keypositionresult reference parameter filled position key param enclosing element enclosingelement enclosing java element string denoting key link key key code code core exception coreexception problem occurs accessing code enclosing element enclosingelement code string find key findkey position key position result keypositionresult i java element ijavaelement enclosing element enclosingelement core exception coreexception i compilation unit icompilationunit unit i compilation unit icompilationunit enclosing element enclosingelement get ancestor getancestor i java element ijavaelement compilation unit unit string source unit get source getsource source i java project ijavaproject java project javaproject unit get java project getjavaproject i scanner iscanner scanner java project javaproject string compliance level compliancelevel java project javaproject get option getoption java core javacore compiler compliance string source level sourcelevel java project javaproject get option getoption java core javacore compiler source scanner tool factory toolfactory create scanner createscanner source level sourcelevel compliance level compliancelevel scanner tool factory toolfactory create scanner createscanner scanner set source setsource source to char array tochararray scanner reset t o resetto key position result keypositionresult get offset getoffset key position result keypositionresult get length getlength source length scanner get next token getnexttoken i terminal symbols iterminalsymbols tokennamedot scanner get next token getnexttoken i terminal symbols iterminalsymbols token name identifier tokennameidentifier string src string scanner get current token source getcurrenttokensource token start tokenstart scanner get current token start position getcurrenttokenstartposition token end tokenend scanner get current token end position getcurrenttokenendposition scanner get next token getnexttoken i terminal symbols iterminalsymbols tokennamelparen school key string ignore methods single string parameter bug next token nexttoken scanner get next token getnexttoken next token nexttoken i terminal symbols iterminalsymbols token name string literal tokennamestringliteral next token nexttoken i terminal symbols iterminalsymbols token name identifier tokennameidentifier token start tokenstart scanner get current token start position getcurrenttokenstartposition token end tokenend scanner get current token end position getcurrenttokenendposition token token scanner get next token getnexttoken i terminal symbols iterminalsymbols tokennamedot next token nexttoken scanner get next token getnexttoken i terminal symbols iterminalsymbols token name identifier tokennameidentifier token start tokenstart scanner get current token start position getcurrenttokenstartposition token end tokenend scanner get current token end position getcurrenttokenendposition token i terminal symbols iterminalsymbols tokennamerparen next token nexttoken i terminal symbols iterminalsymbols token name string literal tokennamestringliteral key position result keypositionresult set offset setoffset token start tokenstart key position result keypositionresult set length setlength token end tokenend token start tokenstart source substring token start tokenstart token end tokenend next token nexttoken i terminal symbols iterminalsymbols token name identifier tokennameidentifier key position result keypositionresult set offset setoffset token start tokenstart key position result keypositionresult set length setlength token end tokenend token start tokenstart i type itype parent class parentclass i type itype enclosing element enclosingelement get ancestor getancestor i java element ijavaelement type i field ifield fields parent class parentclass get fields getfields string identifier source substring token start tokenstart token end tokenend fields length fields get element name getelementname equals identifier nls signature get signature simple name getsignaturesimplename fields get type signature gettypesignature equals nls string object obj fields get constant getconstant obj string string obj substring string obj length key key i java element ijavaelement unit code select codeselect token start tokenstart token end tokenend token start tokenstart key length get element type getelementtype i java element ijavaelement type i type itype is interface isinterface key position result keypositionresult set offset setoffset token start tokenstart key position result keypositionresult set length setlength token end tokenend token start tokenstart src invalid input exception invalidinputexception core exception coreexception javauistatus create error createerror i status istatus error finds start position property file assume key match param property name propertyname property start position property file find property name start position findpropertynamestartposition string property name propertyname http dev eclipse org bugs bug cgi input stream inputstream stream line reader linereader line reader linereader string encoding encoding f properties file fpropertiesfile get charset getcharset core exception coreexception encoding iso stream create input stream createinputstream f properties file fpropertiesfile line reader linereader line reader linereader stream encoding core exception coreexception cex java plugin javaplugin log cex io exception ioexception stream stream close io exception ioexception java plugin javaplugin log start string buffer stringbuffer buf string buffer stringbuffer eols line reader linereader read line readline buf key length keylength property name propertyname length eols string buf to string tostring index of indexof property name propertyname char pos charpos key length keylength terminator char terminatorchar has no value hasnovalue char pos charpos length has no value hasnovalue terminator char terminatorchar char at charat char pos charpos trim starts with startswith property name propertyname has no value hasnovalue character is whitespace iswhitespace terminator char terminatorchar terminator char terminatorchar start index of indexof property name propertyname key eols start length eols buf set length setlength eols line reader linereader read line readline buf eols key file bug happen key escaped characters start io exception ioexception java plugin javaplugin log line reader linereader close io exception ioexception java plugin javaplugin log start load properties loadproperties object duplicate keys duplicatekeys hash set hashset f properties fproperties properties duplicate keys duplicatekeys input stream inputstream stream stream buffered input stream bufferedinputstream create input stream createinputstream f properties file fpropertiesfile core exception coreexception f properties fproperties properties f properties fproperties load stream io exception ioexception f properties fproperties properties stream close io exception ioexception report duplicate keys reportduplicatekeys duplicate keys duplicatekeys input stream inputstream create input stream createinputstream i file ifile properties file propertiesfile core exception coreexception i text file buffer manager itextfilebuffermanager manager file buffers filebuffers get text file buffer manager gettextfilebuffermanager manager i text file buffer itextfilebuffer buffer manager get text file buffer gettextfilebuffer properties file propertiesfile get full path getfullpath location kind locationkind ifile buffer byte array input stream bytearrayinputstream buffer get document getdocument get bytes getbytes properties file propertiesfile get contents getcontents report duplicate keys reportduplicatekeys object duplicate keys duplicatekeys duplicate keys duplicatekeys size file entry fileentry group element groupelement file entry fileentry f properties file fpropertiesfile nls search messages nlssearchmessages nls search result collector nlssearchresultcollector duplicate keys duplicatekeys iterator object iter duplicate keys duplicatekeys iterator iter has next hasnext string property name propertyname string iter add match addmatch group element groupelement property name propertyname f result fresult add file entry group addfileentrygroup group element groupelement