licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache coyote http java eof exception eofexception java i o exception ioexception java nio channels selector java nio charset charset org apache coyote input buffer inputbuffer org apache coyote request org apache tomcat util buf byte chunk bytechunk org apache tomcat util buf message bytes messagebytes org apache tomcat util net abstract endpoint abstractendpoint org apache tomcat util net nio channel niochannel org apache tomcat util net nio endpoint nioendpoint org apache tomcat util net nio selector pool nioselectorpool org apache tomcat util net socket wrapper socketwrapper implementation input buffer inputbuffer http request header parsing transfer decoding author href mailto remm apache org remy maucherat author filip hanik internal nio input buffer internalnioinputbuffer abstract input buffer abstractinputbuffer nio channel niochannel org apache juli logging log log org apache juli logging log factory logfactory get log getlog internal nio input buffer internalnioinputbuffer charset charset charset for name forname iso enum header parse status headerparsestatus headers data enum header parse position headerparseposition start header crlf headers character starts header header start reading header characters header http token header whitespace allowed http token includes whitespace encountered result header skip ping skipping whitespace text header starts header subsequent lines subsequent starts header start reading header subsequent header start encountered header reading header peeked advancing position header start header start header multi reading bytes crlf header skip line skipline alternate constructor internal nio input buffer internalnioinputbuffer request request header buffer size headerbuffersize request request headers request get mime headers getmimeheaders header buffer size headerbuffersize header buffer size headerbuffersize input stream input buffer inputstreaminputbuffer socket input buffer socketinputbuffer filter library filterlibrary input filter inputfilter active filters activefilters input filter inputfilter last active filter lastactivefilter parsing header parsingheader parsing request line parsingrequestline parsing request line phase parsingrequestlinephase parsing request line eol parsingrequestlineeol parsing request line start parsingrequestlinestart parsing request line pos parsingrequestlineqpos header parse pos headerparsepos header parse position headerparseposition header start header data headerdata recycle swallow input swallowinput parsing blocking parsing data arrives pick left parsing request line parsingrequestline parsing request line phase parsingrequestlinephase parsing request line eol parsingrequestlineeol parsing request line start parsingrequestlinestart parsing request line pos parsingrequestlineqpos header parse position headerparseposition header parse pos headerparsepos underlying socket nio channel niochannel socket selector pool blocking reads blocking writes nio selector pool nioselectorpool pool maximum allowed size http request headers leading blank lines header buffer size headerbuffersize size nio channel niochannel read buffer socket read buffer size socketreadbuffersize methods recycle input buffer called closing connection override recycle recycle socket header parse pos headerparsepos header parse position headerparseposition header start parsing request line parsingrequestline parsing request line phase parsingrequestlinephase parsing request line eol parsingrequestlineeol parsing request line start parsingrequestlinestart parsing request line pos parsingrequestlineqpos header data headerdata recycle processing current http request note bytes current request consumed method res ets resets point ers pointers ready parse http request override next request nextrequest next request nextrequest header parse pos headerparsepos header parse position headerparseposition header start parsing request line parsingrequestline parsing request line phase parsingrequestlinephase parsing request line eol parsingrequestlineeol parsing request line start parsingrequestlinestart parsing request line pos parsingrequestlineqpos header data headerdata recycle read request function meant http request header parsing attempt read request body i o exception ioexception exception occurs underlying socket read operations buffer big accommodate data properly fed data thread free d freed override parse request line parserequestline use available data only useavailabledataonly i o exception ioexception check parsing request line parsingrequestline parsing request line phase parsingrequestlinephase chr read bytes needed pos last valid lastvalid use available data only useavailabledataonly simple read timeout fill skipping blank lines request get start time getstarttime request set start time setstarttime system current time millis currenttimemillis chr buf pos chr constants chr constants pos parsing request line start parsingrequestlinestart pos parsing request line phase parsingrequestlinephase log is debug enabled isdebugenabled log debug received string buf pos last valid lastvalid pos charset parsing request line phase parsingrequestlinephase reading method method token space space read bytes needed pos last valid lastvalid request parsing fill tolerant multiple buf pos constants buf pos constants space request method set bytes setbytes buf parsing request line start parsingrequestlinestart pos parsing request line start parsingrequestlinestart http token buf pos illegal argument exception illegalargumentexception get string getstring iib invalid method invalidmethod pos parsing request line phase parsingrequestlinephase parsing request line phase parsingrequestlinephase spec single tolerant multiple space space read bytes needed pos last valid lastvalid request parsing fill buf pos constants buf pos constants pos space parsing request line start parsingrequestlinestart pos parsing request line phase parsingrequestlinephase parsing request line phase parsingrequestlinephase mark current buffer position reading uri space space read bytes needed pos last valid lastvalid request parsing fill buf pos constants buf pos constants space pos buf pos constants buf pos constants http style request parsing request line eol parsingrequestlineeol space pos buf pos constants question parsing request line pos parsingrequestlineqpos parsing request line pos parsingrequestlineqpos pos pos request unparseduri set bytes setbytes buf parsing request line start parsingrequestlinestart parsing request line start parsingrequestlinestart parsing request line pos parsingrequestlineqpos request query string querystring set bytes setbytes buf parsing request line pos parsingrequestlineqpos parsing request line pos parsingrequestlineqpos request requesturi set bytes setbytes buf parsing request line start parsingrequestlinestart parsing request line pos parsingrequestlineqpos parsing request line start parsingrequestlinestart request requesturi set bytes setbytes buf parsing request line start parsingrequestlinestart parsing request line start parsingrequestlinestart parsing request line phase parsingrequestlinephase parsing request line phase parsingrequestlinephase spec single tolerant multiple space space read bytes needed pos last valid lastvalid request parsing fill buf pos constants buf pos constants pos space parsing request line start parsingrequestlinestart pos parsing request line phase parsingrequestlinephase mark current buffer position parsing request line phase parsingrequestlinephase parsing request line eol parsingrequestlineeol read bytes needed pos last valid lastvalid request parsing fill buf pos constants pos buf pos constants pos parsing request line eol parsingrequestlineeol pos parsing request line start parsingrequestlinestart request protocol set bytes setbytes buf parsing request line start parsingrequestlinestart parsing request line start parsingrequestlinestart request protocol set string setstring parsing request line parsingrequestline parsing request line phase parsingrequestlinephase parsing request line eol parsingrequestlineeol parsing request line start parsingrequestlinestart illegal state exception illegalstateexception invalid request parse phase parsing request line phase parsingrequestlinephase expand new size newsize new size newsize buf length parsing header parsingheader illegal argument exception illegalargumentexception get string getstring iib request header tool arg e requestheadertoolarge error happen log warn expanding buffer size size buf length size new size newsize exception tmp new size newsize system arraycopy buf tmp buf length buf tmp perform blocking read timeout desired param timeout timeout data param block system perform blocking read data read data read eof exception eofexception eof reached i o exception ioexception socket exception occurs eof exception eofexception stream reached read socket readsocket timeout block i o exception ioexception n read nread socket get buf handler getbufhandler get read buffer getreadbuffer clear block selector selector selector pool i o exception ioexception nio endpoint nioendpoint key attachment keyattachment att nio endpoint nioendpoint key attachment keyattachment socket get attachment getattachment att i o exception ioexception key can celled cancelled n read nread pool read socket get buf handler getbufhandler get read buffer getreadbuffer socket selector socket getiochannel socket get so timeout getsotimeout eof exception eofexception eof n read nread selector pool selector n read nread socket read socket get buf handler getbufhandler get read buffer getreadbuffer n read nread socket get buf handler getbufhandler get read buffer getreadbuffer flip socket get buf handler getbufhandler get read buffer getreadbuffer limit n read nread expand n read nread pos socket get buf handler getbufhandler get read buffer getreadbuffer buf pos n read nread last valid lastvalid pos n read nread n read nread n read nread eof exception eofexception get string getstring iib eof error parse http headers override parse headers parseheaders i o exception ioexception parsing header parsingheader illegal state exception illegalstateexception get string getstring iib parse headers parseheaders ise error header parse status headerparsestatus status header parse status headerparsestatus headers status parse header parseheader read check pos header buffer size headerbuffersize buf length pos socket read buffer size socketreadbuffersize illegal argument exception illegalargumentexception get string getstring iib request header tool arg e requestheadertoolarge error status header parse status headerparsestatus headers status header parse status headerparsestatus parsing header parsingheader pos parse http header reading blank http header parsing header parse status headerparsestatus parse header parseheader i o exception ioexception check blank chr header parse pos headerparsepos header parse position headerparseposition header start read bytes needed pos last valid lastvalid fill parse header header parse pos headerparsepos header parse position headerparseposition header start header parse status headerparsestatus data chr buf pos chr constants skip chr constants pos header parse status headerparsestatus pos header parse pos headerparsepos header parse position headerparseposition header start mark current buffer position header data headerdata start pos header parse pos headerparsepos header parse position headerparseposition header header parse pos headerparsepos header parse position headerparseposition header read bytes needed pos last valid lastvalid fill parse header header parse status headerparsestatus data chr buf pos chr constants colon header parse pos headerparsepos header parse position headerparseposition header start header data headerdata header value headervalue headers add value addvalue buf header data headerdata start pos header data headerdata start pos mark current buffer position header data headerdata start pos header data headerdata real pos realpos pos header data headerdata last significant char lastsignificantchar pos http token chr token header detected skip ignore header header data headerdata last significant char lastsignificantchar pos skip line skipline chr header convert lowercase chr constants chr constants buf pos chr constants offset pos skip ignore header header parse pos headerparsepos header parse position headerparseposition header skip line skipline skip line skipline header parse pos headerparsepos header parse position headerparseposition header start header parse pos headerparsepos header parse position headerparseposition header header parse pos headerparsepos header parse position headerparseposition header multi header parse pos headerparsepos header parse position headerparseposition header start skip ping skipping spaces read bytes needed pos last valid lastvalid fill header start header parse status headerparsestatus data chr buf pos chr constants chr constants pos header parse pos headerparsepos header parse position headerparseposition header header parse pos headerparsepos header parse position headerparseposition header reading bytes eol eol read bytes needed pos last valid lastvalid fill header header parse status headerparsestatus data chr buf pos chr constants skip chr constants eol chr constants chr constants buf header data headerdata real pos realpos chr header data headerdata real pos realpos buf header data headerdata real pos realpos chr header data headerdata real pos realpos header data headerdata last significant char lastsignificantchar header data headerdata real pos realpos pos ignore whitespaces header data headerdata real pos realpos header data headerdata last significant char lastsignificantchar checking character character lws multiline header header parse pos headerparsepos header parse position headerparseposition header multi read bytes needed pos last valid lastvalid fill header multi header parse status headerparsestatus data chr buf pos header parse pos headerparsepos header parse position headerparseposition header multi chr constants chr constants header parse pos headerparsepos header parse position headerparseposition header start copying extra space buffer space inserted lines buf header data headerdata real pos realpos chr header data headerdata real pos realpos header parse pos headerparsepos header parse position headerparseposition header start header header data headerdata header value headervalue set bytes setbytes buf header data headerdata start header data headerdata last significant char lastsignificantchar header data headerdata start header data headerdata recycle header parse status headerparsestatus headers get parsing request line phase getparsingrequestlinephase parsing request line phase parsingrequestlinephase header parse status headerparsestatus skip line skipline i o exception ioexception header parse pos headerparsepos header parse position headerparseposition header skip line skipline eol reading bytes eol read bytes needed pos last valid lastvalid fill header parse status headerparsestatus data buf pos constants skip buf pos constants eol header data headerdata last significant char lastsignificantchar pos pos log is debug enabled isdebugenabled log debug get string getstring iib invalid header invalidheader string buf header data headerdata start header data headerdata last significant char lastsignificantchar header data headerdata start charset header parse pos headerparsepos header parse position headerparseposition header start header parse status headerparsestatus headers header parse data headerparsedata header data headerdata header parse data headerparsedata header parse data headerparsedata parsing header character header skipping broken header character header parsing header character start parsing header stays skipping broken header stays parsing header starts character inc reased increased bytes header harvested bytes buf pos copied buf real pos realpos string start real pos realpos prepared header whitespaces removed needed real pos realpos parsing header stays skipping broken header character parsing header position lws character last significant char lastsignificantchar store header parsing header created parsed message bytes messagebytes header value headervalue recycle start real pos realpos last significant char lastsignificantchar header value headervalue methods override init socket wrapper socketwrapper nio channel niochannel socket wrapper socketwrapper abstract endpoint abstractendpoint nio channel niochannel endpoint i o exception ioexception socket socket wrapper socketwrapper get socket getsocket socket read buffer size socketreadbuffersize socket get buf handler getbufhandler get read buffer getreadbuffer capacity buf length buflength header buffer size headerbuffersize socket read buffer size socketreadbuffersize buf buf length buf length buflength buf buf length buflength pool nio endpoint nioendpoint endpoint get selector pool getselectorpool fill internal buffer data underlying input stream stream override fill block i o exception ioexception eof exception eofexception fill block fill timeout block i o exception ioexception eof exception eofexception read parsing header parsingheader last valid lastvalid header buffer size headerbuffersize illegal argument exception illegalargumentexception get string getstring iib request header tool arg e requestheadertoolarge error simple read timeout read read socket readsocket timeout block last valid lastvalid pos simple read timeout read read socket readsocket timeout block read input buffer read data input stream socket input buffer socketinputbuffer input buffer inputbuffer read bytes chunk override do read doread byte chunk bytechunk chunk request req i o exception ioexception pos last valid lastvalid read body blocking thread app fill length last valid lastvalid pos chunk set bytes setbytes buf pos length pos last valid lastvalid length