licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache catalina java util concurrent executor service executorservice java util regex pattern host container represents virtual host catalina servlet engine types scenarios int erceptors interceptors single request processed virtual host catalina standalone http connector support multiple virtual hosts general host dep loying deploying catalina connected web server apache connector util ized utilized web server facilities determine context wrapper util ized utilized process request parent container attached host generally engine implementation child containers attached host generally implementations context representing individual servlet context author craig mc clanahan mcclanahan host container manifest constants container event containerevent event type alias code add alias addalias code string add alias event add alias addalias container event containerevent event type alias removed code remove alias removealias code string remove alias event remove alias removealias properties xml root host absolute path name pathname relative path name pathname url defaults catalina base conf engine host directory string get xml base getxmlbase xml root host absolute path name pathname relative path name pathname url defaults catalina base conf engine host directory param xml base xmlbase xml root set xml base setxmlbase string xml base xmlbase application root host absolute path name pathname relative path name pathname url string get app base getappbase application root host absolute path name pathname relative path name pathname url param app base appbase application root set app base setappbase string app base appbase auto deploy flag host child web apps webapps discovered automatically deployed dynamically get auto deploy getautodeploy auto deploy flag host param auto deploy autodeploy auto deploy flag set auto deploy setautodeploy auto deploy autodeploy java context configuration web applications string get config class getconfigclass java context configuration web applications param config class configclass context configuration set config class setconfigclass string config class configclass deploy startup flag host child web apps webapps discovered automatically deployed get deploy on startup getdeployonstartup deploy startup flag host param deploy on startup deployonstartup deploy startup flag set deploy on startup setdeployonstartup deploy on startup deployonstartup regular expression defines files directories host app base appbase automatic deployment process string get deploy ignore getdeployignore compiled regular expression defines files directories host app base appbase automatic deployment process pattern get deploy ignore pattern getdeployignorepattern regular expression defines files directories host app base appbase automatic deployment process set deploy ignore setdeployignore string deploy ignore deployignore executor starting stop ping stopping contexts components dep loying deploying contexts multi thr eaded threaded manner executor service executorservice get start stop executor getstartstopexecutor returns host configured automatically undeploy versions applications deployed parallel deployment takes link get auto deploy getautodeploy returns get undeploy old versions getundeployoldversions host automatically undeploy versions applications deployed parallel deployment takes link get auto deploy getautodeploy returns set undeploy old versions setundeployoldversions undeploy old versions undeployoldversions methods add alias mapped host param alias alias add alias addalias string alias alias names host defined length array returned string find aliases findaliases remove alias aliases host param alias alias removed remove alias removealias string alias returns host attempt create directories app base appbase xml base xmlbase exist host attempt create directories get create dirs getcreatedirs host attempt create directories xml base xmlbase app base appbase startup param create dirs createdirs set create dirs setcreatedirs create dirs createdirs