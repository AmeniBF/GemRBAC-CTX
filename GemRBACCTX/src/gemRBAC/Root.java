/**
 */
package gemRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.Root#getSys <em>Sys</em>}</li>
 *   <li>{@link gemRBAC.Root#getObj <em>Obj</em>}</li>
 *   <li>{@link gemRBAC.Root#getOp <em>Op</em>}</li>
 *   <li>{@link gemRBAC.Root#getC <em>C</em>}</li>
 *   <li>{@link gemRBAC.Root#getP <em>P</em>}</li>
 *   <li>{@link gemRBAC.Root#getR <em>R</em>}</li>
 *   <li>{@link gemRBAC.Root#getS <em>S</em>}</li>
 *   <li>{@link gemRBAC.Root#getU <em>U</em>}</li>
 *   <li>{@link gemRBAC.Root#getD <em>D</em>}</li>
 *   <li>{@link gemRBAC.Root#getLog <em>Log</em>}</li>
 *   <li>{@link gemRBAC.Root#getDur <em>Dur</em>}</li>
 *   <li>{@link gemRBAC.Root#getPeriod <em>Period</em>}</li>
 *   <li>{@link gemRBAC.Root#getRloc <em>Rloc</em>}</li>
 *   <li>{@link gemRBAC.Root#getRd <em>Rd</em>}</li>
 *   <li>{@link gemRBAC.Root#getLoc <em>Loc</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Sys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sys</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys</em>' containment reference.
	 * @see #setSys(RBACUtility)
	 * @see gemRBAC.GemRBACPackage#getRoot_Sys()
	 * @model containment="true"
	 * @generated
	 */
	RBACUtility getSys();

	/**
	 * Sets the value of the '{@link gemRBAC.Root#getSys <em>Sys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys</em>' containment reference.
	 * @see #getSys()
	 * @generated
	 */
	void setSys(RBACUtility value);

	/**
	 * Returns the value of the '<em><b>Obj</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getRoot_Obj()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<gemRBAC.Object> getObj();

	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getRoot_Op()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operation> getOp();

	/**
	 * Returns the value of the '<em><b>C</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.RBACContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getRoot_C()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RBACContext> getC();

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.Permission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getRoot_P()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Permission> getP();

	/**
	 * Returns the value of the '<em><b>R</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getRoot_R()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Role> getR();

	/**
	 * Returns the value of the '<em><b>S</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.Session}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getRoot_S()
	 * @model containment="true"
	 * @generated
	 */
	EList<Session> getS();

	/**
	 * Returns the value of the '<em><b>U</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>U</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getRoot_U()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<User> getU();

	/**
	 * Returns the value of the '<em><b>D</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.Delegation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getRoot_D()
	 * @model containment="true"
	 * @generated
	 */
	EList<Delegation> getD();

	/**
	 * Returns the value of the '<em><b>Log</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.History}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getRoot_Log()
	 * @model containment="true"
	 * @generated
	 */
	EList<History> getLog();

	/**
	 * Returns the value of the '<em><b>Dur</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.ActivationDuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dur</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getRoot_Dur()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivationDuration> getDur();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.PeriodicTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getRoot_Period()
	 * @model containment="true"
	 * @generated
	 */
	EList<PeriodicTime> getPeriod();

	/**
	 * Returns the value of the '<em><b>Rloc</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.RelativeLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rloc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rloc</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getRoot_Rloc()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelativeLocation> getRloc();

	/**
	 * Returns the value of the '<em><b>Rd</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.RelativeDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rd</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rd</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getRoot_Rd()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelativeDirection> getRd();

	/**
	 * Returns the value of the '<em><b>Loc</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loc</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getRoot_Loc()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLoc();

} // Root
