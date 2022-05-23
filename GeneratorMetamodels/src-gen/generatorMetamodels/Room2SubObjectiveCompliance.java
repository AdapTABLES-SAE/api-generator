/**
 */
package generatorMetamodels;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room2 Sub Objective Compliance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.Room2SubObjectiveCompliance#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link generatorMetamodels.Room2SubObjectiveCompliance#getSubObjType <em>Sub Obj Type</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getRoom2SubObjectiveCompliance()
 * @model
 * @generated
 */
public interface Room2SubObjectiveCompliance extends SemanticRelation {
	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' attribute.
	 * The default value is <code>"DOOR"</code>.
	 * The literals are from the enumeration {@link generatorMetamodels.RoomType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' attribute.
	 * @see generatorMetamodels.RoomType
	 * @see #setRoomType(RoomType)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getRoom2SubObjectiveCompliance_RoomType()
	 * @model default="DOOR"
	 * @generated
	 */
	RoomType getRoomType();

	/**
	 * Sets the value of the '{@link generatorMetamodels.Room2SubObjectiveCompliance#getRoomType <em>Room Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' attribute.
	 * @see generatorMetamodels.RoomType
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(RoomType value);

	/**
	 * Returns the value of the '<em><b>Sub Obj Type</b></em>' attribute.
	 * The literals are from the enumeration {@link generatorMetamodels.SubObjectiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Obj Type</em>' attribute.
	 * @see generatorMetamodels.SubObjectiveType
	 * @see #setSubObjType(SubObjectiveType)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getRoom2SubObjectiveCompliance_SubObjType()
	 * @model
	 * @generated
	 */
	SubObjectiveType getSubObjType();

	/**
	 * Sets the value of the '{@link generatorMetamodels.Room2SubObjectiveCompliance#getSubObjType <em>Sub Obj Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Obj Type</em>' attribute.
	 * @see generatorMetamodels.SubObjectiveType
	 * @see #getSubObjType()
	 * @generated
	 */
	void setSubObjType(SubObjectiveType value);

} // Room2SubObjectiveCompliance
