/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Visualization#getPositions <em>Positions</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getVisualization()
 * @model
 * @generated
 */
public interface Visualization extends Image {
	/**
	 * Returns the value of the '<em><b>Positions</b></em>' containment reference list.
	 * The list contents are of type {@link generator.VisualizationPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positions</em>' containment reference list.
	 * @see generator.GeneratorPackage#getVisualization_Positions()
	 * @model containment="true"
	 * @generated
	 */
	EList<VisualizationPosition> getPositions();

} // Visualization
