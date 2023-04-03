/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Element Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.GameElementTypes#getEquipments <em>Equipments</em>}</li>
 *   <li>{@link generator.GameElementTypes#getGpElements <em>Gp Elements</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGameElementTypes()
 * @model
 * @generated
 */
public interface GameElementTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>Equipments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipments</em>' containment reference.
	 * @see #setEquipments(Equipments)
	 * @see generator.GeneratorPackage#getGameElementTypes_Equipments()
	 * @model containment="true"
	 * @generated
	 */
	Equipments getEquipments();

	/**
	 * Sets the value of the '{@link generator.GameElementTypes#getEquipments <em>Equipments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipments</em>' containment reference.
	 * @see #getEquipments()
	 * @generated
	 */
	void setEquipments(Equipments value);

	/**
	 * Returns the value of the '<em><b>Gp Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gp Elements</em>' containment reference.
	 * @see #setGpElements(GPElementsTypes)
	 * @see generator.GeneratorPackage#getGameElementTypes_GpElements()
	 * @model containment="true"
	 * @generated
	 */
	GPElementsTypes getGpElements();

	/**
	 * Sets the value of the '{@link generator.GameElementTypes#getGpElements <em>Gp Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gp Elements</em>' containment reference.
	 * @see #getGpElements()
	 * @generated
	 */
	void setGpElements(GPElementsTypes value);

} // GameElementTypes
