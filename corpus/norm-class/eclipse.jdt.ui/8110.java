copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse ltk internal core refactoring resource org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse core resources i container icontainer org eclipse core resources i project iproject org eclipse core resources i resource iresource org eclipse core resources mapping i resource change description factory iresourcechangedescriptionfactory org eclipse ltk core refactoring change org eclipse ltk core refactoring refactoring change descriptor refactoringchangedescriptor org eclipse ltk core refactoring refactoring descriptor refactoringdescriptor org eclipse ltk core refactoring refactoring status refactoringstatus org eclipse ltk core refactoring participants check conditions context checkconditionscontext org eclipse ltk core refactoring participants participant manager participantmanager org eclipse ltk core refactoring participants refactoring participant refactoringparticipant org eclipse ltk core refactoring participants rename arguments renamearguments org eclipse ltk core refactoring participants rename processor renameprocessor org eclipse ltk core refactoring participants resource change checker resourcechangechecker org eclipse ltk core refactoring participants sharable participants sharableparticipants org eclipse ltk core refactoring resource rename resource change renameresourcechange org eclipse ltk core refactoring resource rename resource descriptor renameresourcedescriptor org eclipse ltk internal core refactoring basic element labels basicelementlabels org eclipse ltk internal core refactoring messages org eclipse ltk internal core refactoring refactoring core messages refactoringcoremessages org eclipse ltk internal core refactoring resources rename processor link i resource iresource processor rename resource load rename participants references renamed rename resource processor renameresourceprocessor rename processor renameprocessor i resource iresource f resource fresource string f new resource name fnewresourcename f update references fupdatereferences check final conditions checkfinalconditions rename arguments renamearguments f rename arguments frenamearguments creates rename resource processor param resource resource rename rename resource processor renameresourceprocessor i resource iresource resource resource resource exists nls illegal argument exception illegalargumentexception resource exist f resource fresource resource f rename arguments frenamearguments f update references fupdatereferences initialize set new resource name setnewresourcename resource get name getname returns resource processor created resource rename i resource iresource get resource getresource f resource fresource returns resource resource string get new resource name getnewresourcename f new resource name fnewresourcename sets resource param new name newname resource set new resource name setnewresourcename string new name newname is not null isnotnull new name newname f new resource name fnewresourcename new name newname returns code code refactoring processor updates references code code refactoring processor updates references is update references isupdatereferences f update references fupdatereferences specifies refactoring processor updates references behaviour update references param update references updatereferences code code refactoring processor updates references set update references setupdatereferences update references updatereferences f update references fupdatereferences update references updatereferences override refactoring status refactoringstatus check initial conditions checkinitialconditions i progress monitor iprogressmonitor core exception coreexception refactoring status refactoringstatus create resources check in sync checkinsync f resource fresource override refactoring status refactoringstatus check final conditions checkfinalconditions i progress monitor iprogressmonitor check conditions context checkconditionscontext context core exception coreexception nls begin task begintask f rename arguments frenamearguments rename arguments renamearguments get new resource name getnewresourcename is update references isupdatereferences resource change checker resourcechangechecker checker context get checker getchecker resource change checker resourcechangechecker i resource change description factory iresourcechangedescriptionfactory delta factory deltafactory checker get delta factory getdeltafactory resource modifications resourcemodifications build move delta buildmovedelta delta factory deltafactory f resource fresource f rename arguments frenamearguments refactoring status refactoringstatus valid ates validates valid method change settings refactoring intended wizard validate user input param new name newname validate returns status validation refactoring status refactoringstatus validate new element name validatenewelementname string new name newname nls is not null isnotnull new name newname i container icontainer f resource fresource get parent getparent refactoring status refactoringstatus create fatal error status createfatalerrorstatus refactoring core messages refactoringcoremessages rename resource processor renameresourceprocessor error parent get full path getfullpath is valid segment isvalidsegment new name newname refactoring status refactoringstatus create fatal error status createfatalerrorstatus refactoring core messages refactoringcoremessages rename resource processor renameresourceprocessor error invalid find member findmember new name newname refactoring status refactoringstatus create fatal error status createfatalerrorstatus refactoring core messages refactoringcoremessages rename resource processor renameresourceprocessor error resource exists refactoring status refactoringstatus result refactoring status refactoringstatus create get workspace getworkspace validate name validatename new name newname f resource fresource get type gettype result has fatal error hasfatalerror result merge refactoring status refactoringstatus create get workspace getworkspace validate path validatepath create new path createnewpath new name newname f resource fresource get type gettype result rename resource descriptor renameresourcedescriptor create descriptor createdescriptor i resource iresource resource get resource getresource rename resource descriptor renameresourcedescriptor descriptor rename resource descriptor renameresourcedescriptor descriptor set project setproject resource i project iproject resource get project getproject get name getname descriptor set description setdescription messages format refactoring core messages refactoringcoremessages rename resource processor renameresourceprocessor description basic element labels basicelementlabels get resource name getresourcename resource descriptor set comment setcomment messages format refactoring core messages refactoringcoremessages rename resource processor renameresourceprocessor comment string basic element labels basicelementlabels get path label getpathlabel resource get full path getfullpath basic element labels basicelementlabels get resource name getresourcename get new resource name getnewresourcename descriptor set flags setflags refactoring descriptor refactoringdescriptor structural change refactoring descriptor refactoringdescriptor multi change refactoring descriptor refactoringdescriptor breaking change descriptor set resource path setresourcepath resource get full path getfullpath descriptor set new name setnewname get new resource name getnewresourcename descriptor set update references setupdatereferences is update references isupdatereferences descriptor override change create change createchange i progress monitor iprogressmonitor core exception coreexception nls begin task begintask rename resource change renameresourcechange change rename resource change renameresourcechange f resource fresource get full path getfullpath get new resource name getnewresourcename change set descriptor setdescriptor refactoring change descriptor refactoringchangedescriptor create descriptor createdescriptor change string create new path createnewpath string new name newname f resource fresource get full path getfullpath remove last segments removelastsegments append new name newname to string tostring override object get elements getelements object f resource fresource override string get identifier getidentifier nls org eclipse ltk core refactoring rename resource processor renameresourceprocessor override string get processor name getprocessorname refactoring core messages refactoringcoremessages rename resource processor renameresourceprocessor processor override is applicable isapplicable f resource fresource f resource fresource exists f resource fresource is accessible isaccessible override refactoring participant refactoringparticipant load participants loadparticipants refactoring status refactoringstatus status sharable participants sharableparticipants shared core exception coreexception string affected natures affectednatures resource processors resourceprocessors compute affected natures computeaffectednatures f resource fresource participant manager participantmanager load rename participants loadrenameparticipants status f resource fresource f rename arguments frenamearguments affected natures affectednatures shared