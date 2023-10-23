/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vizualisation Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.VizualisationSolution#getValue <em>Value</em>}</li>
 *   <li>{@link generator.VizualisationSolution#getVizualisationPosition <em>Vizualisation Position</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getVizualisationSolution()
 * @model
 * @generated
 */
public interface VizualisationSolution extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see generator.GeneratorPackage#getVizualisationSolution_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link generator.VizualisationSolution#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Vizualisation Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vizualisation Position</em>' reference.
	 * @see #setVizualisationPosition(VizualisationPosition)
	 * @see generator.GeneratorPackage#getVizualisationSolution_VizualisationPosition()
	 * @model required="true"
	 * @generated
	 */
	VizualisationPosition getVizualisationPosition();

	/**
	 * Sets the value of the '{@link generator.VizualisationSolution#getVizualisationPosition <em>Vizualisation Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vizualisation Position</em>' reference.
	 * @see #getVizualisationPosition()
	 * @generated
	 */
	void setVizualisationPosition(VizualisationPosition value);

} // VizualisationSolution
