/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Membership ID Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MembershipIDTask#getType <em>Type</em>}</li>
 *   <li>{@link generator.MembershipIDTask#isIdentifySharedProperty <em>Identify Shared Property</em>}</li>
 *   <li>{@link generator.MembershipIDTask#isCheckLearnerAction <em>Check Learner Action</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMembershipIDTask()
 * @model abstract="true"
 * @generated
 */
public interface MembershipIDTask extends ATask {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"MEMBERSHIP"</code>.
	 * The literals are from the enumeration {@link generator.ETaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.ETaskType
	 * @see generator.GeneratorPackage#getMembershipIDTask_Type()
	 * @model default="MEMBERSHIP" transient="true" changeable="false"
	 * @generated
	 */
	ETaskType getType();

	/**
	 * Returns the value of the '<em><b>Identify Shared Property</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identify Shared Property</em>' attribute.
	 * @see #setIdentifySharedProperty(boolean)
	 * @see generator.GeneratorPackage#getMembershipIDTask_IdentifySharedProperty()
	 * @model default="true"
	 * @generated
	 */
	boolean isIdentifySharedProperty();

	/**
	 * Sets the value of the '{@link generator.MembershipIDTask#isIdentifySharedProperty <em>Identify Shared Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identify Shared Property</em>' attribute.
	 * @see #isIdentifySharedProperty()
	 * @generated
	 */
	void setIdentifySharedProperty(boolean value);

	/**
	 * Returns the value of the '<em><b>Check Learner Action</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Learner Action</em>' attribute.
	 * @see #setCheckLearnerAction(boolean)
	 * @see generator.GeneratorPackage#getMembershipIDTask_CheckLearnerAction()
	 * @model default="false"
	 * @generated
	 */
	boolean isCheckLearnerAction();

	/**
	 * Sets the value of the '{@link generator.MembershipIDTask#isCheckLearnerAction <em>Check Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Learner Action</em>' attribute.
	 * @see #isCheckLearnerAction()
	 * @generated
	 */
	void setCheckLearnerAction(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getNbExpectedAnswers();

} // MembershipIDTask
