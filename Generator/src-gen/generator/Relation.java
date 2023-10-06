/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Relation#getTask <em>Task</em>}</li>
 *   <li>{@link generator.Relation#getGameplays <em>Gameplays</em>}</li>
 *   <li>{@link generator.Relation#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.ETaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' attribute.
	 * @see generator.ETaskType
	 * @see #setTask(ETaskType)
	 * @see generator.GeneratorPackage#getRelation_Task()
	 * @model
	 * @generated
	 */
	ETaskType getTask();

	/**
	 * Sets the value of the '{@link generator.Relation#getTask <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' attribute.
	 * @see generator.ETaskType
	 * @see #getTask()
	 * @generated
	 */
	void setTask(ETaskType value);

	/**
	 * Returns the value of the '<em><b>Gameplays</b></em>' attribute list.
	 * The list contents are of type {@link generator.GPCategory}.
	 * The literals are from the enumeration {@link generator.GPCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameplays</em>' attribute list.
	 * @see generator.GPCategory
	 * @see generator.GeneratorPackage#getRelation_Gameplays()
	 * @model required="true"
	 * @generated
	 */
	EList<GPCategory> getGameplays();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see generator.GeneratorPackage#getRelation_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link generator.Relation#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // Relation
