/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correctness Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.CorrectnessValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getCorrectnessValue()
 * @model
 * @generated
 */
public interface CorrectnessValue extends AValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.ECorrectness}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see generator.ECorrectness
	 * @see #setValue(ECorrectness)
	 * @see generator.GeneratorPackage#getCorrectnessValue_Value()
	 * @model
	 * @generated
	 */
	ECorrectness getValue();

	/**
	 * Sets the value of the '{@link generator.CorrectnessValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see generator.ECorrectness
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ECorrectness value);

} // CorrectnessValue
