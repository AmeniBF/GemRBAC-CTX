/**
 */
package gemRBAC.impl;

import gemRBAC.ComposedRelativeTE;
import gemRBAC.GemRBACPackage;
import gemRBAC.RBACUtility;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composed Relative TE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.ComposedRelativeTEImpl#getOverlay <em>Overlay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComposedRelativeTEImpl extends RelativeTEImpl implements ComposedRelativeTE {
	/**
	 * The cached value of the '{@link #getOverlay() <em>Overlay</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlay()
	 * @generated
	 * @ordered
	 */
	protected EList<ComposedRelativeTE> overlay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedRelativeTEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.COMPOSED_RELATIVE_TE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComposedRelativeTE> getOverlay() {
		if (overlay == null) {
			overlay = new EObjectResolvingEList<ComposedRelativeTE>(ComposedRelativeTE.class, this, GemRBACPackage.COMPOSED_RELATIVE_TE__OVERLAY);
		}
		return overlay;
	}

	/**
	 * The cached invocation delegate for the '{@link #checkHours(gemRBAC.RBACUtility) <em>Check Hours</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #checkHours(gemRBAC.RBACUtility)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CHECK_HOURS_RBAC_UTILITY__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.COMPOSED_RELATIVE_TE___CHECK_HOURS__RBACUTILITY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkHours(RBACUtility u) {
		try {
			return (Boolean)CHECK_HOURS_RBAC_UTILITY__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{u}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #checkDays(gemRBAC.RBACUtility) <em>Check Days</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #checkDays(gemRBAC.RBACUtility)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CHECK_DAYS_RBAC_UTILITY__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.COMPOSED_RELATIVE_TE___CHECK_DAYS__RBACUTILITY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDays(RBACUtility u) {
		try {
			return (Boolean)CHECK_DAYS_RBAC_UTILITY__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{u}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #checkDaysRank(gemRBAC.RBACUtility) <em>Check Days Rank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #checkDaysRank(gemRBAC.RBACUtility)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CHECK_DAYS_RANK_RBAC_UTILITY__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.COMPOSED_RELATIVE_TE___CHECK_DAYS_RANK__RBACUTILITY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDaysRank(RBACUtility u) {
		try {
			return (Boolean)CHECK_DAYS_RANK_RBAC_UTILITY__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{u}));
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
			case GemRBACPackage.COMPOSED_RELATIVE_TE__OVERLAY:
				return getOverlay();
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
			case GemRBACPackage.COMPOSED_RELATIVE_TE__OVERLAY:
				getOverlay().clear();
				getOverlay().addAll((Collection<? extends ComposedRelativeTE>)newValue);
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
			case GemRBACPackage.COMPOSED_RELATIVE_TE__OVERLAY:
				getOverlay().clear();
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
			case GemRBACPackage.COMPOSED_RELATIVE_TE__OVERLAY:
				return overlay != null && !overlay.isEmpty();
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
			case GemRBACPackage.COMPOSED_RELATIVE_TE___CHECK_HOURS__RBACUTILITY:
				return checkHours((RBACUtility)arguments.get(0));
			case GemRBACPackage.COMPOSED_RELATIVE_TE___CHECK_DAYS__RBACUTILITY:
				return checkDays((RBACUtility)arguments.get(0));
			case GemRBACPackage.COMPOSED_RELATIVE_TE___CHECK_DAYS_RANK__RBACUTILITY:
				return checkDaysRank((RBACUtility)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ComposedRelativeTEImpl
