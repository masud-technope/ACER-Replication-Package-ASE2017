copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal core cheatsheet simple text org eclipse pde internal core text document node factory documentnodefactory org eclipse pde internal core text i document element node idocumentelementnode org eclipse pde internal core text i document text node idocumenttextnode org eclipse pde internal core text plugin document generic node documentgenericnode org eclipse pde internal core cheatsheet simple i simple s isimplecs org eclipse pde internal core cheatsheet simple isimplecsaction org eclipse pde internal core cheatsheet simple isimplecscommand org eclipse pde internal core cheatsheet simple i simple conditional sub item isimplecsconditionalsubitem org eclipse pde internal core cheatsheet simple isimplecsconstants org eclipse pde internal core cheatsheet simple isimplecsdescription org eclipse pde internal core cheatsheet simple isimplecsintro org eclipse pde internal core cheatsheet simple isimplecsitem org eclipse pde internal core cheatsheet simple i simple model factory isimplecsmodelfactory org eclipse pde internal core cheatsheet simple isimplecsobject org eclipse pde internal core cheatsheet simple i simple on completion isimplecsoncompletion org eclipse pde internal core cheatsheet simple i simple perform when isimplecsperformwhen org eclipse pde internal core cheatsheet simple i simple repeated sub item isimplecsrepeatedsubitem org eclipse pde internal core cheatsheet simple i simple sub item isimplecssubitem simplecsdocumentfactory document node factory documentnodefactory i simple model factory isimplecsmodelfactory simplecsmodel f model fmodel param model simplecsdocumentfactory simplecsmodel model f model fmodel model javadoc org eclipse pde internal core text document node factory documentnodefactory create document text node createdocumenttextnode java lang string org eclipse pde internal core text i document element node idocumentelementnode i document text node idocumenttextnode create document text node createdocumenttextnode string content i document element node idocumentelementnode parent i document text node idocumenttextnode text node textnode simple document text node simplecsdocumenttextnode text node textnode set enclosing element setenclosingelement parent parent add text node addtextnode text node textnode text node textnode set text settext content text node textnode javadoc org eclipse pde internal core text i document node factory idocumentnodefactory create document node createdocumentnode java lang string org eclipse pde internal core text i document element node idocumentelementnode i document element node idocumentelementnode create document node createdocumentnode string i document element node idocumentelementnode parent parent is simple s issimplecs root i document element node idocumentelementnode create simple s createsimplecs parent simplecs is intro isintro intro i document element node idocumentelementnode createsimplecsintro simplecs parent is item isitem item i document element node idocumentelementnode createsimplecsitem simplecs parent parent simplecsintro is description isdescription description i document element node idocumentelementnode createsimplecsdescription simplecsintro parent parent simplecsitem is description isdescription description i document element node idocumentelementnode createsimplecsdescription simplecsitem parent is action isaction action i document element node idocumentelementnode createsimplecsaction simplecsitem parent is command iscommand command i document element node idocumentelementnode createsimplecscommand simplecsitem parent is perform when isperformwhen perform i document element node idocumentelementnode create simple perform when createsimplecsperformwhen simplecsitem parent is sub item issubitem sub item subitem i document element node idocumentelementnode create simple sub item createsimplecssubitem simplecsitem parent is conditional sub item isconditionalsubitem conditional sub item subitem i document element node idocumentelementnode create simple conditional sub item createsimplecsconditionalsubitem simplecsitem parent is repeated sub item isrepeatedsubitem repeated sub item subitem i document element node idocumentelementnode create simple repeated sub item createsimplecsrepeatedsubitem simplecsitem parent is on completion isoncompletion completion i document element node idocumentelementnode create simple on completion createsimplecsoncompletion simplecsitem parent parent simplecssubitem is perform when isperformwhen perform i document element node idocumentelementnode create simple perform when createsimplecsperformwhen simplecssubitem parent is action isaction action i document element node idocumentelementnode createsimplecsaction simplecssubitem parent is command iscommand command i document element node idocumentelementnode createsimplecscommand simplecssubitem parent parent simple conditional sub item simplecsconditionalsubitem is sub item issubitem sub item subitem i document element node idocumentelementnode create simple sub item createsimplecssubitem simple conditional sub item simplecsconditionalsubitem parent parent simple repeated sub item simplecsrepeatedsubitem is sub item issubitem sub item subitem i document element node idocumentelementnode create simple sub item createsimplecssubitem simple repeated sub item simplecsrepeatedsubitem parent parent simplecsperformwhen is action isaction action i document element node idocumentelementnode createsimplecsaction simplecsperformwhen parent is command iscommand command i document element node idocumentelementnode createsimplecscommand simplecsperformwhen parent parent simplecsdescription is br isbr create br createbr parent simplecsoncompletion is br isbr create br createbr on completion oncompletion children create document node createdocumentnode parent param param element name elementname iscselement string string element name elementname equals element name elementname param is simple s issimplecs string iscselement isimplecsconstants element cheatsheet param is intro isintro string iscselement isimplecsconstants element intro param is description isdescription string iscselement isimplecsconstants element description param is item isitem string iscselement isimplecsconstants element item param is action isaction string iscselement isimplecsconstants element action param is command iscommand string iscselement isimplecsconstants element command param is perform when isperformwhen string iscselement isimplecsconstants element per form perform param is sub item issubitem string iscselement isimplecsconstants element subitem param is repeated sub item isrepeatedsubitem string iscselement isimplecsconstants element repeated subitem param is conditional sub item isconditionalsubitem string iscselement isimplecsconstants element conditional subitem param is on completion isoncompletion string iscselement isimplecsconstants element oncompletion param is br isbr string iscselement isimplecsconstants element javadoc org eclipse pde internal core icheatsheet simple i simple model factory isimplecsmodelfactory create simple s createsimplecs i simple s isimplecs create simple s createsimplecs simplecs f model fmodel javadoc org eclipse pde internal core icheatsheet simple i simple model factory isimplecsmodelfactory createsimplecsaction org eclipse pde internal core icheatsheet simple isimplecsobject isimplecsaction createsimplecsaction isimplecsobject parent simplecsaction f model fmodel javadoc org eclipse pde internal core icheatsheet simple i simple model factory isimplecsmodelfactory createsimplecscommand org eclipse pde internal core icheatsheet simple isimplecsobject isimplecscommand createsimplecscommand isimplecsobject parent simplecscommand f model fmodel javadoc org eclipse pde internal core icheatsheet simple i simple model factory isimplecsmodelfactory create simple conditional sub item createsimplecsconditionalsubitem org eclipse pde internal core icheatsheet simple isimplecsobject i simple conditional sub item isimplecsconditionalsubitem create simple conditional sub item createsimplecsconditionalsubitem isimplecsobject parent simple conditional sub item simplecsconditionalsubitem f model fmodel javadoc org eclipse pde internal core icheatsheet simple i simple model factory isimplecsmodelfactory createsimplecsdescription org eclipse pde internal core icheatsheet simple isimplecsobject isimplecsdescription createsimplecsdescription isimplecsobject parent simplecsdescription f model fmodel javadoc org eclipse pde internal core icheatsheet simple i simple model factory isimplecsmodelfactory createsimplecsintro org eclipse pde internal core icheatsheet simple isimplecsobject isimplecsintro createsimplecsintro isimplecsobject parent simplecsintro f model fmodel javadoc org eclipse pde internal core icheatsheet simple i simple model factory isimplecsmodelfactory createsimplecsitem org eclipse pde internal core icheatsheet simple isimplecsobject isimplecsitem createsimplecsitem isimplecsobject parent simplecsitem f model fmodel javadoc org eclipse pde internal core icheatsheet simple i simple model factory isimplecsmodelfactory create simple on completion createsimplecsoncompletion org eclipse pde internal core icheatsheet simple isimplecsobject i simple on completion isimplecsoncompletion create simple on completion createsimplecsoncompletion isimplecsobject parent simplecsoncompletion f model fmodel javadoc org eclipse pde internal core icheatsheet simple i simple model factory isimplecsmodelfactory create simple perform when createsimplecsperformwhen org eclipse pde internal core icheatsheet simple isimplecsobject i simple perform when isimplecsperformwhen create simple perform when createsimplecsperformwhen isimplecsobject parent simplecsperformwhen f model fmodel javadoc org eclipse pde internal core icheatsheet simple i simple model factory isimplecsmodelfactory create simple repeated sub item createsimplecsrepeatedsubitem org eclipse pde internal core icheatsheet simple isimplecsobject i simple repeated sub item isimplecsrepeatedsubitem create simple repeated sub item createsimplecsrepeatedsubitem isimplecsobject parent simple repeated sub item simplecsrepeatedsubitem f model fmodel javadoc org eclipse pde internal core icheatsheet simple i simple model factory isimplecsmodelfactory create simple sub item createsimplecssubitem org eclipse pde internal core icheatsheet simple isimplecsobject i simple sub item isimplecssubitem create simple sub item createsimplecssubitem isimplecsobject parent simplecssubitem f model fmodel i document element node idocumentelementnode create br createbr document generic node documentgenericnode isimplecsconstants element serialversionuid is leaf node isleafnode