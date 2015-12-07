/**
 */
package gemRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.Permission#getRoles <em>Roles</em>}</li>
 *   <li>{@link gemRBAC.Permission#getOperations <em>Operations</em>}</li>
 *   <li>{@link gemRBAC.Permission#getIdPermission <em>Id Permission</em>}</li>
 *   <li>{@link gemRBAC.Permission#getObject <em>Object</em>}</li>
 *   <li>{@link gemRBAC.Permission#getDelegation <em>Delegation</em>}</li>
 *   <li>{@link gemRBAC.Permission#getLogPermission <em>Log Permission</em>}</li>
 *   <li>{@link gemRBAC.Permission#getPermissionContextAssignment <em>Permission Context Assignment</em>}</li>
 *   <li>{@link gemRBAC.Permission#getPermissionContextEnabling <em>Permission Context Enabling</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getPermission()
 * @model
 * @generated
 */
public interface Permission extends EObject {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Role}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Role#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getPermission_Roles()
	 * @see gemRBAC.Role#getPermissions
	 * @model opposite="permissions"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Operation}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Operation#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getPermission_Operations()
	 * @see gemRBAC.Operation#getPermissions
	 * @model opposite="permissions"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Id Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Permission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Permission</em>' attribute.
	 * @see #setIdPermission(String)
	 * @see gemRBAC.GemRBACPackage#getPermission_IdPermission()
	 * @model id="true"
	 * @generated
	 */
	String getIdPermission();

	/**
	 * Sets the value of the '{@link gemRBAC.Permission#getIdPermission <em>Id Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Permission</em>' attribute.
	 * @see #getIdPermission()
	 * @generated
	 */
	void setIdPermission(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Object#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(gemRBAC.Object)
	 * @see gemRBAC.GemRBACPackage#getPermission_Object()
	 * @see gemRBAC.Object#getPermissions
	 * @model opposite="permissions"
	 * @generated
	 */
	gemRBAC.Object getObject();

	/**
	 * Sets the value of the '{@link gemRBAC.Permission#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(gemRBAC.Object value);

	/**
	 * Returns the value of the '<em><b>Delegation</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Delegation}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Delegation#getDelegatedPermissions <em>Delegated Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getPermission_Delegation()
	 * @see gemRBAC.Delegation#getDelegatedPermissions
	 * @model opposite="delegatedPermissions"
	 * @generated
	 */
	EList<Delegation> getDelegation();

	/**
	 * Returns the value of the '<em><b>Log Permission</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.History}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.History#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Permission</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Permission</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getPermission_LogPermission()
	 * @see gemRBAC.History#getPermission
	 * @model opposite="permission"
	 * @generated
	 */
	EList<History> getLogPermission();

	/**
	 * Returns the value of the '<em><b>Permission Context Assignment</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.RBACContext}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.RBACContext#getP1 <em>P1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission Context Assignment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission Context Assignment</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getPermission_PermissionContextAssignment()
	 * @see gemRBAC.RBACContext#getP1
	 * @model opposite="p1"
	 * @generated
	 */
	EList<RBACContext> getPermissionContextAssignment();

	/**
	 * Returns the value of the '<em><b>Permission Context Enabling</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.RBACContext}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.RBACContext#getP2 <em>P2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission Context Enabling</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission Context Enabling</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getPermission_PermissionContextEnabling()
	 * @see gemRBAC.RBACContext#getP2
	 * @model opposite="p2"
	 * @generated
	 */
	EList<RBACContext> getPermissionContextEnabling();

} // Permission
