/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Verification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ResultVerificationType#getNbFalseProposition <em>Nb False Proposition</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getResultVerificationType()
 * @model
 * @generated
 */
public interface ResultVerificationType extends VerificationType {
	/**
	 * Returns the value of the '<em><b>Nb False Proposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb False Proposition</em>' attribute.
	 * @see #setNbFalseProposition(int)
	 * @see generator.GeneratorPackage#getResultVerificationType_NbFalseProposition()
	 * @model
	 * @generated
	 */
	int getNbFalseProposition();

	/**
	 * Sets the value of the '{@link generator.ResultVerificationType#getNbFalseProposition <em>Nb False Proposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb False Proposition</em>' attribute.
	 * @see #getNbFalseProposition()
	 * @generated
	 */
	void setNbFalseProposition(int value);

} // ResultVerificationType
