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
 *   <li>{@link generator.QuestionedFact#getQuestionText <em>Question Text</em>}</li>
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
	 * Returns the value of the '<em><b>Question Text</b></em>' attribute.
	 * The default value is <code>"TEST"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Text</em>' attribute.
	 * @see #isSetQuestionText()
	 * @see #unsetQuestionText()
	 * @see #setQuestionText(String)
	 * @see generator.GeneratorPackage#getQuestionedFact_QuestionText()
	 * @model default="TEST" unsettable="true"
	 * @generated
	 */
	String getQuestionText();

	/**
	 * Sets the value of the '{@link generator.QuestionedFact#getQuestionText <em>Question Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Text</em>' attribute.
	 * @see #isSetQuestionText()
	 * @see #unsetQuestionText()
	 * @see #getQuestionText()
	 * @generated
	 */
	void setQuestionText(String value);

	/**
	 * Unsets the value of the '{@link generator.QuestionedFact#getQuestionText <em>Question Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuestionText()
	 * @see #getQuestionText()
	 * @see #setQuestionText(String)
	 * @generated
	 */
	void unsetQuestionText();

	/**
	 * Returns whether the value of the '{@link generator.QuestionedFact#getQuestionText <em>Question Text</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Question Text</em>' attribute is set.
	 * @see #unsetQuestionText()
	 * @see #getQuestionText()
	 * @see #setQuestionText(String)
	 * @generated
	 */
	boolean isSetQuestionText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setQuestionText();

} // QuestionedFact
