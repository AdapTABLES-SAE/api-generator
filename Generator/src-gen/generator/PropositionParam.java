/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proposition Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.PropositionParam#getState <em>State</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getPropositionParam()
 * @model
 * @generated
 */
public interface PropositionParam extends Parameter {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(AValue)
	 * @see generator.GeneratorPackage#getPropositionParam_State()
	 * @model containment="true"
	 * @generated
	 */
	AValue getState();

	/**
	 * Sets the value of the '{@link generator.PropositionParam#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(AValue value);

} // PropositionParam
