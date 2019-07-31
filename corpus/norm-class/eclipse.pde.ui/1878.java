copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde api tools internal java file java file input stream fileinputstream java io exception ioexception java input stream inputstream java util zip zip entry zipentry java util zip zip file zipfile org eclipse core runtime core exception coreexception org eclipse core runtime i status istatus org eclipse core runtime path org eclipse core runtime status org eclipse pde api tools internal provisional api plugin apiplugin org eclipse pde api tools internal provisional factory org eclipse pde api tools internal provisional i api description iapidescription org eclipse pde api tools internal provisional profile modifiers profilemodifiers org eclipse pde api tools internal provisional restriction modifiers restrictionmodifiers org eclipse pde api tools internal provisional visibility modifiers visibilitymodifiers org eclipse pde api tools internal provisional descriptors i element descriptor ielementdescriptor org eclipse pde api tools internal provisional descriptors i field descriptor ifielddescriptor org eclipse pde api tools internal provisional descriptors i method descriptor imethoddescriptor org eclipse pde api tools internal provisional descriptors i package descriptor ipackagedescriptor org eclipse pde api tools internal provisional descriptors i reference type descriptor ireferencetypedescriptor org eclipse pde api tools internal provisional scanner scanner messages scannermessages org eclipse pde api tools internal util util org dom element org dom node list nodelist tools scanning loading parsing component xml files system api description processor systemapidescriptionprocessor constructor instantiated system api description processor systemapidescriptionprocessor parses component xml string location jar directory component xml file component xml file param location root location component xml file component xml file component xml string code code io exception ioexception unable parse string serialize component xml serializecomponentxml file location location exists zip file zipfile jar file jarfile input stream inputstream stream string extension path location get name getname get file extension getfileextension nls extension extension equals jar location is file isfile jar file jarfile zip file zipfile location zip file zipfile open read zip entry zipentry manifest entry manifestentry jar file jarfile get entry getentry i api core constants iapicoreconstants system api description xml manifest entry manifestentry stream jar file jarfile get input stream getinputstream manifest entry manifestentry location is directory isdirectory file file file location i api core constants iapicoreconstants system api description xml file exists stream file input stream fileinputstream file location is file isfile location get name getname equals i api core constants iapicoreconstants system api description xml stream file input stream fileinputstream location stream string util get input stream as char array getinputstreamaschararray stream i api core constants iapicoreconstants utf io exception ioexception api plugin apiplugin log stream stream close io exception ioexception api plugin apiplugin log jar file jarfile jar file jarfile close io exception ioexception api plugin apiplugin log exception message underlying exception param message error message param exception underlying exception code code core exception coreexception abort string message throwable exception core exception coreexception i status istatus status status i status istatus error api plugin apiplugin plugin message exception core exception coreexception status parses xml document string format annot ates annotates link i api description iapidescription link i package descriptor ipackagedescriptor link i reference type descriptor ireferencetypedescriptor link i method descriptor imethoddescriptor link i field descriptor ifielddescriptor param settings api settings annotate param xml xml generate settings core exception coreexception annotate api settings annotateapisettings i api description iapidescription settings string xml core exception coreexception element root root util parse document parsedocument xml core exception coreexception abort failed parse api description xml file root get node name getnodename equals i api xml constants iapixmlconstants element component abort scanner messages scannermessages componentxmlscanner node list nodelist packages root get elements by tag name getelementsbytagname i api xml constants iapixmlconstants element node list nodelist types i package descriptor ipackagedescriptor pack desc packdesc element type packages get length getlength element pkg element packages item visibility manifest string pkg name pkgname pkg get attribute getattribute i api xml constants iapixmlconstants attr pack desc packdesc factory package descriptor packagedescriptor pkg name pkgname annotate descriptor annotatedescriptor settings pack desc packdesc pkg types pkg get elements by tag name getelementsbytagname i api xml constants iapixmlconstants element type types get length getlength type element types item string type get attribute getattribute i api xml constants iapixmlconstants attr length abort nls missing type nls i reference type descriptor ireferencetypedescriptor type desc typedesc pack desc packdesc get type gettype annotate descriptor annotatedescriptor settings type desc typedesc type annotate method settings annotatemethodsettings settings type desc typedesc type annotate field settings annotatefieldsettings settings type desc typedesc type annot ates annotates backing link i api description iapidescription link element adding visibility restriction attributes link i element descriptor ielementdescriptor param settings settings annotate param descriptor current descriptor context param element current element annotate annotate descriptor annotatedescriptor i api description iapidescription settings i element descriptor ielementdescriptor descriptor element element settings set visibility setvisibility descriptor visibility modifiers visibilitymodifiers api settings set restrictions setrestrictions descriptor restriction modifiers restrictionmodifiers restrictions settings set added profile setaddedprofile descriptor retrieve element attribute retrieveelementattribute element i api xml constants iapixmlconstants attr profile settings set removed profile setremovedprofile descriptor retrieve element attribute retrieveelementattribute element i api xml constants iapixmlconstants attr removed profile settings set superclass setsuperclass descriptor retrieve string element attribute retrievestringelementattribute element i api xml constants iapixmlconstants attr settings set super interfaces setsuperinterfaces descriptor retrieve string element attribute retrievestringelementattribute element i api xml constants iapixmlconstants attr interfaces settings set interface setinterface descriptor retrieve boolean element attribute retrievebooleanelementattribute element i api xml constants iapixmlconstants attr tests restriction exists element returns updated restrictions flag param element xml element param attribute test param flag bit mask attribute param res flag combine updated flags retrieve element attribute retrieveelementattribute element element string string element get attribute getattribute length integer parse int parseint profile modifiers profilemodifiers profile tests restriction exists element returns updated restrictions flag param element xml element param attribute test param flag bit mask attribute param res flag combine updated flags string retrieve string element attribute retrievestringelementattribute element element string string element get attribute getattribute length tests restriction exists element returns updated restrictions flag param element xml element param attribute test param flag bit mask attribute param res flag combine updated flags retrieve boolean element attribute retrievebooleanelementattribute element element string string element get attribute getattribute length to string tostring equals annot ates annotates supplied link i api description iapidescription field elements direct children link element link i field descriptor ifielddescriptor created needed children link i reference type descriptor ireferencetypedescriptor param settings link i api description iapidescription add link i field descriptor ifielddescriptor param type desc typedesc type descriptor field param type parent link element core exception coreexception annotate field settings annotatefieldsettings i api description iapidescription settings i reference type descriptor ireferencetypedescriptor type desc typedesc element type core exception coreexception node list nodelist fields type get elements by tag name getelementsbytagname i api xml constants iapixmlconstants element field element field i field descriptor ifielddescriptor field desc fielddesc string fields get length getlength field element fields item field get attribute getattribute i api xml constants iapixmlconstants attr abort scanner messages scannermessages componentxmlscanner field desc fielddesc type desc typedesc get field getfield annotate descriptor annotatedescriptor settings field desc fielddesc field annot ates annotates supplied link i api description iapidescription method elements direct children link element link i method descriptor imethoddescriptor created needed children link i reference type descriptor ireferencetypedescriptor param settings link i api description iapidescription add link i method descriptor imethoddescriptor param type desc typedesc type descriptor method param type parent link element core exception coreexception annotate method settings annotatemethodsettings i api description iapidescription settings i reference type descriptor ireferencetypedescriptor type desc typedesc element type core exception coreexception node list nodelist methods type get elements by tag name getelementsbytagname i api xml constants iapixmlconstants element method element method i method descriptor imethoddescriptor method desc methoddesc string signature methods get length getlength method element methods item method get attribute getattribute i api xml constants iapixmlconstants attr abort scanner messages scannermessages componentxmlscanner signature method get attribute getattribute i api xml constants iapixmlconstants attr signature signature abort scanner messages scannermessages componentxmlscanner method desc methoddesc type desc typedesc get method getmethod signature annotate descriptor annotatedescriptor settings method desc methoddesc method