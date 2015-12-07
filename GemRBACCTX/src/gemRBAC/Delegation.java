/**
 */
package gemRBAC;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.Delegation#getIdDelegation <em>Id Delegation</em>}</li>
 *   <li>{@link gemRBAC.Delegation#isIsRevoked <em>Is Revoked</em>}</li>
 *   <li>{@link gemRBAC.Delegation#getIsTransfer <em>Is Transfer</em>}</li>
 *   <li>{@link gemRBAC.Delegation#isIsTotal <em>Is Total</em>}</li>
 *   <li>{@link gemRBAC.Delegation#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link gemRBAC.Delegation#getEndDate <em>End Date</em>}</li>
 *   <li>{@link gemRBAC.Delegation#getDelegatorUser <em>Delegator User</em>}</li>
 *   <li>{@link gemRBAC.Delegation#getDelegateUser <em>Delegate User</em>}</li>
 *   <li>{@link gemRBAC.Delegation#getRevokingUser <em>Revoking User</em>}</li>
 *   <li>{@link gemRBAC.Delegation#getDelegatedDelegation <em>Delegated Delegation</em>}</li>
 *   <li>{@link gemRBAC.Delegation#getDelegatedPermissions <em>Delegated Permissions</em>}</li>
 *   <li>{@link gemRBAC.Delegation#getMaxDepth <em>Max Depth</em>}</li>
 *   <li>{@link gemRBAC.Delegation#getDelegatedRole <em>Delegated Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getDelegation()
 * @model
 * @generated
 */
public interface Delegation extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Delegation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Delegation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Delegation</em>' attribute.
	 * @see #setIdDelegation(String)
	 * @see gemRBAC.GemRBACPackage#getDelegation_IdDelegation()
	 * @model id="true"
	 * @generated
	 */
	String getIdDelegation();

	/**
	 * Sets the value of the '{@link gemRBAC.Delegation#getIdDelegation <em>Id Delegation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Delegation</em>' attribute.
	 * @see #getIdDelegation()
	 * @generated
	 */
	void setIdDelegation(String value);

	/**
	 * Returns the value of the '<em><b>Is Revoked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Revoked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Revoked</em>' attribute.
	 * @see #setIsRevoked(boolean)
	 * @see gemRBAC.GemRBACPackage#getDelegation_IsRevoked()
	 * @model
	 * @generated
	 */
	boolean isIsRevoked();

	/**
	 * Sets the value of the '{@link gemRBAC.Delegation#isIsRevoked <em>Is Revoked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Revoked</em>' attribute.
	 * @see #isIsRevoked()
	 * @generated
	 */
	void setIsRevoked(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Transfer</b></em>' attribute.
	 * The literals are from the enumeration {@link gemRBAC.delegationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Transfer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Transfer</em>' attribute.
	 * @see gemRBAC.delegationType
	 * @see #setIsTransfer(delegationType)
	 * @see gemRBAC.GemRBACPackage#getDelegation_IsTransfer()
	 * @model
	 * @generated
	 */
	delegationType getIsTransfer();

	/**
	 * Sets the value of the '{@link gemRBAC.Delegation#getIsTransfer <em>Is Transfer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Transfer</em>' attribute.
	 * @see gemRBAC.delegationType
	 * @see #getIsTransfer()
	 * @generated
	 */
	void setIsTransfer(delegationType value);

	/**
	 * Returns the value of the '<em><b>Is Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Total</em>' attribute.
	 * @see #setIsTotal(boolean)
	 * @see gemRBAC.GemRBACPackage#getDelegation_IsTotal()
	 * @model
	 * @generated
	 */
	boolean isIsTotal();

	/**
	 * Sets the value of the '{@link gemRBAC.Delegation#isIsTotal <em>Is Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Total</em>' attribute.
	 * @see #isIsTotal()
	 * @generated
	 */
	void setIsTotal(boolean value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see gemRBAC.GemRBACPackage#getDelegation_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link gemRBAC.Delegation#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see gemRBAC.GemRBACPackage#getDelegation_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link gemRBAC.Delegation#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Delegator User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.User#getDelegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegator User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegator User</em>' reference.
	 * @see #setDelegatorUser(User)
	 * @see gemRBAC.GemRBACPackage#getDelegation_DelegatorUser()
	 * @see gemRBAC.User#getDelegation
	 * @model opposite="delegation" required="true"
	 * @generated
	 */
	User getDelegatorUser();

	/**
	 * Sets the value of the '{@link gemRBAC.Delegation#getDelegatorUser <em>Delegator User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegator User</em>' reference.
	 * @see #getDelegatorUser()
	 * @generated
	 */
	void setDelegatorUser(User value);

	/**
	 * Returns the value of the '<em><b>Delegate User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.User#getRecieveddelegation <em>Recieveddelegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegate User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegate User</em>' reference.
	 * @see #setDelegateUser(User)
	 * @see gemRBAC.GemRBACPackage#getDelegation_DelegateUser()
	 * @see gemRBAC.User#getRecieveddelegation
	 * @model opposite="recieveddelegation" required="true"
	 * @generated
	 */
	User getDelegateUser();

	/**
	 * Sets the value of the '{@link gemRBAC.Delegation#getDelegateUser <em>Delegate User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate User</em>' reference.
	 * @see #getDelegateUser()
	 * @generated
	 */
	void setDelegateUser(User value);

	/**
	 * Returns the value of the '<em><b>Revoking User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.User#getRevocation <em>Revocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revoking User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revoking User</em>' reference.
	 * @see #setRevokingUser(User)
	 * @see gemRBAC.GemRBACPackage#getDelegation_RevokingUser()
	 * @see gemRBAC.User#getRevocation
	 * @model opposite="revocation"
	 * @generated
	 */
	User getRevokingUser();

	/**
	 * Sets the value of the '{@link gemRBAC.Delegation#getRevokingUser <em>Revoking User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revoking User</em>' reference.
	 * @see #getRevokingUser()
	 * @generated
	 */
	void setRevokingUser(User value);

	/**
	 * Returns the value of the '<em><b>Delegated Delegation</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Delegation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegated Delegation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegated Delegation</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getDelegation_DelegatedDelegation()
	 * @model
	 * @generated
	 */
	EList<Delegation> getDelegatedDelegation();

	/**
	 * Returns the value of the '<em><b>Delegated Permissions</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Permission}.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Permission#getDelegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegated Permissions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegated Permissions</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getDelegation_DelegatedPermissions()
	 * @see gemRBAC.Permission#getDelegation
	 * @model opposite="delegation" required="true"
	 * @generated
	 */
	EList<Permission> getDelegatedPermissions();

	/**
	 * Returns the value of the '<em><b>Max Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Depth</em>' attribute.
	 * @see #setMaxDepth(int)
	 * @see gemRBAC.GemRBACPackage#getDelegation_MaxDepth()
	 * @model
	 * @generated
	 */
	int getMaxDepth();

	/**
	 * Sets the value of the '{@link gemRBAC.Delegation#getMaxDepth <em>Max Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Depth</em>' attribute.
	 * @see #getMaxDepth()
	 * @generated
	 */
	void setMaxDepth(int value);

	/**
	 * Returns the value of the '<em><b>Delegated Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gemRBAC.Role#getDelegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegated Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegated Role</em>' reference.
	 * @see #setDelegatedRole(Role)
	 * @see gemRBAC.GemRBACPackage#getDelegation_DelegatedRole()
	 * @see gemRBAC.Role#getDelegation
	 * @model opposite="delegation" required="true"
	 * @generated
	 */
	Role getDelegatedRole();

	/**
	 * Sets the value of the '{@link gemRBAC.Delegation#getDelegatedRole <em>Delegated Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegated Role</em>' reference.
	 * @see #getDelegatedRole()
	 * @generated
	 */
	void setDelegatedRole(Role value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void revoke();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Delegation> getAbsoluteDelegationPath();

} // Delegation
