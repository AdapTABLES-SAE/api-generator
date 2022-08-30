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
 *   <li>{@link generator.Prerequisite#getSuccesPercentage <em>Succes Percentage</em>}</li>
 *   <li>{@link generator.Prerequisite#getRequiredLevel <em>Required Level</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getPrerequisite()
 * @model
 * @generated
 */
public interface Prerequisite extends EObject {
	/**
	 * Returns the value of the '<em><b>Succes Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succes Percentage</em>' attribute.
	 * @see #setSuccesPercentage(int)
	 * @see generator.GeneratorPackage#getPrerequisite_SuccesPercentage()
	 * @model
	 * @generated
	 */
	int getSuccesPercentage();

	/**
	 * Sets the value of the '{@link generator.Prerequisite#getSuccesPercentage <em>Succes Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Succes Percentage</em>' attribute.
	 * @see #getSuccesPercentage()
	 * @generated
	 */
	void setSuccesPercentage(int value);

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

} // Prerequisite
