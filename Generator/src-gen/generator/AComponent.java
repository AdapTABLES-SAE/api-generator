/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AComponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.AComponent#getAllowedAbility <em>Allowed Ability</em>}</li>
 *   <li>{@link generator.AComponent#getExpectedSize <em>Expected Size</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getAComponent()
 * @model abstract="true"
 * @generated
 */
public interface AComponent extends EObject {

	/**
	 * Returns the value of the '<em><b>Allowed Ability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Ability</em>' reference.
	 * @see #setAllowedAbility(Ability)
	 * @see generator.GeneratorPackage#getAComponent_AllowedAbility()
	 * @model
	 * @generated
	 */
	Ability getAllowedAbility();

	/**
	 * Sets the value of the '{@link generator.AComponent#getAllowedAbility <em>Allowed Ability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Ability</em>' reference.
	 * @see #getAllowedAbility()
	 * @generated
	 */
	void setAllowedAbility(Ability value);

	/**
	 * Returns the value of the '<em><b>Expected Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Size</em>' containment reference.
	 * @see #setExpectedSize(Size)
	 * @see generator.GeneratorPackage#getAComponent_ExpectedSize()
	 * @model containment="true"
	 * @generated
	 */
	Size getExpectedSize();

	/**
	 * Sets the value of the '{@link generator.AComponent#getExpectedSize <em>Expected Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Size</em>' containment reference.
	 * @see #getExpectedSize()
	 * @generated
	 */
	void setExpectedSize(Size value);
} // AComponent
