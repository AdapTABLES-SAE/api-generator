/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Completion2 Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Completion2Task#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getCompletion2Task()
 * @model abstract="true"
 * @generated
 */
public interface Completion2Task extends ATask {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"COMPLETE2"</code>.
	 * The literals are from the enumeration {@link generator.ETaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.ETaskType
	 * @see generator.GeneratorPackage#getCompletion2Task_Type()
	 * @model default="COMPLETE2" transient="true" changeable="false"
	 * @generated
	 */
	ETaskType getType();

} // Completion2Task
