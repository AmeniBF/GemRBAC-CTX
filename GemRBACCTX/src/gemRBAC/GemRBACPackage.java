/**
 */
package gemRBAC;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gemRBAC.GemRBACFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface GemRBACPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gemRBAC";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/gemRBAC";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gemRBAC";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GemRBACPackage eINSTANCE = gemRBAC.impl.GemRBACPackageImpl.init();

	/**
	 * The meta object id for the '{@link gemRBAC.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.UserImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Id User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID_USER = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Sessions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SESSIONS = 2;

	/**
	 * The feature id for the '<em><b>Delegation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DELEGATION = 3;

	/**
	 * The feature id for the '<em><b>Recieveddelegation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__RECIEVEDDELEGATION = 4;

	/**
	 * The feature id for the '<em><b>Revocation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__REVOCATION = 5;

	/**
	 * The feature id for the '<em><b>Delegated Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DELEGATED_ROLES = 6;

	/**
	 * The feature id for the '<em><b>User Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_LOCATION = 7;

	/**
	 * The feature id for the '<em><b>User Log</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_LOG = 8;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Assign Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ASSIGN_ROLE__ROLE = 0;

	/**
	 * The operation id for the '<em>Access History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ACCESS_HISTORY = 1;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.RoleImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 1;

	/**
	 * The feature id for the '<em><b>Id Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__USERS = 1;

	/**
	 * The feature id for the '<em><b>Is Dependent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__IS_DEPENDENT = 2;

	/**
	 * The feature id for the '<em><b>Is Strong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__IS_STRONG = 3;

	/**
	 * The feature id for the '<em><b>Is Cascading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__IS_CASCADING = 4;

	/**
	 * The feature id for the '<em><b>Sessions A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SESSIONS_A = 5;

	/**
	 * The feature id for the '<em><b>Sessions E</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SESSIONS_E = 6;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PERMISSIONS = 7;

	/**
	 * The feature id for the '<em><b>Juniors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__JUNIORS = 8;

	/**
	 * The feature id for the '<em><b>Seniors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SENIORS = 9;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__USER = 10;

	/**
	 * The feature id for the '<em><b>Delegation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DELEGATION = 11;

	/**
	 * The feature id for the '<em><b>Role Context Assignment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_CONTEXT_ASSIGNMENT = 12;

	/**
	 * The feature id for the '<em><b>Role Context Enabling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_CONTEXT_ENABLING = 13;

	/**
	 * The feature id for the '<em><b>Log Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__LOG_ROLE = 14;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 15;

	/**
	 * The operation id for the '<em>Get Current Absolute TE</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_CURRENT_ABSOLUTE_TE__RBACUTILITY = 0;

	/**
	 * The operation id for the '<em>Assign Permission</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ASSIGN_PERMISSION__PERMISSION = 1;

	/**
	 * The operation id for the '<em>Access History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ACCESS_HISTORY = 2;

	/**
	 * The operation id for the '<em>Log BO Current Process Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___LOG_BO_CURRENT_PROCESS_INSTANCE = 3;

	/**
	 * The operation id for the '<em>Get Alljuniors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_ALLJUNIORS = 4;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.SessionImpl <em>Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.SessionImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getSession()
	 * @generated
	 */
	int SESSION = 2;

	/**
	 * The feature id for the '<em><b>Id Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__ID_SESSION = 0;

	/**
	 * The feature id for the '<em><b>Active Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__ACTIVE_ROLES = 1;

	/**
	 * The feature id for the '<em><b>Enabled Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__ENABLED_ROLES = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION__USER = 3;

	/**
	 * The number of structural features of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Access History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION___ACCESS_HISTORY = 0;

	/**
	 * The operation id for the '<em>Enable Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION___ENABLE_ROLE__ROLE = 1;

	/**
	 * The operation id for the '<em>Disable Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION___DISABLE_ROLE__ROLE = 2;

	/**
	 * The operation id for the '<em>Activate Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION___ACTIVATE_ROLE__ROLE = 3;

	/**
	 * The operation id for the '<em>Deactivate Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION___DEACTIVATE_ROLE__ROLE = 4;

	/**
	 * The operation id for the '<em>Perform Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION___PERFORM_OPERATION__OPERATION_PERMISSION_ROLE = 5;

	/**
	 * The operation id for the '<em>Delegate Role</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION___DELEGATE_ROLE__ROLE = 6;

	/**
	 * The number of operations of the '<em>Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.PermissionImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 3;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__ROLES = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__OPERATIONS = 1;

	/**
	 * The feature id for the '<em><b>Id Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__ID_PERMISSION = 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Delegation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__DELEGATION = 4;

	/**
	 * The feature id for the '<em><b>Log Permission</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__LOG_PERMISSION = 5;

	/**
	 * The feature id for the '<em><b>Permission Context Assignment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PERMISSION_CONTEXT_ASSIGNMENT = 6;

	/**
	 * The feature id for the '<em><b>Permission Context Enabling</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PERMISSION_CONTEXT_ENABLING = 7;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.OperationImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Id Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ID_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PERMISSIONS = 1;

	/**
	 * The feature id for the '<em><b>Log Operation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LOG_OPERATION = 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Access History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION___ACCESS_HISTORY = 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.ObjectImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Id Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ID_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__PERMISSIONS = 1;

	/**
	 * The feature id for the '<em><b>Log Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__LOG_OBJECT = 2;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Access History</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT___ACCESS_HISTORY = 0;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.RBACContextImpl <em>RBAC Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.RBACContextImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getRBACContext()
	 * @generated
	 */
	int RBAC_CONTEXT = 6;

	/**
	 * The feature id for the '<em><b>Log Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_CONTEXT__LOG_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>P1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_CONTEXT__P1 = 1;

	/**
	 * The feature id for the '<em><b>P2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_CONTEXT__P2 = 2;

	/**
	 * The feature id for the '<em><b>R1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_CONTEXT__R1 = 3;

	/**
	 * The feature id for the '<em><b>R2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_CONTEXT__R2 = 4;

	/**
	 * The feature id for the '<em><b>Id Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_CONTEXT__ID_CONTEXT = 5;

	/**
	 * The number of structural features of the '<em>RBAC Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_CONTEXT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Check Access</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_CONTEXT___CHECK_ACCESS__RBACCONTEXT = 0;

	/**
	 * The number of operations of the '<em>RBAC Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_CONTEXT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.TimeExpressionImpl <em>Time Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.TimeExpressionImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getTimeExpression()
	 * @generated
	 */
	int TIME_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Absolute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__ABSOLUTE = 0;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__RELATIVE = 1;

	/**
	 * The feature id for the '<em><b>Id Time Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION__ID_TIME_EXPR = 2;

	/**
	 * The number of structural features of the '<em>Time Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Time Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.SpatialContextImpl <em>Spatial Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.SpatialContextImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getSpatialContext()
	 * @generated
	 */
	int SPATIAL_CONTEXT = 8;

	/**
	 * The feature id for the '<em><b>Log Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONTEXT__LOG_CONTEXT = RBAC_CONTEXT__LOG_CONTEXT;

	/**
	 * The feature id for the '<em><b>P1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONTEXT__P1 = RBAC_CONTEXT__P1;

	/**
	 * The feature id for the '<em><b>P2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONTEXT__P2 = RBAC_CONTEXT__P2;

	/**
	 * The feature id for the '<em><b>R1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONTEXT__R1 = RBAC_CONTEXT__R1;

	/**
	 * The feature id for the '<em><b>R2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONTEXT__R2 = RBAC_CONTEXT__R2;

	/**
	 * The feature id for the '<em><b>Id Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONTEXT__ID_CONTEXT = RBAC_CONTEXT__ID_CONTEXT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONTEXT__LABEL = RBAC_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONTEXT__LOCATION = RBAC_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spatial Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONTEXT_FEATURE_COUNT = RBAC_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Check Access</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONTEXT___CHECK_ACCESS__RBACCONTEXT = RBAC_CONTEXT___CHECK_ACCESS__RBACCONTEXT;

	/**
	 * The number of operations of the '<em>Spatial Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONTEXT_OPERATION_COUNT = RBAC_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.DelegationImpl <em>Delegation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.DelegationImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getDelegation()
	 * @generated
	 */
	int DELEGATION = 9;

	/**
	 * The feature id for the '<em><b>Id Delegation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__ID_DELEGATION = 0;

	/**
	 * The feature id for the '<em><b>Is Revoked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__IS_REVOKED = 1;

	/**
	 * The feature id for the '<em><b>Is Transfer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__IS_TRANSFER = 2;

	/**
	 * The feature id for the '<em><b>Is Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__IS_TOTAL = 3;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__START_DATE = 4;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__END_DATE = 5;

	/**
	 * The feature id for the '<em><b>Delegator User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__DELEGATOR_USER = 6;

	/**
	 * The feature id for the '<em><b>Delegate User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__DELEGATE_USER = 7;

	/**
	 * The feature id for the '<em><b>Revoking User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__REVOKING_USER = 8;

	/**
	 * The feature id for the '<em><b>Delegated Delegation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__DELEGATED_DELEGATION = 9;

	/**
	 * The feature id for the '<em><b>Delegated Permissions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__DELEGATED_PERMISSIONS = 10;

	/**
	 * The feature id for the '<em><b>Max Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__MAX_DEPTH = 11;

	/**
	 * The feature id for the '<em><b>Delegated Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__DELEGATED_ROLE = 12;

	/**
	 * The number of structural features of the '<em>Delegation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_FEATURE_COUNT = 13;

	/**
	 * The operation id for the '<em>Revoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___REVOKE = 0;

	/**
	 * The operation id for the '<em>Get Absolute Delegation Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION___GET_ABSOLUTE_DELEGATION_PATH = 1;

	/**
	 * The number of operations of the '<em>Delegation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.HistoryImpl <em>History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.HistoryImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getHistory()
	 * @generated
	 */
	int HISTORY = 10;

	/**
	 * The feature id for the '<em><b>Id Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__ID_LOG = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__OP = 3;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__PERMISSION = 4;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__CONTEXT = 5;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__USER = 6;

	/**
	 * The number of structural features of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.RootImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 11;

	/**
	 * The feature id for the '<em><b>Sys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__SYS = 0;

	/**
	 * The feature id for the '<em><b>Obj</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__OBJ = 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__OP = 2;

	/**
	 * The feature id for the '<em><b>C</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__C = 3;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__P = 4;

	/**
	 * The feature id for the '<em><b>R</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__R = 5;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__S = 6;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__U = 7;

	/**
	 * The feature id for the '<em><b>D</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__D = 8;

	/**
	 * The feature id for the '<em><b>Log</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__LOG = 9;

	/**
	 * The feature id for the '<em><b>Dur</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__DUR = 10;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__PERIOD = 11;

	/**
	 * The feature id for the '<em><b>Rloc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__RLOC = 12;

	/**
	 * The feature id for the '<em><b>Rd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__RD = 13;

	/**
	 * The feature id for the '<em><b>Loc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__LOC = 14;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.RBACUtilityImpl <em>RBAC Utility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.RBACUtilityImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getRBACUtility()
	 * @generated
	 */
	int RBAC_UTILITY = 12;

	/**
	 * The feature id for the '<em><b>Max Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_UTILITY__MAX_PERMISSION = 0;

	/**
	 * The feature id for the '<em><b>Max Active Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_UTILITY__MAX_ACTIVE_ROLE = 1;

	/**
	 * The feature id for the '<em><b>Max Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_UTILITY__MAX_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Business Task List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_UTILITY__BUSINESS_TASK_LIST = 3;

	/**
	 * The feature id for the '<em><b>Bounded Permissions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_UTILITY__BOUNDED_PERMISSIONS = 4;

	/**
	 * The feature id for the '<em><b>Current T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_UTILITY__CURRENT_T = 5;

	/**
	 * The feature id for the '<em><b>Current Day</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_UTILITY__CURRENT_DAY = 6;

	/**
	 * The number of structural features of the '<em>RBAC Utility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_UTILITY_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get Bound Permission</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_UTILITY___GET_BOUND_PERMISSION = 0;

	/**
	 * The operation id for the '<em>Get Current Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_UTILITY___GET_CURRENT_DATE = 1;

	/**
	 * The operation id for the '<em>Get Current Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_UTILITY___GET_CURRENT_TIME = 2;

	/**
	 * The operation id for the '<em>Get Day Of Week</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_UTILITY___GET_DAY_OF_WEEK = 3;

	/**
	 * The operation id for the '<em>Get Cumulative Active Duration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_UTILITY___GET_CUMULATIVE_ACTIVE_DURATION__ROLE_USER_TIMEUNITTYPE = 4;

	/**
	 * The operation id for the '<em>Get Active Duration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_UTILITY___GET_ACTIVE_DURATION__ROLE_TIMEUNITTYPE = 5;

	/**
	 * The number of operations of the '<em>RBAC Utility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBAC_UTILITY_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.AbsoluteTEImpl <em>Absolute TE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.AbsoluteTEImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getAbsoluteTE()
	 * @generated
	 */
	int ABSOLUTE_TE = 13;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TE__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Id Absolute TE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TE__ID_ABSOLUTE_TE = 1;

	/**
	 * The number of structural features of the '<em>Absolute TE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Has Duration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TE___HAS_DURATION = 0;

	/**
	 * The number of operations of the '<em>Absolute TE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSOLUTE_TE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.RelativeTEImpl <em>Relative TE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.RelativeTEImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getRelativeTE()
	 * @generated
	 */
	int RELATIVE_TE = 14;

	/**
	 * The feature id for the '<em><b>Id Relative TE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TE__ID_RELATIVE_TE = 0;

	/**
	 * The feature id for the '<em><b>D2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TE__D2 = 1;

	/**
	 * The number of structural features of the '<em>Relative TE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relative TE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.ActivationDurationImpl <em>Activation Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.ActivationDurationImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getActivationDuration()
	 * @generated
	 */
	int ACTIVATION_DURATION = 15;

	/**
	 * The feature id for the '<em><b>Id Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_DURATION__ID_DURATION = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_DURATION__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_DURATION__TIME_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Is Continous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_DURATION__IS_CONTINOUS = 3;

	/**
	 * The feature id for the '<em><b>Aexp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_DURATION__AEXP = 4;

	/**
	 * The feature id for the '<em><b>Rexp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_DURATION__REXP = 5;

	/**
	 * The number of structural features of the '<em>Activation Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_DURATION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Greater Than</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_DURATION___GREATER_THAN__ACTIVATIONDURATION = 0;

	/**
	 * The number of operations of the '<em>Activation Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_DURATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.TimePointImpl <em>Time Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.TimePointImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getTimePoint()
	 * @generated
	 */
	int TIME_POINT = 16;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__DURATION = ABSOLUTE_TE__DURATION;

	/**
	 * The feature id for the '<em><b>Id Absolute TE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__ID_ABSOLUTE_TE = ABSOLUTE_TE__ID_ABSOLUTE_TE;

	/**
	 * The feature id for the '<em><b>Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__SECOND = ABSOLUTE_TE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__MINUTE = ABSOLUTE_TE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__HOUR = ABSOLUTE_TE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__DAY = ABSOLUTE_TE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__MONTH = ABSOLUTE_TE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT__YEAR = ABSOLUTE_TE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT_FEATURE_COUNT = ABSOLUTE_TE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Has Duration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT___HAS_DURATION = ABSOLUTE_TE___HAS_DURATION;

	/**
	 * The operation id for the '<em>Equal To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT___EQUAL_TO__TIMEPOINT = ABSOLUTE_TE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT___IS_BEFORE__TIMEPOINT = ABSOLUTE_TE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT___IS_AFTER__TIMEPOINT = ABSOLUTE_TE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Contained</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT___IS_CONTAINED__TIMEINTERVAL = ABSOLUTE_TE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_POINT_OPERATION_COUNT = ABSOLUTE_TE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.TimeIntervalImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getTimeInterval()
	 * @generated
	 */
	int TIME_INTERVAL = 17;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__DURATION = ABSOLUTE_TE__DURATION;

	/**
	 * The feature id for the '<em><b>Id Absolute TE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__ID_ABSOLUTE_TE = ABSOLUTE_TE__ID_ABSOLUTE_TE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__START = ABSOLUTE_TE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__END = ABSOLUTE_TE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_FEATURE_COUNT = ABSOLUTE_TE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Duration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL___HAS_DURATION = ABSOLUTE_TE___HAS_DURATION;

	/**
	 * The number of operations of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_OPERATION_COUNT = ABSOLUTE_TE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.ComposedRelativeTEImpl <em>Composed Relative TE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.ComposedRelativeTEImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getComposedRelativeTE()
	 * @generated
	 */
	int COMPOSED_RELATIVE_TE = 18;

	/**
	 * The feature id for the '<em><b>Id Relative TE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_RELATIVE_TE__ID_RELATIVE_TE = RELATIVE_TE__ID_RELATIVE_TE;

	/**
	 * The feature id for the '<em><b>D2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_RELATIVE_TE__D2 = RELATIVE_TE__D2;

	/**
	 * The feature id for the '<em><b>Overlay</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_RELATIVE_TE__OVERLAY = RELATIVE_TE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composed Relative TE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_RELATIVE_TE_FEATURE_COUNT = RELATIVE_TE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Hours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_RELATIVE_TE___CHECK_HOURS__RBACUTILITY = RELATIVE_TE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Days</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_RELATIVE_TE___CHECK_DAYS__RBACUTILITY = RELATIVE_TE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Days Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_RELATIVE_TE___CHECK_DAYS_RANK__RBACUTILITY = RELATIVE_TE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composed Relative TE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_RELATIVE_TE_OPERATION_COUNT = RELATIVE_TE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.RelativeTimeIntervalImpl <em>Relative Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.RelativeTimeIntervalImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getRelativeTimeInterval()
	 * @generated
	 */
	int RELATIVE_TIME_INTERVAL = 19;

	/**
	 * The feature id for the '<em><b>Id Relative TE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_INTERVAL__ID_RELATIVE_TE = COMPOSED_RELATIVE_TE__ID_RELATIVE_TE;

	/**
	 * The feature id for the '<em><b>D2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_INTERVAL__D2 = COMPOSED_RELATIVE_TE__D2;

	/**
	 * The feature id for the '<em><b>Overlay</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_INTERVAL__OVERLAY = COMPOSED_RELATIVE_TE__OVERLAY;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_INTERVAL__START = COMPOSED_RELATIVE_TE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_INTERVAL__END = COMPOSED_RELATIVE_TE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relative Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_INTERVAL_FEATURE_COUNT = COMPOSED_RELATIVE_TE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Check Hours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_INTERVAL___CHECK_HOURS__RBACUTILITY = COMPOSED_RELATIVE_TE___CHECK_HOURS__RBACUTILITY;

	/**
	 * The operation id for the '<em>Check Days</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_INTERVAL___CHECK_DAYS__RBACUTILITY = COMPOSED_RELATIVE_TE___CHECK_DAYS__RBACUTILITY;

	/**
	 * The operation id for the '<em>Check Days Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_INTERVAL___CHECK_DAYS_RANK__RBACUTILITY = COMPOSED_RELATIVE_TE___CHECK_DAYS_RANK__RBACUTILITY;

	/**
	 * The number of operations of the '<em>Relative Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_INTERVAL_OPERATION_COUNT = COMPOSED_RELATIVE_TE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.RelativeTimePointImpl <em>Relative Time Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.RelativeTimePointImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getRelativeTimePoint()
	 * @generated
	 */
	int RELATIVE_TIME_POINT = 20;

	/**
	 * The feature id for the '<em><b>Id Relative TE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_POINT__ID_RELATIVE_TE = COMPOSED_RELATIVE_TE__ID_RELATIVE_TE;

	/**
	 * The feature id for the '<em><b>D2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_POINT__D2 = COMPOSED_RELATIVE_TE__D2;

	/**
	 * The feature id for the '<em><b>Overlay</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_POINT__OVERLAY = COMPOSED_RELATIVE_TE__OVERLAY;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_POINT__RANK = COMPOSED_RELATIVE_TE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relative Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_POINT_FEATURE_COUNT = COMPOSED_RELATIVE_TE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Hours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_POINT___CHECK_HOURS__RBACUTILITY = COMPOSED_RELATIVE_TE___CHECK_HOURS__RBACUTILITY;

	/**
	 * The operation id for the '<em>Check Days</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_POINT___CHECK_DAYS__RBACUTILITY = COMPOSED_RELATIVE_TE___CHECK_DAYS__RBACUTILITY;

	/**
	 * The operation id for the '<em>Check Days Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_POINT___CHECK_DAYS_RANK__RBACUTILITY = COMPOSED_RELATIVE_TE___CHECK_DAYS_RANK__RBACUTILITY;

	/**
	 * The operation id for the '<em>Is Contained</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_POINT___IS_CONTAINED__RELATIVETIMEINTERVAL = COMPOSED_RELATIVE_TE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Equal To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_POINT___EQUAL_TO__RELATIVETIMEPOINT = COMPOSED_RELATIVE_TE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_POINT___IS_AFTER__RELATIVETIMEPOINT = COMPOSED_RELATIVE_TE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_POINT___IS_BEFORE__RELATIVETIMEPOINT = COMPOSED_RELATIVE_TE_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relative Time Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_TIME_POINT_OPERATION_COUNT = COMPOSED_RELATIVE_TE_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.DayOfWeekImpl <em>Day Of Week</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.DayOfWeekImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getDayOfWeek()
	 * @generated
	 */
	int DAY_OF_WEEK = 21;

	/**
	 * The feature id for the '<em><b>Id Relative TE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_WEEK__ID_RELATIVE_TE = RELATIVE_TIME_POINT__ID_RELATIVE_TE;

	/**
	 * The feature id for the '<em><b>D2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_WEEK__D2 = RELATIVE_TIME_POINT__D2;

	/**
	 * The feature id for the '<em><b>Overlay</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_WEEK__OVERLAY = RELATIVE_TIME_POINT__OVERLAY;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_WEEK__RANK = RELATIVE_TIME_POINT__RANK;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_WEEK__DAY = RELATIVE_TIME_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Day Of Week</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_WEEK_FEATURE_COUNT = RELATIVE_TIME_POINT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Hours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_WEEK___CHECK_HOURS__RBACUTILITY = RELATIVE_TIME_POINT___CHECK_HOURS__RBACUTILITY;

	/**
	 * The operation id for the '<em>Check Days</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_WEEK___CHECK_DAYS__RBACUTILITY = RELATIVE_TIME_POINT___CHECK_DAYS__RBACUTILITY;

	/**
	 * The operation id for the '<em>Check Days Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_WEEK___CHECK_DAYS_RANK__RBACUTILITY = RELATIVE_TIME_POINT___CHECK_DAYS_RANK__RBACUTILITY;

	/**
	 * The operation id for the '<em>Is Contained</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_WEEK___IS_CONTAINED__RELATIVETIMEINTERVAL = RELATIVE_TIME_POINT___IS_CONTAINED__RELATIVETIMEINTERVAL;

	/**
	 * The operation id for the '<em>Equal To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_WEEK___EQUAL_TO__RELATIVETIMEPOINT = RELATIVE_TIME_POINT___EQUAL_TO__RELATIVETIMEPOINT;

	/**
	 * The operation id for the '<em>Is After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_WEEK___IS_AFTER__RELATIVETIMEPOINT = RELATIVE_TIME_POINT___IS_AFTER__RELATIVETIMEPOINT;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_WEEK___IS_BEFORE__RELATIVETIMEPOINT = RELATIVE_TIME_POINT___IS_BEFORE__RELATIVETIMEPOINT;

	/**
	 * The number of operations of the '<em>Day Of Week</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_WEEK_OPERATION_COUNT = RELATIVE_TIME_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.DayOfMonthImpl <em>Day Of Month</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.DayOfMonthImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getDayOfMonth()
	 * @generated
	 */
	int DAY_OF_MONTH = 22;

	/**
	 * The feature id for the '<em><b>Id Relative TE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_MONTH__ID_RELATIVE_TE = RELATIVE_TIME_POINT__ID_RELATIVE_TE;

	/**
	 * The feature id for the '<em><b>D2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_MONTH__D2 = RELATIVE_TIME_POINT__D2;

	/**
	 * The feature id for the '<em><b>Overlay</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_MONTH__OVERLAY = RELATIVE_TIME_POINT__OVERLAY;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_MONTH__RANK = RELATIVE_TIME_POINT__RANK;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_MONTH__DAY = RELATIVE_TIME_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_MONTH__MONTH = RELATIVE_TIME_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Day Of Month</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_MONTH_FEATURE_COUNT = RELATIVE_TIME_POINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Check Hours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_MONTH___CHECK_HOURS__RBACUTILITY = RELATIVE_TIME_POINT___CHECK_HOURS__RBACUTILITY;

	/**
	 * The operation id for the '<em>Check Days</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_MONTH___CHECK_DAYS__RBACUTILITY = RELATIVE_TIME_POINT___CHECK_DAYS__RBACUTILITY;

	/**
	 * The operation id for the '<em>Check Days Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_MONTH___CHECK_DAYS_RANK__RBACUTILITY = RELATIVE_TIME_POINT___CHECK_DAYS_RANK__RBACUTILITY;

	/**
	 * The operation id for the '<em>Is Contained</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_MONTH___IS_CONTAINED__RELATIVETIMEINTERVAL = RELATIVE_TIME_POINT___IS_CONTAINED__RELATIVETIMEINTERVAL;

	/**
	 * The operation id for the '<em>Equal To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_MONTH___EQUAL_TO__RELATIVETIMEPOINT = RELATIVE_TIME_POINT___EQUAL_TO__RELATIVETIMEPOINT;

	/**
	 * The operation id for the '<em>Is After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_MONTH___IS_AFTER__RELATIVETIMEPOINT = RELATIVE_TIME_POINT___IS_AFTER__RELATIVETIMEPOINT;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_MONTH___IS_BEFORE__RELATIVETIMEPOINT = RELATIVE_TIME_POINT___IS_BEFORE__RELATIVETIMEPOINT;

	/**
	 * The number of operations of the '<em>Day Of Month</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OF_MONTH_OPERATION_COUNT = RELATIVE_TIME_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.MonthOfYearImpl <em>Month Of Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.MonthOfYearImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getMonthOfYear()
	 * @generated
	 */
	int MONTH_OF_YEAR = 23;

	/**
	 * The feature id for the '<em><b>Id Relative TE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OF_YEAR__ID_RELATIVE_TE = RELATIVE_TIME_POINT__ID_RELATIVE_TE;

	/**
	 * The feature id for the '<em><b>D2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OF_YEAR__D2 = RELATIVE_TIME_POINT__D2;

	/**
	 * The feature id for the '<em><b>Overlay</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OF_YEAR__OVERLAY = RELATIVE_TIME_POINT__OVERLAY;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OF_YEAR__RANK = RELATIVE_TIME_POINT__RANK;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OF_YEAR__MONTH = RELATIVE_TIME_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Month Of Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OF_YEAR_FEATURE_COUNT = RELATIVE_TIME_POINT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Hours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OF_YEAR___CHECK_HOURS__RBACUTILITY = RELATIVE_TIME_POINT___CHECK_HOURS__RBACUTILITY;

	/**
	 * The operation id for the '<em>Check Days</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OF_YEAR___CHECK_DAYS__RBACUTILITY = RELATIVE_TIME_POINT___CHECK_DAYS__RBACUTILITY;

	/**
	 * The operation id for the '<em>Check Days Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OF_YEAR___CHECK_DAYS_RANK__RBACUTILITY = RELATIVE_TIME_POINT___CHECK_DAYS_RANK__RBACUTILITY;

	/**
	 * The operation id for the '<em>Is Contained</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OF_YEAR___IS_CONTAINED__RELATIVETIMEINTERVAL = RELATIVE_TIME_POINT___IS_CONTAINED__RELATIVETIMEINTERVAL;

	/**
	 * The operation id for the '<em>Equal To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OF_YEAR___EQUAL_TO__RELATIVETIMEPOINT = RELATIVE_TIME_POINT___EQUAL_TO__RELATIVETIMEPOINT;

	/**
	 * The operation id for the '<em>Is After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OF_YEAR___IS_AFTER__RELATIVETIMEPOINT = RELATIVE_TIME_POINT___IS_AFTER__RELATIVETIMEPOINT;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OF_YEAR___IS_BEFORE__RELATIVETIMEPOINT = RELATIVE_TIME_POINT___IS_BEFORE__RELATIVETIMEPOINT;

	/**
	 * The number of operations of the '<em>Month Of Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OF_YEAR_OPERATION_COUNT = RELATIVE_TIME_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.HourOfDayImpl <em>Hour Of Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.HourOfDayImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getHourOfDay()
	 * @generated
	 */
	int HOUR_OF_DAY = 24;

	/**
	 * The feature id for the '<em><b>Id Relative TE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_OF_DAY__ID_RELATIVE_TE = RELATIVE_TIME_POINT__ID_RELATIVE_TE;

	/**
	 * The feature id for the '<em><b>D2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_OF_DAY__D2 = RELATIVE_TIME_POINT__D2;

	/**
	 * The feature id for the '<em><b>Overlay</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_OF_DAY__OVERLAY = RELATIVE_TIME_POINT__OVERLAY;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_OF_DAY__RANK = RELATIVE_TIME_POINT__RANK;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_OF_DAY__HOUR = RELATIVE_TIME_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_OF_DAY__MINUTE = RELATIVE_TIME_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hour Of Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_OF_DAY_FEATURE_COUNT = RELATIVE_TIME_POINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Check Hours</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_OF_DAY___CHECK_HOURS__RBACUTILITY = RELATIVE_TIME_POINT___CHECK_HOURS__RBACUTILITY;

	/**
	 * The operation id for the '<em>Check Days</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_OF_DAY___CHECK_DAYS__RBACUTILITY = RELATIVE_TIME_POINT___CHECK_DAYS__RBACUTILITY;

	/**
	 * The operation id for the '<em>Check Days Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_OF_DAY___CHECK_DAYS_RANK__RBACUTILITY = RELATIVE_TIME_POINT___CHECK_DAYS_RANK__RBACUTILITY;

	/**
	 * The operation id for the '<em>Is Contained</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_OF_DAY___IS_CONTAINED__RELATIVETIMEINTERVAL = RELATIVE_TIME_POINT___IS_CONTAINED__RELATIVETIMEINTERVAL;

	/**
	 * The operation id for the '<em>Equal To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_OF_DAY___EQUAL_TO__RELATIVETIMEPOINT = RELATIVE_TIME_POINT___EQUAL_TO__RELATIVETIMEPOINT;

	/**
	 * The operation id for the '<em>Is After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_OF_DAY___IS_AFTER__RELATIVETIMEPOINT = RELATIVE_TIME_POINT___IS_AFTER__RELATIVETIMEPOINT;

	/**
	 * The operation id for the '<em>Is Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_OF_DAY___IS_BEFORE__RELATIVETIMEPOINT = RELATIVE_TIME_POINT___IS_BEFORE__RELATIVETIMEPOINT;

	/**
	 * The number of operations of the '<em>Hour Of Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_OF_DAY_OPERATION_COUNT = RELATIVE_TIME_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.PeriodicTimeImpl <em>Periodic Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.PeriodicTimeImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getPeriodicTime()
	 * @generated
	 */
	int PERIODIC_TIME = 25;

	/**
	 * The feature id for the '<em><b>Id Relative TE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIME__ID_RELATIVE_TE = RELATIVE_TE__ID_RELATIVE_TE;

	/**
	 * The feature id for the '<em><b>D2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIME__D2 = RELATIVE_TE__D2;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIME__FREQUENCY = RELATIVE_TE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIME__TIME_UNIT = RELATIVE_TE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id Periodic Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIME__ID_PERIODIC_TIME = RELATIVE_TE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIME__NEXT_START = RELATIVE_TE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Periodic Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIME_FEATURE_COUNT = RELATIVE_TE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Periodic Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIME_OPERATION_COUNT = RELATIVE_TE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.RelativeLocationImpl <em>Relative Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.RelativeLocationImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getRelativeLocation()
	 * @generated
	 */
	int RELATIVE_LOCATION = 26;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LOCATION__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Relative Loc ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LOCATION__RELATIVE_LOC_ID = 1;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LOCATION__DISTANCE = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LOCATION__UNIT = 3;

	/**
	 * The feature id for the '<em><b>Relativedirection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LOCATION__RELATIVEDIRECTION = 4;

	/**
	 * The number of structural features of the '<em>Relative Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LOCATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Relative Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.LocationImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 27;

	/**
	 * The feature id for the '<em><b>Relativelocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__RELATIVELOCATION = 0;

	/**
	 * The feature id for the '<em><b>Location ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LOCATION_ID = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Disjoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___DISJOINT__LOCATION = 0;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___CONTAINS__LOCATION = 1;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___OVERLAPS__LOCATION = 2;

	/**
	 * The operation id for the '<em>Compute Relative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___COMPUTE_RELATIVE__RELATIVELOCATION = 3;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.PhysicalLocationImpl <em>Physical Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.PhysicalLocationImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getPhysicalLocation()
	 * @generated
	 */
	int PHYSICAL_LOCATION = 28;

	/**
	 * The feature id for the '<em><b>Relativelocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION__RELATIVELOCATION = LOCATION__RELATIVELOCATION;

	/**
	 * The feature id for the '<em><b>Location ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION__LOCATION_ID = LOCATION__LOCATION_ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION__LABEL = LOCATION__LABEL;

	/**
	 * The number of structural features of the '<em>Physical Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Disjoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION___DISJOINT__LOCATION = LOCATION___DISJOINT__LOCATION;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION___CONTAINS__LOCATION = LOCATION___CONTAINS__LOCATION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION___OVERLAPS__LOCATION = LOCATION___OVERLAPS__LOCATION;

	/**
	 * The operation id for the '<em>Compute Relative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION___COMPUTE_RELATIVE__RELATIVELOCATION = LOCATION___COMPUTE_RELATIVE__RELATIVELOCATION;

	/**
	 * The number of operations of the '<em>Physical Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_LOCATION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.LogicalLocationImpl <em>Logical Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.LogicalLocationImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getLogicalLocation()
	 * @generated
	 */
	int LOGICAL_LOCATION = 29;

	/**
	 * The feature id for the '<em><b>Relativelocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_LOCATION__RELATIVELOCATION = LOCATION__RELATIVELOCATION;

	/**
	 * The feature id for the '<em><b>Location ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_LOCATION__LOCATION_ID = LOCATION__LOCATION_ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_LOCATION__LABEL = LOCATION__LABEL;

	/**
	 * The number of structural features of the '<em>Logical Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_LOCATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Disjoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_LOCATION___DISJOINT__LOCATION = LOCATION___DISJOINT__LOCATION;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_LOCATION___CONTAINS__LOCATION = LOCATION___CONTAINS__LOCATION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_LOCATION___OVERLAPS__LOCATION = LOCATION___OVERLAPS__LOCATION;

	/**
	 * The operation id for the '<em>Compute Relative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_LOCATION___COMPUTE_RELATIVE__RELATIVELOCATION = LOCATION___COMPUTE_RELATIVE__RELATIVELOCATION;

	/**
	 * The number of operations of the '<em>Logical Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_LOCATION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.PointImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 30;

	/**
	 * The feature id for the '<em><b>Relativelocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__RELATIVELOCATION = PHYSICAL_LOCATION__RELATIVELOCATION;

	/**
	 * The feature id for the '<em><b>Location ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__LOCATION_ID = PHYSICAL_LOCATION__LOCATION_ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__LABEL = PHYSICAL_LOCATION__LABEL;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__LONG = PHYSICAL_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__LAT = PHYSICAL_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__ALT = PHYSICAL_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = PHYSICAL_LOCATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Disjoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___DISJOINT__LOCATION = PHYSICAL_LOCATION___DISJOINT__LOCATION;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___CONTAINS__LOCATION = PHYSICAL_LOCATION___CONTAINS__LOCATION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___OVERLAPS__LOCATION = PHYSICAL_LOCATION___OVERLAPS__LOCATION;

	/**
	 * The operation id for the '<em>Compute Relative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___COMPUTE_RELATIVE__RELATIVELOCATION = PHYSICAL_LOCATION___COMPUTE_RELATIVE__RELATIVELOCATION;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = PHYSICAL_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.PolygonImpl <em>Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.PolygonImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getPolygon()
	 * @generated
	 */
	int POLYGON = 31;

	/**
	 * The feature id for the '<em><b>Relativelocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__RELATIVELOCATION = PHYSICAL_LOCATION__RELATIVELOCATION;

	/**
	 * The feature id for the '<em><b>Location ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LOCATION_ID = PHYSICAL_LOCATION__LOCATION_ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LABEL = PHYSICAL_LOCATION__LABEL;

	/**
	 * The feature id for the '<em><b>Segment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__SEGMENT = PHYSICAL_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FEATURE_COUNT = PHYSICAL_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Disjoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON___DISJOINT__LOCATION = PHYSICAL_LOCATION___DISJOINT__LOCATION;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON___CONTAINS__LOCATION = PHYSICAL_LOCATION___CONTAINS__LOCATION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON___OVERLAPS__LOCATION = PHYSICAL_LOCATION___OVERLAPS__LOCATION;

	/**
	 * The operation id for the '<em>Compute Relative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON___COMPUTE_RELATIVE__RELATIVELOCATION = PHYSICAL_LOCATION___COMPUTE_RELATIVE__RELATIVELOCATION;

	/**
	 * The number of operations of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_OPERATION_COUNT = PHYSICAL_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.CircleImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 32;

	/**
	 * The feature id for the '<em><b>Relativelocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__RELATIVELOCATION = PHYSICAL_LOCATION__RELATIVELOCATION;

	/**
	 * The feature id for the '<em><b>Location ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__LOCATION_ID = PHYSICAL_LOCATION__LOCATION_ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__LABEL = PHYSICAL_LOCATION__LABEL;

	/**
	 * The feature id for the '<em><b>Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CENTER = PHYSICAL_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__RADIUS = PHYSICAL_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = PHYSICAL_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Disjoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE___DISJOINT__LOCATION = PHYSICAL_LOCATION___DISJOINT__LOCATION;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE___CONTAINS__LOCATION = PHYSICAL_LOCATION___CONTAINS__LOCATION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE___OVERLAPS__LOCATION = PHYSICAL_LOCATION___OVERLAPS__LOCATION;

	/**
	 * The operation id for the '<em>Compute Relative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE___COMPUTE_RELATIVE__RELATIVELOCATION = PHYSICAL_LOCATION___COMPUTE_RELATIVE__RELATIVELOCATION;

	/**
	 * The number of operations of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_OPERATION_COUNT = PHYSICAL_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.PolylineImpl <em>Polyline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.PolylineImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getPolyline()
	 * @generated
	 */
	int POLYLINE = 33;

	/**
	 * The feature id for the '<em><b>Relativelocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__RELATIVELOCATION = PHYSICAL_LOCATION__RELATIVELOCATION;

	/**
	 * The feature id for the '<em><b>Location ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LOCATION_ID = PHYSICAL_LOCATION__LOCATION_ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__LABEL = PHYSICAL_LOCATION__LABEL;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__START = PHYSICAL_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE__END = PHYSICAL_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Polyline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_FEATURE_COUNT = PHYSICAL_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Disjoint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE___DISJOINT__LOCATION = PHYSICAL_LOCATION___DISJOINT__LOCATION;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE___CONTAINS__LOCATION = PHYSICAL_LOCATION___CONTAINS__LOCATION;

	/**
	 * The operation id for the '<em>Overlaps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE___OVERLAPS__LOCATION = PHYSICAL_LOCATION___OVERLAPS__LOCATION;

	/**
	 * The operation id for the '<em>Compute Relative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE___COMPUTE_RELATIVE__RELATIVELOCATION = PHYSICAL_LOCATION___COMPUTE_RELATIVE__RELATIVELOCATION;

	/**
	 * The number of operations of the '<em>Polyline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYLINE_OPERATION_COUNT = PHYSICAL_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.RelativeDirectionImpl <em>Relative Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.RelativeDirectionImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getRelativeDirection()
	 * @generated
	 */
	int RELATIVE_DIRECTION = 34;

	/**
	 * The feature id for the '<em><b>Relativelocation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_DIRECTION__RELATIVELOCATION = 0;

	/**
	 * The feature id for the '<em><b>Id Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_DIRECTION__ID_DIRECTION = 1;

	/**
	 * The number of structural features of the '<em>Relative Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_DIRECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relative Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_DIRECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.CardinalDirectionImpl <em>Cardinal Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.CardinalDirectionImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getCardinalDirection()
	 * @generated
	 */
	int CARDINAL_DIRECTION = 35;

	/**
	 * The feature id for the '<em><b>Relativelocation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINAL_DIRECTION__RELATIVELOCATION = RELATIVE_DIRECTION__RELATIVELOCATION;

	/**
	 * The feature id for the '<em><b>Id Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINAL_DIRECTION__ID_DIRECTION = RELATIVE_DIRECTION__ID_DIRECTION;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINAL_DIRECTION__DIRECTION = RELATIVE_DIRECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINAL_DIRECTION__ANGLE = RELATIVE_DIRECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cardinal Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINAL_DIRECTION_FEATURE_COUNT = RELATIVE_DIRECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cardinal Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINAL_DIRECTION_OPERATION_COUNT = RELATIVE_DIRECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.QualitativeDirectionImpl <em>Qualitative Direction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.QualitativeDirectionImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getQualitativeDirection()
	 * @generated
	 */
	int QUALITATIVE_DIRECTION = 36;

	/**
	 * The feature id for the '<em><b>Relativelocation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_DIRECTION__RELATIVELOCATION = RELATIVE_DIRECTION__RELATIVELOCATION;

	/**
	 * The feature id for the '<em><b>Id Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_DIRECTION__ID_DIRECTION = RELATIVE_DIRECTION__ID_DIRECTION;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_DIRECTION__DIRECTION = RELATIVE_DIRECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Qualitative Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_DIRECTION_FEATURE_COUNT = RELATIVE_DIRECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Qualitative Direction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_DIRECTION_OPERATION_COUNT = RELATIVE_DIRECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gemRBAC.impl.TemporalContextImpl <em>Temporal Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.impl.TemporalContextImpl
	 * @see gemRBAC.impl.GemRBACPackageImpl#getTemporalContext()
	 * @generated
	 */
	int TEMPORAL_CONTEXT = 37;

	/**
	 * The feature id for the '<em><b>Log Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT__LOG_CONTEXT = RBAC_CONTEXT__LOG_CONTEXT;

	/**
	 * The feature id for the '<em><b>P1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT__P1 = RBAC_CONTEXT__P1;

	/**
	 * The feature id for the '<em><b>P2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT__P2 = RBAC_CONTEXT__P2;

	/**
	 * The feature id for the '<em><b>R1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT__R1 = RBAC_CONTEXT__R1;

	/**
	 * The feature id for the '<em><b>R2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT__R2 = RBAC_CONTEXT__R2;

	/**
	 * The feature id for the '<em><b>Id Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT__ID_CONTEXT = RBAC_CONTEXT__ID_CONTEXT;

	/**
	 * The feature id for the '<em><b>Timeexpression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT__TIMEEXPRESSION = RBAC_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Temporal Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT_FEATURE_COUNT = RBAC_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Access</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT___CHECK_ACCESS__RBACCONTEXT = RBAC_CONTEXT___CHECK_ACCESS__RBACCONTEXT;

	/**
	 * The number of operations of the '<em>Temporal Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_CONTEXT_OPERATION_COUNT = RBAC_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gemRBAC.TimeUnitType <em>Time Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.TimeUnitType
	 * @see gemRBAC.impl.GemRBACPackageImpl#getTimeUnitType()
	 * @generated
	 */
	int TIME_UNIT_TYPE = 38;

	/**
	 * The meta object id for the '{@link gemRBAC.DayType <em>Day Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.DayType
	 * @see gemRBAC.impl.GemRBACPackageImpl#getDayType()
	 * @generated
	 */
	int DAY_TYPE = 39;

	/**
	 * The meta object id for the '{@link gemRBAC.CardinalType <em>Cardinal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.CardinalType
	 * @see gemRBAC.impl.GemRBACPackageImpl#getCardinalType()
	 * @generated
	 */
	int CARDINAL_TYPE = 40;

	/**
	 * The meta object id for the '{@link gemRBAC.QualitativeType <em>Qualitative Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.QualitativeType
	 * @see gemRBAC.impl.GemRBACPackageImpl#getQualitativeType()
	 * @generated
	 */
	int QUALITATIVE_TYPE = 41;

	/**
	 * The meta object id for the '{@link gemRBAC.delegationType <em>delegation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gemRBAC.delegationType
	 * @see gemRBAC.impl.GemRBACPackageImpl#getdelegationType()
	 * @generated
	 */
	int DELEGATION_TYPE = 42;


	/**
	 * Returns the meta object for class '{@link gemRBAC.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see gemRBAC.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.User#getIdUser <em>Id User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id User</em>'.
	 * @see gemRBAC.User#getIdUser()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_IdUser();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.User#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see gemRBAC.User#getRoles()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Roles();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.User#getSessions <em>Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sessions</em>'.
	 * @see gemRBAC.User#getSessions()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Sessions();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.User#getDelegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegation</em>'.
	 * @see gemRBAC.User#getDelegation()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Delegation();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.User#getRecieveddelegation <em>Recieveddelegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recieveddelegation</em>'.
	 * @see gemRBAC.User#getRecieveddelegation()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Recieveddelegation();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.User#getRevocation <em>Revocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Revocation</em>'.
	 * @see gemRBAC.User#getRevocation()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Revocation();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.User#getDelegatedRoles <em>Delegated Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegated Roles</em>'.
	 * @see gemRBAC.User#getDelegatedRoles()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_DelegatedRoles();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.User#getUserLocation <em>User Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Location</em>'.
	 * @see gemRBAC.User#getUserLocation()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_UserLocation();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.User#getUserLog <em>User Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Log</em>'.
	 * @see gemRBAC.User#getUserLog()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_UserLog();

	/**
	 * Returns the meta object for the '{@link gemRBAC.User#assignRole(gemRBAC.Role) <em>Assign Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assign Role</em>' operation.
	 * @see gemRBAC.User#assignRole(gemRBAC.Role)
	 * @generated
	 */
	EOperation getUser__AssignRole__Role();

	/**
	 * Returns the meta object for the '{@link gemRBAC.User#accessHistory() <em>Access History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Access History</em>' operation.
	 * @see gemRBAC.User#accessHistory()
	 * @generated
	 */
	EOperation getUser__AccessHistory();

	/**
	 * Returns the meta object for class '{@link gemRBAC.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see gemRBAC.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Role#getIdRole <em>Id Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Role</em>'.
	 * @see gemRBAC.Role#getIdRole()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_IdRole();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Role#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Users</em>'.
	 * @see gemRBAC.Role#getUsers()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Users();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Role#isIsDependent <em>Is Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Dependent</em>'.
	 * @see gemRBAC.Role#isIsDependent()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_IsDependent();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Role#isIsStrong <em>Is Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Strong</em>'.
	 * @see gemRBAC.Role#isIsStrong()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_IsStrong();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Role#isIsCascading <em>Is Cascading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cascading</em>'.
	 * @see gemRBAC.Role#isIsCascading()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_IsCascading();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Role#getSessionsA <em>Sessions A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sessions A</em>'.
	 * @see gemRBAC.Role#getSessionsA()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_SessionsA();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Role#getSessionsE <em>Sessions E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sessions E</em>'.
	 * @see gemRBAC.Role#getSessionsE()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_SessionsE();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Role#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Permissions</em>'.
	 * @see gemRBAC.Role#getPermissions()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Permissions();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Role#getJuniors <em>Juniors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Juniors</em>'.
	 * @see gemRBAC.Role#getJuniors()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Juniors();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Role#getSeniors <em>Seniors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Seniors</em>'.
	 * @see gemRBAC.Role#getSeniors()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Seniors();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Role#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User</em>'.
	 * @see gemRBAC.Role#getUser()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_User();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Role#getDelegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegation</em>'.
	 * @see gemRBAC.Role#getDelegation()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Delegation();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Role#getRoleContextAssignment <em>Role Context Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role Context Assignment</em>'.
	 * @see gemRBAC.Role#getRoleContextAssignment()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RoleContextAssignment();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Role#getRoleContextEnabling <em>Role Context Enabling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role Context Enabling</em>'.
	 * @see gemRBAC.Role#getRoleContextEnabling()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_RoleContextEnabling();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Role#getLogRole <em>Log Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Log Role</em>'.
	 * @see gemRBAC.Role#getLogRole()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_LogRole();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Role#getCurrentAbsoluteTE(gemRBAC.RBACUtility) <em>Get Current Absolute TE</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current Absolute TE</em>' operation.
	 * @see gemRBAC.Role#getCurrentAbsoluteTE(gemRBAC.RBACUtility)
	 * @generated
	 */
	EOperation getRole__GetCurrentAbsoluteTE__RBACUtility();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Role#assignPermission(gemRBAC.Permission) <em>Assign Permission</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assign Permission</em>' operation.
	 * @see gemRBAC.Role#assignPermission(gemRBAC.Permission)
	 * @generated
	 */
	EOperation getRole__AssignPermission__Permission();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Role#accessHistory() <em>Access History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Access History</em>' operation.
	 * @see gemRBAC.Role#accessHistory()
	 * @generated
	 */
	EOperation getRole__AccessHistory();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Role#logBOCurrentProcessInstance() <em>Log BO Current Process Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log BO Current Process Instance</em>' operation.
	 * @see gemRBAC.Role#logBOCurrentProcessInstance()
	 * @generated
	 */
	EOperation getRole__LogBOCurrentProcessInstance();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Role#getAlljuniors() <em>Get Alljuniors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Alljuniors</em>' operation.
	 * @see gemRBAC.Role#getAlljuniors()
	 * @generated
	 */
	EOperation getRole__GetAlljuniors();

	/**
	 * Returns the meta object for class '{@link gemRBAC.Session <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session</em>'.
	 * @see gemRBAC.Session
	 * @generated
	 */
	EClass getSession();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Session#getIdSession <em>Id Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Session</em>'.
	 * @see gemRBAC.Session#getIdSession()
	 * @see #getSession()
	 * @generated
	 */
	EAttribute getSession_IdSession();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Session#getActiveRoles <em>Active Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Active Roles</em>'.
	 * @see gemRBAC.Session#getActiveRoles()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_ActiveRoles();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Session#getEnabledRoles <em>Enabled Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enabled Roles</em>'.
	 * @see gemRBAC.Session#getEnabledRoles()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_EnabledRoles();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.Session#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see gemRBAC.Session#getUser()
	 * @see #getSession()
	 * @generated
	 */
	EReference getSession_User();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Session#accessHistory() <em>Access History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Access History</em>' operation.
	 * @see gemRBAC.Session#accessHistory()
	 * @generated
	 */
	EOperation getSession__AccessHistory();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Session#enableRole(gemRBAC.Role) <em>Enable Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enable Role</em>' operation.
	 * @see gemRBAC.Session#enableRole(gemRBAC.Role)
	 * @generated
	 */
	EOperation getSession__EnableRole__Role();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Session#disableRole(gemRBAC.Role) <em>Disable Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disable Role</em>' operation.
	 * @see gemRBAC.Session#disableRole(gemRBAC.Role)
	 * @generated
	 */
	EOperation getSession__DisableRole__Role();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Session#activateRole(gemRBAC.Role) <em>Activate Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Activate Role</em>' operation.
	 * @see gemRBAC.Session#activateRole(gemRBAC.Role)
	 * @generated
	 */
	EOperation getSession__ActivateRole__Role();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Session#deactivateRole(gemRBAC.Role) <em>Deactivate Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deactivate Role</em>' operation.
	 * @see gemRBAC.Session#deactivateRole(gemRBAC.Role)
	 * @generated
	 */
	EOperation getSession__DeactivateRole__Role();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Session#performOperation(gemRBAC.Operation, gemRBAC.Permission, gemRBAC.Role) <em>Perform Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform Operation</em>' operation.
	 * @see gemRBAC.Session#performOperation(gemRBAC.Operation, gemRBAC.Permission, gemRBAC.Role)
	 * @generated
	 */
	EOperation getSession__PerformOperation__Operation_Permission_Role();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Session#delegateRole(gemRBAC.Role) <em>Delegate Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delegate Role</em>' operation.
	 * @see gemRBAC.Session#delegateRole(gemRBAC.Role)
	 * @generated
	 */
	EOperation getSession__DelegateRole__Role();

	/**
	 * Returns the meta object for class '{@link gemRBAC.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see gemRBAC.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Permission#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see gemRBAC.Permission#getRoles()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Roles();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Permission#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operations</em>'.
	 * @see gemRBAC.Permission#getOperations()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Operations();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Permission#getIdPermission <em>Id Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Permission</em>'.
	 * @see gemRBAC.Permission#getIdPermission()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_IdPermission();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.Permission#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see gemRBAC.Permission#getObject()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Object();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Permission#getDelegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegation</em>'.
	 * @see gemRBAC.Permission#getDelegation()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Delegation();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Permission#getLogPermission <em>Log Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Log Permission</em>'.
	 * @see gemRBAC.Permission#getLogPermission()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_LogPermission();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Permission#getPermissionContextAssignment <em>Permission Context Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Permission Context Assignment</em>'.
	 * @see gemRBAC.Permission#getPermissionContextAssignment()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_PermissionContextAssignment();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Permission#getPermissionContextEnabling <em>Permission Context Enabling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Permission Context Enabling</em>'.
	 * @see gemRBAC.Permission#getPermissionContextEnabling()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_PermissionContextEnabling();

	/**
	 * Returns the meta object for class '{@link gemRBAC.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see gemRBAC.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Operation#getIdOperation <em>Id Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Operation</em>'.
	 * @see gemRBAC.Operation#getIdOperation()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_IdOperation();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Operation#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Permissions</em>'.
	 * @see gemRBAC.Operation#getPermissions()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Permissions();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Operation#getLogOperation <em>Log Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Log Operation</em>'.
	 * @see gemRBAC.Operation#getLogOperation()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_LogOperation();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Operation#accessHistory() <em>Access History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Access History</em>' operation.
	 * @see gemRBAC.Operation#accessHistory()
	 * @generated
	 */
	EOperation getOperation__AccessHistory();

	/**
	 * Returns the meta object for class '{@link gemRBAC.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see gemRBAC.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Object#getIdObject <em>Id Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Object</em>'.
	 * @see gemRBAC.Object#getIdObject()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_IdObject();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Object#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Permissions</em>'.
	 * @see gemRBAC.Object#getPermissions()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Permissions();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Object#getLogObject <em>Log Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Log Object</em>'.
	 * @see gemRBAC.Object#getLogObject()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_LogObject();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Object#accessHistory() <em>Access History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Access History</em>' operation.
	 * @see gemRBAC.Object#accessHistory()
	 * @generated
	 */
	EOperation getObject__AccessHistory();

	/**
	 * Returns the meta object for class '{@link gemRBAC.RBACContext <em>RBAC Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RBAC Context</em>'.
	 * @see gemRBAC.RBACContext
	 * @generated
	 */
	EClass getRBACContext();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.RBACContext#getLogContext <em>Log Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Log Context</em>'.
	 * @see gemRBAC.RBACContext#getLogContext()
	 * @see #getRBACContext()
	 * @generated
	 */
	EReference getRBACContext_LogContext();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.RBACContext#getP1 <em>P1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>P1</em>'.
	 * @see gemRBAC.RBACContext#getP1()
	 * @see #getRBACContext()
	 * @generated
	 */
	EReference getRBACContext_P1();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.RBACContext#getP2 <em>P2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>P2</em>'.
	 * @see gemRBAC.RBACContext#getP2()
	 * @see #getRBACContext()
	 * @generated
	 */
	EReference getRBACContext_P2();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.RBACContext#getR1 <em>R1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>R1</em>'.
	 * @see gemRBAC.RBACContext#getR1()
	 * @see #getRBACContext()
	 * @generated
	 */
	EReference getRBACContext_R1();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.RBACContext#getR2 <em>R2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>R2</em>'.
	 * @see gemRBAC.RBACContext#getR2()
	 * @see #getRBACContext()
	 * @generated
	 */
	EReference getRBACContext_R2();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.RBACContext#getIdContext <em>Id Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Context</em>'.
	 * @see gemRBAC.RBACContext#getIdContext()
	 * @see #getRBACContext()
	 * @generated
	 */
	EAttribute getRBACContext_IdContext();

	/**
	 * Returns the meta object for the '{@link gemRBAC.RBACContext#checkAccess(gemRBAC.RBACContext) <em>Check Access</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Access</em>' operation.
	 * @see gemRBAC.RBACContext#checkAccess(gemRBAC.RBACContext)
	 * @generated
	 */
	EOperation getRBACContext__CheckAccess__RBACContext();

	/**
	 * Returns the meta object for class '{@link gemRBAC.TimeExpression <em>Time Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Expression</em>'.
	 * @see gemRBAC.TimeExpression
	 * @generated
	 */
	EClass getTimeExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.TimeExpression#getAbsolute <em>Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Absolute</em>'.
	 * @see gemRBAC.TimeExpression#getAbsolute()
	 * @see #getTimeExpression()
	 * @generated
	 */
	EReference getTimeExpression_Absolute();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.TimeExpression#getRelative <em>Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relative</em>'.
	 * @see gemRBAC.TimeExpression#getRelative()
	 * @see #getTimeExpression()
	 * @generated
	 */
	EReference getTimeExpression_Relative();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.TimeExpression#getIdTimeExpr <em>Id Time Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Time Expr</em>'.
	 * @see gemRBAC.TimeExpression#getIdTimeExpr()
	 * @see #getTimeExpression()
	 * @generated
	 */
	EAttribute getTimeExpression_IdTimeExpr();

	/**
	 * Returns the meta object for class '{@link gemRBAC.SpatialContext <em>Spatial Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Context</em>'.
	 * @see gemRBAC.SpatialContext
	 * @generated
	 */
	EClass getSpatialContext();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.SpatialContext#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see gemRBAC.SpatialContext#getLabel()
	 * @see #getSpatialContext()
	 * @generated
	 */
	EAttribute getSpatialContext_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.SpatialContext#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see gemRBAC.SpatialContext#getLocation()
	 * @see #getSpatialContext()
	 * @generated
	 */
	EReference getSpatialContext_Location();

	/**
	 * Returns the meta object for class '{@link gemRBAC.Delegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation</em>'.
	 * @see gemRBAC.Delegation
	 * @generated
	 */
	EClass getDelegation();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Delegation#getIdDelegation <em>Id Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Delegation</em>'.
	 * @see gemRBAC.Delegation#getIdDelegation()
	 * @see #getDelegation()
	 * @generated
	 */
	EAttribute getDelegation_IdDelegation();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Delegation#isIsRevoked <em>Is Revoked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Revoked</em>'.
	 * @see gemRBAC.Delegation#isIsRevoked()
	 * @see #getDelegation()
	 * @generated
	 */
	EAttribute getDelegation_IsRevoked();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Delegation#getIsTransfer <em>Is Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Transfer</em>'.
	 * @see gemRBAC.Delegation#getIsTransfer()
	 * @see #getDelegation()
	 * @generated
	 */
	EAttribute getDelegation_IsTransfer();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Delegation#isIsTotal <em>Is Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Total</em>'.
	 * @see gemRBAC.Delegation#isIsTotal()
	 * @see #getDelegation()
	 * @generated
	 */
	EAttribute getDelegation_IsTotal();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Delegation#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see gemRBAC.Delegation#getStartDate()
	 * @see #getDelegation()
	 * @generated
	 */
	EAttribute getDelegation_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Delegation#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see gemRBAC.Delegation#getEndDate()
	 * @see #getDelegation()
	 * @generated
	 */
	EAttribute getDelegation_EndDate();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.Delegation#getDelegatorUser <em>Delegator User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegator User</em>'.
	 * @see gemRBAC.Delegation#getDelegatorUser()
	 * @see #getDelegation()
	 * @generated
	 */
	EReference getDelegation_DelegatorUser();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.Delegation#getDelegateUser <em>Delegate User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegate User</em>'.
	 * @see gemRBAC.Delegation#getDelegateUser()
	 * @see #getDelegation()
	 * @generated
	 */
	EReference getDelegation_DelegateUser();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.Delegation#getRevokingUser <em>Revoking User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Revoking User</em>'.
	 * @see gemRBAC.Delegation#getRevokingUser()
	 * @see #getDelegation()
	 * @generated
	 */
	EReference getDelegation_RevokingUser();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Delegation#getDelegatedDelegation <em>Delegated Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegated Delegation</em>'.
	 * @see gemRBAC.Delegation#getDelegatedDelegation()
	 * @see #getDelegation()
	 * @generated
	 */
	EReference getDelegation_DelegatedDelegation();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.Delegation#getDelegatedPermissions <em>Delegated Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delegated Permissions</em>'.
	 * @see gemRBAC.Delegation#getDelegatedPermissions()
	 * @see #getDelegation()
	 * @generated
	 */
	EReference getDelegation_DelegatedPermissions();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Delegation#getMaxDepth <em>Max Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Depth</em>'.
	 * @see gemRBAC.Delegation#getMaxDepth()
	 * @see #getDelegation()
	 * @generated
	 */
	EAttribute getDelegation_MaxDepth();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.Delegation#getDelegatedRole <em>Delegated Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delegated Role</em>'.
	 * @see gemRBAC.Delegation#getDelegatedRole()
	 * @see #getDelegation()
	 * @generated
	 */
	EReference getDelegation_DelegatedRole();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Delegation#revoke() <em>Revoke</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Revoke</em>' operation.
	 * @see gemRBAC.Delegation#revoke()
	 * @generated
	 */
	EOperation getDelegation__Revoke();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Delegation#getAbsoluteDelegationPath() <em>Get Absolute Delegation Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Absolute Delegation Path</em>' operation.
	 * @see gemRBAC.Delegation#getAbsoluteDelegationPath()
	 * @generated
	 */
	EOperation getDelegation__GetAbsoluteDelegationPath();

	/**
	 * Returns the meta object for class '{@link gemRBAC.History <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History</em>'.
	 * @see gemRBAC.History
	 * @generated
	 */
	EClass getHistory();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.History#getIdLog <em>Id Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Log</em>'.
	 * @see gemRBAC.History#getIdLog()
	 * @see #getHistory()
	 * @generated
	 */
	EAttribute getHistory_IdLog();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.History#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see gemRBAC.History#getRole()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_Role();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.History#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see gemRBAC.History#getObject()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_Object();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.History#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op</em>'.
	 * @see gemRBAC.History#getOp()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_Op();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.History#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Permission</em>'.
	 * @see gemRBAC.History#getPermission()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_Permission();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.History#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context</em>'.
	 * @see gemRBAC.History#getContext()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_Context();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.History#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see gemRBAC.History#getUser()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_User();

	/**
	 * Returns the meta object for class '{@link gemRBAC.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see gemRBAC.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference '{@link gemRBAC.Root#getSys <em>Sys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sys</em>'.
	 * @see gemRBAC.Root#getSys()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Sys();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.Root#getObj <em>Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Obj</em>'.
	 * @see gemRBAC.Root#getObj()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Obj();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.Root#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Op</em>'.
	 * @see gemRBAC.Root#getOp()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Op();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.Root#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>C</em>'.
	 * @see gemRBAC.Root#getC()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_C();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.Root#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see gemRBAC.Root#getP()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_P();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.Root#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>R</em>'.
	 * @see gemRBAC.Root#getR()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_R();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.Root#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>S</em>'.
	 * @see gemRBAC.Root#getS()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_S();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.Root#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>U</em>'.
	 * @see gemRBAC.Root#getU()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_U();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.Root#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>D</em>'.
	 * @see gemRBAC.Root#getD()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_D();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.Root#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Log</em>'.
	 * @see gemRBAC.Root#getLog()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Log();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.Root#getDur <em>Dur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dur</em>'.
	 * @see gemRBAC.Root#getDur()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Dur();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.Root#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Period</em>'.
	 * @see gemRBAC.Root#getPeriod()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Period();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.Root#getRloc <em>Rloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rloc</em>'.
	 * @see gemRBAC.Root#getRloc()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Rloc();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.Root#getRd <em>Rd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rd</em>'.
	 * @see gemRBAC.Root#getRd()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Rd();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.Root#getLoc <em>Loc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loc</em>'.
	 * @see gemRBAC.Root#getLoc()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Loc();

	/**
	 * Returns the meta object for class '{@link gemRBAC.RBACUtility <em>RBAC Utility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RBAC Utility</em>'.
	 * @see gemRBAC.RBACUtility
	 * @generated
	 */
	EClass getRBACUtility();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.RBACUtility#getMaxPermission <em>Max Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Permission</em>'.
	 * @see gemRBAC.RBACUtility#getMaxPermission()
	 * @see #getRBACUtility()
	 * @generated
	 */
	EAttribute getRBACUtility_MaxPermission();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.RBACUtility#getMaxActiveRole <em>Max Active Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Active Role</em>'.
	 * @see gemRBAC.RBACUtility#getMaxActiveRole()
	 * @see #getRBACUtility()
	 * @generated
	 */
	EAttribute getRBACUtility_MaxActiveRole();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.RBACUtility#getMaxRole <em>Max Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Role</em>'.
	 * @see gemRBAC.RBACUtility#getMaxRole()
	 * @see #getRBACUtility()
	 * @generated
	 */
	EAttribute getRBACUtility_MaxRole();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.RBACUtility#getBusinessTaskList <em>Business Task List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Business Task List</em>'.
	 * @see gemRBAC.RBACUtility#getBusinessTaskList()
	 * @see #getRBACUtility()
	 * @generated
	 */
	EReference getRBACUtility_BusinessTaskList();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.RBACUtility#getBoundedPermissions <em>Bounded Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bounded Permissions</em>'.
	 * @see gemRBAC.RBACUtility#getBoundedPermissions()
	 * @see #getRBACUtility()
	 * @generated
	 */
	EReference getRBACUtility_BoundedPermissions();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.RBACUtility#getCurrentT <em>Current T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current T</em>'.
	 * @see gemRBAC.RBACUtility#getCurrentT()
	 * @see #getRBACUtility()
	 * @generated
	 */
	EReference getRBACUtility_CurrentT();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.RBACUtility#getCurrentDay <em>Current Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Day</em>'.
	 * @see gemRBAC.RBACUtility#getCurrentDay()
	 * @see #getRBACUtility()
	 * @generated
	 */
	EReference getRBACUtility_CurrentDay();

	/**
	 * Returns the meta object for the '{@link gemRBAC.RBACUtility#getBoundPermission() <em>Get Bound Permission</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bound Permission</em>' operation.
	 * @see gemRBAC.RBACUtility#getBoundPermission()
	 * @generated
	 */
	EOperation getRBACUtility__GetBoundPermission();

	/**
	 * Returns the meta object for the '{@link gemRBAC.RBACUtility#getCurrentDate() <em>Get Current Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current Date</em>' operation.
	 * @see gemRBAC.RBACUtility#getCurrentDate()
	 * @generated
	 */
	EOperation getRBACUtility__GetCurrentDate();

	/**
	 * Returns the meta object for the '{@link gemRBAC.RBACUtility#getCurrentTime() <em>Get Current Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current Time</em>' operation.
	 * @see gemRBAC.RBACUtility#getCurrentTime()
	 * @generated
	 */
	EOperation getRBACUtility__GetCurrentTime();

	/**
	 * Returns the meta object for the '{@link gemRBAC.RBACUtility#getDayOfWeek() <em>Get Day Of Week</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Day Of Week</em>' operation.
	 * @see gemRBAC.RBACUtility#getDayOfWeek()
	 * @generated
	 */
	EOperation getRBACUtility__GetDayOfWeek();

	/**
	 * Returns the meta object for the '{@link gemRBAC.RBACUtility#getCumulativeActiveDuration(gemRBAC.Role, gemRBAC.User, gemRBAC.TimeUnitType) <em>Get Cumulative Active Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cumulative Active Duration</em>' operation.
	 * @see gemRBAC.RBACUtility#getCumulativeActiveDuration(gemRBAC.Role, gemRBAC.User, gemRBAC.TimeUnitType)
	 * @generated
	 */
	EOperation getRBACUtility__GetCumulativeActiveDuration__Role_User_TimeUnitType();

	/**
	 * Returns the meta object for the '{@link gemRBAC.RBACUtility#getActiveDuration(gemRBAC.Role, gemRBAC.TimeUnitType) <em>Get Active Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Active Duration</em>' operation.
	 * @see gemRBAC.RBACUtility#getActiveDuration(gemRBAC.Role, gemRBAC.TimeUnitType)
	 * @generated
	 */
	EOperation getRBACUtility__GetActiveDuration__Role_TimeUnitType();

	/**
	 * Returns the meta object for class '{@link gemRBAC.AbsoluteTE <em>Absolute TE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absolute TE</em>'.
	 * @see gemRBAC.AbsoluteTE
	 * @generated
	 */
	EClass getAbsoluteTE();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.AbsoluteTE#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duration</em>'.
	 * @see gemRBAC.AbsoluteTE#getDuration()
	 * @see #getAbsoluteTE()
	 * @generated
	 */
	EReference getAbsoluteTE_Duration();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.AbsoluteTE#getIdAbsoluteTE <em>Id Absolute TE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Absolute TE</em>'.
	 * @see gemRBAC.AbsoluteTE#getIdAbsoluteTE()
	 * @see #getAbsoluteTE()
	 * @generated
	 */
	EAttribute getAbsoluteTE_IdAbsoluteTE();

	/**
	 * Returns the meta object for the '{@link gemRBAC.AbsoluteTE#hasDuration() <em>Has Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Duration</em>' operation.
	 * @see gemRBAC.AbsoluteTE#hasDuration()
	 * @generated
	 */
	EOperation getAbsoluteTE__HasDuration();

	/**
	 * Returns the meta object for class '{@link gemRBAC.RelativeTE <em>Relative TE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative TE</em>'.
	 * @see gemRBAC.RelativeTE
	 * @generated
	 */
	EClass getRelativeTE();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.RelativeTE#getIdRelativeTE <em>Id Relative TE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Relative TE</em>'.
	 * @see gemRBAC.RelativeTE#getIdRelativeTE()
	 * @see #getRelativeTE()
	 * @generated
	 */
	EAttribute getRelativeTE_IdRelativeTE();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.RelativeTE#getD2 <em>D2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>D2</em>'.
	 * @see gemRBAC.RelativeTE#getD2()
	 * @see #getRelativeTE()
	 * @generated
	 */
	EReference getRelativeTE_D2();

	/**
	 * Returns the meta object for class '{@link gemRBAC.ActivationDuration <em>Activation Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Duration</em>'.
	 * @see gemRBAC.ActivationDuration
	 * @generated
	 */
	EClass getActivationDuration();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.ActivationDuration#getIdDuration <em>Id Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Duration</em>'.
	 * @see gemRBAC.ActivationDuration#getIdDuration()
	 * @see #getActivationDuration()
	 * @generated
	 */
	EAttribute getActivationDuration_IdDuration();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.ActivationDuration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gemRBAC.ActivationDuration#getValue()
	 * @see #getActivationDuration()
	 * @generated
	 */
	EAttribute getActivationDuration_Value();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.ActivationDuration#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see gemRBAC.ActivationDuration#getTimeUnit()
	 * @see #getActivationDuration()
	 * @generated
	 */
	EAttribute getActivationDuration_TimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.ActivationDuration#isIsContinous <em>Is Continous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Continous</em>'.
	 * @see gemRBAC.ActivationDuration#isIsContinous()
	 * @see #getActivationDuration()
	 * @generated
	 */
	EAttribute getActivationDuration_IsContinous();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.ActivationDuration#getAexp <em>Aexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aexp</em>'.
	 * @see gemRBAC.ActivationDuration#getAexp()
	 * @see #getActivationDuration()
	 * @generated
	 */
	EReference getActivationDuration_Aexp();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.ActivationDuration#getRexp <em>Rexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rexp</em>'.
	 * @see gemRBAC.ActivationDuration#getRexp()
	 * @see #getActivationDuration()
	 * @generated
	 */
	EReference getActivationDuration_Rexp();

	/**
	 * Returns the meta object for the '{@link gemRBAC.ActivationDuration#greaterThan(gemRBAC.ActivationDuration) <em>Greater Than</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Greater Than</em>' operation.
	 * @see gemRBAC.ActivationDuration#greaterThan(gemRBAC.ActivationDuration)
	 * @generated
	 */
	EOperation getActivationDuration__GreaterThan__ActivationDuration();

	/**
	 * Returns the meta object for class '{@link gemRBAC.TimePoint <em>Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Point</em>'.
	 * @see gemRBAC.TimePoint
	 * @generated
	 */
	EClass getTimePoint();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.TimePoint#getSecond <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second</em>'.
	 * @see gemRBAC.TimePoint#getSecond()
	 * @see #getTimePoint()
	 * @generated
	 */
	EAttribute getTimePoint_Second();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.TimePoint#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see gemRBAC.TimePoint#getMinute()
	 * @see #getTimePoint()
	 * @generated
	 */
	EAttribute getTimePoint_Minute();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.TimePoint#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see gemRBAC.TimePoint#getHour()
	 * @see #getTimePoint()
	 * @generated
	 */
	EAttribute getTimePoint_Hour();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.TimePoint#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see gemRBAC.TimePoint#getDay()
	 * @see #getTimePoint()
	 * @generated
	 */
	EAttribute getTimePoint_Day();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.TimePoint#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see gemRBAC.TimePoint#getMonth()
	 * @see #getTimePoint()
	 * @generated
	 */
	EAttribute getTimePoint_Month();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.TimePoint#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see gemRBAC.TimePoint#getYear()
	 * @see #getTimePoint()
	 * @generated
	 */
	EAttribute getTimePoint_Year();

	/**
	 * Returns the meta object for the '{@link gemRBAC.TimePoint#equalTo(gemRBAC.TimePoint) <em>Equal To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equal To</em>' operation.
	 * @see gemRBAC.TimePoint#equalTo(gemRBAC.TimePoint)
	 * @generated
	 */
	EOperation getTimePoint__EqualTo__TimePoint();

	/**
	 * Returns the meta object for the '{@link gemRBAC.TimePoint#isBefore(gemRBAC.TimePoint) <em>Is Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Before</em>' operation.
	 * @see gemRBAC.TimePoint#isBefore(gemRBAC.TimePoint)
	 * @generated
	 */
	EOperation getTimePoint__IsBefore__TimePoint();

	/**
	 * Returns the meta object for the '{@link gemRBAC.TimePoint#isAfter(gemRBAC.TimePoint) <em>Is After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is After</em>' operation.
	 * @see gemRBAC.TimePoint#isAfter(gemRBAC.TimePoint)
	 * @generated
	 */
	EOperation getTimePoint__IsAfter__TimePoint();

	/**
	 * Returns the meta object for the '{@link gemRBAC.TimePoint#isContained(gemRBAC.TimeInterval) <em>Is Contained</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Contained</em>' operation.
	 * @see gemRBAC.TimePoint#isContained(gemRBAC.TimeInterval)
	 * @generated
	 */
	EOperation getTimePoint__IsContained__TimeInterval();

	/**
	 * Returns the meta object for class '{@link gemRBAC.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Interval</em>'.
	 * @see gemRBAC.TimeInterval
	 * @generated
	 */
	EClass getTimeInterval();

	/**
	 * Returns the meta object for the containment reference '{@link gemRBAC.TimeInterval#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see gemRBAC.TimeInterval#getStart()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EReference getTimeInterval_Start();

	/**
	 * Returns the meta object for the containment reference '{@link gemRBAC.TimeInterval#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see gemRBAC.TimeInterval#getEnd()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EReference getTimeInterval_End();

	/**
	 * Returns the meta object for class '{@link gemRBAC.ComposedRelativeTE <em>Composed Relative TE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Relative TE</em>'.
	 * @see gemRBAC.ComposedRelativeTE
	 * @generated
	 */
	EClass getComposedRelativeTE();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.ComposedRelativeTE#getOverlay <em>Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Overlay</em>'.
	 * @see gemRBAC.ComposedRelativeTE#getOverlay()
	 * @see #getComposedRelativeTE()
	 * @generated
	 */
	EReference getComposedRelativeTE_Overlay();

	/**
	 * Returns the meta object for the '{@link gemRBAC.ComposedRelativeTE#checkHours(gemRBAC.RBACUtility) <em>Check Hours</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Hours</em>' operation.
	 * @see gemRBAC.ComposedRelativeTE#checkHours(gemRBAC.RBACUtility)
	 * @generated
	 */
	EOperation getComposedRelativeTE__CheckHours__RBACUtility();

	/**
	 * Returns the meta object for the '{@link gemRBAC.ComposedRelativeTE#checkDays(gemRBAC.RBACUtility) <em>Check Days</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Days</em>' operation.
	 * @see gemRBAC.ComposedRelativeTE#checkDays(gemRBAC.RBACUtility)
	 * @generated
	 */
	EOperation getComposedRelativeTE__CheckDays__RBACUtility();

	/**
	 * Returns the meta object for the '{@link gemRBAC.ComposedRelativeTE#checkDaysRank(gemRBAC.RBACUtility) <em>Check Days Rank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Days Rank</em>' operation.
	 * @see gemRBAC.ComposedRelativeTE#checkDaysRank(gemRBAC.RBACUtility)
	 * @generated
	 */
	EOperation getComposedRelativeTE__CheckDaysRank__RBACUtility();

	/**
	 * Returns the meta object for class '{@link gemRBAC.RelativeTimeInterval <em>Relative Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Time Interval</em>'.
	 * @see gemRBAC.RelativeTimeInterval
	 * @generated
	 */
	EClass getRelativeTimeInterval();

	/**
	 * Returns the meta object for the containment reference '{@link gemRBAC.RelativeTimeInterval#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see gemRBAC.RelativeTimeInterval#getStart()
	 * @see #getRelativeTimeInterval()
	 * @generated
	 */
	EReference getRelativeTimeInterval_Start();

	/**
	 * Returns the meta object for the containment reference '{@link gemRBAC.RelativeTimeInterval#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see gemRBAC.RelativeTimeInterval#getEnd()
	 * @see #getRelativeTimeInterval()
	 * @generated
	 */
	EReference getRelativeTimeInterval_End();

	/**
	 * Returns the meta object for class '{@link gemRBAC.RelativeTimePoint <em>Relative Time Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Time Point</em>'.
	 * @see gemRBAC.RelativeTimePoint
	 * @generated
	 */
	EClass getRelativeTimePoint();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.RelativeTimePoint#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see gemRBAC.RelativeTimePoint#getRank()
	 * @see #getRelativeTimePoint()
	 * @generated
	 */
	EAttribute getRelativeTimePoint_Rank();

	/**
	 * Returns the meta object for the '{@link gemRBAC.RelativeTimePoint#isContained(gemRBAC.RelativeTimeInterval) <em>Is Contained</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Contained</em>' operation.
	 * @see gemRBAC.RelativeTimePoint#isContained(gemRBAC.RelativeTimeInterval)
	 * @generated
	 */
	EOperation getRelativeTimePoint__IsContained__RelativeTimeInterval();

	/**
	 * Returns the meta object for the '{@link gemRBAC.RelativeTimePoint#equalTo(gemRBAC.RelativeTimePoint) <em>Equal To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equal To</em>' operation.
	 * @see gemRBAC.RelativeTimePoint#equalTo(gemRBAC.RelativeTimePoint)
	 * @generated
	 */
	EOperation getRelativeTimePoint__EqualTo__RelativeTimePoint();

	/**
	 * Returns the meta object for the '{@link gemRBAC.RelativeTimePoint#isAfter(gemRBAC.RelativeTimePoint) <em>Is After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is After</em>' operation.
	 * @see gemRBAC.RelativeTimePoint#isAfter(gemRBAC.RelativeTimePoint)
	 * @generated
	 */
	EOperation getRelativeTimePoint__IsAfter__RelativeTimePoint();

	/**
	 * Returns the meta object for the '{@link gemRBAC.RelativeTimePoint#isBefore(gemRBAC.RelativeTimePoint) <em>Is Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Before</em>' operation.
	 * @see gemRBAC.RelativeTimePoint#isBefore(gemRBAC.RelativeTimePoint)
	 * @generated
	 */
	EOperation getRelativeTimePoint__IsBefore__RelativeTimePoint();

	/**
	 * Returns the meta object for class '{@link gemRBAC.DayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day Of Week</em>'.
	 * @see gemRBAC.DayOfWeek
	 * @generated
	 */
	EClass getDayOfWeek();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.DayOfWeek#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see gemRBAC.DayOfWeek#getDay()
	 * @see #getDayOfWeek()
	 * @generated
	 */
	EAttribute getDayOfWeek_Day();

	/**
	 * Returns the meta object for class '{@link gemRBAC.DayOfMonth <em>Day Of Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day Of Month</em>'.
	 * @see gemRBAC.DayOfMonth
	 * @generated
	 */
	EClass getDayOfMonth();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.DayOfMonth#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see gemRBAC.DayOfMonth#getDay()
	 * @see #getDayOfMonth()
	 * @generated
	 */
	EAttribute getDayOfMonth_Day();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.DayOfMonth#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see gemRBAC.DayOfMonth#getMonth()
	 * @see #getDayOfMonth()
	 * @generated
	 */
	EAttribute getDayOfMonth_Month();

	/**
	 * Returns the meta object for class '{@link gemRBAC.MonthOfYear <em>Month Of Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Month Of Year</em>'.
	 * @see gemRBAC.MonthOfYear
	 * @generated
	 */
	EClass getMonthOfYear();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.MonthOfYear#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see gemRBAC.MonthOfYear#getMonth()
	 * @see #getMonthOfYear()
	 * @generated
	 */
	EAttribute getMonthOfYear_Month();

	/**
	 * Returns the meta object for class '{@link gemRBAC.HourOfDay <em>Hour Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hour Of Day</em>'.
	 * @see gemRBAC.HourOfDay
	 * @generated
	 */
	EClass getHourOfDay();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.HourOfDay#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see gemRBAC.HourOfDay#getHour()
	 * @see #getHourOfDay()
	 * @generated
	 */
	EAttribute getHourOfDay_Hour();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.HourOfDay#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see gemRBAC.HourOfDay#getMinute()
	 * @see #getHourOfDay()
	 * @generated
	 */
	EAttribute getHourOfDay_Minute();

	/**
	 * Returns the meta object for class '{@link gemRBAC.PeriodicTime <em>Periodic Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Time</em>'.
	 * @see gemRBAC.PeriodicTime
	 * @generated
	 */
	EClass getPeriodicTime();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.PeriodicTime#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see gemRBAC.PeriodicTime#getFrequency()
	 * @see #getPeriodicTime()
	 * @generated
	 */
	EAttribute getPeriodicTime_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.PeriodicTime#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see gemRBAC.PeriodicTime#getTimeUnit()
	 * @see #getPeriodicTime()
	 * @generated
	 */
	EAttribute getPeriodicTime_TimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.PeriodicTime#getIdPeriodicTime <em>Id Periodic Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Periodic Time</em>'.
	 * @see gemRBAC.PeriodicTime#getIdPeriodicTime()
	 * @see #getPeriodicTime()
	 * @generated
	 */
	EAttribute getPeriodicTime_IdPeriodicTime();

	/**
	 * Returns the meta object for the containment reference '{@link gemRBAC.PeriodicTime#getNextStart <em>Next Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Start</em>'.
	 * @see gemRBAC.PeriodicTime#getNextStart()
	 * @see #getPeriodicTime()
	 * @generated
	 */
	EReference getPeriodicTime_NextStart();

	/**
	 * Returns the meta object for class '{@link gemRBAC.RelativeLocation <em>Relative Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Location</em>'.
	 * @see gemRBAC.RelativeLocation
	 * @generated
	 */
	EClass getRelativeLocation();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.RelativeLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Location</em>'.
	 * @see gemRBAC.RelativeLocation#getLocation()
	 * @see #getRelativeLocation()
	 * @generated
	 */
	EReference getRelativeLocation_Location();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.RelativeLocation#getRelativeLocID <em>Relative Loc ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Loc ID</em>'.
	 * @see gemRBAC.RelativeLocation#getRelativeLocID()
	 * @see #getRelativeLocation()
	 * @generated
	 */
	EAttribute getRelativeLocation_RelativeLocID();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.RelativeLocation#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see gemRBAC.RelativeLocation#getDistance()
	 * @see #getRelativeLocation()
	 * @generated
	 */
	EAttribute getRelativeLocation_Distance();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.RelativeLocation#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see gemRBAC.RelativeLocation#getUnit()
	 * @see #getRelativeLocation()
	 * @generated
	 */
	EAttribute getRelativeLocation_Unit();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.RelativeLocation#getRelativedirection <em>Relativedirection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relativedirection</em>'.
	 * @see gemRBAC.RelativeLocation#getRelativedirection()
	 * @see #getRelativeLocation()
	 * @generated
	 */
	EReference getRelativeLocation_Relativedirection();

	/**
	 * Returns the meta object for class '{@link gemRBAC.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see gemRBAC.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the reference '{@link gemRBAC.Location#getRelativelocation <em>Relativelocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relativelocation</em>'.
	 * @see gemRBAC.Location#getRelativelocation()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Relativelocation();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Location#getLocationID <em>Location ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location ID</em>'.
	 * @see gemRBAC.Location#getLocationID()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_LocationID();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Location#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see gemRBAC.Location#getLabel()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Label();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Location#disjoint(gemRBAC.Location) <em>Disjoint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disjoint</em>' operation.
	 * @see gemRBAC.Location#disjoint(gemRBAC.Location)
	 * @generated
	 */
	EOperation getLocation__Disjoint__Location();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Location#contains(gemRBAC.Location) <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains</em>' operation.
	 * @see gemRBAC.Location#contains(gemRBAC.Location)
	 * @generated
	 */
	EOperation getLocation__Contains__Location();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Location#overlaps(gemRBAC.Location) <em>Overlaps</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Overlaps</em>' operation.
	 * @see gemRBAC.Location#overlaps(gemRBAC.Location)
	 * @generated
	 */
	EOperation getLocation__Overlaps__Location();

	/**
	 * Returns the meta object for the '{@link gemRBAC.Location#computeRelative(gemRBAC.RelativeLocation) <em>Compute Relative</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Relative</em>' operation.
	 * @see gemRBAC.Location#computeRelative(gemRBAC.RelativeLocation)
	 * @generated
	 */
	EOperation getLocation__ComputeRelative__RelativeLocation();

	/**
	 * Returns the meta object for class '{@link gemRBAC.PhysicalLocation <em>Physical Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Location</em>'.
	 * @see gemRBAC.PhysicalLocation
	 * @generated
	 */
	EClass getPhysicalLocation();

	/**
	 * Returns the meta object for class '{@link gemRBAC.LogicalLocation <em>Logical Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Location</em>'.
	 * @see gemRBAC.LogicalLocation
	 * @generated
	 */
	EClass getLogicalLocation();

	/**
	 * Returns the meta object for class '{@link gemRBAC.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see gemRBAC.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Point#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see gemRBAC.Point#getLong()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Long();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Point#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see gemRBAC.Point#getLat()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Lat();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Point#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see gemRBAC.Point#getAlt()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Alt();

	/**
	 * Returns the meta object for class '{@link gemRBAC.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon</em>'.
	 * @see gemRBAC.Polygon
	 * @generated
	 */
	EClass getPolygon();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.Polygon#getSegment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segment</em>'.
	 * @see gemRBAC.Polygon#getSegment()
	 * @see #getPolygon()
	 * @generated
	 */
	EReference getPolygon_Segment();

	/**
	 * Returns the meta object for class '{@link gemRBAC.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see gemRBAC.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for the containment reference '{@link gemRBAC.Circle#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Center</em>'.
	 * @see gemRBAC.Circle#getCenter()
	 * @see #getCircle()
	 * @generated
	 */
	EReference getCircle_Center();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.Circle#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see gemRBAC.Circle#getRadius()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Radius();

	/**
	 * Returns the meta object for class '{@link gemRBAC.Polyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polyline</em>'.
	 * @see gemRBAC.Polyline
	 * @generated
	 */
	EClass getPolyline();

	/**
	 * Returns the meta object for the containment reference '{@link gemRBAC.Polyline#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see gemRBAC.Polyline#getStart()
	 * @see #getPolyline()
	 * @generated
	 */
	EReference getPolyline_Start();

	/**
	 * Returns the meta object for the containment reference '{@link gemRBAC.Polyline#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see gemRBAC.Polyline#getEnd()
	 * @see #getPolyline()
	 * @generated
	 */
	EReference getPolyline_End();

	/**
	 * Returns the meta object for class '{@link gemRBAC.RelativeDirection <em>Relative Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Direction</em>'.
	 * @see gemRBAC.RelativeDirection
	 * @generated
	 */
	EClass getRelativeDirection();

	/**
	 * Returns the meta object for the reference list '{@link gemRBAC.RelativeDirection#getRelativelocation <em>Relativelocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relativelocation</em>'.
	 * @see gemRBAC.RelativeDirection#getRelativelocation()
	 * @see #getRelativeDirection()
	 * @generated
	 */
	EReference getRelativeDirection_Relativelocation();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.RelativeDirection#getIdDirection <em>Id Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Direction</em>'.
	 * @see gemRBAC.RelativeDirection#getIdDirection()
	 * @see #getRelativeDirection()
	 * @generated
	 */
	EAttribute getRelativeDirection_IdDirection();

	/**
	 * Returns the meta object for class '{@link gemRBAC.CardinalDirection <em>Cardinal Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinal Direction</em>'.
	 * @see gemRBAC.CardinalDirection
	 * @generated
	 */
	EClass getCardinalDirection();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.CardinalDirection#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see gemRBAC.CardinalDirection#getDirection()
	 * @see #getCardinalDirection()
	 * @generated
	 */
	EAttribute getCardinalDirection_Direction();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.CardinalDirection#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see gemRBAC.CardinalDirection#getAngle()
	 * @see #getCardinalDirection()
	 * @generated
	 */
	EAttribute getCardinalDirection_Angle();

	/**
	 * Returns the meta object for class '{@link gemRBAC.QualitativeDirection <em>Qualitative Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualitative Direction</em>'.
	 * @see gemRBAC.QualitativeDirection
	 * @generated
	 */
	EClass getQualitativeDirection();

	/**
	 * Returns the meta object for the attribute '{@link gemRBAC.QualitativeDirection#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see gemRBAC.QualitativeDirection#getDirection()
	 * @see #getQualitativeDirection()
	 * @generated
	 */
	EAttribute getQualitativeDirection_Direction();

	/**
	 * Returns the meta object for class '{@link gemRBAC.TemporalContext <em>Temporal Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Context</em>'.
	 * @see gemRBAC.TemporalContext
	 * @generated
	 */
	EClass getTemporalContext();

	/**
	 * Returns the meta object for the containment reference list '{@link gemRBAC.TemporalContext#getTimeexpression <em>Timeexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timeexpression</em>'.
	 * @see gemRBAC.TemporalContext#getTimeexpression()
	 * @see #getTemporalContext()
	 * @generated
	 */
	EReference getTemporalContext_Timeexpression();

	/**
	 * Returns the meta object for enum '{@link gemRBAC.TimeUnitType <em>Time Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit Type</em>'.
	 * @see gemRBAC.TimeUnitType
	 * @generated
	 */
	EEnum getTimeUnitType();

	/**
	 * Returns the meta object for enum '{@link gemRBAC.DayType <em>Day Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Day Type</em>'.
	 * @see gemRBAC.DayType
	 * @generated
	 */
	EEnum getDayType();

	/**
	 * Returns the meta object for enum '{@link gemRBAC.CardinalType <em>Cardinal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinal Type</em>'.
	 * @see gemRBAC.CardinalType
	 * @generated
	 */
	EEnum getCardinalType();

	/**
	 * Returns the meta object for enum '{@link gemRBAC.QualitativeType <em>Qualitative Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qualitative Type</em>'.
	 * @see gemRBAC.QualitativeType
	 * @generated
	 */
	EEnum getQualitativeType();

	/**
	 * Returns the meta object for enum '{@link gemRBAC.delegationType <em>delegation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>delegation Type</em>'.
	 * @see gemRBAC.delegationType
	 * @generated
	 */
	EEnum getdelegationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GemRBACFactory getGemRBACFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gemRBAC.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.UserImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Id User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID_USER = eINSTANCE.getUser_IdUser();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ROLES = eINSTANCE.getUser_Roles();

		/**
		 * The meta object literal for the '<em><b>Sessions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__SESSIONS = eINSTANCE.getUser_Sessions();

		/**
		 * The meta object literal for the '<em><b>Delegation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__DELEGATION = eINSTANCE.getUser_Delegation();

		/**
		 * The meta object literal for the '<em><b>Recieveddelegation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__RECIEVEDDELEGATION = eINSTANCE.getUser_Recieveddelegation();

		/**
		 * The meta object literal for the '<em><b>Revocation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__REVOCATION = eINSTANCE.getUser_Revocation();

		/**
		 * The meta object literal for the '<em><b>Delegated Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__DELEGATED_ROLES = eINSTANCE.getUser_DelegatedRoles();

		/**
		 * The meta object literal for the '<em><b>User Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__USER_LOCATION = eINSTANCE.getUser_UserLocation();

		/**
		 * The meta object literal for the '<em><b>User Log</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__USER_LOG = eINSTANCE.getUser_UserLog();

		/**
		 * The meta object literal for the '<em><b>Assign Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___ASSIGN_ROLE__ROLE = eINSTANCE.getUser__AssignRole__Role();

		/**
		 * The meta object literal for the '<em><b>Access History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___ACCESS_HISTORY = eINSTANCE.getUser__AccessHistory();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.RoleImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Id Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ID_ROLE = eINSTANCE.getRole_IdRole();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__USERS = eINSTANCE.getRole_Users();

		/**
		 * The meta object literal for the '<em><b>Is Dependent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__IS_DEPENDENT = eINSTANCE.getRole_IsDependent();

		/**
		 * The meta object literal for the '<em><b>Is Strong</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__IS_STRONG = eINSTANCE.getRole_IsStrong();

		/**
		 * The meta object literal for the '<em><b>Is Cascading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__IS_CASCADING = eINSTANCE.getRole_IsCascading();

		/**
		 * The meta object literal for the '<em><b>Sessions A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SESSIONS_A = eINSTANCE.getRole_SessionsA();

		/**
		 * The meta object literal for the '<em><b>Sessions E</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SESSIONS_E = eINSTANCE.getRole_SessionsE();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__PERMISSIONS = eINSTANCE.getRole_Permissions();

		/**
		 * The meta object literal for the '<em><b>Juniors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__JUNIORS = eINSTANCE.getRole_Juniors();

		/**
		 * The meta object literal for the '<em><b>Seniors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SENIORS = eINSTANCE.getRole_Seniors();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__USER = eINSTANCE.getRole_User();

		/**
		 * The meta object literal for the '<em><b>Delegation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__DELEGATION = eINSTANCE.getRole_Delegation();

		/**
		 * The meta object literal for the '<em><b>Role Context Assignment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ROLE_CONTEXT_ASSIGNMENT = eINSTANCE.getRole_RoleContextAssignment();

		/**
		 * The meta object literal for the '<em><b>Role Context Enabling</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ROLE_CONTEXT_ENABLING = eINSTANCE.getRole_RoleContextEnabling();

		/**
		 * The meta object literal for the '<em><b>Log Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__LOG_ROLE = eINSTANCE.getRole_LogRole();

		/**
		 * The meta object literal for the '<em><b>Get Current Absolute TE</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE___GET_CURRENT_ABSOLUTE_TE__RBACUTILITY = eINSTANCE.getRole__GetCurrentAbsoluteTE__RBACUtility();

		/**
		 * The meta object literal for the '<em><b>Assign Permission</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE___ASSIGN_PERMISSION__PERMISSION = eINSTANCE.getRole__AssignPermission__Permission();

		/**
		 * The meta object literal for the '<em><b>Access History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE___ACCESS_HISTORY = eINSTANCE.getRole__AccessHistory();

		/**
		 * The meta object literal for the '<em><b>Log BO Current Process Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE___LOG_BO_CURRENT_PROCESS_INSTANCE = eINSTANCE.getRole__LogBOCurrentProcessInstance();

		/**
		 * The meta object literal for the '<em><b>Get Alljuniors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE___GET_ALLJUNIORS = eINSTANCE.getRole__GetAlljuniors();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.SessionImpl <em>Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.SessionImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getSession()
		 * @generated
		 */
		EClass SESSION = eINSTANCE.getSession();

		/**
		 * The meta object literal for the '<em><b>Id Session</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SESSION__ID_SESSION = eINSTANCE.getSession_IdSession();

		/**
		 * The meta object literal for the '<em><b>Active Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__ACTIVE_ROLES = eINSTANCE.getSession_ActiveRoles();

		/**
		 * The meta object literal for the '<em><b>Enabled Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__ENABLED_ROLES = eINSTANCE.getSession_EnabledRoles();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION__USER = eINSTANCE.getSession_User();

		/**
		 * The meta object literal for the '<em><b>Access History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SESSION___ACCESS_HISTORY = eINSTANCE.getSession__AccessHistory();

		/**
		 * The meta object literal for the '<em><b>Enable Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SESSION___ENABLE_ROLE__ROLE = eINSTANCE.getSession__EnableRole__Role();

		/**
		 * The meta object literal for the '<em><b>Disable Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SESSION___DISABLE_ROLE__ROLE = eINSTANCE.getSession__DisableRole__Role();

		/**
		 * The meta object literal for the '<em><b>Activate Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SESSION___ACTIVATE_ROLE__ROLE = eINSTANCE.getSession__ActivateRole__Role();

		/**
		 * The meta object literal for the '<em><b>Deactivate Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SESSION___DEACTIVATE_ROLE__ROLE = eINSTANCE.getSession__DeactivateRole__Role();

		/**
		 * The meta object literal for the '<em><b>Perform Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SESSION___PERFORM_OPERATION__OPERATION_PERMISSION_ROLE = eINSTANCE.getSession__PerformOperation__Operation_Permission_Role();

		/**
		 * The meta object literal for the '<em><b>Delegate Role</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SESSION___DELEGATE_ROLE__ROLE = eINSTANCE.getSession__DelegateRole__Role();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.PermissionImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__ROLES = eINSTANCE.getPermission_Roles();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__OPERATIONS = eINSTANCE.getPermission_Operations();

		/**
		 * The meta object literal for the '<em><b>Id Permission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__ID_PERMISSION = eINSTANCE.getPermission_IdPermission();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__OBJECT = eINSTANCE.getPermission_Object();

		/**
		 * The meta object literal for the '<em><b>Delegation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__DELEGATION = eINSTANCE.getPermission_Delegation();

		/**
		 * The meta object literal for the '<em><b>Log Permission</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__LOG_PERMISSION = eINSTANCE.getPermission_LogPermission();

		/**
		 * The meta object literal for the '<em><b>Permission Context Assignment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__PERMISSION_CONTEXT_ASSIGNMENT = eINSTANCE.getPermission_PermissionContextAssignment();

		/**
		 * The meta object literal for the '<em><b>Permission Context Enabling</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__PERMISSION_CONTEXT_ENABLING = eINSTANCE.getPermission_PermissionContextEnabling();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.OperationImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Id Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__ID_OPERATION = eINSTANCE.getOperation_IdOperation();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PERMISSIONS = eINSTANCE.getOperation_Permissions();

		/**
		 * The meta object literal for the '<em><b>Log Operation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__LOG_OPERATION = eINSTANCE.getOperation_LogOperation();

		/**
		 * The meta object literal for the '<em><b>Access History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPERATION___ACCESS_HISTORY = eINSTANCE.getOperation__AccessHistory();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.ObjectImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Id Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__ID_OBJECT = eINSTANCE.getObject_IdObject();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__PERMISSIONS = eINSTANCE.getObject_Permissions();

		/**
		 * The meta object literal for the '<em><b>Log Object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__LOG_OBJECT = eINSTANCE.getObject_LogObject();

		/**
		 * The meta object literal for the '<em><b>Access History</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT___ACCESS_HISTORY = eINSTANCE.getObject__AccessHistory();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.RBACContextImpl <em>RBAC Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.RBACContextImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getRBACContext()
		 * @generated
		 */
		EClass RBAC_CONTEXT = eINSTANCE.getRBACContext();

		/**
		 * The meta object literal for the '<em><b>Log Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBAC_CONTEXT__LOG_CONTEXT = eINSTANCE.getRBACContext_LogContext();

		/**
		 * The meta object literal for the '<em><b>P1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBAC_CONTEXT__P1 = eINSTANCE.getRBACContext_P1();

		/**
		 * The meta object literal for the '<em><b>P2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBAC_CONTEXT__P2 = eINSTANCE.getRBACContext_P2();

		/**
		 * The meta object literal for the '<em><b>R1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBAC_CONTEXT__R1 = eINSTANCE.getRBACContext_R1();

		/**
		 * The meta object literal for the '<em><b>R2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBAC_CONTEXT__R2 = eINSTANCE.getRBACContext_R2();

		/**
		 * The meta object literal for the '<em><b>Id Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RBAC_CONTEXT__ID_CONTEXT = eINSTANCE.getRBACContext_IdContext();

		/**
		 * The meta object literal for the '<em><b>Check Access</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RBAC_CONTEXT___CHECK_ACCESS__RBACCONTEXT = eINSTANCE.getRBACContext__CheckAccess__RBACContext();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.TimeExpressionImpl <em>Time Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.TimeExpressionImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getTimeExpression()
		 * @generated
		 */
		EClass TIME_EXPRESSION = eINSTANCE.getTimeExpression();

		/**
		 * The meta object literal for the '<em><b>Absolute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_EXPRESSION__ABSOLUTE = eINSTANCE.getTimeExpression_Absolute();

		/**
		 * The meta object literal for the '<em><b>Relative</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_EXPRESSION__RELATIVE = eINSTANCE.getTimeExpression_Relative();

		/**
		 * The meta object literal for the '<em><b>Id Time Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_EXPRESSION__ID_TIME_EXPR = eINSTANCE.getTimeExpression_IdTimeExpr();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.SpatialContextImpl <em>Spatial Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.SpatialContextImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getSpatialContext()
		 * @generated
		 */
		EClass SPATIAL_CONTEXT = eINSTANCE.getSpatialContext();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_CONTEXT__LABEL = eINSTANCE.getSpatialContext_Label();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPATIAL_CONTEXT__LOCATION = eINSTANCE.getSpatialContext_Location();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.DelegationImpl <em>Delegation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.DelegationImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getDelegation()
		 * @generated
		 */
		EClass DELEGATION = eINSTANCE.getDelegation();

		/**
		 * The meta object literal for the '<em><b>Id Delegation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATION__ID_DELEGATION = eINSTANCE.getDelegation_IdDelegation();

		/**
		 * The meta object literal for the '<em><b>Is Revoked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATION__IS_REVOKED = eINSTANCE.getDelegation_IsRevoked();

		/**
		 * The meta object literal for the '<em><b>Is Transfer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATION__IS_TRANSFER = eINSTANCE.getDelegation_IsTransfer();

		/**
		 * The meta object literal for the '<em><b>Is Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATION__IS_TOTAL = eINSTANCE.getDelegation_IsTotal();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATION__START_DATE = eINSTANCE.getDelegation_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATION__END_DATE = eINSTANCE.getDelegation_EndDate();

		/**
		 * The meta object literal for the '<em><b>Delegator User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION__DELEGATOR_USER = eINSTANCE.getDelegation_DelegatorUser();

		/**
		 * The meta object literal for the '<em><b>Delegate User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION__DELEGATE_USER = eINSTANCE.getDelegation_DelegateUser();

		/**
		 * The meta object literal for the '<em><b>Revoking User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION__REVOKING_USER = eINSTANCE.getDelegation_RevokingUser();

		/**
		 * The meta object literal for the '<em><b>Delegated Delegation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION__DELEGATED_DELEGATION = eINSTANCE.getDelegation_DelegatedDelegation();

		/**
		 * The meta object literal for the '<em><b>Delegated Permissions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION__DELEGATED_PERMISSIONS = eINSTANCE.getDelegation_DelegatedPermissions();

		/**
		 * The meta object literal for the '<em><b>Max Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELEGATION__MAX_DEPTH = eINSTANCE.getDelegation_MaxDepth();

		/**
		 * The meta object literal for the '<em><b>Delegated Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION__DELEGATED_ROLE = eINSTANCE.getDelegation_DelegatedRole();

		/**
		 * The meta object literal for the '<em><b>Revoke</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DELEGATION___REVOKE = eINSTANCE.getDelegation__Revoke();

		/**
		 * The meta object literal for the '<em><b>Get Absolute Delegation Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DELEGATION___GET_ABSOLUTE_DELEGATION_PATH = eINSTANCE.getDelegation__GetAbsoluteDelegationPath();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.HistoryImpl <em>History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.HistoryImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getHistory()
		 * @generated
		 */
		EClass HISTORY = eINSTANCE.getHistory();

		/**
		 * The meta object literal for the '<em><b>Id Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORY__ID_LOG = eINSTANCE.getHistory_IdLog();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__ROLE = eINSTANCE.getHistory_Role();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__OBJECT = eINSTANCE.getHistory_Object();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__OP = eINSTANCE.getHistory_Op();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__PERMISSION = eINSTANCE.getHistory_Permission();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__CONTEXT = eINSTANCE.getHistory_Context();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__USER = eINSTANCE.getHistory_User();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.RootImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Sys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__SYS = eINSTANCE.getRoot_Sys();

		/**
		 * The meta object literal for the '<em><b>Obj</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__OBJ = eINSTANCE.getRoot_Obj();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__OP = eINSTANCE.getRoot_Op();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__C = eINSTANCE.getRoot_C();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__P = eINSTANCE.getRoot_P();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__R = eINSTANCE.getRoot_R();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__S = eINSTANCE.getRoot_S();

		/**
		 * The meta object literal for the '<em><b>U</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__U = eINSTANCE.getRoot_U();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__D = eINSTANCE.getRoot_D();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__LOG = eINSTANCE.getRoot_Log();

		/**
		 * The meta object literal for the '<em><b>Dur</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__DUR = eINSTANCE.getRoot_Dur();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__PERIOD = eINSTANCE.getRoot_Period();

		/**
		 * The meta object literal for the '<em><b>Rloc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__RLOC = eINSTANCE.getRoot_Rloc();

		/**
		 * The meta object literal for the '<em><b>Rd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__RD = eINSTANCE.getRoot_Rd();

		/**
		 * The meta object literal for the '<em><b>Loc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__LOC = eINSTANCE.getRoot_Loc();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.RBACUtilityImpl <em>RBAC Utility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.RBACUtilityImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getRBACUtility()
		 * @generated
		 */
		EClass RBAC_UTILITY = eINSTANCE.getRBACUtility();

		/**
		 * The meta object literal for the '<em><b>Max Permission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RBAC_UTILITY__MAX_PERMISSION = eINSTANCE.getRBACUtility_MaxPermission();

		/**
		 * The meta object literal for the '<em><b>Max Active Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RBAC_UTILITY__MAX_ACTIVE_ROLE = eINSTANCE.getRBACUtility_MaxActiveRole();

		/**
		 * The meta object literal for the '<em><b>Max Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RBAC_UTILITY__MAX_ROLE = eINSTANCE.getRBACUtility_MaxRole();

		/**
		 * The meta object literal for the '<em><b>Business Task List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBAC_UTILITY__BUSINESS_TASK_LIST = eINSTANCE.getRBACUtility_BusinessTaskList();

		/**
		 * The meta object literal for the '<em><b>Bounded Permissions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBAC_UTILITY__BOUNDED_PERMISSIONS = eINSTANCE.getRBACUtility_BoundedPermissions();

		/**
		 * The meta object literal for the '<em><b>Current T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBAC_UTILITY__CURRENT_T = eINSTANCE.getRBACUtility_CurrentT();

		/**
		 * The meta object literal for the '<em><b>Current Day</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RBAC_UTILITY__CURRENT_DAY = eINSTANCE.getRBACUtility_CurrentDay();

		/**
		 * The meta object literal for the '<em><b>Get Bound Permission</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RBAC_UTILITY___GET_BOUND_PERMISSION = eINSTANCE.getRBACUtility__GetBoundPermission();

		/**
		 * The meta object literal for the '<em><b>Get Current Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RBAC_UTILITY___GET_CURRENT_DATE = eINSTANCE.getRBACUtility__GetCurrentDate();

		/**
		 * The meta object literal for the '<em><b>Get Current Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RBAC_UTILITY___GET_CURRENT_TIME = eINSTANCE.getRBACUtility__GetCurrentTime();

		/**
		 * The meta object literal for the '<em><b>Get Day Of Week</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RBAC_UTILITY___GET_DAY_OF_WEEK = eINSTANCE.getRBACUtility__GetDayOfWeek();

		/**
		 * The meta object literal for the '<em><b>Get Cumulative Active Duration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RBAC_UTILITY___GET_CUMULATIVE_ACTIVE_DURATION__ROLE_USER_TIMEUNITTYPE = eINSTANCE.getRBACUtility__GetCumulativeActiveDuration__Role_User_TimeUnitType();

		/**
		 * The meta object literal for the '<em><b>Get Active Duration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RBAC_UTILITY___GET_ACTIVE_DURATION__ROLE_TIMEUNITTYPE = eINSTANCE.getRBACUtility__GetActiveDuration__Role_TimeUnitType();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.AbsoluteTEImpl <em>Absolute TE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.AbsoluteTEImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getAbsoluteTE()
		 * @generated
		 */
		EClass ABSOLUTE_TE = eINSTANCE.getAbsoluteTE();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSOLUTE_TE__DURATION = eINSTANCE.getAbsoluteTE_Duration();

		/**
		 * The meta object literal for the '<em><b>Id Absolute TE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSOLUTE_TE__ID_ABSOLUTE_TE = eINSTANCE.getAbsoluteTE_IdAbsoluteTE();

		/**
		 * The meta object literal for the '<em><b>Has Duration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSOLUTE_TE___HAS_DURATION = eINSTANCE.getAbsoluteTE__HasDuration();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.RelativeTEImpl <em>Relative TE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.RelativeTEImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getRelativeTE()
		 * @generated
		 */
		EClass RELATIVE_TE = eINSTANCE.getRelativeTE();

		/**
		 * The meta object literal for the '<em><b>Id Relative TE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_TE__ID_RELATIVE_TE = eINSTANCE.getRelativeTE_IdRelativeTE();

		/**
		 * The meta object literal for the '<em><b>D2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_TE__D2 = eINSTANCE.getRelativeTE_D2();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.ActivationDurationImpl <em>Activation Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.ActivationDurationImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getActivationDuration()
		 * @generated
		 */
		EClass ACTIVATION_DURATION = eINSTANCE.getActivationDuration();

		/**
		 * The meta object literal for the '<em><b>Id Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_DURATION__ID_DURATION = eINSTANCE.getActivationDuration_IdDuration();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_DURATION__VALUE = eINSTANCE.getActivationDuration_Value();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_DURATION__TIME_UNIT = eINSTANCE.getActivationDuration_TimeUnit();

		/**
		 * The meta object literal for the '<em><b>Is Continous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_DURATION__IS_CONTINOUS = eINSTANCE.getActivationDuration_IsContinous();

		/**
		 * The meta object literal for the '<em><b>Aexp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_DURATION__AEXP = eINSTANCE.getActivationDuration_Aexp();

		/**
		 * The meta object literal for the '<em><b>Rexp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVATION_DURATION__REXP = eINSTANCE.getActivationDuration_Rexp();

		/**
		 * The meta object literal for the '<em><b>Greater Than</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVATION_DURATION___GREATER_THAN__ACTIVATIONDURATION = eINSTANCE.getActivationDuration__GreaterThan__ActivationDuration();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.TimePointImpl <em>Time Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.TimePointImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getTimePoint()
		 * @generated
		 */
		EClass TIME_POINT = eINSTANCE.getTimePoint();

		/**
		 * The meta object literal for the '<em><b>Second</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_POINT__SECOND = eINSTANCE.getTimePoint_Second();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_POINT__MINUTE = eINSTANCE.getTimePoint_Minute();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_POINT__HOUR = eINSTANCE.getTimePoint_Hour();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_POINT__DAY = eINSTANCE.getTimePoint_Day();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_POINT__MONTH = eINSTANCE.getTimePoint_Month();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_POINT__YEAR = eINSTANCE.getTimePoint_Year();

		/**
		 * The meta object literal for the '<em><b>Equal To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_POINT___EQUAL_TO__TIMEPOINT = eINSTANCE.getTimePoint__EqualTo__TimePoint();

		/**
		 * The meta object literal for the '<em><b>Is Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_POINT___IS_BEFORE__TIMEPOINT = eINSTANCE.getTimePoint__IsBefore__TimePoint();

		/**
		 * The meta object literal for the '<em><b>Is After</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_POINT___IS_AFTER__TIMEPOINT = eINSTANCE.getTimePoint__IsAfter__TimePoint();

		/**
		 * The meta object literal for the '<em><b>Is Contained</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_POINT___IS_CONTAINED__TIMEINTERVAL = eINSTANCE.getTimePoint__IsContained__TimeInterval();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.TimeIntervalImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getTimeInterval()
		 * @generated
		 */
		EClass TIME_INTERVAL = eINSTANCE.getTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_INTERVAL__START = eINSTANCE.getTimeInterval_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_INTERVAL__END = eINSTANCE.getTimeInterval_End();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.ComposedRelativeTEImpl <em>Composed Relative TE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.ComposedRelativeTEImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getComposedRelativeTE()
		 * @generated
		 */
		EClass COMPOSED_RELATIVE_TE = eINSTANCE.getComposedRelativeTE();

		/**
		 * The meta object literal for the '<em><b>Overlay</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_RELATIVE_TE__OVERLAY = eINSTANCE.getComposedRelativeTE_Overlay();

		/**
		 * The meta object literal for the '<em><b>Check Hours</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSED_RELATIVE_TE___CHECK_HOURS__RBACUTILITY = eINSTANCE.getComposedRelativeTE__CheckHours__RBACUtility();

		/**
		 * The meta object literal for the '<em><b>Check Days</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSED_RELATIVE_TE___CHECK_DAYS__RBACUTILITY = eINSTANCE.getComposedRelativeTE__CheckDays__RBACUtility();

		/**
		 * The meta object literal for the '<em><b>Check Days Rank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSED_RELATIVE_TE___CHECK_DAYS_RANK__RBACUTILITY = eINSTANCE.getComposedRelativeTE__CheckDaysRank__RBACUtility();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.RelativeTimeIntervalImpl <em>Relative Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.RelativeTimeIntervalImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getRelativeTimeInterval()
		 * @generated
		 */
		EClass RELATIVE_TIME_INTERVAL = eINSTANCE.getRelativeTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_TIME_INTERVAL__START = eINSTANCE.getRelativeTimeInterval_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_TIME_INTERVAL__END = eINSTANCE.getRelativeTimeInterval_End();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.RelativeTimePointImpl <em>Relative Time Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.RelativeTimePointImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getRelativeTimePoint()
		 * @generated
		 */
		EClass RELATIVE_TIME_POINT = eINSTANCE.getRelativeTimePoint();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_TIME_POINT__RANK = eINSTANCE.getRelativeTimePoint_Rank();

		/**
		 * The meta object literal for the '<em><b>Is Contained</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIVE_TIME_POINT___IS_CONTAINED__RELATIVETIMEINTERVAL = eINSTANCE.getRelativeTimePoint__IsContained__RelativeTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Equal To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIVE_TIME_POINT___EQUAL_TO__RELATIVETIMEPOINT = eINSTANCE.getRelativeTimePoint__EqualTo__RelativeTimePoint();

		/**
		 * The meta object literal for the '<em><b>Is After</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIVE_TIME_POINT___IS_AFTER__RELATIVETIMEPOINT = eINSTANCE.getRelativeTimePoint__IsAfter__RelativeTimePoint();

		/**
		 * The meta object literal for the '<em><b>Is Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATIVE_TIME_POINT___IS_BEFORE__RELATIVETIMEPOINT = eINSTANCE.getRelativeTimePoint__IsBefore__RelativeTimePoint();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.DayOfWeekImpl <em>Day Of Week</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.DayOfWeekImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getDayOfWeek()
		 * @generated
		 */
		EClass DAY_OF_WEEK = eINSTANCE.getDayOfWeek();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY_OF_WEEK__DAY = eINSTANCE.getDayOfWeek_Day();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.DayOfMonthImpl <em>Day Of Month</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.DayOfMonthImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getDayOfMonth()
		 * @generated
		 */
		EClass DAY_OF_MONTH = eINSTANCE.getDayOfMonth();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY_OF_MONTH__DAY = eINSTANCE.getDayOfMonth_Day();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY_OF_MONTH__MONTH = eINSTANCE.getDayOfMonth_Month();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.MonthOfYearImpl <em>Month Of Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.MonthOfYearImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getMonthOfYear()
		 * @generated
		 */
		EClass MONTH_OF_YEAR = eINSTANCE.getMonthOfYear();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONTH_OF_YEAR__MONTH = eINSTANCE.getMonthOfYear_Month();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.HourOfDayImpl <em>Hour Of Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.HourOfDayImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getHourOfDay()
		 * @generated
		 */
		EClass HOUR_OF_DAY = eINSTANCE.getHourOfDay();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUR_OF_DAY__HOUR = eINSTANCE.getHourOfDay_Hour();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUR_OF_DAY__MINUTE = eINSTANCE.getHourOfDay_Minute();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.PeriodicTimeImpl <em>Periodic Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.PeriodicTimeImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getPeriodicTime()
		 * @generated
		 */
		EClass PERIODIC_TIME = eINSTANCE.getPeriodicTime();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_TIME__FREQUENCY = eINSTANCE.getPeriodicTime_Frequency();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_TIME__TIME_UNIT = eINSTANCE.getPeriodicTime_TimeUnit();

		/**
		 * The meta object literal for the '<em><b>Id Periodic Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_TIME__ID_PERIODIC_TIME = eINSTANCE.getPeriodicTime_IdPeriodicTime();

		/**
		 * The meta object literal for the '<em><b>Next Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_TIME__NEXT_START = eINSTANCE.getPeriodicTime_NextStart();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.RelativeLocationImpl <em>Relative Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.RelativeLocationImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getRelativeLocation()
		 * @generated
		 */
		EClass RELATIVE_LOCATION = eINSTANCE.getRelativeLocation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_LOCATION__LOCATION = eINSTANCE.getRelativeLocation_Location();

		/**
		 * The meta object literal for the '<em><b>Relative Loc ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_LOCATION__RELATIVE_LOC_ID = eINSTANCE.getRelativeLocation_RelativeLocID();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_LOCATION__DISTANCE = eINSTANCE.getRelativeLocation_Distance();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_LOCATION__UNIT = eINSTANCE.getRelativeLocation_Unit();

		/**
		 * The meta object literal for the '<em><b>Relativedirection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_LOCATION__RELATIVEDIRECTION = eINSTANCE.getRelativeLocation_Relativedirection();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.LocationImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Relativelocation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__RELATIVELOCATION = eINSTANCE.getLocation_Relativelocation();

		/**
		 * The meta object literal for the '<em><b>Location ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LOCATION_ID = eINSTANCE.getLocation_LocationID();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LABEL = eINSTANCE.getLocation_Label();

		/**
		 * The meta object literal for the '<em><b>Disjoint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION___DISJOINT__LOCATION = eINSTANCE.getLocation__Disjoint__Location();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION___CONTAINS__LOCATION = eINSTANCE.getLocation__Contains__Location();

		/**
		 * The meta object literal for the '<em><b>Overlaps</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION___OVERLAPS__LOCATION = eINSTANCE.getLocation__Overlaps__Location();

		/**
		 * The meta object literal for the '<em><b>Compute Relative</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOCATION___COMPUTE_RELATIVE__RELATIVELOCATION = eINSTANCE.getLocation__ComputeRelative__RelativeLocation();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.PhysicalLocationImpl <em>Physical Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.PhysicalLocationImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getPhysicalLocation()
		 * @generated
		 */
		EClass PHYSICAL_LOCATION = eINSTANCE.getPhysicalLocation();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.LogicalLocationImpl <em>Logical Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.LogicalLocationImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getLogicalLocation()
		 * @generated
		 */
		EClass LOGICAL_LOCATION = eINSTANCE.getLogicalLocation();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.PointImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__LONG = eINSTANCE.getPoint_Long();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__LAT = eINSTANCE.getPoint_Lat();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__ALT = eINSTANCE.getPoint_Alt();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.PolygonImpl <em>Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.PolygonImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getPolygon()
		 * @generated
		 */
		EClass POLYGON = eINSTANCE.getPolygon();

		/**
		 * The meta object literal for the '<em><b>Segment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGON__SEGMENT = eINSTANCE.getPolygon_Segment();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.CircleImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCLE__CENTER = eINSTANCE.getCircle_Center();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__RADIUS = eINSTANCE.getCircle_Radius();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.PolylineImpl <em>Polyline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.PolylineImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getPolyline()
		 * @generated
		 */
		EClass POLYLINE = eINSTANCE.getPolyline();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYLINE__START = eINSTANCE.getPolyline_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYLINE__END = eINSTANCE.getPolyline_End();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.RelativeDirectionImpl <em>Relative Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.RelativeDirectionImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getRelativeDirection()
		 * @generated
		 */
		EClass RELATIVE_DIRECTION = eINSTANCE.getRelativeDirection();

		/**
		 * The meta object literal for the '<em><b>Relativelocation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_DIRECTION__RELATIVELOCATION = eINSTANCE.getRelativeDirection_Relativelocation();

		/**
		 * The meta object literal for the '<em><b>Id Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_DIRECTION__ID_DIRECTION = eINSTANCE.getRelativeDirection_IdDirection();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.CardinalDirectionImpl <em>Cardinal Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.CardinalDirectionImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getCardinalDirection()
		 * @generated
		 */
		EClass CARDINAL_DIRECTION = eINSTANCE.getCardinalDirection();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINAL_DIRECTION__DIRECTION = eINSTANCE.getCardinalDirection_Direction();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINAL_DIRECTION__ANGLE = eINSTANCE.getCardinalDirection_Angle();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.QualitativeDirectionImpl <em>Qualitative Direction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.QualitativeDirectionImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getQualitativeDirection()
		 * @generated
		 */
		EClass QUALITATIVE_DIRECTION = eINSTANCE.getQualitativeDirection();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITATIVE_DIRECTION__DIRECTION = eINSTANCE.getQualitativeDirection_Direction();

		/**
		 * The meta object literal for the '{@link gemRBAC.impl.TemporalContextImpl <em>Temporal Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.impl.TemporalContextImpl
		 * @see gemRBAC.impl.GemRBACPackageImpl#getTemporalContext()
		 * @generated
		 */
		EClass TEMPORAL_CONTEXT = eINSTANCE.getTemporalContext();

		/**
		 * The meta object literal for the '<em><b>Timeexpression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_CONTEXT__TIMEEXPRESSION = eINSTANCE.getTemporalContext_Timeexpression();

		/**
		 * The meta object literal for the '{@link gemRBAC.TimeUnitType <em>Time Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.TimeUnitType
		 * @see gemRBAC.impl.GemRBACPackageImpl#getTimeUnitType()
		 * @generated
		 */
		EEnum TIME_UNIT_TYPE = eINSTANCE.getTimeUnitType();

		/**
		 * The meta object literal for the '{@link gemRBAC.DayType <em>Day Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.DayType
		 * @see gemRBAC.impl.GemRBACPackageImpl#getDayType()
		 * @generated
		 */
		EEnum DAY_TYPE = eINSTANCE.getDayType();

		/**
		 * The meta object literal for the '{@link gemRBAC.CardinalType <em>Cardinal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.CardinalType
		 * @see gemRBAC.impl.GemRBACPackageImpl#getCardinalType()
		 * @generated
		 */
		EEnum CARDINAL_TYPE = eINSTANCE.getCardinalType();

		/**
		 * The meta object literal for the '{@link gemRBAC.QualitativeType <em>Qualitative Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.QualitativeType
		 * @see gemRBAC.impl.GemRBACPackageImpl#getQualitativeType()
		 * @generated
		 */
		EEnum QUALITATIVE_TYPE = eINSTANCE.getQualitativeType();

		/**
		 * The meta object literal for the '{@link gemRBAC.delegationType <em>delegation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gemRBAC.delegationType
		 * @see gemRBAC.impl.GemRBACPackageImpl#getdelegationType()
		 * @generated
		 */
		EEnum DELEGATION_TYPE = eINSTANCE.getdelegationType();

	}

} //GemRBACPackage
