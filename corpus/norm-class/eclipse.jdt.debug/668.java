copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdi internal java byte array output stream bytearrayoutputstream java data input stream datainputstream java data output stream dataoutputstream java io exception ioexception java print writer printwriter java util java util map org eclipse jdi bootstrap org eclipse jdi internal jdwp jdwp command packet jdwpcommandpacket org eclipse jdi internal jdwp jdwp packet jdwppacket org eclipse jdi internal jdwp jdwp reply packet jdwpreplypacket org eclipse jdi internal jdwp jdwp string jdwpstring org eclipse jdt internal debug core jdi debug options jdidebugoptions sun jdi class not prepared exception classnotpreparedexception sun jdi internal exception internalexception sun jdi invalid stack frame exception invalidstackframeexception sun jdi mirror sun jdi native method exception nativemethodexception sun jdi object collected exception objectcollectedexception sun jdi vm disconnected exception vmdisconnectedexception sun jdi vm mismatch exception vmmismatchexception sun jdi vm out of memory exception vmoutofmemoryexception sun jdi virtual machine virtualmachine interfaces declared jdi specification sun jdi mirror impl mirrorimpl mirror description mirror object string f description fdescription virtual machine mirror object virtual machine impl virtualmachineimpl f virtual machine impl fvirtualmachineimpl verbose writer verbosewriter verbose info written verbose verbose writer verbosewriter f verbose writer fverbosewriter jdwp request response fully processed f pending jdwp request fpendingjdwprequest constructor virtual machine objects stores description mirror object virtual machine mirror impl mirrorimpl string description f description fdescription description f virtual machine impl fvirtualmachineimpl virtual machine impl virtualmachineimpl print writer printwriter writer virtual machine manager impl virtualmachinemanagerimpl org eclipse jdi bootstrap virtual machine manager virtualmachinemanager verbose print writer verboseprintwriter writer f verbose writer fverbosewriter verbose writer verbosewriter writer constructor stores description mirror object virtual machine mirror impl mirrorimpl string description virtual machine impl virtualmachineimpl virtual machine impl virtualmachineimpl f virtual machine impl fvirtualmachineimpl virtual machine impl virtualmachineimpl f description fdescription description print writer printwriter writer virtual machine manager impl virtualmachinemanagerimpl org eclipse jdi bootstrap virtual machine manager virtualmachinemanager verbose print writer verboseprintwriter writer f verbose writer fverbosewriter verbose writer verbosewriter writer returns description mirror object override string to string tostring f description fdescription returns virtual machine mirror object override virtual machine virtualmachine virtual machine virtualmachine f virtual machine impl fvirtualmachineimpl returns virtual machine implementation mirror object virtual machine impl virtualmachineimpl virtual machine impl virtualmachineimpl f virtual machine impl fvirtualmachineimpl processing jdwp event init jdwp event set initjdwpeventset jdwp command packet jdwpcommandpacket command packet commandpacket f verbose writer fverbosewriter nls f verbose writer fverbosewriter println received event nls f verbose writer fverbosewriter println length command packet commandpacket get length getlength nls f verbose writer fverbosewriter println command packet commandpacket get id getid f verbose writer fverbosewriter println flags command packet commandpacket get flags getflags nls jdwp packet jdwppacket get flag map getflagmap f verbose writer fverbosewriter println command nls command packet commandpacket get command getcommand nls f verbose writer fverbosewriter println command nls command packet commandpacket get command getcommand processing jdwp event handled jdwp event set handledjdwpeventset f verbose writer fverbosewriter f verbose writer fverbosewriter println f verbose writer fverbosewriter flush processing jdwp request note includes building request message parsing response init jdwp request initjdwprequest f verbose writer fverbosewriter f verbose writer fverbosewriter goto position gotoposition writes command packet header verbose write verbose command packet header writeverbosecommandpacketheader jdwp command packet jdwpcommandpacket command packet commandpacket f verbose writer fverbosewriter command command packet commandpacket get command getcommand current position currentposition f verbose writer fverbosewriter position f verbose writer fverbosewriter goto position gotoposition nls f verbose writer fverbosewriter print sending command f verbose writer fverbosewriter print value printvalue command jdwp command packet jdwpcommandpacket command map commandmap nls f verbose writer fverbosewriter println nls f verbose writer fverbosewriter println length command packet commandpacket get length getlength nls f verbose writer fverbosewriter println command packet commandpacket get id getid f verbose writer fverbosewriter println flags command packet commandpacket get flags getflags nls jdwp packet jdwppacket get flag map getflagmap nls f verbose writer fverbosewriter println command command nls f verbose writer fverbosewriter println command command f verbose writer fverbosewriter goto position gotoposition current position currentposition processing jdwp request handled jdwp request handledjdwprequest f verbose writer fverbosewriter f pending jdwp request fpendingjdwprequest f verbose writer fverbosewriter println f verbose writer fverbosewriter flush f pending jdwp request fpendingjdwprequest performs request returns reply data jdwp reply packet jdwpreplypacket requestvm command out data outdata jdwp command packet jdwpcommandpacket command packet commandpacket jdwp command packet jdwpcommandpacket command command packet commandpacket set data setdata out data outdata system current time millis currenttimemillis f virtual machine impl fvirtualmachineimpl packet send manager packetsendmanager send packet sendpacket command packet commandpacket f pending jdwp request fpendingjdwprequest write verbose command packet header writeverbosecommandpacketheader command packet commandpacket jdwp reply packet jdwpreplypacket reply f virtual machine impl fvirtualmachineimpl packet receive manager packetreceivemanager get reply getreply command packet commandpacket recieved system current time millis currenttimemillis jdi debug options jdidebugoptions debug jdi request times string buffer stringbuffer buf string buffer stringbuffer buf append jdi debug options jdidebugoptions format format nls buf append jdi request buf append command packet commandpacket to string tostring nls buf append t response tresponse time buf append recieved nls buf append nls buf append length buf append reply get length getlength jdi debug options jdidebugoptions trace buf to string tostring f verbose writer fverbosewriter f verbose writer fverbosewriter println nls f verbose writer fverbosewriter println received reply nls f verbose writer fverbosewriter println length reply get length getlength nls f verbose writer fverbosewriter println reply get id getid f verbose writer fverbosewriter println flags reply get flags getflags nls jdwp packet jdwppacket get flag map getflagmap f verbose writer fverbosewriter println error code reply error code errorcode jdwp reply packet jdwpreplypacket nls error map errormap reply performs request returns reply data jdwp reply packet jdwpreplypacket requestvm command byte array output stream bytearrayoutputstream out data outdata requestvm command out data outdata to byte array tobytearray performs request object returns reply data jdwp reply packet jdwpreplypacket requestvm command object reference impl objectreferenceimpl object byte array output stream bytearrayoutputstream byte out stream byteoutstream byte array output stream bytearrayoutputstream data output stream dataoutputstream data out stream dataoutstream data output stream dataoutputstream byte out stream byteoutstream object write data out stream dataoutstream io exception ioexception defaultioexceptionhandler requestvm command byte out stream byteoutstream performs request object returns reply data jdwp reply packet jdwpreplypacket requestvm command reference type impl referencetypeimpl ref type reftype byte array output stream bytearrayoutputstream byte out stream byteoutstream byte array output stream bytearrayoutputstream data output stream dataoutputstream data out stream dataoutstream data output stream dataoutputstream byte out stream byteoutstream ref type reftype write data out stream dataoutstream io exception ioexception defaultioexceptionhandler requestvm command byte out stream byteoutstream performs request returns reply data jdwp reply packet jdwpreplypacket requestvm command requestvm command performs error handling default reply error handler defaultreplyerrorhandler error error jdwp reply packet jdwpreplypacket jdwp reply packet jdwpreplypacket invalid object object collected exception objectcollectedexception jdwp reply packet jdwpreplypacket invalid class not prepared exception classnotpreparedexception jdwp reply packet jdwpreplypacket prepared class not prepared exception classnotpreparedexception jdwp reply packet jdwpreplypacket memory vm out of memory exception vmoutofmemoryexception jdwp reply packet jdwpreplypacket illegal argument illegal argument exception illegalargumentexception jdwp reply packet jdwpreplypacket method native method exception nativemethodexception jdwp reply packet jdwpreplypacket invalid frame id frameid invalid stack frame exception invalidstackframeexception jdwp reply packet jdwpreplypacket implemented unsupported operation exception unsupportedoperationexception jdwp reply packet jdwpreplypacket hcr operation ref used refused org eclipse jdi hcr operation ref used exception operationrefusedexception jdwp reply packet jdwpreplypacket dead vm disconnected exception vmdisconnectedexception internal exception internalexception jdi messages jdimessages mirror impl mirrorimpl error code reply error error performs handling io exception ioexception creating int erpreting interpreting jdwp packet defaultioexceptionhandler exception internal exception internalexception jdi messages jdimessages mirror impl mirrorimpl invalid data waits command packet returns command packet jdwp command packet jdwpcommandpacket get command m getcommandvm command timeout interrupted exception interruptedexception f virtual machine impl fvirtualmachineimpl packet receive manager packetreceivemanager get command getcommand command timeout exception vm mismatch exception vmmismatchexception thrown mirror argument mirror belong virtual machine virtualmachine checkvm mirror mirror vm mismatch exception vmmismatchexception mirror impl mirrorimpl mirror virtual machine impl virtualmachineimpl virtual machine impl virtualmachineimpl vm mismatch exception vmmismatchexception disconnects disconnectvm f virtual machine impl fvirtualmachineimpl set disconnected setdisconnected f virtual machine impl fvirtualmachineimpl packet send manager packetsendmanager disconnectvm f virtual machine impl fvirtualmachineimpl packet receive manager packetreceivemanager disconnectvm virtual machine manager impl virtualmachinemanagerimpl bootstrap virtual machine manager virtualmachinemanager remove connected m removeconnectedvm f virtual machine impl fvirtualmachineimpl reads jdwp data verbose outputs verbose info returns read read byte readbyte string description data input stream datainputstream io exception ioexception result read byte readbyte f verbose writer fverbosewriter f verbose writer fverbosewriter println description result result reads jdwp data verbose outputs verbose info returns read read short readshort string description data input stream datainputstream io exception ioexception result read short readshort f verbose writer fverbosewriter f verbose writer fverbosewriter println description result result reads jdwp data verbose outputs verbose info returns read read int readint string description data input stream datainputstream io exception ioexception result read int readint f verbose writer fverbosewriter f verbose writer fverbosewriter println description result result reads jdwp data verbose outputs verbose info returns read read long readlong string description data input stream datainputstream io exception ioexception result read long readlong f verbose writer fverbosewriter f verbose writer fverbosewriter println description result result reads jdwp data verbose outputs verbose info returns read read byte readbyte string description map integer string value to string valuetostring data input stream datainputstream io exception ioexception result read byte readbyte f verbose writer fverbosewriter f verbose writer fverbosewriter println description result value to string valuetostring result reads jdwp data verbose outputs verbose info returns read read short readshort string description map integer string value to string valuetostring data input stream datainputstream io exception ioexception result read short readshort f verbose writer fverbosewriter f verbose writer fverbosewriter println description result value to string valuetostring result reads jdwp data verbose outputs verbose info returns read read int readint string description map integer string value to string valuetostring data input stream datainputstream io exception ioexception result read int readint f verbose writer fverbosewriter f verbose writer fverbosewriter println description result value to string valuetostring result reads jdwp data verbose outputs verbose info returns read string read string readstring string description data input stream datainputstream io exception ioexception string result jdwp string jdwpstring read f verbose writer fverbosewriter f verbose writer fverbosewriter println description result result reads jdwp data verbose outputs verbose info returns read read boolean readboolean string description data input stream datainputstream io exception ioexception result read boolean readboolean f verbose writer fverbosewriter f verbose writer fverbosewriter println description result result reads jdwp data verbose outputs verbose info returns read read char readchar string description data input stream datainputstream io exception ioexception result read char readchar f verbose writer fverbosewriter f verbose writer fverbosewriter println description result result reads jdwp data verbose outputs verbose info returns read read double readdouble string description data input stream datainputstream io exception ioexception result read double readdouble f verbose writer fverbosewriter f verbose writer fverbosewriter println description result result reads jdwp data verbose outputs verbose info returns read read float readfloat string description data input stream datainputstream io exception ioexception result read float readfloat f verbose writer fverbosewriter f verbose writer fverbosewriter println description result result reads jdwp data verbose outputs verbose info returns read read byte array readbytearray length string description data input stream datainputstream io exception ioexception result length read fully readfully result f verbose writer fverbosewriter f verbose writer fverbosewriter println description result result writes jdwp data verbose outputs verbose info write byte writebyte string description data output stream dataoutputstream io exception ioexception write byte writebyte f verbose writer fverbosewriter f verbose writer fverbosewriter println description writes jdwp data verbose outputs verbose info write short writeshort string description data output stream dataoutputstream io exception ioexception write short writeshort f verbose writer fverbosewriter f verbose writer fverbosewriter println description writes jdwp data verbose outputs verbose info write int writeint string description data output stream dataoutputstream io exception ioexception write int writeint f verbose writer fverbosewriter f verbose writer fverbosewriter println description writes jdwp data verbose outputs verbose info write long writelong string description data output stream dataoutputstream io exception ioexception write long writelong f verbose writer fverbosewriter f verbose writer fverbosewriter println description writes jdwp data verbose outputs verbose info write byte writebyte string description map integer string value to string valuetostring data output stream dataoutputstream io exception ioexception write byte writebyte f verbose writer fverbosewriter f verbose writer fverbosewriter println description value to string valuetostring writes jdwp data verbose outputs verbose info write short writeshort string description map integer string value to string valuetostring data output stream dataoutputstream io exception ioexception write short writeshort f verbose writer fverbosewriter f verbose writer fverbosewriter println description value to string valuetostring writes jdwp data verbose outputs verbose info write int writeint string description map integer string value to string valuetostring data output stream dataoutputstream io exception ioexception write int writeint f verbose writer fverbosewriter f verbose writer fverbosewriter println description value to string valuetostring writes jdwp data verbose outputs verbose info write string writestring string string description data output stream dataoutputstream io exception ioexception jdwp string jdwpstring write f verbose writer fverbosewriter f verbose writer fverbosewriter println description writes jdwp data verbose outputs verbose info write boolean writeboolean string description data output stream dataoutputstream io exception ioexception write boolean writeboolean f verbose writer fverbosewriter f verbose writer fverbosewriter println description writes jdwp data verbose outputs verbose info write char writechar string description data output stream dataoutputstream io exception ioexception write char writechar f verbose writer fverbosewriter f verbose writer fverbosewriter println description writes jdwp data verbose outputs verbose info write double writedouble string description data output stream dataoutputstream io exception ioexception write double writedouble f verbose writer fverbosewriter f verbose writer fverbosewriter println description writes jdwp data verbose outputs verbose info write float writefloat string description data output stream dataoutputstream io exception ioexception write float writefloat f verbose writer fverbosewriter f verbose writer fverbosewriter println description writes jdwp data verbose outputs verbose info write short writeshort string description string bit names bitnames data output stream dataoutputstream io exception ioexception write short writeshort f verbose writer fverbosewriter f verbose writer fverbosewriter println description bit names bitnames writes jdwp data verbose outputs verbose info write int writeint string description string bit names bitnames data output stream dataoutputstream io exception ioexception write int writeint f verbose writer fverbosewriter f verbose writer fverbosewriter println description bit names bitnames reads jdwp data verbose outputs verbose info returns read read byte readbyte string description string bit names bitnames data input stream datainputstream io exception ioexception result read byte readbyte f verbose writer fverbosewriter f verbose writer fverbosewriter println description result bit names bitnames result reads jdwp data verbose outputs verbose info returns read read short readshort string description string bit names bitnames data input stream datainputstream io exception ioexception result read short readshort f verbose writer fverbosewriter f verbose writer fverbosewriter println description result bit names bitnames result reads jdwp data verbose outputs verbose info returns read read int readint string description string bit names bitnames data input stream datainputstream io exception ioexception result read int readint f verbose writer fverbosewriter f verbose writer fverbosewriter println description result bit names bitnames result writes jdwp data verbose outputs verbose info write byte writebyte string description string bit names bitnames data output stream dataoutputstream io exception ioexception write byte writebyte f verbose writer fverbosewriter f verbose writer fverbosewriter println description bit names bitnames returns verbose writer verbosewriter verbose info written verbose verbose writer verbosewriter verbose writer verbosewriter f verbose writer fverbosewriter