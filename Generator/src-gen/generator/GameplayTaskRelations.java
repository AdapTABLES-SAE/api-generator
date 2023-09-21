/**
 */
package generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gameplay Task Relations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.GameplayTaskRelations#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGameplayTaskRelations()
 * @model
 * @generated
 */
public interface GameplayTaskRelations extends EObject {
	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link generator.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see generator.GeneratorPackage#getGameplayTaskRelations_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

} // GameplayTaskRelations
