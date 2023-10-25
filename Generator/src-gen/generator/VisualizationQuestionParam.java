/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization Question Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.VisualizationQuestionParam#getVisualization <em>Visualization</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getVisualizationQuestionParam()
 * @model
 * @generated
 */
public interface VisualizationQuestionParam extends AQuestionParam {
	/**
	 * Returns the value of the '<em><b>Visualization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization</em>' reference.
	 * @see #setVisualization(Visualization)
	 * @see generator.GeneratorPackage#getVisualizationQuestionParam_Visualization()
	 * @model required="true"
	 * @generated
	 */
	Visualization getVisualization();

	/**
	 * Sets the value of the '{@link generator.VisualizationQuestionParam#getVisualization <em>Visualization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visualization</em>' reference.
	 * @see #getVisualization()
	 * @generated
	 */
	void setVisualization(Visualization value);

} // VisualizationQuestionParam
