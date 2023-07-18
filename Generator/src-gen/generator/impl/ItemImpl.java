/**
 */
package generator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import generator.Equipment;
import generator.GeneratorPackage;
import generator.Item;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ItemImpl#isBought <em>Bought</em>}</li>
 *   <li>{@link generator.impl.ItemImpl#isActivated <em>Activated</em>}</li>
 *   <li>{@link generator.impl.ItemImpl#getEquipment <em>Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item {
	/**
	 * The default value of the '{@link #isBought() <em>Bought</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBought()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOUGHT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isBought() <em>Bought</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBought()
	 * @generated
	 * @ordered
	 */
	protected boolean bought = BOUGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isActivated() <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVATED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isActivated() <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivated()
	 * @generated
	 * @ordered
	 */
	protected boolean activated = ACTIVATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEquipment() <em>Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipment()
	 * @generated
	 * @ordered
	 */
	protected Equipment equipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBought() {
		return bought;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBought(boolean newBought) {
		boolean oldBought = bought;
		bought = newBought;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ITEM__BOUGHT, oldBought, bought));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActivated() {
		return activated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivated(boolean newActivated) {
		boolean oldActivated = activated;
		activated = newActivated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ITEM__ACTIVATED, oldActivated,
					activated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment getEquipment() {
		if (equipment != null && equipment.eIsProxy()) {
			InternalEObject oldEquipment = (InternalEObject) equipment;
			equipment = (Equipment) eResolveProxy(oldEquipment);
			if (equipment != oldEquipment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.ITEM__EQUIPMENT,
							oldEquipment, equipment));
			}
		}
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment basicGetEquipment() {
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquipment(Equipment newEquipment) {
		Equipment oldEquipment = equipment;
		equipment = newEquipment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ITEM__EQUIPMENT, oldEquipment,
					equipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.ITEM__BOUGHT:
			return isBought();
		case GeneratorPackage.ITEM__ACTIVATED:
			return isActivated();
		case GeneratorPackage.ITEM__EQUIPMENT:
			if (resolve)
				return getEquipment();
			return basicGetEquipment();
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
		case GeneratorPackage.ITEM__BOUGHT:
			setBought((Boolean) newValue);
			return;
		case GeneratorPackage.ITEM__ACTIVATED:
			setActivated((Boolean) newValue);
			return;
		case GeneratorPackage.ITEM__EQUIPMENT:
			setEquipment((Equipment) newValue);
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
		case GeneratorPackage.ITEM__BOUGHT:
			setBought(BOUGHT_EDEFAULT);
			return;
		case GeneratorPackage.ITEM__ACTIVATED:
			setActivated(ACTIVATED_EDEFAULT);
			return;
		case GeneratorPackage.ITEM__EQUIPMENT:
			setEquipment((Equipment) null);
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
		case GeneratorPackage.ITEM__BOUGHT:
			return bought != BOUGHT_EDEFAULT;
		case GeneratorPackage.ITEM__ACTIVATED:
			return activated != ACTIVATED_EDEFAULT;
		case GeneratorPackage.ITEM__EQUIPMENT:
			return equipment != null;
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
		result.append(" (bought: ");
		result.append(bought);
		result.append(", activated: ");
		result.append(activated);
		result.append(')');
		return result.toString();
	}

} //ItemImpl
