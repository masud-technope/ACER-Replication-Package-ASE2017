copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt actions java util iterator org eclipse core runtime org eclipse jface action i action iaction org eclipse jface action i menu manager imenumanager org eclipse jface action menu manager menumanager org eclipse jface action separator org eclipse jface viewers i selection iselection org eclipse jface viewers i selection changed listener iselectionchangedlistener org eclipse jface viewers i selection provider iselectionprovider org eclipse jface viewers i structured selection istructuredselection org eclipse i action bars iactionbars org eclipse i workbench site iworkbenchsite org eclipse i working set iworkingset org eclipse actions action group actiongroup org eclipse texteditor i text editor action constants itexteditoractionconstants org eclipse jdt i context menu constants icontextmenuconstants org eclipse jdt internal java editor javaeditor java editor javaeditor org eclipse jdt internal search search messages searchmessages org eclipse jdt internal search search util searchutil action group adds search declarations actions context menu global menu bar instantiated intended subclassed noextend intended subclassed clients declarations search group declarationssearchgroup action group actiongroup string menu text search messages searchmessages group declarations i workbench site iworkbenchsite f site fsite java editor javaeditor f editor feditor i action bars iactionbars f action bars factionbars string f group id fgroupid find declarations action finddeclarationsaction f find declarations action ffinddeclarationsaction find declarations in project action finddeclarationsinprojectaction f find declarations in project action ffinddeclarationsinprojectaction find declarations in working set action finddeclarationsinworkingsetaction f find declarations in working set action ffinddeclarationsinworkingsetaction find declarations in hierarchy action finddeclarationsinhierarchyaction f find declarations in hierarchy action ffinddeclarationsinhierarchyaction creates code declarations search group declarationssearchgroup code group requires selection site selection provider type code i structured selection istructuredselection code param site workbench site owns action group declarations search group declarationssearchgroup i workbench site iworkbenchsite site site creates code declarations search group declarationssearchgroup code group requires selection selection provider type link i structured selection istructuredselection param site site action group param special selection provider specialselectionprovider selection provider sites selection provider declarations search group declarationssearchgroup i workbench site iworkbenchsite site i selection provider iselectionprovider special selection provider specialselectionprovider f site fsite site f group id fgroupid i context menu constants icontextmenuconstants group search f find declarations action ffinddeclarationsaction find declarations action finddeclarationsaction site f find declarations action ffinddeclarationsaction set action definition id setactiondefinitionid i java editor action definition ids ijavaeditoractiondefinitionids search declarations workspace f find declarations in project action ffinddeclarationsinprojectaction find declarations in project action finddeclarationsinprojectaction site f find declarations in project action ffinddeclarationsinprojectaction set action definition id setactiondefinitionid i java editor action definition ids ijavaeditoractiondefinitionids search declarations projects f find declarations in hierarchy action ffinddeclarationsinhierarchyaction find declarations in hierarchy action finddeclarationsinhierarchyaction site f find declarations in hierarchy action ffinddeclarationsinhierarchyaction set action definition id setactiondefinitionid i java editor action definition ids ijavaeditoractiondefinitionids search declarations hierarchy f find declarations in working set action ffinddeclarationsinworkingsetaction find declarations in working set action finddeclarationsinworkingsetaction site f find declarations in working set action ffinddeclarationsinworkingsetaction set action definition id setactiondefinitionid i java editor action definition ids ijavaeditoractiondefinitionids search declarations working register actions selection listeners i selection provider iselectionprovider provider special selection provider specialselectionprovider f site fsite get selection provider getselectionprovider special selection provider specialselectionprovider i selection iselection selection provider get selection getselection register action registeraction f find declarations action ffinddeclarationsaction provider selection special selection provider specialselectionprovider register action registeraction f find declarations in project action ffinddeclarationsinprojectaction provider selection special selection provider specialselectionprovider register action registeraction f find declarations in hierarchy action ffinddeclarationsinhierarchyaction provider selection special selection provider specialselectionprovider register action registeraction f find declarations in working set action ffinddeclarationsinworkingsetaction provider selection special selection provider specialselectionprovider note constructor internal clients call constructor param editor java editor noreference constructor intended referenced clients declarations search group declarationssearchgroup java editor javaeditor editor is not null isnotnull editor f editor feditor editor f site fsite f editor feditor get site getsite f group id fgroupid i text editor action constants itexteditoractionconstants group find f find declarations action ffinddeclarationsaction find declarations action finddeclarationsaction f editor feditor f find declarations action ffinddeclarationsaction set action definition id setactiondefinitionid i java editor action definition ids ijavaeditoractiondefinitionids search declarations workspace nls f editor feditor set action setaction search declarations in workspace searchdeclarationsinworkspace f find declarations action ffinddeclarationsaction f find declarations in project action ffinddeclarationsinprojectaction find declarations in project action finddeclarationsinprojectaction f editor feditor f find declarations in project action ffinddeclarationsinprojectaction set action definition id setactiondefinitionid i java editor action definition ids ijavaeditoractiondefinitionids search declarations projects nls f editor feditor set action setaction search declarations in projects searchdeclarationsinprojects f find declarations in project action ffinddeclarationsinprojectaction f find declarations in hierarchy action ffinddeclarationsinhierarchyaction find declarations in hierarchy action finddeclarationsinhierarchyaction f editor feditor f find declarations in hierarchy action ffinddeclarationsinhierarchyaction set action definition id setactiondefinitionid i java editor action definition ids ijavaeditoractiondefinitionids search declarations hierarchy nls f editor feditor set action setaction search declarations in hierarchy searchdeclarationsinhierarchy f find declarations in hierarchy action ffinddeclarationsinhierarchyaction f find declarations in working set action ffinddeclarationsinworkingsetaction find declarations in working set action finddeclarationsinworkingsetaction f editor feditor f find declarations in working set action ffinddeclarationsinworkingsetaction set action definition id setactiondefinitionid i java editor action definition ids ijavaeditoractiondefinitionids search declarations working nls f editor feditor set action setaction search declarations in working set searchdeclarationsinworkingset f find declarations in working set action ffinddeclarationsinworkingsetaction register action registeraction selection dispatch action selectiondispatchaction action i selection provider iselectionprovider provider i selection iselection selection i selection provider iselectionprovider special selection provider specialselectionprovider action update selection provider add selection changed listener addselectionchangedlistener action special selection provider specialselectionprovider action set special selection provider setspecialselectionprovider special selection provider specialselectionprovider override fill action bars fillactionbars i action bars iactionbars action bars actionbars is not null isnotnull action bars actionbars fill action bars fillactionbars action bars actionbars f action bars factionbars action bars actionbars update global action handlers updateglobalactionhandlers add action addaction i action iaction action i menu manager imenumanager manager action is enabled isenabled manager add action add working set action addworkingsetaction i working set iworkingset working sets workingsets i menu manager imenumanager manager find action findaction action f editor feditor action working set find action workingsetfindaction f editor feditor find declarations in working set action finddeclarationsinworkingsetaction f editor feditor working sets workingsets search util searchutil to string tostring working sets workingsets action working set find action workingsetfindaction f site fsite find declarations in working set action finddeclarationsinworkingsetaction f site fsite working sets workingsets search util searchutil to string tostring working sets workingsets action update get context getcontext get selection getselection add action addaction action manager override fill context menu fillcontextmenu i menu manager imenumanager manager i menu manager imenumanager java search m javasearchmm menu manager menumanager menu text i context menu constants icontextmenuconstants group search add action addaction f find declarations action ffinddeclarationsaction java search m javasearchmm add action addaction f find declarations in project action ffinddeclarationsinprojectaction java search m javasearchmm add action addaction f find declarations in hierarchy action ffinddeclarationsinhierarchyaction java search m javasearchmm java search m javasearchmm add separator iterator i working set iworkingset iter search util searchutil getlruworkingsets sorted iterator sortediterator iter has next hasnext add working set action addworkingsetaction iter java search m javasearchmm add action addaction f find declarations in working set action ffinddeclarationsinworkingsetaction java search m javasearchmm java search m javasearchmm is empty isempty manager append to group appendtogroup f group id fgroupid java search m javasearchmm method declared action group actiongroup override dispose i selection provider iselectionprovider provider f site fsite get selection provider getselectionprovider provider dispose action disposeaction f find declarations action ffinddeclarationsaction provider dispose action disposeaction f find declarations in project action ffinddeclarationsinprojectaction provider dispose action disposeaction f find declarations in hierarchy action ffinddeclarationsinhierarchyaction provider dispose action disposeaction f find declarations in working set action ffinddeclarationsinworkingsetaction provider f find declarations action ffinddeclarationsaction f find declarations in project action ffinddeclarationsinprojectaction f find declarations in hierarchy action ffinddeclarationsinhierarchyaction f find declarations in working set action ffinddeclarationsinworkingsetaction update global action handlers updateglobalactionhandlers dispose update global action handlers updateglobalactionhandlers f action bars factionbars f action bars factionbars set global action handler setglobalactionhandler jdt action constants jdtactionconstants find declarations workspace f find declarations action ffinddeclarationsaction f action bars factionbars set global action handler setglobalactionhandler jdt action constants jdtactionconstants find declarations project f find declarations in project action ffinddeclarationsinprojectaction f action bars factionbars set global action handler setglobalactionhandler jdt action constants jdtactionconstants find declarations hierarchy f find declarations in hierarchy action ffinddeclarationsinhierarchyaction f action bars factionbars set global action handler setglobalactionhandler jdt action constants jdtactionconstants find declarations working f find declarations in working set action ffinddeclarationsinworkingsetaction dispose action disposeaction i selection changed listener iselectionchangedlistener action i selection provider iselectionprovider provider action provider remove selection changed listener removeselectionchangedlistener action