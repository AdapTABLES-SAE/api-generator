/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Learning Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.LearningDomain#getLearningpaths <em>Learningpaths</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getLearningDomain()
 * @model
 * @generated
 */
public interface LearningDomain extends EObject {
	/**
	 * Returns the value of the '<em><b>Learningpaths</b></em>' containment reference list.
	 * The list contents are of type {@link generator.LearningPath}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learningpaths</em>' containment reference list.
	 * @see generator.GeneratorPackage#getLearningDomain_Learningpaths()
	 * @model containment="true"
	 * @generated
	 */
	EList<LearningPath> getLearningpaths();

} // LearningDomain
