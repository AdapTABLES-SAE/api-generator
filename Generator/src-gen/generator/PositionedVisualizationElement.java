/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Positioned Visualization Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.PositionedVisualizationElement#getCreatedPositions <em>Created Positions</em>}</li>
 *   <li>{@link generator.PositionedVisualizationElement#getVisualization <em>Visualization</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getPositionedVisualizationElement()
 * @model
 * @generated
 */
public interface PositionedVisualizationElement extends PositionedElement {
	/**
	 * Returns the value of the '<em><b>Created Positions</b></em>' containment reference list.
	 * The list contents are of type {@link generator.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Positions</em>' containment reference list.
	 * @see generator.GeneratorPackage#getPositionedVisualizationElement_CreatedPositions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Position> getCreatedPositions();

	/**
	 * Returns the value of the '<em><b>Visualization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization</em>' reference.
	 * @see #setVisualization(Visualization)
	 * @see generator.GeneratorPackage#getPositionedVisualizationElement_Visualization()
	 * @model
	 * @generated
	 */
	Visualization getVisualization();

	/**
	 * Sets the value of the '{@link generator.PositionedVisualizationElement#getVisualization <em>Visualization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visualization</em>' reference.
	 * @see #getVisualization()
	 * @generated
	 */
	void setVisualization(Visualization value);

} // PositionedVisualizationElement
