/**
 */
package gemRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.Operation#getIdOperation <em>Id Operation</em>}</li>
 *   <li>{@link gemRBAC.Operation#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gemRBAC.Operation#getLogOperation <em>Log Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Operation</em>' attribute.
	 * @see #setIdOperation(String)
	 * @see gemRBAC.GemRBACPackage#getOperation_IdOperation()
	 * @model id="true"
	 * @generated
	 */
	String getIdOperation();

	/**
	 * Sets the value of the '{@link gemRBAC.Operation#getIdOperation <em>Id Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Operation</em>' attribute.
	 * @see #getIdOperation()
	 * @generated
	 */
	void setIdOperation(String value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Permission}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Permission#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getOperation_Permissions()
	 * @see gemRBAC.Permission#getOperations
	 * @model opposite="operations" required="true"
	 * @generated
	 */
	EList<Permission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Log Operation</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.History}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.History#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Operation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Operation</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getOperation_LogOperation()
	 * @see gemRBAC.History#getOp
	 * @model opposite="op"
	 * @generated
	 */
	EList<History> getLogOperation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<History> accessHistory();

} // Operation
