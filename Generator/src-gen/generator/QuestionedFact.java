/**
 */
package generator;

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
 *   <li>{@link generator.QuestionedFact#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getQuestionedFact()
 * @model abstract="true"
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
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(Position)
	 * @see generator.GeneratorPackage#getQuestionedFact_Position()
	 * @model required="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link generator.QuestionedFact#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getQuestionedFactQuestion();

} // QuestionedFact
