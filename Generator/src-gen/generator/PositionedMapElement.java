/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Positioned Map Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.PositionedMapElement#getCreatedPositions <em>Created Positions</em>}</li>
 *   <li>{@link generator.PositionedMapElement#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getPositionedMapElement()
 * @model
 * @generated
 */
public interface PositionedMapElement extends PositionedElement {
	/**
	 * Returns the value of the '<em><b>Created Positions</b></em>' containment reference list.
	 * The list contents are of type {@link generator.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Positions</em>' containment reference list.
	 * @see generator.GeneratorPackage#getPositionedMapElement_CreatedPositions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Position> getCreatedPositions();

	/**
	 * Returns the value of the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' reference.
	 * @see #setMap(Map)
	 * @see generator.GeneratorPackage#getPositionedMapElement_Map()
	 * @model
	 * @generated
	 */
	Map getMap();

	/**
	 * Sets the value of the '{@link generator.PositionedMapElement#getMap <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(Map value);

} // PositionedMapElement
