copyright jan rellermeyer systems group dep artment department computer science eth zurich rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors jan rellermeyer initial api implementation mark us markus alexander kuppe enhancements bug fixes ethz iks slp impl java file java file input stream fileinputstream java i o exception ioexception java security general security exception generalsecurityexception java security key factory keyfactory java security private key privatekey java security public key publickey java security spec pkcs encoded key spec encodedkeyspec java security spec encoded key spec encodedkeyspec java util hash map hashmap java util map java util properties java util string tokenizer stringtokenizer slp configuration slpconfiguration object holds config urable configurable properties author jan rellermeyer eth zurich slp configuration slpconfiguration string scopes prop net slp use scopes usescopes string scopes string addresses prop net slp da addr esses daaddresses string addresses string wait time prop net slp wait time waittime string wait time string trace datraffic prop net slp tracedatraffic string trace datraffic string trace message prop net slp trace msg tracemsg string trace message string trace drop prop net slp trace drop tracedrop string trace drop string trace reg prop net slp trace reg tracereg string trace reg string mcast ttl prop net slp multicastttl string mcast ttl string mcast max wait prop net slp multicast maximum wait multicastmaximumwait string mcast max wait string mcast timeouts prop net slp multicast time outs multicasttimeouts string mcast timeouts string datagram max wait prop net slp data gram maximum wait datagrammaximumwait string datagram max wait string datagram timeouts prop net slp data gram time outs datagramtimeouts string datagram timeouts string mtu prop net slp mtu string mtu string security enabled prop net slp security enabled securityenabled string security enabled string spi prop net slp spi string spi string key prop net slp private key privatekey string key prop net slp public key publickey string interfaces prop net slp interfaces string interfaces string discovery prop net slp nodadiscovery string port prop net slp port string port string convergence failercount string convergence failercount prop net slp fail ercount failercount string debug enabled prop ethz iks slp debug string interfaces port string scopes discovery string addresses trace traffic trace messages trace drop trace reg mcast ttl mcast max wait mcast timeouts datagram max wait datagram timeouts mtu security enabled string spi wait time map key cache map key cache convergence failercount debug enabled create slp configuration slpconfiguration properties param properties properties slp configuration slpconfiguration process properties processproperties system get properties getproperties create slp configuration slpconfiguration config file param file file i o exception ioexception errors slp configuration slpconfiguration file file i o exception ioexception properties props properties props load file input stream fileinputstream file props put all putall system get properties getproperties process properties processproperties props process properties processproperties properties props string ifaces props get property getproperty interfaces prop interfaces ifaces interfaces interfaces string slp message slpmessage string to list stringtolist ifaces to array toarray string port integer parse int parseint props get property getproperty port prop port scopes props get property getproperty scopes prop scopes discovery props get property getproperty discovery prop boolean value booleanvalue string d as das props get property getproperty addresses prop addresses d as das addresses addresses string slp message slpmessage string to list stringtolist d as das to array toarray string trace traffic props get property getproperty trace datraffic prop trace datraffic boolean value booleanvalue trace messages props get property getproperty trace message prop trace message boolean value booleanvalue trace drop props get property getproperty trace drop prop trace drop boolean value booleanvalue trace reg props get property getproperty trace reg prop trace reg boolean value booleanvalue mcast ttl integer parse int parseint props get property getproperty mcast ttl prop mcast ttl mcast max wait integer parse int parseint props get property getproperty mcast max wait prop mcast max wait datagram max wait integer parse int parseint props get property getproperty datagram max wait prop datagram max wait mcast timeouts parse time outs parsetimeouts props get property getproperty mcast timeouts prop mcast timeouts datagram timeouts parse time outs parsetimeouts props get property getproperty datagram timeouts prop datagram timeouts mtu integer parse int parseint props get property getproperty mtu prop mtu security enabled props get property getproperty security enabled prop security enabled boolean value booleanvalue spi props get property getproperty spi prop spi wait time integer parse int parseint props get property getproperty wait time prop wait time convergence failercount integer parse int parseint props get property getproperty convergence failercount prop convergence failercount debug enabled props get property getproperty debug enabled prop boolean value booleanvalue security enabled key cache hash map hashmap key cache hash map hashmap returns net work network interfaces interfaces string get interfaces getinterfaces interfaces port port get port getport port scopes scopes string get scopes getscopes scopes predefined add res ses addresses add res ses addresses string get da addr esses getdaaddresses addresses discovery discovery disabled get no da discovery getnodadiscovery discovery trace tra ffic traffic trace enabled get trace da traffic gettracedatraffic trace traffic trace messages trace enabled get trace message gettracemessage trace messages trace dropped messages trace enabled get trace drop gettracedrop trace drop trace registrations trace enabled get trace reg gettracereg trace reg multicast ttl multicast ttl getmcastttl mcast ttl multicast max wait time max wait time get mcast max wait getmcastmaxwait mcast max wait data gram datagram max wait time data gram datagram max wait time get data gram max wait getdatagrammaxwait datagram max wait parse timeout lists param timeout list string timeout array parse time outs parsetimeouts string string tokenizer stringtokenizer string tokenizer stringtokenizer timeouts count tokens counttokens timeouts length timeouts integer parse int parseint next token nexttoken timeouts multicast timeouts multicast timeouts get mcast time outs getmcasttimeouts mcast timeouts data gram datagram timeouts data gram datagram timeouts get data gram time outs getdatagramtimeouts datagram timeouts mtu mtu getmtu mtu security enabled security enabled get security enabled getsecurityenabled security enabled spi s spis spi string list string getspi spi key spi param spi spi location key i o exception ioexception general security exception generalsecurityexception public key publickey get public key getpublickey string spi i o exception ioexception general security exception generalsecurityexception public key publickey key public key publickey key cache spi key key file input stream fileinputstream key fis keyfis file input stream fileinputstream system get property getproperty key prop spi enc key enckey key fis keyfis key fis keyfis read enc key enckey key fis keyfis close encoded key spec encodedkeyspec pub key spec pubkeyspec encoded key spec encodedkeyspec enc key enckey key factory keyfactory key factory keyfactory key factory keyfactory get instance getinstance dsa key key factory keyfactory generate public generatepublic pub key spec pubkeyspec key cache spi key key key spi param spi spi location key i o exception ioexception general security exception generalsecurityexception private key privatekey get private key getprivatekey string spi i o exception ioexception general security exception generalsecurityexception private key privatekey key private key privatekey key cache spi key key file input stream fileinputstream key fis keyfis file input stream fileinputstream system get property getproperty key prop spi enc key enckey key fis keyfis key fis keyfis read enc key enckey key fis keyfis close pkcs encoded key spec encodedkeyspec priv key spec privkeyspec pkcs encoded key spec encodedkeyspec enc key enckey key factory keyfactory key factory keyfactory key factory keyfactory get instance getinstance dsa key key factory keyfactory generate private generateprivate priv key spec privkeyspec key cache spi key key wait time wait time get wait time getwaittime wait time defines inc onclusive inconclusive multicast convergence multicastconvergence cycles attempt aborted indirectly defines multicast convergence link slp message slpmessage srvtyperqst send attempt heuristical optimization multicast convergence early inc onclusive inconclusive inc onclusive inconclusive cycles allowed get convergence failer count getconvergencefailercount convergence failercount debug mode turned debug mode enabled get debug enabled getdebugenabled debug enabled defining tcp send time gettcptimeout