copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal core java file java i o exception ioexception java util javax xml parsers org eclipse osgi service resolver bundle description bundledescription org eclipse osgi util manifest element manifestelement org eclipse pde core plugin org eclipse pde internal core ibundle i bundle model ibundlemodel org eclipse pde internal core ibundle i bundle plugin model base ibundlepluginmodelbase org osgi framework bundle exception bundleexception org osgi framework constants org dom org xml sax helpers default handler defaulthandler stores additional manifest files plugins stores separate xml file accessed pde state pdestate pde auxiliary state pdeauxiliarystate nls string cache extension plugin info plugininfo nls string attr bundle bundleid nls string attr bundle structure is bundle isbundle nls string attr nls string attr exported exported nls string attr extensible api hasextensibleapi nls string attr localization localization nls string attr nls string attr patch patch nls string attr project project nls string attr provider provider nls string attr bundle source bundle source bundlesource nls string element bundle bundle nls string element lib library nls string element root map map string plugin info plugininfo f plugin infos fplugininfos constructor pde auxiliary state pdeauxiliarystate f plugin infos fplugininfos hash map hashmap string plugin info plugininfo constructor plugin info objects stored passed adds param plugin infos initialize pde auxiliary state pdeauxiliarystate pde auxiliary state pdeauxiliarystate f plugin infos fplugininfos hash map hashmap string plugin info plugininfo f plugin infos fplugininfos simple storing auxiliary data plugin plugin info plugininfo string string provider name providername string class name classname hasextensibleapi is patch fragment ispatchfragment has bundle structure hasbundlestructure string libraries string project string localization string bundle source entry bundlesourceentry helper method create plugin info object element plugin info object map param element create plugin info createplugininfo element element plugin info plugininfo info plugin info plugininfo element has attribute hasattribute attr info element get attribute getattribute attr element has attribute hasattribute attr provider info provider name providername element get attribute getattribute attr provider element has attribute hasattribute attr info class name classname element get attribute getattribute attr nls info hasextensibleapi equals element get attribute getattribute attr extensible api nls info is patch fragment ispatchfragment equals element get attribute getattribute attr patch nls info has bundle structure hasbundlestructure equals element get attribute getattribute attr bundle structure element has attribute hasattribute attr project info project element get attribute getattribute attr project element has attribute hasattribute attr localization info localization element get attribute getattribute attr localization element has attribute hasattribute attr bundle source info bundle source entry bundlesourceentry element get attribute getattribute attr bundle source node list nodelist libs element get child nodes getchildnodes array list arraylist string list array list arraylist string libs get length getlength libs get length getlength libs item get node type getnodetype node element node element lib element libs item list add lib get attribute getattribute attr info libraries list to array toarray string list size f plugin infos fplugininfos element get attribute getattribute attr bundle info string get class name getclassname bundleid plugin info plugininfo info f plugin infos fplugininfos to string tostring bundleid info info class name classname hasextensibleapi bundleid plugin info plugininfo info f plugin infos fplugininfos to string tostring bundleid info info hasextensibleapi is patch fragment ispatchfragment bundleid plugin info plugininfo info f plugin infos fplugininfos to string tostring bundleid info info is patch fragment ispatchfragment has bundle structure hasbundlestructure bundleid plugin info plugininfo info f plugin infos fplugininfos to string tostring bundleid info info has bundle structure hasbundlestructure string get plugin name getpluginname bundleid plugin info plugininfo info f plugin infos fplugininfos to string tostring bundleid info info string get provider name getprovidername bundleid plugin info plugininfo info f plugin infos fplugininfos to string tostring bundleid info info provider name providername string get library names getlibrarynames bundleid plugin info plugininfo info f plugin infos fplugininfos to string tostring bundleid info string info libraries string get bundle localization getbundlelocalization bundleid plugin info plugininfo info f plugin infos fplugininfos to string tostring bundleid info info localization string get project getproject bundleid plugin info plugininfo info f plugin infos fplugininfos to string tostring bundleid info info project string get bundle source entry getbundlesourceentry bundleid plugin info plugininfo info f plugin infos fplugininfos to string tostring bundleid info info bundle source entry bundlesourceentry builds xml document storing auxiliary plugin info param dir directory location create file save plugin info saveplugininfo file dir document builder factory documentbuilderfactory factory document builder factory documentbuilderfactory new instance newinstance document doc factory new document builder newdocumentbuilder new document newdocument element root doc create element createelement element root iterator string iter f plugin infos fplugininfos key set keyset iterator iter has next hasnext string key iter to string tostring element element doc create element createelement element bundle element set attribute setattribute attr bundle key plugin info plugininfo info f plugin infos fplugininfos key info class name classname element set attribute setattribute attr info class name classname info provider name providername element set attribute setattribute attr provider info provider name providername info element set attribute setattribute attr info info hasextensibleapi nls element set attribute setattribute nls attr extensible api nls info is patch fragment ispatchfragment nls element set attribute setattribute nls attr patch nls info has bundle structure hasbundlestructure nls element set attribute setattribute nls attr bundle structure nls info localization element set attribute setattribute attr localization info localization info bundle source entry bundlesourceentry element set attribute setattribute attr bundle source info bundle source entry bundlesourceentry info libraries info libraries length element lib doc create element createelement element lib lib set attribute setattribute attr info libraries element append child appendchild lib root append child appendchild element doc append child appendchild root xml print handler xmlprinthandler write file writefile doc file dir cache extension exception pde core pdecore log loads plugin info objects plugin info plugininfo xml file stored directory param dir location plugin info plugininfo file file read read plugin info cache readplugininfocache file dir file file file dir cache extension file exists file is file isfile document builder factory documentbuilderfactory factory document builder factory documentbuilderfactory new instance newinstance document builder documentbuilder document builder documentbuilder factory new document builder newdocumentbuilder document builder documentbuilder set error handler seterrorhandler default handler defaulthandler document doc document builder documentbuilder parse file element root doc get document element getdocumentelement root node list nodelist list root get child nodes getchildnodes list get length getlength list item get node type getnodetype node element node create plugin info createplugininfo element list item org xml sax sax exception saxexception pde core pdecore log i o exception ioexception pde core pdecore log parser configuration exception parserconfigurationexception pde core pdecore log returns auxiliary exists directory param dir parent directory file exist exists file dir file file file dir cache extension file exists file is file isfile writes auxiliary models xml file destination directory param models models collect param destination directory create xml file write plugin info writeplugininfo i plugin model base ipluginmodelbase models file destination document builder documentbuilder builder document builder factory documentbuilderfactory new instance newinstance new document builder newdocumentbuilder document doc builder new document newdocument element root doc create element createelement element root doc append child appendchild root models length i plugin base ipluginbase plugin models get plugin base getpluginbase bundle description bundledescription desc models get bundle description getbundledescription desc element element doc create element createelement element bundle element set attribute setattribute attr bundle to string tostring desc get bundle i d getbundleid element set attribute setattribute attr project models get underlying resource getunderlyingresource get project getproject get name getname plugin i plugin iplugin i plugin iplugin plugin get class name getclassname element set attribute setattribute attr i plugin iplugin plugin get class name getclassname plugin get provider name getprovidername element set attribute setattribute attr provider plugin get provider name getprovidername plugin get name getname element set attribute setattribute attr plugin get name getname classpath util core classpathutilcore hasextensibleapi models nls element set attribute setattribute nls attr extensible api nls classpath util core classpathutilcore is patch fragment ispatchfragment models nls element set attribute setattribute nls attr patch nls models i bundle plugin model base ibundlepluginmodelbase nls element set attribute setattribute nls attr bundle structure nls models i bundle plugin model base ibundlepluginmodelbase string localization i bundle plugin model base ibundlepluginmodelbase models get bundle localization getbundlelocalization localization element set attribute setattribute attr localization localization models i bundle plugin model base ibundlepluginmodelbase i bundle model ibundlemodel bundle model bundlemodel i bundle plugin model base ibundlepluginmodelbase models get bundle model getbundlemodel bundle model bundlemodel string bundle source entry bundlesourceentry bundle model bundlemodel get bundle getbundle get header getheader i core constants icoreconstants eclipse source bundle bundle source entry bundlesourceentry element set attribute setattribute attr bundle source bundle source entry bundlesourceentry i plugin library ipluginlibrary libraries plugin get libraries getlibraries libraries length element lib doc create element createelement element lib lib set attribute setattribute attr libraries get name getname libraries is exported isexported nls lib set attribute setattribute nls attr exported nls element append child appendchild lib root append child appendchild element xml print handler xmlprinthandler write file writefile doc file destination cache extension parser configuration exception parserconfigurationexception factory configuration error factoryconfigurationerror i o exception ioexception collects auxiliary manifest stores param desc bundle description manifest param manifest dictionary headers bundle manifest file param has bundle structure hasbundlestructure plugin bundle structure add auxiliary data addauxiliarydata bundle description bundledescription desc map string string manifest has bundle structure hasbundlestructure plugin info plugininfo info plugin info plugininfo info manifest constants bundle info provider name providername manifest constants bundle vendor string class name classname manifest i core constants icoreconstants plugin info class name classname class name classname class name classname string manifest constants bundle activator info libraries get classpath getclasspath manifest nls info hasextensibleapi equals manifest i core constants icoreconstants extensible api nls info is patch fragment ispatchfragment equals manifest i core constants icoreconstants patch fragment info localization manifest constants bundle localization info has bundle structure hasbundlestructure has bundle structure hasbundlestructure info bundle source entry bundlesourceentry manifest i core constants icoreconstants eclipse source bundle f plugin infos fplugininfos to string tostring desc get bundle i d getbundleid info retrieves classpath entries manifest dictionary param manifest dictionary manifest headers string array classpath entries string get classpath getclasspath map string string manifest string full classpath fullclasspath manifest constants bundle classpath string result string full classpath fullclasspath manifest element manifestelement classpath entries classpathentries manifest element manifestelement parse header parseheader constants bundle classpath full classpath fullclasspath result string classpath entries classpathentries length classpath entries classpathentries length result classpath entries classpathentries get value getvalue bundle exception bundleexception result clears plugin info object map clear f plugin infos fplugininfos clear