licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache catalina valves java io exception ioexception java util concurrent semaphore javax servlet servlet exception servletexception org apache catalina lifecycle exception lifecycleexception org apache catalina lifecycle state lifecyclestate org apache catalina connector request org apache catalina connector response implementation valve limits concurrency valve attached container depending granularity concurrency control perform note int ernally internally async requests require multiple serial requests complete user appears single request author remy maucherat semaphore valve semaphorevalve valve base valvebase constructor semaphore valve semaphorevalve instance variables descriptive implementation string info org apache catalina valves semaphore valve semaphorevalve semaphore semaphore semaphore properties concurrency level semaphore concurrency get concurrency getconcurrency concurrency set concurrency setconcurrency concurrency concurrency concurrency fairness semaphore fairness get fairness getfairness fairness set fairness setfairness fairness fairness fairness block per mit permit block get block getblock block set block setblock block block block block interrupt ibly interruptibly per mit permit int err uptible interruptible get int err uptible getinterruptible int err uptible interruptible set int err uptible setinterruptible int err uptible interruptible int err uptible interruptible int err uptible interruptible start component implement requirements link org apache catalina util lifecycle base lifecyclebase start internal startinternal exception lifecycle exception lifecycleexception component detects fatal error prevents component override start internal startinternal lifecycle exception lifecycleexception semaphore semaphore concurrency fairness set state setstate lifecycle state lifecyclestate starting component implement requirements link org apache catalina util lifecycle base lifecyclebase stop internal stopinternal exception lifecycle exception lifecycleexception component detects fatal error prevents component override stop internal stopinternal lifecycle exception lifecycleexception set state setstate lifecycle state lifecyclestate stopping semaphore methods descriptive valve implementation override string get info getinfo info concurrency control request semaphore param request servlet request processed param response servlet response created exception io exception ioexception input output error occurs exception servlet exception servletexception servlet error occurs override invoke request request response response io exception ioexception servlet exception servletexception control concurrency controlconcurrency request response should release shouldrelease block int err uptible interruptible semaphore acquire interrupted exception interruptedexception should release shouldrelease per mit denied permitdenied request response semaphore acquire uninterruptibly acquireuninterruptibly semaphore try acquire tryacquire should release shouldrelease per mit denied permitdenied request response get next getnext invoke request response should release shouldrelease semaphore release get next getnext invoke request response sub class subclass friendly method add conditions param request param response control concurrency controlconcurrency request request response response sub class subclass friendly method add error handling per mit permit isn granted param request param response io exception ioexception servlet exception servletexception per mit denied permitdenied request request response response io exception ioexception servlet exception servletexception