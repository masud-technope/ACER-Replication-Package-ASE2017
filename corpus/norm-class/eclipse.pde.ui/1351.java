copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde tests java util hashtable junit framework test junit framework test suite testsuite org eclipse core resources org eclipse core runtime org eclipse core runtime jobs job org eclipse jdt core org eclipse jdt core util i class file reader iclassfilereader org eclipse jdt launching java runtime javaruntime org eclipse jdt launching environments i execution environment iexecutionenvironment org eclipse pde core plugin i plugin model base ipluginmodelbase org eclipse pde core plugin plugin registry pluginregistry org eclipse pde internal wizards tools update classpath job updateclasspathjob org eclipse pde tests pde test case pdetestcase org eclipse pde tests util project utils projectutils tests projects custom execution environment execution environment tests executionenvironmenttests pde test case pdetestcase test suite test suite testsuite execution environment tests executionenvironmenttests deletes project param core exception coreexception delete project deleteproject string core exception coreexception i project iproject project resources plugin resourcesplugin get workspace getworkspace get root getroot get project getproject project exists project delete wait builds complete wait for build waitforbuild was interrupted wasinterrupted job get job manager getjobmanager join resources plugin resourcesplugin family auto build job get job manager getjobmanager join resources plugin resourcesplugin family manual build was interrupted wasinterrupted operation canceled exception operationcanceledexception print stack trace printstacktrace interrupted exception interruptedexception was interrupted wasinterrupted was interrupted wasinterrupted validates project option expected param option name optionname param expected value expectedvalue validate option validateoption i java project ijavaproject project string option name optionname string expected value expectedvalue string option project get option getoption option name optionname assert equals assertequals wrong option option name optionname expected value expectedvalue option validates jre path container expected param project param conatiner path conatinerpath java model exception javamodelexception validate system library validatesystemlibrary i java project ijavaproject project i path ipath conatiner path conatinerpath java model exception javamodelexception i classpath entry iclasspathentry classpath project get raw classpath getrawclasspath i classpath entry iclasspathentry entry classpath entry get entry kind getentrykind i classpath entry iclasspathentry cpe container i path ipath path entry get path getpath java runtime javaruntime jre container equals path segment assert equals assertequals wrong system library path container conatiner path conatinerpath path assert false assertfalse jre container validates target level generated file param class file classfile location file local file system param major expected major file version validate target level validatetargetlevel string class file classfile major i class file reader iclassfilereader reader tool factory toolfactory create default class file reader createdefaultclassfilereader class file classfile i class file reader iclassfilereader assert equals assertequals wrong major version major reader get major version getmajorversion creates plug project custom execution environment validates compiler compliance settings build path correct files generated correct target level todo included compatible jre s jres custom environment link environment analyzer delegate environmentanalyzerdelegate analyze org eclipse jdt launching ivm install ivminstall i progress monitor iprogressmonitor exception test custom environment testcustomenvironment exception i execution environment iexecutionenvironment env java runtime javaruntime get execution environments manager getexecutionenvironmentsmanager get environment getenvironment environment analyzer delegate environmentanalyzerdelegate sound i java project ijavaproject project project utils projectutils create plugin project createpluginproject sound env assert true asserttrue project created project exists validate option validateoption project java core javacore compiler codegen target platform java core javacore version validate option validateoption project java core javacore compiler source java core javacore version validate option validateoption project java core javacore compiler compliance java core javacore version validate option validateoption project java core javacore compiler identifier java core javacore error validate option validateoption project java core javacore compiler enum identifier java core javacore error validate system library validatesystemlibrary project java runtime javaruntime newjrecontainerpath env ensure files build correct target level project get project getproject build incremental project builder incrementalprojectbuilder full build wait for build waitforbuild i file ifile file project get project getproject get file getfile bin sound activator assert true asserttrue activator missing file exists validate target level validatetargetlevel file get location getlocation toosstring delete project deleteproject sound creates plug project execution environment validates compiler compliance settings build path correct files generated correct target level exception test java testjava environment exception i execution environment iexecutionenvironment env java runtime javaruntime get execution environments manager getexecutionenvironmentsmanager get environment getenvironment i java project ijavaproject project project utils projectutils create plugin project createpluginproject plug env assert true asserttrue project created project exists validate option validateoption project java core javacore compiler codegen target platform java core javacore version validate option validateoption project java core javacore compiler source java core javacore version validate option validateoption project java core javacore compiler compliance java core javacore version validate option validateoption project java core javacore compiler identifier java core javacore warning validate option validateoption project java core javacore compiler enum identifier java core javacore warning validate system library validatesystemlibrary project java runtime javaruntime newjrecontainerpath env project get project getproject build incremental project builder incrementalprojectbuilder full build wait for build waitforbuild i file ifile file project get project getproject get file getfile bin plug activator assert true asserttrue activator missing file exists validate target level validatetargetlevel file get location getlocation toosstring delete project deleteproject plug creates plug project execution environment validates compiler compliance settings build path reflect workspace settings exception test no environment testnoenvironment exception i java project ijavaproject project project utils projectutils create plugin project createpluginproject env assert true asserttrue project created project exists hashtable options java core javacore get options getoptions validate option validateoption project java core javacore compiler codegen target platform string options java core javacore compiler codegen target platform validate option validateoption project java core javacore compiler source string options java core javacore compiler source validate option validateoption project java core javacore compiler compliance string options java core javacore compiler compliance validate option validateoption project java core javacore compiler identifier string options java core javacore compiler identifier validate option validateoption project java core javacore compiler enum identifier string options java core javacore compiler enum identifier validate system library validatesystemlibrary project java runtime javaruntime newdefaultjrecontainerpath delete project deleteproject env creates plug project execution environment validates compiler compliance settings build path correct modifies compliance options updates path ensures enum identifier options overwritten minimum warning severity exception test minimum compliance overwrite testminimumcomplianceoverwrite exception i execution environment iexecutionenvironment env java runtime javaruntime get execution environments manager getexecutionenvironmentsmanager get environment getenvironment i java project ijavaproject project project utils projectutils create plugin project createpluginproject ignore env assert true asserttrue project created project exists validate option validateoption project java core javacore compiler codegen target platform java core javacore version validate option validateoption project java core javacore compiler source java core javacore version validate option validateoption project java core javacore compiler compliance java core javacore version validate option validateoption project java core javacore compiler identifier java core javacore warning validate option validateoption project java core javacore compiler enum identifier java core javacore warning validate system library validatesystemlibrary project java runtime javaruntime newjrecontainerpath env ignore enum options project set option setoption java core javacore compiler identifier java core javacore ignore project set option setoption java core javacore compiler enum identifier java core javacore ignore validate option validateoption project java core javacore compiler identifier java core javacore ignore validate option validateoption project java core javacore compiler enum identifier java core javacore ignore updating path increase severity warning i plugin model base ipluginmodelbase model plugin registry pluginregistry find model findmodel project get project getproject update classpath job updateclasspathjob job update classpath job updateclasspathjob i plugin model base ipluginmodelbase model job schedule job join validate options validate option validateoption project java core javacore compiler codegen target platform java core javacore version validate option validateoption project java core javacore compiler source java core javacore version validate option validateoption project java core javacore compiler compliance java core javacore version validate option validateoption project java core javacore compiler identifier java core javacore warning validate option validateoption project java core javacore compiler enum identifier java core javacore warning delete project deleteproject ignore creates plug project execution environment validates compiler compliance settings build path correct modifies compliance options updates path ensures enum identifier options overwrite existing error severity exception test minimum compliance no overwrite testminimumcompliancenooverwrite exception i execution environment iexecutionenvironment env java runtime javaruntime get execution environments manager getexecutionenvironmentsmanager get environment getenvironment i java project ijavaproject project project utils projectutils create plugin project createpluginproject error env assert true asserttrue project created project exists validate option validateoption project java core javacore compiler codegen target platform java core javacore version validate option validateoption project java core javacore compiler source java core javacore version validate option validateoption project java core javacore compiler compliance java core javacore version validate option validateoption project java core javacore compiler identifier java core javacore warning validate option validateoption project java core javacore compiler enum identifier java core javacore warning validate system library validatesystemlibrary project java runtime javaruntime newjrecontainerpath env ignore enum options project set option setoption java core javacore compiler identifier java core javacore error project set option setoption java core javacore compiler enum identifier java core javacore error validate option validateoption project java core javacore compiler identifier java core javacore error validate option validateoption project java core javacore compiler enum identifier java core javacore error updating path increase severity warning i plugin model base ipluginmodelbase model plugin registry pluginregistry find model findmodel project get project getproject update classpath job updateclasspathjob job update classpath job updateclasspathjob i plugin model base ipluginmodelbase model job schedule job join validate options validate option validateoption project java core javacore compiler codegen target platform java core javacore version validate option validateoption project java core javacore compiler source java core javacore version validate option validateoption project java core javacore compiler compliance java core javacore version validate option validateoption project java core javacore compiler identifier java core javacore error validate option validateoption project java core javacore compiler enum identifier java core javacore error delete project deleteproject error