copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal debug property pages propertypages java util array list arraylist java util list org eclipse core runtime core exception coreexception org eclipse debug core debug exception debugexception org eclipse debug core debug plugin debugplugin org eclipse debug core i launch ilaunch org eclipse debug core i launch manager ilaunchmanager org eclipse debug core model i debug element idebugelement org eclipse debug core model i debug target idebugtarget org eclipse debug core model i stack frame istackframe org eclipse debug core model i thread ithread org eclipse debug debuguitools org eclipse jdt debug core i java debug target ijavadebugtarget org eclipse jdt debug core i java thread ijavathread org eclipse jdt internal debug jdidebuguiplugin org eclipse jface viewers abstract tree viewer abstracttreeviewer org eclipse jface viewers check state changed event checkstatechangedevent org eclipse jface viewers checkbox tree viewer checkboxtreeviewer org eclipse jface viewers i check state listener icheckstatelistener org eclipse jface viewers i content provider icontentprovider org eclipse jface viewers i structured content provider istructuredcontentprovider org eclipse jface viewers i tree content provider itreecontentprovider org eclipse jface viewers viewer org eclipse swt swt org eclipse swt layout grid data griddata org eclipse swt widgets composite org eclipse swt widgets label thread filter editor threadfiltereditor java breakpoint advanced page javabreakpointadvancedpage f page fpage checkbox tree viewer checkboxtreeviewer f thread viewer fthreadviewer thread filter content provider threadfiltercontentprovider f content provider fcontentprovider check handler checkhandler f check handler fcheckhandler nls string main main thread filter editor threadfiltereditor composite parent java breakpoint advanced page javabreakpointadvancedpage f page fpage f content provider fcontentprovider thread filter content provider threadfiltercontentprovider f check handler fcheckhandler check handler checkhandler create thread viewer createthreadviewer parent create thread viewer createthreadviewer composite parent label label label parent swt label set text settext property page messages propertypagemessages thread filter editor threadfiltereditor label set font setfont parent get font getfont label set layout data setlayoutdata grid data griddata grid data griddata data grid data griddata grid data griddata fill data height hint heighthint f thread viewer fthreadviewer checkbox tree viewer checkboxtreeviewer parent swt border f thread viewer fthreadviewer add check state listener addcheckstatelistener f check handler fcheckhandler f thread viewer fthreadviewer get tree gettree set layout data setlayoutdata data f thread viewer fthreadviewer get tree gettree set font setfont parent get font getfont f thread viewer fthreadviewer set content provider setcontentprovider f content provider fcontentprovider f thread viewer fthreadviewer set label provider setlabelprovider debuguitools new debug model presentation newdebugmodelpresentation f thread viewer fthreadviewer set input setinput debug plugin debugplugin get default getdefault get launch manager getlaunchmanager set initial checked state setinitialcheckedstate do store dostore i debug target idebugtarget targets get debug targets getdebugtargets i java debug target ijavadebugtarget target i thread ithread threads i java thread ijavathread thread num targets numtargets targets length num targets numtargets target targets get adapter getadapter i java debug target ijavadebugtarget target f thread viewer fthreadviewer get checked getchecked target threads target get threads getthreads num threads numthreads threads length num threads numthreads thread i java thread ijavathread threads f thread viewer fthreadviewer get checked getchecked thread thread selected filtering f page fpage get breakpoint getbreakpoint set thread filter setthreadfilter thread filtered thread f page fpage get breakpoint getbreakpoint remove thread filter removethreadfilter target core exception coreexception jdidebuguiplugin log sets initial checked tree viewer initial reflect current breakpoint breakpoint thread filter thread thread checked set initial checked state setinitialcheckedstate i debug target idebugtarget targets get debug targets getdebugtargets num targets numtargets targets length num targets numtargets i java debug target ijavadebugtarget target targets get adapter getadapter i java debug target ijavadebugtarget target i java thread ijavathread filtered thread filteredthread f page fpage get breakpoint getbreakpoint get thread filter getthreadfilter target filtered thread filteredthread f check handler fcheckhandler check thread checkthread filtered thread filteredthread core exception coreexception jdidebuguiplugin log returns debug targets tree i debug target idebugtarget get debug targets getdebugtargets object input f thread viewer fthreadviewer get input getinput input i launch manager ilaunchmanager i java debug target ijavadebugtarget i launch manager ilaunchmanager launch manager launchmanager i launch manager ilaunchmanager input launch manager launchmanager get debug targets getdebugtargets check handler checkhandler i check state listener icheckstatelistener override check state changed checkstatechanged check state changed event checkstatechangedevent event object element event get element getelement element i debug target idebugtarget check target checktarget i debug target idebugtarget element event get checked getchecked element i thread ithread check thread checkthread i thread ithread element event get checked getchecked verify checked state verifycheckedstate check uncheck debug target tree viewer debug target checked attempt check target threads debug target unchecked uncheck threads check target checktarget i debug target idebugtarget target checked f thread viewer fthreadviewer set checked setchecked target checked checked f thread viewer fthreadviewer expand to level expandtolevel target abstract tree viewer abstracttreeviewer levels i thread ithread threads threads target get threads getthreads debug exception debugexception exception jdidebuguiplugin log exception i thread ithread thread checked thread checkedthread check main thread num threads numthreads threads length num threads numthreads thread threads string thread get name getname debug exception debugexception exception jdidebuguiplugin log exception main equals checked thread checkedthread f thread viewer fthreadviewer set checked setchecked thread thread checked thread checkedthread num threads numthreads threads length num threads numthreads f thread viewer fthreadviewer set checked setchecked threads unchecked i thread ithread threads threads target get threads getthreads debug exception debugexception exception jdidebuguiplugin log exception num threads numthreads threads length num threads numthreads f thread viewer fthreadviewer set checked setchecked threads check uncheck thread thread checked debug target checked thread unchecked uncheck debug target check thread checkthread i thread ithread thread checked f thread viewer fthreadviewer set checked setchecked thread checked i debug target idebugtarget target thread get debug target getdebugtarget checked unchecked simulate radio button behavior f thread viewer fthreadviewer get checked getchecked target f thread viewer fthreadviewer set checked setchecked target i thread ithread threads threads target get threads getthreads debug exception debugexception exception jdidebuguiplugin log exception num threads numthreads threads length num threads numthreads threads thread uncheck threads selected thread f thread viewer fthreadviewer set checked setchecked threads thread unchecked uncheck target f thread viewer fthreadviewer set checked setchecked target verify tree viewer user sel ects selects debug target select thread verify checked state verifycheckedstate i debug target idebugtarget targets get debug targets getdebugtargets i debug target idebugtarget target i thread ithread threads checked thread checkedthread num targets numtargets targets length num targets numtargets target targets f thread viewer fthreadviewer get checked getchecked target threads target get threads getthreads debug exception debugexception exception jdidebuguiplugin log exception checked thread checkedthread num threads numthreads threads length num threads numthreads f thread viewer fthreadviewer get checked getchecked threads checked thread checkedthread checked thread checkedthread f page fpage set error message seterrormessage f page fpage set error message seterrormessage property page messages propertypagemessages thread filter editor threadfiltereditor thread filter content provider threadfiltercontentprovider i tree content provider itreecontentprovider i tree content provider itreecontentprovider get children getchildren object override object get children getchildren object parent parent i debug target idebugtarget i java debug target ijavadebugtarget target i debug target idebugtarget parent get adapter getadapter i java debug target ijavadebugtarget target i java debug target ijavadebugtarget parent get threads getthreads debug exception debugexception jdidebuguiplugin log parent i launch manager ilaunchmanager list i java debug target ijavadebugtarget children array list arraylist i java debug target ijavadebugtarget i launch ilaunch launches i launch manager ilaunchmanager parent get launches getlaunches i debug target idebugtarget targets i java debug target ijavadebugtarget target num launches numlaunches launches length num launches numlaunches targets launches get debug targets getdebugtargets num targets numtargets targets length num targets numtargets target targets get adapter getadapter i java debug target ijavadebugtarget target target is disconnected isdisconnected target is terminated isterminated children add target children to array toarray object i tree content provider itreecontentprovider get parent getparent object override object get parent getparent object element element i thread ithread i thread ithread element get debug target getdebugtarget element i debug target idebugtarget i debug element idebugelement element get launch getlaunch element i launch ilaunch debug plugin debugplugin get default getdefault get launch manager getlaunchmanager i tree content provider itreecontentprovider has children haschildren object override has children haschildren object element element i stack frame istackframe element i debug element idebugelement get children getchildren element length element i launch ilaunch element i launch manager ilaunchmanager i launch manager ilaunchmanager element get launches getlaunches length i structured content provider istructuredcontentprovider get elements getelements object override object get elements getelements object input element inputelement get children getchildren input element inputelement i content provider icontentprovider dispose override dispose i content provider icontentprovider input changed inputchanged viewer object object override input changed inputchanged viewer viewer object old input oldinput object new input newinput