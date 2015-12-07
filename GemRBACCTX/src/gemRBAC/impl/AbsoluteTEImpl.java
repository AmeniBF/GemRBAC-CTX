/**
 */
package gemRBAC.impl;

import gemRBAC.AbsoluteTE;
import gemRBAC.ActivationDuration;
import gemRBAC.GemRBACPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Absolute TE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.AbsoluteTEImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link gemRBAC.impl.AbsoluteTEImpl#getIdAbsoluteTE <em>Id Absolute TE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbsoluteTEImpl extends MinimalEObjectImpl.Container implements AbsoluteTE {
	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected ActivationDuration duration;

	/**
	 * The default value of the '{@link #getIdAbsoluteTE() <em>Id Absolute TE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAbsoluteTE()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_ABSOLUTE_TE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdAbsoluteTE() <em>Id Absolute TE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdAbsoluteTE()
	 * @generated
	 * @ordered
	 */
	protected String idAbsoluteTE = ID_ABSOLUTE_TE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbsoluteTEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.ABSOLUTE_TE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationDuration getDuration() {
		if (duration != null && duration.eIsProxy()) {
			InternalEObject oldDuration = (InternalEObject)duration;
			duration = (ActivationDuration)eResolveProxy(oldDuration);
			if (duration != oldDuration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.ABSOLUTE_TE__DURATION, oldDuration, duration));
			}
		}
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationDuration basicGetDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(ActivationDuration newDuration, NotificationChain msgs) {
		ActivationDuration oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.ABSOLUTE_TE__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(ActivationDuration newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, GemRBACPackage.ACTIVATION_DURATION__AEXP, ActivationDuration.class, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, GemRBACPackage.ACTIVATION_DURATION__AEXP, ActivationDuration.class, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.ABSOLUTE_TE__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdAbsoluteTE() {
		return idAbsoluteTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdAbsoluteTE(String newIdAbsoluteTE) {
		String oldIdAbsoluteTE = idAbsoluteTE;
		idAbsoluteTE = newIdAbsoluteTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.ABSOLUTE_TE__ID_ABSOLUTE_TE, oldIdAbsoluteTE, idAbsoluteTE));
	}

	/**
	 * The cached invocation delegate for the '{@link #hasDuration() <em>Has Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasDuration()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate HAS_DURATION__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.ABSOLUTE_TE___HAS_DURATION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasDuration() {
		try {
			return (Boolean)HAS_DURATION__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GemRBACPackage.ABSOLUTE_TE__DURATION:
				if (duration != null)
					msgs = ((InternalEObject)duration).eInverseRemove(this, GemRBACPackage.ACTIVATION_DURATION__AEXP, ActivationDuration.class, msgs);
				return basicSetDuration((ActivationDuration)otherEnd, msgs);
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
			case GemRBACPackage.ABSOLUTE_TE__DURATION:
				return basicSetDuration(null, msgs);
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
			case GemRBACPackage.ABSOLUTE_TE__DURATION:
				if (resolve) return getDuration();
				return basicGetDuration();
			case GemRBACPackage.ABSOLUTE_TE__ID_ABSOLUTE_TE:
				return getIdAbsoluteTE();
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
			case GemRBACPackage.ABSOLUTE_TE__DURATION:
				setDuration((ActivationDuration)newValue);
				return;
			case GemRBACPackage.ABSOLUTE_TE__ID_ABSOLUTE_TE:
				setIdAbsoluteTE((String)newValue);
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
			case GemRBACPackage.ABSOLUTE_TE__DURATION:
				setDuration((ActivationDuration)null);
				return;
			case GemRBACPackage.ABSOLUTE_TE__ID_ABSOLUTE_TE:
				setIdAbsoluteTE(ID_ABSOLUTE_TE_EDEFAULT);
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
			case GemRBACPackage.ABSOLUTE_TE__DURATION:
				return duration != null;
			case GemRBACPackage.ABSOLUTE_TE__ID_ABSOLUTE_TE:
				return ID_ABSOLUTE_TE_EDEFAULT == null ? idAbsoluteTE != null : !ID_ABSOLUTE_TE_EDEFAULT.equals(idAbsoluteTE);
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
			case GemRBACPackage.ABSOLUTE_TE___HAS_DURATION:
				return hasDuration();
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
		result.append(" (idAbsoluteTE: ");
		result.append(idAbsoluteTE);
		result.append(')');
		return result.toString();
	}

} //AbsoluteTEImpl
