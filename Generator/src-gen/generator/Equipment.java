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
 *   <li>{@link generator.Equipment#getLockedAbility <em>Locked Ability</em>}</li>
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
	 * @see #setID(String)
	 * @see generator.GeneratorPackage#getEquipment_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link generator.Equipment#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Locked Ability</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link generator.Ability#getLockingEquipment <em>Locking Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked Ability</em>' reference.
	 * @see #setLockedAbility(Ability)
	 * @see generator.GeneratorPackage#getEquipment_LockedAbility()
	 * @see generator.Ability#getLockingEquipment
	 * @model opposite="lockingEquipment"
	 * @generated
	 */
	Ability getLockedAbility();

	/**
	 * Sets the value of the '{@link generator.Equipment#getLockedAbility <em>Locked Ability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked Ability</em>' reference.
	 * @see #getLockedAbility()
	 * @generated
	 */
	void setLockedAbility(Ability value);

} // Equipment
