/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Type2 Gameplay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.TaskType2Gameplay#getGameplay <em>Gameplay</em>}</li>
 *   <li>{@link generator.TaskType2Gameplay#getTasktype <em>Tasktype</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getTaskType2Gameplay()
 * @model
 * @generated
 */
public interface TaskType2Gameplay extends ComplianceRelations {
	/**
	 * Returns the value of the '<em><b>Gameplay</b></em>' reference list.
	 * The list contents are of type {@link generator.Gameplay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameplay</em>' reference list.
	 * @see generator.GeneratorPackage#getTaskType2Gameplay_Gameplay()
	 * @model required="true"
	 * @generated
	 */
	EList<Gameplay> getGameplay();

	/**
	 * Returns the value of the '<em><b>Tasktype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasktype</em>' reference.
	 * @see #setTasktype(TaskType)
	 * @see generator.GeneratorPackage#getTaskType2Gameplay_Tasktype()
	 * @model required="true"
	 * @generated
	 */
	TaskType getTasktype();

	/**
	 * Sets the value of the '{@link generator.TaskType2Gameplay#getTasktype <em>Tasktype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tasktype</em>' reference.
	 * @see #getTasktype()
	 * @generated
	 */
	void setTasktype(TaskType value);

} // TaskType2Gameplay
