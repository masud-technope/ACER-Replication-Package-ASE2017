header data cvs org eclipse ecf tests bundles org eclipse ecf tests apache http client httpclient server src org apache commons http client httpclient test http state testhttpstate java slewis exp revision copyright apache software foundation licensed apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license software consists voluntary contributions individuals behalf apache software foundation apache software foundation http apache org additional not ices notices required prior licensing conditions org apache commons http client httpclient org apache commons http client httpclient auth scope authscope junit framework simple tests link http state httpstate author rodney waldhoff author href mailto jsdever apache org jeff dever author sean sullivan author oleg kalnichevski version test http state testhttpstate java slewis exp test http state testhttpstate test case testcase credentials creds username password credentials usernamepasswordcredentials user pass credentials creds username password credentials usernamepasswordcredentials user pass auth scope authscope scope auth scope authscope auth scope authscope host auth scope authscope port realm auth scope authscope scope auth scope authscope auth scope authscope host auth scope authscope port realm auth scope authscope bogus auth scope authscope auth scope authscope host auth scope authscope port bogus auth scope authscope defscope auth scope authscope host auth scope authscope port realm constructor test http state testhttpstate string test name testname test name testname main main string args string test case name testcasename test http state testhttpstate get name getname junit text ui textui test runner testrunner main test case name testcasename test case testcase methods test suite test suite testsuite test http state testhttpstate test methods test http state credentials testhttpstatecredentials http state httpstate http state httpstate set credentials setcredentials scope creds set credentials setcredentials scope creds assert equals assertequals creds get credentials getcredentials scope assert equals assertequals creds get credentials getcredentials scope test to string testtostring http state httpstate http state httpstate assert not null assertnotnull to string tostring add cookie addcookie cookie foo bar yeah assert not null assertnotnull to string tostring add cookie addcookie cookie flub duck yuck assert not null assertnotnull to string tostring set credentials setcredentials scope creds assert not null assertnotnull to string tostring set proxy credentials setproxycredentials scope creds assert not null assertnotnull to string tostring test http state no credentials testhttpstatenocredentials http state httpstate http state httpstate assert equals assertequals get credentials getcredentials bogus test http state default credentials testhttpstatedefaultcredentials http state httpstate http state httpstate set credentials setcredentials auth scope authscope creds set credentials setcredentials scope creds assert equals assertequals creds get credentials getcredentials bogus test http state proxy credentials testhttpstateproxycredentials http state httpstate http state httpstate set proxy credentials setproxycredentials scope creds set proxy credentials setproxycredentials scope creds assert equals assertequals creds get proxy credentials getproxycredentials scope assert equals assertequals creds get proxy credentials getproxycredentials scope test http state proxy no credentials testhttpstateproxynocredentials http state httpstate http state httpstate assert equals assertequals get proxy credentials getproxycredentials bogus test http state proxy default credentials testhttpstateproxydefaultcredentials http state httpstate http state httpstate set proxy credentials setproxycredentials auth scope authscope creds set proxy credentials setproxycredentials scope creds assert equals assertequals creds get proxy credentials getproxycredentials bogus test methods sel ecting selecting credentials test default credentials testdefaultcredentials exception http state httpstate http state httpstate credentials expected username password credentials usernamepasswordcredentials pass set credentials setcredentials auth scope authscope expected credentials get credentials getcredentials defscope assert equals assertequals expected test realm credentials testrealmcredentials exception http state httpstate http state httpstate credentials expected username password credentials usernamepasswordcredentials pass set credentials setcredentials defscope expected credentials get credentials getcredentials defscope assert equals assertequals expected test host credentials testhostcredentials exception http state httpstate http state httpstate credentials expected username password credentials usernamepasswordcredentials pass set credentials setcredentials auth scope authscope host auth scope authscope port auth scope authscope realm expected credentials get credentials getcredentials defscope assert equals assertequals expected test wrong host credentials testwronghostcredentials exception http state httpstate http state httpstate credentials expected username password credentials usernamepasswordcredentials pass set credentials setcredentials auth scope authscope host auth scope authscope port realm expected credentials get credentials getcredentials auth scope authscope host auth scope authscope port realm assert not same assertnotsame expected test wrong realm credentials testwrongrealmcredentials exception http state httpstate http state httpstate credentials cred username password credentials usernamepasswordcredentials pass set credentials setcredentials auth scope authscope host auth scope authscope port realm cred credentials get credentials getcredentials auth scope authscope host auth scope authscope port realm assert not same assertnotsame cred test methods matching credentials test scope matching testscopematching auth scope authscope authscope auth scope authscope some host somehost some realm somerealm some scheme somescheme auth scope authscope authscope auth scope authscope some other host someotherhost some realm somerealm some scheme somescheme assert true asserttrue authscope match authscope authscope match auth scope authscope auth scope authscope host auth scope authscope port auth scope authscope realm some scheme somescheme authscope match auth scope authscope auth scope authscope host auth scope authscope port some realm somerealm auth scope authscope scheme assert true asserttrue authscope match auth scope authscope auth scope authscope host auth scope authscope port auth scope authscope realm some scheme somescheme authscope match auth scope authscope auth scope authscope host auth scope authscope port some realm somerealm auth scope authscope scheme assert true asserttrue authscope match auth scope authscope auth scope authscope host auth scope authscope port some realm somerealm some scheme somescheme authscope match auth scope authscope auth scope authscope host auth scope authscope realm auth scope authscope scheme assert true asserttrue authscope match auth scope authscope auth scope authscope host some realm somerealm some scheme somescheme authscope match auth scope authscope some host somehost auth scope authscope port auth scope authscope realm auth scope authscope scheme assert true asserttrue authscope match auth scope authscope authscope match auth scope authscope auth scope authscope host auth scope authscope port auth scope authscope realm some scheme somescheme assert true asserttrue test credentials matching testcredentialsmatching credentials creds username password credentials usernamepasswordcredentials pass credentials creds username password credentials usernamepasswordcredentials pass credentials creds username password credentials usernamepasswordcredentials pass auth scope authscope scope auth scope authscope auth scope authscope host auth scope authscope port auth scope authscope realm auth scope authscope scope auth scope authscope auth scope authscope host auth scope authscope port some realm somerealm auth scope authscope scope auth scope authscope some host somehost auth scope authscope port auth scope authscope realm http state httpstate http state httpstate set credentials setcredentials scope creds set credentials setcredentials scope creds set credentials setcredentials scope creds credentials get credentials getcredentials auth scope authscope some other host someotherhost some other realm someotherrealm basic credentials expected creds assert equals assertequals expected get credentials getcredentials auth scope authscope some other host someotherhost some realm somerealm basic expected creds assert equals assertequals expected get credentials getcredentials auth scope authscope some host somehost some other realm someotherrealm basic expected creds assert equals assertequals expected