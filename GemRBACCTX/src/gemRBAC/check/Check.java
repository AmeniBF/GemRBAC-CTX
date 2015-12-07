package gemRBAC.check;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.ecore.Constraint;

public class Check 
{

           public static void main(String[] args) 
           {
		   
		   final String model="//model//gemRBAC.ecore";
		   final String xmi_file="//temporalInstances//violating//RelativeMonthsRoleAssign.xmi";
		   
		   final String ocl_file1="//model//TemporalConstraints.ocl";

		    File f=new File("");
		    final String folderPath = f.getAbsolutePath();
	        final String absolutePathModel = folderPath + model; 
	        final String absolutePathXMI = folderPath + xmi_file;
	        final String absolutePathOCL1 = folderPath + ocl_file1;
	        
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
	        
	    	
	    	
			// evaluation 
			List<Constraint> constraints = new ArrayList<Constraint>();
			constraints = check.parseOclDocument (resource, absolutePathOCL1);
			long startTime = System.nanoTime(); 
			check.checkConstraints (constraints, rootObject);
			long stopTime = System.nanoTime();
			long elapsedTime = stopTime - startTime;
		  	
		  	double duration_ms=elapsedTime / 1000000.0;
		  
		  	System.out.println( " evaluation time ="+duration_ms+ " milliseconds");
		  	
		    //double duration_second=elapsedTime / 1000000000.0;
		  	//System.out.println( " evaluation time ="+duration_second+ " seconds");
		  	
			
			
		    
		
	}
}
