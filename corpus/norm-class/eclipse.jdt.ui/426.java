copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal preferences formatter java util array list arraylist java util collection java util collections java util hash map hashmap java util iterator java util list java util map java util observable org osgi service prefs backing store exception backingstoreexception org eclipse core runtime preferences default scope defaultscope org eclipse core runtime preferences i eclipse preferences ieclipsepreferences org eclipse core runtime preferences i scope context iscopecontext org eclipse core runtime preferences instance scope instancescope org eclipse core resources i project iproject org eclipse core resources project scope projectscope org eclipse core resources resources plugin resourcesplugin org eclipse jdt internal corext util java model util javamodelutil org eclipse jdt internal corext util messages org eclipse jdt javaui org eclipse jdt internal preferences preferences access preferencesaccess model profiles workbench profile manager profilemanager observable key set keyset list string f keys fkeys string f node name fnodename key set keyset string node name nodename list string f node name fnodename node name nodename f keys fkeys string get node name getnodename f node name fnodename list string get keys getkeys f keys fkeys prefix prepended user defined profile order different iate differentiate built profile nls string prefix represents profile unique map code formatter settings profile comparable profile string get name getname profile rename string profile manager profilemanager manager map string string get settings getsettings set settings setsettings map string string settings get version getversion has equal settings hasequalsettings map string string other map othermap collection string all keys allkeys map string string settings get settings getsettings iterator string iter all keys allkeys iterator iter has next hasnext string key iter object other map othermap key object curr settings key curr equals curr is profile to save isprofiletosave string getid is shared profile issharedprofile is built in profile isbuiltinprofile represents built profile built profile changed instantiation built in profile builtinprofile profile string f name fname string fid map string string f settings fsettings f order forder f current version fcurrentversion string f profile kind fprofilekind built in profile builtinprofile string string map string string settings order current version currentversion string profile kind profilekind f name fname fid f settings fsettings settings f order forder order f current version fcurrentversion current version currentversion f profile kind fprofilekind profile kind profilekind override string get name getname f name fname override profile rename string profile manager profilemanager manager string trimmed trim custom profile customprofile new profile newprofile custom profile customprofile trimmed f settings fsettings f current version fcurrentversion f profile kind fprofilekind manager add profile addprofile new profile newprofile new profile newprofile override map string string get settings getsettings f settings fsettings override set settings setsettings map string string settings override string getid fid override compare to compareto profile built in profile builtinprofile f order forder built in profile builtinprofile f order forder override is profile to save isprofiletosave override is built in profile isbuiltinprofile override get version getversion f current version fcurrentversion represents user defined profile custom profile modified instantiation custom profile customprofile profile string f name fname map string string f settings fsettings profile manager profilemanager f manager fmanager f version fversion string f kind fkind custom profile customprofile string map string string settings version string kind f name fname f settings fsettings settings f version fversion version f kind fkind kind override string get name getname f name fname override profile rename string profile manager profilemanager manager string trimmed trim trimmed equals get name getname remember changing string oldid getid f name fname trimmed manager profile rename d profilerenamed oldid override map string string get settings getsettings f settings fsettings override set settings setsettings map string string settings settings illegal argument exception illegalargumentexception f settings fsettings settings f manager fmanager f manager fmanager profile changed profilechanged override string getid prefix f name fname set manager setmanager profile manager profilemanager profile manager profilemanager f manager fmanager profile manager profilemanager profile manager profilemanager get manager getmanager f manager fmanager override get version getversion f version fversion set version setversion version f version fversion version override compare to compareto profile shared profile sharedprofile custom profile customprofile get name getname compare to ignore case comparetoignorecase get name getname override is profile to save isprofiletosave string get kind getkind f kind fkind shared profile sharedprofile custom profile customprofile shared profile sharedprofile string old name oldname map string string options version string profile kind profilekind old name oldname options version profile kind profilekind override profile rename string profile manager profilemanager manager custom profile customprofile profile custom profile customprofile trim get settings getsettings get version getversion get kind getkind profile set manager setmanager manager manager profile replaced profilereplaced profile profile override string getid shared profile override compare to compareto profile override is profile to save isprofiletosave override is shared profile issharedprofile events observers list ening listening selection changed event profile deleted event profile renamed event profile created event settings changed event key preference selected profile stored string f profile key fprofilekey key preference version current settings stored string f profile version key fprofileversionkey nls string shared profile org eclipse jdt shared map profiles i d s ids map string profile f profiles fprofiles profiles sorted list profile f profiles by name fprofilesbyname selected profile profile f selected fselected options saved profile key set keyset f key sets fkeysets preferences access preferencesaccess f preferences access fpreferencesaccess i profile versioner iprofileversioner f profile versioner fprofileversioner create initialize profile manager param profiles initial custom profiles list type code custom profile customprofile code param profile versioner profileversioner profile manager profilemanager list profile profiles i scope context iscopecontext context preferences access preferencesaccess preferences access preferencesaccess i profile versioner iprofileversioner profile versioner profileversioner key set keyset key sets keysets string profile key profilekey string profile version key profileversionkey f preferences access fpreferencesaccess preferences access preferencesaccess f profile versioner fprofileversioner profile versioner profileversioner f key sets fkeysets key sets keysets f profile key fprofilekey profile key profilekey f profile version key fprofileversionkey profile version key profileversionkey f profiles fprofiles hash map hashmap f profiles by name fprofilesbyname array list arraylist iterator profile iter profiles iterator iter has next hasnext profile profile iter profile custom profile customprofile custom profile customprofile profile set manager setmanager f profiles fprofiles profile getid profile f profiles by name fprofilesbyname add profile collections sort f profiles by name fprofilesbyname string profile id profileid get selected profile id getselectedprofileid f preferences access fpreferencesaccess get instance scope getinstancescope profile profile f profiles fprofiles profile id profileid profile profile get default profile getdefaultprofile f selected fselected profile context get name getname project scope projectscope scope has project specific settings hasprojectspecificsettings context map string string map read from preference store readfrompreferencestore context profile map list string all keys allkeys array list arraylist f key sets fkeysets length all keys allkeys add all addall f key sets fkeysets get keys getkeys collections sort all keys allkeys profile matching string proj profile id projprofileid context get node getnode javaui plugin f profile key fprofilekey proj profile id projprofileid profile curr f profiles fprofiles proj profile id projprofileid curr curr is built in profile isbuiltinprofile curr has equal settings hasequalsettings map all keys allkeys matching curr version iterator profile iter f profiles by name fprofilesbyname iterator iter has next hasnext profile curr iter curr has equal settings hasequalsettings map all keys allkeys matching curr matching string proj profile id projprofileid f profiles fprofiles contains key containskey proj profile id projprofileid messages format formatter messages formattermessages profile manager profilemanager unmanaged profile proj profile id projprofileid substring prefix length formatter messages formattermessages profile manager profilemanager unmanaged profile current settings correspond profile create team profile shared profile sharedprofile shared shared profile sharedprofile map f profile versioner fprofileversioner get current version getcurrentversion f profile versioner fprofileversioner get profile kind getprofilekind shared set manager setmanager f profiles fprofiles shared getid shared add f profiles by name fprofilesbyname add add shared matching shared f selected fselected matching string get selected profile id getselectedprofileid i scope context iscopecontext instance scope instancescope string profile id profileid instance scope instancescope get node getnode javaui plugin f profile key fprofilekey profile id profileid request bug profile id profileid default scope defaultscope instance get node getnode javaui plugin f profile key fprofilekey profile id profileid notify observers message message param message message send selection changed event profile deleted event profile renamed event profile created event settings changed event notify observers notifyobservers message set changed setchanged notify observers notifyobservers integer message has project specific settings hasprojectspecificsettings i scope context iscopecontext context key set keyset key sets keysets key sets keysets length key set keyset key set keyset key sets keysets i eclipse preferences ieclipsepreferences preferences context get node getnode key set keyset get node name getnodename iterator string key iter keyiter key set keyset get keys getkeys iterator key iter keyiter has next hasnext string key key iter keyiter object val preferences key val has project specific settings hasprojectspecificsettings i scope context iscopecontext context has project specific settings hasprojectspecificsettings context f key sets fkeysets read project specific settings find profile matches param context project context map string string read from preference store readfrompreferencestore i scope context iscopecontext context profile workspace profile workspaceprofile map string string profile options profileoptions hash map hashmap i eclipse preferences ieclipsepreferences ui prefs uiprefs context get node getnode javaui plugin version ui prefs uiprefs get int getint f profile version key fprofileversionkey f profile versioner fprofileversioner get first version getfirstversion version f profile versioner fprofileversioner get current version getcurrentversion map string string all options alloptions hash map hashmap f key sets fkeysets length add all addall context get node getnode f key sets fkeysets get node name getnodename all options alloptions nls custom profile customprofile profile custom profile customprofile tmp all options alloptions version f profile versioner fprofileversioner get profile kind getprofilekind f profile versioner fprofileversioner update profile profile get settings getsettings has values hasvalues f key sets fkeysets length key set keyset key set keyset f key sets fkeysets i eclipse preferences ieclipsepreferences preferences context get node getnode key set keyset get node name getnodename iterator string key iter keyiter key set keyset get keys getkeys iterator key iter keyiter has next hasnext string key key iter keyiter string val preferences key val has values hasvalues val workspace profile workspaceprofile get settings getsettings key profile options profileoptions key val has values hasvalues set latest compliance setlatestcompliance profile options profileoptions profile options profileoptions param ui prefs uiprefs param all options alloptions add all addall i eclipse preferences ieclipsepreferences ui prefs uiprefs map string string all options alloptions string ui prefs uiprefs length string key string val ui prefs uiprefs key val all options alloptions key val backing store exception backingstoreexception update preferences updatepreferences i eclipse preferences ieclipsepreferences prefs list string map string string profile options profileoptions has changes haschanges iterator string key iter keyiter iterator key iter keyiter has next hasnext string key key iter keyiter string old val oldval prefs key string val profile options profileoptions key val old val oldval prefs remove key has changes haschanges val equals old val oldval prefs key val has changes haschanges has changes haschanges update formatter settings settings profile param profile profile write preference store write to preference store writetopreferencestore profile profile i scope context iscopecontext context map string string profile options profileoptions profile get settings getsettings f key sets fkeysets length update preferences updatepreferences context get node getnode f key sets fkeysets get node name getnodename f key sets fkeysets get keys getkeys profile options profileoptions i eclipse preferences ieclipsepreferences ui prefs uiprefs context get node getnode javaui plugin ui prefs uiprefs get int getint f profile version key fprofileversionkey f profile versioner fprofileversioner get current version getcurrentversion ui prefs uiprefs put int putint f profile version key fprofileversionkey f profile versioner fprofileversioner get current version getcurrentversion context get name getname instance scope instancescope scope ui prefs uiprefs f profile key fprofilekey profile getid context get name getname project scope projectscope scope profile is shared profile issharedprofile ui prefs uiprefs f profile key fprofilekey profile getid immutable list view profiles sorted alphabetically profiles modified calls sequence guaranteed correspond returned code get sorted names getsortednames code list elements type code profile code get sorted display names getsorteddisplaynames list profile get sorted profiles getsortedprofiles collections unmodifiable list unmodifiablelist f profiles by name fprofilesbyname names profiles stored profile manager sorted alphabetically profiles modified calls sequence guaranteed correspond returned code get sorted profiles getsortedprofiles code names sorted alphabetically get sorted profiles getsortedprofiles string get sorted display names getsorteddisplaynames string sorted names sortednames string f profiles by name fprofilesbyname size iterator profile iter f profiles by name fprofilesbyname iterator iter has next hasnext profile curr iter sorted names sortednames curr get name getname sorted names sortednames profile profile param profile profile code code profile get profile getprofile string f profiles fprofiles activate selected profile update options preferences save profiles disk commit changes commitchanges i scope context iscopecontext scope context scopecontext f selected fselected write to preference store writetopreferencestore f selected fselected scope context scopecontext clear all settings clearallsettings i scope context iscopecontext context f key sets fkeysets length update preferences updatepreferences context get node getnode f key sets fkeysets get node name getnodename f key sets fkeysets get keys getkeys collections string string empty map emptymap i eclipse preferences ieclipsepreferences ui prefs uiprefs context get node getnode javaui plugin ui prefs uiprefs remove f profile key fprofilekey selected profile selected profile profile get selected getselected f selected fselected selected profile profile contained profile manager param profile profile select set selected setselected profile profile profile new selected newselected f profiles fprofiles profile getid new selected newselected new selected newselected equals f selected fselected f selected fselected new selected newselected notify observers notifyobservers selection changed event check user defined profile profile manager param test returns code code profile exists contains name containsname string iterator profile iter f profiles by name fprofilesbyname iterator iter has next hasnext profile curr iter equals curr get name getname add custom profile profile manager param profile profile add add profile addprofile custom profile customprofile profile profile set manager setmanager custom profile customprofile old profile oldprofile custom profile customprofile f profiles fprofiles profile getid old profile oldprofile f profiles fprofiles remove old profile oldprofile getid f profiles by name fprofilesbyname remove old profile oldprofile old profile oldprofile set manager setmanager f profiles fprofiles profile getid profile f profiles by name fprofilesbyname add profile collections sort f profiles by name fprofilesbyname f selected fselected profile notify observers notifyobservers profile created event delete selected profile profile manager profile list selected profile removed delete selected deleteselected f selected fselected custom profile customprofile delete profile deleteprofile custom profile customprofile f selected fselected delete profile deleteprofile custom profile customprofile profile f profiles by name fprofilesbyname index of indexof profile f profiles fprofiles remove profile getid f profiles by name fprofilesbyname remove profile profile set manager setmanager f profiles by name fprofilesbyname size f selected fselected f profiles by name fprofilesbyname profile is shared profile issharedprofile update profiles with name updateprofileswithname profile getid notify observers notifyobservers profile deleted event profile rename d profilerenamed custom profile customprofile profile string oldid f profiles fprofiles remove oldid f profiles fprofiles profile getid profile profile is shared profile issharedprofile update profiles with name updateprofileswithname oldid profile collections sort f profiles by name fprofilesbyname notify observers notifyobservers profile renamed event profile replaced profilereplaced custom profile customprofile old profile oldprofile custom profile customprofile new profile newprofile f profiles fprofiles remove old profile oldprofile getid f profiles fprofiles new profile newprofile getid new profile newprofile f profiles by name fprofilesbyname remove old profile oldprofile f profiles by name fprofilesbyname add new profile newprofile collections sort f profiles by name fprofilesbyname old profile oldprofile is shared profile issharedprofile update profiles with name updateprofileswithname old profile oldprofile getid set selected setselected new profile newprofile notify observers notifyobservers profile created event notify observers notifyobservers selection changed event profile changed profilechanged custom profile customprofile profile profile is shared profile issharedprofile update profiles with name updateprofileswithname profile getid profile notify observers notifyobservers settings changed event update profiles with name updateprofileswithname string old name oldname profile new profile newprofile apply settings applysettings i project iproject projects resources plugin resourcesplugin get workspace getworkspace get root getroot get projects getprojects projects length i scope context iscopecontext project scope projectscope f preferences access fpreferencesaccess get project scope getprojectscope projects i eclipse preferences ieclipsepreferences node project scope projectscope get node getnode javaui plugin string profile id profileid node f profile key fprofilekey old name oldname equals profile id profileid new profile newprofile node remove f profile key fprofilekey apply settings applysettings write to preference store writetopreferencestore new profile newprofile project scope projectscope node f profile key fprofilekey new profile newprofile getid i scope context iscopecontext instance scope instancescope f preferences access fpreferencesaccess get instance scope getinstancescope i eclipse preferences ieclipsepreferences ui prefs uiprefs instance scope instancescope get node getnode javaui plugin new profile newprofile old name oldname equals ui prefs uiprefs f profile key fprofilekey write to preference store writetopreferencestore new profile newprofile instance scope instancescope set latest compliance setlatestcompliance map string string map java model util javamodelutil set compliance options setcomplianceoptions map java model util javamodelutil version latest profile get default profile getdefaultprofile i profile versioner iprofileversioner get profile versioner getprofileversioner f profile versioner fprofileversioner