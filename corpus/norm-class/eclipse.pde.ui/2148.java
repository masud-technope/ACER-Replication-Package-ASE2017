copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde api tools internal model java util array list arraylist java util collections java util hash map hashmap java util list java util map org eclipse core resources i container icontainer org eclipse core resources i project iproject org eclipse core resources i resource iresource org eclipse core resources resources plugin resourcesplugin org eclipse core runtime core exception coreexception org eclipse core runtime i path ipath org eclipse core runtime path org eclipse jdt core i classpath entry iclasspathentry org eclipse jdt core i java project ijavaproject org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt core java core javacore org eclipse osgi service resolver bundle description bundledescription org eclipse osgi util nls org eclipse pde api tools internal api description manager apidescriptionmanager org eclipse pde api tools internal api filter store apifilterstore org eclipse pde api tools internal core messages coremessages org eclipse pde api tools internal provisional api plugin apiplugin org eclipse pde api tools internal provisional i api description iapidescription org eclipse pde api tools internal provisional i api filter store iapifilterstore org eclipse pde api tools internal provisional model i api baseline iapibaseline org eclipse pde api tools internal provisional model i api component iapicomponent org eclipse pde api tools internal provisional model i api type container iapitypecontainer org eclipse pde api tools internal util util org eclipse pde core build i build ibuild org eclipse pde core build i build entry ibuildentry org eclipse pde core build i build model ibuildmodel org eclipse pde core plugin i plugin model base ipluginmodelbase org eclipse pde core plugin plugin registry pluginregistry org osgi framework bundle exception bundleexception api component plug project workspace note requires running workspace instantiated project component projectcomponent bundle component bundlecomponent constant describe custom build properties entry nls string entry custom custom constant describe build properties start code extra code nls string extra prefix extra java project i java project ijavaproject f project fproject i plugin model base ipluginmodelbase object i plugin model base ipluginmodelbase f model fmodel cache bundle path entries file containers map string i api type container iapitypecontainer f path to output containers fpathtooutputcontainers cache output location paths file containers map i path ipath i api type container iapitypecontainer f output location to container foutputlocationtocontainer constructs api component java project baseline param baseline owning api baseline param location location component param model model param bundle id bundleid core exception coreexception unable create api component project component projectcomponent i api baseline iapibaseline baseline string location i plugin model base ipluginmodelbase model bundle id bundleid core exception coreexception baseline location bundle id bundleid i path ipath path path location i project iproject project resources plugin resourcesplugin get workspace getworkspace get root getroot get project getproject path last segment lastsegment f project fproject java core javacore create project f model fmodel model override set name setname string new name newname override translated plug model set name setname f model fmodel get resource string getresourcestring new name newname override is binary isbinary override bundle description bundledescription get bundle description getbundledescription map string string manifest string location bundle exception bundleexception bundle description bundledescription result get model getmodel get bundle description getbundledescription result nls bundle exception bundleexception nls find manifest bundle location result core exception coreexception bundle exception bundleexception get message getmessage returns link i plugin model base ipluginmodelbase backing component link i plugin model base ipluginmodelbase exception ret runs retruns code code core exception coreexception i plugin model base ipluginmodelbase get model getmodel core exception coreexception f model fmodel f model fmodel plugin registry pluginregistry find model findmodel f project fproject get project getproject f model fmodel abort nls bind core messages coremessages project component projectcomponent locate model f project fproject get element name getelementname f model fmodel override is api enabled isapienabled util is api project isapiproject f project fproject override dispose has api filter store hasapifilterstore get filter store getfilterstore dispose f model fmodel f output location to container foutputlocationtocontainer f output location to container foutputlocationtocontainer clear f output location to container foutputlocationtocontainer f path to output containers fpathtooutputcontainers f path to output containers fpathtooutputcontainers clear f path to output containers fpathtooutputcontainers core exception coreexception api plugin apiplugin log dispose override i api description iapidescription create local api description createlocalapidescription core exception coreexception time system current time millis currenttimemillis util is api project isapiproject get java project getjavaproject set has api description sethasapidescription i api description iapidescription api desc apidesc api description manager apidescriptionmanager get manager getmanager get api description getapidescription get bundle description getbundledescription api plugin apiplugin debug project component nls nls nls system println time create api description f project fproject get element name getelementname system current time millis currenttimemillis time api desc apidesc override i api filter store iapifilterstore create api filter store createapifilterstore core exception coreexception time system current time millis currenttimemillis i api filter store iapifilterstore store api filter store apifilterstore get java project getjavaproject api plugin apiplugin debug project component nls nls nls system println time create api filter store f project fproject get element name getelementname system current time millis currenttimemillis time store override list i api type container iapitypecontainer create api type containers createapitypecontainers core exception coreexception populate build properties cache create file containers bundle classpath entries f path to output containers fpathtooutputcontainers hash map hashmap f output location to container foutputlocationtocontainer hash map hashmap f project fproject exists f project fproject get project getproject is open isopen i plugin model base ipluginmodelbase model plugin registry pluginregistry find model findmodel f project fproject get project getproject model i build model ibuildmodel build model buildmodel plugin registry pluginregistry create build model createbuildmodel model build model buildmodel i build ibuild build build model buildmodel get build getbuild i build entry ibuildentry entry build get entry getentry entry custom entry string tokens entry get tokens gettokens tokens length nls tokens equals nls hack add current output location classpath entries i classpath entry iclasspathentry classpath entries classpathentries f project fproject get raw classpath getrawclasspath list i api type container iapitypecontainer containers array list arraylist classpath entries classpathentries length i classpath entry iclasspathentry classpath entry classpathentry classpath entries classpathentries classpath entry classpathentry get entry kind getentrykind i classpath entry iclasspathentry cpe source string container path containerpath classpath entry classpathentry get path getpath remove first segments removefirstsegments to string tostring i api type container iapitypecontainer container get api type container getapitypecontainer container path containerpath container containers container containers add container i classpath entry iclasspathentry cpe variable classpath entry classpathentry java core javacore get resolved classpath entry getresolvedclasspathentry classpath entry classpathentry fall i classpath entry iclasspathentry cpe library i path ipath path classpath entry classpathentry get path getpath util is archive isarchive path last segment lastsegment i resource iresource resource resources plugin resourcesplugin get workspace getworkspace get root getroot find member findmember path resource jar workspace containers add archive api type container archiveapitypecontainer resource get location getlocation toosstring external jar containers add archive api type container archiveapitypecontainer path toosstring containers is empty isempty i api type container iapitypecontainer cfc containers size cfc containers cfc composite api type container compositeapitypecontainer containers f path to output containers fpathtooutputcontainers nls cfc i build entry ibuildentry entries build get build entries getbuildentries length entries length length i build entry ibuildentry build entry buildentry entries string build entry buildentry get name getname starts with startswith i build entry ibuildentry jar prefix retrieve containers retrievecontainers i build entry ibuildentry jar prefix build entry buildentry starts with startswith extra prefix retrieve containers retrievecontainers extra prefix build entry buildentry create api type containers createapitypecontainers collections empty list retrieve containers retrievecontainers string string prefix i build entry ibuildentry build entry buildentry core exception coreexception string jar substring prefix length string tokens build entry buildentry get tokens gettokens tokens length i api type container iapitypecontainer container get api type container getapitypecontainer tokens container i api type container iapitypecontainer existing container existingcontainer f path to output containers fpathtooutputcontainers jar existing container existingcontainer concat containers list i api type container iapitypecontainer all containers allcontainers array list arraylist all containers allcontainers add existing container existingcontainer all containers allcontainers add container i api type container iapitypecontainer api type container apitypecontainer composite api type container compositeapitypecontainer all containers allcontainers f path to output containers fpathtooutputcontainers jar api type container apitypecontainer f path to output containers fpathtooutputcontainers jar container list i api type container iapitypecontainer containers array list arraylist tokens length string current token currenttoken tokens i api type container iapitypecontainer container get api type container getapitypecontainer current token currenttoken container containers container containers add container containers is empty isempty i api type container iapitypecontainer existing container existingcontainer f path to output containers fpathtooutputcontainers jar existing container existingcontainer concat containers containers add existing container existingcontainer i api type container iapitypecontainer cfc containers size cfc containers cfc composite api type container compositeapitypecontainer containers f path to output containers fpathtooutputcontainers jar cfc override i api type container iapitypecontainer create api type container createapitypecontainer string path core exception coreexception f path to output containers fpathtooutputcontainers baseline disposed baselinedisposed get baseline getbaseline i api type container iapitypecontainer container f path to output containers fpathtooutputcontainers path container binary jar included plug container find api type container findapitypecontainer path container finds returns existing link i api type container iapitypecontainer location project code code param location project relative path file container link i api type container iapitypecontainer code code i api type container iapitypecontainer find api type container findapitypecontainer string location i resource iresource res f project fproject get project getproject find member findmember path location res res get type gettype i resource iresource file archive api type container archiveapitypecontainer res get location getlocation toosstring directory api type container directoryapitypecontainer res get location getlocation toosstring finds returns link i api type container iapitypecontainer source folder code code exist source folder shares output location previous source folder output location shared created param location project relative path source folder link i api type container iapitypecontainer code code i api type container iapitypecontainer get api type container getapitypecontainer string location i api component iapicomponent component core exception coreexception f output location to container foutputlocationtocontainer baseline disposed baselinedisposed get baseline getbaseline i resource iresource res f project fproject get project getproject find member findmember path location res i package fragment root ipackagefragmentroot root f project fproject get package fragment root getpackagefragmentroot res root exists root get kind getkind i package fragment root ipackagefragmentroot binary res get type gettype i resource iresource folder file folder i path ipath location res get location getlocation i api type container iapitypecontainer cfc f output location to container foutputlocationtocontainer location cfc cfc project type container projecttypecontainer component i container icontainer res f output location to container foutputlocationtocontainer location cfc cfc i classpath entry iclasspathentry entry root get raw classpath entry getrawclasspathentry i path ipath output location outputlocation entry get output location getoutputlocation output location outputlocation output location outputlocation f project fproject get output location getoutputlocation i api type container iapitypecontainer cfc f output location to container foutputlocationtocontainer output location outputlocation cfc i path ipath project full path projectfullpath f project fproject get project getproject get full path getfullpath i container icontainer container project full path projectfullpath equals output location outputlocation project output location container f project fproject get project getproject container f project fproject get project getproject get workspace getworkspace get root getroot get folder getfolder output location outputlocation cfc project type container projecttypecontainer component container f output location to container foutputlocationtocontainer output location outputlocation cfc cfc returns java project component java project i java project ijavaproject get java project getjavaproject f project fproject returns cached api type container fragment root code code fragment source fragment method project api description file compilation unit tag scanning resolve signatures param root source fragment root api type container fragment root code code i api type container iapitypecontainer get type container gettypecontainer i package fragment root ipackagefragmentroot root core exception coreexception root get kind getkind i package fragment root ipackagefragmentroot source ensure initialized get api type containers getapitypecontainers i resource iresource resource root get resource getresource resource string location resource get project relative path getprojectrelativepath to string tostring get api type container getapitypecontainer location