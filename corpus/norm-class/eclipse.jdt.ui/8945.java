copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse ltk internal core refactoring resource undo states undostates org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core resources i container icontainer org eclipse core resources i marker imarker org eclipse core resources i resource iresource org eclipse core resources i workspace iworkspace org eclipse core resources resource attributes resourceattributes org eclipse core resources resources plugin resourcesplugin base implementation link resource undo state resourceundostate describes common attributes resource created intended instantiated clients abstract resource undo state abstractresourceundostate resource undo state resourceundostate i container icontainer parent local time stamp localtimestamp i resource iresource stamp modification stamp modificationstamp i resource iresource stamp resource attributes resourceattributes resource attributes resourceattributes marker undo state markerundostate marker descriptions markerdescriptions create resource description initial attributes abstract resource undo state abstractresourceundostate create resource resource param resource resource abstract resource undo state abstractresourceundostate i resource iresource resource parent resource get parent getparent resource is accessible isaccessible modification stamp modificationstamp resource get modification stamp getmodificationstamp local time stamp localtimestamp resource get local time stamp getlocaltimestamp resource attributes resourceattributes resource get resource attributes getresourceattributes i marker imarker markers resource find markers findmarkers i resource iresource depth infinite marker descriptions markerdescriptions marker undo state markerundostate markers length markers length marker descriptions markerdescriptions marker undo state markerundostate markers core exception coreexception override i resource iresource create resource createresource i progress monitor iprogressmonitor monitor core exception coreexception i resource iresource resource create resource handle createresourcehandle create existent resource from handle createexistentresourcefromhandle resource monitor restore resource attributes restoreresourceattributes resource resource override is valid isvalid parent parent exists restore saved attribute d attributed resource method called existent resource represented receiver created param resource newly created resource core exception coreexception accessing resource fails restore resource attributes restoreresourceattributes i resource iresource resource core exception coreexception modification stamp modificationstamp i resource iresource stamp resource revert modification stamp revertmodificationstamp modification stamp modificationstamp local time stamp localtimestamp i resource iresource stamp resource set local time stamp setlocaltimestamp local time stamp localtimestamp resource attributes resourceattributes resource set resource attributes setresourceattributes resource attributes resourceattributes marker descriptions markerdescriptions marker descriptions markerdescriptions length marker descriptions markerdescriptions resource exists marker descriptions markerdescriptions create marker createmarker workspace i workspace iworkspace get workspace getworkspace resources plugin resourcesplugin get workspace getworkspace override verify existence verifyexistence check members checkmembers i container icontainer parent get workspace getworkspace get root getroot i resource iresource handle find member findmember get name getname handle