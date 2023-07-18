/**
 */
package generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Learner Progress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.LearnerProgress#getCurrentobjectivelevels <em>Currentobjectivelevels</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getLearnerProgress()
 * @model
 * @generated
 */
public interface LearnerProgress extends EObject {
	/**
	 * Returns the value of the '<em><b>Currentobjectivelevels</b></em>' containment reference list.
	 * The list contents are of type {@link generator.CurrentObjectiveLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currentobjectivelevels</em>' containment reference list.
	 * @see generator.GeneratorPackage#getLearnerProgress_Currentobjectivelevels()
	 * @model containment="true"
	 * @generated
	 */
	EList<CurrentObjectiveLevel> getCurrentobjectivelevels();

} // LearnerProgress
