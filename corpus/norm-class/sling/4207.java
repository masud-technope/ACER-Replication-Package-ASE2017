licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache sling servlets impl java util collections java util hash map hashmap javax servlet http http servlet response httpservletresponse junit framework test case testcase org apache sling api sling http servlet request slinghttpservletrequest org apache sling api resource value map valuemap org apache sling api wrappers value map decorator valuemapdecorator org apache sling commons testing sling mock resource resolver mockresourceresolver org apache sling commons testing sling mock sling http servlet request mockslinghttpservletrequest redirect servlet test redirectservlettest test case testcase string test scheme http string test host host test port string test prefix test scheme test host test to absolute i testtoabsoluteuri string http http string https https string scheme test string host test host port port port any portany port non e portnone string target target regular building ports assert equals assertequals http host port any portany target redirect servlet redirectservlet to absolute uri toabsoluteuri http host port any portany target assert equals assertequals https host port any portany target redirect servlet redirectservlet to absolute uri toabsoluteuri https host port any portany target assert equals assertequals scheme host port any portany target redirect servlet redirectservlet to absolute uri toabsoluteuri scheme host port any portany target building ports assert equals assertequals http host target redirect servlet redirectservlet to absolute uri toabsoluteuri http host port target assert equals assertequals https host target redirect servlet redirectservlet to absolute uri toabsoluteuri https host port target assert equals assertequals scheme host port target redirect servlet redirectservlet to absolute uri toabsoluteuri scheme host port target building ports assert equals assertequals http host target redirect servlet redirectservlet to absolute uri toabsoluteuri http host port non e portnone target assert equals assertequals https host target redirect servlet redirectservlet to absolute uri toabsoluteuri https host port non e portnone target assert equals assertequals scheme host target redirect servlet redirectservlet to absolute uri toabsoluteuri scheme host port non e portnone target test get status testgetstatus http servlet response httpservletresponse valid invalid low invalidlow invalid high invalidhigh min max assert status assertstatus assert status assertstatus assert status assertstatus invalid low invalidlow assert status assertstatus invalid high invalidhigh assert status assertstatus valid valid assert status assertstatus min min assert status assertstatus max max test same parent testsameparent string base string target assert equals uri assertequalsuri to redirect toredirect base target base target assert equals uri assertequalsuri to redirect toredirect base target base target assert equals uri assertequalsuri to redirect toredirect base target test trailing slash testtrailingslash string base string target html assert equals uri assertequalsuri html to redirect toredirect base target test common ancestor testcommonancestor string base string target assert equals uri assertequalsuri to redirect toredirect base target test child testchild string base html string target html assert equals uri assertequalsuri html to redirect toredirect base target base target html assert equals uri assertequalsuri html to redirect toredirect base target base target assert equals uri assertequalsuri to redirect toredirect base target base html target html assert equals uri assertequalsuri html to redirect toredirect base target base target html assert equals uri assertequalsuri html to redirect toredirect base target base target assert equals uri assertequalsuri to redirect toredirect base target test child non root testchildnonroot string base html string target html assert equals uri assertequalsuri html to redirect toredirect base target base target html assert equals uri assertequalsuri html to redirect toredirect base target base target assert equals uri assertequalsuri to redirect toredirect base target base html target html assert equals uri assertequalsuri html to redirect toredirect base target base target html assert equals uri assertequalsuri html to redirect toredirect base target base target assert equals uri assertequalsuri to redirect toredirect base target test child relative testchildrelative string base string target html assert equals uri assertequalsuri html to redirect toredirect base target base target assert equals uri assertequalsuri to redirect toredirect base target base target html assert equals uri assertequalsuri html to redirect toredirect base target base target assert equals uri assertequalsuri to redirect toredirect base target test child non root relative testchildnonrootrelative string base string target html assert equals uri assertequalsuri html to redirect toredirect base target base target assert equals uri assertequalsuri to redirect toredirect base target base target html assert equals uri assertequalsuri html to redirect toredirect base target base target assert equals uri assertequalsuri to redirect toredirect base target test un common testuncommon string base string target assert equals uri assertequalsuri to redirect toredirect base target test sibbling testsibbling string base string target assert equals uri assertequalsuri to redirect toredirect base target string target assert equals uri assertequalsuri to redirect toredirect base target string target assert equals uri assertequalsuri base target to redirect toredirect base target test selectors etc testselectorsetc assert equals assertequals assert equals assertequals html assert equals assertequals print html assert equals assertequals print html assert equals assertequals html suffix pdf assert equals assertequals html assert equals assertequals html suffix pdf assert equals assertequals print html suffix pdf test empty path testemptypath mock sling http servlet request mockslinghttpservletrequest request mock sling http servlet request mockslinghttpservletrequest test scheme test host test port webapp request set resource resolver setresourceresolver mock resource resolver mockresourceresolver string path redirect servlet redirectservlet to redirect path toredirectpath html request assert equals uri assertequalsuri webapp html path request mock sling http servlet request mockslinghttpservletrequest test scheme test host test port webapp request set resource resolver setresourceresolver mock resource resolver mockresourceresolver path redirect servlet redirectservlet to redirect path toredirectpath html request assert equals uri assertequalsuri webapp html path helper assert equals assertequals string selectors string extension string suffix string query string querystring string base path basepath string target path targetpath string expected selectors expected selectors extension expected extension suffix expected suffix query string querystring expected query string querystring string actual to redirect toredirect base path basepath selectors extension suffix query string querystring target path targetpath assert equals uri assertequalsuri expected actual assert equals uri assertequalsuri string expected string actual is absolute isabsolute is absolute isabsolute assert equals assertequals expected actual assert equals assertequals expected actual assert status assertstatus expected status expectedstatus test status teststatus value map valuemap value map valuemap test status teststatus value map valuemap test status teststatus value map valuemap value map decorator valuemapdecorator hash map hashmap string object value map valuemap value map decorator valuemapdecorator collections singleton map singletonmap redirect servlet redirectservlet status prop object test status teststatus actual status actualstatus redirect servlet redirectservlet get status getstatus value map valuemap assert equals assertequals expected status expectedstatus actual status actualstatus string to redirect toredirect string base path basepath string target path targetpath to redirect toredirect base path basepath target path targetpath string to redirect toredirect string base path basepath string selectors string extension string suffix string query string querystring string target path targetpath mock sling http servlet request mockslinghttpservletrequest request mock sling http servlet request mockslinghttpservletrequest base path basepath selectors extension suffix query string querystring base path basepath test scheme test host test port request set resource resolver setresourceresolver mock resource resolver mockresourceresolver redirect servlet redirectservlet to redirect path toredirectpath target path targetpath request