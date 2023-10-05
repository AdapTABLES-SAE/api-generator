/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AQuestionnable Fact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.AQuestionnableFact#isWasSelected <em>Was Selected</em>}</li>
 *   <li>{@link generator.AQuestionnableFact#isAchieved <em>Achieved</em>}</li>
 *   <li>{@link generator.AQuestionnableFact#getResults <em>Results</em>}</li>
 *   <li>{@link generator.AQuestionnableFact#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getAQuestionnableFact()
 * @model abstract="true"
 * @generated
 */
public interface AQuestionnableFact extends EObject {
	/**
	 * Returns the value of the '<em><b>Was Selected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Was Selected</em>' attribute.
	 * @see #setWasSelected(boolean)
	 * @see generator.GeneratorPackage#getAQuestionnableFact_WasSelected()
	 * @model default="false"
	 * @generated
	 */
	boolean isWasSelected();

	/**
	 * Sets the value of the '{@link generator.AQuestionnableFact#isWasSelected <em>Was Selected</em>}' attribute.
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
	 * @see generator.GeneratorPackage#getAQuestionnableFact_Achieved()
	 * @model default="false"
	 * @generated
	 */
	boolean isAchieved();

	/**
	 * Sets the value of the '{@link generator.AQuestionnableFact#isAchieved <em>Achieved</em>}' attribute.
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
	 * @see generator.GeneratorPackage#getAQuestionnableFact_Results()
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
	 * @see generator.GeneratorPackage#getAQuestionnableFact_ID()
	 * @model unsettable="true" id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link generator.AQuestionnableFact#getID <em>ID</em>}' attribute.
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
	 * Unsets the value of the '{@link generator.AQuestionnableFact#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	void unsetID();

	/**
	 * Returns whether the value of the '{@link generator.AQuestionnableFact#getID <em>ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID</em>' attribute is set.
	 * @see #unsetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	boolean isSetID();

} // AQuestionnableFact
