/**
 */
package generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Abilities#getAbilities <em>Abilities</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getAbilities()
 * @model
 * @generated
 */
public interface Abilities extends EObject {
	/**
	 * Returns the value of the '<em><b>Abilities</b></em>' containment reference list.
	 * The list contents are of type {@link generator.Ability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abilities</em>' containment reference list.
	 * @see generator.GeneratorPackage#getAbilities_Abilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ability> getAbilities();

} // Abilities
