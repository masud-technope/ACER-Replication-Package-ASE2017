copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal core search java util array list arraylist java util hash set hashset java util map org eclipse core resources i folder ifolder org eclipse core resources i project iproject org eclipse core resources i resource iresource org eclipse core resources resources plugin resourcesplugin org eclipse core runtime i path ipath org eclipse core runtime path org eclipse jdt core i classpath container iclasspathcontainer org eclipse jdt core i classpath entry iclasspathentry org eclipse jdt core i java element ijavaelement org eclipse jdt core i java element delta ijavaelementdelta org eclipse jdt core i java model ijavamodel org eclipse jdt core i java project ijavaproject org eclipse jdt core i member imember org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt core java core javacore org eclipse jdt core java model exception javamodelexception org eclipse jdt internal compiler env access rule set accessruleset org eclipse jdt internal core classpath entry classpathentry org eclipse jdt internal core external folders manager externalfoldersmanager org eclipse jdt internal core java element javaelement org eclipse jdt internal core java model javamodel org eclipse jdt internal core java model manager javamodelmanager org eclipse jdt internal core java project javaproject org eclipse jdt internal core package fragment packagefragment org eclipse jdt internal core package fragment root packagefragmentroot org eclipse jdt internal core util util java specific scope searching relative java elements suppress warnings suppresswarnings rawtypes unchecked java search scope javasearchscope abstract java search scope abstractjavasearchscope array list arraylist elements paths resources search scope classpath entries paths resources projects container paths projects array list arraylist project paths projectpaths array list arraylist indexes projects list project indexes projectindexes path container src lib jar temp mylib jar string container paths containerpaths path relative container empty string relative paths relativepaths packages matches direct children folder is pkg path ispkgpath access rule set accessruleset path restrictions pathrestrictions paths count pathscount threshold i path ipath enclosing projects and jars enclosingprojectsandjars access rule set accessruleset enclosed access rule set accessruleset java search scope javasearchscope java search scope javasearchscope size initialize size disabled expensive java model manager javamodelmanager get java model manager getjavamodelmanager remember scope rememberscope add enclosing project or jar addenclosingprojectorjar i path ipath path length enclosing projects and jars enclosingprojectsandjars length length enclosing projects and jars enclosingprojectsandjars equals path system arraycopy enclosing projects and jars enclosingprojectsandjars enclosing projects and jars enclosingprojectsandjars i path ipath length length enclosing projects and jars enclosingprojectsandjars length path add java project fragment roots current java search scope add java project javaproject i path ipath hash set hashset hash set hashset i classpath entry iclasspathentry add java project javaproject project include mask includemask hash set hashset projects to be added projectstobeadded java model exception javamodelexception add project include mask includemask projects to be added projectstobeadded hash set hashset add path current java search scope project fragment roots project resolved classpath retrieve store access restriction classpath entry recurse dependent projects param java project javaproject project resolved classpath entries param path to add pathtoadd path add single element user add project fragment roots param include mask includemask mask apply classpath entries param projects to be added projectstobeadded avoid infinite recursion param visited projects visitedprojects avoid adding project param ref erring entry referringentry project raw entry ref erring referring project classpath java model exception javamodelexception happen java model info add java project javaproject java project javaproject i path ipath path to add pathtoadd include mask includemask hash set hashset projects to be added projectstobeadded hash set hashset visited projects visitedprojects i classpath entry iclasspathentry ref erring entry referringentry java model exception javamodelexception i project iproject project java project javaproject get project getproject project is accessible isaccessible visited projects visitedprojects add project i path ipath project path projectpath project get full path getfullpath string project path string projectpathstring project path projectpath to string tostring add enclosing project or jar addenclosingprojectorjar project path projectpath i classpath entry iclasspathentry entries java project javaproject get resolved classpath getresolvedclasspath i java model ijavamodel model java project javaproject get java model getjavamodel java model manager javamodelmanager per project info perprojectinfo per project info perprojectinfo java project javaproject get per project info getperprojectinfo length entries length length i classpath entry iclasspathentry entry entries access rule set accessruleset access classpath entry classpathentry cp entry cpentry classpath entry classpathentry entry ref erring entry referringentry source folder impl icitly implicitly exported entry is exported isexported entry get entry kind getentrykind i classpath entry iclasspathentry cpe source cp entry cpentry cp entry cpentry combine with combinewith classpath entry classpathentry ref erring entry referringentry cp entry cpentry classpath entry classpathentry ref erring entry referringentry combine with combinewith cp entry cpentry access cp entry cpentry get access rule set getaccessruleset entry get entry kind getentrykind i classpath entry iclasspathentry cpe library i classpath entry iclasspathentry raw entry rawentry map root path to raw entries rootpathtorawentries per project info perprojectinfo root path to raw entries rootpathtorawentries root path to raw entries rootpathtorawentries raw entry rawentry i classpath entry iclasspathentry root path to raw entries rootpathtorawentries entry get path getpath raw entry rawentry raw kind rawkind raw entry rawentry get entry kind getentrykind i classpath entry iclasspathentry cpe library i classpath entry iclasspathentry cpe variable include mask includemask application libraries i path ipath path entry get path getpath path to add pathtoadd path to add pathtoadd equals path object target don check existence java model javamodel get target gettarget path external folder target i folder ifolder path i folder ifolder target get full path getfullpath string path to string pathtostring path get device getdevice path to string tostring path toosstring add nls project path projectpath to string tostring nls nls path to string pathtostring nls nls access add enclosing project or jar addenclosingprojectorjar entry get path getpath i classpath entry iclasspathentry cpe container i classpath container iclasspathcontainer container java core javacore get classpath container getclasspathcontainer raw entry rawentry get path getpath java project javaproject container container get kind getkind i classpath container iclasspathcontainer application include mask includemask application libraries raw kind rawkind i classpath container iclasspathcontainer system i classpath container iclasspathcontainer system include mask includemask system libraries raw kind rawkind raw kind rawkind i path ipath path entry get path getpath path to add pathtoadd path to add pathtoadd equals path object target java model javamodel get target gettarget don check existence path external folder target i folder ifolder path i folder ifolder target get full path getfullpath string path to string pathtostring path get device getdevice path to string tostring path toosstring add nls project path projectpath to string tostring nls nls path to string pathtostring nls nls access add enclosing project or jar addenclosingprojectorjar entry get path getpath i classpath entry iclasspathentry cpe project include mask includemask reference d referenced projects i path ipath path entry get path getpath path to add pathtoadd path to add pathtoadd equals path java project javaproject referenced project referencedproject java project javaproject model get java project getjavaproject path last segment lastsegment recurse depending project create scope projects to be added projectstobeadded referenced project referencedproject add referenced project referencedproject include mask includemask projects to be added projectstobeadded visited projects visitedprojects cp entry cpentry i classpath entry iclasspathentry cpe source include mask includemask sources i path ipath path entry get path getpath path to add pathtoadd path to add pathtoadd equals path add project path projectpath to string tostring util relative path relativepath remove project segment path project path string projectpathstring access add element java search scope param element element add current java search scope java model exception javamodelexception happen java model info add i java element ijavaelement element java model exception javamodelexception i path ipath container path containerpath string container path to string containerpathtostring package fragment root packagefragmentroot root include mask includemask sources application libraries system libraries element get element type getelementtype i java element ijavaelement java model workspace sope i java element ijavaelement java project add java project javaproject element include mask includemask hash set hashset hash set hashset i java element ijavaelement fragment root root package fragment root packagefragmentroot element i path ipath root path rootpath root internal path internalpath container path containerpath root get kind getkind i package fragment root ipackagefragmentroot source root get parent getparent get path getpath root path rootpath container path to string containerpathtostring container path containerpath get device getdevice container path containerpath to string tostring container path containerpath toosstring i resource iresource root resource rootresource root resource string project path projectpath root get java project getjavaproject get path getpath to string tostring root resource rootresource root resource rootresource is accessible isaccessible string relative path relativepath util relative path relativepath root resource rootresource get full path getfullpath container path containerpath segment count segmentcount add project path projectpath relative path relativepath container path to string containerpathtostring add nls project path projectpath nls nls container path to string containerpathtostring nls nls i java element ijavaelement fragment root package fragment root packagefragmentroot element get parent getparent project path projectpath root get java project getjavaproject get path getpath to string tostring root is archive isarchive string relative path relativepath util concat with concatwith package fragment packagefragment element names container path containerpath root get path getpath container path to string containerpathtostring container path containerpath get device getdevice container path containerpath to string tostring container path containerpath toosstring add project path projectpath relative path relativepath container path to string containerpathtostring i resource iresource resource java element javaelement element resource resource resource is accessible isaccessible container path containerpath root get kind getkind i package fragment root ipackagefragmentroot source root get parent getparent get path getpath root internal path internalpath working copies resource container full path container path containerpath resource get parent getparent get full path getfullpath container path to string containerpathtostring container path containerpath get device getdevice container path containerpath to string tostring container path containerpath toosstring string relative path relativepath util relative path relativepath resource get full path getfullpath container path containerpath segment count segmentcount add project path projectpath relative path relativepath container path to string containerpathtostring remember file java elements element i member imember elements elements array list arraylist elements add element root package fragment root packagefragmentroot element get ancestor getancestor i java element ijavaelement fragment root project path projectpath root get java project getjavaproject get path getpath to string tostring string relative path relativepath root get kind getkind i package fragment root ipackagefragmentroot source container path containerpath root get parent getparent get path getpath relative path relativepath util relative path relativepath get path getpath full path element remove project segment container path containerpath root internal path internalpath relative path relativepath get path getpath relative path element to string tostring container path to string containerpathtostring container path containerpath get device getdevice container path containerpath to string tostring container path containerpath toosstring add project path projectpath relative path relativepath container path to string containerpathtostring root add enclosing project or jar addenclosingprojectorjar root get kind getkind i package fragment root ipackagefragmentroot source root get parent getparent get path getpath root get path getpath adds path search scope remember sub folders subfolders included access restriction add string project path projectpath string relative path relativepath string container path containerpath is package ispackage access rule set accessruleset access normalize container path containerpath relative path relativepath container path containerpath normalize container path containerpath relative path relativepath normalize relative path relativepath length container paths containerpaths length container path containerpath hash code hashcode fffffff length string current relative path currentrelativepath current container path currentcontainerpath current relative path currentrelativepath relative paths relativepaths current container path currentcontainerpath container paths containerpaths current relative path currentrelativepath equals relative path relativepath current container path currentcontainerpath equals container path containerpath length idx project paths projectpaths index of indexof project path projectpath idx store project separated list min imize minimize memory foo tprint footprint project paths projectpaths add project path projectpath idx project paths projectpaths index of indexof project path projectpath project indexes projectindexes idx relative paths relativepaths relative path relativepath container paths containerpaths container path containerpath is pkg path ispkgpath is package ispackage path restrictions pathrestrictions path restrictions pathrestrictions access access path restrictions pathrestrictions access rule set accessruleset relative paths relativepaths length path restrictions pathrestrictions access assumes threshold equal size table paths count pathscount threshold rehash src pkg java src pkg lib jar org eclipse jdt core i java element ijavaelement mylib jar temp mylib jar i java search scope ijavasearchscope encloses string encloses string resource path string resourcepathstring separator index separatorindex resource path string resourcepathstring index of indexof jar file entry separator separator index separatorindex internal external jar string jar path jarpath resource path string resourcepathstring substring separator index separatorindex string relative path relativepath resource path string resourcepathstring substring separator index separatorindex index of indexof jar path jarpath relative path relativepath resource workspace index of indexof resource path string resourcepathstring returns paths list path note index of indexof string string path jars param full path fullpath full path resource src pkg java src pkg index of indexof string full path fullpath fallback seq uentially sequentially paths length relative paths relativepaths length length string current relative path currentrelativepath relative paths relativepaths current relative path currentrelativepath string current container path currentcontainerpath container paths containerpaths string current full path currentfullpath current relative path currentrelativepath length current container path currentcontainerpath current container path currentcontainerpath current relative path currentrelativepath encloses current full path currentfullpath full path fullpath returns paths list path param container path containerpath path container src lib jar mylib jar temp mylib jar param relative path relativepath slash path container java empty index of indexof string container path containerpath string relative path relativepath hash faster comparison length container paths containerpaths length container path containerpath hash code hashcode fffffff length string current container path currentcontainerpath current container path currentcontainerpath container paths containerpaths current container path currentcontainerpath equals container path containerpath string current relative path currentrelativepath relative paths relativepaths encloses current relative path currentrelativepath relative path relativepath length returns enclosing path encloses path equal encloses string enclosing path enclosingpath string path normalize path path normalize path path length pathlength path length enclosing length enclosinglength enclosing path enclosingpath length path length pathlength enclosing length enclosinglength enclosing length enclosinglength path length pathlength enclosing length enclosinglength path equals enclosing path enclosingpath is pkg path ispkgpath path starts with startswith enclosing path enclosingpath path char at charat enclosing length enclosinglength path path folder path bug declaration scope project path starts with startswith enclosing path enclosingpath enclosing path enclosingpath length path last index of lastindexof enclosing path enclosingpath length path length javadoc i java search scope ijavasearchscope encloses i java element ijavaelement encloses i java element ijavaelement element elements length elements size length i java element ijavaelement scope element scopeelement i java element ijavaelement elements i java element ijavaelement searched element searchedelement element searched element searchedelement searched element searchedelement equals scope element scopeelement searched element searchedelement searched element searchedelement get parent getparent i package fragment root ipackagefragmentroot root i package fragment root ipackagefragmentroot element get ancestor getancestor i java element ijavaelement fragment root root root is archive isarchive external internal jar i path ipath root path rootpath root get path getpath string root path to string rootpathtostring root path rootpath get device getdevice root path rootpath to string tostring root path rootpath toosstring i path ipath relative path relativepath get path getpath element relative path index of indexof root path to string rootpathtostring relative path relativepath to string tostring resource workspace string full resource path string fullresourcepathstring get path getpath element to string tostring index of indexof full resource path string fullresourcepathstring javadoc i java search scope ijavasearchscope enclosing projects and jars enclosingprojectsandjars i path ipath enclosing projects and jars enclosingprojectsandjars enclosing projects and jars enclosingprojectsandjars i path ipath get path getpath i java element ijavaelement element relative to root relativetoroot element get element type getelementtype i java element ijavaelement java model path empty i java element ijavaelement java project element get path getpath i java element ijavaelement fragment root relative to root relativetoroot path empty element get path getpath i java element ijavaelement fragment string relative path relativepath util concat with concatwith package fragment packagefragment element names get path getpath element get parent getparent relative to root relativetoroot append path relative path relativepath i java element ijavaelement compilation unit i java element ijavaelement file get path getpath element get parent getparent relative to root relativetoroot append path element get element name getelementname get path getpath element get parent getparent relative to root relativetoroot access rule path param relative path relativepath path user restriction access access rule path returns specific uninit access rule scope enclose path access rule set accessruleset get access rule set getaccessruleset string relative path relativepath string container path containerpath index of indexof container path containerpath relative path relativepath search scope enclose path enclosed path restrictions pathrestrictions path restrictions pathrestrictions initialize size paths count pathscount size represents expected number elements threshold size extra room extraroom size threshold extra room extraroom extra room extraroom relative paths relativepaths string extra room extraroom container paths containerpaths string extra room extraroom project paths projectpaths array list arraylist project indexes projectindexes extra room extraroom is pkg path ispkgpath extra room extraroom optimize access rules path restrictions pathrestrictions enclosing projects and jars enclosingprojectsandjars i path ipath removes trailing slashes path string normalize string path path length pathlength path length path length pathlength path char at charat path length pathlength path substring path abstract search scope abstractsearchscope process delta processdelta i java element delta ijavaelementdelta process delta processdelta i java element delta ijavaelementdelta delta event type eventtype delta get kind getkind i java element delta ijavaelementdelta changed i java element delta ijavaelementdelta children delta get affected children getaffectedchildren length children length length i java element delta ijavaelementdelta child children process delta processdelta child event type eventtype i java element delta ijavaelementdelta removed i java element ijavaelement element delta get element getelement encloses element elements elements remove element string path element get element type getelementtype i java element ijavaelement java project path i java project ijavaproject element get project getproject get full path getfullpath to string tostring i java element ijavaelement fragment root path i package fragment root ipackagefragmentroot element get path getpath to string tostring paths count pathscount relative paths relativepaths equals path relative paths relativepaths rehash abstract java search scope abstractjavasearchscope package fragment root packagefragmentroot string string i package fragment root ipackagefragmentroot package fragment root packagefragmentroot string resource path string resourcepathstring jar separator index jarseparatorindex string jar path jarpath is jar file isjarfile jar separator index jarseparatorindex is jar file isjarfile internal external jar string relative path relativepath resource path string resourcepathstring substring jar separator index jarseparatorindex index of indexof jar path jarpath relative path relativepath resource workspace index of indexof resource path string resourcepathstring idx project indexes projectindexes string project path projectpath idx string project paths projectpaths idx project path projectpath i java project ijavaproject project java core javacore create resources plugin resourcesplugin get workspace getworkspace get root getroot get project getproject project path projectpath is jar file isjarfile i resource iresource resource java model javamodel get workspace target getworkspacetarget path jar path jarpath resource project get package fragment root getpackagefragmentroot resource project get package fragment root getpackagefragmentroot jar path jarpath object target java model javamodel get workspace target getworkspacetarget path container paths containerpaths relative paths relativepaths target target i project iproject project get package fragment root getpackagefragmentroot i project iproject target i java element ijavaelement element java model manager javamodelmanager create i resource iresource target project i package fragment root ipackagefragmentroot element get ancestor getancestor i java element ijavaelement fragment root rehash number expected elements java search scope javasearchscope new scope newscope java search scope javasearchscope paths count pathscount new scope newscope project paths projectpaths ensure capacity ensurecapacity project paths projectpaths size string current path currentpath length relative paths relativepaths length length current path currentpath relative paths relativepaths idx project indexes projectindexes string project path projectpath idx string project paths projectpaths idx new scope newscope add project path projectpath current path currentpath container paths containerpaths is pkg path ispkgpath path restrictions pathrestrictions path restrictions pathrestrictions relative paths relativepaths new scope newscope relative paths relativepaths container paths containerpaths new scope newscope container paths containerpaths project paths projectpaths new scope newscope project paths projectpaths project indexes projectindexes new scope newscope project indexes projectindexes is pkg path ispkgpath new scope newscope is pkg path ispkgpath path restrictions pathrestrictions new scope newscope path restrictions pathrestrictions threshold new scope newscope threshold string to string tostring nls string buffer stringbuffer result string buffer stringbuffer java search scope javasearchscope elements nls result append length elements size length java element javaelement element java element javaelement elements nls result append result append element to string with ancestors tostringwithancestors nls result append paths count pathscount nls result append empty scope nls result append string paths string relative paths relativepaths length relative paths relativepaths length string path relative paths relativepaths path string container path containerpath external folders manager externalfoldersmanager is internal path for external folder isinternalpathforexternalfolder path container paths containerpaths object target java model javamodel get workspace target getworkspacetarget path container paths containerpaths container path containerpath i folder ifolder target get location getlocation toosstring container path containerpath container paths containerpaths path length paths container path containerpath path paths container path containerpath system arraycopy paths paths string util sort paths nls result append nls result append paths nls result append result to string tostring