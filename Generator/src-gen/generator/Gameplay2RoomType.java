/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gameplay2 Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Gameplay2RoomType#getRoomtype <em>Roomtype</em>}</li>
 *   <li>{@link generator.Gameplay2RoomType#getGameplay <em>Gameplay</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGameplay2RoomType()
 * @model
 * @generated
 */
public interface Gameplay2RoomType extends ComplianceRelations {
	/**
	 * Returns the value of the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomtype</em>' reference.
	 * @see #setRoomtype(RoomType)
	 * @see generator.GeneratorPackage#getGameplay2RoomType_Roomtype()
	 * @model required="true"
	 * @generated
	 */
	RoomType getRoomtype();

	/**
	 * Sets the value of the '{@link generator.Gameplay2RoomType#getRoomtype <em>Roomtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomtype</em>' reference.
	 * @see #getRoomtype()
	 * @generated
	 */
	void setRoomtype(RoomType value);

	/**
	 * Returns the value of the '<em><b>Gameplay</b></em>' reference list.
	 * The list contents are of type {@link generator.Gameplay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameplay</em>' reference list.
	 * @see generator.GeneratorPackage#getGameplay2RoomType_Gameplay()
	 * @model required="true"
	 * @generated
	 */
	EList<Gameplay> getGameplay();

} // Gameplay2RoomType
