copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation org eclipse pde core target org eclipse core runtime describes location target bundles features abstracts storage provisioning bundles combination executable source bundles clients allowed provide implementations target definition persisted correctly clients provide factory code org eclipse pde core target locations targetlocations code extension point recommended impl ementors implementors override link object equals object code code content containers equal pde determine target definitions equivalent content display implementation pde clients implement code i target location wizard itargetlocationwizard code contribute code org eclipse pde target location provision ers targetlocationprovisioners code extension point target location adapt code org eclipse jface viewers i label provider ilabelprovider code provide text icon labels target definition wizard editor target location adapt code org eclipse jface viewers i tree content provider itreecontentprovider code provide children items target definition wizard editor children adapt code i label provider ilabelprovider code text icon labels tree target location adapt code org eclipse pde target i target location editor itargetlocationeditor code open edit wizard edit button pressed target definition wizard editor target location adapt code org eclipse pde target i target location updater itargetlocationupdater code update job location update button pressed target definition wizard editor i target location itargetlocation i adaptable iadaptable resolves contents location context target returns status describing resolution resolution successful status returned problem occurs resolving status returned progress monitor can celled cancelled cancel status returned returned status accessed link get status getstatus location considered resolved problem occurs resolving link is resolved isresolved param definition target resolved param monitor progress monitor code code resolution status i status istatus resolve i target definition itargetdefinition definition i progress monitor iprogressmonitor monitor returns location resolved contents problem resolution location considered resolved link get status getstatus resolve i target definition itargetdefinition i progress monitor iprogressmonitor location resolved contents is resolved isresolved returns status bundle resolution code code location resolved problem resolution status returned link resolve i target definition itargetdefinition i progress monitor iprogressmonitor returned resolution status code code i status istatus get status getstatus returns string identifies implementation target location target definitions persisted correctly match type contributed code org eclipse pde core target locations targetlocations code extension string identifier type target location string get type gettype returns path local file system root target location current target platform framework requires local file location req uirement requirement removed method referenced param resolve resolve variables path location exception core exception coreexception unable resolve location noreference method intended referenced clients string get location getlocation resolve core exception coreexception returns bundles location code code location resolved returned bundles stat uses statuses bundles missing location version source target bundle status call link target bundle targetbundle get status getstatus link get status getstatus complete problems resolved bundles code code target bundle targetbundle get bundles getbundles returns features location code code location resolved method features location multiple bundles returned features bundles features reference returned list returned link get bundles getbundles features code code target feature targetfeature get features getfeatures returns arguments bundle location code code list arguments code code string getvmarguments returns serialized xml string stores location restored link i target location factory itargetlocationfactory code code location saving target definition returned xml single root element named code location code root element attributes children xml prefixed xml declaration code xml version encoding utf code xml string storing location code code string serialize