/**
 */
package generator.impl;

import generator.Condition;
import generator.EBoundary;
import generator.EModality;
import generator.GeneratorPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.ConditionImpl#getNbFacts <em>Nb Facts</em>}</li>
 *   <li>{@link generator.impl.ConditionImpl#getNbExpectedAnswers <em>Nb Expected Answers</em>}</li>
 *   <li>{@link generator.impl.ConditionImpl#getAnswerModality <em>Answer Modality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The default value of the '{@link #getNbFacts() <em>Nb Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbFacts()
	 * @generated
	 * @ordered
	 */
	protected static final EBoundary NB_FACTS_EDEFAULT = EBoundary.ONE;

	/**
	 * The cached value of the '{@link #getNbFacts() <em>Nb Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbFacts()
	 * @generated
	 * @ordered
	 */
	protected EBoundary nbFacts = NB_FACTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbExpectedAnswers() <em>Nb Expected Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbExpectedAnswers()
	 * @generated
	 * @ordered
	 */
	protected static final EBoundary NB_EXPECTED_ANSWERS_EDEFAULT = EBoundary.ONE;

	/**
	 * The cached value of the '{@link #getNbExpectedAnswers() <em>Nb Expected Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbExpectedAnswers()
	 * @generated
	 * @ordered
	 */
	protected EBoundary nbExpectedAnswers = NB_EXPECTED_ANSWERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnswerModality() <em>Answer Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerModality()
	 * @generated
	 * @ordered
	 */
	protected static final EModality ANSWER_MODALITY_EDEFAULT = EModality.CHOICE;

	/**
	 * The cached value of the '{@link #getAnswerModality() <em>Answer Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerModality()
	 * @generated
	 * @ordered
	 */
	protected EModality answerModality = ANSWER_MODALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBoundary getNbFacts() {
		return nbFacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbFacts(EBoundary newNbFacts) {
		EBoundary oldNbFacts = nbFacts;
		nbFacts = newNbFacts == null ? NB_FACTS_EDEFAULT : newNbFacts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CONDITION__NB_FACTS, oldNbFacts,
					nbFacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBoundary getNbExpectedAnswers() {
		return nbExpectedAnswers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbExpectedAnswers(EBoundary newNbExpectedAnswers) {
		EBoundary oldNbExpectedAnswers = nbExpectedAnswers;
		nbExpectedAnswers = newNbExpectedAnswers == null ? NB_EXPECTED_ANSWERS_EDEFAULT : newNbExpectedAnswers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CONDITION__NB_EXPECTED_ANSWERS,
					oldNbExpectedAnswers, nbExpectedAnswers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EModality getAnswerModality() {
		return answerModality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerModality(EModality newAnswerModality) {
		EModality oldAnswerModality = answerModality;
		answerModality = newAnswerModality == null ? ANSWER_MODALITY_EDEFAULT : newAnswerModality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.CONDITION__ANSWER_MODALITY,
					oldAnswerModality, answerModality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GeneratorPackage.CONDITION__NB_FACTS:
			return getNbFacts();
		case GeneratorPackage.CONDITION__NB_EXPECTED_ANSWERS:
			return getNbExpectedAnswers();
		case GeneratorPackage.CONDITION__ANSWER_MODALITY:
			return getAnswerModality();
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
		case GeneratorPackage.CONDITION__NB_FACTS:
			setNbFacts((EBoundary) newValue);
			return;
		case GeneratorPackage.CONDITION__NB_EXPECTED_ANSWERS:
			setNbExpectedAnswers((EBoundary) newValue);
			return;
		case GeneratorPackage.CONDITION__ANSWER_MODALITY:
			setAnswerModality((EModality) newValue);
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
		case GeneratorPackage.CONDITION__NB_FACTS:
			setNbFacts(NB_FACTS_EDEFAULT);
			return;
		case GeneratorPackage.CONDITION__NB_EXPECTED_ANSWERS:
			setNbExpectedAnswers(NB_EXPECTED_ANSWERS_EDEFAULT);
			return;
		case GeneratorPackage.CONDITION__ANSWER_MODALITY:
			setAnswerModality(ANSWER_MODALITY_EDEFAULT);
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
		case GeneratorPackage.CONDITION__NB_FACTS:
			return nbFacts != NB_FACTS_EDEFAULT;
		case GeneratorPackage.CONDITION__NB_EXPECTED_ANSWERS:
			return nbExpectedAnswers != NB_EXPECTED_ANSWERS_EDEFAULT;
		case GeneratorPackage.CONDITION__ANSWER_MODALITY:
			return answerModality != ANSWER_MODALITY_EDEFAULT;
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
		result.append(" (nbFacts: ");
		result.append(nbFacts);
		result.append(", nbExpectedAnswers: ");
		result.append(nbExpectedAnswers);
		result.append(", answerModality: ");
		result.append(answerModality);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
