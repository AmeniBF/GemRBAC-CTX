/**
 */
package gemRBAC.impl;

import gemRBAC.Delegation;
import gemRBAC.GemRBACPackage;
import gemRBAC.History;
import gemRBAC.Role;
import gemRBAC.Session;
import gemRBAC.SpatialContext;
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
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.UserImpl#getIdUser <em>Id User</em>}</li>
 *   <li>{@link gemRBAC.impl.UserImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link gemRBAC.impl.UserImpl#getSessions <em>Sessions</em>}</li>
 *   <li>{@link gemRBAC.impl.UserImpl#getDelegation <em>Delegation</em>}</li>
 *   <li>{@link gemRBAC.impl.UserImpl#getRecieveddelegation <em>Recieveddelegation</em>}</li>
 *   <li>{@link gemRBAC.impl.UserImpl#getRevocation <em>Revocation</em>}</li>
 *   <li>{@link gemRBAC.impl.UserImpl#getDelegatedRoles <em>Delegated Roles</em>}</li>
 *   <li>{@link gemRBAC.impl.UserImpl#getUserLocation <em>User Location</em>}</li>
 *   <li>{@link gemRBAC.impl.UserImpl#getUserLog <em>User Log</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The default value of the '{@link #getIdUser() <em>Id User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdUser()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdUser() <em>Id User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdUser()
	 * @generated
	 * @ordered
	 */
	protected String idUser = ID_USER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getSessions() <em>Sessions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessions()
	 * @generated
	 * @ordered
	 */
	protected EList<Session> sessions;

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
	 * The cached value of the '{@link #getRecieveddelegation() <em>Recieveddelegation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecieveddelegation()
	 * @generated
	 * @ordered
	 */
	protected EList<Delegation> recieveddelegation;

	/**
	 * The cached value of the '{@link #getRevocation() <em>Revocation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Delegation> revocation;

	/**
	 * The cached value of the '{@link #getDelegatedRoles() <em>Delegated Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegatedRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> delegatedRoles;

	/**
	 * The cached value of the '{@link #getUserLocation() <em>User Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLocation()
	 * @generated
	 * @ordered
	 */
	protected SpatialContext userLocation;

	/**
	 * The cached value of the '{@link #getUserLog() <em>User Log</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLog()
	 * @generated
	 * @ordered
	 */
	protected EList<History> userLog;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdUser() {
		return idUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdUser(String newIdUser) {
		String oldIdUser = idUser;
		idUser = newIdUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.USER__ID_USER, oldIdUser, idUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, GemRBACPackage.USER__ROLES, GemRBACPackage.ROLE__USERS);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Session> getSessions() {
		if (sessions == null) {
			sessions = new EObjectWithInverseResolvingEList<Session>(Session.class, this, GemRBACPackage.USER__SESSIONS, GemRBACPackage.SESSION__USER);
		}
		return sessions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delegation> getDelegation() {
		if (delegation == null) {
			delegation = new EObjectWithInverseResolvingEList<Delegation>(Delegation.class, this, GemRBACPackage.USER__DELEGATION, GemRBACPackage.DELEGATION__DELEGATOR_USER);
		}
		return delegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delegation> getRecieveddelegation() {
		if (recieveddelegation == null) {
			recieveddelegation = new EObjectWithInverseResolvingEList<Delegation>(Delegation.class, this, GemRBACPackage.USER__RECIEVEDDELEGATION, GemRBACPackage.DELEGATION__DELEGATE_USER);
		}
		return recieveddelegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delegation> getRevocation() {
		if (revocation == null) {
			revocation = new EObjectWithInverseResolvingEList<Delegation>(Delegation.class, this, GemRBACPackage.USER__REVOCATION, GemRBACPackage.DELEGATION__REVOKING_USER);
		}
		return revocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getDelegatedRoles() {
		if (delegatedRoles == null) {
			delegatedRoles = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, GemRBACPackage.USER__DELEGATED_ROLES, GemRBACPackage.ROLE__USER);
		}
		return delegatedRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatialContext getUserLocation() {
		if (userLocation != null && userLocation.eIsProxy()) {
			InternalEObject oldUserLocation = (InternalEObject)userLocation;
			userLocation = (SpatialContext)eResolveProxy(oldUserLocation);
			if (userLocation != oldUserLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.USER__USER_LOCATION, oldUserLocation, userLocation));
			}
		}
		return userLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatialContext basicGetUserLocation() {
		return userLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserLocation(SpatialContext newUserLocation) {
		SpatialContext oldUserLocation = userLocation;
		userLocation = newUserLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.USER__USER_LOCATION, oldUserLocation, userLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<History> getUserLog() {
		if (userLog == null) {
			userLog = new EObjectWithInverseResolvingEList<History>(History.class, this, GemRBACPackage.USER__USER_LOG, GemRBACPackage.HISTORY__USER);
		}
		return userLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assignRole(Role r) {
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GemRBACPackage.USER__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.USER__SESSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSessions()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.USER__DELEGATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegation()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.USER__RECIEVEDDELEGATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRecieveddelegation()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.USER__REVOCATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRevocation()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.USER__DELEGATED_ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegatedRoles()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.USER__USER_LOG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUserLog()).basicAdd(otherEnd, msgs);
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
			case GemRBACPackage.USER__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.USER__SESSIONS:
				return ((InternalEList<?>)getSessions()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.USER__DELEGATION:
				return ((InternalEList<?>)getDelegation()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.USER__RECIEVEDDELEGATION:
				return ((InternalEList<?>)getRecieveddelegation()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.USER__REVOCATION:
				return ((InternalEList<?>)getRevocation()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.USER__DELEGATED_ROLES:
				return ((InternalEList<?>)getDelegatedRoles()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.USER__USER_LOG:
				return ((InternalEList<?>)getUserLog()).basicRemove(otherEnd, msgs);
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
			case GemRBACPackage.USER__ID_USER:
				return getIdUser();
			case GemRBACPackage.USER__ROLES:
				return getRoles();
			case GemRBACPackage.USER__SESSIONS:
				return getSessions();
			case GemRBACPackage.USER__DELEGATION:
				return getDelegation();
			case GemRBACPackage.USER__RECIEVEDDELEGATION:
				return getRecieveddelegation();
			case GemRBACPackage.USER__REVOCATION:
				return getRevocation();
			case GemRBACPackage.USER__DELEGATED_ROLES:
				return getDelegatedRoles();
			case GemRBACPackage.USER__USER_LOCATION:
				if (resolve) return getUserLocation();
				return basicGetUserLocation();
			case GemRBACPackage.USER__USER_LOG:
				return getUserLog();
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
			case GemRBACPackage.USER__ID_USER:
				setIdUser((String)newValue);
				return;
			case GemRBACPackage.USER__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case GemRBACPackage.USER__SESSIONS:
				getSessions().clear();
				getSessions().addAll((Collection<? extends Session>)newValue);
				return;
			case GemRBACPackage.USER__DELEGATION:
				getDelegation().clear();
				getDelegation().addAll((Collection<? extends Delegation>)newValue);
				return;
			case GemRBACPackage.USER__RECIEVEDDELEGATION:
				getRecieveddelegation().clear();
				getRecieveddelegation().addAll((Collection<? extends Delegation>)newValue);
				return;
			case GemRBACPackage.USER__REVOCATION:
				getRevocation().clear();
				getRevocation().addAll((Collection<? extends Delegation>)newValue);
				return;
			case GemRBACPackage.USER__DELEGATED_ROLES:
				getDelegatedRoles().clear();
				getDelegatedRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case GemRBACPackage.USER__USER_LOCATION:
				setUserLocation((SpatialContext)newValue);
				return;
			case GemRBACPackage.USER__USER_LOG:
				getUserLog().clear();
				getUserLog().addAll((Collection<? extends History>)newValue);
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
			case GemRBACPackage.USER__ID_USER:
				setIdUser(ID_USER_EDEFAULT);
				return;
			case GemRBACPackage.USER__ROLES:
				getRoles().clear();
				return;
			case GemRBACPackage.USER__SESSIONS:
				getSessions().clear();
				return;
			case GemRBACPackage.USER__DELEGATION:
				getDelegation().clear();
				return;
			case GemRBACPackage.USER__RECIEVEDDELEGATION:
				getRecieveddelegation().clear();
				return;
			case GemRBACPackage.USER__REVOCATION:
				getRevocation().clear();
				return;
			case GemRBACPackage.USER__DELEGATED_ROLES:
				getDelegatedRoles().clear();
				return;
			case GemRBACPackage.USER__USER_LOCATION:
				setUserLocation((SpatialContext)null);
				return;
			case GemRBACPackage.USER__USER_LOG:
				getUserLog().clear();
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
			case GemRBACPackage.USER__ID_USER:
				return ID_USER_EDEFAULT == null ? idUser != null : !ID_USER_EDEFAULT.equals(idUser);
			case GemRBACPackage.USER__ROLES:
				return roles != null && !roles.isEmpty();
			case GemRBACPackage.USER__SESSIONS:
				return sessions != null && !sessions.isEmpty();
			case GemRBACPackage.USER__DELEGATION:
				return delegation != null && !delegation.isEmpty();
			case GemRBACPackage.USER__RECIEVEDDELEGATION:
				return recieveddelegation != null && !recieveddelegation.isEmpty();
			case GemRBACPackage.USER__REVOCATION:
				return revocation != null && !revocation.isEmpty();
			case GemRBACPackage.USER__DELEGATED_ROLES:
				return delegatedRoles != null && !delegatedRoles.isEmpty();
			case GemRBACPackage.USER__USER_LOCATION:
				return userLocation != null;
			case GemRBACPackage.USER__USER_LOG:
				return userLog != null && !userLog.isEmpty();
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
			case GemRBACPackage.USER___ASSIGN_ROLE__ROLE:
				assignRole((Role)arguments.get(0));
				return null;
			case GemRBACPackage.USER___ACCESS_HISTORY:
				return accessHistory();
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
		result.append(" (idUser: ");
		result.append(idUser);
		result.append(')');
		return result.toString();
	}

} //UserImpl
