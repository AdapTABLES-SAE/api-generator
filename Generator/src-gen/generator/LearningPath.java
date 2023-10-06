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
 *   <li>{@link generator.LearningPath#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link generator.LearningPath#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link generator.LearningPath#getID <em>ID</em>}</li>
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
	 * Returns the value of the '<em><b>Objectives</b></em>' containment reference list.
	 * The list contents are of type {@link generator.Objective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectives</em>' containment reference list.
	 * @see generator.GeneratorPackage#getLearningPath_Objectives()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Objective> getObjectives();

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

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #setID(String)
	 * @see generator.GeneratorPackage#getLearningPath_ID()
	 * @model unsettable="true" id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link generator.LearningPath#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Unsets the value of the '{@link generator.LearningPath#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	void unsetID();

	/**
	 * Returns whether the value of the '{@link generator.LearningPath#getID <em>ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID</em>' attribute is set.
	 * @see #unsetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	boolean isSetID();

} // LearningPath
