rcs file rcsfile revision mon mar copyright jive software rights reserved licensed apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org jivesoftware smack org jivesoftware smack compression xmpp input output stream xmppinputoutputstream org jivesoftware smack filter packet filter packetfilter org jivesoftware smack packet packet org jivesoftware smack packet presence org jivesoftware smack packet xmpp error xmpperror org jivesoftware smack util string utils stringutils org jivesoftware smack util dns host address hostaddress javax net ssl key manager keymanager javax net ssl key manager factory keymanagerfactory javax net ssl ssl context sslcontext javax net ssl ssl socket sslsocket javax security callback callback javax security callback callback handler callbackhandler javax security callback password callback passwordcallback java buffered reader bufferedreader java buffered writer bufferedwriter java byte array input stream bytearrayinputstream java file input stream fileinputstream java io exception ioexception java input stream inputstream java input stream reader inputstreamreader java output stream outputstream java output stream writer outputstreamwriter java lang reflect constructor java net socket java net unknown host exception unknownhostexception java security key store keystore java security provider java security security java util collection java util iterator java util linked list linkedlist java util list creates socket connection xmpp server connection jabber server xmpp core rfc connection author matt tucker xmpp connection xmppconnection connection socket connection socket socket string connectionid string user connected socket closed socketclosed concurrent xmpp connection xmppconnection packet reader packetreader packet writer packetwriter socket closed socketclosed flag user authenticated server authenticated flag user authenticated server connection server closed abruptly was authenticated wasauthenticated anonymous usingtls packet writer packetwriter packet writer packetwriter packet reader packetreader packet reader packetreader roster roster collection stream compression methods offered server collection string compression methods compressionmethods packet writer server acknowledged compression server ackd compression serverackdcompression creates connection xmpp server dns srv lookup performed determine add ress address port service lookup fails assumed server res ides resides service name servicename port enc rypted encrypted connections tls stream compression disabled standard sasl mechanisms authentication simplest constructor connecting xmpp server alternatively fine grained control connection settings link xmpp connection xmppconnection connection configuration connectionconfiguration constructor note xmpp connection xmppconnection constructors establish connection server call link connect callback handler callbackhandler connection requires client provide ssl certificate server callback handler callbackhandler handle password callback passwordcallback prompt password unlock key store keystore ssl certificate param service name servicename xmpp server connect param callback handler callbackhandler callback handler callbackhandler prompt password key store keystore xmpp connection xmppconnection string service name servicename callback handler callbackhandler callback handler callbackhandler create configuration connection connection configuration connectionconfiguration service name servicename config set compression enabled setcompressionenabled config setsaslauthenticationenabled config set debug ger enabled setdebuggerenabled debug enabled config set callback handler setcallbackhandler callback handler callbackhandler creates xmpp connection link xmpp connection xmppconnection string callback handler callbackhandler callback handler password pro mpting prompting key store keystore work cases client required provide certificate server param service name servicename xmpp server connect xmpp connection xmppconnection string service name servicename create configuration connection connection configuration connectionconfiguration service name servicename config set compression enabled setcompressionenabled config setsaslauthenticationenabled config set debug ger enabled setdebuggerenabled debug enabled creates xmpp connection link xmpp connection xmppconnection connection configuration connectionconfiguration callback handler callbackhandler callback handler password pro mpting prompting key store keystore work cases client required provide certificate server param config connection configuration xmpp connection xmppconnection connection configuration connectionconfiguration config config creates xmpp connection connection configuration manually connection configuration suitable advanced users api cases link xmpp connection xmppconnection string constructor app roach approach note xmpp connection xmppconnection constructors establish connection server call link connect callback handler callbackhandler connection requires client provide ssl certificate server callback handler callbackhandler handle password callback passwordcallback prompt password unlock key store keystore ssl certificate param config connection configuration param callback handler callbackhandler callback handler callbackhandler prompt password key store keystore xmpp connection xmppconnection connection configuration connectionconfiguration config callback handler callbackhandler callback handler callbackhandler config config set callback handler setcallbackhandler callback handler callbackhandler string get connection d getconnectionid is connected isconnected connectionid string get user getuser is authenticated isauthenticated user override login string username string password string resource xmpp exception xmppexception is connected isconnected illegal state exception illegalstateexception connected server authenticated illegal state exception illegalstateexception log ged logged server partial version name prep nameprep username username username to lower case tolowercase trim string response config issaslauthenticationenabled sasl authentication saslauthentication has non anonymous authentication hasnonanonymousauthentication authenticate sasl password response sasl authentication saslauthentication authenticate username password resource response sasl authentication saslauthentication authenticate username resource config get callback handler getcallbackhandler authenticate sasl response nonsaslauthentication authenticate username password resource user response user response update service name servicename returned server config set service name setservicename string utils stringutils parse server parseserver response user username get service name getservicename resource user resource compression enabled request server stream compression config is compression enabled iscompressionenabled use compression usecompression authenticated authenticated anonymous create roster reconnection roster created get roster getroster roster roster roster config is roster loaded at login isrosterloadedatlogin roster reload presence online config is send presence issendpresence packet writer packetwriter send packet sendpacket presence presence type stores authentication reconnection config set login info setlogininfo username password resource config is debug ger enabled isdebuggerenabled debug ger debugger debug ger debugger user has log ged userhaslogged user override login anon ymously loginanonymously xmpp exception xmppexception is connected isconnected illegal state exception illegalstateexception connected server authenticated illegal state exception illegalstateexception log ged logged server string response config issaslauthenticationenabled sasl authentication saslauthentication has anonymous authentication hasanonymousauthentication response sasl authentication saslauthentication authenticate anon ymously authenticateanonymously authenticate sasl response nonsaslauthentication authenticate anon ymously authenticateanonymously user user response update service name servicename returned server config set service name setservicename string utils stringutils parse server parseserver response compression enabled request server stream compression config is compression enabled iscompressionenabled use compression usecompression presence online packet writer packetwriter send packet sendpacket presence presence type authenticated authenticated anonymous config is debug ger enabled isdebuggerenabled debug ger debugger debug ger debugger user has log ged userhaslogged user roster get roster getroster synchronize login previous call get roster getroster is authenticated isauthenticated is anonymous isanonymous roster roster roster roster config is roster loaded at login isrosterloadedatlogin roster reload access roster object roster roster initialized rosterinitialized roster wait time waittime s mack configuration smackconfiguration get packet reply timeout getpacketreplytimeout start system current time millis currenttimemillis roster roster initialized rosterinitialized wait time waittime roster wait wait time waittime system current time millis currenttimemillis wait time waittime start start interrupted exception interruptedexception roster is connected isconnected connected is secure connection issecureconnection isusingtls is socket closed issocketclosed socket closed socketclosed is authenticated isauthenticated authenticated is anonymous isanonymous anonymous closes connection setting presence unavailable closing stream xmpp server shutdown logic plan ned planned disconnect ion disconnection dealing unexpected disconnect ion disconnection link disconnect connection packet reader packet writer link roster removed connection param unavailable presence unavailablepresence presence packet send shutdown shutdown presence unavailable presence unavailablepresence presence off line offline packet writer packetwriter packet writer packetwriter send packet sendpacket unavailable presence unavailablepresence set was authenticated setwasauthenticated authenticated authenticated packet reader packetreader packet reader packetreader shutdown packet writer packetwriter packet writer packetwriter shutdown wait processes clean shutdown thread sleep exception socket closed socketclosed packet reader packetreader packet writer packetwriter ingore exceptions thrown read write closed stream socket close socket closed socketclosed socket close exception print stack trace printstacktrace cases close successful connected connected close read ers readers write rs writers reader closed previous socket close explicitly reader close throwable ignore reader writer closed previous socket close explicitly writer close throwable ignore writer socket closed socket closed socket close exception sasl authentication saslauthentication init disconnect presence unavailable presence unavailablepresence connected ignore request packet reader packetreader packet writer packetwriter is connected isconnected shutdown unavailable presence unavailablepresence roster roster cleanup roster was authenticated wasauthenticated packet writer packetwriter cleanup packet reader packetreader cleanup send packet sendpacket packet packet is connected isconnected illegal state exception illegalstateexception connected server packet null pointer exception nullpointerexception packet packet writer packetwriter send packet sendpacket packet registers packet int erceptor interceptor connection int erceptor interceptor invoked time packet connection int erceptors interceptors modify packet packet filter determines pack ets packets delivered int erceptor interceptor param packet interceptor packetinterceptor packet int erceptor interceptor notify pack ets packets param packet filter packetfilter packet filter deprecated replaced link connection add packet interceptor addpacketinterceptor packet interceptor packetinterceptor packet filter packetfilter add packet writer interceptor addpacketwriterinterceptor packet interceptor packetinterceptor packet interceptor packetinterceptor packet filter packetfilter packet filter packetfilter add packet interceptor addpacketinterceptor packet interceptor packetinterceptor packet filter packetfilter removes packet int erceptor interceptor param packet interceptor packetinterceptor packet int erceptor interceptor remove deprecated replaced link connection remove packet interceptor removepacketinterceptor packet interceptor packetinterceptor remove packet writer interceptor removepacketwriterinterceptor packet interceptor packetinterceptor packet interceptor packetinterceptor remove packet interceptor removepacketinterceptor packet interceptor packetinterceptor registers packet listener connection listener not ified notified packet connection sends packet filter determines pack ets packets delivered listener note thread writes pack ets packets invoke listeners packet listener complete operations thread processing param packet listener packetlistener packet listener notify pack ets packets param packet filter packetfilter packet filter deprecated replaced link add packet sending listener addpacketsendinglistener packet listener packetlistener packet filter packetfilter add packet writer listener addpacketwriterlistener packet listener packetlistener packet listener packetlistener packet filter packetfilter packet filter packetfilter add packet sending listener addpacketsendinglistener packet listener packetlistener packet filter packetfilter removes packet listener sending pack ets packets connection param packet listener packetlistener packet listener remove deprecated replaced link remove packet sending listener removepacketsendinglistener packet listener packetlistener remove packet writer listener removepacketwriterlistener packet listener packetlistener packet listener packetlistener remove packet sending listener removepacketsendinglistener packet listener packetlistener connect using configuration connectusingconfiguration connection configuration connectionconfiguration config xmpp exception xmppexception xmpp exception xmppexception exception iterator host address hostaddress config get host addr esses gethostaddresses iterator list host address hostaddress failed addr esses failedaddresses linked list linkedlist host address hostaddress xmppioerror has next hasnext exception host address hostaddress host address hostaddress string host host address hostaddress getfqdn port host address hostaddress get port getport config get socket factory getsocketfactory socket socket host port socket config get socket factory getsocketfactory create socket createsocket host port unknown host exception unknownhostexception uhe string error message errormessage connect host port exception xmpp exception xmppexception error message errormessage xmpp error xmpperror xmpp error xmpperror condition remote server timeout error message errormessage uhe io exception ioexception ioe string error message errormessage xmpp error xmpperror connecting host port exception xmpp exception xmppexception error message errormessage xmpp error xmpperror xmpp error xmpperror condition remote server error error message errormessage ioe xmppioerror exception host connect config set used host address setusedhostaddress host address hostaddress host address hostaddress set exception setexception exception failed addr esses failedaddresses add host address hostaddress has next hasnext host add res ses addresses exception report host addr esses hostaddresses exception string builder stringbuilder string builder stringbuilder host address hostaddress fha failed addr esses failedaddresses append fha get error message geterrormessage append xmpp error xmpperror xmpp error xmpperror xmppioerror xmpp error xmpperror xmpp error xmpperror xmpp error xmpperror condition remote server error xmpp error xmpperror xmpp error xmpperror xmpp error xmpperror condition remote server timeout xmpp exception xmppexception to string tostring xmpp error xmpperror socket closed socketclosed init connection initconnection initializes connection creating packet reader writer opening xmpp stream server xmpp exception xmppexception establishing connection server fails init connection initconnection xmpp exception xmppexception is first initialization isfirstinitialization packet reader packetreader packet writer packetwriter compression handler compressionhandler server ackd compression serverackdcompression reader writer instance variables init reader and writer initreaderandwriter is first initialization isfirstinitialization packet writer packetwriter packet writer packetwriter packet reader packetreader packet reader packetreader pack ets packets log config is debug ger enabled isdebuggerenabled add packet listener addpacketlistener debug ger debugger get reader listener getreaderlistener debug ger debugger get writer listener getwriterlistener add packet sending listener addpacketsendinglistener debug ger debugger get writer listener getwriterlistener packet writer packetwriter init packet reader packetreader init start packet writer open xmpp stream server packet writer packetwriter startup start packet reader startup method block opening stream packet server packet reader packetreader startup not e note fact connected connected is first initialization isfirstinitialization notify listeners connection established connection creation listener connectioncreationlistener listener get connection creation listeners getconnectioncreationlisteners listener connection created connectioncreated was authenticated wasauthenticated notify reconnection notifyreconnection xmpp exception xmppexception packet writer packetwriter packet writer packetwriter shutdown throwable ignore packet writer packetwriter packet reader packetreader packet reader packetreader shutdown throwable ignore packet reader packetreader reader reader close throwable ignore reader writer writer close throwable ignore writer socket socket close exception socket set was authenticated setwasauthenticated authenticated authenticated connected init reader and writer initreaderandwriter xmpp exception xmppexception compression handler compressionhandler reader buffered reader bufferedreader input stream reader inputstreamreader socket get input stream getinputstream utf writer buffered writer bufferedwriter output stream writer outputstreamwriter socket get output stream getoutputstream utf output stream outputstream compression handler compressionhandler get output stream getoutputstream socket get output stream getoutputstream writer buffered writer bufferedwriter output stream writer outputstreamwriter utf input stream inputstream compression handler compressionhandler get input stream getinputstream socket get input stream getinputstream reader buffered reader bufferedreader input stream reader inputstreamreader utf exception print stack trace printstacktrace compression handler compressionhandler reader buffered reader bufferedreader input stream reader inputstreamreader socket get input stream getinputstream utf writer buffered writer bufferedwriter output stream writer outputstreamwriter socket get output stream getoutputstream utf io exception ioexception ioe xmpp exception xmppexception xmpp error xmpperror establishing connection server xmpp error xmpperror xmpp error xmpperror condition remote server error xmpp error xmpperror establishing connection server ioe debug ging debugging enabled open window write net work network traffic init debug ger initdebugger tls code returns connection server negotiated tls tls negotiatied connection secured connection server negotiated tls isusingtls usingtls notification message server supports tls confirm server secure connection param required server tls required starttlsreceived required required config get security mode getsecuritymode connection configuration connectionconfiguration security mode securitymode disabled notify connection error notifyconnectionerror illegal state exception illegalstateexception tls required server allowed connection configuration config get security mode getsecuritymode connection configuration connectionconfiguration security mode securitymode disabled secure connection tls tls disabled writer write start tls starttls xml ns xmlns urn ietf params xml xmpp tls writer flush io exception ioexception notify connection error notifyconnectionerror server tls negotiation start secure existing plain connection perform handshake method won connection finished handshake error occured sec uri ng securing connection exception exception occurs proceedtlsreceived exception ssl context sslcontext context config getcustomsslcontext key store keystore key manager keymanager kms password callback passwordcallback pcb config get callback handler getcallbackhandler context system println key store keystore type configuration get key store type getkeystoretype config get key store type getkeystoretype equals pcb config get key store type getkeystoretype equals pkcs constructor for name forname sun security pkcs sunpkcs get constructor getconstructor input stream inputstream string pkcs config smart card smartcard nlibrary config getpkcs library byte array input stream bytearrayinputstream config byte array input stream bytearrayinputstream pkcs config get bytes getbytes provider provider new instance newinstance config security add provider addprovider key store keystore get instance getinstance pkcs pcb password callback passwordcallback pkcs password config get callback handler getcallbackhandler handle callback pcb load pcb get password getpassword exception pcb config get key store type getkeystoretype equals app le apple key store keystore get instance getinstance key chain store keychainstore app le apple load pcb password callback passwordcallback app le apple key chain keychain pcb set password setpassword key store keystore get instance getinstance config get key store type getkeystoretype pcb password callback passwordcallback key store keystore password config get callback handler getcallbackhandler handle callback pcb load file input stream fileinputstream config get key store path getkeystorepath pcb get password getpassword exception pcb key manager factory keymanagerfactory kmf key manager factory keymanagerfactory get instance getinstance sun x sunx pcb kmf init kmf init pcb get password getpassword pcb clear password clearpassword kms kmf get key managers getkeymanagers null pointer exception nullpointerexception npe kms verify certificate presented server context context ssl context sslcontext get instance getinstance tls context init kms javax net ssl trust manager trustmanager server trust manager servertrustmanager get service name getservicename config java security secure random securerandom socket plain socket secure plain connection socket context get socket factory getsocketfactory create socket createsocket plain plain get inet address getinetaddress get host address gethostaddress plain get port getport socket set s o timeout setsotimeout socket set keep alive setkeepalive initialize reader writer secured version init reader and writer initreaderandwriter proc eed proceed handshake ssl socket sslsocket socket start handshake starthandshake ssl socket sslsocket socket get want client auth getwantclientauth system err println connection client ssl socket sslsocket socket get need client auth getneedclientauth system err println connection client system err println connection require client tls successful usingtls writer packet writer packetwriter set writer setwriter writer send opening stream server packet writer packetwriter open stream openstream sets stream compression methods offered server param methods compression methods offered server set available compression methods setavailablecompressionmethods collection string methods compression methods compressionmethods methods returns compression handler compression methods offered server instance xmpp input output stream xmppinputoutputstream suitable instance xmpp input output stream xmppinputoutputstream may be get compression handler maybegetcompressionhandler compression methods compressionmethods xmpp input output stream xmppinputoutputstream handler compression handlers compressionhandlers handler is supported issupported string method handler get compression method getcompressionmethod compression methods compressionmethods method handler is using compression isusingcompression compression handler compressionhandler server ackd compression serverackdcompression starts stream compression compress net work network traffic traffic reduced stream compression ideal slow speed net work network connection server client cpu time order compress net work network data high load server performance stream compression offered server zlib method supported client stream compression negotiation authentication place note stream compression smack x smackx jar file classpath stream compression negotiation successful use compression usecompression compression send compression request server authenticated illegal state exception illegalstateexception compression negotiated authentication compression handler compressionhandler may be get compression handler maybegetcompressionhandler request stream compression requeststreamcompression compression handler compressionhandler get compression method getcompressionmethod wait compression timeout happened wait s mack configuration smackconfiguration get packet reply timeout getpacketreplytimeout interrupted exception interruptedexception is using compression isusingcompression request server start stream compression tls negotiation stream compression happen tls negotiated tls compression stream compression request stream compression requeststreamcompression string method writer write compress xml ns xmlns http jabber org protocol compress writer write method method method compress writer flush io exception ioexception notify connection error notifyconnectionerror start stream compression server acknowledged stream compression exception exception starting stream compression start stream compression startstreamcompression exception server ackd compression serverackdcompression initialize reader writer secured version init reader and writer initreaderandwriter writer packet writer packetwriter set writer setwriter writer send opening stream server packet writer packetwriter open stream openstream notify compression notify not ifies notifies xmpp connection stream compression denied connection process proceed stream compression denied streamcompressiondenied notify establishes connection xmpp server performs automatic login previous connection log ged logged authenticated basic ally basically creates main tains maintains socket connection server listeners preserved previous connection reconnection occurs abrupt termination xmpp exception xmppexception error occurs establish connection errors occur wrapped xmpp exception xmppexception unknown host exception unknownhostexception xmpp error code io exception ioexception xmpp error code error codes wrapped exceptions app ropiate appropiate error messages users connect xmpp exception xmppexception establishes connection read ers readers write rs writers connect using configuration connectusingconfiguration config server connection terminated abruptly connected was authenticated wasauthenticated login is anonymous isanonymous anonymous login login anon ymously loginanonymously login config get username getusername config get password getpassword config get resource getresource notify reconnection notifyreconnection xmpp exception xmppexception print stack trace printstacktrace sets connection log ged logged server param was authenticated wasauthenticated connection authenticated set was authenticated setwasauthenticated was authenticated wasauthenticated was authenticated wasauthenticated was authenticated wasauthenticated was authenticated wasauthenticated s ends sends not ification notification error connection closes connection prints stack trace exception param exception connection close event notify connection error notifyconnectionerror exception listeners not ified notified exception packet reader packetreader packet writer packetwriter packet reader packetreader packet writer packetwriter closes connection temporary reconnection shutdown presence presence type unavailable print stack trace problem print stack trace printstacktrace notify connection listeners error connection listener connectionlistener listener get connection listeners getconnectionlisteners listener connection closed on error connectionclosedonerror exception print stack trace printstacktrace s ends sends not ification notification indicating connection rec onnected reconnected notify reconnection notifyreconnection notify connection listeners reconnection connection listener connectionlistener listener get connection listeners getconnectionlisteners listener reconnection successful reconnectionsuccessful exception print stack trace printstacktrace