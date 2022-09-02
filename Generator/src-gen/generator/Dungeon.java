/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dungeon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Dungeon#getRooms <em>Rooms</em>}</li>
 *   <li>{@link generator.Dungeon#getMode <em>Mode</em>}</li>
 *   <li>{@link generator.Dungeon#getEntry <em>Entry</em>}</li>
 *   <li>{@link generator.Dungeon#getLevel <em>Level</em>}</li>
 *   <li>{@link generator.Dungeon#getLearningobjective <em>Learningobjective</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getDungeon()
 * @model
 * @generated
 */
public interface Dungeon extends EObject {
	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link generator.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see generator.GeneratorPackage#getDungeon_Rooms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.DungeonMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see generator.DungeonMode
	 * @see #setMode(DungeonMode)
	 * @see generator.GeneratorPackage#getDungeon_Mode()
	 * @model
	 * @generated
	 */
	DungeonMode getMode();

	/**
	 * Sets the value of the '{@link generator.Dungeon#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see generator.DungeonMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(DungeonMode value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' reference.
	 * @see #setEntry(Room)
	 * @see generator.GeneratorPackage#getDungeon_Entry()
	 * @model required="true"
	 * @generated
	 */
	Room getEntry();

	/**
	 * Sets the value of the '{@link generator.Dungeon#getEntry <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(Room value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(Level)
	 * @see generator.GeneratorPackage#getDungeon_Level()
	 * @model required="true"
	 * @generated
	 */
	Level getLevel();

	/**
	 * Sets the value of the '{@link generator.Dungeon#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Level value);

	/**
	 * Returns the value of the '<em><b>Learningobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learningobjective</em>' reference.
	 * @see #setLearningobjective(LearningObjective)
	 * @see generator.GeneratorPackage#getDungeon_Learningobjective()
	 * @model required="true"
	 * @generated
	 */
	LearningObjective getLearningobjective();

	/**
	 * Sets the value of the '{@link generator.Dungeon#getLearningobjective <em>Learningobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learningobjective</em>' reference.
	 * @see #getLearningobjective()
	 * @generated
	 */
	void setLearningobjective(LearningObjective value);

} // Dungeon
