/**
 */
package gemRBAC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualitative Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.QualitativeDirection#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getQualitativeDirection()
 * @model
 * @generated
 */
public interface QualitativeDirection extends RelativeDirection {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link gemRBAC.QualitativeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see gemRBAC.QualitativeType
	 * @see #setDirection(QualitativeType)
	 * @see gemRBAC.GemRBACPackage#getQualitativeDirection_Direction()
	 * @model
	 * @generated
	 */
	QualitativeType getDirection();

	/**
	 * Sets the value of the '{@link gemRBAC.QualitativeDirection#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see gemRBAC.QualitativeType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(QualitativeType value);

} // QualitativeDirection
