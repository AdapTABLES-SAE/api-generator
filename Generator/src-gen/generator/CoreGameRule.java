/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core Game Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.CoreGameRule#getRuleType <em>Rule Type</em>}</li>
 *   <li>{@link generator.CoreGameRule#getActionToDo <em>Action To Do</em>}</li>
 *   <li>{@link generator.CoreGameRule#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getCoreGameRule()
 * @model
 * @generated
 */
public interface CoreGameRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule Type</b></em>' attribute.
	 * The default value is <code>"MOVE"</code>.
	 * The literals are from the enumeration {@link generator.GPBricks}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Type</em>' attribute.
	 * @see generator.GPBricks
	 * @see #setRuleType(GPBricks)
	 * @see generator.GeneratorPackage#getCoreGameRule_RuleType()
	 * @model default="MOVE"
	 * @generated
	 */
	GPBricks getRuleType();

	/**
	 * Sets the value of the '{@link generator.CoreGameRule#getRuleType <em>Rule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Type</em>' attribute.
	 * @see generator.GPBricks
	 * @see #getRuleType()
	 * @generated
	 */
	void setRuleType(GPBricks value);

	/**
	 * Returns the value of the '<em><b>Action To Do</b></em>' attribute.
	 * The default value is <code>"WALK_RUN"</code>.
	 * The literals are from the enumeration {@link generator.AvatarActions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action To Do</em>' attribute.
	 * @see generator.AvatarActions
	 * @see #setActionToDo(AvatarActions)
	 * @see generator.GeneratorPackage#getCoreGameRule_ActionToDo()
	 * @model default="WALK_RUN"
	 * @generated
	 */
	AvatarActions getActionToDo();

	/**
	 * Sets the value of the '{@link generator.CoreGameRule#getActionToDo <em>Action To Do</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action To Do</em>' attribute.
	 * @see generator.AvatarActions
	 * @see #getActionToDo()
	 * @generated
	 */
	void setActionToDo(AvatarActions value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(ElementType)
	 * @see generator.GeneratorPackage#getCoreGameRule_Element()
	 * @model
	 * @generated
	 */
	ElementType getElement();

	/**
	 * Sets the value of the '{@link generator.CoreGameRule#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(ElementType value);

} // CoreGameRule
