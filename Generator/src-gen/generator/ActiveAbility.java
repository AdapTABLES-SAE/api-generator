/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Ability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ActiveAbility#getAbility <em>Ability</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getActiveAbility()
 * @model
 * @generated
 */
public interface ActiveAbility extends Ability {
	/**
	 * Returns the value of the '<em><b>Ability</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EActiveAbility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ability</em>' attribute.
	 * @see generator.EActiveAbility
	 * @see #setAbility(EActiveAbility)
	 * @see generator.GeneratorPackage#getActiveAbility_Ability()
	 * @model
	 * @generated
	 */
	EActiveAbility getAbility();

	/**
	 * Sets the value of the '{@link generator.ActiveAbility#getAbility <em>Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability</em>' attribute.
	 * @see generator.EActiveAbility
	 * @see #getAbility()
	 * @generated
	 */
	void setAbility(EActiveAbility value);

} // ActiveAbility
