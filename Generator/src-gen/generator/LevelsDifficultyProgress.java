/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Levels Difficulty Progress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.LevelsDifficultyProgress#getNbQRoomIncrease <em>Nb QRoom Increase</em>}</li>
 *   <li>{@link generator.LevelsDifficultyProgress#getNbNQRoomIncrease <em>Nb NQ Room Increase</em>}</li>
 *   <li>{@link generator.LevelsDifficultyProgress#getInitNbQRoom <em>Init Nb QRoom</em>}</li>
 *   <li>{@link generator.LevelsDifficultyProgress#getInitNbNQRoom <em>Init Nb NQ Room</em>}</li>
 *   <li>{@link generator.LevelsDifficultyProgress#getCursesAvailabilities <em>Curses Availabilities</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getLevelsDifficultyProgress()
 * @model
 * @generated
 */
public interface LevelsDifficultyProgress extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb QRoom Increase</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb QRoom Increase</em>' attribute.
	 * @see #setNbQRoomIncrease(int)
	 * @see generator.GeneratorPackage#getLevelsDifficultyProgress_NbQRoomIncrease()
	 * @model default="1"
	 * @generated
	 */
	int getNbQRoomIncrease();

	/**
	 * Sets the value of the '{@link generator.LevelsDifficultyProgress#getNbQRoomIncrease <em>Nb QRoom Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb QRoom Increase</em>' attribute.
	 * @see #getNbQRoomIncrease()
	 * @generated
	 */
	void setNbQRoomIncrease(int value);

	/**
	 * Returns the value of the '<em><b>Nb NQ Room Increase</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb NQ Room Increase</em>' attribute.
	 * @see #setNbNQRoomIncrease(int)
	 * @see generator.GeneratorPackage#getLevelsDifficultyProgress_NbNQRoomIncrease()
	 * @model default="1"
	 * @generated
	 */
	int getNbNQRoomIncrease();

	/**
	 * Sets the value of the '{@link generator.LevelsDifficultyProgress#getNbNQRoomIncrease <em>Nb NQ Room Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb NQ Room Increase</em>' attribute.
	 * @see #getNbNQRoomIncrease()
	 * @generated
	 */
	void setNbNQRoomIncrease(int value);

	/**
	 * Returns the value of the '<em><b>Init Nb QRoom</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Nb QRoom</em>' attribute.
	 * @see #setInitNbQRoom(int)
	 * @see generator.GeneratorPackage#getLevelsDifficultyProgress_InitNbQRoom()
	 * @model default="5"
	 * @generated
	 */
	int getInitNbQRoom();

	/**
	 * Sets the value of the '{@link generator.LevelsDifficultyProgress#getInitNbQRoom <em>Init Nb QRoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Nb QRoom</em>' attribute.
	 * @see #getInitNbQRoom()
	 * @generated
	 */
	void setInitNbQRoom(int value);

	/**
	 * Returns the value of the '<em><b>Init Nb NQ Room</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Nb NQ Room</em>' attribute.
	 * @see #setInitNbNQRoom(int)
	 * @see generator.GeneratorPackage#getLevelsDifficultyProgress_InitNbNQRoom()
	 * @model default="1"
	 * @generated
	 */
	int getInitNbNQRoom();

	/**
	 * Sets the value of the '{@link generator.LevelsDifficultyProgress#getInitNbNQRoom <em>Init Nb NQ Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Nb NQ Room</em>' attribute.
	 * @see #getInitNbNQRoom()
	 * @generated
	 */
	void setInitNbNQRoom(int value);

	/**
	 * Returns the value of the '<em><b>Curses Availabilities</b></em>' containment reference list.
	 * The list contents are of type {@link generator.CurseEligibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curses Availabilities</em>' containment reference list.
	 * @see generator.GeneratorPackage#getLevelsDifficultyProgress_CursesAvailabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<CurseEligibility> getCursesAvailabilities();

} // LevelsDifficultyProgress
