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
 *   <li>{@link generator.ResultsByTask#getSucessPercent <em>Sucess Percent</em>}</li>
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
	 * Returns the value of the '<em><b>Questionedfacts</b></em>' containment reference list.
	 * The list contents are of type {@link generator.QuestionableFact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questionedfacts</em>' containment reference list.
	 * @see generator.GeneratorPackage#getResultsByTask_Questionedfacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionableFact> getQuestionedfacts();

	/**
	 * Returns the value of the '<em><b>Sucess Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sucess Percent</em>' attribute.
	 * @see #setSucessPercent(double)
	 * @see generator.GeneratorPackage#getResultsByTask_SucessPercent()
	 * @model derived="true"
	 * @generated
	 */
	double getSucessPercent();

	/**
	 * Sets the value of the '{@link generator.ResultsByTask#getSucessPercent <em>Sucess Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sucess Percent</em>' attribute.
	 * @see #getSucessPercent()
	 * @generated
	 */
	void setSucessPercent(double value);

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
