copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde internal tests cheatsheet org eclipse pde internal core cheatsheet simple i simple s isimplecs org eclipse pde internal core cheatsheet simple isimplecsaction org eclipse pde internal core cheatsheet simple isimplecscommand org eclipse pde internal core cheatsheet simple i simple conditional sub item isimplecsconditionalsubitem org eclipse pde internal core cheatsheet simple isimplecsconstants org eclipse pde internal core cheatsheet simple isimplecsdescription org eclipse pde internal core cheatsheet simple isimplecsitem org eclipse pde internal core cheatsheet simple i simple on completion isimplecsoncompletion org eclipse pde internal core cheatsheet simple i simple perform when isimplecsperformwhen org eclipse pde internal core cheatsheet simple i simple repeated sub item isimplecsrepeatedsubitem org eclipse pde internal core cheatsheet simple i simple run container object isimplecsruncontainerobject org eclipse pde internal core cheatsheet simple i simple sub item isimplecssubitem org eclipse pde internal core cheatsheet simple i simple sub item object isimplecssubitemobject helper methods create validate cheatsheet model elements sets factory methods generate valid cheat sheat cheatsheat xml tags build cheatsheet model api generate data validated validate methods cheat sheet model test case cheatsheetmodeltestcase abstract cheat sheet model test case abstractcheatsheetmodeltestcase isimplecsaction create action createaction isimplecsaction action f model fmodel get factory getfactory createsimplecsaction action set clazz setclazz org eclipse clazz action set plugin id setpluginid org eclipse pde plugin xyz action set param setparam param action set param setparam action i simple perform when isimplecsperformwhen create perform when createperformwhen i simple perform when isimplecsperformwhen perform when performwhen f model fmodel get factory getfactory create simple perform when createsimplecsperformwhen perform when performwhen set condition setcondition condition perform when performwhen isimplecscommand create command createcommand isimplecscommand action f model fmodel get factory getfactory createsimplecscommand action set required setrequired action set serialization setserialization org eclipse command action isimplecsitem createcomplexcsitem isimplecsitem item f model fmodel get factory getfactory createsimplecsitem item set skip setskip item set title settitle title item set dialog setdialog isimplecsdescription description f model fmodel get factory getfactory createsimplecsdescription item description set content setcontent description item set description setdescription description i simple on completion isimplecsoncompletion on completion oncompletion f model fmodel get factory getfactory create simple on completion createsimplecsoncompletion item on completion oncompletion set content setcontent completion contents item set on completion setoncompletion on completion oncompletion item i simple sub item object isimplecssubitemobject create conditional sub item createconditionalsubitem i simple conditional sub item isimplecsconditionalsubitem subitem f model fmodel get factory getfactory create simple conditional sub item createsimplecsconditionalsubitem subitem set condition setcondition subitem string buffer stringbuffer createsimplecsitem i simple sub item object isimplecssubitemobject subitems isimplecsitem item f model fmodel get factory getfactory createsimplecsitem item set title settitle title subitems subitems length item add sub item addsubitem subitems string buffer stringbuffer item to string tostring i simple sub item isimplecssubitem create sub item createsubitem i simple sub item isimplecssubitem subitem f model fmodel get factory getfactory create simple sub item createsimplecssubitem subitem set label setlabel label subitem set skip setskip subitem set when setwhen subitem i simple repeated sub item isimplecsrepeatedsubitem create repeated sub item createrepeatedsubitem i simple repeated sub item isimplecsrepeatedsubitem subitem f model fmodel get factory getfactory create simple repeated sub item createsimplecsrepeatedsubitem subitem set values setvalues repeat subitem string buffer stringbuffer createsimplecsitem string subitems string new line newline string buffer stringbuffer buffer string buffer stringbuffer buffer append item title title append new line newline buffer append subitems buffer append item append new line newline buffer string buffer stringbuffer createcomplexcsitem string children string new line newline string buffer stringbuffer buffer string buffer stringbuffer buffer append item append new line newline buffer append skip append new line newline buffer append title title append new line newline buffer append dialog append new line newline buffer append append new line newline buffer append description append new line newline buffer append description append new line newline buffer append description append new line newline buffer append on completion oncompletion append new line newline buffer append completion contents append new line newline buffer append on completion oncompletion append new line newline buffer append children buffer append item append new line newline buffer string create action createaction string new line newline string buffer stringbuffer buffer string buffer stringbuffer buffer append action append new line newline buffer append org eclipse clazz append new line newline buffer append plugin id pluginid org eclipse pde plugin xyz append new line newline buffer append param param append new line newline buffer append param append new line newline buffer append append new line newline buffer to string tostring string create perform when createperformwhen string exec utables executables string new line newline string buffer stringbuffer buffer string buffer stringbuffer buffer append perform append new line newline buffer append condition condition append new line newline buffer append append new line newline buffer append exec utables executables append new line newline buffer append perform append new line newline buffer to string tostring string create command createcommand string new line newline string buffer stringbuffer buffer string buffer stringbuffer buffer append command append new line newline buffer append required append new line newline buffer append serialization org eclipse command append new line newline buffer append append new line newline buffer to string tostring string create sub item createsubitem string children string new line newline string buffer stringbuffer buffer string buffer stringbuffer buffer append subitem append new line newline buffer append label label append new line newline buffer append skip append new line newline buffer append append new line newline buffer append append new line newline buffer append children buffer append subitem append new line newline buffer to string tostring string create repeated sub item createrepeatedsubitem string children string new line newline string buffer stringbuffer buffer string buffer stringbuffer buffer append repeated subitem append new line newline buffer append values repeat append new line newline buffer append append new line newline buffer append children buffer append repeated subitem append new line newline buffer to string tostring string create conditional sub item createconditionalsubitem string children string new line newline string buffer stringbuffer buffer string buffer stringbuffer buffer append conditional subitem append new line newline buffer append condition append new line newline buffer append append new line newline buffer append children buffer append conditional subitem append new line newline buffer to string tostring validatecomplexcsitem isimplecsitem item assert true asserttrue item get dialog getdialog assert true asserttrue item get skip getskip assert equals assertequals title item get title gettitle isimplecsdescription description item get description getdescription assert not null assertnotnull description assert equals assertequals i simple s isimplecs type description description get type gettype assert equals assertequals description get content getcontent description get name getname assert equals assertequals description description get content getcontent i simple on completion isimplecsoncompletion on completion oncompletion item get on completion getoncompletion assert not null assertnotnull on completion oncompletion assert equals assertequals i simple s isimplecs type completion on completion oncompletion get type gettype assert equals assertequals i simple s isimplecs element oncompletion on completion oncompletion get name getname assert equals assertequals completion contents on completion oncompletion get content getcontent validate sub item validatesubitem i simple sub item object isimplecssubitemobject subitem assert true asserttrue subitem i simple sub item isimplecssubitem assert equals assertequals isimplecsconstants type subitem subitem get type gettype i simple sub item isimplecssubitem simple sub item simplesubitem i simple sub item isimplecssubitem subitem assert equals assertequals label simple sub item simplesubitem get label getlabel assert equals assertequals label simple sub item simplesubitem get name getname assert true asserttrue simple sub item simplesubitem get skip getskip assert equals assertequals simple sub item simplesubitem get when getwhen validate repeated sub item validaterepeatedsubitem i simple sub item object isimplecssubitemobject subitem assert true asserttrue subitem i simple repeated sub item isimplecsrepeatedsubitem assert equals assertequals isimplecsconstants type repeated subitem subitem get type gettype assert equals assertequals repeat i simple repeated sub item isimplecsrepeatedsubitem subitem get values getvalues validate conditional sub item validateconditionalsubitem i simple sub item object isimplecssubitemobject subitem assert true asserttrue subitem i simple conditional sub item isimplecsconditionalsubitem assert equals assertequals isimplecsconstants type conditional subitem subitem get type gettype assert equals assertequals i simple conditional sub item isimplecsconditionalsubitem subitem get condition getcondition validate sub items count validatesubitemscount expected isimplecsitem item assert true asserttrue item has sub items hassubitems assert equals assertequals expected item get sub item count getsubitemcount i simple sub item object isimplecssubitemobject subitems item get sub items getsubitems assert not null assertnotnull subitems assert equals assertequals expected subitems length validate items count validateitemscount expected i simple s isimplecs model assert true asserttrue model has items hasitems assert equals assertequals expected model get item count getitemcount isimplecsitem items model get items getitems assert equals assertequals expected items length validate action validateaction i simple run container object isimplecsruncontainerobject executable assert not null assertnotnull executable assert true asserttrue executable isimplecsaction isimplecsaction action isimplecsaction executable string params action get params getparams assert not null assertnotnull params assert equals assertequals params length assert equals assertequals param params assert equals assertequals params assert equals assertequals org eclipse clazz action get clazz getclazz assert equals assertequals org eclipse pde plugin xyz action get plugin id getpluginid params indexed starting assert equals assertequals action get param getparam assert equals assertequals param action get param getparam assert equals assertequals action get param getparam assert equals assertequals action get param getparam validate command validatecommand i simple run container object isimplecsruncontainerobject executable assert not null assertnotnull executable assert true asserttrue executable isimplecscommand isimplecscommand command isimplecscommand executable assert true asserttrue command get required getrequired assert equals assertequals org eclipse command command get serialization getserialization validate perform when validateperformwhen i simple run container object isimplecsruncontainerobject executable assert not null assertnotnull executable assert true asserttrue executable i simple perform when isimplecsperformwhen i simple perform when isimplecsperformwhen perform when performwhen i simple perform when isimplecsperformwhen executable assert equals assertequals condition perform when performwhen get condition getcondition