copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal compare java buffered reader bufferedreader java io exception ioexception java input stream inputstream java input stream reader inputstreamreader java unsupported encoding exception unsupportedencodingexception java util array list arraylist java util list java util missing resource exception missingresourceexception java util resource bundle resourcebundle org eclipse swt graphics image org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core runtime i path ipath org eclipse core resources resources plugin resourcesplugin org eclipse jface action i action iaction org eclipse jface resource image descriptor imagedescriptor org eclipse jface text i document idocument org eclipse jface text i document partitioner idocumentpartitioner org eclipse i editor input ieditorinput org eclipse compare compare configuration compareconfiguration org eclipse compare compare editor input compareeditorinput org eclipse compare i encoded stream content accessor iencodedstreamcontentaccessor org eclipse compare i stream content accessor istreamcontentaccessor org eclipse jdt core i java element ijavaelement org eclipse jdt core i member imember org eclipse jdt core i type itype org eclipse jdt java element labels javaelementlabels org eclipse jdt text i java partitions ijavapartitions org eclipse jdt text java text tools javatexttools org eclipse jdt internal java plugin javaplugin org eclipse jdt internal java plugin images javapluginimages org eclipse jdt internal properties file editor propertiesfileeditor properties file document setup participant propertiesfiledocumentsetupparticipant java compare utilities javacompareutilities package declaration packagedeclaration import declaration importdeclaration container field method initializer compilation unit compilationunit type string get string getstring resource bundle resourcebundle bundle string key string dflt value dfltvalue bundle bundle get string getstring key missing resource exception missingresourceexception dflt value dfltvalue string get string getstring resource bundle resourcebundle bundle string key get string getstring bundle key key get integer getinteger resource bundle resourcebundle bundle string key dflt value dfltvalue bundle string bundle get string getstring key integer parse int parseint number format exception numberformatexception missing resource exception missingresourceexception dflt value dfltvalue image descriptor imagedescriptor get image descriptor getimagedescriptor type type i java element ijavaelement initializer i java element ijavaelement method nls get image descriptor getimagedescriptor obj compare method png i java element ijavaelement field nls get image descriptor getimagedescriptor obj compare field png i java element ijavaelement declaration java plugin images javapluginimages desc objs packdecl i java element ijavaelement declaration java plugin images javapluginimages desc objs impdecl i java element ijavaelement container java plugin images javapluginimages desc objs impcont i java element ijavaelement compilation unit java plugin images javapluginimages desc objs cunit image descriptor imagedescriptor get missing image descriptor getmissingimagedescriptor image descriptor imagedescriptor get type image descriptor gettypeimagedescriptor is class isclass is class isclass java plugin images javapluginimages desc objs java plugin images javapluginimages desc objs image descriptor imagedescriptor get enum image descriptor getenumimagedescriptor java plugin images javapluginimages desc objs enum image descriptor imagedescriptor get annotation image descriptor getannotationimagedescriptor java plugin images javapluginimages desc objs annotation image descriptor imagedescriptor get image descriptor getimagedescriptor i member imember element element get element type getelementtype i java element ijavaelement type i type itype type i type itype element get type image descriptor gettypeimagedescriptor type is class isclass core exception coreexception java plugin javaplugin log java plugin images javapluginimages desc objs ghost get image descriptor getimagedescriptor returns java element conventions java node javanode element string get java element d getjavaelementid i java element ijavaelement i member imember i member imember is binary isbinary string buffer stringbuffer string buffer stringbuffer get element type getelementtype i java element ijavaelement compilation unit append compilation unit compilationunit i java element ijavaelement type append type append get element name getelementname i java element ijavaelement field append field append get element name getelementname i java element ijavaelement method append method append java element labels javaelementlabels get element label getelementlabel java element labels javaelementlabels parameter types i java element ijavaelement initializer string get handle identifier gethandleidentifier pos last index of lastindexof initializer pos append substring pos i java element ijavaelement declaration append package declaration packagedeclaration i java element ijavaelement container append container i java element ijavaelement declaration append import declaration importdeclaration append get element name getelementname to string tostring returns identifies type d typed type encoded single character string string buildid type string string buffer stringbuffer string buffer stringbuffer type java node javanode append compilation unit compilationunit java node javanode java node javanode java node javanode enum java node javanode annotation append type append java node javanode field append field append java node javanode constructor java node javanode method append method append java node javanode init append initializer append java node javanode append package declaration packagedeclaration java node javanode append import declaration importdeclaration append java node javanode container append container is true istrue to string tostring image descriptor imagedescriptor get image descriptor getimagedescriptor string relative path relativepath i path ipath path java plugin images javapluginimages icons path append relative path relativepath java plugin images javapluginimages create image descriptor createimagedescriptor java plugin javaplugin get default getdefault get bundle getbundle path get boolean getboolean compare configuration compareconfiguration string key dflt object get property getproperty key boolean value booleanvalue dflt image get image getimage i member imember member image descriptor imagedescriptor get image descriptor getimagedescriptor member create image createimage java text tools javatexttools get java text tools getjavatexttools java plugin javaplugin plugin java plugin javaplugin get default getdefault plugin plugin get java text tools getjavatexttools i document partitioner idocumentpartitioner create java partitioner createjavapartitioner java text tools javatexttools tools get java text tools getjavatexttools tools tools create document partitioner createdocumentpartitioner setup document setupdocument i document idocument document java text tools javatexttools tools get java text tools getjavatexttools tools tools setup java document partitioner setupjavadocumentpartitioner document i java partitions ijavapartitions java partitioning setup properties file document setuppropertiesfiledocument i document idocument document properties file document setup participant propertiesfiledocumentsetupparticipant setup document setupdocument document reads contents input stream string function assumes input stream platform encoding code resources plugin resourcesplugin get encoding getencoding code returns error occurred string read string readstring input stream inputstream string encoding buffered reader bufferedreader reader string buffer stringbuffer buffer string buffer stringbuffer read reader buffered reader bufferedreader input stream reader inputstreamreader encoding read reader read buffer append read buffer to string tostring io exception ioexception reader reader close io exception ioexception string read string readstring i stream content accessor istreamcontentaccessor core exception coreexception input stream inputstream get contents getcontents string encoding i encoded stream content accessor iencodedstreamcontentaccessor encoding i encoded stream content accessor iencodedstreamcontentaccessor get charset getcharset exception encoding encoding resources plugin resourcesplugin get encoding getencoding read string readstring encoding returns contents string array bytes platform encoding get bytes getbytes string string encoding get bytes getbytes encoding unsupported encoding exception unsupportedencodingexception get bytes getbytes breaks contents input stream array strings function assumes input stream platform encoding code resources plugin resourcesplugin get encoding getencoding code returns error occurred string read lines readlines input stream inputstream string encoding buffered reader bufferedreader reader reader buffered reader bufferedreader input stream reader inputstreamreader encoding string buffer stringbuffer string buffer stringbuffer list string list array list arraylist reader read append single reader read append list add to string tostring string buffer stringbuffer single list add to string tostring string buffer stringbuffer length list add to string tostring list to array toarray string list size io exception ioexception reader reader close io exception ioexception initialize action resource bundle resourcebundle init action initaction i action iaction resource bundle resourcebundle bundle string prefix nls string label key labelkey label nls string tooltip key tooltipkey tooltip nls string image key imagekey image nls string description key descriptionkey description prefix prefix length label key labelkey prefix label key labelkey tooltip key tooltipkey prefix tooltip key tooltipkey image key imagekey prefix image key imagekey description key descriptionkey prefix description key descriptionkey set text settext get string getstring bundle label key labelkey label key labelkey set tool tip text settooltiptext get string getstring bundle tooltip key tooltipkey set description setdescription get string getstring bundle description key descriptionkey string rel path relpath get string getstring bundle image key imagekey rel path relpath rel path relpath trim length string d path dpath string e path epath nls rel path relpath index of indexof string path rel path relpath substring d path dpath path e path epath path d path dpath nls dlcl nls rel path relpath e path epath nls elcl nls rel path relpath disabled image gdde image descriptor imagedescriptor java compare utilities javacompareutilities get image descriptor getimagedescriptor d path dpath set disabled image descriptor setdisabledimagedescriptor java compare utilities javacompareutilities get image descriptor getimagedescriptor e path epath set image descriptor setimagedescriptor set hover image descriptor sethoverimagedescriptor init toggle action inittoggleaction i action iaction resource bundle resourcebundle bundle string prefix checked string tooltip checked nls tooltip get string getstring bundle prefix tooltip checked nls tooltip get string getstring bundle prefix tooltip unchecked tooltip nls tooltip get string getstring bundle prefix tooltip tooltip set tool tip text settooltiptext tooltip string description checked nls description get string getstring bundle prefix description checked nls description get string getstring bundle prefix description unchecked description nls description get string getstring bundle prefix description description set description setdescription description needed avoid unnecessary loading compare plug is compare editor input iscompareeditorinput i editor input ieditorinput input input compare editor input compareeditorinput