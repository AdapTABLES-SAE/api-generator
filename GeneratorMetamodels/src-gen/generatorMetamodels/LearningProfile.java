/**
 */
package generatorMetamodels;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Learning Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.LearningProfile#getLearningpath <em>Learningpath</em>}</li>
 *   <li>{@link generatorMetamodels.LearningProfile#getCurrentprogressions <em>Currentprogressions</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearningProfile()
 * @model
 * @generated
 */
public interface LearningProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Learningpath</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learningpath</em>' reference.
	 * @see #setLearningpath(LearningPath)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearningProfile_Learningpath()
	 * @model required="true"
	 * @generated
	 */
	LearningPath getLearningpath();

	/**
	 * Sets the value of the '{@link generatorMetamodels.LearningProfile#getLearningpath <em>Learningpath</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learningpath</em>' reference.
	 * @see #getLearningpath()
	 * @generated
	 */
	void setLearningpath(LearningPath value);

	/**
	 * Returns the value of the '<em><b>Currentprogressions</b></em>' containment reference list.
	 * The list contents are of type {@link generatorMetamodels.CurrentProgression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currentprogressions</em>' containment reference list.
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearningProfile_Currentprogressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<CurrentProgression> getCurrentprogressions();

} // LearningProfile
