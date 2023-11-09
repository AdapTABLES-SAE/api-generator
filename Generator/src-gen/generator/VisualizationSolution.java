/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.VisualizationSolution#getValue <em>Value</em>}</li>
 *   <li>{@link generator.VisualizationSolution#getVisualizationPosition <em>Visualization Position</em>}</li>
 *   <li>{@link generator.VisualizationSolution#isImage <em>Image</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getVisualizationSolution()
 * @model
 * @generated
 */
public interface VisualizationSolution extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see generator.GeneratorPackage#getVisualizationSolution_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link generator.VisualizationSolution#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Visualization Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization Position</em>' reference.
	 * @see #setVisualizationPosition(VisualizationPosition)
	 * @see generator.GeneratorPackage#getVisualizationSolution_VisualizationPosition()
	 * @model required="true"
	 * @generated
	 */
	VisualizationPosition getVisualizationPosition();

	/**
	 * Sets the value of the '{@link generator.VisualizationSolution#getVisualizationPosition <em>Visualization Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visualization Position</em>' reference.
	 * @see #getVisualizationPosition()
	 * @generated
	 */
	void setVisualizationPosition(VisualizationPosition value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(boolean)
	 * @see generator.GeneratorPackage#getVisualizationSolution_Image()
	 * @model
	 * @generated
	 */
	boolean isImage();

	/**
	 * Sets the value of the '{@link generator.VisualizationSolution#isImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #isImage()
	 * @generated
	 */
	void setImage(boolean value);

} // VisualizationSolution
