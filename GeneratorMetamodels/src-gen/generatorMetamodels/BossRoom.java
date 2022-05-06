/**
 */
package generatorMetamodels;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boss Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.BossRoom#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getBossRoom()
 * @model
 * @generated
 */
public interface BossRoom extends QuestionRoom {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"BOSS"</code>.
	 * The literals are from the enumeration {@link generatorMetamodels.RoomType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generatorMetamodels.RoomType
	 * @see #isSetType()
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getBossRoom_Type()
	 * @model default="BOSS" unsettable="true" changeable="false" volatile="true"
	 * @generated
	 */
	RoomType getType();

	/**
	 * Returns whether the value of the '{@link generatorMetamodels.BossRoom#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #getType()
	 * @generated
	 */
	boolean isSetType();

} // BossRoom
