/**
 */
package gemRBAC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.PeriodicTime#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link gemRBAC.PeriodicTime#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link gemRBAC.PeriodicTime#getIdPeriodicTime <em>Id Periodic Time</em>}</li>
 *   <li>{@link gemRBAC.PeriodicTime#getNextStart <em>Next Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getPeriodicTime()
 * @model
 * @generated
 */
public interface PeriodicTime extends RelativeTE {
	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(int)
	 * @see gemRBAC.GemRBACPackage#getPeriodicTime_Frequency()
	 * @model
	 * @generated
	 */
	int getFrequency();

	/**
	 * Sets the value of the '{@link gemRBAC.PeriodicTime#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(int value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link gemRBAC.TimeUnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see gemRBAC.TimeUnitType
	 * @see #setTimeUnit(TimeUnitType)
	 * @see gemRBAC.GemRBACPackage#getPeriodicTime_TimeUnit()
	 * @model
	 * @generated
	 */
	TimeUnitType getTimeUnit();

	/**
	 * Sets the value of the '{@link gemRBAC.PeriodicTime#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see gemRBAC.TimeUnitType
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(TimeUnitType value);

	/**
	 * Returns the value of the '<em><b>Id Periodic Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Periodic Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Periodic Time</em>' attribute.
	 * @see #setIdPeriodicTime(String)
	 * @see gemRBAC.GemRBACPackage#getPeriodicTime_IdPeriodicTime()
	 * @model
	 * @generated
	 */
	String getIdPeriodicTime();

	/**
	 * Sets the value of the '{@link gemRBAC.PeriodicTime#getIdPeriodicTime <em>Id Periodic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Periodic Time</em>' attribute.
	 * @see #getIdPeriodicTime()
	 * @generated
	 */
	void setIdPeriodicTime(String value);

	/**
	 * Returns the value of the '<em><b>Next Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Start</em>' containment reference.
	 * @see #setNextStart(TimePoint)
	 * @see gemRBAC.GemRBACPackage#getPeriodicTime_NextStart()
	 * @model containment="true"
	 * @generated
	 */
	TimePoint getNextStart();

	/**
	 * Sets the value of the '{@link gemRBAC.PeriodicTime#getNextStart <em>Next Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Start</em>' containment reference.
	 * @see #getNextStart()
	 * @generated
	 */
	void setNextStart(TimePoint value);

} // PeriodicTime
