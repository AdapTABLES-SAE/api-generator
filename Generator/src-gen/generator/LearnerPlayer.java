/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Learner Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.LearnerPlayer#getProgression <em>Progression</em>}</li>
 *   <li>{@link generator.LearnerPlayer#getName <em>Name</em>}</li>
 *   <li>{@link generator.LearnerPlayer#getLearningpath <em>Learningpath</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getLearnerPlayer()
 * @model
 * @generated
 */
public interface LearnerPlayer extends EObject {
	/**
	 * Returns the value of the '<em><b>Progression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progression</em>' containment reference.
	 * @see #setProgression(Progression)
	 * @see generator.GeneratorPackage#getLearnerPlayer_Progression()
	 * @model containment="true"
	 * @generated
	 */
	Progression getProgression();

	/**
	 * Sets the value of the '{@link generator.LearnerPlayer#getProgression <em>Progression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progression</em>' containment reference.
	 * @see #getProgression()
	 * @generated
	 */
	void setProgression(Progression value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generator.GeneratorPackage#getLearnerPlayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generator.LearnerPlayer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Learningpath</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learningpath</em>' reference.
	 * @see #setLearningpath(LearningPath)
	 * @see generator.GeneratorPackage#getLearnerPlayer_Learningpath()
	 * @model required="true"
	 * @generated
	 */
	LearningPath getLearningpath();

	/**
	 * Sets the value of the '{@link generator.LearnerPlayer#getLearningpath <em>Learningpath</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learningpath</em>' reference.
	 * @see #getLearningpath()
	 * @generated
	 */
	void setLearningpath(LearningPath value);

} // LearnerPlayer
