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
 *   <li>{@link generator.Display#getCorrectness <em>Correctness</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Correctness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correctness</em>' containment reference.
	 * @see #setCorrectness(Correctness)
	 * @see generator.GeneratorPackage#getDisplay_Correctness()
	 * @model containment="true"
	 * @generated
	 */
	Correctness getCorrectness();

	/**
	 * Sets the value of the '{@link generator.Display#getCorrectness <em>Correctness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correctness</em>' containment reference.
	 * @see #getCorrectness()
	 * @generated
	 */
	void setCorrectness(Correctness value);

} // Display
