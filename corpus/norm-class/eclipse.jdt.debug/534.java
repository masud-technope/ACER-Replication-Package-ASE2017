copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt debug tests core java util array list arraylist java util list org eclipse debug core model i line breakpoint ilinebreakpoint org eclipse debug core model i variable ivariable org eclipse jdt debug core i java debug target ijavadebugtarget org eclipse jdt debug core i java object ijavaobject org eclipse jdt debug core i java reference type ijavareferencetype org eclipse jdt debug core i java stack frame ijavastackframe org eclipse jdt debug core i java thread ijavathread org eclipse jdt debug core i java value ijavavalue org eclipse jdt debug core i java variable ijavavariable org eclipse jdt debug tests abstract debug test abstractdebugtest instance variable tests instancevariabletests abstract debug test abstractdebugtest instance variable tests instancevariabletests string test get field testgetfield exception string type name typename instance variables tests instancevariablestests i line breakpoint ilinebreakpoint create line breakpoint createlinebreakpoint type name typename i java thread ijavathread thread thread launch to line breakpoint launchtolinebreakpoint type name typename i java stack frame ijavastackframe frame i java stack frame ijavastackframe thread get top stack frame gettopstackframe i variable ivariable ivt find variable findvariable frame ivt assert not null assertnotnull find variable ivt ivt retrieve instance i java object ijavaobject i java object ijavaobject ivt get value getvalue assert not null assertnotnull i java variable ijavavariable pub str pubstr get field getfield pub str pubstr assert not null assertnotnull pub str pubstr assert equals assertequals redefined pub str pubstr get value getvalue get value string getvaluestring redefined retrieve instance superclass i java variable ijavavariable priv str privstr get field getfield priv str privstr assert not null assertnotnull priv str privstr assert equals assertequals priv str privstr get value getvalue get value string getvaluestring retrieve instance pub str pubstr get field getfield pub str pubstr assert not null assertnotnull pub str pubstr assert equals assertequals pub str pubstr get value getvalue get value string getvaluestring terminate and remove terminateandremove thread remove all breakpoints removeallbreakpoints test get declared field names testgetdeclaredfieldnames exception string type name typename instance variables tests instancevariablestests i line breakpoint ilinebreakpoint create line breakpoint createlinebreakpoint type name typename i java thread ijavathread thread thread launch to line breakpoint launchtolinebreakpoint type name typename i java stack frame ijavastackframe frame i java stack frame ijavastackframe thread get top stack frame gettopstackframe i java object ijavaobject object frame get this getthis assert not null assertnotnull object string names i java reference type ijavareferencetype object get java type getjavatype get declared field names getdeclaredfieldnames assert equals assertequals declared fields names length list string fields array list arraylist string names length string string names fields add string assert true asserttrue missing pub str pubstr fields index of indexof pub str pubstr assert true asserttrue missing prot str protstr fields index of indexof prot str protstr assert true asserttrue missing def str defstr fields index of indexof def str defstr assert true asserttrue missing priv str privstr fields index of indexof priv str privstr assert true asserttrue missing null str nullstr fields index of indexof null str nullstr assert true asserttrue missing fields index of indexof assert true asserttrue missing null date nulldate fields index of indexof null date nulldate terminate and remove terminateandremove thread remove all breakpoints removeallbreakpoints test get declared field names in sub class testgetdeclaredfieldnamesinsubclass exception string type name typename instance variables tests instancevariablestests i line breakpoint ilinebreakpoint create line breakpoint createlinebreakpoint type name typename i java thread ijavathread thread thread launch to line breakpoint launchtolinebreakpoint type name typename i java stack frame ijavastackframe frame i java stack frame ijavastackframe thread get top stack frame gettopstackframe i variable ivariable ivt find variable findvariable frame ivt assert not null assertnotnull find variable ivt ivt i java object ijavaobject object i java object ijavaobject ivt get value getvalue string names i java reference type ijavareferencetype object get java type getjavatype get declared field names getdeclaredfieldnames assert equals assertequals declared fields names length list string fields array list arraylist string names length string string names fields add string assert true asserttrue missing pub str pubstr fields index of indexof pub str pubstr assert true asserttrue missing prot str protstr fields index of indexof prot str protstr assert true asserttrue missing def str defstr fields index of indexof def str defstr terminate and remove terminateandremove thread remove all breakpoints removeallbreakpoints test get all field names in sub class testgetallfieldnamesinsubclass exception string type name typename instance variables tests instancevariablestests i line breakpoint ilinebreakpoint create line breakpoint createlinebreakpoint type name typename i java thread ijavathread thread thread launch to line breakpoint launchtolinebreakpoint type name typename i java stack frame ijavastackframe frame i java stack frame ijavastackframe thread get top stack frame gettopstackframe i variable ivariable ivt find variable findvariable frame ivt assert not null assertnotnull find variable ivt ivt i java object ijavaobject object i java object ijavaobject ivt get value getvalue string names i java reference type ijavareferencetype object get java type getjavatype get all field names getallfieldnames assert true asserttrue fields names length not e note object defines ins t inst vars depends libs terminate and remove terminateandremove thread remove all breakpoints removeallbreakpoints test evaluation assignments testevaluationassignments exception string type name typename instance variables tests instancevariablestests i line breakpoint ilinebreakpoint create line breakpoint createlinebreakpoint type name typename i java thread ijavathread thread thread launch to line breakpoint launchtolinebreakpoint type name typename i java stack frame ijavastackframe frame i java stack frame ijavastackframe thread get top stack frame gettopstackframe i variable ivariable pub str pubstr find variable findvariable frame pub str pubstr assert not null assertnotnull find variable pub str pubstr pub str pubstr assert equals assertequals pub str pubstr pub str pubstr get value getvalue get value string getvaluestring evaluate pub str pubstr frame changed assert equals assertequals pub str pubstr pub str pubstr get value getvalue get value string getvaluestring evaluate pub str pubstr frame changed assert equals assertequals pub str pubstr i java debug target ijavadebugtarget frame get debug target getdebugtarget null value nullvalue pub str pubstr get value getvalue assert true asserttrue i java value ijavavalue pub str pubstr get value getvalue is null isnull terminate and remove terminateandremove thread remove all breakpoints removeallbreakpoints test value has changed testvaluehaschanged exception string type name typename variable changes variablechanges i line breakpoint ilinebreakpoint create line breakpoint createlinebreakpoint type name typename i java thread ijavathread thread thread launch to line breakpoint launchtolinebreakpoint type name typename i java stack frame ijavastackframe frame i java stack frame ijavastackframe thread get top stack frame gettopstackframe i variable ivariable count find variable findvariable frame count i variable ivariable find variable findvariable frame assert not null assertnotnull find variable count count assert not null assertnotnull find variable suspend change count get value getvalue get value getvalue assert false assertfalse count changed count has value changed hasvaluechanged assert false assertfalse changed has value changed hasvaluechanged step count changed step over stepover frame count changed count get value getvalue get value getvalue assert true asserttrue count changed count has value changed hasvaluechanged assert false assertfalse has value changed hasvaluechanged step over stepover frame count changed count get value getvalue get value getvalue assert false assertfalse count changed count has value changed hasvaluechanged assert true asserttrue changd has value changed hasvaluechanged terminate and remove terminateandremove thread remove all breakpoints removeallbreakpoints