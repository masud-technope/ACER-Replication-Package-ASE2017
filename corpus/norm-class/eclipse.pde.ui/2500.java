copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal editor feature org eclipse core runtime core exception coreexception org eclipse pde core i model changed event imodelchangedevent org eclipse pde internal core feature feature object featureobject org eclipse pde internal core ifeature org eclipse pde internal pde plugin pdeplugin org eclipse pde internal editor model undo manager modelundomanager org eclipse pde internal editor pde form editor pdeformeditor feature undo manager featureundomanager model undo manager modelundomanager feature undo manager featureundomanager pde form editor pdeformeditor editor editor set undo level limit setundolevellimit override string get page id getpageid object obj obj i feature ifeature obj ifeatureurl feature form page featureformpage obj i feature plugin ifeatureplugin feature reference page featurereferencepage obj i feature import ifeatureimport feature dependencies page featuredependenciespage override execute i model changed event imodelchangedevent event undo object elements event get changed objects getchangedobjects type event get change type getchangetype string property name propertyname event get changed property getchangedproperty i feature model ifeaturemodel model i feature model ifeaturemodel event get change provider getchangeprovider type i model changed event imodelchangedevent insert undo execute remove executeremove model elements execute add executeadd model elements i model changed event imodelchangedevent remove undo execute add executeadd model elements execute remove executeremove model elements i model changed event imodelchangedevent change undo execute change executechange elements property name propertyname event get new value getnewvalue event get old value getoldvalue execute change executechange elements property name propertyname event get old value getoldvalue event get new value getnewvalue execute add executeadd i feature model ifeaturemodel model object elements i feature ifeature feature model get feature getfeature elements length object element elements element i feature plugin ifeatureplugin feature add plugins addplugins i feature plugin ifeatureplugin i feature plugin ifeatureplugin element element i feature import ifeatureimport feature add imports addimports i feature import ifeatureimport i feature import ifeatureimport element element i feature child ifeaturechild feature add included features addincludedfeatures i feature child ifeaturechild i feature child ifeaturechild element core exception coreexception pde plugin pdeplugin log exception logexception execute remove executeremove i feature model ifeaturemodel model object elements i feature ifeature feature model get feature getfeature elements length object element elements element i feature plugin ifeatureplugin feature remove plugins removeplugins i feature plugin ifeatureplugin i feature plugin ifeatureplugin element element i feature import ifeatureimport feature remove imports removeimports i feature import ifeatureimport i feature import ifeatureimport element element i feature child ifeaturechild feature remove included features removeincludedfeatures i feature child ifeaturechild i feature child ifeaturechild element core exception coreexception pde plugin pdeplugin log exception logexception execute change executechange object element string property name propertyname object old value oldvalue object new value newvalue element feature object featureobject feature object featureobject pobj feature object featureobject element pobj restore property restoreproperty property name propertyname old value oldvalue new value newvalue core exception coreexception pde plugin pdeplugin log exception logexception override model changed modelchanged i model changed event imodelchangedevent event event get change type getchangetype i model changed event imodelchangedevent change object obj event get changed objects getchangedobjects obj i feature object ifeatureobject i feature object ifeatureobject fobj i feature object ifeatureobject event get changed objects getchangedobjects ignore events objects model fobj i feature ifeature fobj is in the model isinthemodel model changed modelchanged event