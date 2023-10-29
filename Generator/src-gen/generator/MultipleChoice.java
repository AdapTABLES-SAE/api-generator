/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MultipleChoice#getType <em>Type</em>}</li>
 *   <li>{@link generator.MultipleChoice#getNbChoices <em>Nb Choices</em>}</li>
 *   <li>{@link generator.MultipleChoice#getNbBadChoices <em>Nb Bad Choices</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMultipleChoice()
 * @model
 * @generated
 */
public interface MultipleChoice extends ResponseModality {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EModality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.EModality
	 * @see #setType(EModality)
	 * @see generator.GeneratorPackage#getMultipleChoice_Type()
	 * @model
	 * @generated
	 */
	EModality getType();

	/**
	 * Sets the value of the '{@link generator.MultipleChoice#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see generator.EModality
	 * @see #getType()
	 * @generated
	 */
	void setType(EModality value);

	/**
	 * Returns the value of the '<em><b>Nb Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Choices</em>' attribute.
	 * @see #setNbChoices(int)
	 * @see generator.GeneratorPackage#getMultipleChoice_NbChoices()
	 * @model
	 * @generated
	 */
	int getNbChoices();

	/**
	 * Sets the value of the '{@link generator.MultipleChoice#getNbChoices <em>Nb Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Choices</em>' attribute.
	 * @see #getNbChoices()
	 * @generated
	 */
	void setNbChoices(int value);

	/**
	 * Returns the value of the '<em><b>Nb Bad Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Bad Choices</em>' attribute.
	 * @see #setNbBadChoices(int)
	 * @see generator.GeneratorPackage#getMultipleChoice_NbBadChoices()
	 * @model
	 * @generated
	 */
	int getNbBadChoices();

	/**
	 * Sets the value of the '{@link generator.MultipleChoice#getNbBadChoices <em>Nb Bad Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Bad Choices</em>' attribute.
	 * @see #getNbBadChoices()
	 * @generated
	 */
	void setNbBadChoices(int value);

} // MultipleChoice
