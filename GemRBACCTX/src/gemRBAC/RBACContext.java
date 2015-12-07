/**
 */
package gemRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RBAC Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.RBACContext#getLogContext <em>Log Context</em>}</li>
 *   <li>{@link gemRBAC.RBACContext#getP1 <em>P1</em>}</li>
 *   <li>{@link gemRBAC.RBACContext#getP2 <em>P2</em>}</li>
 *   <li>{@link gemRBAC.RBACContext#getR1 <em>R1</em>}</li>
 *   <li>{@link gemRBAC.RBACContext#getR2 <em>R2</em>}</li>
 *   <li>{@link gemRBAC.RBACContext#getIdContext <em>Id Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getRBACContext()
 * @model abstract="true"
 * @generated
 */
public interface RBACContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Log Context</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.History}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.History#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Context</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getRBACContext_LogContext()
	 * @see gemRBAC.History#getContext
	 * @model opposite="context"
	 * @generated
	 */
	EList<History> getLogContext();

	/**
	 * Returns the value of the '<em><b>P1</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Permission#getPermissionContextAssignment <em>Permission Context Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P1</em>' reference.
	 * @see #setP1(Permission)
	 * @see gemRBAC.GemRBACPackage#getRBACContext_P1()
	 * @see gemRBAC.Permission#getPermissionContextAssignment
	 * @model opposite="permissionContextAssignment"
	 * @generated
	 */
	Permission getP1();

	/**
	 * Sets the value of the '{@link gemRBAC.RBACContext#getP1 <em>P1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P1</em>' reference.
	 * @see #getP1()
	 * @generated
	 */
	void setP1(Permission value);

	/**
	 * Returns the value of the '<em><b>P2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Permission#getPermissionContextEnabling <em>Permission Context Enabling</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P2</em>' reference.
	 * @see #setP2(Permission)
	 * @see gemRBAC.GemRBACPackage#getRBACContext_P2()
	 * @see gemRBAC.Permission#getPermissionContextEnabling
	 * @model opposite="permissionContextEnabling"
	 * @generated
	 */
	Permission getP2();

	/**
	 * Sets the value of the '{@link gemRBAC.RBACContext#getP2 <em>P2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P2</em>' reference.
	 * @see #getP2()
	 * @generated
	 */
	void setP2(Permission value);

	/**
	 * Returns the value of the '<em><b>R1</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Role#getRoleContextAssignment <em>Role Context Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R1</em>' reference.
	 * @see #setR1(Role)
	 * @see gemRBAC.GemRBACPackage#getRBACContext_R1()
	 * @see gemRBAC.Role#getRoleContextAssignment
	 * @model opposite="roleContextAssignment"
	 * @generated
	 */
	Role getR1();

	/**
	 * Sets the value of the '{@link gemRBAC.RBACContext#getR1 <em>R1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R1</em>' reference.
	 * @see #getR1()
	 * @generated
	 */
	void setR1(Role value);

	/**
	 * Returns the value of the '<em><b>R2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Role#getRoleContextEnabling <em>Role Context Enabling</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R2</em>' reference.
	 * @see #setR2(Role)
	 * @see gemRBAC.GemRBACPackage#getRBACContext_R2()
	 * @see gemRBAC.Role#getRoleContextEnabling
	 * @model opposite="roleContextEnabling"
	 * @generated
	 */
	Role getR2();

	/**
	 * Sets the value of the '{@link gemRBAC.RBACContext#getR2 <em>R2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R2</em>' reference.
	 * @see #getR2()
	 * @generated
	 */
	void setR2(Role value);

	/**
	 * Returns the value of the '<em><b>Id Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Context</em>' attribute.
	 * @see #setIdContext(String)
	 * @see gemRBAC.GemRBACPackage#getRBACContext_IdContext()
	 * @model id="true"
	 * @generated
	 */
	String getIdContext();

	/**
	 * Sets the value of the '{@link gemRBAC.RBACContext#getIdContext <em>Id Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Context</em>' attribute.
	 * @see #getIdContext()
	 * @generated
	 */
	void setIdContext(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkAccess(RBACContext c);

} // RBACContext
