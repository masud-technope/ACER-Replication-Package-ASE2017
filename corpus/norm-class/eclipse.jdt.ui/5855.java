copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal package view packageview java util array list arraylist java util collection java util iterator java util list org eclipse swt widgets control org eclipse swt widgets display org eclipse swt widgets tree item treeitem org eclipse swt widgets widget org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime i status istatus org eclipse core runtime status org eclipse core resources i folder ifolder org eclipse core resources i project iproject org eclipse core resources i resource iresource org eclipse core resources i resource delta iresourcedelta org eclipse jface util i property change listener ipropertychangelistener org eclipse jface util property change event propertychangeevent org eclipse jface viewers i basic property constants ibasicpropertyconstants org eclipse jface viewers tree viewer treeviewer org eclipse jface viewers viewer org eclipse i working set iworkingset org eclipse progress ui job uijob org eclipse jdt core element changed event elementchangedevent org eclipse jdt core i classpath entry iclasspathentry org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i element changed listener ielementchangedlistener org eclipse jdt core i java element ijavaelement org eclipse jdt core i java element delta ijavaelementdelta org eclipse jdt core i java model ijavamodel org eclipse jdt core i java project ijavaproject org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt core java core javacore org eclipse jdt core java model exception javamodelexception org eclipse jdt internal corext util java model util javamodelutil org eclipse jdt preference constants preferenceconstants org eclipse jdt standard java element content provider standardjavaelementcontentprovider org eclipse jdt internal java plugin javaplugin org eclipse jdt internal working sets workingsets working set model workingsetmodel content provider package explorer packageexplorer content provider provide children flat hierarchical layout org eclipse jdt standard java element content provider standardjavaelementcontentprovider package explorer content provider packageexplorercontentprovider standard java element content provider standardjavaelementcontentprovider i element changed listener ielementchangedlistener i property change listener ipropertychangelistener original parent grant parent project tree viewer treeviewer f viewer fviewer object f input finput f is flat layout fisflatlayout f show libraries node fshowlibrariesnode f fold packages ffoldpackages collection runnable f pending updates fpendingupdates ui job uijob f update job fupdatejob creates content provider java elements param provide members providemembers members compilation units files package explorer content provider packageexplorercontentprovider provide members providemembers provide members providemembers f show libraries node fshowlibrariesnode f is flat layout fisflatlayout f fold packages ffoldpackages are packages folded in hierarchical layout arepackagesfoldedinhierarchicallayout f pending updates fpendingupdates java plugin javaplugin get default getdefault get preference store getpreferencestore add property change listener addpropertychangelistener f update job fupdatejob are packages folded in hierarchical layout arepackagesfoldedinhierarchicallayout preference constants preferenceconstants get preference store getpreferencestore get boolean getboolean preference constants preferenceconstants appearance fold packages explorer object get viewer input getviewerinput f input finput override element changed elementchanged element changed event elementchangedevent event array list arraylist runnable runnables array list arraylist input viewer deleted refresh avoid display stale elements input deleted inputdeleted runnables process delta processdelta event get delta getdelta runnables java model exception javamodelexception java plugin javaplugin log execute run nables executerunnables runnables execute run nables executerunnables collection runnable runnables post collected runnables control ctrl f viewer fviewer get control getcontrol ctrl ctrl is disposed isdisposed has pending updates haspendingupdates has pending updates haspendingupdates f pending updates fpendingupdates f pending updates fpendingupdates is empty isempty ui thread uithread spi n spin has pending updates haspendingupdates ctrl get display getdisplay get thread getthread thread current thread currentthread f viewer fviewer is busy isbusy run updates runupdates runnables f pending updates fpendingupdates f pending updates fpendingupdates runnables f pending updates fpendingupdates add all addall runnables post async update postasyncupdate ctrl get display getdisplay post async update postasyncupdate display display f update job fupdatejob f update job fupdatejob ui job uijob display packages messages packagesmessages package explorer content provider packageexplorercontentprovider update job description override i status istatus runinuithread i progress monitor iprogressmonitor monitor tree viewer treeviewer viewer f viewer fviewer viewer viewer is busy isbusy res chedule reschedule viewer busy bug schedule run pending updates runpendingupdates status status f update job fupdatejob set system setsystem f update job fupdatejob schedule runnables widget updates called display thread run pending updates runpendingupdates collection runnable pending updates pendingupdates pending updates pendingupdates f pending updates fpendingupdates f pending updates fpendingupdates pending updates pendingupdates f viewer fviewer control control f viewer fviewer get control getcontrol control control is disposed isdisposed run updates runupdates pending updates pendingupdates run updates runupdates collection runnable runnables iterator runnable runnable iterator runnableiterator runnables iterator runnable iterator runnableiterator has next hasnext runnable iterator runnableiterator input deleted inputdeleted collection runnable runnables f input finput f input finput i java element ijavaelement i java element ijavaelement f input finput exists f input finput i resource iresource i resource iresource f input finput exists f input finput working set model workingsetmodel https bugs eclipse org bugs bug cgi f input finput i working set iworkingset post refresh postrefresh f input finput original f input finput runnables override dispose dispose java core javacore remove element changed listener removeelementchangedlistener java plugin javaplugin get default getdefault get preference store getpreferencestore remove property change listener removepropertychangelistener override object get package fragment root content getpackagefragmentrootcontent i package fragment root ipackagefragmentroot root java model exception javamodelexception f is flat layout fisflatlayout get package fragment root content getpackagefragmentrootcontent root hierarchical mode array list arraylist object result array list arraylist get hierarchical package children gethierarchicalpackagechildren root result is project package fragment root isprojectpackagefragmentroot root object non java resources nonjavaresources root get non java resources getnonjavaresources non java resources nonjavaresources length result add non java resources nonjavaresources result to array toarray override object get package content getpackagecontent i package fragment ipackagefragment fragment java model exception javamodelexception f is flat layout fisflatlayout get package content getpackagecontent fragment hierarchical mode array list arraylist object result array list arraylist get hierarchical package children gethierarchicalpackagechildren i package fragment root ipackagefragmentroot fragment get parent getparent fragment result object non packages nonpackages get package content getpackagecontent fragment result is empty isempty non packages nonpackages non packages nonpackages length result add non packages nonpackages result to array toarray override object get folder content getfoldercontent i folder ifolder folder core exception coreexception f is flat layout fisflatlayout get folder content getfoldercontent folder hierarchical mode array list arraylist object result array list arraylist get hierarchical packages in folder gethierarchicalpackagesinfolder folder result object get folder content getfoldercontent folder result is empty isempty length result add result to array toarray override object get children getchildren object parent element parentelement parent element parentelement i java model ijavamodel concatenate get java projects getjavaprojects i java model ijavamodel parent element parentelement get non java projects getnonjavaprojects i java model ijavamodel parent element parentelement parent element parentelement package fragment root container packagefragmentrootcontainer get container package fragment roots getcontainerpackagefragmentroots package fragment root container packagefragmentrootcontainer parent element parentelement parent element parentelement i project iproject i project iproject project i project iproject parent element parentelement project is accessible isaccessible project members children get children getchildren parent element parentelement core exception coreexception children override object get package fragment roots getpackagefragmentroots i java project ijavaproject project java model exception javamodelexception project get project getproject is open isopen children list object result array list arraylist i package fragment root ipackagefragmentroot roots project get package fragment roots getpackagefragmentroots roots length i package fragment root ipackagefragmentroot root roots i classpath entry iclasspathentry classpath entry classpathentry root get raw classpath entry getrawclasspathentry entry kind entrykind classpath entry classpathentry get entry kind getentrykind entry kind entrykind i classpath entry iclasspathentry cpe container class path containers classpathcontainers f show libraries node fshowlibrariesnode entry kind entrykind i classpath entry iclasspathentry cpe library entry kind entrykind i classpath entry iclasspathentry cpe variable i resource iresource resource root get resource getresource resource project get resource getresource equals resource get parent getparent resource child project https bugs eclipse org bugs bug cgi result add resource skip add referenced library node is project package fragment root isprojectpackagefragmentroot root filter fragments correspond projects replace fragments object fragments get package fragment root content getpackagefragmentrootcontent root fragments length result add fragments result add root f show libraries node fshowlibrariesnode result add library container librarycontainer project separate loop containers classpath empty i classpath entry iclasspathentry raw classpath rawclasspath project get raw classpath getrawclasspath raw classpath rawclasspath length i classpath entry iclasspathentry classpath entry classpathentry raw classpath rawclasspath classpath entry classpathentry get entry kind getentrykind i classpath entry iclasspathentry cpe container result add class path container classpathcontainer project classpath entry classpathentry object resources project get non java resources getnonjavaresources resources length result add resources result to array toarray object get container package fragment roots getcontainerpackagefragmentroots package fragment root container packagefragmentrootcontainer container container get children getchildren object get non java projects getnonjavaprojects i java model ijavamodel model java model exception javamodelexception model get non java resources getnonjavaresources override object internal get parent internalgetparent object element f is flat layout fisflatlayout element i package fragment ipackagefragment get hierarchical package parent gethierarchicalpackageparent i package fragment ipackagefragment element element i package fragment root ipackagefragmentroot insert logical containers parent fragment roots refer container containers refer project i package fragment root ipackagefragmentroot root i package fragment root ipackagefragmentroot element i classpath entry iclasspathentry entry root get raw classpath entry getrawclasspathentry entry kind entrykind entry get entry kind getentrykind entry kind entrykind i classpath entry iclasspathentry cpe container class path container classpathcontainer root get java project getjavaproject entry f show libraries node fshowlibrariesnode entry kind entrykind i classpath entry iclasspathentry cpe library entry kind entrykind i classpath entry iclasspathentry cpe variable library container librarycontainer root get java project getjavaproject java model exception javamodelexception element package fragment root container packagefragmentrootcontainer package fragment root container packagefragmentrootcontainer element get java project getjavaproject internal get parent internalgetparent element override input changed inputchanged viewer viewer object old input oldinput object new input newinput input changed inputchanged viewer old input oldinput new input newinput f viewer fviewer tree viewer treeviewer viewer old input oldinput new input newinput java core javacore add element changed listener addelementchangedlistener old input oldinput new input newinput java core javacore remove element changed listener removeelementchangedlistener f input finput new input newinput hierarchical packages returns hierarchical packages fragment root param parent parent fragment root param fragment children children root param result collection elements java model exception javamodelexception f etc hing fetching children fails get hierarchical package children gethierarchicalpackagechildren i package fragment root ipackagefragmentroot parent i package fragment ipackagefragment fragment collection object result java model exception javamodelexception i java element ijavaelement children parent get children getchildren nls string prefix fragment fragment get element name getelementname prefix len prefixlen prefix length children length i package fragment ipackagefragment curr i package fragment ipackagefragment children string curr get element name getelementname starts with startswith prefix length prefix len prefixlen index of indexof prefix len prefixlen f fold packages ffoldpackages curr get folded getfolded children curr result add curr fragment curr is default package isdefaultpackage result add curr returns hierarchical packages folder param folder parent folder param result collection elements core exception coreexception thrown elements accessed get hierarchical packages in folder gethierarchicalpackagesinfolder i folder ifolder folder collection object result core exception coreexception i resource iresource resources folder members resources length i resource iresource resource resources resource i folder ifolder i folder ifolder curr i folder ifolder resource i java element ijavaelement element java core javacore create curr element i package fragment ipackagefragment f fold packages ffoldpackages i package fragment ipackagefragment fragment i package fragment ipackagefragment element i package fragment root ipackagefragmentroot root i package fragment root ipackagefragmentroot fragment get parent getparent element get folded getfolded root get children getchildren fragment result add element object get hierarchical package parent gethierarchicalpackageparent i package fragment ipackagefragment child string child get element name getelementname i package fragment root ipackagefragmentroot parent i package fragment root ipackagefragmentroot child get parent getparent last index of lastindexof string real parent name realparentname substring i package fragment ipackagefragment element parent get package fragment getpackagefragment real parent name realparentname element exists f fold packages ffoldpackages is empty isempty element find single package child findsinglepackagechild element parent get children getchildren get hierarchical package parent gethierarchicalpackageparent element java model exception javamodelexception element bug i resource iresource resource element get resource getresource resource resource parent get resource getresource i project iproject parent get java project getjavaproject parent i package fragment ipackagefragment get folded getfolded i java element ijavaelement children i package fragment ipackagefragment pack java model exception javamodelexception is empty isempty pack i package fragment ipackagefragment collapsed find single package child findsinglepackagechild pack children collapsed pack pack collapsed pack is empty isempty i package fragment ipackagefragment fragment java model exception javamodelexception fragment contains java resources containsjavaresources fragment get non java resources getnonjavaresources length i package fragment ipackagefragment find single package child findsinglepackagechild i package fragment ipackagefragment fragment i java element ijavaelement children string prefix fragment get element name getelementname prefix len prefixlen prefix length i package fragment ipackagefragment children length i java element ijavaelement element children string element get element name getelementname starts with startswith prefix length prefix len prefixlen index of indexof prefix len prefixlen i package fragment ipackagefragment element delta processing processes delta recursively children tree fully ref res hed refreshed starting node param delta delta process param runnables view runnables type link runnable returned conclusion refresh parent element siblings processed java model exception javamodelexception thrown access element failed process delta processdelta i java element delta ijavaelementdelta delta collection runnable runnables java model exception javamodelexception kind delta get kind getkind flags delta get flags getflags i java element ijavaelement element delta get element getelement element type elementtype element get element type getelementtype element type elementtype i java element ijavaelement java model element type elementtype i java element ijavaelement java project i java project ijavaproject proj element get java project getjavaproject todo needed parent open check proj proj get project getproject is open isopen element type elementtype i java element ijavaelement fragment flags i java element delta ijavaelementdelta content i java element delta ijavaelementdelta children i java element delta ijavaelementdelta content todo folders content files f is flat layout fisflatlayout object parent get hierarchical package parent gethierarchicalpackageparent i package fragment ipackagefragment element parent i package fragment root ipackagefragmentroot post refresh postrefresh internal get parent internalgetparent parent grant parent element runnables content change children info resource removed folder post refresh postrefresh internal get parent internalgetparent element parent element runnables f is flat layout fisflatlayout kind i java element delta ijavaelementdelta removed object parent get hierarchical package parent gethierarchicalpackageparent i package fragment ipackagefragment element parent i package fragment root ipackagefragmentroot post remove postremove element runnables post refresh postrefresh internal get parent internalgetparent parent grant parent element runnables kind i java element delta ijavaelementdelta object parent get hierarchical package parent gethierarchicalpackageparent i package fragment ipackagefragment element parent i package fragment root ipackagefragmentroot f fold packages ffoldpackages post refresh postrefresh parent parent element runnables post add postadd parent element runnables post refresh postrefresh internal get parent internalgetparent parent grant parent element runnables handle affected children handleaffectedchildren delta element runnables element type elementtype i java element ijavaelement compilation unit i compilation unit icompilationunit i compilation unit icompilationunit element java model util javamodelutil is primary isprimary get provide members getprovidemembers is working copy isworkingcopy kind i java element delta ijavaelementdelta changed kind i java element delta ijavaelementdelta changed isstructuralcuchange flags test moved todo is on class path isonclasspath expensive cheap tests is on class path isonclasspath element type elementtype i java element ijavaelement java project handle open closing project flags i java element delta ijavaelementdelta closed i java element delta ijavaelementdelta opened post refresh postrefresh element original element runnables path changed refresh entire project flags i java element delta ijavaelementdelta resolved classpath changed post refresh postrefresh element original element runnables bug kind i java element delta ijavaelementdelta post remove postremove element get resource getresource runnables post add postadd element get parent getparent element runnables kind i java element delta ijavaelementdelta removed object parent internal get parent internalgetparent element element i package fragment ipackagefragment refresh fragment root filtering empty parent packages bug f viewer fviewer test find item testfinditem parent post refresh postrefresh parent parent element runnables element i package fragment root ipackagefragmentroot libs folders library container resource original location i resource iresource resource element get resource getresource resource resource exists post remove postremove resource runnables post remove postremove element runnables parent i package fragment ipackagefragment post update icon postupdateicon i package fragment ipackagefragment parent runnables empty remove viewer is package fragment empty ispackagefragmentempty element get parent getparent f viewer fviewer test find item testfinditem parent post refresh postrefresh internal get parent internalgetparent parent grant parent element runnables kind i java element delta ijavaelementdelta object parent internal get parent internalgetparent element handle add itions additions spec ially specially parent i package fragment ipackagefragment object grandparent internal get parent internalgetparent parent avoid pos ting posting refresh invisible parent parent equals f input finput post refresh postrefresh parent parent element runnables refresh grandparent parent isn visible f viewer fviewer test find item testfinditem parent post refresh postrefresh grandparent grant parent element runnables post refresh postrefresh parent parent element runnables element i package fragment root ipackagefragmentroot i package fragment root ipackagefragmentroot element get kind getkind i package fragment root ipackagefragmentroot source libs folders library container project resource original location i resource iresource resource element get resource getresource resource object resource parent resourceparent internal get parent internalgetparent resource resource parent resourceparent i java project ijavaproject proj element get java project getjavaproject f show libraries node fshowlibrariesnode resource parent resourceparent equals proj post add postadd resource parent resourceparent resource runnables post add postadd parent element runnables element type elementtype i java element ijavaelement compilation unit element type elementtype i java element ijavaelement file kind i java element delta ijavaelementdelta changed isstructuralcuchange performed post refresh postrefresh element original element runnables element type elementtype i java element ijavaelement fragment root contents external jar changed flags i java element delta ijavaelementdelta archive content changed post refresh postrefresh element original element runnables http bugs eclipse org bugs bug cgi result flags i java element delta ijavaelementdelta content i java element delta ijavaelementdelta children object parent internal get parent internalgetparent element is parent lib ray container isparentlibraycontainer parent library container librarycontainer result i java element delta ijavaelementdelta content result i java element delta ijavaelementdelta children is parent lib ray container isparentlibraycontainer post refresh postrefresh parent parent element runnables is parent lib ray container isparentlibraycontainer i resource iresource resource element get resource getresource resource library container librarycontainer parent get java project getjavaproject get resource getresource equals resource get project getproject post refresh postrefresh resource original element runnables source attachment jar changed flags i java element delta ijavaelementdelta source attached sourceattached i java element delta ijavaelementdelta source detached sourcedetached post update icon postupdateicon element runnables is class path change isclasspathchange delta to wel towel full refresh java project post refresh postrefresh element get java project getjavaproject project element runnables handle affected children handleaffectedchildren delta element runnables isstructuralcuchange flags refresh working copy creation primary working copy flags i java element delta ijavaelementdelta children flags i java element delta ijavaelementdelta content i java element delta ijavaelementdelta fine grained i java element delta ijavaelementdelta content handle affected children handleaffectedchildren i java element delta ijavaelementdelta delta i java element ijavaelement element collection runnable runnables java model exception javamodelexception count i resource delta iresourcedelta resource deltas resourcedeltas delta get resource deltas getresourcedeltas resource deltas resourcedeltas resource deltas resourcedeltas length kind resource deltas resourcedeltas get kind getkind kind i resource delta iresourcedelta kind i resource delta iresourcedelta removed count i java element delta ijavaelementdelta affected children affectedchildren delta get affected children getaffectedchildren affected children affectedchildren length kind affected children affectedchildren get kind getkind kind i java element delta ijavaelementdelta kind i java element delta ijavaelementdelta removed count count child changed refresh element i package fragment ipackagefragment fragment empty refresh parent i java element ijavaelement parent i java element ijavaelement internal get parent internalgetparent element avoid pos ting posting refresh invisible parent element equals f input finput post refresh postrefresh element original element runnables post refresh postrefresh parent parent element runnables element i package fragment root ipackagefragmentroot object to refresh torefresh internal get parent internalgetparent element post refresh postrefresh to refresh torefresh original to refresh torefresh runnables post refresh postrefresh element original element runnables resource deltas resourcedeltas resource deltas resourcedeltas length process resource delta processresourcedelta resource deltas resourcedeltas element runnables early element ref res hed refreshed affected children affectedchildren length process delta processdelta affected children affectedchildren runnables early element ref res hed refreshed process affected children processaffectedchildren i java element delta ijavaelementdelta affected children affectedchildren collection runnable runnables java model exception javamodelexception affected children affectedchildren length process delta processdelta affected children affectedchildren runnables is on class path isonclasspath i compilation unit icompilationunit element i java project ijavaproject project element get java project getjavaproject project project exists project is on classpath isonclasspath element updates icon param element element update param runnables view runnables type link runnable post update icon postupdateicon i java element ijavaelement element collection runnable runnables runnables add runnable override itpui swt e x swtex npe closing workbench window f viewer fviewer update element string i basic property constants ibasicpropertyconstants image process resource delta param delta delta process param parent parent param runnables view runnables type link runnable parent ref res hed refreshed process resource delta processresourcedelta i resource delta iresourcedelta delta object parent collection runnable runnables status delta get kind getkind flags delta get flags getflags i resource iresource resource delta get resource getresource filter output folder resource optimized handling children parent status i resource delta iresourcedelta removed parent i package fragment ipackagefragment refresh level deal empty filtering properly post refresh postrefresh internal get parent internalgetparent parent parent parent runnables post remove postremove resource runnables status i resource delta iresourcedelta parent i package fragment ipackagefragment refresh level deal empty filtering properly post refresh postrefresh internal get parent internalgetparent parent parent parent runnables post add postadd parent resource runnables status i resource delta iresourcedelta changed flags i resource delta iresourcedelta type post refresh postrefresh parent parent resource runnables open close change project flags i resource delta iresourcedelta open post project state changed postprojectstatechanged internal get parent internalgetparent parent runnables i resource delta iresourcedelta resource deltas resourcedeltas delta get affected children getaffectedchildren count resource deltas resourcedeltas length kind resource deltas resourcedeltas get kind getkind kind i resource delta iresourcedelta kind i resource delta iresourcedelta removed count count post refresh postrefresh parent parent resource runnables resource deltas resourcedeltas length process resource delta processresourcedelta resource deltas resourcedeltas resource runnables early element ref res hed refreshed set is flat layout setisflatlayout f is flat layout fisflatlayout set show libraries node setshowlibrariesnode f show libraries node fshowlibrariesnode post refresh postrefresh object root relation object affected element affectedelement collection runnable runnables move refresh start viewer input is parent isparent root f input finput root i java model ijavamodel root f input finput list object to refresh torefresh array list arraylist to refresh torefresh add root augment element to refresh augmentelementtorefresh to refresh torefresh relation affected element affectedelement post refresh postrefresh to refresh torefresh runnables implemented subclasses add additional elements refresh param to refresh torefresh elements refresh param relation relation element link grant parent link parent link original link project param affected element affectedelement element augment element to refresh augmentelementtorefresh list object to refresh torefresh relation object affected element affectedelement is parent isparent object root object child object parent get parent getparent child parent parent equals root is parent isparent root parent post refresh postrefresh list object to refresh torefresh update labels updatelabels collection runnable runnables runnables add runnable override object elements to refresh torefresh to array toarray elements length object element elements element f viewer fviewer test find items testfinditems element length f viewer fviewer refresh element update labels updatelabels post add postadd object parent object element collection runnable runnables runnables add runnable override widget items f viewer fviewer test find items testfinditems element items length widget item items item tree item treeitem item is disposed isdisposed tree item treeitem parent item parentitem tree item treeitem item get parent item getparentitem parent item parentitem parent item parentitem is disposed isdisposed parent equals parent item parentitem get data getdata add element refresh f viewer fviewer add parent element post remove postremove object element collection runnable runnables runnables add runnable override f viewer fviewer test find items testfinditems element length f viewer fviewer remove element post project state changed postprojectstatechanged object root collection runnable runnables runnables add runnable override f viewer fviewer refresh root trigger synthetic selection change action refresh enable f viewer fviewer set selection setselection f viewer fviewer get selection getselection org eclipse jface util i property change listener ipropertychangelistener property change propertychange org eclipse jface util property change event propertychangeevent override property change propertychange property change event propertychangeevent event are packages folded in hierarchical layout arepackagesfoldedinhierarchicallayout f fold packages ffoldpackages f fold packages ffoldpackages are packages folded in hierarchical layout arepackagesfoldedinhierarchicallayout f viewer fviewer f viewer fviewer get control getcontrol is disposed isdisposed f viewer fviewer get control getcontrol set redraw setredraw object expanded objects expandedobjects f viewer fviewer get expanded elements getexpandedelements f viewer fviewer refresh f viewer fviewer set expanded elements setexpandedelements expanded objects expandedobjects f viewer fviewer get control getcontrol set redraw setredraw