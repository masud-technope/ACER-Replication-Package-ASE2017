licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache tomcat jni global author mladen turk global create initialize mutex synchronize processes threads note consider able considerable over head overhead api cross process cross thread mutual exclusion required apr proc mutex apr thread mutex special ized specialized lock routines warning check apr foo serialize defines platform supports apr lock foo apr lock port able portable param fname file lock mechanism requires argument lock code determine param mech mechanism int erprocess interprocess lock pre apr lock fcntl apr lock flock apr lock sysvsem apr lock pos ixsem posixsem apr lock proc pthread apr lock pick mechanism platform pre param pool pool all ocate allocate mutex newly created mutex create string fname mech pool error open mutex child process param fname file mutex mechanism requires argument mutex code determine filename passed apr proc mutex create param pool pool operate function called main tain maintain port ability portability underlying lock mechanism require newly opened mutex child init childinit string fname pool error acquire lock mutex mutex locked current thread sleep lock param mutex mutex acquire lock lock mutex attempt acquire lock mutex mutex acquired call returns apr ebusy note apr status ebusy macro determine apr ebusy port ability portability reasons param mutex mutex attempt lock acquiring try lock trylock mutex release lock mutex param mutex mutex release lock unlock mutex destroy mutex free memory lock param mutex mutex destroy destroy mutex