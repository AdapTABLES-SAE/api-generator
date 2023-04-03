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
 *   <li>{@link generator.Structure#getStructureType <em>Structure Type</em>}</li>
 *   <li>{@link generator.Structure#isIsPerFact <em>Is Per Fact</em>}</li>
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
	 * Returns the value of the '<em><b>Structure Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Type</em>' reference.
	 * @see #setStructureType(StructureType)
	 * @see generator.GeneratorPackage#getStructure_StructureType()
	 * @model
	 * @generated
	 */
	StructureType getStructureType();

	/**
	 * Sets the value of the '{@link generator.Structure#getStructureType <em>Structure Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Type</em>' reference.
	 * @see #getStructureType()
	 * @generated
	 */
	void setStructureType(StructureType value);

	/**
	 * Returns the value of the '<em><b>Is Per Fact</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Per Fact</em>' attribute.
	 * @see #setIsPerFact(boolean)
	 * @see generator.GeneratorPackage#getStructure_IsPerFact()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsPerFact();

	/**
	 * Sets the value of the '{@link generator.Structure#isIsPerFact <em>Is Per Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Per Fact</em>' attribute.
	 * @see #isIsPerFact()
	 * @generated
	 */
	void setIsPerFact(boolean value);

} // Structure
