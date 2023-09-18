/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.TimePeriod#getStartYear <em>Start Year</em>}</li>
 *   <li>{@link generator.TimePeriod#getEndYear <em>End Year</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getTimePeriod()
 * @model
 * @generated
 */
public interface TimePeriod extends Time {
	/**
	 * Returns the value of the '<em><b>Start Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Year</em>' attribute.
	 * @see #setStartYear(String)
	 * @see generator.GeneratorPackage#getTimePeriod_StartYear()
	 * @model
	 * @generated
	 */
	String getStartYear();

	/**
	 * Sets the value of the '{@link generator.TimePeriod#getStartYear <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Year</em>' attribute.
	 * @see #getStartYear()
	 * @generated
	 */
	void setStartYear(String value);

	/**
	 * Returns the value of the '<em><b>End Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Year</em>' attribute.
	 * @see #setEndYear(String)
	 * @see generator.GeneratorPackage#getTimePeriod_EndYear()
	 * @model
	 * @generated
	 */
	String getEndYear();

	/**
	 * Sets the value of the '{@link generator.TimePeriod#getEndYear <em>End Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Year</em>' attribute.
	 * @see #getEndYear()
	 * @generated
	 */
	void setEndYear(String value);

} // TimePeriod
