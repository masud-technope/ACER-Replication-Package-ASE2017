copyright comp osent composent rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors comp osent composent initial api implementation org eclipse ecf internal provider xmpp java io exception ioexception java util array list arraylist java util hash map hashmap java util iterator java util list java util map org eclipse ecf core container connect exception containerconnectexception org eclipse ecf core events container connected event containerconnectedevent org eclipse ecf core events container connecting event containerconnectingevent org eclipse ecf core events container disconnected event containerdisconnectedevent org eclipse ecf core events container d isconnecting event containerdisconnectingevent org eclipse ecf core identity org eclipse ecf core identity id create exception idcreateexception org eclipse ecf core identity id factory idfactory org eclipse ecf core identity name space namespace org eclipse ecf core security callback org eclipse ecf core security callback handler callbackhandler org eclipse ecf core security i connect context iconnectcontext org eclipse ecf core security name callback namecallback org eclipse ecf core shared object sharedobject i shared object container config isharedobjectcontainerconfig org eclipse ecf core shared object sharedobject shared object add exception sharedobjectaddexception org eclipse ecf core shared object sharedobject util i queue enqueue iqueueenqueue org eclipse ecf core util ecf exception ecfexception org eclipse ecf internal provider xmpp events chat member ship event chatmembershipevent org eclipse ecf internal provider xmpp events iq event iqevent org eclipse ecf internal provider xmpp events message event messageevent org eclipse ecf internal provider xmpp events presence event presenceevent org eclipse ecf internal provider xmpp smack ecf connection ecfconnection org eclipse ecf presence iim message listener iimmessagelistener org eclipse ecf presence chatroom i chat room admin listener ichatroomadminlistener org eclipse ecf presence chatroom i chat room admin sender ichatroomadminsender org eclipse ecf presence chatroom i chat room container ichatroomcontainer org eclipse ecf presence chatroom i chat room message sender ichatroommessagesender org eclipse ecf presence chatroom i chat room participant listener ichatroomparticipantlistener org eclipse ecf presence i chat message sender ichatmessagesender org eclipse ecf presence i chat message ichatmessage type org eclipse ecf provider comm connection create exception connectioncreateexception org eclipse ecf provider comm i sync h a sync h connection isynchasynchconnection org eclipse ecf provider clientsocontainer org eclipse ecf provider container message containermessage org eclipse ecf provider so config soconfig org eclipse ecf provider so container config socontainerconfig org eclipse ecf provider so context socontext org eclipse ecf provider so wrapper sowrapper org eclipse ecf provider xmpp xmpp container xmppcontainer org eclipse ecf provider xmpp identity xmpp room d xmpproomid org eclipse osgi util nls org jivesoftware smack packet listener packetlistener org jivesoftware smack xmpp connection xmppconnection org jivesoftware smack xmpp exception xmppexception org jivesoftware smack packet org jivesoftware smack packet message org jivesoftware smack packet packet org jivesoftware smack packet presence org jivesoftware smackx muc invitation rejection listener invitationrejectionlistener org jivesoftware smackx muc multi user chat multiuserchat org jivesoftware smackx muc participant status listener participantstatuslistener org jivesoftware smackx muc subject updated listener subjectupdatedlistener xmpp chat room container xmppchatroomcontainer clientsocontainer i chat room container ichatroomcontainer nls string container helper xmpp container xmppcontainer get name getname xmpp group chat handler xmppgroupchathandler container helper d containerhelperid xmpp chat room container helper xmppchatroomcontainerhelper container helper containerhelper multi user chat multiuserchat multiuserchat list chat room admin listeners chatroomadminlisteners i chat room admin sender ichatroomadminsender chat room admin sender chatroomadminsender xmpp chat room container xmppchatroomcontainer i shared object container config isharedobjectcontainerconfig config ecf connection ecfconnection conn name space namespace user namespace usernamespace id create exception idcreateexception config connection conn config config container helper d containerhelperid id factory idfactory get default getdefault create string d createstringid container helper container helper containerhelper xmpp chat room container helper xmppchatroomcontainerhelper user namespace usernamespace getxmppconnection chat room admin listeners chatroomadminlisteners array list arraylist send invitation sendinvitation to user touser string subject string body ecf exception ecfexception to user touser ecf exception ecfexception messages xmpp chat room container xmppchatroomcontainer exception target user get connect lock getconnectlock multiuserchat container connect exception containerconnectexception messages xmpp chat room container xmppchatroomcontainer exception connected nls multiuserchat invite to user touser get name getname body body xmpp chat room container xmppchatroomcontainer ecf connection ecfconnection conn name space namespace user namespace usernamespace id create exception idcreateexception so container config socontainerconfig id factory idfactory get default getdefault createguid conn user namespace usernamespace dispose disconnect container helper d containerhelperid get shared object manager getsharedobjectmanager remove shared object removesharedobject container helper d containerhelperid container helper d containerhelperid container helper containerhelper container helper containerhelper dispose getid container helper containerhelper chat room admin listeners chatroomadminlisteners chat room admin listeners chatroomadminlisteners clear chat room admin listeners chatroomadminlisteners dispose send message sendmessage container message containermessage data io exception ioexception get connect lock getconnectlock toid data get to container d gettocontainerid toid data set to container d settocontainerid remote server d remoteserverid send message sendmessage data handle chat message handlechatmessage message mess io exception ioexception so wrapper sowrapper wrap get shared object wrapper getsharedobjectwrapper container helper d containerhelperid wrap wrap deliver event deliverevent message event messageevent mess verify to for shared object message verifytoidforsharedobjectmessage toid handle container message handlecontainermessage container message containermessage mess io exception ioexception mess nls debug container message ignoring object data mess get data getdata data container message containermessage create message createmessage handle create message handlecreatemessage mess data container message containermessage create response message createresponsemessage handle create response message handlecreateresponsemessage mess data container message containermessage shared object message sharedobjectmessage handle shared object message handlesharedobjectmessage mess data container message containermessage shared object dispose message sharedobjectdisposemessage handle shared object dispose message handlesharedobjectdisposemessage mess nls debug unrecognized container message ignoring mess handleiqmessage mess io exception ioexception so wrapper sowrapper wrap get shared object wrapper getsharedobjectwrapper container helper d containerhelperid wrap wrap deliver event deliverevent iq event iqevent mess handle presence message handlepresencemessage presence mess io exception ioexception so wrapper sowrapper wrap get shared object wrapper getsharedobjectwrapper container helper d containerhelperid wrap wrap deliver event deliverevent presence event presenceevent mess handle chat member ship event handlechatmembershipevent string add so wrapper sowrapper wrap get shared object wrapper getsharedobjectwrapper container helper d containerhelperid wrap wrap deliver event deliverevent chat member ship event chatmembershipevent add handlexmppmessage packet a packet apacket a packet apacket handleiqmessage a packet apacket a packet apacket message handle chat message handlechatmessage message a packet apacket a packet apacket presence handle presence message handlepresencemessage presence a packet apacket unexpected message debug nls unexpected packet a packet apacket io exception ioexception trace stack tracestack exception handlexmppmessage xmpp connection xmppconnection getxmppconnection ecf connection ecfconnection get connection getconnection getxmppconnection add shared object to container addsharedobjecttocontainer remote shared object add exception sharedobjectaddexception get shared object manager getsharedobjectmanager add shared object addsharedobject container helper d containerhelperid container helper containerhelper hash map hashmap clean up connect fail cleanupconnectfail container helper containerhelper get shared object manager getsharedobjectmanager remove shared object removesharedobject container helper d containerhelperid container helper containerhelper container helper d containerhelperid connection state connectionstate d isconnected disconnected remote server d remoteserverid name space namespace get connect name space getconnectnamespace id factory idfactory get default getdefault get name space by name getnamespacebyname xmpp plugin xmppplugin get default getdefault get room name space identifier getroomnamespaceidentifier connect remote i connect context iconnectcontext connect context connectcontext container connect exception containerconnectexception remote xmpp room d xmpproomid container connect exception containerconnectexception nls bind messages xmpp chat room container xmppchatroomcontainer exception connect wrong type remote xmpp room d xmpproomid roomid xmpp room d xmpproomid remote fire container event firecontainerevent container connecting event containerconnectingevent getid remote connect context connectcontext get connect lock getconnectlock connection state connectionstate connecting remote server d remoteserverid add shared object to container addsharedobjecttocontainer remote multiuserchat multi user chat multiuserchat getxmppconnection roomid get muc string getmucstring nickname join context string nick callback callbacks callback callbacks name callback namecallback messages xmpp chat room container xmppchatroomcontainer call back callback nick roomid get nickname getnickname connect context connectcontext callback handler callbackhandler handler connect context connectcontext get callback handler getcallbackhandler handler handler handle callbacks callbacks name callback namecallback name callback namecallback name callback namecallback callbacks nick get name getname exception container connect exception containerconnectexception messages xmpp chat room container xmppchatroomcontainer exception callback handler callbackhandler string nickname nick nls nick equals nls nickname roomid get nickname getnickname nickname nick multiuserchat add subject updated listener addsubjectupdatedlistener subject updated listener subjectupdatedlistener subject updated subjectupdated string subject string fire subject updated firesubjectupdated subject multiuserchat add message listener addmessagelistener packet listener packetlistener process packet processpacket packet arg handlexmppmessage arg multiuserchat add participant listener addparticipantlistener packet listener packetlistener process packet processpacket packet arg handlexmppmessage arg multiuserchat add participant status listener addparticipantstatuslistener participant status listener participantstatuslistener joined string arg handle chat member ship event handlechatmembershipevent arg left string arg handle chat member ship event handlechatmembershipevent arg voice granted voicegranted string arg todo auto generated method stub nls nls system println voice granted voicegranted arg voice revoked voicerevoked string arg todo auto generated method stub nls nls system println voice revoked voicerevoked arg membership granted membershipgranted string arg todo auto generated method stub system println membership granted membershipgranted arg nls membership revoked membershiprevoked string arg todo auto generated method stub system println membership revoked membershiprevoked arg nls mode rator granted moderatorgranted string arg todo auto generated method stub system println mode rator granted moderatorgranted arg nls mode rator revoked moderatorrevoked string arg todo auto generated method stub system println mode rator revoked moderatorrevoked arg nls ownership granted ownershipgranted string arg todo auto generated method stub system println ownership granted ownershipgranted arg nls ownership revoked ownershiprevoked string arg todo auto generated method stub system println ownership revoked ownershiprevoked arg nls admin granted admingranted string arg todo auto generated method stub nls nls system println admin granted admingranted arg admin revoked adminrevoked string arg todo auto generated method stub nls nls system println admin revoked adminrevoked arg kicked string arg string arg string arg todo auto generated method stub nls nls system println kicked arg arg nls nls arg nls nls banned string arg string arg string arg todo auto generated method stub nls nls system println banned arg arg nls nls arg nls nls nickname changed nicknamechanged string arg string arg todo auto generated method stub system println nickname changed nicknamechanged arg nls nls arg nls nls multiuserchat add invitation rejection listener addinvitationrejectionlistener invitation rejection listener invitationrejectionlistener inv itation decl ined invitationdeclined string arg string arg todo auto generated method stub system println inv itation decl ined invitationdeclined arg nls nls arg nls nls multiuserchat join nickname connection state connectionstate connected remote server d remoteserverid roomid container helper containerhelper set room d setroomid remote server d remoteserverid fire container event firecontainerevent container connected event containerconnectedevent getid roomid exception clean up connect fail cleanupconnectfail container connect exception containerconnectexception container connect exception containerconnectexception nls bind messages xmpp chat room container xmppchatroomcontainer exception joining room roomid set stack trace setstacktrace get stack trace getstacktrace param subject param fire subject updated firesubjectupdated string subject string list notify chat room admin listeners chatroomadminlisteners notify array list arraylist chat room admin listeners chatroomadminlisteners iterator notify iterator has next hasnext i chat room admin listener ichatroomadminlistener i chat room admin listener ichatroomadminlistener handle subject change handlesubjectchange container helper containerhelper create user from name createuseridfromname subject disconnect groupid get connected d getconnectedid fire container event firecontainerevent container d isconnecting event containerdisconnectingevent getid groupid get connect lock getconnectlock connected is connected isconnected multiuserchat leave exception trace stack tracestack exception multi user chat leave connection state connectionstate d isconnected disconnected remote server d remoteserverid container helper containerhelper container helper containerhelper disconnect connection notify listeners fire container event firecontainerevent container disconnected event containerdisconnectedevent getid groupid so context socontext create shared object context createsharedobjectcontext so config soconfig soconfig i queue enqueue iqueueenqueue queue xmpp container context xmppcontainercontext soconfig get shared object d getsharedobjectid soconfig get home container d gethomecontainerid soconfig get properties getproperties queue create chat room d createchatroomid string group name groupname id create exception idcreateexception string username getxmppconnection get user getuser at index atindex username index of indexof at index atindex username username substring at index atindex string host getxmppconnection get host gethost name space namespace get connect name space getconnectnamespace targetid id factory idfactory get default getdefault createid object username host group name groupname username targetid i sync h a sync h connection isynchasynchconnection create connection createconnection remote space remotespace object data connection create exception connectioncreateexception i chat message sender ichatmessagesender private sender privatesender i chat message sender ichatmessagesender send chat message sendchatmessage toid threadid type type string subject string body map properties ecf exception ecfexception todo auto generated method stub send chat message sendchatmessage toid string body ecf exception ecfexception todo auto generated method stub i chat message sender ichatmessagesender get private message sender getprivatemessagesender private sender privatesender i chat room message sender ichatroommessagesender get chat room message sender getchatroommessagesender i chat room message sender ichatroommessagesender send message sendmessage string message body messagebody ecf exception ecfexception multiuserchat multiuserchat send message sendmessage message body messagebody exception ecf exception ecfexception ecf exception ecfexception messages xmpp chat room container xmppchatroomcontainer exception send message connect string group name groupname container connect exception containerconnectexception targetid targetid create chat room d createchatroomid group name groupname id create exception idcreateexception container connect exception containerconnectexception messages xmpp chat room container xmppchatroomcontainer exception creating room connect targetid add chat room participant listener addchatroomparticipantlistener i chat room participant listener ichatroomparticipantlistener participant listener participantlistener container helper containerhelper container helper containerhelper add chat participant listener addchatparticipantlistener participant listener participantlistener remove chat room participant listener removechatroomparticipantlistener i chat room participant listener ichatroomparticipantlistener participant listener participantlistener container helper containerhelper container helper containerhelper remove chat participant listener removechatparticipantlistener participant listener participantlistener javadoc org eclipse ecf presence chatroom i chat room container ichatroomcontainer add message listener addmessagelistener org eclipse ecf presence iim message listener iimmessagelistener add message listener addmessagelistener iim message listener iimmessagelistener listener container helper containerhelper add chat room message listener addchatroommessagelistener listener javadoc org eclipse ecf presence chatroom i chat room container ichatroomcontainer remove message listener removemessagelistener org eclipse ecf presence iim message listener iimmessagelistener remove message listener removemessagelistener iim message listener iimmessagelistener listener container helper containerhelper remove chat room message listener removechatroommessagelistener listener javadoc org eclipse ecf presence chatroom i chat room container ichatroomcontainer add chat room subject listener addchatroomsubjectlistener org eclipse ecf presence chatroom i chat room admin listener ichatroomadminlistener add chat room admin listener addchatroomadminlistener i chat room admin listener ichatroomadminlistener subject listener subjectlistener subject listener subjectlistener chat room admin listeners chatroomadminlisteners add subject listener subjectlistener javadoc org eclipse ecf presence chatroom i chat room container ichatroomcontainer remove chat room subject listener removechatroomsubjectlistener org eclipse ecf presence chatroom i chat room admin listener ichatroomadminlistener remove chat room admin listener removechatroomadminlistener i chat room admin listener ichatroomadminlistener subject listener subjectlistener subject listener subjectlistener chat room admin listeners chatroomadminlisteners remove subject listener subjectlistener javadoc org eclipse ecf presence chatroom i chat room container ichatroomcontainer get chat room participants getchatroomparticipants get chat room participants getchatroomparticipants container helper containerhelper get chat room participants getchatroomparticipants javadoc org eclipse ecf presence chatroom i chat room container ichatroomcontainer get chat room admin sender getchatroomadminsender i chat room admin sender ichatroomadminsender get chat room admin sender getchatroomadminsender chat room admin sender chatroomadminsender chat room admin sender chatroomadminsender i chat room admin sender ichatroomadminsender send subject change sendsubjectchange string new subject newsubject ecf exception ecfexception multiuserchat ecf exception ecfexception messages xmpp chat room container xmppchatroomcontainer exception connected multiuserchat change subject changesubject new subject newsubject xmpp exception xmppexception ecf exception ecfexception chat room admin sender chatroomadminsender