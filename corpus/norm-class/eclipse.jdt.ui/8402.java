copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal corext code manipulation codemanipulation org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core runtime i path ipath org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime i status istatus org eclipse core runtime null progress monitor nullprogressmonitor org eclipse core runtime operation canceled exception operationcanceledexception org eclipse core runtime sub progress monitor subprogressmonitor org eclipse core runtime jobs i scheduling rule ischedulingrule org eclipse core resources i workspace runnable iworkspacerunnable org eclipse core file buf fers filebuffers file buffers filebuffers org eclipse core file buf fers filebuffers i text file buffer manager itextfilebuffermanager org eclipse core file buf fers filebuffers location kind locationkind org eclipse text edits insert edit insertedit org eclipse text edits multi text edit multitextedit org eclipse jface text bad location exception badlocationexception org eclipse jface text i document idocument org eclipse jface text i region iregion org eclipse jface text text utilities textutilities org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i field ifield org eclipse jdt core i java element ijavaelement org eclipse jdt core i java project ijavaproject org eclipse jdt core i member imember org eclipse jdt core i method imethod org eclipse jdt core i type itype org eclipse jdt core i type hierarchy itypehierarchy org eclipse jdt core java model exception javamodelexception org eclipse jdt core signature org eclipse jdt internal corext dom token scanner tokenscanner org eclipse jdt internal corext util method override tester methodoverridetester org eclipse jdt internal corext util strings org eclipse jdt internal corext util super type hierarchy cache supertypehierarchycache org eclipse jdt code generation codegeneration org eclipse jdt internal javauistatus add javadoc stubs members members belong compilation unit parent type open editor pass working copy add java doc stub operation addjavadocstuboperation i workspace runnable iworkspacerunnable i member imember f members fmembers add java doc stub operation addjavadocstuboperation i member imember members is legal islegal members length f members fmembers members string create type comment createtypecomment i type itype type string line delimiter linedelimiter core exception coreexception string type parameter names typeparameternames stub utility stubutility get type parameter names gettypeparameternames type get type parameters gettypeparameters code generation codegeneration get type comment gettypecomment type get compilation unit getcompilationunit type get type qualified name gettypequalifiedname type parameter names typeparameternames line delimiter linedelimiter string create method comment createmethodcomment i method imethod meth string line delimiter linedelimiter core exception coreexception i type itype declaring type declaringtype meth get declaring type getdeclaringtype i method imethod overridden meth is constructor isconstructor i type hierarchy itypehierarchy hierarchy super type hierarchy cache supertypehierarchycache get type hierarchy gettypehierarchy declaring type declaringtype method override tester methodoverridetester tester method override tester methodoverridetester declaring type declaringtype hierarchy overridden tester find overridden method findoverriddenmethod meth code generation codegeneration get method comment getmethodcomment meth overridden line delimiter linedelimiter string create field comment createfieldcomment i field ifield field string line delimiter linedelimiter java model exception javamodelexception core exception coreexception string type name typename signature to string tostring field get type signature gettypesignature string field name fieldname field get element name getelementname code generation codegeneration get field comment getfieldcomment field get compilation unit getcompilationunit type name typename field name fieldname line delimiter linedelimiter returns scheduling rule operation i scheduling rule ischedulingrule get schedule rule getschedulerule f members fmembers get resource getresource org eclipse core resources i workspace runnable iworkspacerunnable org eclipse core runtime i progress monitor iprogressmonitor override i progress monitor iprogressmonitor monitor core exception coreexception operation canceled exception operationcanceledexception monitor monitor null progress monitor nullprogressmonitor monitor begin task begintask code generation messages codegenerationmessages add java doc stub operation addjavadocstuboperation description f members fmembers length add javadoc comments addjavadoccomments monitor monitor add javadoc comments addjavadoccomments i progress monitor iprogressmonitor monitor core exception coreexception i compilation unit icompilationunit f members fmembers get compilation unit getcompilationunit i text file buffer manager itextfilebuffermanager manager file buffers filebuffers get text file buffer manager gettextfilebuffermanager i path ipath path get path getpath manager connect path location kind locationkind ifile sub progress monitor subprogressmonitor monitor i document idocument document manager get text file buffer gettextfilebuffer path location kind locationkind ifile get document getdocument string line delim linedelim text utilities textutilities get default line delimiter getdefaultlinedelimiter document multi text edit multitextedit edit multi text edit multitextedit f members fmembers length i member imember curr f members fmembers member start offset memberstartoffset get member start offset getmemberstartoffset curr document string comment curr get element type getelementtype i java element ijavaelement type comment create type comment createtypecomment i type itype curr line delim linedelim i java element ijavaelement field comment create field comment createfieldcomment i field ifield curr line delim linedelim i java element ijavaelement method comment create method comment createmethodcomment i method imethod curr line delim linedelim comment string buffer stringbuffer buf string buffer stringbuffer nls buf append append nls line delim linedelim nls buf append append nls line delim linedelim nls buf append append nls line delim linedelim comment buf to string tostring comment ends with endswith line delim linedelim comment comment line delim linedelim i java project ijavaproject project get java project getjavaproject i region iregion region document get line information of offset getlineinformationofoffset member start offset memberstartoffset string document region get offset getoffset region get length getlength string indent string indentstring strings get indent string getindentstring project string indented comment indentedcomment strings change indent changeindent comment project indent string indentstring line delim linedelim edit add child addchild insert edit insertedit member start offset memberstartoffset indented comment indentedcomment monitor worked apply edits edit apply document bad location exception badlocationexception core exception coreexception javauistatus create error createerror i status istatus error manager disconnect path location kind locationkind ifile sub progress monitor subprogressmonitor monitor get member start offset getmemberstartoffset i member imember curr i document idocument document java model exception javamodelexception offset curr get source range getsourcerange get offset getoffset token scanner tokenscanner scanner token scanner tokenscanner document curr get java project getjavaproject read real comment token scanner get next start offset getnextstartoffset offset core exception coreexception offset