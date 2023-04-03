/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Positioned Structure Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.PositionedStructureElement#getCreatedPosition <em>Created Position</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getPositionedStructureElement()
 * @model
 * @generated
 */
public interface PositionedStructureElement extends PositionedElement {
	/**
	 * Returns the value of the '<em><b>Created Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Position</em>' containment reference.
	 * @see #setCreatedPosition(APosition)
	 * @see generator.GeneratorPackage#getPositionedStructureElement_CreatedPosition()
	 * @model containment="true"
	 * @generated
	 */
	APosition getCreatedPosition();

	/**
	 * Sets the value of the '{@link generator.PositionedStructureElement#getCreatedPosition <em>Created Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Position</em>' containment reference.
	 * @see #getCreatedPosition()
	 * @generated
	 */
	void setCreatedPosition(APosition value);

} // PositionedStructureElement
