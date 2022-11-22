/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ElementPosition#getAutorizedETypes <em>Autorized ETypes</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getElementPosition()
 * @model
 * @generated
 */
public interface ElementPosition extends Position {
	/**
	 * Returns the value of the '<em><b>Autorized ETypes</b></em>' reference list.
	 * The list contents are of type {@link generator.InteractionEType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autorized ETypes</em>' reference list.
	 * @see generator.GeneratorPackage#getElementPosition_AutorizedETypes()
	 * @model
	 * @generated
	 */
	EList<InteractionEType> getAutorizedETypes();

} // ElementPosition
