/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.GameElements#getEquipments <em>Equipments</em>}</li>
 *   <li>{@link generator.GameElements#getGameplayElements <em>Gameplay Elements</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGameElements()
 * @model
 * @generated
 */
public interface GameElements extends EObject {
	/**
	 * Returns the value of the '<em><b>Equipments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipments</em>' containment reference.
	 * @see #setEquipments(Equipments)
	 * @see generator.GeneratorPackage#getGameElements_Equipments()
	 * @model containment="true"
	 * @generated
	 */
	Equipments getEquipments();

	/**
	 * Sets the value of the '{@link generator.GameElements#getEquipments <em>Equipments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipments</em>' containment reference.
	 * @see #getEquipments()
	 * @generated
	 */
	void setEquipments(Equipments value);

	/**
	 * Returns the value of the '<em><b>Gameplay Elements</b></em>' containment reference list.
	 * The list contents are of type {@link generator.CoreGPElements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameplay Elements</em>' containment reference list.
	 * @see generator.GeneratorPackage#getGameElements_GameplayElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoreGPElements> getGameplayElements();

} // GameElements
