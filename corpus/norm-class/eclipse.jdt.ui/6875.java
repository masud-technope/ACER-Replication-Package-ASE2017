copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt tests package view packageview java util array list arraylist java util list junit framework test case testcase org eclipse jdt test plugin testplugin java project helper javaprojecthelper org eclipse swt dnd dnd org eclipse core runtime i adaptable iadaptable org eclipse core resources i folder ifolder org eclipse text tests accessor org eclipse jface viewers i tree selection itreeselection org eclipse jface viewers tree path treepath org eclipse jface viewers tree selection treeselection org eclipse i workbench page iworkbenchpage org eclipse i working set iworkingset org eclipse i working set manager iworkingsetmanager org eclipse platformui org eclipse views navigator local selection transfer localselectiontransfer org eclipse jdt core i java project ijavaproject org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt javaui org eclipse jdt internal dnd jdt viewer drop adapter jdtviewerdropadapter org eclipse jdt internal package view packageview package explorer part packageexplorerpart org eclipse jdt internal package view packageview working set drop adapter workingsetdropadapter org eclipse jdt internal working sets workingsets i working set ds iworkingsetids org eclipse jdt internal working sets workingsets working set model workingsetmodel working set drop adapter test workingsetdropadaptertest test case testcase i java project ijavaproject f project fproject package explorer part packageexplorerpart f package explorer fpackageexplorer accessor f package explorer part accessor fpackageexplorerpartaccessor working set drop adapter workingsetdropadapter f adapter fadapter override set up setup exception set up setup f project fproject java project helper javaprojecthelper create java project createjavaproject test bin i workbench page iworkbenchpage active page activepage platformui get workbench getworkbench get active workbench window getactiveworkbenchwindow get active page getactivepage f package explorer fpackageexplorer package explorer part packageexplorerpart active page activepage show view showview javaui packages f package explorer part accessor fpackageexplorerpartaccessor accessor f package explorer fpackageexplorer package explorer part packageexplorerpart get name getname get class getclass get class loader getclassloader f adapter fadapter working set drop adapter workingsetdropadapter f package explorer fpackageexplorer override tear down teardown exception java project helper javaprojecthelper delete f project fproject i workbench page iworkbenchpage active page activepage platformui get workbench getworkbench get active workbench window getactiveworkbenchwindow get active page getactivepage active page activepage hide view hideview f package explorer fpackageexplorer assert true asserttrue f package explorer fpackageexplorer get tree viewer gettreeviewer get tree gettree is disposed isdisposed tear down teardown test invalid target testinvalidtarget exception i tree selection itreeselection selection create selection createselection f project fproject perform dn d performdnd dnd drop selection f project fproject test invalid source testinvalidsource exception i package fragment root ipackagefragmentroot root java project helper javaprojecthelper add source container addsourcecontainer f project fproject src i tree selection itreeselection selection create selection createselection root i working set iworkingset target platformui get workbench getworkbench get working set manager getworkingsetmanager create working set createworkingset target i adaptable iadaptable f project fproject perform dn d performdnd dnd drop selection target test invalid source testinvalidsource exception java project helper javaprojecthelper add source container addsourcecontainer f project fproject src i folder ifolder folder f project fproject get project getproject get folder getfolder folder folder create i tree selection itreeselection selection create selection createselection folder i working set iworkingset target platformui get workbench getworkbench get working set manager getworkingsetmanager create working set createworkingset target i adaptable iadaptable f project fproject perform dn d performdnd dnd drop selection target test add project testaddproject exception i tree selection itreeselection selection create selection createselection f project fproject i working set iworkingset target platformui get workbench getworkbench get working set manager getworkingsetmanager create working set createworkingset target i adaptable iadaptable perform dn d performdnd dnd drop copy selection target i adaptable iadaptable elements target get elements getelements assert equals assertequals elements length assert equals assertequals f project fproject elements test move project testmoveproject exception i working set iworkingset source platformui get workbench getworkbench get working set manager getworkingsetmanager create working set createworkingset source i adaptable iadaptable f project fproject list tree path treepath tree pathes treepathes array list arraylist tree pathes treepathes add tree path treepath object source f project fproject i tree selection itreeselection selection create selection createselection f project fproject tree pathes treepathes i working set iworkingset target platformui get workbench getworkbench get working set manager getworkingsetmanager create working set createworkingset target i adaptable iadaptable perform dn d performdnd dnd drop move selection target i adaptable iadaptable elements target get elements getelements assert equals assertequals elements length assert equals assertequals f project fproject elements elements source get elements getelements assert equals assertequals elements length test move to others project testmovetoothersproject exception i working set iworkingset source platformui get workbench getworkbench get working set manager getworkingsetmanager create working set createworkingset source i adaptable iadaptable f project fproject list tree path treepath tree pathes treepathes array list arraylist tree pathes treepathes add tree path treepath object source f project fproject i tree selection itreeselection selection create selection createselection f project fproject tree pathes treepathes i working set iworkingset target platformui get workbench getworkbench get working set manager getworkingsetmanager create working set createworkingset target i adaptable iadaptable target set i d setid i working set ds iworkingsetids perform dn d performdnd dnd drop move selection target i adaptable iadaptable elements target get elements getelements target doesn element working updated update r updater change source working assert equals assertequals elements length elements source get elements getelements assert equals assertequals elements length test rearrange testrearrange exception i working set iworkingset working sets workingsets create java working sets createjavaworkingsets string set working sets setworkingsets working sets workingsets i tree selection itreeselection selection create selection createselection working sets workingsets perform dn d performdnd dnd drop move selection working sets workingsets jdt viewer drop adapter jdtviewerdropadapter location i working set iworkingset actual f package explorer fpackageexplorer get working set model getworkingsetmodel get active working sets getactiveworkingsets assert equals assertequals working sets workingsets actual assert equals assertequals working sets workingsets actual assert equals assertequals working sets workingsets actual i working set iworkingset create java working sets createjavaworkingsets string names i working set manager iworkingsetmanager working set manager workingsetmanager platformui get workbench getworkbench get working set manager getworkingsetmanager names length i working set iworkingset working set workingset working set manager workingsetmanager get working set getworkingset names working set workingset working set manager workingsetmanager remove working set removeworkingset working set workingset i working set iworkingset sets i working set iworkingset names length names length i working set iworkingset working set workingset working set manager workingsetmanager create working set createworkingset names i adaptable iadaptable working set workingset set i d setid i working set ds iworkingsetids java working set manager workingsetmanager add working set addworkingset working set workingset sets working set workingset sets test rearrange testrearrange exception i working set iworkingset working sets workingsets create java working sets createjavaworkingsets string set working sets setworkingsets working sets workingsets i tree selection itreeselection selection create selection createselection working sets workingsets perform dn d performdnd dnd drop move selection working sets workingsets jdt viewer drop adapter jdtviewerdropadapter location i working set iworkingset actual f package explorer fpackageexplorer get working set model getworkingsetmodel get active working sets getactiveworkingsets assert equals assertequals working sets workingsets actual assert equals assertequals working sets workingsets actual assert equals assertequals working sets workingsets actual test rearrange testrearrange exception i working set iworkingset working sets workingsets create java working sets createjavaworkingsets string set working sets setworkingsets working sets workingsets i tree selection itreeselection selection create selection createselection working sets workingsets perform dn d performdnd dnd drop move selection working sets workingsets jdt viewer drop adapter jdtviewerdropadapter location i working set iworkingset actual f package explorer fpackageexplorer get working set model getworkingsetmodel get active working sets getactiveworkingsets assert equals assertequals working sets workingsets actual assert equals assertequals working sets workingsets actual assert equals assertequals working sets workingsets actual set working sets setworkingsets i working set iworkingset working sets workingsets working set model workingsetmodel model f package explorer fpackageexplorer get working set model getworkingsetmodel model f package explorer part accessor fpackageexplorerpartaccessor invoke create working set model createworkingsetmodel model f package explorer fpackageexplorer get working set model getworkingsetmodel model set active working sets setactiveworkingsets working sets workingsets model configured f package explorer fpackageexplorer root mode changed rootmodechanged package explorer part packageexplorerpart working sets roots i tree selection itreeselection create selection createselection object selected element selectedelement list tree path treepath tree pathes treepathes tree pathes treepathes tree pathes treepathes array list arraylist tree pathes treepathes add tree path treepath object selected element selectedelement tree selection treeselection tree pathes treepathes to array toarray tree path treepath tree pathes treepathes size f package explorer fpackageexplorer get tree viewer gettreeviewer get compare r getcomparer perform dn d performdnd validate result validateresult i tree selection itreeselection selection object target exception perform dn d performdnd validate result validateresult selection target dnd feedback select perform dn d performdnd validate result validateresult i tree selection itreeselection selection object target location exception local selection transfer localselectiontransfer get instance getinstance set selection setselection selection f adapter fadapter internal test set location internaltestsetlocation location result f adapter fadapter internal test validate target internaltestvalidatetarget target dnd drop assert equals assertequals validate result validateresult result validate result validateresult dnd drop f adapter fadapter internal test drop internaltestdrop target result local selection transfer localselectiontransfer get instance getinstance set selection setselection