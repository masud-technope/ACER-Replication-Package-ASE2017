licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache sling launchpad webapp int egrationtest integrationtest servlets post java io exception ioexception java util arrays java util collections java util hash map hashmap java util list java util map javax servlet http http servlet response httpservletresponse org apache commons http client httpclient name value pair namevaluepair org apache sling commons testing int egration integration http test base httptestbase org apache sling servlets post sling post constants slingpostconstants test node creation post servlet postservlet versionable nodes post servlet version able test postservletversionabletest http test base httptestbase string test base path sling tests string post url posturl map string string params override set up setup exception set up setup post url posturl http base url test base path system current time millis currenttimemillis params hash map hashmap string string params jcr mixin types mixintypes mix versionable test post path is unique testpostpathisunique io exception ioexception assert http status asserthttpstatus post url posturl http servlet response httpservletresponse path exist test post url posturl test created node is checked out testcreatednodeischeckedout io exception ioexception string location test client testclient create node createnode post url posturl sling post constants slingpostconstants create suffix params assert http status asserthttpstatus location ext http servlet response httpservletresponse post redirect created resource location assert true asserttrue node location generated location ends with endswith assert true asserttrue node location created post url post url posturl location post url posturl string content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout test adding version able mix in checks out testaddingversionablemixinchecksout io exception ioexception string location test client testclient create node createnode post url posturl sling post constants slingpostconstants create suffix assert http status asserthttpstatus location ext http servlet response httpservletresponse post redirect created resource location assert true asserttrue node location generated location ends with endswith assert true asserttrue node location created post url post url posturl location post url posturl string content get content getcontent location txt content type plain assert false assertfalse node location isn versionable content jcr is checked out ischeckedout test client testclient create node createnode location params content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout test created node is checked in if requested testcreatednodeischeckedinifrequested io exception ioexception params checkin new version able nodes checkinnewversionablenodes string location test client testclient create node createnode post url posturl sling post constants slingpostconstants create suffix params assert http status asserthttpstatus location ext http servlet response httpservletresponse post redirect created resource location assert true asserttrue node location generated location ends with endswith assert true asserttrue node location created post url post url posturl location post url posturl string content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout test adding version able mix in checks in if requested testaddingversionablemixinchecksinifrequested io exception ioexception string location test client testclient create node createnode post url posturl sling post constants slingpostconstants create suffix assert http status asserthttpstatus location ext http servlet response httpservletresponse post redirect created resource location assert true asserttrue node location generated location ends with endswith assert true asserttrue node location created post url post url posturl location post url posturl string content get content getcontent location txt content type plain assert false assertfalse node location isn versionable content jcr is checked out ischeckedout params checkin new version able nodes checkinnewversionablenodes test client testclient create node createnode location params content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout test modifying checked out node doesn t check it in testmodifyingacheckedoutnodedoesntcheckitin io exception ioexception string location test client testclient create node createnode post url posturl sling post constants slingpostconstants create suffix params assert http status asserthttpstatus location ext http servlet response httpservletresponse post redirect created resource location assert true asserttrue node location generated location ends with endswith assert true asserttrue node location created post url post url posturl location post url posturl string content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout params clear params test client testclient create node createnode location params content get content getcontent location txt content type plain assert true asserttrue node property content assert true asserttrue node location checked content jcr is checked out ischeckedout test modifying checked in node fails without auto checkout testmodifyingacheckedinnodefailswithoutautocheckout io exception ioexception params checkin new version able nodes checkinnewversionablenodes string location test client testclient create node createnode post url posturl sling post constants slingpostconstants create suffix params assert http status asserthttpstatus location ext http servlet response httpservletresponse post redirect created resource location assert true asserttrue node location generated location ends with endswith assert true asserttrue node location created post url post url posturl location post url posturl string content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout list name value pair namevaluepair test params testparams arrays as list aslist name value pair namevaluepair auto checkout autocheckout name value pair namevaluepair assert post status assertpoststatus location test params testparams attempted modification auto checkout autocheckout fail test modified node is checked in after modification testmodifiednodeischeckedinaftermodification io exception ioexception params checkin new version able nodes checkinnewversionablenodes string location test client testclient create node createnode post url posturl sling post constants slingpostconstants create suffix params assert http status asserthttpstatus location ext http servlet response httpservletresponse post redirect created resource location assert true asserttrue node location generated location ends with endswith assert true asserttrue node location created post url post url posturl location post url posturl string content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout params clear params auto checkout autocheckout params test client testclient create node createnode location params content get content getcontent location txt content type plain assert true asserttrue node property content assert true asserttrue node location checked content jcr is checked out ischeckedout test modified node is checked out if requested testmodifiednodeischeckedoutifrequested io exception ioexception params checkin new version able nodes checkinnewversionablenodes string location test client testclient create node createnode post url posturl sling post constants slingpostconstants create suffix params assert http status asserthttpstatus location ext http servlet response httpservletresponse post redirect created resource location assert true asserttrue node location generated location ends with endswith assert true asserttrue node location created post url post url posturl location post url posturl string content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout params clear params auto checkout autocheckout params params auto check in autocheckin test client testclient create node createnode location params content get content getcontent location txt content type plain assert true asserttrue node property content assert true asserttrue node location checked content jcr is checked out ischeckedout test checking in check out node testcheckinginacheckoutnode io exception ioexception string location test client testclient create node createnode post url posturl sling post constants slingpostconstants create suffix params assert http status asserthttpstatus location ext http servlet response httpservletresponse post redirect created resource location assert true asserttrue node location generated location ends with endswith assert true asserttrue node location created post url post url posturl location post url posturl string content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout params clear params operation checkin test client testclient create node createnode location params content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout test restore version testrestoreversion io exception ioexception string location test client testclient create node createnode post url posturl sling post constants slingpostconstants create suffix params test client testclient create node createnode location collections singleton map singletonmap key value for version valueforversion test client testclient create node createnode location collections singleton map singletonmap operation checkin test client testclient create node createnode location collections singleton map singletonmap operation check out checkout test client testclient create node createnode location collections singleton map singletonmap key value for version valueforversion test client testclient create node createnode location collections singleton map singletonmap operation checkin assert true asserttrue get content getcontent location txt content type plain key value for version valueforversion params clear params operation restore params version test client testclient create node createnode location params assert true asserttrue get content getcontent location txt content type plain key value for version valueforversion params clear params operation restore params version test client testclient create node createnode location params assert true asserttrue get content getcontent location txt content type plain key value for version valueforversion test checking out checked in node testcheckingoutacheckedinnode io exception ioexception params checkin new version able nodes checkinnewversionablenodes string location test client testclient create node createnode post url posturl sling post constants slingpostconstants create suffix params assert http status asserthttpstatus location ext http servlet response httpservletresponse post redirect created resource location assert true asserttrue node location generated location ends with endswith assert true asserttrue node location created post url post url posturl location post url posturl string content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout params clear params operation check out checkout test client testclient create node createnode location params content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout test checking out an already checked out node is no op testcheckingoutanalreadycheckedoutnodeisanoop io exception ioexception string location test client testclient create node createnode post url posturl sling post constants slingpostconstants create suffix params assert http status asserthttpstatus location ext http servlet response httpservletresponse post redirect created resource location assert true asserttrue node location generated location ends with endswith assert true asserttrue node location created post url post url posturl location post url posturl string content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout params clear params operation check out checkout test client testclient create node createnode location params content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout test checking in an already checked in node is no op testcheckinginanalreadycheckedinnodeisanoop io exception ioexception params checkin new version able nodes checkinnewversionablenodes string location test client testclient create node createnode post url posturl sling post constants slingpostconstants create suffix params assert http status asserthttpstatus location ext http servlet response httpservletresponse post redirect created resource location assert true asserttrue node location generated location ends with endswith assert true asserttrue node location created post url post url posturl location post url posturl string content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout params clear params operation checkin test client testclient create node createnode location params content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout test deleting child node of checked in node testdeletingchildnodeofacheckedinnode io exception ioexception params checkin new version able nodes checkinnewversionablenodes params child test prop testprop test value testvalue string location test client testclient create node createnode post url posturl sling post constants slingpostconstants create suffix params assert http status asserthttpstatus location ext http servlet response httpservletresponse post redirect created resource location assert true asserttrue node location generated location ends with endswith assert true asserttrue node location created post url post url posturl location post url posturl string content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout assert false assertfalse node location should n shouldn test property content test prop testprop test value testvalue content get content getcontent location child txt content type plain assert false assertfalse node location child should n shouldn versionable checked content jcr is checked out ischeckedout assert true asserttrue node location child test property content test prop testprop test value testvalue params clear params auto checkout autocheckout params child delete test client testclient create node createnode location params content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout assert http status asserthttpstatus location child txt test deleting child node of checked in node by op testdeletingchildnodeofacheckedinnodebyop io exception ioexception params checkin new version able nodes checkinnewversionablenodes params child test prop testprop test value testvalue string location test client testclient create node createnode post url posturl sling post constants slingpostconstants create suffix params assert http status asserthttpstatus location ext http servlet response httpservletresponse post redirect created resource location assert true asserttrue node location generated location ends with endswith assert true asserttrue node location created post url post url posturl location post url posturl string content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout assert false assertfalse node location should n shouldn test property content test prop testprop test value testvalue content get content getcontent location child txt content type plain assert false assertfalse node location child should n shouldn versionable checked content jcr is checked out ischeckedout assert true asserttrue node location child test property content test prop testprop test value testvalue params clear params auto checkout autocheckout params sling post constants slingpostconstants operation sling post constants slingpostconstants operation delete test client testclient create node createnode location child params content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout assert http status asserthttpstatus location child txt test deleting property of checked in node testdeletingapropertyofacheckedinnode io exception ioexception params checkin new version able nodes checkinnewversionablenodes params test prop testprop test value testvalue string location test client testclient create node createnode post url posturl sling post constants slingpostconstants create suffix params assert http status asserthttpstatus location ext http servlet response httpservletresponse post redirect created resource location assert true asserttrue node location generated location ends with endswith assert true asserttrue node location created post url post url posturl location post url posturl string content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout assert true asserttrue node location test property content test prop testprop test value testvalue params clear params auto checkout autocheckout params test prop testprop delete test client testclient create node createnode location params content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout assert false assertfalse node location should n shouldn test property content test prop testprop test value testvalue test deleting property of checked in node fails without auto checkout testdeletingapropertyofacheckedinnodefailswithoutautocheckout io exception ioexception params checkin new version able nodes checkinnewversionablenodes params test prop testprop test value testvalue string location test client testclient create node createnode post url posturl sling post constants slingpostconstants create suffix params assert http status asserthttpstatus location ext http servlet response httpservletresponse post redirect created resource location assert true asserttrue node location generated location ends with endswith assert true asserttrue node location created post url post url posturl location post url posturl string content get content getcontent location txt content type plain assert true asserttrue node location checked content jcr is checked out ischeckedout assert true asserttrue node location test property content test prop testprop test value testvalue list name value pair namevaluepair test params testparams arrays as list aslist name value pair namevaluepair auto checkout autocheckout name value pair namevaluepair test prop testprop delete assert post status assertpoststatus location test params testparams attempted modification auto checkout autocheckout fail test moving property of checked in node to new version able node testmovingapropertyofacheckedinnodetoanewversionablenode io exception ioexception params checkin new version able nodes checkinnewversionablenodes params text string test path testpath test base path abs system current time millis currenttimemillis test client testclient create node createnode http base url test path testpath src params content source location string old content oldcontent get content getcontent http base url test path testpath src json content type json assert java script assertjavascript old content oldcontent println data text assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout create dest text src text params clear params auto checkout autocheckout params jcr mixin types mixintypes mix versionable params checkin new version able nodes checkinnewversionablenodes params text move from movefrom test path testpath src text test client testclient create node createnode http base url test path testpath dest params content location string content get content getcontent http base url test path testpath dest json content type json assert java script assertjavascript content println data text assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout content location old content oldcontent get content getcontent http base url test path testpath src json content type json assert java script assertjavascript undefined old content oldcontent println type of typeof data text assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout test moving property of checked in node to checked in node testmovingapropertyofacheckedinnodetoacheckedinnode io exception ioexception params checkin new version able nodes checkinnewversionablenodes params text string test path testpath test base path abs system current time millis currenttimemillis test client testclient create node createnode http base url test path testpath src params content source location string old content oldcontent get content getcontent http base url test path testpath src json content type json assert java script assertjavascript old content oldcontent println data text assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout create dest params clear params jcr mixin types mixintypes mix versionable params checkin new version able nodes checkinnewversionablenodes test client testclient create node createnode http base url test path testpath dest params content location string content get content getcontent http base url test path testpath dest json content type json assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout params clear params auto checkout autocheckout params text move from movefrom test path testpath src text test client testclient create node createnode http base url test path testpath dest params content location content get content getcontent http base url test path testpath dest json content type json assert java script assertjavascript content println data text assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout content location old content oldcontent get content getcontent http base url test path testpath src json content type json assert java script assertjavascript undefined old content oldcontent println type of typeof data text assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout test copying property to checked in node testcopyingapropertytoacheckedinnode io exception ioexception params checkin new version able nodes checkinnewversionablenodes params text string test path testpath test base path abs system current time millis currenttimemillis test client testclient create node createnode http base url test path testpath src params content source location string old content oldcontent get content getcontent http base url test path testpath src json content type json assert java script assertjavascript old content oldcontent println data text assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout create dest empty params jcr mixin types mixintypes mix versionable params checkin new version able nodes checkinnewversionablenodes test client testclient create node createnode http base url test path testpath dest params string content get content getcontent http base url test path testpath dest json content type json assert java script assertjavascript content println data jcr is checked out ischeckedout copy text src text params clear params auto checkout autocheckout params text copy from copyfrom test path testpath src text test client testclient create node createnode http base url test path testpath dest params content location content get content getcontent http base url test path testpath dest json content type json assert java script assertjavascript content println data text assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout content source location old content oldcontent get content getcontent http base url test path testpath src json content type json assert java script assertjavascript old content oldcontent println data text assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout test moving child node of checked in node to new version able node testmovingachildnodeofacheckedinnodetoanewversionablenode io exception ioexception params checkin new version able nodes checkinnewversionablenodes string test path testpath test base path abs system current time millis currenttimemillis test client testclient create node createnode http base url test path testpath src params params clear params auto checkout autocheckout params text test client testclient create node createnode http base url test path testpath src child params content source location string old content oldcontent get content getcontent http base url test path testpath src json content type json assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout assert java script assertjavascript old content oldcontent println data child text create dest child src params clear params auto checkout autocheckout params jcr mixin types mixintypes mix versionable params checkin new version able nodes checkinnewversionablenodes params src move from movefrom test path testpath src child test client testclient create node createnode http base url test path testpath dest params content location string content get content getcontent http base url test path testpath dest json content type json assert java script assertjavascript content println data src text assert java script assertjavascript content println data jcr is checked out ischeckedout content location assert http status asserthttpstatus http base url test path testpath src child json http servlet response httpservletresponse expected content old content oldcontent get content getcontent http base url test path testpath src json content type json assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout test moving child node of checked in node to checked in node testmovingachildnodeofacheckedinnodetoacheckedinnode io exception ioexception params checkin new version able nodes checkinnewversionablenodes string test path testpath test base path abs system current time millis currenttimemillis test client testclient create node createnode http base url test path testpath src params params clear params auto checkout autocheckout params text test client testclient create node createnode http base url test path testpath src child params content source location string old content oldcontent get content getcontent http base url test path testpath src json content type json assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout assert java script assertjavascript old content oldcontent println data child text create dest params clear params jcr mixin types mixintypes mix versionable params checkin new version able nodes checkinnewversionablenodes test client testclient create node createnode http base url test path testpath dest params string content get content getcontent http base url test path testpath dest json content type json assert java script assertjavascript content println data jcr is checked out ischeckedout move src child params clear params auto checkout autocheckout params src move from movefrom test path testpath src child test client testclient create node createnode http base url test path testpath dest params content location content get content getcontent http base url test path testpath dest json content type json assert java script assertjavascript content println data src text assert java script assertjavascript content println data jcr is checked out ischeckedout content location assert http status asserthttpstatus http base url test path testpath src child json http servlet response httpservletresponse expected content old content oldcontent get content getcontent http base url test path testpath src json content type json assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout test copying node to checked in node testcopyinganodetoacheckedinnode io exception ioexception params checkin new version able nodes checkinnewversionablenodes string test path testpath test base path abs system current time millis currenttimemillis test client testclient create node createnode http base url test path testpath src params params clear params auto checkout autocheckout params text test client testclient create node createnode http base url test path testpath src child params content source location string old content oldcontent get content getcontent http base url test path testpath src json content type json assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout assert java script assertjavascript old content oldcontent println data child text create dest empty params jcr mixin types mixintypes mix versionable params checkin new version able nodes checkinnewversionablenodes test client testclient create node createnode http base url test path testpath dest params string content get content getcontent http base url test path testpath dest json content type json assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout copy text src text params clear params auto checkout autocheckout params src copy from copyfrom test path testpath src child test client testclient create node createnode http base url test path testpath dest params content location content get content getcontent http base url test path testpath dest json content type json assert java script assertjavascript content println data src text assert java script assertjavascript content println data jcr is checked out ischeckedout content source location old content oldcontent get content getcontent http base url test path testpath src json content type json assert java script assertjavascript old content oldcontent println data child text assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout test moving child node of checked in node to checked in node by op testmovingachildnodeofacheckedinnodetoacheckedinnodebyop io exception ioexception params checkin new version able nodes checkinnewversionablenodes string test path testpath test base path abs system current time millis currenttimemillis test client testclient create node createnode http base url test path testpath src params params clear params auto checkout autocheckout params text test client testclient create node createnode http base url test path testpath src child params content source location string old content oldcontent get content getcontent http base url test path testpath src json content type json assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout assert java script assertjavascript old content oldcontent println data child text create dest params clear params jcr mixin types mixintypes mix versionable params checkin new version able nodes checkinnewversionablenodes test client testclient create node createnode http base url test path testpath dest params string content get content getcontent http base url test path testpath dest json content type json assert java script assertjavascript content println data jcr is checked out ischeckedout move src child params clear params auto checkout autocheckout params sling post constants slingpostconstants operation sling post constants slingpostconstants operation move params dest test path testpath dest src test client testclient create node createnode http base url test path testpath src child params content location content get content getcontent http base url test path testpath dest json content type json assert java script assertjavascript content println data src text assert java script assertjavascript content println data jcr is checked out ischeckedout content location assert http status asserthttpstatus http base url test path testpath src child json http servlet response httpservletresponse expected content old content oldcontent get content getcontent http base url test path testpath src json content type json assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout test copying node to checked in node by op testcopyinganodetoacheckedinnodebyop io exception ioexception params checkin new version able nodes checkinnewversionablenodes string test path testpath test base path abs system current time millis currenttimemillis test client testclient create node createnode http base url test path testpath src params params clear params auto checkout autocheckout params text test client testclient create node createnode http base url test path testpath src child params content source location string old content oldcontent get content getcontent http base url test path testpath src json content type json assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout assert java script assertjavascript old content oldcontent println data child text create dest empty params jcr mixin types mixintypes mix versionable params checkin new version able nodes checkinnewversionablenodes test client testclient create node createnode http base url test path testpath dest params string content get content getcontent http base url test path testpath dest json content type json assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout copy child src params clear params auto checkout autocheckout params sling post constants slingpostconstants operation sling post constants slingpostconstants operation copy params dest test path testpath dest src test client testclient create node createnode http base url test path testpath src child params content location content get content getcontent http base url test path testpath dest json content type json assert java script assertjavascript content println data src text assert java script assertjavascript content println data jcr is checked out ischeckedout content source location old content oldcontent get content getcontent http base url test path testpath src json content type json assert java script assertjavascript old content oldcontent println data child text assert java script assertjavascript old content oldcontent println data jcr is checked out ischeckedout