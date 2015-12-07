/**
 */
package gemRBAC.impl;

import gemRBAC.GemRBACPackage;
import gemRBAC.RelativeTimeInterval;
import gemRBAC.RelativeTimePoint;

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
 * An implementation of the model object '<em><b>Relative Time Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.RelativeTimePointImpl#getRank <em>Rank</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RelativeTimePointImpl extends ComposedRelativeTEImpl implements RelativeTimePoint {
	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final int RANK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected int rank = RANK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeTimePointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.RELATIVE_TIME_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(int newRank) {
		int oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RELATIVE_TIME_POINT__RANK, oldRank, rank));
	}

	/**
	 * The cached invocation delegate for the '{@link #isContained(gemRBAC.RelativeTimeInterval) <em>Is Contained</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContained(gemRBAC.RelativeTimeInterval)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_CONTAINED_RELATIVE_TIME_INTERVAL__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.RELATIVE_TIME_POINT___IS_CONTAINED__RELATIVETIMEINTERVAL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContained(RelativeTimeInterval t) {
		try {
			return (Boolean)IS_CONTAINED_RELATIVE_TIME_INTERVAL__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{t}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #equalTo(gemRBAC.RelativeTimePoint) <em>Equal To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #equalTo(gemRBAC.RelativeTimePoint)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EQUAL_TO_RELATIVE_TIME_POINT__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.RELATIVE_TIME_POINT___EQUAL_TO__RELATIVETIMEPOINT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equalTo(RelativeTimePoint t) {
		try {
			return (Boolean)EQUAL_TO_RELATIVE_TIME_POINT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{t}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isAfter(gemRBAC.RelativeTimePoint) <em>Is After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAfter(gemRBAC.RelativeTimePoint)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_AFTER_RELATIVE_TIME_POINT__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.RELATIVE_TIME_POINT___IS_AFTER__RELATIVETIMEPOINT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAfter(RelativeTimePoint t) {
		try {
			return (Boolean)IS_AFTER_RELATIVE_TIME_POINT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{t}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isBefore(gemRBAC.RelativeTimePoint) <em>Is Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBefore(gemRBAC.RelativeTimePoint)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_BEFORE_RELATIVE_TIME_POINT__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.RELATIVE_TIME_POINT___IS_BEFORE__RELATIVETIMEPOINT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBefore(RelativeTimePoint t) {
		try {
			return (Boolean)IS_BEFORE_RELATIVE_TIME_POINT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{t}));
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
			case GemRBACPackage.RELATIVE_TIME_POINT__RANK:
				return getRank();
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
			case GemRBACPackage.RELATIVE_TIME_POINT__RANK:
				setRank((Integer)newValue);
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
			case GemRBACPackage.RELATIVE_TIME_POINT__RANK:
				setRank(RANK_EDEFAULT);
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
			case GemRBACPackage.RELATIVE_TIME_POINT__RANK:
				return rank != RANK_EDEFAULT;
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
			case GemRBACPackage.RELATIVE_TIME_POINT___IS_CONTAINED__RELATIVETIMEINTERVAL:
				return isContained((RelativeTimeInterval)arguments.get(0));
			case GemRBACPackage.RELATIVE_TIME_POINT___EQUAL_TO__RELATIVETIMEPOINT:
				return equalTo((RelativeTimePoint)arguments.get(0));
			case GemRBACPackage.RELATIVE_TIME_POINT___IS_AFTER__RELATIVETIMEPOINT:
				return isAfter((RelativeTimePoint)arguments.get(0));
			case GemRBACPackage.RELATIVE_TIME_POINT___IS_BEFORE__RELATIVETIMEPOINT:
				return isBefore((RelativeTimePoint)arguments.get(0));
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
		result.append(" (rank: ");
		result.append(rank);
		result.append(')');
		return result.toString();
	}

} //RelativeTimePointImpl
