/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dungeon OLD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.DungeonOLD#getNumberOfRooms <em>Number Of Rooms</em>}</li>
 *   <li>{@link generator.DungeonOLD#getGameobjective <em>Gameobjective</em>}</li>
 *   <li>{@link generator.DungeonOLD#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getDungeonOLD()
 * @model
 * @generated
 */
public interface DungeonOLD extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Rooms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Rooms</em>' attribute.
	 * @see #setNumberOfRooms(int)
	 * @see generator.GeneratorPackage#getDungeonOLD_NumberOfRooms()
	 * @model
	 * @generated
	 */
	int getNumberOfRooms();

	/**
	 * Sets the value of the '{@link generator.DungeonOLD#getNumberOfRooms <em>Number Of Rooms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Rooms</em>' attribute.
	 * @see #getNumberOfRooms()
	 * @generated
	 */
	void setNumberOfRooms(int value);

	/**
	 * Returns the value of the '<em><b>Gameobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameobjective</em>' reference.
	 * @see #setGameobjective(GameObjective)
	 * @see generator.GeneratorPackage#getDungeonOLD_Gameobjective()
	 * @model required="true"
	 * @generated
	 */
	GameObjective getGameobjective();

	/**
	 * Sets the value of the '{@link generator.DungeonOLD#getGameobjective <em>Gameobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gameobjective</em>' reference.
	 * @see #getGameobjective()
	 * @generated
	 */
	void setGameobjective(GameObjective value);

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link generator.RoomOLD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see generator.GeneratorPackage#getDungeonOLD_Rooms()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<RoomOLD> getRooms();

} // DungeonOLD
