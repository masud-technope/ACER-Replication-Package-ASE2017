copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal text org eclipse swt graphics color org eclipse swt graphics rgb org eclipse jface preference i preference store ipreferencestore org eclipse jface preference preference converter preferenceconverter org eclipse jface util property change event propertychangeevent org eclipse jface text i document idocument org eclipse jface text contentassist content assistant contentassistant org eclipse jface text contentassist i content assist processor icontentassistprocessor org eclipse i workbench preference constants iworkbenchpreferenceconstants org eclipse jdt preference constants preferenceconstants org eclipse jdt text i color manager icolormanager org eclipse jdt text i java partitions ijavapartitions org eclipse jdt text java text tools javatexttools org eclipse jdt internal java plugin javaplugin org eclipse jdt internal text java java completion processor javacompletionprocessor org eclipse jdt internal text javadoc javadoc completion processor javadoccompletionprocessor content assist preference contentassistpreference preference key content assist auto activation string autoactivation preference constants preferenceconstants codeassist autoactivation preference key content assist auto activation delay string autoactivation delay preference constants preferenceconstants codeassist autoactivation delay preference key content assist parameters color string parameters foreground preference constants preferenceconstants codeassist parameters foreground preference key content assist parameters color string parameters background preference constants preferenceconstants codeassist parameters background preference key content assist auto insert string autoinsert preference constants preferenceconstants codeassist autoinsert preference key java content assist auto activation triggers string autoactivation triggers java preference constants preferenceconstants codeassist autoactivation triggers java preference key javadoc content assist auto activation triggers string autoactivation triggers javadoc preference constants preferenceconstants codeassist autoactivation triggers javadoc preference key visibility proposals string visible proposals preference constants preferenceconstants codeassist visible proposals preference key sensitivity proposals string sensitivity preference constants preferenceconstants codeassist sensitivity preference key adding imports code assist preference key filling argument names method completion string fill method arguments preference constants preferenceconstants codeassist fill argument names preference key prefix completion string prefix completion preference constants preferenceconstants codeassist prefix completion preference key colored labels string colored labels i workbench preference constants iworkbenchpreferenceconstants colored labels color get color getcolor i preference store ipreferencestore store string key i color manager icolormanager manager rgb rgb preference converter preferenceconverter get color getcolor store key manager get color getcolor rgb color get color getcolor i preference store ipreferencestore store string key java text tools javatexttools text tools texttools java plugin javaplugin get default getdefault get java text tools getjavatexttools get color getcolor store key text tools texttools get color manager getcolormanager java completion processor javacompletionprocessor get java processor getjavaprocessor content assistant contentassistant assistant i content assist processor icontentassistprocessor assistant get content assist processor getcontentassistprocessor i document idocument content type java completion processor javacompletionprocessor java completion processor javacompletionprocessor javadoc completion processor javadoccompletionprocessor get java doc processor getjavadocprocessor content assistant contentassistant assistant i content assist processor icontentassistprocessor assistant get content assist processor getcontentassistprocessor i java partitions ijavapartitions java doc javadoc completion processor javadoccompletionprocessor javadoc completion processor javadoccompletionprocessor configure java processor configurejavaprocessor content assistant contentassistant assistant i preference store ipreferencestore store java completion processor javacompletionprocessor jcp get java processor getjavaprocessor assistant jcp string triggers store get string getstring autoactivation triggers java triggers jcp set completion proposal auto activation char acters setcompletionproposalautoactivationcharacters triggers to char array tochararray enabled store get boolean getboolean visible proposals jcp res trict proposals to visibility restrictproposalstovisibility enabled enabled store get boolean getboolean sensitivity jcp res trict proposals to matching cases restrictproposalstomatchingcases enabled configure java doc processor configurejavadocprocessor content assistant contentassistant assistant i preference store ipreferencestore store javadoc completion processor javadoccompletionprocessor jdcp get java doc processor getjavadocprocessor assistant jdcp string triggers store get string getstring autoactivation triggers javadoc triggers jdcp set completion proposal auto activation char acters setcompletionproposalautoactivationcharacters triggers to char array tochararray enabled store get boolean getboolean sensitivity jdcp res trict proposals to matching cases restrictproposalstomatchingcases enabled configure content assistant store param assistant content assistant param store preference store configure content assistant contentassistant assistant i preference store ipreferencestore store java text tools javatexttools text tools texttools java plugin javaplugin get default getdefault get java text tools getjavatexttools i color manager icolormanager manager text tools texttools get color manager getcolormanager enabled store get boolean getboolean autoactivation assistant enable auto activation enableautoactivation enabled delay store get int getint autoactivation delay assistant set auto activation delay setautoactivationdelay delay color get color getcolor store parameters foreground manager assistant set context information popup foreground setcontextinformationpopupforeground assistant set context selector foreground setcontextselectorforeground get color getcolor store parameters background manager assistant set context information popup background setcontextinformationpopupbackground assistant set context selector background setcontextselectorbackground enabled store get boolean getboolean autoinsert assistant enable auto insert enableautoinsert enabled enabled store get boolean getboolean prefix completion assistant enable prefix completion enableprefixcompletion enabled enabled store get boolean getboolean colored labels assistant enable colored labels enablecoloredlabels enabled configure java processor configurejavaprocessor assistant store configure java doc processor configurejavadocprocessor assistant store change java processor changejavaprocessor content assistant contentassistant assistant i preference store ipreferencestore store string key java completion processor javacompletionprocessor jcp get java processor getjavaprocessor assistant jcp autoactivation triggers java equals key string triggers store get string getstring autoactivation triggers java triggers jcp set completion proposal auto activation char acters setcompletionproposalautoactivationcharacters triggers to char array tochararray visible proposals equals key enabled store get boolean getboolean visible proposals jcp res trict proposals to visibility restrictproposalstovisibility enabled sensitivity equals key enabled store get boolean getboolean sensitivity jcp res trict proposals to matching cases restrictproposalstomatchingcases enabled change java doc processor changejavadocprocessor content assistant contentassistant assistant i preference store ipreferencestore store string key javadoc completion processor javadoccompletionprocessor jdcp get java doc processor getjavadocprocessor assistant jdcp autoactivation triggers javadoc equals key string triggers store get string getstring autoactivation triggers javadoc triggers jdcp set completion proposal auto activation char acters setcompletionproposalautoactivationcharacters triggers to char array tochararray sensitivity equals key enabled store get boolean getboolean sensitivity jdcp res trict proposals to matching cases restrictproposalstomatchingcases enabled configuration content assistant property change event preference store param assistant content assistant param store preference store param event property change event change configuration changeconfiguration content assistant contentassistant assistant i preference store ipreferencestore store property change event propertychangeevent event string event get property getproperty autoactivation equals enabled store get boolean getboolean autoactivation assistant enable auto activation enableautoactivation enabled autoactivation delay equals delay store get int getint autoactivation delay assistant set auto activation delay setautoactivationdelay delay parameters foreground equals color get color getcolor store parameters foreground assistant set context information popup foreground setcontextinformationpopupforeground assistant set context selector foreground setcontextselectorforeground parameters background equals color get color getcolor store parameters background assistant set context information popup background setcontextinformationpopupbackground assistant set context selector background setcontextselectorbackground autoinsert equals enabled store get boolean getboolean autoinsert assistant enable auto insert enableautoinsert enabled prefix completion equals enabled store get boolean getboolean prefix completion assistant enable prefix completion enableprefixcompletion enabled colored labels equals enabled store get boolean getboolean colored labels assistant enable colored labels enablecoloredlabels enabled change java processor changejavaprocessor assistant store change java doc processor changejavadocprocessor assistant store fill arguments on method completion fillargumentsonmethodcompletion i preference store ipreferencestore store store get boolean getboolean fill method arguments