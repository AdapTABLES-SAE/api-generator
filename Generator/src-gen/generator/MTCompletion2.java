/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Completion2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MTCompletion2#getTargets <em>Targets</em>}</li>
 *   <li>{@link generator.MTCompletion2#getNbMissingElements <em>Nb Missing Elements</em>}</li>
 *   <li>{@link generator.MTCompletion2#isCheckOnLearnerAction <em>Check On Learner Action</em>}</li>
 *   <li>{@link generator.MTCompletion2#isNoStatementTask <em>No Statement Task</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMTCompletion2()
 * @model
 * @generated
 */
public interface MTCompletion2 extends CompletionTask {
	/**
	 * Returns the value of the '<em><b>Targets</b></em>' attribute list.
	 * The list contents are of type {@link generator.ESeveralTarget}.
	 * The literals are from the enumeration {@link generator.ESeveralTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' attribute list.
	 * @see generator.ESeveralTarget
	 * @see generator.GeneratorPackage#getMTCompletion2_Targets()
	 * @model required="true"
	 * @generated
	 */
	EList<ESeveralTarget> getTargets();

	/**
	 * Returns the value of the '<em><b>Nb Missing Elements</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Missing Elements</em>' attribute.
	 * @see #isSetNbMissingElements()
	 * @see generator.GeneratorPackage#getMTCompletion2_NbMissingElements()
	 * @model default="2" unsettable="true" transient="true" changeable="false"
	 * @generated
	 */
	int getNbMissingElements();

	/**
	 * Returns whether the value of the '{@link generator.MTCompletion2#getNbMissingElements <em>Nb Missing Elements</em>}' attribute is set.
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
	 * @see generator.GeneratorPackage#getMTCompletion2_CheckOnLearnerAction()
	 * @model default="true"
	 * @generated
	 */
	boolean isCheckOnLearnerAction();

	/**
	 * Sets the value of the '{@link generator.MTCompletion2#isCheckOnLearnerAction <em>Check On Learner Action</em>}' attribute.
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
	 * @see generator.GeneratorPackage#getMTCompletion2_NoStatementTask()
	 * @model default="false"
	 * @generated
	 */
	boolean isNoStatementTask();

	/**
	 * Sets the value of the '{@link generator.MTCompletion2#isNoStatementTask <em>No Statement Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Statement Task</em>' attribute.
	 * @see #isNoStatementTask()
	 * @generated
	 */
	void setNoStatementTask(boolean value);

} // MTCompletion2
