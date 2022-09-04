/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Room#getX <em>X</em>}</li>
 *   <li>{@link generator.Room#getY <em>Y</em>}</li>
 *   <li>{@link generator.Room#getRoomaccess <em>Roomaccess</em>}</li>
 *   <li>{@link generator.Room#getRoomtype <em>Roomtype</em>}</li>
 *   <li>{@link generator.Room#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see generator.GeneratorPackage#getRoom_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link generator.Room#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see generator.GeneratorPackage#getRoom_Y()
	 * @model
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link generator.Room#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Roomaccess</b></em>' containment reference list.
	 * The list contents are of type {@link generator.RoomAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomaccess</em>' containment reference list.
	 * @see generator.GeneratorPackage#getRoom_Roomaccess()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoomAccess> getRoomaccess();

	/**
	 * Returns the value of the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomtype</em>' reference.
	 * @see #setRoomtype(RoomType)
	 * @see generator.GeneratorPackage#getRoom_Roomtype()
	 * @model required="true"
	 * @generated
	 */
	RoomType getRoomtype();

	/**
	 * Sets the value of the '{@link generator.Room#getRoomtype <em>Roomtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomtype</em>' reference.
	 * @see #getRoomtype()
	 * @generated
	 */
	void setRoomtype(RoomType value);

	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' containment reference.
	 * @see #setQuestion(Question)
	 * @see generator.GeneratorPackage#getRoom_Question()
	 * @model containment="true"
	 * @generated
	 */
	Question getQuestion();

	/**
	 * Sets the value of the '{@link generator.Room#getQuestion <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' containment reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(Question value);

} // Room
