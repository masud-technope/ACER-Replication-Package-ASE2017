copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal java editor javaeditor selection actions selectionactions java util list org eclipse core runtime org eclipse jface action action org eclipse jface dialogs message dialog messagedialog org eclipse jface text i text selection itextselection org eclipse jdt core i java element ijavaelement org eclipse jdt core i source range isourcerange org eclipse jdt core i source reference isourcereference org eclipse jdt core i type root ityperoot org eclipse jdt core java model exception javamodelexception org eclipse jdt core source range sourcerange org eclipse jdt core dom ast node astnode org eclipse jdt core dom child list property descriptor childlistpropertydescriptor org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom structural property descriptor structuralpropertydescriptor org eclipse jdt internal corext dom ast nodes astnodes org eclipse jdt internal corext dom selection org eclipse jdt internal corext dom selection analyzer selectionanalyzer org eclipse jdt sharedastprovider org eclipse jdt internal java plugin javaplugin org eclipse jdt internal java editor javaeditor editor utility editorutility org eclipse jdt internal java editor javaeditor java editor javaeditor structure selection action structureselectionaction action nls string select next element selectnextelement nls string previous select previous element selectpreviouselement nls string enclosing select enclosing element selectenclosingelement nls string history restore last selection restorelastselection java editor javaeditor f editor feditor selection history selectionhistory f selection history fselectionhistory structure selection action structureselectionaction string text java editor javaeditor editor selection history selectionhistory history text is not null isnotnull editor is not null isnotnull history f editor feditor editor f selection history fselectionhistory history constructor testing purpose structure selection action structureselectionaction nls method declared i action iaction override i java element ijavaelement input element inputelement editor utility editorutility get editor input java element geteditorinputjavaelement f editor feditor input element inputelement i type root ityperoot input element inputelement exists i type root ityperoot type root typeroot i type root ityperoot input element inputelement i source range isourcerange source range sourcerange source range sourcerange type root typeroot get source range getsourcerange source range sourcerange source range sourcerange get length getlength message dialog messagedialog open information openinformation f editor feditor get editor site geteditorsite get shell getshell selection action messages selectionactionmessages structure select structureselect error title selection action messages selectionactionmessages structure select structureselect error message java model exception javamodelexception i text selection itextselection selection get text selection gettextselection i source range isourcerange new range newrange get new selection range getnewselectionrange create source range createsourcerange selection type root typeroot check selection differs current selection selection get offset getoffset new range newrange get offset getoffset selection get length getlength new range newrange get length getlength f selection history fselectionhistory remember source range sourcerange selection get offset getoffset selection get length getlength f selection history fselectionhistory ignore selection changes ignoreselectionchanges f editor feditor select and reveal selectandreveal new range newrange get offset getoffset new range newrange get length getlength f selection history fselectionhistory listen to selection changes listentoselectionchanges i source range isourcerange get new selection range getnewselectionrange i source range isourcerange old source range oldsourcerange i type root ityperoot type root typeroot compilation unit compilationunit root getast type root typeroot root old source range oldsourcerange selection selection selection create from start length createfromstartlength old source range oldsourcerange get offset getoffset old source range oldsourcerange get length getlength selection analyzer selectionanalyzer sel analyzer selanalyzer selection analyzer selectionanalyzer selection root accept sel analyzer selanalyzer internal get new selection range internalgetnewselectionrange old source range oldsourcerange type root typeroot sel analyzer selanalyzer java model exception javamodelexception java plugin javaplugin log source range sourcerange old source range oldsourcerange get offset getoffset old source range oldsourcerange get length getlength subclasses determine actual selection param old source range oldsourcerange selected range param current type root param sel analyzer selanalyzer selection analyzer selection range java model exception javamodelexception source range fails i source range isourcerange internal get new selection range internalgetnewselectionrange i source range isourcerange old source range oldsourcerange i source reference isourcereference selection analyzer selectionanalyzer sel analyzer selanalyzer java model exception javamodelexception i text selection itextselection get text selection gettextselection i text selection itextselection f editor feditor get selection provider getselectionprovider get selection getselection helper methods subclasses fit node range source range i source range isourcerange get last covering node range getlastcoveringnoderange i source range isourcerange old source range oldsourcerange i source reference isourcereference selection analyzer selectionanalyzer sel analyzer selanalyzer java model exception javamodelexception sel analyzer selanalyzer get last covering node getlastcoveringnode old source range oldsourcerange get selected node source range getselectednodesourcerange sel analyzer selanalyzer get last covering node getlastcoveringnode i source range isourcerange get selected node source range getselectednodesourcerange i source reference isourcereference ast node astnode node to select nodetoselect java model exception javamodelexception offset node to select nodetoselect get start position getstartposition math min get source range getsourcerange get length getlength node to select nodetoselect get start position getstartposition node to select nodetoselect get length getlength create source range createsourcerange offset helper methods i source range isourcerange create source range createsourcerange i text selection itextselection source range sourcerange get offset getoffset get length getlength compilation unit compilationunit getast i type root ityperoot sharedastprovider getast sharedastprovider wait helper methods subclasses i source range isourcerange create source range createsourcerange offset length offset length selection length length source range sourcerange math max offset length ast node astnode get sibling nodes getsiblingnodes ast node astnode node ast node astnode parent node get parent getparent structural property descriptor structuralpropertydescriptor location in parent locationinparent node get location in parent getlocationinparent location in parent locationinparent is child list property ischildlistproperty list ast node astnode siblings ast nodes astnodes get child list property getchildlistproperty parent child list property descriptor childlistpropertydescriptor location in parent locationinparent siblings to array toarray ast node astnode siblings size find index findindex object array object array length object object array object