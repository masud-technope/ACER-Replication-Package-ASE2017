copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation kaloyan raev kaloyan raev sap bug i bundle project service ibundleprojectservice set bundle root setbundleroot accept argument org eclipse pde internal core project java java util java util jar jar file jarfile java util zip zip entry zipentry java util zip zip file zipfile org eclipse core resources i project iproject org eclipse core runtime org eclipse osgi service resolver version range versionrange org eclipse osgi util manifest element manifestelement org eclipse osgi util nls org eclipse pde core plugin i plugin model base ipluginmodelbase org eclipse pde core project org eclipse pde core target target bundle targetbundle org eclipse pde internal core pde core pdecore org eclipse pde internal core target messages org eclipse team core scm url import description scmurlimportdescription org eclipse team core team org eclipse team core importing provisional i bundle importer ibundleimporter org osgi framework bundle exception bundleexception org osgi framework version factory creating bundle project descriptions artifacts noinstantiate intended instantiated clients bundle project service bundleprojectservice i bundle project service ibundleprojectservice property key link scm url import description scmurlimportdescription nls string bundle importer bundle importer property key link scm url import description scmurlimportdescription nls string plugin plugin i bundle project service ibundleprojectservice fg default fgdefault returns bundle project service bundle project service i bundle project service ibundleprojectservice get default getdefault fg default fgdefault fg default fgdefault bundle project service bundleprojectservice fg default fgdefault constructs service bundle project service bundleprojectservice returns bundle description project project exist description create bundle project project exist description modify project param project project bundle description project exception core exception coreexception unable create description existing project override i bundle project description ibundleprojectdescription get description getdescription i project iproject project core exception coreexception bundle project description bundleprojectdescription project creates returns host description param symbolic host param range version constraint code code host description override i host description ihostdescription new host newhost string version range versionrange range host desc riptoin hostdescriptoin range creates returns description param fully qualified imported param range version constraint code code param optional optional description override i package import description ipackageimportdescription new package import newpackageimport string version range versionrange range optional package import description packageimportdescription range optional constructs export description param fully qualified param version version code code param api considered api param friends symbolic names bundles friends code code friends api export description override i package export description ipackageexportdescription new package export newpackageexport string version version api string friends package export description packageexportdescription version friends api creates returns required bundle description param symbolic required bundle param range version constraint code code param optional required bundle optional param export required bundle exported required bundle description override i required bundle description irequiredbundledescription new required bundle newrequiredbundle string version range versionrange range optional export required bundle description requiredbundledescription range export optional creates returns bundle classpath entry defining relationship source bin aries binaries library bundle classpath header source folder binary folder defines output folder code code project output folder source folder binary folder source folder source binary library included project archive param source folder sourcefolder source folder code code param binary folder binaryfolder binary folder code code param library entry bundle classpath header code code entry override i bundle classpath entry ibundleclasspathentry new bundle classpath entry newbundleclasspathentry i path ipath source folder sourcefolder i path ipath binary folder binaryfolder i path ipath library bundle classpath specification bundleclasspathspecification source folder sourcefolder binary folder binaryfolder library sets location project root bundle artifacts reside code code bundle root location project folder bundle root folder code meta inf code folder bundle root location modified existing bundle artifacts root moved modified creating bundle project link i bundle project description ibundleprojectdescription set bundle root setbundleroot i path ipath initial bundle root location modify bundle root location existing project method param project project exist open param bundle root bundleroot project relative path bundle root artifacts project code code core exception coreexception setting root fails override set bundle root setbundleroot i project iproject project i path ipath bundle root bundleroot core exception coreexception pde project pdeproject set bundle root setbundleroot project bundle root bundleroot project get folder getfolder bundle root bundleroot org eclipse pde core project i bundle project service ibundleprojectservice get source reference handler getsourcereferencehandler java lang string i bundle importer ibundleimporter get source reference handler getsourcereferencehandler string creates returns map bundle descriptions bundles map link i bundle importer ibundleimporter arrays link scm url import description scmurlimportdescription adds bundle importer property description maps importer created description adds plugin property maps original plug model param models plug models instructions exception core exception coreexception unable read manifest map i bundle importer ibundleimporter scm url import description scmurlimportdescription get import descriptions getimportdescriptions i plugin model base ipluginmodelbase models core exception coreexception build manifests list map string string manifests array list arraylist map string string list i plugin model base ipluginmodelbase plugins array list arraylist i plugin model base ipluginmodelbase models length string location models get install location getinstalllocation location map string string manifest load manifest loadmanifest file location manifest manifests add manifest plugins add models manifests is empty isempty suppress warnings suppresswarnings rawtypes map marray manifests to array toarray map manifests size map i bundle importer ibundleimporter scm url import description scmurlimportdescription result hash map hashmap i bundle importer ibundleimporter scm url import description scmurlimportdescription i bundle importer ibundleimporter import ers importers team get bundle import ers getbundleimporters import ers importers length i bundle importer ibundleimporter importer import ers importers scm url import description scmurlimportdescription descriptions importer validate import validateimport marray list scm url import description scmurlimportdescription desc riptioon list descriptioonlist array list arraylist scm url import description scmurlimportdescription descriptions length scm url import description scmurlimportdescription description descriptions description desc riptioon list descriptioonlist add description description set property setproperty bundle importer importer description set property setproperty plugin plugins desc riptioon list descriptioonlist is empty isempty result importer desc riptioon list descriptioonlist to array toarray scm url import description scmurlimportdescription desc riptioon list descriptioonlist size result collections empty map emptymap parses bunlde manifest dictionary returns map code code bundle jar directory location param bundle location bundlelocation root location bundle bundle manifest dictionary code code core exception coreexception manifest invalid syntax missing map string string load manifest loadmanifest file bundle location bundlelocation core exception coreexception zip file zipfile jar file jarfile input stream inputstream manifest stream manifeststream string extension path bundle location bundlelocation get name getname get file extension getfileextension nls extension extension equals jar bundle location bundlelocation is file isfile jar file jarfile zip file zipfile bundle location bundlelocation zip file zipfile open read zip entry zipentry manifest entry manifestentry jar file jarfile get entry getentry jar file jarfile manifest manifest entry manifestentry manifest stream manifeststream jar file jarfile get input stream getinputstream manifest entry manifestentry file file file bundle location bundlelocation jar file jarfile manifest file exists manifest stream manifeststream file input stream fileinputstream file manifest stream manifeststream manifest element manifestelement parse bundle manifest parsebundlemanifest manifest stream manifeststream hashtable string string bundle exception bundleexception core exception coreexception status i status istatus error pde core pdecore plugin target bundle targetbundle status invalid manifest nls bind messages target bundle targetbundle error reading manifest errorreadingmanifest bundle location bundlelocation get absolute path getabsolutepath io exception ioexception core exception coreexception status i status istatus error pde core pdecore plugin target bundle targetbundle status invalid manifest nls bind messages target bundle targetbundle error reading manifest errorreadingmanifest bundle location bundlelocation get absolute path getabsolutepath close zip file and stream closezipfileandstream manifest stream manifeststream jar file jarfile close zip file and stream closezipfileandstream input stream inputstream stream zip file zipfile jar file jarfile stream stream close io exception ioexception pde core pdecore log jar file jarfile jar file jarfile close io exception ioexception pde core pdecore log