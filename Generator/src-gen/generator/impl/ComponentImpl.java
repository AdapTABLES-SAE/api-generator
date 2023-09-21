/**
 */
package generator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import generator.Component;
import generator.Correctness;
import generator.Display;
import generator.GeneratorPackage;
import generator.Quantity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ComponentImpl#getDisplayValue <em>Display Value</em>}</li>
 *   <li>{@link generator.impl.ComponentImpl#getDefaultCorrectness <em>Default Correctness</em>}</li>
 *   <li>{@link generator.impl.ComponentImpl#isInputEntry <em>Input Entry</em>}</li>
 *   <li>{@link generator.impl.ComponentImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends AComponentImpl implements Component {
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
	 * The cached value of the '{@link #getDefaultCorrectness() <em>Default Correctness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCorrectness()
	 * @generated
	 * @ordered
	 */
	protected Correctness defaultCorrectness;

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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.COMPONENT__DISPLAY_VALUE:
			return basicSetDisplayValue(null, msgs);
		case GeneratorPackage.COMPONENT__DEFAULT_CORRECTNESS:
			return basicSetDefaultCorrectness(null, msgs);
		case GeneratorPackage.COMPONENT__QUANTITY:
			return basicSetQuantity(null, msgs);
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
		case GeneratorPackage.COMPONENT__DISPLAY_VALUE:
			return getDisplayValue();
		case GeneratorPackage.COMPONENT__DEFAULT_CORRECTNESS:
			return getDefaultCorrectness();
		case GeneratorPackage.COMPONENT__INPUT_ENTRY:
			return isInputEntry();
		case GeneratorPackage.COMPONENT__QUANTITY:
			return getQuantity();
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
		case GeneratorPackage.COMPONENT__DISPLAY_VALUE:
			setDisplayValue((Display) newValue);
			return;
		case GeneratorPackage.COMPONENT__DEFAULT_CORRECTNESS:
			setDefaultCorrectness((Correctness) newValue);
			return;
		case GeneratorPackage.COMPONENT__INPUT_ENTRY:
			setInputEntry((Boolean) newValue);
			return;
		case GeneratorPackage.COMPONENT__QUANTITY:
			setQuantity((Quantity) newValue);
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
		case GeneratorPackage.COMPONENT__DISPLAY_VALUE:
			setDisplayValue((Display) null);
			return;
		case GeneratorPackage.COMPONENT__DEFAULT_CORRECTNESS:
			setDefaultCorrectness((Correctness) null);
			return;
		case GeneratorPackage.COMPONENT__INPUT_ENTRY:
			setInputEntry(INPUT_ENTRY_EDEFAULT);
			return;
		case GeneratorPackage.COMPONENT__QUANTITY:
			setQuantity((Quantity) null);
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
		case GeneratorPackage.COMPONENT__DISPLAY_VALUE:
			return displayValue != null;
		case GeneratorPackage.COMPONENT__DEFAULT_CORRECTNESS:
			return defaultCorrectness != null;
		case GeneratorPackage.COMPONENT__INPUT_ENTRY:
			return inputEntry != INPUT_ENTRY_EDEFAULT;
		case GeneratorPackage.COMPONENT__QUANTITY:
			return quantity != null;
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
		result.append(" (inputEntry: ");
		result.append(inputEntry);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
