copyright software rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors stephan herrmann initial api implementation org eclipse jdt internal compiler class fmt classfmt org eclipse jdt core compiler char operation charoperation org eclipse jdt internal compiler env i binary annotation ibinaryannotation org eclipse jdt internal compiler env i binary element value pair ibinaryelementvaluepair org eclipse jdt internal compiler env i binary type annotation ibinarytypeannotation org eclipse jdt internal compiler env i type annotation walker itypeannotationwalker org eclipse jdt internal compiler lookup binding org eclipse jdt internal compiler lookup lookup environment lookupenvironment org eclipse jdt internal compiler lookup type ids typeids type annotation walker adds missing non null nonnull annotations current non null default aware type annotation walker nonnulldefaultawaretypeannotationwalker type annotation walker typeannotationwalker default nullness defaultnullness at default location atdefaultlocation next is default location nextisdefaultlocation at type bound attypebound next is type bound nextistypebound is empty isempty i binary annotation ibinaryannotation non null annotation nonnullannotation lookup environment lookupenvironment environment create initial walker empty type annotations non null default aware type annotation walker nonnulldefaultawaretypeannotationwalker i binary type annotation ibinarytypeannotation type annotations typeannotations default nullness defaultnullness lookup environment lookupenvironment environment type annotations typeannotations non null annotation nonnullannotation get non null annotation getnonnullannotation environment default nullness defaultnullness default nullness defaultnullness environment environment create initial walker real type annotations nonnull non null default aware type annotation walker nonnulldefaultawaretypeannotationwalker default nullness defaultnullness lookup environment lookupenvironment environment default nullness defaultnullness get non null annotation getnonnullannotation environment environment restricted walker empty type annotations non null default aware type annotation walker nonnulldefaultawaretypeannotationwalker i binary type annotation ibinarytypeannotation type annotations typeannotations new matches newmatches new path ptr newpathptr default nullness defaultnullness i binary annotation ibinaryannotation non null annotation nonnullannotation at default location atdefaultlocation at type bound attypebound lookup environment lookupenvironment environment type annotations typeannotations new matches newmatches new path ptr newpathptr default nullness defaultnullness default nullness defaultnullness non null annotation nonnullannotation non null annotation nonnullannotation at default location atdefaultlocation at default location atdefaultlocation at type bound attypebound at type bound attypebound environment environment create restricted walker real type annotations nonnull non null default aware type annotation walker nonnulldefaultawaretypeannotationwalker default nullness defaultnullness i binary annotation ibinaryannotation non null annotation nonnullannotation at default location atdefaultlocation at type bound attypebound lookup environment lookupenvironment environment non null annotation nonnullannotation non null annotation nonnullannotation default nullness defaultnullness default nullness defaultnullness at default location atdefaultlocation at default location atdefaultlocation at type bound attypebound at type bound attypebound is empty isempty environment environment i binary annotation ibinaryannotation get non null annotation getnonnullannotation lookup environment lookupenvironment environment non null annotation name nonnullannotationname char operation charoperation concat char operation charoperation concat with concatwith environment get non null annotation name getnonnullannotationname create synthetic annotation i binary annotation ibinaryannotation override get type name gettypename non null annotation name nonnullannotationname override i binary element value pair ibinaryelementvaluepair get element value pairs getelementvaluepairs type annotation walker typeannotationwalker restrict new matches newmatches new path ptr newpathptr considers next is default location nextisdefaultlocation at default location atdefaultlocation change matches new matches newmatches path ptr pathptr new path ptr newpathptr at default location atdefaultlocation next is default location nextisdefaultlocation at type bound attypebound next is type bound nextistypebound running real type annotations new matches newmatches type annotations typeannotations type annotations typeannotations length non null default aware type annotation walker nonnulldefaultawaretypeannotationwalker default nullness defaultnullness non null annotation nonnullannotation next is default location nextisdefaultlocation next is type bound nextistypebound environment proceed normal pass specific fields non null default aware type annotation walker nonnulldefaultawaretypeannotationwalker type annotations typeannotations new matches newmatches new path ptr newpathptr default nullness defaultnullness non null annotation nonnullannotation next is default location nextisdefaultlocation next is type bound nextistypebound environment expire next is default location nextisdefaultlocation expire next is type bound nextistypebound override i type annotation walker itypeannotationwalker to supertype tosupertype super type signature supertypesignature is empty isempty restrict matches path ptr pathptr to supertype tosupertype super type signature supertypesignature override i type annotation walker itypeannotationwalker to method parameter tomethodparameter don next is default location nextisdefaultlocation signature level nullness handled implicit null annotation verifier implicitnullannotationverifier triggered invocation message send messagesend resolve type resolvetype is empty isempty restrict matches path ptr pathptr to method parameter tomethodparameter override i type annotation walker itypeannotationwalker to field tofield don next is default location nextisdefaultlocation field level nullness handled binary type binding binarytypebinding scan field for null annotation scanfieldfornullannotation is empty isempty restrict matches path ptr pathptr to field tofield override i type annotation walker itypeannotationwalker to method return tomethodreturn don next is default location nextisdefaultlocation signature level nullness handled implicit null annotation verifier implicitnullannotationverifier triggered invocation message send messagesend resolve type resolvetype is empty isempty restrict matches path ptr pathptr to method return tomethodreturn override i type annotation walker itypeannotationwalker to type bound totypebound bound index boundindex next is default location nextisdefaultlocation default nullness defaultnullness binding default location type bound defaultlocationtypebound next is type bound nextistypebound is empty isempty restrict matches path ptr pathptr to type bound totypebound bound index boundindex override i type annotation walker itypeannotationwalker to wildcard bound towildcardbound next is default location nextisdefaultlocation default nullness defaultnullness binding default location type bound defaultlocationtypebound next is type bound nextistypebound is empty isempty restrict matches path ptr pathptr to wildcard bound towildcardbound override i type annotation walker itypeannotationwalker to type parameter bounds totypeparameterbounds is class type parameter isclasstypeparameter parameter rank parameterrank next is default location nextisdefaultlocation default nullness defaultnullness binding default location type bound defaultlocationtypebound next is type bound nextistypebound is empty isempty restrict matches path ptr pathptr to type parameter bounds totypeparameterbounds is class type parameter isclasstypeparameter parameter rank parameterrank override i type annotation walker itypeannotationwalker to type argument totypeargument rank next is default location nextisdefaultlocation default nullness defaultnullness binding default location type argument defaultlocationtypeargument next is type bound nextistypebound is empty isempty restrict matches path ptr pathptr to type argument totypeargument rank override i type annotation walker itypeannotationwalker to type parameter totypeparameter is class type parameter isclasstypeparameter rank next is default location nextisdefaultlocation default nullness defaultnullness binding default location type parameter defaultlocationtypeparameter next is type bound nextistypebound is empty isempty restrict matches path ptr pathptr to type parameter totypeparameter is class type parameter isclasstypeparameter rank override i type annotation walker itypeannotationwalker to next detail tonextdetail detail kind detailkind is empty isempty restrict matches path ptr pathptr to next detail tonextdetail detail kind detailkind override i binary annotation ibinaryannotation get annotations at cursor getannotationsatcursor current type id currenttypeid i binary annotation ibinaryannotation normal annotations normalannotations is empty isempty annotations get annotations at cursor getannotationsatcursor current type id currenttypeid at default location atdefaultlocation apply type variable wildcard current type id currenttypeid climb top object type bound explicit type bound at type bound attypebound current type id currenttypeid type ids typeids java lang object javalangobject normal annotations normalannotations normal annotations normalannotations length i binary annotation ibinaryannotation non null annotation nonnullannotation environment contains null type annotation containsnulltypeannotation normal annotations normalannotations annotation explicit annotation exists normal annotations normalannotations merge len normal annotations normalannotations length i binary annotation ibinaryannotation new anno ts newannots i binary annotation ibinaryannotation len system arraycopy normal annotations normalannotations new anno ts newannots len new anno ts newannots len non null annotation nonnullannotation new anno ts newannots normal annotations normalannotations