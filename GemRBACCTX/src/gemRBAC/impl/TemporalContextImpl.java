/**
 */
package gemRBAC.impl;

import gemRBAC.GemRBACPackage;
import gemRBAC.TemporalContext;
import gemRBAC.TimeExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.TemporalContextImpl#getTimeexpression <em>Timeexpression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemporalContextImpl extends RBACContextImpl implements TemporalContext {
	/**
	 * The cached value of the '{@link #getTimeexpression() <em>Timeexpression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeexpression()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeExpression> timeexpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.TEMPORAL_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeExpression> getTimeexpression() {
		if (timeexpression == null) {
			timeexpression = new EObjectContainmentEList<TimeExpression>(TimeExpression.class, this, GemRBACPackage.TEMPORAL_CONTEXT__TIMEEXPRESSION);
		}
		return timeexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GemRBACPackage.TEMPORAL_CONTEXT__TIMEEXPRESSION:
				return ((InternalEList<?>)getTimeexpression()).basicRemove(otherEnd, msgs);
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
			case GemRBACPackage.TEMPORAL_CONTEXT__TIMEEXPRESSION:
				return getTimeexpression();
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
			case GemRBACPackage.TEMPORAL_CONTEXT__TIMEEXPRESSION:
				getTimeexpression().clear();
				getTimeexpression().addAll((Collection<? extends TimeExpression>)newValue);
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
			case GemRBACPackage.TEMPORAL_CONTEXT__TIMEEXPRESSION:
				getTimeexpression().clear();
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
			case GemRBACPackage.TEMPORAL_CONTEXT__TIMEEXPRESSION:
				return timeexpression != null && !timeexpression.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemporalContextImpl
