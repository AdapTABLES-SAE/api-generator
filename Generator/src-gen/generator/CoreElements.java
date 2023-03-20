/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.CoreElements#getElements <em>Elements</em>}</li>
 *   <li>{@link generator.CoreElements#getStructures <em>Structures</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getCoreElements()
 * @model
 * @generated
 */
public interface CoreElements extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link generator.CoreElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see generator.GeneratorPackage#getCoreElements_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoreElement> getElements();

	/**
	 * Returns the value of the '<em><b>Structures</b></em>' containment reference list.
	 * The list contents are of type {@link generator.StructureElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' containment reference list.
	 * @see generator.GeneratorPackage#getCoreElements_Structures()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureElement> getStructures();

} // CoreElements
