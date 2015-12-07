/**
 */
package gemRBAC.impl;

import gemRBAC.GemRBACPackage;
import gemRBAC.Location;
import gemRBAC.RelativeDirection;
import gemRBAC.RelativeLocation;

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
 * An implementation of the model object '<em><b>Relative Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.RelativeLocationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link gemRBAC.impl.RelativeLocationImpl#getRelativeLocID <em>Relative Loc ID</em>}</li>
 *   <li>{@link gemRBAC.impl.RelativeLocationImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link gemRBAC.impl.RelativeLocationImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link gemRBAC.impl.RelativeLocationImpl#getRelativedirection <em>Relativedirection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelativeLocationImpl extends MinimalEObjectImpl.Container implements RelativeLocation {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> location;

	/**
	 * The default value of the '{@link #getRelativeLocID() <em>Relative Loc ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeLocID()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIVE_LOC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativeLocID() <em>Relative Loc ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeLocID()
	 * @generated
	 * @ordered
	 */
	protected String relativeLocID = RELATIVE_LOC_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected double distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelativedirection() <em>Relativedirection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativedirection()
	 * @generated
	 * @ordered
	 */
	protected RelativeDirection relativedirection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.RELATIVE_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocation() {
		if (location == null) {
			location = new EObjectWithInverseResolvingEList<Location>(Location.class, this, GemRBACPackage.RELATIVE_LOCATION__LOCATION, GemRBACPackage.LOCATION__RELATIVELOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelativeLocID() {
		return relativeLocID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeLocID(String newRelativeLocID) {
		String oldRelativeLocID = relativeLocID;
		relativeLocID = newRelativeLocID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RELATIVE_LOCATION__RELATIVE_LOC_ID, oldRelativeLocID, relativeLocID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(double newDistance) {
		double oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RELATIVE_LOCATION__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RELATIVE_LOCATION__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeDirection getRelativedirection() {
		if (relativedirection != null && relativedirection.eIsProxy()) {
			InternalEObject oldRelativedirection = (InternalEObject)relativedirection;
			relativedirection = (RelativeDirection)eResolveProxy(oldRelativedirection);
			if (relativedirection != oldRelativedirection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.RELATIVE_LOCATION__RELATIVEDIRECTION, oldRelativedirection, relativedirection));
			}
		}
		return relativedirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeDirection basicGetRelativedirection() {
		return relativedirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativedirection(RelativeDirection newRelativedirection, NotificationChain msgs) {
		RelativeDirection oldRelativedirection = relativedirection;
		relativedirection = newRelativedirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.RELATIVE_LOCATION__RELATIVEDIRECTION, oldRelativedirection, newRelativedirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativedirection(RelativeDirection newRelativedirection) {
		if (newRelativedirection != relativedirection) {
			NotificationChain msgs = null;
			if (relativedirection != null)
				msgs = ((InternalEObject)relativedirection).eInverseRemove(this, GemRBACPackage.RELATIVE_DIRECTION__RELATIVELOCATION, RelativeDirection.class, msgs);
			if (newRelativedirection != null)
				msgs = ((InternalEObject)newRelativedirection).eInverseAdd(this, GemRBACPackage.RELATIVE_DIRECTION__RELATIVELOCATION, RelativeDirection.class, msgs);
			msgs = basicSetRelativedirection(newRelativedirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.RELATIVE_LOCATION__RELATIVEDIRECTION, newRelativedirection, newRelativedirection));
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
			case GemRBACPackage.RELATIVE_LOCATION__LOCATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocation()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.RELATIVE_LOCATION__RELATIVEDIRECTION:
				if (relativedirection != null)
					msgs = ((InternalEObject)relativedirection).eInverseRemove(this, GemRBACPackage.RELATIVE_DIRECTION__RELATIVELOCATION, RelativeDirection.class, msgs);
				return basicSetRelativedirection((RelativeDirection)otherEnd, msgs);
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
			case GemRBACPackage.RELATIVE_LOCATION__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.RELATIVE_LOCATION__RELATIVEDIRECTION:
				return basicSetRelativedirection(null, msgs);
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
			case GemRBACPackage.RELATIVE_LOCATION__LOCATION:
				return getLocation();
			case GemRBACPackage.RELATIVE_LOCATION__RELATIVE_LOC_ID:
				return getRelativeLocID();
			case GemRBACPackage.RELATIVE_LOCATION__DISTANCE:
				return getDistance();
			case GemRBACPackage.RELATIVE_LOCATION__UNIT:
				return getUnit();
			case GemRBACPackage.RELATIVE_LOCATION__RELATIVEDIRECTION:
				if (resolve) return getRelativedirection();
				return basicGetRelativedirection();
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
			case GemRBACPackage.RELATIVE_LOCATION__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Location>)newValue);
				return;
			case GemRBACPackage.RELATIVE_LOCATION__RELATIVE_LOC_ID:
				setRelativeLocID((String)newValue);
				return;
			case GemRBACPackage.RELATIVE_LOCATION__DISTANCE:
				setDistance((Double)newValue);
				return;
			case GemRBACPackage.RELATIVE_LOCATION__UNIT:
				setUnit((String)newValue);
				return;
			case GemRBACPackage.RELATIVE_LOCATION__RELATIVEDIRECTION:
				setRelativedirection((RelativeDirection)newValue);
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
			case GemRBACPackage.RELATIVE_LOCATION__LOCATION:
				getLocation().clear();
				return;
			case GemRBACPackage.RELATIVE_LOCATION__RELATIVE_LOC_ID:
				setRelativeLocID(RELATIVE_LOC_ID_EDEFAULT);
				return;
			case GemRBACPackage.RELATIVE_LOCATION__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case GemRBACPackage.RELATIVE_LOCATION__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case GemRBACPackage.RELATIVE_LOCATION__RELATIVEDIRECTION:
				setRelativedirection((RelativeDirection)null);
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
			case GemRBACPackage.RELATIVE_LOCATION__LOCATION:
				return location != null && !location.isEmpty();
			case GemRBACPackage.RELATIVE_LOCATION__RELATIVE_LOC_ID:
				return RELATIVE_LOC_ID_EDEFAULT == null ? relativeLocID != null : !RELATIVE_LOC_ID_EDEFAULT.equals(relativeLocID);
			case GemRBACPackage.RELATIVE_LOCATION__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case GemRBACPackage.RELATIVE_LOCATION__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case GemRBACPackage.RELATIVE_LOCATION__RELATIVEDIRECTION:
				return relativedirection != null;
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
		result.append(" (relativeLocID: ");
		result.append(relativeLocID);
		result.append(", distance: ");
		result.append(distance);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //RelativeLocationImpl
