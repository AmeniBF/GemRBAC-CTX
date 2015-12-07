/**
 */
package gemRBAC.impl;

import gemRBAC.GemRBACPackage;
import gemRBAC.History;
import gemRBAC.Permission;
import gemRBAC.RBACContext;
import gemRBAC.Role;

import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>RBAC Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.RBACContextImpl#getLogContext <em>Log Context</em>}</li>
 *   <li>{@link gemRBAC.impl.RBACContextImpl#getP1 <em>P1</em>}</li>
 *   <li>{@link gemRBAC.impl.RBACContextImpl#getP2 <em>P2</em>}</li>
 *   <li>{@link gemRBAC.impl.RBACContextImpl#getR1 <em>R1</em>}</li>
 *   <li>{@link gemRBAC.impl.RBACContextImpl#getR2 <em>R2</em>}</li>
 *   <li>{@link gemRBAC.impl.RBACContextImpl#getIdContext <em>Id Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RBACContextImpl extends MinimalEObjectImpl.Container implements RBACContext {
	/**
	 * The cached value of the '{@link #getLogContext() <em>Log Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogContext()
	 * @generated
	 * @ordered
	 */
	protected EList<History> logContext;

	/**
	 * The cached value of the '{@link #getP1() <em>P1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP1()
	 * @generated
	 * @ordered
	 */
	protected Permission p1;

	/**
	 * The cached value of the '{@link #getP2() <em>P2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP2()
	 * @generated
	 * @ordered
	 */
	protected Permission p2;

	/**
	 * The cached value of the '{@link #getR1() <em>R1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR1()
	 * @generated
	 * @ordered
	 */
	protected Role r1;

	/**
	 * The cached value of the '{@link #getR2() <em>R2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR2()
	 * @generated
	 * @ordered
	 */
	protected Role r2;

	/**
	 * The default value of the '{@link #getIdContext() <em>Id Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdContext()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdContext() <em>Id Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdContext()
	 * @generated
	 * @ordered
	 */
	protected String idContext = ID_CONTEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RBACContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.RBAC_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<History> getLogContext() {
		if (logContext == null) {
			logContext = new EObjectWithInverseResolvingEList.ManyInverse<History>(History.class, this, GemRBACPackage.RBAC_CONTEXT__LOG_CONTEXT, GemRBACPackage.HISTORY__CONTEXT);
		}
		return logContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission getP1() {
		if (p1 != null && p1.eIsProxy()) {
			InternalEObject oldP1 = (InternalEObject)p1;
			p1 = (Permission)eResolveProxy(oldP1);
			if (p1 != oldP1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.RBAC_CONTEXT__P1, oldP1, p1));
			}
		}
		return p1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission basicGetP1() {
		return p1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetP1(Permission newP1, NotificationChain msgs) {
		Permission oldP1 = p1;
		p1 = newP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.RBAC_CONTEXT__P1, oldP1, newP1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP1(Permission newP1) {
		if (newP1 != p1) {
			NotificationChain msgs = null;
			if (p1 != null)
				msgs = ((InternalEObject)p1).eInverseRemove(this, GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ASSIGNMENT, Permission.class, msgs);
			if (newP1 != null)
				msgs = ((InternalEObject)newP1).eInverseAdd(this, GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ASSIGNMENT, Permission.class, msgs);
			msgs = basicSetP1(newP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RBAC_CONTEXT__P1, newP1, newP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission getP2() {
		if (p2 != null && p2.eIsProxy()) {
			InternalEObject oldP2 = (InternalEObject)p2;
			p2 = (Permission)eResolveProxy(oldP2);
			if (p2 != oldP2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.RBAC_CONTEXT__P2, oldP2, p2));
			}
		}
		return p2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission basicGetP2() {
		return p2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetP2(Permission newP2, NotificationChain msgs) {
		Permission oldP2 = p2;
		p2 = newP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.RBAC_CONTEXT__P2, oldP2, newP2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP2(Permission newP2) {
		if (newP2 != p2) {
			NotificationChain msgs = null;
			if (p2 != null)
				msgs = ((InternalEObject)p2).eInverseRemove(this, GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ENABLING, Permission.class, msgs);
			if (newP2 != null)
				msgs = ((InternalEObject)newP2).eInverseAdd(this, GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ENABLING, Permission.class, msgs);
			msgs = basicSetP2(newP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RBAC_CONTEXT__P2, newP2, newP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getR1() {
		if (r1 != null && r1.eIsProxy()) {
			InternalEObject oldR1 = (InternalEObject)r1;
			r1 = (Role)eResolveProxy(oldR1);
			if (r1 != oldR1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.RBAC_CONTEXT__R1, oldR1, r1));
			}
		}
		return r1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetR1() {
		return r1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetR1(Role newR1, NotificationChain msgs) {
		Role oldR1 = r1;
		r1 = newR1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.RBAC_CONTEXT__R1, oldR1, newR1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR1(Role newR1) {
		if (newR1 != r1) {
			NotificationChain msgs = null;
			if (r1 != null)
				msgs = ((InternalEObject)r1).eInverseRemove(this, GemRBACPackage.ROLE__ROLE_CONTEXT_ASSIGNMENT, Role.class, msgs);
			if (newR1 != null)
				msgs = ((InternalEObject)newR1).eInverseAdd(this, GemRBACPackage.ROLE__ROLE_CONTEXT_ASSIGNMENT, Role.class, msgs);
			msgs = basicSetR1(newR1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RBAC_CONTEXT__R1, newR1, newR1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getR2() {
		if (r2 != null && r2.eIsProxy()) {
			InternalEObject oldR2 = (InternalEObject)r2;
			r2 = (Role)eResolveProxy(oldR2);
			if (r2 != oldR2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.RBAC_CONTEXT__R2, oldR2, r2));
			}
		}
		return r2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetR2() {
		return r2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetR2(Role newR2, NotificationChain msgs) {
		Role oldR2 = r2;
		r2 = newR2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.RBAC_CONTEXT__R2, oldR2, newR2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR2(Role newR2) {
		if (newR2 != r2) {
			NotificationChain msgs = null;
			if (r2 != null)
				msgs = ((InternalEObject)r2).eInverseRemove(this, GemRBACPackage.ROLE__ROLE_CONTEXT_ENABLING, Role.class, msgs);
			if (newR2 != null)
				msgs = ((InternalEObject)newR2).eInverseAdd(this, GemRBACPackage.ROLE__ROLE_CONTEXT_ENABLING, Role.class, msgs);
			msgs = basicSetR2(newR2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RBAC_CONTEXT__R2, newR2, newR2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdContext() {
		return idContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdContext(String newIdContext) {
		String oldIdContext = idContext;
		idContext = newIdContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RBAC_CONTEXT__ID_CONTEXT, oldIdContext, idContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkAccess(RBACContext c) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case GemRBACPackage.RBAC_CONTEXT__LOG_CONTEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLogContext()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.RBAC_CONTEXT__P1:
				if (p1 != null)
					msgs = ((InternalEObject)p1).eInverseRemove(this, GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ASSIGNMENT, Permission.class, msgs);
				return basicSetP1((Permission)otherEnd, msgs);
			case GemRBACPackage.RBAC_CONTEXT__P2:
				if (p2 != null)
					msgs = ((InternalEObject)p2).eInverseRemove(this, GemRBACPackage.PERMISSION__PERMISSION_CONTEXT_ENABLING, Permission.class, msgs);
				return basicSetP2((Permission)otherEnd, msgs);
			case GemRBACPackage.RBAC_CONTEXT__R1:
				if (r1 != null)
					msgs = ((InternalEObject)r1).eInverseRemove(this, GemRBACPackage.ROLE__ROLE_CONTEXT_ASSIGNMENT, Role.class, msgs);
				return basicSetR1((Role)otherEnd, msgs);
			case GemRBACPackage.RBAC_CONTEXT__R2:
				if (r2 != null)
					msgs = ((InternalEObject)r2).eInverseRemove(this, GemRBACPackage.ROLE__ROLE_CONTEXT_ENABLING, Role.class, msgs);
				return basicSetR2((Role)otherEnd, msgs);
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
			case GemRBACPackage.RBAC_CONTEXT__LOG_CONTEXT:
				return ((InternalEList<?>)getLogContext()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.RBAC_CONTEXT__P1:
				return basicSetP1(null, msgs);
			case GemRBACPackage.RBAC_CONTEXT__P2:
				return basicSetP2(null, msgs);
			case GemRBACPackage.RBAC_CONTEXT__R1:
				return basicSetR1(null, msgs);
			case GemRBACPackage.RBAC_CONTEXT__R2:
				return basicSetR2(null, msgs);
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
			case GemRBACPackage.RBAC_CONTEXT__LOG_CONTEXT:
				return getLogContext();
			case GemRBACPackage.RBAC_CONTEXT__P1:
				if (resolve) return getP1();
				return basicGetP1();
			case GemRBACPackage.RBAC_CONTEXT__P2:
				if (resolve) return getP2();
				return basicGetP2();
			case GemRBACPackage.RBAC_CONTEXT__R1:
				if (resolve) return getR1();
				return basicGetR1();
			case GemRBACPackage.RBAC_CONTEXT__R2:
				if (resolve) return getR2();
				return basicGetR2();
			case GemRBACPackage.RBAC_CONTEXT__ID_CONTEXT:
				return getIdContext();
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
			case GemRBACPackage.RBAC_CONTEXT__LOG_CONTEXT:
				getLogContext().clear();
				getLogContext().addAll((Collection<? extends History>)newValue);
				return;
			case GemRBACPackage.RBAC_CONTEXT__P1:
				setP1((Permission)newValue);
				return;
			case GemRBACPackage.RBAC_CONTEXT__P2:
				setP2((Permission)newValue);
				return;
			case GemRBACPackage.RBAC_CONTEXT__R1:
				setR1((Role)newValue);
				return;
			case GemRBACPackage.RBAC_CONTEXT__R2:
				setR2((Role)newValue);
				return;
			case GemRBACPackage.RBAC_CONTEXT__ID_CONTEXT:
				setIdContext((String)newValue);
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
			case GemRBACPackage.RBAC_CONTEXT__LOG_CONTEXT:
				getLogContext().clear();
				return;
			case GemRBACPackage.RBAC_CONTEXT__P1:
				setP1((Permission)null);
				return;
			case GemRBACPackage.RBAC_CONTEXT__P2:
				setP2((Permission)null);
				return;
			case GemRBACPackage.RBAC_CONTEXT__R1:
				setR1((Role)null);
				return;
			case GemRBACPackage.RBAC_CONTEXT__R2:
				setR2((Role)null);
				return;
			case GemRBACPackage.RBAC_CONTEXT__ID_CONTEXT:
				setIdContext(ID_CONTEXT_EDEFAULT);
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
			case GemRBACPackage.RBAC_CONTEXT__LOG_CONTEXT:
				return logContext != null && !logContext.isEmpty();
			case GemRBACPackage.RBAC_CONTEXT__P1:
				return p1 != null;
			case GemRBACPackage.RBAC_CONTEXT__P2:
				return p2 != null;
			case GemRBACPackage.RBAC_CONTEXT__R1:
				return r1 != null;
			case GemRBACPackage.RBAC_CONTEXT__R2:
				return r2 != null;
			case GemRBACPackage.RBAC_CONTEXT__ID_CONTEXT:
				return ID_CONTEXT_EDEFAULT == null ? idContext != null : !ID_CONTEXT_EDEFAULT.equals(idContext);
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
			case GemRBACPackage.RBAC_CONTEXT___CHECK_ACCESS__RBACCONTEXT:
				return checkAccess((RBACContext)arguments.get(0));
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
		result.append(" (idContext: ");
		result.append(idContext);
		result.append(')');
		return result.toString();
	}

} //RBACContextImpl
