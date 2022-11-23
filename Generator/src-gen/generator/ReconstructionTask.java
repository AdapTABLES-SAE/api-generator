/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconstruction Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ReconstructionTask#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getReconstructionTask()
 * @model abstract="true"
 * @generated
 */
public interface ReconstructionTask extends ATask {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"REBUILD"</code>.
	 * The literals are from the enumeration {@link generator.ETaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.ETaskType
	 * @see generator.GeneratorPackage#getReconstructionTask_Type()
	 * @model default="REBUILD" changeable="false"
	 * @generated
	 */
	ETaskType getType();

} // ReconstructionTask
