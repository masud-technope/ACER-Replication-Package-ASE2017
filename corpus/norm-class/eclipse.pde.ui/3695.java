copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal core search org eclipse pde core i ide ntifiable iidentifiable java util array list arraylist java util regex pattern org eclipse core runtime i progress monitor iprogressmonitor org eclipse pde core plugin org eclipse pde internal core util pattern constructor patternconstructor plugin search operation pluginsearchoperation plugin search input pluginsearchinput f input finput i search result collector isearchresultcollector f collector fcollector pattern f pattern fpattern plugin search operation pluginsearchoperation plugin search input pluginsearchinput input i search result collector isearchresultcollector collector f input finput input f collector fcollector collector f pattern fpattern pattern constructor patternconstructor create pattern createpattern input get search string getsearchstring input is case sensitive iscasesensitive execute i progress monitor iprogressmonitor monitor i plugin model base ipluginmodelbase entries f input finput get search scope getsearchscope get matching models getmatchingmodels nls monitor begin task begintask entries length entries length i plugin model base ipluginmodelbase candidate entries visit candidate monitor worked monitor visit i plugin model base ipluginmodelbase model array list arraylist i ide ntifiable iidentifiable matches find match findmatch model matches size f collector fcollector accept matches array list arraylist i ide ntifiable iidentifiable find match findmatch i plugin model base ipluginmodelbase model array list arraylist i ide ntifiable iidentifiable result array list arraylist i ide ntifiable iidentifiable search limit searchlimit f input finput get search limit getsearchlimit f input finput get search element getsearchelement plugin search input pluginsearchinput element plugin search limit searchlimit plugin search input pluginsearchinput limit references find plugin declaration findplugindeclaration model result search limit searchlimit plugin search input pluginsearchinput limit declarations find plugin references findpluginreferences model result plugin search input pluginsearchinput element fragment find fragment declaration findfragmentdeclaration model result plugin search input pluginsearchinput element extension point search limit searchlimit plugin search input pluginsearchinput limit references find extension point declarations findextensionpointdeclarations model result search limit searchlimit plugin search input pluginsearchinput limit declarations find extension point references findextensionpointreferences model result result find fragment declaration findfragmentdeclaration i plugin model base ipluginmodelbase model array list arraylist i ide ntifiable iidentifiable result i plugin base ipluginbase plugin base pluginbase model get plugin base getpluginbase plugin base pluginbase i fragment ifragment f pattern fpattern matcher plugin base pluginbase get id getid matches result add plugin base pluginbase find plugin declaration findplugindeclaration i plugin model base ipluginmodelbase model array list arraylist i ide ntifiable iidentifiable result i plugin base ipluginbase plugin base pluginbase model get plugin base getpluginbase plugin base pluginbase i plugin iplugin f pattern fpattern matcher plugin base pluginbase get id getid matches result add plugin base pluginbase find plugin references findpluginreferences i plugin model base ipluginmodelbase model array list arraylist i ide ntifiable iidentifiable result i plugin base ipluginbase plugin base pluginbase model get plugin base getpluginbase plugin base pluginbase i fragment ifragment f pattern fpattern matcher i fragment ifragment plugin base pluginbase get plugin id getpluginid matches result add plugin base pluginbase i plugin import ipluginimport imports plugin base pluginbase get imports getimports imports length f pattern fpattern matcher imports get id getid matches result add imports find extension point declarations findextensionpointdeclarations i plugin model base ipluginmodelbase model array list arraylist i ide ntifiable iidentifiable result i plugin extension point ipluginextensionpoint extension points extensionpoints model get plugin base getpluginbase get extension points getextensionpoints extension points extensionpoints length f pattern fpattern matcher extension points extensionpoints get full id getfullid matches result add extension points extensionpoints find extension point references findextensionpointreferences i plugin model base ipluginmodelbase model array list arraylist i ide ntifiable iidentifiable result i plugin extension ipluginextension extensions model get plugin base getpluginbase get extensions getextensions extensions length f pattern fpattern matcher extensions get point getpoint matches result add extensions