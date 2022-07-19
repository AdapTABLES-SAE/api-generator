/**
 */
package generatorMetamodels;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Result Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.MTResultPosition#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMTResultPosition()
 * @model
 * @generated
 */
public interface MTResultPosition extends IParameter {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"RIGHT"</code>.
	 * The literals are from the enumeration {@link generatorMetamodels.ResultPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see generatorMetamodels.ResultPosition
	 * @see #setValue(ResultPosition)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMTResultPosition_Value()
	 * @model default="RIGHT"
	 * @generated
	 */
	ResultPosition getValue();

	/**
	 * Sets the value of the '{@link generatorMetamodels.MTResultPosition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see generatorMetamodels.ResultPosition
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ResultPosition value);

} // MTResultPosition
