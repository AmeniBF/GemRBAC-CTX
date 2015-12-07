/**
 */
package gemRBAC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.TimeExpression#getAbsolute <em>Absolute</em>}</li>
 *   <li>{@link gemRBAC.TimeExpression#getRelative <em>Relative</em>}</li>
 *   <li>{@link gemRBAC.TimeExpression#getIdTimeExpr <em>Id Time Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getTimeExpression()
 * @model
 * @generated
 */
public interface TimeExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Absolute</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.AbsoluteTE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getTimeExpression_Absolute()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<AbsoluteTE> getAbsolute();

	/**
	 * Returns the value of the '<em><b>Relative</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.RelativeTE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getTimeExpression_Relative()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelativeTE> getRelative();

	/**
	 * Returns the value of the '<em><b>Id Time Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Time Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Time Expr</em>' attribute.
	 * @see #setIdTimeExpr(String)
	 * @see gemRBAC.GemRBACPackage#getTimeExpression_IdTimeExpr()
	 * @model id="true"
	 * @generated
	 */
	String getIdTimeExpr();

	/**
	 * Sets the value of the '{@link gemRBAC.TimeExpression#getIdTimeExpr <em>Id Time Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Time Expr</em>' attribute.
	 * @see #getIdTimeExpr()
	 * @generated
	 */
	void setIdTimeExpr(String value);

} // TimeExpression
