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
 *   <li>{@link generator.GameDescription#getGameplays <em>Gameplays</em>}</li>
 *   <li>{@link generator.GameDescription#getElements <em>Elements</em>}</li>
 *   <li>{@link generator.GameDescription#getAbilities <em>Abilities</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Gameplays</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameplays</em>' containment reference.
	 * @see #setGameplays(Gameplays)
	 * @see generator.GeneratorPackage#getGameDescription_Gameplays()
	 * @model containment="true"
	 * @generated
	 */
	Gameplays getGameplays();

	/**
	 * Sets the value of the '{@link generator.GameDescription#getGameplays <em>Gameplays</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gameplays</em>' containment reference.
	 * @see #getGameplays()
	 * @generated
	 */
	void setGameplays(Gameplays value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference.
	 * @see #setElements(GameElementTypes)
	 * @see generator.GeneratorPackage#getGameDescription_Elements()
	 * @model containment="true"
	 * @generated
	 */
	GameElementTypes getElements();

	/**
	 * Sets the value of the '{@link generator.GameDescription#getElements <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements</em>' containment reference.
	 * @see #getElements()
	 * @generated
	 */
	void setElements(GameElementTypes value);

	/**
	 * Returns the value of the '<em><b>Abilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abilities</em>' containment reference.
	 * @see #setAbilities(Abilities)
	 * @see generator.GeneratorPackage#getGameDescription_Abilities()
	 * @model containment="true"
	 * @generated
	 */
	Abilities getAbilities();

	/**
	 * Sets the value of the '{@link generator.GameDescription#getAbilities <em>Abilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abilities</em>' containment reference.
	 * @see #getAbilities()
	 * @generated
	 */
	void setAbilities(Abilities value);

} // GameDescription
