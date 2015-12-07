/**
 */
package gemRBAC.impl;

import gemRBAC.GemRBACPackage;
import gemRBAC.History;
import gemRBAC.Operation;
import gemRBAC.Permission;
import gemRBAC.RBACContext;
import gemRBAC.Role;
import gemRBAC.User;

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
 * An implementation of the model object '<em><b>History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.HistoryImpl#getIdLog <em>Id Log</em>}</li>
 *   <li>{@link gemRBAC.impl.HistoryImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gemRBAC.impl.HistoryImpl#getObject <em>Object</em>}</li>
 *   <li>{@link gemRBAC.impl.HistoryImpl#getOp <em>Op</em>}</li>
 *   <li>{@link gemRBAC.impl.HistoryImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link gemRBAC.impl.HistoryImpl#getContext <em>Context</em>}</li>
 *   <li>{@link gemRBAC.impl.HistoryImpl#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryImpl extends MinimalEObjectImpl.Container implements History {
	/**
	 * The default value of the '{@link #getIdLog() <em>Id Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdLog()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_LOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdLog() <em>Id Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdLog()
	 * @generated
	 * @ordered
	 */
	protected String idLog = ID_LOG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected gemRBAC.Object object;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected Operation op;

	/**
	 * The cached value of the '{@link #getPermission() <em>Permission</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected Permission permission;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList<RBACContext> context;

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
	protected HistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdLog() {
		return idLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdLog(String newIdLog) {
		String oldIdLog = idLog;
		idLog = newIdLog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.HISTORY__ID_LOG, oldIdLog, idLog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.HISTORY__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(Role newRole, NotificationChain msgs) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.HISTORY__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, GemRBACPackage.ROLE__LOG_ROLE, Role.class, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, GemRBACPackage.ROLE__LOG_ROLE, Role.class, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.HISTORY__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gemRBAC.Object getObject() {
		if (object != null && object.eIsProxy()) {
			InternalEObject oldObject = (InternalEObject)object;
			object = (gemRBAC.Object)eResolveProxy(oldObject);
			if (object != oldObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.HISTORY__OBJECT, oldObject, object));
			}
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gemRBAC.Object basicGetObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(gemRBAC.Object newObject, NotificationChain msgs) {
		gemRBAC.Object oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.HISTORY__OBJECT, oldObject, newObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(gemRBAC.Object newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject)object).eInverseRemove(this, GemRBACPackage.OBJECT__LOG_OBJECT, gemRBAC.Object.class, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, GemRBACPackage.OBJECT__LOG_OBJECT, gemRBAC.Object.class, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.HISTORY__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOp() {
		if (op != null && op.eIsProxy()) {
			InternalEObject oldOp = (InternalEObject)op;
			op = (Operation)eResolveProxy(oldOp);
			if (op != oldOp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.HISTORY__OP, oldOp, op));
			}
		}
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp(Operation newOp, NotificationChain msgs) {
		Operation oldOp = op;
		op = newOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.HISTORY__OP, oldOp, newOp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(Operation newOp) {
		if (newOp != op) {
			NotificationChain msgs = null;
			if (op != null)
				msgs = ((InternalEObject)op).eInverseRemove(this, GemRBACPackage.OPERATION__LOG_OPERATION, Operation.class, msgs);
			if (newOp != null)
				msgs = ((InternalEObject)newOp).eInverseAdd(this, GemRBACPackage.OPERATION__LOG_OPERATION, Operation.class, msgs);
			msgs = basicSetOp(newOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.HISTORY__OP, newOp, newOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission getPermission() {
		if (permission != null && permission.eIsProxy()) {
			InternalEObject oldPermission = (InternalEObject)permission;
			permission = (Permission)eResolveProxy(oldPermission);
			if (permission != oldPermission) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.HISTORY__PERMISSION, oldPermission, permission));
			}
		}
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission basicGetPermission() {
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPermission(Permission newPermission, NotificationChain msgs) {
		Permission oldPermission = permission;
		permission = newPermission;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.HISTORY__PERMISSION, oldPermission, newPermission);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermission(Permission newPermission) {
		if (newPermission != permission) {
			NotificationChain msgs = null;
			if (permission != null)
				msgs = ((InternalEObject)permission).eInverseRemove(this, GemRBACPackage.PERMISSION__LOG_PERMISSION, Permission.class, msgs);
			if (newPermission != null)
				msgs = ((InternalEObject)newPermission).eInverseAdd(this, GemRBACPackage.PERMISSION__LOG_PERMISSION, Permission.class, msgs);
			msgs = basicSetPermission(newPermission, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.HISTORY__PERMISSION, newPermission, newPermission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RBACContext> getContext() {
		if (context == null) {
			context = new EObjectWithInverseResolvingEList.ManyInverse<RBACContext>(RBACContext.class, this, GemRBACPackage.HISTORY__CONTEXT, GemRBACPackage.RBAC_CONTEXT__LOG_CONTEXT);
		}
		return context;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.HISTORY__USER, oldUser, user));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.HISTORY__USER, oldUser, newUser);
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
				msgs = ((InternalEObject)user).eInverseRemove(this, GemRBACPackage.USER__USER_LOG, User.class, msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, GemRBACPackage.USER__USER_LOG, User.class, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.HISTORY__USER, newUser, newUser));
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
			case GemRBACPackage.HISTORY__ROLE:
				if (role != null)
					msgs = ((InternalEObject)role).eInverseRemove(this, GemRBACPackage.ROLE__LOG_ROLE, Role.class, msgs);
				return basicSetRole((Role)otherEnd, msgs);
			case GemRBACPackage.HISTORY__OBJECT:
				if (object != null)
					msgs = ((InternalEObject)object).eInverseRemove(this, GemRBACPackage.OBJECT__LOG_OBJECT, gemRBAC.Object.class, msgs);
				return basicSetObject((gemRBAC.Object)otherEnd, msgs);
			case GemRBACPackage.HISTORY__OP:
				if (op != null)
					msgs = ((InternalEObject)op).eInverseRemove(this, GemRBACPackage.OPERATION__LOG_OPERATION, Operation.class, msgs);
				return basicSetOp((Operation)otherEnd, msgs);
			case GemRBACPackage.HISTORY__PERMISSION:
				if (permission != null)
					msgs = ((InternalEObject)permission).eInverseRemove(this, GemRBACPackage.PERMISSION__LOG_PERMISSION, Permission.class, msgs);
				return basicSetPermission((Permission)otherEnd, msgs);
			case GemRBACPackage.HISTORY__CONTEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContext()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.HISTORY__USER:
				if (user != null)
					msgs = ((InternalEObject)user).eInverseRemove(this, GemRBACPackage.USER__USER_LOG, User.class, msgs);
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
			case GemRBACPackage.HISTORY__ROLE:
				return basicSetRole(null, msgs);
			case GemRBACPackage.HISTORY__OBJECT:
				return basicSetObject(null, msgs);
			case GemRBACPackage.HISTORY__OP:
				return basicSetOp(null, msgs);
			case GemRBACPackage.HISTORY__PERMISSION:
				return basicSetPermission(null, msgs);
			case GemRBACPackage.HISTORY__CONTEXT:
				return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.HISTORY__USER:
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
			case GemRBACPackage.HISTORY__ID_LOG:
				return getIdLog();
			case GemRBACPackage.HISTORY__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case GemRBACPackage.HISTORY__OBJECT:
				if (resolve) return getObject();
				return basicGetObject();
			case GemRBACPackage.HISTORY__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case GemRBACPackage.HISTORY__PERMISSION:
				if (resolve) return getPermission();
				return basicGetPermission();
			case GemRBACPackage.HISTORY__CONTEXT:
				return getContext();
			case GemRBACPackage.HISTORY__USER:
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
			case GemRBACPackage.HISTORY__ID_LOG:
				setIdLog((String)newValue);
				return;
			case GemRBACPackage.HISTORY__ROLE:
				setRole((Role)newValue);
				return;
			case GemRBACPackage.HISTORY__OBJECT:
				setObject((gemRBAC.Object)newValue);
				return;
			case GemRBACPackage.HISTORY__OP:
				setOp((Operation)newValue);
				return;
			case GemRBACPackage.HISTORY__PERMISSION:
				setPermission((Permission)newValue);
				return;
			case GemRBACPackage.HISTORY__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends RBACContext>)newValue);
				return;
			case GemRBACPackage.HISTORY__USER:
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
			case GemRBACPackage.HISTORY__ID_LOG:
				setIdLog(ID_LOG_EDEFAULT);
				return;
			case GemRBACPackage.HISTORY__ROLE:
				setRole((Role)null);
				return;
			case GemRBACPackage.HISTORY__OBJECT:
				setObject((gemRBAC.Object)null);
				return;
			case GemRBACPackage.HISTORY__OP:
				setOp((Operation)null);
				return;
			case GemRBACPackage.HISTORY__PERMISSION:
				setPermission((Permission)null);
				return;
			case GemRBACPackage.HISTORY__CONTEXT:
				getContext().clear();
				return;
			case GemRBACPackage.HISTORY__USER:
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
			case GemRBACPackage.HISTORY__ID_LOG:
				return ID_LOG_EDEFAULT == null ? idLog != null : !ID_LOG_EDEFAULT.equals(idLog);
			case GemRBACPackage.HISTORY__ROLE:
				return role != null;
			case GemRBACPackage.HISTORY__OBJECT:
				return object != null;
			case GemRBACPackage.HISTORY__OP:
				return op != null;
			case GemRBACPackage.HISTORY__PERMISSION:
				return permission != null;
			case GemRBACPackage.HISTORY__CONTEXT:
				return context != null && !context.isEmpty();
			case GemRBACPackage.HISTORY__USER:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (idLog: ");
		result.append(idLog);
		result.append(')');
		return result.toString();
	}

} //HistoryImpl
