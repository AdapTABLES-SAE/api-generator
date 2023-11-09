/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identify Technique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.IdentifyTechnique#getNbMissingElements <em>Nb Missing Elements</em>}</li>
 *   <li>{@link generator.IdentifyTechnique#isCheckOnLearnerAction <em>Check On Learner Action</em>}</li>
 *   <li>{@link generator.IdentifyTechnique#getMissing <em>Missing</em>}</li>
 *   <li>{@link generator.IdentifyTechnique#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getIdentifyTechnique()
 * @model
 * @generated
 */
public interface IdentifyTechnique extends CompletionTask {
	/**
	 * Returns the value of the '<em><b>Nb Missing Elements</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Missing Elements</em>' attribute.
	 * @see #isSetNbMissingElements()
	 * @see generator.GeneratorPackage#getIdentifyTechnique_NbMissingElements()
	 * @model default="1" unsettable="true" transient="true" changeable="false"
	 * @generated
	 */
	int getNbMissingElements();

	/**
	 * Returns whether the value of the '{@link generator.IdentifyTechnique#getNbMissingElements <em>Nb Missing Elements</em>}' attribute is set.
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
	 * @see generator.GeneratorPackage#getIdentifyTechnique_CheckOnLearnerAction()
	 * @model default="true"
	 * @generated
	 */
	boolean isCheckOnLearnerAction();

	/**
	 * Sets the value of the '{@link generator.IdentifyTechnique#isCheckOnLearnerAction <em>Check On Learner Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check On Learner Action</em>' attribute.
	 * @see #isCheckOnLearnerAction()
	 * @generated
	 */
	void setCheckOnLearnerAction(boolean value);

	/**
	 * Returns the value of the '<em><b>Missing</b></em>' attribute.
	 * The default value is <code>"TECHNIQUE"</code>.
	 * The literals are from the enumeration {@link generator.EJudoTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing</em>' attribute.
	 * @see generator.EJudoTarget
	 * @see #setMissing(EJudoTarget)
	 * @see generator.GeneratorPackage#getIdentifyTechnique_Missing()
	 * @model default="TECHNIQUE"
	 * @generated
	 */
	EJudoTarget getMissing();

	/**
	 * Sets the value of the '{@link generator.IdentifyTechnique#getMissing <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing</em>' attribute.
	 * @see generator.EJudoTarget
	 * @see #getMissing()
	 * @generated
	 */
	void setMissing(EJudoTarget value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EJudoTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see generator.EJudoTarget
	 * @see #setSource(EJudoTarget)
	 * @see generator.GeneratorPackage#getIdentifyTechnique_Source()
	 * @model
	 * @generated
	 */
	EJudoTarget getSource();

	/**
	 * Sets the value of the '{@link generator.IdentifyTechnique#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see generator.EJudoTarget
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EJudoTarget value);

} // IdentifyTechnique
