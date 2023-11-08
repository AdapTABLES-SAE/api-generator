/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Multiple Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.DynamicMultipleChoice#getType <em>Type</em>}</li>
 *   <li>{@link generator.DynamicMultipleChoice#getNbBadChoices <em>Nb Bad Choices</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getDynamicMultipleChoice()
 * @model
 * @generated
 */
public interface DynamicMultipleChoice extends ResponseModality {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EModality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.EModality
	 * @see #setType(EModality)
	 * @see generator.GeneratorPackage#getDynamicMultipleChoice_Type()
	 * @model
	 * @generated
	 */
	EModality getType();

	/**
	 * Sets the value of the '{@link generator.DynamicMultipleChoice#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see generator.EModality
	 * @see #getType()
	 * @generated
	 */
	void setType(EModality value);

	/**
	 * Returns the value of the '<em><b>Nb Bad Choices</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Bad Choices</em>' attribute.
	 * @see #setNbBadChoices(int)
	 * @see generator.GeneratorPackage#getDynamicMultipleChoice_NbBadChoices()
	 * @model default="0"
	 * @generated
	 */
	int getNbBadChoices();

	/**
	 * Sets the value of the '{@link generator.DynamicMultipleChoice#getNbBadChoices <em>Nb Bad Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Bad Choices</em>' attribute.
	 * @see #getNbBadChoices()
	 * @generated
	 */
	void setNbBadChoices(int value);

} // DynamicMultipleChoice
