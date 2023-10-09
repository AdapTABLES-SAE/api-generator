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
 *   <li>{@link generator.Room#getQuestionedFacts <em>Questioned Facts</em>}</li>
 *   <li>{@link generator.Room#getTask <em>Task</em>}</li>
 *   <li>{@link generator.Room#getPositionedElement <em>Positioned Element</em>}</li>
 *   <li>{@link generator.Room#getGameplay <em>Gameplay</em>}</li>
 *   <li>{@link generator.Room#getNbExpectedAnswers <em>Nb Expected Answers</em>}</li>
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
	 * Returns the value of the '<em><b>Questioned Facts</b></em>' containment reference list.
	 * The list contents are of type {@link generator.QuestionedFact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questioned Facts</em>' containment reference list.
	 * @see generator.GeneratorPackage#getRoom_QuestionedFacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionedFact> getQuestionedFacts();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(ATask)
	 * @see generator.GeneratorPackage#getRoom_Task()
	 * @model
	 * @generated
	 */
	ATask getTask();

	/**
	 * Sets the value of the '{@link generator.Room#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(ATask value);

	/**
	 * Returns the value of the '<em><b>Positioned Element</b></em>' containment reference list.
	 * The list contents are of type {@link generator.PositionedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positioned Element</em>' containment reference list.
	 * @see generator.GeneratorPackage#getRoom_PositionedElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<PositionedElement> getPositionedElement();

	/**
	 * Returns the value of the '<em><b>Gameplay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameplay</em>' reference.
	 * @see #setGameplay(Gameplay)
	 * @see generator.GeneratorPackage#getRoom_Gameplay()
	 * @model
	 * @generated
	 */
	Gameplay getGameplay();

	/**
	 * Sets the value of the '{@link generator.Room#getGameplay <em>Gameplay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gameplay</em>' reference.
	 * @see #getGameplay()
	 * @generated
	 */
	void setGameplay(Gameplay value);

	/**
	 * Returns the value of the '<em><b>Nb Expected Answers</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Expected Answers</em>' attribute.
	 * @see #setNbExpectedAnswers(int)
	 * @see generator.GeneratorPackage#getRoom_NbExpectedAnswers()
	 * @model default="0" derived="true"
	 * @generated
	 */
	int getNbExpectedAnswers();

	/**
	 * Sets the value of the '{@link generator.Room#getNbExpectedAnswers <em>Nb Expected Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Expected Answers</em>' attribute.
	 * @see #getNbExpectedAnswers()
	 * @generated
	 */
	void setNbExpectedAnswers(int value);

} // Room
