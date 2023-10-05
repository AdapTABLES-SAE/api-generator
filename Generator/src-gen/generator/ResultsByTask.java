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
 *   <li>{@link generator.ResultsByTask#getQuestionableFacts <em>Questionable Facts</em>}</li>
 *   <li>{@link generator.ResultsByTask#getSuccessPercent <em>Success Percent</em>}</li>
 *   <li>{@link generator.ResultsByTask#getEncountersPercent <em>Encounters Percent</em>}</li>
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
	 * Returns the value of the '<em><b>Questionable Facts</b></em>' containment reference list.
	 * The list contents are of type {@link generator.AQuestionableFact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionable Facts</em>' containment reference list.
	 * @see generator.GeneratorPackage#getResultsByTask_QuestionableFacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<AQuestionableFact> getQuestionableFacts();

	/**
	 * Returns the value of the '<em><b>Success Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Percent</em>' attribute.
	 * @see #setSuccessPercent(double)
	 * @see generator.GeneratorPackage#getResultsByTask_SuccessPercent()
	 * @model derived="true"
	 * @generated
	 */
	double getSuccessPercent();

	/**
	 * Sets the value of the '{@link generator.ResultsByTask#getSuccessPercent <em>Success Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Percent</em>' attribute.
	 * @see #getSuccessPercent()
	 * @generated
	 */
	void setSuccessPercent(double value);

	/**
	 * Returns the value of the '<em><b>Encounters Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encounters Percent</em>' attribute.
	 * @see #setEncountersPercent(double)
	 * @see generator.GeneratorPackage#getResultsByTask_EncountersPercent()
	 * @model derived="true"
	 * @generated
	 */
	double getEncountersPercent();

	/**
	 * Sets the value of the '{@link generator.ResultsByTask#getEncountersPercent <em>Encounters Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounters Percent</em>' attribute.
	 * @see #getEncountersPercent()
	 * @generated
	 */
	void setEncountersPercent(double value);

} // ResultsByTask
