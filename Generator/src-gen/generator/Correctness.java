/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correctness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Correctness#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getCorrectness()
 * @model
 * @generated
 */
public interface Correctness extends AbstractAttributes {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.VerificationValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see generator.VerificationValues
	 * @see #setValue(VerificationValues)
	 * @see generator.GeneratorPackage#getCorrectness_Value()
	 * @model
	 * @generated
	 */
	VerificationValues getValue();

	/**
	 * Sets the value of the '{@link generator.Correctness#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see generator.VerificationValues
	 * @see #getValue()
	 * @generated
	 */
	void setValue(VerificationValues value);

} // Correctness
