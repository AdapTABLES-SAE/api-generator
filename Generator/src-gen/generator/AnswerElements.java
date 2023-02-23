/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.AnswerElements#isSingleAnswer <em>Single Answer</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getAnswerElements()
 * @model
 * @generated
 */
public interface AnswerElements extends CoreGPElement {

	/**
	 * Returns the value of the '<em><b>Single Answer</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Answer</em>' attribute.
	 * @see #setSingleAnswer(boolean)
	 * @see generator.GeneratorPackage#getAnswerElements_SingleAnswer()
	 * @model default="true"
	 * @generated
	 */
	boolean isSingleAnswer();

	/**
	 * Sets the value of the '{@link generator.AnswerElements#isSingleAnswer <em>Single Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Answer</em>' attribute.
	 * @see #isSingleAnswer()
	 * @generated
	 */
	void setSingleAnswer(boolean value);
} // AnswerElements
