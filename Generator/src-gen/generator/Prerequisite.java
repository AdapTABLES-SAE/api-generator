/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Prerequisite#getSuccessPercentage <em>Success Percentage</em>}</li>
 *   <li>{@link generator.Prerequisite#getPrerequisite <em>Prerequisite</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getPrerequisite()
 * @model
 * @generated
 */
public interface Prerequisite extends EObject {
	/**
	 * Returns the value of the '<em><b>Success Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Percentage</em>' attribute.
	 * @see #setSuccessPercentage(int)
	 * @see generator.GeneratorPackage#getPrerequisite_SuccessPercentage()
	 * @model
	 * @generated
	 */
	int getSuccessPercentage();

	/**
	 * Sets the value of the '{@link generator.Prerequisite#getSuccessPercentage <em>Success Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Percentage</em>' attribute.
	 * @see #getSuccessPercentage()
	 * @generated
	 */
	void setSuccessPercentage(int value);

	/**
	 * Returns the value of the '<em><b>Prerequisite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prerequisite</em>' reference.
	 * @see #setPrerequisite(Level)
	 * @see generator.GeneratorPackage#getPrerequisite_Prerequisite()
	 * @model required="true"
	 * @generated
	 */
	Level getPrerequisite();

	/**
	 * Sets the value of the '{@link generator.Prerequisite#getPrerequisite <em>Prerequisite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prerequisite</em>' reference.
	 * @see #getPrerequisite()
	 * @generated
	 */
	void setPrerequisite(Level value);

} // Prerequisite
