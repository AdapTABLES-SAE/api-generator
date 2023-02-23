/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.UniqueAnswerElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unique Answer Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.UniqueAnswerElementImpl#getDisplayValue <em>Display Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniqueAnswerElementImpl extends PositionedElementImpl implements UniqueAnswerElement {
	/**
	 * The default value of the '{@link #getDisplayValue() <em>Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayValue() <em>Display Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayValue()
	 * @generated
	 * @ordered
	 */
	protected String displayValue = DISPLAY_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueAnswerElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.UNIQUE_ANSWER_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayValue() {
		return displayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayValue(String newDisplayValue) {
		String oldDisplayValue = displayValue;
		displayValue = newDisplayValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.UNIQUE_ANSWER_ELEMENT__DISPLAY_VALUE,
					oldDisplayValue, displayValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.UNIQUE_ANSWER_ELEMENT__DISPLAY_VALUE:
			return getDisplayValue();
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
		case GeneratorPackage.UNIQUE_ANSWER_ELEMENT__DISPLAY_VALUE:
			setDisplayValue((String) newValue);
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
		case GeneratorPackage.UNIQUE_ANSWER_ELEMENT__DISPLAY_VALUE:
			setDisplayValue(DISPLAY_VALUE_EDEFAULT);
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
		case GeneratorPackage.UNIQUE_ANSWER_ELEMENT__DISPLAY_VALUE:
			return DISPLAY_VALUE_EDEFAULT == null ? displayValue != null : !DISPLAY_VALUE_EDEFAULT.equals(displayValue);
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
		result.append(" (displayValue: ");
		result.append(displayValue);
		result.append(')');
		return result.toString();
	}

} //UniqueAnswerElementImpl
