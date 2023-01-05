/**
 */
package generator;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link generator.Prerequisite#getEncountersPercent <em>Encounters Percent</em>}</li>
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
	 * @see #setSuccesPercent(double)
	 * @see generator.GeneratorPackage#getPrerequisite_SuccesPercent()
	 * @model
	 * @generated
	 */
	double getSuccesPercent();

	/**
	 * Sets the value of the '{@link generator.Prerequisite#getSuccesPercent <em>Succes Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Succes Percent</em>' attribute.
	 * @see #getSuccesPercent()
	 * @generated
	 */
	void setSuccesPercent(double value);

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
	 * Returns the value of the '<em><b>Encounters Percent</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encounters Percent</em>' attribute list.
	 * @see generator.GeneratorPackage#getPrerequisite_EncountersPercent()
	 * @model default="100.0" upper="100"
	 * @generated
	 */
	EList<Double> getEncountersPercent();

} // Prerequisite
