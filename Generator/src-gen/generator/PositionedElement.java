/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Positioned Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.PositionedElement#getID <em>ID</em>}</li>
 *   <li>{@link generator.PositionedElement#getPosition <em>Position</em>}</li>
 *   <li>{@link generator.PositionedElement#getCorrectness <em>Correctness</em>}</li>
 *   <li>{@link generator.PositionedElement#getDisplay <em>Display</em>}</li>
 *   <li>{@link generator.PositionedElement#getElementType <em>Element Type</em>}</li>
 *   <li>{@link generator.PositionedElement#getExpectedAnswer <em>Expected Answer</em>}</li>
 *   <li>{@link generator.PositionedElement#getPriority <em>Priority</em>}</li>
 *   <li>{@link generator.PositionedElement#getFact <em>Fact</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getPositionedElement()
 * @model
 * @generated
 */
public interface PositionedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see generator.GeneratorPackage#getPositionedElement_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link generator.PositionedElement#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(APosition)
	 * @see generator.GeneratorPackage#getPositionedElement_Position()
	 * @model
	 * @generated
	 */
	APosition getPosition();

	/**
	 * Sets the value of the '{@link generator.PositionedElement#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(APosition value);

	/**
	 * Returns the value of the '<em><b>Correctness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correctness</em>' containment reference.
	 * @see #setCorrectness(Correctness)
	 * @see generator.GeneratorPackage#getPositionedElement_Correctness()
	 * @model containment="true"
	 * @generated
	 */
	Correctness getCorrectness();

	/**
	 * Sets the value of the '{@link generator.PositionedElement#getCorrectness <em>Correctness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correctness</em>' containment reference.
	 * @see #getCorrectness()
	 * @generated
	 */
	void setCorrectness(Correctness value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(Display)
	 * @see generator.GeneratorPackage#getPositionedElement_Display()
	 * @model containment="true"
	 * @generated
	 */
	Display getDisplay();

	/**
	 * Sets the value of the '{@link generator.PositionedElement#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(Display value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(GPElementType)
	 * @see generator.GeneratorPackage#getPositionedElement_ElementType()
	 * @model required="true"
	 * @generated
	 */
	GPElementType getElementType();

	/**
	 * Sets the value of the '{@link generator.PositionedElement#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(GPElementType value);

	/**
	 * Returns the value of the '<em><b>Expected Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Answer</em>' containment reference.
	 * @see #setExpectedAnswer(ExpectedAnswer)
	 * @see generator.GeneratorPackage#getPositionedElement_ExpectedAnswer()
	 * @model containment="true"
	 * @generated
	 */
	ExpectedAnswer getExpectedAnswer();

	/**
	 * Sets the value of the '{@link generator.PositionedElement#getExpectedAnswer <em>Expected Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Answer</em>' containment reference.
	 * @see #getExpectedAnswer()
	 * @generated
	 */
	void setExpectedAnswer(ExpectedAnswer value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(Priority)
	 * @see generator.GeneratorPackage#getPositionedElement_Priority()
	 * @model containment="true"
	 * @generated
	 */
	Priority getPriority();

	/**
	 * Sets the value of the '{@link generator.PositionedElement#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Priority value);

	/**
	 * Returns the value of the '<em><b>Fact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact</em>' reference.
	 * @see #setFact(QuestionedFact)
	 * @see generator.GeneratorPackage#getPositionedElement_Fact()
	 * @model
	 * @generated
	 */
	QuestionedFact getFact();

	/**
	 * Sets the value of the '{@link generator.PositionedElement#getFact <em>Fact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact</em>' reference.
	 * @see #getFact()
	 * @generated
	 */
	void setFact(QuestionedFact value);

} // PositionedElement
