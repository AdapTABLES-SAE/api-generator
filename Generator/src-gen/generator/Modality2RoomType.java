/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modality2 Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Modality2RoomType#getResponsemodality <em>Responsemodality</em>}</li>
 *   <li>{@link generator.Modality2RoomType#getRoomtype <em>Roomtype</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getModality2RoomType()
 * @model
 * @generated
 */
public interface Modality2RoomType extends ComplianceRelations {
	/**
	 * Returns the value of the '<em><b>Responsemodality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsemodality</em>' reference.
	 * @see #setResponsemodality(ResponseModality)
	 * @see generator.GeneratorPackage#getModality2RoomType_Responsemodality()
	 * @model required="true"
	 * @generated
	 */
	ResponseModality getResponsemodality();

	/**
	 * Sets the value of the '{@link generator.Modality2RoomType#getResponsemodality <em>Responsemodality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsemodality</em>' reference.
	 * @see #getResponsemodality()
	 * @generated
	 */
	void setResponsemodality(ResponseModality value);

	/**
	 * Returns the value of the '<em><b>Roomtype</b></em>' reference list.
	 * The list contents are of type {@link generator.RoomType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomtype</em>' reference list.
	 * @see generator.GeneratorPackage#getModality2RoomType_Roomtype()
	 * @model required="true"
	 * @generated
	 */
	EList<RoomType> getRoomtype();

} // Modality2RoomType
