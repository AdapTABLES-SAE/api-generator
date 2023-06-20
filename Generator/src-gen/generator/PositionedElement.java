/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link generator.PositionedElement#getDisplays <em>Displays</em>}</li>
 *   <li>{@link generator.PositionedElement#getElementType <em>Element Type</em>}</li>
 *   <li>{@link generator.PositionedElement#getExpectedAnswer <em>Expected Answer</em>}</li>
 *   <li>{@link generator.PositionedElement#getFact <em>Fact</em>}</li>
 *   <li>{@link generator.PositionedElement#getAcceptedFacts <em>Accepted Facts</em>}</li>
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
	 * @see #setPosition(Position)
	 * @see generator.GeneratorPackage#getPositionedElement_Position()
	 * @model
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link generator.PositionedElement#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

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
	 * Returns the value of the '<em><b>Displays</b></em>' containment reference list.
	 * The list contents are of type {@link generator.Display}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displays</em>' containment reference list.
	 * @see generator.GeneratorPackage#getPositionedElement_Displays()
	 * @model containment="true"
	 * @generated
	 */
	EList<Display> getDisplays();

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(ElementType)
	 * @see generator.GeneratorPackage#getPositionedElement_ElementType()
	 * @model required="true"
	 * @generated
	 */
	ElementType getElementType();

	/**
	 * Sets the value of the '{@link generator.PositionedElement#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(ElementType value);

	/**
	 * Returns the value of the '<em><b>Expected Answer</b></em>' containment reference list.
	 * The list contents are of type {@link generator.ExpectedAnswer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Answer</em>' containment reference list.
	 * @see generator.GeneratorPackage#getPositionedElement_ExpectedAnswer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpectedAnswer> getExpectedAnswer();

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

	/**
	 * Returns the value of the '<em><b>Accepted Facts</b></em>' containment reference list.
	 * The list contents are of type {@link generator.FactSolutionParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Facts</em>' containment reference list.
	 * @see generator.GeneratorPackage#getPositionedElement_AcceptedFacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<FactSolutionParam> getAcceptedFacts();

} // PositionedElement
