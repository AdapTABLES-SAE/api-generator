/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Many Answer Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ManyAnswerElement#getDisplayValues <em>Display Values</em>}</li>
 *   <li>{@link generator.ManyAnswerElement#getRightValue <em>Right Value</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getManyAnswerElement()
 * @model
 * @generated
 */
public interface ManyAnswerElement extends PositionedElement {
	/**
	 * Returns the value of the '<em><b>Display Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Values</em>' attribute list.
	 * @see generator.GeneratorPackage#getManyAnswerElement_DisplayValues()
	 * @model
	 * @generated
	 */
	EList<String> getDisplayValues();

	/**
	 * Returns the value of the '<em><b>Right Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Value</em>' attribute.
	 * @see #setRightValue(String)
	 * @see generator.GeneratorPackage#getManyAnswerElement_RightValue()
	 * @model
	 * @generated
	 */
	String getRightValue();

	/**
	 * Sets the value of the '{@link generator.ManyAnswerElement#getRightValue <em>Right Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Value</em>' attribute.
	 * @see #getRightValue()
	 * @generated
	 */
	void setRightValue(String value);

} // ManyAnswerElement
