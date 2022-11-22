/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Elements#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getElements()
 * @model
 * @generated
 */
public interface Elements extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link generator.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see generator.GeneratorPackage#getElements_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

} // Elements
