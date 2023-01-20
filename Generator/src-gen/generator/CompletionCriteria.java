/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Completion Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.CompletionCriteria#getSuccesPercent <em>Succes Percent</em>}</li>
 *   <li>{@link generator.CompletionCriteria#getEncountersPercent <em>Encounters Percent</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getCompletionCriteria()
 * @model
 * @generated
 */
public interface CompletionCriteria extends EObject {
	/**
	 * Returns the value of the '<em><b>Succes Percent</b></em>' attribute.
	 * The default value is <code>"80.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succes Percent</em>' attribute.
	 * @see #setSuccesPercent(double)
	 * @see generator.GeneratorPackage#getCompletionCriteria_SuccesPercent()
	 * @model default="80.0"
	 * @generated
	 */
	double getSuccesPercent();

	/**
	 * Sets the value of the '{@link generator.CompletionCriteria#getSuccesPercent <em>Succes Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Succes Percent</em>' attribute.
	 * @see #getSuccesPercent()
	 * @generated
	 */
	void setSuccesPercent(double value);

	/**
	 * Returns the value of the '<em><b>Encounters Percent</b></em>' attribute.
	 * The default value is <code>"100.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encounters Percent</em>' attribute.
	 * @see #setEncountersPercent(double)
	 * @see generator.GeneratorPackage#getCompletionCriteria_EncountersPercent()
	 * @model default="100.0"
	 * @generated
	 */
	double getEncountersPercent();

	/**
	 * Sets the value of the '{@link generator.CompletionCriteria#getEncountersPercent <em>Encounters Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounters Percent</em>' attribute.
	 * @see #getEncountersPercent()
	 * @generated
	 */
	void setEncountersPercent(double value);

} // CompletionCriteria
