/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Items#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getItems()
 * @model
 * @generated
 */
public interface Items extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link generator.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see generator.GeneratorPackage#getItems_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

} // Items
