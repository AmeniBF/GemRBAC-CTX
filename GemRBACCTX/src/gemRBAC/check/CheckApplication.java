package gemRBAC.check;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.ecore.Constraint;












public class CheckApplication {
  
	public static void main(String[] args) 
	{
		
	    final String model="//model//gemRBAC.ecore";
	   final String xmi_file="//evaluation//application.xmi";
	   //final String xmi_file="//spatialInstances//violating//relativeLocationRoleEnabling.xmi";
	   final String ocl_file1="//model//PL1.ocl";
	    final String ocl_file2="//model//PL2.ocl";
	   final String ocl_file3="//model//PL3.ocl";
	    File f=new File("");
	    final String folderPath = f.getAbsolutePath();
        final String absolutePathModel = folderPath + model; 
        final String absolutePathXMI = folderPath + xmi_file;
        final String absolutePathOCL1 = folderPath + ocl_file1;
        final String absolutePathOCL2 = folderPath + ocl_file2;
        final String absolutePathOCL3 = folderPath + ocl_file3;
        
        OCLCheck check = new OCLCheck();
        
        //Load Ecore instance
        long startTimeModel = System.nanoTime(); 
        Resource resource = check.loadModel(absolutePathModel);
        long stopTimeModel = System.nanoTime();
        System.out.println("Loding Model  "+ ((stopTimeModel- startTimeModel)/ 1000000000.0));
        
        
        //Load model instance
        EmfModelReader reader = new EmfModelReader(resource); 
        long startTimeInstance = System.nanoTime(); 
    	EObject rootObject = check.loadXMI(absolutePathXMI, reader);
    	long stopTimeInstance = System.nanoTime();
    	System.out.println("Loding Instance  "+ ((stopTimeInstance- startTimeInstance)/ 1000000000.0));
        
    	
    	
		// model instances detail
	   int nbRoles= check.evaluateInt
	 		(rootObject, "let p : Permission = Permission.allInstances() ->select(p : Permission | p.idPermission = 'p1')-> any(true) in p.roles -> size()");
	   int nbContext= check.evaluateInt(rootObject,
	 			"let p : Permission = Permission.allInstances() ->select(p : Permission | p.idPermission = 'p1')-> any(true),  temporalContext: Set(RBACContext) = p.permissionContextAssignment-> select(c|c.oclIsTypeOf(TemporalContext)) in temporalContext-> size()");
	   int nbrelativeTE= check.evaluateInt(rootObject,
	 		"let p : Permission = Permission.allInstances() ->select(p : Permission | p.idPermission = 'p1')-> any(true), temporalContext: Set(RBACContext) = p.permissionContextAssignment-> select(c|c.oclIsTypeOf(TemporalContext)), "
	 		+ "timeE: Set (ComposedRelativeTE) = temporalContext.oclAsType(TemporalContext).timeexpression.relative.oclAsType(ComposedRelativeTE)->flatten()->asSet() in timeE-> size()");
	   int nbDays= check.evaluateInt(rootObject,
	 		"let p : Permission = Permission.allInstances() ->select(p : Permission | p.idPermission = 'p1')-> any(true), u : RBACUtility = RBACUtility.allInstances() ->any(true), day:RelativeTimePoint =  u.getDayOfWeek(),"
	 		+ "temporalContext: Set(RBACContext) = p.permissionContextAssignment-> select(c|c.oclIsTypeOf(TemporalContext)), "
	 		+ "timeE: Set (ComposedRelativeTE) = temporalContext.oclAsType(TemporalContext).timeexpression.relative.oclAsType(ComposedRelativeTE)->flatten()->asSet(), "
	 		+ "days: Set (ComposedRelativeTE) = timeE -> select (t: ComposedRelativeTE| (t.oclIsTypeOf(RelativeTimeInterval) and t.oclAsType(RelativeTimeInterval).start.oclIsTypeOf(DayOfWeek) and day.isContained(t.oclAsType(RelativeTimeInterval)) ) or t.oclIsTypeOf(DayOfWeek) and  day.equalTo (t.oclAsType(DayOfWeek))) "
	 		+ "in days-> size()");
	 	
	    System.out.println("nb context roles assigned to p1 =" + nbRoles);
	    System.out.println("nb context assigned to p1 =" + nbContext);
		System.out.println("nb nbrelativeTE assigned to p =" + nbrelativeTE);
		System.out.println("nb nbDays assigned to p =" + nbDays);
	 		
		//nb location assigned to r2
		int nbLocationR2= check.evaluateInt(rootObject, 
		"let r : Role = Role.allInstances() ->select(r : Role | r.idRole = 'r2')-> any(true), spatialContext : Set(RBACContext) = r.roleContextEnabling->select(c|c.oclIsTypeOf(SpatialContext)), loc : Set(Location) =  spatialContext.oclAsType(SpatialContext).location->flatten()->asSet() in loc -> size()");
		int nbContextR2= check.evaluateInt(rootObject, 
		"let r : Role = Role.allInstances() ->select(r : Role | r.idRole = 'r2')-> any(true), spatialContext : Set(RBACContext) = r.roleContextEnabling->select(c|c.oclIsTypeOf(SpatialContext)) in spatialContext -> size()");
		int nbrelativeLocationR2= check.evaluateInt(rootObject, 
		"let r : Role = Role.allInstances() ->select(r : Role | r.idRole = 'r2')-> any(true), spatialContext : Set(RBACContext) = r.roleContextEnabling->select(c|c.oclIsTypeOf(SpatialContext)), loc : Set(Location) =  spatialContext.oclAsType(SpatialContext).location->select(l | l.relativelocation->notEmpty())->flatten()->asSet() in loc -> size()");
	
		 System.out.println("nb context assigned to r2 =" + nbContextR2);
		 System.out.println("nb location assigned to r2 =" + nbLocationR2);
		 System.out.println("nb relative location assigned to 2 =" + nbrelativeLocationR2);
		
		//nb location assigned to r3
		int nbLocationR3= check.evaluateInt(rootObject, 
		"let r : Role = Role.allInstances() ->select(r : Role | r.idRole = 'r3')-> any(true), spatialContext : Set(RBACContext) = r.roleContextEnabling->select(c|c.oclIsTypeOf(SpatialContext)), loc : Set(Location) =  spatialContext.oclAsType(SpatialContext).location->flatten()->asSet() in loc -> size()");
		int nbContextR3= check.evaluateInt(rootObject, 
		"let r : Role = Role.allInstances() ->select(r : Role | r.idRole = 'r3')-> any(true), spatialContext : Set(RBACContext) = r.roleContextEnabling->select(c|c.oclIsTypeOf(SpatialContext)) in spatialContext -> size()");
		int nbrelativeLocationR3= check.evaluateInt(rootObject, 
		"let r : Role = Role.allInstances() ->select(r : Role | r.idRole = 'r3')-> any(true), spatialContext : Set(RBACContext) = r.roleContextEnabling->select(c|c.oclIsTypeOf(SpatialContext)), loc : Set(Location) =  spatialContext.oclAsType(SpatialContext).location->select(l | l.relativelocation->notEmpty())->flatten()->asSet() in loc -> size()");
		
		
	    System.out.println("nb context assigned to r3 =" + nbContextR3);
		System.out.println("nb location assigned to r3 =" + nbLocationR3);
		System.out.println("nb relative location assigned to p =" + nbrelativeLocationR3);
		
    	
    	
    	
		// evaluation PL1
		System.out.println( " ################################ PL1 ");
		for (int i=0;i<6;i++)
		{
		List<Constraint> constraints = new ArrayList<Constraint>();
		constraints = check.parseOclDocument (resource, absolutePathOCL1);
		long startTime = System.nanoTime(); 

		check.checkConstraints (  constraints, rootObject);
		long stopTime = System.nanoTime();
		long elapsedTime = stopTime - startTime;
	  	double duration_second=elapsedTime / 1000000000.0;
	  	System.out.println( " evaluation time PL1 ="+duration_second+ " seconds");}
	  	
		// evaluation PL2
		System.out.println( " ################################ PL2");
				for (int i=0;i<6;i++)
				{
				List<Constraint> constraints = new ArrayList<Constraint>();
				constraints = check.parseOclDocument (resource, absolutePathOCL2);
				long startTime = System.nanoTime(); 

				check.checkConstraints (  constraints, rootObject);
				long stopTime = System.nanoTime();
				long elapsedTime = stopTime - startTime;
			  	double duration_second=elapsedTime / 1000000000.0;
			  	System.out.println( " evaluation time PL2 ="+duration_second+ " seconds");}
		
				
		// evaluation PL3
				System.out.println( " ################################ PL3 ");		
				for (int i=0;i<6;i++)
				{
				List<Constraint> constraints = new ArrayList<Constraint>();
				constraints = check.parseOclDocument (resource, absolutePathOCL3);
				long startTime = System.nanoTime(); 

				check.checkConstraints (  constraints, rootObject);
				long stopTime = System.nanoTime();
				long elapsedTime = stopTime - startTime;
			  	double duration_second=elapsedTime / 1000000000.0;
			  	System.out.println( " evaluation time PL3 ="+duration_second+ " seconds");}
		
	    
	    

	

	}

}
