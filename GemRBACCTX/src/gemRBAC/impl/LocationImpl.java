/**
 */
package gemRBAC.impl;

import gemRBAC.GemRBACPackage;
import gemRBAC.Location;
import gemRBAC.RelativeLocation;

import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.LocationImpl#getRelativelocation <em>Relativelocation</em>}</li>
 *   <li>{@link gemRBAC.impl.LocationImpl#getLocationID <em>Location ID</em>}</li>
 *   <li>{@link gemRBAC.impl.LocationImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The cached value of the '{@link #getRelativelocation() <em>Relativelocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativelocation()
	 * @generated
	 * @ordered
	 */
	protected RelativeLocation relativelocation;

	/**
	 * The default value of the '{@link #getLocationID() <em>Location ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationID()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationID() <em>Location ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationID()
	 * @generated
	 * @ordered
	 */
	protected String locationID = LOCATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeLocation getRelativelocation() {
		if (relativelocation != null && relativelocation.eIsProxy()) {
			InternalEObject oldRelativelocation = (InternalEObject)relativelocation;
			relativelocation = (RelativeLocation)eResolveProxy(oldRelativelocation);
			if (relativelocation != oldRelativelocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.LOCATION__RELATIVELOCATION, oldRelativelocation, relativelocation));
			}
		}
		return relativelocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeLocation basicGetRelativelocation() {
		return relativelocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativelocation(RelativeLocation newRelativelocation, NotificationChain msgs) {
		RelativeLocation oldRelativelocation = relativelocation;
		relativelocation = newRelativelocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.LOCATION__RELATIVELOCATION, oldRelativelocation, newRelativelocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativelocation(RelativeLocation newRelativelocation) {
		if (newRelativelocation != relativelocation) {
			NotificationChain msgs = null;
			if (relativelocation != null)
				msgs = ((InternalEObject)relativelocation).eInverseRemove(this, GemRBACPackage.RELATIVE_LOCATION__LOCATION, RelativeLocation.class, msgs);
			if (newRelativelocation != null)
				msgs = ((InternalEObject)newRelativelocation).eInverseAdd(this, GemRBACPackage.RELATIVE_LOCATION__LOCATION, RelativeLocation.class, msgs);
			msgs = basicSetRelativelocation(newRelativelocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.LOCATION__RELATIVELOCATION, newRelativelocation, newRelativelocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocationID() {
		return locationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationID(String newLocationID) {
		String oldLocationID = locationID;
		locationID = newLocationID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.LOCATION__LOCATION_ID, oldLocationID, locationID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.LOCATION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean disjoint(Location l) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #contains(gemRBAC.Location) <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #contains(gemRBAC.Location)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CONTAINS_LOCATION__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.LOCATION___CONTAINS__LOCATION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean contains(Location l) {
		try {
			return (Boolean)CONTAINS_LOCATION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{l}));
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
	public boolean overlaps(Location l) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #computeRelative(gemRBAC.RelativeLocation) <em>Compute Relative</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #computeRelative(gemRBAC.RelativeLocation)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate COMPUTE_RELATIVE_RELATIVE_LOCATION__EINVOCATION_DELEGATE = ((EOperation.Internal)GemRBACPackage.Literals.LOCATION___COMPUTE_RELATIVE__RELATIVELOCATION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location computeRelative(RelativeLocation r) {
		try {
			return (Location)COMPUTE_RELATIVE_RELATIVE_LOCATION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{r}));
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
			case GemRBACPackage.LOCATION__RELATIVELOCATION:
				if (relativelocation != null)
					msgs = ((InternalEObject)relativelocation).eInverseRemove(this, GemRBACPackage.RELATIVE_LOCATION__LOCATION, RelativeLocation.class, msgs);
				return basicSetRelativelocation((RelativeLocation)otherEnd, msgs);
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
			case GemRBACPackage.LOCATION__RELATIVELOCATION:
				return basicSetRelativelocation(null, msgs);
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
			case GemRBACPackage.LOCATION__RELATIVELOCATION:
				if (resolve) return getRelativelocation();
				return basicGetRelativelocation();
			case GemRBACPackage.LOCATION__LOCATION_ID:
				return getLocationID();
			case GemRBACPackage.LOCATION__LABEL:
				return getLabel();
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
			case GemRBACPackage.LOCATION__RELATIVELOCATION:
				setRelativelocation((RelativeLocation)newValue);
				return;
			case GemRBACPackage.LOCATION__LOCATION_ID:
				setLocationID((String)newValue);
				return;
			case GemRBACPackage.LOCATION__LABEL:
				setLabel((String)newValue);
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
			case GemRBACPackage.LOCATION__RELATIVELOCATION:
				setRelativelocation((RelativeLocation)null);
				return;
			case GemRBACPackage.LOCATION__LOCATION_ID:
				setLocationID(LOCATION_ID_EDEFAULT);
				return;
			case GemRBACPackage.LOCATION__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case GemRBACPackage.LOCATION__RELATIVELOCATION:
				return relativelocation != null;
			case GemRBACPackage.LOCATION__LOCATION_ID:
				return LOCATION_ID_EDEFAULT == null ? locationID != null : !LOCATION_ID_EDEFAULT.equals(locationID);
			case GemRBACPackage.LOCATION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
			case GemRBACPackage.LOCATION___DISJOINT__LOCATION:
				return disjoint((Location)arguments.get(0));
			case GemRBACPackage.LOCATION___CONTAINS__LOCATION:
				return contains((Location)arguments.get(0));
			case GemRBACPackage.LOCATION___OVERLAPS__LOCATION:
				return overlaps((Location)arguments.get(0));
			case GemRBACPackage.LOCATION___COMPUTE_RELATIVE__RELATIVELOCATION:
				return computeRelative((RelativeLocation)arguments.get(0));
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
		result.append(" (locationID: ");
		result.append(locationID);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
