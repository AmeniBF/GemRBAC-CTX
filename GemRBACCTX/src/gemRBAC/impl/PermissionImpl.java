/**
 */
package gemRBAC.impl;

import gemRBAC.Delegation;
import gemRBAC.GemRBACPackage;
import gemRBAC.History;
import gemRBAC.Operation;
import gemRBAC.Permission;
import gemRBAC.RBACContext;
import gemRBAC.Role;

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
 * An implementation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.PermissionImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link gemRBAC.impl.PermissionImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link gemRBAC.impl.PermissionImpl#getIdPermission <em>Id Permission</em>}</li>
 *   <li>{@link gemRBAC.impl.PermissionImpl#getObject <em>Object</em>}</li>
 *   <li>{@link gemRBAC.impl.PermissionImpl#getDelegation <em>Delegation</em>}</li>
 *   <li>{@link gemRBAC.impl.PermissionImpl#getLogPermission <em>Log Permission</em>}</li>
 *   <li>{@link gemRBAC.impl.PermissionImpl#getPermissionContextAssignment <em>Permission Context Assignment</em>}</li>
 *   <li>{@link gemRBAC.impl.PermissionImpl#getPermissionContextEnabling <em>Permission Context Enabling</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PermissionImpl extends MinimalEObjectImpl.Container implements Permission {
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
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The default value of the '{@link #getIdPermission() <em>Id Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPermission()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_PERMISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdPermission() <em>Id Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPermission()
	 * @generated
	 * @ordered
	 */
	protected String idPermission = ID_PERMISSION_EDEFAULT;

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
	 * The cached value of the '{@link #getDelegation() <em>Delegation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegation()
	 * @generated
	 * @ordered
	 */
	protected EList<Delegation> delegation;

	/**
	 * The cached value of the '{@link #getLogPermission() <em>Log Permission</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogPermission()
	 * @generated
	 * @ordered
	 */
	protected EList<History> logPermission;

	/**
	 * The cached value of the '{@link #getPermissionContextAssignment() <em>Permission Context Assignment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionContextAssignment()
	 * @generated
	 * @ordered
	 */
	protected EList<RBACContext> permissionContextAssignment;

	/**
	 * The cached value of the '{@link #getPermissionContextEnabling() <em>Permission Context Enabling</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionContextEnabling()
	 * @generated
	 * @ordered
	 */
	protected EList<RBACContext> permissionContextEnabling;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.PERMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, GemRBACPackage.PERMISSION__ROLES, GemRBACPackage.ROLE__PERMISSIONS);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectWithInverseResolvingEList.ManyInverse<Operation>(Operation.class, this, GemRBACPackage.PERMISSION__OPERATIONS, GemRBACPackage.OPERATION__PERMISSIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdPermission() {
		return idPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdPermission(String newIdPermission) {
		String oldIdPermission = idPermission;
		idPermission = newIdPermission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.PERMISSION__ID_PERMISSION, oldIdPermission, idPermission));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.PERMISSION__OBJECT, oldObject, object));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.PERMISSION__OBJECT, oldObject, newObject);
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
				msgs = ((InternalEObject)object).eInverseRemove(this, GemRBACPackage.OBJECT__PERMISSIONS, gemRBAC.Object.class, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, GemRBACPackage.OBJECT__PERMISSIONS, gemRBAC.Object.class, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.PERMISSION__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delegation> getDelegation() {
		if (delegation == null) {
			delegation = new EObjectWithInverseResolvingEList.ManyInverse<Delegation>(Delegation.class, this, GemRBACPackage.PERMISSION__DELEGATION, GemRBACPackage.DELEGATION__DELEGATED_PERMISSIONS);
		}
		return delegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<History> getLogPermission() {
		if (logPermission == null) {
			logPermission = new EObjectWithInverseResolvingEList<History>(History.class, this, GemRBACPackage.PERMISSION__LOG_PERMISSION, GemRBACPackage.HISTORY__PERMISSION);
		}
		return logPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RBACContext> getPermissionContextAssignment() {
		if (permissionContextAssignment == null) {
			permissionContextAssignment = new EObjectWithInverseResolvingEList<RBACContext>(RBACContext.class, this, GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ASSIGNMENT, GemRBACPackage.RBAC_CONTEXT__P1);
		}
		return permissionContextAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RBACContext> getPermissionContextEnabling() {
		if (permissionContextEnabling == null) {
			permissionContextEnabling = new EObjectWithInverseResolvingEList<RBACContext>(RBACContext.class, this, GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ENABLING, GemRBACPackage.RBAC_CONTEXT__P2);
		}
		return permissionContextEnabling;
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
			case GemRBACPackage.PERMISSION__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.PERMISSION__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.PERMISSION__OBJECT:
				if (object != null)
					msgs = ((InternalEObject)object).eInverseRemove(this, GemRBACPackage.OBJECT__PERMISSIONS, gemRBAC.Object.class, msgs);
				return basicSetObject((gemRBAC.Object)otherEnd, msgs);
			case GemRBACPackage.PERMISSION__DELEGATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegation()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.PERMISSION__LOG_PERMISSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLogPermission()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ASSIGNMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPermissionContextAssignment()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ENABLING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPermissionContextEnabling()).basicAdd(otherEnd, msgs);
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
			case GemRBACPackage.PERMISSION__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.PERMISSION__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.PERMISSION__OBJECT:
				return basicSetObject(null, msgs);
			case GemRBACPackage.PERMISSION__DELEGATION:
				return ((InternalEList<?>)getDelegation()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.PERMISSION__LOG_PERMISSION:
				return ((InternalEList<?>)getLogPermission()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ASSIGNMENT:
				return ((InternalEList<?>)getPermissionContextAssignment()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ENABLING:
				return ((InternalEList<?>)getPermissionContextEnabling()).basicRemove(otherEnd, msgs);
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
			case GemRBACPackage.PERMISSION__ROLES:
				return getRoles();
			case GemRBACPackage.PERMISSION__OPERATIONS:
				return getOperations();
			case GemRBACPackage.PERMISSION__ID_PERMISSION:
				return getIdPermission();
			case GemRBACPackage.PERMISSION__OBJECT:
				if (resolve) return getObject();
				return basicGetObject();
			case GemRBACPackage.PERMISSION__DELEGATION:
				return getDelegation();
			case GemRBACPackage.PERMISSION__LOG_PERMISSION:
				return getLogPermission();
			case GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ASSIGNMENT:
				return getPermissionContextAssignment();
			case GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ENABLING:
				return getPermissionContextEnabling();
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
			case GemRBACPackage.PERMISSION__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case GemRBACPackage.PERMISSION__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case GemRBACPackage.PERMISSION__ID_PERMISSION:
				setIdPermission((String)newValue);
				return;
			case GemRBACPackage.PERMISSION__OBJECT:
				setObject((gemRBAC.Object)newValue);
				return;
			case GemRBACPackage.PERMISSION__DELEGATION:
				getDelegation().clear();
				getDelegation().addAll((Collection<? extends Delegation>)newValue);
				return;
			case GemRBACPackage.PERMISSION__LOG_PERMISSION:
				getLogPermission().clear();
				getLogPermission().addAll((Collection<? extends History>)newValue);
				return;
			case GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ASSIGNMENT:
				getPermissionContextAssignment().clear();
				getPermissionContextAssignment().addAll((Collection<? extends RBACContext>)newValue);
				return;
			case GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ENABLING:
				getPermissionContextEnabling().clear();
				getPermissionContextEnabling().addAll((Collection<? extends RBACContext>)newValue);
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
			case GemRBACPackage.PERMISSION__ROLES:
				getRoles().clear();
				return;
			case GemRBACPackage.PERMISSION__OPERATIONS:
				getOperations().clear();
				return;
			case GemRBACPackage.PERMISSION__ID_PERMISSION:
				setIdPermission(ID_PERMISSION_EDEFAULT);
				return;
			case GemRBACPackage.PERMISSION__OBJECT:
				setObject((gemRBAC.Object)null);
				return;
			case GemRBACPackage.PERMISSION__DELEGATION:
				getDelegation().clear();
				return;
			case GemRBACPackage.PERMISSION__LOG_PERMISSION:
				getLogPermission().clear();
				return;
			case GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ASSIGNMENT:
				getPermissionContextAssignment().clear();
				return;
			case GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ENABLING:
				getPermissionContextEnabling().clear();
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
			case GemRBACPackage.PERMISSION__ROLES:
				return roles != null && !roles.isEmpty();
			case GemRBACPackage.PERMISSION__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case GemRBACPackage.PERMISSION__ID_PERMISSION:
				return ID_PERMISSION_EDEFAULT == null ? idPermission != null : !ID_PERMISSION_EDEFAULT.equals(idPermission);
			case GemRBACPackage.PERMISSION__OBJECT:
				return object != null;
			case GemRBACPackage.PERMISSION__DELEGATION:
				return delegation != null && !delegation.isEmpty();
			case GemRBACPackage.PERMISSION__LOG_PERMISSION:
				return logPermission != null && !logPermission.isEmpty();
			case GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ASSIGNMENT:
				return permissionContextAssignment != null && !permissionContextAssignment.isEmpty();
			case GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ENABLING:
				return permissionContextEnabling != null && !permissionContextEnabling.isEmpty();
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
		result.append(" (idPermission: ");
		result.append(idPermission);
		result.append(')');
		return result.toString();
	}

} //PermissionImpl
