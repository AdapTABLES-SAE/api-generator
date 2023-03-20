/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.RoomType#getName <em>Name</em>}</li>
 *   <li>{@link generator.RoomType#getElementPositions <em>Element Positions</em>}</li>
 *   <li>{@link generator.RoomType#getStructurePositions <em>Structure Positions</em>}</li>
 *   <li>{@link generator.RoomType#getStatementPositions <em>Statement Positions</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getRoomType()
 * @model abstract="true"
 * @generated
 */
public interface RoomType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generator.GeneratorPackage#getRoomType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generator.RoomType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Element Positions</b></em>' containment reference list.
	 * The list contents are of type {@link generator.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Positions</em>' containment reference list.
	 * @see generator.GeneratorPackage#getRoomType_ElementPositions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Position> getElementPositions();

	/**
	 * Returns the value of the '<em><b>Structure Positions</b></em>' containment reference list.
	 * The list contents are of type {@link generator.StructurePosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Positions</em>' containment reference list.
	 * @see generator.GeneratorPackage#getRoomType_StructurePositions()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructurePosition> getStructurePositions();

	/**
	 * Returns the value of the '<em><b>Statement Positions</b></em>' containment reference list.
	 * The list contents are of type {@link generator.StatementPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement Positions</em>' containment reference list.
	 * @see generator.GeneratorPackage#getRoomType_StatementPositions()
	 * @model containment="true"
	 * @generated
	 */
	EList<StatementPosition> getStatementPositions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Directions> getDirections();

} // RoomType
