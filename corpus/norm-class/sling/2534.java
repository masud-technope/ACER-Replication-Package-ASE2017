licensed apache software foundation asf contributor license agreements notice file distributed work additional copyright ownership asf licenses file apache license version license file compliance license copy license http apache org licenses license required applicable law agreed writing software distributed license distributed basis warranties conditions kind express implied license specific language governing permissions limitations license org apache sling rewriter impl org apache sling rewriter impl processor configuration impl processorconfigurationimpl property content types org apache sling rewriter impl processor configuration impl processorconfigurationimpl property extensions org apache sling rewriter impl processor configuration impl processorconfigurationimpl property paths org apache sling rewriter impl processor configuration impl processorconfigurationimpl property resource types org apache sling rewriter impl processor configuration impl processorconfigurationimpl property selectors org apache sling rewriter impl processor configuration impl processorconfigurationimpl property unwrap resources org junit assert false assertfalse org junit assert true asserttrue org mockito mockito java util map org apache sling api resource resource org apache sling api resource resource wrapper resourcewrapper org apache sling rewriter processing context processingcontext org apache sling testing mock sling junit sling context slingcontext org junit org junit rule org junit test org junit runner run with runwith org mockito mock org mockito run ners runners mockito unit runner mockitojunitrunner google common collect immutable map immutablemap run with runwith mockito unit runner mockitojunitrunner processor configuration impl test processorconfigurationimpltest rule sling context slingcontext context sling context slingcontext mock processing context processingcontext processing context processingcontext setup processing context processingcontext get content type getcontenttype then return thenreturn text html processing context processingcontext get request getrequest then return thenreturn context request processing context processingcontext get response getresponse then return thenreturn context response processor configuration impl processorconfigurationimpl build config buildconfig map string object config props configprops resource config res oruce configresoruce context create resource apps myapp rewriter config config props configprops processor configuration impl processorconfigurationimpl config res oruce configresoruce assert match assertmatch map string object config props configprops assert true asserttrue build config buildconfig config props configprops match processing context processingcontext assert no match assertnomatch map string object config props configprops assert false assertfalse build config buildconfig config props configprops match processing context processingcontext test test match content type mismatch testmatchcontenttypemismatch assert no match assertnomatch immutable map immutablemap string object property content types string text xml text plain test test match at least one content type testmatchatleastonecontenttype assert match assertmatch immutable map immutablemap string object property content types string text html text xml test test match any content type testmatchanycontenttype assert match assertmatch immutable map immutablemap string object property content types string text xml test test match extension mismatch testmatchextensionmismatch context request path info requestpathinfo set extension setextension html assert no match assertnomatch immutable map immutablemap string object property extensions string xml txt test test match at least one extension testmatchatleastoneextension context request path info requestpathinfo set extension setextension html assert match assertmatch immutable map immutablemap string object property extensions string xml html test test match resource type mismatch testmatchresourcetypemismatch context current resource currentresource context create resource content test immutable map immutablemap string object sling resource type resourcetype type assert no match assertnomatch immutable map immutablemap string object property resource types string type type test test match at least one resource type testmatchatleastoneresourcetype context current resource currentresource context create resource content test immutable map immutablemap string object sling resource type resourcetype type assert match assertmatch immutable map immutablemap string object property resource types string type type test test match at least one resource type with resource wrapper testmatchatleastoneresourcetypewithresourcewrapper unwrap disabled unwrapdisabled resource resource context create resource content test immutable map immutablemap string object sling resource type resourcetype type overwrite resource type resource wrapper resourcewrapper resource resource wrapper resourcewrapper resource wrapper resourcewrapper resource override string get resource type getresourcetype type override context current resource currentresource resource wrapper resourcewrapper assert no match assertnomatch immutable map immutablemap string object property resource types string type type test test match at least one resource type with resource wrapper testmatchatleastoneresourcetypewithresourcewrapper unwrap enabled unwrapenabled resource resource context create resource content test immutable map immutablemap string object sling resource type resourcetype type overwrite resource type resource wrapper resourcewrapper resource resource wrapper resourcewrapper resource wrapper resourcewrapper resource override string get resource type getresourcetype type override context current resource currentresource resource wrapper resourcewrapper assert match assertmatch immutable map immutablemap string object property resource types string type type property unwrap resources test test match path mismatch testmatchpathmismatch context request path info requestpathinfo set resource path setresourcepath content test assert no match assertnomatch immutable map immutablemap string object property paths string apps test test match at least one path testmatchatleastonepath context request path info requestpathinfo set resource path setresourcepath content test assert match assertmatch immutable map immutablemap string object property paths string apps content test test match any path testmatchanypath context request path info requestpathinfo set resource path setresourcepath content test assert match assertmatch immutable map immutablemap string object property paths string apps test test match selector required testmatchselectorrequired assert no match assertnomatch immutable map immutablemap string object property selectors string sel test test match selector mismatch testmatchselectormismatch context request path info requestpathinfo set selector string setselectorstring sel sel assert no match assertnomatch immutable map immutablemap string object property selectors string sel test test match at least one selector testmatchatleastoneselector context request path info requestpathinfo set selector string setselectorstring sel sel assert match assertmatch immutable map immutablemap string object property selectors string sel