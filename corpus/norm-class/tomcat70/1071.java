licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache tomcat websocket java io exception ioexception java nio byte buffer bytebuffer java nio char buffer charbuffer java nio charset charset decoder charsetdecoder java nio charset code r result coderresult java nio charset coding error action codingerroraction java util list javax websocket close reason closereason javax websocket close reason closereason close codes closecodes javax websocket extension javax websocket message handler messagehandler javax websocket pong message pongmessage org apache juli logging log org apache tomcat util exception utils exceptionutils org apache tomcat util buf utf decoder org apache tomcat util res string manager stringmanager takes servlet input stream servletinputstream processes web socket websocket frames extra cts extracts messages web socket websocket pings received resp on ded responded automatically action required application ws frame base wsframebase string manager stringmanager string manager stringmanager get manager getmanager constants connection level attributes ws session wssession ws session wssession input buffer inputbuffer transformation transformation attributes control messages control messages middle messages separate attributes byte buffer bytebuffer control buffer binary controlbufferbinary byte buffer bytebuffer allocate char buffer charbuffer control buffer text controlbuffertext char buffer charbuffer allocate attributes current message charset decoder charsetdecoder utf decoder control decodercontrol utf decoder on malformed input onmalformedinput coding error action codingerroraction report on unmappable character onunmappablecharacter coding error action codingerroraction report charset decoder charsetdecoder utf decoder message decodermessage utf decoder on malformed input onmalformedinput coding error action codingerroraction report on unmappable character onunmappablecharacter coding error action codingerroraction report continuation expected continuationexpected text message textmessage byte buffer bytebuffer message buffer binary messagebufferbinary char buffer charbuffer message buffer text messagebuffertext cache message handler force message starts consistently entire message message handler messagehandler binary msg handler binarymsghandler message handler messagehandler text msg handler textmsghandler attributes current frame fin rsv op code opcode mask mask index maskindex payload length payloadlength payload written payloadwritten attributes tracking frame open read pos readpos write pos writepos ws frame base wsframebase ws session wssession ws session wssession transformation transformation input buffer inputbuffer constants buffer size message buffer binary messagebufferbinary byte buffer bytebuffer allocate ws session wssession get max binary message buffer size getmaxbinarymessagebuffersize message buffer text messagebuffertext char buffer charbuffer allocate ws session wssession get max text message buffer size getmaxtextmessagebuffersize ws session wssession ws session wssession transformation final transformation finaltransformation is masked ismasked final transformation finaltransformation unmask transformation unmasktransformation final transformation finaltransformation noop transformation nooptransformation transformation transformation final transformation finaltransformation transformation set next setnext final transformation finaltransformation transformation transformation process input buffer processinputbuffer io exception ioexception ws session wssession update last active updatelastactive frame process initial header processinitialheader open io exception ioexception get string getstring ws frame wsframe closed partial header process remaining header processremainingheader data process data processdata code code sufficient data process initial header process initial header processinitialheader io exception ioexception bytes data write pos writepos read pos readpos input buffer inputbuffer read pos readpos fin rsv op code opcode transformation validate rsv validatersv rsv op code opcode wsioexception close reason closereason close codes closecodes protocol error get string getstring ws frame wsframe wrong rsv wrongrsv integer value of valueof rsv integer value of valueof op code opcode util is control iscontrol op code opcode fin wsioexception close reason closereason close codes closecodes protocol error get string getstring ws frame wsframe control fragmented controlfragmented op code opcode constants opcode ping op code opcode constants opcode pong op code opcode constants opcode close wsioexception close reason closereason close codes closecodes protocol error get string getstring ws frame wsframe invalid op code invalidopcode integer value of valueof op code opcode continuation expected continuationexpected util is continuation iscontinuation op code opcode wsioexception close reason closereason close codes closecodes protocol error get string getstring ws frame wsframe no continuation nocontinuation op code opcode constants opcode binary binary message text message textmessage size ws session wssession get max binary message buffer size getmaxbinarymessagebuffersize size message buffer binary messagebufferbinary capacity message buffer binary messagebufferbinary byte buffer bytebuffer allocate size binary msg handler binarymsghandler ws session wssession get binary message handler getbinarymessagehandler text msg handler textmsghandler op code opcode constants opcode text text message text message textmessage size ws session wssession get max text message buffer size getmaxtextmessagebuffersize size message buffer text messagebuffertext capacity message buffer text messagebuffertext char buffer charbuffer allocate size binary msg handler binarymsghandler text msg handler textmsghandler ws session wssession get text message handler gettextmessagehandler wsioexception close reason closereason close codes closecodes protocol error get string getstring ws frame wsframe invalid op code invalidopcode integer value of valueof op code opcode illegal state exception illegalstateexception ise wsioexception close reason closereason close codes closecodes protocol error get string getstring ws frame wsframe session closed sessionclosed continuation expected continuationexpected fin input buffer inputbuffer read pos readpos client data masked is masked ismasked wsioexception close reason closereason close codes closecodes protocol error get string getstring ws frame wsframe not masked notmasked payload length payloadlength partial header get log getlog is debug enabled isdebugenabled get log getlog debug get string getstring ws frame wsframe partial header complete partialheadercomplete to string tostring fin integer to string tostring rsv integer to string tostring op code opcode to string tostring payload length payloadlength is masked ismasked log get log getlog code code sufficient data complete processing header process remaining header processremainingheader io exception ioexception ignore bytes read mask header length headerlength is masked ismasked header length headerlength header length headerlength add additional bytes depending length payload length payloadlength header length headerlength payload length payloadlength header length headerlength write pos writepos read pos readpos header length headerlength calculate payload length payload length payloadlength payload length payloadlength byte array to long bytearraytolong input buffer inputbuffer read pos readpos read pos readpos payload length payloadlength payload length payloadlength byte array to long bytearraytolong input buffer inputbuffer read pos readpos read pos readpos util is control iscontrol op code opcode payload length payloadlength wsioexception close reason closereason close codes closecodes protocol error get string getstring ws frame wsframe control payload too big controlpayloadtoobig value of valueof payload length payloadlength fin wsioexception close reason closereason close codes closecodes protocol error get string getstring ws frame wsframe control no fin controlnofin is masked ismasked system arraycopy input buffer inputbuffer read pos readpos mask read pos readpos data process data processdata io exception ioexception result util is control iscontrol op code opcode result process data control processdatacontrol text message textmessage text msg handler textmsghandler result swallow input swallowinput result process data text processdatatext binary msg handler binarymsghandler result swallow input swallowinput result process data binary processdatabinary check room payload checkroompayload result process data control processdatacontrol io exception ioexception transformation result transformationresult transformation get more data getmoredata op code opcode fin rsv control buffer binary controlbufferbinary transformation result transformationresult underflow equals control messages fixed message size transformation result transformationresult overflow control buffer binary controlbufferbinary flip op code opcode constants opcode close open string reason code close codes closecodes normal closure get code getcode control buffer binary controlbufferbinary remaining control buffer binary controlbufferbinary clear payload greater wsioexception close reason closereason close codes closecodes protocol error get string getstring ws frame wsframe one byte close code onebyteclosecode control buffer binary controlbufferbinary remaining code control buffer binary controlbufferbinary get short getshort control buffer binary controlbufferbinary remaining code r result coderresult utf decoder control decodercontrol decode control buffer binary controlbufferbinary control buffer text controlbuffertext is error iserror control buffer binary controlbufferbinary clear control buffer text controlbuffertext clear wsioexception close reason closereason close codes closecodes protocol error get string getstring ws frame wsframe invalid utf invalidutf close overflow output buffer big under flow underflow data passed decoder single call control buffer text controlbuffertext flip reason control buffer text controlbuffertext to string tostring ws session wssession on close onclose close reason closereason util get close code getclosecode code reason op code opcode constants opcode ping ws session wssession is open isopen ws session wssession get basic remote getbasicremote send pong sendpong control buffer binary controlbufferbinary op code opcode constants opcode pong message handler messagehandler pong message pongmessage mh pong mhpong ws session wssession get pong message handler getpongmessagehandler mh pong mhpong mh pong mhpong on message onmessage ws pong message wspongmessage control buffer binary controlbufferbinary throwable handle throwable on send handlethrowableonsend control buffer binary controlbufferbinary clear caught earlier control buffer binary controlbufferbinary clear wsioexception close reason closereason close codes closecodes protocol error get string getstring ws frame wsframe invalid op code invalidopcode integer value of valueof op code opcode control buffer binary controlbufferbinary clear new frame newframe suppress warnings suppresswarnings unchecked send message text sendmessagetext wsioexception text msg handler textmsghandler wrapped message handler wrappedmessagehandler max message size maxmessagesize wrapped message handler wrappedmessagehandler text msg handler textmsghandler get max message size getmaxmessagesize max message size maxmessagesize message buffer text messagebuffertext remaining max message size maxmessagesize wsioexception close reason closereason close codes closecodes big get string getstring ws frame wsframe message too big messagetoobig value of valueof message buffer text messagebuffertext remaining value of valueof max message size maxmessagesize text msg handler textmsghandler message handler messagehandler partial message handler messagehandler partial string text msg handler textmsghandler on message onmessage message buffer text messagebuffertext to string tostring caller ensures branch message handler messagehandler string text msg handler textmsghandler on message onmessage message buffer text messagebuffertext to string tostring throwable handle throwable on send handlethrowableonsend message buffer text messagebuffertext clear process data text processdatatext io exception ioexception copy data buffer transformation result transformationresult transformation get more data getmoredata op code opcode fin rsv message buffer binary messagebufferbinary transformation result transformationresult frame equals frame complete convert bytes utf message buffer binary messagebufferbinary flip code r result coderresult utf decoder message decodermessage decode message buffer binary messagebufferbinary message buffer text messagebuffertext is error iserror wsioexception close reason closereason close codes closecodes consistent get string getstring ws frame wsframe invalid utf invalidutf is overflow isoverflow space text buffer flush use partial usepartial message buffer text messagebuffertext flip send message text sendmessagetext message buffer text messagebuffertext clear wsioexception close reason closereason close codes closecodes big get string getstring ws frame wsframe text message too big textmessagetoobig is under flow isunderflow comp act compact create space message buffer binary messagebufferbinary compact transformation result transformationresult overflow equals ref ill refill input data read input data transformation get more data getmoredata op code opcode fin rsv message buffer binary messagebufferbinary message buffer binary messagebufferbinary flip convert bytes utf code r result coderresult utf decoder message decodermessage decode message buffer binary messagebufferbinary message buffer text messagebuffertext is error iserror wsioexception close reason closereason close codes closecodes consistent get string getstring ws frame wsframe invalid utf invalidutf is overflow isoverflow space text buffer flush use partial usepartial message buffer text messagebuffertext flip send message text sendmessagetext message buffer text messagebuffertext clear wsioexception close reason closereason close codes closecodes big get string getstring ws frame wsframe text message too big textmessagetoobig is under flow isunderflow continuation expected continuationexpected managed decode use partial usepartial message buffer text messagebuffertext flip send message text sendmessagetext message buffer text messagebuffertext clear message buffer binary messagebufferbinary compact new frame newframe process frame code r coder flushed output message message buffer text messagebuffertext flip send message text sendmessagetext new message newmessage process data binary processdatabinary io exception ioexception copy data buffer transformation result transformationresult transformation get more data getmoredata op code opcode fin rsv message buffer binary messagebufferbinary transformation result transformationresult frame equals frame complete transformation result transformationresult underflow equals input data message buffer flush use partial usepartial close reason closereason close reason closereason close codes closecodes big get string getstring ws frame wsframe buffer too small buffertoosmall integer value of valueof message buffer binary messagebufferbinary capacity value of valueof payload length payloadlength wsioexception message buffer binary messagebufferbinary flip byte buffer bytebuffer copy byte buffer bytebuffer allocate message buffer binary messagebufferbinary limit copy message buffer binary messagebufferbinary copy flip send message binary sendmessagebinary copy message buffer binary messagebufferbinary clear read data transformation get more data getmoredata op code opcode fin rsv message buffer binary messagebufferbinary message complete use partial usepartial continuation expected continuationexpected message buffer binary messagebufferbinary flip byte buffer bytebuffer copy byte buffer bytebuffer allocate message buffer binary messagebufferbinary limit copy message buffer binary messagebufferbinary copy flip send message binary sendmessagebinary copy continuation expected continuationexpected message buffer binary messagebufferbinary clear continuation expected continuationexpected data message expected start frame new frame newframe message complete start message new message newmessage handle throwable on send handlethrowableonsend throwable wsioexception exception utils exceptionutils handle throwable handlethrowable ws session wssession get local getlocal on error onerror ws session wssession close reason closereason close reason closereason close codes closecodes closed abnormally get string getstring ws frame wsframe ioe triggered close ioetriggeredclose wsioexception suppress warnings suppresswarnings unchecked send message binary sendmessagebinary byte buffer bytebuffer msg wsioexception binary msg handler binarymsghandler wrapped message handler wrappedmessagehandler max message size maxmessagesize wrapped message handler wrappedmessagehandler binary msg handler binarymsghandler get max message size getmaxmessagesize max message size maxmessagesize msg remaining max message size maxmessagesize wsioexception close reason closereason close codes closecodes big get string getstring ws frame wsframe message too big messagetoobig value of valueof msg remaining value of valueof max message size maxmessagesize binary msg handler binarymsghandler message handler messagehandler partial message handler messagehandler partial byte buffer bytebuffer binary msg handler binarymsghandler on message onmessage msg caller ensures branch message handler messagehandler byte buffer bytebuffer binary msg handler binarymsghandler on message onmessage msg throwable handle throwable on send handlethrowableonsend new message newmessage message buffer binary messagebufferbinary clear message buffer text messagebuffertext clear utf decoder message decodermessage reset continuation expected continuationexpected new frame newframe new frame newframe read pos readpos write pos writepos read pos readpos write pos writepos mask index maskindex payload written payloadwritten frame reset process initial header processinitialheader fin rsv op code opcode payload length payloadlength mask check room headers checkroomheaders check room headers checkroomheaders buffer input buffer inputbuffer length read pos readpos limit based control frame full payload make room makeroom check room payload checkroompayload input buffer inputbuffer length read pos readpos payload length payloadlength payload written payloadwritten make room makeroom make room makeroom system arraycopy input buffer inputbuffer read pos readpos input buffer inputbuffer write pos writepos read pos readpos write pos writepos write pos writepos read pos readpos read pos readpos use partial usepartial util is control iscontrol op code opcode text message textmessage text msg handler textmsghandler message handler messagehandler partial binary binary msg handler binarymsghandler message handler messagehandler partial swallow input swallowinput to skip toskip math min payload length payloadlength payload written payloadwritten write pos writepos read pos readpos read pos readpos to skip toskip payload written payloadwritten to skip toskip payload written payloadwritten payload length payloadlength continuation expected continuationexpected new frame newframe new message newmessage byte array to long bytearraytolong start len io exception ioexception len io exception ioexception get string getstring ws frame wsframe byte to long fail bytetolongfail value of valueof len shift result start len start result result xff shift shift result is open isopen open transformation get transformation gettransformation transformation enum frame partial header data terminal transformation terminaltransformation transformation override validate rsv bits validatersvbits transformation override extension get extension response getextensionresponse terminal transformations extensions override set next setnext transformation terminal transformation inherit doc inheritdoc rsv invalid override validate rsv validatersv rsv op code opcode rsv override close terminal transformations client implementation payload data unmasking noop transformation nooptransformation terminal transformation terminaltransformation override transformation result transformationresult get more data getmoredata op code opcode fin rsv byte buffer bytebuffer dest op code opcode transformation op codes opcodes rsv point to write towrite math min payload length payloadlength payload written payloadwritten write pos writepos read pos readpos to write towrite math min to write towrite dest remaining dest input buffer inputbuffer read pos readpos to write towrite read pos readpos to write towrite payload written payloadwritten to write towrite payload written payloadwritten payload length payloadlength transformation result transformationresult frame read pos readpos write pos writepos transformation result transformationresult underflow dest has remaining hasremaining transformation result transformationresult overflow override list message part messagepart send message part sendmessagepart list message part messagepart message parts messageparts send simply message unchanged message parts messageparts server implementation payload data unmask processing unmask transformation unmasktransformation terminal transformation terminaltransformation override transformation result transformationresult get more data getmoredata op code opcode fin rsv byte buffer bytebuffer dest rsv point payload written payloadwritten payload length payloadlength read pos readpos write pos writepos dest has remaining hasremaining input buffer inputbuffer read pos readpos mask mask index maskindex xff mask index maskindex mask index maskindex mask index maskindex read pos readpos payload written payloadwritten dest payload written payloadwritten payload length payloadlength transformation result transformationresult frame read pos readpos write pos writepos transformation result transformationresult underflow dest has remaining hasremaining transformation result transformationresult overflow override list message part messagepart send message part sendmessagepart list message part messagepart message parts messageparts send simply message unchanged message parts messageparts