/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AVizualisation Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.AVizualisationQuestionableFact#getVizualisation <em>Vizualisation</em>}</li>
 *   <li>{@link generator.AVizualisationQuestionableFact#getVizualisationSolutions <em>Vizualisation Solutions</em>}</li>
 *   <li>{@link generator.AVizualisationQuestionableFact#getConsigne <em>Consigne</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getAVizualisationQuestionableFact()
 * @model abstract="true"
 * @generated
 */
public interface AVizualisationQuestionableFact extends AQuestionableFact {
	/**
	 * Returns the value of the '<em><b>Vizualisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vizualisation</em>' reference.
	 * @see #setVizualisation(Vizualisation)
	 * @see generator.GeneratorPackage#getAVizualisationQuestionableFact_Vizualisation()
	 * @model required="true"
	 * @generated
	 */
	Vizualisation getVizualisation();

	/**
	 * Sets the value of the '{@link generator.AVizualisationQuestionableFact#getVizualisation <em>Vizualisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vizualisation</em>' reference.
	 * @see #getVizualisation()
	 * @generated
	 */
	void setVizualisation(Vizualisation value);

	/**
	 * Returns the value of the '<em><b>Vizualisation Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link generator.VizualisationSolution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vizualisation Solutions</em>' containment reference list.
	 * @see generator.GeneratorPackage#getAVizualisationQuestionableFact_VizualisationSolutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<VizualisationSolution> getVizualisationSolutions();

	/**
	 * Returns the value of the '<em><b>Consigne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consigne</em>' attribute.
	 * @see #setConsigne(String)
	 * @see generator.GeneratorPackage#getAVizualisationQuestionableFact_Consigne()
	 * @model
	 * @generated
	 */
	String getConsigne();

	/**
	 * Sets the value of the '{@link generator.AVizualisationQuestionableFact#getConsigne <em>Consigne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consigne</em>' attribute.
	 * @see #getConsigne()
	 * @generated
	 */
	void setConsigne(String value);

} // AVizualisationQuestionableFact
