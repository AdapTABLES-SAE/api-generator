/**
 */
package generator.impl;

import generator.AvatarActions;
import generator.CoreGameRule;
import generator.ElementType;
import generator.GPBricks;
import generator.GeneratorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core Game Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.CoreGameRuleImpl#getRuleType <em>Rule Type</em>}</li>
 *   <li>{@link generator.impl.CoreGameRuleImpl#getActionToDo <em>Action To Do</em>}</li>
 *   <li>{@link generator.impl.CoreGameRuleImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreGameRuleImpl extends MinimalEObjectImpl.Container implements CoreGameRule {
	/**
	 * The default value of the '{@link #getRuleType() <em>Rule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleType()
	 * @generated
	 * @ordered
	 */
	protected static final GPBricks RULE_TYPE_EDEFAULT = GPBricks.MOVE;

	/**
	 * The cached value of the '{@link #getRuleType() <em>Rule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleType()
	 * @generated
	 * @ordered
	 */
	protected GPBricks ruleType = RULE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionToDo() <em>Action To Do</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionToDo()
	 * @generated
	 * @ordered
	 */
	protected static final AvatarActions ACTION_TO_DO_EDEFAULT = AvatarActions.WALK_RUN;

	/**
	 * The cached value of the '{@link #getActionToDo() <em>Action To Do</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionToDo()
	 * @generated
	 * @ordered
	 */
	protected AvatarActions actionToDo = ACTION_TO_DO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected ElementType element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreGameRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.CORE_GAME_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPBricks getRuleType() {
		return ruleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleType(GPBricks newRuleType) {
		GPBricks oldRuleType = ruleType;
		ruleType = newRuleType == null ? RULE_TYPE_EDEFAULT : newRuleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CORE_GAME_RULE__RULE_TYPE,
					oldRuleType, ruleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvatarActions getActionToDo() {
		return actionToDo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionToDo(AvatarActions newActionToDo) {
		AvatarActions oldActionToDo = actionToDo;
		actionToDo = newActionToDo == null ? ACTION_TO_DO_EDEFAULT : newActionToDo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CORE_GAME_RULE__ACTION_TO_DO,
					oldActionToDo, actionToDo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject) element;
			element = (ElementType) eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.CORE_GAME_RULE__ELEMENT,
							oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(ElementType newElement) {
		ElementType oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CORE_GAME_RULE__ELEMENT, oldElement,
					element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.CORE_GAME_RULE__RULE_TYPE:
			return getRuleType();
		case GeneratorPackage.CORE_GAME_RULE__ACTION_TO_DO:
			return getActionToDo();
		case GeneratorPackage.CORE_GAME_RULE__ELEMENT:
			if (resolve)
				return getElement();
			return basicGetElement();
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
		case GeneratorPackage.CORE_GAME_RULE__RULE_TYPE:
			setRuleType((GPBricks) newValue);
			return;
		case GeneratorPackage.CORE_GAME_RULE__ACTION_TO_DO:
			setActionToDo((AvatarActions) newValue);
			return;
		case GeneratorPackage.CORE_GAME_RULE__ELEMENT:
			setElement((ElementType) newValue);
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
		case GeneratorPackage.CORE_GAME_RULE__RULE_TYPE:
			setRuleType(RULE_TYPE_EDEFAULT);
			return;
		case GeneratorPackage.CORE_GAME_RULE__ACTION_TO_DO:
			setActionToDo(ACTION_TO_DO_EDEFAULT);
			return;
		case GeneratorPackage.CORE_GAME_RULE__ELEMENT:
			setElement((ElementType) null);
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
		case GeneratorPackage.CORE_GAME_RULE__RULE_TYPE:
			return ruleType != RULE_TYPE_EDEFAULT;
		case GeneratorPackage.CORE_GAME_RULE__ACTION_TO_DO:
			return actionToDo != ACTION_TO_DO_EDEFAULT;
		case GeneratorPackage.CORE_GAME_RULE__ELEMENT:
			return element != null;
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
		result.append(" (ruleType: ");
		result.append(ruleType);
		result.append(", actionToDo: ");
		result.append(actionToDo);
		result.append(')');
		return result.toString();
	}

} //CoreGameRuleImpl
