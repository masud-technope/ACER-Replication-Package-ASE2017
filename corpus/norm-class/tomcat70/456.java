licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache catalina tribes group java serializable java util iterator java util list java util concurrent copy on write array list copyonwritearraylist org apache catalina tribes byte message bytemessage org apache catalina tribes channel org apache catalina tribes channel exception channelexception org apache catalina tribes channel interceptor channelinterceptor org apache catalina tribes channel listener channellistener org apache catalina tribes channel message channelmessage org apache catalina tribes channel receiver channelreceiver org apache catalina tribes channel sender channelsender org apache catalina tribes error handler errorhandler org apache catalina tribes heartbeat org apache catalina tribes managed channel managedchannel org apache catalina tribes member org apache catalina tribes membership listener membershiplistener org apache catalina tribes membership service membershipservice org apache catalina tribes remote process exception remoteprocessexception org apache catalina tribes unique id uniqueid org apache catalina tribes group int erceptors interceptors message dispatch interceptor messagedispatchinterceptor org apache catalina tribes buffer pool bufferpool org apache catalina tribes channel data channeldata org apache catalina tribes x byte buffer xbytebuffer org apache catalina tribes util arrays org apache catalina tribes util logs org apache juli logging log org apache juli logging log factory logfactory implementation channel group channel groupchannel manages replication channel coordinates message received membership announcements channel chain int erceptors interceptors modify message perform logic manages complete group membership replication author filip hanik group channel groupchannel channel interceptor base channelinterceptorbase managed channel managedchannel log log log factory logfactory get log getlog group channel groupchannel flag determine channel manages heartbeat channel start local thread heart bea t beat heartbeat code heartbeat code heartbeat minute seconds heartbeat sleeptime heartbeatsleeptime internal heartbeat thread heartbeat thread heartbeatthread hbthread code channel coordinator channelcoordinator code coordinates bottom layer components membership service membershipservice channel sender channelsender channel receiver channelreceiver channel coordinator channelcoordinator coordinator channel coordinator channelcoordinator int erceptor interceptor int erceptor interceptor stack int erceptors interceptors chained linked list reference channel interceptor channelinterceptor int erceptors interceptors list membership listeners sub scr ibe subscribe membership announcements list object membership listeners membershiplisteners copy on write array list copyonwritearraylist object list channel listeners sub scr ibe subscribe incoming messages list object channel listeners channellisteners copy on write array list copyonwritearraylist object group channel groupchannel check option check optioncheck channel string creates group channel groupchannel constructor add int erceptor interceptor group channel groupchannel int erceptor interceptor channel group channel groupchannel add interceptor addinterceptor adds int erceptor interceptor stack message processing int erceptors interceptors ordered code channel add interceptor addinterceptor code code channel add interceptor addinterceptor code code channel add interceptor addinterceptor code result int erceptor interceptor stack code code complete stack code channel channel coordinator channelcoordinator code param int erceptor interceptor channel interceptor base channelinterceptorbase override add interceptor addinterceptor channel interceptor channelinterceptor int erceptor interceptor int erceptors interceptors int erceptors interceptors int erceptor interceptor int erceptors interceptors set next setnext coordinator int erceptors interceptors set previous setprevious coordinator set previous setprevious int erceptors interceptors channel interceptor channelinterceptor int erceptors interceptors get next getnext coordinator get next getnext set next setnext int erceptor interceptor int erceptor interceptor set next setnext coordinator int erceptor interceptor set previous setprevious coordinator set previous setprevious int erceptor interceptor s ends sends heartbeat int erceptor interceptor stack invoke method application per iodic periodic basis turned internal heartbeats code channel set heartbeat setheartbeat code override heartbeat heartbeat iterator object membership listeners membershiplisteners iterator has next hasnext object heartbeat heartbeat heartbeat channel listeners channellisteners iterator has next hasnext object heartbeat heartbeat heartbeat send message dest inations destinations param destination member destination length param msg serializable message send param options sender options options trigger guarantee levels int erceptors interceptors react message documentation code channel code object unique id uniqueid unique assigned message channel exception channelexception error occurs processing message org apache catalina tribes channel override unique id uniqueid send member destination serializable msg options channel exception channelexception send destination msg options param destination member destination length param msg serializable message send param options sender options options trigger guarantee levels int erceptors interceptors react message documentation code channel code object param handler callback object error handling completion not ification notification message async hronously asynchronously code channel send options asynchronous code flag enabled unique id uniqueid unique assigned message channel exception channelexception error occurs processing message org apache catalina tribes channel override unique id uniqueid send member destination serializable msg options error handler errorhandler handler channel exception channelexception msg channel exception channelexception send message x byte buffer xbytebuffer buffer destination destination length channel exception channelexception destination generates unique channel data channeldata data channel data channeldata data set address setaddress get local member getlocalmember data set timestamp settimestamp system current time millis currenttimemillis msg byte message bytemessage byte message bytemessage msg get message getmessage options options send options message x byte buffer xbytebuffer serialize msg options options send options message data set options setoptions options x byte buffer xbytebuffer buffer x byte buffer xbytebuffer length buffer buffer pool bufferpool get buffer pool getbufferpool get buffer getbuffer length buffer append length data set message setmessage buffer interceptor payload interceptorpayload payload handler payload interceptor payload interceptorpayload payload set error handler seterrorhandler handler get first interceptor getfirstinterceptor send message sendmessage destination data payload logs messages is trace enabled istraceenabled logs messages trace group channel groupchannel msg unique id uniqueid data get unique id getuniqueid java sql timestamp system current time millis currenttimemillis arrays to name string tonamestring destination logs messages trace group channel groupchannel send message unique id uniqueid data get unique id getuniqueid msg unique id uniqueid data get unique id getuniqueid exception channel exception channelexception channel exception channelexception channel exception channelexception buffer buffer pool bufferpool get buffer pool getbufferpool return buffer returnbuffer buffer callback int erceptor interceptor stack message received remote node method invoked previous int erceptor interceptor method send message components application ext reme extreme logic applications param msg channel message channelmessage override message received messagereceived channel message channelmessage msg msg logs messages is trace enabled istraceenabled logs messages trace group channel groupchannel received msg unique id uniqueid msg get unique id getuniqueid java sql timestamp system current time millis currenttimemillis msg get address getaddress get name getname serializable fwd msg get options getoptions send options message send options message fwd byte message bytemessage msg get message getmessage get bytes getbytes fwd x byte buffer xbytebuffer deserialize msg get message getmessage get bytes direct getbytesdirect msg get message getmessage get length getlength exception log error unable deserialize message msg logs messages is trace enabled istraceenabled logs messages trace group channel groupchannel receive message unique id uniqueid msg get unique id getuniqueid fwd actual member correct alive time member source msg get address getaddress delivered channel listeners channellisteners size channel listener channellistener channel listener channellistener channel listener channellistener channel listeners channellisteners channel listener channellistener channel listener channellistener accept fwd source channel listener channellistener message received messagereceived fwd source delivered responsible returning reply send absence reply channel listener channellistener rpc channel rpcchannel fwd rpc message rpcmessage message requires response send send no rpc channel reply sendnorpcchannelreply rpc message rpcmessage fwd source logs messages is trace enabled istraceenabled logs messages trace group channel groupchannel delivered delivered unique id uniqueid msg get unique id getuniqueid exception log is warn enabled iswarnenabled log warn error receiving message remote process exception remoteprocessexception exception get message getmessage s ends sends code no rpc channel reply norpcchannelreply code message member method invoked channel rpc message channel listener accepts message avoids timeout param msg rpc message rpcmessage param destination member destination reply send no rpc channel reply sendnorpcchannelreply rpc message rpcmessage msg member destination avoid circular loop msg rpc message rpcmessage no rpc channel reply norpcchannelreply rpc message rpcmessage no rpc channel reply norpcchannelreply reply rpc message rpcmessage no rpc channel reply norpcchannelreply msg rpc id rpcid msg uuid send member destination reply channel send options asynchronous exception log error unable find rpc channel failed send no rpc channel reply norpcchannelreply member added memberadded invoked int erceptor interceptor channel channel broadcast membership listeners param member member member override member added memberadded member member notify membership listeners membershiplisteners size membership listener membershiplistener membership listener membershiplistener membership listener membershiplistener membership listeners membershiplisteners membership listener membershiplistener membership listener membershiplistener member added memberadded member member disappeared memberdisappeared invoked int erceptor interceptor channel channel broadcast membership listeners param member member member left crashed override member disappeared memberdisappeared member member notify membership listeners membershiplisteners size membership listener membershiplistener membership listener membershiplistener membership listener membershiplistener membership listeners membershiplisteners membership listener membershiplistener membership listener membershiplistener member disappeared memberdisappeared member sets implementation int erceptor interceptor stack int erceptors interceptors channel exception channelexception setup default stack setupdefaultstack channel exception channelexception get first interceptor getfirstinterceptor get first interceptor getfirstinterceptor get next getnext channel coordinator channelcoordinator channel interceptor channelinterceptor int erceptor interceptor clazz clazz for name forname org apache catalina tribes group int erceptors interceptors message dispatch messagedispatch interceptor group channel groupchannel get class loader getclassloader clazz new instance newinstance throwable clazz message dispatch interceptor messagedispatchinterceptor int erceptor interceptor channel interceptor channelinterceptor clazz new instance newinstance exception channel exception channelexception unable add message dispatch interceptor messagedispatchinterceptor int erceptor interceptor chain add interceptor addinterceptor int erceptor interceptor iterator channel interceptor channelinterceptor int erceptors interceptors get int erceptors getinterceptors int erceptors interceptors has next hasnext channel interceptor channelinterceptor channel interceptor channelinterceptor int erceptors interceptors channel interceptor channelinterceptor channel interceptor base channelinterceptorbase channel interceptor base channelinterceptorbase channel interceptor channelinterceptor set channel setchannel coordinator set channel setchannel valid ates validates option flags int erceptor interceptor reports error int erceptor interceptor share flag channel exception channelexception check option flags checkoptionflags channel exception channelexception string builder stringbuilder conflicts string builder stringbuilder channel interceptor channelinterceptor int erceptors interceptors flag get option flag getoptionflag flag channel interceptor channelinterceptor get next getnext nflag get option flag getoptionflag nflag flag nflag flag flag nflag nflag conflicts append conflicts append get class getclass get name getname conflicts append conflicts append flag conflicts append conflicts append get class getclass get name getname conflicts append conflicts append nflag conflicts append get next getnext get next getnext conflicts length channel exception channelexception interceptor option flag conflict conflicts to string tostring starts channel param svc service start channel exception channelexception org apache catalina tribes channel start override start svc channel exception channelexception setup default stack setupdefaultstack option check optioncheck check option flags checkoptionflags start svc hbthread heartbeat hbthread heartbeat thread heartbeatthread heartbeat sleeptime heartbeatsleeptime hbthread start s to ps stops channel param svc channel exception channelexception org apache catalina tribes channel override svc channel exception channelexception hbthread hbthread stop heartbeat stopheartbeat hbthread svc returns int erceptor interceptor stack traversal channel interceptor channelinterceptor channel interceptor channelinterceptor get first interceptor getfirstinterceptor int erceptors interceptors int erceptors interceptors coordinator returns channel receiver component channel receiver channelreceiver override channel receiver channelreceiver get channel receiver getchannelreceiver coordinator get cluster receiver getclusterreceiver returns channel sender component channel sender channelsender override channel sender channelsender get channel sender getchannelsender coordinator get cluster sender getclustersender returns membership service component membership service membershipservice override membership service membershipservice get membership service getmembershipservice coordinator get membership service getmembershipservice sets channel receiver component param cluster receiver clusterreceiver channel receiver channelreceiver override set channel receiver setchannelreceiver channel receiver channelreceiver cluster receiver clusterreceiver coordinator set cluster receiver setclusterreceiver cluster receiver clusterreceiver sets channel sender component param cluster sender clustersender channel sender channelsender override set channel sender setchannelsender channel sender channelsender cluster sender clustersender coordinator set cluster sender setclustersender cluster sender clustersender sets membership component param membership service membershipservice membership service membershipservice override set membership service setmembershipservice membership service membershipservice membership service membershipservice coordinator set membership service setmembershipservice membership service membershipservice adds membership listener channel membership listeners uniquely identified equals object method param membership listener membershiplistener membership listener membershiplistener override add membership listener addmembershiplistener membership listener membershiplistener membership listener membershiplistener membership listeners membershiplisteners membership listener membershiplistener membership listeners membershiplisteners add membership listener membershiplistener removes membership listener channel membership listeners uniquely identified equals object method param membership listener membershiplistener membership listener membershiplistener override remove membership listener removemembershiplistener membership listener membershiplistener membership listener membershiplistener membership listeners membershiplisteners remove membership listener membershiplistener adds channel listener channel channel listeners uniquely identified equals object method param channel listener channellistener channel listener channellistener override add channel listener addchannellistener channel listener channellistener channel listener channellistener channel listeners channellisteners channel listener channellistener channel listeners channellisteners add channel listener channellistener illegal argument exception illegalargumentexception listener exists channel listener channellistener channel listener channellistener get class getclass get name getname removes channel listener channel channel listeners uniquely identified equals object method param channel listener channellistener channel listener channellistener override remove channel listener removechannellistener channel listener channellistener channel listener channellistener channel listeners channellisteners remove channel listener channellistener returns iterator int erceptors interceptors stack iterator override iterator channel interceptor channelinterceptor get int erceptors getinterceptors interceptor iterator interceptoriterator get next getnext coordinator enables disables option check setting group channel groupchannel perform conflict check int erceptors interceptors int erceptors interceptors option flag error start param option check optioncheck set option check setoptioncheck option check optioncheck option check optioncheck option check optioncheck configure local heartbeat sleep time code get heartbeat getheartbeat code param heartbeat sleeptime heartbeatsleeptime time milliseconds sleep heartbeats set heartbeat sleeptime setheartbeatsleeptime heartbeat sleeptime heartbeatsleeptime heartbeat sleeptime heartbeatsleeptime heartbeat sleeptime heartbeatsleeptime enables disables local heartbeat code set heartbeat setheartbeat code invoked channel start internal thread invoke code channel heartbeat code code get heartbeat sleeptime getheartbeatsleeptime code milliseconds param heartbeat override set heartbeat setheartbeat heartbeat heartbeat heartbeat set option check setoptioncheck get option check getoptioncheck option check optioncheck set heartbeat setheartbeat get heartbeat getheartbeat heartbeat returns sleep time milliseconds internal heartbeat sleep invocations code channel heartbeat code get heartbeat sleeptime getheartbeatsleeptime heartbeat sleeptime heartbeatsleeptime string get name getname set name setname string title interceptor iterator description iterator loop int erceptors interceptors channel version interceptor iterator interceptoriterator iterator channel interceptor channelinterceptor channel interceptor channelinterceptor channel interceptor channelinterceptor start interceptor iterator interceptoriterator channel interceptor channelinterceptor start channel interceptor channelinterceptor start start override has next hasnext start start override channel interceptor channelinterceptor channel interceptor channelinterceptor result has next hasnext result start start start get next getnext result override remove empty operation title internal heartbeat thread description code channel get heartbeat getheartbeat code thread created version heartbeat thread heartbeatthread thread log log log factory logfactory get log getlog heartbeat thread heartbeatthread counter counter do run dorun group channel groupchannel channel sleep time sleeptime heartbeat thread heartbeatthread group channel groupchannel channel sleep time sleeptime set priority setpriority min priority string channel name channelname channel get name getname channel name channelname channel get name getname set name setname group channel groupchannel heartbeat channel name channelname set daemon setdaemon channel channel sleep time sleeptime sleep time sleeptime stop heartbeat stopheartbeat do run dorun int errupt interrupt override do run dorun thread sleep sleep time sleeptime channel heartbeat interrupted exception interruptedexception int errupted interrupted exception log error unable send heartbeat tribes int erceptor interceptor stack sleep heartbeat thread heartbeatthread