/**
 */
package generatorMetamodels;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Level Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.MTLevelParam#getMaxInterval <em>Max Interval</em>}</li>
 *   <li>{@link generatorMetamodels.MTLevelParam#getMinInterval <em>Min Interval</em>}</li>
 *   <li>{@link generatorMetamodels.MTLevelParam#getBuildTableSetup <em>Build Table Setup</em>}</li>
 *   <li>{@link generatorMetamodels.MTLevelParam#getResultPositionSetup <em>Result Position Setup</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMTLevelParam()
 * @model
 * @generated
 */
public interface MTLevelParam extends Level {
	/**
	 * Returns the value of the '<em><b>Max Interval</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Interval</em>' attribute.
	 * @see #setMaxInterval(int)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMTLevelParam_MaxInterval()
	 * @model default="10"
	 * @generated
	 */
	int getMaxInterval();

	/**
	 * Sets the value of the '{@link generatorMetamodels.MTLevelParam#getMaxInterval <em>Max Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Interval</em>' attribute.
	 * @see #getMaxInterval()
	 * @generated
	 */
	void setMaxInterval(int value);

	/**
	 * Returns the value of the '<em><b>Min Interval</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Interval</em>' attribute.
	 * @see #setMinInterval(int)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMTLevelParam_MinInterval()
	 * @model default="1"
	 * @generated
	 */
	int getMinInterval();

	/**
	 * Sets the value of the '{@link generatorMetamodels.MTLevelParam#getMinInterval <em>Min Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Interval</em>' attribute.
	 * @see #getMinInterval()
	 * @generated
	 */
	void setMinInterval(int value);

	/**
	 * Returns the value of the '<em><b>Build Table Setup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Table Setup</em>' containment reference.
	 * @see #setBuildTableSetup(MTTableBuilding)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMTLevelParam_BuildTableSetup()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MTTableBuilding getBuildTableSetup();

	/**
	 * Sets the value of the '{@link generatorMetamodels.MTLevelParam#getBuildTableSetup <em>Build Table Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Table Setup</em>' containment reference.
	 * @see #getBuildTableSetup()
	 * @generated
	 */
	void setBuildTableSetup(MTTableBuilding value);

	/**
	 * Returns the value of the '<em><b>Result Position Setup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Position Setup</em>' containment reference.
	 * @see #setResultPositionSetup(MTResultPosition)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMTLevelParam_ResultPositionSetup()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MTResultPosition getResultPositionSetup();

	/**
	 * Sets the value of the '{@link generatorMetamodels.MTLevelParam#getResultPositionSetup <em>Result Position Setup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Position Setup</em>' containment reference.
	 * @see #getResultPositionSetup()
	 * @generated
	 */
	void setResultPositionSetup(MTResultPosition value);

} // MTLevelParam
