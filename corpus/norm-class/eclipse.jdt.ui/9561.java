copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal corext refactoring structure java util array list arraylist java util collection java util hash map hashmap java util hash set hashset java util iterator java util list java util org eclipse jdt core i java project ijavaproject org eclipse jdt core dom ast node astnode org eclipse jdt core dom ast visitor astvisitor org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom i binding ibinding org eclipse jdt core dom i method binding imethodbinding org eclipse jdt core dom i type binding itypebinding org eclipse jdt core dom i variable binding ivariablebinding org eclipse jdt core dom import declaration importdeclaration org eclipse jdt core dom org eclipse jdt core dom name qualified type namequalifiedtype org eclipse jdt core dom qualified name qualifiedname org eclipse jdt core dom qualified type qualifiedtype org eclipse jdt core dom simple name simplename org eclipse jdt core dom type org eclipse jdt core dom rewrite import rewrite importrewrite org eclipse jdt internal corext code manipulation codemanipulation import references collector importreferencescollector org eclipse jdt internal corext dom bindings removes imports longer required link register removed node registerremovednode ast node astnode registers nodes removed ast register nodes moved place ast node removed parts moved place ast link register retained node registerretainednode ast node astnode imports retained nodes additional imports ast registered code register methods imports typically created link import rewrite importrewrite add import addimport i type binding itypebinding import remove r importremover static import data staticimportdata f field ffield string f member fmember string f qualifier fqualifier static import data staticimportdata string qualifier string member field f qualifier fqualifier qualifier f member fmember member f field ffield field string property key string value of valueof system current time millis currenttimemillis nls string removed removed nls string retained retained string f added imports faddedimports hash set hashset static import data staticimportdata f added static imports faddedstaticimports hash set hashset i java project ijavaproject f project fproject f has removed nodes fhasremovednodes list import declaration importdeclaration f inlined static imports finlinedstaticimports array list arraylist compilation unit compilationunit f root froot import remove r importremover i java project ijavaproject project compilation unit compilationunit root f project fproject project f root froot root divide type refs dividetyperefs list simple name simplename import names importnames list simple name simplename static names staticnames list simple name simplename removed refs removedrefs list simple name simplename unremoved refs unremovedrefs list removed starts ends removedstartsends array list arraylist f root froot accept ast visitor astvisitor f removing start fremovingstart override pre visit previsit ast node astnode node object property node get property getproperty property key property removed f removing start fremovingstart f removing start fremovingstart node get start position getstartposition bug client code removed node nested removed node int ermediate intermediate retained node drop removed property prevent problems premature removed node set property setproperty property key property retained f removing start fremovingstart removed starts ends removedstartsends add f removing start fremovingstart node get start position getstartposition f removing start fremovingstart bug client code retained node nested retained node int ermediate intermediate removed node enclosing removed node drop retained property prevent problems premature restart removed node set property setproperty property key pre visit previsit node override post visit postvisit ast node astnode node object property node get property getproperty property key property retained node get start position getstartposition node get length getlength f removing start fremovingstart property removed f removing start fremovingstart node get start position getstartposition node get length getlength removed starts ends removedstartsends add f removing start fremovingstart f removing start fremovingstart post visit postvisit node iterator simple name simplename iterator import names importnames iterator iterator has next hasnext simple name simplename iterator is in removed isinremoved removed starts ends removedstartsends removed refs removedrefs add unremoved refs unremovedrefs add iterator simple name simplename iterator static names staticnames iterator iterator has next hasnext simple name simplename iterator is in removed isinremoved removed starts ends removedstartsends removed refs removedrefs add unremoved refs unremovedrefs add iterator import declaration importdeclaration iterator f inlined static imports finlinedstaticimports iterator iterator has next hasnext import declaration importdeclaration import decl importdecl iterator import decl importdecl get name getname qualified name qualifiedname qualified name qualifiedname get name getname removed refs removedrefs add simple name simplename is in removed isinremoved simple name simplename list removed starts ends removedstartsends start get start position getstartposition start get length getlength removed starts end removedstartsend removed starts ends removedstartsends start removed starts end removedstartsend removed starts end removedstartsend i binding ibinding get imports to remove getimportstoremove array list arraylist simple name simplename import names importnames array list arraylist array list arraylist simple name simplename static names staticnames array list arraylist import references collector importreferencescollector collect f root froot f project fproject import names importnames static names staticnames list simple name simplename removed refs removedrefs array list arraylist list simple name simplename unremoved refs unremovedrefs array list arraylist divide type refs dividetyperefs import names importnames static names staticnames removed refs removedrefs unremoved refs unremovedrefs removed refs removedrefs size i binding ibinding hash map hashmap string i binding ibinding potential removes potentialremoves get potential removes getpotentialremoves removed refs removedrefs iterator simple name simplename iterator unremoved refs unremovedrefs iterator iterator has next hasnext simple name simplename iterator potential removes potentialremoves remove get identifier getidentifier collection i binding ibinding imports to remove importstoremove potential removes potentialremoves values imports to remove importstoremove to array toarray i binding ibinding imports to remove importstoremove size hash map hashmap string i binding ibinding get potential removes getpotentialremoves list simple name simplename removed refs removedrefs hash map hashmap string i binding ibinding potential removes potentialremoves hash map hashmap iterator simple name simplename iterator removed refs removedrefs iterator iterator has next hasnext simple name simplename iterator f added imports faddedimports get identifier getidentifier has added static import hasaddedstaticimport i binding ibinding binding resolve binding resolvebinding binding potential removes potentialremoves get identifier getidentifier binding potential removes potentialremoves has added static import hasaddedstaticimport simple name simplename i binding ibinding binding resolve binding resolvebinding binding i variable binding ivariablebinding i variable binding ivariablebinding variable i variable binding ivariablebinding binding has added static import hasaddedstaticimport variable get declaring class getdeclaringclass get qualified name getqualifiedname variable get name getname binding i method binding imethodbinding i method binding imethodbinding method i method binding imethodbinding binding has added static import hasaddedstaticimport method get declaring class getdeclaringclass get qualified name getqualifiedname method get name getname has added static import hasaddedstaticimport string qualifier string member field static import data staticimportdata data iterator static import data staticimportdata iterator f added static imports faddedstaticimports iterator iterator has next hasnext data iterator data f qualifier fqualifier equals qualifier data f member fmember equals member data f field ffield field has removed nodes hasremovednodes f has removed nodes fhasremovednodes f inlined static imports finlinedstaticimports size register added import registeraddedimport string type name typename dot type name typename last index of lastindexof dot f added imports faddedimports add type name typename f added imports faddedimports add type name typename substring dot register added imports registeraddedimports type new type node newtypenode new type node newtypenode accept ast visitor astvisitor add name addname simple name simplename f added imports faddedimports add get identifier getidentifier override visit name qualified type namequalifiedtype node add name addname node get name getname override visit qualified name qualifiedname node add name addname node get name getname override visit qualified type qualifiedtype node add name addname node get name getname override visit simple name simplename node add name addname node register added static import registeraddedstaticimport string qualifier string member field f added static imports faddedstaticimports add static import data staticimportdata qualifier member field register added static import registeraddedstaticimport i binding ibinding binding binding i variable binding ivariablebinding i type binding itypebinding declaring type declaringtype i variable binding ivariablebinding binding get declaring class getdeclaringclass f added static imports faddedstaticimports add static import data staticimportdata bindings get raw qualified name getrawqualifiedname declaring type declaringtype binding get name getname binding i method binding imethodbinding i type binding itypebinding declaring type declaringtype i method binding imethodbinding binding get declaring class getdeclaringclass f added static imports faddedstaticimports add static import data staticimportdata bindings get raw qualified name getrawqualifiedname declaring type declaringtype binding get name getname illegal argument exception illegalargumentexception binding to string tostring register removed node registerremovednode ast node astnode removed f has removed nodes fhasremovednodes removed set property setproperty property key removed register retained node registerretainednode ast node astnode retained retained set property setproperty property key retained apply removes applyremoves import rewrite importrewrite import rewrite importrewrite i binding ibinding bindings get imports to remove getimportstoremove bindings length bindings i type binding itypebinding i type binding itypebinding type binding typebinding i type binding itypebinding bindings import rewrite importrewrite remove import removeimport type binding typebinding get type declaration gettypedeclaration get qualified name getqualifiedname bindings i method binding imethodbinding i method binding imethodbinding binding i method binding imethodbinding bindings import rewrite importrewrite remove static import removestaticimport binding get declaring class getdeclaringclass get qualified name getqualifiedname binding get name getname bindings i variable binding ivariablebinding i variable binding ivariablebinding binding i variable binding ivariablebinding bindings import rewrite importrewrite remove static import removestaticimport binding get declaring class getdeclaringclass get qualified name getqualifiedname binding get name getname register inlined static import registerinlinedstaticimport import declaration importdeclaration import decl importdecl f inlined static imports finlinedstaticimports add import decl importdecl