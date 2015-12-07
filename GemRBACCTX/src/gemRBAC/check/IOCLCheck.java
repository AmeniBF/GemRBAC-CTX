package gemRBAC.check;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.expressions.OCLExpression;

public interface IOCLCheck
{
	public Resource loadModel(String modelPath );
	public EObject loadXMI(String instancePath, EmfModelReader reader);
	public Collection<EObject> evaluateECollection(EObject context,String toBeEvaluated);
	public  boolean evaluateBoolean(EObject context,OCLExpression<?> toBeEvaluated);
	public  Integer evaluateInt(EObject context,String toBeEvaluated);
	public  List<Constraint> parseOclDocument(Resource resource, String oclPath);
	public  Collection<EObject> getInstances (EObject context, String className);
	public  void  checkConstraints ( List<Constraint> constraints, EObject rootObject);
	public  Resource loadEmfResource(URI modelFileURI,ResourceSet rSet); 

}
