/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MT Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.MTIdentification#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getMTIdentification()
 * @model
 * @generated
 */
public interface MTIdentification extends IdentificationTask {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link generator.ESingleTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see generator.ESingleTarget
	 * @see #setTarget(ESingleTarget)
	 * @see generator.GeneratorPackage#getMTIdentification_Target()
	 * @model default="" required="true"
	 * @generated
	 */
	ESingleTarget getTarget();

	/**
	 * Sets the value of the '{@link generator.MTIdentification#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see generator.ESingleTarget
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ESingleTarget value);

} // MTIdentification
