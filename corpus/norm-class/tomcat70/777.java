licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache catalina tribes group org apache catalina tribes channel org apache catalina tribes channel exception channelexception org apache catalina tribes channel message channelmessage org apache catalina tribes channel receiver channelreceiver org apache catalina tribes channel sender channelsender org apache catalina tribes member org apache catalina tribes membership service membershipservice org apache catalina tribes message listener messagelistener org apache catalina tribes unique id uniqueid org apache catalina tribes membership mcast service mcastservice org apache catalina tribes membership static member staticmember org apache catalina tribes transport receiver base receiverbase org apache catalina tribes transport replication transmitter replicationtransmitter org apache catalina tribes transport sender state senderstate org apache catalina tribes transport nio nio receiver nioreceiver org apache catalina tribes util arrays org apache catalina tribes util logs channel coordinator object coordinates membership service sender receiver int erceptor interceptor chain author filip hanik channel coordinator channelcoordinator channel interceptor base channelinterceptorbase message listener messagelistener channel receiver channelreceiver cluster receiver clusterreceiver nio receiver nioreceiver channel sender channelsender cluster sender clustersender replication transmitter replicationtransmitter membership service membershipservice membership service membershipservice mcast service mcastservice start level startlevel channel coordinator channelcoordinator override option flag optionflag channel send options message channel send options ack channel send options ack channel coordinator channelcoordinator channel receiver channelreceiver receiver channel sender channelsender sender membership service membershipservice service set cluster receiver setclusterreceiver receiver set cluster sender setclustersender sender set membership service setmembershipservice service send message members cluster param destination member dest inations destinations length param msg cluster message clustermessage message send param payload tba override send message sendmessage member destination channel message channelmessage msg interceptor payload interceptorpayload payload channel exception channelexception destination destination membership service membershipservice get members getmembers msg get options getoptions channel send options multicast channel send options multicast membership service membershipservice broadcast msg cluster sender clustersender send message sendmessage msg destination logs messages is trace enabled istraceenabled logs messages trace channel coordinator channelcoordinator msg unique id uniqueid msg get unique id getuniqueid java sql timestamp system current time millis currenttimemillis arrays to name string tonamestring destination starts channel called multiple times individual services start svc parameter logical constants param svc start services mbr seq starts membership receiver mbr seq starts membership broadcaster snd seq starts replication transmitter snd seq starts replication receiver channel exception channelexception startup error occurs service started override start svc channel exception channelexception internal start internalstart svc shuts channel called multiple times individual services shutdown svc parameter logical constants param svc shutdown services mbr seq stops membership receiver mbr seq stops membership broadcaster snd seq stops replication transmitter snd seq stops replication receiver channel exception channelexception startup error occurs service started override svc channel exception channelexception internal stop internalstop svc starts channel called multiple times individual services start svc parameter logical constants param svc start services mbr seq starts membership receiver mbr seq starts membership broadcaster snd seq starts replication transmitter snd seq starts replication receiver channel exception channelexception startup error occurs service started internal start internalstart svc channel exception channelexception valid don pass flags unrelated bottom layer svc svc channel started components start level startlevel channel start svc svc svc start level startlevel channel exception channelexception channel started level svc list ens listens local membership settings channel snd seq svc channel snd seq cluster receiver clusterreceiver set message listener setmessagelistener cluster receiver clusterreceiver receiver base receiverbase receiver base receiverbase cluster receiver clusterreceiver set channel setchannel get channel getchannel cluster receiver clusterreceiver start synchronize big time fixme member local member localmember get channel getchannel get local member getlocalmember local member localmember static member staticmember member static member staticmember static member staticmember static member staticmember local member localmember static member staticmember set host sethost get cluster receiver getclusterreceiver get host gethost static member staticmember set port setport get cluster receiver getclusterreceiver get port getport static member staticmember set secure port setsecureport get cluster receiver getclusterreceiver get secure port getsecureport multicast member membership service membershipservice set local member properties setlocalmemberproperties get cluster receiver getclusterreceiver get host gethost get cluster receiver getclusterreceiver get port getport get cluster receiver getclusterreceiver get secure port getsecureport get cluster receiver getclusterreceiver get udp port getudpport valid channel snd seq svc channel snd seq cluster sender clustersender replication transmitter replicationtransmitter replication transmitter replicationtransmitter cluster sender clustersender set channel setchannel get channel getchannel valid cluster sender clustersender start channel mbr seq svc channel mbr seq membership service membershipservice set membership listener setmembershiplistener membership service membershipservice mcast service mcastservice mcast service mcastservice membership service membershipservice set message listener setmessagelistener mcast service mcastservice membership service membershipservice set channel setchannel get channel getchannel membership service membershipservice start membership service membershipservice mbr valid channel mbr seq svc channel mbr seq membership service membershipservice mcast service mcastservice mcast service mcastservice membership service membershipservice set channel setchannel get channel getchannel membership service membershipservice start membership service membershipservice mbr valid valid illegal argument exception illegalargumentexception invalid start level valid levels snd seq snd seq mbr seq mbr seq start level startlevel start level startlevel svc channel exception channelexception exception channel exception channelexception shuts channel called multiple times individual services shutdown svc parameter logical constants param svc shutdown services mbr seq starts membership receiver mbr seq starts membership broadcaster snd seq starts replication transmitter snd seq starts replication receiver channel exception channelexception startup error occurs service started internal stop internalstop svc channel exception channelexception don pass flags unrelated bottom layer svc svc channel stopped components start level startlevel svc valid channel snd seq svc channel snd seq cluster receiver clusterreceiver cluster receiver clusterreceiver set message listener setmessagelistener valid channel snd seq svc channel snd seq cluster sender clustersender valid channel mbr seq svc channel mbr seq membership service membershipservice membership service membershipservice mbr membership service membershipservice set membership listener setmembershiplistener valid channel mbr seq svc channel mbr seq valid membership service membershipservice membership service membershipservice mbr valid illegal argument exception illegalargumentexception invalid start level valid levels snd seq snd seq mbr seq mbr seq start level startlevel start level startlevel svc set channel setchannel exception channel exception channelexception override member added memberadded member member sender state senderstate get sender state getsenderstate member member added memberadded member override member disappeared memberdisappeared member member sender state senderstate remove sender state removesenderstate member member disappeared memberdisappeared member override message received messagereceived channel message channelmessage msg logs messages is trace enabled istraceenabled logs messages trace channel coordinator channelcoordinator received msg unique id uniqueid msg get unique id getuniqueid java sql timestamp system current time millis currenttimemillis msg get address getaddress get name getname message received messagereceived msg channel receiver channelreceiver get cluster receiver getclusterreceiver cluster receiver clusterreceiver channel sender channelsender get cluster sender getclustersender cluster sender clustersender membership service membershipservice get membership service getmembershipservice membership service membershipservice set cluster receiver setclusterreceiver channel receiver channelreceiver cluster receiver clusterreceiver cluster receiver clusterreceiver cluster receiver clusterreceiver cluster receiver clusterreceiver cluster receiver clusterreceiver set message listener setmessagelistener cluster receiver clusterreceiver cluster receiver clusterreceiver set message listener setmessagelistener cluster receiver clusterreceiver set cluster sender setclustersender channel sender channelsender cluster sender clustersender cluster sender clustersender cluster sender clustersender set membership service setmembershipservice membership service membershipservice membership service membershipservice membership service membershipservice membership service membershipservice membership service membershipservice set membership listener setmembershiplistener override heartbeat cluster sender clustersender cluster sender clustersender heartbeat heartbeat members override has members hasmembers get membership service getmembershipservice has members hasmembers current cluster members members empty array override member get members getmembers get membership service getmembershipservice get members getmembers param mbr member member override member get member getmember member mbr get membership service getmembershipservice get member getmember mbr member represents node member override member get local member getlocalmember inc alive incalive get membership service getmembershipservice get local member getlocalmember inc alive incalive