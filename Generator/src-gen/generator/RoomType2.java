/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.RoomType2#getDescription <em>Description</em>}</li>
 *   <li>{@link generator.RoomType2#getAcceptedfloors <em>Acceptedfloors</em>}</li>
 *   <li>{@link generator.RoomType2#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getRoomType2()
 * @model
 * @generated
 */
public interface RoomType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see generator.GeneratorPackage#getRoomType2_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link generator.RoomType2#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Acceptedfloors</b></em>' reference list.
	 * The list contents are of type {@link generator.Floor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptedfloors</em>' reference list.
	 * @see generator.GeneratorPackage#getRoomType2_Acceptedfloors()
	 * @model required="true"
	 * @generated
	 */
	EList<Floor> getAcceptedfloors();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' attribute list.
	 * The list contents are of type {@link generator.RoomPaths}.
	 * The literals are from the enumeration {@link generator.RoomPaths}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' attribute list.
	 * @see generator.RoomPaths
	 * @see generator.GeneratorPackage#getRoomType2_Paths()
	 * @model upper="4"
	 * @generated
	 */
	EList<RoomPaths> getPaths();

} // RoomType2
