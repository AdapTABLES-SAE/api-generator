/**
 */
package generatorMetamodels;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Learner Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generatorMetamodels.LearnerPlayer#getLearningprofile <em>Learningprofile</em>}</li>
 *   <li>{@link generatorMetamodels.LearnerPlayer#getGameprofile <em>Gameprofile</em>}</li>
 *   <li>{@link generatorMetamodels.LearnerPlayer#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link generatorMetamodels.LearnerPlayer#getLastname <em>Lastname</em>}</li>
 * </ul>
 *
 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearnerPlayer()
 * @model
 * @generated
 */
public interface LearnerPlayer extends EObject {
	/**
	 * Returns the value of the '<em><b>Learningprofile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learningprofile</em>' containment reference.
	 * @see #setLearningprofile(LearningProfile)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearnerPlayer_Learningprofile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LearningProfile getLearningprofile();

	/**
	 * Sets the value of the '{@link generatorMetamodels.LearnerPlayer#getLearningprofile <em>Learningprofile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learningprofile</em>' containment reference.
	 * @see #getLearningprofile()
	 * @generated
	 */
	void setLearningprofile(LearningProfile value);

	/**
	 * Returns the value of the '<em><b>Gameprofile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameprofile</em>' containment reference.
	 * @see #setGameprofile(GameProfile)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearnerPlayer_Gameprofile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GameProfile getGameprofile();

	/**
	 * Sets the value of the '{@link generatorMetamodels.LearnerPlayer#getGameprofile <em>Gameprofile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gameprofile</em>' containment reference.
	 * @see #getGameprofile()
	 * @generated
	 */
	void setGameprofile(GameProfile value);

	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearnerPlayer_Firstname()
	 * @model
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link generatorMetamodels.LearnerPlayer#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastname</em>' attribute.
	 * @see #setLastname(String)
	 * @see generatorMetamodels.GeneratorMetamodelsPackage#getLearnerPlayer_Lastname()
	 * @model
	 * @generated
	 */
	String getLastname();

	/**
	 * Sets the value of the '{@link generatorMetamodels.LearnerPlayer#getLastname <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastname</em>' attribute.
	 * @see #getLastname()
	 * @generated
	 */
	void setLastname(String value);

} // LearnerPlayer
