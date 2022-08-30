/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Learning Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.LearningPath#getName <em>Name</em>}</li>
 *   <li>{@link generator.LearningPath#getLearningobjective <em>Learningobjective</em>}</li>
 *   <li>{@link generator.LearningPath#getKnowledge <em>Knowledge</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getLearningPath()
 * @model
 * @generated
 */
public interface LearningPath extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generator.GeneratorPackage#getLearningPath_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generator.LearningPath#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Learningobjective</b></em>' containment reference list.
	 * The list contents are of type {@link generator.LearningObjective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learningobjective</em>' containment reference list.
	 * @see generator.GeneratorPackage#getLearningPath_Learningobjective()
	 * @model containment="true"
	 * @generated
	 */
	EList<LearningObjective> getLearningobjective();

	/**
	 * Returns the value of the '<em><b>Knowledge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge</em>' reference.
	 * @see #setKnowledge(Knowledge)
	 * @see generator.GeneratorPackage#getLearningPath_Knowledge()
	 * @model required="true"
	 * @generated
	 */
	Knowledge getKnowledge();

	/**
	 * Sets the value of the '{@link generator.LearningPath#getKnowledge <em>Knowledge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knowledge</em>' reference.
	 * @see #getKnowledge()
	 * @generated
	 */
	void setKnowledge(Knowledge value);

} // LearningPath
