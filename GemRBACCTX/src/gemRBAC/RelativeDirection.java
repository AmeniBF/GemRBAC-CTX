/**
 */
package gemRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.RelativeDirection#getRelativelocation <em>Relativelocation</em>}</li>
 *   <li>{@link gemRBAC.RelativeDirection#getIdDirection <em>Id Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getRelativeDirection()
 * @model abstract="true"
 * @generated
 */
public interface RelativeDirection extends EObject {
	/**
	 * Returns the value of the '<em><b>Relativelocation</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.RelativeLocation}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.RelativeLocation#getRelativedirection <em>Relativedirection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relativelocation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relativelocation</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getRelativeDirection_Relativelocation()
	 * @see gemRBAC.RelativeLocation#getRelativedirection
	 * @model opposite="relativedirection" required="true"
	 * @generated
	 */
	EList<RelativeLocation> getRelativelocation();

	/**
	 * Returns the value of the '<em><b>Id Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Direction</em>' attribute.
	 * @see #setIdDirection(String)
	 * @see gemRBAC.GemRBACPackage#getRelativeDirection_IdDirection()
	 * @model id="true"
	 * @generated
	 */
	String getIdDirection();

	/**
	 * Sets the value of the '{@link gemRBAC.RelativeDirection#getIdDirection <em>Id Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Direction</em>' attribute.
	 * @see #getIdDirection()
	 * @generated
	 */
	void setIdDirection(String value);

} // RelativeDirection
