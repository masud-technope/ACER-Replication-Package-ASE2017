copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal editor actions java file java net org eclipse core resources org eclipse core runtime org eclipse jface action action org eclipse jface dialogs message dialog messagedialog org eclipse osgi util nls org eclipse pde core plugin i plugin extension ipluginextension org eclipse pde core plugin i plugin extension point ipluginextensionpoint org eclipse pde internal core pde core pdecore org eclipse pde internal core ischema i schema ischema org eclipse pde internal core ischema i schema descriptor ischemadescriptor org eclipse pde internal core schema schema descriptor schemadescriptor org eclipse pde internal core schema schema registry schemaregistry org eclipse pde internal org eclipse pde internal editor schema schema editor schemaeditor open schema action openschemaaction open schema action openschemaaction action i schema ischema f schema fschema string f full point d ffullpointid open schema action openschemaaction f schema fschema f full point d ffullpointid initialize initialize set image descriptor setimagedescriptor pde plugin images pdepluginimages desc schema obj set text settext pde ui messages pdeuimessages hyperlink action open schema hyperlinkactionopenschema set tool tip text settooltiptext pde ui messages pdeuimessages hyperlink action open schema hyperlinkactionopenschema set enabled setenabled param schema set input setinput i schema ischema schema ensure schema defined schema f full point d ffullpointid pde ui messages pdeuimessages open schema action openschemaaction msg unknown msgunknown f full point d ffullpointid schema get qualified point id getqualifiedpointid f schema fschema schema param point set input setinput i plugin extension point ipluginextensionpoint point ensure point defined point f schema fschema f full point d ffullpointid pde ui messages pdeuimessages open schema action openschemaaction msg unknown msgunknown f full point d ffullpointid point get full id getfullid ensure point fully qualified f full point d ffullpointid index of indexof f schema fschema find schema f schema fschema find schema findschema point param full point d fullpointid set input setinput string full point d fullpointid ensure point defined full point d fullpointid f schema fschema f full point d ffullpointid pde ui messages pdeuimessages open schema action openschemaaction msg unknown msgunknown f full point d ffullpointid full point d fullpointid find extension point i plugin extension point ipluginextensionpoint point pde core pdecore get default getdefault get extensions registry getextensionsregistry find extension point findextensionpoint f full point d ffullpointid ensure extension point defined point f schema fschema find schema f schema fschema find schema findschema point param extension set input setinput i plugin extension ipluginextension extension ensure extension defined extension f schema fschema f full point d ffullpointid pde ui messages pdeuimessages open schema action openschemaaction msg unknown msgunknown full extension point f full point d ffullpointid extension get point getpoint find extension point i plugin extension point ipluginextensionpoint point pde core pdecore get default getdefault get extensions registry getextensionsregistry find extension point findextensionpoint f full point d ffullpointid ensure extension point defined point f schema fschema find schema f schema fschema find schema findschema point i schema ischema find schema findschema i plugin extension point ipluginextensionpoint point find schema url extension point url url schema registry schemaregistry getschemaurl point ensure url defined url create schema descriptor i schema descriptor ischemadescriptor descriptor schema descriptor schemadescriptor f full point d ffullpointid url schema i schema ischema schema descriptor get schema getschema ensure schema defined schema schema param full point d fullpointid display error dialog displayerrordialog string title pde ui messages pdeuimessages open schema action openschemaaction title extension point schema titleextensionpointschema string message nls bind pde ui messages pdeuimessages open schema action openschemaaction error msg schema not found errormsgschemanotfound f full point d ffullpointid message dialog messagedialog open warning openwarning pde plugin pdeplugin get active workbench shell getactiveworkbenchshell title message override ensure schema defined f schema fschema display error dialog displayerrordialog unencoded schema url url schemaurl f schema fschema geturl schemaurl display error dialog displayerrordialog check dealing jar red jarred bundle nls schemaurl get protocol getprotocol starts with startswith jar open schema jar openschemajar schemaurl open schema file openschemafile schemaurl param path open schema file openschemafile url url convert url encoded uri local file uri uri uri util uriutil touri url file schema file schemafile uri util uriutil to file tofile uri schema file schemafile schema file schemafile exists display error dialog displayerrordialog file workspace open editable version i path ipath schema path schemapath path schema file schemafile get path getpath i workspace root iworkspaceroot root pde plugin pdeplugin get workspace getworkspace get root getroot i path ipath workspace path workspacepath root get location getlocation workspace path workspacepath is prefix of isprefixof schema path schemapath schema path schemapath schema path schemapath remove first segments removefirstsegments workspace path workspacepath segment count segmentcount i resource iresource res root find member findmember schema path schemapath res res i file ifile res get project getproject is open isopen schema editor schemaeditor open schema openschema i file ifile res workspace open absolute path schema editor schemaeditor open schema openschema schema file schemafile uri syntax exception urisyntaxexception pde plugin pdeplugin log display error dialog displayerrordialog param path open schema jar openschemajar url url url unencoded treat path split ting splitting based jar suffix string string url stringurl url get path getpath jar suffix jarsuffix string url stringurl index of indexof jar suffix jarsuffix jar suffix jarsuffix string url stringurl length display error dialog displayerrordialog string file url fileurl string url stringurl substring jar suffix jarsuffix uri uri uri util uriutil touri url file url fileurl file jar file jarfile uri util uriutil to file tofile uri jar file jarfile jar file jarfile exists display error dialog displayerrordialog string schema entry name schemaentryname string url stringurl substring jar suffix jarsuffix nls schema entry name schemaentryname starts with startswith schema entry name schemaentryname schema entry name schemaentryname substring open schema editor schema editor schemaeditor open schema openschema jar file jarfile schema entry name schemaentryname display error dialog displayerrordialog uri syntax exception urisyntaxexception pde plugin pdeplugin log display error dialog displayerrordialog malformedurlexception pde plugin pdeplugin log display error dialog displayerrordialog