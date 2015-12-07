/**
 */
package gemRBAC.impl;

import gemRBAC.Delegation;
import gemRBAC.GemRBACPackage;
import gemRBAC.Permission;
import gemRBAC.Role;
import gemRBAC.User;
import gemRBAC.delegationType;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gemRBAC.impl.DelegationImpl#getIdDelegation <em>Id Delegation</em>}</li>
 *   <li>{@link gemRBAC.impl.DelegationImpl#isIsRevoked <em>Is Revoked</em>}</li>
 *   <li>{@link gemRBAC.impl.DelegationImpl#getIsTransfer <em>Is Transfer</em>}</li>
 *   <li>{@link gemRBAC.impl.DelegationImpl#isIsTotal <em>Is Total</em>}</li>
 *   <li>{@link gemRBAC.impl.DelegationImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link gemRBAC.impl.DelegationImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link gemRBAC.impl.DelegationImpl#getDelegatorUser <em>Delegator User</em>}</li>
 *   <li>{@link gemRBAC.impl.DelegationImpl#getDelegateUser <em>Delegate User</em>}</li>
 *   <li>{@link gemRBAC.impl.DelegationImpl#getRevokingUser <em>Revoking User</em>}</li>
 *   <li>{@link gemRBAC.impl.DelegationImpl#getDelegatedDelegation <em>Delegated Delegation</em>}</li>
 *   <li>{@link gemRBAC.impl.DelegationImpl#getDelegatedPermissions <em>Delegated Permissions</em>}</li>
 *   <li>{@link gemRBAC.impl.DelegationImpl#getMaxDepth <em>Max Depth</em>}</li>
 *   <li>{@link gemRBAC.impl.DelegationImpl#getDelegatedRole <em>Delegated Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelegationImpl extends MinimalEObjectImpl.Container implements Delegation {
	/**
	 * The default value of the '{@link #getIdDelegation() <em>Id Delegation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdDelegation()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_DELEGATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdDelegation() <em>Id Delegation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdDelegation()
	 * @generated
	 * @ordered
	 */
	protected String idDelegation = ID_DELEGATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRevoked() <em>Is Revoked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRevoked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REVOKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRevoked() <em>Is Revoked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRevoked()
	 * @generated
	 * @ordered
	 */
	protected boolean isRevoked = IS_REVOKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsTransfer() <em>Is Transfer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTransfer()
	 * @generated
	 * @ordered
	 */
	protected static final delegationType IS_TRANSFER_EDEFAULT = delegationType.GRANT;

	/**
	 * The cached value of the '{@link #getIsTransfer() <em>Is Transfer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTransfer()
	 * @generated
	 * @ordered
	 */
	protected delegationType isTransfer = IS_TRANSFER_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsTotal() <em>Is Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTotal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TOTAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTotal() <em>Is Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTotal()
	 * @generated
	 * @ordered
	 */
	protected boolean isTotal = IS_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDelegatorUser() <em>Delegator User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegatorUser()
	 * @generated
	 * @ordered
	 */
	protected User delegatorUser;

	/**
	 * The cached value of the '{@link #getDelegateUser() <em>Delegate User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateUser()
	 * @generated
	 * @ordered
	 */
	protected User delegateUser;

	/**
	 * The cached value of the '{@link #getRevokingUser() <em>Revoking User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevokingUser()
	 * @generated
	 * @ordered
	 */
	protected User revokingUser;

	/**
	 * The cached value of the '{@link #getDelegatedDelegation() <em>Delegated Delegation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegatedDelegation()
	 * @generated
	 * @ordered
	 */
	protected EList<Delegation> delegatedDelegation;

	/**
	 * The cached value of the '{@link #getDelegatedPermissions() <em>Delegated Permissions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegatedPermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> delegatedPermissions;

	/**
	 * The default value of the '{@link #getMaxDepth() <em>Max Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_DEPTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxDepth() <em>Max Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDepth()
	 * @generated
	 * @ordered
	 */
	protected int maxDepth = MAX_DEPTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDelegatedRole() <em>Delegated Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegatedRole()
	 * @generated
	 * @ordered
	 */
	protected Role delegatedRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemRBACPackage.Literals.DELEGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdDelegation() {
		return idDelegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdDelegation(String newIdDelegation) {
		String oldIdDelegation = idDelegation;
		idDelegation = newIdDelegation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.DELEGATION__ID_DELEGATION, oldIdDelegation, idDelegation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRevoked() {
		return isRevoked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRevoked(boolean newIsRevoked) {
		boolean oldIsRevoked = isRevoked;
		isRevoked = newIsRevoked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.DELEGATION__IS_REVOKED, oldIsRevoked, isRevoked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public delegationType getIsTransfer() {
		return isTransfer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTransfer(delegationType newIsTransfer) {
		delegationType oldIsTransfer = isTransfer;
		isTransfer = newIsTransfer == null ? IS_TRANSFER_EDEFAULT : newIsTransfer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.DELEGATION__IS_TRANSFER, oldIsTransfer, isTransfer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTotal() {
		return isTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTotal(boolean newIsTotal) {
		boolean oldIsTotal = isTotal;
		isTotal = newIsTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.DELEGATION__IS_TOTAL, oldIsTotal, isTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.DELEGATION__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.DELEGATION__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getDelegatorUser() {
		if (delegatorUser != null && delegatorUser.eIsProxy()) {
			InternalEObject oldDelegatorUser = (InternalEObject)delegatorUser;
			delegatorUser = (User)eResolveProxy(oldDelegatorUser);
			if (delegatorUser != oldDelegatorUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.DELEGATION__DELEGATOR_USER, oldDelegatorUser, delegatorUser));
			}
		}
		return delegatorUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetDelegatorUser() {
		return delegatorUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegatorUser(User newDelegatorUser, NotificationChain msgs) {
		User oldDelegatorUser = delegatorUser;
		delegatorUser = newDelegatorUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.DELEGATION__DELEGATOR_USER, oldDelegatorUser, newDelegatorUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegatorUser(User newDelegatorUser) {
		if (newDelegatorUser != delegatorUser) {
			NotificationChain msgs = null;
			if (delegatorUser != null)
				msgs = ((InternalEObject)delegatorUser).eInverseRemove(this, GemRBACPackage.USER__DELEGATION, User.class, msgs);
			if (newDelegatorUser != null)
				msgs = ((InternalEObject)newDelegatorUser).eInverseAdd(this, GemRBACPackage.USER__DELEGATION, User.class, msgs);
			msgs = basicSetDelegatorUser(newDelegatorUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.DELEGATION__DELEGATOR_USER, newDelegatorUser, newDelegatorUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getDelegateUser() {
		if (delegateUser != null && delegateUser.eIsProxy()) {
			InternalEObject oldDelegateUser = (InternalEObject)delegateUser;
			delegateUser = (User)eResolveProxy(oldDelegateUser);
			if (delegateUser != oldDelegateUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.DELEGATION__DELEGATE_USER, oldDelegateUser, delegateUser));
			}
		}
		return delegateUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetDelegateUser() {
		return delegateUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegateUser(User newDelegateUser, NotificationChain msgs) {
		User oldDelegateUser = delegateUser;
		delegateUser = newDelegateUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.DELEGATION__DELEGATE_USER, oldDelegateUser, newDelegateUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegateUser(User newDelegateUser) {
		if (newDelegateUser != delegateUser) {
			NotificationChain msgs = null;
			if (delegateUser != null)
				msgs = ((InternalEObject)delegateUser).eInverseRemove(this, GemRBACPackage.USER__RECIEVEDDELEGATION, User.class, msgs);
			if (newDelegateUser != null)
				msgs = ((InternalEObject)newDelegateUser).eInverseAdd(this, GemRBACPackage.USER__RECIEVEDDELEGATION, User.class, msgs);
			msgs = basicSetDelegateUser(newDelegateUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.DELEGATION__DELEGATE_USER, newDelegateUser, newDelegateUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getRevokingUser() {
		if (revokingUser != null && revokingUser.eIsProxy()) {
			InternalEObject oldRevokingUser = (InternalEObject)revokingUser;
			revokingUser = (User)eResolveProxy(oldRevokingUser);
			if (revokingUser != oldRevokingUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.DELEGATION__REVOKING_USER, oldRevokingUser, revokingUser));
			}
		}
		return revokingUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetRevokingUser() {
		return revokingUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevokingUser(User newRevokingUser, NotificationChain msgs) {
		User oldRevokingUser = revokingUser;
		revokingUser = newRevokingUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.DELEGATION__REVOKING_USER, oldRevokingUser, newRevokingUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevokingUser(User newRevokingUser) {
		if (newRevokingUser != revokingUser) {
			NotificationChain msgs = null;
			if (revokingUser != null)
				msgs = ((InternalEObject)revokingUser).eInverseRemove(this, GemRBACPackage.USER__REVOCATION, User.class, msgs);
			if (newRevokingUser != null)
				msgs = ((InternalEObject)newRevokingUser).eInverseAdd(this, GemRBACPackage.USER__REVOCATION, User.class, msgs);
			msgs = basicSetRevokingUser(newRevokingUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.DELEGATION__REVOKING_USER, newRevokingUser, newRevokingUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delegation> getDelegatedDelegation() {
		if (delegatedDelegation == null) {
			delegatedDelegation = new EObjectResolvingEList<Delegation>(Delegation.class, this, GemRBACPackage.DELEGATION__DELEGATED_DELEGATION);
		}
		return delegatedDelegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getDelegatedPermissions() {
		if (delegatedPermissions == null) {
			delegatedPermissions = new EObjectWithInverseResolvingEList.ManyInverse<Permission>(Permission.class, this, GemRBACPackage.DELEGATION__DELEGATED_PERMISSIONS, GemRBACPackage.PERMISSION__DELEGATION);
		}
		return delegatedPermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxDepth() {
		return maxDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDepth(int newMaxDepth) {
		int oldMaxDepth = maxDepth;
		maxDepth = newMaxDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.DELEGATION__MAX_DEPTH, oldMaxDepth, maxDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getDelegatedRole() {
		if (delegatedRole != null && delegatedRole.eIsProxy()) {
			InternalEObject oldDelegatedRole = (InternalEObject)delegatedRole;
			delegatedRole = (Role)eResolveProxy(oldDelegatedRole);
			if (delegatedRole != oldDelegatedRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemRBACPackage.DELEGATION__DELEGATED_ROLE, oldDelegatedRole, delegatedRole));
			}
		}
		return delegatedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetDelegatedRole() {
		return delegatedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegatedRole(Role newDelegatedRole, NotificationChain msgs) {
		Role oldDelegatedRole = delegatedRole;
		delegatedRole = newDelegatedRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemRBACPackage.DELEGATION__DELEGATED_ROLE, oldDelegatedRole, newDelegatedRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegatedRole(Role newDelegatedRole) {
		if (newDelegatedRole != delegatedRole) {
			NotificationChain msgs = null;
			if (delegatedRole != null)
				msgs = ((InternalEObject)delegatedRole).eInverseRemove(this, GemRBACPackage.ROLE__DELEGATION, Role.class, msgs);
			if (newDelegatedRole != null)
				msgs = ((InternalEObject)newDelegatedRole).eInverseAdd(this, GemRBACPackage.ROLE__DELEGATION, Role.class, msgs);
			msgs = basicSetDelegatedRole(newDelegatedRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemRBACPackage.DELEGATION__DELEGATED_ROLE, newDelegatedRole, newDelegatedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void revoke() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delegation> getAbsoluteDelegationPath() {
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
			case GemRBACPackage.DELEGATION__DELEGATOR_USER:
				if (delegatorUser != null)
					msgs = ((InternalEObject)delegatorUser).eInverseRemove(this, GemRBACPackage.USER__DELEGATION, User.class, msgs);
				return basicSetDelegatorUser((User)otherEnd, msgs);
			case GemRBACPackage.DELEGATION__DELEGATE_USER:
				if (delegateUser != null)
					msgs = ((InternalEObject)delegateUser).eInverseRemove(this, GemRBACPackage.USER__RECIEVEDDELEGATION, User.class, msgs);
				return basicSetDelegateUser((User)otherEnd, msgs);
			case GemRBACPackage.DELEGATION__REVOKING_USER:
				if (revokingUser != null)
					msgs = ((InternalEObject)revokingUser).eInverseRemove(this, GemRBACPackage.USER__REVOCATION, User.class, msgs);
				return basicSetRevokingUser((User)otherEnd, msgs);
			case GemRBACPackage.DELEGATION__DELEGATED_PERMISSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDelegatedPermissions()).basicAdd(otherEnd, msgs);
			case GemRBACPackage.DELEGATION__DELEGATED_ROLE:
				if (delegatedRole != null)
					msgs = ((InternalEObject)delegatedRole).eInverseRemove(this, GemRBACPackage.ROLE__DELEGATION, Role.class, msgs);
				return basicSetDelegatedRole((Role)otherEnd, msgs);
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
			case GemRBACPackage.DELEGATION__DELEGATOR_USER:
				return basicSetDelegatorUser(null, msgs);
			case GemRBACPackage.DELEGATION__DELEGATE_USER:
				return basicSetDelegateUser(null, msgs);
			case GemRBACPackage.DELEGATION__REVOKING_USER:
				return basicSetRevokingUser(null, msgs);
			case GemRBACPackage.DELEGATION__DELEGATED_PERMISSIONS:
				return ((InternalEList<?>)getDelegatedPermissions()).basicRemove(otherEnd, msgs);
			case GemRBACPackage.DELEGATION__DELEGATED_ROLE:
				return basicSetDelegatedRole(null, msgs);
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
			case GemRBACPackage.DELEGATION__ID_DELEGATION:
				return getIdDelegation();
			case GemRBACPackage.DELEGATION__IS_REVOKED:
				return isIsRevoked();
			case GemRBACPackage.DELEGATION__IS_TRANSFER:
				return getIsTransfer();
			case GemRBACPackage.DELEGATION__IS_TOTAL:
				return isIsTotal();
			case GemRBACPackage.DELEGATION__START_DATE:
				return getStartDate();
			case GemRBACPackage.DELEGATION__END_DATE:
				return getEndDate();
			case GemRBACPackage.DELEGATION__DELEGATOR_USER:
				if (resolve) return getDelegatorUser();
				return basicGetDelegatorUser();
			case GemRBACPackage.DELEGATION__DELEGATE_USER:
				if (resolve) return getDelegateUser();
				return basicGetDelegateUser();
			case GemRBACPackage.DELEGATION__REVOKING_USER:
				if (resolve) return getRevokingUser();
				return basicGetRevokingUser();
			case GemRBACPackage.DELEGATION__DELEGATED_DELEGATION:
				return getDelegatedDelegation();
			case GemRBACPackage.DELEGATION__DELEGATED_PERMISSIONS:
				return getDelegatedPermissions();
			case GemRBACPackage.DELEGATION__MAX_DEPTH:
				return getMaxDepth();
			case GemRBACPackage.DELEGATION__DELEGATED_ROLE:
				if (resolve) return getDelegatedRole();
				return basicGetDelegatedRole();
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
			case GemRBACPackage.DELEGATION__ID_DELEGATION:
				setIdDelegation((String)newValue);
				return;
			case GemRBACPackage.DELEGATION__IS_REVOKED:
				setIsRevoked((Boolean)newValue);
				return;
			case GemRBACPackage.DELEGATION__IS_TRANSFER:
				setIsTransfer((delegationType)newValue);
				return;
			case GemRBACPackage.DELEGATION__IS_TOTAL:
				setIsTotal((Boolean)newValue);
				return;
			case GemRBACPackage.DELEGATION__START_DATE:
				setStartDate((Date)newValue);
				return;
			case GemRBACPackage.DELEGATION__END_DATE:
				setEndDate((Date)newValue);
				return;
			case GemRBACPackage.DELEGATION__DELEGATOR_USER:
				setDelegatorUser((User)newValue);
				return;
			case GemRBACPackage.DELEGATION__DELEGATE_USER:
				setDelegateUser((User)newValue);
				return;
			case GemRBACPackage.DELEGATION__REVOKING_USER:
				setRevokingUser((User)newValue);
				return;
			case GemRBACPackage.DELEGATION__DELEGATED_DELEGATION:
				getDelegatedDelegation().clear();
				getDelegatedDelegation().addAll((Collection<? extends Delegation>)newValue);
				return;
			case GemRBACPackage.DELEGATION__DELEGATED_PERMISSIONS:
				getDelegatedPermissions().clear();
				getDelegatedPermissions().addAll((Collection<? extends Permission>)newValue);
				return;
			case GemRBACPackage.DELEGATION__MAX_DEPTH:
				setMaxDepth((Integer)newValue);
				return;
			case GemRBACPackage.DELEGATION__DELEGATED_ROLE:
				setDelegatedRole((Role)newValue);
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
			case GemRBACPackage.DELEGATION__ID_DELEGATION:
				setIdDelegation(ID_DELEGATION_EDEFAULT);
				return;
			case GemRBACPackage.DELEGATION__IS_REVOKED:
				setIsRevoked(IS_REVOKED_EDEFAULT);
				return;
			case GemRBACPackage.DELEGATION__IS_TRANSFER:
				setIsTransfer(IS_TRANSFER_EDEFAULT);
				return;
			case GemRBACPackage.DELEGATION__IS_TOTAL:
				setIsTotal(IS_TOTAL_EDEFAULT);
				return;
			case GemRBACPackage.DELEGATION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case GemRBACPackage.DELEGATION__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case GemRBACPackage.DELEGATION__DELEGATOR_USER:
				setDelegatorUser((User)null);
				return;
			case GemRBACPackage.DELEGATION__DELEGATE_USER:
				setDelegateUser((User)null);
				return;
			case GemRBACPackage.DELEGATION__REVOKING_USER:
				setRevokingUser((User)null);
				return;
			case GemRBACPackage.DELEGATION__DELEGATED_DELEGATION:
				getDelegatedDelegation().clear();
				return;
			case GemRBACPackage.DELEGATION__DELEGATED_PERMISSIONS:
				getDelegatedPermissions().clear();
				return;
			case GemRBACPackage.DELEGATION__MAX_DEPTH:
				setMaxDepth(MAX_DEPTH_EDEFAULT);
				return;
			case GemRBACPackage.DELEGATION__DELEGATED_ROLE:
				setDelegatedRole((Role)null);
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
			case GemRBACPackage.DELEGATION__ID_DELEGATION:
				return ID_DELEGATION_EDEFAULT == null ? idDelegation != null : !ID_DELEGATION_EDEFAULT.equals(idDelegation);
			case GemRBACPackage.DELEGATION__IS_REVOKED:
				return isRevoked != IS_REVOKED_EDEFAULT;
			case GemRBACPackage.DELEGATION__IS_TRANSFER:
				return isTransfer != IS_TRANSFER_EDEFAULT;
			case GemRBACPackage.DELEGATION__IS_TOTAL:
				return isTotal != IS_TOTAL_EDEFAULT;
			case GemRBACPackage.DELEGATION__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case GemRBACPackage.DELEGATION__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case GemRBACPackage.DELEGATION__DELEGATOR_USER:
				return delegatorUser != null;
			case GemRBACPackage.DELEGATION__DELEGATE_USER:
				return delegateUser != null;
			case GemRBACPackage.DELEGATION__REVOKING_USER:
				return revokingUser != null;
			case GemRBACPackage.DELEGATION__DELEGATED_DELEGATION:
				return delegatedDelegation != null && !delegatedDelegation.isEmpty();
			case GemRBACPackage.DELEGATION__DELEGATED_PERMISSIONS:
				return delegatedPermissions != null && !delegatedPermissions.isEmpty();
			case GemRBACPackage.DELEGATION__MAX_DEPTH:
				return maxDepth != MAX_DEPTH_EDEFAULT;
			case GemRBACPackage.DELEGATION__DELEGATED_ROLE:
				return delegatedRole != null;
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
			case GemRBACPackage.DELEGATION___REVOKE:
				revoke();
				return null;
			case GemRBACPackage.DELEGATION___GET_ABSOLUTE_DELEGATION_PATH:
				return getAbsoluteDelegationPath();
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
		result.append(" (idDelegation: ");
		result.append(idDelegation);
		result.append(", isRevoked: ");
		result.append(isRevoked);
		result.append(", isTransfer: ");
		result.append(isTransfer);
		result.append(", isTotal: ");
		result.append(isTotal);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", maxDepth: ");
		result.append(maxDepth);
		result.append(')');
		return result.toString();
	}

} //DelegationImpl
