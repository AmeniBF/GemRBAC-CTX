/**
 */
package gemRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.Object#getIdObject <em>Id Object</em>}</li>
 *   <li>{@link gemRBAC.Object#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gemRBAC.Object#getLogObject <em>Log Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Object</em>' attribute.
	 * @see #setIdObject(String)
	 * @see gemRBAC.GemRBACPackage#getObject_IdObject()
	 * @model id="true"
	 * @generated
	 */
	String getIdObject();

	/**
	 * Sets the value of the '{@link gemRBAC.Object#getIdObject <em>Id Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Object</em>' attribute.
	 * @see #getIdObject()
	 * @generated
	 */
	void setIdObject(String value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Permission}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Permission#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getObject_Permissions()
	 * @see gemRBAC.Permission#getObject
	 * @model opposite="object"
	 * @generated
	 */
	EList<Permission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Log Object</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.History}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.History#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Object</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Object</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getObject_LogObject()
	 * @see gemRBAC.History#getObject
	 * @model opposite="object"
	 * @generated
	 */
	EList<History> getLogObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<History> accessHistory();

} // Object
