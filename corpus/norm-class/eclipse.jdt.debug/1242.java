copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal debug actions java util hash map hashmap java util map org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime i status istatus org eclipse core runtime status org eclipse core runtime jobs job org eclipse debug core debug plugin debugplugin org eclipse jdt core i type itype org eclipse jdt core dom compilation unit compilationunit org eclipse jdt debug core i java line breakpoint ijavalinebreakpoint org eclipse jdt debug core jdi debug model jdidebugmodel org eclipse jdt internal debug core breakpoints valid breakpoint location locator validbreakpointlocationlocator org eclipse jdt internal debug breakpoint utils breakpointutils org eclipse jdt internal debug jdidebuguiplugin org eclipse jface text bad location exception badlocationexception org eclipse jface text i document idocument org eclipse jface text i region iregion org eclipse jface text text selection textselection org eclipse osgi util nls org eclipse i editor part ieditorpart org eclipse texteditor i editor status line ieditorstatusline job verify position breakpoint breakpoint location verifier job breakpointlocationverifierjob job temporary breakpoint code code callee check breakpoint position i java line breakpoint ijavalinebreakpoint f breakpoint fbreakpoint number breakpoint requested f line number flinenumber qualified type temporary breakpoint code code f breakpoint fbreakpoint string f type name ftypename type breakpoint i type itype f type ftype current i editor part ieditorpart i editor part ieditorpart f editor part feditorpart parsed link compilation unit compilationunit compilation unit compilationunit f cunit fcunit document context i document idocument f document fdocument status display errors i editor status line ieditorstatusline f status line fstatusline guess breakpoint location f best match fbestmatch constructor param document param cunit param breakpoint param line number linenumber param type name typename param type param editor part editorpart param best match bestmatch breakpoint location verifier job breakpointlocationverifierjob i document idocument document compilation unit compilationunit cunit i java line breakpoint ijavalinebreakpoint breakpoint line number linenumber string type name typename i type itype type i editor part ieditorpart editor part editorpart best match bestmatch action messages actionmessages breakpoint location verifier job breakpointlocationverifierjob breakpoint location f cunit fcunit cunit f document fdocument document f breakpoint fbreakpoint breakpoint f line number flinenumber line number linenumber f type name ftypename type name typename f type ftype type f editor part feditorpart editor part editorpart f best match fbestmatch best match bestmatch f status line fstatusline editor part editorpart get adapter getadapter i editor status line ieditorstatusline set system setsystem javadoc org eclipse core runtime jobs job org eclipse core runtime i progress monitor iprogressmonitor override i status istatus i progress monitor iprogressmonitor monitor valid breakpoint location locator validbreakpointlocationlocator locator valid breakpoint location locator validbreakpointlocationlocator f cunit fcunit f line number flinenumber f best match fbestmatch f cunit fcunit accept locator line number linenumber locator get line location getlinelocation string type name typename locator get fully qualified type name getfullyqualifiedtypename locator get location type getlocationtype valid breakpoint location locator validbreakpointlocationlocator location manage line breakpoint managelinebreakpoint type name typename line number linenumber valid breakpoint location locator validbreakpointlocationlocator location method f breakpoint fbreakpoint debug plugin debugplugin get default getdefault get breakpoint manager getbreakpointmanager remove breakpoint removebreakpoint f breakpoint fbreakpoint toggle breakpoint adapter togglebreakpointadapter toggle method breakpoints togglemethodbreakpoints f editor part feditorpart text selection textselection locator get member offset getmemberoffset valid breakpoint location locator validbreakpointlocationlocator location field f breakpoint fbreakpoint debug plugin debugplugin get default getdefault get breakpoint manager getbreakpointmanager remove breakpoint removebreakpoint f breakpoint fbreakpoint toggle breakpoint adapter togglebreakpointadapter toggle watch points togglewatchpoints f editor part feditorpart text selection textselection locator get member offset getmemberoffset find valid location report action messages actionmessages breakpoint location verifier job breakpointlocationverifierjob valid location f breakpoint fbreakpoint debug plugin debugplugin get default getdefault get breakpoint manager getbreakpointmanager remove breakpoint removebreakpoint f breakpoint fbreakpoint status i status istatus jdidebuguiplugin get unique identifier getuniqueidentifier i status istatus error action messages actionmessages breakpoint location verifier job breakpointlocationverifierjob valid location core exception coreexception jdidebuguiplugin log status i status istatus jdidebuguiplugin get unique identifier getuniqueidentifier i status istatus action messages actionmessages breakpoint location verifier job breakpointlocationverifierjob breakpoint determines placement breakpoint ensures duplicates created not ification notification event collisions param type name typename fully qualified type add breakpoint param line number linenumber number breakpoint status breakpoint placement i status istatus manage line breakpoint managelinebreakpoint string type name typename line number linenumber different line number differentlinenumber line number linenumber f line number flinenumber i java line breakpoint ijavalinebreakpoint breakpoint jdi debug model jdidebugmodel line breakpoint exists linebreakpointexists f breakpoint fbreakpoint get marker getmarker get resource getresource type name typename line number linenumber breakpoint exist breakpointexist breakpoint f breakpoint fbreakpoint breakpoint exist breakpointexist different line number differentlinenumber breakpoint valid report nls bind action messages actionmessages breakpoint location verifier job breakpointlocationverifierjob string integer to string tostring line number linenumber status i status istatus jdidebuguiplugin get unique identifier getuniqueidentifier i status istatus error action messages actionmessages breakpoint location verifier job breakpointlocationverifierjob valid location breakpoint valid requested removing existing breakpoint debug plugin debugplugin get default getdefault get breakpoint manager getbreakpointmanager remove breakpoint removebreakpoint breakpoint status i status istatus jdidebuguiplugin get unique identifier getuniqueidentifier i status istatus action messages actionmessages breakpoint location verifier job breakpointlocationverifierjob breakpoint removed breakpointremoved create new breakpoint createnewbreakpoint line number linenumber type name typename status i status istatus jdidebuguiplugin get unique identifier getuniqueidentifier i status istatus action messages actionmessages breakpoint location verifier job breakpointlocationverifierjob breakpoint different line number differentlinenumber breakpoint exist breakpointexist breakpoint valid debug plugin debugplugin get default getdefault get breakpoint manager getbreakpointmanager remove breakpoint removebreakpoint f breakpoint fbreakpoint report nls bind action messages actionmessages breakpoint location verifier job breakpointlocationverifierjob string integer to string tostring line number linenumber status i status istatus jdidebuguiplugin get unique identifier getuniqueidentifier i status istatus error action messages actionmessages breakpoint location verifier job breakpointlocationverifierjob valid location replace breakpoint replacebreakpoint line number linenumber type name typename status i status istatus jdidebuguiplugin get unique identifier getuniqueidentifier i status istatus warning action messages actionmessages breakpoint location verifier job breakpointlocationverifierjob breakpoint moved to valid position breakpointmovedtovalidposition type name typename equals f type name ftypename replace breakpoint replacebreakpoint line number linenumber type name typename status i status istatus jdidebuguiplugin get unique identifier getuniqueidentifier i status istatus warning action messages actionmessages breakpoint location verifier job breakpointlocationverifierjob breakpoint set to right type breakpointsettorighttype core exception coreexception jdidebuguiplugin log status i status istatus jdidebuguiplugin get unique identifier getuniqueidentifier i status istatus action messages actionmessages breakpoint location verifier job breakpointlocationverifierjob breakpoint remove temporary breakpoint create breakpoint position replace breakpoint replacebreakpoint line number linenumber string type name typename core exception coreexception create new breakpoint createnewbreakpoint line number linenumber type name typename debug plugin debugplugin get default getdefault get breakpoint manager getbreakpointmanager remove breakpoint removebreakpoint f breakpoint fbreakpoint create breakpoint position create new breakpoint createnewbreakpoint line number linenumber string type name typename core exception coreexception map string object new attributes newattributes hash map hashmap string object start f type ftype i region iregion f document fdocument get line information getlineinformation line number linenumber start get offset getoffset start get length getlength bad location exception badlocationexception ble jdidebuguiplugin log ble breakpoint utils breakpointutils add java breakpoint attributes addjavabreakpointattributes new attributes newattributes f type ftype jdi debug model jdidebugmodel create line breakpoint createlinebreakpoint f breakpoint fbreakpoint get marker getmarker get resource getresource type name typename line number linenumber start new attributes newattributes reports status current active workbench shell param message message display report string message jdidebuguiplugin get standard display getstandarddisplay async exec asyncexec runnable override f status line fstatusline f status line fstatusline set message setmessage message