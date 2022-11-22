/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MTLevel#getBuildSetup <em>Build Setup</em>}</li>
 *   <li>{@link generator.MTLevel#getResultPositionSetup <em>Result Position Setup</em>}</li>
 *   <li>{@link generator.MTLevel#getMinInterval <em>Min Interval</em>}</li>
 *   <li>{@link generator.MTLevel#getMaxInterval <em>Max Interval</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMTLevel()
 * @model
 * @generated
 */
public interface MTLevel extends Level {
	/**
	 * Returns the value of the '<em><b>Build Setup</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.TableBuild}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Setup</em>' attribute.
	 * @see generator.TableBuild
	 * @see #setBuildSetup(TableBuild)
	 * @see generator.GeneratorPackage#getMTLevel_BuildSetup()
	 * @model
	 * @generated
	 */
	TableBuild getBuildSetup();

	/**
	 * Sets the value of the '{@link generator.MTLevel#getBuildSetup <em>Build Setup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Setup</em>' attribute.
	 * @see generator.TableBuild
	 * @see #getBuildSetup()
	 * @generated
	 */
	void setBuildSetup(TableBuild value);

	/**
	 * Returns the value of the '<em><b>Result Position Setup</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.ResultPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Position Setup</em>' attribute.
	 * @see generator.ResultPosition
	 * @see #setResultPositionSetup(ResultPosition)
	 * @see generator.GeneratorPackage#getMTLevel_ResultPositionSetup()
	 * @model
	 * @generated
	 */
	ResultPosition getResultPositionSetup();

	/**
	 * Sets the value of the '{@link generator.MTLevel#getResultPositionSetup <em>Result Position Setup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Position Setup</em>' attribute.
	 * @see generator.ResultPosition
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
	 * @see generator.GeneratorPackage#getMTLevel_MinInterval()
	 * @model default="1"
	 * @generated
	 */
	int getMinInterval();

	/**
	 * Sets the value of the '{@link generator.MTLevel#getMinInterval <em>Min Interval</em>}' attribute.
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
	 * @see generator.GeneratorPackage#getMTLevel_MaxInterval()
	 * @model default="10"
	 * @generated
	 */
	int getMaxInterval();

	/**
	 * Sets the value of the '{@link generator.MTLevel#getMaxInterval <em>Max Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Interval</em>' attribute.
	 * @see #getMaxInterval()
	 * @generated
	 */
	void setMaxInterval(int value);

} // MTLevel
