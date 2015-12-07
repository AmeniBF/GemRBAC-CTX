/**
 */
package gemRBAC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.TimeInterval#getStart <em>Start</em>}</li>
 *   <li>{@link gemRBAC.TimeInterval#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getTimeInterval()
 * @model
 * @generated
 */
public interface TimeInterval extends AbsoluteTE {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(TimePoint)
	 * @see gemRBAC.GemRBACPackage#getTimeInterval_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimePoint getStart();

	/**
	 * Sets the value of the '{@link gemRBAC.TimeInterval#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(TimePoint value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(TimePoint)
	 * @see gemRBAC.GemRBACPackage#getTimeInterval_End()
	 * @model containment="true"
	 * @generated
	 */
	TimePoint getEnd();

	/**
	 * Sets the value of the '{@link gemRBAC.TimeInterval#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(TimePoint value);

} // TimeInterval
