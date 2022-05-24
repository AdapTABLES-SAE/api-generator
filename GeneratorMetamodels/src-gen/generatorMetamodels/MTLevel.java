/**
 */
package generatorMetamodels;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.MTLevel#getBuildTableSetup <em>Build Table Setup</em>}</li>
 *   <li>{@link generatorMetamodels.MTLevel#getResultPositionSetup <em>Result Position Setup</em>}</li>
 *   <li>{@link generatorMetamodels.MTLevel#getMinInterval <em>Min Interval</em>}</li>
 *   <li>{@link generatorMetamodels.MTLevel#getMaxInterval <em>Max Interval</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMTLevel()
 * @model
 * @generated
 */
public interface MTLevel extends Level {
	/**
	 * Returns the value of the '<em><b>Build Table Setup</b></em>' attribute.
	 * The literals are from the enumeration {@link generatorMetamodels.TableBuild}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Table Setup</em>' attribute.
	 * @see generatorMetamodels.TableBuild
	 * @see #setBuildTableSetup(TableBuild)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMTLevel_BuildTableSetup()
	 * @model
	 * @generated
	 */
	TableBuild getBuildTableSetup();

	/**
	 * Sets the value of the '{@link generatorMetamodels.MTLevel#getBuildTableSetup <em>Build Table Setup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Table Setup</em>' attribute.
	 * @see generatorMetamodels.TableBuild
	 * @see #getBuildTableSetup()
	 * @generated
	 */
	void setBuildTableSetup(TableBuild value);

	/**
	 * Returns the value of the '<em><b>Result Position Setup</b></em>' attribute.
	 * The default value is <code>"RIGHT"</code>.
	 * The literals are from the enumeration {@link generatorMetamodels.ResultPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Position Setup</em>' attribute.
	 * @see generatorMetamodels.ResultPosition
	 * @see #setResultPositionSetup(ResultPosition)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMTLevel_ResultPositionSetup()
	 * @model default="RIGHT"
	 * @generated
	 */
	ResultPosition getResultPositionSetup();

	/**
	 * Sets the value of the '{@link generatorMetamodels.MTLevel#getResultPositionSetup <em>Result Position Setup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Position Setup</em>' attribute.
	 * @see generatorMetamodels.ResultPosition
	 * @see #getResultPositionSetup()
	 * @generated
	 */
	void setResultPositionSetup(ResultPosition value);

	/**
	 * Returns the value of the '<em><b>Min Interval</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Interval</em>' attribute.
	 * @see #setMinInterval(int)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMTLevel_MinInterval()
	 * @model default="1"
	 * @generated
	 */
	int getMinInterval();

	/**
	 * Sets the value of the '{@link generatorMetamodels.MTLevel#getMinInterval <em>Min Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Interval</em>' attribute.
	 * @see #getMinInterval()
	 * @generated
	 */
	void setMinInterval(int value);

	/**
	 * Returns the value of the '<em><b>Max Interval</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Interval</em>' attribute.
	 * @see #setMaxInterval(int)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getMTLevel_MaxInterval()
	 * @model default="10"
	 * @generated
	 */
	int getMaxInterval();

	/**
	 * Sets the value of the '{@link generatorMetamodels.MTLevel#getMaxInterval <em>Max Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Interval</em>' attribute.
	 * @see #getMaxInterval()
	 * @generated
	 */
	void setMaxInterval(int value);

} // MTLevel
