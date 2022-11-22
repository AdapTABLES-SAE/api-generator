/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passive Ability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.PassiveAbility#getAbility <em>Ability</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getPassiveAbility()
 * @model
 * @generated
 */
public interface PassiveAbility extends Ability {
	/**
	 * Returns the value of the '<em><b>Ability</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EPassiveAbility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ability</em>' attribute.
	 * @see generator.EPassiveAbility
	 * @see #setAbility(EPassiveAbility)
	 * @see generator.GeneratorPackage#getPassiveAbility_Ability()
	 * @model
	 * @generated
	 */
	EPassiveAbility getAbility();

	/**
	 * Sets the value of the '{@link generator.PassiveAbility#getAbility <em>Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability</em>' attribute.
	 * @see generator.EPassiveAbility
	 * @see #getAbility()
	 * @generated
	 */
	void setAbility(EPassiveAbility value);

} // PassiveAbility
