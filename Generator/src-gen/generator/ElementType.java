/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ElementType#getAbility <em>Ability</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getElementType()
 * @model
 * @generated
 */
public interface ElementType extends GPElementType {
	/**
	 * Returns the value of the '<em><b>Ability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ability</em>' reference.
	 * @see #setAbility(Ability)
	 * @see generator.GeneratorPackage#getElementType_Ability()
	 * @model
	 * @generated
	 */
	Ability getAbility();

	/**
	 * Sets the value of the '{@link generator.ElementType#getAbility <em>Ability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability</em>' reference.
	 * @see #getAbility()
	 * @generated
	 */
	void setAbility(Ability value);

} // ElementType
