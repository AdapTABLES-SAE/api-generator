/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identification Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.IdentificationTask#getType <em>Type</em>}</li>
 *   <li>{@link generator.IdentificationTask#isCheckOnLearnerAction <em>Check On Learner Action</em>}</li>
 *   <li>{@link generator.IdentificationTask#isNoStatementTask <em>No Statement Task</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getIdentificationTask()
 * @model abstract="true"
 * @generated
 */
public interface IdentificationTask extends ATask {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"IDENTIFY"</code>.
	 * The literals are from the enumeration {@link generator.ETaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.ETaskType
	 * @see generator.GeneratorPackage#getIdentificationTask_Type()
	 * @model default="IDENTIFY" transient="true" changeable="false"
	 * @generated
	 */
	ETaskType getType();

	/**
	 * Returns the value of the '<em><b>Check On Learner Action</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check On Learner Action</em>' attribute.
	 * @see #setCheckOnLearnerAction(boolean)
	 * @see generator.GeneratorPackage#getIdentificationTask_CheckOnLearnerAction()
	 * @model default="false"
	 * @generated
	 */
	boolean isCheckOnLearnerAction();

	/**
	 * Sets the value of the '{@link generator.IdentificationTask#isCheckOnLearnerAction <em>Check On Learner Action</em>}' attribute.
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
	 * @see generator.GeneratorPackage#getIdentificationTask_NoStatementTask()
	 * @model default="false"
	 * @generated
	 */
	boolean isNoStatementTask();

	/**
	 * Sets the value of the '{@link generator.IdentificationTask#isNoStatementTask <em>No Statement Task</em>}' attribute.
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

} // IdentificationTask
