licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache coyote http java eof exception eofexception java i o exception ioexception java input stream inputstream java net socket java nio charset charset org apache coyote input buffer inputbuffer org apache coyote request org apache juli logging log org apache juli logging log factory logfactory org apache tomcat util buf byte chunk bytechunk org apache tomcat util buf message bytes messagebytes org apache tomcat util net abstract endpoint abstractendpoint org apache tomcat util net socket wrapper socketwrapper implementation input buffer inputbuffer http request header parsing transfer decoding author href mailto remm apache org remy maucherat internal input buffer internalinputbuffer abstract input buffer abstractinputbuffer socket log log log factory logfactory get log getlog internal input buffer internalinputbuffer underlying input stream input stream inputstream input stream inputstream constructor internal input buffer internalinputbuffer request request header buffer size headerbuffersize request request headers request get mime headers getmimeheaders buf header buffer size headerbuffersize input stream input buffer inputstreaminputbuffer input stream input buffer inputstreaminputbuffer filter library filterlibrary input filter inputfilter active filters activefilters input filter inputfilter last active filter lastactivefilter parsing header parsingheader swallow input swallowinput read request function meant http request header parsing attempt read request body i o exception ioexception exception occurs underlying socket read operations buffer big accommodate override parse request line parserequestline use available data only useavailabledataonly i o exception ioexception start skip ping skipping blank lines chr read bytes needed pos last valid lastvalid fill eof exception eofexception get string getstring iib eof error skip ping skipping blank lines request get start time getstarttime request set start time setstarttime system current time millis currenttimemillis chr buf pos chr constants chr constants pos mark current buffer position start pos reading method method token space space read bytes needed pos last valid lastvalid fill eof exception eofexception get string getstring iib eof error tolerant multiple buf pos constants buf pos constants space request method set bytes setbytes buf start pos start http token buf pos illegal argument exception illegalargumentexception get string getstring iib invalid method invalidmethod pos spec single tolerant multiple space read bytes needed pos last valid lastvalid fill eof exception eofexception get string getstring iib eof error buf pos constants buf pos constants pos space mark current buffer position start pos question pos questionpos reading uri eol space read bytes needed pos last valid lastvalid fill eof exception eofexception get string getstring iib eof error spec single tolerant buf pos constants buf pos constants space pos buf pos constants buf pos constants http style request eol space pos buf pos constants question question pos questionpos question pos questionpos pos pos request unparseduri set bytes setbytes buf start start question pos questionpos request query string querystring set bytes setbytes buf question pos questionpos question pos questionpos request requesturi set bytes setbytes buf start question pos questionpos start request requesturi set bytes setbytes buf start start spec single tolerant multiple space read bytes needed pos last valid lastvalid fill eof exception eofexception get string getstring iib eof error buf pos constants buf pos constants pos space mark current buffer position start pos eol read bytes needed pos last valid lastvalid fill eof exception eofexception get string getstring iib eof error buf pos constants pos buf pos constants pos eol pos start request protocol set bytes setbytes buf start start request protocol set string setstring parse http headers override parse headers parseheaders i o exception ioexception parsing header parsingheader illegal state exception illegalstateexception get string getstring iib parse headers parseheaders ise error parse header parseheader loop headers parsing header parsingheader pos parse http header reading blank http header parsing header value headervalue suppress warnings suppresswarnings parse header parseheader i o exception ioexception check blank chr read bytes needed pos last valid lastvalid fill eof exception eofexception get string getstring iib eof error chr buf pos chr constants skip chr constants pos pos mark current buffer position start pos reading header header ascii colon message bytes messagebytes header value headervalue colon read bytes needed pos last valid lastvalid fill eof exception eofexception get string getstring iib eof error buf pos constants colon colon header value headervalue headers add value addvalue buf start pos start http token buf pos token header detected skip ignore header skip line skipline start chr buf pos chr constants chr constants buf pos chr constants offset pos mark current buffer position start pos real pos realpos pos reading header span ned spanned multiple lines eol valid line validline valid line validline space skip ping skipping spaces space read bytes needed pos last valid lastvalid fill eof exception eofexception get string getstring iib eof error buf pos constants buf pos constants pos space last sig nificant char lastsignificantchar real pos realpos reading bytes eol read bytes needed pos last valid lastvalid fill eof exception eofexception get string getstring iib eof error buf pos constants skip buf pos constants eol buf pos constants buf real pos realpos buf pos real pos realpos buf real pos realpos buf pos real pos realpos last sig nificant char lastsignificantchar real pos realpos pos real pos realpos last sig nificant char lastsignificantchar read bytes needed pos last valid lastvalid fill eof exception eofexception get string getstring iib eof error chr buf pos chr constants chr constants valid line validline eol copying extra space buffer space inserted lines buf real pos realpos chr real pos realpos header header value headervalue set bytes setbytes buf start real pos realpos start override recycle recycle input stream inputstream methods override init socket wrapper socketwrapper socket socket wrapper socketwrapper abstract endpoint abstractendpoint socket endpoint i o exception ioexception input stream inputstream socket wrapper socketwrapper get socket getsocket get input stream getinputstream skip line skipline start i o exception ioexception eol last real byte lastrealbyte start pos start last real byte lastrealbyte pos eol read bytes needed pos last valid lastvalid fill eof exception eofexception get string getstring iib eof error buf pos constants skip buf pos constants eol last real byte lastrealbyte pos pos log is debug enabled isdebugenabled log debug get string getstring iib invalid header invalidheader string buf start last real byte lastrealbyte start charset for name forname iso fill internal buffer data underlying input stream stream fill i o exception ioexception fill override fill block i o exception ioexception n read nread parsing header parsingheader last valid lastvalid buf length illegal argument exception illegalargumentexception get string getstring iib request header tool arg e requestheadertoolarge error n read nread input stream inputstream read buf pos buf length last valid lastvalid n read nread last valid lastvalid pos n read nread buf length request header large all ocate allocate brand gc ed gced subsequent requests clear references buf buf length pos last valid lastvalid pos n read nread input stream inputstream read buf pos buf length last valid lastvalid n read nread last valid lastvalid pos n read nread n read nread input buffer read data input stream input stream input buffer inputstreaminputbuffer input buffer inputbuffer read bytes chunk override do read doread byte chunk bytechunk chunk request req i o exception ioexception pos last valid lastvalid fill length last valid lastvalid pos chunk set bytes setbytes buf pos length pos last valid lastvalid length