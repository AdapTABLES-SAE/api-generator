/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Component#getDisplayValue <em>Display Value</em>}</li>
 *   <li>{@link generator.Component#isWearChoices <em>Wear Choices</em>}</li>
 *   <li>{@link generator.Component#getDefaultCorrectness <em>Default Correctness</em>}</li>
 *   <li>{@link generator.Component#isWearStatement <em>Wear Statement</em>}</li>
 *   <li>{@link generator.Component#isInputEntry <em>Input Entry</em>}</li>
 *   <li>{@link generator.Component#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends AComponent {
	/**
	 * Returns the value of the '<em><b>Display Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Value</em>' containment reference.
	 * @see #setDisplayValue(Display)
	 * @see generator.GeneratorPackage#getComponent_DisplayValue()
	 * @model containment="true"
	 * @generated
	 */
	Display getDisplayValue();

	/**
	 * Sets the value of the '{@link generator.Component#getDisplayValue <em>Display Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Value</em>' containment reference.
	 * @see #getDisplayValue()
	 * @generated
	 */
	void setDisplayValue(Display value);

	/**
	 * Returns the value of the '<em><b>Wear Choices</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wear Choices</em>' attribute.
	 * @see #setWearChoices(boolean)
	 * @see generator.GeneratorPackage#getComponent_WearChoices()
	 * @model default="false"
	 * @generated
	 */
	boolean isWearChoices();

	/**
	 * Sets the value of the '{@link generator.Component#isWearChoices <em>Wear Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wear Choices</em>' attribute.
	 * @see #isWearChoices()
	 * @generated
	 */
	void setWearChoices(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Correctness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Correctness</em>' containment reference.
	 * @see #setDefaultCorrectness(Correctness)
	 * @see generator.GeneratorPackage#getComponent_DefaultCorrectness()
	 * @model containment="true"
	 * @generated
	 */
	Correctness getDefaultCorrectness();

	/**
	 * Sets the value of the '{@link generator.Component#getDefaultCorrectness <em>Default Correctness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Correctness</em>' containment reference.
	 * @see #getDefaultCorrectness()
	 * @generated
	 */
	void setDefaultCorrectness(Correctness value);

	/**
	 * Returns the value of the '<em><b>Wear Statement</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wear Statement</em>' attribute.
	 * @see #setWearStatement(boolean)
	 * @see generator.GeneratorPackage#getComponent_WearStatement()
	 * @model default="false"
	 * @generated
	 */
	boolean isWearStatement();

	/**
	 * Sets the value of the '{@link generator.Component#isWearStatement <em>Wear Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wear Statement</em>' attribute.
	 * @see #isWearStatement()
	 * @generated
	 */
	void setWearStatement(boolean value);

	/**
	 * Returns the value of the '<em><b>Input Entry</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Entry</em>' attribute.
	 * @see #setInputEntry(boolean)
	 * @see generator.GeneratorPackage#getComponent_InputEntry()
	 * @model default="false"
	 * @generated
	 */
	boolean isInputEntry();

	/**
	 * Sets the value of the '{@link generator.Component#isInputEntry <em>Input Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Entry</em>' attribute.
	 * @see #isInputEntry()
	 * @generated
	 */
	void setInputEntry(boolean value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see generator.GeneratorPackage#getComponent_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link generator.Component#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

} // Component
