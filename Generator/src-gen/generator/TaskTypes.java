/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.TaskTypes#getTasktypes <em>Tasktypes</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getTaskTypes()
 * @model
 * @generated
 */
public interface TaskTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasktypes</b></em>' containment reference list.
	 * The list contents are of type {@link generator.TaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasktypes</em>' containment reference list.
	 * @see generator.GeneratorPackage#getTaskTypes_Tasktypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskType> getTasktypes();

} // TaskTypes
