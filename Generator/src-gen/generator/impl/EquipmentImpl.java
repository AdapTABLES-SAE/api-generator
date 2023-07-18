/**
 */
package generator.impl;

import generator.Ability;
import generator.Equipment;
import generator.GeneratorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.EquipmentImpl#getID <em>ID</em>}</li>
 *   <li>{@link generator.impl.EquipmentImpl#getLockedAbility <em>Locked Ability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquipmentImpl extends MinimalEObjectImpl.Container implements Equipment {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLockedAbility() <em>Locked Ability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockedAbility()
	 * @generated
	 * @ordered
	 */
	protected Ability lockedAbility;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.EQUIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.EQUIPMENT__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability getLockedAbility() {
		if (lockedAbility != null && lockedAbility.eIsProxy()) {
			InternalEObject oldLockedAbility = (InternalEObject) lockedAbility;
			lockedAbility = (Ability) eResolveProxy(oldLockedAbility);
			if (lockedAbility != oldLockedAbility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.EQUIPMENT__LOCKED_ABILITY, oldLockedAbility, lockedAbility));
			}
		}
		return lockedAbility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability basicGetLockedAbility() {
		return lockedAbility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLockedAbility(Ability newLockedAbility, NotificationChain msgs) {
		Ability oldLockedAbility = lockedAbility;
		lockedAbility = newLockedAbility;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.EQUIPMENT__LOCKED_ABILITY, oldLockedAbility, newLockedAbility);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockedAbility(Ability newLockedAbility) {
		if (newLockedAbility != lockedAbility) {
			NotificationChain msgs = null;
			if (lockedAbility != null)
				msgs = ((InternalEObject) lockedAbility).eInverseRemove(this,
						GeneratorPackage.ABILITY__LOCKING_EQUIPMENT, Ability.class, msgs);
			if (newLockedAbility != null)
				msgs = ((InternalEObject) newLockedAbility).eInverseAdd(this,
						GeneratorPackage.ABILITY__LOCKING_EQUIPMENT, Ability.class, msgs);
			msgs = basicSetLockedAbility(newLockedAbility, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.EQUIPMENT__LOCKED_ABILITY,
					newLockedAbility, newLockedAbility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.EQUIPMENT__LOCKED_ABILITY:
			if (lockedAbility != null)
				msgs = ((InternalEObject) lockedAbility).eInverseRemove(this,
						GeneratorPackage.ABILITY__LOCKING_EQUIPMENT, Ability.class, msgs);
			return basicSetLockedAbility((Ability) otherEnd, msgs);
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
		case GeneratorPackage.EQUIPMENT__LOCKED_ABILITY:
			return basicSetLockedAbility(null, msgs);
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
		case GeneratorPackage.EQUIPMENT__ID:
			return getID();
		case GeneratorPackage.EQUIPMENT__LOCKED_ABILITY:
			if (resolve)
				return getLockedAbility();
			return basicGetLockedAbility();
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
		case GeneratorPackage.EQUIPMENT__ID:
			setID((String) newValue);
			return;
		case GeneratorPackage.EQUIPMENT__LOCKED_ABILITY:
			setLockedAbility((Ability) newValue);
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
		case GeneratorPackage.EQUIPMENT__ID:
			setID(ID_EDEFAULT);
			return;
		case GeneratorPackage.EQUIPMENT__LOCKED_ABILITY:
			setLockedAbility((Ability) null);
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
		case GeneratorPackage.EQUIPMENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GeneratorPackage.EQUIPMENT__LOCKED_ABILITY:
			return lockedAbility != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EquipmentImpl
