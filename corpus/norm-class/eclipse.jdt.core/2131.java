copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation vladimir piskarev pisv building large java element deltas slow https bugs eclipse org org eclipse jdt internal core java util array list arraylist java util hash map hashmap java util map org eclipse core resources i resource delta iresourcedelta org eclipse jdt core i java element ijavaelement org eclipse jdt core i java element delta ijavaelementdelta org eclipse jdt core dom compilation unit compilationunit suppress warnings suppresswarnings rawtypes unchecked java element delta javaelementdelta simple delta simpledelta i java element delta ijavaelementdelta get affected children getaffectedchildren i java element delta ijavaelementdelta affected children affectedchildren empty delta ast created reconcile operation iff post reconcile event ast requested reconcile operation changed element i compilation unit icompilationunit working copy mode compilation unit compilationunit ast element delta describes change i java element ijavaelement changed element changedelement collection resource deltas correspond java resources deltas i resource delta iresourcedelta resource deltas resourcedeltas counter resource deltas resource deltas counter resourcedeltascounter get moved from element getmovedfromelement i java element ijavaelement moved from handle movedfromhandle get moved to element getmovedtoelement i java element ijavaelement moved to handle movedtohandle i java element delta ijavaelementdelta annotation deltas annotationdeltas empty delta empty array i java element delta ijavaelementdelta i java element delta ijavaelementdelta empty delta i java element delta ijavaelementdelta child needed iff affected children affectedchildren length child child demand affected children affectedchildren map key integer child index childindex delta key key i java element ijavaelement element key i java element ijavaelement element element element hash code hashcode element hash code hashcode equals object obj obj key equals and same parent equalsandsameparent element key obj element creates root delta create nested delta hierarchies convenience methods root delta created level project root fragment code i java element ijavaelement code code changed i java element ijavaelement code code moved i java element ijavaelement i java element ijavaelement code code removed i java element ijavaelement code code renamed i java element ijavaelement i java element ijavaelement code java element delta javaelementdelta i java element ijavaelement element changed element changedelement element adds child delta collection children child collection walk hierarchy add affected child addaffectedchild java element delta javaelementdelta child kind removed add child parent removed changed change flags changeflags children kind changed change flags changeflags children fine grained delta changed element changedelement get element type getelementtype i java element ijavaelement compilation unit fine grained finegrained key child key childkey key child get element getelement integer existing child index existingchildindex get child index getchildindex child key childkey child existing child index existingchildindex add new child addnewchild child java element delta javaelementdelta existing child existingchild java element delta javaelementdelta affected children affectedchildren existing child index existingchildindex existing child existingchild get kind getkind child get kind getkind child child changed changed child removed noop removed remove existing child removeexistingchild child key childkey existing child index existingchildindex removed child get kind getkind child removed changed child kind changed affected children affectedchildren existing child index existingchildindex child child removed changed removed changed child removed removed removed removed changed child get kind getkind child changed child changed removed removed removed affected children affectedchildren existing child index existingchildindex child child changed changed changed changed i java element delta ijavaelementdelta children child get affected children getaffectedchildren children length java element delta javaelementdelta childs child childschild java element delta javaelementdelta children existing child existingchild add affected child addaffectedchild childs child childschild update flags child had content flag childhadcontentflag child change flags changeflags content existing child had children flag existingchildhadchildrenflag existing child existingchild change flags changeflags children existing child existingchild change flags changeflags child change flags changeflags delta processor deltaprocessor child child had content flag childhadcontentflag existing child had children flag existingchildhadchildrenflag existing child existingchild change flags changeflags content add java resource deltas needed not e note child delta takes precedence existing child delta java resource deltas created delta processor deltaprocessor i resource delta iresourcedelta res deltas resdeltas child get resource deltas getresourcedeltas res deltas resdeltas existing child existingchild resource deltas resourcedeltas res deltas resdeltas existing child existingchild resource deltas counter resourcedeltascounter child resource deltas counter resourcedeltascounter unknown existing child child existing child flags flags existing child existingchild get flags getflags affected children affectedchildren existing child index existingchildindex child child change flags changeflags flags creates nested deltas add operation convenience method creating add deltas constructor create root delta add operation call method i java element ijavaelement element element i java element ijavaelement element flags java element delta javaelementdelta added delta addeddelta java element delta javaelementdelta element added delta addeddelta added delta addeddelta change flags changeflags flags insert delta tree insertdeltatree element added delta addeddelta adds child delta collection children add new child addnewchild java element delta javaelementdelta child affected children affectedchildren grow and add to array growandaddtoarray affected children affectedchildren child child index childindex child index childindex key child get element getelement affected children affectedchildren length adds child delta collection children child collection walk hierarchy add resource delta addresourcedelta i resource delta iresourcedelta child kind removed add child parent removed changed change flags changeflags content kind changed change flags changeflags content resource deltas resourcedeltas resource deltas resourcedeltas i resource delta iresourcedelta resource deltas resourcedeltas resource deltas counter resourcedeltascounter child resource deltas resourcedeltas length resource deltas counter resourcedeltascounter resize system arraycopy resource deltas resourcedeltas resource deltas resourcedeltas i resource delta iresourcedelta resource deltas counter resourcedeltascounter resource deltas counter resourcedeltascounter resource deltas resourcedeltas resource deltas counter resourcedeltascounter child creates nested deltas change operation convenience method creating change deltas constructor create root delta change operation call method java element delta javaelementdelta changed i java element ijavaelement element change flag changeflag java element delta javaelementdelta changed delta changeddelta java element delta javaelementdelta element changed delta changeddelta changed change flag changeflag insert delta tree insertdeltatree element changed delta changeddelta changed delta changeddelta records changed ast changedast compilation unit compilationunit changedast ast changedast changed ast clears collection children clear affected children clearaffectedchildren affected children affectedchildren empty delta child index childindex mark delta content changed delta content changed contentchanged change flags changeflags content creates nested deltas closed element closed i java element ijavaelement element java element delta javaelementdelta delta java element delta javaelementdelta element delta changed closed insert delta tree insertdeltatree element delta creates nested delta deltas based element delta root delta tree returns root created delta tree java element delta javaelementdelta create delta tree createdeltatree i java element ijavaelement element java element delta javaelementdelta delta java element delta javaelementdelta child delta childdelta delta array list arraylist ancestors get ancestors getancestors element ancestors handle jars equals project equals and same parent equalsandsameparent delta get element getelement get element getelement element changed root element kind delta kind change flags changeflags delta change flags changeflags moved to handle movedtohandle delta moved to handle movedtohandle moved from handle movedfromhandle delta moved from handle movedfromhandle size ancestors size size i java element ijavaelement ancestor i java element ijavaelement ancestors java element delta javaelementdelta ancestor delta ancestordelta java element delta javaelementdelta ancestor ancestor delta ancestordelta add affected child addaffectedchild child delta childdelta child delta childdelta ancestor delta ancestordelta child delta childdelta returns java elements equals parent equals and same parent equalsandsameparent i java element ijavaelement i java element ijavaelement i java element ijavaelement parent equals parent get parent getparent parent equals get parent getparent returns code java element delta javaelementdelta code element delta tree delta element java element delta javaelementdelta find i java element ijavaelement handle jars equals project equals and same parent equalsandsameparent get element getelement find descendant finddescendant key returns descendant delta key code code delta key delta tree delta java element delta javaelementdelta find descendant finddescendant key key affected children affectedchildren length integer get child index getchildindex key java element delta javaelementdelta affected children affectedchildren i java element delta ijavaelementdelta child affected children affectedchildren java element delta javaelementdelta delta java element delta javaelementdelta child find descendant finddescendant key delta delta mark delta fine grained delta fine grained finegrained changed fine grained i java element delta ijavaelementdelta i java element delta ijavaelementdelta get added children getaddedchildren get children of type getchildrenoftype i java element delta ijavaelementdelta i java element delta ijavaelementdelta get affected children getaffectedchildren affected children affectedchildren returns collection parents element including root tree bottom order element descendant root tree code code returned array list arraylist get ancestors getancestors i java element ijavaelement element i java element ijavaelement parent element get parent getparent parent array list arraylist parents array list arraylist parent equals changed element changedelement parents add parent parent parent get parent getparent parent parents trim to size trimtosize parents compilation unit compilationunit get compilation unit t getcompilationunitast ast i java element delta ijavaelementdelta get annotation deltas getannotationdeltas annotation deltas annotationdeltas i java element delta ijavaelementdelta i java element delta ijavaelementdelta get changed children getchangedchildren get children of type getchildrenoftype changed returns delta collection children code code child delta key integer get child index getchildindex key key length affected children affectedchildren length length child length equals and same parent equalsandsameparent key element affected children affectedchildren get element getelement child index childindex child index childindex hash map hashmap key integer length child index childindex key affected children affectedchildren get element getelement child index childindex key i java element delta ijavaelementdelta i java element delta ijavaelementdelta get children of type getchildrenoftype type length affected children affectedchildren length length i java element delta ijavaelementdelta array list arraylist children array list arraylist length length affected children affectedchildren get kind getkind type children add affected children affectedchildren i java element delta ijavaelementdelta children of type childrenoftype i java element delta ijavaelementdelta children size children to array toarray children of type childrenoftype children of type childrenoftype returns delta element delta java element delta javaelementdelta get delta for getdeltafor i java element ijavaelement element find element i java element delta ijavaelementdelta i java element ijavaelement get element getelement changed element changedelement i java element delta ijavaelementdelta i java element ijavaelement get moved from element getmovedfromelement moved from handle movedfromhandle i java element delta ijavaelementdelta i java element ijavaelement get moved to element getmovedtoelement moved to handle movedtohandle i java element delta ijavaelementdelta i java element delta ijavaelementdelta get removed children getremovedchildren get children of type getchildrenoftype removed collection resource deltas i resource delta iresourcedelta get resource deltas getresourcedeltas resource deltas resourcedeltas resource deltas resourcedeltas length resource deltas counter resourcedeltascounter system arraycopy resource deltas resourcedeltas resource deltas resourcedeltas i resource delta iresourcedelta resource deltas counter resourcedeltascounter resource deltas counter resourcedeltascounter resource deltas resourcedeltas adds element array elements array returns array i java element delta ijavaelementdelta grow and add to array growandaddtoarray i java element delta ijavaelementdelta array i java element delta ijavaelementdelta add ition addition i java element delta ijavaelementdelta array array i java element delta ijavaelementdelta length system arraycopy array length array length add ition addition array creates delta tree element delta ins erts inserts tree child node insert delta tree insertdeltatree i java element ijavaelement element java element delta javaelementdelta delta java element delta javaelementdelta child delta childdelta create delta tree createdeltatree element delta handle jars equals project equals and same parent equalsandsameparent element get element getelement add affected child addaffectedchild child delta childdelta creates nested deltas move operation convenience method creating move delta constructor create root delta move operation call method moved from movedfrom i java element ijavaelement moved from element movedfromelement i java element ijavaelement moved to element movedtoelement java element delta javaelementdelta removed delta removeddelta java element delta javaelementdelta moved from element movedfromelement removed delta removeddelta kind removed removed delta removeddelta change flags changeflags moved removed delta removeddelta moved to handle movedtohandle moved to element movedtoelement insert delta tree insertdeltatree moved from element movedfromelement removed delta removeddelta creates nested deltas move operation convenience method creating move delta constructor create root delta move operation call method moved to movedto i java element ijavaelement moved to element movedtoelement i java element ijavaelement moved from element movedfromelement java element delta javaelementdelta added delta addeddelta java element delta javaelementdelta moved to element movedtoelement added delta addeddelta kind added delta addeddelta change flags changeflags moved added delta addeddelta moved from handle movedfromhandle moved from element movedfromelement insert delta tree insertdeltatree moved to element movedtoelement added delta addeddelta creates nested deltas opened element opened i java element ijavaelement element java element delta javaelementdelta delta java element delta javaelementdelta element delta changed opened insert delta tree insertdeltatree element delta removes child delta collection children remove affected child removeaffectedchild java element delta javaelementdelta child affected children affectedchildren length key child key childkey key child get element getelement integer exising child index exisingchildindex get child index getchildindex child key childkey exising child index exisingchildindex remove existing child removeexistingchild child key childkey exising child index exisingchildindex removes element array returns array shrunk i java element delta ijavaelementdelta remove and shrink array removeandshrinkarray i java element delta ijavaelementdelta i java element delta ijavaelementdelta array i java element delta ijavaelementdelta length system arraycopy array length system arraycopy array array creates nested deltas delete operation convenience method creating removed deltas constructor create root delta delete operation call method removed i java element ijavaelement element removed element removed i java element ijavaelement element flags java element delta javaelementdelta removed delta removeddelta java element delta javaelementdelta element insert delta tree insertdeltatree element removed delta removeddelta java element delta javaelementdelta actual delta actualdelta get delta for getdeltafor element actual delta actualdelta actual delta actualdelta removed actual delta actualdelta change flags changeflags flags actual delta actualdelta clear affected children clearaffectedchildren removes existing child delta collection children remove existing child removeexistingchild key key affected children affectedchildren remove and shrink array removeandshrinkarray affected children affectedchildren child index childindex length affected children affectedchildren length length child child index childindex child index childindex remove key length child index childindex key affected children affectedchildren get element getelement creates nested deltas change operation convenience method creating change deltas constructor create root delta change operation call method source attached sourceattached i java element ijavaelement element java element delta javaelementdelta attached delta attacheddelta java element delta javaelementdelta element attached delta attacheddelta changed source attached sourceattached insert delta tree insertdeltatree element attached delta attacheddelta creates nested deltas change operation convenience method creating change deltas constructor create root delta change operation call method source detached sourcedetached i java element ijavaelement element java element delta javaelementdelta detached delta detacheddelta java element delta javaelementdelta element detached delta detacheddelta changed source detached sourcedetached insert delta tree insertdeltatree element detached delta detacheddelta returns string representation delta structure suitable debug purposes to string tostring string to debug string todebugstring depth string buffer stringbuffer buffer string buffer stringbuffer depth buffer append buffer append java element javaelement get element getelement to debug string todebugstring to debug string todebugstring buffer i java element delta ijavaelementdelta children get affected children getaffectedchildren children children length nls buffer append buffer append java element delta javaelementdelta children to debug string todebugstring depth resource deltas counter resourcedeltascounter nls buffer append depth buffer append i resource delta iresourcedelta resource delta resourcedelta resource deltas resourcedeltas buffer append resource delta resourcedelta to string tostring nls buffer append resource delta resourcedelta get kind getkind i resource delta iresourcedelta buffer append i resource delta iresourcedelta removed buffer append i resource delta iresourcedelta changed buffer append buffer append nls buffer append i java element delta ijavaelementdelta annotations get annotation deltas getannotationdeltas annotations annotations length nls buffer append buffer append java element delta javaelementdelta annotations to debug string todebugstring depth buffer to string tostring to debug string todebugstring string buffer stringbuffer buffer flags prev to debug string todebugstring buffer flags flags i java element delta ijavaelementdelta children prev nls buffer append nls buffer append children prev flags i java element delta ijavaelementdelta content prev nls buffer append nls buffer append content prev flags i java element delta ijavaelementdelta moved prev nls buffer append nls nls buffer append moved java element javaelement get moved from element getmovedfromelement to string with ancestors tostringwithancestors prev flags i java element delta ijavaelementdelta moved prev nls buffer append nls nls buffer append moved java element javaelement get moved to element getmovedtoelement to string with ancestors tostringwithancestors prev flags i java element delta ijavaelementdelta classpath prev nls buffer append nls buffer append classpath prev flags i java element delta ijavaelementdelta removed classpath prev nls buffer append nls buffer append removed classpath prev flags i java element delta ijavaelementdelta reorder prev nls buffer append nls buffer append reordered prev flags i java element delta ijavaelementdelta archive content changed prev nls buffer append nls buffer append archive content changed prev flags i java element delta ijavaelementdelta source attached sourceattached prev nls buffer append nls buffer append source attached prev flags i java element delta ijavaelementdelta source detached sourcedetached prev nls buffer append nls buffer append source detached prev flags i java element delta ijavaelementdelta fine grained prev nls buffer append nls buffer append fine grained prev flags i java element delta ijavaelementdelta primary working copy prev nls buffer append nls buffer append primary working copy prev flags i java element delta ijavaelementdelta classpath changed prev nls buffer append nls buffer append raw classpath changed prev flags i java element delta ijavaelementdelta resolved classpath changed prev nls buffer append nls buffer append resolved classpath changed prev flags i java element delta ijavaelementdelta primary resource prev nls buffer append nls buffer append primary resource prev flags i java element delta ijavaelementdelta opened prev nls buffer append nls buffer append opened prev flags i java element delta ijavaelementdelta closed prev nls buffer append nls buffer append closed prev flags i java element delta ijavaelementdelta ast prev nls buffer append nls buffer append ast prev flags i java element delta ijavaelementdelta categories prev nls buffer append nls buffer append categories prev flags i java element delta ijavaelementdelta annotations prev nls buffer append nls buffer append annotations prev prev returns string representation delta structure suitable debug purposes string to string tostring to debug string todebugstring