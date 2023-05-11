/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Quantity#isFactNbAnswers <em>Fact Nb Answers</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getQuantity()
 * @model
 * @generated
 */
public interface Quantity extends Parameter {
	/**
	 * Returns the value of the '<em><b>Fact Nb Answers</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Nb Answers</em>' attribute.
	 * @see #setFactNbAnswers(boolean)
	 * @see generator.GeneratorPackage#getQuantity_FactNbAnswers()
	 * @model default="false"
	 * @generated
	 */
	boolean isFactNbAnswers();

	/**
	 * Sets the value of the '{@link generator.Quantity#isFactNbAnswers <em>Fact Nb Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact Nb Answers</em>' attribute.
	 * @see #isFactNbAnswers()
	 * @generated
	 */
	void setFactNbAnswers(boolean value);

} // Quantity
