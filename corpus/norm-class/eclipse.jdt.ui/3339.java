copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse jdt tests refactoring actions java io exception ioexception junit framework test junit framework test suite testsuite org eclipse jdt core i compilation unit icompilationunit org eclipse jdt core i package fragment ipackagefragment org eclipse jdt core i source range isourcerange org eclipse jdt core java model exception javamodelexception org eclipse jdt core source range sourcerange org eclipse jdt tests refactoring abstract selection test case abstractselectiontestcase org eclipse jdt tests refactoring refactoring test refactoringtest org eclipse jdt tests refactoring refactoring test setup refactoringtestsetup org eclipse jdt tests refactoring infra text range util textrangeutil org eclipse jdt internal java editor javaeditor selection actions selectionactions structure select enclosing action structureselectenclosingaction org eclipse jdt internal java editor javaeditor selection actions selectionactions structure select next action structureselectnextaction org eclipse jdt internal java editor javaeditor selection actions selectionactions structure select previous action structureselectpreviousaction structure selection action tests structureselectionactiontests refactoring test refactoringtest structure selection action tests structureselectionactiontests clazz structure selection action tests structureselectionactiontests string refactoring path structure selection action structureselectionaction structure selection action tests structureselectionactiontests string override string get refactoring path getrefactoringpath refactoring path test suite refactoring test setup refactoringtestsetup test suite testsuite clazz test set up test setuptest test test refactoring test setup refactoringtestsetup test string get simple test file name getsimpletestfilename input string file name filename get name getname file name filename input file name filename input java txt file name filename string get test file name gettestfilename input test path prefix get refactoring path getrefactoringpath get simple test file name getsimpletestfilename input i compilation unit icompilationunit create ufrom test file createcufromtestfile i package fragment ipackagefragment pack input exception string cu name cuname get simple test file name getsimpletestfilename input i compilation unit icompilationunit pack get compilation unit getcompilationunit cu name cuname exists createcu pack cu name cuname get file contents getfilecontents get test file name gettestfilename input i source range isourcerange get selection getselection i compilation unit icompilationunit exception string source get source getsource offset source index of indexof abstract selection test case abstractselectiontestcase square bracket open source index of indexof abstract selection test case abstractselectiontestcase square bracket close source range sourcerange offset offset check i compilation unit icompilationunit i source range isourcerange new range newrange io exception ioexception java model exception javamodelexception string expected get file contents getfilecontents get test file name gettestfilename string actual get source getsource substring new range newrange get offset getoffset new range newrange get offset getoffset new range newrange get length getlength assert equals assertequals selection incorrect length expected length actual length assert equal lines assertequallines selection incorrect expected actual helper select up helperselectup exception i compilation unit icompilationunit create ufrom test file createcufromtestfile get package p getpackagep i source range isourcerange selection get selection getselection i source range isourcerange new range newrange structure select enclosing action structureselectenclosingaction get new selection range getnewselectionrange selection check new range newrange helper select up helperselectup start line startline start column startcolumn end line endline end column endcolumn exception i compilation unit icompilationunit create ufrom test file createcufromtestfile get package p getpackagep i source range isourcerange selection text range util textrangeutil get selection getselection start line startline start column startcolumn end line endline end column endcolumn i source range isourcerange new range newrange structure select enclosing action structureselectenclosingaction get new selection range getnewselectionrange selection check new range newrange helper select next helperselectnext start line startline start column startcolumn end line endline end column endcolumn exception i compilation unit icompilationunit create ufrom test file createcufromtestfile get package p getpackagep i source range isourcerange selection text range util textrangeutil get selection getselection start line startline start column startcolumn end line endline end column endcolumn i source range isourcerange new range newrange structure select next action structureselectnextaction get new selection range getnewselectionrange selection check new range newrange helper select previous helperselectprevious start line startline start column startcolumn end line endline end column endcolumn exception i compilation unit icompilationunit create ufrom test file createcufromtestfile get package p getpackagep i source range isourcerange selection text range util textrangeutil get selection getselection start line startline start column startcolumn end line endline end column endcolumn i source range isourcerange new range newrange structure select previous action structureselectpreviousaction get new selection range getnewselectionrange selection check new range newrange helper zero length helperzerolength column exception i compilation unit icompilationunit create ufrom test file createcufromtestfile get package p getpackagep i source range isourcerange selection source range sourcerange text range util textrangeutil get offset getoffset column debug utils debugutils dump get source getsource substring selection get offset getoffset i source range isourcerange new range newrange structure select enclosing action structureselectenclosingaction get new selection range getnewselectionrange selection check new range newrange offset test offsettest column expected exception string file path filepath test path prefix get refactoring path getrefactoringpath offset test offsettest java i compilation unit icompilationunit createcu get package p getpackagep offset test offsettest java get file contents getfilecontents file path filepath assert equals assertequals incorrect offset expected text range util textrangeutil get offset getoffset column tests test exception helper select up helperselectup test exception helper select up helperselectup test exception helper select up helperselectup test exception helper select up helperselectup test exception helper select up helperselectup test exception helper select up helperselectup test exception helper select up helperselectup test exception helper helper select up helperselectup test exception helper select up helperselectup test exception helper select up helperselectup test exception helper select up helperselectup test exception helper select up helperselectup test exception helper select up helperselectup test exception helper select up helperselectup test exception helper select up helperselectup test exception identical test helper select up helperselectup test exception helper select up helperselectup test exception helper select up helperselectup test exception helper select up helperselectup test exception helper select up helperselectup test exception helper select up helperselectup test exception regression test bug print test disabled message printtestdisabledmessage regression test bug helper select next helperselectnext test exception regression test bug print test disabled message printtestdisabledmessage regression test bug helper select previous helperselectprevious test exception print test disabled message printtestdisabledmessage regression test bug helper select previous helperselectprevious test exception regression test bug helper select previous helperselectprevious test exception regression test bug helper select next helperselectnext test exception regression test bug helper select previous helperselectprevious test exception regression test bug helper select next helperselectnext test exception regression test bug helper select previous helperselectprevious test exception print test disabled message printtestdisabledmessage regression test bug helper select up helperselectup test exception print test disabled message printtestdisabledmessage regression test bug helper select up helperselectup test exception print test disabled message printtestdisabledmessage regression test bug helper select up helperselectup test exception print test disabled message printtestdisabledmessage regression test bug helper select up helperselectup test exception print test disabled message printtestdisabledmessage regression test bug helper select up helperselectup test exception print test disabled message printtestdisabledmessage regression test bug helper select up helperselectup test exception print test disabled message printtestdisabledmessage regression test bug helper select up helperselectup test exception print test disabled message printtestdisabledmessage regression test bug helper select up helperselectup test exception print test disabled message printtestdisabledmessage regression test bug helper select up helperselectup test exception print test disabled message printtestdisabledmessage regression test bug helper select previous helperselectprevious test exception print test disabled message printtestdisabledmessage regression test bug helper select previous helperselectprevious test exception print test disabled message printtestdisabledmessage regression test bug helper select previous helperselectprevious test exception helper select previous helperselectprevious test exception helper select next helperselectnext test exception helper select next helperselectnext test zero length testzerolength exception print test disabled message printtestdisabledmessage helper zero length helperzerolength test zero length testzerolength exception helper select next helperselectnext helper select previous helperselectprevious test zero length testzerolength exception helper select next helperselectnext helper select previous helperselectprevious test zero length testzerolength exception helper select next helperselectnext helper select previous helperselectprevious test zero length testzerolength exception helper select next helperselectnext helper select previous helperselectprevious test zero length testzerolength exception helper select next helperselectnext helper select previous helperselectprevious test whole cu testwholecu exception i compilation unit icompilationunit create ufrom test file createcufromtestfile get package p getpackagep i source range isourcerange selection get source range getsourcerange i source range isourcerange new range newrange structure select enclosing action structureselectenclosingaction get new selection range getnewselectionrange selection string expected get file contents getfilecontents get test file name gettestfilename string actual get source getsource substring new range newrange get offset getoffset new range newrange get offset getoffset new range newrange get length getlength assert equal lines assertequallines selection incorrect expected actual offset calculation tests test offset testoffset exception offset test offsettest test offset testoffset exception offset test offsettest test offset testoffset exception offset test offsettest test tab count testtabcount text range util textrangeutil calculate tab count in line calculatetabcountinline assert equals assertequals test tab count testtabcount text range util textrangeutil calculate tab count in line calculatetabcountinline tint assert equals assertequals test tab count testtabcount text range util textrangeutil calculate tab count in line calculatetabcountinline treturn assert equals assertequals test tab count testtabcount text range util textrangeutil calculate tab count in line calculatetabcountinline tvoid assert equals assertequals