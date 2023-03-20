/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Ability#getName <em>Name</em>}</li>
 *   <li>{@link generator.Ability#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getAbility()
 * @model
 * @generated
 */
public interface Ability extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generator.GeneratorPackage#getAbility_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generator.Ability#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.ElementCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see generator.ElementCategory
	 * @see #setCategory(ElementCategory)
	 * @see generator.GeneratorPackage#getAbility_Category()
	 * @model
	 * @generated
	 */
	ElementCategory getCategory();

	/**
	 * Sets the value of the '{@link generator.Ability#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see generator.ElementCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(ElementCategory value);

} // Ability
