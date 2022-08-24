/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Large Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.LargeRoomType#getDirections <em>Directions</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getLargeRoomType()
 * @model
 * @generated
 */
public interface LargeRoomType extends RoomType {
	/**
	 * Returns the value of the '<em><b>Directions</b></em>' attribute list.
	 * The list contents are of type {@link generator.Directions}.
	 * The literals are from the enumeration {@link generator.Directions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directions</em>' attribute list.
	 * @see generator.Directions
	 * @see generator.GeneratorPackage#getLargeRoomType_Directions()
	 * @model required="true" upper="8"
	 * @generated
	 */
	EList<Directions> getDirections();

} // LargeRoomType
