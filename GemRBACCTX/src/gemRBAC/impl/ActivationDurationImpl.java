/**
 */
package gemRBAC.impl;

import gemRBAC.AbsoluteTE;
import gemRBAC.ActivationDuration;
import gemRBAC.GemRBACPackage;
import gemRBAC.RelativeTE;
import gemRBAC.TimeUnitType;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activation Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.ActivationDurationImpl#getIdDuration <em>Id Duration</em>}</li>
 *   <li>{@link gemRBAC.impl.ActivationDurationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link gemRBAC.impl.ActivationDurationImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link gemRBAC.impl.ActivationDurationImpl#isIsContinous <em>Is Continous</em>}</li>
 *   <li>{@link gemRBAC.impl.ActivationDurationImpl#getAexp <em>Aexp</em>}</li>
 *   <li>{@link gemRBAC.impl.ActivationDurationImpl#getRexp <em>Rexp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivationDurationImpl extends MinimalEObjectImpl.Container implements ActivationDuration {
	/**
	 * The default value of the '{@link #getIdDuration() <em>Id Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdDuration() <em>Id Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdDuration()
	 * @generated
	 * @ordered
	 */
	protected String idDuration = ID_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnitType TIME_UNIT_EDEFAULT = TimeUnitType.SECOND;

	/**
	 * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnitType timeUnit = TIME_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsContinous() <em>Is Continous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContinous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTINOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsContinous() <em>Is Continous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsContinous()
	 * @generated
	 * @ordered
	 */
	protected boolean isContinous = IS_CONTINOUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAexp() <em>Aexp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAexp()
	 * @generated
	 * @ordered
	 */
	protected AbsoluteTE aexp;

	/**
	 * The cached value of the '{@link #getRexp() <em>Rexp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRexp()
	 * @generated
	 * @ordered
	 */
	protected RelativeTE rexp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivationDurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.ACTIVATION_DURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdDuration() {
		return idDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdDuration(String newIdDuration) {
		String oldIdDuration = idDuration;
		idDuration = newIdDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.ACTIVATION_DURATION__ID_DURATION, oldIdDuration, idDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(BigInteger newValue) {
		BigInteger oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.ACTIVATION_DURATION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnitType getTimeUnit() {
		return timeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeUnit(TimeUnitType newTimeUnit) {
		TimeUnitType oldTimeUnit = timeUnit;
		timeUnit = newTimeUnit == null ? TIME_UNIT_EDEFAULT : newTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.ACTIVATION_DURATION__TIME_UNIT, oldTimeUnit, timeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsContinous() {
		return isContinous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsContinous(boolean newIsContinous) {
		boolean oldIsContinous = isContinous;
		isContinous = newIsContinous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.ACTIVATION_DURATION__IS_CONTINOUS, oldIsContinous, isContinous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteTE getAexp() {
		if (aexp != null && aexp.eIsProxy()) {
			InternalEObject oldAexp = (InternalEObject)aexp;
			aexp = (AbsoluteTE)eResolveProxy(oldAexp);
			if (aexp != oldAexp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.ACTIVATION_DURATION__AEXP, oldAexp, aexp));
			}
		}
		return aexp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteTE basicGetAexp() {
		return aexp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAexp(AbsoluteTE newAexp, NotificationChain msgs) {
		AbsoluteTE oldAexp = aexp;
		aexp = newAexp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.ACTIVATION_DURATION__AEXP, oldAexp, newAexp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAexp(AbsoluteTE newAexp) {
		if (newAexp != aexp) {
			NotificationChain msgs = null;
			if (aexp != null)
				msgs = ((InternalEObject)aexp).eInverseRemove(this, GemRBACPackage.ABSOLUTE_TE__DURATION, AbsoluteTE.class, msgs);
			if (newAexp != null)
				msgs = ((InternalEObject)newAexp).eInverseAdd(this, GemRBACPackage.ABSOLUTE_TE__DURATION, AbsoluteTE.class, msgs);
			msgs = basicSetAexp(newAexp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.ACTIVATION_DURATION__AEXP, newAexp, newAexp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeTE getRexp() {
		if (rexp != null && rexp.eIsProxy()) {
			InternalEObject oldRexp = (InternalEObject)rexp;
			rexp = (RelativeTE)eResolveProxy(oldRexp);
			if (rexp != oldRexp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.ACTIVATION_DURATION__REXP, oldRexp, rexp));
			}
		}
		return rexp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeTE basicGetRexp() {
		return rexp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRexp(RelativeTE newRexp, NotificationChain msgs) {
		RelativeTE oldRexp = rexp;
		rexp = newRexp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.ACTIVATION_DURATION__REXP, oldRexp, newRexp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRexp(RelativeTE newRexp) {
		if (newRexp != rexp) {
			NotificationChain msgs = null;
			if (rexp != null)
				msgs = ((InternalEObject)rexp).eInverseRemove(this, GemRBACPackage.RELATIVE_TE__D2, RelativeTE.class, msgs);
			if (newRexp != null)
				msgs = ((InternalEObject)newRexp).eInverseAdd(this, GemRBACPackage.RELATIVE_TE__D2, RelativeTE.class, msgs);
			msgs = basicSetRexp(newRexp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.ACTIVATION_DURATION__REXP, newRexp, newRexp));
	}

	/**
	 * The cached invocation delegate for the '{@link #greaterThan(gemRBAC.ActivationDuration) <em>Greater Than</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #greaterThan(gemRBAC.ActivationDuration)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GREATER_THAN_ACTIVATION_DURATION__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.ACTIVATION_DURATION___GREATER_THAN__ACTIVATIONDURATION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean greaterThan(ActivationDuration d) {
		try {
			return (Boolean)GREATER_THAN_ACTIVATION_DURATION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{d}));
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
			case GemRBACPackage.ACTIVATION_DURATION__AEXP:
				if (aexp != null)
					msgs = ((InternalEObject)aexp).eInverseRemove(this, GemRBACPackage.ABSOLUTE_TE__DURATION, AbsoluteTE.class, msgs);
				return basicSetAexp((AbsoluteTE)otherEnd, msgs);
			case GemRBACPackage.ACTIVATION_DURATION__REXP:
				if (rexp != null)
					msgs = ((InternalEObject)rexp).eInverseRemove(this, GemRBACPackage.RELATIVE_TE__D2, RelativeTE.class, msgs);
				return basicSetRexp((RelativeTE)otherEnd, msgs);
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
			case GemRBACPackage.ACTIVATION_DURATION__AEXP:
				return basicSetAexp(null, msgs);
			case GemRBACPackage.ACTIVATION_DURATION__REXP:
				return basicSetRexp(null, msgs);
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
			case GemRBACPackage.ACTIVATION_DURATION__ID_DURATION:
				return getIdDuration();
			case GemRBACPackage.ACTIVATION_DURATION__VALUE:
				return getValue();
			case GemRBACPackage.ACTIVATION_DURATION__TIME_UNIT:
				return getTimeUnit();
			case GemRBACPackage.ACTIVATION_DURATION__IS_CONTINOUS:
				return isIsContinous();
			case GemRBACPackage.ACTIVATION_DURATION__AEXP:
				if (resolve) return getAexp();
				return basicGetAexp();
			case GemRBACPackage.ACTIVATION_DURATION__REXP:
				if (resolve) return getRexp();
				return basicGetRexp();
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
			case GemRBACPackage.ACTIVATION_DURATION__ID_DURATION:
				setIdDuration((String)newValue);
				return;
			case GemRBACPackage.ACTIVATION_DURATION__VALUE:
				setValue((BigInteger)newValue);
				return;
			case GemRBACPackage.ACTIVATION_DURATION__TIME_UNIT:
				setTimeUnit((TimeUnitType)newValue);
				return;
			case GemRBACPackage.ACTIVATION_DURATION__IS_CONTINOUS:
				setIsContinous((Boolean)newValue);
				return;
			case GemRBACPackage.ACTIVATION_DURATION__AEXP:
				setAexp((AbsoluteTE)newValue);
				return;
			case GemRBACPackage.ACTIVATION_DURATION__REXP:
				setRexp((RelativeTE)newValue);
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
			case GemRBACPackage.ACTIVATION_DURATION__ID_DURATION:
				setIdDuration(ID_DURATION_EDEFAULT);
				return;
			case GemRBACPackage.ACTIVATION_DURATION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case GemRBACPackage.ACTIVATION_DURATION__TIME_UNIT:
				setTimeUnit(TIME_UNIT_EDEFAULT);
				return;
			case GemRBACPackage.ACTIVATION_DURATION__IS_CONTINOUS:
				setIsContinous(IS_CONTINOUS_EDEFAULT);
				return;
			case GemRBACPackage.ACTIVATION_DURATION__AEXP:
				setAexp((AbsoluteTE)null);
				return;
			case GemRBACPackage.ACTIVATION_DURATION__REXP:
				setRexp((RelativeTE)null);
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
			case GemRBACPackage.ACTIVATION_DURATION__ID_DURATION:
				return ID_DURATION_EDEFAULT == null ? idDuration != null : !ID_DURATION_EDEFAULT.equals(idDuration);
			case GemRBACPackage.ACTIVATION_DURATION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case GemRBACPackage.ACTIVATION_DURATION__TIME_UNIT:
				return timeUnit != TIME_UNIT_EDEFAULT;
			case GemRBACPackage.ACTIVATION_DURATION__IS_CONTINOUS:
				return isContinous != IS_CONTINOUS_EDEFAULT;
			case GemRBACPackage.ACTIVATION_DURATION__AEXP:
				return aexp != null;
			case GemRBACPackage.ACTIVATION_DURATION__REXP:
				return rexp != null;
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
			case GemRBACPackage.ACTIVATION_DURATION___GREATER_THAN__ACTIVATIONDURATION:
				return greaterThan((ActivationDuration)arguments.get(0));
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
		result.append(" (idDuration: ");
		result.append(idDuration);
		result.append(", value: ");
		result.append(value);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(", isContinous: ");
		result.append(isContinous);
		result.append(')');
		return result.toString();
	}

} //ActivationDurationImpl
