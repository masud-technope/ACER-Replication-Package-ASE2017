copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt core tests compiler parser org eclipse jdt core compiler categorized problem categorizedproblem org eclipse jdt internal compiler i source element requestor isourceelementrequestor org eclipse jdt internal compiler ast expression org eclipse jdt internal compiler ast import reference importreference test source element requestor testsourceelementrequestor i source element requestor isourceelementrequestor dummy source element requestor dummysourceelementrequestor constructor comment test source element requestor testsourceelementrequestor accept annotation type reference acceptannotationtypereference method comment accept annotation type reference acceptannotationtypereference type name typename source start sourcestart source end sourceend accept annotation type reference acceptannotationtypereference method comment accept annotation type reference acceptannotationtypereference type name typename source position sourceposition accept constructor reference acceptconstructorreference method comment accept constructor reference acceptconstructorreference type name typename arg count argcount source position sourceposition accept field reference acceptfieldreference method comment accept field reference acceptfieldreference field name fieldname source position sourceposition accept import acceptimport method comment accept import acceptimport declaration start declarationstart declaration end declarationend name start namestart name end nameend tokens on demand ondemand modifiers accept line separator positions acceptlineseparatorpositions method comment accept line separator positions acceptlineseparatorpositions positions accept method reference acceptmethodreference method comment accept method reference acceptmethodreference method name methodname arg count argcount source position sourceposition accept package acceptpackage method comment accept package acceptpackage import reference importreference import reference importreference accept problem acceptproblem method comment accept problem acceptproblem categorized problem categorizedproblem problem accept type reference accepttypereference method comment accept type reference accepttypereference type name typename source start sourcestart source end sourceend accept type reference accepttypereference method comment accept type reference accepttypereference type name typename source position sourceposition accept unknown reference acceptunknownreference method comment accept unknown reference acceptunknownreference source start sourcestart source end sourceend accept unknown reference acceptunknownreference method comment accept unknown reference acceptunknownreference source position sourceposition enter compilation unit entercompilationunit method comment enter compilation unit entercompilationunit enter constructor enterconstructor method comment enter constructor enterconstructor method info methodinfo method info methodinfo enter field enterfield method comment enter field enterfield field info fieldinfo field info fieldinfo enter method entermethod method comment enter method entermethod method info methodinfo method info methodinfo enter type entertype method comment enter type entertype type info typeinfo type info typeinfo exit compilation unit exitcompilationunit method comment exit compilation unit exitcompilationunit declaration end declarationend exit constructor exitconstructor method comment exit constructor exitconstructor declaration end declarationend exit field exitfield method comment exit field exitfield initialization start initializationstart declaration end declarationend declaration source end declarationsourceend exit method exitmethod method comment exit method exitmethod declaration end declarationend expression default value defaultvalue enter initializer enterinitializer method comment enter initializer enterinitializer source start sourcestart source end sourceend exit initializer exitinitializer method comment exit initializer exitinitializer source end sourceend exit type exittype method comment exit type exittype declaration end declarationend