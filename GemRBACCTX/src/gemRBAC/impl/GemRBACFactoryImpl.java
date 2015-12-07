/**
 */
package gemRBAC.impl;

import gemRBAC.ActivationDuration;
import gemRBAC.CardinalDirection;
import gemRBAC.CardinalType;
import gemRBAC.Circle;
import gemRBAC.DayOfMonth;
import gemRBAC.DayOfWeek;
import gemRBAC.DayType;
import gemRBAC.Delegation;
import gemRBAC.GemRBACFactory;
import gemRBAC.GemRBACPackage;
import gemRBAC.History;
import gemRBAC.HourOfDay;
import gemRBAC.LogicalLocation;
import gemRBAC.MonthOfYear;
import gemRBAC.Operation;
import gemRBAC.PeriodicTime;
import gemRBAC.Permission;
import gemRBAC.Point;
import gemRBAC.Polygon;
import gemRBAC.Polyline;
import gemRBAC.QualitativeDirection;
import gemRBAC.QualitativeType;
import gemRBAC.RBACUtility;
import gemRBAC.RelativeLocation;
import gemRBAC.RelativeTimeInterval;
import gemRBAC.Role;
import gemRBAC.Root;
import gemRBAC.Session;
import gemRBAC.SpatialContext;
import gemRBAC.TemporalContext;
import gemRBAC.TimeExpression;
import gemRBAC.TimeInterval;
import gemRBAC.TimePoint;
import gemRBAC.TimeUnitType;
import gemRBAC.User;
import gemRBAC.delegationType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GemRBACFactoryImpl extends EFactoryImpl implements GemRBACFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GemRBACFactory init() {
		try {
			GemRBACFactory theGemRBACFactory = (GemRBACFactory)EPackage.Registry.INSTANCE.getEFactory(GemRBACPackage.eNS_URI);
			if (theGemRBACFactory != null) {
				return theGemRBACFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GemRBACFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GemRBACFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GemRBACPackage.USER: return createUser();
			case GemRBACPackage.ROLE: return createRole();
			case GemRBACPackage.SESSION: return createSession();
			case GemRBACPackage.PERMISSION: return createPermission();
			case GemRBACPackage.OPERATION: return createOperation();
			case GemRBACPackage.OBJECT: return createObject();
			case GemRBACPackage.TIME_EXPRESSION: return createTimeExpression();
			case GemRBACPackage.SPATIAL_CONTEXT: return createSpatialContext();
			case GemRBACPackage.DELEGATION: return createDelegation();
			case GemRBACPackage.HISTORY: return createHistory();
			case GemRBACPackage.ROOT: return createRoot();
			case GemRBACPackage.RBAC_UTILITY: return createRBACUtility();
			case GemRBACPackage.ACTIVATION_DURATION: return createActivationDuration();
			case GemRBACPackage.TIME_POINT: return createTimePoint();
			case GemRBACPackage.TIME_INTERVAL: return createTimeInterval();
			case GemRBACPackage.RELATIVE_TIME_INTERVAL: return createRelativeTimeInterval();
			case GemRBACPackage.DAY_OF_WEEK: return createDayOfWeek();
			case GemRBACPackage.DAY_OF_MONTH: return createDayOfMonth();
			case GemRBACPackage.MONTH_OF_YEAR: return createMonthOfYear();
			case GemRBACPackage.HOUR_OF_DAY: return createHourOfDay();
			case GemRBACPackage.PERIODIC_TIME: return createPeriodicTime();
			case GemRBACPackage.RELATIVE_LOCATION: return createRelativeLocation();
			case GemRBACPackage.LOGICAL_LOCATION: return createLogicalLocation();
			case GemRBACPackage.POINT: return createPoint();
			case GemRBACPackage.POLYGON: return createPolygon();
			case GemRBACPackage.CIRCLE: return createCircle();
			case GemRBACPackage.POLYLINE: return createPolyline();
			case GemRBACPackage.CARDINAL_DIRECTION: return createCardinalDirection();
			case GemRBACPackage.QUALITATIVE_DIRECTION: return createQualitativeDirection();
			case GemRBACPackage.TEMPORAL_CONTEXT: return createTemporalContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GemRBACPackage.TIME_UNIT_TYPE:
				return createTimeUnitTypeFromString(eDataType, initialValue);
			case GemRBACPackage.DAY_TYPE:
				return createDayTypeFromString(eDataType, initialValue);
			case GemRBACPackage.CARDINAL_TYPE:
				return createCardinalTypeFromString(eDataType, initialValue);
			case GemRBACPackage.QUALITATIVE_TYPE:
				return createQualitativeTypeFromString(eDataType, initialValue);
			case GemRBACPackage.DELEGATION_TYPE:
				return createdelegationTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GemRBACPackage.TIME_UNIT_TYPE:
				return convertTimeUnitTypeToString(eDataType, instanceValue);
			case GemRBACPackage.DAY_TYPE:
				return convertDayTypeToString(eDataType, instanceValue);
			case GemRBACPackage.CARDINAL_TYPE:
				return convertCardinalTypeToString(eDataType, instanceValue);
			case GemRBACPackage.QUALITATIVE_TYPE:
				return convertQualitativeTypeToString(eDataType, instanceValue);
			case GemRBACPackage.DELEGATION_TYPE:
				return convertdelegationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Session createSession() {
		SessionImpl session = new SessionImpl();
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission createPermission() {
		PermissionImpl permission = new PermissionImpl();
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gemRBAC.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeExpression createTimeExpression() {
		TimeExpressionImpl timeExpression = new TimeExpressionImpl();
		return timeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatialContext createSpatialContext() {
		SpatialContextImpl spatialContext = new SpatialContextImpl();
		return spatialContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delegation createDelegation() {
		DelegationImpl delegation = new DelegationImpl();
		return delegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public History createHistory() {
		HistoryImpl history = new HistoryImpl();
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RBACUtility createRBACUtility() {
		RBACUtilityImpl rbacUtility = new RBACUtilityImpl();
		return rbacUtility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationDuration createActivationDuration() {
		ActivationDurationImpl activationDuration = new ActivationDurationImpl();
		return activationDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePoint createTimePoint() {
		TimePointImpl timePoint = new TimePointImpl();
		return timePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInterval createTimeInterval() {
		TimeIntervalImpl timeInterval = new TimeIntervalImpl();
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeTimeInterval createRelativeTimeInterval() {
		RelativeTimeIntervalImpl relativeTimeInterval = new RelativeTimeIntervalImpl();
		return relativeTimeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfWeek createDayOfWeek() {
		DayOfWeekImpl dayOfWeek = new DayOfWeekImpl();
		return dayOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfMonth createDayOfMonth() {
		DayOfMonthImpl dayOfMonth = new DayOfMonthImpl();
		return dayOfMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthOfYear createMonthOfYear() {
		MonthOfYearImpl monthOfYear = new MonthOfYearImpl();
		return monthOfYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HourOfDay createHourOfDay() {
		HourOfDayImpl hourOfDay = new HourOfDayImpl();
		return hourOfDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicTime createPeriodicTime() {
		PeriodicTimeImpl periodicTime = new PeriodicTimeImpl();
		return periodicTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeLocation createRelativeLocation() {
		RelativeLocationImpl relativeLocation = new RelativeLocationImpl();
		return relativeLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalLocation createLogicalLocation() {
		LogicalLocationImpl logicalLocation = new LogicalLocationImpl();
		return logicalLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polygon createPolygon() {
		PolygonImpl polygon = new PolygonImpl();
		return polygon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circle createCircle() {
		CircleImpl circle = new CircleImpl();
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polyline createPolyline() {
		PolylineImpl polyline = new PolylineImpl();
		return polyline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalDirection createCardinalDirection() {
		CardinalDirectionImpl cardinalDirection = new CardinalDirectionImpl();
		return cardinalDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitativeDirection createQualitativeDirection() {
		QualitativeDirectionImpl qualitativeDirection = new QualitativeDirectionImpl();
		return qualitativeDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalContext createTemporalContext() {
		TemporalContextImpl temporalContext = new TemporalContextImpl();
		return temporalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnitType createTimeUnitTypeFromString(EDataType eDataType, String initialValue) {
		TimeUnitType result = TimeUnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayType createDayTypeFromString(EDataType eDataType, String initialValue) {
		DayType result = DayType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDayTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalType createCardinalTypeFromString(EDataType eDataType, String initialValue) {
		CardinalType result = CardinalType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitativeType createQualitativeTypeFromString(EDataType eDataType, String initialValue) {
		QualitativeType result = QualitativeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualitativeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public delegationType createdelegationTypeFromString(EDataType eDataType, String initialValue) {
		delegationType result = delegationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertdelegationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GemRBACPackage getGemRBACPackage() {
		return (GemRBACPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GemRBACPackage getPackage() {
		return GemRBACPackage.eINSTANCE;
	}

} //GemRBACFactoryImpl
