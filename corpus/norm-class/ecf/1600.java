copyright comp osent composent rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors comp osent composent initial api implementation org eclipse ecf file transfer filetransfer java file java util map org eclipse core runtime i adaptable iadaptable org eclipse ecf core i container icontainer org eclipse ecf core identity name space namespace org eclipse ecf core security i connect context iconnectcontext org eclipse ecf core util proxy org eclipse ecf file transfer filetransfer events org eclipse ecf file transfer filetransfer identity i file d ifileid entry point out going outgoing file transfer container adapter adapter providers expose file sending semantics clients transport independent manner adapter reference returned call link i container icontainer get adapter getadapter reference retrieved request send file remote user events asynchronously delivered listener complete file transfer request init iate initiate sending local file remote user pre i send file transfer container adapter isendfiletransfercontaineradapter adapter i send file transfer container adapter isendfiletransfercontaineradapter ftc i send file transfer container adapter isendfiletransfercontaineradapter container get adapter getadapter i send file transfer container adapter isendfiletransfercontaineradapter ftc create listener receiving resp onding responding asynchronous file transfer events i file transfer listener ifiletransferlistener listener i file transfer listener ifiletransferlistener handle transfer event handletransferevent i file transfer event ifiletransferevent event event response transfer request check file transfer rejected event i outgoing file transfer response event ioutgoingfiletransferresponseevent i outgoing file transfer response event ioutgoingfiletransferresponseevent oftr i outgoing file transfer response event ioutgoingfiletransferresponseevent event oftr request acc epted requestaccepted request rejected user target file specifies path path filename ext targetid fileidfactory get default getdefault create file d createfileid ftc get outgoing name space getoutgoingnamespace url quot scp user host path filename ext quot specifies path path filename ext targetid fileidfactory get default getdefault create file d createfileid ftc get outgoing name space getoutgoingnamespace url quot scp user host path filename ext quot local file send file local file to send localfiletosend file quot filename quot send out going outgoing file request remote user ftc send outgoing request sendoutgoingrequest targetid local file to send localfiletosend listener pre sender delivered events link i outgoing file transfer response event ioutgoingfiletransferresponseevent link i outgoing file transfer send data event ioutgoingfiletransfersenddataevent link i outgoing file transfer send done event ioutgoingfiletransfersenddoneevent link i incoming file transfer request listener iincomingfiletransferrequestlistener events delivered link i file transfer request event ifiletransferrequestevent link i incoming file transfer receive data event iincomingfiletransferreceivedataevent link i incoming file transfer receive done event iincomingfiletransferreceivedoneevent i send file transfer container adapter isendfiletransfercontaineradapter i adaptable iadaptable send request out going outgoing file transfer method init iate initiate file transfer target receiver targetreceiver parameter local file to send localfiletosend parameter file transfer events asynchronously delivered file transfer listener transferlistener parameter param target receiver targetreceiver remote receive file transfer request code code param local file to send localfiletosend link i file transfer info ifiletransferinfo local file send code code param transfer listener transferlistener link i file transfer listener ifiletransferlistener resp onding responding file transfer events code code target receiver resp onds responds link i outgoing file transfer response event ioutgoingfiletransferresponseevent delivered listener param options map options send outgoing request sendoutgoingrequest pairs unique individual providers code code send file transfer exception sendfiletransferexception provider connected correct init iating initiating file transfer send outgoing request sendoutgoingrequest i file d ifileid target receiver targetreceiver i file transfer info ifiletransferinfo local file to send localfiletosend i file transfer listener ifiletransferlistener transfer listener transferlistener map options send file transfer exception sendfiletransferexception send request out going outgoing file transfer method init iate initiate file transfer target receiver targetreceiver parameter local file to send localfiletosend parameter file transfer events asynchronously delivered file transfer listener transferlistener parameter param target receiver targetreceiver remote receive file transfer request code code param local file to send localfiletosend link file local file send code code param transfer listener transferlistener link i file transfer listener ifiletransferlistener resp onding responding file transfer events code code target receiver resp onds responds i outgoing file transfer ioutgoingfiletransfer delivered listener param options map options send outgoing request sendoutgoingrequest pairs unique individual providers code code send file transfer exception sendfiletransferexception provider connected correct init iating initiating file transfer send outgoing request sendoutgoingrequest i file d ifileid target receiver targetreceiver file local file to send localfiletosend i file transfer listener ifiletransferlistener transfer listener transferlistener map options send file transfer exception sendfiletransferexception add incoming file transfer listener underlying provider supports receiving file transfer requests param listener receive incoming file transfer request events code code add listener addlistener i incoming file transfer request listener iincomingfiletransferrequestlistener listener remove incoming file transfer listener param listener listener remove code code listener removed remove listener removelistener i incoming file transfer request listener iincomingfiletransferrequestlistener listener namespace out going outgoing file transfer name space namespace out going outgoing i file d ifileid instances code code name space namespace get outgoing name space getoutgoingnamespace connect context authentication subsequent link send outgoing request sendoutgoingrequest i file d ifileid i file transfer info ifiletransferinfo i file transfer listener ifiletransferlistener map method called connect context connectcontext order authentication occur call link send outgoing request sendoutgoingrequest i file d ifileid i file transfer info ifiletransferinfo i file transfer listener ifiletransferlistener map param connect context connectcontext connect context auth enticating authenticating subsequent call link send outgoing request sendoutgoingrequest i file d ifileid i file transfer info ifiletransferinfo i file transfer listener ifiletransferlistener map code code authentication att empted attempted set connect context for authentication setconnectcontextforauthentication i connect context iconnectcontext connect context connectcontext proxy subsequent link send outgoing request sendoutgoingrequest i file d ifileid i file transfer info ifiletransferinfo i file transfer listener ifiletransferlistener map method called proxy proxy subsequent calls link send outgoing request sendoutgoingrequest i file d ifileid i file transfer info ifiletransferinfo i file transfer listener ifiletransferlistener map param proxy proxy subsequent calls link send outgoing request sendoutgoingrequest i file d ifileid i file transfer info ifiletransferinfo i file transfer listener ifiletransferlistener map code code proxy set proxy setproxy proxy proxy