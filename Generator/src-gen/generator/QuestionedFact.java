/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questioned Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.QuestionedFact#getQuestionablefact <em>Questionablefact</em>}</li>
 *   <li>{@link generator.QuestionedFact#getQuestion <em>Question</em>}</li>
 *   <li>{@link generator.QuestionedFact#getPropositions <em>Propositions</em>}</li>
 *   <li>{@link generator.QuestionedFact#getEntrys <em>Entrys</em>}</li>
 *   <li>{@link generator.QuestionedFact#getCorrectnessToReach <em>Correctness To Reach</em>}</li>
 *   <li>{@link generator.QuestionedFact#isLearnerValidation <em>Learner Validation</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getQuestionedFact()
 * @model
 * @generated
 */
public interface QuestionedFact extends EObject {
	/**
	 * Returns the value of the '<em><b>Questionablefact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionablefact</em>' reference.
	 * @see #setQuestionablefact(QuestionableFact)
	 * @see generator.GeneratorPackage#getQuestionedFact_Questionablefact()
	 * @model required="true"
	 * @generated
	 */
	QuestionableFact getQuestionablefact();

	/**
	 * Sets the value of the '{@link generator.QuestionedFact#getQuestionablefact <em>Questionablefact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionablefact</em>' reference.
	 * @see #getQuestionablefact()
	 * @generated
	 */
	void setQuestionablefact(QuestionableFact value);

	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' containment reference.
	 * @see #setQuestion(QuestionParam)
	 * @see generator.GeneratorPackage#getQuestionedFact_Question()
	 * @model containment="true"
	 * @generated
	 */
	QuestionParam getQuestion();

	/**
	 * Sets the value of the '{@link generator.QuestionedFact#getQuestion <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' containment reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(QuestionParam value);

	/**
	 * Returns the value of the '<em><b>Propositions</b></em>' containment reference list.
	 * The list contents are of type {@link generator.PropositionParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propositions</em>' containment reference list.
	 * @see generator.GeneratorPackage#getQuestionedFact_Propositions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropositionParam> getPropositions();

	/**
	 * Returns the value of the '<em><b>Entrys</b></em>' containment reference list.
	 * The list contents are of type {@link generator.EntrySoluceParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrys</em>' containment reference list.
	 * @see generator.GeneratorPackage#getQuestionedFact_Entrys()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntrySoluceParam> getEntrys();

	/**
	 * Returns the value of the '<em><b>Correctness To Reach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correctness To Reach</em>' containment reference.
	 * @see #setCorrectnessToReach(WantedAnswersParam)
	 * @see generator.GeneratorPackage#getQuestionedFact_CorrectnessToReach()
	 * @model containment="true"
	 * @generated
	 */
	WantedAnswersParam getCorrectnessToReach();

	/**
	 * Sets the value of the '{@link generator.QuestionedFact#getCorrectnessToReach <em>Correctness To Reach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correctness To Reach</em>' containment reference.
	 * @see #getCorrectnessToReach()
	 * @generated
	 */
	void setCorrectnessToReach(WantedAnswersParam value);

	/**
	 * Returns the value of the '<em><b>Learner Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learner Validation</em>' attribute.
	 * @see #setLearnerValidation(boolean)
	 * @see generator.GeneratorPackage#getQuestionedFact_LearnerValidation()
	 * @model
	 * @generated
	 */
	boolean isLearnerValidation();

	/**
	 * Sets the value of the '{@link generator.QuestionedFact#isLearnerValidation <em>Learner Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learner Validation</em>' attribute.
	 * @see #isLearnerValidation()
	 * @generated
	 */
	void setLearnerValidation(boolean value);

} // QuestionedFact
