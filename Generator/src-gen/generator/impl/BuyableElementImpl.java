/**
 */
package generator.impl;

import generator.BuyableElement;
import generator.GeneratorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buyable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.BuyableElementImpl#isBought <em>Bought</em>}</li>
 *   <li>{@link generator.impl.BuyableElementImpl#isActivated <em>Activated</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BuyableElementImpl extends ElementImpl implements BuyableElement {
	/**
	 * The default value of the '{@link #isBought() <em>Bought</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBought()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOUGHT_EDEFAULT = false;

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
	protected static final boolean ACTIVATED_EDEFAULT = false;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuyableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.BUYABLE_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.BUYABLE_ELEMENT__BOUGHT, oldBought,
					bought));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.BUYABLE_ELEMENT__ACTIVATED,
					oldActivated, activated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.BUYABLE_ELEMENT__BOUGHT:
			return isBought();
		case GeneratorPackage.BUYABLE_ELEMENT__ACTIVATED:
			return isActivated();
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
		case GeneratorPackage.BUYABLE_ELEMENT__BOUGHT:
			setBought((Boolean) newValue);
			return;
		case GeneratorPackage.BUYABLE_ELEMENT__ACTIVATED:
			setActivated((Boolean) newValue);
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
		case GeneratorPackage.BUYABLE_ELEMENT__BOUGHT:
			setBought(BOUGHT_EDEFAULT);
			return;
		case GeneratorPackage.BUYABLE_ELEMENT__ACTIVATED:
			setActivated(ACTIVATED_EDEFAULT);
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
		case GeneratorPackage.BUYABLE_ELEMENT__BOUGHT:
			return bought != BOUGHT_EDEFAULT;
		case GeneratorPackage.BUYABLE_ELEMENT__ACTIVATED:
			return activated != ACTIVATED_EDEFAULT;
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

} //BuyableElementImpl
