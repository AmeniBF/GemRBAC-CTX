/**
 */
package gemRBAC.impl;

import gemRBAC.GemRBACPackage;
import gemRBAC.PeriodicTime;
import gemRBAC.TimePoint;
import gemRBAC.TimeUnitType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.PeriodicTimeImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link gemRBAC.impl.PeriodicTimeImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link gemRBAC.impl.PeriodicTimeImpl#getIdPeriodicTime <em>Id Periodic Time</em>}</li>
 *   <li>{@link gemRBAC.impl.PeriodicTimeImpl#getNextStart <em>Next Start</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PeriodicTimeImpl extends RelativeTEImpl implements PeriodicTime {
	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int FREQUENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected int frequency = FREQUENCY_EDEFAULT;

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
	 * The default value of the '{@link #getIdPeriodicTime() <em>Id Periodic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPeriodicTime()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_PERIODIC_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdPeriodicTime() <em>Id Periodic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdPeriodicTime()
	 * @generated
	 * @ordered
	 */
	protected String idPeriodicTime = ID_PERIODIC_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNextStart() <em>Next Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStart()
	 * @generated
	 * @ordered
	 */
	protected TimePoint nextStart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.PERIODIC_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(int newFrequency) {
		int oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.PERIODIC_TIME__FREQUENCY, oldFrequency, frequency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.PERIODIC_TIME__TIME_UNIT, oldTimeUnit, timeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdPeriodicTime() {
		return idPeriodicTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdPeriodicTime(String newIdPeriodicTime) {
		String oldIdPeriodicTime = idPeriodicTime;
		idPeriodicTime = newIdPeriodicTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.PERIODIC_TIME__ID_PERIODIC_TIME, oldIdPeriodicTime, idPeriodicTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePoint getNextStart() {
		return nextStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextStart(TimePoint newNextStart, NotificationChain msgs) {
		TimePoint oldNextStart = nextStart;
		nextStart = newNextStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.PERIODIC_TIME__NEXT_START, oldNextStart, newNextStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStart(TimePoint newNextStart) {
		if (newNextStart != nextStart) {
			NotificationChain msgs = null;
			if (nextStart != null)
				msgs = ((InternalEObject)nextStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GemRBACPackage.PERIODIC_TIME__NEXT_START, null, msgs);
			if (newNextStart != null)
				msgs = ((InternalEObject)newNextStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GemRBACPackage.PERIODIC_TIME__NEXT_START, null, msgs);
			msgs = basicSetNextStart(newNextStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.PERIODIC_TIME__NEXT_START, newNextStart, newNextStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GemRBACPackage.PERIODIC_TIME__NEXT_START:
				return basicSetNextStart(null, msgs);
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
			case GemRBACPackage.PERIODIC_TIME__FREQUENCY:
				return getFrequency();
			case GemRBACPackage.PERIODIC_TIME__TIME_UNIT:
				return getTimeUnit();
			case GemRBACPackage.PERIODIC_TIME__ID_PERIODIC_TIME:
				return getIdPeriodicTime();
			case GemRBACPackage.PERIODIC_TIME__NEXT_START:
				return getNextStart();
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
			case GemRBACPackage.PERIODIC_TIME__FREQUENCY:
				setFrequency((Integer)newValue);
				return;
			case GemRBACPackage.PERIODIC_TIME__TIME_UNIT:
				setTimeUnit((TimeUnitType)newValue);
				return;
			case GemRBACPackage.PERIODIC_TIME__ID_PERIODIC_TIME:
				setIdPeriodicTime((String)newValue);
				return;
			case GemRBACPackage.PERIODIC_TIME__NEXT_START:
				setNextStart((TimePoint)newValue);
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
			case GemRBACPackage.PERIODIC_TIME__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case GemRBACPackage.PERIODIC_TIME__TIME_UNIT:
				setTimeUnit(TIME_UNIT_EDEFAULT);
				return;
			case GemRBACPackage.PERIODIC_TIME__ID_PERIODIC_TIME:
				setIdPeriodicTime(ID_PERIODIC_TIME_EDEFAULT);
				return;
			case GemRBACPackage.PERIODIC_TIME__NEXT_START:
				setNextStart((TimePoint)null);
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
			case GemRBACPackage.PERIODIC_TIME__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case GemRBACPackage.PERIODIC_TIME__TIME_UNIT:
				return timeUnit != TIME_UNIT_EDEFAULT;
			case GemRBACPackage.PERIODIC_TIME__ID_PERIODIC_TIME:
				return ID_PERIODIC_TIME_EDEFAULT == null ? idPeriodicTime != null : !ID_PERIODIC_TIME_EDEFAULT.equals(idPeriodicTime);
			case GemRBACPackage.PERIODIC_TIME__NEXT_START:
				return nextStart != null;
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
		result.append(" (frequency: ");
		result.append(frequency);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(", idPeriodicTime: ");
		result.append(idPeriodicTime);
		result.append(')');
		return result.toString();
	}

} //PeriodicTimeImpl
