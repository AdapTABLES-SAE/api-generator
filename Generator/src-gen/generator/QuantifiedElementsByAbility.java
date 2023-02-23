/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantified Elements By Ability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.QuantifiedElementsByAbility#getAbility <em>Ability</em>}</li>
 *   <li>{@link generator.QuantifiedElementsByAbility#getMin <em>Min</em>}</li>
 *   <li>{@link generator.QuantifiedElementsByAbility#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getQuantifiedElementsByAbility()
 * @model
 * @generated
 */
public interface QuantifiedElementsByAbility extends EObject {
	/**
	 * Returns the value of the '<em><b>Ability</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.Ability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ability</em>' attribute.
	 * @see generator.Ability
	 * @see #setAbility(Ability)
	 * @see generator.GeneratorPackage#getQuantifiedElementsByAbility_Ability()
	 * @model
	 * @generated
	 */
	Ability getAbility();

	/**
	 * Sets the value of the '{@link generator.QuantifiedElementsByAbility#getAbility <em>Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability</em>' attribute.
	 * @see generator.Ability
	 * @see #getAbility()
	 * @generated
	 */
	void setAbility(Ability value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see generator.GeneratorPackage#getQuantifiedElementsByAbility_Min()
	 * @model default="1"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link generator.QuantifiedElementsByAbility#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see generator.GeneratorPackage#getQuantifiedElementsByAbility_Max()
	 * @model default="1"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link generator.QuantifiedElementsByAbility#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

} // QuantifiedElementsByAbility
