/**
 */
package gemRBAC.impl;

import gemRBAC.GemRBACPackage;
import gemRBAC.History;
import gemRBAC.Permission;

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
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.ObjectImpl#getIdObject <em>Id Object</em>}</li>
 *   <li>{@link gemRBAC.impl.ObjectImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gemRBAC.impl.ObjectImpl#getLogObject <em>Log Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends MinimalEObjectImpl.Container implements gemRBAC.Object {
	/**
	 * The default value of the '{@link #getIdObject() <em>Id Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdObject()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdObject() <em>Id Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdObject()
	 * @generated
	 * @ordered
	 */
	protected String idObject = ID_OBJECT_EDEFAULT;

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
	 * The cached value of the '{@link #getLogObject() <em>Log Object</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogObject()
	 * @generated
	 * @ordered
	 */
	protected EList<History> logObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdObject() {
		return idObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdObject(String newIdObject) {
		String oldIdObject = idObject;
		idObject = newIdObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.OBJECT__ID_OBJECT, oldIdObject, idObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getPermissions() {
		if (permissions == null) {
			permissions = new EObjectWithInverseResolvingEList<Permission>(Permission.class, this, GemRBACPackage.OBJECT__PERMISSIONS, GemRBACPackage.PERMISSION__OBJECT);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<History> getLogObject() {
		if (logObject == null) {
			logObject = new EObjectWithInverseResolvingEList<History>(History.class, this, GemRBACPackage.OBJECT__LOG_OBJECT, GemRBACPackage.HISTORY__OBJECT);
		}
		return logObject;
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
			case GemRBACPackage.OBJECT__PERMISSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPermissions()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.OBJECT__LOG_OBJECT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLogObject()).basicAdd(otherEnd, msgs);
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
			case GemRBACPackage.OBJECT__PERMISSIONS:
				return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.OBJECT__LOG_OBJECT:
				return ((InternalEList<?>)getLogObject()).basicRemove(otherEnd, msgs);
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
			case GemRBACPackage.OBJECT__ID_OBJECT:
				return getIdObject();
			case GemRBACPackage.OBJECT__PERMISSIONS:
				return getPermissions();
			case GemRBACPackage.OBJECT__LOG_OBJECT:
				return getLogObject();
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
			case GemRBACPackage.OBJECT__ID_OBJECT:
				setIdObject((String)newValue);
				return;
			case GemRBACPackage.OBJECT__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends Permission>)newValue);
				return;
			case GemRBACPackage.OBJECT__LOG_OBJECT:
				getLogObject().clear();
				getLogObject().addAll((Collection<? extends History>)newValue);
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
			case GemRBACPackage.OBJECT__ID_OBJECT:
				setIdObject(ID_OBJECT_EDEFAULT);
				return;
			case GemRBACPackage.OBJECT__PERMISSIONS:
				getPermissions().clear();
				return;
			case GemRBACPackage.OBJECT__LOG_OBJECT:
				getLogObject().clear();
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
			case GemRBACPackage.OBJECT__ID_OBJECT:
				return ID_OBJECT_EDEFAULT == null ? idObject != null : !ID_OBJECT_EDEFAULT.equals(idObject);
			case GemRBACPackage.OBJECT__PERMISSIONS:
				return permissions != null && !permissions.isEmpty();
			case GemRBACPackage.OBJECT__LOG_OBJECT:
				return logObject != null && !logObject.isEmpty();
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
			case GemRBACPackage.OBJECT___ACCESS_HISTORY:
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
		result.append(" (idObject: ");
		result.append(idObject);
		result.append(')');
		return result.toString();
	}

} //ObjectImpl
