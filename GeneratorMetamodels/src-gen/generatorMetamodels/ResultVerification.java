/**
 */
package generatorMetamodels;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Verification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.ResultVerification#isCheckIsRight <em>Check Is Right</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getResultVerification()
 * @model
 * @generated
 */
public interface ResultVerification extends SubObjective {
	/**
	 * Returns the value of the '<em><b>Check Is Right</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Is Right</em>' attribute.
	 * @see #setCheckIsRight(boolean)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getResultVerification_CheckIsRight()
	 * @model default="true"
	 * @generated
	 */
	boolean isCheckIsRight();

	/**
	 * Sets the value of the '{@link generatorMetamodels.ResultVerification#isCheckIsRight <em>Check Is Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Is Right</em>' attribute.
	 * @see #isCheckIsRight()
	 * @generated
	 */
	void setCheckIsRight(boolean value);

} // ResultVerification
