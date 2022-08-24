/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.GameContent#getGameplays <em>Gameplays</em>}</li>
 *   <li>{@link generator.GameContent#getElements <em>Elements</em>}</li>
 *   <li>{@link generator.GameContent#getGameobjectives <em>Gameobjectives</em>}</li>
 *   <li>{@link generator.GameContent#getRoomtype <em>Roomtype</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGameContent()
 * @model
 * @generated
 */
public interface GameContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Gameplays</b></em>' containment reference list.
	 * The list contents are of type {@link generator.Gameplay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameplays</em>' containment reference list.
	 * @see generator.GeneratorPackage#getGameContent_Gameplays()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Gameplay> getGameplays();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link generator.ElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see generator.GeneratorPackage#getGameContent_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementType> getElements();

	/**
	 * Returns the value of the '<em><b>Gameobjectives</b></em>' containment reference list.
	 * The list contents are of type {@link generator.GameObjective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameobjectives</em>' containment reference list.
	 * @see generator.GeneratorPackage#getGameContent_Gameobjectives()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GameObjective> getGameobjectives();

	/**
	 * Returns the value of the '<em><b>Roomtype</b></em>' containment reference list.
	 * The list contents are of type {@link generator.RoomType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomtype</em>' containment reference list.
	 * @see generator.GeneratorPackage#getGameContent_Roomtype()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoomType2> getRoomtype();

} // GameContent
