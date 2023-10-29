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
 *   <li>{@link generator.GeographyLegendFact#getLegend <em>Legend</em>}</li>
 *   <li>{@link generator.GeographyLegendFact#getSymbolPosition <em>Symbol Position</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGeographyLegendFact()
 * @model
 * @generated
 */
public interface GeographyLegendFact extends AbstractFact {
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

	/**
	 * Returns the value of the '<em><b>Symbol Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol Position</em>' reference.
	 * @see #setSymbolPosition(VisualizationPosition)
	 * @see generator.GeneratorPackage#getGeographyLegendFact_SymbolPosition()
	 * @model required="true"
	 * @generated
	 */
	VisualizationPosition getSymbolPosition();

	/**
	 * Sets the value of the '{@link generator.GeographyLegendFact#getSymbolPosition <em>Symbol Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol Position</em>' reference.
	 * @see #getSymbolPosition()
	 * @generated
	 */
	void setSymbolPosition(VisualizationPosition value);

} // GeographyLegendFact
