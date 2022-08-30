/**
 */
package generator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reconstruction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.ReconstructionType#getNbFalseProposition <em>Nb False Proposition</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getReconstructionType()
 * @model
 * @generated
 */
public interface ReconstructionType extends TaskType {
	/**
	 * Returns the value of the '<em><b>Nb False Proposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb False Proposition</em>' attribute.
	 * @see #setNbFalseProposition(int)
	 * @see generator.GeneratorPackage#getReconstructionType_NbFalseProposition()
	 * @model
	 * @generated
	 */
	int getNbFalseProposition();

	/**
	 * Sets the value of the '{@link generator.ReconstructionType#getNbFalseProposition <em>Nb False Proposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb False Proposition</em>' attribute.
	 * @see #getNbFalseProposition()
	 * @generated
	 */
	void setNbFalseProposition(int value);

} // ReconstructionType
