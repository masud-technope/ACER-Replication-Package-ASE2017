copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt core refactoring descriptors java util map org eclipse core runtime org eclipse core runtime i path ipath org eclipse core resources i file ifile org eclipse core resources i folder ifolder org eclipse core resources i resource iresource org eclipse ltk core refactoring refactoring contribution refactoringcontribution org eclipse ltk core refactoring refactoring core refactoringcore org eclipse ltk core refactoring refactoring status refactoringstatus org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i java element ijavaelement org eclipse jdt core i member imember org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt core refactoring i java refactorings ijavarefactorings org eclipse jdt internal core refactoring descriptors descriptor messages descriptormessages org eclipse jdt internal core refactoring descriptors java refactoring descriptor util javarefactoringdescriptorutil refactoring descriptor move refactoring instance refactoring descriptor calling link refactoring contribution refactoringcontribution create descriptor createdescriptor refactoring contribution requested invoking link refactoring core refactoringcore get refactoring contribution getrefactoringcontribution string refactoring note intended instantiated clients noinstantiate intended instantiated clients move descriptor movedescriptor java refactoring descriptor javarefactoringdescriptor destination attribute java element nls string attribute destination destination files attribute nls string attribute files files folders attribute nls string attribute folders folders fragments attribute nls string attribute fragments fragments members attribute nls string attribute members members nls string attribute patterns patterns policy attribute nls string attribute policy policy nls string attribute qualified qualified roots attribute nls string attribute roots roots target attribute resource nls string attribute target target units attribute nls string attribute units units move members policy nls string policy move members org eclipse jdt move members movemembers move packages policy nls string policy move packages org eclipse jdt move packages movepackages move resources policy nls string policy move resources org eclipse jdt move resources moveresources move fragment roots policy nls string policy move roots org eclipse jdt move roots moveroots destination i java element ijavaelement full i path ipath object f destination fdestination files i path ipath f files ffiles folders i path ipath f folders ffolders fragments i package fragment ipackagefragment f fragments ffragments members i member imember f members fmembers move policy string f move policy fmovepolicy patterns attribute string f patterns fpatterns qualified attribute f qualified fqualified references attribute f references freferences fragment roots i package fragment root ipackagefragmentroot f roots froots compilation units i compilation unit icompilationunit f units funits creates refactoring descriptor move descriptor movedescriptor i java refactorings ijavarefactorings move creates refactoring descriptor param project empty project refactoring code code workspace refactoring param description empty human readable description refactoring instance param comment human readable comment refactoring instance code code comment param arguments map arguments persisted describes settings refactoring param flags flags refactoring descriptor move descriptor movedescriptor string project string description string comment map string string arguments flags i java refactorings ijavarefactorings move project description comment arguments flags f move policy fmovepolicy java refactoring descriptor util javarefactoringdescriptorutil get string getstring f arguments farguments attribute policy f destination fdestination java refactoring descriptor util javarefactoringdescriptorutil get java element getjavaelement f arguments farguments attribute destination project f destination fdestination f destination fdestination java refactoring descriptor util javarefactoringdescriptorutil get resource path getresourcepath f arguments farguments attribute target project policy move resources equals f move policy fmovepolicy f references freferences java refactoring descriptor util javarefactoringdescriptorutil get boolean getboolean f arguments farguments attribute references f references freferences f qualified fqualified java refactoring descriptor util javarefactoringdescriptorutil get boolean getboolean f arguments farguments attribute qualified f qualified fqualified f patterns fpatterns java refactoring descriptor util javarefactoringdescriptorutil get string getstring f arguments farguments attribute patterns offset f files ffiles java refactoring descriptor util javarefactoringdescriptorutil get resource path array getresourcepatharray f arguments farguments attribute files attribute element offset project offset f files ffiles length f folders ffolders java refactoring descriptor util javarefactoringdescriptorutil get resource path array getresourcepatharray f arguments farguments attribute folders attribute element offset project offset f folders ffolders length f units funits i compilation unit icompilationunit java refactoring descriptor util javarefactoringdescriptorutil get java element array getjavaelementarray f arguments farguments attribute units attribute element offset project i compilation unit icompilationunit policy move roots equals f move policy fmovepolicy f roots froots i package fragment root ipackagefragmentroot java refactoring descriptor util javarefactoringdescriptorutil get java element array getjavaelementarray f arguments farguments attribute roots attribute element project i package fragment root ipackagefragmentroot policy move packages equals f move policy fmovepolicy f fragments ffragments i package fragment ipackagefragment java refactoring descriptor util javarefactoringdescriptorutil get java element array getjavaelementarray f arguments farguments attribute fragments attribute element project i package fragment ipackagefragment policy move members equals f move policy fmovepolicy f members fmembers i member imember java refactoring descriptor util javarefactoringdescriptorutil get java element array getjavaelementarray f arguments farguments attribute members attribute element project i member imember override populate argument map populateargumentmap populate argument map populateargumentmap java refactoring descriptor util javarefactoringdescriptorutil set string setstring f arguments farguments attribute policy f move policy fmovepolicy string project get project getproject f destination fdestination i java element ijavaelement java refactoring descriptor util javarefactoringdescriptorutil set java element setjavaelement f arguments farguments attribute destination project i java element ijavaelement f destination fdestination f destination fdestination i path ipath java refactoring descriptor util javarefactoringdescriptorutil set resource path setresourcepath f arguments farguments attribute target project i path ipath f destination fdestination policy move resources equals f move policy fmovepolicy java refactoring descriptor util javarefactoringdescriptorutil set boolean setboolean f arguments farguments attribute references f references freferences java refactoring descriptor util javarefactoringdescriptorutil set boolean setboolean f arguments farguments attribute qualified f qualified fqualified java refactoring descriptor util javarefactoringdescriptorutil set string setstring f arguments farguments attribute patterns f patterns fpatterns offset java refactoring descriptor util javarefactoringdescriptorutil set resource path array setresourcepatharray f arguments farguments attribute files attribute element project f files ffiles offset offset f files ffiles length java refactoring descriptor util javarefactoringdescriptorutil set resource path array setresourcepatharray f arguments farguments attribute folders attribute element project f folders ffolders offset offset f folders ffolders length java refactoring descriptor util javarefactoringdescriptorutil set java element array setjavaelementarray f arguments farguments attribute units attribute element project f units funits offset policy move roots equals f move policy fmovepolicy java refactoring descriptor util javarefactoringdescriptorutil set java element array setjavaelementarray f arguments farguments attribute roots attribute element project f roots froots policy move packages equals f move policy fmovepolicy java refactoring descriptor util javarefactoringdescriptorutil set java element array setjavaelementarray f arguments farguments attribute fragments attribute element project f fragments ffragments policy move members equals f move policy fmovepolicy java refactoring descriptor util javarefactoringdescriptorutil set java element array setjavaelementarray f arguments farguments attribute members attribute element project f members fmembers sets destination move note clients call code set destination setdestination code methods param element java element set destination setdestination i java element ijavaelement element is not null isnotnull element f destination fdestination element sets destination move note clients call code set destination setdestination code methods param resource resource set destination setdestination i resource iresource resource is not null isnotnull resource f destination fdestination resource get full path getfullpath sets file patterns qualified updating syntax file patterns sequence individual patterns separated comma add itionally additionally wildcard characters string character note file patterns qualified updating enabled calling link set update qualified names setupdatequalifiednames note qualified updating applicable files folders compilation units update qualified names param patterns empty file patterns string set file name patterns setfilenamepatterns string patterns is not null isnotnull patterns nls nls is legal islegal equals patterns pattern empty f patterns fpatterns patterns sets members move note clients call code setmovexxx code methods param members members move set move members setmovemembers i member imember members is not null isnotnull members nls is true istrue f move policy fmovepolicy clients call setmovexxx methods f members fmembers members f move policy fmovepolicy policy move members sets fragment roots move note clients call code setmovexxx code methods param roots fragment roots move set move package fragment roots setmovepackagefragmentroots i package fragment root ipackagefragmentroot roots is not null isnotnull roots nls is true istrue f move policy fmovepolicy clients call setmovexxx methods f roots froots roots f move policy fmovepolicy policy move roots sets fragments move note clients call code setmovexxx code methods param fragments fragments move set move packages setmovepackages i package fragment ipackagefragment fragments is not null isnotnull fragments nls is true istrue f move policy fmovepolicy clients call setmovexxx methods f fragments ffragments fragments f move policy fmovepolicy policy move packages sets resources compilation units move note clients call code setmovexxx code methods param files files move param folders folders move param units compilation units move set move resources setmoveresources i file ifile files i folder ifolder folders i compilation unit icompilationunit units is not null isnotnull files is not null isnotnull folders is not null isnotnull units nls is true istrue f move policy fmovepolicy clients call setmovexxx methods f files ffiles i path ipath files length files length f files ffiles files get full path getfullpath f folders ffolders i path ipath folders length folders length f folders ffolders folders get full path getfullpath f units funits units f move policy fmovepolicy policy move resources determines qualified names java element renamed qualified updating adapts fully qualified names java element renamed java text files clients file patterns calling link set file name patterns setfilenamepatterns string const rain constrain text files processed note qualified updating applicable files folders compilation units file patterns meaning files processed param update code code update qualified names code code set update qualified names setupdatequalifiednames update f qualified fqualified update determines references java element renamed param update code code update references code code set update references setupdatereferences update f references freferences update override refactoring status refactoringstatus validate descriptor validatedescriptor refactoring status refactoringstatus status validate descriptor validatedescriptor status has fatal error hasfatalerror f move policy fmovepolicy status merge refactoring status refactoringstatus create fatal error status createfatalerrorstatus descriptor messages descriptormessages move descriptor movedescriptor elements f destination fdestination status merge refactoring status refactoringstatus create fatal error status createfatalerrorstatus descriptor messages descriptormessages move descriptor movedescriptor destination status