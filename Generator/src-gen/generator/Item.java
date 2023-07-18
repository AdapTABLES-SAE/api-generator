/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Item#isBought <em>Bought</em>}</li>
 *   <li>{@link generator.Item#isActivated <em>Activated</em>}</li>
 *   <li>{@link generator.Item#getEquipment <em>Equipment</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Bought</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bought</em>' attribute.
	 * @see #setBought(boolean)
	 * @see generator.GeneratorPackage#getItem_Bought()
	 * @model default="true"
	 * @generated
	 */
	boolean isBought();

	/**
	 * Sets the value of the '{@link generator.Item#isBought <em>Bought</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bought</em>' attribute.
	 * @see #isBought()
	 * @generated
	 */
	void setBought(boolean value);

	/**
	 * Returns the value of the '<em><b>Activated</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activated</em>' attribute.
	 * @see #setActivated(boolean)
	 * @see generator.GeneratorPackage#getItem_Activated()
	 * @model default="true"
	 * @generated
	 */
	boolean isActivated();

	/**
	 * Sets the value of the '{@link generator.Item#isActivated <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activated</em>' attribute.
	 * @see #isActivated()
	 * @generated
	 */
	void setActivated(boolean value);

	/**
	 * Returns the value of the '<em><b>Equipment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment</em>' reference.
	 * @see #setEquipment(Equipment)
	 * @see generator.GeneratorPackage#getItem_Equipment()
	 * @model
	 * @generated
	 */
	Equipment getEquipment();

	/**
	 * Sets the value of the '{@link generator.Item#getEquipment <em>Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipment</em>' reference.
	 * @see #getEquipment()
	 * @generated
	 */
	void setEquipment(Equipment value);

} // Item
