copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal wizards buildpaths new source page newsourcepage java lang reflect invocation target exception invocationtargetexception java util array list arraylist java util iterator java util list org eclipse swt widgets shell org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime sub progress monitor subprogressmonitor org eclipse core resources i folder ifolder org eclipse core resources i resource iresource org eclipse jface dialogs message dialog messagedialog org eclipse jface operation i runnable context irunnablecontext org eclipse jface operation i runnable with progress irunnablewithprogress org eclipse jface viewers i structured selection istructuredselection org eclipse jface viewers structured selection structuredselection org eclipse jface window window org eclipse i workbench site iworkbenchsite org eclipse platformui org eclipse i set selection target isetselectiontarget org eclipse jdt core i classpath entry iclasspathentry org eclipse jdt core i java project ijavaproject org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt core java core javacore org eclipse jdt core java model exception javamodelexception org eclipse jdt internal corext build path buildpath buildpath delta buildpathdelta org eclipse jdt internal corext build path buildpath cp java project cpjavaproject org eclipse jdt internal corext build path buildpath classpath modifier classpathmodifier org eclipse jdt internal corext util messages org eclipse jdt internal java plugin javaplugin org eclipse jdt internal java plugin images javapluginimages org eclipse jdt internal viewsupport basic element labels basicelementlabels org eclipse jdt internal wizards new wizard messages newwizardmessages org eclipse jdt internal wizards buildpaths cp list element cplistelement org eclipse jdt internal wizards buildpaths cp list element attribute cplistelementattribute org eclipse jdt internal wizards buildpaths output location dialog outputlocationdialog selected elements selectedelements iff enabled i package fragment root ipackagefragmentroot i java project ijavaproject cp list element attribute cplistelementattribute size edit output folder action editoutputfolderaction buildpath modifier action buildpathmodifieraction i runnable context irunnablecontext f context fcontext f show output folders fshowoutputfolders edit output folder action editoutputfolderaction i workbench site iworkbenchsite site site platformui get workbench getworkbench get progress service getprogressservice f show output folders fshowoutputfolders edit output folder action editoutputfolderaction i runnable context irunnablecontext context i set selection target isetselectiontarget selection target selectiontarget selection target selectiontarget context edit output folder action editoutputfolderaction i workbench site iworkbenchsite site i set selection target isetselectiontarget selection target selectiontarget i runnable context irunnablecontext context site selection target selectiontarget buildpath modifier action buildpathmodifieraction edit output f context fcontext context f show output folders fshowoutputfolders set text settext new wizard messages newwizardmessages new source container workbook page newsourcecontainerworkbookpage tool bar toolbar edit output editoutput label set image descriptor setimagedescriptor java plugin images javapluginimages desc elcl configure output folder set tool tip text settooltiptext new wizard messages newwizardmessages new source container workbook page newsourcecontainerworkbookpage tool bar toolbar edit output editoutput tooltip set disabled image descriptor setdisabledimagedescriptor java plugin images javapluginimages desc dlcl configure output folder override string get detailed description getdetaileddescription new wizard messages newwizardmessages package explorer action group packageexploreractiongroup form text formtext edit output folder editoutputfolder show output folders showoutputfolders show output folders showoutputfolders f show output folders fshowoutputfolders show output folders showoutputfolders override shell shell get shell getshell i java project ijavaproject java project javaproject cp list element cplistelement cp element cpelement object first element firstelement get selected elements getselectedelements first element firstelement i java project ijavaproject java project javaproject i java project ijavaproject first element firstelement i classpath entry iclasspathentry entry classpath modifier classpathmodifier get classpath entry for getclasspathentryfor java project javaproject get path getpath java project javaproject i classpath entry iclasspathentry cpe source cp element cpelement cp list element cplistelement create from existing createfromexisting entry java project javaproject first element firstelement i package fragment root ipackagefragmentroot i package fragment root ipackagefragmentroot root i package fragment root ipackagefragmentroot first element firstelement java project javaproject root get java project getjavaproject i classpath entry iclasspathentry entry classpath modifier classpathmodifier get classpath entry for getclasspathentryfor root get path getpath java project javaproject i classpath entry iclasspathentry cpe source cp element cpelement cp list element cplistelement create from existing createfromexisting entry java project javaproject first element firstelement cp list element attribute cplistelementattribute cp list element attribute cplistelementattribute attribute cp list element attribute cplistelementattribute first element firstelement cp element cpelement attribute get parent getparent java project javaproject cp element cpelement get java project getjavaproject list cp list element cplistelement classpath entries classpathentries classpath modifier classpathmodifier get existing entries getexistingentries java project javaproject cp list element cplistelement element classpath modifier classpathmodifier get classpath entry getclasspathentry classpath entries classpathentries cp element cpelement output location dialog outputlocationdialog dialog output location dialog outputlocationdialog shell element classpath entries classpathentries java project javaproject get output location getoutputlocation dialog open window cp java project cpjavaproject cp project cpproject cp java project cpjavaproject create from existing createfromexisting java project javaproject buildpath delta buildpathdelta delta classpath modifier classpathmodifier set output location setoutputlocation cp project cpproject getcpelement element dialog get output location getoutputlocation cp project cpproject i folder ifolder old output folder oldoutputfolder get old output folder getoldoutputfolder delta i folder ifolder folder to delete foldertodelete old output folder oldoutputfolder string message messages format new wizard messages newwizardmessages edit output folder action editoutputfolderaction delete old output folder question deleteoldoutputfolderquestion basic element labels basicelementlabels get path label getpathlabel old output folder oldoutputfolder get full path getfullpath message dialog messagedialog open question openquestion get shell getshell new wizard messages newwizardmessages output location dialog outputlocationdialog title message folder to delete foldertodelete old output folder oldoutputfolder folder to delete foldertodelete folder to delete foldertodelete i runnable with progress irunnablewithprogress runnable i runnable with progress irunnablewithprogress override i progress monitor iprogressmonitor monitor invocation target exception invocationtargetexception interrupted exception interruptedexception monitor begin task begintask new wizard messages newwizardmessages edit output folder action editoutputfolderaction progress monitor description progressmonitordescription folder to delete foldertodelete classpath modifier classpathmodifier commit class path commitclasspath cp project cpproject sub progress monitor subprogressmonitor monitor folder to delete foldertodelete folder to delete foldertodelete delete sub progress monitor subprogressmonitor monitor info rm listeners informlisteners delta select and reveal selectandreveal structured selection structuredselection java core javacore create element get resource getresource core exception coreexception invocation target exception invocationtargetexception monitor f context fcontext runnable invocation target exception invocationtargetexception java plugin javaplugin log interrupted exception interruptedexception core exception coreexception show exception dialog showexceptiondialog new wizard messages newwizardmessages edit output folder action editoutputfolderaction error description errordescription i folder ifolder get old output folder getoldoutputfolder buildpath delta buildpathdelta delta i resource iresource deleted resources deletedresources delta get deleted resources getdeletedresources list i resource iresource existing folders existingfolders array list arraylist deleted resources deletedresources length deleted resources deletedresources i folder ifolder deleted resources deletedresources exists existing folders existingfolders add deleted resources deletedresources existing folders existingfolders size existing folders existingfolders size nls string message existing folders iterator i resource iresource iterator existing folders existingfolders iterator iterator has next hasnext i folder ifolder folder i folder ifolder iterator nls message folder to string tostring is true istrue message i folder ifolder existing folders existingfolders override can handle canhandle i structured selection istructuredselection elements f show output folders fshowoutputfolders elements size object element elements get first element getfirstelement element i package fragment root ipackagefragmentroot i package fragment root ipackagefragmentroot root i package fragment root ipackagefragmentroot element root get kind getkind i package fragment root ipackagefragmentroot source i java project ijavaproject java project javaproject root get java project getjavaproject java project javaproject i classpath entry iclasspathentry entry classpath modifier classpathmodifier get classpath entry for getclasspathentryfor root get path getpath java project javaproject i classpath entry iclasspathentry cpe source entry element i java project ijavaproject i java project ijavaproject project i java project ijavaproject element classpath modifier classpathmodifier is source folder issourcefolder project element cp list element attribute cplistelementattribute cp list element attribute cplistelementattribute attribute cp list element attribute cplistelementattribute element attribute get key getkey cp list element cplistelement output java model exception javamodelexception