/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identify Arbitration Gesture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.IdentifyArbitrationGesture#getNbMissingElements <em>Nb Missing Elements</em>}</li>
 *   <li>{@link generator.IdentifyArbitrationGesture#isCheckOnLearnerAction <em>Check On Learner Action</em>}</li>
 *   <li>{@link generator.IdentifyArbitrationGesture#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getIdentifyArbitrationGesture()
 * @model
 * @generated
 */
public interface IdentifyArbitrationGesture extends CompletionTask {
	/**
	 * Returns the value of the '<em><b>Nb Missing Elements</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Missing Elements</em>' attribute.
	 * @see #isSetNbMissingElements()
	 * @see generator.GeneratorPackage#getIdentifyArbitrationGesture_NbMissingElements()
	 * @model default="2" unsettable="true" transient="true" changeable="false"
	 * @generated
	 */
	int getNbMissingElements();

	/**
	 * Returns whether the value of the '{@link generator.IdentifyArbitrationGesture#getNbMissingElements <em>Nb Missing Elements</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Missing Elements</em>' attribute is set.
	 * @see #getNbMissingElements()
	 * @generated
	 */
	boolean isSetNbMissingElements();

	/**
	 * Returns the value of the '<em><b>Check On Learner Action</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check On Learner Action</em>' attribute.
	 * @see #setCheckOnLearnerAction(boolean)
	 * @see generator.GeneratorPackage#getIdentifyArbitrationGesture_CheckOnLearnerAction()
	 * @model default="true"
	 * @generated
	 */
	boolean isCheckOnLearnerAction();

	/**
	 * Sets the value of the '{@link generator.IdentifyArbitrationGesture#isCheckOnLearnerAction <em>Check On Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check On Learner Action</em>' attribute.
	 * @see #isCheckOnLearnerAction()
	 * @generated
	 */
	void setCheckOnLearnerAction(boolean value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EJudoTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see generator.EJudoTarget
	 * @see #setSource(EJudoTarget)
	 * @see generator.GeneratorPackage#getIdentifyArbitrationGesture_Source()
	 * @model
	 * @generated
	 */
	EJudoTarget getSource();

	/**
	 * Sets the value of the '{@link generator.IdentifyArbitrationGesture#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see generator.EJudoTarget
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EJudoTarget value);

} // IdentifyArbitrationGesture
