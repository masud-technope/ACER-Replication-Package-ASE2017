copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal filters java util array list arraylist java util arrays java util hash set hashset java util iterator java util list java util java util stack java util string tokenizer stringtokenizer org eclipse swt swt org eclipse swt events selection adapter selectionadapter org eclipse swt events selection event selectionevent org eclipse swt events selection listener selectionlistener org eclipse swt graphics image org eclipse swt layout grid data griddata org eclipse swt layout grid layout gridlayout org eclipse swt widgets button org eclipse swt widgets composite org eclipse swt widgets control org eclipse swt widgets label org eclipse swt widgets shell org eclipse swt widgets text org eclipse core runtime org eclipse jface dialogs i dialog constants idialogconstants org eclipse jface viewers array content provider arraycontentprovider org eclipse jface viewers check state changed event checkstatechangedevent org eclipse jface viewers checkbox table viewer checkboxtableviewer org eclipse jface viewers i check state listener icheckstatelistener org eclipse jface viewers i label provider ilabelprovider org eclipse jface viewers i selection iselection org eclipse jface viewers i selection changed listener iselectionchangedlistener org eclipse jface viewers i structured selection istructuredselection org eclipse jface viewers label provider labelprovider org eclipse jface viewers selection changed event selectionchangedevent org eclipse platformui org eclipse dialogs selection dialog selectiondialog org eclipse jdt internal i java help context ids ijavahelpcontextids org eclipse jdt internal util swt util swtutil custom filters dialog customfiltersdialog selection dialog selectiondialog nls string separator string f view id fviewid f enable patterns fenablepatterns string f patterns fpatterns string f enabled filter ids fenabledfilterids filter descriptor filterdescriptor f built in filters fbuiltinfilters checkbox table viewer checkboxtableviewer f check box list fcheckboxlist button f enable user defined patterns fenableuserdefinedpatterns text f user defined patterns fuserdefinedpatterns stack filter descriptor filterdescriptor f filter descriptor change history ffilterdescriptorchangehistory creates dialog customize java element filters param shell parent shell param view id viewid view param enable patterns enablepatterns code code pattern filters enabled param patterns filter patterns param enabled filter ids enabledfilterids ids enabled filters custom filters dialog customfiltersdialog shell shell string view id viewid enable patterns enablepatterns string patterns string enabled filter ids enabledfilterids shell is not null isnotnull view id viewid is not null isnotnull patterns is not null isnotnull enabled filter ids enabledfilterids f view id fviewid view id viewid f patterns fpatterns patterns f enable patterns fenablepatterns enable patterns enablepatterns f enabled filter ids fenabledfilterids enabled filter ids enabledfilterids f built in filters fbuiltinfilters filter descriptor filterdescriptor get filter descriptors getfilterdescriptors f view id fviewid f filter descriptor change history ffilterdescriptorchangehistory stack override configure shell configureshell shell shell set title settitle filter messages filtermessages custom filters dialog customfiltersdialog title set message setmessage filter messages filtermessages custom filters dialog customfiltersdialog filter list filterlist label configure shell configureshell shell platformui get workbench getworkbench get help system gethelpsystem set help sethelp shell i java help context ids ijavahelpcontextids custom filters dialog overrides method dialog org eclipse jface dialogs dialog create dialog area createdialogarea composite override control create dialog area createdialogarea composite parent initialize dialog units initializedialogunits parent create composite standard margins spacing composite composite composite parent swt grid layout gridlayout layout grid layout gridlayout layout margin height marginheight convert vertical us to pixels convertverticaldlustopixels i dialog constants idialogconstants vertical margin layout margin width marginwidth convert horizontal us to pixels converthorizontaldlustopixels i dialog constants idialogconstants horizontal margin layout vertical spacing verticalspacing convert vertical us to pixels convertverticaldlustopixels i dialog constants idialogconstants vertical spacing layout horizontal spacing horizontalspacing convert horizontal us to pixels converthorizontaldlustopixels i dialog constants idialogconstants horizontal spacing composite set layout setlayout layout composite set layout data setlayoutdata grid data griddata grid data griddata fill composite set font setfont parent get font getfont composite group composite checkbox f enable user defined patterns fenableuserdefinedpatterns button group swt check f enable user defined patterns fenableuserdefinedpatterns set focus setfocus f enable user defined patterns fenableuserdefinedpatterns set text settext filter messages filtermessages custom filters dialog customfiltersdialog enable user defined pattern enableuserdefinedpattern pattern field f user defined patterns fuserdefinedpatterns text group swt single swt border grid data griddata data grid data griddata grid data griddata horizontal align fill grid data griddata grab horizontal data width hint widthhint convert width in chars to pixels convertwidthincharstopixels f user defined patterns fuserdefinedpatterns set layout data setlayoutdata data string patterns convert to string converttostring f patterns fpatterns separator f user defined patterns fuserdefinedpatterns set text settext patterns swt util swtutil set acc essibility text setaccessibilitytext f user defined patterns fuserdefinedpatterns filter messages filtermessages custom filters dialog customfiltersdialog filter pattern description info text label info label group swt left info set text settext filter messages filtermessages custom filters dialog customfiltersdialog pattern info patterninfo enabling disabling pattern group f enable user defined patterns fenableuserdefinedpatterns set selection setselection f enable patterns fenablepatterns f user defined patterns fuserdefinedpatterns set enabled setenabled f enable patterns fenablepatterns info set enabled setenabled f enable patterns fenablepatterns f enable user defined patterns fenableuserdefinedpatterns add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent f enable user defined patterns fenableuserdefinedpatterns get selection getselection f user defined patterns fuserdefinedpatterns set enabled setenabled info set enabled setenabled f enable user defined patterns fenableuserdefinedpatterns get selection getselection f user defined patterns fuserdefinedpatterns set focus setfocus filters extension point f built in filters fbuiltinfilters length create check box list createcheckboxlist group apply dialog font applydialogfont parent parent create check box list createcheckboxlist composite parent filler label parent swt label info label parent swt left info set text settext filter messages filtermessages custom filters dialog customfiltersdialog filter list filterlist label f check box list fcheckboxlist checkbox table viewer checkboxtableviewer new check list newchecklist parent swt border grid data griddata data grid data griddata grid data griddata fill data height hint heighthint f check box list fcheckboxlist get table gettable get item height getitemheight f check box list fcheckboxlist get table gettable set layout data setlayoutdata data f check box list fcheckboxlist set label provider setlabelprovider create label privder createlabelprivder f check box list fcheckboxlist set content provider setcontentprovider array content provider arraycontentprovider arrays sort f built in filters fbuiltinfilters f check box list fcheckboxlist set input setinput f built in filters fbuiltinfilters set initial select ions setinitialselections get enabled filter descriptors getenabledfilterdescriptors list object initial selection initialselection get initial element select ions getinitialelementselections initial selection initialselection initial selection initialselection is empty isempty check initial select ions checkinitialselections description info label parent swt left info set text settext filter messages filtermessages custom filters dialog customfiltersdialog description label text description text parent swt left swt wrap swt multi swt read swt border swt scroll swt util swtutil fix readonly text background fixreadonlytextbackground description data grid data griddata grid data griddata fill horizontal data height hint heighthint convert height in chars to pixels convertheightincharstopixels description set layout data setlayoutdata data f check box list fcheckboxlist add selection changed listener addselectionchangedlistener i selection changed listener iselectionchangedlistener override selection changed selectionchanged selection changed event selectionchangedevent event i selection iselection selection event get selection getselection selection i structured selection istructuredselection object selected element selectedelement i structured selection istructuredselection selection get first element getfirstelement selected element selectedelement filter descriptor filterdescriptor description set text settext filter descriptor filterdescriptor selected element selectedelement get description getdescription f check box list fcheckboxlist add check state listener addcheckstatelistener i check state listener icheckstatelistener org eclipse jface viewers i check state listener icheckstatelistener check state changed checkstatechanged org eclipse jface viewers check state changed event checkstatechangedevent override check state changed checkstatechanged check state changed event checkstatechangedevent event object element event get element getelement element filter descriptor filterdescriptor renew touched f filter descriptor change history ffilterdescriptorchangehistory element f filter descriptor change history ffilterdescriptorchangehistory remove element f filter descriptor change history ffilterdescriptorchangehistory push filter descriptor filterdescriptor element add selection buttons addselectionbuttons parent add selection buttons addselectionbuttons composite composite composite button composite buttoncomposite composite composite swt grid layout gridlayout layout grid layout gridlayout layout num columns numcolumns button composite buttoncomposite set layout setlayout layout grid data griddata data grid data griddata grid data griddata horizontal align grid data griddata grab horizontal data grab excess horizontal space grabexcesshorizontalspace composite set data setdata data select button string label filter messages filtermessages custom filters dialog customfiltersdialog select all button selectallbutton label button select button selectbutton create button createbutton button composite buttoncomposite i dialog constants idialogconstants select label swt util swtutil set button dimension hint setbuttondimensionhint select button selectbutton selection listener selectionlistener listener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent f check box list fcheckboxlist set all checked setallchecked f filter descriptor change history ffilterdescriptorchangehistory clear f built in filters fbuiltinfilters length f filter descriptor change history ffilterdescriptorchangehistory push f built in filters fbuiltinfilters select button selectbutton add selection listener addselectionlistener listener select button label filter messages filtermessages custom filters dialog customfiltersdialog deselect all button deselectallbutton label button deselect button deselectbutton create button createbutton button composite buttoncomposite i dialog constants idialogconstants deselect label swt util swtutil set button dimension hint setbuttondimensionhint deselect button deselectbutton listener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent f check box list fcheckboxlist set all checked setallchecked f filter descriptor change history ffilterdescriptorchangehistory clear f built in filters fbuiltinfilters length f filter descriptor change history ffilterdescriptorchangehistory push f built in filters fbuiltinfilters deselect button deselectbutton add selection listener addselectionlistener listener check initial select ions checkinitialselections iterator object items to check itemstocheck get initial element select ions getinitialelementselections iterator items to check itemstocheck has next hasnext f check box list fcheckboxlist set checked setchecked items to check itemstocheck override ok pressed okpressed f built in filters fbuiltinfilters array list arraylist filter descriptor filterdescriptor result array list arraylist f built in filters fbuiltinfilters length f check box list fcheckboxlist get checked getchecked f built in filters fbuiltinfilters result add f built in filters fbuiltinfilters set result setresult result ok pressed okpressed i label provider ilabelprovider create label privder createlabelprivder label provider labelprovider override image get image getimage object element override string get text gettext object element element filter descriptor filterdescriptor filter descriptor filterdescriptor element get name getname result handling override set result setresult list new result newresult set result setresult new result newresult f user defined patterns fuserdefinedpatterns get text gettext length f enable patterns fenablepatterns f enable user defined patterns fenableuserdefinedpatterns get selection getselection f patterns fpatterns convert from string convertfromstring f user defined patterns fuserdefinedpatterns get text gettext separator f enable patterns fenablepatterns f patterns fpatterns string patterns entered user string get user defined patterns getuserdefinedpatterns f patterns fpatterns ids enabled built filters string get enabled filter ids getenabledfilterids object result get result getresult string enabled ids enabledids hash set hashset result length result length enabled ids enabledids add filter descriptor filterdescriptor result get id getid enabled ids enabledids to array toarray string enabled ids enabledids size code code user defined patterns disabled are user defined patterns enabled areuserdefinedpatternsenabled f enable patterns fenablepatterns stack filter descriptor check history stack filter descriptor filterdescriptor get filter descriptor change history getfilterdescriptorchangehistory f filter descriptor change history ffilterdescriptorchangehistory filter descriptor filterdescriptor get enabled filter descriptors getenabledfilterdescriptors filter descriptor filterdescriptor filter descs filterdescs f built in filters fbuiltinfilters list filter descriptor filterdescriptor result array list arraylist filter descs filterdescs length list string enabled filter ids enabledfilterids arrays as list aslist f enabled filter ids fenabledfilterids filter descs filterdescs length string filter descs filterdescs get id getid enabled filter ids enabledfilterids result add filter descs filterdescs result to array toarray filter descriptor filterdescriptor result size string convert from string convertfromstring string patterns string separator string tokenizer stringtokenizer tokenizer string tokenizer stringtokenizer patterns separator token count tokencount tokenizer count tokens counttokens list string result array list arraylist token count tokencount escape append tokenizer has more tokens hasmoretokens string token tokenizer next token nexttoken trim separator equals token escape escape add pattern addpattern result separator append append result add token add pattern addpattern result token append escape result to array toarray string result size add pattern addpattern list string list string pattern list is empty isempty list add pattern list size list list pattern string convert to string converttostring string patterns string separator length patterns length string buffer stringbuffer str buf strbuf string buffer stringbuffer length str buf strbuf append escape separator escapeseparator patterns separator nls length str buf strbuf append separator nls str buf strbuf append str buf strbuf append escape separator escapeseparator patterns separator str buf strbuf to string tostring string escape separator escapeseparator string pattern string separator length pattern length string buffer stringbuffer buf string buffer stringbuffer length length pattern char at charat separator equals string value of valueof buf append buf append buf to string tostring