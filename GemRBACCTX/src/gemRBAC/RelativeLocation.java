/**
 */
package gemRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.RelativeLocation#getLocation <em>Location</em>}</li>
 *   <li>{@link gemRBAC.RelativeLocation#getRelativeLocID <em>Relative Loc ID</em>}</li>
 *   <li>{@link gemRBAC.RelativeLocation#getDistance <em>Distance</em>}</li>
 *   <li>{@link gemRBAC.RelativeLocation#getUnit <em>Unit</em>}</li>
 *   <li>{@link gemRBAC.RelativeLocation#getRelativedirection <em>Relativedirection</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getRelativeLocation()
 * @model
 * @generated
 */
public interface RelativeLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Location}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Location#getRelativelocation <em>Relativelocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getRelativeLocation_Location()
	 * @see gemRBAC.Location#getRelativelocation
	 * @model opposite="relativelocation"
	 * @generated
	 */
	EList<Location> getLocation();

	/**
	 * Returns the value of the '<em><b>Relative Loc ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Loc ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Loc ID</em>' attribute.
	 * @see #setRelativeLocID(String)
	 * @see gemRBAC.GemRBACPackage#getRelativeLocation_RelativeLocID()
	 * @model id="true"
	 * @generated
	 */
	String getRelativeLocID();

	/**
	 * Sets the value of the '{@link gemRBAC.RelativeLocation#getRelativeLocID <em>Relative Loc ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Loc ID</em>' attribute.
	 * @see #getRelativeLocID()
	 * @generated
	 */
	void setRelativeLocID(String value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see gemRBAC.GemRBACPackage#getRelativeLocation_Distance()
	 * @model
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link gemRBAC.RelativeLocation#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see gemRBAC.GemRBACPackage#getRelativeLocation_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link gemRBAC.RelativeLocation#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Relativedirection</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.RelativeDirection#getRelativelocation <em>Relativelocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relativedirection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relativedirection</em>' reference.
	 * @see #setRelativedirection(RelativeDirection)
	 * @see gemRBAC.GemRBACPackage#getRelativeLocation_Relativedirection()
	 * @see gemRBAC.RelativeDirection#getRelativelocation
	 * @model opposite="relativelocation" required="true"
	 * @generated
	 */
	RelativeDirection getRelativedirection();

	/**
	 * Sets the value of the '{@link gemRBAC.RelativeLocation#getRelativedirection <em>Relativedirection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relativedirection</em>' reference.
	 * @see #getRelativedirection()
	 * @generated
	 */
	void setRelativedirection(RelativeDirection value);

} // RelativeLocation
