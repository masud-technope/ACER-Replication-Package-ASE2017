copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt core dom org eclipse jdt core i annotation iannotation org eclipse jdt core i java element ijavaelement binding represents named entity java language bindings int egrated integrated picture structure program compiler point view declares protocols common kinds named entities java language packages types fields methods constructors local variables annotations i package binding ipackagebinding i type binding itypebinding i variable binding ivariablebinding i method binding imethodbinding i annotation binding iannotationbinding i member value pair binding imembervaluepairbinding noimplement intended implemented clients i binding ibinding kind constant indicating binding bindings kind safely code i package binding ipackagebinding code get kind getkind i package binding ipackagebinding kind constant indicating type binding bindings kind safely code i type binding itypebinding code get kind getkind i type binding itypebinding type kind constant indicating field local variable binding bindings kind safely code i variable binding ivariablebinding code get kind getkind i variable binding ivariablebinding variable kind constant indicating method constructor binding bindings kind safely code i method binding imethodbinding code get kind getkind i method binding imethodbinding method kind constant indicating annotation binding bindings kind safely code i annotation binding iannotationbinding code get kind getkind i annotation binding iannotationbinding annotation kind constant indicating member pair binding bindings kind safely code i member value pair binding imembervaluepairbinding code get kind getkind i member value pair binding imembervaluepairbinding member pair returns resolved declaration annotations binding bindings annotations declaration type bindings annotations enum annotation type declaration result type parameterized method bindings annotations method constructor declaration result method parameterized variable bindings annotations field enum constant for mal formal parameter declaration annotation bindings empty array returned member pair bindings empty array returned note method returns declaration annotations type annotations sense jls returned type annotations retrieved link i type binding itypebinding get type annotations gettypeannotations list resolved declaration annotations empty list declaration annotations entity represented binding i annotation binding iannotationbinding get annotations getannotations returns kind bindings kind constants code code code type code code variable code code method code code annotation code code member pair code note additional kinds clients assume list exhaustive program def ensively defensively reason able reasonable statement kind constants get kind getkind returns binding details specific kind binding binding string get name getname returns modifiers binding note deprecated included modifiers code is deprecated isdeprecated code find binding deprecated bit wise code modifier code constants modifier get modifiers getmodifiers binding deprecated deprecated field method constructor marked deprecated tag javadoc comment code code binding deprecated code code is deprecated isdeprecated binding created bindings recovery enabled binding considered incomplete internal incomplete code code binding recovered binding code code is recovered isrecovered returns binding synthetic synthetic binding compiler declared source code note constructors argument constructor compiler generates declarations explicit constructors declarations gen erally generally considered synthetic synthetic link i method binding imethodbinding is default constructor isdefaultconstructor i method binding imethodbinding is default constructor isdefaultconstructor cases compiled generated constructor recognized code code binding synthetic code code i method binding imethodbinding is default constructor isdefaultconstructor is synthetic issynthetic returns java element corresponds binding returns code code binding java element array types method returns java element corresponds array element type raw parameterized types method returns java element erasure annotations method returns java element annotation link i annotation iannotation cases code code expected primitive types including type wildcard types capture types array types length field array type constructor source constructor anonymous member pairs synthetic bindings kind type method variable annotation bindings method returns code code java element corresponds binding code code i java element ijavaelement get java element getjavaelement returns key binding single cluster bindings produced call code ast parser astparser create method binding distinct key generated manner predictable stable property comparing bindings clusters bindings bindings ast s asts compilation unit exact details generated unspecified function packages unnamed internal classes interfaces type key array types key component type number dimensions primitive types primitive type fields field key declaring type methods method key declaring type parameter types constructors key declaring parameter types local variables local variable declaring block relative parent key method local types type declaring block relative parent key method anonymous types occurrence count anonymous type relative declaring type key declaring type enum types treated classes annotation types treated interfaces type variables type variable key type method declares type variable wildcard types key optional wildcard type bound capture type bindings key wildcard captured type instances key type type arguments instantiate instance explicit parameterized type reference implicit raw type reference method instances key method type arguments instantiate instance explicit parameterized method reference implicit raw method reference members type instances key type instance key member type annotations key annotated element key annotation type key type binding link i type binding itypebinding get type annotations gettypeannotations type annotations type bindings type annotations key iff denote annotated type construction applies method bindings declaring types type annotations note key member pair bindings implemented method returns code code kind bindings recovered bindings unique key key binding string get key getkey special definition equality bindings equality simply object identity context single cluster bindings produced call code ast parser astparser create method binding represented separate object clusters bindings binding objects cases client compare bindings link is equal to isequalto i binding ibinding function ally functionally equivalent checking equality jls type bindings link i type binding itypebinding get type annotations gettypeannotations type annotations note type bindings denote annotated type link get key getkey key identical type annotations type bindings type annotations identical param obj inherit doc inheritdoc inherit doc inheritdoc i type binding itypebinding get type declaration gettypedeclaration equals object obj returns binding key binding context single cluster bindings produced call code ast parser astparser create method binding represented distinct object clusters bindings binding objects objects cases binding note type bindings differ link i type binding itypebinding get type annotations gettypeannotations type annotations link i binding ibinding get key getkey key method returns code code type bindings construction key applies method bindings declaring types type annotations param binding binding code code code code binding identical object binding bindings string code code binding code code bindings key bindings key get key getkey is equal to isequalto i binding ibinding binding returns string representation binding suitable debug ging debugging purposes debug string string to string tostring