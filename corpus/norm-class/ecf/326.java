copyright jan rellermeyer systems group dep artment department computer science eth zurich rights reserved redistribution source binary forms modification permitted conditions met redistributions source code retain copyright not ice notice list conditions disclaimer redistributions binary form reproduce copyright not ice notice list conditions disclaimer documentation materials distribution eth zurich names contributors end orse endorse promote products derived software specific prior written permission software copyright holders contributors express implied warranties including limited implied warranties merchantability fitness purpose disclaimed event copyright owner contributors liable dir ect direct indirect incidental special exemplary consequential damages including limited procurement substitute goods services loss data profits business interruption caused theory liability contract strict liability tort including negligence arising software advised possibility damage ethz iks osgi messages java io exception ioexception java object input stream objectinputstream java object output stream objectoutputstream java net socket exception socketexception ethz iks osgi remoteosgiexception base messages author jan rellermeyer eth zurich remoteosgimessage type code lease messages lease type code fetch service messages request service type code deliver service messages deliver service type code deliver bundle messages deprecated deliver bundle type code invoke method messages remote call type code method result messages remote call result type code remote event messages remote event type code time offset messages time offset type code service attribute updates lease update type code stream request messages stream request type code stream result messages stream result type code request dependency message request dependencies type code request bundle message request bundle type code deliver bundles message deliver bundles type code functionid slp notation funcid transaction xid hides constructor remoteosgimessage funcid funcid funcid transaction xid getxid xid xid param xid xid setxid xid xid xid function type code message type code get func d getfuncid funcid reads net work network packet constructs subtype remoteosgimessage header pre version function xid xid cnt d cntd pre body processed subtype param input data input datainput providing net work network packet remoteosgimessage io exception ioexception class not found exception classnotfoundexception socket exception socketexception wrong remoteosgimessage parse object input stream objectinputstream input io exception ioexception class not found exception classnotfoundexception version unused input read byte readbyte funcid input read byte readbyte xid input read int readint remoteosgimessage msg funcid lease msg lease message leasemessage input request service msg request service message requestservicemessage input deliver service msg d eliver service message deliverservicemessage input remote call msg remote call message remotecallmessage input remote call result msg remote call result message remotecallresultmessage input remote event msg remote event message remoteeventmessage input time offset msg time offset message timeoffsetmessage input lease update msg lease update message leaseupdatemessage input stream request msg stream request message streamrequestmessage input stream result msg stream result message streamresultmessage input request dependencies msg request dependencies message requestdependenciesmessage input request bundle msg request bundle message requestbundlemessage input deliver bundles msg d eliver bundles message deliverbundlesmessage input remoteosgiexception nls funcid funcid supported msg funcid funcid msg xid xid msg write remoteosgimessage output stream param object output stream objectoutputstream io exception ioexception failures send object output stream objectoutputstream io exception ioexception write write funcid write int writeint xid write body writebody reset flush write body remoteosgimessage param output output stream io exception ioexception failures write body writebody object output stream objectoutputstream output io exception ioexception reads bytes encoded slp string param input data input datainput array io exception ioexception failures read bytes readbytes object input stream objectinputstream input io exception ioexception length input read int readint buffer length input read fully readfully buffer buffer writes array param output stream param bytes bytes io exception ioexception failures write bytes writebytes object output stream objectoutputstream bytes io exception ioexception write int writeint bytes length bytes length write bytes write string array param output stream param strings string array io exception ioexception failures write string array writestringarray object output stream objectoutputstream string strings io exception ioexception length strings length write short writeshort length length writeutf strings read string array param input stream read string array io exception ioexception failures string read string array readstringarray object input stream objectinputstream io exception ioexception length read short readshort string result string length length result readutf result