copyright eclipse source eclipsesource rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors eclipse source eclipsesource initial api implementation org eclipse ecf remoteservice client java java net uri java net uri syntax exception urisyntaxexception java util org apache http org apache http org apache http client http client httpclient org apache http client config request config requestconfig org apache http client entity url encoded form entity urlencodedformentity org apache http client methods org apache http client utils uri builder uribuilder org apache http impl basic scheme basicscheme org apache http impl client http client builder httpclientbuilder org apache http message abstract http message abstracthttpmessage org apache http message basic name value pair basicnamevaluepair org apache http protocol basic http context basichttpcontext org eclipse ecf core security org eclipse ecf core util ecf exception ecfexception org eclipse ecf remoteservice i remote call iremotecall org eclipse ecf remoteservice i remote service iremoteservice org eclipse ecf remoteservice client org eclipse ecf remoteservice i rest call irestcall org eclipse ecf remoteservice rest exception restexception represents service client side view rest ful restful web service accessed methods methods inherited link i remote service iremoteservice rest client service restclientservice abstract rest client service abstractrestclientservice nls nls socket timeout sockettimeout integer value of valueof system get property getproperty org eclipse ecf remoteservice rest client service restclientservice socket timeout sockettimeout int value intvalue nls nls connect request timeout connectrequesttimeout integer value of valueof system get property getproperty org eclipse ecf remoteservice rest client service restclientservice connect request timeout connectrequesttimeout int value intvalue nls nls connect timeout connecttimeout integer value of valueof system get property getproperty org eclipse ecf remoteservice rest client service restclientservice connect timeout connecttimeout int value intvalue response buffer size nls string http content charset utf http client httpclient http client httpclient response buffer size responsebuffersize response buffer size rest client service restclientservice rest client container restclientcontainer container remote service client registration remoteserviceclientregistration registration container registration http client httpclient create http client createhttpclient http client httpclient create http client createhttpclient http client builder httpclientbuilder create build is response ok isresponseok http response httpresponse response is ok code isokcode response get status line getstatusline get status code getstatuscode is ok code isokcode is ok code isokcode http get httpget create get method creategetmethod string uri http get httpget uri http post httppost create post method createpostmethod string uri http post httppost uri http put httpput create put method createputmethod string uri http put httpput uri http delete httpdelete create delete method createdeletemethod string uri http delete httpdelete uri http patch httppatch create patch method createpatchmethod string uri http patch httppatch uri http request base httprequestbase create and prepare http method createandpreparehttpmethod uri request urirequest request http request base httprequestbase http method httpmethod string uri request get uri geturi i remote callable iremotecallable callable request get remote callable getremotecallable i remote callable request type iremotecallablerequesttype request type requesttype callable http get request type httpgetrequesttype callable get request type getrequesttype request type requesttype http get request type httpgetrequesttype http method httpmethod create get method creategetmethod uri request type requesttype http patch request type httppatchrequesttype http method httpmethod create patch method createpatchmethod uri request type requesttype http post request type httppostrequesttype http method httpmethod create post method createpostmethod uri request type requesttype http put request type httpputrequesttype http method httpmethod create put method createputmethod uri request type requesttype http delete request type httpdeleterequesttype http method httpmethod create delete method createdeletemethod uri prepare http method httpmethod prepare http method preparehttpmethod http method httpmethod request get remote call getremotecall callable http method httpmethod calls service url i rest call irestcall returned response body input stream inputstream param call remote call code code param callable callable parameters call input stream inputstream response body code code error occurs object invoke remote call invokeremotecall i remote call iremotecall call i remote callable iremotecallable callable ecf exception ecfexception nls nls nls trace invoke remote call invokeremotecall call call callable callable string endpoint uri endpointuri prepare endpoint address prepareendpointaddress call callable nls nls trace invoke remote call invokeremotecall prepared endpoint endpoint uri endpointuri uri request urirequest uri request urirequest create uri request createurirequest endpoint uri endpointuri call callable request http request base httprequestbase http method httpmethod uri request urirequest create and prepare http method createandpreparehttpmethod endpoint uri endpointuri call callable create and prepare http method createandpreparehttpmethod uri request urirequest nls nls trace invoke remote call invokeremotecall executing http method httpmethod http method httpmethod execute method response body responsebody response code responsecode http response httpresponse response response http client httpclient execute http method httpmethod nls nls trace invoke remote call invokeremotecall http method httpmethod executed response response response code responsecode response get status line getstatusline get status code getstatuscode is response ok isresponseok response response body responsebody string response body responsebody get response as bytes getresponseasbytes response method returns retrieve response body retrieve error response body retrieveerrorresponsebody response response body responsebody get response as bytes getresponseasbytes response pass exception handler nls nls handle exception handleexception http response http method httpmethod http method httpmethod response code responsecode integer response code responsecode response code responsecode response body responsebody i o exception ioexception handle exception handleexception rest client service restclientservice transport i o exception ioexception response code responsecode object result map response headers responseheaders convert response headers convertresponseheaders response get all headers getallheaders nls nls nls nls nls nls trace process response processresponse http method httpmethod http method httpmethod call call callable callable response headers responseheaders response headers responseheaders response body responsebody response body responsebody result process response processresponse endpoint uri endpointuri call callable response headers responseheaders response body responsebody not serializable exception notserializableexception handle exception handleexception exception deserializing response http method httpmethod http method httpmethod response code responsecode integer response code responsecode response code responsecode result retrieve error response body retrieveerrorresponsebody http response httpresponse response xxx defined diff erently differently get response as bytes getresponseasbytes http response httpresponse response i o exception ioexception byte array output stream bytearrayoutputstream byte array output stream bytearrayoutputstream response get entity getentity write to writeto to byte array tobytearray deprecated setup time outs setuptimeouts http client httpclient http client httpclient i remote call iremotecall call i remote callable iremotecallable callable longer map convert response headers convertresponseheaders header headers map result hash map hashmap headers result headers length string headers get name getname string headers get value getvalue result result add request headers addrequestheaders abstract http message abstracthttpmessage http method httpmethod i remote call iremotecall call i remote callable iremotecallable callable add request headers callable map request headers requestheaders callable get request type getrequesttype abstract request type abstractrequesttype abstract request type abstractrequesttype callable get request type getrequesttype get default request headers getdefaultrequestheaders hash map hashmap request headers requestheaders request headers requestheaders hash map hashmap call i rest call irestcall map call headers callheaders i rest call irestcall call get request headers getrequestheaders call headers callheaders request headers requestheaders put all putall request headers requestheaders key set keyset request headers requestheaders key set keyset object headers key set keyset to array toarray headers length string key string headers string string request headers requestheaders key http method httpmethod add header addheader key http request base httprequestbase create and prepare http method createandpreparehttpmethod string uri i remote call iremotecall call i remote callable iremotecallable callable rest exception restexception http request base httprequestbase http method httpmethod i remote callable request type iremotecallablerequesttype request type requesttype callable get request type getrequesttype request type requesttype nls rest exception restexception request type call request type requesttype http get request type httpgetrequesttype http method httpmethod prepare get method preparegetmethod uri call callable request type requesttype http patch request type httppatchrequesttype http method httpmethod prepare patch method preparepatchmethod uri call callable request type requesttype http post request type httppostrequesttype http method httpmethod prepare post method preparepostmethod uri call callable request type requesttype http put request type httpputrequesttype http method httpmethod prepare put method prepareputmethod uri call callable request type requesttype http delete request type httpdeleterequesttype http method httpmethod prepare delete method preparedeletemethod uri call callable nls nls rest exception restexception http method request type requesttype supported not serializable exception notserializableexception string message serialize parameters uri uri call call callable callable log exception logexception message rest exception restexception message unsupported encoding exception unsupportedencodingexception string message serialize parameters uri uri call call callable callable log exception logexception message rest exception restexception message prepare http method preparehttpmethod http method httpmethod call callable http method httpmethod prepare http method preparehttpmethod http request base httprequestbase http method httpmethod i remote call iremotecall call i remote callable iremotecallable callable add additional request headers add request headers addrequestheaders http method httpmethod call callable handle authentication setup auth enticaton setupauthenticaton http client httpclient http method httpmethod setup http method config redirects time outs timeouts setup http method setuphttpmethod http method httpmethod call callable setup http method setuphttpmethod http request base httprequestbase http method httpmethod i remote call iremotecall call i remote callable iremotecallable callable request config requestconfig default request config defaultrequestconfig http method httpmethod get config getconfig request config requestconfig builder updated request config builder updatedrequestconfigbuilder default request config defaultrequestconfig request config requestconfig custom request config requestconfig copy default request config defaultrequestconfig setup regular circular redirects updated request config builder updatedrequestconfigbuilder set circular redirects allowed setcircularredirectsallowed updated request config builder updatedrequestconfigbuilder set redirects enabled setredirectsenabled s timeout stimeout socket timeout sockettimeout sc timeout sctimeout connect timeout connecttimeout scr timeout scrtimeout connect request timeout connectrequesttimeout call timeout calltimeout call get timeout gettimeout call timeout calltimeout i remote call iremotecall timeout call timeout calltimeout callable get default timeout getdefaulttimeout call timeout calltimeout i remote call iremotecall timeout s timeout stimeout sc timeout sctimeout scr timeout scrtimeout call timeout calltimeout int value intvalue updated request config builder updatedrequestconfigbuilder set socket timeout setsockettimeout s timeout stimeout updated request config builder updatedrequestconfigbuilder set connect timeout setconnecttimeout sc timeout sctimeout updated request config builder updatedrequestconfigbuilder set connection request timeout setconnectionrequesttimeout scr timeout scrtimeout http method httpmethod set config setconfig updated request config builder updatedrequestconfigbuilder build rest exception restexception http request base httprequestbase prepare delete method preparedeletemethod string uri i remote call iremotecall call i remote callable iremotecallable callable rest exception restexception http delete httpdelete uri http request base httprequestbase prepare put method prepareputmethod string uri i remote call iremotecall call i remote callable iremotecallable callable not serializable exception notserializableexception unsupported encoding exception unsupportedencodingexception http put httpput result http put httpput uri http put request type httpputrequesttype put request type putrequesttype http put request type httpputrequesttype callable get request type getrequesttype i remote call parameter iremotecallparameter default parameters defaultparameters callable get default parameters getdefaultparameters object parameters call get parameters getparameters put request type putrequesttype use request entity userequestentity default parameters defaultparameters default parameters defaultparameters length parameters parameters length http entity httpentity request entity requestentity put request type putrequesttype generate request entity generaterequestentity uri call callable default parameters defaultparameters parameters result set entity setentity request entity requestentity name value pair namevaluepair params to name value pairs tonamevaluepairs uri call callable params result set entity setentity get url encoded form entity geturlencodedformentity arrays as list aslist params put request type putrequesttype result unsupported encoding exception unsupportedencodingexception ecf exception ecfexception http request base httprequestbase prepare patch method preparepatchmethod string uri i remote call iremotecall call i remote callable iremotecallable callable not serializable exception notserializableexception unsupported encoding exception unsupportedencodingexception http patch httppatch result http patch httppatch uri http post request type httppostrequesttype post request type postrequesttype http post request type httppostrequesttype callable get request type getrequesttype i remote call parameter iremotecallparameter default parameters defaultparameters callable get default parameters getdefaultparameters object parameters call get parameters getparameters post request type postrequesttype use request entity userequestentity default parameters defaultparameters default parameters defaultparameters length parameters parameters length http entity httpentity request entity requestentity post request type postrequesttype generate request entity generaterequestentity uri call callable default parameters defaultparameters parameters result set entity setentity request entity requestentity name value pair namevaluepair params to name value pairs tonamevaluepairs uri call callable params result set entity setentity get url encoded form entity geturlencodedformentity arrays as list aslist params post request type postrequesttype result unsupported encoding exception unsupportedencodingexception ecf exception ecfexception http request base httprequestbase prepare post method preparepostmethod string uri i remote call iremotecall call i remote callable iremotecallable callable not serializable exception notserializableexception unsupported encoding exception unsupportedencodingexception http post httppost result http post httppost uri http post request type httppostrequesttype post request type postrequesttype http post request type httppostrequesttype callable get request type getrequesttype i remote call parameter iremotecallparameter default parameters defaultparameters callable get default parameters getdefaultparameters object parameters call get parameters getparameters post request type postrequesttype use request entity userequestentity default parameters defaultparameters default parameters defaultparameters length parameters parameters length http entity httpentity request entity requestentity post request type postrequesttype generate request entity generaterequestentity uri call callable default parameters defaultparameters parameters result set entity setentity request entity requestentity name value pair namevaluepair params to name value pairs tonamevaluepairs uri call callable params result set entity setentity get url encoded form entity geturlencodedformentity arrays as list aslist params post request type postrequesttype result not serializable exception notserializableexception ecf exception ecfexception http request base httprequestbase prepare get method preparegetmethod string uri i remote call iremotecall call i remote callable iremotecallable callable not serializable exception notserializableexception name value pair namevaluepair params to name value pairs tonamevaluepairs uri call callable uri httpuri uri builder uribuilder builder uri builder uribuilder uri params params length builder add parameter addparameter params get name getname params get value getvalue httpuri builder build uri syntax exception urisyntaxexception not serializable exception notserializableexception uri uri proper uri syntax http get httpget httpuri url encoded form entity urlencodedformentity get url encoded form entity geturlencodedformentity list list abstract entity request type abstractentityrequesttype post request type postrequesttype unsupported encoding exception unsupportedencodingexception post request type postrequesttype default charset defaultcharset url encoded form entity urlencodedformentity list post request type postrequesttype default charset defaultcharset url encoded form entity urlencodedformentity list name value pair namevaluepair to name value pairs tonamevaluepairs string uri i remote call iremotecall call i remote callable iremotecallable callable not serializable exception notserializableexception i remote call parameter iremotecallparameter rest parameters restparameters prepare parameters prepareparameters uri call callable list name value list namevaluelist array list arraylist rest parameters restparameters rest parameters restparameters length string parameter value parametervalue object rest parameters restparameters get value getvalue string parameter value parametervalue string parameter value parametervalue to string tostring parameter value parametervalue name value list namevaluelist add basic name value pair basicnamevaluepair rest parameters restparameters get name getname parameter value parametervalue name value pair namevaluepair name value list namevaluelist to array toarray name value pair namevaluepair name value list namevaluelist size setup auth enticaton setupauthenticaton http client httpclient http client httpclient http request base httprequestbase method i connect context iconnectcontext connect context connectcontext container get connect context for authentication getconnectcontextforauthentication connect context connectcontext nls name callback namecallback name callback namecallback name callback namecallback object callback objectcallback password callback passwordcallback object callback objectcallback callback call backs callbacks callback name callback namecallback password callback passwordcallback callback handler callbackhandler callback handler callbackhandler connect context connectcontext get callback handler getcallbackhandler callback handler callbackhandler callback handler callbackhandler handle call backs callbacks string username name callback namecallback get name getname string password string password callback passwordcallback get object getobject credentials credentials username password credentials usernamepasswordcredentials username password method add header addheader basic scheme basicscheme authenticate credentials method basic http context basichttpcontext i o exception ioexception log exception logexception i o exception ioexception setting credentials http client httpclient unsupported callback exception unsupportedcallbackexception log exception logexception unsupported callback exception unsupportedcallbackexception setting credentials http client httpclient authentication exception authenticationexception log exception logexception authentication exception authenticationexception setting credentials http client httpclient