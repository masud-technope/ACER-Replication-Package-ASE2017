copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal debug org eclipse core runtime core exception coreexception org eclipse debug core model i variable ivariable org eclipse debug internal swt factory swtfactory org eclipse debug internal model elements element content provider elementcontentprovider org eclipse debug internal viewers model provisional i children update ichildrenupdate org eclipse debug internal viewers model provisional i presentation context ipresentationcontext org eclipse debug internal viewers model provisional i viewer update iviewerupdate org eclipse debug internal viewers model provisional i viewer update listener iviewerupdatelistener org eclipse debug internal viewers model provisional presentation context presentationcontext org eclipse debug internal viewers model provisional tree model viewer treemodelviewer org eclipse debug internal views variables details default detail pane defaultdetailpane org eclipse debug internal views variables details detail pane proxy detailpaneproxy org eclipse debug internal views variables details i detail pane container idetailpanecontainer org eclipse debug abstract debug view abstractdebugview org eclipse debug idebuguiconstants org eclipse jface dialogs i dialog settings idialogsettings org eclipse jface text abstract information control abstractinformationcontrol org eclipse jface text i information control iinformationcontrol org eclipse jface text i information control creator iinformationcontrolcreator org eclipse jface text i information control extension iinformationcontrolextension org eclipse jface viewers i structured selection istructuredselection org eclipse jface viewers structured viewer structuredviewer org eclipse jface viewers tree path treepath org eclipse jface viewers tree selection treeselection org eclipse jface viewers viewer filter viewerfilter org eclipse swt swt org eclipse swt custom sash form sashform org eclipse swt events selection event selectionevent org eclipse swt events selection listener selectionlistener org eclipse swt graphics color org eclipse swt graphics point org eclipse swt layout grid data griddata org eclipse swt layout grid layout gridlayout org eclipse swt widgets composite org eclipse swt widgets layout org eclipse swt widgets shell org eclipse swt widgets tree org eclipse i workbench page iworkbenchpage org eclipse i workbench part site iworkbenchpartsite creates control display expression hover control noextend intended subclassed clients expression information control creator expressioninformationcontrolcreator i information control creator iinformationcontrolcreator expression information control expressioninformationcontrol abstract information control abstractinformationcontrol i information control extension iinformationcontrolextension dialog setting key height nls string height height dialog setting key width nls string width width dialog setting key tree sash weight nls string sash weight tree sash weight tree sashweighttree dialog setting key details sash weight nls string sash weight details sash weight details sashweightdetails variable display i variable ivariable f variable fvariable i presentation context ipresentationcontext f context fcontext tree model viewer treemodelviewer f viewer fviewer sash form sashform f sash form fsashform composite f detail pane composite fdetailpanecomposite detail pane proxy detailpaneproxy f detail pane fdetailpane tree f tree ftree creates content root element tree viewer hover tree root treeroot element content provider elementcontentprovider javadoc org eclipse debug internal viewers model provisional elements element content provider elementcontentprovider get child count getchildcount java lang object org eclipse debug internal viewers provisional i presentation context ipresentationcontext override get child count getchildcount object element i presentation context ipresentationcontext context i viewer update iviewerupdate monitor core exception coreexception javadoc org eclipse debug internal viewers model provisional elements element content provider elementcontentprovider get children getchildren java lang object org eclipse debug internal viewers provisional i presentation context ipresentationcontext override object get children getchildren object parent length i presentation context ipresentationcontext context i viewer update iviewerupdate monitor core exception coreexception object f variable fvariable javadoc org eclipse debug internal viewers model provisional elements element content provider elementcontentprovider supports context id supportscontextid java lang string override supports context id supportscontextid string implementing i detail pane container idetailpanecontainer methods handles detail pane limited access detail pane proxy detail pane container detailpanecontainer i detail pane container idetailpanecontainer javadoc org eclipse debug internal views variables details i detail pane container idetailpanecontainer get current pane d getcurrentpaneid override string get current pane d getcurrentpaneid f detail pane fdetailpane get current pane d getcurrentpaneid javadoc org eclipse debug internal views variables details i detail pane container idetailpanecontainer get current selection getcurrentselection override i structured selection istructuredselection get current selection getcurrentselection i structured selection istructuredselection f viewer fviewer get selection getselection javadoc org eclipse debug internal views variables details i detail pane container idetailpanecontainer refresh detail pane contents refreshdetailpanecontents override refresh detail pane contents refreshdetailpanecontents f detail pane fdetailpane display get current selection getcurrentselection javadoc org eclipse debug internal views variables details i detail pane container idetailpanecontainer get parent composite getparentcomposite override composite get parent composite getparentcomposite f detail pane composite fdetailpanecomposite javadoc org eclipse debug internal views variables details i detail pane container idetailpanecontainer get workbench part site getworkbenchpartsite override i workbench part site iworkbenchpartsite get workbench part site getworkbenchpartsite javadoc org eclipse debug internal views variables details i detail pane container idetailpanecontainer pane changed panechanged java lang string override pane changed panechanged string new pane d newpaneid new pane d newpaneid equals default detail pane defaultdetailpane f detail pane fdetailpane get current control getcurrentcontrol set foreground setforeground get shell getshell get display getdisplay get system color getsystemcolor swt color info for eground foreground f detail pane fdetailpane get current control getcurrentcontrol set background setbackground get shell getshell get display getdisplay get system color getsystemcolor swt color info background constructs control shell param parent shell parentshell shell param resize resize supported expression information control expressioninformationcontrol shell parent shell parentshell resize parent shell parentshell resize create javadoc org eclipse jface text abstract information control abstractinformationcontrol compute size hint computesizehint override point compute size hint computesizehint i dialog settings idialogsettings settings get dialog settings getdialogsettings settings get int setting getintsetting settings width get int setting getintsetting settings height point compute size hint computesizehint returns dialog settings hover code code param create create settings i dialog settings idialogsettings get dialog settings getdialogsettings create i dialog settings idialogsettings settings jdidebuguiplugin get default getdefault get dialog settings getdialogsettings i dialog settings idialogsettings settings get section getsection get class getclass get name getname create settings add new section addnewsection get class getclass get name getname returns int eger integer dialog settings param settings dialog settings param key key get int setting getintsetting i dialog settings idialogsettings settings string key settings get int getint key number format exception numberformatexception javadoc org eclipse jface text abstract information control abstractinformationcontrol dispose override dispose persist settings persistsettings get shell getshell f context fcontext dispose dispose per sists persists dialog settings param shell persist settings persistsettings shell shell shell shell is disposed isdisposed is resizable isresizable i dialog settings idialogsettings settings get dialog settings getdialogsettings point size shell get size getsize settings width size settings height size weights f sash form fsashform get weights getweights settings sash weight tree weights settings sash weight details weights javadoc org eclipse jface text abstract information control abstractinformationcontrol set visible setvisible override set visible setvisible visible visible persist settings persistsettings get shell getshell set visible setvisible visible javadoc org eclipse jface text abstract information control abstractinformationcontrol create content createcontent org eclipse swt widgets composite override create content createcontent composite parent f sash form fsashform sash form sashform parent parent get style getstyle f sash form fsashform set orientation setorientation swt vertical update presentation context abstract debug view abstractdebugview view get view to emulate getviewtoemulate f context fcontext presentation context presentationcontext idebuguiconstants variable view view copy properties i presentation context ipresentationcontext copy tree model viewer treemodelviewer view get viewer getviewer get presentation context getpresentationcontext string properties copy get properties getproperties properties length string key properties f context fcontext set property setproperty key copy get property getproperty key f viewer fviewer tree model viewer treemodelviewer f sash form fsashform swt trim swt multi swt virtual f context fcontext f viewer fviewer set auto expand level setautoexpandlevel view copy filters structured viewer structuredviewer str uctured viewer structuredviewer structured viewer structuredviewer view get viewer getviewer str uctured viewer structuredviewer viewer filter viewerfilter filters str uctured viewer structuredviewer get filters getfilters filters length f viewer fviewer add filter addfilter filters f detail pane composite fdetailpanecomposite swt factory swtfactory create composite createcomposite f sash form fsashform grid data griddata fill layout layout f detail pane composite fdetailpanecomposite get layout getlayout layout grid layout gridlayout grid layout gridlayout grid layout gridlayout layout margin height marginheight margin width marginwidth f detail pane fdetailpane detail pane proxy detailpaneproxy detail pane container detailpanecontainer bring pane user doesn empty composite f detail pane fdetailpane display f tree ftree f viewer fviewer get tree gettree f tree ftree add selection listener addselectionlistener selection listener selectionlistener override widget selected widgetselected selection event selectionevent f detail pane fdetailpane display i structured selection istructuredselection f viewer fviewer get selection getselection override widget default selected widgetdefaultselected selection event selectionevent init sash weights initsashweights add update listener auto select display details root expression f viewer fviewer add viewer update listener addviewerupdatelistener i viewer update listener iviewerupdatelistener override viewer updates complete viewerupdatescomplete override viewer updates begin viewerupdatesbegin override update started updatestarted i viewer update iviewerupdate update override update complete updatecomplete i viewer update iviewerupdate update update i children update ichildrenupdate tree selection treeselection selection tree selection treeselection tree path treepath object f variable fvariable f viewer fviewer set selection setselection selection f detail pane fdetailpane display selection f viewer fviewer remove viewer update listener removeviewerupdatelistener set foreground color setforegroundcolor get shell getshell get display getdisplay get system color getsystemcolor swt color info for eground foreground set background color setbackgroundcolor get shell getshell get display getdisplay get system color getsystemcolor swt color info background attempts find view emulate variables view expressions view view emulate code code abstract debug view abstractdebugview get view to emulate getviewtoemulate i workbench page iworkbenchpage jdidebuguiplugin get active workbench window getactiveworkbenchwindow get active page getactivepage abstract debug view abstractdebugview expressions view expressionsview abstract debug view abstractdebugview find view findview idebuguiconstants expression view expressions view expressionsview expressions view expressionsview is visible isvisible expressions view expressionsview abstract debug view abstractdebugview variables view variablesview abstract debug view abstractdebugview find view findview idebuguiconstants variable view variables view variablesview variables view variablesview is visible isvisible variables view variablesview expressions view expressionsview expressions view expressionsview variables view variablesview initializes sash form weights preference store values sash weights stored init sash weights initsashweights i dialog settings idialogsettings settings get dialog settings getdialogsettings settings tree get int setting getintsetting settings sash weight tree tree details get int setting getintsetting settings sash weight details details f sash form fsashform set weights setweights tree details javadoc org eclipse jface text abstract information control abstractinformationcontrol set foreground color setforegroundcolor org eclipse swt graphics color override set foreground color setforegroundcolor color for eground foreground set foreground color setforegroundcolor for eground foreground f detail pane composite fdetailpanecomposite set foreground setforeground for eground foreground f tree ftree set foreground setforeground for eground foreground javadoc org eclipse jface text abstract information control abstractinformationcontrol set background color setbackgroundcolor org eclipse swt graphics color override set background color setbackgroundcolor color background set background color setbackgroundcolor background f detail pane composite fdetailpanecomposite set background setbackground background f tree ftree set background setbackground background javadoc org eclipse jface text abstract information control abstractinformationcontrol set focus setfocus override set focus setfocus set focus setfocus f tree ftree set focus setfocus javadoc org eclipse jface text i information control extension iinformationcontrolextension has contents hascontents override has contents hascontents f variable fvariable javadoc org eclipse jface text i information control extension iinformationcontrolextension set input setinput java lang object override set input setinput object input input i variable ivariable f variable fvariable i variable ivariable input f viewer fviewer set input setinput tree root treeroot javadoc org eclipse jface text abstract information control abstractinformationcontrol get information presenter control creator getinformationpresentercontrolcreator override i information control creator iinformationcontrolcreator get information presenter control creator getinformationpresentercontrolcreator expression information control creator expressioninformationcontrolcreator javadoc org eclipse jdt internal debug expression information control creator expressioninformationcontrolcreator create information control createinformationcontrol org eclipse swt widgets shell override i information control iinformationcontrol create information control createinformationcontrol shell shell expression information control expressioninformationcontrol shell javadoc org eclipse jface text i information control creator iinformationcontrolcreator create information control createinformationcontrol org eclipse swt widgets shell override i information control iinformationcontrol create information control createinformationcontrol shell parent expression information control expressioninformationcontrol parent