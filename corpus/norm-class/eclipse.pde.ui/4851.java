copyright ibm corporation rights reserved program accompanying materials terms eclipse license accompanies distribution http eclipse org legal epl html contributors ibm corporation initial api implementation johannes ahlers johannes ahlers gmx bug org eclipse pde internal wizards imports java util org eclipse core resources resources plugin resourcesplugin org eclipse core runtime core exception coreexception org eclipse debug core org eclipse jface dialogs org eclipse jface viewers i structured selection istructuredselection org eclipse jface wizard org eclipse osgi service resolver bundle description bundledescription org eclipse pde core plugin i plugin model base ipluginmodelbase org eclipse pde internal core source location manager sourcelocationmanager org eclipse pde internal launching launcher bundle launcher helper bundlelauncherhelper org eclipse pde internal org eclipse swt widgets composite org eclipse swt widgets shell org eclipse team core scm url import description scmurlimportdescription org eclipse team core importing provisional i bundle importer ibundleimporter org eclipse team i scm url import wizard page iscmurlimportwizardpage org eclipse i import wizard iimportwizard org eclipse i workbench iworkbench suppress warnings suppresswarnings restriction plugin import wizard pluginimportwizard i bundle importer ibundleimporter api provisional wizard i import wizard iimportwizard i page changing listener ipagechanginglistener nls string store plugin import wizard pluginimportwizard i structured selection istructuredselection selection plugin import wizard first page pluginimportwizardfirstpage base import wizard second page baseimportwizardsecondpage base import wizard second page baseimportwizardsecondpage plugin import wizard pluginimportwizard i dialog settings idialogsettings master settings mastersettings pde plugin pdeplugin get default getdefault get dialog settings getdialogsettings set dialog settings setdialogsettings get settings section getsettingssection master settings mastersettings set default page image descriptor setdefaultpageimagedescriptor pde plugin images pdepluginimages desc plugin wiz set window title setwindowtitle pde ui messages pdeuimessages import wizard importwizard title override init i workbench iworkbench workbench i structured selection istructuredselection selection selection selection override create page controls createpagecontrols composite page container pagecontainer create page controls createpagecontrols page container pagecontainer i wizard container iwizardcontainer container get container getcontainer container wizard dialog wizarddialog wizard dialog wizarddialog dialog wizard dialog wizarddialog container dialog add page changing listener addpagechanginglistener override add pages addpages set needs progress monitor setneedsprogressmonitor nls plugin import wizard first page pluginimportwizardfirstpage add page addpage nls plugin import wizard exp ress page pluginimportwizardexpresspage express selection add page addpage nls plugin import wizard detailed page pluginimportwizarddetailedpage detailed add page addpage i dialog settings idialogsettings get settings section getsettingssection i dialog settings idialogsettings master i dialog settings idialogsettings setting master get section getsection store setting setting master add new section addnewsection store setting i plugin model base ipluginmodelbase get models to import getmodelstoimport get next page getnextpage equals get models to import getmodelstoimport get models to import getmodelstoimport override perform finish performfinish store settings storesettings base import wizard second page baseimportwizardsecondpage get next page getnextpage store settings storesettings i plugin model base ipluginmodelbase models get models to import getmodelstoimport launched configuration launchedconfiguration get conflicting configurations count getconflictingconfigurationscount models launched configuration launchedconfiguration string message launched configuration launchedconfiguration pde ui messages pdeuimessages plugin import wizard pluginimportwizard running config desc runningconfigdesc pde ui messages pdeuimessages plugin import wizard pluginimportwizard running configs desc runningconfigsdesc message dialog messagedialog dialog message dialog messagedialog get shell getshell pde ui messages pdeuimessages plugin import wizard pluginimportwizard running configs title runningconfigstitle message message dialog messagedialog warning string i dialog constants idialogconstants label i dialog constants idialogconstants cancel label dialog open i dialog constants idialogconstants get import type getimporttype plugin import operation pluginimportoperation repository get container getcontainer get current page getcurrentpage base import wizard second page baseimportwizardsecondpage ensure models finished pressed advancing repository configure bundle import pages configurebundleimportpages models finish contributed finish pages finishpages do import operation doimportoperation get import type getimporttype models force auto build forceautobuild launched configuration launchedconfiguration get alternate source locations getalternatesourcelocations get import descriptions getimportdescriptions number conflicting running launch configurations get conflicting configurations count getconflictingconfigurationscount i plugin model base ipluginmodelbase models to import modelstoimport i launch manager ilaunchmanager launch manager launchmanager debug plugin debugplugin get default getdefault get launch manager getlaunchmanager count i launch ilaunch launches launch manager launchmanager get launches getlaunches hash set hashset string imported hash set hashset models to import modelstoimport length models to import modelstoimport length bundle description bundledescription models to import modelstoimport get bundle description getbundledescription imported add get symbolic name getsymbolicname launches length launches is terminated isterminated i launch configuration ilaunchconfiguration configuration launches get launch configuration getlaunchconfiguration configuration map workspace bundle map workspacebundlemap bundle launcher helper bundlelauncherhelper get workspace bundle map getworkspacebundlemap configuration iterator iter workspace bundle map workspacebundlemap key set keyset iterator iter has next hasnext i plugin model base ipluginmodelbase i plugin model base ipluginmodelbase iter bundle description bundledescription description get bundle description getbundledescription description imported description get symbolic name getsymbolicname count core exception coreexception count count do import operation doimportoperation shell shell import type importtype i plugin model base ipluginmodelbase models force auto build forceautobuild do import operation doimportoperation import type importtype models force auto build forceautobuild performs param import type importtype operation types param models models imported param force auto build forceautobuild force build param launched configuration launchedconfiguration launched target running param alternate source alternatesource locate source att achments attachments code code source locations active target platform param importer to descriptions importertodescriptions map bundle import ers importers descriptions importing repository code code do import operation doimportoperation import type importtype i plugin model base ipluginmodelbase models force auto build forceautobuild launched configuration launchedconfiguration source location manager sourcelocationmanager alternate source alternatesource map i bundle importer ibundleimporter scm url import description scmurlimportdescription importer to descriptions importertodescriptions plugin import operation pluginimportoperation job plugin import operation pluginimportoperation models import type importtype force auto build forceautobuild job set import descriptions setimportdescriptions importer to descriptions importertodescriptions job set alternate source setalternatesource alternate source alternatesource job set plugins in use setpluginsinuse launched configuration launchedconfiguration job set rule setrule resources plugin resourcesplugin get workspace getworkspace get root getroot job set user setuser job schedule override i wizard page iwizardpage get next page getnextpage i wizard page iwizardpage equals get scan all plugins getscanallplugins equals equals i scm url import wizard page iscmurlimportwizardpage i plugin model base ipluginmodelbase models get models to import getmodelstoimport configure bundle import pages configurebundleimportpages models get next page getnextpage override i wizard page iwizardpage get previous page getpreviouspage i wizard page iwizardpage equals equals equals i wizard page iwizardpage prev get previous page getpreviouspage prev prev override can finish canfinish is current page iscurrentpage get next page getnextpage is page complete ispagecomplete are pages complete arepagescomplete override handle page changing handlepagechanging page changing event pagechangingevent event event get current page getcurrentpage base import wizard second page baseimportwizardsecondpage event get target page gettargetpage i scm url import wizard page iscmurlimportwizardpage i plugin model base ipluginmodelbase models get models to import getmodelstoimport configure bundle import pages configurebundleimportpages models