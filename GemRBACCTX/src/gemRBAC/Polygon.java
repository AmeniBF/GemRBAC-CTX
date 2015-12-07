/**
 */
package gemRBAC;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gemRBAC.Polygon#getSegment <em>Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see gemRBAC.GemRBACPackage#getPolygon()
 * @model
 * @generated
 */
public interface Polygon extends PhysicalLocation {
	/**
	 * Returns the value of the '<em><b>Segment</b></em>' containment reference list.
	 * The list contents are of type {@link gemRBAC.Polyline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment</em>' containment reference list.
	 * @see gemRBAC.GemRBACPackage#getPolygon_Segment()
	 * @model containment="true" lower="3"
	 * @generated
	 */
	EList<Polyline> getSegment();

} // Polygon
