/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Completion Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.CompletionType#getNbMissingElements <em>Nb Missing Elements</em>}</li>
 *   <li>{@link generator.CompletionType#getFactOrder <em>Fact Order</em>}</li>
 *   <li>{@link generator.CompletionType#isNaturalLanguage <em>Natural Language</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getCompletionType()
 * @model
 * @generated
 */
public interface CompletionType extends TaskType {
	/**
	 * Returns the value of the '<em><b>Nb Missing Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Missing Elements</em>' attribute.
	 * @see #setNbMissingElements(int)
	 * @see generator.GeneratorPackage#getCompletionType_NbMissingElements()
	 * @model
	 * @generated
	 */
	int getNbMissingElements();

	/**
	 * Sets the value of the '{@link generator.CompletionType#getNbMissingElements <em>Nb Missing Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Missing Elements</em>' attribute.
	 * @see #getNbMissingElements()
	 * @generated
	 */
	void setNbMissingElements(int value);

	/**
	 * Returns the value of the '<em><b>Fact Order</b></em>' attribute.
	 * The default value is <code>"MIX"</code>.
	 * The literals are from the enumeration {@link generator.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Order</em>' attribute.
	 * @see generator.Order
	 * @see #setFactOrder(Order)
	 * @see generator.GeneratorPackage#getCompletionType_FactOrder()
	 * @model default="MIX"
	 * @generated
	 */
	Order getFactOrder();

	/**
	 * Sets the value of the '{@link generator.CompletionType#getFactOrder <em>Fact Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact Order</em>' attribute.
	 * @see generator.Order
	 * @see #getFactOrder()
	 * @generated
	 */
	void setFactOrder(Order value);

	/**
	 * Returns the value of the '<em><b>Natural Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Natural Language</em>' attribute.
	 * @see #setNaturalLanguage(boolean)
	 * @see generator.GeneratorPackage#getCompletionType_NaturalLanguage()
	 * @model
	 * @generated
	 */
	boolean isNaturalLanguage();

	/**
	 * Sets the value of the '{@link generator.CompletionType#isNaturalLanguage <em>Natural Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Natural Language</em>' attribute.
	 * @see #isNaturalLanguage()
	 * @generated
	 */
	void setNaturalLanguage(boolean value);

} // CompletionType
