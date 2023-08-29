/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curse Eligibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.CurseEligibility#getStartLevel <em>Start Level</em>}</li>
 *   <li>{@link generator.CurseEligibility#getCurse <em>Curse</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getCurseEligibility()
 * @model
 * @generated
 */
public interface CurseEligibility extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Level</em>' attribute.
	 * @see #setStartLevel(int)
	 * @see generator.GeneratorPackage#getCurseEligibility_StartLevel()
	 * @model
	 * @generated
	 */
	int getStartLevel();

	/**
	 * Sets the value of the '{@link generator.CurseEligibility#getStartLevel <em>Start Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Level</em>' attribute.
	 * @see #getStartLevel()
	 * @generated
	 */
	void setStartLevel(int value);

	/**
	 * Returns the value of the '<em><b>Curse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curse</em>' reference.
	 * @see #setCurse(Curse)
	 * @see generator.GeneratorPackage#getCurseEligibility_Curse()
	 * @model required="true"
	 * @generated
	 */
	Curse getCurse();

	/**
	 * Sets the value of the '{@link generator.CurseEligibility#getCurse <em>Curse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curse</em>' reference.
	 * @see #getCurse()
	 * @generated
	 */
	void setCurse(Curse value);

} // CurseEligibility
