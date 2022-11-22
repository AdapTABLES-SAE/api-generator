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
 *   <li>{@link generator.LearningDomain#getTasktypes <em>Tasktypes</em>}</li>
 *   <li>{@link generator.LearningDomain#getResponsemodalities <em>Responsemodalities</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Tasktypes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasktypes</em>' containment reference.
	 * @see #setTasktypes(TaskTypes)
	 * @see generator.GeneratorPackage#getLearningDomain_Tasktypes()
	 * @model containment="true"
	 * @generated
	 */
	TaskTypes getTasktypes();

	/**
	 * Sets the value of the '{@link generator.LearningDomain#getTasktypes <em>Tasktypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tasktypes</em>' containment reference.
	 * @see #getTasktypes()
	 * @generated
	 */
	void setTasktypes(TaskTypes value);

	/**
	 * Returns the value of the '<em><b>Responsemodalities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsemodalities</em>' containment reference.
	 * @see #setResponsemodalities(ResponseModalities)
	 * @see generator.GeneratorPackage#getLearningDomain_Responsemodalities()
	 * @model containment="true"
	 * @generated
	 */
	ResponseModalities getResponsemodalities();

	/**
	 * Sets the value of the '{@link generator.LearningDomain#getResponsemodalities <em>Responsemodalities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsemodalities</em>' containment reference.
	 * @see #getResponsemodalities()
	 * @generated
	 */
	void setResponsemodalities(ResponseModalities value);

} // LearningDomain
