/**
 */
package generatorMetamodels;

import java.util.Map;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>High Level Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.HighLevelActivity#getLevel <em>Level</em>}</li>
 *   <li>{@link generatorMetamodels.HighLevelActivity#getNumberOfQuestions <em>Number Of Questions</em>}</li>
 *   <li>{@link generatorMetamodels.HighLevelActivity#getGamingobjective <em>Gamingobjective</em>}</li>
 *   <li>{@link generatorMetamodels.HighLevelActivity#getSelectedMode <em>Selected Mode</em>}</li>
 *   <li>{@link generatorMetamodels.HighLevelActivity#getRoomTypesByPercentage <em>Room Types By Percentage</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getHighLevelActivity()
 * @model
 * @generated
 */
public interface HighLevelActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' reference.
	 * @see #setLevel(Level)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getHighLevelActivity_Level()
	 * @model required="true"
	 * @generated
	 */
	Level getLevel();

	/**
	 * Sets the value of the '{@link generatorMetamodels.HighLevelActivity#getLevel <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Level value);

	/**
	 * Returns the value of the '<em><b>Number Of Questions</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Questions</em>' attribute.
	 * @see #setNumberOfQuestions(int)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getHighLevelActivity_NumberOfQuestions()
	 * @model default="10"
	 * @generated
	 */
	int getNumberOfQuestions();

	/**
	 * Sets the value of the '{@link generatorMetamodels.HighLevelActivity#getNumberOfQuestions <em>Number Of Questions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Questions</em>' attribute.
	 * @see #getNumberOfQuestions()
	 * @generated
	 */
	void setNumberOfQuestions(int value);

	/**
	 * Returns the value of the '<em><b>Gamingobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamingobjective</em>' reference.
	 * @see #setGamingobjective(GamingObjective)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getHighLevelActivity_Gamingobjective()
	 * @model required="true"
	 * @generated
	 */
	GamingObjective getGamingobjective();

	/**
	 * Sets the value of the '{@link generatorMetamodels.HighLevelActivity#getGamingobjective <em>Gamingobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamingobjective</em>' reference.
	 * @see #getGamingobjective()
	 * @generated
	 */
	void setGamingobjective(GamingObjective value);

	/**
	 * Returns the value of the '<em><b>Selected Mode</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link generatorMetamodels.GameMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Mode</em>' attribute.
	 * @see generatorMetamodels.GameMode
	 * @see #setSelectedMode(GameMode)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getHighLevelActivity_SelectedMode()
	 * @model default="NONE"
	 * @generated
	 */
	GameMode getSelectedMode();

	/**
	 * Sets the value of the '{@link generatorMetamodels.HighLevelActivity#getSelectedMode <em>Selected Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Mode</em>' attribute.
	 * @see generatorMetamodels.GameMode
	 * @see #getSelectedMode()
	 * @generated
	 */
	void setSelectedMode(GameMode value);

	/**
	 * Returns the value of the '<em><b>Room Types By Percentage</b></em>' map.
	 * The key is of type {@link generatorMetamodels.RoomType},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Types By Percentage</em>' map.
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getHighLevelActivity_RoomTypesByPercentage()
	 * @model mapType="generatorMetamodels.RoomTypeToEIntMap&lt;generatorMetamodels.RoomType, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<RoomType, Integer> getRoomTypesByPercentage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model entryMapType="generatorMetamodels.RoomTypeToEIntMap&lt;generatorMetamodels.RoomType, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	void addRoomPercentage(Map.Entry<RoomType, Integer> entry);

} // HighLevelActivity
