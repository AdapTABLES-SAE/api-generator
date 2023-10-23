/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MapQuestionableFact#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMapQuestionableFact()
 * @model
 * @generated
 */
public interface MapQuestionableFact extends AVizualisationQuestionableFact {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link generator.EGeographyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.EGeographyValue
	 * @see #setType(EGeographyValue)
	 * @see generator.GeneratorPackage#getMapQuestionableFact_Type()
	 * @model default="NONE"
	 * @generated
	 */
	EGeographyValue getType();

	/**
	 * Sets the value of the '{@link generator.MapQuestionableFact#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see generator.EGeographyValue
	 * @see #getType()
	 * @generated
	 */
	void setType(EGeographyValue value);

} // MapQuestionableFact
