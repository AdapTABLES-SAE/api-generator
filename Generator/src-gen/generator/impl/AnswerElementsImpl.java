/**
 */
package generator.impl;

import generator.AnswerElements;
import generator.GeneratorPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Answer Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.AnswerElementsImpl#isSingleAnswer <em>Single Answer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnswerElementsImpl extends CoreGPElementImpl implements AnswerElements {
	/**
	 * The default value of the '{@link #isSingleAnswer() <em>Single Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleAnswer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINGLE_ANSWER_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isSingleAnswer() <em>Single Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleAnswer()
	 * @generated
	 * @ordered
	 */
	protected boolean singleAnswer = SINGLE_ANSWER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.ANSWER_ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingleAnswer() {
		return singleAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleAnswer(boolean newSingleAnswer) {
		boolean oldSingleAnswer = singleAnswer;
		singleAnswer = newSingleAnswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.ANSWER_ELEMENTS__SINGLE_ANSWER,
					oldSingleAnswer, singleAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.ANSWER_ELEMENTS__SINGLE_ANSWER:
			return isSingleAnswer();
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
		case GeneratorPackage.ANSWER_ELEMENTS__SINGLE_ANSWER:
			setSingleAnswer((Boolean) newValue);
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
		case GeneratorPackage.ANSWER_ELEMENTS__SINGLE_ANSWER:
			setSingleAnswer(SINGLE_ANSWER_EDEFAULT);
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
		case GeneratorPackage.ANSWER_ELEMENTS__SINGLE_ANSWER:
			return singleAnswer != SINGLE_ANSWER_EDEFAULT;
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
		result.append(" (singleAnswer: ");
		result.append(singleAnswer);
		result.append(')');
		return result.toString();
	}

} //AnswerElementsImpl
