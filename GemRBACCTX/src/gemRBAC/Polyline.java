/**
 */
package gemRBAC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polyline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.Polyline#getStart <em>Start</em>}</li>
 *   <li>{@link gemRBAC.Polyline#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getPolyline()
 * @model
 * @generated
 */
public interface Polyline extends PhysicalLocation {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Point)
	 * @see gemRBAC.GemRBACPackage#getPolyline_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getStart();

	/**
	 * Sets the value of the '{@link gemRBAC.Polyline#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Point value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Point)
	 * @see gemRBAC.GemRBACPackage#getPolyline_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getEnd();

	/**
	 * Sets the value of the '{@link gemRBAC.Polyline#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Point value);

} // Polyline
