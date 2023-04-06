/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Recontruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MTRecontruction#getNbMissingElements <em>Nb Missing Elements</em>}</li>
 *   <li>{@link generator.MTRecontruction#isCheckLearnerAction <em>Check Learner Action</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMTRecontruction()
 * @model
 * @generated
 */
public interface MTRecontruction extends CompletionTask {
	/**
	 * Returns the value of the '<em><b>Nb Missing Elements</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Missing Elements</em>' attribute.
	 * @see #isSetNbMissingElements()
	 * @see generator.GeneratorPackage#getMTRecontruction_NbMissingElements()
	 * @model default="3" unsettable="true" changeable="false"
	 * @generated
	 */
	int getNbMissingElements();

	/**
	 * Returns whether the value of the '{@link generator.MTRecontruction#getNbMissingElements <em>Nb Missing Elements</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Missing Elements</em>' attribute is set.
	 * @see #getNbMissingElements()
	 * @generated
	 */
	boolean isSetNbMissingElements();

	/**
	 * Returns the value of the '<em><b>Check Learner Action</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Learner Action</em>' attribute.
	 * @see #setCheckLearnerAction(boolean)
	 * @see generator.GeneratorPackage#getMTRecontruction_CheckLearnerAction()
	 * @model default="true"
	 * @generated
	 */
	boolean isCheckLearnerAction();

	/**
	 * Sets the value of the '{@link generator.MTRecontruction#isCheckLearnerAction <em>Check Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Learner Action</em>' attribute.
	 * @see #isCheckLearnerAction()
	 * @generated
	 */
	void setCheckLearnerAction(boolean value);

} // MTRecontruction
