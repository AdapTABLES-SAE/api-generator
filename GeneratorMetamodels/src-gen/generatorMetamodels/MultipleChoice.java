/**
 */
package generatorMetamodels;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.MultipleChoice#getNbChoices <em>Nb Choices</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMultipleChoice()
 * @model
 * @generated
 */
public interface MultipleChoice extends ResponseModality {
	/**
	 * Returns the value of the '<em><b>Nb Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Choices</em>' attribute.
	 * @see #setNbChoices(int)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMultipleChoice_NbChoices()
	 * @model
	 * @generated
	 */
	int getNbChoices();

	/**
	 * Sets the value of the '{@link generatorMetamodels.MultipleChoice#getNbChoices <em>Nb Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Choices</em>' attribute.
	 * @see #getNbChoices()
	 * @generated
	 */
	void setNbChoices(int value);

} // MultipleChoice
