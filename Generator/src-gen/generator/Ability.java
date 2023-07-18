/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Ability#getName <em>Name</em>}</li>
 *   <li>{@link generator.Ability#getLockingEquipment <em>Locking Equipment</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getAbility()
 * @model
 * @generated
 */
public interface Ability extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generator.GeneratorPackage#getAbility_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generator.Ability#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Locking Equipment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link generator.Equipment#getLockedAbility <em>Locked Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locking Equipment</em>' reference.
	 * @see #setLockingEquipment(Equipment)
	 * @see generator.GeneratorPackage#getAbility_LockingEquipment()
	 * @see generator.Equipment#getLockedAbility
	 * @model opposite="lockedAbility"
	 * @generated
	 */
	Equipment getLockingEquipment();

	/**
	 * Sets the value of the '{@link generator.Ability#getLockingEquipment <em>Locking Equipment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locking Equipment</em>' reference.
	 * @see #getLockingEquipment()
	 * @generated
	 */
	void setLockingEquipment(Equipment value);

} // Ability
