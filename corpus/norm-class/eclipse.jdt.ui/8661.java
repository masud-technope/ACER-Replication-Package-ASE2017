copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal text java util hash map hashmap java util list java util map org eclipse swt swt org eclipse swt graphics color org eclipse swt graphics rgb org eclipse swt widgets display org eclipse jface preference i preference store ipreferencestore org eclipse jface preference preference converter preferenceconverter org eclipse jface resource string converter stringconverter org eclipse jface util property change event propertychangeevent org eclipse jface text text attribute textattribute org eclipse jface text rules buffered rule based scanner bufferedrulebasedscanner org eclipse jface text rules i rule irule org eclipse jface text rules i token itoken org eclipse jface text rules token org eclipse jdt preference constants preferenceconstants org eclipse jdt text i color manager icolormanager org eclipse jdt text i color manager extension icolormanagerextension initialized color manager preference store subclasses responsible providing list preference based tokens generated tokens define rules controlling scanner scanner stores color defined color preference key color manager key preference color key link preference constants preferenceconstants editor bold suffix retrieve token rendered bold preference color key link preference constants preferenceconstants editor italic suffix retrieve token rendered italic preference color key link preference constants preferenceconstants editor strikethrough suffix retrieve token rendered str ikethrough strikethrough preference color key link preference constants preferenceconstants editor underline suffix retrieve token rendered under line underline abstract java scanner abstractjavascanner buffered rule based scanner bufferedrulebasedscanner i color manager icolormanager f color manager fcolormanager i preference store ipreferencestore f preference store fpreferencestore map string token f token map ftokenmap hash map hashmap string f property names color fpropertynamescolor preference preferences code code iff token rendered bold string f property names bold fpropertynamesbold preference preferences code code iff token rendered italic string f property names italic fpropertynamesitalic preference preferences code code iff token rendered str ikethrough strikethrough string f property names strikethrough fpropertynamesstrikethrough preference preferences code code iff token rendered under line underline string f property names underline fpropertynamesunderline f needs lazy color loading fneedslazycolorloading returns array preference define tokens rules scanner preference key access color preference store color manager preference key link preference constants preferenceconstants editor bold suffix retrieve token rendered bold preference key link preference constants preferenceconstants editor italic suffix retrieve token rendered italic preference key link preference constants preferenceconstants editor underline suffix retrieve token rendered underline d underlined preference key link preference constants preferenceconstants editor strikethrough suffix retrieve token rendered str icken stricken string get token properties gettokenproperties creates list rules controlling scanner list i rule irule create rules createrules creates java scanner abstract java scanner abstractjavascanner i color manager icolormanager manager i preference store ipreferencestore store f color manager fcolormanager manager f preference store fpreferencestore store called constructor called initialize f property names color fpropertynamescolor get token properties gettokenproperties length f property names color fpropertynamescolor length f property names bold fpropertynamesbold string length f property names italic fpropertynamesitalic string length f property names strikethrough fpropertynamesstrikethrough string length f property names underline fpropertynamesunderline string length length f property names bold fpropertynamesbold get bold key getboldkey f property names color fpropertynamescolor f property names italic fpropertynamesitalic get italic key getitalickey f property names color fpropertynamescolor f property names strikethrough fpropertynamesstrikethrough get strikethrough key getstrikethroughkey f property names color fpropertynamescolor f property names underline fpropertynamesunderline get underline key getunderlinekey f property names color fpropertynamescolor f needs lazy color loading fneedslazycolorloading display get current getcurrent length f needs lazy color loading fneedslazycolorloading add token with proxy attribute addtokenwithproxyattribute f property names color fpropertynamescolor f property names bold fpropertynamesbold f property names italic fpropertynamesitalic f property names strikethrough fpropertynamesstrikethrough f property names underline fpropertynamesunderline add token addtoken f property names color fpropertynamescolor f property names bold fpropertynamesbold f property names italic fpropertynamesitalic f property names strikethrough fpropertynamesstrikethrough f property names underline fpropertynamesunderline initialize rules initializerules string get bold key getboldkey string color key colorkey color key colorkey preference constants preferenceconstants editor bold suffix string get italic key getitalickey string color key colorkey color key colorkey preference constants preferenceconstants editor italic suffix string get strikethrough key getstrikethroughkey string color key colorkey color key colorkey preference constants preferenceconstants editor strikethrough suffix string get underline key getunderlinekey string color key colorkey color key colorkey preference constants preferenceconstants editor underline suffix override i token itoken next token nexttoken f needs lazy color loading fneedslazycolorloading resolve proxy attributes resolveproxyattributes next token nexttoken resolve proxy attributes resolveproxyattributes f needs lazy color loading fneedslazycolorloading display get current getcurrent f property names color fpropertynamescolor length add token addtoken f property names color fpropertynamescolor f property names bold fpropertynamesbold f property names italic fpropertynamesitalic f property names strikethrough fpropertynamesstrikethrough f property names underline fpropertynamesunderline f needs lazy color loading fneedslazycolorloading add token with proxy attribute addtokenwithproxyattribute string color key colorkey string bold key boldkey string italic key italickey string str ikethrough key strikethroughkey string under line key underlinekey f token map ftokenmap color key colorkey token create text attribute createtextattribute bold key boldkey italic key italickey str ikethrough key strikethroughkey under line key underlinekey add token addtoken string color key colorkey string bold key boldkey string italic key italickey string str ikethrough key strikethroughkey string under line key underlinekey f color manager fcolormanager color key colorkey f color manager fcolormanager get color getcolor color key colorkey rgb rgb preference converter preferenceconverter get color getcolor f preference store fpreferencestore color key colorkey f color manager fcolormanager i color manager extension icolormanagerextension i color manager extension icolormanagerextension ext i color manager extension icolormanagerextension f color manager fcolormanager ext unbind color unbindcolor color key colorkey ext bind color bindcolor color key colorkey rgb f needs lazy color loading fneedslazycolorloading f token map ftokenmap color key colorkey token create text attribute createtextattribute color key colorkey bold key boldkey italic key italickey str ikethrough key strikethroughkey under line key underlinekey token token f token map ftokenmap color key colorkey token token set data setdata create text attribute createtextattribute color key colorkey bold key boldkey italic key italickey str ikethrough key strikethroughkey under line key underlinekey create text attribute based color bold italic str ikethrough strikethrough under line underline preference param color key colorkey color preference key param bold key boldkey bold preference key param italic key italickey italic preference key param str ikethrough key strikethroughkey str ikethrough strikethrough preference key param under line key underlinekey italic preference key created text attribute text attribute textattribute create text attribute createtextattribute string color key colorkey string bold key boldkey string italic key italickey string str ikethrough key strikethroughkey string under line key underlinekey color color color key colorkey color f color manager fcolormanager get color getcolor color key colorkey style f preference store fpreferencestore get boolean getboolean bold key boldkey swt bold swt normal f preference store fpreferencestore get boolean getboolean italic key italickey style swt italic f preference store fpreferencestore get boolean getboolean str ikethrough key strikethroughkey style text attribute textattribute strikethrough f preference store fpreferencestore get boolean getboolean under line key underlinekey style text attribute textattribute underline text attribute textattribute color style token get token gettoken string key f needs lazy color loading fneedslazycolorloading resolve proxy attributes resolveproxyattributes f token map ftokenmap key initialize rules initializerules list i rule irule rules create rules createrules rules i rule irule result i rule irule rules size rules to array toarray result set rules setrules result index of indexof string property property length f property names color fpropertynamescolor length length property equals f property names color fpropertynamescolor property equals f property names bold fpropertynamesbold property equals f property names italic fpropertynamesitalic property equals f property names strikethrough fpropertynamesstrikethrough property equals f property names underline fpropertynamesunderline affects behavior affectsbehavior property change event propertychangeevent event index of indexof event get property getproperty adapt to preference change adapttopreferencechange property change event propertychangeevent event string event get property getproperty index of indexof token token get token gettoken f property names color fpropertynamescolor f property names color fpropertynamescolor equals adapt to color change adapttocolorchange token event f property names bold fpropertynamesbold equals adapt to style change adapttostylechange token event swt bold f property names italic fpropertynamesitalic equals adapt to style change adapttostylechange token event swt italic f property names strikethrough fpropertynamesstrikethrough equals adapt to style change adapttostylechange token event text attribute textattribute strikethrough f property names underline fpropertynamesunderline equals adapt to style change adapttostylechange token event text attribute textattribute underline adapt to color change adapttocolorchange token token property change event propertychangeevent event rgb rgb object event get new value getnewvalue rgb rgb rgb string rgb string converter stringconverter asrgb string rgb string property event get property getproperty color color f color manager fcolormanager get color getcolor property color rgb equals color getrgb f color manager fcolormanager i color manager extension icolormanagerextension i color manager extension icolormanagerextension ext i color manager extension icolormanagerextension f color manager fcolormanager ext unbind color unbindcolor property ext bind color bindcolor property rgb color f color manager fcolormanager get color getcolor property object data token get data getdata data text attribute textattribute text attribute textattribute old attr oldattr text attribute textattribute data token set data setdata text attribute textattribute color old attr oldattr get background getbackground old attr oldattr get style getstyle adapt to style change adapttostylechange token token property change event propertychangeevent event style attribute styleattribute event value eventvalue object event get new value getnewvalue event value eventvalue boolean value booleanvalue i preference store ipreferencestore equals event value eventvalue object data token get data getdata data text attribute textattribute text attribute textattribute old attr oldattr text attribute textattribute data active value activevalue old attr oldattr get style getstyle style attribute styleattribute style attribute styleattribute active value activevalue event value eventvalue token set data setdata text attribute textattribute old attr oldattr get foreground getforeground old attr oldattr get background getbackground event value eventvalue old attr oldattr get style getstyle style attribute styleattribute old attr oldattr get style getstyle style attribute styleattribute returns preference store preference store i preference store ipreferencestore get preference store getpreferencestore f preference store fpreferencestore