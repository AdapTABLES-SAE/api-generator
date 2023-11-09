/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordering Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.OrderingTask#getType <em>Type</em>}</li>
 *   <li>{@link generator.OrderingTask#isCheckOnLearnerAction <em>Check On Learner Action</em>}</li>
 *   <li>{@link generator.OrderingTask#isNoStatementTask <em>No Statement Task</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getOrderingTask()
 * @model abstract="true"
 * @generated
 */
public interface OrderingTask extends ATask {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"ORDER"</code>.
	 * The literals are from the enumeration {@link generator.ETaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.ETaskType
	 * @see generator.GeneratorPackage#getOrderingTask_Type()
	 * @model default="ORDER" transient="true" changeable="false"
	 * @generated
	 */
	ETaskType getType();

	/**
	 * Returns the value of the '<em><b>Check On Learner Action</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check On Learner Action</em>' attribute.
	 * @see #setCheckOnLearnerAction(boolean)
	 * @see generator.GeneratorPackage#getOrderingTask_CheckOnLearnerAction()
	 * @model default="true"
	 * @generated
	 */
	boolean isCheckOnLearnerAction();

	/**
	 * Sets the value of the '{@link generator.OrderingTask#isCheckOnLearnerAction <em>Check On Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check On Learner Action</em>' attribute.
	 * @see #isCheckOnLearnerAction()
	 * @generated
	 */
	void setCheckOnLearnerAction(boolean value);

	/**
	 * Returns the value of the '<em><b>No Statement Task</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Statement Task</em>' attribute.
	 * @see #setNoStatementTask(boolean)
	 * @see generator.GeneratorPackage#getOrderingTask_NoStatementTask()
	 * @model default="false"
	 * @generated
	 */
	boolean isNoStatementTask();

	/**
	 * Sets the value of the '{@link generator.OrderingTask#isNoStatementTask <em>No Statement Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Statement Task</em>' attribute.
	 * @see #isNoStatementTask()
	 * @generated
	 */
	void setNoStatementTask(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getNbExpectedAnswers();

} // OrderingTask
