licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache sling launchpad webapp int egrationtest integrationtest access manager accessmanager java io exception ioexception java util array list arraylist java util list javax servlet http http servlet response httpservletresponse org apache commons http client httpclient credentials org apache commons http client httpclient name value pair namevaluepair org apache commons http client httpclient username password credentials usernamepasswordcredentials org apache sling commons json json array jsonarray org apache sling commons json json exception jsonexception org apache sling commons json json object jsonobject tests remove ace removeace sling post operation remove aces test removeacestest access manager test util accessmanagertestutil string test user id testuserid string test group id testgroupid string test folder url testfolderurl override tear down teardown exception tear down teardown credentials creds username password credentials usernamepasswordcredentials admin admin test folder url testfolderurl remove test user exists string post url posturl test folder url testfolderurl list name value pair namevaluepair post params postparams array list arraylist name value pair namevaluepair post params postparams add name value pair namevaluepair operation delete assert authenticated post status assertauthenticatedpoststatus creds post url posturl http servlet response httpservletresponse post params postparams test group id testgroupid remove test user exists string post url posturl http base url system user manager usermanager group test group id testgroupid delete html list name value pair namevaluepair post params postparams array list arraylist name value pair namevaluepair assert authenticated post status assertauthenticatedpoststatus creds post url posturl http servlet response httpservletresponse post params postparams test user id testuserid remove test user exists string post url posturl http base url system user manager usermanager user test user id testuserid delete html list name value pair namevaluepair post params postparams array list arraylist name value pair namevaluepair assert authenticated post status assertauthenticatedpoststatus creds post url posturl http servlet response httpservletresponse post params postparams todo delete test folder string create folder with aces createfolderwithaces add group ace addgroupace io exception ioexception json exception jsonexception test user id testuserid create test user createtestuser test folder url testfolderurl create test folder createtestfolder string post url posturl test folder url testfolderurl modify ace modifyace html list name value pair namevaluepair post params postparams array list arraylist name value pair namevaluepair post params postparams add name value pair namevaluepair principal id principalid test user id testuserid post params postparams add name value pair namevaluepair privilege jcr read granted post params postparams add name value pair namevaluepair privilege jcr write denied credentials creds username password credentials usernamepasswordcredentials admin admin assert authenticated post status assertauthenticatedpoststatus creds post url posturl http servlet response httpservletresponse post params postparams add group ace addgroupace test group id testgroupid create test group createtestgroup post params postparams array list arraylist name value pair namevaluepair post params postparams add name value pair namevaluepair principal id principalid test group id testgroupid post params postparams add name value pair namevaluepair privilege jcr read granted assert authenticated post status assertauthenticatedpoststatus creds post url posturl http servlet response httpservletresponse post params postparams fetch json acl verify settings string get url geturl test folder url testfolderurl acl json string json get authenticated content getauthenticatedcontent creds get url geturl content type json http servlet response httpservletresponse assert not null assertnotnull json json object jsonobject json object jsonobject json object jsonobject json add group ace addgroupace assert equals assertequals json object jsonobject length assert equals assertequals json object jsonobject length json object jsonobject ace object aceobject json object jsonobject optjsonobject test user id testuserid assert not null assertnotnull ace object aceobject assert equals assertequals ace object aceobject get int getint order string principal string principalstring ace object aceobject opt string optstring principal assert equals assertequals test user id testuserid principal string principalstring json array jsonarray granted array grantedarray ace object aceobject optjsonarray granted assert not null assertnotnull granted array grantedarray assert equals assertequals jcr read granted array grantedarray get string getstring json array jsonarray denied array deniedarray ace object aceobject optjsonarray denied assert not null assertnotnull denied array deniedarray assert equals assertequals jcr write denied array deniedarray get string getstring add group ace addgroupace ace object aceobject json object jsonobject optjsonobject test group id testgroupid assert not null assertnotnull ace object aceobject principal string principalstring ace object aceobject opt string optstring principal assert equals assertequals test group id testgroupid principal string principalstring assert equals assertequals ace object aceobject get int getint order granted array grantedarray ace object aceobject optjsonarray granted assert not null assertnotnull granted array grantedarray assert equals assertequals jcr read granted array grantedarray get string getstring test folder url testfolderurl test removing single ace test remove ace testremoveace io exception ioexception json exception jsonexception string folder url folderurl create folder with aces createfolderwithaces remove ace test user testuser principal string post url posturl folder url folderurl delete ace deleteace html list name value pair namevaluepair post params postparams array list arraylist name value pair namevaluepair post params postparams add name value pair namevaluepair apply to applyto test user id testuserid credentials creds username password credentials usernamepasswordcredentials admin admin assert authenticated post status assertauthenticatedpoststatus creds post url posturl http servlet response httpservletresponse post params postparams fetch json acl verify settings string get url geturl folder url folderurl acl json string json get authenticated content getauthenticatedcontent creds get url geturl content type json http servlet response httpservletresponse assert not null assertnotnull json json object jsonobject json object jsonobject json object jsonobject json assert not null assertnotnull json object jsonobject assert equals assertequals json object jsonobject length test removing multiple aces test remove aces testremoveaces io exception ioexception json exception jsonexception string folder url folderurl create folder with aces createfolderwithaces remove ace test user testuser principal string post url posturl folder url folderurl delete ace deleteace html list name value pair namevaluepair post params postparams array list arraylist name value pair namevaluepair post params postparams add name value pair namevaluepair apply to applyto test user id testuserid post params postparams add name value pair namevaluepair apply to applyto test group id testgroupid credentials creds username password credentials usernamepasswordcredentials admin admin assert authenticated post status assertauthenticatedpoststatus creds post url posturl http servlet response httpservletresponse post params postparams fetch json acl verify settings string get url geturl folder url folderurl acl json string json get authenticated content getauthenticatedcontent creds get url geturl content type json http servlet response httpservletresponse assert not null assertnotnull json json object jsonobject json object jsonobject json object jsonobject json assert not null assertnotnull json object jsonobject assert equals assertequals json object jsonobject length test sling test remove aces response as n testremoveacesresponseasjson io exception ioexception json exception jsonexception string folder url folderurl create folder with aces createfolderwithaces remove ace test user testuser principal string post url posturl folder url folderurl delete ace deleteace json list name value pair namevaluepair post params postparams array list arraylist name value pair namevaluepair post params postparams add name value pair namevaluepair apply to applyto test user id testuserid post params postparams add name value pair namevaluepair apply to applyto test group id testgroupid credentials creds username password credentials usernamepasswordcredentials admin admin string json get authenticated post content getauthenticatedpostcontent creds post url posturl content type json post params postparams http servlet response httpservletresponse json response parsed json object json object jsonobject json object jsonobject json object jsonobject json assert not null assertnotnull json object jsonobject