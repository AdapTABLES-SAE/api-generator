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
 *   <li>{@link generator.Gameplay#isOptionalValidator <em>Optional Validator</em>}</li>
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
	 * Returns the value of the '<em><b>Optional Validator</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Validator</em>' attribute.
	 * @see #setOptionalValidator(boolean)
	 * @see generator.GeneratorPackage#getGameplay_OptionalValidator()
	 * @model default="false"
	 * @generated
	 */
	boolean isOptionalValidator();

	/**
	 * Sets the value of the '{@link generator.Gameplay#isOptionalValidator <em>Optional Validator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Validator</em>' attribute.
	 * @see #isOptionalValidator()
	 * @generated
	 */
	void setOptionalValidator(boolean value);

} // Gameplay
