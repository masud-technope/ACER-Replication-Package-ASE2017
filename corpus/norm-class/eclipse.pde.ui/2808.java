copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal refactoring org eclipse core file buf fers filebuffers org eclipse core resources org eclipse core runtime org eclipse jdt core org eclipse jface text i document idocument org eclipse ltk core refactoring org eclipse pde core plugin org eclipse pde internal core i core constants icoreconstants org eclipse pde internal core pde core pdecore org eclipse pde internal core ischema org eclipse pde internal core schema schema registry schemaregistry org eclipse pde internal core text i document attribute node idocumentattributenode org eclipse pde internal core text plugin org eclipse pde internal util pde model utility pdemodelutility org eclipse text edits plugin manifest change pluginmanifestchange change create rename change createrenamechange i file ifile file object affected elements affectedelements string new names newnames text change textchange text change textchange i progress monitor iprogressmonitor monitor core exception coreexception i text file buffer manager itextfilebuffermanager manager file buffers filebuffers get text file buffer manager gettextfilebuffermanager manager connect file get full path getfullpath location kind locationkind normalize monitor i text file buffer itextfilebuffer buffer manager get text file buffer gettextfilebuffer file get full path getfullpath location kind locationkind normalize multi text edit multitextedit multi edit multiedit multi text edit multitextedit i document idocument document buffer get document getdocument plugin model base pluginmodelbase model i core constants icoreconstants fragment filename descriptor equals file get name getname model fragment model fragmentmodel document model plugin model pluginmodel document model load model is loaded isloaded affected elements affectedelements length model plugin model pluginmodel affected elements affectedelements i java element ijavaelement plugin node pluginnode plugin plugin node pluginnode model get plugin base getpluginbase i document attribute node idocumentattributenode attr nls plugin get document attribute getdocumentattribute nls text edit textedit edit create text edit createtextedit attr i java element ijavaelement affected elements affectedelements new names newnames edit multi edit multiedit add child addchild edit schema registry schemaregistry registry pde core pdecore get default getdefault get schema registry getschemaregistry i plugin extension ipluginextension extensions model get plugin base getpluginbase get extensions getextensions extensions length i schema ischema schema registry get schema getschema extensions get point getpoint schema add extension attribute edit addextensionattributeedit schema extensions multi edit multiedit affected elements affectedelements new names newnames multi edit multiedit has children haschildren add existing text edits create multi text multitext edit file corrupted edits applied independently text change textchange text edit textedit edit text change textchange get edit getedit edit multi text edit multitextedit multi text edit multitextedit edit add child addchild multi edit multiedit multi edit multiedit multi text edit multitextedit edit multi edit multiedit add child addchild edit text file change textfilechange change nls text file change textfilechange nls nls file change set edit setedit multi edit multiedit pde model utility pdemodelutility set change text type setchangetexttype change file change core exception coreexception manager disconnect file get full path getfullpath location kind locationkind normalize monitor add extension attribute edit addextensionattributeedit i schema ischema schema i plugin parent ipluginparent parent multi text edit multitextedit multi object element string new name newname i plugin object ipluginobject children parent get children getchildren children length i plugin element ipluginelement child i plugin element ipluginelement children i schema element ischemaelement schema element schemaelement schema find element findelement child get name getname schema element schemaelement i plugin attribute ipluginattribute attributes child get attributes getattributes attributes length i plugin attribute ipluginattribute attr attributes i schema attribute ischemaattribute att info attinfo schema element schemaelement get attribute getattribute attr get name getname att info attinfo element i java element ijavaelement att info attinfo get kind getkind i meta attribute imetaattribute java i document attribute node idocumentattributenode doc attr docattr i document attribute node idocumentattributenode attr text edit textedit edit create text edit createtextedit doc attr docattr i java element ijavaelement element new name newname edit multi add child addchild edit element i resource iresource att info attinfo get kind getkind i meta attribute imetaattribute resource i document attribute node idocumentattributenode doc attr docattr i document attribute node idocumentattributenode attr text edit textedit edit create text edit createtextedit doc attr docattr i resource iresource element new name newname edit multi add child addchild edit add extension attribute edit addextensionattributeedit schema child multi element new name newname text edit textedit create text edit createtextedit i document attribute node idocumentattributenode attr i java element ijavaelement element string new name newname attr string old name oldname element i type itype i type itype element get fully qualified name getfullyqualifiedname element get element name getelementname string attr get attribute value getattributevalue old name oldname equals is good match isgoodmatch old name oldname element i package fragment ipackagefragment offset attr get value offset getvalueoffset offset replace edit replaceedit offset old name oldname length new name newname text edit textedit create text edit createtextedit i document attribute node idocumentattributenode attr i resource iresource resource string new name newname attr string old name oldname resource get project relative path getprojectrelativepath to string tostring string attr get attribute value getattributevalue old name oldname equals resource i container icontainer is good folder match isgoodfoldermatch old name oldname offset attr get value offset getvalueoffset offset replace edit replaceedit offset old name oldname length new name newname is good match isgoodmatch string string old name oldname is package ispackage length old name oldname length good length match goodlengthmatch is package ispackage last index of lastindexof old name oldname length char at charat old name oldname length starts with startswith old name oldname good length match goodlengthmatch is good folder match isgoodfoldermatch string string old name oldname path old name oldname is prefix of isprefixof path