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
 *   <li>{@link generator.Ability#getNumberOfDisplays <em>Number Of Displays</em>}</li>
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
	 * Returns the value of the '<em><b>Number Of Displays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Displays</em>' attribute.
	 * @see #setNumberOfDisplays(int)
	 * @see generator.GeneratorPackage#getAbility_NumberOfDisplays()
	 * @model
	 * @generated
	 */
	int getNumberOfDisplays();

	/**
	 * Sets the value of the '{@link generator.Ability#getNumberOfDisplays <em>Number Of Displays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Displays</em>' attribute.
	 * @see #getNumberOfDisplays()
	 * @generated
	 */
	void setNumberOfDisplays(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isElementDisplayable();

} // Ability
