/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legend Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.LegendQuestionableFact#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getLegendQuestionableFact()
 * @model
 * @generated
 */
public interface LegendQuestionableFact extends AVisualizationQuestionableFact {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.ELegendTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see generator.ELegendTarget
	 * @see #setTarget(ELegendTarget)
	 * @see generator.GeneratorPackage#getLegendQuestionableFact_Target()
	 * @model
	 * @generated
	 */
	ELegendTarget getTarget();

	/**
	 * Sets the value of the '{@link generator.LegendQuestionableFact#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see generator.ELegendTarget
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ELegendTarget value);

} // LegendQuestionableFact
