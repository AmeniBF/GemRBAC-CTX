/**
 */
package gemRBAC;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gemRBAC.GemRBACPackage
 * @generated
 */
public interface GemRBACFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GemRBACFactory eINSTANCE = gemRBAC.impl.GemRBACFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Session</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Session</em>'.
	 * @generated
	 */
	Session createSession();

	/**
	 * Returns a new object of class '<em>Permission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Permission</em>'.
	 * @generated
	 */
	Permission createPermission();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	Object createObject();

	/**
	 * Returns a new object of class '<em>Time Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Expression</em>'.
	 * @generated
	 */
	TimeExpression createTimeExpression();

	/**
	 * Returns a new object of class '<em>Spatial Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spatial Context</em>'.
	 * @generated
	 */
	SpatialContext createSpatialContext();

	/**
	 * Returns a new object of class '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegation</em>'.
	 * @generated
	 */
	Delegation createDelegation();

	/**
	 * Returns a new object of class '<em>History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History</em>'.
	 * @generated
	 */
	History createHistory();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>RBAC Utility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RBAC Utility</em>'.
	 * @generated
	 */
	RBACUtility createRBACUtility();

	/**
	 * Returns a new object of class '<em>Activation Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activation Duration</em>'.
	 * @generated
	 */
	ActivationDuration createActivationDuration();

	/**
	 * Returns a new object of class '<em>Time Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Point</em>'.
	 * @generated
	 */
	TimePoint createTimePoint();

	/**
	 * Returns a new object of class '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Interval</em>'.
	 * @generated
	 */
	TimeInterval createTimeInterval();

	/**
	 * Returns a new object of class '<em>Relative Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Time Interval</em>'.
	 * @generated
	 */
	RelativeTimeInterval createRelativeTimeInterval();

	/**
	 * Returns a new object of class '<em>Day Of Week</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Day Of Week</em>'.
	 * @generated
	 */
	DayOfWeek createDayOfWeek();

	/**
	 * Returns a new object of class '<em>Day Of Month</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Day Of Month</em>'.
	 * @generated
	 */
	DayOfMonth createDayOfMonth();

	/**
	 * Returns a new object of class '<em>Month Of Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Month Of Year</em>'.
	 * @generated
	 */
	MonthOfYear createMonthOfYear();

	/**
	 * Returns a new object of class '<em>Hour Of Day</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hour Of Day</em>'.
	 * @generated
	 */
	HourOfDay createHourOfDay();

	/**
	 * Returns a new object of class '<em>Periodic Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Time</em>'.
	 * @generated
	 */
	PeriodicTime createPeriodicTime();

	/**
	 * Returns a new object of class '<em>Relative Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Location</em>'.
	 * @generated
	 */
	RelativeLocation createRelativeLocation();

	/**
	 * Returns a new object of class '<em>Logical Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Location</em>'.
	 * @generated
	 */
	LogicalLocation createLogicalLocation();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polygon</em>'.
	 * @generated
	 */
	Polygon createPolygon();

	/**
	 * Returns a new object of class '<em>Circle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circle</em>'.
	 * @generated
	 */
	Circle createCircle();

	/**
	 * Returns a new object of class '<em>Polyline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polyline</em>'.
	 * @generated
	 */
	Polyline createPolyline();

	/**
	 * Returns a new object of class '<em>Cardinal Direction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinal Direction</em>'.
	 * @generated
	 */
	CardinalDirection createCardinalDirection();

	/**
	 * Returns a new object of class '<em>Qualitative Direction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualitative Direction</em>'.
	 * @generated
	 */
	QualitativeDirection createQualitativeDirection();

	/**
	 * Returns a new object of class '<em>Temporal Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Context</em>'.
	 * @generated
	 */
	TemporalContext createTemporalContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GemRBACPackage getGemRBACPackage();

} //GemRBACFactory
