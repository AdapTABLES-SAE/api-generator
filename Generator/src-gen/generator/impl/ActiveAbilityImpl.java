/**
 */
package generator.impl;

import generator.ActiveAbility;
import generator.EActiveAbility;
import generator.GeneratorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Active Ability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ActiveAbilityImpl#getAbility <em>Ability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActiveAbilityImpl extends AbilityImpl implements ActiveAbility {
	/**
	 * The default value of the '{@link #getAbility() <em>Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbility()
	 * @generated
	 * @ordered
	 */
	protected static final EActiveAbility ABILITY_EDEFAULT = EActiveAbility.PORTABLE;

	/**
	 * The cached value of the '{@link #getAbility() <em>Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbility()
	 * @generated
	 * @ordered
	 */
	protected EActiveAbility ability = ABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveAbilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ACTIVE_ABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EActiveAbility getAbility() {
		return ability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbility(EActiveAbility newAbility) {
		EActiveAbility oldAbility = ability;
		ability = newAbility == null ? ABILITY_EDEFAULT : newAbility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ACTIVE_ABILITY__ABILITY, oldAbility,
					ability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.ACTIVE_ABILITY__ABILITY:
			return getAbility();
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
		case GeneratorPackage.ACTIVE_ABILITY__ABILITY:
			setAbility((EActiveAbility) newValue);
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
		case GeneratorPackage.ACTIVE_ABILITY__ABILITY:
			setAbility(ABILITY_EDEFAULT);
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
		case GeneratorPackage.ACTIVE_ABILITY__ABILITY:
			return ability != ABILITY_EDEFAULT;
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
		result.append(" (ability: ");
		result.append(ability);
		result.append(')');
		return result.toString();
	}

} //ActiveAbilityImpl
