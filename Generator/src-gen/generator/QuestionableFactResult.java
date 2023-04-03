/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionable Fact Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.QuestionableFactResult#getResponseTime <em>Response Time</em>}</li>
 *   <li>{@link generator.QuestionableFactResult#isAnswerValid <em>Answer Valid</em>}</li>
 *   <li>{@link generator.QuestionableFactResult#getGivenAnswers <em>Given Answers</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getQuestionableFactResult()
 * @model
 * @generated
 */
public interface QuestionableFactResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Time</em>' attribute.
	 * @see #setResponseTime(int)
	 * @see generator.GeneratorPackage#getQuestionableFactResult_ResponseTime()
	 * @model
	 * @generated
	 */
	int getResponseTime();

	/**
	 * Sets the value of the '{@link generator.QuestionableFactResult#getResponseTime <em>Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Time</em>' attribute.
	 * @see #getResponseTime()
	 * @generated
	 */
	void setResponseTime(int value);

	/**
	 * Returns the value of the '<em><b>Answer Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer Valid</em>' attribute.
	 * @see #setAnswerValid(boolean)
	 * @see generator.GeneratorPackage#getQuestionableFactResult_AnswerValid()
	 * @model
	 * @generated
	 */
	boolean isAnswerValid();

	/**
	 * Sets the value of the '{@link generator.QuestionableFactResult#isAnswerValid <em>Answer Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Valid</em>' attribute.
	 * @see #isAnswerValid()
	 * @generated
	 */
	void setAnswerValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Given Answers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given Answers</em>' attribute list.
	 * @see generator.GeneratorPackage#getQuestionableFactResult_GivenAnswers()
	 * @model
	 * @generated
	 */
	EList<String> getGivenAnswers();

} // QuestionableFactResult
