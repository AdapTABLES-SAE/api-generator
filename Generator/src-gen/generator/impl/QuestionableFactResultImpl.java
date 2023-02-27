/**
 */
package generator.impl;

import generator.GeneratorPackage;
import generator.QuestionableFactResult;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionable Fact Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.QuestionableFactResultImpl#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link generator.impl.QuestionableFactResultImpl#isAnswerValid <em>Answer Valid</em>}</li>
 *   <li>{@link generator.impl.QuestionableFactResultImpl#getGivenAnswers <em>Given Answers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionableFactResultImpl extends MinimalEObjectImpl.Container implements QuestionableFactResult {
	/**
	 * The default value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final int RESPONSE_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResponseTime() <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTime()
	 * @generated
	 * @ordered
	 */
	protected int responseTime = RESPONSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnswerValid() <em>Answer Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnswerValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANSWER_VALID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnswerValid() <em>Answer Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnswerValid()
	 * @generated
	 * @ordered
	 */
	protected boolean answerValid = ANSWER_VALID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGivenAnswers() <em>Given Answers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenAnswers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> givenAnswers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionableFactResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.QUESTIONABLE_FACT_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResponseTime() {
		return responseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseTime(int newResponseTime) {
		int oldResponseTime = responseTime;
		responseTime = newResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.QUESTIONABLE_FACT_RESULT__RESPONSE_TIME, oldResponseTime, responseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAnswerValid() {
		return answerValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerValid(boolean newAnswerValid) {
		boolean oldAnswerValid = answerValid;
		answerValid = newAnswerValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.QUESTIONABLE_FACT_RESULT__ANSWER_VALID, oldAnswerValid, answerValid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getGivenAnswers() {
		if (givenAnswers == null) {
			givenAnswers = new EDataTypeUniqueEList<String>(String.class, this,
					GeneratorPackage.QUESTIONABLE_FACT_RESULT__GIVEN_ANSWERS);
		}
		return givenAnswers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.QUESTIONABLE_FACT_RESULT__RESPONSE_TIME:
			return getResponseTime();
		case GeneratorPackage.QUESTIONABLE_FACT_RESULT__ANSWER_VALID:
			return isAnswerValid();
		case GeneratorPackage.QUESTIONABLE_FACT_RESULT__GIVEN_ANSWERS:
			return getGivenAnswers();
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
		case GeneratorPackage.QUESTIONABLE_FACT_RESULT__RESPONSE_TIME:
			setResponseTime((Integer) newValue);
			return;
		case GeneratorPackage.QUESTIONABLE_FACT_RESULT__ANSWER_VALID:
			setAnswerValid((Boolean) newValue);
			return;
		case GeneratorPackage.QUESTIONABLE_FACT_RESULT__GIVEN_ANSWERS:
			getGivenAnswers().clear();
			getGivenAnswers().addAll((Collection<? extends String>) newValue);
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
		case GeneratorPackage.QUESTIONABLE_FACT_RESULT__RESPONSE_TIME:
			setResponseTime(RESPONSE_TIME_EDEFAULT);
			return;
		case GeneratorPackage.QUESTIONABLE_FACT_RESULT__ANSWER_VALID:
			setAnswerValid(ANSWER_VALID_EDEFAULT);
			return;
		case GeneratorPackage.QUESTIONABLE_FACT_RESULT__GIVEN_ANSWERS:
			getGivenAnswers().clear();
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
		case GeneratorPackage.QUESTIONABLE_FACT_RESULT__RESPONSE_TIME:
			return responseTime != RESPONSE_TIME_EDEFAULT;
		case GeneratorPackage.QUESTIONABLE_FACT_RESULT__ANSWER_VALID:
			return answerValid != ANSWER_VALID_EDEFAULT;
		case GeneratorPackage.QUESTIONABLE_FACT_RESULT__GIVEN_ANSWERS:
			return givenAnswers != null && !givenAnswers.isEmpty();
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
		result.append(" (responseTime: ");
		result.append(responseTime);
		result.append(", answerValid: ");
		result.append(answerValid);
		result.append(", givenAnswers: ");
		result.append(givenAnswers);
		result.append(')');
		return result.toString();
	}

} //QuestionableFactResultImpl
