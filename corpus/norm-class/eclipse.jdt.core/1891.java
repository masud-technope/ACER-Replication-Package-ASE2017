copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal core org eclipse core resources i resource iresource org eclipse core resources i workspace iworkspace org eclipse core runtime jobs i scheduling rule ischedulingrule org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i java element ijavaelement org eclipse jdt core i java model status ijavamodelstatus org eclipse jdt core i java model status constants ijavamodelstatusconstants org eclipse jdt core java model exception javamodelexception org eclipse jdt core dom ast org eclipse jdt core dom ast node astnode org eclipse jdt core dom ast parser astparser org eclipse jdt core dom child list property descriptor childlistpropertydescriptor org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom structural property descriptor structuralpropertydescriptor org eclipse jdt core dom rewrite ast rewrite astrewrite org eclipse jdt core dom rewrite list rewrite listrewrite org eclipse jdt internal core util util org eclipse text edits text edit textedit behavior common code create element in operations createelementincuoperations code create compilation unit element contained compilation unit source code entire compilation unit updated saved element created pos itioned positioned relative existing element compilation unit methods code create after createafter code code create before createbefore code element pos itioned positioned child parent element create element in operation createelementincuoperation java model operation javamodeloperation compilation unit ast operation compilation unit compilationunit cuast constant meaning position element child parent element insert constant meaning position element element defined code f anchor element fanchorelement code insert constant meaning position element element defined code f anchor element fanchorelement code insert position constants describing position newly created element insertion policy insertionpolicy insert element newly created element pos itioned positioned relative code f insert position finsertposition code code code newly created element pos itioned positioned i java element ijavaelement anchor element anchorelement flag indicating creation element occurred request creating duplicate element request flag code code ensures deltas generated creation occur creation occurred creationoccurred constructs operation creates java language element parent contained compilation unit create element in operation createelementincuoperation i java element ijavaelement parent element parentelement i java element ijavaelement parent element parentelement initialize default position initializedefaultposition can celling cancelling operation nested check canceled checkcanceled is nested isnested check canceled checkcanceled ins tructs instructs operation position element sibling add element child parent code code create after createafter i java element ijavaelement sibling set relative position setrelativeposition sibling insert ins tructs instructs operation position element sibling add element child parent code code create before createbefore i java element ijavaelement sibling set relative position setrelativeposition sibling insert execute operation generate source compilation unit save exception java model exception javamodelexception operation unable complete execute operation executeoperation java model exception javamodelexception begin task begintask get main task name getmaintaskname get main amount of work getmainamountofwork java element delta javaelementdelta delta new java element delta newjavaelementdelta i compilation unit icompilationunit unit get compilation unit getcompilationunit generate new compilation unit t generatenewcompilationunitast unit creation occurred creationoccurred change occurred unit save is working copy isworkingcopy unit is working copy isworkingcopy is working copy isworkingcopy set attribute setattribute modified resource attr worked result elements resultelements generate result handles generateresulthandles unit working copy save fired delta is working copy isworkingcopy util is excluded isexcluded unit unit get parent getparent exists result elements resultelements length delta result elements resultelements add delta adddelta delta unit created classpath java resource delta not ified notified delta processor returns property descriptor element created structural property descriptor structuralpropertydescriptor get child property descriptor getchildpropertydescriptor ast node astnode parent returns ast node element created ast node astnode generateelementast ast rewrite astrewrite rewriter i compilation unit icompilationunit java model exception javamodelexception generates ast operation applies generate new compilation unit t generatenewcompilationunitast i compilation unit icompilationunit java model exception javamodelexception cuast parse ast ast cuast getast ast rewrite astrewrite rewriter ast rewrite astrewrite create ast ast node astnode child generateelementast rewriter child ast node astnode parent java element javaelement get parent element getparentelement find node findnode cuast parent parent cuast insertastnode rewriter parent child text edit textedit edits rewriter rewriteast apply text edit applytextedit edits worked creates returns handle element operation created i java element ijavaelement generate result handle generateresulthandle creates returns handles elements operation created i java element ijavaelement generate result handles generateresulthandles i java element ijavaelement generate result handle generateresulthandle returns compilation unit element created i compilation unit icompilationunit get compilation unit getcompilationunit get compilation unit for getcompilationunitfor get parent element getparentelement returns amount work main task operation progress reporting get main amount of work getmainamountofwork returns main task operation progress reporting string get main task name getmaintaskname i scheduling rule ischedulingrule get scheduling rule getschedulingrule i resource iresource resource get compilation unit getcompilationunit get resource getresource i workspace iworkspace workspace resource get workspace getworkspace workspace get rule factory getrulefactory modify rule modifyrule resource sets position create type member operations require position override method initialize default position initializedefaultposition element pos itioned positioned child parent element created inserts child ast based position settings operation create after createafter i java element ijavaelement create before createbefore i java element ijavaelement insertastnode ast rewrite astrewrite rewriter ast node astnode parent ast node astnode child java model exception javamodelexception structural property descriptor structuralpropertydescriptor property descriptor propertydescriptor get child property descriptor getchildpropertydescriptor parent property descriptor propertydescriptor child list property descriptor childlistpropertydescriptor child list property descriptor childlistpropertydescriptor child list property descriptor childlistpropertydescriptor child list property descriptor childlistpropertydescriptor property descriptor propertydescriptor list rewrite listrewrite rewrite rewriter get list rewrite getlistrewrite parent child list property descriptor childlistpropertydescriptor insertion policy insertionpolicy insert ast node astnode element java element javaelement anchor element anchorelement find node findnode cuast child list property descriptor childlistpropertydescriptor get element type getelementtype is assignable from isassignablefrom element get class getclass rewrite insert before insertbefore child element empty list anchor element top level type insert before insertbefore type rewrite insert last insertlast child insert element java element javaelement anchor element anchorelement find node findnode cuast child list property descriptor childlistpropertydescriptor get element type getelementtype is assignable from isassignablefrom element get class getclass rewrite insert after insertafter child element empty list anchor element top level type insert after insertafter type rewrite insert last insertlast child insert rewrite insert last insertlast child rewriter parent property descriptor propertydescriptor child compilation unit compilationunit parse i compilation unit icompilationunit java model exception javamodelexception ensure consistent noop consistent make consistent makeconsistent progress monitor progressmonitor create ast compilation unit ast parser astparser parser ast parser astparser new parser newparser ast jls parser set source setsource compilation unit compilationunit parser createast progress monitor progressmonitor sets code dom node domnode code create element code copy elements operation copyelementsoperation code renaming code create type member operation createtypememberoperation code set altered name setalteredname string new name newname implementation create type member operation createtypememberoperation ins tructs instructs operation position element relative sibling add element child parent code code code position code position constants set relative position setrelativeposition i java element ijavaelement sibling policy illegal argument exception illegalargumentexception sibling anchor element anchorelement insertion policy insertionpolicy insert anchor element anchorelement sibling insertion policy insertionpolicy policy failures elements process compilation unit supplied operation code code invalid valid declaration invalid sibling sibling pos itioning positioning valid i java model status ijavamodelstatus org eclipse jdt core java conventions javaconventions i java model status ijavamodelstatus verify get parent element getparentelement java model status javamodelstatus i java model status constants ijavamodelstatusconstants elements process anchor element anchorelement i java element ijavaelement dom present parent dompresentparent anchor element anchorelement get parent getparent dom present parent dompresentparent get element type getelementtype i java element ijavaelement container dom present parent dompresentparent dom present parent dompresentparent get parent getparent dom present parent dompresentparent equals get parent element getparentelement java model status javamodelstatus i java model status constants ijavamodelstatusconstants invalid sibling anchor element anchorelement java model status javamodelstatus verified