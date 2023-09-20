/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HLegend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.HLegend#getNbMissingElements <em>Nb Missing Elements</em>}</li>
 *   <li>{@link generator.HLegend#getMissing <em>Missing</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getHLegend()
 * @model
 * @generated
 */
public interface HLegend extends CompletionTask {
	/**
	 * Returns the value of the '<em><b>Nb Missing Elements</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Missing Elements</em>' attribute.
	 * @see #isSetNbMissingElements()
	 * @see generator.GeneratorPackage#getHLegend_NbMissingElements()
	 * @model default="1" unsettable="true" transient="true" changeable="false"
	 * @generated
	 */
	int getNbMissingElements();

	/**
	 * Returns whether the value of the '{@link generator.HLegend#getNbMissingElements <em>Nb Missing Elements</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Missing Elements</em>' attribute is set.
	 * @see #getNbMissingElements()
	 * @generated
	 */
	boolean isSetNbMissingElements();

	/**
	 * Returns the value of the '<em><b>Missing</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link generator.ELegendTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing</em>' attribute.
	 * @see generator.ELegendTarget
	 * @see #setMissing(ELegendTarget)
	 * @see generator.GeneratorPackage#getHLegend_Missing()
	 * @model default=""
	 * @generated
	 */
	ELegendTarget getMissing();

	/**
	 * Sets the value of the '{@link generator.HLegend#getMissing <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing</em>' attribute.
	 * @see generator.ELegendTarget
	 * @see #getMissing()
	 * @generated
	 */
	void setMissing(ELegendTarget value);

} // HLegend
