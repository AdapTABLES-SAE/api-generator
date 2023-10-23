/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AVisualization Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.AVisualizationQuestionableFact#getVisualization <em>Visualization</em>}</li>
 *   <li>{@link generator.AVisualizationQuestionableFact#getVisualizationSolutions <em>Visualization Solutions</em>}</li>
 *   <li>{@link generator.AVisualizationQuestionableFact#getConsigne <em>Consigne</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getAVisualizationQuestionableFact()
 * @model abstract="true"
 * @generated
 */
public interface AVisualizationQuestionableFact extends AQuestionableFact {
	/**
	 * Returns the value of the '<em><b>Visualization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization</em>' reference.
	 * @see #setVisualization(Visualization)
	 * @see generator.GeneratorPackage#getAVisualizationQuestionableFact_Visualization()
	 * @model required="true"
	 * @generated
	 */
	Visualization getVisualization();

	/**
	 * Sets the value of the '{@link generator.AVisualizationQuestionableFact#getVisualization <em>Visualization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visualization</em>' reference.
	 * @see #getVisualization()
	 * @generated
	 */
	void setVisualization(Visualization value);

	/**
	 * Returns the value of the '<em><b>Visualization Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link generator.VisualizationSolution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization Solutions</em>' containment reference list.
	 * @see generator.GeneratorPackage#getAVisualizationQuestionableFact_VisualizationSolutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<VisualizationSolution> getVisualizationSolutions();

	/**
	 * Returns the value of the '<em><b>Consigne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consigne</em>' attribute.
	 * @see #setConsigne(String)
	 * @see generator.GeneratorPackage#getAVisualizationQuestionableFact_Consigne()
	 * @model
	 * @generated
	 */
	String getConsigne();

	/**
	 * Sets the value of the '{@link generator.AVisualizationQuestionableFact#getConsigne <em>Consigne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consigne</em>' attribute.
	 * @see #getConsigne()
	 * @generated
	 */
	void setConsigne(String value);

} // AVisualizationQuestionableFact
