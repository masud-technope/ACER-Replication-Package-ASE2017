copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation stephan herrmann contribution bug compiler investigate alternative str ategy strategy int ernally internally encoding nullness defaults bug compiler inference infrastructure evolve meet jls jsr spec bug evaluate default location defaultlocation attribute non null by default nonnullbydefault jesper steen moller contributions bug compiler enable ref lected reflected parameter names annotation processing org eclipse jdt internal compiler lookup org eclipse jdt internal compiler ast ast node astnode binding binding kinds field ast node astnode bit local ast node astnode bit variable field local type ast node astnode bit method ast node astnode bit ast node astnode bit ast node astnode bit array type type ast node astnode bit base type type ast node astnode bit parameterized type type ast node astnode bit wildcard type type ast node astnode bit raw type type ast node astnode bit type type ast node astnode bit type parameter type ast node astnode bit intersection type type ast node astnode bit jsr type type ast node astnode bit intersection type type ast node astnode bit poly type type ast node astnode bit event add type binding remember update type binding visitor typebindingvisitor scope substitute methods shared binding collections type binding typebinding types type binding typebinding reference binding referencebinding reference types reference binding referencebinding type binding typebinding parameters type binding typebinding reference binding referencebinding exceptions reference binding referencebinding special handler exceptions reference binding referencebinding exception reference binding referencebinding field binding fieldbinding fields field binding fieldbinding method binding methodbinding methods method binding methodbinding reference binding referencebinding superinterfaces reference binding referencebinding reference binding referencebinding member types reference binding referencebinding type variable binding typevariablebinding type variables type variable binding typevariablebinding annotation binding annotationbinding annotations annotation binding annotationbinding element value pair elementvaluepair element pairs element value pair elementvaluepair parameter names field binding fieldbinding uninitialized fields field binding fieldbinding method binding methodbinding uninitialized methods method binding methodbinding reference binding referencebinding uninitialized reference types reference binding referencebinding inference variable inferencevariable inf erence inference variables inference variable inferencevariable type bound typebound type bounds type bound typebound nullness defaults style non null nonnull unspecified jsr style bit default nullness defaultnullness bit vectors representing enum constant default location defaultlocation parameter default location parameter defaultlocationparameter ast node astnode bit bit default nullness defaultnullness bit vectors representing enum constant default location defaultlocation type default location return type defaultlocationreturntype ast node astnode bit bit default nullness defaultnullness bit vectors representing enum constant default location defaultlocation field default location field defaultlocationfield ast node astnode bit bit default nullness defaultnullness bit vectors representing enum constant default location defaultlocation type argument default location type argument defaultlocationtypeargument ast node astnode bit bit default nullness defaultnullness bit vectors representing enum constant default location defaultlocation type parameter default location type parameter defaultlocationtypeparameter ast node astnode bit bit default nullness defaultnullness bit vectors representing enum constant default location defaultlocation type bound default location type bound defaultlocationtypebound ast node astnode bit bit default nullness defaultnullness bit vectors representing enum constant default location defaultlocation array contents todo constant diff icu lty difficulty discern annotations default location array contents defaultlocationarraycontents ast node astnode bit nullnessdefaultmask included terminate search parent chain unspecified default location parameter defaultlocationparameter default location return type defaultlocationreturntype default location field defaultlocationfield default location type argument defaultlocationtypeargument default location type parameter defaultlocationtypeparameter default location type bound defaultlocationtypebound default location array contents defaultlocationarraycontents answer receiver binding type binding bindingid kind computes key uniquely identifies binding returns binding type binding typebinding method binding methodbinding field binding fieldbinding local variable binding localvariablebinding package binding packagebinding import binding importbinding compute unique key computeuniquekey compute unique key computeuniquekey leaf computes key uniquely identifies binding option ally optionally include access flags returns binding type binding typebinding method binding methodbinding field binding fieldbinding local variable binding localvariablebinding package binding packagebinding import binding importbinding compute unique key computeuniquekey is leaf isleaf compute tag bits tagbits standard annotations source types require lazily resolving annotation nodes references type bindings method returns tag bits tagbits type declaration binding org eclipse jdt internal compiler lookup source type binding sourcetypebinding get annotation tag bits getannotationtagbits get annotation tag bits getannotationtagbits compute tag bits deprecated annotations avoiding resolving entire annotation org eclipse jdt internal compiler lookup source type binding sourcetypebinding initialize deprecated annotation tag bits initializedeprecatedannotationtagbits initialize deprecated annotation tag bits initializedeprecatedannotationtagbits empty block is annotation type isannotationtype api answer receiver problem binding is valid binding isvalidbinding problem id problemid problem reasons problemreasons no error noerror is volatile isvolatile is tag ged repeatable istaggedrepeatable is parameter isparameter api answer problem receiver no error noerror receiver valid binding note parameterized type array type valid for med formed invalid pieces todo philippe rename problem reason problemreason problem id problemid problem reasons problemreasons no error noerror answer print able printable representation receiver readable name readablename shorter print able printable representation receiver qualified type short readable name shortreadablename readable name readablename annotation binding annotationbinding get annotations getannotations binding annotations set annotations setannotations annotation binding annotationbinding annotations scope scope set annotations setannotations annotations set annotations setannotations annotation binding annotationbinding annotations left subtypes