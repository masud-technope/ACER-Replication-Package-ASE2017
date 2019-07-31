copyright software rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors stephan herrmann initial api implementation lars vogel lars vogel vogella contributions bug org eclipse jdt internal core java util hash map hashmap java util map org eclipse core resources i resource change event iresourcechangeevent org eclipse core resources i resource change listener iresourcechangelistener org eclipse core resources i resource delta iresourcedelta org eclipse core resources i workspace iworkspace org eclipse core runtime i path ipath org eclipse jdt core i package fragment root ipackagefragmentroot org eclipse jdt core java model exception javamodelexception org eclipse jdt internal compiler class fmt classfmt external annotation provider externalannotationprovider org eclipse jdt internal core util util track external annotation files trigger closing reloading class files classfiles external annotation tracker externalannotationtracker i resource change listener iresourcechangelistener nodes tree represents external annotation att achments attachments node int ermediate intermediate node annotation base int ermediate intermediate nodes represent workspace structure holding external annotations children note don flatten int ermediate intermediate nodes facilitate matching exact structure resource deltas annotation base leaf represented directory structure map files directory node directorynode directory node directorynode parent i path ipath path key full workspace path map i path ipath directory node directorynode children key path external annotation file eea relative annotation base annotation file exist waiting creation map i path ipath class file classfile class files classfiles todo handling zipped annotations i package fragment root ipackagefragmentroot model root modelroot directory node directorynode directory node directorynode parent i path ipath path parent parent path path map i path ipath directory node directorynode get children getchildren children children hash map hashmap children register class file registerclassfile i path ipath relative annotation path relativeannotationpath class file classfile class file classfile class files classfiles class files classfiles hash map hashmap class files classfiles relative annotation path relativeannotationpath class file classfile model root modelroot model root modelroot class file classfile get package fragment root getpackagefragmentroot unregister class file unregisterclassfile i path ipath relative annotation path relativeannotationpath class files classfiles class files classfiles remove relative annotation path relativeannotationpath class files classfiles is empty isempty parent parent unregister directory unregisterdirectory unregister directory unregisterdirectory directory node directorynode child children children remove child path children children is empty isempty parent parent unregister directory unregisterdirectory override string to string tostring string buffer stringbuffer buf string buffer stringbuffer class files classfiles nls buf append nls annotation base nls buf append directory children nls nls buf append twith append children size append children nls buf append class files classfiles append num class files numclassfiles buf to string tostring num class files numclassfiles class files classfiles class files classfiles size count children directory node directorynode child children values count child num class files numclassfiles count is empty isempty children children is empty isempty class files classfiles class files classfiles is empty isempty tree tracked annotation bases files directory node directorynode tree directory node directorynode external annotation tracker externalannotationtracker singleton external annotation tracker externalannotationtracker start list ening listening start i workspace iworkspace workspace singleton external annotation tracker externalannotationtracker workspace add resource change listener addresourcechangelistener singleton list ening listening clean shutdown i workspace iworkspace workspace workspace remove resource change listener removeresourcechangelistener singleton singleton tree children register class file classfile annotation attachment annotation base annotationbase applies purpose listen external annotations force reloading file param annotation base annotationbase path annotation attachment workspace absolute param relative annotation path relativeannotationpath path qualified main type file path relative annotation base annotationbase app ending appending file extension annotation files points annotation file correspond file annotation file exist param class file classfile class file classfile register register class file registerclassfile i path ipath annotation base annotationbase i path ipath relative annotation path relativeannotationpath class file classfile class file classfile base depth basedepth annotation base annotationbase segment count segmentcount base depth basedepth nls util log illegal argument exception illegalargumentexception annotation base annotationbase empty relative annotation path relativeannotationpath relative annotation path relativeannotationpath add file extension addfileextension external annotation provider externalannotationprovider annotation file extension directory node directorynode base singleton get annotation base getannotationbase singleton tree annotation base annotationbase base depth basedepth base register class file registerclassfile relative annotation path relativeannotationpath class file classfile unregister file closed invoked files external annotations param annotation base annotationbase path annotation attachment workspace absolute param relative annotation path relativeannotationpath path annotation file correspond file unregister class file unregisterclassfile i path ipath annotation base annotationbase i path ipath relative annotation path relativeannotationpath base depth basedepth annotation base annotationbase segment count segmentcount base depth basedepth nls util log illegal argument exception illegalargumentexception annotation base annotationbase empty relative annotation path relativeannotationpath relative annotation path relativeannotationpath add file extension addfileextension external annotation provider externalannotationprovider annotation file extension directory node directorynode base singleton get annotation base getannotationbase singleton tree annotation base annotationbase base depth basedepth base unregister class file unregisterclassfile relative annotation path relativeannotationpath directory node directorynode get annotation base getannotationbase directory node directorynode current i path ipath annotation base annotationbase base depth basedepth next depth nextdepth i path ipath next head nexthead annotation base annotationbase upto segment uptosegment next depth nextdepth create map i path ipath directory node directorynode children current get children getchildren directory node directorynode next head node nextheadnode children next head nexthead next head node nextheadnode children next head nexthead next head node nextheadnode directory node directorynode current next head nexthead base depth basedepth next depth nextdepth next head node nextheadnode get annotation base getannotationbase next head node nextheadnode annotation base annotationbase base depth basedepth next depth nextdepth listen resource change events external annotations affect cached class file classfile override resource changed resourcechanged i resource change event iresourcechangeevent event i resource delta iresourcedelta delta event get delta getdelta delta delta get full path getfullpath is root isroot tree children i resource delta iresourcedelta child delta get affected children getaffectedchildren directory node directorynode directory node directorynode tree children child get full path getfullpath directory node directorynode traverse for dir ectories traversefordirectories directory node directorynode child traversal directory nodes delta nodes traverse for dir ectories traversefordirectories directory node directorynode directory node directorynode i resource delta iresourcedelta matched delta matcheddelta directory node directorynode class files classfiles annotation base reached str ategy strategy traverse for class files traverseforclassfiles directory node directorynode class files classfiles matched delta matcheddelta matched delta matcheddelta get full path getfullpath segment count segmentcount ignore children class files classfiles nested annotation bases tolerated directory node directorynode children i resource delta iresourcedelta child matched delta matcheddelta get affected children getaffectedchildren directory node directorynode child dir childdir directory node directorynode children child get full path getfullpath child dir childdir child get kind getkind i resource delta iresourcedelta removed directory node directorynode children remove child get full path getfullpath traverse for dir ectories traversefordirectories child dir childdir child directory node directorynode is empty isempty directory node directorynode parent children remove matched delta matcheddelta get full path getfullpath traversal delta nodes matched map files traverse for class files traverseforclassfiles map i path ipath class file classfile class files classfiles i resource delta iresourcedelta matched delta matcheddelta base depth basedepth i resource delta iresourcedelta delta matched delta matcheddelta get affected children getaffectedchildren i path ipath delta relative path deltarelativepath delta get full path getfullpath remove first segments removefirstsegments base depth basedepth class file classfile class file classfile class files classfiles remove delta relative path deltarelativepath class file classfile payload unload file changed external annotation file class file classfile close and remove from jar type cache closeandremovefromjartypecache java model exception javamodelexception util log failed close class file classfile class file classfile traverse for class files traverseforclassfiles class files classfiles delta base depth basedepth