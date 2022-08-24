/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.GameDescription#getRoomtypes <em>Roomtypes</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGameDescription()
 * @model
 * @generated
 */
public interface GameDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Roomtypes</b></em>' containment reference list.
	 * The list contents are of type {@link generator.RoomType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomtypes</em>' containment reference list.
	 * @see generator.GeneratorPackage#getGameDescription_Roomtypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RoomType> getRoomtypes();

} // GameDescription
