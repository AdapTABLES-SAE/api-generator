/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.ManyAnswerElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Many Answer Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ManyAnswerElementImpl#getDisplayValues <em>Display Values</em>}</li>
 *   <li>{@link generator.impl.ManyAnswerElementImpl#getRightValue <em>Right Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManyAnswerElementImpl extends PositionedElementImpl implements ManyAnswerElement {
	/**
	 * The cached value of the '{@link #getDisplayValues() <em>Display Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> displayValues;

	/**
	 * The default value of the '{@link #getRightValue() <em>Right Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightValue()
	 * @generated
	 * @ordered
	 */
	protected static final String RIGHT_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRightValue() <em>Right Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightValue()
	 * @generated
	 * @ordered
	 */
	protected String rightValue = RIGHT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyAnswerElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.MANY_ANSWER_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDisplayValues() {
		if (displayValues == null) {
			displayValues = new EDataTypeUniqueEList<String>(String.class, this,
					GeneratorPackage.MANY_ANSWER_ELEMENT__DISPLAY_VALUES);
		}
		return displayValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRightValue() {
		return rightValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightValue(String newRightValue) {
		String oldRightValue = rightValue;
		rightValue = newRightValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.MANY_ANSWER_ELEMENT__RIGHT_VALUE,
					oldRightValue, rightValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.MANY_ANSWER_ELEMENT__DISPLAY_VALUES:
			return getDisplayValues();
		case GeneratorPackage.MANY_ANSWER_ELEMENT__RIGHT_VALUE:
			return getRightValue();
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
		case GeneratorPackage.MANY_ANSWER_ELEMENT__DISPLAY_VALUES:
			getDisplayValues().clear();
			getDisplayValues().addAll((Collection<? extends String>) newValue);
			return;
		case GeneratorPackage.MANY_ANSWER_ELEMENT__RIGHT_VALUE:
			setRightValue((String) newValue);
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
		case GeneratorPackage.MANY_ANSWER_ELEMENT__DISPLAY_VALUES:
			getDisplayValues().clear();
			return;
		case GeneratorPackage.MANY_ANSWER_ELEMENT__RIGHT_VALUE:
			setRightValue(RIGHT_VALUE_EDEFAULT);
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
		case GeneratorPackage.MANY_ANSWER_ELEMENT__DISPLAY_VALUES:
			return displayValues != null && !displayValues.isEmpty();
		case GeneratorPackage.MANY_ANSWER_ELEMENT__RIGHT_VALUE:
			return RIGHT_VALUE_EDEFAULT == null ? rightValue != null : !RIGHT_VALUE_EDEFAULT.equals(rightValue);
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
		result.append(" (displayValues: ");
		result.append(displayValues);
		result.append(", rightValue: ");
		result.append(rightValue);
		result.append(')');
		return result.toString();
	}

} //ManyAnswerElementImpl
