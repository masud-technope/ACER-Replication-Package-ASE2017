licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache sling testing mock jcr org junit assert array equals assertarrayequals org junit assert equals assertequals org junit assert false assertfalse org junit assert not null assertnotnull org junit assert true asserttrue javax jcr item not found exception itemnotfoundexception javax jcr name space registry namespaceregistry javax jcr node javax jcr node iterator nodeiterator javax jcr path not found exception pathnotfoundexception javax jcr property javax jcr repository exception repositoryexception javax jcr session org apache jackrabbit jcr constants jcrconstants org junit org junit test google common collect immutable set immutableset mock session test mocksessiontest session session set up setup session mock jcr mockjcr new session newsession test test empty session testemptysession repository exception repositoryexception node root node rootnode session get root node getrootnode assert not null assertnotnull root node rootnode assert false assertfalse root node rootnode get properties getproperties has next hasnext assert false assertfalse root node rootnode get nodes getnodes has next hasnext test test root get nodes testrootgetnodes repository exception repositoryexception session mock jcr mockjcr new session newsession node root get root node getrootnode root add node addnode node root add node addnode node count children countchildren node iterator nodeiterator iter get root node getrootnode get nodes getnodes iter has next hasnext iter count children countchildren assert equals assertequals count children countchildren test test node property create read testnodepropertycreateread repository exception repositoryexception node root node rootnode session get node getnode assert equals assertequals root node rootnode session get root node getrootnode node node root node rootnode add node addnode node node set property setproperty prop node set property setproperty prop node node root node rootnode add node addnode node node set property setproperty prop assert equals assertequals node root node rootnode get node getnode node assert equals assertequals node session get node getnode node assert equals assertequals node session get item getitem node assert equals assertequals node session get node by identifier getnodebyidentifier node get identifier getidentifier assert true asserttrue session node exists nodeexists node assert true asserttrue session item exists itemexists node assert equals assertequals node root node rootnode get node getnode node assert equals assertequals node session get node getnode node assert equals assertequals node session get item getitem node assert equals assertequals node session get node by identifier getnodebyidentifier node get identifier getidentifier assert true asserttrue session node exists nodeexists node assert true asserttrue session item exists itemexists node property prop node get property getproperty prop property prop node get property getproperty prop property prop node get property getproperty prop assert equals assertequals prop session get property getproperty node prop assert equals assertequals prop session get item getitem node prop assert true asserttrue session property exists propertyexists node prop assert true asserttrue session item exists itemexists node prop assert equals assertequals prop session get property getproperty node prop assert equals assertequals prop session get item getitem node prop assert true asserttrue session property exists propertyexists node prop assert true asserttrue session item exists itemexists node prop assert equals assertequals prop session get property getproperty node prop assert equals assertequals prop session get item getitem node prop assert true asserttrue session property exists propertyexists node prop assert true asserttrue session item exists itemexists node prop assert equals assertequals prop get string getstring assert equals assertequals prop get string getstring assert equals assertequals prop get string getstring assert false assertfalse session property exists propertyexists node assert false assertfalse session node exists nodeexists node prop assert equals assertequals jcr constants jcrconstants unstructured node get primary node type getprimarynodetype get name getname assert true asserttrue node is node type isnodetype jcr constants jcrconstants unstructured assert true asserttrue node get primary node type getprimarynodetype is node type isnodetype jcr constants jcrconstants unstructured test test node remove testnoderemove repository exception repositoryexception node root node rootnode session get root node getrootnode node node root node rootnode add node addnode node assert true asserttrue session item exists itemexists node node remove assert false assertfalse session item exists itemexists node assert false assertfalse root node rootnode get nodes getnodes has next hasnext test test nodes with special names testnodeswithspecialnames repository exception repositoryexception node root node rootnode session get root node getrootnode node node root node rootnode add node addnode node ext node node node add node addnode node spaces node set property setproperty prop node node node add node addnode node ext node set property setproperty prop assert true asserttrue session item exists itemexists node ext assert true asserttrue session item exists itemexists node ext node spaces assert true asserttrue session item exists itemexists node ext node ext assert equals assertequals node get property getproperty prop get string getstring assert equals assertequals node get property getproperty prop get string getstring node iterator nodeiterator nodes node get nodes getnodes assert equals assertequals nodes get size getsize test test items exists testitemsexists repository exception repositoryexception assert false assertfalse session node exists nodeexists node assert false assertfalse session item exists itemexists node assert false assertfalse session property exists propertyexists node prop test expected path not found exception pathnotfoundexception test node not found exception testnodenotfoundexception repository exception repositoryexception session get node getnode node test expected path not found exception pathnotfoundexception test property not found exception testpropertynotfoundexception repository exception repositoryexception session get property getproperty node prop test expected path not found exception pathnotfoundexception test item not found exception testitemnotfoundexception repository exception repositoryexception session get item getitem node test expected item not found exception itemnotfoundexception test identifier found exception testidentifierfoundexception repository exception repositoryexception session get node by identifier getnodebyidentifier unknown test test names paces testnamespaces repository exception repositoryexception test initial names paces namespaces assert array equals assertarrayequals string jcr session get name space prefixes getnamespaceprefixes assert equals assertequals http jcp org jcr session get name space i getnamespaceuri jcr assert equals assertequals jcr session get name space prefix getnamespaceprefix http jcp org jcr add dummy namespace session set name space prefix setnamespaceprefix dummy http mydummy assert equals assertequals immutable set immutableset jcr dummy immutable set immutableset copy of copyof session get name space prefixes getnamespaceprefixes assert equals assertequals http mydummy session get name space i getnamespaceuri dummy assert equals assertequals dummy session get name space prefix getnamespaceprefix http mydummy test namespace registry name space registry namespaceregistry namespace registry namespaceregistry session get workspace getworkspace get name space registry getnamespaceregistry assert equals assertequals immutable set immutableset jcr dummy immutable set immutableset copy of copyof namespace registry namespaceregistry get prefixes getprefixes assert equals assertequals immutable set immutableset http jcp org jcr http mydummy immutable set immutableset copy of copyof namespace registry namespaceregistry geturis assert equals assertequals http mydummy namespace registry namespaceregistry geturi dummy assert equals assertequals dummy namespace registry namespaceregistry get prefix getprefix http mydummy remove dummy namespace namespace registry namespaceregistry unregister name space unregisternamespace dummy assert equals assertequals immutable set immutableset jcr immutable set immutableset copy of copyof session get name space prefixes getnamespaceprefixes assert equals assertequals http jcp org jcr session get name space i getnamespaceuri jcr assert equals assertequals jcr session get name space prefix getnamespaceprefix http jcp org jcr test test user i d testuserid assert equals assertequals mock jcr mockjcr user session get user d getuserid test test with custom user workspace testwithcustomuserworkspace session my session mysession mock jcr mockjcr new session newsession my user myuser my workspace myworkspace assert equals assertequals my user myuser my session mysession get user d getuserid assert equals assertequals my workspace myworkspace my session mysession get workspace getworkspace get name getname test test save refresh testsaverefresh repository exception repositoryexception methods called assert false assertfalse session has pending changes haspendingchanges session save session refresh session refresh test test get repository testgetrepository assert not null assertnotnull session get repository getrepository test test check permission testcheckpermission repository exception repositoryexception session check permission checkpermission path any actions anyactions test test paths are normal ized testpathsarenormalized repository exception repositoryexception passing paths jcr path passed argument jcr method normalized normalized standard standard form session get root node getrootnode add node addnode foo assert true asserttrue requesting node foo succeed session node exists nodeexists foo assert true asserttrue requesting item foo succeed session item exists itemexists foo session get root node getrootnode add node addnode bar assert true asserttrue creating bar succeed session node exists nodeexists bar session remove item removeitem foo assert false assertfalse removing foo succeed session node exists nodeexists foo test test new state testnewstate repository exception repositoryexception node node session get root node getrootnode add node addnode foo property property node set property setproperty test prop testprop assert true asserttrue node is new isnew assert true asserttrue property is new isnew session save assert false assertfalse node is new isnew assert false assertfalse property is new isnew test test log out testlogout exception assert true asserttrue session is live islive session log out logout assert false assertfalse session is live islive