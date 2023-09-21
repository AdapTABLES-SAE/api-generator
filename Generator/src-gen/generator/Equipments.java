/**
 */
package generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Equipments#getEquipments <em>Equipments</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getEquipments()
 * @model
 * @generated
 */
public interface Equipments extends EObject {
	/**
	 * Returns the value of the '<em><b>Equipments</b></em>' containment reference list.
	 * The list contents are of type {@link generator.Equipment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipments</em>' containment reference list.
	 * @see generator.GeneratorPackage#getEquipments_Equipments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Equipment> getEquipments();

} // Equipments
