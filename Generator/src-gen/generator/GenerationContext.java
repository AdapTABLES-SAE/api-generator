/**
 */
package generator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.GenerationContext#getGamecontext <em>Gamecontext</em>}</li>
 *   <li>{@link generator.GenerationContext#getLearnerplayer <em>Learnerplayer</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGenerationContext()
 * @model
 * @generated
 */
public interface GenerationContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Gamecontext</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamecontext</em>' containment reference.
	 * @see #setGamecontext(GameContext)
	 * @see generator.GeneratorPackage#getGenerationContext_Gamecontext()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GameContext getGamecontext();

	/**
	 * Sets the value of the '{@link generator.GenerationContext#getGamecontext <em>Gamecontext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamecontext</em>' containment reference.
	 * @see #getGamecontext()
	 * @generated
	 */
	void setGamecontext(GameContext value);

	/**
	 * Returns the value of the '<em><b>Learnerplayer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learnerplayer</em>' containment reference.
	 * @see #setLearnerplayer(LearnerPlayer)
	 * @see generator.GeneratorPackage#getGenerationContext_Learnerplayer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LearnerPlayer getLearnerplayer();

	/**
	 * Sets the value of the '{@link generator.GenerationContext#getLearnerplayer <em>Learnerplayer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learnerplayer</em>' containment reference.
	 * @see #getLearnerplayer()
	 * @generated
	 */
	void setLearnerplayer(LearnerPlayer value);

} // GenerationContext
