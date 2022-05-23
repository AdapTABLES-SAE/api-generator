/**
 */
package generatorMetamodels;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Learning Paths</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.LearningPaths#getLearningpaths <em>Learningpaths</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearningPaths()
 * @model
 * @generated
 */
public interface LearningPaths extends EObject {
	/**
	 * Returns the value of the '<em><b>Learningpaths</b></em>' containment reference list.
	 * The list contents are of type {@link generatorMetamodels.LearningPath}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learningpaths</em>' containment reference list.
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearningPaths_Learningpaths()
	 * @model containment="true"
	 * @generated
	 */
	EList<LearningPath> getLearningpaths();

} // LearningPaths
