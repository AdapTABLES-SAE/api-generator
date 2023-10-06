/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link generator.Equipment#getLockedAbilities <em>Locked Abilities</em>}</li>
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
	 * Returns the value of the '<em><b>Locked Abilities</b></em>' reference list.
	 * The list contents are of type {@link generator.Ability}.
	 * It is bidirectional and its opposite is '{@link generator.Ability#getLockingEquipment <em>Locking Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked Abilities</em>' reference list.
	 * @see generator.GeneratorPackage#getEquipment_LockedAbilities()
	 * @see generator.Ability#getLockingEquipment
	 * @model opposite="lockingEquipment"
	 * @generated
	 */
	EList<Ability> getLockedAbilities();

} // Equipment
