/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Structure#getComponents <em>Components</em>}</li>
 *   <li>{@link generator.Structure#isPerFactOrPropositions <em>Per Fact Or Propositions</em>}</li>
 *   <li>{@link generator.Structure#isAlternateComponents <em>Alternate Components</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getStructure()
 * @model
 * @generated
 */
public interface Structure extends AComponent {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link generator.AComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see generator.GeneratorPackage#getStructure_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<AComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Per Fact Or Propositions</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Per Fact Or Propositions</em>' attribute.
	 * @see #setPerFactOrPropositions(boolean)
	 * @see generator.GeneratorPackage#getStructure_PerFactOrPropositions()
	 * @model default="false"
	 * @generated
	 */
	boolean isPerFactOrPropositions();

	/**
	 * Sets the value of the '{@link generator.Structure#isPerFactOrPropositions <em>Per Fact Or Propositions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Per Fact Or Propositions</em>' attribute.
	 * @see #isPerFactOrPropositions()
	 * @generated
	 */
	void setPerFactOrPropositions(boolean value);

	/**
	 * Returns the value of the '<em><b>Alternate Components</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternate Components</em>' attribute.
	 * @see #setAlternateComponents(boolean)
	 * @see generator.GeneratorPackage#getStructure_AlternateComponents()
	 * @model
	 * @generated
	 */
	boolean isAlternateComponents();

	/**
	 * Sets the value of the '{@link generator.Structure#isAlternateComponents <em>Alternate Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternate Components</em>' attribute.
	 * @see #isAlternateComponents()
	 * @generated
	 */
	void setAlternateComponents(boolean value);

} // Structure
