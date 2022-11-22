/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link generator.GameDescription#getElements <em>Elements</em>}</li>
 *   <li>{@link generator.GameDescription#getGameplays <em>Gameplays</em>}</li>
 *   <li>{@link generator.GameDescription#getElementtypes <em>Elementtypes</em>}</li>
 *   <li>{@link generator.GameDescription#getAbilities <em>Abilities</em>}</li>
 *   <li>{@link generator.GameDescription#getRoomtypes <em>Roomtypes</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGameDescription()
 * @model
 * @generated
 */
public interface GameDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference.
	 * @see #setElements(Elements)
	 * @see generator.GeneratorPackage#getGameDescription_Elements()
	 * @model containment="true"
	 * @generated
	 */
	Elements getElements();

	/**
	 * Sets the value of the '{@link generator.GameDescription#getElements <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements</em>' containment reference.
	 * @see #getElements()
	 * @generated
	 */
	void setElements(Elements value);

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
	 * Returns the value of the '<em><b>Elementtypes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementtypes</em>' containment reference.
	 * @see #setElementtypes(ElementTypes)
	 * @see generator.GeneratorPackage#getGameDescription_Elementtypes()
	 * @model containment="true"
	 * @generated
	 */
	ElementTypes getElementtypes();

	/**
	 * Sets the value of the '{@link generator.GameDescription#getElementtypes <em>Elementtypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elementtypes</em>' containment reference.
	 * @see #getElementtypes()
	 * @generated
	 */
	void setElementtypes(ElementTypes value);

	/**
	 * Returns the value of the '<em><b>Abilities</b></em>' containment reference list.
	 * The list contents are of type {@link generator.Abilities}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abilities</em>' containment reference list.
	 * @see generator.GeneratorPackage#getGameDescription_Abilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Abilities> getAbilities();

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

} // GameDescription
