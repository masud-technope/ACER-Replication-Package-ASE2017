copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse ltk core refactoring org eclipse core runtime org eclipse core runtime core exception coreexception org eclipse core runtime i adaptable iadaptable org eclipse core runtime i progress monitor iprogressmonitor org eclipse core runtime operation canceled exception operationcanceledexception org eclipse core runtime platform base implementation object representing change workbench code change code object typically created calling link refactoring create change createchange i progress monitor iprogressmonitor subclassed clients wishing provide executed link perform change operation performchangeoperation clients execute change life cycle honored single change tree created method code initialize validation data initializevalidationdata code called method code is valid isvalid code determine change applied workspace method returns link refactoring status refactoringstatus severity fatal change treated invalid performing invalid change isn allowed unspecified result method called multiple times method code perform code called disabled change executed code perform code method called change executed method code dispose code called method code dispose code called code perform code method called change longer needed occurs undo stack flushed change objects managed undo stack longer needed method code dispose code typically implemented unregister listeners registered method code initialize validation data initializevalidationdata code guarantee code initialize validation data initializevalidationdata code code is valid isvalid code code perform code called code dispose code called code snippet execute change pre change change create change createchange change initialize validation data initializevalidationdata change is enabled isenabled refactoring status refactoringstatus valid change is valid isvalid sub progress monitor subprogressmonitor valid has fatal error hasfatalerror change undo change perform sub progress monitor subprogressmonitor undo undo initialize validation data initializevalidationdata sub progress monitor subprogressmonitor undo object change dispose pre impl ementors implementors provide adequate implementation code is valid isvalid code provide undo change method code perform code undo code perform code method allowed code code impl ementors implementors aware providing undo object change object larger change tree result fact change tree undo object returned top level code refactoring create change createchange code option ally optionally descriptor object refactoring created change object clients subclass change i adaptable iadaptable change f parent fparent f is enabled fisenabled constructs change object change returns descriptor change subclasses created link refactoring create change createchange i progress monitor iprogressmonitor override method link refactoring change descriptor refactoringchangedescriptor change tree created refactoring supposed change returns refactoring descriptor refactorings instance link composite change compositechange link refactoring create change createchange i progress monitor iprogressmonitor method method refactoring framework searches change tree top refactoring descriptor descriptor change code code change provide change descriptor change descriptor changedescriptor get descriptor getdescriptor returns human readable change code code human readable change string get name getname returns change enabled disabled executed code code change enabled code code is enabled isenabled f is enabled fisenabled sets change enabled param enabled code code enable change code code set enabled setenabled enabled f is enabled fisenabled enabled sets enablement change shallow children change enablement children left untouched param enabled code code enable change code code set enabled shallow setenabledshallow enabled f is enabled fisenabled enabled returns parent change returns code code parent exists parent change change get parent getparent f parent fparent sets parent change requires change isn connected parent parent code code disconnect change parent param parent parent change code code set parent setparent change parent parent is true istrue f parent fparent f parent fparent parent hook method initialize internal provide adequate answer code is valid isvalid code method method called change change tree created typically method implemented ways change hooks listener delta not ification notification mechanism marks invalid receives delta implement or implementor care unhooking listener code dispose code change remembers allowing decide change object valid code is valid isvalid code called change object manipulates content code i file ifile code listen resource detect file changed remember content stamp compare actual content stamp code is valid isvalid code called param progress monitor initialize validation data initializevalidationdata i progress monitor iprogressmonitor verifies change object valid executed calling code perform code refactoring status severity link refactoring status refactoringstatus fatal returned change treated invalid longer executed performing change produces unspecified result exception method called link i undo manager iundomanager undo manager undomanager decide undo redo change valid executed param progress monitor refactoring status describing out come outcome validation check core exception coreexception error occurred validation check change treated invalid exception occurs operation canceled exception operationcanceledexception validation check can celed canceled refactoring status refactoringstatus is valid isvalid i progress monitor iprogressmonitor core exception coreexception operation canceled exception operationcanceledexception performs change method called invalid disabled change object result unspecified general resp ond respond link i progress monitor iprogressmonitor is canceled iscanceled can celing canceling change tree middle execution leaves workspace changed param progress monitor undo change change object code code undo core exception coreexception error occurred change execution change perform i progress monitor iprogressmonitor core exception coreexception disposes change subclasses override method typically unregister listeners registered call code initialize validation data initializevalidationdata code subclasses override method dispose empty implementation returns element modified code change code method code code change isn element element modified change object get modified element getmodifiedelement returns elements change code code elements determined returns empty array change doesn modify elements implementation returns code code elements unknown subclasses reimplement method compute elements elements change code code elements determined object get affected objects getaffectedobjects override get adapter getadapter adapter result platform get adapter manager getadaptermanager get adapter getadapter adapter result result f parent fparent f parent fparent get adapter getadapter adapter