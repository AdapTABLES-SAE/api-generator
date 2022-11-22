/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction EType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.InteractionEType#getAbilities <em>Abilities</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getInteractionEType()
 * @model
 * @generated
 */
public interface InteractionEType extends ElementType {
	/**
	 * Returns the value of the '<em><b>Abilities</b></em>' reference list.
	 * The list contents are of type {@link generator.Ability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abilities</em>' reference list.
	 * @see generator.GeneratorPackage#getInteractionEType_Abilities()
	 * @model
	 * @generated
	 */
	EList<Ability> getAbilities();

} // InteractionEType
