copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt core org eclipse core resources i resource iresource org eclipse core runtime i progress monitor iprogressmonitor org eclipse text edits text edit textedit org eclipse text edits undo edit undoedit buffer text contents resource language specific contents process edited diff ering differing actual contents underlying resource buffer owner code i openable iopenable code buffer underlying resource saving buffer buffers read note java model operations manipulate code i buffer ibuffer code code i type itype create method createmethod code ensures delimiter code code code code code code buffer operations change delimiter included string append replaced implement ers implementers aware clients code i buffer ibuffer code transformations implemented clients i buffer ibuffer impl ementors implementors link i buffer ibuffer add itionally additionally implement link i buffer ibuffer i text edit capability itexteditcapability adds capability apply text edits buffer link i compilation unit icompilationunit apply text edit applytextedit text edit textedit i progress monitor iprogressmonitor implemented clients i text edit capability itexteditcapability applies text edit underlying buffer param edit edit apply param monitor progress monitor code code progress reported undo edit java model exception javamodelexception edit applied buffer reasons include edit applied problem text edit locations link i java model status constants ijavamodelstatusconstants bad text edit location undo edit undoedit apply text edit applytextedit text edit textedit edit i progress monitor iprogressmonitor monitor java model exception javamodelexception adds listener buffer identical listener registered buffer closed param listener listener buffer add buffer changed listener addbufferchangedlistener i buffer changed listener ibufferchangedlistener listener appends character array contents buffer buffer unsaved client append contents buffer owner buffer reports buffer changed event buffer read buffer closed param text character array append contents buffer append text appends string contents buffer buffer unsaved client append contents buffer owner buffer reports buffer changed event buffer read buffer closed param text code string code append contents buffer append string text closes buffer unsaved lost reports buffer changed event offset length event fired buffer closed operations buffer allowed close attempt close closed buffer attempt close returns character position buffer returned undefined buffer closed param position based source offset buffer character position buffer get char getchar position returns contents buffer character array code code buffer initialized callers assumption returned character array gen uine genuine article copy client wishes change array copy client wishes hang array current copy returned undefined buffer closed characters contained buffer get char acters getcharacters returns contents buffer code string code strings result immutable object answer code code buffer initialized returned undefined buffer closed contents buffer code string code string get contents getcontents returns number characters stored buffer returned undefined buffer closed number characters buffer get length getlength returns java openable element owning buffer openable element owning buffer i openable iopenable get owner getowner returns range text buffer returned undefined buffer closed param offset based starting offset param length number characters retrieve range text buffer exception index out of bounds exception indexoutofboundsexception buffer sync h synch string get text gettext offset length index out of bounds exception indexoutofboundsexception returns underlying resource buffer opened code code buffer opened resource underlying resource buffer code code i resource iresource get underlying resource getunderlyingresource returns buffer modified opened saved buffer underlying resource method returns code code note buffer unsaved model decide close cla im claim memory element reopened buffer factory requested create buffer code code indicating presence unsaved absence underlying resource code code has unsaved changes hasunsavedchanges returns buffer closed code code indicating buffer closed is closed isclosed returns buffer read code code indicating buffer read is read only isreadonly removes listener buffer identical listener registered buffer closed param listener listener remove buffer changed listener removebufferchangedlistener i buffer changed listener ibufferchangedlistener listener replaces range characters buffer text code position code code position length code range get length getlength code length code negative buffer read buffer closed param position based starting position text range buffer param length length text range buffer param text replacing text character array replace position length text replaces range characters buffer text code position code code position length code range get length getlength code length code negative buffer read buffer closed param position based starting position text range buffer param length length text range buffer param text replacing text code string code replace position length string text saves contents buffer underlying resource successful buffer unsaved buffer left open saving buffer unsaved underlying resource changed buffer underlying resource read code force code parameter controls method deals cases workbench completely sync local file system code code method attempt overwrite file local file system sync workbench option ensures unintended data loss recommended setting code code attempt write file local file system over writing overwriting existing method succeeds resource marked local was n wasn buffer read buffer closed param progress progress monitor notify param force code code flag indicating deal resource inc onsistencies inconsistencies exception java model exception javamodelexception error occurs writing buffer underlying resource org eclipse core resources i file ifile set contents setcontents java input stream inputstream org eclipse core runtime i progress monitor iprogressmonitor save i progress monitor iprogressmonitor progress force java model exception javamodelexception sets contents buffer character array buffer unsaved client contents buffer owner buffer reports buffer changed event equivalent code replace get length getlength contents code buffer read buffer closed param contents contents buffer character array set contents setcontents contents sets contents buffer code string code buffer unsaved client contents buffer owner buffer reports buffer changed event equivalent code replace get length getlength contents code buffer read buffer closed param contents contents buffer code string code set contents setcontents string contents