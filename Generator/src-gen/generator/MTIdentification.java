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
	 * The literals are from the enumeration {@link generator.TargetElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see generator.TargetElement
	 * @see #setTarget(TargetElement)
	 * @see generator.GeneratorPackage#getMTIdentification_Target()
	 * @model required="true"
	 * @generated
	 */
	TargetElement getTarget();

	/**
	 * Sets the value of the '{@link generator.MTIdentification#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see generator.TargetElement
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetElement value);

} // MTIdentification
