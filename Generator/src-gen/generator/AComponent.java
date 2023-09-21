/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AComponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.AComponent#getAllowedAbility <em>Allowed Ability</em>}</li>
 *   <li>{@link generator.AComponent#getExpectedSize <em>Expected Size</em>}</li>
 *   <li>{@link generator.AComponent#isForProposition <em>For Proposition</em>}</li>
 *   <li>{@link generator.AComponent#isForStatement <em>For Statement</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getAComponent()
 * @model abstract="true"
 * @generated
 */
public interface AComponent extends EObject {

	/**
	 * Returns the value of the '<em><b>Allowed Ability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Ability</em>' reference.
	 * @see #setAllowedAbility(Ability)
	 * @see generator.GeneratorPackage#getAComponent_AllowedAbility()
	 * @model
	 * @generated
	 */
	Ability getAllowedAbility();

	/**
	 * Sets the value of the '{@link generator.AComponent#getAllowedAbility <em>Allowed Ability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Ability</em>' reference.
	 * @see #getAllowedAbility()
	 * @generated
	 */
	void setAllowedAbility(Ability value);

	/**
	 * Returns the value of the '<em><b>Expected Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Size</em>' containment reference.
	 * @see #setExpectedSize(Size)
	 * @see generator.GeneratorPackage#getAComponent_ExpectedSize()
	 * @model containment="true"
	 * @generated
	 */
	Size getExpectedSize();

	/**
	 * Sets the value of the '{@link generator.AComponent#getExpectedSize <em>Expected Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Size</em>' containment reference.
	 * @see #getExpectedSize()
	 * @generated
	 */
	void setExpectedSize(Size value);

	/**
	 * Returns the value of the '<em><b>For Proposition</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Proposition</em>' attribute.
	 * @see #setForProposition(boolean)
	 * @see generator.GeneratorPackage#getAComponent_ForProposition()
	 * @model default="false"
	 * @generated
	 */
	boolean isForProposition();

	/**
	 * Sets the value of the '{@link generator.AComponent#isForProposition <em>For Proposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Proposition</em>' attribute.
	 * @see #isForProposition()
	 * @generated
	 */
	void setForProposition(boolean value);

	/**
	 * Returns the value of the '<em><b>For Statement</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Statement</em>' attribute.
	 * @see #setForStatement(boolean)
	 * @see generator.GeneratorPackage#getAComponent_ForStatement()
	 * @model default="false"
	 * @generated
	 */
	boolean isForStatement();

	/**
	 * Sets the value of the '{@link generator.AComponent#isForStatement <em>For Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Statement</em>' attribute.
	 * @see #isForStatement()
	 * @generated
	 */
	void setForStatement(boolean value);
} // AComponent
