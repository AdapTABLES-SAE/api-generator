/**
 */
package generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classroom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Classroom#getGamecontext <em>Gamecontext</em>}</li>
 *   <li>{@link generator.Classroom#getID <em>ID</em>}</li>
 *   <li>{@link generator.Classroom#getName <em>Name</em>}</li>
 *   <li>{@link generator.Classroom#getLearnerPlayers <em>Learner Players</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getClassroom()
 * @model
 * @generated
 */
public interface Classroom extends EObject {
	/**
	 * Returns the value of the '<em><b>Gamecontext</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamecontext</em>' containment reference.
	 * @see #setGamecontext(GameContext)
	 * @see generator.GeneratorPackage#getClassroom_Gamecontext()
	 * @model containment="true"
	 * @generated
	 */
	GameContext getGamecontext();

	/**
	 * Sets the value of the '{@link generator.Classroom#getGamecontext <em>Gamecontext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamecontext</em>' containment reference.
	 * @see #getGamecontext()
	 * @generated
	 */
	void setGamecontext(GameContext value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #setID(String)
	 * @see generator.GeneratorPackage#getClassroom_ID()
	 * @model unsettable="true" id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link generator.Classroom#getID <em>ID</em>}' attribute.
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
	 * Unsets the value of the '{@link generator.Classroom#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	void unsetID();

	/**
	 * Returns whether the value of the '{@link generator.Classroom#getID <em>ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID</em>' attribute is set.
	 * @see #unsetID()
	 * @see #getID()
	 * @see #setID(String)
	 * @generated
	 */
	boolean isSetID();

	/**
	 * Returns the value of the '<em><b>Learner Players</b></em>' reference list.
	 * The list contents are of type {@link generator.LearnerPlayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learner Players</em>' reference list.
	 * @see generator.GeneratorPackage#getClassroom_LearnerPlayers()
	 * @model
	 * @generated
	 */
	EList<LearnerPlayer> getLearnerPlayers();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see generator.GeneratorPackage#getClassroom_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link generator.Classroom#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Classroom
