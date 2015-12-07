/**
 */
package gemRBAC.impl;

import gemRBAC.ActivationDuration;
import gemRBAC.GemRBACPackage;
import gemRBAC.Operation;
import gemRBAC.Permission;
import gemRBAC.RBACUtility;
import gemRBAC.RelativeTimePoint;
import gemRBAC.Role;
import gemRBAC.TimePoint;
import gemRBAC.TimeUnitType;
import gemRBAC.User;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RBAC Utility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.RBACUtilityImpl#getMaxPermission <em>Max Permission</em>}</li>
 *   <li>{@link gemRBAC.impl.RBACUtilityImpl#getMaxActiveRole <em>Max Active Role</em>}</li>
 *   <li>{@link gemRBAC.impl.RBACUtilityImpl#getMaxRole <em>Max Role</em>}</li>
 *   <li>{@link gemRBAC.impl.RBACUtilityImpl#getBusinessTaskList <em>Business Task List</em>}</li>
 *   <li>{@link gemRBAC.impl.RBACUtilityImpl#getBoundedPermissions <em>Bounded Permissions</em>}</li>
 *   <li>{@link gemRBAC.impl.RBACUtilityImpl#getCurrentT <em>Current T</em>}</li>
 *   <li>{@link gemRBAC.impl.RBACUtilityImpl#getCurrentDay <em>Current Day</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RBACUtilityImpl extends MinimalEObjectImpl.Container implements RBACUtility {
	/**
	 * The default value of the '{@link #getMaxPermission() <em>Max Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPermission()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_PERMISSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxPermission() <em>Max Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPermission()
	 * @generated
	 * @ordered
	 */
	protected int maxPermission = MAX_PERMISSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxActiveRole() <em>Max Active Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxActiveRole()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ACTIVE_ROLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxActiveRole() <em>Max Active Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxActiveRole()
	 * @generated
	 * @ordered
	 */
	protected int maxActiveRole = MAX_ACTIVE_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRole() <em>Max Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRole()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ROLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxRole() <em>Max Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRole()
	 * @generated
	 * @ordered
	 */
	protected int maxRole = MAX_ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBusinessTaskList() <em>Business Task List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessTaskList()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> businessTaskList;

	/**
	 * The cached value of the '{@link #getBoundedPermissions() <em>Bounded Permissions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundedPermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> boundedPermissions;

	/**
	 * The cached value of the '{@link #getCurrentT() <em>Current T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentT()
	 * @generated
	 * @ordered
	 */
	protected TimePoint currentT;

	/**
	 * The cached value of the '{@link #getCurrentDay() <em>Current Day</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDay()
	 * @generated
	 * @ordered
	 */
	protected RelativeTimePoint currentDay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RBACUtilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.RBAC_UTILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxPermission() {
		return maxPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPermission(int newMaxPermission) {
		int oldMaxPermission = maxPermission;
		maxPermission = newMaxPermission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RBAC_UTILITY__MAX_PERMISSION, oldMaxPermission, maxPermission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxActiveRole() {
		return maxActiveRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxActiveRole(int newMaxActiveRole) {
		int oldMaxActiveRole = maxActiveRole;
		maxActiveRole = newMaxActiveRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RBAC_UTILITY__MAX_ACTIVE_ROLE, oldMaxActiveRole, maxActiveRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxRole() {
		return maxRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRole(int newMaxRole) {
		int oldMaxRole = maxRole;
		maxRole = newMaxRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RBAC_UTILITY__MAX_ROLE, oldMaxRole, maxRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getBusinessTaskList() {
		if (businessTaskList == null) {
			businessTaskList = new EObjectResolvingEList<Operation>(Operation.class, this, GemRBACPackage.RBAC_UTILITY__BUSINESS_TASK_LIST);
		}
		return businessTaskList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getBoundedPermissions() {
		if (boundedPermissions == null) {
			boundedPermissions = new EObjectResolvingEList<Permission>(Permission.class, this, GemRBACPackage.RBAC_UTILITY__BOUNDED_PERMISSIONS);
		}
		return boundedPermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePoint getCurrentT() {
		if (currentT != null && currentT.eIsProxy()) {
			InternalEObject oldCurrentT = (InternalEObject)currentT;
			currentT = (TimePoint)eResolveProxy(oldCurrentT);
			if (currentT != oldCurrentT) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.RBAC_UTILITY__CURRENT_T, oldCurrentT, currentT));
			}
		}
		return currentT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePoint basicGetCurrentT() {
		return currentT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentT(TimePoint newCurrentT) {
		TimePoint oldCurrentT = currentT;
		currentT = newCurrentT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RBAC_UTILITY__CURRENT_T, oldCurrentT, currentT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeTimePoint getCurrentDay() {
		if (currentDay != null && currentDay.eIsProxy()) {
			InternalEObject oldCurrentDay = (InternalEObject)currentDay;
			currentDay = (RelativeTimePoint)eResolveProxy(oldCurrentDay);
			if (currentDay != oldCurrentDay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.RBAC_UTILITY__CURRENT_DAY, oldCurrentDay, currentDay));
			}
		}
		return currentDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeTimePoint basicGetCurrentDay() {
		return currentDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentDay(RelativeTimePoint newCurrentDay) {
		RelativeTimePoint oldCurrentDay = currentDay;
		currentDay = newCurrentDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RBAC_UTILITY__CURRENT_DAY, oldCurrentDay, currentDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getBoundPermission() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCurrentDate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #getCurrentTime() <em>Get Current Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTime()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_CURRENT_TIME__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.RBAC_UTILITY___GET_CURRENT_TIME).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePoint getCurrentTime() {
		try {
			return (TimePoint)GET_CURRENT_TIME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getDayOfWeek() <em>Get Day Of Week</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_DAY_OF_WEEK__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.RBAC_UTILITY___GET_DAY_OF_WEEK).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeTimePoint getDayOfWeek() {
		try {
			return (RelativeTimePoint)GET_DAY_OF_WEEK__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationDuration getCumulativeActiveDuration(Role r, User u, TimeUnitType unit) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationDuration getActiveDuration(Role r, TimeUnitType unit) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GemRBACPackage.RBAC_UTILITY__MAX_PERMISSION:
				return getMaxPermission();
			case GemRBACPackage.RBAC_UTILITY__MAX_ACTIVE_ROLE:
				return getMaxActiveRole();
			case GemRBACPackage.RBAC_UTILITY__MAX_ROLE:
				return getMaxRole();
			case GemRBACPackage.RBAC_UTILITY__BUSINESS_TASK_LIST:
				return getBusinessTaskList();
			case GemRBACPackage.RBAC_UTILITY__BOUNDED_PERMISSIONS:
				return getBoundedPermissions();
			case GemRBACPackage.RBAC_UTILITY__CURRENT_T:
				if (resolve) return getCurrentT();
				return basicGetCurrentT();
			case GemRBACPackage.RBAC_UTILITY__CURRENT_DAY:
				if (resolve) return getCurrentDay();
				return basicGetCurrentDay();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GemRBACPackage.RBAC_UTILITY__MAX_PERMISSION:
				setMaxPermission((Integer)newValue);
				return;
			case GemRBACPackage.RBAC_UTILITY__MAX_ACTIVE_ROLE:
				setMaxActiveRole((Integer)newValue);
				return;
			case GemRBACPackage.RBAC_UTILITY__MAX_ROLE:
				setMaxRole((Integer)newValue);
				return;
			case GemRBACPackage.RBAC_UTILITY__BUSINESS_TASK_LIST:
				getBusinessTaskList().clear();
				getBusinessTaskList().addAll((Collection<? extends Operation>)newValue);
				return;
			case GemRBACPackage.RBAC_UTILITY__BOUNDED_PERMISSIONS:
				getBoundedPermissions().clear();
				getBoundedPermissions().addAll((Collection<? extends Permission>)newValue);
				return;
			case GemRBACPackage.RBAC_UTILITY__CURRENT_T:
				setCurrentT((TimePoint)newValue);
				return;
			case GemRBACPackage.RBAC_UTILITY__CURRENT_DAY:
				setCurrentDay((RelativeTimePoint)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GemRBACPackage.RBAC_UTILITY__MAX_PERMISSION:
				setMaxPermission(MAX_PERMISSION_EDEFAULT);
				return;
			case GemRBACPackage.RBAC_UTILITY__MAX_ACTIVE_ROLE:
				setMaxActiveRole(MAX_ACTIVE_ROLE_EDEFAULT);
				return;
			case GemRBACPackage.RBAC_UTILITY__MAX_ROLE:
				setMaxRole(MAX_ROLE_EDEFAULT);
				return;
			case GemRBACPackage.RBAC_UTILITY__BUSINESS_TASK_LIST:
				getBusinessTaskList().clear();
				return;
			case GemRBACPackage.RBAC_UTILITY__BOUNDED_PERMISSIONS:
				getBoundedPermissions().clear();
				return;
			case GemRBACPackage.RBAC_UTILITY__CURRENT_T:
				setCurrentT((TimePoint)null);
				return;
			case GemRBACPackage.RBAC_UTILITY__CURRENT_DAY:
				setCurrentDay((RelativeTimePoint)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GemRBACPackage.RBAC_UTILITY__MAX_PERMISSION:
				return maxPermission != MAX_PERMISSION_EDEFAULT;
			case GemRBACPackage.RBAC_UTILITY__MAX_ACTIVE_ROLE:
				return maxActiveRole != MAX_ACTIVE_ROLE_EDEFAULT;
			case GemRBACPackage.RBAC_UTILITY__MAX_ROLE:
				return maxRole != MAX_ROLE_EDEFAULT;
			case GemRBACPackage.RBAC_UTILITY__BUSINESS_TASK_LIST:
				return businessTaskList != null && !businessTaskList.isEmpty();
			case GemRBACPackage.RBAC_UTILITY__BOUNDED_PERMISSIONS:
				return boundedPermissions != null && !boundedPermissions.isEmpty();
			case GemRBACPackage.RBAC_UTILITY__CURRENT_T:
				return currentT != null;
			case GemRBACPackage.RBAC_UTILITY__CURRENT_DAY:
				return currentDay != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GemRBACPackage.RBAC_UTILITY___GET_BOUND_PERMISSION:
				return getBoundPermission();
			case GemRBACPackage.RBAC_UTILITY___GET_CURRENT_DATE:
				return getCurrentDate();
			case GemRBACPackage.RBAC_UTILITY___GET_CURRENT_TIME:
				return getCurrentTime();
			case GemRBACPackage.RBAC_UTILITY___GET_DAY_OF_WEEK:
				return getDayOfWeek();
			case GemRBACPackage.RBAC_UTILITY___GET_CUMULATIVE_ACTIVE_DURATION__ROLE_USER_TIMEUNITTYPE:
				return getCumulativeActiveDuration((Role)arguments.get(0), (User)arguments.get(1), (TimeUnitType)arguments.get(2));
			case GemRBACPackage.RBAC_UTILITY___GET_ACTIVE_DURATION__ROLE_TIMEUNITTYPE:
				return getActiveDuration((Role)arguments.get(0), (TimeUnitType)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maxPermission: ");
		result.append(maxPermission);
		result.append(", maxActiveRole: ");
		result.append(maxActiveRole);
		result.append(", maxRole: ");
		result.append(maxRole);
		result.append(')');
		return result.toString();
	}

} //RBACUtilityImpl
