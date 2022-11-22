/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buyable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.BuyableElement#isBought <em>Bought</em>}</li>
 *   <li>{@link generator.BuyableElement#isActivated <em>Activated</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getBuyableElement()
 * @model abstract="true"
 * @generated
 */
public interface BuyableElement extends Element {
	/**
	 * Returns the value of the '<em><b>Bought</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bought</em>' attribute.
	 * @see #setBought(boolean)
	 * @see generator.GeneratorPackage#getBuyableElement_Bought()
	 * @model
	 * @generated
	 */
	boolean isBought();

	/**
	 * Sets the value of the '{@link generator.BuyableElement#isBought <em>Bought</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bought</em>' attribute.
	 * @see #isBought()
	 * @generated
	 */
	void setBought(boolean value);

	/**
	 * Returns the value of the '<em><b>Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activated</em>' attribute.
	 * @see #setActivated(boolean)
	 * @see generator.GeneratorPackage#getBuyableElement_Activated()
	 * @model
	 * @generated
	 */
	boolean isActivated();

	/**
	 * Sets the value of the '{@link generator.BuyableElement#isActivated <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activated</em>' attribute.
	 * @see #isActivated()
	 * @generated
	 */
	void setActivated(boolean value);

} // BuyableElement
