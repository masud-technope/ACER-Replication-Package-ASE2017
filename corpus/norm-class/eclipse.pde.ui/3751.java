copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde tests model bundle junit framework test junit framework test suite testsuite org eclipse pde internal core ibundle i manifest header imanifestheader org eclipse pde internal core text bundle bundle symbolic name header bundlesymbolicnameheader org eclipse text edits text edit textedit org osgi framework constants bundle symbolic name test case bundlesymbolicnametestcase bundle model test case bundlemodeltestcase bundle symbolic name test case bundlesymbolicnametestcase constants bundle symbolicname test suite test suite testsuite bundle symbolic name test case bundlesymbolicnametestcase override test absent header testabsentheader string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion f document fdocument buffer to string tostring load assert null assertnull f model fmodel get bundle getbundle get manifest header getmanifestheader constants bundle symbolicname override test present header testpresentheader string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symbolic name symbolicname xyz f document fdocument buffer to string tostring load assert not null assertnotnull f model fmodel get bundle getbundle get manifest header getmanifestheader constants bundle symbolicname override test header offset testheaderoffset exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symbolic name symbolicname xyz f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants bundle symbolicname assert equals assertequals f document fdocument get line offset getlineoffset header get offset getoffset override test header offset testheaderoffset exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symbolic name symbolicname xyz buffer append require bundle abc f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants bundle symbolicname assert equals assertequals f document fdocument get line offset getlineoffset header get offset getoffset override test header length testheaderlength exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symbolic name symbolicname xyz f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants bundle symbolicname assert equals assertequals f document fdocument get line length getlinelength header get length getlength override test header length with windows delimiter testheaderlengthwithwindowsdelimiter exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symbolic name symbolicname xyz f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants bundle symbolicname assert equals assertequals f document fdocument get line length getlinelength header get length getlength test add bundle symbolic name testaddbundlesymbolicname exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append require bundle xyz f document fdocument buffer to string tostring load f model fmodel get bundle getbundle set header setheader constants bundle symbolicname abc i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants bundle symbolicname assert not null assertnotnull header assert equals assertequals bundle symbolic name symbolicname abc header write text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals buffer to string tostring header write f document fdocument test remove bundle symbolic name testremovebundlesymbolicname exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symbolic name symbolicname xyz buffer append require bundle abc f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants bundle symbolicname assert not null assertnotnull header bundle symbolic name header bundlesymbolicnameheader header set id setid text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines test change bundle symbolic name testchangebundlesymbolicname exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symbolic name symbolicname xyz buffer append require bundle abc f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants bundle symbolicname bundle symbolic name header bundlesymbolicnameheader header set id setid core text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines assert equals assertequals f document fdocument get line length getlinelength pos f document fdocument get line offset getlineoffset length f document fdocument get line length getlinelength assert equals assertequals bundle symbolic name symbolicname core f document fdocument pos length test read singleton directive testreadsingletondirective string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symbolic name symbolicname xyz singleton buffer append require bundle abc f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants bundle symbolicname assert not null assertnotnull header assert true asserttrue bundle symbolic name header bundlesymbolicnameheader header is singleton issingleton test add singleton directive testaddsingletondirective exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symbolic name symbolicname xyz buffer append require bundle org eclipse osgi f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants bundle symbolicname assert not null assertnotnull header bundle symbolic name header bundlesymbolicnameheader header set singleton setsingleton text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines assert equals assertequals f document fdocument get line length getlinelength pos f document fdocument get line offset getlineoffset length f document fdocument get line length getlinelength assert equals assertequals bundle symbolic name symbolicname xyz singleton f document fdocument pos length test remove singleton directive testremovesingletondirective exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symbolic name symbolicname xyz singleton buffer append require bundle org eclipse osgi resolution optional f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants bundle symbolicname assert not null assertnotnull header bundle symbolic name header bundlesymbolicnameheader header set singleton setsingleton text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines assert equals assertequals f document fdocument get line length getlinelength pos f document fdocument get line offset getlineoffset length f document fdocument get line length getlinelength assert equals assertequals bundle symbolic name symbolicname xyz f document fdocument pos length