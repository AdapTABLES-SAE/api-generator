/**
 */
package generatorMetamodels;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Question Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.SimpleQuestionRoom#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getSimpleQuestionRoom()
 * @model
 * @generated
 */
public interface SimpleQuestionRoom extends QuestionRoom {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"SIMPLE_QUESTION"</code>.
	 * The literals are from the enumeration {@link generatorMetamodels.RoomType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generatorMetamodels.RoomType
	 * @see #isSetType()
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getSimpleQuestionRoom_Type()
	 * @model default="SIMPLE_QUESTION" unsettable="true" changeable="false" volatile="true"
	 * @generated
	 */
	RoomType getType();

	/**
	 * Returns whether the value of the '{@link generatorMetamodels.SimpleQuestionRoom#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #getType()
	 * @generated
	 */
	boolean isSetType();

} // SimpleQuestionRoom
