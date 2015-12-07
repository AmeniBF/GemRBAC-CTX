/**
 */
package gemRBAC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinal Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.CardinalDirection#getDirection <em>Direction</em>}</li>
 *   <li>{@link gemRBAC.CardinalDirection#getAngle <em>Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getCardinalDirection()
 * @model
 * @generated
 */
public interface CardinalDirection extends RelativeDirection {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link gemRBAC.CardinalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see gemRBAC.CardinalType
	 * @see #setDirection(CardinalType)
	 * @see gemRBAC.GemRBACPackage#getCardinalDirection_Direction()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='Polyline'"
	 * @generated
	 */
	CardinalType getDirection();

	/**
	 * Sets the value of the '{@link gemRBAC.CardinalDirection#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see gemRBAC.CardinalType
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(CardinalType value);

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(double)
	 * @see gemRBAC.GemRBACPackage#getCardinalDirection_Angle()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='Polyline'"
	 * @generated
	 */
	double getAngle();

	/**
	 * Sets the value of the '{@link gemRBAC.CardinalDirection#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(double value);

} // CardinalDirection
