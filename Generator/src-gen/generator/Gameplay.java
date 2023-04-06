/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gameplay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Gameplay#getName <em>Name</em>}</li>
 *   <li>{@link generator.Gameplay#getCategory <em>Category</em>}</li>
 *   <li>{@link generator.Gameplay#getComponents <em>Components</em>}</li>
 *   <li>{@link generator.Gameplay#isHasIntegratedPropositions <em>Has Integrated Propositions</em>}</li>
 *   <li>{@link generator.Gameplay#isManualValidation <em>Manual Validation</em>}</li>
 *   <li>{@link generator.Gameplay#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link generator.Gameplay#getRestrictedTo <em>Restricted To</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGameplay()
 * @model
 * @generated
 */
public interface Gameplay extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generator.GeneratorPackage#getGameplay_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generator.Gameplay#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.GPCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see generator.GPCategory
	 * @see #setCategory(GPCategory)
	 * @see generator.GeneratorPackage#getGameplay_Category()
	 * @model
	 * @generated
	 */
	GPCategory getCategory();

	/**
	 * Sets the value of the '{@link generator.Gameplay#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see generator.GPCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(GPCategory value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link generator.AComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see generator.GeneratorPackage#getGameplay_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<AComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Has Integrated Propositions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Integrated Propositions</em>' attribute.
	 * @see #setHasIntegratedPropositions(boolean)
	 * @see generator.GeneratorPackage#getGameplay_HasIntegratedPropositions()
	 * @model
	 * @generated
	 */
	boolean isHasIntegratedPropositions();

	/**
	 * Sets the value of the '{@link generator.Gameplay#isHasIntegratedPropositions <em>Has Integrated Propositions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Integrated Propositions</em>' attribute.
	 * @see #isHasIntegratedPropositions()
	 * @generated
	 */
	void setHasIntegratedPropositions(boolean value);

	/**
	 * Returns the value of the '<em><b>Manual Validation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Validation</em>' attribute.
	 * @see #setManualValidation(boolean)
	 * @see generator.GeneratorPackage#getGameplay_ManualValidation()
	 * @model default="false"
	 * @generated
	 */
	boolean isManualValidation();

	/**
	 * Sets the value of the '{@link generator.Gameplay#isManualValidation <em>Manual Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Validation</em>' attribute.
	 * @see #isManualValidation()
	 * @generated
	 */
	void setManualValidation(boolean value);

	/**
	 * Returns the value of the '<em><b>Prompt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prompt</em>' containment reference.
	 * @see #setPrompt(Prompt)
	 * @see generator.GeneratorPackage#getGameplay_Prompt()
	 * @model containment="true"
	 * @generated
	 */
	Prompt getPrompt();

	/**
	 * Sets the value of the '{@link generator.Gameplay#getPrompt <em>Prompt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt</em>' containment reference.
	 * @see #getPrompt()
	 * @generated
	 */
	void setPrompt(Prompt value);

	/**
	 * Returns the value of the '<em><b>Restricted To</b></em>' attribute list.
	 * The list contents are of type {@link generator.ETaskType}.
	 * The literals are from the enumeration {@link generator.ETaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restricted To</em>' attribute list.
	 * @see generator.ETaskType
	 * @see generator.GeneratorPackage#getGameplay_RestrictedTo()
	 * @model
	 * @generated
	 */
	EList<ETaskType> getRestrictedTo();

} // Gameplay
