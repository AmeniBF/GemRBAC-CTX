/**
 */
package gemRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.User#getIdUser <em>Id User</em>}</li>
 *   <li>{@link gemRBAC.User#getRoles <em>Roles</em>}</li>
 *   <li>{@link gemRBAC.User#getSessions <em>Sessions</em>}</li>
 *   <li>{@link gemRBAC.User#getDelegation <em>Delegation</em>}</li>
 *   <li>{@link gemRBAC.User#getRecieveddelegation <em>Recieveddelegation</em>}</li>
 *   <li>{@link gemRBAC.User#getRevocation <em>Revocation</em>}</li>
 *   <li>{@link gemRBAC.User#getDelegatedRoles <em>Delegated Roles</em>}</li>
 *   <li>{@link gemRBAC.User#getUserLocation <em>User Location</em>}</li>
 *   <li>{@link gemRBAC.User#getUserLog <em>User Log</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Id User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id User</em>' attribute.
	 * @see #setIdUser(String)
	 * @see gemRBAC.GemRBACPackage#getUser_IdUser()
	 * @model id="true"
	 * @generated
	 */
	String getIdUser();

	/**
	 * Sets the value of the '{@link gemRBAC.User#getIdUser <em>Id User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id User</em>' attribute.
	 * @see #getIdUser()
	 * @generated
	 */
	void setIdUser(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Role}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Role#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getUser_Roles()
	 * @see gemRBAC.Role#getUsers
	 * @model opposite="users" required="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Sessions</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Session}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Session#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sessions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sessions</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getUser_Sessions()
	 * @see gemRBAC.Session#getUser
	 * @model opposite="user"
	 * @generated
	 */
	EList<Session> getSessions();

	/**
	 * Returns the value of the '<em><b>Delegation</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Delegation}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Delegation#getDelegatorUser <em>Delegator User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getUser_Delegation()
	 * @see gemRBAC.Delegation#getDelegatorUser
	 * @model opposite="delegatorUser"
	 * @generated
	 */
	EList<Delegation> getDelegation();

	/**
	 * Returns the value of the '<em><b>Recieveddelegation</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Delegation}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Delegation#getDelegateUser <em>Delegate User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recieveddelegation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recieveddelegation</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getUser_Recieveddelegation()
	 * @see gemRBAC.Delegation#getDelegateUser
	 * @model opposite="delegateUser"
	 * @generated
	 */
	EList<Delegation> getRecieveddelegation();

	/**
	 * Returns the value of the '<em><b>Revocation</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Delegation}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Delegation#getRevokingUser <em>Revoking User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revocation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revocation</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getUser_Revocation()
	 * @see gemRBAC.Delegation#getRevokingUser
	 * @model opposite="revokingUser"
	 * @generated
	 */
	EList<Delegation> getRevocation();

	/**
	 * Returns the value of the '<em><b>Delegated Roles</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Role}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Role#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegated Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegated Roles</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getUser_DelegatedRoles()
	 * @see gemRBAC.Role#getUser
	 * @model opposite="user"
	 * @generated
	 */
	EList<Role> getDelegatedRoles();

	/**
	 * Returns the value of the '<em><b>User Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Location</em>' reference.
	 * @see #setUserLocation(SpatialContext)
	 * @see gemRBAC.GemRBACPackage#getUser_UserLocation()
	 * @model required="true"
	 * @generated
	 */
	SpatialContext getUserLocation();

	/**
	 * Sets the value of the '{@link gemRBAC.User#getUserLocation <em>User Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Location</em>' reference.
	 * @see #getUserLocation()
	 * @generated
	 */
	void setUserLocation(SpatialContext value);

	/**
	 * Returns the value of the '<em><b>User Log</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.History}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.History#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Log</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Log</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getUser_UserLog()
	 * @see gemRBAC.History#getUser
	 * @model opposite="user"
	 * @generated
	 */
	EList<History> getUserLog();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void assignRole(Role r);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<History> accessHistory();

} // User
