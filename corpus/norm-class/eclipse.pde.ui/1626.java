copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal org eclipse core runtime org eclipse jface dialogs i dialog constants idialogconstants org eclipse jface layout pixel converter pixelconverter org eclipse jface resource j fac e resources jfaceresources org eclipse swt swt org eclipse swt graphics font org eclipse swt graphics image org eclipse swt layout grid data griddata org eclipse swt layout grid layout gridlayout org eclipse swt widgets org eclipse dialogs preferences util preferencesutil org eclipse forms widgets expandable composite expandablecomposite org eclipse forms widgets shared scrolled composite sharedscrolledcomposite factory create swt resources swt factory swtfactory returns width hint button control get button width hint getbuttonwidthhint button button button set font setfont j fac e resources jfaceresources get dialog font getdialogfont pixel converter pixelconverter converter pixel converter pixelconverter button width hint widthhint converter convert horizontal us to pixels converthorizontaldlustopixels i dialog constants idialogconstants button width math max width hint widthhint button compute size computesize swt swt returns width hint button control get button width hint getbuttonwidthhint button button width hint widthhint button set font setfont j fac e resources jfaceresources get dialog font getdialogfont math max width hint widthhint button compute size computesize swt swt sets width height hint button control note nop button layout data instance code grid data griddata code param button dimension hint set button dimension hint setbuttondimensionhint button button is not null isnotnull button object button get layout data getlayoutdata grid data griddata grid data griddata width hint widthhint get button width hint getbuttonwidthhint button grid data griddata horizontal alignment horizontalalignment grid data griddata fill creates check box button parents font param parent parent add button param label label button param image image button param checked initial checked button param hspan horizontal span parent composite checked button initial checked button create check button createcheckbutton composite parent string label image image checked hspan button button button parent swt check button set font setfont parent get font getfont button set selection setselection checked image button set image setimage image label button set text settext label grid data griddata grid data griddata horizontal span horizontalspan hspan button set layout data setlayoutdata set button dimension hint setbuttondimensionhint button button creates returns push button label image param parent parent control param label button label code code param image image code code push button button create push button createpushbutton composite parent string label image image button button button parent swt push button set font setfont parent get font getfont image button set image setimage image label button set text settext label grid data griddata grid data griddata button set layout data setlayoutdata swt factory swtfactory set button dimension hint setbuttondimensionhint button button creates returns push button label image param parent parent control param label button label code code param image image code code param fill alignment button push button button create push button createpushbutton composite parent string label image image fill button button button parent swt push button set font setfont parent get font getfont image button set image setimage image label button set text settext label grid data griddata grid data griddata fill button set layout data setlayoutdata swt factory swtfactory set button dimension hint setbuttondimensionhint button button creates returns radio button label param parent parent control param label button label code code radio button button create radio button createradiobutton composite parent string label create radio button createradiobutton parent label creates returns radio button label param parent parent control param label button label code code param hspan number columns horizontally span parent composite radio button button create radio button createradiobutton composite parent string label hspan button button button parent swt radio button set font setfont parent get font getfont label button set text settext label grid data griddata grid data griddata horizontal span horizontalspan hspan button set layout data setlayoutdata swt factory swtfactory set button dimension hint setbuttondimensionhint button button creates label widget param parent parent composite add label widget param text text label param hspan horizontal span parent composite label label create label createlabel composite parent string text hspan label label parent swt set font setfont parent get font getfont set text settext text grid data griddata grid data griddata grid data griddata fill horizontal horizontal span horizontalspan hspan grab excess horizontal space grabexcesshorizontalspace set layout data setlayoutdata creates label widget param parent parent composite add label widget param text text label param font font label param hspan horizontal span parent composite label label create label createlabel composite parent string text font font hspan label label parent swt set font setfont font set text settext text grid data griddata grid data griddata grid data griddata fill horizontal horizontal span horizontalspan hspan set layout data setlayoutdata creates wrapping label param parent parent composite add label param text text displayed label param hspan horizontal span label parent composite param wrap width wrapwidth width hint label wrap label wraps width label create wrap label createwraplabel composite parent string text hspan wrap width wrapwidth label label parent swt swt wrap set font setfont parent get font getfont set text settext text grid data griddata grid data griddata grid data griddata fill horizontal horizontal span horizontalspan hspan width hint widthhint wrap width wrapwidth set layout data setlayoutdata creates wrapping label param parent parent composite add label param text text displayed label param hspan horizontal span label parent composite label wraps width label create wrap label createwraplabel composite parent string text hspan label label parent swt swt wrap set font setfont parent get font getfont set text settext text grid data griddata grid data griddata grid data griddata fill horizontal horizontal span horizontalspan hspan set layout data setlayoutdata creates scrolled composite param parent parent add param columns number columns composite param hspan horizontal span parent param marginwidth width margins param marginheight height margins scrolled composite shared scrolled composite sharedscrolledcomposite create scrolled composite createscrolledcomposite composite parent columns hspan marginwidth marginheight create scrolled composite createscrolledcomposite parent swt scroll swt scroll columns hspan marginwidth marginheight creates scrolled composite param parent parent add param style style bits composite param columns number columns composite param hspan horizontal span parent param marginwidth width margins param marginheight height margins scrolled composite shared scrolled composite sharedscrolledcomposite create scrolled composite createscrolledcomposite composite parent style columns hspan marginwidth marginheight shared scrolled composite sharedscrolledcomposite comp shared scrolled composite sharedscrolledcomposite parent style grid layout gridlayout layout grid layout gridlayout columns layout margin height marginheight marginheight layout margin width marginwidth marginwidth comp set layout setlayout layout grid data griddata grid data griddata grid data griddata fill horizontal span horizontalspan hspan comp set layout data setlayoutdata comp set expand horizontal setexpandhorizontal comp set expand vertical setexpandvertical comp creates expandible composite expandiblecomposite widget param parent parent add widget param style style expandible composite expandiblecomposite exp anding expanding handle layout param label label widget param hspan columns span parent param fill fill style widget code grid data griddata fill horizonal code code grid data griddata fill code code grid data griddata fill vertical code expandible composite expandiblecomposite widget expandable composite expandablecomposite create expandible composite createexpandiblecomposite composite parent string label hspan fill expandable composite expandablecomposite expandable composite expandablecomposite parent swt expandable composite expandablecomposite twistie expandable composite expandablecomposite client indent set text settext label set font setfont j fac e resources jfaceresources get font registry getfontregistry get bold getbold j fac e resources jfaceresources dialog font grid data griddata grid data griddata fill horizontal span horizontalspan hspan grab excess horizontal space grabexcesshorizontalspace set layout data setlayoutdata creates text widget param parent parent composite add text widget param hspan horizontal span parent composite text widget text create single text createsingletext composite parent hspan text text parent swt single swt border set font setfont parent get font getfont grid data griddata grid data griddata grid data griddata fill horizontal horizontal span horizontalspan hspan set layout data setlayoutdata creates text widget param parent parent composite add text widget param style style bits text widget param hspan horizontal span parent composite param fill fill grid layout text widget text create text createtext composite parent style hspan fill text text parent style set font setfont parent get font getfont grid data griddata grid data griddata fill horizontal span horizontalspan hspan set layout data setlayoutdata creates text widget param parent parent composite add text widget param style style bits text widget param hspan horizontal span parent composite text widget text create text createtext composite parent style hspan text text parent style set font setfont parent get font getfont grid data griddata grid data griddata grid data griddata fill horizontal horizontal span horizontalspan hspan set layout data setlayoutdata creates text widget param parent parent composite add text widget param style style bits text widget param hspan horizontal span parent composite param width desired width text widget param height desired height text widget param fill fill style widget text widget text create text createtext composite parent style hspan width height fill text text parent style set font setfont parent get font getfont grid data griddata grid data griddata fill horizontal span horizontalspan hspan width hint widthhint width height hint heighthint height set layout data setlayoutdata creates group widget param parent parent composite add group param text text heading group param columns number columns group param hspan horizontal span group parent param fill style composite fill parent group group create group creategroup composite parent string text columns hspan fill group group parent swt set layout setlayout grid layout gridlayout columns set text settext text set font setfont parent get font getfont grid data griddata grid data griddata fill horizontal span horizontalspan hspan set layout data setlayoutdata creates composite parent font grid layout param parent parent add composite param columns number columns composite param hspan horizontal span composite parent param fill fill style composite link grid data griddata composite grid layout composite create composite createcomposite composite parent columns hspan fill composite composite parent swt set layout setlayout grid layout gridlayout columns set font setfont parent get font getfont grid data griddata grid data griddata fill horizontal span horizontalspan hspan grab excess horizontal space grabexcesshorizontalspace set layout data setlayoutdata creates composite parent font grid layout param parent parent add composite param font font composite param columns number columns composite param hspan horizontal span composite parent param fill fill style composite link grid data griddata composite grid layout composite create composite createcomposite composite parent font font columns hspan fill composite composite parent swt set layout setlayout grid layout gridlayout columns set font setfont font grid data griddata grid data griddata fill horizontal span horizontalspan hspan grab excess horizontal space grabexcesshorizontalspace set layout data setlayoutdata creates composite parent font grid layout param parent parent add composite param columns number columns composite param hspan horizontal span composite parent param fill fill style composite link grid data griddata param style style composite composite grid layout composite create composite createcomposite composite parent columns hspan fill style composite composite parent style set layout setlayout grid layout gridlayout columns set font setfont parent get font getfont grid data griddata grid data griddata fill horizontal span horizontalspan hspan grab excess horizontal space grabexcesshorizontalspace set layout data setlayoutdata creates vertical space r spacer separating components applied code grid layout gridlayout code method automatically span columns parent vertical space param parent parent composite add space r spacer param num lines numlines number vertical lines space create vertical space r createverticalspacer composite parent num lines numlines label lbl label parent swt grid data griddata grid data griddata grid data griddata fill horizontal layout layout parent get layout getlayout layout grid layout gridlayout horizontal span horizontalspan grid layout gridlayout parent get layout getlayout num columns numcolumns height hint heighthint num lines numlines lbl set layout data setlayoutdata creates horizontal space r spacer separating components param comp param num lines numlines create horizontal space r createhorizontalspacer composite comp num lines numlines label lbl label comp swt grid data griddata grid data griddata grid data griddata fill horizontal horizontal span horizontalspan num lines numlines lbl set layout data setlayoutdata creates composite widget param parent parent composite add composite param columns number columns composite param hspan horizontal span composite parent param fill style composite fill parent param marginwidth width margin place sides composite grid layout gridlayout param marginheight height margin place top bottom composite composite composite create composite createcomposite composite parent columns hspan fill marginwidth marginheight composite composite parent swt grid layout gridlayout layout grid layout gridlayout columns layout margin width marginwidth marginwidth layout margin height marginheight marginheight set layout setlayout layout set font setfont parent get font getfont grid data griddata grid data griddata fill horizontal span horizontalspan hspan set layout data setlayoutdata method combo box param parent parent composite add combo param style style combo param hspan horizontal span parent composite param fill combo fill composite code grid data griddata fill horizonal code code grid data griddata fill code code grid data griddata fill vertical code param items item combo combo instance combo create combo createcombo composite parent style hspan fill string items combo combo parent style set font setfont parent get font getfont grid data griddata grid data griddata fill horizontal span horizontalspan hspan set layout data setlayoutdata items set items setitems items platforms open combos bad sizes bug set visible item count setvisibleitemcount select method combo box fill style grid data griddata fill horizontal param parent parent composite add combo param style style combo param hspan horizontal span parent composite param items item combo combo instance combo create combo createcombo composite parent style hspan string items combo combo parent style set font setfont parent get font getfont grid data griddata grid data griddata grid data griddata fill horizontal horizontal span horizontalspan hspan set layout data setlayoutdata items set items setitems items platforms open combos bad sizes bug set visible item count setvisibleitemcount select method open preference dialog specific perspective param shell parent shell param preference param actual result window open show preference page showpreferencepage shell shell string object data preferences util preferencesutil create preference dialog on createpreferencedialogon shell string data open