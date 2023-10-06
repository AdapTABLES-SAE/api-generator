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
 *   <li>{@link generator.Structure#isAlternateComponents <em>Alternate Components</em>}</li>
 *   <li>{@link generator.Structure#isForFact <em>For Fact</em>}</li>
 *   <li>{@link generator.Structure#isForMap <em>For Map</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>For Fact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Fact</em>' attribute.
	 * @see #setForFact(boolean)
	 * @see generator.GeneratorPackage#getStructure_ForFact()
	 * @model
	 * @generated
	 */
	boolean isForFact();

	/**
	 * Sets the value of the '{@link generator.Structure#isForFact <em>For Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Fact</em>' attribute.
	 * @see #isForFact()
	 * @generated
	 */
	void setForFact(boolean value);

	/**
	 * Returns the value of the '<em><b>For Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Map</em>' attribute.
	 * @see #setForMap(boolean)
	 * @see generator.GeneratorPackage#getStructure_ForMap()
	 * @model
	 * @generated
	 */
	boolean isForMap();

	/**
	 * Sets the value of the '{@link generator.Structure#isForMap <em>For Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Map</em>' attribute.
	 * @see #isForMap()
	 * @generated
	 */
	void setForMap(boolean value);

} // Structure
