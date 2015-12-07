/**
 */
package gemRBAC;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.Point#getLong <em>Long</em>}</li>
 *   <li>{@link gemRBAC.Point#getLat <em>Lat</em>}</li>
 *   <li>{@link gemRBAC.Point#getAlt <em>Alt</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends PhysicalLocation {
	/**
	 * Returns the value of the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' attribute.
	 * @see #setLong(double)
	 * @see gemRBAC.GemRBACPackage#getPoint_Long()
	 * @model
	 * @generated
	 */
	double getLong();

	/**
	 * Sets the value of the '{@link gemRBAC.Point#getLong <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long</em>' attribute.
	 * @see #getLong()
	 * @generated
	 */
	void setLong(double value);

	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(double)
	 * @see gemRBAC.GemRBACPackage#getPoint_Lat()
	 * @model default="0.0"
	 * @generated
	 */
	double getLat();

	/**
	 * Sets the value of the '{@link gemRBAC.Point#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(double value);

	/**
	 * Returns the value of the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' attribute.
	 * @see #setAlt(double)
	 * @see gemRBAC.GemRBACPackage#getPoint_Alt()
	 * @model
	 * @generated
	 */
	double getAlt();

	/**
	 * Sets the value of the '{@link gemRBAC.Point#getAlt <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt</em>' attribute.
	 * @see #getAlt()
	 * @generated
	 */
	void setAlt(double value);

} // Point
