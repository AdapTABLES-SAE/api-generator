/**
 */
package generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Learner Players</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.LearnerPlayers#getLearnerPlayers <em>Learner Players</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getLearnerPlayers()
 * @model
 * @generated
 */
public interface LearnerPlayers extends EObject {
	/**
	 * Returns the value of the '<em><b>Learner Players</b></em>' containment reference list.
	 * The list contents are of type {@link generator.LearnerPlayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learner Players</em>' containment reference list.
	 * @see generator.GeneratorPackage#getLearnerPlayers_LearnerPlayers()
	 * @model containment="true"
	 * @generated
	 */
	EList<LearnerPlayer> getLearnerPlayers();

} // LearnerPlayers
