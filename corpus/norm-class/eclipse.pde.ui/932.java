copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal editor build java file java util array list arraylist java util hash map hashmap org eclipse core resources i file ifile org eclipse core runtime core exception coreexception org eclipse jface text i document idocument org eclipse pde core i base model ibasemodel org eclipse pde core i model changed event imodelchangedevent org eclipse pde internal core text abstract editing model abstracteditingmodel org eclipse pde internal core text i document key idocumentkey org eclipse pde internal core text build build model buildmodel org eclipse pde internal core util properties util propertiesutil org eclipse pde internal editor pde form editor pdeformeditor org eclipse pde internal editor context input context inputcontext org eclipse text edits org eclipse build input context buildinputcontext input context inputcontext nls string context build context hash map hashmap i document key idocumentkey text edit textedit f operation table foperationtable hash map hashmap build input context buildinputcontext pde form editor pdeformeditor editor i editor input ieditorinput input primary editor input primary create override string get default charset getdefaultcharset nls iso override i base model ibasemodel create model createmodel i editor input ieditorinput input core exception coreexception build model buildmodel model input i storage editor input istorageeditorinput is reconciling isreconciling input i file editor input ifileeditorinput i document idocument document get document provider getdocumentprovider get document getdocument input model build model buildmodel document is reconciling isreconciling input i file editor input ifileeditorinput i file ifile file i file editor input ifileeditorinput input get file getfile model set underlying resource setunderlyingresource file model set charset setcharset file get charset getcharset model set charset setcharset get default charset getdefaultcharset model load input i uri editor input iurieditorinput file file file i uri editor input iurieditorinput input geturi is reconciling isreconciling input i file editor input ifileeditorinput i document idocument document get document provider getdocumentprovider get document getdocument input model build model buildmodel document is reconciling isreconciling model set install location setinstalllocation file get parent getparent model set charset setcharset get default charset getdefaultcharset model override string get id getid context override add text edit operation addtexteditoperation array list arraylist text edit textedit ops i model changed event imodelchangedevent event object objects event get changed objects getchangedobjects objects length object object objects i document key idocumentkey key i document key idocumentkey object text edit textedit f operation table foperationtable key f operation table foperationtable remove key ops remove event get change type getchangetype i model changed event imodelchangedevent remove delete key deletekey key ops i model changed event imodelchangedevent insert insert key insertkey key ops i model changed event imodelchangedevent change modify key modifykey key ops insert key insertkey i document key idocumentkey key array list arraylist text edit textedit ops i document idocument doc get document provider getdocumentprovider get document getdocument get input getinput insert edit insertedit insert edit insertedit properties util propertiesutil get insert offset getinsertoffset doc key write f operation table foperationtable key ops add delete key deletekey i document key idocumentkey key array list arraylist text edit textedit ops key get offset getoffset text edit textedit delete edit deleteedit key get offset getoffset key get length getlength f operation table foperationtable key ops add modify key modifykey i document key idocumentkey key array list arraylist text edit textedit ops key get offset getoffset insert key insertkey key ops text edit textedit replace edit replaceedit key get offset getoffset key get length getlength key write f operation table foperationtable key ops add override do revert dorevert f edit operations feditoperations clear f operation table foperationtable clear abstract editing model abstracteditingmodel model abstract editing model abstracteditingmodel get model getmodel model reconciled model get document getdocument override string get partition name getpartitionname nls build partition