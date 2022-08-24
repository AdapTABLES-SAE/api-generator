/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Roguelite Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.RogueliteContext#getNumberOfRooms <em>Number Of Rooms</em>}</li>
 *   <li>{@link generator.RogueliteContext#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getRogueliteContext()
 * @model
 * @generated
 */
public interface RogueliteContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Number Of Rooms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Rooms</em>' attribute.
	 * @see #setNumberOfRooms(int)
	 * @see generator.GeneratorPackage#getRogueliteContext_NumberOfRooms()
	 * @model
	 * @generated
	 */
	int getNumberOfRooms();

	/**
	 * Sets the value of the '{@link generator.RogueliteContext#getNumberOfRooms <em>Number Of Rooms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Rooms</em>' attribute.
	 * @see #getNumberOfRooms()
	 * @generated
	 */
	void setNumberOfRooms(int value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.DungeonMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see generator.DungeonMode
	 * @see #setMode(DungeonMode)
	 * @see generator.GeneratorPackage#getRogueliteContext_Mode()
	 * @model
	 * @generated
	 */
	DungeonMode getMode();

	/**
	 * Sets the value of the '{@link generator.RogueliteContext#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see generator.DungeonMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(DungeonMode value);

} // RogueliteContext
