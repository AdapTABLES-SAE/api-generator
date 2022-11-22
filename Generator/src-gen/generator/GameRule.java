/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.GameRule#getType <em>Type</em>}</li>
 *   <li>{@link generator.GameRule#getAbility2activate <em>Ability2activate</em>}</li>
 *   <li>{@link generator.GameRule#getInteractionelementtype <em>Interactionelementtype</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGameRule()
 * @model
 * @generated
 */
public interface GameRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"MOVE"</code>.
	 * The literals are from the enumeration {@link generator.GPBricks}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see generator.GPBricks
	 * @see #setType(GPBricks)
	 * @see generator.GeneratorPackage#getGameRule_Type()
	 * @model default="MOVE"
	 * @generated
	 */
	GPBricks getType();

	/**
	 * Sets the value of the '{@link generator.GameRule#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see generator.GPBricks
	 * @see #getType()
	 * @generated
	 */
	void setType(GPBricks value);

	/**
	 * Returns the value of the '<em><b>Ability2activate</b></em>' attribute.
	 * The literals are from the enumeration {@link generator.EActiveAbility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ability2activate</em>' attribute.
	 * @see generator.EActiveAbility
	 * @see #setAbility2activate(EActiveAbility)
	 * @see generator.GeneratorPackage#getGameRule_Ability2activate()
	 * @model
	 * @generated
	 */
	EActiveAbility getAbility2activate();

	/**
	 * Sets the value of the '{@link generator.GameRule#getAbility2activate <em>Ability2activate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability2activate</em>' attribute.
	 * @see generator.EActiveAbility
	 * @see #getAbility2activate()
	 * @generated
	 */
	void setAbility2activate(EActiveAbility value);

	/**
	 * Returns the value of the '<em><b>Interactionelementtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactionelementtype</em>' reference.
	 * @see #setInteractionelementtype(InteractionEType)
	 * @see generator.GeneratorPackage#getGameRule_Interactionelementtype()
	 * @model
	 * @generated
	 */
	InteractionEType getInteractionelementtype();

	/**
	 * Sets the value of the '{@link generator.GameRule#getInteractionelementtype <em>Interactionelementtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interactionelementtype</em>' reference.
	 * @see #getInteractionelementtype()
	 * @generated
	 */
	void setInteractionelementtype(InteractionEType value);

} // GameRule
