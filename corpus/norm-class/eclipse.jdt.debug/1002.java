copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation ivan pop ov popov bug jdi connectors null pointer exception nullpointerexception sep arately separately eclipse org eclipse jdi internal connect java io exception ioexception java util list org eclipse jdi bootstrap org eclipse jdi internal virtual machine impl virtualmachineimpl org eclipse jdi internal virtual machine manager impl virtualmachinemanagerimpl sun jdi virtual machine virtualmachine sun jdi connect connector sun jdi connect transport sun jdi connect spi connection interfaces declared jdi specification sun jdi connector impl connectorimpl connector virtual machine manager created connector virtual machine manager impl virtualmachinemanagerimpl f virtual machine manager fvirtualmachinemanager transport communication transport f transport ftransport virtual machine connected virtual machine impl virtualmachineimpl f virtual machine fvirtualmachine creates connector connector impl connectorimpl virtual machine manager impl virtualmachinemanagerimpl virtual machine manager virtualmachinemanager f virtual machine manager fvirtualmachinemanager virtual machine manager virtualmachinemanager returns virtual machine manager virtual machine manager impl virtualmachinemanagerimpl virtual machine manager virtualmachinemanager f virtual machine manager fvirtualmachinemanager returns virtual machine manager virtual machine impl virtualmachineimpl virtual machine virtualmachine f virtual machine fvirtualmachine returns human readable description connector purpose override string description returns identifier connector override string assigns transport set transport settransport transport transport f transport ftransport transport returns transport mechanism connector establish connections target override transport transport f transport ftransport closes connection virtual machine close virtual machine manager virtualmachinemanager remove connected m removeconnectedvm f virtual machine fvirtualmachine returns connected virtual machine virtual machine virtualmachine established connection establishedconnection connection connection io exception ioexception f virtual machine fvirtualmachine virtual machine impl virtualmachineimpl bootstrap virtual machine manager virtualmachinemanager create virtual machine createvirtualmachine connection f virtual machine fvirtualmachine argument arguments establish connection argument impl argumentimpl sun jdi connect connector argument serial version serialversionuid string f name fname string f description fdescription string f label flabel f must specify fmustspecify argument impl argumentimpl string string description string label must specify mustspecify f name fname f label flabel label f description fdescription description f must specify fmustspecify must specify mustspecify javadoc sun jdi connect connector argument override string f name fname javadoc sun jdi connect connector argument description override string description f description fdescription javadoc sun jdi connect connector argument label override string label f label flabel javadoc sun jdi connect connector argument must specify mustspecify override must specify mustspecify f must specify fmustspecify javadoc sun jdi connect connector argument override string javadoc sun jdi connect connector argument set value setvalue java lang string override set value setvalue string javadoc sun jdi connect connector argument is valid isvalid java lang string override is valid isvalid string override string to string tostring string argument impl stringargumentimpl argument impl argumentimpl string argument stringargument serialversionuid string f value fvalue string argument impl stringargumentimpl string string description string label must specify mustspecify description label must specify mustspecify override string f value fvalue override set value setvalue string f value fvalue override is valid isvalid string override string to string tostring f value fvalue integer argument impl integerargumentimpl argument impl argumentimpl integer argument integerargument serialversionuid integer f value fvalue f min fmin f max fmax integer argument impl integerargumentimpl string string description string label must specify mustspecify min max description label must specify mustspecify f min fmin min f max fmax max override string f value fvalue f value fvalue to string tostring override set value setvalue string f value fvalue integer override is valid isvalid string integer val val integer number format exception numberformatexception is valid isvalid val int value intvalue override string to string tostring javadoc sun jdi connect connector integer argument integerargument int value intvalue override int value intvalue f value fvalue int value intvalue javadoc sun jdi connect connector integer argument integerargument set value setvalue override set value setvalue f value fvalue integer javadoc sun jdi connect connector integer argument integerargument min override min f min fmin javadoc sun jdi connect connector integer argument integerargument max override max f max fmax javadoc sun jdi connect connector integer argument integerargument is valid isvalid override is valid isvalid f min fmin f max fmax javadoc sun jdi connect connector integer argument integerargument string value of stringvalueof override string string value of stringvalueof integer to string tostring boolean argument impl booleanargumentimpl argument impl argumentimpl boolean argument booleanargument serialversionuid f value fvalue boolean argument impl booleanargumentimpl string string description string label must specify mustspecify description label must specify mustspecify override string f value fvalue f value fvalue to string tostring override set value setvalue string f value fvalue value of valueof override is valid isvalid string override string to string tostring javadoc sun jdi connect connector boolean argument booleanargument boolean value booleanvalue override boolean value booleanvalue f value fvalue boolean value booleanvalue javadoc sun jdi connect connector boolean argument booleanargument set value setvalue override set value setvalue f value fvalue value of valueof javadoc sun jdi connect connector boolean argument booleanargument string value of stringvalueof override string string value of stringvalueof value of valueof to string tostring selected argument impl selectedargumentimpl string argument impl stringargumentimpl selected argument selectedargument serialversionuid list string f choices fchoices selected argument impl selectedargumentimpl string string description string label must specify mustspecify list string choices description label must specify mustspecify f choices fchoices choices javadoc sun jdi connect connector selected argument selectedargument choices override list string choices f choices fchoices override is valid isvalid string f choices fchoices