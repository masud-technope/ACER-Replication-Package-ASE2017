copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation vladimir piskarev pisv building large java element deltas slow https bugs eclipse org org eclipse jdt internal core java util array list arraylist java util hash map hashmap java util hash set hashset java util iterator java util map java util org eclipse jdt core i annotation iannotation org eclipse jdt core i java element ijavaelement org eclipse jdt core i java element delta ijavaelementdelta org eclipse jdt core i parent iparent org eclipse jdt core java model exception javamodelexception org eclipse jdt core compiler char operation charoperation org eclipse jdt internal core util util java element delta builder creates java element delta java element version java element time comparator created current version java element performs operation locally caching contents java element created method create deltas createdeltas called creates delta cached contents contents suppress warnings suppresswarnings rawtypes unchecked java element delta builder javaelementdeltabuilder java element handle i java element ijavaelement java element javaelement maximum depth java element children max depth maxdepth integer max handle info relation ships relationships map infos map annotation infos annotationinfos position info map old positions oldpositions position info map new positions newpositions change delta java element delta javaelementdelta delta list elements hash set hashset list removed elements hash set hashset removed doubly linked list item list item listitem i java element ijavaelement previous i java element ijavaelement list item listitem i java element ijavaelement previous i java element ijavaelement previous previous creates java element comparator java element deep java element delta builder javaelementdeltabuilder i java element ijavaelement java element javaelement java element javaelement java element javaelement initialize record element info recordelementinfo java element javaelement java model javamodel java element javaelement get java model getjavamodel creates java element comparator java element max depth maxdepth levels deep java element delta builder javaelementdeltabuilder i java element ijavaelement java element javaelement max depth maxdepth java element javaelement java element javaelement max depth maxdepth max depth maxdepth initialize record element info recordelementinfo java element javaelement java model javamodel java element javaelement get java model getjavamodel repairs pos itioning positioning element i java element ijavaelement element add element list item listitem current get new position getnewposition element list item listitem previous current previous previous get new position getnewposition current previous current get new position getnewposition current previous previous current previous current previous builds java element deltas content compilation unit content build deltas builddeltas delta java element delta javaelementdelta java element javaelement fine grained delta java element javaelement get element type getelementtype i java element ijavaelement compilation unit delta fine grained finegrained record new positions recordnewpositions java element javaelement find add itions findadditions java element javaelement find deletions finddeletions find changes in pos itioning findchangesinpositioning java element javaelement trim delta trimdelta delta delta get affected children getaffectedchildren length fine grained children mark content changed delta content changed contentchanged equals length length length char operation charoperation equals finds elements changed find add itions findadditions i java element ijavaelement new element newelement depth java element info javaelementinfo old info oldinfo get element info getelementinfo new element newelement old info oldinfo depth max depth maxdepth delta new element newelement new element newelement remove element info removeelementinfo new element newelement depth max depth maxdepth mark element changed delta changed new element newelement i java element delta ijavaelementdelta content java element info javaelementinfo new info newinfo new info newinfo java element info javaelementinfo java element javaelement new element newelement get element info getelementinfo java model exception javamodelexception npe find content change findcontentchange old info oldinfo new info newinfo new element newelement old info oldinfo new element newelement i parent iparent i java element ijavaelement children new info newinfo get children getchildren children length children length length find add itions findadditions children depth changed pos itioning positioning elements find changes in pos itioning findchangesinpositioning i java element ijavaelement element depth depth max depth maxdepth element removed element is pos itioned correctly ispositionedcorrectly element delta changed element i java element delta ijavaelementdelta reorder element i parent iparent java element info javaelementinfo info info java element info javaelementinfo java element javaelement element get element info getelementinfo java model exception javamodelexception npe i java element ijavaelement children info get children getchildren children length children length length find changes in pos itioning findchangesinpositioning children depth find annotation changes findannotationchanges i annotation iannotation old annotations oldannotations i annotation iannotation new annotations newannotations i java element ijavaelement parent array list arraylist annotation deltas annotationdeltas length new annotations newannotations length length i annotation iannotation new annotation newannotation new annotations newannotations object old info oldinfo annotation infos annotationinfos remove new annotation newannotation old info oldinfo java element delta javaelementdelta annotation delta annotationdelta java element delta javaelementdelta new annotation newannotation annotation delta annotationdelta annotation deltas annotationdeltas annotation deltas annotationdeltas array list arraylist annotation deltas annotationdeltas add annotation delta annotationdelta annotation info annotationinfo new info newinfo new info newinfo annotation info annotationinfo java element javaelement new annotation newannotation get element info getelementinfo java model exception javamodelexception npe util equal arrays or null equalarraysornull annotation info annotationinfo old info oldinfo members new info newinfo members java element delta javaelementdelta annotation delta annotationdelta java element delta javaelementdelta new annotation newannotation annotation delta annotationdelta changed i java element delta ijavaelementdelta content annotation deltas annotationdeltas annotation deltas annotationdeltas array list arraylist annotation deltas annotationdeltas add annotation delta annotationdelta length old annotations oldannotations length length i annotation iannotation old annotation oldannotation old annotations oldannotations annotation infos annotationinfos remove old annotation oldannotation java element delta javaelementdelta annotation delta annotationdelta java element delta javaelementdelta old annotation oldannotation annotation delta annotationdelta removed annotation deltas annotationdeltas annotation deltas annotationdeltas array list arraylist annotation deltas annotationdeltas add annotation delta annotationdelta annotation deltas annotationdeltas size annotation deltas annotationdeltas size size java element delta javaelementdelta parent delta parentdelta delta changed parent i java element delta ijavaelementdelta annotations parent delta parentdelta annotation deltas annotationdeltas i java element delta ijavaelementdelta annotation deltas annotationdeltas to array toarray i java element delta ijavaelementdelta size elements equivalent content find content change findcontentchange java element info javaelementinfo old info oldinfo java element info javaelementinfo new info newinfo i java element ijavaelement new element newelement old info oldinfo member element info memberelementinfo new info newinfo member element info memberelementinfo member element info memberelementinfo old info oldinfo get modifiers getmodifiers member element info memberelementinfo new info newinfo get modifiers getmodifiers delta changed new element newelement i java element delta ijavaelementdelta modifiers old info oldinfo annotatable info annotatableinfo new info newinfo annotatable info annotatableinfo find annotation changes findannotationchanges annotatable info annotatableinfo old info oldinfo annotations annotatable info annotatableinfo new info newinfo annotations new element newelement old info oldinfo source method element info sourcemethodelementinfo new info newinfo source method element info sourcemethodelementinfo source method element info sourcemethodelementinfo old source method info oldsourcemethodinfo source method element info sourcemethodelementinfo old info oldinfo source method element info sourcemethodelementinfo new source method info newsourcemethodinfo source method element info sourcemethodelementinfo new info newinfo char operation charoperation equals old source method info oldsourcemethodinfo get return type name getreturntypename new source method info newsourcemethodinfo get return type name getreturntypename char operation charoperation equals old source method info oldsourcemethodinfo get type parameter names gettypeparameternames new source method info newsourcemethodinfo get type parameter names gettypeparameternames equals old source method info oldsourcemethodinfo get type parameter bounds gettypeparameterbounds new source method info newsourcemethodinfo get type parameter bounds gettypeparameterbounds delta changed new element newelement i java element delta ijavaelementdelta content old info oldinfo source field element info sourcefieldelementinfo new info newinfo source field element info sourcefieldelementinfo char operation charoperation equals source field element info sourcefieldelementinfo old info oldinfo get type name gettypename source field element info sourcefieldelementinfo new info newinfo get type name gettypename delta changed new element newelement i java element delta ijavaelementdelta content old info oldinfo source type element info sourcetypeelementinfo new info newinfo source type element info sourcetypeelementinfo source type element info sourcetypeelementinfo old source type info oldsourcetypeinfo source type element info sourcetypeelementinfo old info oldinfo source type element info sourcetypeelementinfo new source type info newsourcetypeinfo source type element info sourcetypeelementinfo new info newinfo char operation charoperation equals old source type info oldsourcetypeinfo get superclass name getsuperclassname new source type info newsourcetypeinfo get superclass name getsuperclassname char operation charoperation equals old source type info oldsourcetypeinfo get interface names getinterfacenames new source type info newsourcetypeinfo get interface names getinterfacenames delta changed new element newelement i java element delta ijavaelementdelta types char operation charoperation equals old source type info oldsourcetypeinfo get type parameter names gettypeparameternames new source type info newsourcetypeinfo get type parameter names gettypeparameternames equals old source type info oldsourcetypeinfo get type parameter bounds gettypeparameterbounds new source type info newsourcetypeinfo get type parameter bounds gettypeparameterbounds delta changed new element newelement i java element delta ijavaelementdelta content hash map hashmap old type categories oldtypecategories old source type info oldsourcetypeinfo categories hash map hashmap new type categories newtypecategories new source type info newsourcetypeinfo categories old type categories oldtypecategories union categories elements https bugs eclipse org bugs bug cgi elements new type categories newtypecategories elements hash set hashset old type categories oldtypecategories key set keyset elements add all addall new type categories newtypecategories key set keyset elements old type categories oldtypecategories key set keyset iterator iterator elements iterator iterator has next hasnext i java element ijavaelement element i java element ijavaelement iterator string old categories oldcategories string old type categories oldtypecategories element string new categories newcategories new type categories newtypecategories string new type categories newtypecategories element util equal arrays or null equalarraysornull old categories oldcategories new categories newcategories delta changed element i java element delta ijavaelementdelta categories new type categories newtypecategories iterator elements new type categories newtypecategories key set keyset iterator elements has next hasnext i java element ijavaelement element i java element ijavaelement elements categories element removed delta changed element i java element delta ijavaelementdelta categories adds removed deltas handles left table find deletions finddeletions iterator iter infos key set keyset iterator iter has next hasnext i java element ijavaelement element i java element ijavaelement iter delta removed element removed element java element info javaelementinfo get element info getelementinfo i java element ijavaelement element java element info javaelementinfo infos element list item listitem get new position getnewposition i java element ijavaelement element list item listitem new positions newpositions element list item listitem get old position getoldposition i java element ijavaelement element list item listitem old positions oldpositions element initialize infos hash map hashmap old positions oldpositions hash map hashmap new positions newpositions hash map hashmap old positions oldpositions java element javaelement list item listitem new positions newpositions java element javaelement list item listitem hash set hashset removed hash set hashset inserts position elements positions table insert positions insertpositions i java element ijavaelement elements is new isnew length elements length i java element ijavaelement previous current length elements length previous current current length elements is new isnew new positions newpositions current list item listitem previous old positions oldpositions current list item listitem previous returns elements position changed is pos itioned correctly ispositionedcorrectly i java element ijavaelement element list item listitem old list item oldlistitem get old position getoldposition element old list item oldlistitem list item listitem new list item newlistitem get new position getnewposition element new list item newlistitem i java element ijavaelement old previous oldprevious old list item oldlistitem previous i java element ijavaelement new previous newprevious new list item newlistitem previous old previous oldprevious new previous newprevious old previous oldprevious equals new previous newprevious records elements info attempts record info children record element info recordelementinfo i java element ijavaelement element java model javamodel model depth depth max depth maxdepth java element info javaelementinfo info java element info javaelementinfo java model manager javamodelmanager get java model manager getjavamodelmanager get info getinfo element longer java model info infos element info element i parent iparent i java element ijavaelement children info get children getchildren children insert positions insertpositions children length children length length record element info recordelementinfo children model depth i annotation iannotation annotations info annotatable info annotatableinfo annotations annotatable info annotatableinfo info annotations annotations annotation infos annotationinfos annotation infos annotationinfos hash map hashmap java model manager javamodelmanager manager java model manager javamodelmanager get java model manager getjavamodelmanager length annotations length length annotation infos annotationinfos annotations manager get info getinfo annotations fills new positions newpositions hashtable position record new positions recordnewpositions i java element ijavaelement new element newelement depth depth max depth maxdepth new element newelement i parent iparent java element info javaelementinfo info info java element info javaelementinfo java element javaelement new element newelement get element info getelementinfo java model exception javamodelexception npe i java element ijavaelement children info get children getchildren children insert positions insertpositions children length children length length record new positions recordnewpositions children depth repairs pos itioning positioning element removed removed i java element ijavaelement element removed add element list item listitem current get old position getoldposition element list item listitem previous current previous previous get old position getoldposition current previous current get old position getoldposition current previous previous current previous current previous remove element info removeelementinfo i java element ijavaelement element infos remove element string to string tostring string buffer stringbuffer buffer string buffer stringbuffer nls buffer append built delta nls buffer append delta delta to string tostring buffer to string tostring trims deletion deltas report highest level deletion trim delta trimdelta java element delta javaelementdelta element delta elementdelta element delta elementdelta get kind getkind i java element delta ijavaelementdelta removed element delta elementdelta clear affected children clearaffectedchildren i java element delta ijavaelementdelta children element delta elementdelta get affected children getaffectedchildren length children length length trim delta trimdelta java element delta javaelementdelta children