/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Completion1 Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Completion1Task#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getCompletion1Task()
 * @model abstract="true"
 * @generated
 */
public interface Completion1Task extends ATask {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"COMPLETE1"</code>.
	 * The literals are from the enumeration {@link generator.ETaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.ETaskType
	 * @see generator.GeneratorPackage#getCompletion1Task_Type()
	 * @model default="COMPLETE1" transient="true" changeable="false"
	 * @generated
	 */
	ETaskType getType();

} // Completion1Task
