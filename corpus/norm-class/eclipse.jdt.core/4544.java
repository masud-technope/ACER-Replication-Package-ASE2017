copyright bea systems rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors wharley bea initial api implementation org eclipse jdt compiler apt tests processors base java print writer printwriter java string writer stringwriter java util list java util map javax lang model element annotation mirror annotationmirror javax lang model element annotation value annotationvalue javax lang model element executable element executableelement javax lang model element package element packageelement javax lang model element type element typeelement javax lang model element type parameter element typeparameterelement javax lang model element variable element variableelement javax lang model type type mirror typemirror javax lang model util element scanner elementscanner javax xml parsers document builder factory documentbuilderfactory javax xml parsers parser configuration exception parserconfigurationexception javax xml transform output keys outputkeys javax xml transform transformer javax xml transform transformer factory transformerfactory javax xml transform dom dom source domsource javax xml transform stream stream result streamresult org dom document org dom element org dom node generate xml representation language model gen erally generally require xml compare r xmlcomparer comp ares compares doc uments documents generated reference models tests xml converter xmlconverter element scanner elementscanner node ixml names ixmlnames document doc xml converter xmlconverter document doc doc doc convert xml dom document canonical string representation string xml to string xmltostring document model string writer stringwriter string writer stringwriter dom source domsource dom source domsource dom source domsource model stream result streamresult stream result streamresult stream result streamresult transformer factory transformerfactory transformer factory transformerfactory new instance newinstance transformer serializer serializer new transformer newtransformer serializer set output property setoutputproperty output keys outputkeys indent serializer set output property setoutputproperty http xml apache org xslt indent amount serializer transform dom source domsource stream result streamresult exception print stack trace printstacktrace print writer printwriter to string tostring convert xml dom document string representation suitable paste processor written java derived org eclipse jdt core tests util util display string displaystring string xml to cut and paste string xmltocutandpastestring document model indent shift string model as string modelasstring xml to string xmltostring model length model as string modelasstring length string buffer stringbuffer buffer string buffer stringbuffer length java util string tokenizer stringtokenizer tokenizer java util string tokenizer stringtokenizer model as string modelasstring indent buffer append shift indent buffer append tokenizer has more tokens hasmoretokens string token tokenizer next token nexttoken token equals buffer append tokenizer has more tokens hasmoretokens buffer append indent buffer append buffer append string buffer stringbuffer token buffer tokenbuffer string buffer stringbuffer token length token char at charat token buffer tokenbuffer append token buffer tokenbuffer append token buffer tokenbuffer append token buffer tokenbuffer append token buffer tokenbuffer append token buffer tokenbuffer append token buffer tokenbuffer append token buffer tokenbuffer append buffer append token buffer tokenbuffer to string tostring buffer append buffer to string tostring document convert model convertmodel iterable javax lang model element element declarations parser configuration exception parserconfigurationexception document builder factory documentbuilderfactory factory document builder factory documentbuilderfactory new instance newinstance document model factory new document builder newdocumentbuilder new document newdocument org dom element model node modelnode model create element createelement model tag xml converter xmlconverter converter xml converter xmlconverter model converter scan declarations model node modelnode model append child appendchild model node modelnode model override visit executable visitexecutable executable element executableelement node target element executable node executablenode doc create element createelement executable element tag executable node executablenode set attribute setattribute kind tag get kind getkind executable node executablenode set attribute setattribute sname tag get simple name getsimplename to string tostring convert annotation mirrors convertannotationmirrors executable node executablenode target append child appendchild executable node executablenode visit executable visitexecutable executable node executablenode javadoc javax lang model util element scanner elementscanner visit package visitpackage javax lang model element package element packageelement java lang object override visit package visitpackage package element packageelement node target todo implemented visit package visitpackage target javadoc javax lang model util element scanner elementscanner visit type visittype javax lang model element type element typeelement java lang object override visit type visittype type element typeelement node target element type node typenode doc create element createelement type element tag type node typenode set attribute setattribute kind tag get kind getkind type node typenode set attribute setattribute sname tag get simple name getsimplename to string tostring type node typenode set attribute setattribute qname tag get qualified name getqualifiedname to string tostring convert superclass convertsuperclass type node typenode convert interfaces convertinterfaces type node typenode convert annotation mirrors convertannotationmirrors type node typenode target append child appendchild type node typenode scan type subtypes fields methods visit type visittype type node typenode javadoc javax lang model util element scanner elementscanner visit type parameter visittypeparameter javax lang model element type parameter element typeparameterelement java lang object override visit type parameter visittypeparameter type parameter element typeparameterelement node target todo implemented visit type parameter visittypeparameter target javadoc javax lang model util element scanner elementscanner visit variable visitvariable javax lang model element variable element variableelement java lang object override visit variable visitvariable variable element variableelement node target element variable node variablenode doc create element createelement variable element tag variable node variablenode set attribute setattribute kind tag get kind getkind variable node variablenode set attribute setattribute sname tag get simple name getsimplename to string tostring todo spec res trict restrict to string tostring implementation variable node variablenode set attribute setattribute type tag as type astype to string tostring convert annotation mirrors convertannotationmirrors variable node variablenode target append child appendchild variable node variablenode variables enclose elements call convert annotation mirrors convertannotationmirrors javax lang model element element node target list annotation mirror annotationmirror mirrors get annotation mirrors getannotationmirrors mirrors mirrors is empty isempty element annotations node annotationsnode doc create element createelement annotations tag annotation mirror annotationmirror mirrors convert annotation mirror convertannotationmirror annotations node annotationsnode target append child appendchild annotations node annotationsnode scan annotation instance model represent xml including explicit values values param annotation mirror converted param target annotations xml node annotation node convert annotation mirror convertannotationmirror annotation mirror annotationmirror node target javax lang model element element anno element annoelement get annotation type getannotationtype as element aselement anno element annoelement element anno node annonode doc create element createelement annotation tag string sname get annotation type getannotationtype as element aselement get simple name getsimplename to string tostring anno node annonode set attribute setattribute sname tag sname map executable element executableelement annotation value annotationvalue values get element values getelementvalues values size element values node valuesnode doc create element createelement annotation values tag anno node annonode append child appendchild values node valuesnode map entry executable element executableelement annotation value annotationvalue entry values entry set entryset annotation value annotationvalue value holder valueholder entry get value getvalue value holder valueholder object value holder valueholder get value getvalue element value node valuenode doc create element createelement annotation tag value node valuenode set attribute setattribute member tag entry get key getkey get simple name getsimplename to string tostring value node valuenode set attribute setattribute type tag get class getclass get name getname value node valuenode set attribute setattribute tag to string tostring values node valuesnode append child appendchild value node valuenode target append child appendchild anno node annonode scan type extended implemented interfaces represent xml param target node representing type interfaces node child node interfaces convert interfaces convertinterfaces type element typeelement node target list type mirror typemirror interfaces get interfaces getinterfaces interfaces interfaces is empty isempty element interfaces node interfacesnode doc create element createelement interfaces tag type mirror typemirror int fc intfc interfaces convert type mirror converttypemirror int fc intfc interfaces node interfacesnode target append child appendchild interfaces node interfacesnode create node representing declaration superclass param tm super tmsuper param target convert superclass convertsuperclass type element typeelement node target type mirror typemirror tm super tmsuper get superclass getsuperclass tm super tmsuper element node doc create element createelement superclass tag convert type mirror converttypemirror tm super tmsuper node target append child appendchild node represent arbitrary type mirror typemirror xml append child parent node note problem atic problematic type mirror typemirror ways can onicalize canonicalize arbitrary err oneous erroneous type param param target parent xml node node appended convert type mirror converttypemirror type mirror typemirror node target element doc create element createelement type mirror tag set attribute setattribute kind tag get kind getkind set attribute setattribute string tag to string tostring todo walk type variables target append child appendchild