copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt launching environments java util map java util properties org eclipse jdt core i access rule iaccessrule org eclipse jdt core i java project ijavaproject org eclipse jdt launching ivm install ivminstall org eclipse jdt launching library location librarylocation execution environment describes capabilities java runtime environment code ivm install ivminstall code execution environment contributed plug xml code org eclipse jdt launching execution environments executionenvironments code extension point clients contributing execution environments provide implement execution environment analyzer delegates i execution environment analyzer delegate iexecutionenvironmentanalyzerdelegate noimplement intended implemented clients noextend intended extended clients i execution environment iexecutionenvironment returns unique identifier execution environment corresponds code code attribute plug xml unique identifier execution environment string get id getid returns human readable description environment human readable description environment string get description getdescription returns collection installs compatible environment empty collection installs compatible environment empty ivm install ivminstall get compatible ms getcompatiblevms returns install str ictly strictly compatible environment returns code code install str ictly strictly compatible environment code code install represents super set superset environment param install install str ictly strictly compatible environment is str ictly compatible isstrictlycompatible ivm install ivminstall returns execution environment code code environment code code ivm install ivminstall get default m getdefaultvm sets execution environment param execution environment code code clear setting exception illegal argument exception illegalargumentexception compatible environment set default m setdefaultvm ivm install ivminstall returns collection access rules applied libraries execution environment context project array access rules returned library code libraries code empty access rules execution environment defined access rule participants contributed code org eclipse jdt launching execution environments executionenvironments code extension param access rules requested param libraries libraries access rules requested param project project access rules requested code code collection arrays access rules array library i access rule iaccessrule get access rules getaccessrules ivm install ivminstall library location librarylocation libraries i java project ijavaproject project returns osg i osgi profile properties execution environment code code profile properties attributes link org osgi framework constants framework system packages systempackages profile properties option ally optionally contributed execution environment extension profile properties code code properties get profile properties getprofileproperties returns collection execution environments sub sets subsets environment collection execution environments sub sets subsets environment i execution environment iexecutionenvironment get sub environments getsubenvironments returns map eclipse java compiler options settings building profile code code unspecified map eclipse java compiler options profile code code map string string get compliance options getcomplianceoptions