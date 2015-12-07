/**
 */
package gemRBAC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Day Of Week</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.DayOfWeek#getDay <em>Day</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getDayOfWeek()
 * @model
 * @generated
 */
public interface DayOfWeek extends RelativeTimePoint {
	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * The literals are from the enumeration {@link gemRBAC.DayType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see gemRBAC.DayType
	 * @see #setDay(DayType)
	 * @see gemRBAC.GemRBACPackage#getDayOfWeek_Day()
	 * @model
	 * @generated
	 */
	DayType getDay();

	/**
	 * Sets the value of the '{@link gemRBAC.DayOfWeek#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see gemRBAC.DayType
	 * @see #getDay()
	 * @generated
	 */
	void setDay(DayType value);

} // DayOfWeek
