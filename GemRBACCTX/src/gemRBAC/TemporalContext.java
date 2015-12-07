/**
 */
package gemRBAC;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.TemporalContext#getTimeexpression <em>Timeexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getTemporalContext()
 * @model
 * @generated
 */
public interface TemporalContext extends RBACContext {
	/**
	 * Returns the value of the '<em><b>Timeexpression</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.TimeExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeexpression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeexpression</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getTemporalContext_Timeexpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TimeExpression> getTimeexpression();

} // TemporalContext
