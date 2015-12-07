/**
 */
package gemRBAC.impl;

import gemRBAC.AbsoluteTE;
import gemRBAC.GemRBACPackage;
import gemRBAC.RelativeTE;
import gemRBAC.TimeExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.TimeExpressionImpl#getAbsolute <em>Absolute</em>}</li>
 *   <li>{@link gemRBAC.impl.TimeExpressionImpl#getRelative <em>Relative</em>}</li>
 *   <li>{@link gemRBAC.impl.TimeExpressionImpl#getIdTimeExpr <em>Id Time Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeExpressionImpl extends MinimalEObjectImpl.Container implements TimeExpression {
	/**
	 * The cached value of the '{@link #getAbsolute() <em>Absolute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsolute()
	 * @generated
	 * @ordered
	 */
	protected EList<AbsoluteTE> absolute;

	/**
	 * The cached value of the '{@link #getRelative() <em>Relative</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelative()
	 * @generated
	 * @ordered
	 */
	protected EList<RelativeTE> relative;

	/**
	 * The default value of the '{@link #getIdTimeExpr() <em>Id Time Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTimeExpr()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_TIME_EXPR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdTimeExpr() <em>Id Time Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdTimeExpr()
	 * @generated
	 * @ordered
	 */
	protected String idTimeExpr = ID_TIME_EXPR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.TIME_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbsoluteTE> getAbsolute() {
		if (absolute == null) {
			absolute = new EObjectContainmentEList<AbsoluteTE>(AbsoluteTE.class, this, GemRBACPackage.TIME_EXPRESSION__ABSOLUTE);
		}
		return absolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelativeTE> getRelative() {
		if (relative == null) {
			relative = new EObjectContainmentEList<RelativeTE>(RelativeTE.class, this, GemRBACPackage.TIME_EXPRESSION__RELATIVE);
		}
		return relative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdTimeExpr() {
		return idTimeExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdTimeExpr(String newIdTimeExpr) {
		String oldIdTimeExpr = idTimeExpr;
		idTimeExpr = newIdTimeExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.TIME_EXPRESSION__ID_TIME_EXPR, oldIdTimeExpr, idTimeExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GemRBACPackage.TIME_EXPRESSION__ABSOLUTE:
				return ((InternalEList<?>)getAbsolute()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.TIME_EXPRESSION__RELATIVE:
				return ((InternalEList<?>)getRelative()).basicRemove(otherEnd, msgs);
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
			case GemRBACPackage.TIME_EXPRESSION__ABSOLUTE:
				return getAbsolute();
			case GemRBACPackage.TIME_EXPRESSION__RELATIVE:
				return getRelative();
			case GemRBACPackage.TIME_EXPRESSION__ID_TIME_EXPR:
				return getIdTimeExpr();
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
			case GemRBACPackage.TIME_EXPRESSION__ABSOLUTE:
				getAbsolute().clear();
				getAbsolute().addAll((Collection<? extends AbsoluteTE>)newValue);
				return;
			case GemRBACPackage.TIME_EXPRESSION__RELATIVE:
				getRelative().clear();
				getRelative().addAll((Collection<? extends RelativeTE>)newValue);
				return;
			case GemRBACPackage.TIME_EXPRESSION__ID_TIME_EXPR:
				setIdTimeExpr((String)newValue);
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
			case GemRBACPackage.TIME_EXPRESSION__ABSOLUTE:
				getAbsolute().clear();
				return;
			case GemRBACPackage.TIME_EXPRESSION__RELATIVE:
				getRelative().clear();
				return;
			case GemRBACPackage.TIME_EXPRESSION__ID_TIME_EXPR:
				setIdTimeExpr(ID_TIME_EXPR_EDEFAULT);
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
			case GemRBACPackage.TIME_EXPRESSION__ABSOLUTE:
				return absolute != null && !absolute.isEmpty();
			case GemRBACPackage.TIME_EXPRESSION__RELATIVE:
				return relative != null && !relative.isEmpty();
			case GemRBACPackage.TIME_EXPRESSION__ID_TIME_EXPR:
				return ID_TIME_EXPR_EDEFAULT == null ? idTimeExpr != null : !ID_TIME_EXPR_EDEFAULT.equals(idTimeExpr);
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
		result.append(" (idTimeExpr: ");
		result.append(idTimeExpr);
		result.append(')');
		return result.toString();
	}

} //TimeExpressionImpl
