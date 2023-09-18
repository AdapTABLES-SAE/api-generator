/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geography Legend Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.GeographyLegendFact#getMap <em>Map</em>}</li>
 *   <li>{@link generator.GeographyLegendFact#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link generator.GeographyLegendFact#getLegend <em>Legend</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGeographyLegendFact()
 * @model
 * @generated
 */
public interface GeographyLegendFact extends AbstractFact {
	/**
	 * Returns the value of the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' reference.
	 * @see #setMap(Map)
	 * @see generator.GeneratorPackage#getGeographyLegendFact_Map()
	 * @model required="true"
	 * @generated
	 */
	Map getMap();

	/**
	 * Sets the value of the '{@link generator.GeographyLegendFact#getMap <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(Map value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' containment reference.
	 * @see #setSymbol(LegendSymbol)
	 * @see generator.GeneratorPackage#getGeographyLegendFact_Symbol()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LegendSymbol getSymbol();

	/**
	 * Sets the value of the '{@link generator.GeographyLegendFact#getSymbol <em>Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' containment reference.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(LegendSymbol value);

	/**
	 * Returns the value of the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend</em>' containment reference.
	 * @see #setLegend(LegendText)
	 * @see generator.GeneratorPackage#getGeographyLegendFact_Legend()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LegendText getLegend();

	/**
	 * Sets the value of the '{@link generator.GeographyLegendFact#getLegend <em>Legend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend</em>' containment reference.
	 * @see #getLegend()
	 * @generated
	 */
	void setLegend(LegendText value);

} // GeographyLegendFact
