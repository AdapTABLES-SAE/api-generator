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
 *   <li>{@link generator.Gameplay#getQuantifiedElementsByAbility <em>Quantified Elements By Ability</em>}</li>
 *   <li>{@link generator.Gameplay#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGameplay()
 * @model
 * @generated
 */
public interface Gameplay extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantified Elements By Ability</b></em>' containment reference list.
	 * The list contents are of type {@link generator.QuantifiedElementsByAbility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantified Elements By Ability</em>' containment reference list.
	 * @see generator.GeneratorPackage#getGameplay_QuantifiedElementsByAbility()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuantifiedElementsByAbility> getQuantifiedElementsByAbility();

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

} // Gameplay
