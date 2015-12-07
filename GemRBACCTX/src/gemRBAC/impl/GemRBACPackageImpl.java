/**
 */
package gemRBAC.impl;

import gemRBAC.AbsoluteTE;
import gemRBAC.ActivationDuration;
import gemRBAC.CardinalDirection;
import gemRBAC.CardinalType;
import gemRBAC.Circle;
import gemRBAC.ComposedRelativeTE;
import gemRBAC.DayOfMonth;
import gemRBAC.DayOfWeek;
import gemRBAC.DayType;
import gemRBAC.Delegation;
import gemRBAC.GemRBACFactory;
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
import gemRBAC.QualitativeType;
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
import gemRBAC.TimeUnitType;
import gemRBAC.User;
import gemRBAC.delegationType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GemRBACPackageImpl extends EPackageImpl implements GemRBACPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rbacContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spatialContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rbacUtilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteTEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeTEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationDurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composedRelativeTEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeTimeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeTimePointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dayOfWeekEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dayOfMonthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monthOfYearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hourOfDayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polylineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeDirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalDirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualitativeDirectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dayTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardinalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qualitativeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum delegationTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gemRBAC.GemRBACPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GemRBACPackageImpl() {
		super(eNS_URI, GemRBACFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GemRBACPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GemRBACPackage init() {
		if (isInited) return (GemRBACPackage)EPackage.Registry.INSTANCE.getEPackage(GemRBACPackage.eNS_URI);

		// Obtain or create and register package
		GemRBACPackageImpl theGemRBACPackage = (GemRBACPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GemRBACPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GemRBACPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGemRBACPackage.createPackageContents();

		// Initialize created meta-data
		theGemRBACPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGemRBACPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GemRBACPackage.eNS_URI, theGemRBACPackage);
		return theGemRBACPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_IdUser() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Roles() {
		return (EReference)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Sessions() {
		return (EReference)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Delegation() {
		return (EReference)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Recieveddelegation() {
		return (EReference)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Revocation() {
		return (EReference)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_DelegatedRoles() {
		return (EReference)userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_UserLocation() {
		return (EReference)userEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_UserLog() {
		return (EReference)userEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__AssignRole__Role() {
		return userEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__AccessHistory() {
		return userEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_IdRole() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Users() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_IsDependent() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_IsStrong() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_IsCascading() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_SessionsA() {
		return (EReference)roleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_SessionsE() {
		return (EReference)roleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Permissions() {
		return (EReference)roleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Juniors() {
		return (EReference)roleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Seniors() {
		return (EReference)roleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_User() {
		return (EReference)roleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Delegation() {
		return (EReference)roleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_RoleContextAssignment() {
		return (EReference)roleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_RoleContextEnabling() {
		return (EReference)roleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_LogRole() {
		return (EReference)roleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRole__GetCurrentAbsoluteTE__RBACUtility() {
		return roleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRole__AssignPermission__Permission() {
		return roleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRole__AccessHistory() {
		return roleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRole__LogBOCurrentProcessInstance() {
		return roleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRole__GetAlljuniors() {
		return roleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSession() {
		return sessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSession_IdSession() {
		return (EAttribute)sessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSession_ActiveRoles() {
		return (EReference)sessionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSession_EnabledRoles() {
		return (EReference)sessionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSession_User() {
		return (EReference)sessionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSession__AccessHistory() {
		return sessionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSession__EnableRole__Role() {
		return sessionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSession__DisableRole__Role() {
		return sessionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSession__ActivateRole__Role() {
		return sessionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSession__DeactivateRole__Role() {
		return sessionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSession__PerformOperation__Operation_Permission_Role() {
		return sessionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSession__DelegateRole__Role() {
		return sessionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermission() {
		return permissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermission_Roles() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermission_Operations() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermission_IdPermission() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermission_Object() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermission_Delegation() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermission_LogPermission() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermission_PermissionContextAssignment() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermission_PermissionContextEnabling() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IdOperation() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Permissions() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_LogOperation() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__AccessHistory() {
		return operationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_IdObject() {
		return (EAttribute)objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Permissions() {
		return (EReference)objectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_LogObject() {
		return (EReference)objectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObject__AccessHistory() {
		return objectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRBACContext() {
		return rbacContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBACContext_LogContext() {
		return (EReference)rbacContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBACContext_P1() {
		return (EReference)rbacContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBACContext_P2() {
		return (EReference)rbacContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBACContext_R1() {
		return (EReference)rbacContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBACContext_R2() {
		return (EReference)rbacContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRBACContext_IdContext() {
		return (EAttribute)rbacContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRBACContext__CheckAccess__RBACContext() {
		return rbacContextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeExpression() {
		return timeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeExpression_Absolute() {
		return (EReference)timeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeExpression_Relative() {
		return (EReference)timeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeExpression_IdTimeExpr() {
		return (EAttribute)timeExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpatialContext() {
		return spatialContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpatialContext_Label() {
		return (EAttribute)spatialContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpatialContext_Location() {
		return (EReference)spatialContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegation() {
		return delegationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegation_IdDelegation() {
		return (EAttribute)delegationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegation_IsRevoked() {
		return (EAttribute)delegationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegation_IsTransfer() {
		return (EAttribute)delegationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegation_IsTotal() {
		return (EAttribute)delegationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegation_StartDate() {
		return (EAttribute)delegationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegation_EndDate() {
		return (EAttribute)delegationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegation_DelegatorUser() {
		return (EReference)delegationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegation_DelegateUser() {
		return (EReference)delegationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegation_RevokingUser() {
		return (EReference)delegationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegation_DelegatedDelegation() {
		return (EReference)delegationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegation_DelegatedPermissions() {
		return (EReference)delegationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelegation_MaxDepth() {
		return (EAttribute)delegationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegation_DelegatedRole() {
		return (EReference)delegationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDelegation__Revoke() {
		return delegationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDelegation__GetAbsoluteDelegationPath() {
		return delegationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistory() {
		return historyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistory_IdLog() {
		return (EAttribute)historyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory_Role() {
		return (EReference)historyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory_Object() {
		return (EReference)historyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory_Op() {
		return (EReference)historyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory_Permission() {
		return (EReference)historyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory_Context() {
		return (EReference)historyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory_User() {
		return (EReference)historyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Sys() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Obj() {
		return (EReference)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Op() {
		return (EReference)rootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_C() {
		return (EReference)rootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_P() {
		return (EReference)rootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_R() {
		return (EReference)rootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_S() {
		return (EReference)rootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_U() {
		return (EReference)rootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_D() {
		return (EReference)rootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Log() {
		return (EReference)rootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Dur() {
		return (EReference)rootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Period() {
		return (EReference)rootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Rloc() {
		return (EReference)rootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Rd() {
		return (EReference)rootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Loc() {
		return (EReference)rootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRBACUtility() {
		return rbacUtilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRBACUtility_MaxPermission() {
		return (EAttribute)rbacUtilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRBACUtility_MaxActiveRole() {
		return (EAttribute)rbacUtilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRBACUtility_MaxRole() {
		return (EAttribute)rbacUtilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBACUtility_BusinessTaskList() {
		return (EReference)rbacUtilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBACUtility_BoundedPermissions() {
		return (EReference)rbacUtilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBACUtility_CurrentT() {
		return (EReference)rbacUtilityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRBACUtility_CurrentDay() {
		return (EReference)rbacUtilityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRBACUtility__GetBoundPermission() {
		return rbacUtilityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRBACUtility__GetCurrentDate() {
		return rbacUtilityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRBACUtility__GetCurrentTime() {
		return rbacUtilityEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRBACUtility__GetDayOfWeek() {
		return rbacUtilityEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRBACUtility__GetCumulativeActiveDuration__Role_User_TimeUnitType() {
		return rbacUtilityEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRBACUtility__GetActiveDuration__Role_TimeUnitType() {
		return rbacUtilityEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteTE() {
		return absoluteTEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbsoluteTE_Duration() {
		return (EReference)absoluteTEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbsoluteTE_IdAbsoluteTE() {
		return (EAttribute)absoluteTEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbsoluteTE__HasDuration() {
		return absoluteTEEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeTE() {
		return relativeTEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeTE_IdRelativeTE() {
		return (EAttribute)relativeTEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeTE_D2() {
		return (EReference)relativeTEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationDuration() {
		return activationDurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationDuration_IdDuration() {
		return (EAttribute)activationDurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationDuration_Value() {
		return (EAttribute)activationDurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationDuration_TimeUnit() {
		return (EAttribute)activationDurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationDuration_IsContinous() {
		return (EAttribute)activationDurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationDuration_Aexp() {
		return (EReference)activationDurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivationDuration_Rexp() {
		return (EReference)activationDurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivationDuration__GreaterThan__ActivationDuration() {
		return activationDurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePoint() {
		return timePointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePoint_Second() {
		return (EAttribute)timePointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePoint_Minute() {
		return (EAttribute)timePointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePoint_Hour() {
		return (EAttribute)timePointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePoint_Day() {
		return (EAttribute)timePointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePoint_Month() {
		return (EAttribute)timePointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimePoint_Year() {
		return (EAttribute)timePointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimePoint__EqualTo__TimePoint() {
		return timePointEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimePoint__IsBefore__TimePoint() {
		return timePointEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimePoint__IsAfter__TimePoint() {
		return timePointEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimePoint__IsContained__TimeInterval() {
		return timePointEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeInterval() {
		return timeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeInterval_Start() {
		return (EReference)timeIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeInterval_End() {
		return (EReference)timeIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposedRelativeTE() {
		return composedRelativeTEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedRelativeTE_Overlay() {
		return (EReference)composedRelativeTEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComposedRelativeTE__CheckHours__RBACUtility() {
		return composedRelativeTEEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComposedRelativeTE__CheckDays__RBACUtility() {
		return composedRelativeTEEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComposedRelativeTE__CheckDaysRank__RBACUtility() {
		return composedRelativeTEEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeTimeInterval() {
		return relativeTimeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeTimeInterval_Start() {
		return (EReference)relativeTimeIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeTimeInterval_End() {
		return (EReference)relativeTimeIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeTimePoint() {
		return relativeTimePointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeTimePoint_Rank() {
		return (EAttribute)relativeTimePointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRelativeTimePoint__IsContained__RelativeTimeInterval() {
		return relativeTimePointEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRelativeTimePoint__EqualTo__RelativeTimePoint() {
		return relativeTimePointEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRelativeTimePoint__IsAfter__RelativeTimePoint() {
		return relativeTimePointEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRelativeTimePoint__IsBefore__RelativeTimePoint() {
		return relativeTimePointEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDayOfWeek() {
		return dayOfWeekEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDayOfWeek_Day() {
		return (EAttribute)dayOfWeekEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDayOfMonth() {
		return dayOfMonthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDayOfMonth_Day() {
		return (EAttribute)dayOfMonthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDayOfMonth_Month() {
		return (EAttribute)dayOfMonthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonthOfYear() {
		return monthOfYearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonthOfYear_Month() {
		return (EAttribute)monthOfYearEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHourOfDay() {
		return hourOfDayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHourOfDay_Hour() {
		return (EAttribute)hourOfDayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHourOfDay_Minute() {
		return (EAttribute)hourOfDayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicTime() {
		return periodicTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicTime_Frequency() {
		return (EAttribute)periodicTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicTime_TimeUnit() {
		return (EAttribute)periodicTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicTime_IdPeriodicTime() {
		return (EAttribute)periodicTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicTime_NextStart() {
		return (EReference)periodicTimeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeLocation() {
		return relativeLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeLocation_Location() {
		return (EReference)relativeLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeLocation_RelativeLocID() {
		return (EAttribute)relativeLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeLocation_Distance() {
		return (EAttribute)relativeLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeLocation_Unit() {
		return (EAttribute)relativeLocationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeLocation_Relativedirection() {
		return (EReference)relativeLocationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Relativelocation() {
		return (EReference)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_LocationID() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Label() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__Disjoint__Location() {
		return locationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__Contains__Location() {
		return locationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__Overlaps__Location() {
		return locationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__ComputeRelative__RelativeLocation() {
		return locationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalLocation() {
		return physicalLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalLocation() {
		return logicalLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Long() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Lat() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Alt() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygon() {
		return polygonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygon_Segment() {
		return (EReference)polygonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircle() {
		return circleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircle_Center() {
		return (EReference)circleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircle_Radius() {
		return (EAttribute)circleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolyline() {
		return polylineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolyline_Start() {
		return (EReference)polylineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolyline_End() {
		return (EReference)polylineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeDirection() {
		return relativeDirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeDirection_Relativelocation() {
		return (EReference)relativeDirectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeDirection_IdDirection() {
		return (EAttribute)relativeDirectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinalDirection() {
		return cardinalDirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinalDirection_Direction() {
		return (EAttribute)cardinalDirectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinalDirection_Angle() {
		return (EAttribute)cardinalDirectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualitativeDirection() {
		return qualitativeDirectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualitativeDirection_Direction() {
		return (EAttribute)qualitativeDirectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalContext() {
		return temporalContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemporalContext_Timeexpression() {
		return (EReference)temporalContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnitType() {
		return timeUnitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDayType() {
		return dayTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardinalType() {
		return cardinalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQualitativeType() {
		return qualitativeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getdelegationType() {
		return delegationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GemRBACFactory getGemRBACFactory() {
		return (GemRBACFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__ID_USER);
		createEReference(userEClass, USER__ROLES);
		createEReference(userEClass, USER__SESSIONS);
		createEReference(userEClass, USER__DELEGATION);
		createEReference(userEClass, USER__RECIEVEDDELEGATION);
		createEReference(userEClass, USER__REVOCATION);
		createEReference(userEClass, USER__DELEGATED_ROLES);
		createEReference(userEClass, USER__USER_LOCATION);
		createEReference(userEClass, USER__USER_LOG);
		createEOperation(userEClass, USER___ASSIGN_ROLE__ROLE);
		createEOperation(userEClass, USER___ACCESS_HISTORY);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__ID_ROLE);
		createEReference(roleEClass, ROLE__USERS);
		createEAttribute(roleEClass, ROLE__IS_DEPENDENT);
		createEAttribute(roleEClass, ROLE__IS_STRONG);
		createEAttribute(roleEClass, ROLE__IS_CASCADING);
		createEReference(roleEClass, ROLE__SESSIONS_A);
		createEReference(roleEClass, ROLE__SESSIONS_E);
		createEReference(roleEClass, ROLE__PERMISSIONS);
		createEReference(roleEClass, ROLE__JUNIORS);
		createEReference(roleEClass, ROLE__SENIORS);
		createEReference(roleEClass, ROLE__USER);
		createEReference(roleEClass, ROLE__DELEGATION);
		createEReference(roleEClass, ROLE__ROLE_CONTEXT_ASSIGNMENT);
		createEReference(roleEClass, ROLE__ROLE_CONTEXT_ENABLING);
		createEReference(roleEClass, ROLE__LOG_ROLE);
		createEOperation(roleEClass, ROLE___GET_CURRENT_ABSOLUTE_TE__RBACUTILITY);
		createEOperation(roleEClass, ROLE___ASSIGN_PERMISSION__PERMISSION);
		createEOperation(roleEClass, ROLE___ACCESS_HISTORY);
		createEOperation(roleEClass, ROLE___LOG_BO_CURRENT_PROCESS_INSTANCE);
		createEOperation(roleEClass, ROLE___GET_ALLJUNIORS);

		sessionEClass = createEClass(SESSION);
		createEAttribute(sessionEClass, SESSION__ID_SESSION);
		createEReference(sessionEClass, SESSION__ACTIVE_ROLES);
		createEReference(sessionEClass, SESSION__ENABLED_ROLES);
		createEReference(sessionEClass, SESSION__USER);
		createEOperation(sessionEClass, SESSION___ACCESS_HISTORY);
		createEOperation(sessionEClass, SESSION___ENABLE_ROLE__ROLE);
		createEOperation(sessionEClass, SESSION___DISABLE_ROLE__ROLE);
		createEOperation(sessionEClass, SESSION___ACTIVATE_ROLE__ROLE);
		createEOperation(sessionEClass, SESSION___DEACTIVATE_ROLE__ROLE);
		createEOperation(sessionEClass, SESSION___PERFORM_OPERATION__OPERATION_PERMISSION_ROLE);
		createEOperation(sessionEClass, SESSION___DELEGATE_ROLE__ROLE);

		permissionEClass = createEClass(PERMISSION);
		createEReference(permissionEClass, PERMISSION__ROLES);
		createEReference(permissionEClass, PERMISSION__OPERATIONS);
		createEAttribute(permissionEClass, PERMISSION__ID_PERMISSION);
		createEReference(permissionEClass, PERMISSION__OBJECT);
		createEReference(permissionEClass, PERMISSION__DELEGATION);
		createEReference(permissionEClass, PERMISSION__LOG_PERMISSION);
		createEReference(permissionEClass, PERMISSION__PERMISSION_CONTEXT_ASSIGNMENT);
		createEReference(permissionEClass, PERMISSION__PERMISSION_CONTEXT_ENABLING);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__ID_OPERATION);
		createEReference(operationEClass, OPERATION__PERMISSIONS);
		createEReference(operationEClass, OPERATION__LOG_OPERATION);
		createEOperation(operationEClass, OPERATION___ACCESS_HISTORY);

		objectEClass = createEClass(OBJECT);
		createEAttribute(objectEClass, OBJECT__ID_OBJECT);
		createEReference(objectEClass, OBJECT__PERMISSIONS);
		createEReference(objectEClass, OBJECT__LOG_OBJECT);
		createEOperation(objectEClass, OBJECT___ACCESS_HISTORY);

		rbacContextEClass = createEClass(RBAC_CONTEXT);
		createEReference(rbacContextEClass, RBAC_CONTEXT__LOG_CONTEXT);
		createEReference(rbacContextEClass, RBAC_CONTEXT__P1);
		createEReference(rbacContextEClass, RBAC_CONTEXT__P2);
		createEReference(rbacContextEClass, RBAC_CONTEXT__R1);
		createEReference(rbacContextEClass, RBAC_CONTEXT__R2);
		createEAttribute(rbacContextEClass, RBAC_CONTEXT__ID_CONTEXT);
		createEOperation(rbacContextEClass, RBAC_CONTEXT___CHECK_ACCESS__RBACCONTEXT);

		timeExpressionEClass = createEClass(TIME_EXPRESSION);
		createEReference(timeExpressionEClass, TIME_EXPRESSION__ABSOLUTE);
		createEReference(timeExpressionEClass, TIME_EXPRESSION__RELATIVE);
		createEAttribute(timeExpressionEClass, TIME_EXPRESSION__ID_TIME_EXPR);

		spatialContextEClass = createEClass(SPATIAL_CONTEXT);
		createEAttribute(spatialContextEClass, SPATIAL_CONTEXT__LABEL);
		createEReference(spatialContextEClass, SPATIAL_CONTEXT__LOCATION);

		delegationEClass = createEClass(DELEGATION);
		createEAttribute(delegationEClass, DELEGATION__ID_DELEGATION);
		createEAttribute(delegationEClass, DELEGATION__IS_REVOKED);
		createEAttribute(delegationEClass, DELEGATION__IS_TRANSFER);
		createEAttribute(delegationEClass, DELEGATION__IS_TOTAL);
		createEAttribute(delegationEClass, DELEGATION__START_DATE);
		createEAttribute(delegationEClass, DELEGATION__END_DATE);
		createEReference(delegationEClass, DELEGATION__DELEGATOR_USER);
		createEReference(delegationEClass, DELEGATION__DELEGATE_USER);
		createEReference(delegationEClass, DELEGATION__REVOKING_USER);
		createEReference(delegationEClass, DELEGATION__DELEGATED_DELEGATION);
		createEReference(delegationEClass, DELEGATION__DELEGATED_PERMISSIONS);
		createEAttribute(delegationEClass, DELEGATION__MAX_DEPTH);
		createEReference(delegationEClass, DELEGATION__DELEGATED_ROLE);
		createEOperation(delegationEClass, DELEGATION___REVOKE);
		createEOperation(delegationEClass, DELEGATION___GET_ABSOLUTE_DELEGATION_PATH);

		historyEClass = createEClass(HISTORY);
		createEAttribute(historyEClass, HISTORY__ID_LOG);
		createEReference(historyEClass, HISTORY__ROLE);
		createEReference(historyEClass, HISTORY__OBJECT);
		createEReference(historyEClass, HISTORY__OP);
		createEReference(historyEClass, HISTORY__PERMISSION);
		createEReference(historyEClass, HISTORY__CONTEXT);
		createEReference(historyEClass, HISTORY__USER);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__SYS);
		createEReference(rootEClass, ROOT__OBJ);
		createEReference(rootEClass, ROOT__OP);
		createEReference(rootEClass, ROOT__C);
		createEReference(rootEClass, ROOT__P);
		createEReference(rootEClass, ROOT__R);
		createEReference(rootEClass, ROOT__S);
		createEReference(rootEClass, ROOT__U);
		createEReference(rootEClass, ROOT__D);
		createEReference(rootEClass, ROOT__LOG);
		createEReference(rootEClass, ROOT__DUR);
		createEReference(rootEClass, ROOT__PERIOD);
		createEReference(rootEClass, ROOT__RLOC);
		createEReference(rootEClass, ROOT__RD);
		createEReference(rootEClass, ROOT__LOC);

		rbacUtilityEClass = createEClass(RBAC_UTILITY);
		createEAttribute(rbacUtilityEClass, RBAC_UTILITY__MAX_PERMISSION);
		createEAttribute(rbacUtilityEClass, RBAC_UTILITY__MAX_ACTIVE_ROLE);
		createEAttribute(rbacUtilityEClass, RBAC_UTILITY__MAX_ROLE);
		createEReference(rbacUtilityEClass, RBAC_UTILITY__BUSINESS_TASK_LIST);
		createEReference(rbacUtilityEClass, RBAC_UTILITY__BOUNDED_PERMISSIONS);
		createEReference(rbacUtilityEClass, RBAC_UTILITY__CURRENT_T);
		createEReference(rbacUtilityEClass, RBAC_UTILITY__CURRENT_DAY);
		createEOperation(rbacUtilityEClass, RBAC_UTILITY___GET_BOUND_PERMISSION);
		createEOperation(rbacUtilityEClass, RBAC_UTILITY___GET_CURRENT_DATE);
		createEOperation(rbacUtilityEClass, RBAC_UTILITY___GET_CURRENT_TIME);
		createEOperation(rbacUtilityEClass, RBAC_UTILITY___GET_DAY_OF_WEEK);
		createEOperation(rbacUtilityEClass, RBAC_UTILITY___GET_CUMULATIVE_ACTIVE_DURATION__ROLE_USER_TIMEUNITTYPE);
		createEOperation(rbacUtilityEClass, RBAC_UTILITY___GET_ACTIVE_DURATION__ROLE_TIMEUNITTYPE);

		absoluteTEEClass = createEClass(ABSOLUTE_TE);
		createEReference(absoluteTEEClass, ABSOLUTE_TE__DURATION);
		createEAttribute(absoluteTEEClass, ABSOLUTE_TE__ID_ABSOLUTE_TE);
		createEOperation(absoluteTEEClass, ABSOLUTE_TE___HAS_DURATION);

		relativeTEEClass = createEClass(RELATIVE_TE);
		createEAttribute(relativeTEEClass, RELATIVE_TE__ID_RELATIVE_TE);
		createEReference(relativeTEEClass, RELATIVE_TE__D2);

		activationDurationEClass = createEClass(ACTIVATION_DURATION);
		createEAttribute(activationDurationEClass, ACTIVATION_DURATION__ID_DURATION);
		createEAttribute(activationDurationEClass, ACTIVATION_DURATION__VALUE);
		createEAttribute(activationDurationEClass, ACTIVATION_DURATION__TIME_UNIT);
		createEAttribute(activationDurationEClass, ACTIVATION_DURATION__IS_CONTINOUS);
		createEReference(activationDurationEClass, ACTIVATION_DURATION__AEXP);
		createEReference(activationDurationEClass, ACTIVATION_DURATION__REXP);
		createEOperation(activationDurationEClass, ACTIVATION_DURATION___GREATER_THAN__ACTIVATIONDURATION);

		timePointEClass = createEClass(TIME_POINT);
		createEAttribute(timePointEClass, TIME_POINT__SECOND);
		createEAttribute(timePointEClass, TIME_POINT__MINUTE);
		createEAttribute(timePointEClass, TIME_POINT__HOUR);
		createEAttribute(timePointEClass, TIME_POINT__DAY);
		createEAttribute(timePointEClass, TIME_POINT__MONTH);
		createEAttribute(timePointEClass, TIME_POINT__YEAR);
		createEOperation(timePointEClass, TIME_POINT___EQUAL_TO__TIMEPOINT);
		createEOperation(timePointEClass, TIME_POINT___IS_BEFORE__TIMEPOINT);
		createEOperation(timePointEClass, TIME_POINT___IS_AFTER__TIMEPOINT);
		createEOperation(timePointEClass, TIME_POINT___IS_CONTAINED__TIMEINTERVAL);

		timeIntervalEClass = createEClass(TIME_INTERVAL);
		createEReference(timeIntervalEClass, TIME_INTERVAL__START);
		createEReference(timeIntervalEClass, TIME_INTERVAL__END);

		composedRelativeTEEClass = createEClass(COMPOSED_RELATIVE_TE);
		createEReference(composedRelativeTEEClass, COMPOSED_RELATIVE_TE__OVERLAY);
		createEOperation(composedRelativeTEEClass, COMPOSED_RELATIVE_TE___CHECK_HOURS__RBACUTILITY);
		createEOperation(composedRelativeTEEClass, COMPOSED_RELATIVE_TE___CHECK_DAYS__RBACUTILITY);
		createEOperation(composedRelativeTEEClass, COMPOSED_RELATIVE_TE___CHECK_DAYS_RANK__RBACUTILITY);

		relativeTimeIntervalEClass = createEClass(RELATIVE_TIME_INTERVAL);
		createEReference(relativeTimeIntervalEClass, RELATIVE_TIME_INTERVAL__START);
		createEReference(relativeTimeIntervalEClass, RELATIVE_TIME_INTERVAL__END);

		relativeTimePointEClass = createEClass(RELATIVE_TIME_POINT);
		createEAttribute(relativeTimePointEClass, RELATIVE_TIME_POINT__RANK);
		createEOperation(relativeTimePointEClass, RELATIVE_TIME_POINT___IS_CONTAINED__RELATIVETIMEINTERVAL);
		createEOperation(relativeTimePointEClass, RELATIVE_TIME_POINT___EQUAL_TO__RELATIVETIMEPOINT);
		createEOperation(relativeTimePointEClass, RELATIVE_TIME_POINT___IS_AFTER__RELATIVETIMEPOINT);
		createEOperation(relativeTimePointEClass, RELATIVE_TIME_POINT___IS_BEFORE__RELATIVETIMEPOINT);

		dayOfWeekEClass = createEClass(DAY_OF_WEEK);
		createEAttribute(dayOfWeekEClass, DAY_OF_WEEK__DAY);

		dayOfMonthEClass = createEClass(DAY_OF_MONTH);
		createEAttribute(dayOfMonthEClass, DAY_OF_MONTH__DAY);
		createEAttribute(dayOfMonthEClass, DAY_OF_MONTH__MONTH);

		monthOfYearEClass = createEClass(MONTH_OF_YEAR);
		createEAttribute(monthOfYearEClass, MONTH_OF_YEAR__MONTH);

		hourOfDayEClass = createEClass(HOUR_OF_DAY);
		createEAttribute(hourOfDayEClass, HOUR_OF_DAY__HOUR);
		createEAttribute(hourOfDayEClass, HOUR_OF_DAY__MINUTE);

		periodicTimeEClass = createEClass(PERIODIC_TIME);
		createEAttribute(periodicTimeEClass, PERIODIC_TIME__FREQUENCY);
		createEAttribute(periodicTimeEClass, PERIODIC_TIME__TIME_UNIT);
		createEAttribute(periodicTimeEClass, PERIODIC_TIME__ID_PERIODIC_TIME);
		createEReference(periodicTimeEClass, PERIODIC_TIME__NEXT_START);

		relativeLocationEClass = createEClass(RELATIVE_LOCATION);
		createEReference(relativeLocationEClass, RELATIVE_LOCATION__LOCATION);
		createEAttribute(relativeLocationEClass, RELATIVE_LOCATION__RELATIVE_LOC_ID);
		createEAttribute(relativeLocationEClass, RELATIVE_LOCATION__DISTANCE);
		createEAttribute(relativeLocationEClass, RELATIVE_LOCATION__UNIT);
		createEReference(relativeLocationEClass, RELATIVE_LOCATION__RELATIVEDIRECTION);

		locationEClass = createEClass(LOCATION);
		createEReference(locationEClass, LOCATION__RELATIVELOCATION);
		createEAttribute(locationEClass, LOCATION__LOCATION_ID);
		createEAttribute(locationEClass, LOCATION__LABEL);
		createEOperation(locationEClass, LOCATION___DISJOINT__LOCATION);
		createEOperation(locationEClass, LOCATION___CONTAINS__LOCATION);
		createEOperation(locationEClass, LOCATION___OVERLAPS__LOCATION);
		createEOperation(locationEClass, LOCATION___COMPUTE_RELATIVE__RELATIVELOCATION);

		physicalLocationEClass = createEClass(PHYSICAL_LOCATION);

		logicalLocationEClass = createEClass(LOGICAL_LOCATION);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__LONG);
		createEAttribute(pointEClass, POINT__LAT);
		createEAttribute(pointEClass, POINT__ALT);

		polygonEClass = createEClass(POLYGON);
		createEReference(polygonEClass, POLYGON__SEGMENT);

		circleEClass = createEClass(CIRCLE);
		createEReference(circleEClass, CIRCLE__CENTER);
		createEAttribute(circleEClass, CIRCLE__RADIUS);

		polylineEClass = createEClass(POLYLINE);
		createEReference(polylineEClass, POLYLINE__START);
		createEReference(polylineEClass, POLYLINE__END);

		relativeDirectionEClass = createEClass(RELATIVE_DIRECTION);
		createEReference(relativeDirectionEClass, RELATIVE_DIRECTION__RELATIVELOCATION);
		createEAttribute(relativeDirectionEClass, RELATIVE_DIRECTION__ID_DIRECTION);

		cardinalDirectionEClass = createEClass(CARDINAL_DIRECTION);
		createEAttribute(cardinalDirectionEClass, CARDINAL_DIRECTION__DIRECTION);
		createEAttribute(cardinalDirectionEClass, CARDINAL_DIRECTION__ANGLE);

		qualitativeDirectionEClass = createEClass(QUALITATIVE_DIRECTION);
		createEAttribute(qualitativeDirectionEClass, QUALITATIVE_DIRECTION__DIRECTION);

		temporalContextEClass = createEClass(TEMPORAL_CONTEXT);
		createEReference(temporalContextEClass, TEMPORAL_CONTEXT__TIMEEXPRESSION);

		// Create enums
		timeUnitTypeEEnum = createEEnum(TIME_UNIT_TYPE);
		dayTypeEEnum = createEEnum(DAY_TYPE);
		cardinalTypeEEnum = createEEnum(CARDINAL_TYPE);
		qualitativeTypeEEnum = createEEnum(QUALITATIVE_TYPE);
		delegationTypeEEnum = createEEnum(DELEGATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		spatialContextEClass.getESuperTypes().add(this.getRBACContext());
		timePointEClass.getESuperTypes().add(this.getAbsoluteTE());
		timeIntervalEClass.getESuperTypes().add(this.getAbsoluteTE());
		composedRelativeTEEClass.getESuperTypes().add(this.getRelativeTE());
		relativeTimeIntervalEClass.getESuperTypes().add(this.getComposedRelativeTE());
		relativeTimePointEClass.getESuperTypes().add(this.getComposedRelativeTE());
		dayOfWeekEClass.getESuperTypes().add(this.getRelativeTimePoint());
		dayOfMonthEClass.getESuperTypes().add(this.getRelativeTimePoint());
		monthOfYearEClass.getESuperTypes().add(this.getRelativeTimePoint());
		hourOfDayEClass.getESuperTypes().add(this.getRelativeTimePoint());
		periodicTimeEClass.getESuperTypes().add(this.getRelativeTE());
		physicalLocationEClass.getESuperTypes().add(this.getLocation());
		logicalLocationEClass.getESuperTypes().add(this.getLocation());
		pointEClass.getESuperTypes().add(this.getPhysicalLocation());
		polygonEClass.getESuperTypes().add(this.getPhysicalLocation());
		circleEClass.getESuperTypes().add(this.getPhysicalLocation());
		polylineEClass.getESuperTypes().add(this.getPhysicalLocation());
		cardinalDirectionEClass.getESuperTypes().add(this.getRelativeDirection());
		qualitativeDirectionEClass.getESuperTypes().add(this.getRelativeDirection());
		temporalContextEClass.getESuperTypes().add(this.getRBACContext());

		// Initialize classes, features, and operations; add parameters
		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_IdUser(), ecorePackage.getEString(), "idUser", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Roles(), this.getRole(), this.getRole_Users(), "roles", null, 1, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Sessions(), this.getSession(), this.getSession_User(), "sessions", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Delegation(), this.getDelegation(), this.getDelegation_DelegatorUser(), "delegation", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Recieveddelegation(), this.getDelegation(), this.getDelegation_DelegateUser(), "recieveddelegation", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Revocation(), this.getDelegation(), this.getDelegation_RevokingUser(), "revocation", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_DelegatedRoles(), this.getRole(), this.getRole_User(), "delegatedRoles", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_UserLocation(), this.getSpatialContext(), null, "userLocation", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_UserLog(), this.getHistory(), this.getHistory_User(), "userLog", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getUser__AssignRole__Role(), null, "assignRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRole(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUser__AccessHistory(), this.getHistory(), "accessHistory", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_IdRole(), ecorePackage.getEString(), "idRole", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Users(), this.getUser(), this.getUser_Roles(), "users", null, 1, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_IsDependent(), ecorePackage.getEBoolean(), "isDependent", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_IsStrong(), ecorePackage.getEBoolean(), "isStrong", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_IsCascading(), ecorePackage.getEBoolean(), "isCascading", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_SessionsA(), this.getSession(), this.getSession_ActiveRoles(), "sessionsA", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_SessionsE(), this.getSession(), this.getSession_EnabledRoles(), "sessionsE", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Permissions(), this.getPermission(), this.getPermission_Roles(), "permissions", null, 1, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Juniors(), this.getRole(), this.getRole_Seniors(), "juniors", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Seniors(), this.getRole(), this.getRole_Juniors(), "seniors", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_User(), this.getUser(), this.getUser_DelegatedRoles(), "user", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Delegation(), this.getDelegation(), this.getDelegation_DelegatedRole(), "delegation", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_RoleContextAssignment(), this.getRBACContext(), this.getRBACContext_R1(), "roleContextAssignment", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_RoleContextEnabling(), this.getRBACContext(), this.getRBACContext_R2(), "roleContextEnabling", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_LogRole(), this.getHistory(), this.getHistory_Role(), "logRole", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRole__GetCurrentAbsoluteTE__RBACUtility(), this.getAbsoluteTE(), "getCurrentAbsoluteTE", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRBACUtility(), "u", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRole__AssignPermission__Permission(), null, "assignPermission", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPermission(), "p", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRole__AccessHistory(), this.getHistory(), "accessHistory", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRole__LogBOCurrentProcessInstance(), this.getHistory(), "logBOCurrentProcessInstance", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRole__GetAlljuniors(), this.getRole(), "getAlljuniors", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(sessionEClass, Session.class, "Session", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSession_IdSession(), ecorePackage.getEString(), "idSession", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSession_ActiveRoles(), this.getRole(), this.getRole_SessionsA(), "activeRoles", null, 0, -1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSession_EnabledRoles(), this.getRole(), this.getRole_SessionsE(), "enabledRoles", null, 0, -1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSession_User(), this.getUser(), this.getUser_Sessions(), "user", null, 1, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSession__AccessHistory(), this.getHistory(), "accessHistory", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSession__EnableRole__Role(), null, "enableRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRole(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSession__DisableRole__Role(), null, "disableRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRole(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSession__ActivateRole__Role(), null, "activateRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRole(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSession__DeactivateRole__Role(), null, "deactivateRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRole(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSession__PerformOperation__Operation_Permission_Role(), null, "performOperation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperation(), "op", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPermission(), "p", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRole(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSession__DelegateRole__Role(), null, "delegateRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRole(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPermission_Roles(), this.getRole(), this.getRole_Permissions(), "roles", null, 0, -1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermission_Operations(), this.getOperation(), this.getOperation_Permissions(), "operations", null, 0, -1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermission_IdPermission(), ecorePackage.getEString(), "idPermission", null, 0, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermission_Object(), this.getObject(), this.getObject_Permissions(), "object", null, 0, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermission_Delegation(), this.getDelegation(), this.getDelegation_DelegatedPermissions(), "delegation", null, 0, -1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermission_LogPermission(), this.getHistory(), this.getHistory_Permission(), "logPermission", null, 0, -1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermission_PermissionContextAssignment(), this.getRBACContext(), this.getRBACContext_P1(), "permissionContextAssignment", null, 0, -1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPermission_PermissionContextEnabling(), this.getRBACContext(), this.getRBACContext_P2(), "permissionContextEnabling", null, 0, -1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_IdOperation(), ecorePackage.getEString(), "idOperation", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Permissions(), this.getPermission(), this.getPermission_Operations(), "permissions", null, 1, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_LogOperation(), this.getHistory(), this.getHistory_Op(), "logOperation", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOperation__AccessHistory(), this.getHistory(), "accessHistory", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectEClass, gemRBAC.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObject_IdObject(), ecorePackage.getEString(), "idObject", null, 0, 1, gemRBAC.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_Permissions(), this.getPermission(), this.getPermission_Object(), "permissions", null, 0, -1, gemRBAC.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_LogObject(), this.getHistory(), this.getHistory_Object(), "logObject", null, 0, -1, gemRBAC.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getObject__AccessHistory(), this.getHistory(), "accessHistory", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(rbacContextEClass, RBACContext.class, "RBACContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRBACContext_LogContext(), this.getHistory(), this.getHistory_Context(), "logContext", null, 0, -1, RBACContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBACContext_P1(), this.getPermission(), this.getPermission_PermissionContextAssignment(), "p1", null, 0, 1, RBACContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBACContext_P2(), this.getPermission(), this.getPermission_PermissionContextEnabling(), "p2", null, 0, 1, RBACContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBACContext_R1(), this.getRole(), this.getRole_RoleContextAssignment(), "r1", null, 0, 1, RBACContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBACContext_R2(), this.getRole(), this.getRole_RoleContextEnabling(), "r2", null, 0, 1, RBACContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRBACContext_IdContext(), ecorePackage.getEString(), "idContext", null, 0, 1, RBACContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRBACContext__CheckAccess__RBACContext(), ecorePackage.getEBoolean(), "checkAccess", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRBACContext(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timeExpressionEClass, TimeExpression.class, "TimeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeExpression_Absolute(), this.getAbsoluteTE(), null, "absolute", null, 1, -1, TimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTimeExpression_Relative(), this.getRelativeTE(), null, "relative", null, 0, -1, TimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeExpression_IdTimeExpr(), ecorePackage.getEString(), "idTimeExpr", null, 0, 1, TimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spatialContextEClass, SpatialContext.class, "SpatialContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpatialContext_Label(), ecorePackage.getEString(), "label", null, 0, 1, SpatialContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpatialContext_Location(), this.getLocation(), null, "location", null, 1, -1, SpatialContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationEClass, Delegation.class, "Delegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelegation_IdDelegation(), ecorePackage.getEString(), "idDelegation", null, 0, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegation_IsRevoked(), ecorePackage.getEBoolean(), "isRevoked", null, 0, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegation_IsTransfer(), this.getdelegationType(), "isTransfer", null, 0, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegation_IsTotal(), ecorePackage.getEBoolean(), "isTotal", null, 0, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegation_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegation_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegation_DelegatorUser(), this.getUser(), this.getUser_Delegation(), "delegatorUser", null, 1, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegation_DelegateUser(), this.getUser(), this.getUser_Recieveddelegation(), "delegateUser", null, 1, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegation_RevokingUser(), this.getUser(), this.getUser_Revocation(), "revokingUser", null, 0, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegation_DelegatedDelegation(), this.getDelegation(), null, "delegatedDelegation", null, 0, -1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegation_DelegatedPermissions(), this.getPermission(), this.getPermission_Delegation(), "delegatedPermissions", null, 1, -1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelegation_MaxDepth(), ecorePackage.getEInt(), "maxDepth", null, 0, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegation_DelegatedRole(), this.getRole(), this.getRole_Delegation(), "delegatedRole", null, 1, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDelegation__Revoke(), null, "revoke", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDelegation__GetAbsoluteDelegationPath(), this.getDelegation(), "getAbsoluteDelegationPath", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(historyEClass, History.class, "History", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHistory_IdLog(), ecorePackage.getEString(), "idLog", null, 0, 1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistory_Role(), this.getRole(), this.getRole_LogRole(), "role", null, 1, 1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistory_Object(), this.getObject(), this.getObject_LogObject(), "object", null, 1, 1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistory_Op(), this.getOperation(), this.getOperation_LogOperation(), "op", null, 1, 1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistory_Permission(), this.getPermission(), this.getPermission_LogPermission(), "permission", null, 1, 1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistory_Context(), this.getRBACContext(), this.getRBACContext_LogContext(), "context", null, 1, 2, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistory_User(), this.getUser(), this.getUser_UserLog(), "user", null, 1, 1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Sys(), this.getRBACUtility(), null, "sys", null, 0, 1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Obj(), this.getObject(), null, "obj", null, 1, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Op(), this.getOperation(), null, "op", null, 1, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_C(), this.getRBACContext(), null, "c", null, 1, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_P(), this.getPermission(), null, "p", null, 1, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_R(), this.getRole(), null, "r", null, 1, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_S(), this.getSession(), null, "s", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_U(), this.getUser(), null, "u", null, 1, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_D(), this.getDelegation(), null, "d", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Log(), this.getHistory(), null, "log", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Dur(), this.getActivationDuration(), null, "dur", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Period(), this.getPeriodicTime(), null, "period", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Rloc(), this.getRelativeLocation(), null, "rloc", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Rd(), this.getRelativeDirection(), null, "rd", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Loc(), this.getLocation(), null, "loc", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rbacUtilityEClass, RBACUtility.class, "RBACUtility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRBACUtility_MaxPermission(), ecorePackage.getEInt(), "maxPermission", null, 0, 1, RBACUtility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRBACUtility_MaxActiveRole(), ecorePackage.getEInt(), "maxActiveRole", null, 0, 1, RBACUtility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRBACUtility_MaxRole(), ecorePackage.getEInt(), "maxRole", null, 0, 1, RBACUtility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBACUtility_BusinessTaskList(), this.getOperation(), null, "businessTaskList", null, 0, -1, RBACUtility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBACUtility_BoundedPermissions(), this.getPermission(), null, "boundedPermissions", null, 0, -1, RBACUtility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBACUtility_CurrentT(), this.getTimePoint(), null, "currentT", null, 0, 1, RBACUtility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRBACUtility_CurrentDay(), this.getRelativeTimePoint(), null, "currentDay", null, 0, 1, RBACUtility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRBACUtility__GetBoundPermission(), this.getPermission(), "getBoundPermission", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRBACUtility__GetCurrentDate(), ecorePackage.getEDate(), "getCurrentDate", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRBACUtility__GetCurrentTime(), this.getTimePoint(), "getCurrentTime", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRBACUtility__GetDayOfWeek(), this.getRelativeTimePoint(), "getDayOfWeek", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRBACUtility__GetCumulativeActiveDuration__Role_User_TimeUnitType(), this.getActivationDuration(), "getCumulativeActiveDuration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRole(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUser(), "u", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeUnitType(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRBACUtility__GetActiveDuration__Role_TimeUnitType(), this.getActivationDuration(), "getActiveDuration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRole(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeUnitType(), "unit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(absoluteTEEClass, AbsoluteTE.class, "AbsoluteTE", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbsoluteTE_Duration(), this.getActivationDuration(), this.getActivationDuration_Aexp(), "duration", null, 0, 1, AbsoluteTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbsoluteTE_IdAbsoluteTE(), ecorePackage.getEString(), "idAbsoluteTE", null, 0, 1, AbsoluteTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbsoluteTE__HasDuration(), ecorePackage.getEBoolean(), "hasDuration", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(relativeTEEClass, RelativeTE.class, "RelativeTE", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelativeTE_IdRelativeTE(), ecorePackage.getEString(), "idRelativeTE", null, 0, 1, RelativeTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelativeTE_D2(), this.getActivationDuration(), this.getActivationDuration_Rexp(), "d2", null, 0, 1, RelativeTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activationDurationEClass, ActivationDuration.class, "ActivationDuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivationDuration_IdDuration(), ecorePackage.getEString(), "idDuration", null, 0, 1, ActivationDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivationDuration_Value(), ecorePackage.getEBigInteger(), "value", null, 0, 1, ActivationDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivationDuration_TimeUnit(), this.getTimeUnitType(), "timeUnit", null, 0, 1, ActivationDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivationDuration_IsContinous(), ecorePackage.getEBoolean(), "isContinous", null, 0, 1, ActivationDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivationDuration_Aexp(), this.getAbsoluteTE(), this.getAbsoluteTE_Duration(), "aexp", null, 0, 1, ActivationDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivationDuration_Rexp(), this.getRelativeTE(), this.getRelativeTE_D2(), "rexp", null, 0, 1, ActivationDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getActivationDuration__GreaterThan__ActivationDuration(), ecorePackage.getEBoolean(), "greaterThan", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivationDuration(), "d", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timePointEClass, TimePoint.class, "TimePoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimePoint_Second(), ecorePackage.getEInt(), "second", null, 0, 1, TimePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimePoint_Minute(), ecorePackage.getEInt(), "minute", null, 0, 1, TimePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimePoint_Hour(), ecorePackage.getEInt(), "hour", null, 0, 1, TimePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimePoint_Day(), ecorePackage.getEInt(), "day", null, 0, 1, TimePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimePoint_Month(), ecorePackage.getEInt(), "month", null, 0, 1, TimePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimePoint_Year(), ecorePackage.getEInt(), "year", null, 0, 1, TimePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTimePoint__EqualTo__TimePoint(), ecorePackage.getEBoolean(), "equalTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimePoint(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimePoint__IsBefore__TimePoint(), ecorePackage.getEBoolean(), "isBefore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimePoint(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimePoint__IsAfter__TimePoint(), ecorePackage.getEBoolean(), "isAfter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimePoint(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimePoint__IsContained__TimeInterval(), ecorePackage.getEBoolean(), "isContained", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeInterval(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeInterval_Start(), this.getTimePoint(), null, "start", null, 1, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeInterval_End(), this.getTimePoint(), null, "end", null, 0, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composedRelativeTEEClass, ComposedRelativeTE.class, "ComposedRelativeTE", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposedRelativeTE_Overlay(), this.getComposedRelativeTE(), null, "overlay", null, 0, -1, ComposedRelativeTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getComposedRelativeTE__CheckHours__RBACUtility(), ecorePackage.getEBoolean(), "checkHours", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRBACUtility(), "u", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComposedRelativeTE__CheckDays__RBACUtility(), ecorePackage.getEBoolean(), "checkDays", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRBACUtility(), "u", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComposedRelativeTE__CheckDaysRank__RBACUtility(), ecorePackage.getEBoolean(), "checkDaysRank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRBACUtility(), "u", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(relativeTimeIntervalEClass, RelativeTimeInterval.class, "RelativeTimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelativeTimeInterval_Start(), this.getRelativeTimePoint(), null, "start", null, 1, 1, RelativeTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelativeTimeInterval_End(), this.getRelativeTimePoint(), null, "end", null, 0, 1, RelativeTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeTimePointEClass, RelativeTimePoint.class, "RelativeTimePoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelativeTimePoint_Rank(), ecorePackage.getEInt(), "rank", null, 0, 1, RelativeTimePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRelativeTimePoint__IsContained__RelativeTimeInterval(), ecorePackage.getEBoolean(), "isContained", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRelativeTimeInterval(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRelativeTimePoint__EqualTo__RelativeTimePoint(), ecorePackage.getEBoolean(), "equalTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRelativeTimePoint(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRelativeTimePoint__IsAfter__RelativeTimePoint(), ecorePackage.getEBoolean(), "isAfter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRelativeTimePoint(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRelativeTimePoint__IsBefore__RelativeTimePoint(), ecorePackage.getEBoolean(), "isBefore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRelativeTimePoint(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dayOfWeekEClass, DayOfWeek.class, "DayOfWeek", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDayOfWeek_Day(), this.getDayType(), "day", null, 0, 1, DayOfWeek.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dayOfMonthEClass, DayOfMonth.class, "DayOfMonth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDayOfMonth_Day(), ecorePackage.getEInt(), "day", null, 0, 1, DayOfMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDayOfMonth_Month(), ecorePackage.getEInt(), "month", null, 0, 1, DayOfMonth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monthOfYearEClass, MonthOfYear.class, "MonthOfYear", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonthOfYear_Month(), ecorePackage.getEInt(), "month", null, 0, 1, MonthOfYear.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hourOfDayEClass, HourOfDay.class, "HourOfDay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHourOfDay_Hour(), ecorePackage.getEInt(), "hour", null, 0, 1, HourOfDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHourOfDay_Minute(), ecorePackage.getEInt(), "minute", null, 0, 1, HourOfDay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicTimeEClass, PeriodicTime.class, "PeriodicTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriodicTime_Frequency(), ecorePackage.getEInt(), "frequency", null, 0, 1, PeriodicTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicTime_TimeUnit(), this.getTimeUnitType(), "timeUnit", null, 0, 1, PeriodicTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPeriodicTime_IdPeriodicTime(), ecorePackage.getEString(), "idPeriodicTime", null, 0, 1, PeriodicTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicTime_NextStart(), this.getTimePoint(), null, "nextStart", null, 0, 1, PeriodicTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeLocationEClass, RelativeLocation.class, "RelativeLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelativeLocation_Location(), this.getLocation(), this.getLocation_Relativelocation(), "location", null, 0, -1, RelativeLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeLocation_RelativeLocID(), ecorePackage.getEString(), "relativeLocID", null, 0, 1, RelativeLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeLocation_Distance(), ecorePackage.getEDouble(), "distance", null, 0, 1, RelativeLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeLocation_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, RelativeLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelativeLocation_Relativedirection(), this.getRelativeDirection(), this.getRelativeDirection_Relativelocation(), "relativedirection", null, 1, 1, RelativeLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocation_Relativelocation(), this.getRelativeLocation(), this.getRelativeLocation_Location(), "relativelocation", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_LocationID(), ecorePackage.getEString(), "locationID", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Label(), ecorePackage.getEString(), "label", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLocation__Disjoint__Location(), ecorePackage.getEBoolean(), "disjoint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocation(), "l", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLocation__Contains__Location(), ecorePackage.getEBoolean(), "contains", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocation(), "l", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLocation__Overlaps__Location(), ecorePackage.getEBoolean(), "overlaps", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocation(), "l", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLocation__ComputeRelative__RelativeLocation(), this.getLocation(), "computeRelative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRelativeLocation(), "r", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(physicalLocationEClass, PhysicalLocation.class, "PhysicalLocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalLocationEClass, LogicalLocation.class, "LogicalLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_Long(), ecorePackage.getEDouble(), "long", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Lat(), ecorePackage.getEDouble(), "lat", "0.0", 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Alt(), ecorePackage.getEDouble(), "alt", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polygonEClass, Polygon.class, "Polygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolygon_Segment(), this.getPolyline(), null, "segment", null, 3, -1, Polygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(circleEClass, Circle.class, "Circle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCircle_Center(), this.getPoint(), null, "center", null, 1, 1, Circle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircle_Radius(), ecorePackage.getEDouble(), "radius", null, 0, 1, Circle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polylineEClass, Polyline.class, "Polyline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolyline_Start(), this.getPoint(), null, "start", null, 1, 1, Polyline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolyline_End(), this.getPoint(), null, "end", null, 1, 1, Polyline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeDirectionEClass, RelativeDirection.class, "RelativeDirection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelativeDirection_Relativelocation(), this.getRelativeLocation(), this.getRelativeLocation_Relativedirection(), "relativelocation", null, 1, -1, RelativeDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeDirection_IdDirection(), ecorePackage.getEString(), "idDirection", null, 0, 1, RelativeDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalDirectionEClass, CardinalDirection.class, "CardinalDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinalDirection_Direction(), this.getCardinalType(), "direction", null, 0, 1, CardinalDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinalDirection_Angle(), ecorePackage.getEDouble(), "angle", null, 0, 1, CardinalDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualitativeDirectionEClass, QualitativeDirection.class, "QualitativeDirection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualitativeDirection_Direction(), this.getQualitativeType(), "direction", null, 0, 1, QualitativeDirection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalContextEClass, TemporalContext.class, "TemporalContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalContext_Timeexpression(), this.getTimeExpression(), null, "timeexpression", null, 1, -1, TemporalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(timeUnitTypeEEnum, TimeUnitType.class, "TimeUnitType");
		addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.SECOND);
		addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.MINUTE);
		addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.HOUR);
		addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.DAY);
		addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.MONTH);
		addEEnumLiteral(timeUnitTypeEEnum, TimeUnitType.YEAR);

		initEEnum(dayTypeEEnum, DayType.class, "DayType");
		addEEnumLiteral(dayTypeEEnum, DayType.MONDAY);
		addEEnumLiteral(dayTypeEEnum, DayType.TUESDAY);
		addEEnumLiteral(dayTypeEEnum, DayType.WEDNESDAY);
		addEEnumLiteral(dayTypeEEnum, DayType.THURSDAY);
		addEEnumLiteral(dayTypeEEnum, DayType.FRIDAY);
		addEEnumLiteral(dayTypeEEnum, DayType.SATURDAY);
		addEEnumLiteral(dayTypeEEnum, DayType.SUNDAY);

		initEEnum(cardinalTypeEEnum, CardinalType.class, "CardinalType");
		addEEnumLiteral(cardinalTypeEEnum, CardinalType.NORTH);
		addEEnumLiteral(cardinalTypeEEnum, CardinalType.EAST);
		addEEnumLiteral(cardinalTypeEEnum, CardinalType.SOUTH);
		addEEnumLiteral(cardinalTypeEEnum, CardinalType.WEST);
		addEEnumLiteral(cardinalTypeEEnum, CardinalType.NORTHEAST);
		addEEnumLiteral(cardinalTypeEEnum, CardinalType.SOUTHEAST);
		addEEnumLiteral(cardinalTypeEEnum, CardinalType.SOUTHWEST);
		addEEnumLiteral(cardinalTypeEEnum, CardinalType.NORTHWEST);

		initEEnum(qualitativeTypeEEnum, QualitativeType.class, "QualitativeType");
		addEEnumLiteral(qualitativeTypeEEnum, QualitativeType.INSIDE);
		addEEnumLiteral(qualitativeTypeEEnum, QualitativeType.OUTSIDE);
		addEEnumLiteral(qualitativeTypeEEnum, QualitativeType.AROUND);

		initEEnum(delegationTypeEEnum, delegationType.class, "delegationType");
		addEEnumLiteral(delegationTypeEEnum, delegationType.GRANT);
		addEEnumLiteral(delegationTypeEEnum, delegationType.STRONG);
		addEEnumLiteral(delegationTypeEEnum, delegationType.WEAK_STATIC);
		addEEnumLiteral(delegationTypeEEnum, delegationType.WEAK_DYNAMIC);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (getRole__GetCurrentAbsoluteTE__RBACUtility(), 
		   source, 
		   new String[] {
			 "body", "self.roleContextEnabling.oclAsType(TemporalContext).timeexpression.absolute->flatten()->asSet() \n\t\t\t-> select (i:AbsoluteTE| u.getCurrentTime().isContained(i.oclAsType(TimeInterval))= true) -> any (true) "
		   });	
		addAnnotation
		  (getRole__GetAlljuniors(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\n\t\t\tif self.juniors -> notEmpty() then\n\t             self.juniors-> asSet() -> union (self.juniors-> asSet()-> collect (r:Role| r.getAlljuniors()-> asSet())->asSet())\n\t            \n\t             else  \n\t              self.juniors\n\t             endif "
		   });	
		addAnnotation
		  (getRBACUtility__GetCurrentTime(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t        self.currentT "
		   });	
		addAnnotation
		  (getRBACUtility__GetDayOfWeek(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\tself.currentDay"
		   });	
		addAnnotation
		  (getAbsoluteTE__HasDuration(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\tself.duration -> notEmpty()"
		   });	
		addAnnotation
		  (getActivationDuration__GreaterThan__ActivationDuration(), 
		   source, 
		   new String[] {
			 "body", "self.timeUnit = d.timeUnit\n\t\t\t      and self.value> d.value"
		   });	
		addAnnotation
		  (getTimePoint__EqualTo__TimePoint(), 
		   source, 
		   new String[] {
			 "body", "self.day = t.day and \n\t\t\t      self.month = t.month and\n\t\t\t      self.year = t.year and\n\t\t\t      self.hour = t.hour and\n\t\t\t      self.minute = t.minute and\n\t\t\t      self.second = t.second"
		   });	
		addAnnotation
		  (getTimePoint__IsBefore__TimePoint(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t      if self.year < t.year then true \n\t\t\t      \telse\n\t\t\t             if self.year = t.year then \n\t\t\t             \tif  self.month < t.month then\n\t\t\t             \t\ttrue\n\t\t\t             \telse\n\t\t\t             \t \tif  self.month = t.month then \n\t\t\t             \t \t\n\t\t\t             \t \t\tif self.day < t.day then\n\t\t\t             \t \t\t   true\n\t\t\t             \t \t\telse\n\t\t\t             \t \t\t\tif self.day = t.day then \n\t\t\t             \t \t\t\t\tif self.hour < t.hour then\n\t\t\t             \t \t\t   true\n\t\t\t             \t \t\telse\n\t\t\t             \t \t\t\tif self.hour < t.hour then\n\t\t\t             \t \t\t\t\ttrue\n\t\t\t             \t \t\t\telse\n\t\t\t             \t \t\t\t\tif self.hour = t.hour then\n\t\t\t             \t \t\t\t\t\tif self.minute < t.minute then\n\t\t\t             \t \t\t\t\t\t\ttrue\n\t\t\t             \t \t\t\t\t\telse\n\t\t\t             \t \t\t\t\t\t\tif self.second < t.second then\n\t\t\t             \t \t\t\t\t\t\t\ttrue\n\t\t\t             \t \t\t\t\t\t\telse\n\t\t\t             \t \t\t\t\t\t\t\tfalse\n\t\t\t             \t \t\t\t\t\t\tendif\n\t\t\t             \t \t\t\t\t\tendif\n\t\t\t             \t \t\t\t\telse\n\t\t\t             \t \t\t\t\t\tfalse\n\t\t\t             \t \t\t\t\tendif\n\t\t\t             \t \t\t\tendif\n\t\t\t             \t \t\tendif\n\t\t\t             \t \t\t\telse\n\t\t\t             \t \t\t\t\tfalse\n\t\t\t             \t \t\t\tendif\n\t\t\t             \t \t\tendif\n\t\t\t             \t \telse\n\t\t\t             \t \t\tfalse\n\t\t\t             \t \tendif\n\t\t\t             \tendif\n\t\t\t             else\n\t\t\t             \tfalse\n\t\t\t             endif\n\t\t\t      endif"
		   });	
		addAnnotation
		  (getTimePoint__IsAfter__TimePoint(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t      if self.year > t.year then true \n\t\t\t      \telse\n\t\t\t             if self.year = t.year then \n\t\t\t             \tif  self.month > t.month then\n\t\t\t             \t\ttrue\n\t\t\t             \telse\n\t\t\t             \t \tif  self.month = t.month then \n\t\t\t             \t \t\n\t\t\t             \t \t\tif self.day > t.day then\n\t\t\t             \t \t\t   true\n\t\t\t             \t \t\telse\n\t\t\t             \t \t\t\tif self.day = t.day then \n\t\t\t             \t \t\t\t\tif self.hour > t.hour then\n\t\t\t             \t \t\t   true\n\t\t\t             \t \t\telse\n\t\t\t             \t \t\t\tif self.hour > t.hour then\n\t\t\t             \t \t\t\t\ttrue\n\t\t\t             \t \t\t\telse\n\t\t\t             \t \t\t\t\tif self.hour = t.hour then\n\t\t\t             \t \t\t\t\t\tif self.minute > t.minute then\n\t\t\t             \t \t\t\t\t\t\ttrue\n\t\t\t             \t \t\t\t\t\telse\n\t\t\t             \t \t\t\t\t\t\tif self.second > t.second then\n\t\t\t             \t \t\t\t\t\t\t\ttrue\n\t\t\t             \t \t\t\t\t\t\telse\n\t\t\t             \t \t\t\t\t\t\t\tfalse\n\t\t\t             \t \t\t\t\t\t\tendif\n\t\t\t             \t \t\t\t\t\tendif\n\t\t\t             \t \t\t\t\telse\n\t\t\t             \t \t\t\t\t\tfalse\n\t\t\t             \t \t\t\t\tendif\n\t\t\t             \t \t\t\tendif\n\t\t\t             \t \t\tendif\n\t\t\t             \t \t\t\telse\n\t\t\t             \t \t\t\t\tfalse\n\t\t\t             \t \t\t\tendif\n\t\t\t             \t \t\tendif\n\t\t\t             \t \telse\n\t\t\t             \t \t\tfalse\n\t\t\t             \t \tendif\n\t\t\t             \tendif\n\t\t\t             else\n\t\t\t             \tfalse\n\t\t\t             endif\n\t\t\t      endif"
		   });	
		addAnnotation
		  (getTimePoint__IsContained__TimeInterval(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t    self.equalTo(t.end) or (self.isBefore (t.end) and (self.isAfter(t.start) or self.equalTo(t.start)))\n\t\t\t      \n\t\t\t"
		   });	
		addAnnotation
		  (getComposedRelativeTE__CheckHours__RBACUtility(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\tlet hour :ecore::EInt = u.getCurrentTime().hour in \n\t\t\tif self.overlay -> notEmpty() and  self.overlay ->flatten() ->exists(a|a.oclIsTypeOf(HourOfDay) or \n \t    \t    a.oclAsType(RelativeTimeInterval).start.oclIsTypeOf(HourOfDay)) then\n\t\t\t\tself.overlay -> exists (h: ComposedRelativeTE|h.oclIsTypeOf(RelativeTimeInterval) = true \n \t    \t    \tand h.oclAsType(RelativeTimeInterval).start.oclIsTypeOf(HourOfDay) = true\n \t    \t    \tand h.oclAsType(RelativeTimeInterval).end.oclIsTypeOf(HourOfDay) = true and \n \t    \t    \th.oclAsType(RelativeTimeInterval).start.oclAsType(HourOfDay).hour <= hour   and\n \t    \t    \t(h.oclAsType(RelativeTimeInterval).end.oclAsType(HourOfDay).hour > hour or\n \t    \t    \t(h.oclAsType(RelativeTimeInterval).end.oclAsType(HourOfDay).hour = hour and u.getCurrentTime().minute = 0 )\n \t    \t    ))\n \t    \t else\n \t    \t \ttrue\n \t    \t endif\n \t    \t    "
		   });	
		addAnnotation
		  (getComposedRelativeTE__CheckDays__RBACUtility(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\tlet  day:RelativeTimePoint =  u.getDayOfWeek() in \n\t\t\tif self.overlay -> notEmpty()  and  self.overlay ->flatten() ->exists(a|a.oclIsTypeOf(DayOfWeek) or \n \t    \t    a.oclAsType(RelativeTimeInterval).start.oclIsTypeOf(DayOfWeek)) then\n\t\t\t\t /* relative time interval */\n\t\t\t\t self.overlay -> exists (t: ComposedRelativeTE|t.oclIsTypeOf(RelativeTimeInterval) = true and \n\t\t\t\t day.isContained(t.oclAsType(RelativeTimeInterval))  = true and\n                 t.checkHours(u)= true)  or \n                 /* relative time point */\n                 self.overlay -> exists (t:ComposedRelativeTE|t.oclIsTypeOf(DayOfWeek) = true and \n                 day.equalTo (t.oclAsType(DayOfWeek)) = true and\n       \t\t     t.checkHours(u)= true)\n \t    \t else\n \t    \t \ttrue\n \t    \t endif\n \t    \t    "
		   });	
		addAnnotation
		  (getComposedRelativeTE__CheckDaysRank__RBACUtility(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\tlet  day:RelativeTimePoint =  u.getDayOfWeek() in \n\t\t\tif self.overlay -> notEmpty()  and  self.overlay ->flatten() ->exists(a|a.oclIsTypeOf(DayOfWeek) or \n \t    \t    a.oclAsType(RelativeTimeInterval).start.oclIsTypeOf(DayOfWeek)) then \n \t    \t    /* relative time interval */\n \t    \t    self.overlay -> exists (t: ComposedRelativeTE|t.oclIsTypeOf(RelativeTimeInterval) = true and \n\t\t\t\t day.isContained(t.oclAsType(RelativeTimeInterval))  = true and day.rank = t.oclAsType(RelativeTimeInterval).start.oclAsType(DayOfWeek).rank and\n                 t.checkHours(u)= true) \n \t    \t    or\n \t    \t    /* relative time point */\n                 self.overlay -> exists (t:ComposedRelativeTE|t.oclIsTypeOf(DayOfWeek) = true and \n                 day.equalTo (t.oclAsType(DayOfWeek)) = true and day.rank = t.oclAsType(DayOfWeek).rank and\n       \t\t     t.checkHours(u)= true)\n \t    \t else\n \t    \t \ttrue\n \t    \t endif\n \t    \t    "
		   });	
		addAnnotation
		  (getRelativeTimePoint__IsContained__RelativeTimeInterval(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t      if self.oclIsTypeOf(DayOfWeek)  then\n\t\t\t            /*self.isBefore (t.end) and (self.isAfter(t.start) or self.equalTo(t.start)) */ \n\t\t\t          self.equalTo(t.start) or ( t.start.isBefore (self) and (t.end.isAfter(self) or self.equalTo(t.end)))\n\t\t\t             \n\t\t\t      else\n\t\t\t          false\n\t\t\t      endif"
		   });	
		addAnnotation
		  (getRelativeTimePoint__EqualTo__RelativeTimePoint(), 
		   source, 
		   new String[] {
			 "body", "if self.oclIsTypeOf(DayOfWeek) then\n\t\t\t             self.oclAsType(DayOfWeek).day = t.oclAsType(DayOfWeek).day \n\t\t\t      else\n\t\t\t          false\n\t\t\t      endif"
		   });	
		addAnnotation
		  (getRelativeTimePoint__IsAfter__RelativeTimePoint(), 
		   source, 
		   new String[] {
			 "body", "if self.oclIsTypeOf(DayOfWeek) then\n\t\t\t            let Days: OrderedSet(DayType) =OrderedSet{DayType::Monday, DayType::Tuesday, \n\t\t\t\t          DayType::Wednesday, DayType::Thursday, DayType::Friday, DayType::Saturday, DayType::Sunday}\n\t\t\t\t         in   Days-> indexOf (self.oclAsType(DayOfWeek).day) > Days-> indexOf (t.oclAsType(DayOfWeek).day)\n\t\t\t      else\n\t\t\t          false\n\t\t\t      endif"
		   });	
		addAnnotation
		  (getRelativeTimePoint__IsBefore__RelativeTimePoint(), 
		   source, 
		   new String[] {
			 "body", "if self.oclIsTypeOf(DayOfWeek) then\n\t\t\t             let Days: OrderedSet(DayType) =OrderedSet{DayType::Monday, DayType::Tuesday, \n\t\t\t\tDayType::Wednesday, DayType::Thursday, DayType::Friday, DayType::Saturday, DayType::Sunday}\n\t\t\t\t in   Days-> indexOf (self.oclAsType(DayOfWeek).day) < Days-> indexOf (t.oclAsType(DayOfWeek).day)\n\t\t\t      else\n\t\t\t          false\n\t\t\t      endif"
		   });	
		addAnnotation
		  (getLocation__Contains__Location(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t /* (self.label= \'zone1\' and l.label = \'A\') or\n\t\t\t  (self.label= \'zoneL1\' and l.label = \'A\') or\n\t\t\t  (self.label= \'zone3\' and l.label = \'C\'); */\n\t\t\t  (self.label= \'insideDarfurZone1\' and l.label = \'pJ\') or\n\t\t\t    (self.label= \'outsideDarfurZone1\' and l.label = \'pK\')"
		   });	
		addAnnotation
		  (getLocation__ComputeRelative__RelativeLocation(), 
		   source, 
		   new String[] {
			 "body", "\n\t\t\t      /*Location.allInstances()->select(l|l.label = \'zone3\')->any(true);*/\n\t\t\t      \n\t\t\t      if self.locationID = \'LLAgencyAdmin\' then\n\t\t\t        Location.allInstances()->select(l|l.label = \'outsideDarfurZone1\')->any(true)\n\t\t\t      else\n\t\t\t    \n\t\t\t        Location.allInstances()->select(l|l.label = \'insideDarfurZone1\')->any(true)\n\t\t\t    \n\t\t\t      endif"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmofAnnotations() {
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";	
		addAnnotation
		  (getCardinalDirection_Direction(), 
		   source, 
		   new String[] {
			 "body", "Polyline"
		   });	
		addAnnotation
		  (getCardinalDirection_Angle(), 
		   source, 
		   new String[] {
			 "body", "Polyline"
		   });
	}

} //GemRBACPackageImpl
