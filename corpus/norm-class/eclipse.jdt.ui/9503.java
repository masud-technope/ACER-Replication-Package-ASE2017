copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal text javadoc org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse jface text bad location exception badlocationexception org eclipse jface text default indent line auto edit strategy defaultindentlineautoeditstrategy org eclipse jface text document command documentcommand org eclipse jface text i document idocument org eclipse jface text i region iregion org eclipse jface text i type d region itypedregion org eclipse jface text region org eclipse jface text text utilities textutilities org eclipse i editor part ieditorpart org eclipse i workbench page iworkbenchpage org eclipse i workbench window iworkbenchwindow org eclipse platformui org eclipse texteditor i text editor extension itexteditorextension org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i java element ijavaelement org eclipse jdt core i java project ijavaproject org eclipse jdt core i member imember org eclipse jdt core i method imethod org eclipse jdt core i source range isourcerange org eclipse jdt core i type itype org eclipse jdt core java model exception javamodelexception org eclipse jdt internal corext code manipulation codemanipulation stub utility stubutility org eclipse jdt internal corext util java model util javamodelutil org eclipse jdt internal corext util method override tester methodoverridetester org eclipse jdt internal corext util strings org eclipse jdt internal corext util super type hierarchy cache supertypehierarchycache org eclipse jdt code generation codegeneration org eclipse jdt i working copy manager iworkingcopymanager org eclipse jdt preference constants preferenceconstants org eclipse jdt internal java plugin javaplugin org eclipse jdt internal java editor javaeditor editor utility editorutility auto indent str ategy strategy javadoc comments java doc auto indent strategy javadocautoindentstrategy default indent line auto edit strategy defaultindentlineautoeditstrategy partitioning str ategy strategy operates string f partitioning fpartitioning creates javadoc auto indent str ategy strategy document partitioning param partitioning document partitioning java doc auto indent strategy javadocautoindentstrategy string partitioning f partitioning fpartitioning partitioning copies indentation previous adds star javadoc started add standard method tags close javadoc param document work param command deal indent after new line indentafternewline i document idocument document command documentcommand offset offset offset get length getlength offset get length getlength offset offset i region iregion get line information of offset getlineinformationofoffset line offset lineoffset get offset getoffset first non s firstnonws find end of white space findendofwhitespace line offset lineoffset offset nls is true istrue first non s firstnonws line offset lineoffset indentation negative string buffer stringbuffer buf string buffer stringbuffer text i region iregion prefix find prefix range findprefixrange string indentation prefix get offset getoffset prefix get length getlength length to add lengthtoadd math min offset prefix get offset getoffset prefix get length getlength buf append indentation substring length to add lengthtoadd first non s firstnonws offset get char getchar first non s firstnonws javadoc started nls buf append is preference true ispreferencetrue preference constants preferenceconstants editor close java docs javadocs is new comment isnewcomment offset shifts c are t shiftscaret caret offset caretoffset offset buf length string line delimiter linedelimiter text utilities textutilities get default line delimiter getdefaultlinedelimiter eol offset eoloffset line offset lineoffset get length getlength replacement length replacementlength eol offset eoloffset string rest of line restofline replacement length replacementlength string end tag endtag nls line delimiter linedelimiter nls indentation is preference true ispreferencetrue preference constants preferenceconstants editor add javadoc tags close comment computing correct tags order method replace offset replacement length replacementlength end tag endtag evaluate method signature i compilation unit icompilationunit unit get compilation unit getcompilationunit unit java model util javamodelutil reconcile unit string string create java doc tags createjavadoctags indentation line delimiter linedelimiter unit buf append rest of line restofline add tags empty empty nls string nls string trim equals buf append string core exception coreexception length replacement length replacementlength buf append rest of line restofline buf append end tag endtag move caret prefix insert length to add lengthtoadd prefix get length getlength caret offset caretoffset offset prefix get length getlength length to add lengthtoadd text buf to string tostring bad location exception badlocationexception exc p excp returns type d typed preference param preference preference preference java plug preference store is preference true ispreferencetrue string preference java plugin javaplugin get default getdefault get preference store getpreferencestore get boolean getboolean preference returns range javadoc prefix code document code prefix greedily matches regex pattern code code number whitespace characters ast erisk asterisk number whitespace characters param document document code code ref ers refers param extract prefix range code i region iregion code describing range prefix bad location exception badlocationexception accessing document fails i region iregion find prefix range findprefixrange i document idocument document i region iregion bad location exception badlocationexception line offset lineoffset get offset getoffset line end lineend line offset lineoffset get length getlength indent end indentend find end of white space findendofwhitespace document line offset lineoffset line end lineend indent end indentend line end lineend document get char getchar indent end indentend indent end indentend indent end indentend line end lineend document get char getchar indent end indentend indent end indentend region line offset lineoffset indent end indentend line offset lineoffset creates javadoc tags newly inserted comments param document document param command command param indentation base indentation param line delimiter linedelimiter delimiter param unit compilation unit editor tags add document core exception coreexception accessing java model fails bad location exception badlocationexception accessing document fails string create java doc tags createjavadoctags i document idocument document document command documentcommand command string indentation string line delimiter linedelimiter i compilation unit icompilationunit unit core exception coreexception bad location exception badlocationexception i java element ijavaelement element unit get element at getelementat command offset element element get element type getelementtype i java element ijavaelement type create type tags createtypetags document command indentation line delimiter linedelimiter i type itype element i java element ijavaelement method create method tags createmethodtags document command indentation line delimiter linedelimiter i method imethod element removes start comment corrects indentation delimiters param comment computed comment param indentation base indentation param project java project formatter settings code code global preferences param line delimiter linedelimiter delimiter trimmed version code comment code string prepare template comment preparetemplatecomment string comment string indentation i java project ijavaproject project string line delimiter linedelimiter trim comment start nls comment ends with endswith comment comment substring comment length comment comment trim nls comment starts with startswith comment length comment char at charat remove comment comment substring remove comment comment substring trim leading spaces lines non space nonspace len comment length non space nonspace len character get type gettype comment char at charat non space nonspace character space separator non space nonspace comment comment substring non space nonspace strings change indent changeindent comment project indentation line delimiter linedelimiter string create type tags createtypetags i document idocument document document command documentcommand command string indentation string line delimiter linedelimiter i type itype type core exception coreexception bad location exception badlocationexception string type param names typeparamnames stub utility stubutility get type parameter names gettypeparameternames type get type parameters gettypeparameters string comment code generation codegeneration get type comment gettypecomment type get compilation unit getcompilationunit type get type qualified name gettypequalifiedname type param names typeparamnames line delimiter linedelimiter comment nls javadoc comment javadoccomment comment starts with startswith is first comment isfirstcomment document command type javadoc comment javadoccomment prepare template comment preparetemplatecomment comment trim indentation type get java project getjavaproject line delimiter linedelimiter string create method tags createmethodtags i document idocument document document command documentcommand command string indentation string line delimiter linedelimiter i method imethod method core exception coreexception bad location exception badlocationexception i region iregion partition text utilities textutilities get partition getpartition document f partitioning fpartitioning command offset i method imethod inherited method inheritedmethod get inherited method getinheritedmethod method string comment code generation codegeneration get method comment getmethodcomment method inherited method inheritedmethod line delimiter linedelimiter comment comment comment trim nls javadoc comment javadoccomment comment starts with startswith is first comment isfirstcomment document command method javadoc comment javadoccomment nls is java doc isjavadoc partition get length getlength document partition get offset getoffset equals javadoc comment javadoccomment is java doc isjavadoc prepare template comment preparetemplatecomment comment indentation method get java project getjavaproject line delimiter linedelimiter returns code code comment inserted code command offset code comment javadoc comment code ignore javadoc ignorejavadoc code code code member https bugs eclipse org bugs bug cgi don add parameters member comment param document document param command document command param member java member param ignore non javadoc ignorenonjavadoc code code javadoc code code comment java model exception javamodelexception accessing java model fails bad location exception badlocationexception accessing document fails is first comment isfirstcomment i document idocument document document command documentcommand command i member imember member ignore non javadoc ignorenonjavadoc bad location exception badlocationexception java model exception javamodelexception i region iregion partition text utilities textutilities get partition getpartition document f partitioning fpartitioning command offset i source range isourcerange source range sourcerange member get source range getsourcerange source range sourcerange src offset srcoffset source range sourcerange get offset getoffset src length srclength source range sourcerange get length getlength name relative offset namerelativeoffset member get name range getnamerange get offset getoffset src offset srcoffset partition relative offset partitionrelativeoffset partition get offset getoffset src offset srcoffset nls nls string token ignore non javadoc ignorenonjavadoc document src offset srcoffset src length srclength last index of lastindexof token name relative offset namerelativeoffset partition relative offset partitionrelativeoffset unindents type d typed slash forms comment param document param command indent after comment end indentaftercommentend i document idocument document command documentcommand offset get length getlength nls equals offset modify document command length offset bad location exception badlocationexception exc p excp guesses command operates newly created javadoc comment doubt assume javadoc param document document param command offset commandoffset command offset code code comment closed code code is new comment isnewcomment i document idocument document command offset commandoffset line index lineindex document get line of offset getlineofoffset command offset commandoffset line index lineindex document get number of lines getnumberoflines i region iregion document get line information getlineinformation line index lineindex i type d region itypedregion partition text utilities textutilities get partition getpartition document f partitioning fpartitioning command offset commandoffset partition end partitionend partition get offset getoffset partition get length getlength get offset getoffset partition end partitionend document get length getlength partition end partitionend partition document comment string comment document partition get offset getoffset partition get length getlength nls comment index of indexof enclosed comment comment bad location exception badlocationexception is smart mode issmartmode i workbench page iworkbenchpage java plugin javaplugin get active page getactivepage i editor part ieditorpart get active editor getactiveeditor i text editor extension itexteditorextension i text editor extension itexteditorextension extension i text editor extension itexteditorextension extension get insert mode getinsertmode i text editor extension itexteditorextension smart insert editor utility editorutility is compare editor input iscompareeditorinput get editor input geteditorinput i text editor extension itexteditorextension extension get adapter getadapter i text editor extension itexteditorextension extension extension get insert mode getinsertmode i text editor extension itexteditorextension smart insert i auto indent strategy iautoindentstrategy customize document command customizedocumentcommand override customize document command customizedocumentcommand i document idocument document document command documentcommand command is smart mode issmartmode command text command length string line delimiters linedelimiters document get legal line delimiters getlegallinedelimiters text utilities textutilities ends with endswith line delimiters linedelimiters command text ends delimiter line delimiters linedelimiters equals command text delimiter indent after new line indentafternewline document command nls command text equals indent after comment end indentaftercommentend document command returns method inherited code code method newly defined param method method written ancestor method code code java model exception javamodelexception accessing java model fails i method imethod get inherited method getinheritedmethod i method imethod method java model exception javamodelexception i type itype declaring type declaringtype method get declaring type getdeclaringtype method override tester methodoverridetester tester super type hierarchy cache supertypehierarchycache get method override tester getmethodoverridetester declaring type declaringtype tester find overridden method findoverriddenmethod method returns compilation unit compilation unit editor invoking code auto indent strategy autoindentstrategy code code code error compilation unit represented document i compilation unit icompilationunit get compilation unit getcompilationunit i workbench window iworkbenchwindow window platformui get workbench getworkbench get active workbench window getactiveworkbenchwindow window i workbench page iworkbenchpage window get active page getactivepage i editor part ieditorpart editor get active editor getactiveeditor editor i working copy manager iworkingcopymanager manager java plugin javaplugin get default getdefault get working copy manager getworkingcopymanager i compilation unit icompilationunit unit manager get working copy getworkingcopy editor get editor input geteditorinput unit unit