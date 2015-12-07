/**
 */
package gemRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.Role#getIdRole <em>Id Role</em>}</li>
 *   <li>{@link gemRBAC.Role#getUsers <em>Users</em>}</li>
 *   <li>{@link gemRBAC.Role#isIsDependent <em>Is Dependent</em>}</li>
 *   <li>{@link gemRBAC.Role#isIsStrong <em>Is Strong</em>}</li>
 *   <li>{@link gemRBAC.Role#isIsCascading <em>Is Cascading</em>}</li>
 *   <li>{@link gemRBAC.Role#getSessionsA <em>Sessions A</em>}</li>
 *   <li>{@link gemRBAC.Role#getSessionsE <em>Sessions E</em>}</li>
 *   <li>{@link gemRBAC.Role#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gemRBAC.Role#getJuniors <em>Juniors</em>}</li>
 *   <li>{@link gemRBAC.Role#getSeniors <em>Seniors</em>}</li>
 *   <li>{@link gemRBAC.Role#getUser <em>User</em>}</li>
 *   <li>{@link gemRBAC.Role#getDelegation <em>Delegation</em>}</li>
 *   <li>{@link gemRBAC.Role#getRoleContextAssignment <em>Role Context Assignment</em>}</li>
 *   <li>{@link gemRBAC.Role#getRoleContextEnabling <em>Role Context Enabling</em>}</li>
 *   <li>{@link gemRBAC.Role#getLogRole <em>Log Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Role</em>' attribute.
	 * @see #setIdRole(String)
	 * @see gemRBAC.GemRBACPackage#getRole_IdRole()
	 * @model id="true"
	 * @generated
	 */
	String getIdRole();

	/**
	 * Sets the value of the '{@link gemRBAC.Role#getIdRole <em>Id Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Role</em>' attribute.
	 * @see #getIdRole()
	 * @generated
	 */
	void setIdRole(String value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.User}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.User#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getRole_Users()
	 * @see gemRBAC.User#getRoles
	 * @model opposite="roles" required="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Is Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Dependent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Dependent</em>' attribute.
	 * @see #setIsDependent(boolean)
	 * @see gemRBAC.GemRBACPackage#getRole_IsDependent()
	 * @model
	 * @generated
	 */
	boolean isIsDependent();

	/**
	 * Sets the value of the '{@link gemRBAC.Role#isIsDependent <em>Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Dependent</em>' attribute.
	 * @see #isIsDependent()
	 * @generated
	 */
	void setIsDependent(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Strong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Strong</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Strong</em>' attribute.
	 * @see #setIsStrong(boolean)
	 * @see gemRBAC.GemRBACPackage#getRole_IsStrong()
	 * @model
	 * @generated
	 */
	boolean isIsStrong();

	/**
	 * Sets the value of the '{@link gemRBAC.Role#isIsStrong <em>Is Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Strong</em>' attribute.
	 * @see #isIsStrong()
	 * @generated
	 */
	void setIsStrong(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Cascading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Cascading</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Cascading</em>' attribute.
	 * @see #setIsCascading(boolean)
	 * @see gemRBAC.GemRBACPackage#getRole_IsCascading()
	 * @model
	 * @generated
	 */
	boolean isIsCascading();

	/**
	 * Sets the value of the '{@link gemRBAC.Role#isIsCascading <em>Is Cascading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Cascading</em>' attribute.
	 * @see #isIsCascading()
	 * @generated
	 */
	void setIsCascading(boolean value);

	/**
	 * Returns the value of the '<em><b>Sessions A</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Session}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Session#getActiveRoles <em>Active Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sessions A</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sessions A</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getRole_SessionsA()
	 * @see gemRBAC.Session#getActiveRoles
	 * @model opposite="activeRoles"
	 * @generated
	 */
	EList<Session> getSessionsA();

	/**
	 * Returns the value of the '<em><b>Sessions E</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Session}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Session#getEnabledRoles <em>Enabled Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sessions E</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sessions E</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getRole_SessionsE()
	 * @see gemRBAC.Session#getEnabledRoles
	 * @model opposite="enabledRoles"
	 * @generated
	 */
	EList<Session> getSessionsE();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Permission}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Permission#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getRole_Permissions()
	 * @see gemRBAC.Permission#getRoles
	 * @model opposite="roles" required="true"
	 * @generated
	 */
	EList<Permission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Juniors</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Role}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Role#getSeniors <em>Seniors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Juniors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Juniors</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getRole_Juniors()
	 * @see gemRBAC.Role#getSeniors
	 * @model opposite="seniors"
	 * @generated
	 */
	EList<Role> getJuniors();

	/**
	 * Returns the value of the '<em><b>Seniors</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Role}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Role#getJuniors <em>Juniors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seniors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seniors</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getRole_Seniors()
	 * @see gemRBAC.Role#getJuniors
	 * @model opposite="juniors"
	 * @generated
	 */
	EList<Role> getSeniors();

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.User}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.User#getDelegatedRoles <em>Delegated Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getRole_User()
	 * @see gemRBAC.User#getDelegatedRoles
	 * @model opposite="delegatedRoles"
	 * @generated
	 */
	EList<User> getUser();

	/**
	 * Returns the value of the '<em><b>Delegation</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Delegation}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Delegation#getDelegatedRole <em>Delegated Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getRole_Delegation()
	 * @see gemRBAC.Delegation#getDelegatedRole
	 * @model opposite="delegatedRole"
	 * @generated
	 */
	EList<Delegation> getDelegation();

	/**
	 * Returns the value of the '<em><b>Role Context Assignment</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.RBACContext}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.RBACContext#getR1 <em>R1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Context Assignment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Context Assignment</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getRole_RoleContextAssignment()
	 * @see gemRBAC.RBACContext#getR1
	 * @model opposite="r1"
	 * @generated
	 */
	EList<RBACContext> getRoleContextAssignment();

	/**
	 * Returns the value of the '<em><b>Role Context Enabling</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.RBACContext}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.RBACContext#getR2 <em>R2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Context Enabling</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Context Enabling</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getRole_RoleContextEnabling()
	 * @see gemRBAC.RBACContext#getR2
	 * @model opposite="r2"
	 * @generated
	 */
	EList<RBACContext> getRoleContextEnabling();

	/**
	 * Returns the value of the '<em><b>Log Role</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.History}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.History#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Role</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getRole_LogRole()
	 * @see gemRBAC.History#getRole
	 * @model opposite="role"
	 * @generated
	 */
	EList<History> getLogRole();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.roleContextEnabling.oclAsType(TemporalContext).timeexpression.absolute->flatten()->asSet() \n\t\t\t-> select (i:AbsoluteTE| u.getCurrentTime().isContained(i.oclAsType(TimeInterval))= true) -> any (true) '"
	 * @generated
	 */
	AbsoluteTE getCurrentAbsoluteTE(RBACUtility u);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void assignPermission(Permission p);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<History> accessHistory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<History> logBOCurrentProcessInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\n\t\t\tif self.juniors -> notEmpty() then\n\t             self.juniors-> asSet() -> union (self.juniors-> asSet()-> collect (r:Role| r.getAlljuniors()-> asSet())->asSet())\n\t            \n\t             else  \n\t              self.juniors\n\t             endif '"
	 * @generated
	 */
	EList<Role> getAlljuniors();

} // Role
