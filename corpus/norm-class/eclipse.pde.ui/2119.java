copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde api tools internal search java buffered writer bufferedwriter java file java file output stream fileoutputstream java i o exception ioexception java output stream writer outputstreamwriter org eclipse core runtime core exception coreexception org eclipse pde api tools internal i api core constants iapicoreconstants org eclipse pde api tools internal provisional search i api search requestor iapisearchrequestor org eclipse pde api tools internal provisional search i metadata imetadata org eclipse pde api tools internal util util org dom document org dom element implementation link i metadata imetadata api scans use metadata usemetadata i metadata imetadata xml tag scan nls string run atdate runatdate run atdate runatdate xml tag search flags nls string flags flags xml tag baseline location nls string baseline location baselinelocation baselinelocation xml tag report location nls string report location reportlocation reportlocation xml tag scope pattern nls string scope pattern scopepattern scope pattern scopepattern xml tag reference pattern nls string reference pattern referencepattern reference pattern referencepattern xml tag api patterns nls string api patterns apipatterns api patterns apipatterns xml tag internal patterns nls string internal patterns internalpatterns internal patterns internalpatterns xml tag archive patterns nls string arch ivepatterns archivepatterns archivepatterns xml tag pattern nls string pattern pattern xml tag nls string root tag metadata file nls string metadata metadata xml tag description field nls string description description xml tag additional filters nls string add itionalfilters additionalfilters additional filters additionalfilters search flags searchflags string api patterns apipatterns int patterns intpatterns archivepatterns string baselinelocation reportlocation scope pattern scopepattern ref pattern refpattern run atdate runatdate description additional filters additionalfilters constructor use metadata usemetadata create empty metadata object constructor param search flags searchflags param scope pattern scopepattern param ref pattern refpattern param baselinelocation param reportlocation param api patterns apipatterns param internal patterns internalpatterns param archivepatterns param run atdate runatdate param description use metadata usemetadata search flags searchflags string scope pattern scopepattern string ref pattern refpattern string baselinelocation string reportlocation string api patterns apipatterns string internal patterns internalpatterns string archivepatterns string run atdate runatdate string description search flags searchflags search flags searchflags scope pattern scopepattern scope pattern scopepattern ref pattern refpattern ref pattern refpattern baselinelocation baselinelocation reportlocation reportlocation api patterns apipatterns api patterns apipatterns int patterns intpatterns internal patterns internalpatterns archivepatterns archivepatterns run atdate runatdate run atdate runatdate description description constructor param search flags searchflags param scope pattern scopepattern param ref pattern refpattern param baselinelocation param reportlocation param api patterns apipatterns param internal patterns internalpatterns param archivepatterns param additional filters additionalfilters param run atdate runatdate param description use metadata usemetadata search flags searchflags string scope pattern scopepattern string ref pattern refpattern string baselinelocation string reportlocation string api patterns apipatterns string internal patterns internalpatterns string archivepatterns string additional filters additionalfilters string run atdate runatdate string description search flags searchflags search flags searchflags scope pattern scopepattern scope pattern scopepattern ref pattern refpattern ref pattern refpattern baselinelocation baselinelocation reportlocation reportlocation api patterns apipatterns api patterns apipatterns int patterns intpatterns internal patterns internalpatterns archivepatterns archivepatterns additional filters additionalfilters additional filters additionalfilters run atdate runatdate run atdate runatdate description description override serialize to file serializetofile file file i o exception ioexception core exception coreexception buffered writer bufferedwriter writer document doc util new document newdocument element root doc create element createelement metadata doc append child appendchild root element child doc create element createelement flags root append child appendchild child child set attribute setattribute integer to string tostring search flags searchflags child doc create element createelement run atdate runatdate root append child appendchild child child set attribute setattribute run atdate runatdate child doc create element createelement description root append child appendchild child child set attribute setattribute description child doc create element createelement baseline location baselinelocation root append child appendchild child child set attribute setattribute baselinelocation child doc create element createelement report location reportlocation root append child appendchild child child set attribute setattribute reportlocation child doc create element createelement scope pattern scopepattern root append child appendchild child child set attribute setattribute scope pattern scopepattern child doc create element createelement reference pattern referencepattern root append child appendchild child child set attribute setattribute ref pattern refpattern child doc create element createelement api patterns apipatterns root append child appendchild child element api patterns apipatterns api patterns apipatterns length doc create element createelement pattern child append child appendchild set attribute setattribute api patterns apipatterns child doc create element createelement internal patterns internalpatterns root append child appendchild child int patterns intpatterns int patterns intpatterns length doc create element createelement pattern child append child appendchild set attribute setattribute int patterns intpatterns child doc create element createelement arch ivepatterns archivepatterns root append child appendchild child archivepatterns archivepatterns length doc create element createelement pattern child append child appendchild set attribute setattribute archivepatterns child doc create element createelement add itionalfilters additionalfilters root append child appendchild child child set attribute setattribute additional filters additionalfilters writer buffered writer bufferedwriter output stream writer outputstreamwriter file output stream fileoutputstream file i api core constants iapicoreconstants utf writer write util serialize document serializedocument doc writer flush writer writer close search flags include searching api references includesapi search flags searchflags i api search requestor iapisearchrequestor include api search flags include searching internal references includes internal includesinternal search flags searchflags i api search requestor iapisearchrequestor include internal search flags include searching illegal includes illegal use includesillegaluse search flags searchflags i api search requestor iapisearchrequestor include illegal method accepts code code param set run at date setrunatdate string run atdate runatdate returns metadata code code code code string get run at date getrunatdate run atdate runatdate returns human readable description scan description string get description getdescription description human readable description method accepts code code param description description set description setdescription string description description description combined search flags param flags search flags set search flags setsearchflags flags search flags searchflags flags returns collection api patterns metadata code code api patterns code code string get api patterns getapipatterns api patterns apipatterns api patterns method accepts code code param patterns patterns set api patterns setapipatterns string patterns api patterns apipatterns patterns returns collection internal patterns metadata code code internal patterns code code string get internal patterns getinternalpatterns int patterns intpatterns internal patterns method accepts code code param patterns internal patterns set internal patterns setinternalpatterns string patterns int patterns intpatterns patterns returns collection archive patterns metadata code code archive patterns code code string get archive patterns getarchivepatterns archivepatterns archive patterns method accepts code code param patterns archive patterns set archive patterns setarchivepatterns string patterns archivepatterns patterns returns additional filter metadata code code additional filter code code string get additional filters getadditionalfilters additional filters additionalfilters additional filters method accepts code code param additional filter set additional filters setadditionalfilters string additional filters additionalfilters additional filters additionalfilters additional filters additionalfilters returns baseline location metadata code code baseline location code code string get baseline location getbaselinelocation baselinelocation baseline location method accepts code code param location location set baseline location setbaselinelocation string location baselinelocation location returns report location metadata code code report location code code string get report location getreportlocation reportlocation report location method accepts code code param location report location set report location setreportlocation string location reportlocation location reference pattern method accepts code code param pattern pattern set reference pattern setreferencepattern string pattern ref pattern refpattern pattern returns reference pattern metadata code code reference pattern code code string get reference pattern getreferencepattern ref pattern refpattern scope pattern method accepts code code param pattern pattern set scope pattern setscopepattern string pattern scope pattern scopepattern pattern returns scope pattern metadata code code scope pattern code code string get scope pattern getscopepattern scope pattern scopepattern