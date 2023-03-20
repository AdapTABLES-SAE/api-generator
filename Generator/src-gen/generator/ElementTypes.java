/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ElementTypes#getEquipments <em>Equipments</em>}</li>
 *   <li>{@link generator.ElementTypes#getGameplayElements <em>Gameplay Elements</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getElementTypes()
 * @model
 * @generated
 */
public interface ElementTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>Equipments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipments</em>' containment reference.
	 * @see #setEquipments(Equipments)
	 * @see generator.GeneratorPackage#getElementTypes_Equipments()
	 * @model containment="true"
	 * @generated
	 */
	Equipments getEquipments();

	/**
	 * Sets the value of the '{@link generator.ElementTypes#getEquipments <em>Equipments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipments</em>' containment reference.
	 * @see #getEquipments()
	 * @generated
	 */
	void setEquipments(Equipments value);

	/**
	 * Returns the value of the '<em><b>Gameplay Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameplay Elements</em>' containment reference.
	 * @see #setGameplayElements(CoreElements)
	 * @see generator.GeneratorPackage#getElementTypes_GameplayElements()
	 * @model containment="true"
	 * @generated
	 */
	CoreElements getGameplayElements();

	/**
	 * Sets the value of the '{@link generator.ElementTypes#getGameplayElements <em>Gameplay Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gameplay Elements</em>' containment reference.
	 * @see #getGameplayElements()
	 * @generated
	 */
	void setGameplayElements(CoreElements value);

} // ElementTypes
