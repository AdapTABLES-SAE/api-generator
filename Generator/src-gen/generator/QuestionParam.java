/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.QuestionParam#isInteractive <em>Interactive</em>}</li>
 *   <li>{@link generator.QuestionParam#getSolutions <em>Solutions</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getQuestionParam()
 * @model
 * @generated
 */
public interface QuestionParam extends Parameter {
	/**
	 * Returns the value of the '<em><b>Interactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactive</em>' attribute.
	 * @see #setInteractive(boolean)
	 * @see generator.GeneratorPackage#getQuestionParam_Interactive()
	 * @model
	 * @generated
	 */
	boolean isInteractive();

	/**
	 * Sets the value of the '{@link generator.QuestionParam#isInteractive <em>Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interactive</em>' attribute.
	 * @see #isInteractive()
	 * @generated
	 */
	void setInteractive(boolean value);

	/**
	 * Returns the value of the '<em><b>Solutions</b></em>' containment reference list.
	 * The list contents are of type {@link generator.FactSolutionParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solutions</em>' containment reference list.
	 * @see generator.GeneratorPackage#getQuestionParam_Solutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FactSolutionParam> getSolutions();

} // QuestionParam
