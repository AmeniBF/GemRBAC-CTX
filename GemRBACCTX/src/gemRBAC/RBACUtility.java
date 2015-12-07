/**
 */
package gemRBAC;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RBAC Utility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.RBACUtility#getMaxPermission <em>Max Permission</em>}</li>
 *   <li>{@link gemRBAC.RBACUtility#getMaxActiveRole <em>Max Active Role</em>}</li>
 *   <li>{@link gemRBAC.RBACUtility#getMaxRole <em>Max Role</em>}</li>
 *   <li>{@link gemRBAC.RBACUtility#getBusinessTaskList <em>Business Task List</em>}</li>
 *   <li>{@link gemRBAC.RBACUtility#getBoundedPermissions <em>Bounded Permissions</em>}</li>
 *   <li>{@link gemRBAC.RBACUtility#getCurrentT <em>Current T</em>}</li>
 *   <li>{@link gemRBAC.RBACUtility#getCurrentDay <em>Current Day</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getRBACUtility()
 * @model
 * @generated
 */
public interface RBACUtility extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Permission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Permission</em>' attribute.
	 * @see #setMaxPermission(int)
	 * @see gemRBAC.GemRBACPackage#getRBACUtility_MaxPermission()
	 * @model
	 * @generated
	 */
	int getMaxPermission();

	/**
	 * Sets the value of the '{@link gemRBAC.RBACUtility#getMaxPermission <em>Max Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Permission</em>' attribute.
	 * @see #getMaxPermission()
	 * @generated
	 */
	void setMaxPermission(int value);

	/**
	 * Returns the value of the '<em><b>Max Active Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Active Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Active Role</em>' attribute.
	 * @see #setMaxActiveRole(int)
	 * @see gemRBAC.GemRBACPackage#getRBACUtility_MaxActiveRole()
	 * @model
	 * @generated
	 */
	int getMaxActiveRole();

	/**
	 * Sets the value of the '{@link gemRBAC.RBACUtility#getMaxActiveRole <em>Max Active Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Active Role</em>' attribute.
	 * @see #getMaxActiveRole()
	 * @generated
	 */
	void setMaxActiveRole(int value);

	/**
	 * Returns the value of the '<em><b>Max Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Role</em>' attribute.
	 * @see #setMaxRole(int)
	 * @see gemRBAC.GemRBACPackage#getRBACUtility_MaxRole()
	 * @model
	 * @generated
	 */
	int getMaxRole();

	/**
	 * Sets the value of the '{@link gemRBAC.RBACUtility#getMaxRole <em>Max Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Role</em>' attribute.
	 * @see #getMaxRole()
	 * @generated
	 */
	void setMaxRole(int value);

	/**
	 * Returns the value of the '<em><b>Business Task List</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Task List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Task List</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getRBACUtility_BusinessTaskList()
	 * @model
	 * @generated
	 */
	EList<Operation> getBusinessTaskList();

	/**
	 * Returns the value of the '<em><b>Bounded Permissions</b></em>' reference list.
	 * The list contents are of type {@link gemRBAC.Permission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounded Permissions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounded Permissions</em>' reference list.
	 * @see gemRBAC.GemRBACPackage#getRBACUtility_BoundedPermissions()
	 * @model
	 * @generated
	 */
	EList<Permission> getBoundedPermissions();

	/**
	 * Returns the value of the '<em><b>Current T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current T</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current T</em>' reference.
	 * @see #setCurrentT(TimePoint)
	 * @see gemRBAC.GemRBACPackage#getRBACUtility_CurrentT()
	 * @model
	 * @generated
	 */
	TimePoint getCurrentT();

	/**
	 * Sets the value of the '{@link gemRBAC.RBACUtility#getCurrentT <em>Current T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current T</em>' reference.
	 * @see #getCurrentT()
	 * @generated
	 */
	void setCurrentT(TimePoint value);

	/**
	 * Returns the value of the '<em><b>Current Day</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Day</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Day</em>' reference.
	 * @see #setCurrentDay(RelativeTimePoint)
	 * @see gemRBAC.GemRBACPackage#getRBACUtility_CurrentDay()
	 * @model
	 * @generated
	 */
	RelativeTimePoint getCurrentDay();

	/**
	 * Sets the value of the '{@link gemRBAC.RBACUtility#getCurrentDay <em>Current Day</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Day</em>' reference.
	 * @see #getCurrentDay()
	 * @generated
	 */
	void setCurrentDay(RelativeTimePoint value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	EList<Permission> getBoundPermission();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Date getCurrentDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t        self.currentT '"
	 * @generated
	 */
	TimePoint getCurrentTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.currentDay'"
	 * @generated
	 */
	RelativeTimePoint getDayOfWeek();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ActivationDuration getCumulativeActiveDuration(Role r, User u, TimeUnitType unit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ActivationDuration getActiveDuration(Role r, TimeUnitType unit);

} // RBACUtility
