/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Equipment#getID <em>ID</em>}</li>
 *   <li>{@link generator.Equipment#isBought <em>Bought</em>}</li>
 *   <li>{@link generator.Equipment#isActivated <em>Activated</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getEquipment()
 * @model
 * @generated
 */
public interface Equipment extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see generator.GeneratorPackage#getEquipment_ID()
	 * @model unsettable="true" id="true" changeable="false"
	 * @generated
	 */
	String getID();

	/**
	 * Returns whether the value of the '{@link generator.Equipment#getID <em>ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID</em>' attribute is set.
	 * @see #getID()
	 * @generated
	 */
	boolean isSetID();

	/**
	 * Returns the value of the '<em><b>Bought</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bought</em>' attribute.
	 * @see #setBought(boolean)
	 * @see generator.GeneratorPackage#getEquipment_Bought()
	 * @model
	 * @generated
	 */
	boolean isBought();

	/**
	 * Sets the value of the '{@link generator.Equipment#isBought <em>Bought</em>}' attribute.
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
	 * @see generator.GeneratorPackage#getEquipment_Activated()
	 * @model
	 * @generated
	 */
	boolean isActivated();

	/**
	 * Sets the value of the '{@link generator.Equipment#isActivated <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activated</em>' attribute.
	 * @see #isActivated()
	 * @generated
	 */
	void setActivated(boolean value);

} // Equipment
