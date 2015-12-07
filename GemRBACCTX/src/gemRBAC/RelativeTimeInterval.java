/**
 */
package gemRBAC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Time Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.RelativeTimeInterval#getStart <em>Start</em>}</li>
 *   <li>{@link gemRBAC.RelativeTimeInterval#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getRelativeTimeInterval()
 * @model
 * @generated
 */
public interface RelativeTimeInterval extends ComposedRelativeTE {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(RelativeTimePoint)
	 * @see gemRBAC.GemRBACPackage#getRelativeTimeInterval_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RelativeTimePoint getStart();

	/**
	 * Sets the value of the '{@link gemRBAC.RelativeTimeInterval#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(RelativeTimePoint value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(RelativeTimePoint)
	 * @see gemRBAC.GemRBACPackage#getRelativeTimeInterval_End()
	 * @model containment="true"
	 * @generated
	 */
	RelativeTimePoint getEnd();

	/**
	 * Sets the value of the '{@link gemRBAC.RelativeTimeInterval#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(RelativeTimePoint value);

} // RelativeTimeInterval
