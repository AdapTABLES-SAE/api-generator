/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AQuestionable Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.AQuestionableFact#isWasSelected <em>Was Selected</em>}</li>
 *   <li>{@link generator.AQuestionableFact#isAchieved <em>Achieved</em>}</li>
 *   <li>{@link generator.AQuestionableFact#getResults <em>Results</em>}</li>
 *   <li>{@link generator.AQuestionableFact#getID <em>ID</em>}</li>
 *   <li>{@link generator.AQuestionableFact#isQuestionWithImage <em>Question With Image</em>}</li>
 *   <li>{@link generator.AQuestionableFact#getFacts <em>Facts</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getAQuestionableFact()
 * @model abstract="true"
 * @generated
 */
public interface AQuestionableFact extends EObject {
	/**
	 * Returns the value of the '<em><b>Was Selected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Was Selected</em>' attribute.
	 * @see #setWasSelected(boolean)
	 * @see generator.GeneratorPackage#getAQuestionableFact_WasSelected()
	 * @model default="false"
	 * @generated
	 */
	boolean isWasSelected();

	/**
	 * Sets the value of the '{@link generator.AQuestionableFact#isWasSelected <em>Was Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Was Selected</em>' attribute.
	 * @see #isWasSelected()
	 * @generated
	 */
	void setWasSelected(boolean value);

	/**
	 * Returns the value of the '<em><b>Achieved</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Achieved</em>' attribute.
	 * @see #setAchieved(boolean)
	 * @see generator.GeneratorPackage#getAQuestionableFact_Achieved()
	 * @model default="false"
	 * @generated
	 */
	boolean isAchieved();

	/**
	 * Sets the value of the '{@link generator.AQuestionableFact#isAchieved <em>Achieved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Achieved</em>' attribute.
	 * @see #isAchieved()
	 * @generated
	 */
	void setAchieved(boolean value);

	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link generator.QuestionableFactResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see generator.GeneratorPackage#getAQuestionableFact_Results()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionableFactResult> getResults();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #setID(String)
	 * @see generator.GeneratorPackage#getAQuestionableFact_ID()
	 * @model unsettable="true" id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link generator.AQuestionableFact#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Unsets the value of the '{@link generator.AQuestionableFact#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	void unsetID();

	/**
	 * Returns whether the value of the '{@link generator.AQuestionableFact#getID <em>ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID</em>' attribute is set.
	 * @see #unsetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	boolean isSetID();

	/**
	 * Returns the value of the '<em><b>Question With Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question With Image</em>' attribute.
	 * @see #setQuestionWithImage(boolean)
	 * @see generator.GeneratorPackage#getAQuestionableFact_QuestionWithImage()
	 * @model
	 * @generated
	 */
	boolean isQuestionWithImage();

	/**
	 * Sets the value of the '{@link generator.AQuestionableFact#isQuestionWithImage <em>Question With Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question With Image</em>' attribute.
	 * @see #isQuestionWithImage()
	 * @generated
	 */
	void setQuestionWithImage(boolean value);

	/**
	 * Returns the value of the '<em><b>Facts</b></em>' reference list.
	 * The list contents are of type {@link generator.AbstractFact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facts</em>' reference list.
	 * @see generator.GeneratorPackage#getAQuestionableFact_Facts()
	 * @model
	 * @generated
	 */
	EList<AbstractFact> getFacts();

} // AQuestionableFact
