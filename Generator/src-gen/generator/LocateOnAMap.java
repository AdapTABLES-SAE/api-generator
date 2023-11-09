/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locate On AMap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.LocateOnAMap#getNbExpectedAnswers <em>Nb Expected Answers</em>}</li>
 *   <li>{@link generator.LocateOnAMap#isLearnersChoices <em>Learners Choices</em>}</li>
 *   <li>{@link generator.LocateOnAMap#isGraphicTask <em>Graphic Task</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getLocateOnAMap()
 * @model
 * @generated
 */
public interface LocateOnAMap extends MembershipIDTask {
	/**
	 * Returns the value of the '<em><b>Nb Expected Answers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Expected Answers</em>' attribute.
	 * @see #setNbExpectedAnswers(int)
	 * @see generator.GeneratorPackage#getLocateOnAMap_NbExpectedAnswers()
	 * @model
	 * @generated
	 */
	int getNbExpectedAnswers();

	/**
	 * Sets the value of the '{@link generator.LocateOnAMap#getNbExpectedAnswers <em>Nb Expected Answers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Expected Answers</em>' attribute.
	 * @see #getNbExpectedAnswers()
	 * @generated
	 */
	void setNbExpectedAnswers(int value);

	/**
	 * Returns the value of the '<em><b>Learners Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learners Choices</em>' attribute.
	 * @see #setLearnersChoices(boolean)
	 * @see generator.GeneratorPackage#getLocateOnAMap_LearnersChoices()
	 * @model
	 * @generated
	 */
	boolean isLearnersChoices();

	/**
	 * Sets the value of the '{@link generator.LocateOnAMap#isLearnersChoices <em>Learners Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learners Choices</em>' attribute.
	 * @see #isLearnersChoices()
	 * @generated
	 */
	void setLearnersChoices(boolean value);

	/**
	 * Returns the value of the '<em><b>Graphic Task</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphic Task</em>' attribute.
	 * @see #setGraphicTask(boolean)
	 * @see generator.GeneratorPackage#getLocateOnAMap_GraphicTask()
	 * @model default="true"
	 * @generated
	 */
	boolean isGraphicTask();

	/**
	 * Sets the value of the '{@link generator.LocateOnAMap#isGraphicTask <em>Graphic Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic Task</em>' attribute.
	 * @see #isGraphicTask()
	 * @generated
	 */
	void setGraphicTask(boolean value);

} // LocateOnAMap
