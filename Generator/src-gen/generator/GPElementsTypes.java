/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GP Elements Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.GPElementsTypes#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGPElementsTypes()
 * @model
 * @generated
 */
public interface GPElementsTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link generator.GPElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see generator.GeneratorPackage#getGPElementsTypes_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<GPElementType> getElements();

} // GPElementsTypes
