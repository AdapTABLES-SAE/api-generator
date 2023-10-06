/**
 */
package generator.impl;

import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import generator.Ability;
import generator.Equipment;
import generator.GeneratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.AbilityImpl#getName <em>Name</em>}</li>
 *   <li>{@link generator.impl.AbilityImpl#getLockingEquipment <em>Locking Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbilityImpl extends MinimalEObjectImpl.Container implements Ability {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLockingEquipment() <em>Locking Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockingEquipment()
	 * @generated
	 * @ordered
	 */
	protected Equipment lockingEquipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ABILITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment getLockingEquipment() {
		if (lockingEquipment != null && lockingEquipment.eIsProxy()) {
			InternalEObject oldLockingEquipment = (InternalEObject) lockingEquipment;
			lockingEquipment = (Equipment) eResolveProxy(oldLockingEquipment);
			if (lockingEquipment != oldLockingEquipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.ABILITY__LOCKING_EQUIPMENT, oldLockingEquipment, lockingEquipment));
			}
		}
		return lockingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment basicGetLockingEquipment() {
		return lockingEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLockingEquipment(Equipment newLockingEquipment, NotificationChain msgs) {
		Equipment oldLockingEquipment = lockingEquipment;
		lockingEquipment = newLockingEquipment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.ABILITY__LOCKING_EQUIPMENT, oldLockingEquipment, newLockingEquipment);
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
	public void setLockingEquipment(Equipment newLockingEquipment) {
		if (newLockingEquipment != lockingEquipment) {
			NotificationChain msgs = null;
			if (lockingEquipment != null)
				msgs = ((InternalEObject) lockingEquipment).eInverseRemove(this,
						GeneratorPackage.EQUIPMENT__LOCKED_ABILITIES, Equipment.class, msgs);
			if (newLockingEquipment != null)
				msgs = ((InternalEObject) newLockingEquipment).eInverseAdd(this,
						GeneratorPackage.EQUIPMENT__LOCKED_ABILITIES, Equipment.class, msgs);
			msgs = basicSetLockingEquipment(newLockingEquipment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ABILITY__LOCKING_EQUIPMENT,
					newLockingEquipment, newLockingEquipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.ABILITY__LOCKING_EQUIPMENT:
			if (lockingEquipment != null)
				msgs = ((InternalEObject) lockingEquipment).eInverseRemove(this,
						GeneratorPackage.EQUIPMENT__LOCKED_ABILITIES, Equipment.class, msgs);
			return basicSetLockingEquipment((Equipment) otherEnd, msgs);
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
		case GeneratorPackage.ABILITY__LOCKING_EQUIPMENT:
			return basicSetLockingEquipment(null, msgs);
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
		case GeneratorPackage.ABILITY__NAME:
			return getName();
		case GeneratorPackage.ABILITY__LOCKING_EQUIPMENT:
			if (resolve)
				return getLockingEquipment();
			return basicGetLockingEquipment();
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
		case GeneratorPackage.ABILITY__NAME:
			setName((String) newValue);
			return;
		case GeneratorPackage.ABILITY__LOCKING_EQUIPMENT:
			setLockingEquipment((Equipment) newValue);
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
		case GeneratorPackage.ABILITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GeneratorPackage.ABILITY__LOCKING_EQUIPMENT:
			setLockingEquipment((Equipment) null);
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
		case GeneratorPackage.ABILITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GeneratorPackage.ABILITY__LOCKING_EQUIPMENT:
			return lockingEquipment != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(lockingEquipment, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbilityImpl other = (AbilityImpl) obj;
		return Objects.equals(name, other.name);
	}

} //AbilityImpl
