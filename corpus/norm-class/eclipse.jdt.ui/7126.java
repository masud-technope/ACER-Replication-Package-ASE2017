copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal package view packageview java util array list arraylist java util arrays java util hash map hashmap java util hash set hashset java util iterator java util list java util map java util org eclipse swt dnd dnd org eclipse swt dnd drop target event droptargetevent org eclipse swt dnd transfer org eclipse swt dnd transfer data transferdata org eclipse core runtime i adaptable iadaptable org eclipse core resources i resource iresource org eclipse jface util transfer drop target listener transferdroptargetlistener org eclipse jface viewers i selection iselection org eclipse jface viewers i structured selection istructuredselection org eclipse jface viewers i tree selection itreeselection org eclipse jface viewers tree path treepath org eclipse i working set iworkingset org eclipse views navigator local selection transfer localselectiontransfer org eclipse jdt core i java element ijavaelement org eclipse jdt internal corext refactoring reorg reorg utils reorgutils org eclipse jdt internal dnd jdt viewer drop adapter jdtviewerdropadapter org eclipse jdt internal working sets workingsets i working set ds iworkingsetids org eclipse jdt internal working sets workingsets working set model workingsetmodel working set drop adapter workingsetdropadapter jdt viewer drop adapter jdtviewerdropadapter transfer drop target listener transferdroptargetlistener package explorer part packageexplorerpart f package explorer fpackageexplorer i structured selection istructuredselection f selection fselection object f elements to adds felementstoadds i adaptable iadaptable f current elements fcurrentelements i working set iworkingset f working set fworkingset f location flocation working set drop adapter workingsetdropadapter package explorer part packageexplorerpart get tree viewer gettreeviewer f package explorer fpackageexplorer f location flocation set scroll enabled setscrollenabled set expand enabled setexpandenabled set feedback enabled setfeedbackenabled transfer drop target listener transferdroptargetlistener override transfer get transfer gettransfer local selection transfer localselectiontransfer get instance getinstance override is enabled isenabled drop target event droptargetevent event object target event item event item get data getdata target i selection iselection selection local selection transfer localselectiontransfer get instance getinstance get selection getselection is valid selection isvalidselection selection is valid target isvalidtarget target initialize state initializestate target selection actual dnd override validate drop validatedrop object target operation transfer data transferdata transfer type transfertype determine operation determineoperation target operation transfer type transfertype dnd drop move dnd drop link dnd drop copy dnd drop override determine operation determineoperation object target operation transfer data transferdata transfer type transfertype operations operation dnd drop dnd drop copy dnd drop move validate target validatetarget target operation dnd drop validate target validatetarget object target operation set feedback enabled setfeedbackenabled set scroll enabled setscrollenabled set expand enabled setexpandenabled is valid target isvalidtarget target dnd drop i selection iselection local selection transfer localselectiontransfer get instance getinstance get selection getselection is valid selection isvalidselection dnd drop initialize state initializestate target is working set selection isworkingsetselection set expand enabled setexpandenabled get current location getcurrentlocation location get current location getcurrentlocation location f package explorer fpackageexplorer get working set model getworkingsetmodel is sorting enabled issortingenabled set feedback enabled setfeedbackenabled dnd drop move dnd drop is others working set isothersworkingset f working set fworkingset operation dnd drop copy dnd drop list i java element ijavaelement real java elements realjavaelements array list arraylist list i resource iresource real resource realresource array list arraylist reorg utils reorgutils split into java elements and resources splitintojavaelementsandresources f elements to adds felementstoadds real java elements realjavaelements real resource realresource f elements to adds felementstoadds length real java elements realjavaelements size real resource realresource size dnd drop iterator i java element ijavaelement iter real java elements realjavaelements iterator iter has next hasnext i java element ijavaelement element iter reorg utils reorgutils contains element or parent containselementorparent f current elements fcurrentelements element dnd drop iterator i resource iresource iter real resource realresource iterator iter has next hasnext i resource iresource element iter reorg utils reorgutils contains element or parent containselementorparent f current elements fcurrentelements element dnd drop f selection fselection i tree selection itreeselection dnd drop copy i tree selection itreeselection tree selection treeselection i tree selection itreeselection f selection fselection tree path treepath paths tree selection treeselection get paths getpaths paths length tree path treepath path paths path get segment count getsegmentcount dnd drop copy path get segment getsegment i working set iworkingset dnd drop copy paths length i working set iworkingset i working set iworkingset path get segment getsegment is others working set isothersworkingset dnd drop move operation dnd drop dnd drop move operation is valid target isvalidtarget object target target i working set iworkingset is valid selection isvalidselection i selection iselection selection selection i structured selection istructuredselection is others working set isothersworkingset i working set iworkingset i working set ds iworkingsetids equals get id getid initialize state initializestate object target i selection iselection f working set fworkingset i working set iworkingset target f selection fselection i structured selection istructuredselection f elements to adds felementstoadds f selection fselection to array toarray f current elements fcurrentelements hash set hashset arrays as list aslist f working set fworkingset get elements getelements is working set selection isworkingsetselection f elements to adds felementstoadds length f elements to adds felementstoadds i working set iworkingset override perform drop performdrop object data is working set selection isworkingsetselection perform working set reordering performworkingsetreordering perform element rearrange performelementrearrange get current operation getcurrentoperation perform working set reordering performworkingsetreordering working set model workingsetmodel model f package explorer fpackageexplorer get working set model getworkingsetmodel list i working set iworkingset all working sets allworkingsets array list arraylist arrays as list aslist model get all working sets getallworkingsets all working sets allworkingsets index of indexof f working set fworkingset get current location getcurrentlocation location list i working set iworkingset result array list arraylist all working sets allworkingsets size is working set selection isworkingsetselection ensures elements i working sets iworkingsets suppress warnings suppresswarnings unchecked list i working set iworkingset selected array list arraylist list i working set iworkingset list arrays as list aslist f elements to adds felementstoadds list i working set iworkingset active working sets activeworkingsets array list arraylist arrays as list aslist model get active working sets getactiveworkingsets list i working set iworkingset active array list arraylist active working sets activeworkingsets size all working sets allworkingsets size result add all addall selected active add all addall selected i working set iworkingset element all working sets allworkingsets selected element result add element active working sets activeworkingsets element active add element all working sets allworkingsets size result add all addall selected active add all addall selected model set working sets setworkingsets result to array toarray i working set iworkingset result size model is sorting enabled issortingenabled active to array toarray i working set iworkingset active size perform element rearrange performelementrearrange event detail eventdetail move happen n happenn automatically ref res hing refreshing working is others working set isothersworkingset f working set fworkingset list object elements array list arraylist object arrays as list aslist f working set fworkingset get elements getelements elements add all addall arrays as list aslist f elements to adds felementstoadds f working set fworkingset set elements setelements elements to array toarray i adaptable iadaptable elements size event detail eventdetail dnd drop move i tree selection itreeselection tree selection treeselection i tree selection itreeselection f selection fselection map i working set iworkingset list object working sets workingsets group by working sets groupbyworkingsets tree selection treeselection get paths getpaths iterator i working set iworkingset iter working sets workingsets key set keyset iterator iter has next hasnext i working set iworkingset iter list object to remove toremove working sets workingsets list i adaptable iadaptable current elements currentelements array list arraylist arrays as list aslist get elements getelements current elements currentelements remove all removeall to remove toremove set elements setelements current elements currentelements to array toarray i adaptable iadaptable current elements currentelements size map i working set iworkingset list object group by working sets groupbyworkingsets tree path treepath paths map i working set iworkingset list object result hash map hashmap paths length tree path treepath path paths i working set iworkingset i working set iworkingset path get segment getsegment list object result array list arraylist result add path get segment getsegment result test methods j unit junit test dn d dnd hard simulate internal test validate target internaltestvalidatetarget object target operation validate target validatetarget target operation internal test drop internaltestdrop object target event detail eventdetail is working set selection isworkingsetselection perform working set reordering performworkingsetreordering perform element rearrange performelementrearrange event detail eventdetail internal test set location internaltestsetlocation location f location flocation location override get current location getcurrentlocation f location flocation get current location getcurrentlocation f location flocation