/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.GameDescription#getRoomtypes <em>Roomtypes</em>}</li>
 *   <li>{@link generator.GameDescription#getLevelsDifficultyProgress <em>Levels Difficulty Progress</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGameDescription()
 * @model
 * @generated
 */
public interface GameDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Roomtypes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomtypes</em>' containment reference.
	 * @see #setRoomtypes(RoomTypes)
	 * @see generator.GeneratorPackage#getGameDescription_Roomtypes()
	 * @model containment="true"
	 * @generated
	 */
	RoomTypes getRoomtypes();

	/**
	 * Sets the value of the '{@link generator.GameDescription#getRoomtypes <em>Roomtypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomtypes</em>' containment reference.
	 * @see #getRoomtypes()
	 * @generated
	 */
	void setRoomtypes(RoomTypes value);

	/**
	 * Returns the value of the '<em><b>Levels Difficulty Progress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels Difficulty Progress</em>' containment reference.
	 * @see #setLevelsDifficultyProgress(LevelsDifficultyProgress)
	 * @see generator.GeneratorPackage#getGameDescription_LevelsDifficultyProgress()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LevelsDifficultyProgress getLevelsDifficultyProgress();

	/**
	 * Sets the value of the '{@link generator.GameDescription#getLevelsDifficultyProgress <em>Levels Difficulty Progress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Levels Difficulty Progress</em>' containment reference.
	 * @see #getLevelsDifficultyProgress()
	 * @generated
	 */
	void setLevelsDifficultyProgress(LevelsDifficultyProgress value);

} // GameDescription
