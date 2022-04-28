/**
 */
package generatorMetamodels;

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
 *   <li>{@link generatorMetamodels.Dungeon#getMode <em>Mode</em>}</li>
 *   <li>{@link generatorMetamodels.Dungeon#getRooms <em>Rooms</em>}</li>
 *   <li>{@link generatorMetamodels.Dungeon#getEntry <em>Entry</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getDungeon()
 * @model
 * @generated
 */
public interface Dungeon extends EObject {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The default value is <code>"LINEAR"</code>.
	 * The literals are from the enumeration {@link generatorMetamodels.GameMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see generatorMetamodels.GameMode
	 * @see #setMode(GameMode)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getDungeon_Mode()
	 * @model default="LINEAR"
	 * @generated
	 */
	GameMode getMode();

	/**
	 * Sets the value of the '{@link generatorMetamodels.Dungeon#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see generatorMetamodels.GameMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(GameMode value);

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link generatorMetamodels.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getDungeon_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry</em>' reference.
	 * @see #setEntry(EntryRoom)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getDungeon_Entry()
	 * @model required="true"
	 * @generated
	 */
	EntryRoom getEntry();

	/**
	 * Sets the value of the '{@link generatorMetamodels.Dungeon#getEntry <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry</em>' reference.
	 * @see #getEntry()
	 * @generated
	 */
	void setEntry(EntryRoom value);

} // Dungeon
