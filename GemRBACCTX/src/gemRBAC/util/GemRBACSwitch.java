/**
 */
package gemRBAC.util;

import gemRBAC.AbsoluteTE;
import gemRBAC.ActivationDuration;
import gemRBAC.CardinalDirection;
import gemRBAC.Circle;
import gemRBAC.ComposedRelativeTE;
import gemRBAC.DayOfMonth;
import gemRBAC.DayOfWeek;
import gemRBAC.Delegation;
import gemRBAC.GemRBACPackage;
import gemRBAC.History;
import gemRBAC.HourOfDay;
import gemRBAC.Location;
import gemRBAC.LogicalLocation;
import gemRBAC.MonthOfYear;
import gemRBAC.Operation;
import gemRBAC.PeriodicTime;
import gemRBAC.Permission;
import gemRBAC.PhysicalLocation;
import gemRBAC.Point;
import gemRBAC.Polygon;
import gemRBAC.Polyline;
import gemRBAC.QualitativeDirection;
import gemRBAC.RBACContext;
import gemRBAC.RBACUtility;
import gemRBAC.RelativeDirection;
import gemRBAC.RelativeLocation;
import gemRBAC.RelativeTE;
import gemRBAC.RelativeTimeInterval;
import gemRBAC.RelativeTimePoint;
import gemRBAC.Role;
import gemRBAC.Root;
import gemRBAC.Session;
import gemRBAC.SpatialContext;
import gemRBAC.TemporalContext;
import gemRBAC.TimeExpression;
import gemRBAC.TimeInterval;
import gemRBAC.TimePoint;
import gemRBAC.User;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gemRBAC.GemRBACPackage
 * @generated
 */
