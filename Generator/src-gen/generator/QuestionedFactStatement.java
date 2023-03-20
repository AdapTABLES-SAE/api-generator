/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questioned Fact Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.QuestionedFactStatement#getType <em>Type</em>}</li>
 *   <li>{@link generator.QuestionedFactStatement#getQuestionedFact <em>Questioned Fact</em>}</li>
 *   <li>{@link generator.QuestionedFactStatement#getDisplay <em>Display</em>}</li>
 *   <li>{@link generator.QuestionedFactStatement#getPosition <em>Position</em>}</li>
 *   <li>{@link generator.QuestionedFactStatement#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getQuestionedFactStatement()
 * @model
 * @generated
 */
public interface QuestionedFactStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.StatementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.StatementType
	 * @see #setType(StatementType)
	 * @see generator.GeneratorPackage#getQuestionedFactStatement_Type()
	 * @model
	 * @generated
	 */
	StatementType getType();

	/**
	 * Sets the value of the '{@link generator.QuestionedFactStatement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see generator.StatementType
	 * @see #getType()
	 * @generated
	 */
	void setType(StatementType value);

	/**
	 * Returns the value of the '<em><b>Questioned Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questioned Fact</em>' reference.
	 * @see #setQuestionedFact(QuestionedFact)
	 * @see generator.GeneratorPackage#getQuestionedFactStatement_QuestionedFact()
	 * @model required="true"
	 * @generated
	 */
	QuestionedFact getQuestionedFact();

	/**
	 * Sets the value of the '{@link generator.QuestionedFactStatement#getQuestionedFact <em>Questioned Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questioned Fact</em>' reference.
	 * @see #getQuestionedFact()
	 * @generated
	 */
	void setQuestionedFact(QuestionedFact value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(Display)
	 * @see generator.GeneratorPackage#getQuestionedFactStatement_Display()
	 * @model containment="true"
	 * @generated
	 */
	Display getDisplay();

	/**
	 * Sets the value of the '{@link generator.QuestionedFactStatement#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(Display value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(APosition)
	 * @see generator.GeneratorPackage#getQuestionedFactStatement_Position()
	 * @model
	 * @generated
	 */
	APosition getPosition();

	/**
	 * Sets the value of the '{@link generator.QuestionedFactStatement#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(APosition value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see generator.GeneratorPackage#getQuestionedFactStatement_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link generator.QuestionedFactStatement#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // QuestionedFactStatement
