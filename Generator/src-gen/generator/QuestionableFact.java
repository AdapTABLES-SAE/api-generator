/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionable Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.QuestionableFact#getQfresults <em>Qfresults</em>}</li>
 *   <li>{@link generator.QuestionableFact#isAchieved <em>Achieved</em>}</li>
 *   <li>{@link generator.QuestionableFact#isWasSelected <em>Was Selected</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getQuestionableFact()
 * @model abstract="true"
 * @generated
 */
public interface QuestionableFact extends EObject {
	/**
	 * Returns the value of the '<em><b>Qfresults</b></em>' containment reference list.
	 * The list contents are of type {@link generator.QFResults}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qfresults</em>' containment reference list.
	 * @see generator.GeneratorPackage#getQuestionableFact_Qfresults()
	 * @model containment="true"
	 * @generated
	 */
	EList<QFResults> getQfresults();

	/**
	 * Returns the value of the '<em><b>Achieved</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Achieved</em>' attribute.
	 * @see #setAchieved(boolean)
	 * @see generator.GeneratorPackage#getQuestionableFact_Achieved()
	 * @model default="false"
	 * @generated
	 */
	boolean isAchieved();

	/**
	 * Sets the value of the '{@link generator.QuestionableFact#isAchieved <em>Achieved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Achieved</em>' attribute.
	 * @see #isAchieved()
	 * @generated
	 */
	void setAchieved(boolean value);

	/**
	 * Returns the value of the '<em><b>Was Selected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Was Selected</em>' attribute.
	 * @see #setWasSelected(boolean)
	 * @see generator.GeneratorPackage#getQuestionableFact_WasSelected()
	 * @model default="false"
	 * @generated
	 */
	boolean isWasSelected();

	/**
	 * Sets the value of the '{@link generator.QuestionableFact#isWasSelected <em>Was Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Was Selected</em>' attribute.
	 * @see #isWasSelected()
	 * @generated
	 */
	void setWasSelected(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getQuestionableFact();

} // QuestionableFact
