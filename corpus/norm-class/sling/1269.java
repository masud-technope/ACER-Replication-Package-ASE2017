licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache sling installer provider jcr impl javax jcr node javax jcr session org apache sling commons testing jcr event helper eventhelper org apache sling commons testing jcr repository test base repositorytestbase org apache sling jcr api sling repository slingrepository org junit test verify jcr installer jcrinstaller scans folders needed scan ning loop test scanninglooptest repository test base repositorytestbase timeout jcr installer jcrinstaller installer sling repository slingrepository repository mock osgi installer mockosgiinstaller osgi installer osgiinstaller content helper contenthelper content helper contenthelper session session event helper eventhelper event helper eventhelper override set up setup exception set up setup repository get repository getrepository osgi installer osgiinstaller mock osgi installer mockosgiinstaller installer misc util miscutil get jcr installer getjcrinstaller repository osgi installer osgiinstaller session repository login administrative loginadministrative repository get default workspace getdefaultworkspace event helper eventhelper event helper eventhelper session content helper contenthelper content helper contenthelper session content helper contenthelper setup folders setupfolders override tear down teardown exception tear down teardown installer deactivate misc util miscutil get mock component context getmockcomponentcontext misc util miscutil wait for installer thread waitforinstallerthread installer timeout installer content helper contenthelper cleanup content cleanupcontent content helper contenthelper delete quietly deletequietly jcr installer jcrinstaller pause scan node path session session log out logout session assert counter assertcounter assert equals assertequals counter installer get count ers getcounters assert idle assertidle exception installer get count ers getcounters jcr installer jcrinstaller scan folders counter installer get count ers getcounters jcr installer jcrinstaller update folders list counter thread sleep jcr installer jcrinstaller loop delay msec assert counter assertcounter jcr installer jcrinstaller scan folders counter assert counter assertcounter jcr installer jcrinstaller update folders list counter assert events assertevents string info old count oldcount counter index counterindex new count newcount installer get count ers getcounters counter index counterindex assert true asserttrue info old count oldcount new count newcount new count newcount old count oldcount test test idle state testidlestate exception thread sleep jcr installer jcrinstaller loop delay msec assert idle assertidle test default scan pause false testdefaultscanpausefalse exception assert false assertfalse installer scanning is paused scanningispaused installer get configuration getconfiguration installer get session getsession test pause scan testpausescan exception assert false assertfalse installer scanning is paused scanningispaused installer get configuration getconfiguration installer get session getsession node content helper contenthelper create folder createfolder jcr installer jcrinstaller pause scan node path node test node testnode add node addnode foo pause session save event helper eventhelper wait for events waitforevents timeout assert true asserttrue installer scanning is paused scanningispaused installer get configuration getconfiguration installer get session getsession installer get count ers getcounters jcr installer jcrinstaller scan folders counter installer get count ers getcounters jcr installer jcrinstaller update folders list counter thread sleep jcr installer jcrinstaller loop delay msec count ers counters changed scanning performed assert equals assertequals installer get count ers getcounters jcr installer jcrinstaller scan folders counter resume test node testnode remove session save thread sleep jcr installer jcrinstaller loop delay msec count ers counters changed assert idle assertidle test test add bundle testaddbundle exception content helper contenthelper create or update file createorupdatefile content helper contenthelper fake resources event helper eventhelper wait for events waitforevents timeout thread sleep jcr installer jcrinstaller loop delay msec assert idle assertidle test add content out side testaddcontentoutside exception installer get count ers getcounters jcr installer jcrinstaller scan folders counter installer get count ers getcounters jcr installer jcrinstaller update folders list counter content helper contenthelper create or update file createorupdatefile system current time millis currenttimemillis event helper eventhelper wait for events waitforevents timeout thread sleep jcr installer jcrinstaller loop delay msec adding file libs apps wake scan loop assert counter assertcounter jcr installer jcrinstaller scan folders counter assert counter assertcounter jcr installer jcrinstaller update folders list counter test delete file testdeletefile exception content helper contenthelper setup content setupcontent event helper eventhelper wait for events waitforevents timeout thread sleep jcr installer jcrinstaller loop delay msec assert idle assertidle installer get count ers getcounters jcr installer jcrinstaller scan folders counter content helper contenthelper delete content helper contenthelper fake resources event helper eventhelper wait for events waitforevents timeout thread sleep jcr installer jcrinstaller loop delay msec assert events assertevents expected folder scan event jcr installer jcrinstaller scan folders counter assert idle assertidle test delete libs folder testdeletelibsfolder exception content helper contenthelper setup content setupcontent event helper eventhelper wait for events waitforevents timeout thread sleep jcr installer jcrinstaller loop delay msec assert idle assertidle installer get count ers getcounters jcr installer jcrinstaller update folders list counter content helper contenthelper delete libs event helper eventhelper wait for events waitforevents timeout thread sleep jcr installer jcrinstaller loop delay msec assert events assertevents expected folders list update event jcr installer jcrinstaller update folders list counter assert idle assertidle string get parent path getparentpath string abs path abspath pos abs path abspath last index of lastindexof abs path abspath substring pos