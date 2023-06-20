/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elements Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ElementsTypes#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getElementsTypes()
 * @model
 * @generated
 */
public interface ElementsTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link generator.ElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see generator.GeneratorPackage#getElementsTypes_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementType> getElements();

} // ElementsTypes
