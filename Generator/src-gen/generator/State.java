/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.State#getPlacedobjects <em>Placedobjects</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Placedobjects</b></em>' containment reference list.
	 * The list contents are of type {@link generator.PlacedObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placedobjects</em>' containment reference list.
	 * @see generator.GeneratorPackage#getState_Placedobjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlacedObject> getPlacedobjects();

} // State
