/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Results By Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ResultsByTask#getTask <em>Task</em>}</li>
 *   <li>{@link generator.ResultsByTask#getQuestionedfacts <em>Questionedfacts</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getResultsByTask()
 * @model
 * @generated
 */
public interface ResultsByTask extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(ATask)
	 * @see generator.GeneratorPackage#getResultsByTask_Task()
	 * @model
	 * @generated
	 */
	ATask getTask();

	/**
	 * Sets the value of the '{@link generator.ResultsByTask#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(ATask value);

	/**
	 * Returns the value of the '<em><b>Questionedfacts</b></em>' containment reference list.
	 * The list contents are of type {@link generator.QuestionedFact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionedfacts</em>' containment reference list.
	 * @see generator.GeneratorPackage#getResultsByTask_Questionedfacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionedFact> getQuestionedfacts();

} // ResultsByTask
