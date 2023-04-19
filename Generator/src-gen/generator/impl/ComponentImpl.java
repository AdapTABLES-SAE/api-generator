/**
 */
package generator.impl;

import generator.Ability;
import generator.Component;
import generator.Correctness;
import generator.Display;
import generator.GeneratorPackage;
import generator.Quantity;
import generator.Size;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ComponentImpl#getAllowedAbility <em>Allowed Ability</em>}</li>
 *   <li>{@link generator.impl.ComponentImpl#getDisplayValue <em>Display Value</em>}</li>
 *   <li>{@link generator.impl.ComponentImpl#isWearChoices <em>Wear Choices</em>}</li>
 *   <li>{@link generator.impl.ComponentImpl#getDefaultCorrectness <em>Default Correctness</em>}</li>
 *   <li>{@link generator.impl.ComponentImpl#isWearStatement <em>Wear Statement</em>}</li>
 *   <li>{@link generator.impl.ComponentImpl#isInputEntry <em>Input Entry</em>}</li>
 *   <li>{@link generator.impl.ComponentImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link generator.impl.ComponentImpl#getExpectedSize <em>Expected Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends AComponentImpl implements Component {
	/**
	 * The cached value of the '{@link #getAllowedAbility() <em>Allowed Ability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedAbility()
	 * @generated
	 * @ordered
	 */
	protected Ability allowedAbility;

	/**
	 * The cached value of the '{@link #getDisplayValue() <em>Display Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayValue()
	 * @generated
	 * @ordered
	 */
	protected Display displayValue;

	/**
	 * The default value of the '{@link #isWearChoices() <em>Wear Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWearChoices()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WEAR_CHOICES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWearChoices() <em>Wear Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWearChoices()
	 * @generated
	 * @ordered
	 */
	protected boolean wearChoices = WEAR_CHOICES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultCorrectness() <em>Default Correctness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCorrectness()
	 * @generated
	 * @ordered
	 */
	protected Correctness defaultCorrectness;

	/**
	 * The default value of the '{@link #isWearStatement() <em>Wear Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWearStatement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WEAR_STATEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWearStatement() <em>Wear Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWearStatement()
	 * @generated
	 * @ordered
	 */
	protected boolean wearStatement = WEAR_STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isInputEntry() <em>Input Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInputEntry()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INPUT_ENTRY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInputEntry() <em>Input Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInputEntry()
	 * @generated
	 * @ordered
	 */
	protected boolean inputEntry = INPUT_ENTRY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getExpectedSize() <em>Expected Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedSize()
	 * @generated
	 * @ordered
	 */
	protected Size expectedSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability getAllowedAbility() {
		if (allowedAbility != null && allowedAbility.eIsProxy()) {
			InternalEObject oldAllowedAbility = (InternalEObject) allowedAbility;
			allowedAbility = (Ability) eResolveProxy(oldAllowedAbility);
			if (allowedAbility != oldAllowedAbility) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.COMPONENT__ALLOWED_ABILITY, oldAllowedAbility, allowedAbility));
			}
		}
		return allowedAbility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability basicGetAllowedAbility() {
		return allowedAbility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedAbility(Ability newAllowedAbility) {
		Ability oldAllowedAbility = allowedAbility;
		allowedAbility = newAllowedAbility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.COMPONENT__ALLOWED_ABILITY,
					oldAllowedAbility, allowedAbility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display getDisplayValue() {
		return displayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayValue(Display newDisplayValue, NotificationChain msgs) {
		Display oldDisplayValue = displayValue;
		displayValue = newDisplayValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.COMPONENT__DISPLAY_VALUE, oldDisplayValue, newDisplayValue);
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
	public void setDisplayValue(Display newDisplayValue) {
		if (newDisplayValue != displayValue) {
			NotificationChain msgs = null;
			if (displayValue != null)
				msgs = ((InternalEObject) displayValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.COMPONENT__DISPLAY_VALUE, null, msgs);
			if (newDisplayValue != null)
				msgs = ((InternalEObject) newDisplayValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.COMPONENT__DISPLAY_VALUE, null, msgs);
			msgs = basicSetDisplayValue(newDisplayValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.COMPONENT__DISPLAY_VALUE,
					newDisplayValue, newDisplayValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWearChoices() {
		return wearChoices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWearChoices(boolean newWearChoices) {
		boolean oldWearChoices = wearChoices;
		wearChoices = newWearChoices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.COMPONENT__WEAR_CHOICES,
					oldWearChoices, wearChoices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correctness getDefaultCorrectness() {
		return defaultCorrectness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultCorrectness(Correctness newDefaultCorrectness, NotificationChain msgs) {
		Correctness oldDefaultCorrectness = defaultCorrectness;
		defaultCorrectness = newDefaultCorrectness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.COMPONENT__DEFAULT_CORRECTNESS, oldDefaultCorrectness, newDefaultCorrectness);
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
	public void setDefaultCorrectness(Correctness newDefaultCorrectness) {
		if (newDefaultCorrectness != defaultCorrectness) {
			NotificationChain msgs = null;
			if (defaultCorrectness != null)
				msgs = ((InternalEObject) defaultCorrectness).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.COMPONENT__DEFAULT_CORRECTNESS, null, msgs);
			if (newDefaultCorrectness != null)
				msgs = ((InternalEObject) newDefaultCorrectness).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.COMPONENT__DEFAULT_CORRECTNESS, null, msgs);
			msgs = basicSetDefaultCorrectness(newDefaultCorrectness, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.COMPONENT__DEFAULT_CORRECTNESS,
					newDefaultCorrectness, newDefaultCorrectness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWearStatement() {
		return wearStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWearStatement(boolean newWearStatement) {
		boolean oldWearStatement = wearStatement;
		wearStatement = newWearStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.COMPONENT__WEAR_STATEMENT,
					oldWearStatement, wearStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInputEntry() {
		return inputEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputEntry(boolean newInputEntry) {
		boolean oldInputEntry = inputEntry;
		inputEntry = newInputEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.COMPONENT__INPUT_ENTRY,
					oldInputEntry, inputEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.COMPONENT__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject) quantity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.COMPONENT__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject) newQuantity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.COMPONENT__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.COMPONENT__QUANTITY, newQuantity,
					newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getExpectedSize() {
		return expectedSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpectedSize(Size newExpectedSize, NotificationChain msgs) {
		Size oldExpectedSize = expectedSize;
		expectedSize = newExpectedSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.COMPONENT__EXPECTED_SIZE, oldExpectedSize, newExpectedSize);
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
	public void setExpectedSize(Size newExpectedSize) {
		if (newExpectedSize != expectedSize) {
			NotificationChain msgs = null;
			if (expectedSize != null)
				msgs = ((InternalEObject) expectedSize).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.COMPONENT__EXPECTED_SIZE, null, msgs);
			if (newExpectedSize != null)
				msgs = ((InternalEObject) newExpectedSize).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.COMPONENT__EXPECTED_SIZE, null, msgs);
			msgs = basicSetExpectedSize(newExpectedSize, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.COMPONENT__EXPECTED_SIZE,
					newExpectedSize, newExpectedSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.COMPONENT__DISPLAY_VALUE:
			return basicSetDisplayValue(null, msgs);
		case GeneratorPackage.COMPONENT__DEFAULT_CORRECTNESS:
			return basicSetDefaultCorrectness(null, msgs);
		case GeneratorPackage.COMPONENT__QUANTITY:
			return basicSetQuantity(null, msgs);
		case GeneratorPackage.COMPONENT__EXPECTED_SIZE:
			return basicSetExpectedSize(null, msgs);
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
		case GeneratorPackage.COMPONENT__ALLOWED_ABILITY:
			if (resolve)
				return getAllowedAbility();
			return basicGetAllowedAbility();
		case GeneratorPackage.COMPONENT__DISPLAY_VALUE:
			return getDisplayValue();
		case GeneratorPackage.COMPONENT__WEAR_CHOICES:
			return isWearChoices();
		case GeneratorPackage.COMPONENT__DEFAULT_CORRECTNESS:
			return getDefaultCorrectness();
		case GeneratorPackage.COMPONENT__WEAR_STATEMENT:
			return isWearStatement();
		case GeneratorPackage.COMPONENT__INPUT_ENTRY:
			return isInputEntry();
		case GeneratorPackage.COMPONENT__QUANTITY:
			return getQuantity();
		case GeneratorPackage.COMPONENT__EXPECTED_SIZE:
			return getExpectedSize();
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
		case GeneratorPackage.COMPONENT__ALLOWED_ABILITY:
			setAllowedAbility((Ability) newValue);
			return;
		case GeneratorPackage.COMPONENT__DISPLAY_VALUE:
			setDisplayValue((Display) newValue);
			return;
		case GeneratorPackage.COMPONENT__WEAR_CHOICES:
			setWearChoices((Boolean) newValue);
			return;
		case GeneratorPackage.COMPONENT__DEFAULT_CORRECTNESS:
			setDefaultCorrectness((Correctness) newValue);
			return;
		case GeneratorPackage.COMPONENT__WEAR_STATEMENT:
			setWearStatement((Boolean) newValue);
			return;
		case GeneratorPackage.COMPONENT__INPUT_ENTRY:
			setInputEntry((Boolean) newValue);
			return;
		case GeneratorPackage.COMPONENT__QUANTITY:
			setQuantity((Quantity) newValue);
			return;
		case GeneratorPackage.COMPONENT__EXPECTED_SIZE:
			setExpectedSize((Size) newValue);
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
		case GeneratorPackage.COMPONENT__ALLOWED_ABILITY:
			setAllowedAbility((Ability) null);
			return;
		case GeneratorPackage.COMPONENT__DISPLAY_VALUE:
			setDisplayValue((Display) null);
			return;
		case GeneratorPackage.COMPONENT__WEAR_CHOICES:
			setWearChoices(WEAR_CHOICES_EDEFAULT);
			return;
		case GeneratorPackage.COMPONENT__DEFAULT_CORRECTNESS:
			setDefaultCorrectness((Correctness) null);
			return;
		case GeneratorPackage.COMPONENT__WEAR_STATEMENT:
			setWearStatement(WEAR_STATEMENT_EDEFAULT);
			return;
		case GeneratorPackage.COMPONENT__INPUT_ENTRY:
			setInputEntry(INPUT_ENTRY_EDEFAULT);
			return;
		case GeneratorPackage.COMPONENT__QUANTITY:
			setQuantity((Quantity) null);
			return;
		case GeneratorPackage.COMPONENT__EXPECTED_SIZE:
			setExpectedSize((Size) null);
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
		case GeneratorPackage.COMPONENT__ALLOWED_ABILITY:
			return allowedAbility != null;
		case GeneratorPackage.COMPONENT__DISPLAY_VALUE:
			return displayValue != null;
		case GeneratorPackage.COMPONENT__WEAR_CHOICES:
			return wearChoices != WEAR_CHOICES_EDEFAULT;
		case GeneratorPackage.COMPONENT__DEFAULT_CORRECTNESS:
			return defaultCorrectness != null;
		case GeneratorPackage.COMPONENT__WEAR_STATEMENT:
			return wearStatement != WEAR_STATEMENT_EDEFAULT;
		case GeneratorPackage.COMPONENT__INPUT_ENTRY:
			return inputEntry != INPUT_ENTRY_EDEFAULT;
		case GeneratorPackage.COMPONENT__QUANTITY:
			return quantity != null;
		case GeneratorPackage.COMPONENT__EXPECTED_SIZE:
			return expectedSize != null;
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
		result.append(" (wearChoices: ");
		result.append(wearChoices);
		result.append(", wearStatement: ");
		result.append(wearStatement);
		result.append(", inputEntry: ");
		result.append(inputEntry);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
