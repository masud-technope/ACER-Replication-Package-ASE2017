copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation jesper steen moller enhancement filter get ters getters set ters setters org eclipse jdt internal debug java util array list arraylist org eclipse debug internal swt factory swtfactory org eclipse debug debuguitools org eclipse jdt core i java element ijavaelement org eclipse jdt core i type itype org eclipse jdt core java model exception javamodelexception org eclipse jdt core search search engine searchengine org eclipse jdt i java element search constants ijavaelementsearchconstants org eclipse jdt javaui org eclipse jface dialogs i dialog constants idialogconstants org eclipse jface preference i preference store ipreferencestore org eclipse jface preference preference page preferencepage org eclipse jface viewers check state changed event checkstatechangedevent org eclipse jface viewers checkbox table viewer checkboxtableviewer org eclipse jface viewers i check state listener icheckstatelistener org eclipse jface viewers i selection iselection org eclipse jface viewers i selection changed listener iselectionchangedlistener org eclipse jface viewers i structured content provider istructuredcontentprovider org eclipse jface viewers i structured selection istructuredselection org eclipse jface viewers selection changed event selectionchangedevent org eclipse jface viewers viewer org eclipse swt swt org eclipse swt events key adapter keyadapter org eclipse swt events key event keyevent org eclipse swt events selection event selectionevent org eclipse swt events selection listener selectionlistener org eclipse swt layout grid data griddata org eclipse swt layout grid layout gridlayout org eclipse swt widgets button org eclipse swt widgets composite org eclipse swt widgets control org eclipse swt widgets event org eclipse swt widgets label org eclipse swt widgets listener org eclipse swt widgets table item tableitem org eclipse i workbench iworkbench org eclipse i workbench preference page iworkbenchpreferencepage org eclipse platformui org eclipse dialogs element list selection dialog elementlistselectiondialog org eclipse dialogs selection dialog selectiondialog preference java step filtering located node java debug step filtering java step filter preference page javastepfilterpreferencepage preference page preferencepage i workbench preference page iworkbenchpreferencepage nls string org eclipse jdt debug java step filter preference page javastepfilterpreferencepage content provider table content consists instances step filter stepfilter step filter content provider stepfiltercontentprovider i structured content provider istructuredcontentprovider step filter content provider stepfiltercontentprovider init table state inittablestate override object get elements getelements object input element inputelement get all filters from table getallfiltersfromtable override input changed inputchanged viewer viewer object old input oldinput object new input newinput override dispose widgets checkbox table viewer checkboxtableviewer f table viewer ftableviewer button f use step filters button fusestepfiltersbutton button f add package button faddpackagebutton button f add type button faddtypebutton button f remove filter button fremovefilterbutton button f add filter button faddfilterbutton button f filter synthetic button ffiltersyntheticbutton button f filter static button ffilterstaticbutton button f filter getter button ffiltergetterbutton button f filter setter button ffiltersetterbutton button f filter constructor button ffilterconstructorbutton button f step thru button fstepthrubutton button f select all button fselectallbutton button f deselect all button fdeselectallbutton constructor java step filter preference page javastepfilterpreferencepage set preference store setpreferencestore jdidebuguiplugin get default getdefault get preference store getpreferencestore set title settitle debuguimessages java step filter preference page javastepfilterpreferencepage title set description setdescription debuguimessages java step filter preference page javastepfilterpreferencepage description javadoc org eclipse jface preference preference page preferencepage create contents createcontents org eclipse swt widgets composite override control create contents createcontents composite parent platformui get workbench getworkbench get help system gethelpsystem set help sethelp get control getcontrol i java debug help context ids ijavadebughelpcontextids java step filter preference main composite composite composite swt factory swtfactory create composite createcomposite parent parent get font getfont grid data griddata fill create step filter preferences createstepfilterpreferences composite composite javadoc org eclipse i workbench preference page iworkbenchpreferencepage init org eclipse i workbench iworkbench override init i workbench iworkbench workbench handles filter button clicked param event clicked event handle filter viewer key p ress handlefilterviewerkeypress key event keyevent event event character swt del event state mask statemask remove filters removefilters create group step filter widgetry create step filter preferences createstepfilterpreferences composite parent composite container swt factory swtfactory create composite createcomposite parent parent get font getfont grid data griddata fill f use step filters button fusestepfiltersbutton swt factory swtfactory create check button createcheckbutton container debuguimessages java step filter preference page javastepfilterpreferencepage step filters debuguitools is use step filters isusestepfilters f use step filters button fusestepfiltersbutton add selection listener addselectionlistener selection listener selectionlistener override widget selected widgetselected selection event selectionevent set page enablement setpageenablement f use step filters button fusestepfiltersbutton get selection getselection override widget default selected widgetdefaultselected selection event selectionevent swt factory swtfactory create label createlabel container debuguimessages java step filter preference page javastepfilterpreferencepage defined step lters f table viewer ftableviewer checkbox table viewer checkboxtableviewer new check list newchecklist container swt scroll swt scroll swt border swt multi swt full selection f table viewer ftableviewer get table gettable set font setfont container get font getfont f table viewer ftableviewer set label provider setlabelprovider filter label provider filterlabelprovider f table viewer ftableviewer set comparator setcomparator filter viewer comparator filterviewercomparator f table viewer ftableviewer set content provider setcontentprovider step filter content provider stepfiltercontentprovider f table viewer ftableviewer set input setinput get all stored filters getallstoredfilters f table viewer ftableviewer get table gettable set layout data setlayoutdata grid data griddata grid data griddata fill f table viewer ftableviewer add check state listener addcheckstatelistener i check state listener icheckstatelistener override check state changed checkstatechanged check state changed event checkstatechangedevent event filter event get element getelement set checked setchecked event get checked getchecked f table viewer ftableviewer add selection changed listener addselectionchangedlistener i selection changed listener iselectionchangedlistener override selection changed selectionchanged selection changed event selectionchangedevent event i selection iselection selection event get selection getselection selection is empty isempty f remove filter button fremovefilterbutton set enabled setenabled f remove filter button fremovefilterbutton set enabled setenabled f table viewer ftableviewer get control getcontrol add key listener addkeylistener key adapter keyadapter override key pressed keypressed key event keyevent event handle filter viewer key p ress handlefilterviewerkeypress event create step filter buttons createstepfilterbuttons container create step filter check boxes createstepfiltercheckboxes container set page enablement setpageenablement f use step filters button fusestepfiltersbutton get selection getselection initial izes initializes checked filters dialog opens init table state inittablestate defaults filter filters get all stored filters getallstoredfilters defaults filters length f table viewer ftableviewer add filters f table viewer ftableviewer set checked setchecked filters filters is checked ischecked enables disables widgets exception code f use step filters button fusestepfiltersbutton code passed param enabled enablement status widgets set page enablement setpageenablement enabled f add filter button faddfilterbutton set enabled setenabled enabled f add package button faddpackagebutton set enabled setenabled enabled f add type button faddtypebutton set enabled setenabled enabled f deselect all button fdeselectallbutton set enabled setenabled enabled f select all button fselectallbutton set enabled setenabled enabled f filter constructor button ffilterconstructorbutton set enabled setenabled enabled f step thru button fstepthrubutton set enabled setenabled enabled f filter getter button ffiltergetterbutton set enabled setenabled enabled f filter setter button ffiltersetterbutton set enabled setenabled enabled f filter static button ffilterstaticbutton set enabled setenabled enabled f filter synthetic button ffiltersyntheticbutton set enabled setenabled enabled f table viewer ftableviewer get table gettable set enabled setenabled enabled f remove filter button fremovefilterbutton set enabled setenabled enabled f table viewer ftableviewer get selection getselection is empty isempty create checked preferences param container parent container create step filter check boxes createstepfiltercheckboxes composite container f filter synthetic button ffiltersyntheticbutton swt factory swtfactory create check button createcheckbutton container debuguimessages java step filter preference page javastepfilterpreferencepage filter ynthetic methods requires support get preference store getpreferencestore get boolean getboolean i jdi preferences constants ijdipreferencesconstants pref filter synthetics f filter static button ffilterstaticbutton swt factory swtfactory create check button createcheckbutton container debuguimessages java step filter preference page javastepfilterpreferencepage filter initializers get preference store getpreferencestore get boolean getboolean i jdi preferences constants ijdipreferencesconstants pref filter initializers f filter constructor button ffilterconstructorbutton swt factory swtfactory create check button createcheckbutton container debuguimessages java step filter preference page javastepfilterpreferencepage filter nstructors get preference store getpreferencestore get boolean getboolean i jdi preferences constants ijdipreferencesconstants pref filter constructors f filter getter button ffiltergetterbutton swt factory swtfactory create check button createcheckbutton container debuguimessages java step filter preference page javastepfilterpreferencepage filter get ters getters get preference store getpreferencestore get boolean getboolean i jdi preferences constants ijdipreferencesconstants pref filter getters f filter setter button ffiltersetterbutton swt factory swtfactory create check button createcheckbutton container debuguimessages java step filter preference page javastepfilterpreferencepage filter set ters setters get preference store getpreferencestore get boolean getboolean i jdi preferences constants ijdipreferencesconstants pref filter setters f step thru button fstepthrubutton swt factory swtfactory create check button createcheckbutton container debuguimessages java step filter preference page javastepfilterpreferencepage get preference store getpreferencestore get boolean getboolean i jdi preferences constants ijdipreferencesconstants pref step filters creates button step filter options param container parent container create step filter buttons createstepfilterbuttons composite container initialize dialog units initializedialogunits container button container composite button container buttoncontainer composite container swt grid data griddata grid data griddata grid data griddata fill vertical button container buttoncontainer set layout data setlayoutdata grid layout gridlayout button layout buttonlayout grid layout gridlayout button layout buttonlayout num columns numcolumns button layout buttonlayout margin height marginheight button layout buttonlayout margin width marginwidth button container buttoncontainer set layout setlayout button layout buttonlayout add filter button f add filter button faddfilterbutton swt factory swtfactory create push button createpushbutton button container buttoncontainer debuguimessages java step filter preference page javastepfilterpreferencepage add filter debuguimessages java step filter preference page javastepfilterpreferencepage key step filter f add filter button faddfilterbutton add listener addlistener swt selection listener override handle event handleevent event add filter addfilter add type button f add type button faddtypebutton swt factory swtfactory create push button createpushbutton button container buttoncontainer debuguimessages java step filter preference page javastepfilterpreferencepage add type debuguimessages java step filter preference page javastepfilterpreferencepage choose java type add step filters f add type button faddtypebutton add listener addlistener swt selection listener override handle event handleevent event add type addtype add button f add package button faddpackagebutton swt factory swtfactory create push button createpushbutton button container buttoncontainer debuguimessages java step filter preference page javastepfilterpreferencepage add debuguimessages java step filter preference page javastepfilterpreferencepage choose add step filters f add package button faddpackagebutton add listener addlistener swt selection listener override handle event handleevent event add package addpackage remove button f remove filter button fremovefilterbutton swt factory swtfactory create push button createpushbutton button container buttoncontainer debuguimessages java step filter preference page javastepfilterpreferencepage remove debuguimessages java step filter preference page javastepfilterpreferencepage remove selected step filters f remove filter button fremovefilterbutton add listener addlistener swt selection listener override handle event handleevent event remove filters removefilters f remove filter button fremovefilterbutton set enabled setenabled label separator label button container buttoncontainer swt separator set visible setvisible grid data griddata horizontal alignment horizontalalignment grid data griddata fill vertical alignment verticalalignment grid data griddata height hint heighthint separator set layout data setlayoutdata select button f select all button fselectallbutton swt factory swtfactory create push button createpushbutton button container buttoncontainer debuguimessages java step filter preference page javastepfilterpreferencepage select debuguimessages java step filter preference page javastepfilterpreferencepage selects step filters f select all button fselectallbutton add listener addlistener swt selection listener override handle event handleevent event f table viewer ftableviewer set all checked setallchecked select button f deselect all button fdeselectallbutton swt factory swtfactory create push button createpushbutton button container buttoncontainer debuguimessages java step filter preference page javastepfilterpreferencepage deselect debuguimessages java step filter preference page javastepfilterpreferencepage deselects step filters f deselect all button fdeselectallbutton add listener addlistener swt selection listener override handle event handleevent event f table viewer ftableviewer set all checked setallchecked filter listing add filter addfilter filter new filter newfilter create step filter dialog createstepfilterdialog show create step filter dialog showcreatestepfilterdialog get shell getshell get all filters from table getallfiltersfromtable new filter newfilter f table viewer ftableviewer add new filter newfilter f table viewer ftableviewer set checked setchecked new filter newfilter f table viewer ftableviewer refresh new filter newfilter add type listing filters add type addtype selection dialog selectiondialog dialog javaui create type dialog createtypedialog get shell getshell platformui get workbench getworkbench get progress service getprogressservice search engine searchengine create workspace scope createworkspacescope i java element search constants ijavaelementsearchconstants classes dialog set title settitle debuguimessages java step filter preference page javastepfilterpreferencepage add type step filters dialog set message setmessage debuguimessages java step filter preference page javastepfilterpreferencepage select type filter stepping dialog open i dialog constants idialogconstants object types dialog get result getresult types types length i type itype type i type itype types add filter addfilter type get fully qualified name getfullyqualifiedname java model exception javamodelexception jme exception handler exceptionhandler handle jme debuguimessages java step filter preference page javastepfilterpreferencepage add type step filters debuguimessages java step filter preference page javastepfilterpreferencepage open type selection dialog step filters add list filters add package addpackage element list selection dialog elementlistselectiondialog dialog jdidebuguiplugin create all packages dialog createallpackagesdialog get shell getshell dialog set title settitle debuguimessages java step filter preference page javastepfilterpreferencepage add step filters dialog set message setmessage debuguimessages java step filter preference page javastepfilterpreferencepage select filter stepping dialog set multiple selection setmultipleselection dialog open i dialog constants idialogconstants object packages dialog get result getresult packages i java element ijavaelement pkg packages length pkg i java element ijavaelement packages string filter nls pkg get element name getelementname add filter addfilter filter java model exception javamodelexception jme exception handler exceptionhandler handle jme debuguimessages java step filter preference page javastepfilterpreferencepage add step filters debuguimessages java step filter preference page javastepfilterpreferencepage open selection dialog step filters removes selected filters remove filters removefilters f table viewer ftableviewer remove i structured selection istructuredselection f table viewer ftableviewer get selection getselection to array toarray javadoc org eclipse jface preference preference page preferencepage perform ok performok override perform ok performok debuguitools set use step filters setusestepfilters f use step filters button fusestepfiltersbutton get selection getselection i preference store ipreferencestore store get preference store getpreferencestore array list arraylist string active array list arraylist string array list arraylist string inactive array list arraylist string nls string filter filters get all filters from table getallfiltersfromtable filters length filters get name getname filters is checked ischecked active add inactive add string pref java debug options manager javadebugoptionsmanager serialize list serializelist active to array toarray string active size store set value setvalue i jdi preferences constants ijdipreferencesconstants pref active filters list pref pref java debug options manager javadebugoptionsmanager serialize list serializelist inactive to array toarray string inactive size store set value setvalue i jdi preferences constants ijdipreferencesconstants pref inactive filters list pref store set value setvalue i jdi preferences constants ijdipreferencesconstants pref filter constructors f filter constructor button ffilterconstructorbutton get selection getselection store set value setvalue i jdi preferences constants ijdipreferencesconstants pref filter initializers f filter static button ffilterstaticbutton get selection getselection store set value setvalue i jdi preferences constants ijdipreferencesconstants pref filter getters f filter getter button ffiltergetterbutton get selection getselection store set value setvalue i jdi preferences constants ijdipreferencesconstants pref filter setters f filter setter button ffiltersetterbutton get selection getselection store set value setvalue i jdi preferences constants ijdipreferencesconstants pref filter synthetics f filter synthetic button ffiltersyntheticbutton get selection getselection store set value setvalue i jdi preferences constants ijdipreferencesconstants pref step filters f step thru button fstepthrubutton get selection getselection perform ok performok javadoc org eclipse jface preference preference page preferencepage perform defaults performdefaults override perform defaults performdefaults step enabled stepenabled debuguitools is use step filters isusestepfilters f use step filters button fusestepfiltersbutton set selection setselection step enabled stepenabled set page enablement setpageenablement step enabled stepenabled f filter synthetic button ffiltersyntheticbutton set selection setselection get preference store getpreferencestore get default boolean getdefaultboolean i jdi preferences constants ijdipreferencesconstants pref filter synthetics f filter static button ffilterstaticbutton set selection setselection get preference store getpreferencestore get default boolean getdefaultboolean i jdi preferences constants ijdipreferencesconstants pref filter initializers f filter constructor button ffilterconstructorbutton set selection setselection get preference store getpreferencestore get default boolean getdefaultboolean i jdi preferences constants ijdipreferencesconstants pref filter constructors f filter getter button ffiltergetterbutton set selection setselection get preference store getpreferencestore get default boolean getdefaultboolean i jdi preferences constants ijdipreferencesconstants pref filter getters f filter setter button ffiltersetterbutton set selection setselection get preference store getpreferencestore get default boolean getdefaultboolean i jdi preferences constants ijdipreferencesconstants pref filter setters f step thru button fstepthrubutton set selection setselection get preference store getpreferencestore get default boolean getdefaultboolean i jdi preferences constants ijdipreferencesconstants pref step filters f table viewer ftableviewer get table gettable remove all removeall init table state inittablestate perform defaults performdefaults adds single filter viewer param filter filter add param checked checked filter add filter addfilter string filter checked filter filter filter filter checked f table viewer ftableviewer add f table viewer ftableviewer set checked setchecked checked returns filters table includes saved empty lits filters f ron fron table filter get all filters from table getallfiltersfromtable table item tableitem items f table viewer ftableviewer get table gettable get items getitems filter filters filter items length items length filters filter items get data getdata filters set checked setchecked items get checked getchecked filters returns committed filters array committed filters filter get all stored filters getallstoredfilters defaults filter filters string active filters activefilters inactivefilters i preference store ipreferencestore store get preference store getpreferencestore defaults active filters activefilters java debug options manager javadebugoptionsmanager parse list parselist store get default string getdefaultstring i jdi preferences constants ijdipreferencesconstants pref active filters list inactivefilters java debug options manager javadebugoptionsmanager parse list parselist store get default string getdefaultstring i jdi preferences constants ijdipreferencesconstants pref inactive filters list active filters activefilters java debug options manager javadebugoptionsmanager parse list parselist store get string getstring i jdi preferences constants ijdipreferencesconstants pref active filters list inactivefilters java debug options manager javadebugoptionsmanager parse list parselist store get string getstring i jdi preferences constants ijdipreferencesconstants pref inactive filters list filters filter active filters activefilters length inactivefilters length active filters activefilters length filters filter active filters activefilters inactivefilters length filters active filters activefilters length filter inactivefilters filters