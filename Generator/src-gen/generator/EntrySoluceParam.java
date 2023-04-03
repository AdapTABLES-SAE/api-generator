/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Soluce Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.EntrySoluceParam#getState <em>State</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getEntrySoluceParam()
 * @model
 * @generated
 */
public interface EntrySoluceParam extends Parameter {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.ECorrectness}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see generator.ECorrectness
	 * @see #setState(ECorrectness)
	 * @see generator.GeneratorPackage#getEntrySoluceParam_State()
	 * @model
	 * @generated
	 */
	ECorrectness getState();

	/**
	 * Sets the value of the '{@link generator.EntrySoluceParam#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see generator.ECorrectness
	 * @see #getState()
	 * @generated
	 */
	void setState(ECorrectness value);

} // EntrySoluceParam
