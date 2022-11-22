/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link generator.ElementTypes#getElementtypes <em>Elementtypes</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getElementTypes()
 * @model
 * @generated
 */
public interface ElementTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>Elementtypes</b></em>' containment reference list.
	 * The list contents are of type {@link generator.ElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementtypes</em>' containment reference list.
	 * @see generator.GeneratorPackage#getElementTypes_Elementtypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementType> getElementtypes();

} // ElementTypes
