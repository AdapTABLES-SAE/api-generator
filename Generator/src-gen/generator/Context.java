/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Context#getGamecontext <em>Gamecontext</em>}</li>
 *   <li>{@link generator.Context#getLearnerplayers <em>Learnerplayers</em>}</li>
 *   <li>{@link generator.Context#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Gamecontext</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamecontext</em>' containment reference.
	 * @see #setGamecontext(GameContext)
	 * @see generator.GeneratorPackage#getContext_Gamecontext()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GameContext getGamecontext();

	/**
	 * Sets the value of the '{@link generator.Context#getGamecontext <em>Gamecontext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamecontext</em>' containment reference.
	 * @see #getGamecontext()
	 * @generated
	 */
	void setGamecontext(GameContext value);

	/**
	 * Returns the value of the '<em><b>Learnerplayers</b></em>' containment reference list.
	 * The list contents are of type {@link generator.LearnerPlayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learnerplayers</em>' containment reference list.
	 * @see generator.GeneratorPackage#getContext_Learnerplayers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LearnerPlayer> getLearnerplayers();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #setID(String)
	 * @see generator.GeneratorPackage#getContext_ID()
	 * @model unsettable="true" id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link generator.Context#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Unsets the value of the '{@link generator.Context#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	void unsetID();

	/**
	 * Returns whether the value of the '{@link generator.Context#getID <em>ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID</em>' attribute is set.
	 * @see #unsetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	boolean isSetID();

} // Context
