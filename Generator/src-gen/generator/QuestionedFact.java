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
 *   <li>{@link generator.QuestionedFact#getCompleteFact <em>Complete Fact</em>}</li>
 *   <li>{@link generator.QuestionedFact#getCorrectnessToReach <em>Correctness To Reach</em>}</li>
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
	 * Returns the value of the '<em><b>Complete Fact</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete Fact</em>' attribute.
	 * @see #isSetCompleteFact()
	 * @see #unsetCompleteFact()
	 * @see #setCompleteFact(String)
	 * @see generator.GeneratorPackage#getQuestionedFact_CompleteFact()
	 * @model default="" unsettable="true"
	 * @generated
	 */
	String getCompleteFact();

	/**
	 * Sets the value of the '{@link generator.QuestionedFact#getCompleteFact <em>Complete Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete Fact</em>' attribute.
	 * @see #isSetCompleteFact()
	 * @see #unsetCompleteFact()
	 * @see #getCompleteFact()
	 * @generated
	 */
	void setCompleteFact(String value);

	/**
	 * Unsets the value of the '{@link generator.QuestionedFact#getCompleteFact <em>Complete Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompleteFact()
	 * @see #getCompleteFact()
	 * @see #setCompleteFact(String)
	 * @generated
	 */
	void unsetCompleteFact();

	/**
	 * Returns whether the value of the '{@link generator.QuestionedFact#getCompleteFact <em>Complete Fact</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Complete Fact</em>' attribute is set.
	 * @see #unsetCompleteFact()
	 * @see #getCompleteFact()
	 * @see #setCompleteFact(String)
	 * @generated
	 */
	boolean isSetCompleteFact();

	/**
	 * Returns the value of the '<em><b>Correctness To Reach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correctness To Reach</em>' attribute.
	 * @see #setCorrectnessToReach(int)
	 * @see generator.GeneratorPackage#getQuestionedFact_CorrectnessToReach()
	 * @model
	 * @generated
	 */
	int getCorrectnessToReach();

	/**
	 * Sets the value of the '{@link generator.QuestionedFact#getCorrectnessToReach <em>Correctness To Reach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correctness To Reach</em>' attribute.
	 * @see #getCorrectnessToReach()
	 * @generated
	 */
	void setCorrectnessToReach(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setCompleteFact();

} // QuestionedFact
