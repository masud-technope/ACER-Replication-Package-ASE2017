copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal debug thread groups threadgroups java util array list arraylist java util iterator java util list org eclipse core runtime core exception coreexception org eclipse debug core debug event debugevent org eclipse debug core debug exception debugexception org eclipse debug core debug plugin debugplugin org eclipse debug core i launch ilaunch org eclipse debug core model i stack frame istackframe org eclipse debug core model i thread ithread org eclipse debug internal viewers model provisional i model delta imodeldelta org eclipse debug internal viewers model provisional model delta modeldelta org eclipse debug internal viewers provisional abstract model proxy abstractmodelproxy org eclipse debug internal viewers update thread event handler threadeventhandler org eclipse jdt debug core i java debug target ijavadebugtarget org eclipse jdt debug core i java stack frame ijavastackframe org eclipse jdt debug core i java thread ijavathread org eclipse jdt debug core i java thread group ijavathreadgroup org eclipse jdt debug i java debug constants ijavadebuguiconstants org eclipse jdt internal debug core model jdi thread jdithread org eclipse jdt internal debug jdidebuguiplugin org eclipse jdt internal debug jdi debug preference initializer jdidebuguipreferenceinitializer org eclipse jdt internal debug monitors java element content provider javaelementcontentprovider org eclipse jdt internal debug snippet editor snippeteditor scrapbook launcher scrapbooklauncher org eclipse jface preference i preference store ipreferencestore org eclipse jface util i property change listener ipropertychangelistener org eclipse jface util property change event propertychangeevent org eclipse jface viewers viewer org eclipse swt events tree event treeevent org eclipse swt events tree listener treelistener org eclipse swt widgets control org eclipse swt widgets tree org eclipse swt widgets tree item treeitem org eclipse swt widgets widget java thread event handler javathreadeventhandler thread event handler threadeventhandler i property change listener ipropertychangelistener tree listener treelistener f display monitors fdisplaymonitors tree f tree ftree constructs event handler java thread param proxy java thread event handler javathreadeventhandler abstract model proxy abstractmodelproxy proxy proxy i preference store ipreferencestore preference store preferencestore jdidebuguiplugin get default getdefault get preference store getpreferencestore preference store preferencestore add property change listener addpropertychangelistener f display monitors fdisplaymonitors preference store preferencestore get boolean getboolean i java debug constants ijavadebuguiconstants pref monitor thread info init viewer viewer control control viewer get control getcontrol control tree f tree ftree tree control f tree ftree get display getdisplay async exec asyncexec runnable override f tree ftree add tree listener addtreelistener java thread event handler javathreadeventhandler javadoc org eclipse debug internal viewers update thread event handler threadeventhandler dispose override dispose f tree ftree f tree ftree remove tree listener removetreelistener i preference store ipreferencestore preference store preferencestore jdidebuguiplugin get default getdefault get preference store getpreferencestore preference store preferencestore remove property change listener removepropertychangelistener dispose override model delta modeldelta add path to thread addpathtothread model delta modeldelta delta i thread ithread thread java element content provider javaelementcontentprovider is display thread groups isdisplaythreadgroups i launch ilaunch launch thread get launch getlaunch i launch ilaunch launches debug plugin debugplugin get default getdefault get launch manager getlaunchmanager get launches getlaunches object launch children launchchildren launch get children getchildren delta delta add node addnode launch index of indexof launches launch i model delta imodeldelta change launch children launchchildren length i java debug target ijavadebugtarget debug target debugtarget i java debug target ijavadebugtarget thread get debug target getdebugtarget list i java thread group ijavathreadgroup groups array list arraylist i java thread group ijavathreadgroup delta delta add node addnode debug target debugtarget index of indexof launch children launchchildren debug target debugtarget i model delta imodeldelta change debug target debugtarget get root thread groups getrootthreadgroups length i java thread ijavathread java thread javathread i java thread ijavathread thread i java thread group ijavathreadgroup thread group threadgroup java thread javathread get thread group getthreadgroup thread group threadgroup groups add thread group threadgroup thread group threadgroup thread group threadgroup get thread group getthreadgroup iterator i java thread group ijavathreadgroup iterator groups iterator iterator has next hasnext i java thread group ijavathreadgroup group iterator i java thread group ijavathreadgroup parent group get thread group getthreadgroup parent index of indexof parent get thread groups getthreadgroups group threads displayed parent get threads getthreads length index of indexof debug target debugtarget get root thread groups getrootthreadgroups group delta delta add node addnode group i model delta imodeldelta change group get thread groups getthreadgroups length group get threads getthreads length debug exception debugexception jdidebuguiplugin log delta add path to thread addpathtothread delta thread override property change propertychange property change event propertychangeevent event event get property getproperty equals i java debug constants ijavadebuguiconstants pref monitor thread info f display monitors fdisplaymonitors jdi debug preference initializer jdidebuguipreferenceinitializer get boolean getboolean event is display monitors isdisplaymonitors f display monitors fdisplaymonitors javadoc org eclipse debug internal viewers update thread event handler threadeventhandler index of indexof org eclipse debug core model i stack frame istackframe override index of indexof i stack frame istackframe frame is display monitors isdisplaymonitors i java debug target ijavadebugtarget frame get debug target getdebugtarget supports monitor information supportsmonitorinformation i java thread ijavathread thread i java thread ijavathread frame get thread getthread thread get owned monitors getownedmonitors length thread get contended monitor getcontendedmonitor debug exception debugexception room monitor info element index of indexof frame returns number children thread view param thread thread number children override child count childcount i thread ithread thread i java thread ijavathread j thread jthread i java thread ijavathread thread count j thread jthread get frame count getframecount is display monitors isdisplaymonitors i java debug target ijavadebugtarget thread get debug target getdebugtarget supports monitor information supportsmonitorinformation count j thread jthread get owned monitors getownedmonitors length j thread jthread get contended monitor getcontendedmonitor count room monitor info element count count debug exception debugexception javadoc org eclipse debug internal viewers update thread event handler threadeventhandler index of indexof org eclipse debug core model i thread ithread override index of indexof i thread ithread thread java element content provider javaelementcontentprovider is display thread groups isdisplaythreadgroups i java thread ijavathread java thread javathread i java thread ijavathread thread index of indexof java thread javathread get thread group getthreadgroup get threads getthreads java thread javathread core exception coreexception index of indexof thread javadoc org eclipse debug internal viewers update thread event handler threadeventhandler handles event handlesevent org eclipse debug core debug event debugevent override handles event handlesevent debug event debugevent event handles event handlesevent event object source event get source getsource source i java thread ijavathread i java thread ijavathread thread i java thread ijavathread source i launch ilaunch launch thread get launch getlaunch launch launch get attribute getattribute scrapbook launcher scrapbooklauncher scrapbook launch event get kind getkind debug event debugevent suspend i java stack frame ijavastackframe frame i java stack frame ijavastackframe thread get top stack frame gettopstackframe frame frame get declaring type name getdeclaringtypename starts with startswith org eclipse jdt internal debug snippet editor snippeteditor scrapbook main scrapbookmain debug exception debugexception javadoc org eclipse swt events tree listener treelistener tree collapsed treecollapsed org eclipse swt events tree event treeevent override tree collapsed treecollapsed tree event treeevent user coll apses collapses thread remove thread select queue widget widget item widget tree item treeitem tree item treeitem item tree item treeitem widget object data item get data getdata data i java thread ijavathread remove queue d thread removequeuedthread i java thread ijavathread data javadoc org eclipse swt events tree listener treelistener tree expanded treeexpanded org eclipse swt events tree event treeevent override tree expanded treeexpanded tree event treeevent exp ands expands thread add thread select queue widget widget item widget tree item treeitem tree item treeitem item tree item treeitem widget object data item get data getdata data i java thread ijavathread queue suspended thread queuesuspendedthread i java thread ijavathread data update quiet resume suspend override handle other handleother debug event debugevent event event get detail getdetail jdi thread jdithread suspend quiet event get detail getdetail jdi thread jdithread resume quiet handle other handleother event returns thread missing required thread group order build proper delta bug returns code code displaying thread groups param event thread start death event code code thread group missing is missing required thread group ismissingrequiredthreadgroup debug event debugevent event java element content provider javaelementcontentprovider is display thread groups isdisplaythreadgroups object source event get source getsource source i java thread ijavathread retrieve thread group won add remove thread view path thread i java thread ijavathread thread i java thread ijavathread source thread get thread group getthreadgroup debug exception debugexception javadoc org eclipse debug internal viewers update thread event handler threadeventhandler handle create handlecreate org eclipse debug core debug event debugevent override handle create handlecreate debug event debugevent event is missing required thread group ismissingrequiredthreadgroup event don bother adding removing thread missing thread group handle create handlecreate event javadoc org eclipse debug internal viewers update thread event handler threadeventhandler handle terminate handleterminate org eclipse debug core debug event debugevent override handle terminate handleterminate debug event debugevent event is missing required thread group ismissingrequiredthreadgroup event don bother adding removing thread missing thread group handle terminate handleterminate event