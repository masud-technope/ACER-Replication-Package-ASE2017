licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache tomcat util http parser java io exception ioexception java string reader stringreader org junit assert equals assertequals org junit assert null assertnull org junit assert true asserttrue org junit org junit test unit tests link http parser httpparser focusing media type defined rfc test media type testmediatype include whitespace ensure parser handles correctly skipped string type foo string subtype bar string types type subtype parameter param token parameter parameter param quoted parameter parameter param empty quoted parameter parameter param complex quoted parameter foo bar string charset utf string charset tutf string charset utf quoted retain space string charset quoted charset parameter param charset parameter charset charset parameter param charset parameter charset charset parameter param charset parameter charset charset parameter param charset quoted parameter charset charset quoted string lws values string test test simple testsimple io exception ioexception do test dotest test test simple with token testsimplewithtoken io exception ioexception do test dotest param token test test simple with quoted string testsimplewithquotedstring io exception ioexception do test dotest param quoted test test simple with empty quoted string testsimplewithemptyquotedstring io exception ioexception do test dotest param empty quoted test test simple with comp les quoted string testsimplewithcomplesquotedstring io exception ioexception do test dotest param complex quoted test test simple with charset testsimplewithcharset io exception ioexception do test dotest param charset test test simple with charset whitespace before testsimplewithcharsetwhitespacebefore io exception ioexception do test dotest param charset test test simple with charset whitespace after testsimplewithcharsetwhitespaceafter io exception ioexception do test dotest param charset test test simple with charset quoted testsimplewithcharsetquoted io exception ioexception do test dotest param charset quoted test test simple with all testsimplewithall io exception ioexception do test dotest param complex quoted param empty quoted param quoted param token param charset test test charset testcharset io exception ioexception string builder stringbuilder string builder stringbuilder append types append param charset append param token string reader stringreader string reader stringreader to string tostring media type mediatype http parser httpparser parse media type parsemediatype assert equals assertequals foo bar charset utf to string tostring assert equals assertequals charset get charset getcharset assert equals assertequals foo bar to string no charset tostringnocharset test test charset quoted testcharsetquoted io exception ioexception string builder stringbuilder string builder stringbuilder append types append param charset quoted string reader stringreader string reader stringreader to string tostring media type mediatype http parser httpparser parse media type parsemediatype assert equals assertequals charset get charset getcharset assert equals assertequals types replace all replaceall to string no charset tostringnocharset test test bug testbug io exception ioexception string input multipart boundary cdf start smil type application smil charset utf string reader stringreader string reader stringreader input media type mediatype http parser httpparser parse media type parsemediatype check types assert equals assertequals multipart get type gettype assert equals assertequals get subtype getsubtype check parameters assert true asserttrue get parameter count getparametercount assert equals assertequals cdf get parameter value getparametervalue boundary assert equals assertequals smil get parameter value getparametervalue start assert equals assertequals application smil charset utf get parameter value getparametervalue type string expected multipart boundary cdf start smil type application smil charset utf assert equals assertequals expected to string tostring assert equals assertequals expected to string no charset tostringnocharset assert null assertnull get charset getcharset test test bug testbug io exception ioexception string input text html utf charset utf string reader stringreader string reader stringreader input media type mediatype http parser httpparser parse media type parsemediatype check types assert equals assertequals text get type gettype assert equals assertequals html get subtype getsubtype check parameters assert true asserttrue get parameter count getparametercount assert equals assertequals get parameter value getparametervalue utf assert equals assertequals utf get charset getcharset note invalid input filtered assert equals assertequals text html charset utf to string tostring assert equals assertequals utf get charset getcharset test test bug testbug io exception ioexception string input text html charset utf string reader stringreader string reader stringreader input media type mediatype http parser httpparser parse media type parsemediatype assert equals assertequals text get type gettype assert equals assertequals html get subtype getsubtype assert true asserttrue get parameter count getparametercount assert equals assertequals utf get parameter value getparametervalue charset assert equals assertequals utf get charset getcharset assert equals assertequals text html charset utf to string tostring do test dotest parameter parameters io exception ioexception string lws lws values do test dotest lws parameters do test dotest string lws parameter parameters io exception ioexception string builder stringbuilder string builder stringbuilder append types parameter parameters append to string tostring lws string reader stringreader string reader stringreader to string tostring media type mediatype http parser httpparser parse media type parsemediatype check expected parameters assert true asserttrue get parameter count getparametercount parameters length check types assert equals assertequals type trim get type gettype assert equals assertequals subtype trim get subtype getsubtype check parameters parameters length assert equals assertequals parameters get value getvalue trim get parameter value getparametervalue parameters get name getname trim parameter string string parameter string string string get name getname string get value getvalue override string to string tostring to string tostring string to string tostring string lws string builder stringbuilder string builder stringbuilder append lws append append lws append append lws append append lws append append lws to string tostring test test case testcase exception string reader stringreader string reader stringreader type type media type mediatype http parser httpparser parse media type parsemediatype assert equals assertequals get parameter value getparametervalue assert equals assertequals get parameter value getparametervalue assert equals assertequals get parameter value getparametervalue assert equals assertequals get parameter value getparametervalue