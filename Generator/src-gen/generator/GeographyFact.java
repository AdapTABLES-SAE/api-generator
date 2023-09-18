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
 *   <li>{@link generator.GeographyFact#getMap <em>Map</em>}</li>
 *   <li>{@link generator.GeographyFact#getPosition <em>Position</em>}</li>
 *   <li>{@link generator.GeographyFact#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGeographyFact()
 * @model
 * @generated
 */
public interface GeographyFact extends AbstractFact {
	/**
	 * Returns the value of the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' reference.
	 * @see #setMap(Map)
	 * @see generator.GeneratorPackage#getGeographyFact_Map()
	 * @model required="true"
	 * @generated
	 */
	Map getMap();

	/**
	 * Sets the value of the '{@link generator.GeographyFact#getMap <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(Map value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(MapElementPosition)
	 * @see generator.GeneratorPackage#getGeographyFact_Position()
	 * @model required="true"
	 * @generated
	 */
	MapElementPosition getPosition();

	/**
	 * Sets the value of the '{@link generator.GeographyFact#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(MapElementPosition value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EGeographyValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see generator.EGeographyValue
	 * @see #setValue(EGeographyValue)
	 * @see generator.GeneratorPackage#getGeographyFact_Value()
	 * @model
	 * @generated
	 */
	EGeographyValue getValue();

	/**
	 * Sets the value of the '{@link generator.GeographyFact#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see generator.EGeographyValue
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EGeographyValue value);

} // GeographyFact
