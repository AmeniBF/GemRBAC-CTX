/**
 */
package gemRBAC;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative TE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.RelativeTE#getIdRelativeTE <em>Id Relative TE</em>}</li>
 *   <li>{@link gemRBAC.RelativeTE#getD2 <em>D2</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getRelativeTE()
 * @model abstract="true"
 * @generated
 */
public interface RelativeTE extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Relative TE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Relative TE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Relative TE</em>' attribute.
	 * @see #setIdRelativeTE(String)
	 * @see gemRBAC.GemRBACPackage#getRelativeTE_IdRelativeTE()
	 * @model id="true"
	 * @generated
	 */
	String getIdRelativeTE();

	/**
	 * Sets the value of the '{@link gemRBAC.RelativeTE#getIdRelativeTE <em>Id Relative TE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Relative TE</em>' attribute.
	 * @see #getIdRelativeTE()
	 * @generated
	 */
	void setIdRelativeTE(String value);

	/**
	 * Returns the value of the '<em><b>D2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.ActivationDuration#getRexp <em>Rexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>D2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D2</em>' reference.
	 * @see #setD2(ActivationDuration)
	 * @see gemRBAC.GemRBACPackage#getRelativeTE_D2()
	 * @see gemRBAC.ActivationDuration#getRexp
	 * @model opposite="rexp"
	 * @generated
	 */
	ActivationDuration getD2();

	/**
	 * Sets the value of the '{@link gemRBAC.RelativeTE#getD2 <em>D2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>D2</em>' reference.
	 * @see #getD2()
	 * @generated
	 */
	void setD2(ActivationDuration value);

} // RelativeTE
