copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse ltk internal core refactoring resource java util array list arraylist java util arrays java util iterator java util list org eclipse core runtime org eclipse core runtime i path ipath org eclipse core resources i file ifile org eclipse core resources i resource iresource org eclipse core resources mapping i resource change description factory iresourcechangedescriptionfactory org eclipse ltk core refactoring refactoring status refactoringstatus org eclipse ltk core refactoring participants copy arguments copyarguments org eclipse ltk core refactoring participants copy participant copyparticipant org eclipse ltk core refactoring participants create arguments createarguments org eclipse ltk core refactoring participants create participant createparticipant org eclipse ltk core refactoring participants delete arguments deletearguments org eclipse ltk core refactoring participants delete participant deleteparticipant org eclipse ltk core refactoring participants move arguments movearguments org eclipse ltk core refactoring participants move participant moveparticipant org eclipse ltk core refactoring participants participant manager participantmanager org eclipse ltk core refactoring participants refactoring participant refactoringparticipant org eclipse ltk core refactoring participants refactoring processor refactoringprocessor org eclipse ltk core refactoring participants rename arguments renamearguments org eclipse ltk core refactoring participants rename participant renameparticipant org eclipse ltk core refactoring participants sharable participants sharableparticipants data structure collect resource modifications resource modifications resourcemodifications list i resource iresource f create fcreate list i resource iresource f delete fdelete list i resource iresource f move fmove list move arguments movearguments f move arguments fmovearguments list i resource iresource f rename frename list rename arguments renamearguments f rename arguments frenamearguments list i resource iresource f copy fcopy list copy arguments copyarguments f copy arguments fcopyarguments f ignore count fignorecount list delta description deltadescription f delta descriptions fdeltadescriptions delta description deltadescription i resource iresource f resource fresource delta description deltadescription i resource iresource resource f resource fresource resource build delta builddelta i resource change description factory iresourcechangedescriptionfactory builder i path ipath get destination path getdestinationpath delete description deletedescription delta description deltadescription delete description deletedescription i resource iresource resource resource override build delta builddelta i resource change description factory iresourcechangedescriptionfactory builder builder delete f resource fresource override i path ipath get destination path getdestinationpath changed description changeddescription delta description deltadescription changed description changeddescription i file ifile resource resource override build delta builddelta i resource change description factory iresourcechangedescriptionfactory builder builder change i file ifile f resource fresource override i path ipath get destination path getdestinationpath create description createdescription delta description deltadescription create description createdescription i resource iresource resource resource override build delta builddelta i resource change description factory iresourcechangedescriptionfactory builder builder create f resource fresource override i path ipath get destination path getdestinationpath f resource fresource get full path getfullpath move description movedescription delta description deltadescription i path ipath f destination fdestination move description movedescription i resource iresource resource i path ipath destination resource f destination fdestination destination override build delta builddelta i resource change description factory iresourcechangedescriptionfactory builder builder move f resource fresource f destination fdestination override i path ipath get destination path getdestinationpath f destination fdestination copy description copydescription delta description deltadescription i path ipath f destination fdestination copy description copydescription i resource iresource resource i path ipath destination resource f destination fdestination destination override build delta builddelta i resource change description factory iresourcechangedescriptionfactory builder builder copy f resource fresource f destination fdestination override i path ipath get destination path getdestinationpath f destination fdestination adds file list changed files param file changed file add changed addchanged i file ifile file f ignore count fignorecount internal add internaladd changed description changeddescription file adds resource list resources created param create resource add list resources created add create addcreate i resource iresource create f create fcreate f create fcreate array list arraylist f create fcreate add create f ignore count fignorecount internal add internaladd create description createdescription create adds resource list resources deleted param delete resource deleted add delete adddelete i resource iresource delete f delete fdelete f delete fdelete array list arraylist f delete fdelete add delete f ignore count fignorecount internal add internaladd delete description deletedescription delete adds resource list resources moved param move resource moved param arguments move arguments add move addmove i resource iresource move move arguments movearguments arguments f move fmove f move fmove array list arraylist f move arguments fmovearguments array list arraylist f move fmove add move f move arguments fmovearguments add arguments f ignore count fignorecount i path ipath destination i resource iresource arguments get destination getdestination get full path getfullpath append move get name getname internal add internaladd move description movedescription move destination adds resource list resources copied param copy resource copied param arguments copy arguments add copy addcopy i resource iresource copy copy arguments copyarguments arguments f copy fcopy f copy fcopy array list arraylist f copy arguments fcopyarguments array list arraylist f copy fcopy add copy f copy arguments fcopyarguments add arguments add copy delta addcopydelta copy arguments adds resource list renamed resources param rename resource renamed param arguments arguments rename add rename addrename i resource iresource rename rename arguments renamearguments arguments is not null isnotnull rename is not null isnotnull arguments f rename frename f rename frename array list arraylist f rename arguments frenamearguments array list arraylist f rename frename add rename f rename arguments frenamearguments add arguments f ignore count fignorecount i path ipath new path newpath rename get full path getfullpath remove last segments removelastsegments append arguments get new name getnewname internal add internaladd move description movedescription rename new path newpath refactoring participant refactoringparticipant get participants getparticipants refactoring status refactoringstatus status refactoring processor refactoringprocessor processor string natures sharable participants sharableparticipants shared list refactoring participant refactoringparticipant result array list arraylist f delete fdelete delete arguments deletearguments arguments delete arguments deletearguments iterator i resource iresource iter f delete fdelete iterator iter has next hasnext delete participant deleteparticipant deletes participant manager participantmanager load delete participants loaddeleteparticipants status processor iter arguments natures shared result add all addall arrays as list aslist deletes f create fcreate create arguments createarguments arguments create arguments createarguments iterator i resource iresource iter f create fcreate iterator iter has next hasnext create participant createparticipant creates participant manager participantmanager load create participants loadcreateparticipants status processor iter arguments natures shared result add all addall arrays as list aslist creates f move fmove f move fmove size object element f move fmove move arguments movearguments arguments f move arguments fmovearguments move participant moveparticipant moves participant manager participantmanager load move participants loadmoveparticipants status processor element arguments natures shared result add all addall arrays as list aslist moves f copy fcopy f copy fcopy size object element f copy fcopy copy arguments copyarguments arguments f copy arguments fcopyarguments copy participant copyparticipant copies participant manager participantmanager load copy participants loadcopyparticipants status processor element arguments natures shared result add all addall arrays as list aslist copies f rename frename f rename frename size object resource f rename frename rename arguments renamearguments arguments f rename arguments frenamearguments rename participant renameparticipant renames participant manager participantmanager load rename participants loadrenameparticipants status processor resource arguments natures shared result add all addall arrays as list aslist renames result to array toarray refactoring participant refactoringparticipant result size ignore for delta ignorefordelta f ignore count fignorecount track for delta trackfordelta f ignore count fignorecount add delta adddelta delta description deltadescription description f ignore count fignorecount internal add internaladd description add copy delta addcopydelta i resource iresource copy copy arguments copyarguments arguments f ignore count fignorecount i path ipath destination i resource iresource arguments get destination getdestination get full path getfullpath append copy get name getname internal add internaladd copy description copydescription copy destination checks resource exist based recorded resource modifications param resource resource check resource exist will exist willexist i resource iresource resource f delta descriptions fdeltadescriptions i path ipath full path fullpath resource get full path getfullpath iterator delta description deltadescription iter f delta descriptions fdeltadescriptions iterator iter has next hasnext delta description deltadescription delta iter full path fullpath equals delta get destination path getdestinationpath build delta builddelta i resource change description factory iresourcechangedescriptionfactory builder f delta descriptions fdeltadescriptions iterator delta description deltadescription iter f delta descriptions fdeltadescriptions iterator iter has next hasnext iter build delta builddelta builder build move delta buildmovedelta i resource change description factory iresourcechangedescriptionfactory builder i resource iresource resource rename arguments renamearguments args i path ipath new path newpath resource get full path getfullpath remove last segments removelastsegments append args get new name getnewname builder move resource new path newpath build move delta buildmovedelta i resource change description factory iresourcechangedescriptionfactory builder i resource iresource resource move arguments movearguments args i path ipath destination i resource iresource args get destination getdestination get full path getfullpath append resource get name getname builder move resource destination build copy delta buildcopydelta i resource change description factory iresourcechangedescriptionfactory builder i resource iresource resource copy arguments copyarguments args i path ipath destination i resource iresource args get destination getdestination get full path getfullpath append resource get name getname builder copy resource destination internal add internaladd delta description deltadescription description f delta descriptions fdeltadescriptions f delta descriptions fdeltadescriptions array list arraylist f delta descriptions fdeltadescriptions add description