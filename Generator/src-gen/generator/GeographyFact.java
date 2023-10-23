/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geography Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.GeographyFact#getPosition <em>Position</em>}</li>
 *   <li>{@link generator.GeographyFact#getType <em>Type</em>}</li>
 *   <li>{@link generator.GeographyFact#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGeographyFact()
 * @model
 * @generated
 */
public interface GeographyFact extends AbstractFact {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(VisualizationPosition)
	 * @see generator.GeneratorPackage#getGeographyFact_Position()
	 * @model required="true"
	 * @generated
	 */
	VisualizationPosition getPosition();

	/**
	 * Sets the value of the '{@link generator.GeographyFact#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(VisualizationPosition value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EGeographyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.EGeographyValue
	 * @see #setType(EGeographyValue)
	 * @see generator.GeneratorPackage#getGeographyFact_Type()
	 * @model
	 * @generated
	 */
	EGeographyValue getType();

	/**
	 * Sets the value of the '{@link generator.GeographyFact#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see generator.EGeographyValue
	 * @see #getType()
	 * @generated
	 */
	void setType(EGeographyValue value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see generator.GeneratorPackage#getGeographyFact_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link generator.GeographyFact#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // GeographyFact
