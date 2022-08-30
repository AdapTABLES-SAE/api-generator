/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.VerificationType#isVerifyTrue <em>Verify True</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getVerificationType()
 * @model abstract="true"
 * @generated
 */
public interface VerificationType extends TaskType {
	/**
	 * Returns the value of the '<em><b>Verify True</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify True</em>' attribute.
	 * @see #setVerifyTrue(boolean)
	 * @see generator.GeneratorPackage#getVerificationType_VerifyTrue()
	 * @model default="true"
	 * @generated
	 */
	boolean isVerifyTrue();

	/**
	 * Sets the value of the '{@link generator.VerificationType#isVerifyTrue <em>Verify True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verify True</em>' attribute.
	 * @see #isVerifyTrue()
	 * @generated
	 */
	void setVerifyTrue(boolean value);

} // VerificationType
