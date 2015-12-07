# GemRBAC-CTX-model
This project has been developed at the [SVV lab](http://www.svv.lu) of the [University of Luxembourg](http://wwwen.uni.lu) by [Ameni Ben Fadhel](http://wwwen.uni.lu/snt/people/ameni_ben_fadhel).

GemRBAC+CTX is an extension of the GemRBAC  that supports the definition of temporal and spatial context RBAC policies. The GemRBAC+CTX has been introduced in:

> Ameni Ben Fadhel, Domenico Bianculli, and Lionel Briand. __A Model-driven Approach to Representing and Checking RBAC Contextual Policies__. In Proceedings of the 6th ACM Conference on Data and Application Security and Privacy (CODASPY 2016).  Available online at http://hdl.handle.net/10993/22759

#Content
The project contains:

* The Ecore version of the GemRBAC+CTX model (*model/gemRBAC.ecore*)
* The formalization of temporal RBAC policies as OCL constraints (*model/TemporalConstraints.ocl*)
  * For each temporal policy, an instance that satisfies (folder *temporalInstances/satisfying*) and an instance that violates it (folder *temporalInstances/violating*):
  	* absolute time expression: AbsoluteBIPermAssign.xmi, AbsoluteBIRoleEnab.xmi,
  	AbsoluteTPRoleAssign.xmi, AbsoluteUBIRoleAssign.xmi
    * relative time expression: DayOfMonthHourPermAssign.xmi, DayOfMonthHourRoleAssign.xmi, DayOfWeekHourPermAssign.xmi, DayOfWeekHourRoleAssign.xmi, DurationAbsoluteBTIRoleEnab.xmi,
    IndexDayOfWeekIntervalRoleAssign.xmi, IndexDayOfWeekRoleAssign.xmi, MonthDayOfWeekHourRoleAssign.xmi,
    periodicUnboundTIRoleAssign.xmi, RelativeDaysRoleAssign.xmi, RelativeHoursRoleAssign.xmi, RelativeMonthsRoleAssign.xmi

* The formalization of spatial RBAC policies as OCL constraints (*model/SpatialConstraints.ocl*)
  * For each spatial policy, an instance that satisfies (folder *spatialInstances/violating*) and an instance that violates it (folder      *spatialInstances/satisfying*):
    * physical location: physicalLocationRoleAssign.xmi
    * logical location: logicalLocationRoleAssign.xmi
    * relative location: relativeLocationRoleEnabling.xmi

* The main program (*Check.java*) for checking these OCL constraints is in the main folder.

The GemRBAC+CTX has been applied to a real application. The evaluation includes:
  * the formalization of the OCL constraints of the application (*model/applicationPolicies.ocl*). 
  * these OCL constrains can be checked on the instance (*evaluation/application.xmi*)
  * the main program for checking the OCL constraints (*CheckApplication.java*)

#Requirements
* Ecoretools (http://eclipse.org/ecoretools/)
* Eclipse OCL (http://www.eclipse.org/modeling/mdt/?project=ocl)
