copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal preferences java util array list arraylist org eclipse swt swt org eclipse swt events selection event selectionevent org eclipse swt events selection listener selectionlistener org eclipse swt layout grid data griddata org eclipse swt layout grid layout gridlayout org eclipse swt widgets button org eclipse swt widgets composite org eclipse swt widgets control org eclipse swt widgets group org eclipse swt widgets label org eclipse swt widgets text org eclipse jface dialogs dialog org eclipse jface dialogs i dialog constants idialogconstants org eclipse jface dialogs message dialog messagedialog org eclipse jface preference i preference store ipreferencestore org eclipse jface preference preference page preferencepage org eclipse i workbench iworkbench org eclipse i workbench preference page iworkbenchpreferencepage org eclipse platformui org eclipse jdt preference constants preferenceconstants org eclipse jdt internal i java help context ids ijavahelpcontextids org eclipse jdt internal java plugin javaplugin org eclipse jdt internal dialogs optional message dialog optionalmessagedialog org eclipse jdt internal refactoring refactoring save preferences refactoringsavepreferences org eclipse jdt internal util swt util swtutil setting general java plug preferences preference constants preferenceconstants access change values api java base preference page javabasepreferencepage preference page preferencepage i workbench preference page iworkbenchpreferencepage nls string java base pref org eclipse jdt preferences java base preference page javabasepreferencepage string open type hierarchy preference constants preferenceconstants open type hierarchy string open type hierarchy perspective preference constants preferenceconstants open type hierarchy perspective string open type hierarchy view preference constants preferenceconstants open type hierarchy view string click preference constants preferenceconstants click string click preference constants preferenceconstants click string click expands preference constants preferenceconstants click expands array list arraylist button f check boxes fcheckboxes array list arraylist button f radio buttons fradiobuttons array list arraylist text f text controls ftextcontrols java base preference page javabasepreferencepage set preference store setpreferencestore java plugin javaplugin get default getdefault get preference store getpreferencestore set description setdescription preferences messages preferencesmessages java base preference page javabasepreferencepage description f radio buttons fradiobuttons array list arraylist f check boxes fcheckboxes array list arraylist f text controls ftextcontrols array list arraylist i workbench preference page iworkbenchpreferencepage init i workbench iworkbench override init i workbench iworkbench workbench preference page preferencepage create control createcontrol composite override create control createcontrol composite parent create control createcontrol parent platformui get workbench getworkbench get help system gethelpsystem set help sethelp get control getcontrol i java help context ids ijavahelpcontextids java base preference button add radio button addradiobutton composite parent string label string key string grid data griddata grid data griddata grid data griddata horizontal align fill button button button parent swt radio button set text settext label button set data setdata string key button set layout data setlayoutdata button set selection setselection equals get preference store getpreferencestore get string getstring key f radio buttons fradiobuttons add button button button add check box addcheckbox composite parent string label string key grid data griddata grid data griddata grid data griddata horizontal align fill button button button parent swt check button set text settext label button set data setdata key button set layout data setlayoutdata button set selection setselection get preference store getpreferencestore get boolean getboolean key f check boxes fcheckboxes add button button override control create contents createcontents composite parent initialize dialog units initializedialogunits parent composite result composite parent swt grid layout gridlayout layout grid layout gridlayout layout margin height marginheight convert vertical us to pixels convertverticaldlustopixels i dialog constants idialogconstants vertical margin layout margin width marginwidth layout vertical spacing verticalspacing convert vertical us to pixels convertverticaldlustopixels layout horizontal spacing horizontalspacing convert horizontal us to pixels converthorizontaldlustopixels i dialog constants idialogconstants horizontal spacing result set layout setlayout layout label composite swt space r spacer group link settings linksettings group result swt link settings linksettings set layout setlayout grid layout gridlayout link settings linksettings set layout data setlayoutdata grid data griddata grid data griddata fill horizontal link settings linksettings set text settext preferences messages preferencesmessages get string getstring java base preference page javabasepreferencepage link settings linksettings text nls add check box addcheckbox link settings linksettings preferences messages preferencesmessages get string getstring java base preference page javabasepreferencepage link java browsing views checkbox linkjavabrowsingviewscheckbox text link browsing view editor nls add check box addcheckbox link settings linksettings preferences messages preferencesmessages get string getstring java base preference page javabasepreferencepage link package view linkpackageview link packages editor nls add check box addcheckbox link settings linksettings preferences messages preferencesmessages get string getstring java base preference page javabasepreferencepage link type hierarchy linktypehierarchy link type hierarchy typehierarchy editor nls label result swt space r spacer group double click group doubleclickgroup group result swt double click group doubleclickgroup set layout setlayout grid layout gridlayout double click group doubleclickgroup set layout data setlayoutdata grid data griddata grid data griddata fill horizontal double click group doubleclickgroup set text settext preferences messages preferencesmessages java base preference page javabasepreferencepage double click doubleclick action add radio button addradiobutton double click group doubleclickgroup preferences messages preferencesmessages java base preference page javabasepreferencepage double click doubleclick gointo click click add radio button addradiobutton double click group doubleclickgroup preferences messages preferencesmessages java base preference page javabasepreferencepage double click doubleclick expand click click expands label result swt space r spacer group type hierarchy group typehierarchygroup group result swt type hierarchy group typehierarchygroup set layout setlayout grid layout gridlayout type hierarchy group typehierarchygroup set layout data setlayoutdata grid data griddata grid data griddata fill horizontal type hierarchy group typehierarchygroup set text settext preferences messages preferencesmessages java base preference page javabasepreferencepage open type hierarchy opentypehierarchy add radio button addradiobutton type hierarchy group typehierarchygroup preferences messages preferencesmessages java base preference page javabasepreferencepage in perspective inperspective open type hierarchy open type hierarchy perspective add radio button addradiobutton type hierarchy group typehierarchygroup preferences messages preferencesmessages java base preference page javabasepreferencepage in view inview open type hierarchy open type hierarchy view group refactoring group refactoringgroup group result swt refactoring group refactoringgroup set layout setlayout grid layout gridlayout refactoring group refactoringgroup set layout data setlayoutdata grid data griddata grid data griddata fill horizontal refactoring group refactoringgroup set text settext preferences messages preferencesmessages java base preference page javabasepreferencepage refactoring title add check box addcheckbox refactoring group refactoringgroup preferences messages preferencesmessages java base preference page javabasepreferencepage refactoring auto save refactoring save preferences refactoringsavepreferences pref save edit ors editors add check box addcheckbox refactoring group refactoringgroup preferences messages preferencesmessages java base preference page javabasepreferencepage refactoring lightweight preference constants preferenceconstants ref actor refactor lightweight group group group result swt group set layout setlayout grid layout gridlayout group set layout data setlayoutdata grid data griddata grid data griddata fill horizontal group set text settext preferences messages preferencesmessages java base preference page javabasepreferencepage search add check box addcheckbox group preferences messages preferencesmessages java base preference page javabasepreferencepage search small menu preference constants preferenceconstants search red uced reduced menu layout grid layout gridlayout layout num columns numcolumns group dont ask group dontaskgroup group result swt dont ask group dontaskgroup set layout setlayout layout dont ask group dontaskgroup set layout data setlayoutdata grid data griddata grid data griddata fill horizontal dont ask group dontaskgroup set text settext preferences messages preferencesmessages java base preference page javabasepreferencepage dialogs label label label dont ask group dontaskgroup swt wrap label set text settext preferences messages preferencesmessages java base preference page javabasepreferencepage hide description grid data griddata data grid data griddata grid data griddata fill grid data griddata center data width hint widthhint convert vertical us to pixels convertverticaldlustopixels label set layout data setlayoutdata data button clear button clearbutton button dont ask group dontaskgroup swt push clear button clearbutton set text settext preferences messages preferencesmessages java base preference page javabasepreferencepage hide button clear button clearbutton set layout data setlayoutdata grid data griddata grid data griddata fill grid data griddata clear button clearbutton add selection listener addselectionlistener selection listener selectionlistener override widget selected widgetselected selection event selectionevent unhide all dialogs unhidealldialogs override widget default selected widgetdefaultselected selection event selectionevent unhide all dialogs unhidealldialogs swt util swtutil set button dimension hint setbuttondimensionhint clear button clearbutton dialog apply dialog font applydialogfont result result unhide all dialogs unhidealldialogs optional message dialog optionalmessagedialog clear all remembered states clearallrememberedstates message dialog messagedialog open information openinformation get shell getshell preferences messages preferencesmessages java base preference page javabasepreferencepage hide dialog title preferences messages preferencesmessages java base preference page javabasepreferencepage hide dialog message preference page preferencepage perform defaults performdefaults override perform defaults performdefaults i preference store ipreferencestore store get preference store getpreferencestore f check boxes fcheckboxes size button button f check boxes fcheckboxes string key string button get data getdata button set selection setselection store get default boolean getdefaultboolean key f radio buttons fradiobuttons size button button f radio buttons fradiobuttons string info string button get data getdata button set selection setselection info equals store get default string getdefaultstring info f text controls ftextcontrols size text text f text controls ftextcontrols string key string text get data getdata text set text settext store get default string getdefaultstring key perform defaults performdefaults i preference page ipreferencepage perform ok performok override perform ok performok i preference store ipreferencestore store get preference store getpreferencestore f check boxes fcheckboxes size button button f check boxes fcheckboxes string key string button get data getdata store set value setvalue key button get selection getselection f radio buttons fradiobuttons size button button f radio buttons fradiobuttons button get selection getselection string info string button get data getdata store set value setvalue info info f text controls ftextcontrols size text text f text controls ftextcontrols string key string text get data getdata store set value setvalue key text get text gettext java plugin javaplugin flush instance scope flushinstancescope perform ok performok