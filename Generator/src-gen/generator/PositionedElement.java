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
 *   <li>{@link generator.PositionedElement#getDisplay <em>Display</em>}</li>
 *   <li>{@link generator.PositionedElement#getElement <em>Element</em>}</li>
 *   <li>{@link generator.PositionedElement#getPosition <em>Position</em>}</li>
 *   <li>{@link generator.PositionedElement#getCorrectness <em>Correctness</em>}</li>
 *   <li>{@link generator.PositionedElement#getWantedAnswer <em>Wanted Answer</em>}</li>
 *   <li>{@link generator.PositionedElement#getStructure <em>Structure</em>}</li>
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
	 * Returns the value of the '<em><b>Wanted Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wanted Answer</em>' containment reference.
	 * @see #setWantedAnswer(WantedAnswer)
	 * @see generator.GeneratorPackage#getPositionedElement_WantedAnswer()
	 * @model containment="true"
	 * @generated
	 */
	WantedAnswer getWantedAnswer();

	/**
	 * Sets the value of the '{@link generator.PositionedElement#getWantedAnswer <em>Wanted Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wanted Answer</em>' containment reference.
	 * @see #getWantedAnswer()
	 * @generated
	 */
	void setWantedAnswer(WantedAnswer value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' reference.
	 * @see #setStructure(StructureElement)
	 * @see generator.GeneratorPackage#getPositionedElement_Structure()
	 * @model
	 * @generated
	 */
	StructureElement getStructure();

	/**
	 * Sets the value of the '{@link generator.PositionedElement#getStructure <em>Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(StructureElement value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(CoreElement)
	 * @see generator.GeneratorPackage#getPositionedElement_Element()
	 * @model
	 * @generated
	 */
	CoreElement getElement();

	/**
	 * Sets the value of the '{@link generator.PositionedElement#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(CoreElement value);

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
} // PositionedElement
