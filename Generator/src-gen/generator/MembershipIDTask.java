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
 *   <li>{@link generator.MembershipIDTask#isCheckIsTrue <em>Check Is True</em>}</li>
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
	 * Returns the value of the '<em><b>Check Is True</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Is True</em>' attribute.
	 * @see #setCheckIsTrue(boolean)
	 * @see generator.GeneratorPackage#getMembershipIDTask_CheckIsTrue()
	 * @model default="true"
	 * @generated
	 */
	boolean isCheckIsTrue();

	/**
	 * Sets the value of the '{@link generator.MembershipIDTask#isCheckIsTrue <em>Check Is True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Is True</em>' attribute.
	 * @see #isCheckIsTrue()
	 * @generated
	 */
	void setCheckIsTrue(boolean value);

} // MembershipIDTask
