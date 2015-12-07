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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gemRBAC.GemRBACPackage
 * @generated
 */
public class GemRBACAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GemRBACPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GemRBACAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GemRBACPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GemRBACSwitch<Adapter> modelSwitch =
		new GemRBACSwitch<Adapter>() {
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseSession(Session object) {
				return createSessionAdapter();
			}
			@Override
			public Adapter casePermission(Permission object) {
				return createPermissionAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseObject(gemRBAC.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseRBACContext(RBACContext object) {
				return createRBACContextAdapter();
			}
			@Override
			public Adapter caseTimeExpression(TimeExpression object) {
				return createTimeExpressionAdapter();
			}
			@Override
			public Adapter caseSpatialContext(SpatialContext object) {
				return createSpatialContextAdapter();
			}
			@Override
			public Adapter caseDelegation(Delegation object) {
				return createDelegationAdapter();
			}
			@Override
			public Adapter caseHistory(History object) {
				return createHistoryAdapter();
			}
			@Override
			public Adapter caseRoot(Root object) {
				return createRootAdapter();
			}
			@Override
			public Adapter caseRBACUtility(RBACUtility object) {
				return createRBACUtilityAdapter();
			}
			@Override
			public Adapter caseAbsoluteTE(AbsoluteTE object) {
				return createAbsoluteTEAdapter();
			}
			@Override
			public Adapter caseRelativeTE(RelativeTE object) {
				return createRelativeTEAdapter();
			}
			@Override
			public Adapter caseActivationDuration(ActivationDuration object) {
				return createActivationDurationAdapter();
			}
			@Override
			public Adapter caseTimePoint(TimePoint object) {
				return createTimePointAdapter();
			}
			@Override
			public Adapter caseTimeInterval(TimeInterval object) {
				return createTimeIntervalAdapter();
			}
			@Override
			public Adapter caseComposedRelativeTE(ComposedRelativeTE object) {
				return createComposedRelativeTEAdapter();
			}
			@Override
			public Adapter caseRelativeTimeInterval(RelativeTimeInterval object) {
				return createRelativeTimeIntervalAdapter();
			}
			@Override
			public Adapter caseRelativeTimePoint(RelativeTimePoint object) {
				return createRelativeTimePointAdapter();
			}
			@Override
			public Adapter caseDayOfWeek(DayOfWeek object) {
				return createDayOfWeekAdapter();
			}
			@Override
			public Adapter caseDayOfMonth(DayOfMonth object) {
				return createDayOfMonthAdapter();
			}
			@Override
			public Adapter caseMonthOfYear(MonthOfYear object) {
				return createMonthOfYearAdapter();
			}
			@Override
			public Adapter caseHourOfDay(HourOfDay object) {
				return createHourOfDayAdapter();
			}
			@Override
			public Adapter casePeriodicTime(PeriodicTime object) {
				return createPeriodicTimeAdapter();
			}
			@Override
			public Adapter caseRelativeLocation(RelativeLocation object) {
				return createRelativeLocationAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter casePhysicalLocation(PhysicalLocation object) {
				return createPhysicalLocationAdapter();
			}
			@Override
			public Adapter caseLogicalLocation(LogicalLocation object) {
				return createLogicalLocationAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter casePolygon(Polygon object) {
				return createPolygonAdapter();
			}
			@Override
			public Adapter caseCircle(Circle object) {
				return createCircleAdapter();
			}
			@Override
			public Adapter casePolyline(Polyline object) {
				return createPolylineAdapter();
			}
			@Override
			public Adapter caseRelativeDirection(RelativeDirection object) {
				return createRelativeDirectionAdapter();
			}
			@Override
			public Adapter caseCardinalDirection(CardinalDirection object) {
				return createCardinalDirectionAdapter();
			}
			@Override
			public Adapter caseQualitativeDirection(QualitativeDirection object) {
				return createQualitativeDirectionAdapter();
			}
			@Override
			public Adapter caseTemporalContext(TemporalContext object) {
				return createTemporalContextAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.Session
	 * @generated
	 */
	public Adapter createSessionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.Permission
	 * @generated
	 */
	public Adapter createPermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.RBACContext <em>RBAC Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.RBACContext
	 * @generated
	 */
	public Adapter createRBACContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.TimeExpression <em>Time Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.TimeExpression
	 * @generated
	 */
	public Adapter createTimeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.SpatialContext <em>Spatial Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.SpatialContext
	 * @generated
	 */
	public Adapter createSpatialContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.Delegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.Delegation
	 * @generated
	 */
	public Adapter createDelegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.History <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.History
	 * @generated
	 */
	public Adapter createHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.RBACUtility <em>RBAC Utility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.RBACUtility
	 * @generated
	 */
	public Adapter createRBACUtilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.AbsoluteTE <em>Absolute TE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.AbsoluteTE
	 * @generated
	 */
	public Adapter createAbsoluteTEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.RelativeTE <em>Relative TE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.RelativeTE
	 * @generated
	 */
	public Adapter createRelativeTEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.ActivationDuration <em>Activation Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.ActivationDuration
	 * @generated
	 */
	public Adapter createActivationDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.TimePoint <em>Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.TimePoint
	 * @generated
	 */
	public Adapter createTimePointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.TimeInterval
	 * @generated
	 */
	public Adapter createTimeIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.ComposedRelativeTE <em>Composed Relative TE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.ComposedRelativeTE
	 * @generated
	 */
	public Adapter createComposedRelativeTEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.RelativeTimeInterval <em>Relative Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.RelativeTimeInterval
	 * @generated
	 */
	public Adapter createRelativeTimeIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.RelativeTimePoint <em>Relative Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.RelativeTimePoint
	 * @generated
	 */
	public Adapter createRelativeTimePointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.DayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.DayOfWeek
	 * @generated
	 */
	public Adapter createDayOfWeekAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.DayOfMonth <em>Day Of Month</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.DayOfMonth
	 * @generated
	 */
	public Adapter createDayOfMonthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.MonthOfYear <em>Month Of Year</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.MonthOfYear
	 * @generated
	 */
	public Adapter createMonthOfYearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.HourOfDay <em>Hour Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.HourOfDay
	 * @generated
	 */
	public Adapter createHourOfDayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.PeriodicTime <em>Periodic Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.PeriodicTime
	 * @generated
	 */
	public Adapter createPeriodicTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.RelativeLocation <em>Relative Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.RelativeLocation
	 * @generated
	 */
	public Adapter createRelativeLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.PhysicalLocation <em>Physical Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.PhysicalLocation
	 * @generated
	 */
	public Adapter createPhysicalLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.LogicalLocation <em>Logical Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.LogicalLocation
	 * @generated
	 */
	public Adapter createLogicalLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.Polygon
	 * @generated
	 */
	public Adapter createPolygonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.Circle
	 * @generated
	 */
	public Adapter createCircleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.Polyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.Polyline
	 * @generated
	 */
	public Adapter createPolylineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.RelativeDirection <em>Relative Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.RelativeDirection
	 * @generated
	 */
	public Adapter createRelativeDirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.CardinalDirection <em>Cardinal Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.CardinalDirection
	 * @generated
	 */
	public Adapter createCardinalDirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.QualitativeDirection <em>Qualitative Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.QualitativeDirection
	 * @generated
	 */
	public Adapter createQualitativeDirectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gemRBAC.TemporalContext <em>Temporal Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gemRBAC.TemporalContext
	 * @generated
	 */
	public Adapter createTemporalContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GemRBACAdapterFactory
