licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license javax servlet java io exception ioexception filter object performs filtering tasks request resource servlet content response resource filters perform filtering code do filter dofilter code method filter access filter config filterconfig object initialization parameters reference servlet context servletcontext load resources needed filtering tasks filters configured deployment descriptor web application examples identified design authentication filters logging auditing filters image conversion filters data compression filters enc ryption encryption filters token izing tokenizing filters filters trigger resource access events xsl filters mime type chain filter servlet filter called web container filter service servlet container calls init method ins tantiating instantiating filter init method complete filter asked filtering work web container place filter service init method servlet exception servletexception time period defined web container init filter config filterconfig filter config filterconfig servlet exception servletexception code do filter dofilter code method filter called container time request response pair passed chain client request resource chain filter chain filterchain passed method filter pass request response entity chain typical implementation method follow pattern examine request option ally optionally wrap request object custom implementation filter content headers input filtering option ally optionally wrap response object custom implementation filter content headers output filtering strong strong invoke entity chain filter chain filterchain object code chain do filter dofilter code strong strong pass request response pair entity filter chain block request processing headers response invocation entity filter chain do filter dofilter servlet request servletrequest request servlet response servletresponse response filter chain filterchain chain io exception ioexception servlet exception servletexception called web container filter service method called threads filter do filter dofilter method exited timeout period passed web container calls method call do filter dofilter method instance filter method filter opportunity clean resources held memory file handles threads persistent filter current memory destroy