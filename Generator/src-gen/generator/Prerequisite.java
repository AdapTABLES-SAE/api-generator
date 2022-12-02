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
 *   <li>{@link generator.Prerequisite#getSuccesPercent <em>Succes Percent</em>}</li>
 *   <li>{@link generator.Prerequisite#getRequiredLevel <em>Required Level</em>}</li>
 *   <li>{@link generator.Prerequisite#getAchievementPercent <em>Achievement Percent</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getPrerequisite()
 * @model
 * @generated
 */
public interface Prerequisite extends EObject {
	/**
	 * Returns the value of the '<em><b>Succes Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succes Percent</em>' attribute.
	 * @see #setSuccesPercent(int)
	 * @see generator.GeneratorPackage#getPrerequisite_SuccesPercent()
	 * @model
	 * @generated
	 */
	int getSuccesPercent();

	/**
	 * Sets the value of the '{@link generator.Prerequisite#getSuccesPercent <em>Succes Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Succes Percent</em>' attribute.
	 * @see #getSuccesPercent()
	 * @generated
	 */
	void setSuccesPercent(int value);

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
	 * Returns the value of the '<em><b>Achievement Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Achievement Percent</em>' attribute.
	 * @see #setAchievementPercent(int)
	 * @see generator.GeneratorPackage#getPrerequisite_AchievementPercent()
	 * @model
	 * @generated
	 */
	int getAchievementPercent();

	/**
	 * Sets the value of the '{@link generator.Prerequisite#getAchievementPercent <em>Achievement Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Achievement Percent</em>' attribute.
	 * @see #getAchievementPercent()
	 * @generated
	 */
	void setAchievementPercent(int value);

} // Prerequisite
