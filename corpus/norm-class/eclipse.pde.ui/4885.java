copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde core build org eclipse core runtime core exception coreexception org eclipse pde core i writable iwritable jar entry represents library folder list entry plugin jars file noimplement intended implemented clients noextend intended extended clients i build entry ibuildentry i writable iwritable property field nls string prefix key denoting source folders compiled jar suffix jar nls string jar prefix source prefix key denoting output folders jar suffix jar nls string output prefix output key lists folders files included binary build nls string bin includes bin includes key lists folders files included source build nls string src includes src includes key declares extra library entries path build time nls string jars extra classpath jars extra classpath key declares additional plug dependencies augment dev elopment development classpath nls string secondary dependencies additional bundles adds token list token entry method core exception coreexception model editable param token list tokens core exception coreexception model editable add token addtoken string token core exception coreexception returns model owns entry build properties model i build model ibuildmodel get model getmodel returns entry entry string get name getname returns array tokens entry array tokens string get tokens gettokens returns token exists entry param token string token token exists entry string token removes token list tokens entry method core exception coreexception model editable param token removed list tokens core exception coreexception model editable remove token removetoken string token core exception coreexception token changing position list method core exception coreexception model editable param old token oldtoken token param new token newtoken token core exception coreexception model editable rename token renametoken string old token oldtoken string new token newtoken core exception coreexception sets build entry method core exception coreexception model editable param entry core exception coreexception model editable set name setname string core exception coreexception