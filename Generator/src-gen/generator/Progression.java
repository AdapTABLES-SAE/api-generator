/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Progression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Progression#getPlayerProgress <em>Player Progress</em>}</li>
 *   <li>{@link generator.Progression#getLearnerProgress <em>Learner Progress</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getProgression()
 * @model
 * @generated
 */
public interface Progression extends EObject {
	/**
	 * Returns the value of the '<em><b>Player Progress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Progress</em>' containment reference.
	 * @see #setPlayerProgress(PlayerProgress)
	 * @see generator.GeneratorPackage#getProgression_PlayerProgress()
	 * @model containment="true"
	 * @generated
	 */
	PlayerProgress getPlayerProgress();

	/**
	 * Sets the value of the '{@link generator.Progression#getPlayerProgress <em>Player Progress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Progress</em>' containment reference.
	 * @see #getPlayerProgress()
	 * @generated
	 */
	void setPlayerProgress(PlayerProgress value);

	/**
	 * Returns the value of the '<em><b>Learner Progress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learner Progress</em>' containment reference.
	 * @see #setLearnerProgress(LearnerProgress)
	 * @see generator.GeneratorPackage#getProgression_LearnerProgress()
	 * @model containment="true"
	 * @generated
	 */
	LearnerProgress getLearnerProgress();

	/**
	 * Sets the value of the '{@link generator.Progression#getLearnerProgress <em>Learner Progress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learner Progress</em>' containment reference.
	 * @see #getLearnerProgress()
	 * @generated
	 */
	void setLearnerProgress(LearnerProgress value);

} // Progression
