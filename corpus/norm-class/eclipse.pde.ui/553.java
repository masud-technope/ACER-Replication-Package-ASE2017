copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation rafael oliveira n�brega rafael oliveira gmail bug org eclipse pde internal core represents dependency component target services component configuration satisfied references satisfied reference specifies target services optional target filter ids component idscomponent ids object idsobject ids reference idsreference ids object idsobject sets reference local component locate bound service reference locate service locateservice methods component context componentcontext param reference set reference name setreferencename string returns reference string reference string get reference name getreferencename sets fully qualified component access service service component type compatible component service object service registered considered target services param interface name interfacename fully qualified access service set reference interface setreferenceinterface string interface name interfacename returns fully qualified component access service string fully qualified access service string get reference interface getreferenceinterface sets reference optional component implementation support single bound service multiple bound services cardinality reference choices optional unary mandatory unary optional multiple mandatory multiple param cardinality cardinality set reference cardinality setreferencecardinality string cardinality returns reference optional component implementation support single bound service multiple bound services string choices optional unary mandatory unary optional multiple mandatory multiple string get reference cardinality getreferencecardinality sets assumption component dynamicity policy reference choices policy simple policy component instance sees dynamics dynamic policy option complex component implementation properly handle bound services param policy policy dynamic set reference policy setreferencepolicy string policy policy component string policy string get reference policy getreferencepolicy sets optional osg i osgi framework filter expression const rains constrains target services filter limiting matched services service registered reference attribute target property param target attribute target set reference target setreferencetarget string target returns target filter expression const rains constrains target services string attribute target string get reference target getreferencetarget sets method component implementation notify service bound component configuration references method called activate method dynamic references method called component configuration active param bind method notify service bound set reference bind setreferencebind string bind returns method component implementation notify service bound component configuration string method string get reference bind getreferencebind sets method component implementation notify component configuration service unbound references method called deactivate method dynamic references method called component configuration active param unbind method notify service unbound set reference unbind setreferenceunbind string unbind returns method component implementation notify component configuration service unbound string method string get reference unbind getreferenceunbind