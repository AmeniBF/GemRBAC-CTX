/**
 */
package gemRBAC.impl;

import gemRBAC.GemRBACPackage;
import gemRBAC.History;
import gemRBAC.Operation;
import gemRBAC.Permission;
import gemRBAC.Role;
import gemRBAC.Session;
import gemRBAC.User;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.SessionImpl#getIdSession <em>Id Session</em>}</li>
 *   <li>{@link gemRBAC.impl.SessionImpl#getActiveRoles <em>Active Roles</em>}</li>
 *   <li>{@link gemRBAC.impl.SessionImpl#getEnabledRoles <em>Enabled Roles</em>}</li>
 *   <li>{@link gemRBAC.impl.SessionImpl#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SessionImpl extends MinimalEObjectImpl.Container implements Session {
	/**
	 * The default value of the '{@link #getIdSession() <em>Id Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdSession()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_SESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdSession() <em>Id Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdSession()
	 * @generated
	 * @ordered
	 */
	protected String idSession = ID_SESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActiveRoles() <em>Active Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> activeRoles;

	/**
	 * The cached value of the '{@link #getEnabledRoles() <em>Enabled Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> enabledRoles;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdSession() {
		return idSession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdSession(String newIdSession) {
		String oldIdSession = idSession;
		idSession = newIdSession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.SESSION__ID_SESSION, oldIdSession, idSession));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getActiveRoles() {
		if (activeRoles == null) {
			activeRoles = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, GemRBACPackage.SESSION__ACTIVE_ROLES, GemRBACPackage.ROLE__SESSIONS_A);
		}
		return activeRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getEnabledRoles() {
		if (enabledRoles == null) {
			enabledRoles = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, GemRBACPackage.SESSION__ENABLED_ROLES, GemRBACPackage.ROLE__SESSIONS_E);
		}
		return enabledRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject)user;
			user = (User)eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.SESSION__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(User newUser, NotificationChain msgs) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.SESSION__USER, oldUser, newUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject)user).eInverseRemove(this, GemRBACPackage.USER__SESSIONS, User.class, msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, GemRBACPackage.USER__SESSIONS, User.class, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.SESSION__USER, newUser, newUser));
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
	public void enableRole(Role r) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void disableRole(Role r) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void activateRole(Role r) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deactivateRole(Role r) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void performOperation(Operation op, Permission p, Role r) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delegateRole(Role r) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case GemRBACPackage.SESSION__ACTIVE_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActiveRoles()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.SESSION__ENABLED_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnabledRoles()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.SESSION__USER:
				if (user != null)
					msgs = ((InternalEObject)user).eInverseRemove(this, GemRBACPackage.USER__SESSIONS, User.class, msgs);
				return basicSetUser((User)otherEnd, msgs);
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
			case GemRBACPackage.SESSION__ACTIVE_ROLES:
				return ((InternalEList<?>)getActiveRoles()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.SESSION__ENABLED_ROLES:
				return ((InternalEList<?>)getEnabledRoles()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.SESSION__USER:
				return basicSetUser(null, msgs);
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
			case GemRBACPackage.SESSION__ID_SESSION:
				return getIdSession();
			case GemRBACPackage.SESSION__ACTIVE_ROLES:
				return getActiveRoles();
			case GemRBACPackage.SESSION__ENABLED_ROLES:
				return getEnabledRoles();
			case GemRBACPackage.SESSION__USER:
				if (resolve) return getUser();
				return basicGetUser();
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
			case GemRBACPackage.SESSION__ID_SESSION:
				setIdSession((String)newValue);
				return;
			case GemRBACPackage.SESSION__ACTIVE_ROLES:
				getActiveRoles().clear();
				getActiveRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case GemRBACPackage.SESSION__ENABLED_ROLES:
				getEnabledRoles().clear();
				getEnabledRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case GemRBACPackage.SESSION__USER:
				setUser((User)newValue);
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
			case GemRBACPackage.SESSION__ID_SESSION:
				setIdSession(ID_SESSION_EDEFAULT);
				return;
			case GemRBACPackage.SESSION__ACTIVE_ROLES:
				getActiveRoles().clear();
				return;
			case GemRBACPackage.SESSION__ENABLED_ROLES:
				getEnabledRoles().clear();
				return;
			case GemRBACPackage.SESSION__USER:
				setUser((User)null);
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
			case GemRBACPackage.SESSION__ID_SESSION:
				return ID_SESSION_EDEFAULT == null ? idSession != null : !ID_SESSION_EDEFAULT.equals(idSession);
			case GemRBACPackage.SESSION__ACTIVE_ROLES:
				return activeRoles != null && !activeRoles.isEmpty();
			case GemRBACPackage.SESSION__ENABLED_ROLES:
				return enabledRoles != null && !enabledRoles.isEmpty();
			case GemRBACPackage.SESSION__USER:
				return user != null;
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
			case GemRBACPackage.SESSION___ACCESS_HISTORY:
				return accessHistory();
			case GemRBACPackage.SESSION___ENABLE_ROLE__ROLE:
				enableRole((Role)arguments.get(0));
				return null;
			case GemRBACPackage.SESSION___DISABLE_ROLE__ROLE:
				disableRole((Role)arguments.get(0));
				return null;
			case GemRBACPackage.SESSION___ACTIVATE_ROLE__ROLE:
				activateRole((Role)arguments.get(0));
				return null;
			case GemRBACPackage.SESSION___DEACTIVATE_ROLE__ROLE:
				deactivateRole((Role)arguments.get(0));
				return null;
			case GemRBACPackage.SESSION___PERFORM_OPERATION__OPERATION_PERMISSION_ROLE:
				performOperation((Operation)arguments.get(0), (Permission)arguments.get(1), (Role)arguments.get(2));
				return null;
			case GemRBACPackage.SESSION___DELEGATE_ROLE__ROLE:
				delegateRole((Role)arguments.get(0));
				return null;
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
		result.append(" (idSession: ");
		result.append(idSession);
		result.append(')');
		return result.toString();
	}

} //SessionImpl
