copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt internal corext refactoring structure java util array list arraylist java util arrays java util list org eclipse ltk core refactoring refactoring status refactoringstatus org eclipse ltk core refactoring refactoring status context refactoringstatuscontext org eclipse jdt core i field ifield org eclipse jdt core i java element ijavaelement org eclipse jdt core i member imember org eclipse jdt core i method imethod org eclipse jdt core i type itype org eclipse jdt core java model exception javamodelexception org eclipse jdt internal corext refactoring checks org eclipse jdt internal corext refactoring refactoring core messages refactoringcoremessages org eclipse jdt internal corext refactoring base java status context javastatuscontext org eclipse jdt internal corext util java model util javamodelutil org eclipse jdt internal corext util messages org eclipse jdt internal viewsupport basic element labels basicelementlabels member check util membercheckutil member check util membercheckutil refactoring status refactoringstatus check members in destination type checkmembersindestinationtype i member imember members i type itype destination type destinationtype java model exception javamodelexception refactoring status refactoringstatus result refactoring status refactoringstatus members length members get element type getelementtype i java element ijavaelement method check method in type checkmethodintype destination type destinationtype result i method imethod members members get element type getelementtype i java element ijavaelement field check field in type checkfieldintype destination type destinationtype result i field ifield members members get element type getelementtype i java element ijavaelement type check type in type checktypeintype destination type destinationtype result i type itype members result check method in type checkmethodintype i type itype destination type destinationtype refactoring status refactoringstatus result i method imethod method java model exception javamodelexception i method imethod destination type methods destinationtypemethods destination type destinationtype get methods getmethods i method imethod find method findmethod method destination type methods destinationtypemethods refactoring status context refactoringstatuscontext context java status context javastatuscontext create destination type destinationtype get compilation unit getcompilationunit get source range getsourcerange string message messages format refactoring core messages refactoringcoremessages member check util membercheckutil signature exists string basic element labels basicelementlabels get java element name getjavaelementname method get element name getelementname get qualified label getqualifiedlabel destination type destinationtype result add error adderror message context i method imethod checks find method findmethod method destination type destinationtype string message messages format refactoring core messages refactoringcoremessages member check util membercheckutil param count string basic element labels basicelementlabels get java element name getjavaelementname method get element name getelementname get qualified label getqualifiedlabel destination type destinationtype refactoring status context refactoringstatuscontext context java status context javastatuscontext create destination type destinationtype get compilation unit getcompilationunit get source range getsourcerange result add warning addwarning message context check field in type checkfieldintype i type itype destination type destinationtype refactoring status refactoringstatus result i field ifield field java model exception javamodelexception i field ifield destination type field destinationtypefield destination type destinationtype get field getfield field get element name getelementname destination type field destinationtypefield exists string message messages format refactoring core messages refactoringcoremessages member check util membercheckutil field exists string basic element labels basicelementlabels get java element name getjavaelementname field get element name getelementname get qualified label getqualifiedlabel destination type destinationtype refactoring status context refactoringstatuscontext context java status context javastatuscontext create destination type destinationtype get compilation unit getcompilationunit destination type field destinationtypefield get source range getsourcerange result add error adderror message context check type in type checktypeintype i type itype destination type destinationtype refactoring status refactoringstatus result i type itype type java model exception javamodelexception string type name typename type get element name getelementname i type itype destination type type destinationtypetype destination type destinationtype get type gettype type name typename destination type type destinationtypetype exists string message messages format refactoring core messages refactoringcoremessages member check util membercheckutil type conflict string basic element labels basicelementlabels get java element name getjavaelementname type name typename get qualified label getqualifiedlabel destination type destinationtype refactoring status context refactoringstatuscontext context java status context javastatuscontext create destination type destinationtype get compilation unit getcompilationunit destination type type destinationtypetype get name range getnamerange result add error adderror message context check hierarchy enclosing enclosed types destination type destinationtype get element name getelementname equals type name typename string message messages format refactoring core messages refactoringcoremessages member check util membercheckutil type conflict get qualified label getqualifiedlabel type refactoring status context refactoringstatuscontext context java status context javastatuscontext create destination type destinationtype get compilation unit getcompilationunit destination type destinationtype get name range getnamerange result add error adderror message context type name exists in enclosing type chain typenameexistsinenclosingtypechain destination type destinationtype type name typename string message messages format refactoring core messages refactoringcoremessages member check util membercheckutil type conflict get qualified label getqualifiedlabel type refactoring status context refactoringstatuscontext context java status context javastatuscontext create destination type destinationtype get compilation unit getcompilationunit destination type destinationtype get name range getnamerange result add error adderror message context check hierarchy of enclosed types checkhierarchyofenclosedtypes destination type destinationtype result type check hierarchy of enclosed types checkhierarchyofenclosedtypes i type itype destination type destinationtype refactoring status refactoringstatus result i type itype type java model exception javamodelexception i type itype enclosed types enclosedtypes get all enclosed types getallenclosedtypes type enclosed types enclosedtypes length i type itype enclosed type enclosedtype enclosed types enclosedtypes destination type destinationtype get element name getelementname equals enclosed type enclosedtype get element name getelementname string message messages format refactoring core messages refactoringcoremessages member check util membercheckutil type conflict string get qualified label getqualifiedlabel enclosed type enclosedtype get qualified label getqualifiedlabel type refactoring status context refactoringstatuscontext context java status context javastatuscontext create destination type destinationtype get compilation unit getcompilationunit destination type destinationtype get name range getnamerange result add error adderror message context type name exists in enclosing type chain typenameexistsinenclosingtypechain destination type destinationtype enclosed type enclosedtype get element name getelementname string message messages format refactoring core messages refactoringcoremessages member check util membercheckutil type conflict string get qualified label getqualifiedlabel enclosed type enclosedtype get qualified label getqualifiedlabel type refactoring status context refactoringstatuscontext context java status context javastatuscontext create destination type destinationtype get compilation unit getcompilationunit destination type destinationtype get name range getnamerange result add error adderror message context string get qualified label getqualifiedlabel i type itype enclosed type enclosedtype basic element labels basicelementlabels get java element name getjavaelementname enclosed type enclosedtype get fully qualified name getfullyqualifiedname i type itype get all enclosed types getallenclosedtypes i type itype type java model exception javamodelexception list i type itype result array list arraylist i type itype directly enclosed directlyenclosed type get types gettypes result add all addall arrays as list aslist directly enclosed directlyenclosed directly enclosed directlyenclosed length i type itype enclosed type enclosedtype directly enclosed directlyenclosed result add all addall arrays as list aslist get all enclosed types getallenclosedtypes enclosed type enclosedtype result to array toarray i type itype result size type name exists in enclosing type chain typenameexistsinenclosingtypechain i type itype type string type name typename i type itype enclosing type get declaring type getdeclaringtype enclosing enclosing get element name getelementname equals type name typename enclosing enclosing get declaring type getdeclaringtype finds method list methods comp ares compares methods signature simple names simplenames types declaring type param method method find param all methods allmethods methods method code code java model exception javamodelexception i method imethod find method findmethod i method imethod method i method imethod all methods allmethods java model exception javamodelexception string method get element name getelementname string param types paramtypes method get parameter types getparametertypes is constructor isconstructor method is constructor isconstructor all methods allmethods length java model util javamodelutil is same method signature issamemethodsignature param types paramtypes is constructor isconstructor all methods allmethods all methods allmethods