/**
 */
package gemRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.History#getIdLog <em>Id Log</em>}</li>
 *   <li>{@link gemRBAC.History#getRole <em>Role</em>}</li>
 *   <li>{@link gemRBAC.History#getObject <em>Object</em>}</li>
 *   <li>{@link gemRBAC.History#getOp <em>Op</em>}</li>
 *   <li>{@link gemRBAC.History#getPermission <em>Permission</em>}</li>
 *   <li>{@link gemRBAC.History#getContext <em>Context</em>}</li>
 *   <li>{@link gemRBAC.History#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getHistory()
 * @model
 * @generated
 */
public interface History extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Log</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Log</em>' attribute.
	 * @see #setIdLog(String)
	 * @see gemRBAC.GemRBACPackage#getHistory_IdLog()
	 * @model id="true"
	 * @generated
	 */
	String getIdLog();

	/**
	 * Sets the value of the '{@link gemRBAC.History#getIdLog <em>Id Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Log</em>' attribute.
	 * @see #getIdLog()
	 * @generated
	 */
	void setIdLog(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Role#getLogRole <em>Log Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see gemRBAC.GemRBACPackage#getHistory_Role()
	 * @see gemRBAC.Role#getLogRole
	 * @model opposite="logRole" required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link gemRBAC.History#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Object#getLogObject <em>Log Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(gemRBAC.Object)
	 * @see gemRBAC.GemRBACPackage#getHistory_Object()
	 * @see gemRBAC.Object#getLogObject
	 * @model opposite="logObject" required="true"
	 * @generated
	 */
	gemRBAC.Object getObject();

	/**
	 * Sets the value of the '{@link gemRBAC.History#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(gemRBAC.Object value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Operation#getLogOperation <em>Log Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' reference.
	 * @see #setOp(Operation)
	 * @see gemRBAC.GemRBACPackage#getHistory_Op()
	 * @see gemRBAC.Operation#getLogOperation
	 * @model opposite="logOperation" required="true"
	 * @generated
	 */
	Operation getOp();

	/**
	 * Sets the value of the '{@link gemRBAC.History#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Operation value);

	/**
	 * Returns the value of the '<em><b>Permission</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Permission#getLogPermission <em>Log Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' reference.
	 * @see #setPermission(Permission)
	 * @see gemRBAC.GemRBACPackage#getHistory_Permission()
	 * @see gemRBAC.Permission#getLogPermission
	 * @model opposite="logPermission" required="true"
	 * @generated
	 */
	Permission getPermission();

	/**
	 * Sets the value of the '{@link gemRBAC.History#getPermission <em>Permission</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission</em>' reference.
	 * @see #getPermission()
	 * @generated
	 */
	void setPermission(Permission value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.RBACContext}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.RBACContext#getLogContext <em>Log Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getHistory_Context()
	 * @see gemRBAC.RBACContext#getLogContext
	 * @model opposite="logContext" required="true" upper="2"
	 * @generated
	 */
	EList<RBACContext> getContext();

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.User#getUserLog <em>User Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see gemRBAC.GemRBACPackage#getHistory_User()
	 * @see gemRBAC.User#getUserLog
	 * @model opposite="userLog" required="true"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link gemRBAC.History#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

} // History
