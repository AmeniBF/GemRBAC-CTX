/**
 */
package gemRBAC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hour Of Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.HourOfDay#getHour <em>Hour</em>}</li>
 *   <li>{@link gemRBAC.HourOfDay#getMinute <em>Minute</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getHourOfDay()
 * @model
 * @generated
 */
public interface HourOfDay extends RelativeTimePoint {
	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hour</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(int)
	 * @see gemRBAC.GemRBACPackage#getHourOfDay_Hour()
	 * @model
	 * @generated
	 */
	int getHour();

	/**
	 * Sets the value of the '{@link gemRBAC.HourOfDay#getHour <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' attribute.
	 * @see #getHour()
	 * @generated
	 */
	void setHour(int value);

	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(int)
	 * @see gemRBAC.GemRBACPackage#getHourOfDay_Minute()
	 * @model
	 * @generated
	 */
	int getMinute();

	/**
	 * Sets the value of the '{@link gemRBAC.HourOfDay#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(int value);

} // HourOfDay
