/**
 */
package gemRBAC;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.Location#getRelativelocation <em>Relativelocation</em>}</li>
 *   <li>{@link gemRBAC.Location#getLocationID <em>Location ID</em>}</li>
 *   <li>{@link gemRBAC.Location#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getLocation()
 * @model abstract="true"
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Relativelocation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.RelativeLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relativelocation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relativelocation</em>' reference.
	 * @see #setRelativelocation(RelativeLocation)
	 * @see gemRBAC.GemRBACPackage#getLocation_Relativelocation()
	 * @see gemRBAC.RelativeLocation#getLocation
	 * @model opposite="location"
	 * @generated
	 */
	RelativeLocation getRelativelocation();

	/**
	 * Sets the value of the '{@link gemRBAC.Location#getRelativelocation <em>Relativelocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relativelocation</em>' reference.
	 * @see #getRelativelocation()
	 * @generated
	 */
	void setRelativelocation(RelativeLocation value);

	/**
	 * Returns the value of the '<em><b>Location ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location ID</em>' attribute.
	 * @see #setLocationID(String)
	 * @see gemRBAC.GemRBACPackage#getLocation_LocationID()
	 * @model id="true"
	 * @generated
	 */
	String getLocationID();

	/**
	 * Sets the value of the '{@link gemRBAC.Location#getLocationID <em>Location ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location ID</em>' attribute.
	 * @see #getLocationID()
	 * @generated
	 */
	void setLocationID(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see gemRBAC.GemRBACPackage#getLocation_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link gemRBAC.Location#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean disjoint(Location l);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t /* (self.label= \'zone1\' and l.label = \'A\') or\n\t\t\t  (self.label= \'zoneL1\' and l.label = \'A\') or\n\t\t\t  (self.label= \'zone3\' and l.label = \'C\'); \052/\n\t\t\t  (self.label= \'insideDarfurZone1\' and l.label = \'pJ\') or\n\t\t\t    (self.label= \'outsideDarfurZone1\' and l.label = \'pK\')'"
	 * @generated
	 */
	boolean contains(Location l);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean overlaps(Location l);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t      /*Location.allInstances()->select(l|l.label = \'zone3\')->any(true);\052/\n\t\t\t      \n\t\t\t      if self.locationID = \'LLAgencyAdmin\' then\n\t\t\t        Location.allInstances()->select(l|l.label = \'outsideDarfurZone1\')->any(true)\n\t\t\t      else\n\t\t\t    \n\t\t\t        Location.allInstances()->select(l|l.label = \'insideDarfurZone1\')->any(true)\n\t\t\t    \n\t\t\t      endif'"
	 * @generated
	 */
	Location computeRelative(RelativeLocation r);

} // Location
