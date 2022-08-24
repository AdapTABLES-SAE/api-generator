/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.RoomAccess#getDirection <em>Direction</em>}</li>
 *   <li>{@link generator.RoomAccess#getOtherroomaccess <em>Otherroomaccess</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getRoomAccess()
 * @model
 * @generated
 */
public interface RoomAccess extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.Directions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see generator.Directions
	 * @see #setDirection(Directions)
	 * @see generator.GeneratorPackage#getRoomAccess_Direction()
	 * @model
	 * @generated
	 */
	Directions getDirection();

	/**
	 * Sets the value of the '{@link generator.RoomAccess#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see generator.Directions
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Directions value);

	/**
	 * Returns the value of the '<em><b>Otherroomaccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otherroomaccess</em>' reference.
	 * @see #setOtherroomaccess(RoomAccess)
	 * @see generator.GeneratorPackage#getRoomAccess_Otherroomaccess()
	 * @model
	 * @generated
	 */
	RoomAccess getOtherroomaccess();

	/**
	 * Sets the value of the '{@link generator.RoomAccess#getOtherroomaccess <em>Otherroomaccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otherroomaccess</em>' reference.
	 * @see #getOtherroomaccess()
	 * @generated
	 */
	void setOtherroomaccess(RoomAccess value);

} // RoomAccess
