/**
 */
package generatorMetamodels;

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
 *   <li>{@link generatorMetamodels.LearningPath#getLearningobjectives <em>Learningobjectives</em>}</li>
 *   <li>{@link generatorMetamodels.LearningPath#getSubobjectives <em>Subobjectives</em>}</li>
 *   <li>{@link generatorMetamodels.LearningPath#getKnowledge <em>Knowledge</em>}</li>
 *   <li>{@link generatorMetamodels.LearningPath#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearningPath()
 * @model
 * @generated
 */
public interface LearningPath extends EObject {
	/**
	 * Returns the value of the '<em><b>Learningobjectives</b></em>' containment reference list.
	 * The list contents are of type {@link generatorMetamodels.LearningObjective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learningobjectives</em>' containment reference list.
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearningPath_Learningobjectives()
	 * @model containment="true"
	 * @generated
	 */
	EList<LearningObjective> getLearningobjectives();

	/**
	 * Returns the value of the '<em><b>Subobjectives</b></em>' containment reference list.
	 * The list contents are of type {@link generatorMetamodels.SubObjective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subobjectives</em>' containment reference list.
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearningPath_Subobjectives()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubObjective> getSubobjectives();

	/**
	 * Returns the value of the '<em><b>Knowledge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge</em>' reference.
	 * @see #setKnowledge(Knowledge)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearningPath_Knowledge()
	 * @model
	 * @generated
	 */
	Knowledge getKnowledge();

	/**
	 * Sets the value of the '{@link generatorMetamodels.LearningPath#getKnowledge <em>Knowledge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knowledge</em>' reference.
	 * @see #getKnowledge()
	 * @generated
	 */
	void setKnowledge(Knowledge value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearningPath_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generatorMetamodels.LearningPath#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LearningPath
