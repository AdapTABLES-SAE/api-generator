/**
 */
package generatorMetamodels;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter2 Room Incompliance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.Parameter2RoomIncompliance#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link generatorMetamodels.Parameter2RoomIncompliance#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getParameter2RoomIncompliance()
 * @model
 * @generated
 */
public interface Parameter2RoomIncompliance extends SemanticRelation {
	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' attribute.
	 * The default value is <code>"DOOR"</code>.
	 * The literals are from the enumeration {@link generatorMetamodels.RoomType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' attribute.
	 * @see generatorMetamodels.RoomType
	 * @see #setRoomType(RoomType)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getParameter2RoomIncompliance_RoomType()
	 * @model default="DOOR"
	 * @generated
	 */
	RoomType getRoomType();

	/**
	 * Sets the value of the '{@link generatorMetamodels.Parameter2RoomIncompliance#getRoomType <em>Room Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' attribute.
	 * @see generatorMetamodels.RoomType
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(RoomType value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(IParameter)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getParameter2RoomIncompliance_Parameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IParameter getParameter();

	/**
	 * Sets the value of the '{@link generatorMetamodels.Parameter2RoomIncompliance#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(IParameter value);

} // Parameter2RoomIncompliance
