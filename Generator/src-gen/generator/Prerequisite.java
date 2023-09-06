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
 *   <li>{@link generator.Prerequisite#getSuccessPercent <em>Success Percent</em>}</li>
 *   <li>{@link generator.Prerequisite#getRequiredLevel <em>Required Level</em>}</li>
 *   <li>{@link generator.Prerequisite#getEncountersPercent <em>Encounters Percent</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getPrerequisite()
 * @model
 * @generated
 */
public interface Prerequisite extends EObject {
	/**
	 * Returns the value of the '<em><b>Success Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Percent</em>' attribute.
	 * @see #setSuccessPercent(double)
	 * @see generator.GeneratorPackage#getPrerequisite_SuccessPercent()
	 * @model
	 * @generated
	 */
	double getSuccessPercent();

	/**
	 * Sets the value of the '{@link generator.Prerequisite#getSuccessPercent <em>Success Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Percent</em>' attribute.
	 * @see #getSuccessPercent()
	 * @generated
	 */
	void setSuccessPercent(double value);

	/**
	 * Returns the value of the '<em><b>Required Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Level</em>' reference.
	 * @see #setRequiredLevel(Level)
	 * @see generator.GeneratorPackage#getPrerequisite_RequiredLevel()
	 * @model required="true"
	 * @generated
	 */
	Level getRequiredLevel();

	/**
	 * Sets the value of the '{@link generator.Prerequisite#getRequiredLevel <em>Required Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Level</em>' reference.
	 * @see #getRequiredLevel()
	 * @generated
	 */
	void setRequiredLevel(Level value);

	/**
	 * Returns the value of the '<em><b>Encounters Percent</b></em>' attribute.
	 * The default value is <code>"100.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encounters Percent</em>' attribute.
	 * @see #setEncountersPercent(double)
	 * @see generator.GeneratorPackage#getPrerequisite_EncountersPercent()
	 * @model default="100.0"
	 * @generated
	 */
	double getEncountersPercent();

	/**
	 * Sets the value of the '{@link generator.Prerequisite#getEncountersPercent <em>Encounters Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounters Percent</em>' attribute.
	 * @see #getEncountersPercent()
	 * @generated
	 */
	void setEncountersPercent(double value);

} // Prerequisite
