/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Display#isInteractive <em>Interactive</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getDisplay()
 * @model
 * @generated
 */
public interface Display extends Parameter {
	/**
	 * Returns the value of the '<em><b>Interactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactive</em>' attribute.
	 * @see #setInteractive(boolean)
	 * @see generator.GeneratorPackage#getDisplay_Interactive()
	 * @model
	 * @generated
	 */
	boolean isInteractive();

	/**
	 * Sets the value of the '{@link generator.Display#isInteractive <em>Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interactive</em>' attribute.
	 * @see #isInteractive()
	 * @generated
	 */
	void setInteractive(boolean value);

} // Display
