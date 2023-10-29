/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Judo Questionable Classify Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.JudoQuestionableClassifyFact#getCategory <em>Category</em>}</li>
 *   <li>{@link generator.JudoQuestionableClassifyFact#getTechniques <em>Techniques</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getJudoQuestionableClassifyFact()
 * @model
 * @generated
 */
public interface JudoQuestionableClassifyFact extends QuestionableFact {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see generator.GeneratorPackage#getJudoQuestionableClassifyFact_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link generator.JudoQuestionableClassifyFact#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Techniques</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Techniques</em>' attribute list.
	 * @see generator.GeneratorPackage#getJudoQuestionableClassifyFact_Techniques()
	 * @model
	 * @generated
	 */
	EList<String> getTechniques();

} // JudoQuestionableClassifyFact
