/**
 */
package gemRBAC.impl;

import gemRBAC.ActivationDuration;
import gemRBAC.Delegation;
import gemRBAC.GemRBACPackage;
import gemRBAC.History;
import gemRBAC.Location;
import gemRBAC.Operation;
import gemRBAC.PeriodicTime;
import gemRBAC.Permission;
import gemRBAC.RBACContext;
import gemRBAC.RBACUtility;
import gemRBAC.RelativeDirection;
import gemRBAC.RelativeLocation;
import gemRBAC.Role;
import gemRBAC.Root;
import gemRBAC.Session;
import gemRBAC.User;

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
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.RootImpl#getSys <em>Sys</em>}</li>
 *   <li>{@link gemRBAC.impl.RootImpl#getObj <em>Obj</em>}</li>
 *   <li>{@link gemRBAC.impl.RootImpl#getOp <em>Op</em>}</li>
 *   <li>{@link gemRBAC.impl.RootImpl#getC <em>C</em>}</li>
 *   <li>{@link gemRBAC.impl.RootImpl#getP <em>P</em>}</li>
 *   <li>{@link gemRBAC.impl.RootImpl#getR <em>R</em>}</li>
 *   <li>{@link gemRBAC.impl.RootImpl#getS <em>S</em>}</li>
 *   <li>{@link gemRBAC.impl.RootImpl#getU <em>U</em>}</li>
 *   <li>{@link gemRBAC.impl.RootImpl#getD <em>D</em>}</li>
 *   <li>{@link gemRBAC.impl.RootImpl#getLog <em>Log</em>}</li>
 *   <li>{@link gemRBAC.impl.RootImpl#getDur <em>Dur</em>}</li>
 *   <li>{@link gemRBAC.impl.RootImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link gemRBAC.impl.RootImpl#getRloc <em>Rloc</em>}</li>
 *   <li>{@link gemRBAC.impl.RootImpl#getRd <em>Rd</em>}</li>
 *   <li>{@link gemRBAC.impl.RootImpl#getLoc <em>Loc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The cached value of the '{@link #getSys() <em>Sys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSys()
	 * @generated
	 * @ordered
	 */
	protected RBACUtility sys;

	/**
	 * The cached value of the '{@link #getObj() <em>Obj</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObj()
	 * @generated
	 * @ordered
	 */
	protected EList<gemRBAC.Object> obj;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> op;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected EList<RBACContext> c;

	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> p;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> r;

	/**
	 * The cached value of the '{@link #getS() <em>S</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected EList<Session> s;

	/**
	 * The cached value of the '{@link #getU() <em>U</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getU()
	 * @generated
	 * @ordered
	 */
	protected EList<User> u;

	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected EList<Delegation> d;

	/**
	 * The cached value of the '{@link #getLog() <em>Log</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLog()
	 * @generated
	 * @ordered
	 */
	protected EList<History> log;

	/**
	 * The cached value of the '{@link #getDur() <em>Dur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDur()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivationDuration> dur;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected EList<PeriodicTime> period;

	/**
	 * The cached value of the '{@link #getRloc() <em>Rloc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRloc()
	 * @generated
	 * @ordered
	 */
	protected EList<RelativeLocation> rloc;

	/**
	 * The cached value of the '{@link #getRd() <em>Rd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRd()
	 * @generated
	 * @ordered
	 */
	protected EList<RelativeDirection> rd;

	/**
	 * The cached value of the '{@link #getLoc() <em>Loc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoc()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> loc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RBACUtility getSys() {
		return sys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSys(RBACUtility newSys, NotificationChain msgs) {
		RBACUtility oldSys = sys;
		sys = newSys;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.ROOT__SYS, oldSys, newSys);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSys(RBACUtility newSys) {
		if (newSys != sys) {
			NotificationChain msgs = null;
			if (sys != null)
				msgs = ((InternalEObject)sys).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GemRBACPackage.ROOT__SYS, null, msgs);
			if (newSys != null)
				msgs = ((InternalEObject)newSys).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GemRBACPackage.ROOT__SYS, null, msgs);
			msgs = basicSetSys(newSys, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.ROOT__SYS, newSys, newSys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<gemRBAC.Object> getObj() {
		if (obj == null) {
			obj = new EObjectContainmentEList<gemRBAC.Object>(gemRBAC.Object.class, this, GemRBACPackage.ROOT__OBJ);
		}
		return obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOp() {
		if (op == null) {
			op = new EObjectContainmentEList<Operation>(Operation.class, this, GemRBACPackage.ROOT__OP);
		}
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RBACContext> getC() {
		if (c == null) {
			c = new EObjectContainmentEList<RBACContext>(RBACContext.class, this, GemRBACPackage.ROOT__C);
		}
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getP() {
		if (p == null) {
			p = new EObjectContainmentEList<Permission>(Permission.class, this, GemRBACPackage.ROOT__P);
		}
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getR() {
		if (r == null) {
			r = new EObjectContainmentEList<Role>(Role.class, this, GemRBACPackage.ROOT__R);
		}
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Session> getS() {
		if (s == null) {
			s = new EObjectContainmentEList<Session>(Session.class, this, GemRBACPackage.ROOT__S);
		}
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getU() {
		if (u == null) {
			u = new EObjectContainmentEList<User>(User.class, this, GemRBACPackage.ROOT__U);
		}
		return u;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delegation> getD() {
		if (d == null) {
			d = new EObjectContainmentEList<Delegation>(Delegation.class, this, GemRBACPackage.ROOT__D);
		}
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<History> getLog() {
		if (log == null) {
			log = new EObjectContainmentEList<History>(History.class, this, GemRBACPackage.ROOT__LOG);
		}
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivationDuration> getDur() {
		if (dur == null) {
			dur = new EObjectContainmentEList<ActivationDuration>(ActivationDuration.class, this, GemRBACPackage.ROOT__DUR);
		}
		return dur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PeriodicTime> getPeriod() {
		if (period == null) {
			period = new EObjectContainmentEList<PeriodicTime>(PeriodicTime.class, this, GemRBACPackage.ROOT__PERIOD);
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelativeLocation> getRloc() {
		if (rloc == null) {
			rloc = new EObjectContainmentEList<RelativeLocation>(RelativeLocation.class, this, GemRBACPackage.ROOT__RLOC);
		}
		return rloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelativeDirection> getRd() {
		if (rd == null) {
			rd = new EObjectContainmentEList<RelativeDirection>(RelativeDirection.class, this, GemRBACPackage.ROOT__RD);
		}
		return rd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLoc() {
		if (loc == null) {
			loc = new EObjectContainmentEList<Location>(Location.class, this, GemRBACPackage.ROOT__LOC);
		}
		return loc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GemRBACPackage.ROOT__SYS:
				return basicSetSys(null, msgs);
			case GemRBACPackage.ROOT__OBJ:
				return ((InternalEList<?>)getObj()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROOT__OP:
				return ((InternalEList<?>)getOp()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROOT__C:
				return ((InternalEList<?>)getC()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROOT__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROOT__R:
				return ((InternalEList<?>)getR()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROOT__S:
				return ((InternalEList<?>)getS()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROOT__U:
				return ((InternalEList<?>)getU()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROOT__D:
				return ((InternalEList<?>)getD()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROOT__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROOT__DUR:
				return ((InternalEList<?>)getDur()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROOT__PERIOD:
				return ((InternalEList<?>)getPeriod()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROOT__RLOC:
				return ((InternalEList<?>)getRloc()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROOT__RD:
				return ((InternalEList<?>)getRd()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.ROOT__LOC:
				return ((InternalEList<?>)getLoc()).basicRemove(otherEnd, msgs);
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
			case GemRBACPackage.ROOT__SYS:
				return getSys();
			case GemRBACPackage.ROOT__OBJ:
				return getObj();
			case GemRBACPackage.ROOT__OP:
				return getOp();
			case GemRBACPackage.ROOT__C:
				return getC();
			case GemRBACPackage.ROOT__P:
				return getP();
			case GemRBACPackage.ROOT__R:
				return getR();
			case GemRBACPackage.ROOT__S:
				return getS();
			case GemRBACPackage.ROOT__U:
				return getU();
			case GemRBACPackage.ROOT__D:
				return getD();
			case GemRBACPackage.ROOT__LOG:
				return getLog();
			case GemRBACPackage.ROOT__DUR:
				return getDur();
			case GemRBACPackage.ROOT__PERIOD:
				return getPeriod();
			case GemRBACPackage.ROOT__RLOC:
				return getRloc();
			case GemRBACPackage.ROOT__RD:
				return getRd();
			case GemRBACPackage.ROOT__LOC:
				return getLoc();
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
			case GemRBACPackage.ROOT__SYS:
				setSys((RBACUtility)newValue);
				return;
			case GemRBACPackage.ROOT__OBJ:
				getObj().clear();
				getObj().addAll((Collection<? extends gemRBAC.Object>)newValue);
				return;
			case GemRBACPackage.ROOT__OP:
				getOp().clear();
				getOp().addAll((Collection<? extends Operation>)newValue);
				return;
			case GemRBACPackage.ROOT__C:
				getC().clear();
				getC().addAll((Collection<? extends RBACContext>)newValue);
				return;
			case GemRBACPackage.ROOT__P:
				getP().clear();
				getP().addAll((Collection<? extends Permission>)newValue);
				return;
			case GemRBACPackage.ROOT__R:
				getR().clear();
				getR().addAll((Collection<? extends Role>)newValue);
				return;
			case GemRBACPackage.ROOT__S:
				getS().clear();
				getS().addAll((Collection<? extends Session>)newValue);
				return;
			case GemRBACPackage.ROOT__U:
				getU().clear();
				getU().addAll((Collection<? extends User>)newValue);
				return;
			case GemRBACPackage.ROOT__D:
				getD().clear();
				getD().addAll((Collection<? extends Delegation>)newValue);
				return;
			case GemRBACPackage.ROOT__LOG:
				getLog().clear();
				getLog().addAll((Collection<? extends History>)newValue);
				return;
			case GemRBACPackage.ROOT__DUR:
				getDur().clear();
				getDur().addAll((Collection<? extends ActivationDuration>)newValue);
				return;
			case GemRBACPackage.ROOT__PERIOD:
				getPeriod().clear();
				getPeriod().addAll((Collection<? extends PeriodicTime>)newValue);
				return;
			case GemRBACPackage.ROOT__RLOC:
				getRloc().clear();
				getRloc().addAll((Collection<? extends RelativeLocation>)newValue);
				return;
			case GemRBACPackage.ROOT__RD:
				getRd().clear();
				getRd().addAll((Collection<? extends RelativeDirection>)newValue);
				return;
			case GemRBACPackage.ROOT__LOC:
				getLoc().clear();
				getLoc().addAll((Collection<? extends Location>)newValue);
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
			case GemRBACPackage.ROOT__SYS:
				setSys((RBACUtility)null);
				return;
			case GemRBACPackage.ROOT__OBJ:
				getObj().clear();
				return;
			case GemRBACPackage.ROOT__OP:
				getOp().clear();
				return;
			case GemRBACPackage.ROOT__C:
				getC().clear();
				return;
			case GemRBACPackage.ROOT__P:
				getP().clear();
				return;
			case GemRBACPackage.ROOT__R:
				getR().clear();
				return;
			case GemRBACPackage.ROOT__S:
				getS().clear();
				return;
			case GemRBACPackage.ROOT__U:
				getU().clear();
				return;
			case GemRBACPackage.ROOT__D:
				getD().clear();
				return;
			case GemRBACPackage.ROOT__LOG:
				getLog().clear();
				return;
			case GemRBACPackage.ROOT__DUR:
				getDur().clear();
				return;
			case GemRBACPackage.ROOT__PERIOD:
				getPeriod().clear();
				return;
			case GemRBACPackage.ROOT__RLOC:
				getRloc().clear();
				return;
			case GemRBACPackage.ROOT__RD:
				getRd().clear();
				return;
			case GemRBACPackage.ROOT__LOC:
				getLoc().clear();
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
			case GemRBACPackage.ROOT__SYS:
				return sys != null;
			case GemRBACPackage.ROOT__OBJ:
				return obj != null && !obj.isEmpty();
			case GemRBACPackage.ROOT__OP:
				return op != null && !op.isEmpty();
			case GemRBACPackage.ROOT__C:
				return c != null && !c.isEmpty();
			case GemRBACPackage.ROOT__P:
				return p != null && !p.isEmpty();
			case GemRBACPackage.ROOT__R:
				return r != null && !r.isEmpty();
			case GemRBACPackage.ROOT__S:
				return s != null && !s.isEmpty();
			case GemRBACPackage.ROOT__U:
				return u != null && !u.isEmpty();
			case GemRBACPackage.ROOT__D:
				return d != null && !d.isEmpty();
			case GemRBACPackage.ROOT__LOG:
				return log != null && !log.isEmpty();
			case GemRBACPackage.ROOT__DUR:
				return dur != null && !dur.isEmpty();
			case GemRBACPackage.ROOT__PERIOD:
				return period != null && !period.isEmpty();
			case GemRBACPackage.ROOT__RLOC:
				return rloc != null && !rloc.isEmpty();
			case GemRBACPackage.ROOT__RD:
				return rd != null && !rd.isEmpty();
			case GemRBACPackage.ROOT__LOC:
				return loc != null && !loc.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
