copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal corext refactoring reorg java util array list arraylist java util list org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core resources i container icontainer org eclipse core resources i file ifile org eclipse core resources i folder ifolder org eclipse core resources i resource iresource org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i java element ijavaelement org eclipse jdt core i java project ijavaproject org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt internal corext refactoring refactoring core messages refactoringcoremessages org eclipse jdt internal corext refactoring util resource util resourceutil org eclipse jdt internal corext util messages org eclipse jdt java element labels javaelementlabels org eclipse jdt internal viewsupport basic element labels basicelementlabels overwrite helper overwritehelper object f destination fdestination i file ifile f files ffiles i file ifile i folder ifolder f folders ffolders i folder ifolder i compilation unit icompilationunit f cus fcus i compilation unit icompilationunit i package fragment root ipackagefragmentroot f roots froots i package fragment root ipackagefragmentroot i package fragment ipackagefragment f package fragments fpackagefragments i package fragment ipackagefragment set files setfiles i file ifile files is not null isnotnull files f files ffiles files set folders setfolders i folder ifolder folders is not null isnotnull folders f folders ffolders folders set cus setcus i compilation unit icompilationunit cus is not null isnotnull cus f cus fcus cus set package fragment roots setpackagefragmentroots i package fragment root ipackagefragmentroot roots is not null isnotnull roots f roots froots roots set packages setpackages i package fragment ipackagefragment fragments is not null isnotnull fragments f package fragments fpackagefragments fragments i file ifile get files without unconfirmed ones getfileswithoutunconfirmedones f files ffiles i folder ifolder get folders without unconfirmed ones getfolderswithoutunconfirmedones f folders ffolders i compilation unit icompilationunit get cus without unconfirmed ones getcuswithoutunconfirmedones f cus fcus i package fragment root ipackagefragmentroot get package fragment roots without unconfirmed ones getpackagefragmentrootswithoutunconfirmedones f roots froots i package fragment ipackagefragment get packages without unconfirmed ones getpackageswithoutunconfirmedones f package fragments fpackagefragments confirm over writing confirmoverwriting i reorg queries ireorgqueries reorg queries reorgqueries object destination is not null isnotnull destination is not null isnotnull reorg queries reorgqueries f destination fdestination destination confirm overwritting confirmoverwritting reorg queries reorgqueries confirm overwritting confirmoverwritting i reorg queries ireorgqueries reorg queries reorgqueries i confirm query iconfirmquery overwrite query overwritequery reorg queries reorgqueries create yes yes to all no no to all query createyesyestoallnonotoallquery refactoring core messages refactoringcoremessages overwrite helper overwritehelper i reorg queries ireorgqueries confirm over writing overwriting i confirm query iconfirmquery skip query skipquery reorg queries reorgqueries create skip query createskipquery refactoring core messages refactoringcoremessages overwrite helper overwritehelper i reorg queries ireorgqueries confirm skip ping skipping confirm file overwritting confirmfileoverwritting overwrite query overwritequery skip query skipquery confirm folder overwritting confirmfolderoverwritting skip query skipquery confirm cu overwritting confirmcuoverwritting overwrite query overwritequery confirm package fragment root overwritting confirmpackagefragmentrootoverwritting skip query skipquery overwrite query overwritequery confirm package overwritting confirmpackageoverwritting overwrite query overwritequery confirm package fragment root overwritting confirmpackagefragmentrootoverwritting i confirm query iconfirmquery skip query skipquery i confirm query iconfirmquery overwrite query overwritequery list i package fragment root ipackagefragmentroot to not overwrite tonotoverwrite array list arraylist f roots froots length i package fragment root ipackagefragmentroot root f roots froots can overwrite canoverwrite root root get resource getresource i container icontainer skip java element labels javaelementlabels get element label getelementlabel root java element labels javaelementlabels skip query skipquery to not overwrite tonotoverwrite add root overwrite root get resource getresource overwrite query overwritequery to not overwrite tonotoverwrite add root i package fragment root ipackagefragmentroot roots to not overwrite tonotoverwrite to array toarray i package fragment root ipackagefragmentroot to not overwrite tonotoverwrite size f roots froots array type converter arraytypeconverter to package fragment root array topackagefragmentrootarray reorg utils reorgutils set minus setminus f roots froots roots confirm cu overwritting confirmcuoverwritting i confirm query iconfirmquery overwrite query overwritequery list i compilation unit icompilationunit cus to not overwrite custonotoverwrite array list arraylist f cus fcus length i compilation unit icompilationunit f cus fcus can overwrite canoverwrite overwrite overwrite query overwritequery cus to not overwrite custonotoverwrite add i compilation unit icompilationunit cus cus to not overwrite custonotoverwrite to array toarray i compilation unit icompilationunit cus to not overwrite custonotoverwrite size f cus fcus array type converter arraytypeconverter to cu array tocuarray reorg utils reorgutils set minus setminus f cus fcus cus confirm folder overwritting confirmfolderoverwritting i confirm query iconfirmquery overwrite query overwritequery list i folder ifolder folders to not overwrite folderstonotoverwrite array list arraylist f folders ffolders length i folder ifolder folder f folders ffolders will overwrite willoverwrite folder skip basic element labels basicelementlabels get resource name getresourcename folder overwrite query overwritequery folders to not overwrite folderstonotoverwrite add folder i folder ifolder folders folders to not overwrite folderstonotoverwrite to array toarray i folder ifolder folders to not overwrite folderstonotoverwrite size f folders ffolders array type converter arraytypeconverter to folder array tofolderarray reorg utils reorgutils set minus setminus f folders ffolders folders confirm file overwritting confirmfileoverwritting i confirm query iconfirmquery overwrite query overwritequery i confirm query iconfirmquery skip query skipquery list i file ifile files to not overwrite filestonotoverwrite array list arraylist f files ffiles length i file ifile file f files ffiles will overwrite willoverwrite file i container icontainer destination i container icontainer resource util resourceutil get resource getresource f destination fdestination parent checker parentchecker is desc end ant of isdescendantof file destination find member findmember file get name getname skip basic element labels basicelementlabels get resource name getresourcename file skip query skipquery files to not overwrite filestonotoverwrite add file overwrite file overwrite query overwritequery files to not overwrite filestonotoverwrite add file i file ifile files files to not overwrite filestonotoverwrite to array toarray i file ifile files to not overwrite filestonotoverwrite size f files ffiles array type converter arraytypeconverter to file array tofilearray reorg utils reorgutils set minus setminus f files ffiles files confirm package overwritting confirmpackageoverwritting i confirm query iconfirmquery overwrite query overwritequery list i package fragment ipackagefragment to not overwrite tonotoverwrite array list arraylist f package fragments fpackagefragments length i package fragment ipackagefragment pack f package fragments fpackagefragments can overwrite canoverwrite pack overwrite pack overwrite query overwritequery to not overwrite tonotoverwrite add pack i package fragment ipackagefragment packages to not overwrite tonotoverwrite to array toarray i package fragment ipackagefragment to not overwrite tonotoverwrite size f package fragments fpackagefragments array type converter arraytypeconverter to package array topackagearray reorg utils reorgutils set minus setminus f package fragments fpackagefragments packages can overwrite canoverwrite i package fragment ipackagefragment pack f destination fdestination i package fragment root ipackagefragmentroot i package fragment root ipackagefragmentroot destination i package fragment root ipackagefragmentroot f destination fdestination destination equals pack get parent getparent destination get package fragment getpackagefragment pack get element name getelementname exists will overwrite willoverwrite pack get resource getresource resource override member destination will overwrite willoverwrite i resource iresource resource resource i resource iresource destination resource destinationresource resource util resourceutil get resource getresource f destination fdestination destination resource destinationresource equals resource get parent getparent destination resource destinationresource i container icontainer i container icontainer container i container icontainer destination resource destinationresource i resource iresource member container find member findmember resource get name getname member member exists can overwrite canoverwrite i package fragment root ipackagefragmentroot root f destination fdestination i java project ijavaproject i java project ijavaproject destination i java project ijavaproject f destination fdestination i folder ifolder conflict destination get project getproject get folder getfolder root get element name getelementname destination equals root get parent getparent conflict exists conflict members length core exception coreexception will overwrite willoverwrite root get resource getresource can overwrite canoverwrite i compilation unit icompilationunit f destination fdestination i package fragment ipackagefragment i package fragment ipackagefragment destination i package fragment ipackagefragment f destination fdestination destination equals get parent getparent destination get compilation unit getcompilationunit get element name getelementname exists will overwrite willoverwrite reorg utils reorgutils get resource getresource overwrite i resource iresource resource i confirm query iconfirmquery overwrite query overwritequery overwrite basic element labels basicelementlabels get resource name getresourcename resource overwrite query overwritequery overwrite i java element ijavaelement element i confirm query iconfirmquery overwrite query overwritequery overwrite java element labels javaelementlabels get element label getelementlabel element java element labels javaelementlabels overwrite query overwritequery overwrite string i confirm query iconfirmquery overwrite query overwritequery string question messages format refactoring core messages refactoringcoremessages overwrite helper overwritehelper basic element labels basicelementlabels get java element name getjavaelementname overwrite query overwritequery confirm question skip string i confirm query iconfirmquery overwrite query overwritequery string question messages format refactoring core messages refactoringcoremessages overwrite helper overwritehelper basic element labels basicelementlabels get java element name getjavaelementname overwrite query overwritequery confirm question