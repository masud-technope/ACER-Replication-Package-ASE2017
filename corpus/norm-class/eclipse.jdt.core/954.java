copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal compiler parser java util list org eclipse jdt core compiler char operation charoperation org eclipse jdt core compiler invalid input exception invalidinputexception org eclipse jdt internal compiler ast org eclipse jdt internal compiler class fmt classfmt class file constants classfileconstants org eclipse jdt internal compiler util util parser special ized specialized decoding javadoc comments javadoc parser javadocparser abstract comment parser abstractcommentparser fields javadoc doc comment doccomment bug https bugs eclipse org bugs bug cgi store param references tag invalid syntax invalid param references ptr invalidparamreferencesptr ast node astnode invalid param references stack invalidparamreferencesstack bug https bugs eclipse org bugs bug cgi store tag positions valid value positions validvaluepositions invalid value positions invalidvaluepositions returns javadoc parser javadocparser report errors overrides report problems reportproblems https bugs eclipse org bugs bug cgi should report problems shouldreportproblems flag parser current tag waiting description https bugs eclipse org bugs bug cgi tag waiting for description tagwaitingfordescription javadoc parser javadocparser parser source parser sourceparser source parser sourceparser kind compil parser text verif source parser sourceparser source parser sourceparser options set javadoc positions setjavadocpositions source parser sourceparser options process annotations processannotations javadoc returns tag deprecated javadoc comment javadoc checking enabled construct javadoc node stored parser javadoc slot consumed check deprecation checkdeprecation comment ptr commentptr store javadoc positions javadoc start javadocstart source parser sourceparser scanner comment starts commentstarts comment ptr commentptr javadoc end javadocend source parser sourceparser scanner comment s to ps commentstops comment ptr commentptr first tag position firsttagposition source parser sourceparser scanner comment tag starts commenttagstarts comment ptr commentptr valid value positions validvaluepositions invalid value positions invalidvaluepositions tag waiting for description tagwaitingfordescription tag init javadoc check doc comment checkdoccomment doc comment doccomment javadoc javadoc start javadocstart javadoc end javadocend set javadoc positions setjavadocpositions https bugs eclipse org bugs bug cgi annotation processors javadoc object required resolved doc comment doccomment javadoc javadoc start javadocstart javadoc end javadocend doc comment doccomment bits ast node astnode resolve javadoc resolvejavadoc doc comment doccomment tag javadoc parsing first tag position firsttagposition kind parser kind compil parser source parser parse source source parser sourceparser scanner source updating source scanner scanner set source setsource source check doc comment checkdoccomment initialization scanner line ends lineends source parser sourceparser scanner line ends lineends scanner line ptr lineptr source parser sourceparser scanner line ptr lineptr line ends lineends scanner line ends lineends comment parse commentparse parse comment scanner source scanner sourcescanner source parser sourceparser scanner first line number firstlinenumber util get line number getlinenumber javadoc start javadocstart source scanner sourcescanner line ends lineends source scanner sourcescanner line ptr lineptr last line number lastlinenumber util get line number getlinenumber javadoc end javadocend source scanner sourcescanner line ends lineends source scanner sourcescanner line ptr lineptr javadoc start javadocstart scan tags lines deprecated next line nextline first line number firstlinenumber last line number lastlinenumber line start linestart first line number firstlinenumber skip leading javadoc start javadocstart source parser sourceparser scanner get line start getlinestart line start linestart line end lineend last line number lastlinenumber remove trailing javadoc end javadocend source parser sourceparser scanner get line end getlineend next character nextcharacter line end lineend unicodes read char readchar form feed space horizontal tab ulation tabulation feed space characters next character nextcharacter parse simple tag parsesimpletag tag value tagvalue tag deprecated abort next character nextcharacter next line nextline deprecated release source finished source release source scanner scanner set source setsource deprecated javadoc org eclipse jdt internal compiler parser abstract comment parser abstractcommentparser create argument reference createargumentreference java lang object object create argument reference createargumentreference dim is varargs isvarargs object type ref typeref dim positions dimpositions arg name pos argnamepos invalid input exception invalidinputexception type reference typereference arg type ref argtyperef type reference typereference type ref typeref dim pos arg type ref argtyperef source start sourcestart arg type ref argtyperef source end sourceend type ref typeref javadoc single type reference javadocsingletypereference javadoc single type reference javadocsingletypereference single ref singleref javadoc single type reference javadocsingletypereference type ref typeref arg type ref argtyperef javadoc array single type reference javadocarraysingletypereference single ref singleref token dim pos javadoc qualified type reference javadocqualifiedtypereference qualif ref qualifref javadoc qualified type reference javadocqualifiedtypereference type ref typeref arg type ref argtyperef javadoc array qualified type reference javadocarrayqualifiedtypereference qualif ref qualifref dim arg end argend arg type ref argtyperef source end sourceend dim arg end argend dim positions dimpositions dim is varargs isvarargs is var args isvarargs arg type ref argtyperef bits is var args isvarargs ast node astnode is var args isvarargs arg name pos argnamepos arg end argend arg name pos argnamepos javadoc argument expression javadocargumentexpression arg type ref argtyperef source start sourcestart arg end argend arg type ref argtyperef class cast exception classcastexception invalid input exception invalidinputexception javadoc org eclipse jdt internal compiler parser abstract comment parser abstractcommentparser create field reference createfieldreference object create field reference createfieldreference object receiver invalid input exception invalidinputexception receiver type type reference typereference type ref typeref type reference typereference receiver type ref typeref source parser sourceparser compilation unit compilationunit get main type name getmaintypename type ref typeref javadoc implicit type reference javadocimplicittypereference member start memberstart create field javadoc field reference javadocfieldreference field javadoc field reference javadocfieldreference identifier stack identifierstack identifier position stack identifierpositionstack field receiver type ref typeref field tag source start tagsourcestart tag source start tagsourcestart field tag source end tagsourceend tag source end tagsourceend field tag value tagvalue tag value tagvalue field class cast exception classcastexception invalid input exception invalidinputexception javadoc org eclipse jdt internal compiler parser abstract comment parser abstractcommentparser create method reference createmethodreference java lang object object create method reference createmethodreference object receiver list arguments invalid input exception invalidinputexception receiver type type reference typereference type ref typeref type reference typereference receiver decide constructor is constructor isconstructor member constructor reference length identifier length stack identifierlengthstack type ref typeref source parser sourceparser compilation unit compilationunit get main type name getmaintypename type declaration typedeclaration type decl typedecl get parse d type declaration getparsedtypedeclaration type decl typedecl type decl typedecl is constructor isconstructor char operation charoperation equals identifier stack identifierstack length type ref typeref javadoc implicit type reference javadocimplicittypereference member start memberstart type ref typeref javadoc single type reference javadocsingletypereference javadoc single type reference javadocsingletypereference type ref typeref token is constructor isconstructor char operation charoperation equals identifier stack identifierstack length type ref typeref javadoc qualified type reference javadocqualifiedtypereference tokens javadoc qualified type reference javadocqualifiedtypereference type ref typeref tokens tokens length is constructor isconstructor char operation charoperation equals identifier stack identifierstack length tokens is constructor isconstructor valid valid length valid valid char operation charoperation equals identifier stack identifierstack tokens valid report problems reportproblems source parser sourceparser problem reporter problemreporter javadoc invalid member type qualification javadocinvalidmembertypequalification identifier position stack identifierpositionstack identifier position stack identifierpositionstack length invalid input exception invalidinputexception create node arguments is constructor isconstructor javadoc allocation expression javadocallocationexpression allocation javadoc allocation expression javadocallocationexpression identifier position stack identifierpositionstack length allocation type type ref typeref allocation tag value tagvalue tag value tagvalue allocation source end sourceend scanner get current token end position getcurrenttokenendposition length allocation qualification identifier stack identifierstack system arraycopy identifier stack identifierstack allocation qualification length length allocation source start sourcestart identifier position stack identifierpositionstack allocation member start memberstart member start memberstart allocation javadoc message send javadocmessagesend msg javadoc message send javadocmessagesend identifier stack identifierstack length identifier position stack identifierpositionstack length msg receiver type ref typeref msg tag value tagvalue tag value tagvalue msg source end sourceend scanner get current token end position getcurrenttokenendposition msg javadoc argument expression javadocargumentexpression expressions javadoc argument expression javadocargumentexpression arguments size arguments to array toarray expressions is constructor isconstructor javadoc allocation expression javadocallocationexpression allocation javadoc allocation expression javadocallocationexpression identifier position stack identifierpositionstack length allocation arguments expressions allocation type type ref typeref allocation tag value tagvalue tag value tagvalue allocation source end sourceend scanner get current token end position getcurrenttokenendposition length allocation qualification identifier stack identifierstack system arraycopy identifier stack identifierstack allocation qualification length length allocation source start sourcestart identifier position stack identifierpositionstack allocation member start memberstart member start memberstart allocation javadoc message send javadocmessagesend msg javadoc message send javadocmessagesend identifier stack identifierstack length identifier position stack identifierpositionstack length expressions msg receiver type ref typeref msg tag value tagvalue tag value tagvalue msg source end sourceend scanner get current token end position getcurrenttokenendposition msg class cast exception classcastexception invalid input exception invalidinputexception javadoc org eclipse jdt internal compiler parser abstract comment parser abstractcommentparser create return statement createreturnstatement object create return statement createreturnstatement javadoc return statement javadocreturnstatement scanner get current token start position getcurrenttokenstartposition scanner get current token end position getcurrenttokenendposition javadoc org eclipse jdt internal compiler parser abstract comment parser abstractcommentparser parse tag name parsetagname create tag createtag tag value tagvalue tag javadoc org eclipse jdt internal compiler parser abstract comment parser abstractcommentparser create type reference createtypereference object create type reference createtypereference primitive token primitivetoken type reference typereference type ref typeref size identifier length stack identifierlengthstack identifier length ptr identifierlengthptr single type size type ref typeref javadoc single type reference javadocsingletypereference identifier stack identifierstack identifier ptr identifierptr identifier position stack identifierpositionstack identifier ptr identifierptr tag source start tagsourcestart tag source end tagsourceend qualified type size tokens size system arraycopy identifier stack identifierstack identifier ptr identifierptr size tokens size positions size system arraycopy identifier position stack identifierpositionstack identifier ptr identifierptr size positions size type ref typeref javadoc qualified type reference javadocqualifiedtypereference tokens positions tag source start tagsourcestart tag source end tagsourceend type ref typeref current parsed type declaration type declaration typedeclaration get parse d type declaration getparsedtypedeclaration ptr source parser sourceparser ast ptr astptr ptr object node source parser sourceparser ast stack aststack ptr node type declaration typedeclaration type declaration typedeclaration type decl typedecl type declaration typedeclaration node type declaration curr enly currenly parsed type decl typedecl body end bodyend type decl typedecl ptr parse tag declaration flag missing description option enabled parse throws parsethrows valid parse throws parsethrows tag waiting for description tagwaitingfordescription valid report problems reportproblems tag tag valid parse tag declaration parse return parsereturn return statement returnstatement return statement returnstatement create return statement createreturnstatement report problems reportproblems source parser sourceparser problem reporter problemreporter javadoc duplicate d return tag javadocduplicatedreturntag scanner get current token start position getcurrenttokenstartposition scanner get current token end position getcurrenttokenendposition parse simple tag parsesimpletag read read char readchar code inlined balance additional method call check depr ectation checkdeprectation source source pos source scanner helper scannerhelper get hexadecimal value gethexadecimalvalue source scanner helper scannerhelper get hexadecimal value gethexadecimalvalue source scanner helper scannerhelper get hexadecimal value gethexadecimalvalue source scanner helper scannerhelper get hexadecimal value gethexadecimalvalue source pos read char readchar read char readchar read char readchar read char readchar read char readchar read char readchar read char readchar read char readchar read char readchar read char readchar scanner helper scannerhelper is whitespace iswhitespace abort deprecated tag value tagvalue tag deprecated parse tag parsetag previous position previousposition invalid input exception invalidinputexception tag waiting for description tagwaitingfordescription tag param tag inline tag started inlinetagstarted start identifier position stack identifierpositionstack identifier position stack identifierpositionstack identifier ptr identifierptr source parser sourceparser problem reporter problemreporter javadoc missing tag description after reference javadocmissingtagdescriptionafterreference start source parser sourceparser modifiers tag inline tag started inlinetagstarted source parser sourceparser problem reporter problemreporter javadoc missing tag description javadocmissingtagdescription tag names tag waiting for description tagwaitingfordescription tag source start tagsourcestart tag source end tagsourceend source parser sourceparser modifiers tag waiting for description tagwaitingfordescription tag tag source start tagsourcestart tag source end tagsourceend previous position previousposition scanner start position startposition current position currentposition first char firstchar read char readchar first char firstchar report problems reportproblems source parser sourceparser problem reporter problemreporter javadoc invalid tag javadocinvalidtag previous position previousposition current position currentposition text start textstart text start textstart current position currentposition scanner current character currentcharacter first char firstchar scanner helper scannerhelper is whitespace iswhitespace first char firstchar report problems reportproblems source parser sourceparser problem reporter problemreporter javadoc invalid tag javadocinvalidtag previous position previousposition current position currentposition text start textstart text start textstart current position currentposition scanner current character currentcharacter first char firstchar tag name tagname length current char currentchar first char firstchar tag name length tagnamelength tag name tagname length valid tag validtag tag loop tagloop length tag name length tagnamelength system arraycopy tag name tagname tag name tagname tag name length tagnamelength tag name length tagnamelength tag name length tagnamelength tag name tagname length tag name tagname length current char currentchar current position currentposition current char currentchar read char readchar current char currentchar tag loop tagloop valid tag validtag scanner helper scannerhelper is whitespace iswhitespace current char currentchar tag loop tagloop tag source end tagsourceend current position currentposition scanner current character currentcharacter current char currentchar scanner current position currentposition current position currentposition tag source end tagsourceend valid tag validtag report problems reportproblems source parser sourceparser problem reporter problemreporter javadoc invalid tag javadocinvalidtag tag source start tagsourcestart tag source end tagsourceend text start textstart text start textstart scanner current character currentcharacter current char currentchar tag value tagvalue tag valid first char firstchar length tag author length char operation charoperation equals tag author tag name tagname length tag value tagvalue tag author tag waiting for description tagwaitingfordescription tag value tagvalue length tag category length char operation charoperation equals tag category tag name tagname length tag value tagvalue tag category inline tag started inlinetagstarted valid parse identifier tag parseidentifiertag length tag code length inline tag started inlinetagstarted char operation charoperation equals tag code tag name tagname length tag value tagvalue tag code tag waiting for description tagwaitingfordescription tag value tagvalue length tag deprecated length char operation charoperation equals tag deprecated tag name tagname length deprecated valid tag value tagvalue tag deprecated tag waiting for description tagwaitingfordescription tag value tagvalue length tag doc root length char operation charoperation equals tag doc root tag name tagname length valid tag value tagvalue tag doc root length tag exception length char operation charoperation equals tag exception tag name tagname length tag value tagvalue tag exception inline tag started inlinetagstarted valid parse throws parsethrows length tag inheritdoc length char operation charoperation equals tag inheritdoc tag name tagname length last block tag value lastblocktagvalue tag tag tag exception tag param tag valid report problems reportproblems record inherited position recordinheritedposition tag source start tagsourcestart tag source end tagsourceend inline tag started inlinetagstarted parse inherit doc tag parseinheritdoctag valid report problems reportproblems source parser sourceparser problem reporter problemreporter javadoc unexpected tag javadocunexpectedtag tag source start tagsourcestart tag source end tagsourceend tag value tagvalue tag inheritdoc length tag link length char operation charoperation equals tag link tag name tagname length tag value tagvalue tag link inline tag started inlinetagstarted kind completion parser valid parse reference parsereference length tag linkplain length char operation charoperation equals tag linkplain tag name tagname length tag value tagvalue tag linkplain inline tag started inlinetagstarted valid parse reference parsereference length tag literal length inline tag started inlinetagstarted char operation charoperation equals tag literal tag name tagname length tag value tagvalue tag literal tag waiting for description tagwaitingfordescription tag value tagvalue length tag param length char operation charoperation equals tag param tag name tagname length tag value tagvalue tag param inline tag started inlinetagstarted valid parse param parseparam length tag length char operation charoperation equals tag tag name tagname length tag value tagvalue tag inline tag started inlinetagstarted valid parse return parsereturn length tag length char operation charoperation equals tag tag name tagname length tag value tagvalue tag inline tag started inlinetagstarted valid parse reference parsereference length tag serial length char operation charoperation equals tag serial tag name tagname length tag value tagvalue tag serial tag waiting for description tagwaitingfordescription tag value tagvalue length tag serial data length char operation charoperation equals tag serial data tag name tagname length tag value tagvalue tag serial data tag waiting for description tagwaitingfordescription tag value tagvalue length tag serial field length char operation charoperation equals tag serial field tag name tagname length tag value tagvalue tag serial field tag waiting for description tagwaitingfordescription tag value tagvalue length tag length char operation charoperation equals tag tag name tagname length tag value tagvalue tag tag waiting for description tagwaitingfordescription tag value tagvalue length tag length char operation charoperation equals tag tag name tagname length tag value tagvalue tag inline tag started inlinetagstarted valid parse throws parsethrows length tag length char operation charoperation equals tag tag name tagname length tag value tagvalue tag source level sourcelevel class file constants classfileconstants jdk inline tag started inlinetagstarted valid parse reference parsereference valid value positions validvaluepositions invalid value positions invalidvaluepositions report problems reportproblems source parser sourceparser problem reporter problemreporter javadoc unexpected tag javadocunexpectedtag invalid value positions invalidvaluepositions invalid value positions invalidvaluepositions valid valid value positions validvaluepositions tag source start tagsourcestart tag source end tagsourceend invalid value positions invalidvaluepositions invalid value positions invalidvaluepositions tag source start tagsourcestart tag source end tagsourceend report problems reportproblems source parser sourceparser problem reporter problemreporter javadoc unexpected tag javadocunexpectedtag tag source start tagsourcestart tag source end tagsourceend length tag version length char operation charoperation equals tag version tag name tagname length tag value tagvalue tag version tag waiting for description tagwaitingfordescription tag value tagvalue create tag createtag create tag createtag text start textstart tag value tagvalue tag inline tag started inlinetagstarted last block tag value lastblocktagvalue tag value tagvalue inline tag started inlinetagstarted javadoc tag type tag value tagvalue tag type block inline tag started inlinetagstarted javadoc tag type tag value tagvalue tag type inline valid tag value tagvalue tag tag waiting for description tagwaitingfordescription tag report problems reportproblems source parser sourceparser problem reporter problemreporter javadoc unexpected tag javadocunexpectedtag tag source start tagsourcestart tag source end tagsourceend valid parse inherit doc tag parseinheritdoctag parse param parseparam invalid input exception invalidinputexception valid parse param parseparam tag waiting for description tagwaitingfordescription valid report problems reportproblems tag param tag valid push param name pushparamname is type param istypeparam ast node astnode name ref nameref is type param istypeparam javadoc single type reference javadocsingletypereference javadoc single type reference javadocsingletypereference identifier stack identifierstack identifier position stack identifierpositionstack tag source start tagsourcestart tag source end tagsourceend name ref nameref javadoc single name reference javadocsinglenamereference javadoc single name reference javadocsinglenamereference identifier stack identifierstack identifier position stack identifierpositionstack tag source start tagsourcestart tag source end tagsourceend name ref nameref ast length ptr astlengthptr push on ast stack pushonaststack name ref nameref is type param istypeparam tag expected order ast length ptr astlengthptr ordered tags number ast length stack astlengthstack report problems reportproblems source parser sourceparser problem reporter problemreporter javadoc unexpected tag javadocunexpectedtag tag source start tagsourcestart tag source end tagsourceend invalid param references ptr invalidparamreferencesptr invalid param references stack invalidparamreferencesstack javadoc single name reference javadocsinglenamereference stack length stacklength invalid param references stack invalidparamreferencesstack length invalid param references ptr invalidparamreferencesptr stack length stacklength system arraycopy invalid param references stack invalidparamreferencesstack invalid param references stack invalidparamreferencesstack javadoc single name reference javadocsinglenamereference stack length stacklength ast stack increment stack length stacklength invalid param references stack invalidparamreferencesstack invalid param references ptr invalidparamreferencesptr name ref nameref ast length ptr astlengthptr ordered tags number param tag expected order push on ast stack pushonaststack name ref nameref tag expected order push on ast stack pushonaststack name ref nameref push see ref pushseeref object statement ast length ptr astlengthptr push on ast stack pushonaststack push on ast stack pushonaststack push on ast stack pushonaststack statement ast length ptr astlengthptr ordered tags number param tag expected order push on ast stack pushonaststack push on ast stack pushonaststack statement tag expected order push on ast stack pushonaststack statement tag expected order push on ast stack pushonaststack statement push text pushtext start tag waiting for description tagwaitingfordescription tag push throw name pushthrowname object type ref typeref ast length ptr astlengthptr push on ast stack pushonaststack push on ast stack pushonaststack type ref typeref ast length ptr astlengthptr ordered tags number param tag expected order push on ast stack pushonaststack type ref typeref tag expected order push on ast stack pushonaststack type ref typeref tag expected order push on ast stack pushonaststack push on ast stack pushonaststack type ref typeref refresh inline tag position refreshinlinetagposition previous position previousposition tag waiting for description tagwaitingfordescription tag source parser sourceparser problem reporter problemreporter javadoc missing tag description javadocmissingtagdescription tag names tag waiting for description tagwaitingfordescription tag source start tagsourcestart tag source end tagsourceend source parser sourceparser modifiers tag waiting for description tagwaitingfordescription tag refresh return statement refreshreturnstatement javadoc return statement javadocreturnstatement return statement returnstatement bits ast node astnode empty string to string tostring string buffer stringbuffer buffer string buffer stringbuffer buffer append check javadoc append check doc comment checkdoccomment append buffer append javadoc append doc comment doccomment append buffer append to string tostring buffer to string tostring update doc comment updatedoccomment tag waiting for description tagwaitingfordescription tag param tag inline tag started inlinetagstarted start identifier position stack identifierpositionstack identifier position stack identifierpositionstack identifier ptr identifierptr source parser sourceparser problem reporter problemreporter javadoc missing tag description after reference javadocmissingtagdescriptionafterreference start source parser sourceparser modifiers tag inline tag started inlinetagstarted source parser sourceparser problem reporter problemreporter javadoc missing tag description javadocmissingtagdescription tag names tag waiting for description tagwaitingfordescription tag source start tagsourcestart tag source end tagsourceend source parser sourceparser modifiers tag waiting for description tagwaitingfordescription tag inherited positions inheritedpositions inherited positions ptr inheritedpositionsptr inherited positions inheritedpositions length system arraycopy inherited positions inheritedpositions inherited positions inheritedpositions inherited positions ptr inheritedpositionsptr inherited positions ptr inheritedpositionsptr doc comment doccomment inherited positions inheritedpositions inherited positions inheritedpositions doc comment doccomment value positions valuepositions valid value positions validvaluepositions valid value positions validvaluepositions invalid value positions invalidvaluepositions return statement returnstatement doc comment doccomment return statement returnstatement javadoc return statement javadocreturnstatement return statement returnstatement invalid param references ptr invalidparamreferencesptr doc comment doccomment invalid parameters invalidparameters javadoc single name reference javadocsinglenamereference invalid param references ptr invalidparamreferencesptr system arraycopy invalid param references stack invalidparamreferencesstack doc comment doccomment invalid parameters invalidparameters invalid param references ptr invalidparamreferencesptr ast length ptr astlengthptr sizes ordered tags number ast length ptr astlengthptr sizes ordered tags number ast length stack astlengthstack doc comment doccomment see references seereferences expression sizes tag expected order doc comment doccomment exception references exceptionreferences type reference typereference sizes tag expected order param ref ptr paramrefptr sizes param tag expected order doc comment doccomment param references paramreferences javadoc single name reference javadocsinglenamereference param ref ptr paramrefptr param type param ptr paramtypeparamptr sizes param tag expected order doc comment doccomment param type parameters paramtypeparameters javadoc single type reference javadocsingletypereference param type param ptr paramtypeparamptr ast length ptr astlengthptr ptr ast length ptr astlengthptr ordered tags number ptr tag expected order size ast length stack astlengthstack ast length ptr astlengthptr size doc comment doccomment see references seereferences sizes ptr expression ast stack aststack ast ptr astptr tag expected order size ast length stack astlengthstack ast length ptr astlengthptr size doc comment doccomment exception references exceptionreferences sizes ptr type reference typereference ast stack aststack ast ptr astptr param tag expected order size ast length stack astlengthstack ast length ptr astlengthptr size expression reference expression ast stack aststack ast ptr astptr reference javadoc single name reference javadocsinglenamereference doc comment doccomment param references paramreferences param ref ptr paramrefptr javadoc single name reference javadocsinglenamereference reference reference javadoc single type reference javadocsingletypereference doc comment doccomment param type parameters paramtypeparameters param type param ptr paramtypeparamptr javadoc single type reference javadocsingletypereference reference param ref ptr paramrefptr doc comment doccomment param type parameters paramtypeparameters names references param type param ptr paramtypeparamptr doc comment doccomment param references paramreferences references resize arrays size sizes param tag expected order system arraycopy doc comment doccomment param references paramreferences param ref ptr paramrefptr doc comment doccomment param references paramreferences javadoc single name reference javadocsinglenamereference size param ref ptr paramrefptr size param ref ptr paramrefptr system arraycopy doc comment doccomment param type parameters paramtypeparameters param type param ptr paramtypeparamptr doc comment doccomment param type parameters paramtypeparameters javadoc single type reference javadocsingletypereference size param type param ptr paramtypeparamptr size param type param ptr paramtypeparamptr