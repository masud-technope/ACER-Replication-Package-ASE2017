copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse ltk refactoring java lang reflect invocation target exception invocationtargetexception org eclipse swt widgets shell org eclipse core runtime core exception coreexception org eclipse core runtime i progress monitor iprogressmonitor org eclipse jface action i action iaction org eclipse jface operation i runnable with progress irunnablewithprogress org eclipse jface viewers i selection iselection org eclipse ltk core refactoring i undo manager iundomanager org eclipse ltk core refactoring i validation check result query ivalidationcheckresultquery org eclipse ltk core refactoring refactoring core refactoringcore org eclipse ltk core refactoring undo manager adapter undomanageradapter org eclipse ltk internal refactoring messages org eclipse ltk internal refactoring refactoringuimessages org eclipse ltk internal refactoring undo manager action undomanageraction refactoring redo action executed action performs top change refactoring undo manager redo stack action typically global refactoring menu code org eclipse action sets actionsets code extension point note isn intended subclassed clients allowed instantiate reference action deprecated action longer needed undo performed global undo redo stack code org eclipse core commands code noextend intended subclassed clients deprecated redo refactoring action redorefactoringaction undo manager action undomanageraction f pattern length fpatternlength creates redo refactoring action redo refactoring action redorefactoringaction override string get name getname refactoringuimessages redo refactoring action redorefactoringaction override i runnable with progress irunnablewithprogress create operation createoperation shell parent i validation check result query ivalidationcheckresultquery query query parent refactoringuimessages redo refactoring action redorefactoringaction error title override string get full message getfullmessage string error message errormessage messages format refactoringuimessages redo refactoring action redorefactoringaction error message error message errormessage i runnable with progress irunnablewithprogress override i progress monitor iprogressmonitor invocation target exception invocationtargetexception refactoring core refactoringcore get undo manager getundomanager perform redo performredo query core exception coreexception invocation target exception invocationtargetexception override undo manager adapter undomanageradapter create undo manager listener createundomanagerlistener undo manager adapter undomanageradapter override redo stack changed redostackchanged i undo manager iundomanager manager i action iaction action get action getaction action enabled string text manager anything to redo anythingtoredo enabled text get action text getactiontext text refactoringuimessages redo refactoring action redorefactoringaction label action set enabled setenabled enabled action set text settext text override selection changed selectionchanged i action iaction action i selection iselection is hooked ishooked hook listener hooklistener action f pattern length fpatternlength refactoringuimessages redo refactoring action redorefactoringaction extended label extendedlabel length i undo manager iundomanager undo manager undomanager refactoring core refactoringcore get undo manager getundomanager undo manager undomanager anything to redo anythingtoredo undo manager undomanager peek redo name peekredoname action set text settext get action text getactiontext action set enabled setenabled action set enabled setenabled string get action text getactiontext shorten text shortentext messages format refactoringuimessages redo refactoring action redorefactoringaction extended label extendedlabel refactoring core refactoringcore get undo manager getundomanager peek redo name peekredoname f pattern length fpatternlength