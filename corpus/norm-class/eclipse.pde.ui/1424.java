copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation david carver star bug org eclipse pde internal core schema java java net java util org eclipse core runtime org eclipse pde core org eclipse pde core plugin i plugin base ipluginbase org eclipse pde core plugin i plugin model base ipluginmodelbase org eclipse pde internal core org eclipse pde internal core ischema org eclipse pde internal core util org dom org xml sax sax exception saxexception schema platform object platformobject i schema ischema url furl listener list listenerlist f listeners flisteners listener list listenerlist vector i schema element ischemaelement f elements felements vector i schema element ischemaelement vector document section documentsection f doc sections fdocsections vector document section documentsection vector i schema include ischemainclude f includes fincludes string f point d fpointid string f plugin d fpluginid i schema descriptor ischemadescriptor f schema descriptor fschemadescriptor f loaded floaded vector schema element reference schemaelementreference f references freferences string f description fdescription f target version ftargetversion nls string f name fname f notification enabled fnotificationenabled nls string indent f disposed fdisposed f valid fvalid f abbreviated fabbreviated list i path ipath f search path fsearchpath schema string plugin id pluginid string point id pointid string abbreviated f plugin d fpluginid plugin id pluginid f point d fpointid point id pointid f name fname f abbreviated fabbreviated abbreviated schema i schema descriptor ischemadescriptor schema descriptor schemadescriptor url url abbreviated f schema descriptor fschemadescriptor schema descriptor schemadescriptor furl url f abbreviated fabbreviated abbreviated add document section adddocumentsection document section documentsection doc section docsection f doc sections fdocsections add doc section docsection fire model changed firemodelchanged model changed event modelchangedevent i model changed event imodelchangedevent insert object doc section docsection add element addelement i schema element ischemaelement element add element addelement element add element addelement i schema element ischemaelement element i schema element ischemaelement after element afterelement after element afterelement f elements felements index of indexof after element afterelement f elements felements add element f elements felements add element fire model changed firemodelchanged model changed event modelchangedevent i model changed event imodelchangedevent insert object element add include addinclude i schema include ischemainclude include f includes fincludes f includes fincludes vector i schema include ischemainclude f includes fincludes add include fire model changed firemodelchanged model changed event modelchangedevent i model changed event imodelchangedevent insert object include remove include removeinclude i schema include ischemainclude include f includes fincludes f includes fincludes remove include fire model changed firemodelchanged model changed event modelchangedevent i model changed event imodelchangedevent remove object include override add model changed listener addmodelchangedlistener i model changed listener imodelchangedlistener listener f listeners flisteners add listener collect elements collectelements i schema compositor ischemacompositor compositor vector object result object children compositor get children getchildren children length object child children child i schema compositor ischemacompositor collect elements collectelements i schema compositor ischemacompositor child result child i schema object reference ischemaobjectreference i schema object reference ischemaobjectreference i schema object reference ischemaobjectreference child object referenced get referenced object getreferencedobject referenced i schema element ischemaelement result add element addelement referenced override dispose f includes fincludes f includes fincludes size i schema include ischemainclude include f includes fincludes include dispose reset f disposed fdisposed override i schema element ischemaelement find element findelement string is loaded isloaded load f elements felements size i schema element ischemaelement element f elements felements element get name getname equals element f includes fincludes f includes fincludes size i schema include ischemainclude include f includes fincludes i schema ischema ischema include get included schema getincludedschema ischema i schema element ischemaelement element ischema find element findelement element element override fire model changed firemodelchanged i model changed event imodelchangedevent event f notification enabled fnotificationenabled object listeners f listeners flisteners get listeners getlisteners listeners length i model changed listener imodelchangedlistener listeners model changed modelchanged event override fire model object changed firemodelobjectchanged object object string property object old value oldvalue object new value newvalue fire model changed firemodelchanged model changed event modelchangedevent object property old value oldvalue new value newvalue string get attribute getattribute node node string name d node map namednodemap map node get attributes getattributes node att node attnode map get name d item getnameditem att node attnode string att node attnode get node value getnodevalue length override i schema element ischemaelement get candidate children getcandidatechildren i schema element ischemaelement element vector object candidates vector object i schema type ischematype type element get type gettype type i schema complex type ischemacomplextype i schema compositor ischemacompositor compositor i schema complex type ischemacomplextype type get compositor getcompositor compositor collect elements collectelements compositor candidates i schema element ischemaelement result i schema element ischemaelement candidates size candidates copy into copyinto result result override string get description getdescription f description fdescription override is valid isvalid f valid fvalid override i document section idocumentsection get document sections getdocumentsections f doc sections fdocsections to array toarray i document section idocumentsection f doc sections fdocsections size override get element count getelementcount f elements felements size override get resolved element count getresolvedelementcount local count localcount get element count getelementcount f includes fincludes local count localcount total count totalcount local count localcount f includes fincludes size i schema include ischemainclude include f includes fincludes i schema ischema schema include get included schema getincludedschema schema total count totalcount schema get resolved element count getresolvedelementcount total count totalcount override i schema element ischemaelement get elements getelements is loaded isloaded load f elements felements to array toarray i schema element ischemaelement f elements felements size override string get element names getelementnames i schema element ischemaelement elements get elements getelements string names string elements length elements length names elements get name getname names override suppress warnings suppresswarnings unchecked i schema element ischemaelement get resolved elements getresolvedelements f includes fincludes get elements getelements is loaded isloaded load suppress warnings suppresswarnings rawtypes vector result vector f elements felements clone f includes fincludes size i schema include ischemainclude include f includes fincludes i schema ischema schema include get included schema getincludedschema schema i schema element ischemaelement ielements schema get elements getelements ielements length result add ielements i schema element ischemaelement result to array toarray i schema element ischemaelement result size override i schema include ischemainclude get includes getincludes f includes fincludes i schema include ischemainclude f includes fincludes to array toarray i schema include ischemainclude f includes fincludes size override string get name getname f name fname string get normalized text getnormalizedtext string source source nls string result source replace result result trim result override i schema object ischemaobject get parent getparent override set parent setparent i schema object ischemaobject obj i schema element ischemaelement get element at getelementat f elements felements override string get qualified point id getqualifiedpointid nls f plugin d fpluginid f point d fpointid override string get plugin id getpluginid f plugin d fpluginid override string get point id getpointid f point d fpointid override i schema ischema get schema getschema override i schema descriptor ischemadescriptor get schema descriptor getschemadescriptor f schema descriptor fschemadescriptor override url geturl furl index of indexof object obj f elements felements index of indexof obj override is disposed isdisposed f disposed fdisposed override is editable iseditable is loaded isloaded f loaded floaded is notification enabled isnotificationenabled f notification enabled fnotificationenabled load url connection urlconnection connection input stream inputstream input connection schema util schemautil geturlconnection furl input connection get input stream getinputstream load input file not found exception filenotfoundexception f loaded floaded io exception ioexception pde core pdecore log exception logexception input input close connection jarurlconnection jarurlconnection connection get jar file getjarfile close io exception ioexception load input stream inputstream stream sax parser wrapper saxparserwrapper parser sax parser wrapper saxparserwrapper xml default handler xmldefaulthandler handler xml default handler xmldefaulthandler f abbreviated fabbreviated parser parse stream handler traverse document tree traversedocumenttree handler get document element getdocumentelement sax exception saxexception io exception ioexception pde core pdecore log exception logexception io exception ioexception reading url furl exception pde core pdecore log exception logexception i schema attribute ischemaattribute process attribute processattribute i schema element ischemaelement element node element node elementnode nls string aname get attribute getattribute element node elementnode aname nls string atype get attribute getattribute element node elementnode type nls string ause get attribute getattribute element node elementnode nls string avalue get attribute getattribute element node elementnode i schema simple type ischemasimpletype type atype type i schema simple type ischemasimpletype resolve type reference resolvetypereference atype schema attribute schemaattribute attribute schema attribute schemaattribute element aname attribute bind source location bindsourcelocation element node elementnode line table linetable ause i schema attribute ischemaattribute optional nls ause equals required i schema attribute ischemaattribute required nls ause equals optional i schema attribute ischemaattribute optional nls ause equals i schema attribute ischemaattribute attribute set use setuse avalue attribute set value setvalue avalue node list nodelist children element node elementnode get child nodes getchildnodes children get length getlength node child children item child get node type getnodetype node element node string tag child get node name getnodename nls tag equals annotation process attribute annotation processattributeannotation attribute child nls tag equals simple type simpletype process attribute simple type processattributesimpletype attribute child type attribute get type gettype attribute set type settype type attribute process attribute annotation processattributeannotation schema attribute schemaattribute element node node node list nodelist children node get child nodes getchildnodes children get length getlength node child children item child get node type getnodetype node element node nls child get node name getnodename equals documentation node doc child get first child getfirstchild doc element set description setdescription get normalized text getnormalizedtext doc get node value getnodevalue nls nls child get node name getnodename equals app info appinfo child get node name getnodename equals appinfo node list nodelist infos child get child nodes getchildnodes infos get length getlength node meta infos item meta get node type getnodetype node element node nls meta get node name getnodename equals nls meta attribute element set kind setkind process kind processkind nls get attribute getattribute meta kind element set based on setbasedon get attribute getattribute nls meta nls based on basedon element set translatable property settranslatableproperty process translatable processtranslatable get attribute getattribute nls meta nls translatable element set deprecated property setdeprecatedproperty process deprecated processdeprecated get attribute getattribute nls meta nls deprecated process translatable processtranslatable string nls equals process deprecated processdeprecated string nls equals schema simple type schemasimpletype process attribute restriction processattributerestriction schema attribute schemaattribute attribute node node node list nodelist children node get child nodes getchildnodes children get length getlength nls string base name basename get attribute getattribute node base nls base name basename equals string nls schema simple type schemasimpletype attribute get schema getschema string schema simple type schemasimpletype type schema simple type schemasimpletype attribute get schema getschema base name basename vector i schema enumeration ischemaenumeration items vector i schema enumeration ischemaenumeration children get length getlength node child children item child get node type getnodetype node element node nls child get node name getnodename equals enumeration i schema enumeration ischemaenumeration enumeration process enumeration processenumeration attribute get schema getschema child enumeration items add enumeration choice restriction choicerestriction restriction choice restriction choicerestriction attribute get schema getschema restriction set children setchildren items type set restriction setrestriction restriction type process attribute simple type processattributesimpletype schema attribute schemaattribute attribute node node node list nodelist children node get child nodes getchildnodes children get length getlength schema simple type schemasimpletype type children get length getlength node child children item child get node type getnodetype node element node nls child get node name getnodename equals restriction type process attribute restriction processattributerestriction attribute child type attribute set type settype type schema complex type schemacomplextype process complex type processcomplextype i schema element ischemaelement owner node type node typenode nls string aname get attribute getattribute type node typenode nls string amixed get attribute getattribute type node typenode mixed schema complex type schemacomplextype complex type complextype schema complex type schemacomplextype aname nls amixed amixed equals complex type complextype set mixed setmixed node list nodelist children type node typenode get child nodes getchildnodes i schema compositor ischemacompositor compositor children get length getlength node child children item child get node type getnodetype node element node nls child get node name getnodename equals attribute complex type complextype add attribute addattribute process attribute processattribute owner child i schema object ischemaobject object process compositor child processcompositorchild owner child i schema compositor ischemacompositor root object i schema compositor ischemacompositor compositor compositor i schema compositor ischemacompositor object complex type complextype set compositor setcompositor compositor complex type complextype i schema compositor ischemacompositor process compositor processcompositor i schema object ischemaobject parent node node type schema compositor schemacompositor compositor schema compositor schemacompositor parent type node list nodelist children node get child nodes getchildnodes min occurs minoccurs max occurs maxoccurs nls string amin occurs aminoccurs get attribute getattribute node min occurs minoccurs nls string amax occurs amaxoccurs get attribute getattribute node max occurs maxoccurs amin occurs aminoccurs min occurs minoccurs integer value of valueof amin occurs aminoccurs int value intvalue amax occurs amaxoccurs nls amax occurs amaxoccurs equals unbounded max occurs maxoccurs integer max max occurs maxoccurs integer value of valueof amax occurs amaxoccurs int value intvalue compositor set min occurs setminoccurs min occurs minoccurs compositor set max occurs setmaxoccurs max occurs maxoccurs children get length getlength node child children item i schema object ischemaobject object process compositor child processcompositorchild compositor child type object compositor add child addchild object compositor i schema object ischemaobject process compositor child processcompositorchild i schema object ischemaobject parent node child parent kind parentkind string tag child get node name getnodename nls tag equals element parent kind parentkind i schema compositor ischemacompositor root process element processelement parent child sequence element group choice sequence nls tag equals sequence parent kind parentkind i schema compositor ischemacompositor process compositor processcompositor parent child i schema compositor ischemacompositor sequence choice element group choice sequence nls tag equals choice parent kind parentkind i schema compositor ischemacompositor process compositor processcompositor parent child i schema compositor ischemacompositor choice element nls tag equals parent kind parentkind i schema compositor ischemacompositor root parent kind parentkind i schema compositor ischemacompositor group process compositor processcompositor parent child i schema compositor ischemacompositor sequence group choice sequence nls tag equals group parent kind parentkind i schema compositor ischemacompositor choice parent kind parentkind i schema compositor ischemacompositor sequence process compositor processcompositor parent child i schema compositor ischemacompositor sequence i schema element ischemaelement process element processelement i schema object ischemaobject parent node element node elementnode parent i schema compositor ischemacompositor process element reference processelementreference i schema compositor ischemacompositor parent element node elementnode process element declaration processelementdeclaration parent element node elementnode i schema element ischemaelement process element declaration processelementdeclaration i schema object ischemaobject parent node element node elementnode nls string aname get attribute getattribute element node elementnode aname nls string atype get attribute getattribute element node elementnode type min occurs minoccurs get min occurs getminoccurs element node elementnode max occurs maxoccurs get max occurs getmaxoccurs element node elementnode i schema type ischematype type atype type resolve type reference resolvetypereference atype schema element schemaelement element nls aname equals extension element schema root element schemarootelement parent aname element schema element schemaelement parent aname element bind source location bindsourcelocation element node elementnode line table linetable element set min occurs setminoccurs min occurs minoccurs element set max occurs setmaxoccurs max occurs maxoccurs node list nodelist children element node elementnode get child nodes getchildnodes children get length getlength node child children item child get node type getnodetype node element node string tag child get node name getnodename nls type tag equals complex type complextype type process complex type processcomplextype element child nls tag equals annotation process element annotation processelementannotation element child element set type settype type element i schema element ischemaelement process element reference processelementreference i schema compositor ischemacompositor compositor node element node elementnode nls string are f aref get attribute getattribute element node elementnode are f aref min occurs minoccurs get min occurs getminoccurs element node elementnode max occurs maxoccurs get max occurs getmaxoccurs element node elementnode schema element reference schemaelementreference reference schema element reference schemaelementreference compositor are f aref reference add comments addcomments element node elementnode reference set min occurs setminoccurs min occurs minoccurs reference set max occurs setmaxoccurs max occurs maxoccurs f references freferences add element addelement reference reference bind source location bindsourcelocation element node elementnode line table linetable reference get min occurs getminoccurs node element node elementnode nls string amin occurs aminoccurs get attribute getattribute element node elementnode min occurs minoccurs amin occurs aminoccurs integer value of valueof amin occurs aminoccurs int value intvalue get max occurs getmaxoccurs node element node elementnode nls string amax occurs amaxoccurs get attribute getattribute element node elementnode max occurs maxoccurs amax occurs amaxoccurs nls amax occurs amaxoccurs equals unbounded integer max integer value of valueof amax occurs amaxoccurs int value intvalue process element annotation processelementannotation schema element schemaelement element node node node list nodelist children node get child nodes getchildnodes children get length getlength node child children item child get node type getnodetype node element node nls child get node name getnodename equals documentation f abbreviated fabbreviated element set description setdescription get normalized text getnormalizedtext child get first child getfirstchild get node value getnodevalue nls nls child get node name getnodename equals app info appinfo child get node name getnodename equals appinfo node list nodelist infos child get child nodes getchildnodes infos get length getlength node meta infos item meta get node type getnodetype node element node nls meta get node name getnodename equals nls meta element element set label property setlabelproperty get attribute getattribute nls meta nls label attribute labelattribute nls element set icon property seticonproperty nls get attribute getattribute meta icon element get icon property geticonproperty nls element set icon property seticonproperty nls get attribute getattribute meta icon name iconname element set translatable property settranslatableproperty process translatable processtranslatable get attribute getattribute nls meta nls translatable element set deprecated property setdeprecatedproperty process deprecated processdeprecated get attribute getattribute nls meta nls deprecated element i schema root element ischemarootelement deprecated suggestion string dep sug depsug get attribute getattribute meta i schema root element ischemarootelement d ep dep replacement i schema root element ischemarootelement element set deprecated suggestion setdeprecatedsuggestion dep sug depsug internal string internal get attribute getattribute meta i schema root element ischemarootelement internal i schema root element ischemarootelement element set internal setinternal value of valueof internal boolean value booleanvalue i schema enumeration ischemaenumeration process enumeration processenumeration i schema ischema schema node node nls string get attribute getattribute node schema enumeration schemaenumeration schema process kind processkind string nls equals java i meta attribute imetaattribute java nls equals resource i meta attribute imetaattribute resource nls equals identifier i meta attribute imetaattribute identifier i meta attribute imetaattribute string process schema annotation processschemaannotation node node node list nodelist children node get child nodes getchildnodes nls string overview nls string section name sectionname overview children get length getlength node child children item child get node type getnodetype node element node nls child get node name getnodename equals documentation f abbreviated fabbreviated string text get normalized text getnormalizedtext child get first child getfirstchild get node value getnodevalue nls equals nls overview set description setdescription text document section documentsection document section documentsection section name sectionname set description setdescription text f doc sections fdocsections add nls nls child get node name getnodename equals app info appinfo child get node name getnodename equals appinfo node list nodelist infos child get child nodes getchildnodes infos get length getlength node meta infos item meta get node type getnodetype node element node nls meta get node name getnodename equals nls meta schema nls overview set name setname nls get attribute getattribute meta nls f plugin d fpluginid nls get attribute getattribute meta plugin nls f point d fpointid nls get attribute getattribute meta f valid fvalid nls meta get node name getnodename equals nls meta nls nls get attribute getattribute meta type nls section name sectionname nls get attribute getattribute meta section name sectionname section name sectionname process include processinclude node node nls string location get attribute getattribute node schema location schemalocation schema include schemainclude include schema include schemainclude location f abbreviated fabbreviated f search path fsearchpath f includes fincludes f includes fincludes vector i schema include ischemainclude f includes fincludes add include reload reload reload input stream inputstream set notification enabled setnotificationenabled reset load load set notification enabled setnotificationenabled is loaded isloaded fire model changed firemodelchanged model changed event modelchangedevent i model changed event imodelchangedevent changed object remove document section removedocumentsection i document section idocumentsection doc section docsection f doc sections fdocsections remove doc section docsection fire model changed firemodelchanged model changed event modelchangedevent i model changed event imodelchangedevent remove object doc section docsection move element to sibling moveelementtosibling i schema element ischemaelement element i schema object ischemaobject sibling is loaded isloaded load f elements felements index of indexof element new index newindex sibling f elements felements sibling new index newindex f elements felements index of indexof sibling new index newindex f elements felements size new index newindex new index newindex f elements felements f elements felements new index newindex new index newindex f elements felements f elements felements don move f elements felements new index newindex element fire model changed firemodelchanged model changed event modelchangedevent i model changed event imodelchangedevent change object remove element removeelement i schema element ischemaelement element f elements felements remove element fire model changed firemodelchanged model changed event modelchangedevent i model changed event imodelchangedevent remove object element override remove model changed listener removemodelchangedlistener i model changed listener imodelchangedlistener listener f listeners flisteners remove listener reset f elements felements vector i schema element ischemaelement f doc sections fdocsections vector document section documentsection f includes fincludes f point d fpointid f plugin d fpluginid f references freferences f description fdescription f name fname f valid fvalid f loaded floaded resolve element reference resolveelementreference i schema object reference ischemaobjectreference reference i schema element ischemaelement element list elementlist get resolved elements getresolvedelements element list elementlist length i schema element ischemaelement element element list elementlist element i schema object reference ischemaobjectreference element get name getname equals reference get name getname link reference set referenced object setreferencedobject element resolve reference resolvereference i schema object reference ischemaobjectreference reference clazz reference get referenced object class getreferencedobjectclass clazz equals i schema element ischemaelement resolve element reference resolveelementreference reference resolve references resolvereferences vector schema element reference schemaelementreference references references size i schema object reference ischemaobjectreference reference references element at elementat resolve reference resolvereference reference schema type schematype resolve type reference resolvetypereference string type name typename create simple type schema simple type schemasimpletype type name typename set description setdescription string new description newdescription string old value oldvalue f description fdescription f description fdescription new description newdescription fire model object changed firemodelobjectchanged description old value oldvalue f description fdescription set name setname string new name newname new name newname nls new name newname string old value oldvalue f name fname f name fname new name newname fire model object changed firemodelobjectchanged old value oldvalue f name fname override set plugin id setpluginid string new id newid string old value oldvalue f plugin d fpluginid f plugin d fpluginid new id newid fire model object changed firemodelobjectchanged plugin old value oldvalue new id newid override set point id setpointid string new id newid string old value oldvalue f point d fpointid f point d fpointid new id newid fire model object changed firemodelobjectchanged point old value oldvalue new id newid set notification enabled setnotificationenabled new notification enabled newnotificationenabled f notification enabled fnotificationenabled new notification enabled newnotificationenabled sets list additional schema relative absolute paths search find included schema link load called param search path searchpath list paths search included schema code code additional paths set search path setsearchpath list i path ipath search path searchpath f search path fsearchpath search path searchpath override string to string tostring f name fname traverse document tree traversedocumenttree node root root node list nodelist children root get child nodes getchildnodes f references freferences vector schema element reference schemaelementreference children get length getlength node child children item child get node type getnodetype node element node string node name nodename child get node name getnodename to lower case tolowercase locale english nls node name nodename equals element i schema element ischemaelement element process element processelement child element f valid fvalid i schema attribute ischemaattribute attributes element get attributes getattributes attributes length attributes f valid fvalid f elements felements add element nls node name nodename equals annotation process schema annotation processschemaannotation child nls node name nodename equals include process include processinclude child add omitted document sections addomitteddocumentsections f loaded floaded f references freferences size resolve references resolvereferences f references freferences f references freferences add omitted document sections addomitteddocumentsections document section documentsection doc sections length document section documentsection document section documentsection document section documentsection doc sections f doc sections fdocsections add document section adddocumentsection collections sort f doc sections fdocsections update references for updatereferencesfor i schema element ischemaelement element update references for updatereferencesfor element i schema ischema ref resh refresh rename update references for updatereferencesfor i schema element ischemaelement element kind f elements felements size i schema element ischemaelement f elements felements equals element i schema type ischematype type get type gettype type i schema complex type ischemacomplextype schema compositor schemacompositor compositor schema compositor schemacompositor i schema complex type ischemacomplextype type get compositor getcompositor compositor compositor update references for updatereferencesfor element kind override write string indent print writer printwriter writer nls writer println xml version encoding utf nls writer println schema file written pde nls nls writer println schema target name space targetnamespace f plugin d fpluginid xml ns xmlns http org xml schema xmlschema string indent indent indent string indent indent indent nls writer println indent annotation nls nls writer println indent get schema version getschemaversion appinfo app info appinfo nls nls writer print indent meta schema plugin f plugin d fpluginid nls nls writer print f point d fpointid nls nls writer println get name getname nls nls writer println indent get schema version getschemaversion appinfo app info appinfo nls writer println indent documentation writer println indent get writable description getwritabledescription nls writer println indent documentation nls writer println indent annotation writer println add includes defined f includes fincludes f includes fincludes size i schema include ischemainclude include f includes fincludes include write indent writer writer println add elements f elements felements size i schema element ischemaelement element f elements felements element write indent writer writer println add document sections f doc sections fdocsections size i document section idocumentsection f doc sections fdocsections write indent writer writer println nls writer println schema string get writable description getwritabledescription nls string line delimiter linedelimiter system get property getproperty separator string description pde xml helper pdexmlhelper get writable string getwritablestring get description getdescription nls string platform description platformdescription description replace all replaceall line delimiter linedelimiter platform description platformdescription override is dep erecated isdeperecated iterator i schema element ischemaelement f elements felements iterator has next hasnext object schema root element schemarootelement schema root element schemarootelement is deprecated isdeprecated override string get deprecated suggestion getdeprecatedsuggestion iterator i schema element ischemaelement f elements felements iterator has next hasnext object schema root element schemarootelement schema root element schemarootelement get deprecated suggestion getdeprecatedsuggestion override is internal isinternal iterator i schema element ischemaelement f elements felements iterator has next hasnext object schema root element schemarootelement schema root element schemarootelement is internal isinternal override get schema version getschemaversion f target version ftargetversion i plugin model base ipluginmodelbase model pde core pdecore get default getdefault get model manager getmodelmanager find model findmodel f plugin d fpluginid model i plugin base ipluginbase base model get plugin base getpluginbase base base get schema version getschemaversion f target version ftargetversion parse double parsedouble base get schema version getschemaversion f target version ftargetversion target platform f target version ftargetversion parse double parsedouble target platform helper targetplatformhelper get schema version getschemaversion f target version ftargetversion