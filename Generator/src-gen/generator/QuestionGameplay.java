/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Gameplay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.QuestionGameplay#isManualValidation <em>Manual Validation</em>}</li>
 *   <li>{@link generator.QuestionGameplay#getCategory <em>Category</em>}</li>
 *   <li>{@link generator.QuestionGameplay#isHasIntegratedPropositions <em>Has Integrated Propositions</em>}</li>
 *   <li>{@link generator.QuestionGameplay#getRestrictedTo <em>Restricted To</em>}</li>
 *   <li>{@link generator.QuestionGameplay#getStatementType <em>Statement Type</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getQuestionGameplay()
 * @model
 * @generated
 */
public interface QuestionGameplay extends Gameplay {
	/**
	 * Returns the value of the '<em><b>Manual Validation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Validation</em>' attribute.
	 * @see #setManualValidation(boolean)
	 * @see generator.GeneratorPackage#getQuestionGameplay_ManualValidation()
	 * @model default="false"
	 * @generated
	 */
	boolean isManualValidation();

	/**
	 * Sets the value of the '{@link generator.QuestionGameplay#isManualValidation <em>Manual Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Validation</em>' attribute.
	 * @see #isManualValidation()
	 * @generated
	 */
	void setManualValidation(boolean value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.GPCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see generator.GPCategory
	 * @see #setCategory(GPCategory)
	 * @see generator.GeneratorPackage#getQuestionGameplay_Category()
	 * @model
	 * @generated
	 */
	GPCategory getCategory();

	/**
	 * Sets the value of the '{@link generator.QuestionGameplay#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see generator.GPCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(GPCategory value);

	/**
	 * Returns the value of the '<em><b>Has Integrated Propositions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Integrated Propositions</em>' attribute.
	 * @see #setHasIntegratedPropositions(boolean)
	 * @see generator.GeneratorPackage#getQuestionGameplay_HasIntegratedPropositions()
	 * @model
	 * @generated
	 */
	boolean isHasIntegratedPropositions();

	/**
	 * Sets the value of the '{@link generator.QuestionGameplay#isHasIntegratedPropositions <em>Has Integrated Propositions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Integrated Propositions</em>' attribute.
	 * @see #isHasIntegratedPropositions()
	 * @generated
	 */
	void setHasIntegratedPropositions(boolean value);

	/**
	 * Returns the value of the '<em><b>Restricted To</b></em>' attribute list.
	 * The list contents are of type {@link generator.ETaskType}.
	 * The literals are from the enumeration {@link generator.ETaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricted To</em>' attribute list.
	 * @see generator.ETaskType
	 * @see generator.GeneratorPackage#getQuestionGameplay_RestrictedTo()
	 * @model
	 * @generated
	 */
	EList<ETaskType> getRestrictedTo();

	/**
	 * Returns the value of the '<em><b>Statement Type</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EStatementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement Type</em>' attribute.
	 * @see generator.EStatementType
	 * @see #setStatementType(EStatementType)
	 * @see generator.GeneratorPackage#getQuestionGameplay_StatementType()
	 * @model
	 * @generated
	 */
	EStatementType getStatementType();

	/**
	 * Sets the value of the '{@link generator.QuestionGameplay#getStatementType <em>Statement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Type</em>' attribute.
	 * @see generator.EStatementType
	 * @see #getStatementType()
	 * @generated
	 */
	void setStatementType(EStatementType value);

} // QuestionGameplay
