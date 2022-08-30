/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Task#getTasktype <em>Tasktype</em>}</li>
 *   <li>{@link generator.Task#getPercentageOfApparition <em>Percentage Of Apparition</em>}</li>
 *   <li>{@link generator.Task#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}</li>
 *   <li>{@link generator.Task#getPercentageOfValidFacts <em>Percentage Of Valid Facts</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasktype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasktype</em>' reference.
	 * @see #setTasktype(TaskType)
	 * @see generator.GeneratorPackage#getTask_Tasktype()
	 * @model required="true"
	 * @generated
	 */
	TaskType getTasktype();

	/**
	 * Sets the value of the '{@link generator.Task#getTasktype <em>Tasktype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tasktype</em>' reference.
	 * @see #getTasktype()
	 * @generated
	 */
	void setTasktype(TaskType value);

	/**
	 * Returns the value of the '<em><b>Percentage Of Apparition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Apparition</em>' attribute.
	 * @see #setPercentageOfApparition(int)
	 * @see generator.GeneratorPackage#getTask_PercentageOfApparition()
	 * @model
	 * @generated
	 */
	int getPercentageOfApparition();

	/**
	 * Sets the value of the '{@link generator.Task#getPercentageOfApparition <em>Percentage Of Apparition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Apparition</em>' attribute.
	 * @see #getPercentageOfApparition()
	 * @generated
	 */
	void setPercentageOfApparition(int value);

	/**
	 * Returns the value of the '<em><b>Nb Consecutive Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Consecutive Success</em>' attribute.
	 * @see #setNbConsecutiveSuccess(int)
	 * @see generator.GeneratorPackage#getTask_NbConsecutiveSuccess()
	 * @model
	 * @generated
	 */
	int getNbConsecutiveSuccess();

	/**
	 * Sets the value of the '{@link generator.Task#getNbConsecutiveSuccess <em>Nb Consecutive Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Consecutive Success</em>' attribute.
	 * @see #getNbConsecutiveSuccess()
	 * @generated
	 */
	void setNbConsecutiveSuccess(int value);

	/**
	 * Returns the value of the '<em><b>Percentage Of Valid Facts</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Valid Facts</em>' attribute.
	 * @see #setPercentageOfValidFacts(int)
	 * @see generator.GeneratorPackage#getTask_PercentageOfValidFacts()
	 * @model default="0"
	 * @generated
	 */
	int getPercentageOfValidFacts();

	/**
	 * Sets the value of the '{@link generator.Task#getPercentageOfValidFacts <em>Percentage Of Valid Facts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Valid Facts</em>' attribute.
	 * @see #getPercentageOfValidFacts()
	 * @generated
	 */
	void setPercentageOfValidFacts(int value);

} // Task
