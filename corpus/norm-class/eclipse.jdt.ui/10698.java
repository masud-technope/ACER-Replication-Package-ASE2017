copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal corext refactoring nls java util array list arraylist java util collections java util comparator java util hash set hashset java util iterator java util list ibm icu text collator org eclipse core runtime core exception coreexception org eclipse core runtime i path ipath org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime i status istatus org eclipse core resources i file ifile org eclipse core resources i project iproject org eclipse core resources i resource iresource org eclipse core resources resources plugin resourcesplugin org eclipse text edits text edit textedit org eclipse ltk core refactoring change org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i java element ijavaelement org eclipse jdt core i java project ijavaproject org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt core java core javacore org eclipse jdt core dom rewrite import rewrite importrewrite org eclipse jdt core formatter code formatter codeformatter org eclipse jdt internal corext code manipulation codemanipulation stub utility stubutility org eclipse jdt internal corext refactoring nls create text file change createtextfilechange org eclipse jdt internal corext util code formatter util codeformatterutil org eclipse jdt internal corext util java model util javamodelutil org eclipse jdt code generation codegeneration org eclipse jdt internal java plugin javaplugin org eclipse jdt internal dialogs status info statusinfo org eclipse jdt internal preferences members order preference cache membersorderpreferencecache accessor class creator accessorclasscreator i compilation unit icompilationunit f cu fcu string f accessor class name faccessorclassname i path ipath f accessor path faccessorpath i path ipath f resource bundle path fresourcebundlepath i package fragment ipackagefragment f accessor package faccessorpackage f is eclipse s fiseclipsenls nls substitution nlssubstitution fnlssubstitutions string f substitution pattern fsubstitutionpattern accessor class creator accessorclasscreator i compilation unit icompilationunit string accessor class name accessorclassname i path ipath accessor path accessorpath i package fragment ipackagefragment accessor package accessorpackage i path ipath resource bundle path resourcebundlepath iseclipsenls nls substitution nlssubstitution nls substitutions nlssubstitutions string substitution pattern substitutionpattern f cu fcu f accessor class name faccessorclassname accessor class name accessorclassname f accessor path faccessorpath accessor path accessorpath f accessor package faccessorpackage accessor package accessorpackage f resource bundle path fresourcebundlepath resource bundle path resourcebundlepath f is eclipse s fiseclipsenls iseclipsenls fnlssubstitutions nls substitutions nlssubstitutions f substitution pattern fsubstitutionpattern substitution pattern substitutionpattern change create i compilation unit icompilationunit string accessor class name accessorclassname i path ipath accessor path accessorpath i package fragment ipackagefragment accessor package accessorpackage i path ipath resource bundle path resourcebundlepath iseclipsenls nls substitution nlssubstitution nls substitutions nlssubstitutions string substitution pattern substitutionpattern i progress monitor iprogressmonitor core exception coreexception accessor class creator accessorclasscreator accessor class accessorclass accessor class creator accessorclasscreator accessor class name accessorclassname accessor path accessorpath accessor package accessorpackage resource bundle path resourcebundlepath iseclipsenls nls substitutions nlssubstitutions substitution pattern substitutionpattern nls create text file change createtextfilechange accessor path accessorpath accessor class accessorclass createaccessorcusource java string createaccessorcusource i progress monitor iprogressmonitor core exception coreexception i project iproject project get file handle getfilehandle f accessor path faccessorpath get project getproject string line delimiter linedelimiter stub utility stubutility get line delimiter preference getlinedelimiterpreference project code formatter util codeformatterutil format code formatter codeformatter compilation unit get unformatted source getunformattedsource line delimiter linedelimiter f cu fcu get java project getjavaproject i file ifile get file handle getfilehandle i path ipath file path filepath file path filepath resources plugin resourcesplugin get workspace getworkspace get root getroot get file getfile file path filepath string get unformatted source getunformattedsource i progress monitor iprogressmonitor core exception coreexception i compilation unit icompilationunit new cu newcu new cu newcu f accessor package faccessorpackage get compilation unit getcompilationunit f accessor path faccessorpath last segment lastsegment get working copy getworkingcopy string type comment typecomment file comment filecomment i java project ijavaproject project new cu newcu get java project getjavaproject string line delim linedelim stub utility stubutility get line delimiter used getlinedelimiterused project stub utility stubutility do add comments doaddcomments project type comment typecomment code generation codegeneration get type comment gettypecomment new cu newcu f accessor class name faccessorclassname line delim linedelim file comment filecomment code generation codegeneration get file comment getfilecomment new cu newcu line delim linedelim string class content classcontent create class createclass line delim linedelim string cu content cucontent code generation codegeneration get compilation unit content getcompilationunitcontent new cu newcu file comment filecomment type comment typecomment class content classcontent line delim linedelim cu content cucontent string buffer stringbuffer buf string buffer stringbuffer file comment filecomment buf append file comment filecomment append line delim linedelim f accessor package faccessorpackage is default package isdefaultpackage nls buf append append f accessor package faccessorpackage get element name getelementname append nls buf append line delim linedelim append line delim linedelim type comment typecomment buf append type comment typecomment append line delim linedelim buf append class content classcontent cu content cucontent buf to string tostring new cu newcu get buffer getbuffer set contents setcontents cu content cucontent add imports to accessor cu addimportstoaccessorcu new cu newcu new cu newcu get source getsource new cu newcu new cu newcu discard working copy discardworkingcopy add imports to accessor cu addimportstoaccessorcu i compilation unit icompilationunit new cu newcu i progress monitor iprogressmonitor core exception coreexception import rewrite importrewrite stub utility stubutility create import rewrite createimportrewrite new cu newcu f is eclipse s fiseclipsenls nls add import addimport org eclipse osgi util nls nls add import addimport java util missing resource exception missingresourceexception nls add import addimport java util resource bundle resourcebundle text edit textedit edit rewrite imports rewriteimports java model util javamodelutil apply edit applyedit new cu newcu edit string create class createclass string line delim linedelim core exception coreexception f is eclipse s fiseclipsenls members order preference cache membersorderpreferencecache sort order sortorder java plugin javaplugin get default getdefault get member order preference cache getmemberorderpreferencecache constructor idx constructoridx sort order sortorder get category index getcategoryindex members order preference cache membersorderpreferencecache constructors field idx fieldidx sort order sortorder get category index getcategoryindex members order preference cache membersorderpreferencecache fields init idx initidx sort order sortorder get category index getcategoryindex members order preference cache membersorderpreferencecache init string constructor create constructor createconstructor line delim linedelim line delim linedelim string initializer create static initializer createstaticinitializer line delim linedelim line delim linedelim string fields create static fields createstaticfields line delim linedelim string buffer stringbuffer result string buffer stringbuffer nls nls result append append f accessor class name faccessorclassname append nls nls nls nls result append string append nls refactoring nlsrefactoring bundle field append append get resource bundle name getresourcebundlename append result append nls element nlselement create tag text createtagtext append line delim linedelim constructor idx constructoridx field idx fieldidx field idx fieldidx init idx initidx result append constructor result append fields result append initializer result append constructor result append initializer result append fields constructor idx constructoridx init idx initidx result append fields result append constructor result append initializer result append fields result append initializer result append constructor result append append line delim linedelim result to string tostring members order preference cache membersorderpreferencecache sort order sortorder java plugin javaplugin get default getdefault get member order preference cache getmemberorderpreferencecache constructor idx constructoridx sort order sortorder get category index getcategoryindex members order preference cache membersorderpreferencecache constructors method idx methodidx sort order sortorder get category index getcategoryindex members order preference cache membersorderpreferencecache method string constructor line delim linedelim create constructor createconstructor line delim linedelim string method line delim linedelim create get string method creategetstringmethod line delim linedelim string buffer stringbuffer result string buffer stringbuffer nls nls result append append f accessor class name faccessorclassname append nls result append string append nls refactoring nlsrefactoring bundle field nls nls result append append get resource bundle name getresourcebundlename append append nls element nlselement create tag text createtagtext append line delim linedelim nls result append line delim linedelim append resource bundle resourcebundle append get resource bundle constant name getresourcebundleconstantname nls nls result append resource bundle resourcebundle get bundle getbundle append nls refactoring nlsrefactoring bundle field append append line delim linedelim constructor idx constructoridx method idx methodidx result append constructor result append method result append constructor result append method result append line delim linedelim append append line delim linedelim result to string tostring string get resource bundle constant name getresourcebundleconstantname nls resource bundle string create static fields createstaticfields hash set hashset string hash set hashset list nls substitution nlssubstitution subs array list arraylist fnlssubstitutions length nls substitution nlssubstitution substitution fnlssubstitutions new state newstate substitution get state getstate substitution has state changed hasstatechanged substitution is accessor rename isaccessorrename new state newstate nls substitution nlssubstitution externalized add substitution get key getkey subs add substitution collections sort subs comparator nls substitution nlssubstitution collator f collator fcollator collator get instance getinstance override compare nls substitution nlssubstitution nls substitution nlssubstitution f collator fcollator compare get key getkey get key getkey string buffer stringbuffer buf string buffer stringbuffer iterator nls substitution nlssubstitution iter subs iterator iter has next hasnext nls substitution nlssubstitution element iter append static field appendstaticfield buf element buf to string tostring append static field appendstaticfield string buffer stringbuffer buf nls substitution nlssubstitution substitution nls buf append string buf append substitution get key getkey buf append string create get string method creategetstringmethod string line delim linedelim string buffer stringbuffer result string buffer stringbuffer nls result append string f substitution pattern fsubstitutionpattern index of indexof nls refactoring nlsrefactoring key result append f substitution pattern fsubstitutionpattern substring nls result append string key result append f substitution pattern fsubstitutionpattern substring nls refactoring nlsrefactoring key length fallback nls result append get string getstring string key result append append line delim linedelim nls result append append line delim linedelim append nls append get resource bundle constant name getresourcebundleconstantname append nls get string getstring key append nls line delim linedelim append nls missing resource exception missingresourceexception append nls line delim linedelim append nls key append nls line delim linedelim append nls result append line delim linedelim append result to string tostring string create static initializer createstaticinitializer string line delim linedelim nls line delim linedelim nls initialize resource bundle line delim linedelim nls initialize messages initializemessages bundle f accessor class name faccessorclassname nls nls line delim linedelim nls string create constructor createconstructor string line delim linedelim nls nls f accessor class name faccessorclassname line delim linedelim string create get string method comment creategetstringmethodcomment core exception coreexception f code generation settings fcodegenerationsettings create comments createcomments string comment code generation codegeneration get method comment getmethodcomment f cu fcu f accessor class name faccessorclassname get string getstring nls string key nls string q string qstring nls line delim linedelim comment nls comment line delim linedelim nls string get property file name getpropertyfilename f resource bundle path fresourcebundlepath last segment lastsegment string get property file name without extension getpropertyfilenamewithoutextension string file name filename get property file name getpropertyfilename file name filename substring file name filename index of indexof nls refactoring nlsrefactoring property file ext string get resource bundle name getresourcebundlename core exception coreexception i resource iresource res resources plugin resourcesplugin get workspace getworkspace get root getroot find member findmember f resource bundle path fresourcebundlepath remove last segments removelastsegments res res exists i java element ijavaelement java core javacore create res i package fragment ipackagefragment i package fragment ipackagefragment i package fragment ipackagefragment get element name getelementname get property file name without extension getpropertyfilenamewithoutextension i package fragment root ipackagefragmentroot i java project ijavaproject get property file name without extension getpropertyfilenamewithoutextension nls core exception coreexception status info statusinfo i status istatus error resource bundle resourcebundle