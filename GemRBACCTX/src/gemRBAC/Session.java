/**
 */
package gemRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.Session#getIdSession <em>Id Session</em>}</li>
 *   <li>{@link gemRBAC.Session#getActiveRoles <em>Active Roles</em>}</li>
 *   <li>{@link gemRBAC.Session#getEnabledRoles <em>Enabled Roles</em>}</li>
 *   <li>{@link gemRBAC.Session#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getSession()
 * @model
 * @generated
 */
public interface Session extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Session</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Session</em>' attribute.
	 * @see #setIdSession(String)
	 * @see gemRBAC.GemRBACPackage#getSession_IdSession()
	 * @model id="true"
	 * @generated
	 */
	String getIdSession();

	/**
	 * Sets the value of the '{@link gemRBAC.Session#getIdSession <em>Id Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Session</em>' attribute.
	 * @see #getIdSession()
	 * @generated
	 */
	void setIdSession(String value);

	/**
	 * Returns the value of the '<em><b>Active Roles</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Role}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Role#getSessionsA <em>Sessions A</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Roles</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getSession_ActiveRoles()
	 * @see gemRBAC.Role#getSessionsA
	 * @model opposite="sessionsA"
	 * @generated
	 */
	EList<Role> getActiveRoles();

	/**
	 * Returns the value of the '<em><b>Enabled Roles</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Role}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Role#getSessionsE <em>Sessions E</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled Roles</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getSession_EnabledRoles()
	 * @see gemRBAC.Role#getSessionsE
	 * @model opposite="sessionsE"
	 * @generated
	 */
	EList<Role> getEnabledRoles();

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.User#getSessions <em>Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see gemRBAC.GemRBACPackage#getSession_User()
	 * @see gemRBAC.User#getSessions
	 * @model opposite="sessions" required="true"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link gemRBAC.Session#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

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
	void enableRole(Role r);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void disableRole(Role r);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void activateRole(Role r);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deactivateRole(Role r);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void performOperation(Operation op, Permission p, Role r);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void delegateRole(Role r);

} // Session
