/**
 */
package gemRBAC.impl;

import gemRBAC.GemRBACPackage;
import gemRBAC.History;
import gemRBAC.Operation;
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
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.OperationImpl#getIdOperation <em>Id Operation</em>}</li>
 *   <li>{@link gemRBAC.impl.OperationImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link gemRBAC.impl.OperationImpl#getLogOperation <em>Log Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation {
	/**
	 * The default value of the '{@link #getIdOperation() <em>Id Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdOperation() <em>Id Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdOperation()
	 * @generated
	 * @ordered
	 */
	protected String idOperation = ID_OPERATION_EDEFAULT;

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
	 * The cached value of the '{@link #getLogOperation() <em>Log Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<History> logOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdOperation() {
		return idOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdOperation(String newIdOperation) {
		String oldIdOperation = idOperation;
		idOperation = newIdOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.OPERATION__ID_OPERATION, oldIdOperation, idOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getPermissions() {
		if (permissions == null) {
			permissions = new EObjectWithInverseResolvingEList.ManyInverse<Permission>(Permission.class, this, GemRBACPackage.OPERATION__PERMISSIONS, GemRBACPackage.PERMISSION__OPERATIONS);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<History> getLogOperation() {
		if (logOperation == null) {
			logOperation = new EObjectWithInverseResolvingEList<History>(History.class, this, GemRBACPackage.OPERATION__LOG_OPERATION, GemRBACPackage.HISTORY__OP);
		}
		return logOperation;
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
			case GemRBACPackage.OPERATION__PERMISSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPermissions()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.OPERATION__LOG_OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLogOperation()).basicAdd(otherEnd, msgs);
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
			case GemRBACPackage.OPERATION__PERMISSIONS:
				return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.OPERATION__LOG_OPERATION:
				return ((InternalEList<?>)getLogOperation()).basicRemove(otherEnd, msgs);
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
			case GemRBACPackage.OPERATION__ID_OPERATION:
				return getIdOperation();
			case GemRBACPackage.OPERATION__PERMISSIONS:
				return getPermissions();
			case GemRBACPackage.OPERATION__LOG_OPERATION:
				return getLogOperation();
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
			case GemRBACPackage.OPERATION__ID_OPERATION:
				setIdOperation((String)newValue);
				return;
			case GemRBACPackage.OPERATION__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends Permission>)newValue);
				return;
			case GemRBACPackage.OPERATION__LOG_OPERATION:
				getLogOperation().clear();
				getLogOperation().addAll((Collection<? extends History>)newValue);
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
			case GemRBACPackage.OPERATION__ID_OPERATION:
				setIdOperation(ID_OPERATION_EDEFAULT);
				return;
			case GemRBACPackage.OPERATION__PERMISSIONS:
				getPermissions().clear();
				return;
			case GemRBACPackage.OPERATION__LOG_OPERATION:
				getLogOperation().clear();
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
			case GemRBACPackage.OPERATION__ID_OPERATION:
				return ID_OPERATION_EDEFAULT == null ? idOperation != null : !ID_OPERATION_EDEFAULT.equals(idOperation);
			case GemRBACPackage.OPERATION__PERMISSIONS:
				return permissions != null && !permissions.isEmpty();
			case GemRBACPackage.OPERATION__LOG_OPERATION:
				return logOperation != null && !logOperation.isEmpty();
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
			case GemRBACPackage.OPERATION___ACCESS_HISTORY:
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
		result.append(" (idOperation: ");
		result.append(idOperation);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
