copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal core plugin java print writer printwriter org eclipse core runtime core exception coreexception org eclipse osgi service resolver bundle description bundledescription org eclipse osgi service resolver host specification hostspecification org eclipse osgi service resolver version range versionrange org eclipse pde core plugin i fragment ifragment org eclipse pde core plugin i match rules imatchrules org eclipse pde core plugin i plugin extension ipluginextension org eclipse pde core plugin i plugin extension point ipluginextensionpoint org eclipse pde internal core pde state pdestate org dom node fragment plugin base pluginbase i fragment ifragment serialversionuid nls string f plugin id fpluginid nls string f plugin version fpluginversion f match rule fmatchrule i match rules imatchrules f patch fpatch fragment read only readonly read only readonly override string get plugin id getpluginid f plugin id fpluginid override string get plugin version getpluginversion f plugin version fpluginversion override get rule getrule f match rule fmatchrule override has required attributes hasrequiredattributes f plugin id fpluginid f plugin version fpluginversion has required attributes hasrequiredattributes override load bundle description bundledescription bundle description bundledescription pde state pdestate host specification hostspecification host bundle description bundledescription get host gethost f plugin id fpluginid host get name getname version range versionrange version range versionrange host get version range getversionrange version range versionrange f plugin version fpluginversion version range versionrange get minimum getminimum version range versionrange get minimum getminimum to string tostring f match rule fmatchrule plugin base pluginbase get match rule getmatchrule version range versionrange f patch fpatch is patch fragment ispatchfragment bundle description bundledescription get bundle id getbundleid load bundle description bundledescription override load node node string schema version schemaversion nls f plugin id fpluginid get node attribute getnodeattribute node plugin nls f plugin version fpluginversion get node attribute getnodeattribute node plugin version nls string match get node attribute getnodeattribute node match match string table i match rules imatchrules rule table table length match equals ignore case equalsignorecase table f match rule fmatchrule load node schema version schemaversion override reset nls f plugin id fpluginid nls f plugin version fpluginversion f match rule fmatchrule i match rules imatchrules reset override set plugin id setpluginid string new plugin id newpluginid core exception coreexception ensure model editable ensuremodeleditable string old value oldvalue f plugin id fpluginid f plugin id fpluginid new plugin id newpluginid fire property changed firepropertychanged plugin old value oldvalue f plugin id fpluginid override set plugin version setpluginversion string new plugin version newpluginversion core exception coreexception ensure model editable ensuremodeleditable string old value oldvalue f plugin version fpluginversion f plugin version fpluginversion new plugin version newpluginversion fire property changed firepropertychanged plugin version old value oldvalue f plugin version fpluginversion override set rule setrule rule core exception coreexception ensure model editable ensuremodeleditable integer old value oldvalue integer f match rule fmatchrule f match rule fmatchrule rule fire property changed firepropertychanged rule old value oldvalue integer rule override restore property restoreproperty string object old value oldvalue object new value newvalue core exception coreexception equals plugin set plugin id setpluginid new value newvalue new value newvalue to string tostring equals plugin version set plugin version setpluginversion new value newvalue new value newvalue to string tostring equals rule set rule setrule integer new value newvalue int value intvalue restore property restoreproperty old value oldvalue new value newvalue override write string indent print writer printwriter writer nls writer println xml version encoding utf get schema version getschemaversion nls nls writer println eclipse version get schema version getschemaversion nls writer print fragment get id getid writer println nls nls writer print get id getid get name getname writer println nls nls writer print get writable string getwritablestring get name getname get version getversion writer println nls nls writer print version get version getversion get provider name getprovidername writer println nls nls writer print provider get writable string getwritablestring get provider name getprovidername string pid get plugin id getpluginid pid pid length writer println nls nls writer print plugin get plugin id getpluginid string pver get plugin version getpluginversion pver pver length writer println nls nls writer print plugin version get plugin version getpluginversion get rule getrule i match rules imatchrules writer println nls nls writer print match i match rules imatchrules rule table get rule getrule nls writer println writer println nls string first indent firstindent add runtime object children get libraries getlibraries children length nls write children writechildren first indent firstindent runtime children writer writer println add requires children get imports getimports children length nls write children writechildren first indent firstindent requires children writer writer println children get extension points getextensionpoints children length children length i plugin extension point ipluginextensionpoint children write first indent firstindent writer writer println add extensions children get extensions getextensions children length i plugin extension ipluginextension children write first indent firstindent writer nls writer println fragment is patch ispatch f patch fpatch