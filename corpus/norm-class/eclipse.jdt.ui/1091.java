copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse ltk core refactoring java util array list arraylist java util arrays java util hash map hashmap java util hash set hashset java util iterator java util linked list linkedlist java util list java util map java util org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core runtime i path ipath org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime i status istatus org eclipse core runtime null progress monitor nullprogressmonitor org eclipse core runtime operation canceled exception operationcanceledexception org eclipse core runtime status org eclipse core runtime sub progress monitor subprogressmonitor org eclipse core resources i file ifile org eclipse core file buf fers filebuffers file buffers filebuffers org eclipse core file buf fers filebuffers i text file buffer itextfilebuffer org eclipse core file buf fers filebuffers i text file buffer manager itextfilebuffermanager org eclipse core file buf fers filebuffers location kind locationkind org eclipse text edits insert edit insertedit org eclipse text edits malformed tree exception malformedtreeexception org eclipse text edits multi text edit multitextedit org eclipse text edits replace edit replaceedit org eclipse text edits text edit textedit org eclipse text edits text edit copier texteditcopier org eclipse text edits text edit group texteditgroup org eclipse text edits text edit processor texteditprocessor org eclipse text edits undo edit undoedit org eclipse jface text bad location exception badlocationexception org eclipse jface text bad position category exception badpositioncategoryexception org eclipse jface text document org eclipse jface text document event documentevent org eclipse jface text document rewrite session documentrewritesession org eclipse jface text document rewrite session type documentrewritesessiontype org eclipse jface text i document idocument org eclipse jface text i document extension idocumentextension org eclipse jface text i document listener idocumentlistener org eclipse jface text i position updater ipositionupdater org eclipse jface text i region iregion org eclipse jface text position org eclipse jface text region org eclipse ltk internal core refactoring buffer validation state buffervalidationstate org eclipse ltk internal core refactoring org eclipse ltk internal core refactoring content stamps contentstamps org eclipse ltk internal core refactoring lock org eclipse ltk internal core refactoring multi state undo change multistateundochange org eclipse ltk internal core refactoring non deleting position updater nondeletingpositionupdater org eclipse ltk internal core refactoring refactoring core plugin refactoringcoreplugin multi text file change special change object applies sequence link text edit textedit text edit trees document multi text file change manages text edit trees multi text file change off ers offers ability access original content document creating preview change edit trees copied creating kind preview region updating original edit trees takes place req uesting requesting preview region updating link text edit textedit text edit textedit region tracking required preview enabled call method link set keep preview edits setkeeppreviewedits set keep preview edits setkeeppreviewedits enabled multi text file change copied edit trees executed preview allowing clients map original edit executed edit executed edit determine position preview multi state text file change multistatetextfilechange text edit based change texteditbasedchange composable buffer change composablebufferchange text edit textedit f edit fedit list text edit based change group texteditbasedchangegroup f groups fgroups text edit textedit get edit getedit f edit fedit list text edit based change group texteditbasedchangegroup get groups getgroups f groups fgroups set edit setedit text edit textedit edit is not null isnotnull edit f edit fedit edit set groups setgroups list text edit based change group texteditbasedchangegroup groups is not null isnotnull groups f groups fgroups groups composable buffer change group composablebufferchangegroup text edit based change group texteditbasedchangegroup text edit textedit f edits fedits hash set hashset composable buffer change group composablebufferchangegroup multi state text file change multistatetextfilechange change text edit group texteditgroup group change group text edit textedit edits group get text edits gettextedits edits length cache edit cacheedit edits cache edit cacheedit text edit textedit edit f edits fedits add edit text edit textedit edits edit get children getchildren edits length cache edit cacheedit edits contains edit containsedit text edit textedit edit f edits fedits edit text edit textedit get cached edits getcachededits f edits fedits composable edit position composableeditposition position string f text ftext string get text gettext f text ftext set text settext string text is not null isnotnull text f text ftext text composable undo edit composableundoedit composable buffer change group composablebufferchangegroup f group fgroup text edit textedit f original foriginal replace edit replaceedit f undo fundo composable buffer change group composablebufferchangegroup get group getgroup f group fgroup text edit textedit get original getoriginal f original foriginal string get original text getoriginaltext f original foriginal replace edit replaceedit replace edit replaceedit get original getoriginal get text gettext f original foriginal insert edit insertedit insert edit insertedit get original getoriginal get text gettext nls replace edit replaceedit get undo getundo f undo fundo set group setgroup composable buffer change group composablebufferchangegroup group is not null isnotnull group f group fgroup group set original setoriginal text edit textedit edit f original foriginal edit set undo setundo replace edit replaceedit undo is not null isnotnull undo f undo fundo undo position category edit positions nls string composable position category composable edit position category composableeditpositioncategory system current time millis currenttimemillis position category preview region range marker nls string marker position category marker position category markerpositioncategory system current time millis currenttimemillis text file buffer i text file buffer itextfilebuffer f buffer fbuffer string document string f cached string fcachedstring internal change objects array list arraylist composable buffer change composablebufferchange f changes fchanges array list arraylist content stamp content stamp contentstamp f content stamp fcontentstamp text edit copier text edit copier texteditcopier f copier fcopier text file buffer reference count f count fcount dirty flag f dirty fdirty file i file ifile f file ffile save mode f save mode fsavemode text file change textfilechange save validation buffer validation state buffervalidationstate f validation state fvalidationstate creates composite text file change text type code txt code param composite text file change param file text file apply change multi state text file change multistatetextfilechange string i file ifile file is not null isnotnull file f file ffile file nls set text type settexttype txt acquires document file buffer manager param monitor progress monitor document core exception coreexception document acquired i document idocument acquire document acquiredocument i progress monitor iprogressmonitor monitor core exception coreexception f count fcount f buffer fbuffer get document getdocument i text file buffer manager itextfilebuffermanager manager file buffers filebuffers get text file buffer manager gettextfilebuffermanager i path ipath path f file ffile get full path getfullpath manager connect path location kind locationkind ifile monitor f count fcount f buffer fbuffer manager get text file buffer gettextfilebuffer path location kind locationkind ifile i document idocument document f buffer fbuffer get document getdocument f content stamp fcontentstamp content stamps contentstamps f file ffile document document adds text change composite change text change changed contents text change retrieved stored int ernally internally composite text change param change text change add add change addchange text change textchange change is not null isnotnull change composable buffer change composablebufferchange result composable buffer change composablebufferchange result set edit setedit change get edit getedit text edit based change group texteditbasedchangegroup groups change get change groups getchangegroups list text edit based change group texteditbasedchangegroup list array list arraylist groups length groups length text edit based change group texteditbasedchangegroup group composable buffer change group composablebufferchangegroup groups get text edit group gettexteditgroup list add group add change group addchangegroup group result set groups setgroups list f changes fchanges add result copied text change textchange text edit processor texteditprocessor create text edit processor createtexteditprocessor composable buffer change composablebufferchange change i document idocument document flags preview list text edit textedit excludes array list arraylist iterator text edit based change group texteditbasedchangegroup iterator change get groups getgroups iterator iterator has next hasnext text edit based change group texteditbasedchangegroup group iterator group is enabled isenabled excludes add all addall arrays as list aslist group get text edits gettextedits preview f copier fcopier text edit copier texteditcopier change get edit getedit text edit textedit copied edit copiededit f copier fcopier perform get keep preview edits getkeeppreviewedits flags flags text edit textedit update regions local text edit processor localtexteditprocessor result local text edit processor localtexteditprocessor document copied edit copiededit flags result set excludes setexcludes map edits mapedits excludes to array toarray text edit textedit excludes size f copier fcopier f copier fcopier result local text edit processor localtexteditprocessor result local text edit processor localtexteditprocessor document change get edit getedit flags text edit textedit update regions result set excludes setexcludes excludes to array toarray text edit textedit excludes size result creates text edit event param document document param offset offset event param length length event param text text event undo edit replace edit replaceedit create undo edit createundoedit i document idocument document offset length string text string current text currenttext current text currenttext document offset length bad location exception badlocationexception cannot happen cannothappen f cached string fcachedstring f cached string fcachedstring equals current text currenttext current text currenttext f cached string fcachedstring f cached string fcachedstring current text currenttext replace edit replaceedit offset text text length current text currenttext org eclipse ltk core refactoring change dispose override dispose f validation state fvalidationstate f validation state fvalidationstate dispose org eclipse ltk core refactoring text edit based change texteditbasedchange get current content getcurrentcontent org eclipse core runtime i progress monitor iprogressmonitor override string get current content getcurrentcontent i progress monitor iprogressmonitor monitor core exception coreexception get current document getcurrentdocument monitor org eclipse ltk core refactoring text edit based change texteditbasedchange get current content getcurrentcontent org eclipse jface text i region iregion org eclipse core runtime i progress monitor iprogressmonitor override string get current content getcurrentcontent i region iregion region expand surround i progress monitor iprogressmonitor monitor core exception coreexception is not null isnotnull region is true istrue surround i document idocument document get current document getcurrentdocument monitor is true istrue document get length getlength region get offset getoffset region get length getlength get content getcontent document region expand surround returns document representing current buffer prior application change returned document modified param monitor progress monitor code code current document empty document core exception coreexception document acquired i document idocument get current document getcurrentdocument i progress monitor iprogressmonitor monitor core exception coreexception monitor monitor null progress monitor nullprogressmonitor i document idocument result nls monitor begin task begintask result acquire document acquiredocument sub progress monitor subprogressmonitor monitor result release document releasedocument result sub progress monitor subprogressmonitor monitor monitor result result document result org eclipse ltk core refactoring change get modified element getmodifiedelement override object get modified element getmodifiedelement f file ffile org eclipse ltk core refactoring text edit based change texteditbasedchange get preview content getpreviewcontent org eclipse ltk core refactoring text edit based change group texteditbasedchangegroup org eclipse jface text i region iregion org eclipse core runtime i progress monitor iprogressmonitor override string get preview content getpreviewcontent text edit based change group texteditbasedchangegroup groups i region iregion region expand surround i progress monitor iprogressmonitor monitor core exception coreexception text edit based change group texteditbasedchangegroup cached groups cachedgroups hash set hashset arrays as list aslist groups i document idocument document document get current document getcurrentdocument monitor marks region document prev iewed previewed position range position region get offset getoffset region get length getlength composable buffer change composablebufferchange change text edit based change group texteditbasedchangegroup changed groups changedgroups get change groups getchangegroups linked list linkedlist linked list linkedlist composable undo edit composableundoedit composite undo compositeundo linked list linkedlist f changes fchanges size change f changes fchanges text edit textedit copy copy f copier fcopier text edit copier texteditcopier change get edit getedit copy f copier fcopier perform create mapping copied edits originals map text edit textedit text edit textedit original map originalmap hash map hashmap iterator text edit based change group texteditbasedchangegroup change get groups getgroups iterator has next hasnext composable buffer change group composablebufferchangegroup group composable buffer change group composablebufferchangegroup iterator text edit textedit group get cached edits getcachededits iterator has next hasnext text edit textedit original edit originaledit text edit textedit copied edit copiededit f copier fcopier get copy getcopy original edit originaledit copied edit copiededit original map originalmap copied edit copiededit original edit originaledit refactoring core plugin refactoringcoreplugin log error message logerrormessage nls find copy indexed text edit nls original edit originaledit to string tostring composable buffer change group composablebufferchangegroup current group currentgroup text edit textedit current edit currentedit text edit processor sets change group current edit processing text edit processor texteditprocessor processor text edit processor texteditprocessor document copy text edit textedit override consider edit consideredit text edit textedit edit text edit textedit original edit originaledit original map originalmap edit original edit originaledit current edit currentedit original edit originaledit offset offset changed groups changedgroups length offset composable buffer change group composablebufferchangegroup group composable buffer change group composablebufferchangegroup changed groups changedgroups offset group contains edit containsedit original edit originaledit current group currentgroup group current group currentgroup edit multi text edit multitextedit refactoring core plugin refactoringcoreplugin log error message logerrormessage nls find original copied text edit nls edit to string tostring linked list linkedlist composable undo edit composableundoedit event undos eventundos linked list linkedlist listener record undos document offsets relative document event i document listener idocumentlistener listener i document listener idocumentlistener override document about to be changed documentabouttobechanged document event documentevent event composable undo edit composableundoedit edit composable undo edit composableundoedit edit set group setgroup current group currentgroup edit set original setoriginal current edit currentedit edit set undo setundo create undo edit createundoedit document event get offset getoffset event get length getlength event get text gettext event undos eventundos add first addfirst edit override document changed documentchanged document event documentevent event record undos lifo order document add document listener adddocumentlistener listener processor perform edits performedits document remove document listener removedocumentlistener listener composite undo compositeundo add first addfirst event undos eventundos f copier fcopier i position updater ipositionupdater position updater positionupdater i position updater ipositionupdater override update document event documentevent event event offset eventoffset event get offset getoffset event length eventlength event get length getlength event old end offset eventoldendoffset event offset eventoffset event length eventlength string event text eventtext event get text gettext event new length eventnewlength event text eventtext event text eventtext length event new end offset eventnewendoffset event offset eventoffset event new length eventnewlength delta length deltalength event new length eventnewlength event length eventlength position positions event get document getdocument get positions getpositions composable position category positions length position position positions position is deleted isdeleted offset position get offset getoffset length position get length getlength offset length offset event old end offset eventoldendoffset position change shift position set offset setoffset offset delta length deltalength event offset eventoffset position change leave offset event offset eventoffset leave edits over lapping overlapping offset event offset eventoffset event old end offset eventoldendoffset event completely internal position adjust length position set length setlength length delta length deltalength offset event offset eventoffset event position include replacement text position position set length setlength event new end offset eventnewendoffset offset event old end offset eventoldendoffset event position adjust offset length including replacement text position position set offset setoffset event offset eventoffset deleted event old end offset eventoldendoffset offset position set length setlength length deleted event new length eventnewlength event comp rises comprises position position replacement text new offset newoffset math min offset event new end offset eventnewendoffset new end offset newendoffset math min event new end offset eventnewendoffset position set offset setoffset new offset newoffset position set length setlength new end offset newendoffset new offset newoffset bad position category exception badpositioncategoryexception exception document add position category addpositioncategory composable position category document add position updater addpositionupdater position updater positionupdater apply undos lifo order original document track undos edits change groups prev iewed previewed insert undo edits line arized linearized net original document linked list linkedlist composable edit position composableeditposition undo queue undoqueue linked list linkedlist iterator linked list linkedlist composable undo edit composableundoedit composite undo compositeundo iterator has next hasnext iterator composable undo edit composableundoedit iterator has next hasnext composable undo edit composableundoedit edit replace edit replaceedit undo edit get undo getundo offset undo get offset getoffset length undo get length getlength string text undo get text gettext composable edit position composableeditposition position composable edit position composableeditposition cached groups cachedgroups edit get group getgroup nls text nls text equals position offset offset length undo delete create insert edit position length position set text settext edit get original text getoriginaltext refactoring core plugin refactoringcoreplugin log error message logerrormessage dubious undo edit undo to string tostring length position offset offset undo insert create delete edit nls position set text settext position length text length undo replace create replace edit position offset offset position length length position set text settext edit get original text getoriginaltext document add position addposition composable position category position position composable edit position composableeditposition position offset undo get offset getoffset position length undo get length getlength position set text settext undo get text gettext undo queue undoqueue add position iterator composable edit position composableeditposition iterator undo queue undoqueue iterator iterator has next hasnext composable edit position composableeditposition position iterator document replace position offset position length position get text gettext iterator remove simple deleting position update r updater range i position updater ipositionupdater marker updater markerupdater non deleting position updater nondeletingpositionupdater marker position category position positions document get positions getpositions composable position category document add position category addpositioncategory marker position category document add position updater addpositionupdater marker updater markerupdater document add position addposition marker position category range positions length composable edit position composableeditposition position composable edit position composableeditposition positions document replace position offset position length position get text gettext nls position get text gettext bad position category exception badpositioncategoryexception exception refactoring core plugin refactoringcoreplugin log exception document remove position updater removepositionupdater marker updater markerupdater document remove position removeposition marker position category range document remove position category removepositioncategory marker position category bad position category exception badpositioncategoryexception exception bad position category exception badpositioncategoryexception exception refactoring core plugin refactoringcoreplugin log exception document remove position updater removepositionupdater position updater positionupdater document remove position category removepositioncategory composable position category bad position category exception badpositioncategoryexception exception refactoring core plugin refactoringcoreplugin log exception get content getcontent document region range offset range length expand surround malformed tree exception malformedtreeexception exception refactoring core plugin refactoringcoreplugin log exception bad location exception badlocationexception exception refactoring core plugin refactoringcoreplugin log exception get preview document getpreviewdocument monitor org eclipse ltk core refactoring text edit based change texteditbasedchange get preview content getpreviewcontent org eclipse core runtime i progress monitor iprogressmonitor override string get preview content getpreviewcontent i progress monitor iprogressmonitor monitor core exception coreexception get preview document getpreviewdocument monitor returns document representing preview ref actored refactored buffer application change object param monitor progress monitor code code preview document empty document core exception coreexception document acquired i document idocument get preview document getpreviewdocument i progress monitor iprogressmonitor monitor core exception coreexception monitor monitor null progress monitor nullprogressmonitor i document idocument result i document idocument document document acquire document acquiredocument sub progress monitor subprogressmonitor monitor document result document document perform changes performchanges result bad location exception badlocationexception exception as core exception ascoreexception exception document release document releasedocument document sub progress monitor subprogressmonitor monitor monitor result result document result returns save mode change save mode get save mode getsavemode f save mode fsavemode org eclipse ltk core refactoring change initialize validation data initializevalidationdata org eclipse core runtime i progress monitor iprogressmonitor override initialize validation data initializevalidationdata i progress monitor iprogressmonitor monitor monitor monitor null progress monitor nullprogressmonitor nls monitor begin task begintask f validation state fvalidationstate buffer validation state buffervalidationstate create f file ffile monitor worked org eclipse ltk core refactoring change is valid isvalid org eclipse core runtime i progress monitor iprogressmonitor override refactoring status refactoringstatus is valid isvalid i progress monitor iprogressmonitor monitor core exception coreexception operation canceled exception operationcanceledexception monitor monitor null progress monitor nullprogressmonitor nls monitor begin task begintask f validation state fvalidationstate nls core exception coreexception nls status i status istatus error refactoring core plugin refactoringcoreplugin get plugin id getpluginid multi state text file change multistatetextfilechange initial ialized initialialized i text file buffer itextfilebuffer buffer file buffers filebuffers get text file buffer manager gettextfilebuffermanager get text file buffer gettextfilebuffer f file ffile get full path getfullpath location kind locationkind ifile f dirty fdirty buffer buffer is dirty isdirty refactoring status refactoringstatus status f validation state fvalidationstate is valid isvalid needs saving needssaving needs saving needssaving status merge validate modifies files validatemodifiesfiles i file ifile f file ffile reading file sync status merge check in sync checkinsync i file ifile f file ffile status monitor change saving code code saving code code needs saving needssaving f save mode fsavemode text file change textfilechange force save f dirty fdirty f save mode fsavemode text file change textfilechange save org eclipse ltk core refactoring change perform org eclipse core runtime i progress monitor iprogressmonitor override change perform i progress monitor iprogressmonitor monitor core exception coreexception nls monitor begin task begintask i document idocument document document acquire document acquiredocument sub progress monitor subprogressmonitor monitor linked list linkedlist undo edit undoedit undo list undolist linked list linkedlist perform changes performchanges document undo list undolist needs saving needssaving f buffer fbuffer commit sub progress monitor subprogressmonitor monitor multi state undo change multistateundochange get name getname f file ffile undo list undolist to array toarray undo edit undoedit undo list undolist size f content stamp fcontentstamp f save mode fsavemode bad location exception badlocationexception exception as core exception ascoreexception exception document release document releasedocument document sub progress monitor subprogressmonitor monitor monitor performs document param document document perform param undo list undolist undo list code code discard undos param preview code code performed preview code code bad location exception badlocationexception edit tree applied perform changes performchanges i document idocument document linked list linkedlist undo edit undoedit undo list undolist preview bad location exception badlocationexception f buffer fbuffer is synchronization context requested issynchronizationcontextrequested perform changes in synchronization context performchangesinsynchronizationcontext document undo list undolist preview i text file buffer manager itextfilebuffermanager file buffer manager filebuffermanager file buffers filebuffers get text file buffer manager gettextfilebuffermanager lock waiting computation thread complete lock completion lock completionlock lock bad location exception badlocationexception exception bad location exception badlocationexception runnable runnable runnable override completion lock completionlock perform changes in synchronization context performchangesinsynchronizationcontext document undo list undolist preview bad location exception badlocationexception exception completion lock completionlock f done fdone completion lock completionlock notify all notifyall completion lock completionlock file buffer manager filebuffermanager execute runnable completion lock completionlock f done fdone completion lock completionlock wait interrupted exception interruptedexception exception exception perform changes in synchronization context performchangesinsynchronizationcontext i document idocument document linked list linkedlist undo edit undoedit undo list undolist preview bad location exception badlocationexception document rewrite session documentrewritesession session document i document extension idocumentextension session i document extension idocumentextension document start rewrite session startrewritesession document rewrite session type documentrewritesessiontype unrestricted iterator composable buffer change composablebufferchange iterator f changes fchanges iterator iterator has next hasnext composable buffer change composablebufferchange change iterator undo edit undoedit edit create text edit processor createtexteditprocessor change document undo list undolist text edit textedit create undo text edit textedit preview perform edits performedits undo list undolist undo list undolist add first addfirst edit session i document extension idocumentextension document stop rewrite session stoprewritesession session releases document param document document release param monitor progress monitor core exception coreexception document released release document releasedocument i document idocument document i progress monitor iprogressmonitor monitor core exception coreexception is true istrue f count fcount f count fcount file buffers filebuffers get text file buffer manager gettextfilebuffermanager disconnect f file ffile get full path getfullpath location kind locationkind ifile monitor f count fcount org eclipse ltk core refactoring text edit based change texteditbasedchange set keep preview edits setkeeppreviewedits override set keep preview edits setkeeppreviewedits set keep preview edits setkeeppreviewedits f copier fcopier sets save mode param mode mode set save mode setsavemode mode f save mode fsavemode mode