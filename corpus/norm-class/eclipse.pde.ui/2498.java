copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal wizards feature org eclipse jface dialogs i dialog settings idialogsettings org eclipse jface dialogs i message provider imessageprovider org eclipse jface window window org eclipse jface wizard i wizard page iwizardpage org eclipse osgi util nls org eclipse pde internal core pde core pdecore org eclipse pde internal core ifeature i feature model ifeaturemodel org eclipse pde internal core util id util idutil org eclipse pde internal i help context ids ihelpcontextids org eclipse pde internal pde ui messages pdeuimessages org eclipse pde internal dialogs feature selection dialog featureselectiondialog org eclipse pde internal util swt util swtutil org eclipse pde internal wizards bundle provider history util bundleproviderhistoryutil org eclipse swt swt org eclipse swt events org eclipse swt layout grid data griddata org eclipse swt layout grid layout gridlayout org eclipse swt widgets patch spec page patchspecpage abstract feature spec page abstractfeaturespecpage combo f patch provider combo fpatchprovidercombo button f browse button fbrowsebutton text f patch id text fpatchidtext text f patch name text fpatchnametext text f feature id text ffeatureidtext patch spec page patchspecpage set title settitle pde ui messages pdeuimessages patch spec patchspec title set description setdescription pde ui messages pdeuimessages new feature wizard newfeaturewizard spec page specpage desc override initialize string project name projectname get project name getprojectname f initial id finitialid f patch id text fpatchidtext set text settext id util idutil get valid id getvalidid project name projectname f initial name finitialname f patch name text fpatchnametext set text settext project name projectname set message setmessage pde ui messages pdeuimessages feature patch featurepatch main page mainpage desc override string validate content validatecontent f feature to patch ffeaturetopatch pde core pdecore get default getdefault get feature model manager getfeaturemodelmanager find feature model findfeaturemodel f feature id text ffeatureidtext get text gettext f feature version text ffeatureversiontext get text gettext f feature to patch ffeaturetopatch set message setmessage set message setmessage nls bind pde ui messages pdeuimessages new feature patch newfeaturepatch spec page specpage not found notfound f feature id text ffeatureidtext get text gettext f feature version text ffeatureversiontext get text gettext i message provider imessageprovider warning get container getcontainer update buttons updatebuttons override i wizard page iwizardpage get next page getnextpage f feature to patch ffeaturetopatch get next page getnextpage string get patch id getpatchid f patch id text fpatchidtext nls f patch id text fpatchidtext get text gettext string get patch name getpatchname f patch name text fpatchnametext nls f patch name text fpatchnametext get text gettext string get patch provider getpatchprovider f patch provider combo fpatchprovidercombo nls f patch provider combo fpatchprovidercombo get text gettext override feature data featuredata get feature data getfeaturedata feature data featuredata data feature data featuredata data get patch id getpatchid nls data version data provider get patch provider getpatchprovider data get patch name getpatchname data library get install handler library getinstallhandlerlibrary data is patch ispatch data feature to patch id featuretopatchid f feature id text ffeatureidtext get text gettext data feature to patch version featuretopatchversion f feature version text ffeatureversiontext get text gettext data override string verify id rules verifyidrules string f patch id text fpatchidtext get text gettext length pde ui messages pdeuimessages new feature wizard newfeaturewizard spec page specpage pmissing id util idutil is valid composite d isvalidcompositeid pde ui messages pdeuimessages new feature wizard newfeaturewizard spec page specpage invalid id invalidid verify id rules verifyidrules override string get help id gethelpid i help context ids ihelpcontextids patch required data create top group createtopgroup composite container group patch group patchgroup group container swt patch group patchgroup set layout setlayout grid layout gridlayout grid data griddata grid data griddata grid data griddata fill horizontal vertical indent verticalindent patch group patchgroup set layout data setlayoutdata patch group patchgroup set text settext pde ui messages pdeuimessages new feature wizard newfeaturewizard spec page specpage patch properties patchproperties label label label patch group patchgroup swt label set text settext pde ui messages pdeuimessages new feature patch newfeaturepatch spec page specpage f patch id text fpatchidtext text patch group patchgroup swt border f patch id text fpatchidtext set layout data setlayoutdata grid data griddata grid data griddata fill horizontal label label patch group patchgroup swt label set text settext pde ui messages pdeuimessages new feature patch newfeaturepatch spec page specpage f patch name text fpatchnametext text patch group patchgroup swt border f patch name text fpatchnametext set layout data setlayoutdata grid data griddata grid data griddata fill horizontal label label patch group patchgroup swt label set text settext pde ui messages pdeuimessages new feature patch newfeaturepatch spec page specpage provider f patch provider combo fpatchprovidercombo combo patch group patchgroup swt border swt drop f patch provider combo fpatchprovidercombo set layout data setlayoutdata grid data griddata grid data griddata fill horizontal bundle provider history util bundleproviderhistoryutil load history loadhistory f patch provider combo fpatchprovidercombo get dialog settings getdialogsettings create install handler text createinstallhandlertext patch group patchgroup override create contents createcontents composite container create top group createtopgroup container group group group container swt group set layout setlayout grid layout gridlayout grid data griddata grid data griddata grid data griddata fill horizontal vertical indent verticalindent group set layout data setlayoutdata group set text settext pde ui messages pdeuimessages base feature spec page basefeaturespecpage patch group patchgroup title label label label group swt label set text settext pde ui messages pdeuimessages new feature wizard newfeaturewizard spec page specpage composite patchcontainer composite group swt grid layout gridlayout layout grid layout gridlayout layout margin height marginheight layout margin width marginwidth layout horizontal spacing horizontalspacing patchcontainer set layout setlayout layout patchcontainer set layout data setlayoutdata grid data griddata grid data griddata fill horizontal f feature id text ffeatureidtext text patchcontainer swt border f feature id text ffeatureidtext set layout data setlayoutdata grid data griddata grid data griddata fill horizontal f browse button fbrowsebutton button patchcontainer swt push f browse button fbrowsebutton set text settext pde ui messages pdeuimessages base feature spec page basefeaturespecpage browse f browse button fbrowsebutton set layout data setlayoutdata grid data griddata grid data griddata horizontal align f browse button fbrowsebutton add selection listener addselectionlistener selection adapter selectionadapter override widget selected widgetselected selection event selectionevent feature selection dialog featureselectiondialog dialog feature selection dialog featureselectiondialog get shell getshell pde core pdecore get default getdefault get feature model manager getfeaturemodelmanager get models getmodels dialog create dialog open window object result dialog get result getresult i feature model ifeaturemodel selected model selectedmodel i feature model ifeaturemodel result block auto validation set text settext f self modification fselfmodification f feature id text ffeatureidtext set text settext selected model selectedmodel get feature getfeature get id getid f feature name text ffeaturenametext set text settext selected model selectedmodel get feature getfeature get label getlabel f self modification fselfmodification f feature version text ffeatureversiontext set text settext selected model selectedmodel get feature getfeature get version getversion f feature to patch ffeaturetopatch selected model selectedmodel swt util swtutil set button dimension hint setbuttondimensionhint f browse button fbrowsebutton create common input createcommoninput group override attach listeners attachlisteners modify listener modifylistener listener f patch id text fpatchidtext add modify listener addmodifylistener listener f patch name text fpatchnametext add modify listener addmodifylistener listener f patch provider combo fpatchprovidercombo add modify listener addmodifylistener listener f feature id text ffeatureidtext add modify listener addmodifylistener listener override string get feature id getfeatureid f feature id text ffeatureidtext get text gettext override update name relative fields updatenamerelativefields f patch id text fpatchidtext f patch name text fpatchnametext f self modification fselfmodification string id util idutil get valid id getvalidid get project name getprojectname f patch id text fpatchidtext set text settext f patch name text fpatchnametext set text settext id util idutil get valid name getvalidname f patch provider combo fpatchprovidercombo get text gettext length f patch provider combo fpatchprovidercombo set text settext id util idutil get valid provider getvalidprovider f self modification fselfmodification override save settings savesettings i dialog settings idialogsettings settings bundle provider history util bundleproviderhistoryutil save history savehistory f patch provider combo fpatchprovidercombo settings