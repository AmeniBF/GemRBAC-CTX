/**
 */
package gemRBAC.impl;

import gemRBAC.GemRBACPackage;
import gemRBAC.RelativeDirection;
import gemRBAC.RelativeLocation;

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
 * An implementation of the model object '<em><b>Relative Direction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.RelativeDirectionImpl#getRelativelocation <em>Relativelocation</em>}</li>
 *   <li>{@link gemRBAC.impl.RelativeDirectionImpl#getIdDirection <em>Id Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RelativeDirectionImpl extends MinimalEObjectImpl.Container implements RelativeDirection {
	/**
	 * The cached value of the '{@link #getRelativelocation() <em>Relativelocation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativelocation()
	 * @generated
	 * @ordered
	 */
	protected EList<RelativeLocation> relativelocation;

	/**
	 * The default value of the '{@link #getIdDirection() <em>Id Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdDirection() <em>Id Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdDirection()
	 * @generated
	 * @ordered
	 */
	protected String idDirection = ID_DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeDirectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.RELATIVE_DIRECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelativeLocation> getRelativelocation() {
		if (relativelocation == null) {
			relativelocation = new EObjectWithInverseResolvingEList<RelativeLocation>(RelativeLocation.class, this, GemRBACPackage.RELATIVE_DIRECTION__RELATIVELOCATION, GemRBACPackage.RELATIVE_LOCATION__RELATIVEDIRECTION);
		}
		return relativelocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdDirection() {
		return idDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdDirection(String newIdDirection) {
		String oldIdDirection = idDirection;
		idDirection = newIdDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RELATIVE_DIRECTION__ID_DIRECTION, oldIdDirection, idDirection));
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
			case GemRBACPackage.RELATIVE_DIRECTION__RELATIVELOCATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelativelocation()).basicAdd(otherEnd, msgs);
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
			case GemRBACPackage.RELATIVE_DIRECTION__RELATIVELOCATION:
				return ((InternalEList<?>)getRelativelocation()).basicRemove(otherEnd, msgs);
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
			case GemRBACPackage.RELATIVE_DIRECTION__RELATIVELOCATION:
				return getRelativelocation();
			case GemRBACPackage.RELATIVE_DIRECTION__ID_DIRECTION:
				return getIdDirection();
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
			case GemRBACPackage.RELATIVE_DIRECTION__RELATIVELOCATION:
				getRelativelocation().clear();
				getRelativelocation().addAll((Collection<? extends RelativeLocation>)newValue);
				return;
			case GemRBACPackage.RELATIVE_DIRECTION__ID_DIRECTION:
				setIdDirection((String)newValue);
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
			case GemRBACPackage.RELATIVE_DIRECTION__RELATIVELOCATION:
				getRelativelocation().clear();
				return;
			case GemRBACPackage.RELATIVE_DIRECTION__ID_DIRECTION:
				setIdDirection(ID_DIRECTION_EDEFAULT);
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
			case GemRBACPackage.RELATIVE_DIRECTION__RELATIVELOCATION:
				return relativelocation != null && !relativelocation.isEmpty();
			case GemRBACPackage.RELATIVE_DIRECTION__ID_DIRECTION:
				return ID_DIRECTION_EDEFAULT == null ? idDirection != null : !ID_DIRECTION_EDEFAULT.equals(idDirection);
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
		result.append(" (idDirection: ");
		result.append(idDirection);
		result.append(')');
		return result.toString();
	}

} //RelativeDirectionImpl
