/**
 */
package gemRBAC.impl;

import gemRBAC.AbsoluteTE;
import gemRBAC.Delegation;
import gemRBAC.GemRBACPackage;
import gemRBAC.History;
import gemRBAC.Permission;
import gemRBAC.RBACContext;
import gemRBAC.RBACUtility;
import gemRBAC.Role;
import gemRBAC.Session;
import gemRBAC.User;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.RoleImpl#getIdRole <em>Id Role</em>}</li>
 *   <li>{@link gemRBAC.impl.RoleImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link gemRBAC.impl.RoleImpl#isIsDependent <em>Is Dependent</em>}</li>
 *   <li>{@link gemRBAC.impl.RoleImpl#isIsStrong <em>Is Strong</em>}</li>
 *   <li>{@link gemRBAC.impl.RoleImpl#isIsCascading <em>Is Cascading</em>}</li>
 *   <li>{@link gemRBAC.impl.RoleImpl#getSessionsA <em>Sessions A</em>}</li>
 *   <li>{@link gemRBAC.impl.RoleImpl#getSessionsE <em>Sessions E</em>}</li>
 *   <li>{@link gemRBAC.impl.RoleImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gemRBAC.impl.RoleImpl#getJuniors <em>Juniors</em>}</li>
 *   <li>{@link gemRBAC.impl.RoleImpl#getSeniors <em>Seniors</em>}</li>
 *   <li>{@link gemRBAC.impl.RoleImpl#getUser <em>User</em>}</li>
 *   <li>{@link gemRBAC.impl.RoleImpl#getDelegation <em>Delegation</em>}</li>
 *   <li>{@link gemRBAC.impl.RoleImpl#getRoleContextAssignment <em>Role Context Assignment</em>}</li>
 *   <li>{@link gemRBAC.impl.RoleImpl#getRoleContextEnabling <em>Role Context Enabling</em>}</li>
 *   <li>{@link gemRBAC.impl.RoleImpl#getLogRole <em>Log Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleImpl extends MinimalEObjectImpl.Container implements Role {
	/**
	 * The default value of the '{@link #getIdRole() <em>Id Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdRole() <em>Id Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRole()
	 * @generated
	 * @ordered
	 */
	protected String idRole = ID_ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The default value of the '{@link #isIsDependent() <em>Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDependent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEPENDENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDependent() <em>Is Dependent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDependent()
	 * @generated
	 * @ordered
	 */
	protected boolean isDependent = IS_DEPENDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStrong() <em>Is Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStrong()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STRONG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStrong() <em>Is Strong</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStrong()
	 * @generated
	 * @ordered
	 */
	protected boolean isStrong = IS_STRONG_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCascading() <em>Is Cascading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCascading()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CASCADING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCascading() <em>Is Cascading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCascading()
	 * @generated
	 * @ordered
	 */
	protected boolean isCascading = IS_CASCADING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSessionsA() <em>Sessions A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionsA()
	 * @generated
	 * @ordered
	 */
	protected EList<Session> sessionsA;

	/**
	 * The cached value of the '{@link #getSessionsE() <em>Sessions E</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionsE()
	 * @generated
	 * @ordered
	 */
	protected EList<Session> sessionsE;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> permissions;

	/**
	 * The cached value of the '{@link #getJuniors() <em>Juniors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJuniors()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> juniors;

	/**
	 * The cached value of the '{@link #getSeniors() <em>Seniors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeniors()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> seniors;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EList<User> user;

	/**
	 * The cached value of the '{@link #getDelegation() <em>Delegation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegation()
	 * @generated
	 * @ordered
	 */
	protected EList<Delegation> delegation;

	/**
	 * The cached value of the '{@link #getRoleContextAssignment() <em>Role Context Assignment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleContextAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<RBACContext> roleContextAssignment;

	/**
	 * The cached value of the '{@link #getRoleContextEnabling() <em>Role Context Enabling</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleContextEnabling()
	 * @generated
	 * @ordered
	 */
	protected EList<RBACContext> roleContextEnabling;

	/**
	 * The cached value of the '{@link #getLogRole() <em>Log Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogRole()
	 * @generated
	 * @ordered
	 */
	protected EList<History> logRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdRole() {
		return idRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdRole(String newIdRole) {
		String oldIdRole = idRole;
		idRole = newIdRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.ROLE__ID_ROLE, oldIdRole, idRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectWithInverseResolvingEList.ManyInverse<User>(User.class, this, GemRBACPackage.ROLE__USERS, GemRBACPackage.USER__ROLES);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDependent() {
		return isDependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDependent(boolean newIsDependent) {
		boolean oldIsDependent = isDependent;
		isDependent = newIsDependent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.ROLE__IS_DEPENDENT, oldIsDependent, isDependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStrong() {
		return isStrong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStrong(boolean newIsStrong) {
		boolean oldIsStrong = isStrong;
		isStrong = newIsStrong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.ROLE__IS_STRONG, oldIsStrong, isStrong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCascading() {
		return isCascading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCascading(boolean newIsCascading) {
		boolean oldIsCascading = isCascading;
		isCascading = newIsCascading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.ROLE__IS_CASCADING, oldIsCascading, isCascading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Session> getSessionsA() {
		if (sessionsA == null) {
			sessionsA = new EObjectWithInverseResolvingEList.ManyInverse<Session>(Session.class, this, GemRBACPackage.ROLE__SESSIONS_A, GemRBACPackage.SESSION__ACTIVE_ROLES);
		}
		return sessionsA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Session> getSessionsE() {
		if (sessionsE == null) {
			sessionsE = new EObjectWithInverseResolvingEList.ManyInverse<Session>(Session.class, this, GemRBACPackage.ROLE__SESSIONS_E, GemRBACPackage.SESSION__ENABLED_ROLES);
		}
		return sessionsE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getPermissions() {
		if (permissions == null) {
			permissions = new EObjectWithInverseResolvingEList.ManyInverse<Permission>(Permission.class, this, GemRBACPackage.ROLE__PERMISSIONS, GemRBACPackage.PERMISSION__ROLES);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getJuniors() {
		if (juniors == null) {
			juniors = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, GemRBACPackage.ROLE__JUNIORS, GemRBACPackage.ROLE__SENIORS);
		}
		return juniors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getSeniors() {
		if (seniors == null) {
			seniors = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, GemRBACPackage.ROLE__SENIORS, GemRBACPackage.ROLE__JUNIORS);
		}
		return seniors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUser() {
		if (user == null) {
			user = new EObjectWithInverseResolvingEList.ManyInverse<User>(User.class, this, GemRBACPackage.ROLE__USER, GemRBACPackage.USER__DELEGATED_ROLES);
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delegation> getDelegation() {
		if (delegation == null) {
			delegation = new EObjectWithInverseResolvingEList<Delegation>(Delegation.class, this, GemRBACPackage.ROLE__DELEGATION, GemRBACPackage.DELEGATION__DELEGATED_ROLE);
		}
		return delegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RBACContext> getRoleContextAssignment() {
		if (roleContextAssignment == null) {
			roleContextAssignment = new EObjectWithInverseResolvingEList<RBACContext>(RBACContext.class, this, GemRBACPackage.ROLE__ROLE_CONTEXT_ASSIGNMENT, GemRBACPackage.RBAC_CONTEXT__R1);
		}
		return roleContextAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RBACContext> getRoleContextEnabling() {
		if (roleContextEnabling == null) {
			roleContextEnabling = new EObjectWithInverseResolvingEList<RBACContext>(RBACContext.class, this, GemRBACPackage.ROLE__ROLE_CONTEXT_ENABLING, GemRBACPackage.RBAC_CONTEXT__R2);
		}
		return roleContextEnabling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<History> getLogRole() {
		if (logRole == null) {
			logRole = new EObjectWithInverseResolvingEList<History>(History.class, this, GemRBACPackage.ROLE__LOG_ROLE, GemRBACPackage.HISTORY__ROLE);
		}
		return logRole;
	}

	/**
	 * The cached invocation delegate for the '{@link #getCurrentAbsoluteTE(gemRBAC.RBACUtility) <em>Get Current Absolute TE</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentAbsoluteTE(gemRBAC.RBACUtility)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_CURRENT_ABSOLUTE_TE_RBAC_UTILITY__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.ROLE___GET_CURRENT_ABSOLUTE_TE__RBACUTILITY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteTE getCurrentAbsoluteTE(RBACUtility u) {
		try {
			return (AbsoluteTE)GET_CURRENT_ABSOLUTE_TE_RBAC_UTILITY__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{u}));
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
	public void assignPermission(Permission p) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<History> accessHistory() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<History> logBOCurrentProcessInstance() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #getAlljuniors() <em>Get Alljuniors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlljuniors()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_ALLJUNIORS__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.ROLE___GET_ALLJUNIORS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Role> getAlljuniors() {
		try {
			return (EList<Role>)GET_ALLJUNIORS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GemRBACPackage.ROLE__USERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsers()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.ROLE__SESSIONS_A:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSessionsA()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.ROLE__SESSIONS_E:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSessionsE()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.ROLE__PERMISSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPermissions()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.ROLE__JUNIORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getJuniors()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.ROLE__SENIORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSeniors()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.ROLE__USER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUser()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.ROLE__DELEGATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegation()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.ROLE__ROLE_CONTEXT_ASSIGNMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoleContextAssignment()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.ROLE__ROLE_CONTEXT_ENABLING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoleContextEnabling()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.ROLE__LOG_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLogRole()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GemRBACPackage.ROLE__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROLE__SESSIONS_A:
				return ((InternalEList<?>)getSessionsA()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROLE__SESSIONS_E:
				return ((InternalEList<?>)getSessionsE()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROLE__PERMISSIONS:
				return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROLE__JUNIORS:
				return ((InternalEList<?>)getJuniors()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROLE__SENIORS:
				return ((InternalEList<?>)getSeniors()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROLE__USER:
				return ((InternalEList<?>)getUser()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROLE__DELEGATION:
				return ((InternalEList<?>)getDelegation()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROLE__ROLE_CONTEXT_ASSIGNMENT:
				return ((InternalEList<?>)getRoleContextAssignment()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROLE__ROLE_CONTEXT_ENABLING:
				return ((InternalEList<?>)getRoleContextEnabling()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROLE__LOG_ROLE:
				return ((InternalEList<?>)getLogRole()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GemRBACPackage.ROLE__ID_ROLE:
				return getIdRole();
			case GemRBACPackage.ROLE__USERS:
				return getUsers();
			case GemRBACPackage.ROLE__IS_DEPENDENT:
				return isIsDependent();
			case GemRBACPackage.ROLE__IS_STRONG:
				return isIsStrong();
			case GemRBACPackage.ROLE__IS_CASCADING:
				return isIsCascading();
			case GemRBACPackage.ROLE__SESSIONS_A:
				return getSessionsA();
			case GemRBACPackage.ROLE__SESSIONS_E:
				return getSessionsE();
			case GemRBACPackage.ROLE__PERMISSIONS:
				return getPermissions();
			case GemRBACPackage.ROLE__JUNIORS:
				return getJuniors();
			case GemRBACPackage.ROLE__SENIORS:
				return getSeniors();
			case GemRBACPackage.ROLE__USER:
				return getUser();
			case GemRBACPackage.ROLE__DELEGATION:
				return getDelegation();
			case GemRBACPackage.ROLE__ROLE_CONTEXT_ASSIGNMENT:
				return getRoleContextAssignment();
			case GemRBACPackage.ROLE__ROLE_CONTEXT_ENABLING:
				return getRoleContextEnabling();
			case GemRBACPackage.ROLE__LOG_ROLE:
				return getLogRole();
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
			case GemRBACPackage.ROLE__ID_ROLE:
				setIdRole((String)newValue);
				return;
			case GemRBACPackage.ROLE__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case GemRBACPackage.ROLE__IS_DEPENDENT:
				setIsDependent((Boolean)newValue);
				return;
			case GemRBACPackage.ROLE__IS_STRONG:
				setIsStrong((Boolean)newValue);
				return;
			case GemRBACPackage.ROLE__IS_CASCADING:
				setIsCascading((Boolean)newValue);
				return;
			case GemRBACPackage.ROLE__SESSIONS_A:
				getSessionsA().clear();
				getSessionsA().addAll((Collection<? extends Session>)newValue);
				return;
			case GemRBACPackage.ROLE__SESSIONS_E:
				getSessionsE().clear();
				getSessionsE().addAll((Collection<? extends Session>)newValue);
				return;
			case GemRBACPackage.ROLE__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends Permission>)newValue);
				return;
			case GemRBACPackage.ROLE__JUNIORS:
				getJuniors().clear();
				getJuniors().addAll((Collection<? extends Role>)newValue);
				return;
			case GemRBACPackage.ROLE__SENIORS:
				getSeniors().clear();
				getSeniors().addAll((Collection<? extends Role>)newValue);
				return;
			case GemRBACPackage.ROLE__USER:
				getUser().clear();
				getUser().addAll((Collection<? extends User>)newValue);
				return;
			case GemRBACPackage.ROLE__DELEGATION:
				getDelegation().clear();
				getDelegation().addAll((Collection<? extends Delegation>)newValue);
				return;
			case GemRBACPackage.ROLE__ROLE_CONTEXT_ASSIGNMENT:
				getRoleContextAssignment().clear();
				getRoleContextAssignment().addAll((Collection<? extends RBACContext>)newValue);
				return;
			case GemRBACPackage.ROLE__ROLE_CONTEXT_ENABLING:
				getRoleContextEnabling().clear();
				getRoleContextEnabling().addAll((Collection<? extends RBACContext>)newValue);
				return;
			case GemRBACPackage.ROLE__LOG_ROLE:
				getLogRole().clear();
				getLogRole().addAll((Collection<? extends History>)newValue);
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
			case GemRBACPackage.ROLE__ID_ROLE:
				setIdRole(ID_ROLE_EDEFAULT);
				return;
			case GemRBACPackage.ROLE__USERS:
				getUsers().clear();
				return;
			case GemRBACPackage.ROLE__IS_DEPENDENT:
				setIsDependent(IS_DEPENDENT_EDEFAULT);
				return;
			case GemRBACPackage.ROLE__IS_STRONG:
				setIsStrong(IS_STRONG_EDEFAULT);
				return;
			case GemRBACPackage.ROLE__IS_CASCADING:
				setIsCascading(IS_CASCADING_EDEFAULT);
				return;
			case GemRBACPackage.ROLE__SESSIONS_A:
				getSessionsA().clear();
				return;
			case GemRBACPackage.ROLE__SESSIONS_E:
				getSessionsE().clear();
				return;
			case GemRBACPackage.ROLE__PERMISSIONS:
				getPermissions().clear();
				return;
			case GemRBACPackage.ROLE__JUNIORS:
				getJuniors().clear();
				return;
			case GemRBACPackage.ROLE__SENIORS:
				getSeniors().clear();
				return;
			case GemRBACPackage.ROLE__USER:
				getUser().clear();
				return;
			case GemRBACPackage.ROLE__DELEGATION:
				getDelegation().clear();
				return;
			case GemRBACPackage.ROLE__ROLE_CONTEXT_ASSIGNMENT:
				getRoleContextAssignment().clear();
				return;
			case GemRBACPackage.ROLE__ROLE_CONTEXT_ENABLING:
				getRoleContextEnabling().clear();
				return;
			case GemRBACPackage.ROLE__LOG_ROLE:
				getLogRole().clear();
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
			case GemRBACPackage.ROLE__ID_ROLE:
				return ID_ROLE_EDEFAULT == null ? idRole != null : !ID_ROLE_EDEFAULT.equals(idRole);
			case GemRBACPackage.ROLE__USERS:
				return users != null && !users.isEmpty();
			case GemRBACPackage.ROLE__IS_DEPENDENT:
				return isDependent != IS_DEPENDENT_EDEFAULT;
			case GemRBACPackage.ROLE__IS_STRONG:
				return isStrong != IS_STRONG_EDEFAULT;
			case GemRBACPackage.ROLE__IS_CASCADING:
				return isCascading != IS_CASCADING_EDEFAULT;
			case GemRBACPackage.ROLE__SESSIONS_A:
				return sessionsA != null && !sessionsA.isEmpty();
			case GemRBACPackage.ROLE__SESSIONS_E:
				return sessionsE != null && !sessionsE.isEmpty();
			case GemRBACPackage.ROLE__PERMISSIONS:
				return permissions != null && !permissions.isEmpty();
			case GemRBACPackage.ROLE__JUNIORS:
				return juniors != null && !juniors.isEmpty();
			case GemRBACPackage.ROLE__SENIORS:
				return seniors != null && !seniors.isEmpty();
			case GemRBACPackage.ROLE__USER:
				return user != null && !user.isEmpty();
			case GemRBACPackage.ROLE__DELEGATION:
				return delegation != null && !delegation.isEmpty();
			case GemRBACPackage.ROLE__ROLE_CONTEXT_ASSIGNMENT:
				return roleContextAssignment != null && !roleContextAssignment.isEmpty();
			case GemRBACPackage.ROLE__ROLE_CONTEXT_ENABLING:
				return roleContextEnabling != null && !roleContextEnabling.isEmpty();
			case GemRBACPackage.ROLE__LOG_ROLE:
				return logRole != null && !logRole.isEmpty();
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
			case GemRBACPackage.ROLE___GET_CURRENT_ABSOLUTE_TE__RBACUTILITY:
				return getCurrentAbsoluteTE((RBACUtility)arguments.get(0));
			case GemRBACPackage.ROLE___ASSIGN_PERMISSION__PERMISSION:
				assignPermission((Permission)arguments.get(0));
				return null;
			case GemRBACPackage.ROLE___ACCESS_HISTORY:
				return accessHistory();
			case GemRBACPackage.ROLE___LOG_BO_CURRENT_PROCESS_INSTANCE:
				return logBOCurrentProcessInstance();
			case GemRBACPackage.ROLE___GET_ALLJUNIORS:
				return getAlljuniors();
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
		result.append(" (idRole: ");
		result.append(idRole);
		result.append(", isDependent: ");
		result.append(isDependent);
		result.append(", isStrong: ");
		result.append(isStrong);
		result.append(", isCascading: ");
		result.append(isCascading);
		result.append(')');
		return result.toString();
	}

} //RoleImpl
