licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache catalina org apache tomcat util digester digester org apache tomcat util digester rule set base rulesetbase strong rule set ruleset strong processing contents cluster definition element author filip hanik author peter rossbach cluster rule set clusterruleset rule set base rulesetbase instance variables matching pattern prefix recognizing elements string prefix construct instance code rule set ruleset code matching pattern prefix cluster rule set clusterruleset construct instance code rule set ruleset code matching pattern prefix param prefix prefix matching pattern rules including trailing slash character cluster rule set clusterruleset string prefix namespaceuri prefix prefix methods add rule instances defined rule set ruleset code digester code instance associating namespace uri method called digester instance param digester digester instance rule instances override add rule instances addruleinstances digester digester cluster configuration start digester add object create addobjectcreate prefix manager element class name classname digester add set properties addsetproperties prefix manager digester add set next addsetnext prefix manager set manager template setmanagertemplate org apache catalina cluster manager clustermanager digester add object create addobjectcreate prefix manager session id generator sessionidgenerator org apache catalina util standard session id generator standardsessionidgenerator class name classname digester add set properties addsetproperties prefix manager session id generator sessionidgenerator digester add set next addsetnext prefix manager session id generator sessionidgenerator set session id generator setsessionidgenerator org apache catalina session id generator sessionidgenerator digester add object create addobjectcreate prefix channel element class name classname digester add set properties addsetproperties prefix channel digester add set next addsetnext prefix channel set channel setchannel org apache catalina tribes channel string channel prefix channelprefix prefix channel channel properties digester add object create addobjectcreate channel prefix channelprefix membership element class name classname digester add set properties addsetproperties channel prefix channelprefix membership digester add set next addsetnext channel prefix channelprefix membership set membership service setmembershipservice org apache catalina tribes membership service membershipservice digester add object create addobjectcreate channel prefix channelprefix membership listener membershiplistener element class name classname digester add set properties addsetproperties channel prefix channelprefix membership listener membershiplistener digester add set next addsetnext channel prefix channelprefix membership listener membershiplistener add membership listener addmembershiplistener org apache catalina tribes membership listener membershiplistener digester add object create addobjectcreate channel prefix channelprefix sender element class name classname digester add set properties addsetproperties channel prefix channelprefix sender digester add set next addsetnext channel prefix channelprefix sender set channel sender setchannelsender org apache catalina tribes channel sender channelsender digester add object create addobjectcreate channel prefix channelprefix sender transport element class name classname digester add set properties addsetproperties channel prefix channelprefix sender transport digester add set next addsetnext channel prefix channelprefix sender transport set transport settransport org apache catalina tribes transport multi point sender multipointsender digester add object create addobjectcreate channel prefix channelprefix receiver element class name classname digester add set properties addsetproperties channel prefix channelprefix receiver digester add set next addsetnext channel prefix channelprefix receiver set channel receiver setchannelreceiver org apache catalina tribes channel receiver channelreceiver digester add object create addobjectcreate channel prefix channelprefix interceptor element class name classname digester add set properties addsetproperties channel prefix channelprefix interceptor digester add set next addsetnext channel prefix channelprefix interceptor add interceptor addinterceptor org apache catalina tribes channel interceptor channelinterceptor digester add object create addobjectcreate channel prefix channelprefix interceptor local member localmember element class name classname digester add set properties addsetproperties channel prefix channelprefix interceptor local member localmember digester add set next addsetnext channel prefix channelprefix interceptor local member localmember set local member setlocalmember org apache catalina tribes member digester add object create addobjectcreate channel prefix channelprefix interceptor member element class name classname digester add set properties addsetproperties channel prefix channelprefix interceptor member digester add set next addsetnext channel prefix channelprefix interceptor member add static member addstaticmember org apache catalina tribes member digester add object create addobjectcreate channel prefix channelprefix channel listener channellistener element class name classname digester add set properties addsetproperties channel prefix channelprefix channel listener channellistener digester add set next addsetnext channel prefix channelprefix channel listener channellistener add channel listener addchannellistener org apache catalina tribes channel listener channellistener digester add object create addobjectcreate prefix valve element class name classname digester add set properties addsetproperties prefix valve digester add set next addsetnext prefix valve add valve addvalve org apache catalina valve digester add object create addobjectcreate prefix deployer element class name classname digester add set properties addsetproperties prefix deployer digester add set next addsetnext prefix deployer set cluster deployer setclusterdeployer org apache catalina cluster deployer clusterdeployer digester add object create addobjectcreate prefix listener element class name classname digester add set properties addsetproperties prefix listener digester add set next addsetnext prefix listener add lifecycle listener addlifecyclelistener org apache catalina lifecycle listener lifecyclelistener digester add object create addobjectcreate prefix cluster listener clusterlistener element class name classname digester add set properties addsetproperties prefix cluster listener clusterlistener digester add set next addsetnext prefix cluster listener clusterlistener add cluster listener addclusterlistener org apache catalina cluster listener clusterlistener cluster configuration