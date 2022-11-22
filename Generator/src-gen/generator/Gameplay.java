/**
 */
package generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gameplay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.Gameplay#getDescription <em>Description</em>}</li>
 *   <li>{@link generator.Gameplay#getGamerules <em>Gamerules</em>}</li>
 *   <li>{@link generator.Gameplay#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGameplay()
 * @model
 * @generated
 */
public interface Gameplay extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see generator.GeneratorPackage#getGameplay_Description()
	 * @model id="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link generator.Gameplay#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Gamerules</b></em>' containment reference list.
	 * The list contents are of type {@link generator.GameRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamerules</em>' containment reference list.
	 * @see generator.GeneratorPackage#getGameplay_Gamerules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GameRule> getGamerules();

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(AvatarEquipment)
	 * @see generator.GeneratorPackage#getGameplay_Requirement()
	 * @model
	 * @generated
	 */
	AvatarEquipment getRequirement();

	/**
	 * Sets the value of the '{@link generator.Gameplay#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(AvatarEquipment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isAvailable();

} // Gameplay
