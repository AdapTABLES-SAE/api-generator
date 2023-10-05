/**
 */
package generator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import generator.AQuestionParam;
import generator.AQuestionableFact;
import generator.EntrySoluceParam;
import generator.FactCorrectnessParam;
import generator.GeneratorPackage;
import generator.PropositionParam;
import generator.QuestionedFact;
import generator.WantedAnswersParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questioned Fact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.QuestionedFactImpl#getQuestionablefact <em>Questionablefact</em>}</li>
 *   <li>{@link generator.impl.QuestionedFactImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link generator.impl.QuestionedFactImpl#getPropositions <em>Propositions</em>}</li>
 *   <li>{@link generator.impl.QuestionedFactImpl#getEntrys <em>Entrys</em>}</li>
 *   <li>{@link generator.impl.QuestionedFactImpl#getCorrectnessToReach <em>Correctness To Reach</em>}</li>
 *   <li>{@link generator.impl.QuestionedFactImpl#isLearnerValidation <em>Learner Validation</em>}</li>
 *   <li>{@link generator.impl.QuestionedFactImpl#getFactCorrectness <em>Fact Correctness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionedFactImpl extends MinimalEObjectImpl.Container implements QuestionedFact {
	/**
	 * The cached value of the '{@link #getQuestionablefact() <em>Questionablefact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionablefact()
	 * @generated
	 * @ordered
	 */
	protected AQuestionableFact questionablefact;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected AQuestionParam question;

	/**
	 * The cached value of the '{@link #getPropositions() <em>Propositions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropositions()
	 * @generated
	 * @ordered
	 */
	protected EList<PropositionParam> propositions;

	/**
	 * The cached value of the '{@link #getEntrys() <em>Entrys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrys()
	 * @generated
	 * @ordered
	 */
	protected EList<EntrySoluceParam> entrys;

	/**
	 * The cached value of the '{@link #getCorrectnessToReach() <em>Correctness To Reach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectnessToReach()
	 * @generated
	 * @ordered
	 */
	protected WantedAnswersParam correctnessToReach;

	/**
	 * The default value of the '{@link #isLearnerValidation() <em>Learner Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLearnerValidation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEARNER_VALIDATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLearnerValidation() <em>Learner Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLearnerValidation()
	 * @generated
	 * @ordered
	 */
	protected boolean learnerValidation = LEARNER_VALIDATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFactCorrectness() <em>Fact Correctness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactCorrectness()
	 * @generated
	 * @ordered
	 */
	protected FactCorrectnessParam factCorrectness;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionedFactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.QUESTIONED_FACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AQuestionableFact getQuestionablefact() {
		if (questionablefact != null && questionablefact.eIsProxy()) {
			InternalEObject oldQuestionablefact = (InternalEObject) questionablefact;
			questionablefact = (AQuestionableFact) eResolveProxy(oldQuestionablefact);
			if (questionablefact != oldQuestionablefact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GeneratorPackage.QUESTIONED_FACT__QUESTIONABLEFACT, oldQuestionablefact, questionablefact));
			}
		}
		return questionablefact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AQuestionableFact basicGetQuestionablefact() {
		return questionablefact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionablefact(AQuestionableFact newQuestionablefact) {
		AQuestionableFact oldQuestionablefact = questionablefact;
		questionablefact = newQuestionablefact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTIONED_FACT__QUESTIONABLEFACT,
					oldQuestionablefact, questionablefact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AQuestionParam getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestion(AQuestionParam newQuestion, NotificationChain msgs) {
		AQuestionParam oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.QUESTIONED_FACT__QUESTION, oldQuestion, newQuestion);
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
	public void setQuestion(AQuestionParam newQuestion) {
		if (newQuestion != question) {
			NotificationChain msgs = null;
			if (question != null)
				msgs = ((InternalEObject) question).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.QUESTIONED_FACT__QUESTION, null, msgs);
			if (newQuestion != null)
				msgs = ((InternalEObject) newQuestion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.QUESTIONED_FACT__QUESTION, null, msgs);
			msgs = basicSetQuestion(newQuestion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTIONED_FACT__QUESTION,
					newQuestion, newQuestion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropositionParam> getPropositions() {
		if (propositions == null) {
			propositions = new EObjectContainmentEList<PropositionParam>(PropositionParam.class, this,
					GeneratorPackage.QUESTIONED_FACT__PROPOSITIONS);
		}
		return propositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntrySoluceParam> getEntrys() {
		if (entrys == null) {
			entrys = new EObjectContainmentEList<EntrySoluceParam>(EntrySoluceParam.class, this,
					GeneratorPackage.QUESTIONED_FACT__ENTRYS);
		}
		return entrys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WantedAnswersParam getCorrectnessToReach() {
		return correctnessToReach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrectnessToReach(WantedAnswersParam newCorrectnessToReach,
			NotificationChain msgs) {
		WantedAnswersParam oldCorrectnessToReach = correctnessToReach;
		correctnessToReach = newCorrectnessToReach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.QUESTIONED_FACT__CORRECTNESS_TO_REACH, oldCorrectnessToReach,
					newCorrectnessToReach);
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
	public void setCorrectnessToReach(WantedAnswersParam newCorrectnessToReach) {
		if (newCorrectnessToReach != correctnessToReach) {
			NotificationChain msgs = null;
			if (correctnessToReach != null)
				msgs = ((InternalEObject) correctnessToReach).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.QUESTIONED_FACT__CORRECTNESS_TO_REACH, null, msgs);
			if (newCorrectnessToReach != null)
				msgs = ((InternalEObject) newCorrectnessToReach).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.QUESTIONED_FACT__CORRECTNESS_TO_REACH, null, msgs);
			msgs = basicSetCorrectnessToReach(newCorrectnessToReach, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.QUESTIONED_FACT__CORRECTNESS_TO_REACH, newCorrectnessToReach,
					newCorrectnessToReach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLearnerValidation() {
		return learnerValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLearnerValidation(boolean newLearnerValidation) {
		boolean oldLearnerValidation = learnerValidation;
		learnerValidation = newLearnerValidation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTIONED_FACT__LEARNER_VALIDATION,
					oldLearnerValidation, learnerValidation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactCorrectnessParam getFactCorrectness() {
		return factCorrectness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactCorrectness(FactCorrectnessParam newFactCorrectness, NotificationChain msgs) {
		FactCorrectnessParam oldFactCorrectness = factCorrectness;
		factCorrectness = newFactCorrectness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GeneratorPackage.QUESTIONED_FACT__FACT_CORRECTNESS, oldFactCorrectness, newFactCorrectness);
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
	public void setFactCorrectness(FactCorrectnessParam newFactCorrectness) {
		if (newFactCorrectness != factCorrectness) {
			NotificationChain msgs = null;
			if (factCorrectness != null)
				msgs = ((InternalEObject) factCorrectness).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.QUESTIONED_FACT__FACT_CORRECTNESS, null, msgs);
			if (newFactCorrectness != null)
				msgs = ((InternalEObject) newFactCorrectness).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GeneratorPackage.QUESTIONED_FACT__FACT_CORRECTNESS, null, msgs);
			msgs = basicSetFactCorrectness(newFactCorrectness, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.QUESTIONED_FACT__FACT_CORRECTNESS,
					newFactCorrectness, newFactCorrectness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GeneratorPackage.QUESTIONED_FACT__QUESTION:
			return basicSetQuestion(null, msgs);
		case GeneratorPackage.QUESTIONED_FACT__PROPOSITIONS:
			return ((InternalEList<?>) getPropositions()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.QUESTIONED_FACT__ENTRYS:
			return ((InternalEList<?>) getEntrys()).basicRemove(otherEnd, msgs);
		case GeneratorPackage.QUESTIONED_FACT__CORRECTNESS_TO_REACH:
			return basicSetCorrectnessToReach(null, msgs);
		case GeneratorPackage.QUESTIONED_FACT__FACT_CORRECTNESS:
			return basicSetFactCorrectness(null, msgs);
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
		case GeneratorPackage.QUESTIONED_FACT__QUESTIONABLEFACT:
			if (resolve)
				return getQuestionablefact();
			return basicGetQuestionablefact();
		case GeneratorPackage.QUESTIONED_FACT__QUESTION:
			return getQuestion();
		case GeneratorPackage.QUESTIONED_FACT__PROPOSITIONS:
			return getPropositions();
		case GeneratorPackage.QUESTIONED_FACT__ENTRYS:
			return getEntrys();
		case GeneratorPackage.QUESTIONED_FACT__CORRECTNESS_TO_REACH:
			return getCorrectnessToReach();
		case GeneratorPackage.QUESTIONED_FACT__LEARNER_VALIDATION:
			return isLearnerValidation();
		case GeneratorPackage.QUESTIONED_FACT__FACT_CORRECTNESS:
			return getFactCorrectness();
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
		case GeneratorPackage.QUESTIONED_FACT__QUESTIONABLEFACT:
			setQuestionablefact((AQuestionableFact) newValue);
			return;
		case GeneratorPackage.QUESTIONED_FACT__QUESTION:
			setQuestion((AQuestionParam) newValue);
			return;
		case GeneratorPackage.QUESTIONED_FACT__PROPOSITIONS:
			getPropositions().clear();
			getPropositions().addAll((Collection<? extends PropositionParam>) newValue);
			return;
		case GeneratorPackage.QUESTIONED_FACT__ENTRYS:
			getEntrys().clear();
			getEntrys().addAll((Collection<? extends EntrySoluceParam>) newValue);
			return;
		case GeneratorPackage.QUESTIONED_FACT__CORRECTNESS_TO_REACH:
			setCorrectnessToReach((WantedAnswersParam) newValue);
			return;
		case GeneratorPackage.QUESTIONED_FACT__LEARNER_VALIDATION:
			setLearnerValidation((Boolean) newValue);
			return;
		case GeneratorPackage.QUESTIONED_FACT__FACT_CORRECTNESS:
			setFactCorrectness((FactCorrectnessParam) newValue);
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
		case GeneratorPackage.QUESTIONED_FACT__QUESTIONABLEFACT:
			setQuestionablefact((AQuestionableFact) null);
			return;
		case GeneratorPackage.QUESTIONED_FACT__QUESTION:
			setQuestion((AQuestionParam) null);
			return;
		case GeneratorPackage.QUESTIONED_FACT__PROPOSITIONS:
			getPropositions().clear();
			return;
		case GeneratorPackage.QUESTIONED_FACT__ENTRYS:
			getEntrys().clear();
			return;
		case GeneratorPackage.QUESTIONED_FACT__CORRECTNESS_TO_REACH:
			setCorrectnessToReach((WantedAnswersParam) null);
			return;
		case GeneratorPackage.QUESTIONED_FACT__LEARNER_VALIDATION:
			setLearnerValidation(LEARNER_VALIDATION_EDEFAULT);
			return;
		case GeneratorPackage.QUESTIONED_FACT__FACT_CORRECTNESS:
			setFactCorrectness((FactCorrectnessParam) null);
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
		case GeneratorPackage.QUESTIONED_FACT__QUESTIONABLEFACT:
			return questionablefact != null;
		case GeneratorPackage.QUESTIONED_FACT__QUESTION:
			return question != null;
		case GeneratorPackage.QUESTIONED_FACT__PROPOSITIONS:
			return propositions != null && !propositions.isEmpty();
		case GeneratorPackage.QUESTIONED_FACT__ENTRYS:
			return entrys != null && !entrys.isEmpty();
		case GeneratorPackage.QUESTIONED_FACT__CORRECTNESS_TO_REACH:
			return correctnessToReach != null;
		case GeneratorPackage.QUESTIONED_FACT__LEARNER_VALIDATION:
			return learnerValidation != LEARNER_VALIDATION_EDEFAULT;
		case GeneratorPackage.QUESTIONED_FACT__FACT_CORRECTNESS:
			return factCorrectness != null;
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
		result.append(" (learnerValidation: ");
		result.append(learnerValidation);
		result.append(')');
		return result.toString();
	}

} //QuestionedFactImpl
