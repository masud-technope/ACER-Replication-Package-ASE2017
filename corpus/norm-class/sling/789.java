licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache sling resource resolver resourceresolver impl params org junit assert equals assertequals org junit assert null assertnull org junit assert true asserttrue java util hash map hashmap java util map org apache sling resource resolver resourceresolver impl params path parser pathparser org junit test path parameters parser test pathparametersparsertest path parser pathparser parser path parser pathparser test null parses to null nullparsestonull parser parse assert null assertnull parser get path getpath assert true asserttrue parser get parameters getparameters is empty isempty test empty parses to empty emptyparsestoempty parser parse assert equals assertequals parser get path getpath assert true asserttrue parser get parameters getparameters is empty isempty test no parameters return empty map noparametersreturnemptymap parser parse path parameters assert equals assertequals path parameters parser get path getpath assert true asserttrue parser get parameters getparameters is empty isempty test parameter can be added after resource parametercanbeaddedafterresource parser parse content test key xyz assert equals assertequals content test parser get path getpath assert equals assertequals map key xyz parser get parameters getparameters parser parse content test key xyz html assert equals assertequals content test html parser get path getpath assert equals assertequals map key xyz parser get parameters getparameters test parameter can be escaped parametercanbeescaped parser parse content test key xyz assert equals assertequals content test parser get path getpath assert equals assertequals map key xyz parser get parameters getparameters parser parse content test key xyz html assert equals assertequals content test html parser get path getpath assert equals assertequals map key xyz parser get parameters getparameters test multiple parameters are allowed multipleparametersareallowed parser parse content test key xyz key abc assert equals assertequals content test parser get path getpath assert equals assertequals map key xyz key abc parser get parameters getparameters parser parse content test key xyz key abc html assert equals assertequals content test html parser get path getpath assert equals assertequals map key xyz key abc parser get parameters getparameters test multiple parameters can be escaped multipleparameterscanbeescaped parser parse content test key key assert equals assertequals content test parser get path getpath assert equals assertequals map key key parser get parameters getparameters parser parse content test key key html assert equals assertequals content test html parser get path getpath assert equals assertequals map key key parser get parameters getparameters test parameter can be added after extension parametercanbeaddedafterextension parser parse content test html key xyz assert equals assertequals content test html parser get path getpath assert equals assertequals map key xyz parser get parameters getparameters parser parse content test html key xyz suffix assert equals assertequals content test html suffix parser get path getpath assert equals assertequals map key xyz parser get parameters getparameters test dot doesn t have to be escaped after extension dotdoesnthavetobeescapedafterextension parser parse content test html assert equals assertequals content test html parser get path getpath assert equals assertequals map parser get parameters getparameters parser parse content test html suffix assert equals assertequals content test html suffix parser get path getpath assert equals assertequals map parser get parameters getparameters test slash have to be escaped after extension slashhavetobeescapedafterextension parser parse content test html assert equals assertequals content test html parser get path getpath assert equals assertequals map parser get parameters getparameters parser parse content test html suffix assert equals assertequals content test html suffix parser get path getpath assert equals assertequals map parser get parameters getparameters test quote has to be closed quotehastobeclosed test invalid params testinvalidparams content test key key cde html asd test empty value is allowed emptyvalueisallowed parser parse content test key html assert equals assertequals content test html parser get path getpath assert equals assertequals map key parser get parameters getparameters parser parse content test key html assert equals assertequals content test html parser get path getpath assert equals assertequals map key parser get parameters getparameters test parameters without equals sign are invalid parameterswithoutequalssignareinvalid test invalid params testinvalidparams content test key html test parameters in the middle of the path are invalid parametersinthemiddleofthepathareinvalid test invalid params testinvalidparams content key test html test parameters in the suffix are invalid parametersinthesuffixareinvalid test invalid params testinvalidparams content test html suffix key map string string map string values map string string hash map hashmap string string values length values values test invalid params testinvalidparams string path parser parse path assert equals assertequals path parser get path getpath assert equals assertequals map parser get parameters getparameters