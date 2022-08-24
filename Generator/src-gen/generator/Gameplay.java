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
 *   <li>{@link generator.Gameplay#getCoregamerules <em>Coregamerules</em>}</li>
 *   <li>{@link generator.Gameplay#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see generator.GeneratorPackage#getGameplay()
 * @model
 * @generated
 */
public interface Gameplay extends EObject {
	/**
	 * Returns the value of the '<em><b>Coregamerules</b></em>' containment reference list.
	 * The list contents are of type {@link generator.CoreGameRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coregamerules</em>' containment reference list.
	 * @see generator.GeneratorPackage#getGameplay_Coregamerules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CoreGameRule> getCoregamerules();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see generator.GeneratorPackage#getGameplay_Description()
	 * @model
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

} // Gameplay
