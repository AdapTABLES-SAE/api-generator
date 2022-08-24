/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.QuestionRoom#getSucessState <em>Sucess State</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getQuestionRoom()
 * @model
 * @generated
 */
public interface QuestionRoom extends RoomOLD {
	/**
	 * Returns the value of the '<em><b>Sucess State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sucess State</em>' containment reference.
	 * @see #setSucessState(State)
	 * @see generator.GeneratorPackage#getQuestionRoom_SucessState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	State getSucessState();

	/**
	 * Sets the value of the '{@link generator.QuestionRoom#getSucessState <em>Sucess State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sucess State</em>' containment reference.
	 * @see #getSucessState()
	 * @generated
	 */
	void setSucessState(State value);

} // QuestionRoom
