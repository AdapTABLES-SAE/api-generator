/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.TaskType#getName <em>Name</em>}</li>
 *   <li>{@link generator.TaskType#getResponsemodalities <em>Responsemodalities</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getTaskType()
 * @model abstract="true"
 * @generated
 */
public interface TaskType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generator.GeneratorPackage#getTaskType_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generator.TaskType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Responsemodalities</b></em>' reference list.
	 * The list contents are of type {@link generator.ResponseModality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsemodalities</em>' reference list.
	 * @see generator.GeneratorPackage#getTaskType_Responsemodalities()
	 * @model upper="2"
	 * @generated
	 */
	EList<ResponseModality> getResponsemodalities();

} // TaskType
