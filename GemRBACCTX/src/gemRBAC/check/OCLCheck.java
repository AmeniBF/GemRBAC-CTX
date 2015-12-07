package gemRBAC.check;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.OCLInput;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.ExpressionInOCL;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;




public  class OCLCheck  implements IOCLCheck{

     
	public Resource loadModel(String modelPath ) 
	{
		System.out.println("Loading Model..");
	//read model
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		
		ResourceSet rs = new ResourceSetImpl(); 
	    final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(rs.getPackageRegistry());
	    rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,extendedMetaData);
	    
	    URI modelFileURI = URI.createFileURI(modelPath);   
	    Resource resource= loadEmfResource(modelFileURI,rs);
	    Iterator<EObject> i = resource.getAllContents();
 		while (i.hasNext()) {
 			Object o = i.next();
 			 if (o instanceof EPackage) {
 	              EPackage p = (EPackage)o;
 	              rs.getPackageRegistry().put(p.getNsURI(), p);       	
 	     
 	          }
 			

 	 	}
 		
 		EmfModelReader reader = new EmfModelReader(resource);     
 	 		reader.getPackages().get(0);
 	 		 System.out.println("End loading Model..");
 	 	  // for(EClass c: reader.getClasses())
 	       //{System.out.println("Class = " +c.getName());}
 	 return resource;	   
	}
	
	public EObject loadXMI(String instancePath, EmfModelReader reader) 
	{	
		System.out.println("Loading Model instance..");
		
		//load model instance
		ResourceSetImpl load_resourceSet = new ResourceSetImpl();  
	    load_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		load_resourceSet.getLoadOptions().put(XMIResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
		load_resourceSet.getLoadOptions().put(XMIResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
		load_resourceSet.getLoadOptions().put(XMIResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
		load_resourceSet.getLoadOptions().put(XMIResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());
		load_resourceSet.getPackageRegistry().put(reader.getPackages().get(0).getNsURI(),reader.getPackages().get(0));
	 	//load_resourceSet.getPackageRegistry().put(GemRBACPackage.eNS_URI, GemRBACPackage.eINSTANCE);
	 	Resource load_resource = load_resourceSet.getResource(URI.createURI(instancePath),true);
	 	 EList<EObject> elements= load_resource.getContents();
	   return elements.get(0);
	}	
		
		//result of OCL query is of type collection
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public Collection<EObject> evaluateECollection(EObject context,String toBeEvaluated)
		{
			

			Collection<EObject>  res1=new LinkedHashSet<EObject>();
			
			try {
			
			//OCl Helper	
			OCL ocl = org.eclipse.ocl.ecore.OCL.newInstance(); 
		 	OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper = ocl.createOCLHelper();
			OCLExpression<EClassifier> query=null;
			helper.setContext(context.eClass());
			//OCL query
			query = helper.createQuery(toBeEvaluated);
			Object res=ocl.evaluate(context, query);

			res1=(Collection<EObject>)res;	 
			} catch (Exception e) {
			System.err.println("evaluateECollection "+toBeEvaluated);
			e.printStackTrace();
			}
			return res1;
		}
		
		//result of OCL query is of type boolean
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public  boolean evaluateBoolean(EObject context,OCLExpression toBeEvaluated)
		{
			

			boolean  res1 = false;
			
			try {
			
			//OCl Helper	
			OCL ocl = org.eclipse.ocl.ecore.OCL.newInstance();
		 	OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper = ocl.createOCLHelper();
			OCLExpression<EClassifier> query=null;
			helper.setContext(context.eClass());
			//OCL query
			//query = helper.createQuery(toBeEvaluated);
			query = toBeEvaluated;
			Object res=ocl.evaluate(context, query);
            //System.out.println("query     "+query);
			res1=(boolean)res;	
			//System.out.println( " res1 " + res1);
			} catch (Exception e) {
			System.err.println("evaluateBoolean "+toBeEvaluated.toString());
			e.printStackTrace();
			}
			
			
			return res1;
		}
		
		//result of OCL query is of type int
				@SuppressWarnings({ "rawtypes", "unchecked" })
				public  Integer evaluateInt(EObject context,String toBeEvaluated)
				{
					

					Integer  res1 = 0;
					
					try {
					
					//OCl Helper	
					OCL ocl = org.eclipse.ocl.ecore.OCL.newInstance();
				 	OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper = ocl.createOCLHelper();
					OCLExpression<EClassifier> query=null;
					helper.setContext(context.eClass());
					//OCL query
					query = helper.createQuery(toBeEvaluated);
					Object res=ocl.evaluate(context, query);
		            //System.out.println("query     "+query);
					res1=(Integer)res;	
					//System.out.println( " res1 " + res1);
					} catch (Exception e) {
					System.err.println("evaluateInt "+toBeEvaluated);
					e.printStackTrace();
					}
					
					
					return res1;
				}
		
		
		
		
		
	
		
		// OCLpath, modelPath
		  public  List<Constraint> parseOclDocument(Resource resource, String oclPath) 
				{
					List<Constraint> constraints = new ArrayList<Constraint>();
				    if (oclPath != null) {
				      InputStream in = null;
				        try {
				                in = new FileInputStream(oclPath);
				                // remove the first two lines (imports...) of the OCL file
				                in.skip(80);
				               
				                
				        } catch (FileNotFoundException e) {
				        	e.printStackTrace();
				        } catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}  
				      OCLInput document = new OCLInput(in);  
				     
				      EcoreEnvironmentFactory ecoreEnv = new EcoreEnvironmentFactory(resource.getResourceSet().getPackageRegistry());
				      OCL<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> oclParser = OCL.newInstance(ecoreEnv);
				      try {
				                constraints = oclParser.parse(document);
				        } catch (ParserException e) {
				        	e.printStackTrace();
				                }
				    }

								return constraints;
				}
				
				//This method returns a collection of objects of type className
				  public  Collection<EObject> getInstances (EObject context, String className)
				  {
					  Collection<EObject>  res1=new LinkedHashSet<EObject>();
					  String toBeEvaluated = "";
				      if ( className.equals("Session"))
				      		toBeEvaluated= "self.s";
				      else
				      	if ( className.equals("Permission"))
				      		toBeEvaluated= "self.p";
				      	else
				      		if ( className.equals("Role"))
					      		toBeEvaluated= "self.r";
				      res1 = evaluateECollection(context, toBeEvaluated);
					  return res1;
				  }
					
				
				  public  void  checkConstraints ( List<Constraint> constraints, EObject rootObject)
				  {
					  boolean res = false;
					  // invoke OCL constraints
						
						OCL<?, EClassifier, EOperation, EStructuralFeature, ?, ?, ?, ?, ?, Constraint, ?, ?> ocl = org.eclipse.ocl.ecore.OCL.newInstance();
						OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper = ocl.createOCLHelper();
						int violatedConstraints =0;
						for (Constraint c : constraints) 
						{     
					         
					             
					        	ExpressionInOCL oclExpression = (ExpressionInOCL) c.getSpecification();
					        	EClass contextCls = (EClass) c.getConstrainedElements().get(0);
					        	helper.setContext(contextCls);     
				                String className = contextCls.getName();
				                Collection<EObject> objectInstances =  getInstances (rootObject , className);
				                for (EObject eObject : objectInstances)
				        		{  
				                	OCLExpression<EClassifier> body =  oclExpression.getBodyExpression();
				                	
									 res = 	evaluateBoolean(eObject, body);
				        		        //if (res == true)
									    //System.out.println( "The "+c.getName()+" constraint is satisfied for " + eObject.toString()  );
				        		     if (res == false)
				        		    	 {
				        		    	 	System.err.println( "The "+c.getName()+" constraint is violated for " + eObject.eGet(eObject.eClass().getEAllAttributes().get(0))  );
				        		    	 	violatedConstraints ++;
				        		    	 }
				                	
				        		
				        		}      
					            
					          }
					
						if (violatedConstraints == 0)
						{
							 System.out.println( "validation completed successfully " );
						}
				  }
				
				  
					public  Resource loadEmfResource(URI modelFileURI,ResourceSet rSet) {
						return  rSet.getResource(modelFileURI, true);
					}
}
