/**
 */
package generatorMetamodels;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Learning Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.LearningObjective#getLevels <em>Levels</em>}</li>
 *   <li>{@link generatorMetamodels.LearningObjective#getSetoffacts <em>Setoffacts</em>}</li>
 *   <li>{@link generatorMetamodels.LearningObjective#getID <em>ID</em>}</li>
 *   <li>{@link generatorMetamodels.LearningObjective#getName <em>Name</em>}</li>
 *   <li>{@link generatorMetamodels.LearningObjective#getPrerequisites <em>Prerequisites</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearningObjective()
 * @model
 * @generated
 */
public interface LearningObjective extends EObject {
	/**
	 * Returns the value of the '<em><b>Levels</b></em>' containment reference list.
	 * The list contents are of type {@link generatorMetamodels.Level}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' containment reference list.
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearningObjective_Levels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Level> getLevels();

	/**
	 * Returns the value of the '<em><b>Setoffacts</b></em>' reference list.
	 * The list contents are of type {@link generatorMetamodels.SetOfFacts}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setoffacts</em>' reference list.
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearningObjective_Setoffacts()
	 * @model
	 * @generated
	 */
	EList<SetOfFacts> getSetoffacts();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearningObjective_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link generatorMetamodels.LearningObjective#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearningObjective_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generatorMetamodels.LearningObjective#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Prerequisites</b></em>' containment reference list.
	 * The list contents are of type {@link generatorMetamodels.Prerequisite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerequisites</em>' containment reference list.
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearningObjective_Prerequisites()
	 * @model containment="true"
	 * @generated
	 */
	EList<Prerequisite> getPrerequisites();

} // LearningObjective
