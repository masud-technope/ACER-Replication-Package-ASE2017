licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache tomcat jdbc pool int erceptor interceptor java text simple date format simpledateformat java util array list arraylist java util collections java util comparator java util locale java util map java util time zone timezone java util concurrent concurrent hash map concurrenthashmap javax management open mbean openmbean composite data support compositedatasupport javax management open mbean openmbean composite type compositetype javax management open mbean openmbean open data exception opendataexception javax management open mbean openmbean open type opentype javax management open mbean openmbean simple type simpletype org apache juli logging log org apache juli logging log factory logfactory org apache tomcat jdbc pool connection pool connectionpool org apache tomcat jdbc pool pool properties poolproperties interceptor property interceptorproperty org apache tomcat jdbc pool pooled connection pooledconnection slow query report int erceptor interceptor tracks timing query executions author filip hanik version slow query report slowqueryreport abstract query report abstractqueryreport logger log log log factory logfactory get log getlog slow query report slowqueryreport keeping track query stats pool basis concurrent hash map concurrenthashmap string concurrent hash map concurrenthashmap string query stats querystats per pool stats perpoolstats concurrent hash map concurrenthashmap string concurrent hash map concurrenthashmap string query stats querystats queries int erceptor interceptor concurrent hash map concurrenthashmap string query stats querystats queries maximum number queries storing don store amount queries max queries maxqueries sort query stats querystats invocation time comparator query stats querystats query stats comparator querystatscomparator query stats comparator querystatscomparator returns query stats pool param pool name poolname pool retrieve stats hash map statistics max queries maxqueries concurrent hash map concurrenthashmap string query stats querystats get pool stats getpoolstats string pool name poolname per pool stats perpoolstats pool name poolname creates slow query report int erceptor interceptor slow query report slowqueryreport set max queries setmaxqueries max queries maxqueries max queries maxqueries max queries maxqueries override string report failed query reportfailedquery string query object args string start throwable string sql report failed query reportfailedquery query args start max queries maxqueries system current time millis currenttimemillis delta start query stats querystats get query stats getquerystats sql failure delta log is warn enabled iswarnenabled log warn failed query report sql sql time delta sql override string report query reportquery string query object args string start delta string sql report query reportquery query args start delta max queries maxqueries query stats querystats get query stats getquerystats sql add delta start sql override string report slow query reportslowquery string query object args string start delta string sql report slow query reportslowquery query args start delta max queries maxqueries query stats querystats get query stats getquerystats sql add delta start log is warn enabled iswarnenabled log warn slow query report sql sql time delta sql invoked connection receives close request override close invoke d closeinvoked noop override prepare statement preparestatement string sql time max queries maxqueries query stats querystats get query stats getquerystats sql prepare time override prepare call preparecall string sql time max queries maxqueries query stats querystats get query stats getquerystats sql prepare time inherit doc inheritdoc override pool started poolstarted connection pool connectionpool pool pool started poolstarted pool created map pool queries slow query report slowqueryreport per pool stats perpoolstats pool get name getname queries create map hold stats todo improve eviction selection queries concurrent hash map concurrenthashmap string query stats querystats per pool stats perpoolstats put if absent putifabsent pool get name getname queries queries slow query report slowqueryreport per pool stats perpoolstats pool get name getname inherit doc inheritdoc override pool closed poolclosed connection pool connectionpool pool per pool stats perpoolstats remove pool get name getname pool closed poolclosed pool query stats querystats get query stats getquerystats string sql sql sql concurrent hash map concurrenthashmap string query stats querystats queries slow query report slowqueryreport queries queries log is warn enabled iswarnenabled log warn connection closed abandoned query stats querystats queries sql query stats querystats sql queries put if absent putifabsent sql queries sql element remove oldest queries size max queries maxqueries remove oldest removeoldest queries sort query stats querystats invocation time param queries remove oldest removeoldest concurrent hash map concurrenthashmap string query stats querystats queries array list arraylist query stats querystats list array list arraylist query stats querystats queries values collections sort list query stats comparator querystatscomparator remove index removeindex queries size max queries maxqueries string sql list remove index removeindex get query getquery queries remove sql log is debug enabled isdebugenabled log debug removing slow query capacity reached sql remove index removeindex override reset connection pool connectionpool parent pooled connection pooledconnection con reset parent con parent queries slow query report slowqueryreport per pool stats perpoolstats parent get name getname queries override set properties setproperties map string interceptor property interceptorproperty properties set properties setproperties properties string threshold threshold string max queries maxqueries max queries maxqueries interceptor property interceptorproperty properties threshold interceptor property interceptorproperty properties max queries maxqueries set threshold setthreshold parse long parselong get value getvalue set max queries setmaxqueries integer parse int parseint get value getvalue author fhanik query stats querystats string field names string query nr of invocations nrofinvocations max invocation time maxinvocationtime max invocation date maxinvocationdate min invocation time mininvocationtime min invocation date mininvocationdate total invocation time totalinvocationtime failures prepare count preparecount prepare time preparetime last invocation lastinvocation string field desc riptions descriptions string sql query number query invocations call executexxx longest time query milliseconds time longest query place shortest time query milliseconds time shortest query place total amount milliseconds spent executing query number failures query number times query prepared prepare statement preparestatement prepare call preparecall total number milliseconds spent preparing query time invocation suppress warnings suppresswarnings rawtypes open type opentype field types open type opentype simple type simpletype string simple type simpletype integer simple type simpletype simple type simpletype simple type simpletype simple type simpletype simple type simpletype simple type simpletype simple type simpletype integer simple type simpletype simple type simpletype string query nr of invocations nrofinvocations max invocation time maxinvocationtime min max invocation date maxinvocationdate min invocation time mininvocationtime max min invocation date mininvocationdate total invocation time totalinvocationtime failures prepare count preparecount prepare time preparetime last invocation lastinvocation string get field names getfieldnames field names string get field descriptions getfielddescriptions field desc riptions descriptions suppress warnings suppresswarnings rawtypes open type opentype get field types getfieldtypes field types override string to string tostring simple date format simpledateformat sdf simple date format simpledateformat mmm yyyy locale sdf set time zone settimezone time zone timezone get time zone gettimezone gmt string builder stringbuilder buf string builder stringbuilder query stats querystats query buf append query buf append nr of invocations nrofinvocations buf append nr of invocations nrofinvocations buf append max invocation time maxinvocationtime buf append max invocation time maxinvocationtime buf append max invocation date maxinvocationdate buf append sdf format java util max invocation date maxinvocationdate buf append min invocation time mininvocationtime buf append min invocation time mininvocationtime buf append min invocation date mininvocationdate buf append sdf format java util min invocation date mininvocationdate buf append total invocation time totalinvocationtime buf append total invocation time totalinvocationtime buf append average invocation time averageinvocationtime buf append total invocation time totalinvocationtime nr of invocations nrofinvocations buf append failures buf append failures buf append prepare count preparecount buf append prepare count preparecount buf append prepare time preparetime buf append prepare time preparetime buf append buf to string tostring composite data support compositedatasupport get composite data getcompositedata composite type compositetype type open data exception opendataexception object values object query integer value of valueof nr of invocations nrofinvocations value of valueof max invocation time maxinvocationtime value of valueof max invocation date maxinvocationdate value of valueof min invocation time mininvocationtime value of valueof min invocation date mininvocationdate value of valueof total invocation time totalinvocationtime value of valueof failures integer value of valueof prepare count preparecount value of valueof prepare time preparetime value of valueof last invocation lastinvocation composite data support compositedatasupport type field names values query stats querystats string query query query prepare invocation time invocationtime prepare count preparecount prepare time preparetime invocation time invocationtime add invocation time invocationtime thread safe don sacrifice performance kind stuff max invocation time maxinvocationtime math max invocation time invocationtime max invocation time maxinvocationtime max invocation time maxinvocationtime invocation time invocationtime max invocation date maxinvocationdate min invocation time mininvocationtime math min invocation time invocationtime min invocation time mininvocationtime min invocation time mininvocationtime invocation time invocationtime min invocation date mininvocationdate nr of invocations nrofinvocations total invocation time totalinvocationtime invocation time invocationtime last invocation lastinvocation failure invocation time invocationtime add invocation time invocationtime failures string get query getquery query get nr of invocations getnrofinvocations nr of invocations nrofinvocations get max invocation time getmaxinvocationtime max invocation time maxinvocationtime get max invocation date getmaxinvocationdate max invocation date maxinvocationdate get min invocation time getmininvocationtime min invocation time mininvocationtime get min invocation date getmininvocationdate min invocation date mininvocationdate get total invocation time gettotalinvocationtime total invocation time totalinvocationtime override hash code hashcode query hash code hashcode override equals object query stats querystats query stats querystats query stats querystats query equals query is older than isolderthan query stats querystats last invocation lastinvocation last invocation lastinvocation compare query stats querystats last invocation lastinvocation query stats querystats updated last invocation lastinvocation code handled newest invocation query stats comparator querystatscomparator comparator query stats querystats override compare query stats querystats stats query stats querystats stats compare handle zero handlezero stats last invocation lastinvocation handle zero handlezero stats last invocation lastinvocation handle zero handlezero max compare