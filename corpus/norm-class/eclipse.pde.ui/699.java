copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation johannes ahlers johannes ahlers gmx bug org eclipse pde internal wizards imports java file java lang reflect invocation target exception invocationtargetexception java util list org eclipse core resources org eclipse core runtime org eclipse jdt core org eclipse osgi util nls org eclipse pde core build i build entry ibuildentry org eclipse pde internal core pde core pdecore org eclipse pde internal core build workspace build model workspacebuildmodel org eclipse pde internal core ifeature org eclipse pde internal core natures pde org eclipse pde internal core project pde project pdeproject org eclipse pde internal pde plugin pdeplugin org eclipse pde internal pde ui messages pdeuimessages org eclipse team core repository provider repositoryprovider org eclipse team core team exception teamexception org eclipse dialogs i overwrite query ioverwritequery org eclipse wizards data transfer datatransfer feature import operation featureimportoperation i workspace runnable iworkspacerunnable i replace query ireplacequery codes cancel callback returns cancel do query doquery i project iproject project i feature model ifeaturemodel f models fmodels f binary fbinary i path ipath f target path ftargetpath i workspace root iworkspaceroot f root froot i replace query ireplacequery f replace query freplacequery param models param target path targetpath parent external project param replace query replacequery feature import operation featureimportoperation i feature model ifeaturemodel models binary i path ipath target path targetpath i replace query ireplacequery replace query replacequery f models fmodels models f binary fbinary binary f target path ftargetpath target path targetpath f root froot resources plugin resourcesplugin get workspace getworkspace get root getroot f replace query freplacequery replace query replacequery i workspace runnable iworkspacerunnable i progress monitor iprogressmonitor override i progress monitor iprogressmonitor monitor core exception coreexception operation canceled exception operationcanceledexception sub monitor submonitor sub monitor submonitor sub monitor submonitor convert monitor pde ui messages pdeuimessages feature import wizard featureimportwizard operation creating f models fmodels length multi status multistatus multi status multistatus multi status multistatus pde plugin pdeplugin get plugin id getpluginid i status istatus pde ui messages pdeuimessages feature import wizard featureimportwizard operation multi problem multiproblem f models fmodels length create project createproject f models fmodels sub monitor submonitor split core exception coreexception multi status multistatus merge get status getstatus sub monitor submonitor is canceled iscanceled operation canceled exception operationcanceledexception multi status multistatus isok core exception coreexception multi status multistatus create project createproject i feature model ifeaturemodel model i progress monitor iprogressmonitor monitor core exception coreexception string model get feature getfeature get id getid i feature plugin ifeatureplugin plugins model get feature getfeature get plugins getplugins plugins length equals plugins get id getid nls nls feature sub monitor submonitor sub monitor submonitor sub monitor submonitor convert monitor nls bind pde ui messages pdeuimessages feature import wizard featureimportwizard operation creating i project iproject project f root froot get project getproject project exists file project get parent getparent get location getlocation to file tofile exists query replace queryreplace project project exists project create sub monitor submonitor split project delete sub monitor submonitor split repository provider repositoryprovider unmap project team exception teamexception sub monitor submonitor set work remaining setworkremaining i project description iprojectdescription description pde plugin pdeplugin get workspace getworkspace new project description newprojectdescription f target path ftargetpath description set location setlocation f target path ftargetpath append project create description sub monitor submonitor split project is open isopen project open file feature dir featuredir file model get install location getinstalllocation import content importcontent feature dir featuredir project get full path getfullpath file system structure provider filesystemstructureprovider instance sub monitor submonitor split nls i folder ifolder folder project get folder getfolder meta inf folder exists folder delete f binary fbinary mark project image overlay label decorator project set persistent property setpersistentproperty pde core pdecore external project property pde core pdecore binary project create build properties createbuildproperties project set project natures setprojectnatures project model sub monitor submonitor split project has nature hasnature java core javacore nature set classpath setclasspath project model sub monitor submonitor split import content importcontent object source i path ipath dest path destpath i import structure provider iimportstructureprovider provider list files to import filestoimport i progress monitor iprogressmonitor monitor core exception coreexception i overwrite query ioverwritequery query i overwrite query ioverwritequery override string query overwrite queryoverwrite string file import operation importoperation import operation importoperation dest path destpath source provider query set create container structure setcreatecontainerstructure files to import filestoimport set files to import setfilestoimport files to import filestoimport monitor invocation target exception invocationtargetexception throwable get target exception gettargetexception core exception coreexception core exception coreexception i status istatus status status i status istatus error pde plugin pdeplugin get plugin id getpluginid i status istatus error get message getmessage core exception coreexception status interrupted exception interruptedexception operation canceled exception operationcanceledexception get message getmessage query replace queryreplace i project iproject project operation canceled exception operationcanceledexception f replace query freplacequery do query doquery project i replace query ireplacequery cancel operation canceled exception operationcanceledexception i replace query ireplacequery set project natures setprojectnatures i project iproject project i feature model ifeaturemodel model sub monitor submonitor sub monitor submonitor core exception coreexception i project description iprojectdescription desc project get description getdescription needs java nature needsjavanature model desc set nature ids setnatureids string java core javacore nature pde feature nature desc set nature ids setnatureids string pde feature nature sub monitor submonitor set work remaining setworkremaining project set description setdescription desc sub monitor submonitor split set classpath setclasspath i project iproject project i feature model ifeaturemodel model i progress monitor iprogressmonitor monitor java model exception javamodelexception sub monitor submonitor sub monitor submonitor sub monitor submonitor convert monitor i java project ijavaproject j project jproject java core javacore create project nls i classpath entry iclasspathentry jrecpentry java core javacore new container entry newcontainerentry path org eclipse jdt launching jre container string lib name libname model get feature getfeature get install handler getinstallhandler get library getlibrary i classpath entry iclasspathentry handlercpentry java core javacore new library entry newlibraryentry project get full path getfullpath append lib name libname j project jproject set raw classpath setrawclasspath i classpath entry iclasspathentry jrecpentry handlercpentry sub monitor submonitor needs java nature needsjavanature i feature model ifeaturemodel model i feature install handler ifeatureinstallhandler handler model get feature getfeature get install handler getinstallhandler handler string lib name libname handler get library getlibrary lib name libname lib name libname length file lib file model get install location getinstalllocation lib name libname lib exists create build properties createbuildproperties i project iproject project i file ifile file pde project pdeproject get build properties getbuildproperties project file exists workspace build model workspacebuildmodel model workspace build model workspacebuildmodel file nls i build entry ibuildentry ientry model get factory getfactory create entry createentry bin includes i resource iresource res project members res length string path res get project relative path getprojectrelativepath to string tostring nls path equals nls project ientry add token addtoken path model get build getbuild add ientry model save core exception coreexception