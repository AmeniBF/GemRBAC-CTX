/**
 */
package gemRBAC;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absolute TE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.AbsoluteTE#getDuration <em>Duration</em>}</li>
 *   <li>{@link gemRBAC.AbsoluteTE#getIdAbsoluteTE <em>Id Absolute TE</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getAbsoluteTE()
 * @model abstract="true"
 * @generated
 */
public interface AbsoluteTE extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.ActivationDuration#getAexp <em>Aexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' reference.
	 * @see #setDuration(ActivationDuration)
	 * @see gemRBAC.GemRBACPackage#getAbsoluteTE_Duration()
	 * @see gemRBAC.ActivationDuration#getAexp
	 * @model opposite="aexp"
	 * @generated
	 */
	ActivationDuration getDuration();

	/**
	 * Sets the value of the '{@link gemRBAC.AbsoluteTE#getDuration <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(ActivationDuration value);

	/**
	 * Returns the value of the '<em><b>Id Absolute TE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Absolute TE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Absolute TE</em>' attribute.
	 * @see #setIdAbsoluteTE(String)
	 * @see gemRBAC.GemRBACPackage#getAbsoluteTE_IdAbsoluteTE()
	 * @model id="true"
	 * @generated
	 */
	String getIdAbsoluteTE();

	/**
	 * Sets the value of the '{@link gemRBAC.AbsoluteTE#getIdAbsoluteTE <em>Id Absolute TE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Absolute TE</em>' attribute.
	 * @see #getIdAbsoluteTE()
	 * @generated
	 */
	void setIdAbsoluteTE(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.duration -> notEmpty()'"
	 * @generated
	 */
	boolean hasDuration();

} // AbsoluteTE
