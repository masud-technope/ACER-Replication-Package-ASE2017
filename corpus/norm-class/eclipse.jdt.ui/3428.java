copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation christian georgi chr istian christian georgi sap bug symbol ctrl g�bor k�vesd�n contribution bug content assist include prefix matches auto complete suggestions org eclipse jdt internal preferences java util map org eclipse osgi util nls org eclipse swt swt org eclipse swt events selection adapter selectionadapter org eclipse swt events selection event selectionevent org eclipse swt events selection listener selectionlistener org eclipse swt graphics point org eclipse swt layout grid data griddata org eclipse swt layout grid layout gridlayout org eclipse swt widgets button org eclipse swt widgets composite org eclipse swt widgets control org eclipse swt widgets group org eclipse swt widgets label org eclipse swt widgets link org eclipse swt widgets text org eclipse core runtime i status istatus org eclipse jface bindings swt key support swtkeysupport org eclipse jface layout pixel converter pixelconverter org eclipse jface preference i preference store ipreferencestore org eclipse dialogs preferences util preferencesutil org eclipse preferences i workbench preference container iworkbenchpreferencecontainer org eclipse jdt core java core javacore org eclipse jdt internal corext util messages org eclipse jdt preference constants preferenceconstants org eclipse jdt internal dialogs status info statusinfo org eclipse jdt internal text java abstract java completion proposal abstractjavacompletionproposal org eclipse jdt internal text java proposal sorter handle proposalsorterhandle org eclipse jdt internal text java proposal sorter registry proposalsorterregistry org eclipse jdt internal wizards i status change listener istatuschangelistener org eclipse jdt internal wizards dialogfields layout util layoututil config ures configures content assist preferences code assist configuration block codeassistconfigurationblock options configuration block optionsconfigurationblock key pref codeassist autoactivation getjdtuikey preference constants preferenceconstants codeassist autoactivation key pref codeassist autoactivation delay getjdtuikey preference constants preferenceconstants codeassist autoactivation delay key pref codeassist autoinsert getjdtuikey preference constants preferenceconstants codeassist autoinsert key pref codeassist autoactivation triggers java getjdtuikey preference constants preferenceconstants codeassist autoactivation triggers java key pref codeassist autoactivation triggers javadoc getjdtuikey preference constants preferenceconstants codeassist autoactivation triggers javadoc key pref codeassist visible proposals getjdtuikey preference constants preferenceconstants codeassist visible proposals key pref codeassist sorter getjdtuikey preference constants preferenceconstants codeassist sorter key pref codeassist sensitivity getjdtuikey preference constants preferenceconstants codeassist sensitivity key pref codeassist addimport getjdtuikey preference constants preferenceconstants codeassist addimport key pref codeassist imports getjdtcorekey java core javacore codeassist imports key pref codeassist insert completion getjdtuikey preference constants preferenceconstants codeassist insert completion key pref codeassist fill argument names getjdtuikey preference constants preferenceconstants codeassist fill argument names key pref codeassist guess method arguments getjdtuikey preference constants preferenceconstants codeassist guess method arguments key pref codeassist prefix completion getjdtuikey preference constants preferenceconstants codeassist prefix completion key pref codeassist deprecation check getjdtcorekey java core javacore codeassist deprecation check key pref codeassist camel match getjdtcorekey java core javacore codeassist camel match key pref codeassist substring match getjdtcorekey java core javacore codeassist substring match key get all keys getallkeys key pref codeassist autoactivation pref codeassist autoactivation delay pref codeassist autoinsert pref codeassist autoactivation triggers java pref codeassist autoactivation triggers javadoc pref codeassist visible proposals pref codeassist sorter pref codeassist sensitivity pref codeassist addimport pref codeassist imports pref codeassist insert completion pref codeassist fill argument names pref codeassist guess method arguments pref codeassist prefix completion pref codeassist deprecation check pref codeassist camel match pref codeassist substring match string true false truefalse string i preference store ipreferencestore i preference store ipreferencestore string enabled disabled enableddisabled string java core javacore enabled java core javacore disabled button f completion inserts radio button fcompletioninsertsradiobutton button f completion overwrites radio button fcompletionoverwritesradiobutton button f insert parameter names radio button finsertparameternamesradiobutton button f insert best guess radio button finsertbestguessradiobutton code assist configuration block codeassistconfigurationblock i status change listener istatuschangelistener status listener statuslistener i workbench preference container iworkbenchpreferencecontainer workbench container workbenchcontainer status listener statuslistener get all keys getallkeys workbench container workbenchcontainer override control create contents createcontents composite parent scrolled page content scrolledpagecontent scrolled scrolled page content scrolledpagecontent parent swt scroll swt scroll scrolled set expand horizontal setexpandhorizontal scrolled set expand vertical setexpandvertical composite control composite scrolled swt grid layout gridlayout layout grid layout gridlayout layout margin height marginheight layout margin width marginwidth control set layout setlayout layout composite composite composite create sub section createsubsection control preferences messages preferencesmessages code assist configuration block codeassistconfigurationblock insertion section insertionsection title add insertion section addinsertionsection composite composite create sub section createsubsection control preferences messages preferencesmessages code assist configuration block codeassistconfigurationblock sorting section sortingsection title add sorting section addsortingsection composite composite create sub section createsubsection control preferences messages preferencesmessages code assist configuration block codeassistconfigurationblock autoactivation section autoactivationsection title add auto activation section addautoactivationsection composite initialize scrolled set content setcontent control point size control compute size computesize swt swt scrolled set min size setminsize size size scrolled composite create sub section createsubsection composite parent string label group group group parent swt shadow group set text settext label grid data griddata data grid data griddata swt fill swt center group set layout data setlayoutdata data grid layout gridlayout layout grid layout gridlayout layout num columns numcolumns group set layout setlayout layout group add insertion section addinsertionsection composite composite add completion radio buttons addcompletionradiobuttons composite string label label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage insert single proposals auto matically insertsingleproposalsautomatically add check box addcheckbox composite label pref codeassist autoinsert true false truefalse label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage complete prefixes completeprefixes add check box addcheckbox composite label pref codeassist prefix completion true false truefalse label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage automatically add import instead of qualified name automaticallyaddimportinsteadofqualifiedname button master add check box addcheckbox composite label pref codeassist addimport true false truefalse label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage suggest static imports suggeststaticimports button slave add check box with link addcheckboxwithlink composite label pref codeassist imports enabled disabled enableddisabled swt selection adapter selectionadapter override widget selected widgetselected selection event selectionevent open static import favorites page openstaticimportfavoritespage create selection dependency createselectiondependency master slave get parent getparent label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage fill arguments on method completion fillargumentsonmethodcompletion master add check box addcheckbox composite label pref codeassist fill argument names true false truefalse composite fill composite fillcomposite composite composite swt grid data griddata grid data griddata horizontal span horizontalspan horizontal indent horizontalindent layout util layoututil get indent getindent fill composite fillcomposite set layout data setlayoutdata grid layout gridlayout layout grid layout gridlayout layout margin width marginwidth layout margin height marginheight layout num columns numcolumns fill composite fillcomposite set layout setlayout layout selection listener selectionlistener completion selection listener completionselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent f insert best guess radio button finsertbestguessradiobutton get selection getselection set value setvalue pref codeassist guess method arguments f insert parameter names radio button finsertparameternamesradiobutton button fill composite fillcomposite swt radio swt left f insert parameter names radio button finsertparameternamesradiobutton set text settext preferences messages preferencesmessages java editor preference page javaeditorpreferencepage fill parameter names on method completion fillparameternamesonmethodcompletion f insert parameter names radio button finsertparameternamesradiobutton set layout data setlayoutdata grid data griddata f insert parameter names radio button finsertparameternamesradiobutton add selection listener addselectionlistener completion selection listener completionselectionlistener f insert best guess radio button finsertbestguessradiobutton button fill composite fillcomposite swt radio swt left f insert best guess radio button finsertbestguessradiobutton set text settext preferences messages preferencesmessages java editor preference page javaeditorpreferencepage fill best guessed arguments on method completion fillbestguessedargumentsonmethodcompletion f insert best guess radio button finsertbestguessradiobutton set layout data setlayoutdata grid data griddata f insert best guess radio button finsertbestguessradiobutton add selection listener addselectionlistener completion selection listener completionselectionlistener create selection dependency createselectiondependency master f insert parameter names radio button finsertparameternamesradiobutton create selection dependency createselectiondependency master f insert best guess radio button finsertbestguessradiobutton open static import favorites page openstaticimportfavoritespage get preference container getpreferencecontainer get preference container getpreferencecontainer open page openpage code assist favorites preference page codeassistfavoritespreferencepage preferences util preferencesutil create preference dialog on createpreferencedialogon get shell getshell code assist favorites preference page codeassistfavoritespreferencepage open creates selection dependency master slave control param master master button controls slave param slave slave control enabled master selected create selection dependency createselectiondependency button master control slave master add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent event deep set enabled deepsetenabled slave master get selection getselection deep set enabled deepsetenabled control control enabled control set enabled setenabled enabled control composite control children composite control get children getchildren children length deep set enabled deepsetenabled children enabled slave set enabled setenabled master get selection getselection add sorting section addsortingsection composite composite string label label preferences messages preferencesmessages code assist configuration block codeassistconfigurationblock type filters typefilters link create preference page link createpreferencepagelink composite label label composite swt label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage present proposals in alphabet ical order presentproposalsinalphabeticalorder proposal sorter handle proposalsorterhandle sort ers sorters proposal sorter registry proposalsorterregistry get default getdefault get sort ers getsorters string labels string sort ers sorters length string values string sort ers sorters length sort ers sorters length proposal sorter handle proposalsorterhandle handle sort ers sorters labels handle get name getname values handle get id getid add combo box addcombobox composite label pref codeassist sorter values labels label preferences messages preferencesmessages code assist configuration block codeassistconfigurationblock match camel case matchcamelcase label add check box addcheckbox composite label pref codeassist camel match enabled disabled enableddisabled label preferences messages preferencesmessages code assist configuration block codeassistconfigurationblock match sub string matchsubstring label add check box addcheckbox composite label pref codeassist substring match enabled disabled enableddisabled label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage show only proposals visible in the invocation context showonlyproposalsvisibleintheinvocationcontext add check box addcheckbox composite label pref codeassist visible proposals true false truefalse label preferences messages preferencesmessages code assist configuration block codeassistconfigurationblock hide deprecated hidedeprecated label add check box addcheckbox composite label pref codeassist deprecation check enabled disabled enableddisabled create preference page link createpreferencepagelink composite composite string label map string string target info targetinfo link link link composite swt link set text settext label link add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent preferences util preferencesutil create preference dialog on createpreferencedialogon link get shell getshell text target info targetinfo add auto activation section addautoactivationsection composite composite string label label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage enable auto activation enableautoactivation button autoactivation add check box addcheckbox composite label pref codeassist autoactivation true false truefalse autoactivation add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent update auto activation controls updateautoactivationcontrols label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage auto activation delay autoactivationdelay add label led text field addlabelledtextfield composite label pref codeassist autoactivation delay label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage auto activation triggers for java autoactivationtriggersforjava add label led text field addlabelledtextfield composite label pref codeassist autoactivation triggers java label preferences messages preferencesmessages java editor preference page javaeditorpreferencepage auto activation triggers for java doc autoactivationtriggersforjavadoc add label led text field addlabelledtextfield composite label pref codeassist autoactivation triggers javadoc text add label led text field addlabelledtextfield composite parent string label key key text limit textlimit indent add label led text field addlabelledtextfield parent label key text limit textlimit text limit textlimit indent text add label led text field addlabelledtextfield composite parent string label key key model text limit modeltextlimit field text limit fieldtextlimit indent pixel converter pixelconverter pixel converter pixelconverter pixel converter pixelconverter parent label label control labelcontrol label parent swt label control labelcontrol set text settext label grid data griddata data grid data griddata data horizontal indent horizontalindent indent label control labelcontrol set layout data setlayoutdata data text text box textbox text parent swt border swt single text box textbox set data setdata key text box textbox set layout data setlayoutdata grid data griddata f labels flabels text box textbox label control labelcontrol string curr value currvalue get value getvalue key curr value currvalue text box textbox set text settext curr value currvalue text box textbox add modify listener addmodifylistener get text modify listener gettextmodifylistener data grid data griddata grid data griddata horizontal align fill model text limit modeltextlimit text box textbox set text limit settextlimit model text limit modeltextlimit field text limit fieldtextlimit data width hint widthhint pixel converter pixelconverter convert width in chars to pixels convertwidthincharstopixels field text limit fieldtextlimit data horizontal span horizontalspan text box textbox set layout data setlayoutdata data f text boxes ftextboxes add text box textbox text box textbox add completion radio buttons addcompletionradiobuttons composite content assist composite contentassistcomposite composite completion composite completioncomposite composite content assist composite contentassistcomposite swt grid data griddata ccgd grid data griddata ccgd horizontal span horizontalspan completion composite completioncomposite set layout data setlayoutdata ccgd grid layout gridlayout ccgl grid layout gridlayout ccgl margin width marginwidth ccgl num columns numcolumns completion composite completioncomposite set layout setlayout ccgl selection listener selectionlistener completion selection listener completionselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent insert f completion inserts radio button fcompletioninsertsradiobutton get selection getselection set value setvalue pref codeassist insert completion insert f completion inserts radio button fcompletioninsertsradiobutton button completion composite completioncomposite swt radio swt left f completion inserts radio button fcompletioninsertsradiobutton set text settext preferences messages preferencesmessages java editor preference page javaeditorpreferencepage completion inserts completioninserts f completion inserts radio button fcompletioninsertsradiobutton set layout data setlayoutdata grid data griddata f completion inserts radio button fcompletioninsertsradiobutton add selection listener addselectionlistener completion selection listener completionselectionlistener f completion overwrites radio button fcompletionoverwritesradiobutton button completion composite completioncomposite swt radio swt left f completion overwrites radio button fcompletionoverwritesradiobutton set text settext preferences messages preferencesmessages java editor preference page javaeditorpreferencepage completion overwrites completionoverwrites f completion overwrites radio button fcompletionoverwritesradiobutton set layout data setlayoutdata grid data griddata f completion overwrites radio button fcompletionoverwritesradiobutton add selection listener addselectionlistener completion selection listener completionselectionlistener label label label completion composite completioncomposite swt string modifier swt key support swtkeysupport get key formatter for platform getkeyformatterforplatform format abstract java completion proposal abstractjavacompletionproposal modifier toggle completion mode label set text settext nls bind preferences messages preferencesmessages java editor preference page javaeditorpreferencepage completion toggle hint completiontogglehint modifier grid data griddata grid data griddata horizontal indent horizontalindent layout util layoututil get indent getindent horizontal span horizontalspan label set layout data setlayoutdata initialize initialize fields initializefields initialize fields initializefields get boolean value getbooleanvalue pref codeassist insert completion f completion inserts radio button fcompletioninsertsradiobutton set selection setselection f completion overwrites radio button fcompletionoverwritesradiobutton set selection setselection get boolean value getbooleanvalue pref codeassist guess method arguments f insert best guess radio button finsertbestguessradiobutton set selection setselection f insert parameter names radio button finsertparameternamesradiobutton set selection setselection get boolean value getbooleanvalue pref codeassist fill argument names f insert parameter names radio button finsertparameternamesradiobutton set enabled setenabled f insert best guess radio button finsertbestguessradiobutton set enabled setenabled update auto activation controls updateautoactivationcontrols update auto activation controls updateautoactivationcontrols autoactivation get boolean value getbooleanvalue pref codeassist autoactivation set control enabled setcontrolenabled pref codeassist autoactivation delay autoactivation set control enabled setcontrolenabled pref codeassist autoactivation triggers java autoactivation set control enabled setcontrolenabled pref codeassist autoactivation triggers javadoc autoactivation override perform defaults performdefaults perform defaults performdefaults initialize fields initializefields override string get full build dialog strings getfullbuilddialogstrings workspace settings workspacesettings valid ates validates number positive param number number validate status validation i status istatus validate positive number validatepositivenumber string number status info statusinfo status status info statusinfo number length status set error seterror preferences messages preferencesmessages spelling preference page spellingpreferencepage empty threshold integer parse int parseint number status set error seterror messages format preferences messages preferencesmessages spelling preference page spellingpreferencepage invalid threshold number number format exception numberformatexception exception status set error seterror messages format preferences messages preferencesmessages spelling preference page spellingpreferencepage invalid threshold number status override validate settings validatesettings key key string old value oldvalue string new value newvalue key pref codeassist autoactivation delay equals key f context fcontext status changed statuschanged validate positive number validatepositivenumber get value getvalue pref codeassist autoactivation delay set control enabled setcontrolenabled key key enabled control control get control getcontrol key control set enabled setenabled enabled label label f labels flabels control label label set enabled setenabled enabled control get control getcontrol key key f combo boxes fcomboboxes size control curr f combo boxes fcomboboxes control data controldata data control data controldata curr get data getdata key equals data get key getkey curr f check boxes fcheckboxes size control curr f check boxes fcheckboxes control data controldata data control data controldata curr get data getdata key equals data get key getkey curr f text boxes ftextboxes size control curr f text boxes ftextboxes key curr key currkey key curr get data getdata key equals curr key currkey curr