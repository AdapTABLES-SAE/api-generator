/**
 */
package generator.impl;

import generator.EActiveAbility;
import generator.GPBricks;
import generator.GameRule;
import generator.GeneratorPackage;
import generator.InteractionEType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.GameRuleImpl#getType <em>Type</em>}</li>
 *   <li>{@link generator.impl.GameRuleImpl#getAbility2activate <em>Ability2activate</em>}</li>
 *   <li>{@link generator.impl.GameRuleImpl#getInteractionelementtype <em>Interactionelementtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameRuleImpl extends MinimalEObjectImpl.Container implements GameRule {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final GPBricks TYPE_EDEFAULT = GPBricks.MOVE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected GPBricks type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbility2activate() <em>Ability2activate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbility2activate()
	 * @generated
	 * @ordered
	 */
	protected static final EActiveAbility ABILITY2ACTIVATE_EDEFAULT = EActiveAbility.PORTABLE;

	/**
	 * The cached value of the '{@link #getAbility2activate() <em>Ability2activate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbility2activate()
	 * @generated
	 * @ordered
	 */
	protected EActiveAbility ability2activate = ABILITY2ACTIVATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInteractionelementtype() <em>Interactionelementtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionelementtype()
	 * @generated
	 * @ordered
	 */
	protected InteractionEType interactionelementtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.GAME_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPBricks getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(GPBricks newType) {
		GPBricks oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAME_RULE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EActiveAbility getAbility2activate() {
		return ability2activate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbility2activate(EActiveAbility newAbility2activate) {
		EActiveAbility oldAbility2activate = ability2activate;
		ability2activate = newAbility2activate == null ? ABILITY2ACTIVATE_EDEFAULT : newAbility2activate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAME_RULE__ABILITY2ACTIVATE,
					oldAbility2activate, ability2activate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionEType getInteractionelementtype() {
		if (interactionelementtype != null && interactionelementtype.eIsProxy()) {
			InternalEObject oldInteractionelementtype = (InternalEObject) interactionelementtype;
			interactionelementtype = (InteractionEType) eResolveProxy(oldInteractionelementtype);
			if (interactionelementtype != oldInteractionelementtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.GAME_RULE__INTERACTIONELEMENTTYPE, oldInteractionelementtype,
							interactionelementtype));
			}
		}
		return interactionelementtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionEType basicGetInteractionelementtype() {
		return interactionelementtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionelementtype(InteractionEType newInteractionelementtype) {
		InteractionEType oldInteractionelementtype = interactionelementtype;
		interactionelementtype = newInteractionelementtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GAME_RULE__INTERACTIONELEMENTTYPE,
					oldInteractionelementtype, interactionelementtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.GAME_RULE__TYPE:
			return getType();
		case GeneratorPackage.GAME_RULE__ABILITY2ACTIVATE:
			return getAbility2activate();
		case GeneratorPackage.GAME_RULE__INTERACTIONELEMENTTYPE:
			if (resolve)
				return getInteractionelementtype();
			return basicGetInteractionelementtype();
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
		case GeneratorPackage.GAME_RULE__TYPE:
			setType((GPBricks) newValue);
			return;
		case GeneratorPackage.GAME_RULE__ABILITY2ACTIVATE:
			setAbility2activate((EActiveAbility) newValue);
			return;
		case GeneratorPackage.GAME_RULE__INTERACTIONELEMENTTYPE:
			setInteractionelementtype((InteractionEType) newValue);
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
		case GeneratorPackage.GAME_RULE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case GeneratorPackage.GAME_RULE__ABILITY2ACTIVATE:
			setAbility2activate(ABILITY2ACTIVATE_EDEFAULT);
			return;
		case GeneratorPackage.GAME_RULE__INTERACTIONELEMENTTYPE:
			setInteractionelementtype((InteractionEType) null);
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
		case GeneratorPackage.GAME_RULE__TYPE:
			return type != TYPE_EDEFAULT;
		case GeneratorPackage.GAME_RULE__ABILITY2ACTIVATE:
			return ability2activate != ABILITY2ACTIVATE_EDEFAULT;
		case GeneratorPackage.GAME_RULE__INTERACTIONELEMENTTYPE:
			return interactionelementtype != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", ability2activate: ");
		result.append(ability2activate);
		result.append(')');
		return result.toString();
	}

} //GameRuleImpl
