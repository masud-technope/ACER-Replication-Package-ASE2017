licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache sling resource merge r resourcemerger impl org junit assert equals assertequals org junit assert not null assertnotnull org junit assert null assertnull org junit assert true asserttrue java util array list arraylist java util collections java util iterator java util list org apache sling api resource modifiable value map modifiablevaluemap org apache sling api resource persistence exception persistenceexception org apache sling api resource resource org apache sling api resource resource resolver resourceresolver org apache sling api resource resource resolver factory resourceresolverfactory org apache sling api resource resource util resourceutil org apache sling api resource value map valuemap org apache sling resource merge r resourcemerger impl picker merging resource picker mergingresourcepicker org apache sling spi resource provider resolver context resolvercontext org apache sling spi resource provider resource context resourcecontext org apache sling testing resource resolver resourceresolver mock helper mockhelper org apache sling testing resource resolver resourceresolver mock resource resolver factory mockresourceresolverfactory org apache sling testing resource resolver resourceresolver mock resource resolver factory options mockresourceresolverfactoryoptions org junit org junit test merged resource provider test mergedresourceprovidertest resource resolver resourceresolver resolver crud merging resource provider crudmergingresourceprovider provider resolver context resolvercontext ctx setup exception mock resource resolver factory options mockresourceresolverfactoryoptions options mock resource resolver factory options mockresourceresolverfactoryoptions options set search paths setsearchpaths string apps libs resource resolver factory resourceresolverfactory factory mock resource resolver factory mockresourceresolverfactory options resolver factory get resource resolver getresourceresolver mock helper mockhelper create resolver resource apps resource merged resource constants mergedresourceconstants hide children string resource resource resource resolver resourceresolver property resource type apps resource merged resource constants mergedresourceconstants hide properties resource merged resource constants mergedresourceconstants hide properties string resource resource apps resource resource resource resource resource libs resource delete test deletetest resource mvm test mvmtest resource resource resource resource resolver resourceresolver property resource type libs resource resource resource resource resource libs resource libs resource libs resource libs resource resource resource resource commit provider crud merging resource provider crudmergingresourceprovider merged merging resource picker mergingresourcepicker ctx basic resolve context basicresolvecontext resolver test test hide children testhidechildren check preconditions libs apps assert not null assertnotnull resolver get resource getresource libs assert null assertnull resolver get resource getresource libs assert not null assertnotnull resolver get resource getresource libs assert null assertnull resolver get resource getresource libs assert null assertnull resolver get resource getresource libs assert null assertnull resolver get resource getresource apps assert not null assertnotnull resolver get resource getresource apps assert null assertnull resolver get resource getresource apps assert null assertnull resolver get resource getresource apps assert null assertnull resolver get resource getresource apps real checks assert null assertnull provider get resource getresource ctx merged resource context resourcecontext empty context assert not null assertnotnull provider get resource getresource ctx merged resource context resourcecontext empty context assert not null assertnotnull provider get resource getresource ctx merged resource context resourcecontext empty context assert null assertnull provider get resource getresource ctx merged resource context resourcecontext empty context assert null assertnull provider get resource getresource ctx merged resource context resourcecontext empty context test test list children testlistchildren resource rsrc a rsrca provider get resource getresource ctx merged resource context resourcecontext empty context assert not null assertnotnull rsrc a rsrca iterator resource provider list children listchildren ctx rsrc a rsrca assert not null assertnotnull list string names array list arraylist string has next hasnext names add get name getname assert equals assertequals names size assert true asserttrue names assert true asserttrue names assert true asserttrue names assert true asserttrue names assert true asserttrue names assert true asserttrue names test test list sub children testlistsubchildren resource rsrc y rsrcy provider get resource getresource ctx merged resource context resourcecontext empty context assert not null assertnotnull rsrc y rsrcy iterator resource provider list children listchildren ctx rsrc y rsrcy assert not null assertnotnull list string names array list arraylist string has next hasnext names add get name getname assert equals assertequals names size assert true asserttrue names assert true asserttrue names assert true asserttrue names test test properties testproperties resource rsrc a rsrca provider get resource getresource ctx merged resource context resourcecontext empty context value map valuemap rsrc a rsrca adapt to adaptto value map valuemap assert not null assertnotnull assert equals assertequals size assert equals assertequals assert equals assertequals assert equals assertequals test test resource type testresourcetype defines property over layed overlayed resource rsrc a rsrca provider get resource getresource ctx merged resource context resourcecontext empty context assert equals assertequals apps rsrc a rsrca get resource type getresourcetype doesn define property over layed overlayed resource rsrc a rsrca provider get resource getresource ctx merged resource context resourcecontext empty context assert equals assertequals rsrc a rsrca get resource type getresourcetype test test clear properties testclearproperties resource rsrc a rsrca provider get resource getresource ctx merged resource context resourcecontext empty context value map valuemap rsrc a rsrca adapt to adaptto value map valuemap assert not null assertnotnull assert equals assertequals size test test hide properties testhideproperties resource rsrc a rsrca provider get resource getresource ctx merged resource context resourcecontext empty context value map valuemap rsrc a rsrca adapt to adaptto value map valuemap assert not null assertnotnull assert equals assertequals size assert equals assertequals assert equals assertequals assert equals assertequals test test simple create and delete testsimplecreateanddelete persistence exception persistenceexception string path merged resource rsrc provider create ctx path collections singleton map singletonmap foo object bla assert not null assertnotnull rsrc assert equals assertequals path rsrc get path getpath value map valuemap resource util resourceutil get value map getvaluemap rsrc assert equals assertequals bla foo resource real resource realresource resolver get resource getresource apps assert not null assertnotnull real resource realresource value map valuemap vm real vmreal resource util resourceutil get value map getvaluemap real resource realresource assert equals assertequals bla vm real vmreal foo assert null assertnull resolver get resource getresource libs provider delete ctx rsrc assert null assertnull provider get resource getresource ctx path resource context resourcecontext empty context assert null assertnull resolver get resource getresource libs assert null assertnull resolver get resource getresource apps resolver revert test test delete by hiding testdeletebyhiding persistence exception persistenceexception string path merged delete test deletetest assert not null assertnotnull resolver get resource getresource libs delete test deletetest assert null assertnull resolver get resource getresource apps delete test deletetest resource rsrc provider get resource getresource ctx path resource context resourcecontext empty context assert not null assertnotnull rsrc assert equals assertequals path rsrc get path getpath provider delete ctx rsrc assert null assertnull provider get resource getresource ctx path resource context resourcecontext empty context assert not null assertnotnull resolver get resource getresource libs delete test deletetest resource hiding rsrc hidingrsrc resolver get resource getresource apps delete test deletetest assert not null assertnotnull hiding rsrc hidingrsrc value map valuemap hiding rsrc hidingrsrc get value map getvaluemap assert equals assertequals merged resource constants mergedresourceconstants hide resource resolver revert test test delete by hiding and create testdeletebyhidingandcreate persistence exception persistenceexception string path merged delete test deletetest assert not null assertnotnull resolver get resource getresource libs delete test deletetest assert null assertnull resolver get resource getresource apps delete test deletetest resource rsrc provider get resource getresource ctx path resource context resourcecontext empty context assert not null assertnotnull rsrc assert equals assertequals path rsrc get path getpath provider delete ctx rsrc provider create ctx path collections singleton map singletonmap foo object bla assert not null assertnotnull provider get resource getresource ctx path resource context resourcecontext empty context assert not null assertnotnull resolver get resource getresource libs delete test deletetest resource hiding rsrc hidingrsrc resolver get resource getresource apps delete test deletetest assert not null assertnotnull hiding rsrc hidingrsrc value map valuemap hiding rsrc hidingrsrc get value map getvaluemap assert equals assertequals bla foo resolver revert test test modifiable value map testmodifiablevaluemap persistence exception persistenceexception string path merged mvm test mvmtest assert not null assertnotnull resolver get resource getresource libs mvm test mvmtest assert null assertnull resolver get resource getresource apps mvm test mvmtest resource rsrc provider get resource getresource ctx path resource context resourcecontext empty context assert not null assertnotnull rsrc value map valuemap beforevm rsrc get value map getvaluemap assert equals assertequals beforevm assert equals assertequals beforevm modifiable value map modifiablevaluemap mvm rsrc adapt to adaptto modifiable value map modifiablevaluemap assert not null assertnotnull mvm assert equals assertequals mvm assert equals assertequals mvm mvm mvm remove assert not null assertnotnull resolver get resource getresource libs mvm test mvmtest assert not null assertnotnull resolver get resource getresource apps mvm test mvmtest resource rsrc provider get resource getresource ctx path resource context resourcecontext empty context assert not null assertnotnull rsrc value map valuemap aftervm rsrc get value map getvaluemap assert null assertnull aftervm assert equals assertequals aftervm assert equals assertequals aftervm resource rsrc l rsrcl resolver get resource getresource libs mvm test mvmtest assert equals assertequals rsrc l rsrcl get value map getvaluemap assert equals assertequals rsrc l rsrcl get value map getvaluemap assert null assertnull rsrc l rsrcl get value map getvaluemap resource rsrc a rsrca resolver get resource getresource apps mvm test mvmtest assert null assertnull rsrc a rsrca get value map getvaluemap assert null assertnull rsrc a rsrca get value map getvaluemap assert equals assertequals rsrc a rsrca get value map getvaluemap string hidden rsrc a rsrca get value map getvaluemap merged resource constants mergedresourceconstants hide properties string assert not null assertnotnull hidden assert equals assertequals hidden length assert equals assertequals hidden resolver revert test test get with related resource testgetwithrelatedresource string path merged string related paths relatedpaths string resource merged parent parent merged parent merged merged child merged deep child merged string related path relatedpath related paths relatedpaths resource related resource relatedresource related path relatedpath related resource relatedresource provider get resource getresource ctx related path relatedpath resource context resourcecontext empty context assert not null assertnotnull related path relatedpath related resource relatedresource related resource relatedresource resource resource provider get resource getresource ctx path resource context resourcecontext empty context related resource relatedresource assert not null assertnotnull resource assert equals assertequals path resource get path getpath assert true asserttrue resource merged resource mergedresource merged resource mergedresource merged resource mergedresource merged resource mergedresource resource list resource mapped resources mappedresources merged resource mergedresource get mapped resources getmappedresources assert equals assertequals mapped resources mappedresources size assert equals assertequals mapped resources mappedresources get path getpath libs assert equals assertequals mapped resources mappedresources get path getpath apps