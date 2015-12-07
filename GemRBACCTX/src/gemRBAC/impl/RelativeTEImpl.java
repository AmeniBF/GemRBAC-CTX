/**
 */
package gemRBAC.impl;

import gemRBAC.ActivationDuration;
import gemRBAC.GemRBACPackage;
import gemRBAC.RelativeTE;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative TE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.RelativeTEImpl#getIdRelativeTE <em>Id Relative TE</em>}</li>
 *   <li>{@link gemRBAC.impl.RelativeTEImpl#getD2 <em>D2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RelativeTEImpl extends MinimalEObjectImpl.Container implements RelativeTE {
	/**
	 * The default value of the '{@link #getIdRelativeTE() <em>Id Relative TE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRelativeTE()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_RELATIVE_TE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdRelativeTE() <em>Id Relative TE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRelativeTE()
	 * @generated
	 * @ordered
	 */
	protected String idRelativeTE = ID_RELATIVE_TE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getD2() <em>D2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD2()
	 * @generated
	 * @ordered
	 */
	protected ActivationDuration d2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeTEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.RELATIVE_TE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdRelativeTE() {
		return idRelativeTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdRelativeTE(String newIdRelativeTE) {
		String oldIdRelativeTE = idRelativeTE;
		idRelativeTE = newIdRelativeTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RELATIVE_TE__ID_RELATIVE_TE, oldIdRelativeTE, idRelativeTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationDuration getD2() {
		if (d2 != null && d2.eIsProxy()) {
			InternalEObject oldD2 = (InternalEObject)d2;
			d2 = (ActivationDuration)eResolveProxy(oldD2);
			if (d2 != oldD2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.RELATIVE_TE__D2, oldD2, d2));
			}
		}
		return d2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationDuration basicGetD2() {
		return d2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetD2(ActivationDuration newD2, NotificationChain msgs) {
		ActivationDuration oldD2 = d2;
		d2 = newD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.RELATIVE_TE__D2, oldD2, newD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD2(ActivationDuration newD2) {
		if (newD2 != d2) {
			NotificationChain msgs = null;
			if (d2 != null)
				msgs = ((InternalEObject)d2).eInverseRemove(this, GemRBACPackage.ACTIVATION_DURATION__REXP, ActivationDuration.class, msgs);
			if (newD2 != null)
				msgs = ((InternalEObject)newD2).eInverseAdd(this, GemRBACPackage.ACTIVATION_DURATION__REXP, ActivationDuration.class, msgs);
			msgs = basicSetD2(newD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RELATIVE_TE__D2, newD2, newD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GemRBACPackage.RELATIVE_TE__D2:
				if (d2 != null)
					msgs = ((InternalEObject)d2).eInverseRemove(this, GemRBACPackage.ACTIVATION_DURATION__REXP, ActivationDuration.class, msgs);
				return basicSetD2((ActivationDuration)otherEnd, msgs);
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
			case GemRBACPackage.RELATIVE_TE__D2:
				return basicSetD2(null, msgs);
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
			case GemRBACPackage.RELATIVE_TE__ID_RELATIVE_TE:
				return getIdRelativeTE();
			case GemRBACPackage.RELATIVE_TE__D2:
				if (resolve) return getD2();
				return basicGetD2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GemRBACPackage.RELATIVE_TE__ID_RELATIVE_TE:
				setIdRelativeTE((String)newValue);
				return;
			case GemRBACPackage.RELATIVE_TE__D2:
				setD2((ActivationDuration)newValue);
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
			case GemRBACPackage.RELATIVE_TE__ID_RELATIVE_TE:
				setIdRelativeTE(ID_RELATIVE_TE_EDEFAULT);
				return;
			case GemRBACPackage.RELATIVE_TE__D2:
				setD2((ActivationDuration)null);
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
			case GemRBACPackage.RELATIVE_TE__ID_RELATIVE_TE:
				return ID_RELATIVE_TE_EDEFAULT == null ? idRelativeTE != null : !ID_RELATIVE_TE_EDEFAULT.equals(idRelativeTE);
			case GemRBACPackage.RELATIVE_TE__D2:
				return d2 != null;
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
		result.append(" (idRelativeTE: ");
		result.append(idRelativeTE);
		result.append(')');
		return result.toString();
	}

} //RelativeTEImpl
