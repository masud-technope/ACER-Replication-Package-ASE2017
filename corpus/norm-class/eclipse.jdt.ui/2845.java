copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation mateusz wenus mateusz wenus gmail override method generate declaration order code generation https bugs eclipse org bugs bug cgi stephan herrmann contribution bug override method generating method override create redundant annotations org eclipse jdt internal corext java util arrays org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core dom ast node astnode org eclipse jdt core dom abstract type declaration abstracttypedeclaration org eclipse jdt core dom anonymous class declaration anonymousclassdeclaration org eclipse jdt core dom compilation unit compilationunit org eclipse jdt core dom enum constant declaration enumconstantdeclaration org eclipse jdt core dom enum declaration enumdeclaration org eclipse jdt core dom i method binding imethodbinding org eclipse jdt core dom i type binding itypebinding org eclipse jdt core dom i variable binding ivariablebinding org eclipse jdt core dom method declaration methoddeclaration org eclipse jdt core dom rewrite ast rewrite astrewrite org eclipse jdt core dom rewrite import rewrite importrewrite org eclipse jdt core dom rewrite import rewrite importrewrite import rewrite context importrewritecontext org eclipse jdt core dom rewrite list rewrite listrewrite org eclipse jdt internal corext code manipulation codemanipulation code generation settings codegenerationsettings org eclipse jdt internal corext code manipulation codemanipulation context sensitive import rewrite context contextsensitiveimportrewritecontext org eclipse jdt internal corext code manipulation codemanipulation stub utility stubutility org eclipse jdt internal corext compilation unit rewrite operations fix compilationunitrewriteoperationsfix compilation unit rewrite operation compilationunitrewriteoperation org eclipse jdt internal corext refactoring structure compilation unit rewrite compilationunitrewrite org eclipse jdt internal corext util messages org eclipse jdt internal corext util methods source position comparator methodssourcepositioncomparator org eclipse jdt java element labels javaelementlabels org eclipse jdt internal preferences java preferences settings javapreferencessettings org eclipse jdt internal text correction correction messages correctionmessages org eclipse jdt internal viewsupport binding label provider bindinglabelprovider add unimplemented methods operation addunimplementedmethodsoperation compilation unit rewrite operation compilationunitrewriteoperation ast node astnode f type node ftypenode create link add unimplemented methods operation addunimplementedmethodsoperation param type node typenode types anonymous class declaration anonymousclassdeclaration abstract type declaration abstracttypedeclaration enum constant declaration enumconstantdeclaration add unimplemented methods operation addunimplementedmethodsoperation ast node astnode type node typenode f type node ftypenode type node typenode override rewriteast compilation unit rewrite compilationunitrewrite cu rewrite curewrite linked proposal model linkedproposalmodel model core exception coreexception i method binding imethodbinding unimplemented methods unimplementedmethods get unimplemented methods getunimplementedmethods f type node ftypenode unimplemented methods unimplementedmethods length import rewrite context importrewritecontext context context sensitive import rewrite context contextsensitiveimportrewritecontext compilation unit compilationunit f type node ftypenode get root getroot f type node ftypenode get start position getstartposition cu rewrite curewrite get import rewrite getimportrewrite ast rewrite astrewrite rewrite cu rewrite curewrite getastrewrite i compilation unit icompilationunit unit cu rewrite curewrite get cu getcu code generation settings codegenerationsettings settings java preferences settings javapreferencessettings get code generation settings getcodegenerationsettings unit get java project getjavaproject list rewrite listrewrite list rewrite listrewrite i type binding itypebinding current type currenttype f type node ftypenode anonymous class declaration anonymousclassdeclaration anonymous class declaration anonymousclassdeclaration decl anonymous class declaration anonymousclassdeclaration f type node ftypenode list rewrite listrewrite rewrite get list rewrite getlistrewrite decl anonymous class declaration anonymousclassdeclaration body declarations property settings create comments createcomments current type currenttype decl resolve binding resolvebinding f type node ftypenode abstract type declaration abstracttypedeclaration abstract type declaration abstracttypedeclaration decl abstract type declaration abstracttypedeclaration f type node ftypenode list rewrite listrewrite rewrite get list rewrite getlistrewrite decl decl get body declarations property getbodydeclarationsproperty current type currenttype decl resolve binding resolvebinding f type node ftypenode enum constant declaration enumconstantdeclaration enum constant declaration enumconstantdeclaration enum constant declaration enumconstantdeclaration enum constant declaration enumconstantdeclaration f type node ftypenode anonymous class declaration anonymousclassdeclaration anonymous class declaration anonymousclassdeclaration enum constant declaration enumconstantdeclaration get anonymous class declaration getanonymousclassdeclaration anonymous class declaration anonymousclassdeclaration anonymous class declaration anonymousclassdeclaration rewrite getast new anonymous class declaration newanonymousclassdeclaration rewrite enum constant declaration enumconstantdeclaration enum constant declaration enumconstantdeclaration anonymous declaration property anonymous class declaration anonymousclassdeclaration create text edit group createtexteditgroup correction messages correctionmessages add unimplemented methods operation addunimplementedmethodsoperation add missing method addmissingmethod group cu rewrite curewrite list rewrite listrewrite rewrite get list rewrite getlistrewrite anonymous class declaration anonymousclassdeclaration anonymous class declaration anonymousclassdeclaration body declarations property settings create comments createcomments nls is true istrue unknown type node import rewrite importrewrite imports cu rewrite curewrite get import rewrite getimportrewrite unimplemented methods unimplementedmethods length i method binding imethodbinding curr unimplemented methods unimplementedmethods method declaration methoddeclaration new method decl newmethoddecl stub utility stubutility create implementation stub createimplementationstub unit rewrite imports context curr curr get declaring class getdeclaringclass settings current type currenttype list rewrite listrewrite insert last insertlast new method decl newmethoddecl create text edit group createtexteditgroup correction messages correctionmessages add unimplemented methods operation addunimplementedmethodsoperation add missing method addmissingmethod group cu rewrite curewrite override string get additional info getadditionalinfo f type node ftypenode enum declaration enumdeclaration correction messages correctionmessages unimplemented methods correction proposal unimplementedmethodscorrectionproposal enum info i method binding imethodbinding methods to override methodstooverride get methods to implement getmethodstoimplement string buffer stringbuffer buf string buffer stringbuffer nls buf append methods to override methodstooverride length buf append correction messages correctionmessages unimplemented methods correction proposal unimplementedmethodscorrectionproposal info singular buf append messages format correction messages correctionmessages unimplemented methods correction proposal unimplementedmethodscorrectionproposal info plural string value of valueof methods to override methodstooverride length nls buf append methods to override methodstooverride length nls buf append buf append binding label provider bindinglabelprovider get binding label getbindinglabel methods to override methodstooverride java element labels javaelementlabels fully qualified nls buf append nls buf append buf to string tostring i method binding imethodbinding get methods to implement getmethodstoimplement get unimplemented methods getunimplementedmethods f type node ftypenode i method binding imethodbinding get unimplemented methods getunimplementedmethods ast node astnode type node typenode i type binding itypebinding binding implement abstracts of input implementabstractsofinput type node typenode anonymous class declaration anonymousclassdeclaration anonymous class declaration anonymousclassdeclaration decl anonymous class declaration anonymousclassdeclaration type node typenode binding decl resolve binding resolvebinding type node typenode abstract type declaration abstracttypedeclaration abstract type declaration abstracttypedeclaration decl abstract type declaration abstracttypedeclaration type node typenode binding decl resolve binding resolvebinding type node typenode enum constant declaration enumconstantdeclaration enum constant declaration enumconstantdeclaration enum constant declaration enumconstantdeclaration enum constant declaration enumconstantdeclaration type node typenode enum constant declaration enumconstantdeclaration get anonymous class declaration getanonymousclassdeclaration binding enum constant declaration enumconstantdeclaration get anonymous class declaration getanonymousclassdeclaration resolve binding resolvebinding i variable binding ivariablebinding var binding varbinding enum constant declaration enumconstantdeclaration resolve variable resolvevariable var binding varbinding binding var binding varbinding get declaring class getdeclaringclass implement abstracts of input implementabstractsofinput binding i method binding imethodbinding i method binding imethodbinding unimplemented methods unimplementedmethods stub utility stubutility get unimplemented methods getunimplementedmethods binding implement abstracts of input implementabstractsofinput arrays sort unimplemented methods unimplementedmethods methods source position comparator methodssourcepositioncomparator binding unimplemented methods unimplementedmethods