public class GemRBACSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GemRBACPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GemRBACSwitch() {
		if (modelPackage == null) {
			modelPackage = GemRBACPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GemRBACPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.SESSION: {
				Session session = (Session)theEObject;
				T result = caseSession(session);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.PERMISSION: {
				Permission permission = (Permission)theEObject;
				T result = casePermission(permission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.OBJECT: {
				gemRBAC.Object object = (gemRBAC.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.RBAC_CONTEXT: {
				RBACContext rbacContext = (RBACContext)theEObject;
				T result = caseRBACContext(rbacContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.TIME_EXPRESSION: {
				TimeExpression timeExpression = (TimeExpression)theEObject;
				T result = caseTimeExpression(timeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.SPATIAL_CONTEXT: {
				SpatialContext spatialContext = (SpatialContext)theEObject;
				T result = caseSpatialContext(spatialContext);
				if (result == null) result = caseRBACContext(spatialContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.DELEGATION: {
				Delegation delegation = (Delegation)theEObject;
				T result = caseDelegation(delegation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.HISTORY: {
				History history = (History)theEObject;
				T result = caseHistory(history);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.RBAC_UTILITY: {
				RBACUtility rbacUtility = (RBACUtility)theEObject;
				T result = caseRBACUtility(rbacUtility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.ABSOLUTE_TE: {
				AbsoluteTE absoluteTE = (AbsoluteTE)theEObject;
				T result = caseAbsoluteTE(absoluteTE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.RELATIVE_TE: {
				RelativeTE relativeTE = (RelativeTE)theEObject;
				T result = caseRelativeTE(relativeTE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.ACTIVATION_DURATION: {
				ActivationDuration activationDuration = (ActivationDuration)theEObject;
				T result = caseActivationDuration(activationDuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.TIME_POINT: {
				TimePoint timePoint = (TimePoint)theEObject;
				T result = caseTimePoint(timePoint);
				if (result == null) result = caseAbsoluteTE(timePoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.TIME_INTERVAL: {
				TimeInterval timeInterval = (TimeInterval)theEObject;
				T result = caseTimeInterval(timeInterval);
				if (result == null) result = caseAbsoluteTE(timeInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.COMPOSED_RELATIVE_TE: {
				ComposedRelativeTE composedRelativeTE = (ComposedRelativeTE)theEObject;
				T result = caseComposedRelativeTE(composedRelativeTE);
				if (result == null) result = caseRelativeTE(composedRelativeTE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.RELATIVE_TIME_INTERVAL: {
				RelativeTimeInterval relativeTimeInterval = (RelativeTimeInterval)theEObject;
				T result = caseRelativeTimeInterval(relativeTimeInterval);
				if (result == null) result = caseComposedRelativeTE(relativeTimeInterval);
				if (result == null) result = caseRelativeTE(relativeTimeInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.RELATIVE_TIME_POINT: {
				RelativeTimePoint relativeTimePoint = (RelativeTimePoint)theEObject;
				T result = caseRelativeTimePoint(relativeTimePoint);
				if (result == null) result = caseComposedRelativeTE(relativeTimePoint);
				if (result == null) result = caseRelativeTE(relativeTimePoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.DAY_OF_WEEK: {
				DayOfWeek dayOfWeek = (DayOfWeek)theEObject;
				T result = caseDayOfWeek(dayOfWeek);
				if (result == null) result = caseRelativeTimePoint(dayOfWeek);
				if (result == null) result = caseComposedRelativeTE(dayOfWeek);
				if (result == null) result = caseRelativeTE(dayOfWeek);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.DAY_OF_MONTH: {
				DayOfMonth dayOfMonth = (DayOfMonth)theEObject;
				T result = caseDayOfMonth(dayOfMonth);
				if (result == null) result = caseRelativeTimePoint(dayOfMonth);
				if (result == null) result = caseComposedRelativeTE(dayOfMonth);
				if (result == null) result = caseRelativeTE(dayOfMonth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.MONTH_OF_YEAR: {
				MonthOfYear monthOfYear = (MonthOfYear)theEObject;
				T result = caseMonthOfYear(monthOfYear);
				if (result == null) result = caseRelativeTimePoint(monthOfYear);
				if (result == null) result = caseComposedRelativeTE(monthOfYear);
				if (result == null) result = caseRelativeTE(monthOfYear);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.HOUR_OF_DAY: {
				HourOfDay hourOfDay = (HourOfDay)theEObject;
				T result = caseHourOfDay(hourOfDay);
				if (result == null) result = caseRelativeTimePoint(hourOfDay);
				if (result == null) result = caseComposedRelativeTE(hourOfDay);
				if (result == null) result = caseRelativeTE(hourOfDay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.PERIODIC_TIME: {
				PeriodicTime periodicTime = (PeriodicTime)theEObject;
				T result = casePeriodicTime(periodicTime);
				if (result == null) result = caseRelativeTE(periodicTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.RELATIVE_LOCATION: {
				RelativeLocation relativeLocation = (RelativeLocation)theEObject;
				T result = caseRelativeLocation(relativeLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.PHYSICAL_LOCATION: {
				PhysicalLocation physicalLocation = (PhysicalLocation)theEObject;
				T result = casePhysicalLocation(physicalLocation);
				if (result == null) result = caseLocation(physicalLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.LOGICAL_LOCATION: {
				LogicalLocation logicalLocation = (LogicalLocation)theEObject;
				T result = caseLogicalLocation(logicalLocation);
				if (result == null) result = caseLocation(logicalLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = casePhysicalLocation(point);
				if (result == null) result = caseLocation(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.POLYGON: {
				Polygon polygon = (Polygon)theEObject;
				T result = casePolygon(polygon);
				if (result == null) result = casePhysicalLocation(polygon);
				if (result == null) result = caseLocation(polygon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.CIRCLE: {
				Circle circle = (Circle)theEObject;
				T result = caseCircle(circle);
				if (result == null) result = casePhysicalLocation(circle);
				if (result == null) result = caseLocation(circle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.POLYLINE: {
				Polyline polyline = (Polyline)theEObject;
				T result = casePolyline(polyline);
				if (result == null) result = casePhysicalLocation(polyline);
				if (result == null) result = caseLocation(polyline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.RELATIVE_DIRECTION: {
				RelativeDirection relativeDirection = (RelativeDirection)theEObject;
				T result = caseRelativeDirection(relativeDirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.CARDINAL_DIRECTION: {
				CardinalDirection cardinalDirection = (CardinalDirection)theEObject;
				T result = caseCardinalDirection(cardinalDirection);
				if (result == null) result = caseRelativeDirection(cardinalDirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.QUALITATIVE_DIRECTION: {
				QualitativeDirection qualitativeDirection = (QualitativeDirection)theEObject;
				T result = caseQualitativeDirection(qualitativeDirection);
				if (result == null) result = caseRelativeDirection(qualitativeDirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemRBACPackage.TEMPORAL_CONTEXT: {
				TemporalContext temporalContext = (TemporalContext)theEObject;
				T result = caseTemporalContext(temporalContext);
				if (result == null) result = caseRBACContext(temporalContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSession(Session object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermission(Permission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(gemRBAC.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RBAC Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RBAC Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRBACContext(RBACContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeExpression(TimeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spatial Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spatial Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpatialContext(SpatialContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegation(Delegation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistory(History object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RBAC Utility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RBAC Utility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRBACUtility(RBACUtility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absolute TE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absolute TE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsoluteTE(AbsoluteTE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative TE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative TE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeTE(RelativeTE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivationDuration(ActivationDuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePoint(TimePoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeInterval(TimeInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composed Relative TE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composed Relative TE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposedRelativeTE(ComposedRelativeTE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Time Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeTimeInterval(RelativeTimeInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Time Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Time Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeTimePoint(RelativeTimePoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Day Of Week</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Day Of Week</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDayOfWeek(DayOfWeek object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Day Of Month</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Day Of Month</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDayOfMonth(DayOfMonth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Month Of Year</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Month Of Year</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonthOfYear(MonthOfYear object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hour Of Day</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hour Of Day</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHourOfDay(HourOfDay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicTime(PeriodicTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeLocation(RelativeLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalLocation(PhysicalLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalLocation(LogicalLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygon(Polygon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircle(Circle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polyline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polyline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolyline(Polyline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeDirection(RelativeDirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinal Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinal Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalDirection(CardinalDirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualitative Direction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualitative Direction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualitativeDirection(QualitativeDirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalContext(TemporalContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GemRBACSwitch
