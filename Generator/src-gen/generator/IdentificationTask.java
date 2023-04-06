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
 *   <li>{@link generator.IdentificationTask#isCheckLearnerAction <em>Check Learner Action</em>}</li>
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
	 * Returns the value of the '<em><b>Check Learner Action</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Learner Action</em>' attribute.
	 * @see #setCheckLearnerAction(boolean)
	 * @see generator.GeneratorPackage#getIdentificationTask_CheckLearnerAction()
	 * @model default="false"
	 * @generated
	 */
	boolean isCheckLearnerAction();

	/**
	 * Sets the value of the '{@link generator.IdentificationTask#isCheckLearnerAction <em>Check Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Learner Action</em>' attribute.
	 * @see #isCheckLearnerAction()
	 * @generated
	 */
	void setCheckLearnerAction(boolean value);

} // IdentificationTask
