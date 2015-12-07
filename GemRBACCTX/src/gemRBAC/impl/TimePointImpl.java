/**
 */
package gemRBAC.impl;

import gemRBAC.GemRBACPackage;
import gemRBAC.TimeInterval;
import gemRBAC.TimePoint;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.TimePointImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link gemRBAC.impl.TimePointImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link gemRBAC.impl.TimePointImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link gemRBAC.impl.TimePointImpl#getDay <em>Day</em>}</li>
 *   <li>{@link gemRBAC.impl.TimePointImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link gemRBAC.impl.TimePointImpl#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimePointImpl extends AbsoluteTEImpl implements TimePoint {
	/**
	 * The default value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected static final int SECOND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected int second = SECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected int minute = MINUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected static final int HOUR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected int hour = HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final int DAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected int day = DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final int MONTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected int month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimePointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.TIME_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond(int newSecond) {
		int oldSecond = second;
		second = newSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.TIME_POINT__SECOND, oldSecond, second));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinute(int newMinute) {
		int oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.TIME_POINT__MINUTE, oldMinute, minute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHour(int newHour) {
		int oldHour = hour;
		hour = newHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.TIME_POINT__HOUR, oldHour, hour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(int newDay) {
		int oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.TIME_POINT__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(int newMonth) {
		int oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.TIME_POINT__MONTH, oldMonth, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.TIME_POINT__YEAR, oldYear, year));
	}

	/**
	 * The cached invocation delegate for the '{@link #equalTo(gemRBAC.TimePoint) <em>Equal To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #equalTo(gemRBAC.TimePoint)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EQUAL_TO_TIME_POINT__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.TIME_POINT___EQUAL_TO__TIMEPOINT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equalTo(TimePoint t) {
		try {
			return (Boolean)EQUAL_TO_TIME_POINT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{t}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isBefore(gemRBAC.TimePoint) <em>Is Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBefore(gemRBAC.TimePoint)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_BEFORE_TIME_POINT__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.TIME_POINT___IS_BEFORE__TIMEPOINT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBefore(TimePoint t) {
		try {
			return (Boolean)IS_BEFORE_TIME_POINT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{t}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isAfter(gemRBAC.TimePoint) <em>Is After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAfter(gemRBAC.TimePoint)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_AFTER_TIME_POINT__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.TIME_POINT___IS_AFTER__TIMEPOINT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAfter(TimePoint t) {
		try {
			return (Boolean)IS_AFTER_TIME_POINT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{t}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isContained(gemRBAC.TimeInterval) <em>Is Contained</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContained(gemRBAC.TimeInterval)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_CONTAINED_TIME_INTERVAL__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.TIME_POINT___IS_CONTAINED__TIMEINTERVAL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContained(TimeInterval t) {
		try {
			return (Boolean)IS_CONTAINED_TIME_INTERVAL__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{t}));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GemRBACPackage.TIME_POINT__SECOND:
				return getSecond();
			case GemRBACPackage.TIME_POINT__MINUTE:
				return getMinute();
			case GemRBACPackage.TIME_POINT__HOUR:
				return getHour();
			case GemRBACPackage.TIME_POINT__DAY:
				return getDay();
			case GemRBACPackage.TIME_POINT__MONTH:
				return getMonth();
			case GemRBACPackage.TIME_POINT__YEAR:
				return getYear();
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
			case GemRBACPackage.TIME_POINT__SECOND:
				setSecond((Integer)newValue);
				return;
			case GemRBACPackage.TIME_POINT__MINUTE:
				setMinute((Integer)newValue);
				return;
			case GemRBACPackage.TIME_POINT__HOUR:
				setHour((Integer)newValue);
				return;
			case GemRBACPackage.TIME_POINT__DAY:
				setDay((Integer)newValue);
				return;
			case GemRBACPackage.TIME_POINT__MONTH:
				setMonth((Integer)newValue);
				return;
			case GemRBACPackage.TIME_POINT__YEAR:
				setYear((Integer)newValue);
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
			case GemRBACPackage.TIME_POINT__SECOND:
				setSecond(SECOND_EDEFAULT);
				return;
			case GemRBACPackage.TIME_POINT__MINUTE:
				setMinute(MINUTE_EDEFAULT);
				return;
			case GemRBACPackage.TIME_POINT__HOUR:
				setHour(HOUR_EDEFAULT);
				return;
			case GemRBACPackage.TIME_POINT__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case GemRBACPackage.TIME_POINT__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case GemRBACPackage.TIME_POINT__YEAR:
				setYear(YEAR_EDEFAULT);
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
			case GemRBACPackage.TIME_POINT__SECOND:
				return second != SECOND_EDEFAULT;
			case GemRBACPackage.TIME_POINT__MINUTE:
				return minute != MINUTE_EDEFAULT;
			case GemRBACPackage.TIME_POINT__HOUR:
				return hour != HOUR_EDEFAULT;
			case GemRBACPackage.TIME_POINT__DAY:
				return day != DAY_EDEFAULT;
			case GemRBACPackage.TIME_POINT__MONTH:
				return month != MONTH_EDEFAULT;
			case GemRBACPackage.TIME_POINT__YEAR:
				return year != YEAR_EDEFAULT;
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
			case GemRBACPackage.TIME_POINT___EQUAL_TO__TIMEPOINT:
				return equalTo((TimePoint)arguments.get(0));
			case GemRBACPackage.TIME_POINT___IS_BEFORE__TIMEPOINT:
				return isBefore((TimePoint)arguments.get(0));
			case GemRBACPackage.TIME_POINT___IS_AFTER__TIMEPOINT:
				return isAfter((TimePoint)arguments.get(0));
			case GemRBACPackage.TIME_POINT___IS_CONTAINED__TIMEINTERVAL:
				return isContained((TimeInterval)arguments.get(0));
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
		result.append(" (second: ");
		result.append(second);
		result.append(", minute: ");
		result.append(minute);
		result.append(", hour: ");
		result.append(hour);
		result.append(", day: ");
		result.append(day);
		result.append(", month: ");
		result.append(month);
		result.append(", year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //TimePointImpl
