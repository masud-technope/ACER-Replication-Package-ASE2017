copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde tests model bundle org eclipse pde internal core ibundle i manifest header imanifestheader org eclipse pde internal core text bundle require bundle header requirebundleheader org eclipse pde internal core text bundle require bundle object requirebundleobject org eclipse text edits text edit textedit org osgi framework constants junit framework test junit framework test suite testsuite require bundle test case requirebundletestcase multi line header test case multilineheadertestcase require bundle test case requirebundletestcase constants require bundle test suite test suite testsuite require bundle test case requirebundletestcase test add require bundle header testaddrequirebundleheader exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz f document fdocument buffer to string tostring load f model fmodel get bundle getbundle set header setheader constants require bundle abc i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle assert not null assertnotnull header assert equals assertequals require bundle abc header write text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals buffer to string tostring header write f document fdocument test remove existing require bundle header testremoveexistingrequirebundleheader exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle abc f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle assert not null assertnotnull header require bundle header requirebundleheader header remove bundle removebundle abc text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines test add bundle testaddbundle exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle abc f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle require bundle header requirebundleheader header add bundle addbundle core text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines assert equals assertequals f document fdocument get line length getlinelength pos f document fdocument get line offset getlineoffset length f document fdocument get line length getlinelength f document fdocument get line length getlinelength string buffer stringbuffer expected string buffer stringbuffer require bundle abc expected append core assert equals assertequals expected to string tostring f document fdocument pos length test add multiple bundles testaddmultiplebundles exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle abc f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle require bundle header requirebundleheader header add bundle addbundle core require bundle header requirebundleheader header add bundle addbundle require bundle header requirebundleheader header add bundle addbundle text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines assert equals assertequals f document fdocument get line length getlinelength pos f document fdocument get line offset getlineoffset length f document fdocument get line offset getlineoffset f document fdocument get line offset getlineoffset string buffer stringbuffer expected string buffer stringbuffer require bundle abc expected append core expected append expected append assert equals assertequals expected to string tostring f document fdocument pos length test remove bundle testremovebundle exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle abc buffer append core buffer append f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle require bundle header requirebundleheader header remove bundle removebundle core text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines assert equals assertequals f document fdocument get line length getlinelength pos f document fdocument get line offset getlineoffset length f document fdocument get line offset getlineoffset f document fdocument get line offset getlineoffset string buffer stringbuffer expected string buffer stringbuffer require bundle abc expected append assert equals assertequals expected to string tostring f document fdocument pos length test remove multiple bundles testremovemultiplebundles exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle abc buffer append core buffer append f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle require bundle header requirebundleheader header remove bundle removebundle core require bundle header requirebundleheader header remove bundle removebundle abc text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines assert equals assertequals f document fdocument get line length getlinelength pos f document fdocument get line offset getlineoffset length f document fdocument get line length getlinelength assert equals assertequals require bundle f document fdocument pos length test read optional bundle testreadoptionalbundle string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle abc resolution optional f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle assert not null assertnotnull header require bundle object requirebundleobject bundle get bundle getbundle require bundle header requirebundleheader header abc assert not null assertnotnull bundle assert true asserttrue bundle is optional isoptional test set get version testsetgetversion string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle org eclipse osgi bundle version f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle assert not null assertnotnull header require bundle object requirebundleobject bundle get bundle getbundle require bundle header requirebundleheader header org eclipse osgi assert not null assertnotnull bundle assert equals assertequals bundle get version getversion bundle set version setversion assert equals assertequals bundle get version getversion test read bundle with version testreadbundlewithversion string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle org eclipse osgi bundle version f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle assert not null assertnotnull header require bundle object requirebundleobject bundle get bundle getbundle require bundle header requirebundleheader header org eclipse osgi assert not null assertnotnull bundle assert equals assertequals bundle get version getversion test make bundle optional testmakebundleoptional exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle org eclipse osgi f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle assert not null assertnotnull header require bundle object requirebundleobject bundle get bundle getbundle require bundle header requirebundleheader header org eclipse osgi assert not null assertnotnull bundle bundle set optional setoptional text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines assert equals assertequals f document fdocument get line length getlinelength pos f document fdocument get line offset getlineoffset length f document fdocument get line length getlinelength assert equals assertequals require bundle org eclipse osgi resolution optional f document fdocument pos length test remove optional directive testremoveoptionaldirective exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle org eclipse osgi resolution optional f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle assert not null assertnotnull header require bundle object requirebundleobject object get bundle getbundle require bundle header requirebundleheader header org eclipse osgi assert not null assertnotnull object object set optional setoptional text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines assert equals assertequals f document fdocument get line length getlinelength pos f document fdocument get line offset getlineoffset length f document fdocument get line length getlinelength assert equals assertequals require bundle org eclipse osgi f document fdocument pos length test add version to bundle testaddversiontobundle exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle org eclipse osgi f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle assert not null assertnotnull header require bundle object requirebundleobject object get bundle getbundle require bundle header requirebundleheader header org eclipse osgi assert not null assertnotnull object object set version setversion text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines assert equals assertequals f document fdocument get line length getlinelength pos f document fdocument get line offset getlineoffset length f document fdocument get line length getlinelength assert equals assertequals require bundle org eclipse osgi bundle version f document fdocument pos length test remove version from bundle testremoveversionfrombundle exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle org eclipse osgi f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle assert not null assertnotnull header require bundle object requirebundleobject object get bundle getbundle require bundle header requirebundleheader header org eclipse osgi assert not null assertnotnull object object set version setversion text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines assert equals assertequals f document fdocument get line length getlinelength pos f document fdocument get line offset getlineoffset length f document fdocument get line length getlinelength assert equals assertequals require bundle org eclipse osgi f document fdocument pos length test add bundle with windows delimiter testaddbundlewithwindowsdelimiter exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle abc f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle require bundle header requirebundleheader header add bundle addbundle core text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines assert equals assertequals f document fdocument get line length getlinelength pos f document fdocument get line offset getlineoffset length f document fdocument get line length getlinelength f document fdocument get line length getlinelength string buffer stringbuffer expected string buffer stringbuffer require bundle abc expected append core assert equals assertequals expected to string tostring f document fdocument pos length test remove bundle with windows delimiter testremovebundlewithwindowsdelimiter exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle abc buffer append core buffer append f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle require bundle header requirebundleheader header remove bundle removebundle core text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines assert equals assertequals f document fdocument get line length getlinelength pos f document fdocument get line offset getlineoffset length f document fdocument get line offset getlineoffset f document fdocument get line offset getlineoffset string buffer stringbuffer expected string buffer stringbuffer require bundle abc expected append assert equals assertequals expected to string tostring f document fdocument pos length test preserve spacing testpreservespacing exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle buffer append abc f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle require bundle header requirebundleheader header add bundle addbundle core text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines assert equals assertequals f document fdocument get line length getlinelength pos f document fdocument get line offset getlineoffset length f document fdocument get line offset getlineoffset f document fdocument get line offset getlineoffset string buffer stringbuffer expected string buffer stringbuffer require bundle expected append abc expected append core assert equals assertequals expected to string tostring f document fdocument pos length test read bundle re export testreadbundlereexport string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle abc visibility reexport f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle assert not null assertnotnull header require bundle object requirebundleobject bundle get bundle getbundle require bundle header requirebundleheader header abc assert not null assertnotnull bundle assert true asserttrue bundle is reexported isreexported test make bundle re export testmakebundlereexport exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle org eclipse osgi f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle assert not null assertnotnull header require bundle object requirebundleobject bundle get bundle getbundle require bundle header requirebundleheader header org eclipse osgi assert not null assertnotnull bundle bundle set reexported setreexported text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines assert equals assertequals f document fdocument get line length getlinelength pos f document fdocument get line offset getlineoffset length f document fdocument get line length getlinelength assert equals assertequals require bundle org eclipse osgi visibility reexport f document fdocument pos length test remove re export testremovereexport exception string buffer stringbuffer buffer string buffer stringbuffer buffer append manifest version buffer append bundle manifest version manifestversion buffer append bundle symoblic name symoblicname xyz buffer append require bundle org eclipse osgi visibility reexport f document fdocument buffer to string tostring load i manifest header imanifestheader header f model fmodel get bundle getbundle get manifest header getmanifestheader constants require bundle assert not null assertnotnull header require bundle object requirebundleobject object get bundle getbundle require bundle header requirebundleheader header org eclipse osgi assert not null assertnotnull object object set reexported setreexported text edit textedit ops f listener flistener get text operations gettextoperations assert equals assertequals ops length ops apply f document fdocument assert equals assertequals f document fdocument get number of lines getnumberoflines assert equals assertequals f document fdocument get line length getlinelength pos f document fdocument get line offset getlineoffset length f document fdocument get line length getlinelength assert equals assertequals require bundle org eclipse osgi f document fdocument pos length require bundle object requirebundleobject get bundle getbundle require bundle header requirebundleheader header string require bundle object requirebundleobject bundles header get required bundles getrequiredbundles require bundle object requirebundleobject bundle bundles bundle get id getid equals bundle