copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation simon scholz simon scholz vogella bug org eclipse pde internal core feature java print writer printwriter java util org eclipse core runtime core exception coreexception org eclipse osgi service resolver org eclipse pde core i model changed event imodelchangedevent org eclipse pde core plugin org eclipse pde internal core i core constants icoreconstants org eclipse pde internal core ifeature org eclipse pde internal core plugin plugin base pluginbase org eclipse pde internal core util version util versionutil org dom node org dom node list nodelist feature version able object versionableobject i feature ifeature serialversionuid nls string indent string f provider name fprovidername ifeatureurl f url furl i feature info ifeatureinfo f infos finfos i feature info ifeatureinfo vector i feature data ifeaturedata f data fdata vector i feature data ifeaturedata vector i feature child ifeaturechild f children fchildren vector i feature child ifeaturechild vector i feature plugin ifeatureplugin f plugins fplugins vector i feature plugin ifeatureplugin vector i feature import ifeatureimport f imports fimports vector i feature import ifeatureimport string f os fos string f ws fws string f nl fnl string f arch farch string f image name fimagename i feature install handler ifeatureinstallhandler f handler fhandler f primary fprimary f exclusive fexclusive string f colocation affinity fcolocationaffinity string f application fapplication string f plugin fplugin f valid fvalid string f copyright fcopyright string f license feature d flicensefeatureid string f license feature version flicensefeatureversion override add plugins addplugins i feature plugin ifeatureplugin new plugins newplugins core exception coreexception ensure model editable ensuremodeleditable new plugins newplugins length f plugins fplugins add new plugins newplugins feature plugin featureplugin new plugins newplugins set in the model setinthemodel fire structure changed firestructurechanged new plugins newplugins i model changed event imodelchangedevent insert override add data adddata i feature data ifeaturedata new data newdata core exception coreexception ensure model editable ensuremodeleditable new data newdata length f data fdata add new data newdata feature data featuredata new data newdata set in the model setinthemodel fire structure changed firestructurechanged new data newdata i model changed event imodelchangedevent insert override add included features addincludedfeatures i feature child ifeaturechild features core exception coreexception ensure model editable ensuremodeleditable features length f children fchildren add features feature child featurechild features set in the model setinthemodel fire structure changed firestructurechanged features i model changed event imodelchangedevent insert override add imports addimports i feature import ifeatureimport iimports core exception coreexception ensure model editable ensuremodeleditable iimports length f imports fimports add iimports feature import featureimport iimports set in the model setinthemodel fire structure changed firestructurechanged iimports i model changed event imodelchangedevent insert override i feature plugin ifeatureplugin get plugins getplugins i feature plugin ifeatureplugin result i feature plugin ifeatureplugin f plugins fplugins size f plugins fplugins copy into copyinto result result override i feature data ifeaturedata get data getdata i feature data ifeaturedata result i feature data ifeaturedata f data fdata size f data fdata copy into copyinto result result override i feature child ifeaturechild get included features getincludedfeatures i feature child ifeaturechild result i feature child ifeaturechild f children fchildren size f children fchildren copy into copyinto result result override i feature import ifeatureimport get imports getimports i feature import ifeatureimport result i feature import ifeatureimport f imports fimports size f imports fimports copy into copyinto result result override string get provider name getprovidername f provider name fprovidername override set license feature d setlicensefeatureid string featureid f license feature d flicensefeatureid featureid override string get license feature d getlicensefeatureid f license feature d flicensefeatureid nls f license feature d flicensefeatureid f license feature d flicensefeatureid override set license feature version setlicensefeatureversion string version f license feature version flicensefeatureversion version override string get license feature version getlicensefeatureversion f license feature version flicensefeatureversion nls f license feature version flicensefeatureversion f license feature version flicensefeatureversion override string get plugin getplugin f plugin fplugin override i plugin model base ipluginmodelbase get reference d model getreferencedmodel i feature plugin ifeatureplugin reference i plugin model base ipluginmodelbase model plugin registry pluginregistry find model findmodel reference get id getid model model is enabled isenabled model override ifeatureurl geturl f url furl override i feature install handler ifeatureinstallhandler get install handler getinstallhandler f handler fhandler override i feature info ifeatureinfo get feature info getfeatureinfo info type infotype info type infotype info type infotype f infos finfos length f infos finfos info type infotype override is primary isprimary f primary fprimary override is exclusive isexclusive f exclusive fexclusive override parse node node parse node nls f provider name fprovidername get node attribute getnodeattribute node provider nls f license feature d flicensefeatureid get node attribute getnodeattribute node license feature nls f license feature version flicensefeatureversion get node attribute getnodeattribute node license feature version nls f plugin fplugin get node attribute getnodeattribute node plugin nls f os fos get node attribute getnodeattribute node nls f ws fws get node attribute getnodeattribute node nls f nl fnl get node attribute getnodeattribute node nls f arch farch get node attribute getnodeattribute node arch nls f image name fimagename get node attribute getnodeattribute node image nls f colocation affinity fcolocationaffinity get node attribute getnodeattribute node colocation affinity nls f application fapplication get node attribute getnodeattribute node application nls f primary fprimary get boolean attribute getbooleanattribute node primary nls f exclusive fexclusive get boolean attribute getbooleanattribute node exclusive node list nodelist children node get child nodes getchildnodes f valid fvalid children get length getlength node child children item child get node type getnodetype node element node string tag child get node name getnodename to lower case tolowercase locale english nls tag equals description i feature info ifeatureinfo info get model getmodel get factory getfactory create info createinfo i feature ifeature info description feature info featureinfo info set in the model setinthemodel feature info featureinfo info parse child f infos finfos i feature ifeature info description info nls tag equals license i feature info ifeatureinfo info get model getmodel get factory getfactory create info createinfo i feature ifeature info license feature info featureinfo info set in the model setinthemodel feature info featureinfo info parse child f infos finfos i feature ifeature info license info nls tag equals copyright i feature info ifeatureinfo info get model getmodel get factory getfactory create info createinfo i feature ifeature info copyright feature info featureinfo info set in the model setinthemodel feature info featureinfo info parse child f infos finfos i feature ifeature info copyright info nls tag equals url f url furl f url furl get model getmodel get factory getfactory createurl featureurl f url furl set in the model setinthemodel featureurl f url furl parse child nls tag equals requires parse requires parserequires child nls tag equals install handler i feature install handler ifeatureinstallhandler handler get model getmodel get factory getfactory create install handler createinstallhandler feature install handler featureinstallhandler handler parse child feature install handler featureinstallhandler handler set in the model setinthemodel f handler fhandler handler nls tag equals plugin i feature plugin ifeatureplugin plugin get model getmodel get factory getfactory create plugin createplugin feature plugin featureplugin plugin parse child feature plugin featureplugin plugin set in the model setinthemodel f plugins fplugins add plugin nls tag equals data i feature data ifeaturedata new data newdata get model getmodel get factory getfactory create data createdata feature data featuredata new data newdata parse child feature data featuredata new data newdata set in the model setinthemodel f data fdata add new data newdata nls tag equals includes i feature child ifeaturechild new child newchild get model getmodel get factory getfactory create child createchild feature child featurechild new child newchild parse child feature child featurechild new child newchild set in the model setinthemodel f children fchildren add new child newchild f valid fvalid has required attributes hasrequiredattributes parse requires parserequires node node node list nodelist children node get child nodes getchildnodes children get length getlength node child children item child get node type getnodetype node element node nls child get node name getnodename equals ignore case equalsignorecase i feature import ifeatureimport iimport get model getmodel get factory getfactory create import createimport feature import featureimport iimport parse child feature import featureimport iimport set in the model setinthemodel f imports fimports add iimport override compute imports computeimports core exception coreexception existing imports valid preserved vector i feature import ifeatureimport preserved imports preservedimports vector i feature import ifeatureimport f imports fimports size imports array list arraylist i feature import ifeatureimport new imports newimports array list arraylist i feature import ifeatureimport i plugin model base ipluginmodelbase model f plugins fplugins size i feature plugin ifeatureplugin f plugins fplugins model entry modelentry entry plugin registry pluginregistry find entry findentry get id getid entry i plugin model base ipluginmodelbase models entry get active models getactivemodels models length i plugin model base ipluginmodelbase models get version getversion equals get plugin base getpluginbase get version getversion get version getversion equals i core constants icoreconstants version model model add plugin imports addpluginimports preserved imports preservedimports new imports newimports model get plugin base getpluginbase model is fragment model isfragmentmodel bundle description bundledescription desc model get bundle description getbundledescription desc host specification hostspecification host spec hostspec desc get host gethost string host spec hostspec get name getname string version match i match rules imatchrules version range versionrange version range versionrange host spec hostspec get version range getversionrange version range versionrange version range versionrange empty range emptyrange equals version range versionrange version version range versionrange get minimum getminimum version range versionrange get minimum getminimum to string tostring match plugin base pluginbase get match rule getmatchrule version range versionrange add new dependency addnewdependency version match preserved imports preservedimports new imports newimports preserve imports features f imports fimports size i feature import ifeatureimport iimport f imports fimports iimport get type gettype i feature import ifeatureimport feature preserved imports preservedimports add iimport removed preserved suppress warnings suppresswarnings unchecked vector i feature import ifeatureimport removed imports removedimports vector i feature import ifeatureimport f imports fimports clone removed imports removedimports remove all removeall preserved imports preservedimports perform remove f imports fimports preserved imports preservedimports removed imports removedimports size fire structure changed firestructurechanged removed imports removedimports to array toarray i feature import ifeatureimport removed imports removedimports size i model changed event imodelchangedevent remove perform add new imports newimports size f imports fimports add all addall new imports newimports fire structure changed firestructurechanged new imports newimports to array toarray i feature import ifeatureimport new imports newimports size i model changed event imodelchangedevent insert creates i feature imports ifeatureimports based i plugin imports ipluginimports ensures duplicates preserved imports preservedimports new imports newimports param preserved imports preservedimports valid existing imports param new imports newimports imports param plugin core exception coreexception add plugin imports addpluginimports list i feature import ifeatureimport preserved imports preservedimports list i feature import ifeatureimport new imports newimports i plugin base ipluginbase plugin core exception coreexception i plugin import ipluginimport plugin imports pluginimports plugin get imports getimports plugin imports pluginimports length i plugin import ipluginimport plugin import pluginimport plugin imports pluginimports plugin import pluginimport is optional isoptional string plugin import pluginimport get id getid string version plugin import pluginimport get version getversion match plugin import pluginimport get match getmatch add new dependency addnewdependency version match preserved imports preservedimports new imports newimports add new dependency addnewdependency string string version match list i feature import ifeatureimport preserved imports preservedimports list i feature import ifeatureimport new imports newimports core exception coreexception find feature plugin findfeatureplugin version match don add imports local plug ins find import findimport preserved imports preservedimports version match find import findimport new imports newimports version match i feature import ifeatureimport iimport find import findimport f imports fimports version match iimport valid preserved imports preservedimports add iimport needed iimport get model getmodel get factory getfactory create import createimport iimport set id setid iimport set version setversion version iimport set match setmatch match feature import featureimport iimport set in the model setinthemodel new imports newimports add iimport finds list param imports list imports param param version param match i feature import ifeatureimport i feature import ifeatureimport find import findimport list i feature import ifeatureimport imports string string version match imports size i feature import ifeatureimport iimport imports iimport get id getid equals version iimport version equals iimport get version getversion match iimport get match getmatch iimport i feature plugin ifeatureplugin find feature plugin findfeatureplugin string string version match f plugins fplugins size i feature plugin ifeatureplugin f plugins fplugins string pid get id getid string pversion get version getversion version util versionutil compare pid pversion version match override remove plugins removeplugins i feature plugin ifeatureplugin removed core exception coreexception ensure model editable ensuremodeleditable removed length f plugins fplugins remove removed feature plugin featureplugin removed set in the model setinthemodel fire structure changed firestructurechanged removed i model changed event imodelchangedevent remove override remove data removedata i feature data ifeaturedata removed core exception coreexception ensure model editable ensuremodeleditable removed length f data fdata remove removed feature data featuredata removed set in the model setinthemodel fire structure changed firestructurechanged removed i model changed event imodelchangedevent remove override remove included features removeincludedfeatures i feature child ifeaturechild features core exception coreexception ensure model editable ensuremodeleditable features length f children fchildren remove features feature child featurechild features set in the model setinthemodel fire structure changed firestructurechanged features i model changed event imodelchangedevent remove override remove imports removeimports i feature import ifeatureimport iimports core exception coreexception ensure model editable ensuremodeleditable iimports length f imports fimports remove iimports feature import featureimport iimports set in the model setinthemodel fire structure changed firestructurechanged iimports i model changed event imodelchangedevent remove override string getos f os fos override string getws f ws fws override string getnl f nl fnl override string get arch getarch f arch farch override string get colocation affinity getcolocationaffinity f colocation affinity fcolocationaffinity override string get application getapplication f application fapplication override setos string core exception coreexception ensure model editable ensuremodeleditable object old value oldvalue f os fos f os fos fire property changed firepropertychanged old value oldvalue override setws string core exception coreexception ensure model editable ensuremodeleditable object old value oldvalue f ws fws f ws fws fire property changed firepropertychanged old value oldvalue override setnl string core exception coreexception ensure model editable ensuremodeleditable object old value oldvalue f nl fnl f nl fnl fire property changed firepropertychanged old value oldvalue override set arch setarch string arch core exception coreexception ensure model editable ensuremodeleditable object old value oldvalue f arch farch f arch farch arch fire property changed firepropertychanged arch old value oldvalue arch override set primary setprimary new value newvalue core exception coreexception f primary fprimary new value newvalue ensure model editable ensuremodeleditable old value oldvalue f primary fprimary f primary fprimary new value newvalue fire property changed firepropertychanged primary old value oldvalue new value newvalue override set exclusive setexclusive new value newvalue core exception coreexception f exclusive fexclusive new value newvalue ensure model editable ensuremodeleditable old value oldvalue f exclusive fexclusive f exclusive fexclusive new value newvalue fire property changed firepropertychanged exclusive old value oldvalue new value newvalue override set colocation affinity setcolocationaffinity string new value newvalue core exception coreexception ensure model editable ensuremodeleditable object old value oldvalue f colocation affinity fcolocationaffinity f colocation affinity fcolocationaffinity new value newvalue fire property changed firepropertychanged collocation affinity old value oldvalue new value newvalue override set application setapplication string new value newvalue core exception coreexception ensure model editable ensuremodeleditable object old value oldvalue f application fapplication f application fapplication new value newvalue fire property changed firepropertychanged application old value oldvalue new value newvalue override set provider name setprovidername string provider name providername core exception coreexception ensure model editable ensuremodeleditable object old value oldvalue f provider name fprovidername f provider name fprovidername provider name providername fire property changed firepropertychanged provider old value oldvalue provider name providername override set plugin setplugin string plugin core exception coreexception ensure model editable ensuremodeleditable object old value oldvalue f plugin fplugin f plugin fplugin plugin fire property changed firepropertychanged plugin old value oldvalue plugin override seturl ifeatureurl url core exception coreexception ensure model editable ensuremodeleditable object old value oldvalue f url furl f url furl featureurl f url furl set in the model setinthemodel f url furl url fire property changed firepropertychanged url old value oldvalue url override set install handler setinstallhandler i feature install handler ifeatureinstallhandler handler core exception coreexception ensure model editable ensuremodeleditable object old value oldvalue f handler fhandler f handler fhandler feature install handler featureinstallhandler f handler fhandler set in the model setinthemodel f handler fhandler handler fire property changed firepropertychanged install handler old value oldvalue handler override set feature info setfeatureinfo i feature info ifeatureinfo info core exception coreexception ensure model editable ensuremodeleditable object old value oldvalue f infos finfos old value oldvalue feature info featureinfo old value oldvalue set in the model setinthemodel f infos finfos info string property info description property description info license property license info copyright property copyright fire property changed firepropertychanged property old value oldvalue info sets image name imagename param image name imagename image name imagename override set image name setimagename string image name imagename core exception coreexception ensure model editable ensuremodeleditable object old value oldvalue f image name fimagename f image name fimagename image name imagename fire property changed firepropertychanged image old value oldvalue image name imagename override restore property restoreproperty string object old value oldvalue object new value newvalue core exception coreexception equals setos string new value newvalue equals setws string new value newvalue equals setnl string new value newvalue equals arch set arch setarch string new value newvalue equals collocation affinity set colocation affinity setcolocationaffinity string new value newvalue equals application set application setapplication string new value newvalue equals primary set primary setprimary new value newvalue new value newvalue boolean value booleanvalue equals exclusive set exclusive setexclusive new value newvalue new value newvalue boolean value booleanvalue equals provider set provider name setprovidername string new value newvalue equals plugin set plugin setplugin string new value newvalue equals url seturl ifeatureurl new value newvalue equals install handler set install handler setinstallhandler i feature install handler ifeatureinstallhandler new value newvalue equals description set feature info setfeatureinfo i feature info ifeatureinfo new value newvalue info description equals license set feature info setfeatureinfo i feature info ifeatureinfo new value newvalue info license equals copyright set feature info setfeatureinfo i feature info ifeatureinfo new value newvalue info copyright equals image set image name setimagename string new value newvalue restore property restoreproperty old value oldvalue new value newvalue override reset reset f data fdata clear f plugins fplugins clear f imports fimports clear f children fchildren clear f url furl f provider name fprovidername f plugin fplugin f os fos f ws fws f nl fnl f arch farch f infos finfos f infos finfos f infos finfos f primary fprimary f exclusive fexclusive f colocation affinity fcolocationaffinity f application fapplication f valid fvalid override is valid isvalid f valid fvalid has required attributes hasrequiredattributes defined version f children fchildren size i feature child ifeaturechild child f children fchildren element at elementat child get id getid child get version getversion f plugins fplugins size i feature plugin ifeatureplugin plugin f plugins fplugins element at elementat plugin get id getid plugin get version getversion f data fdata size i feature data ifeaturedata entry f data fdata element at elementat entry get id getid f imports fimports size i feature import ifeatureimport iimport f imports fimports element at elementat iimport get id getid override write string indent print writer printwriter writer f copyright fcopyright nls nls writer println f copyright fcopyright nls writer print indent feature string indent indent indent string indenta indent indent indent nls write if defined writeifdefined indenta writer get id getid nls write if defined writeifdefined indenta writer label get writable string getwritablestring get label getlabel nls write if defined writeifdefined indenta writer version get version getversion write if defined writeifdefined nls indenta nls writer nls provider get writable string getwritablestring f provider name fprovidername write if defined writeifdefined nls indenta nls writer nls plugin get plugin getplugin nls write if defined writeifdefined indenta writer f os fos nls write if defined writeifdefined indenta writer f ws fws nls write if defined writeifdefined indenta writer f nl fnl nls write if defined writeifdefined indenta writer arch f arch farch f image name fimagename nls write if defined writeifdefined indenta writer image get writable string getwritablestring f image name fimagename is primary isprimary writer println nls writer print indenta primary get license feature d getlicensefeatureid length writer println nls nls writer print indenta license feature get license feature d getlicensefeatureid get license feature version getlicensefeatureversion length writer println nls nls writer print indenta license feature version get license feature version getlicensefeatureversion is exclusive isexclusive writer println nls writer print indenta exclusive nls write if defined writeifdefined indenta writer colocation affinity f colocation affinity fcolocationaffinity nls write if defined writeifdefined indenta writer application f application fapplication nls writer println f handler fhandler f handler fhandler write indent writer i feature info ifeatureinfo info f infos finfos info info is empty isempty info write indent writer f url furl f url furl write indent writer f children fchildren size i feature child ifeaturechild child f children fchildren element at elementat writer println child write indent writer f imports fimports size writer println nls writer println indent requires f imports fimports size i feature import ifeatureimport iimport f imports fimports iimport write indenta writer nls writer println indent requires f plugins fplugins size i feature plugin ifeatureplugin plugin f plugins fplugins element at elementat writer println plugin write indent writer f data fdata size i feature data ifeaturedata entry f data fdata element at elementat writer println entry write indent writer writer println nls writer println indent feature write if defined writeifdefined string indent print writer printwriter writer string att name attname string att value attvalue att value attvalue att value attvalue trim length writer println nls nls writer print indent att name attname att value attvalue image name imagename returns string override string get image name getimagename f image name fimagename string get copyright getcopyright f copyright fcopyright set copyright setcopyright string copyright f copyright fcopyright copyright override swap i feature child ifeaturechild feature i feature child ifeaturechild feature f children fchildren index of indexof feature f children fchildren index of indexof feature f children fchildren feature f children fchildren feature fire structure changed firestructurechanged feature i model changed event imodelchangedevent change override string to string tostring nls nls get id getid get version getversion