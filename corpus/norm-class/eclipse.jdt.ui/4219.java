copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt actions java lang reflect invocation target exception invocationtargetexception java util array list arraylist org eclipse swt widgets shell org eclipse core runtime core exception coreexception org eclipse core resources i workspace runnable iworkspacerunnable org eclipse jface dialogs message dialog messagedialog org eclipse jface operation i runnable context irunnablecontext org eclipse jface viewers i structured selection istructuredselection org eclipse jface window window org eclipse jface text i rewrite target irewritetarget org eclipse jface text i text selection itextselection org eclipse i editor part ieditorpart org eclipse i workbench site iworkbenchsite org eclipse platformui org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i type itype org eclipse jdt core java model exception javamodelexception org eclipse jdt core dom ast parser astparser org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom i method binding imethodbinding org eclipse jdt core dom i type binding itypebinding org eclipse jdt internal corext code manipulation codemanipulation add unimplemented methods operation addunimplementedmethodsoperation org eclipse jdt internal corext dom ast nodes astnodes org eclipse jdt internal corext util java model util javamodelutil org eclipse jdt javaui org eclipse jdt internal i java help context ids ijavahelpcontextids org eclipse jdt internal java plugin javaplugin org eclipse jdt internal actions action messages actionmessages org eclipse jdt internal actions action util actionutil org eclipse jdt internal actions selection converter selectionconverter org eclipse jdt internal actions workbench runnable adapter workbenchrunnableadapter org eclipse jdt internal dialogs override method dialog overridemethoddialog org eclipse jdt internal java editor javaeditor compilation unit editor compilationuniteditor org eclipse jdt internal util busy indicator runnable context busyindicatorrunnablecontext org eclipse jdt internal util element validator elementvalidator org eclipse jdt internal util exception handler exceptionhandler adds unimplemented methods type action opens dialog user choose methods open parent compilation unit java editor result unsaved user decide accept able acceptable action applicable str uctured structured select ions selections elements type link org eclipse jdt core i type itype instantiated intended subclassed noextend intended subclassed clients override methods action overridemethodsaction selection dispatch action selectiondispatchaction dialog title string dialog title action messages actionmessages override methods action overridemethodsaction error title compilation unit editor compilation unit editor compilationuniteditor f editor feditor note constructor internal clients call constructor param editor compilation unit editor noreference constructor intended referenced clients override methods action overridemethodsaction compilation unit editor compilationuniteditor editor editor get editor site geteditorsite f editor feditor editor set enabled setenabled check enabled editor checkenablededitor creates override method action action requires selection site selection provider type link org eclipse jface viewers i structured selection istructuredselection param site workbench site providing context action override methods action overridemethodsaction i workbench site iworkbenchsite site site set text settext action messages actionmessages override methods action overridemethodsaction label set description setdescription action messages actionmessages override methods action overridemethodsaction description set tool tip text settooltiptext action messages actionmessages override methods action overridemethodsaction tooltip platformui get workbench getworkbench get help system gethelpsystem set help sethelp i java help context ids ijavahelpcontextids add unimplemented methods action can enable canenable i structured selection istructuredselection selection java model exception javamodelexception selection size selection get first element getfirstelement i type itype i type itype type i type itype selection get first element getfirstelement type get compilation unit getcompilationunit type is interface isinterface selection size selection get first element getfirstelement i compilation unit icompilationunit check enabled editor checkenablededitor f editor feditor selection converter selectionconverter can operate on canoperateon f editor feditor string get dialog title getdialogtitle dialog title i type itype get selected type getselectedtype i structured selection istructuredselection selection java model exception javamodelexception object elements selection to array toarray elements length elements i type itype i type itype type i type itype elements type get compilation unit getcompilationunit type is interface isinterface type elements i compilation unit icompilationunit i type itype type i compilation unit icompilationunit elements find primary type findprimarytype type type is interface isinterface type org eclipse jdt actions selection dispatch action selectiondispatchaction org eclipse jface viewers i structured selection istructuredselection override i structured selection istructuredselection selection i type itype type get selected type getselectedtype selection type message dialog messagedialog open information openinformation get shell getshell get dialog title getdialogtitle action messages actionmessages override methods action overridemethodsaction applicable notify result notifyresult element validator elementvalidator check type get shell getshell get dialog title getdialogtitle action util actionutil is editable iseditable get shell getshell type notify result notifyresult get shell getshell type core exception coreexception exception exception handler exceptionhandler handle exception get shell getshell get dialog title getdialogtitle action messages actionmessages override methods action overridemethodsaction error action failed actionfailed org eclipse jdt actions selection dispatch action selectiondispatchaction org eclipse jface text i text selection itextselection override i text selection itextselection selection i type itype type selection converter selectionconverter get type at offset gettypeatoffset f editor feditor type element validator elementvalidator check type get shell getshell get dialog title getdialogtitle action util actionutil is editable iseditable f editor feditor get shell getshell type notify result notifyresult type is annotation isannotation message dialog messagedialog open information openinformation get shell getshell get dialog title getdialogtitle action messages actionmessages override methods action overridemethodsaction annotation applicable notify result notifyresult get shell getshell type message dialog messagedialog open information openinformation get shell getshell get dialog title getdialogtitle action messages actionmessages override methods action overridemethodsaction applicable java model exception javamodelexception exception handler exceptionhandler handle get shell getshell get dialog title getdialogtitle core exception coreexception exception handler exceptionhandler handle get shell getshell get dialog title getdialogtitle action messages actionmessages override methods action overridemethodsaction error action failed actionfailed shell shell i type itype type core exception coreexception override method dialog overridemethoddialog dialog override method dialog overridemethoddialog shell f editor feditor type dialog has methods to override hasmethodstooverride message dialog messagedialog open information openinformation shell get dialog title getdialogtitle action messages actionmessages override methods action overridemethodsaction error notify result notifyresult dialog open window notify result notifyresult object selected dialog get result getresult selected notify result notifyresult array list arraylist i method binding imethodbinding methods array list arraylist selected length object elem selected elem i method binding imethodbinding methods add i method binding imethodbinding elem i method binding imethodbinding method to override methodtooverride methods to array toarray i method binding imethodbinding methods size i editor part ieditorpart editor javaui open i n editor openineditor type get compilation unit getcompilationunit i rewrite target irewritetarget target editor i rewrite target irewritetarget editor get adapter getadapter i rewrite target irewritetarget target target begin compound change begincompoundchange compilation unit compilationunit ast root astroot dialog get compilation unit getcompilationunit i type binding itypebinding type binding typebinding ast nodes astnodes get type binding gettypebinding ast root astroot type insert pos insertpos dialog get insert offset getinsertoffset add unimplemented methods operation addunimplementedmethodsoperation operation add unimplemented methods operation addunimplementedmethodsoperation create runnable createrunnable ast root astroot type binding typebinding method to override methodtooverride insert pos insertpos dialog get generate comment getgeneratecomment i runnable context irunnablecontext context java plugin javaplugin get active workbench window getactiveworkbenchwindow context context busy indicator runnable context busyindicatorrunnablecontext platformui get workbench getworkbench get progress service getprogressservice run i n i runinui context workbench runnable adapter workbenchrunnableadapter operation operation get scheduling rule getschedulingrule operation get scheduling rule getschedulingrule string created operation get created methods getcreatedmethods created created length message dialog messagedialog open information openinformation shell get dialog title getdialogtitle action messages actionmessages override methods action overridemethodsaction error invocation target exception invocationtargetexception exception exception handler exceptionhandler handle exception shell get dialog title getdialogtitle interrupted exception interruptedexception exception target target end compound change endcompoundchange notify result notifyresult returns runnable creates method stubs overridden methods param ast root astroot ast compilation unit work ast created link i compilation unit icompilationunit link ast parser astparser set source setsource i compilation unit icompilationunit param type binding type add methods type binding correspond type declaration ast param method to override methodtooverride bindings methods override code code implement unimplemented methods types param insert pos insertpos hint location source insert methods code code behavior param create comments createcomments comments methods returns runnable creates methods stubs illegal argument exception illegalargumentexception link illegal argument exception illegalargumentexception thrown ast passed created link i compilation unit icompilationunit i workspace runnable iworkspacerunnable create runnable createrunnable compilation unit compilationunit ast root astroot i type binding itypebinding type i method binding imethodbinding method to override methodtooverride insert pos insertpos create comments createcomments add unimplemented methods operation addunimplementedmethodsoperation operation add unimplemented methods operation addunimplementedmethodsoperation ast root astroot type method to override methodtooverride insert pos insertpos operation set create comments setcreatecomments create comments createcomments operation org eclipse jdt actions selection dispatch action selectiondispatchaction selection changed selectionchanged org eclipse jface viewers i structured selection istructuredselection override selection changed selectionchanged i structured selection istructuredselection selection set enabled setenabled can enable canenable selection java model exception javamodelexception exception java model util javamodelutil is exception to be log ged isexceptiontobelogged exception java plugin javaplugin log exception set enabled setenabled org eclipse jdt actions selection dispatch action selectiondispatchaction org eclipse jface text i text selection itextselection override selection changed selectionchanged i text selection itextselection selection