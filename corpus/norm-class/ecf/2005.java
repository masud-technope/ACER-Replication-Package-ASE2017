copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse ecf internal wizards org eclipse core runtime org eclipse core runtime i adaptable iadaptable org eclipse core runtime platform org eclipse core runtime platform object platformobject org eclipse jface resource image descriptor imagedescriptor org eclipse jface viewers decorating label provider decoratinglabelprovider org eclipse jface viewers i color provider icolorprovider org eclipse jface viewers i font provider ifontprovider org eclipse jface viewers i label provider ilabelprovider org eclipse jface viewers label provider labelprovider org eclipse jface viewers label provider changed event labelproviderchangedevent org eclipse swt graphics color org eclipse swt graphics font org eclipse swt graphics font data fontdata org eclipse swt graphics image org eclipse swt graphics rgb org eclipse swt widgets display org eclipse i editor registry ieditorregistry org eclipse i property listener ipropertylistener org eclipse platformui org eclipse model i workbench adapter iworkbenchadapter org eclipse model i workbench adapter iworkbenchadapter basic labels adaptable objects code i workbench adapter iworkbenchadapter code adapter disp ensed dispensed images cached label provider explicitly root disposed rootdisposed facility subclasses define annotations labels icons adaptable objects workbench label provider workbenchlabelprovider label provider labelprovider i color provider icolorprovider i font provider ifontprovider returns workbench label provider hooked decorator mechanism code decorating label provider decoratinglabelprovider code wraps code code workbench label provider workbenchlabelprovider code i label provider ilabelprovider get decorating workbench label provider getdecoratingworkbenchlabelprovider decorating label provider decoratinglabelprovider workbench label provider workbenchlabelprovider platformui get workbench getworkbench get decorator manager getdecoratormanager get label decorator getlabeldecorator listener tracks editor registry full update workbench adapters derive icon file associations registry i property listener ipropertylistener editor registry listener editorregistrylistener i property listener ipropertylistener property changed propertychanged object source prop id propid prop id propid i editor registry ieditorregistry prop contents fire label provider changed firelabelproviderchanged label provider changed event labelproviderchangedevent workbench label provider workbenchlabelprovider creates workbench label provider workbench label provider workbenchlabelprovider platformui get workbench getworkbench get editor registry geteditorregistry add property listener addpropertylistener editor registry listener editorregistrylistener returns image descriptor based descriptor decorated additional rel ating relating object subclasses reimplement method decorate object image param input base image decorate param element element decorations res uling resuling image descriptor imagedescriptor org eclipse jface resource composite image descriptor compositeimagedescriptor image descriptor imagedescriptor decorate image decorateimage image descriptor imagedescriptor input object element input returns label based label decorated additional rel ating relating object subclasses implement method decorate object label param input base text decorate param element element decorations text string decorate text decoratetext string input object element input javadoc method declared i label provider ilabelprovider dispose platformui get workbench getworkbench get editor registry geteditorregistry remove property listener removepropertylistener editor registry listener editorregistrylistener dispose object get adapter util getadapterutil object source object sourceobject adapter type adaptertype is not null isnotnull adapter type adaptertype source object sourceobject adapter type adaptertype is instance isinstance source object sourceobject source object sourceobject source object sourceobject i adaptable iadaptable i adaptable iadaptable adaptable i adaptable iadaptable source object sourceobject object result adaptable get adapter getadapter adapter type adaptertype result sanity check is true istrue adapter type adaptertype is instance isinstance result result source object sourceobject platform object platformobject object result platform get adapter manager getadaptermanager get adapter getadapter source object sourceobject adapter type adaptertype result result returns implementation i workbench adapter iworkbenchadapter object param object i workbench adapter iworkbenchadapter code code adapter defined object adaptable i workbench adapter iworkbenchadapter get adapter getadapter object i workbench adapter iworkbenchadapter get adapter util getadapterutil i workbench adapter iworkbenchadapter returns implementation i workbench adapter iworkbenchadapter object param object i workbench adapter iworkbenchadapter code code adapter defined object adaptable i workbench adapter iworkbenchadapter get adapter getadapter object i workbench adapter iworkbenchadapter get adapter util getadapterutil i workbench adapter iworkbenchadapter javadoc method declared i label provider ilabelprovider image get image getimage object element base image querying element i workbench adapter iworkbenchadapter adapter get adapter getadapter element adapter image descriptor imagedescriptor descriptor adapter get image descriptor getimagedescriptor element descriptor add annotations image descriptor descriptor decorate image decorateimage descriptor element image image image swt resource util swtresourceutil get image table getimagetable descriptor image image descriptor create image createimage swt resource util swtresourceutil get image table getimagetable descriptor image image image descriptor create image createimage image javadoc method declared i label provider ilabelprovider string get text gettext object element query element label i workbench adapter iworkbenchadapter adapter get adapter getadapter element adapter nls string label adapter get label getlabel element decorated label decorate text decoratetext label element javadoc org eclipse jface viewers i color provider icolorprovider get foreground getforeground java lang object color get foreground getforeground object element get color getcolor element javadoc org eclipse jface viewers i color provider icolorprovider get background getbackground java lang object color get background getbackground object element get color getcolor element javadoc org eclipse jface viewers i font provider ifontprovider get font getfont java lang object font get font getfont object element i workbench adapter iworkbenchadapter adapter get adapter getadapter element adapter font data fontdata descriptor adapter get font getfont element descriptor font font font swt resource util swtresourceutil get font table getfonttable descriptor font font font display get current getcurrent descriptor swt resource util swtresourceutil get font table getfonttable descriptor font font font font display get current getcurrent descriptor font color get color getcolor object element for ground forground i workbench adapter iworkbenchadapter adapter get adapter getadapter element adapter rgb descriptor for ground forground adapter get foreground getforeground element adapter get background getbackground element descriptor color color color swt resource util swtresourceutil get color table getcolortable descriptor color color color display get current getcurrent descriptor swt resource util swtresourceutil get color table getcolortable descriptor color color color color display get current getcurrent descriptor color