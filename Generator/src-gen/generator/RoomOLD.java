/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room OLD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.RoomOLD#getSouth <em>South</em>}</li>
 *   <li>{@link generator.RoomOLD#getNorth <em>North</em>}</li>
 *   <li>{@link generator.RoomOLD#getEast <em>East</em>}</li>
 *   <li>{@link generator.RoomOLD#getWest <em>West</em>}</li>
 *   <li>{@link generator.RoomOLD#getRoomtype <em>Roomtype</em>}</li>
 *   <li>{@link generator.RoomOLD#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getRoomOLD()
 * @model abstract="true"
 * @generated
 */
public interface RoomOLD extends EObject {
	/**
	 * Returns the value of the '<em><b>South</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>South</em>' containment reference.
	 * @see #setSouth(Pathway)
	 * @see generator.GeneratorPackage#getRoomOLD_South()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pathway getSouth();

	/**
	 * Sets the value of the '{@link generator.RoomOLD#getSouth <em>South</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>South</em>' containment reference.
	 * @see #getSouth()
	 * @generated
	 */
	void setSouth(Pathway value);

	/**
	 * Returns the value of the '<em><b>North</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>North</em>' containment reference.
	 * @see #setNorth(Pathway)
	 * @see generator.GeneratorPackage#getRoomOLD_North()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pathway getNorth();

	/**
	 * Sets the value of the '{@link generator.RoomOLD#getNorth <em>North</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>North</em>' containment reference.
	 * @see #getNorth()
	 * @generated
	 */
	void setNorth(Pathway value);

	/**
	 * Returns the value of the '<em><b>East</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>East</em>' containment reference.
	 * @see #setEast(Pathway)
	 * @see generator.GeneratorPackage#getRoomOLD_East()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pathway getEast();

	/**
	 * Sets the value of the '{@link generator.RoomOLD#getEast <em>East</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>East</em>' containment reference.
	 * @see #getEast()
	 * @generated
	 */
	void setEast(Pathway value);

	/**
	 * Returns the value of the '<em><b>West</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>West</em>' containment reference.
	 * @see #setWest(Pathway)
	 * @see generator.GeneratorPackage#getRoomOLD_West()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pathway getWest();

	/**
	 * Sets the value of the '{@link generator.RoomOLD#getWest <em>West</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>West</em>' containment reference.
	 * @see #getWest()
	 * @generated
	 */
	void setWest(Pathway value);

	/**
	 * Returns the value of the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomtype</em>' reference.
	 * @see #setRoomtype(RoomType2)
	 * @see generator.GeneratorPackage#getRoomOLD_Roomtype()
	 * @model required="true"
	 * @generated
	 */
	RoomType2 getRoomtype();

	/**
	 * Sets the value of the '{@link generator.RoomOLD#getRoomtype <em>Roomtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomtype</em>' reference.
	 * @see #getRoomtype()
	 * @generated
	 */
	void setRoomtype(RoomType2 value);

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' containment reference.
	 * @see #setInitialState(State)
	 * @see generator.GeneratorPackage#getRoomOLD_InitialState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link generator.RoomOLD#getInitialState <em>Initial State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' containment reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

} // RoomOLD
